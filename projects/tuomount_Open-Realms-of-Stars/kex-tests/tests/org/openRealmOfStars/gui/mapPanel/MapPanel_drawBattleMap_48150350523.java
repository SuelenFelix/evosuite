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

public class MapPanel_drawBattleMap_48150350523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119953;

    public MapPanel_drawBattleMap_48150350523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119953 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel"));
        setIntField(term119953, term119953.getClass(), "viewPointX", 0);
        setIntField(term119953, term119953.getClass(), "viewPointY", 0);
        setIntField(term119953, term119953.getClass(), "viewPointOffsetX", 0);
        setIntField(term119953, term119953.getClass(), "viewPointOffsetY", 0);
        setField(term119953, term119953.getClass(), "screen", null);
        setField(term119953, term119953.getClass(), "backgroundScreen", null);
        setIntField(term119953, term119953.getClass(), "flickerBlue", 0);
        setBooleanField(term119953, term119953.getClass(), "flickerGoUp", false);
        setIntField(term119953, term119953.getClass(), "lastDrawnCenterX", 0);
        setIntField(term119953, term119953.getClass(), "lastDrawnCenterY", 0);
        setField(term119953, term119953.getClass(), "route", null);
        setBooleanField(term119953, term119953.getClass(), "battle", false);
        setIntField(term119953, term119953.getClass(), "wormHoleAnimation", 0);
        setField(term119953, term119953.getClass(), "historyCultures", null);
        setBooleanField(term119953, term119953.getClass(), "historyCoordInitialized", false);
        setIntField(term119953, term119953.getClass(), "historyCoordX", 0);
        setIntField(term119953, term119953.getClass(), "historyCoordY", 0);
        setField(term119953, term119953.getClass(), "leftSpaceImage", null);
        setField(term119953, term119953.getClass(), "rightSpaceImage", null);
        setField(term119953, term119953.getClass(), "popup", null);
        setField(term119953, term119953.getClass(), "tileOverride", null);
        setField(term119953, term119953.getClass(), "redrawTile", null);
        setBooleanField(term119953, term119953.getClass(), "fullDraw", false);
        setIntField(term119953, term119953.getClass(), "cursorFocus", 0);
        setField(term119953, term119953.getClass(), "minimap", null);
        setBooleanField(term119953, term119953.getClass(), "showMiniMap", false);
        setBooleanField(term119953, term119953.getClass(), "highContrastGrid", false);
        setIntField(term119953, term119953.getClass(), "miniMapTopX", 0);
        setIntField(term119953, term119953.getClass(), "miniMapTopY", 0);
        setIntField(term119953, term119953.getClass(), "miniMapBotX", 0);
        setIntField(term119953, term119953.getClass(), "miniMapBotY", 0);
        setIntField(term119953, term119953.getClass(), "transparency", 0);
        setBooleanField(term119953, term119953.getClass(), "improvedParallax", false);
        setBooleanField(term119953, term119953.getClass(), "updateAnimation", false);
        setIntField(term119953, term119953.getClass(), "updateAnimationCount", 0);
        setBooleanField(term119953, term119953.getClass(), "drawWeaponRange", false);
        setField(term119953, term119953.getClass(), "panelType", null);
        setIntField(term119953, term119953.getClass(), "lastCursorPosX", 0);
        setIntField(term119953, term119953.getClass(), "lastCursorPosY", 0);
        setIntField(term119953, term119953.getClass(), "lastZoomLevel", 0);
        setBooleanField(term119953, term119953.getClass(), "redoViewPoints", false);
        setBooleanField(term119953, term119953.getClass(), "isAlignmentXSet", false);
        setFloatField(term119953, term119953.getClass(), "alignmentX", 0.0F);
        setBooleanField(term119953, term119953.getClass(), "isAlignmentYSet", false);
        setFloatField(term119953, term119953.getClass(), "alignmentY", 0.0F);
        setField(term119953, term119953.getClass(), "ui", null);
        setField(term119953, term119953.getClass(), "listenerList", null);
        setField(term119953, term119953.getClass(), "clientProperties", null);
        setField(term119953, term119953.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term119953, term119953.getClass(), "autoscrolls", false);
        setField(term119953, term119953.getClass(), "border", null);
        setIntField(term119953, term119953.getClass(), "flags", 0);
        setField(term119953, term119953.getClass(), "inputVerifier", null);
        setBooleanField(term119953, term119953.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term119953, term119953.getClass(), "paintingChild", null);
        setField(term119953, term119953.getClass(), "popupMenu", null);
        setField(term119953, term119953.getClass(), "revalidateRunnableScheduled", null);
        setField(term119953, term119953.getClass(), "focusInputMap", null);
        setField(term119953, term119953.getClass(), "ancestorInputMap", null);
        setField(term119953, term119953.getClass(), "windowInputMap", null);
        setField(term119953, term119953.getClass(), "actionMap", null);
        setField(term119953, term119953.getClass(), "aaHint", null);
        setField(term119953, term119953.getClass(), "lcdRenderingHint", null);
        setField(term119953, term119953.getClass(), "component", null);
        setField(term119953, term119953.getClass(), "layoutMgr", null);
        setField(term119953, term119953.getClass(), "dispatcher", null);
        setField(term119953, term119953.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term119953, term119953.getClass(), "focusCycleRoot", false);
        setBooleanField(term119953, term119953.getClass(), "focusTraversalPolicyProvider", false);
        setField(term119953, term119953.getClass(), "printingThreads", null);
        setBooleanField(term119953, term119953.getClass(), "printing", false);
        setField(term119953, term119953.getClass(), "containerListener", null);
        setIntField(term119953, term119953.getClass(), "listeningChildren", 0);
        setIntField(term119953, term119953.getClass(), "listeningBoundsChildren", 0);
        setIntField(term119953, term119953.getClass(), "descendantsCount", 0);
        setField(term119953, term119953.getClass(), "preserveBackgroundColor", null);
        setIntField(term119953, term119953.getClass(), "numOfHWComponents", 0);
        setIntField(term119953, term119953.getClass(), "numOfLWComponents", 0);
        setField(term119953, term119953.getClass(), "modalComp", null);
        setField(term119953, term119953.getClass(), "modalAppContext", null);
        setIntField(term119953, term119953.getClass(), "containerSerializedDataVersion", 0);
        setField(term119953, term119953.getClass(), "peer", null);
        setField(term119953, term119953.getClass(), "parent", null);
        setField(term119953, term119953.getClass(), "appContext", null);
        setIntField(term119953, term119953.getClass(), "x", 0);
        setIntField(term119953, term119953.getClass(), "y", 0);
        setIntField(term119953, term119953.getClass(), "width", 0);
        setIntField(term119953, term119953.getClass(), "height", 0);
        setField(term119953, term119953.getClass(), "foreground", null);
        setField(term119953, term119953.getClass(), "background", null);
        setField(term119953, term119953.getClass(), "font", null);
        setField(term119953, term119953.getClass(), "peerFont", null);
        setField(term119953, term119953.getClass(), "cursor", null);
        setField(term119953, term119953.getClass(), "locale", null);
        setField(term119953, term119953.getClass(), "graphicsConfig", null);
        setField(term119953, term119953.getClass(), "bufferStrategy", null);
        setBooleanField(term119953, term119953.getClass(), "ignoreRepaint", false);
        setBooleanField(term119953, term119953.getClass(), "visible", false);
        setBooleanField(term119953, term119953.getClass(), "enabled", false);
        setBooleanField(term119953, term119953.getClass(), "valid", false);
        setField(term119953, term119953.getClass(), "dropTarget", null);
        setField(term119953, term119953.getClass(), "popups", null);
        setField(term119953, term119953.getClass(), "name", null);
        setBooleanField(term119953, term119953.getClass(), "nameExplicitlySet", false);
        setBooleanField(term119953, term119953.getClass(), "focusable", false);
        setIntField(term119953, term119953.getClass(), "isFocusTraversableOverridden", 0);
        setField(term119953, term119953.getClass(), "focusTraversalKeys", null);
        setBooleanField(term119953, term119953.getClass(), "focusTraversalKeysEnabled", false);
        setField(term119953, term119953.getClass(), "acc", null);
        setField(term119953, term119953.getClass(), "minSize", null);
        setBooleanField(term119953, term119953.getClass(), "minSizeSet", false);
        setField(term119953, term119953.getClass(), "prefSize", null);
        setBooleanField(term119953, term119953.getClass(), "prefSizeSet", false);
        setField(term119953, term119953.getClass(), "maxSize", null);
        setBooleanField(term119953, term119953.getClass(), "maxSizeSet", false);
        setField(term119953, term119953.getClass(), "componentOrientation", null);
        setBooleanField(term119953, term119953.getClass(), "newEventsOnly", false);
        setField(term119953, term119953.getClass(), "componentListener", null);
        setField(term119953, term119953.getClass(), "focusListener", null);
        setField(term119953, term119953.getClass(), "hierarchyListener", null);
        setField(term119953, term119953.getClass(), "hierarchyBoundsListener", null);
        setField(term119953, term119953.getClass(), "keyListener", null);
        setField(term119953, term119953.getClass(), "mouseListener", null);
        setField(term119953, term119953.getClass(), "mouseMotionListener", null);
        setField(term119953, term119953.getClass(), "mouseWheelListener", null);
        setField(term119953, term119953.getClass(), "inputMethodListener", null);
        setLongField(term119953, term119953.getClass(), "eventMask", 0L);
        setField(term119953, term119953.getClass(), "changeSupport", null);
        setField(term119953, term119953.getClass(), "objectLock", null);
        setBooleanField(term119953, term119953.getClass(), "isPacked", false);
        setIntField(term119953, term119953.getClass(), "boundsOp", 0);
        setField(term119953, term119953.getClass(), "compoundShape", null);
        setField(term119953, term119953.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term119953, term119953.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term119953, term119953.getClass(), "backgroundEraseDisabled", false);
        setField(term119953, term119953.getClass(), "eventCache", null);
        setBooleanField(term119953, term119953.getClass(), "coalescingEnabled", false);
        setBooleanField(term119953, term119953.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term119953, term119953.getClass(), "componentSerializedDataVersion", 0);
        setField(term119953, term119953.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.Combat");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "drawBattleMap", argTypes, term119953, args);
    }

};


