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
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

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
public class GIGN implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassGIGN = new AnimClass("Default.GIGN",false);
    //#]
    
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
        try {
            animInstance().notifyConstructorEntered(animClassGIGN.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
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
        System.out.println("echec de l'assaut");
        this.gen(new EventGIGNMort());  
        unTerroriste.gen(new EventSeFaitExploser());         
        unCentreCommandement.gen(new EventEchec());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation assautReussi() 
    public void assautReussi() {
        try {
            animInstance().notifyMethodEntered("assautReussi",
               new ArgData[] {
               });
        
        //#[ operation assautReussi() 
        System.out.println("Assaut du GIGN reussi"); 
        unTerroriste.gen (new EventTerroristeNeutralise());
        unCentreCommandement.gen( new EventReussi());  
        unOtage.gen(new EventLibre());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation enCoursAssaut() 
    public void enCoursAssaut() {
        try {
            animInstance().notifyMethodEntered("enCoursAssaut",
               new ArgData[] {
               });
        
        //#[ operation enCoursAssaut() 
        System.out.println("Le GIGN est en cours assaut");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation etatAlerte() 
    public void etatAlerte() {
        try {
            animInstance().notifyMethodEntered("etatAlerte",
               new ArgData[] {
               });
        
        //#[ operation etatAlerte() 
        System.out.println("GIGN en etat alerte");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation gignMort() 
    public void gignMort() {
        try {
            animInstance().notifyMethodEntered("gignMort",
               new ArgData[] {
               });
        
        //#[ operation gignMort() 
        System.out.println("le gign est mort");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
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
        animInstance().notifyRelationCleared("unCentreCommandement");
        unCentreCommandement = null;
    }
    
    //## auto_generated 
    public otage getUnOtage() {
        return unOtage;
    }
    
    //## auto_generated 
    public void __setUnOtage(otage p_otage) {
        unOtage = p_otage;
        if(p_otage != null)
            {
                animInstance().notifyRelationAdded("unOtage", p_otage);
            }
        else
            {
                animInstance().notifyRelationCleared("unOtage");
            }
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
        animInstance().notifyRelationCleared("unOtage");
        unOtage = null;
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
        animInstance().notifyRelationCleared("unPlace");
        unPlace = null;
    }
    
    //## auto_generated 
    public Terroriste getUnTerroriste() {
        return unTerroriste;
    }
    
    //## auto_generated 
    public void __setUnTerroriste(Terroriste p_Terroriste) {
        unTerroriste = p_Terroriste;
        if(p_Terroriste != null)
            {
                animInstance().notifyRelationAdded("unTerroriste", p_Terroriste);
            }
        else
            {
                animInstance().notifyRelationCleared("unTerroriste");
            }
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
        animInstance().notifyRelationCleared("unTerroriste");
        unTerroriste = null;
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
                case EtatNormal:
                {
                    EtatNormal_add(animStates);
                }
                break;
                case EtatAlerte:
                {
                    EtatAlerte_add(animStates);
                }
                break;
                case EnCoursAssaut:
                {
                    EnCoursAssaut_add(animStates);
                }
                break;
                case AssautEchec:
                {
                    AssautEchec_add(animStates);
                }
                break;
                case AssautReussi:
                {
                    AssautReussi_add(animStates);
                }
                break;
                case Mort:
                {
                    Mort_add(animStates);
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
        
        //## statechart_method 
        public void Mort_add(AnimStates animStates) {
            animStates.add("ROOT.Mort");
        }
        
        //## statechart_method 
        public void EtatNormal_add(AnimStates animStates) {
            animStates.add("ROOT.EtatNormal");
        }
        
        //## statechart_method 
        public void EtatAlerte_add(AnimStates animStates) {
            animStates.add("ROOT.EtatAlerte");
        }
        
        //## statechart_method 
        public void EnCoursAssaut_add(AnimStates animStates) {
            animStates.add("ROOT.EnCoursAssaut");
        }
        
        //## statechart_method 
        public void AssautReussi_add(AnimStates animStates) {
            animStates.add("ROOT.AssautReussi");
        }
        
        //## statechart_method 
        public void AssautEchec_add(AnimStates animStates) {
            animStates.add("ROOT.AssautEchec");
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
            animInstance().notifyTransitionStarted("1");
            EtatNormal_exit();
            //#[ transition 1 
            etatAlerte();
            //#]
            EtatAlerte_entDef();
            animInstance().notifyTransitionEnded("1");
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
            animInstance().notifyStateEntered("ROOT.Mort");
            rootState_subState = Mort;
            rootState_active = Mort;
            MortEnter();
        }
        
        //## statechart_method 
        public int AssautEchecTakeEventGIGNMort() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            AssautEchec_exit();
            //#[ transition 5 
            gignMort();
            //#]
            Mort_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void MortEnter() {
        }
        
        //## statechart_method 
        public void EtatAlerte_enter() {
            animInstance().notifyStateEntered("ROOT.EtatAlerte");
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
            animInstance().notifyStateEntered("ROOT.EnCoursAssaut");
            rootState_subState = EnCoursAssaut;
            rootState_active = EnCoursAssaut;
            EnCoursAssautEnter();
        }
        
        //## statechart_method 
        public void EtatNormal_enter() {
            animInstance().notifyStateEntered("ROOT.EtatNormal");
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
            animInstance().notifyStateExited("ROOT.Mort");
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
            animInstance().notifyStateExited("ROOT.EtatAlerte");
        }
        
        //## statechart_method 
        public void EtatAlerte_entDef() {
            EtatAlerte_enter();
        }
        
        //## statechart_method 
        public void EtatNormal_exit() {
            EtatNormalExit();
            animInstance().notifyStateExited("ROOT.EtatNormal");
        }
        
        //## statechart_method 
        public void AssautEchec_enter() {
            animInstance().notifyStateEntered("ROOT.AssautEchec");
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
            animInstance().notifyTransitionStarted("3");
            EnCoursAssaut_exit();
            //#[ transition 3 
            assautEchec();
            //#]
            AssautEchec_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Mort_entDef() {
            Mort_enter();
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
        public void AssautEchecEnter() {
        }
        
        //## statechart_method 
        public void AssautReussi_exit() {
            AssautReussiExit();
            animInstance().notifyStateExited("ROOT.AssautReussi");
        }
        
        //## statechart_method 
        public void EtatNormalExit() {
        }
        
        //## statechart_method 
        public int EnCoursAssautTakeEventAssautReussi() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            EnCoursAssaut_exit();
            //#[ transition 4 
            assautReussi();
            //#]
            AssautReussi_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnCoursAssautEnter() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            EtatNormal_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void AssautEchec_exit() {
            AssautEchecExit();
            animInstance().notifyStateExited("ROOT.AssautEchec");
        }
        
        //## statechart_method 
        public void EnCoursAssaut_exit() {
            EnCoursAssautExit();
            animInstance().notifyStateExited("ROOT.EnCoursAssaut");
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
            animInstance().notifyStateEntered("ROOT.AssautReussi");
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
            animInstance().notifyTransitionStarted("2");
            EtatAlerte_exit();
            //#[ transition 2 
            enCoursAssaut();
            //#]
            EnCoursAssaut_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
            return GIGN.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassGIGN; 
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
        
        msg.add("unCentreCommandement", false, true, unCentreCommandement);
        msg.add("unOtage", false, true, unOtage);
        msg.add("unTerroriste", false, true, unTerroriste);
        msg.add("unPlace", false, true, unPlace);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(GIGN.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            GIGN.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            GIGN.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/GIGN.java
*********************************************************************/

