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

public class DiplomacyView_updatePanel_157756522225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1701410;

    public DiplomacyView_updatePanel_157756522225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1701410 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1701410, term1701410.getClass(), "human", null);
        setField(term1701410, term1701410.getClass(), "borderCrossedFleet", null);
        setField(term1701410, term1701410.getClass(), "ai", null);
        setField(term1701410, term1701410.getClass(), "starMap", null);
        setField(term1701410, term1701410.getClass(), "trade", null);
        setField(term1701410, term1701410.getClass(), "humanTechListOffer", null);
        setField(term1701410, term1701410.getClass(), "aiTechListOffer", null);
        setField(term1701410, term1701410.getClass(), "humanFleetListOffer", null);
        setField(term1701410, term1701410.getClass(), "aiFleetListOffer", null);
        setField(term1701410, term1701410.getClass(), "humanPlanetListOffer", null);
        setField(term1701410, term1701410.getClass(), "aiPlanetListOffer", null);
        setField(term1701410, term1701410.getClass(), "humanCreditOffer", null);
        setIntField(term1701410, term1701410.getClass(), "humanCredits", 0);
        setField(term1701410, term1701410.getClass(), "humanArtifactOffer", null);
        setIntField(term1701410, term1701410.getClass(), "humanArtifacts", 0);
        setField(term1701410, term1701410.getClass(), "aiCreditOffer", null);
        setIntField(term1701410, term1701410.getClass(), "aiCredits", 0);
        setField(term1701410, term1701410.getClass(), "aiArtifactOffer", null);
        setIntField(term1701410, term1701410.getClass(), "aiArtifacts", 0);
        setField(term1701410, term1701410.getClass(), "humanLines", null);
        setField(term1701410, term1701410.getClass(), "humanMapPlanetsOffer", null);
        setField(term1701410, term1701410.getClass(), "aiMapPlanetsOffer", null);
        setField(term1701410, term1701410.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1701410, term1701410.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1701410, term1701410.getClass(), "humanMapOffer", null);
        setField(term1701410, term1701410.getClass(), "aiMapOffer", null);
        setField(term1701410, term1701410.getClass(), "humanVoteYes", null);
        setField(term1701410, term1701410.getClass(), "humanVoteNo", null);
        setField(term1701410, term1701410.getClass(), "aiVoteYes", null);
        setField(term1701410, term1701410.getClass(), "aiVoteNo", null);
        setField(term1701410, term1701410.getClass(), "infoText", null);
        setField(term1701410, term1701410.getClass(), "likenessLabel", null);
        setField(term1701410, term1701410.getClass(), "endBtn", null);
        setField(term1701410, term1701410.getClass(), "meetingPlace", null);
        setBooleanField(term1701410, term1701410.getClass(), "tradeHappened", false);
        setField(term1701410, term1701410.getClass(), "aiImg", null);
        setIntField(term1701410, term1701410.getClass(), "textCounter", 0);
        setField(term1701410, term1701410.getClass(), "lastSpeechType", null);
        setField(term1701410, term1701410.getClass(), "embargoLine", null);
        setField(term1701410, term1701410.getClass(), "game", null);
        setBooleanField(term1701410, term1701410.getClass(), "isAlignmentXSet", false);
        setFloatField(term1701410, term1701410.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1701410, term1701410.getClass(), "isAlignmentYSet", false);
        setFloatField(term1701410, term1701410.getClass(), "alignmentY", 0.0F);
        setField(term1701410, term1701410.getClass(), "ui", null);
        setField(term1701410, term1701410.getClass(), "listenerList", null);
        setField(term1701410, term1701410.getClass(), "clientProperties", null);
        setField(term1701410, term1701410.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1701410, term1701410.getClass(), "autoscrolls", false);
        setField(term1701410, term1701410.getClass(), "border", null);
        setIntField(term1701410, term1701410.getClass(), "flags", 0);
        setField(term1701410, term1701410.getClass(), "inputVerifier", null);
        setBooleanField(term1701410, term1701410.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1701410, term1701410.getClass(), "paintingChild", null);
        setField(term1701410, term1701410.getClass(), "popupMenu", null);
        setField(term1701410, term1701410.getClass(), "revalidateRunnableScheduled", null);
        setField(term1701410, term1701410.getClass(), "focusInputMap", null);
        setField(term1701410, term1701410.getClass(), "ancestorInputMap", null);
        setField(term1701410, term1701410.getClass(), "windowInputMap", null);
        setField(term1701410, term1701410.getClass(), "actionMap", null);
        setField(term1701410, term1701410.getClass(), "aaHint", null);
        setField(term1701410, term1701410.getClass(), "lcdRenderingHint", null);
        setField(term1701410, term1701410.getClass(), "component", null);
        setField(term1701410, term1701410.getClass(), "layoutMgr", null);
        setField(term1701410, term1701410.getClass(), "dispatcher", null);
        setField(term1701410, term1701410.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1701410, term1701410.getClass(), "focusCycleRoot", false);
        setBooleanField(term1701410, term1701410.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1701410, term1701410.getClass(), "printingThreads", null);
        setBooleanField(term1701410, term1701410.getClass(), "printing", false);
        setField(term1701410, term1701410.getClass(), "containerListener", null);
        setIntField(term1701410, term1701410.getClass(), "listeningChildren", 0);
        setIntField(term1701410, term1701410.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1701410, term1701410.getClass(), "descendantsCount", 0);
        setField(term1701410, term1701410.getClass(), "preserveBackgroundColor", null);
        setIntField(term1701410, term1701410.getClass(), "numOfHWComponents", 0);
        setIntField(term1701410, term1701410.getClass(), "numOfLWComponents", 0);
        setField(term1701410, term1701410.getClass(), "modalComp", null);
        setField(term1701410, term1701410.getClass(), "modalAppContext", null);
        setIntField(term1701410, term1701410.getClass(), "containerSerializedDataVersion", 0);
        setField(term1701410, term1701410.getClass(), "peer", null);
        setField(term1701410, term1701410.getClass(), "parent", null);
        setField(term1701410, term1701410.getClass(), "appContext", null);
        setIntField(term1701410, term1701410.getClass(), "x", 0);
        setIntField(term1701410, term1701410.getClass(), "y", 0);
        setIntField(term1701410, term1701410.getClass(), "width", 0);
        setIntField(term1701410, term1701410.getClass(), "height", 0);
        setField(term1701410, term1701410.getClass(), "foreground", null);
        setField(term1701410, term1701410.getClass(), "background", null);
        setField(term1701410, term1701410.getClass(), "font", null);
        setField(term1701410, term1701410.getClass(), "peerFont", null);
        setField(term1701410, term1701410.getClass(), "cursor", null);
        setField(term1701410, term1701410.getClass(), "locale", null);
        setField(term1701410, term1701410.getClass(), "graphicsConfig", null);
        setField(term1701410, term1701410.getClass(), "bufferStrategy", null);
        setBooleanField(term1701410, term1701410.getClass(), "ignoreRepaint", false);
        setBooleanField(term1701410, term1701410.getClass(), "visible", false);
        setBooleanField(term1701410, term1701410.getClass(), "enabled", false);
        setBooleanField(term1701410, term1701410.getClass(), "valid", false);
        setField(term1701410, term1701410.getClass(), "dropTarget", null);
        setField(term1701410, term1701410.getClass(), "popups", null);
        setField(term1701410, term1701410.getClass(), "name", null);
        setBooleanField(term1701410, term1701410.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1701410, term1701410.getClass(), "focusable", false);
        setIntField(term1701410, term1701410.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1701410, term1701410.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1701410, term1701410.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1701410, term1701410.getClass(), "acc", null);
        setField(term1701410, term1701410.getClass(), "minSize", null);
        setBooleanField(term1701410, term1701410.getClass(), "minSizeSet", false);
        setField(term1701410, term1701410.getClass(), "prefSize", null);
        setBooleanField(term1701410, term1701410.getClass(), "prefSizeSet", false);
        setField(term1701410, term1701410.getClass(), "maxSize", null);
        setBooleanField(term1701410, term1701410.getClass(), "maxSizeSet", false);
        setField(term1701410, term1701410.getClass(), "componentOrientation", null);
        setBooleanField(term1701410, term1701410.getClass(), "newEventsOnly", false);
        setField(term1701410, term1701410.getClass(), "componentListener", null);
        setField(term1701410, term1701410.getClass(), "focusListener", null);
        setField(term1701410, term1701410.getClass(), "hierarchyListener", null);
        setField(term1701410, term1701410.getClass(), "hierarchyBoundsListener", null);
        setField(term1701410, term1701410.getClass(), "keyListener", null);
        setField(term1701410, term1701410.getClass(), "mouseListener", null);
        setField(term1701410, term1701410.getClass(), "mouseMotionListener", null);
        setField(term1701410, term1701410.getClass(), "mouseWheelListener", null);
        setField(term1701410, term1701410.getClass(), "inputMethodListener", null);
        setLongField(term1701410, term1701410.getClass(), "eventMask", 0L);
        setField(term1701410, term1701410.getClass(), "changeSupport", null);
        setField(term1701410, term1701410.getClass(), "objectLock", null);
        setBooleanField(term1701410, term1701410.getClass(), "isPacked", false);
        setIntField(term1701410, term1701410.getClass(), "boundsOp", 0);
        setField(term1701410, term1701410.getClass(), "compoundShape", null);
        setField(term1701410, term1701410.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1701410, term1701410.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1701410, term1701410.getClass(), "backgroundEraseDisabled", false);
        setField(term1701410, term1701410.getClass(), "eventCache", null);
        setBooleanField(term1701410, term1701410.getClass(), "coalescingEnabled", false);
        setBooleanField(term1701410, term1701410.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1701410, term1701410.getClass(), "componentSerializedDataVersion", 0);
        setField(term1701410, term1701410.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "updatePanel", argTypes, term1701410, args);
    }

};


