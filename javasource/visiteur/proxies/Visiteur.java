// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package visiteur.proxies;

public class Visiteur
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject visiteurMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Visiteur.Visiteur";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Nom("Nom"),
		Email("Email"),
		MotDePasse("MotDePasse");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Visiteur(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Visiteur.Visiteur"));
	}

	protected Visiteur(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject visiteurMendixObject)
	{
		if (visiteurMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Visiteur.Visiteur", visiteurMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Visiteur.Visiteur");

		this.visiteurMendixObject = visiteurMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Visiteur.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static visiteur.proxies.Visiteur initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return visiteur.proxies.Visiteur.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static visiteur.proxies.Visiteur initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new visiteur.proxies.Visiteur(context, mendixObject);
	}

	public static visiteur.proxies.Visiteur load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return visiteur.proxies.Visiteur.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Nom
	 */
	public final java.lang.String getNom()
	{
		return getNom(getContext());
	}

	/**
	 * @param context
	 * @return value of Nom
	 */
	public final java.lang.String getNom(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Nom.toString());
	}

	/**
	 * Set value of Nom
	 * @param nom
	 */
	public final void setNom(java.lang.String nom)
	{
		setNom(getContext(), nom);
	}

	/**
	 * Set value of Nom
	 * @param context
	 * @param nom
	 */
	public final void setNom(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nom)
	{
		getMendixObject().setValue(context, MemberNames.Nom.toString(), nom);
	}

	/**
	 * @return value of Email
	 */
	public final java.lang.String getEmail()
	{
		return getEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of Email
	 */
	public final java.lang.String getEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Email.toString());
	}

	/**
	 * Set value of Email
	 * @param email
	 */
	public final void setEmail(java.lang.String email)
	{
		setEmail(getContext(), email);
	}

	/**
	 * Set value of Email
	 * @param context
	 * @param email
	 */
	public final void setEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.Email.toString(), email);
	}

	/**
	 * Set value of MotDePasse
	 * @param motdepasse
	 */
	public final void setMotDePasse(java.lang.String motdepasse)
	{
		setMotDePasse(getContext(), motdepasse);
	}

	/**
	 * Set value of MotDePasse
	 * @param context
	 * @param motdepasse
	 */
	public final void setMotDePasse(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String motdepasse)
	{
		getMendixObject().setValue(context, MemberNames.MotDePasse.toString(), motdepasse);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return visiteurMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final visiteur.proxies.Visiteur that = (visiteur.proxies.Visiteur) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Visiteur.Visiteur";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
