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

public class DiplomacyView_createAiVoteOffer_166624595739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1770805;

    public DiplomacyView_createAiVoteOffer_166624595739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1770805 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1770805, term1770805.getClass(), "human", null);
        setField(term1770805, term1770805.getClass(), "borderCrossedFleet", null);
        setField(term1770805, term1770805.getClass(), "ai", null);
        setField(term1770805, term1770805.getClass(), "starMap", null);
        setField(term1770805, term1770805.getClass(), "trade", null);
        setField(term1770805, term1770805.getClass(), "humanTechListOffer", null);
        setField(term1770805, term1770805.getClass(), "aiTechListOffer", null);
        setField(term1770805, term1770805.getClass(), "humanFleetListOffer", null);
        setField(term1770805, term1770805.getClass(), "aiFleetListOffer", null);
        setField(term1770805, term1770805.getClass(), "humanPlanetListOffer", null);
        setField(term1770805, term1770805.getClass(), "aiPlanetListOffer", null);
        setField(term1770805, term1770805.getClass(), "humanCreditOffer", null);
        setIntField(term1770805, term1770805.getClass(), "humanCredits", 0);
        setField(term1770805, term1770805.getClass(), "humanArtifactOffer", null);
        setIntField(term1770805, term1770805.getClass(), "humanArtifacts", 0);
        setField(term1770805, term1770805.getClass(), "aiCreditOffer", null);
        setIntField(term1770805, term1770805.getClass(), "aiCredits", 0);
        setField(term1770805, term1770805.getClass(), "aiArtifactOffer", null);
        setIntField(term1770805, term1770805.getClass(), "aiArtifacts", 0);
        setField(term1770805, term1770805.getClass(), "humanLines", null);
        setField(term1770805, term1770805.getClass(), "humanMapPlanetsOffer", null);
        setField(term1770805, term1770805.getClass(), "aiMapPlanetsOffer", null);
        setField(term1770805, term1770805.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1770805, term1770805.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1770805, term1770805.getClass(), "humanMapOffer", null);
        setField(term1770805, term1770805.getClass(), "aiMapOffer", null);
        setField(term1770805, term1770805.getClass(), "humanVoteYes", null);
        setField(term1770805, term1770805.getClass(), "humanVoteNo", null);
        setField(term1770805, term1770805.getClass(), "aiVoteYes", null);
        setField(term1770805, term1770805.getClass(), "aiVoteNo", null);
        setField(term1770805, term1770805.getClass(), "infoText", null);
        setField(term1770805, term1770805.getClass(), "likenessLabel", null);
        setField(term1770805, term1770805.getClass(), "endBtn", null);
        setField(term1770805, term1770805.getClass(), "meetingPlace", null);
        setBooleanField(term1770805, term1770805.getClass(), "tradeHappened", false);
        setField(term1770805, term1770805.getClass(), "aiImg", null);
        setIntField(term1770805, term1770805.getClass(), "textCounter", 0);
        setField(term1770805, term1770805.getClass(), "lastSpeechType", null);
        setField(term1770805, term1770805.getClass(), "embargoLine", null);
        setField(term1770805, term1770805.getClass(), "game", null);
        setBooleanField(term1770805, term1770805.getClass(), "isAlignmentXSet", false);
        setFloatField(term1770805, term1770805.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1770805, term1770805.getClass(), "isAlignmentYSet", false);
        setFloatField(term1770805, term1770805.getClass(), "alignmentY", 0.0F);
        setField(term1770805, term1770805.getClass(), "ui", null);
        setField(term1770805, term1770805.getClass(), "listenerList", null);
        setField(term1770805, term1770805.getClass(), "clientProperties", null);
        setField(term1770805, term1770805.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1770805, term1770805.getClass(), "autoscrolls", false);
        setField(term1770805, term1770805.getClass(), "border", null);
        setIntField(term1770805, term1770805.getClass(), "flags", 0);
        setField(term1770805, term1770805.getClass(), "inputVerifier", null);
        setBooleanField(term1770805, term1770805.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1770805, term1770805.getClass(), "paintingChild", null);
        setField(term1770805, term1770805.getClass(), "popupMenu", null);
        setField(term1770805, term1770805.getClass(), "revalidateRunnableScheduled", null);
        setField(term1770805, term1770805.getClass(), "focusInputMap", null);
        setField(term1770805, term1770805.getClass(), "ancestorInputMap", null);
        setField(term1770805, term1770805.getClass(), "windowInputMap", null);
        setField(term1770805, term1770805.getClass(), "actionMap", null);
        setField(term1770805, term1770805.getClass(), "aaHint", null);
        setField(term1770805, term1770805.getClass(), "lcdRenderingHint", null);
        setField(term1770805, term1770805.getClass(), "component", null);
        setField(term1770805, term1770805.getClass(), "layoutMgr", null);
        setField(term1770805, term1770805.getClass(), "dispatcher", null);
        setField(term1770805, term1770805.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1770805, term1770805.getClass(), "focusCycleRoot", false);
        setBooleanField(term1770805, term1770805.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1770805, term1770805.getClass(), "printingThreads", null);
        setBooleanField(term1770805, term1770805.getClass(), "printing", false);
        setField(term1770805, term1770805.getClass(), "containerListener", null);
        setIntField(term1770805, term1770805.getClass(), "listeningChildren", 0);
        setIntField(term1770805, term1770805.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1770805, term1770805.getClass(), "descendantsCount", 0);
        setField(term1770805, term1770805.getClass(), "preserveBackgroundColor", null);
        setIntField(term1770805, term1770805.getClass(), "numOfHWComponents", 0);
        setIntField(term1770805, term1770805.getClass(), "numOfLWComponents", 0);
        setField(term1770805, term1770805.getClass(), "modalComp", null);
        setField(term1770805, term1770805.getClass(), "modalAppContext", null);
        setIntField(term1770805, term1770805.getClass(), "containerSerializedDataVersion", 0);
        setField(term1770805, term1770805.getClass(), "peer", null);
        setField(term1770805, term1770805.getClass(), "parent", null);
        setField(term1770805, term1770805.getClass(), "appContext", null);
        setIntField(term1770805, term1770805.getClass(), "x", 0);
        setIntField(term1770805, term1770805.getClass(), "y", 0);
        setIntField(term1770805, term1770805.getClass(), "width", 0);
        setIntField(term1770805, term1770805.getClass(), "height", 0);
        setField(term1770805, term1770805.getClass(), "foreground", null);
        setField(term1770805, term1770805.getClass(), "background", null);
        setField(term1770805, term1770805.getClass(), "font", null);
        setField(term1770805, term1770805.getClass(), "peerFont", null);
        setField(term1770805, term1770805.getClass(), "cursor", null);
        setField(term1770805, term1770805.getClass(), "locale", null);
        setField(term1770805, term1770805.getClass(), "graphicsConfig", null);
        setField(term1770805, term1770805.getClass(), "bufferStrategy", null);
        setBooleanField(term1770805, term1770805.getClass(), "ignoreRepaint", false);
        setBooleanField(term1770805, term1770805.getClass(), "visible", false);
        setBooleanField(term1770805, term1770805.getClass(), "enabled", false);
        setBooleanField(term1770805, term1770805.getClass(), "valid", false);
        setField(term1770805, term1770805.getClass(), "dropTarget", null);
        setField(term1770805, term1770805.getClass(), "popups", null);
        setField(term1770805, term1770805.getClass(), "name", null);
        setBooleanField(term1770805, term1770805.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1770805, term1770805.getClass(), "focusable", false);
        setIntField(term1770805, term1770805.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1770805, term1770805.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1770805, term1770805.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1770805, term1770805.getClass(), "acc", null);
        setField(term1770805, term1770805.getClass(), "minSize", null);
        setBooleanField(term1770805, term1770805.getClass(), "minSizeSet", false);
        setField(term1770805, term1770805.getClass(), "prefSize", null);
        setBooleanField(term1770805, term1770805.getClass(), "prefSizeSet", false);
        setField(term1770805, term1770805.getClass(), "maxSize", null);
        setBooleanField(term1770805, term1770805.getClass(), "maxSizeSet", false);
        setField(term1770805, term1770805.getClass(), "componentOrientation", null);
        setBooleanField(term1770805, term1770805.getClass(), "newEventsOnly", false);
        setField(term1770805, term1770805.getClass(), "componentListener", null);
        setField(term1770805, term1770805.getClass(), "focusListener", null);
        setField(term1770805, term1770805.getClass(), "hierarchyListener", null);
        setField(term1770805, term1770805.getClass(), "hierarchyBoundsListener", null);
        setField(term1770805, term1770805.getClass(), "keyListener", null);
        setField(term1770805, term1770805.getClass(), "mouseListener", null);
        setField(term1770805, term1770805.getClass(), "mouseMotionListener", null);
        setField(term1770805, term1770805.getClass(), "mouseWheelListener", null);
        setField(term1770805, term1770805.getClass(), "inputMethodListener", null);
        setLongField(term1770805, term1770805.getClass(), "eventMask", 0L);
        setField(term1770805, term1770805.getClass(), "changeSupport", null);
        setField(term1770805, term1770805.getClass(), "objectLock", null);
        setBooleanField(term1770805, term1770805.getClass(), "isPacked", false);
        setIntField(term1770805, term1770805.getClass(), "boundsOp", 0);
        setField(term1770805, term1770805.getClass(), "compoundShape", null);
        setField(term1770805, term1770805.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1770805, term1770805.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1770805, term1770805.getClass(), "backgroundEraseDisabled", false);
        setField(term1770805, term1770805.getClass(), "eventCache", null);
        setBooleanField(term1770805, term1770805.getClass(), "coalescingEnabled", false);
        setBooleanField(term1770805, term1770805.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1770805, term1770805.getClass(), "componentSerializedDataVersion", 0);
        setField(term1770805, term1770805.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createAiVoteOffer", argTypes, term1770805, args);
    }

};


