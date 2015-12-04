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
import com.ibm.rational.rhapsody.oxf.states.*;

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
public class Temoin implements RiJStateConcept {
    
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
    public static final int EnAttenteInstruction=3;
    public static final int CooperationCentreCommandement=4;
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
        reactive = new Reactive(p_thread);
    }
    
    //## operation appelleCentreAppel() 
    public void appelleCentreAppel() {
        //#[ operation appelleCentreAppel() 
        System.out.println("le temoin appelle le centre d'appel");              
        unCentreAppel.gen( new EventRecoitAppel());
        
        //#]
    }
    
    //## operation cooperation() 
    public void cooperation() {
        //#[ operation cooperation() 
        System.out.println("Le temoin est en cooperation avec le centre de commandement");
        //#]
    }
    
    //## operation finCooperation() 
    public void finCooperation() {
        //#[ operation finCooperation() 
        System.out.println("Fin de la cooperation");
        //#]
    }
    
    //## operation voitVictimeBlesse() 
    public void voitVictimeBlesse() {
        //#[ operation voitVictimeBlesse() 
        System.out.println("le temoin voit la victime et le terroriste");  
        new EventAppelleCentreAppel();
        //#]
    }
    
    //## auto_generated 
    public CentreAppel getUnCentreAppel() {
        return unCentreAppel;
    }
    
    //## auto_generated 
    public void __setUnCentreAppel(CentreAppel p_CentreAppel) {
        unCentreAppel = p_CentreAppel;
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
        unCentreAppel = null;
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
        unOtage = null;
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
        unTerroriste = null;
    }
    
    //## auto_generated 
    public Victime getUnVictime() {
        return unVictime;
    }
    
    //## auto_generated 
    public void __setUnVictime(Victime p_Victime) {
        unVictime = p_Victime;
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
        unVictime = null;
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
        public void CooperationCentreCommandement_exit() {
            CooperationCentreCommandementExit();
        }
        
        //## statechart_method 
        public void EnAttenteInstructionEnter() {
        }
        
        //## statechart_method 
        public void Normal_entDef() {
            Normal_enter();
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
            rootState_subState = EnAttenteInstruction;
            rootState_active = EnAttenteInstruction;
            EnAttenteInstructionEnter();
        }
        
        //## statechart_method 
        public int VoitVictimeBlesse_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EventAppelleCentreAppel.EventAppelleCentreAppel_Default_id))
                {
                    res = VoitVictimeBlesseTakeEventAppelleCentreAppel();
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
        }
        
        //## statechart_method 
        public void VoitVictimeBlesse_enter() {
            rootState_subState = VoitVictimeBlesse;
            rootState_active = VoitVictimeBlesse;
            VoitVictimeBlesseEnter();
        }
        
        //## statechart_method 
        public void EnAttenteInstruction_entDef() {
            EnAttenteInstruction_enter();
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
            EnAttenteInstruction_exit();
            //#[ transition 4 
            cooperation();
            //#]
            CooperationCentreCommandement_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void CooperationCentreCommandementExit() {
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
            rootState_subState = CooperationCentreCommandement;
            rootState_active = CooperationCentreCommandement;
            CooperationCentreCommandementEnter();
        }
        
        //## statechart_method 
        public int NormalTakeEventTirSurVictime() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Normal_exit();
            //#[ transition 2 
            voitVictimeBlesse();
            //#]
            VoitVictimeBlesse_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void VoitVictimeBlesseEnter() {
        }
        
        //## statechart_method 
        public void rootState_enter() {
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
        public void VoitVictimeBlesse_exit() {
            VoitVictimeBlesseExit();
        }
        
        //## statechart_method 
        public int VoitVictimeBlesseTakeEventAppelleCentreAppel() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            VoitVictimeBlesse_exit();
            //#[ transition 3 
            appelleCentreAppel();
            //#]
            EnAttenteInstruction_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            Normal_entDef();
        }
        
        //## statechart_method 
        public void NormalEnter() {
        }
        
        //## statechart_method 
        public int CooperationCentreCommandementTakeEventFinCooperation() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            CooperationCentreCommandement_exit();
            //#[ transition 1 
            finCooperation();
            //#]
            Normal_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void CooperationCentreCommandementEnter() {
        }
        
        //## statechart_method 
        public void NormalExit() {
        }
        
        //## statechart_method 
        public void Normal_enter() {
            rootState_subState = Normal;
            rootState_active = Normal;
            NormalEnter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Normal_exit() {
            NormalExit();
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Temoin.java
*********************************************************************/

