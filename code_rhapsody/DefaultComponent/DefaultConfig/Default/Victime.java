/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Victime
//!	Generated Date	: Thu, 3, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Victime.java
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
// Default/Victime.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor Victime 
public class Victime implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassVictime = new AnimClass("Default.Victime",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected CamionPompier unCamionPompier;		//## link unCamionPompier 
    
    protected Pompier unPompier;		//## link unPompier 
    
    protected Temoin unTemoin;		//## link unTemoin 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int VaHopital=1;
    public static final int Recupere=2;
    public static final int Accident=3;
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
    public  Victime(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassVictime.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public CamionPompier getUnCamionPompier() {
        return unCamionPompier;
    }
    
    //## auto_generated 
    public void __setUnCamionPompier(CamionPompier p_CamionPompier) {
        unCamionPompier = p_CamionPompier;
        if(p_CamionPompier != null)
            {
                animInstance().notifyRelationAdded("unCamionPompier", p_CamionPompier);
            }
        else
            {
                animInstance().notifyRelationCleared("unCamionPompier");
            }
    }
    
    //## auto_generated 
    public void _setUnCamionPompier(CamionPompier p_CamionPompier) {
        if(unCamionPompier != null)
            {
                unCamionPompier.__setUnVictime(null);
            }
        __setUnCamionPompier(p_CamionPompier);
    }
    
    //## auto_generated 
    public void setUnCamionPompier(CamionPompier p_CamionPompier) {
        if(p_CamionPompier != null)
            {
                p_CamionPompier._setUnVictime(this);
            }
        _setUnCamionPompier(p_CamionPompier);
    }
    
    //## auto_generated 
    public void _clearUnCamionPompier() {
        animInstance().notifyRelationCleared("unCamionPompier");
        unCamionPompier = null;
    }
    
    //## auto_generated 
    public Pompier getUnPompier() {
        return unPompier;
    }
    
    //## auto_generated 
    public void __setUnPompier(Pompier p_Pompier) {
        unPompier = p_Pompier;
        if(p_Pompier != null)
            {
                animInstance().notifyRelationAdded("unPompier", p_Pompier);
            }
        else
            {
                animInstance().notifyRelationCleared("unPompier");
            }
    }
    
    //## auto_generated 
    public void _setUnPompier(Pompier p_Pompier) {
        if(unPompier != null)
            {
                unPompier.__setUnVictime(null);
            }
        __setUnPompier(p_Pompier);
    }
    
    //## auto_generated 
    public void setUnPompier(Pompier p_Pompier) {
        if(p_Pompier != null)
            {
                p_Pompier._setUnVictime(this);
            }
        _setUnPompier(p_Pompier);
    }
    
    //## auto_generated 
    public void _clearUnPompier() {
        animInstance().notifyRelationCleared("unPompier");
        unPompier = null;
    }
    
    //## auto_generated 
    public Temoin getUnTemoin() {
        return unTemoin;
    }
    
    //## auto_generated 
    public void __setUnTemoin(Temoin p_Temoin) {
        unTemoin = p_Temoin;
        if(p_Temoin != null)
            {
                animInstance().notifyRelationAdded("unTemoin", p_Temoin);
            }
        else
            {
                animInstance().notifyRelationCleared("unTemoin");
            }
    }
    
    //## auto_generated 
    public void _setUnTemoin(Temoin p_Temoin) {
        if(unTemoin != null)
            {
                unTemoin.__setUnVictime(null);
            }
        __setUnTemoin(p_Temoin);
    }
    
    //## auto_generated 
    public void setUnTemoin(Temoin p_Temoin) {
        if(p_Temoin != null)
            {
                p_Temoin._setUnVictime(this);
            }
        _setUnTemoin(p_Temoin);
    }
    
    //## auto_generated 
    public void _clearUnTemoin() {
        animInstance().notifyRelationCleared("unTemoin");
        unTemoin = null;
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
                case Accident:
                {
                    Accident_add(animStates);
                }
                break;
                case Recupere:
                {
                    Recupere_add(animStates);
                }
                break;
                case VaHopital:
                {
                    VaHopital_add(animStates);
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
            if(rootState_active == Accident)
                {
                    res = Accident_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void VaHopital_add(AnimStates animStates) {
            animStates.add("ROOT.VaHopital");
        }
        
        //## statechart_method 
        public void Recupere_add(AnimStates animStates) {
            animStates.add("ROOT.Recupere");
        }
        
        //## statechart_method 
        public void Accident_add(AnimStates animStates) {
            animStates.add("ROOT.Accident");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void AccidentEnter() {
        }
        
        //## statechart_method 
        public int VaHopital_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void Accident_exit() {
            AccidentExit();
            animInstance().notifyStateExited("ROOT.Accident");
        }
        
        //## statechart_method 
        public void Accident_entDef() {
            Accident_enter();
        }
        
        //## statechart_method 
        public void Recupere_enter() {
            animInstance().notifyStateEntered("ROOT.Recupere");
            rootState_subState = Recupere;
            rootState_active = Recupere;
            RecupereEnter();
        }
        
        //## statechart_method 
        public void VaHopitalExit() {
        }
        
        //## statechart_method 
        public void VaHopital_entDef() {
            VaHopital_enter();
        }
        
        //## statechart_method 
        public int AccidentTakeEventCamionPompierArrive() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("0");
            Accident_exit();
            Recupere_entDef();
            animInstance().notifyTransitionEnded("0");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Accident_enter() {
            animInstance().notifyStateEntered("ROOT.Accident");
            rootState_subState = Accident;
            rootState_active = Accident;
            AccidentEnter();
        }
        
        //## statechart_method 
        public int Recupere_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int AccidentTakeEventVaHopital() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Accident_exit();
            VaHopital_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void RecupereEnter() {
        }
        
        //## statechart_method 
        public void VaHopitalEnter() {
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
        public int Accident_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventCamionPompierArrive.EventCamionPompierArrive_Default_id))
                {
                    res = AccidentTakeEventCamionPompierArrive();
                }
            else if(event.isTypeOf(EventVaHopital.EventVaHopital_Default_id))
                {
                    res = AccidentTakeEventVaHopital();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Recupere_exit() {
            RecupereExit();
            animInstance().notifyStateExited("ROOT.Recupere");
        }
        
        //## statechart_method 
        public void VaHopital_exit() {
            VaHopitalExit();
            animInstance().notifyStateExited("ROOT.VaHopital");
        }
        
        //## statechart_method 
        public void VaHopital_enter() {
            animInstance().notifyStateEntered("ROOT.VaHopital");
            rootState_subState = VaHopital;
            rootState_active = VaHopital;
            VaHopitalEnter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("2");
            Accident_entDef();
            animInstance().notifyTransitionEnded("2");
        }
        
        //## statechart_method 
        public void RecupereExit() {
        }
        
        //## statechart_method 
        public void AccidentExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Recupere_entDef() {
            Recupere_enter();
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
            return Victime.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassVictime; 
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
        
        msg.add("unTemoin", false, true, unTemoin);
        msg.add("unPompier", false, true, unPompier);
        msg.add("unCamionPompier", false, true, unCamionPompier);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Victime.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Victime.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Victime.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Victime.java
*********************************************************************/

