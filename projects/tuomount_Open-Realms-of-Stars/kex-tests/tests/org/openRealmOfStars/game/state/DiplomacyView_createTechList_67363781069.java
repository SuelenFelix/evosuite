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

public class DiplomacyView_createTechList_67363781069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1950887;

    public DiplomacyView_createTechList_67363781069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1950887 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1950887, term1950887.getClass(), "human", null);
        setField(term1950887, term1950887.getClass(), "borderCrossedFleet", null);
        setField(term1950887, term1950887.getClass(), "ai", null);
        setField(term1950887, term1950887.getClass(), "starMap", null);
        setField(term1950887, term1950887.getClass(), "trade", null);
        setField(term1950887, term1950887.getClass(), "humanTechListOffer", null);
        setField(term1950887, term1950887.getClass(), "aiTechListOffer", null);
        setField(term1950887, term1950887.getClass(), "humanFleetListOffer", null);
        setField(term1950887, term1950887.getClass(), "aiFleetListOffer", null);
        setField(term1950887, term1950887.getClass(), "humanPlanetListOffer", null);
        setField(term1950887, term1950887.getClass(), "aiPlanetListOffer", null);
        setField(term1950887, term1950887.getClass(), "humanCreditOffer", null);
        setIntField(term1950887, term1950887.getClass(), "humanCredits", 0);
        setField(term1950887, term1950887.getClass(), "humanArtifactOffer", null);
        setIntField(term1950887, term1950887.getClass(), "humanArtifacts", 0);
        setField(term1950887, term1950887.getClass(), "aiCreditOffer", null);
        setIntField(term1950887, term1950887.getClass(), "aiCredits", 0);
        setField(term1950887, term1950887.getClass(), "aiArtifactOffer", null);
        setIntField(term1950887, term1950887.getClass(), "aiArtifacts", 0);
        setField(term1950887, term1950887.getClass(), "humanLines", null);
        setField(term1950887, term1950887.getClass(), "humanMapPlanetsOffer", null);
        setField(term1950887, term1950887.getClass(), "aiMapPlanetsOffer", null);
        setField(term1950887, term1950887.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1950887, term1950887.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1950887, term1950887.getClass(), "humanMapOffer", null);
        setField(term1950887, term1950887.getClass(), "aiMapOffer", null);
        setField(term1950887, term1950887.getClass(), "humanVoteYes", null);
        setField(term1950887, term1950887.getClass(), "humanVoteNo", null);
        setField(term1950887, term1950887.getClass(), "aiVoteYes", null);
        setField(term1950887, term1950887.getClass(), "aiVoteNo", null);
        setField(term1950887, term1950887.getClass(), "infoText", null);
        setField(term1950887, term1950887.getClass(), "likenessLabel", null);
        setField(term1950887, term1950887.getClass(), "endBtn", null);
        setField(term1950887, term1950887.getClass(), "meetingPlace", null);
        setBooleanField(term1950887, term1950887.getClass(), "tradeHappened", false);
        setField(term1950887, term1950887.getClass(), "aiImg", null);
        setIntField(term1950887, term1950887.getClass(), "textCounter", 0);
        setField(term1950887, term1950887.getClass(), "lastSpeechType", null);
        setField(term1950887, term1950887.getClass(), "embargoLine", null);
        setField(term1950887, term1950887.getClass(), "game", null);
        setBooleanField(term1950887, term1950887.getClass(), "isAlignmentXSet", false);
        setFloatField(term1950887, term1950887.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1950887, term1950887.getClass(), "isAlignmentYSet", false);
        setFloatField(term1950887, term1950887.getClass(), "alignmentY", 0.0F);
        setField(term1950887, term1950887.getClass(), "ui", null);
        setField(term1950887, term1950887.getClass(), "listenerList", null);
        setField(term1950887, term1950887.getClass(), "clientProperties", null);
        setField(term1950887, term1950887.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1950887, term1950887.getClass(), "autoscrolls", false);
        setField(term1950887, term1950887.getClass(), "border", null);
        setIntField(term1950887, term1950887.getClass(), "flags", 0);
        setField(term1950887, term1950887.getClass(), "inputVerifier", null);
        setBooleanField(term1950887, term1950887.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1950887, term1950887.getClass(), "paintingChild", null);
        setField(term1950887, term1950887.getClass(), "popupMenu", null);
        setField(term1950887, term1950887.getClass(), "revalidateRunnableScheduled", null);
        setField(term1950887, term1950887.getClass(), "focusInputMap", null);
        setField(term1950887, term1950887.getClass(), "ancestorInputMap", null);
        setField(term1950887, term1950887.getClass(), "windowInputMap", null);
        setField(term1950887, term1950887.getClass(), "actionMap", null);
        setField(term1950887, term1950887.getClass(), "aaHint", null);
        setField(term1950887, term1950887.getClass(), "lcdRenderingHint", null);
        setField(term1950887, term1950887.getClass(), "component", null);
        setField(term1950887, term1950887.getClass(), "layoutMgr", null);
        setField(term1950887, term1950887.getClass(), "dispatcher", null);
        setField(term1950887, term1950887.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1950887, term1950887.getClass(), "focusCycleRoot", false);
        setBooleanField(term1950887, term1950887.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1950887, term1950887.getClass(), "printingThreads", null);
        setBooleanField(term1950887, term1950887.getClass(), "printing", false);
        setField(term1950887, term1950887.getClass(), "containerListener", null);
        setIntField(term1950887, term1950887.getClass(), "listeningChildren", 0);
        setIntField(term1950887, term1950887.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1950887, term1950887.getClass(), "descendantsCount", 0);
        setField(term1950887, term1950887.getClass(), "preserveBackgroundColor", null);
        setIntField(term1950887, term1950887.getClass(), "numOfHWComponents", 0);
        setIntField(term1950887, term1950887.getClass(), "numOfLWComponents", 0);
        setField(term1950887, term1950887.getClass(), "modalComp", null);
        setField(term1950887, term1950887.getClass(), "modalAppContext", null);
        setIntField(term1950887, term1950887.getClass(), "containerSerializedDataVersion", 0);
        setField(term1950887, term1950887.getClass(), "peer", null);
        setField(term1950887, term1950887.getClass(), "parent", null);
        setField(term1950887, term1950887.getClass(), "appContext", null);
        setIntField(term1950887, term1950887.getClass(), "x", 0);
        setIntField(term1950887, term1950887.getClass(), "y", 0);
        setIntField(term1950887, term1950887.getClass(), "width", 0);
        setIntField(term1950887, term1950887.getClass(), "height", 0);
        setField(term1950887, term1950887.getClass(), "foreground", null);
        setField(term1950887, term1950887.getClass(), "background", null);
        setField(term1950887, term1950887.getClass(), "font", null);
        setField(term1950887, term1950887.getClass(), "peerFont", null);
        setField(term1950887, term1950887.getClass(), "cursor", null);
        setField(term1950887, term1950887.getClass(), "locale", null);
        setField(term1950887, term1950887.getClass(), "graphicsConfig", null);
        setField(term1950887, term1950887.getClass(), "bufferStrategy", null);
        setBooleanField(term1950887, term1950887.getClass(), "ignoreRepaint", false);
        setBooleanField(term1950887, term1950887.getClass(), "visible", false);
        setBooleanField(term1950887, term1950887.getClass(), "enabled", false);
        setBooleanField(term1950887, term1950887.getClass(), "valid", false);
        setField(term1950887, term1950887.getClass(), "dropTarget", null);
        setField(term1950887, term1950887.getClass(), "popups", null);
        setField(term1950887, term1950887.getClass(), "name", null);
        setBooleanField(term1950887, term1950887.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1950887, term1950887.getClass(), "focusable", false);
        setIntField(term1950887, term1950887.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1950887, term1950887.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1950887, term1950887.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1950887, term1950887.getClass(), "acc", null);
        setField(term1950887, term1950887.getClass(), "minSize", null);
        setBooleanField(term1950887, term1950887.getClass(), "minSizeSet", false);
        setField(term1950887, term1950887.getClass(), "prefSize", null);
        setBooleanField(term1950887, term1950887.getClass(), "prefSizeSet", false);
        setField(term1950887, term1950887.getClass(), "maxSize", null);
        setBooleanField(term1950887, term1950887.getClass(), "maxSizeSet", false);
        setField(term1950887, term1950887.getClass(), "componentOrientation", null);
        setBooleanField(term1950887, term1950887.getClass(), "newEventsOnly", false);
        setField(term1950887, term1950887.getClass(), "componentListener", null);
        setField(term1950887, term1950887.getClass(), "focusListener", null);
        setField(term1950887, term1950887.getClass(), "hierarchyListener", null);
        setField(term1950887, term1950887.getClass(), "hierarchyBoundsListener", null);
        setField(term1950887, term1950887.getClass(), "keyListener", null);
        setField(term1950887, term1950887.getClass(), "mouseListener", null);
        setField(term1950887, term1950887.getClass(), "mouseMotionListener", null);
        setField(term1950887, term1950887.getClass(), "mouseWheelListener", null);
        setField(term1950887, term1950887.getClass(), "inputMethodListener", null);
        setLongField(term1950887, term1950887.getClass(), "eventMask", 0L);
        setField(term1950887, term1950887.getClass(), "changeSupport", null);
        setField(term1950887, term1950887.getClass(), "objectLock", null);
        setBooleanField(term1950887, term1950887.getClass(), "isPacked", false);
        setIntField(term1950887, term1950887.getClass(), "boundsOp", 0);
        setField(term1950887, term1950887.getClass(), "compoundShape", null);
        setField(term1950887, term1950887.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1950887, term1950887.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1950887, term1950887.getClass(), "backgroundEraseDisabled", false);
        setField(term1950887, term1950887.getClass(), "eventCache", null);
        setBooleanField(term1950887, term1950887.getClass(), "coalescingEnabled", false);
        setBooleanField(term1950887, term1950887.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1950887, term1950887.getClass(), "componentSerializedDataVersion", 0);
        setField(term1950887, term1950887.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createTechList", argTypes, term1950887, args);
    }

};


