/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Pompier
//!	Generated Date	: Thu, 3, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Pompier.java
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
// Default/Pompier.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor Pompier 
public class Pompier implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassPompier = new AnimClass("Default.Pompier",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected CamionPompier unCamionPompier;		//## link unCamionPompier 
    
    protected CentreTraitementUrgence unCentreTraitementUrgence;		//## link unCentreTraitementUrgence 
    
    protected Temoin unTemoin;		//## link unTemoin 
    
    protected Victime unVictime;		//## link unVictime 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int EnAttente=1;
    public static final int DonneConseils=2;
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
    public  Pompier(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassPompier.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation envoyerCamionPompier() 
    public void envoyerCamionPompier() {
        try {
            animInstance().notifyMethodEntered("envoyerCamionPompier",
               new ArgData[] {
               });
        
        //#[ operation envoyerCamionPompier() 
           System.out.println("Camion pompier envoye");
           unCamionPompier.gen(new EventEnvoieCamionPompier());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public CamionPompier getUnCamionPompier() {
        return unCamionPompier;
    }
    
    //## auto_generated 
    public void __setUnCamionPompier(CamionPompier p_CamionPompier) {
        unCamionPompier = p_CamionPompier;
        if(p_CamionPompier != null)
            {
                animInstance().notifyRelationAdded("unCamionPompier", p_CamionPompier);
            }
        else
            {
                animInstance().notifyRelationCleared("unCamionPompier");
            }
    }
    
    //## auto_generated 
    public void _setUnCamionPompier(CamionPompier p_CamionPompier) {
        if(unCamionPompier != null)
            {
                unCamionPompier.__setUnPompier(null);
            }
        __setUnCamionPompier(p_CamionPompier);
    }
    
    //## auto_generated 
    public void setUnCamionPompier(CamionPompier p_CamionPompier) {
        if(p_CamionPompier != null)
            {
                p_CamionPompier._setUnPompier(this);
            }
        _setUnCamionPompier(p_CamionPompier);
    }
    
    //## auto_generated 
    public void _clearUnCamionPompier() {
        animInstance().notifyRelationCleared("unCamionPompier");
        unCamionPompier = null;
    }
    
    //## auto_generated 
    public CentreTraitementUrgence getUnCentreTraitementUrgence() {
        return unCentreTraitementUrgence;
    }
    
    //## auto_generated 
    public void __setUnCentreTraitementUrgence(CentreTraitementUrgence p_CentreTraitementUrgence) {
        unCentreTraitementUrgence = p_CentreTraitementUrgence;
        if(p_CentreTraitementUrgence != null)
            {
                animInstance().notifyRelationAdded("unCentreTraitementUrgence", p_CentreTraitementUrgence);
            }
        else
            {
                animInstance().notifyRelationCleared("unCentreTraitementUrgence");
            }
    }
    
    //## auto_generated 
    public void _setUnCentreTraitementUrgence(CentreTraitementUrgence p_CentreTraitementUrgence) {
        if(unCentreTraitementUrgence != null)
            {
                unCentreTraitementUrgence.__setUnPompier(null);
            }
        __setUnCentreTraitementUrgence(p_CentreTraitementUrgence);
    }
    
    //## auto_generated 
    public void setUnCentreTraitementUrgence(CentreTraitementUrgence p_CentreTraitementUrgence) {
        if(p_CentreTraitementUrgence != null)
            {
                p_CentreTraitementUrgence._setUnPompier(this);
            }
        _setUnCentreTraitementUrgence(p_CentreTraitementUrgence);
    }
    
    //## auto_generated 
    public void _clearUnCentreTraitementUrgence() {
        animInstance().notifyRelationCleared("unCentreTraitementUrgence");
        unCentreTraitementUrgence = null;
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
                unTemoin.__setUnPompier(null);
            }
        __setUnTemoin(p_Temoin);
    }
    
    //## auto_generated 
    public void setUnTemoin(Temoin p_Temoin) {
        if(p_Temoin != null)
            {
                p_Temoin._setUnPompier(this);
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
                unVictime.__setUnPompier(null);
            }
        __setUnVictime(p_Victime);
    }
    
    //## auto_generated 
    public void setUnVictime(Victime p_Victime) {
        if(p_Victime != null)
            {
                p_Victime._setUnPompier(this);
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
                case EnAttente:
                {
                    EnAttente_add(animStates);
                }
                break;
                case DonneConseils:
                {
                    DonneConseils_add(animStates);
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
                case EnAttente:
                {
                    res = EnAttente_takeEvent(id);
                }
                break;
                case DonneConseils:
                {
                    res = DonneConseils_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void EnAttente_add(AnimStates animStates) {
            animStates.add("ROOT.EnAttente");
        }
        
        //## statechart_method 
        public void DonneConseils_add(AnimStates animStates) {
            animStates.add("ROOT.DonneConseils");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int EnAttente_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventUrgenceRecu.EventUrgenceRecu_Default_id))
                {
                    res = EnAttenteTakeEventUrgenceRecu();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void EnAttente_enter() {
            animInstance().notifyStateEntered("ROOT.EnAttente");
            rootState_subState = EnAttente;
            rootState_active = EnAttente;
            EnAttenteEnter();
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
        public int DonneConseilsTakeEventCamionPompierArrive() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            DonneConseils_exit();
            EnAttente_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnAttenteEnter() {
        }
        
        //## statechart_method 
        public void DonneConseils_enter() {
            animInstance().notifyStateEntered("ROOT.DonneConseils");
            rootState_subState = DonneConseils;
            rootState_active = DonneConseils;
            DonneConseilsEnter();
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
        public int EnAttenteTakeEventUrgenceRecu() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            EnAttente_exit();
            //#[ transition 1 
            envoyerCamionPompier();
            //#]
            DonneConseils_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnAttente_exit() {
            EnAttenteExit();
            animInstance().notifyStateExited("ROOT.EnAttente");
        }
        
        //## statechart_method 
        public void DonneConseilsExit() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            EnAttente_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void DonneConseils_entDef() {
            DonneConseils_enter();
        }
        
        //## statechart_method 
        public int DonneConseils_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventCamionPompierArrive.EventCamionPompierArrive_Default_id))
                {
                    res = DonneConseilsTakeEventCamionPompierArrive();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void DonneConseilsEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void EnAttenteExit() {
        }
        
        //## statechart_method 
        public void DonneConseils_exit() {
            DonneConseilsExit();
            animInstance().notifyStateExited("ROOT.DonneConseils");
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
            return Pompier.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassPompier; 
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
        msg.add("unCentreTraitementUrgence", false, true, unCentreTraitementUrgence);
        msg.add("unVictime", false, true, unVictime);
        msg.add("unCamionPompier", false, true, unCamionPompier);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Pompier.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Pompier.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Pompier.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Pompier.java
*********************************************************************/

