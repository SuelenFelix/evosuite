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

public class StarMapView_getCredProd_25023106730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847644;

    public StarMapView_getCredProd_25023106730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847644 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847644, term847644.getClass(), "map", null);
        setField(term847644, term847644.getClass(), "players", null);
        setField(term847644, term847644.getClass(), "mapPanel", null);
        setField(term847644, term847644.getClass(), "infoPanel", null);
        setField(term847644, term847644.getClass(), "starMapMouseListener", null);
        setField(term847644, term847644.getClass(), "endTurnButton", null);
        setField(term847644, term847644.getClass(), "viewResearchButton", null);
        setField(term847644, term847644.getClass(), "viewSpaceShips", null);
        setField(term847644, term847644.getClass(), "viewStats", null);
        setField(term847644, term847644.getClass(), "viewLeader", null);
        setField(term847644, term847644.getClass(), "credProd", null);
        setField(term847644, term847644.getClass(), "reseProd", null);
        setField(term847644, term847644.getClass(), "happinessMeter", null);
        setField(term847644, term847644.getClass(), "fleetMeter", null);
        setBooleanField(term847644, term847644.getClass(), "readyToMove", false);
        setField(term847644, term847644.getClass(), "msgPanel", null);
        setBooleanField(term847644, term847644.getClass(), "autoFocus", false);
        setField(term847644, term847644.getClass(), "game", null);
        setBooleanField(term847644, term847644.getClass(), "isAlignmentXSet", false);
        setFloatField(term847644, term847644.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847644, term847644.getClass(), "isAlignmentYSet", false);
        setFloatField(term847644, term847644.getClass(), "alignmentY", 0.0F);
        setField(term847644, term847644.getClass(), "ui", null);
        setField(term847644, term847644.getClass(), "listenerList", null);
        setField(term847644, term847644.getClass(), "clientProperties", null);
        setField(term847644, term847644.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847644, term847644.getClass(), "autoscrolls", false);
        setField(term847644, term847644.getClass(), "border", null);
        setIntField(term847644, term847644.getClass(), "flags", 0);
        setField(term847644, term847644.getClass(), "inputVerifier", null);
        setBooleanField(term847644, term847644.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847644, term847644.getClass(), "paintingChild", null);
        setField(term847644, term847644.getClass(), "popupMenu", null);
        setField(term847644, term847644.getClass(), "revalidateRunnableScheduled", null);
        setField(term847644, term847644.getClass(), "focusInputMap", null);
        setField(term847644, term847644.getClass(), "ancestorInputMap", null);
        setField(term847644, term847644.getClass(), "windowInputMap", null);
        setField(term847644, term847644.getClass(), "actionMap", null);
        setField(term847644, term847644.getClass(), "aaHint", null);
        setField(term847644, term847644.getClass(), "lcdRenderingHint", null);
        setField(term847644, term847644.getClass(), "component", null);
        setField(term847644, term847644.getClass(), "layoutMgr", null);
        setField(term847644, term847644.getClass(), "dispatcher", null);
        setField(term847644, term847644.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847644, term847644.getClass(), "focusCycleRoot", false);
        setBooleanField(term847644, term847644.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847644, term847644.getClass(), "printingThreads", null);
        setBooleanField(term847644, term847644.getClass(), "printing", false);
        setField(term847644, term847644.getClass(), "containerListener", null);
        setIntField(term847644, term847644.getClass(), "listeningChildren", 0);
        setIntField(term847644, term847644.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847644, term847644.getClass(), "descendantsCount", 0);
        setField(term847644, term847644.getClass(), "preserveBackgroundColor", null);
        setIntField(term847644, term847644.getClass(), "numOfHWComponents", 0);
        setIntField(term847644, term847644.getClass(), "numOfLWComponents", 0);
        setField(term847644, term847644.getClass(), "modalComp", null);
        setField(term847644, term847644.getClass(), "modalAppContext", null);
        setIntField(term847644, term847644.getClass(), "containerSerializedDataVersion", 0);
        setField(term847644, term847644.getClass(), "peer", null);
        setField(term847644, term847644.getClass(), "parent", null);
        setField(term847644, term847644.getClass(), "appContext", null);
        setIntField(term847644, term847644.getClass(), "x", 0);
        setIntField(term847644, term847644.getClass(), "y", 0);
        setIntField(term847644, term847644.getClass(), "width", 0);
        setIntField(term847644, term847644.getClass(), "height", 0);
        setField(term847644, term847644.getClass(), "foreground", null);
        setField(term847644, term847644.getClass(), "background", null);
        setField(term847644, term847644.getClass(), "font", null);
        setField(term847644, term847644.getClass(), "peerFont", null);
        setField(term847644, term847644.getClass(), "cursor", null);
        setField(term847644, term847644.getClass(), "locale", null);
        setField(term847644, term847644.getClass(), "graphicsConfig", null);
        setField(term847644, term847644.getClass(), "bufferStrategy", null);
        setBooleanField(term847644, term847644.getClass(), "ignoreRepaint", false);
        setBooleanField(term847644, term847644.getClass(), "visible", false);
        setBooleanField(term847644, term847644.getClass(), "enabled", false);
        setBooleanField(term847644, term847644.getClass(), "valid", false);
        setField(term847644, term847644.getClass(), "dropTarget", null);
        setField(term847644, term847644.getClass(), "popups", null);
        setField(term847644, term847644.getClass(), "name", null);
        setBooleanField(term847644, term847644.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847644, term847644.getClass(), "focusable", false);
        setIntField(term847644, term847644.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847644, term847644.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847644, term847644.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847644, term847644.getClass(), "acc", null);
        setField(term847644, term847644.getClass(), "minSize", null);
        setBooleanField(term847644, term847644.getClass(), "minSizeSet", false);
        setField(term847644, term847644.getClass(), "prefSize", null);
        setBooleanField(term847644, term847644.getClass(), "prefSizeSet", false);
        setField(term847644, term847644.getClass(), "maxSize", null);
        setBooleanField(term847644, term847644.getClass(), "maxSizeSet", false);
        setField(term847644, term847644.getClass(), "componentOrientation", null);
        setBooleanField(term847644, term847644.getClass(), "newEventsOnly", false);
        setField(term847644, term847644.getClass(), "componentListener", null);
        setField(term847644, term847644.getClass(), "focusListener", null);
        setField(term847644, term847644.getClass(), "hierarchyListener", null);
        setField(term847644, term847644.getClass(), "hierarchyBoundsListener", null);
        setField(term847644, term847644.getClass(), "keyListener", null);
        setField(term847644, term847644.getClass(), "mouseListener", null);
        setField(term847644, term847644.getClass(), "mouseMotionListener", null);
        setField(term847644, term847644.getClass(), "mouseWheelListener", null);
        setField(term847644, term847644.getClass(), "inputMethodListener", null);
        setLongField(term847644, term847644.getClass(), "eventMask", 0L);
        setField(term847644, term847644.getClass(), "changeSupport", null);
        setField(term847644, term847644.getClass(), "objectLock", null);
        setBooleanField(term847644, term847644.getClass(), "isPacked", false);
        setIntField(term847644, term847644.getClass(), "boundsOp", 0);
        setField(term847644, term847644.getClass(), "compoundShape", null);
        setField(term847644, term847644.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847644, term847644.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847644, term847644.getClass(), "backgroundEraseDisabled", false);
        setField(term847644, term847644.getClass(), "eventCache", null);
        setBooleanField(term847644, term847644.getClass(), "coalescingEnabled", false);
        setBooleanField(term847644, term847644.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847644, term847644.getClass(), "componentSerializedDataVersion", 0);
        setField(term847644, term847644.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCredProd", argTypes, term847644, args);
    }

};


