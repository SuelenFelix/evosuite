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

public class MapPanel_getDefaultHeight_70306667756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137316;

    public MapPanel_getDefaultHeight_70306667756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137316 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term137316, term137316.getClass(), "viewPointX", 0);
        setIntField(term137316, term137316.getClass(), "viewPointY", 0);
        setIntField(term137316, term137316.getClass(), "viewPointOffsetX", 0);
        setIntField(term137316, term137316.getClass(), "viewPointOffsetY", 0);
        setField(term137316, term137316.getClass(), "screen", null);
        setField(term137316, term137316.getClass(), "backgroundScreen", null);
        setIntField(term137316, term137316.getClass(), "flickerBlue", 0);
        setBooleanField(term137316, term137316.getClass(), "flickerGoUp", false);
        setIntField(term137316, term137316.getClass(), "lastDrawnCenterX", 0);
        setIntField(term137316, term137316.getClass(), "lastDrawnCenterY", 0);
        setField(term137316, term137316.getClass(), "route", null);
        setBooleanField(term137316, term137316.getClass(), "battle", false);
        setIntField(term137316, term137316.getClass(), "wormHoleAnimation", 0);
        setField(term137316, term137316.getClass(), "historyCultures", null);
        setBooleanField(term137316, term137316.getClass(), "historyCoordInitialized", false);
        setIntField(term137316, term137316.getClass(), "historyCoordX", 0);
        setIntField(term137316, term137316.getClass(), "historyCoordY", 0);
        setField(term137316, term137316.getClass(), "leftSpaceImage", null);
        setField(term137316, term137316.getClass(), "rightSpaceImage", null);
        setField(term137316, term137316.getClass(), "popup", null);
        setField(term137316, term137316.getClass(), "tileOverride", null);
        setField(term137316, term137316.getClass(), "redrawTile", null);
        setBooleanField(term137316, term137316.getClass(), "fullDraw", false);
        setIntField(term137316, term137316.getClass(), "cursorFocus", 0);
        setField(term137316, term137316.getClass(), "minimap", null);
        setBooleanField(term137316, term137316.getClass(), "showMiniMap", false);
        setBooleanField(term137316, term137316.getClass(), "highContrastGrid", false);
        setIntField(term137316, term137316.getClass(), "miniMapTopX", 0);
        setIntField(term137316, term137316.getClass(), "miniMapTopY", 0);
        setIntField(term137316, term137316.getClass(), "miniMapBotX", 0);
        setIntField(term137316, term137316.getClass(), "miniMapBotY", 0);
        setIntField(term137316, term137316.getClass(), "transparency", 0);
        setBooleanField(term137316, term137316.getClass(), "improvedParallax", false);
        setBooleanField(term137316, term137316.getClass(), "updateAnimation", false);
        setIntField(term137316, term137316.getClass(), "updateAnimationCount", 0);
        setBooleanField(term137316, term137316.getClass(), "drawWeaponRange", false);
        setField(term137316, term137316.getClass(), "panelType", null);
        setIntField(term137316, term137316.getClass(), "lastCursorPosX", 0);
        setIntField(term137316, term137316.getClass(), "lastCursorPosY", 0);
        setIntField(term137316, term137316.getClass(), "lastZoomLevel", 0);
        setBooleanField(term137316, term137316.getClass(), "redoViewPoints", false);
        setBooleanField(term137316, term137316.getClass(), "isAlignmentXSet", false);
        setFloatField(term137316, term137316.getClass(), "alignmentX", 0.0F);
        setBooleanField(term137316, term137316.getClass(), "isAlignmentYSet", false);
        setFloatField(term137316, term137316.getClass(), "alignmentY", 0.0F);
        setField(term137316, term137316.getClass(), "ui", null);
        setField(term137316, term137316.getClass(), "listenerList", null);
        setField(term137316, term137316.getClass(), "clientProperties", null);
        setField(term137316, term137316.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term137316, term137316.getClass(), "autoscrolls", false);
        setField(term137316, term137316.getClass(), "border", null);
        setIntField(term137316, term137316.getClass(), "flags", 0);
        setField(term137316, term137316.getClass(), "inputVerifier", null);
        setBooleanField(term137316, term137316.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term137316, term137316.getClass(), "paintingChild", null);
        setField(term137316, term137316.getClass(), "popupMenu", null);
        setField(term137316, term137316.getClass(), "revalidateRunnableScheduled", null);
        setField(term137316, term137316.getClass(), "focusInputMap", null);
        setField(term137316, term137316.getClass(), "ancestorInputMap", null);
        setField(term137316, term137316.getClass(), "windowInputMap", null);
        setField(term137316, term137316.getClass(), "actionMap", null);
        setField(term137316, term137316.getClass(), "aaHint", null);
        setField(term137316, term137316.getClass(), "lcdRenderingHint", null);
        setField(term137316, term137316.getClass(), "component", null);
        setField(term137316, term137316.getClass(), "layoutMgr", null);
        setField(term137316, term137316.getClass(), "dispatcher", null);
        setField(term137316, term137316.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term137316, term137316.getClass(), "focusCycleRoot", false);
        setBooleanField(term137316, term137316.getClass(), "focusTraversalPolicyProvider", false);
        setField(term137316, term137316.getClass(), "printingThreads", null);
        setBooleanField(term137316, term137316.getClass(), "printing", false);
        setField(term137316, term137316.getClass(), "containerListener", null);
        setIntField(term137316, term137316.getClass(), "listeningChildren", 0);
        setIntField(term137316, term137316.getClass(), "listeningBoundsChildren", 0);
        setIntField(term137316, term137316.getClass(), "descendantsCount", 0);
        setField(term137316, term137316.getClass(), "preserveBackgroundColor", null);
        setIntField(term137316, term137316.getClass(), "numOfHWComponents", 0);
        setIntField(term137316, term137316.getClass(), "numOfLWComponents", 0);
        setField(term137316, term137316.getClass(), "modalComp", null);
        setField(term137316, term137316.getClass(), "modalAppContext", null);
        setIntField(term137316, term137316.getClass(), "containerSerializedDataVersion", 0);
        setField(term137316, term137316.getClass(), "peer", null);
        setField(term137316, term137316.getClass(), "parent", null);
        setField(term137316, term137316.getClass(), "appContext", null);
        setIntField(term137316, term137316.getClass(), "x", 0);
        setIntField(term137316, term137316.getClass(), "y", 0);
        setIntField(term137316, term137316.getClass(), "width", 0);
        setIntField(term137316, term137316.getClass(), "height", 0);
        setField(term137316, term137316.getClass(), "foreground", null);
        setField(term137316, term137316.getClass(), "background", null);
        setField(term137316, term137316.getClass(), "font", null);
        setField(term137316, term137316.getClass(), "peerFont", null);
        setField(term137316, term137316.getClass(), "cursor", null);
        setField(term137316, term137316.getClass(), "locale", null);
        setField(term137316, term137316.getClass(), "graphicsConfig", null);
        setField(term137316, term137316.getClass(), "bufferStrategy", null);
        setBooleanField(term137316, term137316.getClass(), "ignoreRepaint", false);
        setBooleanField(term137316, term137316.getClass(), "visible", false);
        setBooleanField(term137316, term137316.getClass(), "enabled", false);
        setBooleanField(term137316, term137316.getClass(), "valid", false);
        setField(term137316, term137316.getClass(), "dropTarget", null);
        setField(term137316, term137316.getClass(), "popups", null);
        setField(term137316, term137316.getClass(), "name", null);
        setBooleanField(term137316, term137316.getClass(), "nameExplicitlySet", false);
        setBooleanField(term137316, term137316.getClass(), "focusable", false);
        setIntField(term137316, term137316.getClass(), "isFocusTraversableOverridden", 0);
        setField(term137316, term137316.getClass(), "focusTraversalKeys", null);
        setBooleanField(term137316, term137316.getClass(), "focusTraversalKeysEnabled", false);
        setField(term137316, term137316.getClass(), "acc", null);
        setField(term137316, term137316.getClass(), "minSize", null);
        setBooleanField(term137316, term137316.getClass(), "minSizeSet", false);
        setField(term137316, term137316.getClass(), "prefSize", null);
        setBooleanField(term137316, term137316.getClass(), "prefSizeSet", false);
        setField(term137316, term137316.getClass(), "maxSize", null);
        setBooleanField(term137316, term137316.getClass(), "maxSizeSet", false);
        setField(term137316, term137316.getClass(), "componentOrientation", null);
        setBooleanField(term137316, term137316.getClass(), "newEventsOnly", false);
        setField(term137316, term137316.getClass(), "componentListener", null);
        setField(term137316, term137316.getClass(), "focusListener", null);
        setField(term137316, term137316.getClass(), "hierarchyListener", null);
        setField(term137316, term137316.getClass(), "hierarchyBoundsListener", null);
        setField(term137316, term137316.getClass(), "keyListener", null);
        setField(term137316, term137316.getClass(), "mouseListener", null);
        setField(term137316, term137316.getClass(), "mouseMotionListener", null);
        setField(term137316, term137316.getClass(), "mouseWheelListener", null);
        setField(term137316, term137316.getClass(), "inputMethodListener", null);
        setLongField(term137316, term137316.getClass(), "eventMask", 0L);
        setField(term137316, term137316.getClass(), "changeSupport", null);
        setField(term137316, term137316.getClass(), "objectLock", null);
        setBooleanField(term137316, term137316.getClass(), "isPacked", false);
        setIntField(term137316, term137316.getClass(), "boundsOp", 0);
        setField(term137316, term137316.getClass(), "compoundShape", null);
        setField(term137316, term137316.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term137316, term137316.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term137316, term137316.getClass(), "backgroundEraseDisabled", false);
        setField(term137316, term137316.getClass(), "eventCache", null);
        setBooleanField(term137316, term137316.getClass(), "coalescingEnabled", false);
        setBooleanField(term137316, term137316.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term137316, term137316.getClass(), "componentSerializedDataVersion", 0);
        setField(term137316, term137316.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultHeight", argTypes, term137316, args);
    }

};


