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

public class DiplomacyView_addPossibleTutorial_113059734841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1778911;
     Object term1778958;

    public DiplomacyView_addPossibleTutorial_113059734841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1778911 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1778911, term1778911.getClass(), "human", null);
        setField(term1778911, term1778911.getClass(), "borderCrossedFleet", null);
        setField(term1778911, term1778911.getClass(), "ai", null);
        setField(term1778911, term1778911.getClass(), "starMap", null);
        setField(term1778911, term1778911.getClass(), "trade", null);
        setField(term1778911, term1778911.getClass(), "humanTechListOffer", null);
        setField(term1778911, term1778911.getClass(), "aiTechListOffer", null);
        setField(term1778911, term1778911.getClass(), "humanFleetListOffer", null);
        setField(term1778911, term1778911.getClass(), "aiFleetListOffer", null);
        setField(term1778911, term1778911.getClass(), "humanPlanetListOffer", null);
        setField(term1778911, term1778911.getClass(), "aiPlanetListOffer", null);
        setField(term1778911, term1778911.getClass(), "humanCreditOffer", null);
        setIntField(term1778911, term1778911.getClass(), "humanCredits", 0);
        setField(term1778911, term1778911.getClass(), "humanArtifactOffer", null);
        setIntField(term1778911, term1778911.getClass(), "humanArtifacts", 0);
        setField(term1778911, term1778911.getClass(), "aiCreditOffer", null);
        setIntField(term1778911, term1778911.getClass(), "aiCredits", 0);
        setField(term1778911, term1778911.getClass(), "aiArtifactOffer", null);
        setIntField(term1778911, term1778911.getClass(), "aiArtifacts", 0);
        setField(term1778911, term1778911.getClass(), "humanLines", null);
        setField(term1778911, term1778911.getClass(), "humanMapPlanetsOffer", null);
        setField(term1778911, term1778911.getClass(), "aiMapPlanetsOffer", null);
        setField(term1778911, term1778911.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1778911, term1778911.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1778911, term1778911.getClass(), "humanMapOffer", null);
        setField(term1778911, term1778911.getClass(), "aiMapOffer", null);
        setField(term1778911, term1778911.getClass(), "humanVoteYes", null);
        setField(term1778911, term1778911.getClass(), "humanVoteNo", null);
        setField(term1778911, term1778911.getClass(), "aiVoteYes", null);
        setField(term1778911, term1778911.getClass(), "aiVoteNo", null);
        setField(term1778911, term1778911.getClass(), "infoText", null);
        setField(term1778911, term1778911.getClass(), "likenessLabel", null);
        setField(term1778911, term1778911.getClass(), "endBtn", null);
        setField(term1778911, term1778911.getClass(), "meetingPlace", null);
        setBooleanField(term1778911, term1778911.getClass(), "tradeHappened", false);
        setField(term1778911, term1778911.getClass(), "aiImg", null);
        setIntField(term1778911, term1778911.getClass(), "textCounter", 0);
        setField(term1778911, term1778911.getClass(), "lastSpeechType", null);
        setField(term1778911, term1778911.getClass(), "embargoLine", null);
        setField(term1778911, term1778911.getClass(), "game", null);
        setBooleanField(term1778911, term1778911.getClass(), "isAlignmentXSet", false);
        setFloatField(term1778911, term1778911.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1778911, term1778911.getClass(), "isAlignmentYSet", false);
        setFloatField(term1778911, term1778911.getClass(), "alignmentY", 0.0F);
        setField(term1778911, term1778911.getClass(), "ui", null);
        setField(term1778911, term1778911.getClass(), "listenerList", null);
        setField(term1778911, term1778911.getClass(), "clientProperties", null);
        setField(term1778911, term1778911.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1778911, term1778911.getClass(), "autoscrolls", false);
        setField(term1778911, term1778911.getClass(), "border", null);
        setIntField(term1778911, term1778911.getClass(), "flags", 0);
        setField(term1778911, term1778911.getClass(), "inputVerifier", null);
        setBooleanField(term1778911, term1778911.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1778911, term1778911.getClass(), "paintingChild", null);
        setField(term1778911, term1778911.getClass(), "popupMenu", null);
        setField(term1778911, term1778911.getClass(), "revalidateRunnableScheduled", null);
        setField(term1778911, term1778911.getClass(), "focusInputMap", null);
        setField(term1778911, term1778911.getClass(), "ancestorInputMap", null);
        setField(term1778911, term1778911.getClass(), "windowInputMap", null);
        setField(term1778911, term1778911.getClass(), "actionMap", null);
        setField(term1778911, term1778911.getClass(), "aaHint", null);
        setField(term1778911, term1778911.getClass(), "lcdRenderingHint", null);
        setField(term1778911, term1778911.getClass(), "component", null);
        setField(term1778911, term1778911.getClass(), "layoutMgr", null);
        setField(term1778911, term1778911.getClass(), "dispatcher", null);
        setField(term1778911, term1778911.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1778911, term1778911.getClass(), "focusCycleRoot", false);
        setBooleanField(term1778911, term1778911.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1778911, term1778911.getClass(), "printingThreads", null);
        setBooleanField(term1778911, term1778911.getClass(), "printing", false);
        setField(term1778911, term1778911.getClass(), "containerListener", null);
        setIntField(term1778911, term1778911.getClass(), "listeningChildren", 0);
        setIntField(term1778911, term1778911.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1778911, term1778911.getClass(), "descendantsCount", 0);
        setField(term1778911, term1778911.getClass(), "preserveBackgroundColor", null);
        setIntField(term1778911, term1778911.getClass(), "numOfHWComponents", 0);
        setIntField(term1778911, term1778911.getClass(), "numOfLWComponents", 0);
        setField(term1778911, term1778911.getClass(), "modalComp", null);
        setField(term1778911, term1778911.getClass(), "modalAppContext", null);
        setIntField(term1778911, term1778911.getClass(), "containerSerializedDataVersion", 0);
        setField(term1778911, term1778911.getClass(), "peer", null);
        setField(term1778911, term1778911.getClass(), "parent", null);
        setField(term1778911, term1778911.getClass(), "appContext", null);
        setIntField(term1778911, term1778911.getClass(), "x", 0);
        setIntField(term1778911, term1778911.getClass(), "y", 0);
        setIntField(term1778911, term1778911.getClass(), "width", 0);
        setIntField(term1778911, term1778911.getClass(), "height", 0);
        setField(term1778911, term1778911.getClass(), "foreground", null);
        setField(term1778911, term1778911.getClass(), "background", null);
        setField(term1778911, term1778911.getClass(), "font", null);
        setField(term1778911, term1778911.getClass(), "peerFont", null);
        setField(term1778911, term1778911.getClass(), "cursor", null);
        setField(term1778911, term1778911.getClass(), "locale", null);
        setField(term1778911, term1778911.getClass(), "graphicsConfig", null);
        setField(term1778911, term1778911.getClass(), "bufferStrategy", null);
        setBooleanField(term1778911, term1778911.getClass(), "ignoreRepaint", false);
        setBooleanField(term1778911, term1778911.getClass(), "visible", false);
        setBooleanField(term1778911, term1778911.getClass(), "enabled", false);
        setBooleanField(term1778911, term1778911.getClass(), "valid", false);
        setField(term1778911, term1778911.getClass(), "dropTarget", null);
        setField(term1778911, term1778911.getClass(), "popups", null);
        setField(term1778911, term1778911.getClass(), "name", null);
        setBooleanField(term1778911, term1778911.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1778911, term1778911.getClass(), "focusable", false);
        setIntField(term1778911, term1778911.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1778911, term1778911.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1778911, term1778911.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1778911, term1778911.getClass(), "acc", null);
        setField(term1778911, term1778911.getClass(), "minSize", null);
        setBooleanField(term1778911, term1778911.getClass(), "minSizeSet", false);
        setField(term1778911, term1778911.getClass(), "prefSize", null);
        setBooleanField(term1778911, term1778911.getClass(), "prefSizeSet", false);
        setField(term1778911, term1778911.getClass(), "maxSize", null);
        setBooleanField(term1778911, term1778911.getClass(), "maxSizeSet", false);
        setField(term1778911, term1778911.getClass(), "componentOrientation", null);
        setBooleanField(term1778911, term1778911.getClass(), "newEventsOnly", false);
        setField(term1778911, term1778911.getClass(), "componentListener", null);
        setField(term1778911, term1778911.getClass(), "focusListener", null);
        setField(term1778911, term1778911.getClass(), "hierarchyListener", null);
        setField(term1778911, term1778911.getClass(), "hierarchyBoundsListener", null);
        setField(term1778911, term1778911.getClass(), "keyListener", null);
        setField(term1778911, term1778911.getClass(), "mouseListener", null);
        setField(term1778911, term1778911.getClass(), "mouseMotionListener", null);
        setField(term1778911, term1778911.getClass(), "mouseWheelListener", null);
        setField(term1778911, term1778911.getClass(), "inputMethodListener", null);
        setLongField(term1778911, term1778911.getClass(), "eventMask", 0L);
        setField(term1778911, term1778911.getClass(), "changeSupport", null);
        setField(term1778911, term1778911.getClass(), "objectLock", null);
        setBooleanField(term1778911, term1778911.getClass(), "isPacked", false);
        setIntField(term1778911, term1778911.getClass(), "boundsOp", 0);
        setField(term1778911, term1778911.getClass(), "compoundShape", null);
        setField(term1778911, term1778911.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1778911, term1778911.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1778911, term1778911.getClass(), "backgroundEraseDisabled", false);
        setField(term1778911, term1778911.getClass(), "eventCache", null);
        setBooleanField(term1778911, term1778911.getClass(), "coalescingEnabled", false);
        setBooleanField(term1778911, term1778911.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1778911, term1778911.getClass(), "componentSerializedDataVersion", 0);
        setField(term1778911, term1778911.getClass(), "accessibleContext", null);
        term1778958 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1778958;
        callMethod(klass, "addPossibleTutorial", argTypes, term1778911, args);
    }

};


