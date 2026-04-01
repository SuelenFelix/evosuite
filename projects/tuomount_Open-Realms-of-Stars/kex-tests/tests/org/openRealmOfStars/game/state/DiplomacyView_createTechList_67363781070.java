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

public class DiplomacyView_createTechList_67363781070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1911137;

    public DiplomacyView_createTechList_67363781070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1911137 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1911137, term1911137.getClass(), "human", null);
        setField(term1911137, term1911137.getClass(), "borderCrossedFleet", null);
        setField(term1911137, term1911137.getClass(), "ai", null);
        setField(term1911137, term1911137.getClass(), "starMap", null);
        setField(term1911137, term1911137.getClass(), "trade", null);
        setField(term1911137, term1911137.getClass(), "humanTechListOffer", null);
        setField(term1911137, term1911137.getClass(), "aiTechListOffer", null);
        setField(term1911137, term1911137.getClass(), "humanFleetListOffer", null);
        setField(term1911137, term1911137.getClass(), "aiFleetListOffer", null);
        setField(term1911137, term1911137.getClass(), "humanPlanetListOffer", null);
        setField(term1911137, term1911137.getClass(), "aiPlanetListOffer", null);
        setField(term1911137, term1911137.getClass(), "humanCreditOffer", null);
        setIntField(term1911137, term1911137.getClass(), "humanCredits", 0);
        setField(term1911137, term1911137.getClass(), "humanArtifactOffer", null);
        setIntField(term1911137, term1911137.getClass(), "humanArtifacts", 0);
        setField(term1911137, term1911137.getClass(), "aiCreditOffer", null);
        setIntField(term1911137, term1911137.getClass(), "aiCredits", 0);
        setField(term1911137, term1911137.getClass(), "aiArtifactOffer", null);
        setIntField(term1911137, term1911137.getClass(), "aiArtifacts", 0);
        setField(term1911137, term1911137.getClass(), "humanLines", null);
        setField(term1911137, term1911137.getClass(), "humanMapPlanetsOffer", null);
        setField(term1911137, term1911137.getClass(), "aiMapPlanetsOffer", null);
        setField(term1911137, term1911137.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1911137, term1911137.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1911137, term1911137.getClass(), "humanMapOffer", null);
        setField(term1911137, term1911137.getClass(), "aiMapOffer", null);
        setField(term1911137, term1911137.getClass(), "humanVoteYes", null);
        setField(term1911137, term1911137.getClass(), "humanVoteNo", null);
        setField(term1911137, term1911137.getClass(), "aiVoteYes", null);
        setField(term1911137, term1911137.getClass(), "aiVoteNo", null);
        setField(term1911137, term1911137.getClass(), "infoText", null);
        setField(term1911137, term1911137.getClass(), "likenessLabel", null);
        setField(term1911137, term1911137.getClass(), "endBtn", null);
        setField(term1911137, term1911137.getClass(), "meetingPlace", null);
        setBooleanField(term1911137, term1911137.getClass(), "tradeHappened", false);
        setField(term1911137, term1911137.getClass(), "aiImg", null);
        setIntField(term1911137, term1911137.getClass(), "textCounter", 0);
        setField(term1911137, term1911137.getClass(), "lastSpeechType", null);
        setField(term1911137, term1911137.getClass(), "embargoLine", null);
        setField(term1911137, term1911137.getClass(), "game", null);
        setBooleanField(term1911137, term1911137.getClass(), "isAlignmentXSet", false);
        setFloatField(term1911137, term1911137.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1911137, term1911137.getClass(), "isAlignmentYSet", false);
        setFloatField(term1911137, term1911137.getClass(), "alignmentY", 0.0F);
        setField(term1911137, term1911137.getClass(), "ui", null);
        setField(term1911137, term1911137.getClass(), "listenerList", null);
        setField(term1911137, term1911137.getClass(), "clientProperties", null);
        setField(term1911137, term1911137.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1911137, term1911137.getClass(), "autoscrolls", false);
        setField(term1911137, term1911137.getClass(), "border", null);
        setIntField(term1911137, term1911137.getClass(), "flags", 0);
        setField(term1911137, term1911137.getClass(), "inputVerifier", null);
        setBooleanField(term1911137, term1911137.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1911137, term1911137.getClass(), "paintingChild", null);
        setField(term1911137, term1911137.getClass(), "popupMenu", null);
        setField(term1911137, term1911137.getClass(), "revalidateRunnableScheduled", null);
        setField(term1911137, term1911137.getClass(), "focusInputMap", null);
        setField(term1911137, term1911137.getClass(), "ancestorInputMap", null);
        setField(term1911137, term1911137.getClass(), "windowInputMap", null);
        setField(term1911137, term1911137.getClass(), "actionMap", null);
        setField(term1911137, term1911137.getClass(), "aaHint", null);
        setField(term1911137, term1911137.getClass(), "lcdRenderingHint", null);
        setField(term1911137, term1911137.getClass(), "component", null);
        setField(term1911137, term1911137.getClass(), "layoutMgr", null);
        setField(term1911137, term1911137.getClass(), "dispatcher", null);
        setField(term1911137, term1911137.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1911137, term1911137.getClass(), "focusCycleRoot", false);
        setBooleanField(term1911137, term1911137.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1911137, term1911137.getClass(), "printingThreads", null);
        setBooleanField(term1911137, term1911137.getClass(), "printing", false);
        setField(term1911137, term1911137.getClass(), "containerListener", null);
        setIntField(term1911137, term1911137.getClass(), "listeningChildren", 0);
        setIntField(term1911137, term1911137.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1911137, term1911137.getClass(), "descendantsCount", 0);
        setField(term1911137, term1911137.getClass(), "preserveBackgroundColor", null);
        setIntField(term1911137, term1911137.getClass(), "numOfHWComponents", 0);
        setIntField(term1911137, term1911137.getClass(), "numOfLWComponents", 0);
        setField(term1911137, term1911137.getClass(), "modalComp", null);
        setField(term1911137, term1911137.getClass(), "modalAppContext", null);
        setIntField(term1911137, term1911137.getClass(), "containerSerializedDataVersion", 0);
        setField(term1911137, term1911137.getClass(), "peer", null);
        setField(term1911137, term1911137.getClass(), "parent", null);
        setField(term1911137, term1911137.getClass(), "appContext", null);
        setIntField(term1911137, term1911137.getClass(), "x", 0);
        setIntField(term1911137, term1911137.getClass(), "y", 0);
        setIntField(term1911137, term1911137.getClass(), "width", 0);
        setIntField(term1911137, term1911137.getClass(), "height", 0);
        setField(term1911137, term1911137.getClass(), "foreground", null);
        setField(term1911137, term1911137.getClass(), "background", null);
        setField(term1911137, term1911137.getClass(), "font", null);
        setField(term1911137, term1911137.getClass(), "peerFont", null);
        setField(term1911137, term1911137.getClass(), "cursor", null);
        setField(term1911137, term1911137.getClass(), "locale", null);
        setField(term1911137, term1911137.getClass(), "graphicsConfig", null);
        setField(term1911137, term1911137.getClass(), "bufferStrategy", null);
        setBooleanField(term1911137, term1911137.getClass(), "ignoreRepaint", false);
        setBooleanField(term1911137, term1911137.getClass(), "visible", false);
        setBooleanField(term1911137, term1911137.getClass(), "enabled", false);
        setBooleanField(term1911137, term1911137.getClass(), "valid", false);
        setField(term1911137, term1911137.getClass(), "dropTarget", null);
        setField(term1911137, term1911137.getClass(), "popups", null);
        setField(term1911137, term1911137.getClass(), "name", null);
        setBooleanField(term1911137, term1911137.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1911137, term1911137.getClass(), "focusable", false);
        setIntField(term1911137, term1911137.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1911137, term1911137.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1911137, term1911137.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1911137, term1911137.getClass(), "acc", null);
        setField(term1911137, term1911137.getClass(), "minSize", null);
        setBooleanField(term1911137, term1911137.getClass(), "minSizeSet", false);
        setField(term1911137, term1911137.getClass(), "prefSize", null);
        setBooleanField(term1911137, term1911137.getClass(), "prefSizeSet", false);
        setField(term1911137, term1911137.getClass(), "maxSize", null);
        setBooleanField(term1911137, term1911137.getClass(), "maxSizeSet", false);
        setField(term1911137, term1911137.getClass(), "componentOrientation", null);
        setBooleanField(term1911137, term1911137.getClass(), "newEventsOnly", false);
        setField(term1911137, term1911137.getClass(), "componentListener", null);
        setField(term1911137, term1911137.getClass(), "focusListener", null);
        setField(term1911137, term1911137.getClass(), "hierarchyListener", null);
        setField(term1911137, term1911137.getClass(), "hierarchyBoundsListener", null);
        setField(term1911137, term1911137.getClass(), "keyListener", null);
        setField(term1911137, term1911137.getClass(), "mouseListener", null);
        setField(term1911137, term1911137.getClass(), "mouseMotionListener", null);
        setField(term1911137, term1911137.getClass(), "mouseWheelListener", null);
        setField(term1911137, term1911137.getClass(), "inputMethodListener", null);
        setLongField(term1911137, term1911137.getClass(), "eventMask", 0L);
        setField(term1911137, term1911137.getClass(), "changeSupport", null);
        setField(term1911137, term1911137.getClass(), "objectLock", null);
        setBooleanField(term1911137, term1911137.getClass(), "isPacked", false);
        setIntField(term1911137, term1911137.getClass(), "boundsOp", 0);
        setField(term1911137, term1911137.getClass(), "compoundShape", null);
        setField(term1911137, term1911137.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1911137, term1911137.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1911137, term1911137.getClass(), "backgroundEraseDisabled", false);
        setField(term1911137, term1911137.getClass(), "eventCache", null);
        setBooleanField(term1911137, term1911137.getClass(), "coalescingEnabled", false);
        setBooleanField(term1911137, term1911137.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1911137, term1911137.getClass(), "componentSerializedDataVersion", 0);
        setField(term1911137, term1911137.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createTechList", argTypes, term1911137, args);
    }

};


