package generatedbyassl.as.asip.functions;

import java.io.Serializable;
import generatedbyassl.as.ASSLFUNCTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'sendRequestMsg' (specified as FUNCTION ASSL tier).
 */
public class SENDREQUESTMSG
	extends ASSLFUNCTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'SENDREQUESTMSG' class.
	 */
	static private SENDREQUESTMSG oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Action parameter.
	 */
	protected String USERNAME = null;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  SENDREQUESTMSG (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'SENDREQUESTMSG' class.
	 */
	static public SENDREQUESTMSG getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new SENDREQUESTMSG();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Embeds statements to be performed by the function.
	 */
	public void DOES (  )
	{
		super.DOES();
		if (  generatedbyassl.as.asip.functions.SENDREQUESTMSG.getInstance().USERNAME  ==  "User_A"  ) 
		{
			generatedbyassl.as.asip.channels.VIDEOCONFERENCELINK.getInstance().putMessage("generatedbyassl.as.asip.messages.MSGREQUESTA", generatedbyassl.as.asip.messages.MSGREQUESTA.getInstance());
		}
		else if (  generatedbyassl.as.asip.functions.SENDREQUESTMSG.getInstance().USERNAME  ==  "User_B"  ) 
		{
			generatedbyassl.as.asip.channels.VIDEOCONFERENCELINK.getInstance().putMessage("generatedbyassl.as.asip.messages.MSGREQUESTB", generatedbyassl.as.asip.messages.MSGREQUESTB.getInstance());
		}
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Performs the function (performs with default arguments).
	 */
	public synchronized void perform (  )
	{
		//**** Calls perform() with arguments by default.
		//**** If needed, change the arguments by default with appropriate ones.
		//****************************************************
		perform("");
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Performs the function.
	 */
	public synchronized void perform ( String USERNAME )
	{
		this.USERNAME = USERNAME;
		super.perform();
	}

}