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

public class MapPanel_isDrawWeaponRange_211138641088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139405;

    public MapPanel_isDrawWeaponRange_211138641088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139405 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term139405, term139405.getClass(), "viewPointX", 0);
        setIntField(term139405, term139405.getClass(), "viewPointY", 0);
        setIntField(term139405, term139405.getClass(), "viewPointOffsetX", 0);
        setIntField(term139405, term139405.getClass(), "viewPointOffsetY", 0);
        setField(term139405, term139405.getClass(), "screen", null);
        setField(term139405, term139405.getClass(), "backgroundScreen", null);
        setIntField(term139405, term139405.getClass(), "flickerBlue", 0);
        setBooleanField(term139405, term139405.getClass(), "flickerGoUp", false);
        setIntField(term139405, term139405.getClass(), "lastDrawnCenterX", 0);
        setIntField(term139405, term139405.getClass(), "lastDrawnCenterY", 0);
        setField(term139405, term139405.getClass(), "route", null);
        setBooleanField(term139405, term139405.getClass(), "battle", false);
        setIntField(term139405, term139405.getClass(), "wormHoleAnimation", 0);
        setField(term139405, term139405.getClass(), "historyCultures", null);
        setBooleanField(term139405, term139405.getClass(), "historyCoordInitialized", false);
        setIntField(term139405, term139405.getClass(), "historyCoordX", 0);
        setIntField(term139405, term139405.getClass(), "historyCoordY", 0);
        setField(term139405, term139405.getClass(), "leftSpaceImage", null);
        setField(term139405, term139405.getClass(), "rightSpaceImage", null);
        setField(term139405, term139405.getClass(), "popup", null);
        setField(term139405, term139405.getClass(), "tileOverride", null);
        setField(term139405, term139405.getClass(), "redrawTile", null);
        setBooleanField(term139405, term139405.getClass(), "fullDraw", false);
        setIntField(term139405, term139405.getClass(), "cursorFocus", 0);
        setField(term139405, term139405.getClass(), "minimap", null);
        setBooleanField(term139405, term139405.getClass(), "showMiniMap", false);
        setBooleanField(term139405, term139405.getClass(), "highContrastGrid", false);
        setIntField(term139405, term139405.getClass(), "miniMapTopX", 0);
        setIntField(term139405, term139405.getClass(), "miniMapTopY", 0);
        setIntField(term139405, term139405.getClass(), "miniMapBotX", 0);
        setIntField(term139405, term139405.getClass(), "miniMapBotY", 0);
        setIntField(term139405, term139405.getClass(), "transparency", 0);
        setBooleanField(term139405, term139405.getClass(), "improvedParallax", false);
        setBooleanField(term139405, term139405.getClass(), "updateAnimation", false);
        setIntField(term139405, term139405.getClass(), "updateAnimationCount", 0);
        setBooleanField(term139405, term139405.getClass(), "drawWeaponRange", false);
        setField(term139405, term139405.getClass(), "panelType", null);
        setIntField(term139405, term139405.getClass(), "lastCursorPosX", 0);
        setIntField(term139405, term139405.getClass(), "lastCursorPosY", 0);
        setIntField(term139405, term139405.getClass(), "lastZoomLevel", 0);
        setBooleanField(term139405, term139405.getClass(), "redoViewPoints", false);
        setBooleanField(term139405, term139405.getClass(), "isAlignmentXSet", false);
        setFloatField(term139405, term139405.getClass(), "alignmentX", 0.0F);
        setBooleanField(term139405, term139405.getClass(), "isAlignmentYSet", false);
        setFloatField(term139405, term139405.getClass(), "alignmentY", 0.0F);
        setField(term139405, term139405.getClass(), "ui", null);
        setField(term139405, term139405.getClass(), "listenerList", null);
        setField(term139405, term139405.getClass(), "clientProperties", null);
        setField(term139405, term139405.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term139405, term139405.getClass(), "autoscrolls", false);
        setField(term139405, term139405.getClass(), "border", null);
        setIntField(term139405, term139405.getClass(), "flags", 0);
        setField(term139405, term139405.getClass(), "inputVerifier", null);
        setBooleanField(term139405, term139405.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term139405, term139405.getClass(), "paintingChild", null);
        setField(term139405, term139405.getClass(), "popupMenu", null);
        setField(term139405, term139405.getClass(), "revalidateRunnableScheduled", null);
        setField(term139405, term139405.getClass(), "focusInputMap", null);
        setField(term139405, term139405.getClass(), "ancestorInputMap", null);
        setField(term139405, term139405.getClass(), "windowInputMap", null);
        setField(term139405, term139405.getClass(), "actionMap", null);
        setField(term139405, term139405.getClass(), "aaHint", null);
        setField(term139405, term139405.getClass(), "lcdRenderingHint", null);
        setField(term139405, term139405.getClass(), "component", null);
        setField(term139405, term139405.getClass(), "layoutMgr", null);
        setField(term139405, term139405.getClass(), "dispatcher", null);
        setField(term139405, term139405.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term139405, term139405.getClass(), "focusCycleRoot", false);
        setBooleanField(term139405, term139405.getClass(), "focusTraversalPolicyProvider", false);
        setField(term139405, term139405.getClass(), "printingThreads", null);
        setBooleanField(term139405, term139405.getClass(), "printing", false);
        setField(term139405, term139405.getClass(), "containerListener", null);
        setIntField(term139405, term139405.getClass(), "listeningChildren", 0);
        setIntField(term139405, term139405.getClass(), "listeningBoundsChildren", 0);
        setIntField(term139405, term139405.getClass(), "descendantsCount", 0);
        setField(term139405, term139405.getClass(), "preserveBackgroundColor", null);
        setIntField(term139405, term139405.getClass(), "numOfHWComponents", 0);
        setIntField(term139405, term139405.getClass(), "numOfLWComponents", 0);
        setField(term139405, term139405.getClass(), "modalComp", null);
        setField(term139405, term139405.getClass(), "modalAppContext", null);
        setIntField(term139405, term139405.getClass(), "containerSerializedDataVersion", 0);
        setField(term139405, term139405.getClass(), "peer", null);
        setField(term139405, term139405.getClass(), "parent", null);
        setField(term139405, term139405.getClass(), "appContext", null);
        setIntField(term139405, term139405.getClass(), "x", 0);
        setIntField(term139405, term139405.getClass(), "y", 0);
        setIntField(term139405, term139405.getClass(), "width", 0);
        setIntField(term139405, term139405.getClass(), "height", 0);
        setField(term139405, term139405.getClass(), "foreground", null);
        setField(term139405, term139405.getClass(), "background", null);
        setField(term139405, term139405.getClass(), "font", null);
        setField(term139405, term139405.getClass(), "peerFont", null);
        setField(term139405, term139405.getClass(), "cursor", null);
        setField(term139405, term139405.getClass(), "locale", null);
        setField(term139405, term139405.getClass(), "graphicsConfig", null);
        setField(term139405, term139405.getClass(), "bufferStrategy", null);
        setBooleanField(term139405, term139405.getClass(), "ignoreRepaint", false);
        setBooleanField(term139405, term139405.getClass(), "visible", false);
        setBooleanField(term139405, term139405.getClass(), "enabled", false);
        setBooleanField(term139405, term139405.getClass(), "valid", false);
        setField(term139405, term139405.getClass(), "dropTarget", null);
        setField(term139405, term139405.getClass(), "popups", null);
        setField(term139405, term139405.getClass(), "name", null);
        setBooleanField(term139405, term139405.getClass(), "nameExplicitlySet", false);
        setBooleanField(term139405, term139405.getClass(), "focusable", false);
        setIntField(term139405, term139405.getClass(), "isFocusTraversableOverridden", 0);
        setField(term139405, term139405.getClass(), "focusTraversalKeys", null);
        setBooleanField(term139405, term139405.getClass(), "focusTraversalKeysEnabled", false);
        setField(term139405, term139405.getClass(), "acc", null);
        setField(term139405, term139405.getClass(), "minSize", null);
        setBooleanField(term139405, term139405.getClass(), "minSizeSet", false);
        setField(term139405, term139405.getClass(), "prefSize", null);
        setBooleanField(term139405, term139405.getClass(), "prefSizeSet", false);
        setField(term139405, term139405.getClass(), "maxSize", null);
        setBooleanField(term139405, term139405.getClass(), "maxSizeSet", false);
        setField(term139405, term139405.getClass(), "componentOrientation", null);
        setBooleanField(term139405, term139405.getClass(), "newEventsOnly", false);
        setField(term139405, term139405.getClass(), "componentListener", null);
        setField(term139405, term139405.getClass(), "focusListener", null);
        setField(term139405, term139405.getClass(), "hierarchyListener", null);
        setField(term139405, term139405.getClass(), "hierarchyBoundsListener", null);
        setField(term139405, term139405.getClass(), "keyListener", null);
        setField(term139405, term139405.getClass(), "mouseListener", null);
        setField(term139405, term139405.getClass(), "mouseMotionListener", null);
        setField(term139405, term139405.getClass(), "mouseWheelListener", null);
        setField(term139405, term139405.getClass(), "inputMethodListener", null);
        setLongField(term139405, term139405.getClass(), "eventMask", 0L);
        setField(term139405, term139405.getClass(), "changeSupport", null);
        setField(term139405, term139405.getClass(), "objectLock", null);
        setBooleanField(term139405, term139405.getClass(), "isPacked", false);
        setIntField(term139405, term139405.getClass(), "boundsOp", 0);
        setField(term139405, term139405.getClass(), "compoundShape", null);
        setField(term139405, term139405.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term139405, term139405.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term139405, term139405.getClass(), "backgroundEraseDisabled", false);
        setField(term139405, term139405.getClass(), "eventCache", null);
        setBooleanField(term139405, term139405.getClass(), "coalescingEnabled", false);
        setBooleanField(term139405, term139405.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term139405, term139405.getClass(), "componentSerializedDataVersion", 0);
        setField(term139405, term139405.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDrawWeaponRange", argTypes, term139405, args);
    }

};


