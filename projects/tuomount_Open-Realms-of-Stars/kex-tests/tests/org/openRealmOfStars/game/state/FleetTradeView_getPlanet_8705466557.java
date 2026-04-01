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

public class FleetTradeView_getPlanet_8705466557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711587;

    public FleetTradeView_getPlanet_8705466557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term711587 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetTradeView"));
        setField(term711587, term711587.getClass(), "planet", null);
        setField(term711587, term711587.getClass(), "fleet", null);
        setField(term711587, term711587.getClass(), "info", null);
        setField(term711587, term711587.getClass(), "imgBase", null);
        setField(term711587, term711587.getClass(), "starMap", null);
        setField(term711587, term711587.getClass(), "ownerLabel", null);
        setField(term711587, term711587.getClass(), "totalPeople", null);
        setField(term711587, term711587.getClass(), "metal", null);
        setField(term711587, term711587.getClass(), "fleetNameText", null);
        setField(term711587, term711587.getClass(), "fleetList", null);
        setField(term711587, term711587.getClass(), "tradeRoutes", null);
        setBooleanField(term711587, term711587.getClass(), "isAlignmentXSet", false);
        setFloatField(term711587, term711587.getClass(), "alignmentX", 0.0F);
        setBooleanField(term711587, term711587.getClass(), "isAlignmentYSet", false);
        setFloatField(term711587, term711587.getClass(), "alignmentY", 0.0F);
        setField(term711587, term711587.getClass(), "ui", null);
        setField(term711587, term711587.getClass(), "listenerList", null);
        setField(term711587, term711587.getClass(), "clientProperties", null);
        setField(term711587, term711587.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term711587, term711587.getClass(), "autoscrolls", false);
        setField(term711587, term711587.getClass(), "border", null);
        setIntField(term711587, term711587.getClass(), "flags", 0);
        setField(term711587, term711587.getClass(), "inputVerifier", null);
        setBooleanField(term711587, term711587.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term711587, term711587.getClass(), "paintingChild", null);
        setField(term711587, term711587.getClass(), "popupMenu", null);
        setField(term711587, term711587.getClass(), "revalidateRunnableScheduled", null);
        setField(term711587, term711587.getClass(), "focusInputMap", null);
        setField(term711587, term711587.getClass(), "ancestorInputMap", null);
        setField(term711587, term711587.getClass(), "windowInputMap", null);
        setField(term711587, term711587.getClass(), "actionMap", null);
        setField(term711587, term711587.getClass(), "aaHint", null);
        setField(term711587, term711587.getClass(), "lcdRenderingHint", null);
        setField(term711587, term711587.getClass(), "component", null);
        setField(term711587, term711587.getClass(), "layoutMgr", null);
        setField(term711587, term711587.getClass(), "dispatcher", null);
        setField(term711587, term711587.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term711587, term711587.getClass(), "focusCycleRoot", false);
        setBooleanField(term711587, term711587.getClass(), "focusTraversalPolicyProvider", false);
        setField(term711587, term711587.getClass(), "printingThreads", null);
        setBooleanField(term711587, term711587.getClass(), "printing", false);
        setField(term711587, term711587.getClass(), "containerListener", null);
        setIntField(term711587, term711587.getClass(), "listeningChildren", 0);
        setIntField(term711587, term711587.getClass(), "listeningBoundsChildren", 0);
        setIntField(term711587, term711587.getClass(), "descendantsCount", 0);
        setField(term711587, term711587.getClass(), "preserveBackgroundColor", null);
        setIntField(term711587, term711587.getClass(), "numOfHWComponents", 0);
        setIntField(term711587, term711587.getClass(), "numOfLWComponents", 0);
        setField(term711587, term711587.getClass(), "modalComp", null);
        setField(term711587, term711587.getClass(), "modalAppContext", null);
        setIntField(term711587, term711587.getClass(), "containerSerializedDataVersion", 0);
        setField(term711587, term711587.getClass(), "peer", null);
        setField(term711587, term711587.getClass(), "parent", null);
        setField(term711587, term711587.getClass(), "appContext", null);
        setIntField(term711587, term711587.getClass(), "x", 0);
        setIntField(term711587, term711587.getClass(), "y", 0);
        setIntField(term711587, term711587.getClass(), "width", 0);
        setIntField(term711587, term711587.getClass(), "height", 0);
        setField(term711587, term711587.getClass(), "foreground", null);
        setField(term711587, term711587.getClass(), "background", null);
        setField(term711587, term711587.getClass(), "font", null);
        setField(term711587, term711587.getClass(), "peerFont", null);
        setField(term711587, term711587.getClass(), "cursor", null);
        setField(term711587, term711587.getClass(), "locale", null);
        setField(term711587, term711587.getClass(), "graphicsConfig", null);
        setField(term711587, term711587.getClass(), "bufferStrategy", null);
        setBooleanField(term711587, term711587.getClass(), "ignoreRepaint", false);
        setBooleanField(term711587, term711587.getClass(), "visible", false);
        setBooleanField(term711587, term711587.getClass(), "enabled", false);
        setBooleanField(term711587, term711587.getClass(), "valid", false);
        setField(term711587, term711587.getClass(), "dropTarget", null);
        setField(term711587, term711587.getClass(), "popups", null);
        setField(term711587, term711587.getClass(), "name", null);
        setBooleanField(term711587, term711587.getClass(), "nameExplicitlySet", false);
        setBooleanField(term711587, term711587.getClass(), "focusable", false);
        setIntField(term711587, term711587.getClass(), "isFocusTraversableOverridden", 0);
        setField(term711587, term711587.getClass(), "focusTraversalKeys", null);
        setBooleanField(term711587, term711587.getClass(), "focusTraversalKeysEnabled", false);
        setField(term711587, term711587.getClass(), "acc", null);
        setField(term711587, term711587.getClass(), "minSize", null);
        setBooleanField(term711587, term711587.getClass(), "minSizeSet", false);
        setField(term711587, term711587.getClass(), "prefSize", null);
        setBooleanField(term711587, term711587.getClass(), "prefSizeSet", false);
        setField(term711587, term711587.getClass(), "maxSize", null);
        setBooleanField(term711587, term711587.getClass(), "maxSizeSet", false);
        setField(term711587, term711587.getClass(), "componentOrientation", null);
        setBooleanField(term711587, term711587.getClass(), "newEventsOnly", false);
        setField(term711587, term711587.getClass(), "componentListener", null);
        setField(term711587, term711587.getClass(), "focusListener", null);
        setField(term711587, term711587.getClass(), "hierarchyListener", null);
        setField(term711587, term711587.getClass(), "hierarchyBoundsListener", null);
        setField(term711587, term711587.getClass(), "keyListener", null);
        setField(term711587, term711587.getClass(), "mouseListener", null);
        setField(term711587, term711587.getClass(), "mouseMotionListener", null);
        setField(term711587, term711587.getClass(), "mouseWheelListener", null);
        setField(term711587, term711587.getClass(), "inputMethodListener", null);
        setLongField(term711587, term711587.getClass(), "eventMask", 0L);
        setField(term711587, term711587.getClass(), "changeSupport", null);
        setField(term711587, term711587.getClass(), "objectLock", null);
        setBooleanField(term711587, term711587.getClass(), "isPacked", false);
        setIntField(term711587, term711587.getClass(), "boundsOp", 0);
        setField(term711587, term711587.getClass(), "compoundShape", null);
        setField(term711587, term711587.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term711587, term711587.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term711587, term711587.getClass(), "backgroundEraseDisabled", false);
        setField(term711587, term711587.getClass(), "eventCache", null);
        setBooleanField(term711587, term711587.getClass(), "coalescingEnabled", false);
        setBooleanField(term711587, term711587.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term711587, term711587.getClass(), "componentSerializedDataVersion", 0);
        setField(term711587, term711587.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetTradeView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanet", argTypes, term711587, args);
    }

};


