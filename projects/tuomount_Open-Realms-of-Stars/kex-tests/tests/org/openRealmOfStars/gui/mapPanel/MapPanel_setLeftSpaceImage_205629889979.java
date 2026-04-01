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

public class MapPanel_setLeftSpaceImage_205629889979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138762;

    public MapPanel_setLeftSpaceImage_205629889979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138762 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term138762, term138762.getClass(), "viewPointX", 0);
        setIntField(term138762, term138762.getClass(), "viewPointY", 0);
        setIntField(term138762, term138762.getClass(), "viewPointOffsetX", 0);
        setIntField(term138762, term138762.getClass(), "viewPointOffsetY", 0);
        setField(term138762, term138762.getClass(), "screen", null);
        setField(term138762, term138762.getClass(), "backgroundScreen", null);
        setIntField(term138762, term138762.getClass(), "flickerBlue", 0);
        setBooleanField(term138762, term138762.getClass(), "flickerGoUp", false);
        setIntField(term138762, term138762.getClass(), "lastDrawnCenterX", 0);
        setIntField(term138762, term138762.getClass(), "lastDrawnCenterY", 0);
        setField(term138762, term138762.getClass(), "route", null);
        setBooleanField(term138762, term138762.getClass(), "battle", false);
        setIntField(term138762, term138762.getClass(), "wormHoleAnimation", 0);
        setField(term138762, term138762.getClass(), "historyCultures", null);
        setBooleanField(term138762, term138762.getClass(), "historyCoordInitialized", false);
        setIntField(term138762, term138762.getClass(), "historyCoordX", 0);
        setIntField(term138762, term138762.getClass(), "historyCoordY", 0);
        setField(term138762, term138762.getClass(), "leftSpaceImage", null);
        setField(term138762, term138762.getClass(), "rightSpaceImage", null);
        setField(term138762, term138762.getClass(), "popup", null);
        setField(term138762, term138762.getClass(), "tileOverride", null);
        setField(term138762, term138762.getClass(), "redrawTile", null);
        setBooleanField(term138762, term138762.getClass(), "fullDraw", false);
        setIntField(term138762, term138762.getClass(), "cursorFocus", 0);
        setField(term138762, term138762.getClass(), "minimap", null);
        setBooleanField(term138762, term138762.getClass(), "showMiniMap", false);
        setBooleanField(term138762, term138762.getClass(), "highContrastGrid", false);
        setIntField(term138762, term138762.getClass(), "miniMapTopX", 0);
        setIntField(term138762, term138762.getClass(), "miniMapTopY", 0);
        setIntField(term138762, term138762.getClass(), "miniMapBotX", 0);
        setIntField(term138762, term138762.getClass(), "miniMapBotY", 0);
        setIntField(term138762, term138762.getClass(), "transparency", 0);
        setBooleanField(term138762, term138762.getClass(), "improvedParallax", false);
        setBooleanField(term138762, term138762.getClass(), "updateAnimation", false);
        setIntField(term138762, term138762.getClass(), "updateAnimationCount", 0);
        setBooleanField(term138762, term138762.getClass(), "drawWeaponRange", false);
        setField(term138762, term138762.getClass(), "panelType", null);
        setIntField(term138762, term138762.getClass(), "lastCursorPosX", 0);
        setIntField(term138762, term138762.getClass(), "lastCursorPosY", 0);
        setIntField(term138762, term138762.getClass(), "lastZoomLevel", 0);
        setBooleanField(term138762, term138762.getClass(), "redoViewPoints", false);
        setBooleanField(term138762, term138762.getClass(), "isAlignmentXSet", false);
        setFloatField(term138762, term138762.getClass(), "alignmentX", 0.0F);
        setBooleanField(term138762, term138762.getClass(), "isAlignmentYSet", false);
        setFloatField(term138762, term138762.getClass(), "alignmentY", 0.0F);
        setField(term138762, term138762.getClass(), "ui", null);
        setField(term138762, term138762.getClass(), "listenerList", null);
        setField(term138762, term138762.getClass(), "clientProperties", null);
        setField(term138762, term138762.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term138762, term138762.getClass(), "autoscrolls", false);
        setField(term138762, term138762.getClass(), "border", null);
        setIntField(term138762, term138762.getClass(), "flags", 0);
        setField(term138762, term138762.getClass(), "inputVerifier", null);
        setBooleanField(term138762, term138762.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term138762, term138762.getClass(), "paintingChild", null);
        setField(term138762, term138762.getClass(), "popupMenu", null);
        setField(term138762, term138762.getClass(), "revalidateRunnableScheduled", null);
        setField(term138762, term138762.getClass(), "focusInputMap", null);
        setField(term138762, term138762.getClass(), "ancestorInputMap", null);
        setField(term138762, term138762.getClass(), "windowInputMap", null);
        setField(term138762, term138762.getClass(), "actionMap", null);
        setField(term138762, term138762.getClass(), "aaHint", null);
        setField(term138762, term138762.getClass(), "lcdRenderingHint", null);
        setField(term138762, term138762.getClass(), "component", null);
        setField(term138762, term138762.getClass(), "layoutMgr", null);
        setField(term138762, term138762.getClass(), "dispatcher", null);
        setField(term138762, term138762.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term138762, term138762.getClass(), "focusCycleRoot", false);
        setBooleanField(term138762, term138762.getClass(), "focusTraversalPolicyProvider", false);
        setField(term138762, term138762.getClass(), "printingThreads", null);
        setBooleanField(term138762, term138762.getClass(), "printing", false);
        setField(term138762, term138762.getClass(), "containerListener", null);
        setIntField(term138762, term138762.getClass(), "listeningChildren", 0);
        setIntField(term138762, term138762.getClass(), "listeningBoundsChildren", 0);
        setIntField(term138762, term138762.getClass(), "descendantsCount", 0);
        setField(term138762, term138762.getClass(), "preserveBackgroundColor", null);
        setIntField(term138762, term138762.getClass(), "numOfHWComponents", 0);
        setIntField(term138762, term138762.getClass(), "numOfLWComponents", 0);
        setField(term138762, term138762.getClass(), "modalComp", null);
        setField(term138762, term138762.getClass(), "modalAppContext", null);
        setIntField(term138762, term138762.getClass(), "containerSerializedDataVersion", 0);
        setField(term138762, term138762.getClass(), "peer", null);
        setField(term138762, term138762.getClass(), "parent", null);
        setField(term138762, term138762.getClass(), "appContext", null);
        setIntField(term138762, term138762.getClass(), "x", 0);
        setIntField(term138762, term138762.getClass(), "y", 0);
        setIntField(term138762, term138762.getClass(), "width", 0);
        setIntField(term138762, term138762.getClass(), "height", 0);
        setField(term138762, term138762.getClass(), "foreground", null);
        setField(term138762, term138762.getClass(), "background", null);
        setField(term138762, term138762.getClass(), "font", null);
        setField(term138762, term138762.getClass(), "peerFont", null);
        setField(term138762, term138762.getClass(), "cursor", null);
        setField(term138762, term138762.getClass(), "locale", null);
        setField(term138762, term138762.getClass(), "graphicsConfig", null);
        setField(term138762, term138762.getClass(), "bufferStrategy", null);
        setBooleanField(term138762, term138762.getClass(), "ignoreRepaint", false);
        setBooleanField(term138762, term138762.getClass(), "visible", false);
        setBooleanField(term138762, term138762.getClass(), "enabled", false);
        setBooleanField(term138762, term138762.getClass(), "valid", false);
        setField(term138762, term138762.getClass(), "dropTarget", null);
        setField(term138762, term138762.getClass(), "popups", null);
        setField(term138762, term138762.getClass(), "name", null);
        setBooleanField(term138762, term138762.getClass(), "nameExplicitlySet", false);
        setBooleanField(term138762, term138762.getClass(), "focusable", false);
        setIntField(term138762, term138762.getClass(), "isFocusTraversableOverridden", 0);
        setField(term138762, term138762.getClass(), "focusTraversalKeys", null);
        setBooleanField(term138762, term138762.getClass(), "focusTraversalKeysEnabled", false);
        setField(term138762, term138762.getClass(), "acc", null);
        setField(term138762, term138762.getClass(), "minSize", null);
        setBooleanField(term138762, term138762.getClass(), "minSizeSet", false);
        setField(term138762, term138762.getClass(), "prefSize", null);
        setBooleanField(term138762, term138762.getClass(), "prefSizeSet", false);
        setField(term138762, term138762.getClass(), "maxSize", null);
        setBooleanField(term138762, term138762.getClass(), "maxSizeSet", false);
        setField(term138762, term138762.getClass(), "componentOrientation", null);
        setBooleanField(term138762, term138762.getClass(), "newEventsOnly", false);
        setField(term138762, term138762.getClass(), "componentListener", null);
        setField(term138762, term138762.getClass(), "focusListener", null);
        setField(term138762, term138762.getClass(), "hierarchyListener", null);
        setField(term138762, term138762.getClass(), "hierarchyBoundsListener", null);
        setField(term138762, term138762.getClass(), "keyListener", null);
        setField(term138762, term138762.getClass(), "mouseListener", null);
        setField(term138762, term138762.getClass(), "mouseMotionListener", null);
        setField(term138762, term138762.getClass(), "mouseWheelListener", null);
        setField(term138762, term138762.getClass(), "inputMethodListener", null);
        setLongField(term138762, term138762.getClass(), "eventMask", 0L);
        setField(term138762, term138762.getClass(), "changeSupport", null);
        setField(term138762, term138762.getClass(), "objectLock", null);
        setBooleanField(term138762, term138762.getClass(), "isPacked", false);
        setIntField(term138762, term138762.getClass(), "boundsOp", 0);
        setField(term138762, term138762.getClass(), "compoundShape", null);
        setField(term138762, term138762.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term138762, term138762.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term138762, term138762.getClass(), "backgroundEraseDisabled", false);
        setField(term138762, term138762.getClass(), "eventCache", null);
        setBooleanField(term138762, term138762.getClass(), "coalescingEnabled", false);
        setBooleanField(term138762, term138762.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term138762, term138762.getClass(), "componentSerializedDataVersion", 0);
        setField(term138762, term138762.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLeftSpaceImage", argTypes, term138762, args);
    }

};


