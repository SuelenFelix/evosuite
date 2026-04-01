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

public class FleetView_calculateTotalMetalSpace_6470089875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term866426;

    public FleetView_calculateTotalMetalSpace_6470089875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term866426 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term866426, term866426.getClass(), "totalPeople", null);
        setField(term866426, term866426.getClass(), "metal", null);
        setField(term866426, term866426.getClass(), "ownerLabel", null);
        setField(term866426, term866426.getClass(), "colonistSelection", null);
        setField(term866426, term866426.getClass(), "metalSelection", null);
        setField(term866426, term866426.getClass(), "planet", null);
        setField(term866426, term866426.getClass(), "fleet", null);
        setField(term866426, term866426.getClass(), "fleetList", null);
        setField(term866426, term866426.getClass(), "fleetNameText", null);
        setField(term866426, term866426.getClass(), "shipsInFleet", null);
        setField(term866426, term866426.getClass(), "fleetsInSpace", null);
        setField(term866426, term866426.getClass(), "starbaseFleet", null);
        setField(term866426, term866426.getClass(), "info", null);
        setField(term866426, term866426.getClass(), "imgBase", null);
        setField(term866426, term866426.getClass(), "starMap", null);
        setField(term866426, term866426.getClass(), "conquerBtn", null);
        setField(term866426, term866426.getClass(), "hailBtn", null);
        setBooleanField(term866426, term866426.getClass(), "interactiveView", false);
        setField(term866426, term866426.getClass(), "commanderLabel", null);
        setField(term866426, term866426.getClass(), "leaderViewBtn", null);
        setField(term866426, term866426.getClass(), "espionageMissonBtn", null);
        setField(term866426, term866426.getClass(), "exploreBtn", null);
        setField(term866426, term866426.getClass(), "upgradeBtn", null);
        setField(term866426, term866426.getClass(), "northPlanet", null);
        setField(term866426, term866426.getClass(), "southPlanet", null);
        setField(term866426, term866426.getClass(), "westPlanet", null);
        setField(term866426, term866426.getClass(), "eastPlanet", null);
        setBooleanField(term866426, term866426.getClass(), "isAlignmentXSet", false);
        setFloatField(term866426, term866426.getClass(), "alignmentX", 0.0F);
        setBooleanField(term866426, term866426.getClass(), "isAlignmentYSet", false);
        setFloatField(term866426, term866426.getClass(), "alignmentY", 0.0F);
        setField(term866426, term866426.getClass(), "ui", null);
        setField(term866426, term866426.getClass(), "listenerList", null);
        setField(term866426, term866426.getClass(), "clientProperties", null);
        setField(term866426, term866426.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term866426, term866426.getClass(), "autoscrolls", false);
        setField(term866426, term866426.getClass(), "border", null);
        setIntField(term866426, term866426.getClass(), "flags", 0);
        setField(term866426, term866426.getClass(), "inputVerifier", null);
        setBooleanField(term866426, term866426.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term866426, term866426.getClass(), "paintingChild", null);
        setField(term866426, term866426.getClass(), "popupMenu", null);
        setField(term866426, term866426.getClass(), "revalidateRunnableScheduled", null);
        setField(term866426, term866426.getClass(), "focusInputMap", null);
        setField(term866426, term866426.getClass(), "ancestorInputMap", null);
        setField(term866426, term866426.getClass(), "windowInputMap", null);
        setField(term866426, term866426.getClass(), "actionMap", null);
        setField(term866426, term866426.getClass(), "aaHint", null);
        setField(term866426, term866426.getClass(), "lcdRenderingHint", null);
        setField(term866426, term866426.getClass(), "component", null);
        setField(term866426, term866426.getClass(), "layoutMgr", null);
        setField(term866426, term866426.getClass(), "dispatcher", null);
        setField(term866426, term866426.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term866426, term866426.getClass(), "focusCycleRoot", false);
        setBooleanField(term866426, term866426.getClass(), "focusTraversalPolicyProvider", false);
        setField(term866426, term866426.getClass(), "printingThreads", null);
        setBooleanField(term866426, term866426.getClass(), "printing", false);
        setField(term866426, term866426.getClass(), "containerListener", null);
        setIntField(term866426, term866426.getClass(), "listeningChildren", 0);
        setIntField(term866426, term866426.getClass(), "listeningBoundsChildren", 0);
        setIntField(term866426, term866426.getClass(), "descendantsCount", 0);
        setField(term866426, term866426.getClass(), "preserveBackgroundColor", null);
        setIntField(term866426, term866426.getClass(), "numOfHWComponents", 0);
        setIntField(term866426, term866426.getClass(), "numOfLWComponents", 0);
        setField(term866426, term866426.getClass(), "modalComp", null);
        setField(term866426, term866426.getClass(), "modalAppContext", null);
        setIntField(term866426, term866426.getClass(), "containerSerializedDataVersion", 0);
        setField(term866426, term866426.getClass(), "peer", null);
        setField(term866426, term866426.getClass(), "parent", null);
        setField(term866426, term866426.getClass(), "appContext", null);
        setIntField(term866426, term866426.getClass(), "x", 0);
        setIntField(term866426, term866426.getClass(), "y", 0);
        setIntField(term866426, term866426.getClass(), "width", 0);
        setIntField(term866426, term866426.getClass(), "height", 0);
        setField(term866426, term866426.getClass(), "foreground", null);
        setField(term866426, term866426.getClass(), "background", null);
        setField(term866426, term866426.getClass(), "font", null);
        setField(term866426, term866426.getClass(), "peerFont", null);
        setField(term866426, term866426.getClass(), "cursor", null);
        setField(term866426, term866426.getClass(), "locale", null);
        setField(term866426, term866426.getClass(), "graphicsConfig", null);
        setField(term866426, term866426.getClass(), "bufferStrategy", null);
        setBooleanField(term866426, term866426.getClass(), "ignoreRepaint", false);
        setBooleanField(term866426, term866426.getClass(), "visible", false);
        setBooleanField(term866426, term866426.getClass(), "enabled", false);
        setBooleanField(term866426, term866426.getClass(), "valid", false);
        setField(term866426, term866426.getClass(), "dropTarget", null);
        setField(term866426, term866426.getClass(), "popups", null);
        setField(term866426, term866426.getClass(), "name", null);
        setBooleanField(term866426, term866426.getClass(), "nameExplicitlySet", false);
        setBooleanField(term866426, term866426.getClass(), "focusable", false);
        setIntField(term866426, term866426.getClass(), "isFocusTraversableOverridden", 0);
        setField(term866426, term866426.getClass(), "focusTraversalKeys", null);
        setBooleanField(term866426, term866426.getClass(), "focusTraversalKeysEnabled", false);
        setField(term866426, term866426.getClass(), "acc", null);
        setField(term866426, term866426.getClass(), "minSize", null);
        setBooleanField(term866426, term866426.getClass(), "minSizeSet", false);
        setField(term866426, term866426.getClass(), "prefSize", null);
        setBooleanField(term866426, term866426.getClass(), "prefSizeSet", false);
        setField(term866426, term866426.getClass(), "maxSize", null);
        setBooleanField(term866426, term866426.getClass(), "maxSizeSet", false);
        setField(term866426, term866426.getClass(), "componentOrientation", null);
        setBooleanField(term866426, term866426.getClass(), "newEventsOnly", false);
        setField(term866426, term866426.getClass(), "componentListener", null);
        setField(term866426, term866426.getClass(), "focusListener", null);
        setField(term866426, term866426.getClass(), "hierarchyListener", null);
        setField(term866426, term866426.getClass(), "hierarchyBoundsListener", null);
        setField(term866426, term866426.getClass(), "keyListener", null);
        setField(term866426, term866426.getClass(), "mouseListener", null);
        setField(term866426, term866426.getClass(), "mouseMotionListener", null);
        setField(term866426, term866426.getClass(), "mouseWheelListener", null);
        setField(term866426, term866426.getClass(), "inputMethodListener", null);
        setLongField(term866426, term866426.getClass(), "eventMask", 0L);
        setField(term866426, term866426.getClass(), "changeSupport", null);
        setField(term866426, term866426.getClass(), "objectLock", null);
        setBooleanField(term866426, term866426.getClass(), "isPacked", false);
        setIntField(term866426, term866426.getClass(), "boundsOp", 0);
        setField(term866426, term866426.getClass(), "compoundShape", null);
        setField(term866426, term866426.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term866426, term866426.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term866426, term866426.getClass(), "backgroundEraseDisabled", false);
        setField(term866426, term866426.getClass(), "eventCache", null);
        setBooleanField(term866426, term866426.getClass(), "coalescingEnabled", false);
        setBooleanField(term866426, term866426.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term866426, term866426.getClass(), "componentSerializedDataVersion", 0);
        setField(term866426, term866426.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateTotalMetalSpace", argTypes, term866426, args);
    }

};


