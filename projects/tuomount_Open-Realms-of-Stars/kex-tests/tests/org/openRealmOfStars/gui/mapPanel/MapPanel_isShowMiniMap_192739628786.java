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

public class MapPanel_isShowMiniMap_192739628786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139261;

    public MapPanel_isShowMiniMap_192739628786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139261 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term139261, term139261.getClass(), "viewPointX", 0);
        setIntField(term139261, term139261.getClass(), "viewPointY", 0);
        setIntField(term139261, term139261.getClass(), "viewPointOffsetX", 0);
        setIntField(term139261, term139261.getClass(), "viewPointOffsetY", 0);
        setField(term139261, term139261.getClass(), "screen", null);
        setField(term139261, term139261.getClass(), "backgroundScreen", null);
        setIntField(term139261, term139261.getClass(), "flickerBlue", 0);
        setBooleanField(term139261, term139261.getClass(), "flickerGoUp", false);
        setIntField(term139261, term139261.getClass(), "lastDrawnCenterX", 0);
        setIntField(term139261, term139261.getClass(), "lastDrawnCenterY", 0);
        setField(term139261, term139261.getClass(), "route", null);
        setBooleanField(term139261, term139261.getClass(), "battle", false);
        setIntField(term139261, term139261.getClass(), "wormHoleAnimation", 0);
        setField(term139261, term139261.getClass(), "historyCultures", null);
        setBooleanField(term139261, term139261.getClass(), "historyCoordInitialized", false);
        setIntField(term139261, term139261.getClass(), "historyCoordX", 0);
        setIntField(term139261, term139261.getClass(), "historyCoordY", 0);
        setField(term139261, term139261.getClass(), "leftSpaceImage", null);
        setField(term139261, term139261.getClass(), "rightSpaceImage", null);
        setField(term139261, term139261.getClass(), "popup", null);
        setField(term139261, term139261.getClass(), "tileOverride", null);
        setField(term139261, term139261.getClass(), "redrawTile", null);
        setBooleanField(term139261, term139261.getClass(), "fullDraw", false);
        setIntField(term139261, term139261.getClass(), "cursorFocus", 0);
        setField(term139261, term139261.getClass(), "minimap", null);
        setBooleanField(term139261, term139261.getClass(), "showMiniMap", false);
        setBooleanField(term139261, term139261.getClass(), "highContrastGrid", false);
        setIntField(term139261, term139261.getClass(), "miniMapTopX", 0);
        setIntField(term139261, term139261.getClass(), "miniMapTopY", 0);
        setIntField(term139261, term139261.getClass(), "miniMapBotX", 0);
        setIntField(term139261, term139261.getClass(), "miniMapBotY", 0);
        setIntField(term139261, term139261.getClass(), "transparency", 0);
        setBooleanField(term139261, term139261.getClass(), "improvedParallax", false);
        setBooleanField(term139261, term139261.getClass(), "updateAnimation", false);
        setIntField(term139261, term139261.getClass(), "updateAnimationCount", 0);
        setBooleanField(term139261, term139261.getClass(), "drawWeaponRange", false);
        setField(term139261, term139261.getClass(), "panelType", null);
        setIntField(term139261, term139261.getClass(), "lastCursorPosX", 0);
        setIntField(term139261, term139261.getClass(), "lastCursorPosY", 0);
        setIntField(term139261, term139261.getClass(), "lastZoomLevel", 0);
        setBooleanField(term139261, term139261.getClass(), "redoViewPoints", false);
        setBooleanField(term139261, term139261.getClass(), "isAlignmentXSet", false);
        setFloatField(term139261, term139261.getClass(), "alignmentX", 0.0F);
        setBooleanField(term139261, term139261.getClass(), "isAlignmentYSet", false);
        setFloatField(term139261, term139261.getClass(), "alignmentY", 0.0F);
        setField(term139261, term139261.getClass(), "ui", null);
        setField(term139261, term139261.getClass(), "listenerList", null);
        setField(term139261, term139261.getClass(), "clientProperties", null);
        setField(term139261, term139261.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term139261, term139261.getClass(), "autoscrolls", false);
        setField(term139261, term139261.getClass(), "border", null);
        setIntField(term139261, term139261.getClass(), "flags", 0);
        setField(term139261, term139261.getClass(), "inputVerifier", null);
        setBooleanField(term139261, term139261.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term139261, term139261.getClass(), "paintingChild", null);
        setField(term139261, term139261.getClass(), "popupMenu", null);
        setField(term139261, term139261.getClass(), "revalidateRunnableScheduled", null);
        setField(term139261, term139261.getClass(), "focusInputMap", null);
        setField(term139261, term139261.getClass(), "ancestorInputMap", null);
        setField(term139261, term139261.getClass(), "windowInputMap", null);
        setField(term139261, term139261.getClass(), "actionMap", null);
        setField(term139261, term139261.getClass(), "aaHint", null);
        setField(term139261, term139261.getClass(), "lcdRenderingHint", null);
        setField(term139261, term139261.getClass(), "component", null);
        setField(term139261, term139261.getClass(), "layoutMgr", null);
        setField(term139261, term139261.getClass(), "dispatcher", null);
        setField(term139261, term139261.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term139261, term139261.getClass(), "focusCycleRoot", false);
        setBooleanField(term139261, term139261.getClass(), "focusTraversalPolicyProvider", false);
        setField(term139261, term139261.getClass(), "printingThreads", null);
        setBooleanField(term139261, term139261.getClass(), "printing", false);
        setField(term139261, term139261.getClass(), "containerListener", null);
        setIntField(term139261, term139261.getClass(), "listeningChildren", 0);
        setIntField(term139261, term139261.getClass(), "listeningBoundsChildren", 0);
        setIntField(term139261, term139261.getClass(), "descendantsCount", 0);
        setField(term139261, term139261.getClass(), "preserveBackgroundColor", null);
        setIntField(term139261, term139261.getClass(), "numOfHWComponents", 0);
        setIntField(term139261, term139261.getClass(), "numOfLWComponents", 0);
        setField(term139261, term139261.getClass(), "modalComp", null);
        setField(term139261, term139261.getClass(), "modalAppContext", null);
        setIntField(term139261, term139261.getClass(), "containerSerializedDataVersion", 0);
        setField(term139261, term139261.getClass(), "peer", null);
        setField(term139261, term139261.getClass(), "parent", null);
        setField(term139261, term139261.getClass(), "appContext", null);
        setIntField(term139261, term139261.getClass(), "x", 0);
        setIntField(term139261, term139261.getClass(), "y", 0);
        setIntField(term139261, term139261.getClass(), "width", 0);
        setIntField(term139261, term139261.getClass(), "height", 0);
        setField(term139261, term139261.getClass(), "foreground", null);
        setField(term139261, term139261.getClass(), "background", null);
        setField(term139261, term139261.getClass(), "font", null);
        setField(term139261, term139261.getClass(), "peerFont", null);
        setField(term139261, term139261.getClass(), "cursor", null);
        setField(term139261, term139261.getClass(), "locale", null);
        setField(term139261, term139261.getClass(), "graphicsConfig", null);
        setField(term139261, term139261.getClass(), "bufferStrategy", null);
        setBooleanField(term139261, term139261.getClass(), "ignoreRepaint", false);
        setBooleanField(term139261, term139261.getClass(), "visible", false);
        setBooleanField(term139261, term139261.getClass(), "enabled", false);
        setBooleanField(term139261, term139261.getClass(), "valid", false);
        setField(term139261, term139261.getClass(), "dropTarget", null);
        setField(term139261, term139261.getClass(), "popups", null);
        setField(term139261, term139261.getClass(), "name", null);
        setBooleanField(term139261, term139261.getClass(), "nameExplicitlySet", false);
        setBooleanField(term139261, term139261.getClass(), "focusable", false);
        setIntField(term139261, term139261.getClass(), "isFocusTraversableOverridden", 0);
        setField(term139261, term139261.getClass(), "focusTraversalKeys", null);
        setBooleanField(term139261, term139261.getClass(), "focusTraversalKeysEnabled", false);
        setField(term139261, term139261.getClass(), "acc", null);
        setField(term139261, term139261.getClass(), "minSize", null);
        setBooleanField(term139261, term139261.getClass(), "minSizeSet", false);
        setField(term139261, term139261.getClass(), "prefSize", null);
        setBooleanField(term139261, term139261.getClass(), "prefSizeSet", false);
        setField(term139261, term139261.getClass(), "maxSize", null);
        setBooleanField(term139261, term139261.getClass(), "maxSizeSet", false);
        setField(term139261, term139261.getClass(), "componentOrientation", null);
        setBooleanField(term139261, term139261.getClass(), "newEventsOnly", false);
        setField(term139261, term139261.getClass(), "componentListener", null);
        setField(term139261, term139261.getClass(), "focusListener", null);
        setField(term139261, term139261.getClass(), "hierarchyListener", null);
        setField(term139261, term139261.getClass(), "hierarchyBoundsListener", null);
        setField(term139261, term139261.getClass(), "keyListener", null);
        setField(term139261, term139261.getClass(), "mouseListener", null);
        setField(term139261, term139261.getClass(), "mouseMotionListener", null);
        setField(term139261, term139261.getClass(), "mouseWheelListener", null);
        setField(term139261, term139261.getClass(), "inputMethodListener", null);
        setLongField(term139261, term139261.getClass(), "eventMask", 0L);
        setField(term139261, term139261.getClass(), "changeSupport", null);
        setField(term139261, term139261.getClass(), "objectLock", null);
        setBooleanField(term139261, term139261.getClass(), "isPacked", false);
        setIntField(term139261, term139261.getClass(), "boundsOp", 0);
        setField(term139261, term139261.getClass(), "compoundShape", null);
        setField(term139261, term139261.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term139261, term139261.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term139261, term139261.getClass(), "backgroundEraseDisabled", false);
        setField(term139261, term139261.getClass(), "eventCache", null);
        setBooleanField(term139261, term139261.getClass(), "coalescingEnabled", false);
        setBooleanField(term139261, term139261.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term139261, term139261.getClass(), "componentSerializedDataVersion", 0);
        setField(term139261, term139261.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowMiniMap", argTypes, term139261, args);
    }

};


