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

public class MapPanel_setHistoryCultures_124261700875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138474;

    public MapPanel_setHistoryCultures_124261700875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138474 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term138474, term138474.getClass(), "viewPointX", 0);
        setIntField(term138474, term138474.getClass(), "viewPointY", 0);
        setIntField(term138474, term138474.getClass(), "viewPointOffsetX", 0);
        setIntField(term138474, term138474.getClass(), "viewPointOffsetY", 0);
        setField(term138474, term138474.getClass(), "screen", null);
        setField(term138474, term138474.getClass(), "backgroundScreen", null);
        setIntField(term138474, term138474.getClass(), "flickerBlue", 0);
        setBooleanField(term138474, term138474.getClass(), "flickerGoUp", false);
        setIntField(term138474, term138474.getClass(), "lastDrawnCenterX", 0);
        setIntField(term138474, term138474.getClass(), "lastDrawnCenterY", 0);
        setField(term138474, term138474.getClass(), "route", null);
        setBooleanField(term138474, term138474.getClass(), "battle", false);
        setIntField(term138474, term138474.getClass(), "wormHoleAnimation", 0);
        setField(term138474, term138474.getClass(), "historyCultures", null);
        setBooleanField(term138474, term138474.getClass(), "historyCoordInitialized", false);
        setIntField(term138474, term138474.getClass(), "historyCoordX", 0);
        setIntField(term138474, term138474.getClass(), "historyCoordY", 0);
        setField(term138474, term138474.getClass(), "leftSpaceImage", null);
        setField(term138474, term138474.getClass(), "rightSpaceImage", null);
        setField(term138474, term138474.getClass(), "popup", null);
        setField(term138474, term138474.getClass(), "tileOverride", null);
        setField(term138474, term138474.getClass(), "redrawTile", null);
        setBooleanField(term138474, term138474.getClass(), "fullDraw", false);
        setIntField(term138474, term138474.getClass(), "cursorFocus", 0);
        setField(term138474, term138474.getClass(), "minimap", null);
        setBooleanField(term138474, term138474.getClass(), "showMiniMap", false);
        setBooleanField(term138474, term138474.getClass(), "highContrastGrid", false);
        setIntField(term138474, term138474.getClass(), "miniMapTopX", 0);
        setIntField(term138474, term138474.getClass(), "miniMapTopY", 0);
        setIntField(term138474, term138474.getClass(), "miniMapBotX", 0);
        setIntField(term138474, term138474.getClass(), "miniMapBotY", 0);
        setIntField(term138474, term138474.getClass(), "transparency", 0);
        setBooleanField(term138474, term138474.getClass(), "improvedParallax", false);
        setBooleanField(term138474, term138474.getClass(), "updateAnimation", false);
        setIntField(term138474, term138474.getClass(), "updateAnimationCount", 0);
        setBooleanField(term138474, term138474.getClass(), "drawWeaponRange", false);
        setField(term138474, term138474.getClass(), "panelType", null);
        setIntField(term138474, term138474.getClass(), "lastCursorPosX", 0);
        setIntField(term138474, term138474.getClass(), "lastCursorPosY", 0);
        setIntField(term138474, term138474.getClass(), "lastZoomLevel", 0);
        setBooleanField(term138474, term138474.getClass(), "redoViewPoints", false);
        setBooleanField(term138474, term138474.getClass(), "isAlignmentXSet", false);
        setFloatField(term138474, term138474.getClass(), "alignmentX", 0.0F);
        setBooleanField(term138474, term138474.getClass(), "isAlignmentYSet", false);
        setFloatField(term138474, term138474.getClass(), "alignmentY", 0.0F);
        setField(term138474, term138474.getClass(), "ui", null);
        setField(term138474, term138474.getClass(), "listenerList", null);
        setField(term138474, term138474.getClass(), "clientProperties", null);
        setField(term138474, term138474.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term138474, term138474.getClass(), "autoscrolls", false);
        setField(term138474, term138474.getClass(), "border", null);
        setIntField(term138474, term138474.getClass(), "flags", 0);
        setField(term138474, term138474.getClass(), "inputVerifier", null);
        setBooleanField(term138474, term138474.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term138474, term138474.getClass(), "paintingChild", null);
        setField(term138474, term138474.getClass(), "popupMenu", null);
        setField(term138474, term138474.getClass(), "revalidateRunnableScheduled", null);
        setField(term138474, term138474.getClass(), "focusInputMap", null);
        setField(term138474, term138474.getClass(), "ancestorInputMap", null);
        setField(term138474, term138474.getClass(), "windowInputMap", null);
        setField(term138474, term138474.getClass(), "actionMap", null);
        setField(term138474, term138474.getClass(), "aaHint", null);
        setField(term138474, term138474.getClass(), "lcdRenderingHint", null);
        setField(term138474, term138474.getClass(), "component", null);
        setField(term138474, term138474.getClass(), "layoutMgr", null);
        setField(term138474, term138474.getClass(), "dispatcher", null);
        setField(term138474, term138474.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term138474, term138474.getClass(), "focusCycleRoot", false);
        setBooleanField(term138474, term138474.getClass(), "focusTraversalPolicyProvider", false);
        setField(term138474, term138474.getClass(), "printingThreads", null);
        setBooleanField(term138474, term138474.getClass(), "printing", false);
        setField(term138474, term138474.getClass(), "containerListener", null);
        setIntField(term138474, term138474.getClass(), "listeningChildren", 0);
        setIntField(term138474, term138474.getClass(), "listeningBoundsChildren", 0);
        setIntField(term138474, term138474.getClass(), "descendantsCount", 0);
        setField(term138474, term138474.getClass(), "preserveBackgroundColor", null);
        setIntField(term138474, term138474.getClass(), "numOfHWComponents", 0);
        setIntField(term138474, term138474.getClass(), "numOfLWComponents", 0);
        setField(term138474, term138474.getClass(), "modalComp", null);
        setField(term138474, term138474.getClass(), "modalAppContext", null);
        setIntField(term138474, term138474.getClass(), "containerSerializedDataVersion", 0);
        setField(term138474, term138474.getClass(), "peer", null);
        setField(term138474, term138474.getClass(), "parent", null);
        setField(term138474, term138474.getClass(), "appContext", null);
        setIntField(term138474, term138474.getClass(), "x", 0);
        setIntField(term138474, term138474.getClass(), "y", 0);
        setIntField(term138474, term138474.getClass(), "width", 0);
        setIntField(term138474, term138474.getClass(), "height", 0);
        setField(term138474, term138474.getClass(), "foreground", null);
        setField(term138474, term138474.getClass(), "background", null);
        setField(term138474, term138474.getClass(), "font", null);
        setField(term138474, term138474.getClass(), "peerFont", null);
        setField(term138474, term138474.getClass(), "cursor", null);
        setField(term138474, term138474.getClass(), "locale", null);
        setField(term138474, term138474.getClass(), "graphicsConfig", null);
        setField(term138474, term138474.getClass(), "bufferStrategy", null);
        setBooleanField(term138474, term138474.getClass(), "ignoreRepaint", false);
        setBooleanField(term138474, term138474.getClass(), "visible", false);
        setBooleanField(term138474, term138474.getClass(), "enabled", false);
        setBooleanField(term138474, term138474.getClass(), "valid", false);
        setField(term138474, term138474.getClass(), "dropTarget", null);
        setField(term138474, term138474.getClass(), "popups", null);
        setField(term138474, term138474.getClass(), "name", null);
        setBooleanField(term138474, term138474.getClass(), "nameExplicitlySet", false);
        setBooleanField(term138474, term138474.getClass(), "focusable", false);
        setIntField(term138474, term138474.getClass(), "isFocusTraversableOverridden", 0);
        setField(term138474, term138474.getClass(), "focusTraversalKeys", null);
        setBooleanField(term138474, term138474.getClass(), "focusTraversalKeysEnabled", false);
        setField(term138474, term138474.getClass(), "acc", null);
        setField(term138474, term138474.getClass(), "minSize", null);
        setBooleanField(term138474, term138474.getClass(), "minSizeSet", false);
        setField(term138474, term138474.getClass(), "prefSize", null);
        setBooleanField(term138474, term138474.getClass(), "prefSizeSet", false);
        setField(term138474, term138474.getClass(), "maxSize", null);
        setBooleanField(term138474, term138474.getClass(), "maxSizeSet", false);
        setField(term138474, term138474.getClass(), "componentOrientation", null);
        setBooleanField(term138474, term138474.getClass(), "newEventsOnly", false);
        setField(term138474, term138474.getClass(), "componentListener", null);
        setField(term138474, term138474.getClass(), "focusListener", null);
        setField(term138474, term138474.getClass(), "hierarchyListener", null);
        setField(term138474, term138474.getClass(), "hierarchyBoundsListener", null);
        setField(term138474, term138474.getClass(), "keyListener", null);
        setField(term138474, term138474.getClass(), "mouseListener", null);
        setField(term138474, term138474.getClass(), "mouseMotionListener", null);
        setField(term138474, term138474.getClass(), "mouseWheelListener", null);
        setField(term138474, term138474.getClass(), "inputMethodListener", null);
        setLongField(term138474, term138474.getClass(), "eventMask", 0L);
        setField(term138474, term138474.getClass(), "changeSupport", null);
        setField(term138474, term138474.getClass(), "objectLock", null);
        setBooleanField(term138474, term138474.getClass(), "isPacked", false);
        setIntField(term138474, term138474.getClass(), "boundsOp", 0);
        setField(term138474, term138474.getClass(), "compoundShape", null);
        setField(term138474, term138474.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term138474, term138474.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term138474, term138474.getClass(), "backgroundEraseDisabled", false);
        setField(term138474, term138474.getClass(), "eventCache", null);
        setBooleanField(term138474, term138474.getClass(), "coalescingEnabled", false);
        setBooleanField(term138474, term138474.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term138474, term138474.getClass(), "componentSerializedDataVersion", 0);
        setField(term138474, term138474.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHistoryCultures", argTypes, term138474, args);
    }

};


