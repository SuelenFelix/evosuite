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

public class PlanetBombingView_handleAction_78870590343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149725;

    public PlanetBombingView_handleAction_78870590343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149725 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term149725, term149725.getClass(), "totalPeople", null);
        setField(term149725, term149725.getClass(), "troopsPower", null);
        setField(term149725, term149725.getClass(), "defenseTurret", null);
        setField(term149725, term149725.getClass(), "totalBuildings", null);
        setField(term149725, term149725.getClass(), "ownerLabel", null);
        setField(term149725, term149725.getClass(), "planet", null);
        setField(term149725, term149725.getClass(), "fleet", null);
        setIntField(term149725, term149725.getClass(), "suppressionFire", 0);
        setField(term149725, term149725.getClass(), "shipsInFleet", null);
        setField(term149725, term149725.getClass(), "imgBase", null);
        setField(term149725, term149725.getClass(), "infoPanel", null);
        setField(term149725, term149725.getClass(), "textArea", null);
        setField(term149725, term149725.getClass(), "textLogger", null);
        setField(term149725, term149725.getClass(), "componentUsed", null);
        setIntField(term149725, term149725.getClass(), "shipIndex", 0);
        setIntField(term149725, term149725.getClass(), "usedComponentIndex", 0);
        setField(term149725, term149725.getClass(), "attacker", null);
        setIntField(term149725, term149725.getClass(), "attackPlayerIndex", 0);
        setField(term149725, term149725.getClass(), "defender", null);
        setIntField(term149725, term149725.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term149725, term149725.getClass(), "aiControlled", false);
        setBooleanField(term149725, term149725.getClass(), "allAi", false);
        setField(term149725, term149725.getClass(), "endButton", null);
        setBooleanField(term149725, term149725.getClass(), "aiOneAttackFound", false);
        setBooleanField(term149725, term149725.getClass(), "aiExitLoop", false);
        setBooleanField(term149725, term149725.getClass(), "aiTroops", false);
        setIntField(term149725, term149725.getClass(), "aiDelays", 0);
        setIntField(term149725, term149725.getClass(), "aiComponentIndex", 0);
        setField(term149725, term149725.getClass(), "starMap", null);
        setField(term149725, term149725.getClass(), "game", null);
        setField(term149725, term149725.getClass(), "nuked", null);
        setField(term149725, term149725.getClass(), "newsData", null);
        setField(term149725, term149725.getClass(), "bombers", null);
        setBooleanField(term149725, term149725.getClass(), "actionSpent", false);
        setIntField(term149725, term149725.getClass(), "whatHappened", 0);
        setBooleanField(term149725, term149725.getClass(), "isAlignmentXSet", false);
        setFloatField(term149725, term149725.getClass(), "alignmentX", 0.0F);
        setBooleanField(term149725, term149725.getClass(), "isAlignmentYSet", false);
        setFloatField(term149725, term149725.getClass(), "alignmentY", 0.0F);
        setField(term149725, term149725.getClass(), "ui", null);
        setField(term149725, term149725.getClass(), "listenerList", null);
        setField(term149725, term149725.getClass(), "clientProperties", null);
        setField(term149725, term149725.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term149725, term149725.getClass(), "autoscrolls", false);
        setField(term149725, term149725.getClass(), "border", null);
        setIntField(term149725, term149725.getClass(), "flags", 0);
        setField(term149725, term149725.getClass(), "inputVerifier", null);
        setBooleanField(term149725, term149725.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term149725, term149725.getClass(), "paintingChild", null);
        setField(term149725, term149725.getClass(), "popupMenu", null);
        setField(term149725, term149725.getClass(), "revalidateRunnableScheduled", null);
        setField(term149725, term149725.getClass(), "focusInputMap", null);
        setField(term149725, term149725.getClass(), "ancestorInputMap", null);
        setField(term149725, term149725.getClass(), "windowInputMap", null);
        setField(term149725, term149725.getClass(), "actionMap", null);
        setField(term149725, term149725.getClass(), "aaHint", null);
        setField(term149725, term149725.getClass(), "lcdRenderingHint", null);
        setField(term149725, term149725.getClass(), "component", null);
        setField(term149725, term149725.getClass(), "layoutMgr", null);
        setField(term149725, term149725.getClass(), "dispatcher", null);
        setField(term149725, term149725.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term149725, term149725.getClass(), "focusCycleRoot", false);
        setBooleanField(term149725, term149725.getClass(), "focusTraversalPolicyProvider", false);
        setField(term149725, term149725.getClass(), "printingThreads", null);
        setBooleanField(term149725, term149725.getClass(), "printing", false);
        setField(term149725, term149725.getClass(), "containerListener", null);
        setIntField(term149725, term149725.getClass(), "listeningChildren", 0);
        setIntField(term149725, term149725.getClass(), "listeningBoundsChildren", 0);
        setIntField(term149725, term149725.getClass(), "descendantsCount", 0);
        setField(term149725, term149725.getClass(), "preserveBackgroundColor", null);
        setIntField(term149725, term149725.getClass(), "numOfHWComponents", 0);
        setIntField(term149725, term149725.getClass(), "numOfLWComponents", 0);
        setField(term149725, term149725.getClass(), "modalComp", null);
        setField(term149725, term149725.getClass(), "modalAppContext", null);
        setIntField(term149725, term149725.getClass(), "containerSerializedDataVersion", 0);
        setField(term149725, term149725.getClass(), "peer", null);
        setField(term149725, term149725.getClass(), "parent", null);
        setField(term149725, term149725.getClass(), "appContext", null);
        setIntField(term149725, term149725.getClass(), "x", 0);
        setIntField(term149725, term149725.getClass(), "y", 0);
        setIntField(term149725, term149725.getClass(), "width", 0);
        setIntField(term149725, term149725.getClass(), "height", 0);
        setField(term149725, term149725.getClass(), "foreground", null);
        setField(term149725, term149725.getClass(), "background", null);
        setField(term149725, term149725.getClass(), "font", null);
        setField(term149725, term149725.getClass(), "peerFont", null);
        setField(term149725, term149725.getClass(), "cursor", null);
        setField(term149725, term149725.getClass(), "locale", null);
        setField(term149725, term149725.getClass(), "graphicsConfig", null);
        setField(term149725, term149725.getClass(), "bufferStrategy", null);
        setBooleanField(term149725, term149725.getClass(), "ignoreRepaint", false);
        setBooleanField(term149725, term149725.getClass(), "visible", false);
        setBooleanField(term149725, term149725.getClass(), "enabled", false);
        setBooleanField(term149725, term149725.getClass(), "valid", false);
        setField(term149725, term149725.getClass(), "dropTarget", null);
        setField(term149725, term149725.getClass(), "popups", null);
        setField(term149725, term149725.getClass(), "name", null);
        setBooleanField(term149725, term149725.getClass(), "nameExplicitlySet", false);
        setBooleanField(term149725, term149725.getClass(), "focusable", false);
        setIntField(term149725, term149725.getClass(), "isFocusTraversableOverridden", 0);
        setField(term149725, term149725.getClass(), "focusTraversalKeys", null);
        setBooleanField(term149725, term149725.getClass(), "focusTraversalKeysEnabled", false);
        setField(term149725, term149725.getClass(), "acc", null);
        setField(term149725, term149725.getClass(), "minSize", null);
        setBooleanField(term149725, term149725.getClass(), "minSizeSet", false);
        setField(term149725, term149725.getClass(), "prefSize", null);
        setBooleanField(term149725, term149725.getClass(), "prefSizeSet", false);
        setField(term149725, term149725.getClass(), "maxSize", null);
        setBooleanField(term149725, term149725.getClass(), "maxSizeSet", false);
        setField(term149725, term149725.getClass(), "componentOrientation", null);
        setBooleanField(term149725, term149725.getClass(), "newEventsOnly", false);
        setField(term149725, term149725.getClass(), "componentListener", null);
        setField(term149725, term149725.getClass(), "focusListener", null);
        setField(term149725, term149725.getClass(), "hierarchyListener", null);
        setField(term149725, term149725.getClass(), "hierarchyBoundsListener", null);
        setField(term149725, term149725.getClass(), "keyListener", null);
        setField(term149725, term149725.getClass(), "mouseListener", null);
        setField(term149725, term149725.getClass(), "mouseMotionListener", null);
        setField(term149725, term149725.getClass(), "mouseWheelListener", null);
        setField(term149725, term149725.getClass(), "inputMethodListener", null);
        setLongField(term149725, term149725.getClass(), "eventMask", 0L);
        setField(term149725, term149725.getClass(), "changeSupport", null);
        setField(term149725, term149725.getClass(), "objectLock", null);
        setBooleanField(term149725, term149725.getClass(), "isPacked", false);
        setIntField(term149725, term149725.getClass(), "boundsOp", 0);
        setField(term149725, term149725.getClass(), "compoundShape", null);
        setField(term149725, term149725.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term149725, term149725.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term149725, term149725.getClass(), "backgroundEraseDisabled", false);
        setField(term149725, term149725.getClass(), "eventCache", null);
        setBooleanField(term149725, term149725.getClass(), "coalescingEnabled", false);
        setBooleanField(term149725, term149725.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term149725, term149725.getClass(), "componentSerializedDataVersion", 0);
        setField(term149725, term149725.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term149725, args);
    }

};


