/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: CamionPompier
//!	Generated Date	: Thu, 3, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/CamionPompier.java
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
// Default/CamionPompier.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class CamionPompier 
public class CamionPompier implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassCamionPompier = new AnimClass("Default.CamionPompier",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected Pompier unPompier;		//## link unPompier 
    
    protected Victime unVictime;		//## link unVictime 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int EnRoute=1;
    public static final int EnAttente=2;
    public static final int ArriveLieu=3;
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
    public  CamionPompier(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassCamionPompier.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation enroute() 
    public void enroute() {
        try {
            animInstance().notifyMethodEntered("enroute",
               new ArgData[] {
               });
        
        //#[ operation enroute() 
        System.out.println("La camion de pompier est en route...");
        System.out.println("le camion est arrive");
        
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
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
                unPompier.__setUnCamionPompier(null);
            }
        __setUnPompier(p_Pompier);
    }
    
    //## auto_generated 
    public void setUnPompier(Pompier p_Pompier) {
        if(p_Pompier != null)
            {
                p_Pompier._setUnCamionPompier(this);
            }
        _setUnPompier(p_Pompier);
    }
    
    //## auto_generated 
    public void _clearUnPompier() {
        animInstance().notifyRelationCleared("unPompier");
        unPompier = null;
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
                unVictime.__setUnCamionPompier(null);
            }
        __setUnVictime(p_Victime);
    }
    
    //## auto_generated 
    public void setUnVictime(Victime p_Victime) {
        if(p_Victime != null)
            {
                p_Victime._setUnCamionPompier(this);
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
                case EnAttente:
                {
                    EnAttente_add(animStates);
                }
                break;
                case EnRoute:
                {
                    EnRoute_add(animStates);
                }
                break;
                case ArriveLieu:
                {
                    ArriveLieu_add(animStates);
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
                case EnAttente:
                {
                    res = EnAttente_takeEvent(id);
                }
                break;
                case EnRoute:
                {
                    res = EnRoute_takeEvent(id);
                }
                break;
                case ArriveLieu:
                {
                    res = ArriveLieu_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void EnRoute_add(AnimStates animStates) {
            animStates.add("ROOT.EnRoute");
        }
        
        //## statechart_method 
        public void EnAttente_add(AnimStates animStates) {
            animStates.add("ROOT.EnAttente");
        }
        
        //## statechart_method 
        public void ArriveLieu_add(AnimStates animStates) {
            animStates.add("ROOT.ArriveLieu");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int EnAttente_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEnvoieCamionPompier.EventEnvoieCamionPompier_Default_id))
                {
                    res = EnAttenteTakeEventEnvoieCamionPompier();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void EnRouteEnter() {
        }
        
        //## statechart_method 
        public void ArriveLieu_entDef() {
            ArriveLieu_enter();
        }
        
        //## statechart_method 
        public void EnAttente_enter() {
            animInstance().notifyStateEntered("ROOT.EnAttente");
            rootState_subState = EnAttente;
            rootState_active = EnAttente;
            EnAttenteEnter();
        }
        
        //## statechart_method 
        public void EnRoute_exit() {
            EnRouteExit();
            animInstance().notifyStateExited("ROOT.EnRoute");
        }
        
        //## statechart_method 
        public int EnAttenteTakeEventEnvoieCamionPompier() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            EnAttente_exit();
            //#[ transition 1 
            enroute();
            //#]
            EnRoute_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int EnRoute_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventCamionPompierArrive.EventCamionPompierArrive_Default_id))
                {
                    res = EnRouteTakeEventCamionPompierArrive();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void ArriveLieuExit() {
        }
        
        //## statechart_method 
        public void ArriveLieu_enter() {
            animInstance().notifyStateEntered("ROOT.ArriveLieu");
            rootState_subState = ArriveLieu;
            rootState_active = ArriveLieu;
            ArriveLieuEnter();
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
        public int ArriveLieu_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void EnAttenteEnter() {
        }
        
        //## statechart_method 
        public void EnRouteExit() {
        }
        
        //## statechart_method 
        public void EnRoute_enter() {
            animInstance().notifyStateEntered("ROOT.EnRoute");
            rootState_subState = EnRoute;
            rootState_active = EnRoute;
            EnRouteEnter();
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
        public void EnAttente_exit() {
            EnAttenteExit();
            animInstance().notifyStateExited("ROOT.EnAttente");
        }
        
        //## statechart_method 
        public void EnRoute_entDef() {
            EnRoute_enter();
        }
        
        //## statechart_method 
        public int EnRouteTakeEventCamionPompierArrive() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            EnRoute_exit();
            ArriveLieu_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            EnAttente_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void ArriveLieuEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void EnAttenteExit() {
        }
        
        //## statechart_method 
        public void ArriveLieu_exit() {
            ArriveLieuExit();
            animInstance().notifyStateExited("ROOT.ArriveLieu");
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
            return CamionPompier.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassCamionPompier; 
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
        
        msg.add("unPompier", false, true, unPompier);
        msg.add("unVictime", false, true, unVictime);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(CamionPompier.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            CamionPompier.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            CamionPompier.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/CamionPompier.java
*********************************************************************/

