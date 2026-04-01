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

public class MapInfoPanel_setTradeBtn_71469543124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43438;

    public MapInfoPanel_setTradeBtn_71469543124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43438 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel"));
        setField(term43438, term43438.getClass(), "imageLabel", null);
        setField(term43438, term43438.getClass(), "textArea", null);
        setField(term43438, term43438.getClass(), "planet", null);
        setBooleanField(term43438, term43438.getClass(), "activeScanned", false);
        setField(term43438, term43438.getClass(), "fleet", null);
        setField(term43438, term43438.getClass(), "tile", null);
        setField(term43438, term43438.getClass(), "fleetOwner", null);
        setField(term43438, term43438.getClass(), "viewBtn", null);
        setField(term43438, term43438.getClass(), "defendBtn", null);
        setField(term43438, term43438.getClass(), "fixTradeFleetBtn", null);
        setField(term43438, term43438.getClass(), "routeBtn", null);
        setField(term43438, term43438.getClass(), "moveBtn", null);
        setField(term43438, term43438.getClass(), "focusBtn", null);
        setField(term43438, term43438.getClass(), "border", null);
        setBooleanField(term43438, term43438.getClass(), "isAlignmentXSet", false);
        setFloatField(term43438, term43438.getClass(), "alignmentX", 0.0F);
        setBooleanField(term43438, term43438.getClass(), "isAlignmentYSet", false);
        setFloatField(term43438, term43438.getClass(), "alignmentY", 0.0F);
        setField(term43438, term43438.getClass(), "ui", null);
        setField(term43438, term43438.getClass(), "listenerList", null);
        setField(term43438, term43438.getClass(), "clientProperties", null);
        setField(term43438, term43438.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term43438, term43438.getClass(), "autoscrolls", false);
        setField(term43438, term43438.getClass(), "border", null);
        setIntField(term43438, term43438.getClass(), "flags", 0);
        setField(term43438, term43438.getClass(), "inputVerifier", null);
        setBooleanField(term43438, term43438.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term43438, term43438.getClass(), "paintingChild", null);
        setField(term43438, term43438.getClass(), "popupMenu", null);
        setField(term43438, term43438.getClass(), "revalidateRunnableScheduled", null);
        setField(term43438, term43438.getClass(), "focusInputMap", null);
        setField(term43438, term43438.getClass(), "ancestorInputMap", null);
        setField(term43438, term43438.getClass(), "windowInputMap", null);
        setField(term43438, term43438.getClass(), "actionMap", null);
        setField(term43438, term43438.getClass(), "aaHint", null);
        setField(term43438, term43438.getClass(), "lcdRenderingHint", null);
        setField(term43438, term43438.getClass(), "component", null);
        setField(term43438, term43438.getClass(), "layoutMgr", null);
        setField(term43438, term43438.getClass(), "dispatcher", null);
        setField(term43438, term43438.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term43438, term43438.getClass(), "focusCycleRoot", false);
        setBooleanField(term43438, term43438.getClass(), "focusTraversalPolicyProvider", false);
        setField(term43438, term43438.getClass(), "printingThreads", null);
        setBooleanField(term43438, term43438.getClass(), "printing", false);
        setField(term43438, term43438.getClass(), "containerListener", null);
        setIntField(term43438, term43438.getClass(), "listeningChildren", 0);
        setIntField(term43438, term43438.getClass(), "listeningBoundsChildren", 0);
        setIntField(term43438, term43438.getClass(), "descendantsCount", 0);
        setField(term43438, term43438.getClass(), "preserveBackgroundColor", null);
        setIntField(term43438, term43438.getClass(), "numOfHWComponents", 0);
        setIntField(term43438, term43438.getClass(), "numOfLWComponents", 0);
        setField(term43438, term43438.getClass(), "modalComp", null);
        setField(term43438, term43438.getClass(), "modalAppContext", null);
        setIntField(term43438, term43438.getClass(), "containerSerializedDataVersion", 0);
        setField(term43438, term43438.getClass(), "peer", null);
        setField(term43438, term43438.getClass(), "parent", null);
        setField(term43438, term43438.getClass(), "appContext", null);
        setIntField(term43438, term43438.getClass(), "x", 0);
        setIntField(term43438, term43438.getClass(), "y", 0);
        setIntField(term43438, term43438.getClass(), "width", 0);
        setIntField(term43438, term43438.getClass(), "height", 0);
        setField(term43438, term43438.getClass(), "foreground", null);
        setField(term43438, term43438.getClass(), "background", null);
        setField(term43438, term43438.getClass(), "font", null);
        setField(term43438, term43438.getClass(), "peerFont", null);
        setField(term43438, term43438.getClass(), "cursor", null);
        setField(term43438, term43438.getClass(), "locale", null);
        setField(term43438, term43438.getClass(), "graphicsConfig", null);
        setField(term43438, term43438.getClass(), "bufferStrategy", null);
        setBooleanField(term43438, term43438.getClass(), "ignoreRepaint", false);
        setBooleanField(term43438, term43438.getClass(), "visible", false);
        setBooleanField(term43438, term43438.getClass(), "enabled", false);
        setBooleanField(term43438, term43438.getClass(), "valid", false);
        setField(term43438, term43438.getClass(), "dropTarget", null);
        setField(term43438, term43438.getClass(), "popups", null);
        setField(term43438, term43438.getClass(), "name", null);
        setBooleanField(term43438, term43438.getClass(), "nameExplicitlySet", false);
        setBooleanField(term43438, term43438.getClass(), "focusable", false);
        setIntField(term43438, term43438.getClass(), "isFocusTraversableOverridden", 0);
        setField(term43438, term43438.getClass(), "focusTraversalKeys", null);
        setBooleanField(term43438, term43438.getClass(), "focusTraversalKeysEnabled", false);
        setField(term43438, term43438.getClass(), "acc", null);
        setField(term43438, term43438.getClass(), "minSize", null);
        setBooleanField(term43438, term43438.getClass(), "minSizeSet", false);
        setField(term43438, term43438.getClass(), "prefSize", null);
        setBooleanField(term43438, term43438.getClass(), "prefSizeSet", false);
        setField(term43438, term43438.getClass(), "maxSize", null);
        setBooleanField(term43438, term43438.getClass(), "maxSizeSet", false);
        setField(term43438, term43438.getClass(), "componentOrientation", null);
        setBooleanField(term43438, term43438.getClass(), "newEventsOnly", false);
        setField(term43438, term43438.getClass(), "componentListener", null);
        setField(term43438, term43438.getClass(), "focusListener", null);
        setField(term43438, term43438.getClass(), "hierarchyListener", null);
        setField(term43438, term43438.getClass(), "hierarchyBoundsListener", null);
        setField(term43438, term43438.getClass(), "keyListener", null);
        setField(term43438, term43438.getClass(), "mouseListener", null);
        setField(term43438, term43438.getClass(), "mouseMotionListener", null);
        setField(term43438, term43438.getClass(), "mouseWheelListener", null);
        setField(term43438, term43438.getClass(), "inputMethodListener", null);
        setLongField(term43438, term43438.getClass(), "eventMask", 0L);
        setField(term43438, term43438.getClass(), "changeSupport", null);
        setField(term43438, term43438.getClass(), "objectLock", null);
        setBooleanField(term43438, term43438.getClass(), "isPacked", false);
        setIntField(term43438, term43438.getClass(), "boundsOp", 0);
        setField(term43438, term43438.getClass(), "compoundShape", null);
        setField(term43438, term43438.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term43438, term43438.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term43438, term43438.getClass(), "backgroundEraseDisabled", false);
        setField(term43438, term43438.getClass(), "eventCache", null);
        setBooleanField(term43438, term43438.getClass(), "coalescingEnabled", false);
        setBooleanField(term43438, term43438.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term43438, term43438.getClass(), "componentSerializedDataVersion", 0);
        setField(term43438, term43438.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setTradeBtn", argTypes, term43438, args);
    }

};


