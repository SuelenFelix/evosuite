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

public class PlanetBombingView_getUsedComponentIndex_28353413445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150941;

    public PlanetBombingView_getUsedComponentIndex_28353413445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150941 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term150941, term150941.getClass(), "totalPeople", null);
        setField(term150941, term150941.getClass(), "troopsPower", null);
        setField(term150941, term150941.getClass(), "defenseTurret", null);
        setField(term150941, term150941.getClass(), "totalBuildings", null);
        setField(term150941, term150941.getClass(), "ownerLabel", null);
        setField(term150941, term150941.getClass(), "planet", null);
        setField(term150941, term150941.getClass(), "fleet", null);
        setIntField(term150941, term150941.getClass(), "suppressionFire", 0);
        setField(term150941, term150941.getClass(), "shipsInFleet", null);
        setField(term150941, term150941.getClass(), "imgBase", null);
        setField(term150941, term150941.getClass(), "infoPanel", null);
        setField(term150941, term150941.getClass(), "textArea", null);
        setField(term150941, term150941.getClass(), "textLogger", null);
        setField(term150941, term150941.getClass(), "componentUsed", null);
        setIntField(term150941, term150941.getClass(), "shipIndex", 0);
        setIntField(term150941, term150941.getClass(), "usedComponentIndex", 0);
        setField(term150941, term150941.getClass(), "attacker", null);
        setIntField(term150941, term150941.getClass(), "attackPlayerIndex", 0);
        setField(term150941, term150941.getClass(), "defender", null);
        setIntField(term150941, term150941.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term150941, term150941.getClass(), "aiControlled", false);
        setBooleanField(term150941, term150941.getClass(), "allAi", false);
        setField(term150941, term150941.getClass(), "endButton", null);
        setBooleanField(term150941, term150941.getClass(), "aiOneAttackFound", false);
        setBooleanField(term150941, term150941.getClass(), "aiExitLoop", false);
        setBooleanField(term150941, term150941.getClass(), "aiTroops", false);
        setIntField(term150941, term150941.getClass(), "aiDelays", 0);
        setIntField(term150941, term150941.getClass(), "aiComponentIndex", 0);
        setField(term150941, term150941.getClass(), "starMap", null);
        setField(term150941, term150941.getClass(), "game", null);
        setField(term150941, term150941.getClass(), "nuked", null);
        setField(term150941, term150941.getClass(), "newsData", null);
        setField(term150941, term150941.getClass(), "bombers", null);
        setBooleanField(term150941, term150941.getClass(), "actionSpent", false);
        setIntField(term150941, term150941.getClass(), "whatHappened", 0);
        setBooleanField(term150941, term150941.getClass(), "isAlignmentXSet", false);
        setFloatField(term150941, term150941.getClass(), "alignmentX", 0.0F);
        setBooleanField(term150941, term150941.getClass(), "isAlignmentYSet", false);
        setFloatField(term150941, term150941.getClass(), "alignmentY", 0.0F);
        setField(term150941, term150941.getClass(), "ui", null);
        setField(term150941, term150941.getClass(), "listenerList", null);
        setField(term150941, term150941.getClass(), "clientProperties", null);
        setField(term150941, term150941.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term150941, term150941.getClass(), "autoscrolls", false);
        setField(term150941, term150941.getClass(), "border", null);
        setIntField(term150941, term150941.getClass(), "flags", 0);
        setField(term150941, term150941.getClass(), "inputVerifier", null);
        setBooleanField(term150941, term150941.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term150941, term150941.getClass(), "paintingChild", null);
        setField(term150941, term150941.getClass(), "popupMenu", null);
        setField(term150941, term150941.getClass(), "revalidateRunnableScheduled", null);
        setField(term150941, term150941.getClass(), "focusInputMap", null);
        setField(term150941, term150941.getClass(), "ancestorInputMap", null);
        setField(term150941, term150941.getClass(), "windowInputMap", null);
        setField(term150941, term150941.getClass(), "actionMap", null);
        setField(term150941, term150941.getClass(), "aaHint", null);
        setField(term150941, term150941.getClass(), "lcdRenderingHint", null);
        setField(term150941, term150941.getClass(), "component", null);
        setField(term150941, term150941.getClass(), "layoutMgr", null);
        setField(term150941, term150941.getClass(), "dispatcher", null);
        setField(term150941, term150941.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term150941, term150941.getClass(), "focusCycleRoot", false);
        setBooleanField(term150941, term150941.getClass(), "focusTraversalPolicyProvider", false);
        setField(term150941, term150941.getClass(), "printingThreads", null);
        setBooleanField(term150941, term150941.getClass(), "printing", false);
        setField(term150941, term150941.getClass(), "containerListener", null);
        setIntField(term150941, term150941.getClass(), "listeningChildren", 0);
        setIntField(term150941, term150941.getClass(), "listeningBoundsChildren", 0);
        setIntField(term150941, term150941.getClass(), "descendantsCount", 0);
        setField(term150941, term150941.getClass(), "preserveBackgroundColor", null);
        setIntField(term150941, term150941.getClass(), "numOfHWComponents", 0);
        setIntField(term150941, term150941.getClass(), "numOfLWComponents", 0);
        setField(term150941, term150941.getClass(), "modalComp", null);
        setField(term150941, term150941.getClass(), "modalAppContext", null);
        setIntField(term150941, term150941.getClass(), "containerSerializedDataVersion", 0);
        setField(term150941, term150941.getClass(), "peer", null);
        setField(term150941, term150941.getClass(), "parent", null);
        setField(term150941, term150941.getClass(), "appContext", null);
        setIntField(term150941, term150941.getClass(), "x", 0);
        setIntField(term150941, term150941.getClass(), "y", 0);
        setIntField(term150941, term150941.getClass(), "width", 0);
        setIntField(term150941, term150941.getClass(), "height", 0);
        setField(term150941, term150941.getClass(), "foreground", null);
        setField(term150941, term150941.getClass(), "background", null);
        setField(term150941, term150941.getClass(), "font", null);
        setField(term150941, term150941.getClass(), "peerFont", null);
        setField(term150941, term150941.getClass(), "cursor", null);
        setField(term150941, term150941.getClass(), "locale", null);
        setField(term150941, term150941.getClass(), "graphicsConfig", null);
        setField(term150941, term150941.getClass(), "bufferStrategy", null);
        setBooleanField(term150941, term150941.getClass(), "ignoreRepaint", false);
        setBooleanField(term150941, term150941.getClass(), "visible", false);
        setBooleanField(term150941, term150941.getClass(), "enabled", false);
        setBooleanField(term150941, term150941.getClass(), "valid", false);
        setField(term150941, term150941.getClass(), "dropTarget", null);
        setField(term150941, term150941.getClass(), "popups", null);
        setField(term150941, term150941.getClass(), "name", null);
        setBooleanField(term150941, term150941.getClass(), "nameExplicitlySet", false);
        setBooleanField(term150941, term150941.getClass(), "focusable", false);
        setIntField(term150941, term150941.getClass(), "isFocusTraversableOverridden", 0);
        setField(term150941, term150941.getClass(), "focusTraversalKeys", null);
        setBooleanField(term150941, term150941.getClass(), "focusTraversalKeysEnabled", false);
        setField(term150941, term150941.getClass(), "acc", null);
        setField(term150941, term150941.getClass(), "minSize", null);
        setBooleanField(term150941, term150941.getClass(), "minSizeSet", false);
        setField(term150941, term150941.getClass(), "prefSize", null);
        setBooleanField(term150941, term150941.getClass(), "prefSizeSet", false);
        setField(term150941, term150941.getClass(), "maxSize", null);
        setBooleanField(term150941, term150941.getClass(), "maxSizeSet", false);
        setField(term150941, term150941.getClass(), "componentOrientation", null);
        setBooleanField(term150941, term150941.getClass(), "newEventsOnly", false);
        setField(term150941, term150941.getClass(), "componentListener", null);
        setField(term150941, term150941.getClass(), "focusListener", null);
        setField(term150941, term150941.getClass(), "hierarchyListener", null);
        setField(term150941, term150941.getClass(), "hierarchyBoundsListener", null);
        setField(term150941, term150941.getClass(), "keyListener", null);
        setField(term150941, term150941.getClass(), "mouseListener", null);
        setField(term150941, term150941.getClass(), "mouseMotionListener", null);
        setField(term150941, term150941.getClass(), "mouseWheelListener", null);
        setField(term150941, term150941.getClass(), "inputMethodListener", null);
        setLongField(term150941, term150941.getClass(), "eventMask", 0L);
        setField(term150941, term150941.getClass(), "changeSupport", null);
        setField(term150941, term150941.getClass(), "objectLock", null);
        setBooleanField(term150941, term150941.getClass(), "isPacked", false);
        setIntField(term150941, term150941.getClass(), "boundsOp", 0);
        setField(term150941, term150941.getClass(), "compoundShape", null);
        setField(term150941, term150941.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term150941, term150941.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term150941, term150941.getClass(), "backgroundEraseDisabled", false);
        setField(term150941, term150941.getClass(), "eventCache", null);
        setBooleanField(term150941, term150941.getClass(), "coalescingEnabled", false);
        setBooleanField(term150941, term150941.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term150941, term150941.getClass(), "componentSerializedDataVersion", 0);
        setField(term150941, term150941.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsedComponentIndex", argTypes, term150941, args);
    }

};


