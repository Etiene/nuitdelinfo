/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Victime
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Victime.java
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
// Default/Victime.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor Victime 
public class Victime implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassVictime = new AnimClass("Default.Victime",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected otage unOtage;		//## link unOtage 
    
    protected Secours unSecours;		//## link unSecours 
    
    protected Temoin unTemoin;		//## link unTemoin 
    
    protected Terroriste unTerroriste;		//## link unTerroriste 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Survie=1;
    public static final int Secouru=2;
    public static final int Mort=3;
    public static final int EtatNormal=4;
    public static final int Blesse=5;
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
    public  Victime(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassVictime.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation victimeBlesse() 
    public void victimeBlesse() {
        try {
            animInstance().notifyMethodEntered("victimeBlesse",
               new ArgData[] {
               });
        
        //#[ operation victimeBlesse() 
        System.out.println("La victime est blessee"); 
        unTemoin.gen (new EventTirSurVictime());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation victimeMort() 
    public void victimeMort() {
        try {
            animInstance().notifyMethodEntered("victimeMort",
               new ArgData[] {
               });
        
        //#[ operation victimeMort() 
        System.out.println("la victime est morte");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation victimeSecouru() 
    public void victimeSecouru() {
        try {
            animInstance().notifyMethodEntered("victimeSecouru",
               new ArgData[] {
               });
        
        //#[ operation victimeSecouru() 
        System.out.println("la victime est secourue");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation victimeSurvie() 
    public void victimeSurvie() {
        try {
            animInstance().notifyMethodEntered("victimeSurvie",
               new ArgData[] {
               });
        
        //#[ operation victimeSurvie() 
        System.out.println("la victime survice");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
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
                unOtage.__setUnVictime(null);
            }
        __setUnOtage(p_otage);
    }
    
    //## auto_generated 
    public void setUnOtage(otage p_otage) {
        if(p_otage != null)
            {
                p_otage._setUnVictime(this);
            }
        _setUnOtage(p_otage);
    }
    
    //## auto_generated 
    public void _clearUnOtage() {
        animInstance().notifyRelationCleared("unOtage");
        unOtage = null;
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
                unSecours.__setUnVictime(null);
            }
        __setUnSecours(p_Secours);
    }
    
    //## auto_generated 
    public void setUnSecours(Secours p_Secours) {
        if(p_Secours != null)
            {
                p_Secours._setUnVictime(this);
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
                unTemoin.__setUnVictime(null);
            }
        __setUnTemoin(p_Temoin);
    }
    
    //## auto_generated 
    public void setUnTemoin(Temoin p_Temoin) {
        if(p_Temoin != null)
            {
                p_Temoin._setUnVictime(this);
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
                unTerroriste.__setUnVictime(null);
            }
        __setUnTerroriste(p_Terroriste);
    }
    
    //## auto_generated 
    public void setUnTerroriste(Terroriste p_Terroriste) {
        if(p_Terroriste != null)
            {
                p_Terroriste._setUnVictime(this);
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
                case Blesse:
                {
                    Blesse_add(animStates);
                }
                break;
                case Mort:
                {
                    Mort_add(animStates);
                }
                break;
                case Secouru:
                {
                    Secouru_add(animStates);
                }
                break;
                case Survie:
                {
                    Survie_add(animStates);
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
                case Blesse:
                {
                    res = Blesse_takeEvent(id);
                }
                break;
                case Mort:
                {
                    res = Mort_takeEvent(id);
                }
                break;
                case Secouru:
                {
                    res = Secouru_takeEvent(id);
                }
                break;
                case Survie:
                {
                    res = Survie_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Survie_add(AnimStates animStates) {
            animStates.add("ROOT.Survie");
        }
        
        //## statechart_method 
        public void Secouru_add(AnimStates animStates) {
            animStates.add("ROOT.Secouru");
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
        public void Blesse_add(AnimStates animStates) {
            animStates.add("ROOT.Blesse");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int BlesseTakeEventVictimeSecouru() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Blesse_exit();
            //#[ transition 3 
            victimeSecouru();
            //#]
            Secouru_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void BlesseExit() {
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
        public void Secouru_enter() {
            animInstance().notifyStateEntered("ROOT.Secouru");
            rootState_subState = Secouru;
            rootState_active = Secouru;
            SecouruEnter();
        }
        
        //## statechart_method 
        public int Blesse_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventVictimeMort.EventVictimeMort_Default_id))
                {
                    res = BlesseTakeEventVictimeMort();
                }
            else if(event.isTypeOf(EventVictimeSecouru.EventVictimeSecouru_Default_id))
                {
                    res = BlesseTakeEventVictimeSecouru();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void MortEnter() {
        }
        
        //## statechart_method 
        public void Survie_exit() {
            SurvieExit();
            animInstance().notifyStateExited("ROOT.Survie");
        }
        
        //## statechart_method 
        public void Survie_enter() {
            animInstance().notifyStateEntered("ROOT.Survie");
            rootState_subState = Survie;
            rootState_active = Survie;
            SurvieEnter();
        }
        
        //## statechart_method 
        public void Secouru_exit() {
            SecouruExit();
            animInstance().notifyStateExited("ROOT.Secouru");
        }
        
        //## statechart_method 
        public void Secouru_entDef() {
            Secouru_enter();
        }
        
        //## statechart_method 
        public void EtatNormal_enter() {
            animInstance().notifyStateEntered("ROOT.EtatNormal");
            rootState_subState = EtatNormal;
            rootState_active = EtatNormal;
            EtatNormalEnter();
        }
        
        //## statechart_method 
        public int Secouru_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventVictimeSurvie.EventVictimeSurvie_Default_id))
                {
                    res = SecouruTakeEventVictimeSurvie();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Survie_takeEvent(short id) {
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
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void Blesse_enter() {
            animInstance().notifyStateEntered("ROOT.Blesse");
            rootState_subState = Blesse;
            rootState_active = Blesse;
            BlesseEnter();
        }
        
        //## statechart_method 
        public void EtatNormalExit() {
        }
        
        //## statechart_method 
        public void SurvieExit() {
        }
        
        //## statechart_method 
        public int EtatNormalTakeEventTirSurVictime() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            EtatNormal_exit();
            //#[ transition 1 
            victimeBlesse();
            //#]
            Blesse_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int SecouruTakeEventVictimeSurvie() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Secouru_exit();
            //#[ transition 4 
            victimeSurvie();
            //#]
            Survie_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            EtatNormal_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void BlesseEnter() {
        }
        
        //## statechart_method 
        public int EtatNormal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventTirSurVictime.EventTirSurVictime_Default_id))
                {
                    res = EtatNormalTakeEventTirSurVictime();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void MortExit() {
        }
        
        //## statechart_method 
        public void SecouruExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void SurvieEnter() {
        }
        
        //## statechart_method 
        public void Survie_entDef() {
            Survie_enter();
        }
        
        //## statechart_method 
        public int BlesseTakeEventVictimeMort() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Blesse_exit();
            //#[ transition 2 
            victimeMort();
            //#]
            Mort_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Blesse_exit() {
            BlesseExit();
            animInstance().notifyStateExited("ROOT.Blesse");
        }
        
        //## statechart_method 
        public void Blesse_entDef() {
            Blesse_enter();
        }
        
        //## statechart_method 
        public void SecouruEnter() {
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
            return Victime.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassVictime; 
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
        msg.add("unTerroriste", false, true, unTerroriste);
        msg.add("unSecours", false, true, unSecours);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Victime.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Victime.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Victime.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Victime.java
*********************************************************************/

