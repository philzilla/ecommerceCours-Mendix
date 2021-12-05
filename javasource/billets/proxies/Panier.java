// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package billets.proxies;

public class Panier
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject panierMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Billets.Panier";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		titreBillet("titreBillet"),
		Panier_Billet("Billets.Panier_Billet");

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

	public Panier(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Billets.Panier"));
	}

	protected Panier(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject panierMendixObject)
	{
		if (panierMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Billets.Panier", panierMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Billets.Panier");

		this.panierMendixObject = panierMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Panier.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static billets.proxies.Panier initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return billets.proxies.Panier.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static billets.proxies.Panier initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new billets.proxies.Panier(context, mendixObject);
	}

	public static billets.proxies.Panier load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return billets.proxies.Panier.initialize(context, mendixObject);
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
	 * @return value of titreBillet
	 */
	public final java.lang.String gettitreBillet()
	{
		return gettitreBillet(getContext());
	}

	/**
	 * @param context
	 * @return value of titreBillet
	 */
	public final java.lang.String gettitreBillet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.titreBillet.toString());
	}

	/**
	 * Set value of titreBillet
	 * @param titrebillet
	 */
	public final void settitreBillet(java.lang.String titrebillet)
	{
		settitreBillet(getContext(), titrebillet);
	}

	/**
	 * Set value of titreBillet
	 * @param context
	 * @param titrebillet
	 */
	public final void settitreBillet(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String titrebillet)
	{
		getMendixObject().setValue(context, MemberNames.titreBillet.toString(), titrebillet);
	}

	/**
	 * @return value of Panier_Billet
	 */
	public final billets.proxies.Billet getPanier_Billet() throws com.mendix.core.CoreException
	{
		return getPanier_Billet(getContext());
	}

	/**
	 * @param context
	 * @return value of Panier_Billet
	 */
	public final billets.proxies.Billet getPanier_Billet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		billets.proxies.Billet result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Panier_Billet.toString());
		if (identifier != null)
			result = billets.proxies.Billet.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Panier_Billet
	 * @param panier_billet
	 */
	public final void setPanier_Billet(billets.proxies.Billet panier_billet)
	{
		setPanier_Billet(getContext(), panier_billet);
	}

	/**
	 * Set value of Panier_Billet
	 * @param context
	 * @param panier_billet
	 */
	public final void setPanier_Billet(com.mendix.systemwideinterfaces.core.IContext context, billets.proxies.Billet panier_billet)
	{
		if (panier_billet == null)
			getMendixObject().setValue(context, MemberNames.Panier_Billet.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Panier_Billet.toString(), panier_billet.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return panierMendixObject;
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
			final billets.proxies.Panier that = (billets.proxies.Panier) obj;
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
		return "Billets.Panier";
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
