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
import java.lang.Boolean;

public class ShipDesignView_updatePanels_8853804946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1469148;
     Object term1469192;

    public ShipDesignView_updatePanels_8853804946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1469148 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1469148, term1469148.getClass(), "player", null);
        setField(term1469148, term1469148.getClass(), "design", null);
        setField(term1469148, term1469148.getClass(), "hullSelect", null);
        setField(term1469148, term1469148.getClass(), "componentSelect", null);
        setField(term1469148, term1469148.getClass(), "componentFilter", null);
        setField(term1469148, term1469148.getClass(), "variantSelection", null);
        setField(term1469148, term1469148.getClass(), "hullInfoText", null);
        setField(term1469148, term1469148.getClass(), "componentInfoText", null);
        setField(term1469148, term1469148.getClass(), "designNameText", null);
        setField(term1469148, term1469148.getClass(), "componentList", null);
        setField(term1469148, term1469148.getClass(), "hullImage", null);
        setBooleanField(term1469148, term1469148.getClass(), "illegalName", false);
        setBooleanField(term1469148, term1469148.getClass(), "banPrivateer", false);
        setBooleanField(term1469148, term1469148.getClass(), "banNukes", false);
        setBooleanField(term1469148, term1469148.getClass(), "isAlignmentXSet", false);
        setFloatField(term1469148, term1469148.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1469148, term1469148.getClass(), "isAlignmentYSet", false);
        setFloatField(term1469148, term1469148.getClass(), "alignmentY", 0.0F);
        setField(term1469148, term1469148.getClass(), "ui", null);
        setField(term1469148, term1469148.getClass(), "listenerList", null);
        setField(term1469148, term1469148.getClass(), "clientProperties", null);
        setField(term1469148, term1469148.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1469148, term1469148.getClass(), "autoscrolls", false);
        setField(term1469148, term1469148.getClass(), "border", null);
        setIntField(term1469148, term1469148.getClass(), "flags", 0);
        setField(term1469148, term1469148.getClass(), "inputVerifier", null);
        setBooleanField(term1469148, term1469148.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1469148, term1469148.getClass(), "paintingChild", null);
        setField(term1469148, term1469148.getClass(), "popupMenu", null);
        setField(term1469148, term1469148.getClass(), "revalidateRunnableScheduled", null);
        setField(term1469148, term1469148.getClass(), "focusInputMap", null);
        setField(term1469148, term1469148.getClass(), "ancestorInputMap", null);
        setField(term1469148, term1469148.getClass(), "windowInputMap", null);
        setField(term1469148, term1469148.getClass(), "actionMap", null);
        setField(term1469148, term1469148.getClass(), "aaHint", null);
        setField(term1469148, term1469148.getClass(), "lcdRenderingHint", null);
        setField(term1469148, term1469148.getClass(), "component", null);
        setField(term1469148, term1469148.getClass(), "layoutMgr", null);
        setField(term1469148, term1469148.getClass(), "dispatcher", null);
        setField(term1469148, term1469148.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1469148, term1469148.getClass(), "focusCycleRoot", false);
        setBooleanField(term1469148, term1469148.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1469148, term1469148.getClass(), "printingThreads", null);
        setBooleanField(term1469148, term1469148.getClass(), "printing", false);
        setField(term1469148, term1469148.getClass(), "containerListener", null);
        setIntField(term1469148, term1469148.getClass(), "listeningChildren", 0);
        setIntField(term1469148, term1469148.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1469148, term1469148.getClass(), "descendantsCount", 0);
        setField(term1469148, term1469148.getClass(), "preserveBackgroundColor", null);
        setIntField(term1469148, term1469148.getClass(), "numOfHWComponents", 0);
        setIntField(term1469148, term1469148.getClass(), "numOfLWComponents", 0);
        setField(term1469148, term1469148.getClass(), "modalComp", null);
        setField(term1469148, term1469148.getClass(), "modalAppContext", null);
        setIntField(term1469148, term1469148.getClass(), "containerSerializedDataVersion", 0);
        setField(term1469148, term1469148.getClass(), "peer", null);
        setField(term1469148, term1469148.getClass(), "parent", null);
        setField(term1469148, term1469148.getClass(), "appContext", null);
        setIntField(term1469148, term1469148.getClass(), "x", 0);
        setIntField(term1469148, term1469148.getClass(), "y", 0);
        setIntField(term1469148, term1469148.getClass(), "width", 0);
        setIntField(term1469148, term1469148.getClass(), "height", 0);
        setField(term1469148, term1469148.getClass(), "foreground", null);
        setField(term1469148, term1469148.getClass(), "background", null);
        setField(term1469148, term1469148.getClass(), "font", null);
        setField(term1469148, term1469148.getClass(), "peerFont", null);
        setField(term1469148, term1469148.getClass(), "cursor", null);
        setField(term1469148, term1469148.getClass(), "locale", null);
        setField(term1469148, term1469148.getClass(), "graphicsConfig", null);
        setField(term1469148, term1469148.getClass(), "bufferStrategy", null);
        setBooleanField(term1469148, term1469148.getClass(), "ignoreRepaint", false);
        setBooleanField(term1469148, term1469148.getClass(), "visible", false);
        setBooleanField(term1469148, term1469148.getClass(), "enabled", false);
        setBooleanField(term1469148, term1469148.getClass(), "valid", false);
        setField(term1469148, term1469148.getClass(), "dropTarget", null);
        setField(term1469148, term1469148.getClass(), "popups", null);
        setField(term1469148, term1469148.getClass(), "name", null);
        setBooleanField(term1469148, term1469148.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1469148, term1469148.getClass(), "focusable", false);
        setIntField(term1469148, term1469148.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1469148, term1469148.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1469148, term1469148.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1469148, term1469148.getClass(), "acc", null);
        setField(term1469148, term1469148.getClass(), "minSize", null);
        setBooleanField(term1469148, term1469148.getClass(), "minSizeSet", false);
        setField(term1469148, term1469148.getClass(), "prefSize", null);
        setBooleanField(term1469148, term1469148.getClass(), "prefSizeSet", false);
        setField(term1469148, term1469148.getClass(), "maxSize", null);
        setBooleanField(term1469148, term1469148.getClass(), "maxSizeSet", false);
        setField(term1469148, term1469148.getClass(), "componentOrientation", null);
        setBooleanField(term1469148, term1469148.getClass(), "newEventsOnly", false);
        setField(term1469148, term1469148.getClass(), "componentListener", null);
        setField(term1469148, term1469148.getClass(), "focusListener", null);
        setField(term1469148, term1469148.getClass(), "hierarchyListener", null);
        setField(term1469148, term1469148.getClass(), "hierarchyBoundsListener", null);
        setField(term1469148, term1469148.getClass(), "keyListener", null);
        setField(term1469148, term1469148.getClass(), "mouseListener", null);
        setField(term1469148, term1469148.getClass(), "mouseMotionListener", null);
        setField(term1469148, term1469148.getClass(), "mouseWheelListener", null);
        setField(term1469148, term1469148.getClass(), "inputMethodListener", null);
        setLongField(term1469148, term1469148.getClass(), "eventMask", 0L);
        setField(term1469148, term1469148.getClass(), "changeSupport", null);
        setField(term1469148, term1469148.getClass(), "objectLock", null);
        setBooleanField(term1469148, term1469148.getClass(), "isPacked", false);
        setIntField(term1469148, term1469148.getClass(), "boundsOp", 0);
        setField(term1469148, term1469148.getClass(), "compoundShape", null);
        setField(term1469148, term1469148.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1469148, term1469148.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1469148, term1469148.getClass(), "backgroundEraseDisabled", false);
        setField(term1469148, term1469148.getClass(), "eventCache", null);
        setBooleanField(term1469148, term1469148.getClass(), "coalescingEnabled", false);
        setBooleanField(term1469148, term1469148.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1469148, term1469148.getClass(), "componentSerializedDataVersion", 0);
        setField(term1469148, term1469148.getClass(), "accessibleContext", null);
        term1469192 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1469192;
        callMethod(klass, "updatePanels", argTypes, term1469148, args);
    }

};


