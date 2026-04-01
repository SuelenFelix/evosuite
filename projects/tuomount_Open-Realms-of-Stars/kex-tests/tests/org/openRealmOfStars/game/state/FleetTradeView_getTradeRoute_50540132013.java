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

public class FleetTradeView_getTradeRoute_50540132013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734232;

    public FleetTradeView_getTradeRoute_50540132013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term734232 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetTradeView"));
        setField(term734232, term734232.getClass(), "planet", null);
        setField(term734232, term734232.getClass(), "fleet", null);
        setField(term734232, term734232.getClass(), "info", null);
        setField(term734232, term734232.getClass(), "imgBase", null);
        setField(term734232, term734232.getClass(), "starMap", null);
        setField(term734232, term734232.getClass(), "ownerLabel", null);
        setField(term734232, term734232.getClass(), "totalPeople", null);
        setField(term734232, term734232.getClass(), "metal", null);
        setField(term734232, term734232.getClass(), "fleetNameText", null);
        setField(term734232, term734232.getClass(), "fleetList", null);
        setField(term734232, term734232.getClass(), "tradeRoutes", null);
        setBooleanField(term734232, term734232.getClass(), "isAlignmentXSet", false);
        setFloatField(term734232, term734232.getClass(), "alignmentX", 0.0F);
        setBooleanField(term734232, term734232.getClass(), "isAlignmentYSet", false);
        setFloatField(term734232, term734232.getClass(), "alignmentY", 0.0F);
        setField(term734232, term734232.getClass(), "ui", null);
        setField(term734232, term734232.getClass(), "listenerList", null);
        setField(term734232, term734232.getClass(), "clientProperties", null);
        setField(term734232, term734232.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term734232, term734232.getClass(), "autoscrolls", false);
        setField(term734232, term734232.getClass(), "border", null);
        setIntField(term734232, term734232.getClass(), "flags", 0);
        setField(term734232, term734232.getClass(), "inputVerifier", null);
        setBooleanField(term734232, term734232.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term734232, term734232.getClass(), "paintingChild", null);
        setField(term734232, term734232.getClass(), "popupMenu", null);
        setField(term734232, term734232.getClass(), "revalidateRunnableScheduled", null);
        setField(term734232, term734232.getClass(), "focusInputMap", null);
        setField(term734232, term734232.getClass(), "ancestorInputMap", null);
        setField(term734232, term734232.getClass(), "windowInputMap", null);
        setField(term734232, term734232.getClass(), "actionMap", null);
        setField(term734232, term734232.getClass(), "aaHint", null);
        setField(term734232, term734232.getClass(), "lcdRenderingHint", null);
        setField(term734232, term734232.getClass(), "component", null);
        setField(term734232, term734232.getClass(), "layoutMgr", null);
        setField(term734232, term734232.getClass(), "dispatcher", null);
        setField(term734232, term734232.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term734232, term734232.getClass(), "focusCycleRoot", false);
        setBooleanField(term734232, term734232.getClass(), "focusTraversalPolicyProvider", false);
        setField(term734232, term734232.getClass(), "printingThreads", null);
        setBooleanField(term734232, term734232.getClass(), "printing", false);
        setField(term734232, term734232.getClass(), "containerListener", null);
        setIntField(term734232, term734232.getClass(), "listeningChildren", 0);
        setIntField(term734232, term734232.getClass(), "listeningBoundsChildren", 0);
        setIntField(term734232, term734232.getClass(), "descendantsCount", 0);
        setField(term734232, term734232.getClass(), "preserveBackgroundColor", null);
        setIntField(term734232, term734232.getClass(), "numOfHWComponents", 0);
        setIntField(term734232, term734232.getClass(), "numOfLWComponents", 0);
        setField(term734232, term734232.getClass(), "modalComp", null);
        setField(term734232, term734232.getClass(), "modalAppContext", null);
        setIntField(term734232, term734232.getClass(), "containerSerializedDataVersion", 0);
        setField(term734232, term734232.getClass(), "peer", null);
        setField(term734232, term734232.getClass(), "parent", null);
        setField(term734232, term734232.getClass(), "appContext", null);
        setIntField(term734232, term734232.getClass(), "x", 0);
        setIntField(term734232, term734232.getClass(), "y", 0);
        setIntField(term734232, term734232.getClass(), "width", 0);
        setIntField(term734232, term734232.getClass(), "height", 0);
        setField(term734232, term734232.getClass(), "foreground", null);
        setField(term734232, term734232.getClass(), "background", null);
        setField(term734232, term734232.getClass(), "font", null);
        setField(term734232, term734232.getClass(), "peerFont", null);
        setField(term734232, term734232.getClass(), "cursor", null);
        setField(term734232, term734232.getClass(), "locale", null);
        setField(term734232, term734232.getClass(), "graphicsConfig", null);
        setField(term734232, term734232.getClass(), "bufferStrategy", null);
        setBooleanField(term734232, term734232.getClass(), "ignoreRepaint", false);
        setBooleanField(term734232, term734232.getClass(), "visible", false);
        setBooleanField(term734232, term734232.getClass(), "enabled", false);
        setBooleanField(term734232, term734232.getClass(), "valid", false);
        setField(term734232, term734232.getClass(), "dropTarget", null);
        setField(term734232, term734232.getClass(), "popups", null);
        setField(term734232, term734232.getClass(), "name", null);
        setBooleanField(term734232, term734232.getClass(), "nameExplicitlySet", false);
        setBooleanField(term734232, term734232.getClass(), "focusable", false);
        setIntField(term734232, term734232.getClass(), "isFocusTraversableOverridden", 0);
        setField(term734232, term734232.getClass(), "focusTraversalKeys", null);
        setBooleanField(term734232, term734232.getClass(), "focusTraversalKeysEnabled", false);
        setField(term734232, term734232.getClass(), "acc", null);
        setField(term734232, term734232.getClass(), "minSize", null);
        setBooleanField(term734232, term734232.getClass(), "minSizeSet", false);
        setField(term734232, term734232.getClass(), "prefSize", null);
        setBooleanField(term734232, term734232.getClass(), "prefSizeSet", false);
        setField(term734232, term734232.getClass(), "maxSize", null);
        setBooleanField(term734232, term734232.getClass(), "maxSizeSet", false);
        setField(term734232, term734232.getClass(), "componentOrientation", null);
        setBooleanField(term734232, term734232.getClass(), "newEventsOnly", false);
        setField(term734232, term734232.getClass(), "componentListener", null);
        setField(term734232, term734232.getClass(), "focusListener", null);
        setField(term734232, term734232.getClass(), "hierarchyListener", null);
        setField(term734232, term734232.getClass(), "hierarchyBoundsListener", null);
        setField(term734232, term734232.getClass(), "keyListener", null);
        setField(term734232, term734232.getClass(), "mouseListener", null);
        setField(term734232, term734232.getClass(), "mouseMotionListener", null);
        setField(term734232, term734232.getClass(), "mouseWheelListener", null);
        setField(term734232, term734232.getClass(), "inputMethodListener", null);
        setLongField(term734232, term734232.getClass(), "eventMask", 0L);
        setField(term734232, term734232.getClass(), "changeSupport", null);
        setField(term734232, term734232.getClass(), "objectLock", null);
        setBooleanField(term734232, term734232.getClass(), "isPacked", false);
        setIntField(term734232, term734232.getClass(), "boundsOp", 0);
        setField(term734232, term734232.getClass(), "compoundShape", null);
        setField(term734232, term734232.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term734232, term734232.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term734232, term734232.getClass(), "backgroundEraseDisabled", false);
        setField(term734232, term734232.getClass(), "eventCache", null);
        setBooleanField(term734232, term734232.getClass(), "coalescingEnabled", false);
        setBooleanField(term734232, term734232.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term734232, term734232.getClass(), "componentSerializedDataVersion", 0);
        setField(term734232, term734232.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetTradeView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTradeRoute", argTypes, term734232, args);
    }

};


