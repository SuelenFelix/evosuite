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

public class MapPanel_setCursorFocus_44996864785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139188;
     Object term139259;

    public MapPanel_setCursorFocus_44996864785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139188 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term139188, term139188.getClass(), "viewPointX", 0);
        setIntField(term139188, term139188.getClass(), "viewPointY", 0);
        setIntField(term139188, term139188.getClass(), "viewPointOffsetX", 0);
        setIntField(term139188, term139188.getClass(), "viewPointOffsetY", 0);
        setField(term139188, term139188.getClass(), "screen", null);
        setField(term139188, term139188.getClass(), "backgroundScreen", null);
        setIntField(term139188, term139188.getClass(), "flickerBlue", 0);
        setBooleanField(term139188, term139188.getClass(), "flickerGoUp", false);
        setIntField(term139188, term139188.getClass(), "lastDrawnCenterX", 0);
        setIntField(term139188, term139188.getClass(), "lastDrawnCenterY", 0);
        setField(term139188, term139188.getClass(), "route", null);
        setBooleanField(term139188, term139188.getClass(), "battle", false);
        setIntField(term139188, term139188.getClass(), "wormHoleAnimation", 0);
        setField(term139188, term139188.getClass(), "historyCultures", null);
        setBooleanField(term139188, term139188.getClass(), "historyCoordInitialized", false);
        setIntField(term139188, term139188.getClass(), "historyCoordX", 0);
        setIntField(term139188, term139188.getClass(), "historyCoordY", 0);
        setField(term139188, term139188.getClass(), "leftSpaceImage", null);
        setField(term139188, term139188.getClass(), "rightSpaceImage", null);
        setField(term139188, term139188.getClass(), "popup", null);
        setField(term139188, term139188.getClass(), "tileOverride", null);
        setField(term139188, term139188.getClass(), "redrawTile", null);
        setBooleanField(term139188, term139188.getClass(), "fullDraw", false);
        setIntField(term139188, term139188.getClass(), "cursorFocus", 0);
        setField(term139188, term139188.getClass(), "minimap", null);
        setBooleanField(term139188, term139188.getClass(), "showMiniMap", false);
        setBooleanField(term139188, term139188.getClass(), "highContrastGrid", false);
        setIntField(term139188, term139188.getClass(), "miniMapTopX", 0);
        setIntField(term139188, term139188.getClass(), "miniMapTopY", 0);
        setIntField(term139188, term139188.getClass(), "miniMapBotX", 0);
        setIntField(term139188, term139188.getClass(), "miniMapBotY", 0);
        setIntField(term139188, term139188.getClass(), "transparency", 0);
        setBooleanField(term139188, term139188.getClass(), "improvedParallax", false);
        setBooleanField(term139188, term139188.getClass(), "updateAnimation", false);
        setIntField(term139188, term139188.getClass(), "updateAnimationCount", 0);
        setBooleanField(term139188, term139188.getClass(), "drawWeaponRange", false);
        setField(term139188, term139188.getClass(), "panelType", null);
        setIntField(term139188, term139188.getClass(), "lastCursorPosX", 0);
        setIntField(term139188, term139188.getClass(), "lastCursorPosY", 0);
        setIntField(term139188, term139188.getClass(), "lastZoomLevel", 0);
        setBooleanField(term139188, term139188.getClass(), "redoViewPoints", false);
        setBooleanField(term139188, term139188.getClass(), "isAlignmentXSet", false);
        setFloatField(term139188, term139188.getClass(), "alignmentX", 0.0F);
        setBooleanField(term139188, term139188.getClass(), "isAlignmentYSet", false);
        setFloatField(term139188, term139188.getClass(), "alignmentY", 0.0F);
        setField(term139188, term139188.getClass(), "ui", null);
        setField(term139188, term139188.getClass(), "listenerList", null);
        setField(term139188, term139188.getClass(), "clientProperties", null);
        setField(term139188, term139188.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term139188, term139188.getClass(), "autoscrolls", false);
        setField(term139188, term139188.getClass(), "border", null);
        setIntField(term139188, term139188.getClass(), "flags", 0);
        setField(term139188, term139188.getClass(), "inputVerifier", null);
        setBooleanField(term139188, term139188.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term139188, term139188.getClass(), "paintingChild", null);
        setField(term139188, term139188.getClass(), "popupMenu", null);
        setField(term139188, term139188.getClass(), "revalidateRunnableScheduled", null);
        setField(term139188, term139188.getClass(), "focusInputMap", null);
        setField(term139188, term139188.getClass(), "ancestorInputMap", null);
        setField(term139188, term139188.getClass(), "windowInputMap", null);
        setField(term139188, term139188.getClass(), "actionMap", null);
        setField(term139188, term139188.getClass(), "aaHint", null);
        setField(term139188, term139188.getClass(), "lcdRenderingHint", null);
        setField(term139188, term139188.getClass(), "component", null);
        setField(term139188, term139188.getClass(), "layoutMgr", null);
        setField(term139188, term139188.getClass(), "dispatcher", null);
        setField(term139188, term139188.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term139188, term139188.getClass(), "focusCycleRoot", false);
        setBooleanField(term139188, term139188.getClass(), "focusTraversalPolicyProvider", false);
        setField(term139188, term139188.getClass(), "printingThreads", null);
        setBooleanField(term139188, term139188.getClass(), "printing", false);
        setField(term139188, term139188.getClass(), "containerListener", null);
        setIntField(term139188, term139188.getClass(), "listeningChildren", 0);
        setIntField(term139188, term139188.getClass(), "listeningBoundsChildren", 0);
        setIntField(term139188, term139188.getClass(), "descendantsCount", 0);
        setField(term139188, term139188.getClass(), "preserveBackgroundColor", null);
        setIntField(term139188, term139188.getClass(), "numOfHWComponents", 0);
        setIntField(term139188, term139188.getClass(), "numOfLWComponents", 0);
        setField(term139188, term139188.getClass(), "modalComp", null);
        setField(term139188, term139188.getClass(), "modalAppContext", null);
        setIntField(term139188, term139188.getClass(), "containerSerializedDataVersion", 0);
        setField(term139188, term139188.getClass(), "peer", null);
        setField(term139188, term139188.getClass(), "parent", null);
        setField(term139188, term139188.getClass(), "appContext", null);
        setIntField(term139188, term139188.getClass(), "x", 0);
        setIntField(term139188, term139188.getClass(), "y", 0);
        setIntField(term139188, term139188.getClass(), "width", 0);
        setIntField(term139188, term139188.getClass(), "height", 0);
        setField(term139188, term139188.getClass(), "foreground", null);
        setField(term139188, term139188.getClass(), "background", null);
        setField(term139188, term139188.getClass(), "font", null);
        setField(term139188, term139188.getClass(), "peerFont", null);
        setField(term139188, term139188.getClass(), "cursor", null);
        setField(term139188, term139188.getClass(), "locale", null);
        setField(term139188, term139188.getClass(), "graphicsConfig", null);
        setField(term139188, term139188.getClass(), "bufferStrategy", null);
        setBooleanField(term139188, term139188.getClass(), "ignoreRepaint", false);
        setBooleanField(term139188, term139188.getClass(), "visible", false);
        setBooleanField(term139188, term139188.getClass(), "enabled", false);
        setBooleanField(term139188, term139188.getClass(), "valid", false);
        setField(term139188, term139188.getClass(), "dropTarget", null);
        setField(term139188, term139188.getClass(), "popups", null);
        setField(term139188, term139188.getClass(), "name", null);
        setBooleanField(term139188, term139188.getClass(), "nameExplicitlySet", false);
        setBooleanField(term139188, term139188.getClass(), "focusable", false);
        setIntField(term139188, term139188.getClass(), "isFocusTraversableOverridden", 0);
        setField(term139188, term139188.getClass(), "focusTraversalKeys", null);
        setBooleanField(term139188, term139188.getClass(), "focusTraversalKeysEnabled", false);
        setField(term139188, term139188.getClass(), "acc", null);
        setField(term139188, term139188.getClass(), "minSize", null);
        setBooleanField(term139188, term139188.getClass(), "minSizeSet", false);
        setField(term139188, term139188.getClass(), "prefSize", null);
        setBooleanField(term139188, term139188.getClass(), "prefSizeSet", false);
        setField(term139188, term139188.getClass(), "maxSize", null);
        setBooleanField(term139188, term139188.getClass(), "maxSizeSet", false);
        setField(term139188, term139188.getClass(), "componentOrientation", null);
        setBooleanField(term139188, term139188.getClass(), "newEventsOnly", false);
        setField(term139188, term139188.getClass(), "componentListener", null);
        setField(term139188, term139188.getClass(), "focusListener", null);
        setField(term139188, term139188.getClass(), "hierarchyListener", null);
        setField(term139188, term139188.getClass(), "hierarchyBoundsListener", null);
        setField(term139188, term139188.getClass(), "keyListener", null);
        setField(term139188, term139188.getClass(), "mouseListener", null);
        setField(term139188, term139188.getClass(), "mouseMotionListener", null);
        setField(term139188, term139188.getClass(), "mouseWheelListener", null);
        setField(term139188, term139188.getClass(), "inputMethodListener", null);
        setLongField(term139188, term139188.getClass(), "eventMask", 0L);
        setField(term139188, term139188.getClass(), "changeSupport", null);
        setField(term139188, term139188.getClass(), "objectLock", null);
        setBooleanField(term139188, term139188.getClass(), "isPacked", false);
        setIntField(term139188, term139188.getClass(), "boundsOp", 0);
        setField(term139188, term139188.getClass(), "compoundShape", null);
        setField(term139188, term139188.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term139188, term139188.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term139188, term139188.getClass(), "backgroundEraseDisabled", false);
        setField(term139188, term139188.getClass(), "eventCache", null);
        setBooleanField(term139188, term139188.getClass(), "coalescingEnabled", false);
        setBooleanField(term139188, term139188.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term139188, term139188.getClass(), "componentSerializedDataVersion", 0);
        setField(term139188, term139188.getClass(), "accessibleContext", null);
        term139259 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term139259;
        callMethod(klass, "setCursorFocus", argTypes, term139188, args);
    }

};


