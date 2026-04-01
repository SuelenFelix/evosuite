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
import java.lang.Boolean;

public class MapPanel_initMapPanel_14399983997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49280;
     Object term49351;

    public MapPanel_initMapPanel_14399983997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49280 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term49280, term49280.getClass(), "viewPointX", 0);
        setIntField(term49280, term49280.getClass(), "viewPointY", 0);
        setIntField(term49280, term49280.getClass(), "viewPointOffsetX", 0);
        setIntField(term49280, term49280.getClass(), "viewPointOffsetY", 0);
        setField(term49280, term49280.getClass(), "screen", null);
        setField(term49280, term49280.getClass(), "backgroundScreen", null);
        setIntField(term49280, term49280.getClass(), "flickerBlue", 0);
        setBooleanField(term49280, term49280.getClass(), "flickerGoUp", false);
        setIntField(term49280, term49280.getClass(), "lastDrawnCenterX", 0);
        setIntField(term49280, term49280.getClass(), "lastDrawnCenterY", 0);
        setField(term49280, term49280.getClass(), "route", null);
        setBooleanField(term49280, term49280.getClass(), "battle", false);
        setIntField(term49280, term49280.getClass(), "wormHoleAnimation", 0);
        setField(term49280, term49280.getClass(), "historyCultures", null);
        setBooleanField(term49280, term49280.getClass(), "historyCoordInitialized", false);
        setIntField(term49280, term49280.getClass(), "historyCoordX", 0);
        setIntField(term49280, term49280.getClass(), "historyCoordY", 0);
        setField(term49280, term49280.getClass(), "leftSpaceImage", null);
        setField(term49280, term49280.getClass(), "rightSpaceImage", null);
        setField(term49280, term49280.getClass(), "popup", null);
        setField(term49280, term49280.getClass(), "tileOverride", null);
        setField(term49280, term49280.getClass(), "redrawTile", null);
        setBooleanField(term49280, term49280.getClass(), "fullDraw", false);
        setIntField(term49280, term49280.getClass(), "cursorFocus", 0);
        setField(term49280, term49280.getClass(), "minimap", null);
        setBooleanField(term49280, term49280.getClass(), "showMiniMap", false);
        setBooleanField(term49280, term49280.getClass(), "highContrastGrid", false);
        setIntField(term49280, term49280.getClass(), "miniMapTopX", 0);
        setIntField(term49280, term49280.getClass(), "miniMapTopY", 0);
        setIntField(term49280, term49280.getClass(), "miniMapBotX", 0);
        setIntField(term49280, term49280.getClass(), "miniMapBotY", 0);
        setIntField(term49280, term49280.getClass(), "transparency", 0);
        setBooleanField(term49280, term49280.getClass(), "improvedParallax", false);
        setBooleanField(term49280, term49280.getClass(), "updateAnimation", false);
        setIntField(term49280, term49280.getClass(), "updateAnimationCount", 0);
        setBooleanField(term49280, term49280.getClass(), "drawWeaponRange", false);
        setField(term49280, term49280.getClass(), "panelType", null);
        setIntField(term49280, term49280.getClass(), "lastCursorPosX", 0);
        setIntField(term49280, term49280.getClass(), "lastCursorPosY", 0);
        setIntField(term49280, term49280.getClass(), "lastZoomLevel", 0);
        setBooleanField(term49280, term49280.getClass(), "redoViewPoints", false);
        setBooleanField(term49280, term49280.getClass(), "isAlignmentXSet", false);
        setFloatField(term49280, term49280.getClass(), "alignmentX", 0.0F);
        setBooleanField(term49280, term49280.getClass(), "isAlignmentYSet", false);
        setFloatField(term49280, term49280.getClass(), "alignmentY", 0.0F);
        setField(term49280, term49280.getClass(), "ui", null);
        setField(term49280, term49280.getClass(), "listenerList", null);
        setField(term49280, term49280.getClass(), "clientProperties", null);
        setField(term49280, term49280.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term49280, term49280.getClass(), "autoscrolls", false);
        setField(term49280, term49280.getClass(), "border", null);
        setIntField(term49280, term49280.getClass(), "flags", 0);
        setField(term49280, term49280.getClass(), "inputVerifier", null);
        setBooleanField(term49280, term49280.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term49280, term49280.getClass(), "paintingChild", null);
        setField(term49280, term49280.getClass(), "popupMenu", null);
        setField(term49280, term49280.getClass(), "revalidateRunnableScheduled", null);
        setField(term49280, term49280.getClass(), "focusInputMap", null);
        setField(term49280, term49280.getClass(), "ancestorInputMap", null);
        setField(term49280, term49280.getClass(), "windowInputMap", null);
        setField(term49280, term49280.getClass(), "actionMap", null);
        setField(term49280, term49280.getClass(), "aaHint", null);
        setField(term49280, term49280.getClass(), "lcdRenderingHint", null);
        setField(term49280, term49280.getClass(), "component", null);
        setField(term49280, term49280.getClass(), "layoutMgr", null);
        setField(term49280, term49280.getClass(), "dispatcher", null);
        setField(term49280, term49280.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term49280, term49280.getClass(), "focusCycleRoot", false);
        setBooleanField(term49280, term49280.getClass(), "focusTraversalPolicyProvider", false);
        setField(term49280, term49280.getClass(), "printingThreads", null);
        setBooleanField(term49280, term49280.getClass(), "printing", false);
        setField(term49280, term49280.getClass(), "containerListener", null);
        setIntField(term49280, term49280.getClass(), "listeningChildren", 0);
        setIntField(term49280, term49280.getClass(), "listeningBoundsChildren", 0);
        setIntField(term49280, term49280.getClass(), "descendantsCount", 0);
        setField(term49280, term49280.getClass(), "preserveBackgroundColor", null);
        setIntField(term49280, term49280.getClass(), "numOfHWComponents", 0);
        setIntField(term49280, term49280.getClass(), "numOfLWComponents", 0);
        setField(term49280, term49280.getClass(), "modalComp", null);
        setField(term49280, term49280.getClass(), "modalAppContext", null);
        setIntField(term49280, term49280.getClass(), "containerSerializedDataVersion", 0);
        setField(term49280, term49280.getClass(), "peer", null);
        setField(term49280, term49280.getClass(), "parent", null);
        setField(term49280, term49280.getClass(), "appContext", null);
        setIntField(term49280, term49280.getClass(), "x", 0);
        setIntField(term49280, term49280.getClass(), "y", 0);
        setIntField(term49280, term49280.getClass(), "width", 0);
        setIntField(term49280, term49280.getClass(), "height", 0);
        setField(term49280, term49280.getClass(), "foreground", null);
        setField(term49280, term49280.getClass(), "background", null);
        setField(term49280, term49280.getClass(), "font", null);
        setField(term49280, term49280.getClass(), "peerFont", null);
        setField(term49280, term49280.getClass(), "cursor", null);
        setField(term49280, term49280.getClass(), "locale", null);
        setField(term49280, term49280.getClass(), "graphicsConfig", null);
        setField(term49280, term49280.getClass(), "bufferStrategy", null);
        setBooleanField(term49280, term49280.getClass(), "ignoreRepaint", false);
        setBooleanField(term49280, term49280.getClass(), "visible", false);
        setBooleanField(term49280, term49280.getClass(), "enabled", false);
        setBooleanField(term49280, term49280.getClass(), "valid", false);
        setField(term49280, term49280.getClass(), "dropTarget", null);
        setField(term49280, term49280.getClass(), "popups", null);
        setField(term49280, term49280.getClass(), "name", null);
        setBooleanField(term49280, term49280.getClass(), "nameExplicitlySet", false);
        setBooleanField(term49280, term49280.getClass(), "focusable", false);
        setIntField(term49280, term49280.getClass(), "isFocusTraversableOverridden", 0);
        setField(term49280, term49280.getClass(), "focusTraversalKeys", null);
        setBooleanField(term49280, term49280.getClass(), "focusTraversalKeysEnabled", false);
        setField(term49280, term49280.getClass(), "acc", null);
        setField(term49280, term49280.getClass(), "minSize", null);
        setBooleanField(term49280, term49280.getClass(), "minSizeSet", false);
        setField(term49280, term49280.getClass(), "prefSize", null);
        setBooleanField(term49280, term49280.getClass(), "prefSizeSet", false);
        setField(term49280, term49280.getClass(), "maxSize", null);
        setBooleanField(term49280, term49280.getClass(), "maxSizeSet", false);
        setField(term49280, term49280.getClass(), "componentOrientation", null);
        setBooleanField(term49280, term49280.getClass(), "newEventsOnly", false);
        setField(term49280, term49280.getClass(), "componentListener", null);
        setField(term49280, term49280.getClass(), "focusListener", null);
        setField(term49280, term49280.getClass(), "hierarchyListener", null);
        setField(term49280, term49280.getClass(), "hierarchyBoundsListener", null);
        setField(term49280, term49280.getClass(), "keyListener", null);
        setField(term49280, term49280.getClass(), "mouseListener", null);
        setField(term49280, term49280.getClass(), "mouseMotionListener", null);
        setField(term49280, term49280.getClass(), "mouseWheelListener", null);
        setField(term49280, term49280.getClass(), "inputMethodListener", null);
        setLongField(term49280, term49280.getClass(), "eventMask", 0L);
        setField(term49280, term49280.getClass(), "changeSupport", null);
        setField(term49280, term49280.getClass(), "objectLock", null);
        setBooleanField(term49280, term49280.getClass(), "isPacked", false);
        setIntField(term49280, term49280.getClass(), "boundsOp", 0);
        setField(term49280, term49280.getClass(), "compoundShape", null);
        setField(term49280, term49280.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term49280, term49280.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term49280, term49280.getClass(), "backgroundEraseDisabled", false);
        setField(term49280, term49280.getClass(), "eventCache", null);
        setBooleanField(term49280, term49280.getClass(), "coalescingEnabled", false);
        setBooleanField(term49280, term49280.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term49280, term49280.getClass(), "componentSerializedDataVersion", 0);
        setField(term49280, term49280.getClass(), "accessibleContext", null);
        term49351 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.game.Game");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term49351;
        callMethod(klass, "initMapPanel", argTypes, term49280, args);
    }

};


