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

public class MapPanel_getLastZoomLevel_91594653696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139975;

    public MapPanel_getLastZoomLevel_91594653696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139975 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term139975, term139975.getClass(), "viewPointX", 0);
        setIntField(term139975, term139975.getClass(), "viewPointY", 0);
        setIntField(term139975, term139975.getClass(), "viewPointOffsetX", 0);
        setIntField(term139975, term139975.getClass(), "viewPointOffsetY", 0);
        setField(term139975, term139975.getClass(), "screen", null);
        setField(term139975, term139975.getClass(), "backgroundScreen", null);
        setIntField(term139975, term139975.getClass(), "flickerBlue", 0);
        setBooleanField(term139975, term139975.getClass(), "flickerGoUp", false);
        setIntField(term139975, term139975.getClass(), "lastDrawnCenterX", 0);
        setIntField(term139975, term139975.getClass(), "lastDrawnCenterY", 0);
        setField(term139975, term139975.getClass(), "route", null);
        setBooleanField(term139975, term139975.getClass(), "battle", false);
        setIntField(term139975, term139975.getClass(), "wormHoleAnimation", 0);
        setField(term139975, term139975.getClass(), "historyCultures", null);
        setBooleanField(term139975, term139975.getClass(), "historyCoordInitialized", false);
        setIntField(term139975, term139975.getClass(), "historyCoordX", 0);
        setIntField(term139975, term139975.getClass(), "historyCoordY", 0);
        setField(term139975, term139975.getClass(), "leftSpaceImage", null);
        setField(term139975, term139975.getClass(), "rightSpaceImage", null);
        setField(term139975, term139975.getClass(), "popup", null);
        setField(term139975, term139975.getClass(), "tileOverride", null);
        setField(term139975, term139975.getClass(), "redrawTile", null);
        setBooleanField(term139975, term139975.getClass(), "fullDraw", false);
        setIntField(term139975, term139975.getClass(), "cursorFocus", 0);
        setField(term139975, term139975.getClass(), "minimap", null);
        setBooleanField(term139975, term139975.getClass(), "showMiniMap", false);
        setBooleanField(term139975, term139975.getClass(), "highContrastGrid", false);
        setIntField(term139975, term139975.getClass(), "miniMapTopX", 0);
        setIntField(term139975, term139975.getClass(), "miniMapTopY", 0);
        setIntField(term139975, term139975.getClass(), "miniMapBotX", 0);
        setIntField(term139975, term139975.getClass(), "miniMapBotY", 0);
        setIntField(term139975, term139975.getClass(), "transparency", 0);
        setBooleanField(term139975, term139975.getClass(), "improvedParallax", false);
        setBooleanField(term139975, term139975.getClass(), "updateAnimation", false);
        setIntField(term139975, term139975.getClass(), "updateAnimationCount", 0);
        setBooleanField(term139975, term139975.getClass(), "drawWeaponRange", false);
        setField(term139975, term139975.getClass(), "panelType", null);
        setIntField(term139975, term139975.getClass(), "lastCursorPosX", 0);
        setIntField(term139975, term139975.getClass(), "lastCursorPosY", 0);
        setIntField(term139975, term139975.getClass(), "lastZoomLevel", 0);
        setBooleanField(term139975, term139975.getClass(), "redoViewPoints", false);
        setBooleanField(term139975, term139975.getClass(), "isAlignmentXSet", false);
        setFloatField(term139975, term139975.getClass(), "alignmentX", 0.0F);
        setBooleanField(term139975, term139975.getClass(), "isAlignmentYSet", false);
        setFloatField(term139975, term139975.getClass(), "alignmentY", 0.0F);
        setField(term139975, term139975.getClass(), "ui", null);
        setField(term139975, term139975.getClass(), "listenerList", null);
        setField(term139975, term139975.getClass(), "clientProperties", null);
        setField(term139975, term139975.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term139975, term139975.getClass(), "autoscrolls", false);
        setField(term139975, term139975.getClass(), "border", null);
        setIntField(term139975, term139975.getClass(), "flags", 0);
        setField(term139975, term139975.getClass(), "inputVerifier", null);
        setBooleanField(term139975, term139975.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term139975, term139975.getClass(), "paintingChild", null);
        setField(term139975, term139975.getClass(), "popupMenu", null);
        setField(term139975, term139975.getClass(), "revalidateRunnableScheduled", null);
        setField(term139975, term139975.getClass(), "focusInputMap", null);
        setField(term139975, term139975.getClass(), "ancestorInputMap", null);
        setField(term139975, term139975.getClass(), "windowInputMap", null);
        setField(term139975, term139975.getClass(), "actionMap", null);
        setField(term139975, term139975.getClass(), "aaHint", null);
        setField(term139975, term139975.getClass(), "lcdRenderingHint", null);
        setField(term139975, term139975.getClass(), "component", null);
        setField(term139975, term139975.getClass(), "layoutMgr", null);
        setField(term139975, term139975.getClass(), "dispatcher", null);
        setField(term139975, term139975.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term139975, term139975.getClass(), "focusCycleRoot", false);
        setBooleanField(term139975, term139975.getClass(), "focusTraversalPolicyProvider", false);
        setField(term139975, term139975.getClass(), "printingThreads", null);
        setBooleanField(term139975, term139975.getClass(), "printing", false);
        setField(term139975, term139975.getClass(), "containerListener", null);
        setIntField(term139975, term139975.getClass(), "listeningChildren", 0);
        setIntField(term139975, term139975.getClass(), "listeningBoundsChildren", 0);
        setIntField(term139975, term139975.getClass(), "descendantsCount", 0);
        setField(term139975, term139975.getClass(), "preserveBackgroundColor", null);
        setIntField(term139975, term139975.getClass(), "numOfHWComponents", 0);
        setIntField(term139975, term139975.getClass(), "numOfLWComponents", 0);
        setField(term139975, term139975.getClass(), "modalComp", null);
        setField(term139975, term139975.getClass(), "modalAppContext", null);
        setIntField(term139975, term139975.getClass(), "containerSerializedDataVersion", 0);
        setField(term139975, term139975.getClass(), "peer", null);
        setField(term139975, term139975.getClass(), "parent", null);
        setField(term139975, term139975.getClass(), "appContext", null);
        setIntField(term139975, term139975.getClass(), "x", 0);
        setIntField(term139975, term139975.getClass(), "y", 0);
        setIntField(term139975, term139975.getClass(), "width", 0);
        setIntField(term139975, term139975.getClass(), "height", 0);
        setField(term139975, term139975.getClass(), "foreground", null);
        setField(term139975, term139975.getClass(), "background", null);
        setField(term139975, term139975.getClass(), "font", null);
        setField(term139975, term139975.getClass(), "peerFont", null);
        setField(term139975, term139975.getClass(), "cursor", null);
        setField(term139975, term139975.getClass(), "locale", null);
        setField(term139975, term139975.getClass(), "graphicsConfig", null);
        setField(term139975, term139975.getClass(), "bufferStrategy", null);
        setBooleanField(term139975, term139975.getClass(), "ignoreRepaint", false);
        setBooleanField(term139975, term139975.getClass(), "visible", false);
        setBooleanField(term139975, term139975.getClass(), "enabled", false);
        setBooleanField(term139975, term139975.getClass(), "valid", false);
        setField(term139975, term139975.getClass(), "dropTarget", null);
        setField(term139975, term139975.getClass(), "popups", null);
        setField(term139975, term139975.getClass(), "name", null);
        setBooleanField(term139975, term139975.getClass(), "nameExplicitlySet", false);
        setBooleanField(term139975, term139975.getClass(), "focusable", false);
        setIntField(term139975, term139975.getClass(), "isFocusTraversableOverridden", 0);
        setField(term139975, term139975.getClass(), "focusTraversalKeys", null);
        setBooleanField(term139975, term139975.getClass(), "focusTraversalKeysEnabled", false);
        setField(term139975, term139975.getClass(), "acc", null);
        setField(term139975, term139975.getClass(), "minSize", null);
        setBooleanField(term139975, term139975.getClass(), "minSizeSet", false);
        setField(term139975, term139975.getClass(), "prefSize", null);
        setBooleanField(term139975, term139975.getClass(), "prefSizeSet", false);
        setField(term139975, term139975.getClass(), "maxSize", null);
        setBooleanField(term139975, term139975.getClass(), "maxSizeSet", false);
        setField(term139975, term139975.getClass(), "componentOrientation", null);
        setBooleanField(term139975, term139975.getClass(), "newEventsOnly", false);
        setField(term139975, term139975.getClass(), "componentListener", null);
        setField(term139975, term139975.getClass(), "focusListener", null);
        setField(term139975, term139975.getClass(), "hierarchyListener", null);
        setField(term139975, term139975.getClass(), "hierarchyBoundsListener", null);
        setField(term139975, term139975.getClass(), "keyListener", null);
        setField(term139975, term139975.getClass(), "mouseListener", null);
        setField(term139975, term139975.getClass(), "mouseMotionListener", null);
        setField(term139975, term139975.getClass(), "mouseWheelListener", null);
        setField(term139975, term139975.getClass(), "inputMethodListener", null);
        setLongField(term139975, term139975.getClass(), "eventMask", 0L);
        setField(term139975, term139975.getClass(), "changeSupport", null);
        setField(term139975, term139975.getClass(), "objectLock", null);
        setBooleanField(term139975, term139975.getClass(), "isPacked", false);
        setIntField(term139975, term139975.getClass(), "boundsOp", 0);
        setField(term139975, term139975.getClass(), "compoundShape", null);
        setField(term139975, term139975.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term139975, term139975.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term139975, term139975.getClass(), "backgroundEraseDisabled", false);
        setField(term139975, term139975.getClass(), "eventCache", null);
        setBooleanField(term139975, term139975.getClass(), "coalescingEnabled", false);
        setBooleanField(term139975, term139975.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term139975, term139975.getClass(), "componentSerializedDataVersion", 0);
        setField(term139975, term139975.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastZoomLevel", argTypes, term139975, args);
    }

};


