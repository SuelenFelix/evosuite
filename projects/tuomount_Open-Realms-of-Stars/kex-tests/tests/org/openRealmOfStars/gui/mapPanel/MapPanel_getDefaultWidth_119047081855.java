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

public class MapPanel_getDefaultWidth_119047081855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137245;

    public MapPanel_getDefaultWidth_119047081855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137245 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term137245, term137245.getClass(), "viewPointX", 0);
        setIntField(term137245, term137245.getClass(), "viewPointY", 0);
        setIntField(term137245, term137245.getClass(), "viewPointOffsetX", 0);
        setIntField(term137245, term137245.getClass(), "viewPointOffsetY", 0);
        setField(term137245, term137245.getClass(), "screen", null);
        setField(term137245, term137245.getClass(), "backgroundScreen", null);
        setIntField(term137245, term137245.getClass(), "flickerBlue", 0);
        setBooleanField(term137245, term137245.getClass(), "flickerGoUp", false);
        setIntField(term137245, term137245.getClass(), "lastDrawnCenterX", 0);
        setIntField(term137245, term137245.getClass(), "lastDrawnCenterY", 0);
        setField(term137245, term137245.getClass(), "route", null);
        setBooleanField(term137245, term137245.getClass(), "battle", false);
        setIntField(term137245, term137245.getClass(), "wormHoleAnimation", 0);
        setField(term137245, term137245.getClass(), "historyCultures", null);
        setBooleanField(term137245, term137245.getClass(), "historyCoordInitialized", false);
        setIntField(term137245, term137245.getClass(), "historyCoordX", 0);
        setIntField(term137245, term137245.getClass(), "historyCoordY", 0);
        setField(term137245, term137245.getClass(), "leftSpaceImage", null);
        setField(term137245, term137245.getClass(), "rightSpaceImage", null);
        setField(term137245, term137245.getClass(), "popup", null);
        setField(term137245, term137245.getClass(), "tileOverride", null);
        setField(term137245, term137245.getClass(), "redrawTile", null);
        setBooleanField(term137245, term137245.getClass(), "fullDraw", false);
        setIntField(term137245, term137245.getClass(), "cursorFocus", 0);
        setField(term137245, term137245.getClass(), "minimap", null);
        setBooleanField(term137245, term137245.getClass(), "showMiniMap", false);
        setBooleanField(term137245, term137245.getClass(), "highContrastGrid", false);
        setIntField(term137245, term137245.getClass(), "miniMapTopX", 0);
        setIntField(term137245, term137245.getClass(), "miniMapTopY", 0);
        setIntField(term137245, term137245.getClass(), "miniMapBotX", 0);
        setIntField(term137245, term137245.getClass(), "miniMapBotY", 0);
        setIntField(term137245, term137245.getClass(), "transparency", 0);
        setBooleanField(term137245, term137245.getClass(), "improvedParallax", false);
        setBooleanField(term137245, term137245.getClass(), "updateAnimation", false);
        setIntField(term137245, term137245.getClass(), "updateAnimationCount", 0);
        setBooleanField(term137245, term137245.getClass(), "drawWeaponRange", false);
        setField(term137245, term137245.getClass(), "panelType", null);
        setIntField(term137245, term137245.getClass(), "lastCursorPosX", 0);
        setIntField(term137245, term137245.getClass(), "lastCursorPosY", 0);
        setIntField(term137245, term137245.getClass(), "lastZoomLevel", 0);
        setBooleanField(term137245, term137245.getClass(), "redoViewPoints", false);
        setBooleanField(term137245, term137245.getClass(), "isAlignmentXSet", false);
        setFloatField(term137245, term137245.getClass(), "alignmentX", 0.0F);
        setBooleanField(term137245, term137245.getClass(), "isAlignmentYSet", false);
        setFloatField(term137245, term137245.getClass(), "alignmentY", 0.0F);
        setField(term137245, term137245.getClass(), "ui", null);
        setField(term137245, term137245.getClass(), "listenerList", null);
        setField(term137245, term137245.getClass(), "clientProperties", null);
        setField(term137245, term137245.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term137245, term137245.getClass(), "autoscrolls", false);
        setField(term137245, term137245.getClass(), "border", null);
        setIntField(term137245, term137245.getClass(), "flags", 0);
        setField(term137245, term137245.getClass(), "inputVerifier", null);
        setBooleanField(term137245, term137245.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term137245, term137245.getClass(), "paintingChild", null);
        setField(term137245, term137245.getClass(), "popupMenu", null);
        setField(term137245, term137245.getClass(), "revalidateRunnableScheduled", null);
        setField(term137245, term137245.getClass(), "focusInputMap", null);
        setField(term137245, term137245.getClass(), "ancestorInputMap", null);
        setField(term137245, term137245.getClass(), "windowInputMap", null);
        setField(term137245, term137245.getClass(), "actionMap", null);
        setField(term137245, term137245.getClass(), "aaHint", null);
        setField(term137245, term137245.getClass(), "lcdRenderingHint", null);
        setField(term137245, term137245.getClass(), "component", null);
        setField(term137245, term137245.getClass(), "layoutMgr", null);
        setField(term137245, term137245.getClass(), "dispatcher", null);
        setField(term137245, term137245.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term137245, term137245.getClass(), "focusCycleRoot", false);
        setBooleanField(term137245, term137245.getClass(), "focusTraversalPolicyProvider", false);
        setField(term137245, term137245.getClass(), "printingThreads", null);
        setBooleanField(term137245, term137245.getClass(), "printing", false);
        setField(term137245, term137245.getClass(), "containerListener", null);
        setIntField(term137245, term137245.getClass(), "listeningChildren", 0);
        setIntField(term137245, term137245.getClass(), "listeningBoundsChildren", 0);
        setIntField(term137245, term137245.getClass(), "descendantsCount", 0);
        setField(term137245, term137245.getClass(), "preserveBackgroundColor", null);
        setIntField(term137245, term137245.getClass(), "numOfHWComponents", 0);
        setIntField(term137245, term137245.getClass(), "numOfLWComponents", 0);
        setField(term137245, term137245.getClass(), "modalComp", null);
        setField(term137245, term137245.getClass(), "modalAppContext", null);
        setIntField(term137245, term137245.getClass(), "containerSerializedDataVersion", 0);
        setField(term137245, term137245.getClass(), "peer", null);
        setField(term137245, term137245.getClass(), "parent", null);
        setField(term137245, term137245.getClass(), "appContext", null);
        setIntField(term137245, term137245.getClass(), "x", 0);
        setIntField(term137245, term137245.getClass(), "y", 0);
        setIntField(term137245, term137245.getClass(), "width", 0);
        setIntField(term137245, term137245.getClass(), "height", 0);
        setField(term137245, term137245.getClass(), "foreground", null);
        setField(term137245, term137245.getClass(), "background", null);
        setField(term137245, term137245.getClass(), "font", null);
        setField(term137245, term137245.getClass(), "peerFont", null);
        setField(term137245, term137245.getClass(), "cursor", null);
        setField(term137245, term137245.getClass(), "locale", null);
        setField(term137245, term137245.getClass(), "graphicsConfig", null);
        setField(term137245, term137245.getClass(), "bufferStrategy", null);
        setBooleanField(term137245, term137245.getClass(), "ignoreRepaint", false);
        setBooleanField(term137245, term137245.getClass(), "visible", false);
        setBooleanField(term137245, term137245.getClass(), "enabled", false);
        setBooleanField(term137245, term137245.getClass(), "valid", false);
        setField(term137245, term137245.getClass(), "dropTarget", null);
        setField(term137245, term137245.getClass(), "popups", null);
        setField(term137245, term137245.getClass(), "name", null);
        setBooleanField(term137245, term137245.getClass(), "nameExplicitlySet", false);
        setBooleanField(term137245, term137245.getClass(), "focusable", false);
        setIntField(term137245, term137245.getClass(), "isFocusTraversableOverridden", 0);
        setField(term137245, term137245.getClass(), "focusTraversalKeys", null);
        setBooleanField(term137245, term137245.getClass(), "focusTraversalKeysEnabled", false);
        setField(term137245, term137245.getClass(), "acc", null);
        setField(term137245, term137245.getClass(), "minSize", null);
        setBooleanField(term137245, term137245.getClass(), "minSizeSet", false);
        setField(term137245, term137245.getClass(), "prefSize", null);
        setBooleanField(term137245, term137245.getClass(), "prefSizeSet", false);
        setField(term137245, term137245.getClass(), "maxSize", null);
        setBooleanField(term137245, term137245.getClass(), "maxSizeSet", false);
        setField(term137245, term137245.getClass(), "componentOrientation", null);
        setBooleanField(term137245, term137245.getClass(), "newEventsOnly", false);
        setField(term137245, term137245.getClass(), "componentListener", null);
        setField(term137245, term137245.getClass(), "focusListener", null);
        setField(term137245, term137245.getClass(), "hierarchyListener", null);
        setField(term137245, term137245.getClass(), "hierarchyBoundsListener", null);
        setField(term137245, term137245.getClass(), "keyListener", null);
        setField(term137245, term137245.getClass(), "mouseListener", null);
        setField(term137245, term137245.getClass(), "mouseMotionListener", null);
        setField(term137245, term137245.getClass(), "mouseWheelListener", null);
        setField(term137245, term137245.getClass(), "inputMethodListener", null);
        setLongField(term137245, term137245.getClass(), "eventMask", 0L);
        setField(term137245, term137245.getClass(), "changeSupport", null);
        setField(term137245, term137245.getClass(), "objectLock", null);
        setBooleanField(term137245, term137245.getClass(), "isPacked", false);
        setIntField(term137245, term137245.getClass(), "boundsOp", 0);
        setField(term137245, term137245.getClass(), "compoundShape", null);
        setField(term137245, term137245.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term137245, term137245.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term137245, term137245.getClass(), "backgroundEraseDisabled", false);
        setField(term137245, term137245.getClass(), "eventCache", null);
        setBooleanField(term137245, term137245.getClass(), "coalescingEnabled", false);
        setBooleanField(term137245, term137245.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term137245, term137245.getClass(), "componentSerializedDataVersion", 0);
        setField(term137245, term137245.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultWidth", argTypes, term137245, args);
    }

};


