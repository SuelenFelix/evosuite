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

public class PlanetBombingView_skipAnimation_57813983349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153436;

    public PlanetBombingView_skipAnimation_57813983349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153436 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term153436, term153436.getClass(), "totalPeople", null);
        setField(term153436, term153436.getClass(), "troopsPower", null);
        setField(term153436, term153436.getClass(), "defenseTurret", null);
        setField(term153436, term153436.getClass(), "totalBuildings", null);
        setField(term153436, term153436.getClass(), "ownerLabel", null);
        setField(term153436, term153436.getClass(), "planet", null);
        setField(term153436, term153436.getClass(), "fleet", null);
        setIntField(term153436, term153436.getClass(), "suppressionFire", 0);
        setField(term153436, term153436.getClass(), "shipsInFleet", null);
        setField(term153436, term153436.getClass(), "imgBase", null);
        setField(term153436, term153436.getClass(), "infoPanel", null);
        setField(term153436, term153436.getClass(), "textArea", null);
        setField(term153436, term153436.getClass(), "textLogger", null);
        setField(term153436, term153436.getClass(), "componentUsed", null);
        setIntField(term153436, term153436.getClass(), "shipIndex", 0);
        setIntField(term153436, term153436.getClass(), "usedComponentIndex", 0);
        setField(term153436, term153436.getClass(), "attacker", null);
        setIntField(term153436, term153436.getClass(), "attackPlayerIndex", 0);
        setField(term153436, term153436.getClass(), "defender", null);
        setIntField(term153436, term153436.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term153436, term153436.getClass(), "aiControlled", false);
        setBooleanField(term153436, term153436.getClass(), "allAi", false);
        setField(term153436, term153436.getClass(), "endButton", null);
        setBooleanField(term153436, term153436.getClass(), "aiOneAttackFound", false);
        setBooleanField(term153436, term153436.getClass(), "aiExitLoop", false);
        setBooleanField(term153436, term153436.getClass(), "aiTroops", false);
        setIntField(term153436, term153436.getClass(), "aiDelays", 0);
        setIntField(term153436, term153436.getClass(), "aiComponentIndex", 0);
        setField(term153436, term153436.getClass(), "starMap", null);
        setField(term153436, term153436.getClass(), "game", null);
        setField(term153436, term153436.getClass(), "nuked", null);
        setField(term153436, term153436.getClass(), "newsData", null);
        setField(term153436, term153436.getClass(), "bombers", null);
        setBooleanField(term153436, term153436.getClass(), "actionSpent", false);
        setIntField(term153436, term153436.getClass(), "whatHappened", 0);
        setBooleanField(term153436, term153436.getClass(), "isAlignmentXSet", false);
        setFloatField(term153436, term153436.getClass(), "alignmentX", 0.0F);
        setBooleanField(term153436, term153436.getClass(), "isAlignmentYSet", false);
        setFloatField(term153436, term153436.getClass(), "alignmentY", 0.0F);
        setField(term153436, term153436.getClass(), "ui", null);
        setField(term153436, term153436.getClass(), "listenerList", null);
        setField(term153436, term153436.getClass(), "clientProperties", null);
        setField(term153436, term153436.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term153436, term153436.getClass(), "autoscrolls", false);
        setField(term153436, term153436.getClass(), "border", null);
        setIntField(term153436, term153436.getClass(), "flags", 0);
        setField(term153436, term153436.getClass(), "inputVerifier", null);
        setBooleanField(term153436, term153436.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term153436, term153436.getClass(), "paintingChild", null);
        setField(term153436, term153436.getClass(), "popupMenu", null);
        setField(term153436, term153436.getClass(), "revalidateRunnableScheduled", null);
        setField(term153436, term153436.getClass(), "focusInputMap", null);
        setField(term153436, term153436.getClass(), "ancestorInputMap", null);
        setField(term153436, term153436.getClass(), "windowInputMap", null);
        setField(term153436, term153436.getClass(), "actionMap", null);
        setField(term153436, term153436.getClass(), "aaHint", null);
        setField(term153436, term153436.getClass(), "lcdRenderingHint", null);
        setField(term153436, term153436.getClass(), "component", null);
        setField(term153436, term153436.getClass(), "layoutMgr", null);
        setField(term153436, term153436.getClass(), "dispatcher", null);
        setField(term153436, term153436.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term153436, term153436.getClass(), "focusCycleRoot", false);
        setBooleanField(term153436, term153436.getClass(), "focusTraversalPolicyProvider", false);
        setField(term153436, term153436.getClass(), "printingThreads", null);
        setBooleanField(term153436, term153436.getClass(), "printing", false);
        setField(term153436, term153436.getClass(), "containerListener", null);
        setIntField(term153436, term153436.getClass(), "listeningChildren", 0);
        setIntField(term153436, term153436.getClass(), "listeningBoundsChildren", 0);
        setIntField(term153436, term153436.getClass(), "descendantsCount", 0);
        setField(term153436, term153436.getClass(), "preserveBackgroundColor", null);
        setIntField(term153436, term153436.getClass(), "numOfHWComponents", 0);
        setIntField(term153436, term153436.getClass(), "numOfLWComponents", 0);
        setField(term153436, term153436.getClass(), "modalComp", null);
        setField(term153436, term153436.getClass(), "modalAppContext", null);
        setIntField(term153436, term153436.getClass(), "containerSerializedDataVersion", 0);
        setField(term153436, term153436.getClass(), "peer", null);
        setField(term153436, term153436.getClass(), "parent", null);
        setField(term153436, term153436.getClass(), "appContext", null);
        setIntField(term153436, term153436.getClass(), "x", 0);
        setIntField(term153436, term153436.getClass(), "y", 0);
        setIntField(term153436, term153436.getClass(), "width", 0);
        setIntField(term153436, term153436.getClass(), "height", 0);
        setField(term153436, term153436.getClass(), "foreground", null);
        setField(term153436, term153436.getClass(), "background", null);
        setField(term153436, term153436.getClass(), "font", null);
        setField(term153436, term153436.getClass(), "peerFont", null);
        setField(term153436, term153436.getClass(), "cursor", null);
        setField(term153436, term153436.getClass(), "locale", null);
        setField(term153436, term153436.getClass(), "graphicsConfig", null);
        setField(term153436, term153436.getClass(), "bufferStrategy", null);
        setBooleanField(term153436, term153436.getClass(), "ignoreRepaint", false);
        setBooleanField(term153436, term153436.getClass(), "visible", false);
        setBooleanField(term153436, term153436.getClass(), "enabled", false);
        setBooleanField(term153436, term153436.getClass(), "valid", false);
        setField(term153436, term153436.getClass(), "dropTarget", null);
        setField(term153436, term153436.getClass(), "popups", null);
        setField(term153436, term153436.getClass(), "name", null);
        setBooleanField(term153436, term153436.getClass(), "nameExplicitlySet", false);
        setBooleanField(term153436, term153436.getClass(), "focusable", false);
        setIntField(term153436, term153436.getClass(), "isFocusTraversableOverridden", 0);
        setField(term153436, term153436.getClass(), "focusTraversalKeys", null);
        setBooleanField(term153436, term153436.getClass(), "focusTraversalKeysEnabled", false);
        setField(term153436, term153436.getClass(), "acc", null);
        setField(term153436, term153436.getClass(), "minSize", null);
        setBooleanField(term153436, term153436.getClass(), "minSizeSet", false);
        setField(term153436, term153436.getClass(), "prefSize", null);
        setBooleanField(term153436, term153436.getClass(), "prefSizeSet", false);
        setField(term153436, term153436.getClass(), "maxSize", null);
        setBooleanField(term153436, term153436.getClass(), "maxSizeSet", false);
        setField(term153436, term153436.getClass(), "componentOrientation", null);
        setBooleanField(term153436, term153436.getClass(), "newEventsOnly", false);
        setField(term153436, term153436.getClass(), "componentListener", null);
        setField(term153436, term153436.getClass(), "focusListener", null);
        setField(term153436, term153436.getClass(), "hierarchyListener", null);
        setField(term153436, term153436.getClass(), "hierarchyBoundsListener", null);
        setField(term153436, term153436.getClass(), "keyListener", null);
        setField(term153436, term153436.getClass(), "mouseListener", null);
        setField(term153436, term153436.getClass(), "mouseMotionListener", null);
        setField(term153436, term153436.getClass(), "mouseWheelListener", null);
        setField(term153436, term153436.getClass(), "inputMethodListener", null);
        setLongField(term153436, term153436.getClass(), "eventMask", 0L);
        setField(term153436, term153436.getClass(), "changeSupport", null);
        setField(term153436, term153436.getClass(), "objectLock", null);
        setBooleanField(term153436, term153436.getClass(), "isPacked", false);
        setIntField(term153436, term153436.getClass(), "boundsOp", 0);
        setField(term153436, term153436.getClass(), "compoundShape", null);
        setField(term153436, term153436.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term153436, term153436.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term153436, term153436.getClass(), "backgroundEraseDisabled", false);
        setField(term153436, term153436.getClass(), "eventCache", null);
        setBooleanField(term153436, term153436.getClass(), "coalescingEnabled", false);
        setBooleanField(term153436, term153436.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term153436, term153436.getClass(), "componentSerializedDataVersion", 0);
        setField(term153436, term153436.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipAnimation", argTypes, term153436, args);
    }

};


