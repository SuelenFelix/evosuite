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

public class DiplomacyView_setHumanOfferingList_161330992831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1735807;

    public DiplomacyView_setHumanOfferingList_161330992831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1735807 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1735807, term1735807.getClass(), "human", null);
        setField(term1735807, term1735807.getClass(), "borderCrossedFleet", null);
        setField(term1735807, term1735807.getClass(), "ai", null);
        setField(term1735807, term1735807.getClass(), "starMap", null);
        setField(term1735807, term1735807.getClass(), "trade", null);
        setField(term1735807, term1735807.getClass(), "humanTechListOffer", null);
        setField(term1735807, term1735807.getClass(), "aiTechListOffer", null);
        setField(term1735807, term1735807.getClass(), "humanFleetListOffer", null);
        setField(term1735807, term1735807.getClass(), "aiFleetListOffer", null);
        setField(term1735807, term1735807.getClass(), "humanPlanetListOffer", null);
        setField(term1735807, term1735807.getClass(), "aiPlanetListOffer", null);
        setField(term1735807, term1735807.getClass(), "humanCreditOffer", null);
        setIntField(term1735807, term1735807.getClass(), "humanCredits", 0);
        setField(term1735807, term1735807.getClass(), "humanArtifactOffer", null);
        setIntField(term1735807, term1735807.getClass(), "humanArtifacts", 0);
        setField(term1735807, term1735807.getClass(), "aiCreditOffer", null);
        setIntField(term1735807, term1735807.getClass(), "aiCredits", 0);
        setField(term1735807, term1735807.getClass(), "aiArtifactOffer", null);
        setIntField(term1735807, term1735807.getClass(), "aiArtifacts", 0);
        setField(term1735807, term1735807.getClass(), "humanLines", null);
        setField(term1735807, term1735807.getClass(), "humanMapPlanetsOffer", null);
        setField(term1735807, term1735807.getClass(), "aiMapPlanetsOffer", null);
        setField(term1735807, term1735807.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1735807, term1735807.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1735807, term1735807.getClass(), "humanMapOffer", null);
        setField(term1735807, term1735807.getClass(), "aiMapOffer", null);
        setField(term1735807, term1735807.getClass(), "humanVoteYes", null);
        setField(term1735807, term1735807.getClass(), "humanVoteNo", null);
        setField(term1735807, term1735807.getClass(), "aiVoteYes", null);
        setField(term1735807, term1735807.getClass(), "aiVoteNo", null);
        setField(term1735807, term1735807.getClass(), "infoText", null);
        setField(term1735807, term1735807.getClass(), "likenessLabel", null);
        setField(term1735807, term1735807.getClass(), "endBtn", null);
        setField(term1735807, term1735807.getClass(), "meetingPlace", null);
        setBooleanField(term1735807, term1735807.getClass(), "tradeHappened", false);
        setField(term1735807, term1735807.getClass(), "aiImg", null);
        setIntField(term1735807, term1735807.getClass(), "textCounter", 0);
        setField(term1735807, term1735807.getClass(), "lastSpeechType", null);
        setField(term1735807, term1735807.getClass(), "embargoLine", null);
        setField(term1735807, term1735807.getClass(), "game", null);
        setBooleanField(term1735807, term1735807.getClass(), "isAlignmentXSet", false);
        setFloatField(term1735807, term1735807.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1735807, term1735807.getClass(), "isAlignmentYSet", false);
        setFloatField(term1735807, term1735807.getClass(), "alignmentY", 0.0F);
        setField(term1735807, term1735807.getClass(), "ui", null);
        setField(term1735807, term1735807.getClass(), "listenerList", null);
        setField(term1735807, term1735807.getClass(), "clientProperties", null);
        setField(term1735807, term1735807.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1735807, term1735807.getClass(), "autoscrolls", false);
        setField(term1735807, term1735807.getClass(), "border", null);
        setIntField(term1735807, term1735807.getClass(), "flags", 0);
        setField(term1735807, term1735807.getClass(), "inputVerifier", null);
        setBooleanField(term1735807, term1735807.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1735807, term1735807.getClass(), "paintingChild", null);
        setField(term1735807, term1735807.getClass(), "popupMenu", null);
        setField(term1735807, term1735807.getClass(), "revalidateRunnableScheduled", null);
        setField(term1735807, term1735807.getClass(), "focusInputMap", null);
        setField(term1735807, term1735807.getClass(), "ancestorInputMap", null);
        setField(term1735807, term1735807.getClass(), "windowInputMap", null);
        setField(term1735807, term1735807.getClass(), "actionMap", null);
        setField(term1735807, term1735807.getClass(), "aaHint", null);
        setField(term1735807, term1735807.getClass(), "lcdRenderingHint", null);
        setField(term1735807, term1735807.getClass(), "component", null);
        setField(term1735807, term1735807.getClass(), "layoutMgr", null);
        setField(term1735807, term1735807.getClass(), "dispatcher", null);
        setField(term1735807, term1735807.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1735807, term1735807.getClass(), "focusCycleRoot", false);
        setBooleanField(term1735807, term1735807.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1735807, term1735807.getClass(), "printingThreads", null);
        setBooleanField(term1735807, term1735807.getClass(), "printing", false);
        setField(term1735807, term1735807.getClass(), "containerListener", null);
        setIntField(term1735807, term1735807.getClass(), "listeningChildren", 0);
        setIntField(term1735807, term1735807.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1735807, term1735807.getClass(), "descendantsCount", 0);
        setField(term1735807, term1735807.getClass(), "preserveBackgroundColor", null);
        setIntField(term1735807, term1735807.getClass(), "numOfHWComponents", 0);
        setIntField(term1735807, term1735807.getClass(), "numOfLWComponents", 0);
        setField(term1735807, term1735807.getClass(), "modalComp", null);
        setField(term1735807, term1735807.getClass(), "modalAppContext", null);
        setIntField(term1735807, term1735807.getClass(), "containerSerializedDataVersion", 0);
        setField(term1735807, term1735807.getClass(), "peer", null);
        setField(term1735807, term1735807.getClass(), "parent", null);
        setField(term1735807, term1735807.getClass(), "appContext", null);
        setIntField(term1735807, term1735807.getClass(), "x", 0);
        setIntField(term1735807, term1735807.getClass(), "y", 0);
        setIntField(term1735807, term1735807.getClass(), "width", 0);
        setIntField(term1735807, term1735807.getClass(), "height", 0);
        setField(term1735807, term1735807.getClass(), "foreground", null);
        setField(term1735807, term1735807.getClass(), "background", null);
        setField(term1735807, term1735807.getClass(), "font", null);
        setField(term1735807, term1735807.getClass(), "peerFont", null);
        setField(term1735807, term1735807.getClass(), "cursor", null);
        setField(term1735807, term1735807.getClass(), "locale", null);
        setField(term1735807, term1735807.getClass(), "graphicsConfig", null);
        setField(term1735807, term1735807.getClass(), "bufferStrategy", null);
        setBooleanField(term1735807, term1735807.getClass(), "ignoreRepaint", false);
        setBooleanField(term1735807, term1735807.getClass(), "visible", false);
        setBooleanField(term1735807, term1735807.getClass(), "enabled", false);
        setBooleanField(term1735807, term1735807.getClass(), "valid", false);
        setField(term1735807, term1735807.getClass(), "dropTarget", null);
        setField(term1735807, term1735807.getClass(), "popups", null);
        setField(term1735807, term1735807.getClass(), "name", null);
        setBooleanField(term1735807, term1735807.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1735807, term1735807.getClass(), "focusable", false);
        setIntField(term1735807, term1735807.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1735807, term1735807.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1735807, term1735807.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1735807, term1735807.getClass(), "acc", null);
        setField(term1735807, term1735807.getClass(), "minSize", null);
        setBooleanField(term1735807, term1735807.getClass(), "minSizeSet", false);
        setField(term1735807, term1735807.getClass(), "prefSize", null);
        setBooleanField(term1735807, term1735807.getClass(), "prefSizeSet", false);
        setField(term1735807, term1735807.getClass(), "maxSize", null);
        setBooleanField(term1735807, term1735807.getClass(), "maxSizeSet", false);
        setField(term1735807, term1735807.getClass(), "componentOrientation", null);
        setBooleanField(term1735807, term1735807.getClass(), "newEventsOnly", false);
        setField(term1735807, term1735807.getClass(), "componentListener", null);
        setField(term1735807, term1735807.getClass(), "focusListener", null);
        setField(term1735807, term1735807.getClass(), "hierarchyListener", null);
        setField(term1735807, term1735807.getClass(), "hierarchyBoundsListener", null);
        setField(term1735807, term1735807.getClass(), "keyListener", null);
        setField(term1735807, term1735807.getClass(), "mouseListener", null);
        setField(term1735807, term1735807.getClass(), "mouseMotionListener", null);
        setField(term1735807, term1735807.getClass(), "mouseWheelListener", null);
        setField(term1735807, term1735807.getClass(), "inputMethodListener", null);
        setLongField(term1735807, term1735807.getClass(), "eventMask", 0L);
        setField(term1735807, term1735807.getClass(), "changeSupport", null);
        setField(term1735807, term1735807.getClass(), "objectLock", null);
        setBooleanField(term1735807, term1735807.getClass(), "isPacked", false);
        setIntField(term1735807, term1735807.getClass(), "boundsOp", 0);
        setField(term1735807, term1735807.getClass(), "compoundShape", null);
        setField(term1735807, term1735807.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1735807, term1735807.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1735807, term1735807.getClass(), "backgroundEraseDisabled", false);
        setField(term1735807, term1735807.getClass(), "eventCache", null);
        setBooleanField(term1735807, term1735807.getClass(), "coalescingEnabled", false);
        setBooleanField(term1735807, term1735807.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1735807, term1735807.getClass(), "componentSerializedDataVersion", 0);
        setField(term1735807, term1735807.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHumanOfferingList", argTypes, term1735807, args);
    }

};


