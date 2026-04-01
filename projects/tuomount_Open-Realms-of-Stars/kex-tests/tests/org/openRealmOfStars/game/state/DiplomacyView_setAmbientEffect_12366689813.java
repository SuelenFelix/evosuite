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

public class DiplomacyView_setAmbientEffect_12366689813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1607723;

    public DiplomacyView_setAmbientEffect_12366689813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1607723 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1607723, term1607723.getClass(), "human", null);
        setField(term1607723, term1607723.getClass(), "borderCrossedFleet", null);
        setField(term1607723, term1607723.getClass(), "ai", null);
        setField(term1607723, term1607723.getClass(), "starMap", null);
        setField(term1607723, term1607723.getClass(), "trade", null);
        setField(term1607723, term1607723.getClass(), "humanTechListOffer", null);
        setField(term1607723, term1607723.getClass(), "aiTechListOffer", null);
        setField(term1607723, term1607723.getClass(), "humanFleetListOffer", null);
        setField(term1607723, term1607723.getClass(), "aiFleetListOffer", null);
        setField(term1607723, term1607723.getClass(), "humanPlanetListOffer", null);
        setField(term1607723, term1607723.getClass(), "aiPlanetListOffer", null);
        setField(term1607723, term1607723.getClass(), "humanCreditOffer", null);
        setIntField(term1607723, term1607723.getClass(), "humanCredits", 0);
        setField(term1607723, term1607723.getClass(), "humanArtifactOffer", null);
        setIntField(term1607723, term1607723.getClass(), "humanArtifacts", 0);
        setField(term1607723, term1607723.getClass(), "aiCreditOffer", null);
        setIntField(term1607723, term1607723.getClass(), "aiCredits", 0);
        setField(term1607723, term1607723.getClass(), "aiArtifactOffer", null);
        setIntField(term1607723, term1607723.getClass(), "aiArtifacts", 0);
        setField(term1607723, term1607723.getClass(), "humanLines", null);
        setField(term1607723, term1607723.getClass(), "humanMapPlanetsOffer", null);
        setField(term1607723, term1607723.getClass(), "aiMapPlanetsOffer", null);
        setField(term1607723, term1607723.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1607723, term1607723.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1607723, term1607723.getClass(), "humanMapOffer", null);
        setField(term1607723, term1607723.getClass(), "aiMapOffer", null);
        setField(term1607723, term1607723.getClass(), "humanVoteYes", null);
        setField(term1607723, term1607723.getClass(), "humanVoteNo", null);
        setField(term1607723, term1607723.getClass(), "aiVoteYes", null);
        setField(term1607723, term1607723.getClass(), "aiVoteNo", null);
        setField(term1607723, term1607723.getClass(), "infoText", null);
        setField(term1607723, term1607723.getClass(), "likenessLabel", null);
        setField(term1607723, term1607723.getClass(), "endBtn", null);
        setField(term1607723, term1607723.getClass(), "meetingPlace", null);
        setBooleanField(term1607723, term1607723.getClass(), "tradeHappened", false);
        setField(term1607723, term1607723.getClass(), "aiImg", null);
        setIntField(term1607723, term1607723.getClass(), "textCounter", 0);
        setField(term1607723, term1607723.getClass(), "lastSpeechType", null);
        setField(term1607723, term1607723.getClass(), "embargoLine", null);
        setField(term1607723, term1607723.getClass(), "game", null);
        setBooleanField(term1607723, term1607723.getClass(), "isAlignmentXSet", false);
        setFloatField(term1607723, term1607723.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1607723, term1607723.getClass(), "isAlignmentYSet", false);
        setFloatField(term1607723, term1607723.getClass(), "alignmentY", 0.0F);
        setField(term1607723, term1607723.getClass(), "ui", null);
        setField(term1607723, term1607723.getClass(), "listenerList", null);
        setField(term1607723, term1607723.getClass(), "clientProperties", null);
        setField(term1607723, term1607723.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1607723, term1607723.getClass(), "autoscrolls", false);
        setField(term1607723, term1607723.getClass(), "border", null);
        setIntField(term1607723, term1607723.getClass(), "flags", 0);
        setField(term1607723, term1607723.getClass(), "inputVerifier", null);
        setBooleanField(term1607723, term1607723.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1607723, term1607723.getClass(), "paintingChild", null);
        setField(term1607723, term1607723.getClass(), "popupMenu", null);
        setField(term1607723, term1607723.getClass(), "revalidateRunnableScheduled", null);
        setField(term1607723, term1607723.getClass(), "focusInputMap", null);
        setField(term1607723, term1607723.getClass(), "ancestorInputMap", null);
        setField(term1607723, term1607723.getClass(), "windowInputMap", null);
        setField(term1607723, term1607723.getClass(), "actionMap", null);
        setField(term1607723, term1607723.getClass(), "aaHint", null);
        setField(term1607723, term1607723.getClass(), "lcdRenderingHint", null);
        setField(term1607723, term1607723.getClass(), "component", null);
        setField(term1607723, term1607723.getClass(), "layoutMgr", null);
        setField(term1607723, term1607723.getClass(), "dispatcher", null);
        setField(term1607723, term1607723.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1607723, term1607723.getClass(), "focusCycleRoot", false);
        setBooleanField(term1607723, term1607723.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1607723, term1607723.getClass(), "printingThreads", null);
        setBooleanField(term1607723, term1607723.getClass(), "printing", false);
        setField(term1607723, term1607723.getClass(), "containerListener", null);
        setIntField(term1607723, term1607723.getClass(), "listeningChildren", 0);
        setIntField(term1607723, term1607723.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1607723, term1607723.getClass(), "descendantsCount", 0);
        setField(term1607723, term1607723.getClass(), "preserveBackgroundColor", null);
        setIntField(term1607723, term1607723.getClass(), "numOfHWComponents", 0);
        setIntField(term1607723, term1607723.getClass(), "numOfLWComponents", 0);
        setField(term1607723, term1607723.getClass(), "modalComp", null);
        setField(term1607723, term1607723.getClass(), "modalAppContext", null);
        setIntField(term1607723, term1607723.getClass(), "containerSerializedDataVersion", 0);
        setField(term1607723, term1607723.getClass(), "peer", null);
        setField(term1607723, term1607723.getClass(), "parent", null);
        setField(term1607723, term1607723.getClass(), "appContext", null);
        setIntField(term1607723, term1607723.getClass(), "x", 0);
        setIntField(term1607723, term1607723.getClass(), "y", 0);
        setIntField(term1607723, term1607723.getClass(), "width", 0);
        setIntField(term1607723, term1607723.getClass(), "height", 0);
        setField(term1607723, term1607723.getClass(), "foreground", null);
        setField(term1607723, term1607723.getClass(), "background", null);
        setField(term1607723, term1607723.getClass(), "font", null);
        setField(term1607723, term1607723.getClass(), "peerFont", null);
        setField(term1607723, term1607723.getClass(), "cursor", null);
        setField(term1607723, term1607723.getClass(), "locale", null);
        setField(term1607723, term1607723.getClass(), "graphicsConfig", null);
        setField(term1607723, term1607723.getClass(), "bufferStrategy", null);
        setBooleanField(term1607723, term1607723.getClass(), "ignoreRepaint", false);
        setBooleanField(term1607723, term1607723.getClass(), "visible", false);
        setBooleanField(term1607723, term1607723.getClass(), "enabled", false);
        setBooleanField(term1607723, term1607723.getClass(), "valid", false);
        setField(term1607723, term1607723.getClass(), "dropTarget", null);
        setField(term1607723, term1607723.getClass(), "popups", null);
        setField(term1607723, term1607723.getClass(), "name", null);
        setBooleanField(term1607723, term1607723.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1607723, term1607723.getClass(), "focusable", false);
        setIntField(term1607723, term1607723.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1607723, term1607723.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1607723, term1607723.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1607723, term1607723.getClass(), "acc", null);
        setField(term1607723, term1607723.getClass(), "minSize", null);
        setBooleanField(term1607723, term1607723.getClass(), "minSizeSet", false);
        setField(term1607723, term1607723.getClass(), "prefSize", null);
        setBooleanField(term1607723, term1607723.getClass(), "prefSizeSet", false);
        setField(term1607723, term1607723.getClass(), "maxSize", null);
        setBooleanField(term1607723, term1607723.getClass(), "maxSizeSet", false);
        setField(term1607723, term1607723.getClass(), "componentOrientation", null);
        setBooleanField(term1607723, term1607723.getClass(), "newEventsOnly", false);
        setField(term1607723, term1607723.getClass(), "componentListener", null);
        setField(term1607723, term1607723.getClass(), "focusListener", null);
        setField(term1607723, term1607723.getClass(), "hierarchyListener", null);
        setField(term1607723, term1607723.getClass(), "hierarchyBoundsListener", null);
        setField(term1607723, term1607723.getClass(), "keyListener", null);
        setField(term1607723, term1607723.getClass(), "mouseListener", null);
        setField(term1607723, term1607723.getClass(), "mouseMotionListener", null);
        setField(term1607723, term1607723.getClass(), "mouseWheelListener", null);
        setField(term1607723, term1607723.getClass(), "inputMethodListener", null);
        setLongField(term1607723, term1607723.getClass(), "eventMask", 0L);
        setField(term1607723, term1607723.getClass(), "changeSupport", null);
        setField(term1607723, term1607723.getClass(), "objectLock", null);
        setBooleanField(term1607723, term1607723.getClass(), "isPacked", false);
        setIntField(term1607723, term1607723.getClass(), "boundsOp", 0);
        setField(term1607723, term1607723.getClass(), "compoundShape", null);
        setField(term1607723, term1607723.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1607723, term1607723.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1607723, term1607723.getClass(), "backgroundEraseDisabled", false);
        setField(term1607723, term1607723.getClass(), "eventCache", null);
        setBooleanField(term1607723, term1607723.getClass(), "coalescingEnabled", false);
        setBooleanField(term1607723, term1607723.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1607723, term1607723.getClass(), "componentSerializedDataVersion", 0);
        setField(term1607723, term1607723.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.ambient.BridgeCommandType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAmbientEffect", argTypes, term1607723, args);
    }

};


