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

public class MapPanel_getViewPointY_184777891972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138261;

    public MapPanel_getViewPointY_184777891972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138261 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term138261, term138261.getClass(), "viewPointX", 0);
        setIntField(term138261, term138261.getClass(), "viewPointY", 0);
        setIntField(term138261, term138261.getClass(), "viewPointOffsetX", 0);
        setIntField(term138261, term138261.getClass(), "viewPointOffsetY", 0);
        setField(term138261, term138261.getClass(), "screen", null);
        setField(term138261, term138261.getClass(), "backgroundScreen", null);
        setIntField(term138261, term138261.getClass(), "flickerBlue", 0);
        setBooleanField(term138261, term138261.getClass(), "flickerGoUp", false);
        setIntField(term138261, term138261.getClass(), "lastDrawnCenterX", 0);
        setIntField(term138261, term138261.getClass(), "lastDrawnCenterY", 0);
        setField(term138261, term138261.getClass(), "route", null);
        setBooleanField(term138261, term138261.getClass(), "battle", false);
        setIntField(term138261, term138261.getClass(), "wormHoleAnimation", 0);
        setField(term138261, term138261.getClass(), "historyCultures", null);
        setBooleanField(term138261, term138261.getClass(), "historyCoordInitialized", false);
        setIntField(term138261, term138261.getClass(), "historyCoordX", 0);
        setIntField(term138261, term138261.getClass(), "historyCoordY", 0);
        setField(term138261, term138261.getClass(), "leftSpaceImage", null);
        setField(term138261, term138261.getClass(), "rightSpaceImage", null);
        setField(term138261, term138261.getClass(), "popup", null);
        setField(term138261, term138261.getClass(), "tileOverride", null);
        setField(term138261, term138261.getClass(), "redrawTile", null);
        setBooleanField(term138261, term138261.getClass(), "fullDraw", false);
        setIntField(term138261, term138261.getClass(), "cursorFocus", 0);
        setField(term138261, term138261.getClass(), "minimap", null);
        setBooleanField(term138261, term138261.getClass(), "showMiniMap", false);
        setBooleanField(term138261, term138261.getClass(), "highContrastGrid", false);
        setIntField(term138261, term138261.getClass(), "miniMapTopX", 0);
        setIntField(term138261, term138261.getClass(), "miniMapTopY", 0);
        setIntField(term138261, term138261.getClass(), "miniMapBotX", 0);
        setIntField(term138261, term138261.getClass(), "miniMapBotY", 0);
        setIntField(term138261, term138261.getClass(), "transparency", 0);
        setBooleanField(term138261, term138261.getClass(), "improvedParallax", false);
        setBooleanField(term138261, term138261.getClass(), "updateAnimation", false);
        setIntField(term138261, term138261.getClass(), "updateAnimationCount", 0);
        setBooleanField(term138261, term138261.getClass(), "drawWeaponRange", false);
        setField(term138261, term138261.getClass(), "panelType", null);
        setIntField(term138261, term138261.getClass(), "lastCursorPosX", 0);
        setIntField(term138261, term138261.getClass(), "lastCursorPosY", 0);
        setIntField(term138261, term138261.getClass(), "lastZoomLevel", 0);
        setBooleanField(term138261, term138261.getClass(), "redoViewPoints", false);
        setBooleanField(term138261, term138261.getClass(), "isAlignmentXSet", false);
        setFloatField(term138261, term138261.getClass(), "alignmentX", 0.0F);
        setBooleanField(term138261, term138261.getClass(), "isAlignmentYSet", false);
        setFloatField(term138261, term138261.getClass(), "alignmentY", 0.0F);
        setField(term138261, term138261.getClass(), "ui", null);
        setField(term138261, term138261.getClass(), "listenerList", null);
        setField(term138261, term138261.getClass(), "clientProperties", null);
        setField(term138261, term138261.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term138261, term138261.getClass(), "autoscrolls", false);
        setField(term138261, term138261.getClass(), "border", null);
        setIntField(term138261, term138261.getClass(), "flags", 0);
        setField(term138261, term138261.getClass(), "inputVerifier", null);
        setBooleanField(term138261, term138261.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term138261, term138261.getClass(), "paintingChild", null);
        setField(term138261, term138261.getClass(), "popupMenu", null);
        setField(term138261, term138261.getClass(), "revalidateRunnableScheduled", null);
        setField(term138261, term138261.getClass(), "focusInputMap", null);
        setField(term138261, term138261.getClass(), "ancestorInputMap", null);
        setField(term138261, term138261.getClass(), "windowInputMap", null);
        setField(term138261, term138261.getClass(), "actionMap", null);
        setField(term138261, term138261.getClass(), "aaHint", null);
        setField(term138261, term138261.getClass(), "lcdRenderingHint", null);
        setField(term138261, term138261.getClass(), "component", null);
        setField(term138261, term138261.getClass(), "layoutMgr", null);
        setField(term138261, term138261.getClass(), "dispatcher", null);
        setField(term138261, term138261.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term138261, term138261.getClass(), "focusCycleRoot", false);
        setBooleanField(term138261, term138261.getClass(), "focusTraversalPolicyProvider", false);
        setField(term138261, term138261.getClass(), "printingThreads", null);
        setBooleanField(term138261, term138261.getClass(), "printing", false);
        setField(term138261, term138261.getClass(), "containerListener", null);
        setIntField(term138261, term138261.getClass(), "listeningChildren", 0);
        setIntField(term138261, term138261.getClass(), "listeningBoundsChildren", 0);
        setIntField(term138261, term138261.getClass(), "descendantsCount", 0);
        setField(term138261, term138261.getClass(), "preserveBackgroundColor", null);
        setIntField(term138261, term138261.getClass(), "numOfHWComponents", 0);
        setIntField(term138261, term138261.getClass(), "numOfLWComponents", 0);
        setField(term138261, term138261.getClass(), "modalComp", null);
        setField(term138261, term138261.getClass(), "modalAppContext", null);
        setIntField(term138261, term138261.getClass(), "containerSerializedDataVersion", 0);
        setField(term138261, term138261.getClass(), "peer", null);
        setField(term138261, term138261.getClass(), "parent", null);
        setField(term138261, term138261.getClass(), "appContext", null);
        setIntField(term138261, term138261.getClass(), "x", 0);
        setIntField(term138261, term138261.getClass(), "y", 0);
        setIntField(term138261, term138261.getClass(), "width", 0);
        setIntField(term138261, term138261.getClass(), "height", 0);
        setField(term138261, term138261.getClass(), "foreground", null);
        setField(term138261, term138261.getClass(), "background", null);
        setField(term138261, term138261.getClass(), "font", null);
        setField(term138261, term138261.getClass(), "peerFont", null);
        setField(term138261, term138261.getClass(), "cursor", null);
        setField(term138261, term138261.getClass(), "locale", null);
        setField(term138261, term138261.getClass(), "graphicsConfig", null);
        setField(term138261, term138261.getClass(), "bufferStrategy", null);
        setBooleanField(term138261, term138261.getClass(), "ignoreRepaint", false);
        setBooleanField(term138261, term138261.getClass(), "visible", false);
        setBooleanField(term138261, term138261.getClass(), "enabled", false);
        setBooleanField(term138261, term138261.getClass(), "valid", false);
        setField(term138261, term138261.getClass(), "dropTarget", null);
        setField(term138261, term138261.getClass(), "popups", null);
        setField(term138261, term138261.getClass(), "name", null);
        setBooleanField(term138261, term138261.getClass(), "nameExplicitlySet", false);
        setBooleanField(term138261, term138261.getClass(), "focusable", false);
        setIntField(term138261, term138261.getClass(), "isFocusTraversableOverridden", 0);
        setField(term138261, term138261.getClass(), "focusTraversalKeys", null);
        setBooleanField(term138261, term138261.getClass(), "focusTraversalKeysEnabled", false);
        setField(term138261, term138261.getClass(), "acc", null);
        setField(term138261, term138261.getClass(), "minSize", null);
        setBooleanField(term138261, term138261.getClass(), "minSizeSet", false);
        setField(term138261, term138261.getClass(), "prefSize", null);
        setBooleanField(term138261, term138261.getClass(), "prefSizeSet", false);
        setField(term138261, term138261.getClass(), "maxSize", null);
        setBooleanField(term138261, term138261.getClass(), "maxSizeSet", false);
        setField(term138261, term138261.getClass(), "componentOrientation", null);
        setBooleanField(term138261, term138261.getClass(), "newEventsOnly", false);
        setField(term138261, term138261.getClass(), "componentListener", null);
        setField(term138261, term138261.getClass(), "focusListener", null);
        setField(term138261, term138261.getClass(), "hierarchyListener", null);
        setField(term138261, term138261.getClass(), "hierarchyBoundsListener", null);
        setField(term138261, term138261.getClass(), "keyListener", null);
        setField(term138261, term138261.getClass(), "mouseListener", null);
        setField(term138261, term138261.getClass(), "mouseMotionListener", null);
        setField(term138261, term138261.getClass(), "mouseWheelListener", null);
        setField(term138261, term138261.getClass(), "inputMethodListener", null);
        setLongField(term138261, term138261.getClass(), "eventMask", 0L);
        setField(term138261, term138261.getClass(), "changeSupport", null);
        setField(term138261, term138261.getClass(), "objectLock", null);
        setBooleanField(term138261, term138261.getClass(), "isPacked", false);
        setIntField(term138261, term138261.getClass(), "boundsOp", 0);
        setField(term138261, term138261.getClass(), "compoundShape", null);
        setField(term138261, term138261.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term138261, term138261.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term138261, term138261.getClass(), "backgroundEraseDisabled", false);
        setField(term138261, term138261.getClass(), "eventCache", null);
        setBooleanField(term138261, term138261.getClass(), "coalescingEnabled", false);
        setBooleanField(term138261, term138261.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term138261, term138261.getClass(), "componentSerializedDataVersion", 0);
        setField(term138261, term138261.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getViewPointY", argTypes, term138261, args);
    }

};


