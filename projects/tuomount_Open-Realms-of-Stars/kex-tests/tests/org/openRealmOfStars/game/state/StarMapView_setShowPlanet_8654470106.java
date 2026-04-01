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
import java.lang.Boolean;

public class StarMapView_setShowPlanet_8654470106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term820993;
     Object term821036;

    public StarMapView_setShowPlanet_8654470106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term820993 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term820993, term820993.getClass(), "map", null);
        setField(term820993, term820993.getClass(), "players", null);
        setField(term820993, term820993.getClass(), "mapPanel", null);
        setField(term820993, term820993.getClass(), "infoPanel", null);
        setField(term820993, term820993.getClass(), "starMapMouseListener", null);
        setField(term820993, term820993.getClass(), "endTurnButton", null);
        setField(term820993, term820993.getClass(), "viewResearchButton", null);
        setField(term820993, term820993.getClass(), "viewSpaceShips", null);
        setField(term820993, term820993.getClass(), "viewStats", null);
        setField(term820993, term820993.getClass(), "viewLeader", null);
        setField(term820993, term820993.getClass(), "credProd", null);
        setField(term820993, term820993.getClass(), "reseProd", null);
        setField(term820993, term820993.getClass(), "happinessMeter", null);
        setField(term820993, term820993.getClass(), "fleetMeter", null);
        setBooleanField(term820993, term820993.getClass(), "readyToMove", false);
        setField(term820993, term820993.getClass(), "msgPanel", null);
        setBooleanField(term820993, term820993.getClass(), "autoFocus", false);
        setField(term820993, term820993.getClass(), "game", null);
        setBooleanField(term820993, term820993.getClass(), "isAlignmentXSet", false);
        setFloatField(term820993, term820993.getClass(), "alignmentX", 0.0F);
        setBooleanField(term820993, term820993.getClass(), "isAlignmentYSet", false);
        setFloatField(term820993, term820993.getClass(), "alignmentY", 0.0F);
        setField(term820993, term820993.getClass(), "ui", null);
        setField(term820993, term820993.getClass(), "listenerList", null);
        setField(term820993, term820993.getClass(), "clientProperties", null);
        setField(term820993, term820993.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term820993, term820993.getClass(), "autoscrolls", false);
        setField(term820993, term820993.getClass(), "border", null);
        setIntField(term820993, term820993.getClass(), "flags", 0);
        setField(term820993, term820993.getClass(), "inputVerifier", null);
        setBooleanField(term820993, term820993.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term820993, term820993.getClass(), "paintingChild", null);
        setField(term820993, term820993.getClass(), "popupMenu", null);
        setField(term820993, term820993.getClass(), "revalidateRunnableScheduled", null);
        setField(term820993, term820993.getClass(), "focusInputMap", null);
        setField(term820993, term820993.getClass(), "ancestorInputMap", null);
        setField(term820993, term820993.getClass(), "windowInputMap", null);
        setField(term820993, term820993.getClass(), "actionMap", null);
        setField(term820993, term820993.getClass(), "aaHint", null);
        setField(term820993, term820993.getClass(), "lcdRenderingHint", null);
        setField(term820993, term820993.getClass(), "component", null);
        setField(term820993, term820993.getClass(), "layoutMgr", null);
        setField(term820993, term820993.getClass(), "dispatcher", null);
        setField(term820993, term820993.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term820993, term820993.getClass(), "focusCycleRoot", false);
        setBooleanField(term820993, term820993.getClass(), "focusTraversalPolicyProvider", false);
        setField(term820993, term820993.getClass(), "printingThreads", null);
        setBooleanField(term820993, term820993.getClass(), "printing", false);
        setField(term820993, term820993.getClass(), "containerListener", null);
        setIntField(term820993, term820993.getClass(), "listeningChildren", 0);
        setIntField(term820993, term820993.getClass(), "listeningBoundsChildren", 0);
        setIntField(term820993, term820993.getClass(), "descendantsCount", 0);
        setField(term820993, term820993.getClass(), "preserveBackgroundColor", null);
        setIntField(term820993, term820993.getClass(), "numOfHWComponents", 0);
        setIntField(term820993, term820993.getClass(), "numOfLWComponents", 0);
        setField(term820993, term820993.getClass(), "modalComp", null);
        setField(term820993, term820993.getClass(), "modalAppContext", null);
        setIntField(term820993, term820993.getClass(), "containerSerializedDataVersion", 0);
        setField(term820993, term820993.getClass(), "peer", null);
        setField(term820993, term820993.getClass(), "parent", null);
        setField(term820993, term820993.getClass(), "appContext", null);
        setIntField(term820993, term820993.getClass(), "x", 0);
        setIntField(term820993, term820993.getClass(), "y", 0);
        setIntField(term820993, term820993.getClass(), "width", 0);
        setIntField(term820993, term820993.getClass(), "height", 0);
        setField(term820993, term820993.getClass(), "foreground", null);
        setField(term820993, term820993.getClass(), "background", null);
        setField(term820993, term820993.getClass(), "font", null);
        setField(term820993, term820993.getClass(), "peerFont", null);
        setField(term820993, term820993.getClass(), "cursor", null);
        setField(term820993, term820993.getClass(), "locale", null);
        setField(term820993, term820993.getClass(), "graphicsConfig", null);
        setField(term820993, term820993.getClass(), "bufferStrategy", null);
        setBooleanField(term820993, term820993.getClass(), "ignoreRepaint", false);
        setBooleanField(term820993, term820993.getClass(), "visible", false);
        setBooleanField(term820993, term820993.getClass(), "enabled", false);
        setBooleanField(term820993, term820993.getClass(), "valid", false);
        setField(term820993, term820993.getClass(), "dropTarget", null);
        setField(term820993, term820993.getClass(), "popups", null);
        setField(term820993, term820993.getClass(), "name", null);
        setBooleanField(term820993, term820993.getClass(), "nameExplicitlySet", false);
        setBooleanField(term820993, term820993.getClass(), "focusable", false);
        setIntField(term820993, term820993.getClass(), "isFocusTraversableOverridden", 0);
        setField(term820993, term820993.getClass(), "focusTraversalKeys", null);
        setBooleanField(term820993, term820993.getClass(), "focusTraversalKeysEnabled", false);
        setField(term820993, term820993.getClass(), "acc", null);
        setField(term820993, term820993.getClass(), "minSize", null);
        setBooleanField(term820993, term820993.getClass(), "minSizeSet", false);
        setField(term820993, term820993.getClass(), "prefSize", null);
        setBooleanField(term820993, term820993.getClass(), "prefSizeSet", false);
        setField(term820993, term820993.getClass(), "maxSize", null);
        setBooleanField(term820993, term820993.getClass(), "maxSizeSet", false);
        setField(term820993, term820993.getClass(), "componentOrientation", null);
        setBooleanField(term820993, term820993.getClass(), "newEventsOnly", false);
        setField(term820993, term820993.getClass(), "componentListener", null);
        setField(term820993, term820993.getClass(), "focusListener", null);
        setField(term820993, term820993.getClass(), "hierarchyListener", null);
        setField(term820993, term820993.getClass(), "hierarchyBoundsListener", null);
        setField(term820993, term820993.getClass(), "keyListener", null);
        setField(term820993, term820993.getClass(), "mouseListener", null);
        setField(term820993, term820993.getClass(), "mouseMotionListener", null);
        setField(term820993, term820993.getClass(), "mouseWheelListener", null);
        setField(term820993, term820993.getClass(), "inputMethodListener", null);
        setLongField(term820993, term820993.getClass(), "eventMask", 0L);
        setField(term820993, term820993.getClass(), "changeSupport", null);
        setField(term820993, term820993.getClass(), "objectLock", null);
        setBooleanField(term820993, term820993.getClass(), "isPacked", false);
        setIntField(term820993, term820993.getClass(), "boundsOp", 0);
        setField(term820993, term820993.getClass(), "compoundShape", null);
        setField(term820993, term820993.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term820993, term820993.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term820993, term820993.getClass(), "backgroundEraseDisabled", false);
        setField(term820993, term820993.getClass(), "eventCache", null);
        setBooleanField(term820993, term820993.getClass(), "coalescingEnabled", false);
        setBooleanField(term820993, term820993.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term820993, term820993.getClass(), "componentSerializedDataVersion", 0);
        setField(term820993, term820993.getClass(), "accessibleContext", null);
        term821036 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term821036;
        callMethod(klass, "setShowPlanet", argTypes, term820993, args);
    }

};


