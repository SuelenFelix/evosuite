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

public class MapPanel_getRightSpaceImage_45070690480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138833;

    public MapPanel_getRightSpaceImage_45070690480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138833 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term138833, term138833.getClass(), "viewPointX", 0);
        setIntField(term138833, term138833.getClass(), "viewPointY", 0);
        setIntField(term138833, term138833.getClass(), "viewPointOffsetX", 0);
        setIntField(term138833, term138833.getClass(), "viewPointOffsetY", 0);
        setField(term138833, term138833.getClass(), "screen", null);
        setField(term138833, term138833.getClass(), "backgroundScreen", null);
        setIntField(term138833, term138833.getClass(), "flickerBlue", 0);
        setBooleanField(term138833, term138833.getClass(), "flickerGoUp", false);
        setIntField(term138833, term138833.getClass(), "lastDrawnCenterX", 0);
        setIntField(term138833, term138833.getClass(), "lastDrawnCenterY", 0);
        setField(term138833, term138833.getClass(), "route", null);
        setBooleanField(term138833, term138833.getClass(), "battle", false);
        setIntField(term138833, term138833.getClass(), "wormHoleAnimation", 0);
        setField(term138833, term138833.getClass(), "historyCultures", null);
        setBooleanField(term138833, term138833.getClass(), "historyCoordInitialized", false);
        setIntField(term138833, term138833.getClass(), "historyCoordX", 0);
        setIntField(term138833, term138833.getClass(), "historyCoordY", 0);
        setField(term138833, term138833.getClass(), "leftSpaceImage", null);
        setField(term138833, term138833.getClass(), "rightSpaceImage", null);
        setField(term138833, term138833.getClass(), "popup", null);
        setField(term138833, term138833.getClass(), "tileOverride", null);
        setField(term138833, term138833.getClass(), "redrawTile", null);
        setBooleanField(term138833, term138833.getClass(), "fullDraw", false);
        setIntField(term138833, term138833.getClass(), "cursorFocus", 0);
        setField(term138833, term138833.getClass(), "minimap", null);
        setBooleanField(term138833, term138833.getClass(), "showMiniMap", false);
        setBooleanField(term138833, term138833.getClass(), "highContrastGrid", false);
        setIntField(term138833, term138833.getClass(), "miniMapTopX", 0);
        setIntField(term138833, term138833.getClass(), "miniMapTopY", 0);
        setIntField(term138833, term138833.getClass(), "miniMapBotX", 0);
        setIntField(term138833, term138833.getClass(), "miniMapBotY", 0);
        setIntField(term138833, term138833.getClass(), "transparency", 0);
        setBooleanField(term138833, term138833.getClass(), "improvedParallax", false);
        setBooleanField(term138833, term138833.getClass(), "updateAnimation", false);
        setIntField(term138833, term138833.getClass(), "updateAnimationCount", 0);
        setBooleanField(term138833, term138833.getClass(), "drawWeaponRange", false);
        setField(term138833, term138833.getClass(), "panelType", null);
        setIntField(term138833, term138833.getClass(), "lastCursorPosX", 0);
        setIntField(term138833, term138833.getClass(), "lastCursorPosY", 0);
        setIntField(term138833, term138833.getClass(), "lastZoomLevel", 0);
        setBooleanField(term138833, term138833.getClass(), "redoViewPoints", false);
        setBooleanField(term138833, term138833.getClass(), "isAlignmentXSet", false);
        setFloatField(term138833, term138833.getClass(), "alignmentX", 0.0F);
        setBooleanField(term138833, term138833.getClass(), "isAlignmentYSet", false);
        setFloatField(term138833, term138833.getClass(), "alignmentY", 0.0F);
        setField(term138833, term138833.getClass(), "ui", null);
        setField(term138833, term138833.getClass(), "listenerList", null);
        setField(term138833, term138833.getClass(), "clientProperties", null);
        setField(term138833, term138833.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term138833, term138833.getClass(), "autoscrolls", false);
        setField(term138833, term138833.getClass(), "border", null);
        setIntField(term138833, term138833.getClass(), "flags", 0);
        setField(term138833, term138833.getClass(), "inputVerifier", null);
        setBooleanField(term138833, term138833.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term138833, term138833.getClass(), "paintingChild", null);
        setField(term138833, term138833.getClass(), "popupMenu", null);
        setField(term138833, term138833.getClass(), "revalidateRunnableScheduled", null);
        setField(term138833, term138833.getClass(), "focusInputMap", null);
        setField(term138833, term138833.getClass(), "ancestorInputMap", null);
        setField(term138833, term138833.getClass(), "windowInputMap", null);
        setField(term138833, term138833.getClass(), "actionMap", null);
        setField(term138833, term138833.getClass(), "aaHint", null);
        setField(term138833, term138833.getClass(), "lcdRenderingHint", null);
        setField(term138833, term138833.getClass(), "component", null);
        setField(term138833, term138833.getClass(), "layoutMgr", null);
        setField(term138833, term138833.getClass(), "dispatcher", null);
        setField(term138833, term138833.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term138833, term138833.getClass(), "focusCycleRoot", false);
        setBooleanField(term138833, term138833.getClass(), "focusTraversalPolicyProvider", false);
        setField(term138833, term138833.getClass(), "printingThreads", null);
        setBooleanField(term138833, term138833.getClass(), "printing", false);
        setField(term138833, term138833.getClass(), "containerListener", null);
        setIntField(term138833, term138833.getClass(), "listeningChildren", 0);
        setIntField(term138833, term138833.getClass(), "listeningBoundsChildren", 0);
        setIntField(term138833, term138833.getClass(), "descendantsCount", 0);
        setField(term138833, term138833.getClass(), "preserveBackgroundColor", null);
        setIntField(term138833, term138833.getClass(), "numOfHWComponents", 0);
        setIntField(term138833, term138833.getClass(), "numOfLWComponents", 0);
        setField(term138833, term138833.getClass(), "modalComp", null);
        setField(term138833, term138833.getClass(), "modalAppContext", null);
        setIntField(term138833, term138833.getClass(), "containerSerializedDataVersion", 0);
        setField(term138833, term138833.getClass(), "peer", null);
        setField(term138833, term138833.getClass(), "parent", null);
        setField(term138833, term138833.getClass(), "appContext", null);
        setIntField(term138833, term138833.getClass(), "x", 0);
        setIntField(term138833, term138833.getClass(), "y", 0);
        setIntField(term138833, term138833.getClass(), "width", 0);
        setIntField(term138833, term138833.getClass(), "height", 0);
        setField(term138833, term138833.getClass(), "foreground", null);
        setField(term138833, term138833.getClass(), "background", null);
        setField(term138833, term138833.getClass(), "font", null);
        setField(term138833, term138833.getClass(), "peerFont", null);
        setField(term138833, term138833.getClass(), "cursor", null);
        setField(term138833, term138833.getClass(), "locale", null);
        setField(term138833, term138833.getClass(), "graphicsConfig", null);
        setField(term138833, term138833.getClass(), "bufferStrategy", null);
        setBooleanField(term138833, term138833.getClass(), "ignoreRepaint", false);
        setBooleanField(term138833, term138833.getClass(), "visible", false);
        setBooleanField(term138833, term138833.getClass(), "enabled", false);
        setBooleanField(term138833, term138833.getClass(), "valid", false);
        setField(term138833, term138833.getClass(), "dropTarget", null);
        setField(term138833, term138833.getClass(), "popups", null);
        setField(term138833, term138833.getClass(), "name", null);
        setBooleanField(term138833, term138833.getClass(), "nameExplicitlySet", false);
        setBooleanField(term138833, term138833.getClass(), "focusable", false);
        setIntField(term138833, term138833.getClass(), "isFocusTraversableOverridden", 0);
        setField(term138833, term138833.getClass(), "focusTraversalKeys", null);
        setBooleanField(term138833, term138833.getClass(), "focusTraversalKeysEnabled", false);
        setField(term138833, term138833.getClass(), "acc", null);
        setField(term138833, term138833.getClass(), "minSize", null);
        setBooleanField(term138833, term138833.getClass(), "minSizeSet", false);
        setField(term138833, term138833.getClass(), "prefSize", null);
        setBooleanField(term138833, term138833.getClass(), "prefSizeSet", false);
        setField(term138833, term138833.getClass(), "maxSize", null);
        setBooleanField(term138833, term138833.getClass(), "maxSizeSet", false);
        setField(term138833, term138833.getClass(), "componentOrientation", null);
        setBooleanField(term138833, term138833.getClass(), "newEventsOnly", false);
        setField(term138833, term138833.getClass(), "componentListener", null);
        setField(term138833, term138833.getClass(), "focusListener", null);
        setField(term138833, term138833.getClass(), "hierarchyListener", null);
        setField(term138833, term138833.getClass(), "hierarchyBoundsListener", null);
        setField(term138833, term138833.getClass(), "keyListener", null);
        setField(term138833, term138833.getClass(), "mouseListener", null);
        setField(term138833, term138833.getClass(), "mouseMotionListener", null);
        setField(term138833, term138833.getClass(), "mouseWheelListener", null);
        setField(term138833, term138833.getClass(), "inputMethodListener", null);
        setLongField(term138833, term138833.getClass(), "eventMask", 0L);
        setField(term138833, term138833.getClass(), "changeSupport", null);
        setField(term138833, term138833.getClass(), "objectLock", null);
        setBooleanField(term138833, term138833.getClass(), "isPacked", false);
        setIntField(term138833, term138833.getClass(), "boundsOp", 0);
        setField(term138833, term138833.getClass(), "compoundShape", null);
        setField(term138833, term138833.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term138833, term138833.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term138833, term138833.getClass(), "backgroundEraseDisabled", false);
        setField(term138833, term138833.getClass(), "eventCache", null);
        setBooleanField(term138833, term138833.getClass(), "coalescingEnabled", false);
        setBooleanField(term138833, term138833.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term138833, term138833.getClass(), "componentSerializedDataVersion", 0);
        setField(term138833, term138833.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRightSpaceImage", argTypes, term138833, args);
    }

};


