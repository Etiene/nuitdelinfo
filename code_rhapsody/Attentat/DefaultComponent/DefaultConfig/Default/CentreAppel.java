/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: CentreAppel
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/CentreAppel.java
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
// Default/CentreAppel.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class CentreAppel 
public class CentreAppel implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassCentreAppel = new AnimClass("Default.CentreAppel",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected police unPolice;		//## link unPolice 
    
    protected Temoin unTemoin;		//## link unTemoin 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int FinAppelTemoin=1;
    public static final int FinAppelPolice=2;
    public static final int EnAttente=3;
    public static final int DebutAppelTemoin=4;
    public static final int DebutAppelPolice=5;
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
    public  CentreAppel(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassCentreAppel.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation debutAppelPolice() 
    public void debutAppelPolice() {
        try {
            animInstance().notifyMethodEntered("debutAppelPolice",
               new ArgData[] {
               });
        
        //#[ operation debutAppelPolice() 
        unPolice.gen(new EventDebutAppelCentreAppel());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation debutAppelTemoin() 
    public void debutAppelTemoin() {
        try {
            animInstance().notifyMethodEntered("debutAppelTemoin",
               new ArgData[] {
               });
        
        //#[ operation debutAppelTemoin() 
        System.out.println("debut appel entre temoin et centre appel");
        try {
        		TimeUnit.SECONDS.sleep(5);
        		this.gen(new EventFinAppelTemoin());
        	} catch (InterruptedException e) {
        		
        		e.printStackTrace();
        	}
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation finAppelPolice() 
    public void finAppelPolice() {
        try {
            animInstance().notifyMethodEntered("finAppelPolice",
               new ArgData[] {
               });
        
        //#[ operation finAppelPolice() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation finAppelTemoin() 
    public void finAppelTemoin() {
        try {
            animInstance().notifyMethodEntered("finAppelTemoin",
               new ArgData[] {
               });
        
        //#[ operation finAppelTemoin() 
        System.out.println("fin appel entre temoin et centre appel");  
        unTemoin.gen(new EventFinAppelCentreAppel());  
        this.gen(new EventDebutAppelPolice());
        
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public police getUnPolice() {
        return unPolice;
    }
    
    //## auto_generated 
    public void __setUnPolice(police p_police) {
        unPolice = p_police;
        if(p_police != null)
            {
                animInstance().notifyRelationAdded("unPolice", p_police);
            }
        else
            {
                animInstance().notifyRelationCleared("unPolice");
            }
    }
    
    //## auto_generated 
    public void _setUnPolice(police p_police) {
        if(unPolice != null)
            {
                unPolice.__setUnCentreAppel(null);
            }
        __setUnPolice(p_police);
    }
    
    //## auto_generated 
    public void setUnPolice(police p_police) {
        if(p_police != null)
            {
                p_police._setUnCentreAppel(this);
            }
        _setUnPolice(p_police);
    }
    
    //## auto_generated 
    public void _clearUnPolice() {
        animInstance().notifyRelationCleared("unPolice");
        unPolice = null;
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
                unTemoin.__setUnCentreAppel(null);
            }
        __setUnTemoin(p_Temoin);
    }
    
    //## auto_generated 
    public void setUnTemoin(Temoin p_Temoin) {
        if(p_Temoin != null)
            {
                p_Temoin._setUnCentreAppel(this);
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
                case DebutAppelTemoin:
                {
                    DebutAppelTemoin_add(animStates);
                }
                break;
                case FinAppelPolice:
                {
                    FinAppelPolice_add(animStates);
                }
                break;
                case FinAppelTemoin:
                {
                    FinAppelTemoin_add(animStates);
                }
                break;
                case DebutAppelPolice:
                {
                    DebutAppelPolice_add(animStates);
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
                case DebutAppelTemoin:
                {
                    res = DebutAppelTemoin_takeEvent(id);
                }
                break;
                case FinAppelPolice:
                {
                    res = FinAppelPolice_takeEvent(id);
                }
                break;
                case FinAppelTemoin:
                {
                    res = FinAppelTemoin_takeEvent(id);
                }
                break;
                case DebutAppelPolice:
                {
                    res = DebutAppelPolice_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void FinAppelTemoin_add(AnimStates animStates) {
            animStates.add("ROOT.FinAppelTemoin");
        }
        
        //## statechart_method 
        public void FinAppelPolice_add(AnimStates animStates) {
            animStates.add("ROOT.FinAppelPolice");
        }
        
        //## statechart_method 
        public void EnAttente_add(AnimStates animStates) {
            animStates.add("ROOT.EnAttente");
        }
        
        //## statechart_method 
        public void DebutAppelTemoin_add(AnimStates animStates) {
            animStates.add("ROOT.DebutAppelTemoin");
        }
        
        //## statechart_method 
        public void DebutAppelPolice_add(AnimStates animStates) {
            animStates.add("ROOT.DebutAppelPolice");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int EnAttente_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventDebutAppelTemoin.EventDebutAppelTemoin_Default_id))
                {
                    res = EnAttenteTakeEventDebutAppelTemoin();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int EnAttenteTakeEventDebutAppelTemoin() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            EnAttente_exit();
            //#[ transition 5 
            debutAppelTemoin();
            //#]
            DebutAppelTemoin_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void FinAppelTemoin_entDef() {
            FinAppelTemoin_enter();
        }
        
        //## statechart_method 
        public void DebutAppelTemoin_exit() {
            DebutAppelTemoinExit();
            animInstance().notifyStateExited("ROOT.DebutAppelTemoin");
        }
        
        //## statechart_method 
        public void FinAppelPolice_entDef() {
            FinAppelPolice_enter();
        }
        
        //## statechart_method 
        public void DebutAppelTemoin_entDef() {
            DebutAppelTemoin_enter();
        }
        
        //## statechart_method 
        public void EnAttente_enter() {
            animInstance().notifyStateEntered("ROOT.EnAttente");
            rootState_subState = EnAttente;
            rootState_active = EnAttente;
            EnAttenteEnter();
        }
        
        //## statechart_method 
        public void FinAppelPoliceEnter() {
        }
        
        //## statechart_method 
        public void FinAppelTemoin_enter() {
            animInstance().notifyStateEntered("ROOT.FinAppelTemoin");
            rootState_subState = FinAppelTemoin;
            rootState_active = FinAppelTemoin;
            FinAppelTemoinEnter();
        }
        
        //## statechart_method 
        public int DebutAppelPoliceTakeEventFinAppelPolice() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            DebutAppelPolice_exit();
            //#[ transition 4 
             finAppelPolice();
            //#]
            FinAppelPolice_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void DebutAppelPolice_entDef() {
            DebutAppelPolice_enter();
        }
        
        //## statechart_method 
        public void FinAppelPolice_enter() {
            animInstance().notifyStateEntered("ROOT.FinAppelPolice");
            pushNullConfig();
            rootState_subState = FinAppelPolice;
            rootState_active = FinAppelPolice;
            FinAppelPoliceEnter();
        }
        
        //## statechart_method 
        public int FinAppelTemoinTakeEventDebutAppelPolice() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            FinAppelTemoin_exit();
            //#[ transition 3 
            debutAppelPolice();
            //#]
            DebutAppelPolice_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void FinAppelPolice_exit() {
            popNullConfig();
            FinAppelPoliceExit();
            animInstance().notifyStateExited("ROOT.FinAppelPolice");
        }
        
        //## statechart_method 
        public int DebutAppelTemoin_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventFinAppelTemoin.EventFinAppelTemoin_Default_id))
                {
                    res = DebutAppelTemoinTakeEventFinAppelTemoin();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void EnAttente_entDef() {
            EnAttente_enter();
        }
        
        //## statechart_method 
        public void FinAppelPoliceExit() {
        }
        
        //## statechart_method 
        public int FinAppelTemoin_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventDebutAppelPolice.EventDebutAppelPolice_Default_id))
                {
                    res = FinAppelTemoinTakeEventDebutAppelPolice();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void FinAppelTemoinExit() {
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
        public int FinAppelPoliceTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            FinAppelPolice_exit();
            EnAttente_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void DebutAppelPoliceEnter() {
        }
        
        //## statechart_method 
        public int DebutAppelTemoinTakeEventFinAppelTemoin() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            DebutAppelTemoin_exit();
            //#[ transition 2 
            finAppelTemoin();
            //#]
            FinAppelTemoin_entDef();
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
        public int DebutAppelPolice_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventFinAppelPolice.EventFinAppelPolice_Default_id))
                {
                    res = DebutAppelPoliceTakeEventFinAppelPolice();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int FinAppelPolice_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = FinAppelPoliceTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void FinAppelTemoinEnter() {
        }
        
        //## statechart_method 
        public void DebutAppelPoliceExit() {
        }
        
        //## statechart_method 
        public void DebutAppelTemoinExit() {
        }
        
        //## statechart_method 
        public void EnAttente_exit() {
            EnAttenteExit();
            animInstance().notifyStateExited("ROOT.EnAttente");
        }
        
        //## statechart_method 
        public void DebutAppelPolice_exit() {
            DebutAppelPoliceExit();
            animInstance().notifyStateExited("ROOT.DebutAppelPolice");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            EnAttente_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void DebutAppelTemoin_enter() {
            animInstance().notifyStateEntered("ROOT.DebutAppelTemoin");
            rootState_subState = DebutAppelTemoin;
            rootState_active = DebutAppelTemoin;
            DebutAppelTemoinEnter();
        }
        
        //## statechart_method 
        public void FinAppelTemoin_exit() {
            FinAppelTemoinExit();
            animInstance().notifyStateExited("ROOT.FinAppelTemoin");
        }
        
        //## statechart_method 
        public void DebutAppelPolice_enter() {
            animInstance().notifyStateEntered("ROOT.DebutAppelPolice");
            rootState_subState = DebutAppelPolice;
            rootState_active = DebutAppelPolice;
            DebutAppelPoliceEnter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void DebutAppelTemoinEnter() {
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
            return CentreAppel.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassCentreAppel; 
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
        msg.add("unPolice", false, true, unPolice);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(CentreAppel.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            CentreAppel.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            CentreAppel.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/CentreAppel.java
*********************************************************************/

