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

public class DiplomacyView_createTradeEmbargoLine_66977704211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1641570;

    public DiplomacyView_createTradeEmbargoLine_66977704211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1641570 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1641570, term1641570.getClass(), "human", null);
        setField(term1641570, term1641570.getClass(), "borderCrossedFleet", null);
        setField(term1641570, term1641570.getClass(), "ai", null);
        setField(term1641570, term1641570.getClass(), "starMap", null);
        setField(term1641570, term1641570.getClass(), "trade", null);
        setField(term1641570, term1641570.getClass(), "humanTechListOffer", null);
        setField(term1641570, term1641570.getClass(), "aiTechListOffer", null);
        setField(term1641570, term1641570.getClass(), "humanFleetListOffer", null);
        setField(term1641570, term1641570.getClass(), "aiFleetListOffer", null);
        setField(term1641570, term1641570.getClass(), "humanPlanetListOffer", null);
        setField(term1641570, term1641570.getClass(), "aiPlanetListOffer", null);
        setField(term1641570, term1641570.getClass(), "humanCreditOffer", null);
        setIntField(term1641570, term1641570.getClass(), "humanCredits", 0);
        setField(term1641570, term1641570.getClass(), "humanArtifactOffer", null);
        setIntField(term1641570, term1641570.getClass(), "humanArtifacts", 0);
        setField(term1641570, term1641570.getClass(), "aiCreditOffer", null);
        setIntField(term1641570, term1641570.getClass(), "aiCredits", 0);
        setField(term1641570, term1641570.getClass(), "aiArtifactOffer", null);
        setIntField(term1641570, term1641570.getClass(), "aiArtifacts", 0);
        setField(term1641570, term1641570.getClass(), "humanLines", null);
        setField(term1641570, term1641570.getClass(), "humanMapPlanetsOffer", null);
        setField(term1641570, term1641570.getClass(), "aiMapPlanetsOffer", null);
        setField(term1641570, term1641570.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1641570, term1641570.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1641570, term1641570.getClass(), "humanMapOffer", null);
        setField(term1641570, term1641570.getClass(), "aiMapOffer", null);
        setField(term1641570, term1641570.getClass(), "humanVoteYes", null);
        setField(term1641570, term1641570.getClass(), "humanVoteNo", null);
        setField(term1641570, term1641570.getClass(), "aiVoteYes", null);
        setField(term1641570, term1641570.getClass(), "aiVoteNo", null);
        setField(term1641570, term1641570.getClass(), "infoText", null);
        setField(term1641570, term1641570.getClass(), "likenessLabel", null);
        setField(term1641570, term1641570.getClass(), "endBtn", null);
        setField(term1641570, term1641570.getClass(), "meetingPlace", null);
        setBooleanField(term1641570, term1641570.getClass(), "tradeHappened", false);
        setField(term1641570, term1641570.getClass(), "aiImg", null);
        setIntField(term1641570, term1641570.getClass(), "textCounter", 0);
        setField(term1641570, term1641570.getClass(), "lastSpeechType", null);
        setField(term1641570, term1641570.getClass(), "embargoLine", null);
        setField(term1641570, term1641570.getClass(), "game", null);
        setBooleanField(term1641570, term1641570.getClass(), "isAlignmentXSet", false);
        setFloatField(term1641570, term1641570.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1641570, term1641570.getClass(), "isAlignmentYSet", false);
        setFloatField(term1641570, term1641570.getClass(), "alignmentY", 0.0F);
        setField(term1641570, term1641570.getClass(), "ui", null);
        setField(term1641570, term1641570.getClass(), "listenerList", null);
        setField(term1641570, term1641570.getClass(), "clientProperties", null);
        setField(term1641570, term1641570.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1641570, term1641570.getClass(), "autoscrolls", false);
        setField(term1641570, term1641570.getClass(), "border", null);
        setIntField(term1641570, term1641570.getClass(), "flags", 0);
        setField(term1641570, term1641570.getClass(), "inputVerifier", null);
        setBooleanField(term1641570, term1641570.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1641570, term1641570.getClass(), "paintingChild", null);
        setField(term1641570, term1641570.getClass(), "popupMenu", null);
        setField(term1641570, term1641570.getClass(), "revalidateRunnableScheduled", null);
        setField(term1641570, term1641570.getClass(), "focusInputMap", null);
        setField(term1641570, term1641570.getClass(), "ancestorInputMap", null);
        setField(term1641570, term1641570.getClass(), "windowInputMap", null);
        setField(term1641570, term1641570.getClass(), "actionMap", null);
        setField(term1641570, term1641570.getClass(), "aaHint", null);
        setField(term1641570, term1641570.getClass(), "lcdRenderingHint", null);
        setField(term1641570, term1641570.getClass(), "component", null);
        setField(term1641570, term1641570.getClass(), "layoutMgr", null);
        setField(term1641570, term1641570.getClass(), "dispatcher", null);
        setField(term1641570, term1641570.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1641570, term1641570.getClass(), "focusCycleRoot", false);
        setBooleanField(term1641570, term1641570.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1641570, term1641570.getClass(), "printingThreads", null);
        setBooleanField(term1641570, term1641570.getClass(), "printing", false);
        setField(term1641570, term1641570.getClass(), "containerListener", null);
        setIntField(term1641570, term1641570.getClass(), "listeningChildren", 0);
        setIntField(term1641570, term1641570.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1641570, term1641570.getClass(), "descendantsCount", 0);
        setField(term1641570, term1641570.getClass(), "preserveBackgroundColor", null);
        setIntField(term1641570, term1641570.getClass(), "numOfHWComponents", 0);
        setIntField(term1641570, term1641570.getClass(), "numOfLWComponents", 0);
        setField(term1641570, term1641570.getClass(), "modalComp", null);
        setField(term1641570, term1641570.getClass(), "modalAppContext", null);
        setIntField(term1641570, term1641570.getClass(), "containerSerializedDataVersion", 0);
        setField(term1641570, term1641570.getClass(), "peer", null);
        setField(term1641570, term1641570.getClass(), "parent", null);
        setField(term1641570, term1641570.getClass(), "appContext", null);
        setIntField(term1641570, term1641570.getClass(), "x", 0);
        setIntField(term1641570, term1641570.getClass(), "y", 0);
        setIntField(term1641570, term1641570.getClass(), "width", 0);
        setIntField(term1641570, term1641570.getClass(), "height", 0);
        setField(term1641570, term1641570.getClass(), "foreground", null);
        setField(term1641570, term1641570.getClass(), "background", null);
        setField(term1641570, term1641570.getClass(), "font", null);
        setField(term1641570, term1641570.getClass(), "peerFont", null);
        setField(term1641570, term1641570.getClass(), "cursor", null);
        setField(term1641570, term1641570.getClass(), "locale", null);
        setField(term1641570, term1641570.getClass(), "graphicsConfig", null);
        setField(term1641570, term1641570.getClass(), "bufferStrategy", null);
        setBooleanField(term1641570, term1641570.getClass(), "ignoreRepaint", false);
        setBooleanField(term1641570, term1641570.getClass(), "visible", false);
        setBooleanField(term1641570, term1641570.getClass(), "enabled", false);
        setBooleanField(term1641570, term1641570.getClass(), "valid", false);
        setField(term1641570, term1641570.getClass(), "dropTarget", null);
        setField(term1641570, term1641570.getClass(), "popups", null);
        setField(term1641570, term1641570.getClass(), "name", null);
        setBooleanField(term1641570, term1641570.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1641570, term1641570.getClass(), "focusable", false);
        setIntField(term1641570, term1641570.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1641570, term1641570.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1641570, term1641570.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1641570, term1641570.getClass(), "acc", null);
        setField(term1641570, term1641570.getClass(), "minSize", null);
        setBooleanField(term1641570, term1641570.getClass(), "minSizeSet", false);
        setField(term1641570, term1641570.getClass(), "prefSize", null);
        setBooleanField(term1641570, term1641570.getClass(), "prefSizeSet", false);
        setField(term1641570, term1641570.getClass(), "maxSize", null);
        setBooleanField(term1641570, term1641570.getClass(), "maxSizeSet", false);
        setField(term1641570, term1641570.getClass(), "componentOrientation", null);
        setBooleanField(term1641570, term1641570.getClass(), "newEventsOnly", false);
        setField(term1641570, term1641570.getClass(), "componentListener", null);
        setField(term1641570, term1641570.getClass(), "focusListener", null);
        setField(term1641570, term1641570.getClass(), "hierarchyListener", null);
        setField(term1641570, term1641570.getClass(), "hierarchyBoundsListener", null);
        setField(term1641570, term1641570.getClass(), "keyListener", null);
        setField(term1641570, term1641570.getClass(), "mouseListener", null);
        setField(term1641570, term1641570.getClass(), "mouseMotionListener", null);
        setField(term1641570, term1641570.getClass(), "mouseWheelListener", null);
        setField(term1641570, term1641570.getClass(), "inputMethodListener", null);
        setLongField(term1641570, term1641570.getClass(), "eventMask", 0L);
        setField(term1641570, term1641570.getClass(), "changeSupport", null);
        setField(term1641570, term1641570.getClass(), "objectLock", null);
        setBooleanField(term1641570, term1641570.getClass(), "isPacked", false);
        setIntField(term1641570, term1641570.getClass(), "boundsOp", 0);
        setField(term1641570, term1641570.getClass(), "compoundShape", null);
        setField(term1641570, term1641570.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1641570, term1641570.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1641570, term1641570.getClass(), "backgroundEraseDisabled", false);
        setField(term1641570, term1641570.getClass(), "eventCache", null);
        setBooleanField(term1641570, term1641570.getClass(), "coalescingEnabled", false);
        setBooleanField(term1641570, term1641570.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1641570, term1641570.getClass(), "componentSerializedDataVersion", 0);
        setField(term1641570, term1641570.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createTradeEmbargoLine", argTypes, term1641570, args);
    }

};


