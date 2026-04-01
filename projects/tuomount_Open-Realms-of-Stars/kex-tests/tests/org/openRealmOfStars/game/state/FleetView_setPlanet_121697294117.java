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

public class FleetView_setPlanet_121697294117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term893530;

    public FleetView_setPlanet_121697294117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term893530 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term893530, term893530.getClass(), "totalPeople", null);
        setField(term893530, term893530.getClass(), "metal", null);
        setField(term893530, term893530.getClass(), "ownerLabel", null);
        setField(term893530, term893530.getClass(), "colonistSelection", null);
        setField(term893530, term893530.getClass(), "metalSelection", null);
        setField(term893530, term893530.getClass(), "planet", null);
        setField(term893530, term893530.getClass(), "fleet", null);
        setField(term893530, term893530.getClass(), "fleetList", null);
        setField(term893530, term893530.getClass(), "fleetNameText", null);
        setField(term893530, term893530.getClass(), "shipsInFleet", null);
        setField(term893530, term893530.getClass(), "fleetsInSpace", null);
        setField(term893530, term893530.getClass(), "starbaseFleet", null);
        setField(term893530, term893530.getClass(), "info", null);
        setField(term893530, term893530.getClass(), "imgBase", null);
        setField(term893530, term893530.getClass(), "starMap", null);
        setField(term893530, term893530.getClass(), "conquerBtn", null);
        setField(term893530, term893530.getClass(), "hailBtn", null);
        setBooleanField(term893530, term893530.getClass(), "interactiveView", false);
        setField(term893530, term893530.getClass(), "commanderLabel", null);
        setField(term893530, term893530.getClass(), "leaderViewBtn", null);
        setField(term893530, term893530.getClass(), "espionageMissonBtn", null);
        setField(term893530, term893530.getClass(), "exploreBtn", null);
        setField(term893530, term893530.getClass(), "upgradeBtn", null);
        setField(term893530, term893530.getClass(), "northPlanet", null);
        setField(term893530, term893530.getClass(), "southPlanet", null);
        setField(term893530, term893530.getClass(), "westPlanet", null);
        setField(term893530, term893530.getClass(), "eastPlanet", null);
        setBooleanField(term893530, term893530.getClass(), "isAlignmentXSet", false);
        setFloatField(term893530, term893530.getClass(), "alignmentX", 0.0F);
        setBooleanField(term893530, term893530.getClass(), "isAlignmentYSet", false);
        setFloatField(term893530, term893530.getClass(), "alignmentY", 0.0F);
        setField(term893530, term893530.getClass(), "ui", null);
        setField(term893530, term893530.getClass(), "listenerList", null);
        setField(term893530, term893530.getClass(), "clientProperties", null);
        setField(term893530, term893530.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term893530, term893530.getClass(), "autoscrolls", false);
        setField(term893530, term893530.getClass(), "border", null);
        setIntField(term893530, term893530.getClass(), "flags", 0);
        setField(term893530, term893530.getClass(), "inputVerifier", null);
        setBooleanField(term893530, term893530.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term893530, term893530.getClass(), "paintingChild", null);
        setField(term893530, term893530.getClass(), "popupMenu", null);
        setField(term893530, term893530.getClass(), "revalidateRunnableScheduled", null);
        setField(term893530, term893530.getClass(), "focusInputMap", null);
        setField(term893530, term893530.getClass(), "ancestorInputMap", null);
        setField(term893530, term893530.getClass(), "windowInputMap", null);
        setField(term893530, term893530.getClass(), "actionMap", null);
        setField(term893530, term893530.getClass(), "aaHint", null);
        setField(term893530, term893530.getClass(), "lcdRenderingHint", null);
        setField(term893530, term893530.getClass(), "component", null);
        setField(term893530, term893530.getClass(), "layoutMgr", null);
        setField(term893530, term893530.getClass(), "dispatcher", null);
        setField(term893530, term893530.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term893530, term893530.getClass(), "focusCycleRoot", false);
        setBooleanField(term893530, term893530.getClass(), "focusTraversalPolicyProvider", false);
        setField(term893530, term893530.getClass(), "printingThreads", null);
        setBooleanField(term893530, term893530.getClass(), "printing", false);
        setField(term893530, term893530.getClass(), "containerListener", null);
        setIntField(term893530, term893530.getClass(), "listeningChildren", 0);
        setIntField(term893530, term893530.getClass(), "listeningBoundsChildren", 0);
        setIntField(term893530, term893530.getClass(), "descendantsCount", 0);
        setField(term893530, term893530.getClass(), "preserveBackgroundColor", null);
        setIntField(term893530, term893530.getClass(), "numOfHWComponents", 0);
        setIntField(term893530, term893530.getClass(), "numOfLWComponents", 0);
        setField(term893530, term893530.getClass(), "modalComp", null);
        setField(term893530, term893530.getClass(), "modalAppContext", null);
        setIntField(term893530, term893530.getClass(), "containerSerializedDataVersion", 0);
        setField(term893530, term893530.getClass(), "peer", null);
        setField(term893530, term893530.getClass(), "parent", null);
        setField(term893530, term893530.getClass(), "appContext", null);
        setIntField(term893530, term893530.getClass(), "x", 0);
        setIntField(term893530, term893530.getClass(), "y", 0);
        setIntField(term893530, term893530.getClass(), "width", 0);
        setIntField(term893530, term893530.getClass(), "height", 0);
        setField(term893530, term893530.getClass(), "foreground", null);
        setField(term893530, term893530.getClass(), "background", null);
        setField(term893530, term893530.getClass(), "font", null);
        setField(term893530, term893530.getClass(), "peerFont", null);
        setField(term893530, term893530.getClass(), "cursor", null);
        setField(term893530, term893530.getClass(), "locale", null);
        setField(term893530, term893530.getClass(), "graphicsConfig", null);
        setField(term893530, term893530.getClass(), "bufferStrategy", null);
        setBooleanField(term893530, term893530.getClass(), "ignoreRepaint", false);
        setBooleanField(term893530, term893530.getClass(), "visible", false);
        setBooleanField(term893530, term893530.getClass(), "enabled", false);
        setBooleanField(term893530, term893530.getClass(), "valid", false);
        setField(term893530, term893530.getClass(), "dropTarget", null);
        setField(term893530, term893530.getClass(), "popups", null);
        setField(term893530, term893530.getClass(), "name", null);
        setBooleanField(term893530, term893530.getClass(), "nameExplicitlySet", false);
        setBooleanField(term893530, term893530.getClass(), "focusable", false);
        setIntField(term893530, term893530.getClass(), "isFocusTraversableOverridden", 0);
        setField(term893530, term893530.getClass(), "focusTraversalKeys", null);
        setBooleanField(term893530, term893530.getClass(), "focusTraversalKeysEnabled", false);
        setField(term893530, term893530.getClass(), "acc", null);
        setField(term893530, term893530.getClass(), "minSize", null);
        setBooleanField(term893530, term893530.getClass(), "minSizeSet", false);
        setField(term893530, term893530.getClass(), "prefSize", null);
        setBooleanField(term893530, term893530.getClass(), "prefSizeSet", false);
        setField(term893530, term893530.getClass(), "maxSize", null);
        setBooleanField(term893530, term893530.getClass(), "maxSizeSet", false);
        setField(term893530, term893530.getClass(), "componentOrientation", null);
        setBooleanField(term893530, term893530.getClass(), "newEventsOnly", false);
        setField(term893530, term893530.getClass(), "componentListener", null);
        setField(term893530, term893530.getClass(), "focusListener", null);
        setField(term893530, term893530.getClass(), "hierarchyListener", null);
        setField(term893530, term893530.getClass(), "hierarchyBoundsListener", null);
        setField(term893530, term893530.getClass(), "keyListener", null);
        setField(term893530, term893530.getClass(), "mouseListener", null);
        setField(term893530, term893530.getClass(), "mouseMotionListener", null);
        setField(term893530, term893530.getClass(), "mouseWheelListener", null);
        setField(term893530, term893530.getClass(), "inputMethodListener", null);
        setLongField(term893530, term893530.getClass(), "eventMask", 0L);
        setField(term893530, term893530.getClass(), "changeSupport", null);
        setField(term893530, term893530.getClass(), "objectLock", null);
        setBooleanField(term893530, term893530.getClass(), "isPacked", false);
        setIntField(term893530, term893530.getClass(), "boundsOp", 0);
        setField(term893530, term893530.getClass(), "compoundShape", null);
        setField(term893530, term893530.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term893530, term893530.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term893530, term893530.getClass(), "backgroundEraseDisabled", false);
        setField(term893530, term893530.getClass(), "eventCache", null);
        setBooleanField(term893530, term893530.getClass(), "coalescingEnabled", false);
        setBooleanField(term893530, term893530.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term893530, term893530.getClass(), "componentSerializedDataVersion", 0);
        setField(term893530, term893530.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlanet", argTypes, term893530, args);
    }

};


