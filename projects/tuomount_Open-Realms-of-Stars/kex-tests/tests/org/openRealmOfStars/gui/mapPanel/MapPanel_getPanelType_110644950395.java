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

public class MapPanel_getPanelType_110644950395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139904;

    public MapPanel_getPanelType_110644950395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139904 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term139904, term139904.getClass(), "viewPointX", 0);
        setIntField(term139904, term139904.getClass(), "viewPointY", 0);
        setIntField(term139904, term139904.getClass(), "viewPointOffsetX", 0);
        setIntField(term139904, term139904.getClass(), "viewPointOffsetY", 0);
        setField(term139904, term139904.getClass(), "screen", null);
        setField(term139904, term139904.getClass(), "backgroundScreen", null);
        setIntField(term139904, term139904.getClass(), "flickerBlue", 0);
        setBooleanField(term139904, term139904.getClass(), "flickerGoUp", false);
        setIntField(term139904, term139904.getClass(), "lastDrawnCenterX", 0);
        setIntField(term139904, term139904.getClass(), "lastDrawnCenterY", 0);
        setField(term139904, term139904.getClass(), "route", null);
        setBooleanField(term139904, term139904.getClass(), "battle", false);
        setIntField(term139904, term139904.getClass(), "wormHoleAnimation", 0);
        setField(term139904, term139904.getClass(), "historyCultures", null);
        setBooleanField(term139904, term139904.getClass(), "historyCoordInitialized", false);
        setIntField(term139904, term139904.getClass(), "historyCoordX", 0);
        setIntField(term139904, term139904.getClass(), "historyCoordY", 0);
        setField(term139904, term139904.getClass(), "leftSpaceImage", null);
        setField(term139904, term139904.getClass(), "rightSpaceImage", null);
        setField(term139904, term139904.getClass(), "popup", null);
        setField(term139904, term139904.getClass(), "tileOverride", null);
        setField(term139904, term139904.getClass(), "redrawTile", null);
        setBooleanField(term139904, term139904.getClass(), "fullDraw", false);
        setIntField(term139904, term139904.getClass(), "cursorFocus", 0);
        setField(term139904, term139904.getClass(), "minimap", null);
        setBooleanField(term139904, term139904.getClass(), "showMiniMap", false);
        setBooleanField(term139904, term139904.getClass(), "highContrastGrid", false);
        setIntField(term139904, term139904.getClass(), "miniMapTopX", 0);
        setIntField(term139904, term139904.getClass(), "miniMapTopY", 0);
        setIntField(term139904, term139904.getClass(), "miniMapBotX", 0);
        setIntField(term139904, term139904.getClass(), "miniMapBotY", 0);
        setIntField(term139904, term139904.getClass(), "transparency", 0);
        setBooleanField(term139904, term139904.getClass(), "improvedParallax", false);
        setBooleanField(term139904, term139904.getClass(), "updateAnimation", false);
        setIntField(term139904, term139904.getClass(), "updateAnimationCount", 0);
        setBooleanField(term139904, term139904.getClass(), "drawWeaponRange", false);
        setField(term139904, term139904.getClass(), "panelType", null);
        setIntField(term139904, term139904.getClass(), "lastCursorPosX", 0);
        setIntField(term139904, term139904.getClass(), "lastCursorPosY", 0);
        setIntField(term139904, term139904.getClass(), "lastZoomLevel", 0);
        setBooleanField(term139904, term139904.getClass(), "redoViewPoints", false);
        setBooleanField(term139904, term139904.getClass(), "isAlignmentXSet", false);
        setFloatField(term139904, term139904.getClass(), "alignmentX", 0.0F);
        setBooleanField(term139904, term139904.getClass(), "isAlignmentYSet", false);
        setFloatField(term139904, term139904.getClass(), "alignmentY", 0.0F);
        setField(term139904, term139904.getClass(), "ui", null);
        setField(term139904, term139904.getClass(), "listenerList", null);
        setField(term139904, term139904.getClass(), "clientProperties", null);
        setField(term139904, term139904.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term139904, term139904.getClass(), "autoscrolls", false);
        setField(term139904, term139904.getClass(), "border", null);
        setIntField(term139904, term139904.getClass(), "flags", 0);
        setField(term139904, term139904.getClass(), "inputVerifier", null);
        setBooleanField(term139904, term139904.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term139904, term139904.getClass(), "paintingChild", null);
        setField(term139904, term139904.getClass(), "popupMenu", null);
        setField(term139904, term139904.getClass(), "revalidateRunnableScheduled", null);
        setField(term139904, term139904.getClass(), "focusInputMap", null);
        setField(term139904, term139904.getClass(), "ancestorInputMap", null);
        setField(term139904, term139904.getClass(), "windowInputMap", null);
        setField(term139904, term139904.getClass(), "actionMap", null);
        setField(term139904, term139904.getClass(), "aaHint", null);
        setField(term139904, term139904.getClass(), "lcdRenderingHint", null);
        setField(term139904, term139904.getClass(), "component", null);
        setField(term139904, term139904.getClass(), "layoutMgr", null);
        setField(term139904, term139904.getClass(), "dispatcher", null);
        setField(term139904, term139904.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term139904, term139904.getClass(), "focusCycleRoot", false);
        setBooleanField(term139904, term139904.getClass(), "focusTraversalPolicyProvider", false);
        setField(term139904, term139904.getClass(), "printingThreads", null);
        setBooleanField(term139904, term139904.getClass(), "printing", false);
        setField(term139904, term139904.getClass(), "containerListener", null);
        setIntField(term139904, term139904.getClass(), "listeningChildren", 0);
        setIntField(term139904, term139904.getClass(), "listeningBoundsChildren", 0);
        setIntField(term139904, term139904.getClass(), "descendantsCount", 0);
        setField(term139904, term139904.getClass(), "preserveBackgroundColor", null);
        setIntField(term139904, term139904.getClass(), "numOfHWComponents", 0);
        setIntField(term139904, term139904.getClass(), "numOfLWComponents", 0);
        setField(term139904, term139904.getClass(), "modalComp", null);
        setField(term139904, term139904.getClass(), "modalAppContext", null);
        setIntField(term139904, term139904.getClass(), "containerSerializedDataVersion", 0);
        setField(term139904, term139904.getClass(), "peer", null);
        setField(term139904, term139904.getClass(), "parent", null);
        setField(term139904, term139904.getClass(), "appContext", null);
        setIntField(term139904, term139904.getClass(), "x", 0);
        setIntField(term139904, term139904.getClass(), "y", 0);
        setIntField(term139904, term139904.getClass(), "width", 0);
        setIntField(term139904, term139904.getClass(), "height", 0);
        setField(term139904, term139904.getClass(), "foreground", null);
        setField(term139904, term139904.getClass(), "background", null);
        setField(term139904, term139904.getClass(), "font", null);
        setField(term139904, term139904.getClass(), "peerFont", null);
        setField(term139904, term139904.getClass(), "cursor", null);
        setField(term139904, term139904.getClass(), "locale", null);
        setField(term139904, term139904.getClass(), "graphicsConfig", null);
        setField(term139904, term139904.getClass(), "bufferStrategy", null);
        setBooleanField(term139904, term139904.getClass(), "ignoreRepaint", false);
        setBooleanField(term139904, term139904.getClass(), "visible", false);
        setBooleanField(term139904, term139904.getClass(), "enabled", false);
        setBooleanField(term139904, term139904.getClass(), "valid", false);
        setField(term139904, term139904.getClass(), "dropTarget", null);
        setField(term139904, term139904.getClass(), "popups", null);
        setField(term139904, term139904.getClass(), "name", null);
        setBooleanField(term139904, term139904.getClass(), "nameExplicitlySet", false);
        setBooleanField(term139904, term139904.getClass(), "focusable", false);
        setIntField(term139904, term139904.getClass(), "isFocusTraversableOverridden", 0);
        setField(term139904, term139904.getClass(), "focusTraversalKeys", null);
        setBooleanField(term139904, term139904.getClass(), "focusTraversalKeysEnabled", false);
        setField(term139904, term139904.getClass(), "acc", null);
        setField(term139904, term139904.getClass(), "minSize", null);
        setBooleanField(term139904, term139904.getClass(), "minSizeSet", false);
        setField(term139904, term139904.getClass(), "prefSize", null);
        setBooleanField(term139904, term139904.getClass(), "prefSizeSet", false);
        setField(term139904, term139904.getClass(), "maxSize", null);
        setBooleanField(term139904, term139904.getClass(), "maxSizeSet", false);
        setField(term139904, term139904.getClass(), "componentOrientation", null);
        setBooleanField(term139904, term139904.getClass(), "newEventsOnly", false);
        setField(term139904, term139904.getClass(), "componentListener", null);
        setField(term139904, term139904.getClass(), "focusListener", null);
        setField(term139904, term139904.getClass(), "hierarchyListener", null);
        setField(term139904, term139904.getClass(), "hierarchyBoundsListener", null);
        setField(term139904, term139904.getClass(), "keyListener", null);
        setField(term139904, term139904.getClass(), "mouseListener", null);
        setField(term139904, term139904.getClass(), "mouseMotionListener", null);
        setField(term139904, term139904.getClass(), "mouseWheelListener", null);
        setField(term139904, term139904.getClass(), "inputMethodListener", null);
        setLongField(term139904, term139904.getClass(), "eventMask", 0L);
        setField(term139904, term139904.getClass(), "changeSupport", null);
        setField(term139904, term139904.getClass(), "objectLock", null);
        setBooleanField(term139904, term139904.getClass(), "isPacked", false);
        setIntField(term139904, term139904.getClass(), "boundsOp", 0);
        setField(term139904, term139904.getClass(), "compoundShape", null);
        setField(term139904, term139904.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term139904, term139904.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term139904, term139904.getClass(), "backgroundEraseDisabled", false);
        setField(term139904, term139904.getClass(), "eventCache", null);
        setBooleanField(term139904, term139904.getClass(), "coalescingEnabled", false);
        setBooleanField(term139904, term139904.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term139904, term139904.getClass(), "componentSerializedDataVersion", 0);
        setField(term139904, term139904.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPanelType", argTypes, term139904, args);
    }

};


