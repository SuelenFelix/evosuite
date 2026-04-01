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

public class MapPanel_calculateViewPoints_14211008561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137462;

    public MapPanel_calculateViewPoints_14211008561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137462 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term137462, term137462.getClass(), "viewPointX", 0);
        setIntField(term137462, term137462.getClass(), "viewPointY", 0);
        setIntField(term137462, term137462.getClass(), "viewPointOffsetX", 0);
        setIntField(term137462, term137462.getClass(), "viewPointOffsetY", 0);
        setField(term137462, term137462.getClass(), "screen", null);
        setField(term137462, term137462.getClass(), "backgroundScreen", null);
        setIntField(term137462, term137462.getClass(), "flickerBlue", 0);
        setBooleanField(term137462, term137462.getClass(), "flickerGoUp", false);
        setIntField(term137462, term137462.getClass(), "lastDrawnCenterX", 0);
        setIntField(term137462, term137462.getClass(), "lastDrawnCenterY", 0);
        setField(term137462, term137462.getClass(), "route", null);
        setBooleanField(term137462, term137462.getClass(), "battle", false);
        setIntField(term137462, term137462.getClass(), "wormHoleAnimation", 0);
        setField(term137462, term137462.getClass(), "historyCultures", null);
        setBooleanField(term137462, term137462.getClass(), "historyCoordInitialized", false);
        setIntField(term137462, term137462.getClass(), "historyCoordX", 0);
        setIntField(term137462, term137462.getClass(), "historyCoordY", 0);
        setField(term137462, term137462.getClass(), "leftSpaceImage", null);
        setField(term137462, term137462.getClass(), "rightSpaceImage", null);
        setField(term137462, term137462.getClass(), "popup", null);
        setField(term137462, term137462.getClass(), "tileOverride", null);
        setField(term137462, term137462.getClass(), "redrawTile", null);
        setBooleanField(term137462, term137462.getClass(), "fullDraw", false);
        setIntField(term137462, term137462.getClass(), "cursorFocus", 0);
        setField(term137462, term137462.getClass(), "minimap", null);
        setBooleanField(term137462, term137462.getClass(), "showMiniMap", false);
        setBooleanField(term137462, term137462.getClass(), "highContrastGrid", false);
        setIntField(term137462, term137462.getClass(), "miniMapTopX", 0);
        setIntField(term137462, term137462.getClass(), "miniMapTopY", 0);
        setIntField(term137462, term137462.getClass(), "miniMapBotX", 0);
        setIntField(term137462, term137462.getClass(), "miniMapBotY", 0);
        setIntField(term137462, term137462.getClass(), "transparency", 0);
        setBooleanField(term137462, term137462.getClass(), "improvedParallax", false);
        setBooleanField(term137462, term137462.getClass(), "updateAnimation", false);
        setIntField(term137462, term137462.getClass(), "updateAnimationCount", 0);
        setBooleanField(term137462, term137462.getClass(), "drawWeaponRange", false);
        setField(term137462, term137462.getClass(), "panelType", null);
        setIntField(term137462, term137462.getClass(), "lastCursorPosX", 0);
        setIntField(term137462, term137462.getClass(), "lastCursorPosY", 0);
        setIntField(term137462, term137462.getClass(), "lastZoomLevel", 0);
        setBooleanField(term137462, term137462.getClass(), "redoViewPoints", false);
        setBooleanField(term137462, term137462.getClass(), "isAlignmentXSet", false);
        setFloatField(term137462, term137462.getClass(), "alignmentX", 0.0F);
        setBooleanField(term137462, term137462.getClass(), "isAlignmentYSet", false);
        setFloatField(term137462, term137462.getClass(), "alignmentY", 0.0F);
        setField(term137462, term137462.getClass(), "ui", null);
        setField(term137462, term137462.getClass(), "listenerList", null);
        setField(term137462, term137462.getClass(), "clientProperties", null);
        setField(term137462, term137462.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term137462, term137462.getClass(), "autoscrolls", false);
        setField(term137462, term137462.getClass(), "border", null);
        setIntField(term137462, term137462.getClass(), "flags", 0);
        setField(term137462, term137462.getClass(), "inputVerifier", null);
        setBooleanField(term137462, term137462.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term137462, term137462.getClass(), "paintingChild", null);
        setField(term137462, term137462.getClass(), "popupMenu", null);
        setField(term137462, term137462.getClass(), "revalidateRunnableScheduled", null);
        setField(term137462, term137462.getClass(), "focusInputMap", null);
        setField(term137462, term137462.getClass(), "ancestorInputMap", null);
        setField(term137462, term137462.getClass(), "windowInputMap", null);
        setField(term137462, term137462.getClass(), "actionMap", null);
        setField(term137462, term137462.getClass(), "aaHint", null);
        setField(term137462, term137462.getClass(), "lcdRenderingHint", null);
        setField(term137462, term137462.getClass(), "component", null);
        setField(term137462, term137462.getClass(), "layoutMgr", null);
        setField(term137462, term137462.getClass(), "dispatcher", null);
        setField(term137462, term137462.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term137462, term137462.getClass(), "focusCycleRoot", false);
        setBooleanField(term137462, term137462.getClass(), "focusTraversalPolicyProvider", false);
        setField(term137462, term137462.getClass(), "printingThreads", null);
        setBooleanField(term137462, term137462.getClass(), "printing", false);
        setField(term137462, term137462.getClass(), "containerListener", null);
        setIntField(term137462, term137462.getClass(), "listeningChildren", 0);
        setIntField(term137462, term137462.getClass(), "listeningBoundsChildren", 0);
        setIntField(term137462, term137462.getClass(), "descendantsCount", 0);
        setField(term137462, term137462.getClass(), "preserveBackgroundColor", null);
        setIntField(term137462, term137462.getClass(), "numOfHWComponents", 0);
        setIntField(term137462, term137462.getClass(), "numOfLWComponents", 0);
        setField(term137462, term137462.getClass(), "modalComp", null);
        setField(term137462, term137462.getClass(), "modalAppContext", null);
        setIntField(term137462, term137462.getClass(), "containerSerializedDataVersion", 0);
        setField(term137462, term137462.getClass(), "peer", null);
        setField(term137462, term137462.getClass(), "parent", null);
        setField(term137462, term137462.getClass(), "appContext", null);
        setIntField(term137462, term137462.getClass(), "x", 0);
        setIntField(term137462, term137462.getClass(), "y", 0);
        setIntField(term137462, term137462.getClass(), "width", 0);
        setIntField(term137462, term137462.getClass(), "height", 0);
        setField(term137462, term137462.getClass(), "foreground", null);
        setField(term137462, term137462.getClass(), "background", null);
        setField(term137462, term137462.getClass(), "font", null);
        setField(term137462, term137462.getClass(), "peerFont", null);
        setField(term137462, term137462.getClass(), "cursor", null);
        setField(term137462, term137462.getClass(), "locale", null);
        setField(term137462, term137462.getClass(), "graphicsConfig", null);
        setField(term137462, term137462.getClass(), "bufferStrategy", null);
        setBooleanField(term137462, term137462.getClass(), "ignoreRepaint", false);
        setBooleanField(term137462, term137462.getClass(), "visible", false);
        setBooleanField(term137462, term137462.getClass(), "enabled", false);
        setBooleanField(term137462, term137462.getClass(), "valid", false);
        setField(term137462, term137462.getClass(), "dropTarget", null);
        setField(term137462, term137462.getClass(), "popups", null);
        setField(term137462, term137462.getClass(), "name", null);
        setBooleanField(term137462, term137462.getClass(), "nameExplicitlySet", false);
        setBooleanField(term137462, term137462.getClass(), "focusable", false);
        setIntField(term137462, term137462.getClass(), "isFocusTraversableOverridden", 0);
        setField(term137462, term137462.getClass(), "focusTraversalKeys", null);
        setBooleanField(term137462, term137462.getClass(), "focusTraversalKeysEnabled", false);
        setField(term137462, term137462.getClass(), "acc", null);
        setField(term137462, term137462.getClass(), "minSize", null);
        setBooleanField(term137462, term137462.getClass(), "minSizeSet", false);
        setField(term137462, term137462.getClass(), "prefSize", null);
        setBooleanField(term137462, term137462.getClass(), "prefSizeSet", false);
        setField(term137462, term137462.getClass(), "maxSize", null);
        setBooleanField(term137462, term137462.getClass(), "maxSizeSet", false);
        setField(term137462, term137462.getClass(), "componentOrientation", null);
        setBooleanField(term137462, term137462.getClass(), "newEventsOnly", false);
        setField(term137462, term137462.getClass(), "componentListener", null);
        setField(term137462, term137462.getClass(), "focusListener", null);
        setField(term137462, term137462.getClass(), "hierarchyListener", null);
        setField(term137462, term137462.getClass(), "hierarchyBoundsListener", null);
        setField(term137462, term137462.getClass(), "keyListener", null);
        setField(term137462, term137462.getClass(), "mouseListener", null);
        setField(term137462, term137462.getClass(), "mouseMotionListener", null);
        setField(term137462, term137462.getClass(), "mouseWheelListener", null);
        setField(term137462, term137462.getClass(), "inputMethodListener", null);
        setLongField(term137462, term137462.getClass(), "eventMask", 0L);
        setField(term137462, term137462.getClass(), "changeSupport", null);
        setField(term137462, term137462.getClass(), "objectLock", null);
        setBooleanField(term137462, term137462.getClass(), "isPacked", false);
        setIntField(term137462, term137462.getClass(), "boundsOp", 0);
        setField(term137462, term137462.getClass(), "compoundShape", null);
        setField(term137462, term137462.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term137462, term137462.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term137462, term137462.getClass(), "backgroundEraseDisabled", false);
        setField(term137462, term137462.getClass(), "eventCache", null);
        setBooleanField(term137462, term137462.getClass(), "coalescingEnabled", false);
        setBooleanField(term137462, term137462.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term137462, term137462.getClass(), "componentSerializedDataVersion", 0);
        setField(term137462, term137462.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateViewPoints", argTypes, term137462, args);
    }

};


