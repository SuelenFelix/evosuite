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

public class DiplomacyView_isExitAllowed_194662483069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1911090;

    public DiplomacyView_isExitAllowed_194662483069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1911090 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1911090, term1911090.getClass(), "human", null);
        setField(term1911090, term1911090.getClass(), "borderCrossedFleet", null);
        setField(term1911090, term1911090.getClass(), "ai", null);
        setField(term1911090, term1911090.getClass(), "starMap", null);
        setField(term1911090, term1911090.getClass(), "trade", null);
        setField(term1911090, term1911090.getClass(), "humanTechListOffer", null);
        setField(term1911090, term1911090.getClass(), "aiTechListOffer", null);
        setField(term1911090, term1911090.getClass(), "humanFleetListOffer", null);
        setField(term1911090, term1911090.getClass(), "aiFleetListOffer", null);
        setField(term1911090, term1911090.getClass(), "humanPlanetListOffer", null);
        setField(term1911090, term1911090.getClass(), "aiPlanetListOffer", null);
        setField(term1911090, term1911090.getClass(), "humanCreditOffer", null);
        setIntField(term1911090, term1911090.getClass(), "humanCredits", 0);
        setField(term1911090, term1911090.getClass(), "humanArtifactOffer", null);
        setIntField(term1911090, term1911090.getClass(), "humanArtifacts", 0);
        setField(term1911090, term1911090.getClass(), "aiCreditOffer", null);
        setIntField(term1911090, term1911090.getClass(), "aiCredits", 0);
        setField(term1911090, term1911090.getClass(), "aiArtifactOffer", null);
        setIntField(term1911090, term1911090.getClass(), "aiArtifacts", 0);
        setField(term1911090, term1911090.getClass(), "humanLines", null);
        setField(term1911090, term1911090.getClass(), "humanMapPlanetsOffer", null);
        setField(term1911090, term1911090.getClass(), "aiMapPlanetsOffer", null);
        setField(term1911090, term1911090.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1911090, term1911090.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1911090, term1911090.getClass(), "humanMapOffer", null);
        setField(term1911090, term1911090.getClass(), "aiMapOffer", null);
        setField(term1911090, term1911090.getClass(), "humanVoteYes", null);
        setField(term1911090, term1911090.getClass(), "humanVoteNo", null);
        setField(term1911090, term1911090.getClass(), "aiVoteYes", null);
        setField(term1911090, term1911090.getClass(), "aiVoteNo", null);
        setField(term1911090, term1911090.getClass(), "infoText", null);
        setField(term1911090, term1911090.getClass(), "likenessLabel", null);
        setField(term1911090, term1911090.getClass(), "endBtn", null);
        setField(term1911090, term1911090.getClass(), "meetingPlace", null);
        setBooleanField(term1911090, term1911090.getClass(), "tradeHappened", false);
        setField(term1911090, term1911090.getClass(), "aiImg", null);
        setIntField(term1911090, term1911090.getClass(), "textCounter", 0);
        setField(term1911090, term1911090.getClass(), "lastSpeechType", null);
        setField(term1911090, term1911090.getClass(), "embargoLine", null);
        setField(term1911090, term1911090.getClass(), "game", null);
        setBooleanField(term1911090, term1911090.getClass(), "isAlignmentXSet", false);
        setFloatField(term1911090, term1911090.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1911090, term1911090.getClass(), "isAlignmentYSet", false);
        setFloatField(term1911090, term1911090.getClass(), "alignmentY", 0.0F);
        setField(term1911090, term1911090.getClass(), "ui", null);
        setField(term1911090, term1911090.getClass(), "listenerList", null);
        setField(term1911090, term1911090.getClass(), "clientProperties", null);
        setField(term1911090, term1911090.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1911090, term1911090.getClass(), "autoscrolls", false);
        setField(term1911090, term1911090.getClass(), "border", null);
        setIntField(term1911090, term1911090.getClass(), "flags", 0);
        setField(term1911090, term1911090.getClass(), "inputVerifier", null);
        setBooleanField(term1911090, term1911090.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1911090, term1911090.getClass(), "paintingChild", null);
        setField(term1911090, term1911090.getClass(), "popupMenu", null);
        setField(term1911090, term1911090.getClass(), "revalidateRunnableScheduled", null);
        setField(term1911090, term1911090.getClass(), "focusInputMap", null);
        setField(term1911090, term1911090.getClass(), "ancestorInputMap", null);
        setField(term1911090, term1911090.getClass(), "windowInputMap", null);
        setField(term1911090, term1911090.getClass(), "actionMap", null);
        setField(term1911090, term1911090.getClass(), "aaHint", null);
        setField(term1911090, term1911090.getClass(), "lcdRenderingHint", null);
        setField(term1911090, term1911090.getClass(), "component", null);
        setField(term1911090, term1911090.getClass(), "layoutMgr", null);
        setField(term1911090, term1911090.getClass(), "dispatcher", null);
        setField(term1911090, term1911090.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1911090, term1911090.getClass(), "focusCycleRoot", false);
        setBooleanField(term1911090, term1911090.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1911090, term1911090.getClass(), "printingThreads", null);
        setBooleanField(term1911090, term1911090.getClass(), "printing", false);
        setField(term1911090, term1911090.getClass(), "containerListener", null);
        setIntField(term1911090, term1911090.getClass(), "listeningChildren", 0);
        setIntField(term1911090, term1911090.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1911090, term1911090.getClass(), "descendantsCount", 0);
        setField(term1911090, term1911090.getClass(), "preserveBackgroundColor", null);
        setIntField(term1911090, term1911090.getClass(), "numOfHWComponents", 0);
        setIntField(term1911090, term1911090.getClass(), "numOfLWComponents", 0);
        setField(term1911090, term1911090.getClass(), "modalComp", null);
        setField(term1911090, term1911090.getClass(), "modalAppContext", null);
        setIntField(term1911090, term1911090.getClass(), "containerSerializedDataVersion", 0);
        setField(term1911090, term1911090.getClass(), "peer", null);
        setField(term1911090, term1911090.getClass(), "parent", null);
        setField(term1911090, term1911090.getClass(), "appContext", null);
        setIntField(term1911090, term1911090.getClass(), "x", 0);
        setIntField(term1911090, term1911090.getClass(), "y", 0);
        setIntField(term1911090, term1911090.getClass(), "width", 0);
        setIntField(term1911090, term1911090.getClass(), "height", 0);
        setField(term1911090, term1911090.getClass(), "foreground", null);
        setField(term1911090, term1911090.getClass(), "background", null);
        setField(term1911090, term1911090.getClass(), "font", null);
        setField(term1911090, term1911090.getClass(), "peerFont", null);
        setField(term1911090, term1911090.getClass(), "cursor", null);
        setField(term1911090, term1911090.getClass(), "locale", null);
        setField(term1911090, term1911090.getClass(), "graphicsConfig", null);
        setField(term1911090, term1911090.getClass(), "bufferStrategy", null);
        setBooleanField(term1911090, term1911090.getClass(), "ignoreRepaint", false);
        setBooleanField(term1911090, term1911090.getClass(), "visible", false);
        setBooleanField(term1911090, term1911090.getClass(), "enabled", false);
        setBooleanField(term1911090, term1911090.getClass(), "valid", false);
        setField(term1911090, term1911090.getClass(), "dropTarget", null);
        setField(term1911090, term1911090.getClass(), "popups", null);
        setField(term1911090, term1911090.getClass(), "name", null);
        setBooleanField(term1911090, term1911090.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1911090, term1911090.getClass(), "focusable", false);
        setIntField(term1911090, term1911090.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1911090, term1911090.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1911090, term1911090.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1911090, term1911090.getClass(), "acc", null);
        setField(term1911090, term1911090.getClass(), "minSize", null);
        setBooleanField(term1911090, term1911090.getClass(), "minSizeSet", false);
        setField(term1911090, term1911090.getClass(), "prefSize", null);
        setBooleanField(term1911090, term1911090.getClass(), "prefSizeSet", false);
        setField(term1911090, term1911090.getClass(), "maxSize", null);
        setBooleanField(term1911090, term1911090.getClass(), "maxSizeSet", false);
        setField(term1911090, term1911090.getClass(), "componentOrientation", null);
        setBooleanField(term1911090, term1911090.getClass(), "newEventsOnly", false);
        setField(term1911090, term1911090.getClass(), "componentListener", null);
        setField(term1911090, term1911090.getClass(), "focusListener", null);
        setField(term1911090, term1911090.getClass(), "hierarchyListener", null);
        setField(term1911090, term1911090.getClass(), "hierarchyBoundsListener", null);
        setField(term1911090, term1911090.getClass(), "keyListener", null);
        setField(term1911090, term1911090.getClass(), "mouseListener", null);
        setField(term1911090, term1911090.getClass(), "mouseMotionListener", null);
        setField(term1911090, term1911090.getClass(), "mouseWheelListener", null);
        setField(term1911090, term1911090.getClass(), "inputMethodListener", null);
        setLongField(term1911090, term1911090.getClass(), "eventMask", 0L);
        setField(term1911090, term1911090.getClass(), "changeSupport", null);
        setField(term1911090, term1911090.getClass(), "objectLock", null);
        setBooleanField(term1911090, term1911090.getClass(), "isPacked", false);
        setIntField(term1911090, term1911090.getClass(), "boundsOp", 0);
        setField(term1911090, term1911090.getClass(), "compoundShape", null);
        setField(term1911090, term1911090.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1911090, term1911090.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1911090, term1911090.getClass(), "backgroundEraseDisabled", false);
        setField(term1911090, term1911090.getClass(), "eventCache", null);
        setBooleanField(term1911090, term1911090.getClass(), "coalescingEnabled", false);
        setBooleanField(term1911090, term1911090.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1911090, term1911090.getClass(), "componentSerializedDataVersion", 0);
        setField(term1911090, term1911090.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isExitAllowed", argTypes, term1911090, args);
    }

};


