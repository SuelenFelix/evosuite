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

public class FleetTradeView_getPlayerInfo_6102085311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726595;

    public FleetTradeView_getPlayerInfo_6102085311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term726595 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetTradeView"));
        setField(term726595, term726595.getClass(), "planet", null);
        setField(term726595, term726595.getClass(), "fleet", null);
        setField(term726595, term726595.getClass(), "info", null);
        setField(term726595, term726595.getClass(), "imgBase", null);
        setField(term726595, term726595.getClass(), "starMap", null);
        setField(term726595, term726595.getClass(), "ownerLabel", null);
        setField(term726595, term726595.getClass(), "totalPeople", null);
        setField(term726595, term726595.getClass(), "metal", null);
        setField(term726595, term726595.getClass(), "fleetNameText", null);
        setField(term726595, term726595.getClass(), "fleetList", null);
        setField(term726595, term726595.getClass(), "tradeRoutes", null);
        setBooleanField(term726595, term726595.getClass(), "isAlignmentXSet", false);
        setFloatField(term726595, term726595.getClass(), "alignmentX", 0.0F);
        setBooleanField(term726595, term726595.getClass(), "isAlignmentYSet", false);
        setFloatField(term726595, term726595.getClass(), "alignmentY", 0.0F);
        setField(term726595, term726595.getClass(), "ui", null);
        setField(term726595, term726595.getClass(), "listenerList", null);
        setField(term726595, term726595.getClass(), "clientProperties", null);
        setField(term726595, term726595.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term726595, term726595.getClass(), "autoscrolls", false);
        setField(term726595, term726595.getClass(), "border", null);
        setIntField(term726595, term726595.getClass(), "flags", 0);
        setField(term726595, term726595.getClass(), "inputVerifier", null);
        setBooleanField(term726595, term726595.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term726595, term726595.getClass(), "paintingChild", null);
        setField(term726595, term726595.getClass(), "popupMenu", null);
        setField(term726595, term726595.getClass(), "revalidateRunnableScheduled", null);
        setField(term726595, term726595.getClass(), "focusInputMap", null);
        setField(term726595, term726595.getClass(), "ancestorInputMap", null);
        setField(term726595, term726595.getClass(), "windowInputMap", null);
        setField(term726595, term726595.getClass(), "actionMap", null);
        setField(term726595, term726595.getClass(), "aaHint", null);
        setField(term726595, term726595.getClass(), "lcdRenderingHint", null);
        setField(term726595, term726595.getClass(), "component", null);
        setField(term726595, term726595.getClass(), "layoutMgr", null);
        setField(term726595, term726595.getClass(), "dispatcher", null);
        setField(term726595, term726595.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term726595, term726595.getClass(), "focusCycleRoot", false);
        setBooleanField(term726595, term726595.getClass(), "focusTraversalPolicyProvider", false);
        setField(term726595, term726595.getClass(), "printingThreads", null);
        setBooleanField(term726595, term726595.getClass(), "printing", false);
        setField(term726595, term726595.getClass(), "containerListener", null);
        setIntField(term726595, term726595.getClass(), "listeningChildren", 0);
        setIntField(term726595, term726595.getClass(), "listeningBoundsChildren", 0);
        setIntField(term726595, term726595.getClass(), "descendantsCount", 0);
        setField(term726595, term726595.getClass(), "preserveBackgroundColor", null);
        setIntField(term726595, term726595.getClass(), "numOfHWComponents", 0);
        setIntField(term726595, term726595.getClass(), "numOfLWComponents", 0);
        setField(term726595, term726595.getClass(), "modalComp", null);
        setField(term726595, term726595.getClass(), "modalAppContext", null);
        setIntField(term726595, term726595.getClass(), "containerSerializedDataVersion", 0);
        setField(term726595, term726595.getClass(), "peer", null);
        setField(term726595, term726595.getClass(), "parent", null);
        setField(term726595, term726595.getClass(), "appContext", null);
        setIntField(term726595, term726595.getClass(), "x", 0);
        setIntField(term726595, term726595.getClass(), "y", 0);
        setIntField(term726595, term726595.getClass(), "width", 0);
        setIntField(term726595, term726595.getClass(), "height", 0);
        setField(term726595, term726595.getClass(), "foreground", null);
        setField(term726595, term726595.getClass(), "background", null);
        setField(term726595, term726595.getClass(), "font", null);
        setField(term726595, term726595.getClass(), "peerFont", null);
        setField(term726595, term726595.getClass(), "cursor", null);
        setField(term726595, term726595.getClass(), "locale", null);
        setField(term726595, term726595.getClass(), "graphicsConfig", null);
        setField(term726595, term726595.getClass(), "bufferStrategy", null);
        setBooleanField(term726595, term726595.getClass(), "ignoreRepaint", false);
        setBooleanField(term726595, term726595.getClass(), "visible", false);
        setBooleanField(term726595, term726595.getClass(), "enabled", false);
        setBooleanField(term726595, term726595.getClass(), "valid", false);
        setField(term726595, term726595.getClass(), "dropTarget", null);
        setField(term726595, term726595.getClass(), "popups", null);
        setField(term726595, term726595.getClass(), "name", null);
        setBooleanField(term726595, term726595.getClass(), "nameExplicitlySet", false);
        setBooleanField(term726595, term726595.getClass(), "focusable", false);
        setIntField(term726595, term726595.getClass(), "isFocusTraversableOverridden", 0);
        setField(term726595, term726595.getClass(), "focusTraversalKeys", null);
        setBooleanField(term726595, term726595.getClass(), "focusTraversalKeysEnabled", false);
        setField(term726595, term726595.getClass(), "acc", null);
        setField(term726595, term726595.getClass(), "minSize", null);
        setBooleanField(term726595, term726595.getClass(), "minSizeSet", false);
        setField(term726595, term726595.getClass(), "prefSize", null);
        setBooleanField(term726595, term726595.getClass(), "prefSizeSet", false);
        setField(term726595, term726595.getClass(), "maxSize", null);
        setBooleanField(term726595, term726595.getClass(), "maxSizeSet", false);
        setField(term726595, term726595.getClass(), "componentOrientation", null);
        setBooleanField(term726595, term726595.getClass(), "newEventsOnly", false);
        setField(term726595, term726595.getClass(), "componentListener", null);
        setField(term726595, term726595.getClass(), "focusListener", null);
        setField(term726595, term726595.getClass(), "hierarchyListener", null);
        setField(term726595, term726595.getClass(), "hierarchyBoundsListener", null);
        setField(term726595, term726595.getClass(), "keyListener", null);
        setField(term726595, term726595.getClass(), "mouseListener", null);
        setField(term726595, term726595.getClass(), "mouseMotionListener", null);
        setField(term726595, term726595.getClass(), "mouseWheelListener", null);
        setField(term726595, term726595.getClass(), "inputMethodListener", null);
        setLongField(term726595, term726595.getClass(), "eventMask", 0L);
        setField(term726595, term726595.getClass(), "changeSupport", null);
        setField(term726595, term726595.getClass(), "objectLock", null);
        setBooleanField(term726595, term726595.getClass(), "isPacked", false);
        setIntField(term726595, term726595.getClass(), "boundsOp", 0);
        setField(term726595, term726595.getClass(), "compoundShape", null);
        setField(term726595, term726595.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term726595, term726595.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term726595, term726595.getClass(), "backgroundEraseDisabled", false);
        setField(term726595, term726595.getClass(), "eventCache", null);
        setBooleanField(term726595, term726595.getClass(), "coalescingEnabled", false);
        setBooleanField(term726595, term726595.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term726595, term726595.getClass(), "componentSerializedDataVersion", 0);
        setField(term726595, term726595.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetTradeView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerInfo", argTypes, term726595, args);
    }

};


