package com.examples.www.wsdl.HelloService_wsdl;

public class Hello_PortTypeProxy implements com.examples.www.wsdl.HelloService_wsdl.Hello_PortType {
  private String _endpoint = null;
  private com.examples.www.wsdl.HelloService_wsdl.Hello_PortType hello_PortType = null;
  
  public Hello_PortTypeProxy() {
    _initHello_PortTypeProxy();
  }
  
  public Hello_PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initHello_PortTypeProxy();
  }
  
  private void _initHello_PortTypeProxy() {
    try {
      hello_PortType = (new com.examples.www.wsdl.HelloService_wsdl.Hello_ServiceLocator()).getHello_Port();
      if (hello_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)hello_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)hello_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (hello_PortType != null)
      ((javax.xml.rpc.Stub)hello_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.examples.www.wsdl.HelloService_wsdl.Hello_PortType getHello_PortType() {
    if (hello_PortType == null)
      _initHello_PortTypeProxy();
    return hello_PortType;
  }
  
  public java.lang.String sayHello(java.lang.String firstName) throws java.rmi.RemoteException{
    if (hello_PortType == null)
      _initHello_PortTypeProxy();
    return hello_PortType.sayHello(firstName);
  }
  
  
}