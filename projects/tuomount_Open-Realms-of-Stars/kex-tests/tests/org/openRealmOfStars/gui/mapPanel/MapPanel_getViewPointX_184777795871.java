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

public class MapPanel_getViewPointX_184777795871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138190;

    public MapPanel_getViewPointX_184777795871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138190 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term138190, term138190.getClass(), "viewPointX", 0);
        setIntField(term138190, term138190.getClass(), "viewPointY", 0);
        setIntField(term138190, term138190.getClass(), "viewPointOffsetX", 0);
        setIntField(term138190, term138190.getClass(), "viewPointOffsetY", 0);
        setField(term138190, term138190.getClass(), "screen", null);
        setField(term138190, term138190.getClass(), "backgroundScreen", null);
        setIntField(term138190, term138190.getClass(), "flickerBlue", 0);
        setBooleanField(term138190, term138190.getClass(), "flickerGoUp", false);
        setIntField(term138190, term138190.getClass(), "lastDrawnCenterX", 0);
        setIntField(term138190, term138190.getClass(), "lastDrawnCenterY", 0);
        setField(term138190, term138190.getClass(), "route", null);
        setBooleanField(term138190, term138190.getClass(), "battle", false);
        setIntField(term138190, term138190.getClass(), "wormHoleAnimation", 0);
        setField(term138190, term138190.getClass(), "historyCultures", null);
        setBooleanField(term138190, term138190.getClass(), "historyCoordInitialized", false);
        setIntField(term138190, term138190.getClass(), "historyCoordX", 0);
        setIntField(term138190, term138190.getClass(), "historyCoordY", 0);
        setField(term138190, term138190.getClass(), "leftSpaceImage", null);
        setField(term138190, term138190.getClass(), "rightSpaceImage", null);
        setField(term138190, term138190.getClass(), "popup", null);
        setField(term138190, term138190.getClass(), "tileOverride", null);
        setField(term138190, term138190.getClass(), "redrawTile", null);
        setBooleanField(term138190, term138190.getClass(), "fullDraw", false);
        setIntField(term138190, term138190.getClass(), "cursorFocus", 0);
        setField(term138190, term138190.getClass(), "minimap", null);
        setBooleanField(term138190, term138190.getClass(), "showMiniMap", false);
        setBooleanField(term138190, term138190.getClass(), "highContrastGrid", false);
        setIntField(term138190, term138190.getClass(), "miniMapTopX", 0);
        setIntField(term138190, term138190.getClass(), "miniMapTopY", 0);
        setIntField(term138190, term138190.getClass(), "miniMapBotX", 0);
        setIntField(term138190, term138190.getClass(), "miniMapBotY", 0);
        setIntField(term138190, term138190.getClass(), "transparency", 0);
        setBooleanField(term138190, term138190.getClass(), "improvedParallax", false);
        setBooleanField(term138190, term138190.getClass(), "updateAnimation", false);
        setIntField(term138190, term138190.getClass(), "updateAnimationCount", 0);
        setBooleanField(term138190, term138190.getClass(), "drawWeaponRange", false);
        setField(term138190, term138190.getClass(), "panelType", null);
        setIntField(term138190, term138190.getClass(), "lastCursorPosX", 0);
        setIntField(term138190, term138190.getClass(), "lastCursorPosY", 0);
        setIntField(term138190, term138190.getClass(), "lastZoomLevel", 0);
        setBooleanField(term138190, term138190.getClass(), "redoViewPoints", false);
        setBooleanField(term138190, term138190.getClass(), "isAlignmentXSet", false);
        setFloatField(term138190, term138190.getClass(), "alignmentX", 0.0F);
        setBooleanField(term138190, term138190.getClass(), "isAlignmentYSet", false);
        setFloatField(term138190, term138190.getClass(), "alignmentY", 0.0F);
        setField(term138190, term138190.getClass(), "ui", null);
        setField(term138190, term138190.getClass(), "listenerList", null);
        setField(term138190, term138190.getClass(), "clientProperties", null);
        setField(term138190, term138190.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term138190, term138190.getClass(), "autoscrolls", false);
        setField(term138190, term138190.getClass(), "border", null);
        setIntField(term138190, term138190.getClass(), "flags", 0);
        setField(term138190, term138190.getClass(), "inputVerifier", null);
        setBooleanField(term138190, term138190.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term138190, term138190.getClass(), "paintingChild", null);
        setField(term138190, term138190.getClass(), "popupMenu", null);
        setField(term138190, term138190.getClass(), "revalidateRunnableScheduled", null);
        setField(term138190, term138190.getClass(), "focusInputMap", null);
        setField(term138190, term138190.getClass(), "ancestorInputMap", null);
        setField(term138190, term138190.getClass(), "windowInputMap", null);
        setField(term138190, term138190.getClass(), "actionMap", null);
        setField(term138190, term138190.getClass(), "aaHint", null);
        setField(term138190, term138190.getClass(), "lcdRenderingHint", null);
        setField(term138190, term138190.getClass(), "component", null);
        setField(term138190, term138190.getClass(), "layoutMgr", null);
        setField(term138190, term138190.getClass(), "dispatcher", null);
        setField(term138190, term138190.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term138190, term138190.getClass(), "focusCycleRoot", false);
        setBooleanField(term138190, term138190.getClass(), "focusTraversalPolicyProvider", false);
        setField(term138190, term138190.getClass(), "printingThreads", null);
        setBooleanField(term138190, term138190.getClass(), "printing", false);
        setField(term138190, term138190.getClass(), "containerListener", null);
        setIntField(term138190, term138190.getClass(), "listeningChildren", 0);
        setIntField(term138190, term138190.getClass(), "listeningBoundsChildren", 0);
        setIntField(term138190, term138190.getClass(), "descendantsCount", 0);
        setField(term138190, term138190.getClass(), "preserveBackgroundColor", null);
        setIntField(term138190, term138190.getClass(), "numOfHWComponents", 0);
        setIntField(term138190, term138190.getClass(), "numOfLWComponents", 0);
        setField(term138190, term138190.getClass(), "modalComp", null);
        setField(term138190, term138190.getClass(), "modalAppContext", null);
        setIntField(term138190, term138190.getClass(), "containerSerializedDataVersion", 0);
        setField(term138190, term138190.getClass(), "peer", null);
        setField(term138190, term138190.getClass(), "parent", null);
        setField(term138190, term138190.getClass(), "appContext", null);
        setIntField(term138190, term138190.getClass(), "x", 0);
        setIntField(term138190, term138190.getClass(), "y", 0);
        setIntField(term138190, term138190.getClass(), "width", 0);
        setIntField(term138190, term138190.getClass(), "height", 0);
        setField(term138190, term138190.getClass(), "foreground", null);
        setField(term138190, term138190.getClass(), "background", null);
        setField(term138190, term138190.getClass(), "font", null);
        setField(term138190, term138190.getClass(), "peerFont", null);
        setField(term138190, term138190.getClass(), "cursor", null);
        setField(term138190, term138190.getClass(), "locale", null);
        setField(term138190, term138190.getClass(), "graphicsConfig", null);
        setField(term138190, term138190.getClass(), "bufferStrategy", null);
        setBooleanField(term138190, term138190.getClass(), "ignoreRepaint", false);
        setBooleanField(term138190, term138190.getClass(), "visible", false);
        setBooleanField(term138190, term138190.getClass(), "enabled", false);
        setBooleanField(term138190, term138190.getClass(), "valid", false);
        setField(term138190, term138190.getClass(), "dropTarget", null);
        setField(term138190, term138190.getClass(), "popups", null);
        setField(term138190, term138190.getClass(), "name", null);
        setBooleanField(term138190, term138190.getClass(), "nameExplicitlySet", false);
        setBooleanField(term138190, term138190.getClass(), "focusable", false);
        setIntField(term138190, term138190.getClass(), "isFocusTraversableOverridden", 0);
        setField(term138190, term138190.getClass(), "focusTraversalKeys", null);
        setBooleanField(term138190, term138190.getClass(), "focusTraversalKeysEnabled", false);
        setField(term138190, term138190.getClass(), "acc", null);
        setField(term138190, term138190.getClass(), "minSize", null);
        setBooleanField(term138190, term138190.getClass(), "minSizeSet", false);
        setField(term138190, term138190.getClass(), "prefSize", null);
        setBooleanField(term138190, term138190.getClass(), "prefSizeSet", false);
        setField(term138190, term138190.getClass(), "maxSize", null);
        setBooleanField(term138190, term138190.getClass(), "maxSizeSet", false);
        setField(term138190, term138190.getClass(), "componentOrientation", null);
        setBooleanField(term138190, term138190.getClass(), "newEventsOnly", false);
        setField(term138190, term138190.getClass(), "componentListener", null);
        setField(term138190, term138190.getClass(), "focusListener", null);
        setField(term138190, term138190.getClass(), "hierarchyListener", null);
        setField(term138190, term138190.getClass(), "hierarchyBoundsListener", null);
        setField(term138190, term138190.getClass(), "keyListener", null);
        setField(term138190, term138190.getClass(), "mouseListener", null);
        setField(term138190, term138190.getClass(), "mouseMotionListener", null);
        setField(term138190, term138190.getClass(), "mouseWheelListener", null);
        setField(term138190, term138190.getClass(), "inputMethodListener", null);
        setLongField(term138190, term138190.getClass(), "eventMask", 0L);
        setField(term138190, term138190.getClass(), "changeSupport", null);
        setField(term138190, term138190.getClass(), "objectLock", null);
        setBooleanField(term138190, term138190.getClass(), "isPacked", false);
        setIntField(term138190, term138190.getClass(), "boundsOp", 0);
        setField(term138190, term138190.getClass(), "compoundShape", null);
        setField(term138190, term138190.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term138190, term138190.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term138190, term138190.getClass(), "backgroundEraseDisabled", false);
        setField(term138190, term138190.getClass(), "eventCache", null);
        setBooleanField(term138190, term138190.getClass(), "coalescingEnabled", false);
        setBooleanField(term138190, term138190.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term138190, term138190.getClass(), "componentSerializedDataVersion", 0);
        setField(term138190, term138190.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getViewPointX", argTypes, term138190, args);
    }

};


