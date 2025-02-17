// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mfamodule.proxies;

public class MFA
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mFAMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MFAmodule.MFA";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Code("Code"),
		ShowRequestCode("ShowRequestCode"),
		Token("Token"),
		Username("Username"),
		Message("Message"),
		MessageType("MessageType"),
		MFA_Session("MFAmodule.MFA_Session");

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

	public MFA(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MFAmodule.MFA"));
	}

	protected MFA(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mFAMendixObject)
	{
		if (mFAMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MFAmodule.MFA", mFAMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MFAmodule.MFA");

		this.mFAMendixObject = mFAMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MFA.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mfamodule.proxies.MFA initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mfamodule.proxies.MFA.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mfamodule.proxies.MFA initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mfamodule.proxies.MFA(context, mendixObject);
	}

	public static mfamodule.proxies.MFA load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mfamodule.proxies.MFA.initialize(context, mendixObject);
	}

	public static java.util.List<mfamodule.proxies.MFA> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mfamodule.proxies.MFA> result = new java.util.ArrayList<mfamodule.proxies.MFA>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MFAmodule.MFA" + xpathConstraint))
			result.add(mfamodule.proxies.MFA.initialize(context, obj));
		return result;
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
	 * @return value of Code
	 */
	public final java.lang.String getCode()
	{
		return getCode(getContext());
	}

	/**
	 * @param context
	 * @return value of Code
	 */
	public final java.lang.String getCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Code.toString());
	}

	/**
	 * Set value of Code
	 * @param code
	 */
	public final void setCode(java.lang.String code)
	{
		setCode(getContext(), code);
	}

	/**
	 * Set value of Code
	 * @param context
	 * @param code
	 */
	public final void setCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String code)
	{
		getMendixObject().setValue(context, MemberNames.Code.toString(), code);
	}

	/**
	 * @return value of ShowRequestCode
	 */
	public final java.lang.Boolean getShowRequestCode()
	{
		return getShowRequestCode(getContext());
	}

	/**
	 * @param context
	 * @return value of ShowRequestCode
	 */
	public final java.lang.Boolean getShowRequestCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ShowRequestCode.toString());
	}

	/**
	 * Set value of ShowRequestCode
	 * @param showrequestcode
	 */
	public final void setShowRequestCode(java.lang.Boolean showrequestcode)
	{
		setShowRequestCode(getContext(), showrequestcode);
	}

	/**
	 * Set value of ShowRequestCode
	 * @param context
	 * @param showrequestcode
	 */
	public final void setShowRequestCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showrequestcode)
	{
		getMendixObject().setValue(context, MemberNames.ShowRequestCode.toString(), showrequestcode);
	}

	/**
	 * @return value of Token
	 */
	public final java.lang.String getToken()
	{
		return getToken(getContext());
	}

	/**
	 * @param context
	 * @return value of Token
	 */
	public final java.lang.String getToken(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Token.toString());
	}

	/**
	 * Set value of Token
	 * @param token
	 */
	public final void setToken(java.lang.String token)
	{
		setToken(getContext(), token);
	}

	/**
	 * Set value of Token
	 * @param context
	 * @param token
	 */
	public final void setToken(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String token)
	{
		getMendixObject().setValue(context, MemberNames.Token.toString(), token);
	}

	/**
	 * @return value of Username
	 */
	public final java.lang.String getUsername()
	{
		return getUsername(getContext());
	}

	/**
	 * @param context
	 * @return value of Username
	 */
	public final java.lang.String getUsername(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Username.toString());
	}

	/**
	 * Set value of Username
	 * @param username
	 */
	public final void setUsername(java.lang.String username)
	{
		setUsername(getContext(), username);
	}

	/**
	 * Set value of Username
	 * @param context
	 * @param username
	 */
	public final void setUsername(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String username)
	{
		getMendixObject().setValue(context, MemberNames.Username.toString(), username);
	}

	/**
	 * @return value of Message
	 */
	public final java.lang.String getMessage()
	{
		return getMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of Message
	 */
	public final java.lang.String getMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Message.toString());
	}

	/**
	 * Set value of Message
	 * @param message
	 */
	public final void setMessage(java.lang.String message)
	{
		setMessage(getContext(), message);
	}

	/**
	 * Set value of Message
	 * @param context
	 * @param message
	 */
	public final void setMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String message)
	{
		getMendixObject().setValue(context, MemberNames.Message.toString(), message);
	}

	/**
	 * Set value of MessageType
	 * @param messagetype
	 */
	public final mfamodule.proxies.Enum_MessageType getMessageType()
	{
		return getMessageType(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageType
	 */
	public final mfamodule.proxies.Enum_MessageType getMessageType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.MessageType.toString());
		if (obj == null)
			return null;

		return mfamodule.proxies.Enum_MessageType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of MessageType
	 * @param messagetype
	 */
	public final void setMessageType(mfamodule.proxies.Enum_MessageType messagetype)
	{
		setMessageType(getContext(), messagetype);
	}

	/**
	 * Set value of MessageType
	 * @param context
	 * @param messagetype
	 */
	public final void setMessageType(com.mendix.systemwideinterfaces.core.IContext context, mfamodule.proxies.Enum_MessageType messagetype)
	{
		if (messagetype != null)
			getMendixObject().setValue(context, MemberNames.MessageType.toString(), messagetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.MessageType.toString(), null);
	}

	/**
	 * @return value of MFA_Session
	 */
	public final system.proxies.Session getMFA_Session() throws com.mendix.core.CoreException
	{
		return getMFA_Session(getContext());
	}

	/**
	 * @param context
	 * @return value of MFA_Session
	 */
	public final system.proxies.Session getMFA_Session(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.Session result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MFA_Session.toString());
		if (identifier != null)
			result = system.proxies.Session.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MFA_Session
	 * @param mfa_session
	 */
	public final void setMFA_Session(system.proxies.Session mfa_session)
	{
		setMFA_Session(getContext(), mfa_session);
	}

	/**
	 * Set value of MFA_Session
	 * @param context
	 * @param mfa_session
	 */
	public final void setMFA_Session(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.Session mfa_session)
	{
		if (mfa_session == null)
			getMendixObject().setValue(context, MemberNames.MFA_Session.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MFA_Session.toString(), mfa_session.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mFAMendixObject;
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
			final mfamodule.proxies.MFA that = (mfamodule.proxies.MFA) obj;
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
		return "MFAmodule.MFA";
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
