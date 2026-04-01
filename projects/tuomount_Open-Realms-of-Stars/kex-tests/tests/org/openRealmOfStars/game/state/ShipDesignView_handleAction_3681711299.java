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

public class ShipDesignView_handleAction_3681711299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1445732;

    public ShipDesignView_handleAction_3681711299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1445732 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1445732, term1445732.getClass(), "player", null);
        setField(term1445732, term1445732.getClass(), "design", null);
        setField(term1445732, term1445732.getClass(), "hullSelect", null);
        setField(term1445732, term1445732.getClass(), "componentSelect", null);
        setField(term1445732, term1445732.getClass(), "componentFilter", null);
        setField(term1445732, term1445732.getClass(), "variantSelection", null);
        setField(term1445732, term1445732.getClass(), "hullInfoText", null);
        setField(term1445732, term1445732.getClass(), "componentInfoText", null);
        setField(term1445732, term1445732.getClass(), "designNameText", null);
        setField(term1445732, term1445732.getClass(), "componentList", null);
        setField(term1445732, term1445732.getClass(), "hullImage", null);
        setBooleanField(term1445732, term1445732.getClass(), "illegalName", false);
        setBooleanField(term1445732, term1445732.getClass(), "banPrivateer", false);
        setBooleanField(term1445732, term1445732.getClass(), "banNukes", false);
        setBooleanField(term1445732, term1445732.getClass(), "isAlignmentXSet", false);
        setFloatField(term1445732, term1445732.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1445732, term1445732.getClass(), "isAlignmentYSet", false);
        setFloatField(term1445732, term1445732.getClass(), "alignmentY", 0.0F);
        setField(term1445732, term1445732.getClass(), "ui", null);
        setField(term1445732, term1445732.getClass(), "listenerList", null);
        setField(term1445732, term1445732.getClass(), "clientProperties", null);
        setField(term1445732, term1445732.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1445732, term1445732.getClass(), "autoscrolls", false);
        setField(term1445732, term1445732.getClass(), "border", null);
        setIntField(term1445732, term1445732.getClass(), "flags", 0);
        setField(term1445732, term1445732.getClass(), "inputVerifier", null);
        setBooleanField(term1445732, term1445732.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1445732, term1445732.getClass(), "paintingChild", null);
        setField(term1445732, term1445732.getClass(), "popupMenu", null);
        setField(term1445732, term1445732.getClass(), "revalidateRunnableScheduled", null);
        setField(term1445732, term1445732.getClass(), "focusInputMap", null);
        setField(term1445732, term1445732.getClass(), "ancestorInputMap", null);
        setField(term1445732, term1445732.getClass(), "windowInputMap", null);
        setField(term1445732, term1445732.getClass(), "actionMap", null);
        setField(term1445732, term1445732.getClass(), "aaHint", null);
        setField(term1445732, term1445732.getClass(), "lcdRenderingHint", null);
        setField(term1445732, term1445732.getClass(), "component", null);
        setField(term1445732, term1445732.getClass(), "layoutMgr", null);
        setField(term1445732, term1445732.getClass(), "dispatcher", null);
        setField(term1445732, term1445732.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1445732, term1445732.getClass(), "focusCycleRoot", false);
        setBooleanField(term1445732, term1445732.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1445732, term1445732.getClass(), "printingThreads", null);
        setBooleanField(term1445732, term1445732.getClass(), "printing", false);
        setField(term1445732, term1445732.getClass(), "containerListener", null);
        setIntField(term1445732, term1445732.getClass(), "listeningChildren", 0);
        setIntField(term1445732, term1445732.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1445732, term1445732.getClass(), "descendantsCount", 0);
        setField(term1445732, term1445732.getClass(), "preserveBackgroundColor", null);
        setIntField(term1445732, term1445732.getClass(), "numOfHWComponents", 0);
        setIntField(term1445732, term1445732.getClass(), "numOfLWComponents", 0);
        setField(term1445732, term1445732.getClass(), "modalComp", null);
        setField(term1445732, term1445732.getClass(), "modalAppContext", null);
        setIntField(term1445732, term1445732.getClass(), "containerSerializedDataVersion", 0);
        setField(term1445732, term1445732.getClass(), "peer", null);
        setField(term1445732, term1445732.getClass(), "parent", null);
        setField(term1445732, term1445732.getClass(), "appContext", null);
        setIntField(term1445732, term1445732.getClass(), "x", 0);
        setIntField(term1445732, term1445732.getClass(), "y", 0);
        setIntField(term1445732, term1445732.getClass(), "width", 0);
        setIntField(term1445732, term1445732.getClass(), "height", 0);
        setField(term1445732, term1445732.getClass(), "foreground", null);
        setField(term1445732, term1445732.getClass(), "background", null);
        setField(term1445732, term1445732.getClass(), "font", null);
        setField(term1445732, term1445732.getClass(), "peerFont", null);
        setField(term1445732, term1445732.getClass(), "cursor", null);
        setField(term1445732, term1445732.getClass(), "locale", null);
        setField(term1445732, term1445732.getClass(), "graphicsConfig", null);
        setField(term1445732, term1445732.getClass(), "bufferStrategy", null);
        setBooleanField(term1445732, term1445732.getClass(), "ignoreRepaint", false);
        setBooleanField(term1445732, term1445732.getClass(), "visible", false);
        setBooleanField(term1445732, term1445732.getClass(), "enabled", false);
        setBooleanField(term1445732, term1445732.getClass(), "valid", false);
        setField(term1445732, term1445732.getClass(), "dropTarget", null);
        setField(term1445732, term1445732.getClass(), "popups", null);
        setField(term1445732, term1445732.getClass(), "name", null);
        setBooleanField(term1445732, term1445732.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1445732, term1445732.getClass(), "focusable", false);
        setIntField(term1445732, term1445732.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1445732, term1445732.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1445732, term1445732.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1445732, term1445732.getClass(), "acc", null);
        setField(term1445732, term1445732.getClass(), "minSize", null);
        setBooleanField(term1445732, term1445732.getClass(), "minSizeSet", false);
        setField(term1445732, term1445732.getClass(), "prefSize", null);
        setBooleanField(term1445732, term1445732.getClass(), "prefSizeSet", false);
        setField(term1445732, term1445732.getClass(), "maxSize", null);
        setBooleanField(term1445732, term1445732.getClass(), "maxSizeSet", false);
        setField(term1445732, term1445732.getClass(), "componentOrientation", null);
        setBooleanField(term1445732, term1445732.getClass(), "newEventsOnly", false);
        setField(term1445732, term1445732.getClass(), "componentListener", null);
        setField(term1445732, term1445732.getClass(), "focusListener", null);
        setField(term1445732, term1445732.getClass(), "hierarchyListener", null);
        setField(term1445732, term1445732.getClass(), "hierarchyBoundsListener", null);
        setField(term1445732, term1445732.getClass(), "keyListener", null);
        setField(term1445732, term1445732.getClass(), "mouseListener", null);
        setField(term1445732, term1445732.getClass(), "mouseMotionListener", null);
        setField(term1445732, term1445732.getClass(), "mouseWheelListener", null);
        setField(term1445732, term1445732.getClass(), "inputMethodListener", null);
        setLongField(term1445732, term1445732.getClass(), "eventMask", 0L);
        setField(term1445732, term1445732.getClass(), "changeSupport", null);
        setField(term1445732, term1445732.getClass(), "objectLock", null);
        setBooleanField(term1445732, term1445732.getClass(), "isPacked", false);
        setIntField(term1445732, term1445732.getClass(), "boundsOp", 0);
        setField(term1445732, term1445732.getClass(), "compoundShape", null);
        setField(term1445732, term1445732.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1445732, term1445732.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1445732, term1445732.getClass(), "backgroundEraseDisabled", false);
        setField(term1445732, term1445732.getClass(), "eventCache", null);
        setBooleanField(term1445732, term1445732.getClass(), "coalescingEnabled", false);
        setBooleanField(term1445732, term1445732.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1445732, term1445732.getClass(), "componentSerializedDataVersion", 0);
        setField(term1445732, term1445732.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term1445732, args);
    }

};


