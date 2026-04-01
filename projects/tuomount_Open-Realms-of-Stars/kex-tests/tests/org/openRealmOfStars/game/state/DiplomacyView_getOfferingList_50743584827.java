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
import java.lang.Integer;

public class DiplomacyView_getOfferingList_50743584827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1719619;
     Object term1719666;
     Object term1719668;
     Object term1719670;

    public DiplomacyView_getOfferingList_50743584827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1719619 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1719619, term1719619.getClass(), "human", null);
        setField(term1719619, term1719619.getClass(), "borderCrossedFleet", null);
        setField(term1719619, term1719619.getClass(), "ai", null);
        setField(term1719619, term1719619.getClass(), "starMap", null);
        setField(term1719619, term1719619.getClass(), "trade", null);
        setField(term1719619, term1719619.getClass(), "humanTechListOffer", null);
        setField(term1719619, term1719619.getClass(), "aiTechListOffer", null);
        setField(term1719619, term1719619.getClass(), "humanFleetListOffer", null);
        setField(term1719619, term1719619.getClass(), "aiFleetListOffer", null);
        setField(term1719619, term1719619.getClass(), "humanPlanetListOffer", null);
        setField(term1719619, term1719619.getClass(), "aiPlanetListOffer", null);
        setField(term1719619, term1719619.getClass(), "humanCreditOffer", null);
        setIntField(term1719619, term1719619.getClass(), "humanCredits", 0);
        setField(term1719619, term1719619.getClass(), "humanArtifactOffer", null);
        setIntField(term1719619, term1719619.getClass(), "humanArtifacts", 0);
        setField(term1719619, term1719619.getClass(), "aiCreditOffer", null);
        setIntField(term1719619, term1719619.getClass(), "aiCredits", 0);
        setField(term1719619, term1719619.getClass(), "aiArtifactOffer", null);
        setIntField(term1719619, term1719619.getClass(), "aiArtifacts", 0);
        setField(term1719619, term1719619.getClass(), "humanLines", null);
        setField(term1719619, term1719619.getClass(), "humanMapPlanetsOffer", null);
        setField(term1719619, term1719619.getClass(), "aiMapPlanetsOffer", null);
        setField(term1719619, term1719619.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1719619, term1719619.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1719619, term1719619.getClass(), "humanMapOffer", null);
        setField(term1719619, term1719619.getClass(), "aiMapOffer", null);
        setField(term1719619, term1719619.getClass(), "humanVoteYes", null);
        setField(term1719619, term1719619.getClass(), "humanVoteNo", null);
        setField(term1719619, term1719619.getClass(), "aiVoteYes", null);
        setField(term1719619, term1719619.getClass(), "aiVoteNo", null);
        setField(term1719619, term1719619.getClass(), "infoText", null);
        setField(term1719619, term1719619.getClass(), "likenessLabel", null);
        setField(term1719619, term1719619.getClass(), "endBtn", null);
        setField(term1719619, term1719619.getClass(), "meetingPlace", null);
        setBooleanField(term1719619, term1719619.getClass(), "tradeHappened", false);
        setField(term1719619, term1719619.getClass(), "aiImg", null);
        setIntField(term1719619, term1719619.getClass(), "textCounter", 0);
        setField(term1719619, term1719619.getClass(), "lastSpeechType", null);
        setField(term1719619, term1719619.getClass(), "embargoLine", null);
        setField(term1719619, term1719619.getClass(), "game", null);
        setBooleanField(term1719619, term1719619.getClass(), "isAlignmentXSet", false);
        setFloatField(term1719619, term1719619.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1719619, term1719619.getClass(), "isAlignmentYSet", false);
        setFloatField(term1719619, term1719619.getClass(), "alignmentY", 0.0F);
        setField(term1719619, term1719619.getClass(), "ui", null);
        setField(term1719619, term1719619.getClass(), "listenerList", null);
        setField(term1719619, term1719619.getClass(), "clientProperties", null);
        setField(term1719619, term1719619.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1719619, term1719619.getClass(), "autoscrolls", false);
        setField(term1719619, term1719619.getClass(), "border", null);
        setIntField(term1719619, term1719619.getClass(), "flags", 0);
        setField(term1719619, term1719619.getClass(), "inputVerifier", null);
        setBooleanField(term1719619, term1719619.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1719619, term1719619.getClass(), "paintingChild", null);
        setField(term1719619, term1719619.getClass(), "popupMenu", null);
        setField(term1719619, term1719619.getClass(), "revalidateRunnableScheduled", null);
        setField(term1719619, term1719619.getClass(), "focusInputMap", null);
        setField(term1719619, term1719619.getClass(), "ancestorInputMap", null);
        setField(term1719619, term1719619.getClass(), "windowInputMap", null);
        setField(term1719619, term1719619.getClass(), "actionMap", null);
        setField(term1719619, term1719619.getClass(), "aaHint", null);
        setField(term1719619, term1719619.getClass(), "lcdRenderingHint", null);
        setField(term1719619, term1719619.getClass(), "component", null);
        setField(term1719619, term1719619.getClass(), "layoutMgr", null);
        setField(term1719619, term1719619.getClass(), "dispatcher", null);
        setField(term1719619, term1719619.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1719619, term1719619.getClass(), "focusCycleRoot", false);
        setBooleanField(term1719619, term1719619.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1719619, term1719619.getClass(), "printingThreads", null);
        setBooleanField(term1719619, term1719619.getClass(), "printing", false);
        setField(term1719619, term1719619.getClass(), "containerListener", null);
        setIntField(term1719619, term1719619.getClass(), "listeningChildren", 0);
        setIntField(term1719619, term1719619.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1719619, term1719619.getClass(), "descendantsCount", 0);
        setField(term1719619, term1719619.getClass(), "preserveBackgroundColor", null);
        setIntField(term1719619, term1719619.getClass(), "numOfHWComponents", 0);
        setIntField(term1719619, term1719619.getClass(), "numOfLWComponents", 0);
        setField(term1719619, term1719619.getClass(), "modalComp", null);
        setField(term1719619, term1719619.getClass(), "modalAppContext", null);
        setIntField(term1719619, term1719619.getClass(), "containerSerializedDataVersion", 0);
        setField(term1719619, term1719619.getClass(), "peer", null);
        setField(term1719619, term1719619.getClass(), "parent", null);
        setField(term1719619, term1719619.getClass(), "appContext", null);
        setIntField(term1719619, term1719619.getClass(), "x", 0);
        setIntField(term1719619, term1719619.getClass(), "y", 0);
        setIntField(term1719619, term1719619.getClass(), "width", 0);
        setIntField(term1719619, term1719619.getClass(), "height", 0);
        setField(term1719619, term1719619.getClass(), "foreground", null);
        setField(term1719619, term1719619.getClass(), "background", null);
        setField(term1719619, term1719619.getClass(), "font", null);
        setField(term1719619, term1719619.getClass(), "peerFont", null);
        setField(term1719619, term1719619.getClass(), "cursor", null);
        setField(term1719619, term1719619.getClass(), "locale", null);
        setField(term1719619, term1719619.getClass(), "graphicsConfig", null);
        setField(term1719619, term1719619.getClass(), "bufferStrategy", null);
        setBooleanField(term1719619, term1719619.getClass(), "ignoreRepaint", false);
        setBooleanField(term1719619, term1719619.getClass(), "visible", false);
        setBooleanField(term1719619, term1719619.getClass(), "enabled", false);
        setBooleanField(term1719619, term1719619.getClass(), "valid", false);
        setField(term1719619, term1719619.getClass(), "dropTarget", null);
        setField(term1719619, term1719619.getClass(), "popups", null);
        setField(term1719619, term1719619.getClass(), "name", null);
        setBooleanField(term1719619, term1719619.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1719619, term1719619.getClass(), "focusable", false);
        setIntField(term1719619, term1719619.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1719619, term1719619.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1719619, term1719619.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1719619, term1719619.getClass(), "acc", null);
        setField(term1719619, term1719619.getClass(), "minSize", null);
        setBooleanField(term1719619, term1719619.getClass(), "minSizeSet", false);
        setField(term1719619, term1719619.getClass(), "prefSize", null);
        setBooleanField(term1719619, term1719619.getClass(), "prefSizeSet", false);
        setField(term1719619, term1719619.getClass(), "maxSize", null);
        setBooleanField(term1719619, term1719619.getClass(), "maxSizeSet", false);
        setField(term1719619, term1719619.getClass(), "componentOrientation", null);
        setBooleanField(term1719619, term1719619.getClass(), "newEventsOnly", false);
        setField(term1719619, term1719619.getClass(), "componentListener", null);
        setField(term1719619, term1719619.getClass(), "focusListener", null);
        setField(term1719619, term1719619.getClass(), "hierarchyListener", null);
        setField(term1719619, term1719619.getClass(), "hierarchyBoundsListener", null);
        setField(term1719619, term1719619.getClass(), "keyListener", null);
        setField(term1719619, term1719619.getClass(), "mouseListener", null);
        setField(term1719619, term1719619.getClass(), "mouseMotionListener", null);
        setField(term1719619, term1719619.getClass(), "mouseWheelListener", null);
        setField(term1719619, term1719619.getClass(), "inputMethodListener", null);
        setLongField(term1719619, term1719619.getClass(), "eventMask", 0L);
        setField(term1719619, term1719619.getClass(), "changeSupport", null);
        setField(term1719619, term1719619.getClass(), "objectLock", null);
        setBooleanField(term1719619, term1719619.getClass(), "isPacked", false);
        setIntField(term1719619, term1719619.getClass(), "boundsOp", 0);
        setField(term1719619, term1719619.getClass(), "compoundShape", null);
        setField(term1719619, term1719619.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1719619, term1719619.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1719619, term1719619.getClass(), "backgroundEraseDisabled", false);
        setField(term1719619, term1719619.getClass(), "eventCache", null);
        setBooleanField(term1719619, term1719619.getClass(), "coalescingEnabled", false);
        setBooleanField(term1719619, term1719619.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1719619, term1719619.getClass(), "componentSerializedDataVersion", 0);
        setField(term1719619, term1719619.getClass(), "accessibleContext", null);
        term1719666 = new Integer(0);
        term1719668 = new Integer(0);
        term1719670 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("javax.swing.JList");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationOffer");
        argTypes[3] = Class.forName("javax.swing.JList");
        argTypes[4] = Class.forName("javax.swing.JList");
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = term1719666;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term1719668;
        args[6] = term1719670;
        callMethod(klass, "getOfferingList", argTypes, term1719619, args);
    }

};


