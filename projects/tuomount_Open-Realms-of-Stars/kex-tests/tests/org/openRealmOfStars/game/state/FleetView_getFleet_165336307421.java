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

public class FleetView_getFleet_165336307421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term898077;

    public FleetView_getFleet_165336307421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term898077 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term898077, term898077.getClass(), "totalPeople", null);
        setField(term898077, term898077.getClass(), "metal", null);
        setField(term898077, term898077.getClass(), "ownerLabel", null);
        setField(term898077, term898077.getClass(), "colonistSelection", null);
        setField(term898077, term898077.getClass(), "metalSelection", null);
        setField(term898077, term898077.getClass(), "planet", null);
        setField(term898077, term898077.getClass(), "fleet", null);
        setField(term898077, term898077.getClass(), "fleetList", null);
        setField(term898077, term898077.getClass(), "fleetNameText", null);
        setField(term898077, term898077.getClass(), "shipsInFleet", null);
        setField(term898077, term898077.getClass(), "fleetsInSpace", null);
        setField(term898077, term898077.getClass(), "starbaseFleet", null);
        setField(term898077, term898077.getClass(), "info", null);
        setField(term898077, term898077.getClass(), "imgBase", null);
        setField(term898077, term898077.getClass(), "starMap", null);
        setField(term898077, term898077.getClass(), "conquerBtn", null);
        setField(term898077, term898077.getClass(), "hailBtn", null);
        setBooleanField(term898077, term898077.getClass(), "interactiveView", false);
        setField(term898077, term898077.getClass(), "commanderLabel", null);
        setField(term898077, term898077.getClass(), "leaderViewBtn", null);
        setField(term898077, term898077.getClass(), "espionageMissonBtn", null);
        setField(term898077, term898077.getClass(), "exploreBtn", null);
        setField(term898077, term898077.getClass(), "upgradeBtn", null);
        setField(term898077, term898077.getClass(), "northPlanet", null);
        setField(term898077, term898077.getClass(), "southPlanet", null);
        setField(term898077, term898077.getClass(), "westPlanet", null);
        setField(term898077, term898077.getClass(), "eastPlanet", null);
        setBooleanField(term898077, term898077.getClass(), "isAlignmentXSet", false);
        setFloatField(term898077, term898077.getClass(), "alignmentX", 0.0F);
        setBooleanField(term898077, term898077.getClass(), "isAlignmentYSet", false);
        setFloatField(term898077, term898077.getClass(), "alignmentY", 0.0F);
        setField(term898077, term898077.getClass(), "ui", null);
        setField(term898077, term898077.getClass(), "listenerList", null);
        setField(term898077, term898077.getClass(), "clientProperties", null);
        setField(term898077, term898077.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term898077, term898077.getClass(), "autoscrolls", false);
        setField(term898077, term898077.getClass(), "border", null);
        setIntField(term898077, term898077.getClass(), "flags", 0);
        setField(term898077, term898077.getClass(), "inputVerifier", null);
        setBooleanField(term898077, term898077.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term898077, term898077.getClass(), "paintingChild", null);
        setField(term898077, term898077.getClass(), "popupMenu", null);
        setField(term898077, term898077.getClass(), "revalidateRunnableScheduled", null);
        setField(term898077, term898077.getClass(), "focusInputMap", null);
        setField(term898077, term898077.getClass(), "ancestorInputMap", null);
        setField(term898077, term898077.getClass(), "windowInputMap", null);
        setField(term898077, term898077.getClass(), "actionMap", null);
        setField(term898077, term898077.getClass(), "aaHint", null);
        setField(term898077, term898077.getClass(), "lcdRenderingHint", null);
        setField(term898077, term898077.getClass(), "component", null);
        setField(term898077, term898077.getClass(), "layoutMgr", null);
        setField(term898077, term898077.getClass(), "dispatcher", null);
        setField(term898077, term898077.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term898077, term898077.getClass(), "focusCycleRoot", false);
        setBooleanField(term898077, term898077.getClass(), "focusTraversalPolicyProvider", false);
        setField(term898077, term898077.getClass(), "printingThreads", null);
        setBooleanField(term898077, term898077.getClass(), "printing", false);
        setField(term898077, term898077.getClass(), "containerListener", null);
        setIntField(term898077, term898077.getClass(), "listeningChildren", 0);
        setIntField(term898077, term898077.getClass(), "listeningBoundsChildren", 0);
        setIntField(term898077, term898077.getClass(), "descendantsCount", 0);
        setField(term898077, term898077.getClass(), "preserveBackgroundColor", null);
        setIntField(term898077, term898077.getClass(), "numOfHWComponents", 0);
        setIntField(term898077, term898077.getClass(), "numOfLWComponents", 0);
        setField(term898077, term898077.getClass(), "modalComp", null);
        setField(term898077, term898077.getClass(), "modalAppContext", null);
        setIntField(term898077, term898077.getClass(), "containerSerializedDataVersion", 0);
        setField(term898077, term898077.getClass(), "peer", null);
        setField(term898077, term898077.getClass(), "parent", null);
        setField(term898077, term898077.getClass(), "appContext", null);
        setIntField(term898077, term898077.getClass(), "x", 0);
        setIntField(term898077, term898077.getClass(), "y", 0);
        setIntField(term898077, term898077.getClass(), "width", 0);
        setIntField(term898077, term898077.getClass(), "height", 0);
        setField(term898077, term898077.getClass(), "foreground", null);
        setField(term898077, term898077.getClass(), "background", null);
        setField(term898077, term898077.getClass(), "font", null);
        setField(term898077, term898077.getClass(), "peerFont", null);
        setField(term898077, term898077.getClass(), "cursor", null);
        setField(term898077, term898077.getClass(), "locale", null);
        setField(term898077, term898077.getClass(), "graphicsConfig", null);
        setField(term898077, term898077.getClass(), "bufferStrategy", null);
        setBooleanField(term898077, term898077.getClass(), "ignoreRepaint", false);
        setBooleanField(term898077, term898077.getClass(), "visible", false);
        setBooleanField(term898077, term898077.getClass(), "enabled", false);
        setBooleanField(term898077, term898077.getClass(), "valid", false);
        setField(term898077, term898077.getClass(), "dropTarget", null);
        setField(term898077, term898077.getClass(), "popups", null);
        setField(term898077, term898077.getClass(), "name", null);
        setBooleanField(term898077, term898077.getClass(), "nameExplicitlySet", false);
        setBooleanField(term898077, term898077.getClass(), "focusable", false);
        setIntField(term898077, term898077.getClass(), "isFocusTraversableOverridden", 0);
        setField(term898077, term898077.getClass(), "focusTraversalKeys", null);
        setBooleanField(term898077, term898077.getClass(), "focusTraversalKeysEnabled", false);
        setField(term898077, term898077.getClass(), "acc", null);
        setField(term898077, term898077.getClass(), "minSize", null);
        setBooleanField(term898077, term898077.getClass(), "minSizeSet", false);
        setField(term898077, term898077.getClass(), "prefSize", null);
        setBooleanField(term898077, term898077.getClass(), "prefSizeSet", false);
        setField(term898077, term898077.getClass(), "maxSize", null);
        setBooleanField(term898077, term898077.getClass(), "maxSizeSet", false);
        setField(term898077, term898077.getClass(), "componentOrientation", null);
        setBooleanField(term898077, term898077.getClass(), "newEventsOnly", false);
        setField(term898077, term898077.getClass(), "componentListener", null);
        setField(term898077, term898077.getClass(), "focusListener", null);
        setField(term898077, term898077.getClass(), "hierarchyListener", null);
        setField(term898077, term898077.getClass(), "hierarchyBoundsListener", null);
        setField(term898077, term898077.getClass(), "keyListener", null);
        setField(term898077, term898077.getClass(), "mouseListener", null);
        setField(term898077, term898077.getClass(), "mouseMotionListener", null);
        setField(term898077, term898077.getClass(), "mouseWheelListener", null);
        setField(term898077, term898077.getClass(), "inputMethodListener", null);
        setLongField(term898077, term898077.getClass(), "eventMask", 0L);
        setField(term898077, term898077.getClass(), "changeSupport", null);
        setField(term898077, term898077.getClass(), "objectLock", null);
        setBooleanField(term898077, term898077.getClass(), "isPacked", false);
        setIntField(term898077, term898077.getClass(), "boundsOp", 0);
        setField(term898077, term898077.getClass(), "compoundShape", null);
        setField(term898077, term898077.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term898077, term898077.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term898077, term898077.getClass(), "backgroundEraseDisabled", false);
        setField(term898077, term898077.getClass(), "eventCache", null);
        setBooleanField(term898077, term898077.getClass(), "coalescingEnabled", false);
        setBooleanField(term898077, term898077.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term898077, term898077.getClass(), "componentSerializedDataVersion", 0);
        setField(term898077, term898077.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleet", argTypes, term898077, args);
    }

};


