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

public class PlanetBombingView_setPlanet_144704900515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116407;

    public PlanetBombingView_setPlanet_144704900515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116407 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term116407, term116407.getClass(), "totalPeople", null);
        setField(term116407, term116407.getClass(), "troopsPower", null);
        setField(term116407, term116407.getClass(), "defenseTurret", null);
        setField(term116407, term116407.getClass(), "totalBuildings", null);
        setField(term116407, term116407.getClass(), "ownerLabel", null);
        setField(term116407, term116407.getClass(), "planet", null);
        setField(term116407, term116407.getClass(), "fleet", null);
        setIntField(term116407, term116407.getClass(), "suppressionFire", 0);
        setField(term116407, term116407.getClass(), "shipsInFleet", null);
        setField(term116407, term116407.getClass(), "imgBase", null);
        setField(term116407, term116407.getClass(), "infoPanel", null);
        setField(term116407, term116407.getClass(), "textArea", null);
        setField(term116407, term116407.getClass(), "textLogger", null);
        setField(term116407, term116407.getClass(), "componentUsed", null);
        setIntField(term116407, term116407.getClass(), "shipIndex", 0);
        setIntField(term116407, term116407.getClass(), "usedComponentIndex", 0);
        setField(term116407, term116407.getClass(), "attacker", null);
        setIntField(term116407, term116407.getClass(), "attackPlayerIndex", 0);
        setField(term116407, term116407.getClass(), "defender", null);
        setIntField(term116407, term116407.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term116407, term116407.getClass(), "aiControlled", false);
        setBooleanField(term116407, term116407.getClass(), "allAi", false);
        setField(term116407, term116407.getClass(), "endButton", null);
        setBooleanField(term116407, term116407.getClass(), "aiOneAttackFound", false);
        setBooleanField(term116407, term116407.getClass(), "aiExitLoop", false);
        setBooleanField(term116407, term116407.getClass(), "aiTroops", false);
        setIntField(term116407, term116407.getClass(), "aiDelays", 0);
        setIntField(term116407, term116407.getClass(), "aiComponentIndex", 0);
        setField(term116407, term116407.getClass(), "starMap", null);
        setField(term116407, term116407.getClass(), "game", null);
        setField(term116407, term116407.getClass(), "nuked", null);
        setField(term116407, term116407.getClass(), "newsData", null);
        setField(term116407, term116407.getClass(), "bombers", null);
        setBooleanField(term116407, term116407.getClass(), "actionSpent", false);
        setIntField(term116407, term116407.getClass(), "whatHappened", 0);
        setBooleanField(term116407, term116407.getClass(), "isAlignmentXSet", false);
        setFloatField(term116407, term116407.getClass(), "alignmentX", 0.0F);
        setBooleanField(term116407, term116407.getClass(), "isAlignmentYSet", false);
        setFloatField(term116407, term116407.getClass(), "alignmentY", 0.0F);
        setField(term116407, term116407.getClass(), "ui", null);
        setField(term116407, term116407.getClass(), "listenerList", null);
        setField(term116407, term116407.getClass(), "clientProperties", null);
        setField(term116407, term116407.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term116407, term116407.getClass(), "autoscrolls", false);
        setField(term116407, term116407.getClass(), "border", null);
        setIntField(term116407, term116407.getClass(), "flags", 0);
        setField(term116407, term116407.getClass(), "inputVerifier", null);
        setBooleanField(term116407, term116407.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term116407, term116407.getClass(), "paintingChild", null);
        setField(term116407, term116407.getClass(), "popupMenu", null);
        setField(term116407, term116407.getClass(), "revalidateRunnableScheduled", null);
        setField(term116407, term116407.getClass(), "focusInputMap", null);
        setField(term116407, term116407.getClass(), "ancestorInputMap", null);
        setField(term116407, term116407.getClass(), "windowInputMap", null);
        setField(term116407, term116407.getClass(), "actionMap", null);
        setField(term116407, term116407.getClass(), "aaHint", null);
        setField(term116407, term116407.getClass(), "lcdRenderingHint", null);
        setField(term116407, term116407.getClass(), "component", null);
        setField(term116407, term116407.getClass(), "layoutMgr", null);
        setField(term116407, term116407.getClass(), "dispatcher", null);
        setField(term116407, term116407.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term116407, term116407.getClass(), "focusCycleRoot", false);
        setBooleanField(term116407, term116407.getClass(), "focusTraversalPolicyProvider", false);
        setField(term116407, term116407.getClass(), "printingThreads", null);
        setBooleanField(term116407, term116407.getClass(), "printing", false);
        setField(term116407, term116407.getClass(), "containerListener", null);
        setIntField(term116407, term116407.getClass(), "listeningChildren", 0);
        setIntField(term116407, term116407.getClass(), "listeningBoundsChildren", 0);
        setIntField(term116407, term116407.getClass(), "descendantsCount", 0);
        setField(term116407, term116407.getClass(), "preserveBackgroundColor", null);
        setIntField(term116407, term116407.getClass(), "numOfHWComponents", 0);
        setIntField(term116407, term116407.getClass(), "numOfLWComponents", 0);
        setField(term116407, term116407.getClass(), "modalComp", null);
        setField(term116407, term116407.getClass(), "modalAppContext", null);
        setIntField(term116407, term116407.getClass(), "containerSerializedDataVersion", 0);
        setField(term116407, term116407.getClass(), "peer", null);
        setField(term116407, term116407.getClass(), "parent", null);
        setField(term116407, term116407.getClass(), "appContext", null);
        setIntField(term116407, term116407.getClass(), "x", 0);
        setIntField(term116407, term116407.getClass(), "y", 0);
        setIntField(term116407, term116407.getClass(), "width", 0);
        setIntField(term116407, term116407.getClass(), "height", 0);
        setField(term116407, term116407.getClass(), "foreground", null);
        setField(term116407, term116407.getClass(), "background", null);
        setField(term116407, term116407.getClass(), "font", null);
        setField(term116407, term116407.getClass(), "peerFont", null);
        setField(term116407, term116407.getClass(), "cursor", null);
        setField(term116407, term116407.getClass(), "locale", null);
        setField(term116407, term116407.getClass(), "graphicsConfig", null);
        setField(term116407, term116407.getClass(), "bufferStrategy", null);
        setBooleanField(term116407, term116407.getClass(), "ignoreRepaint", false);
        setBooleanField(term116407, term116407.getClass(), "visible", false);
        setBooleanField(term116407, term116407.getClass(), "enabled", false);
        setBooleanField(term116407, term116407.getClass(), "valid", false);
        setField(term116407, term116407.getClass(), "dropTarget", null);
        setField(term116407, term116407.getClass(), "popups", null);
        setField(term116407, term116407.getClass(), "name", null);
        setBooleanField(term116407, term116407.getClass(), "nameExplicitlySet", false);
        setBooleanField(term116407, term116407.getClass(), "focusable", false);
        setIntField(term116407, term116407.getClass(), "isFocusTraversableOverridden", 0);
        setField(term116407, term116407.getClass(), "focusTraversalKeys", null);
        setBooleanField(term116407, term116407.getClass(), "focusTraversalKeysEnabled", false);
        setField(term116407, term116407.getClass(), "acc", null);
        setField(term116407, term116407.getClass(), "minSize", null);
        setBooleanField(term116407, term116407.getClass(), "minSizeSet", false);
        setField(term116407, term116407.getClass(), "prefSize", null);
        setBooleanField(term116407, term116407.getClass(), "prefSizeSet", false);
        setField(term116407, term116407.getClass(), "maxSize", null);
        setBooleanField(term116407, term116407.getClass(), "maxSizeSet", false);
        setField(term116407, term116407.getClass(), "componentOrientation", null);
        setBooleanField(term116407, term116407.getClass(), "newEventsOnly", false);
        setField(term116407, term116407.getClass(), "componentListener", null);
        setField(term116407, term116407.getClass(), "focusListener", null);
        setField(term116407, term116407.getClass(), "hierarchyListener", null);
        setField(term116407, term116407.getClass(), "hierarchyBoundsListener", null);
        setField(term116407, term116407.getClass(), "keyListener", null);
        setField(term116407, term116407.getClass(), "mouseListener", null);
        setField(term116407, term116407.getClass(), "mouseMotionListener", null);
        setField(term116407, term116407.getClass(), "mouseWheelListener", null);
        setField(term116407, term116407.getClass(), "inputMethodListener", null);
        setLongField(term116407, term116407.getClass(), "eventMask", 0L);
        setField(term116407, term116407.getClass(), "changeSupport", null);
        setField(term116407, term116407.getClass(), "objectLock", null);
        setBooleanField(term116407, term116407.getClass(), "isPacked", false);
        setIntField(term116407, term116407.getClass(), "boundsOp", 0);
        setField(term116407, term116407.getClass(), "compoundShape", null);
        setField(term116407, term116407.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term116407, term116407.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term116407, term116407.getClass(), "backgroundEraseDisabled", false);
        setField(term116407, term116407.getClass(), "eventCache", null);
        setBooleanField(term116407, term116407.getClass(), "coalescingEnabled", false);
        setBooleanField(term116407, term116407.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term116407, term116407.getClass(), "componentSerializedDataVersion", 0);
        setField(term116407, term116407.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlanet", argTypes, term116407, args);
    }

};


