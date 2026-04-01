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

public class PlanetBombingView_attackNuke_80320055829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128383;

    public PlanetBombingView_attackNuke_80320055829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128383 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term128383, term128383.getClass(), "totalPeople", null);
        setField(term128383, term128383.getClass(), "troopsPower", null);
        setField(term128383, term128383.getClass(), "defenseTurret", null);
        setField(term128383, term128383.getClass(), "totalBuildings", null);
        setField(term128383, term128383.getClass(), "ownerLabel", null);
        setField(term128383, term128383.getClass(), "planet", null);
        setField(term128383, term128383.getClass(), "fleet", null);
        setIntField(term128383, term128383.getClass(), "suppressionFire", 0);
        setField(term128383, term128383.getClass(), "shipsInFleet", null);
        setField(term128383, term128383.getClass(), "imgBase", null);
        setField(term128383, term128383.getClass(), "infoPanel", null);
        setField(term128383, term128383.getClass(), "textArea", null);
        setField(term128383, term128383.getClass(), "textLogger", null);
        setField(term128383, term128383.getClass(), "componentUsed", null);
        setIntField(term128383, term128383.getClass(), "shipIndex", 0);
        setIntField(term128383, term128383.getClass(), "usedComponentIndex", 0);
        setField(term128383, term128383.getClass(), "attacker", null);
        setIntField(term128383, term128383.getClass(), "attackPlayerIndex", 0);
        setField(term128383, term128383.getClass(), "defender", null);
        setIntField(term128383, term128383.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term128383, term128383.getClass(), "aiControlled", false);
        setBooleanField(term128383, term128383.getClass(), "allAi", false);
        setField(term128383, term128383.getClass(), "endButton", null);
        setBooleanField(term128383, term128383.getClass(), "aiOneAttackFound", false);
        setBooleanField(term128383, term128383.getClass(), "aiExitLoop", false);
        setBooleanField(term128383, term128383.getClass(), "aiTroops", false);
        setIntField(term128383, term128383.getClass(), "aiDelays", 0);
        setIntField(term128383, term128383.getClass(), "aiComponentIndex", 0);
        setField(term128383, term128383.getClass(), "starMap", null);
        setField(term128383, term128383.getClass(), "game", null);
        setField(term128383, term128383.getClass(), "nuked", null);
        setField(term128383, term128383.getClass(), "newsData", null);
        setField(term128383, term128383.getClass(), "bombers", null);
        setBooleanField(term128383, term128383.getClass(), "actionSpent", false);
        setIntField(term128383, term128383.getClass(), "whatHappened", 0);
        setBooleanField(term128383, term128383.getClass(), "isAlignmentXSet", false);
        setFloatField(term128383, term128383.getClass(), "alignmentX", 0.0F);
        setBooleanField(term128383, term128383.getClass(), "isAlignmentYSet", false);
        setFloatField(term128383, term128383.getClass(), "alignmentY", 0.0F);
        setField(term128383, term128383.getClass(), "ui", null);
        setField(term128383, term128383.getClass(), "listenerList", null);
        setField(term128383, term128383.getClass(), "clientProperties", null);
        setField(term128383, term128383.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term128383, term128383.getClass(), "autoscrolls", false);
        setField(term128383, term128383.getClass(), "border", null);
        setIntField(term128383, term128383.getClass(), "flags", 0);
        setField(term128383, term128383.getClass(), "inputVerifier", null);
        setBooleanField(term128383, term128383.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term128383, term128383.getClass(), "paintingChild", null);
        setField(term128383, term128383.getClass(), "popupMenu", null);
        setField(term128383, term128383.getClass(), "revalidateRunnableScheduled", null);
        setField(term128383, term128383.getClass(), "focusInputMap", null);
        setField(term128383, term128383.getClass(), "ancestorInputMap", null);
        setField(term128383, term128383.getClass(), "windowInputMap", null);
        setField(term128383, term128383.getClass(), "actionMap", null);
        setField(term128383, term128383.getClass(), "aaHint", null);
        setField(term128383, term128383.getClass(), "lcdRenderingHint", null);
        setField(term128383, term128383.getClass(), "component", null);
        setField(term128383, term128383.getClass(), "layoutMgr", null);
        setField(term128383, term128383.getClass(), "dispatcher", null);
        setField(term128383, term128383.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term128383, term128383.getClass(), "focusCycleRoot", false);
        setBooleanField(term128383, term128383.getClass(), "focusTraversalPolicyProvider", false);
        setField(term128383, term128383.getClass(), "printingThreads", null);
        setBooleanField(term128383, term128383.getClass(), "printing", false);
        setField(term128383, term128383.getClass(), "containerListener", null);
        setIntField(term128383, term128383.getClass(), "listeningChildren", 0);
        setIntField(term128383, term128383.getClass(), "listeningBoundsChildren", 0);
        setIntField(term128383, term128383.getClass(), "descendantsCount", 0);
        setField(term128383, term128383.getClass(), "preserveBackgroundColor", null);
        setIntField(term128383, term128383.getClass(), "numOfHWComponents", 0);
        setIntField(term128383, term128383.getClass(), "numOfLWComponents", 0);
        setField(term128383, term128383.getClass(), "modalComp", null);
        setField(term128383, term128383.getClass(), "modalAppContext", null);
        setIntField(term128383, term128383.getClass(), "containerSerializedDataVersion", 0);
        setField(term128383, term128383.getClass(), "peer", null);
        setField(term128383, term128383.getClass(), "parent", null);
        setField(term128383, term128383.getClass(), "appContext", null);
        setIntField(term128383, term128383.getClass(), "x", 0);
        setIntField(term128383, term128383.getClass(), "y", 0);
        setIntField(term128383, term128383.getClass(), "width", 0);
        setIntField(term128383, term128383.getClass(), "height", 0);
        setField(term128383, term128383.getClass(), "foreground", null);
        setField(term128383, term128383.getClass(), "background", null);
        setField(term128383, term128383.getClass(), "font", null);
        setField(term128383, term128383.getClass(), "peerFont", null);
        setField(term128383, term128383.getClass(), "cursor", null);
        setField(term128383, term128383.getClass(), "locale", null);
        setField(term128383, term128383.getClass(), "graphicsConfig", null);
        setField(term128383, term128383.getClass(), "bufferStrategy", null);
        setBooleanField(term128383, term128383.getClass(), "ignoreRepaint", false);
        setBooleanField(term128383, term128383.getClass(), "visible", false);
        setBooleanField(term128383, term128383.getClass(), "enabled", false);
        setBooleanField(term128383, term128383.getClass(), "valid", false);
        setField(term128383, term128383.getClass(), "dropTarget", null);
        setField(term128383, term128383.getClass(), "popups", null);
        setField(term128383, term128383.getClass(), "name", null);
        setBooleanField(term128383, term128383.getClass(), "nameExplicitlySet", false);
        setBooleanField(term128383, term128383.getClass(), "focusable", false);
        setIntField(term128383, term128383.getClass(), "isFocusTraversableOverridden", 0);
        setField(term128383, term128383.getClass(), "focusTraversalKeys", null);
        setBooleanField(term128383, term128383.getClass(), "focusTraversalKeysEnabled", false);
        setField(term128383, term128383.getClass(), "acc", null);
        setField(term128383, term128383.getClass(), "minSize", null);
        setBooleanField(term128383, term128383.getClass(), "minSizeSet", false);
        setField(term128383, term128383.getClass(), "prefSize", null);
        setBooleanField(term128383, term128383.getClass(), "prefSizeSet", false);
        setField(term128383, term128383.getClass(), "maxSize", null);
        setBooleanField(term128383, term128383.getClass(), "maxSizeSet", false);
        setField(term128383, term128383.getClass(), "componentOrientation", null);
        setBooleanField(term128383, term128383.getClass(), "newEventsOnly", false);
        setField(term128383, term128383.getClass(), "componentListener", null);
        setField(term128383, term128383.getClass(), "focusListener", null);
        setField(term128383, term128383.getClass(), "hierarchyListener", null);
        setField(term128383, term128383.getClass(), "hierarchyBoundsListener", null);
        setField(term128383, term128383.getClass(), "keyListener", null);
        setField(term128383, term128383.getClass(), "mouseListener", null);
        setField(term128383, term128383.getClass(), "mouseMotionListener", null);
        setField(term128383, term128383.getClass(), "mouseWheelListener", null);
        setField(term128383, term128383.getClass(), "inputMethodListener", null);
        setLongField(term128383, term128383.getClass(), "eventMask", 0L);
        setField(term128383, term128383.getClass(), "changeSupport", null);
        setField(term128383, term128383.getClass(), "objectLock", null);
        setBooleanField(term128383, term128383.getClass(), "isPacked", false);
        setIntField(term128383, term128383.getClass(), "boundsOp", 0);
        setField(term128383, term128383.getClass(), "compoundShape", null);
        setField(term128383, term128383.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term128383, term128383.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term128383, term128383.getClass(), "backgroundEraseDisabled", false);
        setField(term128383, term128383.getClass(), "eventCache", null);
        setBooleanField(term128383, term128383.getClass(), "coalescingEnabled", false);
        setBooleanField(term128383, term128383.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term128383, term128383.getClass(), "componentSerializedDataVersion", 0);
        setField(term128383, term128383.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.Ship");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "attackNuke", argTypes, term128383, args);
    }

};


