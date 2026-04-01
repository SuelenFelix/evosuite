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

public class StarMapView_handleActions_161609751026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847470;

    public StarMapView_handleActions_161609751026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847470 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847470, term847470.getClass(), "map", null);
        setField(term847470, term847470.getClass(), "players", null);
        setField(term847470, term847470.getClass(), "mapPanel", null);
        setField(term847470, term847470.getClass(), "infoPanel", null);
        setField(term847470, term847470.getClass(), "starMapMouseListener", null);
        setField(term847470, term847470.getClass(), "endTurnButton", null);
        setField(term847470, term847470.getClass(), "viewResearchButton", null);
        setField(term847470, term847470.getClass(), "viewSpaceShips", null);
        setField(term847470, term847470.getClass(), "viewStats", null);
        setField(term847470, term847470.getClass(), "viewLeader", null);
        setField(term847470, term847470.getClass(), "credProd", null);
        setField(term847470, term847470.getClass(), "reseProd", null);
        setField(term847470, term847470.getClass(), "happinessMeter", null);
        setField(term847470, term847470.getClass(), "fleetMeter", null);
        setBooleanField(term847470, term847470.getClass(), "readyToMove", false);
        setField(term847470, term847470.getClass(), "msgPanel", null);
        setBooleanField(term847470, term847470.getClass(), "autoFocus", false);
        setField(term847470, term847470.getClass(), "game", null);
        setBooleanField(term847470, term847470.getClass(), "isAlignmentXSet", false);
        setFloatField(term847470, term847470.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847470, term847470.getClass(), "isAlignmentYSet", false);
        setFloatField(term847470, term847470.getClass(), "alignmentY", 0.0F);
        setField(term847470, term847470.getClass(), "ui", null);
        setField(term847470, term847470.getClass(), "listenerList", null);
        setField(term847470, term847470.getClass(), "clientProperties", null);
        setField(term847470, term847470.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847470, term847470.getClass(), "autoscrolls", false);
        setField(term847470, term847470.getClass(), "border", null);
        setIntField(term847470, term847470.getClass(), "flags", 0);
        setField(term847470, term847470.getClass(), "inputVerifier", null);
        setBooleanField(term847470, term847470.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847470, term847470.getClass(), "paintingChild", null);
        setField(term847470, term847470.getClass(), "popupMenu", null);
        setField(term847470, term847470.getClass(), "revalidateRunnableScheduled", null);
        setField(term847470, term847470.getClass(), "focusInputMap", null);
        setField(term847470, term847470.getClass(), "ancestorInputMap", null);
        setField(term847470, term847470.getClass(), "windowInputMap", null);
        setField(term847470, term847470.getClass(), "actionMap", null);
        setField(term847470, term847470.getClass(), "aaHint", null);
        setField(term847470, term847470.getClass(), "lcdRenderingHint", null);
        setField(term847470, term847470.getClass(), "component", null);
        setField(term847470, term847470.getClass(), "layoutMgr", null);
        setField(term847470, term847470.getClass(), "dispatcher", null);
        setField(term847470, term847470.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847470, term847470.getClass(), "focusCycleRoot", false);
        setBooleanField(term847470, term847470.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847470, term847470.getClass(), "printingThreads", null);
        setBooleanField(term847470, term847470.getClass(), "printing", false);
        setField(term847470, term847470.getClass(), "containerListener", null);
        setIntField(term847470, term847470.getClass(), "listeningChildren", 0);
        setIntField(term847470, term847470.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847470, term847470.getClass(), "descendantsCount", 0);
        setField(term847470, term847470.getClass(), "preserveBackgroundColor", null);
        setIntField(term847470, term847470.getClass(), "numOfHWComponents", 0);
        setIntField(term847470, term847470.getClass(), "numOfLWComponents", 0);
        setField(term847470, term847470.getClass(), "modalComp", null);
        setField(term847470, term847470.getClass(), "modalAppContext", null);
        setIntField(term847470, term847470.getClass(), "containerSerializedDataVersion", 0);
        setField(term847470, term847470.getClass(), "peer", null);
        setField(term847470, term847470.getClass(), "parent", null);
        setField(term847470, term847470.getClass(), "appContext", null);
        setIntField(term847470, term847470.getClass(), "x", 0);
        setIntField(term847470, term847470.getClass(), "y", 0);
        setIntField(term847470, term847470.getClass(), "width", 0);
        setIntField(term847470, term847470.getClass(), "height", 0);
        setField(term847470, term847470.getClass(), "foreground", null);
        setField(term847470, term847470.getClass(), "background", null);
        setField(term847470, term847470.getClass(), "font", null);
        setField(term847470, term847470.getClass(), "peerFont", null);
        setField(term847470, term847470.getClass(), "cursor", null);
        setField(term847470, term847470.getClass(), "locale", null);
        setField(term847470, term847470.getClass(), "graphicsConfig", null);
        setField(term847470, term847470.getClass(), "bufferStrategy", null);
        setBooleanField(term847470, term847470.getClass(), "ignoreRepaint", false);
        setBooleanField(term847470, term847470.getClass(), "visible", false);
        setBooleanField(term847470, term847470.getClass(), "enabled", false);
        setBooleanField(term847470, term847470.getClass(), "valid", false);
        setField(term847470, term847470.getClass(), "dropTarget", null);
        setField(term847470, term847470.getClass(), "popups", null);
        setField(term847470, term847470.getClass(), "name", null);
        setBooleanField(term847470, term847470.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847470, term847470.getClass(), "focusable", false);
        setIntField(term847470, term847470.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847470, term847470.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847470, term847470.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847470, term847470.getClass(), "acc", null);
        setField(term847470, term847470.getClass(), "minSize", null);
        setBooleanField(term847470, term847470.getClass(), "minSizeSet", false);
        setField(term847470, term847470.getClass(), "prefSize", null);
        setBooleanField(term847470, term847470.getClass(), "prefSizeSet", false);
        setField(term847470, term847470.getClass(), "maxSize", null);
        setBooleanField(term847470, term847470.getClass(), "maxSizeSet", false);
        setField(term847470, term847470.getClass(), "componentOrientation", null);
        setBooleanField(term847470, term847470.getClass(), "newEventsOnly", false);
        setField(term847470, term847470.getClass(), "componentListener", null);
        setField(term847470, term847470.getClass(), "focusListener", null);
        setField(term847470, term847470.getClass(), "hierarchyListener", null);
        setField(term847470, term847470.getClass(), "hierarchyBoundsListener", null);
        setField(term847470, term847470.getClass(), "keyListener", null);
        setField(term847470, term847470.getClass(), "mouseListener", null);
        setField(term847470, term847470.getClass(), "mouseMotionListener", null);
        setField(term847470, term847470.getClass(), "mouseWheelListener", null);
        setField(term847470, term847470.getClass(), "inputMethodListener", null);
        setLongField(term847470, term847470.getClass(), "eventMask", 0L);
        setField(term847470, term847470.getClass(), "changeSupport", null);
        setField(term847470, term847470.getClass(), "objectLock", null);
        setBooleanField(term847470, term847470.getClass(), "isPacked", false);
        setIntField(term847470, term847470.getClass(), "boundsOp", 0);
        setField(term847470, term847470.getClass(), "compoundShape", null);
        setField(term847470, term847470.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847470, term847470.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847470, term847470.getClass(), "backgroundEraseDisabled", false);
        setField(term847470, term847470.getClass(), "eventCache", null);
        setBooleanField(term847470, term847470.getClass(), "coalescingEnabled", false);
        setBooleanField(term847470, term847470.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847470, term847470.getClass(), "componentSerializedDataVersion", 0);
        setField(term847470, term847470.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleActions", argTypes, term847470, args);
    }

};


