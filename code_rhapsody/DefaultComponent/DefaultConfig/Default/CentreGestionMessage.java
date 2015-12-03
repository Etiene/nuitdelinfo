/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: CentreGestionMessage
//!	Generated Date	: Thu, 3, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/CentreGestionMessage.java
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
// Default/CentreGestionMessage.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class CentreGestionMessage 
public class CentreGestionMessage implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassCentreGestionMessage = new AnimClass("Default.CentreGestionMessage",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected CentreTraitementUrgence unCentreTraitementUrgence;		//## link unCentreTraitementUrgence 
    
    protected Temoin unTemoin;		//## link unTemoin 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int TraitementEtEnvoie=1;
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
    public  CentreGestionMessage(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassCentreGestionMessage.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation relayerMessage() 
    public void relayerMessage() {
        try {
            animInstance().notifyMethodEntered("relayerMessage",
               new ArgData[] {
               });
        
        //#[ operation relayerMessage() 
        System.out.println("Message analysé et relayé au centre des uregences");
        unCentreTraitementUrgence.gen( new EventMessageRelaye() );
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public CentreTraitementUrgence getUnCentreTraitementUrgence() {
        return unCentreTraitementUrgence;
    }
    
    //## auto_generated 
    public void __setUnCentreTraitementUrgence(CentreTraitementUrgence p_CentreTraitementUrgence) {
        unCentreTraitementUrgence = p_CentreTraitementUrgence;
        if(p_CentreTraitementUrgence != null)
            {
                animInstance().notifyRelationAdded("unCentreTraitementUrgence", p_CentreTraitementUrgence);
            }
        else
            {
                animInstance().notifyRelationCleared("unCentreTraitementUrgence");
            }
    }
    
    //## auto_generated 
    public void _setUnCentreTraitementUrgence(CentreTraitementUrgence p_CentreTraitementUrgence) {
        if(unCentreTraitementUrgence != null)
            {
                unCentreTraitementUrgence.__setUnCentreGestionMessage(null);
            }
        __setUnCentreTraitementUrgence(p_CentreTraitementUrgence);
    }
    
    //## auto_generated 
    public void setUnCentreTraitementUrgence(CentreTraitementUrgence p_CentreTraitementUrgence) {
        if(p_CentreTraitementUrgence != null)
            {
                p_CentreTraitementUrgence._setUnCentreGestionMessage(this);
            }
        _setUnCentreTraitementUrgence(p_CentreTraitementUrgence);
    }
    
    //## auto_generated 
    public void _clearUnCentreTraitementUrgence() {
        animInstance().notifyRelationCleared("unCentreTraitementUrgence");
        unCentreTraitementUrgence = null;
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
                unTemoin.__setUnCentreGestionMessage(null);
            }
        __setUnTemoin(p_Temoin);
    }
    
    //## auto_generated 
    public void setUnTemoin(Temoin p_Temoin) {
        if(p_Temoin != null)
            {
                p_Temoin._setUnCentreGestionMessage(this);
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
                case TraitementEtEnvoie:
                {
                    TraitementEtEnvoie_add(animStates);
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
                case TraitementEtEnvoie:
                {
                    res = TraitementEtEnvoie_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void TraitementEtEnvoie_add(AnimStates animStates) {
            animStates.add("ROOT.TraitementEtEnvoie");
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
            if(event.isTypeOf(EventMessageRecu.EventMessageRecu_Default_id))
                {
                    res = EnAttenteTakeEventMessageRecu();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void EnAttente_enter() {
            animInstance().notifyStateEntered("ROOT.EnAttente");
            rootState_subState = EnAttente;
            rootState_active = EnAttente;
            EnAttenteEnter();
        }
        
        //## statechart_method 
        public void TraitementEtEnvoie_enter() {
            animInstance().notifyStateEntered("ROOT.TraitementEtEnvoie");
            pushNullConfig();
            rootState_subState = TraitementEtEnvoie;
            rootState_active = TraitementEtEnvoie;
            TraitementEtEnvoieEnter();
        }
        
        //## statechart_method 
        public int EnAttenteTakeEventMessageRecu() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            EnAttente_exit();
            //#[ transition 1 
            relayerMessage();
            //#]
            TraitementEtEnvoie_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnAttente_entDef() {
            EnAttente_enter();
        }
        
        //## statechart_method 
        public int TraitementEtEnvoie_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = TraitementEtEnvoieTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void TraitementEtEnvoieExit() {
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
        public void TraitementEtEnvoieEnter() {
        }
        
        //## statechart_method 
        public void EnAttente_exit() {
            EnAttenteExit();
            animInstance().notifyStateExited("ROOT.EnAttente");
        }
        
        //## statechart_method 
        public int TraitementEtEnvoieTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            TraitementEtEnvoie_exit();
            EnAttente_entDef();
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
        public void TraitementEtEnvoie_exit() {
            popNullConfig();
            TraitementEtEnvoieExit();
            animInstance().notifyStateExited("ROOT.TraitementEtEnvoie");
        }
        
        //## statechart_method 
        public void TraitementEtEnvoie_entDef() {
            TraitementEtEnvoie_enter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void EnAttenteExit() {
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
            return CentreGestionMessage.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassCentreGestionMessage; 
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
        msg.add("unCentreTraitementUrgence", false, true, unCentreTraitementUrgence);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(CentreGestionMessage.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            CentreGestionMessage.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            CentreGestionMessage.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/CentreGestionMessage.java
*********************************************************************/

