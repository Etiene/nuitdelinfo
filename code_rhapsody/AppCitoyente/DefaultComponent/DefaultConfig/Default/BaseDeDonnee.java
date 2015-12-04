/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: BaseDeDonnee
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/BaseDeDonnee.java
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
// Default/BaseDeDonnee.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor BaseDeDonnee 
public class BaseDeDonnee implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassBaseDeDonnee = new AnimClass("Default.BaseDeDonnee",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected IngenieurInformaticien unIngenieurInformaticien;		//## link unIngenieurInformaticien 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int ExecuteReqeuete=1;
    public static final int AttenteRequete=2;
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
    public  BaseDeDonnee(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassBaseDeDonnee.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation requeteExecute() 
    public void requeteExecute() {
        try {
            animInstance().notifyMethodEntered("requeteExecute",
               new ArgData[] {
               });
        
        //#[ operation requeteExecute() 
        System.out.println("BDD execute une requete");
        this.gen(new EventRequeteAttente());
        unIngenieurInformaticien.gen (new EventEtatNormal());
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
                unIngenieurInformaticien.__setUnBaseDeDonnee(null);
            }
        __setUnIngenieurInformaticien(p_IngenieurInformaticien);
    }
    
    //## auto_generated 
    public void setUnIngenieurInformaticien(IngenieurInformaticien p_IngenieurInformaticien) {
        if(p_IngenieurInformaticien != null)
            {
                p_IngenieurInformaticien._setUnBaseDeDonnee(this);
            }
        _setUnIngenieurInformaticien(p_IngenieurInformaticien);
    }
    
    //## auto_generated 
    public void _clearUnIngenieurInformaticien() {
        animInstance().notifyRelationCleared("unIngenieurInformaticien");
        unIngenieurInformaticien = null;
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
                case AttenteRequete:
                {
                    AttenteRequete_add(animStates);
                }
                break;
                case ExecuteReqeuete:
                {
                    ExecuteReqeuete_add(animStates);
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
                case AttenteRequete:
                {
                    res = AttenteRequete_takeEvent(id);
                }
                break;
                case ExecuteReqeuete:
                {
                    res = ExecuteReqeuete_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void ExecuteReqeuete_add(AnimStates animStates) {
            animStates.add("ROOT.ExecuteReqeuete");
        }
        
        //## statechart_method 
        public void AttenteRequete_add(AnimStates animStates) {
            animStates.add("ROOT.AttenteRequete");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void ExecuteReqeueteExit() {
        }
        
        //## statechart_method 
        public int AttenteRequeteTakeEventRequeteExecute() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            AttenteRequete_exit();
            //#[ transition 1 
            requeteExecute();
            //#]
            ExecuteReqeuete_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ExecuteReqeuete_enter() {
            animInstance().notifyStateEntered("ROOT.ExecuteReqeuete");
            rootState_subState = ExecuteReqeuete;
            rootState_active = ExecuteReqeuete;
            ExecuteReqeueteEnter();
        }
        
        //## statechart_method 
        public void AttenteRequete_enter() {
            animInstance().notifyStateEntered("ROOT.AttenteRequete");
            rootState_subState = AttenteRequete;
            rootState_active = AttenteRequete;
            AttenteRequeteEnter();
        }
        
        //## statechart_method 
        public void AttenteRequete_entDef() {
            AttenteRequete_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int AttenteRequete_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventRequeteExecute.EventRequeteExecute_Default_id))
                {
                    res = AttenteRequeteTakeEventRequeteExecute();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void ExecuteReqeueteEnter() {
        }
        
        //## statechart_method 
        public void AttenteRequeteExit() {
        }
        
        //## statechart_method 
        public int ExecuteReqeuete_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventRequeteAttente.EventRequeteAttente_Default_id))
                {
                    res = ExecuteReqeueteTakeEventRequeteAttente();
                }
            
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
        public int ExecuteReqeueteTakeEventRequeteAttente() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            ExecuteReqeuete_exit();
            AttenteRequete_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ExecuteReqeuete_entDef() {
            ExecuteReqeuete_enter();
        }
        
        //## statechart_method 
        public void ExecuteReqeuete_exit() {
            ExecuteReqeueteExit();
            animInstance().notifyStateExited("ROOT.ExecuteReqeuete");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            AttenteRequete_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void AttenteRequeteEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void AttenteRequete_exit() {
            AttenteRequeteExit();
            animInstance().notifyStateExited("ROOT.AttenteRequete");
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
            return BaseDeDonnee.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassBaseDeDonnee; 
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
        
        msg.add("unIngenieurInformaticien", false, true, unIngenieurInformaticien);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(BaseDeDonnee.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            BaseDeDonnee.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            BaseDeDonnee.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/BaseDeDonnee.java
*********************************************************************/

