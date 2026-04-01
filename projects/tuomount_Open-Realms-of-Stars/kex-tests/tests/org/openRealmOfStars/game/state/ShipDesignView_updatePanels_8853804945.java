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

public class ShipDesignView_updatePanels_8853804945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1426804;
     Object term1426848;

    public ShipDesignView_updatePanels_8853804945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1426804 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1426804, term1426804.getClass(), "player", null);
        setField(term1426804, term1426804.getClass(), "design", null);
        setField(term1426804, term1426804.getClass(), "hullSelect", null);
        setField(term1426804, term1426804.getClass(), "componentSelect", null);
        setField(term1426804, term1426804.getClass(), "componentFilter", null);
        setField(term1426804, term1426804.getClass(), "variantSelection", null);
        setField(term1426804, term1426804.getClass(), "hullInfoText", null);
        setField(term1426804, term1426804.getClass(), "componentInfoText", null);
        setField(term1426804, term1426804.getClass(), "designNameText", null);
        setField(term1426804, term1426804.getClass(), "componentList", null);
        setField(term1426804, term1426804.getClass(), "hullImage", null);
        setBooleanField(term1426804, term1426804.getClass(), "illegalName", false);
        setBooleanField(term1426804, term1426804.getClass(), "banPrivateer", false);
        setBooleanField(term1426804, term1426804.getClass(), "banNukes", false);
        setBooleanField(term1426804, term1426804.getClass(), "isAlignmentXSet", false);
        setFloatField(term1426804, term1426804.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1426804, term1426804.getClass(), "isAlignmentYSet", false);
        setFloatField(term1426804, term1426804.getClass(), "alignmentY", 0.0F);
        setField(term1426804, term1426804.getClass(), "ui", null);
        setField(term1426804, term1426804.getClass(), "listenerList", null);
        setField(term1426804, term1426804.getClass(), "clientProperties", null);
        setField(term1426804, term1426804.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1426804, term1426804.getClass(), "autoscrolls", false);
        setField(term1426804, term1426804.getClass(), "border", null);
        setIntField(term1426804, term1426804.getClass(), "flags", 0);
        setField(term1426804, term1426804.getClass(), "inputVerifier", null);
        setBooleanField(term1426804, term1426804.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1426804, term1426804.getClass(), "paintingChild", null);
        setField(term1426804, term1426804.getClass(), "popupMenu", null);
        setField(term1426804, term1426804.getClass(), "revalidateRunnableScheduled", null);
        setField(term1426804, term1426804.getClass(), "focusInputMap", null);
        setField(term1426804, term1426804.getClass(), "ancestorInputMap", null);
        setField(term1426804, term1426804.getClass(), "windowInputMap", null);
        setField(term1426804, term1426804.getClass(), "actionMap", null);
        setField(term1426804, term1426804.getClass(), "aaHint", null);
        setField(term1426804, term1426804.getClass(), "lcdRenderingHint", null);
        setField(term1426804, term1426804.getClass(), "component", null);
        setField(term1426804, term1426804.getClass(), "layoutMgr", null);
        setField(term1426804, term1426804.getClass(), "dispatcher", null);
        setField(term1426804, term1426804.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1426804, term1426804.getClass(), "focusCycleRoot", false);
        setBooleanField(term1426804, term1426804.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1426804, term1426804.getClass(), "printingThreads", null);
        setBooleanField(term1426804, term1426804.getClass(), "printing", false);
        setField(term1426804, term1426804.getClass(), "containerListener", null);
        setIntField(term1426804, term1426804.getClass(), "listeningChildren", 0);
        setIntField(term1426804, term1426804.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1426804, term1426804.getClass(), "descendantsCount", 0);
        setField(term1426804, term1426804.getClass(), "preserveBackgroundColor", null);
        setIntField(term1426804, term1426804.getClass(), "numOfHWComponents", 0);
        setIntField(term1426804, term1426804.getClass(), "numOfLWComponents", 0);
        setField(term1426804, term1426804.getClass(), "modalComp", null);
        setField(term1426804, term1426804.getClass(), "modalAppContext", null);
        setIntField(term1426804, term1426804.getClass(), "containerSerializedDataVersion", 0);
        setField(term1426804, term1426804.getClass(), "peer", null);
        setField(term1426804, term1426804.getClass(), "parent", null);
        setField(term1426804, term1426804.getClass(), "appContext", null);
        setIntField(term1426804, term1426804.getClass(), "x", 0);
        setIntField(term1426804, term1426804.getClass(), "y", 0);
        setIntField(term1426804, term1426804.getClass(), "width", 0);
        setIntField(term1426804, term1426804.getClass(), "height", 0);
        setField(term1426804, term1426804.getClass(), "foreground", null);
        setField(term1426804, term1426804.getClass(), "background", null);
        setField(term1426804, term1426804.getClass(), "font", null);
        setField(term1426804, term1426804.getClass(), "peerFont", null);
        setField(term1426804, term1426804.getClass(), "cursor", null);
        setField(term1426804, term1426804.getClass(), "locale", null);
        setField(term1426804, term1426804.getClass(), "graphicsConfig", null);
        setField(term1426804, term1426804.getClass(), "bufferStrategy", null);
        setBooleanField(term1426804, term1426804.getClass(), "ignoreRepaint", false);
        setBooleanField(term1426804, term1426804.getClass(), "visible", false);
        setBooleanField(term1426804, term1426804.getClass(), "enabled", false);
        setBooleanField(term1426804, term1426804.getClass(), "valid", false);
        setField(term1426804, term1426804.getClass(), "dropTarget", null);
        setField(term1426804, term1426804.getClass(), "popups", null);
        setField(term1426804, term1426804.getClass(), "name", null);
        setBooleanField(term1426804, term1426804.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1426804, term1426804.getClass(), "focusable", false);
        setIntField(term1426804, term1426804.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1426804, term1426804.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1426804, term1426804.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1426804, term1426804.getClass(), "acc", null);
        setField(term1426804, term1426804.getClass(), "minSize", null);
        setBooleanField(term1426804, term1426804.getClass(), "minSizeSet", false);
        setField(term1426804, term1426804.getClass(), "prefSize", null);
        setBooleanField(term1426804, term1426804.getClass(), "prefSizeSet", false);
        setField(term1426804, term1426804.getClass(), "maxSize", null);
        setBooleanField(term1426804, term1426804.getClass(), "maxSizeSet", false);
        setField(term1426804, term1426804.getClass(), "componentOrientation", null);
        setBooleanField(term1426804, term1426804.getClass(), "newEventsOnly", false);
        setField(term1426804, term1426804.getClass(), "componentListener", null);
        setField(term1426804, term1426804.getClass(), "focusListener", null);
        setField(term1426804, term1426804.getClass(), "hierarchyListener", null);
        setField(term1426804, term1426804.getClass(), "hierarchyBoundsListener", null);
        setField(term1426804, term1426804.getClass(), "keyListener", null);
        setField(term1426804, term1426804.getClass(), "mouseListener", null);
        setField(term1426804, term1426804.getClass(), "mouseMotionListener", null);
        setField(term1426804, term1426804.getClass(), "mouseWheelListener", null);
        setField(term1426804, term1426804.getClass(), "inputMethodListener", null);
        setLongField(term1426804, term1426804.getClass(), "eventMask", 0L);
        setField(term1426804, term1426804.getClass(), "changeSupport", null);
        setField(term1426804, term1426804.getClass(), "objectLock", null);
        setBooleanField(term1426804, term1426804.getClass(), "isPacked", false);
        setIntField(term1426804, term1426804.getClass(), "boundsOp", 0);
        setField(term1426804, term1426804.getClass(), "compoundShape", null);
        setField(term1426804, term1426804.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1426804, term1426804.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1426804, term1426804.getClass(), "backgroundEraseDisabled", false);
        setField(term1426804, term1426804.getClass(), "eventCache", null);
        setBooleanField(term1426804, term1426804.getClass(), "coalescingEnabled", false);
        setBooleanField(term1426804, term1426804.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1426804, term1426804.getClass(), "componentSerializedDataVersion", 0);
        setField(term1426804, term1426804.getClass(), "accessibleContext", null);
        term1426848 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1426848;
        callMethod(klass, "updatePanels", argTypes, term1426804, args);
    }

};


