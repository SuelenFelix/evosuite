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

public class PlanetBombingView_attackSporeModule_111733803137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145813;

    public PlanetBombingView_attackSporeModule_111733803137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145813 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term145813, term145813.getClass(), "totalPeople", null);
        setField(term145813, term145813.getClass(), "troopsPower", null);
        setField(term145813, term145813.getClass(), "defenseTurret", null);
        setField(term145813, term145813.getClass(), "totalBuildings", null);
        setField(term145813, term145813.getClass(), "ownerLabel", null);
        setField(term145813, term145813.getClass(), "planet", null);
        setField(term145813, term145813.getClass(), "fleet", null);
        setIntField(term145813, term145813.getClass(), "suppressionFire", 0);
        setField(term145813, term145813.getClass(), "shipsInFleet", null);
        setField(term145813, term145813.getClass(), "imgBase", null);
        setField(term145813, term145813.getClass(), "infoPanel", null);
        setField(term145813, term145813.getClass(), "textArea", null);
        setField(term145813, term145813.getClass(), "textLogger", null);
        setField(term145813, term145813.getClass(), "componentUsed", null);
        setIntField(term145813, term145813.getClass(), "shipIndex", 0);
        setIntField(term145813, term145813.getClass(), "usedComponentIndex", 0);
        setField(term145813, term145813.getClass(), "attacker", null);
        setIntField(term145813, term145813.getClass(), "attackPlayerIndex", 0);
        setField(term145813, term145813.getClass(), "defender", null);
        setIntField(term145813, term145813.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term145813, term145813.getClass(), "aiControlled", false);
        setBooleanField(term145813, term145813.getClass(), "allAi", false);
        setField(term145813, term145813.getClass(), "endButton", null);
        setBooleanField(term145813, term145813.getClass(), "aiOneAttackFound", false);
        setBooleanField(term145813, term145813.getClass(), "aiExitLoop", false);
        setBooleanField(term145813, term145813.getClass(), "aiTroops", false);
        setIntField(term145813, term145813.getClass(), "aiDelays", 0);
        setIntField(term145813, term145813.getClass(), "aiComponentIndex", 0);
        setField(term145813, term145813.getClass(), "starMap", null);
        setField(term145813, term145813.getClass(), "game", null);
        setField(term145813, term145813.getClass(), "nuked", null);
        setField(term145813, term145813.getClass(), "newsData", null);
        setField(term145813, term145813.getClass(), "bombers", null);
        setBooleanField(term145813, term145813.getClass(), "actionSpent", false);
        setIntField(term145813, term145813.getClass(), "whatHappened", 0);
        setBooleanField(term145813, term145813.getClass(), "isAlignmentXSet", false);
        setFloatField(term145813, term145813.getClass(), "alignmentX", 0.0F);
        setBooleanField(term145813, term145813.getClass(), "isAlignmentYSet", false);
        setFloatField(term145813, term145813.getClass(), "alignmentY", 0.0F);
        setField(term145813, term145813.getClass(), "ui", null);
        setField(term145813, term145813.getClass(), "listenerList", null);
        setField(term145813, term145813.getClass(), "clientProperties", null);
        setField(term145813, term145813.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term145813, term145813.getClass(), "autoscrolls", false);
        setField(term145813, term145813.getClass(), "border", null);
        setIntField(term145813, term145813.getClass(), "flags", 0);
        setField(term145813, term145813.getClass(), "inputVerifier", null);
        setBooleanField(term145813, term145813.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term145813, term145813.getClass(), "paintingChild", null);
        setField(term145813, term145813.getClass(), "popupMenu", null);
        setField(term145813, term145813.getClass(), "revalidateRunnableScheduled", null);
        setField(term145813, term145813.getClass(), "focusInputMap", null);
        setField(term145813, term145813.getClass(), "ancestorInputMap", null);
        setField(term145813, term145813.getClass(), "windowInputMap", null);
        setField(term145813, term145813.getClass(), "actionMap", null);
        setField(term145813, term145813.getClass(), "aaHint", null);
        setField(term145813, term145813.getClass(), "lcdRenderingHint", null);
        setField(term145813, term145813.getClass(), "component", null);
        setField(term145813, term145813.getClass(), "layoutMgr", null);
        setField(term145813, term145813.getClass(), "dispatcher", null);
        setField(term145813, term145813.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term145813, term145813.getClass(), "focusCycleRoot", false);
        setBooleanField(term145813, term145813.getClass(), "focusTraversalPolicyProvider", false);
        setField(term145813, term145813.getClass(), "printingThreads", null);
        setBooleanField(term145813, term145813.getClass(), "printing", false);
        setField(term145813, term145813.getClass(), "containerListener", null);
        setIntField(term145813, term145813.getClass(), "listeningChildren", 0);
        setIntField(term145813, term145813.getClass(), "listeningBoundsChildren", 0);
        setIntField(term145813, term145813.getClass(), "descendantsCount", 0);
        setField(term145813, term145813.getClass(), "preserveBackgroundColor", null);
        setIntField(term145813, term145813.getClass(), "numOfHWComponents", 0);
        setIntField(term145813, term145813.getClass(), "numOfLWComponents", 0);
        setField(term145813, term145813.getClass(), "modalComp", null);
        setField(term145813, term145813.getClass(), "modalAppContext", null);
        setIntField(term145813, term145813.getClass(), "containerSerializedDataVersion", 0);
        setField(term145813, term145813.getClass(), "peer", null);
        setField(term145813, term145813.getClass(), "parent", null);
        setField(term145813, term145813.getClass(), "appContext", null);
        setIntField(term145813, term145813.getClass(), "x", 0);
        setIntField(term145813, term145813.getClass(), "y", 0);
        setIntField(term145813, term145813.getClass(), "width", 0);
        setIntField(term145813, term145813.getClass(), "height", 0);
        setField(term145813, term145813.getClass(), "foreground", null);
        setField(term145813, term145813.getClass(), "background", null);
        setField(term145813, term145813.getClass(), "font", null);
        setField(term145813, term145813.getClass(), "peerFont", null);
        setField(term145813, term145813.getClass(), "cursor", null);
        setField(term145813, term145813.getClass(), "locale", null);
        setField(term145813, term145813.getClass(), "graphicsConfig", null);
        setField(term145813, term145813.getClass(), "bufferStrategy", null);
        setBooleanField(term145813, term145813.getClass(), "ignoreRepaint", false);
        setBooleanField(term145813, term145813.getClass(), "visible", false);
        setBooleanField(term145813, term145813.getClass(), "enabled", false);
        setBooleanField(term145813, term145813.getClass(), "valid", false);
        setField(term145813, term145813.getClass(), "dropTarget", null);
        setField(term145813, term145813.getClass(), "popups", null);
        setField(term145813, term145813.getClass(), "name", null);
        setBooleanField(term145813, term145813.getClass(), "nameExplicitlySet", false);
        setBooleanField(term145813, term145813.getClass(), "focusable", false);
        setIntField(term145813, term145813.getClass(), "isFocusTraversableOverridden", 0);
        setField(term145813, term145813.getClass(), "focusTraversalKeys", null);
        setBooleanField(term145813, term145813.getClass(), "focusTraversalKeysEnabled", false);
        setField(term145813, term145813.getClass(), "acc", null);
        setField(term145813, term145813.getClass(), "minSize", null);
        setBooleanField(term145813, term145813.getClass(), "minSizeSet", false);
        setField(term145813, term145813.getClass(), "prefSize", null);
        setBooleanField(term145813, term145813.getClass(), "prefSizeSet", false);
        setField(term145813, term145813.getClass(), "maxSize", null);
        setBooleanField(term145813, term145813.getClass(), "maxSizeSet", false);
        setField(term145813, term145813.getClass(), "componentOrientation", null);
        setBooleanField(term145813, term145813.getClass(), "newEventsOnly", false);
        setField(term145813, term145813.getClass(), "componentListener", null);
        setField(term145813, term145813.getClass(), "focusListener", null);
        setField(term145813, term145813.getClass(), "hierarchyListener", null);
        setField(term145813, term145813.getClass(), "hierarchyBoundsListener", null);
        setField(term145813, term145813.getClass(), "keyListener", null);
        setField(term145813, term145813.getClass(), "mouseListener", null);
        setField(term145813, term145813.getClass(), "mouseMotionListener", null);
        setField(term145813, term145813.getClass(), "mouseWheelListener", null);
        setField(term145813, term145813.getClass(), "inputMethodListener", null);
        setLongField(term145813, term145813.getClass(), "eventMask", 0L);
        setField(term145813, term145813.getClass(), "changeSupport", null);
        setField(term145813, term145813.getClass(), "objectLock", null);
        setBooleanField(term145813, term145813.getClass(), "isPacked", false);
        setIntField(term145813, term145813.getClass(), "boundsOp", 0);
        setField(term145813, term145813.getClass(), "compoundShape", null);
        setField(term145813, term145813.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term145813, term145813.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term145813, term145813.getClass(), "backgroundEraseDisabled", false);
        setField(term145813, term145813.getClass(), "eventCache", null);
        setBooleanField(term145813, term145813.getClass(), "coalescingEnabled", false);
        setBooleanField(term145813, term145813.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term145813, term145813.getClass(), "componentSerializedDataVersion", 0);
        setField(term145813, term145813.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "attackSporeModule", argTypes, term145813, args);
    }

};


