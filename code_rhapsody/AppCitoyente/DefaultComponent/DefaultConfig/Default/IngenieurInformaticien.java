/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: IngenieurInformaticien
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/IngenieurInformaticien.java
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
// Default/IngenieurInformaticien.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor IngenieurInformaticien 
public class IngenieurInformaticien implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassIngenieurInformaticien = new AnimClass("Default.IngenieurInformaticien",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected BaseDeDonnee unBaseDeDonnee;		//## link unBaseDeDonnee 
    
    protected ServeurApplication unServeurApplication;		//## link unServeurApplication 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int RequeteBDD=1;
    public static final int RegroupeInformations=2;
    public static final int RecolteRenseignements=3;
    public static final int FaitRequeteServeur=4;
    public static final int EtatNormal=5;
    public static final int EnAttente=6;
    public static final int AnalyseSituation=7;
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
    public  IngenieurInformaticien(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassIngenieurInformaticien.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation analyseSituation() 
    public void analyseSituation() {
        try {
            animInstance().notifyMethodEntered("analyseSituation",
               new ArgData[] {
               });
        
        //#[ operation analyseSituation() 
        System.out.println("ingenieur analyse la situation");
        this.gen(new EventRequeteBDD());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation enAttente() 
    public void enAttente() {
        try {
            animInstance().notifyMethodEntered("enAttente",
               new ArgData[] {
               });
        
        //#[ operation enAttente() 
        System.out.println("Le serveur est en attente");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation faitRequeteServeur() 
    public void faitRequeteServeur() {
        try {
            animInstance().notifyMethodEntered("faitRequeteServeur",
               new ArgData[] {
               });
        
        //#[ operation faitRequeteServeur() 
        System.out.println("Requete faite au serveur par ingenieur");
        unServeurApplication.gen (new EventRecoitRequeteFromCentre());   
        this.gen(new EventEnAttente());
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation recolteRenseignements() 
    public void recolteRenseignements() {
        try {
            animInstance().notifyMethodEntered("recolteRenseignements",
               new ArgData[] {
               });
        
        //#[ operation recolteRenseignements() 
        this.gen(new EventRegroupeInformations());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation regroupeInformations() 
    public void regroupeInformations() {
        try {
            animInstance().notifyMethodEntered("regroupeInformations",
               new ArgData[] {
               });
        
        //#[ operation regroupeInformations() 
        System.out.println("ingenieur regroupe les informations");  
        this.gen(new EventAnalyseSituation());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation requeteBDD() 
    public void requeteBDD() {
        try {
            animInstance().notifyMethodEntered("requeteBDD",
               new ArgData[] {
               });
        
        //#[ operation requeteBDD() 
        unBaseDeDonnee.gen(new EventRequeteExecute());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public BaseDeDonnee getUnBaseDeDonnee() {
        return unBaseDeDonnee;
    }
    
    //## auto_generated 
    public void __setUnBaseDeDonnee(BaseDeDonnee p_BaseDeDonnee) {
        unBaseDeDonnee = p_BaseDeDonnee;
        if(p_BaseDeDonnee != null)
            {
                animInstance().notifyRelationAdded("unBaseDeDonnee", p_BaseDeDonnee);
            }
        else
            {
                animInstance().notifyRelationCleared("unBaseDeDonnee");
            }
    }
    
    //## auto_generated 
    public void _setUnBaseDeDonnee(BaseDeDonnee p_BaseDeDonnee) {
        if(unBaseDeDonnee != null)
            {
                unBaseDeDonnee.__setUnIngenieurInformaticien(null);
            }
        __setUnBaseDeDonnee(p_BaseDeDonnee);
    }
    
    //## auto_generated 
    public void setUnBaseDeDonnee(BaseDeDonnee p_BaseDeDonnee) {
        if(p_BaseDeDonnee != null)
            {
                p_BaseDeDonnee._setUnIngenieurInformaticien(this);
            }
        _setUnBaseDeDonnee(p_BaseDeDonnee);
    }
    
    //## auto_generated 
    public void _clearUnBaseDeDonnee() {
        animInstance().notifyRelationCleared("unBaseDeDonnee");
        unBaseDeDonnee = null;
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
                unServeurApplication.__setUnIngenieurInformaticien(null);
            }
        __setUnServeurApplication(p_ServeurApplication);
    }
    
    //## auto_generated 
    public void setUnServeurApplication(ServeurApplication p_ServeurApplication) {
        if(p_ServeurApplication != null)
            {
                p_ServeurApplication._setUnIngenieurInformaticien(this);
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
                case FaitRequeteServeur:
                {
                    FaitRequeteServeur_add(animStates);
                }
                break;
                case EnAttente:
                {
                    EnAttente_add(animStates);
                }
                break;
                case RecolteRenseignements:
                {
                    RecolteRenseignements_add(animStates);
                }
                break;
                case RegroupeInformations:
                {
                    RegroupeInformations_add(animStates);
                }
                break;
                case AnalyseSituation:
                {
                    AnalyseSituation_add(animStates);
                }
                break;
                case RequeteBDD:
                {
                    RequeteBDD_add(animStates);
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
                case FaitRequeteServeur:
                {
                    res = FaitRequeteServeur_takeEvent(id);
                }
                break;
                case EnAttente:
                {
                    res = EnAttente_takeEvent(id);
                }
                break;
                case RecolteRenseignements:
                {
                    res = RecolteRenseignements_takeEvent(id);
                }
                break;
                case RegroupeInformations:
                {
                    res = RegroupeInformations_takeEvent(id);
                }
                break;
                case AnalyseSituation:
                {
                    res = AnalyseSituation_takeEvent(id);
                }
                break;
                case RequeteBDD:
                {
                    res = RequeteBDD_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void RequeteBDD_add(AnimStates animStates) {
            animStates.add("ROOT.RequeteBDD");
        }
        
        //## statechart_method 
        public void RegroupeInformations_add(AnimStates animStates) {
            animStates.add("ROOT.RegroupeInformations");
        }
        
        //## statechart_method 
        public void RecolteRenseignements_add(AnimStates animStates) {
            animStates.add("ROOT.RecolteRenseignements");
        }
        
        //## statechart_method 
        public void FaitRequeteServeur_add(AnimStates animStates) {
            animStates.add("ROOT.FaitRequeteServeur");
        }
        
        //## statechart_method 
        public void EtatNormal_add(AnimStates animStates) {
            animStates.add("ROOT.EtatNormal");
        }
        
        //## statechart_method 
        public void EnAttente_add(AnimStates animStates) {
            animStates.add("ROOT.EnAttente");
        }
        
        //## statechart_method 
        public void AnalyseSituation_add(AnimStates animStates) {
            animStates.add("ROOT.AnalyseSituation");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int EnAttente_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventRecolteRenseignements.EventRecolteRenseignements_Default_id))
                {
                    res = EnAttenteTakeEventRecolteRenseignements();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int RecolteRenseignements_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventRegroupeInformations.EventRegroupeInformations_Default_id))
                {
                    res = RecolteRenseignementsTakeEventRegroupeInformations();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void RegroupeInformationsExit() {
        }
        
        //## statechart_method 
        public void RequeteBDDExit() {
        }
        
        //## statechart_method 
        public void FaitRequeteServeurExit() {
        }
        
        //## statechart_method 
        public int RegroupeInformationsTakeEventAnalyseSituation() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            RegroupeInformations_exit();
            //#[ transition 5 
            analyseSituation();
            //#]
            AnalyseSituation_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void RequeteBDDEnter() {
        }
        
        //## statechart_method 
        public void EnAttente_enter() {
            animInstance().notifyStateEntered("ROOT.EnAttente");
            rootState_subState = EnAttente;
            rootState_active = EnAttente;
            EnAttenteEnter();
        }
        
        //## statechart_method 
        public void FaitRequeteServeurEnter() {
        }
        
        //## statechart_method 
        public int RequeteBDD_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEtatNormal.EventEtatNormal_Default_id))
                {
                    res = RequeteBDDTakeEventEtatNormal();
                }
            
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
        public void RecolteRenseignements_entDef() {
            RecolteRenseignements_enter();
        }
        
        //## statechart_method 
        public void EtatNormalEnter() {
        }
        
        //## statechart_method 
        public void RequeteBDD_exit() {
            RequeteBDDExit();
            animInstance().notifyStateExited("ROOT.RequeteBDD");
        }
        
        //## statechart_method 
        public void AnalyseSituation_entDef() {
            AnalyseSituation_enter();
        }
        
        //## statechart_method 
        public void EtatNormal_entDef() {
            EtatNormal_enter();
        }
        
        //## statechart_method 
        public void FaitRequeteServeur_exit() {
            FaitRequeteServeurExit();
            animInstance().notifyStateExited("ROOT.FaitRequeteServeur");
        }
        
        //## statechart_method 
        public void RegroupeInformationsEnter() {
        }
        
        //## statechart_method 
        public void EnAttente_entDef() {
            EnAttente_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int AnalyseSituation_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventRequeteBDD.EventRequeteBDD_Default_id))
                {
                    res = AnalyseSituationTakeEventRequeteBDD();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void EnAttenteEnter() {
        }
        
        //## statechart_method 
        public void EtatNormal_exit() {
            EtatNormalExit();
            animInstance().notifyStateExited("ROOT.EtatNormal");
        }
        
        //## statechart_method 
        public void AnalyseSituationExit() {
        }
        
        //## statechart_method 
        public int EtatNormalTakeEventFaitRequeteServeur() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            EtatNormal_exit();
            //#[ transition 1 
            faitRequeteServeur();
            //#]
            FaitRequeteServeur_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int FaitRequeteServeurTakeEventEnAttente() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            FaitRequeteServeur_exit();
            //#[ transition 2 
            enAttente();
            //#]
            EnAttente_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void RegroupeInformations_exit() {
            RegroupeInformationsExit();
            animInstance().notifyStateExited("ROOT.RegroupeInformations");
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
        public void EnAttente_exit() {
            EnAttenteExit();
            animInstance().notifyStateExited("ROOT.EnAttente");
        }
        
        //## statechart_method 
        public void RegroupeInformations_enter() {
            animInstance().notifyStateEntered("ROOT.RegroupeInformations");
            rootState_subState = RegroupeInformations;
            rootState_active = RegroupeInformations;
            RegroupeInformationsEnter();
        }
        
        //## statechart_method 
        public void AnalyseSituationEnter() {
        }
        
        //## statechart_method 
        public void RequeteBDD_enter() {
            animInstance().notifyStateEntered("ROOT.RequeteBDD");
            rootState_subState = RequeteBDD;
            rootState_active = RequeteBDD;
            RequeteBDDEnter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            EtatNormal_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int FaitRequeteServeur_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEnAttente.EventEnAttente_Default_id))
                {
                    res = FaitRequeteServeurTakeEventEnAttente();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void FaitRequeteServeur_enter() {
            animInstance().notifyStateEntered("ROOT.FaitRequeteServeur");
            rootState_subState = FaitRequeteServeur;
            rootState_active = FaitRequeteServeur;
            FaitRequeteServeurEnter();
        }
        
        //## statechart_method 
        public void RecolteRenseignementsEnter() {
        }
        
        //## statechart_method 
        public int AnalyseSituationTakeEventRequeteBDD() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            AnalyseSituation_exit();
            //#[ transition 7 
             requeteBDD();
            //#]
            RequeteBDD_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int EtatNormal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventFaitRequeteServeur.EventFaitRequeteServeur_Default_id))
                {
                    res = EtatNormalTakeEventFaitRequeteServeur();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int RegroupeInformations_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventAnalyseSituation.EventAnalyseSituation_Default_id))
                {
                    res = RegroupeInformationsTakeEventAnalyseSituation();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int RequeteBDDTakeEventEtatNormal() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            RequeteBDD_exit();
            EtatNormal_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void RequeteBDD_entDef() {
            RequeteBDD_enter();
        }
        
        //## statechart_method 
        public void AnalyseSituation_exit() {
            AnalyseSituationExit();
            animInstance().notifyStateExited("ROOT.AnalyseSituation");
        }
        
        //## statechart_method 
        public void FaitRequeteServeur_entDef() {
            FaitRequeteServeur_enter();
        }
        
        //## statechart_method 
        public void RecolteRenseignementsExit() {
        }
        
        //## statechart_method 
        public void RecolteRenseignements_enter() {
            animInstance().notifyStateEntered("ROOT.RecolteRenseignements");
            rootState_subState = RecolteRenseignements;
            rootState_active = RecolteRenseignements;
            RecolteRenseignementsEnter();
        }
        
        //## statechart_method 
        public void RegroupeInformations_entDef() {
            RegroupeInformations_enter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void AnalyseSituation_enter() {
            animInstance().notifyStateEntered("ROOT.AnalyseSituation");
            rootState_subState = AnalyseSituation;
            rootState_active = AnalyseSituation;
            AnalyseSituationEnter();
        }
        
        //## statechart_method 
        public void EnAttenteExit() {
        }
        
        //## statechart_method 
        public void RecolteRenseignements_exit() {
            RecolteRenseignementsExit();
            animInstance().notifyStateExited("ROOT.RecolteRenseignements");
        }
        
        //## statechart_method 
        public int EnAttenteTakeEventRecolteRenseignements() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            EnAttente_exit();
            //#[ transition 3 
             recolteRenseignements();
            //#]
            RecolteRenseignements_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int RecolteRenseignementsTakeEventRegroupeInformations() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            RecolteRenseignements_exit();
            //#[ transition 4 
            regroupeInformations();
            //#]
            RegroupeInformations_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
            return IngenieurInformaticien.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassIngenieurInformaticien; 
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
        msg.add("unBaseDeDonnee", false, true, unBaseDeDonnee);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(IngenieurInformaticien.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            IngenieurInformaticien.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            IngenieurInformaticien.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/IngenieurInformaticien.java
*********************************************************************/

