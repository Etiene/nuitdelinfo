/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Terroriste
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Terroriste.java
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
// Default/Terroriste.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor Terroriste 
public class Terroriste implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassTerroriste = new AnimClass("Default.Terroriste",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected GIGN unGIGN;		//## link unGIGN 
    
    protected otage unOtage;		//## link unOtage 
    
    protected Temoin unTemoin;		//## link unTemoin 
    
    protected Victime unVictime;		//## link unVictime 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int SeFaitExploser=1;
    public static final int Neutralise=2;
    public static final int Inoffensif=3;
    public static final int EnAction=4;
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
    public  Terroriste(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassTerroriste.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation seFaitExploser() 
    public void seFaitExploser() {
        try {
            animInstance().notifyMethodEntered("seFaitExploser",
               new ArgData[] {
               });
        
        //#[ operation seFaitExploser() 
        System.out.println("le terroriste se fait exploser");
        unVictime.gen ( new EventVictimeMort()); 
        unOtage.gen(new EventMort());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation terroristeTirSurVictime() 
    public void terroristeTirSurVictime() {
        try {
            animInstance().notifyMethodEntered("terroristeTirSurVictime",
               new ArgData[] {
               });
        
        //#[ operation terroristeTirSurVictime() 
        System.out.println("le Terroriste tire sur la victime");
        unVictime.gen(new EventTirSurVictime());  
        unOtage.gen(new EventPriseOtage());
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
                unGIGN.__setUnTerroriste(null);
            }
        __setUnGIGN(p_GIGN);
    }
    
    //## auto_generated 
    public void setUnGIGN(GIGN p_GIGN) {
        if(p_GIGN != null)
            {
                p_GIGN._setUnTerroriste(this);
            }
        _setUnGIGN(p_GIGN);
    }
    
    //## auto_generated 
    public void _clearUnGIGN() {
        animInstance().notifyRelationCleared("unGIGN");
        unGIGN = null;
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
                unOtage.__setUnTerroriste(null);
            }
        __setUnOtage(p_otage);
    }
    
    //## auto_generated 
    public void setUnOtage(otage p_otage) {
        if(p_otage != null)
            {
                p_otage._setUnTerroriste(this);
            }
        _setUnOtage(p_otage);
    }
    
    //## auto_generated 
    public void _clearUnOtage() {
        animInstance().notifyRelationCleared("unOtage");
        unOtage = null;
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
                unTemoin.__setUnTerroriste(null);
            }
        __setUnTemoin(p_Temoin);
    }
    
    //## auto_generated 
    public void setUnTemoin(Temoin p_Temoin) {
        if(p_Temoin != null)
            {
                p_Temoin._setUnTerroriste(this);
            }
        _setUnTemoin(p_Temoin);
    }
    
    //## auto_generated 
    public void _clearUnTemoin() {
        animInstance().notifyRelationCleared("unTemoin");
        unTemoin = null;
    }
    
    //## auto_generated 
    public Victime getUnVictime() {
        return unVictime;
    }
    
    //## auto_generated 
    public void __setUnVictime(Victime p_Victime) {
        unVictime = p_Victime;
        if(p_Victime != null)
            {
                animInstance().notifyRelationAdded("unVictime", p_Victime);
            }
        else
            {
                animInstance().notifyRelationCleared("unVictime");
            }
    }
    
    //## auto_generated 
    public void _setUnVictime(Victime p_Victime) {
        if(unVictime != null)
            {
                unVictime.__setUnTerroriste(null);
            }
        __setUnVictime(p_Victime);
    }
    
    //## auto_generated 
    public void setUnVictime(Victime p_Victime) {
        if(p_Victime != null)
            {
                p_Victime._setUnTerroriste(this);
            }
        _setUnVictime(p_Victime);
    }
    
    //## auto_generated 
    public void _clearUnVictime() {
        animInstance().notifyRelationCleared("unVictime");
        unVictime = null;
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
                case Inoffensif:
                {
                    Inoffensif_add(animStates);
                }
                break;
                case EnAction:
                {
                    EnAction_add(animStates);
                }
                break;
                case Neutralise:
                {
                    Neutralise_add(animStates);
                }
                break;
                case SeFaitExploser:
                {
                    SeFaitExploser_add(animStates);
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
                case Inoffensif:
                {
                    res = Inoffensif_takeEvent(id);
                }
                break;
                case EnAction:
                {
                    res = EnAction_takeEvent(id);
                }
                break;
                case Neutralise:
                {
                    res = Neutralise_takeEvent(id);
                }
                break;
                case SeFaitExploser:
                {
                    res = SeFaitExploser_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void SeFaitExploser_add(AnimStates animStates) {
            animStates.add("ROOT.SeFaitExploser");
        }
        
        //## statechart_method 
        public void Neutralise_add(AnimStates animStates) {
            animStates.add("ROOT.Neutralise");
        }
        
        //## statechart_method 
        public void Inoffensif_add(AnimStates animStates) {
            animStates.add("ROOT.Inoffensif");
        }
        
        //## statechart_method 
        public void EnAction_add(AnimStates animStates) {
            animStates.add("ROOT.EnAction");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void Neutralise_exit() {
            NeutraliseExit();
            animInstance().notifyStateExited("ROOT.Neutralise");
        }
        
        //## statechart_method 
        public void SeFaitExploser_exit() {
            SeFaitExploserExit();
            animInstance().notifyStateExited("ROOT.SeFaitExploser");
        }
        
        //## statechart_method 
        public int EnAction_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventTerroristeNeutralise.EventTerroristeNeutralise_Default_id))
                {
                    res = EnActionTakeEventTerroristeNeutralise();
                }
            else if(event.isTypeOf(EventSeFaitExploser.EventSeFaitExploser_Default_id))
                {
                    res = EnActionTakeEventSeFaitExploser();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void EnActionExit() {
        }
        
        //## statechart_method 
        public void EnAction_entDef() {
            EnAction_enter();
        }
        
        //## statechart_method 
        public int Neutralise_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void NeutraliseExit() {
        }
        
        //## statechart_method 
        public void SeFaitExploser_enter() {
            animInstance().notifyStateEntered("ROOT.SeFaitExploser");
            rootState_subState = SeFaitExploser;
            rootState_active = SeFaitExploser;
            SeFaitExploserEnter();
        }
        
        //## statechart_method 
        public int EnActionTakeEventSeFaitExploser() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            EnAction_exit();
            //#[ transition 2 
            seFaitExploser();
            //#]
            SeFaitExploser_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void InoffensifExit() {
        }
        
        //## statechart_method 
        public void Inoffensif_entDef() {
            Inoffensif_enter();
        }
        
        //## statechart_method 
        public int SeFaitExploser_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void EnActionEnter() {
        }
        
        //## statechart_method 
        public void Inoffensif_enter() {
            animInstance().notifyStateEntered("ROOT.Inoffensif");
            rootState_subState = Inoffensif;
            rootState_active = Inoffensif;
            InoffensifEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void Neutralise_entDef() {
            Neutralise_enter();
        }
        
        //## statechart_method 
        public void EnAction_enter() {
            animInstance().notifyStateEntered("ROOT.EnAction");
            rootState_subState = EnAction;
            rootState_active = EnAction;
            EnActionEnter();
        }
        
        //## statechart_method 
        public int Inoffensif_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventTirSurVictime.EventTirSurVictime_Default_id))
                {
                    res = InoffensifTakeEventTirSurVictime();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int InoffensifTakeEventTirSurVictime() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Inoffensif_exit();
            //#[ transition 1 
            terroristeTirSurVictime();
            //#]
            EnAction_entDef();
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
        public int EnActionTakeEventTerroristeNeutralise() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            EnAction_exit();
            Neutralise_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnAction_exit() {
            EnActionExit();
            animInstance().notifyStateExited("ROOT.EnAction");
        }
        
        //## statechart_method 
        public void InoffensifEnter() {
        }
        
        //## statechart_method 
        public void SeFaitExploserExit() {
        }
        
        //## statechart_method 
        public void SeFaitExploser_entDef() {
            SeFaitExploser_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Inoffensif_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void Neutralise_enter() {
            animInstance().notifyStateEntered("ROOT.Neutralise");
            rootState_subState = Neutralise;
            rootState_active = Neutralise;
            NeutraliseEnter();
        }
        
        //## statechart_method 
        public void Inoffensif_exit() {
            InoffensifExit();
            animInstance().notifyStateExited("ROOT.Inoffensif");
        }
        
        //## statechart_method 
        public void NeutraliseEnter() {
        }
        
        //## statechart_method 
        public void SeFaitExploserEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
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
            return Terroriste.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassTerroriste; 
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
        msg.add("unOtage", false, true, unOtage);
        msg.add("unVictime", false, true, unVictime);
        msg.add("unGIGN", false, true, unGIGN);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Terroriste.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Terroriste.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Terroriste.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Terroriste.java
*********************************************************************/

