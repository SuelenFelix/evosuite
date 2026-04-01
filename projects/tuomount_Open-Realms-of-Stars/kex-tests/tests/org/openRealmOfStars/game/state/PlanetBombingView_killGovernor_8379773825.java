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

public class PlanetBombingView_killGovernor_8379773825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122669;

    public PlanetBombingView_killGovernor_8379773825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122669 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term122669, term122669.getClass(), "totalPeople", null);
        setField(term122669, term122669.getClass(), "troopsPower", null);
        setField(term122669, term122669.getClass(), "defenseTurret", null);
        setField(term122669, term122669.getClass(), "totalBuildings", null);
        setField(term122669, term122669.getClass(), "ownerLabel", null);
        setField(term122669, term122669.getClass(), "planet", null);
        setField(term122669, term122669.getClass(), "fleet", null);
        setIntField(term122669, term122669.getClass(), "suppressionFire", 0);
        setField(term122669, term122669.getClass(), "shipsInFleet", null);
        setField(term122669, term122669.getClass(), "imgBase", null);
        setField(term122669, term122669.getClass(), "infoPanel", null);
        setField(term122669, term122669.getClass(), "textArea", null);
        setField(term122669, term122669.getClass(), "textLogger", null);
        setField(term122669, term122669.getClass(), "componentUsed", null);
        setIntField(term122669, term122669.getClass(), "shipIndex", 0);
        setIntField(term122669, term122669.getClass(), "usedComponentIndex", 0);
        setField(term122669, term122669.getClass(), "attacker", null);
        setIntField(term122669, term122669.getClass(), "attackPlayerIndex", 0);
        setField(term122669, term122669.getClass(), "defender", null);
        setIntField(term122669, term122669.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term122669, term122669.getClass(), "aiControlled", false);
        setBooleanField(term122669, term122669.getClass(), "allAi", false);
        setField(term122669, term122669.getClass(), "endButton", null);
        setBooleanField(term122669, term122669.getClass(), "aiOneAttackFound", false);
        setBooleanField(term122669, term122669.getClass(), "aiExitLoop", false);
        setBooleanField(term122669, term122669.getClass(), "aiTroops", false);
        setIntField(term122669, term122669.getClass(), "aiDelays", 0);
        setIntField(term122669, term122669.getClass(), "aiComponentIndex", 0);
        setField(term122669, term122669.getClass(), "starMap", null);
        setField(term122669, term122669.getClass(), "game", null);
        setField(term122669, term122669.getClass(), "nuked", null);
        setField(term122669, term122669.getClass(), "newsData", null);
        setField(term122669, term122669.getClass(), "bombers", null);
        setBooleanField(term122669, term122669.getClass(), "actionSpent", false);
        setIntField(term122669, term122669.getClass(), "whatHappened", 0);
        setBooleanField(term122669, term122669.getClass(), "isAlignmentXSet", false);
        setFloatField(term122669, term122669.getClass(), "alignmentX", 0.0F);
        setBooleanField(term122669, term122669.getClass(), "isAlignmentYSet", false);
        setFloatField(term122669, term122669.getClass(), "alignmentY", 0.0F);
        setField(term122669, term122669.getClass(), "ui", null);
        setField(term122669, term122669.getClass(), "listenerList", null);
        setField(term122669, term122669.getClass(), "clientProperties", null);
        setField(term122669, term122669.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term122669, term122669.getClass(), "autoscrolls", false);
        setField(term122669, term122669.getClass(), "border", null);
        setIntField(term122669, term122669.getClass(), "flags", 0);
        setField(term122669, term122669.getClass(), "inputVerifier", null);
        setBooleanField(term122669, term122669.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term122669, term122669.getClass(), "paintingChild", null);
        setField(term122669, term122669.getClass(), "popupMenu", null);
        setField(term122669, term122669.getClass(), "revalidateRunnableScheduled", null);
        setField(term122669, term122669.getClass(), "focusInputMap", null);
        setField(term122669, term122669.getClass(), "ancestorInputMap", null);
        setField(term122669, term122669.getClass(), "windowInputMap", null);
        setField(term122669, term122669.getClass(), "actionMap", null);
        setField(term122669, term122669.getClass(), "aaHint", null);
        setField(term122669, term122669.getClass(), "lcdRenderingHint", null);
        setField(term122669, term122669.getClass(), "component", null);
        setField(term122669, term122669.getClass(), "layoutMgr", null);
        setField(term122669, term122669.getClass(), "dispatcher", null);
        setField(term122669, term122669.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term122669, term122669.getClass(), "focusCycleRoot", false);
        setBooleanField(term122669, term122669.getClass(), "focusTraversalPolicyProvider", false);
        setField(term122669, term122669.getClass(), "printingThreads", null);
        setBooleanField(term122669, term122669.getClass(), "printing", false);
        setField(term122669, term122669.getClass(), "containerListener", null);
        setIntField(term122669, term122669.getClass(), "listeningChildren", 0);
        setIntField(term122669, term122669.getClass(), "listeningBoundsChildren", 0);
        setIntField(term122669, term122669.getClass(), "descendantsCount", 0);
        setField(term122669, term122669.getClass(), "preserveBackgroundColor", null);
        setIntField(term122669, term122669.getClass(), "numOfHWComponents", 0);
        setIntField(term122669, term122669.getClass(), "numOfLWComponents", 0);
        setField(term122669, term122669.getClass(), "modalComp", null);
        setField(term122669, term122669.getClass(), "modalAppContext", null);
        setIntField(term122669, term122669.getClass(), "containerSerializedDataVersion", 0);
        setField(term122669, term122669.getClass(), "peer", null);
        setField(term122669, term122669.getClass(), "parent", null);
        setField(term122669, term122669.getClass(), "appContext", null);
        setIntField(term122669, term122669.getClass(), "x", 0);
        setIntField(term122669, term122669.getClass(), "y", 0);
        setIntField(term122669, term122669.getClass(), "width", 0);
        setIntField(term122669, term122669.getClass(), "height", 0);
        setField(term122669, term122669.getClass(), "foreground", null);
        setField(term122669, term122669.getClass(), "background", null);
        setField(term122669, term122669.getClass(), "font", null);
        setField(term122669, term122669.getClass(), "peerFont", null);
        setField(term122669, term122669.getClass(), "cursor", null);
        setField(term122669, term122669.getClass(), "locale", null);
        setField(term122669, term122669.getClass(), "graphicsConfig", null);
        setField(term122669, term122669.getClass(), "bufferStrategy", null);
        setBooleanField(term122669, term122669.getClass(), "ignoreRepaint", false);
        setBooleanField(term122669, term122669.getClass(), "visible", false);
        setBooleanField(term122669, term122669.getClass(), "enabled", false);
        setBooleanField(term122669, term122669.getClass(), "valid", false);
        setField(term122669, term122669.getClass(), "dropTarget", null);
        setField(term122669, term122669.getClass(), "popups", null);
        setField(term122669, term122669.getClass(), "name", null);
        setBooleanField(term122669, term122669.getClass(), "nameExplicitlySet", false);
        setBooleanField(term122669, term122669.getClass(), "focusable", false);
        setIntField(term122669, term122669.getClass(), "isFocusTraversableOverridden", 0);
        setField(term122669, term122669.getClass(), "focusTraversalKeys", null);
        setBooleanField(term122669, term122669.getClass(), "focusTraversalKeysEnabled", false);
        setField(term122669, term122669.getClass(), "acc", null);
        setField(term122669, term122669.getClass(), "minSize", null);
        setBooleanField(term122669, term122669.getClass(), "minSizeSet", false);
        setField(term122669, term122669.getClass(), "prefSize", null);
        setBooleanField(term122669, term122669.getClass(), "prefSizeSet", false);
        setField(term122669, term122669.getClass(), "maxSize", null);
        setBooleanField(term122669, term122669.getClass(), "maxSizeSet", false);
        setField(term122669, term122669.getClass(), "componentOrientation", null);
        setBooleanField(term122669, term122669.getClass(), "newEventsOnly", false);
        setField(term122669, term122669.getClass(), "componentListener", null);
        setField(term122669, term122669.getClass(), "focusListener", null);
        setField(term122669, term122669.getClass(), "hierarchyListener", null);
        setField(term122669, term122669.getClass(), "hierarchyBoundsListener", null);
        setField(term122669, term122669.getClass(), "keyListener", null);
        setField(term122669, term122669.getClass(), "mouseListener", null);
        setField(term122669, term122669.getClass(), "mouseMotionListener", null);
        setField(term122669, term122669.getClass(), "mouseWheelListener", null);
        setField(term122669, term122669.getClass(), "inputMethodListener", null);
        setLongField(term122669, term122669.getClass(), "eventMask", 0L);
        setField(term122669, term122669.getClass(), "changeSupport", null);
        setField(term122669, term122669.getClass(), "objectLock", null);
        setBooleanField(term122669, term122669.getClass(), "isPacked", false);
        setIntField(term122669, term122669.getClass(), "boundsOp", 0);
        setField(term122669, term122669.getClass(), "compoundShape", null);
        setField(term122669, term122669.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term122669, term122669.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term122669, term122669.getClass(), "backgroundEraseDisabled", false);
        setField(term122669, term122669.getClass(), "eventCache", null);
        setBooleanField(term122669, term122669.getClass(), "coalescingEnabled", false);
        setBooleanField(term122669, term122669.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term122669, term122669.getClass(), "componentSerializedDataVersion", 0);
        setField(term122669, term122669.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "killGovernor", argTypes, term122669, args);
    }

};


