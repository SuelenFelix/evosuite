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

public class MapPanel_getMiniMapTopX_137207160590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139549;

    public MapPanel_getMiniMapTopX_137207160590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139549 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term139549, term139549.getClass(), "viewPointX", 0);
        setIntField(term139549, term139549.getClass(), "viewPointY", 0);
        setIntField(term139549, term139549.getClass(), "viewPointOffsetX", 0);
        setIntField(term139549, term139549.getClass(), "viewPointOffsetY", 0);
        setField(term139549, term139549.getClass(), "screen", null);
        setField(term139549, term139549.getClass(), "backgroundScreen", null);
        setIntField(term139549, term139549.getClass(), "flickerBlue", 0);
        setBooleanField(term139549, term139549.getClass(), "flickerGoUp", false);
        setIntField(term139549, term139549.getClass(), "lastDrawnCenterX", 0);
        setIntField(term139549, term139549.getClass(), "lastDrawnCenterY", 0);
        setField(term139549, term139549.getClass(), "route", null);
        setBooleanField(term139549, term139549.getClass(), "battle", false);
        setIntField(term139549, term139549.getClass(), "wormHoleAnimation", 0);
        setField(term139549, term139549.getClass(), "historyCultures", null);
        setBooleanField(term139549, term139549.getClass(), "historyCoordInitialized", false);
        setIntField(term139549, term139549.getClass(), "historyCoordX", 0);
        setIntField(term139549, term139549.getClass(), "historyCoordY", 0);
        setField(term139549, term139549.getClass(), "leftSpaceImage", null);
        setField(term139549, term139549.getClass(), "rightSpaceImage", null);
        setField(term139549, term139549.getClass(), "popup", null);
        setField(term139549, term139549.getClass(), "tileOverride", null);
        setField(term139549, term139549.getClass(), "redrawTile", null);
        setBooleanField(term139549, term139549.getClass(), "fullDraw", false);
        setIntField(term139549, term139549.getClass(), "cursorFocus", 0);
        setField(term139549, term139549.getClass(), "minimap", null);
        setBooleanField(term139549, term139549.getClass(), "showMiniMap", false);
        setBooleanField(term139549, term139549.getClass(), "highContrastGrid", false);
        setIntField(term139549, term139549.getClass(), "miniMapTopX", 0);
        setIntField(term139549, term139549.getClass(), "miniMapTopY", 0);
        setIntField(term139549, term139549.getClass(), "miniMapBotX", 0);
        setIntField(term139549, term139549.getClass(), "miniMapBotY", 0);
        setIntField(term139549, term139549.getClass(), "transparency", 0);
        setBooleanField(term139549, term139549.getClass(), "improvedParallax", false);
        setBooleanField(term139549, term139549.getClass(), "updateAnimation", false);
        setIntField(term139549, term139549.getClass(), "updateAnimationCount", 0);
        setBooleanField(term139549, term139549.getClass(), "drawWeaponRange", false);
        setField(term139549, term139549.getClass(), "panelType", null);
        setIntField(term139549, term139549.getClass(), "lastCursorPosX", 0);
        setIntField(term139549, term139549.getClass(), "lastCursorPosY", 0);
        setIntField(term139549, term139549.getClass(), "lastZoomLevel", 0);
        setBooleanField(term139549, term139549.getClass(), "redoViewPoints", false);
        setBooleanField(term139549, term139549.getClass(), "isAlignmentXSet", false);
        setFloatField(term139549, term139549.getClass(), "alignmentX", 0.0F);
        setBooleanField(term139549, term139549.getClass(), "isAlignmentYSet", false);
        setFloatField(term139549, term139549.getClass(), "alignmentY", 0.0F);
        setField(term139549, term139549.getClass(), "ui", null);
        setField(term139549, term139549.getClass(), "listenerList", null);
        setField(term139549, term139549.getClass(), "clientProperties", null);
        setField(term139549, term139549.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term139549, term139549.getClass(), "autoscrolls", false);
        setField(term139549, term139549.getClass(), "border", null);
        setIntField(term139549, term139549.getClass(), "flags", 0);
        setField(term139549, term139549.getClass(), "inputVerifier", null);
        setBooleanField(term139549, term139549.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term139549, term139549.getClass(), "paintingChild", null);
        setField(term139549, term139549.getClass(), "popupMenu", null);
        setField(term139549, term139549.getClass(), "revalidateRunnableScheduled", null);
        setField(term139549, term139549.getClass(), "focusInputMap", null);
        setField(term139549, term139549.getClass(), "ancestorInputMap", null);
        setField(term139549, term139549.getClass(), "windowInputMap", null);
        setField(term139549, term139549.getClass(), "actionMap", null);
        setField(term139549, term139549.getClass(), "aaHint", null);
        setField(term139549, term139549.getClass(), "lcdRenderingHint", null);
        setField(term139549, term139549.getClass(), "component", null);
        setField(term139549, term139549.getClass(), "layoutMgr", null);
        setField(term139549, term139549.getClass(), "dispatcher", null);
        setField(term139549, term139549.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term139549, term139549.getClass(), "focusCycleRoot", false);
        setBooleanField(term139549, term139549.getClass(), "focusTraversalPolicyProvider", false);
        setField(term139549, term139549.getClass(), "printingThreads", null);
        setBooleanField(term139549, term139549.getClass(), "printing", false);
        setField(term139549, term139549.getClass(), "containerListener", null);
        setIntField(term139549, term139549.getClass(), "listeningChildren", 0);
        setIntField(term139549, term139549.getClass(), "listeningBoundsChildren", 0);
        setIntField(term139549, term139549.getClass(), "descendantsCount", 0);
        setField(term139549, term139549.getClass(), "preserveBackgroundColor", null);
        setIntField(term139549, term139549.getClass(), "numOfHWComponents", 0);
        setIntField(term139549, term139549.getClass(), "numOfLWComponents", 0);
        setField(term139549, term139549.getClass(), "modalComp", null);
        setField(term139549, term139549.getClass(), "modalAppContext", null);
        setIntField(term139549, term139549.getClass(), "containerSerializedDataVersion", 0);
        setField(term139549, term139549.getClass(), "peer", null);
        setField(term139549, term139549.getClass(), "parent", null);
        setField(term139549, term139549.getClass(), "appContext", null);
        setIntField(term139549, term139549.getClass(), "x", 0);
        setIntField(term139549, term139549.getClass(), "y", 0);
        setIntField(term139549, term139549.getClass(), "width", 0);
        setIntField(term139549, term139549.getClass(), "height", 0);
        setField(term139549, term139549.getClass(), "foreground", null);
        setField(term139549, term139549.getClass(), "background", null);
        setField(term139549, term139549.getClass(), "font", null);
        setField(term139549, term139549.getClass(), "peerFont", null);
        setField(term139549, term139549.getClass(), "cursor", null);
        setField(term139549, term139549.getClass(), "locale", null);
        setField(term139549, term139549.getClass(), "graphicsConfig", null);
        setField(term139549, term139549.getClass(), "bufferStrategy", null);
        setBooleanField(term139549, term139549.getClass(), "ignoreRepaint", false);
        setBooleanField(term139549, term139549.getClass(), "visible", false);
        setBooleanField(term139549, term139549.getClass(), "enabled", false);
        setBooleanField(term139549, term139549.getClass(), "valid", false);
        setField(term139549, term139549.getClass(), "dropTarget", null);
        setField(term139549, term139549.getClass(), "popups", null);
        setField(term139549, term139549.getClass(), "name", null);
        setBooleanField(term139549, term139549.getClass(), "nameExplicitlySet", false);
        setBooleanField(term139549, term139549.getClass(), "focusable", false);
        setIntField(term139549, term139549.getClass(), "isFocusTraversableOverridden", 0);
        setField(term139549, term139549.getClass(), "focusTraversalKeys", null);
        setBooleanField(term139549, term139549.getClass(), "focusTraversalKeysEnabled", false);
        setField(term139549, term139549.getClass(), "acc", null);
        setField(term139549, term139549.getClass(), "minSize", null);
        setBooleanField(term139549, term139549.getClass(), "minSizeSet", false);
        setField(term139549, term139549.getClass(), "prefSize", null);
        setBooleanField(term139549, term139549.getClass(), "prefSizeSet", false);
        setField(term139549, term139549.getClass(), "maxSize", null);
        setBooleanField(term139549, term139549.getClass(), "maxSizeSet", false);
        setField(term139549, term139549.getClass(), "componentOrientation", null);
        setBooleanField(term139549, term139549.getClass(), "newEventsOnly", false);
        setField(term139549, term139549.getClass(), "componentListener", null);
        setField(term139549, term139549.getClass(), "focusListener", null);
        setField(term139549, term139549.getClass(), "hierarchyListener", null);
        setField(term139549, term139549.getClass(), "hierarchyBoundsListener", null);
        setField(term139549, term139549.getClass(), "keyListener", null);
        setField(term139549, term139549.getClass(), "mouseListener", null);
        setField(term139549, term139549.getClass(), "mouseMotionListener", null);
        setField(term139549, term139549.getClass(), "mouseWheelListener", null);
        setField(term139549, term139549.getClass(), "inputMethodListener", null);
        setLongField(term139549, term139549.getClass(), "eventMask", 0L);
        setField(term139549, term139549.getClass(), "changeSupport", null);
        setField(term139549, term139549.getClass(), "objectLock", null);
        setBooleanField(term139549, term139549.getClass(), "isPacked", false);
        setIntField(term139549, term139549.getClass(), "boundsOp", 0);
        setField(term139549, term139549.getClass(), "compoundShape", null);
        setField(term139549, term139549.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term139549, term139549.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term139549, term139549.getClass(), "backgroundEraseDisabled", false);
        setField(term139549, term139549.getClass(), "eventCache", null);
        setBooleanField(term139549, term139549.getClass(), "coalescingEnabled", false);
        setBooleanField(term139549, term139549.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term139549, term139549.getClass(), "componentSerializedDataVersion", 0);
        setField(term139549, term139549.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMiniMapTopX", argTypes, term139549, args);
    }

};


