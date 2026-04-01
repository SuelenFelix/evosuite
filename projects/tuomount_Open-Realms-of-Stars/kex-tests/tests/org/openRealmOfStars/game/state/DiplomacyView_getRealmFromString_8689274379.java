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

public class DiplomacyView_getRealmFromString_8689274379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1633429;

    public DiplomacyView_getRealmFromString_8689274379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1633429 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1633429, term1633429.getClass(), "human", null);
        setField(term1633429, term1633429.getClass(), "borderCrossedFleet", null);
        setField(term1633429, term1633429.getClass(), "ai", null);
        setField(term1633429, term1633429.getClass(), "starMap", null);
        setField(term1633429, term1633429.getClass(), "trade", null);
        setField(term1633429, term1633429.getClass(), "humanTechListOffer", null);
        setField(term1633429, term1633429.getClass(), "aiTechListOffer", null);
        setField(term1633429, term1633429.getClass(), "humanFleetListOffer", null);
        setField(term1633429, term1633429.getClass(), "aiFleetListOffer", null);
        setField(term1633429, term1633429.getClass(), "humanPlanetListOffer", null);
        setField(term1633429, term1633429.getClass(), "aiPlanetListOffer", null);
        setField(term1633429, term1633429.getClass(), "humanCreditOffer", null);
        setIntField(term1633429, term1633429.getClass(), "humanCredits", 0);
        setField(term1633429, term1633429.getClass(), "humanArtifactOffer", null);
        setIntField(term1633429, term1633429.getClass(), "humanArtifacts", 0);
        setField(term1633429, term1633429.getClass(), "aiCreditOffer", null);
        setIntField(term1633429, term1633429.getClass(), "aiCredits", 0);
        setField(term1633429, term1633429.getClass(), "aiArtifactOffer", null);
        setIntField(term1633429, term1633429.getClass(), "aiArtifacts", 0);
        setField(term1633429, term1633429.getClass(), "humanLines", null);
        setField(term1633429, term1633429.getClass(), "humanMapPlanetsOffer", null);
        setField(term1633429, term1633429.getClass(), "aiMapPlanetsOffer", null);
        setField(term1633429, term1633429.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1633429, term1633429.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1633429, term1633429.getClass(), "humanMapOffer", null);
        setField(term1633429, term1633429.getClass(), "aiMapOffer", null);
        setField(term1633429, term1633429.getClass(), "humanVoteYes", null);
        setField(term1633429, term1633429.getClass(), "humanVoteNo", null);
        setField(term1633429, term1633429.getClass(), "aiVoteYes", null);
        setField(term1633429, term1633429.getClass(), "aiVoteNo", null);
        setField(term1633429, term1633429.getClass(), "infoText", null);
        setField(term1633429, term1633429.getClass(), "likenessLabel", null);
        setField(term1633429, term1633429.getClass(), "endBtn", null);
        setField(term1633429, term1633429.getClass(), "meetingPlace", null);
        setBooleanField(term1633429, term1633429.getClass(), "tradeHappened", false);
        setField(term1633429, term1633429.getClass(), "aiImg", null);
        setIntField(term1633429, term1633429.getClass(), "textCounter", 0);
        setField(term1633429, term1633429.getClass(), "lastSpeechType", null);
        setField(term1633429, term1633429.getClass(), "embargoLine", null);
        setField(term1633429, term1633429.getClass(), "game", null);
        setBooleanField(term1633429, term1633429.getClass(), "isAlignmentXSet", false);
        setFloatField(term1633429, term1633429.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1633429, term1633429.getClass(), "isAlignmentYSet", false);
        setFloatField(term1633429, term1633429.getClass(), "alignmentY", 0.0F);
        setField(term1633429, term1633429.getClass(), "ui", null);
        setField(term1633429, term1633429.getClass(), "listenerList", null);
        setField(term1633429, term1633429.getClass(), "clientProperties", null);
        setField(term1633429, term1633429.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1633429, term1633429.getClass(), "autoscrolls", false);
        setField(term1633429, term1633429.getClass(), "border", null);
        setIntField(term1633429, term1633429.getClass(), "flags", 0);
        setField(term1633429, term1633429.getClass(), "inputVerifier", null);
        setBooleanField(term1633429, term1633429.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1633429, term1633429.getClass(), "paintingChild", null);
        setField(term1633429, term1633429.getClass(), "popupMenu", null);
        setField(term1633429, term1633429.getClass(), "revalidateRunnableScheduled", null);
        setField(term1633429, term1633429.getClass(), "focusInputMap", null);
        setField(term1633429, term1633429.getClass(), "ancestorInputMap", null);
        setField(term1633429, term1633429.getClass(), "windowInputMap", null);
        setField(term1633429, term1633429.getClass(), "actionMap", null);
        setField(term1633429, term1633429.getClass(), "aaHint", null);
        setField(term1633429, term1633429.getClass(), "lcdRenderingHint", null);
        setField(term1633429, term1633429.getClass(), "component", null);
        setField(term1633429, term1633429.getClass(), "layoutMgr", null);
        setField(term1633429, term1633429.getClass(), "dispatcher", null);
        setField(term1633429, term1633429.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1633429, term1633429.getClass(), "focusCycleRoot", false);
        setBooleanField(term1633429, term1633429.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1633429, term1633429.getClass(), "printingThreads", null);
        setBooleanField(term1633429, term1633429.getClass(), "printing", false);
        setField(term1633429, term1633429.getClass(), "containerListener", null);
        setIntField(term1633429, term1633429.getClass(), "listeningChildren", 0);
        setIntField(term1633429, term1633429.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1633429, term1633429.getClass(), "descendantsCount", 0);
        setField(term1633429, term1633429.getClass(), "preserveBackgroundColor", null);
        setIntField(term1633429, term1633429.getClass(), "numOfHWComponents", 0);
        setIntField(term1633429, term1633429.getClass(), "numOfLWComponents", 0);
        setField(term1633429, term1633429.getClass(), "modalComp", null);
        setField(term1633429, term1633429.getClass(), "modalAppContext", null);
        setIntField(term1633429, term1633429.getClass(), "containerSerializedDataVersion", 0);
        setField(term1633429, term1633429.getClass(), "peer", null);
        setField(term1633429, term1633429.getClass(), "parent", null);
        setField(term1633429, term1633429.getClass(), "appContext", null);
        setIntField(term1633429, term1633429.getClass(), "x", 0);
        setIntField(term1633429, term1633429.getClass(), "y", 0);
        setIntField(term1633429, term1633429.getClass(), "width", 0);
        setIntField(term1633429, term1633429.getClass(), "height", 0);
        setField(term1633429, term1633429.getClass(), "foreground", null);
        setField(term1633429, term1633429.getClass(), "background", null);
        setField(term1633429, term1633429.getClass(), "font", null);
        setField(term1633429, term1633429.getClass(), "peerFont", null);
        setField(term1633429, term1633429.getClass(), "cursor", null);
        setField(term1633429, term1633429.getClass(), "locale", null);
        setField(term1633429, term1633429.getClass(), "graphicsConfig", null);
        setField(term1633429, term1633429.getClass(), "bufferStrategy", null);
        setBooleanField(term1633429, term1633429.getClass(), "ignoreRepaint", false);
        setBooleanField(term1633429, term1633429.getClass(), "visible", false);
        setBooleanField(term1633429, term1633429.getClass(), "enabled", false);
        setBooleanField(term1633429, term1633429.getClass(), "valid", false);
        setField(term1633429, term1633429.getClass(), "dropTarget", null);
        setField(term1633429, term1633429.getClass(), "popups", null);
        setField(term1633429, term1633429.getClass(), "name", null);
        setBooleanField(term1633429, term1633429.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1633429, term1633429.getClass(), "focusable", false);
        setIntField(term1633429, term1633429.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1633429, term1633429.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1633429, term1633429.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1633429, term1633429.getClass(), "acc", null);
        setField(term1633429, term1633429.getClass(), "minSize", null);
        setBooleanField(term1633429, term1633429.getClass(), "minSizeSet", false);
        setField(term1633429, term1633429.getClass(), "prefSize", null);
        setBooleanField(term1633429, term1633429.getClass(), "prefSizeSet", false);
        setField(term1633429, term1633429.getClass(), "maxSize", null);
        setBooleanField(term1633429, term1633429.getClass(), "maxSizeSet", false);
        setField(term1633429, term1633429.getClass(), "componentOrientation", null);
        setBooleanField(term1633429, term1633429.getClass(), "newEventsOnly", false);
        setField(term1633429, term1633429.getClass(), "componentListener", null);
        setField(term1633429, term1633429.getClass(), "focusListener", null);
        setField(term1633429, term1633429.getClass(), "hierarchyListener", null);
        setField(term1633429, term1633429.getClass(), "hierarchyBoundsListener", null);
        setField(term1633429, term1633429.getClass(), "keyListener", null);
        setField(term1633429, term1633429.getClass(), "mouseListener", null);
        setField(term1633429, term1633429.getClass(), "mouseMotionListener", null);
        setField(term1633429, term1633429.getClass(), "mouseWheelListener", null);
        setField(term1633429, term1633429.getClass(), "inputMethodListener", null);
        setLongField(term1633429, term1633429.getClass(), "eventMask", 0L);
        setField(term1633429, term1633429.getClass(), "changeSupport", null);
        setField(term1633429, term1633429.getClass(), "objectLock", null);
        setBooleanField(term1633429, term1633429.getClass(), "isPacked", false);
        setIntField(term1633429, term1633429.getClass(), "boundsOp", 0);
        setField(term1633429, term1633429.getClass(), "compoundShape", null);
        setField(term1633429, term1633429.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1633429, term1633429.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1633429, term1633429.getClass(), "backgroundEraseDisabled", false);
        setField(term1633429, term1633429.getClass(), "eventCache", null);
        setBooleanField(term1633429, term1633429.getClass(), "coalescingEnabled", false);
        setBooleanField(term1633429, term1633429.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1633429, term1633429.getClass(), "componentSerializedDataVersion", 0);
        setField(term1633429, term1633429.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getRealmFromString", argTypes, term1633429, args);
    }

};


