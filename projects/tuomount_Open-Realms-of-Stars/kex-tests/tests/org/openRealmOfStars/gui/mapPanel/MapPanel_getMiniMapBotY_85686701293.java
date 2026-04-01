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

public class MapPanel_getMiniMapBotY_85686701293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139762;

    public MapPanel_getMiniMapBotY_85686701293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139762 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term139762, term139762.getClass(), "viewPointX", 0);
        setIntField(term139762, term139762.getClass(), "viewPointY", 0);
        setIntField(term139762, term139762.getClass(), "viewPointOffsetX", 0);
        setIntField(term139762, term139762.getClass(), "viewPointOffsetY", 0);
        setField(term139762, term139762.getClass(), "screen", null);
        setField(term139762, term139762.getClass(), "backgroundScreen", null);
        setIntField(term139762, term139762.getClass(), "flickerBlue", 0);
        setBooleanField(term139762, term139762.getClass(), "flickerGoUp", false);
        setIntField(term139762, term139762.getClass(), "lastDrawnCenterX", 0);
        setIntField(term139762, term139762.getClass(), "lastDrawnCenterY", 0);
        setField(term139762, term139762.getClass(), "route", null);
        setBooleanField(term139762, term139762.getClass(), "battle", false);
        setIntField(term139762, term139762.getClass(), "wormHoleAnimation", 0);
        setField(term139762, term139762.getClass(), "historyCultures", null);
        setBooleanField(term139762, term139762.getClass(), "historyCoordInitialized", false);
        setIntField(term139762, term139762.getClass(), "historyCoordX", 0);
        setIntField(term139762, term139762.getClass(), "historyCoordY", 0);
        setField(term139762, term139762.getClass(), "leftSpaceImage", null);
        setField(term139762, term139762.getClass(), "rightSpaceImage", null);
        setField(term139762, term139762.getClass(), "popup", null);
        setField(term139762, term139762.getClass(), "tileOverride", null);
        setField(term139762, term139762.getClass(), "redrawTile", null);
        setBooleanField(term139762, term139762.getClass(), "fullDraw", false);
        setIntField(term139762, term139762.getClass(), "cursorFocus", 0);
        setField(term139762, term139762.getClass(), "minimap", null);
        setBooleanField(term139762, term139762.getClass(), "showMiniMap", false);
        setBooleanField(term139762, term139762.getClass(), "highContrastGrid", false);
        setIntField(term139762, term139762.getClass(), "miniMapTopX", 0);
        setIntField(term139762, term139762.getClass(), "miniMapTopY", 0);
        setIntField(term139762, term139762.getClass(), "miniMapBotX", 0);
        setIntField(term139762, term139762.getClass(), "miniMapBotY", 0);
        setIntField(term139762, term139762.getClass(), "transparency", 0);
        setBooleanField(term139762, term139762.getClass(), "improvedParallax", false);
        setBooleanField(term139762, term139762.getClass(), "updateAnimation", false);
        setIntField(term139762, term139762.getClass(), "updateAnimationCount", 0);
        setBooleanField(term139762, term139762.getClass(), "drawWeaponRange", false);
        setField(term139762, term139762.getClass(), "panelType", null);
        setIntField(term139762, term139762.getClass(), "lastCursorPosX", 0);
        setIntField(term139762, term139762.getClass(), "lastCursorPosY", 0);
        setIntField(term139762, term139762.getClass(), "lastZoomLevel", 0);
        setBooleanField(term139762, term139762.getClass(), "redoViewPoints", false);
        setBooleanField(term139762, term139762.getClass(), "isAlignmentXSet", false);
        setFloatField(term139762, term139762.getClass(), "alignmentX", 0.0F);
        setBooleanField(term139762, term139762.getClass(), "isAlignmentYSet", false);
        setFloatField(term139762, term139762.getClass(), "alignmentY", 0.0F);
        setField(term139762, term139762.getClass(), "ui", null);
        setField(term139762, term139762.getClass(), "listenerList", null);
        setField(term139762, term139762.getClass(), "clientProperties", null);
        setField(term139762, term139762.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term139762, term139762.getClass(), "autoscrolls", false);
        setField(term139762, term139762.getClass(), "border", null);
        setIntField(term139762, term139762.getClass(), "flags", 0);
        setField(term139762, term139762.getClass(), "inputVerifier", null);
        setBooleanField(term139762, term139762.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term139762, term139762.getClass(), "paintingChild", null);
        setField(term139762, term139762.getClass(), "popupMenu", null);
        setField(term139762, term139762.getClass(), "revalidateRunnableScheduled", null);
        setField(term139762, term139762.getClass(), "focusInputMap", null);
        setField(term139762, term139762.getClass(), "ancestorInputMap", null);
        setField(term139762, term139762.getClass(), "windowInputMap", null);
        setField(term139762, term139762.getClass(), "actionMap", null);
        setField(term139762, term139762.getClass(), "aaHint", null);
        setField(term139762, term139762.getClass(), "lcdRenderingHint", null);
        setField(term139762, term139762.getClass(), "component", null);
        setField(term139762, term139762.getClass(), "layoutMgr", null);
        setField(term139762, term139762.getClass(), "dispatcher", null);
        setField(term139762, term139762.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term139762, term139762.getClass(), "focusCycleRoot", false);
        setBooleanField(term139762, term139762.getClass(), "focusTraversalPolicyProvider", false);
        setField(term139762, term139762.getClass(), "printingThreads", null);
        setBooleanField(term139762, term139762.getClass(), "printing", false);
        setField(term139762, term139762.getClass(), "containerListener", null);
        setIntField(term139762, term139762.getClass(), "listeningChildren", 0);
        setIntField(term139762, term139762.getClass(), "listeningBoundsChildren", 0);
        setIntField(term139762, term139762.getClass(), "descendantsCount", 0);
        setField(term139762, term139762.getClass(), "preserveBackgroundColor", null);
        setIntField(term139762, term139762.getClass(), "numOfHWComponents", 0);
        setIntField(term139762, term139762.getClass(), "numOfLWComponents", 0);
        setField(term139762, term139762.getClass(), "modalComp", null);
        setField(term139762, term139762.getClass(), "modalAppContext", null);
        setIntField(term139762, term139762.getClass(), "containerSerializedDataVersion", 0);
        setField(term139762, term139762.getClass(), "peer", null);
        setField(term139762, term139762.getClass(), "parent", null);
        setField(term139762, term139762.getClass(), "appContext", null);
        setIntField(term139762, term139762.getClass(), "x", 0);
        setIntField(term139762, term139762.getClass(), "y", 0);
        setIntField(term139762, term139762.getClass(), "width", 0);
        setIntField(term139762, term139762.getClass(), "height", 0);
        setField(term139762, term139762.getClass(), "foreground", null);
        setField(term139762, term139762.getClass(), "background", null);
        setField(term139762, term139762.getClass(), "font", null);
        setField(term139762, term139762.getClass(), "peerFont", null);
        setField(term139762, term139762.getClass(), "cursor", null);
        setField(term139762, term139762.getClass(), "locale", null);
        setField(term139762, term139762.getClass(), "graphicsConfig", null);
        setField(term139762, term139762.getClass(), "bufferStrategy", null);
        setBooleanField(term139762, term139762.getClass(), "ignoreRepaint", false);
        setBooleanField(term139762, term139762.getClass(), "visible", false);
        setBooleanField(term139762, term139762.getClass(), "enabled", false);
        setBooleanField(term139762, term139762.getClass(), "valid", false);
        setField(term139762, term139762.getClass(), "dropTarget", null);
        setField(term139762, term139762.getClass(), "popups", null);
        setField(term139762, term139762.getClass(), "name", null);
        setBooleanField(term139762, term139762.getClass(), "nameExplicitlySet", false);
        setBooleanField(term139762, term139762.getClass(), "focusable", false);
        setIntField(term139762, term139762.getClass(), "isFocusTraversableOverridden", 0);
        setField(term139762, term139762.getClass(), "focusTraversalKeys", null);
        setBooleanField(term139762, term139762.getClass(), "focusTraversalKeysEnabled", false);
        setField(term139762, term139762.getClass(), "acc", null);
        setField(term139762, term139762.getClass(), "minSize", null);
        setBooleanField(term139762, term139762.getClass(), "minSizeSet", false);
        setField(term139762, term139762.getClass(), "prefSize", null);
        setBooleanField(term139762, term139762.getClass(), "prefSizeSet", false);
        setField(term139762, term139762.getClass(), "maxSize", null);
        setBooleanField(term139762, term139762.getClass(), "maxSizeSet", false);
        setField(term139762, term139762.getClass(), "componentOrientation", null);
        setBooleanField(term139762, term139762.getClass(), "newEventsOnly", false);
        setField(term139762, term139762.getClass(), "componentListener", null);
        setField(term139762, term139762.getClass(), "focusListener", null);
        setField(term139762, term139762.getClass(), "hierarchyListener", null);
        setField(term139762, term139762.getClass(), "hierarchyBoundsListener", null);
        setField(term139762, term139762.getClass(), "keyListener", null);
        setField(term139762, term139762.getClass(), "mouseListener", null);
        setField(term139762, term139762.getClass(), "mouseMotionListener", null);
        setField(term139762, term139762.getClass(), "mouseWheelListener", null);
        setField(term139762, term139762.getClass(), "inputMethodListener", null);
        setLongField(term139762, term139762.getClass(), "eventMask", 0L);
        setField(term139762, term139762.getClass(), "changeSupport", null);
        setField(term139762, term139762.getClass(), "objectLock", null);
        setBooleanField(term139762, term139762.getClass(), "isPacked", false);
        setIntField(term139762, term139762.getClass(), "boundsOp", 0);
        setField(term139762, term139762.getClass(), "compoundShape", null);
        setField(term139762, term139762.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term139762, term139762.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term139762, term139762.getClass(), "backgroundEraseDisabled", false);
        setField(term139762, term139762.getClass(), "eventCache", null);
        setBooleanField(term139762, term139762.getClass(), "coalescingEnabled", false);
        setBooleanField(term139762, term139762.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term139762, term139762.getClass(), "componentSerializedDataVersion", 0);
        setField(term139762, term139762.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMiniMapBotY", argTypes, term139762, args);
    }

};


