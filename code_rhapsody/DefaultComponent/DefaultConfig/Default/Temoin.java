/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Temoin
//!	Generated Date	: Thu, 3, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Temoin.java
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
// Default/Temoin.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor Temoin 
public class Temoin implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassTemoin = new AnimClass("Default.Temoin",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected CentreGestionMessage unCentreGestionMessage;		//## link unCentreGestionMessage 
    
    protected CentreTraitementUrgence unCentreTraitementUrgence;		//## link unCentreTraitementUrgence 
    
    protected Pompier unPompier;		//## link unPompier 
    
    protected Victime unVictime;		//## link unVictime 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int VaHopital=1;
    public static final int Part=2;
    public static final int Marche=3;
    public static final int DecouvreVictime=4;
    public static final int Attente=5;
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
    public  Temoin(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassTemoin.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation previentSecours() 
    public void previentSecours() {
        try {
            animInstance().notifyMethodEntered("previentSecours",
               new ArgData[] {
               });
        
        //#[ operation previentSecours() 
        System.out.println("Temoin previent le centre des appels");
        unCentreTraitementUrgence.gen(new EventMessageRecu());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public CentreGestionMessage getUnCentreGestionMessage() {
        return unCentreGestionMessage;
    }
    
    //## auto_generated 
    public void __setUnCentreGestionMessage(CentreGestionMessage p_CentreGestionMessage) {
        unCentreGestionMessage = p_CentreGestionMessage;
        if(p_CentreGestionMessage != null)
            {
                animInstance().notifyRelationAdded("unCentreGestionMessage", p_CentreGestionMessage);
            }
        else
            {
                animInstance().notifyRelationCleared("unCentreGestionMessage");
            }
    }
    
    //## auto_generated 
    public void _setUnCentreGestionMessage(CentreGestionMessage p_CentreGestionMessage) {
        if(unCentreGestionMessage != null)
            {
                unCentreGestionMessage.__setUnTemoin(null);
            }
        __setUnCentreGestionMessage(p_CentreGestionMessage);
    }
    
    //## auto_generated 
    public void setUnCentreGestionMessage(CentreGestionMessage p_CentreGestionMessage) {
        if(p_CentreGestionMessage != null)
            {
                p_CentreGestionMessage._setUnTemoin(this);
            }
        _setUnCentreGestionMessage(p_CentreGestionMessage);
    }
    
    //## auto_generated 
    public void _clearUnCentreGestionMessage() {
        animInstance().notifyRelationCleared("unCentreGestionMessage");
        unCentreGestionMessage = null;
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
                unCentreTraitementUrgence.__setUnTemoin(null);
            }
        __setUnCentreTraitementUrgence(p_CentreTraitementUrgence);
    }
    
    //## auto_generated 
    public void setUnCentreTraitementUrgence(CentreTraitementUrgence p_CentreTraitementUrgence) {
        if(p_CentreTraitementUrgence != null)
            {
                p_CentreTraitementUrgence._setUnTemoin(this);
            }
        _setUnCentreTraitementUrgence(p_CentreTraitementUrgence);
    }
    
    //## auto_generated 
    public void _clearUnCentreTraitementUrgence() {
        animInstance().notifyRelationCleared("unCentreTraitementUrgence");
        unCentreTraitementUrgence = null;
    }
    
    //## auto_generated 
    public Pompier getUnPompier() {
        return unPompier;
    }
    
    //## auto_generated 
    public void __setUnPompier(Pompier p_Pompier) {
        unPompier = p_Pompier;
        if(p_Pompier != null)
            {
                animInstance().notifyRelationAdded("unPompier", p_Pompier);
            }
        else
            {
                animInstance().notifyRelationCleared("unPompier");
            }
    }
    
    //## auto_generated 
    public void _setUnPompier(Pompier p_Pompier) {
        if(unPompier != null)
            {
                unPompier.__setUnTemoin(null);
            }
        __setUnPompier(p_Pompier);
    }
    
    //## auto_generated 
    public void setUnPompier(Pompier p_Pompier) {
        if(p_Pompier != null)
            {
                p_Pompier._setUnTemoin(this);
            }
        _setUnPompier(p_Pompier);
    }
    
    //## auto_generated 
    public void _clearUnPompier() {
        animInstance().notifyRelationCleared("unPompier");
        unPompier = null;
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
                unVictime.__setUnTemoin(null);
            }
        __setUnVictime(p_Victime);
    }
    
    //## auto_generated 
    public void setUnVictime(Victime p_Victime) {
        if(p_Victime != null)
            {
                p_Victime._setUnTemoin(this);
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
                case DecouvreVictime:
                {
                    DecouvreVictime_add(animStates);
                }
                break;
                case Marche:
                {
                    Marche_add(animStates);
                }
                break;
                case Attente:
                {
                    Attente_add(animStates);
                }
                break;
                case VaHopital:
                {
                    VaHopital_add(animStates);
                }
                break;
                case Part:
                {
                    Part_add(animStates);
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
                case DecouvreVictime:
                {
                    res = DecouvreVictime_takeEvent(id);
                }
                break;
                case Marche:
                {
                    res = Marche_takeEvent(id);
                }
                break;
                case Attente:
                {
                    res = Attente_takeEvent(id);
                }
                break;
                case VaHopital:
                {
                    res = VaHopital_takeEvent(id);
                }
                break;
                case Part:
                {
                    res = Part_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void VaHopital_add(AnimStates animStates) {
            animStates.add("ROOT.VaHopital");
        }
        
        //## statechart_method 
        public void Part_add(AnimStates animStates) {
            animStates.add("ROOT.Part");
        }
        
        //## statechart_method 
        public void Marche_add(AnimStates animStates) {
            animStates.add("ROOT.Marche");
        }
        
        //## statechart_method 
        public void DecouvreVictime_add(AnimStates animStates) {
            animStates.add("ROOT.DecouvreVictime");
        }
        
        //## statechart_method 
        public void Attente_add(AnimStates animStates) {
            animStates.add("ROOT.Attente");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int MarcheTakeEventDecouvreVictime() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Marche_exit();
            DecouvreVictime_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int DecouvreVictime_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = DecouvreVictimeTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int VaHopital_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void DecouvreVictimeExit() {
        }
        
        //## statechart_method 
        public void MarcheExit() {
        }
        
        //## statechart_method 
        public void MarcheEnter() {
        }
        
        //## statechart_method 
        public void Attente_entDef() {
            Attente_enter();
        }
        
        //## statechart_method 
        public void VaHopitalExit() {
        }
        
        //## statechart_method 
        public void Attente_enter() {
            animInstance().notifyStateEntered("ROOT.Attente");
            rootState_subState = Attente;
            rootState_active = Attente;
            AttenteEnter();
        }
        
        //## statechart_method 
        public void VaHopital_entDef() {
            VaHopital_enter();
        }
        
        //## statechart_method 
        public void DecouvreVictimeEnter() {
        }
        
        //## statechart_method 
        public int Marche_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventDecouvreVictime.EventDecouvreVictime_Default_id))
                {
                    res = MarcheTakeEventDecouvreVictime();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Marche_exit() {
            MarcheExit();
            animInstance().notifyStateExited("ROOT.Marche");
        }
        
        //## statechart_method 
        public void PartExit() {
        }
        
        //## statechart_method 
        public void Marche_enter() {
            animInstance().notifyStateEntered("ROOT.Marche");
            rootState_subState = Marche;
            rootState_active = Marche;
            MarcheEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void PartEnter() {
        }
        
        //## statechart_method 
        public void Part_entDef() {
            Part_enter();
        }
        
        //## statechart_method 
        public void VaHopitalEnter() {
        }
        
        //## statechart_method 
        public int DecouvreVictimeTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            DecouvreVictime_exit();
            //#[ transition 2 
            previentSecours();
            //#]
            Attente_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void DecouvreVictime_exit() {
            popNullConfig();
            DecouvreVictimeExit();
            animInstance().notifyStateExited("ROOT.DecouvreVictime");
        }
        
        //## statechart_method 
        public int Part_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
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
        public int AttenteTakeEventVaHopital() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Attente_exit();
            VaHopital_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void AttenteEnter() {
        }
        
        //## statechart_method 
        public void DecouvreVictime_enter() {
            animInstance().notifyStateEntered("ROOT.DecouvreVictime");
            pushNullConfig();
            rootState_subState = DecouvreVictime;
            rootState_active = DecouvreVictime;
            DecouvreVictimeEnter();
        }
        
        //## statechart_method 
        public void Part_exit() {
            PartExit();
            animInstance().notifyStateExited("ROOT.Part");
        }
        
        //## statechart_method 
        public void VaHopital_exit() {
            VaHopitalExit();
            animInstance().notifyStateExited("ROOT.VaHopital");
        }
        
        //## statechart_method 
        public void VaHopital_enter() {
            animInstance().notifyStateEntered("ROOT.VaHopital");
            rootState_subState = VaHopital;
            rootState_active = VaHopital;
            VaHopitalEnter();
        }
        
        //## statechart_method 
        public void DecouvreVictime_entDef() {
            DecouvreVictime_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Marche_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void Attente_exit() {
            AttenteExit();
            animInstance().notifyStateExited("ROOT.Attente");
        }
        
        //## statechart_method 
        public void AttenteExit() {
        }
        
        //## statechart_method 
        public void Part_enter() {
            animInstance().notifyStateEntered("ROOT.Part");
            rootState_subState = Part;
            rootState_active = Part;
            PartEnter();
        }
        
        //## statechart_method 
        public int AttenteTakeEventCamionPompierArrive() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Attente_exit();
            Part_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Marche_entDef() {
            Marche_enter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int Attente_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventCamionPompierArrive.EventCamionPompierArrive_Default_id))
                {
                    res = AttenteTakeEventCamionPompierArrive();
                }
            else if(event.isTypeOf(EventVaHopital.EventVaHopital_Default_id))
                {
                    res = AttenteTakeEventVaHopital();
                }
            
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
            return Temoin.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassTemoin; 
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
        
        msg.add("unVictime", false, true, unVictime);
        msg.add("unPompier", false, true, unPompier);
        msg.add("unCentreTraitementUrgence", false, true, unCentreTraitementUrgence);
        msg.add("unCentreGestionMessage", false, true, unCentreGestionMessage);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Temoin.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Temoin.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Temoin.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Temoin.java
*********************************************************************/

