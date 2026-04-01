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

public class DiplomacyView_handleAction_213425190555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1851873;

    public DiplomacyView_handleAction_213425190555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1851873 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1851873, term1851873.getClass(), "human", null);
        setField(term1851873, term1851873.getClass(), "borderCrossedFleet", null);
        setField(term1851873, term1851873.getClass(), "ai", null);
        setField(term1851873, term1851873.getClass(), "starMap", null);
        setField(term1851873, term1851873.getClass(), "trade", null);
        setField(term1851873, term1851873.getClass(), "humanTechListOffer", null);
        setField(term1851873, term1851873.getClass(), "aiTechListOffer", null);
        setField(term1851873, term1851873.getClass(), "humanFleetListOffer", null);
        setField(term1851873, term1851873.getClass(), "aiFleetListOffer", null);
        setField(term1851873, term1851873.getClass(), "humanPlanetListOffer", null);
        setField(term1851873, term1851873.getClass(), "aiPlanetListOffer", null);
        setField(term1851873, term1851873.getClass(), "humanCreditOffer", null);
        setIntField(term1851873, term1851873.getClass(), "humanCredits", 0);
        setField(term1851873, term1851873.getClass(), "humanArtifactOffer", null);
        setIntField(term1851873, term1851873.getClass(), "humanArtifacts", 0);
        setField(term1851873, term1851873.getClass(), "aiCreditOffer", null);
        setIntField(term1851873, term1851873.getClass(), "aiCredits", 0);
        setField(term1851873, term1851873.getClass(), "aiArtifactOffer", null);
        setIntField(term1851873, term1851873.getClass(), "aiArtifacts", 0);
        setField(term1851873, term1851873.getClass(), "humanLines", null);
        setField(term1851873, term1851873.getClass(), "humanMapPlanetsOffer", null);
        setField(term1851873, term1851873.getClass(), "aiMapPlanetsOffer", null);
        setField(term1851873, term1851873.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1851873, term1851873.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1851873, term1851873.getClass(), "humanMapOffer", null);
        setField(term1851873, term1851873.getClass(), "aiMapOffer", null);
        setField(term1851873, term1851873.getClass(), "humanVoteYes", null);
        setField(term1851873, term1851873.getClass(), "humanVoteNo", null);
        setField(term1851873, term1851873.getClass(), "aiVoteYes", null);
        setField(term1851873, term1851873.getClass(), "aiVoteNo", null);
        setField(term1851873, term1851873.getClass(), "infoText", null);
        setField(term1851873, term1851873.getClass(), "likenessLabel", null);
        setField(term1851873, term1851873.getClass(), "endBtn", null);
        setField(term1851873, term1851873.getClass(), "meetingPlace", null);
        setBooleanField(term1851873, term1851873.getClass(), "tradeHappened", false);
        setField(term1851873, term1851873.getClass(), "aiImg", null);
        setIntField(term1851873, term1851873.getClass(), "textCounter", 0);
        setField(term1851873, term1851873.getClass(), "lastSpeechType", null);
        setField(term1851873, term1851873.getClass(), "embargoLine", null);
        setField(term1851873, term1851873.getClass(), "game", null);
        setBooleanField(term1851873, term1851873.getClass(), "isAlignmentXSet", false);
        setFloatField(term1851873, term1851873.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1851873, term1851873.getClass(), "isAlignmentYSet", false);
        setFloatField(term1851873, term1851873.getClass(), "alignmentY", 0.0F);
        setField(term1851873, term1851873.getClass(), "ui", null);
        setField(term1851873, term1851873.getClass(), "listenerList", null);
        setField(term1851873, term1851873.getClass(), "clientProperties", null);
        setField(term1851873, term1851873.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1851873, term1851873.getClass(), "autoscrolls", false);
        setField(term1851873, term1851873.getClass(), "border", null);
        setIntField(term1851873, term1851873.getClass(), "flags", 0);
        setField(term1851873, term1851873.getClass(), "inputVerifier", null);
        setBooleanField(term1851873, term1851873.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1851873, term1851873.getClass(), "paintingChild", null);
        setField(term1851873, term1851873.getClass(), "popupMenu", null);
        setField(term1851873, term1851873.getClass(), "revalidateRunnableScheduled", null);
        setField(term1851873, term1851873.getClass(), "focusInputMap", null);
        setField(term1851873, term1851873.getClass(), "ancestorInputMap", null);
        setField(term1851873, term1851873.getClass(), "windowInputMap", null);
        setField(term1851873, term1851873.getClass(), "actionMap", null);
        setField(term1851873, term1851873.getClass(), "aaHint", null);
        setField(term1851873, term1851873.getClass(), "lcdRenderingHint", null);
        setField(term1851873, term1851873.getClass(), "component", null);
        setField(term1851873, term1851873.getClass(), "layoutMgr", null);
        setField(term1851873, term1851873.getClass(), "dispatcher", null);
        setField(term1851873, term1851873.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1851873, term1851873.getClass(), "focusCycleRoot", false);
        setBooleanField(term1851873, term1851873.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1851873, term1851873.getClass(), "printingThreads", null);
        setBooleanField(term1851873, term1851873.getClass(), "printing", false);
        setField(term1851873, term1851873.getClass(), "containerListener", null);
        setIntField(term1851873, term1851873.getClass(), "listeningChildren", 0);
        setIntField(term1851873, term1851873.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1851873, term1851873.getClass(), "descendantsCount", 0);
        setField(term1851873, term1851873.getClass(), "preserveBackgroundColor", null);
        setIntField(term1851873, term1851873.getClass(), "numOfHWComponents", 0);
        setIntField(term1851873, term1851873.getClass(), "numOfLWComponents", 0);
        setField(term1851873, term1851873.getClass(), "modalComp", null);
        setField(term1851873, term1851873.getClass(), "modalAppContext", null);
        setIntField(term1851873, term1851873.getClass(), "containerSerializedDataVersion", 0);
        setField(term1851873, term1851873.getClass(), "peer", null);
        setField(term1851873, term1851873.getClass(), "parent", null);
        setField(term1851873, term1851873.getClass(), "appContext", null);
        setIntField(term1851873, term1851873.getClass(), "x", 0);
        setIntField(term1851873, term1851873.getClass(), "y", 0);
        setIntField(term1851873, term1851873.getClass(), "width", 0);
        setIntField(term1851873, term1851873.getClass(), "height", 0);
        setField(term1851873, term1851873.getClass(), "foreground", null);
        setField(term1851873, term1851873.getClass(), "background", null);
        setField(term1851873, term1851873.getClass(), "font", null);
        setField(term1851873, term1851873.getClass(), "peerFont", null);
        setField(term1851873, term1851873.getClass(), "cursor", null);
        setField(term1851873, term1851873.getClass(), "locale", null);
        setField(term1851873, term1851873.getClass(), "graphicsConfig", null);
        setField(term1851873, term1851873.getClass(), "bufferStrategy", null);
        setBooleanField(term1851873, term1851873.getClass(), "ignoreRepaint", false);
        setBooleanField(term1851873, term1851873.getClass(), "visible", false);
        setBooleanField(term1851873, term1851873.getClass(), "enabled", false);
        setBooleanField(term1851873, term1851873.getClass(), "valid", false);
        setField(term1851873, term1851873.getClass(), "dropTarget", null);
        setField(term1851873, term1851873.getClass(), "popups", null);
        setField(term1851873, term1851873.getClass(), "name", null);
        setBooleanField(term1851873, term1851873.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1851873, term1851873.getClass(), "focusable", false);
        setIntField(term1851873, term1851873.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1851873, term1851873.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1851873, term1851873.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1851873, term1851873.getClass(), "acc", null);
        setField(term1851873, term1851873.getClass(), "minSize", null);
        setBooleanField(term1851873, term1851873.getClass(), "minSizeSet", false);
        setField(term1851873, term1851873.getClass(), "prefSize", null);
        setBooleanField(term1851873, term1851873.getClass(), "prefSizeSet", false);
        setField(term1851873, term1851873.getClass(), "maxSize", null);
        setBooleanField(term1851873, term1851873.getClass(), "maxSizeSet", false);
        setField(term1851873, term1851873.getClass(), "componentOrientation", null);
        setBooleanField(term1851873, term1851873.getClass(), "newEventsOnly", false);
        setField(term1851873, term1851873.getClass(), "componentListener", null);
        setField(term1851873, term1851873.getClass(), "focusListener", null);
        setField(term1851873, term1851873.getClass(), "hierarchyListener", null);
        setField(term1851873, term1851873.getClass(), "hierarchyBoundsListener", null);
        setField(term1851873, term1851873.getClass(), "keyListener", null);
        setField(term1851873, term1851873.getClass(), "mouseListener", null);
        setField(term1851873, term1851873.getClass(), "mouseMotionListener", null);
        setField(term1851873, term1851873.getClass(), "mouseWheelListener", null);
        setField(term1851873, term1851873.getClass(), "inputMethodListener", null);
        setLongField(term1851873, term1851873.getClass(), "eventMask", 0L);
        setField(term1851873, term1851873.getClass(), "changeSupport", null);
        setField(term1851873, term1851873.getClass(), "objectLock", null);
        setBooleanField(term1851873, term1851873.getClass(), "isPacked", false);
        setIntField(term1851873, term1851873.getClass(), "boundsOp", 0);
        setField(term1851873, term1851873.getClass(), "compoundShape", null);
        setField(term1851873, term1851873.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1851873, term1851873.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1851873, term1851873.getClass(), "backgroundEraseDisabled", false);
        setField(term1851873, term1851873.getClass(), "eventCache", null);
        setBooleanField(term1851873, term1851873.getClass(), "coalescingEnabled", false);
        setBooleanField(term1851873, term1851873.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1851873, term1851873.getClass(), "componentSerializedDataVersion", 0);
        setField(term1851873, term1851873.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term1851873, args);
    }

};


