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

public class MapInfoPanel_updatePanel_56092039411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40091;
     Object term40133;

    public MapInfoPanel_updatePanel_56092039411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40091 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel"));
        setField(term40091, term40091.getClass(), "imageLabel", null);
        setField(term40091, term40091.getClass(), "textArea", null);
        setField(term40091, term40091.getClass(), "planet", null);
        setBooleanField(term40091, term40091.getClass(), "activeScanned", false);
        setField(term40091, term40091.getClass(), "fleet", null);
        setField(term40091, term40091.getClass(), "tile", null);
        setField(term40091, term40091.getClass(), "fleetOwner", null);
        setField(term40091, term40091.getClass(), "viewBtn", null);
        setField(term40091, term40091.getClass(), "defendBtn", null);
        setField(term40091, term40091.getClass(), "fixTradeFleetBtn", null);
        setField(term40091, term40091.getClass(), "routeBtn", null);
        setField(term40091, term40091.getClass(), "moveBtn", null);
        setField(term40091, term40091.getClass(), "focusBtn", null);
        setField(term40091, term40091.getClass(), "border", null);
        setBooleanField(term40091, term40091.getClass(), "isAlignmentXSet", false);
        setFloatField(term40091, term40091.getClass(), "alignmentX", 0.0F);
        setBooleanField(term40091, term40091.getClass(), "isAlignmentYSet", false);
        setFloatField(term40091, term40091.getClass(), "alignmentY", 0.0F);
        setField(term40091, term40091.getClass(), "ui", null);
        setField(term40091, term40091.getClass(), "listenerList", null);
        setField(term40091, term40091.getClass(), "clientProperties", null);
        setField(term40091, term40091.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term40091, term40091.getClass(), "autoscrolls", false);
        setField(term40091, term40091.getClass(), "border", null);
        setIntField(term40091, term40091.getClass(), "flags", 0);
        setField(term40091, term40091.getClass(), "inputVerifier", null);
        setBooleanField(term40091, term40091.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term40091, term40091.getClass(), "paintingChild", null);
        setField(term40091, term40091.getClass(), "popupMenu", null);
        setField(term40091, term40091.getClass(), "revalidateRunnableScheduled", null);
        setField(term40091, term40091.getClass(), "focusInputMap", null);
        setField(term40091, term40091.getClass(), "ancestorInputMap", null);
        setField(term40091, term40091.getClass(), "windowInputMap", null);
        setField(term40091, term40091.getClass(), "actionMap", null);
        setField(term40091, term40091.getClass(), "aaHint", null);
        setField(term40091, term40091.getClass(), "lcdRenderingHint", null);
        setField(term40091, term40091.getClass(), "component", null);
        setField(term40091, term40091.getClass(), "layoutMgr", null);
        setField(term40091, term40091.getClass(), "dispatcher", null);
        setField(term40091, term40091.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term40091, term40091.getClass(), "focusCycleRoot", false);
        setBooleanField(term40091, term40091.getClass(), "focusTraversalPolicyProvider", false);
        setField(term40091, term40091.getClass(), "printingThreads", null);
        setBooleanField(term40091, term40091.getClass(), "printing", false);
        setField(term40091, term40091.getClass(), "containerListener", null);
        setIntField(term40091, term40091.getClass(), "listeningChildren", 0);
        setIntField(term40091, term40091.getClass(), "listeningBoundsChildren", 0);
        setIntField(term40091, term40091.getClass(), "descendantsCount", 0);
        setField(term40091, term40091.getClass(), "preserveBackgroundColor", null);
        setIntField(term40091, term40091.getClass(), "numOfHWComponents", 0);
        setIntField(term40091, term40091.getClass(), "numOfLWComponents", 0);
        setField(term40091, term40091.getClass(), "modalComp", null);
        setField(term40091, term40091.getClass(), "modalAppContext", null);
        setIntField(term40091, term40091.getClass(), "containerSerializedDataVersion", 0);
        setField(term40091, term40091.getClass(), "peer", null);
        setField(term40091, term40091.getClass(), "parent", null);
        setField(term40091, term40091.getClass(), "appContext", null);
        setIntField(term40091, term40091.getClass(), "x", 0);
        setIntField(term40091, term40091.getClass(), "y", 0);
        setIntField(term40091, term40091.getClass(), "width", 0);
        setIntField(term40091, term40091.getClass(), "height", 0);
        setField(term40091, term40091.getClass(), "foreground", null);
        setField(term40091, term40091.getClass(), "background", null);
        setField(term40091, term40091.getClass(), "font", null);
        setField(term40091, term40091.getClass(), "peerFont", null);
        setField(term40091, term40091.getClass(), "cursor", null);
        setField(term40091, term40091.getClass(), "locale", null);
        setField(term40091, term40091.getClass(), "graphicsConfig", null);
        setField(term40091, term40091.getClass(), "bufferStrategy", null);
        setBooleanField(term40091, term40091.getClass(), "ignoreRepaint", false);
        setBooleanField(term40091, term40091.getClass(), "visible", false);
        setBooleanField(term40091, term40091.getClass(), "enabled", false);
        setBooleanField(term40091, term40091.getClass(), "valid", false);
        setField(term40091, term40091.getClass(), "dropTarget", null);
        setField(term40091, term40091.getClass(), "popups", null);
        setField(term40091, term40091.getClass(), "name", null);
        setBooleanField(term40091, term40091.getClass(), "nameExplicitlySet", false);
        setBooleanField(term40091, term40091.getClass(), "focusable", false);
        setIntField(term40091, term40091.getClass(), "isFocusTraversableOverridden", 0);
        setField(term40091, term40091.getClass(), "focusTraversalKeys", null);
        setBooleanField(term40091, term40091.getClass(), "focusTraversalKeysEnabled", false);
        setField(term40091, term40091.getClass(), "acc", null);
        setField(term40091, term40091.getClass(), "minSize", null);
        setBooleanField(term40091, term40091.getClass(), "minSizeSet", false);
        setField(term40091, term40091.getClass(), "prefSize", null);
        setBooleanField(term40091, term40091.getClass(), "prefSizeSet", false);
        setField(term40091, term40091.getClass(), "maxSize", null);
        setBooleanField(term40091, term40091.getClass(), "maxSizeSet", false);
        setField(term40091, term40091.getClass(), "componentOrientation", null);
        setBooleanField(term40091, term40091.getClass(), "newEventsOnly", false);
        setField(term40091, term40091.getClass(), "componentListener", null);
        setField(term40091, term40091.getClass(), "focusListener", null);
        setField(term40091, term40091.getClass(), "hierarchyListener", null);
        setField(term40091, term40091.getClass(), "hierarchyBoundsListener", null);
        setField(term40091, term40091.getClass(), "keyListener", null);
        setField(term40091, term40091.getClass(), "mouseListener", null);
        setField(term40091, term40091.getClass(), "mouseMotionListener", null);
        setField(term40091, term40091.getClass(), "mouseWheelListener", null);
        setField(term40091, term40091.getClass(), "inputMethodListener", null);
        setLongField(term40091, term40091.getClass(), "eventMask", 0L);
        setField(term40091, term40091.getClass(), "changeSupport", null);
        setField(term40091, term40091.getClass(), "objectLock", null);
        setBooleanField(term40091, term40091.getClass(), "isPacked", false);
        setIntField(term40091, term40091.getClass(), "boundsOp", 0);
        setField(term40091, term40091.getClass(), "compoundShape", null);
        setField(term40091, term40091.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term40091, term40091.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term40091, term40091.getClass(), "backgroundEraseDisabled", false);
        setField(term40091, term40091.getClass(), "eventCache", null);
        setBooleanField(term40091, term40091.getClass(), "coalescingEnabled", false);
        setBooleanField(term40091, term40091.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term40091, term40091.getClass(), "componentSerializedDataVersion", 0);
        setField(term40091, term40091.getClass(), "accessibleContext", null);
        term40133 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = term40133;
        args[1] = null;
        callMethod(klass, "updatePanel", argTypes, term40091, args);
    }

};


