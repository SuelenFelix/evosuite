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

public class MapPanel_getMiniMapTopY_137207256691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139620;

    public MapPanel_getMiniMapTopY_137207256691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139620 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term139620, term139620.getClass(), "viewPointX", 0);
        setIntField(term139620, term139620.getClass(), "viewPointY", 0);
        setIntField(term139620, term139620.getClass(), "viewPointOffsetX", 0);
        setIntField(term139620, term139620.getClass(), "viewPointOffsetY", 0);
        setField(term139620, term139620.getClass(), "screen", null);
        setField(term139620, term139620.getClass(), "backgroundScreen", null);
        setIntField(term139620, term139620.getClass(), "flickerBlue", 0);
        setBooleanField(term139620, term139620.getClass(), "flickerGoUp", false);
        setIntField(term139620, term139620.getClass(), "lastDrawnCenterX", 0);
        setIntField(term139620, term139620.getClass(), "lastDrawnCenterY", 0);
        setField(term139620, term139620.getClass(), "route", null);
        setBooleanField(term139620, term139620.getClass(), "battle", false);
        setIntField(term139620, term139620.getClass(), "wormHoleAnimation", 0);
        setField(term139620, term139620.getClass(), "historyCultures", null);
        setBooleanField(term139620, term139620.getClass(), "historyCoordInitialized", false);
        setIntField(term139620, term139620.getClass(), "historyCoordX", 0);
        setIntField(term139620, term139620.getClass(), "historyCoordY", 0);
        setField(term139620, term139620.getClass(), "leftSpaceImage", null);
        setField(term139620, term139620.getClass(), "rightSpaceImage", null);
        setField(term139620, term139620.getClass(), "popup", null);
        setField(term139620, term139620.getClass(), "tileOverride", null);
        setField(term139620, term139620.getClass(), "redrawTile", null);
        setBooleanField(term139620, term139620.getClass(), "fullDraw", false);
        setIntField(term139620, term139620.getClass(), "cursorFocus", 0);
        setField(term139620, term139620.getClass(), "minimap", null);
        setBooleanField(term139620, term139620.getClass(), "showMiniMap", false);
        setBooleanField(term139620, term139620.getClass(), "highContrastGrid", false);
        setIntField(term139620, term139620.getClass(), "miniMapTopX", 0);
        setIntField(term139620, term139620.getClass(), "miniMapTopY", 0);
        setIntField(term139620, term139620.getClass(), "miniMapBotX", 0);
        setIntField(term139620, term139620.getClass(), "miniMapBotY", 0);
        setIntField(term139620, term139620.getClass(), "transparency", 0);
        setBooleanField(term139620, term139620.getClass(), "improvedParallax", false);
        setBooleanField(term139620, term139620.getClass(), "updateAnimation", false);
        setIntField(term139620, term139620.getClass(), "updateAnimationCount", 0);
        setBooleanField(term139620, term139620.getClass(), "drawWeaponRange", false);
        setField(term139620, term139620.getClass(), "panelType", null);
        setIntField(term139620, term139620.getClass(), "lastCursorPosX", 0);
        setIntField(term139620, term139620.getClass(), "lastCursorPosY", 0);
        setIntField(term139620, term139620.getClass(), "lastZoomLevel", 0);
        setBooleanField(term139620, term139620.getClass(), "redoViewPoints", false);
        setBooleanField(term139620, term139620.getClass(), "isAlignmentXSet", false);
        setFloatField(term139620, term139620.getClass(), "alignmentX", 0.0F);
        setBooleanField(term139620, term139620.getClass(), "isAlignmentYSet", false);
        setFloatField(term139620, term139620.getClass(), "alignmentY", 0.0F);
        setField(term139620, term139620.getClass(), "ui", null);
        setField(term139620, term139620.getClass(), "listenerList", null);
        setField(term139620, term139620.getClass(), "clientProperties", null);
        setField(term139620, term139620.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term139620, term139620.getClass(), "autoscrolls", false);
        setField(term139620, term139620.getClass(), "border", null);
        setIntField(term139620, term139620.getClass(), "flags", 0);
        setField(term139620, term139620.getClass(), "inputVerifier", null);
        setBooleanField(term139620, term139620.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term139620, term139620.getClass(), "paintingChild", null);
        setField(term139620, term139620.getClass(), "popupMenu", null);
        setField(term139620, term139620.getClass(), "revalidateRunnableScheduled", null);
        setField(term139620, term139620.getClass(), "focusInputMap", null);
        setField(term139620, term139620.getClass(), "ancestorInputMap", null);
        setField(term139620, term139620.getClass(), "windowInputMap", null);
        setField(term139620, term139620.getClass(), "actionMap", null);
        setField(term139620, term139620.getClass(), "aaHint", null);
        setField(term139620, term139620.getClass(), "lcdRenderingHint", null);
        setField(term139620, term139620.getClass(), "component", null);
        setField(term139620, term139620.getClass(), "layoutMgr", null);
        setField(term139620, term139620.getClass(), "dispatcher", null);
        setField(term139620, term139620.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term139620, term139620.getClass(), "focusCycleRoot", false);
        setBooleanField(term139620, term139620.getClass(), "focusTraversalPolicyProvider", false);
        setField(term139620, term139620.getClass(), "printingThreads", null);
        setBooleanField(term139620, term139620.getClass(), "printing", false);
        setField(term139620, term139620.getClass(), "containerListener", null);
        setIntField(term139620, term139620.getClass(), "listeningChildren", 0);
        setIntField(term139620, term139620.getClass(), "listeningBoundsChildren", 0);
        setIntField(term139620, term139620.getClass(), "descendantsCount", 0);
        setField(term139620, term139620.getClass(), "preserveBackgroundColor", null);
        setIntField(term139620, term139620.getClass(), "numOfHWComponents", 0);
        setIntField(term139620, term139620.getClass(), "numOfLWComponents", 0);
        setField(term139620, term139620.getClass(), "modalComp", null);
        setField(term139620, term139620.getClass(), "modalAppContext", null);
        setIntField(term139620, term139620.getClass(), "containerSerializedDataVersion", 0);
        setField(term139620, term139620.getClass(), "peer", null);
        setField(term139620, term139620.getClass(), "parent", null);
        setField(term139620, term139620.getClass(), "appContext", null);
        setIntField(term139620, term139620.getClass(), "x", 0);
        setIntField(term139620, term139620.getClass(), "y", 0);
        setIntField(term139620, term139620.getClass(), "width", 0);
        setIntField(term139620, term139620.getClass(), "height", 0);
        setField(term139620, term139620.getClass(), "foreground", null);
        setField(term139620, term139620.getClass(), "background", null);
        setField(term139620, term139620.getClass(), "font", null);
        setField(term139620, term139620.getClass(), "peerFont", null);
        setField(term139620, term139620.getClass(), "cursor", null);
        setField(term139620, term139620.getClass(), "locale", null);
        setField(term139620, term139620.getClass(), "graphicsConfig", null);
        setField(term139620, term139620.getClass(), "bufferStrategy", null);
        setBooleanField(term139620, term139620.getClass(), "ignoreRepaint", false);
        setBooleanField(term139620, term139620.getClass(), "visible", false);
        setBooleanField(term139620, term139620.getClass(), "enabled", false);
        setBooleanField(term139620, term139620.getClass(), "valid", false);
        setField(term139620, term139620.getClass(), "dropTarget", null);
        setField(term139620, term139620.getClass(), "popups", null);
        setField(term139620, term139620.getClass(), "name", null);
        setBooleanField(term139620, term139620.getClass(), "nameExplicitlySet", false);
        setBooleanField(term139620, term139620.getClass(), "focusable", false);
        setIntField(term139620, term139620.getClass(), "isFocusTraversableOverridden", 0);
        setField(term139620, term139620.getClass(), "focusTraversalKeys", null);
        setBooleanField(term139620, term139620.getClass(), "focusTraversalKeysEnabled", false);
        setField(term139620, term139620.getClass(), "acc", null);
        setField(term139620, term139620.getClass(), "minSize", null);
        setBooleanField(term139620, term139620.getClass(), "minSizeSet", false);
        setField(term139620, term139620.getClass(), "prefSize", null);
        setBooleanField(term139620, term139620.getClass(), "prefSizeSet", false);
        setField(term139620, term139620.getClass(), "maxSize", null);
        setBooleanField(term139620, term139620.getClass(), "maxSizeSet", false);
        setField(term139620, term139620.getClass(), "componentOrientation", null);
        setBooleanField(term139620, term139620.getClass(), "newEventsOnly", false);
        setField(term139620, term139620.getClass(), "componentListener", null);
        setField(term139620, term139620.getClass(), "focusListener", null);
        setField(term139620, term139620.getClass(), "hierarchyListener", null);
        setField(term139620, term139620.getClass(), "hierarchyBoundsListener", null);
        setField(term139620, term139620.getClass(), "keyListener", null);
        setField(term139620, term139620.getClass(), "mouseListener", null);
        setField(term139620, term139620.getClass(), "mouseMotionListener", null);
        setField(term139620, term139620.getClass(), "mouseWheelListener", null);
        setField(term139620, term139620.getClass(), "inputMethodListener", null);
        setLongField(term139620, term139620.getClass(), "eventMask", 0L);
        setField(term139620, term139620.getClass(), "changeSupport", null);
        setField(term139620, term139620.getClass(), "objectLock", null);
        setBooleanField(term139620, term139620.getClass(), "isPacked", false);
        setIntField(term139620, term139620.getClass(), "boundsOp", 0);
        setField(term139620, term139620.getClass(), "compoundShape", null);
        setField(term139620, term139620.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term139620, term139620.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term139620, term139620.getClass(), "backgroundEraseDisabled", false);
        setField(term139620, term139620.getClass(), "eventCache", null);
        setBooleanField(term139620, term139620.getClass(), "coalescingEnabled", false);
        setBooleanField(term139620, term139620.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term139620, term139620.getClass(), "componentSerializedDataVersion", 0);
        setField(term139620, term139620.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMiniMapTopY", argTypes, term139620, args);
    }

};


