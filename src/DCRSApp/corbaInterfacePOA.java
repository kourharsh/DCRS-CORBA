package DCRSApp;


/**
* DCRSApp/corbaInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/WEB/eclipse-workspace/CORBA/src/corbaInterface.idl
* Monday, November 5, 2018 12:44:59 PM EST
*/

public abstract class corbaInterfacePOA extends org.omg.PortableServer.Servant
 implements DCRSApp.corbaInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("addCourse", new java.lang.Integer (0));
    _methods.put ("removeCourse", new java.lang.Integer (1));
    _methods.put ("listCourseAvailability", new java.lang.Integer (2));
    _methods.put ("enrollCourse", new java.lang.Integer (3));
    _methods.put ("getClassSchedule", new java.lang.Integer (4));
    _methods.put ("dropCourse", new java.lang.Integer (5));
    _methods.put ("swapCourse", new java.lang.Integer (6));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // DCRSApp/corbaInterface/addCourse
       {
         String courseID = in.read_string ();
         String semester = in.read_string ();
         int capacity = in.read_long ();
         String $result = null;
         $result = this.addCourse (courseID, semester, capacity);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // DCRSApp/corbaInterface/removeCourse
       {
         String courseID = in.read_string ();
         String semester = in.read_string ();
         String $result = null;
         $result = this.removeCourse (courseID, semester);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // DCRSApp/corbaInterface/listCourseAvailability
       {
         String semester = in.read_string ();
         String $result = null;
         $result = this.listCourseAvailability (semester);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // DCRSApp/corbaInterface/enrollCourse
       {
         String studentID = in.read_string ();
         String courseID = in.read_string ();
         String semester = in.read_string ();
         String $result = null;
         $result = this.enrollCourse (studentID, courseID, semester);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 4:  // DCRSApp/corbaInterface/getClassSchedule
       {
         String studentID = in.read_string ();
         String $result = null;
         $result = this.getClassSchedule (studentID);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 5:  // DCRSApp/corbaInterface/dropCourse
       {
         String studentID = in.read_string ();
         String courseID = in.read_string ();
         String $result = null;
         $result = this.dropCourse (studentID, courseID);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 6:  // DCRSApp/corbaInterface/swapCourse
       {
         String studentID = in.read_string ();
         String oldcourseID = in.read_string ();
         String newcourseID = in.read_string ();
         String $result = null;
         $result = this.swapCourse (studentID, oldcourseID, newcourseID);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:DCRSApp/corbaInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public corbaInterface _this() 
  {
    return corbaInterfaceHelper.narrow(
    super._this_object());
  }

  public corbaInterface _this(org.omg.CORBA.ORB orb) 
  {
    return corbaInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class corbaInterfacePOA
