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

public class MapPanel_getLastDrawnY_86837632268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137977;

    public MapPanel_getLastDrawnY_86837632268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137977 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term137977, term137977.getClass(), "viewPointX", 0);
        setIntField(term137977, term137977.getClass(), "viewPointY", 0);
        setIntField(term137977, term137977.getClass(), "viewPointOffsetX", 0);
        setIntField(term137977, term137977.getClass(), "viewPointOffsetY", 0);
        setField(term137977, term137977.getClass(), "screen", null);
        setField(term137977, term137977.getClass(), "backgroundScreen", null);
        setIntField(term137977, term137977.getClass(), "flickerBlue", 0);
        setBooleanField(term137977, term137977.getClass(), "flickerGoUp", false);
        setIntField(term137977, term137977.getClass(), "lastDrawnCenterX", 0);
        setIntField(term137977, term137977.getClass(), "lastDrawnCenterY", 0);
        setField(term137977, term137977.getClass(), "route", null);
        setBooleanField(term137977, term137977.getClass(), "battle", false);
        setIntField(term137977, term137977.getClass(), "wormHoleAnimation", 0);
        setField(term137977, term137977.getClass(), "historyCultures", null);
        setBooleanField(term137977, term137977.getClass(), "historyCoordInitialized", false);
        setIntField(term137977, term137977.getClass(), "historyCoordX", 0);
        setIntField(term137977, term137977.getClass(), "historyCoordY", 0);
        setField(term137977, term137977.getClass(), "leftSpaceImage", null);
        setField(term137977, term137977.getClass(), "rightSpaceImage", null);
        setField(term137977, term137977.getClass(), "popup", null);
        setField(term137977, term137977.getClass(), "tileOverride", null);
        setField(term137977, term137977.getClass(), "redrawTile", null);
        setBooleanField(term137977, term137977.getClass(), "fullDraw", false);
        setIntField(term137977, term137977.getClass(), "cursorFocus", 0);
        setField(term137977, term137977.getClass(), "minimap", null);
        setBooleanField(term137977, term137977.getClass(), "showMiniMap", false);
        setBooleanField(term137977, term137977.getClass(), "highContrastGrid", false);
        setIntField(term137977, term137977.getClass(), "miniMapTopX", 0);
        setIntField(term137977, term137977.getClass(), "miniMapTopY", 0);
        setIntField(term137977, term137977.getClass(), "miniMapBotX", 0);
        setIntField(term137977, term137977.getClass(), "miniMapBotY", 0);
        setIntField(term137977, term137977.getClass(), "transparency", 0);
        setBooleanField(term137977, term137977.getClass(), "improvedParallax", false);
        setBooleanField(term137977, term137977.getClass(), "updateAnimation", false);
        setIntField(term137977, term137977.getClass(), "updateAnimationCount", 0);
        setBooleanField(term137977, term137977.getClass(), "drawWeaponRange", false);
        setField(term137977, term137977.getClass(), "panelType", null);
        setIntField(term137977, term137977.getClass(), "lastCursorPosX", 0);
        setIntField(term137977, term137977.getClass(), "lastCursorPosY", 0);
        setIntField(term137977, term137977.getClass(), "lastZoomLevel", 0);
        setBooleanField(term137977, term137977.getClass(), "redoViewPoints", false);
        setBooleanField(term137977, term137977.getClass(), "isAlignmentXSet", false);
        setFloatField(term137977, term137977.getClass(), "alignmentX", 0.0F);
        setBooleanField(term137977, term137977.getClass(), "isAlignmentYSet", false);
        setFloatField(term137977, term137977.getClass(), "alignmentY", 0.0F);
        setField(term137977, term137977.getClass(), "ui", null);
        setField(term137977, term137977.getClass(), "listenerList", null);
        setField(term137977, term137977.getClass(), "clientProperties", null);
        setField(term137977, term137977.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term137977, term137977.getClass(), "autoscrolls", false);
        setField(term137977, term137977.getClass(), "border", null);
        setIntField(term137977, term137977.getClass(), "flags", 0);
        setField(term137977, term137977.getClass(), "inputVerifier", null);
        setBooleanField(term137977, term137977.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term137977, term137977.getClass(), "paintingChild", null);
        setField(term137977, term137977.getClass(), "popupMenu", null);
        setField(term137977, term137977.getClass(), "revalidateRunnableScheduled", null);
        setField(term137977, term137977.getClass(), "focusInputMap", null);
        setField(term137977, term137977.getClass(), "ancestorInputMap", null);
        setField(term137977, term137977.getClass(), "windowInputMap", null);
        setField(term137977, term137977.getClass(), "actionMap", null);
        setField(term137977, term137977.getClass(), "aaHint", null);
        setField(term137977, term137977.getClass(), "lcdRenderingHint", null);
        setField(term137977, term137977.getClass(), "component", null);
        setField(term137977, term137977.getClass(), "layoutMgr", null);
        setField(term137977, term137977.getClass(), "dispatcher", null);
        setField(term137977, term137977.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term137977, term137977.getClass(), "focusCycleRoot", false);
        setBooleanField(term137977, term137977.getClass(), "focusTraversalPolicyProvider", false);
        setField(term137977, term137977.getClass(), "printingThreads", null);
        setBooleanField(term137977, term137977.getClass(), "printing", false);
        setField(term137977, term137977.getClass(), "containerListener", null);
        setIntField(term137977, term137977.getClass(), "listeningChildren", 0);
        setIntField(term137977, term137977.getClass(), "listeningBoundsChildren", 0);
        setIntField(term137977, term137977.getClass(), "descendantsCount", 0);
        setField(term137977, term137977.getClass(), "preserveBackgroundColor", null);
        setIntField(term137977, term137977.getClass(), "numOfHWComponents", 0);
        setIntField(term137977, term137977.getClass(), "numOfLWComponents", 0);
        setField(term137977, term137977.getClass(), "modalComp", null);
        setField(term137977, term137977.getClass(), "modalAppContext", null);
        setIntField(term137977, term137977.getClass(), "containerSerializedDataVersion", 0);
        setField(term137977, term137977.getClass(), "peer", null);
        setField(term137977, term137977.getClass(), "parent", null);
        setField(term137977, term137977.getClass(), "appContext", null);
        setIntField(term137977, term137977.getClass(), "x", 0);
        setIntField(term137977, term137977.getClass(), "y", 0);
        setIntField(term137977, term137977.getClass(), "width", 0);
        setIntField(term137977, term137977.getClass(), "height", 0);
        setField(term137977, term137977.getClass(), "foreground", null);
        setField(term137977, term137977.getClass(), "background", null);
        setField(term137977, term137977.getClass(), "font", null);
        setField(term137977, term137977.getClass(), "peerFont", null);
        setField(term137977, term137977.getClass(), "cursor", null);
        setField(term137977, term137977.getClass(), "locale", null);
        setField(term137977, term137977.getClass(), "graphicsConfig", null);
        setField(term137977, term137977.getClass(), "bufferStrategy", null);
        setBooleanField(term137977, term137977.getClass(), "ignoreRepaint", false);
        setBooleanField(term137977, term137977.getClass(), "visible", false);
        setBooleanField(term137977, term137977.getClass(), "enabled", false);
        setBooleanField(term137977, term137977.getClass(), "valid", false);
        setField(term137977, term137977.getClass(), "dropTarget", null);
        setField(term137977, term137977.getClass(), "popups", null);
        setField(term137977, term137977.getClass(), "name", null);
        setBooleanField(term137977, term137977.getClass(), "nameExplicitlySet", false);
        setBooleanField(term137977, term137977.getClass(), "focusable", false);
        setIntField(term137977, term137977.getClass(), "isFocusTraversableOverridden", 0);
        setField(term137977, term137977.getClass(), "focusTraversalKeys", null);
        setBooleanField(term137977, term137977.getClass(), "focusTraversalKeysEnabled", false);
        setField(term137977, term137977.getClass(), "acc", null);
        setField(term137977, term137977.getClass(), "minSize", null);
        setBooleanField(term137977, term137977.getClass(), "minSizeSet", false);
        setField(term137977, term137977.getClass(), "prefSize", null);
        setBooleanField(term137977, term137977.getClass(), "prefSizeSet", false);
        setField(term137977, term137977.getClass(), "maxSize", null);
        setBooleanField(term137977, term137977.getClass(), "maxSizeSet", false);
        setField(term137977, term137977.getClass(), "componentOrientation", null);
        setBooleanField(term137977, term137977.getClass(), "newEventsOnly", false);
        setField(term137977, term137977.getClass(), "componentListener", null);
        setField(term137977, term137977.getClass(), "focusListener", null);
        setField(term137977, term137977.getClass(), "hierarchyListener", null);
        setField(term137977, term137977.getClass(), "hierarchyBoundsListener", null);
        setField(term137977, term137977.getClass(), "keyListener", null);
        setField(term137977, term137977.getClass(), "mouseListener", null);
        setField(term137977, term137977.getClass(), "mouseMotionListener", null);
        setField(term137977, term137977.getClass(), "mouseWheelListener", null);
        setField(term137977, term137977.getClass(), "inputMethodListener", null);
        setLongField(term137977, term137977.getClass(), "eventMask", 0L);
        setField(term137977, term137977.getClass(), "changeSupport", null);
        setField(term137977, term137977.getClass(), "objectLock", null);
        setBooleanField(term137977, term137977.getClass(), "isPacked", false);
        setIntField(term137977, term137977.getClass(), "boundsOp", 0);
        setField(term137977, term137977.getClass(), "compoundShape", null);
        setField(term137977, term137977.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term137977, term137977.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term137977, term137977.getClass(), "backgroundEraseDisabled", false);
        setField(term137977, term137977.getClass(), "eventCache", null);
        setBooleanField(term137977, term137977.getClass(), "coalescingEnabled", false);
        setBooleanField(term137977, term137977.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term137977, term137977.getClass(), "componentSerializedDataVersion", 0);
        setField(term137977, term137977.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDrawnY", argTypes, term137977, args);
    }

};


