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

public class DiplomacyView_finishTransaction_141246807449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1826586;

    public DiplomacyView_finishTransaction_141246807449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1826586 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1826586, term1826586.getClass(), "human", null);
        setField(term1826586, term1826586.getClass(), "borderCrossedFleet", null);
        setField(term1826586, term1826586.getClass(), "ai", null);
        setField(term1826586, term1826586.getClass(), "starMap", null);
        setField(term1826586, term1826586.getClass(), "trade", null);
        setField(term1826586, term1826586.getClass(), "humanTechListOffer", null);
        setField(term1826586, term1826586.getClass(), "aiTechListOffer", null);
        setField(term1826586, term1826586.getClass(), "humanFleetListOffer", null);
        setField(term1826586, term1826586.getClass(), "aiFleetListOffer", null);
        setField(term1826586, term1826586.getClass(), "humanPlanetListOffer", null);
        setField(term1826586, term1826586.getClass(), "aiPlanetListOffer", null);
        setField(term1826586, term1826586.getClass(), "humanCreditOffer", null);
        setIntField(term1826586, term1826586.getClass(), "humanCredits", 0);
        setField(term1826586, term1826586.getClass(), "humanArtifactOffer", null);
        setIntField(term1826586, term1826586.getClass(), "humanArtifacts", 0);
        setField(term1826586, term1826586.getClass(), "aiCreditOffer", null);
        setIntField(term1826586, term1826586.getClass(), "aiCredits", 0);
        setField(term1826586, term1826586.getClass(), "aiArtifactOffer", null);
        setIntField(term1826586, term1826586.getClass(), "aiArtifacts", 0);
        setField(term1826586, term1826586.getClass(), "humanLines", null);
        setField(term1826586, term1826586.getClass(), "humanMapPlanetsOffer", null);
        setField(term1826586, term1826586.getClass(), "aiMapPlanetsOffer", null);
        setField(term1826586, term1826586.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1826586, term1826586.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1826586, term1826586.getClass(), "humanMapOffer", null);
        setField(term1826586, term1826586.getClass(), "aiMapOffer", null);
        setField(term1826586, term1826586.getClass(), "humanVoteYes", null);
        setField(term1826586, term1826586.getClass(), "humanVoteNo", null);
        setField(term1826586, term1826586.getClass(), "aiVoteYes", null);
        setField(term1826586, term1826586.getClass(), "aiVoteNo", null);
        setField(term1826586, term1826586.getClass(), "infoText", null);
        setField(term1826586, term1826586.getClass(), "likenessLabel", null);
        setField(term1826586, term1826586.getClass(), "endBtn", null);
        setField(term1826586, term1826586.getClass(), "meetingPlace", null);
        setBooleanField(term1826586, term1826586.getClass(), "tradeHappened", false);
        setField(term1826586, term1826586.getClass(), "aiImg", null);
        setIntField(term1826586, term1826586.getClass(), "textCounter", 0);
        setField(term1826586, term1826586.getClass(), "lastSpeechType", null);
        setField(term1826586, term1826586.getClass(), "embargoLine", null);
        setField(term1826586, term1826586.getClass(), "game", null);
        setBooleanField(term1826586, term1826586.getClass(), "isAlignmentXSet", false);
        setFloatField(term1826586, term1826586.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1826586, term1826586.getClass(), "isAlignmentYSet", false);
        setFloatField(term1826586, term1826586.getClass(), "alignmentY", 0.0F);
        setField(term1826586, term1826586.getClass(), "ui", null);
        setField(term1826586, term1826586.getClass(), "listenerList", null);
        setField(term1826586, term1826586.getClass(), "clientProperties", null);
        setField(term1826586, term1826586.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1826586, term1826586.getClass(), "autoscrolls", false);
        setField(term1826586, term1826586.getClass(), "border", null);
        setIntField(term1826586, term1826586.getClass(), "flags", 0);
        setField(term1826586, term1826586.getClass(), "inputVerifier", null);
        setBooleanField(term1826586, term1826586.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1826586, term1826586.getClass(), "paintingChild", null);
        setField(term1826586, term1826586.getClass(), "popupMenu", null);
        setField(term1826586, term1826586.getClass(), "revalidateRunnableScheduled", null);
        setField(term1826586, term1826586.getClass(), "focusInputMap", null);
        setField(term1826586, term1826586.getClass(), "ancestorInputMap", null);
        setField(term1826586, term1826586.getClass(), "windowInputMap", null);
        setField(term1826586, term1826586.getClass(), "actionMap", null);
        setField(term1826586, term1826586.getClass(), "aaHint", null);
        setField(term1826586, term1826586.getClass(), "lcdRenderingHint", null);
        setField(term1826586, term1826586.getClass(), "component", null);
        setField(term1826586, term1826586.getClass(), "layoutMgr", null);
        setField(term1826586, term1826586.getClass(), "dispatcher", null);
        setField(term1826586, term1826586.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1826586, term1826586.getClass(), "focusCycleRoot", false);
        setBooleanField(term1826586, term1826586.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1826586, term1826586.getClass(), "printingThreads", null);
        setBooleanField(term1826586, term1826586.getClass(), "printing", false);
        setField(term1826586, term1826586.getClass(), "containerListener", null);
        setIntField(term1826586, term1826586.getClass(), "listeningChildren", 0);
        setIntField(term1826586, term1826586.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1826586, term1826586.getClass(), "descendantsCount", 0);
        setField(term1826586, term1826586.getClass(), "preserveBackgroundColor", null);
        setIntField(term1826586, term1826586.getClass(), "numOfHWComponents", 0);
        setIntField(term1826586, term1826586.getClass(), "numOfLWComponents", 0);
        setField(term1826586, term1826586.getClass(), "modalComp", null);
        setField(term1826586, term1826586.getClass(), "modalAppContext", null);
        setIntField(term1826586, term1826586.getClass(), "containerSerializedDataVersion", 0);
        setField(term1826586, term1826586.getClass(), "peer", null);
        setField(term1826586, term1826586.getClass(), "parent", null);
        setField(term1826586, term1826586.getClass(), "appContext", null);
        setIntField(term1826586, term1826586.getClass(), "x", 0);
        setIntField(term1826586, term1826586.getClass(), "y", 0);
        setIntField(term1826586, term1826586.getClass(), "width", 0);
        setIntField(term1826586, term1826586.getClass(), "height", 0);
        setField(term1826586, term1826586.getClass(), "foreground", null);
        setField(term1826586, term1826586.getClass(), "background", null);
        setField(term1826586, term1826586.getClass(), "font", null);
        setField(term1826586, term1826586.getClass(), "peerFont", null);
        setField(term1826586, term1826586.getClass(), "cursor", null);
        setField(term1826586, term1826586.getClass(), "locale", null);
        setField(term1826586, term1826586.getClass(), "graphicsConfig", null);
        setField(term1826586, term1826586.getClass(), "bufferStrategy", null);
        setBooleanField(term1826586, term1826586.getClass(), "ignoreRepaint", false);
        setBooleanField(term1826586, term1826586.getClass(), "visible", false);
        setBooleanField(term1826586, term1826586.getClass(), "enabled", false);
        setBooleanField(term1826586, term1826586.getClass(), "valid", false);
        setField(term1826586, term1826586.getClass(), "dropTarget", null);
        setField(term1826586, term1826586.getClass(), "popups", null);
        setField(term1826586, term1826586.getClass(), "name", null);
        setBooleanField(term1826586, term1826586.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1826586, term1826586.getClass(), "focusable", false);
        setIntField(term1826586, term1826586.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1826586, term1826586.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1826586, term1826586.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1826586, term1826586.getClass(), "acc", null);
        setField(term1826586, term1826586.getClass(), "minSize", null);
        setBooleanField(term1826586, term1826586.getClass(), "minSizeSet", false);
        setField(term1826586, term1826586.getClass(), "prefSize", null);
        setBooleanField(term1826586, term1826586.getClass(), "prefSizeSet", false);
        setField(term1826586, term1826586.getClass(), "maxSize", null);
        setBooleanField(term1826586, term1826586.getClass(), "maxSizeSet", false);
        setField(term1826586, term1826586.getClass(), "componentOrientation", null);
        setBooleanField(term1826586, term1826586.getClass(), "newEventsOnly", false);
        setField(term1826586, term1826586.getClass(), "componentListener", null);
        setField(term1826586, term1826586.getClass(), "focusListener", null);
        setField(term1826586, term1826586.getClass(), "hierarchyListener", null);
        setField(term1826586, term1826586.getClass(), "hierarchyBoundsListener", null);
        setField(term1826586, term1826586.getClass(), "keyListener", null);
        setField(term1826586, term1826586.getClass(), "mouseListener", null);
        setField(term1826586, term1826586.getClass(), "mouseMotionListener", null);
        setField(term1826586, term1826586.getClass(), "mouseWheelListener", null);
        setField(term1826586, term1826586.getClass(), "inputMethodListener", null);
        setLongField(term1826586, term1826586.getClass(), "eventMask", 0L);
        setField(term1826586, term1826586.getClass(), "changeSupport", null);
        setField(term1826586, term1826586.getClass(), "objectLock", null);
        setBooleanField(term1826586, term1826586.getClass(), "isPacked", false);
        setIntField(term1826586, term1826586.getClass(), "boundsOp", 0);
        setField(term1826586, term1826586.getClass(), "compoundShape", null);
        setField(term1826586, term1826586.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1826586, term1826586.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1826586, term1826586.getClass(), "backgroundEraseDisabled", false);
        setField(term1826586, term1826586.getClass(), "eventCache", null);
        setBooleanField(term1826586, term1826586.getClass(), "coalescingEnabled", false);
        setBooleanField(term1826586, term1826586.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1826586, term1826586.getClass(), "componentSerializedDataVersion", 0);
        setField(term1826586, term1826586.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "finishTransaction", argTypes, term1826586, args);
    }

};


