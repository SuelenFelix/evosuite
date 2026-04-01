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

public class MapPanel_setPopup_84837154382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138975;

    public MapPanel_setPopup_84837154382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138975 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term138975, term138975.getClass(), "viewPointX", 0);
        setIntField(term138975, term138975.getClass(), "viewPointY", 0);
        setIntField(term138975, term138975.getClass(), "viewPointOffsetX", 0);
        setIntField(term138975, term138975.getClass(), "viewPointOffsetY", 0);
        setField(term138975, term138975.getClass(), "screen", null);
        setField(term138975, term138975.getClass(), "backgroundScreen", null);
        setIntField(term138975, term138975.getClass(), "flickerBlue", 0);
        setBooleanField(term138975, term138975.getClass(), "flickerGoUp", false);
        setIntField(term138975, term138975.getClass(), "lastDrawnCenterX", 0);
        setIntField(term138975, term138975.getClass(), "lastDrawnCenterY", 0);
        setField(term138975, term138975.getClass(), "route", null);
        setBooleanField(term138975, term138975.getClass(), "battle", false);
        setIntField(term138975, term138975.getClass(), "wormHoleAnimation", 0);
        setField(term138975, term138975.getClass(), "historyCultures", null);
        setBooleanField(term138975, term138975.getClass(), "historyCoordInitialized", false);
        setIntField(term138975, term138975.getClass(), "historyCoordX", 0);
        setIntField(term138975, term138975.getClass(), "historyCoordY", 0);
        setField(term138975, term138975.getClass(), "leftSpaceImage", null);
        setField(term138975, term138975.getClass(), "rightSpaceImage", null);
        setField(term138975, term138975.getClass(), "popup", null);
        setField(term138975, term138975.getClass(), "tileOverride", null);
        setField(term138975, term138975.getClass(), "redrawTile", null);
        setBooleanField(term138975, term138975.getClass(), "fullDraw", false);
        setIntField(term138975, term138975.getClass(), "cursorFocus", 0);
        setField(term138975, term138975.getClass(), "minimap", null);
        setBooleanField(term138975, term138975.getClass(), "showMiniMap", false);
        setBooleanField(term138975, term138975.getClass(), "highContrastGrid", false);
        setIntField(term138975, term138975.getClass(), "miniMapTopX", 0);
        setIntField(term138975, term138975.getClass(), "miniMapTopY", 0);
        setIntField(term138975, term138975.getClass(), "miniMapBotX", 0);
        setIntField(term138975, term138975.getClass(), "miniMapBotY", 0);
        setIntField(term138975, term138975.getClass(), "transparency", 0);
        setBooleanField(term138975, term138975.getClass(), "improvedParallax", false);
        setBooleanField(term138975, term138975.getClass(), "updateAnimation", false);
        setIntField(term138975, term138975.getClass(), "updateAnimationCount", 0);
        setBooleanField(term138975, term138975.getClass(), "drawWeaponRange", false);
        setField(term138975, term138975.getClass(), "panelType", null);
        setIntField(term138975, term138975.getClass(), "lastCursorPosX", 0);
        setIntField(term138975, term138975.getClass(), "lastCursorPosY", 0);
        setIntField(term138975, term138975.getClass(), "lastZoomLevel", 0);
        setBooleanField(term138975, term138975.getClass(), "redoViewPoints", false);
        setBooleanField(term138975, term138975.getClass(), "isAlignmentXSet", false);
        setFloatField(term138975, term138975.getClass(), "alignmentX", 0.0F);
        setBooleanField(term138975, term138975.getClass(), "isAlignmentYSet", false);
        setFloatField(term138975, term138975.getClass(), "alignmentY", 0.0F);
        setField(term138975, term138975.getClass(), "ui", null);
        setField(term138975, term138975.getClass(), "listenerList", null);
        setField(term138975, term138975.getClass(), "clientProperties", null);
        setField(term138975, term138975.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term138975, term138975.getClass(), "autoscrolls", false);
        setField(term138975, term138975.getClass(), "border", null);
        setIntField(term138975, term138975.getClass(), "flags", 0);
        setField(term138975, term138975.getClass(), "inputVerifier", null);
        setBooleanField(term138975, term138975.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term138975, term138975.getClass(), "paintingChild", null);
        setField(term138975, term138975.getClass(), "popupMenu", null);
        setField(term138975, term138975.getClass(), "revalidateRunnableScheduled", null);
        setField(term138975, term138975.getClass(), "focusInputMap", null);
        setField(term138975, term138975.getClass(), "ancestorInputMap", null);
        setField(term138975, term138975.getClass(), "windowInputMap", null);
        setField(term138975, term138975.getClass(), "actionMap", null);
        setField(term138975, term138975.getClass(), "aaHint", null);
        setField(term138975, term138975.getClass(), "lcdRenderingHint", null);
        setField(term138975, term138975.getClass(), "component", null);
        setField(term138975, term138975.getClass(), "layoutMgr", null);
        setField(term138975, term138975.getClass(), "dispatcher", null);
        setField(term138975, term138975.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term138975, term138975.getClass(), "focusCycleRoot", false);
        setBooleanField(term138975, term138975.getClass(), "focusTraversalPolicyProvider", false);
        setField(term138975, term138975.getClass(), "printingThreads", null);
        setBooleanField(term138975, term138975.getClass(), "printing", false);
        setField(term138975, term138975.getClass(), "containerListener", null);
        setIntField(term138975, term138975.getClass(), "listeningChildren", 0);
        setIntField(term138975, term138975.getClass(), "listeningBoundsChildren", 0);
        setIntField(term138975, term138975.getClass(), "descendantsCount", 0);
        setField(term138975, term138975.getClass(), "preserveBackgroundColor", null);
        setIntField(term138975, term138975.getClass(), "numOfHWComponents", 0);
        setIntField(term138975, term138975.getClass(), "numOfLWComponents", 0);
        setField(term138975, term138975.getClass(), "modalComp", null);
        setField(term138975, term138975.getClass(), "modalAppContext", null);
        setIntField(term138975, term138975.getClass(), "containerSerializedDataVersion", 0);
        setField(term138975, term138975.getClass(), "peer", null);
        setField(term138975, term138975.getClass(), "parent", null);
        setField(term138975, term138975.getClass(), "appContext", null);
        setIntField(term138975, term138975.getClass(), "x", 0);
        setIntField(term138975, term138975.getClass(), "y", 0);
        setIntField(term138975, term138975.getClass(), "width", 0);
        setIntField(term138975, term138975.getClass(), "height", 0);
        setField(term138975, term138975.getClass(), "foreground", null);
        setField(term138975, term138975.getClass(), "background", null);
        setField(term138975, term138975.getClass(), "font", null);
        setField(term138975, term138975.getClass(), "peerFont", null);
        setField(term138975, term138975.getClass(), "cursor", null);
        setField(term138975, term138975.getClass(), "locale", null);
        setField(term138975, term138975.getClass(), "graphicsConfig", null);
        setField(term138975, term138975.getClass(), "bufferStrategy", null);
        setBooleanField(term138975, term138975.getClass(), "ignoreRepaint", false);
        setBooleanField(term138975, term138975.getClass(), "visible", false);
        setBooleanField(term138975, term138975.getClass(), "enabled", false);
        setBooleanField(term138975, term138975.getClass(), "valid", false);
        setField(term138975, term138975.getClass(), "dropTarget", null);
        setField(term138975, term138975.getClass(), "popups", null);
        setField(term138975, term138975.getClass(), "name", null);
        setBooleanField(term138975, term138975.getClass(), "nameExplicitlySet", false);
        setBooleanField(term138975, term138975.getClass(), "focusable", false);
        setIntField(term138975, term138975.getClass(), "isFocusTraversableOverridden", 0);
        setField(term138975, term138975.getClass(), "focusTraversalKeys", null);
        setBooleanField(term138975, term138975.getClass(), "focusTraversalKeysEnabled", false);
        setField(term138975, term138975.getClass(), "acc", null);
        setField(term138975, term138975.getClass(), "minSize", null);
        setBooleanField(term138975, term138975.getClass(), "minSizeSet", false);
        setField(term138975, term138975.getClass(), "prefSize", null);
        setBooleanField(term138975, term138975.getClass(), "prefSizeSet", false);
        setField(term138975, term138975.getClass(), "maxSize", null);
        setBooleanField(term138975, term138975.getClass(), "maxSizeSet", false);
        setField(term138975, term138975.getClass(), "componentOrientation", null);
        setBooleanField(term138975, term138975.getClass(), "newEventsOnly", false);
        setField(term138975, term138975.getClass(), "componentListener", null);
        setField(term138975, term138975.getClass(), "focusListener", null);
        setField(term138975, term138975.getClass(), "hierarchyListener", null);
        setField(term138975, term138975.getClass(), "hierarchyBoundsListener", null);
        setField(term138975, term138975.getClass(), "keyListener", null);
        setField(term138975, term138975.getClass(), "mouseListener", null);
        setField(term138975, term138975.getClass(), "mouseMotionListener", null);
        setField(term138975, term138975.getClass(), "mouseWheelListener", null);
        setField(term138975, term138975.getClass(), "inputMethodListener", null);
        setLongField(term138975, term138975.getClass(), "eventMask", 0L);
        setField(term138975, term138975.getClass(), "changeSupport", null);
        setField(term138975, term138975.getClass(), "objectLock", null);
        setBooleanField(term138975, term138975.getClass(), "isPacked", false);
        setIntField(term138975, term138975.getClass(), "boundsOp", 0);
        setField(term138975, term138975.getClass(), "compoundShape", null);
        setField(term138975, term138975.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term138975, term138975.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term138975, term138975.getClass(), "backgroundEraseDisabled", false);
        setField(term138975, term138975.getClass(), "eventCache", null);
        setBooleanField(term138975, term138975.getClass(), "coalescingEnabled", false);
        setBooleanField(term138975, term138975.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term138975, term138975.getClass(), "componentSerializedDataVersion", 0);
        setField(term138975, term138975.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPopup", argTypes, term138975, args);
    }

};


