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

public class DiplomacyView_getAiNegotiationList_4246216651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1835269;

    public DiplomacyView_getAiNegotiationList_4246216651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1835269 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1835269, term1835269.getClass(), "human", null);
        setField(term1835269, term1835269.getClass(), "borderCrossedFleet", null);
        setField(term1835269, term1835269.getClass(), "ai", null);
        setField(term1835269, term1835269.getClass(), "starMap", null);
        setField(term1835269, term1835269.getClass(), "trade", null);
        setField(term1835269, term1835269.getClass(), "humanTechListOffer", null);
        setField(term1835269, term1835269.getClass(), "aiTechListOffer", null);
        setField(term1835269, term1835269.getClass(), "humanFleetListOffer", null);
        setField(term1835269, term1835269.getClass(), "aiFleetListOffer", null);
        setField(term1835269, term1835269.getClass(), "humanPlanetListOffer", null);
        setField(term1835269, term1835269.getClass(), "aiPlanetListOffer", null);
        setField(term1835269, term1835269.getClass(), "humanCreditOffer", null);
        setIntField(term1835269, term1835269.getClass(), "humanCredits", 0);
        setField(term1835269, term1835269.getClass(), "humanArtifactOffer", null);
        setIntField(term1835269, term1835269.getClass(), "humanArtifacts", 0);
        setField(term1835269, term1835269.getClass(), "aiCreditOffer", null);
        setIntField(term1835269, term1835269.getClass(), "aiCredits", 0);
        setField(term1835269, term1835269.getClass(), "aiArtifactOffer", null);
        setIntField(term1835269, term1835269.getClass(), "aiArtifacts", 0);
        setField(term1835269, term1835269.getClass(), "humanLines", null);
        setField(term1835269, term1835269.getClass(), "humanMapPlanetsOffer", null);
        setField(term1835269, term1835269.getClass(), "aiMapPlanetsOffer", null);
        setField(term1835269, term1835269.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1835269, term1835269.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1835269, term1835269.getClass(), "humanMapOffer", null);
        setField(term1835269, term1835269.getClass(), "aiMapOffer", null);
        setField(term1835269, term1835269.getClass(), "humanVoteYes", null);
        setField(term1835269, term1835269.getClass(), "humanVoteNo", null);
        setField(term1835269, term1835269.getClass(), "aiVoteYes", null);
        setField(term1835269, term1835269.getClass(), "aiVoteNo", null);
        setField(term1835269, term1835269.getClass(), "infoText", null);
        setField(term1835269, term1835269.getClass(), "likenessLabel", null);
        setField(term1835269, term1835269.getClass(), "endBtn", null);
        setField(term1835269, term1835269.getClass(), "meetingPlace", null);
        setBooleanField(term1835269, term1835269.getClass(), "tradeHappened", false);
        setField(term1835269, term1835269.getClass(), "aiImg", null);
        setIntField(term1835269, term1835269.getClass(), "textCounter", 0);
        setField(term1835269, term1835269.getClass(), "lastSpeechType", null);
        setField(term1835269, term1835269.getClass(), "embargoLine", null);
        setField(term1835269, term1835269.getClass(), "game", null);
        setBooleanField(term1835269, term1835269.getClass(), "isAlignmentXSet", false);
        setFloatField(term1835269, term1835269.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1835269, term1835269.getClass(), "isAlignmentYSet", false);
        setFloatField(term1835269, term1835269.getClass(), "alignmentY", 0.0F);
        setField(term1835269, term1835269.getClass(), "ui", null);
        setField(term1835269, term1835269.getClass(), "listenerList", null);
        setField(term1835269, term1835269.getClass(), "clientProperties", null);
        setField(term1835269, term1835269.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1835269, term1835269.getClass(), "autoscrolls", false);
        setField(term1835269, term1835269.getClass(), "border", null);
        setIntField(term1835269, term1835269.getClass(), "flags", 0);
        setField(term1835269, term1835269.getClass(), "inputVerifier", null);
        setBooleanField(term1835269, term1835269.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1835269, term1835269.getClass(), "paintingChild", null);
        setField(term1835269, term1835269.getClass(), "popupMenu", null);
        setField(term1835269, term1835269.getClass(), "revalidateRunnableScheduled", null);
        setField(term1835269, term1835269.getClass(), "focusInputMap", null);
        setField(term1835269, term1835269.getClass(), "ancestorInputMap", null);
        setField(term1835269, term1835269.getClass(), "windowInputMap", null);
        setField(term1835269, term1835269.getClass(), "actionMap", null);
        setField(term1835269, term1835269.getClass(), "aaHint", null);
        setField(term1835269, term1835269.getClass(), "lcdRenderingHint", null);
        setField(term1835269, term1835269.getClass(), "component", null);
        setField(term1835269, term1835269.getClass(), "layoutMgr", null);
        setField(term1835269, term1835269.getClass(), "dispatcher", null);
        setField(term1835269, term1835269.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1835269, term1835269.getClass(), "focusCycleRoot", false);
        setBooleanField(term1835269, term1835269.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1835269, term1835269.getClass(), "printingThreads", null);
        setBooleanField(term1835269, term1835269.getClass(), "printing", false);
        setField(term1835269, term1835269.getClass(), "containerListener", null);
        setIntField(term1835269, term1835269.getClass(), "listeningChildren", 0);
        setIntField(term1835269, term1835269.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1835269, term1835269.getClass(), "descendantsCount", 0);
        setField(term1835269, term1835269.getClass(), "preserveBackgroundColor", null);
        setIntField(term1835269, term1835269.getClass(), "numOfHWComponents", 0);
        setIntField(term1835269, term1835269.getClass(), "numOfLWComponents", 0);
        setField(term1835269, term1835269.getClass(), "modalComp", null);
        setField(term1835269, term1835269.getClass(), "modalAppContext", null);
        setIntField(term1835269, term1835269.getClass(), "containerSerializedDataVersion", 0);
        setField(term1835269, term1835269.getClass(), "peer", null);
        setField(term1835269, term1835269.getClass(), "parent", null);
        setField(term1835269, term1835269.getClass(), "appContext", null);
        setIntField(term1835269, term1835269.getClass(), "x", 0);
        setIntField(term1835269, term1835269.getClass(), "y", 0);
        setIntField(term1835269, term1835269.getClass(), "width", 0);
        setIntField(term1835269, term1835269.getClass(), "height", 0);
        setField(term1835269, term1835269.getClass(), "foreground", null);
        setField(term1835269, term1835269.getClass(), "background", null);
        setField(term1835269, term1835269.getClass(), "font", null);
        setField(term1835269, term1835269.getClass(), "peerFont", null);
        setField(term1835269, term1835269.getClass(), "cursor", null);
        setField(term1835269, term1835269.getClass(), "locale", null);
        setField(term1835269, term1835269.getClass(), "graphicsConfig", null);
        setField(term1835269, term1835269.getClass(), "bufferStrategy", null);
        setBooleanField(term1835269, term1835269.getClass(), "ignoreRepaint", false);
        setBooleanField(term1835269, term1835269.getClass(), "visible", false);
        setBooleanField(term1835269, term1835269.getClass(), "enabled", false);
        setBooleanField(term1835269, term1835269.getClass(), "valid", false);
        setField(term1835269, term1835269.getClass(), "dropTarget", null);
        setField(term1835269, term1835269.getClass(), "popups", null);
        setField(term1835269, term1835269.getClass(), "name", null);
        setBooleanField(term1835269, term1835269.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1835269, term1835269.getClass(), "focusable", false);
        setIntField(term1835269, term1835269.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1835269, term1835269.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1835269, term1835269.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1835269, term1835269.getClass(), "acc", null);
        setField(term1835269, term1835269.getClass(), "minSize", null);
        setBooleanField(term1835269, term1835269.getClass(), "minSizeSet", false);
        setField(term1835269, term1835269.getClass(), "prefSize", null);
        setBooleanField(term1835269, term1835269.getClass(), "prefSizeSet", false);
        setField(term1835269, term1835269.getClass(), "maxSize", null);
        setBooleanField(term1835269, term1835269.getClass(), "maxSizeSet", false);
        setField(term1835269, term1835269.getClass(), "componentOrientation", null);
        setBooleanField(term1835269, term1835269.getClass(), "newEventsOnly", false);
        setField(term1835269, term1835269.getClass(), "componentListener", null);
        setField(term1835269, term1835269.getClass(), "focusListener", null);
        setField(term1835269, term1835269.getClass(), "hierarchyListener", null);
        setField(term1835269, term1835269.getClass(), "hierarchyBoundsListener", null);
        setField(term1835269, term1835269.getClass(), "keyListener", null);
        setField(term1835269, term1835269.getClass(), "mouseListener", null);
        setField(term1835269, term1835269.getClass(), "mouseMotionListener", null);
        setField(term1835269, term1835269.getClass(), "mouseWheelListener", null);
        setField(term1835269, term1835269.getClass(), "inputMethodListener", null);
        setLongField(term1835269, term1835269.getClass(), "eventMask", 0L);
        setField(term1835269, term1835269.getClass(), "changeSupport", null);
        setField(term1835269, term1835269.getClass(), "objectLock", null);
        setBooleanField(term1835269, term1835269.getClass(), "isPacked", false);
        setIntField(term1835269, term1835269.getClass(), "boundsOp", 0);
        setField(term1835269, term1835269.getClass(), "compoundShape", null);
        setField(term1835269, term1835269.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1835269, term1835269.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1835269, term1835269.getClass(), "backgroundEraseDisabled", false);
        setField(term1835269, term1835269.getClass(), "eventCache", null);
        setBooleanField(term1835269, term1835269.getClass(), "coalescingEnabled", false);
        setBooleanField(term1835269, term1835269.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1835269, term1835269.getClass(), "componentSerializedDataVersion", 0);
        setField(term1835269, term1835269.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAiNegotiationList", argTypes, term1835269, args);
    }

};


