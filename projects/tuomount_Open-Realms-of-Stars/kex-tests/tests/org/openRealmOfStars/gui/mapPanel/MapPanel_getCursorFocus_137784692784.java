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

public class MapPanel_getCursorFocus_137784692784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139117;

    public MapPanel_getCursorFocus_137784692784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139117 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term139117, term139117.getClass(), "viewPointX", 0);
        setIntField(term139117, term139117.getClass(), "viewPointY", 0);
        setIntField(term139117, term139117.getClass(), "viewPointOffsetX", 0);
        setIntField(term139117, term139117.getClass(), "viewPointOffsetY", 0);
        setField(term139117, term139117.getClass(), "screen", null);
        setField(term139117, term139117.getClass(), "backgroundScreen", null);
        setIntField(term139117, term139117.getClass(), "flickerBlue", 0);
        setBooleanField(term139117, term139117.getClass(), "flickerGoUp", false);
        setIntField(term139117, term139117.getClass(), "lastDrawnCenterX", 0);
        setIntField(term139117, term139117.getClass(), "lastDrawnCenterY", 0);
        setField(term139117, term139117.getClass(), "route", null);
        setBooleanField(term139117, term139117.getClass(), "battle", false);
        setIntField(term139117, term139117.getClass(), "wormHoleAnimation", 0);
        setField(term139117, term139117.getClass(), "historyCultures", null);
        setBooleanField(term139117, term139117.getClass(), "historyCoordInitialized", false);
        setIntField(term139117, term139117.getClass(), "historyCoordX", 0);
        setIntField(term139117, term139117.getClass(), "historyCoordY", 0);
        setField(term139117, term139117.getClass(), "leftSpaceImage", null);
        setField(term139117, term139117.getClass(), "rightSpaceImage", null);
        setField(term139117, term139117.getClass(), "popup", null);
        setField(term139117, term139117.getClass(), "tileOverride", null);
        setField(term139117, term139117.getClass(), "redrawTile", null);
        setBooleanField(term139117, term139117.getClass(), "fullDraw", false);
        setIntField(term139117, term139117.getClass(), "cursorFocus", 0);
        setField(term139117, term139117.getClass(), "minimap", null);
        setBooleanField(term139117, term139117.getClass(), "showMiniMap", false);
        setBooleanField(term139117, term139117.getClass(), "highContrastGrid", false);
        setIntField(term139117, term139117.getClass(), "miniMapTopX", 0);
        setIntField(term139117, term139117.getClass(), "miniMapTopY", 0);
        setIntField(term139117, term139117.getClass(), "miniMapBotX", 0);
        setIntField(term139117, term139117.getClass(), "miniMapBotY", 0);
        setIntField(term139117, term139117.getClass(), "transparency", 0);
        setBooleanField(term139117, term139117.getClass(), "improvedParallax", false);
        setBooleanField(term139117, term139117.getClass(), "updateAnimation", false);
        setIntField(term139117, term139117.getClass(), "updateAnimationCount", 0);
        setBooleanField(term139117, term139117.getClass(), "drawWeaponRange", false);
        setField(term139117, term139117.getClass(), "panelType", null);
        setIntField(term139117, term139117.getClass(), "lastCursorPosX", 0);
        setIntField(term139117, term139117.getClass(), "lastCursorPosY", 0);
        setIntField(term139117, term139117.getClass(), "lastZoomLevel", 0);
        setBooleanField(term139117, term139117.getClass(), "redoViewPoints", false);
        setBooleanField(term139117, term139117.getClass(), "isAlignmentXSet", false);
        setFloatField(term139117, term139117.getClass(), "alignmentX", 0.0F);
        setBooleanField(term139117, term139117.getClass(), "isAlignmentYSet", false);
        setFloatField(term139117, term139117.getClass(), "alignmentY", 0.0F);
        setField(term139117, term139117.getClass(), "ui", null);
        setField(term139117, term139117.getClass(), "listenerList", null);
        setField(term139117, term139117.getClass(), "clientProperties", null);
        setField(term139117, term139117.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term139117, term139117.getClass(), "autoscrolls", false);
        setField(term139117, term139117.getClass(), "border", null);
        setIntField(term139117, term139117.getClass(), "flags", 0);
        setField(term139117, term139117.getClass(), "inputVerifier", null);
        setBooleanField(term139117, term139117.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term139117, term139117.getClass(), "paintingChild", null);
        setField(term139117, term139117.getClass(), "popupMenu", null);
        setField(term139117, term139117.getClass(), "revalidateRunnableScheduled", null);
        setField(term139117, term139117.getClass(), "focusInputMap", null);
        setField(term139117, term139117.getClass(), "ancestorInputMap", null);
        setField(term139117, term139117.getClass(), "windowInputMap", null);
        setField(term139117, term139117.getClass(), "actionMap", null);
        setField(term139117, term139117.getClass(), "aaHint", null);
        setField(term139117, term139117.getClass(), "lcdRenderingHint", null);
        setField(term139117, term139117.getClass(), "component", null);
        setField(term139117, term139117.getClass(), "layoutMgr", null);
        setField(term139117, term139117.getClass(), "dispatcher", null);
        setField(term139117, term139117.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term139117, term139117.getClass(), "focusCycleRoot", false);
        setBooleanField(term139117, term139117.getClass(), "focusTraversalPolicyProvider", false);
        setField(term139117, term139117.getClass(), "printingThreads", null);
        setBooleanField(term139117, term139117.getClass(), "printing", false);
        setField(term139117, term139117.getClass(), "containerListener", null);
        setIntField(term139117, term139117.getClass(), "listeningChildren", 0);
        setIntField(term139117, term139117.getClass(), "listeningBoundsChildren", 0);
        setIntField(term139117, term139117.getClass(), "descendantsCount", 0);
        setField(term139117, term139117.getClass(), "preserveBackgroundColor", null);
        setIntField(term139117, term139117.getClass(), "numOfHWComponents", 0);
        setIntField(term139117, term139117.getClass(), "numOfLWComponents", 0);
        setField(term139117, term139117.getClass(), "modalComp", null);
        setField(term139117, term139117.getClass(), "modalAppContext", null);
        setIntField(term139117, term139117.getClass(), "containerSerializedDataVersion", 0);
        setField(term139117, term139117.getClass(), "peer", null);
        setField(term139117, term139117.getClass(), "parent", null);
        setField(term139117, term139117.getClass(), "appContext", null);
        setIntField(term139117, term139117.getClass(), "x", 0);
        setIntField(term139117, term139117.getClass(), "y", 0);
        setIntField(term139117, term139117.getClass(), "width", 0);
        setIntField(term139117, term139117.getClass(), "height", 0);
        setField(term139117, term139117.getClass(), "foreground", null);
        setField(term139117, term139117.getClass(), "background", null);
        setField(term139117, term139117.getClass(), "font", null);
        setField(term139117, term139117.getClass(), "peerFont", null);
        setField(term139117, term139117.getClass(), "cursor", null);
        setField(term139117, term139117.getClass(), "locale", null);
        setField(term139117, term139117.getClass(), "graphicsConfig", null);
        setField(term139117, term139117.getClass(), "bufferStrategy", null);
        setBooleanField(term139117, term139117.getClass(), "ignoreRepaint", false);
        setBooleanField(term139117, term139117.getClass(), "visible", false);
        setBooleanField(term139117, term139117.getClass(), "enabled", false);
        setBooleanField(term139117, term139117.getClass(), "valid", false);
        setField(term139117, term139117.getClass(), "dropTarget", null);
        setField(term139117, term139117.getClass(), "popups", null);
        setField(term139117, term139117.getClass(), "name", null);
        setBooleanField(term139117, term139117.getClass(), "nameExplicitlySet", false);
        setBooleanField(term139117, term139117.getClass(), "focusable", false);
        setIntField(term139117, term139117.getClass(), "isFocusTraversableOverridden", 0);
        setField(term139117, term139117.getClass(), "focusTraversalKeys", null);
        setBooleanField(term139117, term139117.getClass(), "focusTraversalKeysEnabled", false);
        setField(term139117, term139117.getClass(), "acc", null);
        setField(term139117, term139117.getClass(), "minSize", null);
        setBooleanField(term139117, term139117.getClass(), "minSizeSet", false);
        setField(term139117, term139117.getClass(), "prefSize", null);
        setBooleanField(term139117, term139117.getClass(), "prefSizeSet", false);
        setField(term139117, term139117.getClass(), "maxSize", null);
        setBooleanField(term139117, term139117.getClass(), "maxSizeSet", false);
        setField(term139117, term139117.getClass(), "componentOrientation", null);
        setBooleanField(term139117, term139117.getClass(), "newEventsOnly", false);
        setField(term139117, term139117.getClass(), "componentListener", null);
        setField(term139117, term139117.getClass(), "focusListener", null);
        setField(term139117, term139117.getClass(), "hierarchyListener", null);
        setField(term139117, term139117.getClass(), "hierarchyBoundsListener", null);
        setField(term139117, term139117.getClass(), "keyListener", null);
        setField(term139117, term139117.getClass(), "mouseListener", null);
        setField(term139117, term139117.getClass(), "mouseMotionListener", null);
        setField(term139117, term139117.getClass(), "mouseWheelListener", null);
        setField(term139117, term139117.getClass(), "inputMethodListener", null);
        setLongField(term139117, term139117.getClass(), "eventMask", 0L);
        setField(term139117, term139117.getClass(), "changeSupport", null);
        setField(term139117, term139117.getClass(), "objectLock", null);
        setBooleanField(term139117, term139117.getClass(), "isPacked", false);
        setIntField(term139117, term139117.getClass(), "boundsOp", 0);
        setField(term139117, term139117.getClass(), "compoundShape", null);
        setField(term139117, term139117.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term139117, term139117.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term139117, term139117.getClass(), "backgroundEraseDisabled", false);
        setField(term139117, term139117.getClass(), "eventCache", null);
        setBooleanField(term139117, term139117.getClass(), "coalescingEnabled", false);
        setBooleanField(term139117, term139117.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term139117, term139117.getClass(), "componentSerializedDataVersion", 0);
        setField(term139117, term139117.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCursorFocus", argTypes, term139117, args);
    }

};


