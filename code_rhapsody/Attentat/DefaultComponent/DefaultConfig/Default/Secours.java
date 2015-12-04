/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Secours
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Secours.java
*********************************************************************/

package Default;

//## dependency TimeUnit 
import java.util.concurrent.TimeUnit;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/Secours.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor Secours 
public class Secours implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected centreCommandement unCentreCommandement;		//## link unCentreCommandement 
    
    protected Victime unVictime;		//## link unVictime 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Soigne=1;
    public static final int FinMission=2;
    public static final int EtatNormal=3;
    public static final int EtatAlerte=4;
    public static final int Envoye=5;
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
    public  Secours(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
    }
    
    //## operation envoye() 
    public void envoye() {
        //#[ operation envoye() 
        System.out.println("Secours envoye");  
        new EventSoigne();
        //#]
    }
    
    //## operation etatAlerte() 
    public void etatAlerte() {
        //#[ operation etatAlerte() 
        System.out.println("Secours en etat alerte");
        //#]
    }
    
    //## operation finMission() 
    public void finMission() {
        //#[ operation finMission() 
        System.out.println("fin des secours");
        //#]
    }
    
    //## operation soigne() 
    public void soigne() {
        //#[ operation soigne() 
        unVictime.gen(new EventVictimeSecouru());   
          try {
        		TimeUnit.SECONDS.sleep(5); 
        		unVictime.gen(new EventVictimeSurvie());
        		new EventFinMission();
        	} catch (InterruptedException e) {
        		
        		e.printStackTrace();
        	}
        
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
                unCentreCommandement.__setUnSecours(null);
            }
        __setUnCentreCommandement(p_centreCommandement);
    }
    
    //## auto_generated 
    public void setUnCentreCommandement(centreCommandement p_centreCommandement) {
        if(p_centreCommandement != null)
            {
                p_centreCommandement._setUnSecours(this);
            }
        _setUnCentreCommandement(p_centreCommandement);
    }
    
    //## auto_generated 
    public void _clearUnCentreCommandement() {
        unCentreCommandement = null;
    }
    
    //## auto_generated 
    public Victime getUnVictime() {
        return unVictime;
    }
    
    //## auto_generated 
    public void __setUnVictime(Victime p_Victime) {
        unVictime = p_Victime;
    }
    
    //## auto_generated 
    public void _setUnVictime(Victime p_Victime) {
        if(unVictime != null)
            {
                unVictime.__setUnSecours(null);
            }
        __setUnVictime(p_Victime);
    }
    
    //## auto_generated 
    public void setUnVictime(Victime p_Victime) {
        if(p_Victime != null)
            {
                p_Victime._setUnSecours(this);
            }
        _setUnVictime(p_Victime);
    }
    
    //## auto_generated 
    public void _clearUnVictime() {
        unVictime = null;
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
                case EtatNormal:
                {
                    res = EtatNormal_takeEvent(id);
                }
                break;
                case EtatAlerte:
                {
                    res = EtatAlerte_takeEvent(id);
                }
                break;
                case Envoye:
                {
                    res = Envoye_takeEvent(id);
                }
                break;
                case Soigne:
                {
                    res = Soigne_takeEvent(id);
                }
                break;
                case FinMission:
                {
                    res = FinMission_takeEvent(id);
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
        public int EtatAlerte_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEnvoye.EventEnvoye_Default_id))
                {
                    res = EtatAlerteTakeEventEnvoye();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void FinMission_exit() {
            FinMissionExit();
        }
        
        //## statechart_method 
        public void Soigne_exit() {
            SoigneExit();
        }
        
        //## statechart_method 
        public void EnvoyeExit() {
        }
        
        //## statechart_method 
        public void FinMission_enter() {
            rootState_subState = FinMission;
            rootState_active = FinMission;
            FinMissionEnter();
        }
        
        //## statechart_method 
        public void EtatAlerte_enter() {
            rootState_subState = EtatAlerte;
            rootState_active = EtatAlerte;
            EtatAlerteEnter();
        }
        
        //## statechart_method 
        public int EtatNormalTakeEventEtateAlerte() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            EtatNormal_exit();
            //#[ transition 1 
             etatAlerte();
            //#]
            EtatAlerte_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EtatNormal_enter() {
            rootState_subState = EtatNormal;
            rootState_active = EtatNormal;
            EtatNormalEnter();
        }
        
        //## statechart_method 
        public void Soigne_enter() {
            rootState_subState = Soigne;
            rootState_active = Soigne;
            SoigneEnter();
        }
        
        //## statechart_method 
        public void EtatAlerteEnter() {
        }
        
        //## statechart_method 
        public void EtatNormalEnter() {
        }
        
        //## statechart_method 
        public int Soigne_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventFinMission.EventFinMission_Default_id))
                {
                    res = SoigneTakeEventFinMission();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void EtatNormal_entDef() {
            EtatNormal_enter();
        }
        
        //## statechart_method 
        public int FinMission_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int EtatAlerteTakeEventEnvoye() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            EtatAlerte_exit();
            //#[ transition 2 
            envoye();
            //#]
            Envoye_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EtatAlerteExit() {
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void EtatAlerte_exit() {
            EtatAlerteExit();
        }
        
        //## statechart_method 
        public void EtatAlerte_entDef() {
            EtatAlerte_enter();
        }
        
        //## statechart_method 
        public void EtatNormal_exit() {
            EtatNormalExit();
        }
        
        //## statechart_method 
        public int SoigneTakeEventFinMission() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Soigne_exit();
            //#[ transition 4 
            finMission();
            //#]
            FinMission_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
        public void EtatNormalExit() {
        }
        
        //## statechart_method 
        public void Envoye_entDef() {
            Envoye_enter();
        }
        
        //## statechart_method 
        public void FinMission_entDef() {
            FinMission_enter();
        }
        
        //## statechart_method 
        public void SoigneExit() {
        }
        
        //## statechart_method 
        public void Soigne_entDef() {
            Soigne_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            EtatNormal_entDef();
        }
        
        //## statechart_method 
        public void Envoye_enter() {
            rootState_subState = Envoye;
            rootState_active = Envoye;
            EnvoyeEnter();
        }
        
        //## statechart_method 
        public void EnvoyeEnter() {
        }
        
        //## statechart_method 
        public int EtatNormal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEtateAlerte.EventEtateAlerte_Default_id))
                {
                    res = EtatNormalTakeEventEtateAlerte();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int EnvoyeTakeEventSoigne() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Envoye_exit();
            //#[ transition 3 
            soigne();
            //#]
            Soigne_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void FinMissionExit() {
        }
        
        //## statechart_method 
        public void FinMissionEnter() {
        }
        
        //## statechart_method 
        public void SoigneEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int Envoye_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventSoigne.EventSoigne_Default_id))
                {
                    res = EnvoyeTakeEventSoigne();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Envoye_exit() {
            EnvoyeExit();
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Secours.java
*********************************************************************/

