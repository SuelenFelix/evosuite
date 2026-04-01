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

public class ShipDesignView_setBanNukes_125466496121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1493893;
     Object term1493937;

    public ShipDesignView_setBanNukes_125466496121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1493893 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1493893, term1493893.getClass(), "player", null);
        setField(term1493893, term1493893.getClass(), "design", null);
        setField(term1493893, term1493893.getClass(), "hullSelect", null);
        setField(term1493893, term1493893.getClass(), "componentSelect", null);
        setField(term1493893, term1493893.getClass(), "componentFilter", null);
        setField(term1493893, term1493893.getClass(), "variantSelection", null);
        setField(term1493893, term1493893.getClass(), "hullInfoText", null);
        setField(term1493893, term1493893.getClass(), "componentInfoText", null);
        setField(term1493893, term1493893.getClass(), "designNameText", null);
        setField(term1493893, term1493893.getClass(), "componentList", null);
        setField(term1493893, term1493893.getClass(), "hullImage", null);
        setBooleanField(term1493893, term1493893.getClass(), "illegalName", false);
        setBooleanField(term1493893, term1493893.getClass(), "banPrivateer", false);
        setBooleanField(term1493893, term1493893.getClass(), "banNukes", false);
        setBooleanField(term1493893, term1493893.getClass(), "isAlignmentXSet", false);
        setFloatField(term1493893, term1493893.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1493893, term1493893.getClass(), "isAlignmentYSet", false);
        setFloatField(term1493893, term1493893.getClass(), "alignmentY", 0.0F);
        setField(term1493893, term1493893.getClass(), "ui", null);
        setField(term1493893, term1493893.getClass(), "listenerList", null);
        setField(term1493893, term1493893.getClass(), "clientProperties", null);
        setField(term1493893, term1493893.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1493893, term1493893.getClass(), "autoscrolls", false);
        setField(term1493893, term1493893.getClass(), "border", null);
        setIntField(term1493893, term1493893.getClass(), "flags", 0);
        setField(term1493893, term1493893.getClass(), "inputVerifier", null);
        setBooleanField(term1493893, term1493893.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1493893, term1493893.getClass(), "paintingChild", null);
        setField(term1493893, term1493893.getClass(), "popupMenu", null);
        setField(term1493893, term1493893.getClass(), "revalidateRunnableScheduled", null);
        setField(term1493893, term1493893.getClass(), "focusInputMap", null);
        setField(term1493893, term1493893.getClass(), "ancestorInputMap", null);
        setField(term1493893, term1493893.getClass(), "windowInputMap", null);
        setField(term1493893, term1493893.getClass(), "actionMap", null);
        setField(term1493893, term1493893.getClass(), "aaHint", null);
        setField(term1493893, term1493893.getClass(), "lcdRenderingHint", null);
        setField(term1493893, term1493893.getClass(), "component", null);
        setField(term1493893, term1493893.getClass(), "layoutMgr", null);
        setField(term1493893, term1493893.getClass(), "dispatcher", null);
        setField(term1493893, term1493893.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1493893, term1493893.getClass(), "focusCycleRoot", false);
        setBooleanField(term1493893, term1493893.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1493893, term1493893.getClass(), "printingThreads", null);
        setBooleanField(term1493893, term1493893.getClass(), "printing", false);
        setField(term1493893, term1493893.getClass(), "containerListener", null);
        setIntField(term1493893, term1493893.getClass(), "listeningChildren", 0);
        setIntField(term1493893, term1493893.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1493893, term1493893.getClass(), "descendantsCount", 0);
        setField(term1493893, term1493893.getClass(), "preserveBackgroundColor", null);
        setIntField(term1493893, term1493893.getClass(), "numOfHWComponents", 0);
        setIntField(term1493893, term1493893.getClass(), "numOfLWComponents", 0);
        setField(term1493893, term1493893.getClass(), "modalComp", null);
        setField(term1493893, term1493893.getClass(), "modalAppContext", null);
        setIntField(term1493893, term1493893.getClass(), "containerSerializedDataVersion", 0);
        setField(term1493893, term1493893.getClass(), "peer", null);
        setField(term1493893, term1493893.getClass(), "parent", null);
        setField(term1493893, term1493893.getClass(), "appContext", null);
        setIntField(term1493893, term1493893.getClass(), "x", 0);
        setIntField(term1493893, term1493893.getClass(), "y", 0);
        setIntField(term1493893, term1493893.getClass(), "width", 0);
        setIntField(term1493893, term1493893.getClass(), "height", 0);
        setField(term1493893, term1493893.getClass(), "foreground", null);
        setField(term1493893, term1493893.getClass(), "background", null);
        setField(term1493893, term1493893.getClass(), "font", null);
        setField(term1493893, term1493893.getClass(), "peerFont", null);
        setField(term1493893, term1493893.getClass(), "cursor", null);
        setField(term1493893, term1493893.getClass(), "locale", null);
        setField(term1493893, term1493893.getClass(), "graphicsConfig", null);
        setField(term1493893, term1493893.getClass(), "bufferStrategy", null);
        setBooleanField(term1493893, term1493893.getClass(), "ignoreRepaint", false);
        setBooleanField(term1493893, term1493893.getClass(), "visible", false);
        setBooleanField(term1493893, term1493893.getClass(), "enabled", false);
        setBooleanField(term1493893, term1493893.getClass(), "valid", false);
        setField(term1493893, term1493893.getClass(), "dropTarget", null);
        setField(term1493893, term1493893.getClass(), "popups", null);
        setField(term1493893, term1493893.getClass(), "name", null);
        setBooleanField(term1493893, term1493893.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1493893, term1493893.getClass(), "focusable", false);
        setIntField(term1493893, term1493893.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1493893, term1493893.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1493893, term1493893.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1493893, term1493893.getClass(), "acc", null);
        setField(term1493893, term1493893.getClass(), "minSize", null);
        setBooleanField(term1493893, term1493893.getClass(), "minSizeSet", false);
        setField(term1493893, term1493893.getClass(), "prefSize", null);
        setBooleanField(term1493893, term1493893.getClass(), "prefSizeSet", false);
        setField(term1493893, term1493893.getClass(), "maxSize", null);
        setBooleanField(term1493893, term1493893.getClass(), "maxSizeSet", false);
        setField(term1493893, term1493893.getClass(), "componentOrientation", null);
        setBooleanField(term1493893, term1493893.getClass(), "newEventsOnly", false);
        setField(term1493893, term1493893.getClass(), "componentListener", null);
        setField(term1493893, term1493893.getClass(), "focusListener", null);
        setField(term1493893, term1493893.getClass(), "hierarchyListener", null);
        setField(term1493893, term1493893.getClass(), "hierarchyBoundsListener", null);
        setField(term1493893, term1493893.getClass(), "keyListener", null);
        setField(term1493893, term1493893.getClass(), "mouseListener", null);
        setField(term1493893, term1493893.getClass(), "mouseMotionListener", null);
        setField(term1493893, term1493893.getClass(), "mouseWheelListener", null);
        setField(term1493893, term1493893.getClass(), "inputMethodListener", null);
        setLongField(term1493893, term1493893.getClass(), "eventMask", 0L);
        setField(term1493893, term1493893.getClass(), "changeSupport", null);
        setField(term1493893, term1493893.getClass(), "objectLock", null);
        setBooleanField(term1493893, term1493893.getClass(), "isPacked", false);
        setIntField(term1493893, term1493893.getClass(), "boundsOp", 0);
        setField(term1493893, term1493893.getClass(), "compoundShape", null);
        setField(term1493893, term1493893.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1493893, term1493893.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1493893, term1493893.getClass(), "backgroundEraseDisabled", false);
        setField(term1493893, term1493893.getClass(), "eventCache", null);
        setBooleanField(term1493893, term1493893.getClass(), "coalescingEnabled", false);
        setBooleanField(term1493893, term1493893.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1493893, term1493893.getClass(), "componentSerializedDataVersion", 0);
        setField(term1493893, term1493893.getClass(), "accessibleContext", null);
        term1493937 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1493937;
        callMethod(klass, "setBanNukes", argTypes, term1493893, args);
    }

};


