/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: GIGN
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/GIGN.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/GIGN.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor GIGN 
public class GIGN implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected centreCommandement unCentreCommandement;		//## link unCentreCommandement 
    
    protected otage unOtage;		//## link unOtage 
    
    protected Place unPlace;		//## link unPlace 
    
    protected Terroriste unTerroriste;		//## link unTerroriste 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Mort=1;
    public static final int EtatNormal=2;
    public static final int EtatAlerte=3;
    public static final int EnCoursAssaut=4;
    public static final int AssautReussi=5;
    public static final int AssautEchec=6;
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
    public  GIGN(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
    }
    
    //## operation assautEchec() 
    public void assautEchec() {
        //#[ operation assautEchec() 
        System.out.println("echec de l'assaut");
        new EventGIGNMort();  
        unTerroriste.gen(new EventSeFaitExploser());
        //#]
    }
    
    //## operation assautReussi() 
    public void assautReussi() {
        //#[ operation assautReussi() 
        System.out.println("Assaut du GIGN reussi"); 
        unTerroriste.gen (new EventTerroristeNeutralise());
        unCentreCommandement.gen( new EventReussi());  
        unOtage.gen(new EventLibre());
        //#]
    }
    
    //## operation enCoursAssaut() 
    public void enCoursAssaut() {
        //#[ operation enCoursAssaut() 
        System.out.println("Le GIGN est en cours assaut");
        //#]
    }
    
    //## operation etatAlerte() 
    public void etatAlerte() {
        //#[ operation etatAlerte() 
        System.out.println("GIGN en etat alerte");
        //#]
    }
    
    //## operation gignMort() 
    public void gignMort() {
        //#[ operation gignMort() 
        System.out.println("le gign est mort");
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
                unCentreCommandement.__setUnGIGN(null);
            }
        __setUnCentreCommandement(p_centreCommandement);
    }
    
    //## auto_generated 
    public void setUnCentreCommandement(centreCommandement p_centreCommandement) {
        if(p_centreCommandement != null)
            {
                p_centreCommandement._setUnGIGN(this);
            }
        _setUnCentreCommandement(p_centreCommandement);
    }
    
    //## auto_generated 
    public void _clearUnCentreCommandement() {
        unCentreCommandement = null;
    }
    
    //## auto_generated 
    public otage getUnOtage() {
        return unOtage;
    }
    
    //## auto_generated 
    public void __setUnOtage(otage p_otage) {
        unOtage = p_otage;
    }
    
    //## auto_generated 
    public void _setUnOtage(otage p_otage) {
        if(unOtage != null)
            {
                unOtage.__setUnGIGN(null);
            }
        __setUnOtage(p_otage);
    }
    
    //## auto_generated 
    public void setUnOtage(otage p_otage) {
        if(p_otage != null)
            {
                p_otage._setUnGIGN(this);
            }
        _setUnOtage(p_otage);
    }
    
    //## auto_generated 
    public void _clearUnOtage() {
        unOtage = null;
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
                unPlace.__setUnGIGN(null);
            }
        __setUnPlace(p_Place);
    }
    
    //## auto_generated 
    public void setUnPlace(Place p_Place) {
        if(p_Place != null)
            {
                p_Place._setUnGIGN(this);
            }
        _setUnPlace(p_Place);
    }
    
    //## auto_generated 
    public void _clearUnPlace() {
        unPlace = null;
    }
    
    //## auto_generated 
    public Terroriste getUnTerroriste() {
        return unTerroriste;
    }
    
    //## auto_generated 
    public void __setUnTerroriste(Terroriste p_Terroriste) {
        unTerroriste = p_Terroriste;
    }
    
    //## auto_generated 
    public void _setUnTerroriste(Terroriste p_Terroriste) {
        if(unTerroriste != null)
            {
                unTerroriste.__setUnGIGN(null);
            }
        __setUnTerroriste(p_Terroriste);
    }
    
    //## auto_generated 
    public void setUnTerroriste(Terroriste p_Terroriste) {
        if(p_Terroriste != null)
            {
                p_Terroriste._setUnGIGN(this);
            }
        _setUnTerroriste(p_Terroriste);
    }
    
    //## auto_generated 
    public void _clearUnTerroriste() {
        unTerroriste = null;
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
                case EnCoursAssaut:
                {
                    res = EnCoursAssaut_takeEvent(id);
                }
                break;
                case AssautEchec:
                {
                    res = AssautEchec_takeEvent(id);
                }
                break;
                case AssautReussi:
                {
                    res = AssautReussi_takeEvent(id);
                }
                break;
                case Mort:
                {
                    res = Mort_takeEvent(id);
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
            if(event.isTypeOf(EventEnCoursAssaut.EventEnCoursAssaut_Default_id))
                {
                    res = EtatAlerteTakeEventEnCoursAssaut();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int EtatNormalTakeEventEtatAlerte() {
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
        public int Mort_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void Mort_enter() {
            rootState_subState = Mort;
            rootState_active = Mort;
            MortEnter();
        }
        
        //## statechart_method 
        public int AssautEchecTakeEventGIGNMort() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            AssautEchec_exit();
            //#[ transition 5 
            gignMort();
            //#]
            Mort_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void MortEnter() {
        }
        
        //## statechart_method 
        public void EtatAlerte_enter() {
            rootState_subState = EtatAlerte;
            rootState_active = EtatAlerte;
            EtatAlerteEnter();
        }
        
        //## statechart_method 
        public int AssautEchec_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventGIGNMort.EventGIGNMort_Default_id))
                {
                    res = AssautEchecTakeEventGIGNMort();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void EnCoursAssaut_enter() {
            rootState_subState = EnCoursAssaut;
            rootState_active = EnCoursAssaut;
            EnCoursAssautEnter();
        }
        
        //## statechart_method 
        public void EtatNormal_enter() {
            rootState_subState = EtatNormal;
            rootState_active = EtatNormal;
            EtatNormalEnter();
        }
        
        //## statechart_method 
        public void AssautEchecExit() {
        }
        
        //## statechart_method 
        public void EtatAlerteEnter() {
        }
        
        //## statechart_method 
        public void EtatNormalEnter() {
        }
        
        //## statechart_method 
        public void Mort_exit() {
            MortExit();
        }
        
        //## statechart_method 
        public void AssautReussi_entDef() {
            AssautReussi_enter();
        }
        
        //## statechart_method 
        public void EtatNormal_entDef() {
            EtatNormal_enter();
        }
        
        //## statechart_method 
        public void AssautReussiEnter() {
        }
        
        //## statechart_method 
        public void EnCoursAssautExit() {
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
        public void AssautEchec_enter() {
            rootState_subState = AssautEchec;
            rootState_active = AssautEchec;
            AssautEchecEnter();
        }
        
        //## statechart_method 
        public int EnCoursAssaut_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventAssautReussi.EventAssautReussi_Default_id))
                {
                    res = EnCoursAssautTakeEventAssautReussi();
                }
            else if(event.isTypeOf(EventAssautEchec.EventAssautEchec_Default_id))
                {
                    res = EnCoursAssautTakeEventAssautEchec();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int EnCoursAssautTakeEventAssautEchec() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            EnCoursAssaut_exit();
            //#[ transition 3 
            assautEchec();
            //#]
            AssautEchec_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Mort_entDef() {
            Mort_enter();
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void AssautEchecEnter() {
        }
        
        //## statechart_method 
        public void AssautReussi_exit() {
            AssautReussiExit();
        }
        
        //## statechart_method 
        public void EtatNormalExit() {
        }
        
        //## statechart_method 
        public int EnCoursAssautTakeEventAssautReussi() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            EnCoursAssaut_exit();
            //#[ transition 4 
            assautReussi();
            //#]
            AssautReussi_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnCoursAssautEnter() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            EtatNormal_entDef();
        }
        
        //## statechart_method 
        public void AssautEchec_exit() {
            AssautEchecExit();
        }
        
        //## statechart_method 
        public void EnCoursAssaut_exit() {
            EnCoursAssautExit();
        }
        
        //## statechart_method 
        public int EtatNormal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEtatAlerte.EventEtatAlerte_Default_id))
                {
                    res = EtatNormalTakeEventEtatAlerte();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int AssautReussi_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void AssautReussi_enter() {
            rootState_subState = AssautReussi;
            rootState_active = AssautReussi;
            AssautReussiEnter();
        }
        
        //## statechart_method 
        public void MortExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void AssautReussiExit() {
        }
        
        //## statechart_method 
        public void EnCoursAssaut_entDef() {
            EnCoursAssaut_enter();
        }
        
        //## statechart_method 
        public void AssautEchec_entDef() {
            AssautEchec_enter();
        }
        
        //## statechart_method 
        public int EtatAlerteTakeEventEnCoursAssaut() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            EtatAlerte_exit();
            //#[ transition 2 
            enCoursAssaut();
            //#]
            EnCoursAssaut_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/GIGN.java
*********************************************************************/

