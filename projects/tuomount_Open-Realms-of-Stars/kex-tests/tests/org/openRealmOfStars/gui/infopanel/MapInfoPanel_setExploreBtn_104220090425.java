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

public class MapInfoPanel_setExploreBtn_104220090425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43480;

    public MapInfoPanel_setExploreBtn_104220090425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43480 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel"));
        setField(term43480, term43480.getClass(), "imageLabel", null);
        setField(term43480, term43480.getClass(), "textArea", null);
        setField(term43480, term43480.getClass(), "planet", null);
        setBooleanField(term43480, term43480.getClass(), "activeScanned", false);
        setField(term43480, term43480.getClass(), "fleet", null);
        setField(term43480, term43480.getClass(), "tile", null);
        setField(term43480, term43480.getClass(), "fleetOwner", null);
        setField(term43480, term43480.getClass(), "viewBtn", null);
        setField(term43480, term43480.getClass(), "defendBtn", null);
        setField(term43480, term43480.getClass(), "fixTradeFleetBtn", null);
        setField(term43480, term43480.getClass(), "routeBtn", null);
        setField(term43480, term43480.getClass(), "moveBtn", null);
        setField(term43480, term43480.getClass(), "focusBtn", null);
        setField(term43480, term43480.getClass(), "border", null);
        setBooleanField(term43480, term43480.getClass(), "isAlignmentXSet", false);
        setFloatField(term43480, term43480.getClass(), "alignmentX", 0.0F);
        setBooleanField(term43480, term43480.getClass(), "isAlignmentYSet", false);
        setFloatField(term43480, term43480.getClass(), "alignmentY", 0.0F);
        setField(term43480, term43480.getClass(), "ui", null);
        setField(term43480, term43480.getClass(), "listenerList", null);
        setField(term43480, term43480.getClass(), "clientProperties", null);
        setField(term43480, term43480.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term43480, term43480.getClass(), "autoscrolls", false);
        setField(term43480, term43480.getClass(), "border", null);
        setIntField(term43480, term43480.getClass(), "flags", 0);
        setField(term43480, term43480.getClass(), "inputVerifier", null);
        setBooleanField(term43480, term43480.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term43480, term43480.getClass(), "paintingChild", null);
        setField(term43480, term43480.getClass(), "popupMenu", null);
        setField(term43480, term43480.getClass(), "revalidateRunnableScheduled", null);
        setField(term43480, term43480.getClass(), "focusInputMap", null);
        setField(term43480, term43480.getClass(), "ancestorInputMap", null);
        setField(term43480, term43480.getClass(), "windowInputMap", null);
        setField(term43480, term43480.getClass(), "actionMap", null);
        setField(term43480, term43480.getClass(), "aaHint", null);
        setField(term43480, term43480.getClass(), "lcdRenderingHint", null);
        setField(term43480, term43480.getClass(), "component", null);
        setField(term43480, term43480.getClass(), "layoutMgr", null);
        setField(term43480, term43480.getClass(), "dispatcher", null);
        setField(term43480, term43480.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term43480, term43480.getClass(), "focusCycleRoot", false);
        setBooleanField(term43480, term43480.getClass(), "focusTraversalPolicyProvider", false);
        setField(term43480, term43480.getClass(), "printingThreads", null);
        setBooleanField(term43480, term43480.getClass(), "printing", false);
        setField(term43480, term43480.getClass(), "containerListener", null);
        setIntField(term43480, term43480.getClass(), "listeningChildren", 0);
        setIntField(term43480, term43480.getClass(), "listeningBoundsChildren", 0);
        setIntField(term43480, term43480.getClass(), "descendantsCount", 0);
        setField(term43480, term43480.getClass(), "preserveBackgroundColor", null);
        setIntField(term43480, term43480.getClass(), "numOfHWComponents", 0);
        setIntField(term43480, term43480.getClass(), "numOfLWComponents", 0);
        setField(term43480, term43480.getClass(), "modalComp", null);
        setField(term43480, term43480.getClass(), "modalAppContext", null);
        setIntField(term43480, term43480.getClass(), "containerSerializedDataVersion", 0);
        setField(term43480, term43480.getClass(), "peer", null);
        setField(term43480, term43480.getClass(), "parent", null);
        setField(term43480, term43480.getClass(), "appContext", null);
        setIntField(term43480, term43480.getClass(), "x", 0);
        setIntField(term43480, term43480.getClass(), "y", 0);
        setIntField(term43480, term43480.getClass(), "width", 0);
        setIntField(term43480, term43480.getClass(), "height", 0);
        setField(term43480, term43480.getClass(), "foreground", null);
        setField(term43480, term43480.getClass(), "background", null);
        setField(term43480, term43480.getClass(), "font", null);
        setField(term43480, term43480.getClass(), "peerFont", null);
        setField(term43480, term43480.getClass(), "cursor", null);
        setField(term43480, term43480.getClass(), "locale", null);
        setField(term43480, term43480.getClass(), "graphicsConfig", null);
        setField(term43480, term43480.getClass(), "bufferStrategy", null);
        setBooleanField(term43480, term43480.getClass(), "ignoreRepaint", false);
        setBooleanField(term43480, term43480.getClass(), "visible", false);
        setBooleanField(term43480, term43480.getClass(), "enabled", false);
        setBooleanField(term43480, term43480.getClass(), "valid", false);
        setField(term43480, term43480.getClass(), "dropTarget", null);
        setField(term43480, term43480.getClass(), "popups", null);
        setField(term43480, term43480.getClass(), "name", null);
        setBooleanField(term43480, term43480.getClass(), "nameExplicitlySet", false);
        setBooleanField(term43480, term43480.getClass(), "focusable", false);
        setIntField(term43480, term43480.getClass(), "isFocusTraversableOverridden", 0);
        setField(term43480, term43480.getClass(), "focusTraversalKeys", null);
        setBooleanField(term43480, term43480.getClass(), "focusTraversalKeysEnabled", false);
        setField(term43480, term43480.getClass(), "acc", null);
        setField(term43480, term43480.getClass(), "minSize", null);
        setBooleanField(term43480, term43480.getClass(), "minSizeSet", false);
        setField(term43480, term43480.getClass(), "prefSize", null);
        setBooleanField(term43480, term43480.getClass(), "prefSizeSet", false);
        setField(term43480, term43480.getClass(), "maxSize", null);
        setBooleanField(term43480, term43480.getClass(), "maxSizeSet", false);
        setField(term43480, term43480.getClass(), "componentOrientation", null);
        setBooleanField(term43480, term43480.getClass(), "newEventsOnly", false);
        setField(term43480, term43480.getClass(), "componentListener", null);
        setField(term43480, term43480.getClass(), "focusListener", null);
        setField(term43480, term43480.getClass(), "hierarchyListener", null);
        setField(term43480, term43480.getClass(), "hierarchyBoundsListener", null);
        setField(term43480, term43480.getClass(), "keyListener", null);
        setField(term43480, term43480.getClass(), "mouseListener", null);
        setField(term43480, term43480.getClass(), "mouseMotionListener", null);
        setField(term43480, term43480.getClass(), "mouseWheelListener", null);
        setField(term43480, term43480.getClass(), "inputMethodListener", null);
        setLongField(term43480, term43480.getClass(), "eventMask", 0L);
        setField(term43480, term43480.getClass(), "changeSupport", null);
        setField(term43480, term43480.getClass(), "objectLock", null);
        setBooleanField(term43480, term43480.getClass(), "isPacked", false);
        setIntField(term43480, term43480.getClass(), "boundsOp", 0);
        setField(term43480, term43480.getClass(), "compoundShape", null);
        setField(term43480, term43480.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term43480, term43480.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term43480, term43480.getClass(), "backgroundEraseDisabled", false);
        setField(term43480, term43480.getClass(), "eventCache", null);
        setBooleanField(term43480, term43480.getClass(), "coalescingEnabled", false);
        setBooleanField(term43480, term43480.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term43480, term43480.getClass(), "componentSerializedDataVersion", 0);
        setField(term43480, term43480.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setExploreBtn", argTypes, term43480, args);
    }

};


