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

public class ShipDesignView_isBanNukes_43659841720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1530127;

    public ShipDesignView_isBanNukes_43659841720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1530127 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1530127, term1530127.getClass(), "player", null);
        setField(term1530127, term1530127.getClass(), "design", null);
        setField(term1530127, term1530127.getClass(), "hullSelect", null);
        setField(term1530127, term1530127.getClass(), "componentSelect", null);
        setField(term1530127, term1530127.getClass(), "componentFilter", null);
        setField(term1530127, term1530127.getClass(), "variantSelection", null);
        setField(term1530127, term1530127.getClass(), "hullInfoText", null);
        setField(term1530127, term1530127.getClass(), "componentInfoText", null);
        setField(term1530127, term1530127.getClass(), "designNameText", null);
        setField(term1530127, term1530127.getClass(), "componentList", null);
        setField(term1530127, term1530127.getClass(), "hullImage", null);
        setBooleanField(term1530127, term1530127.getClass(), "illegalName", false);
        setBooleanField(term1530127, term1530127.getClass(), "banPrivateer", false);
        setBooleanField(term1530127, term1530127.getClass(), "banNukes", false);
        setBooleanField(term1530127, term1530127.getClass(), "isAlignmentXSet", false);
        setFloatField(term1530127, term1530127.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1530127, term1530127.getClass(), "isAlignmentYSet", false);
        setFloatField(term1530127, term1530127.getClass(), "alignmentY", 0.0F);
        setField(term1530127, term1530127.getClass(), "ui", null);
        setField(term1530127, term1530127.getClass(), "listenerList", null);
        setField(term1530127, term1530127.getClass(), "clientProperties", null);
        setField(term1530127, term1530127.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1530127, term1530127.getClass(), "autoscrolls", false);
        setField(term1530127, term1530127.getClass(), "border", null);
        setIntField(term1530127, term1530127.getClass(), "flags", 0);
        setField(term1530127, term1530127.getClass(), "inputVerifier", null);
        setBooleanField(term1530127, term1530127.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1530127, term1530127.getClass(), "paintingChild", null);
        setField(term1530127, term1530127.getClass(), "popupMenu", null);
        setField(term1530127, term1530127.getClass(), "revalidateRunnableScheduled", null);
        setField(term1530127, term1530127.getClass(), "focusInputMap", null);
        setField(term1530127, term1530127.getClass(), "ancestorInputMap", null);
        setField(term1530127, term1530127.getClass(), "windowInputMap", null);
        setField(term1530127, term1530127.getClass(), "actionMap", null);
        setField(term1530127, term1530127.getClass(), "aaHint", null);
        setField(term1530127, term1530127.getClass(), "lcdRenderingHint", null);
        setField(term1530127, term1530127.getClass(), "component", null);
        setField(term1530127, term1530127.getClass(), "layoutMgr", null);
        setField(term1530127, term1530127.getClass(), "dispatcher", null);
        setField(term1530127, term1530127.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1530127, term1530127.getClass(), "focusCycleRoot", false);
        setBooleanField(term1530127, term1530127.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1530127, term1530127.getClass(), "printingThreads", null);
        setBooleanField(term1530127, term1530127.getClass(), "printing", false);
        setField(term1530127, term1530127.getClass(), "containerListener", null);
        setIntField(term1530127, term1530127.getClass(), "listeningChildren", 0);
        setIntField(term1530127, term1530127.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1530127, term1530127.getClass(), "descendantsCount", 0);
        setField(term1530127, term1530127.getClass(), "preserveBackgroundColor", null);
        setIntField(term1530127, term1530127.getClass(), "numOfHWComponents", 0);
        setIntField(term1530127, term1530127.getClass(), "numOfLWComponents", 0);
        setField(term1530127, term1530127.getClass(), "modalComp", null);
        setField(term1530127, term1530127.getClass(), "modalAppContext", null);
        setIntField(term1530127, term1530127.getClass(), "containerSerializedDataVersion", 0);
        setField(term1530127, term1530127.getClass(), "peer", null);
        setField(term1530127, term1530127.getClass(), "parent", null);
        setField(term1530127, term1530127.getClass(), "appContext", null);
        setIntField(term1530127, term1530127.getClass(), "x", 0);
        setIntField(term1530127, term1530127.getClass(), "y", 0);
        setIntField(term1530127, term1530127.getClass(), "width", 0);
        setIntField(term1530127, term1530127.getClass(), "height", 0);
        setField(term1530127, term1530127.getClass(), "foreground", null);
        setField(term1530127, term1530127.getClass(), "background", null);
        setField(term1530127, term1530127.getClass(), "font", null);
        setField(term1530127, term1530127.getClass(), "peerFont", null);
        setField(term1530127, term1530127.getClass(), "cursor", null);
        setField(term1530127, term1530127.getClass(), "locale", null);
        setField(term1530127, term1530127.getClass(), "graphicsConfig", null);
        setField(term1530127, term1530127.getClass(), "bufferStrategy", null);
        setBooleanField(term1530127, term1530127.getClass(), "ignoreRepaint", false);
        setBooleanField(term1530127, term1530127.getClass(), "visible", false);
        setBooleanField(term1530127, term1530127.getClass(), "enabled", false);
        setBooleanField(term1530127, term1530127.getClass(), "valid", false);
        setField(term1530127, term1530127.getClass(), "dropTarget", null);
        setField(term1530127, term1530127.getClass(), "popups", null);
        setField(term1530127, term1530127.getClass(), "name", null);
        setBooleanField(term1530127, term1530127.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1530127, term1530127.getClass(), "focusable", false);
        setIntField(term1530127, term1530127.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1530127, term1530127.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1530127, term1530127.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1530127, term1530127.getClass(), "acc", null);
        setField(term1530127, term1530127.getClass(), "minSize", null);
        setBooleanField(term1530127, term1530127.getClass(), "minSizeSet", false);
        setField(term1530127, term1530127.getClass(), "prefSize", null);
        setBooleanField(term1530127, term1530127.getClass(), "prefSizeSet", false);
        setField(term1530127, term1530127.getClass(), "maxSize", null);
        setBooleanField(term1530127, term1530127.getClass(), "maxSizeSet", false);
        setField(term1530127, term1530127.getClass(), "componentOrientation", null);
        setBooleanField(term1530127, term1530127.getClass(), "newEventsOnly", false);
        setField(term1530127, term1530127.getClass(), "componentListener", null);
        setField(term1530127, term1530127.getClass(), "focusListener", null);
        setField(term1530127, term1530127.getClass(), "hierarchyListener", null);
        setField(term1530127, term1530127.getClass(), "hierarchyBoundsListener", null);
        setField(term1530127, term1530127.getClass(), "keyListener", null);
        setField(term1530127, term1530127.getClass(), "mouseListener", null);
        setField(term1530127, term1530127.getClass(), "mouseMotionListener", null);
        setField(term1530127, term1530127.getClass(), "mouseWheelListener", null);
        setField(term1530127, term1530127.getClass(), "inputMethodListener", null);
        setLongField(term1530127, term1530127.getClass(), "eventMask", 0L);
        setField(term1530127, term1530127.getClass(), "changeSupport", null);
        setField(term1530127, term1530127.getClass(), "objectLock", null);
        setBooleanField(term1530127, term1530127.getClass(), "isPacked", false);
        setIntField(term1530127, term1530127.getClass(), "boundsOp", 0);
        setField(term1530127, term1530127.getClass(), "compoundShape", null);
        setField(term1530127, term1530127.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1530127, term1530127.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1530127, term1530127.getClass(), "backgroundEraseDisabled", false);
        setField(term1530127, term1530127.getClass(), "eventCache", null);
        setBooleanField(term1530127, term1530127.getClass(), "coalescingEnabled", false);
        setBooleanField(term1530127, term1530127.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1530127, term1530127.getClass(), "componentSerializedDataVersion", 0);
        setField(term1530127, term1530127.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBanNukes", argTypes, term1530127, args);
    }

};


