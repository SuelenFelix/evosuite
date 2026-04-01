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

public class FleetView_getFleetList_212438080625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term902739;

    public FleetView_getFleetList_212438080625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term902739 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term902739, term902739.getClass(), "totalPeople", null);
        setField(term902739, term902739.getClass(), "metal", null);
        setField(term902739, term902739.getClass(), "ownerLabel", null);
        setField(term902739, term902739.getClass(), "colonistSelection", null);
        setField(term902739, term902739.getClass(), "metalSelection", null);
        setField(term902739, term902739.getClass(), "planet", null);
        setField(term902739, term902739.getClass(), "fleet", null);
        setField(term902739, term902739.getClass(), "fleetList", null);
        setField(term902739, term902739.getClass(), "fleetNameText", null);
        setField(term902739, term902739.getClass(), "shipsInFleet", null);
        setField(term902739, term902739.getClass(), "fleetsInSpace", null);
        setField(term902739, term902739.getClass(), "starbaseFleet", null);
        setField(term902739, term902739.getClass(), "info", null);
        setField(term902739, term902739.getClass(), "imgBase", null);
        setField(term902739, term902739.getClass(), "starMap", null);
        setField(term902739, term902739.getClass(), "conquerBtn", null);
        setField(term902739, term902739.getClass(), "hailBtn", null);
        setBooleanField(term902739, term902739.getClass(), "interactiveView", false);
        setField(term902739, term902739.getClass(), "commanderLabel", null);
        setField(term902739, term902739.getClass(), "leaderViewBtn", null);
        setField(term902739, term902739.getClass(), "espionageMissonBtn", null);
        setField(term902739, term902739.getClass(), "exploreBtn", null);
        setField(term902739, term902739.getClass(), "upgradeBtn", null);
        setField(term902739, term902739.getClass(), "northPlanet", null);
        setField(term902739, term902739.getClass(), "southPlanet", null);
        setField(term902739, term902739.getClass(), "westPlanet", null);
        setField(term902739, term902739.getClass(), "eastPlanet", null);
        setBooleanField(term902739, term902739.getClass(), "isAlignmentXSet", false);
        setFloatField(term902739, term902739.getClass(), "alignmentX", 0.0F);
        setBooleanField(term902739, term902739.getClass(), "isAlignmentYSet", false);
        setFloatField(term902739, term902739.getClass(), "alignmentY", 0.0F);
        setField(term902739, term902739.getClass(), "ui", null);
        setField(term902739, term902739.getClass(), "listenerList", null);
        setField(term902739, term902739.getClass(), "clientProperties", null);
        setField(term902739, term902739.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term902739, term902739.getClass(), "autoscrolls", false);
        setField(term902739, term902739.getClass(), "border", null);
        setIntField(term902739, term902739.getClass(), "flags", 0);
        setField(term902739, term902739.getClass(), "inputVerifier", null);
        setBooleanField(term902739, term902739.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term902739, term902739.getClass(), "paintingChild", null);
        setField(term902739, term902739.getClass(), "popupMenu", null);
        setField(term902739, term902739.getClass(), "revalidateRunnableScheduled", null);
        setField(term902739, term902739.getClass(), "focusInputMap", null);
        setField(term902739, term902739.getClass(), "ancestorInputMap", null);
        setField(term902739, term902739.getClass(), "windowInputMap", null);
        setField(term902739, term902739.getClass(), "actionMap", null);
        setField(term902739, term902739.getClass(), "aaHint", null);
        setField(term902739, term902739.getClass(), "lcdRenderingHint", null);
        setField(term902739, term902739.getClass(), "component", null);
        setField(term902739, term902739.getClass(), "layoutMgr", null);
        setField(term902739, term902739.getClass(), "dispatcher", null);
        setField(term902739, term902739.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term902739, term902739.getClass(), "focusCycleRoot", false);
        setBooleanField(term902739, term902739.getClass(), "focusTraversalPolicyProvider", false);
        setField(term902739, term902739.getClass(), "printingThreads", null);
        setBooleanField(term902739, term902739.getClass(), "printing", false);
        setField(term902739, term902739.getClass(), "containerListener", null);
        setIntField(term902739, term902739.getClass(), "listeningChildren", 0);
        setIntField(term902739, term902739.getClass(), "listeningBoundsChildren", 0);
        setIntField(term902739, term902739.getClass(), "descendantsCount", 0);
        setField(term902739, term902739.getClass(), "preserveBackgroundColor", null);
        setIntField(term902739, term902739.getClass(), "numOfHWComponents", 0);
        setIntField(term902739, term902739.getClass(), "numOfLWComponents", 0);
        setField(term902739, term902739.getClass(), "modalComp", null);
        setField(term902739, term902739.getClass(), "modalAppContext", null);
        setIntField(term902739, term902739.getClass(), "containerSerializedDataVersion", 0);
        setField(term902739, term902739.getClass(), "peer", null);
        setField(term902739, term902739.getClass(), "parent", null);
        setField(term902739, term902739.getClass(), "appContext", null);
        setIntField(term902739, term902739.getClass(), "x", 0);
        setIntField(term902739, term902739.getClass(), "y", 0);
        setIntField(term902739, term902739.getClass(), "width", 0);
        setIntField(term902739, term902739.getClass(), "height", 0);
        setField(term902739, term902739.getClass(), "foreground", null);
        setField(term902739, term902739.getClass(), "background", null);
        setField(term902739, term902739.getClass(), "font", null);
        setField(term902739, term902739.getClass(), "peerFont", null);
        setField(term902739, term902739.getClass(), "cursor", null);
        setField(term902739, term902739.getClass(), "locale", null);
        setField(term902739, term902739.getClass(), "graphicsConfig", null);
        setField(term902739, term902739.getClass(), "bufferStrategy", null);
        setBooleanField(term902739, term902739.getClass(), "ignoreRepaint", false);
        setBooleanField(term902739, term902739.getClass(), "visible", false);
        setBooleanField(term902739, term902739.getClass(), "enabled", false);
        setBooleanField(term902739, term902739.getClass(), "valid", false);
        setField(term902739, term902739.getClass(), "dropTarget", null);
        setField(term902739, term902739.getClass(), "popups", null);
        setField(term902739, term902739.getClass(), "name", null);
        setBooleanField(term902739, term902739.getClass(), "nameExplicitlySet", false);
        setBooleanField(term902739, term902739.getClass(), "focusable", false);
        setIntField(term902739, term902739.getClass(), "isFocusTraversableOverridden", 0);
        setField(term902739, term902739.getClass(), "focusTraversalKeys", null);
        setBooleanField(term902739, term902739.getClass(), "focusTraversalKeysEnabled", false);
        setField(term902739, term902739.getClass(), "acc", null);
        setField(term902739, term902739.getClass(), "minSize", null);
        setBooleanField(term902739, term902739.getClass(), "minSizeSet", false);
        setField(term902739, term902739.getClass(), "prefSize", null);
        setBooleanField(term902739, term902739.getClass(), "prefSizeSet", false);
        setField(term902739, term902739.getClass(), "maxSize", null);
        setBooleanField(term902739, term902739.getClass(), "maxSizeSet", false);
        setField(term902739, term902739.getClass(), "componentOrientation", null);
        setBooleanField(term902739, term902739.getClass(), "newEventsOnly", false);
        setField(term902739, term902739.getClass(), "componentListener", null);
        setField(term902739, term902739.getClass(), "focusListener", null);
        setField(term902739, term902739.getClass(), "hierarchyListener", null);
        setField(term902739, term902739.getClass(), "hierarchyBoundsListener", null);
        setField(term902739, term902739.getClass(), "keyListener", null);
        setField(term902739, term902739.getClass(), "mouseListener", null);
        setField(term902739, term902739.getClass(), "mouseMotionListener", null);
        setField(term902739, term902739.getClass(), "mouseWheelListener", null);
        setField(term902739, term902739.getClass(), "inputMethodListener", null);
        setLongField(term902739, term902739.getClass(), "eventMask", 0L);
        setField(term902739, term902739.getClass(), "changeSupport", null);
        setField(term902739, term902739.getClass(), "objectLock", null);
        setBooleanField(term902739, term902739.getClass(), "isPacked", false);
        setIntField(term902739, term902739.getClass(), "boundsOp", 0);
        setField(term902739, term902739.getClass(), "compoundShape", null);
        setField(term902739, term902739.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term902739, term902739.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term902739, term902739.getClass(), "backgroundEraseDisabled", false);
        setField(term902739, term902739.getClass(), "eventCache", null);
        setBooleanField(term902739, term902739.getClass(), "coalescingEnabled", false);
        setBooleanField(term902739, term902739.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term902739, term902739.getClass(), "componentSerializedDataVersion", 0);
        setField(term902739, term902739.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetList", argTypes, term902739, args);
    }

};


