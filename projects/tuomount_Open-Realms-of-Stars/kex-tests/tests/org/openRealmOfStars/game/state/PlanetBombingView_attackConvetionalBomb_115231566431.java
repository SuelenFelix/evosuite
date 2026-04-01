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

public class PlanetBombingView_attackConvetionalBomb_115231566431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132500;
     Object term132555;

    public PlanetBombingView_attackConvetionalBomb_115231566431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132500 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term132500, term132500.getClass(), "totalPeople", null);
        setField(term132500, term132500.getClass(), "troopsPower", null);
        setField(term132500, term132500.getClass(), "defenseTurret", null);
        setField(term132500, term132500.getClass(), "totalBuildings", null);
        setField(term132500, term132500.getClass(), "ownerLabel", null);
        setField(term132500, term132500.getClass(), "planet", null);
        setField(term132500, term132500.getClass(), "fleet", null);
        setIntField(term132500, term132500.getClass(), "suppressionFire", 0);
        setField(term132500, term132500.getClass(), "shipsInFleet", null);
        setField(term132500, term132500.getClass(), "imgBase", null);
        setField(term132500, term132500.getClass(), "infoPanel", null);
        setField(term132500, term132500.getClass(), "textArea", null);
        setField(term132500, term132500.getClass(), "textLogger", null);
        setField(term132500, term132500.getClass(), "componentUsed", null);
        setIntField(term132500, term132500.getClass(), "shipIndex", 0);
        setIntField(term132500, term132500.getClass(), "usedComponentIndex", 0);
        setField(term132500, term132500.getClass(), "attacker", null);
        setIntField(term132500, term132500.getClass(), "attackPlayerIndex", 0);
        setField(term132500, term132500.getClass(), "defender", null);
        setIntField(term132500, term132500.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term132500, term132500.getClass(), "aiControlled", false);
        setBooleanField(term132500, term132500.getClass(), "allAi", false);
        setField(term132500, term132500.getClass(), "endButton", null);
        setBooleanField(term132500, term132500.getClass(), "aiOneAttackFound", false);
        setBooleanField(term132500, term132500.getClass(), "aiExitLoop", false);
        setBooleanField(term132500, term132500.getClass(), "aiTroops", false);
        setIntField(term132500, term132500.getClass(), "aiDelays", 0);
        setIntField(term132500, term132500.getClass(), "aiComponentIndex", 0);
        setField(term132500, term132500.getClass(), "starMap", null);
        setField(term132500, term132500.getClass(), "game", null);
        setField(term132500, term132500.getClass(), "nuked", null);
        setField(term132500, term132500.getClass(), "newsData", null);
        setField(term132500, term132500.getClass(), "bombers", null);
        setBooleanField(term132500, term132500.getClass(), "actionSpent", false);
        setIntField(term132500, term132500.getClass(), "whatHappened", 0);
        setBooleanField(term132500, term132500.getClass(), "isAlignmentXSet", false);
        setFloatField(term132500, term132500.getClass(), "alignmentX", 0.0F);
        setBooleanField(term132500, term132500.getClass(), "isAlignmentYSet", false);
        setFloatField(term132500, term132500.getClass(), "alignmentY", 0.0F);
        setField(term132500, term132500.getClass(), "ui", null);
        setField(term132500, term132500.getClass(), "listenerList", null);
        setField(term132500, term132500.getClass(), "clientProperties", null);
        setField(term132500, term132500.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term132500, term132500.getClass(), "autoscrolls", false);
        setField(term132500, term132500.getClass(), "border", null);
        setIntField(term132500, term132500.getClass(), "flags", 0);
        setField(term132500, term132500.getClass(), "inputVerifier", null);
        setBooleanField(term132500, term132500.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term132500, term132500.getClass(), "paintingChild", null);
        setField(term132500, term132500.getClass(), "popupMenu", null);
        setField(term132500, term132500.getClass(), "revalidateRunnableScheduled", null);
        setField(term132500, term132500.getClass(), "focusInputMap", null);
        setField(term132500, term132500.getClass(), "ancestorInputMap", null);
        setField(term132500, term132500.getClass(), "windowInputMap", null);
        setField(term132500, term132500.getClass(), "actionMap", null);
        setField(term132500, term132500.getClass(), "aaHint", null);
        setField(term132500, term132500.getClass(), "lcdRenderingHint", null);
        setField(term132500, term132500.getClass(), "component", null);
        setField(term132500, term132500.getClass(), "layoutMgr", null);
        setField(term132500, term132500.getClass(), "dispatcher", null);
        setField(term132500, term132500.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term132500, term132500.getClass(), "focusCycleRoot", false);
        setBooleanField(term132500, term132500.getClass(), "focusTraversalPolicyProvider", false);
        setField(term132500, term132500.getClass(), "printingThreads", null);
        setBooleanField(term132500, term132500.getClass(), "printing", false);
        setField(term132500, term132500.getClass(), "containerListener", null);
        setIntField(term132500, term132500.getClass(), "listeningChildren", 0);
        setIntField(term132500, term132500.getClass(), "listeningBoundsChildren", 0);
        setIntField(term132500, term132500.getClass(), "descendantsCount", 0);
        setField(term132500, term132500.getClass(), "preserveBackgroundColor", null);
        setIntField(term132500, term132500.getClass(), "numOfHWComponents", 0);
        setIntField(term132500, term132500.getClass(), "numOfLWComponents", 0);
        setField(term132500, term132500.getClass(), "modalComp", null);
        setField(term132500, term132500.getClass(), "modalAppContext", null);
        setIntField(term132500, term132500.getClass(), "containerSerializedDataVersion", 0);
        setField(term132500, term132500.getClass(), "peer", null);
        setField(term132500, term132500.getClass(), "parent", null);
        setField(term132500, term132500.getClass(), "appContext", null);
        setIntField(term132500, term132500.getClass(), "x", 0);
        setIntField(term132500, term132500.getClass(), "y", 0);
        setIntField(term132500, term132500.getClass(), "width", 0);
        setIntField(term132500, term132500.getClass(), "height", 0);
        setField(term132500, term132500.getClass(), "foreground", null);
        setField(term132500, term132500.getClass(), "background", null);
        setField(term132500, term132500.getClass(), "font", null);
        setField(term132500, term132500.getClass(), "peerFont", null);
        setField(term132500, term132500.getClass(), "cursor", null);
        setField(term132500, term132500.getClass(), "locale", null);
        setField(term132500, term132500.getClass(), "graphicsConfig", null);
        setField(term132500, term132500.getClass(), "bufferStrategy", null);
        setBooleanField(term132500, term132500.getClass(), "ignoreRepaint", false);
        setBooleanField(term132500, term132500.getClass(), "visible", false);
        setBooleanField(term132500, term132500.getClass(), "enabled", false);
        setBooleanField(term132500, term132500.getClass(), "valid", false);
        setField(term132500, term132500.getClass(), "dropTarget", null);
        setField(term132500, term132500.getClass(), "popups", null);
        setField(term132500, term132500.getClass(), "name", null);
        setBooleanField(term132500, term132500.getClass(), "nameExplicitlySet", false);
        setBooleanField(term132500, term132500.getClass(), "focusable", false);
        setIntField(term132500, term132500.getClass(), "isFocusTraversableOverridden", 0);
        setField(term132500, term132500.getClass(), "focusTraversalKeys", null);
        setBooleanField(term132500, term132500.getClass(), "focusTraversalKeysEnabled", false);
        setField(term132500, term132500.getClass(), "acc", null);
        setField(term132500, term132500.getClass(), "minSize", null);
        setBooleanField(term132500, term132500.getClass(), "minSizeSet", false);
        setField(term132500, term132500.getClass(), "prefSize", null);
        setBooleanField(term132500, term132500.getClass(), "prefSizeSet", false);
        setField(term132500, term132500.getClass(), "maxSize", null);
        setBooleanField(term132500, term132500.getClass(), "maxSizeSet", false);
        setField(term132500, term132500.getClass(), "componentOrientation", null);
        setBooleanField(term132500, term132500.getClass(), "newEventsOnly", false);
        setField(term132500, term132500.getClass(), "componentListener", null);
        setField(term132500, term132500.getClass(), "focusListener", null);
        setField(term132500, term132500.getClass(), "hierarchyListener", null);
        setField(term132500, term132500.getClass(), "hierarchyBoundsListener", null);
        setField(term132500, term132500.getClass(), "keyListener", null);
        setField(term132500, term132500.getClass(), "mouseListener", null);
        setField(term132500, term132500.getClass(), "mouseMotionListener", null);
        setField(term132500, term132500.getClass(), "mouseWheelListener", null);
        setField(term132500, term132500.getClass(), "inputMethodListener", null);
        setLongField(term132500, term132500.getClass(), "eventMask", 0L);
        setField(term132500, term132500.getClass(), "changeSupport", null);
        setField(term132500, term132500.getClass(), "objectLock", null);
        setBooleanField(term132500, term132500.getClass(), "isPacked", false);
        setIntField(term132500, term132500.getClass(), "boundsOp", 0);
        setField(term132500, term132500.getClass(), "compoundShape", null);
        setField(term132500, term132500.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term132500, term132500.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term132500, term132500.getClass(), "backgroundEraseDisabled", false);
        setField(term132500, term132500.getClass(), "eventCache", null);
        setBooleanField(term132500, term132500.getClass(), "coalescingEnabled", false);
        setBooleanField(term132500, term132500.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term132500, term132500.getClass(), "componentSerializedDataVersion", 0);
        setField(term132500, term132500.getClass(), "accessibleContext", null);
        term132555 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.Ship");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term132555;
        callMethod(klass, "attackConvetionalBomb", argTypes, term132500, args);
    }

};


