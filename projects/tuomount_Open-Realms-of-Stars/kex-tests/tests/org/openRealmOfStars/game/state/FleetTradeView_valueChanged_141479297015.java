package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FleetTradeView_valueChanged_141479297015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741463;

    public FleetTradeView_valueChanged_141479297015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term741463 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetTradeView"));
        setField(term741463, term741463.getClass(), "planet", null);
        setField(term741463, term741463.getClass(), "fleet", null);
        setField(term741463, term741463.getClass(), "info", null);
        setField(term741463, term741463.getClass(), "imgBase", null);
        setField(term741463, term741463.getClass(), "starMap", null);
        setField(term741463, term741463.getClass(), "ownerLabel", null);
        setField(term741463, term741463.getClass(), "totalPeople", null);
        setField(term741463, term741463.getClass(), "metal", null);
        setField(term741463, term741463.getClass(), "fleetNameText", null);
        setField(term741463, term741463.getClass(), "fleetList", null);
        setField(term741463, term741463.getClass(), "tradeRoutes", null);
        setBooleanField(term741463, term741463.getClass(), "isAlignmentXSet", false);
        setFloatField(term741463, term741463.getClass(), "alignmentX", 0.0F);
        setBooleanField(term741463, term741463.getClass(), "isAlignmentYSet", false);
        setFloatField(term741463, term741463.getClass(), "alignmentY", 0.0F);
        setField(term741463, term741463.getClass(), "ui", null);
        setField(term741463, term741463.getClass(), "listenerList", null);
        setField(term741463, term741463.getClass(), "clientProperties", null);
        setField(term741463, term741463.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term741463, term741463.getClass(), "autoscrolls", false);
        setField(term741463, term741463.getClass(), "border", null);
        setIntField(term741463, term741463.getClass(), "flags", 0);
        setField(term741463, term741463.getClass(), "inputVerifier", null);
        setBooleanField(term741463, term741463.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term741463, term741463.getClass(), "paintingChild", null);
        setField(term741463, term741463.getClass(), "popupMenu", null);
        setField(term741463, term741463.getClass(), "revalidateRunnableScheduled", null);
        setField(term741463, term741463.getClass(), "focusInputMap", null);
        setField(term741463, term741463.getClass(), "ancestorInputMap", null);
        setField(term741463, term741463.getClass(), "windowInputMap", null);
        setField(term741463, term741463.getClass(), "actionMap", null);
        setField(term741463, term741463.getClass(), "aaHint", null);
        setField(term741463, term741463.getClass(), "lcdRenderingHint", null);
        setField(term741463, term741463.getClass(), "component", null);
        setField(term741463, term741463.getClass(), "layoutMgr", null);
        setField(term741463, term741463.getClass(), "dispatcher", null);
        setField(term741463, term741463.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term741463, term741463.getClass(), "focusCycleRoot", false);
        setBooleanField(term741463, term741463.getClass(), "focusTraversalPolicyProvider", false);
        setField(term741463, term741463.getClass(), "printingThreads", null);
        setBooleanField(term741463, term741463.getClass(), "printing", false);
        setField(term741463, term741463.getClass(), "containerListener", null);
        setIntField(term741463, term741463.getClass(), "listeningChildren", 0);
        setIntField(term741463, term741463.getClass(), "listeningBoundsChildren", 0);
        setIntField(term741463, term741463.getClass(), "descendantsCount", 0);
        setField(term741463, term741463.getClass(), "preserveBackgroundColor", null);
        setIntField(term741463, term741463.getClass(), "numOfHWComponents", 0);
        setIntField(term741463, term741463.getClass(), "numOfLWComponents", 0);
        setField(term741463, term741463.getClass(), "modalComp", null);
        setField(term741463, term741463.getClass(), "modalAppContext", null);
        setIntField(term741463, term741463.getClass(), "containerSerializedDataVersion", 0);
        setField(term741463, term741463.getClass(), "peer", null);
        setField(term741463, term741463.getClass(), "parent", null);
        setField(term741463, term741463.getClass(), "appContext", null);
        setIntField(term741463, term741463.getClass(), "x", 0);
        setIntField(term741463, term741463.getClass(), "y", 0);
        setIntField(term741463, term741463.getClass(), "width", 0);
        setIntField(term741463, term741463.getClass(), "height", 0);
        setField(term741463, term741463.getClass(), "foreground", null);
        setField(term741463, term741463.getClass(), "background", null);
        setField(term741463, term741463.getClass(), "font", null);
        setField(term741463, term741463.getClass(), "peerFont", null);
        setField(term741463, term741463.getClass(), "cursor", null);
        setField(term741463, term741463.getClass(), "locale", null);
        setField(term741463, term741463.getClass(), "graphicsConfig", null);
        setField(term741463, term741463.getClass(), "bufferStrategy", null);
        setBooleanField(term741463, term741463.getClass(), "ignoreRepaint", false);
        setBooleanField(term741463, term741463.getClass(), "visible", false);
        setBooleanField(term741463, term741463.getClass(), "enabled", false);
        setBooleanField(term741463, term741463.getClass(), "valid", false);
        setField(term741463, term741463.getClass(), "dropTarget", null);
        setField(term741463, term741463.getClass(), "popups", null);
        setField(term741463, term741463.getClass(), "name", null);
        setBooleanField(term741463, term741463.getClass(), "nameExplicitlySet", false);
        setBooleanField(term741463, term741463.getClass(), "focusable", false);
        setIntField(term741463, term741463.getClass(), "isFocusTraversableOverridden", 0);
        setField(term741463, term741463.getClass(), "focusTraversalKeys", null);
        setBooleanField(term741463, term741463.getClass(), "focusTraversalKeysEnabled", false);
        setField(term741463, term741463.getClass(), "acc", null);
        setField(term741463, term741463.getClass(), "minSize", null);
        setBooleanField(term741463, term741463.getClass(), "minSizeSet", false);
        setField(term741463, term741463.getClass(), "prefSize", null);
        setBooleanField(term741463, term741463.getClass(), "prefSizeSet", false);
        setField(term741463, term741463.getClass(), "maxSize", null);
        setBooleanField(term741463, term741463.getClass(), "maxSizeSet", false);
        setField(term741463, term741463.getClass(), "componentOrientation", null);
        setBooleanField(term741463, term741463.getClass(), "newEventsOnly", false);
        setField(term741463, term741463.getClass(), "componentListener", null);
        setField(term741463, term741463.getClass(), "focusListener", null);
        setField(term741463, term741463.getClass(), "hierarchyListener", null);
        setField(term741463, term741463.getClass(), "hierarchyBoundsListener", null);
        setField(term741463, term741463.getClass(), "keyListener", null);
        setField(term741463, term741463.getClass(), "mouseListener", null);
        setField(term741463, term741463.getClass(), "mouseMotionListener", null);
        setField(term741463, term741463.getClass(), "mouseWheelListener", null);
        setField(term741463, term741463.getClass(), "inputMethodListener", null);
        setLongField(term741463, term741463.getClass(), "eventMask", 0L);
        setField(term741463, term741463.getClass(), "changeSupport", null);
        setField(term741463, term741463.getClass(), "objectLock", null);
        setBooleanField(term741463, term741463.getClass(), "isPacked", false);
        setIntField(term741463, term741463.getClass(), "boundsOp", 0);
        setField(term741463, term741463.getClass(), "compoundShape", null);
        setField(term741463, term741463.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term741463, term741463.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term741463, term741463.getClass(), "backgroundEraseDisabled", false);
        setField(term741463, term741463.getClass(), "eventCache", null);
        setBooleanField(term741463, term741463.getClass(), "coalescingEnabled", false);
        setBooleanField(term741463, term741463.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term741463, term741463.getClass(), "componentSerializedDataVersion", 0);
        setField(term741463, term741463.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetTradeView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.ListSelectionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "valueChanged", argTypes, term741463, args);
    }

};


