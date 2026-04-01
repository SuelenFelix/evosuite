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

public class DiplomacyView_didTradeHappen_77469747763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1884625;

    public DiplomacyView_didTradeHappen_77469747763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1884625 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1884625, term1884625.getClass(), "human", null);
        setField(term1884625, term1884625.getClass(), "borderCrossedFleet", null);
        setField(term1884625, term1884625.getClass(), "ai", null);
        setField(term1884625, term1884625.getClass(), "starMap", null);
        setField(term1884625, term1884625.getClass(), "trade", null);
        setField(term1884625, term1884625.getClass(), "humanTechListOffer", null);
        setField(term1884625, term1884625.getClass(), "aiTechListOffer", null);
        setField(term1884625, term1884625.getClass(), "humanFleetListOffer", null);
        setField(term1884625, term1884625.getClass(), "aiFleetListOffer", null);
        setField(term1884625, term1884625.getClass(), "humanPlanetListOffer", null);
        setField(term1884625, term1884625.getClass(), "aiPlanetListOffer", null);
        setField(term1884625, term1884625.getClass(), "humanCreditOffer", null);
        setIntField(term1884625, term1884625.getClass(), "humanCredits", 0);
        setField(term1884625, term1884625.getClass(), "humanArtifactOffer", null);
        setIntField(term1884625, term1884625.getClass(), "humanArtifacts", 0);
        setField(term1884625, term1884625.getClass(), "aiCreditOffer", null);
        setIntField(term1884625, term1884625.getClass(), "aiCredits", 0);
        setField(term1884625, term1884625.getClass(), "aiArtifactOffer", null);
        setIntField(term1884625, term1884625.getClass(), "aiArtifacts", 0);
        setField(term1884625, term1884625.getClass(), "humanLines", null);
        setField(term1884625, term1884625.getClass(), "humanMapPlanetsOffer", null);
        setField(term1884625, term1884625.getClass(), "aiMapPlanetsOffer", null);
        setField(term1884625, term1884625.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1884625, term1884625.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1884625, term1884625.getClass(), "humanMapOffer", null);
        setField(term1884625, term1884625.getClass(), "aiMapOffer", null);
        setField(term1884625, term1884625.getClass(), "humanVoteYes", null);
        setField(term1884625, term1884625.getClass(), "humanVoteNo", null);
        setField(term1884625, term1884625.getClass(), "aiVoteYes", null);
        setField(term1884625, term1884625.getClass(), "aiVoteNo", null);
        setField(term1884625, term1884625.getClass(), "infoText", null);
        setField(term1884625, term1884625.getClass(), "likenessLabel", null);
        setField(term1884625, term1884625.getClass(), "endBtn", null);
        setField(term1884625, term1884625.getClass(), "meetingPlace", null);
        setBooleanField(term1884625, term1884625.getClass(), "tradeHappened", false);
        setField(term1884625, term1884625.getClass(), "aiImg", null);
        setIntField(term1884625, term1884625.getClass(), "textCounter", 0);
        setField(term1884625, term1884625.getClass(), "lastSpeechType", null);
        setField(term1884625, term1884625.getClass(), "embargoLine", null);
        setField(term1884625, term1884625.getClass(), "game", null);
        setBooleanField(term1884625, term1884625.getClass(), "isAlignmentXSet", false);
        setFloatField(term1884625, term1884625.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1884625, term1884625.getClass(), "isAlignmentYSet", false);
        setFloatField(term1884625, term1884625.getClass(), "alignmentY", 0.0F);
        setField(term1884625, term1884625.getClass(), "ui", null);
        setField(term1884625, term1884625.getClass(), "listenerList", null);
        setField(term1884625, term1884625.getClass(), "clientProperties", null);
        setField(term1884625, term1884625.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1884625, term1884625.getClass(), "autoscrolls", false);
        setField(term1884625, term1884625.getClass(), "border", null);
        setIntField(term1884625, term1884625.getClass(), "flags", 0);
        setField(term1884625, term1884625.getClass(), "inputVerifier", null);
        setBooleanField(term1884625, term1884625.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1884625, term1884625.getClass(), "paintingChild", null);
        setField(term1884625, term1884625.getClass(), "popupMenu", null);
        setField(term1884625, term1884625.getClass(), "revalidateRunnableScheduled", null);
        setField(term1884625, term1884625.getClass(), "focusInputMap", null);
        setField(term1884625, term1884625.getClass(), "ancestorInputMap", null);
        setField(term1884625, term1884625.getClass(), "windowInputMap", null);
        setField(term1884625, term1884625.getClass(), "actionMap", null);
        setField(term1884625, term1884625.getClass(), "aaHint", null);
        setField(term1884625, term1884625.getClass(), "lcdRenderingHint", null);
        setField(term1884625, term1884625.getClass(), "component", null);
        setField(term1884625, term1884625.getClass(), "layoutMgr", null);
        setField(term1884625, term1884625.getClass(), "dispatcher", null);
        setField(term1884625, term1884625.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1884625, term1884625.getClass(), "focusCycleRoot", false);
        setBooleanField(term1884625, term1884625.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1884625, term1884625.getClass(), "printingThreads", null);
        setBooleanField(term1884625, term1884625.getClass(), "printing", false);
        setField(term1884625, term1884625.getClass(), "containerListener", null);
        setIntField(term1884625, term1884625.getClass(), "listeningChildren", 0);
        setIntField(term1884625, term1884625.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1884625, term1884625.getClass(), "descendantsCount", 0);
        setField(term1884625, term1884625.getClass(), "preserveBackgroundColor", null);
        setIntField(term1884625, term1884625.getClass(), "numOfHWComponents", 0);
        setIntField(term1884625, term1884625.getClass(), "numOfLWComponents", 0);
        setField(term1884625, term1884625.getClass(), "modalComp", null);
        setField(term1884625, term1884625.getClass(), "modalAppContext", null);
        setIntField(term1884625, term1884625.getClass(), "containerSerializedDataVersion", 0);
        setField(term1884625, term1884625.getClass(), "peer", null);
        setField(term1884625, term1884625.getClass(), "parent", null);
        setField(term1884625, term1884625.getClass(), "appContext", null);
        setIntField(term1884625, term1884625.getClass(), "x", 0);
        setIntField(term1884625, term1884625.getClass(), "y", 0);
        setIntField(term1884625, term1884625.getClass(), "width", 0);
        setIntField(term1884625, term1884625.getClass(), "height", 0);
        setField(term1884625, term1884625.getClass(), "foreground", null);
        setField(term1884625, term1884625.getClass(), "background", null);
        setField(term1884625, term1884625.getClass(), "font", null);
        setField(term1884625, term1884625.getClass(), "peerFont", null);
        setField(term1884625, term1884625.getClass(), "cursor", null);
        setField(term1884625, term1884625.getClass(), "locale", null);
        setField(term1884625, term1884625.getClass(), "graphicsConfig", null);
        setField(term1884625, term1884625.getClass(), "bufferStrategy", null);
        setBooleanField(term1884625, term1884625.getClass(), "ignoreRepaint", false);
        setBooleanField(term1884625, term1884625.getClass(), "visible", false);
        setBooleanField(term1884625, term1884625.getClass(), "enabled", false);
        setBooleanField(term1884625, term1884625.getClass(), "valid", false);
        setField(term1884625, term1884625.getClass(), "dropTarget", null);
        setField(term1884625, term1884625.getClass(), "popups", null);
        setField(term1884625, term1884625.getClass(), "name", null);
        setBooleanField(term1884625, term1884625.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1884625, term1884625.getClass(), "focusable", false);
        setIntField(term1884625, term1884625.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1884625, term1884625.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1884625, term1884625.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1884625, term1884625.getClass(), "acc", null);
        setField(term1884625, term1884625.getClass(), "minSize", null);
        setBooleanField(term1884625, term1884625.getClass(), "minSizeSet", false);
        setField(term1884625, term1884625.getClass(), "prefSize", null);
        setBooleanField(term1884625, term1884625.getClass(), "prefSizeSet", false);
        setField(term1884625, term1884625.getClass(), "maxSize", null);
        setBooleanField(term1884625, term1884625.getClass(), "maxSizeSet", false);
        setField(term1884625, term1884625.getClass(), "componentOrientation", null);
        setBooleanField(term1884625, term1884625.getClass(), "newEventsOnly", false);
        setField(term1884625, term1884625.getClass(), "componentListener", null);
        setField(term1884625, term1884625.getClass(), "focusListener", null);
        setField(term1884625, term1884625.getClass(), "hierarchyListener", null);
        setField(term1884625, term1884625.getClass(), "hierarchyBoundsListener", null);
        setField(term1884625, term1884625.getClass(), "keyListener", null);
        setField(term1884625, term1884625.getClass(), "mouseListener", null);
        setField(term1884625, term1884625.getClass(), "mouseMotionListener", null);
        setField(term1884625, term1884625.getClass(), "mouseWheelListener", null);
        setField(term1884625, term1884625.getClass(), "inputMethodListener", null);
        setLongField(term1884625, term1884625.getClass(), "eventMask", 0L);
        setField(term1884625, term1884625.getClass(), "changeSupport", null);
        setField(term1884625, term1884625.getClass(), "objectLock", null);
        setBooleanField(term1884625, term1884625.getClass(), "isPacked", false);
        setIntField(term1884625, term1884625.getClass(), "boundsOp", 0);
        setField(term1884625, term1884625.getClass(), "compoundShape", null);
        setField(term1884625, term1884625.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1884625, term1884625.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1884625, term1884625.getClass(), "backgroundEraseDisabled", false);
        setField(term1884625, term1884625.getClass(), "eventCache", null);
        setBooleanField(term1884625, term1884625.getClass(), "coalescingEnabled", false);
        setBooleanField(term1884625, term1884625.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1884625, term1884625.getClass(), "componentSerializedDataVersion", 0);
        setField(term1884625, term1884625.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "didTradeHappen", argTypes, term1884625, args);
    }

};


