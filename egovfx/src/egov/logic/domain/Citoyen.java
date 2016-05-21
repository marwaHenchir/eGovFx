package egov.logic.domain;

import org.joda.time.LocalDateTime;

import egov.logic.enums.Civility;

/**
 * {@link Citoyen}.
 * 
 * @author monta
 *
 */
public class Citoyen {

	/**
	 * id.
	 */
	private Long id;

	/**
	 * firstName.
	 */
	private String firstName;

	/**
	 * lastName.
	 */
	private String lastName;

	/**
	 * birthdate.
	 */
	private LocalDateTime birthdate;

	/**
	 * address1.
	 */
	private Address address1;

	/**
	 * address2.
	 */
	private Address address2;

	/**
	 * civility.
	 */
	private Civility civility;

	/**
	 * Default constructor.
	 */
	public Citoyen() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the birthdate
	 */
	public LocalDateTime getBirthdate() {
		return birthdate;
	}

	/**
	 * @return the address1
	 */
	public Address getAddress1() {
		return address1;
	}

	/**
	 * @return the address2
	 */
	public Address getAddress2() {
		return address2;
	}

	/**
	 * @return the civility
	 */
	public Civility getCivility() {
		return civility;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param birthdate
	 *            the birthdate to set
	 */
	public void setBirthdate(LocalDateTime birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * @param address1
	 *            the address1 to set
	 */
	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	/**
	 * @param address2
	 *            the address2 to set
	 */
	public void setAddress2(Address address2) {
		this.address2 = address2;
	}

	/**
	 * @param civility
	 *            the civility to set
	 */
	public void setCivility(Civility civility) {
		this.civility = civility;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString() */
	@Override
	public String toString() {
		return "Citoyen [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthdate=" + birthdate
				+ ", address1=" + address1 + ", address2=" + address2 + ", civility=" + civility + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode() */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address1 == null) ? 0 : address1.hashCode());
		result = prime * result + ((address2 == null) ? 0 : address2.hashCode());
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((civility == null) ? 0 : civility.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object) */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Citoyen other = (Citoyen) obj;
		if (address1 == null) {
			if (other.address1 != null)
				return false;
		} else if (!address1.equals(other.address1))
			return false;
		if (address2 == null) {
			if (other.address2 != null)
				return false;
		} else if (!address2.equals(other.address2))
			return false;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (civility != other.civility)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

}
