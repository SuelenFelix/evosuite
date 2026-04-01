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

public class FleetView_handleAction_187531604319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term895884;

    public FleetView_handleAction_187531604319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term895884 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term895884, term895884.getClass(), "totalPeople", null);
        setField(term895884, term895884.getClass(), "metal", null);
        setField(term895884, term895884.getClass(), "ownerLabel", null);
        setField(term895884, term895884.getClass(), "colonistSelection", null);
        setField(term895884, term895884.getClass(), "metalSelection", null);
        setField(term895884, term895884.getClass(), "planet", null);
        setField(term895884, term895884.getClass(), "fleet", null);
        setField(term895884, term895884.getClass(), "fleetList", null);
        setField(term895884, term895884.getClass(), "fleetNameText", null);
        setField(term895884, term895884.getClass(), "shipsInFleet", null);
        setField(term895884, term895884.getClass(), "fleetsInSpace", null);
        setField(term895884, term895884.getClass(), "starbaseFleet", null);
        setField(term895884, term895884.getClass(), "info", null);
        setField(term895884, term895884.getClass(), "imgBase", null);
        setField(term895884, term895884.getClass(), "starMap", null);
        setField(term895884, term895884.getClass(), "conquerBtn", null);
        setField(term895884, term895884.getClass(), "hailBtn", null);
        setBooleanField(term895884, term895884.getClass(), "interactiveView", false);
        setField(term895884, term895884.getClass(), "commanderLabel", null);
        setField(term895884, term895884.getClass(), "leaderViewBtn", null);
        setField(term895884, term895884.getClass(), "espionageMissonBtn", null);
        setField(term895884, term895884.getClass(), "exploreBtn", null);
        setField(term895884, term895884.getClass(), "upgradeBtn", null);
        setField(term895884, term895884.getClass(), "northPlanet", null);
        setField(term895884, term895884.getClass(), "southPlanet", null);
        setField(term895884, term895884.getClass(), "westPlanet", null);
        setField(term895884, term895884.getClass(), "eastPlanet", null);
        setBooleanField(term895884, term895884.getClass(), "isAlignmentXSet", false);
        setFloatField(term895884, term895884.getClass(), "alignmentX", 0.0F);
        setBooleanField(term895884, term895884.getClass(), "isAlignmentYSet", false);
        setFloatField(term895884, term895884.getClass(), "alignmentY", 0.0F);
        setField(term895884, term895884.getClass(), "ui", null);
        setField(term895884, term895884.getClass(), "listenerList", null);
        setField(term895884, term895884.getClass(), "clientProperties", null);
        setField(term895884, term895884.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term895884, term895884.getClass(), "autoscrolls", false);
        setField(term895884, term895884.getClass(), "border", null);
        setIntField(term895884, term895884.getClass(), "flags", 0);
        setField(term895884, term895884.getClass(), "inputVerifier", null);
        setBooleanField(term895884, term895884.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term895884, term895884.getClass(), "paintingChild", null);
        setField(term895884, term895884.getClass(), "popupMenu", null);
        setField(term895884, term895884.getClass(), "revalidateRunnableScheduled", null);
        setField(term895884, term895884.getClass(), "focusInputMap", null);
        setField(term895884, term895884.getClass(), "ancestorInputMap", null);
        setField(term895884, term895884.getClass(), "windowInputMap", null);
        setField(term895884, term895884.getClass(), "actionMap", null);
        setField(term895884, term895884.getClass(), "aaHint", null);
        setField(term895884, term895884.getClass(), "lcdRenderingHint", null);
        setField(term895884, term895884.getClass(), "component", null);
        setField(term895884, term895884.getClass(), "layoutMgr", null);
        setField(term895884, term895884.getClass(), "dispatcher", null);
        setField(term895884, term895884.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term895884, term895884.getClass(), "focusCycleRoot", false);
        setBooleanField(term895884, term895884.getClass(), "focusTraversalPolicyProvider", false);
        setField(term895884, term895884.getClass(), "printingThreads", null);
        setBooleanField(term895884, term895884.getClass(), "printing", false);
        setField(term895884, term895884.getClass(), "containerListener", null);
        setIntField(term895884, term895884.getClass(), "listeningChildren", 0);
        setIntField(term895884, term895884.getClass(), "listeningBoundsChildren", 0);
        setIntField(term895884, term895884.getClass(), "descendantsCount", 0);
        setField(term895884, term895884.getClass(), "preserveBackgroundColor", null);
        setIntField(term895884, term895884.getClass(), "numOfHWComponents", 0);
        setIntField(term895884, term895884.getClass(), "numOfLWComponents", 0);
        setField(term895884, term895884.getClass(), "modalComp", null);
        setField(term895884, term895884.getClass(), "modalAppContext", null);
        setIntField(term895884, term895884.getClass(), "containerSerializedDataVersion", 0);
        setField(term895884, term895884.getClass(), "peer", null);
        setField(term895884, term895884.getClass(), "parent", null);
        setField(term895884, term895884.getClass(), "appContext", null);
        setIntField(term895884, term895884.getClass(), "x", 0);
        setIntField(term895884, term895884.getClass(), "y", 0);
        setIntField(term895884, term895884.getClass(), "width", 0);
        setIntField(term895884, term895884.getClass(), "height", 0);
        setField(term895884, term895884.getClass(), "foreground", null);
        setField(term895884, term895884.getClass(), "background", null);
        setField(term895884, term895884.getClass(), "font", null);
        setField(term895884, term895884.getClass(), "peerFont", null);
        setField(term895884, term895884.getClass(), "cursor", null);
        setField(term895884, term895884.getClass(), "locale", null);
        setField(term895884, term895884.getClass(), "graphicsConfig", null);
        setField(term895884, term895884.getClass(), "bufferStrategy", null);
        setBooleanField(term895884, term895884.getClass(), "ignoreRepaint", false);
        setBooleanField(term895884, term895884.getClass(), "visible", false);
        setBooleanField(term895884, term895884.getClass(), "enabled", false);
        setBooleanField(term895884, term895884.getClass(), "valid", false);
        setField(term895884, term895884.getClass(), "dropTarget", null);
        setField(term895884, term895884.getClass(), "popups", null);
        setField(term895884, term895884.getClass(), "name", null);
        setBooleanField(term895884, term895884.getClass(), "nameExplicitlySet", false);
        setBooleanField(term895884, term895884.getClass(), "focusable", false);
        setIntField(term895884, term895884.getClass(), "isFocusTraversableOverridden", 0);
        setField(term895884, term895884.getClass(), "focusTraversalKeys", null);
        setBooleanField(term895884, term895884.getClass(), "focusTraversalKeysEnabled", false);
        setField(term895884, term895884.getClass(), "acc", null);
        setField(term895884, term895884.getClass(), "minSize", null);
        setBooleanField(term895884, term895884.getClass(), "minSizeSet", false);
        setField(term895884, term895884.getClass(), "prefSize", null);
        setBooleanField(term895884, term895884.getClass(), "prefSizeSet", false);
        setField(term895884, term895884.getClass(), "maxSize", null);
        setBooleanField(term895884, term895884.getClass(), "maxSizeSet", false);
        setField(term895884, term895884.getClass(), "componentOrientation", null);
        setBooleanField(term895884, term895884.getClass(), "newEventsOnly", false);
        setField(term895884, term895884.getClass(), "componentListener", null);
        setField(term895884, term895884.getClass(), "focusListener", null);
        setField(term895884, term895884.getClass(), "hierarchyListener", null);
        setField(term895884, term895884.getClass(), "hierarchyBoundsListener", null);
        setField(term895884, term895884.getClass(), "keyListener", null);
        setField(term895884, term895884.getClass(), "mouseListener", null);
        setField(term895884, term895884.getClass(), "mouseMotionListener", null);
        setField(term895884, term895884.getClass(), "mouseWheelListener", null);
        setField(term895884, term895884.getClass(), "inputMethodListener", null);
        setLongField(term895884, term895884.getClass(), "eventMask", 0L);
        setField(term895884, term895884.getClass(), "changeSupport", null);
        setField(term895884, term895884.getClass(), "objectLock", null);
        setBooleanField(term895884, term895884.getClass(), "isPacked", false);
        setIntField(term895884, term895884.getClass(), "boundsOp", 0);
        setField(term895884, term895884.getClass(), "compoundShape", null);
        setField(term895884, term895884.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term895884, term895884.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term895884, term895884.getClass(), "backgroundEraseDisabled", false);
        setField(term895884, term895884.getClass(), "eventCache", null);
        setBooleanField(term895884, term895884.getClass(), "coalescingEnabled", false);
        setBooleanField(term895884, term895884.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term895884, term895884.getClass(), "componentSerializedDataVersion", 0);
        setField(term895884, term895884.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term895884, args);
    }

};


