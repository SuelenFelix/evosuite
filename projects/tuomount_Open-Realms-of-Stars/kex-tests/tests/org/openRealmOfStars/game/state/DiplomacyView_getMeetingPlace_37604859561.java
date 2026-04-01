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

public class DiplomacyView_getMeetingPlace_37604859561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1876575;

    public DiplomacyView_getMeetingPlace_37604859561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1876575 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1876575, term1876575.getClass(), "human", null);
        setField(term1876575, term1876575.getClass(), "borderCrossedFleet", null);
        setField(term1876575, term1876575.getClass(), "ai", null);
        setField(term1876575, term1876575.getClass(), "starMap", null);
        setField(term1876575, term1876575.getClass(), "trade", null);
        setField(term1876575, term1876575.getClass(), "humanTechListOffer", null);
        setField(term1876575, term1876575.getClass(), "aiTechListOffer", null);
        setField(term1876575, term1876575.getClass(), "humanFleetListOffer", null);
        setField(term1876575, term1876575.getClass(), "aiFleetListOffer", null);
        setField(term1876575, term1876575.getClass(), "humanPlanetListOffer", null);
        setField(term1876575, term1876575.getClass(), "aiPlanetListOffer", null);
        setField(term1876575, term1876575.getClass(), "humanCreditOffer", null);
        setIntField(term1876575, term1876575.getClass(), "humanCredits", 0);
        setField(term1876575, term1876575.getClass(), "humanArtifactOffer", null);
        setIntField(term1876575, term1876575.getClass(), "humanArtifacts", 0);
        setField(term1876575, term1876575.getClass(), "aiCreditOffer", null);
        setIntField(term1876575, term1876575.getClass(), "aiCredits", 0);
        setField(term1876575, term1876575.getClass(), "aiArtifactOffer", null);
        setIntField(term1876575, term1876575.getClass(), "aiArtifacts", 0);
        setField(term1876575, term1876575.getClass(), "humanLines", null);
        setField(term1876575, term1876575.getClass(), "humanMapPlanetsOffer", null);
        setField(term1876575, term1876575.getClass(), "aiMapPlanetsOffer", null);
        setField(term1876575, term1876575.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1876575, term1876575.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1876575, term1876575.getClass(), "humanMapOffer", null);
        setField(term1876575, term1876575.getClass(), "aiMapOffer", null);
        setField(term1876575, term1876575.getClass(), "humanVoteYes", null);
        setField(term1876575, term1876575.getClass(), "humanVoteNo", null);
        setField(term1876575, term1876575.getClass(), "aiVoteYes", null);
        setField(term1876575, term1876575.getClass(), "aiVoteNo", null);
        setField(term1876575, term1876575.getClass(), "infoText", null);
        setField(term1876575, term1876575.getClass(), "likenessLabel", null);
        setField(term1876575, term1876575.getClass(), "endBtn", null);
        setField(term1876575, term1876575.getClass(), "meetingPlace", null);
        setBooleanField(term1876575, term1876575.getClass(), "tradeHappened", false);
        setField(term1876575, term1876575.getClass(), "aiImg", null);
        setIntField(term1876575, term1876575.getClass(), "textCounter", 0);
        setField(term1876575, term1876575.getClass(), "lastSpeechType", null);
        setField(term1876575, term1876575.getClass(), "embargoLine", null);
        setField(term1876575, term1876575.getClass(), "game", null);
        setBooleanField(term1876575, term1876575.getClass(), "isAlignmentXSet", false);
        setFloatField(term1876575, term1876575.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1876575, term1876575.getClass(), "isAlignmentYSet", false);
        setFloatField(term1876575, term1876575.getClass(), "alignmentY", 0.0F);
        setField(term1876575, term1876575.getClass(), "ui", null);
        setField(term1876575, term1876575.getClass(), "listenerList", null);
        setField(term1876575, term1876575.getClass(), "clientProperties", null);
        setField(term1876575, term1876575.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1876575, term1876575.getClass(), "autoscrolls", false);
        setField(term1876575, term1876575.getClass(), "border", null);
        setIntField(term1876575, term1876575.getClass(), "flags", 0);
        setField(term1876575, term1876575.getClass(), "inputVerifier", null);
        setBooleanField(term1876575, term1876575.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1876575, term1876575.getClass(), "paintingChild", null);
        setField(term1876575, term1876575.getClass(), "popupMenu", null);
        setField(term1876575, term1876575.getClass(), "revalidateRunnableScheduled", null);
        setField(term1876575, term1876575.getClass(), "focusInputMap", null);
        setField(term1876575, term1876575.getClass(), "ancestorInputMap", null);
        setField(term1876575, term1876575.getClass(), "windowInputMap", null);
        setField(term1876575, term1876575.getClass(), "actionMap", null);
        setField(term1876575, term1876575.getClass(), "aaHint", null);
        setField(term1876575, term1876575.getClass(), "lcdRenderingHint", null);
        setField(term1876575, term1876575.getClass(), "component", null);
        setField(term1876575, term1876575.getClass(), "layoutMgr", null);
        setField(term1876575, term1876575.getClass(), "dispatcher", null);
        setField(term1876575, term1876575.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1876575, term1876575.getClass(), "focusCycleRoot", false);
        setBooleanField(term1876575, term1876575.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1876575, term1876575.getClass(), "printingThreads", null);
        setBooleanField(term1876575, term1876575.getClass(), "printing", false);
        setField(term1876575, term1876575.getClass(), "containerListener", null);
        setIntField(term1876575, term1876575.getClass(), "listeningChildren", 0);
        setIntField(term1876575, term1876575.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1876575, term1876575.getClass(), "descendantsCount", 0);
        setField(term1876575, term1876575.getClass(), "preserveBackgroundColor", null);
        setIntField(term1876575, term1876575.getClass(), "numOfHWComponents", 0);
        setIntField(term1876575, term1876575.getClass(), "numOfLWComponents", 0);
        setField(term1876575, term1876575.getClass(), "modalComp", null);
        setField(term1876575, term1876575.getClass(), "modalAppContext", null);
        setIntField(term1876575, term1876575.getClass(), "containerSerializedDataVersion", 0);
        setField(term1876575, term1876575.getClass(), "peer", null);
        setField(term1876575, term1876575.getClass(), "parent", null);
        setField(term1876575, term1876575.getClass(), "appContext", null);
        setIntField(term1876575, term1876575.getClass(), "x", 0);
        setIntField(term1876575, term1876575.getClass(), "y", 0);
        setIntField(term1876575, term1876575.getClass(), "width", 0);
        setIntField(term1876575, term1876575.getClass(), "height", 0);
        setField(term1876575, term1876575.getClass(), "foreground", null);
        setField(term1876575, term1876575.getClass(), "background", null);
        setField(term1876575, term1876575.getClass(), "font", null);
        setField(term1876575, term1876575.getClass(), "peerFont", null);
        setField(term1876575, term1876575.getClass(), "cursor", null);
        setField(term1876575, term1876575.getClass(), "locale", null);
        setField(term1876575, term1876575.getClass(), "graphicsConfig", null);
        setField(term1876575, term1876575.getClass(), "bufferStrategy", null);
        setBooleanField(term1876575, term1876575.getClass(), "ignoreRepaint", false);
        setBooleanField(term1876575, term1876575.getClass(), "visible", false);
        setBooleanField(term1876575, term1876575.getClass(), "enabled", false);
        setBooleanField(term1876575, term1876575.getClass(), "valid", false);
        setField(term1876575, term1876575.getClass(), "dropTarget", null);
        setField(term1876575, term1876575.getClass(), "popups", null);
        setField(term1876575, term1876575.getClass(), "name", null);
        setBooleanField(term1876575, term1876575.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1876575, term1876575.getClass(), "focusable", false);
        setIntField(term1876575, term1876575.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1876575, term1876575.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1876575, term1876575.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1876575, term1876575.getClass(), "acc", null);
        setField(term1876575, term1876575.getClass(), "minSize", null);
        setBooleanField(term1876575, term1876575.getClass(), "minSizeSet", false);
        setField(term1876575, term1876575.getClass(), "prefSize", null);
        setBooleanField(term1876575, term1876575.getClass(), "prefSizeSet", false);
        setField(term1876575, term1876575.getClass(), "maxSize", null);
        setBooleanField(term1876575, term1876575.getClass(), "maxSizeSet", false);
        setField(term1876575, term1876575.getClass(), "componentOrientation", null);
        setBooleanField(term1876575, term1876575.getClass(), "newEventsOnly", false);
        setField(term1876575, term1876575.getClass(), "componentListener", null);
        setField(term1876575, term1876575.getClass(), "focusListener", null);
        setField(term1876575, term1876575.getClass(), "hierarchyListener", null);
        setField(term1876575, term1876575.getClass(), "hierarchyBoundsListener", null);
        setField(term1876575, term1876575.getClass(), "keyListener", null);
        setField(term1876575, term1876575.getClass(), "mouseListener", null);
        setField(term1876575, term1876575.getClass(), "mouseMotionListener", null);
        setField(term1876575, term1876575.getClass(), "mouseWheelListener", null);
        setField(term1876575, term1876575.getClass(), "inputMethodListener", null);
        setLongField(term1876575, term1876575.getClass(), "eventMask", 0L);
        setField(term1876575, term1876575.getClass(), "changeSupport", null);
        setField(term1876575, term1876575.getClass(), "objectLock", null);
        setBooleanField(term1876575, term1876575.getClass(), "isPacked", false);
        setIntField(term1876575, term1876575.getClass(), "boundsOp", 0);
        setField(term1876575, term1876575.getClass(), "compoundShape", null);
        setField(term1876575, term1876575.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1876575, term1876575.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1876575, term1876575.getClass(), "backgroundEraseDisabled", false);
        setField(term1876575, term1876575.getClass(), "eventCache", null);
        setBooleanField(term1876575, term1876575.getClass(), "coalescingEnabled", false);
        setBooleanField(term1876575, term1876575.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1876575, term1876575.getClass(), "componentSerializedDataVersion", 0);
        setField(term1876575, term1876575.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeetingPlace", argTypes, term1876575, args);
    }

};


