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
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/CentreAppel.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class CentreAppel 
public class CentreAppel implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected police unPolice;		//## link unPolice 
    
    protected Temoin unTemoin;		//## link unTemoin 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int RecoitAppel=1;
    public static final int EnAttente=2;
    public static final int AppelPolice=3;
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
        reactive = new Reactive(p_thread);
    }
    
    //## operation appellePolice() 
    public void appellePolice() {
        //#[ operation appellePolice() 
        System.out.println("Le centre Appel appelle la police");                                 
        new EventAppelPoliceEnCours();
        //#]
    }
    
    //## operation appellePoliceEnCours() 
    public void appellePoliceEnCours() {
        //#[ operation appellePoliceEnCours() 
        System.out.println("l'appel vers la police est en cours...");
        try {
        	TimeUnit.SECONDS.sleep(5);   
        	unPolice.gen (new EventFinAppel());
        	} catch (InterruptedException e) {
        		
        		e.printStackTrace();
        	}
        //#]
    }
    
    //## auto_generated 
    public police getUnPolice() {
        return unPolice;
    }
    
    //## auto_generated 
    public void __setUnPolice(police p_police) {
        unPolice = p_police;
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
        unPolice = null;
    }
    
    //## auto_generated 
    public Temoin getUnTemoin() {
        return unTemoin;
    }
    
    //## auto_generated 
    public void __setUnTemoin(Temoin p_Temoin) {
        unTemoin = p_Temoin;
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
        unTemoin = null;
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
                case EnAttente:
                {
                    res = EnAttente_takeEvent(id);
                }
                break;
                case RecoitAppel:
                {
                    res = RecoitAppel_takeEvent(id);
                }
                break;
                case AppelPolice:
                {
                    res = AppelPolice_takeEvent(id);
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
        public int EnAttente_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventRecoitAppel.EventRecoitAppel_Default_id))
                {
                    res = EnAttenteTakeEventRecoitAppel();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void AppelPoliceEnter() {
        }
        
        //## statechart_method 
        public int EnAttenteTakeEventRecoitAppel() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            EnAttente_exit();
            //#[ transition 2 
            appellePolice();
            //#]
            RecoitAppel_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int AppelPoliceTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            AppelPolice_exit();
            EnAttente_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void AppelPolice_entDef() {
            AppelPolice_enter();
        }
        
        //## statechart_method 
        public void EnAttente_enter() {
            rootState_subState = EnAttente;
            rootState_active = EnAttente;
            EnAttenteEnter();
        }
        
        //## statechart_method 
        public int RecoitAppel_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventAppelPoliceEnCours.EventAppelPoliceEnCours_Default_id))
                {
                    res = RecoitAppelTakeEventAppelPoliceEnCours();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void AppelPolice_exit() {
            popNullConfig();
            AppelPoliceExit();
        }
        
        //## statechart_method 
        public void RecoitAppel_enter() {
            rootState_subState = RecoitAppel;
            rootState_active = RecoitAppel;
            RecoitAppelEnter();
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
        public void AppelPolice_enter() {
            pushNullConfig();
            rootState_subState = AppelPolice;
            rootState_active = AppelPolice;
            AppelPoliceEnter();
        }
        
        //## statechart_method 
        public void EnAttenteEnter() {
        }
        
        //## statechart_method 
        public void RecoitAppel_entDef() {
            RecoitAppel_enter();
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void AppelPoliceExit() {
        }
        
        //## statechart_method 
        public void EnAttente_exit() {
            EnAttenteExit();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            EnAttente_entDef();
        }
        
        //## statechart_method 
        public void RecoitAppelEnter() {
        }
        
        //## statechart_method 
        public int AppelPolice_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = AppelPoliceTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int RecoitAppelTakeEventAppelPoliceEnCours() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            RecoitAppel_exit();
            //#[ transition 3 
            appellePoliceEnCours();
            //#]
            AppelPolice_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void RecoitAppelExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void EnAttenteExit() {
        }
        
        //## statechart_method 
        public void RecoitAppel_exit() {
            RecoitAppelExit();
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/CentreAppel.java
*********************************************************************/

