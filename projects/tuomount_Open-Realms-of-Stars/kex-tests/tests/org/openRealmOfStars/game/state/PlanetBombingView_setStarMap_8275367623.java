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

public class PlanetBombingView_setStarMap_8275367623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102188;

    public PlanetBombingView_setStarMap_8275367623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102188 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term102188, term102188.getClass(), "totalPeople", null);
        setField(term102188, term102188.getClass(), "troopsPower", null);
        setField(term102188, term102188.getClass(), "defenseTurret", null);
        setField(term102188, term102188.getClass(), "totalBuildings", null);
        setField(term102188, term102188.getClass(), "ownerLabel", null);
        setField(term102188, term102188.getClass(), "planet", null);
        setField(term102188, term102188.getClass(), "fleet", null);
        setIntField(term102188, term102188.getClass(), "suppressionFire", 0);
        setField(term102188, term102188.getClass(), "shipsInFleet", null);
        setField(term102188, term102188.getClass(), "imgBase", null);
        setField(term102188, term102188.getClass(), "infoPanel", null);
        setField(term102188, term102188.getClass(), "textArea", null);
        setField(term102188, term102188.getClass(), "textLogger", null);
        setField(term102188, term102188.getClass(), "componentUsed", null);
        setIntField(term102188, term102188.getClass(), "shipIndex", 0);
        setIntField(term102188, term102188.getClass(), "usedComponentIndex", 0);
        setField(term102188, term102188.getClass(), "attacker", null);
        setIntField(term102188, term102188.getClass(), "attackPlayerIndex", 0);
        setField(term102188, term102188.getClass(), "defender", null);
        setIntField(term102188, term102188.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term102188, term102188.getClass(), "aiControlled", false);
        setBooleanField(term102188, term102188.getClass(), "allAi", false);
        setField(term102188, term102188.getClass(), "endButton", null);
        setBooleanField(term102188, term102188.getClass(), "aiOneAttackFound", false);
        setBooleanField(term102188, term102188.getClass(), "aiExitLoop", false);
        setBooleanField(term102188, term102188.getClass(), "aiTroops", false);
        setIntField(term102188, term102188.getClass(), "aiDelays", 0);
        setIntField(term102188, term102188.getClass(), "aiComponentIndex", 0);
        setField(term102188, term102188.getClass(), "starMap", null);
        setField(term102188, term102188.getClass(), "game", null);
        setField(term102188, term102188.getClass(), "nuked", null);
        setField(term102188, term102188.getClass(), "newsData", null);
        setField(term102188, term102188.getClass(), "bombers", null);
        setBooleanField(term102188, term102188.getClass(), "actionSpent", false);
        setIntField(term102188, term102188.getClass(), "whatHappened", 0);
        setBooleanField(term102188, term102188.getClass(), "isAlignmentXSet", false);
        setFloatField(term102188, term102188.getClass(), "alignmentX", 0.0F);
        setBooleanField(term102188, term102188.getClass(), "isAlignmentYSet", false);
        setFloatField(term102188, term102188.getClass(), "alignmentY", 0.0F);
        setField(term102188, term102188.getClass(), "ui", null);
        setField(term102188, term102188.getClass(), "listenerList", null);
        setField(term102188, term102188.getClass(), "clientProperties", null);
        setField(term102188, term102188.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term102188, term102188.getClass(), "autoscrolls", false);
        setField(term102188, term102188.getClass(), "border", null);
        setIntField(term102188, term102188.getClass(), "flags", 0);
        setField(term102188, term102188.getClass(), "inputVerifier", null);
        setBooleanField(term102188, term102188.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term102188, term102188.getClass(), "paintingChild", null);
        setField(term102188, term102188.getClass(), "popupMenu", null);
        setField(term102188, term102188.getClass(), "revalidateRunnableScheduled", null);
        setField(term102188, term102188.getClass(), "focusInputMap", null);
        setField(term102188, term102188.getClass(), "ancestorInputMap", null);
        setField(term102188, term102188.getClass(), "windowInputMap", null);
        setField(term102188, term102188.getClass(), "actionMap", null);
        setField(term102188, term102188.getClass(), "aaHint", null);
        setField(term102188, term102188.getClass(), "lcdRenderingHint", null);
        setField(term102188, term102188.getClass(), "component", null);
        setField(term102188, term102188.getClass(), "layoutMgr", null);
        setField(term102188, term102188.getClass(), "dispatcher", null);
        setField(term102188, term102188.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term102188, term102188.getClass(), "focusCycleRoot", false);
        setBooleanField(term102188, term102188.getClass(), "focusTraversalPolicyProvider", false);
        setField(term102188, term102188.getClass(), "printingThreads", null);
        setBooleanField(term102188, term102188.getClass(), "printing", false);
        setField(term102188, term102188.getClass(), "containerListener", null);
        setIntField(term102188, term102188.getClass(), "listeningChildren", 0);
        setIntField(term102188, term102188.getClass(), "listeningBoundsChildren", 0);
        setIntField(term102188, term102188.getClass(), "descendantsCount", 0);
        setField(term102188, term102188.getClass(), "preserveBackgroundColor", null);
        setIntField(term102188, term102188.getClass(), "numOfHWComponents", 0);
        setIntField(term102188, term102188.getClass(), "numOfLWComponents", 0);
        setField(term102188, term102188.getClass(), "modalComp", null);
        setField(term102188, term102188.getClass(), "modalAppContext", null);
        setIntField(term102188, term102188.getClass(), "containerSerializedDataVersion", 0);
        setField(term102188, term102188.getClass(), "peer", null);
        setField(term102188, term102188.getClass(), "parent", null);
        setField(term102188, term102188.getClass(), "appContext", null);
        setIntField(term102188, term102188.getClass(), "x", 0);
        setIntField(term102188, term102188.getClass(), "y", 0);
        setIntField(term102188, term102188.getClass(), "width", 0);
        setIntField(term102188, term102188.getClass(), "height", 0);
        setField(term102188, term102188.getClass(), "foreground", null);
        setField(term102188, term102188.getClass(), "background", null);
        setField(term102188, term102188.getClass(), "font", null);
        setField(term102188, term102188.getClass(), "peerFont", null);
        setField(term102188, term102188.getClass(), "cursor", null);
        setField(term102188, term102188.getClass(), "locale", null);
        setField(term102188, term102188.getClass(), "graphicsConfig", null);
        setField(term102188, term102188.getClass(), "bufferStrategy", null);
        setBooleanField(term102188, term102188.getClass(), "ignoreRepaint", false);
        setBooleanField(term102188, term102188.getClass(), "visible", false);
        setBooleanField(term102188, term102188.getClass(), "enabled", false);
        setBooleanField(term102188, term102188.getClass(), "valid", false);
        setField(term102188, term102188.getClass(), "dropTarget", null);
        setField(term102188, term102188.getClass(), "popups", null);
        setField(term102188, term102188.getClass(), "name", null);
        setBooleanField(term102188, term102188.getClass(), "nameExplicitlySet", false);
        setBooleanField(term102188, term102188.getClass(), "focusable", false);
        setIntField(term102188, term102188.getClass(), "isFocusTraversableOverridden", 0);
        setField(term102188, term102188.getClass(), "focusTraversalKeys", null);
        setBooleanField(term102188, term102188.getClass(), "focusTraversalKeysEnabled", false);
        setField(term102188, term102188.getClass(), "acc", null);
        setField(term102188, term102188.getClass(), "minSize", null);
        setBooleanField(term102188, term102188.getClass(), "minSizeSet", false);
        setField(term102188, term102188.getClass(), "prefSize", null);
        setBooleanField(term102188, term102188.getClass(), "prefSizeSet", false);
        setField(term102188, term102188.getClass(), "maxSize", null);
        setBooleanField(term102188, term102188.getClass(), "maxSizeSet", false);
        setField(term102188, term102188.getClass(), "componentOrientation", null);
        setBooleanField(term102188, term102188.getClass(), "newEventsOnly", false);
        setField(term102188, term102188.getClass(), "componentListener", null);
        setField(term102188, term102188.getClass(), "focusListener", null);
        setField(term102188, term102188.getClass(), "hierarchyListener", null);
        setField(term102188, term102188.getClass(), "hierarchyBoundsListener", null);
        setField(term102188, term102188.getClass(), "keyListener", null);
        setField(term102188, term102188.getClass(), "mouseListener", null);
        setField(term102188, term102188.getClass(), "mouseMotionListener", null);
        setField(term102188, term102188.getClass(), "mouseWheelListener", null);
        setField(term102188, term102188.getClass(), "inputMethodListener", null);
        setLongField(term102188, term102188.getClass(), "eventMask", 0L);
        setField(term102188, term102188.getClass(), "changeSupport", null);
        setField(term102188, term102188.getClass(), "objectLock", null);
        setBooleanField(term102188, term102188.getClass(), "isPacked", false);
        setIntField(term102188, term102188.getClass(), "boundsOp", 0);
        setField(term102188, term102188.getClass(), "compoundShape", null);
        setField(term102188, term102188.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term102188, term102188.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term102188, term102188.getClass(), "backgroundEraseDisabled", false);
        setField(term102188, term102188.getClass(), "eventCache", null);
        setBooleanField(term102188, term102188.getClass(), "coalescingEnabled", false);
        setBooleanField(term102188, term102188.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term102188, term102188.getClass(), "componentSerializedDataVersion", 0);
        setField(term102188, term102188.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStarMap", argTypes, term102188, args);
    }

};


