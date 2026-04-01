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

public class ShipDesignView_isBanPrivateer_5970334516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1511514;

    public ShipDesignView_isBanPrivateer_5970334516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1511514 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1511514, term1511514.getClass(), "player", null);
        setField(term1511514, term1511514.getClass(), "design", null);
        setField(term1511514, term1511514.getClass(), "hullSelect", null);
        setField(term1511514, term1511514.getClass(), "componentSelect", null);
        setField(term1511514, term1511514.getClass(), "componentFilter", null);
        setField(term1511514, term1511514.getClass(), "variantSelection", null);
        setField(term1511514, term1511514.getClass(), "hullInfoText", null);
        setField(term1511514, term1511514.getClass(), "componentInfoText", null);
        setField(term1511514, term1511514.getClass(), "designNameText", null);
        setField(term1511514, term1511514.getClass(), "componentList", null);
        setField(term1511514, term1511514.getClass(), "hullImage", null);
        setBooleanField(term1511514, term1511514.getClass(), "illegalName", false);
        setBooleanField(term1511514, term1511514.getClass(), "banPrivateer", false);
        setBooleanField(term1511514, term1511514.getClass(), "banNukes", false);
        setBooleanField(term1511514, term1511514.getClass(), "isAlignmentXSet", false);
        setFloatField(term1511514, term1511514.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1511514, term1511514.getClass(), "isAlignmentYSet", false);
        setFloatField(term1511514, term1511514.getClass(), "alignmentY", 0.0F);
        setField(term1511514, term1511514.getClass(), "ui", null);
        setField(term1511514, term1511514.getClass(), "listenerList", null);
        setField(term1511514, term1511514.getClass(), "clientProperties", null);
        setField(term1511514, term1511514.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1511514, term1511514.getClass(), "autoscrolls", false);
        setField(term1511514, term1511514.getClass(), "border", null);
        setIntField(term1511514, term1511514.getClass(), "flags", 0);
        setField(term1511514, term1511514.getClass(), "inputVerifier", null);
        setBooleanField(term1511514, term1511514.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1511514, term1511514.getClass(), "paintingChild", null);
        setField(term1511514, term1511514.getClass(), "popupMenu", null);
        setField(term1511514, term1511514.getClass(), "revalidateRunnableScheduled", null);
        setField(term1511514, term1511514.getClass(), "focusInputMap", null);
        setField(term1511514, term1511514.getClass(), "ancestorInputMap", null);
        setField(term1511514, term1511514.getClass(), "windowInputMap", null);
        setField(term1511514, term1511514.getClass(), "actionMap", null);
        setField(term1511514, term1511514.getClass(), "aaHint", null);
        setField(term1511514, term1511514.getClass(), "lcdRenderingHint", null);
        setField(term1511514, term1511514.getClass(), "component", null);
        setField(term1511514, term1511514.getClass(), "layoutMgr", null);
        setField(term1511514, term1511514.getClass(), "dispatcher", null);
        setField(term1511514, term1511514.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1511514, term1511514.getClass(), "focusCycleRoot", false);
        setBooleanField(term1511514, term1511514.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1511514, term1511514.getClass(), "printingThreads", null);
        setBooleanField(term1511514, term1511514.getClass(), "printing", false);
        setField(term1511514, term1511514.getClass(), "containerListener", null);
        setIntField(term1511514, term1511514.getClass(), "listeningChildren", 0);
        setIntField(term1511514, term1511514.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1511514, term1511514.getClass(), "descendantsCount", 0);
        setField(term1511514, term1511514.getClass(), "preserveBackgroundColor", null);
        setIntField(term1511514, term1511514.getClass(), "numOfHWComponents", 0);
        setIntField(term1511514, term1511514.getClass(), "numOfLWComponents", 0);
        setField(term1511514, term1511514.getClass(), "modalComp", null);
        setField(term1511514, term1511514.getClass(), "modalAppContext", null);
        setIntField(term1511514, term1511514.getClass(), "containerSerializedDataVersion", 0);
        setField(term1511514, term1511514.getClass(), "peer", null);
        setField(term1511514, term1511514.getClass(), "parent", null);
        setField(term1511514, term1511514.getClass(), "appContext", null);
        setIntField(term1511514, term1511514.getClass(), "x", 0);
        setIntField(term1511514, term1511514.getClass(), "y", 0);
        setIntField(term1511514, term1511514.getClass(), "width", 0);
        setIntField(term1511514, term1511514.getClass(), "height", 0);
        setField(term1511514, term1511514.getClass(), "foreground", null);
        setField(term1511514, term1511514.getClass(), "background", null);
        setField(term1511514, term1511514.getClass(), "font", null);
        setField(term1511514, term1511514.getClass(), "peerFont", null);
        setField(term1511514, term1511514.getClass(), "cursor", null);
        setField(term1511514, term1511514.getClass(), "locale", null);
        setField(term1511514, term1511514.getClass(), "graphicsConfig", null);
        setField(term1511514, term1511514.getClass(), "bufferStrategy", null);
        setBooleanField(term1511514, term1511514.getClass(), "ignoreRepaint", false);
        setBooleanField(term1511514, term1511514.getClass(), "visible", false);
        setBooleanField(term1511514, term1511514.getClass(), "enabled", false);
        setBooleanField(term1511514, term1511514.getClass(), "valid", false);
        setField(term1511514, term1511514.getClass(), "dropTarget", null);
        setField(term1511514, term1511514.getClass(), "popups", null);
        setField(term1511514, term1511514.getClass(), "name", null);
        setBooleanField(term1511514, term1511514.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1511514, term1511514.getClass(), "focusable", false);
        setIntField(term1511514, term1511514.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1511514, term1511514.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1511514, term1511514.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1511514, term1511514.getClass(), "acc", null);
        setField(term1511514, term1511514.getClass(), "minSize", null);
        setBooleanField(term1511514, term1511514.getClass(), "minSizeSet", false);
        setField(term1511514, term1511514.getClass(), "prefSize", null);
        setBooleanField(term1511514, term1511514.getClass(), "prefSizeSet", false);
        setField(term1511514, term1511514.getClass(), "maxSize", null);
        setBooleanField(term1511514, term1511514.getClass(), "maxSizeSet", false);
        setField(term1511514, term1511514.getClass(), "componentOrientation", null);
        setBooleanField(term1511514, term1511514.getClass(), "newEventsOnly", false);
        setField(term1511514, term1511514.getClass(), "componentListener", null);
        setField(term1511514, term1511514.getClass(), "focusListener", null);
        setField(term1511514, term1511514.getClass(), "hierarchyListener", null);
        setField(term1511514, term1511514.getClass(), "hierarchyBoundsListener", null);
        setField(term1511514, term1511514.getClass(), "keyListener", null);
        setField(term1511514, term1511514.getClass(), "mouseListener", null);
        setField(term1511514, term1511514.getClass(), "mouseMotionListener", null);
        setField(term1511514, term1511514.getClass(), "mouseWheelListener", null);
        setField(term1511514, term1511514.getClass(), "inputMethodListener", null);
        setLongField(term1511514, term1511514.getClass(), "eventMask", 0L);
        setField(term1511514, term1511514.getClass(), "changeSupport", null);
        setField(term1511514, term1511514.getClass(), "objectLock", null);
        setBooleanField(term1511514, term1511514.getClass(), "isPacked", false);
        setIntField(term1511514, term1511514.getClass(), "boundsOp", 0);
        setField(term1511514, term1511514.getClass(), "compoundShape", null);
        setField(term1511514, term1511514.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1511514, term1511514.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1511514, term1511514.getClass(), "backgroundEraseDisabled", false);
        setField(term1511514, term1511514.getClass(), "eventCache", null);
        setBooleanField(term1511514, term1511514.getClass(), "coalescingEnabled", false);
        setBooleanField(term1511514, term1511514.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1511514, term1511514.getClass(), "componentSerializedDataVersion", 0);
        setField(term1511514, term1511514.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBanPrivateer", argTypes, term1511514, args);
    }

};


