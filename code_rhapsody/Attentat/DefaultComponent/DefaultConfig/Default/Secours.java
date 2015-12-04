/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Secours
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Secours.java
*********************************************************************/

package Default;

//## dependency TimeUnit 
import java.util.concurrent.TimeUnit;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Secours.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor Secours 
public class Secours implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassSecours = new AnimClass("Default.Secours",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected centreCommandement unCentreCommandement;		//## link unCentreCommandement 
    
    protected Victime unVictime;		//## link unVictime 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Soigne=1;
    public static final int FinMission=2;
    public static final int EtatNormal=3;
    public static final int EtatAlerte=4;
    public static final int Envoye=5;
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
    public  Secours(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassSecours.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation envoye() 
    public void envoye() {
        try {
            animInstance().notifyMethodEntered("envoye",
               new ArgData[] {
               });
        
        //#[ operation envoye() 
        System.out.println("Secours envoye");  
        this.gen(new EventSoigne());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation etatAlerte() 
    public void etatAlerte() {
        try {
            animInstance().notifyMethodEntered("etatAlerte",
               new ArgData[] {
               });
        
        //#[ operation etatAlerte() 
        System.out.println("Secours en etat alerte");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation finMission() 
    public void finMission() {
        try {
            animInstance().notifyMethodEntered("finMission",
               new ArgData[] {
               });
        
        //#[ operation finMission() 
        System.out.println("fin des secours");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation soigne() 
    public void soigne() {
        try {
            animInstance().notifyMethodEntered("soigne",
               new ArgData[] {
               });
        
        //#[ operation soigne() 
        unVictime.gen(new EventVictimeSecouru());   
          try {
        		TimeUnit.SECONDS.sleep(5); 
        		unVictime.gen(new EventVictimeSurvie());
        		this.gen(new EventFinMission());
        	} catch (InterruptedException e) {
        		
        		e.printStackTrace();
        	}
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public centreCommandement getUnCentreCommandement() {
        return unCentreCommandement;
    }
    
    //## auto_generated 
    public void __setUnCentreCommandement(centreCommandement p_centreCommandement) {
        unCentreCommandement = p_centreCommandement;
        if(p_centreCommandement != null)
            {
                animInstance().notifyRelationAdded("unCentreCommandement", p_centreCommandement);
            }
        else
            {
                animInstance().notifyRelationCleared("unCentreCommandement");
            }
    }
    
    //## auto_generated 
    public void _setUnCentreCommandement(centreCommandement p_centreCommandement) {
        if(unCentreCommandement != null)
            {
                unCentreCommandement.__setUnSecours(null);
            }
        __setUnCentreCommandement(p_centreCommandement);
    }
    
    //## auto_generated 
    public void setUnCentreCommandement(centreCommandement p_centreCommandement) {
        if(p_centreCommandement != null)
            {
                p_centreCommandement._setUnSecours(this);
            }
        _setUnCentreCommandement(p_centreCommandement);
    }
    
    //## auto_generated 
    public void _clearUnCentreCommandement() {
        animInstance().notifyRelationCleared("unCentreCommandement");
        unCentreCommandement = null;
    }
    
    //## auto_generated 
    public Victime getUnVictime() {
        return unVictime;
    }
    
    //## auto_generated 
    public void __setUnVictime(Victime p_Victime) {
        unVictime = p_Victime;
        if(p_Victime != null)
            {
                animInstance().notifyRelationAdded("unVictime", p_Victime);
            }
        else
            {
                animInstance().notifyRelationCleared("unVictime");
            }
    }
    
    //## auto_generated 
    public void _setUnVictime(Victime p_Victime) {
        if(unVictime != null)
            {
                unVictime.__setUnSecours(null);
            }
        __setUnVictime(p_Victime);
    }
    
    //## auto_generated 
    public void setUnVictime(Victime p_Victime) {
        if(p_Victime != null)
            {
                p_Victime._setUnSecours(this);
            }
        _setUnVictime(p_Victime);
    }
    
    //## auto_generated 
    public void _clearUnVictime() {
        animInstance().notifyRelationCleared("unVictime");
        unVictime = null;
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
                case EtatAlerte:
                {
                    EtatAlerte_add(animStates);
                }
                break;
                case Envoye:
                {
                    Envoye_add(animStates);
                }
                break;
                case Soigne:
                {
                    Soigne_add(animStates);
                }
                break;
                case FinMission:
                {
                    FinMission_add(animStates);
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
                case EtatAlerte:
                {
                    res = EtatAlerte_takeEvent(id);
                }
                break;
                case Envoye:
                {
                    res = Envoye_takeEvent(id);
                }
                break;
                case Soigne:
                {
                    res = Soigne_takeEvent(id);
                }
                break;
                case FinMission:
                {
                    res = FinMission_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Soigne_add(AnimStates animStates) {
            animStates.add("ROOT.Soigne");
        }
        
        //## statechart_method 
        public void FinMission_add(AnimStates animStates) {
            animStates.add("ROOT.FinMission");
        }
        
        //## statechart_method 
        public void EtatNormal_add(AnimStates animStates) {
            animStates.add("ROOT.EtatNormal");
        }
        
        //## statechart_method 
        public void EtatAlerte_add(AnimStates animStates) {
            animStates.add("ROOT.EtatAlerte");
        }
        
        //## statechart_method 
        public void Envoye_add(AnimStates animStates) {
            animStates.add("ROOT.Envoye");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int EtatAlerte_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEnvoye.EventEnvoye_Default_id))
                {
                    res = EtatAlerteTakeEventEnvoye();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int EtatNormalTakeEventEtatAlerte() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            EtatNormal_exit();
            //#[ transition 1 
             etatAlerte();
            //#]
            EtatAlerte_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void FinMission_exit() {
            FinMissionExit();
            animInstance().notifyStateExited("ROOT.FinMission");
        }
        
        //## statechart_method 
        public void Soigne_exit() {
            SoigneExit();
            animInstance().notifyStateExited("ROOT.Soigne");
        }
        
        //## statechart_method 
        public void EnvoyeExit() {
        }
        
        //## statechart_method 
        public void FinMission_enter() {
            animInstance().notifyStateEntered("ROOT.FinMission");
            rootState_subState = FinMission;
            rootState_active = FinMission;
            FinMissionEnter();
        }
        
        //## statechart_method 
        public void EtatAlerte_enter() {
            animInstance().notifyStateEntered("ROOT.EtatAlerte");
            rootState_subState = EtatAlerte;
            rootState_active = EtatAlerte;
            EtatAlerteEnter();
        }
        
        //## statechart_method 
        public void EtatNormal_enter() {
            animInstance().notifyStateEntered("ROOT.EtatNormal");
            rootState_subState = EtatNormal;
            rootState_active = EtatNormal;
            EtatNormalEnter();
        }
        
        //## statechart_method 
        public void Soigne_enter() {
            animInstance().notifyStateEntered("ROOT.Soigne");
            rootState_subState = Soigne;
            rootState_active = Soigne;
            SoigneEnter();
        }
        
        //## statechart_method 
        public void EtatAlerteEnter() {
        }
        
        //## statechart_method 
        public void EtatNormalEnter() {
        }
        
        //## statechart_method 
        public int Soigne_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventFinMission.EventFinMission_Default_id))
                {
                    res = SoigneTakeEventFinMission();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void EtatNormal_entDef() {
            EtatNormal_enter();
        }
        
        //## statechart_method 
        public int FinMission_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int EtatAlerteTakeEventEnvoye() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            EtatAlerte_exit();
            //#[ transition 2 
            envoye();
            //#]
            Envoye_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EtatAlerteExit() {
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void EtatAlerte_exit() {
            EtatAlerteExit();
            animInstance().notifyStateExited("ROOT.EtatAlerte");
        }
        
        //## statechart_method 
        public void EtatAlerte_entDef() {
            EtatAlerte_enter();
        }
        
        //## statechart_method 
        public void EtatNormal_exit() {
            EtatNormalExit();
            animInstance().notifyStateExited("ROOT.EtatNormal");
        }
        
        //## statechart_method 
        public int SoigneTakeEventFinMission() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Soigne_exit();
            //#[ transition 4 
            finMission();
            //#]
            FinMission_entDef();
            animInstance().notifyTransitionEnded("4");
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
        public void Envoye_entDef() {
            Envoye_enter();
        }
        
        //## statechart_method 
        public void FinMission_entDef() {
            FinMission_enter();
        }
        
        //## statechart_method 
        public void SoigneExit() {
        }
        
        //## statechart_method 
        public void Soigne_entDef() {
            Soigne_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            EtatNormal_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void Envoye_enter() {
            animInstance().notifyStateEntered("ROOT.Envoye");
            rootState_subState = Envoye;
            rootState_active = Envoye;
            EnvoyeEnter();
        }
        
        //## statechart_method 
        public void EnvoyeEnter() {
        }
        
        //## statechart_method 
        public int EtatNormal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEtatAlerte.EventEtatAlerte_Default_id))
                {
                    res = EtatNormalTakeEventEtatAlerte();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int EnvoyeTakeEventSoigne() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Envoye_exit();
            //#[ transition 3 
            soigne();
            //#]
            Soigne_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void FinMissionExit() {
        }
        
        //## statechart_method 
        public void FinMissionEnter() {
        }
        
        //## statechart_method 
        public void SoigneEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int Envoye_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventSoigne.EventSoigne_Default_id))
                {
                    res = EnvoyeTakeEventSoigne();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Envoye_exit() {
            EnvoyeExit();
            animInstance().notifyStateExited("ROOT.Envoye");
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
            return Secours.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassSecours; 
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
        
        msg.add("unVictime", false, true, unVictime);
        msg.add("unCentreCommandement", false, true, unCentreCommandement);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Secours.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Secours.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Secours.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Secours.java
*********************************************************************/

