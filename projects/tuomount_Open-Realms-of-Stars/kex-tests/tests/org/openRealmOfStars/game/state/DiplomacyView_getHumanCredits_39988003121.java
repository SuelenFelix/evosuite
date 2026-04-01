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

public class DiplomacyView_getHumanCredits_39988003121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1681927;

    public DiplomacyView_getHumanCredits_39988003121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1681927 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1681927, term1681927.getClass(), "human", null);
        setField(term1681927, term1681927.getClass(), "borderCrossedFleet", null);
        setField(term1681927, term1681927.getClass(), "ai", null);
        setField(term1681927, term1681927.getClass(), "starMap", null);
        setField(term1681927, term1681927.getClass(), "trade", null);
        setField(term1681927, term1681927.getClass(), "humanTechListOffer", null);
        setField(term1681927, term1681927.getClass(), "aiTechListOffer", null);
        setField(term1681927, term1681927.getClass(), "humanFleetListOffer", null);
        setField(term1681927, term1681927.getClass(), "aiFleetListOffer", null);
        setField(term1681927, term1681927.getClass(), "humanPlanetListOffer", null);
        setField(term1681927, term1681927.getClass(), "aiPlanetListOffer", null);
        setField(term1681927, term1681927.getClass(), "humanCreditOffer", null);
        setIntField(term1681927, term1681927.getClass(), "humanCredits", 0);
        setField(term1681927, term1681927.getClass(), "humanArtifactOffer", null);
        setIntField(term1681927, term1681927.getClass(), "humanArtifacts", 0);
        setField(term1681927, term1681927.getClass(), "aiCreditOffer", null);
        setIntField(term1681927, term1681927.getClass(), "aiCredits", 0);
        setField(term1681927, term1681927.getClass(), "aiArtifactOffer", null);
        setIntField(term1681927, term1681927.getClass(), "aiArtifacts", 0);
        setField(term1681927, term1681927.getClass(), "humanLines", null);
        setField(term1681927, term1681927.getClass(), "humanMapPlanetsOffer", null);
        setField(term1681927, term1681927.getClass(), "aiMapPlanetsOffer", null);
        setField(term1681927, term1681927.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1681927, term1681927.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1681927, term1681927.getClass(), "humanMapOffer", null);
        setField(term1681927, term1681927.getClass(), "aiMapOffer", null);
        setField(term1681927, term1681927.getClass(), "humanVoteYes", null);
        setField(term1681927, term1681927.getClass(), "humanVoteNo", null);
        setField(term1681927, term1681927.getClass(), "aiVoteYes", null);
        setField(term1681927, term1681927.getClass(), "aiVoteNo", null);
        setField(term1681927, term1681927.getClass(), "infoText", null);
        setField(term1681927, term1681927.getClass(), "likenessLabel", null);
        setField(term1681927, term1681927.getClass(), "endBtn", null);
        setField(term1681927, term1681927.getClass(), "meetingPlace", null);
        setBooleanField(term1681927, term1681927.getClass(), "tradeHappened", false);
        setField(term1681927, term1681927.getClass(), "aiImg", null);
        setIntField(term1681927, term1681927.getClass(), "textCounter", 0);
        setField(term1681927, term1681927.getClass(), "lastSpeechType", null);
        setField(term1681927, term1681927.getClass(), "embargoLine", null);
        setField(term1681927, term1681927.getClass(), "game", null);
        setBooleanField(term1681927, term1681927.getClass(), "isAlignmentXSet", false);
        setFloatField(term1681927, term1681927.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1681927, term1681927.getClass(), "isAlignmentYSet", false);
        setFloatField(term1681927, term1681927.getClass(), "alignmentY", 0.0F);
        setField(term1681927, term1681927.getClass(), "ui", null);
        setField(term1681927, term1681927.getClass(), "listenerList", null);
        setField(term1681927, term1681927.getClass(), "clientProperties", null);
        setField(term1681927, term1681927.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1681927, term1681927.getClass(), "autoscrolls", false);
        setField(term1681927, term1681927.getClass(), "border", null);
        setIntField(term1681927, term1681927.getClass(), "flags", 0);
        setField(term1681927, term1681927.getClass(), "inputVerifier", null);
        setBooleanField(term1681927, term1681927.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1681927, term1681927.getClass(), "paintingChild", null);
        setField(term1681927, term1681927.getClass(), "popupMenu", null);
        setField(term1681927, term1681927.getClass(), "revalidateRunnableScheduled", null);
        setField(term1681927, term1681927.getClass(), "focusInputMap", null);
        setField(term1681927, term1681927.getClass(), "ancestorInputMap", null);
        setField(term1681927, term1681927.getClass(), "windowInputMap", null);
        setField(term1681927, term1681927.getClass(), "actionMap", null);
        setField(term1681927, term1681927.getClass(), "aaHint", null);
        setField(term1681927, term1681927.getClass(), "lcdRenderingHint", null);
        setField(term1681927, term1681927.getClass(), "component", null);
        setField(term1681927, term1681927.getClass(), "layoutMgr", null);
        setField(term1681927, term1681927.getClass(), "dispatcher", null);
        setField(term1681927, term1681927.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1681927, term1681927.getClass(), "focusCycleRoot", false);
        setBooleanField(term1681927, term1681927.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1681927, term1681927.getClass(), "printingThreads", null);
        setBooleanField(term1681927, term1681927.getClass(), "printing", false);
        setField(term1681927, term1681927.getClass(), "containerListener", null);
        setIntField(term1681927, term1681927.getClass(), "listeningChildren", 0);
        setIntField(term1681927, term1681927.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1681927, term1681927.getClass(), "descendantsCount", 0);
        setField(term1681927, term1681927.getClass(), "preserveBackgroundColor", null);
        setIntField(term1681927, term1681927.getClass(), "numOfHWComponents", 0);
        setIntField(term1681927, term1681927.getClass(), "numOfLWComponents", 0);
        setField(term1681927, term1681927.getClass(), "modalComp", null);
        setField(term1681927, term1681927.getClass(), "modalAppContext", null);
        setIntField(term1681927, term1681927.getClass(), "containerSerializedDataVersion", 0);
        setField(term1681927, term1681927.getClass(), "peer", null);
        setField(term1681927, term1681927.getClass(), "parent", null);
        setField(term1681927, term1681927.getClass(), "appContext", null);
        setIntField(term1681927, term1681927.getClass(), "x", 0);
        setIntField(term1681927, term1681927.getClass(), "y", 0);
        setIntField(term1681927, term1681927.getClass(), "width", 0);
        setIntField(term1681927, term1681927.getClass(), "height", 0);
        setField(term1681927, term1681927.getClass(), "foreground", null);
        setField(term1681927, term1681927.getClass(), "background", null);
        setField(term1681927, term1681927.getClass(), "font", null);
        setField(term1681927, term1681927.getClass(), "peerFont", null);
        setField(term1681927, term1681927.getClass(), "cursor", null);
        setField(term1681927, term1681927.getClass(), "locale", null);
        setField(term1681927, term1681927.getClass(), "graphicsConfig", null);
        setField(term1681927, term1681927.getClass(), "bufferStrategy", null);
        setBooleanField(term1681927, term1681927.getClass(), "ignoreRepaint", false);
        setBooleanField(term1681927, term1681927.getClass(), "visible", false);
        setBooleanField(term1681927, term1681927.getClass(), "enabled", false);
        setBooleanField(term1681927, term1681927.getClass(), "valid", false);
        setField(term1681927, term1681927.getClass(), "dropTarget", null);
        setField(term1681927, term1681927.getClass(), "popups", null);
        setField(term1681927, term1681927.getClass(), "name", null);
        setBooleanField(term1681927, term1681927.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1681927, term1681927.getClass(), "focusable", false);
        setIntField(term1681927, term1681927.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1681927, term1681927.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1681927, term1681927.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1681927, term1681927.getClass(), "acc", null);
        setField(term1681927, term1681927.getClass(), "minSize", null);
        setBooleanField(term1681927, term1681927.getClass(), "minSizeSet", false);
        setField(term1681927, term1681927.getClass(), "prefSize", null);
        setBooleanField(term1681927, term1681927.getClass(), "prefSizeSet", false);
        setField(term1681927, term1681927.getClass(), "maxSize", null);
        setBooleanField(term1681927, term1681927.getClass(), "maxSizeSet", false);
        setField(term1681927, term1681927.getClass(), "componentOrientation", null);
        setBooleanField(term1681927, term1681927.getClass(), "newEventsOnly", false);
        setField(term1681927, term1681927.getClass(), "componentListener", null);
        setField(term1681927, term1681927.getClass(), "focusListener", null);
        setField(term1681927, term1681927.getClass(), "hierarchyListener", null);
        setField(term1681927, term1681927.getClass(), "hierarchyBoundsListener", null);
        setField(term1681927, term1681927.getClass(), "keyListener", null);
        setField(term1681927, term1681927.getClass(), "mouseListener", null);
        setField(term1681927, term1681927.getClass(), "mouseMotionListener", null);
        setField(term1681927, term1681927.getClass(), "mouseWheelListener", null);
        setField(term1681927, term1681927.getClass(), "inputMethodListener", null);
        setLongField(term1681927, term1681927.getClass(), "eventMask", 0L);
        setField(term1681927, term1681927.getClass(), "changeSupport", null);
        setField(term1681927, term1681927.getClass(), "objectLock", null);
        setBooleanField(term1681927, term1681927.getClass(), "isPacked", false);
        setIntField(term1681927, term1681927.getClass(), "boundsOp", 0);
        setField(term1681927, term1681927.getClass(), "compoundShape", null);
        setField(term1681927, term1681927.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1681927, term1681927.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1681927, term1681927.getClass(), "backgroundEraseDisabled", false);
        setField(term1681927, term1681927.getClass(), "eventCache", null);
        setBooleanField(term1681927, term1681927.getClass(), "coalescingEnabled", false);
        setBooleanField(term1681927, term1681927.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1681927, term1681927.getClass(), "componentSerializedDataVersion", 0);
        setField(term1681927, term1681927.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHumanCredits", argTypes, term1681927, args);
    }

};


