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

public class StarMapView_getReseProd_165881750831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847687;

    public StarMapView_getReseProd_165881750831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847687 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847687, term847687.getClass(), "map", null);
        setField(term847687, term847687.getClass(), "players", null);
        setField(term847687, term847687.getClass(), "mapPanel", null);
        setField(term847687, term847687.getClass(), "infoPanel", null);
        setField(term847687, term847687.getClass(), "starMapMouseListener", null);
        setField(term847687, term847687.getClass(), "endTurnButton", null);
        setField(term847687, term847687.getClass(), "viewResearchButton", null);
        setField(term847687, term847687.getClass(), "viewSpaceShips", null);
        setField(term847687, term847687.getClass(), "viewStats", null);
        setField(term847687, term847687.getClass(), "viewLeader", null);
        setField(term847687, term847687.getClass(), "credProd", null);
        setField(term847687, term847687.getClass(), "reseProd", null);
        setField(term847687, term847687.getClass(), "happinessMeter", null);
        setField(term847687, term847687.getClass(), "fleetMeter", null);
        setBooleanField(term847687, term847687.getClass(), "readyToMove", false);
        setField(term847687, term847687.getClass(), "msgPanel", null);
        setBooleanField(term847687, term847687.getClass(), "autoFocus", false);
        setField(term847687, term847687.getClass(), "game", null);
        setBooleanField(term847687, term847687.getClass(), "isAlignmentXSet", false);
        setFloatField(term847687, term847687.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847687, term847687.getClass(), "isAlignmentYSet", false);
        setFloatField(term847687, term847687.getClass(), "alignmentY", 0.0F);
        setField(term847687, term847687.getClass(), "ui", null);
        setField(term847687, term847687.getClass(), "listenerList", null);
        setField(term847687, term847687.getClass(), "clientProperties", null);
        setField(term847687, term847687.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847687, term847687.getClass(), "autoscrolls", false);
        setField(term847687, term847687.getClass(), "border", null);
        setIntField(term847687, term847687.getClass(), "flags", 0);
        setField(term847687, term847687.getClass(), "inputVerifier", null);
        setBooleanField(term847687, term847687.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847687, term847687.getClass(), "paintingChild", null);
        setField(term847687, term847687.getClass(), "popupMenu", null);
        setField(term847687, term847687.getClass(), "revalidateRunnableScheduled", null);
        setField(term847687, term847687.getClass(), "focusInputMap", null);
        setField(term847687, term847687.getClass(), "ancestorInputMap", null);
        setField(term847687, term847687.getClass(), "windowInputMap", null);
        setField(term847687, term847687.getClass(), "actionMap", null);
        setField(term847687, term847687.getClass(), "aaHint", null);
        setField(term847687, term847687.getClass(), "lcdRenderingHint", null);
        setField(term847687, term847687.getClass(), "component", null);
        setField(term847687, term847687.getClass(), "layoutMgr", null);
        setField(term847687, term847687.getClass(), "dispatcher", null);
        setField(term847687, term847687.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847687, term847687.getClass(), "focusCycleRoot", false);
        setBooleanField(term847687, term847687.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847687, term847687.getClass(), "printingThreads", null);
        setBooleanField(term847687, term847687.getClass(), "printing", false);
        setField(term847687, term847687.getClass(), "containerListener", null);
        setIntField(term847687, term847687.getClass(), "listeningChildren", 0);
        setIntField(term847687, term847687.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847687, term847687.getClass(), "descendantsCount", 0);
        setField(term847687, term847687.getClass(), "preserveBackgroundColor", null);
        setIntField(term847687, term847687.getClass(), "numOfHWComponents", 0);
        setIntField(term847687, term847687.getClass(), "numOfLWComponents", 0);
        setField(term847687, term847687.getClass(), "modalComp", null);
        setField(term847687, term847687.getClass(), "modalAppContext", null);
        setIntField(term847687, term847687.getClass(), "containerSerializedDataVersion", 0);
        setField(term847687, term847687.getClass(), "peer", null);
        setField(term847687, term847687.getClass(), "parent", null);
        setField(term847687, term847687.getClass(), "appContext", null);
        setIntField(term847687, term847687.getClass(), "x", 0);
        setIntField(term847687, term847687.getClass(), "y", 0);
        setIntField(term847687, term847687.getClass(), "width", 0);
        setIntField(term847687, term847687.getClass(), "height", 0);
        setField(term847687, term847687.getClass(), "foreground", null);
        setField(term847687, term847687.getClass(), "background", null);
        setField(term847687, term847687.getClass(), "font", null);
        setField(term847687, term847687.getClass(), "peerFont", null);
        setField(term847687, term847687.getClass(), "cursor", null);
        setField(term847687, term847687.getClass(), "locale", null);
        setField(term847687, term847687.getClass(), "graphicsConfig", null);
        setField(term847687, term847687.getClass(), "bufferStrategy", null);
        setBooleanField(term847687, term847687.getClass(), "ignoreRepaint", false);
        setBooleanField(term847687, term847687.getClass(), "visible", false);
        setBooleanField(term847687, term847687.getClass(), "enabled", false);
        setBooleanField(term847687, term847687.getClass(), "valid", false);
        setField(term847687, term847687.getClass(), "dropTarget", null);
        setField(term847687, term847687.getClass(), "popups", null);
        setField(term847687, term847687.getClass(), "name", null);
        setBooleanField(term847687, term847687.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847687, term847687.getClass(), "focusable", false);
        setIntField(term847687, term847687.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847687, term847687.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847687, term847687.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847687, term847687.getClass(), "acc", null);
        setField(term847687, term847687.getClass(), "minSize", null);
        setBooleanField(term847687, term847687.getClass(), "minSizeSet", false);
        setField(term847687, term847687.getClass(), "prefSize", null);
        setBooleanField(term847687, term847687.getClass(), "prefSizeSet", false);
        setField(term847687, term847687.getClass(), "maxSize", null);
        setBooleanField(term847687, term847687.getClass(), "maxSizeSet", false);
        setField(term847687, term847687.getClass(), "componentOrientation", null);
        setBooleanField(term847687, term847687.getClass(), "newEventsOnly", false);
        setField(term847687, term847687.getClass(), "componentListener", null);
        setField(term847687, term847687.getClass(), "focusListener", null);
        setField(term847687, term847687.getClass(), "hierarchyListener", null);
        setField(term847687, term847687.getClass(), "hierarchyBoundsListener", null);
        setField(term847687, term847687.getClass(), "keyListener", null);
        setField(term847687, term847687.getClass(), "mouseListener", null);
        setField(term847687, term847687.getClass(), "mouseMotionListener", null);
        setField(term847687, term847687.getClass(), "mouseWheelListener", null);
        setField(term847687, term847687.getClass(), "inputMethodListener", null);
        setLongField(term847687, term847687.getClass(), "eventMask", 0L);
        setField(term847687, term847687.getClass(), "changeSupport", null);
        setField(term847687, term847687.getClass(), "objectLock", null);
        setBooleanField(term847687, term847687.getClass(), "isPacked", false);
        setIntField(term847687, term847687.getClass(), "boundsOp", 0);
        setField(term847687, term847687.getClass(), "compoundShape", null);
        setField(term847687, term847687.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847687, term847687.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847687, term847687.getClass(), "backgroundEraseDisabled", false);
        setField(term847687, term847687.getClass(), "eventCache", null);
        setBooleanField(term847687, term847687.getClass(), "coalescingEnabled", false);
        setBooleanField(term847687, term847687.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847687, term847687.getClass(), "componentSerializedDataVersion", 0);
        setField(term847687, term847687.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReseProd", argTypes, term847687, args);
    }

};


