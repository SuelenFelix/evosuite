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

public class FleetTradeView_getFleet_8223581749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term719060;

    public FleetTradeView_getFleet_8223581749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term719060 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetTradeView"));
        setField(term719060, term719060.getClass(), "planet", null);
        setField(term719060, term719060.getClass(), "fleet", null);
        setField(term719060, term719060.getClass(), "info", null);
        setField(term719060, term719060.getClass(), "imgBase", null);
        setField(term719060, term719060.getClass(), "starMap", null);
        setField(term719060, term719060.getClass(), "ownerLabel", null);
        setField(term719060, term719060.getClass(), "totalPeople", null);
        setField(term719060, term719060.getClass(), "metal", null);
        setField(term719060, term719060.getClass(), "fleetNameText", null);
        setField(term719060, term719060.getClass(), "fleetList", null);
        setField(term719060, term719060.getClass(), "tradeRoutes", null);
        setBooleanField(term719060, term719060.getClass(), "isAlignmentXSet", false);
        setFloatField(term719060, term719060.getClass(), "alignmentX", 0.0F);
        setBooleanField(term719060, term719060.getClass(), "isAlignmentYSet", false);
        setFloatField(term719060, term719060.getClass(), "alignmentY", 0.0F);
        setField(term719060, term719060.getClass(), "ui", null);
        setField(term719060, term719060.getClass(), "listenerList", null);
        setField(term719060, term719060.getClass(), "clientProperties", null);
        setField(term719060, term719060.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term719060, term719060.getClass(), "autoscrolls", false);
        setField(term719060, term719060.getClass(), "border", null);
        setIntField(term719060, term719060.getClass(), "flags", 0);
        setField(term719060, term719060.getClass(), "inputVerifier", null);
        setBooleanField(term719060, term719060.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term719060, term719060.getClass(), "paintingChild", null);
        setField(term719060, term719060.getClass(), "popupMenu", null);
        setField(term719060, term719060.getClass(), "revalidateRunnableScheduled", null);
        setField(term719060, term719060.getClass(), "focusInputMap", null);
        setField(term719060, term719060.getClass(), "ancestorInputMap", null);
        setField(term719060, term719060.getClass(), "windowInputMap", null);
        setField(term719060, term719060.getClass(), "actionMap", null);
        setField(term719060, term719060.getClass(), "aaHint", null);
        setField(term719060, term719060.getClass(), "lcdRenderingHint", null);
        setField(term719060, term719060.getClass(), "component", null);
        setField(term719060, term719060.getClass(), "layoutMgr", null);
        setField(term719060, term719060.getClass(), "dispatcher", null);
        setField(term719060, term719060.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term719060, term719060.getClass(), "focusCycleRoot", false);
        setBooleanField(term719060, term719060.getClass(), "focusTraversalPolicyProvider", false);
        setField(term719060, term719060.getClass(), "printingThreads", null);
        setBooleanField(term719060, term719060.getClass(), "printing", false);
        setField(term719060, term719060.getClass(), "containerListener", null);
        setIntField(term719060, term719060.getClass(), "listeningChildren", 0);
        setIntField(term719060, term719060.getClass(), "listeningBoundsChildren", 0);
        setIntField(term719060, term719060.getClass(), "descendantsCount", 0);
        setField(term719060, term719060.getClass(), "preserveBackgroundColor", null);
        setIntField(term719060, term719060.getClass(), "numOfHWComponents", 0);
        setIntField(term719060, term719060.getClass(), "numOfLWComponents", 0);
        setField(term719060, term719060.getClass(), "modalComp", null);
        setField(term719060, term719060.getClass(), "modalAppContext", null);
        setIntField(term719060, term719060.getClass(), "containerSerializedDataVersion", 0);
        setField(term719060, term719060.getClass(), "peer", null);
        setField(term719060, term719060.getClass(), "parent", null);
        setField(term719060, term719060.getClass(), "appContext", null);
        setIntField(term719060, term719060.getClass(), "x", 0);
        setIntField(term719060, term719060.getClass(), "y", 0);
        setIntField(term719060, term719060.getClass(), "width", 0);
        setIntField(term719060, term719060.getClass(), "height", 0);
        setField(term719060, term719060.getClass(), "foreground", null);
        setField(term719060, term719060.getClass(), "background", null);
        setField(term719060, term719060.getClass(), "font", null);
        setField(term719060, term719060.getClass(), "peerFont", null);
        setField(term719060, term719060.getClass(), "cursor", null);
        setField(term719060, term719060.getClass(), "locale", null);
        setField(term719060, term719060.getClass(), "graphicsConfig", null);
        setField(term719060, term719060.getClass(), "bufferStrategy", null);
        setBooleanField(term719060, term719060.getClass(), "ignoreRepaint", false);
        setBooleanField(term719060, term719060.getClass(), "visible", false);
        setBooleanField(term719060, term719060.getClass(), "enabled", false);
        setBooleanField(term719060, term719060.getClass(), "valid", false);
        setField(term719060, term719060.getClass(), "dropTarget", null);
        setField(term719060, term719060.getClass(), "popups", null);
        setField(term719060, term719060.getClass(), "name", null);
        setBooleanField(term719060, term719060.getClass(), "nameExplicitlySet", false);
        setBooleanField(term719060, term719060.getClass(), "focusable", false);
        setIntField(term719060, term719060.getClass(), "isFocusTraversableOverridden", 0);
        setField(term719060, term719060.getClass(), "focusTraversalKeys", null);
        setBooleanField(term719060, term719060.getClass(), "focusTraversalKeysEnabled", false);
        setField(term719060, term719060.getClass(), "acc", null);
        setField(term719060, term719060.getClass(), "minSize", null);
        setBooleanField(term719060, term719060.getClass(), "minSizeSet", false);
        setField(term719060, term719060.getClass(), "prefSize", null);
        setBooleanField(term719060, term719060.getClass(), "prefSizeSet", false);
        setField(term719060, term719060.getClass(), "maxSize", null);
        setBooleanField(term719060, term719060.getClass(), "maxSizeSet", false);
        setField(term719060, term719060.getClass(), "componentOrientation", null);
        setBooleanField(term719060, term719060.getClass(), "newEventsOnly", false);
        setField(term719060, term719060.getClass(), "componentListener", null);
        setField(term719060, term719060.getClass(), "focusListener", null);
        setField(term719060, term719060.getClass(), "hierarchyListener", null);
        setField(term719060, term719060.getClass(), "hierarchyBoundsListener", null);
        setField(term719060, term719060.getClass(), "keyListener", null);
        setField(term719060, term719060.getClass(), "mouseListener", null);
        setField(term719060, term719060.getClass(), "mouseMotionListener", null);
        setField(term719060, term719060.getClass(), "mouseWheelListener", null);
        setField(term719060, term719060.getClass(), "inputMethodListener", null);
        setLongField(term719060, term719060.getClass(), "eventMask", 0L);
        setField(term719060, term719060.getClass(), "changeSupport", null);
        setField(term719060, term719060.getClass(), "objectLock", null);
        setBooleanField(term719060, term719060.getClass(), "isPacked", false);
        setIntField(term719060, term719060.getClass(), "boundsOp", 0);
        setField(term719060, term719060.getClass(), "compoundShape", null);
        setField(term719060, term719060.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term719060, term719060.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term719060, term719060.getClass(), "backgroundEraseDisabled", false);
        setField(term719060, term719060.getClass(), "eventCache", null);
        setBooleanField(term719060, term719060.getClass(), "coalescingEnabled", false);
        setBooleanField(term719060, term719060.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term719060, term719060.getClass(), "componentSerializedDataVersion", 0);
        setField(term719060, term719060.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetTradeView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleet", argTypes, term719060, args);
    }

};


