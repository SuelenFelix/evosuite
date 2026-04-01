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

public class DiplomacyView_createFleetList_168966033671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1911184;

    public DiplomacyView_createFleetList_168966033671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1911184 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1911184, term1911184.getClass(), "human", null);
        setField(term1911184, term1911184.getClass(), "borderCrossedFleet", null);
        setField(term1911184, term1911184.getClass(), "ai", null);
        setField(term1911184, term1911184.getClass(), "starMap", null);
        setField(term1911184, term1911184.getClass(), "trade", null);
        setField(term1911184, term1911184.getClass(), "humanTechListOffer", null);
        setField(term1911184, term1911184.getClass(), "aiTechListOffer", null);
        setField(term1911184, term1911184.getClass(), "humanFleetListOffer", null);
        setField(term1911184, term1911184.getClass(), "aiFleetListOffer", null);
        setField(term1911184, term1911184.getClass(), "humanPlanetListOffer", null);
        setField(term1911184, term1911184.getClass(), "aiPlanetListOffer", null);
        setField(term1911184, term1911184.getClass(), "humanCreditOffer", null);
        setIntField(term1911184, term1911184.getClass(), "humanCredits", 0);
        setField(term1911184, term1911184.getClass(), "humanArtifactOffer", null);
        setIntField(term1911184, term1911184.getClass(), "humanArtifacts", 0);
        setField(term1911184, term1911184.getClass(), "aiCreditOffer", null);
        setIntField(term1911184, term1911184.getClass(), "aiCredits", 0);
        setField(term1911184, term1911184.getClass(), "aiArtifactOffer", null);
        setIntField(term1911184, term1911184.getClass(), "aiArtifacts", 0);
        setField(term1911184, term1911184.getClass(), "humanLines", null);
        setField(term1911184, term1911184.getClass(), "humanMapPlanetsOffer", null);
        setField(term1911184, term1911184.getClass(), "aiMapPlanetsOffer", null);
        setField(term1911184, term1911184.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1911184, term1911184.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1911184, term1911184.getClass(), "humanMapOffer", null);
        setField(term1911184, term1911184.getClass(), "aiMapOffer", null);
        setField(term1911184, term1911184.getClass(), "humanVoteYes", null);
        setField(term1911184, term1911184.getClass(), "humanVoteNo", null);
        setField(term1911184, term1911184.getClass(), "aiVoteYes", null);
        setField(term1911184, term1911184.getClass(), "aiVoteNo", null);
        setField(term1911184, term1911184.getClass(), "infoText", null);
        setField(term1911184, term1911184.getClass(), "likenessLabel", null);
        setField(term1911184, term1911184.getClass(), "endBtn", null);
        setField(term1911184, term1911184.getClass(), "meetingPlace", null);
        setBooleanField(term1911184, term1911184.getClass(), "tradeHappened", false);
        setField(term1911184, term1911184.getClass(), "aiImg", null);
        setIntField(term1911184, term1911184.getClass(), "textCounter", 0);
        setField(term1911184, term1911184.getClass(), "lastSpeechType", null);
        setField(term1911184, term1911184.getClass(), "embargoLine", null);
        setField(term1911184, term1911184.getClass(), "game", null);
        setBooleanField(term1911184, term1911184.getClass(), "isAlignmentXSet", false);
        setFloatField(term1911184, term1911184.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1911184, term1911184.getClass(), "isAlignmentYSet", false);
        setFloatField(term1911184, term1911184.getClass(), "alignmentY", 0.0F);
        setField(term1911184, term1911184.getClass(), "ui", null);
        setField(term1911184, term1911184.getClass(), "listenerList", null);
        setField(term1911184, term1911184.getClass(), "clientProperties", null);
        setField(term1911184, term1911184.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1911184, term1911184.getClass(), "autoscrolls", false);
        setField(term1911184, term1911184.getClass(), "border", null);
        setIntField(term1911184, term1911184.getClass(), "flags", 0);
        setField(term1911184, term1911184.getClass(), "inputVerifier", null);
        setBooleanField(term1911184, term1911184.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1911184, term1911184.getClass(), "paintingChild", null);
        setField(term1911184, term1911184.getClass(), "popupMenu", null);
        setField(term1911184, term1911184.getClass(), "revalidateRunnableScheduled", null);
        setField(term1911184, term1911184.getClass(), "focusInputMap", null);
        setField(term1911184, term1911184.getClass(), "ancestorInputMap", null);
        setField(term1911184, term1911184.getClass(), "windowInputMap", null);
        setField(term1911184, term1911184.getClass(), "actionMap", null);
        setField(term1911184, term1911184.getClass(), "aaHint", null);
        setField(term1911184, term1911184.getClass(), "lcdRenderingHint", null);
        setField(term1911184, term1911184.getClass(), "component", null);
        setField(term1911184, term1911184.getClass(), "layoutMgr", null);
        setField(term1911184, term1911184.getClass(), "dispatcher", null);
        setField(term1911184, term1911184.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1911184, term1911184.getClass(), "focusCycleRoot", false);
        setBooleanField(term1911184, term1911184.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1911184, term1911184.getClass(), "printingThreads", null);
        setBooleanField(term1911184, term1911184.getClass(), "printing", false);
        setField(term1911184, term1911184.getClass(), "containerListener", null);
        setIntField(term1911184, term1911184.getClass(), "listeningChildren", 0);
        setIntField(term1911184, term1911184.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1911184, term1911184.getClass(), "descendantsCount", 0);
        setField(term1911184, term1911184.getClass(), "preserveBackgroundColor", null);
        setIntField(term1911184, term1911184.getClass(), "numOfHWComponents", 0);
        setIntField(term1911184, term1911184.getClass(), "numOfLWComponents", 0);
        setField(term1911184, term1911184.getClass(), "modalComp", null);
        setField(term1911184, term1911184.getClass(), "modalAppContext", null);
        setIntField(term1911184, term1911184.getClass(), "containerSerializedDataVersion", 0);
        setField(term1911184, term1911184.getClass(), "peer", null);
        setField(term1911184, term1911184.getClass(), "parent", null);
        setField(term1911184, term1911184.getClass(), "appContext", null);
        setIntField(term1911184, term1911184.getClass(), "x", 0);
        setIntField(term1911184, term1911184.getClass(), "y", 0);
        setIntField(term1911184, term1911184.getClass(), "width", 0);
        setIntField(term1911184, term1911184.getClass(), "height", 0);
        setField(term1911184, term1911184.getClass(), "foreground", null);
        setField(term1911184, term1911184.getClass(), "background", null);
        setField(term1911184, term1911184.getClass(), "font", null);
        setField(term1911184, term1911184.getClass(), "peerFont", null);
        setField(term1911184, term1911184.getClass(), "cursor", null);
        setField(term1911184, term1911184.getClass(), "locale", null);
        setField(term1911184, term1911184.getClass(), "graphicsConfig", null);
        setField(term1911184, term1911184.getClass(), "bufferStrategy", null);
        setBooleanField(term1911184, term1911184.getClass(), "ignoreRepaint", false);
        setBooleanField(term1911184, term1911184.getClass(), "visible", false);
        setBooleanField(term1911184, term1911184.getClass(), "enabled", false);
        setBooleanField(term1911184, term1911184.getClass(), "valid", false);
        setField(term1911184, term1911184.getClass(), "dropTarget", null);
        setField(term1911184, term1911184.getClass(), "popups", null);
        setField(term1911184, term1911184.getClass(), "name", null);
        setBooleanField(term1911184, term1911184.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1911184, term1911184.getClass(), "focusable", false);
        setIntField(term1911184, term1911184.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1911184, term1911184.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1911184, term1911184.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1911184, term1911184.getClass(), "acc", null);
        setField(term1911184, term1911184.getClass(), "minSize", null);
        setBooleanField(term1911184, term1911184.getClass(), "minSizeSet", false);
        setField(term1911184, term1911184.getClass(), "prefSize", null);
        setBooleanField(term1911184, term1911184.getClass(), "prefSizeSet", false);
        setField(term1911184, term1911184.getClass(), "maxSize", null);
        setBooleanField(term1911184, term1911184.getClass(), "maxSizeSet", false);
        setField(term1911184, term1911184.getClass(), "componentOrientation", null);
        setBooleanField(term1911184, term1911184.getClass(), "newEventsOnly", false);
        setField(term1911184, term1911184.getClass(), "componentListener", null);
        setField(term1911184, term1911184.getClass(), "focusListener", null);
        setField(term1911184, term1911184.getClass(), "hierarchyListener", null);
        setField(term1911184, term1911184.getClass(), "hierarchyBoundsListener", null);
        setField(term1911184, term1911184.getClass(), "keyListener", null);
        setField(term1911184, term1911184.getClass(), "mouseListener", null);
        setField(term1911184, term1911184.getClass(), "mouseMotionListener", null);
        setField(term1911184, term1911184.getClass(), "mouseWheelListener", null);
        setField(term1911184, term1911184.getClass(), "inputMethodListener", null);
        setLongField(term1911184, term1911184.getClass(), "eventMask", 0L);
        setField(term1911184, term1911184.getClass(), "changeSupport", null);
        setField(term1911184, term1911184.getClass(), "objectLock", null);
        setBooleanField(term1911184, term1911184.getClass(), "isPacked", false);
        setIntField(term1911184, term1911184.getClass(), "boundsOp", 0);
        setField(term1911184, term1911184.getClass(), "compoundShape", null);
        setField(term1911184, term1911184.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1911184, term1911184.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1911184, term1911184.getClass(), "backgroundEraseDisabled", false);
        setField(term1911184, term1911184.getClass(), "eventCache", null);
        setBooleanField(term1911184, term1911184.getClass(), "coalescingEnabled", false);
        setBooleanField(term1911184, term1911184.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1911184, term1911184.getClass(), "componentSerializedDataVersion", 0);
        setField(term1911184, term1911184.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createFleetList", argTypes, term1911184, args);
    }

};


