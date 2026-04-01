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

public class ShipDesignView_setBanPrivateer_21043666918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1519846;
     Object term1519890;

    public ShipDesignView_setBanPrivateer_21043666918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1519846 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1519846, term1519846.getClass(), "player", null);
        setField(term1519846, term1519846.getClass(), "design", null);
        setField(term1519846, term1519846.getClass(), "hullSelect", null);
        setField(term1519846, term1519846.getClass(), "componentSelect", null);
        setField(term1519846, term1519846.getClass(), "componentFilter", null);
        setField(term1519846, term1519846.getClass(), "variantSelection", null);
        setField(term1519846, term1519846.getClass(), "hullInfoText", null);
        setField(term1519846, term1519846.getClass(), "componentInfoText", null);
        setField(term1519846, term1519846.getClass(), "designNameText", null);
        setField(term1519846, term1519846.getClass(), "componentList", null);
        setField(term1519846, term1519846.getClass(), "hullImage", null);
        setBooleanField(term1519846, term1519846.getClass(), "illegalName", false);
        setBooleanField(term1519846, term1519846.getClass(), "banPrivateer", false);
        setBooleanField(term1519846, term1519846.getClass(), "banNukes", false);
        setBooleanField(term1519846, term1519846.getClass(), "isAlignmentXSet", false);
        setFloatField(term1519846, term1519846.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1519846, term1519846.getClass(), "isAlignmentYSet", false);
        setFloatField(term1519846, term1519846.getClass(), "alignmentY", 0.0F);
        setField(term1519846, term1519846.getClass(), "ui", null);
        setField(term1519846, term1519846.getClass(), "listenerList", null);
        setField(term1519846, term1519846.getClass(), "clientProperties", null);
        setField(term1519846, term1519846.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1519846, term1519846.getClass(), "autoscrolls", false);
        setField(term1519846, term1519846.getClass(), "border", null);
        setIntField(term1519846, term1519846.getClass(), "flags", 0);
        setField(term1519846, term1519846.getClass(), "inputVerifier", null);
        setBooleanField(term1519846, term1519846.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1519846, term1519846.getClass(), "paintingChild", null);
        setField(term1519846, term1519846.getClass(), "popupMenu", null);
        setField(term1519846, term1519846.getClass(), "revalidateRunnableScheduled", null);
        setField(term1519846, term1519846.getClass(), "focusInputMap", null);
        setField(term1519846, term1519846.getClass(), "ancestorInputMap", null);
        setField(term1519846, term1519846.getClass(), "windowInputMap", null);
        setField(term1519846, term1519846.getClass(), "actionMap", null);
        setField(term1519846, term1519846.getClass(), "aaHint", null);
        setField(term1519846, term1519846.getClass(), "lcdRenderingHint", null);
        setField(term1519846, term1519846.getClass(), "component", null);
        setField(term1519846, term1519846.getClass(), "layoutMgr", null);
        setField(term1519846, term1519846.getClass(), "dispatcher", null);
        setField(term1519846, term1519846.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1519846, term1519846.getClass(), "focusCycleRoot", false);
        setBooleanField(term1519846, term1519846.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1519846, term1519846.getClass(), "printingThreads", null);
        setBooleanField(term1519846, term1519846.getClass(), "printing", false);
        setField(term1519846, term1519846.getClass(), "containerListener", null);
        setIntField(term1519846, term1519846.getClass(), "listeningChildren", 0);
        setIntField(term1519846, term1519846.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1519846, term1519846.getClass(), "descendantsCount", 0);
        setField(term1519846, term1519846.getClass(), "preserveBackgroundColor", null);
        setIntField(term1519846, term1519846.getClass(), "numOfHWComponents", 0);
        setIntField(term1519846, term1519846.getClass(), "numOfLWComponents", 0);
        setField(term1519846, term1519846.getClass(), "modalComp", null);
        setField(term1519846, term1519846.getClass(), "modalAppContext", null);
        setIntField(term1519846, term1519846.getClass(), "containerSerializedDataVersion", 0);
        setField(term1519846, term1519846.getClass(), "peer", null);
        setField(term1519846, term1519846.getClass(), "parent", null);
        setField(term1519846, term1519846.getClass(), "appContext", null);
        setIntField(term1519846, term1519846.getClass(), "x", 0);
        setIntField(term1519846, term1519846.getClass(), "y", 0);
        setIntField(term1519846, term1519846.getClass(), "width", 0);
        setIntField(term1519846, term1519846.getClass(), "height", 0);
        setField(term1519846, term1519846.getClass(), "foreground", null);
        setField(term1519846, term1519846.getClass(), "background", null);
        setField(term1519846, term1519846.getClass(), "font", null);
        setField(term1519846, term1519846.getClass(), "peerFont", null);
        setField(term1519846, term1519846.getClass(), "cursor", null);
        setField(term1519846, term1519846.getClass(), "locale", null);
        setField(term1519846, term1519846.getClass(), "graphicsConfig", null);
        setField(term1519846, term1519846.getClass(), "bufferStrategy", null);
        setBooleanField(term1519846, term1519846.getClass(), "ignoreRepaint", false);
        setBooleanField(term1519846, term1519846.getClass(), "visible", false);
        setBooleanField(term1519846, term1519846.getClass(), "enabled", false);
        setBooleanField(term1519846, term1519846.getClass(), "valid", false);
        setField(term1519846, term1519846.getClass(), "dropTarget", null);
        setField(term1519846, term1519846.getClass(), "popups", null);
        setField(term1519846, term1519846.getClass(), "name", null);
        setBooleanField(term1519846, term1519846.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1519846, term1519846.getClass(), "focusable", false);
        setIntField(term1519846, term1519846.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1519846, term1519846.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1519846, term1519846.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1519846, term1519846.getClass(), "acc", null);
        setField(term1519846, term1519846.getClass(), "minSize", null);
        setBooleanField(term1519846, term1519846.getClass(), "minSizeSet", false);
        setField(term1519846, term1519846.getClass(), "prefSize", null);
        setBooleanField(term1519846, term1519846.getClass(), "prefSizeSet", false);
        setField(term1519846, term1519846.getClass(), "maxSize", null);
        setBooleanField(term1519846, term1519846.getClass(), "maxSizeSet", false);
        setField(term1519846, term1519846.getClass(), "componentOrientation", null);
        setBooleanField(term1519846, term1519846.getClass(), "newEventsOnly", false);
        setField(term1519846, term1519846.getClass(), "componentListener", null);
        setField(term1519846, term1519846.getClass(), "focusListener", null);
        setField(term1519846, term1519846.getClass(), "hierarchyListener", null);
        setField(term1519846, term1519846.getClass(), "hierarchyBoundsListener", null);
        setField(term1519846, term1519846.getClass(), "keyListener", null);
        setField(term1519846, term1519846.getClass(), "mouseListener", null);
        setField(term1519846, term1519846.getClass(), "mouseMotionListener", null);
        setField(term1519846, term1519846.getClass(), "mouseWheelListener", null);
        setField(term1519846, term1519846.getClass(), "inputMethodListener", null);
        setLongField(term1519846, term1519846.getClass(), "eventMask", 0L);
        setField(term1519846, term1519846.getClass(), "changeSupport", null);
        setField(term1519846, term1519846.getClass(), "objectLock", null);
        setBooleanField(term1519846, term1519846.getClass(), "isPacked", false);
        setIntField(term1519846, term1519846.getClass(), "boundsOp", 0);
        setField(term1519846, term1519846.getClass(), "compoundShape", null);
        setField(term1519846, term1519846.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1519846, term1519846.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1519846, term1519846.getClass(), "backgroundEraseDisabled", false);
        setField(term1519846, term1519846.getClass(), "eventCache", null);
        setBooleanField(term1519846, term1519846.getClass(), "coalescingEnabled", false);
        setBooleanField(term1519846, term1519846.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1519846, term1519846.getClass(), "componentSerializedDataVersion", 0);
        setField(term1519846, term1519846.getClass(), "accessibleContext", null);
        term1519890 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1519890;
        callMethod(klass, "setBanPrivateer", argTypes, term1519846, args);
    }

};


