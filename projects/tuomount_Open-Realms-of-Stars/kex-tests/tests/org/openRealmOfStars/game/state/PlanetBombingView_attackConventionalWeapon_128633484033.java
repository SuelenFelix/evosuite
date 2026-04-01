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

public class PlanetBombingView_attackConventionalWeapon_128633484033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136852;
     Object term136907;
     Object term136909;

    public PlanetBombingView_attackConventionalWeapon_128633484033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136852 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term136852, term136852.getClass(), "totalPeople", null);
        setField(term136852, term136852.getClass(), "troopsPower", null);
        setField(term136852, term136852.getClass(), "defenseTurret", null);
        setField(term136852, term136852.getClass(), "totalBuildings", null);
        setField(term136852, term136852.getClass(), "ownerLabel", null);
        setField(term136852, term136852.getClass(), "planet", null);
        setField(term136852, term136852.getClass(), "fleet", null);
        setIntField(term136852, term136852.getClass(), "suppressionFire", 0);
        setField(term136852, term136852.getClass(), "shipsInFleet", null);
        setField(term136852, term136852.getClass(), "imgBase", null);
        setField(term136852, term136852.getClass(), "infoPanel", null);
        setField(term136852, term136852.getClass(), "textArea", null);
        setField(term136852, term136852.getClass(), "textLogger", null);
        setField(term136852, term136852.getClass(), "componentUsed", null);
        setIntField(term136852, term136852.getClass(), "shipIndex", 0);
        setIntField(term136852, term136852.getClass(), "usedComponentIndex", 0);
        setField(term136852, term136852.getClass(), "attacker", null);
        setIntField(term136852, term136852.getClass(), "attackPlayerIndex", 0);
        setField(term136852, term136852.getClass(), "defender", null);
        setIntField(term136852, term136852.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term136852, term136852.getClass(), "aiControlled", false);
        setBooleanField(term136852, term136852.getClass(), "allAi", false);
        setField(term136852, term136852.getClass(), "endButton", null);
        setBooleanField(term136852, term136852.getClass(), "aiOneAttackFound", false);
        setBooleanField(term136852, term136852.getClass(), "aiExitLoop", false);
        setBooleanField(term136852, term136852.getClass(), "aiTroops", false);
        setIntField(term136852, term136852.getClass(), "aiDelays", 0);
        setIntField(term136852, term136852.getClass(), "aiComponentIndex", 0);
        setField(term136852, term136852.getClass(), "starMap", null);
        setField(term136852, term136852.getClass(), "game", null);
        setField(term136852, term136852.getClass(), "nuked", null);
        setField(term136852, term136852.getClass(), "newsData", null);
        setField(term136852, term136852.getClass(), "bombers", null);
        setBooleanField(term136852, term136852.getClass(), "actionSpent", false);
        setIntField(term136852, term136852.getClass(), "whatHappened", 0);
        setBooleanField(term136852, term136852.getClass(), "isAlignmentXSet", false);
        setFloatField(term136852, term136852.getClass(), "alignmentX", 0.0F);
        setBooleanField(term136852, term136852.getClass(), "isAlignmentYSet", false);
        setFloatField(term136852, term136852.getClass(), "alignmentY", 0.0F);
        setField(term136852, term136852.getClass(), "ui", null);
        setField(term136852, term136852.getClass(), "listenerList", null);
        setField(term136852, term136852.getClass(), "clientProperties", null);
        setField(term136852, term136852.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term136852, term136852.getClass(), "autoscrolls", false);
        setField(term136852, term136852.getClass(), "border", null);
        setIntField(term136852, term136852.getClass(), "flags", 0);
        setField(term136852, term136852.getClass(), "inputVerifier", null);
        setBooleanField(term136852, term136852.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term136852, term136852.getClass(), "paintingChild", null);
        setField(term136852, term136852.getClass(), "popupMenu", null);
        setField(term136852, term136852.getClass(), "revalidateRunnableScheduled", null);
        setField(term136852, term136852.getClass(), "focusInputMap", null);
        setField(term136852, term136852.getClass(), "ancestorInputMap", null);
        setField(term136852, term136852.getClass(), "windowInputMap", null);
        setField(term136852, term136852.getClass(), "actionMap", null);
        setField(term136852, term136852.getClass(), "aaHint", null);
        setField(term136852, term136852.getClass(), "lcdRenderingHint", null);
        setField(term136852, term136852.getClass(), "component", null);
        setField(term136852, term136852.getClass(), "layoutMgr", null);
        setField(term136852, term136852.getClass(), "dispatcher", null);
        setField(term136852, term136852.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term136852, term136852.getClass(), "focusCycleRoot", false);
        setBooleanField(term136852, term136852.getClass(), "focusTraversalPolicyProvider", false);
        setField(term136852, term136852.getClass(), "printingThreads", null);
        setBooleanField(term136852, term136852.getClass(), "printing", false);
        setField(term136852, term136852.getClass(), "containerListener", null);
        setIntField(term136852, term136852.getClass(), "listeningChildren", 0);
        setIntField(term136852, term136852.getClass(), "listeningBoundsChildren", 0);
        setIntField(term136852, term136852.getClass(), "descendantsCount", 0);
        setField(term136852, term136852.getClass(), "preserveBackgroundColor", null);
        setIntField(term136852, term136852.getClass(), "numOfHWComponents", 0);
        setIntField(term136852, term136852.getClass(), "numOfLWComponents", 0);
        setField(term136852, term136852.getClass(), "modalComp", null);
        setField(term136852, term136852.getClass(), "modalAppContext", null);
        setIntField(term136852, term136852.getClass(), "containerSerializedDataVersion", 0);
        setField(term136852, term136852.getClass(), "peer", null);
        setField(term136852, term136852.getClass(), "parent", null);
        setField(term136852, term136852.getClass(), "appContext", null);
        setIntField(term136852, term136852.getClass(), "x", 0);
        setIntField(term136852, term136852.getClass(), "y", 0);
        setIntField(term136852, term136852.getClass(), "width", 0);
        setIntField(term136852, term136852.getClass(), "height", 0);
        setField(term136852, term136852.getClass(), "foreground", null);
        setField(term136852, term136852.getClass(), "background", null);
        setField(term136852, term136852.getClass(), "font", null);
        setField(term136852, term136852.getClass(), "peerFont", null);
        setField(term136852, term136852.getClass(), "cursor", null);
        setField(term136852, term136852.getClass(), "locale", null);
        setField(term136852, term136852.getClass(), "graphicsConfig", null);
        setField(term136852, term136852.getClass(), "bufferStrategy", null);
        setBooleanField(term136852, term136852.getClass(), "ignoreRepaint", false);
        setBooleanField(term136852, term136852.getClass(), "visible", false);
        setBooleanField(term136852, term136852.getClass(), "enabled", false);
        setBooleanField(term136852, term136852.getClass(), "valid", false);
        setField(term136852, term136852.getClass(), "dropTarget", null);
        setField(term136852, term136852.getClass(), "popups", null);
        setField(term136852, term136852.getClass(), "name", null);
        setBooleanField(term136852, term136852.getClass(), "nameExplicitlySet", false);
        setBooleanField(term136852, term136852.getClass(), "focusable", false);
        setIntField(term136852, term136852.getClass(), "isFocusTraversableOverridden", 0);
        setField(term136852, term136852.getClass(), "focusTraversalKeys", null);
        setBooleanField(term136852, term136852.getClass(), "focusTraversalKeysEnabled", false);
        setField(term136852, term136852.getClass(), "acc", null);
        setField(term136852, term136852.getClass(), "minSize", null);
        setBooleanField(term136852, term136852.getClass(), "minSizeSet", false);
        setField(term136852, term136852.getClass(), "prefSize", null);
        setBooleanField(term136852, term136852.getClass(), "prefSizeSet", false);
        setField(term136852, term136852.getClass(), "maxSize", null);
        setBooleanField(term136852, term136852.getClass(), "maxSizeSet", false);
        setField(term136852, term136852.getClass(), "componentOrientation", null);
        setBooleanField(term136852, term136852.getClass(), "newEventsOnly", false);
        setField(term136852, term136852.getClass(), "componentListener", null);
        setField(term136852, term136852.getClass(), "focusListener", null);
        setField(term136852, term136852.getClass(), "hierarchyListener", null);
        setField(term136852, term136852.getClass(), "hierarchyBoundsListener", null);
        setField(term136852, term136852.getClass(), "keyListener", null);
        setField(term136852, term136852.getClass(), "mouseListener", null);
        setField(term136852, term136852.getClass(), "mouseMotionListener", null);
        setField(term136852, term136852.getClass(), "mouseWheelListener", null);
        setField(term136852, term136852.getClass(), "inputMethodListener", null);
        setLongField(term136852, term136852.getClass(), "eventMask", 0L);
        setField(term136852, term136852.getClass(), "changeSupport", null);
        setField(term136852, term136852.getClass(), "objectLock", null);
        setBooleanField(term136852, term136852.getClass(), "isPacked", false);
        setIntField(term136852, term136852.getClass(), "boundsOp", 0);
        setField(term136852, term136852.getClass(), "compoundShape", null);
        setField(term136852, term136852.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term136852, term136852.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term136852, term136852.getClass(), "backgroundEraseDisabled", false);
        setField(term136852, term136852.getClass(), "eventCache", null);
        setBooleanField(term136852, term136852.getClass(), "coalescingEnabled", false);
        setBooleanField(term136852, term136852.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term136852, term136852.getClass(), "componentSerializedDataVersion", 0);
        setField(term136852, term136852.getClass(), "accessibleContext", null);
        term136907 = new Integer(0);
        term136909 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.Ship");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term136907;
        args[2] = term136909;
        callMethod(klass, "attackConventionalWeapon", argTypes, term136852, args);
    }

};


