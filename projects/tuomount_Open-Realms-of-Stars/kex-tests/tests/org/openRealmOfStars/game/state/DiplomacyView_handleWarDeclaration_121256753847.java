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
import java.lang.Boolean;

public class DiplomacyView_handleWarDeclaration_121256753847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1817712;
     Object term1817759;

    public DiplomacyView_handleWarDeclaration_121256753847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1817712 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1817712, term1817712.getClass(), "human", null);
        setField(term1817712, term1817712.getClass(), "borderCrossedFleet", null);
        setField(term1817712, term1817712.getClass(), "ai", null);
        setField(term1817712, term1817712.getClass(), "starMap", null);
        setField(term1817712, term1817712.getClass(), "trade", null);
        setField(term1817712, term1817712.getClass(), "humanTechListOffer", null);
        setField(term1817712, term1817712.getClass(), "aiTechListOffer", null);
        setField(term1817712, term1817712.getClass(), "humanFleetListOffer", null);
        setField(term1817712, term1817712.getClass(), "aiFleetListOffer", null);
        setField(term1817712, term1817712.getClass(), "humanPlanetListOffer", null);
        setField(term1817712, term1817712.getClass(), "aiPlanetListOffer", null);
        setField(term1817712, term1817712.getClass(), "humanCreditOffer", null);
        setIntField(term1817712, term1817712.getClass(), "humanCredits", 0);
        setField(term1817712, term1817712.getClass(), "humanArtifactOffer", null);
        setIntField(term1817712, term1817712.getClass(), "humanArtifacts", 0);
        setField(term1817712, term1817712.getClass(), "aiCreditOffer", null);
        setIntField(term1817712, term1817712.getClass(), "aiCredits", 0);
        setField(term1817712, term1817712.getClass(), "aiArtifactOffer", null);
        setIntField(term1817712, term1817712.getClass(), "aiArtifacts", 0);
        setField(term1817712, term1817712.getClass(), "humanLines", null);
        setField(term1817712, term1817712.getClass(), "humanMapPlanetsOffer", null);
        setField(term1817712, term1817712.getClass(), "aiMapPlanetsOffer", null);
        setField(term1817712, term1817712.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1817712, term1817712.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1817712, term1817712.getClass(), "humanMapOffer", null);
        setField(term1817712, term1817712.getClass(), "aiMapOffer", null);
        setField(term1817712, term1817712.getClass(), "humanVoteYes", null);
        setField(term1817712, term1817712.getClass(), "humanVoteNo", null);
        setField(term1817712, term1817712.getClass(), "aiVoteYes", null);
        setField(term1817712, term1817712.getClass(), "aiVoteNo", null);
        setField(term1817712, term1817712.getClass(), "infoText", null);
        setField(term1817712, term1817712.getClass(), "likenessLabel", null);
        setField(term1817712, term1817712.getClass(), "endBtn", null);
        setField(term1817712, term1817712.getClass(), "meetingPlace", null);
        setBooleanField(term1817712, term1817712.getClass(), "tradeHappened", false);
        setField(term1817712, term1817712.getClass(), "aiImg", null);
        setIntField(term1817712, term1817712.getClass(), "textCounter", 0);
        setField(term1817712, term1817712.getClass(), "lastSpeechType", null);
        setField(term1817712, term1817712.getClass(), "embargoLine", null);
        setField(term1817712, term1817712.getClass(), "game", null);
        setBooleanField(term1817712, term1817712.getClass(), "isAlignmentXSet", false);
        setFloatField(term1817712, term1817712.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1817712, term1817712.getClass(), "isAlignmentYSet", false);
        setFloatField(term1817712, term1817712.getClass(), "alignmentY", 0.0F);
        setField(term1817712, term1817712.getClass(), "ui", null);
        setField(term1817712, term1817712.getClass(), "listenerList", null);
        setField(term1817712, term1817712.getClass(), "clientProperties", null);
        setField(term1817712, term1817712.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1817712, term1817712.getClass(), "autoscrolls", false);
        setField(term1817712, term1817712.getClass(), "border", null);
        setIntField(term1817712, term1817712.getClass(), "flags", 0);
        setField(term1817712, term1817712.getClass(), "inputVerifier", null);
        setBooleanField(term1817712, term1817712.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1817712, term1817712.getClass(), "paintingChild", null);
        setField(term1817712, term1817712.getClass(), "popupMenu", null);
        setField(term1817712, term1817712.getClass(), "revalidateRunnableScheduled", null);
        setField(term1817712, term1817712.getClass(), "focusInputMap", null);
        setField(term1817712, term1817712.getClass(), "ancestorInputMap", null);
        setField(term1817712, term1817712.getClass(), "windowInputMap", null);
        setField(term1817712, term1817712.getClass(), "actionMap", null);
        setField(term1817712, term1817712.getClass(), "aaHint", null);
        setField(term1817712, term1817712.getClass(), "lcdRenderingHint", null);
        setField(term1817712, term1817712.getClass(), "component", null);
        setField(term1817712, term1817712.getClass(), "layoutMgr", null);
        setField(term1817712, term1817712.getClass(), "dispatcher", null);
        setField(term1817712, term1817712.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1817712, term1817712.getClass(), "focusCycleRoot", false);
        setBooleanField(term1817712, term1817712.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1817712, term1817712.getClass(), "printingThreads", null);
        setBooleanField(term1817712, term1817712.getClass(), "printing", false);
        setField(term1817712, term1817712.getClass(), "containerListener", null);
        setIntField(term1817712, term1817712.getClass(), "listeningChildren", 0);
        setIntField(term1817712, term1817712.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1817712, term1817712.getClass(), "descendantsCount", 0);
        setField(term1817712, term1817712.getClass(), "preserveBackgroundColor", null);
        setIntField(term1817712, term1817712.getClass(), "numOfHWComponents", 0);
        setIntField(term1817712, term1817712.getClass(), "numOfLWComponents", 0);
        setField(term1817712, term1817712.getClass(), "modalComp", null);
        setField(term1817712, term1817712.getClass(), "modalAppContext", null);
        setIntField(term1817712, term1817712.getClass(), "containerSerializedDataVersion", 0);
        setField(term1817712, term1817712.getClass(), "peer", null);
        setField(term1817712, term1817712.getClass(), "parent", null);
        setField(term1817712, term1817712.getClass(), "appContext", null);
        setIntField(term1817712, term1817712.getClass(), "x", 0);
        setIntField(term1817712, term1817712.getClass(), "y", 0);
        setIntField(term1817712, term1817712.getClass(), "width", 0);
        setIntField(term1817712, term1817712.getClass(), "height", 0);
        setField(term1817712, term1817712.getClass(), "foreground", null);
        setField(term1817712, term1817712.getClass(), "background", null);
        setField(term1817712, term1817712.getClass(), "font", null);
        setField(term1817712, term1817712.getClass(), "peerFont", null);
        setField(term1817712, term1817712.getClass(), "cursor", null);
        setField(term1817712, term1817712.getClass(), "locale", null);
        setField(term1817712, term1817712.getClass(), "graphicsConfig", null);
        setField(term1817712, term1817712.getClass(), "bufferStrategy", null);
        setBooleanField(term1817712, term1817712.getClass(), "ignoreRepaint", false);
        setBooleanField(term1817712, term1817712.getClass(), "visible", false);
        setBooleanField(term1817712, term1817712.getClass(), "enabled", false);
        setBooleanField(term1817712, term1817712.getClass(), "valid", false);
        setField(term1817712, term1817712.getClass(), "dropTarget", null);
        setField(term1817712, term1817712.getClass(), "popups", null);
        setField(term1817712, term1817712.getClass(), "name", null);
        setBooleanField(term1817712, term1817712.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1817712, term1817712.getClass(), "focusable", false);
        setIntField(term1817712, term1817712.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1817712, term1817712.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1817712, term1817712.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1817712, term1817712.getClass(), "acc", null);
        setField(term1817712, term1817712.getClass(), "minSize", null);
        setBooleanField(term1817712, term1817712.getClass(), "minSizeSet", false);
        setField(term1817712, term1817712.getClass(), "prefSize", null);
        setBooleanField(term1817712, term1817712.getClass(), "prefSizeSet", false);
        setField(term1817712, term1817712.getClass(), "maxSize", null);
        setBooleanField(term1817712, term1817712.getClass(), "maxSizeSet", false);
        setField(term1817712, term1817712.getClass(), "componentOrientation", null);
        setBooleanField(term1817712, term1817712.getClass(), "newEventsOnly", false);
        setField(term1817712, term1817712.getClass(), "componentListener", null);
        setField(term1817712, term1817712.getClass(), "focusListener", null);
        setField(term1817712, term1817712.getClass(), "hierarchyListener", null);
        setField(term1817712, term1817712.getClass(), "hierarchyBoundsListener", null);
        setField(term1817712, term1817712.getClass(), "keyListener", null);
        setField(term1817712, term1817712.getClass(), "mouseListener", null);
        setField(term1817712, term1817712.getClass(), "mouseMotionListener", null);
        setField(term1817712, term1817712.getClass(), "mouseWheelListener", null);
        setField(term1817712, term1817712.getClass(), "inputMethodListener", null);
        setLongField(term1817712, term1817712.getClass(), "eventMask", 0L);
        setField(term1817712, term1817712.getClass(), "changeSupport", null);
        setField(term1817712, term1817712.getClass(), "objectLock", null);
        setBooleanField(term1817712, term1817712.getClass(), "isPacked", false);
        setIntField(term1817712, term1817712.getClass(), "boundsOp", 0);
        setField(term1817712, term1817712.getClass(), "compoundShape", null);
        setField(term1817712, term1817712.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1817712, term1817712.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1817712, term1817712.getClass(), "backgroundEraseDisabled", false);
        setField(term1817712, term1817712.getClass(), "eventCache", null);
        setBooleanField(term1817712, term1817712.getClass(), "coalescingEnabled", false);
        setBooleanField(term1817712, term1817712.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1817712, term1817712.getClass(), "componentSerializedDataVersion", 0);
        setField(term1817712, term1817712.getClass(), "accessibleContext", null);
        term1817759 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1817759;
        callMethod(klass, "handleWarDeclaration", argTypes, term1817712, args);
    }

};


