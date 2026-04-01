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
import java.lang.Integer;

public class StarMapView_setCursorFocus_80939737836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847904;
     Object term847947;

    public StarMapView_setCursorFocus_80939737836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847904 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847904, term847904.getClass(), "map", null);
        setField(term847904, term847904.getClass(), "players", null);
        setField(term847904, term847904.getClass(), "mapPanel", null);
        setField(term847904, term847904.getClass(), "infoPanel", null);
        setField(term847904, term847904.getClass(), "starMapMouseListener", null);
        setField(term847904, term847904.getClass(), "endTurnButton", null);
        setField(term847904, term847904.getClass(), "viewResearchButton", null);
        setField(term847904, term847904.getClass(), "viewSpaceShips", null);
        setField(term847904, term847904.getClass(), "viewStats", null);
        setField(term847904, term847904.getClass(), "viewLeader", null);
        setField(term847904, term847904.getClass(), "credProd", null);
        setField(term847904, term847904.getClass(), "reseProd", null);
        setField(term847904, term847904.getClass(), "happinessMeter", null);
        setField(term847904, term847904.getClass(), "fleetMeter", null);
        setBooleanField(term847904, term847904.getClass(), "readyToMove", false);
        setField(term847904, term847904.getClass(), "msgPanel", null);
        setBooleanField(term847904, term847904.getClass(), "autoFocus", false);
        setField(term847904, term847904.getClass(), "game", null);
        setBooleanField(term847904, term847904.getClass(), "isAlignmentXSet", false);
        setFloatField(term847904, term847904.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847904, term847904.getClass(), "isAlignmentYSet", false);
        setFloatField(term847904, term847904.getClass(), "alignmentY", 0.0F);
        setField(term847904, term847904.getClass(), "ui", null);
        setField(term847904, term847904.getClass(), "listenerList", null);
        setField(term847904, term847904.getClass(), "clientProperties", null);
        setField(term847904, term847904.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847904, term847904.getClass(), "autoscrolls", false);
        setField(term847904, term847904.getClass(), "border", null);
        setIntField(term847904, term847904.getClass(), "flags", 0);
        setField(term847904, term847904.getClass(), "inputVerifier", null);
        setBooleanField(term847904, term847904.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847904, term847904.getClass(), "paintingChild", null);
        setField(term847904, term847904.getClass(), "popupMenu", null);
        setField(term847904, term847904.getClass(), "revalidateRunnableScheduled", null);
        setField(term847904, term847904.getClass(), "focusInputMap", null);
        setField(term847904, term847904.getClass(), "ancestorInputMap", null);
        setField(term847904, term847904.getClass(), "windowInputMap", null);
        setField(term847904, term847904.getClass(), "actionMap", null);
        setField(term847904, term847904.getClass(), "aaHint", null);
        setField(term847904, term847904.getClass(), "lcdRenderingHint", null);
        setField(term847904, term847904.getClass(), "component", null);
        setField(term847904, term847904.getClass(), "layoutMgr", null);
        setField(term847904, term847904.getClass(), "dispatcher", null);
        setField(term847904, term847904.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847904, term847904.getClass(), "focusCycleRoot", false);
        setBooleanField(term847904, term847904.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847904, term847904.getClass(), "printingThreads", null);
        setBooleanField(term847904, term847904.getClass(), "printing", false);
        setField(term847904, term847904.getClass(), "containerListener", null);
        setIntField(term847904, term847904.getClass(), "listeningChildren", 0);
        setIntField(term847904, term847904.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847904, term847904.getClass(), "descendantsCount", 0);
        setField(term847904, term847904.getClass(), "preserveBackgroundColor", null);
        setIntField(term847904, term847904.getClass(), "numOfHWComponents", 0);
        setIntField(term847904, term847904.getClass(), "numOfLWComponents", 0);
        setField(term847904, term847904.getClass(), "modalComp", null);
        setField(term847904, term847904.getClass(), "modalAppContext", null);
        setIntField(term847904, term847904.getClass(), "containerSerializedDataVersion", 0);
        setField(term847904, term847904.getClass(), "peer", null);
        setField(term847904, term847904.getClass(), "parent", null);
        setField(term847904, term847904.getClass(), "appContext", null);
        setIntField(term847904, term847904.getClass(), "x", 0);
        setIntField(term847904, term847904.getClass(), "y", 0);
        setIntField(term847904, term847904.getClass(), "width", 0);
        setIntField(term847904, term847904.getClass(), "height", 0);
        setField(term847904, term847904.getClass(), "foreground", null);
        setField(term847904, term847904.getClass(), "background", null);
        setField(term847904, term847904.getClass(), "font", null);
        setField(term847904, term847904.getClass(), "peerFont", null);
        setField(term847904, term847904.getClass(), "cursor", null);
        setField(term847904, term847904.getClass(), "locale", null);
        setField(term847904, term847904.getClass(), "graphicsConfig", null);
        setField(term847904, term847904.getClass(), "bufferStrategy", null);
        setBooleanField(term847904, term847904.getClass(), "ignoreRepaint", false);
        setBooleanField(term847904, term847904.getClass(), "visible", false);
        setBooleanField(term847904, term847904.getClass(), "enabled", false);
        setBooleanField(term847904, term847904.getClass(), "valid", false);
        setField(term847904, term847904.getClass(), "dropTarget", null);
        setField(term847904, term847904.getClass(), "popups", null);
        setField(term847904, term847904.getClass(), "name", null);
        setBooleanField(term847904, term847904.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847904, term847904.getClass(), "focusable", false);
        setIntField(term847904, term847904.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847904, term847904.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847904, term847904.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847904, term847904.getClass(), "acc", null);
        setField(term847904, term847904.getClass(), "minSize", null);
        setBooleanField(term847904, term847904.getClass(), "minSizeSet", false);
        setField(term847904, term847904.getClass(), "prefSize", null);
        setBooleanField(term847904, term847904.getClass(), "prefSizeSet", false);
        setField(term847904, term847904.getClass(), "maxSize", null);
        setBooleanField(term847904, term847904.getClass(), "maxSizeSet", false);
        setField(term847904, term847904.getClass(), "componentOrientation", null);
        setBooleanField(term847904, term847904.getClass(), "newEventsOnly", false);
        setField(term847904, term847904.getClass(), "componentListener", null);
        setField(term847904, term847904.getClass(), "focusListener", null);
        setField(term847904, term847904.getClass(), "hierarchyListener", null);
        setField(term847904, term847904.getClass(), "hierarchyBoundsListener", null);
        setField(term847904, term847904.getClass(), "keyListener", null);
        setField(term847904, term847904.getClass(), "mouseListener", null);
        setField(term847904, term847904.getClass(), "mouseMotionListener", null);
        setField(term847904, term847904.getClass(), "mouseWheelListener", null);
        setField(term847904, term847904.getClass(), "inputMethodListener", null);
        setLongField(term847904, term847904.getClass(), "eventMask", 0L);
        setField(term847904, term847904.getClass(), "changeSupport", null);
        setField(term847904, term847904.getClass(), "objectLock", null);
        setBooleanField(term847904, term847904.getClass(), "isPacked", false);
        setIntField(term847904, term847904.getClass(), "boundsOp", 0);
        setField(term847904, term847904.getClass(), "compoundShape", null);
        setField(term847904, term847904.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847904, term847904.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847904, term847904.getClass(), "backgroundEraseDisabled", false);
        setField(term847904, term847904.getClass(), "eventCache", null);
        setBooleanField(term847904, term847904.getClass(), "coalescingEnabled", false);
        setBooleanField(term847904, term847904.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847904, term847904.getClass(), "componentSerializedDataVersion", 0);
        setField(term847904, term847904.getClass(), "accessibleContext", null);
        term847947 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term847947;
        callMethod(klass, "setCursorFocus", argTypes, term847904, args);
    }

};


