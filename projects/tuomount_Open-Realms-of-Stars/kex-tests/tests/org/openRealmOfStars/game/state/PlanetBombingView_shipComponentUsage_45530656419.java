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

public class PlanetBombingView_shipComponentUsage_45530656419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118869;
     Object term118924;

    public PlanetBombingView_shipComponentUsage_45530656419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118869 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term118869, term118869.getClass(), "totalPeople", null);
        setField(term118869, term118869.getClass(), "troopsPower", null);
        setField(term118869, term118869.getClass(), "defenseTurret", null);
        setField(term118869, term118869.getClass(), "totalBuildings", null);
        setField(term118869, term118869.getClass(), "ownerLabel", null);
        setField(term118869, term118869.getClass(), "planet", null);
        setField(term118869, term118869.getClass(), "fleet", null);
        setIntField(term118869, term118869.getClass(), "suppressionFire", 0);
        setField(term118869, term118869.getClass(), "shipsInFleet", null);
        setField(term118869, term118869.getClass(), "imgBase", null);
        setField(term118869, term118869.getClass(), "infoPanel", null);
        setField(term118869, term118869.getClass(), "textArea", null);
        setField(term118869, term118869.getClass(), "textLogger", null);
        setField(term118869, term118869.getClass(), "componentUsed", null);
        setIntField(term118869, term118869.getClass(), "shipIndex", 0);
        setIntField(term118869, term118869.getClass(), "usedComponentIndex", 0);
        setField(term118869, term118869.getClass(), "attacker", null);
        setIntField(term118869, term118869.getClass(), "attackPlayerIndex", 0);
        setField(term118869, term118869.getClass(), "defender", null);
        setIntField(term118869, term118869.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term118869, term118869.getClass(), "aiControlled", false);
        setBooleanField(term118869, term118869.getClass(), "allAi", false);
        setField(term118869, term118869.getClass(), "endButton", null);
        setBooleanField(term118869, term118869.getClass(), "aiOneAttackFound", false);
        setBooleanField(term118869, term118869.getClass(), "aiExitLoop", false);
        setBooleanField(term118869, term118869.getClass(), "aiTroops", false);
        setIntField(term118869, term118869.getClass(), "aiDelays", 0);
        setIntField(term118869, term118869.getClass(), "aiComponentIndex", 0);
        setField(term118869, term118869.getClass(), "starMap", null);
        setField(term118869, term118869.getClass(), "game", null);
        setField(term118869, term118869.getClass(), "nuked", null);
        setField(term118869, term118869.getClass(), "newsData", null);
        setField(term118869, term118869.getClass(), "bombers", null);
        setBooleanField(term118869, term118869.getClass(), "actionSpent", false);
        setIntField(term118869, term118869.getClass(), "whatHappened", 0);
        setBooleanField(term118869, term118869.getClass(), "isAlignmentXSet", false);
        setFloatField(term118869, term118869.getClass(), "alignmentX", 0.0F);
        setBooleanField(term118869, term118869.getClass(), "isAlignmentYSet", false);
        setFloatField(term118869, term118869.getClass(), "alignmentY", 0.0F);
        setField(term118869, term118869.getClass(), "ui", null);
        setField(term118869, term118869.getClass(), "listenerList", null);
        setField(term118869, term118869.getClass(), "clientProperties", null);
        setField(term118869, term118869.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term118869, term118869.getClass(), "autoscrolls", false);
        setField(term118869, term118869.getClass(), "border", null);
        setIntField(term118869, term118869.getClass(), "flags", 0);
        setField(term118869, term118869.getClass(), "inputVerifier", null);
        setBooleanField(term118869, term118869.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term118869, term118869.getClass(), "paintingChild", null);
        setField(term118869, term118869.getClass(), "popupMenu", null);
        setField(term118869, term118869.getClass(), "revalidateRunnableScheduled", null);
        setField(term118869, term118869.getClass(), "focusInputMap", null);
        setField(term118869, term118869.getClass(), "ancestorInputMap", null);
        setField(term118869, term118869.getClass(), "windowInputMap", null);
        setField(term118869, term118869.getClass(), "actionMap", null);
        setField(term118869, term118869.getClass(), "aaHint", null);
        setField(term118869, term118869.getClass(), "lcdRenderingHint", null);
        setField(term118869, term118869.getClass(), "component", null);
        setField(term118869, term118869.getClass(), "layoutMgr", null);
        setField(term118869, term118869.getClass(), "dispatcher", null);
        setField(term118869, term118869.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term118869, term118869.getClass(), "focusCycleRoot", false);
        setBooleanField(term118869, term118869.getClass(), "focusTraversalPolicyProvider", false);
        setField(term118869, term118869.getClass(), "printingThreads", null);
        setBooleanField(term118869, term118869.getClass(), "printing", false);
        setField(term118869, term118869.getClass(), "containerListener", null);
        setIntField(term118869, term118869.getClass(), "listeningChildren", 0);
        setIntField(term118869, term118869.getClass(), "listeningBoundsChildren", 0);
        setIntField(term118869, term118869.getClass(), "descendantsCount", 0);
        setField(term118869, term118869.getClass(), "preserveBackgroundColor", null);
        setIntField(term118869, term118869.getClass(), "numOfHWComponents", 0);
        setIntField(term118869, term118869.getClass(), "numOfLWComponents", 0);
        setField(term118869, term118869.getClass(), "modalComp", null);
        setField(term118869, term118869.getClass(), "modalAppContext", null);
        setIntField(term118869, term118869.getClass(), "containerSerializedDataVersion", 0);
        setField(term118869, term118869.getClass(), "peer", null);
        setField(term118869, term118869.getClass(), "parent", null);
        setField(term118869, term118869.getClass(), "appContext", null);
        setIntField(term118869, term118869.getClass(), "x", 0);
        setIntField(term118869, term118869.getClass(), "y", 0);
        setIntField(term118869, term118869.getClass(), "width", 0);
        setIntField(term118869, term118869.getClass(), "height", 0);
        setField(term118869, term118869.getClass(), "foreground", null);
        setField(term118869, term118869.getClass(), "background", null);
        setField(term118869, term118869.getClass(), "font", null);
        setField(term118869, term118869.getClass(), "peerFont", null);
        setField(term118869, term118869.getClass(), "cursor", null);
        setField(term118869, term118869.getClass(), "locale", null);
        setField(term118869, term118869.getClass(), "graphicsConfig", null);
        setField(term118869, term118869.getClass(), "bufferStrategy", null);
        setBooleanField(term118869, term118869.getClass(), "ignoreRepaint", false);
        setBooleanField(term118869, term118869.getClass(), "visible", false);
        setBooleanField(term118869, term118869.getClass(), "enabled", false);
        setBooleanField(term118869, term118869.getClass(), "valid", false);
        setField(term118869, term118869.getClass(), "dropTarget", null);
        setField(term118869, term118869.getClass(), "popups", null);
        setField(term118869, term118869.getClass(), "name", null);
        setBooleanField(term118869, term118869.getClass(), "nameExplicitlySet", false);
        setBooleanField(term118869, term118869.getClass(), "focusable", false);
        setIntField(term118869, term118869.getClass(), "isFocusTraversableOverridden", 0);
        setField(term118869, term118869.getClass(), "focusTraversalKeys", null);
        setBooleanField(term118869, term118869.getClass(), "focusTraversalKeysEnabled", false);
        setField(term118869, term118869.getClass(), "acc", null);
        setField(term118869, term118869.getClass(), "minSize", null);
        setBooleanField(term118869, term118869.getClass(), "minSizeSet", false);
        setField(term118869, term118869.getClass(), "prefSize", null);
        setBooleanField(term118869, term118869.getClass(), "prefSizeSet", false);
        setField(term118869, term118869.getClass(), "maxSize", null);
        setBooleanField(term118869, term118869.getClass(), "maxSizeSet", false);
        setField(term118869, term118869.getClass(), "componentOrientation", null);
        setBooleanField(term118869, term118869.getClass(), "newEventsOnly", false);
        setField(term118869, term118869.getClass(), "componentListener", null);
        setField(term118869, term118869.getClass(), "focusListener", null);
        setField(term118869, term118869.getClass(), "hierarchyListener", null);
        setField(term118869, term118869.getClass(), "hierarchyBoundsListener", null);
        setField(term118869, term118869.getClass(), "keyListener", null);
        setField(term118869, term118869.getClass(), "mouseListener", null);
        setField(term118869, term118869.getClass(), "mouseMotionListener", null);
        setField(term118869, term118869.getClass(), "mouseWheelListener", null);
        setField(term118869, term118869.getClass(), "inputMethodListener", null);
        setLongField(term118869, term118869.getClass(), "eventMask", 0L);
        setField(term118869, term118869.getClass(), "changeSupport", null);
        setField(term118869, term118869.getClass(), "objectLock", null);
        setBooleanField(term118869, term118869.getClass(), "isPacked", false);
        setIntField(term118869, term118869.getClass(), "boundsOp", 0);
        setField(term118869, term118869.getClass(), "compoundShape", null);
        setField(term118869, term118869.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term118869, term118869.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term118869, term118869.getClass(), "backgroundEraseDisabled", false);
        setField(term118869, term118869.getClass(), "eventCache", null);
        setBooleanField(term118869, term118869.getClass(), "coalescingEnabled", false);
        setBooleanField(term118869, term118869.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term118869, term118869.getClass(), "componentSerializedDataVersion", 0);
        setField(term118869, term118869.getClass(), "accessibleContext", null);
        term118924 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term118924;
        callMethod(klass, "shipComponentUsage", argTypes, term118869, args);
    }

};


