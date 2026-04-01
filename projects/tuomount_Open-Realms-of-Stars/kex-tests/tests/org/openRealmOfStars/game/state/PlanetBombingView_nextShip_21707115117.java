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

public class PlanetBombingView_nextShip_21707115117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117655;

    public PlanetBombingView_nextShip_21707115117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117655 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term117655, term117655.getClass(), "totalPeople", null);
        setField(term117655, term117655.getClass(), "troopsPower", null);
        setField(term117655, term117655.getClass(), "defenseTurret", null);
        setField(term117655, term117655.getClass(), "totalBuildings", null);
        setField(term117655, term117655.getClass(), "ownerLabel", null);
        setField(term117655, term117655.getClass(), "planet", null);
        setField(term117655, term117655.getClass(), "fleet", null);
        setIntField(term117655, term117655.getClass(), "suppressionFire", 0);
        setField(term117655, term117655.getClass(), "shipsInFleet", null);
        setField(term117655, term117655.getClass(), "imgBase", null);
        setField(term117655, term117655.getClass(), "infoPanel", null);
        setField(term117655, term117655.getClass(), "textArea", null);
        setField(term117655, term117655.getClass(), "textLogger", null);
        setField(term117655, term117655.getClass(), "componentUsed", null);
        setIntField(term117655, term117655.getClass(), "shipIndex", 0);
        setIntField(term117655, term117655.getClass(), "usedComponentIndex", 0);
        setField(term117655, term117655.getClass(), "attacker", null);
        setIntField(term117655, term117655.getClass(), "attackPlayerIndex", 0);
        setField(term117655, term117655.getClass(), "defender", null);
        setIntField(term117655, term117655.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term117655, term117655.getClass(), "aiControlled", false);
        setBooleanField(term117655, term117655.getClass(), "allAi", false);
        setField(term117655, term117655.getClass(), "endButton", null);
        setBooleanField(term117655, term117655.getClass(), "aiOneAttackFound", false);
        setBooleanField(term117655, term117655.getClass(), "aiExitLoop", false);
        setBooleanField(term117655, term117655.getClass(), "aiTroops", false);
        setIntField(term117655, term117655.getClass(), "aiDelays", 0);
        setIntField(term117655, term117655.getClass(), "aiComponentIndex", 0);
        setField(term117655, term117655.getClass(), "starMap", null);
        setField(term117655, term117655.getClass(), "game", null);
        setField(term117655, term117655.getClass(), "nuked", null);
        setField(term117655, term117655.getClass(), "newsData", null);
        setField(term117655, term117655.getClass(), "bombers", null);
        setBooleanField(term117655, term117655.getClass(), "actionSpent", false);
        setIntField(term117655, term117655.getClass(), "whatHappened", 0);
        setBooleanField(term117655, term117655.getClass(), "isAlignmentXSet", false);
        setFloatField(term117655, term117655.getClass(), "alignmentX", 0.0F);
        setBooleanField(term117655, term117655.getClass(), "isAlignmentYSet", false);
        setFloatField(term117655, term117655.getClass(), "alignmentY", 0.0F);
        setField(term117655, term117655.getClass(), "ui", null);
        setField(term117655, term117655.getClass(), "listenerList", null);
        setField(term117655, term117655.getClass(), "clientProperties", null);
        setField(term117655, term117655.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term117655, term117655.getClass(), "autoscrolls", false);
        setField(term117655, term117655.getClass(), "border", null);
        setIntField(term117655, term117655.getClass(), "flags", 0);
        setField(term117655, term117655.getClass(), "inputVerifier", null);
        setBooleanField(term117655, term117655.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term117655, term117655.getClass(), "paintingChild", null);
        setField(term117655, term117655.getClass(), "popupMenu", null);
        setField(term117655, term117655.getClass(), "revalidateRunnableScheduled", null);
        setField(term117655, term117655.getClass(), "focusInputMap", null);
        setField(term117655, term117655.getClass(), "ancestorInputMap", null);
        setField(term117655, term117655.getClass(), "windowInputMap", null);
        setField(term117655, term117655.getClass(), "actionMap", null);
        setField(term117655, term117655.getClass(), "aaHint", null);
        setField(term117655, term117655.getClass(), "lcdRenderingHint", null);
        setField(term117655, term117655.getClass(), "component", null);
        setField(term117655, term117655.getClass(), "layoutMgr", null);
        setField(term117655, term117655.getClass(), "dispatcher", null);
        setField(term117655, term117655.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term117655, term117655.getClass(), "focusCycleRoot", false);
        setBooleanField(term117655, term117655.getClass(), "focusTraversalPolicyProvider", false);
        setField(term117655, term117655.getClass(), "printingThreads", null);
        setBooleanField(term117655, term117655.getClass(), "printing", false);
        setField(term117655, term117655.getClass(), "containerListener", null);
        setIntField(term117655, term117655.getClass(), "listeningChildren", 0);
        setIntField(term117655, term117655.getClass(), "listeningBoundsChildren", 0);
        setIntField(term117655, term117655.getClass(), "descendantsCount", 0);
        setField(term117655, term117655.getClass(), "preserveBackgroundColor", null);
        setIntField(term117655, term117655.getClass(), "numOfHWComponents", 0);
        setIntField(term117655, term117655.getClass(), "numOfLWComponents", 0);
        setField(term117655, term117655.getClass(), "modalComp", null);
        setField(term117655, term117655.getClass(), "modalAppContext", null);
        setIntField(term117655, term117655.getClass(), "containerSerializedDataVersion", 0);
        setField(term117655, term117655.getClass(), "peer", null);
        setField(term117655, term117655.getClass(), "parent", null);
        setField(term117655, term117655.getClass(), "appContext", null);
        setIntField(term117655, term117655.getClass(), "x", 0);
        setIntField(term117655, term117655.getClass(), "y", 0);
        setIntField(term117655, term117655.getClass(), "width", 0);
        setIntField(term117655, term117655.getClass(), "height", 0);
        setField(term117655, term117655.getClass(), "foreground", null);
        setField(term117655, term117655.getClass(), "background", null);
        setField(term117655, term117655.getClass(), "font", null);
        setField(term117655, term117655.getClass(), "peerFont", null);
        setField(term117655, term117655.getClass(), "cursor", null);
        setField(term117655, term117655.getClass(), "locale", null);
        setField(term117655, term117655.getClass(), "graphicsConfig", null);
        setField(term117655, term117655.getClass(), "bufferStrategy", null);
        setBooleanField(term117655, term117655.getClass(), "ignoreRepaint", false);
        setBooleanField(term117655, term117655.getClass(), "visible", false);
        setBooleanField(term117655, term117655.getClass(), "enabled", false);
        setBooleanField(term117655, term117655.getClass(), "valid", false);
        setField(term117655, term117655.getClass(), "dropTarget", null);
        setField(term117655, term117655.getClass(), "popups", null);
        setField(term117655, term117655.getClass(), "name", null);
        setBooleanField(term117655, term117655.getClass(), "nameExplicitlySet", false);
        setBooleanField(term117655, term117655.getClass(), "focusable", false);
        setIntField(term117655, term117655.getClass(), "isFocusTraversableOverridden", 0);
        setField(term117655, term117655.getClass(), "focusTraversalKeys", null);
        setBooleanField(term117655, term117655.getClass(), "focusTraversalKeysEnabled", false);
        setField(term117655, term117655.getClass(), "acc", null);
        setField(term117655, term117655.getClass(), "minSize", null);
        setBooleanField(term117655, term117655.getClass(), "minSizeSet", false);
        setField(term117655, term117655.getClass(), "prefSize", null);
        setBooleanField(term117655, term117655.getClass(), "prefSizeSet", false);
        setField(term117655, term117655.getClass(), "maxSize", null);
        setBooleanField(term117655, term117655.getClass(), "maxSizeSet", false);
        setField(term117655, term117655.getClass(), "componentOrientation", null);
        setBooleanField(term117655, term117655.getClass(), "newEventsOnly", false);
        setField(term117655, term117655.getClass(), "componentListener", null);
        setField(term117655, term117655.getClass(), "focusListener", null);
        setField(term117655, term117655.getClass(), "hierarchyListener", null);
        setField(term117655, term117655.getClass(), "hierarchyBoundsListener", null);
        setField(term117655, term117655.getClass(), "keyListener", null);
        setField(term117655, term117655.getClass(), "mouseListener", null);
        setField(term117655, term117655.getClass(), "mouseMotionListener", null);
        setField(term117655, term117655.getClass(), "mouseWheelListener", null);
        setField(term117655, term117655.getClass(), "inputMethodListener", null);
        setLongField(term117655, term117655.getClass(), "eventMask", 0L);
        setField(term117655, term117655.getClass(), "changeSupport", null);
        setField(term117655, term117655.getClass(), "objectLock", null);
        setBooleanField(term117655, term117655.getClass(), "isPacked", false);
        setIntField(term117655, term117655.getClass(), "boundsOp", 0);
        setField(term117655, term117655.getClass(), "compoundShape", null);
        setField(term117655, term117655.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term117655, term117655.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term117655, term117655.getClass(), "backgroundEraseDisabled", false);
        setField(term117655, term117655.getClass(), "eventCache", null);
        setBooleanField(term117655, term117655.getClass(), "coalescingEnabled", false);
        setBooleanField(term117655, term117655.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term117655, term117655.getClass(), "componentSerializedDataVersion", 0);
        setField(term117655, term117655.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextShip", argTypes, term117655, args);
    }

};


