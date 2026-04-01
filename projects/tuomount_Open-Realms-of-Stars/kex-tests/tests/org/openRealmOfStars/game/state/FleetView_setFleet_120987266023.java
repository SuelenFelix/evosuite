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

public class FleetView_setFleet_120987266023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term900420;

    public FleetView_setFleet_120987266023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term900420 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term900420, term900420.getClass(), "totalPeople", null);
        setField(term900420, term900420.getClass(), "metal", null);
        setField(term900420, term900420.getClass(), "ownerLabel", null);
        setField(term900420, term900420.getClass(), "colonistSelection", null);
        setField(term900420, term900420.getClass(), "metalSelection", null);
        setField(term900420, term900420.getClass(), "planet", null);
        setField(term900420, term900420.getClass(), "fleet", null);
        setField(term900420, term900420.getClass(), "fleetList", null);
        setField(term900420, term900420.getClass(), "fleetNameText", null);
        setField(term900420, term900420.getClass(), "shipsInFleet", null);
        setField(term900420, term900420.getClass(), "fleetsInSpace", null);
        setField(term900420, term900420.getClass(), "starbaseFleet", null);
        setField(term900420, term900420.getClass(), "info", null);
        setField(term900420, term900420.getClass(), "imgBase", null);
        setField(term900420, term900420.getClass(), "starMap", null);
        setField(term900420, term900420.getClass(), "conquerBtn", null);
        setField(term900420, term900420.getClass(), "hailBtn", null);
        setBooleanField(term900420, term900420.getClass(), "interactiveView", false);
        setField(term900420, term900420.getClass(), "commanderLabel", null);
        setField(term900420, term900420.getClass(), "leaderViewBtn", null);
        setField(term900420, term900420.getClass(), "espionageMissonBtn", null);
        setField(term900420, term900420.getClass(), "exploreBtn", null);
        setField(term900420, term900420.getClass(), "upgradeBtn", null);
        setField(term900420, term900420.getClass(), "northPlanet", null);
        setField(term900420, term900420.getClass(), "southPlanet", null);
        setField(term900420, term900420.getClass(), "westPlanet", null);
        setField(term900420, term900420.getClass(), "eastPlanet", null);
        setBooleanField(term900420, term900420.getClass(), "isAlignmentXSet", false);
        setFloatField(term900420, term900420.getClass(), "alignmentX", 0.0F);
        setBooleanField(term900420, term900420.getClass(), "isAlignmentYSet", false);
        setFloatField(term900420, term900420.getClass(), "alignmentY", 0.0F);
        setField(term900420, term900420.getClass(), "ui", null);
        setField(term900420, term900420.getClass(), "listenerList", null);
        setField(term900420, term900420.getClass(), "clientProperties", null);
        setField(term900420, term900420.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term900420, term900420.getClass(), "autoscrolls", false);
        setField(term900420, term900420.getClass(), "border", null);
        setIntField(term900420, term900420.getClass(), "flags", 0);
        setField(term900420, term900420.getClass(), "inputVerifier", null);
        setBooleanField(term900420, term900420.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term900420, term900420.getClass(), "paintingChild", null);
        setField(term900420, term900420.getClass(), "popupMenu", null);
        setField(term900420, term900420.getClass(), "revalidateRunnableScheduled", null);
        setField(term900420, term900420.getClass(), "focusInputMap", null);
        setField(term900420, term900420.getClass(), "ancestorInputMap", null);
        setField(term900420, term900420.getClass(), "windowInputMap", null);
        setField(term900420, term900420.getClass(), "actionMap", null);
        setField(term900420, term900420.getClass(), "aaHint", null);
        setField(term900420, term900420.getClass(), "lcdRenderingHint", null);
        setField(term900420, term900420.getClass(), "component", null);
        setField(term900420, term900420.getClass(), "layoutMgr", null);
        setField(term900420, term900420.getClass(), "dispatcher", null);
        setField(term900420, term900420.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term900420, term900420.getClass(), "focusCycleRoot", false);
        setBooleanField(term900420, term900420.getClass(), "focusTraversalPolicyProvider", false);
        setField(term900420, term900420.getClass(), "printingThreads", null);
        setBooleanField(term900420, term900420.getClass(), "printing", false);
        setField(term900420, term900420.getClass(), "containerListener", null);
        setIntField(term900420, term900420.getClass(), "listeningChildren", 0);
        setIntField(term900420, term900420.getClass(), "listeningBoundsChildren", 0);
        setIntField(term900420, term900420.getClass(), "descendantsCount", 0);
        setField(term900420, term900420.getClass(), "preserveBackgroundColor", null);
        setIntField(term900420, term900420.getClass(), "numOfHWComponents", 0);
        setIntField(term900420, term900420.getClass(), "numOfLWComponents", 0);
        setField(term900420, term900420.getClass(), "modalComp", null);
        setField(term900420, term900420.getClass(), "modalAppContext", null);
        setIntField(term900420, term900420.getClass(), "containerSerializedDataVersion", 0);
        setField(term900420, term900420.getClass(), "peer", null);
        setField(term900420, term900420.getClass(), "parent", null);
        setField(term900420, term900420.getClass(), "appContext", null);
        setIntField(term900420, term900420.getClass(), "x", 0);
        setIntField(term900420, term900420.getClass(), "y", 0);
        setIntField(term900420, term900420.getClass(), "width", 0);
        setIntField(term900420, term900420.getClass(), "height", 0);
        setField(term900420, term900420.getClass(), "foreground", null);
        setField(term900420, term900420.getClass(), "background", null);
        setField(term900420, term900420.getClass(), "font", null);
        setField(term900420, term900420.getClass(), "peerFont", null);
        setField(term900420, term900420.getClass(), "cursor", null);
        setField(term900420, term900420.getClass(), "locale", null);
        setField(term900420, term900420.getClass(), "graphicsConfig", null);
        setField(term900420, term900420.getClass(), "bufferStrategy", null);
        setBooleanField(term900420, term900420.getClass(), "ignoreRepaint", false);
        setBooleanField(term900420, term900420.getClass(), "visible", false);
        setBooleanField(term900420, term900420.getClass(), "enabled", false);
        setBooleanField(term900420, term900420.getClass(), "valid", false);
        setField(term900420, term900420.getClass(), "dropTarget", null);
        setField(term900420, term900420.getClass(), "popups", null);
        setField(term900420, term900420.getClass(), "name", null);
        setBooleanField(term900420, term900420.getClass(), "nameExplicitlySet", false);
        setBooleanField(term900420, term900420.getClass(), "focusable", false);
        setIntField(term900420, term900420.getClass(), "isFocusTraversableOverridden", 0);
        setField(term900420, term900420.getClass(), "focusTraversalKeys", null);
        setBooleanField(term900420, term900420.getClass(), "focusTraversalKeysEnabled", false);
        setField(term900420, term900420.getClass(), "acc", null);
        setField(term900420, term900420.getClass(), "minSize", null);
        setBooleanField(term900420, term900420.getClass(), "minSizeSet", false);
        setField(term900420, term900420.getClass(), "prefSize", null);
        setBooleanField(term900420, term900420.getClass(), "prefSizeSet", false);
        setField(term900420, term900420.getClass(), "maxSize", null);
        setBooleanField(term900420, term900420.getClass(), "maxSizeSet", false);
        setField(term900420, term900420.getClass(), "componentOrientation", null);
        setBooleanField(term900420, term900420.getClass(), "newEventsOnly", false);
        setField(term900420, term900420.getClass(), "componentListener", null);
        setField(term900420, term900420.getClass(), "focusListener", null);
        setField(term900420, term900420.getClass(), "hierarchyListener", null);
        setField(term900420, term900420.getClass(), "hierarchyBoundsListener", null);
        setField(term900420, term900420.getClass(), "keyListener", null);
        setField(term900420, term900420.getClass(), "mouseListener", null);
        setField(term900420, term900420.getClass(), "mouseMotionListener", null);
        setField(term900420, term900420.getClass(), "mouseWheelListener", null);
        setField(term900420, term900420.getClass(), "inputMethodListener", null);
        setLongField(term900420, term900420.getClass(), "eventMask", 0L);
        setField(term900420, term900420.getClass(), "changeSupport", null);
        setField(term900420, term900420.getClass(), "objectLock", null);
        setBooleanField(term900420, term900420.getClass(), "isPacked", false);
        setIntField(term900420, term900420.getClass(), "boundsOp", 0);
        setField(term900420, term900420.getClass(), "compoundShape", null);
        setField(term900420, term900420.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term900420, term900420.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term900420, term900420.getClass(), "backgroundEraseDisabled", false);
        setField(term900420, term900420.getClass(), "eventCache", null);
        setBooleanField(term900420, term900420.getClass(), "coalescingEnabled", false);
        setBooleanField(term900420, term900420.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term900420, term900420.getClass(), "componentSerializedDataVersion", 0);
        setField(term900420, term900420.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFleet", argTypes, term900420, args);
    }

};


