/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Utilisateur
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Utilisateur.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Utilisateur.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor Utilisateur 
public class Utilisateur implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassUtilisateur = new AnimClass("Default.Utilisateur",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected ServeurApplication unServeurApplication;		//## link unServeurApplication 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int VoitIncident=1;
    public static final int RecoitLaRequete=2;
    public static final int EtatNormal=3;
    public static final int EnvoieLesDonnees=4;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  Utilisateur(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassUtilisateur.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation envoieDonneesUserToServer() 
    public void envoieDonneesUserToServer() {
        try {
            animInstance().notifyMethodEntered("envoieDonneesUserToServer",
               new ArgData[] {
               });
        
        //#[ operation envoieDonneesUserToServer() 
        System.out.println("L'utilisateur envoie les donnees au serveur");
        unServeurApplication.gen(new EventRecoitDonneesFromUser());
        this.gen(new EventRetourNormalUser());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation recoitRequeteFromServer() 
    public void recoitRequeteFromServer() {
        try {
            animInstance().notifyMethodEntered("recoitRequeteFromServer",
               new ArgData[] {
               });
        
        //#[ operation recoitRequeteFromServer() 
        System.out.println("L'utilisateur recoit une requete du serveur");
        this.gen(new EventEnvoieDonneesToServer());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation retourNormalUser() 
    public void retourNormalUser() {
        try {
            animInstance().notifyMethodEntered("retourNormalUser",
               new ArgData[] {
               });
        
        //#[ operation retourNormalUser() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation voitIncident() 
    public void voitIncident() {
        try {
            animInstance().notifyMethodEntered("voitIncident",
               new ArgData[] {
               });
        
        //#[ operation voitIncident() 
        System.out.println("L'utilisateur voit un incident");
        this.gen(new EventEnvoieDonneesToServer());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public ServeurApplication getUnServeurApplication() {
        return unServeurApplication;
    }
    
    //## auto_generated 
    public void __setUnServeurApplication(ServeurApplication p_ServeurApplication) {
        unServeurApplication = p_ServeurApplication;
        if(p_ServeurApplication != null)
            {
                animInstance().notifyRelationAdded("unServeurApplication", p_ServeurApplication);
            }
        else
            {
                animInstance().notifyRelationCleared("unServeurApplication");
            }
    }
    
    //## auto_generated 
    public void _setUnServeurApplication(ServeurApplication p_ServeurApplication) {
        if(unServeurApplication != null)
            {
                unServeurApplication.__setUnUtilisateur(null);
            }
        __setUnServeurApplication(p_ServeurApplication);
    }
    
    //## auto_generated 
    public void setUnServeurApplication(ServeurApplication p_ServeurApplication) {
        if(p_ServeurApplication != null)
            {
                p_ServeurApplication._setUnUtilisateur(this);
            }
        _setUnServeurApplication(p_ServeurApplication);
    }
    
    //## auto_generated 
    public void _clearUnServeurApplication() {
        animInstance().notifyRelationCleared("unServeurApplication");
        unServeurApplication = null;
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            switch (rootState_subState) {
                case EtatNormal:
                {
                    EtatNormal_add(animStates);
                }
                break;
                case VoitIncident:
                {
                    VoitIncident_add(animStates);
                }
                break;
                case RecoitLaRequete:
                {
                    RecoitLaRequete_add(animStates);
                }
                break;
                case EnvoieLesDonnees:
                {
                    EnvoieLesDonnees_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (rootState_active) {
                case EtatNormal:
                {
                    res = EtatNormal_takeEvent(id);
                }
                break;
                case VoitIncident:
                {
                    res = VoitIncident_takeEvent(id);
                }
                break;
                case RecoitLaRequete:
                {
                    res = RecoitLaRequete_takeEvent(id);
                }
                break;
                case EnvoieLesDonnees:
                {
                    res = EnvoieLesDonnees_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void VoitIncident_add(AnimStates animStates) {
            animStates.add("ROOT.VoitIncident");
        }
        
        //## statechart_method 
        public void RecoitLaRequete_add(AnimStates animStates) {
            animStates.add("ROOT.RecoitLaRequete");
        }
        
        //## statechart_method 
        public void EtatNormal_add(AnimStates animStates) {
            animStates.add("ROOT.EtatNormal");
        }
        
        //## statechart_method 
        public void EnvoieLesDonnees_add(AnimStates animStates) {
            animStates.add("ROOT.EnvoieLesDonnees");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void EnvoieLesDonnees_enter() {
            animInstance().notifyStateEntered("ROOT.EnvoieLesDonnees");
            rootState_subState = EnvoieLesDonnees;
            rootState_active = EnvoieLesDonnees;
            EnvoieLesDonneesEnter();
        }
        
        //## statechart_method 
        public int VoitIncident_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEnvoieDonneesToServer.EventEnvoieDonneesToServer_Default_id))
                {
                    res = VoitIncidentTakeEventEnvoieDonneesToServer();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int EnvoieLesDonneesTakeEventRetourNormalUser() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            EnvoieLesDonnees_exit();
            //#[ transition 3 
            retourNormalUser();
            //#]
            EtatNormal_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EtatNormal_enter() {
            animInstance().notifyStateEntered("ROOT.EtatNormal");
            rootState_subState = EtatNormal;
            rootState_active = EtatNormal;
            EtatNormalEnter();
        }
        
        //## statechart_method 
        public void EtatNormalEnter() {
        }
        
        //## statechart_method 
        public void RecoitLaRequete_enter() {
            animInstance().notifyStateEntered("ROOT.RecoitLaRequete");
            rootState_subState = RecoitLaRequete;
            rootState_active = RecoitLaRequete;
            RecoitLaRequeteEnter();
        }
        
        //## statechart_method 
        public void EtatNormal_entDef() {
            EtatNormal_enter();
        }
        
        //## statechart_method 
        public void VoitIncidentEnter() {
        }
        
        //## statechart_method 
        public void EnvoieLesDonnees_entDef() {
            EnvoieLesDonnees_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void EnvoieLesDonneesEnter() {
        }
        
        //## statechart_method 
        public void EtatNormal_exit() {
            EtatNormalExit();
            animInstance().notifyStateExited("ROOT.EtatNormal");
        }
        
        //## statechart_method 
        public int VoitIncidentTakeEventEnvoieDonneesToServer() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            VoitIncident_exit();
            //#[ transition 4 
            envoieDonneesUserToServer();
            //#]
            EnvoieLesDonnees_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void VoitIncident_exit() {
            VoitIncidentExit();
            animInstance().notifyStateExited("ROOT.VoitIncident");
        }
        
        //## statechart_method 
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void EtatNormalExit() {
        }
        
        //## statechart_method 
        public void EnvoieLesDonnees_exit() {
            EnvoieLesDonneesExit();
            animInstance().notifyStateExited("ROOT.EnvoieLesDonnees");
        }
        
        //## statechart_method 
        public int RecoitLaRequete_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEnvoieDonneesToServer.EventEnvoieDonneesToServer_Default_id))
                {
                    res = RecoitLaRequeteTakeEventEnvoieDonneesToServer();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int RecoitLaRequeteTakeEventEnvoieDonneesToServer() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            RecoitLaRequete_exit();
            //#[ transition 2 
            envoieDonneesUserToServer();
            //#]
            EnvoieLesDonnees_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void RecoitLaRequete_entDef() {
            RecoitLaRequete_enter();
        }
        
        //## statechart_method 
        public int EnvoieLesDonnees_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventRetourNormalUser.EventRetourNormalUser_Default_id))
                {
                    res = EnvoieLesDonneesTakeEventRetourNormalUser();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void RecoitLaRequeteEnter() {
        }
        
        //## statechart_method 
        public void VoitIncidentExit() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            EtatNormal_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void VoitIncident_entDef() {
            VoitIncident_enter();
        }
        
        //## statechart_method 
        public int EtatNormal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventVoitIncident.EventVoitIncident_Default_id))
                {
                    res = EtatNormalTakeEventVoitIncident();
                }
            else if(event.isTypeOf(EventRecoieRequeteFromServer.EventRecoieRequeteFromServer_Default_id))
                {
                    res = EtatNormalTakeEventRecoieRequeteFromServer();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void RecoitLaRequeteExit() {
        }
        
        //## statechart_method 
        public void EnvoieLesDonneesExit() {
        }
        
        //## statechart_method 
        public int EtatNormalTakeEventVoitIncident() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            EtatNormal_exit();
            //#[ transition 1 
            voitIncident();
            //#]
            VoitIncident_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void RecoitLaRequete_exit() {
            RecoitLaRequeteExit();
            animInstance().notifyStateExited("ROOT.RecoitLaRequete");
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int EtatNormalTakeEventRecoieRequeteFromServer() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            EtatNormal_exit();
            //#[ transition 5 
            recoitRequeteFromServer();
            //#]
            RecoitLaRequete_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void VoitIncident_enter() {
            animInstance().notifyStateEntered("ROOT.VoitIncident");
            rootState_subState = VoitIncident;
            rootState_active = VoitIncident;
            VoitIncidentEnter();
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return Utilisateur.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassUtilisateur; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("unServeurApplication", false, true, unServeurApplication);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Utilisateur.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Utilisateur.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Utilisateur.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Utilisateur.java
*********************************************************************/

