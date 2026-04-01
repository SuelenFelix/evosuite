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

public class MapPanel_getLastDrawnX_86837728367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137906;

    public MapPanel_getLastDrawnX_86837728367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137906 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term137906, term137906.getClass(), "viewPointX", 0);
        setIntField(term137906, term137906.getClass(), "viewPointY", 0);
        setIntField(term137906, term137906.getClass(), "viewPointOffsetX", 0);
        setIntField(term137906, term137906.getClass(), "viewPointOffsetY", 0);
        setField(term137906, term137906.getClass(), "screen", null);
        setField(term137906, term137906.getClass(), "backgroundScreen", null);
        setIntField(term137906, term137906.getClass(), "flickerBlue", 0);
        setBooleanField(term137906, term137906.getClass(), "flickerGoUp", false);
        setIntField(term137906, term137906.getClass(), "lastDrawnCenterX", 0);
        setIntField(term137906, term137906.getClass(), "lastDrawnCenterY", 0);
        setField(term137906, term137906.getClass(), "route", null);
        setBooleanField(term137906, term137906.getClass(), "battle", false);
        setIntField(term137906, term137906.getClass(), "wormHoleAnimation", 0);
        setField(term137906, term137906.getClass(), "historyCultures", null);
        setBooleanField(term137906, term137906.getClass(), "historyCoordInitialized", false);
        setIntField(term137906, term137906.getClass(), "historyCoordX", 0);
        setIntField(term137906, term137906.getClass(), "historyCoordY", 0);
        setField(term137906, term137906.getClass(), "leftSpaceImage", null);
        setField(term137906, term137906.getClass(), "rightSpaceImage", null);
        setField(term137906, term137906.getClass(), "popup", null);
        setField(term137906, term137906.getClass(), "tileOverride", null);
        setField(term137906, term137906.getClass(), "redrawTile", null);
        setBooleanField(term137906, term137906.getClass(), "fullDraw", false);
        setIntField(term137906, term137906.getClass(), "cursorFocus", 0);
        setField(term137906, term137906.getClass(), "minimap", null);
        setBooleanField(term137906, term137906.getClass(), "showMiniMap", false);
        setBooleanField(term137906, term137906.getClass(), "highContrastGrid", false);
        setIntField(term137906, term137906.getClass(), "miniMapTopX", 0);
        setIntField(term137906, term137906.getClass(), "miniMapTopY", 0);
        setIntField(term137906, term137906.getClass(), "miniMapBotX", 0);
        setIntField(term137906, term137906.getClass(), "miniMapBotY", 0);
        setIntField(term137906, term137906.getClass(), "transparency", 0);
        setBooleanField(term137906, term137906.getClass(), "improvedParallax", false);
        setBooleanField(term137906, term137906.getClass(), "updateAnimation", false);
        setIntField(term137906, term137906.getClass(), "updateAnimationCount", 0);
        setBooleanField(term137906, term137906.getClass(), "drawWeaponRange", false);
        setField(term137906, term137906.getClass(), "panelType", null);
        setIntField(term137906, term137906.getClass(), "lastCursorPosX", 0);
        setIntField(term137906, term137906.getClass(), "lastCursorPosY", 0);
        setIntField(term137906, term137906.getClass(), "lastZoomLevel", 0);
        setBooleanField(term137906, term137906.getClass(), "redoViewPoints", false);
        setBooleanField(term137906, term137906.getClass(), "isAlignmentXSet", false);
        setFloatField(term137906, term137906.getClass(), "alignmentX", 0.0F);
        setBooleanField(term137906, term137906.getClass(), "isAlignmentYSet", false);
        setFloatField(term137906, term137906.getClass(), "alignmentY", 0.0F);
        setField(term137906, term137906.getClass(), "ui", null);
        setField(term137906, term137906.getClass(), "listenerList", null);
        setField(term137906, term137906.getClass(), "clientProperties", null);
        setField(term137906, term137906.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term137906, term137906.getClass(), "autoscrolls", false);
        setField(term137906, term137906.getClass(), "border", null);
        setIntField(term137906, term137906.getClass(), "flags", 0);
        setField(term137906, term137906.getClass(), "inputVerifier", null);
        setBooleanField(term137906, term137906.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term137906, term137906.getClass(), "paintingChild", null);
        setField(term137906, term137906.getClass(), "popupMenu", null);
        setField(term137906, term137906.getClass(), "revalidateRunnableScheduled", null);
        setField(term137906, term137906.getClass(), "focusInputMap", null);
        setField(term137906, term137906.getClass(), "ancestorInputMap", null);
        setField(term137906, term137906.getClass(), "windowInputMap", null);
        setField(term137906, term137906.getClass(), "actionMap", null);
        setField(term137906, term137906.getClass(), "aaHint", null);
        setField(term137906, term137906.getClass(), "lcdRenderingHint", null);
        setField(term137906, term137906.getClass(), "component", null);
        setField(term137906, term137906.getClass(), "layoutMgr", null);
        setField(term137906, term137906.getClass(), "dispatcher", null);
        setField(term137906, term137906.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term137906, term137906.getClass(), "focusCycleRoot", false);
        setBooleanField(term137906, term137906.getClass(), "focusTraversalPolicyProvider", false);
        setField(term137906, term137906.getClass(), "printingThreads", null);
        setBooleanField(term137906, term137906.getClass(), "printing", false);
        setField(term137906, term137906.getClass(), "containerListener", null);
        setIntField(term137906, term137906.getClass(), "listeningChildren", 0);
        setIntField(term137906, term137906.getClass(), "listeningBoundsChildren", 0);
        setIntField(term137906, term137906.getClass(), "descendantsCount", 0);
        setField(term137906, term137906.getClass(), "preserveBackgroundColor", null);
        setIntField(term137906, term137906.getClass(), "numOfHWComponents", 0);
        setIntField(term137906, term137906.getClass(), "numOfLWComponents", 0);
        setField(term137906, term137906.getClass(), "modalComp", null);
        setField(term137906, term137906.getClass(), "modalAppContext", null);
        setIntField(term137906, term137906.getClass(), "containerSerializedDataVersion", 0);
        setField(term137906, term137906.getClass(), "peer", null);
        setField(term137906, term137906.getClass(), "parent", null);
        setField(term137906, term137906.getClass(), "appContext", null);
        setIntField(term137906, term137906.getClass(), "x", 0);
        setIntField(term137906, term137906.getClass(), "y", 0);
        setIntField(term137906, term137906.getClass(), "width", 0);
        setIntField(term137906, term137906.getClass(), "height", 0);
        setField(term137906, term137906.getClass(), "foreground", null);
        setField(term137906, term137906.getClass(), "background", null);
        setField(term137906, term137906.getClass(), "font", null);
        setField(term137906, term137906.getClass(), "peerFont", null);
        setField(term137906, term137906.getClass(), "cursor", null);
        setField(term137906, term137906.getClass(), "locale", null);
        setField(term137906, term137906.getClass(), "graphicsConfig", null);
        setField(term137906, term137906.getClass(), "bufferStrategy", null);
        setBooleanField(term137906, term137906.getClass(), "ignoreRepaint", false);
        setBooleanField(term137906, term137906.getClass(), "visible", false);
        setBooleanField(term137906, term137906.getClass(), "enabled", false);
        setBooleanField(term137906, term137906.getClass(), "valid", false);
        setField(term137906, term137906.getClass(), "dropTarget", null);
        setField(term137906, term137906.getClass(), "popups", null);
        setField(term137906, term137906.getClass(), "name", null);
        setBooleanField(term137906, term137906.getClass(), "nameExplicitlySet", false);
        setBooleanField(term137906, term137906.getClass(), "focusable", false);
        setIntField(term137906, term137906.getClass(), "isFocusTraversableOverridden", 0);
        setField(term137906, term137906.getClass(), "focusTraversalKeys", null);
        setBooleanField(term137906, term137906.getClass(), "focusTraversalKeysEnabled", false);
        setField(term137906, term137906.getClass(), "acc", null);
        setField(term137906, term137906.getClass(), "minSize", null);
        setBooleanField(term137906, term137906.getClass(), "minSizeSet", false);
        setField(term137906, term137906.getClass(), "prefSize", null);
        setBooleanField(term137906, term137906.getClass(), "prefSizeSet", false);
        setField(term137906, term137906.getClass(), "maxSize", null);
        setBooleanField(term137906, term137906.getClass(), "maxSizeSet", false);
        setField(term137906, term137906.getClass(), "componentOrientation", null);
        setBooleanField(term137906, term137906.getClass(), "newEventsOnly", false);
        setField(term137906, term137906.getClass(), "componentListener", null);
        setField(term137906, term137906.getClass(), "focusListener", null);
        setField(term137906, term137906.getClass(), "hierarchyListener", null);
        setField(term137906, term137906.getClass(), "hierarchyBoundsListener", null);
        setField(term137906, term137906.getClass(), "keyListener", null);
        setField(term137906, term137906.getClass(), "mouseListener", null);
        setField(term137906, term137906.getClass(), "mouseMotionListener", null);
        setField(term137906, term137906.getClass(), "mouseWheelListener", null);
        setField(term137906, term137906.getClass(), "inputMethodListener", null);
        setLongField(term137906, term137906.getClass(), "eventMask", 0L);
        setField(term137906, term137906.getClass(), "changeSupport", null);
        setField(term137906, term137906.getClass(), "objectLock", null);
        setBooleanField(term137906, term137906.getClass(), "isPacked", false);
        setIntField(term137906, term137906.getClass(), "boundsOp", 0);
        setField(term137906, term137906.getClass(), "compoundShape", null);
        setField(term137906, term137906.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term137906, term137906.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term137906, term137906.getClass(), "backgroundEraseDisabled", false);
        setField(term137906, term137906.getClass(), "eventCache", null);
        setBooleanField(term137906, term137906.getClass(), "coalescingEnabled", false);
        setBooleanField(term137906, term137906.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term137906, term137906.getClass(), "componentSerializedDataVersion", 0);
        setField(term137906, term137906.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDrawnX", argTypes, term137906, args);
    }

};


