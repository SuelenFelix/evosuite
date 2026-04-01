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

public class PlanetBombingView_getFleet_224177247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104724;

    public PlanetBombingView_getFleet_224177247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104724 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term104724, term104724.getClass(), "totalPeople", null);
        setField(term104724, term104724.getClass(), "troopsPower", null);
        setField(term104724, term104724.getClass(), "defenseTurret", null);
        setField(term104724, term104724.getClass(), "totalBuildings", null);
        setField(term104724, term104724.getClass(), "ownerLabel", null);
        setField(term104724, term104724.getClass(), "planet", null);
        setField(term104724, term104724.getClass(), "fleet", null);
        setIntField(term104724, term104724.getClass(), "suppressionFire", 0);
        setField(term104724, term104724.getClass(), "shipsInFleet", null);
        setField(term104724, term104724.getClass(), "imgBase", null);
        setField(term104724, term104724.getClass(), "infoPanel", null);
        setField(term104724, term104724.getClass(), "textArea", null);
        setField(term104724, term104724.getClass(), "textLogger", null);
        setField(term104724, term104724.getClass(), "componentUsed", null);
        setIntField(term104724, term104724.getClass(), "shipIndex", 0);
        setIntField(term104724, term104724.getClass(), "usedComponentIndex", 0);
        setField(term104724, term104724.getClass(), "attacker", null);
        setIntField(term104724, term104724.getClass(), "attackPlayerIndex", 0);
        setField(term104724, term104724.getClass(), "defender", null);
        setIntField(term104724, term104724.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term104724, term104724.getClass(), "aiControlled", false);
        setBooleanField(term104724, term104724.getClass(), "allAi", false);
        setField(term104724, term104724.getClass(), "endButton", null);
        setBooleanField(term104724, term104724.getClass(), "aiOneAttackFound", false);
        setBooleanField(term104724, term104724.getClass(), "aiExitLoop", false);
        setBooleanField(term104724, term104724.getClass(), "aiTroops", false);
        setIntField(term104724, term104724.getClass(), "aiDelays", 0);
        setIntField(term104724, term104724.getClass(), "aiComponentIndex", 0);
        setField(term104724, term104724.getClass(), "starMap", null);
        setField(term104724, term104724.getClass(), "game", null);
        setField(term104724, term104724.getClass(), "nuked", null);
        setField(term104724, term104724.getClass(), "newsData", null);
        setField(term104724, term104724.getClass(), "bombers", null);
        setBooleanField(term104724, term104724.getClass(), "actionSpent", false);
        setIntField(term104724, term104724.getClass(), "whatHappened", 0);
        setBooleanField(term104724, term104724.getClass(), "isAlignmentXSet", false);
        setFloatField(term104724, term104724.getClass(), "alignmentX", 0.0F);
        setBooleanField(term104724, term104724.getClass(), "isAlignmentYSet", false);
        setFloatField(term104724, term104724.getClass(), "alignmentY", 0.0F);
        setField(term104724, term104724.getClass(), "ui", null);
        setField(term104724, term104724.getClass(), "listenerList", null);
        setField(term104724, term104724.getClass(), "clientProperties", null);
        setField(term104724, term104724.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term104724, term104724.getClass(), "autoscrolls", false);
        setField(term104724, term104724.getClass(), "border", null);
        setIntField(term104724, term104724.getClass(), "flags", 0);
        setField(term104724, term104724.getClass(), "inputVerifier", null);
        setBooleanField(term104724, term104724.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term104724, term104724.getClass(), "paintingChild", null);
        setField(term104724, term104724.getClass(), "popupMenu", null);
        setField(term104724, term104724.getClass(), "revalidateRunnableScheduled", null);
        setField(term104724, term104724.getClass(), "focusInputMap", null);
        setField(term104724, term104724.getClass(), "ancestorInputMap", null);
        setField(term104724, term104724.getClass(), "windowInputMap", null);
        setField(term104724, term104724.getClass(), "actionMap", null);
        setField(term104724, term104724.getClass(), "aaHint", null);
        setField(term104724, term104724.getClass(), "lcdRenderingHint", null);
        setField(term104724, term104724.getClass(), "component", null);
        setField(term104724, term104724.getClass(), "layoutMgr", null);
        setField(term104724, term104724.getClass(), "dispatcher", null);
        setField(term104724, term104724.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term104724, term104724.getClass(), "focusCycleRoot", false);
        setBooleanField(term104724, term104724.getClass(), "focusTraversalPolicyProvider", false);
        setField(term104724, term104724.getClass(), "printingThreads", null);
        setBooleanField(term104724, term104724.getClass(), "printing", false);
        setField(term104724, term104724.getClass(), "containerListener", null);
        setIntField(term104724, term104724.getClass(), "listeningChildren", 0);
        setIntField(term104724, term104724.getClass(), "listeningBoundsChildren", 0);
        setIntField(term104724, term104724.getClass(), "descendantsCount", 0);
        setField(term104724, term104724.getClass(), "preserveBackgroundColor", null);
        setIntField(term104724, term104724.getClass(), "numOfHWComponents", 0);
        setIntField(term104724, term104724.getClass(), "numOfLWComponents", 0);
        setField(term104724, term104724.getClass(), "modalComp", null);
        setField(term104724, term104724.getClass(), "modalAppContext", null);
        setIntField(term104724, term104724.getClass(), "containerSerializedDataVersion", 0);
        setField(term104724, term104724.getClass(), "peer", null);
        setField(term104724, term104724.getClass(), "parent", null);
        setField(term104724, term104724.getClass(), "appContext", null);
        setIntField(term104724, term104724.getClass(), "x", 0);
        setIntField(term104724, term104724.getClass(), "y", 0);
        setIntField(term104724, term104724.getClass(), "width", 0);
        setIntField(term104724, term104724.getClass(), "height", 0);
        setField(term104724, term104724.getClass(), "foreground", null);
        setField(term104724, term104724.getClass(), "background", null);
        setField(term104724, term104724.getClass(), "font", null);
        setField(term104724, term104724.getClass(), "peerFont", null);
        setField(term104724, term104724.getClass(), "cursor", null);
        setField(term104724, term104724.getClass(), "locale", null);
        setField(term104724, term104724.getClass(), "graphicsConfig", null);
        setField(term104724, term104724.getClass(), "bufferStrategy", null);
        setBooleanField(term104724, term104724.getClass(), "ignoreRepaint", false);
        setBooleanField(term104724, term104724.getClass(), "visible", false);
        setBooleanField(term104724, term104724.getClass(), "enabled", false);
        setBooleanField(term104724, term104724.getClass(), "valid", false);
        setField(term104724, term104724.getClass(), "dropTarget", null);
        setField(term104724, term104724.getClass(), "popups", null);
        setField(term104724, term104724.getClass(), "name", null);
        setBooleanField(term104724, term104724.getClass(), "nameExplicitlySet", false);
        setBooleanField(term104724, term104724.getClass(), "focusable", false);
        setIntField(term104724, term104724.getClass(), "isFocusTraversableOverridden", 0);
        setField(term104724, term104724.getClass(), "focusTraversalKeys", null);
        setBooleanField(term104724, term104724.getClass(), "focusTraversalKeysEnabled", false);
        setField(term104724, term104724.getClass(), "acc", null);
        setField(term104724, term104724.getClass(), "minSize", null);
        setBooleanField(term104724, term104724.getClass(), "minSizeSet", false);
        setField(term104724, term104724.getClass(), "prefSize", null);
        setBooleanField(term104724, term104724.getClass(), "prefSizeSet", false);
        setField(term104724, term104724.getClass(), "maxSize", null);
        setBooleanField(term104724, term104724.getClass(), "maxSizeSet", false);
        setField(term104724, term104724.getClass(), "componentOrientation", null);
        setBooleanField(term104724, term104724.getClass(), "newEventsOnly", false);
        setField(term104724, term104724.getClass(), "componentListener", null);
        setField(term104724, term104724.getClass(), "focusListener", null);
        setField(term104724, term104724.getClass(), "hierarchyListener", null);
        setField(term104724, term104724.getClass(), "hierarchyBoundsListener", null);
        setField(term104724, term104724.getClass(), "keyListener", null);
        setField(term104724, term104724.getClass(), "mouseListener", null);
        setField(term104724, term104724.getClass(), "mouseMotionListener", null);
        setField(term104724, term104724.getClass(), "mouseWheelListener", null);
        setField(term104724, term104724.getClass(), "inputMethodListener", null);
        setLongField(term104724, term104724.getClass(), "eventMask", 0L);
        setField(term104724, term104724.getClass(), "changeSupport", null);
        setField(term104724, term104724.getClass(), "objectLock", null);
        setBooleanField(term104724, term104724.getClass(), "isPacked", false);
        setIntField(term104724, term104724.getClass(), "boundsOp", 0);
        setField(term104724, term104724.getClass(), "compoundShape", null);
        setField(term104724, term104724.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term104724, term104724.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term104724, term104724.getClass(), "backgroundEraseDisabled", false);
        setField(term104724, term104724.getClass(), "eventCache", null);
        setBooleanField(term104724, term104724.getClass(), "coalescingEnabled", false);
        setBooleanField(term104724, term104724.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term104724, term104724.getClass(), "componentSerializedDataVersion", 0);
        setField(term104724, term104724.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleet", argTypes, term104724, args);
    }

};


