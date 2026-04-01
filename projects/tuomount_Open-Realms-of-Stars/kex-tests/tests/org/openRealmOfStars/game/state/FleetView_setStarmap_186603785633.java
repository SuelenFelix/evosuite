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

public class FleetView_setStarmap_186603785633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921355;

    public FleetView_setStarmap_186603785633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term921355 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term921355, term921355.getClass(), "totalPeople", null);
        setField(term921355, term921355.getClass(), "metal", null);
        setField(term921355, term921355.getClass(), "ownerLabel", null);
        setField(term921355, term921355.getClass(), "colonistSelection", null);
        setField(term921355, term921355.getClass(), "metalSelection", null);
        setField(term921355, term921355.getClass(), "planet", null);
        setField(term921355, term921355.getClass(), "fleet", null);
        setField(term921355, term921355.getClass(), "fleetList", null);
        setField(term921355, term921355.getClass(), "fleetNameText", null);
        setField(term921355, term921355.getClass(), "shipsInFleet", null);
        setField(term921355, term921355.getClass(), "fleetsInSpace", null);
        setField(term921355, term921355.getClass(), "starbaseFleet", null);
        setField(term921355, term921355.getClass(), "info", null);
        setField(term921355, term921355.getClass(), "imgBase", null);
        setField(term921355, term921355.getClass(), "starMap", null);
        setField(term921355, term921355.getClass(), "conquerBtn", null);
        setField(term921355, term921355.getClass(), "hailBtn", null);
        setBooleanField(term921355, term921355.getClass(), "interactiveView", false);
        setField(term921355, term921355.getClass(), "commanderLabel", null);
        setField(term921355, term921355.getClass(), "leaderViewBtn", null);
        setField(term921355, term921355.getClass(), "espionageMissonBtn", null);
        setField(term921355, term921355.getClass(), "exploreBtn", null);
        setField(term921355, term921355.getClass(), "upgradeBtn", null);
        setField(term921355, term921355.getClass(), "northPlanet", null);
        setField(term921355, term921355.getClass(), "southPlanet", null);
        setField(term921355, term921355.getClass(), "westPlanet", null);
        setField(term921355, term921355.getClass(), "eastPlanet", null);
        setBooleanField(term921355, term921355.getClass(), "isAlignmentXSet", false);
        setFloatField(term921355, term921355.getClass(), "alignmentX", 0.0F);
        setBooleanField(term921355, term921355.getClass(), "isAlignmentYSet", false);
        setFloatField(term921355, term921355.getClass(), "alignmentY", 0.0F);
        setField(term921355, term921355.getClass(), "ui", null);
        setField(term921355, term921355.getClass(), "listenerList", null);
        setField(term921355, term921355.getClass(), "clientProperties", null);
        setField(term921355, term921355.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term921355, term921355.getClass(), "autoscrolls", false);
        setField(term921355, term921355.getClass(), "border", null);
        setIntField(term921355, term921355.getClass(), "flags", 0);
        setField(term921355, term921355.getClass(), "inputVerifier", null);
        setBooleanField(term921355, term921355.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term921355, term921355.getClass(), "paintingChild", null);
        setField(term921355, term921355.getClass(), "popupMenu", null);
        setField(term921355, term921355.getClass(), "revalidateRunnableScheduled", null);
        setField(term921355, term921355.getClass(), "focusInputMap", null);
        setField(term921355, term921355.getClass(), "ancestorInputMap", null);
        setField(term921355, term921355.getClass(), "windowInputMap", null);
        setField(term921355, term921355.getClass(), "actionMap", null);
        setField(term921355, term921355.getClass(), "aaHint", null);
        setField(term921355, term921355.getClass(), "lcdRenderingHint", null);
        setField(term921355, term921355.getClass(), "component", null);
        setField(term921355, term921355.getClass(), "layoutMgr", null);
        setField(term921355, term921355.getClass(), "dispatcher", null);
        setField(term921355, term921355.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term921355, term921355.getClass(), "focusCycleRoot", false);
        setBooleanField(term921355, term921355.getClass(), "focusTraversalPolicyProvider", false);
        setField(term921355, term921355.getClass(), "printingThreads", null);
        setBooleanField(term921355, term921355.getClass(), "printing", false);
        setField(term921355, term921355.getClass(), "containerListener", null);
        setIntField(term921355, term921355.getClass(), "listeningChildren", 0);
        setIntField(term921355, term921355.getClass(), "listeningBoundsChildren", 0);
        setIntField(term921355, term921355.getClass(), "descendantsCount", 0);
        setField(term921355, term921355.getClass(), "preserveBackgroundColor", null);
        setIntField(term921355, term921355.getClass(), "numOfHWComponents", 0);
        setIntField(term921355, term921355.getClass(), "numOfLWComponents", 0);
        setField(term921355, term921355.getClass(), "modalComp", null);
        setField(term921355, term921355.getClass(), "modalAppContext", null);
        setIntField(term921355, term921355.getClass(), "containerSerializedDataVersion", 0);
        setField(term921355, term921355.getClass(), "peer", null);
        setField(term921355, term921355.getClass(), "parent", null);
        setField(term921355, term921355.getClass(), "appContext", null);
        setIntField(term921355, term921355.getClass(), "x", 0);
        setIntField(term921355, term921355.getClass(), "y", 0);
        setIntField(term921355, term921355.getClass(), "width", 0);
        setIntField(term921355, term921355.getClass(), "height", 0);
        setField(term921355, term921355.getClass(), "foreground", null);
        setField(term921355, term921355.getClass(), "background", null);
        setField(term921355, term921355.getClass(), "font", null);
        setField(term921355, term921355.getClass(), "peerFont", null);
        setField(term921355, term921355.getClass(), "cursor", null);
        setField(term921355, term921355.getClass(), "locale", null);
        setField(term921355, term921355.getClass(), "graphicsConfig", null);
        setField(term921355, term921355.getClass(), "bufferStrategy", null);
        setBooleanField(term921355, term921355.getClass(), "ignoreRepaint", false);
        setBooleanField(term921355, term921355.getClass(), "visible", false);
        setBooleanField(term921355, term921355.getClass(), "enabled", false);
        setBooleanField(term921355, term921355.getClass(), "valid", false);
        setField(term921355, term921355.getClass(), "dropTarget", null);
        setField(term921355, term921355.getClass(), "popups", null);
        setField(term921355, term921355.getClass(), "name", null);
        setBooleanField(term921355, term921355.getClass(), "nameExplicitlySet", false);
        setBooleanField(term921355, term921355.getClass(), "focusable", false);
        setIntField(term921355, term921355.getClass(), "isFocusTraversableOverridden", 0);
        setField(term921355, term921355.getClass(), "focusTraversalKeys", null);
        setBooleanField(term921355, term921355.getClass(), "focusTraversalKeysEnabled", false);
        setField(term921355, term921355.getClass(), "acc", null);
        setField(term921355, term921355.getClass(), "minSize", null);
        setBooleanField(term921355, term921355.getClass(), "minSizeSet", false);
        setField(term921355, term921355.getClass(), "prefSize", null);
        setBooleanField(term921355, term921355.getClass(), "prefSizeSet", false);
        setField(term921355, term921355.getClass(), "maxSize", null);
        setBooleanField(term921355, term921355.getClass(), "maxSizeSet", false);
        setField(term921355, term921355.getClass(), "componentOrientation", null);
        setBooleanField(term921355, term921355.getClass(), "newEventsOnly", false);
        setField(term921355, term921355.getClass(), "componentListener", null);
        setField(term921355, term921355.getClass(), "focusListener", null);
        setField(term921355, term921355.getClass(), "hierarchyListener", null);
        setField(term921355, term921355.getClass(), "hierarchyBoundsListener", null);
        setField(term921355, term921355.getClass(), "keyListener", null);
        setField(term921355, term921355.getClass(), "mouseListener", null);
        setField(term921355, term921355.getClass(), "mouseMotionListener", null);
        setField(term921355, term921355.getClass(), "mouseWheelListener", null);
        setField(term921355, term921355.getClass(), "inputMethodListener", null);
        setLongField(term921355, term921355.getClass(), "eventMask", 0L);
        setField(term921355, term921355.getClass(), "changeSupport", null);
        setField(term921355, term921355.getClass(), "objectLock", null);
        setBooleanField(term921355, term921355.getClass(), "isPacked", false);
        setIntField(term921355, term921355.getClass(), "boundsOp", 0);
        setField(term921355, term921355.getClass(), "compoundShape", null);
        setField(term921355, term921355.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term921355, term921355.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term921355, term921355.getClass(), "backgroundEraseDisabled", false);
        setField(term921355, term921355.getClass(), "eventCache", null);
        setBooleanField(term921355, term921355.getClass(), "coalescingEnabled", false);
        setBooleanField(term921355, term921355.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term921355, term921355.getClass(), "componentSerializedDataVersion", 0);
        setField(term921355, term921355.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStarmap", argTypes, term921355, args);
    }

};


