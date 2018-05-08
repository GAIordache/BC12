package set3;

public class Persoana implements Comparable<Persoana> {
	private String mCnp;
	private String mNume;
	private int mVarsta;
	
	public Persoana(String pCnp, String pNume, int pVarsta) {
		super();
		mCnp = pCnp;
		mNume = pNume;
		mVarsta = pVarsta;
	}

	public String getCnp() {
		return mCnp;
	}

	public void setCnp(String pCnp) {
		mCnp = pCnp;
	}

	public String getNume() {
		return mNume;
	}

	public void setNume(String pNume) {
		mNume = pNume;
	}

	public int getVarsta() {
		return mVarsta;
	}

	public void setVarsta(int pVarsta) {
		mVarsta = pVarsta;
	}

	@Override
	public String toString() {
		return "Persoana [mCnp=" + mCnp + ", mNume=" + mNume + ", mVarsta=" + mVarsta + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mCnp == null) ? 0 : mCnp.hashCode());
		return result;
		//return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Persoana))
			return false;
		Persoana other = (Persoana) obj;
		if (mCnp == null) {
			if (other.mCnp != null)
				return false;
		} else if (!mCnp.equals(other.mCnp))
			return false;
		return true;
	}

	@Override
	public int compareTo(Persoana pO) {
		return this.mCnp.compareTo(pO.mCnp);
	}

	
	
}
