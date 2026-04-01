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

public class MapPanel_getPopup_105262458183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139046;

    public MapPanel_getPopup_105262458183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139046 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term139046, term139046.getClass(), "viewPointX", 0);
        setIntField(term139046, term139046.getClass(), "viewPointY", 0);
        setIntField(term139046, term139046.getClass(), "viewPointOffsetX", 0);
        setIntField(term139046, term139046.getClass(), "viewPointOffsetY", 0);
        setField(term139046, term139046.getClass(), "screen", null);
        setField(term139046, term139046.getClass(), "backgroundScreen", null);
        setIntField(term139046, term139046.getClass(), "flickerBlue", 0);
        setBooleanField(term139046, term139046.getClass(), "flickerGoUp", false);
        setIntField(term139046, term139046.getClass(), "lastDrawnCenterX", 0);
        setIntField(term139046, term139046.getClass(), "lastDrawnCenterY", 0);
        setField(term139046, term139046.getClass(), "route", null);
        setBooleanField(term139046, term139046.getClass(), "battle", false);
        setIntField(term139046, term139046.getClass(), "wormHoleAnimation", 0);
        setField(term139046, term139046.getClass(), "historyCultures", null);
        setBooleanField(term139046, term139046.getClass(), "historyCoordInitialized", false);
        setIntField(term139046, term139046.getClass(), "historyCoordX", 0);
        setIntField(term139046, term139046.getClass(), "historyCoordY", 0);
        setField(term139046, term139046.getClass(), "leftSpaceImage", null);
        setField(term139046, term139046.getClass(), "rightSpaceImage", null);
        setField(term139046, term139046.getClass(), "popup", null);
        setField(term139046, term139046.getClass(), "tileOverride", null);
        setField(term139046, term139046.getClass(), "redrawTile", null);
        setBooleanField(term139046, term139046.getClass(), "fullDraw", false);
        setIntField(term139046, term139046.getClass(), "cursorFocus", 0);
        setField(term139046, term139046.getClass(), "minimap", null);
        setBooleanField(term139046, term139046.getClass(), "showMiniMap", false);
        setBooleanField(term139046, term139046.getClass(), "highContrastGrid", false);
        setIntField(term139046, term139046.getClass(), "miniMapTopX", 0);
        setIntField(term139046, term139046.getClass(), "miniMapTopY", 0);
        setIntField(term139046, term139046.getClass(), "miniMapBotX", 0);
        setIntField(term139046, term139046.getClass(), "miniMapBotY", 0);
        setIntField(term139046, term139046.getClass(), "transparency", 0);
        setBooleanField(term139046, term139046.getClass(), "improvedParallax", false);
        setBooleanField(term139046, term139046.getClass(), "updateAnimation", false);
        setIntField(term139046, term139046.getClass(), "updateAnimationCount", 0);
        setBooleanField(term139046, term139046.getClass(), "drawWeaponRange", false);
        setField(term139046, term139046.getClass(), "panelType", null);
        setIntField(term139046, term139046.getClass(), "lastCursorPosX", 0);
        setIntField(term139046, term139046.getClass(), "lastCursorPosY", 0);
        setIntField(term139046, term139046.getClass(), "lastZoomLevel", 0);
        setBooleanField(term139046, term139046.getClass(), "redoViewPoints", false);
        setBooleanField(term139046, term139046.getClass(), "isAlignmentXSet", false);
        setFloatField(term139046, term139046.getClass(), "alignmentX", 0.0F);
        setBooleanField(term139046, term139046.getClass(), "isAlignmentYSet", false);
        setFloatField(term139046, term139046.getClass(), "alignmentY", 0.0F);
        setField(term139046, term139046.getClass(), "ui", null);
        setField(term139046, term139046.getClass(), "listenerList", null);
        setField(term139046, term139046.getClass(), "clientProperties", null);
        setField(term139046, term139046.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term139046, term139046.getClass(), "autoscrolls", false);
        setField(term139046, term139046.getClass(), "border", null);
        setIntField(term139046, term139046.getClass(), "flags", 0);
        setField(term139046, term139046.getClass(), "inputVerifier", null);
        setBooleanField(term139046, term139046.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term139046, term139046.getClass(), "paintingChild", null);
        setField(term139046, term139046.getClass(), "popupMenu", null);
        setField(term139046, term139046.getClass(), "revalidateRunnableScheduled", null);
        setField(term139046, term139046.getClass(), "focusInputMap", null);
        setField(term139046, term139046.getClass(), "ancestorInputMap", null);
        setField(term139046, term139046.getClass(), "windowInputMap", null);
        setField(term139046, term139046.getClass(), "actionMap", null);
        setField(term139046, term139046.getClass(), "aaHint", null);
        setField(term139046, term139046.getClass(), "lcdRenderingHint", null);
        setField(term139046, term139046.getClass(), "component", null);
        setField(term139046, term139046.getClass(), "layoutMgr", null);
        setField(term139046, term139046.getClass(), "dispatcher", null);
        setField(term139046, term139046.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term139046, term139046.getClass(), "focusCycleRoot", false);
        setBooleanField(term139046, term139046.getClass(), "focusTraversalPolicyProvider", false);
        setField(term139046, term139046.getClass(), "printingThreads", null);
        setBooleanField(term139046, term139046.getClass(), "printing", false);
        setField(term139046, term139046.getClass(), "containerListener", null);
        setIntField(term139046, term139046.getClass(), "listeningChildren", 0);
        setIntField(term139046, term139046.getClass(), "listeningBoundsChildren", 0);
        setIntField(term139046, term139046.getClass(), "descendantsCount", 0);
        setField(term139046, term139046.getClass(), "preserveBackgroundColor", null);
        setIntField(term139046, term139046.getClass(), "numOfHWComponents", 0);
        setIntField(term139046, term139046.getClass(), "numOfLWComponents", 0);
        setField(term139046, term139046.getClass(), "modalComp", null);
        setField(term139046, term139046.getClass(), "modalAppContext", null);
        setIntField(term139046, term139046.getClass(), "containerSerializedDataVersion", 0);
        setField(term139046, term139046.getClass(), "peer", null);
        setField(term139046, term139046.getClass(), "parent", null);
        setField(term139046, term139046.getClass(), "appContext", null);
        setIntField(term139046, term139046.getClass(), "x", 0);
        setIntField(term139046, term139046.getClass(), "y", 0);
        setIntField(term139046, term139046.getClass(), "width", 0);
        setIntField(term139046, term139046.getClass(), "height", 0);
        setField(term139046, term139046.getClass(), "foreground", null);
        setField(term139046, term139046.getClass(), "background", null);
        setField(term139046, term139046.getClass(), "font", null);
        setField(term139046, term139046.getClass(), "peerFont", null);
        setField(term139046, term139046.getClass(), "cursor", null);
        setField(term139046, term139046.getClass(), "locale", null);
        setField(term139046, term139046.getClass(), "graphicsConfig", null);
        setField(term139046, term139046.getClass(), "bufferStrategy", null);
        setBooleanField(term139046, term139046.getClass(), "ignoreRepaint", false);
        setBooleanField(term139046, term139046.getClass(), "visible", false);
        setBooleanField(term139046, term139046.getClass(), "enabled", false);
        setBooleanField(term139046, term139046.getClass(), "valid", false);
        setField(term139046, term139046.getClass(), "dropTarget", null);
        setField(term139046, term139046.getClass(), "popups", null);
        setField(term139046, term139046.getClass(), "name", null);
        setBooleanField(term139046, term139046.getClass(), "nameExplicitlySet", false);
        setBooleanField(term139046, term139046.getClass(), "focusable", false);
        setIntField(term139046, term139046.getClass(), "isFocusTraversableOverridden", 0);
        setField(term139046, term139046.getClass(), "focusTraversalKeys", null);
        setBooleanField(term139046, term139046.getClass(), "focusTraversalKeysEnabled", false);
        setField(term139046, term139046.getClass(), "acc", null);
        setField(term139046, term139046.getClass(), "minSize", null);
        setBooleanField(term139046, term139046.getClass(), "minSizeSet", false);
        setField(term139046, term139046.getClass(), "prefSize", null);
        setBooleanField(term139046, term139046.getClass(), "prefSizeSet", false);
        setField(term139046, term139046.getClass(), "maxSize", null);
        setBooleanField(term139046, term139046.getClass(), "maxSizeSet", false);
        setField(term139046, term139046.getClass(), "componentOrientation", null);
        setBooleanField(term139046, term139046.getClass(), "newEventsOnly", false);
        setField(term139046, term139046.getClass(), "componentListener", null);
        setField(term139046, term139046.getClass(), "focusListener", null);
        setField(term139046, term139046.getClass(), "hierarchyListener", null);
        setField(term139046, term139046.getClass(), "hierarchyBoundsListener", null);
        setField(term139046, term139046.getClass(), "keyListener", null);
        setField(term139046, term139046.getClass(), "mouseListener", null);
        setField(term139046, term139046.getClass(), "mouseMotionListener", null);
        setField(term139046, term139046.getClass(), "mouseWheelListener", null);
        setField(term139046, term139046.getClass(), "inputMethodListener", null);
        setLongField(term139046, term139046.getClass(), "eventMask", 0L);
        setField(term139046, term139046.getClass(), "changeSupport", null);
        setField(term139046, term139046.getClass(), "objectLock", null);
        setBooleanField(term139046, term139046.getClass(), "isPacked", false);
        setIntField(term139046, term139046.getClass(), "boundsOp", 0);
        setField(term139046, term139046.getClass(), "compoundShape", null);
        setField(term139046, term139046.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term139046, term139046.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term139046, term139046.getClass(), "backgroundEraseDisabled", false);
        setField(term139046, term139046.getClass(), "eventCache", null);
        setBooleanField(term139046, term139046.getClass(), "coalescingEnabled", false);
        setBooleanField(term139046, term139046.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term139046, term139046.getClass(), "componentSerializedDataVersion", 0);
        setField(term139046, term139046.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPopup", argTypes, term139046, args);
    }

};


