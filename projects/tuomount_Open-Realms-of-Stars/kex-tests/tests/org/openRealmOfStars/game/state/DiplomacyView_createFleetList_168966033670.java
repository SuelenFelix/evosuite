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

public class DiplomacyView_createFleetList_168966033670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1950934;

    public DiplomacyView_createFleetList_168966033670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1950934 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1950934, term1950934.getClass(), "human", null);
        setField(term1950934, term1950934.getClass(), "borderCrossedFleet", null);
        setField(term1950934, term1950934.getClass(), "ai", null);
        setField(term1950934, term1950934.getClass(), "starMap", null);
        setField(term1950934, term1950934.getClass(), "trade", null);
        setField(term1950934, term1950934.getClass(), "humanTechListOffer", null);
        setField(term1950934, term1950934.getClass(), "aiTechListOffer", null);
        setField(term1950934, term1950934.getClass(), "humanFleetListOffer", null);
        setField(term1950934, term1950934.getClass(), "aiFleetListOffer", null);
        setField(term1950934, term1950934.getClass(), "humanPlanetListOffer", null);
        setField(term1950934, term1950934.getClass(), "aiPlanetListOffer", null);
        setField(term1950934, term1950934.getClass(), "humanCreditOffer", null);
        setIntField(term1950934, term1950934.getClass(), "humanCredits", 0);
        setField(term1950934, term1950934.getClass(), "humanArtifactOffer", null);
        setIntField(term1950934, term1950934.getClass(), "humanArtifacts", 0);
        setField(term1950934, term1950934.getClass(), "aiCreditOffer", null);
        setIntField(term1950934, term1950934.getClass(), "aiCredits", 0);
        setField(term1950934, term1950934.getClass(), "aiArtifactOffer", null);
        setIntField(term1950934, term1950934.getClass(), "aiArtifacts", 0);
        setField(term1950934, term1950934.getClass(), "humanLines", null);
        setField(term1950934, term1950934.getClass(), "humanMapPlanetsOffer", null);
        setField(term1950934, term1950934.getClass(), "aiMapPlanetsOffer", null);
        setField(term1950934, term1950934.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1950934, term1950934.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1950934, term1950934.getClass(), "humanMapOffer", null);
        setField(term1950934, term1950934.getClass(), "aiMapOffer", null);
        setField(term1950934, term1950934.getClass(), "humanVoteYes", null);
        setField(term1950934, term1950934.getClass(), "humanVoteNo", null);
        setField(term1950934, term1950934.getClass(), "aiVoteYes", null);
        setField(term1950934, term1950934.getClass(), "aiVoteNo", null);
        setField(term1950934, term1950934.getClass(), "infoText", null);
        setField(term1950934, term1950934.getClass(), "likenessLabel", null);
        setField(term1950934, term1950934.getClass(), "endBtn", null);
        setField(term1950934, term1950934.getClass(), "meetingPlace", null);
        setBooleanField(term1950934, term1950934.getClass(), "tradeHappened", false);
        setField(term1950934, term1950934.getClass(), "aiImg", null);
        setIntField(term1950934, term1950934.getClass(), "textCounter", 0);
        setField(term1950934, term1950934.getClass(), "lastSpeechType", null);
        setField(term1950934, term1950934.getClass(), "embargoLine", null);
        setField(term1950934, term1950934.getClass(), "game", null);
        setBooleanField(term1950934, term1950934.getClass(), "isAlignmentXSet", false);
        setFloatField(term1950934, term1950934.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1950934, term1950934.getClass(), "isAlignmentYSet", false);
        setFloatField(term1950934, term1950934.getClass(), "alignmentY", 0.0F);
        setField(term1950934, term1950934.getClass(), "ui", null);
        setField(term1950934, term1950934.getClass(), "listenerList", null);
        setField(term1950934, term1950934.getClass(), "clientProperties", null);
        setField(term1950934, term1950934.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1950934, term1950934.getClass(), "autoscrolls", false);
        setField(term1950934, term1950934.getClass(), "border", null);
        setIntField(term1950934, term1950934.getClass(), "flags", 0);
        setField(term1950934, term1950934.getClass(), "inputVerifier", null);
        setBooleanField(term1950934, term1950934.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1950934, term1950934.getClass(), "paintingChild", null);
        setField(term1950934, term1950934.getClass(), "popupMenu", null);
        setField(term1950934, term1950934.getClass(), "revalidateRunnableScheduled", null);
        setField(term1950934, term1950934.getClass(), "focusInputMap", null);
        setField(term1950934, term1950934.getClass(), "ancestorInputMap", null);
        setField(term1950934, term1950934.getClass(), "windowInputMap", null);
        setField(term1950934, term1950934.getClass(), "actionMap", null);
        setField(term1950934, term1950934.getClass(), "aaHint", null);
        setField(term1950934, term1950934.getClass(), "lcdRenderingHint", null);
        setField(term1950934, term1950934.getClass(), "component", null);
        setField(term1950934, term1950934.getClass(), "layoutMgr", null);
        setField(term1950934, term1950934.getClass(), "dispatcher", null);
        setField(term1950934, term1950934.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1950934, term1950934.getClass(), "focusCycleRoot", false);
        setBooleanField(term1950934, term1950934.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1950934, term1950934.getClass(), "printingThreads", null);
        setBooleanField(term1950934, term1950934.getClass(), "printing", false);
        setField(term1950934, term1950934.getClass(), "containerListener", null);
        setIntField(term1950934, term1950934.getClass(), "listeningChildren", 0);
        setIntField(term1950934, term1950934.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1950934, term1950934.getClass(), "descendantsCount", 0);
        setField(term1950934, term1950934.getClass(), "preserveBackgroundColor", null);
        setIntField(term1950934, term1950934.getClass(), "numOfHWComponents", 0);
        setIntField(term1950934, term1950934.getClass(), "numOfLWComponents", 0);
        setField(term1950934, term1950934.getClass(), "modalComp", null);
        setField(term1950934, term1950934.getClass(), "modalAppContext", null);
        setIntField(term1950934, term1950934.getClass(), "containerSerializedDataVersion", 0);
        setField(term1950934, term1950934.getClass(), "peer", null);
        setField(term1950934, term1950934.getClass(), "parent", null);
        setField(term1950934, term1950934.getClass(), "appContext", null);
        setIntField(term1950934, term1950934.getClass(), "x", 0);
        setIntField(term1950934, term1950934.getClass(), "y", 0);
        setIntField(term1950934, term1950934.getClass(), "width", 0);
        setIntField(term1950934, term1950934.getClass(), "height", 0);
        setField(term1950934, term1950934.getClass(), "foreground", null);
        setField(term1950934, term1950934.getClass(), "background", null);
        setField(term1950934, term1950934.getClass(), "font", null);
        setField(term1950934, term1950934.getClass(), "peerFont", null);
        setField(term1950934, term1950934.getClass(), "cursor", null);
        setField(term1950934, term1950934.getClass(), "locale", null);
        setField(term1950934, term1950934.getClass(), "graphicsConfig", null);
        setField(term1950934, term1950934.getClass(), "bufferStrategy", null);
        setBooleanField(term1950934, term1950934.getClass(), "ignoreRepaint", false);
        setBooleanField(term1950934, term1950934.getClass(), "visible", false);
        setBooleanField(term1950934, term1950934.getClass(), "enabled", false);
        setBooleanField(term1950934, term1950934.getClass(), "valid", false);
        setField(term1950934, term1950934.getClass(), "dropTarget", null);
        setField(term1950934, term1950934.getClass(), "popups", null);
        setField(term1950934, term1950934.getClass(), "name", null);
        setBooleanField(term1950934, term1950934.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1950934, term1950934.getClass(), "focusable", false);
        setIntField(term1950934, term1950934.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1950934, term1950934.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1950934, term1950934.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1950934, term1950934.getClass(), "acc", null);
        setField(term1950934, term1950934.getClass(), "minSize", null);
        setBooleanField(term1950934, term1950934.getClass(), "minSizeSet", false);
        setField(term1950934, term1950934.getClass(), "prefSize", null);
        setBooleanField(term1950934, term1950934.getClass(), "prefSizeSet", false);
        setField(term1950934, term1950934.getClass(), "maxSize", null);
        setBooleanField(term1950934, term1950934.getClass(), "maxSizeSet", false);
        setField(term1950934, term1950934.getClass(), "componentOrientation", null);
        setBooleanField(term1950934, term1950934.getClass(), "newEventsOnly", false);
        setField(term1950934, term1950934.getClass(), "componentListener", null);
        setField(term1950934, term1950934.getClass(), "focusListener", null);
        setField(term1950934, term1950934.getClass(), "hierarchyListener", null);
        setField(term1950934, term1950934.getClass(), "hierarchyBoundsListener", null);
        setField(term1950934, term1950934.getClass(), "keyListener", null);
        setField(term1950934, term1950934.getClass(), "mouseListener", null);
        setField(term1950934, term1950934.getClass(), "mouseMotionListener", null);
        setField(term1950934, term1950934.getClass(), "mouseWheelListener", null);
        setField(term1950934, term1950934.getClass(), "inputMethodListener", null);
        setLongField(term1950934, term1950934.getClass(), "eventMask", 0L);
        setField(term1950934, term1950934.getClass(), "changeSupport", null);
        setField(term1950934, term1950934.getClass(), "objectLock", null);
        setBooleanField(term1950934, term1950934.getClass(), "isPacked", false);
        setIntField(term1950934, term1950934.getClass(), "boundsOp", 0);
        setField(term1950934, term1950934.getClass(), "compoundShape", null);
        setField(term1950934, term1950934.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1950934, term1950934.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1950934, term1950934.getClass(), "backgroundEraseDisabled", false);
        setField(term1950934, term1950934.getClass(), "eventCache", null);
        setBooleanField(term1950934, term1950934.getClass(), "coalescingEnabled", false);
        setBooleanField(term1950934, term1950934.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1950934, term1950934.getClass(), "componentSerializedDataVersion", 0);
        setField(term1950934, term1950934.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createFleetList", argTypes, term1950934, args);
    }

};


