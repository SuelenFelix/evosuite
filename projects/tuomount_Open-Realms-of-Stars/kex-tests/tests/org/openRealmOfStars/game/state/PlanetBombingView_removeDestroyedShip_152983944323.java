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

public class PlanetBombingView_removeDestroyedShip_152983944323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121404;

    public PlanetBombingView_removeDestroyedShip_152983944323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121404 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term121404, term121404.getClass(), "totalPeople", null);
        setField(term121404, term121404.getClass(), "troopsPower", null);
        setField(term121404, term121404.getClass(), "defenseTurret", null);
        setField(term121404, term121404.getClass(), "totalBuildings", null);
        setField(term121404, term121404.getClass(), "ownerLabel", null);
        setField(term121404, term121404.getClass(), "planet", null);
        setField(term121404, term121404.getClass(), "fleet", null);
        setIntField(term121404, term121404.getClass(), "suppressionFire", 0);
        setField(term121404, term121404.getClass(), "shipsInFleet", null);
        setField(term121404, term121404.getClass(), "imgBase", null);
        setField(term121404, term121404.getClass(), "infoPanel", null);
        setField(term121404, term121404.getClass(), "textArea", null);
        setField(term121404, term121404.getClass(), "textLogger", null);
        setField(term121404, term121404.getClass(), "componentUsed", null);
        setIntField(term121404, term121404.getClass(), "shipIndex", 0);
        setIntField(term121404, term121404.getClass(), "usedComponentIndex", 0);
        setField(term121404, term121404.getClass(), "attacker", null);
        setIntField(term121404, term121404.getClass(), "attackPlayerIndex", 0);
        setField(term121404, term121404.getClass(), "defender", null);
        setIntField(term121404, term121404.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term121404, term121404.getClass(), "aiControlled", false);
        setBooleanField(term121404, term121404.getClass(), "allAi", false);
        setField(term121404, term121404.getClass(), "endButton", null);
        setBooleanField(term121404, term121404.getClass(), "aiOneAttackFound", false);
        setBooleanField(term121404, term121404.getClass(), "aiExitLoop", false);
        setBooleanField(term121404, term121404.getClass(), "aiTroops", false);
        setIntField(term121404, term121404.getClass(), "aiDelays", 0);
        setIntField(term121404, term121404.getClass(), "aiComponentIndex", 0);
        setField(term121404, term121404.getClass(), "starMap", null);
        setField(term121404, term121404.getClass(), "game", null);
        setField(term121404, term121404.getClass(), "nuked", null);
        setField(term121404, term121404.getClass(), "newsData", null);
        setField(term121404, term121404.getClass(), "bombers", null);
        setBooleanField(term121404, term121404.getClass(), "actionSpent", false);
        setIntField(term121404, term121404.getClass(), "whatHappened", 0);
        setBooleanField(term121404, term121404.getClass(), "isAlignmentXSet", false);
        setFloatField(term121404, term121404.getClass(), "alignmentX", 0.0F);
        setBooleanField(term121404, term121404.getClass(), "isAlignmentYSet", false);
        setFloatField(term121404, term121404.getClass(), "alignmentY", 0.0F);
        setField(term121404, term121404.getClass(), "ui", null);
        setField(term121404, term121404.getClass(), "listenerList", null);
        setField(term121404, term121404.getClass(), "clientProperties", null);
        setField(term121404, term121404.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term121404, term121404.getClass(), "autoscrolls", false);
        setField(term121404, term121404.getClass(), "border", null);
        setIntField(term121404, term121404.getClass(), "flags", 0);
        setField(term121404, term121404.getClass(), "inputVerifier", null);
        setBooleanField(term121404, term121404.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term121404, term121404.getClass(), "paintingChild", null);
        setField(term121404, term121404.getClass(), "popupMenu", null);
        setField(term121404, term121404.getClass(), "revalidateRunnableScheduled", null);
        setField(term121404, term121404.getClass(), "focusInputMap", null);
        setField(term121404, term121404.getClass(), "ancestorInputMap", null);
        setField(term121404, term121404.getClass(), "windowInputMap", null);
        setField(term121404, term121404.getClass(), "actionMap", null);
        setField(term121404, term121404.getClass(), "aaHint", null);
        setField(term121404, term121404.getClass(), "lcdRenderingHint", null);
        setField(term121404, term121404.getClass(), "component", null);
        setField(term121404, term121404.getClass(), "layoutMgr", null);
        setField(term121404, term121404.getClass(), "dispatcher", null);
        setField(term121404, term121404.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term121404, term121404.getClass(), "focusCycleRoot", false);
        setBooleanField(term121404, term121404.getClass(), "focusTraversalPolicyProvider", false);
        setField(term121404, term121404.getClass(), "printingThreads", null);
        setBooleanField(term121404, term121404.getClass(), "printing", false);
        setField(term121404, term121404.getClass(), "containerListener", null);
        setIntField(term121404, term121404.getClass(), "listeningChildren", 0);
        setIntField(term121404, term121404.getClass(), "listeningBoundsChildren", 0);
        setIntField(term121404, term121404.getClass(), "descendantsCount", 0);
        setField(term121404, term121404.getClass(), "preserveBackgroundColor", null);
        setIntField(term121404, term121404.getClass(), "numOfHWComponents", 0);
        setIntField(term121404, term121404.getClass(), "numOfLWComponents", 0);
        setField(term121404, term121404.getClass(), "modalComp", null);
        setField(term121404, term121404.getClass(), "modalAppContext", null);
        setIntField(term121404, term121404.getClass(), "containerSerializedDataVersion", 0);
        setField(term121404, term121404.getClass(), "peer", null);
        setField(term121404, term121404.getClass(), "parent", null);
        setField(term121404, term121404.getClass(), "appContext", null);
        setIntField(term121404, term121404.getClass(), "x", 0);
        setIntField(term121404, term121404.getClass(), "y", 0);
        setIntField(term121404, term121404.getClass(), "width", 0);
        setIntField(term121404, term121404.getClass(), "height", 0);
        setField(term121404, term121404.getClass(), "foreground", null);
        setField(term121404, term121404.getClass(), "background", null);
        setField(term121404, term121404.getClass(), "font", null);
        setField(term121404, term121404.getClass(), "peerFont", null);
        setField(term121404, term121404.getClass(), "cursor", null);
        setField(term121404, term121404.getClass(), "locale", null);
        setField(term121404, term121404.getClass(), "graphicsConfig", null);
        setField(term121404, term121404.getClass(), "bufferStrategy", null);
        setBooleanField(term121404, term121404.getClass(), "ignoreRepaint", false);
        setBooleanField(term121404, term121404.getClass(), "visible", false);
        setBooleanField(term121404, term121404.getClass(), "enabled", false);
        setBooleanField(term121404, term121404.getClass(), "valid", false);
        setField(term121404, term121404.getClass(), "dropTarget", null);
        setField(term121404, term121404.getClass(), "popups", null);
        setField(term121404, term121404.getClass(), "name", null);
        setBooleanField(term121404, term121404.getClass(), "nameExplicitlySet", false);
        setBooleanField(term121404, term121404.getClass(), "focusable", false);
        setIntField(term121404, term121404.getClass(), "isFocusTraversableOverridden", 0);
        setField(term121404, term121404.getClass(), "focusTraversalKeys", null);
        setBooleanField(term121404, term121404.getClass(), "focusTraversalKeysEnabled", false);
        setField(term121404, term121404.getClass(), "acc", null);
        setField(term121404, term121404.getClass(), "minSize", null);
        setBooleanField(term121404, term121404.getClass(), "minSizeSet", false);
        setField(term121404, term121404.getClass(), "prefSize", null);
        setBooleanField(term121404, term121404.getClass(), "prefSizeSet", false);
        setField(term121404, term121404.getClass(), "maxSize", null);
        setBooleanField(term121404, term121404.getClass(), "maxSizeSet", false);
        setField(term121404, term121404.getClass(), "componentOrientation", null);
        setBooleanField(term121404, term121404.getClass(), "newEventsOnly", false);
        setField(term121404, term121404.getClass(), "componentListener", null);
        setField(term121404, term121404.getClass(), "focusListener", null);
        setField(term121404, term121404.getClass(), "hierarchyListener", null);
        setField(term121404, term121404.getClass(), "hierarchyBoundsListener", null);
        setField(term121404, term121404.getClass(), "keyListener", null);
        setField(term121404, term121404.getClass(), "mouseListener", null);
        setField(term121404, term121404.getClass(), "mouseMotionListener", null);
        setField(term121404, term121404.getClass(), "mouseWheelListener", null);
        setField(term121404, term121404.getClass(), "inputMethodListener", null);
        setLongField(term121404, term121404.getClass(), "eventMask", 0L);
        setField(term121404, term121404.getClass(), "changeSupport", null);
        setField(term121404, term121404.getClass(), "objectLock", null);
        setBooleanField(term121404, term121404.getClass(), "isPacked", false);
        setIntField(term121404, term121404.getClass(), "boundsOp", 0);
        setField(term121404, term121404.getClass(), "compoundShape", null);
        setField(term121404, term121404.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term121404, term121404.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term121404, term121404.getClass(), "backgroundEraseDisabled", false);
        setField(term121404, term121404.getClass(), "eventCache", null);
        setBooleanField(term121404, term121404.getClass(), "coalescingEnabled", false);
        setBooleanField(term121404, term121404.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term121404, term121404.getClass(), "componentSerializedDataVersion", 0);
        setField(term121404, term121404.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeDestroyedShip", argTypes, term121404, args);
    }

};


