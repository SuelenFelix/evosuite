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
import java.lang.Integer;

public class DiplomacyView_setOfferingList_198100453833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1743116;
     Object term1743163;

    public DiplomacyView_setOfferingList_198100453833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1743116 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1743116, term1743116.getClass(), "human", null);
        setField(term1743116, term1743116.getClass(), "borderCrossedFleet", null);
        setField(term1743116, term1743116.getClass(), "ai", null);
        setField(term1743116, term1743116.getClass(), "starMap", null);
        setField(term1743116, term1743116.getClass(), "trade", null);
        setField(term1743116, term1743116.getClass(), "humanTechListOffer", null);
        setField(term1743116, term1743116.getClass(), "aiTechListOffer", null);
        setField(term1743116, term1743116.getClass(), "humanFleetListOffer", null);
        setField(term1743116, term1743116.getClass(), "aiFleetListOffer", null);
        setField(term1743116, term1743116.getClass(), "humanPlanetListOffer", null);
        setField(term1743116, term1743116.getClass(), "aiPlanetListOffer", null);
        setField(term1743116, term1743116.getClass(), "humanCreditOffer", null);
        setIntField(term1743116, term1743116.getClass(), "humanCredits", 0);
        setField(term1743116, term1743116.getClass(), "humanArtifactOffer", null);
        setIntField(term1743116, term1743116.getClass(), "humanArtifacts", 0);
        setField(term1743116, term1743116.getClass(), "aiCreditOffer", null);
        setIntField(term1743116, term1743116.getClass(), "aiCredits", 0);
        setField(term1743116, term1743116.getClass(), "aiArtifactOffer", null);
        setIntField(term1743116, term1743116.getClass(), "aiArtifacts", 0);
        setField(term1743116, term1743116.getClass(), "humanLines", null);
        setField(term1743116, term1743116.getClass(), "humanMapPlanetsOffer", null);
        setField(term1743116, term1743116.getClass(), "aiMapPlanetsOffer", null);
        setField(term1743116, term1743116.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1743116, term1743116.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1743116, term1743116.getClass(), "humanMapOffer", null);
        setField(term1743116, term1743116.getClass(), "aiMapOffer", null);
        setField(term1743116, term1743116.getClass(), "humanVoteYes", null);
        setField(term1743116, term1743116.getClass(), "humanVoteNo", null);
        setField(term1743116, term1743116.getClass(), "aiVoteYes", null);
        setField(term1743116, term1743116.getClass(), "aiVoteNo", null);
        setField(term1743116, term1743116.getClass(), "infoText", null);
        setField(term1743116, term1743116.getClass(), "likenessLabel", null);
        setField(term1743116, term1743116.getClass(), "endBtn", null);
        setField(term1743116, term1743116.getClass(), "meetingPlace", null);
        setBooleanField(term1743116, term1743116.getClass(), "tradeHappened", false);
        setField(term1743116, term1743116.getClass(), "aiImg", null);
        setIntField(term1743116, term1743116.getClass(), "textCounter", 0);
        setField(term1743116, term1743116.getClass(), "lastSpeechType", null);
        setField(term1743116, term1743116.getClass(), "embargoLine", null);
        setField(term1743116, term1743116.getClass(), "game", null);
        setBooleanField(term1743116, term1743116.getClass(), "isAlignmentXSet", false);
        setFloatField(term1743116, term1743116.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1743116, term1743116.getClass(), "isAlignmentYSet", false);
        setFloatField(term1743116, term1743116.getClass(), "alignmentY", 0.0F);
        setField(term1743116, term1743116.getClass(), "ui", null);
        setField(term1743116, term1743116.getClass(), "listenerList", null);
        setField(term1743116, term1743116.getClass(), "clientProperties", null);
        setField(term1743116, term1743116.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1743116, term1743116.getClass(), "autoscrolls", false);
        setField(term1743116, term1743116.getClass(), "border", null);
        setIntField(term1743116, term1743116.getClass(), "flags", 0);
        setField(term1743116, term1743116.getClass(), "inputVerifier", null);
        setBooleanField(term1743116, term1743116.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1743116, term1743116.getClass(), "paintingChild", null);
        setField(term1743116, term1743116.getClass(), "popupMenu", null);
        setField(term1743116, term1743116.getClass(), "revalidateRunnableScheduled", null);
        setField(term1743116, term1743116.getClass(), "focusInputMap", null);
        setField(term1743116, term1743116.getClass(), "ancestorInputMap", null);
        setField(term1743116, term1743116.getClass(), "windowInputMap", null);
        setField(term1743116, term1743116.getClass(), "actionMap", null);
        setField(term1743116, term1743116.getClass(), "aaHint", null);
        setField(term1743116, term1743116.getClass(), "lcdRenderingHint", null);
        setField(term1743116, term1743116.getClass(), "component", null);
        setField(term1743116, term1743116.getClass(), "layoutMgr", null);
        setField(term1743116, term1743116.getClass(), "dispatcher", null);
        setField(term1743116, term1743116.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1743116, term1743116.getClass(), "focusCycleRoot", false);
        setBooleanField(term1743116, term1743116.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1743116, term1743116.getClass(), "printingThreads", null);
        setBooleanField(term1743116, term1743116.getClass(), "printing", false);
        setField(term1743116, term1743116.getClass(), "containerListener", null);
        setIntField(term1743116, term1743116.getClass(), "listeningChildren", 0);
        setIntField(term1743116, term1743116.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1743116, term1743116.getClass(), "descendantsCount", 0);
        setField(term1743116, term1743116.getClass(), "preserveBackgroundColor", null);
        setIntField(term1743116, term1743116.getClass(), "numOfHWComponents", 0);
        setIntField(term1743116, term1743116.getClass(), "numOfLWComponents", 0);
        setField(term1743116, term1743116.getClass(), "modalComp", null);
        setField(term1743116, term1743116.getClass(), "modalAppContext", null);
        setIntField(term1743116, term1743116.getClass(), "containerSerializedDataVersion", 0);
        setField(term1743116, term1743116.getClass(), "peer", null);
        setField(term1743116, term1743116.getClass(), "parent", null);
        setField(term1743116, term1743116.getClass(), "appContext", null);
        setIntField(term1743116, term1743116.getClass(), "x", 0);
        setIntField(term1743116, term1743116.getClass(), "y", 0);
        setIntField(term1743116, term1743116.getClass(), "width", 0);
        setIntField(term1743116, term1743116.getClass(), "height", 0);
        setField(term1743116, term1743116.getClass(), "foreground", null);
        setField(term1743116, term1743116.getClass(), "background", null);
        setField(term1743116, term1743116.getClass(), "font", null);
        setField(term1743116, term1743116.getClass(), "peerFont", null);
        setField(term1743116, term1743116.getClass(), "cursor", null);
        setField(term1743116, term1743116.getClass(), "locale", null);
        setField(term1743116, term1743116.getClass(), "graphicsConfig", null);
        setField(term1743116, term1743116.getClass(), "bufferStrategy", null);
        setBooleanField(term1743116, term1743116.getClass(), "ignoreRepaint", false);
        setBooleanField(term1743116, term1743116.getClass(), "visible", false);
        setBooleanField(term1743116, term1743116.getClass(), "enabled", false);
        setBooleanField(term1743116, term1743116.getClass(), "valid", false);
        setField(term1743116, term1743116.getClass(), "dropTarget", null);
        setField(term1743116, term1743116.getClass(), "popups", null);
        setField(term1743116, term1743116.getClass(), "name", null);
        setBooleanField(term1743116, term1743116.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1743116, term1743116.getClass(), "focusable", false);
        setIntField(term1743116, term1743116.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1743116, term1743116.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1743116, term1743116.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1743116, term1743116.getClass(), "acc", null);
        setField(term1743116, term1743116.getClass(), "minSize", null);
        setBooleanField(term1743116, term1743116.getClass(), "minSizeSet", false);
        setField(term1743116, term1743116.getClass(), "prefSize", null);
        setBooleanField(term1743116, term1743116.getClass(), "prefSizeSet", false);
        setField(term1743116, term1743116.getClass(), "maxSize", null);
        setBooleanField(term1743116, term1743116.getClass(), "maxSizeSet", false);
        setField(term1743116, term1743116.getClass(), "componentOrientation", null);
        setBooleanField(term1743116, term1743116.getClass(), "newEventsOnly", false);
        setField(term1743116, term1743116.getClass(), "componentListener", null);
        setField(term1743116, term1743116.getClass(), "focusListener", null);
        setField(term1743116, term1743116.getClass(), "hierarchyListener", null);
        setField(term1743116, term1743116.getClass(), "hierarchyBoundsListener", null);
        setField(term1743116, term1743116.getClass(), "keyListener", null);
        setField(term1743116, term1743116.getClass(), "mouseListener", null);
        setField(term1743116, term1743116.getClass(), "mouseMotionListener", null);
        setField(term1743116, term1743116.getClass(), "mouseWheelListener", null);
        setField(term1743116, term1743116.getClass(), "inputMethodListener", null);
        setLongField(term1743116, term1743116.getClass(), "eventMask", 0L);
        setField(term1743116, term1743116.getClass(), "changeSupport", null);
        setField(term1743116, term1743116.getClass(), "objectLock", null);
        setBooleanField(term1743116, term1743116.getClass(), "isPacked", false);
        setIntField(term1743116, term1743116.getClass(), "boundsOp", 0);
        setField(term1743116, term1743116.getClass(), "compoundShape", null);
        setField(term1743116, term1743116.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1743116, term1743116.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1743116, term1743116.getClass(), "backgroundEraseDisabled", false);
        setField(term1743116, term1743116.getClass(), "eventCache", null);
        setBooleanField(term1743116, term1743116.getClass(), "coalescingEnabled", false);
        setBooleanField(term1743116, term1743116.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1743116, term1743116.getClass(), "componentSerializedDataVersion", 0);
        setField(term1743116, term1743116.getClass(), "accessibleContext", null);
        term1743163 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1743163;
        callMethod(klass, "setOfferingList", argTypes, term1743116, args);
    }

};


