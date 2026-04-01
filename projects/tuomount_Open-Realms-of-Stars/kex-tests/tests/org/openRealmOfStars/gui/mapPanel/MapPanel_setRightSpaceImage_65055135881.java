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

public class MapPanel_setRightSpaceImage_65055135881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138904;

    public MapPanel_setRightSpaceImage_65055135881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138904 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term138904, term138904.getClass(), "viewPointX", 0);
        setIntField(term138904, term138904.getClass(), "viewPointY", 0);
        setIntField(term138904, term138904.getClass(), "viewPointOffsetX", 0);
        setIntField(term138904, term138904.getClass(), "viewPointOffsetY", 0);
        setField(term138904, term138904.getClass(), "screen", null);
        setField(term138904, term138904.getClass(), "backgroundScreen", null);
        setIntField(term138904, term138904.getClass(), "flickerBlue", 0);
        setBooleanField(term138904, term138904.getClass(), "flickerGoUp", false);
        setIntField(term138904, term138904.getClass(), "lastDrawnCenterX", 0);
        setIntField(term138904, term138904.getClass(), "lastDrawnCenterY", 0);
        setField(term138904, term138904.getClass(), "route", null);
        setBooleanField(term138904, term138904.getClass(), "battle", false);
        setIntField(term138904, term138904.getClass(), "wormHoleAnimation", 0);
        setField(term138904, term138904.getClass(), "historyCultures", null);
        setBooleanField(term138904, term138904.getClass(), "historyCoordInitialized", false);
        setIntField(term138904, term138904.getClass(), "historyCoordX", 0);
        setIntField(term138904, term138904.getClass(), "historyCoordY", 0);
        setField(term138904, term138904.getClass(), "leftSpaceImage", null);
        setField(term138904, term138904.getClass(), "rightSpaceImage", null);
        setField(term138904, term138904.getClass(), "popup", null);
        setField(term138904, term138904.getClass(), "tileOverride", null);
        setField(term138904, term138904.getClass(), "redrawTile", null);
        setBooleanField(term138904, term138904.getClass(), "fullDraw", false);
        setIntField(term138904, term138904.getClass(), "cursorFocus", 0);
        setField(term138904, term138904.getClass(), "minimap", null);
        setBooleanField(term138904, term138904.getClass(), "showMiniMap", false);
        setBooleanField(term138904, term138904.getClass(), "highContrastGrid", false);
        setIntField(term138904, term138904.getClass(), "miniMapTopX", 0);
        setIntField(term138904, term138904.getClass(), "miniMapTopY", 0);
        setIntField(term138904, term138904.getClass(), "miniMapBotX", 0);
        setIntField(term138904, term138904.getClass(), "miniMapBotY", 0);
        setIntField(term138904, term138904.getClass(), "transparency", 0);
        setBooleanField(term138904, term138904.getClass(), "improvedParallax", false);
        setBooleanField(term138904, term138904.getClass(), "updateAnimation", false);
        setIntField(term138904, term138904.getClass(), "updateAnimationCount", 0);
        setBooleanField(term138904, term138904.getClass(), "drawWeaponRange", false);
        setField(term138904, term138904.getClass(), "panelType", null);
        setIntField(term138904, term138904.getClass(), "lastCursorPosX", 0);
        setIntField(term138904, term138904.getClass(), "lastCursorPosY", 0);
        setIntField(term138904, term138904.getClass(), "lastZoomLevel", 0);
        setBooleanField(term138904, term138904.getClass(), "redoViewPoints", false);
        setBooleanField(term138904, term138904.getClass(), "isAlignmentXSet", false);
        setFloatField(term138904, term138904.getClass(), "alignmentX", 0.0F);
        setBooleanField(term138904, term138904.getClass(), "isAlignmentYSet", false);
        setFloatField(term138904, term138904.getClass(), "alignmentY", 0.0F);
        setField(term138904, term138904.getClass(), "ui", null);
        setField(term138904, term138904.getClass(), "listenerList", null);
        setField(term138904, term138904.getClass(), "clientProperties", null);
        setField(term138904, term138904.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term138904, term138904.getClass(), "autoscrolls", false);
        setField(term138904, term138904.getClass(), "border", null);
        setIntField(term138904, term138904.getClass(), "flags", 0);
        setField(term138904, term138904.getClass(), "inputVerifier", null);
        setBooleanField(term138904, term138904.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term138904, term138904.getClass(), "paintingChild", null);
        setField(term138904, term138904.getClass(), "popupMenu", null);
        setField(term138904, term138904.getClass(), "revalidateRunnableScheduled", null);
        setField(term138904, term138904.getClass(), "focusInputMap", null);
        setField(term138904, term138904.getClass(), "ancestorInputMap", null);
        setField(term138904, term138904.getClass(), "windowInputMap", null);
        setField(term138904, term138904.getClass(), "actionMap", null);
        setField(term138904, term138904.getClass(), "aaHint", null);
        setField(term138904, term138904.getClass(), "lcdRenderingHint", null);
        setField(term138904, term138904.getClass(), "component", null);
        setField(term138904, term138904.getClass(), "layoutMgr", null);
        setField(term138904, term138904.getClass(), "dispatcher", null);
        setField(term138904, term138904.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term138904, term138904.getClass(), "focusCycleRoot", false);
        setBooleanField(term138904, term138904.getClass(), "focusTraversalPolicyProvider", false);
        setField(term138904, term138904.getClass(), "printingThreads", null);
        setBooleanField(term138904, term138904.getClass(), "printing", false);
        setField(term138904, term138904.getClass(), "containerListener", null);
        setIntField(term138904, term138904.getClass(), "listeningChildren", 0);
        setIntField(term138904, term138904.getClass(), "listeningBoundsChildren", 0);
        setIntField(term138904, term138904.getClass(), "descendantsCount", 0);
        setField(term138904, term138904.getClass(), "preserveBackgroundColor", null);
        setIntField(term138904, term138904.getClass(), "numOfHWComponents", 0);
        setIntField(term138904, term138904.getClass(), "numOfLWComponents", 0);
        setField(term138904, term138904.getClass(), "modalComp", null);
        setField(term138904, term138904.getClass(), "modalAppContext", null);
        setIntField(term138904, term138904.getClass(), "containerSerializedDataVersion", 0);
        setField(term138904, term138904.getClass(), "peer", null);
        setField(term138904, term138904.getClass(), "parent", null);
        setField(term138904, term138904.getClass(), "appContext", null);
        setIntField(term138904, term138904.getClass(), "x", 0);
        setIntField(term138904, term138904.getClass(), "y", 0);
        setIntField(term138904, term138904.getClass(), "width", 0);
        setIntField(term138904, term138904.getClass(), "height", 0);
        setField(term138904, term138904.getClass(), "foreground", null);
        setField(term138904, term138904.getClass(), "background", null);
        setField(term138904, term138904.getClass(), "font", null);
        setField(term138904, term138904.getClass(), "peerFont", null);
        setField(term138904, term138904.getClass(), "cursor", null);
        setField(term138904, term138904.getClass(), "locale", null);
        setField(term138904, term138904.getClass(), "graphicsConfig", null);
        setField(term138904, term138904.getClass(), "bufferStrategy", null);
        setBooleanField(term138904, term138904.getClass(), "ignoreRepaint", false);
        setBooleanField(term138904, term138904.getClass(), "visible", false);
        setBooleanField(term138904, term138904.getClass(), "enabled", false);
        setBooleanField(term138904, term138904.getClass(), "valid", false);
        setField(term138904, term138904.getClass(), "dropTarget", null);
        setField(term138904, term138904.getClass(), "popups", null);
        setField(term138904, term138904.getClass(), "name", null);
        setBooleanField(term138904, term138904.getClass(), "nameExplicitlySet", false);
        setBooleanField(term138904, term138904.getClass(), "focusable", false);
        setIntField(term138904, term138904.getClass(), "isFocusTraversableOverridden", 0);
        setField(term138904, term138904.getClass(), "focusTraversalKeys", null);
        setBooleanField(term138904, term138904.getClass(), "focusTraversalKeysEnabled", false);
        setField(term138904, term138904.getClass(), "acc", null);
        setField(term138904, term138904.getClass(), "minSize", null);
        setBooleanField(term138904, term138904.getClass(), "minSizeSet", false);
        setField(term138904, term138904.getClass(), "prefSize", null);
        setBooleanField(term138904, term138904.getClass(), "prefSizeSet", false);
        setField(term138904, term138904.getClass(), "maxSize", null);
        setBooleanField(term138904, term138904.getClass(), "maxSizeSet", false);
        setField(term138904, term138904.getClass(), "componentOrientation", null);
        setBooleanField(term138904, term138904.getClass(), "newEventsOnly", false);
        setField(term138904, term138904.getClass(), "componentListener", null);
        setField(term138904, term138904.getClass(), "focusListener", null);
        setField(term138904, term138904.getClass(), "hierarchyListener", null);
        setField(term138904, term138904.getClass(), "hierarchyBoundsListener", null);
        setField(term138904, term138904.getClass(), "keyListener", null);
        setField(term138904, term138904.getClass(), "mouseListener", null);
        setField(term138904, term138904.getClass(), "mouseMotionListener", null);
        setField(term138904, term138904.getClass(), "mouseWheelListener", null);
        setField(term138904, term138904.getClass(), "inputMethodListener", null);
        setLongField(term138904, term138904.getClass(), "eventMask", 0L);
        setField(term138904, term138904.getClass(), "changeSupport", null);
        setField(term138904, term138904.getClass(), "objectLock", null);
        setBooleanField(term138904, term138904.getClass(), "isPacked", false);
        setIntField(term138904, term138904.getClass(), "boundsOp", 0);
        setField(term138904, term138904.getClass(), "compoundShape", null);
        setField(term138904, term138904.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term138904, term138904.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term138904, term138904.getClass(), "backgroundEraseDisabled", false);
        setField(term138904, term138904.getClass(), "eventCache", null);
        setBooleanField(term138904, term138904.getClass(), "coalescingEnabled", false);
        setBooleanField(term138904, term138904.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term138904, term138904.getClass(), "componentSerializedDataVersion", 0);
        setField(term138904, term138904.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRightSpaceImage", argTypes, term138904, args);
    }

};


