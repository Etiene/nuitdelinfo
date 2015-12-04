/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Temoin
//!	Generated Date	: Fri, 4, Dec 2015 
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
    
    protected CentreAppel unCentreAppel;		//## link unCentreAppel 
    
    protected centreCommandement unCentreCommandement;		//## link unCentreCommandement 
    
    protected otage unOtage;		//## link unOtage 
    
    protected Terroriste unTerroriste;		//## link unTerroriste 
    
    protected Victime unVictime;		//## link unVictime 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int VoitVictimeBlesse=1;
    public static final int Normal=2;
    public static final int FinAppelCentreAppel=3;
    public static final int EnAttenteInstruction=4;
    public static final int DebutAppelCentreAppel=5;
    public static final int CooperationCentreCommandement=6;
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
    
    //## operation cooperation() 
    public void cooperation() {
        try {
            animInstance().notifyMethodEntered("cooperation",
               new ArgData[] {
               });
        
        //#[ operation cooperation() 
        System.out.println("Le temoin est en cooperation avec le centre de commandement");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation debutAppelCentreAppel() 
    public void debutAppelCentreAppel() {
        try {
            animInstance().notifyMethodEntered("debutAppelCentreAppel",
               new ArgData[] {
               });
        
        //#[ operation debutAppelCentreAppel() 
        unCentreAppel.gen (new EventDebutAppelTemoin());
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation enAttenteInstruction() 
    public void enAttenteInstruction() {
        try {
            animInstance().notifyMethodEntered("enAttenteInstruction",
               new ArgData[] {
               });
        
        //#[ operation enAttenteInstruction() 
        System.out.println("En attente instruction");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation finAppelCentreAppel() 
    public void finAppelCentreAppel() {
        try {
            animInstance().notifyMethodEntered("finAppelCentreAppel",
               new ArgData[] {
               });
        
        //#[ operation finAppelCentreAppel() 
        this.gen(new EventEnAttenteInstruction());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation finCooperation() 
    public void finCooperation() {
        try {
            animInstance().notifyMethodEntered("finCooperation",
               new ArgData[] {
               });
        
        //#[ operation finCooperation() 
        System.out.println("Fin de la cooperation");
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation voitVictimeBlesse() 
    public void voitVictimeBlesse() {
        try {
            animInstance().notifyMethodEntered("voitVictimeBlesse",
               new ArgData[] {
               });
        
        //#[ operation voitVictimeBlesse() 
        System.out.println("le temoin voit la victime et le terroriste");  
        this.gen(new EventDebutAppelCentreAppel());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public CentreAppel getUnCentreAppel() {
        return unCentreAppel;
    }
    
    //## auto_generated 
    public void __setUnCentreAppel(CentreAppel p_CentreAppel) {
        unCentreAppel = p_CentreAppel;
        if(p_CentreAppel != null)
            {
                animInstance().notifyRelationAdded("unCentreAppel", p_CentreAppel);
            }
        else
            {
                animInstance().notifyRelationCleared("unCentreAppel");
            }
    }
    
    //## auto_generated 
    public void _setUnCentreAppel(CentreAppel p_CentreAppel) {
        if(unCentreAppel != null)
            {
                unCentreAppel.__setUnTemoin(null);
            }
        __setUnCentreAppel(p_CentreAppel);
    }
    
    //## auto_generated 
    public void setUnCentreAppel(CentreAppel p_CentreAppel) {
        if(p_CentreAppel != null)
            {
                p_CentreAppel._setUnTemoin(this);
            }
        _setUnCentreAppel(p_CentreAppel);
    }
    
    //## auto_generated 
    public void _clearUnCentreAppel() {
        animInstance().notifyRelationCleared("unCentreAppel");
        unCentreAppel = null;
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
                unCentreCommandement.__setUnTemoin(null);
            }
        __setUnCentreCommandement(p_centreCommandement);
    }
    
    //## auto_generated 
    public void setUnCentreCommandement(centreCommandement p_centreCommandement) {
        if(p_centreCommandement != null)
            {
                p_centreCommandement._setUnTemoin(this);
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
                unOtage.__setUnTemoin(null);
            }
        __setUnOtage(p_otage);
    }
    
    //## auto_generated 
    public void setUnOtage(otage p_otage) {
        if(p_otage != null)
            {
                p_otage._setUnTemoin(this);
            }
        _setUnOtage(p_otage);
    }
    
    //## auto_generated 
    public void _clearUnOtage() {
        animInstance().notifyRelationCleared("unOtage");
        unOtage = null;
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
                unTerroriste.__setUnTemoin(null);
            }
        __setUnTerroriste(p_Terroriste);
    }
    
    //## auto_generated 
    public void setUnTerroriste(Terroriste p_Terroriste) {
        if(p_Terroriste != null)
            {
                p_Terroriste._setUnTemoin(this);
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
                case Normal:
                {
                    Normal_add(animStates);
                }
                break;
                case VoitVictimeBlesse:
                {
                    VoitVictimeBlesse_add(animStates);
                }
                break;
                case CooperationCentreCommandement:
                {
                    CooperationCentreCommandement_add(animStates);
                }
                break;
                case EnAttenteInstruction:
                {
                    EnAttenteInstruction_add(animStates);
                }
                break;
                case DebutAppelCentreAppel:
                {
                    DebutAppelCentreAppel_add(animStates);
                }
                break;
                case FinAppelCentreAppel:
                {
                    FinAppelCentreAppel_add(animStates);
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
                case Normal:
                {
                    res = Normal_takeEvent(id);
                }
                break;
                case VoitVictimeBlesse:
                {
                    res = VoitVictimeBlesse_takeEvent(id);
                }
                break;
                case CooperationCentreCommandement:
                {
                    res = CooperationCentreCommandement_takeEvent(id);
                }
                break;
                case EnAttenteInstruction:
                {
                    res = EnAttenteInstruction_takeEvent(id);
                }
                break;
                case DebutAppelCentreAppel:
                {
                    res = DebutAppelCentreAppel_takeEvent(id);
                }
                break;
                case FinAppelCentreAppel:
                {
                    res = FinAppelCentreAppel_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void VoitVictimeBlesse_add(AnimStates animStates) {
            animStates.add("ROOT.VoitVictimeBlesse");
        }
        
        //## statechart_method 
        public void Normal_add(AnimStates animStates) {
            animStates.add("ROOT.Normal");
        }
        
        //## statechart_method 
        public void FinAppelCentreAppel_add(AnimStates animStates) {
            animStates.add("ROOT.FinAppelCentreAppel");
        }
        
        //## statechart_method 
        public void EnAttenteInstruction_add(AnimStates animStates) {
            animStates.add("ROOT.EnAttenteInstruction");
        }
        
        //## statechart_method 
        public void DebutAppelCentreAppel_add(AnimStates animStates) {
            animStates.add("ROOT.DebutAppelCentreAppel");
        }
        
        //## statechart_method 
        public void CooperationCentreCommandement_add(AnimStates animStates) {
            animStates.add("ROOT.CooperationCentreCommandement");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void CooperationCentreCommandement_exit() {
            CooperationCentreCommandementExit();
            animInstance().notifyStateExited("ROOT.CooperationCentreCommandement");
        }
        
        //## statechart_method 
        public void EnAttenteInstructionEnter() {
        }
        
        //## statechart_method 
        public void FinAppelCentreAppel_enter() {
            animInstance().notifyStateEntered("ROOT.FinAppelCentreAppel");
            rootState_subState = FinAppelCentreAppel;
            rootState_active = FinAppelCentreAppel;
            FinAppelCentreAppelEnter();
        }
        
        //## statechart_method 
        public void Normal_entDef() {
            Normal_enter();
        }
        
        //## statechart_method 
        public void DebutAppelCentreAppelEnter() {
        }
        
        //## statechart_method 
        public void FinAppelCentreAppelEnter() {
        }
        
        //## statechart_method 
        public void VoitVictimeBlesse_entDef() {
            VoitVictimeBlesse_enter();
        }
        
        //## statechart_method 
        public void EnAttenteInstructionExit() {
        }
        
        //## statechart_method 
        public void EnAttenteInstruction_enter() {
            animInstance().notifyStateEntered("ROOT.EnAttenteInstruction");
            rootState_subState = EnAttenteInstruction;
            rootState_active = EnAttenteInstruction;
            EnAttenteInstructionEnter();
        }
        
        //## statechart_method 
        public int FinAppelCentreAppel_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventEnAttenteInstruction.EventEnAttenteInstruction_Default_id))
                {
                    res = FinAppelCentreAppelTakeEventEnAttenteInstruction();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int VoitVictimeBlesse_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventDebutAppelCentreAppel.EventDebutAppelCentreAppel_Default_id))
                {
                    res = VoitVictimeBlesseTakeEventDebutAppelCentreAppel();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void CooperationCentreCommandement_entDef() {
            CooperationCentreCommandement_enter();
        }
        
        //## statechart_method 
        public void EnAttenteInstruction_exit() {
            EnAttenteInstructionExit();
            animInstance().notifyStateExited("ROOT.EnAttenteInstruction");
        }
        
        //## statechart_method 
        public void VoitVictimeBlesse_enter() {
            animInstance().notifyStateEntered("ROOT.VoitVictimeBlesse");
            rootState_subState = VoitVictimeBlesse;
            rootState_active = VoitVictimeBlesse;
            VoitVictimeBlesseEnter();
        }
        
        //## statechart_method 
        public void DebutAppelCentreAppel_exit() {
            DebutAppelCentreAppelExit();
            animInstance().notifyStateExited("ROOT.DebutAppelCentreAppel");
        }
        
        //## statechart_method 
        public void EnAttenteInstruction_entDef() {
            EnAttenteInstruction_enter();
        }
        
        //## statechart_method 
        public void FinAppelCentreAppel_exit() {
            FinAppelCentreAppelExit();
            animInstance().notifyStateExited("ROOT.FinAppelCentreAppel");
        }
        
        //## statechart_method 
        public int CooperationCentreCommandement_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventFinCooperation.EventFinCooperation_Default_id))
                {
                    res = CooperationCentreCommandementTakeEventFinCooperation();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int EnAttenteInstruction_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventCooperation.EventCooperation_Default_id))
                {
                    res = EnAttenteInstructionTakeEventCooperation();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int EnAttenteInstructionTakeEventCooperation() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            EnAttenteInstruction_exit();
            //#[ transition 3 
            cooperation();
            //#]
            CooperationCentreCommandement_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void CooperationCentreCommandementExit() {
        }
        
        //## statechart_method 
        public int DebutAppelCentreAppel_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventFinAppelCentreAppel.EventFinAppelCentreAppel_Default_id))
                {
                    res = DebutAppelCentreAppelTakeEventFinAppelCentreAppel();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void VoitVictimeBlesseExit() {
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void CooperationCentreCommandement_enter() {
            animInstance().notifyStateEntered("ROOT.CooperationCentreCommandement");
            rootState_subState = CooperationCentreCommandement;
            rootState_active = CooperationCentreCommandement;
            CooperationCentreCommandementEnter();
        }
        
        //## statechart_method 
        public int NormalTakeEventTirSurVictime() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Normal_exit();
            //#[ transition 2 
            voitVictimeBlesse();
            //#]
            VoitVictimeBlesse_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void VoitVictimeBlesseEnter() {
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
        public int Normal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventTirSurVictime.EventTirSurVictime_Default_id))
                {
                    res = NormalTakeEventTirSurVictime();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int DebutAppelCentreAppelTakeEventFinAppelCentreAppel() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            DebutAppelCentreAppel_exit();
            //#[ transition 5 
            finAppelCentreAppel();
            //#]
            FinAppelCentreAppel_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void FinAppelCentreAppel_entDef() {
            FinAppelCentreAppel_enter();
        }
        
        //## statechart_method 
        public void VoitVictimeBlesse_exit() {
            VoitVictimeBlesseExit();
            animInstance().notifyStateExited("ROOT.VoitVictimeBlesse");
        }
        
        //## statechart_method 
        public int FinAppelCentreAppelTakeEventEnAttenteInstruction() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            FinAppelCentreAppel_exit();
            //#[ transition 6 
            enAttenteInstruction();
            //#]
            EnAttenteInstruction_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Normal_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void DebutAppelCentreAppelExit() {
        }
        
        //## statechart_method 
        public void DebutAppelCentreAppel_enter() {
            animInstance().notifyStateEntered("ROOT.DebutAppelCentreAppel");
            rootState_subState = DebutAppelCentreAppel;
            rootState_active = DebutAppelCentreAppel;
            DebutAppelCentreAppelEnter();
        }
        
        //## statechart_method 
        public void FinAppelCentreAppelExit() {
        }
        
        //## statechart_method 
        public void NormalEnter() {
        }
        
        //## statechart_method 
        public int CooperationCentreCommandementTakeEventFinCooperation() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            CooperationCentreCommandement_exit();
            //#[ transition 1 
            finCooperation();
            //#]
            Normal_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void CooperationCentreCommandementEnter() {
        }
        
        //## statechart_method 
        public void DebutAppelCentreAppel_entDef() {
            DebutAppelCentreAppel_enter();
        }
        
        //## statechart_method 
        public void NormalExit() {
        }
        
        //## statechart_method 
        public void Normal_enter() {
            animInstance().notifyStateEntered("ROOT.Normal");
            rootState_subState = Normal;
            rootState_active = Normal;
            NormalEnter();
        }
        
        //## statechart_method 
        public int VoitVictimeBlesseTakeEventDebutAppelCentreAppel() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            VoitVictimeBlesse_exit();
            //#[ transition 4 
            debutAppelCentreAppel();
            //#]
            DebutAppelCentreAppel_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Normal_exit() {
            NormalExit();
            animInstance().notifyStateExited("ROOT.Normal");
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
        msg.add("unOtage", false, true, unOtage);
        msg.add("unCentreAppel", false, true, unCentreAppel);
        msg.add("unTerroriste", false, true, unTerroriste);
        msg.add("unCentreCommandement", false, true, unCentreCommandement);
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

