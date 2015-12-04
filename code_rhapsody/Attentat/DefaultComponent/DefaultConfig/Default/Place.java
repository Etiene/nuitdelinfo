/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Place
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Place.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/Place.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Place 
public class Place implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected centreCommandement unCentreCommandement;		//## link unCentreCommandement 
    
    protected GIGN unGIGN;		//## link unGIGN 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Securisee=1;
    public static final int NonSecurisee=2;
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
    public  Place(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
    }
    
    //## operation nonSecurisee() 
    public void nonSecurisee() {
        //#[ operation nonSecurisee() 
        System.out.println("la place est pas securisee");
        //#]
    }
    
    //## operation securisee() 
    public void securisee() {
        //#[ operation securisee() 
        System.out.println("la place est securisee");
        //#]
    }
    
    //## auto_generated 
    public centreCommandement getUnCentreCommandement() {
        return unCentreCommandement;
    }
    
    //## auto_generated 
    public void __setUnCentreCommandement(centreCommandement p_centreCommandement) {
        unCentreCommandement = p_centreCommandement;
    }
    
    //## auto_generated 
    public void _setUnCentreCommandement(centreCommandement p_centreCommandement) {
        if(unCentreCommandement != null)
            {
                unCentreCommandement.__setUnPlace(null);
            }
        __setUnCentreCommandement(p_centreCommandement);
    }
    
    //## auto_generated 
    public void setUnCentreCommandement(centreCommandement p_centreCommandement) {
        if(p_centreCommandement != null)
            {
                p_centreCommandement._setUnPlace(this);
            }
        _setUnCentreCommandement(p_centreCommandement);
    }
    
    //## auto_generated 
    public void _clearUnCentreCommandement() {
        unCentreCommandement = null;
    }
    
    //## auto_generated 
    public GIGN getUnGIGN() {
        return unGIGN;
    }
    
    //## auto_generated 
    public void __setUnGIGN(GIGN p_GIGN) {
        unGIGN = p_GIGN;
    }
    
    //## auto_generated 
    public void _setUnGIGN(GIGN p_GIGN) {
        if(unGIGN != null)
            {
                unGIGN.__setUnPlace(null);
            }
        __setUnGIGN(p_GIGN);
    }
    
    //## auto_generated 
    public void setUnGIGN(GIGN p_GIGN) {
        if(p_GIGN != null)
            {
                p_GIGN._setUnPlace(this);
            }
        _setUnGIGN(p_GIGN);
    }
    
    //## auto_generated 
    public void _clearUnGIGN() {
        unGIGN = null;
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive {
        
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
                case Securisee:
                {
                    res = Securisee_takeEvent(id);
                }
                break;
                case NonSecurisee:
                {
                    res = NonSecurisee_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int NonSecuriseeTakeEventSecurisee() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            NonSecurisee_exit();
            //#[ transition 2 
            securisee();
            //#]
            Securisee_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void NonSecurisee_enter() {
            rootState_subState = NonSecurisee;
            rootState_active = NonSecurisee;
            NonSecuriseeEnter();
        }
        
        //## statechart_method 
        public void SecuriseeEnter() {
        }
        
        //## statechart_method 
        public int NonSecurisee_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventSecurisee.EventSecurisee_Default_id))
                {
                    res = NonSecuriseeTakeEventSecurisee();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void SecuriseeExit() {
        }
        
        //## statechart_method 
        public void Securisee_exit() {
            SecuriseeExit();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void NonSecuriseeEnter() {
        }
        
        //## statechart_method 
        public int Securisee_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventNonSecurisee.EventNonSecurisee_Default_id))
                {
                    res = SecuriseeTakeEventNonSecurisee();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void NonSecurisee_entDef() {
            NonSecurisee_enter();
        }
        
        //## statechart_method 
        public void NonSecurisee_exit() {
            NonSecuriseeExit();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            Securisee_entDef();
        }
        
        //## statechart_method 
        public void Securisee_enter() {
            rootState_subState = Securisee;
            rootState_active = Securisee;
            SecuriseeEnter();
        }
        
        //## statechart_method 
        public void Securisee_entDef() {
            Securisee_enter();
        }
        
        //## statechart_method 
        public int SecuriseeTakeEventNonSecurisee() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Securisee_exit();
            //#[ transition 1 
            nonSecurisee();
            //#]
            NonSecurisee_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void NonSecuriseeExit() {
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Place.java
*********************************************************************/

