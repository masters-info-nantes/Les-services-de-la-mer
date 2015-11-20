
/**
 * BankCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v14  Built on : Jul 25, 2015 (11:19:54 IST)
 */

    package fr.univnantes.alma.services.boutiqueservice.bankstub;

    /**
     *  BankCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class BankCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public BankCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public BankCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for debiterCompte method
            * override this method for handling normal response from debiterCompte operation
            */
           public void receiveResultdebiterCompte(
                    fr.univnantes.alma.services.boutiqueservice.bankstub.BankStub.DebiterCompteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from debiterCompte operation
           */
            public void receiveErrordebiterCompte(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for payer method
            * override this method for handling normal response from payer operation
            */
           public void receiveResultpayer(
                    fr.univnantes.alma.services.boutiqueservice.bankstub.BankStub.PayerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from payer operation
           */
            public void receiveErrorpayer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCarte method
            * override this method for handling normal response from getCarte operation
            */
           public void receiveResultgetCarte(
                    fr.univnantes.alma.services.boutiqueservice.bankstub.BankStub.GetCarteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCarte operation
           */
            public void receiveErrorgetCarte(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifierCarte method
            * override this method for handling normal response from verifierCarte operation
            */
           public void receiveResultverifierCarte(
                    fr.univnantes.alma.services.boutiqueservice.bankstub.BankStub.VerifierCarteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifierCarte operation
           */
            public void receiveErrorverifierCarte(java.lang.Exception e) {
            }
                


    }
    