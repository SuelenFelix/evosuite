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

public class DiplomacyView_updateMeetingNumbers_8354498257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1859791;

    public DiplomacyView_updateMeetingNumbers_8354498257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1859791 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1859791, term1859791.getClass(), "human", null);
        setField(term1859791, term1859791.getClass(), "borderCrossedFleet", null);
        setField(term1859791, term1859791.getClass(), "ai", null);
        setField(term1859791, term1859791.getClass(), "starMap", null);
        setField(term1859791, term1859791.getClass(), "trade", null);
        setField(term1859791, term1859791.getClass(), "humanTechListOffer", null);
        setField(term1859791, term1859791.getClass(), "aiTechListOffer", null);
        setField(term1859791, term1859791.getClass(), "humanFleetListOffer", null);
        setField(term1859791, term1859791.getClass(), "aiFleetListOffer", null);
        setField(term1859791, term1859791.getClass(), "humanPlanetListOffer", null);
        setField(term1859791, term1859791.getClass(), "aiPlanetListOffer", null);
        setField(term1859791, term1859791.getClass(), "humanCreditOffer", null);
        setIntField(term1859791, term1859791.getClass(), "humanCredits", 0);
        setField(term1859791, term1859791.getClass(), "humanArtifactOffer", null);
        setIntField(term1859791, term1859791.getClass(), "humanArtifacts", 0);
        setField(term1859791, term1859791.getClass(), "aiCreditOffer", null);
        setIntField(term1859791, term1859791.getClass(), "aiCredits", 0);
        setField(term1859791, term1859791.getClass(), "aiArtifactOffer", null);
        setIntField(term1859791, term1859791.getClass(), "aiArtifacts", 0);
        setField(term1859791, term1859791.getClass(), "humanLines", null);
        setField(term1859791, term1859791.getClass(), "humanMapPlanetsOffer", null);
        setField(term1859791, term1859791.getClass(), "aiMapPlanetsOffer", null);
        setField(term1859791, term1859791.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1859791, term1859791.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1859791, term1859791.getClass(), "humanMapOffer", null);
        setField(term1859791, term1859791.getClass(), "aiMapOffer", null);
        setField(term1859791, term1859791.getClass(), "humanVoteYes", null);
        setField(term1859791, term1859791.getClass(), "humanVoteNo", null);
        setField(term1859791, term1859791.getClass(), "aiVoteYes", null);
        setField(term1859791, term1859791.getClass(), "aiVoteNo", null);
        setField(term1859791, term1859791.getClass(), "infoText", null);
        setField(term1859791, term1859791.getClass(), "likenessLabel", null);
        setField(term1859791, term1859791.getClass(), "endBtn", null);
        setField(term1859791, term1859791.getClass(), "meetingPlace", null);
        setBooleanField(term1859791, term1859791.getClass(), "tradeHappened", false);
        setField(term1859791, term1859791.getClass(), "aiImg", null);
        setIntField(term1859791, term1859791.getClass(), "textCounter", 0);
        setField(term1859791, term1859791.getClass(), "lastSpeechType", null);
        setField(term1859791, term1859791.getClass(), "embargoLine", null);
        setField(term1859791, term1859791.getClass(), "game", null);
        setBooleanField(term1859791, term1859791.getClass(), "isAlignmentXSet", false);
        setFloatField(term1859791, term1859791.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1859791, term1859791.getClass(), "isAlignmentYSet", false);
        setFloatField(term1859791, term1859791.getClass(), "alignmentY", 0.0F);
        setField(term1859791, term1859791.getClass(), "ui", null);
        setField(term1859791, term1859791.getClass(), "listenerList", null);
        setField(term1859791, term1859791.getClass(), "clientProperties", null);
        setField(term1859791, term1859791.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1859791, term1859791.getClass(), "autoscrolls", false);
        setField(term1859791, term1859791.getClass(), "border", null);
        setIntField(term1859791, term1859791.getClass(), "flags", 0);
        setField(term1859791, term1859791.getClass(), "inputVerifier", null);
        setBooleanField(term1859791, term1859791.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1859791, term1859791.getClass(), "paintingChild", null);
        setField(term1859791, term1859791.getClass(), "popupMenu", null);
        setField(term1859791, term1859791.getClass(), "revalidateRunnableScheduled", null);
        setField(term1859791, term1859791.getClass(), "focusInputMap", null);
        setField(term1859791, term1859791.getClass(), "ancestorInputMap", null);
        setField(term1859791, term1859791.getClass(), "windowInputMap", null);
        setField(term1859791, term1859791.getClass(), "actionMap", null);
        setField(term1859791, term1859791.getClass(), "aaHint", null);
        setField(term1859791, term1859791.getClass(), "lcdRenderingHint", null);
        setField(term1859791, term1859791.getClass(), "component", null);
        setField(term1859791, term1859791.getClass(), "layoutMgr", null);
        setField(term1859791, term1859791.getClass(), "dispatcher", null);
        setField(term1859791, term1859791.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1859791, term1859791.getClass(), "focusCycleRoot", false);
        setBooleanField(term1859791, term1859791.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1859791, term1859791.getClass(), "printingThreads", null);
        setBooleanField(term1859791, term1859791.getClass(), "printing", false);
        setField(term1859791, term1859791.getClass(), "containerListener", null);
        setIntField(term1859791, term1859791.getClass(), "listeningChildren", 0);
        setIntField(term1859791, term1859791.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1859791, term1859791.getClass(), "descendantsCount", 0);
        setField(term1859791, term1859791.getClass(), "preserveBackgroundColor", null);
        setIntField(term1859791, term1859791.getClass(), "numOfHWComponents", 0);
        setIntField(term1859791, term1859791.getClass(), "numOfLWComponents", 0);
        setField(term1859791, term1859791.getClass(), "modalComp", null);
        setField(term1859791, term1859791.getClass(), "modalAppContext", null);
        setIntField(term1859791, term1859791.getClass(), "containerSerializedDataVersion", 0);
        setField(term1859791, term1859791.getClass(), "peer", null);
        setField(term1859791, term1859791.getClass(), "parent", null);
        setField(term1859791, term1859791.getClass(), "appContext", null);
        setIntField(term1859791, term1859791.getClass(), "x", 0);
        setIntField(term1859791, term1859791.getClass(), "y", 0);
        setIntField(term1859791, term1859791.getClass(), "width", 0);
        setIntField(term1859791, term1859791.getClass(), "height", 0);
        setField(term1859791, term1859791.getClass(), "foreground", null);
        setField(term1859791, term1859791.getClass(), "background", null);
        setField(term1859791, term1859791.getClass(), "font", null);
        setField(term1859791, term1859791.getClass(), "peerFont", null);
        setField(term1859791, term1859791.getClass(), "cursor", null);
        setField(term1859791, term1859791.getClass(), "locale", null);
        setField(term1859791, term1859791.getClass(), "graphicsConfig", null);
        setField(term1859791, term1859791.getClass(), "bufferStrategy", null);
        setBooleanField(term1859791, term1859791.getClass(), "ignoreRepaint", false);
        setBooleanField(term1859791, term1859791.getClass(), "visible", false);
        setBooleanField(term1859791, term1859791.getClass(), "enabled", false);
        setBooleanField(term1859791, term1859791.getClass(), "valid", false);
        setField(term1859791, term1859791.getClass(), "dropTarget", null);
        setField(term1859791, term1859791.getClass(), "popups", null);
        setField(term1859791, term1859791.getClass(), "name", null);
        setBooleanField(term1859791, term1859791.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1859791, term1859791.getClass(), "focusable", false);
        setIntField(term1859791, term1859791.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1859791, term1859791.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1859791, term1859791.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1859791, term1859791.getClass(), "acc", null);
        setField(term1859791, term1859791.getClass(), "minSize", null);
        setBooleanField(term1859791, term1859791.getClass(), "minSizeSet", false);
        setField(term1859791, term1859791.getClass(), "prefSize", null);
        setBooleanField(term1859791, term1859791.getClass(), "prefSizeSet", false);
        setField(term1859791, term1859791.getClass(), "maxSize", null);
        setBooleanField(term1859791, term1859791.getClass(), "maxSizeSet", false);
        setField(term1859791, term1859791.getClass(), "componentOrientation", null);
        setBooleanField(term1859791, term1859791.getClass(), "newEventsOnly", false);
        setField(term1859791, term1859791.getClass(), "componentListener", null);
        setField(term1859791, term1859791.getClass(), "focusListener", null);
        setField(term1859791, term1859791.getClass(), "hierarchyListener", null);
        setField(term1859791, term1859791.getClass(), "hierarchyBoundsListener", null);
        setField(term1859791, term1859791.getClass(), "keyListener", null);
        setField(term1859791, term1859791.getClass(), "mouseListener", null);
        setField(term1859791, term1859791.getClass(), "mouseMotionListener", null);
        setField(term1859791, term1859791.getClass(), "mouseWheelListener", null);
        setField(term1859791, term1859791.getClass(), "inputMethodListener", null);
        setLongField(term1859791, term1859791.getClass(), "eventMask", 0L);
        setField(term1859791, term1859791.getClass(), "changeSupport", null);
        setField(term1859791, term1859791.getClass(), "objectLock", null);
        setBooleanField(term1859791, term1859791.getClass(), "isPacked", false);
        setIntField(term1859791, term1859791.getClass(), "boundsOp", 0);
        setField(term1859791, term1859791.getClass(), "compoundShape", null);
        setField(term1859791, term1859791.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1859791, term1859791.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1859791, term1859791.getClass(), "backgroundEraseDisabled", false);
        setField(term1859791, term1859791.getClass(), "eventCache", null);
        setBooleanField(term1859791, term1859791.getClass(), "coalescingEnabled", false);
        setBooleanField(term1859791, term1859791.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1859791, term1859791.getClass(), "componentSerializedDataVersion", 0);
        setField(term1859791, term1859791.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateMeetingNumbers", argTypes, term1859791, args);
    }

};


