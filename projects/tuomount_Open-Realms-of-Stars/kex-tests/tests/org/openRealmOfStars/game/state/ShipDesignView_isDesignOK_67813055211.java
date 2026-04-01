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

public class ShipDesignView_isDesignOK_67813055211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1453944;

    public ShipDesignView_isDesignOK_67813055211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1453944 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1453944, term1453944.getClass(), "player", null);
        setField(term1453944, term1453944.getClass(), "design", null);
        setField(term1453944, term1453944.getClass(), "hullSelect", null);
        setField(term1453944, term1453944.getClass(), "componentSelect", null);
        setField(term1453944, term1453944.getClass(), "componentFilter", null);
        setField(term1453944, term1453944.getClass(), "variantSelection", null);
        setField(term1453944, term1453944.getClass(), "hullInfoText", null);
        setField(term1453944, term1453944.getClass(), "componentInfoText", null);
        setField(term1453944, term1453944.getClass(), "designNameText", null);
        setField(term1453944, term1453944.getClass(), "componentList", null);
        setField(term1453944, term1453944.getClass(), "hullImage", null);
        setBooleanField(term1453944, term1453944.getClass(), "illegalName", false);
        setBooleanField(term1453944, term1453944.getClass(), "banPrivateer", false);
        setBooleanField(term1453944, term1453944.getClass(), "banNukes", false);
        setBooleanField(term1453944, term1453944.getClass(), "isAlignmentXSet", false);
        setFloatField(term1453944, term1453944.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1453944, term1453944.getClass(), "isAlignmentYSet", false);
        setFloatField(term1453944, term1453944.getClass(), "alignmentY", 0.0F);
        setField(term1453944, term1453944.getClass(), "ui", null);
        setField(term1453944, term1453944.getClass(), "listenerList", null);
        setField(term1453944, term1453944.getClass(), "clientProperties", null);
        setField(term1453944, term1453944.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1453944, term1453944.getClass(), "autoscrolls", false);
        setField(term1453944, term1453944.getClass(), "border", null);
        setIntField(term1453944, term1453944.getClass(), "flags", 0);
        setField(term1453944, term1453944.getClass(), "inputVerifier", null);
        setBooleanField(term1453944, term1453944.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1453944, term1453944.getClass(), "paintingChild", null);
        setField(term1453944, term1453944.getClass(), "popupMenu", null);
        setField(term1453944, term1453944.getClass(), "revalidateRunnableScheduled", null);
        setField(term1453944, term1453944.getClass(), "focusInputMap", null);
        setField(term1453944, term1453944.getClass(), "ancestorInputMap", null);
        setField(term1453944, term1453944.getClass(), "windowInputMap", null);
        setField(term1453944, term1453944.getClass(), "actionMap", null);
        setField(term1453944, term1453944.getClass(), "aaHint", null);
        setField(term1453944, term1453944.getClass(), "lcdRenderingHint", null);
        setField(term1453944, term1453944.getClass(), "component", null);
        setField(term1453944, term1453944.getClass(), "layoutMgr", null);
        setField(term1453944, term1453944.getClass(), "dispatcher", null);
        setField(term1453944, term1453944.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1453944, term1453944.getClass(), "focusCycleRoot", false);
        setBooleanField(term1453944, term1453944.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1453944, term1453944.getClass(), "printingThreads", null);
        setBooleanField(term1453944, term1453944.getClass(), "printing", false);
        setField(term1453944, term1453944.getClass(), "containerListener", null);
        setIntField(term1453944, term1453944.getClass(), "listeningChildren", 0);
        setIntField(term1453944, term1453944.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1453944, term1453944.getClass(), "descendantsCount", 0);
        setField(term1453944, term1453944.getClass(), "preserveBackgroundColor", null);
        setIntField(term1453944, term1453944.getClass(), "numOfHWComponents", 0);
        setIntField(term1453944, term1453944.getClass(), "numOfLWComponents", 0);
        setField(term1453944, term1453944.getClass(), "modalComp", null);
        setField(term1453944, term1453944.getClass(), "modalAppContext", null);
        setIntField(term1453944, term1453944.getClass(), "containerSerializedDataVersion", 0);
        setField(term1453944, term1453944.getClass(), "peer", null);
        setField(term1453944, term1453944.getClass(), "parent", null);
        setField(term1453944, term1453944.getClass(), "appContext", null);
        setIntField(term1453944, term1453944.getClass(), "x", 0);
        setIntField(term1453944, term1453944.getClass(), "y", 0);
        setIntField(term1453944, term1453944.getClass(), "width", 0);
        setIntField(term1453944, term1453944.getClass(), "height", 0);
        setField(term1453944, term1453944.getClass(), "foreground", null);
        setField(term1453944, term1453944.getClass(), "background", null);
        setField(term1453944, term1453944.getClass(), "font", null);
        setField(term1453944, term1453944.getClass(), "peerFont", null);
        setField(term1453944, term1453944.getClass(), "cursor", null);
        setField(term1453944, term1453944.getClass(), "locale", null);
        setField(term1453944, term1453944.getClass(), "graphicsConfig", null);
        setField(term1453944, term1453944.getClass(), "bufferStrategy", null);
        setBooleanField(term1453944, term1453944.getClass(), "ignoreRepaint", false);
        setBooleanField(term1453944, term1453944.getClass(), "visible", false);
        setBooleanField(term1453944, term1453944.getClass(), "enabled", false);
        setBooleanField(term1453944, term1453944.getClass(), "valid", false);
        setField(term1453944, term1453944.getClass(), "dropTarget", null);
        setField(term1453944, term1453944.getClass(), "popups", null);
        setField(term1453944, term1453944.getClass(), "name", null);
        setBooleanField(term1453944, term1453944.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1453944, term1453944.getClass(), "focusable", false);
        setIntField(term1453944, term1453944.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1453944, term1453944.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1453944, term1453944.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1453944, term1453944.getClass(), "acc", null);
        setField(term1453944, term1453944.getClass(), "minSize", null);
        setBooleanField(term1453944, term1453944.getClass(), "minSizeSet", false);
        setField(term1453944, term1453944.getClass(), "prefSize", null);
        setBooleanField(term1453944, term1453944.getClass(), "prefSizeSet", false);
        setField(term1453944, term1453944.getClass(), "maxSize", null);
        setBooleanField(term1453944, term1453944.getClass(), "maxSizeSet", false);
        setField(term1453944, term1453944.getClass(), "componentOrientation", null);
        setBooleanField(term1453944, term1453944.getClass(), "newEventsOnly", false);
        setField(term1453944, term1453944.getClass(), "componentListener", null);
        setField(term1453944, term1453944.getClass(), "focusListener", null);
        setField(term1453944, term1453944.getClass(), "hierarchyListener", null);
        setField(term1453944, term1453944.getClass(), "hierarchyBoundsListener", null);
        setField(term1453944, term1453944.getClass(), "keyListener", null);
        setField(term1453944, term1453944.getClass(), "mouseListener", null);
        setField(term1453944, term1453944.getClass(), "mouseMotionListener", null);
        setField(term1453944, term1453944.getClass(), "mouseWheelListener", null);
        setField(term1453944, term1453944.getClass(), "inputMethodListener", null);
        setLongField(term1453944, term1453944.getClass(), "eventMask", 0L);
        setField(term1453944, term1453944.getClass(), "changeSupport", null);
        setField(term1453944, term1453944.getClass(), "objectLock", null);
        setBooleanField(term1453944, term1453944.getClass(), "isPacked", false);
        setIntField(term1453944, term1453944.getClass(), "boundsOp", 0);
        setField(term1453944, term1453944.getClass(), "compoundShape", null);
        setField(term1453944, term1453944.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1453944, term1453944.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1453944, term1453944.getClass(), "backgroundEraseDisabled", false);
        setField(term1453944, term1453944.getClass(), "eventCache", null);
        setBooleanField(term1453944, term1453944.getClass(), "coalescingEnabled", false);
        setBooleanField(term1453944, term1453944.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1453944, term1453944.getClass(), "componentSerializedDataVersion", 0);
        setField(term1453944, term1453944.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDesignOK", argTypes, term1453944, args);
    }

};


