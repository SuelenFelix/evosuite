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

public class DiplomacyView_handleActionCommandOkAgree_34717477343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1787151;

    public DiplomacyView_handleActionCommandOkAgree_34717477343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1787151 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1787151, term1787151.getClass(), "human", null);
        setField(term1787151, term1787151.getClass(), "borderCrossedFleet", null);
        setField(term1787151, term1787151.getClass(), "ai", null);
        setField(term1787151, term1787151.getClass(), "starMap", null);
        setField(term1787151, term1787151.getClass(), "trade", null);
        setField(term1787151, term1787151.getClass(), "humanTechListOffer", null);
        setField(term1787151, term1787151.getClass(), "aiTechListOffer", null);
        setField(term1787151, term1787151.getClass(), "humanFleetListOffer", null);
        setField(term1787151, term1787151.getClass(), "aiFleetListOffer", null);
        setField(term1787151, term1787151.getClass(), "humanPlanetListOffer", null);
        setField(term1787151, term1787151.getClass(), "aiPlanetListOffer", null);
        setField(term1787151, term1787151.getClass(), "humanCreditOffer", null);
        setIntField(term1787151, term1787151.getClass(), "humanCredits", 0);
        setField(term1787151, term1787151.getClass(), "humanArtifactOffer", null);
        setIntField(term1787151, term1787151.getClass(), "humanArtifacts", 0);
        setField(term1787151, term1787151.getClass(), "aiCreditOffer", null);
        setIntField(term1787151, term1787151.getClass(), "aiCredits", 0);
        setField(term1787151, term1787151.getClass(), "aiArtifactOffer", null);
        setIntField(term1787151, term1787151.getClass(), "aiArtifacts", 0);
        setField(term1787151, term1787151.getClass(), "humanLines", null);
        setField(term1787151, term1787151.getClass(), "humanMapPlanetsOffer", null);
        setField(term1787151, term1787151.getClass(), "aiMapPlanetsOffer", null);
        setField(term1787151, term1787151.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1787151, term1787151.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1787151, term1787151.getClass(), "humanMapOffer", null);
        setField(term1787151, term1787151.getClass(), "aiMapOffer", null);
        setField(term1787151, term1787151.getClass(), "humanVoteYes", null);
        setField(term1787151, term1787151.getClass(), "humanVoteNo", null);
        setField(term1787151, term1787151.getClass(), "aiVoteYes", null);
        setField(term1787151, term1787151.getClass(), "aiVoteNo", null);
        setField(term1787151, term1787151.getClass(), "infoText", null);
        setField(term1787151, term1787151.getClass(), "likenessLabel", null);
        setField(term1787151, term1787151.getClass(), "endBtn", null);
        setField(term1787151, term1787151.getClass(), "meetingPlace", null);
        setBooleanField(term1787151, term1787151.getClass(), "tradeHappened", false);
        setField(term1787151, term1787151.getClass(), "aiImg", null);
        setIntField(term1787151, term1787151.getClass(), "textCounter", 0);
        setField(term1787151, term1787151.getClass(), "lastSpeechType", null);
        setField(term1787151, term1787151.getClass(), "embargoLine", null);
        setField(term1787151, term1787151.getClass(), "game", null);
        setBooleanField(term1787151, term1787151.getClass(), "isAlignmentXSet", false);
        setFloatField(term1787151, term1787151.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1787151, term1787151.getClass(), "isAlignmentYSet", false);
        setFloatField(term1787151, term1787151.getClass(), "alignmentY", 0.0F);
        setField(term1787151, term1787151.getClass(), "ui", null);
        setField(term1787151, term1787151.getClass(), "listenerList", null);
        setField(term1787151, term1787151.getClass(), "clientProperties", null);
        setField(term1787151, term1787151.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1787151, term1787151.getClass(), "autoscrolls", false);
        setField(term1787151, term1787151.getClass(), "border", null);
        setIntField(term1787151, term1787151.getClass(), "flags", 0);
        setField(term1787151, term1787151.getClass(), "inputVerifier", null);
        setBooleanField(term1787151, term1787151.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1787151, term1787151.getClass(), "paintingChild", null);
        setField(term1787151, term1787151.getClass(), "popupMenu", null);
        setField(term1787151, term1787151.getClass(), "revalidateRunnableScheduled", null);
        setField(term1787151, term1787151.getClass(), "focusInputMap", null);
        setField(term1787151, term1787151.getClass(), "ancestorInputMap", null);
        setField(term1787151, term1787151.getClass(), "windowInputMap", null);
        setField(term1787151, term1787151.getClass(), "actionMap", null);
        setField(term1787151, term1787151.getClass(), "aaHint", null);
        setField(term1787151, term1787151.getClass(), "lcdRenderingHint", null);
        setField(term1787151, term1787151.getClass(), "component", null);
        setField(term1787151, term1787151.getClass(), "layoutMgr", null);
        setField(term1787151, term1787151.getClass(), "dispatcher", null);
        setField(term1787151, term1787151.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1787151, term1787151.getClass(), "focusCycleRoot", false);
        setBooleanField(term1787151, term1787151.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1787151, term1787151.getClass(), "printingThreads", null);
        setBooleanField(term1787151, term1787151.getClass(), "printing", false);
        setField(term1787151, term1787151.getClass(), "containerListener", null);
        setIntField(term1787151, term1787151.getClass(), "listeningChildren", 0);
        setIntField(term1787151, term1787151.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1787151, term1787151.getClass(), "descendantsCount", 0);
        setField(term1787151, term1787151.getClass(), "preserveBackgroundColor", null);
        setIntField(term1787151, term1787151.getClass(), "numOfHWComponents", 0);
        setIntField(term1787151, term1787151.getClass(), "numOfLWComponents", 0);
        setField(term1787151, term1787151.getClass(), "modalComp", null);
        setField(term1787151, term1787151.getClass(), "modalAppContext", null);
        setIntField(term1787151, term1787151.getClass(), "containerSerializedDataVersion", 0);
        setField(term1787151, term1787151.getClass(), "peer", null);
        setField(term1787151, term1787151.getClass(), "parent", null);
        setField(term1787151, term1787151.getClass(), "appContext", null);
        setIntField(term1787151, term1787151.getClass(), "x", 0);
        setIntField(term1787151, term1787151.getClass(), "y", 0);
        setIntField(term1787151, term1787151.getClass(), "width", 0);
        setIntField(term1787151, term1787151.getClass(), "height", 0);
        setField(term1787151, term1787151.getClass(), "foreground", null);
        setField(term1787151, term1787151.getClass(), "background", null);
        setField(term1787151, term1787151.getClass(), "font", null);
        setField(term1787151, term1787151.getClass(), "peerFont", null);
        setField(term1787151, term1787151.getClass(), "cursor", null);
        setField(term1787151, term1787151.getClass(), "locale", null);
        setField(term1787151, term1787151.getClass(), "graphicsConfig", null);
        setField(term1787151, term1787151.getClass(), "bufferStrategy", null);
        setBooleanField(term1787151, term1787151.getClass(), "ignoreRepaint", false);
        setBooleanField(term1787151, term1787151.getClass(), "visible", false);
        setBooleanField(term1787151, term1787151.getClass(), "enabled", false);
        setBooleanField(term1787151, term1787151.getClass(), "valid", false);
        setField(term1787151, term1787151.getClass(), "dropTarget", null);
        setField(term1787151, term1787151.getClass(), "popups", null);
        setField(term1787151, term1787151.getClass(), "name", null);
        setBooleanField(term1787151, term1787151.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1787151, term1787151.getClass(), "focusable", false);
        setIntField(term1787151, term1787151.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1787151, term1787151.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1787151, term1787151.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1787151, term1787151.getClass(), "acc", null);
        setField(term1787151, term1787151.getClass(), "minSize", null);
        setBooleanField(term1787151, term1787151.getClass(), "minSizeSet", false);
        setField(term1787151, term1787151.getClass(), "prefSize", null);
        setBooleanField(term1787151, term1787151.getClass(), "prefSizeSet", false);
        setField(term1787151, term1787151.getClass(), "maxSize", null);
        setBooleanField(term1787151, term1787151.getClass(), "maxSizeSet", false);
        setField(term1787151, term1787151.getClass(), "componentOrientation", null);
        setBooleanField(term1787151, term1787151.getClass(), "newEventsOnly", false);
        setField(term1787151, term1787151.getClass(), "componentListener", null);
        setField(term1787151, term1787151.getClass(), "focusListener", null);
        setField(term1787151, term1787151.getClass(), "hierarchyListener", null);
        setField(term1787151, term1787151.getClass(), "hierarchyBoundsListener", null);
        setField(term1787151, term1787151.getClass(), "keyListener", null);
        setField(term1787151, term1787151.getClass(), "mouseListener", null);
        setField(term1787151, term1787151.getClass(), "mouseMotionListener", null);
        setField(term1787151, term1787151.getClass(), "mouseWheelListener", null);
        setField(term1787151, term1787151.getClass(), "inputMethodListener", null);
        setLongField(term1787151, term1787151.getClass(), "eventMask", 0L);
        setField(term1787151, term1787151.getClass(), "changeSupport", null);
        setField(term1787151, term1787151.getClass(), "objectLock", null);
        setBooleanField(term1787151, term1787151.getClass(), "isPacked", false);
        setIntField(term1787151, term1787151.getClass(), "boundsOp", 0);
        setField(term1787151, term1787151.getClass(), "compoundShape", null);
        setField(term1787151, term1787151.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1787151, term1787151.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1787151, term1787151.getClass(), "backgroundEraseDisabled", false);
        setField(term1787151, term1787151.getClass(), "eventCache", null);
        setBooleanField(term1787151, term1787151.getClass(), "coalescingEnabled", false);
        setBooleanField(term1787151, term1787151.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1787151, term1787151.getClass(), "componentSerializedDataVersion", 0);
        setField(term1787151, term1787151.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleActionCommandOkAgree", argTypes, term1787151, args);
    }

};


