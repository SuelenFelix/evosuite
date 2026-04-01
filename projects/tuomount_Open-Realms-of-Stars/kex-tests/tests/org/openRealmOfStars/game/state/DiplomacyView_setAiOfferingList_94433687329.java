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

public class DiplomacyView_setAiOfferingList_94433687329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1727699;

    public DiplomacyView_setAiOfferingList_94433687329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1727699 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1727699, term1727699.getClass(), "human", null);
        setField(term1727699, term1727699.getClass(), "borderCrossedFleet", null);
        setField(term1727699, term1727699.getClass(), "ai", null);
        setField(term1727699, term1727699.getClass(), "starMap", null);
        setField(term1727699, term1727699.getClass(), "trade", null);
        setField(term1727699, term1727699.getClass(), "humanTechListOffer", null);
        setField(term1727699, term1727699.getClass(), "aiTechListOffer", null);
        setField(term1727699, term1727699.getClass(), "humanFleetListOffer", null);
        setField(term1727699, term1727699.getClass(), "aiFleetListOffer", null);
        setField(term1727699, term1727699.getClass(), "humanPlanetListOffer", null);
        setField(term1727699, term1727699.getClass(), "aiPlanetListOffer", null);
        setField(term1727699, term1727699.getClass(), "humanCreditOffer", null);
        setIntField(term1727699, term1727699.getClass(), "humanCredits", 0);
        setField(term1727699, term1727699.getClass(), "humanArtifactOffer", null);
        setIntField(term1727699, term1727699.getClass(), "humanArtifacts", 0);
        setField(term1727699, term1727699.getClass(), "aiCreditOffer", null);
        setIntField(term1727699, term1727699.getClass(), "aiCredits", 0);
        setField(term1727699, term1727699.getClass(), "aiArtifactOffer", null);
        setIntField(term1727699, term1727699.getClass(), "aiArtifacts", 0);
        setField(term1727699, term1727699.getClass(), "humanLines", null);
        setField(term1727699, term1727699.getClass(), "humanMapPlanetsOffer", null);
        setField(term1727699, term1727699.getClass(), "aiMapPlanetsOffer", null);
        setField(term1727699, term1727699.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1727699, term1727699.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1727699, term1727699.getClass(), "humanMapOffer", null);
        setField(term1727699, term1727699.getClass(), "aiMapOffer", null);
        setField(term1727699, term1727699.getClass(), "humanVoteYes", null);
        setField(term1727699, term1727699.getClass(), "humanVoteNo", null);
        setField(term1727699, term1727699.getClass(), "aiVoteYes", null);
        setField(term1727699, term1727699.getClass(), "aiVoteNo", null);
        setField(term1727699, term1727699.getClass(), "infoText", null);
        setField(term1727699, term1727699.getClass(), "likenessLabel", null);
        setField(term1727699, term1727699.getClass(), "endBtn", null);
        setField(term1727699, term1727699.getClass(), "meetingPlace", null);
        setBooleanField(term1727699, term1727699.getClass(), "tradeHappened", false);
        setField(term1727699, term1727699.getClass(), "aiImg", null);
        setIntField(term1727699, term1727699.getClass(), "textCounter", 0);
        setField(term1727699, term1727699.getClass(), "lastSpeechType", null);
        setField(term1727699, term1727699.getClass(), "embargoLine", null);
        setField(term1727699, term1727699.getClass(), "game", null);
        setBooleanField(term1727699, term1727699.getClass(), "isAlignmentXSet", false);
        setFloatField(term1727699, term1727699.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1727699, term1727699.getClass(), "isAlignmentYSet", false);
        setFloatField(term1727699, term1727699.getClass(), "alignmentY", 0.0F);
        setField(term1727699, term1727699.getClass(), "ui", null);
        setField(term1727699, term1727699.getClass(), "listenerList", null);
        setField(term1727699, term1727699.getClass(), "clientProperties", null);
        setField(term1727699, term1727699.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1727699, term1727699.getClass(), "autoscrolls", false);
        setField(term1727699, term1727699.getClass(), "border", null);
        setIntField(term1727699, term1727699.getClass(), "flags", 0);
        setField(term1727699, term1727699.getClass(), "inputVerifier", null);
        setBooleanField(term1727699, term1727699.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1727699, term1727699.getClass(), "paintingChild", null);
        setField(term1727699, term1727699.getClass(), "popupMenu", null);
        setField(term1727699, term1727699.getClass(), "revalidateRunnableScheduled", null);
        setField(term1727699, term1727699.getClass(), "focusInputMap", null);
        setField(term1727699, term1727699.getClass(), "ancestorInputMap", null);
        setField(term1727699, term1727699.getClass(), "windowInputMap", null);
        setField(term1727699, term1727699.getClass(), "actionMap", null);
        setField(term1727699, term1727699.getClass(), "aaHint", null);
        setField(term1727699, term1727699.getClass(), "lcdRenderingHint", null);
        setField(term1727699, term1727699.getClass(), "component", null);
        setField(term1727699, term1727699.getClass(), "layoutMgr", null);
        setField(term1727699, term1727699.getClass(), "dispatcher", null);
        setField(term1727699, term1727699.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1727699, term1727699.getClass(), "focusCycleRoot", false);
        setBooleanField(term1727699, term1727699.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1727699, term1727699.getClass(), "printingThreads", null);
        setBooleanField(term1727699, term1727699.getClass(), "printing", false);
        setField(term1727699, term1727699.getClass(), "containerListener", null);
        setIntField(term1727699, term1727699.getClass(), "listeningChildren", 0);
        setIntField(term1727699, term1727699.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1727699, term1727699.getClass(), "descendantsCount", 0);
        setField(term1727699, term1727699.getClass(), "preserveBackgroundColor", null);
        setIntField(term1727699, term1727699.getClass(), "numOfHWComponents", 0);
        setIntField(term1727699, term1727699.getClass(), "numOfLWComponents", 0);
        setField(term1727699, term1727699.getClass(), "modalComp", null);
        setField(term1727699, term1727699.getClass(), "modalAppContext", null);
        setIntField(term1727699, term1727699.getClass(), "containerSerializedDataVersion", 0);
        setField(term1727699, term1727699.getClass(), "peer", null);
        setField(term1727699, term1727699.getClass(), "parent", null);
        setField(term1727699, term1727699.getClass(), "appContext", null);
        setIntField(term1727699, term1727699.getClass(), "x", 0);
        setIntField(term1727699, term1727699.getClass(), "y", 0);
        setIntField(term1727699, term1727699.getClass(), "width", 0);
        setIntField(term1727699, term1727699.getClass(), "height", 0);
        setField(term1727699, term1727699.getClass(), "foreground", null);
        setField(term1727699, term1727699.getClass(), "background", null);
        setField(term1727699, term1727699.getClass(), "font", null);
        setField(term1727699, term1727699.getClass(), "peerFont", null);
        setField(term1727699, term1727699.getClass(), "cursor", null);
        setField(term1727699, term1727699.getClass(), "locale", null);
        setField(term1727699, term1727699.getClass(), "graphicsConfig", null);
        setField(term1727699, term1727699.getClass(), "bufferStrategy", null);
        setBooleanField(term1727699, term1727699.getClass(), "ignoreRepaint", false);
        setBooleanField(term1727699, term1727699.getClass(), "visible", false);
        setBooleanField(term1727699, term1727699.getClass(), "enabled", false);
        setBooleanField(term1727699, term1727699.getClass(), "valid", false);
        setField(term1727699, term1727699.getClass(), "dropTarget", null);
        setField(term1727699, term1727699.getClass(), "popups", null);
        setField(term1727699, term1727699.getClass(), "name", null);
        setBooleanField(term1727699, term1727699.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1727699, term1727699.getClass(), "focusable", false);
        setIntField(term1727699, term1727699.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1727699, term1727699.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1727699, term1727699.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1727699, term1727699.getClass(), "acc", null);
        setField(term1727699, term1727699.getClass(), "minSize", null);
        setBooleanField(term1727699, term1727699.getClass(), "minSizeSet", false);
        setField(term1727699, term1727699.getClass(), "prefSize", null);
        setBooleanField(term1727699, term1727699.getClass(), "prefSizeSet", false);
        setField(term1727699, term1727699.getClass(), "maxSize", null);
        setBooleanField(term1727699, term1727699.getClass(), "maxSizeSet", false);
        setField(term1727699, term1727699.getClass(), "componentOrientation", null);
        setBooleanField(term1727699, term1727699.getClass(), "newEventsOnly", false);
        setField(term1727699, term1727699.getClass(), "componentListener", null);
        setField(term1727699, term1727699.getClass(), "focusListener", null);
        setField(term1727699, term1727699.getClass(), "hierarchyListener", null);
        setField(term1727699, term1727699.getClass(), "hierarchyBoundsListener", null);
        setField(term1727699, term1727699.getClass(), "keyListener", null);
        setField(term1727699, term1727699.getClass(), "mouseListener", null);
        setField(term1727699, term1727699.getClass(), "mouseMotionListener", null);
        setField(term1727699, term1727699.getClass(), "mouseWheelListener", null);
        setField(term1727699, term1727699.getClass(), "inputMethodListener", null);
        setLongField(term1727699, term1727699.getClass(), "eventMask", 0L);
        setField(term1727699, term1727699.getClass(), "changeSupport", null);
        setField(term1727699, term1727699.getClass(), "objectLock", null);
        setBooleanField(term1727699, term1727699.getClass(), "isPacked", false);
        setIntField(term1727699, term1727699.getClass(), "boundsOp", 0);
        setField(term1727699, term1727699.getClass(), "compoundShape", null);
        setField(term1727699, term1727699.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1727699, term1727699.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1727699, term1727699.getClass(), "backgroundEraseDisabled", false);
        setField(term1727699, term1727699.getClass(), "eventCache", null);
        setBooleanField(term1727699, term1727699.getClass(), "coalescingEnabled", false);
        setBooleanField(term1727699, term1727699.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1727699, term1727699.getClass(), "componentSerializedDataVersion", 0);
        setField(term1727699, term1727699.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAiOfferingList", argTypes, term1727699, args);
    }

};


