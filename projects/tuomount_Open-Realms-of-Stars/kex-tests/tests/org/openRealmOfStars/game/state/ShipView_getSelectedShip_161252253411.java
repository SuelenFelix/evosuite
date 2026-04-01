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

public class ShipView_getSelectedShip_161252253411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1970743;

    public ShipView_getSelectedShip_161252253411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1970743 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipView"));
        setField(term1970743, term1970743.getClass(), "player", null);
        setField(term1970743, term1970743.getClass(), "shipList", null);
        setField(term1970743, term1970743.getClass(), "shipImage", null);
        setField(term1970743, term1970743.getClass(), "infoText", null);
        setBooleanField(term1970743, term1970743.getClass(), "copyClicked", false);
        setIntField(term1970743, term1970743.getClass(), "lastSelectedIndex", 0);
        setField(term1970743, term1970743.getClass(), "obsoleteBtn", null);
        setField(term1970743, term1970743.getClass(), "deleteBtn", null);
        setBooleanField(term1970743, term1970743.getClass(), "isAlignmentXSet", false);
        setFloatField(term1970743, term1970743.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1970743, term1970743.getClass(), "isAlignmentYSet", false);
        setFloatField(term1970743, term1970743.getClass(), "alignmentY", 0.0F);
        setField(term1970743, term1970743.getClass(), "ui", null);
        setField(term1970743, term1970743.getClass(), "listenerList", null);
        setField(term1970743, term1970743.getClass(), "clientProperties", null);
        setField(term1970743, term1970743.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1970743, term1970743.getClass(), "autoscrolls", false);
        setField(term1970743, term1970743.getClass(), "border", null);
        setIntField(term1970743, term1970743.getClass(), "flags", 0);
        setField(term1970743, term1970743.getClass(), "inputVerifier", null);
        setBooleanField(term1970743, term1970743.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1970743, term1970743.getClass(), "paintingChild", null);
        setField(term1970743, term1970743.getClass(), "popupMenu", null);
        setField(term1970743, term1970743.getClass(), "revalidateRunnableScheduled", null);
        setField(term1970743, term1970743.getClass(), "focusInputMap", null);
        setField(term1970743, term1970743.getClass(), "ancestorInputMap", null);
        setField(term1970743, term1970743.getClass(), "windowInputMap", null);
        setField(term1970743, term1970743.getClass(), "actionMap", null);
        setField(term1970743, term1970743.getClass(), "aaHint", null);
        setField(term1970743, term1970743.getClass(), "lcdRenderingHint", null);
        setField(term1970743, term1970743.getClass(), "component", null);
        setField(term1970743, term1970743.getClass(), "layoutMgr", null);
        setField(term1970743, term1970743.getClass(), "dispatcher", null);
        setField(term1970743, term1970743.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1970743, term1970743.getClass(), "focusCycleRoot", false);
        setBooleanField(term1970743, term1970743.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1970743, term1970743.getClass(), "printingThreads", null);
        setBooleanField(term1970743, term1970743.getClass(), "printing", false);
        setField(term1970743, term1970743.getClass(), "containerListener", null);
        setIntField(term1970743, term1970743.getClass(), "listeningChildren", 0);
        setIntField(term1970743, term1970743.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1970743, term1970743.getClass(), "descendantsCount", 0);
        setField(term1970743, term1970743.getClass(), "preserveBackgroundColor", null);
        setIntField(term1970743, term1970743.getClass(), "numOfHWComponents", 0);
        setIntField(term1970743, term1970743.getClass(), "numOfLWComponents", 0);
        setField(term1970743, term1970743.getClass(), "modalComp", null);
        setField(term1970743, term1970743.getClass(), "modalAppContext", null);
        setIntField(term1970743, term1970743.getClass(), "containerSerializedDataVersion", 0);
        setField(term1970743, term1970743.getClass(), "peer", null);
        setField(term1970743, term1970743.getClass(), "parent", null);
        setField(term1970743, term1970743.getClass(), "appContext", null);
        setIntField(term1970743, term1970743.getClass(), "x", 0);
        setIntField(term1970743, term1970743.getClass(), "y", 0);
        setIntField(term1970743, term1970743.getClass(), "width", 0);
        setIntField(term1970743, term1970743.getClass(), "height", 0);
        setField(term1970743, term1970743.getClass(), "foreground", null);
        setField(term1970743, term1970743.getClass(), "background", null);
        setField(term1970743, term1970743.getClass(), "font", null);
        setField(term1970743, term1970743.getClass(), "peerFont", null);
        setField(term1970743, term1970743.getClass(), "cursor", null);
        setField(term1970743, term1970743.getClass(), "locale", null);
        setField(term1970743, term1970743.getClass(), "graphicsConfig", null);
        setField(term1970743, term1970743.getClass(), "bufferStrategy", null);
        setBooleanField(term1970743, term1970743.getClass(), "ignoreRepaint", false);
        setBooleanField(term1970743, term1970743.getClass(), "visible", false);
        setBooleanField(term1970743, term1970743.getClass(), "enabled", false);
        setBooleanField(term1970743, term1970743.getClass(), "valid", false);
        setField(term1970743, term1970743.getClass(), "dropTarget", null);
        setField(term1970743, term1970743.getClass(), "popups", null);
        setField(term1970743, term1970743.getClass(), "name", null);
        setBooleanField(term1970743, term1970743.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1970743, term1970743.getClass(), "focusable", false);
        setIntField(term1970743, term1970743.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1970743, term1970743.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1970743, term1970743.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1970743, term1970743.getClass(), "acc", null);
        setField(term1970743, term1970743.getClass(), "minSize", null);
        setBooleanField(term1970743, term1970743.getClass(), "minSizeSet", false);
        setField(term1970743, term1970743.getClass(), "prefSize", null);
        setBooleanField(term1970743, term1970743.getClass(), "prefSizeSet", false);
        setField(term1970743, term1970743.getClass(), "maxSize", null);
        setBooleanField(term1970743, term1970743.getClass(), "maxSizeSet", false);
        setField(term1970743, term1970743.getClass(), "componentOrientation", null);
        setBooleanField(term1970743, term1970743.getClass(), "newEventsOnly", false);
        setField(term1970743, term1970743.getClass(), "componentListener", null);
        setField(term1970743, term1970743.getClass(), "focusListener", null);
        setField(term1970743, term1970743.getClass(), "hierarchyListener", null);
        setField(term1970743, term1970743.getClass(), "hierarchyBoundsListener", null);
        setField(term1970743, term1970743.getClass(), "keyListener", null);
        setField(term1970743, term1970743.getClass(), "mouseListener", null);
        setField(term1970743, term1970743.getClass(), "mouseMotionListener", null);
        setField(term1970743, term1970743.getClass(), "mouseWheelListener", null);
        setField(term1970743, term1970743.getClass(), "inputMethodListener", null);
        setLongField(term1970743, term1970743.getClass(), "eventMask", 0L);
        setField(term1970743, term1970743.getClass(), "changeSupport", null);
        setField(term1970743, term1970743.getClass(), "objectLock", null);
        setBooleanField(term1970743, term1970743.getClass(), "isPacked", false);
        setIntField(term1970743, term1970743.getClass(), "boundsOp", 0);
        setField(term1970743, term1970743.getClass(), "compoundShape", null);
        setField(term1970743, term1970743.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1970743, term1970743.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1970743, term1970743.getClass(), "backgroundEraseDisabled", false);
        setField(term1970743, term1970743.getClass(), "eventCache", null);
        setBooleanField(term1970743, term1970743.getClass(), "coalescingEnabled", false);
        setBooleanField(term1970743, term1970743.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1970743, term1970743.getClass(), "componentSerializedDataVersion", 0);
        setField(term1970743, term1970743.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectedShip", argTypes, term1970743, args);
    }

};


