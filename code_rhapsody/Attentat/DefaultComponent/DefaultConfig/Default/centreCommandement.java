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
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

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
public class centreCommandement implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClasscentreCommandement = new AnimClass("Default.centreCommandement",false);
    //#]
    
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
    public static final int FinAppelPolice=4;
    public static final int Echec=5;
    public static final int DemandeInformation=6;
    public static final int DebutAppelPolice=7;
    public static final int AnalyseSituation=8;
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
        try {
            animInstance().notifyConstructorEntered(animClasscentreCommandement.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation analyseSituation() 
    public void analyseSituation() {
        try {
            animInstance().notifyMethodEntered("analyseSituation",
               new ArgData[] {
               });
        
        //#[ operation analyseSituation() 
        System.out.println("Analyse la situation");   
        this.gen(new EventDemandeInformation());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation assautEchec() 
    public void assautEchec() {
        try {
            animInstance().notifyMethodEntered("assautEchec",
               new ArgData[] {
               });
        
        //#[ operation assautEchec() 
        System.out.println("Echec de Assaut");
        unGIGN.gen (new EventGIGNMort());
        //#]
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
        System.out.println("debut appel entre police et centre commandement");
        try {
        		TimeUnit.SECONDS.sleep(5);
        		this.gen(new EventFinAppelPolice());
        		unPolice.gen( new EventFinAppelCentreCommandement());
        	} catch (InterruptedException e) {
        		
        		e.printStackTrace();
        	}
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation demandeInformation() 
    public void demandeInformation() {
        try {
            animInstance().notifyMethodEntered("demandeInformation",
               new ArgData[] {
               });
        
        //#[ operation demandeInformation() 
        unTemoin.gen(new EventCooperation());  
        try {
        		TimeUnit.SECONDS.sleep(2); 
        		unTemoin.gen(new EventFinCooperation());  
        		unPlace.gen(new EventNonSecurisee());
        		unGIGN.gen(new EventEtatAlerte()); 
        		unSecours.gen(new EventEtatAlerte());
        		this.gen(new EventLanceAssaut());
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
        System.out.println("fin appel entre police et centre commandement");
        this.gen(new EventAnalyseSituation());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation lanceAssaut() 
    public void lanceAssaut() {
        try {
            animInstance().notifyMethodEntered("lanceAssaut",
               new ArgData[] {
               });
        
        //#[ operation lanceAssaut() 
        System.out.println("Debut Assaut"); 
        unGIGN.gen(new EventEnCoursAssaut());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation reussi() 
    public void reussi() {
        try {
            animInstance().notifyMethodEntered("reussi",
               new ArgData[] {
               });
        
        //#[ operation reussi() 
        unPlace.gen(new EventSecurisee());
        unSecours.gen(new EventEnvoye());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public GIGN getUnGIGN() {
        return unGIGN;
    }
    
    //## auto_generated 
    public void __setUnGIGN(GIGN p_GIGN) {
        unGIGN = p_GIGN;
        if(p_GIGN != null)
            {
                animInstance().notifyRelationAdded("unGIGN", p_GIGN);
            }
        else
            {
                animInstance().notifyRelationCleared("unGIGN");
            }
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
        animInstance().notifyRelationCleared("unGIGN");
        unGIGN = null;
    }
    
    //## auto_generated 
    public Place getUnPlace() {
        return unPlace;
    }
    
    //## auto_generated 
    public void __setUnPlace(Place p_Place) {
        unPlace = p_Place;
        if(p_Place != null)
            {
                animInstance().notifyRelationAdded("unPlace", p_Place);
            }
        else
            {
                animInstance().notifyRelationCleared("unPlace");
            }
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
        animInstance().notifyRelationCleared("unPlace");
        unPlace = null;
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
        animInstance().notifyRelationCleared("unPolice");
        unPolice = null;
    }
    
    //## auto_generated 
    public Secours getUnSecours() {
        return unSecours;
    }
    
    //## auto_generated 
    public void __setUnSecours(Secours p_Secours) {
        unSecours = p_Secours;
        if(p_Secours != null)
            {
                animInstance().notifyRelationAdded("unSecours", p_Secours);
            }
        else
            {
                animInstance().notifyRelationCleared("unSecours");
            }
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
        animInstance().notifyRelationCleared("unSecours");
        unSecours = null;
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
                case PasAction:
                {
                    PasAction_add(animStates);
                }
                break;
                case DebutAppelPolice:
                {
                    DebutAppelPolice_add(animStates);
                }
                break;
                case AnalyseSituation:
                {
                    AnalyseSituation_add(animStates);
                }
                break;
                case DemandeInformation:
                {
                    DemandeInformation_add(animStates);
                }
                break;
                case LanceAssaut:
                {
                    LanceAssaut_add(animStates);
                }
                break;
                case Echec:
                {
                    Echec_add(animStates);
                }
                break;
                case Reussi:
                {
                    Reussi_add(animStates);
                }
                break;
                case FinAppelPolice:
                {
                    FinAppelPolice_add(animStates);
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
                case PasAction:
                {
                    res = PasAction_takeEvent(id);
                }
                break;
                case DebutAppelPolice:
                {
                    res = DebutAppelPolice_takeEvent(id);
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
                case FinAppelPolice:
                {
                    res = FinAppelPolice_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Reussi_add(AnimStates animStates) {
            animStates.add("ROOT.Reussi");
        }
        
        //## statechart_method 
        public void PasAction_add(AnimStates animStates) {
            animStates.add("ROOT.PasAction");
        }
        
        //## statechart_method 
        public void LanceAssaut_add(AnimStates animStates) {
            animStates.add("ROOT.LanceAssaut");
        }
        
        //## statechart_method 
        public void FinAppelPolice_add(AnimStates animStates) {
            animStates.add("ROOT.FinAppelPolice");
        }
        
        //## statechart_method 
        public void Echec_add(AnimStates animStates) {
            animStates.add("ROOT.Echec");
        }
        
        //## statechart_method 
        public void DemandeInformation_add(AnimStates animStates) {
            animStates.add("ROOT.DemandeInformation");
        }
        
        //## statechart_method 
        public void DebutAppelPolice_add(AnimStates animStates) {
            animStates.add("ROOT.DebutAppelPolice");
        }
        
        //## statechart_method 
        public void AnalyseSituation_add(AnimStates animStates) {
            animStates.add("ROOT.AnalyseSituation");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int AnalyseSituationTakeEventDemandeInformation() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            AnalyseSituation_exit();
            //#[ transition 2 
            demandeInformation();
            //#]
            DemandeInformation_entDef();
            animInstance().notifyTransitionEnded("2");
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
        public int FinAppelPoliceTakeEventAnalyseSituation() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            FinAppelPolice_exit();
            //#[ transition 7 
            analyseSituation();
            //#]
            AnalyseSituation_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void FinAppelPolice_entDef() {
            FinAppelPolice_enter();
        }
        
        //## statechart_method 
        public void Echec_enter() {
            animInstance().notifyStateEntered("ROOT.Echec");
            rootState_subState = Echec;
            rootState_active = Echec;
            EchecEnter();
        }
        
        //## statechart_method 
        public void FinAppelPoliceEnter() {
        }
        
        //## statechart_method 
        public void LanceAssautExit() {
        }
        
        //## statechart_method 
        public void LanceAssaut_enter() {
            animInstance().notifyStateEntered("ROOT.LanceAssaut");
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
        public int DebutAppelPoliceTakeEventFinAppelPolice() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            DebutAppelPolice_exit();
            //#[ transition 6 
            finAppelPolice();
            //#]
            FinAppelPolice_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void DebutAppelPolice_entDef() {
            DebutAppelPolice_enter();
        }
        
        //## statechart_method 
        public void EchecExit() {
        }
        
        //## statechart_method 
        public void FinAppelPolice_enter() {
            animInstance().notifyStateEntered("ROOT.FinAppelPolice");
            rootState_subState = FinAppelPolice;
            rootState_active = FinAppelPolice;
            FinAppelPoliceEnter();
        }
        
        //## statechart_method 
        public int LanceAssautTakeEventReussi() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            LanceAssaut_exit();
            //#[ transition 5 
            reussi();
            //#]
            Reussi_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Reussi_exit() {
            ReussiExit();
            animInstance().notifyStateExited("ROOT.Reussi");
        }
        
        //## statechart_method 
        public void Reussi_enter() {
            animInstance().notifyStateEntered("ROOT.Reussi");
            rootState_subState = Reussi;
            rootState_active = Reussi;
            ReussiEnter();
        }
        
        //## statechart_method 
        public int PasAction_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventDebutAppelPolice.EventDebutAppelPolice_Default_id))
                {
                    res = PasActionTakeEventDebutAppelPolice();
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
        public void FinAppelPolice_exit() {
            FinAppelPoliceExit();
            animInstance().notifyStateExited("ROOT.FinAppelPolice");
        }
        
        //## statechart_method 
        public void LanceAssaut_exit() {
            LanceAssautExit();
            animInstance().notifyStateExited("ROOT.LanceAssaut");
        }
        
        //## statechart_method 
        public void Echec_entDef() {
            Echec_enter();
        }
        
        //## statechart_method 
        public void FinAppelPoliceExit() {
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
        public void DebutAppelPoliceEnter() {
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
            animInstance().notifyTransitionStarted("4");
            LanceAssaut_exit();
            Echec_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void LanceAssaut_entDef() {
            LanceAssaut_enter();
        }
        
        //## statechart_method 
        public int PasActionTakeEventDebutAppelPolice() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            PasAction_exit();
            //#[ transition 1 
            debutAppelPolice();
            //#]
            DebutAppelPolice_entDef();
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
        public int DebutAppelPolice_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventFinAppelPolice.EventFinAppelPolice_Default_id))
                {
                    res = DebutAppelPoliceTakeEventFinAppelPolice();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int DemandeInformationTakeEventLanceAssaut() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            DemandeInformation_exit();
            //#[ transition 3 
            lanceAssaut();
            //#]
            LanceAssaut_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int FinAppelPolice_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventAnalyseSituation.EventAnalyseSituation_Default_id))
                {
                    res = FinAppelPoliceTakeEventAnalyseSituation();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Reussi_entDef() {
            Reussi_enter();
        }
        
        //## statechart_method 
        public void DebutAppelPoliceExit() {
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
        public void DebutAppelPolice_exit() {
            DebutAppelPoliceExit();
            animInstance().notifyStateExited("ROOT.DebutAppelPolice");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            PasAction_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void PasActionEnter() {
        }
        
        //## statechart_method 
        public void DebutAppelPolice_enter() {
            animInstance().notifyStateEntered("ROOT.DebutAppelPolice");
            rootState_subState = DebutAppelPolice;
            rootState_active = DebutAppelPolice;
            DebutAppelPoliceEnter();
        }
        
        //## statechart_method 
        public void DemandeInformation_exit() {
            DemandeInformationExit();
            animInstance().notifyStateExited("ROOT.DemandeInformation");
        }
        
        //## statechart_method 
        public void EchecEnter() {
        }
        
        //## statechart_method 
        public void PasAction_enter() {
            animInstance().notifyStateEntered("ROOT.PasAction");
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
            animInstance().notifyStateExited("ROOT.AnalyseSituation");
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void AnalyseSituation_enter() {
            animInstance().notifyStateEntered("ROOT.AnalyseSituation");
            rootState_subState = AnalyseSituation;
            rootState_active = AnalyseSituation;
            AnalyseSituationEnter();
        }
        
        //## statechart_method 
        public void PasAction_exit() {
            PasActionExit();
            animInstance().notifyStateExited("ROOT.PasAction");
        }
        
        //## statechart_method 
        public void DemandeInformation_enter() {
            animInstance().notifyStateEntered("ROOT.DemandeInformation");
            rootState_subState = DemandeInformation;
            rootState_active = DemandeInformation;
            DemandeInformationEnter();
        }
        
        //## statechart_method 
        public void Echec_exit() {
            EchecExit();
            animInstance().notifyStateExited("ROOT.Echec");
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
            return centreCommandement.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClasscentreCommandement; 
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
        
        msg.add("unPolice", false, true, unPolice);
        msg.add("unGIGN", false, true, unGIGN);
        msg.add("unTemoin", false, true, unTemoin);
        msg.add("unPlace", false, true, unPlace);
        msg.add("unSecours", false, true, unSecours);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(centreCommandement.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            centreCommandement.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            centreCommandement.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/centreCommandement.java
*********************************************************************/

