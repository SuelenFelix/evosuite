package org.openRealmOfStars.game.state;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DiplomacyView_createTradeEmbargoChoicesLines_3265773077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1624654;

    public DiplomacyView_createTradeEmbargoChoicesLines_3265773077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1624654 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1624654, term1624654.getClass(), "human", null);
        setField(term1624654, term1624654.getClass(), "borderCrossedFleet", null);
        setField(term1624654, term1624654.getClass(), "ai", null);
        setField(term1624654, term1624654.getClass(), "starMap", null);
        setField(term1624654, term1624654.getClass(), "trade", null);
        setField(term1624654, term1624654.getClass(), "humanTechListOffer", null);
        setField(term1624654, term1624654.getClass(), "aiTechListOffer", null);
        setField(term1624654, term1624654.getClass(), "humanFleetListOffer", null);
        setField(term1624654, term1624654.getClass(), "aiFleetListOffer", null);
        setField(term1624654, term1624654.getClass(), "humanPlanetListOffer", null);
        setField(term1624654, term1624654.getClass(), "aiPlanetListOffer", null);
        setField(term1624654, term1624654.getClass(), "humanCreditOffer", null);
        setIntField(term1624654, term1624654.getClass(), "humanCredits", 0);
        setField(term1624654, term1624654.getClass(), "humanArtifactOffer", null);
        setIntField(term1624654, term1624654.getClass(), "humanArtifacts", 0);
        setField(term1624654, term1624654.getClass(), "aiCreditOffer", null);
        setIntField(term1624654, term1624654.getClass(), "aiCredits", 0);
        setField(term1624654, term1624654.getClass(), "aiArtifactOffer", null);
        setIntField(term1624654, term1624654.getClass(), "aiArtifacts", 0);
        setField(term1624654, term1624654.getClass(), "humanLines", null);
        setField(term1624654, term1624654.getClass(), "humanMapPlanetsOffer", null);
        setField(term1624654, term1624654.getClass(), "aiMapPlanetsOffer", null);
        setField(term1624654, term1624654.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1624654, term1624654.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1624654, term1624654.getClass(), "humanMapOffer", null);
        setField(term1624654, term1624654.getClass(), "aiMapOffer", null);
        setField(term1624654, term1624654.getClass(), "humanVoteYes", null);
        setField(term1624654, term1624654.getClass(), "humanVoteNo", null);
        setField(term1624654, term1624654.getClass(), "aiVoteYes", null);
        setField(term1624654, term1624654.getClass(), "aiVoteNo", null);
        setField(term1624654, term1624654.getClass(), "infoText", null);
        setField(term1624654, term1624654.getClass(), "likenessLabel", null);
        setField(term1624654, term1624654.getClass(), "endBtn", null);
        setField(term1624654, term1624654.getClass(), "meetingPlace", null);
        setBooleanField(term1624654, term1624654.getClass(), "tradeHappened", false);
        setField(term1624654, term1624654.getClass(), "aiImg", null);
        setIntField(term1624654, term1624654.getClass(), "textCounter", 0);
        setField(term1624654, term1624654.getClass(), "lastSpeechType", null);
        setField(term1624654, term1624654.getClass(), "embargoLine", null);
        setField(term1624654, term1624654.getClass(), "game", null);
        setBooleanField(term1624654, term1624654.getClass(), "isAlignmentXSet", false);
        setFloatField(term1624654, term1624654.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1624654, term1624654.getClass(), "isAlignmentYSet", false);
        setFloatField(term1624654, term1624654.getClass(), "alignmentY", 0.0F);
        setField(term1624654, term1624654.getClass(), "ui", null);
        setField(term1624654, term1624654.getClass(), "listenerList", null);
        setField(term1624654, term1624654.getClass(), "clientProperties", null);
        setField(term1624654, term1624654.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1624654, term1624654.getClass(), "autoscrolls", false);
        setField(term1624654, term1624654.getClass(), "border", null);
        setIntField(term1624654, term1624654.getClass(), "flags", 0);
        setField(term1624654, term1624654.getClass(), "inputVerifier", null);
        setBooleanField(term1624654, term1624654.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1624654, term1624654.getClass(), "paintingChild", null);
        setField(term1624654, term1624654.getClass(), "popupMenu", null);
        setField(term1624654, term1624654.getClass(), "revalidateRunnableScheduled", null);
        setField(term1624654, term1624654.getClass(), "focusInputMap", null);
        setField(term1624654, term1624654.getClass(), "ancestorInputMap", null);
        setField(term1624654, term1624654.getClass(), "windowInputMap", null);
        setField(term1624654, term1624654.getClass(), "actionMap", null);
        setField(term1624654, term1624654.getClass(), "aaHint", null);
        setField(term1624654, term1624654.getClass(), "lcdRenderingHint", null);
        setField(term1624654, term1624654.getClass(), "component", null);
        setField(term1624654, term1624654.getClass(), "layoutMgr", null);
        setField(term1624654, term1624654.getClass(), "dispatcher", null);
        setField(term1624654, term1624654.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1624654, term1624654.getClass(), "focusCycleRoot", false);
        setBooleanField(term1624654, term1624654.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1624654, term1624654.getClass(), "printingThreads", null);
        setBooleanField(term1624654, term1624654.getClass(), "printing", false);
        setField(term1624654, term1624654.getClass(), "containerListener", null);
        setIntField(term1624654, term1624654.getClass(), "listeningChildren", 0);
        setIntField(term1624654, term1624654.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1624654, term1624654.getClass(), "descendantsCount", 0);
        setField(term1624654, term1624654.getClass(), "preserveBackgroundColor", null);
        setIntField(term1624654, term1624654.getClass(), "numOfHWComponents", 0);
        setIntField(term1624654, term1624654.getClass(), "numOfLWComponents", 0);
        setField(term1624654, term1624654.getClass(), "modalComp", null);
        setField(term1624654, term1624654.getClass(), "modalAppContext", null);
        setIntField(term1624654, term1624654.getClass(), "containerSerializedDataVersion", 0);
        setField(term1624654, term1624654.getClass(), "peer", null);
        setField(term1624654, term1624654.getClass(), "parent", null);
        setField(term1624654, term1624654.getClass(), "appContext", null);
        setIntField(term1624654, term1624654.getClass(), "x", 0);
        setIntField(term1624654, term1624654.getClass(), "y", 0);
        setIntField(term1624654, term1624654.getClass(), "width", 0);
        setIntField(term1624654, term1624654.getClass(), "height", 0);
        setField(term1624654, term1624654.getClass(), "foreground", null);
        setField(term1624654, term1624654.getClass(), "background", null);
        setField(term1624654, term1624654.getClass(), "font", null);
        setField(term1624654, term1624654.getClass(), "peerFont", null);
        setField(term1624654, term1624654.getClass(), "cursor", null);
        setField(term1624654, term1624654.getClass(), "locale", null);
        setField(term1624654, term1624654.getClass(), "graphicsConfig", null);
        setField(term1624654, term1624654.getClass(), "bufferStrategy", null);
        setBooleanField(term1624654, term1624654.getClass(), "ignoreRepaint", false);
        setBooleanField(term1624654, term1624654.getClass(), "visible", false);
        setBooleanField(term1624654, term1624654.getClass(), "enabled", false);
        setBooleanField(term1624654, term1624654.getClass(), "valid", false);
        setField(term1624654, term1624654.getClass(), "dropTarget", null);
        setField(term1624654, term1624654.getClass(), "popups", null);
        setField(term1624654, term1624654.getClass(), "name", null);
        setBooleanField(term1624654, term1624654.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1624654, term1624654.getClass(), "focusable", false);
        setIntField(term1624654, term1624654.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1624654, term1624654.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1624654, term1624654.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1624654, term1624654.getClass(), "acc", null);
        setField(term1624654, term1624654.getClass(), "minSize", null);
        setBooleanField(term1624654, term1624654.getClass(), "minSizeSet", false);
        setField(term1624654, term1624654.getClass(), "prefSize", null);
        setBooleanField(term1624654, term1624654.getClass(), "prefSizeSet", false);
        setField(term1624654, term1624654.getClass(), "maxSize", null);
        setBooleanField(term1624654, term1624654.getClass(), "maxSizeSet", false);
        setField(term1624654, term1624654.getClass(), "componentOrientation", null);
        setBooleanField(term1624654, term1624654.getClass(), "newEventsOnly", false);
        setField(term1624654, term1624654.getClass(), "componentListener", null);
        setField(term1624654, term1624654.getClass(), "focusListener", null);
        setField(term1624654, term1624654.getClass(), "hierarchyListener", null);
        setField(term1624654, term1624654.getClass(), "hierarchyBoundsListener", null);
        setField(term1624654, term1624654.getClass(), "keyListener", null);
        setField(term1624654, term1624654.getClass(), "mouseListener", null);
        setField(term1624654, term1624654.getClass(), "mouseMotionListener", null);
        setField(term1624654, term1624654.getClass(), "mouseWheelListener", null);
        setField(term1624654, term1624654.getClass(), "inputMethodListener", null);
        setLongField(term1624654, term1624654.getClass(), "eventMask", 0L);
        setField(term1624654, term1624654.getClass(), "changeSupport", null);
        setField(term1624654, term1624654.getClass(), "objectLock", null);
        setBooleanField(term1624654, term1624654.getClass(), "isPacked", false);
        setIntField(term1624654, term1624654.getClass(), "boundsOp", 0);
        setField(term1624654, term1624654.getClass(), "compoundShape", null);
        setField(term1624654, term1624654.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1624654, term1624654.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1624654, term1624654.getClass(), "backgroundEraseDisabled", false);
        setField(term1624654, term1624654.getClass(), "eventCache", null);
        setBooleanField(term1624654, term1624654.getClass(), "coalescingEnabled", false);
        setBooleanField(term1624654, term1624654.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1624654, term1624654.getClass(), "componentSerializedDataVersion", 0);
        setField(term1624654, term1624654.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createTradeEmbargoChoicesLines", argTypes, term1624654, args);
    }

};


