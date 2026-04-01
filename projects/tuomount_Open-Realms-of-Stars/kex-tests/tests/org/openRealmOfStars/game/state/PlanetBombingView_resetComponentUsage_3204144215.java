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

public class PlanetBombingView_resetComponentUsage_3204144215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103496;

    public PlanetBombingView_resetComponentUsage_3204144215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103496 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term103496, term103496.getClass(), "totalPeople", null);
        setField(term103496, term103496.getClass(), "troopsPower", null);
        setField(term103496, term103496.getClass(), "defenseTurret", null);
        setField(term103496, term103496.getClass(), "totalBuildings", null);
        setField(term103496, term103496.getClass(), "ownerLabel", null);
        setField(term103496, term103496.getClass(), "planet", null);
        setField(term103496, term103496.getClass(), "fleet", null);
        setIntField(term103496, term103496.getClass(), "suppressionFire", 0);
        setField(term103496, term103496.getClass(), "shipsInFleet", null);
        setField(term103496, term103496.getClass(), "imgBase", null);
        setField(term103496, term103496.getClass(), "infoPanel", null);
        setField(term103496, term103496.getClass(), "textArea", null);
        setField(term103496, term103496.getClass(), "textLogger", null);
        setField(term103496, term103496.getClass(), "componentUsed", null);
        setIntField(term103496, term103496.getClass(), "shipIndex", 0);
        setIntField(term103496, term103496.getClass(), "usedComponentIndex", 0);
        setField(term103496, term103496.getClass(), "attacker", null);
        setIntField(term103496, term103496.getClass(), "attackPlayerIndex", 0);
        setField(term103496, term103496.getClass(), "defender", null);
        setIntField(term103496, term103496.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term103496, term103496.getClass(), "aiControlled", false);
        setBooleanField(term103496, term103496.getClass(), "allAi", false);
        setField(term103496, term103496.getClass(), "endButton", null);
        setBooleanField(term103496, term103496.getClass(), "aiOneAttackFound", false);
        setBooleanField(term103496, term103496.getClass(), "aiExitLoop", false);
        setBooleanField(term103496, term103496.getClass(), "aiTroops", false);
        setIntField(term103496, term103496.getClass(), "aiDelays", 0);
        setIntField(term103496, term103496.getClass(), "aiComponentIndex", 0);
        setField(term103496, term103496.getClass(), "starMap", null);
        setField(term103496, term103496.getClass(), "game", null);
        setField(term103496, term103496.getClass(), "nuked", null);
        setField(term103496, term103496.getClass(), "newsData", null);
        setField(term103496, term103496.getClass(), "bombers", null);
        setBooleanField(term103496, term103496.getClass(), "actionSpent", false);
        setIntField(term103496, term103496.getClass(), "whatHappened", 0);
        setBooleanField(term103496, term103496.getClass(), "isAlignmentXSet", false);
        setFloatField(term103496, term103496.getClass(), "alignmentX", 0.0F);
        setBooleanField(term103496, term103496.getClass(), "isAlignmentYSet", false);
        setFloatField(term103496, term103496.getClass(), "alignmentY", 0.0F);
        setField(term103496, term103496.getClass(), "ui", null);
        setField(term103496, term103496.getClass(), "listenerList", null);
        setField(term103496, term103496.getClass(), "clientProperties", null);
        setField(term103496, term103496.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term103496, term103496.getClass(), "autoscrolls", false);
        setField(term103496, term103496.getClass(), "border", null);
        setIntField(term103496, term103496.getClass(), "flags", 0);
        setField(term103496, term103496.getClass(), "inputVerifier", null);
        setBooleanField(term103496, term103496.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term103496, term103496.getClass(), "paintingChild", null);
        setField(term103496, term103496.getClass(), "popupMenu", null);
        setField(term103496, term103496.getClass(), "revalidateRunnableScheduled", null);
        setField(term103496, term103496.getClass(), "focusInputMap", null);
        setField(term103496, term103496.getClass(), "ancestorInputMap", null);
        setField(term103496, term103496.getClass(), "windowInputMap", null);
        setField(term103496, term103496.getClass(), "actionMap", null);
        setField(term103496, term103496.getClass(), "aaHint", null);
        setField(term103496, term103496.getClass(), "lcdRenderingHint", null);
        setField(term103496, term103496.getClass(), "component", null);
        setField(term103496, term103496.getClass(), "layoutMgr", null);
        setField(term103496, term103496.getClass(), "dispatcher", null);
        setField(term103496, term103496.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term103496, term103496.getClass(), "focusCycleRoot", false);
        setBooleanField(term103496, term103496.getClass(), "focusTraversalPolicyProvider", false);
        setField(term103496, term103496.getClass(), "printingThreads", null);
        setBooleanField(term103496, term103496.getClass(), "printing", false);
        setField(term103496, term103496.getClass(), "containerListener", null);
        setIntField(term103496, term103496.getClass(), "listeningChildren", 0);
        setIntField(term103496, term103496.getClass(), "listeningBoundsChildren", 0);
        setIntField(term103496, term103496.getClass(), "descendantsCount", 0);
        setField(term103496, term103496.getClass(), "preserveBackgroundColor", null);
        setIntField(term103496, term103496.getClass(), "numOfHWComponents", 0);
        setIntField(term103496, term103496.getClass(), "numOfLWComponents", 0);
        setField(term103496, term103496.getClass(), "modalComp", null);
        setField(term103496, term103496.getClass(), "modalAppContext", null);
        setIntField(term103496, term103496.getClass(), "containerSerializedDataVersion", 0);
        setField(term103496, term103496.getClass(), "peer", null);
        setField(term103496, term103496.getClass(), "parent", null);
        setField(term103496, term103496.getClass(), "appContext", null);
        setIntField(term103496, term103496.getClass(), "x", 0);
        setIntField(term103496, term103496.getClass(), "y", 0);
        setIntField(term103496, term103496.getClass(), "width", 0);
        setIntField(term103496, term103496.getClass(), "height", 0);
        setField(term103496, term103496.getClass(), "foreground", null);
        setField(term103496, term103496.getClass(), "background", null);
        setField(term103496, term103496.getClass(), "font", null);
        setField(term103496, term103496.getClass(), "peerFont", null);
        setField(term103496, term103496.getClass(), "cursor", null);
        setField(term103496, term103496.getClass(), "locale", null);
        setField(term103496, term103496.getClass(), "graphicsConfig", null);
        setField(term103496, term103496.getClass(), "bufferStrategy", null);
        setBooleanField(term103496, term103496.getClass(), "ignoreRepaint", false);
        setBooleanField(term103496, term103496.getClass(), "visible", false);
        setBooleanField(term103496, term103496.getClass(), "enabled", false);
        setBooleanField(term103496, term103496.getClass(), "valid", false);
        setField(term103496, term103496.getClass(), "dropTarget", null);
        setField(term103496, term103496.getClass(), "popups", null);
        setField(term103496, term103496.getClass(), "name", null);
        setBooleanField(term103496, term103496.getClass(), "nameExplicitlySet", false);
        setBooleanField(term103496, term103496.getClass(), "focusable", false);
        setIntField(term103496, term103496.getClass(), "isFocusTraversableOverridden", 0);
        setField(term103496, term103496.getClass(), "focusTraversalKeys", null);
        setBooleanField(term103496, term103496.getClass(), "focusTraversalKeysEnabled", false);
        setField(term103496, term103496.getClass(), "acc", null);
        setField(term103496, term103496.getClass(), "minSize", null);
        setBooleanField(term103496, term103496.getClass(), "minSizeSet", false);
        setField(term103496, term103496.getClass(), "prefSize", null);
        setBooleanField(term103496, term103496.getClass(), "prefSizeSet", false);
        setField(term103496, term103496.getClass(), "maxSize", null);
        setBooleanField(term103496, term103496.getClass(), "maxSizeSet", false);
        setField(term103496, term103496.getClass(), "componentOrientation", null);
        setBooleanField(term103496, term103496.getClass(), "newEventsOnly", false);
        setField(term103496, term103496.getClass(), "componentListener", null);
        setField(term103496, term103496.getClass(), "focusListener", null);
        setField(term103496, term103496.getClass(), "hierarchyListener", null);
        setField(term103496, term103496.getClass(), "hierarchyBoundsListener", null);
        setField(term103496, term103496.getClass(), "keyListener", null);
        setField(term103496, term103496.getClass(), "mouseListener", null);
        setField(term103496, term103496.getClass(), "mouseMotionListener", null);
        setField(term103496, term103496.getClass(), "mouseWheelListener", null);
        setField(term103496, term103496.getClass(), "inputMethodListener", null);
        setLongField(term103496, term103496.getClass(), "eventMask", 0L);
        setField(term103496, term103496.getClass(), "changeSupport", null);
        setField(term103496, term103496.getClass(), "objectLock", null);
        setBooleanField(term103496, term103496.getClass(), "isPacked", false);
        setIntField(term103496, term103496.getClass(), "boundsOp", 0);
        setField(term103496, term103496.getClass(), "compoundShape", null);
        setField(term103496, term103496.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term103496, term103496.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term103496, term103496.getClass(), "backgroundEraseDisabled", false);
        setField(term103496, term103496.getClass(), "eventCache", null);
        setBooleanField(term103496, term103496.getClass(), "coalescingEnabled", false);
        setBooleanField(term103496, term103496.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term103496, term103496.getClass(), "componentSerializedDataVersion", 0);
        setField(term103496, term103496.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetComponentUsage", argTypes, term103496, args);
    }

};


