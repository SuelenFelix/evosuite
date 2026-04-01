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

public class ShipDesignView_setBanPrivateer_21043666917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1478361;
     Object term1478405;

    public ShipDesignView_setBanPrivateer_21043666917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1478361 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1478361, term1478361.getClass(), "player", null);
        setField(term1478361, term1478361.getClass(), "design", null);
        setField(term1478361, term1478361.getClass(), "hullSelect", null);
        setField(term1478361, term1478361.getClass(), "componentSelect", null);
        setField(term1478361, term1478361.getClass(), "componentFilter", null);
        setField(term1478361, term1478361.getClass(), "variantSelection", null);
        setField(term1478361, term1478361.getClass(), "hullInfoText", null);
        setField(term1478361, term1478361.getClass(), "componentInfoText", null);
        setField(term1478361, term1478361.getClass(), "designNameText", null);
        setField(term1478361, term1478361.getClass(), "componentList", null);
        setField(term1478361, term1478361.getClass(), "hullImage", null);
        setBooleanField(term1478361, term1478361.getClass(), "illegalName", false);
        setBooleanField(term1478361, term1478361.getClass(), "banPrivateer", false);
        setBooleanField(term1478361, term1478361.getClass(), "banNukes", false);
        setBooleanField(term1478361, term1478361.getClass(), "isAlignmentXSet", false);
        setFloatField(term1478361, term1478361.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1478361, term1478361.getClass(), "isAlignmentYSet", false);
        setFloatField(term1478361, term1478361.getClass(), "alignmentY", 0.0F);
        setField(term1478361, term1478361.getClass(), "ui", null);
        setField(term1478361, term1478361.getClass(), "listenerList", null);
        setField(term1478361, term1478361.getClass(), "clientProperties", null);
        setField(term1478361, term1478361.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1478361, term1478361.getClass(), "autoscrolls", false);
        setField(term1478361, term1478361.getClass(), "border", null);
        setIntField(term1478361, term1478361.getClass(), "flags", 0);
        setField(term1478361, term1478361.getClass(), "inputVerifier", null);
        setBooleanField(term1478361, term1478361.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1478361, term1478361.getClass(), "paintingChild", null);
        setField(term1478361, term1478361.getClass(), "popupMenu", null);
        setField(term1478361, term1478361.getClass(), "revalidateRunnableScheduled", null);
        setField(term1478361, term1478361.getClass(), "focusInputMap", null);
        setField(term1478361, term1478361.getClass(), "ancestorInputMap", null);
        setField(term1478361, term1478361.getClass(), "windowInputMap", null);
        setField(term1478361, term1478361.getClass(), "actionMap", null);
        setField(term1478361, term1478361.getClass(), "aaHint", null);
        setField(term1478361, term1478361.getClass(), "lcdRenderingHint", null);
        setField(term1478361, term1478361.getClass(), "component", null);
        setField(term1478361, term1478361.getClass(), "layoutMgr", null);
        setField(term1478361, term1478361.getClass(), "dispatcher", null);
        setField(term1478361, term1478361.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1478361, term1478361.getClass(), "focusCycleRoot", false);
        setBooleanField(term1478361, term1478361.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1478361, term1478361.getClass(), "printingThreads", null);
        setBooleanField(term1478361, term1478361.getClass(), "printing", false);
        setField(term1478361, term1478361.getClass(), "containerListener", null);
        setIntField(term1478361, term1478361.getClass(), "listeningChildren", 0);
        setIntField(term1478361, term1478361.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1478361, term1478361.getClass(), "descendantsCount", 0);
        setField(term1478361, term1478361.getClass(), "preserveBackgroundColor", null);
        setIntField(term1478361, term1478361.getClass(), "numOfHWComponents", 0);
        setIntField(term1478361, term1478361.getClass(), "numOfLWComponents", 0);
        setField(term1478361, term1478361.getClass(), "modalComp", null);
        setField(term1478361, term1478361.getClass(), "modalAppContext", null);
        setIntField(term1478361, term1478361.getClass(), "containerSerializedDataVersion", 0);
        setField(term1478361, term1478361.getClass(), "peer", null);
        setField(term1478361, term1478361.getClass(), "parent", null);
        setField(term1478361, term1478361.getClass(), "appContext", null);
        setIntField(term1478361, term1478361.getClass(), "x", 0);
        setIntField(term1478361, term1478361.getClass(), "y", 0);
        setIntField(term1478361, term1478361.getClass(), "width", 0);
        setIntField(term1478361, term1478361.getClass(), "height", 0);
        setField(term1478361, term1478361.getClass(), "foreground", null);
        setField(term1478361, term1478361.getClass(), "background", null);
        setField(term1478361, term1478361.getClass(), "font", null);
        setField(term1478361, term1478361.getClass(), "peerFont", null);
        setField(term1478361, term1478361.getClass(), "cursor", null);
        setField(term1478361, term1478361.getClass(), "locale", null);
        setField(term1478361, term1478361.getClass(), "graphicsConfig", null);
        setField(term1478361, term1478361.getClass(), "bufferStrategy", null);
        setBooleanField(term1478361, term1478361.getClass(), "ignoreRepaint", false);
        setBooleanField(term1478361, term1478361.getClass(), "visible", false);
        setBooleanField(term1478361, term1478361.getClass(), "enabled", false);
        setBooleanField(term1478361, term1478361.getClass(), "valid", false);
        setField(term1478361, term1478361.getClass(), "dropTarget", null);
        setField(term1478361, term1478361.getClass(), "popups", null);
        setField(term1478361, term1478361.getClass(), "name", null);
        setBooleanField(term1478361, term1478361.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1478361, term1478361.getClass(), "focusable", false);
        setIntField(term1478361, term1478361.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1478361, term1478361.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1478361, term1478361.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1478361, term1478361.getClass(), "acc", null);
        setField(term1478361, term1478361.getClass(), "minSize", null);
        setBooleanField(term1478361, term1478361.getClass(), "minSizeSet", false);
        setField(term1478361, term1478361.getClass(), "prefSize", null);
        setBooleanField(term1478361, term1478361.getClass(), "prefSizeSet", false);
        setField(term1478361, term1478361.getClass(), "maxSize", null);
        setBooleanField(term1478361, term1478361.getClass(), "maxSizeSet", false);
        setField(term1478361, term1478361.getClass(), "componentOrientation", null);
        setBooleanField(term1478361, term1478361.getClass(), "newEventsOnly", false);
        setField(term1478361, term1478361.getClass(), "componentListener", null);
        setField(term1478361, term1478361.getClass(), "focusListener", null);
        setField(term1478361, term1478361.getClass(), "hierarchyListener", null);
        setField(term1478361, term1478361.getClass(), "hierarchyBoundsListener", null);
        setField(term1478361, term1478361.getClass(), "keyListener", null);
        setField(term1478361, term1478361.getClass(), "mouseListener", null);
        setField(term1478361, term1478361.getClass(), "mouseMotionListener", null);
        setField(term1478361, term1478361.getClass(), "mouseWheelListener", null);
        setField(term1478361, term1478361.getClass(), "inputMethodListener", null);
        setLongField(term1478361, term1478361.getClass(), "eventMask", 0L);
        setField(term1478361, term1478361.getClass(), "changeSupport", null);
        setField(term1478361, term1478361.getClass(), "objectLock", null);
        setBooleanField(term1478361, term1478361.getClass(), "isPacked", false);
        setIntField(term1478361, term1478361.getClass(), "boundsOp", 0);
        setField(term1478361, term1478361.getClass(), "compoundShape", null);
        setField(term1478361, term1478361.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1478361, term1478361.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1478361, term1478361.getClass(), "backgroundEraseDisabled", false);
        setField(term1478361, term1478361.getClass(), "eventCache", null);
        setBooleanField(term1478361, term1478361.getClass(), "coalescingEnabled", false);
        setBooleanField(term1478361, term1478361.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1478361, term1478361.getClass(), "componentSerializedDataVersion", 0);
        setField(term1478361, term1478361.getClass(), "accessibleContext", null);
        term1478405 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1478405;
        callMethod(klass, "setBanPrivateer", argTypes, term1478361, args);
    }

};


