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

public class PlanetBombingView_setFleet_4210726909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106080;

    public PlanetBombingView_setFleet_4210726909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106080 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term106080, term106080.getClass(), "totalPeople", null);
        setField(term106080, term106080.getClass(), "troopsPower", null);
        setField(term106080, term106080.getClass(), "defenseTurret", null);
        setField(term106080, term106080.getClass(), "totalBuildings", null);
        setField(term106080, term106080.getClass(), "ownerLabel", null);
        setField(term106080, term106080.getClass(), "planet", null);
        setField(term106080, term106080.getClass(), "fleet", null);
        setIntField(term106080, term106080.getClass(), "suppressionFire", 0);
        setField(term106080, term106080.getClass(), "shipsInFleet", null);
        setField(term106080, term106080.getClass(), "imgBase", null);
        setField(term106080, term106080.getClass(), "infoPanel", null);
        setField(term106080, term106080.getClass(), "textArea", null);
        setField(term106080, term106080.getClass(), "textLogger", null);
        setField(term106080, term106080.getClass(), "componentUsed", null);
        setIntField(term106080, term106080.getClass(), "shipIndex", 0);
        setIntField(term106080, term106080.getClass(), "usedComponentIndex", 0);
        setField(term106080, term106080.getClass(), "attacker", null);
        setIntField(term106080, term106080.getClass(), "attackPlayerIndex", 0);
        setField(term106080, term106080.getClass(), "defender", null);
        setIntField(term106080, term106080.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term106080, term106080.getClass(), "aiControlled", false);
        setBooleanField(term106080, term106080.getClass(), "allAi", false);
        setField(term106080, term106080.getClass(), "endButton", null);
        setBooleanField(term106080, term106080.getClass(), "aiOneAttackFound", false);
        setBooleanField(term106080, term106080.getClass(), "aiExitLoop", false);
        setBooleanField(term106080, term106080.getClass(), "aiTroops", false);
        setIntField(term106080, term106080.getClass(), "aiDelays", 0);
        setIntField(term106080, term106080.getClass(), "aiComponentIndex", 0);
        setField(term106080, term106080.getClass(), "starMap", null);
        setField(term106080, term106080.getClass(), "game", null);
        setField(term106080, term106080.getClass(), "nuked", null);
        setField(term106080, term106080.getClass(), "newsData", null);
        setField(term106080, term106080.getClass(), "bombers", null);
        setBooleanField(term106080, term106080.getClass(), "actionSpent", false);
        setIntField(term106080, term106080.getClass(), "whatHappened", 0);
        setBooleanField(term106080, term106080.getClass(), "isAlignmentXSet", false);
        setFloatField(term106080, term106080.getClass(), "alignmentX", 0.0F);
        setBooleanField(term106080, term106080.getClass(), "isAlignmentYSet", false);
        setFloatField(term106080, term106080.getClass(), "alignmentY", 0.0F);
        setField(term106080, term106080.getClass(), "ui", null);
        setField(term106080, term106080.getClass(), "listenerList", null);
        setField(term106080, term106080.getClass(), "clientProperties", null);
        setField(term106080, term106080.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term106080, term106080.getClass(), "autoscrolls", false);
        setField(term106080, term106080.getClass(), "border", null);
        setIntField(term106080, term106080.getClass(), "flags", 0);
        setField(term106080, term106080.getClass(), "inputVerifier", null);
        setBooleanField(term106080, term106080.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term106080, term106080.getClass(), "paintingChild", null);
        setField(term106080, term106080.getClass(), "popupMenu", null);
        setField(term106080, term106080.getClass(), "revalidateRunnableScheduled", null);
        setField(term106080, term106080.getClass(), "focusInputMap", null);
        setField(term106080, term106080.getClass(), "ancestorInputMap", null);
        setField(term106080, term106080.getClass(), "windowInputMap", null);
        setField(term106080, term106080.getClass(), "actionMap", null);
        setField(term106080, term106080.getClass(), "aaHint", null);
        setField(term106080, term106080.getClass(), "lcdRenderingHint", null);
        setField(term106080, term106080.getClass(), "component", null);
        setField(term106080, term106080.getClass(), "layoutMgr", null);
        setField(term106080, term106080.getClass(), "dispatcher", null);
        setField(term106080, term106080.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term106080, term106080.getClass(), "focusCycleRoot", false);
        setBooleanField(term106080, term106080.getClass(), "focusTraversalPolicyProvider", false);
        setField(term106080, term106080.getClass(), "printingThreads", null);
        setBooleanField(term106080, term106080.getClass(), "printing", false);
        setField(term106080, term106080.getClass(), "containerListener", null);
        setIntField(term106080, term106080.getClass(), "listeningChildren", 0);
        setIntField(term106080, term106080.getClass(), "listeningBoundsChildren", 0);
        setIntField(term106080, term106080.getClass(), "descendantsCount", 0);
        setField(term106080, term106080.getClass(), "preserveBackgroundColor", null);
        setIntField(term106080, term106080.getClass(), "numOfHWComponents", 0);
        setIntField(term106080, term106080.getClass(), "numOfLWComponents", 0);
        setField(term106080, term106080.getClass(), "modalComp", null);
        setField(term106080, term106080.getClass(), "modalAppContext", null);
        setIntField(term106080, term106080.getClass(), "containerSerializedDataVersion", 0);
        setField(term106080, term106080.getClass(), "peer", null);
        setField(term106080, term106080.getClass(), "parent", null);
        setField(term106080, term106080.getClass(), "appContext", null);
        setIntField(term106080, term106080.getClass(), "x", 0);
        setIntField(term106080, term106080.getClass(), "y", 0);
        setIntField(term106080, term106080.getClass(), "width", 0);
        setIntField(term106080, term106080.getClass(), "height", 0);
        setField(term106080, term106080.getClass(), "foreground", null);
        setField(term106080, term106080.getClass(), "background", null);
        setField(term106080, term106080.getClass(), "font", null);
        setField(term106080, term106080.getClass(), "peerFont", null);
        setField(term106080, term106080.getClass(), "cursor", null);
        setField(term106080, term106080.getClass(), "locale", null);
        setField(term106080, term106080.getClass(), "graphicsConfig", null);
        setField(term106080, term106080.getClass(), "bufferStrategy", null);
        setBooleanField(term106080, term106080.getClass(), "ignoreRepaint", false);
        setBooleanField(term106080, term106080.getClass(), "visible", false);
        setBooleanField(term106080, term106080.getClass(), "enabled", false);
        setBooleanField(term106080, term106080.getClass(), "valid", false);
        setField(term106080, term106080.getClass(), "dropTarget", null);
        setField(term106080, term106080.getClass(), "popups", null);
        setField(term106080, term106080.getClass(), "name", null);
        setBooleanField(term106080, term106080.getClass(), "nameExplicitlySet", false);
        setBooleanField(term106080, term106080.getClass(), "focusable", false);
        setIntField(term106080, term106080.getClass(), "isFocusTraversableOverridden", 0);
        setField(term106080, term106080.getClass(), "focusTraversalKeys", null);
        setBooleanField(term106080, term106080.getClass(), "focusTraversalKeysEnabled", false);
        setField(term106080, term106080.getClass(), "acc", null);
        setField(term106080, term106080.getClass(), "minSize", null);
        setBooleanField(term106080, term106080.getClass(), "minSizeSet", false);
        setField(term106080, term106080.getClass(), "prefSize", null);
        setBooleanField(term106080, term106080.getClass(), "prefSizeSet", false);
        setField(term106080, term106080.getClass(), "maxSize", null);
        setBooleanField(term106080, term106080.getClass(), "maxSizeSet", false);
        setField(term106080, term106080.getClass(), "componentOrientation", null);
        setBooleanField(term106080, term106080.getClass(), "newEventsOnly", false);
        setField(term106080, term106080.getClass(), "componentListener", null);
        setField(term106080, term106080.getClass(), "focusListener", null);
        setField(term106080, term106080.getClass(), "hierarchyListener", null);
        setField(term106080, term106080.getClass(), "hierarchyBoundsListener", null);
        setField(term106080, term106080.getClass(), "keyListener", null);
        setField(term106080, term106080.getClass(), "mouseListener", null);
        setField(term106080, term106080.getClass(), "mouseMotionListener", null);
        setField(term106080, term106080.getClass(), "mouseWheelListener", null);
        setField(term106080, term106080.getClass(), "inputMethodListener", null);
        setLongField(term106080, term106080.getClass(), "eventMask", 0L);
        setField(term106080, term106080.getClass(), "changeSupport", null);
        setField(term106080, term106080.getClass(), "objectLock", null);
        setBooleanField(term106080, term106080.getClass(), "isPacked", false);
        setIntField(term106080, term106080.getClass(), "boundsOp", 0);
        setField(term106080, term106080.getClass(), "compoundShape", null);
        setField(term106080, term106080.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term106080, term106080.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term106080, term106080.getClass(), "backgroundEraseDisabled", false);
        setField(term106080, term106080.getClass(), "eventCache", null);
        setBooleanField(term106080, term106080.getClass(), "coalescingEnabled", false);
        setBooleanField(term106080, term106080.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term106080, term106080.getClass(), "componentSerializedDataVersion", 0);
        setField(term106080, term106080.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFleet", argTypes, term106080, args);
    }

};


