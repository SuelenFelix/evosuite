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

public class ShipDesignView_filterComponents_12110118524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1460954;

    public ShipDesignView_filterComponents_12110118524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1460954 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1460954, term1460954.getClass(), "player", null);
        setField(term1460954, term1460954.getClass(), "design", null);
        setField(term1460954, term1460954.getClass(), "hullSelect", null);
        setField(term1460954, term1460954.getClass(), "componentSelect", null);
        setField(term1460954, term1460954.getClass(), "componentFilter", null);
        setField(term1460954, term1460954.getClass(), "variantSelection", null);
        setField(term1460954, term1460954.getClass(), "hullInfoText", null);
        setField(term1460954, term1460954.getClass(), "componentInfoText", null);
        setField(term1460954, term1460954.getClass(), "designNameText", null);
        setField(term1460954, term1460954.getClass(), "componentList", null);
        setField(term1460954, term1460954.getClass(), "hullImage", null);
        setBooleanField(term1460954, term1460954.getClass(), "illegalName", false);
        setBooleanField(term1460954, term1460954.getClass(), "banPrivateer", false);
        setBooleanField(term1460954, term1460954.getClass(), "banNukes", false);
        setBooleanField(term1460954, term1460954.getClass(), "isAlignmentXSet", false);
        setFloatField(term1460954, term1460954.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1460954, term1460954.getClass(), "isAlignmentYSet", false);
        setFloatField(term1460954, term1460954.getClass(), "alignmentY", 0.0F);
        setField(term1460954, term1460954.getClass(), "ui", null);
        setField(term1460954, term1460954.getClass(), "listenerList", null);
        setField(term1460954, term1460954.getClass(), "clientProperties", null);
        setField(term1460954, term1460954.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1460954, term1460954.getClass(), "autoscrolls", false);
        setField(term1460954, term1460954.getClass(), "border", null);
        setIntField(term1460954, term1460954.getClass(), "flags", 0);
        setField(term1460954, term1460954.getClass(), "inputVerifier", null);
        setBooleanField(term1460954, term1460954.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1460954, term1460954.getClass(), "paintingChild", null);
        setField(term1460954, term1460954.getClass(), "popupMenu", null);
        setField(term1460954, term1460954.getClass(), "revalidateRunnableScheduled", null);
        setField(term1460954, term1460954.getClass(), "focusInputMap", null);
        setField(term1460954, term1460954.getClass(), "ancestorInputMap", null);
        setField(term1460954, term1460954.getClass(), "windowInputMap", null);
        setField(term1460954, term1460954.getClass(), "actionMap", null);
        setField(term1460954, term1460954.getClass(), "aaHint", null);
        setField(term1460954, term1460954.getClass(), "lcdRenderingHint", null);
        setField(term1460954, term1460954.getClass(), "component", null);
        setField(term1460954, term1460954.getClass(), "layoutMgr", null);
        setField(term1460954, term1460954.getClass(), "dispatcher", null);
        setField(term1460954, term1460954.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1460954, term1460954.getClass(), "focusCycleRoot", false);
        setBooleanField(term1460954, term1460954.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1460954, term1460954.getClass(), "printingThreads", null);
        setBooleanField(term1460954, term1460954.getClass(), "printing", false);
        setField(term1460954, term1460954.getClass(), "containerListener", null);
        setIntField(term1460954, term1460954.getClass(), "listeningChildren", 0);
        setIntField(term1460954, term1460954.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1460954, term1460954.getClass(), "descendantsCount", 0);
        setField(term1460954, term1460954.getClass(), "preserveBackgroundColor", null);
        setIntField(term1460954, term1460954.getClass(), "numOfHWComponents", 0);
        setIntField(term1460954, term1460954.getClass(), "numOfLWComponents", 0);
        setField(term1460954, term1460954.getClass(), "modalComp", null);
        setField(term1460954, term1460954.getClass(), "modalAppContext", null);
        setIntField(term1460954, term1460954.getClass(), "containerSerializedDataVersion", 0);
        setField(term1460954, term1460954.getClass(), "peer", null);
        setField(term1460954, term1460954.getClass(), "parent", null);
        setField(term1460954, term1460954.getClass(), "appContext", null);
        setIntField(term1460954, term1460954.getClass(), "x", 0);
        setIntField(term1460954, term1460954.getClass(), "y", 0);
        setIntField(term1460954, term1460954.getClass(), "width", 0);
        setIntField(term1460954, term1460954.getClass(), "height", 0);
        setField(term1460954, term1460954.getClass(), "foreground", null);
        setField(term1460954, term1460954.getClass(), "background", null);
        setField(term1460954, term1460954.getClass(), "font", null);
        setField(term1460954, term1460954.getClass(), "peerFont", null);
        setField(term1460954, term1460954.getClass(), "cursor", null);
        setField(term1460954, term1460954.getClass(), "locale", null);
        setField(term1460954, term1460954.getClass(), "graphicsConfig", null);
        setField(term1460954, term1460954.getClass(), "bufferStrategy", null);
        setBooleanField(term1460954, term1460954.getClass(), "ignoreRepaint", false);
        setBooleanField(term1460954, term1460954.getClass(), "visible", false);
        setBooleanField(term1460954, term1460954.getClass(), "enabled", false);
        setBooleanField(term1460954, term1460954.getClass(), "valid", false);
        setField(term1460954, term1460954.getClass(), "dropTarget", null);
        setField(term1460954, term1460954.getClass(), "popups", null);
        setField(term1460954, term1460954.getClass(), "name", null);
        setBooleanField(term1460954, term1460954.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1460954, term1460954.getClass(), "focusable", false);
        setIntField(term1460954, term1460954.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1460954, term1460954.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1460954, term1460954.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1460954, term1460954.getClass(), "acc", null);
        setField(term1460954, term1460954.getClass(), "minSize", null);
        setBooleanField(term1460954, term1460954.getClass(), "minSizeSet", false);
        setField(term1460954, term1460954.getClass(), "prefSize", null);
        setBooleanField(term1460954, term1460954.getClass(), "prefSizeSet", false);
        setField(term1460954, term1460954.getClass(), "maxSize", null);
        setBooleanField(term1460954, term1460954.getClass(), "maxSizeSet", false);
        setField(term1460954, term1460954.getClass(), "componentOrientation", null);
        setBooleanField(term1460954, term1460954.getClass(), "newEventsOnly", false);
        setField(term1460954, term1460954.getClass(), "componentListener", null);
        setField(term1460954, term1460954.getClass(), "focusListener", null);
        setField(term1460954, term1460954.getClass(), "hierarchyListener", null);
        setField(term1460954, term1460954.getClass(), "hierarchyBoundsListener", null);
        setField(term1460954, term1460954.getClass(), "keyListener", null);
        setField(term1460954, term1460954.getClass(), "mouseListener", null);
        setField(term1460954, term1460954.getClass(), "mouseMotionListener", null);
        setField(term1460954, term1460954.getClass(), "mouseWheelListener", null);
        setField(term1460954, term1460954.getClass(), "inputMethodListener", null);
        setLongField(term1460954, term1460954.getClass(), "eventMask", 0L);
        setField(term1460954, term1460954.getClass(), "changeSupport", null);
        setField(term1460954, term1460954.getClass(), "objectLock", null);
        setBooleanField(term1460954, term1460954.getClass(), "isPacked", false);
        setIntField(term1460954, term1460954.getClass(), "boundsOp", 0);
        setField(term1460954, term1460954.getClass(), "compoundShape", null);
        setField(term1460954, term1460954.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1460954, term1460954.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1460954, term1460954.getClass(), "backgroundEraseDisabled", false);
        setField(term1460954, term1460954.getClass(), "eventCache", null);
        setBooleanField(term1460954, term1460954.getClass(), "coalescingEnabled", false);
        setBooleanField(term1460954, term1460954.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1460954, term1460954.getClass(), "componentSerializedDataVersion", 0);
        setField(term1460954, term1460954.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "filterComponents", argTypes, term1460954, args);
    }

};


