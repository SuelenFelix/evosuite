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

public class AmbientLightView_isLightsEnabled_190384531822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217192;

    public AmbientLightView_isLightsEnabled_190384531822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217192 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term217192, term217192.getClass(), "hostnameField", null);
        setField(term217192, term217192.getClass(), "usernameField", null);
        setField(term217192, term217192.getClass(), "connectBtn", null);
        setField(term217192, term217192.getClass(), "infoText", null);
        setField(term217192, term217192.getClass(), "listOfDevices", null);
        setField(term217192, term217192.getClass(), "centerLightSelection", null);
        setField(term217192, term217192.getClass(), "leftLightSelection", null);
        setField(term217192, term217192.getClass(), "rightLightSelection", null);
        setField(term217192, term217192.getClass(), "effectSelection", null);
        setField(term217192, term217192.getClass(), "ambientLightsBox", null);
        setField(term217192, term217192.getClass(), "lightsSlider", null);
        setField(term217192, term217192.getClass(), "bridge", null);
        setBooleanField(term217192, term217192.getClass(), "lightListUpdated", false);
        setBooleanField(term217192, term217192.getClass(), "justScanned", false);
        setBooleanField(term217192, term217192.getClass(), "isAlignmentXSet", false);
        setFloatField(term217192, term217192.getClass(), "alignmentX", 0.0F);
        setBooleanField(term217192, term217192.getClass(), "isAlignmentYSet", false);
        setFloatField(term217192, term217192.getClass(), "alignmentY", 0.0F);
        setField(term217192, term217192.getClass(), "ui", null);
        setField(term217192, term217192.getClass(), "listenerList", null);
        setField(term217192, term217192.getClass(), "clientProperties", null);
        setField(term217192, term217192.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term217192, term217192.getClass(), "autoscrolls", false);
        setField(term217192, term217192.getClass(), "border", null);
        setIntField(term217192, term217192.getClass(), "flags", 0);
        setField(term217192, term217192.getClass(), "inputVerifier", null);
        setBooleanField(term217192, term217192.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term217192, term217192.getClass(), "paintingChild", null);
        setField(term217192, term217192.getClass(), "popupMenu", null);
        setField(term217192, term217192.getClass(), "revalidateRunnableScheduled", null);
        setField(term217192, term217192.getClass(), "focusInputMap", null);
        setField(term217192, term217192.getClass(), "ancestorInputMap", null);
        setField(term217192, term217192.getClass(), "windowInputMap", null);
        setField(term217192, term217192.getClass(), "actionMap", null);
        setField(term217192, term217192.getClass(), "aaHint", null);
        setField(term217192, term217192.getClass(), "lcdRenderingHint", null);
        setField(term217192, term217192.getClass(), "component", null);
        setField(term217192, term217192.getClass(), "layoutMgr", null);
        setField(term217192, term217192.getClass(), "dispatcher", null);
        setField(term217192, term217192.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term217192, term217192.getClass(), "focusCycleRoot", false);
        setBooleanField(term217192, term217192.getClass(), "focusTraversalPolicyProvider", false);
        setField(term217192, term217192.getClass(), "printingThreads", null);
        setBooleanField(term217192, term217192.getClass(), "printing", false);
        setField(term217192, term217192.getClass(), "containerListener", null);
        setIntField(term217192, term217192.getClass(), "listeningChildren", 0);
        setIntField(term217192, term217192.getClass(), "listeningBoundsChildren", 0);
        setIntField(term217192, term217192.getClass(), "descendantsCount", 0);
        setField(term217192, term217192.getClass(), "preserveBackgroundColor", null);
        setIntField(term217192, term217192.getClass(), "numOfHWComponents", 0);
        setIntField(term217192, term217192.getClass(), "numOfLWComponents", 0);
        setField(term217192, term217192.getClass(), "modalComp", null);
        setField(term217192, term217192.getClass(), "modalAppContext", null);
        setIntField(term217192, term217192.getClass(), "containerSerializedDataVersion", 0);
        setField(term217192, term217192.getClass(), "peer", null);
        setField(term217192, term217192.getClass(), "parent", null);
        setField(term217192, term217192.getClass(), "appContext", null);
        setIntField(term217192, term217192.getClass(), "x", 0);
        setIntField(term217192, term217192.getClass(), "y", 0);
        setIntField(term217192, term217192.getClass(), "width", 0);
        setIntField(term217192, term217192.getClass(), "height", 0);
        setField(term217192, term217192.getClass(), "foreground", null);
        setField(term217192, term217192.getClass(), "background", null);
        setField(term217192, term217192.getClass(), "font", null);
        setField(term217192, term217192.getClass(), "peerFont", null);
        setField(term217192, term217192.getClass(), "cursor", null);
        setField(term217192, term217192.getClass(), "locale", null);
        setField(term217192, term217192.getClass(), "graphicsConfig", null);
        setField(term217192, term217192.getClass(), "bufferStrategy", null);
        setBooleanField(term217192, term217192.getClass(), "ignoreRepaint", false);
        setBooleanField(term217192, term217192.getClass(), "visible", false);
        setBooleanField(term217192, term217192.getClass(), "enabled", false);
        setBooleanField(term217192, term217192.getClass(), "valid", false);
        setField(term217192, term217192.getClass(), "dropTarget", null);
        setField(term217192, term217192.getClass(), "popups", null);
        setField(term217192, term217192.getClass(), "name", null);
        setBooleanField(term217192, term217192.getClass(), "nameExplicitlySet", false);
        setBooleanField(term217192, term217192.getClass(), "focusable", false);
        setIntField(term217192, term217192.getClass(), "isFocusTraversableOverridden", 0);
        setField(term217192, term217192.getClass(), "focusTraversalKeys", null);
        setBooleanField(term217192, term217192.getClass(), "focusTraversalKeysEnabled", false);
        setField(term217192, term217192.getClass(), "acc", null);
        setField(term217192, term217192.getClass(), "minSize", null);
        setBooleanField(term217192, term217192.getClass(), "minSizeSet", false);
        setField(term217192, term217192.getClass(), "prefSize", null);
        setBooleanField(term217192, term217192.getClass(), "prefSizeSet", false);
        setField(term217192, term217192.getClass(), "maxSize", null);
        setBooleanField(term217192, term217192.getClass(), "maxSizeSet", false);
        setField(term217192, term217192.getClass(), "componentOrientation", null);
        setBooleanField(term217192, term217192.getClass(), "newEventsOnly", false);
        setField(term217192, term217192.getClass(), "componentListener", null);
        setField(term217192, term217192.getClass(), "focusListener", null);
        setField(term217192, term217192.getClass(), "hierarchyListener", null);
        setField(term217192, term217192.getClass(), "hierarchyBoundsListener", null);
        setField(term217192, term217192.getClass(), "keyListener", null);
        setField(term217192, term217192.getClass(), "mouseListener", null);
        setField(term217192, term217192.getClass(), "mouseMotionListener", null);
        setField(term217192, term217192.getClass(), "mouseWheelListener", null);
        setField(term217192, term217192.getClass(), "inputMethodListener", null);
        setLongField(term217192, term217192.getClass(), "eventMask", 0L);
        setField(term217192, term217192.getClass(), "changeSupport", null);
        setField(term217192, term217192.getClass(), "objectLock", null);
        setBooleanField(term217192, term217192.getClass(), "isPacked", false);
        setIntField(term217192, term217192.getClass(), "boundsOp", 0);
        setField(term217192, term217192.getClass(), "compoundShape", null);
        setField(term217192, term217192.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term217192, term217192.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term217192, term217192.getClass(), "backgroundEraseDisabled", false);
        setField(term217192, term217192.getClass(), "eventCache", null);
        setBooleanField(term217192, term217192.getClass(), "coalescingEnabled", false);
        setBooleanField(term217192, term217192.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term217192, term217192.getClass(), "componentSerializedDataVersion", 0);
        setField(term217192, term217192.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLightsEnabled", argTypes, term217192, args);
    }

};


