package org.openRealmOfStars.gui.infopanel;

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
import static org.openRealmOfStars.gui.infopanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MapInfoPanel_showTile_51815712518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43184;

    public MapInfoPanel_showTile_51815712518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43184 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel"));
        setField(term43184, term43184.getClass(), "imageLabel", null);
        setField(term43184, term43184.getClass(), "textArea", null);
        setField(term43184, term43184.getClass(), "planet", null);
        setBooleanField(term43184, term43184.getClass(), "activeScanned", false);
        setField(term43184, term43184.getClass(), "fleet", null);
        setField(term43184, term43184.getClass(), "tile", null);
        setField(term43184, term43184.getClass(), "fleetOwner", null);
        setField(term43184, term43184.getClass(), "viewBtn", null);
        setField(term43184, term43184.getClass(), "defendBtn", null);
        setField(term43184, term43184.getClass(), "fixTradeFleetBtn", null);
        setField(term43184, term43184.getClass(), "routeBtn", null);
        setField(term43184, term43184.getClass(), "moveBtn", null);
        setField(term43184, term43184.getClass(), "focusBtn", null);
        setField(term43184, term43184.getClass(), "border", null);
        setBooleanField(term43184, term43184.getClass(), "isAlignmentXSet", false);
        setFloatField(term43184, term43184.getClass(), "alignmentX", 0.0F);
        setBooleanField(term43184, term43184.getClass(), "isAlignmentYSet", false);
        setFloatField(term43184, term43184.getClass(), "alignmentY", 0.0F);
        setField(term43184, term43184.getClass(), "ui", null);
        setField(term43184, term43184.getClass(), "listenerList", null);
        setField(term43184, term43184.getClass(), "clientProperties", null);
        setField(term43184, term43184.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term43184, term43184.getClass(), "autoscrolls", false);
        setField(term43184, term43184.getClass(), "border", null);
        setIntField(term43184, term43184.getClass(), "flags", 0);
        setField(term43184, term43184.getClass(), "inputVerifier", null);
        setBooleanField(term43184, term43184.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term43184, term43184.getClass(), "paintingChild", null);
        setField(term43184, term43184.getClass(), "popupMenu", null);
        setField(term43184, term43184.getClass(), "revalidateRunnableScheduled", null);
        setField(term43184, term43184.getClass(), "focusInputMap", null);
        setField(term43184, term43184.getClass(), "ancestorInputMap", null);
        setField(term43184, term43184.getClass(), "windowInputMap", null);
        setField(term43184, term43184.getClass(), "actionMap", null);
        setField(term43184, term43184.getClass(), "aaHint", null);
        setField(term43184, term43184.getClass(), "lcdRenderingHint", null);
        setField(term43184, term43184.getClass(), "component", null);
        setField(term43184, term43184.getClass(), "layoutMgr", null);
        setField(term43184, term43184.getClass(), "dispatcher", null);
        setField(term43184, term43184.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term43184, term43184.getClass(), "focusCycleRoot", false);
        setBooleanField(term43184, term43184.getClass(), "focusTraversalPolicyProvider", false);
        setField(term43184, term43184.getClass(), "printingThreads", null);
        setBooleanField(term43184, term43184.getClass(), "printing", false);
        setField(term43184, term43184.getClass(), "containerListener", null);
        setIntField(term43184, term43184.getClass(), "listeningChildren", 0);
        setIntField(term43184, term43184.getClass(), "listeningBoundsChildren", 0);
        setIntField(term43184, term43184.getClass(), "descendantsCount", 0);
        setField(term43184, term43184.getClass(), "preserveBackgroundColor", null);
        setIntField(term43184, term43184.getClass(), "numOfHWComponents", 0);
        setIntField(term43184, term43184.getClass(), "numOfLWComponents", 0);
        setField(term43184, term43184.getClass(), "modalComp", null);
        setField(term43184, term43184.getClass(), "modalAppContext", null);
        setIntField(term43184, term43184.getClass(), "containerSerializedDataVersion", 0);
        setField(term43184, term43184.getClass(), "peer", null);
        setField(term43184, term43184.getClass(), "parent", null);
        setField(term43184, term43184.getClass(), "appContext", null);
        setIntField(term43184, term43184.getClass(), "x", 0);
        setIntField(term43184, term43184.getClass(), "y", 0);
        setIntField(term43184, term43184.getClass(), "width", 0);
        setIntField(term43184, term43184.getClass(), "height", 0);
        setField(term43184, term43184.getClass(), "foreground", null);
        setField(term43184, term43184.getClass(), "background", null);
        setField(term43184, term43184.getClass(), "font", null);
        setField(term43184, term43184.getClass(), "peerFont", null);
        setField(term43184, term43184.getClass(), "cursor", null);
        setField(term43184, term43184.getClass(), "locale", null);
        setField(term43184, term43184.getClass(), "graphicsConfig", null);
        setField(term43184, term43184.getClass(), "bufferStrategy", null);
        setBooleanField(term43184, term43184.getClass(), "ignoreRepaint", false);
        setBooleanField(term43184, term43184.getClass(), "visible", false);
        setBooleanField(term43184, term43184.getClass(), "enabled", false);
        setBooleanField(term43184, term43184.getClass(), "valid", false);
        setField(term43184, term43184.getClass(), "dropTarget", null);
        setField(term43184, term43184.getClass(), "popups", null);
        setField(term43184, term43184.getClass(), "name", null);
        setBooleanField(term43184, term43184.getClass(), "nameExplicitlySet", false);
        setBooleanField(term43184, term43184.getClass(), "focusable", false);
        setIntField(term43184, term43184.getClass(), "isFocusTraversableOverridden", 0);
        setField(term43184, term43184.getClass(), "focusTraversalKeys", null);
        setBooleanField(term43184, term43184.getClass(), "focusTraversalKeysEnabled", false);
        setField(term43184, term43184.getClass(), "acc", null);
        setField(term43184, term43184.getClass(), "minSize", null);
        setBooleanField(term43184, term43184.getClass(), "minSizeSet", false);
        setField(term43184, term43184.getClass(), "prefSize", null);
        setBooleanField(term43184, term43184.getClass(), "prefSizeSet", false);
        setField(term43184, term43184.getClass(), "maxSize", null);
        setBooleanField(term43184, term43184.getClass(), "maxSizeSet", false);
        setField(term43184, term43184.getClass(), "componentOrientation", null);
        setBooleanField(term43184, term43184.getClass(), "newEventsOnly", false);
        setField(term43184, term43184.getClass(), "componentListener", null);
        setField(term43184, term43184.getClass(), "focusListener", null);
        setField(term43184, term43184.getClass(), "hierarchyListener", null);
        setField(term43184, term43184.getClass(), "hierarchyBoundsListener", null);
        setField(term43184, term43184.getClass(), "keyListener", null);
        setField(term43184, term43184.getClass(), "mouseListener", null);
        setField(term43184, term43184.getClass(), "mouseMotionListener", null);
        setField(term43184, term43184.getClass(), "mouseWheelListener", null);
        setField(term43184, term43184.getClass(), "inputMethodListener", null);
        setLongField(term43184, term43184.getClass(), "eventMask", 0L);
        setField(term43184, term43184.getClass(), "changeSupport", null);
        setField(term43184, term43184.getClass(), "objectLock", null);
        setBooleanField(term43184, term43184.getClass(), "isPacked", false);
        setIntField(term43184, term43184.getClass(), "boundsOp", 0);
        setField(term43184, term43184.getClass(), "compoundShape", null);
        setField(term43184, term43184.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term43184, term43184.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term43184, term43184.getClass(), "backgroundEraseDisabled", false);
        setField(term43184, term43184.getClass(), "eventCache", null);
        setBooleanField(term43184, term43184.getClass(), "coalescingEnabled", false);
        setBooleanField(term43184, term43184.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term43184, term43184.getClass(), "componentSerializedDataVersion", 0);
        setField(term43184, term43184.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "showTile", argTypes, term43184, args);
    }

};


