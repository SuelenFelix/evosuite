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

public class MapPanel_redoViewPoints_155742205197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140046;

    public MapPanel_redoViewPoints_155742205197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140046 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term140046, term140046.getClass(), "viewPointX", 0);
        setIntField(term140046, term140046.getClass(), "viewPointY", 0);
        setIntField(term140046, term140046.getClass(), "viewPointOffsetX", 0);
        setIntField(term140046, term140046.getClass(), "viewPointOffsetY", 0);
        setField(term140046, term140046.getClass(), "screen", null);
        setField(term140046, term140046.getClass(), "backgroundScreen", null);
        setIntField(term140046, term140046.getClass(), "flickerBlue", 0);
        setBooleanField(term140046, term140046.getClass(), "flickerGoUp", false);
        setIntField(term140046, term140046.getClass(), "lastDrawnCenterX", 0);
        setIntField(term140046, term140046.getClass(), "lastDrawnCenterY", 0);
        setField(term140046, term140046.getClass(), "route", null);
        setBooleanField(term140046, term140046.getClass(), "battle", false);
        setIntField(term140046, term140046.getClass(), "wormHoleAnimation", 0);
        setField(term140046, term140046.getClass(), "historyCultures", null);
        setBooleanField(term140046, term140046.getClass(), "historyCoordInitialized", false);
        setIntField(term140046, term140046.getClass(), "historyCoordX", 0);
        setIntField(term140046, term140046.getClass(), "historyCoordY", 0);
        setField(term140046, term140046.getClass(), "leftSpaceImage", null);
        setField(term140046, term140046.getClass(), "rightSpaceImage", null);
        setField(term140046, term140046.getClass(), "popup", null);
        setField(term140046, term140046.getClass(), "tileOverride", null);
        setField(term140046, term140046.getClass(), "redrawTile", null);
        setBooleanField(term140046, term140046.getClass(), "fullDraw", false);
        setIntField(term140046, term140046.getClass(), "cursorFocus", 0);
        setField(term140046, term140046.getClass(), "minimap", null);
        setBooleanField(term140046, term140046.getClass(), "showMiniMap", false);
        setBooleanField(term140046, term140046.getClass(), "highContrastGrid", false);
        setIntField(term140046, term140046.getClass(), "miniMapTopX", 0);
        setIntField(term140046, term140046.getClass(), "miniMapTopY", 0);
        setIntField(term140046, term140046.getClass(), "miniMapBotX", 0);
        setIntField(term140046, term140046.getClass(), "miniMapBotY", 0);
        setIntField(term140046, term140046.getClass(), "transparency", 0);
        setBooleanField(term140046, term140046.getClass(), "improvedParallax", false);
        setBooleanField(term140046, term140046.getClass(), "updateAnimation", false);
        setIntField(term140046, term140046.getClass(), "updateAnimationCount", 0);
        setBooleanField(term140046, term140046.getClass(), "drawWeaponRange", false);
        setField(term140046, term140046.getClass(), "panelType", null);
        setIntField(term140046, term140046.getClass(), "lastCursorPosX", 0);
        setIntField(term140046, term140046.getClass(), "lastCursorPosY", 0);
        setIntField(term140046, term140046.getClass(), "lastZoomLevel", 0);
        setBooleanField(term140046, term140046.getClass(), "redoViewPoints", false);
        setBooleanField(term140046, term140046.getClass(), "isAlignmentXSet", false);
        setFloatField(term140046, term140046.getClass(), "alignmentX", 0.0F);
        setBooleanField(term140046, term140046.getClass(), "isAlignmentYSet", false);
        setFloatField(term140046, term140046.getClass(), "alignmentY", 0.0F);
        setField(term140046, term140046.getClass(), "ui", null);
        setField(term140046, term140046.getClass(), "listenerList", null);
        setField(term140046, term140046.getClass(), "clientProperties", null);
        setField(term140046, term140046.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term140046, term140046.getClass(), "autoscrolls", false);
        setField(term140046, term140046.getClass(), "border", null);
        setIntField(term140046, term140046.getClass(), "flags", 0);
        setField(term140046, term140046.getClass(), "inputVerifier", null);
        setBooleanField(term140046, term140046.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term140046, term140046.getClass(), "paintingChild", null);
        setField(term140046, term140046.getClass(), "popupMenu", null);
        setField(term140046, term140046.getClass(), "revalidateRunnableScheduled", null);
        setField(term140046, term140046.getClass(), "focusInputMap", null);
        setField(term140046, term140046.getClass(), "ancestorInputMap", null);
        setField(term140046, term140046.getClass(), "windowInputMap", null);
        setField(term140046, term140046.getClass(), "actionMap", null);
        setField(term140046, term140046.getClass(), "aaHint", null);
        setField(term140046, term140046.getClass(), "lcdRenderingHint", null);
        setField(term140046, term140046.getClass(), "component", null);
        setField(term140046, term140046.getClass(), "layoutMgr", null);
        setField(term140046, term140046.getClass(), "dispatcher", null);
        setField(term140046, term140046.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term140046, term140046.getClass(), "focusCycleRoot", false);
        setBooleanField(term140046, term140046.getClass(), "focusTraversalPolicyProvider", false);
        setField(term140046, term140046.getClass(), "printingThreads", null);
        setBooleanField(term140046, term140046.getClass(), "printing", false);
        setField(term140046, term140046.getClass(), "containerListener", null);
        setIntField(term140046, term140046.getClass(), "listeningChildren", 0);
        setIntField(term140046, term140046.getClass(), "listeningBoundsChildren", 0);
        setIntField(term140046, term140046.getClass(), "descendantsCount", 0);
        setField(term140046, term140046.getClass(), "preserveBackgroundColor", null);
        setIntField(term140046, term140046.getClass(), "numOfHWComponents", 0);
        setIntField(term140046, term140046.getClass(), "numOfLWComponents", 0);
        setField(term140046, term140046.getClass(), "modalComp", null);
        setField(term140046, term140046.getClass(), "modalAppContext", null);
        setIntField(term140046, term140046.getClass(), "containerSerializedDataVersion", 0);
        setField(term140046, term140046.getClass(), "peer", null);
        setField(term140046, term140046.getClass(), "parent", null);
        setField(term140046, term140046.getClass(), "appContext", null);
        setIntField(term140046, term140046.getClass(), "x", 0);
        setIntField(term140046, term140046.getClass(), "y", 0);
        setIntField(term140046, term140046.getClass(), "width", 0);
        setIntField(term140046, term140046.getClass(), "height", 0);
        setField(term140046, term140046.getClass(), "foreground", null);
        setField(term140046, term140046.getClass(), "background", null);
        setField(term140046, term140046.getClass(), "font", null);
        setField(term140046, term140046.getClass(), "peerFont", null);
        setField(term140046, term140046.getClass(), "cursor", null);
        setField(term140046, term140046.getClass(), "locale", null);
        setField(term140046, term140046.getClass(), "graphicsConfig", null);
        setField(term140046, term140046.getClass(), "bufferStrategy", null);
        setBooleanField(term140046, term140046.getClass(), "ignoreRepaint", false);
        setBooleanField(term140046, term140046.getClass(), "visible", false);
        setBooleanField(term140046, term140046.getClass(), "enabled", false);
        setBooleanField(term140046, term140046.getClass(), "valid", false);
        setField(term140046, term140046.getClass(), "dropTarget", null);
        setField(term140046, term140046.getClass(), "popups", null);
        setField(term140046, term140046.getClass(), "name", null);
        setBooleanField(term140046, term140046.getClass(), "nameExplicitlySet", false);
        setBooleanField(term140046, term140046.getClass(), "focusable", false);
        setIntField(term140046, term140046.getClass(), "isFocusTraversableOverridden", 0);
        setField(term140046, term140046.getClass(), "focusTraversalKeys", null);
        setBooleanField(term140046, term140046.getClass(), "focusTraversalKeysEnabled", false);
        setField(term140046, term140046.getClass(), "acc", null);
        setField(term140046, term140046.getClass(), "minSize", null);
        setBooleanField(term140046, term140046.getClass(), "minSizeSet", false);
        setField(term140046, term140046.getClass(), "prefSize", null);
        setBooleanField(term140046, term140046.getClass(), "prefSizeSet", false);
        setField(term140046, term140046.getClass(), "maxSize", null);
        setBooleanField(term140046, term140046.getClass(), "maxSizeSet", false);
        setField(term140046, term140046.getClass(), "componentOrientation", null);
        setBooleanField(term140046, term140046.getClass(), "newEventsOnly", false);
        setField(term140046, term140046.getClass(), "componentListener", null);
        setField(term140046, term140046.getClass(), "focusListener", null);
        setField(term140046, term140046.getClass(), "hierarchyListener", null);
        setField(term140046, term140046.getClass(), "hierarchyBoundsListener", null);
        setField(term140046, term140046.getClass(), "keyListener", null);
        setField(term140046, term140046.getClass(), "mouseListener", null);
        setField(term140046, term140046.getClass(), "mouseMotionListener", null);
        setField(term140046, term140046.getClass(), "mouseWheelListener", null);
        setField(term140046, term140046.getClass(), "inputMethodListener", null);
        setLongField(term140046, term140046.getClass(), "eventMask", 0L);
        setField(term140046, term140046.getClass(), "changeSupport", null);
        setField(term140046, term140046.getClass(), "objectLock", null);
        setBooleanField(term140046, term140046.getClass(), "isPacked", false);
        setIntField(term140046, term140046.getClass(), "boundsOp", 0);
        setField(term140046, term140046.getClass(), "compoundShape", null);
        setField(term140046, term140046.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term140046, term140046.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term140046, term140046.getClass(), "backgroundEraseDisabled", false);
        setField(term140046, term140046.getClass(), "eventCache", null);
        setBooleanField(term140046, term140046.getClass(), "coalescingEnabled", false);
        setBooleanField(term140046, term140046.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term140046, term140046.getClass(), "componentSerializedDataVersion", 0);
        setField(term140046, term140046.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "redoViewPoints", argTypes, term140046, args);
    }

};


