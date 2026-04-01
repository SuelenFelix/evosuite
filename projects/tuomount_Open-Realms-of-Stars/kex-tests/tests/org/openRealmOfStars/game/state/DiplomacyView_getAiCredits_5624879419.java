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

public class DiplomacyView_getAiCredits_5624879419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1673883;

    public DiplomacyView_getAiCredits_5624879419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1673883 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1673883, term1673883.getClass(), "human", null);
        setField(term1673883, term1673883.getClass(), "borderCrossedFleet", null);
        setField(term1673883, term1673883.getClass(), "ai", null);
        setField(term1673883, term1673883.getClass(), "starMap", null);
        setField(term1673883, term1673883.getClass(), "trade", null);
        setField(term1673883, term1673883.getClass(), "humanTechListOffer", null);
        setField(term1673883, term1673883.getClass(), "aiTechListOffer", null);
        setField(term1673883, term1673883.getClass(), "humanFleetListOffer", null);
        setField(term1673883, term1673883.getClass(), "aiFleetListOffer", null);
        setField(term1673883, term1673883.getClass(), "humanPlanetListOffer", null);
        setField(term1673883, term1673883.getClass(), "aiPlanetListOffer", null);
        setField(term1673883, term1673883.getClass(), "humanCreditOffer", null);
        setIntField(term1673883, term1673883.getClass(), "humanCredits", 0);
        setField(term1673883, term1673883.getClass(), "humanArtifactOffer", null);
        setIntField(term1673883, term1673883.getClass(), "humanArtifacts", 0);
        setField(term1673883, term1673883.getClass(), "aiCreditOffer", null);
        setIntField(term1673883, term1673883.getClass(), "aiCredits", 0);
        setField(term1673883, term1673883.getClass(), "aiArtifactOffer", null);
        setIntField(term1673883, term1673883.getClass(), "aiArtifacts", 0);
        setField(term1673883, term1673883.getClass(), "humanLines", null);
        setField(term1673883, term1673883.getClass(), "humanMapPlanetsOffer", null);
        setField(term1673883, term1673883.getClass(), "aiMapPlanetsOffer", null);
        setField(term1673883, term1673883.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1673883, term1673883.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1673883, term1673883.getClass(), "humanMapOffer", null);
        setField(term1673883, term1673883.getClass(), "aiMapOffer", null);
        setField(term1673883, term1673883.getClass(), "humanVoteYes", null);
        setField(term1673883, term1673883.getClass(), "humanVoteNo", null);
        setField(term1673883, term1673883.getClass(), "aiVoteYes", null);
        setField(term1673883, term1673883.getClass(), "aiVoteNo", null);
        setField(term1673883, term1673883.getClass(), "infoText", null);
        setField(term1673883, term1673883.getClass(), "likenessLabel", null);
        setField(term1673883, term1673883.getClass(), "endBtn", null);
        setField(term1673883, term1673883.getClass(), "meetingPlace", null);
        setBooleanField(term1673883, term1673883.getClass(), "tradeHappened", false);
        setField(term1673883, term1673883.getClass(), "aiImg", null);
        setIntField(term1673883, term1673883.getClass(), "textCounter", 0);
        setField(term1673883, term1673883.getClass(), "lastSpeechType", null);
        setField(term1673883, term1673883.getClass(), "embargoLine", null);
        setField(term1673883, term1673883.getClass(), "game", null);
        setBooleanField(term1673883, term1673883.getClass(), "isAlignmentXSet", false);
        setFloatField(term1673883, term1673883.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1673883, term1673883.getClass(), "isAlignmentYSet", false);
        setFloatField(term1673883, term1673883.getClass(), "alignmentY", 0.0F);
        setField(term1673883, term1673883.getClass(), "ui", null);
        setField(term1673883, term1673883.getClass(), "listenerList", null);
        setField(term1673883, term1673883.getClass(), "clientProperties", null);
        setField(term1673883, term1673883.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1673883, term1673883.getClass(), "autoscrolls", false);
        setField(term1673883, term1673883.getClass(), "border", null);
        setIntField(term1673883, term1673883.getClass(), "flags", 0);
        setField(term1673883, term1673883.getClass(), "inputVerifier", null);
        setBooleanField(term1673883, term1673883.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1673883, term1673883.getClass(), "paintingChild", null);
        setField(term1673883, term1673883.getClass(), "popupMenu", null);
        setField(term1673883, term1673883.getClass(), "revalidateRunnableScheduled", null);
        setField(term1673883, term1673883.getClass(), "focusInputMap", null);
        setField(term1673883, term1673883.getClass(), "ancestorInputMap", null);
        setField(term1673883, term1673883.getClass(), "windowInputMap", null);
        setField(term1673883, term1673883.getClass(), "actionMap", null);
        setField(term1673883, term1673883.getClass(), "aaHint", null);
        setField(term1673883, term1673883.getClass(), "lcdRenderingHint", null);
        setField(term1673883, term1673883.getClass(), "component", null);
        setField(term1673883, term1673883.getClass(), "layoutMgr", null);
        setField(term1673883, term1673883.getClass(), "dispatcher", null);
        setField(term1673883, term1673883.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1673883, term1673883.getClass(), "focusCycleRoot", false);
        setBooleanField(term1673883, term1673883.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1673883, term1673883.getClass(), "printingThreads", null);
        setBooleanField(term1673883, term1673883.getClass(), "printing", false);
        setField(term1673883, term1673883.getClass(), "containerListener", null);
        setIntField(term1673883, term1673883.getClass(), "listeningChildren", 0);
        setIntField(term1673883, term1673883.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1673883, term1673883.getClass(), "descendantsCount", 0);
        setField(term1673883, term1673883.getClass(), "preserveBackgroundColor", null);
        setIntField(term1673883, term1673883.getClass(), "numOfHWComponents", 0);
        setIntField(term1673883, term1673883.getClass(), "numOfLWComponents", 0);
        setField(term1673883, term1673883.getClass(), "modalComp", null);
        setField(term1673883, term1673883.getClass(), "modalAppContext", null);
        setIntField(term1673883, term1673883.getClass(), "containerSerializedDataVersion", 0);
        setField(term1673883, term1673883.getClass(), "peer", null);
        setField(term1673883, term1673883.getClass(), "parent", null);
        setField(term1673883, term1673883.getClass(), "appContext", null);
        setIntField(term1673883, term1673883.getClass(), "x", 0);
        setIntField(term1673883, term1673883.getClass(), "y", 0);
        setIntField(term1673883, term1673883.getClass(), "width", 0);
        setIntField(term1673883, term1673883.getClass(), "height", 0);
        setField(term1673883, term1673883.getClass(), "foreground", null);
        setField(term1673883, term1673883.getClass(), "background", null);
        setField(term1673883, term1673883.getClass(), "font", null);
        setField(term1673883, term1673883.getClass(), "peerFont", null);
        setField(term1673883, term1673883.getClass(), "cursor", null);
        setField(term1673883, term1673883.getClass(), "locale", null);
        setField(term1673883, term1673883.getClass(), "graphicsConfig", null);
        setField(term1673883, term1673883.getClass(), "bufferStrategy", null);
        setBooleanField(term1673883, term1673883.getClass(), "ignoreRepaint", false);
        setBooleanField(term1673883, term1673883.getClass(), "visible", false);
        setBooleanField(term1673883, term1673883.getClass(), "enabled", false);
        setBooleanField(term1673883, term1673883.getClass(), "valid", false);
        setField(term1673883, term1673883.getClass(), "dropTarget", null);
        setField(term1673883, term1673883.getClass(), "popups", null);
        setField(term1673883, term1673883.getClass(), "name", null);
        setBooleanField(term1673883, term1673883.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1673883, term1673883.getClass(), "focusable", false);
        setIntField(term1673883, term1673883.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1673883, term1673883.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1673883, term1673883.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1673883, term1673883.getClass(), "acc", null);
        setField(term1673883, term1673883.getClass(), "minSize", null);
        setBooleanField(term1673883, term1673883.getClass(), "minSizeSet", false);
        setField(term1673883, term1673883.getClass(), "prefSize", null);
        setBooleanField(term1673883, term1673883.getClass(), "prefSizeSet", false);
        setField(term1673883, term1673883.getClass(), "maxSize", null);
        setBooleanField(term1673883, term1673883.getClass(), "maxSizeSet", false);
        setField(term1673883, term1673883.getClass(), "componentOrientation", null);
        setBooleanField(term1673883, term1673883.getClass(), "newEventsOnly", false);
        setField(term1673883, term1673883.getClass(), "componentListener", null);
        setField(term1673883, term1673883.getClass(), "focusListener", null);
        setField(term1673883, term1673883.getClass(), "hierarchyListener", null);
        setField(term1673883, term1673883.getClass(), "hierarchyBoundsListener", null);
        setField(term1673883, term1673883.getClass(), "keyListener", null);
        setField(term1673883, term1673883.getClass(), "mouseListener", null);
        setField(term1673883, term1673883.getClass(), "mouseMotionListener", null);
        setField(term1673883, term1673883.getClass(), "mouseWheelListener", null);
        setField(term1673883, term1673883.getClass(), "inputMethodListener", null);
        setLongField(term1673883, term1673883.getClass(), "eventMask", 0L);
        setField(term1673883, term1673883.getClass(), "changeSupport", null);
        setField(term1673883, term1673883.getClass(), "objectLock", null);
        setBooleanField(term1673883, term1673883.getClass(), "isPacked", false);
        setIntField(term1673883, term1673883.getClass(), "boundsOp", 0);
        setField(term1673883, term1673883.getClass(), "compoundShape", null);
        setField(term1673883, term1673883.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1673883, term1673883.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1673883, term1673883.getClass(), "backgroundEraseDisabled", false);
        setField(term1673883, term1673883.getClass(), "eventCache", null);
        setBooleanField(term1673883, term1673883.getClass(), "coalescingEnabled", false);
        setBooleanField(term1673883, term1673883.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1673883, term1673883.getClass(), "componentSerializedDataVersion", 0);
        setField(term1673883, term1673883.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAiCredits", argTypes, term1673883, args);
    }

};


