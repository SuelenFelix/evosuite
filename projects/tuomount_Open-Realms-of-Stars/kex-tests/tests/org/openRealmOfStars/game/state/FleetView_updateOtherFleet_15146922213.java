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

public class FleetView_updateOtherFleet_15146922213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term864149;

    public FleetView_updateOtherFleet_15146922213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term864149 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term864149, term864149.getClass(), "totalPeople", null);
        setField(term864149, term864149.getClass(), "metal", null);
        setField(term864149, term864149.getClass(), "ownerLabel", null);
        setField(term864149, term864149.getClass(), "colonistSelection", null);
        setField(term864149, term864149.getClass(), "metalSelection", null);
        setField(term864149, term864149.getClass(), "planet", null);
        setField(term864149, term864149.getClass(), "fleet", null);
        setField(term864149, term864149.getClass(), "fleetList", null);
        setField(term864149, term864149.getClass(), "fleetNameText", null);
        setField(term864149, term864149.getClass(), "shipsInFleet", null);
        setField(term864149, term864149.getClass(), "fleetsInSpace", null);
        setField(term864149, term864149.getClass(), "starbaseFleet", null);
        setField(term864149, term864149.getClass(), "info", null);
        setField(term864149, term864149.getClass(), "imgBase", null);
        setField(term864149, term864149.getClass(), "starMap", null);
        setField(term864149, term864149.getClass(), "conquerBtn", null);
        setField(term864149, term864149.getClass(), "hailBtn", null);
        setBooleanField(term864149, term864149.getClass(), "interactiveView", false);
        setField(term864149, term864149.getClass(), "commanderLabel", null);
        setField(term864149, term864149.getClass(), "leaderViewBtn", null);
        setField(term864149, term864149.getClass(), "espionageMissonBtn", null);
        setField(term864149, term864149.getClass(), "exploreBtn", null);
        setField(term864149, term864149.getClass(), "upgradeBtn", null);
        setField(term864149, term864149.getClass(), "northPlanet", null);
        setField(term864149, term864149.getClass(), "southPlanet", null);
        setField(term864149, term864149.getClass(), "westPlanet", null);
        setField(term864149, term864149.getClass(), "eastPlanet", null);
        setBooleanField(term864149, term864149.getClass(), "isAlignmentXSet", false);
        setFloatField(term864149, term864149.getClass(), "alignmentX", 0.0F);
        setBooleanField(term864149, term864149.getClass(), "isAlignmentYSet", false);
        setFloatField(term864149, term864149.getClass(), "alignmentY", 0.0F);
        setField(term864149, term864149.getClass(), "ui", null);
        setField(term864149, term864149.getClass(), "listenerList", null);
        setField(term864149, term864149.getClass(), "clientProperties", null);
        setField(term864149, term864149.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term864149, term864149.getClass(), "autoscrolls", false);
        setField(term864149, term864149.getClass(), "border", null);
        setIntField(term864149, term864149.getClass(), "flags", 0);
        setField(term864149, term864149.getClass(), "inputVerifier", null);
        setBooleanField(term864149, term864149.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term864149, term864149.getClass(), "paintingChild", null);
        setField(term864149, term864149.getClass(), "popupMenu", null);
        setField(term864149, term864149.getClass(), "revalidateRunnableScheduled", null);
        setField(term864149, term864149.getClass(), "focusInputMap", null);
        setField(term864149, term864149.getClass(), "ancestorInputMap", null);
        setField(term864149, term864149.getClass(), "windowInputMap", null);
        setField(term864149, term864149.getClass(), "actionMap", null);
        setField(term864149, term864149.getClass(), "aaHint", null);
        setField(term864149, term864149.getClass(), "lcdRenderingHint", null);
        setField(term864149, term864149.getClass(), "component", null);
        setField(term864149, term864149.getClass(), "layoutMgr", null);
        setField(term864149, term864149.getClass(), "dispatcher", null);
        setField(term864149, term864149.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term864149, term864149.getClass(), "focusCycleRoot", false);
        setBooleanField(term864149, term864149.getClass(), "focusTraversalPolicyProvider", false);
        setField(term864149, term864149.getClass(), "printingThreads", null);
        setBooleanField(term864149, term864149.getClass(), "printing", false);
        setField(term864149, term864149.getClass(), "containerListener", null);
        setIntField(term864149, term864149.getClass(), "listeningChildren", 0);
        setIntField(term864149, term864149.getClass(), "listeningBoundsChildren", 0);
        setIntField(term864149, term864149.getClass(), "descendantsCount", 0);
        setField(term864149, term864149.getClass(), "preserveBackgroundColor", null);
        setIntField(term864149, term864149.getClass(), "numOfHWComponents", 0);
        setIntField(term864149, term864149.getClass(), "numOfLWComponents", 0);
        setField(term864149, term864149.getClass(), "modalComp", null);
        setField(term864149, term864149.getClass(), "modalAppContext", null);
        setIntField(term864149, term864149.getClass(), "containerSerializedDataVersion", 0);
        setField(term864149, term864149.getClass(), "peer", null);
        setField(term864149, term864149.getClass(), "parent", null);
        setField(term864149, term864149.getClass(), "appContext", null);
        setIntField(term864149, term864149.getClass(), "x", 0);
        setIntField(term864149, term864149.getClass(), "y", 0);
        setIntField(term864149, term864149.getClass(), "width", 0);
        setIntField(term864149, term864149.getClass(), "height", 0);
        setField(term864149, term864149.getClass(), "foreground", null);
        setField(term864149, term864149.getClass(), "background", null);
        setField(term864149, term864149.getClass(), "font", null);
        setField(term864149, term864149.getClass(), "peerFont", null);
        setField(term864149, term864149.getClass(), "cursor", null);
        setField(term864149, term864149.getClass(), "locale", null);
        setField(term864149, term864149.getClass(), "graphicsConfig", null);
        setField(term864149, term864149.getClass(), "bufferStrategy", null);
        setBooleanField(term864149, term864149.getClass(), "ignoreRepaint", false);
        setBooleanField(term864149, term864149.getClass(), "visible", false);
        setBooleanField(term864149, term864149.getClass(), "enabled", false);
        setBooleanField(term864149, term864149.getClass(), "valid", false);
        setField(term864149, term864149.getClass(), "dropTarget", null);
        setField(term864149, term864149.getClass(), "popups", null);
        setField(term864149, term864149.getClass(), "name", null);
        setBooleanField(term864149, term864149.getClass(), "nameExplicitlySet", false);
        setBooleanField(term864149, term864149.getClass(), "focusable", false);
        setIntField(term864149, term864149.getClass(), "isFocusTraversableOverridden", 0);
        setField(term864149, term864149.getClass(), "focusTraversalKeys", null);
        setBooleanField(term864149, term864149.getClass(), "focusTraversalKeysEnabled", false);
        setField(term864149, term864149.getClass(), "acc", null);
        setField(term864149, term864149.getClass(), "minSize", null);
        setBooleanField(term864149, term864149.getClass(), "minSizeSet", false);
        setField(term864149, term864149.getClass(), "prefSize", null);
        setBooleanField(term864149, term864149.getClass(), "prefSizeSet", false);
        setField(term864149, term864149.getClass(), "maxSize", null);
        setBooleanField(term864149, term864149.getClass(), "maxSizeSet", false);
        setField(term864149, term864149.getClass(), "componentOrientation", null);
        setBooleanField(term864149, term864149.getClass(), "newEventsOnly", false);
        setField(term864149, term864149.getClass(), "componentListener", null);
        setField(term864149, term864149.getClass(), "focusListener", null);
        setField(term864149, term864149.getClass(), "hierarchyListener", null);
        setField(term864149, term864149.getClass(), "hierarchyBoundsListener", null);
        setField(term864149, term864149.getClass(), "keyListener", null);
        setField(term864149, term864149.getClass(), "mouseListener", null);
        setField(term864149, term864149.getClass(), "mouseMotionListener", null);
        setField(term864149, term864149.getClass(), "mouseWheelListener", null);
        setField(term864149, term864149.getClass(), "inputMethodListener", null);
        setLongField(term864149, term864149.getClass(), "eventMask", 0L);
        setField(term864149, term864149.getClass(), "changeSupport", null);
        setField(term864149, term864149.getClass(), "objectLock", null);
        setBooleanField(term864149, term864149.getClass(), "isPacked", false);
        setIntField(term864149, term864149.getClass(), "boundsOp", 0);
        setField(term864149, term864149.getClass(), "compoundShape", null);
        setField(term864149, term864149.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term864149, term864149.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term864149, term864149.getClass(), "backgroundEraseDisabled", false);
        setField(term864149, term864149.getClass(), "eventCache", null);
        setBooleanField(term864149, term864149.getClass(), "coalescingEnabled", false);
        setBooleanField(term864149, term864149.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term864149, term864149.getClass(), "componentSerializedDataVersion", 0);
        setField(term864149, term864149.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateOtherFleet", argTypes, term864149, args);
    }

};


