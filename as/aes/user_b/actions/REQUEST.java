package generatedbyassl.as.aes.user_b.actions;

import java.io.Serializable;
import generatedbyassl.as.ASSLACTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'Request' (specified as ACTION ASSL tier).
 */
public class REQUEST
	extends ASSLACTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'REQUEST' class.
	 */
	static private REQUEST oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  REQUEST (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'REQUEST' class.
	 */
	static public REQUEST getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new REQUEST();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Provides conditions to be fulfilled before processing the action.
	 */
	public boolean GUARDS (  )
	{
		boolean bResult = true;
		bResult =  generatedbyassl.as.aes.user_b.aeself_management.self_configuring.INREQUEST_B.getInstance().isFluentInitiated()  ;
		return bResult;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Embeds statements to be performed by the action if the GURADS conditions are fulfilled.
	 */
	public void DOES (  )
	{
		super.DOES();
		generatedbyassl.as.asip.functions.SENDREQUESTMSG.getInstance().perform( "User_B" );
		generatedbyassl.as.asip.functions.RECEIVEREQUESTMSG.getInstance().perform( "User_B" );
	}

}