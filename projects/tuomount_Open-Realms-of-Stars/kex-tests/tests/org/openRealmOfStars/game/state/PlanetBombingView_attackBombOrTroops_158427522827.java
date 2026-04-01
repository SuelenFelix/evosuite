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

public class PlanetBombingView_attackBombOrTroops_158427522827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123881;

    public PlanetBombingView_attackBombOrTroops_158427522827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123881 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term123881, term123881.getClass(), "totalPeople", null);
        setField(term123881, term123881.getClass(), "troopsPower", null);
        setField(term123881, term123881.getClass(), "defenseTurret", null);
        setField(term123881, term123881.getClass(), "totalBuildings", null);
        setField(term123881, term123881.getClass(), "ownerLabel", null);
        setField(term123881, term123881.getClass(), "planet", null);
        setField(term123881, term123881.getClass(), "fleet", null);
        setIntField(term123881, term123881.getClass(), "suppressionFire", 0);
        setField(term123881, term123881.getClass(), "shipsInFleet", null);
        setField(term123881, term123881.getClass(), "imgBase", null);
        setField(term123881, term123881.getClass(), "infoPanel", null);
        setField(term123881, term123881.getClass(), "textArea", null);
        setField(term123881, term123881.getClass(), "textLogger", null);
        setField(term123881, term123881.getClass(), "componentUsed", null);
        setIntField(term123881, term123881.getClass(), "shipIndex", 0);
        setIntField(term123881, term123881.getClass(), "usedComponentIndex", 0);
        setField(term123881, term123881.getClass(), "attacker", null);
        setIntField(term123881, term123881.getClass(), "attackPlayerIndex", 0);
        setField(term123881, term123881.getClass(), "defender", null);
        setIntField(term123881, term123881.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term123881, term123881.getClass(), "aiControlled", false);
        setBooleanField(term123881, term123881.getClass(), "allAi", false);
        setField(term123881, term123881.getClass(), "endButton", null);
        setBooleanField(term123881, term123881.getClass(), "aiOneAttackFound", false);
        setBooleanField(term123881, term123881.getClass(), "aiExitLoop", false);
        setBooleanField(term123881, term123881.getClass(), "aiTroops", false);
        setIntField(term123881, term123881.getClass(), "aiDelays", 0);
        setIntField(term123881, term123881.getClass(), "aiComponentIndex", 0);
        setField(term123881, term123881.getClass(), "starMap", null);
        setField(term123881, term123881.getClass(), "game", null);
        setField(term123881, term123881.getClass(), "nuked", null);
        setField(term123881, term123881.getClass(), "newsData", null);
        setField(term123881, term123881.getClass(), "bombers", null);
        setBooleanField(term123881, term123881.getClass(), "actionSpent", false);
        setIntField(term123881, term123881.getClass(), "whatHappened", 0);
        setBooleanField(term123881, term123881.getClass(), "isAlignmentXSet", false);
        setFloatField(term123881, term123881.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123881, term123881.getClass(), "isAlignmentYSet", false);
        setFloatField(term123881, term123881.getClass(), "alignmentY", 0.0F);
        setField(term123881, term123881.getClass(), "ui", null);
        setField(term123881, term123881.getClass(), "listenerList", null);
        setField(term123881, term123881.getClass(), "clientProperties", null);
        setField(term123881, term123881.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123881, term123881.getClass(), "autoscrolls", false);
        setField(term123881, term123881.getClass(), "border", null);
        setIntField(term123881, term123881.getClass(), "flags", 0);
        setField(term123881, term123881.getClass(), "inputVerifier", null);
        setBooleanField(term123881, term123881.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123881, term123881.getClass(), "paintingChild", null);
        setField(term123881, term123881.getClass(), "popupMenu", null);
        setField(term123881, term123881.getClass(), "revalidateRunnableScheduled", null);
        setField(term123881, term123881.getClass(), "focusInputMap", null);
        setField(term123881, term123881.getClass(), "ancestorInputMap", null);
        setField(term123881, term123881.getClass(), "windowInputMap", null);
        setField(term123881, term123881.getClass(), "actionMap", null);
        setField(term123881, term123881.getClass(), "aaHint", null);
        setField(term123881, term123881.getClass(), "lcdRenderingHint", null);
        setField(term123881, term123881.getClass(), "component", null);
        setField(term123881, term123881.getClass(), "layoutMgr", null);
        setField(term123881, term123881.getClass(), "dispatcher", null);
        setField(term123881, term123881.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123881, term123881.getClass(), "focusCycleRoot", false);
        setBooleanField(term123881, term123881.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123881, term123881.getClass(), "printingThreads", null);
        setBooleanField(term123881, term123881.getClass(), "printing", false);
        setField(term123881, term123881.getClass(), "containerListener", null);
        setIntField(term123881, term123881.getClass(), "listeningChildren", 0);
        setIntField(term123881, term123881.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123881, term123881.getClass(), "descendantsCount", 0);
        setField(term123881, term123881.getClass(), "preserveBackgroundColor", null);
        setIntField(term123881, term123881.getClass(), "numOfHWComponents", 0);
        setIntField(term123881, term123881.getClass(), "numOfLWComponents", 0);
        setField(term123881, term123881.getClass(), "modalComp", null);
        setField(term123881, term123881.getClass(), "modalAppContext", null);
        setIntField(term123881, term123881.getClass(), "containerSerializedDataVersion", 0);
        setField(term123881, term123881.getClass(), "peer", null);
        setField(term123881, term123881.getClass(), "parent", null);
        setField(term123881, term123881.getClass(), "appContext", null);
        setIntField(term123881, term123881.getClass(), "x", 0);
        setIntField(term123881, term123881.getClass(), "y", 0);
        setIntField(term123881, term123881.getClass(), "width", 0);
        setIntField(term123881, term123881.getClass(), "height", 0);
        setField(term123881, term123881.getClass(), "foreground", null);
        setField(term123881, term123881.getClass(), "background", null);
        setField(term123881, term123881.getClass(), "font", null);
        setField(term123881, term123881.getClass(), "peerFont", null);
        setField(term123881, term123881.getClass(), "cursor", null);
        setField(term123881, term123881.getClass(), "locale", null);
        setField(term123881, term123881.getClass(), "graphicsConfig", null);
        setField(term123881, term123881.getClass(), "bufferStrategy", null);
        setBooleanField(term123881, term123881.getClass(), "ignoreRepaint", false);
        setBooleanField(term123881, term123881.getClass(), "visible", false);
        setBooleanField(term123881, term123881.getClass(), "enabled", false);
        setBooleanField(term123881, term123881.getClass(), "valid", false);
        setField(term123881, term123881.getClass(), "dropTarget", null);
        setField(term123881, term123881.getClass(), "popups", null);
        setField(term123881, term123881.getClass(), "name", null);
        setBooleanField(term123881, term123881.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123881, term123881.getClass(), "focusable", false);
        setIntField(term123881, term123881.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123881, term123881.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123881, term123881.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123881, term123881.getClass(), "acc", null);
        setField(term123881, term123881.getClass(), "minSize", null);
        setBooleanField(term123881, term123881.getClass(), "minSizeSet", false);
        setField(term123881, term123881.getClass(), "prefSize", null);
        setBooleanField(term123881, term123881.getClass(), "prefSizeSet", false);
        setField(term123881, term123881.getClass(), "maxSize", null);
        setBooleanField(term123881, term123881.getClass(), "maxSizeSet", false);
        setField(term123881, term123881.getClass(), "componentOrientation", null);
        setBooleanField(term123881, term123881.getClass(), "newEventsOnly", false);
        setField(term123881, term123881.getClass(), "componentListener", null);
        setField(term123881, term123881.getClass(), "focusListener", null);
        setField(term123881, term123881.getClass(), "hierarchyListener", null);
        setField(term123881, term123881.getClass(), "hierarchyBoundsListener", null);
        setField(term123881, term123881.getClass(), "keyListener", null);
        setField(term123881, term123881.getClass(), "mouseListener", null);
        setField(term123881, term123881.getClass(), "mouseMotionListener", null);
        setField(term123881, term123881.getClass(), "mouseWheelListener", null);
        setField(term123881, term123881.getClass(), "inputMethodListener", null);
        setLongField(term123881, term123881.getClass(), "eventMask", 0L);
        setField(term123881, term123881.getClass(), "changeSupport", null);
        setField(term123881, term123881.getClass(), "objectLock", null);
        setBooleanField(term123881, term123881.getClass(), "isPacked", false);
        setIntField(term123881, term123881.getClass(), "boundsOp", 0);
        setField(term123881, term123881.getClass(), "compoundShape", null);
        setField(term123881, term123881.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123881, term123881.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123881, term123881.getClass(), "backgroundEraseDisabled", false);
        setField(term123881, term123881.getClass(), "eventCache", null);
        setBooleanField(term123881, term123881.getClass(), "coalescingEnabled", false);
        setBooleanField(term123881, term123881.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123881, term123881.getClass(), "componentSerializedDataVersion", 0);
        setField(term123881, term123881.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "attackBombOrTroops", argTypes, term123881, args);
    }

};


