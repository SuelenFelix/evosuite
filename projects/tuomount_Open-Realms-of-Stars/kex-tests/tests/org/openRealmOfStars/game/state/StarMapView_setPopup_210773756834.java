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

public class StarMapView_setPopup_210773756834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847818;

    public StarMapView_setPopup_210773756834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847818 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847818, term847818.getClass(), "map", null);
        setField(term847818, term847818.getClass(), "players", null);
        setField(term847818, term847818.getClass(), "mapPanel", null);
        setField(term847818, term847818.getClass(), "infoPanel", null);
        setField(term847818, term847818.getClass(), "starMapMouseListener", null);
        setField(term847818, term847818.getClass(), "endTurnButton", null);
        setField(term847818, term847818.getClass(), "viewResearchButton", null);
        setField(term847818, term847818.getClass(), "viewSpaceShips", null);
        setField(term847818, term847818.getClass(), "viewStats", null);
        setField(term847818, term847818.getClass(), "viewLeader", null);
        setField(term847818, term847818.getClass(), "credProd", null);
        setField(term847818, term847818.getClass(), "reseProd", null);
        setField(term847818, term847818.getClass(), "happinessMeter", null);
        setField(term847818, term847818.getClass(), "fleetMeter", null);
        setBooleanField(term847818, term847818.getClass(), "readyToMove", false);
        setField(term847818, term847818.getClass(), "msgPanel", null);
        setBooleanField(term847818, term847818.getClass(), "autoFocus", false);
        setField(term847818, term847818.getClass(), "game", null);
        setBooleanField(term847818, term847818.getClass(), "isAlignmentXSet", false);
        setFloatField(term847818, term847818.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847818, term847818.getClass(), "isAlignmentYSet", false);
        setFloatField(term847818, term847818.getClass(), "alignmentY", 0.0F);
        setField(term847818, term847818.getClass(), "ui", null);
        setField(term847818, term847818.getClass(), "listenerList", null);
        setField(term847818, term847818.getClass(), "clientProperties", null);
        setField(term847818, term847818.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847818, term847818.getClass(), "autoscrolls", false);
        setField(term847818, term847818.getClass(), "border", null);
        setIntField(term847818, term847818.getClass(), "flags", 0);
        setField(term847818, term847818.getClass(), "inputVerifier", null);
        setBooleanField(term847818, term847818.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847818, term847818.getClass(), "paintingChild", null);
        setField(term847818, term847818.getClass(), "popupMenu", null);
        setField(term847818, term847818.getClass(), "revalidateRunnableScheduled", null);
        setField(term847818, term847818.getClass(), "focusInputMap", null);
        setField(term847818, term847818.getClass(), "ancestorInputMap", null);
        setField(term847818, term847818.getClass(), "windowInputMap", null);
        setField(term847818, term847818.getClass(), "actionMap", null);
        setField(term847818, term847818.getClass(), "aaHint", null);
        setField(term847818, term847818.getClass(), "lcdRenderingHint", null);
        setField(term847818, term847818.getClass(), "component", null);
        setField(term847818, term847818.getClass(), "layoutMgr", null);
        setField(term847818, term847818.getClass(), "dispatcher", null);
        setField(term847818, term847818.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847818, term847818.getClass(), "focusCycleRoot", false);
        setBooleanField(term847818, term847818.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847818, term847818.getClass(), "printingThreads", null);
        setBooleanField(term847818, term847818.getClass(), "printing", false);
        setField(term847818, term847818.getClass(), "containerListener", null);
        setIntField(term847818, term847818.getClass(), "listeningChildren", 0);
        setIntField(term847818, term847818.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847818, term847818.getClass(), "descendantsCount", 0);
        setField(term847818, term847818.getClass(), "preserveBackgroundColor", null);
        setIntField(term847818, term847818.getClass(), "numOfHWComponents", 0);
        setIntField(term847818, term847818.getClass(), "numOfLWComponents", 0);
        setField(term847818, term847818.getClass(), "modalComp", null);
        setField(term847818, term847818.getClass(), "modalAppContext", null);
        setIntField(term847818, term847818.getClass(), "containerSerializedDataVersion", 0);
        setField(term847818, term847818.getClass(), "peer", null);
        setField(term847818, term847818.getClass(), "parent", null);
        setField(term847818, term847818.getClass(), "appContext", null);
        setIntField(term847818, term847818.getClass(), "x", 0);
        setIntField(term847818, term847818.getClass(), "y", 0);
        setIntField(term847818, term847818.getClass(), "width", 0);
        setIntField(term847818, term847818.getClass(), "height", 0);
        setField(term847818, term847818.getClass(), "foreground", null);
        setField(term847818, term847818.getClass(), "background", null);
        setField(term847818, term847818.getClass(), "font", null);
        setField(term847818, term847818.getClass(), "peerFont", null);
        setField(term847818, term847818.getClass(), "cursor", null);
        setField(term847818, term847818.getClass(), "locale", null);
        setField(term847818, term847818.getClass(), "graphicsConfig", null);
        setField(term847818, term847818.getClass(), "bufferStrategy", null);
        setBooleanField(term847818, term847818.getClass(), "ignoreRepaint", false);
        setBooleanField(term847818, term847818.getClass(), "visible", false);
        setBooleanField(term847818, term847818.getClass(), "enabled", false);
        setBooleanField(term847818, term847818.getClass(), "valid", false);
        setField(term847818, term847818.getClass(), "dropTarget", null);
        setField(term847818, term847818.getClass(), "popups", null);
        setField(term847818, term847818.getClass(), "name", null);
        setBooleanField(term847818, term847818.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847818, term847818.getClass(), "focusable", false);
        setIntField(term847818, term847818.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847818, term847818.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847818, term847818.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847818, term847818.getClass(), "acc", null);
        setField(term847818, term847818.getClass(), "minSize", null);
        setBooleanField(term847818, term847818.getClass(), "minSizeSet", false);
        setField(term847818, term847818.getClass(), "prefSize", null);
        setBooleanField(term847818, term847818.getClass(), "prefSizeSet", false);
        setField(term847818, term847818.getClass(), "maxSize", null);
        setBooleanField(term847818, term847818.getClass(), "maxSizeSet", false);
        setField(term847818, term847818.getClass(), "componentOrientation", null);
        setBooleanField(term847818, term847818.getClass(), "newEventsOnly", false);
        setField(term847818, term847818.getClass(), "componentListener", null);
        setField(term847818, term847818.getClass(), "focusListener", null);
        setField(term847818, term847818.getClass(), "hierarchyListener", null);
        setField(term847818, term847818.getClass(), "hierarchyBoundsListener", null);
        setField(term847818, term847818.getClass(), "keyListener", null);
        setField(term847818, term847818.getClass(), "mouseListener", null);
        setField(term847818, term847818.getClass(), "mouseMotionListener", null);
        setField(term847818, term847818.getClass(), "mouseWheelListener", null);
        setField(term847818, term847818.getClass(), "inputMethodListener", null);
        setLongField(term847818, term847818.getClass(), "eventMask", 0L);
        setField(term847818, term847818.getClass(), "changeSupport", null);
        setField(term847818, term847818.getClass(), "objectLock", null);
        setBooleanField(term847818, term847818.getClass(), "isPacked", false);
        setIntField(term847818, term847818.getClass(), "boundsOp", 0);
        setField(term847818, term847818.getClass(), "compoundShape", null);
        setField(term847818, term847818.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847818, term847818.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847818, term847818.getClass(), "backgroundEraseDisabled", false);
        setField(term847818, term847818.getClass(), "eventCache", null);
        setBooleanField(term847818, term847818.getClass(), "coalescingEnabled", false);
        setBooleanField(term847818, term847818.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847818, term847818.getClass(), "componentSerializedDataVersion", 0);
        setField(term847818, term847818.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPopup", argTypes, term847818, args);
    }

};


