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

public class MapInfoPanel_getFixTradeBtn_186593648727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43564;

    public MapInfoPanel_getFixTradeBtn_186593648727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43564 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel"));
        setField(term43564, term43564.getClass(), "imageLabel", null);
        setField(term43564, term43564.getClass(), "textArea", null);
        setField(term43564, term43564.getClass(), "planet", null);
        setBooleanField(term43564, term43564.getClass(), "activeScanned", false);
        setField(term43564, term43564.getClass(), "fleet", null);
        setField(term43564, term43564.getClass(), "tile", null);
        setField(term43564, term43564.getClass(), "fleetOwner", null);
        setField(term43564, term43564.getClass(), "viewBtn", null);
        setField(term43564, term43564.getClass(), "defendBtn", null);
        setField(term43564, term43564.getClass(), "fixTradeFleetBtn", null);
        setField(term43564, term43564.getClass(), "routeBtn", null);
        setField(term43564, term43564.getClass(), "moveBtn", null);
        setField(term43564, term43564.getClass(), "focusBtn", null);
        setField(term43564, term43564.getClass(), "border", null);
        setBooleanField(term43564, term43564.getClass(), "isAlignmentXSet", false);
        setFloatField(term43564, term43564.getClass(), "alignmentX", 0.0F);
        setBooleanField(term43564, term43564.getClass(), "isAlignmentYSet", false);
        setFloatField(term43564, term43564.getClass(), "alignmentY", 0.0F);
        setField(term43564, term43564.getClass(), "ui", null);
        setField(term43564, term43564.getClass(), "listenerList", null);
        setField(term43564, term43564.getClass(), "clientProperties", null);
        setField(term43564, term43564.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term43564, term43564.getClass(), "autoscrolls", false);
        setField(term43564, term43564.getClass(), "border", null);
        setIntField(term43564, term43564.getClass(), "flags", 0);
        setField(term43564, term43564.getClass(), "inputVerifier", null);
        setBooleanField(term43564, term43564.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term43564, term43564.getClass(), "paintingChild", null);
        setField(term43564, term43564.getClass(), "popupMenu", null);
        setField(term43564, term43564.getClass(), "revalidateRunnableScheduled", null);
        setField(term43564, term43564.getClass(), "focusInputMap", null);
        setField(term43564, term43564.getClass(), "ancestorInputMap", null);
        setField(term43564, term43564.getClass(), "windowInputMap", null);
        setField(term43564, term43564.getClass(), "actionMap", null);
        setField(term43564, term43564.getClass(), "aaHint", null);
        setField(term43564, term43564.getClass(), "lcdRenderingHint", null);
        setField(term43564, term43564.getClass(), "component", null);
        setField(term43564, term43564.getClass(), "layoutMgr", null);
        setField(term43564, term43564.getClass(), "dispatcher", null);
        setField(term43564, term43564.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term43564, term43564.getClass(), "focusCycleRoot", false);
        setBooleanField(term43564, term43564.getClass(), "focusTraversalPolicyProvider", false);
        setField(term43564, term43564.getClass(), "printingThreads", null);
        setBooleanField(term43564, term43564.getClass(), "printing", false);
        setField(term43564, term43564.getClass(), "containerListener", null);
        setIntField(term43564, term43564.getClass(), "listeningChildren", 0);
        setIntField(term43564, term43564.getClass(), "listeningBoundsChildren", 0);
        setIntField(term43564, term43564.getClass(), "descendantsCount", 0);
        setField(term43564, term43564.getClass(), "preserveBackgroundColor", null);
        setIntField(term43564, term43564.getClass(), "numOfHWComponents", 0);
        setIntField(term43564, term43564.getClass(), "numOfLWComponents", 0);
        setField(term43564, term43564.getClass(), "modalComp", null);
        setField(term43564, term43564.getClass(), "modalAppContext", null);
        setIntField(term43564, term43564.getClass(), "containerSerializedDataVersion", 0);
        setField(term43564, term43564.getClass(), "peer", null);
        setField(term43564, term43564.getClass(), "parent", null);
        setField(term43564, term43564.getClass(), "appContext", null);
        setIntField(term43564, term43564.getClass(), "x", 0);
        setIntField(term43564, term43564.getClass(), "y", 0);
        setIntField(term43564, term43564.getClass(), "width", 0);
        setIntField(term43564, term43564.getClass(), "height", 0);
        setField(term43564, term43564.getClass(), "foreground", null);
        setField(term43564, term43564.getClass(), "background", null);
        setField(term43564, term43564.getClass(), "font", null);
        setField(term43564, term43564.getClass(), "peerFont", null);
        setField(term43564, term43564.getClass(), "cursor", null);
        setField(term43564, term43564.getClass(), "locale", null);
        setField(term43564, term43564.getClass(), "graphicsConfig", null);
        setField(term43564, term43564.getClass(), "bufferStrategy", null);
        setBooleanField(term43564, term43564.getClass(), "ignoreRepaint", false);
        setBooleanField(term43564, term43564.getClass(), "visible", false);
        setBooleanField(term43564, term43564.getClass(), "enabled", false);
        setBooleanField(term43564, term43564.getClass(), "valid", false);
        setField(term43564, term43564.getClass(), "dropTarget", null);
        setField(term43564, term43564.getClass(), "popups", null);
        setField(term43564, term43564.getClass(), "name", null);
        setBooleanField(term43564, term43564.getClass(), "nameExplicitlySet", false);
        setBooleanField(term43564, term43564.getClass(), "focusable", false);
        setIntField(term43564, term43564.getClass(), "isFocusTraversableOverridden", 0);
        setField(term43564, term43564.getClass(), "focusTraversalKeys", null);
        setBooleanField(term43564, term43564.getClass(), "focusTraversalKeysEnabled", false);
        setField(term43564, term43564.getClass(), "acc", null);
        setField(term43564, term43564.getClass(), "minSize", null);
        setBooleanField(term43564, term43564.getClass(), "minSizeSet", false);
        setField(term43564, term43564.getClass(), "prefSize", null);
        setBooleanField(term43564, term43564.getClass(), "prefSizeSet", false);
        setField(term43564, term43564.getClass(), "maxSize", null);
        setBooleanField(term43564, term43564.getClass(), "maxSizeSet", false);
        setField(term43564, term43564.getClass(), "componentOrientation", null);
        setBooleanField(term43564, term43564.getClass(), "newEventsOnly", false);
        setField(term43564, term43564.getClass(), "componentListener", null);
        setField(term43564, term43564.getClass(), "focusListener", null);
        setField(term43564, term43564.getClass(), "hierarchyListener", null);
        setField(term43564, term43564.getClass(), "hierarchyBoundsListener", null);
        setField(term43564, term43564.getClass(), "keyListener", null);
        setField(term43564, term43564.getClass(), "mouseListener", null);
        setField(term43564, term43564.getClass(), "mouseMotionListener", null);
        setField(term43564, term43564.getClass(), "mouseWheelListener", null);
        setField(term43564, term43564.getClass(), "inputMethodListener", null);
        setLongField(term43564, term43564.getClass(), "eventMask", 0L);
        setField(term43564, term43564.getClass(), "changeSupport", null);
        setField(term43564, term43564.getClass(), "objectLock", null);
        setBooleanField(term43564, term43564.getClass(), "isPacked", false);
        setIntField(term43564, term43564.getClass(), "boundsOp", 0);
        setField(term43564, term43564.getClass(), "compoundShape", null);
        setField(term43564, term43564.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term43564, term43564.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term43564, term43564.getClass(), "backgroundEraseDisabled", false);
        setField(term43564, term43564.getClass(), "eventCache", null);
        setBooleanField(term43564, term43564.getClass(), "coalescingEnabled", false);
        setBooleanField(term43564, term43564.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term43564, term43564.getClass(), "componentSerializedDataVersion", 0);
        setField(term43564, term43564.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFixTradeBtn", argTypes, term43564, args);
    }

};


