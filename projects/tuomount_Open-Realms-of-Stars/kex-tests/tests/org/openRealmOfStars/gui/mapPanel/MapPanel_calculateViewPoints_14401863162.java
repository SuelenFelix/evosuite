package org.openRealmOfStars.gui.mapPanel;

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
import static org.openRealmOfStars.gui.mapPanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MapPanel_calculateViewPoints_14401863162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137533;
     Object term137604;
     Object term137606;
     Object term137608;

    public MapPanel_calculateViewPoints_14401863162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137533 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term137533, term137533.getClass(), "viewPointX", 0);
        setIntField(term137533, term137533.getClass(), "viewPointY", 0);
        setIntField(term137533, term137533.getClass(), "viewPointOffsetX", 0);
        setIntField(term137533, term137533.getClass(), "viewPointOffsetY", 0);
        setField(term137533, term137533.getClass(), "screen", null);
        setField(term137533, term137533.getClass(), "backgroundScreen", null);
        setIntField(term137533, term137533.getClass(), "flickerBlue", 0);
        setBooleanField(term137533, term137533.getClass(), "flickerGoUp", false);
        setIntField(term137533, term137533.getClass(), "lastDrawnCenterX", 0);
        setIntField(term137533, term137533.getClass(), "lastDrawnCenterY", 0);
        setField(term137533, term137533.getClass(), "route", null);
        setBooleanField(term137533, term137533.getClass(), "battle", false);
        setIntField(term137533, term137533.getClass(), "wormHoleAnimation", 0);
        setField(term137533, term137533.getClass(), "historyCultures", null);
        setBooleanField(term137533, term137533.getClass(), "historyCoordInitialized", false);
        setIntField(term137533, term137533.getClass(), "historyCoordX", 0);
        setIntField(term137533, term137533.getClass(), "historyCoordY", 0);
        setField(term137533, term137533.getClass(), "leftSpaceImage", null);
        setField(term137533, term137533.getClass(), "rightSpaceImage", null);
        setField(term137533, term137533.getClass(), "popup", null);
        setField(term137533, term137533.getClass(), "tileOverride", null);
        setField(term137533, term137533.getClass(), "redrawTile", null);
        setBooleanField(term137533, term137533.getClass(), "fullDraw", false);
        setIntField(term137533, term137533.getClass(), "cursorFocus", 0);
        setField(term137533, term137533.getClass(), "minimap", null);
        setBooleanField(term137533, term137533.getClass(), "showMiniMap", false);
        setBooleanField(term137533, term137533.getClass(), "highContrastGrid", false);
        setIntField(term137533, term137533.getClass(), "miniMapTopX", 0);
        setIntField(term137533, term137533.getClass(), "miniMapTopY", 0);
        setIntField(term137533, term137533.getClass(), "miniMapBotX", 0);
        setIntField(term137533, term137533.getClass(), "miniMapBotY", 0);
        setIntField(term137533, term137533.getClass(), "transparency", 0);
        setBooleanField(term137533, term137533.getClass(), "improvedParallax", false);
        setBooleanField(term137533, term137533.getClass(), "updateAnimation", false);
        setIntField(term137533, term137533.getClass(), "updateAnimationCount", 0);
        setBooleanField(term137533, term137533.getClass(), "drawWeaponRange", false);
        setField(term137533, term137533.getClass(), "panelType", null);
        setIntField(term137533, term137533.getClass(), "lastCursorPosX", 0);
        setIntField(term137533, term137533.getClass(), "lastCursorPosY", 0);
        setIntField(term137533, term137533.getClass(), "lastZoomLevel", 0);
        setBooleanField(term137533, term137533.getClass(), "redoViewPoints", false);
        setBooleanField(term137533, term137533.getClass(), "isAlignmentXSet", false);
        setFloatField(term137533, term137533.getClass(), "alignmentX", 0.0F);
        setBooleanField(term137533, term137533.getClass(), "isAlignmentYSet", false);
        setFloatField(term137533, term137533.getClass(), "alignmentY", 0.0F);
        setField(term137533, term137533.getClass(), "ui", null);
        setField(term137533, term137533.getClass(), "listenerList", null);
        setField(term137533, term137533.getClass(), "clientProperties", null);
        setField(term137533, term137533.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term137533, term137533.getClass(), "autoscrolls", false);
        setField(term137533, term137533.getClass(), "border", null);
        setIntField(term137533, term137533.getClass(), "flags", 0);
        setField(term137533, term137533.getClass(), "inputVerifier", null);
        setBooleanField(term137533, term137533.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term137533, term137533.getClass(), "paintingChild", null);
        setField(term137533, term137533.getClass(), "popupMenu", null);
        setField(term137533, term137533.getClass(), "revalidateRunnableScheduled", null);
        setField(term137533, term137533.getClass(), "focusInputMap", null);
        setField(term137533, term137533.getClass(), "ancestorInputMap", null);
        setField(term137533, term137533.getClass(), "windowInputMap", null);
        setField(term137533, term137533.getClass(), "actionMap", null);
        setField(term137533, term137533.getClass(), "aaHint", null);
        setField(term137533, term137533.getClass(), "lcdRenderingHint", null);
        setField(term137533, term137533.getClass(), "component", null);
        setField(term137533, term137533.getClass(), "layoutMgr", null);
        setField(term137533, term137533.getClass(), "dispatcher", null);
        setField(term137533, term137533.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term137533, term137533.getClass(), "focusCycleRoot", false);
        setBooleanField(term137533, term137533.getClass(), "focusTraversalPolicyProvider", false);
        setField(term137533, term137533.getClass(), "printingThreads", null);
        setBooleanField(term137533, term137533.getClass(), "printing", false);
        setField(term137533, term137533.getClass(), "containerListener", null);
        setIntField(term137533, term137533.getClass(), "listeningChildren", 0);
        setIntField(term137533, term137533.getClass(), "listeningBoundsChildren", 0);
        setIntField(term137533, term137533.getClass(), "descendantsCount", 0);
        setField(term137533, term137533.getClass(), "preserveBackgroundColor", null);
        setIntField(term137533, term137533.getClass(), "numOfHWComponents", 0);
        setIntField(term137533, term137533.getClass(), "numOfLWComponents", 0);
        setField(term137533, term137533.getClass(), "modalComp", null);
        setField(term137533, term137533.getClass(), "modalAppContext", null);
        setIntField(term137533, term137533.getClass(), "containerSerializedDataVersion", 0);
        setField(term137533, term137533.getClass(), "peer", null);
        setField(term137533, term137533.getClass(), "parent", null);
        setField(term137533, term137533.getClass(), "appContext", null);
        setIntField(term137533, term137533.getClass(), "x", 0);
        setIntField(term137533, term137533.getClass(), "y", 0);
        setIntField(term137533, term137533.getClass(), "width", 0);
        setIntField(term137533, term137533.getClass(), "height", 0);
        setField(term137533, term137533.getClass(), "foreground", null);
        setField(term137533, term137533.getClass(), "background", null);
        setField(term137533, term137533.getClass(), "font", null);
        setField(term137533, term137533.getClass(), "peerFont", null);
        setField(term137533, term137533.getClass(), "cursor", null);
        setField(term137533, term137533.getClass(), "locale", null);
        setField(term137533, term137533.getClass(), "graphicsConfig", null);
        setField(term137533, term137533.getClass(), "bufferStrategy", null);
        setBooleanField(term137533, term137533.getClass(), "ignoreRepaint", false);
        setBooleanField(term137533, term137533.getClass(), "visible", false);
        setBooleanField(term137533, term137533.getClass(), "enabled", false);
        setBooleanField(term137533, term137533.getClass(), "valid", false);
        setField(term137533, term137533.getClass(), "dropTarget", null);
        setField(term137533, term137533.getClass(), "popups", null);
        setField(term137533, term137533.getClass(), "name", null);
        setBooleanField(term137533, term137533.getClass(), "nameExplicitlySet", false);
        setBooleanField(term137533, term137533.getClass(), "focusable", false);
        setIntField(term137533, term137533.getClass(), "isFocusTraversableOverridden", 0);
        setField(term137533, term137533.getClass(), "focusTraversalKeys", null);
        setBooleanField(term137533, term137533.getClass(), "focusTraversalKeysEnabled", false);
        setField(term137533, term137533.getClass(), "acc", null);
        setField(term137533, term137533.getClass(), "minSize", null);
        setBooleanField(term137533, term137533.getClass(), "minSizeSet", false);
        setField(term137533, term137533.getClass(), "prefSize", null);
        setBooleanField(term137533, term137533.getClass(), "prefSizeSet", false);
        setField(term137533, term137533.getClass(), "maxSize", null);
        setBooleanField(term137533, term137533.getClass(), "maxSizeSet", false);
        setField(term137533, term137533.getClass(), "componentOrientation", null);
        setBooleanField(term137533, term137533.getClass(), "newEventsOnly", false);
        setField(term137533, term137533.getClass(), "componentListener", null);
        setField(term137533, term137533.getClass(), "focusListener", null);
        setField(term137533, term137533.getClass(), "hierarchyListener", null);
        setField(term137533, term137533.getClass(), "hierarchyBoundsListener", null);
        setField(term137533, term137533.getClass(), "keyListener", null);
        setField(term137533, term137533.getClass(), "mouseListener", null);
        setField(term137533, term137533.getClass(), "mouseMotionListener", null);
        setField(term137533, term137533.getClass(), "mouseWheelListener", null);
        setField(term137533, term137533.getClass(), "inputMethodListener", null);
        setLongField(term137533, term137533.getClass(), "eventMask", 0L);
        setField(term137533, term137533.getClass(), "changeSupport", null);
        setField(term137533, term137533.getClass(), "objectLock", null);
        setBooleanField(term137533, term137533.getClass(), "isPacked", false);
        setIntField(term137533, term137533.getClass(), "boundsOp", 0);
        setField(term137533, term137533.getClass(), "compoundShape", null);
        setField(term137533, term137533.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term137533, term137533.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term137533, term137533.getClass(), "backgroundEraseDisabled", false);
        setField(term137533, term137533.getClass(), "eventCache", null);
        setBooleanField(term137533, term137533.getClass(), "coalescingEnabled", false);
        setBooleanField(term137533, term137533.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term137533, term137533.getClass(), "componentSerializedDataVersion", 0);
        setField(term137533, term137533.getClass(), "accessibleContext", null);
        term137604 = new Integer(0);
        term137606 = new Integer(0);
        term137608 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term137604;
        args[1] = term137606;
        args[2] = term137608;
        callMethod(klass, "calculateViewPoints", argTypes, term137533, args);
    }

};


