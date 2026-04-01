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

public class DiplomacyView_addNothingToTrade_142400935965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1892995;

    public DiplomacyView_addNothingToTrade_142400935965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1892995 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1892995, term1892995.getClass(), "human", null);
        setField(term1892995, term1892995.getClass(), "borderCrossedFleet", null);
        setField(term1892995, term1892995.getClass(), "ai", null);
        setField(term1892995, term1892995.getClass(), "starMap", null);
        setField(term1892995, term1892995.getClass(), "trade", null);
        setField(term1892995, term1892995.getClass(), "humanTechListOffer", null);
        setField(term1892995, term1892995.getClass(), "aiTechListOffer", null);
        setField(term1892995, term1892995.getClass(), "humanFleetListOffer", null);
        setField(term1892995, term1892995.getClass(), "aiFleetListOffer", null);
        setField(term1892995, term1892995.getClass(), "humanPlanetListOffer", null);
        setField(term1892995, term1892995.getClass(), "aiPlanetListOffer", null);
        setField(term1892995, term1892995.getClass(), "humanCreditOffer", null);
        setIntField(term1892995, term1892995.getClass(), "humanCredits", 0);
        setField(term1892995, term1892995.getClass(), "humanArtifactOffer", null);
        setIntField(term1892995, term1892995.getClass(), "humanArtifacts", 0);
        setField(term1892995, term1892995.getClass(), "aiCreditOffer", null);
        setIntField(term1892995, term1892995.getClass(), "aiCredits", 0);
        setField(term1892995, term1892995.getClass(), "aiArtifactOffer", null);
        setIntField(term1892995, term1892995.getClass(), "aiArtifacts", 0);
        setField(term1892995, term1892995.getClass(), "humanLines", null);
        setField(term1892995, term1892995.getClass(), "humanMapPlanetsOffer", null);
        setField(term1892995, term1892995.getClass(), "aiMapPlanetsOffer", null);
        setField(term1892995, term1892995.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1892995, term1892995.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1892995, term1892995.getClass(), "humanMapOffer", null);
        setField(term1892995, term1892995.getClass(), "aiMapOffer", null);
        setField(term1892995, term1892995.getClass(), "humanVoteYes", null);
        setField(term1892995, term1892995.getClass(), "humanVoteNo", null);
        setField(term1892995, term1892995.getClass(), "aiVoteYes", null);
        setField(term1892995, term1892995.getClass(), "aiVoteNo", null);
        setField(term1892995, term1892995.getClass(), "infoText", null);
        setField(term1892995, term1892995.getClass(), "likenessLabel", null);
        setField(term1892995, term1892995.getClass(), "endBtn", null);
        setField(term1892995, term1892995.getClass(), "meetingPlace", null);
        setBooleanField(term1892995, term1892995.getClass(), "tradeHappened", false);
        setField(term1892995, term1892995.getClass(), "aiImg", null);
        setIntField(term1892995, term1892995.getClass(), "textCounter", 0);
        setField(term1892995, term1892995.getClass(), "lastSpeechType", null);
        setField(term1892995, term1892995.getClass(), "embargoLine", null);
        setField(term1892995, term1892995.getClass(), "game", null);
        setBooleanField(term1892995, term1892995.getClass(), "isAlignmentXSet", false);
        setFloatField(term1892995, term1892995.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1892995, term1892995.getClass(), "isAlignmentYSet", false);
        setFloatField(term1892995, term1892995.getClass(), "alignmentY", 0.0F);
        setField(term1892995, term1892995.getClass(), "ui", null);
        setField(term1892995, term1892995.getClass(), "listenerList", null);
        setField(term1892995, term1892995.getClass(), "clientProperties", null);
        setField(term1892995, term1892995.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1892995, term1892995.getClass(), "autoscrolls", false);
        setField(term1892995, term1892995.getClass(), "border", null);
        setIntField(term1892995, term1892995.getClass(), "flags", 0);
        setField(term1892995, term1892995.getClass(), "inputVerifier", null);
        setBooleanField(term1892995, term1892995.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1892995, term1892995.getClass(), "paintingChild", null);
        setField(term1892995, term1892995.getClass(), "popupMenu", null);
        setField(term1892995, term1892995.getClass(), "revalidateRunnableScheduled", null);
        setField(term1892995, term1892995.getClass(), "focusInputMap", null);
        setField(term1892995, term1892995.getClass(), "ancestorInputMap", null);
        setField(term1892995, term1892995.getClass(), "windowInputMap", null);
        setField(term1892995, term1892995.getClass(), "actionMap", null);
        setField(term1892995, term1892995.getClass(), "aaHint", null);
        setField(term1892995, term1892995.getClass(), "lcdRenderingHint", null);
        setField(term1892995, term1892995.getClass(), "component", null);
        setField(term1892995, term1892995.getClass(), "layoutMgr", null);
        setField(term1892995, term1892995.getClass(), "dispatcher", null);
        setField(term1892995, term1892995.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1892995, term1892995.getClass(), "focusCycleRoot", false);
        setBooleanField(term1892995, term1892995.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1892995, term1892995.getClass(), "printingThreads", null);
        setBooleanField(term1892995, term1892995.getClass(), "printing", false);
        setField(term1892995, term1892995.getClass(), "containerListener", null);
        setIntField(term1892995, term1892995.getClass(), "listeningChildren", 0);
        setIntField(term1892995, term1892995.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1892995, term1892995.getClass(), "descendantsCount", 0);
        setField(term1892995, term1892995.getClass(), "preserveBackgroundColor", null);
        setIntField(term1892995, term1892995.getClass(), "numOfHWComponents", 0);
        setIntField(term1892995, term1892995.getClass(), "numOfLWComponents", 0);
        setField(term1892995, term1892995.getClass(), "modalComp", null);
        setField(term1892995, term1892995.getClass(), "modalAppContext", null);
        setIntField(term1892995, term1892995.getClass(), "containerSerializedDataVersion", 0);
        setField(term1892995, term1892995.getClass(), "peer", null);
        setField(term1892995, term1892995.getClass(), "parent", null);
        setField(term1892995, term1892995.getClass(), "appContext", null);
        setIntField(term1892995, term1892995.getClass(), "x", 0);
        setIntField(term1892995, term1892995.getClass(), "y", 0);
        setIntField(term1892995, term1892995.getClass(), "width", 0);
        setIntField(term1892995, term1892995.getClass(), "height", 0);
        setField(term1892995, term1892995.getClass(), "foreground", null);
        setField(term1892995, term1892995.getClass(), "background", null);
        setField(term1892995, term1892995.getClass(), "font", null);
        setField(term1892995, term1892995.getClass(), "peerFont", null);
        setField(term1892995, term1892995.getClass(), "cursor", null);
        setField(term1892995, term1892995.getClass(), "locale", null);
        setField(term1892995, term1892995.getClass(), "graphicsConfig", null);
        setField(term1892995, term1892995.getClass(), "bufferStrategy", null);
        setBooleanField(term1892995, term1892995.getClass(), "ignoreRepaint", false);
        setBooleanField(term1892995, term1892995.getClass(), "visible", false);
        setBooleanField(term1892995, term1892995.getClass(), "enabled", false);
        setBooleanField(term1892995, term1892995.getClass(), "valid", false);
        setField(term1892995, term1892995.getClass(), "dropTarget", null);
        setField(term1892995, term1892995.getClass(), "popups", null);
        setField(term1892995, term1892995.getClass(), "name", null);
        setBooleanField(term1892995, term1892995.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1892995, term1892995.getClass(), "focusable", false);
        setIntField(term1892995, term1892995.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1892995, term1892995.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1892995, term1892995.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1892995, term1892995.getClass(), "acc", null);
        setField(term1892995, term1892995.getClass(), "minSize", null);
        setBooleanField(term1892995, term1892995.getClass(), "minSizeSet", false);
        setField(term1892995, term1892995.getClass(), "prefSize", null);
        setBooleanField(term1892995, term1892995.getClass(), "prefSizeSet", false);
        setField(term1892995, term1892995.getClass(), "maxSize", null);
        setBooleanField(term1892995, term1892995.getClass(), "maxSizeSet", false);
        setField(term1892995, term1892995.getClass(), "componentOrientation", null);
        setBooleanField(term1892995, term1892995.getClass(), "newEventsOnly", false);
        setField(term1892995, term1892995.getClass(), "componentListener", null);
        setField(term1892995, term1892995.getClass(), "focusListener", null);
        setField(term1892995, term1892995.getClass(), "hierarchyListener", null);
        setField(term1892995, term1892995.getClass(), "hierarchyBoundsListener", null);
        setField(term1892995, term1892995.getClass(), "keyListener", null);
        setField(term1892995, term1892995.getClass(), "mouseListener", null);
        setField(term1892995, term1892995.getClass(), "mouseMotionListener", null);
        setField(term1892995, term1892995.getClass(), "mouseWheelListener", null);
        setField(term1892995, term1892995.getClass(), "inputMethodListener", null);
        setLongField(term1892995, term1892995.getClass(), "eventMask", 0L);
        setField(term1892995, term1892995.getClass(), "changeSupport", null);
        setField(term1892995, term1892995.getClass(), "objectLock", null);
        setBooleanField(term1892995, term1892995.getClass(), "isPacked", false);
        setIntField(term1892995, term1892995.getClass(), "boundsOp", 0);
        setField(term1892995, term1892995.getClass(), "compoundShape", null);
        setField(term1892995, term1892995.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1892995, term1892995.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1892995, term1892995.getClass(), "backgroundEraseDisabled", false);
        setField(term1892995, term1892995.getClass(), "eventCache", null);
        setBooleanField(term1892995, term1892995.getClass(), "coalescingEnabled", false);
        setBooleanField(term1892995, term1892995.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1892995, term1892995.getClass(), "componentSerializedDataVersion", 0);
        setField(term1892995, term1892995.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "addNothingToTrade", argTypes, term1892995, args);
    }

};


