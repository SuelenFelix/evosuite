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

public class FleetView_calculateTotalTroopSpace_17996455747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868691;

    public FleetView_calculateTotalTroopSpace_17996455747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term868691 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term868691, term868691.getClass(), "totalPeople", null);
        setField(term868691, term868691.getClass(), "metal", null);
        setField(term868691, term868691.getClass(), "ownerLabel", null);
        setField(term868691, term868691.getClass(), "colonistSelection", null);
        setField(term868691, term868691.getClass(), "metalSelection", null);
        setField(term868691, term868691.getClass(), "planet", null);
        setField(term868691, term868691.getClass(), "fleet", null);
        setField(term868691, term868691.getClass(), "fleetList", null);
        setField(term868691, term868691.getClass(), "fleetNameText", null);
        setField(term868691, term868691.getClass(), "shipsInFleet", null);
        setField(term868691, term868691.getClass(), "fleetsInSpace", null);
        setField(term868691, term868691.getClass(), "starbaseFleet", null);
        setField(term868691, term868691.getClass(), "info", null);
        setField(term868691, term868691.getClass(), "imgBase", null);
        setField(term868691, term868691.getClass(), "starMap", null);
        setField(term868691, term868691.getClass(), "conquerBtn", null);
        setField(term868691, term868691.getClass(), "hailBtn", null);
        setBooleanField(term868691, term868691.getClass(), "interactiveView", false);
        setField(term868691, term868691.getClass(), "commanderLabel", null);
        setField(term868691, term868691.getClass(), "leaderViewBtn", null);
        setField(term868691, term868691.getClass(), "espionageMissonBtn", null);
        setField(term868691, term868691.getClass(), "exploreBtn", null);
        setField(term868691, term868691.getClass(), "upgradeBtn", null);
        setField(term868691, term868691.getClass(), "northPlanet", null);
        setField(term868691, term868691.getClass(), "southPlanet", null);
        setField(term868691, term868691.getClass(), "westPlanet", null);
        setField(term868691, term868691.getClass(), "eastPlanet", null);
        setBooleanField(term868691, term868691.getClass(), "isAlignmentXSet", false);
        setFloatField(term868691, term868691.getClass(), "alignmentX", 0.0F);
        setBooleanField(term868691, term868691.getClass(), "isAlignmentYSet", false);
        setFloatField(term868691, term868691.getClass(), "alignmentY", 0.0F);
        setField(term868691, term868691.getClass(), "ui", null);
        setField(term868691, term868691.getClass(), "listenerList", null);
        setField(term868691, term868691.getClass(), "clientProperties", null);
        setField(term868691, term868691.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term868691, term868691.getClass(), "autoscrolls", false);
        setField(term868691, term868691.getClass(), "border", null);
        setIntField(term868691, term868691.getClass(), "flags", 0);
        setField(term868691, term868691.getClass(), "inputVerifier", null);
        setBooleanField(term868691, term868691.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term868691, term868691.getClass(), "paintingChild", null);
        setField(term868691, term868691.getClass(), "popupMenu", null);
        setField(term868691, term868691.getClass(), "revalidateRunnableScheduled", null);
        setField(term868691, term868691.getClass(), "focusInputMap", null);
        setField(term868691, term868691.getClass(), "ancestorInputMap", null);
        setField(term868691, term868691.getClass(), "windowInputMap", null);
        setField(term868691, term868691.getClass(), "actionMap", null);
        setField(term868691, term868691.getClass(), "aaHint", null);
        setField(term868691, term868691.getClass(), "lcdRenderingHint", null);
        setField(term868691, term868691.getClass(), "component", null);
        setField(term868691, term868691.getClass(), "layoutMgr", null);
        setField(term868691, term868691.getClass(), "dispatcher", null);
        setField(term868691, term868691.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term868691, term868691.getClass(), "focusCycleRoot", false);
        setBooleanField(term868691, term868691.getClass(), "focusTraversalPolicyProvider", false);
        setField(term868691, term868691.getClass(), "printingThreads", null);
        setBooleanField(term868691, term868691.getClass(), "printing", false);
        setField(term868691, term868691.getClass(), "containerListener", null);
        setIntField(term868691, term868691.getClass(), "listeningChildren", 0);
        setIntField(term868691, term868691.getClass(), "listeningBoundsChildren", 0);
        setIntField(term868691, term868691.getClass(), "descendantsCount", 0);
        setField(term868691, term868691.getClass(), "preserveBackgroundColor", null);
        setIntField(term868691, term868691.getClass(), "numOfHWComponents", 0);
        setIntField(term868691, term868691.getClass(), "numOfLWComponents", 0);
        setField(term868691, term868691.getClass(), "modalComp", null);
        setField(term868691, term868691.getClass(), "modalAppContext", null);
        setIntField(term868691, term868691.getClass(), "containerSerializedDataVersion", 0);
        setField(term868691, term868691.getClass(), "peer", null);
        setField(term868691, term868691.getClass(), "parent", null);
        setField(term868691, term868691.getClass(), "appContext", null);
        setIntField(term868691, term868691.getClass(), "x", 0);
        setIntField(term868691, term868691.getClass(), "y", 0);
        setIntField(term868691, term868691.getClass(), "width", 0);
        setIntField(term868691, term868691.getClass(), "height", 0);
        setField(term868691, term868691.getClass(), "foreground", null);
        setField(term868691, term868691.getClass(), "background", null);
        setField(term868691, term868691.getClass(), "font", null);
        setField(term868691, term868691.getClass(), "peerFont", null);
        setField(term868691, term868691.getClass(), "cursor", null);
        setField(term868691, term868691.getClass(), "locale", null);
        setField(term868691, term868691.getClass(), "graphicsConfig", null);
        setField(term868691, term868691.getClass(), "bufferStrategy", null);
        setBooleanField(term868691, term868691.getClass(), "ignoreRepaint", false);
        setBooleanField(term868691, term868691.getClass(), "visible", false);
        setBooleanField(term868691, term868691.getClass(), "enabled", false);
        setBooleanField(term868691, term868691.getClass(), "valid", false);
        setField(term868691, term868691.getClass(), "dropTarget", null);
        setField(term868691, term868691.getClass(), "popups", null);
        setField(term868691, term868691.getClass(), "name", null);
        setBooleanField(term868691, term868691.getClass(), "nameExplicitlySet", false);
        setBooleanField(term868691, term868691.getClass(), "focusable", false);
        setIntField(term868691, term868691.getClass(), "isFocusTraversableOverridden", 0);
        setField(term868691, term868691.getClass(), "focusTraversalKeys", null);
        setBooleanField(term868691, term868691.getClass(), "focusTraversalKeysEnabled", false);
        setField(term868691, term868691.getClass(), "acc", null);
        setField(term868691, term868691.getClass(), "minSize", null);
        setBooleanField(term868691, term868691.getClass(), "minSizeSet", false);
        setField(term868691, term868691.getClass(), "prefSize", null);
        setBooleanField(term868691, term868691.getClass(), "prefSizeSet", false);
        setField(term868691, term868691.getClass(), "maxSize", null);
        setBooleanField(term868691, term868691.getClass(), "maxSizeSet", false);
        setField(term868691, term868691.getClass(), "componentOrientation", null);
        setBooleanField(term868691, term868691.getClass(), "newEventsOnly", false);
        setField(term868691, term868691.getClass(), "componentListener", null);
        setField(term868691, term868691.getClass(), "focusListener", null);
        setField(term868691, term868691.getClass(), "hierarchyListener", null);
        setField(term868691, term868691.getClass(), "hierarchyBoundsListener", null);
        setField(term868691, term868691.getClass(), "keyListener", null);
        setField(term868691, term868691.getClass(), "mouseListener", null);
        setField(term868691, term868691.getClass(), "mouseMotionListener", null);
        setField(term868691, term868691.getClass(), "mouseWheelListener", null);
        setField(term868691, term868691.getClass(), "inputMethodListener", null);
        setLongField(term868691, term868691.getClass(), "eventMask", 0L);
        setField(term868691, term868691.getClass(), "changeSupport", null);
        setField(term868691, term868691.getClass(), "objectLock", null);
        setBooleanField(term868691, term868691.getClass(), "isPacked", false);
        setIntField(term868691, term868691.getClass(), "boundsOp", 0);
        setField(term868691, term868691.getClass(), "compoundShape", null);
        setField(term868691, term868691.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term868691, term868691.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term868691, term868691.getClass(), "backgroundEraseDisabled", false);
        setField(term868691, term868691.getClass(), "eventCache", null);
        setBooleanField(term868691, term868691.getClass(), "coalescingEnabled", false);
        setBooleanField(term868691, term868691.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term868691, term868691.getClass(), "componentSerializedDataVersion", 0);
        setField(term868691, term868691.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateTotalTroopSpace", argTypes, term868691, args);
    }

};


