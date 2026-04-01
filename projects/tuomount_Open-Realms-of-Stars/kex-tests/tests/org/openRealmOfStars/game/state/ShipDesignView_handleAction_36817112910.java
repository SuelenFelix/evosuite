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

public class ShipDesignView_handleAction_36817112910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1485677;

    public ShipDesignView_handleAction_36817112910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1485677 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1485677, term1485677.getClass(), "player", null);
        setField(term1485677, term1485677.getClass(), "design", null);
        setField(term1485677, term1485677.getClass(), "hullSelect", null);
        setField(term1485677, term1485677.getClass(), "componentSelect", null);
        setField(term1485677, term1485677.getClass(), "componentFilter", null);
        setField(term1485677, term1485677.getClass(), "variantSelection", null);
        setField(term1485677, term1485677.getClass(), "hullInfoText", null);
        setField(term1485677, term1485677.getClass(), "componentInfoText", null);
        setField(term1485677, term1485677.getClass(), "designNameText", null);
        setField(term1485677, term1485677.getClass(), "componentList", null);
        setField(term1485677, term1485677.getClass(), "hullImage", null);
        setBooleanField(term1485677, term1485677.getClass(), "illegalName", false);
        setBooleanField(term1485677, term1485677.getClass(), "banPrivateer", false);
        setBooleanField(term1485677, term1485677.getClass(), "banNukes", false);
        setBooleanField(term1485677, term1485677.getClass(), "isAlignmentXSet", false);
        setFloatField(term1485677, term1485677.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1485677, term1485677.getClass(), "isAlignmentYSet", false);
        setFloatField(term1485677, term1485677.getClass(), "alignmentY", 0.0F);
        setField(term1485677, term1485677.getClass(), "ui", null);
        setField(term1485677, term1485677.getClass(), "listenerList", null);
        setField(term1485677, term1485677.getClass(), "clientProperties", null);
        setField(term1485677, term1485677.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1485677, term1485677.getClass(), "autoscrolls", false);
        setField(term1485677, term1485677.getClass(), "border", null);
        setIntField(term1485677, term1485677.getClass(), "flags", 0);
        setField(term1485677, term1485677.getClass(), "inputVerifier", null);
        setBooleanField(term1485677, term1485677.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1485677, term1485677.getClass(), "paintingChild", null);
        setField(term1485677, term1485677.getClass(), "popupMenu", null);
        setField(term1485677, term1485677.getClass(), "revalidateRunnableScheduled", null);
        setField(term1485677, term1485677.getClass(), "focusInputMap", null);
        setField(term1485677, term1485677.getClass(), "ancestorInputMap", null);
        setField(term1485677, term1485677.getClass(), "windowInputMap", null);
        setField(term1485677, term1485677.getClass(), "actionMap", null);
        setField(term1485677, term1485677.getClass(), "aaHint", null);
        setField(term1485677, term1485677.getClass(), "lcdRenderingHint", null);
        setField(term1485677, term1485677.getClass(), "component", null);
        setField(term1485677, term1485677.getClass(), "layoutMgr", null);
        setField(term1485677, term1485677.getClass(), "dispatcher", null);
        setField(term1485677, term1485677.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1485677, term1485677.getClass(), "focusCycleRoot", false);
        setBooleanField(term1485677, term1485677.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1485677, term1485677.getClass(), "printingThreads", null);
        setBooleanField(term1485677, term1485677.getClass(), "printing", false);
        setField(term1485677, term1485677.getClass(), "containerListener", null);
        setIntField(term1485677, term1485677.getClass(), "listeningChildren", 0);
        setIntField(term1485677, term1485677.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1485677, term1485677.getClass(), "descendantsCount", 0);
        setField(term1485677, term1485677.getClass(), "preserveBackgroundColor", null);
        setIntField(term1485677, term1485677.getClass(), "numOfHWComponents", 0);
        setIntField(term1485677, term1485677.getClass(), "numOfLWComponents", 0);
        setField(term1485677, term1485677.getClass(), "modalComp", null);
        setField(term1485677, term1485677.getClass(), "modalAppContext", null);
        setIntField(term1485677, term1485677.getClass(), "containerSerializedDataVersion", 0);
        setField(term1485677, term1485677.getClass(), "peer", null);
        setField(term1485677, term1485677.getClass(), "parent", null);
        setField(term1485677, term1485677.getClass(), "appContext", null);
        setIntField(term1485677, term1485677.getClass(), "x", 0);
        setIntField(term1485677, term1485677.getClass(), "y", 0);
        setIntField(term1485677, term1485677.getClass(), "width", 0);
        setIntField(term1485677, term1485677.getClass(), "height", 0);
        setField(term1485677, term1485677.getClass(), "foreground", null);
        setField(term1485677, term1485677.getClass(), "background", null);
        setField(term1485677, term1485677.getClass(), "font", null);
        setField(term1485677, term1485677.getClass(), "peerFont", null);
        setField(term1485677, term1485677.getClass(), "cursor", null);
        setField(term1485677, term1485677.getClass(), "locale", null);
        setField(term1485677, term1485677.getClass(), "graphicsConfig", null);
        setField(term1485677, term1485677.getClass(), "bufferStrategy", null);
        setBooleanField(term1485677, term1485677.getClass(), "ignoreRepaint", false);
        setBooleanField(term1485677, term1485677.getClass(), "visible", false);
        setBooleanField(term1485677, term1485677.getClass(), "enabled", false);
        setBooleanField(term1485677, term1485677.getClass(), "valid", false);
        setField(term1485677, term1485677.getClass(), "dropTarget", null);
        setField(term1485677, term1485677.getClass(), "popups", null);
        setField(term1485677, term1485677.getClass(), "name", null);
        setBooleanField(term1485677, term1485677.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1485677, term1485677.getClass(), "focusable", false);
        setIntField(term1485677, term1485677.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1485677, term1485677.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1485677, term1485677.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1485677, term1485677.getClass(), "acc", null);
        setField(term1485677, term1485677.getClass(), "minSize", null);
        setBooleanField(term1485677, term1485677.getClass(), "minSizeSet", false);
        setField(term1485677, term1485677.getClass(), "prefSize", null);
        setBooleanField(term1485677, term1485677.getClass(), "prefSizeSet", false);
        setField(term1485677, term1485677.getClass(), "maxSize", null);
        setBooleanField(term1485677, term1485677.getClass(), "maxSizeSet", false);
        setField(term1485677, term1485677.getClass(), "componentOrientation", null);
        setBooleanField(term1485677, term1485677.getClass(), "newEventsOnly", false);
        setField(term1485677, term1485677.getClass(), "componentListener", null);
        setField(term1485677, term1485677.getClass(), "focusListener", null);
        setField(term1485677, term1485677.getClass(), "hierarchyListener", null);
        setField(term1485677, term1485677.getClass(), "hierarchyBoundsListener", null);
        setField(term1485677, term1485677.getClass(), "keyListener", null);
        setField(term1485677, term1485677.getClass(), "mouseListener", null);
        setField(term1485677, term1485677.getClass(), "mouseMotionListener", null);
        setField(term1485677, term1485677.getClass(), "mouseWheelListener", null);
        setField(term1485677, term1485677.getClass(), "inputMethodListener", null);
        setLongField(term1485677, term1485677.getClass(), "eventMask", 0L);
        setField(term1485677, term1485677.getClass(), "changeSupport", null);
        setField(term1485677, term1485677.getClass(), "objectLock", null);
        setBooleanField(term1485677, term1485677.getClass(), "isPacked", false);
        setIntField(term1485677, term1485677.getClass(), "boundsOp", 0);
        setField(term1485677, term1485677.getClass(), "compoundShape", null);
        setField(term1485677, term1485677.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1485677, term1485677.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1485677, term1485677.getClass(), "backgroundEraseDisabled", false);
        setField(term1485677, term1485677.getClass(), "eventCache", null);
        setBooleanField(term1485677, term1485677.getClass(), "coalescingEnabled", false);
        setBooleanField(term1485677, term1485677.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1485677, term1485677.getClass(), "componentSerializedDataVersion", 0);
        setField(term1485677, term1485677.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term1485677, args);
    }

};


