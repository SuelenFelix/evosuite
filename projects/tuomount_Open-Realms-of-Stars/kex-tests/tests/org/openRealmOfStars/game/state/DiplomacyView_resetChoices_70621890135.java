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

public class DiplomacyView_resetChoices_70621890135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1753555;

    public DiplomacyView_resetChoices_70621890135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1753555 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1753555, term1753555.getClass(), "human", null);
        setField(term1753555, term1753555.getClass(), "borderCrossedFleet", null);
        setField(term1753555, term1753555.getClass(), "ai", null);
        setField(term1753555, term1753555.getClass(), "starMap", null);
        setField(term1753555, term1753555.getClass(), "trade", null);
        setField(term1753555, term1753555.getClass(), "humanTechListOffer", null);
        setField(term1753555, term1753555.getClass(), "aiTechListOffer", null);
        setField(term1753555, term1753555.getClass(), "humanFleetListOffer", null);
        setField(term1753555, term1753555.getClass(), "aiFleetListOffer", null);
        setField(term1753555, term1753555.getClass(), "humanPlanetListOffer", null);
        setField(term1753555, term1753555.getClass(), "aiPlanetListOffer", null);
        setField(term1753555, term1753555.getClass(), "humanCreditOffer", null);
        setIntField(term1753555, term1753555.getClass(), "humanCredits", 0);
        setField(term1753555, term1753555.getClass(), "humanArtifactOffer", null);
        setIntField(term1753555, term1753555.getClass(), "humanArtifacts", 0);
        setField(term1753555, term1753555.getClass(), "aiCreditOffer", null);
        setIntField(term1753555, term1753555.getClass(), "aiCredits", 0);
        setField(term1753555, term1753555.getClass(), "aiArtifactOffer", null);
        setIntField(term1753555, term1753555.getClass(), "aiArtifacts", 0);
        setField(term1753555, term1753555.getClass(), "humanLines", null);
        setField(term1753555, term1753555.getClass(), "humanMapPlanetsOffer", null);
        setField(term1753555, term1753555.getClass(), "aiMapPlanetsOffer", null);
        setField(term1753555, term1753555.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1753555, term1753555.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1753555, term1753555.getClass(), "humanMapOffer", null);
        setField(term1753555, term1753555.getClass(), "aiMapOffer", null);
        setField(term1753555, term1753555.getClass(), "humanVoteYes", null);
        setField(term1753555, term1753555.getClass(), "humanVoteNo", null);
        setField(term1753555, term1753555.getClass(), "aiVoteYes", null);
        setField(term1753555, term1753555.getClass(), "aiVoteNo", null);
        setField(term1753555, term1753555.getClass(), "infoText", null);
        setField(term1753555, term1753555.getClass(), "likenessLabel", null);
        setField(term1753555, term1753555.getClass(), "endBtn", null);
        setField(term1753555, term1753555.getClass(), "meetingPlace", null);
        setBooleanField(term1753555, term1753555.getClass(), "tradeHappened", false);
        setField(term1753555, term1753555.getClass(), "aiImg", null);
        setIntField(term1753555, term1753555.getClass(), "textCounter", 0);
        setField(term1753555, term1753555.getClass(), "lastSpeechType", null);
        setField(term1753555, term1753555.getClass(), "embargoLine", null);
        setField(term1753555, term1753555.getClass(), "game", null);
        setBooleanField(term1753555, term1753555.getClass(), "isAlignmentXSet", false);
        setFloatField(term1753555, term1753555.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1753555, term1753555.getClass(), "isAlignmentYSet", false);
        setFloatField(term1753555, term1753555.getClass(), "alignmentY", 0.0F);
        setField(term1753555, term1753555.getClass(), "ui", null);
        setField(term1753555, term1753555.getClass(), "listenerList", null);
        setField(term1753555, term1753555.getClass(), "clientProperties", null);
        setField(term1753555, term1753555.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1753555, term1753555.getClass(), "autoscrolls", false);
        setField(term1753555, term1753555.getClass(), "border", null);
        setIntField(term1753555, term1753555.getClass(), "flags", 0);
        setField(term1753555, term1753555.getClass(), "inputVerifier", null);
        setBooleanField(term1753555, term1753555.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1753555, term1753555.getClass(), "paintingChild", null);
        setField(term1753555, term1753555.getClass(), "popupMenu", null);
        setField(term1753555, term1753555.getClass(), "revalidateRunnableScheduled", null);
        setField(term1753555, term1753555.getClass(), "focusInputMap", null);
        setField(term1753555, term1753555.getClass(), "ancestorInputMap", null);
        setField(term1753555, term1753555.getClass(), "windowInputMap", null);
        setField(term1753555, term1753555.getClass(), "actionMap", null);
        setField(term1753555, term1753555.getClass(), "aaHint", null);
        setField(term1753555, term1753555.getClass(), "lcdRenderingHint", null);
        setField(term1753555, term1753555.getClass(), "component", null);
        setField(term1753555, term1753555.getClass(), "layoutMgr", null);
        setField(term1753555, term1753555.getClass(), "dispatcher", null);
        setField(term1753555, term1753555.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1753555, term1753555.getClass(), "focusCycleRoot", false);
        setBooleanField(term1753555, term1753555.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1753555, term1753555.getClass(), "printingThreads", null);
        setBooleanField(term1753555, term1753555.getClass(), "printing", false);
        setField(term1753555, term1753555.getClass(), "containerListener", null);
        setIntField(term1753555, term1753555.getClass(), "listeningChildren", 0);
        setIntField(term1753555, term1753555.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1753555, term1753555.getClass(), "descendantsCount", 0);
        setField(term1753555, term1753555.getClass(), "preserveBackgroundColor", null);
        setIntField(term1753555, term1753555.getClass(), "numOfHWComponents", 0);
        setIntField(term1753555, term1753555.getClass(), "numOfLWComponents", 0);
        setField(term1753555, term1753555.getClass(), "modalComp", null);
        setField(term1753555, term1753555.getClass(), "modalAppContext", null);
        setIntField(term1753555, term1753555.getClass(), "containerSerializedDataVersion", 0);
        setField(term1753555, term1753555.getClass(), "peer", null);
        setField(term1753555, term1753555.getClass(), "parent", null);
        setField(term1753555, term1753555.getClass(), "appContext", null);
        setIntField(term1753555, term1753555.getClass(), "x", 0);
        setIntField(term1753555, term1753555.getClass(), "y", 0);
        setIntField(term1753555, term1753555.getClass(), "width", 0);
        setIntField(term1753555, term1753555.getClass(), "height", 0);
        setField(term1753555, term1753555.getClass(), "foreground", null);
        setField(term1753555, term1753555.getClass(), "background", null);
        setField(term1753555, term1753555.getClass(), "font", null);
        setField(term1753555, term1753555.getClass(), "peerFont", null);
        setField(term1753555, term1753555.getClass(), "cursor", null);
        setField(term1753555, term1753555.getClass(), "locale", null);
        setField(term1753555, term1753555.getClass(), "graphicsConfig", null);
        setField(term1753555, term1753555.getClass(), "bufferStrategy", null);
        setBooleanField(term1753555, term1753555.getClass(), "ignoreRepaint", false);
        setBooleanField(term1753555, term1753555.getClass(), "visible", false);
        setBooleanField(term1753555, term1753555.getClass(), "enabled", false);
        setBooleanField(term1753555, term1753555.getClass(), "valid", false);
        setField(term1753555, term1753555.getClass(), "dropTarget", null);
        setField(term1753555, term1753555.getClass(), "popups", null);
        setField(term1753555, term1753555.getClass(), "name", null);
        setBooleanField(term1753555, term1753555.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1753555, term1753555.getClass(), "focusable", false);
        setIntField(term1753555, term1753555.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1753555, term1753555.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1753555, term1753555.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1753555, term1753555.getClass(), "acc", null);
        setField(term1753555, term1753555.getClass(), "minSize", null);
        setBooleanField(term1753555, term1753555.getClass(), "minSizeSet", false);
        setField(term1753555, term1753555.getClass(), "prefSize", null);
        setBooleanField(term1753555, term1753555.getClass(), "prefSizeSet", false);
        setField(term1753555, term1753555.getClass(), "maxSize", null);
        setBooleanField(term1753555, term1753555.getClass(), "maxSizeSet", false);
        setField(term1753555, term1753555.getClass(), "componentOrientation", null);
        setBooleanField(term1753555, term1753555.getClass(), "newEventsOnly", false);
        setField(term1753555, term1753555.getClass(), "componentListener", null);
        setField(term1753555, term1753555.getClass(), "focusListener", null);
        setField(term1753555, term1753555.getClass(), "hierarchyListener", null);
        setField(term1753555, term1753555.getClass(), "hierarchyBoundsListener", null);
        setField(term1753555, term1753555.getClass(), "keyListener", null);
        setField(term1753555, term1753555.getClass(), "mouseListener", null);
        setField(term1753555, term1753555.getClass(), "mouseMotionListener", null);
        setField(term1753555, term1753555.getClass(), "mouseWheelListener", null);
        setField(term1753555, term1753555.getClass(), "inputMethodListener", null);
        setLongField(term1753555, term1753555.getClass(), "eventMask", 0L);
        setField(term1753555, term1753555.getClass(), "changeSupport", null);
        setField(term1753555, term1753555.getClass(), "objectLock", null);
        setBooleanField(term1753555, term1753555.getClass(), "isPacked", false);
        setIntField(term1753555, term1753555.getClass(), "boundsOp", 0);
        setField(term1753555, term1753555.getClass(), "compoundShape", null);
        setField(term1753555, term1753555.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1753555, term1753555.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1753555, term1753555.getClass(), "backgroundEraseDisabled", false);
        setField(term1753555, term1753555.getClass(), "eventCache", null);
        setBooleanField(term1753555, term1753555.getClass(), "coalescingEnabled", false);
        setBooleanField(term1753555, term1753555.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1753555, term1753555.getClass(), "componentSerializedDataVersion", 0);
        setField(term1753555, term1753555.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetChoices", argTypes, term1753555, args);
    }

};


