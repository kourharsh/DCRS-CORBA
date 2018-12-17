package DCRSApp;


/**
* DCRSApp/corbaInterfaceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/WEB/eclipse-workspace/CORBA/src/corbaInterface.idl
* Monday, November 5, 2018 12:44:59 PM EST
*/

abstract public class corbaInterfaceHelper
{
  private static String  _id = "IDL:DCRSApp/corbaInterface:1.0";

  public static void insert (org.omg.CORBA.Any a, DCRSApp.corbaInterface that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DCRSApp.corbaInterface extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (DCRSApp.corbaInterfaceHelper.id (), "corbaInterface");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DCRSApp.corbaInterface read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_corbaInterfaceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DCRSApp.corbaInterface value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static DCRSApp.corbaInterface narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DCRSApp.corbaInterface)
      return (DCRSApp.corbaInterface)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      DCRSApp._corbaInterfaceStub stub = new DCRSApp._corbaInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static DCRSApp.corbaInterface unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DCRSApp.corbaInterface)
      return (DCRSApp.corbaInterface)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      DCRSApp._corbaInterfaceStub stub = new DCRSApp._corbaInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
