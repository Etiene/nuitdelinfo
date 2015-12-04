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
import com.ibm.rational.rhapsody.oxf.states.*;

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
public class Victime implements RiJStateConcept {
    
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
        reactive = new Reactive(p_thread);
    }
    
    //## operation victimeBlesse() 
    public void victimeBlesse() {
        //#[ operation victimeBlesse() 
        System.out.println("La victime est blessee"); 
        unTemoin.gen (new EventTirSurVictime());
        //#]
    }
    
    //## operation victimeMort() 
    public void victimeMort() {
        //#[ operation victimeMort() 
        System.out.println("la victime est morte");
        //#]
    }
    
    //## operation victimeSecouru() 
    public void victimeSecouru() {
        //#[ operation victimeSecouru() 
        System.out.println("la victime est secourue");
        //#]
    }
    
    //## operation victimeSurvie() 
    public void victimeSurvie() {
        //#[ operation victimeSurvie() 
        System.out.println("la victime survice");
        //#]
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
        unOtage = null;
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
        unTemoin = null;
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
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int BlesseTakeEventVictimeSecouru() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Blesse_exit();
            //#[ transition 3 
            victimeSecouru();
            //#]
            Secouru_entDef();
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
            rootState_subState = Mort;
            rootState_active = Mort;
            MortEnter();
        }
        
        //## statechart_method 
        public void Secouru_enter() {
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
        }
        
        //## statechart_method 
        public void Survie_enter() {
            rootState_subState = Survie;
            rootState_active = Survie;
            SurvieEnter();
        }
        
        //## statechart_method 
        public void Secouru_exit() {
            SecouruExit();
        }
        
        //## statechart_method 
        public void Secouru_entDef() {
            Secouru_enter();
        }
        
        //## statechart_method 
        public void EtatNormal_enter() {
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
        public void Blesse_enter() {
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
            EtatNormal_exit();
            //#[ transition 1 
            victimeBlesse();
            //#]
            Blesse_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int SecouruTakeEventVictimeSurvie() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Secouru_exit();
            //#[ transition 4 
            victimeSurvie();
            //#]
            Survie_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            EtatNormal_entDef();
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
            Blesse_exit();
            //#[ transition 2 
            victimeMort();
            //#]
            Mort_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Blesse_exit() {
            BlesseExit();
        }
        
        //## statechart_method 
        public void Blesse_entDef() {
            Blesse_enter();
        }
        
        //## statechart_method 
        public void SecouruEnter() {
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Victime.java
*********************************************************************/

