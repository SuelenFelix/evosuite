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

public class StarMapView_setShowFleet_2507972523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847341;

    public StarMapView_setShowFleet_2507972523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847341 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847341, term847341.getClass(), "map", null);
        setField(term847341, term847341.getClass(), "players", null);
        setField(term847341, term847341.getClass(), "mapPanel", null);
        setField(term847341, term847341.getClass(), "infoPanel", null);
        setField(term847341, term847341.getClass(), "starMapMouseListener", null);
        setField(term847341, term847341.getClass(), "endTurnButton", null);
        setField(term847341, term847341.getClass(), "viewResearchButton", null);
        setField(term847341, term847341.getClass(), "viewSpaceShips", null);
        setField(term847341, term847341.getClass(), "viewStats", null);
        setField(term847341, term847341.getClass(), "viewLeader", null);
        setField(term847341, term847341.getClass(), "credProd", null);
        setField(term847341, term847341.getClass(), "reseProd", null);
        setField(term847341, term847341.getClass(), "happinessMeter", null);
        setField(term847341, term847341.getClass(), "fleetMeter", null);
        setBooleanField(term847341, term847341.getClass(), "readyToMove", false);
        setField(term847341, term847341.getClass(), "msgPanel", null);
        setBooleanField(term847341, term847341.getClass(), "autoFocus", false);
        setField(term847341, term847341.getClass(), "game", null);
        setBooleanField(term847341, term847341.getClass(), "isAlignmentXSet", false);
        setFloatField(term847341, term847341.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847341, term847341.getClass(), "isAlignmentYSet", false);
        setFloatField(term847341, term847341.getClass(), "alignmentY", 0.0F);
        setField(term847341, term847341.getClass(), "ui", null);
        setField(term847341, term847341.getClass(), "listenerList", null);
        setField(term847341, term847341.getClass(), "clientProperties", null);
        setField(term847341, term847341.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847341, term847341.getClass(), "autoscrolls", false);
        setField(term847341, term847341.getClass(), "border", null);
        setIntField(term847341, term847341.getClass(), "flags", 0);
        setField(term847341, term847341.getClass(), "inputVerifier", null);
        setBooleanField(term847341, term847341.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847341, term847341.getClass(), "paintingChild", null);
        setField(term847341, term847341.getClass(), "popupMenu", null);
        setField(term847341, term847341.getClass(), "revalidateRunnableScheduled", null);
        setField(term847341, term847341.getClass(), "focusInputMap", null);
        setField(term847341, term847341.getClass(), "ancestorInputMap", null);
        setField(term847341, term847341.getClass(), "windowInputMap", null);
        setField(term847341, term847341.getClass(), "actionMap", null);
        setField(term847341, term847341.getClass(), "aaHint", null);
        setField(term847341, term847341.getClass(), "lcdRenderingHint", null);
        setField(term847341, term847341.getClass(), "component", null);
        setField(term847341, term847341.getClass(), "layoutMgr", null);
        setField(term847341, term847341.getClass(), "dispatcher", null);
        setField(term847341, term847341.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847341, term847341.getClass(), "focusCycleRoot", false);
        setBooleanField(term847341, term847341.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847341, term847341.getClass(), "printingThreads", null);
        setBooleanField(term847341, term847341.getClass(), "printing", false);
        setField(term847341, term847341.getClass(), "containerListener", null);
        setIntField(term847341, term847341.getClass(), "listeningChildren", 0);
        setIntField(term847341, term847341.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847341, term847341.getClass(), "descendantsCount", 0);
        setField(term847341, term847341.getClass(), "preserveBackgroundColor", null);
        setIntField(term847341, term847341.getClass(), "numOfHWComponents", 0);
        setIntField(term847341, term847341.getClass(), "numOfLWComponents", 0);
        setField(term847341, term847341.getClass(), "modalComp", null);
        setField(term847341, term847341.getClass(), "modalAppContext", null);
        setIntField(term847341, term847341.getClass(), "containerSerializedDataVersion", 0);
        setField(term847341, term847341.getClass(), "peer", null);
        setField(term847341, term847341.getClass(), "parent", null);
        setField(term847341, term847341.getClass(), "appContext", null);
        setIntField(term847341, term847341.getClass(), "x", 0);
        setIntField(term847341, term847341.getClass(), "y", 0);
        setIntField(term847341, term847341.getClass(), "width", 0);
        setIntField(term847341, term847341.getClass(), "height", 0);
        setField(term847341, term847341.getClass(), "foreground", null);
        setField(term847341, term847341.getClass(), "background", null);
        setField(term847341, term847341.getClass(), "font", null);
        setField(term847341, term847341.getClass(), "peerFont", null);
        setField(term847341, term847341.getClass(), "cursor", null);
        setField(term847341, term847341.getClass(), "locale", null);
        setField(term847341, term847341.getClass(), "graphicsConfig", null);
        setField(term847341, term847341.getClass(), "bufferStrategy", null);
        setBooleanField(term847341, term847341.getClass(), "ignoreRepaint", false);
        setBooleanField(term847341, term847341.getClass(), "visible", false);
        setBooleanField(term847341, term847341.getClass(), "enabled", false);
        setBooleanField(term847341, term847341.getClass(), "valid", false);
        setField(term847341, term847341.getClass(), "dropTarget", null);
        setField(term847341, term847341.getClass(), "popups", null);
        setField(term847341, term847341.getClass(), "name", null);
        setBooleanField(term847341, term847341.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847341, term847341.getClass(), "focusable", false);
        setIntField(term847341, term847341.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847341, term847341.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847341, term847341.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847341, term847341.getClass(), "acc", null);
        setField(term847341, term847341.getClass(), "minSize", null);
        setBooleanField(term847341, term847341.getClass(), "minSizeSet", false);
        setField(term847341, term847341.getClass(), "prefSize", null);
        setBooleanField(term847341, term847341.getClass(), "prefSizeSet", false);
        setField(term847341, term847341.getClass(), "maxSize", null);
        setBooleanField(term847341, term847341.getClass(), "maxSizeSet", false);
        setField(term847341, term847341.getClass(), "componentOrientation", null);
        setBooleanField(term847341, term847341.getClass(), "newEventsOnly", false);
        setField(term847341, term847341.getClass(), "componentListener", null);
        setField(term847341, term847341.getClass(), "focusListener", null);
        setField(term847341, term847341.getClass(), "hierarchyListener", null);
        setField(term847341, term847341.getClass(), "hierarchyBoundsListener", null);
        setField(term847341, term847341.getClass(), "keyListener", null);
        setField(term847341, term847341.getClass(), "mouseListener", null);
        setField(term847341, term847341.getClass(), "mouseMotionListener", null);
        setField(term847341, term847341.getClass(), "mouseWheelListener", null);
        setField(term847341, term847341.getClass(), "inputMethodListener", null);
        setLongField(term847341, term847341.getClass(), "eventMask", 0L);
        setField(term847341, term847341.getClass(), "changeSupport", null);
        setField(term847341, term847341.getClass(), "objectLock", null);
        setBooleanField(term847341, term847341.getClass(), "isPacked", false);
        setIntField(term847341, term847341.getClass(), "boundsOp", 0);
        setField(term847341, term847341.getClass(), "compoundShape", null);
        setField(term847341, term847341.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847341, term847341.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847341, term847341.getClass(), "backgroundEraseDisabled", false);
        setField(term847341, term847341.getClass(), "eventCache", null);
        setBooleanField(term847341, term847341.getClass(), "coalescingEnabled", false);
        setBooleanField(term847341, term847341.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847341, term847341.getClass(), "componentSerializedDataVersion", 0);
        setField(term847341, term847341.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setShowFleet", argTypes, term847341, args);
    }

};


