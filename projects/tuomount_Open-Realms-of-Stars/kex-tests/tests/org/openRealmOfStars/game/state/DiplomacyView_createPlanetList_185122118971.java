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

public class DiplomacyView_createPlanetList_185122118971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1950981;

    public DiplomacyView_createPlanetList_185122118971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1950981 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1950981, term1950981.getClass(), "human", null);
        setField(term1950981, term1950981.getClass(), "borderCrossedFleet", null);
        setField(term1950981, term1950981.getClass(), "ai", null);
        setField(term1950981, term1950981.getClass(), "starMap", null);
        setField(term1950981, term1950981.getClass(), "trade", null);
        setField(term1950981, term1950981.getClass(), "humanTechListOffer", null);
        setField(term1950981, term1950981.getClass(), "aiTechListOffer", null);
        setField(term1950981, term1950981.getClass(), "humanFleetListOffer", null);
        setField(term1950981, term1950981.getClass(), "aiFleetListOffer", null);
        setField(term1950981, term1950981.getClass(), "humanPlanetListOffer", null);
        setField(term1950981, term1950981.getClass(), "aiPlanetListOffer", null);
        setField(term1950981, term1950981.getClass(), "humanCreditOffer", null);
        setIntField(term1950981, term1950981.getClass(), "humanCredits", 0);
        setField(term1950981, term1950981.getClass(), "humanArtifactOffer", null);
        setIntField(term1950981, term1950981.getClass(), "humanArtifacts", 0);
        setField(term1950981, term1950981.getClass(), "aiCreditOffer", null);
        setIntField(term1950981, term1950981.getClass(), "aiCredits", 0);
        setField(term1950981, term1950981.getClass(), "aiArtifactOffer", null);
        setIntField(term1950981, term1950981.getClass(), "aiArtifacts", 0);
        setField(term1950981, term1950981.getClass(), "humanLines", null);
        setField(term1950981, term1950981.getClass(), "humanMapPlanetsOffer", null);
        setField(term1950981, term1950981.getClass(), "aiMapPlanetsOffer", null);
        setField(term1950981, term1950981.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1950981, term1950981.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1950981, term1950981.getClass(), "humanMapOffer", null);
        setField(term1950981, term1950981.getClass(), "aiMapOffer", null);
        setField(term1950981, term1950981.getClass(), "humanVoteYes", null);
        setField(term1950981, term1950981.getClass(), "humanVoteNo", null);
        setField(term1950981, term1950981.getClass(), "aiVoteYes", null);
        setField(term1950981, term1950981.getClass(), "aiVoteNo", null);
        setField(term1950981, term1950981.getClass(), "infoText", null);
        setField(term1950981, term1950981.getClass(), "likenessLabel", null);
        setField(term1950981, term1950981.getClass(), "endBtn", null);
        setField(term1950981, term1950981.getClass(), "meetingPlace", null);
        setBooleanField(term1950981, term1950981.getClass(), "tradeHappened", false);
        setField(term1950981, term1950981.getClass(), "aiImg", null);
        setIntField(term1950981, term1950981.getClass(), "textCounter", 0);
        setField(term1950981, term1950981.getClass(), "lastSpeechType", null);
        setField(term1950981, term1950981.getClass(), "embargoLine", null);
        setField(term1950981, term1950981.getClass(), "game", null);
        setBooleanField(term1950981, term1950981.getClass(), "isAlignmentXSet", false);
        setFloatField(term1950981, term1950981.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1950981, term1950981.getClass(), "isAlignmentYSet", false);
        setFloatField(term1950981, term1950981.getClass(), "alignmentY", 0.0F);
        setField(term1950981, term1950981.getClass(), "ui", null);
        setField(term1950981, term1950981.getClass(), "listenerList", null);
        setField(term1950981, term1950981.getClass(), "clientProperties", null);
        setField(term1950981, term1950981.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1950981, term1950981.getClass(), "autoscrolls", false);
        setField(term1950981, term1950981.getClass(), "border", null);
        setIntField(term1950981, term1950981.getClass(), "flags", 0);
        setField(term1950981, term1950981.getClass(), "inputVerifier", null);
        setBooleanField(term1950981, term1950981.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1950981, term1950981.getClass(), "paintingChild", null);
        setField(term1950981, term1950981.getClass(), "popupMenu", null);
        setField(term1950981, term1950981.getClass(), "revalidateRunnableScheduled", null);
        setField(term1950981, term1950981.getClass(), "focusInputMap", null);
        setField(term1950981, term1950981.getClass(), "ancestorInputMap", null);
        setField(term1950981, term1950981.getClass(), "windowInputMap", null);
        setField(term1950981, term1950981.getClass(), "actionMap", null);
        setField(term1950981, term1950981.getClass(), "aaHint", null);
        setField(term1950981, term1950981.getClass(), "lcdRenderingHint", null);
        setField(term1950981, term1950981.getClass(), "component", null);
        setField(term1950981, term1950981.getClass(), "layoutMgr", null);
        setField(term1950981, term1950981.getClass(), "dispatcher", null);
        setField(term1950981, term1950981.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1950981, term1950981.getClass(), "focusCycleRoot", false);
        setBooleanField(term1950981, term1950981.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1950981, term1950981.getClass(), "printingThreads", null);
        setBooleanField(term1950981, term1950981.getClass(), "printing", false);
        setField(term1950981, term1950981.getClass(), "containerListener", null);
        setIntField(term1950981, term1950981.getClass(), "listeningChildren", 0);
        setIntField(term1950981, term1950981.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1950981, term1950981.getClass(), "descendantsCount", 0);
        setField(term1950981, term1950981.getClass(), "preserveBackgroundColor", null);
        setIntField(term1950981, term1950981.getClass(), "numOfHWComponents", 0);
        setIntField(term1950981, term1950981.getClass(), "numOfLWComponents", 0);
        setField(term1950981, term1950981.getClass(), "modalComp", null);
        setField(term1950981, term1950981.getClass(), "modalAppContext", null);
        setIntField(term1950981, term1950981.getClass(), "containerSerializedDataVersion", 0);
        setField(term1950981, term1950981.getClass(), "peer", null);
        setField(term1950981, term1950981.getClass(), "parent", null);
        setField(term1950981, term1950981.getClass(), "appContext", null);
        setIntField(term1950981, term1950981.getClass(), "x", 0);
        setIntField(term1950981, term1950981.getClass(), "y", 0);
        setIntField(term1950981, term1950981.getClass(), "width", 0);
        setIntField(term1950981, term1950981.getClass(), "height", 0);
        setField(term1950981, term1950981.getClass(), "foreground", null);
        setField(term1950981, term1950981.getClass(), "background", null);
        setField(term1950981, term1950981.getClass(), "font", null);
        setField(term1950981, term1950981.getClass(), "peerFont", null);
        setField(term1950981, term1950981.getClass(), "cursor", null);
        setField(term1950981, term1950981.getClass(), "locale", null);
        setField(term1950981, term1950981.getClass(), "graphicsConfig", null);
        setField(term1950981, term1950981.getClass(), "bufferStrategy", null);
        setBooleanField(term1950981, term1950981.getClass(), "ignoreRepaint", false);
        setBooleanField(term1950981, term1950981.getClass(), "visible", false);
        setBooleanField(term1950981, term1950981.getClass(), "enabled", false);
        setBooleanField(term1950981, term1950981.getClass(), "valid", false);
        setField(term1950981, term1950981.getClass(), "dropTarget", null);
        setField(term1950981, term1950981.getClass(), "popups", null);
        setField(term1950981, term1950981.getClass(), "name", null);
        setBooleanField(term1950981, term1950981.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1950981, term1950981.getClass(), "focusable", false);
        setIntField(term1950981, term1950981.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1950981, term1950981.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1950981, term1950981.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1950981, term1950981.getClass(), "acc", null);
        setField(term1950981, term1950981.getClass(), "minSize", null);
        setBooleanField(term1950981, term1950981.getClass(), "minSizeSet", false);
        setField(term1950981, term1950981.getClass(), "prefSize", null);
        setBooleanField(term1950981, term1950981.getClass(), "prefSizeSet", false);
        setField(term1950981, term1950981.getClass(), "maxSize", null);
        setBooleanField(term1950981, term1950981.getClass(), "maxSizeSet", false);
        setField(term1950981, term1950981.getClass(), "componentOrientation", null);
        setBooleanField(term1950981, term1950981.getClass(), "newEventsOnly", false);
        setField(term1950981, term1950981.getClass(), "componentListener", null);
        setField(term1950981, term1950981.getClass(), "focusListener", null);
        setField(term1950981, term1950981.getClass(), "hierarchyListener", null);
        setField(term1950981, term1950981.getClass(), "hierarchyBoundsListener", null);
        setField(term1950981, term1950981.getClass(), "keyListener", null);
        setField(term1950981, term1950981.getClass(), "mouseListener", null);
        setField(term1950981, term1950981.getClass(), "mouseMotionListener", null);
        setField(term1950981, term1950981.getClass(), "mouseWheelListener", null);
        setField(term1950981, term1950981.getClass(), "inputMethodListener", null);
        setLongField(term1950981, term1950981.getClass(), "eventMask", 0L);
        setField(term1950981, term1950981.getClass(), "changeSupport", null);
        setField(term1950981, term1950981.getClass(), "objectLock", null);
        setBooleanField(term1950981, term1950981.getClass(), "isPacked", false);
        setIntField(term1950981, term1950981.getClass(), "boundsOp", 0);
        setField(term1950981, term1950981.getClass(), "compoundShape", null);
        setField(term1950981, term1950981.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1950981, term1950981.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1950981, term1950981.getClass(), "backgroundEraseDisabled", false);
        setField(term1950981, term1950981.getClass(), "eventCache", null);
        setBooleanField(term1950981, term1950981.getClass(), "coalescingEnabled", false);
        setBooleanField(term1950981, term1950981.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1950981, term1950981.getClass(), "componentSerializedDataVersion", 0);
        setField(term1950981, term1950981.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createPlanetList", argTypes, term1950981, args);
    }

};


