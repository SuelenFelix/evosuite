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

public class MapPanel_drawHistoryMap_52632716966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137835;

    public MapPanel_drawHistoryMap_52632716966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137835 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term137835, term137835.getClass(), "viewPointX", 0);
        setIntField(term137835, term137835.getClass(), "viewPointY", 0);
        setIntField(term137835, term137835.getClass(), "viewPointOffsetX", 0);
        setIntField(term137835, term137835.getClass(), "viewPointOffsetY", 0);
        setField(term137835, term137835.getClass(), "screen", null);
        setField(term137835, term137835.getClass(), "backgroundScreen", null);
        setIntField(term137835, term137835.getClass(), "flickerBlue", 0);
        setBooleanField(term137835, term137835.getClass(), "flickerGoUp", false);
        setIntField(term137835, term137835.getClass(), "lastDrawnCenterX", 0);
        setIntField(term137835, term137835.getClass(), "lastDrawnCenterY", 0);
        setField(term137835, term137835.getClass(), "route", null);
        setBooleanField(term137835, term137835.getClass(), "battle", false);
        setIntField(term137835, term137835.getClass(), "wormHoleAnimation", 0);
        setField(term137835, term137835.getClass(), "historyCultures", null);
        setBooleanField(term137835, term137835.getClass(), "historyCoordInitialized", false);
        setIntField(term137835, term137835.getClass(), "historyCoordX", 0);
        setIntField(term137835, term137835.getClass(), "historyCoordY", 0);
        setField(term137835, term137835.getClass(), "leftSpaceImage", null);
        setField(term137835, term137835.getClass(), "rightSpaceImage", null);
        setField(term137835, term137835.getClass(), "popup", null);
        setField(term137835, term137835.getClass(), "tileOverride", null);
        setField(term137835, term137835.getClass(), "redrawTile", null);
        setBooleanField(term137835, term137835.getClass(), "fullDraw", false);
        setIntField(term137835, term137835.getClass(), "cursorFocus", 0);
        setField(term137835, term137835.getClass(), "minimap", null);
        setBooleanField(term137835, term137835.getClass(), "showMiniMap", false);
        setBooleanField(term137835, term137835.getClass(), "highContrastGrid", false);
        setIntField(term137835, term137835.getClass(), "miniMapTopX", 0);
        setIntField(term137835, term137835.getClass(), "miniMapTopY", 0);
        setIntField(term137835, term137835.getClass(), "miniMapBotX", 0);
        setIntField(term137835, term137835.getClass(), "miniMapBotY", 0);
        setIntField(term137835, term137835.getClass(), "transparency", 0);
        setBooleanField(term137835, term137835.getClass(), "improvedParallax", false);
        setBooleanField(term137835, term137835.getClass(), "updateAnimation", false);
        setIntField(term137835, term137835.getClass(), "updateAnimationCount", 0);
        setBooleanField(term137835, term137835.getClass(), "drawWeaponRange", false);
        setField(term137835, term137835.getClass(), "panelType", null);
        setIntField(term137835, term137835.getClass(), "lastCursorPosX", 0);
        setIntField(term137835, term137835.getClass(), "lastCursorPosY", 0);
        setIntField(term137835, term137835.getClass(), "lastZoomLevel", 0);
        setBooleanField(term137835, term137835.getClass(), "redoViewPoints", false);
        setBooleanField(term137835, term137835.getClass(), "isAlignmentXSet", false);
        setFloatField(term137835, term137835.getClass(), "alignmentX", 0.0F);
        setBooleanField(term137835, term137835.getClass(), "isAlignmentYSet", false);
        setFloatField(term137835, term137835.getClass(), "alignmentY", 0.0F);
        setField(term137835, term137835.getClass(), "ui", null);
        setField(term137835, term137835.getClass(), "listenerList", null);
        setField(term137835, term137835.getClass(), "clientProperties", null);
        setField(term137835, term137835.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term137835, term137835.getClass(), "autoscrolls", false);
        setField(term137835, term137835.getClass(), "border", null);
        setIntField(term137835, term137835.getClass(), "flags", 0);
        setField(term137835, term137835.getClass(), "inputVerifier", null);
        setBooleanField(term137835, term137835.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term137835, term137835.getClass(), "paintingChild", null);
        setField(term137835, term137835.getClass(), "popupMenu", null);
        setField(term137835, term137835.getClass(), "revalidateRunnableScheduled", null);
        setField(term137835, term137835.getClass(), "focusInputMap", null);
        setField(term137835, term137835.getClass(), "ancestorInputMap", null);
        setField(term137835, term137835.getClass(), "windowInputMap", null);
        setField(term137835, term137835.getClass(), "actionMap", null);
        setField(term137835, term137835.getClass(), "aaHint", null);
        setField(term137835, term137835.getClass(), "lcdRenderingHint", null);
        setField(term137835, term137835.getClass(), "component", null);
        setField(term137835, term137835.getClass(), "layoutMgr", null);
        setField(term137835, term137835.getClass(), "dispatcher", null);
        setField(term137835, term137835.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term137835, term137835.getClass(), "focusCycleRoot", false);
        setBooleanField(term137835, term137835.getClass(), "focusTraversalPolicyProvider", false);
        setField(term137835, term137835.getClass(), "printingThreads", null);
        setBooleanField(term137835, term137835.getClass(), "printing", false);
        setField(term137835, term137835.getClass(), "containerListener", null);
        setIntField(term137835, term137835.getClass(), "listeningChildren", 0);
        setIntField(term137835, term137835.getClass(), "listeningBoundsChildren", 0);
        setIntField(term137835, term137835.getClass(), "descendantsCount", 0);
        setField(term137835, term137835.getClass(), "preserveBackgroundColor", null);
        setIntField(term137835, term137835.getClass(), "numOfHWComponents", 0);
        setIntField(term137835, term137835.getClass(), "numOfLWComponents", 0);
        setField(term137835, term137835.getClass(), "modalComp", null);
        setField(term137835, term137835.getClass(), "modalAppContext", null);
        setIntField(term137835, term137835.getClass(), "containerSerializedDataVersion", 0);
        setField(term137835, term137835.getClass(), "peer", null);
        setField(term137835, term137835.getClass(), "parent", null);
        setField(term137835, term137835.getClass(), "appContext", null);
        setIntField(term137835, term137835.getClass(), "x", 0);
        setIntField(term137835, term137835.getClass(), "y", 0);
        setIntField(term137835, term137835.getClass(), "width", 0);
        setIntField(term137835, term137835.getClass(), "height", 0);
        setField(term137835, term137835.getClass(), "foreground", null);
        setField(term137835, term137835.getClass(), "background", null);
        setField(term137835, term137835.getClass(), "font", null);
        setField(term137835, term137835.getClass(), "peerFont", null);
        setField(term137835, term137835.getClass(), "cursor", null);
        setField(term137835, term137835.getClass(), "locale", null);
        setField(term137835, term137835.getClass(), "graphicsConfig", null);
        setField(term137835, term137835.getClass(), "bufferStrategy", null);
        setBooleanField(term137835, term137835.getClass(), "ignoreRepaint", false);
        setBooleanField(term137835, term137835.getClass(), "visible", false);
        setBooleanField(term137835, term137835.getClass(), "enabled", false);
        setBooleanField(term137835, term137835.getClass(), "valid", false);
        setField(term137835, term137835.getClass(), "dropTarget", null);
        setField(term137835, term137835.getClass(), "popups", null);
        setField(term137835, term137835.getClass(), "name", null);
        setBooleanField(term137835, term137835.getClass(), "nameExplicitlySet", false);
        setBooleanField(term137835, term137835.getClass(), "focusable", false);
        setIntField(term137835, term137835.getClass(), "isFocusTraversableOverridden", 0);
        setField(term137835, term137835.getClass(), "focusTraversalKeys", null);
        setBooleanField(term137835, term137835.getClass(), "focusTraversalKeysEnabled", false);
        setField(term137835, term137835.getClass(), "acc", null);
        setField(term137835, term137835.getClass(), "minSize", null);
        setBooleanField(term137835, term137835.getClass(), "minSizeSet", false);
        setField(term137835, term137835.getClass(), "prefSize", null);
        setBooleanField(term137835, term137835.getClass(), "prefSizeSet", false);
        setField(term137835, term137835.getClass(), "maxSize", null);
        setBooleanField(term137835, term137835.getClass(), "maxSizeSet", false);
        setField(term137835, term137835.getClass(), "componentOrientation", null);
        setBooleanField(term137835, term137835.getClass(), "newEventsOnly", false);
        setField(term137835, term137835.getClass(), "componentListener", null);
        setField(term137835, term137835.getClass(), "focusListener", null);
        setField(term137835, term137835.getClass(), "hierarchyListener", null);
        setField(term137835, term137835.getClass(), "hierarchyBoundsListener", null);
        setField(term137835, term137835.getClass(), "keyListener", null);
        setField(term137835, term137835.getClass(), "mouseListener", null);
        setField(term137835, term137835.getClass(), "mouseMotionListener", null);
        setField(term137835, term137835.getClass(), "mouseWheelListener", null);
        setField(term137835, term137835.getClass(), "inputMethodListener", null);
        setLongField(term137835, term137835.getClass(), "eventMask", 0L);
        setField(term137835, term137835.getClass(), "changeSupport", null);
        setField(term137835, term137835.getClass(), "objectLock", null);
        setBooleanField(term137835, term137835.getClass(), "isPacked", false);
        setIntField(term137835, term137835.getClass(), "boundsOp", 0);
        setField(term137835, term137835.getClass(), "compoundShape", null);
        setField(term137835, term137835.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term137835, term137835.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term137835, term137835.getClass(), "backgroundEraseDisabled", false);
        setField(term137835, term137835.getClass(), "eventCache", null);
        setBooleanField(term137835, term137835.getClass(), "coalescingEnabled", false);
        setBooleanField(term137835, term137835.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term137835, term137835.getClass(), "componentSerializedDataVersion", 0);
        setField(term137835, term137835.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "drawHistoryMap", argTypes, term137835, args);
    }

};


