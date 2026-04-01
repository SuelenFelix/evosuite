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

public class StarMapView_getReadyToMove_97180901932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847730;

    public StarMapView_getReadyToMove_97180901932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847730 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847730, term847730.getClass(), "map", null);
        setField(term847730, term847730.getClass(), "players", null);
        setField(term847730, term847730.getClass(), "mapPanel", null);
        setField(term847730, term847730.getClass(), "infoPanel", null);
        setField(term847730, term847730.getClass(), "starMapMouseListener", null);
        setField(term847730, term847730.getClass(), "endTurnButton", null);
        setField(term847730, term847730.getClass(), "viewResearchButton", null);
        setField(term847730, term847730.getClass(), "viewSpaceShips", null);
        setField(term847730, term847730.getClass(), "viewStats", null);
        setField(term847730, term847730.getClass(), "viewLeader", null);
        setField(term847730, term847730.getClass(), "credProd", null);
        setField(term847730, term847730.getClass(), "reseProd", null);
        setField(term847730, term847730.getClass(), "happinessMeter", null);
        setField(term847730, term847730.getClass(), "fleetMeter", null);
        setBooleanField(term847730, term847730.getClass(), "readyToMove", false);
        setField(term847730, term847730.getClass(), "msgPanel", null);
        setBooleanField(term847730, term847730.getClass(), "autoFocus", false);
        setField(term847730, term847730.getClass(), "game", null);
        setBooleanField(term847730, term847730.getClass(), "isAlignmentXSet", false);
        setFloatField(term847730, term847730.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847730, term847730.getClass(), "isAlignmentYSet", false);
        setFloatField(term847730, term847730.getClass(), "alignmentY", 0.0F);
        setField(term847730, term847730.getClass(), "ui", null);
        setField(term847730, term847730.getClass(), "listenerList", null);
        setField(term847730, term847730.getClass(), "clientProperties", null);
        setField(term847730, term847730.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847730, term847730.getClass(), "autoscrolls", false);
        setField(term847730, term847730.getClass(), "border", null);
        setIntField(term847730, term847730.getClass(), "flags", 0);
        setField(term847730, term847730.getClass(), "inputVerifier", null);
        setBooleanField(term847730, term847730.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847730, term847730.getClass(), "paintingChild", null);
        setField(term847730, term847730.getClass(), "popupMenu", null);
        setField(term847730, term847730.getClass(), "revalidateRunnableScheduled", null);
        setField(term847730, term847730.getClass(), "focusInputMap", null);
        setField(term847730, term847730.getClass(), "ancestorInputMap", null);
        setField(term847730, term847730.getClass(), "windowInputMap", null);
        setField(term847730, term847730.getClass(), "actionMap", null);
        setField(term847730, term847730.getClass(), "aaHint", null);
        setField(term847730, term847730.getClass(), "lcdRenderingHint", null);
        setField(term847730, term847730.getClass(), "component", null);
        setField(term847730, term847730.getClass(), "layoutMgr", null);
        setField(term847730, term847730.getClass(), "dispatcher", null);
        setField(term847730, term847730.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847730, term847730.getClass(), "focusCycleRoot", false);
        setBooleanField(term847730, term847730.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847730, term847730.getClass(), "printingThreads", null);
        setBooleanField(term847730, term847730.getClass(), "printing", false);
        setField(term847730, term847730.getClass(), "containerListener", null);
        setIntField(term847730, term847730.getClass(), "listeningChildren", 0);
        setIntField(term847730, term847730.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847730, term847730.getClass(), "descendantsCount", 0);
        setField(term847730, term847730.getClass(), "preserveBackgroundColor", null);
        setIntField(term847730, term847730.getClass(), "numOfHWComponents", 0);
        setIntField(term847730, term847730.getClass(), "numOfLWComponents", 0);
        setField(term847730, term847730.getClass(), "modalComp", null);
        setField(term847730, term847730.getClass(), "modalAppContext", null);
        setIntField(term847730, term847730.getClass(), "containerSerializedDataVersion", 0);
        setField(term847730, term847730.getClass(), "peer", null);
        setField(term847730, term847730.getClass(), "parent", null);
        setField(term847730, term847730.getClass(), "appContext", null);
        setIntField(term847730, term847730.getClass(), "x", 0);
        setIntField(term847730, term847730.getClass(), "y", 0);
        setIntField(term847730, term847730.getClass(), "width", 0);
        setIntField(term847730, term847730.getClass(), "height", 0);
        setField(term847730, term847730.getClass(), "foreground", null);
        setField(term847730, term847730.getClass(), "background", null);
        setField(term847730, term847730.getClass(), "font", null);
        setField(term847730, term847730.getClass(), "peerFont", null);
        setField(term847730, term847730.getClass(), "cursor", null);
        setField(term847730, term847730.getClass(), "locale", null);
        setField(term847730, term847730.getClass(), "graphicsConfig", null);
        setField(term847730, term847730.getClass(), "bufferStrategy", null);
        setBooleanField(term847730, term847730.getClass(), "ignoreRepaint", false);
        setBooleanField(term847730, term847730.getClass(), "visible", false);
        setBooleanField(term847730, term847730.getClass(), "enabled", false);
        setBooleanField(term847730, term847730.getClass(), "valid", false);
        setField(term847730, term847730.getClass(), "dropTarget", null);
        setField(term847730, term847730.getClass(), "popups", null);
        setField(term847730, term847730.getClass(), "name", null);
        setBooleanField(term847730, term847730.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847730, term847730.getClass(), "focusable", false);
        setIntField(term847730, term847730.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847730, term847730.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847730, term847730.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847730, term847730.getClass(), "acc", null);
        setField(term847730, term847730.getClass(), "minSize", null);
        setBooleanField(term847730, term847730.getClass(), "minSizeSet", false);
        setField(term847730, term847730.getClass(), "prefSize", null);
        setBooleanField(term847730, term847730.getClass(), "prefSizeSet", false);
        setField(term847730, term847730.getClass(), "maxSize", null);
        setBooleanField(term847730, term847730.getClass(), "maxSizeSet", false);
        setField(term847730, term847730.getClass(), "componentOrientation", null);
        setBooleanField(term847730, term847730.getClass(), "newEventsOnly", false);
        setField(term847730, term847730.getClass(), "componentListener", null);
        setField(term847730, term847730.getClass(), "focusListener", null);
        setField(term847730, term847730.getClass(), "hierarchyListener", null);
        setField(term847730, term847730.getClass(), "hierarchyBoundsListener", null);
        setField(term847730, term847730.getClass(), "keyListener", null);
        setField(term847730, term847730.getClass(), "mouseListener", null);
        setField(term847730, term847730.getClass(), "mouseMotionListener", null);
        setField(term847730, term847730.getClass(), "mouseWheelListener", null);
        setField(term847730, term847730.getClass(), "inputMethodListener", null);
        setLongField(term847730, term847730.getClass(), "eventMask", 0L);
        setField(term847730, term847730.getClass(), "changeSupport", null);
        setField(term847730, term847730.getClass(), "objectLock", null);
        setBooleanField(term847730, term847730.getClass(), "isPacked", false);
        setIntField(term847730, term847730.getClass(), "boundsOp", 0);
        setField(term847730, term847730.getClass(), "compoundShape", null);
        setField(term847730, term847730.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847730, term847730.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847730, term847730.getClass(), "backgroundEraseDisabled", false);
        setField(term847730, term847730.getClass(), "eventCache", null);
        setBooleanField(term847730, term847730.getClass(), "coalescingEnabled", false);
        setBooleanField(term847730, term847730.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847730, term847730.getClass(), "componentSerializedDataVersion", 0);
        setField(term847730, term847730.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReadyToMove", argTypes, term847730, args);
    }

};


