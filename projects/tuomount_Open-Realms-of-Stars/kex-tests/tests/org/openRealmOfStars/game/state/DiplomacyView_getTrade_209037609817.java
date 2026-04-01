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

public class DiplomacyView_getTrade_209037609817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1666940;

    public DiplomacyView_getTrade_209037609817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1666940 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1666940, term1666940.getClass(), "human", null);
        setField(term1666940, term1666940.getClass(), "borderCrossedFleet", null);
        setField(term1666940, term1666940.getClass(), "ai", null);
        setField(term1666940, term1666940.getClass(), "starMap", null);
        setField(term1666940, term1666940.getClass(), "trade", null);
        setField(term1666940, term1666940.getClass(), "humanTechListOffer", null);
        setField(term1666940, term1666940.getClass(), "aiTechListOffer", null);
        setField(term1666940, term1666940.getClass(), "humanFleetListOffer", null);
        setField(term1666940, term1666940.getClass(), "aiFleetListOffer", null);
        setField(term1666940, term1666940.getClass(), "humanPlanetListOffer", null);
        setField(term1666940, term1666940.getClass(), "aiPlanetListOffer", null);
        setField(term1666940, term1666940.getClass(), "humanCreditOffer", null);
        setIntField(term1666940, term1666940.getClass(), "humanCredits", 0);
        setField(term1666940, term1666940.getClass(), "humanArtifactOffer", null);
        setIntField(term1666940, term1666940.getClass(), "humanArtifacts", 0);
        setField(term1666940, term1666940.getClass(), "aiCreditOffer", null);
        setIntField(term1666940, term1666940.getClass(), "aiCredits", 0);
        setField(term1666940, term1666940.getClass(), "aiArtifactOffer", null);
        setIntField(term1666940, term1666940.getClass(), "aiArtifacts", 0);
        setField(term1666940, term1666940.getClass(), "humanLines", null);
        setField(term1666940, term1666940.getClass(), "humanMapPlanetsOffer", null);
        setField(term1666940, term1666940.getClass(), "aiMapPlanetsOffer", null);
        setField(term1666940, term1666940.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1666940, term1666940.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1666940, term1666940.getClass(), "humanMapOffer", null);
        setField(term1666940, term1666940.getClass(), "aiMapOffer", null);
        setField(term1666940, term1666940.getClass(), "humanVoteYes", null);
        setField(term1666940, term1666940.getClass(), "humanVoteNo", null);
        setField(term1666940, term1666940.getClass(), "aiVoteYes", null);
        setField(term1666940, term1666940.getClass(), "aiVoteNo", null);
        setField(term1666940, term1666940.getClass(), "infoText", null);
        setField(term1666940, term1666940.getClass(), "likenessLabel", null);
        setField(term1666940, term1666940.getClass(), "endBtn", null);
        setField(term1666940, term1666940.getClass(), "meetingPlace", null);
        setBooleanField(term1666940, term1666940.getClass(), "tradeHappened", false);
        setField(term1666940, term1666940.getClass(), "aiImg", null);
        setIntField(term1666940, term1666940.getClass(), "textCounter", 0);
        setField(term1666940, term1666940.getClass(), "lastSpeechType", null);
        setField(term1666940, term1666940.getClass(), "embargoLine", null);
        setField(term1666940, term1666940.getClass(), "game", null);
        setBooleanField(term1666940, term1666940.getClass(), "isAlignmentXSet", false);
        setFloatField(term1666940, term1666940.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1666940, term1666940.getClass(), "isAlignmentYSet", false);
        setFloatField(term1666940, term1666940.getClass(), "alignmentY", 0.0F);
        setField(term1666940, term1666940.getClass(), "ui", null);
        setField(term1666940, term1666940.getClass(), "listenerList", null);
        setField(term1666940, term1666940.getClass(), "clientProperties", null);
        setField(term1666940, term1666940.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1666940, term1666940.getClass(), "autoscrolls", false);
        setField(term1666940, term1666940.getClass(), "border", null);
        setIntField(term1666940, term1666940.getClass(), "flags", 0);
        setField(term1666940, term1666940.getClass(), "inputVerifier", null);
        setBooleanField(term1666940, term1666940.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1666940, term1666940.getClass(), "paintingChild", null);
        setField(term1666940, term1666940.getClass(), "popupMenu", null);
        setField(term1666940, term1666940.getClass(), "revalidateRunnableScheduled", null);
        setField(term1666940, term1666940.getClass(), "focusInputMap", null);
        setField(term1666940, term1666940.getClass(), "ancestorInputMap", null);
        setField(term1666940, term1666940.getClass(), "windowInputMap", null);
        setField(term1666940, term1666940.getClass(), "actionMap", null);
        setField(term1666940, term1666940.getClass(), "aaHint", null);
        setField(term1666940, term1666940.getClass(), "lcdRenderingHint", null);
        setField(term1666940, term1666940.getClass(), "component", null);
        setField(term1666940, term1666940.getClass(), "layoutMgr", null);
        setField(term1666940, term1666940.getClass(), "dispatcher", null);
        setField(term1666940, term1666940.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1666940, term1666940.getClass(), "focusCycleRoot", false);
        setBooleanField(term1666940, term1666940.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1666940, term1666940.getClass(), "printingThreads", null);
        setBooleanField(term1666940, term1666940.getClass(), "printing", false);
        setField(term1666940, term1666940.getClass(), "containerListener", null);
        setIntField(term1666940, term1666940.getClass(), "listeningChildren", 0);
        setIntField(term1666940, term1666940.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1666940, term1666940.getClass(), "descendantsCount", 0);
        setField(term1666940, term1666940.getClass(), "preserveBackgroundColor", null);
        setIntField(term1666940, term1666940.getClass(), "numOfHWComponents", 0);
        setIntField(term1666940, term1666940.getClass(), "numOfLWComponents", 0);
        setField(term1666940, term1666940.getClass(), "modalComp", null);
        setField(term1666940, term1666940.getClass(), "modalAppContext", null);
        setIntField(term1666940, term1666940.getClass(), "containerSerializedDataVersion", 0);
        setField(term1666940, term1666940.getClass(), "peer", null);
        setField(term1666940, term1666940.getClass(), "parent", null);
        setField(term1666940, term1666940.getClass(), "appContext", null);
        setIntField(term1666940, term1666940.getClass(), "x", 0);
        setIntField(term1666940, term1666940.getClass(), "y", 0);
        setIntField(term1666940, term1666940.getClass(), "width", 0);
        setIntField(term1666940, term1666940.getClass(), "height", 0);
        setField(term1666940, term1666940.getClass(), "foreground", null);
        setField(term1666940, term1666940.getClass(), "background", null);
        setField(term1666940, term1666940.getClass(), "font", null);
        setField(term1666940, term1666940.getClass(), "peerFont", null);
        setField(term1666940, term1666940.getClass(), "cursor", null);
        setField(term1666940, term1666940.getClass(), "locale", null);
        setField(term1666940, term1666940.getClass(), "graphicsConfig", null);
        setField(term1666940, term1666940.getClass(), "bufferStrategy", null);
        setBooleanField(term1666940, term1666940.getClass(), "ignoreRepaint", false);
        setBooleanField(term1666940, term1666940.getClass(), "visible", false);
        setBooleanField(term1666940, term1666940.getClass(), "enabled", false);
        setBooleanField(term1666940, term1666940.getClass(), "valid", false);
        setField(term1666940, term1666940.getClass(), "dropTarget", null);
        setField(term1666940, term1666940.getClass(), "popups", null);
        setField(term1666940, term1666940.getClass(), "name", null);
        setBooleanField(term1666940, term1666940.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1666940, term1666940.getClass(), "focusable", false);
        setIntField(term1666940, term1666940.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1666940, term1666940.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1666940, term1666940.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1666940, term1666940.getClass(), "acc", null);
        setField(term1666940, term1666940.getClass(), "minSize", null);
        setBooleanField(term1666940, term1666940.getClass(), "minSizeSet", false);
        setField(term1666940, term1666940.getClass(), "prefSize", null);
        setBooleanField(term1666940, term1666940.getClass(), "prefSizeSet", false);
        setField(term1666940, term1666940.getClass(), "maxSize", null);
        setBooleanField(term1666940, term1666940.getClass(), "maxSizeSet", false);
        setField(term1666940, term1666940.getClass(), "componentOrientation", null);
        setBooleanField(term1666940, term1666940.getClass(), "newEventsOnly", false);
        setField(term1666940, term1666940.getClass(), "componentListener", null);
        setField(term1666940, term1666940.getClass(), "focusListener", null);
        setField(term1666940, term1666940.getClass(), "hierarchyListener", null);
        setField(term1666940, term1666940.getClass(), "hierarchyBoundsListener", null);
        setField(term1666940, term1666940.getClass(), "keyListener", null);
        setField(term1666940, term1666940.getClass(), "mouseListener", null);
        setField(term1666940, term1666940.getClass(), "mouseMotionListener", null);
        setField(term1666940, term1666940.getClass(), "mouseWheelListener", null);
        setField(term1666940, term1666940.getClass(), "inputMethodListener", null);
        setLongField(term1666940, term1666940.getClass(), "eventMask", 0L);
        setField(term1666940, term1666940.getClass(), "changeSupport", null);
        setField(term1666940, term1666940.getClass(), "objectLock", null);
        setBooleanField(term1666940, term1666940.getClass(), "isPacked", false);
        setIntField(term1666940, term1666940.getClass(), "boundsOp", 0);
        setField(term1666940, term1666940.getClass(), "compoundShape", null);
        setField(term1666940, term1666940.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1666940, term1666940.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1666940, term1666940.getClass(), "backgroundEraseDisabled", false);
        setField(term1666940, term1666940.getClass(), "eventCache", null);
        setBooleanField(term1666940, term1666940.getClass(), "coalescingEnabled", false);
        setBooleanField(term1666940, term1666940.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1666940, term1666940.getClass(), "componentSerializedDataVersion", 0);
        setField(term1666940, term1666940.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrade", argTypes, term1666940, args);
    }

};


