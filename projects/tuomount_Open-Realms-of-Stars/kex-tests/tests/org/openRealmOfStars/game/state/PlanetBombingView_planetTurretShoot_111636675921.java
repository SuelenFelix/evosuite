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

public class PlanetBombingView_planetTurretShoot_111636675921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120137;

    public PlanetBombingView_planetTurretShoot_111636675921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120137 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term120137, term120137.getClass(), "totalPeople", null);
        setField(term120137, term120137.getClass(), "troopsPower", null);
        setField(term120137, term120137.getClass(), "defenseTurret", null);
        setField(term120137, term120137.getClass(), "totalBuildings", null);
        setField(term120137, term120137.getClass(), "ownerLabel", null);
        setField(term120137, term120137.getClass(), "planet", null);
        setField(term120137, term120137.getClass(), "fleet", null);
        setIntField(term120137, term120137.getClass(), "suppressionFire", 0);
        setField(term120137, term120137.getClass(), "shipsInFleet", null);
        setField(term120137, term120137.getClass(), "imgBase", null);
        setField(term120137, term120137.getClass(), "infoPanel", null);
        setField(term120137, term120137.getClass(), "textArea", null);
        setField(term120137, term120137.getClass(), "textLogger", null);
        setField(term120137, term120137.getClass(), "componentUsed", null);
        setIntField(term120137, term120137.getClass(), "shipIndex", 0);
        setIntField(term120137, term120137.getClass(), "usedComponentIndex", 0);
        setField(term120137, term120137.getClass(), "attacker", null);
        setIntField(term120137, term120137.getClass(), "attackPlayerIndex", 0);
        setField(term120137, term120137.getClass(), "defender", null);
        setIntField(term120137, term120137.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term120137, term120137.getClass(), "aiControlled", false);
        setBooleanField(term120137, term120137.getClass(), "allAi", false);
        setField(term120137, term120137.getClass(), "endButton", null);
        setBooleanField(term120137, term120137.getClass(), "aiOneAttackFound", false);
        setBooleanField(term120137, term120137.getClass(), "aiExitLoop", false);
        setBooleanField(term120137, term120137.getClass(), "aiTroops", false);
        setIntField(term120137, term120137.getClass(), "aiDelays", 0);
        setIntField(term120137, term120137.getClass(), "aiComponentIndex", 0);
        setField(term120137, term120137.getClass(), "starMap", null);
        setField(term120137, term120137.getClass(), "game", null);
        setField(term120137, term120137.getClass(), "nuked", null);
        setField(term120137, term120137.getClass(), "newsData", null);
        setField(term120137, term120137.getClass(), "bombers", null);
        setBooleanField(term120137, term120137.getClass(), "actionSpent", false);
        setIntField(term120137, term120137.getClass(), "whatHappened", 0);
        setBooleanField(term120137, term120137.getClass(), "isAlignmentXSet", false);
        setFloatField(term120137, term120137.getClass(), "alignmentX", 0.0F);
        setBooleanField(term120137, term120137.getClass(), "isAlignmentYSet", false);
        setFloatField(term120137, term120137.getClass(), "alignmentY", 0.0F);
        setField(term120137, term120137.getClass(), "ui", null);
        setField(term120137, term120137.getClass(), "listenerList", null);
        setField(term120137, term120137.getClass(), "clientProperties", null);
        setField(term120137, term120137.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term120137, term120137.getClass(), "autoscrolls", false);
        setField(term120137, term120137.getClass(), "border", null);
        setIntField(term120137, term120137.getClass(), "flags", 0);
        setField(term120137, term120137.getClass(), "inputVerifier", null);
        setBooleanField(term120137, term120137.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term120137, term120137.getClass(), "paintingChild", null);
        setField(term120137, term120137.getClass(), "popupMenu", null);
        setField(term120137, term120137.getClass(), "revalidateRunnableScheduled", null);
        setField(term120137, term120137.getClass(), "focusInputMap", null);
        setField(term120137, term120137.getClass(), "ancestorInputMap", null);
        setField(term120137, term120137.getClass(), "windowInputMap", null);
        setField(term120137, term120137.getClass(), "actionMap", null);
        setField(term120137, term120137.getClass(), "aaHint", null);
        setField(term120137, term120137.getClass(), "lcdRenderingHint", null);
        setField(term120137, term120137.getClass(), "component", null);
        setField(term120137, term120137.getClass(), "layoutMgr", null);
        setField(term120137, term120137.getClass(), "dispatcher", null);
        setField(term120137, term120137.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term120137, term120137.getClass(), "focusCycleRoot", false);
        setBooleanField(term120137, term120137.getClass(), "focusTraversalPolicyProvider", false);
        setField(term120137, term120137.getClass(), "printingThreads", null);
        setBooleanField(term120137, term120137.getClass(), "printing", false);
        setField(term120137, term120137.getClass(), "containerListener", null);
        setIntField(term120137, term120137.getClass(), "listeningChildren", 0);
        setIntField(term120137, term120137.getClass(), "listeningBoundsChildren", 0);
        setIntField(term120137, term120137.getClass(), "descendantsCount", 0);
        setField(term120137, term120137.getClass(), "preserveBackgroundColor", null);
        setIntField(term120137, term120137.getClass(), "numOfHWComponents", 0);
        setIntField(term120137, term120137.getClass(), "numOfLWComponents", 0);
        setField(term120137, term120137.getClass(), "modalComp", null);
        setField(term120137, term120137.getClass(), "modalAppContext", null);
        setIntField(term120137, term120137.getClass(), "containerSerializedDataVersion", 0);
        setField(term120137, term120137.getClass(), "peer", null);
        setField(term120137, term120137.getClass(), "parent", null);
        setField(term120137, term120137.getClass(), "appContext", null);
        setIntField(term120137, term120137.getClass(), "x", 0);
        setIntField(term120137, term120137.getClass(), "y", 0);
        setIntField(term120137, term120137.getClass(), "width", 0);
        setIntField(term120137, term120137.getClass(), "height", 0);
        setField(term120137, term120137.getClass(), "foreground", null);
        setField(term120137, term120137.getClass(), "background", null);
        setField(term120137, term120137.getClass(), "font", null);
        setField(term120137, term120137.getClass(), "peerFont", null);
        setField(term120137, term120137.getClass(), "cursor", null);
        setField(term120137, term120137.getClass(), "locale", null);
        setField(term120137, term120137.getClass(), "graphicsConfig", null);
        setField(term120137, term120137.getClass(), "bufferStrategy", null);
        setBooleanField(term120137, term120137.getClass(), "ignoreRepaint", false);
        setBooleanField(term120137, term120137.getClass(), "visible", false);
        setBooleanField(term120137, term120137.getClass(), "enabled", false);
        setBooleanField(term120137, term120137.getClass(), "valid", false);
        setField(term120137, term120137.getClass(), "dropTarget", null);
        setField(term120137, term120137.getClass(), "popups", null);
        setField(term120137, term120137.getClass(), "name", null);
        setBooleanField(term120137, term120137.getClass(), "nameExplicitlySet", false);
        setBooleanField(term120137, term120137.getClass(), "focusable", false);
        setIntField(term120137, term120137.getClass(), "isFocusTraversableOverridden", 0);
        setField(term120137, term120137.getClass(), "focusTraversalKeys", null);
        setBooleanField(term120137, term120137.getClass(), "focusTraversalKeysEnabled", false);
        setField(term120137, term120137.getClass(), "acc", null);
        setField(term120137, term120137.getClass(), "minSize", null);
        setBooleanField(term120137, term120137.getClass(), "minSizeSet", false);
        setField(term120137, term120137.getClass(), "prefSize", null);
        setBooleanField(term120137, term120137.getClass(), "prefSizeSet", false);
        setField(term120137, term120137.getClass(), "maxSize", null);
        setBooleanField(term120137, term120137.getClass(), "maxSizeSet", false);
        setField(term120137, term120137.getClass(), "componentOrientation", null);
        setBooleanField(term120137, term120137.getClass(), "newEventsOnly", false);
        setField(term120137, term120137.getClass(), "componentListener", null);
        setField(term120137, term120137.getClass(), "focusListener", null);
        setField(term120137, term120137.getClass(), "hierarchyListener", null);
        setField(term120137, term120137.getClass(), "hierarchyBoundsListener", null);
        setField(term120137, term120137.getClass(), "keyListener", null);
        setField(term120137, term120137.getClass(), "mouseListener", null);
        setField(term120137, term120137.getClass(), "mouseMotionListener", null);
        setField(term120137, term120137.getClass(), "mouseWheelListener", null);
        setField(term120137, term120137.getClass(), "inputMethodListener", null);
        setLongField(term120137, term120137.getClass(), "eventMask", 0L);
        setField(term120137, term120137.getClass(), "changeSupport", null);
        setField(term120137, term120137.getClass(), "objectLock", null);
        setBooleanField(term120137, term120137.getClass(), "isPacked", false);
        setIntField(term120137, term120137.getClass(), "boundsOp", 0);
        setField(term120137, term120137.getClass(), "compoundShape", null);
        setField(term120137, term120137.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term120137, term120137.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term120137, term120137.getClass(), "backgroundEraseDisabled", false);
        setField(term120137, term120137.getClass(), "eventCache", null);
        setBooleanField(term120137, term120137.getClass(), "coalescingEnabled", false);
        setBooleanField(term120137, term120137.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term120137, term120137.getClass(), "componentSerializedDataVersion", 0);
        setField(term120137, term120137.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "planetTurretShoot", argTypes, term120137, args);
    }

};


