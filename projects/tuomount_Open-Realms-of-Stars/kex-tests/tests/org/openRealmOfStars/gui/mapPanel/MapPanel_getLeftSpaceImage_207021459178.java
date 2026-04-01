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

public class MapPanel_getLeftSpaceImage_207021459178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138691;

    public MapPanel_getLeftSpaceImage_207021459178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138691 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term138691, term138691.getClass(), "viewPointX", 0);
        setIntField(term138691, term138691.getClass(), "viewPointY", 0);
        setIntField(term138691, term138691.getClass(), "viewPointOffsetX", 0);
        setIntField(term138691, term138691.getClass(), "viewPointOffsetY", 0);
        setField(term138691, term138691.getClass(), "screen", null);
        setField(term138691, term138691.getClass(), "backgroundScreen", null);
        setIntField(term138691, term138691.getClass(), "flickerBlue", 0);
        setBooleanField(term138691, term138691.getClass(), "flickerGoUp", false);
        setIntField(term138691, term138691.getClass(), "lastDrawnCenterX", 0);
        setIntField(term138691, term138691.getClass(), "lastDrawnCenterY", 0);
        setField(term138691, term138691.getClass(), "route", null);
        setBooleanField(term138691, term138691.getClass(), "battle", false);
        setIntField(term138691, term138691.getClass(), "wormHoleAnimation", 0);
        setField(term138691, term138691.getClass(), "historyCultures", null);
        setBooleanField(term138691, term138691.getClass(), "historyCoordInitialized", false);
        setIntField(term138691, term138691.getClass(), "historyCoordX", 0);
        setIntField(term138691, term138691.getClass(), "historyCoordY", 0);
        setField(term138691, term138691.getClass(), "leftSpaceImage", null);
        setField(term138691, term138691.getClass(), "rightSpaceImage", null);
        setField(term138691, term138691.getClass(), "popup", null);
        setField(term138691, term138691.getClass(), "tileOverride", null);
        setField(term138691, term138691.getClass(), "redrawTile", null);
        setBooleanField(term138691, term138691.getClass(), "fullDraw", false);
        setIntField(term138691, term138691.getClass(), "cursorFocus", 0);
        setField(term138691, term138691.getClass(), "minimap", null);
        setBooleanField(term138691, term138691.getClass(), "showMiniMap", false);
        setBooleanField(term138691, term138691.getClass(), "highContrastGrid", false);
        setIntField(term138691, term138691.getClass(), "miniMapTopX", 0);
        setIntField(term138691, term138691.getClass(), "miniMapTopY", 0);
        setIntField(term138691, term138691.getClass(), "miniMapBotX", 0);
        setIntField(term138691, term138691.getClass(), "miniMapBotY", 0);
        setIntField(term138691, term138691.getClass(), "transparency", 0);
        setBooleanField(term138691, term138691.getClass(), "improvedParallax", false);
        setBooleanField(term138691, term138691.getClass(), "updateAnimation", false);
        setIntField(term138691, term138691.getClass(), "updateAnimationCount", 0);
        setBooleanField(term138691, term138691.getClass(), "drawWeaponRange", false);
        setField(term138691, term138691.getClass(), "panelType", null);
        setIntField(term138691, term138691.getClass(), "lastCursorPosX", 0);
        setIntField(term138691, term138691.getClass(), "lastCursorPosY", 0);
        setIntField(term138691, term138691.getClass(), "lastZoomLevel", 0);
        setBooleanField(term138691, term138691.getClass(), "redoViewPoints", false);
        setBooleanField(term138691, term138691.getClass(), "isAlignmentXSet", false);
        setFloatField(term138691, term138691.getClass(), "alignmentX", 0.0F);
        setBooleanField(term138691, term138691.getClass(), "isAlignmentYSet", false);
        setFloatField(term138691, term138691.getClass(), "alignmentY", 0.0F);
        setField(term138691, term138691.getClass(), "ui", null);
        setField(term138691, term138691.getClass(), "listenerList", null);
        setField(term138691, term138691.getClass(), "clientProperties", null);
        setField(term138691, term138691.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term138691, term138691.getClass(), "autoscrolls", false);
        setField(term138691, term138691.getClass(), "border", null);
        setIntField(term138691, term138691.getClass(), "flags", 0);
        setField(term138691, term138691.getClass(), "inputVerifier", null);
        setBooleanField(term138691, term138691.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term138691, term138691.getClass(), "paintingChild", null);
        setField(term138691, term138691.getClass(), "popupMenu", null);
        setField(term138691, term138691.getClass(), "revalidateRunnableScheduled", null);
        setField(term138691, term138691.getClass(), "focusInputMap", null);
        setField(term138691, term138691.getClass(), "ancestorInputMap", null);
        setField(term138691, term138691.getClass(), "windowInputMap", null);
        setField(term138691, term138691.getClass(), "actionMap", null);
        setField(term138691, term138691.getClass(), "aaHint", null);
        setField(term138691, term138691.getClass(), "lcdRenderingHint", null);
        setField(term138691, term138691.getClass(), "component", null);
        setField(term138691, term138691.getClass(), "layoutMgr", null);
        setField(term138691, term138691.getClass(), "dispatcher", null);
        setField(term138691, term138691.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term138691, term138691.getClass(), "focusCycleRoot", false);
        setBooleanField(term138691, term138691.getClass(), "focusTraversalPolicyProvider", false);
        setField(term138691, term138691.getClass(), "printingThreads", null);
        setBooleanField(term138691, term138691.getClass(), "printing", false);
        setField(term138691, term138691.getClass(), "containerListener", null);
        setIntField(term138691, term138691.getClass(), "listeningChildren", 0);
        setIntField(term138691, term138691.getClass(), "listeningBoundsChildren", 0);
        setIntField(term138691, term138691.getClass(), "descendantsCount", 0);
        setField(term138691, term138691.getClass(), "preserveBackgroundColor", null);
        setIntField(term138691, term138691.getClass(), "numOfHWComponents", 0);
        setIntField(term138691, term138691.getClass(), "numOfLWComponents", 0);
        setField(term138691, term138691.getClass(), "modalComp", null);
        setField(term138691, term138691.getClass(), "modalAppContext", null);
        setIntField(term138691, term138691.getClass(), "containerSerializedDataVersion", 0);
        setField(term138691, term138691.getClass(), "peer", null);
        setField(term138691, term138691.getClass(), "parent", null);
        setField(term138691, term138691.getClass(), "appContext", null);
        setIntField(term138691, term138691.getClass(), "x", 0);
        setIntField(term138691, term138691.getClass(), "y", 0);
        setIntField(term138691, term138691.getClass(), "width", 0);
        setIntField(term138691, term138691.getClass(), "height", 0);
        setField(term138691, term138691.getClass(), "foreground", null);
        setField(term138691, term138691.getClass(), "background", null);
        setField(term138691, term138691.getClass(), "font", null);
        setField(term138691, term138691.getClass(), "peerFont", null);
        setField(term138691, term138691.getClass(), "cursor", null);
        setField(term138691, term138691.getClass(), "locale", null);
        setField(term138691, term138691.getClass(), "graphicsConfig", null);
        setField(term138691, term138691.getClass(), "bufferStrategy", null);
        setBooleanField(term138691, term138691.getClass(), "ignoreRepaint", false);
        setBooleanField(term138691, term138691.getClass(), "visible", false);
        setBooleanField(term138691, term138691.getClass(), "enabled", false);
        setBooleanField(term138691, term138691.getClass(), "valid", false);
        setField(term138691, term138691.getClass(), "dropTarget", null);
        setField(term138691, term138691.getClass(), "popups", null);
        setField(term138691, term138691.getClass(), "name", null);
        setBooleanField(term138691, term138691.getClass(), "nameExplicitlySet", false);
        setBooleanField(term138691, term138691.getClass(), "focusable", false);
        setIntField(term138691, term138691.getClass(), "isFocusTraversableOverridden", 0);
        setField(term138691, term138691.getClass(), "focusTraversalKeys", null);
        setBooleanField(term138691, term138691.getClass(), "focusTraversalKeysEnabled", false);
        setField(term138691, term138691.getClass(), "acc", null);
        setField(term138691, term138691.getClass(), "minSize", null);
        setBooleanField(term138691, term138691.getClass(), "minSizeSet", false);
        setField(term138691, term138691.getClass(), "prefSize", null);
        setBooleanField(term138691, term138691.getClass(), "prefSizeSet", false);
        setField(term138691, term138691.getClass(), "maxSize", null);
        setBooleanField(term138691, term138691.getClass(), "maxSizeSet", false);
        setField(term138691, term138691.getClass(), "componentOrientation", null);
        setBooleanField(term138691, term138691.getClass(), "newEventsOnly", false);
        setField(term138691, term138691.getClass(), "componentListener", null);
        setField(term138691, term138691.getClass(), "focusListener", null);
        setField(term138691, term138691.getClass(), "hierarchyListener", null);
        setField(term138691, term138691.getClass(), "hierarchyBoundsListener", null);
        setField(term138691, term138691.getClass(), "keyListener", null);
        setField(term138691, term138691.getClass(), "mouseListener", null);
        setField(term138691, term138691.getClass(), "mouseMotionListener", null);
        setField(term138691, term138691.getClass(), "mouseWheelListener", null);
        setField(term138691, term138691.getClass(), "inputMethodListener", null);
        setLongField(term138691, term138691.getClass(), "eventMask", 0L);
        setField(term138691, term138691.getClass(), "changeSupport", null);
        setField(term138691, term138691.getClass(), "objectLock", null);
        setBooleanField(term138691, term138691.getClass(), "isPacked", false);
        setIntField(term138691, term138691.getClass(), "boundsOp", 0);
        setField(term138691, term138691.getClass(), "compoundShape", null);
        setField(term138691, term138691.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term138691, term138691.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term138691, term138691.getClass(), "backgroundEraseDisabled", false);
        setField(term138691, term138691.getClass(), "eventCache", null);
        setBooleanField(term138691, term138691.getClass(), "coalescingEnabled", false);
        setBooleanField(term138691, term138691.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term138691, term138691.getClass(), "componentSerializedDataVersion", 0);
        setField(term138691, term138691.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLeftSpaceImage", argTypes, term138691, args);
    }

};


