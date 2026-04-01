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

public class FleetTradeView_getMap_3381413885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704635;

    public FleetTradeView_getMap_3381413885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term704635 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetTradeView"));
        setField(term704635, term704635.getClass(), "planet", null);
        setField(term704635, term704635.getClass(), "fleet", null);
        setField(term704635, term704635.getClass(), "info", null);
        setField(term704635, term704635.getClass(), "imgBase", null);
        setField(term704635, term704635.getClass(), "starMap", null);
        setField(term704635, term704635.getClass(), "ownerLabel", null);
        setField(term704635, term704635.getClass(), "totalPeople", null);
        setField(term704635, term704635.getClass(), "metal", null);
        setField(term704635, term704635.getClass(), "fleetNameText", null);
        setField(term704635, term704635.getClass(), "fleetList", null);
        setField(term704635, term704635.getClass(), "tradeRoutes", null);
        setBooleanField(term704635, term704635.getClass(), "isAlignmentXSet", false);
        setFloatField(term704635, term704635.getClass(), "alignmentX", 0.0F);
        setBooleanField(term704635, term704635.getClass(), "isAlignmentYSet", false);
        setFloatField(term704635, term704635.getClass(), "alignmentY", 0.0F);
        setField(term704635, term704635.getClass(), "ui", null);
        setField(term704635, term704635.getClass(), "listenerList", null);
        setField(term704635, term704635.getClass(), "clientProperties", null);
        setField(term704635, term704635.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term704635, term704635.getClass(), "autoscrolls", false);
        setField(term704635, term704635.getClass(), "border", null);
        setIntField(term704635, term704635.getClass(), "flags", 0);
        setField(term704635, term704635.getClass(), "inputVerifier", null);
        setBooleanField(term704635, term704635.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term704635, term704635.getClass(), "paintingChild", null);
        setField(term704635, term704635.getClass(), "popupMenu", null);
        setField(term704635, term704635.getClass(), "revalidateRunnableScheduled", null);
        setField(term704635, term704635.getClass(), "focusInputMap", null);
        setField(term704635, term704635.getClass(), "ancestorInputMap", null);
        setField(term704635, term704635.getClass(), "windowInputMap", null);
        setField(term704635, term704635.getClass(), "actionMap", null);
        setField(term704635, term704635.getClass(), "aaHint", null);
        setField(term704635, term704635.getClass(), "lcdRenderingHint", null);
        setField(term704635, term704635.getClass(), "component", null);
        setField(term704635, term704635.getClass(), "layoutMgr", null);
        setField(term704635, term704635.getClass(), "dispatcher", null);
        setField(term704635, term704635.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term704635, term704635.getClass(), "focusCycleRoot", false);
        setBooleanField(term704635, term704635.getClass(), "focusTraversalPolicyProvider", false);
        setField(term704635, term704635.getClass(), "printingThreads", null);
        setBooleanField(term704635, term704635.getClass(), "printing", false);
        setField(term704635, term704635.getClass(), "containerListener", null);
        setIntField(term704635, term704635.getClass(), "listeningChildren", 0);
        setIntField(term704635, term704635.getClass(), "listeningBoundsChildren", 0);
        setIntField(term704635, term704635.getClass(), "descendantsCount", 0);
        setField(term704635, term704635.getClass(), "preserveBackgroundColor", null);
        setIntField(term704635, term704635.getClass(), "numOfHWComponents", 0);
        setIntField(term704635, term704635.getClass(), "numOfLWComponents", 0);
        setField(term704635, term704635.getClass(), "modalComp", null);
        setField(term704635, term704635.getClass(), "modalAppContext", null);
        setIntField(term704635, term704635.getClass(), "containerSerializedDataVersion", 0);
        setField(term704635, term704635.getClass(), "peer", null);
        setField(term704635, term704635.getClass(), "parent", null);
        setField(term704635, term704635.getClass(), "appContext", null);
        setIntField(term704635, term704635.getClass(), "x", 0);
        setIntField(term704635, term704635.getClass(), "y", 0);
        setIntField(term704635, term704635.getClass(), "width", 0);
        setIntField(term704635, term704635.getClass(), "height", 0);
        setField(term704635, term704635.getClass(), "foreground", null);
        setField(term704635, term704635.getClass(), "background", null);
        setField(term704635, term704635.getClass(), "font", null);
        setField(term704635, term704635.getClass(), "peerFont", null);
        setField(term704635, term704635.getClass(), "cursor", null);
        setField(term704635, term704635.getClass(), "locale", null);
        setField(term704635, term704635.getClass(), "graphicsConfig", null);
        setField(term704635, term704635.getClass(), "bufferStrategy", null);
        setBooleanField(term704635, term704635.getClass(), "ignoreRepaint", false);
        setBooleanField(term704635, term704635.getClass(), "visible", false);
        setBooleanField(term704635, term704635.getClass(), "enabled", false);
        setBooleanField(term704635, term704635.getClass(), "valid", false);
        setField(term704635, term704635.getClass(), "dropTarget", null);
        setField(term704635, term704635.getClass(), "popups", null);
        setField(term704635, term704635.getClass(), "name", null);
        setBooleanField(term704635, term704635.getClass(), "nameExplicitlySet", false);
        setBooleanField(term704635, term704635.getClass(), "focusable", false);
        setIntField(term704635, term704635.getClass(), "isFocusTraversableOverridden", 0);
        setField(term704635, term704635.getClass(), "focusTraversalKeys", null);
        setBooleanField(term704635, term704635.getClass(), "focusTraversalKeysEnabled", false);
        setField(term704635, term704635.getClass(), "acc", null);
        setField(term704635, term704635.getClass(), "minSize", null);
        setBooleanField(term704635, term704635.getClass(), "minSizeSet", false);
        setField(term704635, term704635.getClass(), "prefSize", null);
        setBooleanField(term704635, term704635.getClass(), "prefSizeSet", false);
        setField(term704635, term704635.getClass(), "maxSize", null);
        setBooleanField(term704635, term704635.getClass(), "maxSizeSet", false);
        setField(term704635, term704635.getClass(), "componentOrientation", null);
        setBooleanField(term704635, term704635.getClass(), "newEventsOnly", false);
        setField(term704635, term704635.getClass(), "componentListener", null);
        setField(term704635, term704635.getClass(), "focusListener", null);
        setField(term704635, term704635.getClass(), "hierarchyListener", null);
        setField(term704635, term704635.getClass(), "hierarchyBoundsListener", null);
        setField(term704635, term704635.getClass(), "keyListener", null);
        setField(term704635, term704635.getClass(), "mouseListener", null);
        setField(term704635, term704635.getClass(), "mouseMotionListener", null);
        setField(term704635, term704635.getClass(), "mouseWheelListener", null);
        setField(term704635, term704635.getClass(), "inputMethodListener", null);
        setLongField(term704635, term704635.getClass(), "eventMask", 0L);
        setField(term704635, term704635.getClass(), "changeSupport", null);
        setField(term704635, term704635.getClass(), "objectLock", null);
        setBooleanField(term704635, term704635.getClass(), "isPacked", false);
        setIntField(term704635, term704635.getClass(), "boundsOp", 0);
        setField(term704635, term704635.getClass(), "compoundShape", null);
        setField(term704635, term704635.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term704635, term704635.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term704635, term704635.getClass(), "backgroundEraseDisabled", false);
        setField(term704635, term704635.getClass(), "eventCache", null);
        setBooleanField(term704635, term704635.getClass(), "coalescingEnabled", false);
        setBooleanField(term704635, term704635.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term704635, term704635.getClass(), "componentSerializedDataVersion", 0);
        setField(term704635, term704635.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetTradeView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMap", argTypes, term704635, args);
    }

};


