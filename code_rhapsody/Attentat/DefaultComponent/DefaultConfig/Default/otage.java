/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: otage
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/otage.java
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
// Default/otage.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor otage 
public class otage implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassotage = new AnimClass("Default.otage",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected GIGN unGIGN;		//## link unGIGN 
    
    protected Temoin unTemoin;		//## link unTemoin 
    
    protected Terroriste unTerroriste;		//## link unTerroriste 
    
    protected Victime unVictime;		//## link unVictime 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int PriseOtage=1;
    public static final int Mort=2;
    public static final int Libre=3;
    public static final int EtatNormal=4;
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
    public  otage(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassotage.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation libre() 
    public void libre() {
        try {
            animInstance().notifyMethodEntered("libre",
               new ArgData[] {
               });
        
        //#[ operation libre() 
        System.out.println("Les otages sont libres");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation mort() 
    public void mort() {
        try {
            animInstance().notifyMethodEntered("mort",
               new ArgData[] {
               });
        
        //#[ operation mort() 
        System.out.println("Les otages sont morts");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation priseOtage() 
    public void priseOtage() {
        try {
            animInstance().notifyMethodEntered("priseOtage",
               new ArgData[] {
               });
        
        //#[ operation priseOtage() 
        System.out.println("Prise otage en cours");
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
                unGIGN.__setUnOtage(null);
            }
        __setUnGIGN(p_GIGN);
    }
    
    //## auto_generated 
    public void setUnGIGN(GIGN p_GIGN) {
        if(p_GIGN != null)
            {
                p_GIGN._setUnOtage(this);
            }
        _setUnGIGN(p_GIGN);
    }
    
    //## auto_generated 
    public void _clearUnGIGN() {
        animInstance().notifyRelationCleared("unGIGN");
        unGIGN = null;
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
                unTemoin.__setUnOtage(null);
            }
        __setUnTemoin(p_Temoin);
    }
    
    //## auto_generated 
    public void setUnTemoin(Temoin p_Temoin) {
        if(p_Temoin != null)
            {
                p_Temoin._setUnOtage(this);
            }
        _setUnTemoin(p_Temoin);
    }
    
    //## auto_generated 
    public void _clearUnTemoin() {
        animInstance().notifyRelationCleared("unTemoin");
        unTemoin = null;
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
                unTerroriste.__setUnOtage(null);
            }
        __setUnTerroriste(p_Terroriste);
    }
    
    //## auto_generated 
    public void setUnTerroriste(Terroriste p_Terroriste) {
        if(p_Terroriste != null)
            {
                p_Terroriste._setUnOtage(this);
            }
        _setUnTerroriste(p_Terroriste);
    }
    
    //## auto_generated 
    public void _clearUnTerroriste() {
        animInstance().notifyRelationCleared("unTerroriste");
        unTerroriste = null;
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
                unVictime.__setUnOtage(null);
            }
        __setUnVictime(p_Victime);
    }
    
    //## auto_generated 
    public void setUnVictime(Victime p_Victime) {
        if(p_Victime != null)
            {
                p_Victime._setUnOtage(this);
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
                case EtatNormal:
                {
                    EtatNormal_add(animStates);
                }
                break;
                case PriseOtage:
                {
                    PriseOtage_add(animStates);
                }
                break;
                case Libre:
                {
                    Libre_add(animStates);
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
                case PriseOtage:
                {
                    res = PriseOtage_takeEvent(id);
                }
                break;
                case Libre:
                {
                    res = Libre_takeEvent(id);
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
        public void PriseOtage_add(AnimStates animStates) {
            animStates.add("ROOT.PriseOtage");
        }
        
        //## statechart_method 
        public void Mort_add(AnimStates animStates) {
            animStates.add("ROOT.Mort");
        }
        
        //## statechart_method 
        public void Libre_add(AnimStates animStates) {
            animStates.add("ROOT.Libre");
        }
        
        //## statechart_method 
        public void EtatNormal_add(AnimStates animStates) {
            animStates.add("ROOT.EtatNormal");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
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
        public void Libre_exit() {
            LibreExit();
            animInstance().notifyStateExited("ROOT.Libre");
        }
        
        //## statechart_method 
        public void MortEnter() {
        }
        
        //## statechart_method 
        public void PriseOtageEnter() {
        }
        
        //## statechart_method 
        public void EtatNormal_enter() {
            animInstance().notifyStateEntered("ROOT.EtatNormal");
            rootState_subState = EtatNormal;
            rootState_active = EtatNormal;
            EtatNormalEnter();
        }
        
        //## statechart_method 
        public int Libre_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
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
        public void PriseOtage_exit() {
            PriseOtageExit();
            animInstance().notifyStateExited("ROOT.PriseOtage");
        }
        
        //## statechart_method 
        public void EtatNormal_entDef() {
            EtatNormal_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void EtatNormal_exit() {
            EtatNormalExit();
            animInstance().notifyStateExited("ROOT.EtatNormal");
        }
        
        //## statechart_method 
        public void Mort_entDef() {
            Mort_enter();
        }
        
        //## statechart_method 
        public int PriseOtageTakeEventLibre() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            PriseOtage_exit();
            //#[ transition 2 
            libre();
            //#]
            Libre_entDef();
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
        public int EtatNormalTakeEventPriseOtage() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            EtatNormal_exit();
            //#[ transition 1 
            priseOtage();
            //#]
            PriseOtage_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EtatNormalExit() {
        }
        
        //## statechart_method 
        public void Libre_enter() {
            animInstance().notifyStateEntered("ROOT.Libre");
            rootState_subState = Libre;
            rootState_active = Libre;
            LibreEnter();
        }
        
        //## statechart_method 
        public int PriseOtage_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventLibre.EventLibre_Default_id))
                {
                    res = PriseOtageTakeEventLibre();
                }
            else if(event.isTypeOf(EventMort.EventMort_Default_id))
                {
                    res = PriseOtageTakeEventMort();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void PriseOtage_enter() {
            animInstance().notifyStateEntered("ROOT.PriseOtage");
            rootState_subState = PriseOtage;
            rootState_active = PriseOtage;
            PriseOtageEnter();
        }
        
        //## statechart_method 
        public int PriseOtageTakeEventMort() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            PriseOtage_exit();
            //#[ transition 3 
            mort();
            //#]
            Mort_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void PriseOtageExit() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            EtatNormal_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void Libre_entDef() {
            Libre_enter();
        }
        
        //## statechart_method 
        public int EtatNormal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventPriseOtage.EventPriseOtage_Default_id))
                {
                    res = EtatNormalTakeEventPriseOtage();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void MortExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void LibreEnter() {
        }
        
        //## statechart_method 
        public void PriseOtage_entDef() {
            PriseOtage_enter();
        }
        
        //## statechart_method 
        public void LibreExit() {
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
            return otage.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassotage; 
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
        msg.add("unVictime", false, true, unVictime);
        msg.add("unGIGN", false, true, unGIGN);
        msg.add("unTerroriste", false, true, unTerroriste);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(otage.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            otage.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            otage.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/otage.java
*********************************************************************/

