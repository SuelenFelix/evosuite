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

public class MapPanel_getRoute_170104640573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138332;

    public MapPanel_getRoute_170104640573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138332 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term138332, term138332.getClass(), "viewPointX", 0);
        setIntField(term138332, term138332.getClass(), "viewPointY", 0);
        setIntField(term138332, term138332.getClass(), "viewPointOffsetX", 0);
        setIntField(term138332, term138332.getClass(), "viewPointOffsetY", 0);
        setField(term138332, term138332.getClass(), "screen", null);
        setField(term138332, term138332.getClass(), "backgroundScreen", null);
        setIntField(term138332, term138332.getClass(), "flickerBlue", 0);
        setBooleanField(term138332, term138332.getClass(), "flickerGoUp", false);
        setIntField(term138332, term138332.getClass(), "lastDrawnCenterX", 0);
        setIntField(term138332, term138332.getClass(), "lastDrawnCenterY", 0);
        setField(term138332, term138332.getClass(), "route", null);
        setBooleanField(term138332, term138332.getClass(), "battle", false);
        setIntField(term138332, term138332.getClass(), "wormHoleAnimation", 0);
        setField(term138332, term138332.getClass(), "historyCultures", null);
        setBooleanField(term138332, term138332.getClass(), "historyCoordInitialized", false);
        setIntField(term138332, term138332.getClass(), "historyCoordX", 0);
        setIntField(term138332, term138332.getClass(), "historyCoordY", 0);
        setField(term138332, term138332.getClass(), "leftSpaceImage", null);
        setField(term138332, term138332.getClass(), "rightSpaceImage", null);
        setField(term138332, term138332.getClass(), "popup", null);
        setField(term138332, term138332.getClass(), "tileOverride", null);
        setField(term138332, term138332.getClass(), "redrawTile", null);
        setBooleanField(term138332, term138332.getClass(), "fullDraw", false);
        setIntField(term138332, term138332.getClass(), "cursorFocus", 0);
        setField(term138332, term138332.getClass(), "minimap", null);
        setBooleanField(term138332, term138332.getClass(), "showMiniMap", false);
        setBooleanField(term138332, term138332.getClass(), "highContrastGrid", false);
        setIntField(term138332, term138332.getClass(), "miniMapTopX", 0);
        setIntField(term138332, term138332.getClass(), "miniMapTopY", 0);
        setIntField(term138332, term138332.getClass(), "miniMapBotX", 0);
        setIntField(term138332, term138332.getClass(), "miniMapBotY", 0);
        setIntField(term138332, term138332.getClass(), "transparency", 0);
        setBooleanField(term138332, term138332.getClass(), "improvedParallax", false);
        setBooleanField(term138332, term138332.getClass(), "updateAnimation", false);
        setIntField(term138332, term138332.getClass(), "updateAnimationCount", 0);
        setBooleanField(term138332, term138332.getClass(), "drawWeaponRange", false);
        setField(term138332, term138332.getClass(), "panelType", null);
        setIntField(term138332, term138332.getClass(), "lastCursorPosX", 0);
        setIntField(term138332, term138332.getClass(), "lastCursorPosY", 0);
        setIntField(term138332, term138332.getClass(), "lastZoomLevel", 0);
        setBooleanField(term138332, term138332.getClass(), "redoViewPoints", false);
        setBooleanField(term138332, term138332.getClass(), "isAlignmentXSet", false);
        setFloatField(term138332, term138332.getClass(), "alignmentX", 0.0F);
        setBooleanField(term138332, term138332.getClass(), "isAlignmentYSet", false);
        setFloatField(term138332, term138332.getClass(), "alignmentY", 0.0F);
        setField(term138332, term138332.getClass(), "ui", null);
        setField(term138332, term138332.getClass(), "listenerList", null);
        setField(term138332, term138332.getClass(), "clientProperties", null);
        setField(term138332, term138332.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term138332, term138332.getClass(), "autoscrolls", false);
        setField(term138332, term138332.getClass(), "border", null);
        setIntField(term138332, term138332.getClass(), "flags", 0);
        setField(term138332, term138332.getClass(), "inputVerifier", null);
        setBooleanField(term138332, term138332.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term138332, term138332.getClass(), "paintingChild", null);
        setField(term138332, term138332.getClass(), "popupMenu", null);
        setField(term138332, term138332.getClass(), "revalidateRunnableScheduled", null);
        setField(term138332, term138332.getClass(), "focusInputMap", null);
        setField(term138332, term138332.getClass(), "ancestorInputMap", null);
        setField(term138332, term138332.getClass(), "windowInputMap", null);
        setField(term138332, term138332.getClass(), "actionMap", null);
        setField(term138332, term138332.getClass(), "aaHint", null);
        setField(term138332, term138332.getClass(), "lcdRenderingHint", null);
        setField(term138332, term138332.getClass(), "component", null);
        setField(term138332, term138332.getClass(), "layoutMgr", null);
        setField(term138332, term138332.getClass(), "dispatcher", null);
        setField(term138332, term138332.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term138332, term138332.getClass(), "focusCycleRoot", false);
        setBooleanField(term138332, term138332.getClass(), "focusTraversalPolicyProvider", false);
        setField(term138332, term138332.getClass(), "printingThreads", null);
        setBooleanField(term138332, term138332.getClass(), "printing", false);
        setField(term138332, term138332.getClass(), "containerListener", null);
        setIntField(term138332, term138332.getClass(), "listeningChildren", 0);
        setIntField(term138332, term138332.getClass(), "listeningBoundsChildren", 0);
        setIntField(term138332, term138332.getClass(), "descendantsCount", 0);
        setField(term138332, term138332.getClass(), "preserveBackgroundColor", null);
        setIntField(term138332, term138332.getClass(), "numOfHWComponents", 0);
        setIntField(term138332, term138332.getClass(), "numOfLWComponents", 0);
        setField(term138332, term138332.getClass(), "modalComp", null);
        setField(term138332, term138332.getClass(), "modalAppContext", null);
        setIntField(term138332, term138332.getClass(), "containerSerializedDataVersion", 0);
        setField(term138332, term138332.getClass(), "peer", null);
        setField(term138332, term138332.getClass(), "parent", null);
        setField(term138332, term138332.getClass(), "appContext", null);
        setIntField(term138332, term138332.getClass(), "x", 0);
        setIntField(term138332, term138332.getClass(), "y", 0);
        setIntField(term138332, term138332.getClass(), "width", 0);
        setIntField(term138332, term138332.getClass(), "height", 0);
        setField(term138332, term138332.getClass(), "foreground", null);
        setField(term138332, term138332.getClass(), "background", null);
        setField(term138332, term138332.getClass(), "font", null);
        setField(term138332, term138332.getClass(), "peerFont", null);
        setField(term138332, term138332.getClass(), "cursor", null);
        setField(term138332, term138332.getClass(), "locale", null);
        setField(term138332, term138332.getClass(), "graphicsConfig", null);
        setField(term138332, term138332.getClass(), "bufferStrategy", null);
        setBooleanField(term138332, term138332.getClass(), "ignoreRepaint", false);
        setBooleanField(term138332, term138332.getClass(), "visible", false);
        setBooleanField(term138332, term138332.getClass(), "enabled", false);
        setBooleanField(term138332, term138332.getClass(), "valid", false);
        setField(term138332, term138332.getClass(), "dropTarget", null);
        setField(term138332, term138332.getClass(), "popups", null);
        setField(term138332, term138332.getClass(), "name", null);
        setBooleanField(term138332, term138332.getClass(), "nameExplicitlySet", false);
        setBooleanField(term138332, term138332.getClass(), "focusable", false);
        setIntField(term138332, term138332.getClass(), "isFocusTraversableOverridden", 0);
        setField(term138332, term138332.getClass(), "focusTraversalKeys", null);
        setBooleanField(term138332, term138332.getClass(), "focusTraversalKeysEnabled", false);
        setField(term138332, term138332.getClass(), "acc", null);
        setField(term138332, term138332.getClass(), "minSize", null);
        setBooleanField(term138332, term138332.getClass(), "minSizeSet", false);
        setField(term138332, term138332.getClass(), "prefSize", null);
        setBooleanField(term138332, term138332.getClass(), "prefSizeSet", false);
        setField(term138332, term138332.getClass(), "maxSize", null);
        setBooleanField(term138332, term138332.getClass(), "maxSizeSet", false);
        setField(term138332, term138332.getClass(), "componentOrientation", null);
        setBooleanField(term138332, term138332.getClass(), "newEventsOnly", false);
        setField(term138332, term138332.getClass(), "componentListener", null);
        setField(term138332, term138332.getClass(), "focusListener", null);
        setField(term138332, term138332.getClass(), "hierarchyListener", null);
        setField(term138332, term138332.getClass(), "hierarchyBoundsListener", null);
        setField(term138332, term138332.getClass(), "keyListener", null);
        setField(term138332, term138332.getClass(), "mouseListener", null);
        setField(term138332, term138332.getClass(), "mouseMotionListener", null);
        setField(term138332, term138332.getClass(), "mouseWheelListener", null);
        setField(term138332, term138332.getClass(), "inputMethodListener", null);
        setLongField(term138332, term138332.getClass(), "eventMask", 0L);
        setField(term138332, term138332.getClass(), "changeSupport", null);
        setField(term138332, term138332.getClass(), "objectLock", null);
        setBooleanField(term138332, term138332.getClass(), "isPacked", false);
        setIntField(term138332, term138332.getClass(), "boundsOp", 0);
        setField(term138332, term138332.getClass(), "compoundShape", null);
        setField(term138332, term138332.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term138332, term138332.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term138332, term138332.getClass(), "backgroundEraseDisabled", false);
        setField(term138332, term138332.getClass(), "eventCache", null);
        setBooleanField(term138332, term138332.getClass(), "coalescingEnabled", false);
        setBooleanField(term138332, term138332.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term138332, term138332.getClass(), "componentSerializedDataVersion", 0);
        setField(term138332, term138332.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoute", argTypes, term138332, args);
    }

};


