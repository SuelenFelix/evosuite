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

public class FleetTradeView_getPossibleTradeRoutes_12010039643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697452;

    public FleetTradeView_getPossibleTradeRoutes_12010039643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term697452 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetTradeView"));
        setField(term697452, term697452.getClass(), "planet", null);
        setField(term697452, term697452.getClass(), "fleet", null);
        setField(term697452, term697452.getClass(), "info", null);
        setField(term697452, term697452.getClass(), "imgBase", null);
        setField(term697452, term697452.getClass(), "starMap", null);
        setField(term697452, term697452.getClass(), "ownerLabel", null);
        setField(term697452, term697452.getClass(), "totalPeople", null);
        setField(term697452, term697452.getClass(), "metal", null);
        setField(term697452, term697452.getClass(), "fleetNameText", null);
        setField(term697452, term697452.getClass(), "fleetList", null);
        setField(term697452, term697452.getClass(), "tradeRoutes", null);
        setBooleanField(term697452, term697452.getClass(), "isAlignmentXSet", false);
        setFloatField(term697452, term697452.getClass(), "alignmentX", 0.0F);
        setBooleanField(term697452, term697452.getClass(), "isAlignmentYSet", false);
        setFloatField(term697452, term697452.getClass(), "alignmentY", 0.0F);
        setField(term697452, term697452.getClass(), "ui", null);
        setField(term697452, term697452.getClass(), "listenerList", null);
        setField(term697452, term697452.getClass(), "clientProperties", null);
        setField(term697452, term697452.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term697452, term697452.getClass(), "autoscrolls", false);
        setField(term697452, term697452.getClass(), "border", null);
        setIntField(term697452, term697452.getClass(), "flags", 0);
        setField(term697452, term697452.getClass(), "inputVerifier", null);
        setBooleanField(term697452, term697452.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term697452, term697452.getClass(), "paintingChild", null);
        setField(term697452, term697452.getClass(), "popupMenu", null);
        setField(term697452, term697452.getClass(), "revalidateRunnableScheduled", null);
        setField(term697452, term697452.getClass(), "focusInputMap", null);
        setField(term697452, term697452.getClass(), "ancestorInputMap", null);
        setField(term697452, term697452.getClass(), "windowInputMap", null);
        setField(term697452, term697452.getClass(), "actionMap", null);
        setField(term697452, term697452.getClass(), "aaHint", null);
        setField(term697452, term697452.getClass(), "lcdRenderingHint", null);
        setField(term697452, term697452.getClass(), "component", null);
        setField(term697452, term697452.getClass(), "layoutMgr", null);
        setField(term697452, term697452.getClass(), "dispatcher", null);
        setField(term697452, term697452.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term697452, term697452.getClass(), "focusCycleRoot", false);
        setBooleanField(term697452, term697452.getClass(), "focusTraversalPolicyProvider", false);
        setField(term697452, term697452.getClass(), "printingThreads", null);
        setBooleanField(term697452, term697452.getClass(), "printing", false);
        setField(term697452, term697452.getClass(), "containerListener", null);
        setIntField(term697452, term697452.getClass(), "listeningChildren", 0);
        setIntField(term697452, term697452.getClass(), "listeningBoundsChildren", 0);
        setIntField(term697452, term697452.getClass(), "descendantsCount", 0);
        setField(term697452, term697452.getClass(), "preserveBackgroundColor", null);
        setIntField(term697452, term697452.getClass(), "numOfHWComponents", 0);
        setIntField(term697452, term697452.getClass(), "numOfLWComponents", 0);
        setField(term697452, term697452.getClass(), "modalComp", null);
        setField(term697452, term697452.getClass(), "modalAppContext", null);
        setIntField(term697452, term697452.getClass(), "containerSerializedDataVersion", 0);
        setField(term697452, term697452.getClass(), "peer", null);
        setField(term697452, term697452.getClass(), "parent", null);
        setField(term697452, term697452.getClass(), "appContext", null);
        setIntField(term697452, term697452.getClass(), "x", 0);
        setIntField(term697452, term697452.getClass(), "y", 0);
        setIntField(term697452, term697452.getClass(), "width", 0);
        setIntField(term697452, term697452.getClass(), "height", 0);
        setField(term697452, term697452.getClass(), "foreground", null);
        setField(term697452, term697452.getClass(), "background", null);
        setField(term697452, term697452.getClass(), "font", null);
        setField(term697452, term697452.getClass(), "peerFont", null);
        setField(term697452, term697452.getClass(), "cursor", null);
        setField(term697452, term697452.getClass(), "locale", null);
        setField(term697452, term697452.getClass(), "graphicsConfig", null);
        setField(term697452, term697452.getClass(), "bufferStrategy", null);
        setBooleanField(term697452, term697452.getClass(), "ignoreRepaint", false);
        setBooleanField(term697452, term697452.getClass(), "visible", false);
        setBooleanField(term697452, term697452.getClass(), "enabled", false);
        setBooleanField(term697452, term697452.getClass(), "valid", false);
        setField(term697452, term697452.getClass(), "dropTarget", null);
        setField(term697452, term697452.getClass(), "popups", null);
        setField(term697452, term697452.getClass(), "name", null);
        setBooleanField(term697452, term697452.getClass(), "nameExplicitlySet", false);
        setBooleanField(term697452, term697452.getClass(), "focusable", false);
        setIntField(term697452, term697452.getClass(), "isFocusTraversableOverridden", 0);
        setField(term697452, term697452.getClass(), "focusTraversalKeys", null);
        setBooleanField(term697452, term697452.getClass(), "focusTraversalKeysEnabled", false);
        setField(term697452, term697452.getClass(), "acc", null);
        setField(term697452, term697452.getClass(), "minSize", null);
        setBooleanField(term697452, term697452.getClass(), "minSizeSet", false);
        setField(term697452, term697452.getClass(), "prefSize", null);
        setBooleanField(term697452, term697452.getClass(), "prefSizeSet", false);
        setField(term697452, term697452.getClass(), "maxSize", null);
        setBooleanField(term697452, term697452.getClass(), "maxSizeSet", false);
        setField(term697452, term697452.getClass(), "componentOrientation", null);
        setBooleanField(term697452, term697452.getClass(), "newEventsOnly", false);
        setField(term697452, term697452.getClass(), "componentListener", null);
        setField(term697452, term697452.getClass(), "focusListener", null);
        setField(term697452, term697452.getClass(), "hierarchyListener", null);
        setField(term697452, term697452.getClass(), "hierarchyBoundsListener", null);
        setField(term697452, term697452.getClass(), "keyListener", null);
        setField(term697452, term697452.getClass(), "mouseListener", null);
        setField(term697452, term697452.getClass(), "mouseMotionListener", null);
        setField(term697452, term697452.getClass(), "mouseWheelListener", null);
        setField(term697452, term697452.getClass(), "inputMethodListener", null);
        setLongField(term697452, term697452.getClass(), "eventMask", 0L);
        setField(term697452, term697452.getClass(), "changeSupport", null);
        setField(term697452, term697452.getClass(), "objectLock", null);
        setBooleanField(term697452, term697452.getClass(), "isPacked", false);
        setIntField(term697452, term697452.getClass(), "boundsOp", 0);
        setField(term697452, term697452.getClass(), "compoundShape", null);
        setField(term697452, term697452.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term697452, term697452.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term697452, term697452.getClass(), "backgroundEraseDisabled", false);
        setField(term697452, term697452.getClass(), "eventCache", null);
        setBooleanField(term697452, term697452.getClass(), "coalescingEnabled", false);
        setBooleanField(term697452, term697452.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term697452, term697452.getClass(), "componentSerializedDataVersion", 0);
        setField(term697452, term697452.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetTradeView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPossibleTradeRoutes", argTypes, term697452, args);
    }

};


