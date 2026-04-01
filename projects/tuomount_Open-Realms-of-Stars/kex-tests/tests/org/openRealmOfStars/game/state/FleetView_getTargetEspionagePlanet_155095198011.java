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

public class FleetView_getTargetEspionagePlanet_155095198011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term879933;

    public FleetView_getTargetEspionagePlanet_155095198011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term879933 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term879933, term879933.getClass(), "totalPeople", null);
        setField(term879933, term879933.getClass(), "metal", null);
        setField(term879933, term879933.getClass(), "ownerLabel", null);
        setField(term879933, term879933.getClass(), "colonistSelection", null);
        setField(term879933, term879933.getClass(), "metalSelection", null);
        setField(term879933, term879933.getClass(), "planet", null);
        setField(term879933, term879933.getClass(), "fleet", null);
        setField(term879933, term879933.getClass(), "fleetList", null);
        setField(term879933, term879933.getClass(), "fleetNameText", null);
        setField(term879933, term879933.getClass(), "shipsInFleet", null);
        setField(term879933, term879933.getClass(), "fleetsInSpace", null);
        setField(term879933, term879933.getClass(), "starbaseFleet", null);
        setField(term879933, term879933.getClass(), "info", null);
        setField(term879933, term879933.getClass(), "imgBase", null);
        setField(term879933, term879933.getClass(), "starMap", null);
        setField(term879933, term879933.getClass(), "conquerBtn", null);
        setField(term879933, term879933.getClass(), "hailBtn", null);
        setBooleanField(term879933, term879933.getClass(), "interactiveView", false);
        setField(term879933, term879933.getClass(), "commanderLabel", null);
        setField(term879933, term879933.getClass(), "leaderViewBtn", null);
        setField(term879933, term879933.getClass(), "espionageMissonBtn", null);
        setField(term879933, term879933.getClass(), "exploreBtn", null);
        setField(term879933, term879933.getClass(), "upgradeBtn", null);
        setField(term879933, term879933.getClass(), "northPlanet", null);
        setField(term879933, term879933.getClass(), "southPlanet", null);
        setField(term879933, term879933.getClass(), "westPlanet", null);
        setField(term879933, term879933.getClass(), "eastPlanet", null);
        setBooleanField(term879933, term879933.getClass(), "isAlignmentXSet", false);
        setFloatField(term879933, term879933.getClass(), "alignmentX", 0.0F);
        setBooleanField(term879933, term879933.getClass(), "isAlignmentYSet", false);
        setFloatField(term879933, term879933.getClass(), "alignmentY", 0.0F);
        setField(term879933, term879933.getClass(), "ui", null);
        setField(term879933, term879933.getClass(), "listenerList", null);
        setField(term879933, term879933.getClass(), "clientProperties", null);
        setField(term879933, term879933.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term879933, term879933.getClass(), "autoscrolls", false);
        setField(term879933, term879933.getClass(), "border", null);
        setIntField(term879933, term879933.getClass(), "flags", 0);
        setField(term879933, term879933.getClass(), "inputVerifier", null);
        setBooleanField(term879933, term879933.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term879933, term879933.getClass(), "paintingChild", null);
        setField(term879933, term879933.getClass(), "popupMenu", null);
        setField(term879933, term879933.getClass(), "revalidateRunnableScheduled", null);
        setField(term879933, term879933.getClass(), "focusInputMap", null);
        setField(term879933, term879933.getClass(), "ancestorInputMap", null);
        setField(term879933, term879933.getClass(), "windowInputMap", null);
        setField(term879933, term879933.getClass(), "actionMap", null);
        setField(term879933, term879933.getClass(), "aaHint", null);
        setField(term879933, term879933.getClass(), "lcdRenderingHint", null);
        setField(term879933, term879933.getClass(), "component", null);
        setField(term879933, term879933.getClass(), "layoutMgr", null);
        setField(term879933, term879933.getClass(), "dispatcher", null);
        setField(term879933, term879933.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term879933, term879933.getClass(), "focusCycleRoot", false);
        setBooleanField(term879933, term879933.getClass(), "focusTraversalPolicyProvider", false);
        setField(term879933, term879933.getClass(), "printingThreads", null);
        setBooleanField(term879933, term879933.getClass(), "printing", false);
        setField(term879933, term879933.getClass(), "containerListener", null);
        setIntField(term879933, term879933.getClass(), "listeningChildren", 0);
        setIntField(term879933, term879933.getClass(), "listeningBoundsChildren", 0);
        setIntField(term879933, term879933.getClass(), "descendantsCount", 0);
        setField(term879933, term879933.getClass(), "preserveBackgroundColor", null);
        setIntField(term879933, term879933.getClass(), "numOfHWComponents", 0);
        setIntField(term879933, term879933.getClass(), "numOfLWComponents", 0);
        setField(term879933, term879933.getClass(), "modalComp", null);
        setField(term879933, term879933.getClass(), "modalAppContext", null);
        setIntField(term879933, term879933.getClass(), "containerSerializedDataVersion", 0);
        setField(term879933, term879933.getClass(), "peer", null);
        setField(term879933, term879933.getClass(), "parent", null);
        setField(term879933, term879933.getClass(), "appContext", null);
        setIntField(term879933, term879933.getClass(), "x", 0);
        setIntField(term879933, term879933.getClass(), "y", 0);
        setIntField(term879933, term879933.getClass(), "width", 0);
        setIntField(term879933, term879933.getClass(), "height", 0);
        setField(term879933, term879933.getClass(), "foreground", null);
        setField(term879933, term879933.getClass(), "background", null);
        setField(term879933, term879933.getClass(), "font", null);
        setField(term879933, term879933.getClass(), "peerFont", null);
        setField(term879933, term879933.getClass(), "cursor", null);
        setField(term879933, term879933.getClass(), "locale", null);
        setField(term879933, term879933.getClass(), "graphicsConfig", null);
        setField(term879933, term879933.getClass(), "bufferStrategy", null);
        setBooleanField(term879933, term879933.getClass(), "ignoreRepaint", false);
        setBooleanField(term879933, term879933.getClass(), "visible", false);
        setBooleanField(term879933, term879933.getClass(), "enabled", false);
        setBooleanField(term879933, term879933.getClass(), "valid", false);
        setField(term879933, term879933.getClass(), "dropTarget", null);
        setField(term879933, term879933.getClass(), "popups", null);
        setField(term879933, term879933.getClass(), "name", null);
        setBooleanField(term879933, term879933.getClass(), "nameExplicitlySet", false);
        setBooleanField(term879933, term879933.getClass(), "focusable", false);
        setIntField(term879933, term879933.getClass(), "isFocusTraversableOverridden", 0);
        setField(term879933, term879933.getClass(), "focusTraversalKeys", null);
        setBooleanField(term879933, term879933.getClass(), "focusTraversalKeysEnabled", false);
        setField(term879933, term879933.getClass(), "acc", null);
        setField(term879933, term879933.getClass(), "minSize", null);
        setBooleanField(term879933, term879933.getClass(), "minSizeSet", false);
        setField(term879933, term879933.getClass(), "prefSize", null);
        setBooleanField(term879933, term879933.getClass(), "prefSizeSet", false);
        setField(term879933, term879933.getClass(), "maxSize", null);
        setBooleanField(term879933, term879933.getClass(), "maxSizeSet", false);
        setField(term879933, term879933.getClass(), "componentOrientation", null);
        setBooleanField(term879933, term879933.getClass(), "newEventsOnly", false);
        setField(term879933, term879933.getClass(), "componentListener", null);
        setField(term879933, term879933.getClass(), "focusListener", null);
        setField(term879933, term879933.getClass(), "hierarchyListener", null);
        setField(term879933, term879933.getClass(), "hierarchyBoundsListener", null);
        setField(term879933, term879933.getClass(), "keyListener", null);
        setField(term879933, term879933.getClass(), "mouseListener", null);
        setField(term879933, term879933.getClass(), "mouseMotionListener", null);
        setField(term879933, term879933.getClass(), "mouseWheelListener", null);
        setField(term879933, term879933.getClass(), "inputMethodListener", null);
        setLongField(term879933, term879933.getClass(), "eventMask", 0L);
        setField(term879933, term879933.getClass(), "changeSupport", null);
        setField(term879933, term879933.getClass(), "objectLock", null);
        setBooleanField(term879933, term879933.getClass(), "isPacked", false);
        setIntField(term879933, term879933.getClass(), "boundsOp", 0);
        setField(term879933, term879933.getClass(), "compoundShape", null);
        setField(term879933, term879933.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term879933, term879933.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term879933, term879933.getClass(), "backgroundEraseDisabled", false);
        setField(term879933, term879933.getClass(), "eventCache", null);
        setBooleanField(term879933, term879933.getClass(), "coalescingEnabled", false);
        setBooleanField(term879933, term879933.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term879933, term879933.getClass(), "componentSerializedDataVersion", 0);
        setField(term879933, term879933.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getTargetEspionagePlanet", argTypes, term879933, args);
    }

};


