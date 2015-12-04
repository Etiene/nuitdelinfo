/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: police
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/police.java
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
// Default/police.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor police 
public class police implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClasspolice = new AnimClass("Default.police",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected CentreAppel unCentreAppel;		//## link unCentreAppel 
    
    protected centreCommandement unCentreCommandement;		//## link unCentreCommandement 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int FinAppelCentreCommandement=1;
    public static final int FinAppelCentreAppel=2;
    public static final int EnAttente=3;
    public static final int DebutAppelCentreCommandement=4;
    public static final int DebutAppelCentreAppel=5;
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
    public  police(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClasspolice.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation debutAppelCentreAppel() 
    public void debutAppelCentreAppel() {
        try {
            animInstance().notifyMethodEntered("debutAppelCentreAppel",
               new ArgData[] {
               });
        
        //#[ operation debutAppelCentreAppel() 
        System.out.println("Debut appel entre centre police et centre appel");
        try {
        		TimeUnit.SECONDS.sleep(5);  
        		this.gen( new EventFinAppelCentreAppel());
        	} catch (InterruptedException e) {
        		
        		e.printStackTrace();
        	}
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation debutAppelCentreCommandement() 
    public void debutAppelCentreCommandement() {
        try {
            animInstance().notifyMethodEntered("debutAppelCentreCommandement",
               new ArgData[] {
               });
        
        //#[ operation debutAppelCentreCommandement() 
        unCentreCommandement.gen(new EventDebutAppelPolice());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation finAppelCentreAppel() 
    public void finAppelCentreAppel() {
        try {
            animInstance().notifyMethodEntered("finAppelCentreAppel",
               new ArgData[] {
               });
        
        //#[ operation finAppelCentreAppel() 
        System.out.println("Fin de appel centre police et centre appel");
        this.gen(new EventDebutAppelCentreCommandement()); 
        unCentreAppel.gen(new EventFinAppelPolice());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation finAppelCentreCommandement() 
    public void finAppelCentreCommandement() {
        try {
            animInstance().notifyMethodEntered("finAppelCentreCommandement",
               new ArgData[] {
               });
        
        //#[ operation finAppelCentreCommandement() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public CentreAppel getUnCentreAppel() {
        return unCentreAppel;
    }
    
    //## auto_generated 
    public void __setUnCentreAppel(CentreAppel p_CentreAppel) {
        unCentreAppel = p_CentreAppel;
        if(p_CentreAppel != null)
            {
                animInstance().notifyRelationAdded("unCentreAppel", p_CentreAppel);
            }
        else
            {
                animInstance().notifyRelationCleared("unCentreAppel");
            }
    }
    
    //## auto_generated 
    public void _setUnCentreAppel(CentreAppel p_CentreAppel) {
        if(unCentreAppel != null)
            {
                unCentreAppel.__setUnPolice(null);
            }
        __setUnCentreAppel(p_CentreAppel);
    }
    
    //## auto_generated 
    public void setUnCentreAppel(CentreAppel p_CentreAppel) {
        if(p_CentreAppel != null)
            {
                p_CentreAppel._setUnPolice(this);
            }
        _setUnCentreAppel(p_CentreAppel);
    }
    
    //## auto_generated 
    public void _clearUnCentreAppel() {
        animInstance().notifyRelationCleared("unCentreAppel");
        unCentreAppel = null;
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
                unCentreCommandement.__setUnPolice(null);
            }
        __setUnCentreCommandement(p_centreCommandement);
    }
    
    //## auto_generated 
    public void setUnCentreCommandement(centreCommandement p_centreCommandement) {
        if(p_centreCommandement != null)
            {
                p_centreCommandement._setUnPolice(this);
            }
        _setUnCentreCommandement(p_centreCommandement);
    }
    
    //## auto_generated 
    public void _clearUnCentreCommandement() {
        animInstance().notifyRelationCleared("unCentreCommandement");
        unCentreCommandement = null;
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
                case DebutAppelCentreAppel:
                {
                    DebutAppelCentreAppel_add(animStates);
                }
                break;
                case FinAppelCentreCommandement:
                {
                    FinAppelCentreCommandement_add(animStates);
                }
                break;
                case FinAppelCentreAppel:
                {
                    FinAppelCentreAppel_add(animStates);
                }
                break;
                case DebutAppelCentreCommandement:
                {
                    DebutAppelCentreCommandement_add(animStates);
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
                case DebutAppelCentreAppel:
                {
                    res = DebutAppelCentreAppel_takeEvent(id);
                }
                break;
                case FinAppelCentreCommandement:
                {
                    res = FinAppelCentreCommandement_takeEvent(id);
                }
                break;
                case FinAppelCentreAppel:
                {
                    res = FinAppelCentreAppel_takeEvent(id);
                }
                break;
                case DebutAppelCentreCommandement:
                {
                    res = DebutAppelCentreCommandement_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void FinAppelCentreCommandement_add(AnimStates animStates) {
            animStates.add("ROOT.FinAppelCentreCommandement");
        }
        
        //## statechart_method 
        public void FinAppelCentreAppel_add(AnimStates animStates) {
            animStates.add("ROOT.FinAppelCentreAppel");
        }
        
        //## statechart_method 
        public void EnAttente_add(AnimStates animStates) {
            animStates.add("ROOT.EnAttente");
        }
        
        //## statechart_method 
        public void DebutAppelCentreCommandement_add(AnimStates animStates) {
            animStates.add("ROOT.DebutAppelCentreCommandement");
        }
        
        //## statechart_method 
        public void DebutAppelCentreAppel_add(AnimStates animStates) {
            animStates.add("ROOT.DebutAppelCentreAppel");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int EnAttente_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventDebutAppelCentreAppel.EventDebutAppelCentreAppel_Default_id))
                {
                    res = EnAttenteTakeEventDebutAppelCentreAppel();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void FinAppelCentreAppel_enter() {
            animInstance().notifyStateEntered("ROOT.FinAppelCentreAppel");
            rootState_subState = FinAppelCentreAppel;
            rootState_active = FinAppelCentreAppel;
            FinAppelCentreAppelEnter();
        }
        
        //## statechart_method 
        public void DebutAppelCentreAppelEnter() {
        }
        
        //## statechart_method 
        public void FinAppelCentreAppelEnter() {
        }
        
        //## statechart_method 
        public int EnAttenteTakeEventDebutAppelCentreAppel() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            EnAttente_exit();
            //#[ transition 4 
            debutAppelCentreAppel();
            //#]
            DebutAppelCentreAppel_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
        public int FinAppelCentreAppel_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventDebutAppelCentreCommandement.EventDebutAppelCentreCommandement_Default_id))
                {
                    res = FinAppelCentreAppelTakeEventDebutAppelCentreCommandement();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void FinAppelCentreCommandement_enter() {
            animInstance().notifyStateEntered("ROOT.FinAppelCentreCommandement");
            rootState_subState = FinAppelCentreCommandement;
            rootState_active = FinAppelCentreCommandement;
            FinAppelCentreCommandementEnter();
        }
        
        //## statechart_method 
        public void DebutAppelCentreAppel_exit() {
            DebutAppelCentreAppelExit();
            animInstance().notifyStateExited("ROOT.DebutAppelCentreAppel");
        }
        
        //## statechart_method 
        public int FinAppelCentreAppelTakeEventDebutAppelCentreCommandement() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            FinAppelCentreAppel_exit();
            //#[ transition 2 
            debutAppelCentreCommandement();
            //#]
            DebutAppelCentreCommandement_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void FinAppelCentreAppel_exit() {
            FinAppelCentreAppelExit();
            animInstance().notifyStateExited("ROOT.FinAppelCentreAppel");
        }
        
        //## statechart_method 
        public void FinAppelCentreCommandement_entDef() {
            FinAppelCentreCommandement_enter();
        }
        
        //## statechart_method 
        public int DebutAppelCentreAppel_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventFinAppelCentreAppel.EventFinAppelCentreAppel_Default_id))
                {
                    res = DebutAppelCentreAppelTakeEventFinAppelCentreAppel();
                }
            
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
        public int FinAppelCentreCommandementTakeEventEnAttente() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            FinAppelCentreCommandement_exit();
            EnAttente_entDef();
            animInstance().notifyTransitionEnded("1");
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
        public int DebutAppelCentreAppelTakeEventFinAppelCentreAppel() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            DebutAppelCentreAppel_exit();
            //#[ transition 3 
            finAppelCentreAppel();
            //#]
            FinAppelCentreAppel_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnAttente_exit() {
            EnAttenteExit();
            animInstance().notifyStateExited("ROOT.EnAttente");
        }
        
        //## statechart_method 
        public void FinAppelCentreAppel_entDef() {
            FinAppelCentreAppel_enter();
        }
        
        //## statechart_method 
        public void DebutAppelCentreCommandement_entDef() {
            DebutAppelCentreCommandement_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            EnAttente_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int DebutAppelCentreCommandement_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventFinAppelCentreCommandement.EventFinAppelCentreCommandement_Default_id))
                {
                    res = DebutAppelCentreCommandementTakeEventFinAppelCentreCommandement();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void DebutAppelCentreCommandementExit() {
        }
        
        //## statechart_method 
        public void DebutAppelCentreAppelExit() {
        }
        
        //## statechart_method 
        public void DebutAppelCentreAppel_enter() {
            animInstance().notifyStateEntered("ROOT.DebutAppelCentreAppel");
            rootState_subState = DebutAppelCentreAppel;
            rootState_active = DebutAppelCentreAppel;
            DebutAppelCentreAppelEnter();
        }
        
        //## statechart_method 
        public void DebutAppelCentreCommandementEnter() {
        }
        
        //## statechart_method 
        public void FinAppelCentreAppelExit() {
        }
        
        //## statechart_method 
        public void FinAppelCentreCommandementEnter() {
        }
        
        //## statechart_method 
        public void DebutAppelCentreAppel_entDef() {
            DebutAppelCentreAppel_enter();
        }
        
        //## statechart_method 
        public void DebutAppelCentreCommandement_enter() {
            animInstance().notifyStateEntered("ROOT.DebutAppelCentreCommandement");
            rootState_subState = DebutAppelCentreCommandement;
            rootState_active = DebutAppelCentreCommandement;
            DebutAppelCentreCommandementEnter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void EnAttenteExit() {
        }
        
        //## statechart_method 
        public int FinAppelCentreCommandement_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEnAttente.EventEnAttente_Default_id))
                {
                    res = FinAppelCentreCommandementTakeEventEnAttente();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void FinAppelCentreCommandementExit() {
        }
        
        //## statechart_method 
        public int DebutAppelCentreCommandementTakeEventFinAppelCentreCommandement() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            DebutAppelCentreCommandement_exit();
            //#[ transition 5 
            finAppelCentreCommandement();
            //#]
            FinAppelCentreCommandement_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void DebutAppelCentreCommandement_exit() {
            DebutAppelCentreCommandementExit();
            animInstance().notifyStateExited("ROOT.DebutAppelCentreCommandement");
        }
        
        //## statechart_method 
        public void FinAppelCentreCommandement_exit() {
            FinAppelCentreCommandementExit();
            animInstance().notifyStateExited("ROOT.FinAppelCentreCommandement");
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
            return police.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClasspolice; 
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
        
        msg.add("unCentreAppel", false, true, unCentreAppel);
        msg.add("unCentreCommandement", false, true, unCentreCommandement);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(police.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            police.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            police.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/police.java
*********************************************************************/

