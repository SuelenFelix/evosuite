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

public class FleetView_setFleetList_59954990827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term905013;

    public FleetView_setFleetList_59954990827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term905013 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term905013, term905013.getClass(), "totalPeople", null);
        setField(term905013, term905013.getClass(), "metal", null);
        setField(term905013, term905013.getClass(), "ownerLabel", null);
        setField(term905013, term905013.getClass(), "colonistSelection", null);
        setField(term905013, term905013.getClass(), "metalSelection", null);
        setField(term905013, term905013.getClass(), "planet", null);
        setField(term905013, term905013.getClass(), "fleet", null);
        setField(term905013, term905013.getClass(), "fleetList", null);
        setField(term905013, term905013.getClass(), "fleetNameText", null);
        setField(term905013, term905013.getClass(), "shipsInFleet", null);
        setField(term905013, term905013.getClass(), "fleetsInSpace", null);
        setField(term905013, term905013.getClass(), "starbaseFleet", null);
        setField(term905013, term905013.getClass(), "info", null);
        setField(term905013, term905013.getClass(), "imgBase", null);
        setField(term905013, term905013.getClass(), "starMap", null);
        setField(term905013, term905013.getClass(), "conquerBtn", null);
        setField(term905013, term905013.getClass(), "hailBtn", null);
        setBooleanField(term905013, term905013.getClass(), "interactiveView", false);
        setField(term905013, term905013.getClass(), "commanderLabel", null);
        setField(term905013, term905013.getClass(), "leaderViewBtn", null);
        setField(term905013, term905013.getClass(), "espionageMissonBtn", null);
        setField(term905013, term905013.getClass(), "exploreBtn", null);
        setField(term905013, term905013.getClass(), "upgradeBtn", null);
        setField(term905013, term905013.getClass(), "northPlanet", null);
        setField(term905013, term905013.getClass(), "southPlanet", null);
        setField(term905013, term905013.getClass(), "westPlanet", null);
        setField(term905013, term905013.getClass(), "eastPlanet", null);
        setBooleanField(term905013, term905013.getClass(), "isAlignmentXSet", false);
        setFloatField(term905013, term905013.getClass(), "alignmentX", 0.0F);
        setBooleanField(term905013, term905013.getClass(), "isAlignmentYSet", false);
        setFloatField(term905013, term905013.getClass(), "alignmentY", 0.0F);
        setField(term905013, term905013.getClass(), "ui", null);
        setField(term905013, term905013.getClass(), "listenerList", null);
        setField(term905013, term905013.getClass(), "clientProperties", null);
        setField(term905013, term905013.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term905013, term905013.getClass(), "autoscrolls", false);
        setField(term905013, term905013.getClass(), "border", null);
        setIntField(term905013, term905013.getClass(), "flags", 0);
        setField(term905013, term905013.getClass(), "inputVerifier", null);
        setBooleanField(term905013, term905013.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term905013, term905013.getClass(), "paintingChild", null);
        setField(term905013, term905013.getClass(), "popupMenu", null);
        setField(term905013, term905013.getClass(), "revalidateRunnableScheduled", null);
        setField(term905013, term905013.getClass(), "focusInputMap", null);
        setField(term905013, term905013.getClass(), "ancestorInputMap", null);
        setField(term905013, term905013.getClass(), "windowInputMap", null);
        setField(term905013, term905013.getClass(), "actionMap", null);
        setField(term905013, term905013.getClass(), "aaHint", null);
        setField(term905013, term905013.getClass(), "lcdRenderingHint", null);
        setField(term905013, term905013.getClass(), "component", null);
        setField(term905013, term905013.getClass(), "layoutMgr", null);
        setField(term905013, term905013.getClass(), "dispatcher", null);
        setField(term905013, term905013.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term905013, term905013.getClass(), "focusCycleRoot", false);
        setBooleanField(term905013, term905013.getClass(), "focusTraversalPolicyProvider", false);
        setField(term905013, term905013.getClass(), "printingThreads", null);
        setBooleanField(term905013, term905013.getClass(), "printing", false);
        setField(term905013, term905013.getClass(), "containerListener", null);
        setIntField(term905013, term905013.getClass(), "listeningChildren", 0);
        setIntField(term905013, term905013.getClass(), "listeningBoundsChildren", 0);
        setIntField(term905013, term905013.getClass(), "descendantsCount", 0);
        setField(term905013, term905013.getClass(), "preserveBackgroundColor", null);
        setIntField(term905013, term905013.getClass(), "numOfHWComponents", 0);
        setIntField(term905013, term905013.getClass(), "numOfLWComponents", 0);
        setField(term905013, term905013.getClass(), "modalComp", null);
        setField(term905013, term905013.getClass(), "modalAppContext", null);
        setIntField(term905013, term905013.getClass(), "containerSerializedDataVersion", 0);
        setField(term905013, term905013.getClass(), "peer", null);
        setField(term905013, term905013.getClass(), "parent", null);
        setField(term905013, term905013.getClass(), "appContext", null);
        setIntField(term905013, term905013.getClass(), "x", 0);
        setIntField(term905013, term905013.getClass(), "y", 0);
        setIntField(term905013, term905013.getClass(), "width", 0);
        setIntField(term905013, term905013.getClass(), "height", 0);
        setField(term905013, term905013.getClass(), "foreground", null);
        setField(term905013, term905013.getClass(), "background", null);
        setField(term905013, term905013.getClass(), "font", null);
        setField(term905013, term905013.getClass(), "peerFont", null);
        setField(term905013, term905013.getClass(), "cursor", null);
        setField(term905013, term905013.getClass(), "locale", null);
        setField(term905013, term905013.getClass(), "graphicsConfig", null);
        setField(term905013, term905013.getClass(), "bufferStrategy", null);
        setBooleanField(term905013, term905013.getClass(), "ignoreRepaint", false);
        setBooleanField(term905013, term905013.getClass(), "visible", false);
        setBooleanField(term905013, term905013.getClass(), "enabled", false);
        setBooleanField(term905013, term905013.getClass(), "valid", false);
        setField(term905013, term905013.getClass(), "dropTarget", null);
        setField(term905013, term905013.getClass(), "popups", null);
        setField(term905013, term905013.getClass(), "name", null);
        setBooleanField(term905013, term905013.getClass(), "nameExplicitlySet", false);
        setBooleanField(term905013, term905013.getClass(), "focusable", false);
        setIntField(term905013, term905013.getClass(), "isFocusTraversableOverridden", 0);
        setField(term905013, term905013.getClass(), "focusTraversalKeys", null);
        setBooleanField(term905013, term905013.getClass(), "focusTraversalKeysEnabled", false);
        setField(term905013, term905013.getClass(), "acc", null);
        setField(term905013, term905013.getClass(), "minSize", null);
        setBooleanField(term905013, term905013.getClass(), "minSizeSet", false);
        setField(term905013, term905013.getClass(), "prefSize", null);
        setBooleanField(term905013, term905013.getClass(), "prefSizeSet", false);
        setField(term905013, term905013.getClass(), "maxSize", null);
        setBooleanField(term905013, term905013.getClass(), "maxSizeSet", false);
        setField(term905013, term905013.getClass(), "componentOrientation", null);
        setBooleanField(term905013, term905013.getClass(), "newEventsOnly", false);
        setField(term905013, term905013.getClass(), "componentListener", null);
        setField(term905013, term905013.getClass(), "focusListener", null);
        setField(term905013, term905013.getClass(), "hierarchyListener", null);
        setField(term905013, term905013.getClass(), "hierarchyBoundsListener", null);
        setField(term905013, term905013.getClass(), "keyListener", null);
        setField(term905013, term905013.getClass(), "mouseListener", null);
        setField(term905013, term905013.getClass(), "mouseMotionListener", null);
        setField(term905013, term905013.getClass(), "mouseWheelListener", null);
        setField(term905013, term905013.getClass(), "inputMethodListener", null);
        setLongField(term905013, term905013.getClass(), "eventMask", 0L);
        setField(term905013, term905013.getClass(), "changeSupport", null);
        setField(term905013, term905013.getClass(), "objectLock", null);
        setBooleanField(term905013, term905013.getClass(), "isPacked", false);
        setIntField(term905013, term905013.getClass(), "boundsOp", 0);
        setField(term905013, term905013.getClass(), "compoundShape", null);
        setField(term905013, term905013.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term905013, term905013.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term905013, term905013.getClass(), "backgroundEraseDisabled", false);
        setField(term905013, term905013.getClass(), "eventCache", null);
        setBooleanField(term905013, term905013.getClass(), "coalescingEnabled", false);
        setBooleanField(term905013, term905013.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term905013, term905013.getClass(), "componentSerializedDataVersion", 0);
        setField(term905013, term905013.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.FleetList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFleetList", argTypes, term905013, args);
    }

};


