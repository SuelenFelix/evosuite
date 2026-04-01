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

public class PlanetBombingView_attackInvasionModule_204107533035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141818;

    public PlanetBombingView_attackInvasionModule_204107533035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141818 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term141818, term141818.getClass(), "totalPeople", null);
        setField(term141818, term141818.getClass(), "troopsPower", null);
        setField(term141818, term141818.getClass(), "defenseTurret", null);
        setField(term141818, term141818.getClass(), "totalBuildings", null);
        setField(term141818, term141818.getClass(), "ownerLabel", null);
        setField(term141818, term141818.getClass(), "planet", null);
        setField(term141818, term141818.getClass(), "fleet", null);
        setIntField(term141818, term141818.getClass(), "suppressionFire", 0);
        setField(term141818, term141818.getClass(), "shipsInFleet", null);
        setField(term141818, term141818.getClass(), "imgBase", null);
        setField(term141818, term141818.getClass(), "infoPanel", null);
        setField(term141818, term141818.getClass(), "textArea", null);
        setField(term141818, term141818.getClass(), "textLogger", null);
        setField(term141818, term141818.getClass(), "componentUsed", null);
        setIntField(term141818, term141818.getClass(), "shipIndex", 0);
        setIntField(term141818, term141818.getClass(), "usedComponentIndex", 0);
        setField(term141818, term141818.getClass(), "attacker", null);
        setIntField(term141818, term141818.getClass(), "attackPlayerIndex", 0);
        setField(term141818, term141818.getClass(), "defender", null);
        setIntField(term141818, term141818.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term141818, term141818.getClass(), "aiControlled", false);
        setBooleanField(term141818, term141818.getClass(), "allAi", false);
        setField(term141818, term141818.getClass(), "endButton", null);
        setBooleanField(term141818, term141818.getClass(), "aiOneAttackFound", false);
        setBooleanField(term141818, term141818.getClass(), "aiExitLoop", false);
        setBooleanField(term141818, term141818.getClass(), "aiTroops", false);
        setIntField(term141818, term141818.getClass(), "aiDelays", 0);
        setIntField(term141818, term141818.getClass(), "aiComponentIndex", 0);
        setField(term141818, term141818.getClass(), "starMap", null);
        setField(term141818, term141818.getClass(), "game", null);
        setField(term141818, term141818.getClass(), "nuked", null);
        setField(term141818, term141818.getClass(), "newsData", null);
        setField(term141818, term141818.getClass(), "bombers", null);
        setBooleanField(term141818, term141818.getClass(), "actionSpent", false);
        setIntField(term141818, term141818.getClass(), "whatHappened", 0);
        setBooleanField(term141818, term141818.getClass(), "isAlignmentXSet", false);
        setFloatField(term141818, term141818.getClass(), "alignmentX", 0.0F);
        setBooleanField(term141818, term141818.getClass(), "isAlignmentYSet", false);
        setFloatField(term141818, term141818.getClass(), "alignmentY", 0.0F);
        setField(term141818, term141818.getClass(), "ui", null);
        setField(term141818, term141818.getClass(), "listenerList", null);
        setField(term141818, term141818.getClass(), "clientProperties", null);
        setField(term141818, term141818.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term141818, term141818.getClass(), "autoscrolls", false);
        setField(term141818, term141818.getClass(), "border", null);
        setIntField(term141818, term141818.getClass(), "flags", 0);
        setField(term141818, term141818.getClass(), "inputVerifier", null);
        setBooleanField(term141818, term141818.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term141818, term141818.getClass(), "paintingChild", null);
        setField(term141818, term141818.getClass(), "popupMenu", null);
        setField(term141818, term141818.getClass(), "revalidateRunnableScheduled", null);
        setField(term141818, term141818.getClass(), "focusInputMap", null);
        setField(term141818, term141818.getClass(), "ancestorInputMap", null);
        setField(term141818, term141818.getClass(), "windowInputMap", null);
        setField(term141818, term141818.getClass(), "actionMap", null);
        setField(term141818, term141818.getClass(), "aaHint", null);
        setField(term141818, term141818.getClass(), "lcdRenderingHint", null);
        setField(term141818, term141818.getClass(), "component", null);
        setField(term141818, term141818.getClass(), "layoutMgr", null);
        setField(term141818, term141818.getClass(), "dispatcher", null);
        setField(term141818, term141818.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term141818, term141818.getClass(), "focusCycleRoot", false);
        setBooleanField(term141818, term141818.getClass(), "focusTraversalPolicyProvider", false);
        setField(term141818, term141818.getClass(), "printingThreads", null);
        setBooleanField(term141818, term141818.getClass(), "printing", false);
        setField(term141818, term141818.getClass(), "containerListener", null);
        setIntField(term141818, term141818.getClass(), "listeningChildren", 0);
        setIntField(term141818, term141818.getClass(), "listeningBoundsChildren", 0);
        setIntField(term141818, term141818.getClass(), "descendantsCount", 0);
        setField(term141818, term141818.getClass(), "preserveBackgroundColor", null);
        setIntField(term141818, term141818.getClass(), "numOfHWComponents", 0);
        setIntField(term141818, term141818.getClass(), "numOfLWComponents", 0);
        setField(term141818, term141818.getClass(), "modalComp", null);
        setField(term141818, term141818.getClass(), "modalAppContext", null);
        setIntField(term141818, term141818.getClass(), "containerSerializedDataVersion", 0);
        setField(term141818, term141818.getClass(), "peer", null);
        setField(term141818, term141818.getClass(), "parent", null);
        setField(term141818, term141818.getClass(), "appContext", null);
        setIntField(term141818, term141818.getClass(), "x", 0);
        setIntField(term141818, term141818.getClass(), "y", 0);
        setIntField(term141818, term141818.getClass(), "width", 0);
        setIntField(term141818, term141818.getClass(), "height", 0);
        setField(term141818, term141818.getClass(), "foreground", null);
        setField(term141818, term141818.getClass(), "background", null);
        setField(term141818, term141818.getClass(), "font", null);
        setField(term141818, term141818.getClass(), "peerFont", null);
        setField(term141818, term141818.getClass(), "cursor", null);
        setField(term141818, term141818.getClass(), "locale", null);
        setField(term141818, term141818.getClass(), "graphicsConfig", null);
        setField(term141818, term141818.getClass(), "bufferStrategy", null);
        setBooleanField(term141818, term141818.getClass(), "ignoreRepaint", false);
        setBooleanField(term141818, term141818.getClass(), "visible", false);
        setBooleanField(term141818, term141818.getClass(), "enabled", false);
        setBooleanField(term141818, term141818.getClass(), "valid", false);
        setField(term141818, term141818.getClass(), "dropTarget", null);
        setField(term141818, term141818.getClass(), "popups", null);
        setField(term141818, term141818.getClass(), "name", null);
        setBooleanField(term141818, term141818.getClass(), "nameExplicitlySet", false);
        setBooleanField(term141818, term141818.getClass(), "focusable", false);
        setIntField(term141818, term141818.getClass(), "isFocusTraversableOverridden", 0);
        setField(term141818, term141818.getClass(), "focusTraversalKeys", null);
        setBooleanField(term141818, term141818.getClass(), "focusTraversalKeysEnabled", false);
        setField(term141818, term141818.getClass(), "acc", null);
        setField(term141818, term141818.getClass(), "minSize", null);
        setBooleanField(term141818, term141818.getClass(), "minSizeSet", false);
        setField(term141818, term141818.getClass(), "prefSize", null);
        setBooleanField(term141818, term141818.getClass(), "prefSizeSet", false);
        setField(term141818, term141818.getClass(), "maxSize", null);
        setBooleanField(term141818, term141818.getClass(), "maxSizeSet", false);
        setField(term141818, term141818.getClass(), "componentOrientation", null);
        setBooleanField(term141818, term141818.getClass(), "newEventsOnly", false);
        setField(term141818, term141818.getClass(), "componentListener", null);
        setField(term141818, term141818.getClass(), "focusListener", null);
        setField(term141818, term141818.getClass(), "hierarchyListener", null);
        setField(term141818, term141818.getClass(), "hierarchyBoundsListener", null);
        setField(term141818, term141818.getClass(), "keyListener", null);
        setField(term141818, term141818.getClass(), "mouseListener", null);
        setField(term141818, term141818.getClass(), "mouseMotionListener", null);
        setField(term141818, term141818.getClass(), "mouseWheelListener", null);
        setField(term141818, term141818.getClass(), "inputMethodListener", null);
        setLongField(term141818, term141818.getClass(), "eventMask", 0L);
        setField(term141818, term141818.getClass(), "changeSupport", null);
        setField(term141818, term141818.getClass(), "objectLock", null);
        setBooleanField(term141818, term141818.getClass(), "isPacked", false);
        setIntField(term141818, term141818.getClass(), "boundsOp", 0);
        setField(term141818, term141818.getClass(), "compoundShape", null);
        setField(term141818, term141818.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term141818, term141818.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term141818, term141818.getClass(), "backgroundEraseDisabled", false);
        setField(term141818, term141818.getClass(), "eventCache", null);
        setBooleanField(term141818, term141818.getClass(), "coalescingEnabled", false);
        setBooleanField(term141818, term141818.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term141818, term141818.getClass(), "componentSerializedDataVersion", 0);
        setField(term141818, term141818.getClass(), "accessibleContext", null);
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
        callMethod(klass, "attackInvasionModule", argTypes, term141818, args);
    }

};


