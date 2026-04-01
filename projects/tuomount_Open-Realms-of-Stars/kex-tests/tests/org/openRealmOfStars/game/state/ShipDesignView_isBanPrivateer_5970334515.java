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

public class ShipDesignView_isBanPrivateer_5970334515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1470097;

    public ShipDesignView_isBanPrivateer_5970334515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1470097 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1470097, term1470097.getClass(), "player", null);
        setField(term1470097, term1470097.getClass(), "design", null);
        setField(term1470097, term1470097.getClass(), "hullSelect", null);
        setField(term1470097, term1470097.getClass(), "componentSelect", null);
        setField(term1470097, term1470097.getClass(), "componentFilter", null);
        setField(term1470097, term1470097.getClass(), "variantSelection", null);
        setField(term1470097, term1470097.getClass(), "hullInfoText", null);
        setField(term1470097, term1470097.getClass(), "componentInfoText", null);
        setField(term1470097, term1470097.getClass(), "designNameText", null);
        setField(term1470097, term1470097.getClass(), "componentList", null);
        setField(term1470097, term1470097.getClass(), "hullImage", null);
        setBooleanField(term1470097, term1470097.getClass(), "illegalName", false);
        setBooleanField(term1470097, term1470097.getClass(), "banPrivateer", false);
        setBooleanField(term1470097, term1470097.getClass(), "banNukes", false);
        setBooleanField(term1470097, term1470097.getClass(), "isAlignmentXSet", false);
        setFloatField(term1470097, term1470097.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1470097, term1470097.getClass(), "isAlignmentYSet", false);
        setFloatField(term1470097, term1470097.getClass(), "alignmentY", 0.0F);
        setField(term1470097, term1470097.getClass(), "ui", null);
        setField(term1470097, term1470097.getClass(), "listenerList", null);
        setField(term1470097, term1470097.getClass(), "clientProperties", null);
        setField(term1470097, term1470097.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1470097, term1470097.getClass(), "autoscrolls", false);
        setField(term1470097, term1470097.getClass(), "border", null);
        setIntField(term1470097, term1470097.getClass(), "flags", 0);
        setField(term1470097, term1470097.getClass(), "inputVerifier", null);
        setBooleanField(term1470097, term1470097.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1470097, term1470097.getClass(), "paintingChild", null);
        setField(term1470097, term1470097.getClass(), "popupMenu", null);
        setField(term1470097, term1470097.getClass(), "revalidateRunnableScheduled", null);
        setField(term1470097, term1470097.getClass(), "focusInputMap", null);
        setField(term1470097, term1470097.getClass(), "ancestorInputMap", null);
        setField(term1470097, term1470097.getClass(), "windowInputMap", null);
        setField(term1470097, term1470097.getClass(), "actionMap", null);
        setField(term1470097, term1470097.getClass(), "aaHint", null);
        setField(term1470097, term1470097.getClass(), "lcdRenderingHint", null);
        setField(term1470097, term1470097.getClass(), "component", null);
        setField(term1470097, term1470097.getClass(), "layoutMgr", null);
        setField(term1470097, term1470097.getClass(), "dispatcher", null);
        setField(term1470097, term1470097.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1470097, term1470097.getClass(), "focusCycleRoot", false);
        setBooleanField(term1470097, term1470097.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1470097, term1470097.getClass(), "printingThreads", null);
        setBooleanField(term1470097, term1470097.getClass(), "printing", false);
        setField(term1470097, term1470097.getClass(), "containerListener", null);
        setIntField(term1470097, term1470097.getClass(), "listeningChildren", 0);
        setIntField(term1470097, term1470097.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1470097, term1470097.getClass(), "descendantsCount", 0);
        setField(term1470097, term1470097.getClass(), "preserveBackgroundColor", null);
        setIntField(term1470097, term1470097.getClass(), "numOfHWComponents", 0);
        setIntField(term1470097, term1470097.getClass(), "numOfLWComponents", 0);
        setField(term1470097, term1470097.getClass(), "modalComp", null);
        setField(term1470097, term1470097.getClass(), "modalAppContext", null);
        setIntField(term1470097, term1470097.getClass(), "containerSerializedDataVersion", 0);
        setField(term1470097, term1470097.getClass(), "peer", null);
        setField(term1470097, term1470097.getClass(), "parent", null);
        setField(term1470097, term1470097.getClass(), "appContext", null);
        setIntField(term1470097, term1470097.getClass(), "x", 0);
        setIntField(term1470097, term1470097.getClass(), "y", 0);
        setIntField(term1470097, term1470097.getClass(), "width", 0);
        setIntField(term1470097, term1470097.getClass(), "height", 0);
        setField(term1470097, term1470097.getClass(), "foreground", null);
        setField(term1470097, term1470097.getClass(), "background", null);
        setField(term1470097, term1470097.getClass(), "font", null);
        setField(term1470097, term1470097.getClass(), "peerFont", null);
        setField(term1470097, term1470097.getClass(), "cursor", null);
        setField(term1470097, term1470097.getClass(), "locale", null);
        setField(term1470097, term1470097.getClass(), "graphicsConfig", null);
        setField(term1470097, term1470097.getClass(), "bufferStrategy", null);
        setBooleanField(term1470097, term1470097.getClass(), "ignoreRepaint", false);
        setBooleanField(term1470097, term1470097.getClass(), "visible", false);
        setBooleanField(term1470097, term1470097.getClass(), "enabled", false);
        setBooleanField(term1470097, term1470097.getClass(), "valid", false);
        setField(term1470097, term1470097.getClass(), "dropTarget", null);
        setField(term1470097, term1470097.getClass(), "popups", null);
        setField(term1470097, term1470097.getClass(), "name", null);
        setBooleanField(term1470097, term1470097.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1470097, term1470097.getClass(), "focusable", false);
        setIntField(term1470097, term1470097.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1470097, term1470097.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1470097, term1470097.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1470097, term1470097.getClass(), "acc", null);
        setField(term1470097, term1470097.getClass(), "minSize", null);
        setBooleanField(term1470097, term1470097.getClass(), "minSizeSet", false);
        setField(term1470097, term1470097.getClass(), "prefSize", null);
        setBooleanField(term1470097, term1470097.getClass(), "prefSizeSet", false);
        setField(term1470097, term1470097.getClass(), "maxSize", null);
        setBooleanField(term1470097, term1470097.getClass(), "maxSizeSet", false);
        setField(term1470097, term1470097.getClass(), "componentOrientation", null);
        setBooleanField(term1470097, term1470097.getClass(), "newEventsOnly", false);
        setField(term1470097, term1470097.getClass(), "componentListener", null);
        setField(term1470097, term1470097.getClass(), "focusListener", null);
        setField(term1470097, term1470097.getClass(), "hierarchyListener", null);
        setField(term1470097, term1470097.getClass(), "hierarchyBoundsListener", null);
        setField(term1470097, term1470097.getClass(), "keyListener", null);
        setField(term1470097, term1470097.getClass(), "mouseListener", null);
        setField(term1470097, term1470097.getClass(), "mouseMotionListener", null);
        setField(term1470097, term1470097.getClass(), "mouseWheelListener", null);
        setField(term1470097, term1470097.getClass(), "inputMethodListener", null);
        setLongField(term1470097, term1470097.getClass(), "eventMask", 0L);
        setField(term1470097, term1470097.getClass(), "changeSupport", null);
        setField(term1470097, term1470097.getClass(), "objectLock", null);
        setBooleanField(term1470097, term1470097.getClass(), "isPacked", false);
        setIntField(term1470097, term1470097.getClass(), "boundsOp", 0);
        setField(term1470097, term1470097.getClass(), "compoundShape", null);
        setField(term1470097, term1470097.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1470097, term1470097.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1470097, term1470097.getClass(), "backgroundEraseDisabled", false);
        setField(term1470097, term1470097.getClass(), "eventCache", null);
        setBooleanField(term1470097, term1470097.getClass(), "coalescingEnabled", false);
        setBooleanField(term1470097, term1470097.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1470097, term1470097.getClass(), "componentSerializedDataVersion", 0);
        setField(term1470097, term1470097.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBanPrivateer", argTypes, term1470097, args);
    }

};


