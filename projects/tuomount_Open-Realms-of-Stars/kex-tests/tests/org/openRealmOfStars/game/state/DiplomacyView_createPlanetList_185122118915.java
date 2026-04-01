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

public class DiplomacyView_createPlanetList_185122118915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1658438;

    public DiplomacyView_createPlanetList_185122118915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1658438 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1658438, term1658438.getClass(), "human", null);
        setField(term1658438, term1658438.getClass(), "borderCrossedFleet", null);
        setField(term1658438, term1658438.getClass(), "ai", null);
        setField(term1658438, term1658438.getClass(), "starMap", null);
        setField(term1658438, term1658438.getClass(), "trade", null);
        setField(term1658438, term1658438.getClass(), "humanTechListOffer", null);
        setField(term1658438, term1658438.getClass(), "aiTechListOffer", null);
        setField(term1658438, term1658438.getClass(), "humanFleetListOffer", null);
        setField(term1658438, term1658438.getClass(), "aiFleetListOffer", null);
        setField(term1658438, term1658438.getClass(), "humanPlanetListOffer", null);
        setField(term1658438, term1658438.getClass(), "aiPlanetListOffer", null);
        setField(term1658438, term1658438.getClass(), "humanCreditOffer", null);
        setIntField(term1658438, term1658438.getClass(), "humanCredits", 0);
        setField(term1658438, term1658438.getClass(), "humanArtifactOffer", null);
        setIntField(term1658438, term1658438.getClass(), "humanArtifacts", 0);
        setField(term1658438, term1658438.getClass(), "aiCreditOffer", null);
        setIntField(term1658438, term1658438.getClass(), "aiCredits", 0);
        setField(term1658438, term1658438.getClass(), "aiArtifactOffer", null);
        setIntField(term1658438, term1658438.getClass(), "aiArtifacts", 0);
        setField(term1658438, term1658438.getClass(), "humanLines", null);
        setField(term1658438, term1658438.getClass(), "humanMapPlanetsOffer", null);
        setField(term1658438, term1658438.getClass(), "aiMapPlanetsOffer", null);
        setField(term1658438, term1658438.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1658438, term1658438.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1658438, term1658438.getClass(), "humanMapOffer", null);
        setField(term1658438, term1658438.getClass(), "aiMapOffer", null);
        setField(term1658438, term1658438.getClass(), "humanVoteYes", null);
        setField(term1658438, term1658438.getClass(), "humanVoteNo", null);
        setField(term1658438, term1658438.getClass(), "aiVoteYes", null);
        setField(term1658438, term1658438.getClass(), "aiVoteNo", null);
        setField(term1658438, term1658438.getClass(), "infoText", null);
        setField(term1658438, term1658438.getClass(), "likenessLabel", null);
        setField(term1658438, term1658438.getClass(), "endBtn", null);
        setField(term1658438, term1658438.getClass(), "meetingPlace", null);
        setBooleanField(term1658438, term1658438.getClass(), "tradeHappened", false);
        setField(term1658438, term1658438.getClass(), "aiImg", null);
        setIntField(term1658438, term1658438.getClass(), "textCounter", 0);
        setField(term1658438, term1658438.getClass(), "lastSpeechType", null);
        setField(term1658438, term1658438.getClass(), "embargoLine", null);
        setField(term1658438, term1658438.getClass(), "game", null);
        setBooleanField(term1658438, term1658438.getClass(), "isAlignmentXSet", false);
        setFloatField(term1658438, term1658438.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1658438, term1658438.getClass(), "isAlignmentYSet", false);
        setFloatField(term1658438, term1658438.getClass(), "alignmentY", 0.0F);
        setField(term1658438, term1658438.getClass(), "ui", null);
        setField(term1658438, term1658438.getClass(), "listenerList", null);
        setField(term1658438, term1658438.getClass(), "clientProperties", null);
        setField(term1658438, term1658438.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1658438, term1658438.getClass(), "autoscrolls", false);
        setField(term1658438, term1658438.getClass(), "border", null);
        setIntField(term1658438, term1658438.getClass(), "flags", 0);
        setField(term1658438, term1658438.getClass(), "inputVerifier", null);
        setBooleanField(term1658438, term1658438.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1658438, term1658438.getClass(), "paintingChild", null);
        setField(term1658438, term1658438.getClass(), "popupMenu", null);
        setField(term1658438, term1658438.getClass(), "revalidateRunnableScheduled", null);
        setField(term1658438, term1658438.getClass(), "focusInputMap", null);
        setField(term1658438, term1658438.getClass(), "ancestorInputMap", null);
        setField(term1658438, term1658438.getClass(), "windowInputMap", null);
        setField(term1658438, term1658438.getClass(), "actionMap", null);
        setField(term1658438, term1658438.getClass(), "aaHint", null);
        setField(term1658438, term1658438.getClass(), "lcdRenderingHint", null);
        setField(term1658438, term1658438.getClass(), "component", null);
        setField(term1658438, term1658438.getClass(), "layoutMgr", null);
        setField(term1658438, term1658438.getClass(), "dispatcher", null);
        setField(term1658438, term1658438.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1658438, term1658438.getClass(), "focusCycleRoot", false);
        setBooleanField(term1658438, term1658438.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1658438, term1658438.getClass(), "printingThreads", null);
        setBooleanField(term1658438, term1658438.getClass(), "printing", false);
        setField(term1658438, term1658438.getClass(), "containerListener", null);
        setIntField(term1658438, term1658438.getClass(), "listeningChildren", 0);
        setIntField(term1658438, term1658438.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1658438, term1658438.getClass(), "descendantsCount", 0);
        setField(term1658438, term1658438.getClass(), "preserveBackgroundColor", null);
        setIntField(term1658438, term1658438.getClass(), "numOfHWComponents", 0);
        setIntField(term1658438, term1658438.getClass(), "numOfLWComponents", 0);
        setField(term1658438, term1658438.getClass(), "modalComp", null);
        setField(term1658438, term1658438.getClass(), "modalAppContext", null);
        setIntField(term1658438, term1658438.getClass(), "containerSerializedDataVersion", 0);
        setField(term1658438, term1658438.getClass(), "peer", null);
        setField(term1658438, term1658438.getClass(), "parent", null);
        setField(term1658438, term1658438.getClass(), "appContext", null);
        setIntField(term1658438, term1658438.getClass(), "x", 0);
        setIntField(term1658438, term1658438.getClass(), "y", 0);
        setIntField(term1658438, term1658438.getClass(), "width", 0);
        setIntField(term1658438, term1658438.getClass(), "height", 0);
        setField(term1658438, term1658438.getClass(), "foreground", null);
        setField(term1658438, term1658438.getClass(), "background", null);
        setField(term1658438, term1658438.getClass(), "font", null);
        setField(term1658438, term1658438.getClass(), "peerFont", null);
        setField(term1658438, term1658438.getClass(), "cursor", null);
        setField(term1658438, term1658438.getClass(), "locale", null);
        setField(term1658438, term1658438.getClass(), "graphicsConfig", null);
        setField(term1658438, term1658438.getClass(), "bufferStrategy", null);
        setBooleanField(term1658438, term1658438.getClass(), "ignoreRepaint", false);
        setBooleanField(term1658438, term1658438.getClass(), "visible", false);
        setBooleanField(term1658438, term1658438.getClass(), "enabled", false);
        setBooleanField(term1658438, term1658438.getClass(), "valid", false);
        setField(term1658438, term1658438.getClass(), "dropTarget", null);
        setField(term1658438, term1658438.getClass(), "popups", null);
        setField(term1658438, term1658438.getClass(), "name", null);
        setBooleanField(term1658438, term1658438.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1658438, term1658438.getClass(), "focusable", false);
        setIntField(term1658438, term1658438.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1658438, term1658438.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1658438, term1658438.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1658438, term1658438.getClass(), "acc", null);
        setField(term1658438, term1658438.getClass(), "minSize", null);
        setBooleanField(term1658438, term1658438.getClass(), "minSizeSet", false);
        setField(term1658438, term1658438.getClass(), "prefSize", null);
        setBooleanField(term1658438, term1658438.getClass(), "prefSizeSet", false);
        setField(term1658438, term1658438.getClass(), "maxSize", null);
        setBooleanField(term1658438, term1658438.getClass(), "maxSizeSet", false);
        setField(term1658438, term1658438.getClass(), "componentOrientation", null);
        setBooleanField(term1658438, term1658438.getClass(), "newEventsOnly", false);
        setField(term1658438, term1658438.getClass(), "componentListener", null);
        setField(term1658438, term1658438.getClass(), "focusListener", null);
        setField(term1658438, term1658438.getClass(), "hierarchyListener", null);
        setField(term1658438, term1658438.getClass(), "hierarchyBoundsListener", null);
        setField(term1658438, term1658438.getClass(), "keyListener", null);
        setField(term1658438, term1658438.getClass(), "mouseListener", null);
        setField(term1658438, term1658438.getClass(), "mouseMotionListener", null);
        setField(term1658438, term1658438.getClass(), "mouseWheelListener", null);
        setField(term1658438, term1658438.getClass(), "inputMethodListener", null);
        setLongField(term1658438, term1658438.getClass(), "eventMask", 0L);
        setField(term1658438, term1658438.getClass(), "changeSupport", null);
        setField(term1658438, term1658438.getClass(), "objectLock", null);
        setBooleanField(term1658438, term1658438.getClass(), "isPacked", false);
        setIntField(term1658438, term1658438.getClass(), "boundsOp", 0);
        setField(term1658438, term1658438.getClass(), "compoundShape", null);
        setField(term1658438, term1658438.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1658438, term1658438.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1658438, term1658438.getClass(), "backgroundEraseDisabled", false);
        setField(term1658438, term1658438.getClass(), "eventCache", null);
        setBooleanField(term1658438, term1658438.getClass(), "coalescingEnabled", false);
        setBooleanField(term1658438, term1658438.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1658438, term1658438.getClass(), "componentSerializedDataVersion", 0);
        setField(term1658438, term1658438.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createPlanetList", argTypes, term1658438, args);
    }

};


