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

public class MapPanel_paint_115338923463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137610;

    public MapPanel_paint_115338923463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137610 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term137610, term137610.getClass(), "viewPointX", 0);
        setIntField(term137610, term137610.getClass(), "viewPointY", 0);
        setIntField(term137610, term137610.getClass(), "viewPointOffsetX", 0);
        setIntField(term137610, term137610.getClass(), "viewPointOffsetY", 0);
        setField(term137610, term137610.getClass(), "screen", null);
        setField(term137610, term137610.getClass(), "backgroundScreen", null);
        setIntField(term137610, term137610.getClass(), "flickerBlue", 0);
        setBooleanField(term137610, term137610.getClass(), "flickerGoUp", false);
        setIntField(term137610, term137610.getClass(), "lastDrawnCenterX", 0);
        setIntField(term137610, term137610.getClass(), "lastDrawnCenterY", 0);
        setField(term137610, term137610.getClass(), "route", null);
        setBooleanField(term137610, term137610.getClass(), "battle", false);
        setIntField(term137610, term137610.getClass(), "wormHoleAnimation", 0);
        setField(term137610, term137610.getClass(), "historyCultures", null);
        setBooleanField(term137610, term137610.getClass(), "historyCoordInitialized", false);
        setIntField(term137610, term137610.getClass(), "historyCoordX", 0);
        setIntField(term137610, term137610.getClass(), "historyCoordY", 0);
        setField(term137610, term137610.getClass(), "leftSpaceImage", null);
        setField(term137610, term137610.getClass(), "rightSpaceImage", null);
        setField(term137610, term137610.getClass(), "popup", null);
        setField(term137610, term137610.getClass(), "tileOverride", null);
        setField(term137610, term137610.getClass(), "redrawTile", null);
        setBooleanField(term137610, term137610.getClass(), "fullDraw", false);
        setIntField(term137610, term137610.getClass(), "cursorFocus", 0);
        setField(term137610, term137610.getClass(), "minimap", null);
        setBooleanField(term137610, term137610.getClass(), "showMiniMap", false);
        setBooleanField(term137610, term137610.getClass(), "highContrastGrid", false);
        setIntField(term137610, term137610.getClass(), "miniMapTopX", 0);
        setIntField(term137610, term137610.getClass(), "miniMapTopY", 0);
        setIntField(term137610, term137610.getClass(), "miniMapBotX", 0);
        setIntField(term137610, term137610.getClass(), "miniMapBotY", 0);
        setIntField(term137610, term137610.getClass(), "transparency", 0);
        setBooleanField(term137610, term137610.getClass(), "improvedParallax", false);
        setBooleanField(term137610, term137610.getClass(), "updateAnimation", false);
        setIntField(term137610, term137610.getClass(), "updateAnimationCount", 0);
        setBooleanField(term137610, term137610.getClass(), "drawWeaponRange", false);
        setField(term137610, term137610.getClass(), "panelType", null);
        setIntField(term137610, term137610.getClass(), "lastCursorPosX", 0);
        setIntField(term137610, term137610.getClass(), "lastCursorPosY", 0);
        setIntField(term137610, term137610.getClass(), "lastZoomLevel", 0);
        setBooleanField(term137610, term137610.getClass(), "redoViewPoints", false);
        setBooleanField(term137610, term137610.getClass(), "isAlignmentXSet", false);
        setFloatField(term137610, term137610.getClass(), "alignmentX", 0.0F);
        setBooleanField(term137610, term137610.getClass(), "isAlignmentYSet", false);
        setFloatField(term137610, term137610.getClass(), "alignmentY", 0.0F);
        setField(term137610, term137610.getClass(), "ui", null);
        setField(term137610, term137610.getClass(), "listenerList", null);
        setField(term137610, term137610.getClass(), "clientProperties", null);
        setField(term137610, term137610.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term137610, term137610.getClass(), "autoscrolls", false);
        setField(term137610, term137610.getClass(), "border", null);
        setIntField(term137610, term137610.getClass(), "flags", 0);
        setField(term137610, term137610.getClass(), "inputVerifier", null);
        setBooleanField(term137610, term137610.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term137610, term137610.getClass(), "paintingChild", null);
        setField(term137610, term137610.getClass(), "popupMenu", null);
        setField(term137610, term137610.getClass(), "revalidateRunnableScheduled", null);
        setField(term137610, term137610.getClass(), "focusInputMap", null);
        setField(term137610, term137610.getClass(), "ancestorInputMap", null);
        setField(term137610, term137610.getClass(), "windowInputMap", null);
        setField(term137610, term137610.getClass(), "actionMap", null);
        setField(term137610, term137610.getClass(), "aaHint", null);
        setField(term137610, term137610.getClass(), "lcdRenderingHint", null);
        setField(term137610, term137610.getClass(), "component", null);
        setField(term137610, term137610.getClass(), "layoutMgr", null);
        setField(term137610, term137610.getClass(), "dispatcher", null);
        setField(term137610, term137610.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term137610, term137610.getClass(), "focusCycleRoot", false);
        setBooleanField(term137610, term137610.getClass(), "focusTraversalPolicyProvider", false);
        setField(term137610, term137610.getClass(), "printingThreads", null);
        setBooleanField(term137610, term137610.getClass(), "printing", false);
        setField(term137610, term137610.getClass(), "containerListener", null);
        setIntField(term137610, term137610.getClass(), "listeningChildren", 0);
        setIntField(term137610, term137610.getClass(), "listeningBoundsChildren", 0);
        setIntField(term137610, term137610.getClass(), "descendantsCount", 0);
        setField(term137610, term137610.getClass(), "preserveBackgroundColor", null);
        setIntField(term137610, term137610.getClass(), "numOfHWComponents", 0);
        setIntField(term137610, term137610.getClass(), "numOfLWComponents", 0);
        setField(term137610, term137610.getClass(), "modalComp", null);
        setField(term137610, term137610.getClass(), "modalAppContext", null);
        setIntField(term137610, term137610.getClass(), "containerSerializedDataVersion", 0);
        setField(term137610, term137610.getClass(), "peer", null);
        setField(term137610, term137610.getClass(), "parent", null);
        setField(term137610, term137610.getClass(), "appContext", null);
        setIntField(term137610, term137610.getClass(), "x", 0);
        setIntField(term137610, term137610.getClass(), "y", 0);
        setIntField(term137610, term137610.getClass(), "width", 0);
        setIntField(term137610, term137610.getClass(), "height", 0);
        setField(term137610, term137610.getClass(), "foreground", null);
        setField(term137610, term137610.getClass(), "background", null);
        setField(term137610, term137610.getClass(), "font", null);
        setField(term137610, term137610.getClass(), "peerFont", null);
        setField(term137610, term137610.getClass(), "cursor", null);
        setField(term137610, term137610.getClass(), "locale", null);
        setField(term137610, term137610.getClass(), "graphicsConfig", null);
        setField(term137610, term137610.getClass(), "bufferStrategy", null);
        setBooleanField(term137610, term137610.getClass(), "ignoreRepaint", false);
        setBooleanField(term137610, term137610.getClass(), "visible", false);
        setBooleanField(term137610, term137610.getClass(), "enabled", false);
        setBooleanField(term137610, term137610.getClass(), "valid", false);
        setField(term137610, term137610.getClass(), "dropTarget", null);
        setField(term137610, term137610.getClass(), "popups", null);
        setField(term137610, term137610.getClass(), "name", null);
        setBooleanField(term137610, term137610.getClass(), "nameExplicitlySet", false);
        setBooleanField(term137610, term137610.getClass(), "focusable", false);
        setIntField(term137610, term137610.getClass(), "isFocusTraversableOverridden", 0);
        setField(term137610, term137610.getClass(), "focusTraversalKeys", null);
        setBooleanField(term137610, term137610.getClass(), "focusTraversalKeysEnabled", false);
        setField(term137610, term137610.getClass(), "acc", null);
        setField(term137610, term137610.getClass(), "minSize", null);
        setBooleanField(term137610, term137610.getClass(), "minSizeSet", false);
        setField(term137610, term137610.getClass(), "prefSize", null);
        setBooleanField(term137610, term137610.getClass(), "prefSizeSet", false);
        setField(term137610, term137610.getClass(), "maxSize", null);
        setBooleanField(term137610, term137610.getClass(), "maxSizeSet", false);
        setField(term137610, term137610.getClass(), "componentOrientation", null);
        setBooleanField(term137610, term137610.getClass(), "newEventsOnly", false);
        setField(term137610, term137610.getClass(), "componentListener", null);
        setField(term137610, term137610.getClass(), "focusListener", null);
        setField(term137610, term137610.getClass(), "hierarchyListener", null);
        setField(term137610, term137610.getClass(), "hierarchyBoundsListener", null);
        setField(term137610, term137610.getClass(), "keyListener", null);
        setField(term137610, term137610.getClass(), "mouseListener", null);
        setField(term137610, term137610.getClass(), "mouseMotionListener", null);
        setField(term137610, term137610.getClass(), "mouseWheelListener", null);
        setField(term137610, term137610.getClass(), "inputMethodListener", null);
        setLongField(term137610, term137610.getClass(), "eventMask", 0L);
        setField(term137610, term137610.getClass(), "changeSupport", null);
        setField(term137610, term137610.getClass(), "objectLock", null);
        setBooleanField(term137610, term137610.getClass(), "isPacked", false);
        setIntField(term137610, term137610.getClass(), "boundsOp", 0);
        setField(term137610, term137610.getClass(), "compoundShape", null);
        setField(term137610, term137610.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term137610, term137610.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term137610, term137610.getClass(), "backgroundEraseDisabled", false);
        setField(term137610, term137610.getClass(), "eventCache", null);
        setBooleanField(term137610, term137610.getClass(), "coalescingEnabled", false);
        setBooleanField(term137610, term137610.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term137610, term137610.getClass(), "componentSerializedDataVersion", 0);
        setField(term137610, term137610.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paint", argTypes, term137610, args);
    }

};


