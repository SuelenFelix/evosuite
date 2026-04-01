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

public class MapPanel_getMinimap_120908755594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139833;

    public MapPanel_getMinimap_120908755594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139833 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term139833, term139833.getClass(), "viewPointX", 0);
        setIntField(term139833, term139833.getClass(), "viewPointY", 0);
        setIntField(term139833, term139833.getClass(), "viewPointOffsetX", 0);
        setIntField(term139833, term139833.getClass(), "viewPointOffsetY", 0);
        setField(term139833, term139833.getClass(), "screen", null);
        setField(term139833, term139833.getClass(), "backgroundScreen", null);
        setIntField(term139833, term139833.getClass(), "flickerBlue", 0);
        setBooleanField(term139833, term139833.getClass(), "flickerGoUp", false);
        setIntField(term139833, term139833.getClass(), "lastDrawnCenterX", 0);
        setIntField(term139833, term139833.getClass(), "lastDrawnCenterY", 0);
        setField(term139833, term139833.getClass(), "route", null);
        setBooleanField(term139833, term139833.getClass(), "battle", false);
        setIntField(term139833, term139833.getClass(), "wormHoleAnimation", 0);
        setField(term139833, term139833.getClass(), "historyCultures", null);
        setBooleanField(term139833, term139833.getClass(), "historyCoordInitialized", false);
        setIntField(term139833, term139833.getClass(), "historyCoordX", 0);
        setIntField(term139833, term139833.getClass(), "historyCoordY", 0);
        setField(term139833, term139833.getClass(), "leftSpaceImage", null);
        setField(term139833, term139833.getClass(), "rightSpaceImage", null);
        setField(term139833, term139833.getClass(), "popup", null);
        setField(term139833, term139833.getClass(), "tileOverride", null);
        setField(term139833, term139833.getClass(), "redrawTile", null);
        setBooleanField(term139833, term139833.getClass(), "fullDraw", false);
        setIntField(term139833, term139833.getClass(), "cursorFocus", 0);
        setField(term139833, term139833.getClass(), "minimap", null);
        setBooleanField(term139833, term139833.getClass(), "showMiniMap", false);
        setBooleanField(term139833, term139833.getClass(), "highContrastGrid", false);
        setIntField(term139833, term139833.getClass(), "miniMapTopX", 0);
        setIntField(term139833, term139833.getClass(), "miniMapTopY", 0);
        setIntField(term139833, term139833.getClass(), "miniMapBotX", 0);
        setIntField(term139833, term139833.getClass(), "miniMapBotY", 0);
        setIntField(term139833, term139833.getClass(), "transparency", 0);
        setBooleanField(term139833, term139833.getClass(), "improvedParallax", false);
        setBooleanField(term139833, term139833.getClass(), "updateAnimation", false);
        setIntField(term139833, term139833.getClass(), "updateAnimationCount", 0);
        setBooleanField(term139833, term139833.getClass(), "drawWeaponRange", false);
        setField(term139833, term139833.getClass(), "panelType", null);
        setIntField(term139833, term139833.getClass(), "lastCursorPosX", 0);
        setIntField(term139833, term139833.getClass(), "lastCursorPosY", 0);
        setIntField(term139833, term139833.getClass(), "lastZoomLevel", 0);
        setBooleanField(term139833, term139833.getClass(), "redoViewPoints", false);
        setBooleanField(term139833, term139833.getClass(), "isAlignmentXSet", false);
        setFloatField(term139833, term139833.getClass(), "alignmentX", 0.0F);
        setBooleanField(term139833, term139833.getClass(), "isAlignmentYSet", false);
        setFloatField(term139833, term139833.getClass(), "alignmentY", 0.0F);
        setField(term139833, term139833.getClass(), "ui", null);
        setField(term139833, term139833.getClass(), "listenerList", null);
        setField(term139833, term139833.getClass(), "clientProperties", null);
        setField(term139833, term139833.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term139833, term139833.getClass(), "autoscrolls", false);
        setField(term139833, term139833.getClass(), "border", null);
        setIntField(term139833, term139833.getClass(), "flags", 0);
        setField(term139833, term139833.getClass(), "inputVerifier", null);
        setBooleanField(term139833, term139833.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term139833, term139833.getClass(), "paintingChild", null);
        setField(term139833, term139833.getClass(), "popupMenu", null);
        setField(term139833, term139833.getClass(), "revalidateRunnableScheduled", null);
        setField(term139833, term139833.getClass(), "focusInputMap", null);
        setField(term139833, term139833.getClass(), "ancestorInputMap", null);
        setField(term139833, term139833.getClass(), "windowInputMap", null);
        setField(term139833, term139833.getClass(), "actionMap", null);
        setField(term139833, term139833.getClass(), "aaHint", null);
        setField(term139833, term139833.getClass(), "lcdRenderingHint", null);
        setField(term139833, term139833.getClass(), "component", null);
        setField(term139833, term139833.getClass(), "layoutMgr", null);
        setField(term139833, term139833.getClass(), "dispatcher", null);
        setField(term139833, term139833.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term139833, term139833.getClass(), "focusCycleRoot", false);
        setBooleanField(term139833, term139833.getClass(), "focusTraversalPolicyProvider", false);
        setField(term139833, term139833.getClass(), "printingThreads", null);
        setBooleanField(term139833, term139833.getClass(), "printing", false);
        setField(term139833, term139833.getClass(), "containerListener", null);
        setIntField(term139833, term139833.getClass(), "listeningChildren", 0);
        setIntField(term139833, term139833.getClass(), "listeningBoundsChildren", 0);
        setIntField(term139833, term139833.getClass(), "descendantsCount", 0);
        setField(term139833, term139833.getClass(), "preserveBackgroundColor", null);
        setIntField(term139833, term139833.getClass(), "numOfHWComponents", 0);
        setIntField(term139833, term139833.getClass(), "numOfLWComponents", 0);
        setField(term139833, term139833.getClass(), "modalComp", null);
        setField(term139833, term139833.getClass(), "modalAppContext", null);
        setIntField(term139833, term139833.getClass(), "containerSerializedDataVersion", 0);
        setField(term139833, term139833.getClass(), "peer", null);
        setField(term139833, term139833.getClass(), "parent", null);
        setField(term139833, term139833.getClass(), "appContext", null);
        setIntField(term139833, term139833.getClass(), "x", 0);
        setIntField(term139833, term139833.getClass(), "y", 0);
        setIntField(term139833, term139833.getClass(), "width", 0);
        setIntField(term139833, term139833.getClass(), "height", 0);
        setField(term139833, term139833.getClass(), "foreground", null);
        setField(term139833, term139833.getClass(), "background", null);
        setField(term139833, term139833.getClass(), "font", null);
        setField(term139833, term139833.getClass(), "peerFont", null);
        setField(term139833, term139833.getClass(), "cursor", null);
        setField(term139833, term139833.getClass(), "locale", null);
        setField(term139833, term139833.getClass(), "graphicsConfig", null);
        setField(term139833, term139833.getClass(), "bufferStrategy", null);
        setBooleanField(term139833, term139833.getClass(), "ignoreRepaint", false);
        setBooleanField(term139833, term139833.getClass(), "visible", false);
        setBooleanField(term139833, term139833.getClass(), "enabled", false);
        setBooleanField(term139833, term139833.getClass(), "valid", false);
        setField(term139833, term139833.getClass(), "dropTarget", null);
        setField(term139833, term139833.getClass(), "popups", null);
        setField(term139833, term139833.getClass(), "name", null);
        setBooleanField(term139833, term139833.getClass(), "nameExplicitlySet", false);
        setBooleanField(term139833, term139833.getClass(), "focusable", false);
        setIntField(term139833, term139833.getClass(), "isFocusTraversableOverridden", 0);
        setField(term139833, term139833.getClass(), "focusTraversalKeys", null);
        setBooleanField(term139833, term139833.getClass(), "focusTraversalKeysEnabled", false);
        setField(term139833, term139833.getClass(), "acc", null);
        setField(term139833, term139833.getClass(), "minSize", null);
        setBooleanField(term139833, term139833.getClass(), "minSizeSet", false);
        setField(term139833, term139833.getClass(), "prefSize", null);
        setBooleanField(term139833, term139833.getClass(), "prefSizeSet", false);
        setField(term139833, term139833.getClass(), "maxSize", null);
        setBooleanField(term139833, term139833.getClass(), "maxSizeSet", false);
        setField(term139833, term139833.getClass(), "componentOrientation", null);
        setBooleanField(term139833, term139833.getClass(), "newEventsOnly", false);
        setField(term139833, term139833.getClass(), "componentListener", null);
        setField(term139833, term139833.getClass(), "focusListener", null);
        setField(term139833, term139833.getClass(), "hierarchyListener", null);
        setField(term139833, term139833.getClass(), "hierarchyBoundsListener", null);
        setField(term139833, term139833.getClass(), "keyListener", null);
        setField(term139833, term139833.getClass(), "mouseListener", null);
        setField(term139833, term139833.getClass(), "mouseMotionListener", null);
        setField(term139833, term139833.getClass(), "mouseWheelListener", null);
        setField(term139833, term139833.getClass(), "inputMethodListener", null);
        setLongField(term139833, term139833.getClass(), "eventMask", 0L);
        setField(term139833, term139833.getClass(), "changeSupport", null);
        setField(term139833, term139833.getClass(), "objectLock", null);
        setBooleanField(term139833, term139833.getClass(), "isPacked", false);
        setIntField(term139833, term139833.getClass(), "boundsOp", 0);
        setField(term139833, term139833.getClass(), "compoundShape", null);
        setField(term139833, term139833.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term139833, term139833.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term139833, term139833.getClass(), "backgroundEraseDisabled", false);
        setField(term139833, term139833.getClass(), "eventCache", null);
        setBooleanField(term139833, term139833.getClass(), "coalescingEnabled", false);
        setBooleanField(term139833, term139833.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term139833, term139833.getClass(), "componentSerializedDataVersion", 0);
        setField(term139833, term139833.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimap", argTypes, term139833, args);
    }

};


