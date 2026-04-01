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

public class MapPanel_getMiniMapBotX_85686605192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139691;

    public MapPanel_getMiniMapBotX_85686605192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139691 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term139691, term139691.getClass(), "viewPointX", 0);
        setIntField(term139691, term139691.getClass(), "viewPointY", 0);
        setIntField(term139691, term139691.getClass(), "viewPointOffsetX", 0);
        setIntField(term139691, term139691.getClass(), "viewPointOffsetY", 0);
        setField(term139691, term139691.getClass(), "screen", null);
        setField(term139691, term139691.getClass(), "backgroundScreen", null);
        setIntField(term139691, term139691.getClass(), "flickerBlue", 0);
        setBooleanField(term139691, term139691.getClass(), "flickerGoUp", false);
        setIntField(term139691, term139691.getClass(), "lastDrawnCenterX", 0);
        setIntField(term139691, term139691.getClass(), "lastDrawnCenterY", 0);
        setField(term139691, term139691.getClass(), "route", null);
        setBooleanField(term139691, term139691.getClass(), "battle", false);
        setIntField(term139691, term139691.getClass(), "wormHoleAnimation", 0);
        setField(term139691, term139691.getClass(), "historyCultures", null);
        setBooleanField(term139691, term139691.getClass(), "historyCoordInitialized", false);
        setIntField(term139691, term139691.getClass(), "historyCoordX", 0);
        setIntField(term139691, term139691.getClass(), "historyCoordY", 0);
        setField(term139691, term139691.getClass(), "leftSpaceImage", null);
        setField(term139691, term139691.getClass(), "rightSpaceImage", null);
        setField(term139691, term139691.getClass(), "popup", null);
        setField(term139691, term139691.getClass(), "tileOverride", null);
        setField(term139691, term139691.getClass(), "redrawTile", null);
        setBooleanField(term139691, term139691.getClass(), "fullDraw", false);
        setIntField(term139691, term139691.getClass(), "cursorFocus", 0);
        setField(term139691, term139691.getClass(), "minimap", null);
        setBooleanField(term139691, term139691.getClass(), "showMiniMap", false);
        setBooleanField(term139691, term139691.getClass(), "highContrastGrid", false);
        setIntField(term139691, term139691.getClass(), "miniMapTopX", 0);
        setIntField(term139691, term139691.getClass(), "miniMapTopY", 0);
        setIntField(term139691, term139691.getClass(), "miniMapBotX", 0);
        setIntField(term139691, term139691.getClass(), "miniMapBotY", 0);
        setIntField(term139691, term139691.getClass(), "transparency", 0);
        setBooleanField(term139691, term139691.getClass(), "improvedParallax", false);
        setBooleanField(term139691, term139691.getClass(), "updateAnimation", false);
        setIntField(term139691, term139691.getClass(), "updateAnimationCount", 0);
        setBooleanField(term139691, term139691.getClass(), "drawWeaponRange", false);
        setField(term139691, term139691.getClass(), "panelType", null);
        setIntField(term139691, term139691.getClass(), "lastCursorPosX", 0);
        setIntField(term139691, term139691.getClass(), "lastCursorPosY", 0);
        setIntField(term139691, term139691.getClass(), "lastZoomLevel", 0);
        setBooleanField(term139691, term139691.getClass(), "redoViewPoints", false);
        setBooleanField(term139691, term139691.getClass(), "isAlignmentXSet", false);
        setFloatField(term139691, term139691.getClass(), "alignmentX", 0.0F);
        setBooleanField(term139691, term139691.getClass(), "isAlignmentYSet", false);
        setFloatField(term139691, term139691.getClass(), "alignmentY", 0.0F);
        setField(term139691, term139691.getClass(), "ui", null);
        setField(term139691, term139691.getClass(), "listenerList", null);
        setField(term139691, term139691.getClass(), "clientProperties", null);
        setField(term139691, term139691.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term139691, term139691.getClass(), "autoscrolls", false);
        setField(term139691, term139691.getClass(), "border", null);
        setIntField(term139691, term139691.getClass(), "flags", 0);
        setField(term139691, term139691.getClass(), "inputVerifier", null);
        setBooleanField(term139691, term139691.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term139691, term139691.getClass(), "paintingChild", null);
        setField(term139691, term139691.getClass(), "popupMenu", null);
        setField(term139691, term139691.getClass(), "revalidateRunnableScheduled", null);
        setField(term139691, term139691.getClass(), "focusInputMap", null);
        setField(term139691, term139691.getClass(), "ancestorInputMap", null);
        setField(term139691, term139691.getClass(), "windowInputMap", null);
        setField(term139691, term139691.getClass(), "actionMap", null);
        setField(term139691, term139691.getClass(), "aaHint", null);
        setField(term139691, term139691.getClass(), "lcdRenderingHint", null);
        setField(term139691, term139691.getClass(), "component", null);
        setField(term139691, term139691.getClass(), "layoutMgr", null);
        setField(term139691, term139691.getClass(), "dispatcher", null);
        setField(term139691, term139691.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term139691, term139691.getClass(), "focusCycleRoot", false);
        setBooleanField(term139691, term139691.getClass(), "focusTraversalPolicyProvider", false);
        setField(term139691, term139691.getClass(), "printingThreads", null);
        setBooleanField(term139691, term139691.getClass(), "printing", false);
        setField(term139691, term139691.getClass(), "containerListener", null);
        setIntField(term139691, term139691.getClass(), "listeningChildren", 0);
        setIntField(term139691, term139691.getClass(), "listeningBoundsChildren", 0);
        setIntField(term139691, term139691.getClass(), "descendantsCount", 0);
        setField(term139691, term139691.getClass(), "preserveBackgroundColor", null);
        setIntField(term139691, term139691.getClass(), "numOfHWComponents", 0);
        setIntField(term139691, term139691.getClass(), "numOfLWComponents", 0);
        setField(term139691, term139691.getClass(), "modalComp", null);
        setField(term139691, term139691.getClass(), "modalAppContext", null);
        setIntField(term139691, term139691.getClass(), "containerSerializedDataVersion", 0);
        setField(term139691, term139691.getClass(), "peer", null);
        setField(term139691, term139691.getClass(), "parent", null);
        setField(term139691, term139691.getClass(), "appContext", null);
        setIntField(term139691, term139691.getClass(), "x", 0);
        setIntField(term139691, term139691.getClass(), "y", 0);
        setIntField(term139691, term139691.getClass(), "width", 0);
        setIntField(term139691, term139691.getClass(), "height", 0);
        setField(term139691, term139691.getClass(), "foreground", null);
        setField(term139691, term139691.getClass(), "background", null);
        setField(term139691, term139691.getClass(), "font", null);
        setField(term139691, term139691.getClass(), "peerFont", null);
        setField(term139691, term139691.getClass(), "cursor", null);
        setField(term139691, term139691.getClass(), "locale", null);
        setField(term139691, term139691.getClass(), "graphicsConfig", null);
        setField(term139691, term139691.getClass(), "bufferStrategy", null);
        setBooleanField(term139691, term139691.getClass(), "ignoreRepaint", false);
        setBooleanField(term139691, term139691.getClass(), "visible", false);
        setBooleanField(term139691, term139691.getClass(), "enabled", false);
        setBooleanField(term139691, term139691.getClass(), "valid", false);
        setField(term139691, term139691.getClass(), "dropTarget", null);
        setField(term139691, term139691.getClass(), "popups", null);
        setField(term139691, term139691.getClass(), "name", null);
        setBooleanField(term139691, term139691.getClass(), "nameExplicitlySet", false);
        setBooleanField(term139691, term139691.getClass(), "focusable", false);
        setIntField(term139691, term139691.getClass(), "isFocusTraversableOverridden", 0);
        setField(term139691, term139691.getClass(), "focusTraversalKeys", null);
        setBooleanField(term139691, term139691.getClass(), "focusTraversalKeysEnabled", false);
        setField(term139691, term139691.getClass(), "acc", null);
        setField(term139691, term139691.getClass(), "minSize", null);
        setBooleanField(term139691, term139691.getClass(), "minSizeSet", false);
        setField(term139691, term139691.getClass(), "prefSize", null);
        setBooleanField(term139691, term139691.getClass(), "prefSizeSet", false);
        setField(term139691, term139691.getClass(), "maxSize", null);
        setBooleanField(term139691, term139691.getClass(), "maxSizeSet", false);
        setField(term139691, term139691.getClass(), "componentOrientation", null);
        setBooleanField(term139691, term139691.getClass(), "newEventsOnly", false);
        setField(term139691, term139691.getClass(), "componentListener", null);
        setField(term139691, term139691.getClass(), "focusListener", null);
        setField(term139691, term139691.getClass(), "hierarchyListener", null);
        setField(term139691, term139691.getClass(), "hierarchyBoundsListener", null);
        setField(term139691, term139691.getClass(), "keyListener", null);
        setField(term139691, term139691.getClass(), "mouseListener", null);
        setField(term139691, term139691.getClass(), "mouseMotionListener", null);
        setField(term139691, term139691.getClass(), "mouseWheelListener", null);
        setField(term139691, term139691.getClass(), "inputMethodListener", null);
        setLongField(term139691, term139691.getClass(), "eventMask", 0L);
        setField(term139691, term139691.getClass(), "changeSupport", null);
        setField(term139691, term139691.getClass(), "objectLock", null);
        setBooleanField(term139691, term139691.getClass(), "isPacked", false);
        setIntField(term139691, term139691.getClass(), "boundsOp", 0);
        setField(term139691, term139691.getClass(), "compoundShape", null);
        setField(term139691, term139691.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term139691, term139691.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term139691, term139691.getClass(), "backgroundEraseDisabled", false);
        setField(term139691, term139691.getClass(), "eventCache", null);
        setBooleanField(term139691, term139691.getClass(), "coalescingEnabled", false);
        setBooleanField(term139691, term139691.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term139691, term139691.getClass(), "componentSerializedDataVersion", 0);
        setField(term139691, term139691.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMiniMapBotX", argTypes, term139691, args);
    }

};


