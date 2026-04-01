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

public class MapPanel_setRoute_46401370174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138403;

    public MapPanel_setRoute_46401370174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138403 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term138403, term138403.getClass(), "viewPointX", 0);
        setIntField(term138403, term138403.getClass(), "viewPointY", 0);
        setIntField(term138403, term138403.getClass(), "viewPointOffsetX", 0);
        setIntField(term138403, term138403.getClass(), "viewPointOffsetY", 0);
        setField(term138403, term138403.getClass(), "screen", null);
        setField(term138403, term138403.getClass(), "backgroundScreen", null);
        setIntField(term138403, term138403.getClass(), "flickerBlue", 0);
        setBooleanField(term138403, term138403.getClass(), "flickerGoUp", false);
        setIntField(term138403, term138403.getClass(), "lastDrawnCenterX", 0);
        setIntField(term138403, term138403.getClass(), "lastDrawnCenterY", 0);
        setField(term138403, term138403.getClass(), "route", null);
        setBooleanField(term138403, term138403.getClass(), "battle", false);
        setIntField(term138403, term138403.getClass(), "wormHoleAnimation", 0);
        setField(term138403, term138403.getClass(), "historyCultures", null);
        setBooleanField(term138403, term138403.getClass(), "historyCoordInitialized", false);
        setIntField(term138403, term138403.getClass(), "historyCoordX", 0);
        setIntField(term138403, term138403.getClass(), "historyCoordY", 0);
        setField(term138403, term138403.getClass(), "leftSpaceImage", null);
        setField(term138403, term138403.getClass(), "rightSpaceImage", null);
        setField(term138403, term138403.getClass(), "popup", null);
        setField(term138403, term138403.getClass(), "tileOverride", null);
        setField(term138403, term138403.getClass(), "redrawTile", null);
        setBooleanField(term138403, term138403.getClass(), "fullDraw", false);
        setIntField(term138403, term138403.getClass(), "cursorFocus", 0);
        setField(term138403, term138403.getClass(), "minimap", null);
        setBooleanField(term138403, term138403.getClass(), "showMiniMap", false);
        setBooleanField(term138403, term138403.getClass(), "highContrastGrid", false);
        setIntField(term138403, term138403.getClass(), "miniMapTopX", 0);
        setIntField(term138403, term138403.getClass(), "miniMapTopY", 0);
        setIntField(term138403, term138403.getClass(), "miniMapBotX", 0);
        setIntField(term138403, term138403.getClass(), "miniMapBotY", 0);
        setIntField(term138403, term138403.getClass(), "transparency", 0);
        setBooleanField(term138403, term138403.getClass(), "improvedParallax", false);
        setBooleanField(term138403, term138403.getClass(), "updateAnimation", false);
        setIntField(term138403, term138403.getClass(), "updateAnimationCount", 0);
        setBooleanField(term138403, term138403.getClass(), "drawWeaponRange", false);
        setField(term138403, term138403.getClass(), "panelType", null);
        setIntField(term138403, term138403.getClass(), "lastCursorPosX", 0);
        setIntField(term138403, term138403.getClass(), "lastCursorPosY", 0);
        setIntField(term138403, term138403.getClass(), "lastZoomLevel", 0);
        setBooleanField(term138403, term138403.getClass(), "redoViewPoints", false);
        setBooleanField(term138403, term138403.getClass(), "isAlignmentXSet", false);
        setFloatField(term138403, term138403.getClass(), "alignmentX", 0.0F);
        setBooleanField(term138403, term138403.getClass(), "isAlignmentYSet", false);
        setFloatField(term138403, term138403.getClass(), "alignmentY", 0.0F);
        setField(term138403, term138403.getClass(), "ui", null);
        setField(term138403, term138403.getClass(), "listenerList", null);
        setField(term138403, term138403.getClass(), "clientProperties", null);
        setField(term138403, term138403.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term138403, term138403.getClass(), "autoscrolls", false);
        setField(term138403, term138403.getClass(), "border", null);
        setIntField(term138403, term138403.getClass(), "flags", 0);
        setField(term138403, term138403.getClass(), "inputVerifier", null);
        setBooleanField(term138403, term138403.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term138403, term138403.getClass(), "paintingChild", null);
        setField(term138403, term138403.getClass(), "popupMenu", null);
        setField(term138403, term138403.getClass(), "revalidateRunnableScheduled", null);
        setField(term138403, term138403.getClass(), "focusInputMap", null);
        setField(term138403, term138403.getClass(), "ancestorInputMap", null);
        setField(term138403, term138403.getClass(), "windowInputMap", null);
        setField(term138403, term138403.getClass(), "actionMap", null);
        setField(term138403, term138403.getClass(), "aaHint", null);
        setField(term138403, term138403.getClass(), "lcdRenderingHint", null);
        setField(term138403, term138403.getClass(), "component", null);
        setField(term138403, term138403.getClass(), "layoutMgr", null);
        setField(term138403, term138403.getClass(), "dispatcher", null);
        setField(term138403, term138403.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term138403, term138403.getClass(), "focusCycleRoot", false);
        setBooleanField(term138403, term138403.getClass(), "focusTraversalPolicyProvider", false);
        setField(term138403, term138403.getClass(), "printingThreads", null);
        setBooleanField(term138403, term138403.getClass(), "printing", false);
        setField(term138403, term138403.getClass(), "containerListener", null);
        setIntField(term138403, term138403.getClass(), "listeningChildren", 0);
        setIntField(term138403, term138403.getClass(), "listeningBoundsChildren", 0);
        setIntField(term138403, term138403.getClass(), "descendantsCount", 0);
        setField(term138403, term138403.getClass(), "preserveBackgroundColor", null);
        setIntField(term138403, term138403.getClass(), "numOfHWComponents", 0);
        setIntField(term138403, term138403.getClass(), "numOfLWComponents", 0);
        setField(term138403, term138403.getClass(), "modalComp", null);
        setField(term138403, term138403.getClass(), "modalAppContext", null);
        setIntField(term138403, term138403.getClass(), "containerSerializedDataVersion", 0);
        setField(term138403, term138403.getClass(), "peer", null);
        setField(term138403, term138403.getClass(), "parent", null);
        setField(term138403, term138403.getClass(), "appContext", null);
        setIntField(term138403, term138403.getClass(), "x", 0);
        setIntField(term138403, term138403.getClass(), "y", 0);
        setIntField(term138403, term138403.getClass(), "width", 0);
        setIntField(term138403, term138403.getClass(), "height", 0);
        setField(term138403, term138403.getClass(), "foreground", null);
        setField(term138403, term138403.getClass(), "background", null);
        setField(term138403, term138403.getClass(), "font", null);
        setField(term138403, term138403.getClass(), "peerFont", null);
        setField(term138403, term138403.getClass(), "cursor", null);
        setField(term138403, term138403.getClass(), "locale", null);
        setField(term138403, term138403.getClass(), "graphicsConfig", null);
        setField(term138403, term138403.getClass(), "bufferStrategy", null);
        setBooleanField(term138403, term138403.getClass(), "ignoreRepaint", false);
        setBooleanField(term138403, term138403.getClass(), "visible", false);
        setBooleanField(term138403, term138403.getClass(), "enabled", false);
        setBooleanField(term138403, term138403.getClass(), "valid", false);
        setField(term138403, term138403.getClass(), "dropTarget", null);
        setField(term138403, term138403.getClass(), "popups", null);
        setField(term138403, term138403.getClass(), "name", null);
        setBooleanField(term138403, term138403.getClass(), "nameExplicitlySet", false);
        setBooleanField(term138403, term138403.getClass(), "focusable", false);
        setIntField(term138403, term138403.getClass(), "isFocusTraversableOverridden", 0);
        setField(term138403, term138403.getClass(), "focusTraversalKeys", null);
        setBooleanField(term138403, term138403.getClass(), "focusTraversalKeysEnabled", false);
        setField(term138403, term138403.getClass(), "acc", null);
        setField(term138403, term138403.getClass(), "minSize", null);
        setBooleanField(term138403, term138403.getClass(), "minSizeSet", false);
        setField(term138403, term138403.getClass(), "prefSize", null);
        setBooleanField(term138403, term138403.getClass(), "prefSizeSet", false);
        setField(term138403, term138403.getClass(), "maxSize", null);
        setBooleanField(term138403, term138403.getClass(), "maxSizeSet", false);
        setField(term138403, term138403.getClass(), "componentOrientation", null);
        setBooleanField(term138403, term138403.getClass(), "newEventsOnly", false);
        setField(term138403, term138403.getClass(), "componentListener", null);
        setField(term138403, term138403.getClass(), "focusListener", null);
        setField(term138403, term138403.getClass(), "hierarchyListener", null);
        setField(term138403, term138403.getClass(), "hierarchyBoundsListener", null);
        setField(term138403, term138403.getClass(), "keyListener", null);
        setField(term138403, term138403.getClass(), "mouseListener", null);
        setField(term138403, term138403.getClass(), "mouseMotionListener", null);
        setField(term138403, term138403.getClass(), "mouseWheelListener", null);
        setField(term138403, term138403.getClass(), "inputMethodListener", null);
        setLongField(term138403, term138403.getClass(), "eventMask", 0L);
        setField(term138403, term138403.getClass(), "changeSupport", null);
        setField(term138403, term138403.getClass(), "objectLock", null);
        setBooleanField(term138403, term138403.getClass(), "isPacked", false);
        setIntField(term138403, term138403.getClass(), "boundsOp", 0);
        setField(term138403, term138403.getClass(), "compoundShape", null);
        setField(term138403, term138403.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term138403, term138403.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term138403, term138403.getClass(), "backgroundEraseDisabled", false);
        setField(term138403, term138403.getClass(), "eventCache", null);
        setBooleanField(term138403, term138403.getClass(), "coalescingEnabled", false);
        setBooleanField(term138403, term138403.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term138403, term138403.getClass(), "componentSerializedDataVersion", 0);
        setField(term138403, term138403.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Route");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRoute", argTypes, term138403, args);
    }

};


