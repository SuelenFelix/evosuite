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

public class PlanetBombingView_actionsLeft_203420411441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148350;

    public PlanetBombingView_actionsLeft_203420411441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148350 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term148350, term148350.getClass(), "totalPeople", null);
        setField(term148350, term148350.getClass(), "troopsPower", null);
        setField(term148350, term148350.getClass(), "defenseTurret", null);
        setField(term148350, term148350.getClass(), "totalBuildings", null);
        setField(term148350, term148350.getClass(), "ownerLabel", null);
        setField(term148350, term148350.getClass(), "planet", null);
        setField(term148350, term148350.getClass(), "fleet", null);
        setIntField(term148350, term148350.getClass(), "suppressionFire", 0);
        setField(term148350, term148350.getClass(), "shipsInFleet", null);
        setField(term148350, term148350.getClass(), "imgBase", null);
        setField(term148350, term148350.getClass(), "infoPanel", null);
        setField(term148350, term148350.getClass(), "textArea", null);
        setField(term148350, term148350.getClass(), "textLogger", null);
        setField(term148350, term148350.getClass(), "componentUsed", null);
        setIntField(term148350, term148350.getClass(), "shipIndex", 0);
        setIntField(term148350, term148350.getClass(), "usedComponentIndex", 0);
        setField(term148350, term148350.getClass(), "attacker", null);
        setIntField(term148350, term148350.getClass(), "attackPlayerIndex", 0);
        setField(term148350, term148350.getClass(), "defender", null);
        setIntField(term148350, term148350.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term148350, term148350.getClass(), "aiControlled", false);
        setBooleanField(term148350, term148350.getClass(), "allAi", false);
        setField(term148350, term148350.getClass(), "endButton", null);
        setBooleanField(term148350, term148350.getClass(), "aiOneAttackFound", false);
        setBooleanField(term148350, term148350.getClass(), "aiExitLoop", false);
        setBooleanField(term148350, term148350.getClass(), "aiTroops", false);
        setIntField(term148350, term148350.getClass(), "aiDelays", 0);
        setIntField(term148350, term148350.getClass(), "aiComponentIndex", 0);
        setField(term148350, term148350.getClass(), "starMap", null);
        setField(term148350, term148350.getClass(), "game", null);
        setField(term148350, term148350.getClass(), "nuked", null);
        setField(term148350, term148350.getClass(), "newsData", null);
        setField(term148350, term148350.getClass(), "bombers", null);
        setBooleanField(term148350, term148350.getClass(), "actionSpent", false);
        setIntField(term148350, term148350.getClass(), "whatHappened", 0);
        setBooleanField(term148350, term148350.getClass(), "isAlignmentXSet", false);
        setFloatField(term148350, term148350.getClass(), "alignmentX", 0.0F);
        setBooleanField(term148350, term148350.getClass(), "isAlignmentYSet", false);
        setFloatField(term148350, term148350.getClass(), "alignmentY", 0.0F);
        setField(term148350, term148350.getClass(), "ui", null);
        setField(term148350, term148350.getClass(), "listenerList", null);
        setField(term148350, term148350.getClass(), "clientProperties", null);
        setField(term148350, term148350.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term148350, term148350.getClass(), "autoscrolls", false);
        setField(term148350, term148350.getClass(), "border", null);
        setIntField(term148350, term148350.getClass(), "flags", 0);
        setField(term148350, term148350.getClass(), "inputVerifier", null);
        setBooleanField(term148350, term148350.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term148350, term148350.getClass(), "paintingChild", null);
        setField(term148350, term148350.getClass(), "popupMenu", null);
        setField(term148350, term148350.getClass(), "revalidateRunnableScheduled", null);
        setField(term148350, term148350.getClass(), "focusInputMap", null);
        setField(term148350, term148350.getClass(), "ancestorInputMap", null);
        setField(term148350, term148350.getClass(), "windowInputMap", null);
        setField(term148350, term148350.getClass(), "actionMap", null);
        setField(term148350, term148350.getClass(), "aaHint", null);
        setField(term148350, term148350.getClass(), "lcdRenderingHint", null);
        setField(term148350, term148350.getClass(), "component", null);
        setField(term148350, term148350.getClass(), "layoutMgr", null);
        setField(term148350, term148350.getClass(), "dispatcher", null);
        setField(term148350, term148350.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term148350, term148350.getClass(), "focusCycleRoot", false);
        setBooleanField(term148350, term148350.getClass(), "focusTraversalPolicyProvider", false);
        setField(term148350, term148350.getClass(), "printingThreads", null);
        setBooleanField(term148350, term148350.getClass(), "printing", false);
        setField(term148350, term148350.getClass(), "containerListener", null);
        setIntField(term148350, term148350.getClass(), "listeningChildren", 0);
        setIntField(term148350, term148350.getClass(), "listeningBoundsChildren", 0);
        setIntField(term148350, term148350.getClass(), "descendantsCount", 0);
        setField(term148350, term148350.getClass(), "preserveBackgroundColor", null);
        setIntField(term148350, term148350.getClass(), "numOfHWComponents", 0);
        setIntField(term148350, term148350.getClass(), "numOfLWComponents", 0);
        setField(term148350, term148350.getClass(), "modalComp", null);
        setField(term148350, term148350.getClass(), "modalAppContext", null);
        setIntField(term148350, term148350.getClass(), "containerSerializedDataVersion", 0);
        setField(term148350, term148350.getClass(), "peer", null);
        setField(term148350, term148350.getClass(), "parent", null);
        setField(term148350, term148350.getClass(), "appContext", null);
        setIntField(term148350, term148350.getClass(), "x", 0);
        setIntField(term148350, term148350.getClass(), "y", 0);
        setIntField(term148350, term148350.getClass(), "width", 0);
        setIntField(term148350, term148350.getClass(), "height", 0);
        setField(term148350, term148350.getClass(), "foreground", null);
        setField(term148350, term148350.getClass(), "background", null);
        setField(term148350, term148350.getClass(), "font", null);
        setField(term148350, term148350.getClass(), "peerFont", null);
        setField(term148350, term148350.getClass(), "cursor", null);
        setField(term148350, term148350.getClass(), "locale", null);
        setField(term148350, term148350.getClass(), "graphicsConfig", null);
        setField(term148350, term148350.getClass(), "bufferStrategy", null);
        setBooleanField(term148350, term148350.getClass(), "ignoreRepaint", false);
        setBooleanField(term148350, term148350.getClass(), "visible", false);
        setBooleanField(term148350, term148350.getClass(), "enabled", false);
        setBooleanField(term148350, term148350.getClass(), "valid", false);
        setField(term148350, term148350.getClass(), "dropTarget", null);
        setField(term148350, term148350.getClass(), "popups", null);
        setField(term148350, term148350.getClass(), "name", null);
        setBooleanField(term148350, term148350.getClass(), "nameExplicitlySet", false);
        setBooleanField(term148350, term148350.getClass(), "focusable", false);
        setIntField(term148350, term148350.getClass(), "isFocusTraversableOverridden", 0);
        setField(term148350, term148350.getClass(), "focusTraversalKeys", null);
        setBooleanField(term148350, term148350.getClass(), "focusTraversalKeysEnabled", false);
        setField(term148350, term148350.getClass(), "acc", null);
        setField(term148350, term148350.getClass(), "minSize", null);
        setBooleanField(term148350, term148350.getClass(), "minSizeSet", false);
        setField(term148350, term148350.getClass(), "prefSize", null);
        setBooleanField(term148350, term148350.getClass(), "prefSizeSet", false);
        setField(term148350, term148350.getClass(), "maxSize", null);
        setBooleanField(term148350, term148350.getClass(), "maxSizeSet", false);
        setField(term148350, term148350.getClass(), "componentOrientation", null);
        setBooleanField(term148350, term148350.getClass(), "newEventsOnly", false);
        setField(term148350, term148350.getClass(), "componentListener", null);
        setField(term148350, term148350.getClass(), "focusListener", null);
        setField(term148350, term148350.getClass(), "hierarchyListener", null);
        setField(term148350, term148350.getClass(), "hierarchyBoundsListener", null);
        setField(term148350, term148350.getClass(), "keyListener", null);
        setField(term148350, term148350.getClass(), "mouseListener", null);
        setField(term148350, term148350.getClass(), "mouseMotionListener", null);
        setField(term148350, term148350.getClass(), "mouseWheelListener", null);
        setField(term148350, term148350.getClass(), "inputMethodListener", null);
        setLongField(term148350, term148350.getClass(), "eventMask", 0L);
        setField(term148350, term148350.getClass(), "changeSupport", null);
        setField(term148350, term148350.getClass(), "objectLock", null);
        setBooleanField(term148350, term148350.getClass(), "isPacked", false);
        setIntField(term148350, term148350.getClass(), "boundsOp", 0);
        setField(term148350, term148350.getClass(), "compoundShape", null);
        setField(term148350, term148350.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term148350, term148350.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term148350, term148350.getClass(), "backgroundEraseDisabled", false);
        setField(term148350, term148350.getClass(), "eventCache", null);
        setBooleanField(term148350, term148350.getClass(), "coalescingEnabled", false);
        setBooleanField(term148350, term148350.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term148350, term148350.getClass(), "componentSerializedDataVersion", 0);
        setField(term148350, term148350.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "actionsLeft", argTypes, term148350, args);
    }

};


