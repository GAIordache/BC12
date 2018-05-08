package sort1;

public class Person {
	public static enum Sex {
		F, M;
	}

	private String mName;
	private Sex mSex;
	private int mVarsta;
	
	

	public Person(String pName, Sex pSex, int pVarsta) {
		super();
		mName = pName;
		mSex = pSex;
		mVarsta = pVarsta;
	}

	public String getName() {
		return mName;
	}

	public void setName(String pName) {
		mName = pName;
	}

	public Sex getSex() {
		return mSex;
	}

	public void setSex(Sex pSex) {
		mSex = pSex;
	}

	public int getVarsta() {
		return mVarsta;
	}

	public void setVarsta(int pVarsta) {
		mVarsta = pVarsta;
	}

	@Override
	public String toString() {
		return "Person [mName=" + mName + ", mSex=" + mSex + ", mVarsta=" + mVarsta + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
		result = prime * result + ((mSex == null) ? 0 : mSex.hashCode());
		result = prime * result + mVarsta;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		if (mSex != other.mSex)
			return false;
		if (mVarsta != other.mVarsta)
			return false;
		return true;
	}

	
}
