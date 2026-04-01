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

public class StarMapView_setReadyToMove_149534174333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847773;
     Object term847816;

    public StarMapView_setReadyToMove_149534174333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847773 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847773, term847773.getClass(), "map", null);
        setField(term847773, term847773.getClass(), "players", null);
        setField(term847773, term847773.getClass(), "mapPanel", null);
        setField(term847773, term847773.getClass(), "infoPanel", null);
        setField(term847773, term847773.getClass(), "starMapMouseListener", null);
        setField(term847773, term847773.getClass(), "endTurnButton", null);
        setField(term847773, term847773.getClass(), "viewResearchButton", null);
        setField(term847773, term847773.getClass(), "viewSpaceShips", null);
        setField(term847773, term847773.getClass(), "viewStats", null);
        setField(term847773, term847773.getClass(), "viewLeader", null);
        setField(term847773, term847773.getClass(), "credProd", null);
        setField(term847773, term847773.getClass(), "reseProd", null);
        setField(term847773, term847773.getClass(), "happinessMeter", null);
        setField(term847773, term847773.getClass(), "fleetMeter", null);
        setBooleanField(term847773, term847773.getClass(), "readyToMove", false);
        setField(term847773, term847773.getClass(), "msgPanel", null);
        setBooleanField(term847773, term847773.getClass(), "autoFocus", false);
        setField(term847773, term847773.getClass(), "game", null);
        setBooleanField(term847773, term847773.getClass(), "isAlignmentXSet", false);
        setFloatField(term847773, term847773.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847773, term847773.getClass(), "isAlignmentYSet", false);
        setFloatField(term847773, term847773.getClass(), "alignmentY", 0.0F);
        setField(term847773, term847773.getClass(), "ui", null);
        setField(term847773, term847773.getClass(), "listenerList", null);
        setField(term847773, term847773.getClass(), "clientProperties", null);
        setField(term847773, term847773.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847773, term847773.getClass(), "autoscrolls", false);
        setField(term847773, term847773.getClass(), "border", null);
        setIntField(term847773, term847773.getClass(), "flags", 0);
        setField(term847773, term847773.getClass(), "inputVerifier", null);
        setBooleanField(term847773, term847773.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847773, term847773.getClass(), "paintingChild", null);
        setField(term847773, term847773.getClass(), "popupMenu", null);
        setField(term847773, term847773.getClass(), "revalidateRunnableScheduled", null);
        setField(term847773, term847773.getClass(), "focusInputMap", null);
        setField(term847773, term847773.getClass(), "ancestorInputMap", null);
        setField(term847773, term847773.getClass(), "windowInputMap", null);
        setField(term847773, term847773.getClass(), "actionMap", null);
        setField(term847773, term847773.getClass(), "aaHint", null);
        setField(term847773, term847773.getClass(), "lcdRenderingHint", null);
        setField(term847773, term847773.getClass(), "component", null);
        setField(term847773, term847773.getClass(), "layoutMgr", null);
        setField(term847773, term847773.getClass(), "dispatcher", null);
        setField(term847773, term847773.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847773, term847773.getClass(), "focusCycleRoot", false);
        setBooleanField(term847773, term847773.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847773, term847773.getClass(), "printingThreads", null);
        setBooleanField(term847773, term847773.getClass(), "printing", false);
        setField(term847773, term847773.getClass(), "containerListener", null);
        setIntField(term847773, term847773.getClass(), "listeningChildren", 0);
        setIntField(term847773, term847773.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847773, term847773.getClass(), "descendantsCount", 0);
        setField(term847773, term847773.getClass(), "preserveBackgroundColor", null);
        setIntField(term847773, term847773.getClass(), "numOfHWComponents", 0);
        setIntField(term847773, term847773.getClass(), "numOfLWComponents", 0);
        setField(term847773, term847773.getClass(), "modalComp", null);
        setField(term847773, term847773.getClass(), "modalAppContext", null);
        setIntField(term847773, term847773.getClass(), "containerSerializedDataVersion", 0);
        setField(term847773, term847773.getClass(), "peer", null);
        setField(term847773, term847773.getClass(), "parent", null);
        setField(term847773, term847773.getClass(), "appContext", null);
        setIntField(term847773, term847773.getClass(), "x", 0);
        setIntField(term847773, term847773.getClass(), "y", 0);
        setIntField(term847773, term847773.getClass(), "width", 0);
        setIntField(term847773, term847773.getClass(), "height", 0);
        setField(term847773, term847773.getClass(), "foreground", null);
        setField(term847773, term847773.getClass(), "background", null);
        setField(term847773, term847773.getClass(), "font", null);
        setField(term847773, term847773.getClass(), "peerFont", null);
        setField(term847773, term847773.getClass(), "cursor", null);
        setField(term847773, term847773.getClass(), "locale", null);
        setField(term847773, term847773.getClass(), "graphicsConfig", null);
        setField(term847773, term847773.getClass(), "bufferStrategy", null);
        setBooleanField(term847773, term847773.getClass(), "ignoreRepaint", false);
        setBooleanField(term847773, term847773.getClass(), "visible", false);
        setBooleanField(term847773, term847773.getClass(), "enabled", false);
        setBooleanField(term847773, term847773.getClass(), "valid", false);
        setField(term847773, term847773.getClass(), "dropTarget", null);
        setField(term847773, term847773.getClass(), "popups", null);
        setField(term847773, term847773.getClass(), "name", null);
        setBooleanField(term847773, term847773.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847773, term847773.getClass(), "focusable", false);
        setIntField(term847773, term847773.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847773, term847773.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847773, term847773.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847773, term847773.getClass(), "acc", null);
        setField(term847773, term847773.getClass(), "minSize", null);
        setBooleanField(term847773, term847773.getClass(), "minSizeSet", false);
        setField(term847773, term847773.getClass(), "prefSize", null);
        setBooleanField(term847773, term847773.getClass(), "prefSizeSet", false);
        setField(term847773, term847773.getClass(), "maxSize", null);
        setBooleanField(term847773, term847773.getClass(), "maxSizeSet", false);
        setField(term847773, term847773.getClass(), "componentOrientation", null);
        setBooleanField(term847773, term847773.getClass(), "newEventsOnly", false);
        setField(term847773, term847773.getClass(), "componentListener", null);
        setField(term847773, term847773.getClass(), "focusListener", null);
        setField(term847773, term847773.getClass(), "hierarchyListener", null);
        setField(term847773, term847773.getClass(), "hierarchyBoundsListener", null);
        setField(term847773, term847773.getClass(), "keyListener", null);
        setField(term847773, term847773.getClass(), "mouseListener", null);
        setField(term847773, term847773.getClass(), "mouseMotionListener", null);
        setField(term847773, term847773.getClass(), "mouseWheelListener", null);
        setField(term847773, term847773.getClass(), "inputMethodListener", null);
        setLongField(term847773, term847773.getClass(), "eventMask", 0L);
        setField(term847773, term847773.getClass(), "changeSupport", null);
        setField(term847773, term847773.getClass(), "objectLock", null);
        setBooleanField(term847773, term847773.getClass(), "isPacked", false);
        setIntField(term847773, term847773.getClass(), "boundsOp", 0);
        setField(term847773, term847773.getClass(), "compoundShape", null);
        setField(term847773, term847773.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847773, term847773.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847773, term847773.getClass(), "backgroundEraseDisabled", false);
        setField(term847773, term847773.getClass(), "eventCache", null);
        setBooleanField(term847773, term847773.getClass(), "coalescingEnabled", false);
        setBooleanField(term847773, term847773.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847773, term847773.getClass(), "componentSerializedDataVersion", 0);
        setField(term847773, term847773.getClass(), "accessibleContext", null);
        term847816 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term847816;
        callMethod(klass, "setReadyToMove", argTypes, term847773, args);
    }

};


