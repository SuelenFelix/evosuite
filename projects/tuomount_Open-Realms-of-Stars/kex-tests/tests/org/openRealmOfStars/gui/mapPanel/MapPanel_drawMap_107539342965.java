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

public class MapPanel_drawMap_107539342965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137764;

    public MapPanel_drawMap_107539342965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137764 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term137764, term137764.getClass(), "viewPointX", 0);
        setIntField(term137764, term137764.getClass(), "viewPointY", 0);
        setIntField(term137764, term137764.getClass(), "viewPointOffsetX", 0);
        setIntField(term137764, term137764.getClass(), "viewPointOffsetY", 0);
        setField(term137764, term137764.getClass(), "screen", null);
        setField(term137764, term137764.getClass(), "backgroundScreen", null);
        setIntField(term137764, term137764.getClass(), "flickerBlue", 0);
        setBooleanField(term137764, term137764.getClass(), "flickerGoUp", false);
        setIntField(term137764, term137764.getClass(), "lastDrawnCenterX", 0);
        setIntField(term137764, term137764.getClass(), "lastDrawnCenterY", 0);
        setField(term137764, term137764.getClass(), "route", null);
        setBooleanField(term137764, term137764.getClass(), "battle", false);
        setIntField(term137764, term137764.getClass(), "wormHoleAnimation", 0);
        setField(term137764, term137764.getClass(), "historyCultures", null);
        setBooleanField(term137764, term137764.getClass(), "historyCoordInitialized", false);
        setIntField(term137764, term137764.getClass(), "historyCoordX", 0);
        setIntField(term137764, term137764.getClass(), "historyCoordY", 0);
        setField(term137764, term137764.getClass(), "leftSpaceImage", null);
        setField(term137764, term137764.getClass(), "rightSpaceImage", null);
        setField(term137764, term137764.getClass(), "popup", null);
        setField(term137764, term137764.getClass(), "tileOverride", null);
        setField(term137764, term137764.getClass(), "redrawTile", null);
        setBooleanField(term137764, term137764.getClass(), "fullDraw", false);
        setIntField(term137764, term137764.getClass(), "cursorFocus", 0);
        setField(term137764, term137764.getClass(), "minimap", null);
        setBooleanField(term137764, term137764.getClass(), "showMiniMap", false);
        setBooleanField(term137764, term137764.getClass(), "highContrastGrid", false);
        setIntField(term137764, term137764.getClass(), "miniMapTopX", 0);
        setIntField(term137764, term137764.getClass(), "miniMapTopY", 0);
        setIntField(term137764, term137764.getClass(), "miniMapBotX", 0);
        setIntField(term137764, term137764.getClass(), "miniMapBotY", 0);
        setIntField(term137764, term137764.getClass(), "transparency", 0);
        setBooleanField(term137764, term137764.getClass(), "improvedParallax", false);
        setBooleanField(term137764, term137764.getClass(), "updateAnimation", false);
        setIntField(term137764, term137764.getClass(), "updateAnimationCount", 0);
        setBooleanField(term137764, term137764.getClass(), "drawWeaponRange", false);
        setField(term137764, term137764.getClass(), "panelType", null);
        setIntField(term137764, term137764.getClass(), "lastCursorPosX", 0);
        setIntField(term137764, term137764.getClass(), "lastCursorPosY", 0);
        setIntField(term137764, term137764.getClass(), "lastZoomLevel", 0);
        setBooleanField(term137764, term137764.getClass(), "redoViewPoints", false);
        setBooleanField(term137764, term137764.getClass(), "isAlignmentXSet", false);
        setFloatField(term137764, term137764.getClass(), "alignmentX", 0.0F);
        setBooleanField(term137764, term137764.getClass(), "isAlignmentYSet", false);
        setFloatField(term137764, term137764.getClass(), "alignmentY", 0.0F);
        setField(term137764, term137764.getClass(), "ui", null);
        setField(term137764, term137764.getClass(), "listenerList", null);
        setField(term137764, term137764.getClass(), "clientProperties", null);
        setField(term137764, term137764.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term137764, term137764.getClass(), "autoscrolls", false);
        setField(term137764, term137764.getClass(), "border", null);
        setIntField(term137764, term137764.getClass(), "flags", 0);
        setField(term137764, term137764.getClass(), "inputVerifier", null);
        setBooleanField(term137764, term137764.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term137764, term137764.getClass(), "paintingChild", null);
        setField(term137764, term137764.getClass(), "popupMenu", null);
        setField(term137764, term137764.getClass(), "revalidateRunnableScheduled", null);
        setField(term137764, term137764.getClass(), "focusInputMap", null);
        setField(term137764, term137764.getClass(), "ancestorInputMap", null);
        setField(term137764, term137764.getClass(), "windowInputMap", null);
        setField(term137764, term137764.getClass(), "actionMap", null);
        setField(term137764, term137764.getClass(), "aaHint", null);
        setField(term137764, term137764.getClass(), "lcdRenderingHint", null);
        setField(term137764, term137764.getClass(), "component", null);
        setField(term137764, term137764.getClass(), "layoutMgr", null);
        setField(term137764, term137764.getClass(), "dispatcher", null);
        setField(term137764, term137764.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term137764, term137764.getClass(), "focusCycleRoot", false);
        setBooleanField(term137764, term137764.getClass(), "focusTraversalPolicyProvider", false);
        setField(term137764, term137764.getClass(), "printingThreads", null);
        setBooleanField(term137764, term137764.getClass(), "printing", false);
        setField(term137764, term137764.getClass(), "containerListener", null);
        setIntField(term137764, term137764.getClass(), "listeningChildren", 0);
        setIntField(term137764, term137764.getClass(), "listeningBoundsChildren", 0);
        setIntField(term137764, term137764.getClass(), "descendantsCount", 0);
        setField(term137764, term137764.getClass(), "preserveBackgroundColor", null);
        setIntField(term137764, term137764.getClass(), "numOfHWComponents", 0);
        setIntField(term137764, term137764.getClass(), "numOfLWComponents", 0);
        setField(term137764, term137764.getClass(), "modalComp", null);
        setField(term137764, term137764.getClass(), "modalAppContext", null);
        setIntField(term137764, term137764.getClass(), "containerSerializedDataVersion", 0);
        setField(term137764, term137764.getClass(), "peer", null);
        setField(term137764, term137764.getClass(), "parent", null);
        setField(term137764, term137764.getClass(), "appContext", null);
        setIntField(term137764, term137764.getClass(), "x", 0);
        setIntField(term137764, term137764.getClass(), "y", 0);
        setIntField(term137764, term137764.getClass(), "width", 0);
        setIntField(term137764, term137764.getClass(), "height", 0);
        setField(term137764, term137764.getClass(), "foreground", null);
        setField(term137764, term137764.getClass(), "background", null);
        setField(term137764, term137764.getClass(), "font", null);
        setField(term137764, term137764.getClass(), "peerFont", null);
        setField(term137764, term137764.getClass(), "cursor", null);
        setField(term137764, term137764.getClass(), "locale", null);
        setField(term137764, term137764.getClass(), "graphicsConfig", null);
        setField(term137764, term137764.getClass(), "bufferStrategy", null);
        setBooleanField(term137764, term137764.getClass(), "ignoreRepaint", false);
        setBooleanField(term137764, term137764.getClass(), "visible", false);
        setBooleanField(term137764, term137764.getClass(), "enabled", false);
        setBooleanField(term137764, term137764.getClass(), "valid", false);
        setField(term137764, term137764.getClass(), "dropTarget", null);
        setField(term137764, term137764.getClass(), "popups", null);
        setField(term137764, term137764.getClass(), "name", null);
        setBooleanField(term137764, term137764.getClass(), "nameExplicitlySet", false);
        setBooleanField(term137764, term137764.getClass(), "focusable", false);
        setIntField(term137764, term137764.getClass(), "isFocusTraversableOverridden", 0);
        setField(term137764, term137764.getClass(), "focusTraversalKeys", null);
        setBooleanField(term137764, term137764.getClass(), "focusTraversalKeysEnabled", false);
        setField(term137764, term137764.getClass(), "acc", null);
        setField(term137764, term137764.getClass(), "minSize", null);
        setBooleanField(term137764, term137764.getClass(), "minSizeSet", false);
        setField(term137764, term137764.getClass(), "prefSize", null);
        setBooleanField(term137764, term137764.getClass(), "prefSizeSet", false);
        setField(term137764, term137764.getClass(), "maxSize", null);
        setBooleanField(term137764, term137764.getClass(), "maxSizeSet", false);
        setField(term137764, term137764.getClass(), "componentOrientation", null);
        setBooleanField(term137764, term137764.getClass(), "newEventsOnly", false);
        setField(term137764, term137764.getClass(), "componentListener", null);
        setField(term137764, term137764.getClass(), "focusListener", null);
        setField(term137764, term137764.getClass(), "hierarchyListener", null);
        setField(term137764, term137764.getClass(), "hierarchyBoundsListener", null);
        setField(term137764, term137764.getClass(), "keyListener", null);
        setField(term137764, term137764.getClass(), "mouseListener", null);
        setField(term137764, term137764.getClass(), "mouseMotionListener", null);
        setField(term137764, term137764.getClass(), "mouseWheelListener", null);
        setField(term137764, term137764.getClass(), "inputMethodListener", null);
        setLongField(term137764, term137764.getClass(), "eventMask", 0L);
        setField(term137764, term137764.getClass(), "changeSupport", null);
        setField(term137764, term137764.getClass(), "objectLock", null);
        setBooleanField(term137764, term137764.getClass(), "isPacked", false);
        setIntField(term137764, term137764.getClass(), "boundsOp", 0);
        setField(term137764, term137764.getClass(), "compoundShape", null);
        setField(term137764, term137764.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term137764, term137764.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term137764, term137764.getClass(), "backgroundEraseDisabled", false);
        setField(term137764, term137764.getClass(), "eventCache", null);
        setBooleanField(term137764, term137764.getClass(), "coalescingEnabled", false);
        setBooleanField(term137764, term137764.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term137764, term137764.getClass(), "componentSerializedDataVersion", 0);
        setField(term137764, term137764.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "drawMap", argTypes, term137764, args);
    }

};


