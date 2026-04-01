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

public class ShipDesignView_filterComponents_12110118523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1419043;

    public ShipDesignView_filterComponents_12110118523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1419043 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1419043, term1419043.getClass(), "player", null);
        setField(term1419043, term1419043.getClass(), "design", null);
        setField(term1419043, term1419043.getClass(), "hullSelect", null);
        setField(term1419043, term1419043.getClass(), "componentSelect", null);
        setField(term1419043, term1419043.getClass(), "componentFilter", null);
        setField(term1419043, term1419043.getClass(), "variantSelection", null);
        setField(term1419043, term1419043.getClass(), "hullInfoText", null);
        setField(term1419043, term1419043.getClass(), "componentInfoText", null);
        setField(term1419043, term1419043.getClass(), "designNameText", null);
        setField(term1419043, term1419043.getClass(), "componentList", null);
        setField(term1419043, term1419043.getClass(), "hullImage", null);
        setBooleanField(term1419043, term1419043.getClass(), "illegalName", false);
        setBooleanField(term1419043, term1419043.getClass(), "banPrivateer", false);
        setBooleanField(term1419043, term1419043.getClass(), "banNukes", false);
        setBooleanField(term1419043, term1419043.getClass(), "isAlignmentXSet", false);
        setFloatField(term1419043, term1419043.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1419043, term1419043.getClass(), "isAlignmentYSet", false);
        setFloatField(term1419043, term1419043.getClass(), "alignmentY", 0.0F);
        setField(term1419043, term1419043.getClass(), "ui", null);
        setField(term1419043, term1419043.getClass(), "listenerList", null);
        setField(term1419043, term1419043.getClass(), "clientProperties", null);
        setField(term1419043, term1419043.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1419043, term1419043.getClass(), "autoscrolls", false);
        setField(term1419043, term1419043.getClass(), "border", null);
        setIntField(term1419043, term1419043.getClass(), "flags", 0);
        setField(term1419043, term1419043.getClass(), "inputVerifier", null);
        setBooleanField(term1419043, term1419043.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1419043, term1419043.getClass(), "paintingChild", null);
        setField(term1419043, term1419043.getClass(), "popupMenu", null);
        setField(term1419043, term1419043.getClass(), "revalidateRunnableScheduled", null);
        setField(term1419043, term1419043.getClass(), "focusInputMap", null);
        setField(term1419043, term1419043.getClass(), "ancestorInputMap", null);
        setField(term1419043, term1419043.getClass(), "windowInputMap", null);
        setField(term1419043, term1419043.getClass(), "actionMap", null);
        setField(term1419043, term1419043.getClass(), "aaHint", null);
        setField(term1419043, term1419043.getClass(), "lcdRenderingHint", null);
        setField(term1419043, term1419043.getClass(), "component", null);
        setField(term1419043, term1419043.getClass(), "layoutMgr", null);
        setField(term1419043, term1419043.getClass(), "dispatcher", null);
        setField(term1419043, term1419043.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1419043, term1419043.getClass(), "focusCycleRoot", false);
        setBooleanField(term1419043, term1419043.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1419043, term1419043.getClass(), "printingThreads", null);
        setBooleanField(term1419043, term1419043.getClass(), "printing", false);
        setField(term1419043, term1419043.getClass(), "containerListener", null);
        setIntField(term1419043, term1419043.getClass(), "listeningChildren", 0);
        setIntField(term1419043, term1419043.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1419043, term1419043.getClass(), "descendantsCount", 0);
        setField(term1419043, term1419043.getClass(), "preserveBackgroundColor", null);
        setIntField(term1419043, term1419043.getClass(), "numOfHWComponents", 0);
        setIntField(term1419043, term1419043.getClass(), "numOfLWComponents", 0);
        setField(term1419043, term1419043.getClass(), "modalComp", null);
        setField(term1419043, term1419043.getClass(), "modalAppContext", null);
        setIntField(term1419043, term1419043.getClass(), "containerSerializedDataVersion", 0);
        setField(term1419043, term1419043.getClass(), "peer", null);
        setField(term1419043, term1419043.getClass(), "parent", null);
        setField(term1419043, term1419043.getClass(), "appContext", null);
        setIntField(term1419043, term1419043.getClass(), "x", 0);
        setIntField(term1419043, term1419043.getClass(), "y", 0);
        setIntField(term1419043, term1419043.getClass(), "width", 0);
        setIntField(term1419043, term1419043.getClass(), "height", 0);
        setField(term1419043, term1419043.getClass(), "foreground", null);
        setField(term1419043, term1419043.getClass(), "background", null);
        setField(term1419043, term1419043.getClass(), "font", null);
        setField(term1419043, term1419043.getClass(), "peerFont", null);
        setField(term1419043, term1419043.getClass(), "cursor", null);
        setField(term1419043, term1419043.getClass(), "locale", null);
        setField(term1419043, term1419043.getClass(), "graphicsConfig", null);
        setField(term1419043, term1419043.getClass(), "bufferStrategy", null);
        setBooleanField(term1419043, term1419043.getClass(), "ignoreRepaint", false);
        setBooleanField(term1419043, term1419043.getClass(), "visible", false);
        setBooleanField(term1419043, term1419043.getClass(), "enabled", false);
        setBooleanField(term1419043, term1419043.getClass(), "valid", false);
        setField(term1419043, term1419043.getClass(), "dropTarget", null);
        setField(term1419043, term1419043.getClass(), "popups", null);
        setField(term1419043, term1419043.getClass(), "name", null);
        setBooleanField(term1419043, term1419043.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1419043, term1419043.getClass(), "focusable", false);
        setIntField(term1419043, term1419043.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1419043, term1419043.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1419043, term1419043.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1419043, term1419043.getClass(), "acc", null);
        setField(term1419043, term1419043.getClass(), "minSize", null);
        setBooleanField(term1419043, term1419043.getClass(), "minSizeSet", false);
        setField(term1419043, term1419043.getClass(), "prefSize", null);
        setBooleanField(term1419043, term1419043.getClass(), "prefSizeSet", false);
        setField(term1419043, term1419043.getClass(), "maxSize", null);
        setBooleanField(term1419043, term1419043.getClass(), "maxSizeSet", false);
        setField(term1419043, term1419043.getClass(), "componentOrientation", null);
        setBooleanField(term1419043, term1419043.getClass(), "newEventsOnly", false);
        setField(term1419043, term1419043.getClass(), "componentListener", null);
        setField(term1419043, term1419043.getClass(), "focusListener", null);
        setField(term1419043, term1419043.getClass(), "hierarchyListener", null);
        setField(term1419043, term1419043.getClass(), "hierarchyBoundsListener", null);
        setField(term1419043, term1419043.getClass(), "keyListener", null);
        setField(term1419043, term1419043.getClass(), "mouseListener", null);
        setField(term1419043, term1419043.getClass(), "mouseMotionListener", null);
        setField(term1419043, term1419043.getClass(), "mouseWheelListener", null);
        setField(term1419043, term1419043.getClass(), "inputMethodListener", null);
        setLongField(term1419043, term1419043.getClass(), "eventMask", 0L);
        setField(term1419043, term1419043.getClass(), "changeSupport", null);
        setField(term1419043, term1419043.getClass(), "objectLock", null);
        setBooleanField(term1419043, term1419043.getClass(), "isPacked", false);
        setIntField(term1419043, term1419043.getClass(), "boundsOp", 0);
        setField(term1419043, term1419043.getClass(), "compoundShape", null);
        setField(term1419043, term1419043.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1419043, term1419043.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1419043, term1419043.getClass(), "backgroundEraseDisabled", false);
        setField(term1419043, term1419043.getClass(), "eventCache", null);
        setBooleanField(term1419043, term1419043.getClass(), "coalescingEnabled", false);
        setBooleanField(term1419043, term1419043.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1419043, term1419043.getClass(), "componentSerializedDataVersion", 0);
        setField(term1419043, term1419043.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "filterComponents", argTypes, term1419043, args);
    }

};


