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

public class ShipDesignView_updateVariants_19446288477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1435504;

    public ShipDesignView_updateVariants_19446288477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1435504 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1435504, term1435504.getClass(), "player", null);
        setField(term1435504, term1435504.getClass(), "design", null);
        setField(term1435504, term1435504.getClass(), "hullSelect", null);
        setField(term1435504, term1435504.getClass(), "componentSelect", null);
        setField(term1435504, term1435504.getClass(), "componentFilter", null);
        setField(term1435504, term1435504.getClass(), "variantSelection", null);
        setField(term1435504, term1435504.getClass(), "hullInfoText", null);
        setField(term1435504, term1435504.getClass(), "componentInfoText", null);
        setField(term1435504, term1435504.getClass(), "designNameText", null);
        setField(term1435504, term1435504.getClass(), "componentList", null);
        setField(term1435504, term1435504.getClass(), "hullImage", null);
        setBooleanField(term1435504, term1435504.getClass(), "illegalName", false);
        setBooleanField(term1435504, term1435504.getClass(), "banPrivateer", false);
        setBooleanField(term1435504, term1435504.getClass(), "banNukes", false);
        setBooleanField(term1435504, term1435504.getClass(), "isAlignmentXSet", false);
        setFloatField(term1435504, term1435504.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1435504, term1435504.getClass(), "isAlignmentYSet", false);
        setFloatField(term1435504, term1435504.getClass(), "alignmentY", 0.0F);
        setField(term1435504, term1435504.getClass(), "ui", null);
        setField(term1435504, term1435504.getClass(), "listenerList", null);
        setField(term1435504, term1435504.getClass(), "clientProperties", null);
        setField(term1435504, term1435504.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1435504, term1435504.getClass(), "autoscrolls", false);
        setField(term1435504, term1435504.getClass(), "border", null);
        setIntField(term1435504, term1435504.getClass(), "flags", 0);
        setField(term1435504, term1435504.getClass(), "inputVerifier", null);
        setBooleanField(term1435504, term1435504.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1435504, term1435504.getClass(), "paintingChild", null);
        setField(term1435504, term1435504.getClass(), "popupMenu", null);
        setField(term1435504, term1435504.getClass(), "revalidateRunnableScheduled", null);
        setField(term1435504, term1435504.getClass(), "focusInputMap", null);
        setField(term1435504, term1435504.getClass(), "ancestorInputMap", null);
        setField(term1435504, term1435504.getClass(), "windowInputMap", null);
        setField(term1435504, term1435504.getClass(), "actionMap", null);
        setField(term1435504, term1435504.getClass(), "aaHint", null);
        setField(term1435504, term1435504.getClass(), "lcdRenderingHint", null);
        setField(term1435504, term1435504.getClass(), "component", null);
        setField(term1435504, term1435504.getClass(), "layoutMgr", null);
        setField(term1435504, term1435504.getClass(), "dispatcher", null);
        setField(term1435504, term1435504.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1435504, term1435504.getClass(), "focusCycleRoot", false);
        setBooleanField(term1435504, term1435504.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1435504, term1435504.getClass(), "printingThreads", null);
        setBooleanField(term1435504, term1435504.getClass(), "printing", false);
        setField(term1435504, term1435504.getClass(), "containerListener", null);
        setIntField(term1435504, term1435504.getClass(), "listeningChildren", 0);
        setIntField(term1435504, term1435504.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1435504, term1435504.getClass(), "descendantsCount", 0);
        setField(term1435504, term1435504.getClass(), "preserveBackgroundColor", null);
        setIntField(term1435504, term1435504.getClass(), "numOfHWComponents", 0);
        setIntField(term1435504, term1435504.getClass(), "numOfLWComponents", 0);
        setField(term1435504, term1435504.getClass(), "modalComp", null);
        setField(term1435504, term1435504.getClass(), "modalAppContext", null);
        setIntField(term1435504, term1435504.getClass(), "containerSerializedDataVersion", 0);
        setField(term1435504, term1435504.getClass(), "peer", null);
        setField(term1435504, term1435504.getClass(), "parent", null);
        setField(term1435504, term1435504.getClass(), "appContext", null);
        setIntField(term1435504, term1435504.getClass(), "x", 0);
        setIntField(term1435504, term1435504.getClass(), "y", 0);
        setIntField(term1435504, term1435504.getClass(), "width", 0);
        setIntField(term1435504, term1435504.getClass(), "height", 0);
        setField(term1435504, term1435504.getClass(), "foreground", null);
        setField(term1435504, term1435504.getClass(), "background", null);
        setField(term1435504, term1435504.getClass(), "font", null);
        setField(term1435504, term1435504.getClass(), "peerFont", null);
        setField(term1435504, term1435504.getClass(), "cursor", null);
        setField(term1435504, term1435504.getClass(), "locale", null);
        setField(term1435504, term1435504.getClass(), "graphicsConfig", null);
        setField(term1435504, term1435504.getClass(), "bufferStrategy", null);
        setBooleanField(term1435504, term1435504.getClass(), "ignoreRepaint", false);
        setBooleanField(term1435504, term1435504.getClass(), "visible", false);
        setBooleanField(term1435504, term1435504.getClass(), "enabled", false);
        setBooleanField(term1435504, term1435504.getClass(), "valid", false);
        setField(term1435504, term1435504.getClass(), "dropTarget", null);
        setField(term1435504, term1435504.getClass(), "popups", null);
        setField(term1435504, term1435504.getClass(), "name", null);
        setBooleanField(term1435504, term1435504.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1435504, term1435504.getClass(), "focusable", false);
        setIntField(term1435504, term1435504.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1435504, term1435504.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1435504, term1435504.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1435504, term1435504.getClass(), "acc", null);
        setField(term1435504, term1435504.getClass(), "minSize", null);
        setBooleanField(term1435504, term1435504.getClass(), "minSizeSet", false);
        setField(term1435504, term1435504.getClass(), "prefSize", null);
        setBooleanField(term1435504, term1435504.getClass(), "prefSizeSet", false);
        setField(term1435504, term1435504.getClass(), "maxSize", null);
        setBooleanField(term1435504, term1435504.getClass(), "maxSizeSet", false);
        setField(term1435504, term1435504.getClass(), "componentOrientation", null);
        setBooleanField(term1435504, term1435504.getClass(), "newEventsOnly", false);
        setField(term1435504, term1435504.getClass(), "componentListener", null);
        setField(term1435504, term1435504.getClass(), "focusListener", null);
        setField(term1435504, term1435504.getClass(), "hierarchyListener", null);
        setField(term1435504, term1435504.getClass(), "hierarchyBoundsListener", null);
        setField(term1435504, term1435504.getClass(), "keyListener", null);
        setField(term1435504, term1435504.getClass(), "mouseListener", null);
        setField(term1435504, term1435504.getClass(), "mouseMotionListener", null);
        setField(term1435504, term1435504.getClass(), "mouseWheelListener", null);
        setField(term1435504, term1435504.getClass(), "inputMethodListener", null);
        setLongField(term1435504, term1435504.getClass(), "eventMask", 0L);
        setField(term1435504, term1435504.getClass(), "changeSupport", null);
        setField(term1435504, term1435504.getClass(), "objectLock", null);
        setBooleanField(term1435504, term1435504.getClass(), "isPacked", false);
        setIntField(term1435504, term1435504.getClass(), "boundsOp", 0);
        setField(term1435504, term1435504.getClass(), "compoundShape", null);
        setField(term1435504, term1435504.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1435504, term1435504.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1435504, term1435504.getClass(), "backgroundEraseDisabled", false);
        setField(term1435504, term1435504.getClass(), "eventCache", null);
        setBooleanField(term1435504, term1435504.getClass(), "coalescingEnabled", false);
        setBooleanField(term1435504, term1435504.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1435504, term1435504.getClass(), "componentSerializedDataVersion", 0);
        setField(term1435504, term1435504.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateVariants", argTypes, term1435504, args);
    }

};


