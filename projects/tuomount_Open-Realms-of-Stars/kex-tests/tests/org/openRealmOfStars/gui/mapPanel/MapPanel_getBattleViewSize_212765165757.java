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

public class MapPanel_getBattleViewSize_212765165757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137387;

    public MapPanel_getBattleViewSize_212765165757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137387 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term137387, term137387.getClass(), "viewPointX", 0);
        setIntField(term137387, term137387.getClass(), "viewPointY", 0);
        setIntField(term137387, term137387.getClass(), "viewPointOffsetX", 0);
        setIntField(term137387, term137387.getClass(), "viewPointOffsetY", 0);
        setField(term137387, term137387.getClass(), "screen", null);
        setField(term137387, term137387.getClass(), "backgroundScreen", null);
        setIntField(term137387, term137387.getClass(), "flickerBlue", 0);
        setBooleanField(term137387, term137387.getClass(), "flickerGoUp", false);
        setIntField(term137387, term137387.getClass(), "lastDrawnCenterX", 0);
        setIntField(term137387, term137387.getClass(), "lastDrawnCenterY", 0);
        setField(term137387, term137387.getClass(), "route", null);
        setBooleanField(term137387, term137387.getClass(), "battle", false);
        setIntField(term137387, term137387.getClass(), "wormHoleAnimation", 0);
        setField(term137387, term137387.getClass(), "historyCultures", null);
        setBooleanField(term137387, term137387.getClass(), "historyCoordInitialized", false);
        setIntField(term137387, term137387.getClass(), "historyCoordX", 0);
        setIntField(term137387, term137387.getClass(), "historyCoordY", 0);
        setField(term137387, term137387.getClass(), "leftSpaceImage", null);
        setField(term137387, term137387.getClass(), "rightSpaceImage", null);
        setField(term137387, term137387.getClass(), "popup", null);
        setField(term137387, term137387.getClass(), "tileOverride", null);
        setField(term137387, term137387.getClass(), "redrawTile", null);
        setBooleanField(term137387, term137387.getClass(), "fullDraw", false);
        setIntField(term137387, term137387.getClass(), "cursorFocus", 0);
        setField(term137387, term137387.getClass(), "minimap", null);
        setBooleanField(term137387, term137387.getClass(), "showMiniMap", false);
        setBooleanField(term137387, term137387.getClass(), "highContrastGrid", false);
        setIntField(term137387, term137387.getClass(), "miniMapTopX", 0);
        setIntField(term137387, term137387.getClass(), "miniMapTopY", 0);
        setIntField(term137387, term137387.getClass(), "miniMapBotX", 0);
        setIntField(term137387, term137387.getClass(), "miniMapBotY", 0);
        setIntField(term137387, term137387.getClass(), "transparency", 0);
        setBooleanField(term137387, term137387.getClass(), "improvedParallax", false);
        setBooleanField(term137387, term137387.getClass(), "updateAnimation", false);
        setIntField(term137387, term137387.getClass(), "updateAnimationCount", 0);
        setBooleanField(term137387, term137387.getClass(), "drawWeaponRange", false);
        setField(term137387, term137387.getClass(), "panelType", null);
        setIntField(term137387, term137387.getClass(), "lastCursorPosX", 0);
        setIntField(term137387, term137387.getClass(), "lastCursorPosY", 0);
        setIntField(term137387, term137387.getClass(), "lastZoomLevel", 0);
        setBooleanField(term137387, term137387.getClass(), "redoViewPoints", false);
        setBooleanField(term137387, term137387.getClass(), "isAlignmentXSet", false);
        setFloatField(term137387, term137387.getClass(), "alignmentX", 0.0F);
        setBooleanField(term137387, term137387.getClass(), "isAlignmentYSet", false);
        setFloatField(term137387, term137387.getClass(), "alignmentY", 0.0F);
        setField(term137387, term137387.getClass(), "ui", null);
        setField(term137387, term137387.getClass(), "listenerList", null);
        setField(term137387, term137387.getClass(), "clientProperties", null);
        setField(term137387, term137387.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term137387, term137387.getClass(), "autoscrolls", false);
        setField(term137387, term137387.getClass(), "border", null);
        setIntField(term137387, term137387.getClass(), "flags", 0);
        setField(term137387, term137387.getClass(), "inputVerifier", null);
        setBooleanField(term137387, term137387.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term137387, term137387.getClass(), "paintingChild", null);
        setField(term137387, term137387.getClass(), "popupMenu", null);
        setField(term137387, term137387.getClass(), "revalidateRunnableScheduled", null);
        setField(term137387, term137387.getClass(), "focusInputMap", null);
        setField(term137387, term137387.getClass(), "ancestorInputMap", null);
        setField(term137387, term137387.getClass(), "windowInputMap", null);
        setField(term137387, term137387.getClass(), "actionMap", null);
        setField(term137387, term137387.getClass(), "aaHint", null);
        setField(term137387, term137387.getClass(), "lcdRenderingHint", null);
        setField(term137387, term137387.getClass(), "component", null);
        setField(term137387, term137387.getClass(), "layoutMgr", null);
        setField(term137387, term137387.getClass(), "dispatcher", null);
        setField(term137387, term137387.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term137387, term137387.getClass(), "focusCycleRoot", false);
        setBooleanField(term137387, term137387.getClass(), "focusTraversalPolicyProvider", false);
        setField(term137387, term137387.getClass(), "printingThreads", null);
        setBooleanField(term137387, term137387.getClass(), "printing", false);
        setField(term137387, term137387.getClass(), "containerListener", null);
        setIntField(term137387, term137387.getClass(), "listeningChildren", 0);
        setIntField(term137387, term137387.getClass(), "listeningBoundsChildren", 0);
        setIntField(term137387, term137387.getClass(), "descendantsCount", 0);
        setField(term137387, term137387.getClass(), "preserveBackgroundColor", null);
        setIntField(term137387, term137387.getClass(), "numOfHWComponents", 0);
        setIntField(term137387, term137387.getClass(), "numOfLWComponents", 0);
        setField(term137387, term137387.getClass(), "modalComp", null);
        setField(term137387, term137387.getClass(), "modalAppContext", null);
        setIntField(term137387, term137387.getClass(), "containerSerializedDataVersion", 0);
        setField(term137387, term137387.getClass(), "peer", null);
        setField(term137387, term137387.getClass(), "parent", null);
        setField(term137387, term137387.getClass(), "appContext", null);
        setIntField(term137387, term137387.getClass(), "x", 0);
        setIntField(term137387, term137387.getClass(), "y", 0);
        setIntField(term137387, term137387.getClass(), "width", 0);
        setIntField(term137387, term137387.getClass(), "height", 0);
        setField(term137387, term137387.getClass(), "foreground", null);
        setField(term137387, term137387.getClass(), "background", null);
        setField(term137387, term137387.getClass(), "font", null);
        setField(term137387, term137387.getClass(), "peerFont", null);
        setField(term137387, term137387.getClass(), "cursor", null);
        setField(term137387, term137387.getClass(), "locale", null);
        setField(term137387, term137387.getClass(), "graphicsConfig", null);
        setField(term137387, term137387.getClass(), "bufferStrategy", null);
        setBooleanField(term137387, term137387.getClass(), "ignoreRepaint", false);
        setBooleanField(term137387, term137387.getClass(), "visible", false);
        setBooleanField(term137387, term137387.getClass(), "enabled", false);
        setBooleanField(term137387, term137387.getClass(), "valid", false);
        setField(term137387, term137387.getClass(), "dropTarget", null);
        setField(term137387, term137387.getClass(), "popups", null);
        setField(term137387, term137387.getClass(), "name", null);
        setBooleanField(term137387, term137387.getClass(), "nameExplicitlySet", false);
        setBooleanField(term137387, term137387.getClass(), "focusable", false);
        setIntField(term137387, term137387.getClass(), "isFocusTraversableOverridden", 0);
        setField(term137387, term137387.getClass(), "focusTraversalKeys", null);
        setBooleanField(term137387, term137387.getClass(), "focusTraversalKeysEnabled", false);
        setField(term137387, term137387.getClass(), "acc", null);
        setField(term137387, term137387.getClass(), "minSize", null);
        setBooleanField(term137387, term137387.getClass(), "minSizeSet", false);
        setField(term137387, term137387.getClass(), "prefSize", null);
        setBooleanField(term137387, term137387.getClass(), "prefSizeSet", false);
        setField(term137387, term137387.getClass(), "maxSize", null);
        setBooleanField(term137387, term137387.getClass(), "maxSizeSet", false);
        setField(term137387, term137387.getClass(), "componentOrientation", null);
        setBooleanField(term137387, term137387.getClass(), "newEventsOnly", false);
        setField(term137387, term137387.getClass(), "componentListener", null);
        setField(term137387, term137387.getClass(), "focusListener", null);
        setField(term137387, term137387.getClass(), "hierarchyListener", null);
        setField(term137387, term137387.getClass(), "hierarchyBoundsListener", null);
        setField(term137387, term137387.getClass(), "keyListener", null);
        setField(term137387, term137387.getClass(), "mouseListener", null);
        setField(term137387, term137387.getClass(), "mouseMotionListener", null);
        setField(term137387, term137387.getClass(), "mouseWheelListener", null);
        setField(term137387, term137387.getClass(), "inputMethodListener", null);
        setLongField(term137387, term137387.getClass(), "eventMask", 0L);
        setField(term137387, term137387.getClass(), "changeSupport", null);
        setField(term137387, term137387.getClass(), "objectLock", null);
        setBooleanField(term137387, term137387.getClass(), "isPacked", false);
        setIntField(term137387, term137387.getClass(), "boundsOp", 0);
        setField(term137387, term137387.getClass(), "compoundShape", null);
        setField(term137387, term137387.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term137387, term137387.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term137387, term137387.getClass(), "backgroundEraseDisabled", false);
        setField(term137387, term137387.getClass(), "eventCache", null);
        setBooleanField(term137387, term137387.getClass(), "coalescingEnabled", false);
        setBooleanField(term137387, term137387.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term137387, term137387.getClass(), "componentSerializedDataVersion", 0);
        setField(term137387, term137387.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattleViewSize", argTypes, term137387, args);
    }

};


