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

public class DiplomacyView_handleActionCommandOK_40059417145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1795823;

    public DiplomacyView_handleActionCommandOK_40059417145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1795823 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1795823, term1795823.getClass(), "human", null);
        setField(term1795823, term1795823.getClass(), "borderCrossedFleet", null);
        setField(term1795823, term1795823.getClass(), "ai", null);
        setField(term1795823, term1795823.getClass(), "starMap", null);
        setField(term1795823, term1795823.getClass(), "trade", null);
        setField(term1795823, term1795823.getClass(), "humanTechListOffer", null);
        setField(term1795823, term1795823.getClass(), "aiTechListOffer", null);
        setField(term1795823, term1795823.getClass(), "humanFleetListOffer", null);
        setField(term1795823, term1795823.getClass(), "aiFleetListOffer", null);
        setField(term1795823, term1795823.getClass(), "humanPlanetListOffer", null);
        setField(term1795823, term1795823.getClass(), "aiPlanetListOffer", null);
        setField(term1795823, term1795823.getClass(), "humanCreditOffer", null);
        setIntField(term1795823, term1795823.getClass(), "humanCredits", 0);
        setField(term1795823, term1795823.getClass(), "humanArtifactOffer", null);
        setIntField(term1795823, term1795823.getClass(), "humanArtifacts", 0);
        setField(term1795823, term1795823.getClass(), "aiCreditOffer", null);
        setIntField(term1795823, term1795823.getClass(), "aiCredits", 0);
        setField(term1795823, term1795823.getClass(), "aiArtifactOffer", null);
        setIntField(term1795823, term1795823.getClass(), "aiArtifacts", 0);
        setField(term1795823, term1795823.getClass(), "humanLines", null);
        setField(term1795823, term1795823.getClass(), "humanMapPlanetsOffer", null);
        setField(term1795823, term1795823.getClass(), "aiMapPlanetsOffer", null);
        setField(term1795823, term1795823.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1795823, term1795823.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1795823, term1795823.getClass(), "humanMapOffer", null);
        setField(term1795823, term1795823.getClass(), "aiMapOffer", null);
        setField(term1795823, term1795823.getClass(), "humanVoteYes", null);
        setField(term1795823, term1795823.getClass(), "humanVoteNo", null);
        setField(term1795823, term1795823.getClass(), "aiVoteYes", null);
        setField(term1795823, term1795823.getClass(), "aiVoteNo", null);
        setField(term1795823, term1795823.getClass(), "infoText", null);
        setField(term1795823, term1795823.getClass(), "likenessLabel", null);
        setField(term1795823, term1795823.getClass(), "endBtn", null);
        setField(term1795823, term1795823.getClass(), "meetingPlace", null);
        setBooleanField(term1795823, term1795823.getClass(), "tradeHappened", false);
        setField(term1795823, term1795823.getClass(), "aiImg", null);
        setIntField(term1795823, term1795823.getClass(), "textCounter", 0);
        setField(term1795823, term1795823.getClass(), "lastSpeechType", null);
        setField(term1795823, term1795823.getClass(), "embargoLine", null);
        setField(term1795823, term1795823.getClass(), "game", null);
        setBooleanField(term1795823, term1795823.getClass(), "isAlignmentXSet", false);
        setFloatField(term1795823, term1795823.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1795823, term1795823.getClass(), "isAlignmentYSet", false);
        setFloatField(term1795823, term1795823.getClass(), "alignmentY", 0.0F);
        setField(term1795823, term1795823.getClass(), "ui", null);
        setField(term1795823, term1795823.getClass(), "listenerList", null);
        setField(term1795823, term1795823.getClass(), "clientProperties", null);
        setField(term1795823, term1795823.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1795823, term1795823.getClass(), "autoscrolls", false);
        setField(term1795823, term1795823.getClass(), "border", null);
        setIntField(term1795823, term1795823.getClass(), "flags", 0);
        setField(term1795823, term1795823.getClass(), "inputVerifier", null);
        setBooleanField(term1795823, term1795823.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1795823, term1795823.getClass(), "paintingChild", null);
        setField(term1795823, term1795823.getClass(), "popupMenu", null);
        setField(term1795823, term1795823.getClass(), "revalidateRunnableScheduled", null);
        setField(term1795823, term1795823.getClass(), "focusInputMap", null);
        setField(term1795823, term1795823.getClass(), "ancestorInputMap", null);
        setField(term1795823, term1795823.getClass(), "windowInputMap", null);
        setField(term1795823, term1795823.getClass(), "actionMap", null);
        setField(term1795823, term1795823.getClass(), "aaHint", null);
        setField(term1795823, term1795823.getClass(), "lcdRenderingHint", null);
        setField(term1795823, term1795823.getClass(), "component", null);
        setField(term1795823, term1795823.getClass(), "layoutMgr", null);
        setField(term1795823, term1795823.getClass(), "dispatcher", null);
        setField(term1795823, term1795823.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1795823, term1795823.getClass(), "focusCycleRoot", false);
        setBooleanField(term1795823, term1795823.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1795823, term1795823.getClass(), "printingThreads", null);
        setBooleanField(term1795823, term1795823.getClass(), "printing", false);
        setField(term1795823, term1795823.getClass(), "containerListener", null);
        setIntField(term1795823, term1795823.getClass(), "listeningChildren", 0);
        setIntField(term1795823, term1795823.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1795823, term1795823.getClass(), "descendantsCount", 0);
        setField(term1795823, term1795823.getClass(), "preserveBackgroundColor", null);
        setIntField(term1795823, term1795823.getClass(), "numOfHWComponents", 0);
        setIntField(term1795823, term1795823.getClass(), "numOfLWComponents", 0);
        setField(term1795823, term1795823.getClass(), "modalComp", null);
        setField(term1795823, term1795823.getClass(), "modalAppContext", null);
        setIntField(term1795823, term1795823.getClass(), "containerSerializedDataVersion", 0);
        setField(term1795823, term1795823.getClass(), "peer", null);
        setField(term1795823, term1795823.getClass(), "parent", null);
        setField(term1795823, term1795823.getClass(), "appContext", null);
        setIntField(term1795823, term1795823.getClass(), "x", 0);
        setIntField(term1795823, term1795823.getClass(), "y", 0);
        setIntField(term1795823, term1795823.getClass(), "width", 0);
        setIntField(term1795823, term1795823.getClass(), "height", 0);
        setField(term1795823, term1795823.getClass(), "foreground", null);
        setField(term1795823, term1795823.getClass(), "background", null);
        setField(term1795823, term1795823.getClass(), "font", null);
        setField(term1795823, term1795823.getClass(), "peerFont", null);
        setField(term1795823, term1795823.getClass(), "cursor", null);
        setField(term1795823, term1795823.getClass(), "locale", null);
        setField(term1795823, term1795823.getClass(), "graphicsConfig", null);
        setField(term1795823, term1795823.getClass(), "bufferStrategy", null);
        setBooleanField(term1795823, term1795823.getClass(), "ignoreRepaint", false);
        setBooleanField(term1795823, term1795823.getClass(), "visible", false);
        setBooleanField(term1795823, term1795823.getClass(), "enabled", false);
        setBooleanField(term1795823, term1795823.getClass(), "valid", false);
        setField(term1795823, term1795823.getClass(), "dropTarget", null);
        setField(term1795823, term1795823.getClass(), "popups", null);
        setField(term1795823, term1795823.getClass(), "name", null);
        setBooleanField(term1795823, term1795823.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1795823, term1795823.getClass(), "focusable", false);
        setIntField(term1795823, term1795823.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1795823, term1795823.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1795823, term1795823.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1795823, term1795823.getClass(), "acc", null);
        setField(term1795823, term1795823.getClass(), "minSize", null);
        setBooleanField(term1795823, term1795823.getClass(), "minSizeSet", false);
        setField(term1795823, term1795823.getClass(), "prefSize", null);
        setBooleanField(term1795823, term1795823.getClass(), "prefSizeSet", false);
        setField(term1795823, term1795823.getClass(), "maxSize", null);
        setBooleanField(term1795823, term1795823.getClass(), "maxSizeSet", false);
        setField(term1795823, term1795823.getClass(), "componentOrientation", null);
        setBooleanField(term1795823, term1795823.getClass(), "newEventsOnly", false);
        setField(term1795823, term1795823.getClass(), "componentListener", null);
        setField(term1795823, term1795823.getClass(), "focusListener", null);
        setField(term1795823, term1795823.getClass(), "hierarchyListener", null);
        setField(term1795823, term1795823.getClass(), "hierarchyBoundsListener", null);
        setField(term1795823, term1795823.getClass(), "keyListener", null);
        setField(term1795823, term1795823.getClass(), "mouseListener", null);
        setField(term1795823, term1795823.getClass(), "mouseMotionListener", null);
        setField(term1795823, term1795823.getClass(), "mouseWheelListener", null);
        setField(term1795823, term1795823.getClass(), "inputMethodListener", null);
        setLongField(term1795823, term1795823.getClass(), "eventMask", 0L);
        setField(term1795823, term1795823.getClass(), "changeSupport", null);
        setField(term1795823, term1795823.getClass(), "objectLock", null);
        setBooleanField(term1795823, term1795823.getClass(), "isPacked", false);
        setIntField(term1795823, term1795823.getClass(), "boundsOp", 0);
        setField(term1795823, term1795823.getClass(), "compoundShape", null);
        setField(term1795823, term1795823.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1795823, term1795823.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1795823, term1795823.getClass(), "backgroundEraseDisabled", false);
        setField(term1795823, term1795823.getClass(), "eventCache", null);
        setBooleanField(term1795823, term1795823.getClass(), "coalescingEnabled", false);
        setBooleanField(term1795823, term1795823.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1795823, term1795823.getClass(), "componentSerializedDataVersion", 0);
        setField(term1795823, term1795823.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleActionCommandOK", argTypes, term1795823, args);
    }

};


