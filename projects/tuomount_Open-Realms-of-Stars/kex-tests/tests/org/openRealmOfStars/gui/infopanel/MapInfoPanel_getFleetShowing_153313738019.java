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

public class MapInfoPanel_getFleetShowing_153313738019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43226;

    public MapInfoPanel_getFleetShowing_153313738019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43226 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel"));
        setField(term43226, term43226.getClass(), "imageLabel", null);
        setField(term43226, term43226.getClass(), "textArea", null);
        setField(term43226, term43226.getClass(), "planet", null);
        setBooleanField(term43226, term43226.getClass(), "activeScanned", false);
        setField(term43226, term43226.getClass(), "fleet", null);
        setField(term43226, term43226.getClass(), "tile", null);
        setField(term43226, term43226.getClass(), "fleetOwner", null);
        setField(term43226, term43226.getClass(), "viewBtn", null);
        setField(term43226, term43226.getClass(), "defendBtn", null);
        setField(term43226, term43226.getClass(), "fixTradeFleetBtn", null);
        setField(term43226, term43226.getClass(), "routeBtn", null);
        setField(term43226, term43226.getClass(), "moveBtn", null);
        setField(term43226, term43226.getClass(), "focusBtn", null);
        setField(term43226, term43226.getClass(), "border", null);
        setBooleanField(term43226, term43226.getClass(), "isAlignmentXSet", false);
        setFloatField(term43226, term43226.getClass(), "alignmentX", 0.0F);
        setBooleanField(term43226, term43226.getClass(), "isAlignmentYSet", false);
        setFloatField(term43226, term43226.getClass(), "alignmentY", 0.0F);
        setField(term43226, term43226.getClass(), "ui", null);
        setField(term43226, term43226.getClass(), "listenerList", null);
        setField(term43226, term43226.getClass(), "clientProperties", null);
        setField(term43226, term43226.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term43226, term43226.getClass(), "autoscrolls", false);
        setField(term43226, term43226.getClass(), "border", null);
        setIntField(term43226, term43226.getClass(), "flags", 0);
        setField(term43226, term43226.getClass(), "inputVerifier", null);
        setBooleanField(term43226, term43226.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term43226, term43226.getClass(), "paintingChild", null);
        setField(term43226, term43226.getClass(), "popupMenu", null);
        setField(term43226, term43226.getClass(), "revalidateRunnableScheduled", null);
        setField(term43226, term43226.getClass(), "focusInputMap", null);
        setField(term43226, term43226.getClass(), "ancestorInputMap", null);
        setField(term43226, term43226.getClass(), "windowInputMap", null);
        setField(term43226, term43226.getClass(), "actionMap", null);
        setField(term43226, term43226.getClass(), "aaHint", null);
        setField(term43226, term43226.getClass(), "lcdRenderingHint", null);
        setField(term43226, term43226.getClass(), "component", null);
        setField(term43226, term43226.getClass(), "layoutMgr", null);
        setField(term43226, term43226.getClass(), "dispatcher", null);
        setField(term43226, term43226.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term43226, term43226.getClass(), "focusCycleRoot", false);
        setBooleanField(term43226, term43226.getClass(), "focusTraversalPolicyProvider", false);
        setField(term43226, term43226.getClass(), "printingThreads", null);
        setBooleanField(term43226, term43226.getClass(), "printing", false);
        setField(term43226, term43226.getClass(), "containerListener", null);
        setIntField(term43226, term43226.getClass(), "listeningChildren", 0);
        setIntField(term43226, term43226.getClass(), "listeningBoundsChildren", 0);
        setIntField(term43226, term43226.getClass(), "descendantsCount", 0);
        setField(term43226, term43226.getClass(), "preserveBackgroundColor", null);
        setIntField(term43226, term43226.getClass(), "numOfHWComponents", 0);
        setIntField(term43226, term43226.getClass(), "numOfLWComponents", 0);
        setField(term43226, term43226.getClass(), "modalComp", null);
        setField(term43226, term43226.getClass(), "modalAppContext", null);
        setIntField(term43226, term43226.getClass(), "containerSerializedDataVersion", 0);
        setField(term43226, term43226.getClass(), "peer", null);
        setField(term43226, term43226.getClass(), "parent", null);
        setField(term43226, term43226.getClass(), "appContext", null);
        setIntField(term43226, term43226.getClass(), "x", 0);
        setIntField(term43226, term43226.getClass(), "y", 0);
        setIntField(term43226, term43226.getClass(), "width", 0);
        setIntField(term43226, term43226.getClass(), "height", 0);
        setField(term43226, term43226.getClass(), "foreground", null);
        setField(term43226, term43226.getClass(), "background", null);
        setField(term43226, term43226.getClass(), "font", null);
        setField(term43226, term43226.getClass(), "peerFont", null);
        setField(term43226, term43226.getClass(), "cursor", null);
        setField(term43226, term43226.getClass(), "locale", null);
        setField(term43226, term43226.getClass(), "graphicsConfig", null);
        setField(term43226, term43226.getClass(), "bufferStrategy", null);
        setBooleanField(term43226, term43226.getClass(), "ignoreRepaint", false);
        setBooleanField(term43226, term43226.getClass(), "visible", false);
        setBooleanField(term43226, term43226.getClass(), "enabled", false);
        setBooleanField(term43226, term43226.getClass(), "valid", false);
        setField(term43226, term43226.getClass(), "dropTarget", null);
        setField(term43226, term43226.getClass(), "popups", null);
        setField(term43226, term43226.getClass(), "name", null);
        setBooleanField(term43226, term43226.getClass(), "nameExplicitlySet", false);
        setBooleanField(term43226, term43226.getClass(), "focusable", false);
        setIntField(term43226, term43226.getClass(), "isFocusTraversableOverridden", 0);
        setField(term43226, term43226.getClass(), "focusTraversalKeys", null);
        setBooleanField(term43226, term43226.getClass(), "focusTraversalKeysEnabled", false);
        setField(term43226, term43226.getClass(), "acc", null);
        setField(term43226, term43226.getClass(), "minSize", null);
        setBooleanField(term43226, term43226.getClass(), "minSizeSet", false);
        setField(term43226, term43226.getClass(), "prefSize", null);
        setBooleanField(term43226, term43226.getClass(), "prefSizeSet", false);
        setField(term43226, term43226.getClass(), "maxSize", null);
        setBooleanField(term43226, term43226.getClass(), "maxSizeSet", false);
        setField(term43226, term43226.getClass(), "componentOrientation", null);
        setBooleanField(term43226, term43226.getClass(), "newEventsOnly", false);
        setField(term43226, term43226.getClass(), "componentListener", null);
        setField(term43226, term43226.getClass(), "focusListener", null);
        setField(term43226, term43226.getClass(), "hierarchyListener", null);
        setField(term43226, term43226.getClass(), "hierarchyBoundsListener", null);
        setField(term43226, term43226.getClass(), "keyListener", null);
        setField(term43226, term43226.getClass(), "mouseListener", null);
        setField(term43226, term43226.getClass(), "mouseMotionListener", null);
        setField(term43226, term43226.getClass(), "mouseWheelListener", null);
        setField(term43226, term43226.getClass(), "inputMethodListener", null);
        setLongField(term43226, term43226.getClass(), "eventMask", 0L);
        setField(term43226, term43226.getClass(), "changeSupport", null);
        setField(term43226, term43226.getClass(), "objectLock", null);
        setBooleanField(term43226, term43226.getClass(), "isPacked", false);
        setIntField(term43226, term43226.getClass(), "boundsOp", 0);
        setField(term43226, term43226.getClass(), "compoundShape", null);
        setField(term43226, term43226.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term43226, term43226.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term43226, term43226.getClass(), "backgroundEraseDisabled", false);
        setField(term43226, term43226.getClass(), "eventCache", null);
        setBooleanField(term43226, term43226.getClass(), "coalescingEnabled", false);
        setBooleanField(term43226, term43226.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term43226, term43226.getClass(), "componentSerializedDataVersion", 0);
        setField(term43226, term43226.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetShowing", argTypes, term43226, args);
    }

};


