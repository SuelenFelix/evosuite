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

public class ShipDesignView_isDesignOK_67813055212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1493737;

    public ShipDesignView_isDesignOK_67813055212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1493737 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView"));
        setField(term1493737, term1493737.getClass(), "player", null);
        setField(term1493737, term1493737.getClass(), "design", null);
        setField(term1493737, term1493737.getClass(), "hullSelect", null);
        setField(term1493737, term1493737.getClass(), "componentSelect", null);
        setField(term1493737, term1493737.getClass(), "componentFilter", null);
        setField(term1493737, term1493737.getClass(), "variantSelection", null);
        setField(term1493737, term1493737.getClass(), "hullInfoText", null);
        setField(term1493737, term1493737.getClass(), "componentInfoText", null);
        setField(term1493737, term1493737.getClass(), "designNameText", null);
        setField(term1493737, term1493737.getClass(), "componentList", null);
        setField(term1493737, term1493737.getClass(), "hullImage", null);
        setBooleanField(term1493737, term1493737.getClass(), "illegalName", false);
        setBooleanField(term1493737, term1493737.getClass(), "banPrivateer", false);
        setBooleanField(term1493737, term1493737.getClass(), "banNukes", false);
        setBooleanField(term1493737, term1493737.getClass(), "isAlignmentXSet", false);
        setFloatField(term1493737, term1493737.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1493737, term1493737.getClass(), "isAlignmentYSet", false);
        setFloatField(term1493737, term1493737.getClass(), "alignmentY", 0.0F);
        setField(term1493737, term1493737.getClass(), "ui", null);
        setField(term1493737, term1493737.getClass(), "listenerList", null);
        setField(term1493737, term1493737.getClass(), "clientProperties", null);
        setField(term1493737, term1493737.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1493737, term1493737.getClass(), "autoscrolls", false);
        setField(term1493737, term1493737.getClass(), "border", null);
        setIntField(term1493737, term1493737.getClass(), "flags", 0);
        setField(term1493737, term1493737.getClass(), "inputVerifier", null);
        setBooleanField(term1493737, term1493737.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1493737, term1493737.getClass(), "paintingChild", null);
        setField(term1493737, term1493737.getClass(), "popupMenu", null);
        setField(term1493737, term1493737.getClass(), "revalidateRunnableScheduled", null);
        setField(term1493737, term1493737.getClass(), "focusInputMap", null);
        setField(term1493737, term1493737.getClass(), "ancestorInputMap", null);
        setField(term1493737, term1493737.getClass(), "windowInputMap", null);
        setField(term1493737, term1493737.getClass(), "actionMap", null);
        setField(term1493737, term1493737.getClass(), "aaHint", null);
        setField(term1493737, term1493737.getClass(), "lcdRenderingHint", null);
        setField(term1493737, term1493737.getClass(), "component", null);
        setField(term1493737, term1493737.getClass(), "layoutMgr", null);
        setField(term1493737, term1493737.getClass(), "dispatcher", null);
        setField(term1493737, term1493737.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1493737, term1493737.getClass(), "focusCycleRoot", false);
        setBooleanField(term1493737, term1493737.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1493737, term1493737.getClass(), "printingThreads", null);
        setBooleanField(term1493737, term1493737.getClass(), "printing", false);
        setField(term1493737, term1493737.getClass(), "containerListener", null);
        setIntField(term1493737, term1493737.getClass(), "listeningChildren", 0);
        setIntField(term1493737, term1493737.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1493737, term1493737.getClass(), "descendantsCount", 0);
        setField(term1493737, term1493737.getClass(), "preserveBackgroundColor", null);
        setIntField(term1493737, term1493737.getClass(), "numOfHWComponents", 0);
        setIntField(term1493737, term1493737.getClass(), "numOfLWComponents", 0);
        setField(term1493737, term1493737.getClass(), "modalComp", null);
        setField(term1493737, term1493737.getClass(), "modalAppContext", null);
        setIntField(term1493737, term1493737.getClass(), "containerSerializedDataVersion", 0);
        setField(term1493737, term1493737.getClass(), "peer", null);
        setField(term1493737, term1493737.getClass(), "parent", null);
        setField(term1493737, term1493737.getClass(), "appContext", null);
        setIntField(term1493737, term1493737.getClass(), "x", 0);
        setIntField(term1493737, term1493737.getClass(), "y", 0);
        setIntField(term1493737, term1493737.getClass(), "width", 0);
        setIntField(term1493737, term1493737.getClass(), "height", 0);
        setField(term1493737, term1493737.getClass(), "foreground", null);
        setField(term1493737, term1493737.getClass(), "background", null);
        setField(term1493737, term1493737.getClass(), "font", null);
        setField(term1493737, term1493737.getClass(), "peerFont", null);
        setField(term1493737, term1493737.getClass(), "cursor", null);
        setField(term1493737, term1493737.getClass(), "locale", null);
        setField(term1493737, term1493737.getClass(), "graphicsConfig", null);
        setField(term1493737, term1493737.getClass(), "bufferStrategy", null);
        setBooleanField(term1493737, term1493737.getClass(), "ignoreRepaint", false);
        setBooleanField(term1493737, term1493737.getClass(), "visible", false);
        setBooleanField(term1493737, term1493737.getClass(), "enabled", false);
        setBooleanField(term1493737, term1493737.getClass(), "valid", false);
        setField(term1493737, term1493737.getClass(), "dropTarget", null);
        setField(term1493737, term1493737.getClass(), "popups", null);
        setField(term1493737, term1493737.getClass(), "name", null);
        setBooleanField(term1493737, term1493737.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1493737, term1493737.getClass(), "focusable", false);
        setIntField(term1493737, term1493737.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1493737, term1493737.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1493737, term1493737.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1493737, term1493737.getClass(), "acc", null);
        setField(term1493737, term1493737.getClass(), "minSize", null);
        setBooleanField(term1493737, term1493737.getClass(), "minSizeSet", false);
        setField(term1493737, term1493737.getClass(), "prefSize", null);
        setBooleanField(term1493737, term1493737.getClass(), "prefSizeSet", false);
        setField(term1493737, term1493737.getClass(), "maxSize", null);
        setBooleanField(term1493737, term1493737.getClass(), "maxSizeSet", false);
        setField(term1493737, term1493737.getClass(), "componentOrientation", null);
        setBooleanField(term1493737, term1493737.getClass(), "newEventsOnly", false);
        setField(term1493737, term1493737.getClass(), "componentListener", null);
        setField(term1493737, term1493737.getClass(), "focusListener", null);
        setField(term1493737, term1493737.getClass(), "hierarchyListener", null);
        setField(term1493737, term1493737.getClass(), "hierarchyBoundsListener", null);
        setField(term1493737, term1493737.getClass(), "keyListener", null);
        setField(term1493737, term1493737.getClass(), "mouseListener", null);
        setField(term1493737, term1493737.getClass(), "mouseMotionListener", null);
        setField(term1493737, term1493737.getClass(), "mouseWheelListener", null);
        setField(term1493737, term1493737.getClass(), "inputMethodListener", null);
        setLongField(term1493737, term1493737.getClass(), "eventMask", 0L);
        setField(term1493737, term1493737.getClass(), "changeSupport", null);
        setField(term1493737, term1493737.getClass(), "objectLock", null);
        setBooleanField(term1493737, term1493737.getClass(), "isPacked", false);
        setIntField(term1493737, term1493737.getClass(), "boundsOp", 0);
        setField(term1493737, term1493737.getClass(), "compoundShape", null);
        setField(term1493737, term1493737.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1493737, term1493737.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1493737, term1493737.getClass(), "backgroundEraseDisabled", false);
        setField(term1493737, term1493737.getClass(), "eventCache", null);
        setBooleanField(term1493737, term1493737.getClass(), "coalescingEnabled", false);
        setBooleanField(term1493737, term1493737.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1493737, term1493737.getClass(), "componentSerializedDataVersion", 0);
        setField(term1493737, term1493737.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDesignOK", argTypes, term1493737, args);
    }

};


