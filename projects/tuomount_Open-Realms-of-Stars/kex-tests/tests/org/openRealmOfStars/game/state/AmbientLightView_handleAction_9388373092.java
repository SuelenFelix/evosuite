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

public class AmbientLightView_handleAction_9388373092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176727;

    public AmbientLightView_handleAction_9388373092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176727 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term176727, term176727.getClass(), "hostnameField", null);
        setField(term176727, term176727.getClass(), "usernameField", null);
        setField(term176727, term176727.getClass(), "connectBtn", null);
        setField(term176727, term176727.getClass(), "infoText", null);
        setField(term176727, term176727.getClass(), "listOfDevices", null);
        setField(term176727, term176727.getClass(), "centerLightSelection", null);
        setField(term176727, term176727.getClass(), "leftLightSelection", null);
        setField(term176727, term176727.getClass(), "rightLightSelection", null);
        setField(term176727, term176727.getClass(), "effectSelection", null);
        setField(term176727, term176727.getClass(), "ambientLightsBox", null);
        setField(term176727, term176727.getClass(), "lightsSlider", null);
        setField(term176727, term176727.getClass(), "bridge", null);
        setBooleanField(term176727, term176727.getClass(), "lightListUpdated", false);
        setBooleanField(term176727, term176727.getClass(), "justScanned", false);
        setBooleanField(term176727, term176727.getClass(), "isAlignmentXSet", false);
        setFloatField(term176727, term176727.getClass(), "alignmentX", 0.0F);
        setBooleanField(term176727, term176727.getClass(), "isAlignmentYSet", false);
        setFloatField(term176727, term176727.getClass(), "alignmentY", 0.0F);
        setField(term176727, term176727.getClass(), "ui", null);
        setField(term176727, term176727.getClass(), "listenerList", null);
        setField(term176727, term176727.getClass(), "clientProperties", null);
        setField(term176727, term176727.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term176727, term176727.getClass(), "autoscrolls", false);
        setField(term176727, term176727.getClass(), "border", null);
        setIntField(term176727, term176727.getClass(), "flags", 0);
        setField(term176727, term176727.getClass(), "inputVerifier", null);
        setBooleanField(term176727, term176727.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term176727, term176727.getClass(), "paintingChild", null);
        setField(term176727, term176727.getClass(), "popupMenu", null);
        setField(term176727, term176727.getClass(), "revalidateRunnableScheduled", null);
        setField(term176727, term176727.getClass(), "focusInputMap", null);
        setField(term176727, term176727.getClass(), "ancestorInputMap", null);
        setField(term176727, term176727.getClass(), "windowInputMap", null);
        setField(term176727, term176727.getClass(), "actionMap", null);
        setField(term176727, term176727.getClass(), "aaHint", null);
        setField(term176727, term176727.getClass(), "lcdRenderingHint", null);
        setField(term176727, term176727.getClass(), "component", null);
        setField(term176727, term176727.getClass(), "layoutMgr", null);
        setField(term176727, term176727.getClass(), "dispatcher", null);
        setField(term176727, term176727.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term176727, term176727.getClass(), "focusCycleRoot", false);
        setBooleanField(term176727, term176727.getClass(), "focusTraversalPolicyProvider", false);
        setField(term176727, term176727.getClass(), "printingThreads", null);
        setBooleanField(term176727, term176727.getClass(), "printing", false);
        setField(term176727, term176727.getClass(), "containerListener", null);
        setIntField(term176727, term176727.getClass(), "listeningChildren", 0);
        setIntField(term176727, term176727.getClass(), "listeningBoundsChildren", 0);
        setIntField(term176727, term176727.getClass(), "descendantsCount", 0);
        setField(term176727, term176727.getClass(), "preserveBackgroundColor", null);
        setIntField(term176727, term176727.getClass(), "numOfHWComponents", 0);
        setIntField(term176727, term176727.getClass(), "numOfLWComponents", 0);
        setField(term176727, term176727.getClass(), "modalComp", null);
        setField(term176727, term176727.getClass(), "modalAppContext", null);
        setIntField(term176727, term176727.getClass(), "containerSerializedDataVersion", 0);
        setField(term176727, term176727.getClass(), "peer", null);
        setField(term176727, term176727.getClass(), "parent", null);
        setField(term176727, term176727.getClass(), "appContext", null);
        setIntField(term176727, term176727.getClass(), "x", 0);
        setIntField(term176727, term176727.getClass(), "y", 0);
        setIntField(term176727, term176727.getClass(), "width", 0);
        setIntField(term176727, term176727.getClass(), "height", 0);
        setField(term176727, term176727.getClass(), "foreground", null);
        setField(term176727, term176727.getClass(), "background", null);
        setField(term176727, term176727.getClass(), "font", null);
        setField(term176727, term176727.getClass(), "peerFont", null);
        setField(term176727, term176727.getClass(), "cursor", null);
        setField(term176727, term176727.getClass(), "locale", null);
        setField(term176727, term176727.getClass(), "graphicsConfig", null);
        setField(term176727, term176727.getClass(), "bufferStrategy", null);
        setBooleanField(term176727, term176727.getClass(), "ignoreRepaint", false);
        setBooleanField(term176727, term176727.getClass(), "visible", false);
        setBooleanField(term176727, term176727.getClass(), "enabled", false);
        setBooleanField(term176727, term176727.getClass(), "valid", false);
        setField(term176727, term176727.getClass(), "dropTarget", null);
        setField(term176727, term176727.getClass(), "popups", null);
        setField(term176727, term176727.getClass(), "name", null);
        setBooleanField(term176727, term176727.getClass(), "nameExplicitlySet", false);
        setBooleanField(term176727, term176727.getClass(), "focusable", false);
        setIntField(term176727, term176727.getClass(), "isFocusTraversableOverridden", 0);
        setField(term176727, term176727.getClass(), "focusTraversalKeys", null);
        setBooleanField(term176727, term176727.getClass(), "focusTraversalKeysEnabled", false);
        setField(term176727, term176727.getClass(), "acc", null);
        setField(term176727, term176727.getClass(), "minSize", null);
        setBooleanField(term176727, term176727.getClass(), "minSizeSet", false);
        setField(term176727, term176727.getClass(), "prefSize", null);
        setBooleanField(term176727, term176727.getClass(), "prefSizeSet", false);
        setField(term176727, term176727.getClass(), "maxSize", null);
        setBooleanField(term176727, term176727.getClass(), "maxSizeSet", false);
        setField(term176727, term176727.getClass(), "componentOrientation", null);
        setBooleanField(term176727, term176727.getClass(), "newEventsOnly", false);
        setField(term176727, term176727.getClass(), "componentListener", null);
        setField(term176727, term176727.getClass(), "focusListener", null);
        setField(term176727, term176727.getClass(), "hierarchyListener", null);
        setField(term176727, term176727.getClass(), "hierarchyBoundsListener", null);
        setField(term176727, term176727.getClass(), "keyListener", null);
        setField(term176727, term176727.getClass(), "mouseListener", null);
        setField(term176727, term176727.getClass(), "mouseMotionListener", null);
        setField(term176727, term176727.getClass(), "mouseWheelListener", null);
        setField(term176727, term176727.getClass(), "inputMethodListener", null);
        setLongField(term176727, term176727.getClass(), "eventMask", 0L);
        setField(term176727, term176727.getClass(), "changeSupport", null);
        setField(term176727, term176727.getClass(), "objectLock", null);
        setBooleanField(term176727, term176727.getClass(), "isPacked", false);
        setIntField(term176727, term176727.getClass(), "boundsOp", 0);
        setField(term176727, term176727.getClass(), "compoundShape", null);
        setField(term176727, term176727.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term176727, term176727.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term176727, term176727.getClass(), "backgroundEraseDisabled", false);
        setField(term176727, term176727.getClass(), "eventCache", null);
        setBooleanField(term176727, term176727.getClass(), "coalescingEnabled", false);
        setBooleanField(term176727, term176727.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term176727, term176727.getClass(), "componentSerializedDataVersion", 0);
        setField(term176727, term176727.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term176727, args);
    }

};


