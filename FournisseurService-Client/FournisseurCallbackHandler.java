
/**
 * FournisseurCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v14  Built on : Jul 25, 2015 (11:19:54 IST)
 */

    package fr.univnantes.alma.services.boutiqueservice.fournisseurstub;

    /**
     *  FournisseurCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class FournisseurCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public FournisseurCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public FournisseurCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getListeProduits method
            * override this method for handling normal response from getListeProduits operation
            */
           public void receiveResultgetListeProduits(
                    fr.univnantes.alma.services.boutiqueservice.fournisseurstub.FournisseurStub.GetListeProduitsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getListeProduits operation
           */
            public void receiveErrorgetListeProduits(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getProduit method
            * override this method for handling normal response from getProduit operation
            */
           public void receiveResultgetProduit(
                    fr.univnantes.alma.services.boutiqueservice.fournisseurstub.FournisseurStub.GetProduitResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProduit operation
           */
            public void receiveErrorgetProduit(java.lang.Exception e) {
            }
                


    }
    