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

public class FleetView_getEspionagePlanet_46314545413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term882252;

    public FleetView_getEspionagePlanet_46314545413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term882252 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term882252, term882252.getClass(), "totalPeople", null);
        setField(term882252, term882252.getClass(), "metal", null);
        setField(term882252, term882252.getClass(), "ownerLabel", null);
        setField(term882252, term882252.getClass(), "colonistSelection", null);
        setField(term882252, term882252.getClass(), "metalSelection", null);
        setField(term882252, term882252.getClass(), "planet", null);
        setField(term882252, term882252.getClass(), "fleet", null);
        setField(term882252, term882252.getClass(), "fleetList", null);
        setField(term882252, term882252.getClass(), "fleetNameText", null);
        setField(term882252, term882252.getClass(), "shipsInFleet", null);
        setField(term882252, term882252.getClass(), "fleetsInSpace", null);
        setField(term882252, term882252.getClass(), "starbaseFleet", null);
        setField(term882252, term882252.getClass(), "info", null);
        setField(term882252, term882252.getClass(), "imgBase", null);
        setField(term882252, term882252.getClass(), "starMap", null);
        setField(term882252, term882252.getClass(), "conquerBtn", null);
        setField(term882252, term882252.getClass(), "hailBtn", null);
        setBooleanField(term882252, term882252.getClass(), "interactiveView", false);
        setField(term882252, term882252.getClass(), "commanderLabel", null);
        setField(term882252, term882252.getClass(), "leaderViewBtn", null);
        setField(term882252, term882252.getClass(), "espionageMissonBtn", null);
        setField(term882252, term882252.getClass(), "exploreBtn", null);
        setField(term882252, term882252.getClass(), "upgradeBtn", null);
        setField(term882252, term882252.getClass(), "northPlanet", null);
        setField(term882252, term882252.getClass(), "southPlanet", null);
        setField(term882252, term882252.getClass(), "westPlanet", null);
        setField(term882252, term882252.getClass(), "eastPlanet", null);
        setBooleanField(term882252, term882252.getClass(), "isAlignmentXSet", false);
        setFloatField(term882252, term882252.getClass(), "alignmentX", 0.0F);
        setBooleanField(term882252, term882252.getClass(), "isAlignmentYSet", false);
        setFloatField(term882252, term882252.getClass(), "alignmentY", 0.0F);
        setField(term882252, term882252.getClass(), "ui", null);
        setField(term882252, term882252.getClass(), "listenerList", null);
        setField(term882252, term882252.getClass(), "clientProperties", null);
        setField(term882252, term882252.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term882252, term882252.getClass(), "autoscrolls", false);
        setField(term882252, term882252.getClass(), "border", null);
        setIntField(term882252, term882252.getClass(), "flags", 0);
        setField(term882252, term882252.getClass(), "inputVerifier", null);
        setBooleanField(term882252, term882252.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term882252, term882252.getClass(), "paintingChild", null);
        setField(term882252, term882252.getClass(), "popupMenu", null);
        setField(term882252, term882252.getClass(), "revalidateRunnableScheduled", null);
        setField(term882252, term882252.getClass(), "focusInputMap", null);
        setField(term882252, term882252.getClass(), "ancestorInputMap", null);
        setField(term882252, term882252.getClass(), "windowInputMap", null);
        setField(term882252, term882252.getClass(), "actionMap", null);
        setField(term882252, term882252.getClass(), "aaHint", null);
        setField(term882252, term882252.getClass(), "lcdRenderingHint", null);
        setField(term882252, term882252.getClass(), "component", null);
        setField(term882252, term882252.getClass(), "layoutMgr", null);
        setField(term882252, term882252.getClass(), "dispatcher", null);
        setField(term882252, term882252.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term882252, term882252.getClass(), "focusCycleRoot", false);
        setBooleanField(term882252, term882252.getClass(), "focusTraversalPolicyProvider", false);
        setField(term882252, term882252.getClass(), "printingThreads", null);
        setBooleanField(term882252, term882252.getClass(), "printing", false);
        setField(term882252, term882252.getClass(), "containerListener", null);
        setIntField(term882252, term882252.getClass(), "listeningChildren", 0);
        setIntField(term882252, term882252.getClass(), "listeningBoundsChildren", 0);
        setIntField(term882252, term882252.getClass(), "descendantsCount", 0);
        setField(term882252, term882252.getClass(), "preserveBackgroundColor", null);
        setIntField(term882252, term882252.getClass(), "numOfHWComponents", 0);
        setIntField(term882252, term882252.getClass(), "numOfLWComponents", 0);
        setField(term882252, term882252.getClass(), "modalComp", null);
        setField(term882252, term882252.getClass(), "modalAppContext", null);
        setIntField(term882252, term882252.getClass(), "containerSerializedDataVersion", 0);
        setField(term882252, term882252.getClass(), "peer", null);
        setField(term882252, term882252.getClass(), "parent", null);
        setField(term882252, term882252.getClass(), "appContext", null);
        setIntField(term882252, term882252.getClass(), "x", 0);
        setIntField(term882252, term882252.getClass(), "y", 0);
        setIntField(term882252, term882252.getClass(), "width", 0);
        setIntField(term882252, term882252.getClass(), "height", 0);
        setField(term882252, term882252.getClass(), "foreground", null);
        setField(term882252, term882252.getClass(), "background", null);
        setField(term882252, term882252.getClass(), "font", null);
        setField(term882252, term882252.getClass(), "peerFont", null);
        setField(term882252, term882252.getClass(), "cursor", null);
        setField(term882252, term882252.getClass(), "locale", null);
        setField(term882252, term882252.getClass(), "graphicsConfig", null);
        setField(term882252, term882252.getClass(), "bufferStrategy", null);
        setBooleanField(term882252, term882252.getClass(), "ignoreRepaint", false);
        setBooleanField(term882252, term882252.getClass(), "visible", false);
        setBooleanField(term882252, term882252.getClass(), "enabled", false);
        setBooleanField(term882252, term882252.getClass(), "valid", false);
        setField(term882252, term882252.getClass(), "dropTarget", null);
        setField(term882252, term882252.getClass(), "popups", null);
        setField(term882252, term882252.getClass(), "name", null);
        setBooleanField(term882252, term882252.getClass(), "nameExplicitlySet", false);
        setBooleanField(term882252, term882252.getClass(), "focusable", false);
        setIntField(term882252, term882252.getClass(), "isFocusTraversableOverridden", 0);
        setField(term882252, term882252.getClass(), "focusTraversalKeys", null);
        setBooleanField(term882252, term882252.getClass(), "focusTraversalKeysEnabled", false);
        setField(term882252, term882252.getClass(), "acc", null);
        setField(term882252, term882252.getClass(), "minSize", null);
        setBooleanField(term882252, term882252.getClass(), "minSizeSet", false);
        setField(term882252, term882252.getClass(), "prefSize", null);
        setBooleanField(term882252, term882252.getClass(), "prefSizeSet", false);
        setField(term882252, term882252.getClass(), "maxSize", null);
        setBooleanField(term882252, term882252.getClass(), "maxSizeSet", false);
        setField(term882252, term882252.getClass(), "componentOrientation", null);
        setBooleanField(term882252, term882252.getClass(), "newEventsOnly", false);
        setField(term882252, term882252.getClass(), "componentListener", null);
        setField(term882252, term882252.getClass(), "focusListener", null);
        setField(term882252, term882252.getClass(), "hierarchyListener", null);
        setField(term882252, term882252.getClass(), "hierarchyBoundsListener", null);
        setField(term882252, term882252.getClass(), "keyListener", null);
        setField(term882252, term882252.getClass(), "mouseListener", null);
        setField(term882252, term882252.getClass(), "mouseMotionListener", null);
        setField(term882252, term882252.getClass(), "mouseWheelListener", null);
        setField(term882252, term882252.getClass(), "inputMethodListener", null);
        setLongField(term882252, term882252.getClass(), "eventMask", 0L);
        setField(term882252, term882252.getClass(), "changeSupport", null);
        setField(term882252, term882252.getClass(), "objectLock", null);
        setBooleanField(term882252, term882252.getClass(), "isPacked", false);
        setIntField(term882252, term882252.getClass(), "boundsOp", 0);
        setField(term882252, term882252.getClass(), "compoundShape", null);
        setField(term882252, term882252.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term882252, term882252.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term882252, term882252.getClass(), "backgroundEraseDisabled", false);
        setField(term882252, term882252.getClass(), "eventCache", null);
        setBooleanField(term882252, term882252.getClass(), "coalescingEnabled", false);
        setBooleanField(term882252, term882252.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term882252, term882252.getClass(), "componentSerializedDataVersion", 0);
        setField(term882252, term882252.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEspionagePlanet", argTypes, term882252, args);
    }

};


