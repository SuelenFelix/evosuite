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
import java.lang.Integer;

public class MapPanel_moveHistoryTowards_58791985676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138545;
     Object term138616;
     Object term138618;

    public MapPanel_moveHistoryTowards_58791985676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138545 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term138545, term138545.getClass(), "viewPointX", 0);
        setIntField(term138545, term138545.getClass(), "viewPointY", 0);
        setIntField(term138545, term138545.getClass(), "viewPointOffsetX", 0);
        setIntField(term138545, term138545.getClass(), "viewPointOffsetY", 0);
        setField(term138545, term138545.getClass(), "screen", null);
        setField(term138545, term138545.getClass(), "backgroundScreen", null);
        setIntField(term138545, term138545.getClass(), "flickerBlue", 0);
        setBooleanField(term138545, term138545.getClass(), "flickerGoUp", false);
        setIntField(term138545, term138545.getClass(), "lastDrawnCenterX", 0);
        setIntField(term138545, term138545.getClass(), "lastDrawnCenterY", 0);
        setField(term138545, term138545.getClass(), "route", null);
        setBooleanField(term138545, term138545.getClass(), "battle", false);
        setIntField(term138545, term138545.getClass(), "wormHoleAnimation", 0);
        setField(term138545, term138545.getClass(), "historyCultures", null);
        setBooleanField(term138545, term138545.getClass(), "historyCoordInitialized", false);
        setIntField(term138545, term138545.getClass(), "historyCoordX", 0);
        setIntField(term138545, term138545.getClass(), "historyCoordY", 0);
        setField(term138545, term138545.getClass(), "leftSpaceImage", null);
        setField(term138545, term138545.getClass(), "rightSpaceImage", null);
        setField(term138545, term138545.getClass(), "popup", null);
        setField(term138545, term138545.getClass(), "tileOverride", null);
        setField(term138545, term138545.getClass(), "redrawTile", null);
        setBooleanField(term138545, term138545.getClass(), "fullDraw", false);
        setIntField(term138545, term138545.getClass(), "cursorFocus", 0);
        setField(term138545, term138545.getClass(), "minimap", null);
        setBooleanField(term138545, term138545.getClass(), "showMiniMap", false);
        setBooleanField(term138545, term138545.getClass(), "highContrastGrid", false);
        setIntField(term138545, term138545.getClass(), "miniMapTopX", 0);
        setIntField(term138545, term138545.getClass(), "miniMapTopY", 0);
        setIntField(term138545, term138545.getClass(), "miniMapBotX", 0);
        setIntField(term138545, term138545.getClass(), "miniMapBotY", 0);
        setIntField(term138545, term138545.getClass(), "transparency", 0);
        setBooleanField(term138545, term138545.getClass(), "improvedParallax", false);
        setBooleanField(term138545, term138545.getClass(), "updateAnimation", false);
        setIntField(term138545, term138545.getClass(), "updateAnimationCount", 0);
        setBooleanField(term138545, term138545.getClass(), "drawWeaponRange", false);
        setField(term138545, term138545.getClass(), "panelType", null);
        setIntField(term138545, term138545.getClass(), "lastCursorPosX", 0);
        setIntField(term138545, term138545.getClass(), "lastCursorPosY", 0);
        setIntField(term138545, term138545.getClass(), "lastZoomLevel", 0);
        setBooleanField(term138545, term138545.getClass(), "redoViewPoints", false);
        setBooleanField(term138545, term138545.getClass(), "isAlignmentXSet", false);
        setFloatField(term138545, term138545.getClass(), "alignmentX", 0.0F);
        setBooleanField(term138545, term138545.getClass(), "isAlignmentYSet", false);
        setFloatField(term138545, term138545.getClass(), "alignmentY", 0.0F);
        setField(term138545, term138545.getClass(), "ui", null);
        setField(term138545, term138545.getClass(), "listenerList", null);
        setField(term138545, term138545.getClass(), "clientProperties", null);
        setField(term138545, term138545.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term138545, term138545.getClass(), "autoscrolls", false);
        setField(term138545, term138545.getClass(), "border", null);
        setIntField(term138545, term138545.getClass(), "flags", 0);
        setField(term138545, term138545.getClass(), "inputVerifier", null);
        setBooleanField(term138545, term138545.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term138545, term138545.getClass(), "paintingChild", null);
        setField(term138545, term138545.getClass(), "popupMenu", null);
        setField(term138545, term138545.getClass(), "revalidateRunnableScheduled", null);
        setField(term138545, term138545.getClass(), "focusInputMap", null);
        setField(term138545, term138545.getClass(), "ancestorInputMap", null);
        setField(term138545, term138545.getClass(), "windowInputMap", null);
        setField(term138545, term138545.getClass(), "actionMap", null);
        setField(term138545, term138545.getClass(), "aaHint", null);
        setField(term138545, term138545.getClass(), "lcdRenderingHint", null);
        setField(term138545, term138545.getClass(), "component", null);
        setField(term138545, term138545.getClass(), "layoutMgr", null);
        setField(term138545, term138545.getClass(), "dispatcher", null);
        setField(term138545, term138545.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term138545, term138545.getClass(), "focusCycleRoot", false);
        setBooleanField(term138545, term138545.getClass(), "focusTraversalPolicyProvider", false);
        setField(term138545, term138545.getClass(), "printingThreads", null);
        setBooleanField(term138545, term138545.getClass(), "printing", false);
        setField(term138545, term138545.getClass(), "containerListener", null);
        setIntField(term138545, term138545.getClass(), "listeningChildren", 0);
        setIntField(term138545, term138545.getClass(), "listeningBoundsChildren", 0);
        setIntField(term138545, term138545.getClass(), "descendantsCount", 0);
        setField(term138545, term138545.getClass(), "preserveBackgroundColor", null);
        setIntField(term138545, term138545.getClass(), "numOfHWComponents", 0);
        setIntField(term138545, term138545.getClass(), "numOfLWComponents", 0);
        setField(term138545, term138545.getClass(), "modalComp", null);
        setField(term138545, term138545.getClass(), "modalAppContext", null);
        setIntField(term138545, term138545.getClass(), "containerSerializedDataVersion", 0);
        setField(term138545, term138545.getClass(), "peer", null);
        setField(term138545, term138545.getClass(), "parent", null);
        setField(term138545, term138545.getClass(), "appContext", null);
        setIntField(term138545, term138545.getClass(), "x", 0);
        setIntField(term138545, term138545.getClass(), "y", 0);
        setIntField(term138545, term138545.getClass(), "width", 0);
        setIntField(term138545, term138545.getClass(), "height", 0);
        setField(term138545, term138545.getClass(), "foreground", null);
        setField(term138545, term138545.getClass(), "background", null);
        setField(term138545, term138545.getClass(), "font", null);
        setField(term138545, term138545.getClass(), "peerFont", null);
        setField(term138545, term138545.getClass(), "cursor", null);
        setField(term138545, term138545.getClass(), "locale", null);
        setField(term138545, term138545.getClass(), "graphicsConfig", null);
        setField(term138545, term138545.getClass(), "bufferStrategy", null);
        setBooleanField(term138545, term138545.getClass(), "ignoreRepaint", false);
        setBooleanField(term138545, term138545.getClass(), "visible", false);
        setBooleanField(term138545, term138545.getClass(), "enabled", false);
        setBooleanField(term138545, term138545.getClass(), "valid", false);
        setField(term138545, term138545.getClass(), "dropTarget", null);
        setField(term138545, term138545.getClass(), "popups", null);
        setField(term138545, term138545.getClass(), "name", null);
        setBooleanField(term138545, term138545.getClass(), "nameExplicitlySet", false);
        setBooleanField(term138545, term138545.getClass(), "focusable", false);
        setIntField(term138545, term138545.getClass(), "isFocusTraversableOverridden", 0);
        setField(term138545, term138545.getClass(), "focusTraversalKeys", null);
        setBooleanField(term138545, term138545.getClass(), "focusTraversalKeysEnabled", false);
        setField(term138545, term138545.getClass(), "acc", null);
        setField(term138545, term138545.getClass(), "minSize", null);
        setBooleanField(term138545, term138545.getClass(), "minSizeSet", false);
        setField(term138545, term138545.getClass(), "prefSize", null);
        setBooleanField(term138545, term138545.getClass(), "prefSizeSet", false);
        setField(term138545, term138545.getClass(), "maxSize", null);
        setBooleanField(term138545, term138545.getClass(), "maxSizeSet", false);
        setField(term138545, term138545.getClass(), "componentOrientation", null);
        setBooleanField(term138545, term138545.getClass(), "newEventsOnly", false);
        setField(term138545, term138545.getClass(), "componentListener", null);
        setField(term138545, term138545.getClass(), "focusListener", null);
        setField(term138545, term138545.getClass(), "hierarchyListener", null);
        setField(term138545, term138545.getClass(), "hierarchyBoundsListener", null);
        setField(term138545, term138545.getClass(), "keyListener", null);
        setField(term138545, term138545.getClass(), "mouseListener", null);
        setField(term138545, term138545.getClass(), "mouseMotionListener", null);
        setField(term138545, term138545.getClass(), "mouseWheelListener", null);
        setField(term138545, term138545.getClass(), "inputMethodListener", null);
        setLongField(term138545, term138545.getClass(), "eventMask", 0L);
        setField(term138545, term138545.getClass(), "changeSupport", null);
        setField(term138545, term138545.getClass(), "objectLock", null);
        setBooleanField(term138545, term138545.getClass(), "isPacked", false);
        setIntField(term138545, term138545.getClass(), "boundsOp", 0);
        setField(term138545, term138545.getClass(), "compoundShape", null);
        setField(term138545, term138545.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term138545, term138545.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term138545, term138545.getClass(), "backgroundEraseDisabled", false);
        setField(term138545, term138545.getClass(), "eventCache", null);
        setBooleanField(term138545, term138545.getClass(), "coalescingEnabled", false);
        setBooleanField(term138545, term138545.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term138545, term138545.getClass(), "componentSerializedDataVersion", 0);
        setField(term138545, term138545.getClass(), "accessibleContext", null);
        term138616 = new Integer(0);
        term138618 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term138616;
        args[1] = term138618;
        callMethod(klass, "moveHistoryTowards", argTypes, term138545, args);
    }

};


