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

public class DiplomacyView_getGreetLine_195374140223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1692523;

    public DiplomacyView_getGreetLine_195374140223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1692523 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1692523, term1692523.getClass(), "human", null);
        setField(term1692523, term1692523.getClass(), "borderCrossedFleet", null);
        setField(term1692523, term1692523.getClass(), "ai", null);
        setField(term1692523, term1692523.getClass(), "starMap", null);
        setField(term1692523, term1692523.getClass(), "trade", null);
        setField(term1692523, term1692523.getClass(), "humanTechListOffer", null);
        setField(term1692523, term1692523.getClass(), "aiTechListOffer", null);
        setField(term1692523, term1692523.getClass(), "humanFleetListOffer", null);
        setField(term1692523, term1692523.getClass(), "aiFleetListOffer", null);
        setField(term1692523, term1692523.getClass(), "humanPlanetListOffer", null);
        setField(term1692523, term1692523.getClass(), "aiPlanetListOffer", null);
        setField(term1692523, term1692523.getClass(), "humanCreditOffer", null);
        setIntField(term1692523, term1692523.getClass(), "humanCredits", 0);
        setField(term1692523, term1692523.getClass(), "humanArtifactOffer", null);
        setIntField(term1692523, term1692523.getClass(), "humanArtifacts", 0);
        setField(term1692523, term1692523.getClass(), "aiCreditOffer", null);
        setIntField(term1692523, term1692523.getClass(), "aiCredits", 0);
        setField(term1692523, term1692523.getClass(), "aiArtifactOffer", null);
        setIntField(term1692523, term1692523.getClass(), "aiArtifacts", 0);
        setField(term1692523, term1692523.getClass(), "humanLines", null);
        setField(term1692523, term1692523.getClass(), "humanMapPlanetsOffer", null);
        setField(term1692523, term1692523.getClass(), "aiMapPlanetsOffer", null);
        setField(term1692523, term1692523.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1692523, term1692523.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1692523, term1692523.getClass(), "humanMapOffer", null);
        setField(term1692523, term1692523.getClass(), "aiMapOffer", null);
        setField(term1692523, term1692523.getClass(), "humanVoteYes", null);
        setField(term1692523, term1692523.getClass(), "humanVoteNo", null);
        setField(term1692523, term1692523.getClass(), "aiVoteYes", null);
        setField(term1692523, term1692523.getClass(), "aiVoteNo", null);
        setField(term1692523, term1692523.getClass(), "infoText", null);
        setField(term1692523, term1692523.getClass(), "likenessLabel", null);
        setField(term1692523, term1692523.getClass(), "endBtn", null);
        setField(term1692523, term1692523.getClass(), "meetingPlace", null);
        setBooleanField(term1692523, term1692523.getClass(), "tradeHappened", false);
        setField(term1692523, term1692523.getClass(), "aiImg", null);
        setIntField(term1692523, term1692523.getClass(), "textCounter", 0);
        setField(term1692523, term1692523.getClass(), "lastSpeechType", null);
        setField(term1692523, term1692523.getClass(), "embargoLine", null);
        setField(term1692523, term1692523.getClass(), "game", null);
        setBooleanField(term1692523, term1692523.getClass(), "isAlignmentXSet", false);
        setFloatField(term1692523, term1692523.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1692523, term1692523.getClass(), "isAlignmentYSet", false);
        setFloatField(term1692523, term1692523.getClass(), "alignmentY", 0.0F);
        setField(term1692523, term1692523.getClass(), "ui", null);
        setField(term1692523, term1692523.getClass(), "listenerList", null);
        setField(term1692523, term1692523.getClass(), "clientProperties", null);
        setField(term1692523, term1692523.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1692523, term1692523.getClass(), "autoscrolls", false);
        setField(term1692523, term1692523.getClass(), "border", null);
        setIntField(term1692523, term1692523.getClass(), "flags", 0);
        setField(term1692523, term1692523.getClass(), "inputVerifier", null);
        setBooleanField(term1692523, term1692523.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1692523, term1692523.getClass(), "paintingChild", null);
        setField(term1692523, term1692523.getClass(), "popupMenu", null);
        setField(term1692523, term1692523.getClass(), "revalidateRunnableScheduled", null);
        setField(term1692523, term1692523.getClass(), "focusInputMap", null);
        setField(term1692523, term1692523.getClass(), "ancestorInputMap", null);
        setField(term1692523, term1692523.getClass(), "windowInputMap", null);
        setField(term1692523, term1692523.getClass(), "actionMap", null);
        setField(term1692523, term1692523.getClass(), "aaHint", null);
        setField(term1692523, term1692523.getClass(), "lcdRenderingHint", null);
        setField(term1692523, term1692523.getClass(), "component", null);
        setField(term1692523, term1692523.getClass(), "layoutMgr", null);
        setField(term1692523, term1692523.getClass(), "dispatcher", null);
        setField(term1692523, term1692523.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1692523, term1692523.getClass(), "focusCycleRoot", false);
        setBooleanField(term1692523, term1692523.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1692523, term1692523.getClass(), "printingThreads", null);
        setBooleanField(term1692523, term1692523.getClass(), "printing", false);
        setField(term1692523, term1692523.getClass(), "containerListener", null);
        setIntField(term1692523, term1692523.getClass(), "listeningChildren", 0);
        setIntField(term1692523, term1692523.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1692523, term1692523.getClass(), "descendantsCount", 0);
        setField(term1692523, term1692523.getClass(), "preserveBackgroundColor", null);
        setIntField(term1692523, term1692523.getClass(), "numOfHWComponents", 0);
        setIntField(term1692523, term1692523.getClass(), "numOfLWComponents", 0);
        setField(term1692523, term1692523.getClass(), "modalComp", null);
        setField(term1692523, term1692523.getClass(), "modalAppContext", null);
        setIntField(term1692523, term1692523.getClass(), "containerSerializedDataVersion", 0);
        setField(term1692523, term1692523.getClass(), "peer", null);
        setField(term1692523, term1692523.getClass(), "parent", null);
        setField(term1692523, term1692523.getClass(), "appContext", null);
        setIntField(term1692523, term1692523.getClass(), "x", 0);
        setIntField(term1692523, term1692523.getClass(), "y", 0);
        setIntField(term1692523, term1692523.getClass(), "width", 0);
        setIntField(term1692523, term1692523.getClass(), "height", 0);
        setField(term1692523, term1692523.getClass(), "foreground", null);
        setField(term1692523, term1692523.getClass(), "background", null);
        setField(term1692523, term1692523.getClass(), "font", null);
        setField(term1692523, term1692523.getClass(), "peerFont", null);
        setField(term1692523, term1692523.getClass(), "cursor", null);
        setField(term1692523, term1692523.getClass(), "locale", null);
        setField(term1692523, term1692523.getClass(), "graphicsConfig", null);
        setField(term1692523, term1692523.getClass(), "bufferStrategy", null);
        setBooleanField(term1692523, term1692523.getClass(), "ignoreRepaint", false);
        setBooleanField(term1692523, term1692523.getClass(), "visible", false);
        setBooleanField(term1692523, term1692523.getClass(), "enabled", false);
        setBooleanField(term1692523, term1692523.getClass(), "valid", false);
        setField(term1692523, term1692523.getClass(), "dropTarget", null);
        setField(term1692523, term1692523.getClass(), "popups", null);
        setField(term1692523, term1692523.getClass(), "name", null);
        setBooleanField(term1692523, term1692523.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1692523, term1692523.getClass(), "focusable", false);
        setIntField(term1692523, term1692523.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1692523, term1692523.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1692523, term1692523.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1692523, term1692523.getClass(), "acc", null);
        setField(term1692523, term1692523.getClass(), "minSize", null);
        setBooleanField(term1692523, term1692523.getClass(), "minSizeSet", false);
        setField(term1692523, term1692523.getClass(), "prefSize", null);
        setBooleanField(term1692523, term1692523.getClass(), "prefSizeSet", false);
        setField(term1692523, term1692523.getClass(), "maxSize", null);
        setBooleanField(term1692523, term1692523.getClass(), "maxSizeSet", false);
        setField(term1692523, term1692523.getClass(), "componentOrientation", null);
        setBooleanField(term1692523, term1692523.getClass(), "newEventsOnly", false);
        setField(term1692523, term1692523.getClass(), "componentListener", null);
        setField(term1692523, term1692523.getClass(), "focusListener", null);
        setField(term1692523, term1692523.getClass(), "hierarchyListener", null);
        setField(term1692523, term1692523.getClass(), "hierarchyBoundsListener", null);
        setField(term1692523, term1692523.getClass(), "keyListener", null);
        setField(term1692523, term1692523.getClass(), "mouseListener", null);
        setField(term1692523, term1692523.getClass(), "mouseMotionListener", null);
        setField(term1692523, term1692523.getClass(), "mouseWheelListener", null);
        setField(term1692523, term1692523.getClass(), "inputMethodListener", null);
        setLongField(term1692523, term1692523.getClass(), "eventMask", 0L);
        setField(term1692523, term1692523.getClass(), "changeSupport", null);
        setField(term1692523, term1692523.getClass(), "objectLock", null);
        setBooleanField(term1692523, term1692523.getClass(), "isPacked", false);
        setIntField(term1692523, term1692523.getClass(), "boundsOp", 0);
        setField(term1692523, term1692523.getClass(), "compoundShape", null);
        setField(term1692523, term1692523.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1692523, term1692523.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1692523, term1692523.getClass(), "backgroundEraseDisabled", false);
        setField(term1692523, term1692523.getClass(), "eventCache", null);
        setBooleanField(term1692523, term1692523.getClass(), "coalescingEnabled", false);
        setBooleanField(term1692523, term1692523.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1692523, term1692523.getClass(), "componentSerializedDataVersion", 0);
        setField(term1692523, term1692523.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGreetLine", argTypes, term1692523, args);
    }

};


