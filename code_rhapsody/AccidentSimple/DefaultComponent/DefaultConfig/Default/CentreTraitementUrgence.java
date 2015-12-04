/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: CentreTraitementUrgence
//!	Generated Date	: Thu, 3, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/CentreTraitementUrgence.java
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
// Default/CentreTraitementUrgence.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor CentreTraitementUrgence 
public class CentreTraitementUrgence implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassCentreTraitementUrgence = new AnimClass("Default.CentreTraitementUrgence",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected CentreGestionMessage unCentreGestionMessage;		//## link unCentreGestionMessage 
    
    protected Pompier unPompier;		//## link unPompier 
    
    protected Temoin unTemoin;		//## link unTemoin 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Reception=1;
    public static final int EnAttente=2;
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
    public  CentreTraitementUrgence(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassCentreTraitementUrgence.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation ordreIntervention() 
    public void ordreIntervention() {
        try {
            animInstance().notifyMethodEntered("ordreIntervention",
               new ArgData[] {
               });
        
        //#[ operation ordreIntervention() 
        System.out.println("il est necessaire de faire une intervention");
        unPompier.gen(new EventUrgenceRecu());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation ordrePasIntervention() 
    public void ordrePasIntervention() {
        try {
            animInstance().notifyMethodEntered("ordrePasIntervention",
               new ArgData[] {
               });
        
        //#[ operation ordrePasIntervention() 
        System.out.println("Message analyser par un expert");
        System.out.println("Pas besoiin intervention"); 
        unTemoin.gen(new EventVaHopital());   
        
        
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public CentreGestionMessage getUnCentreGestionMessage() {
        return unCentreGestionMessage;
    }
    
    //## auto_generated 
    public void __setUnCentreGestionMessage(CentreGestionMessage p_CentreGestionMessage) {
        unCentreGestionMessage = p_CentreGestionMessage;
        if(p_CentreGestionMessage != null)
            {
                animInstance().notifyRelationAdded("unCentreGestionMessage", p_CentreGestionMessage);
            }
        else
            {
                animInstance().notifyRelationCleared("unCentreGestionMessage");
            }
    }
    
    //## auto_generated 
    public void _setUnCentreGestionMessage(CentreGestionMessage p_CentreGestionMessage) {
        if(unCentreGestionMessage != null)
            {
                unCentreGestionMessage.__setUnCentreTraitementUrgence(null);
            }
        __setUnCentreGestionMessage(p_CentreGestionMessage);
    }
    
    //## auto_generated 
    public void setUnCentreGestionMessage(CentreGestionMessage p_CentreGestionMessage) {
        if(p_CentreGestionMessage != null)
            {
                p_CentreGestionMessage._setUnCentreTraitementUrgence(this);
            }
        _setUnCentreGestionMessage(p_CentreGestionMessage);
    }
    
    //## auto_generated 
    public void _clearUnCentreGestionMessage() {
        animInstance().notifyRelationCleared("unCentreGestionMessage");
        unCentreGestionMessage = null;
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
                unPompier.__setUnCentreTraitementUrgence(null);
            }
        __setUnPompier(p_Pompier);
    }
    
    //## auto_generated 
    public void setUnPompier(Pompier p_Pompier) {
        if(p_Pompier != null)
            {
                p_Pompier._setUnCentreTraitementUrgence(this);
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
                unTemoin.__setUnCentreTraitementUrgence(null);
            }
        __setUnTemoin(p_Temoin);
    }
    
    //## auto_generated 
    public void setUnTemoin(Temoin p_Temoin) {
        if(p_Temoin != null)
            {
                p_Temoin._setUnCentreTraitementUrgence(this);
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
                case EnAttente:
                {
                    EnAttente_add(animStates);
                }
                break;
                case Reception:
                {
                    Reception_add(animStates);
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
                case Reception:
                {
                    res = Reception_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Reception_add(AnimStates animStates) {
            animStates.add("ROOT.Reception");
        }
        
        //## statechart_method 
        public void EnAttente_add(AnimStates animStates) {
            animStates.add("ROOT.EnAttente");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int EnAttente_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventMessageRelaye.EventMessageRelaye_Default_id))
                {
                    res = EnAttenteTakeEventMessageRelaye();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int EnAttenteTakeEventMessageRelaye() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            EnAttente_exit();
            Reception_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ReceptionExit() {
        }
        
        //## statechart_method 
        public void EnAttente_enter() {
            animInstance().notifyStateEntered("ROOT.EnAttente");
            rootState_subState = EnAttente;
            rootState_active = EnAttente;
            EnAttenteEnter();
        }
        
        //## statechart_method 
        public void Reception_entDef() {
            Reception_enter();
        }
        
        //## statechart_method 
        public int ReceptionTakeEventPasIntervention() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Reception_exit();
            //#[ transition 3 
            ordrePasIntervention();
            //#]
            EnAttente_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
        public void EnAttenteEnter() {
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
        public int ReceptionTakeEventIntervention() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Reception_exit();
            //#[ transition 2 
            ordreIntervention();
            //#]
            EnAttente_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Reception_enter() {
            animInstance().notifyStateEntered("ROOT.Reception");
            rootState_subState = Reception;
            rootState_active = Reception;
            ReceptionEnter();
        }
        
        //## statechart_method 
        public void EnAttente_exit() {
            EnAttenteExit();
            animInstance().notifyStateExited("ROOT.EnAttente");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            EnAttente_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void ReceptionEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void EnAttenteExit() {
        }
        
        //## statechart_method 
        public int Reception_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventIntervention.EventIntervention_Default_id))
                {
                    res = ReceptionTakeEventIntervention();
                }
            else if(event.isTypeOf(EventPasIntervention.EventPasIntervention_Default_id))
                {
                    res = ReceptionTakeEventPasIntervention();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Reception_exit() {
            ReceptionExit();
            animInstance().notifyStateExited("ROOT.Reception");
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
            return CentreTraitementUrgence.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassCentreTraitementUrgence; 
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
        
        msg.add("unCentreGestionMessage", false, true, unCentreGestionMessage);
        msg.add("unPompier", false, true, unPompier);
        msg.add("unTemoin", false, true, unTemoin);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(CentreTraitementUrgence.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            CentreTraitementUrgence.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            CentreTraitementUrgence.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/CentreTraitementUrgence.java
*********************************************************************/

