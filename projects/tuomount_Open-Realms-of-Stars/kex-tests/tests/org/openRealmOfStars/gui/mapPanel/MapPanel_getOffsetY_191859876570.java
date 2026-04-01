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

public class MapPanel_getOffsetY_191859876570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138119;

    public MapPanel_getOffsetY_191859876570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138119 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term138119, term138119.getClass(), "viewPointX", 0);
        setIntField(term138119, term138119.getClass(), "viewPointY", 0);
        setIntField(term138119, term138119.getClass(), "viewPointOffsetX", 0);
        setIntField(term138119, term138119.getClass(), "viewPointOffsetY", 0);
        setField(term138119, term138119.getClass(), "screen", null);
        setField(term138119, term138119.getClass(), "backgroundScreen", null);
        setIntField(term138119, term138119.getClass(), "flickerBlue", 0);
        setBooleanField(term138119, term138119.getClass(), "flickerGoUp", false);
        setIntField(term138119, term138119.getClass(), "lastDrawnCenterX", 0);
        setIntField(term138119, term138119.getClass(), "lastDrawnCenterY", 0);
        setField(term138119, term138119.getClass(), "route", null);
        setBooleanField(term138119, term138119.getClass(), "battle", false);
        setIntField(term138119, term138119.getClass(), "wormHoleAnimation", 0);
        setField(term138119, term138119.getClass(), "historyCultures", null);
        setBooleanField(term138119, term138119.getClass(), "historyCoordInitialized", false);
        setIntField(term138119, term138119.getClass(), "historyCoordX", 0);
        setIntField(term138119, term138119.getClass(), "historyCoordY", 0);
        setField(term138119, term138119.getClass(), "leftSpaceImage", null);
        setField(term138119, term138119.getClass(), "rightSpaceImage", null);
        setField(term138119, term138119.getClass(), "popup", null);
        setField(term138119, term138119.getClass(), "tileOverride", null);
        setField(term138119, term138119.getClass(), "redrawTile", null);
        setBooleanField(term138119, term138119.getClass(), "fullDraw", false);
        setIntField(term138119, term138119.getClass(), "cursorFocus", 0);
        setField(term138119, term138119.getClass(), "minimap", null);
        setBooleanField(term138119, term138119.getClass(), "showMiniMap", false);
        setBooleanField(term138119, term138119.getClass(), "highContrastGrid", false);
        setIntField(term138119, term138119.getClass(), "miniMapTopX", 0);
        setIntField(term138119, term138119.getClass(), "miniMapTopY", 0);
        setIntField(term138119, term138119.getClass(), "miniMapBotX", 0);
        setIntField(term138119, term138119.getClass(), "miniMapBotY", 0);
        setIntField(term138119, term138119.getClass(), "transparency", 0);
        setBooleanField(term138119, term138119.getClass(), "improvedParallax", false);
        setBooleanField(term138119, term138119.getClass(), "updateAnimation", false);
        setIntField(term138119, term138119.getClass(), "updateAnimationCount", 0);
        setBooleanField(term138119, term138119.getClass(), "drawWeaponRange", false);
        setField(term138119, term138119.getClass(), "panelType", null);
        setIntField(term138119, term138119.getClass(), "lastCursorPosX", 0);
        setIntField(term138119, term138119.getClass(), "lastCursorPosY", 0);
        setIntField(term138119, term138119.getClass(), "lastZoomLevel", 0);
        setBooleanField(term138119, term138119.getClass(), "redoViewPoints", false);
        setBooleanField(term138119, term138119.getClass(), "isAlignmentXSet", false);
        setFloatField(term138119, term138119.getClass(), "alignmentX", 0.0F);
        setBooleanField(term138119, term138119.getClass(), "isAlignmentYSet", false);
        setFloatField(term138119, term138119.getClass(), "alignmentY", 0.0F);
        setField(term138119, term138119.getClass(), "ui", null);
        setField(term138119, term138119.getClass(), "listenerList", null);
        setField(term138119, term138119.getClass(), "clientProperties", null);
        setField(term138119, term138119.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term138119, term138119.getClass(), "autoscrolls", false);
        setField(term138119, term138119.getClass(), "border", null);
        setIntField(term138119, term138119.getClass(), "flags", 0);
        setField(term138119, term138119.getClass(), "inputVerifier", null);
        setBooleanField(term138119, term138119.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term138119, term138119.getClass(), "paintingChild", null);
        setField(term138119, term138119.getClass(), "popupMenu", null);
        setField(term138119, term138119.getClass(), "revalidateRunnableScheduled", null);
        setField(term138119, term138119.getClass(), "focusInputMap", null);
        setField(term138119, term138119.getClass(), "ancestorInputMap", null);
        setField(term138119, term138119.getClass(), "windowInputMap", null);
        setField(term138119, term138119.getClass(), "actionMap", null);
        setField(term138119, term138119.getClass(), "aaHint", null);
        setField(term138119, term138119.getClass(), "lcdRenderingHint", null);
        setField(term138119, term138119.getClass(), "component", null);
        setField(term138119, term138119.getClass(), "layoutMgr", null);
        setField(term138119, term138119.getClass(), "dispatcher", null);
        setField(term138119, term138119.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term138119, term138119.getClass(), "focusCycleRoot", false);
        setBooleanField(term138119, term138119.getClass(), "focusTraversalPolicyProvider", false);
        setField(term138119, term138119.getClass(), "printingThreads", null);
        setBooleanField(term138119, term138119.getClass(), "printing", false);
        setField(term138119, term138119.getClass(), "containerListener", null);
        setIntField(term138119, term138119.getClass(), "listeningChildren", 0);
        setIntField(term138119, term138119.getClass(), "listeningBoundsChildren", 0);
        setIntField(term138119, term138119.getClass(), "descendantsCount", 0);
        setField(term138119, term138119.getClass(), "preserveBackgroundColor", null);
        setIntField(term138119, term138119.getClass(), "numOfHWComponents", 0);
        setIntField(term138119, term138119.getClass(), "numOfLWComponents", 0);
        setField(term138119, term138119.getClass(), "modalComp", null);
        setField(term138119, term138119.getClass(), "modalAppContext", null);
        setIntField(term138119, term138119.getClass(), "containerSerializedDataVersion", 0);
        setField(term138119, term138119.getClass(), "peer", null);
        setField(term138119, term138119.getClass(), "parent", null);
        setField(term138119, term138119.getClass(), "appContext", null);
        setIntField(term138119, term138119.getClass(), "x", 0);
        setIntField(term138119, term138119.getClass(), "y", 0);
        setIntField(term138119, term138119.getClass(), "width", 0);
        setIntField(term138119, term138119.getClass(), "height", 0);
        setField(term138119, term138119.getClass(), "foreground", null);
        setField(term138119, term138119.getClass(), "background", null);
        setField(term138119, term138119.getClass(), "font", null);
        setField(term138119, term138119.getClass(), "peerFont", null);
        setField(term138119, term138119.getClass(), "cursor", null);
        setField(term138119, term138119.getClass(), "locale", null);
        setField(term138119, term138119.getClass(), "graphicsConfig", null);
        setField(term138119, term138119.getClass(), "bufferStrategy", null);
        setBooleanField(term138119, term138119.getClass(), "ignoreRepaint", false);
        setBooleanField(term138119, term138119.getClass(), "visible", false);
        setBooleanField(term138119, term138119.getClass(), "enabled", false);
        setBooleanField(term138119, term138119.getClass(), "valid", false);
        setField(term138119, term138119.getClass(), "dropTarget", null);
        setField(term138119, term138119.getClass(), "popups", null);
        setField(term138119, term138119.getClass(), "name", null);
        setBooleanField(term138119, term138119.getClass(), "nameExplicitlySet", false);
        setBooleanField(term138119, term138119.getClass(), "focusable", false);
        setIntField(term138119, term138119.getClass(), "isFocusTraversableOverridden", 0);
        setField(term138119, term138119.getClass(), "focusTraversalKeys", null);
        setBooleanField(term138119, term138119.getClass(), "focusTraversalKeysEnabled", false);
        setField(term138119, term138119.getClass(), "acc", null);
        setField(term138119, term138119.getClass(), "minSize", null);
        setBooleanField(term138119, term138119.getClass(), "minSizeSet", false);
        setField(term138119, term138119.getClass(), "prefSize", null);
        setBooleanField(term138119, term138119.getClass(), "prefSizeSet", false);
        setField(term138119, term138119.getClass(), "maxSize", null);
        setBooleanField(term138119, term138119.getClass(), "maxSizeSet", false);
        setField(term138119, term138119.getClass(), "componentOrientation", null);
        setBooleanField(term138119, term138119.getClass(), "newEventsOnly", false);
        setField(term138119, term138119.getClass(), "componentListener", null);
        setField(term138119, term138119.getClass(), "focusListener", null);
        setField(term138119, term138119.getClass(), "hierarchyListener", null);
        setField(term138119, term138119.getClass(), "hierarchyBoundsListener", null);
        setField(term138119, term138119.getClass(), "keyListener", null);
        setField(term138119, term138119.getClass(), "mouseListener", null);
        setField(term138119, term138119.getClass(), "mouseMotionListener", null);
        setField(term138119, term138119.getClass(), "mouseWheelListener", null);
        setField(term138119, term138119.getClass(), "inputMethodListener", null);
        setLongField(term138119, term138119.getClass(), "eventMask", 0L);
        setField(term138119, term138119.getClass(), "changeSupport", null);
        setField(term138119, term138119.getClass(), "objectLock", null);
        setBooleanField(term138119, term138119.getClass(), "isPacked", false);
        setIntField(term138119, term138119.getClass(), "boundsOp", 0);
        setField(term138119, term138119.getClass(), "compoundShape", null);
        setField(term138119, term138119.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term138119, term138119.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term138119, term138119.getClass(), "backgroundEraseDisabled", false);
        setField(term138119, term138119.getClass(), "eventCache", null);
        setBooleanField(term138119, term138119.getClass(), "coalescingEnabled", false);
        setBooleanField(term138119, term138119.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term138119, term138119.getClass(), "componentSerializedDataVersion", 0);
        setField(term138119, term138119.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOffsetY", argTypes, term138119, args);
    }

};


