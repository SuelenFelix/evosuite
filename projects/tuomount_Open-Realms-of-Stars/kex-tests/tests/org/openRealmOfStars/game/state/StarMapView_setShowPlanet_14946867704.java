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

public class StarMapView_setShowPlanet_14946867704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term810655;

    public StarMapView_setShowPlanet_14946867704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term810655 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term810655, term810655.getClass(), "map", null);
        setField(term810655, term810655.getClass(), "players", null);
        setField(term810655, term810655.getClass(), "mapPanel", null);
        setField(term810655, term810655.getClass(), "infoPanel", null);
        setField(term810655, term810655.getClass(), "starMapMouseListener", null);
        setField(term810655, term810655.getClass(), "endTurnButton", null);
        setField(term810655, term810655.getClass(), "viewResearchButton", null);
        setField(term810655, term810655.getClass(), "viewSpaceShips", null);
        setField(term810655, term810655.getClass(), "viewStats", null);
        setField(term810655, term810655.getClass(), "viewLeader", null);
        setField(term810655, term810655.getClass(), "credProd", null);
        setField(term810655, term810655.getClass(), "reseProd", null);
        setField(term810655, term810655.getClass(), "happinessMeter", null);
        setField(term810655, term810655.getClass(), "fleetMeter", null);
        setBooleanField(term810655, term810655.getClass(), "readyToMove", false);
        setField(term810655, term810655.getClass(), "msgPanel", null);
        setBooleanField(term810655, term810655.getClass(), "autoFocus", false);
        setField(term810655, term810655.getClass(), "game", null);
        setBooleanField(term810655, term810655.getClass(), "isAlignmentXSet", false);
        setFloatField(term810655, term810655.getClass(), "alignmentX", 0.0F);
        setBooleanField(term810655, term810655.getClass(), "isAlignmentYSet", false);
        setFloatField(term810655, term810655.getClass(), "alignmentY", 0.0F);
        setField(term810655, term810655.getClass(), "ui", null);
        setField(term810655, term810655.getClass(), "listenerList", null);
        setField(term810655, term810655.getClass(), "clientProperties", null);
        setField(term810655, term810655.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term810655, term810655.getClass(), "autoscrolls", false);
        setField(term810655, term810655.getClass(), "border", null);
        setIntField(term810655, term810655.getClass(), "flags", 0);
        setField(term810655, term810655.getClass(), "inputVerifier", null);
        setBooleanField(term810655, term810655.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term810655, term810655.getClass(), "paintingChild", null);
        setField(term810655, term810655.getClass(), "popupMenu", null);
        setField(term810655, term810655.getClass(), "revalidateRunnableScheduled", null);
        setField(term810655, term810655.getClass(), "focusInputMap", null);
        setField(term810655, term810655.getClass(), "ancestorInputMap", null);
        setField(term810655, term810655.getClass(), "windowInputMap", null);
        setField(term810655, term810655.getClass(), "actionMap", null);
        setField(term810655, term810655.getClass(), "aaHint", null);
        setField(term810655, term810655.getClass(), "lcdRenderingHint", null);
        setField(term810655, term810655.getClass(), "component", null);
        setField(term810655, term810655.getClass(), "layoutMgr", null);
        setField(term810655, term810655.getClass(), "dispatcher", null);
        setField(term810655, term810655.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term810655, term810655.getClass(), "focusCycleRoot", false);
        setBooleanField(term810655, term810655.getClass(), "focusTraversalPolicyProvider", false);
        setField(term810655, term810655.getClass(), "printingThreads", null);
        setBooleanField(term810655, term810655.getClass(), "printing", false);
        setField(term810655, term810655.getClass(), "containerListener", null);
        setIntField(term810655, term810655.getClass(), "listeningChildren", 0);
        setIntField(term810655, term810655.getClass(), "listeningBoundsChildren", 0);
        setIntField(term810655, term810655.getClass(), "descendantsCount", 0);
        setField(term810655, term810655.getClass(), "preserveBackgroundColor", null);
        setIntField(term810655, term810655.getClass(), "numOfHWComponents", 0);
        setIntField(term810655, term810655.getClass(), "numOfLWComponents", 0);
        setField(term810655, term810655.getClass(), "modalComp", null);
        setField(term810655, term810655.getClass(), "modalAppContext", null);
        setIntField(term810655, term810655.getClass(), "containerSerializedDataVersion", 0);
        setField(term810655, term810655.getClass(), "peer", null);
        setField(term810655, term810655.getClass(), "parent", null);
        setField(term810655, term810655.getClass(), "appContext", null);
        setIntField(term810655, term810655.getClass(), "x", 0);
        setIntField(term810655, term810655.getClass(), "y", 0);
        setIntField(term810655, term810655.getClass(), "width", 0);
        setIntField(term810655, term810655.getClass(), "height", 0);
        setField(term810655, term810655.getClass(), "foreground", null);
        setField(term810655, term810655.getClass(), "background", null);
        setField(term810655, term810655.getClass(), "font", null);
        setField(term810655, term810655.getClass(), "peerFont", null);
        setField(term810655, term810655.getClass(), "cursor", null);
        setField(term810655, term810655.getClass(), "locale", null);
        setField(term810655, term810655.getClass(), "graphicsConfig", null);
        setField(term810655, term810655.getClass(), "bufferStrategy", null);
        setBooleanField(term810655, term810655.getClass(), "ignoreRepaint", false);
        setBooleanField(term810655, term810655.getClass(), "visible", false);
        setBooleanField(term810655, term810655.getClass(), "enabled", false);
        setBooleanField(term810655, term810655.getClass(), "valid", false);
        setField(term810655, term810655.getClass(), "dropTarget", null);
        setField(term810655, term810655.getClass(), "popups", null);
        setField(term810655, term810655.getClass(), "name", null);
        setBooleanField(term810655, term810655.getClass(), "nameExplicitlySet", false);
        setBooleanField(term810655, term810655.getClass(), "focusable", false);
        setIntField(term810655, term810655.getClass(), "isFocusTraversableOverridden", 0);
        setField(term810655, term810655.getClass(), "focusTraversalKeys", null);
        setBooleanField(term810655, term810655.getClass(), "focusTraversalKeysEnabled", false);
        setField(term810655, term810655.getClass(), "acc", null);
        setField(term810655, term810655.getClass(), "minSize", null);
        setBooleanField(term810655, term810655.getClass(), "minSizeSet", false);
        setField(term810655, term810655.getClass(), "prefSize", null);
        setBooleanField(term810655, term810655.getClass(), "prefSizeSet", false);
        setField(term810655, term810655.getClass(), "maxSize", null);
        setBooleanField(term810655, term810655.getClass(), "maxSizeSet", false);
        setField(term810655, term810655.getClass(), "componentOrientation", null);
        setBooleanField(term810655, term810655.getClass(), "newEventsOnly", false);
        setField(term810655, term810655.getClass(), "componentListener", null);
        setField(term810655, term810655.getClass(), "focusListener", null);
        setField(term810655, term810655.getClass(), "hierarchyListener", null);
        setField(term810655, term810655.getClass(), "hierarchyBoundsListener", null);
        setField(term810655, term810655.getClass(), "keyListener", null);
        setField(term810655, term810655.getClass(), "mouseListener", null);
        setField(term810655, term810655.getClass(), "mouseMotionListener", null);
        setField(term810655, term810655.getClass(), "mouseWheelListener", null);
        setField(term810655, term810655.getClass(), "inputMethodListener", null);
        setLongField(term810655, term810655.getClass(), "eventMask", 0L);
        setField(term810655, term810655.getClass(), "changeSupport", null);
        setField(term810655, term810655.getClass(), "objectLock", null);
        setBooleanField(term810655, term810655.getClass(), "isPacked", false);
        setIntField(term810655, term810655.getClass(), "boundsOp", 0);
        setField(term810655, term810655.getClass(), "compoundShape", null);
        setField(term810655, term810655.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term810655, term810655.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term810655, term810655.getClass(), "backgroundEraseDisabled", false);
        setField(term810655, term810655.getClass(), "eventCache", null);
        setBooleanField(term810655, term810655.getClass(), "coalescingEnabled", false);
        setBooleanField(term810655, term810655.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term810655, term810655.getClass(), "componentSerializedDataVersion", 0);
        setField(term810655, term810655.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setShowPlanet", argTypes, term810655, args);
    }

};


