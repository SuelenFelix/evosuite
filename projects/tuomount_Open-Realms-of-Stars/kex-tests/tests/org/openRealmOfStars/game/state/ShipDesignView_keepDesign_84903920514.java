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

public class ShipDesignView_keepDesign_84903920514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1502995;

    public ShipDesignView_keepDesign_84903920514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1502995 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1502995, term1502995.getClass(), "player", null);
        setField(term1502995, term1502995.getClass(), "design", null);
        setField(term1502995, term1502995.getClass(), "hullSelect", null);
        setField(term1502995, term1502995.getClass(), "componentSelect", null);
        setField(term1502995, term1502995.getClass(), "componentFilter", null);
        setField(term1502995, term1502995.getClass(), "variantSelection", null);
        setField(term1502995, term1502995.getClass(), "hullInfoText", null);
        setField(term1502995, term1502995.getClass(), "componentInfoText", null);
        setField(term1502995, term1502995.getClass(), "designNameText", null);
        setField(term1502995, term1502995.getClass(), "componentList", null);
        setField(term1502995, term1502995.getClass(), "hullImage", null);
        setBooleanField(term1502995, term1502995.getClass(), "illegalName", false);
        setBooleanField(term1502995, term1502995.getClass(), "banPrivateer", false);
        setBooleanField(term1502995, term1502995.getClass(), "banNukes", false);
        setBooleanField(term1502995, term1502995.getClass(), "isAlignmentXSet", false);
        setFloatField(term1502995, term1502995.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1502995, term1502995.getClass(), "isAlignmentYSet", false);
        setFloatField(term1502995, term1502995.getClass(), "alignmentY", 0.0F);
        setField(term1502995, term1502995.getClass(), "ui", null);
        setField(term1502995, term1502995.getClass(), "listenerList", null);
        setField(term1502995, term1502995.getClass(), "clientProperties", null);
        setField(term1502995, term1502995.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1502995, term1502995.getClass(), "autoscrolls", false);
        setField(term1502995, term1502995.getClass(), "border", null);
        setIntField(term1502995, term1502995.getClass(), "flags", 0);
        setField(term1502995, term1502995.getClass(), "inputVerifier", null);
        setBooleanField(term1502995, term1502995.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1502995, term1502995.getClass(), "paintingChild", null);
        setField(term1502995, term1502995.getClass(), "popupMenu", null);
        setField(term1502995, term1502995.getClass(), "revalidateRunnableScheduled", null);
        setField(term1502995, term1502995.getClass(), "focusInputMap", null);
        setField(term1502995, term1502995.getClass(), "ancestorInputMap", null);
        setField(term1502995, term1502995.getClass(), "windowInputMap", null);
        setField(term1502995, term1502995.getClass(), "actionMap", null);
        setField(term1502995, term1502995.getClass(), "aaHint", null);
        setField(term1502995, term1502995.getClass(), "lcdRenderingHint", null);
        setField(term1502995, term1502995.getClass(), "component", null);
        setField(term1502995, term1502995.getClass(), "layoutMgr", null);
        setField(term1502995, term1502995.getClass(), "dispatcher", null);
        setField(term1502995, term1502995.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1502995, term1502995.getClass(), "focusCycleRoot", false);
        setBooleanField(term1502995, term1502995.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1502995, term1502995.getClass(), "printingThreads", null);
        setBooleanField(term1502995, term1502995.getClass(), "printing", false);
        setField(term1502995, term1502995.getClass(), "containerListener", null);
        setIntField(term1502995, term1502995.getClass(), "listeningChildren", 0);
        setIntField(term1502995, term1502995.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1502995, term1502995.getClass(), "descendantsCount", 0);
        setField(term1502995, term1502995.getClass(), "preserveBackgroundColor", null);
        setIntField(term1502995, term1502995.getClass(), "numOfHWComponents", 0);
        setIntField(term1502995, term1502995.getClass(), "numOfLWComponents", 0);
        setField(term1502995, term1502995.getClass(), "modalComp", null);
        setField(term1502995, term1502995.getClass(), "modalAppContext", null);
        setIntField(term1502995, term1502995.getClass(), "containerSerializedDataVersion", 0);
        setField(term1502995, term1502995.getClass(), "peer", null);
        setField(term1502995, term1502995.getClass(), "parent", null);
        setField(term1502995, term1502995.getClass(), "appContext", null);
        setIntField(term1502995, term1502995.getClass(), "x", 0);
        setIntField(term1502995, term1502995.getClass(), "y", 0);
        setIntField(term1502995, term1502995.getClass(), "width", 0);
        setIntField(term1502995, term1502995.getClass(), "height", 0);
        setField(term1502995, term1502995.getClass(), "foreground", null);
        setField(term1502995, term1502995.getClass(), "background", null);
        setField(term1502995, term1502995.getClass(), "font", null);
        setField(term1502995, term1502995.getClass(), "peerFont", null);
        setField(term1502995, term1502995.getClass(), "cursor", null);
        setField(term1502995, term1502995.getClass(), "locale", null);
        setField(term1502995, term1502995.getClass(), "graphicsConfig", null);
        setField(term1502995, term1502995.getClass(), "bufferStrategy", null);
        setBooleanField(term1502995, term1502995.getClass(), "ignoreRepaint", false);
        setBooleanField(term1502995, term1502995.getClass(), "visible", false);
        setBooleanField(term1502995, term1502995.getClass(), "enabled", false);
        setBooleanField(term1502995, term1502995.getClass(), "valid", false);
        setField(term1502995, term1502995.getClass(), "dropTarget", null);
        setField(term1502995, term1502995.getClass(), "popups", null);
        setField(term1502995, term1502995.getClass(), "name", null);
        setBooleanField(term1502995, term1502995.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1502995, term1502995.getClass(), "focusable", false);
        setIntField(term1502995, term1502995.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1502995, term1502995.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1502995, term1502995.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1502995, term1502995.getClass(), "acc", null);
        setField(term1502995, term1502995.getClass(), "minSize", null);
        setBooleanField(term1502995, term1502995.getClass(), "minSizeSet", false);
        setField(term1502995, term1502995.getClass(), "prefSize", null);
        setBooleanField(term1502995, term1502995.getClass(), "prefSizeSet", false);
        setField(term1502995, term1502995.getClass(), "maxSize", null);
        setBooleanField(term1502995, term1502995.getClass(), "maxSizeSet", false);
        setField(term1502995, term1502995.getClass(), "componentOrientation", null);
        setBooleanField(term1502995, term1502995.getClass(), "newEventsOnly", false);
        setField(term1502995, term1502995.getClass(), "componentListener", null);
        setField(term1502995, term1502995.getClass(), "focusListener", null);
        setField(term1502995, term1502995.getClass(), "hierarchyListener", null);
        setField(term1502995, term1502995.getClass(), "hierarchyBoundsListener", null);
        setField(term1502995, term1502995.getClass(), "keyListener", null);
        setField(term1502995, term1502995.getClass(), "mouseListener", null);
        setField(term1502995, term1502995.getClass(), "mouseMotionListener", null);
        setField(term1502995, term1502995.getClass(), "mouseWheelListener", null);
        setField(term1502995, term1502995.getClass(), "inputMethodListener", null);
        setLongField(term1502995, term1502995.getClass(), "eventMask", 0L);
        setField(term1502995, term1502995.getClass(), "changeSupport", null);
        setField(term1502995, term1502995.getClass(), "objectLock", null);
        setBooleanField(term1502995, term1502995.getClass(), "isPacked", false);
        setIntField(term1502995, term1502995.getClass(), "boundsOp", 0);
        setField(term1502995, term1502995.getClass(), "compoundShape", null);
        setField(term1502995, term1502995.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1502995, term1502995.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1502995, term1502995.getClass(), "backgroundEraseDisabled", false);
        setField(term1502995, term1502995.getClass(), "eventCache", null);
        setBooleanField(term1502995, term1502995.getClass(), "coalescingEnabled", false);
        setBooleanField(term1502995, term1502995.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1502995, term1502995.getClass(), "componentSerializedDataVersion", 0);
        setField(term1502995, term1502995.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "keepDesign", argTypes, term1502995, args);
    }

};


