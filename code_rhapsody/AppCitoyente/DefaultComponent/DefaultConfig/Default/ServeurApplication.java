/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ServeurApplication
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/ServeurApplication.java
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
// Default/ServeurApplication.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class ServeurApplication 
public class ServeurApplication implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassServeurApplication = new AnimClass("Default.ServeurApplication",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected IngenieurInformaticien unIngenieurInformaticien;		//## link unIngenieurInformaticien 
    
    protected Utilisateur unUtilisateur;		//## link unUtilisateur 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int RecoitRequeteCentre=1;
    public static final int RecoitDonneesUtilisateur=2;
    public static final int EtatNormal=3;
    public static final int EnvoieRequeteUtilisateur=4;
    public static final int EnvoieDonneesAuCentre=5;
    public static final int AnalyseDonneesUtilisateur=6;
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
    public  ServeurApplication(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassServeurApplication.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation analyseDonnees() 
    public void analyseDonnees() {
        try {
            animInstance().notifyMethodEntered("analyseDonnees",
               new ArgData[] {
               });
        
        //#[ operation analyseDonnees() 
        System.out.println("analyse des donnees");
        this.gen(new EventEnvoieDonneesToCentre());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation envoieDonneesToCentre() 
    public void envoieDonneesToCentre() {
        try {
            animInstance().notifyMethodEntered("envoieDonneesToCentre",
               new ArgData[] {
               });
        
        //#[ operation envoieDonneesToCentre() 
        System.out.println("envoie des donnees vers le centre");
        unIngenieurInformaticien.gen(new EventRecolteRenseignements());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation envoieRequeteToUser() 
    public void envoieRequeteToUser() {
        try {
            animInstance().notifyMethodEntered("envoieRequeteToUser",
               new ArgData[] {
               });
        
        //#[ operation envoieRequeteToUser() 
        System.out.println("Le serveur envoie une requete a l'utilisateur");
        unUtilisateur.gen(new EventRecoieRequeteFromServer());
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation recoitDonneesFromUser() 
    public void recoitDonneesFromUser() {
        try {
            animInstance().notifyMethodEntered("recoitDonneesFromUser",
               new ArgData[] {
               });
        
        //#[ operation recoitDonneesFromUser() 
        System.out.println("Le serveur recoit les donnees envoyees par l'utilisateur");   
        this.gen(new EventAnalyseDonnees());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation recoitRequeteFromCentre() 
    public void recoitRequeteFromCentre() {
        try {
            animInstance().notifyMethodEntered("recoitRequeteFromCentre",
               new ArgData[] {
               });
        
        //#[ operation recoitRequeteFromCentre() 
        System.out.println("Le serveur recoit une requete du centre");    
        this.gen(new EventEnvoieRequeteToUser());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation retourNormalServer() 
    public void retourNormalServer() {
        try {
            animInstance().notifyMethodEntered("retourNormalServer",
               new ArgData[] {
               });
        
        //#[ operation retourNormalServer() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public IngenieurInformaticien getUnIngenieurInformaticien() {
        return unIngenieurInformaticien;
    }
    
    //## auto_generated 
    public void __setUnIngenieurInformaticien(IngenieurInformaticien p_IngenieurInformaticien) {
        unIngenieurInformaticien = p_IngenieurInformaticien;
        if(p_IngenieurInformaticien != null)
            {
                animInstance().notifyRelationAdded("unIngenieurInformaticien", p_IngenieurInformaticien);
            }
        else
            {
                animInstance().notifyRelationCleared("unIngenieurInformaticien");
            }
    }
    
    //## auto_generated 
    public void _setUnIngenieurInformaticien(IngenieurInformaticien p_IngenieurInformaticien) {
        if(unIngenieurInformaticien != null)
            {
                unIngenieurInformaticien.__setUnServeurApplication(null);
            }
        __setUnIngenieurInformaticien(p_IngenieurInformaticien);
    }
    
    //## auto_generated 
    public void setUnIngenieurInformaticien(IngenieurInformaticien p_IngenieurInformaticien) {
        if(p_IngenieurInformaticien != null)
            {
                p_IngenieurInformaticien._setUnServeurApplication(this);
            }
        _setUnIngenieurInformaticien(p_IngenieurInformaticien);
    }
    
    //## auto_generated 
    public void _clearUnIngenieurInformaticien() {
        animInstance().notifyRelationCleared("unIngenieurInformaticien");
        unIngenieurInformaticien = null;
    }
    
    //## auto_generated 
    public Utilisateur getUnUtilisateur() {
        return unUtilisateur;
    }
    
    //## auto_generated 
    public void __setUnUtilisateur(Utilisateur p_Utilisateur) {
        unUtilisateur = p_Utilisateur;
        if(p_Utilisateur != null)
            {
                animInstance().notifyRelationAdded("unUtilisateur", p_Utilisateur);
            }
        else
            {
                animInstance().notifyRelationCleared("unUtilisateur");
            }
    }
    
    //## auto_generated 
    public void _setUnUtilisateur(Utilisateur p_Utilisateur) {
        if(unUtilisateur != null)
            {
                unUtilisateur.__setUnServeurApplication(null);
            }
        __setUnUtilisateur(p_Utilisateur);
    }
    
    //## auto_generated 
    public void setUnUtilisateur(Utilisateur p_Utilisateur) {
        if(p_Utilisateur != null)
            {
                p_Utilisateur._setUnServeurApplication(this);
            }
        _setUnUtilisateur(p_Utilisateur);
    }
    
    //## auto_generated 
    public void _clearUnUtilisateur() {
        animInstance().notifyRelationCleared("unUtilisateur");
        unUtilisateur = null;
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
                case RecoitRequeteCentre:
                {
                    RecoitRequeteCentre_add(animStates);
                }
                break;
                case RecoitDonneesUtilisateur:
                {
                    RecoitDonneesUtilisateur_add(animStates);
                }
                break;
                case EnvoieRequeteUtilisateur:
                {
                    EnvoieRequeteUtilisateur_add(animStates);
                }
                break;
                case AnalyseDonneesUtilisateur:
                {
                    AnalyseDonneesUtilisateur_add(animStates);
                }
                break;
                case EnvoieDonneesAuCentre:
                {
                    EnvoieDonneesAuCentre_add(animStates);
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
                case RecoitRequeteCentre:
                {
                    res = RecoitRequeteCentre_takeEvent(id);
                }
                break;
                case RecoitDonneesUtilisateur:
                {
                    res = RecoitDonneesUtilisateur_takeEvent(id);
                }
                break;
                case EnvoieRequeteUtilisateur:
                {
                    res = EnvoieRequeteUtilisateur_takeEvent(id);
                }
                break;
                case AnalyseDonneesUtilisateur:
                {
                    res = AnalyseDonneesUtilisateur_takeEvent(id);
                }
                break;
                case EnvoieDonneesAuCentre:
                {
                    res = EnvoieDonneesAuCentre_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void RecoitRequeteCentre_add(AnimStates animStates) {
            animStates.add("ROOT.RecoitRequeteCentre");
        }
        
        //## statechart_method 
        public void RecoitDonneesUtilisateur_add(AnimStates animStates) {
            animStates.add("ROOT.RecoitDonneesUtilisateur");
        }
        
        //## statechart_method 
        public void EtatNormal_add(AnimStates animStates) {
            animStates.add("ROOT.EtatNormal");
        }
        
        //## statechart_method 
        public void EnvoieRequeteUtilisateur_add(AnimStates animStates) {
            animStates.add("ROOT.EnvoieRequeteUtilisateur");
        }
        
        //## statechart_method 
        public void EnvoieDonneesAuCentre_add(AnimStates animStates) {
            animStates.add("ROOT.EnvoieDonneesAuCentre");
        }
        
        //## statechart_method 
        public void AnalyseDonneesUtilisateur_add(AnimStates animStates) {
            animStates.add("ROOT.AnalyseDonneesUtilisateur");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int AnalyseDonneesUtilisateurTakeEventEnvoieDonneesToCentre() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            AnalyseDonneesUtilisateur_exit();
            //#[ transition 5 
            envoieDonneesToCentre();
            //#]
            EnvoieDonneesAuCentre_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnvoieRequeteUtilisateur_exit() {
            EnvoieRequeteUtilisateurExit();
            animInstance().notifyStateExited("ROOT.EnvoieRequeteUtilisateur");
        }
        
        //## statechart_method 
        public void RecoitDonneesUtilisateurExit() {
        }
        
        //## statechart_method 
        public void RecoitRequeteCentreEnter() {
        }
        
        //## statechart_method 
        public void EnvoieRequeteUtilisateur_entDef() {
            EnvoieRequeteUtilisateur_enter();
        }
        
        //## statechart_method 
        public void RecoitRequeteCentre_enter() {
            animInstance().notifyStateEntered("ROOT.RecoitRequeteCentre");
            rootState_subState = RecoitRequeteCentre;
            rootState_active = RecoitRequeteCentre;
            RecoitRequeteCentreEnter();
        }
        
        //## statechart_method 
        public int EnvoieDonneesAuCentreTakeEventRetourNormalServer() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            EnvoieDonneesAuCentre_exit();
            //#[ transition 6 
            retourNormalServer();
            //#]
            EtatNormal_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int EtatNormalTakeEventRecoitRequeteFromCentre() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            EtatNormal_exit();
            //#[ transition 1 
            recoitRequeteFromCentre();
            //#]
            RecoitRequeteCentre_entDef();
            animInstance().notifyTransitionEnded("1");
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
        public void RecoitRequeteCentre_exit() {
            RecoitRequeteCentreExit();
            animInstance().notifyStateExited("ROOT.RecoitRequeteCentre");
        }
        
        //## statechart_method 
        public int AnalyseDonneesUtilisateur_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEnvoieDonneesToCentre.EventEnvoieDonneesToCentre_Default_id))
                {
                    res = AnalyseDonneesUtilisateurTakeEventEnvoieDonneesToCentre();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void AnalyseDonneesUtilisateur_enter() {
            animInstance().notifyStateEntered("ROOT.AnalyseDonneesUtilisateur");
            rootState_subState = AnalyseDonneesUtilisateur;
            rootState_active = AnalyseDonneesUtilisateur;
            AnalyseDonneesUtilisateurEnter();
        }
        
        //## statechart_method 
        public void AnalyseDonneesUtilisateurEnter() {
        }
        
        //## statechart_method 
        public void EtatNormalEnter() {
        }
        
        //## statechart_method 
        public int RecoitDonneesUtilisateurTakeEventAnalyseDonnees() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            RecoitDonneesUtilisateur_exit();
            //#[ transition 4 
            analyseDonnees();
            //#]
            AnalyseDonneesUtilisateur_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnvoieDonneesAuCentre_enter() {
            animInstance().notifyStateEntered("ROOT.EnvoieDonneesAuCentre");
            rootState_subState = EnvoieDonneesAuCentre;
            rootState_active = EnvoieDonneesAuCentre;
            EnvoieDonneesAuCentreEnter();
        }
        
        //## statechart_method 
        public void EtatNormal_entDef() {
            EtatNormal_enter();
        }
        
        //## statechart_method 
        public int RecoitDonneesUtilisateur_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventAnalyseDonnees.EventAnalyseDonnees_Default_id))
                {
                    res = RecoitDonneesUtilisateurTakeEventAnalyseDonnees();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void AnalyseDonneesUtilisateurExit() {
        }
        
        //## statechart_method 
        public void EnvoieDonneesAuCentreExit() {
        }
        
        //## statechart_method 
        public void RecoitRequeteCentreExit() {
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void AnalyseDonneesUtilisateur_exit() {
            AnalyseDonneesUtilisateurExit();
            animInstance().notifyStateExited("ROOT.AnalyseDonneesUtilisateur");
        }
        
        //## statechart_method 
        public void EnvoieDonneesAuCentre_entDef() {
            EnvoieDonneesAuCentre_enter();
        }
        
        //## statechart_method 
        public void EtatNormal_exit() {
            EtatNormalExit();
            animInstance().notifyStateExited("ROOT.EtatNormal");
        }
        
        //## statechart_method 
        public void RecoitDonneesUtilisateur_entDef() {
            RecoitDonneesUtilisateur_enter();
        }
        
        //## statechart_method 
        public int RecoitRequeteCentre_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEnvoieRequeteToUser.EventEnvoieRequeteToUser_Default_id))
                {
                    res = RecoitRequeteCentreTakeEventEnvoieRequeteToUser();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int RecoitRequeteCentreTakeEventEnvoieRequeteToUser() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            RecoitRequeteCentre_exit();
            //#[ transition 2 
            envoieRequeteToUser();
            //#]
            EnvoieRequeteUtilisateur_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
        public void RecoitRequeteCentre_entDef() {
            RecoitRequeteCentre_enter();
        }
        
        //## statechart_method 
        public void EnvoieDonneesAuCentreEnter() {
        }
        
        //## statechart_method 
        public void EnvoieRequeteUtilisateur_enter() {
            animInstance().notifyStateEntered("ROOT.EnvoieRequeteUtilisateur");
            rootState_subState = EnvoieRequeteUtilisateur;
            rootState_active = EnvoieRequeteUtilisateur;
            EnvoieRequeteUtilisateurEnter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            EtatNormal_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void EnvoieRequeteUtilisateurExit() {
        }
        
        //## statechart_method 
        public void RecoitDonneesUtilisateur_enter() {
            animInstance().notifyStateEntered("ROOT.RecoitDonneesUtilisateur");
            rootState_subState = RecoitDonneesUtilisateur;
            rootState_active = RecoitDonneesUtilisateur;
            RecoitDonneesUtilisateurEnter();
        }
        
        //## statechart_method 
        public void RecoitDonneesUtilisateurEnter() {
        }
        
        //## statechart_method 
        public int EnvoieRequeteUtilisateur_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventRecoitDonneesFromUser.EventRecoitDonneesFromUser_Default_id))
                {
                    res = EnvoieRequeteUtilisateurTakeEventRecoitDonneesFromUser();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int EtatNormal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventRecoitRequeteFromCentre.EventRecoitRequeteFromCentre_Default_id))
                {
                    res = EtatNormalTakeEventRecoitRequeteFromCentre();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void AnalyseDonneesUtilisateur_entDef() {
            AnalyseDonneesUtilisateur_enter();
        }
        
        //## statechart_method 
        public void EnvoieDonneesAuCentre_exit() {
            EnvoieDonneesAuCentreExit();
            animInstance().notifyStateExited("ROOT.EnvoieDonneesAuCentre");
        }
        
        //## statechart_method 
        public int EnvoieRequeteUtilisateurTakeEventRecoitDonneesFromUser() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            EnvoieRequeteUtilisateur_exit();
            //#[ transition 3 
            recoitDonneesFromUser();
            //#]
            RecoitDonneesUtilisateur_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnvoieRequeteUtilisateurEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int EnvoieDonneesAuCentre_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventRetourNormalServer.EventRetourNormalServer_Default_id))
                {
                    res = EnvoieDonneesAuCentreTakeEventRetourNormalServer();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void RecoitDonneesUtilisateur_exit() {
            RecoitDonneesUtilisateurExit();
            animInstance().notifyStateExited("ROOT.RecoitDonneesUtilisateur");
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
            return ServeurApplication.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassServeurApplication; 
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
        
        msg.add("unUtilisateur", false, true, unUtilisateur);
        msg.add("unIngenieurInformaticien", false, true, unIngenieurInformaticien);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(ServeurApplication.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            ServeurApplication.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            ServeurApplication.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/ServeurApplication.java
*********************************************************************/

