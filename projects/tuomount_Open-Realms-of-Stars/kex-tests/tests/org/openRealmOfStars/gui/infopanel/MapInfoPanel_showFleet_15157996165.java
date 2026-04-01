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
import java.lang.Boolean;

public class MapInfoPanel_showFleet_15157996165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28977;
     Object term29019;

    public MapInfoPanel_showFleet_15157996165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28977 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel"));
        setField(term28977, term28977.getClass(), "imageLabel", null);
        setField(term28977, term28977.getClass(), "textArea", null);
        setField(term28977, term28977.getClass(), "planet", null);
        setBooleanField(term28977, term28977.getClass(), "activeScanned", false);
        setField(term28977, term28977.getClass(), "fleet", null);
        setField(term28977, term28977.getClass(), "tile", null);
        setField(term28977, term28977.getClass(), "fleetOwner", null);
        setField(term28977, term28977.getClass(), "viewBtn", null);
        setField(term28977, term28977.getClass(), "defendBtn", null);
        setField(term28977, term28977.getClass(), "fixTradeFleetBtn", null);
        setField(term28977, term28977.getClass(), "routeBtn", null);
        setField(term28977, term28977.getClass(), "moveBtn", null);
        setField(term28977, term28977.getClass(), "focusBtn", null);
        setField(term28977, term28977.getClass(), "border", null);
        setBooleanField(term28977, term28977.getClass(), "isAlignmentXSet", false);
        setFloatField(term28977, term28977.getClass(), "alignmentX", 0.0F);
        setBooleanField(term28977, term28977.getClass(), "isAlignmentYSet", false);
        setFloatField(term28977, term28977.getClass(), "alignmentY", 0.0F);
        setField(term28977, term28977.getClass(), "ui", null);
        setField(term28977, term28977.getClass(), "listenerList", null);
        setField(term28977, term28977.getClass(), "clientProperties", null);
        setField(term28977, term28977.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term28977, term28977.getClass(), "autoscrolls", false);
        setField(term28977, term28977.getClass(), "border", null);
        setIntField(term28977, term28977.getClass(), "flags", 0);
        setField(term28977, term28977.getClass(), "inputVerifier", null);
        setBooleanField(term28977, term28977.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term28977, term28977.getClass(), "paintingChild", null);
        setField(term28977, term28977.getClass(), "popupMenu", null);
        setField(term28977, term28977.getClass(), "revalidateRunnableScheduled", null);
        setField(term28977, term28977.getClass(), "focusInputMap", null);
        setField(term28977, term28977.getClass(), "ancestorInputMap", null);
        setField(term28977, term28977.getClass(), "windowInputMap", null);
        setField(term28977, term28977.getClass(), "actionMap", null);
        setField(term28977, term28977.getClass(), "aaHint", null);
        setField(term28977, term28977.getClass(), "lcdRenderingHint", null);
        setField(term28977, term28977.getClass(), "component", null);
        setField(term28977, term28977.getClass(), "layoutMgr", null);
        setField(term28977, term28977.getClass(), "dispatcher", null);
        setField(term28977, term28977.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term28977, term28977.getClass(), "focusCycleRoot", false);
        setBooleanField(term28977, term28977.getClass(), "focusTraversalPolicyProvider", false);
        setField(term28977, term28977.getClass(), "printingThreads", null);
        setBooleanField(term28977, term28977.getClass(), "printing", false);
        setField(term28977, term28977.getClass(), "containerListener", null);
        setIntField(term28977, term28977.getClass(), "listeningChildren", 0);
        setIntField(term28977, term28977.getClass(), "listeningBoundsChildren", 0);
        setIntField(term28977, term28977.getClass(), "descendantsCount", 0);
        setField(term28977, term28977.getClass(), "preserveBackgroundColor", null);
        setIntField(term28977, term28977.getClass(), "numOfHWComponents", 0);
        setIntField(term28977, term28977.getClass(), "numOfLWComponents", 0);
        setField(term28977, term28977.getClass(), "modalComp", null);
        setField(term28977, term28977.getClass(), "modalAppContext", null);
        setIntField(term28977, term28977.getClass(), "containerSerializedDataVersion", 0);
        setField(term28977, term28977.getClass(), "peer", null);
        setField(term28977, term28977.getClass(), "parent", null);
        setField(term28977, term28977.getClass(), "appContext", null);
        setIntField(term28977, term28977.getClass(), "x", 0);
        setIntField(term28977, term28977.getClass(), "y", 0);
        setIntField(term28977, term28977.getClass(), "width", 0);
        setIntField(term28977, term28977.getClass(), "height", 0);
        setField(term28977, term28977.getClass(), "foreground", null);
        setField(term28977, term28977.getClass(), "background", null);
        setField(term28977, term28977.getClass(), "font", null);
        setField(term28977, term28977.getClass(), "peerFont", null);
        setField(term28977, term28977.getClass(), "cursor", null);
        setField(term28977, term28977.getClass(), "locale", null);
        setField(term28977, term28977.getClass(), "graphicsConfig", null);
        setField(term28977, term28977.getClass(), "bufferStrategy", null);
        setBooleanField(term28977, term28977.getClass(), "ignoreRepaint", false);
        setBooleanField(term28977, term28977.getClass(), "visible", false);
        setBooleanField(term28977, term28977.getClass(), "enabled", false);
        setBooleanField(term28977, term28977.getClass(), "valid", false);
        setField(term28977, term28977.getClass(), "dropTarget", null);
        setField(term28977, term28977.getClass(), "popups", null);
        setField(term28977, term28977.getClass(), "name", null);
        setBooleanField(term28977, term28977.getClass(), "nameExplicitlySet", false);
        setBooleanField(term28977, term28977.getClass(), "focusable", false);
        setIntField(term28977, term28977.getClass(), "isFocusTraversableOverridden", 0);
        setField(term28977, term28977.getClass(), "focusTraversalKeys", null);
        setBooleanField(term28977, term28977.getClass(), "focusTraversalKeysEnabled", false);
        setField(term28977, term28977.getClass(), "acc", null);
        setField(term28977, term28977.getClass(), "minSize", null);
        setBooleanField(term28977, term28977.getClass(), "minSizeSet", false);
        setField(term28977, term28977.getClass(), "prefSize", null);
        setBooleanField(term28977, term28977.getClass(), "prefSizeSet", false);
        setField(term28977, term28977.getClass(), "maxSize", null);
        setBooleanField(term28977, term28977.getClass(), "maxSizeSet", false);
        setField(term28977, term28977.getClass(), "componentOrientation", null);
        setBooleanField(term28977, term28977.getClass(), "newEventsOnly", false);
        setField(term28977, term28977.getClass(), "componentListener", null);
        setField(term28977, term28977.getClass(), "focusListener", null);
        setField(term28977, term28977.getClass(), "hierarchyListener", null);
        setField(term28977, term28977.getClass(), "hierarchyBoundsListener", null);
        setField(term28977, term28977.getClass(), "keyListener", null);
        setField(term28977, term28977.getClass(), "mouseListener", null);
        setField(term28977, term28977.getClass(), "mouseMotionListener", null);
        setField(term28977, term28977.getClass(), "mouseWheelListener", null);
        setField(term28977, term28977.getClass(), "inputMethodListener", null);
        setLongField(term28977, term28977.getClass(), "eventMask", 0L);
        setField(term28977, term28977.getClass(), "changeSupport", null);
        setField(term28977, term28977.getClass(), "objectLock", null);
        setBooleanField(term28977, term28977.getClass(), "isPacked", false);
        setIntField(term28977, term28977.getClass(), "boundsOp", 0);
        setField(term28977, term28977.getClass(), "compoundShape", null);
        setField(term28977, term28977.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term28977, term28977.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term28977, term28977.getClass(), "backgroundEraseDisabled", false);
        setField(term28977, term28977.getClass(), "eventCache", null);
        setBooleanField(term28977, term28977.getClass(), "coalescingEnabled", false);
        setBooleanField(term28977, term28977.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term28977, term28977.getClass(), "componentSerializedDataVersion", 0);
        setField(term28977, term28977.getClass(), "accessibleContext", null);
        term29019 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term29019;
        callMethod(klass, "showFleet", argTypes, term28977, args);
    }

};


