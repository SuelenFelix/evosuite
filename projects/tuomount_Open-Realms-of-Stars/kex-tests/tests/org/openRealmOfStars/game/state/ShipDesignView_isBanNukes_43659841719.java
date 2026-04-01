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

public class ShipDesignView_isBanNukes_43659841719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1485516;

    public ShipDesignView_isBanNukes_43659841719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1485516 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1485516, term1485516.getClass(), "player", null);
        setField(term1485516, term1485516.getClass(), "design", null);
        setField(term1485516, term1485516.getClass(), "hullSelect", null);
        setField(term1485516, term1485516.getClass(), "componentSelect", null);
        setField(term1485516, term1485516.getClass(), "componentFilter", null);
        setField(term1485516, term1485516.getClass(), "variantSelection", null);
        setField(term1485516, term1485516.getClass(), "hullInfoText", null);
        setField(term1485516, term1485516.getClass(), "componentInfoText", null);
        setField(term1485516, term1485516.getClass(), "designNameText", null);
        setField(term1485516, term1485516.getClass(), "componentList", null);
        setField(term1485516, term1485516.getClass(), "hullImage", null);
        setBooleanField(term1485516, term1485516.getClass(), "illegalName", false);
        setBooleanField(term1485516, term1485516.getClass(), "banPrivateer", false);
        setBooleanField(term1485516, term1485516.getClass(), "banNukes", false);
        setBooleanField(term1485516, term1485516.getClass(), "isAlignmentXSet", false);
        setFloatField(term1485516, term1485516.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1485516, term1485516.getClass(), "isAlignmentYSet", false);
        setFloatField(term1485516, term1485516.getClass(), "alignmentY", 0.0F);
        setField(term1485516, term1485516.getClass(), "ui", null);
        setField(term1485516, term1485516.getClass(), "listenerList", null);
        setField(term1485516, term1485516.getClass(), "clientProperties", null);
        setField(term1485516, term1485516.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1485516, term1485516.getClass(), "autoscrolls", false);
        setField(term1485516, term1485516.getClass(), "border", null);
        setIntField(term1485516, term1485516.getClass(), "flags", 0);
        setField(term1485516, term1485516.getClass(), "inputVerifier", null);
        setBooleanField(term1485516, term1485516.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1485516, term1485516.getClass(), "paintingChild", null);
        setField(term1485516, term1485516.getClass(), "popupMenu", null);
        setField(term1485516, term1485516.getClass(), "revalidateRunnableScheduled", null);
        setField(term1485516, term1485516.getClass(), "focusInputMap", null);
        setField(term1485516, term1485516.getClass(), "ancestorInputMap", null);
        setField(term1485516, term1485516.getClass(), "windowInputMap", null);
        setField(term1485516, term1485516.getClass(), "actionMap", null);
        setField(term1485516, term1485516.getClass(), "aaHint", null);
        setField(term1485516, term1485516.getClass(), "lcdRenderingHint", null);
        setField(term1485516, term1485516.getClass(), "component", null);
        setField(term1485516, term1485516.getClass(), "layoutMgr", null);
        setField(term1485516, term1485516.getClass(), "dispatcher", null);
        setField(term1485516, term1485516.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1485516, term1485516.getClass(), "focusCycleRoot", false);
        setBooleanField(term1485516, term1485516.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1485516, term1485516.getClass(), "printingThreads", null);
        setBooleanField(term1485516, term1485516.getClass(), "printing", false);
        setField(term1485516, term1485516.getClass(), "containerListener", null);
        setIntField(term1485516, term1485516.getClass(), "listeningChildren", 0);
        setIntField(term1485516, term1485516.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1485516, term1485516.getClass(), "descendantsCount", 0);
        setField(term1485516, term1485516.getClass(), "preserveBackgroundColor", null);
        setIntField(term1485516, term1485516.getClass(), "numOfHWComponents", 0);
        setIntField(term1485516, term1485516.getClass(), "numOfLWComponents", 0);
        setField(term1485516, term1485516.getClass(), "modalComp", null);
        setField(term1485516, term1485516.getClass(), "modalAppContext", null);
        setIntField(term1485516, term1485516.getClass(), "containerSerializedDataVersion", 0);
        setField(term1485516, term1485516.getClass(), "peer", null);
        setField(term1485516, term1485516.getClass(), "parent", null);
        setField(term1485516, term1485516.getClass(), "appContext", null);
        setIntField(term1485516, term1485516.getClass(), "x", 0);
        setIntField(term1485516, term1485516.getClass(), "y", 0);
        setIntField(term1485516, term1485516.getClass(), "width", 0);
        setIntField(term1485516, term1485516.getClass(), "height", 0);
        setField(term1485516, term1485516.getClass(), "foreground", null);
        setField(term1485516, term1485516.getClass(), "background", null);
        setField(term1485516, term1485516.getClass(), "font", null);
        setField(term1485516, term1485516.getClass(), "peerFont", null);
        setField(term1485516, term1485516.getClass(), "cursor", null);
        setField(term1485516, term1485516.getClass(), "locale", null);
        setField(term1485516, term1485516.getClass(), "graphicsConfig", null);
        setField(term1485516, term1485516.getClass(), "bufferStrategy", null);
        setBooleanField(term1485516, term1485516.getClass(), "ignoreRepaint", false);
        setBooleanField(term1485516, term1485516.getClass(), "visible", false);
        setBooleanField(term1485516, term1485516.getClass(), "enabled", false);
        setBooleanField(term1485516, term1485516.getClass(), "valid", false);
        setField(term1485516, term1485516.getClass(), "dropTarget", null);
        setField(term1485516, term1485516.getClass(), "popups", null);
        setField(term1485516, term1485516.getClass(), "name", null);
        setBooleanField(term1485516, term1485516.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1485516, term1485516.getClass(), "focusable", false);
        setIntField(term1485516, term1485516.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1485516, term1485516.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1485516, term1485516.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1485516, term1485516.getClass(), "acc", null);
        setField(term1485516, term1485516.getClass(), "minSize", null);
        setBooleanField(term1485516, term1485516.getClass(), "minSizeSet", false);
        setField(term1485516, term1485516.getClass(), "prefSize", null);
        setBooleanField(term1485516, term1485516.getClass(), "prefSizeSet", false);
        setField(term1485516, term1485516.getClass(), "maxSize", null);
        setBooleanField(term1485516, term1485516.getClass(), "maxSizeSet", false);
        setField(term1485516, term1485516.getClass(), "componentOrientation", null);
        setBooleanField(term1485516, term1485516.getClass(), "newEventsOnly", false);
        setField(term1485516, term1485516.getClass(), "componentListener", null);
        setField(term1485516, term1485516.getClass(), "focusListener", null);
        setField(term1485516, term1485516.getClass(), "hierarchyListener", null);
        setField(term1485516, term1485516.getClass(), "hierarchyBoundsListener", null);
        setField(term1485516, term1485516.getClass(), "keyListener", null);
        setField(term1485516, term1485516.getClass(), "mouseListener", null);
        setField(term1485516, term1485516.getClass(), "mouseMotionListener", null);
        setField(term1485516, term1485516.getClass(), "mouseWheelListener", null);
        setField(term1485516, term1485516.getClass(), "inputMethodListener", null);
        setLongField(term1485516, term1485516.getClass(), "eventMask", 0L);
        setField(term1485516, term1485516.getClass(), "changeSupport", null);
        setField(term1485516, term1485516.getClass(), "objectLock", null);
        setBooleanField(term1485516, term1485516.getClass(), "isPacked", false);
        setIntField(term1485516, term1485516.getClass(), "boundsOp", 0);
        setField(term1485516, term1485516.getClass(), "compoundShape", null);
        setField(term1485516, term1485516.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1485516, term1485516.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1485516, term1485516.getClass(), "backgroundEraseDisabled", false);
        setField(term1485516, term1485516.getClass(), "eventCache", null);
        setBooleanField(term1485516, term1485516.getClass(), "coalescingEnabled", false);
        setBooleanField(term1485516, term1485516.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1485516, term1485516.getClass(), "componentSerializedDataVersion", 0);
        setField(term1485516, term1485516.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBanNukes", argTypes, term1485516, args);
    }

};


