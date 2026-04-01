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

public class PlanetBombingView_getPlanet_171532255313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108685;

    public PlanetBombingView_getPlanet_171532255313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108685 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term108685, term108685.getClass(), "totalPeople", null);
        setField(term108685, term108685.getClass(), "troopsPower", null);
        setField(term108685, term108685.getClass(), "defenseTurret", null);
        setField(term108685, term108685.getClass(), "totalBuildings", null);
        setField(term108685, term108685.getClass(), "ownerLabel", null);
        setField(term108685, term108685.getClass(), "planet", null);
        setField(term108685, term108685.getClass(), "fleet", null);
        setIntField(term108685, term108685.getClass(), "suppressionFire", 0);
        setField(term108685, term108685.getClass(), "shipsInFleet", null);
        setField(term108685, term108685.getClass(), "imgBase", null);
        setField(term108685, term108685.getClass(), "infoPanel", null);
        setField(term108685, term108685.getClass(), "textArea", null);
        setField(term108685, term108685.getClass(), "textLogger", null);
        setField(term108685, term108685.getClass(), "componentUsed", null);
        setIntField(term108685, term108685.getClass(), "shipIndex", 0);
        setIntField(term108685, term108685.getClass(), "usedComponentIndex", 0);
        setField(term108685, term108685.getClass(), "attacker", null);
        setIntField(term108685, term108685.getClass(), "attackPlayerIndex", 0);
        setField(term108685, term108685.getClass(), "defender", null);
        setIntField(term108685, term108685.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term108685, term108685.getClass(), "aiControlled", false);
        setBooleanField(term108685, term108685.getClass(), "allAi", false);
        setField(term108685, term108685.getClass(), "endButton", null);
        setBooleanField(term108685, term108685.getClass(), "aiOneAttackFound", false);
        setBooleanField(term108685, term108685.getClass(), "aiExitLoop", false);
        setBooleanField(term108685, term108685.getClass(), "aiTroops", false);
        setIntField(term108685, term108685.getClass(), "aiDelays", 0);
        setIntField(term108685, term108685.getClass(), "aiComponentIndex", 0);
        setField(term108685, term108685.getClass(), "starMap", null);
        setField(term108685, term108685.getClass(), "game", null);
        setField(term108685, term108685.getClass(), "nuked", null);
        setField(term108685, term108685.getClass(), "newsData", null);
        setField(term108685, term108685.getClass(), "bombers", null);
        setBooleanField(term108685, term108685.getClass(), "actionSpent", false);
        setIntField(term108685, term108685.getClass(), "whatHappened", 0);
        setBooleanField(term108685, term108685.getClass(), "isAlignmentXSet", false);
        setFloatField(term108685, term108685.getClass(), "alignmentX", 0.0F);
        setBooleanField(term108685, term108685.getClass(), "isAlignmentYSet", false);
        setFloatField(term108685, term108685.getClass(), "alignmentY", 0.0F);
        setField(term108685, term108685.getClass(), "ui", null);
        setField(term108685, term108685.getClass(), "listenerList", null);
        setField(term108685, term108685.getClass(), "clientProperties", null);
        setField(term108685, term108685.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term108685, term108685.getClass(), "autoscrolls", false);
        setField(term108685, term108685.getClass(), "border", null);
        setIntField(term108685, term108685.getClass(), "flags", 0);
        setField(term108685, term108685.getClass(), "inputVerifier", null);
        setBooleanField(term108685, term108685.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term108685, term108685.getClass(), "paintingChild", null);
        setField(term108685, term108685.getClass(), "popupMenu", null);
        setField(term108685, term108685.getClass(), "revalidateRunnableScheduled", null);
        setField(term108685, term108685.getClass(), "focusInputMap", null);
        setField(term108685, term108685.getClass(), "ancestorInputMap", null);
        setField(term108685, term108685.getClass(), "windowInputMap", null);
        setField(term108685, term108685.getClass(), "actionMap", null);
        setField(term108685, term108685.getClass(), "aaHint", null);
        setField(term108685, term108685.getClass(), "lcdRenderingHint", null);
        setField(term108685, term108685.getClass(), "component", null);
        setField(term108685, term108685.getClass(), "layoutMgr", null);
        setField(term108685, term108685.getClass(), "dispatcher", null);
        setField(term108685, term108685.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term108685, term108685.getClass(), "focusCycleRoot", false);
        setBooleanField(term108685, term108685.getClass(), "focusTraversalPolicyProvider", false);
        setField(term108685, term108685.getClass(), "printingThreads", null);
        setBooleanField(term108685, term108685.getClass(), "printing", false);
        setField(term108685, term108685.getClass(), "containerListener", null);
        setIntField(term108685, term108685.getClass(), "listeningChildren", 0);
        setIntField(term108685, term108685.getClass(), "listeningBoundsChildren", 0);
        setIntField(term108685, term108685.getClass(), "descendantsCount", 0);
        setField(term108685, term108685.getClass(), "preserveBackgroundColor", null);
        setIntField(term108685, term108685.getClass(), "numOfHWComponents", 0);
        setIntField(term108685, term108685.getClass(), "numOfLWComponents", 0);
        setField(term108685, term108685.getClass(), "modalComp", null);
        setField(term108685, term108685.getClass(), "modalAppContext", null);
        setIntField(term108685, term108685.getClass(), "containerSerializedDataVersion", 0);
        setField(term108685, term108685.getClass(), "peer", null);
        setField(term108685, term108685.getClass(), "parent", null);
        setField(term108685, term108685.getClass(), "appContext", null);
        setIntField(term108685, term108685.getClass(), "x", 0);
        setIntField(term108685, term108685.getClass(), "y", 0);
        setIntField(term108685, term108685.getClass(), "width", 0);
        setIntField(term108685, term108685.getClass(), "height", 0);
        setField(term108685, term108685.getClass(), "foreground", null);
        setField(term108685, term108685.getClass(), "background", null);
        setField(term108685, term108685.getClass(), "font", null);
        setField(term108685, term108685.getClass(), "peerFont", null);
        setField(term108685, term108685.getClass(), "cursor", null);
        setField(term108685, term108685.getClass(), "locale", null);
        setField(term108685, term108685.getClass(), "graphicsConfig", null);
        setField(term108685, term108685.getClass(), "bufferStrategy", null);
        setBooleanField(term108685, term108685.getClass(), "ignoreRepaint", false);
        setBooleanField(term108685, term108685.getClass(), "visible", false);
        setBooleanField(term108685, term108685.getClass(), "enabled", false);
        setBooleanField(term108685, term108685.getClass(), "valid", false);
        setField(term108685, term108685.getClass(), "dropTarget", null);
        setField(term108685, term108685.getClass(), "popups", null);
        setField(term108685, term108685.getClass(), "name", null);
        setBooleanField(term108685, term108685.getClass(), "nameExplicitlySet", false);
        setBooleanField(term108685, term108685.getClass(), "focusable", false);
        setIntField(term108685, term108685.getClass(), "isFocusTraversableOverridden", 0);
        setField(term108685, term108685.getClass(), "focusTraversalKeys", null);
        setBooleanField(term108685, term108685.getClass(), "focusTraversalKeysEnabled", false);
        setField(term108685, term108685.getClass(), "acc", null);
        setField(term108685, term108685.getClass(), "minSize", null);
        setBooleanField(term108685, term108685.getClass(), "minSizeSet", false);
        setField(term108685, term108685.getClass(), "prefSize", null);
        setBooleanField(term108685, term108685.getClass(), "prefSizeSet", false);
        setField(term108685, term108685.getClass(), "maxSize", null);
        setBooleanField(term108685, term108685.getClass(), "maxSizeSet", false);
        setField(term108685, term108685.getClass(), "componentOrientation", null);
        setBooleanField(term108685, term108685.getClass(), "newEventsOnly", false);
        setField(term108685, term108685.getClass(), "componentListener", null);
        setField(term108685, term108685.getClass(), "focusListener", null);
        setField(term108685, term108685.getClass(), "hierarchyListener", null);
        setField(term108685, term108685.getClass(), "hierarchyBoundsListener", null);
        setField(term108685, term108685.getClass(), "keyListener", null);
        setField(term108685, term108685.getClass(), "mouseListener", null);
        setField(term108685, term108685.getClass(), "mouseMotionListener", null);
        setField(term108685, term108685.getClass(), "mouseWheelListener", null);
        setField(term108685, term108685.getClass(), "inputMethodListener", null);
        setLongField(term108685, term108685.getClass(), "eventMask", 0L);
        setField(term108685, term108685.getClass(), "changeSupport", null);
        setField(term108685, term108685.getClass(), "objectLock", null);
        setBooleanField(term108685, term108685.getClass(), "isPacked", false);
        setIntField(term108685, term108685.getClass(), "boundsOp", 0);
        setField(term108685, term108685.getClass(), "compoundShape", null);
        setField(term108685, term108685.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term108685, term108685.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term108685, term108685.getClass(), "backgroundEraseDisabled", false);
        setField(term108685, term108685.getClass(), "eventCache", null);
        setBooleanField(term108685, term108685.getClass(), "coalescingEnabled", false);
        setBooleanField(term108685, term108685.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term108685, term108685.getClass(), "componentSerializedDataVersion", 0);
        setField(term108685, term108685.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanet", argTypes, term108685, args);
    }

};


