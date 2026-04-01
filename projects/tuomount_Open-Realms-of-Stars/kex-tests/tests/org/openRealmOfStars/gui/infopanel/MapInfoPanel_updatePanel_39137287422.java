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

public class MapInfoPanel_updatePanel_39137287422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43352;
     Object term43394;

    public MapInfoPanel_updatePanel_39137287422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43352 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel"));
        setField(term43352, term43352.getClass(), "imageLabel", null);
        setField(term43352, term43352.getClass(), "textArea", null);
        setField(term43352, term43352.getClass(), "planet", null);
        setBooleanField(term43352, term43352.getClass(), "activeScanned", false);
        setField(term43352, term43352.getClass(), "fleet", null);
        setField(term43352, term43352.getClass(), "tile", null);
        setField(term43352, term43352.getClass(), "fleetOwner", null);
        setField(term43352, term43352.getClass(), "viewBtn", null);
        setField(term43352, term43352.getClass(), "defendBtn", null);
        setField(term43352, term43352.getClass(), "fixTradeFleetBtn", null);
        setField(term43352, term43352.getClass(), "routeBtn", null);
        setField(term43352, term43352.getClass(), "moveBtn", null);
        setField(term43352, term43352.getClass(), "focusBtn", null);
        setField(term43352, term43352.getClass(), "border", null);
        setBooleanField(term43352, term43352.getClass(), "isAlignmentXSet", false);
        setFloatField(term43352, term43352.getClass(), "alignmentX", 0.0F);
        setBooleanField(term43352, term43352.getClass(), "isAlignmentYSet", false);
        setFloatField(term43352, term43352.getClass(), "alignmentY", 0.0F);
        setField(term43352, term43352.getClass(), "ui", null);
        setField(term43352, term43352.getClass(), "listenerList", null);
        setField(term43352, term43352.getClass(), "clientProperties", null);
        setField(term43352, term43352.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term43352, term43352.getClass(), "autoscrolls", false);
        setField(term43352, term43352.getClass(), "border", null);
        setIntField(term43352, term43352.getClass(), "flags", 0);
        setField(term43352, term43352.getClass(), "inputVerifier", null);
        setBooleanField(term43352, term43352.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term43352, term43352.getClass(), "paintingChild", null);
        setField(term43352, term43352.getClass(), "popupMenu", null);
        setField(term43352, term43352.getClass(), "revalidateRunnableScheduled", null);
        setField(term43352, term43352.getClass(), "focusInputMap", null);
        setField(term43352, term43352.getClass(), "ancestorInputMap", null);
        setField(term43352, term43352.getClass(), "windowInputMap", null);
        setField(term43352, term43352.getClass(), "actionMap", null);
        setField(term43352, term43352.getClass(), "aaHint", null);
        setField(term43352, term43352.getClass(), "lcdRenderingHint", null);
        setField(term43352, term43352.getClass(), "component", null);
        setField(term43352, term43352.getClass(), "layoutMgr", null);
        setField(term43352, term43352.getClass(), "dispatcher", null);
        setField(term43352, term43352.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term43352, term43352.getClass(), "focusCycleRoot", false);
        setBooleanField(term43352, term43352.getClass(), "focusTraversalPolicyProvider", false);
        setField(term43352, term43352.getClass(), "printingThreads", null);
        setBooleanField(term43352, term43352.getClass(), "printing", false);
        setField(term43352, term43352.getClass(), "containerListener", null);
        setIntField(term43352, term43352.getClass(), "listeningChildren", 0);
        setIntField(term43352, term43352.getClass(), "listeningBoundsChildren", 0);
        setIntField(term43352, term43352.getClass(), "descendantsCount", 0);
        setField(term43352, term43352.getClass(), "preserveBackgroundColor", null);
        setIntField(term43352, term43352.getClass(), "numOfHWComponents", 0);
        setIntField(term43352, term43352.getClass(), "numOfLWComponents", 0);
        setField(term43352, term43352.getClass(), "modalComp", null);
        setField(term43352, term43352.getClass(), "modalAppContext", null);
        setIntField(term43352, term43352.getClass(), "containerSerializedDataVersion", 0);
        setField(term43352, term43352.getClass(), "peer", null);
        setField(term43352, term43352.getClass(), "parent", null);
        setField(term43352, term43352.getClass(), "appContext", null);
        setIntField(term43352, term43352.getClass(), "x", 0);
        setIntField(term43352, term43352.getClass(), "y", 0);
        setIntField(term43352, term43352.getClass(), "width", 0);
        setIntField(term43352, term43352.getClass(), "height", 0);
        setField(term43352, term43352.getClass(), "foreground", null);
        setField(term43352, term43352.getClass(), "background", null);
        setField(term43352, term43352.getClass(), "font", null);
        setField(term43352, term43352.getClass(), "peerFont", null);
        setField(term43352, term43352.getClass(), "cursor", null);
        setField(term43352, term43352.getClass(), "locale", null);
        setField(term43352, term43352.getClass(), "graphicsConfig", null);
        setField(term43352, term43352.getClass(), "bufferStrategy", null);
        setBooleanField(term43352, term43352.getClass(), "ignoreRepaint", false);
        setBooleanField(term43352, term43352.getClass(), "visible", false);
        setBooleanField(term43352, term43352.getClass(), "enabled", false);
        setBooleanField(term43352, term43352.getClass(), "valid", false);
        setField(term43352, term43352.getClass(), "dropTarget", null);
        setField(term43352, term43352.getClass(), "popups", null);
        setField(term43352, term43352.getClass(), "name", null);
        setBooleanField(term43352, term43352.getClass(), "nameExplicitlySet", false);
        setBooleanField(term43352, term43352.getClass(), "focusable", false);
        setIntField(term43352, term43352.getClass(), "isFocusTraversableOverridden", 0);
        setField(term43352, term43352.getClass(), "focusTraversalKeys", null);
        setBooleanField(term43352, term43352.getClass(), "focusTraversalKeysEnabled", false);
        setField(term43352, term43352.getClass(), "acc", null);
        setField(term43352, term43352.getClass(), "minSize", null);
        setBooleanField(term43352, term43352.getClass(), "minSizeSet", false);
        setField(term43352, term43352.getClass(), "prefSize", null);
        setBooleanField(term43352, term43352.getClass(), "prefSizeSet", false);
        setField(term43352, term43352.getClass(), "maxSize", null);
        setBooleanField(term43352, term43352.getClass(), "maxSizeSet", false);
        setField(term43352, term43352.getClass(), "componentOrientation", null);
        setBooleanField(term43352, term43352.getClass(), "newEventsOnly", false);
        setField(term43352, term43352.getClass(), "componentListener", null);
        setField(term43352, term43352.getClass(), "focusListener", null);
        setField(term43352, term43352.getClass(), "hierarchyListener", null);
        setField(term43352, term43352.getClass(), "hierarchyBoundsListener", null);
        setField(term43352, term43352.getClass(), "keyListener", null);
        setField(term43352, term43352.getClass(), "mouseListener", null);
        setField(term43352, term43352.getClass(), "mouseMotionListener", null);
        setField(term43352, term43352.getClass(), "mouseWheelListener", null);
        setField(term43352, term43352.getClass(), "inputMethodListener", null);
        setLongField(term43352, term43352.getClass(), "eventMask", 0L);
        setField(term43352, term43352.getClass(), "changeSupport", null);
        setField(term43352, term43352.getClass(), "objectLock", null);
        setBooleanField(term43352, term43352.getClass(), "isPacked", false);
        setIntField(term43352, term43352.getClass(), "boundsOp", 0);
        setField(term43352, term43352.getClass(), "compoundShape", null);
        setField(term43352, term43352.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term43352, term43352.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term43352, term43352.getClass(), "backgroundEraseDisabled", false);
        setField(term43352, term43352.getClass(), "eventCache", null);
        setBooleanField(term43352, term43352.getClass(), "coalescingEnabled", false);
        setBooleanField(term43352, term43352.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term43352, term43352.getClass(), "componentSerializedDataVersion", 0);
        setField(term43352, term43352.getClass(), "accessibleContext", null);
        term43394 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term43394;
        callMethod(klass, "updatePanel", argTypes, term43352, args);
    }

};


