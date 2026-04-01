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

public class DiplomacyView_createHumanVoteOffer_40997547437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1762128;

    public DiplomacyView_createHumanVoteOffer_40997547437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1762128 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1762128, term1762128.getClass(), "human", null);
        setField(term1762128, term1762128.getClass(), "borderCrossedFleet", null);
        setField(term1762128, term1762128.getClass(), "ai", null);
        setField(term1762128, term1762128.getClass(), "starMap", null);
        setField(term1762128, term1762128.getClass(), "trade", null);
        setField(term1762128, term1762128.getClass(), "humanTechListOffer", null);
        setField(term1762128, term1762128.getClass(), "aiTechListOffer", null);
        setField(term1762128, term1762128.getClass(), "humanFleetListOffer", null);
        setField(term1762128, term1762128.getClass(), "aiFleetListOffer", null);
        setField(term1762128, term1762128.getClass(), "humanPlanetListOffer", null);
        setField(term1762128, term1762128.getClass(), "aiPlanetListOffer", null);
        setField(term1762128, term1762128.getClass(), "humanCreditOffer", null);
        setIntField(term1762128, term1762128.getClass(), "humanCredits", 0);
        setField(term1762128, term1762128.getClass(), "humanArtifactOffer", null);
        setIntField(term1762128, term1762128.getClass(), "humanArtifacts", 0);
        setField(term1762128, term1762128.getClass(), "aiCreditOffer", null);
        setIntField(term1762128, term1762128.getClass(), "aiCredits", 0);
        setField(term1762128, term1762128.getClass(), "aiArtifactOffer", null);
        setIntField(term1762128, term1762128.getClass(), "aiArtifacts", 0);
        setField(term1762128, term1762128.getClass(), "humanLines", null);
        setField(term1762128, term1762128.getClass(), "humanMapPlanetsOffer", null);
        setField(term1762128, term1762128.getClass(), "aiMapPlanetsOffer", null);
        setField(term1762128, term1762128.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1762128, term1762128.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1762128, term1762128.getClass(), "humanMapOffer", null);
        setField(term1762128, term1762128.getClass(), "aiMapOffer", null);
        setField(term1762128, term1762128.getClass(), "humanVoteYes", null);
        setField(term1762128, term1762128.getClass(), "humanVoteNo", null);
        setField(term1762128, term1762128.getClass(), "aiVoteYes", null);
        setField(term1762128, term1762128.getClass(), "aiVoteNo", null);
        setField(term1762128, term1762128.getClass(), "infoText", null);
        setField(term1762128, term1762128.getClass(), "likenessLabel", null);
        setField(term1762128, term1762128.getClass(), "endBtn", null);
        setField(term1762128, term1762128.getClass(), "meetingPlace", null);
        setBooleanField(term1762128, term1762128.getClass(), "tradeHappened", false);
        setField(term1762128, term1762128.getClass(), "aiImg", null);
        setIntField(term1762128, term1762128.getClass(), "textCounter", 0);
        setField(term1762128, term1762128.getClass(), "lastSpeechType", null);
        setField(term1762128, term1762128.getClass(), "embargoLine", null);
        setField(term1762128, term1762128.getClass(), "game", null);
        setBooleanField(term1762128, term1762128.getClass(), "isAlignmentXSet", false);
        setFloatField(term1762128, term1762128.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1762128, term1762128.getClass(), "isAlignmentYSet", false);
        setFloatField(term1762128, term1762128.getClass(), "alignmentY", 0.0F);
        setField(term1762128, term1762128.getClass(), "ui", null);
        setField(term1762128, term1762128.getClass(), "listenerList", null);
        setField(term1762128, term1762128.getClass(), "clientProperties", null);
        setField(term1762128, term1762128.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1762128, term1762128.getClass(), "autoscrolls", false);
        setField(term1762128, term1762128.getClass(), "border", null);
        setIntField(term1762128, term1762128.getClass(), "flags", 0);
        setField(term1762128, term1762128.getClass(), "inputVerifier", null);
        setBooleanField(term1762128, term1762128.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1762128, term1762128.getClass(), "paintingChild", null);
        setField(term1762128, term1762128.getClass(), "popupMenu", null);
        setField(term1762128, term1762128.getClass(), "revalidateRunnableScheduled", null);
        setField(term1762128, term1762128.getClass(), "focusInputMap", null);
        setField(term1762128, term1762128.getClass(), "ancestorInputMap", null);
        setField(term1762128, term1762128.getClass(), "windowInputMap", null);
        setField(term1762128, term1762128.getClass(), "actionMap", null);
        setField(term1762128, term1762128.getClass(), "aaHint", null);
        setField(term1762128, term1762128.getClass(), "lcdRenderingHint", null);
        setField(term1762128, term1762128.getClass(), "component", null);
        setField(term1762128, term1762128.getClass(), "layoutMgr", null);
        setField(term1762128, term1762128.getClass(), "dispatcher", null);
        setField(term1762128, term1762128.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1762128, term1762128.getClass(), "focusCycleRoot", false);
        setBooleanField(term1762128, term1762128.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1762128, term1762128.getClass(), "printingThreads", null);
        setBooleanField(term1762128, term1762128.getClass(), "printing", false);
        setField(term1762128, term1762128.getClass(), "containerListener", null);
        setIntField(term1762128, term1762128.getClass(), "listeningChildren", 0);
        setIntField(term1762128, term1762128.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1762128, term1762128.getClass(), "descendantsCount", 0);
        setField(term1762128, term1762128.getClass(), "preserveBackgroundColor", null);
        setIntField(term1762128, term1762128.getClass(), "numOfHWComponents", 0);
        setIntField(term1762128, term1762128.getClass(), "numOfLWComponents", 0);
        setField(term1762128, term1762128.getClass(), "modalComp", null);
        setField(term1762128, term1762128.getClass(), "modalAppContext", null);
        setIntField(term1762128, term1762128.getClass(), "containerSerializedDataVersion", 0);
        setField(term1762128, term1762128.getClass(), "peer", null);
        setField(term1762128, term1762128.getClass(), "parent", null);
        setField(term1762128, term1762128.getClass(), "appContext", null);
        setIntField(term1762128, term1762128.getClass(), "x", 0);
        setIntField(term1762128, term1762128.getClass(), "y", 0);
        setIntField(term1762128, term1762128.getClass(), "width", 0);
        setIntField(term1762128, term1762128.getClass(), "height", 0);
        setField(term1762128, term1762128.getClass(), "foreground", null);
        setField(term1762128, term1762128.getClass(), "background", null);
        setField(term1762128, term1762128.getClass(), "font", null);
        setField(term1762128, term1762128.getClass(), "peerFont", null);
        setField(term1762128, term1762128.getClass(), "cursor", null);
        setField(term1762128, term1762128.getClass(), "locale", null);
        setField(term1762128, term1762128.getClass(), "graphicsConfig", null);
        setField(term1762128, term1762128.getClass(), "bufferStrategy", null);
        setBooleanField(term1762128, term1762128.getClass(), "ignoreRepaint", false);
        setBooleanField(term1762128, term1762128.getClass(), "visible", false);
        setBooleanField(term1762128, term1762128.getClass(), "enabled", false);
        setBooleanField(term1762128, term1762128.getClass(), "valid", false);
        setField(term1762128, term1762128.getClass(), "dropTarget", null);
        setField(term1762128, term1762128.getClass(), "popups", null);
        setField(term1762128, term1762128.getClass(), "name", null);
        setBooleanField(term1762128, term1762128.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1762128, term1762128.getClass(), "focusable", false);
        setIntField(term1762128, term1762128.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1762128, term1762128.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1762128, term1762128.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1762128, term1762128.getClass(), "acc", null);
        setField(term1762128, term1762128.getClass(), "minSize", null);
        setBooleanField(term1762128, term1762128.getClass(), "minSizeSet", false);
        setField(term1762128, term1762128.getClass(), "prefSize", null);
        setBooleanField(term1762128, term1762128.getClass(), "prefSizeSet", false);
        setField(term1762128, term1762128.getClass(), "maxSize", null);
        setBooleanField(term1762128, term1762128.getClass(), "maxSizeSet", false);
        setField(term1762128, term1762128.getClass(), "componentOrientation", null);
        setBooleanField(term1762128, term1762128.getClass(), "newEventsOnly", false);
        setField(term1762128, term1762128.getClass(), "componentListener", null);
        setField(term1762128, term1762128.getClass(), "focusListener", null);
        setField(term1762128, term1762128.getClass(), "hierarchyListener", null);
        setField(term1762128, term1762128.getClass(), "hierarchyBoundsListener", null);
        setField(term1762128, term1762128.getClass(), "keyListener", null);
        setField(term1762128, term1762128.getClass(), "mouseListener", null);
        setField(term1762128, term1762128.getClass(), "mouseMotionListener", null);
        setField(term1762128, term1762128.getClass(), "mouseWheelListener", null);
        setField(term1762128, term1762128.getClass(), "inputMethodListener", null);
        setLongField(term1762128, term1762128.getClass(), "eventMask", 0L);
        setField(term1762128, term1762128.getClass(), "changeSupport", null);
        setField(term1762128, term1762128.getClass(), "objectLock", null);
        setBooleanField(term1762128, term1762128.getClass(), "isPacked", false);
        setIntField(term1762128, term1762128.getClass(), "boundsOp", 0);
        setField(term1762128, term1762128.getClass(), "compoundShape", null);
        setField(term1762128, term1762128.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1762128, term1762128.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1762128, term1762128.getClass(), "backgroundEraseDisabled", false);
        setField(term1762128, term1762128.getClass(), "eventCache", null);
        setBooleanField(term1762128, term1762128.getClass(), "coalescingEnabled", false);
        setBooleanField(term1762128, term1762128.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1762128, term1762128.getClass(), "componentSerializedDataVersion", 0);
        setField(term1762128, term1762128.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createHumanVoteOffer", argTypes, term1762128, args);
    }

};


