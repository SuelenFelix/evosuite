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

public class StarMapView_getStarMapMouseListener_169547526022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847298;

    public StarMapView_getStarMapMouseListener_169547526022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847298 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847298, term847298.getClass(), "map", null);
        setField(term847298, term847298.getClass(), "players", null);
        setField(term847298, term847298.getClass(), "mapPanel", null);
        setField(term847298, term847298.getClass(), "infoPanel", null);
        setField(term847298, term847298.getClass(), "starMapMouseListener", null);
        setField(term847298, term847298.getClass(), "endTurnButton", null);
        setField(term847298, term847298.getClass(), "viewResearchButton", null);
        setField(term847298, term847298.getClass(), "viewSpaceShips", null);
        setField(term847298, term847298.getClass(), "viewStats", null);
        setField(term847298, term847298.getClass(), "viewLeader", null);
        setField(term847298, term847298.getClass(), "credProd", null);
        setField(term847298, term847298.getClass(), "reseProd", null);
        setField(term847298, term847298.getClass(), "happinessMeter", null);
        setField(term847298, term847298.getClass(), "fleetMeter", null);
        setBooleanField(term847298, term847298.getClass(), "readyToMove", false);
        setField(term847298, term847298.getClass(), "msgPanel", null);
        setBooleanField(term847298, term847298.getClass(), "autoFocus", false);
        setField(term847298, term847298.getClass(), "game", null);
        setBooleanField(term847298, term847298.getClass(), "isAlignmentXSet", false);
        setFloatField(term847298, term847298.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847298, term847298.getClass(), "isAlignmentYSet", false);
        setFloatField(term847298, term847298.getClass(), "alignmentY", 0.0F);
        setField(term847298, term847298.getClass(), "ui", null);
        setField(term847298, term847298.getClass(), "listenerList", null);
        setField(term847298, term847298.getClass(), "clientProperties", null);
        setField(term847298, term847298.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847298, term847298.getClass(), "autoscrolls", false);
        setField(term847298, term847298.getClass(), "border", null);
        setIntField(term847298, term847298.getClass(), "flags", 0);
        setField(term847298, term847298.getClass(), "inputVerifier", null);
        setBooleanField(term847298, term847298.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847298, term847298.getClass(), "paintingChild", null);
        setField(term847298, term847298.getClass(), "popupMenu", null);
        setField(term847298, term847298.getClass(), "revalidateRunnableScheduled", null);
        setField(term847298, term847298.getClass(), "focusInputMap", null);
        setField(term847298, term847298.getClass(), "ancestorInputMap", null);
        setField(term847298, term847298.getClass(), "windowInputMap", null);
        setField(term847298, term847298.getClass(), "actionMap", null);
        setField(term847298, term847298.getClass(), "aaHint", null);
        setField(term847298, term847298.getClass(), "lcdRenderingHint", null);
        setField(term847298, term847298.getClass(), "component", null);
        setField(term847298, term847298.getClass(), "layoutMgr", null);
        setField(term847298, term847298.getClass(), "dispatcher", null);
        setField(term847298, term847298.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847298, term847298.getClass(), "focusCycleRoot", false);
        setBooleanField(term847298, term847298.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847298, term847298.getClass(), "printingThreads", null);
        setBooleanField(term847298, term847298.getClass(), "printing", false);
        setField(term847298, term847298.getClass(), "containerListener", null);
        setIntField(term847298, term847298.getClass(), "listeningChildren", 0);
        setIntField(term847298, term847298.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847298, term847298.getClass(), "descendantsCount", 0);
        setField(term847298, term847298.getClass(), "preserveBackgroundColor", null);
        setIntField(term847298, term847298.getClass(), "numOfHWComponents", 0);
        setIntField(term847298, term847298.getClass(), "numOfLWComponents", 0);
        setField(term847298, term847298.getClass(), "modalComp", null);
        setField(term847298, term847298.getClass(), "modalAppContext", null);
        setIntField(term847298, term847298.getClass(), "containerSerializedDataVersion", 0);
        setField(term847298, term847298.getClass(), "peer", null);
        setField(term847298, term847298.getClass(), "parent", null);
        setField(term847298, term847298.getClass(), "appContext", null);
        setIntField(term847298, term847298.getClass(), "x", 0);
        setIntField(term847298, term847298.getClass(), "y", 0);
        setIntField(term847298, term847298.getClass(), "width", 0);
        setIntField(term847298, term847298.getClass(), "height", 0);
        setField(term847298, term847298.getClass(), "foreground", null);
        setField(term847298, term847298.getClass(), "background", null);
        setField(term847298, term847298.getClass(), "font", null);
        setField(term847298, term847298.getClass(), "peerFont", null);
        setField(term847298, term847298.getClass(), "cursor", null);
        setField(term847298, term847298.getClass(), "locale", null);
        setField(term847298, term847298.getClass(), "graphicsConfig", null);
        setField(term847298, term847298.getClass(), "bufferStrategy", null);
        setBooleanField(term847298, term847298.getClass(), "ignoreRepaint", false);
        setBooleanField(term847298, term847298.getClass(), "visible", false);
        setBooleanField(term847298, term847298.getClass(), "enabled", false);
        setBooleanField(term847298, term847298.getClass(), "valid", false);
        setField(term847298, term847298.getClass(), "dropTarget", null);
        setField(term847298, term847298.getClass(), "popups", null);
        setField(term847298, term847298.getClass(), "name", null);
        setBooleanField(term847298, term847298.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847298, term847298.getClass(), "focusable", false);
        setIntField(term847298, term847298.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847298, term847298.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847298, term847298.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847298, term847298.getClass(), "acc", null);
        setField(term847298, term847298.getClass(), "minSize", null);
        setBooleanField(term847298, term847298.getClass(), "minSizeSet", false);
        setField(term847298, term847298.getClass(), "prefSize", null);
        setBooleanField(term847298, term847298.getClass(), "prefSizeSet", false);
        setField(term847298, term847298.getClass(), "maxSize", null);
        setBooleanField(term847298, term847298.getClass(), "maxSizeSet", false);
        setField(term847298, term847298.getClass(), "componentOrientation", null);
        setBooleanField(term847298, term847298.getClass(), "newEventsOnly", false);
        setField(term847298, term847298.getClass(), "componentListener", null);
        setField(term847298, term847298.getClass(), "focusListener", null);
        setField(term847298, term847298.getClass(), "hierarchyListener", null);
        setField(term847298, term847298.getClass(), "hierarchyBoundsListener", null);
        setField(term847298, term847298.getClass(), "keyListener", null);
        setField(term847298, term847298.getClass(), "mouseListener", null);
        setField(term847298, term847298.getClass(), "mouseMotionListener", null);
        setField(term847298, term847298.getClass(), "mouseWheelListener", null);
        setField(term847298, term847298.getClass(), "inputMethodListener", null);
        setLongField(term847298, term847298.getClass(), "eventMask", 0L);
        setField(term847298, term847298.getClass(), "changeSupport", null);
        setField(term847298, term847298.getClass(), "objectLock", null);
        setBooleanField(term847298, term847298.getClass(), "isPacked", false);
        setIntField(term847298, term847298.getClass(), "boundsOp", 0);
        setField(term847298, term847298.getClass(), "compoundShape", null);
        setField(term847298, term847298.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847298, term847298.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847298, term847298.getClass(), "backgroundEraseDisabled", false);
        setField(term847298, term847298.getClass(), "eventCache", null);
        setBooleanField(term847298, term847298.getClass(), "coalescingEnabled", false);
        setBooleanField(term847298, term847298.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847298, term847298.getClass(), "componentSerializedDataVersion", 0);
        setField(term847298, term847298.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStarMapMouseListener", argTypes, term847298, args);
    }

};


