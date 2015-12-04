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
import com.ibm.rational.rhapsody.oxf.states.*;

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
public class police implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected CentreAppel unCentreAppel;		//## link unCentreAppel 
    
    protected centreCommandement unCentreCommandement;		//## link unCentreCommandement 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int RecoitAppel=1;
    public static final int FinAppel=2;
    public static final int EnAttente=3;
    public static final int AppelCentreCommandement=4;
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
        reactive = new Reactive(p_thread);
    }
    
    //## operation appelleCentreCommandement() 
    public void appelleCentreCommandement() {
        //#[ operation appelleCentreCommandement() 
        System.out.println("Appel vers le centre de commandement");     
        unCentreCommandement.gen(new EventRecoitAppel());   
        try {
        		TimeUnit.SECONDS.sleep(5);  
        		unCentreCommandement.gen(new EventAnalyseSituation());
        		new EventEnAttente();
        	} catch (InterruptedException e) {
        		
        		e.printStackTrace();
        	}
        
        //#]
    }
    
    //## operation finAppel() 
    public void finAppel() {
        //#[ operation finAppel() 
        System.out.println("appel avec le centre Appel finit");
        new EventAppelleCentreCommandement();
        //#]
    }
    
    //## auto_generated 
    public CentreAppel getUnCentreAppel() {
        return unCentreAppel;
    }
    
    //## auto_generated 
    public void __setUnCentreAppel(CentreAppel p_CentreAppel) {
        unCentreAppel = p_CentreAppel;
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
        unCentreAppel = null;
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
        unCentreCommandement = null;
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
                case AppelCentreCommandement:
                {
                    res = AppelCentreCommandement_takeEvent(id);
                }
                break;
                case FinAppel:
                {
                    res = FinAppel_takeEvent(id);
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
        public void AppelCentreCommandement_enter() {
            rootState_subState = AppelCentreCommandement;
            rootState_active = AppelCentreCommandement;
            AppelCentreCommandementEnter();
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
        public int AppelCentreCommandementTakeEventEnAttente() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            AppelCentreCommandement_exit();
            EnAttente_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void AppelCentreCommandement_exit() {
            AppelCentreCommandementExit();
        }
        
        //## statechart_method 
        public int EnAttenteTakeEventRecoitAppel() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            EnAttente_exit();
            RecoitAppel_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
            if(event.isTypeOf(EventFinAppel.EventFinAppel_Default_id))
                {
                    res = RecoitAppelTakeEventFinAppel();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int RecoitAppelTakeEventFinAppel() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            RecoitAppel_exit();
            //#[ transition 4 
            finAppel();
            //#]
            FinAppel_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
        public void EnAttenteEnter() {
        }
        
        //## statechart_method 
        public void FinAppelExit() {
        }
        
        //## statechart_method 
        public void FinAppel_enter() {
            rootState_subState = FinAppel;
            rootState_active = FinAppel;
            FinAppelEnter();
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
        public void EnAttente_exit() {
            EnAttenteExit();
        }
        
        //## statechart_method 
        public int FinAppel_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventAppelleCentreCommandement.EventAppelleCentreCommandement_Default_id))
                {
                    res = FinAppelTakeEventAppelleCentreCommandement();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void FinAppel_entDef() {
            FinAppel_enter();
        }
        
        //## statechart_method 
        public void AppelCentreCommandementExit() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            EnAttente_entDef();
        }
        
        //## statechart_method 
        public void FinAppelEnter() {
        }
        
        //## statechart_method 
        public void RecoitAppelEnter() {
        }
        
        //## statechart_method 
        public int AppelCentreCommandement_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEnAttente.EventEnAttente_Default_id))
                {
                    res = AppelCentreCommandementTakeEventEnAttente();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void AppelCentreCommandement_entDef() {
            AppelCentreCommandement_enter();
        }
        
        //## statechart_method 
        public void RecoitAppelExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void AppelCentreCommandementEnter() {
        }
        
        //## statechart_method 
        public void EnAttenteExit() {
        }
        
        //## statechart_method 
        public int FinAppelTakeEventAppelleCentreCommandement() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            FinAppel_exit();
            //#[ transition 3 
            appelleCentreCommandement();
            //#]
            AppelCentreCommandement_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void FinAppel_exit() {
            FinAppelExit();
        }
        
        //## statechart_method 
        public void RecoitAppel_exit() {
            RecoitAppelExit();
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/police.java
*********************************************************************/

