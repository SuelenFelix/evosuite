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

public class ShipDesignView_setBanNukes_125466496122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1537931;
     Object term1537975;

    public ShipDesignView_setBanNukes_125466496122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1537931 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1537931, term1537931.getClass(), "player", null);
        setField(term1537931, term1537931.getClass(), "design", null);
        setField(term1537931, term1537931.getClass(), "hullSelect", null);
        setField(term1537931, term1537931.getClass(), "componentSelect", null);
        setField(term1537931, term1537931.getClass(), "componentFilter", null);
        setField(term1537931, term1537931.getClass(), "variantSelection", null);
        setField(term1537931, term1537931.getClass(), "hullInfoText", null);
        setField(term1537931, term1537931.getClass(), "componentInfoText", null);
        setField(term1537931, term1537931.getClass(), "designNameText", null);
        setField(term1537931, term1537931.getClass(), "componentList", null);
        setField(term1537931, term1537931.getClass(), "hullImage", null);
        setBooleanField(term1537931, term1537931.getClass(), "illegalName", false);
        setBooleanField(term1537931, term1537931.getClass(), "banPrivateer", false);
        setBooleanField(term1537931, term1537931.getClass(), "banNukes", false);
        setBooleanField(term1537931, term1537931.getClass(), "isAlignmentXSet", false);
        setFloatField(term1537931, term1537931.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1537931, term1537931.getClass(), "isAlignmentYSet", false);
        setFloatField(term1537931, term1537931.getClass(), "alignmentY", 0.0F);
        setField(term1537931, term1537931.getClass(), "ui", null);
        setField(term1537931, term1537931.getClass(), "listenerList", null);
        setField(term1537931, term1537931.getClass(), "clientProperties", null);
        setField(term1537931, term1537931.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1537931, term1537931.getClass(), "autoscrolls", false);
        setField(term1537931, term1537931.getClass(), "border", null);
        setIntField(term1537931, term1537931.getClass(), "flags", 0);
        setField(term1537931, term1537931.getClass(), "inputVerifier", null);
        setBooleanField(term1537931, term1537931.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1537931, term1537931.getClass(), "paintingChild", null);
        setField(term1537931, term1537931.getClass(), "popupMenu", null);
        setField(term1537931, term1537931.getClass(), "revalidateRunnableScheduled", null);
        setField(term1537931, term1537931.getClass(), "focusInputMap", null);
        setField(term1537931, term1537931.getClass(), "ancestorInputMap", null);
        setField(term1537931, term1537931.getClass(), "windowInputMap", null);
        setField(term1537931, term1537931.getClass(), "actionMap", null);
        setField(term1537931, term1537931.getClass(), "aaHint", null);
        setField(term1537931, term1537931.getClass(), "lcdRenderingHint", null);
        setField(term1537931, term1537931.getClass(), "component", null);
        setField(term1537931, term1537931.getClass(), "layoutMgr", null);
        setField(term1537931, term1537931.getClass(), "dispatcher", null);
        setField(term1537931, term1537931.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1537931, term1537931.getClass(), "focusCycleRoot", false);
        setBooleanField(term1537931, term1537931.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1537931, term1537931.getClass(), "printingThreads", null);
        setBooleanField(term1537931, term1537931.getClass(), "printing", false);
        setField(term1537931, term1537931.getClass(), "containerListener", null);
        setIntField(term1537931, term1537931.getClass(), "listeningChildren", 0);
        setIntField(term1537931, term1537931.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1537931, term1537931.getClass(), "descendantsCount", 0);
        setField(term1537931, term1537931.getClass(), "preserveBackgroundColor", null);
        setIntField(term1537931, term1537931.getClass(), "numOfHWComponents", 0);
        setIntField(term1537931, term1537931.getClass(), "numOfLWComponents", 0);
        setField(term1537931, term1537931.getClass(), "modalComp", null);
        setField(term1537931, term1537931.getClass(), "modalAppContext", null);
        setIntField(term1537931, term1537931.getClass(), "containerSerializedDataVersion", 0);
        setField(term1537931, term1537931.getClass(), "peer", null);
        setField(term1537931, term1537931.getClass(), "parent", null);
        setField(term1537931, term1537931.getClass(), "appContext", null);
        setIntField(term1537931, term1537931.getClass(), "x", 0);
        setIntField(term1537931, term1537931.getClass(), "y", 0);
        setIntField(term1537931, term1537931.getClass(), "width", 0);
        setIntField(term1537931, term1537931.getClass(), "height", 0);
        setField(term1537931, term1537931.getClass(), "foreground", null);
        setField(term1537931, term1537931.getClass(), "background", null);
        setField(term1537931, term1537931.getClass(), "font", null);
        setField(term1537931, term1537931.getClass(), "peerFont", null);
        setField(term1537931, term1537931.getClass(), "cursor", null);
        setField(term1537931, term1537931.getClass(), "locale", null);
        setField(term1537931, term1537931.getClass(), "graphicsConfig", null);
        setField(term1537931, term1537931.getClass(), "bufferStrategy", null);
        setBooleanField(term1537931, term1537931.getClass(), "ignoreRepaint", false);
        setBooleanField(term1537931, term1537931.getClass(), "visible", false);
        setBooleanField(term1537931, term1537931.getClass(), "enabled", false);
        setBooleanField(term1537931, term1537931.getClass(), "valid", false);
        setField(term1537931, term1537931.getClass(), "dropTarget", null);
        setField(term1537931, term1537931.getClass(), "popups", null);
        setField(term1537931, term1537931.getClass(), "name", null);
        setBooleanField(term1537931, term1537931.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1537931, term1537931.getClass(), "focusable", false);
        setIntField(term1537931, term1537931.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1537931, term1537931.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1537931, term1537931.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1537931, term1537931.getClass(), "acc", null);
        setField(term1537931, term1537931.getClass(), "minSize", null);
        setBooleanField(term1537931, term1537931.getClass(), "minSizeSet", false);
        setField(term1537931, term1537931.getClass(), "prefSize", null);
        setBooleanField(term1537931, term1537931.getClass(), "prefSizeSet", false);
        setField(term1537931, term1537931.getClass(), "maxSize", null);
        setBooleanField(term1537931, term1537931.getClass(), "maxSizeSet", false);
        setField(term1537931, term1537931.getClass(), "componentOrientation", null);
        setBooleanField(term1537931, term1537931.getClass(), "newEventsOnly", false);
        setField(term1537931, term1537931.getClass(), "componentListener", null);
        setField(term1537931, term1537931.getClass(), "focusListener", null);
        setField(term1537931, term1537931.getClass(), "hierarchyListener", null);
        setField(term1537931, term1537931.getClass(), "hierarchyBoundsListener", null);
        setField(term1537931, term1537931.getClass(), "keyListener", null);
        setField(term1537931, term1537931.getClass(), "mouseListener", null);
        setField(term1537931, term1537931.getClass(), "mouseMotionListener", null);
        setField(term1537931, term1537931.getClass(), "mouseWheelListener", null);
        setField(term1537931, term1537931.getClass(), "inputMethodListener", null);
        setLongField(term1537931, term1537931.getClass(), "eventMask", 0L);
        setField(term1537931, term1537931.getClass(), "changeSupport", null);
        setField(term1537931, term1537931.getClass(), "objectLock", null);
        setBooleanField(term1537931, term1537931.getClass(), "isPacked", false);
        setIntField(term1537931, term1537931.getClass(), "boundsOp", 0);
        setField(term1537931, term1537931.getClass(), "compoundShape", null);
        setField(term1537931, term1537931.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1537931, term1537931.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1537931, term1537931.getClass(), "backgroundEraseDisabled", false);
        setField(term1537931, term1537931.getClass(), "eventCache", null);
        setBooleanField(term1537931, term1537931.getClass(), "coalescingEnabled", false);
        setBooleanField(term1537931, term1537931.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1537931, term1537931.getClass(), "componentSerializedDataVersion", 0);
        setField(term1537931, term1537931.getClass(), "accessibleContext", null);
        term1537975 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1537975;
        callMethod(klass, "setBanNukes", argTypes, term1537931, args);
    }

};


