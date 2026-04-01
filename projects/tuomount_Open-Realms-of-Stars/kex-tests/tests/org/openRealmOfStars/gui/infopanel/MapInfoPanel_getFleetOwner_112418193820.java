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

public class MapInfoPanel_getFleetOwner_112418193820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43268;

    public MapInfoPanel_getFleetOwner_112418193820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43268 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel"));
        setField(term43268, term43268.getClass(), "imageLabel", null);
        setField(term43268, term43268.getClass(), "textArea", null);
        setField(term43268, term43268.getClass(), "planet", null);
        setBooleanField(term43268, term43268.getClass(), "activeScanned", false);
        setField(term43268, term43268.getClass(), "fleet", null);
        setField(term43268, term43268.getClass(), "tile", null);
        setField(term43268, term43268.getClass(), "fleetOwner", null);
        setField(term43268, term43268.getClass(), "viewBtn", null);
        setField(term43268, term43268.getClass(), "defendBtn", null);
        setField(term43268, term43268.getClass(), "fixTradeFleetBtn", null);
        setField(term43268, term43268.getClass(), "routeBtn", null);
        setField(term43268, term43268.getClass(), "moveBtn", null);
        setField(term43268, term43268.getClass(), "focusBtn", null);
        setField(term43268, term43268.getClass(), "border", null);
        setBooleanField(term43268, term43268.getClass(), "isAlignmentXSet", false);
        setFloatField(term43268, term43268.getClass(), "alignmentX", 0.0F);
        setBooleanField(term43268, term43268.getClass(), "isAlignmentYSet", false);
        setFloatField(term43268, term43268.getClass(), "alignmentY", 0.0F);
        setField(term43268, term43268.getClass(), "ui", null);
        setField(term43268, term43268.getClass(), "listenerList", null);
        setField(term43268, term43268.getClass(), "clientProperties", null);
        setField(term43268, term43268.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term43268, term43268.getClass(), "autoscrolls", false);
        setField(term43268, term43268.getClass(), "border", null);
        setIntField(term43268, term43268.getClass(), "flags", 0);
        setField(term43268, term43268.getClass(), "inputVerifier", null);
        setBooleanField(term43268, term43268.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term43268, term43268.getClass(), "paintingChild", null);
        setField(term43268, term43268.getClass(), "popupMenu", null);
        setField(term43268, term43268.getClass(), "revalidateRunnableScheduled", null);
        setField(term43268, term43268.getClass(), "focusInputMap", null);
        setField(term43268, term43268.getClass(), "ancestorInputMap", null);
        setField(term43268, term43268.getClass(), "windowInputMap", null);
        setField(term43268, term43268.getClass(), "actionMap", null);
        setField(term43268, term43268.getClass(), "aaHint", null);
        setField(term43268, term43268.getClass(), "lcdRenderingHint", null);
        setField(term43268, term43268.getClass(), "component", null);
        setField(term43268, term43268.getClass(), "layoutMgr", null);
        setField(term43268, term43268.getClass(), "dispatcher", null);
        setField(term43268, term43268.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term43268, term43268.getClass(), "focusCycleRoot", false);
        setBooleanField(term43268, term43268.getClass(), "focusTraversalPolicyProvider", false);
        setField(term43268, term43268.getClass(), "printingThreads", null);
        setBooleanField(term43268, term43268.getClass(), "printing", false);
        setField(term43268, term43268.getClass(), "containerListener", null);
        setIntField(term43268, term43268.getClass(), "listeningChildren", 0);
        setIntField(term43268, term43268.getClass(), "listeningBoundsChildren", 0);
        setIntField(term43268, term43268.getClass(), "descendantsCount", 0);
        setField(term43268, term43268.getClass(), "preserveBackgroundColor", null);
        setIntField(term43268, term43268.getClass(), "numOfHWComponents", 0);
        setIntField(term43268, term43268.getClass(), "numOfLWComponents", 0);
        setField(term43268, term43268.getClass(), "modalComp", null);
        setField(term43268, term43268.getClass(), "modalAppContext", null);
        setIntField(term43268, term43268.getClass(), "containerSerializedDataVersion", 0);
        setField(term43268, term43268.getClass(), "peer", null);
        setField(term43268, term43268.getClass(), "parent", null);
        setField(term43268, term43268.getClass(), "appContext", null);
        setIntField(term43268, term43268.getClass(), "x", 0);
        setIntField(term43268, term43268.getClass(), "y", 0);
        setIntField(term43268, term43268.getClass(), "width", 0);
        setIntField(term43268, term43268.getClass(), "height", 0);
        setField(term43268, term43268.getClass(), "foreground", null);
        setField(term43268, term43268.getClass(), "background", null);
        setField(term43268, term43268.getClass(), "font", null);
        setField(term43268, term43268.getClass(), "peerFont", null);
        setField(term43268, term43268.getClass(), "cursor", null);
        setField(term43268, term43268.getClass(), "locale", null);
        setField(term43268, term43268.getClass(), "graphicsConfig", null);
        setField(term43268, term43268.getClass(), "bufferStrategy", null);
        setBooleanField(term43268, term43268.getClass(), "ignoreRepaint", false);
        setBooleanField(term43268, term43268.getClass(), "visible", false);
        setBooleanField(term43268, term43268.getClass(), "enabled", false);
        setBooleanField(term43268, term43268.getClass(), "valid", false);
        setField(term43268, term43268.getClass(), "dropTarget", null);
        setField(term43268, term43268.getClass(), "popups", null);
        setField(term43268, term43268.getClass(), "name", null);
        setBooleanField(term43268, term43268.getClass(), "nameExplicitlySet", false);
        setBooleanField(term43268, term43268.getClass(), "focusable", false);
        setIntField(term43268, term43268.getClass(), "isFocusTraversableOverridden", 0);
        setField(term43268, term43268.getClass(), "focusTraversalKeys", null);
        setBooleanField(term43268, term43268.getClass(), "focusTraversalKeysEnabled", false);
        setField(term43268, term43268.getClass(), "acc", null);
        setField(term43268, term43268.getClass(), "minSize", null);
        setBooleanField(term43268, term43268.getClass(), "minSizeSet", false);
        setField(term43268, term43268.getClass(), "prefSize", null);
        setBooleanField(term43268, term43268.getClass(), "prefSizeSet", false);
        setField(term43268, term43268.getClass(), "maxSize", null);
        setBooleanField(term43268, term43268.getClass(), "maxSizeSet", false);
        setField(term43268, term43268.getClass(), "componentOrientation", null);
        setBooleanField(term43268, term43268.getClass(), "newEventsOnly", false);
        setField(term43268, term43268.getClass(), "componentListener", null);
        setField(term43268, term43268.getClass(), "focusListener", null);
        setField(term43268, term43268.getClass(), "hierarchyListener", null);
        setField(term43268, term43268.getClass(), "hierarchyBoundsListener", null);
        setField(term43268, term43268.getClass(), "keyListener", null);
        setField(term43268, term43268.getClass(), "mouseListener", null);
        setField(term43268, term43268.getClass(), "mouseMotionListener", null);
        setField(term43268, term43268.getClass(), "mouseWheelListener", null);
        setField(term43268, term43268.getClass(), "inputMethodListener", null);
        setLongField(term43268, term43268.getClass(), "eventMask", 0L);
        setField(term43268, term43268.getClass(), "changeSupport", null);
        setField(term43268, term43268.getClass(), "objectLock", null);
        setBooleanField(term43268, term43268.getClass(), "isPacked", false);
        setIntField(term43268, term43268.getClass(), "boundsOp", 0);
        setField(term43268, term43268.getClass(), "compoundShape", null);
        setField(term43268, term43268.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term43268, term43268.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term43268, term43268.getClass(), "backgroundEraseDisabled", false);
        setField(term43268, term43268.getClass(), "eventCache", null);
        setBooleanField(term43268, term43268.getClass(), "coalescingEnabled", false);
        setBooleanField(term43268, term43268.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term43268, term43268.getClass(), "componentSerializedDataVersion", 0);
        setField(term43268, term43268.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetOwner", argTypes, term43268, args);
    }

};


