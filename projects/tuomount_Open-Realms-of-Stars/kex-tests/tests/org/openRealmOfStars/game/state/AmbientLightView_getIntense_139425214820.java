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

public class AmbientLightView_getIntense_139425214820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213153;

    public AmbientLightView_getIntense_139425214820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213153 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term213153, term213153.getClass(), "hostnameField", null);
        setField(term213153, term213153.getClass(), "usernameField", null);
        setField(term213153, term213153.getClass(), "connectBtn", null);
        setField(term213153, term213153.getClass(), "infoText", null);
        setField(term213153, term213153.getClass(), "listOfDevices", null);
        setField(term213153, term213153.getClass(), "centerLightSelection", null);
        setField(term213153, term213153.getClass(), "leftLightSelection", null);
        setField(term213153, term213153.getClass(), "rightLightSelection", null);
        setField(term213153, term213153.getClass(), "effectSelection", null);
        setField(term213153, term213153.getClass(), "ambientLightsBox", null);
        setField(term213153, term213153.getClass(), "lightsSlider", null);
        setField(term213153, term213153.getClass(), "bridge", null);
        setBooleanField(term213153, term213153.getClass(), "lightListUpdated", false);
        setBooleanField(term213153, term213153.getClass(), "justScanned", false);
        setBooleanField(term213153, term213153.getClass(), "isAlignmentXSet", false);
        setFloatField(term213153, term213153.getClass(), "alignmentX", 0.0F);
        setBooleanField(term213153, term213153.getClass(), "isAlignmentYSet", false);
        setFloatField(term213153, term213153.getClass(), "alignmentY", 0.0F);
        setField(term213153, term213153.getClass(), "ui", null);
        setField(term213153, term213153.getClass(), "listenerList", null);
        setField(term213153, term213153.getClass(), "clientProperties", null);
        setField(term213153, term213153.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term213153, term213153.getClass(), "autoscrolls", false);
        setField(term213153, term213153.getClass(), "border", null);
        setIntField(term213153, term213153.getClass(), "flags", 0);
        setField(term213153, term213153.getClass(), "inputVerifier", null);
        setBooleanField(term213153, term213153.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term213153, term213153.getClass(), "paintingChild", null);
        setField(term213153, term213153.getClass(), "popupMenu", null);
        setField(term213153, term213153.getClass(), "revalidateRunnableScheduled", null);
        setField(term213153, term213153.getClass(), "focusInputMap", null);
        setField(term213153, term213153.getClass(), "ancestorInputMap", null);
        setField(term213153, term213153.getClass(), "windowInputMap", null);
        setField(term213153, term213153.getClass(), "actionMap", null);
        setField(term213153, term213153.getClass(), "aaHint", null);
        setField(term213153, term213153.getClass(), "lcdRenderingHint", null);
        setField(term213153, term213153.getClass(), "component", null);
        setField(term213153, term213153.getClass(), "layoutMgr", null);
        setField(term213153, term213153.getClass(), "dispatcher", null);
        setField(term213153, term213153.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term213153, term213153.getClass(), "focusCycleRoot", false);
        setBooleanField(term213153, term213153.getClass(), "focusTraversalPolicyProvider", false);
        setField(term213153, term213153.getClass(), "printingThreads", null);
        setBooleanField(term213153, term213153.getClass(), "printing", false);
        setField(term213153, term213153.getClass(), "containerListener", null);
        setIntField(term213153, term213153.getClass(), "listeningChildren", 0);
        setIntField(term213153, term213153.getClass(), "listeningBoundsChildren", 0);
        setIntField(term213153, term213153.getClass(), "descendantsCount", 0);
        setField(term213153, term213153.getClass(), "preserveBackgroundColor", null);
        setIntField(term213153, term213153.getClass(), "numOfHWComponents", 0);
        setIntField(term213153, term213153.getClass(), "numOfLWComponents", 0);
        setField(term213153, term213153.getClass(), "modalComp", null);
        setField(term213153, term213153.getClass(), "modalAppContext", null);
        setIntField(term213153, term213153.getClass(), "containerSerializedDataVersion", 0);
        setField(term213153, term213153.getClass(), "peer", null);
        setField(term213153, term213153.getClass(), "parent", null);
        setField(term213153, term213153.getClass(), "appContext", null);
        setIntField(term213153, term213153.getClass(), "x", 0);
        setIntField(term213153, term213153.getClass(), "y", 0);
        setIntField(term213153, term213153.getClass(), "width", 0);
        setIntField(term213153, term213153.getClass(), "height", 0);
        setField(term213153, term213153.getClass(), "foreground", null);
        setField(term213153, term213153.getClass(), "background", null);
        setField(term213153, term213153.getClass(), "font", null);
        setField(term213153, term213153.getClass(), "peerFont", null);
        setField(term213153, term213153.getClass(), "cursor", null);
        setField(term213153, term213153.getClass(), "locale", null);
        setField(term213153, term213153.getClass(), "graphicsConfig", null);
        setField(term213153, term213153.getClass(), "bufferStrategy", null);
        setBooleanField(term213153, term213153.getClass(), "ignoreRepaint", false);
        setBooleanField(term213153, term213153.getClass(), "visible", false);
        setBooleanField(term213153, term213153.getClass(), "enabled", false);
        setBooleanField(term213153, term213153.getClass(), "valid", false);
        setField(term213153, term213153.getClass(), "dropTarget", null);
        setField(term213153, term213153.getClass(), "popups", null);
        setField(term213153, term213153.getClass(), "name", null);
        setBooleanField(term213153, term213153.getClass(), "nameExplicitlySet", false);
        setBooleanField(term213153, term213153.getClass(), "focusable", false);
        setIntField(term213153, term213153.getClass(), "isFocusTraversableOverridden", 0);
        setField(term213153, term213153.getClass(), "focusTraversalKeys", null);
        setBooleanField(term213153, term213153.getClass(), "focusTraversalKeysEnabled", false);
        setField(term213153, term213153.getClass(), "acc", null);
        setField(term213153, term213153.getClass(), "minSize", null);
        setBooleanField(term213153, term213153.getClass(), "minSizeSet", false);
        setField(term213153, term213153.getClass(), "prefSize", null);
        setBooleanField(term213153, term213153.getClass(), "prefSizeSet", false);
        setField(term213153, term213153.getClass(), "maxSize", null);
        setBooleanField(term213153, term213153.getClass(), "maxSizeSet", false);
        setField(term213153, term213153.getClass(), "componentOrientation", null);
        setBooleanField(term213153, term213153.getClass(), "newEventsOnly", false);
        setField(term213153, term213153.getClass(), "componentListener", null);
        setField(term213153, term213153.getClass(), "focusListener", null);
        setField(term213153, term213153.getClass(), "hierarchyListener", null);
        setField(term213153, term213153.getClass(), "hierarchyBoundsListener", null);
        setField(term213153, term213153.getClass(), "keyListener", null);
        setField(term213153, term213153.getClass(), "mouseListener", null);
        setField(term213153, term213153.getClass(), "mouseMotionListener", null);
        setField(term213153, term213153.getClass(), "mouseWheelListener", null);
        setField(term213153, term213153.getClass(), "inputMethodListener", null);
        setLongField(term213153, term213153.getClass(), "eventMask", 0L);
        setField(term213153, term213153.getClass(), "changeSupport", null);
        setField(term213153, term213153.getClass(), "objectLock", null);
        setBooleanField(term213153, term213153.getClass(), "isPacked", false);
        setIntField(term213153, term213153.getClass(), "boundsOp", 0);
        setField(term213153, term213153.getClass(), "compoundShape", null);
        setField(term213153, term213153.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term213153, term213153.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term213153, term213153.getClass(), "backgroundEraseDisabled", false);
        setField(term213153, term213153.getClass(), "eventCache", null);
        setBooleanField(term213153, term213153.getClass(), "coalescingEnabled", false);
        setBooleanField(term213153, term213153.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term213153, term213153.getClass(), "componentSerializedDataVersion", 0);
        setField(term213153, term213153.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntense", argTypes, term213153, args);
    }

};


