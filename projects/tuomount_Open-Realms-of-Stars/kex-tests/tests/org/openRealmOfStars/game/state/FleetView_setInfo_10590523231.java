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

public class FleetView_setInfo_10590523231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term918512;

    public FleetView_setInfo_10590523231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term918512 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term918512, term918512.getClass(), "totalPeople", null);
        setField(term918512, term918512.getClass(), "metal", null);
        setField(term918512, term918512.getClass(), "ownerLabel", null);
        setField(term918512, term918512.getClass(), "colonistSelection", null);
        setField(term918512, term918512.getClass(), "metalSelection", null);
        setField(term918512, term918512.getClass(), "planet", null);
        setField(term918512, term918512.getClass(), "fleet", null);
        setField(term918512, term918512.getClass(), "fleetList", null);
        setField(term918512, term918512.getClass(), "fleetNameText", null);
        setField(term918512, term918512.getClass(), "shipsInFleet", null);
        setField(term918512, term918512.getClass(), "fleetsInSpace", null);
        setField(term918512, term918512.getClass(), "starbaseFleet", null);
        setField(term918512, term918512.getClass(), "info", null);
        setField(term918512, term918512.getClass(), "imgBase", null);
        setField(term918512, term918512.getClass(), "starMap", null);
        setField(term918512, term918512.getClass(), "conquerBtn", null);
        setField(term918512, term918512.getClass(), "hailBtn", null);
        setBooleanField(term918512, term918512.getClass(), "interactiveView", false);
        setField(term918512, term918512.getClass(), "commanderLabel", null);
        setField(term918512, term918512.getClass(), "leaderViewBtn", null);
        setField(term918512, term918512.getClass(), "espionageMissonBtn", null);
        setField(term918512, term918512.getClass(), "exploreBtn", null);
        setField(term918512, term918512.getClass(), "upgradeBtn", null);
        setField(term918512, term918512.getClass(), "northPlanet", null);
        setField(term918512, term918512.getClass(), "southPlanet", null);
        setField(term918512, term918512.getClass(), "westPlanet", null);
        setField(term918512, term918512.getClass(), "eastPlanet", null);
        setBooleanField(term918512, term918512.getClass(), "isAlignmentXSet", false);
        setFloatField(term918512, term918512.getClass(), "alignmentX", 0.0F);
        setBooleanField(term918512, term918512.getClass(), "isAlignmentYSet", false);
        setFloatField(term918512, term918512.getClass(), "alignmentY", 0.0F);
        setField(term918512, term918512.getClass(), "ui", null);
        setField(term918512, term918512.getClass(), "listenerList", null);
        setField(term918512, term918512.getClass(), "clientProperties", null);
        setField(term918512, term918512.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term918512, term918512.getClass(), "autoscrolls", false);
        setField(term918512, term918512.getClass(), "border", null);
        setIntField(term918512, term918512.getClass(), "flags", 0);
        setField(term918512, term918512.getClass(), "inputVerifier", null);
        setBooleanField(term918512, term918512.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term918512, term918512.getClass(), "paintingChild", null);
        setField(term918512, term918512.getClass(), "popupMenu", null);
        setField(term918512, term918512.getClass(), "revalidateRunnableScheduled", null);
        setField(term918512, term918512.getClass(), "focusInputMap", null);
        setField(term918512, term918512.getClass(), "ancestorInputMap", null);
        setField(term918512, term918512.getClass(), "windowInputMap", null);
        setField(term918512, term918512.getClass(), "actionMap", null);
        setField(term918512, term918512.getClass(), "aaHint", null);
        setField(term918512, term918512.getClass(), "lcdRenderingHint", null);
        setField(term918512, term918512.getClass(), "component", null);
        setField(term918512, term918512.getClass(), "layoutMgr", null);
        setField(term918512, term918512.getClass(), "dispatcher", null);
        setField(term918512, term918512.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term918512, term918512.getClass(), "focusCycleRoot", false);
        setBooleanField(term918512, term918512.getClass(), "focusTraversalPolicyProvider", false);
        setField(term918512, term918512.getClass(), "printingThreads", null);
        setBooleanField(term918512, term918512.getClass(), "printing", false);
        setField(term918512, term918512.getClass(), "containerListener", null);
        setIntField(term918512, term918512.getClass(), "listeningChildren", 0);
        setIntField(term918512, term918512.getClass(), "listeningBoundsChildren", 0);
        setIntField(term918512, term918512.getClass(), "descendantsCount", 0);
        setField(term918512, term918512.getClass(), "preserveBackgroundColor", null);
        setIntField(term918512, term918512.getClass(), "numOfHWComponents", 0);
        setIntField(term918512, term918512.getClass(), "numOfLWComponents", 0);
        setField(term918512, term918512.getClass(), "modalComp", null);
        setField(term918512, term918512.getClass(), "modalAppContext", null);
        setIntField(term918512, term918512.getClass(), "containerSerializedDataVersion", 0);
        setField(term918512, term918512.getClass(), "peer", null);
        setField(term918512, term918512.getClass(), "parent", null);
        setField(term918512, term918512.getClass(), "appContext", null);
        setIntField(term918512, term918512.getClass(), "x", 0);
        setIntField(term918512, term918512.getClass(), "y", 0);
        setIntField(term918512, term918512.getClass(), "width", 0);
        setIntField(term918512, term918512.getClass(), "height", 0);
        setField(term918512, term918512.getClass(), "foreground", null);
        setField(term918512, term918512.getClass(), "background", null);
        setField(term918512, term918512.getClass(), "font", null);
        setField(term918512, term918512.getClass(), "peerFont", null);
        setField(term918512, term918512.getClass(), "cursor", null);
        setField(term918512, term918512.getClass(), "locale", null);
        setField(term918512, term918512.getClass(), "graphicsConfig", null);
        setField(term918512, term918512.getClass(), "bufferStrategy", null);
        setBooleanField(term918512, term918512.getClass(), "ignoreRepaint", false);
        setBooleanField(term918512, term918512.getClass(), "visible", false);
        setBooleanField(term918512, term918512.getClass(), "enabled", false);
        setBooleanField(term918512, term918512.getClass(), "valid", false);
        setField(term918512, term918512.getClass(), "dropTarget", null);
        setField(term918512, term918512.getClass(), "popups", null);
        setField(term918512, term918512.getClass(), "name", null);
        setBooleanField(term918512, term918512.getClass(), "nameExplicitlySet", false);
        setBooleanField(term918512, term918512.getClass(), "focusable", false);
        setIntField(term918512, term918512.getClass(), "isFocusTraversableOverridden", 0);
        setField(term918512, term918512.getClass(), "focusTraversalKeys", null);
        setBooleanField(term918512, term918512.getClass(), "focusTraversalKeysEnabled", false);
        setField(term918512, term918512.getClass(), "acc", null);
        setField(term918512, term918512.getClass(), "minSize", null);
        setBooleanField(term918512, term918512.getClass(), "minSizeSet", false);
        setField(term918512, term918512.getClass(), "prefSize", null);
        setBooleanField(term918512, term918512.getClass(), "prefSizeSet", false);
        setField(term918512, term918512.getClass(), "maxSize", null);
        setBooleanField(term918512, term918512.getClass(), "maxSizeSet", false);
        setField(term918512, term918512.getClass(), "componentOrientation", null);
        setBooleanField(term918512, term918512.getClass(), "newEventsOnly", false);
        setField(term918512, term918512.getClass(), "componentListener", null);
        setField(term918512, term918512.getClass(), "focusListener", null);
        setField(term918512, term918512.getClass(), "hierarchyListener", null);
        setField(term918512, term918512.getClass(), "hierarchyBoundsListener", null);
        setField(term918512, term918512.getClass(), "keyListener", null);
        setField(term918512, term918512.getClass(), "mouseListener", null);
        setField(term918512, term918512.getClass(), "mouseMotionListener", null);
        setField(term918512, term918512.getClass(), "mouseWheelListener", null);
        setField(term918512, term918512.getClass(), "inputMethodListener", null);
        setLongField(term918512, term918512.getClass(), "eventMask", 0L);
        setField(term918512, term918512.getClass(), "changeSupport", null);
        setField(term918512, term918512.getClass(), "objectLock", null);
        setBooleanField(term918512, term918512.getClass(), "isPacked", false);
        setIntField(term918512, term918512.getClass(), "boundsOp", 0);
        setField(term918512, term918512.getClass(), "compoundShape", null);
        setField(term918512, term918512.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term918512, term918512.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term918512, term918512.getClass(), "backgroundEraseDisabled", false);
        setField(term918512, term918512.getClass(), "eventCache", null);
        setBooleanField(term918512, term918512.getClass(), "coalescingEnabled", false);
        setBooleanField(term918512, term918512.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term918512, term918512.getClass(), "componentSerializedDataVersion", 0);
        setField(term918512, term918512.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setInfo", argTypes, term918512, args);
    }

};


