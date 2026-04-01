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

public class DiplomacyView_getHumanNegotiationList_30065358353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1843690;

    public DiplomacyView_getHumanNegotiationList_30065358353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1843690 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1843690, term1843690.getClass(), "human", null);
        setField(term1843690, term1843690.getClass(), "borderCrossedFleet", null);
        setField(term1843690, term1843690.getClass(), "ai", null);
        setField(term1843690, term1843690.getClass(), "starMap", null);
        setField(term1843690, term1843690.getClass(), "trade", null);
        setField(term1843690, term1843690.getClass(), "humanTechListOffer", null);
        setField(term1843690, term1843690.getClass(), "aiTechListOffer", null);
        setField(term1843690, term1843690.getClass(), "humanFleetListOffer", null);
        setField(term1843690, term1843690.getClass(), "aiFleetListOffer", null);
        setField(term1843690, term1843690.getClass(), "humanPlanetListOffer", null);
        setField(term1843690, term1843690.getClass(), "aiPlanetListOffer", null);
        setField(term1843690, term1843690.getClass(), "humanCreditOffer", null);
        setIntField(term1843690, term1843690.getClass(), "humanCredits", 0);
        setField(term1843690, term1843690.getClass(), "humanArtifactOffer", null);
        setIntField(term1843690, term1843690.getClass(), "humanArtifacts", 0);
        setField(term1843690, term1843690.getClass(), "aiCreditOffer", null);
        setIntField(term1843690, term1843690.getClass(), "aiCredits", 0);
        setField(term1843690, term1843690.getClass(), "aiArtifactOffer", null);
        setIntField(term1843690, term1843690.getClass(), "aiArtifacts", 0);
        setField(term1843690, term1843690.getClass(), "humanLines", null);
        setField(term1843690, term1843690.getClass(), "humanMapPlanetsOffer", null);
        setField(term1843690, term1843690.getClass(), "aiMapPlanetsOffer", null);
        setField(term1843690, term1843690.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1843690, term1843690.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1843690, term1843690.getClass(), "humanMapOffer", null);
        setField(term1843690, term1843690.getClass(), "aiMapOffer", null);
        setField(term1843690, term1843690.getClass(), "humanVoteYes", null);
        setField(term1843690, term1843690.getClass(), "humanVoteNo", null);
        setField(term1843690, term1843690.getClass(), "aiVoteYes", null);
        setField(term1843690, term1843690.getClass(), "aiVoteNo", null);
        setField(term1843690, term1843690.getClass(), "infoText", null);
        setField(term1843690, term1843690.getClass(), "likenessLabel", null);
        setField(term1843690, term1843690.getClass(), "endBtn", null);
        setField(term1843690, term1843690.getClass(), "meetingPlace", null);
        setBooleanField(term1843690, term1843690.getClass(), "tradeHappened", false);
        setField(term1843690, term1843690.getClass(), "aiImg", null);
        setIntField(term1843690, term1843690.getClass(), "textCounter", 0);
        setField(term1843690, term1843690.getClass(), "lastSpeechType", null);
        setField(term1843690, term1843690.getClass(), "embargoLine", null);
        setField(term1843690, term1843690.getClass(), "game", null);
        setBooleanField(term1843690, term1843690.getClass(), "isAlignmentXSet", false);
        setFloatField(term1843690, term1843690.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1843690, term1843690.getClass(), "isAlignmentYSet", false);
        setFloatField(term1843690, term1843690.getClass(), "alignmentY", 0.0F);
        setField(term1843690, term1843690.getClass(), "ui", null);
        setField(term1843690, term1843690.getClass(), "listenerList", null);
        setField(term1843690, term1843690.getClass(), "clientProperties", null);
        setField(term1843690, term1843690.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1843690, term1843690.getClass(), "autoscrolls", false);
        setField(term1843690, term1843690.getClass(), "border", null);
        setIntField(term1843690, term1843690.getClass(), "flags", 0);
        setField(term1843690, term1843690.getClass(), "inputVerifier", null);
        setBooleanField(term1843690, term1843690.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1843690, term1843690.getClass(), "paintingChild", null);
        setField(term1843690, term1843690.getClass(), "popupMenu", null);
        setField(term1843690, term1843690.getClass(), "revalidateRunnableScheduled", null);
        setField(term1843690, term1843690.getClass(), "focusInputMap", null);
        setField(term1843690, term1843690.getClass(), "ancestorInputMap", null);
        setField(term1843690, term1843690.getClass(), "windowInputMap", null);
        setField(term1843690, term1843690.getClass(), "actionMap", null);
        setField(term1843690, term1843690.getClass(), "aaHint", null);
        setField(term1843690, term1843690.getClass(), "lcdRenderingHint", null);
        setField(term1843690, term1843690.getClass(), "component", null);
        setField(term1843690, term1843690.getClass(), "layoutMgr", null);
        setField(term1843690, term1843690.getClass(), "dispatcher", null);
        setField(term1843690, term1843690.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1843690, term1843690.getClass(), "focusCycleRoot", false);
        setBooleanField(term1843690, term1843690.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1843690, term1843690.getClass(), "printingThreads", null);
        setBooleanField(term1843690, term1843690.getClass(), "printing", false);
        setField(term1843690, term1843690.getClass(), "containerListener", null);
        setIntField(term1843690, term1843690.getClass(), "listeningChildren", 0);
        setIntField(term1843690, term1843690.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1843690, term1843690.getClass(), "descendantsCount", 0);
        setField(term1843690, term1843690.getClass(), "preserveBackgroundColor", null);
        setIntField(term1843690, term1843690.getClass(), "numOfHWComponents", 0);
        setIntField(term1843690, term1843690.getClass(), "numOfLWComponents", 0);
        setField(term1843690, term1843690.getClass(), "modalComp", null);
        setField(term1843690, term1843690.getClass(), "modalAppContext", null);
        setIntField(term1843690, term1843690.getClass(), "containerSerializedDataVersion", 0);
        setField(term1843690, term1843690.getClass(), "peer", null);
        setField(term1843690, term1843690.getClass(), "parent", null);
        setField(term1843690, term1843690.getClass(), "appContext", null);
        setIntField(term1843690, term1843690.getClass(), "x", 0);
        setIntField(term1843690, term1843690.getClass(), "y", 0);
        setIntField(term1843690, term1843690.getClass(), "width", 0);
        setIntField(term1843690, term1843690.getClass(), "height", 0);
        setField(term1843690, term1843690.getClass(), "foreground", null);
        setField(term1843690, term1843690.getClass(), "background", null);
        setField(term1843690, term1843690.getClass(), "font", null);
        setField(term1843690, term1843690.getClass(), "peerFont", null);
        setField(term1843690, term1843690.getClass(), "cursor", null);
        setField(term1843690, term1843690.getClass(), "locale", null);
        setField(term1843690, term1843690.getClass(), "graphicsConfig", null);
        setField(term1843690, term1843690.getClass(), "bufferStrategy", null);
        setBooleanField(term1843690, term1843690.getClass(), "ignoreRepaint", false);
        setBooleanField(term1843690, term1843690.getClass(), "visible", false);
        setBooleanField(term1843690, term1843690.getClass(), "enabled", false);
        setBooleanField(term1843690, term1843690.getClass(), "valid", false);
        setField(term1843690, term1843690.getClass(), "dropTarget", null);
        setField(term1843690, term1843690.getClass(), "popups", null);
        setField(term1843690, term1843690.getClass(), "name", null);
        setBooleanField(term1843690, term1843690.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1843690, term1843690.getClass(), "focusable", false);
        setIntField(term1843690, term1843690.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1843690, term1843690.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1843690, term1843690.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1843690, term1843690.getClass(), "acc", null);
        setField(term1843690, term1843690.getClass(), "minSize", null);
        setBooleanField(term1843690, term1843690.getClass(), "minSizeSet", false);
        setField(term1843690, term1843690.getClass(), "prefSize", null);
        setBooleanField(term1843690, term1843690.getClass(), "prefSizeSet", false);
        setField(term1843690, term1843690.getClass(), "maxSize", null);
        setBooleanField(term1843690, term1843690.getClass(), "maxSizeSet", false);
        setField(term1843690, term1843690.getClass(), "componentOrientation", null);
        setBooleanField(term1843690, term1843690.getClass(), "newEventsOnly", false);
        setField(term1843690, term1843690.getClass(), "componentListener", null);
        setField(term1843690, term1843690.getClass(), "focusListener", null);
        setField(term1843690, term1843690.getClass(), "hierarchyListener", null);
        setField(term1843690, term1843690.getClass(), "hierarchyBoundsListener", null);
        setField(term1843690, term1843690.getClass(), "keyListener", null);
        setField(term1843690, term1843690.getClass(), "mouseListener", null);
        setField(term1843690, term1843690.getClass(), "mouseMotionListener", null);
        setField(term1843690, term1843690.getClass(), "mouseWheelListener", null);
        setField(term1843690, term1843690.getClass(), "inputMethodListener", null);
        setLongField(term1843690, term1843690.getClass(), "eventMask", 0L);
        setField(term1843690, term1843690.getClass(), "changeSupport", null);
        setField(term1843690, term1843690.getClass(), "objectLock", null);
        setBooleanField(term1843690, term1843690.getClass(), "isPacked", false);
        setIntField(term1843690, term1843690.getClass(), "boundsOp", 0);
        setField(term1843690, term1843690.getClass(), "compoundShape", null);
        setField(term1843690, term1843690.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1843690, term1843690.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1843690, term1843690.getClass(), "backgroundEraseDisabled", false);
        setField(term1843690, term1843690.getClass(), "eventCache", null);
        setBooleanField(term1843690, term1843690.getClass(), "coalescingEnabled", false);
        setBooleanField(term1843690, term1843690.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1843690, term1843690.getClass(), "componentSerializedDataVersion", 0);
        setField(term1843690, term1843690.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHumanNegotiationList", argTypes, term1843690, args);
    }

};


