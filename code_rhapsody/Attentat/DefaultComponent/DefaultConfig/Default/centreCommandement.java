/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: centreCommandement
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/centreCommandement.java
*********************************************************************/

package Default;

//## dependency TimeUnit 
import java.util.concurrent.TimeUnit;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/centreCommandement.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor centreCommandement 
public class centreCommandement implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected GIGN unGIGN;		//## link unGIGN 
    
    protected Place unPlace;		//## link unPlace 
    
    protected police unPolice;		//## link unPolice 
    
    protected Secours unSecours;		//## link unSecours 
    
    protected Temoin unTemoin;		//## link unTemoin 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Reussi=1;
    public static final int PasAction=2;
    public static final int LanceAssaut=3;
    public static final int EnAppel=4;
    public static final int Echec=5;
    public static final int DemandeInformation=6;
    public static final int AnalyseSituation=7;
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
    public  centreCommandement(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
    }
    
    //## operation analyseSituation() 
    public void analyseSituation() {
        //#[ operation analyseSituation() 
        System.out.println("Analyse la situation");
        //#]
    }
    
    //## operation assautEchec() 
    public void assautEchec() {
        //#[ operation assautEchec() 
        System.out.println("Echec de Assaut");
        unGIGN.gen (new EventGIGNMort());
        //#]
    }
    
    //## operation demandeInformation() 
    public void demandeInformation() {
        //#[ operation demandeInformation() 
        unTemoin.gen(new EventCooperation());  
        try {
        		TimeUnit.SECONDS.sleep(2); 
        		unTemoin.gen(new EventFinCooperation());  
        		unPlace.gen(new EventNonSecurisee());
        		unGIGN.gen(new EventEtatAlerte());
        		new EventLanceAssaut();
        	} catch (InterruptedException e) {
        		
        		e.printStackTrace();
        	}
        //#]
    }
    
    //## operation enAppelle() 
    public void enAppelle() {
        //#[ operation enAppelle() 
        //#]
    }
    
    //## operation lanceAssaut() 
    public void lanceAssaut() {
        //#[ operation lanceAssaut() 
        System.out.println("Debut Assaut");
        //#]
    }
    
    //## operation reussi() 
    public void reussi() {
        //#[ operation reussi() 
        unPlace.gen(new EventSecurisee());
        unSecours.gen(new EventEnvoye());
        //#]
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
                unGIGN.__setUnCentreCommandement(null);
            }
        __setUnGIGN(p_GIGN);
    }
    
    //## auto_generated 
    public void setUnGIGN(GIGN p_GIGN) {
        if(p_GIGN != null)
            {
                p_GIGN._setUnCentreCommandement(this);
            }
        _setUnGIGN(p_GIGN);
    }
    
    //## auto_generated 
    public void _clearUnGIGN() {
        unGIGN = null;
    }
    
    //## auto_generated 
    public Place getUnPlace() {
        return unPlace;
    }
    
    //## auto_generated 
    public void __setUnPlace(Place p_Place) {
        unPlace = p_Place;
    }
    
    //## auto_generated 
    public void _setUnPlace(Place p_Place) {
        if(unPlace != null)
            {
                unPlace.__setUnCentreCommandement(null);
            }
        __setUnPlace(p_Place);
    }
    
    //## auto_generated 
    public void setUnPlace(Place p_Place) {
        if(p_Place != null)
            {
                p_Place._setUnCentreCommandement(this);
            }
        _setUnPlace(p_Place);
    }
    
    //## auto_generated 
    public void _clearUnPlace() {
        unPlace = null;
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
                unPolice.__setUnCentreCommandement(null);
            }
        __setUnPolice(p_police);
    }
    
    //## auto_generated 
    public void setUnPolice(police p_police) {
        if(p_police != null)
            {
                p_police._setUnCentreCommandement(this);
            }
        _setUnPolice(p_police);
    }
    
    //## auto_generated 
    public void _clearUnPolice() {
        unPolice = null;
    }
    
    //## auto_generated 
    public Secours getUnSecours() {
        return unSecours;
    }
    
    //## auto_generated 
    public void __setUnSecours(Secours p_Secours) {
        unSecours = p_Secours;
    }
    
    //## auto_generated 
    public void _setUnSecours(Secours p_Secours) {
        if(unSecours != null)
            {
                unSecours.__setUnCentreCommandement(null);
            }
        __setUnSecours(p_Secours);
    }
    
    //## auto_generated 
    public void setUnSecours(Secours p_Secours) {
        if(p_Secours != null)
            {
                p_Secours._setUnCentreCommandement(this);
            }
        _setUnSecours(p_Secours);
    }
    
    //## auto_generated 
    public void _clearUnSecours() {
        unSecours = null;
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
                unTemoin.__setUnCentreCommandement(null);
            }
        __setUnTemoin(p_Temoin);
    }
    
    //## auto_generated 
    public void setUnTemoin(Temoin p_Temoin) {
        if(p_Temoin != null)
            {
                p_Temoin._setUnCentreCommandement(this);
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
                case PasAction:
                {
                    res = PasAction_takeEvent(id);
                }
                break;
                case EnAppel:
                {
                    res = EnAppel_takeEvent(id);
                }
                break;
                case AnalyseSituation:
                {
                    res = AnalyseSituation_takeEvent(id);
                }
                break;
                case DemandeInformation:
                {
                    res = DemandeInformation_takeEvent(id);
                }
                break;
                case LanceAssaut:
                {
                    res = LanceAssaut_takeEvent(id);
                }
                break;
                case Echec:
                {
                    res = Echec_takeEvent(id);
                }
                break;
                case Reussi:
                {
                    res = Reussi_takeEvent(id);
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
        public int AnalyseSituationTakeEventDemandeInformation() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            AnalyseSituation_exit();
            //#[ transition 3 
            demandeInformation();
            //#]
            DemandeInformation_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void DemandeInformationExit() {
        }
        
        //## statechart_method 
        public void ReussiEnter() {
        }
        
        //## statechart_method 
        public void EnAppelEnter() {
        }
        
        //## statechart_method 
        public void Echec_enter() {
            rootState_subState = Echec;
            rootState_active = Echec;
            EchecEnter();
        }
        
        //## statechart_method 
        public void LanceAssautExit() {
        }
        
        //## statechart_method 
        public void LanceAssaut_enter() {
            rootState_subState = LanceAssaut;
            rootState_active = LanceAssaut;
            LanceAssautEnter();
        }
        
        //## statechart_method 
        public void LanceAssautEnter() {
        }
        
        //## statechart_method 
        public void PasActionExit() {
        }
        
        //## statechart_method 
        public void ReussiExit() {
        }
        
        //## statechart_method 
        public void EchecExit() {
        }
        
        //## statechart_method 
        public int EnAppelTakeEventAnalyseSituation() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            EnAppel_exit();
            //#[ transition 2 
            analyseSituation();
            //#]
            AnalyseSituation_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnAppel_enter() {
            rootState_subState = EnAppel;
            rootState_active = EnAppel;
            EnAppelEnter();
        }
        
        //## statechart_method 
        public int LanceAssautTakeEventReussi() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            LanceAssaut_exit();
            //#[ transition 6 
            reussi();
            //#]
            Reussi_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Reussi_exit() {
            ReussiExit();
        }
        
        //## statechart_method 
        public void Reussi_enter() {
            rootState_subState = Reussi;
            rootState_active = Reussi;
            ReussiEnter();
        }
        
        //## statechart_method 
        public void EnAppel_exit() {
            EnAppelExit();
        }
        
        //## statechart_method 
        public int PasAction_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventRecoitAppel.EventRecoitAppel_Default_id))
                {
                    res = PasActionTakeEventRecoitAppel();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void AnalyseSituation_entDef() {
            AnalyseSituation_enter();
        }
        
        //## statechart_method 
        public void DemandeInformation_entDef() {
            DemandeInformation_enter();
        }
        
        //## statechart_method 
        public void EnAppelExit() {
        }
        
        //## statechart_method 
        public void LanceAssaut_exit() {
            LanceAssautExit();
        }
        
        //## statechart_method 
        public int PasActionTakeEventRecoitAppel() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            PasAction_exit();
            //#[ transition 1 
            enAppelle();
            //#]
            EnAppel_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Echec_entDef() {
            Echec_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int AnalyseSituation_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventDemandeInformation.EventDemandeInformation_Default_id))
                {
                    res = AnalyseSituationTakeEventDemandeInformation();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void AnalyseSituationExit() {
        }
        
        //## statechart_method 
        public int Echec_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int LanceAssaut_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventReussi.EventReussi_Default_id))
                {
                    res = LanceAssautTakeEventReussi();
                }
            else if(event.isTypeOf(EventEchec.EventEchec_Default_id))
                {
                    res = LanceAssautTakeEventEchec();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int LanceAssautTakeEventEchec() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            LanceAssaut_exit();
            Echec_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void LanceAssaut_entDef() {
            LanceAssaut_enter();
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public int DemandeInformationTakeEventLanceAssaut() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            DemandeInformation_exit();
            //#[ transition 4 
            lanceAssaut();
            //#]
            LanceAssaut_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnAppel_entDef() {
            EnAppel_enter();
        }
        
        //## statechart_method 
        public void Reussi_entDef() {
            Reussi_enter();
        }
        
        //## statechart_method 
        public int DemandeInformation_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventLanceAssaut.EventLanceAssaut_Default_id))
                {
                    res = DemandeInformationTakeEventLanceAssaut();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void DemandeInformationEnter() {
        }
        
        //## statechart_method 
        public void AnalyseSituationEnter() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            PasAction_entDef();
        }
        
        //## statechart_method 
        public void PasActionEnter() {
        }
        
        //## statechart_method 
        public void DemandeInformation_exit() {
            DemandeInformationExit();
        }
        
        //## statechart_method 
        public void EchecEnter() {
        }
        
        //## statechart_method 
        public int EnAppel_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventAnalyseSituation.EventAnalyseSituation_Default_id))
                {
                    res = EnAppelTakeEventAnalyseSituation();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void PasAction_enter() {
            rootState_subState = PasAction;
            rootState_active = PasAction;
            PasActionEnter();
        }
        
        //## statechart_method 
        public void PasAction_entDef() {
            PasAction_enter();
        }
        
        //## statechart_method 
        public int Reussi_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void AnalyseSituation_exit() {
            AnalyseSituationExit();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void AnalyseSituation_enter() {
            rootState_subState = AnalyseSituation;
            rootState_active = AnalyseSituation;
            AnalyseSituationEnter();
        }
        
        //## statechart_method 
        public void PasAction_exit() {
            PasActionExit();
        }
        
        //## statechart_method 
        public void DemandeInformation_enter() {
            rootState_subState = DemandeInformation;
            rootState_active = DemandeInformation;
            DemandeInformationEnter();
        }
        
        //## statechart_method 
        public void Echec_exit() {
            EchecExit();
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/centreCommandement.java
*********************************************************************/

