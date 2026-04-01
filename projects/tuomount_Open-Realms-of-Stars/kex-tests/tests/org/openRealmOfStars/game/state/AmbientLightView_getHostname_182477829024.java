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

public class AmbientLightView_getHostname_182477829024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221318;

    public AmbientLightView_getHostname_182477829024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221318 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term221318, term221318.getClass(), "hostnameField", null);
        setField(term221318, term221318.getClass(), "usernameField", null);
        setField(term221318, term221318.getClass(), "connectBtn", null);
        setField(term221318, term221318.getClass(), "infoText", null);
        setField(term221318, term221318.getClass(), "listOfDevices", null);
        setField(term221318, term221318.getClass(), "centerLightSelection", null);
        setField(term221318, term221318.getClass(), "leftLightSelection", null);
        setField(term221318, term221318.getClass(), "rightLightSelection", null);
        setField(term221318, term221318.getClass(), "effectSelection", null);
        setField(term221318, term221318.getClass(), "ambientLightsBox", null);
        setField(term221318, term221318.getClass(), "lightsSlider", null);
        setField(term221318, term221318.getClass(), "bridge", null);
        setBooleanField(term221318, term221318.getClass(), "lightListUpdated", false);
        setBooleanField(term221318, term221318.getClass(), "justScanned", false);
        setBooleanField(term221318, term221318.getClass(), "isAlignmentXSet", false);
        setFloatField(term221318, term221318.getClass(), "alignmentX", 0.0F);
        setBooleanField(term221318, term221318.getClass(), "isAlignmentYSet", false);
        setFloatField(term221318, term221318.getClass(), "alignmentY", 0.0F);
        setField(term221318, term221318.getClass(), "ui", null);
        setField(term221318, term221318.getClass(), "listenerList", null);
        setField(term221318, term221318.getClass(), "clientProperties", null);
        setField(term221318, term221318.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term221318, term221318.getClass(), "autoscrolls", false);
        setField(term221318, term221318.getClass(), "border", null);
        setIntField(term221318, term221318.getClass(), "flags", 0);
        setField(term221318, term221318.getClass(), "inputVerifier", null);
        setBooleanField(term221318, term221318.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term221318, term221318.getClass(), "paintingChild", null);
        setField(term221318, term221318.getClass(), "popupMenu", null);
        setField(term221318, term221318.getClass(), "revalidateRunnableScheduled", null);
        setField(term221318, term221318.getClass(), "focusInputMap", null);
        setField(term221318, term221318.getClass(), "ancestorInputMap", null);
        setField(term221318, term221318.getClass(), "windowInputMap", null);
        setField(term221318, term221318.getClass(), "actionMap", null);
        setField(term221318, term221318.getClass(), "aaHint", null);
        setField(term221318, term221318.getClass(), "lcdRenderingHint", null);
        setField(term221318, term221318.getClass(), "component", null);
        setField(term221318, term221318.getClass(), "layoutMgr", null);
        setField(term221318, term221318.getClass(), "dispatcher", null);
        setField(term221318, term221318.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term221318, term221318.getClass(), "focusCycleRoot", false);
        setBooleanField(term221318, term221318.getClass(), "focusTraversalPolicyProvider", false);
        setField(term221318, term221318.getClass(), "printingThreads", null);
        setBooleanField(term221318, term221318.getClass(), "printing", false);
        setField(term221318, term221318.getClass(), "containerListener", null);
        setIntField(term221318, term221318.getClass(), "listeningChildren", 0);
        setIntField(term221318, term221318.getClass(), "listeningBoundsChildren", 0);
        setIntField(term221318, term221318.getClass(), "descendantsCount", 0);
        setField(term221318, term221318.getClass(), "preserveBackgroundColor", null);
        setIntField(term221318, term221318.getClass(), "numOfHWComponents", 0);
        setIntField(term221318, term221318.getClass(), "numOfLWComponents", 0);
        setField(term221318, term221318.getClass(), "modalComp", null);
        setField(term221318, term221318.getClass(), "modalAppContext", null);
        setIntField(term221318, term221318.getClass(), "containerSerializedDataVersion", 0);
        setField(term221318, term221318.getClass(), "peer", null);
        setField(term221318, term221318.getClass(), "parent", null);
        setField(term221318, term221318.getClass(), "appContext", null);
        setIntField(term221318, term221318.getClass(), "x", 0);
        setIntField(term221318, term221318.getClass(), "y", 0);
        setIntField(term221318, term221318.getClass(), "width", 0);
        setIntField(term221318, term221318.getClass(), "height", 0);
        setField(term221318, term221318.getClass(), "foreground", null);
        setField(term221318, term221318.getClass(), "background", null);
        setField(term221318, term221318.getClass(), "font", null);
        setField(term221318, term221318.getClass(), "peerFont", null);
        setField(term221318, term221318.getClass(), "cursor", null);
        setField(term221318, term221318.getClass(), "locale", null);
        setField(term221318, term221318.getClass(), "graphicsConfig", null);
        setField(term221318, term221318.getClass(), "bufferStrategy", null);
        setBooleanField(term221318, term221318.getClass(), "ignoreRepaint", false);
        setBooleanField(term221318, term221318.getClass(), "visible", false);
        setBooleanField(term221318, term221318.getClass(), "enabled", false);
        setBooleanField(term221318, term221318.getClass(), "valid", false);
        setField(term221318, term221318.getClass(), "dropTarget", null);
        setField(term221318, term221318.getClass(), "popups", null);
        setField(term221318, term221318.getClass(), "name", null);
        setBooleanField(term221318, term221318.getClass(), "nameExplicitlySet", false);
        setBooleanField(term221318, term221318.getClass(), "focusable", false);
        setIntField(term221318, term221318.getClass(), "isFocusTraversableOverridden", 0);
        setField(term221318, term221318.getClass(), "focusTraversalKeys", null);
        setBooleanField(term221318, term221318.getClass(), "focusTraversalKeysEnabled", false);
        setField(term221318, term221318.getClass(), "acc", null);
        setField(term221318, term221318.getClass(), "minSize", null);
        setBooleanField(term221318, term221318.getClass(), "minSizeSet", false);
        setField(term221318, term221318.getClass(), "prefSize", null);
        setBooleanField(term221318, term221318.getClass(), "prefSizeSet", false);
        setField(term221318, term221318.getClass(), "maxSize", null);
        setBooleanField(term221318, term221318.getClass(), "maxSizeSet", false);
        setField(term221318, term221318.getClass(), "componentOrientation", null);
        setBooleanField(term221318, term221318.getClass(), "newEventsOnly", false);
        setField(term221318, term221318.getClass(), "componentListener", null);
        setField(term221318, term221318.getClass(), "focusListener", null);
        setField(term221318, term221318.getClass(), "hierarchyListener", null);
        setField(term221318, term221318.getClass(), "hierarchyBoundsListener", null);
        setField(term221318, term221318.getClass(), "keyListener", null);
        setField(term221318, term221318.getClass(), "mouseListener", null);
        setField(term221318, term221318.getClass(), "mouseMotionListener", null);
        setField(term221318, term221318.getClass(), "mouseWheelListener", null);
        setField(term221318, term221318.getClass(), "inputMethodListener", null);
        setLongField(term221318, term221318.getClass(), "eventMask", 0L);
        setField(term221318, term221318.getClass(), "changeSupport", null);
        setField(term221318, term221318.getClass(), "objectLock", null);
        setBooleanField(term221318, term221318.getClass(), "isPacked", false);
        setIntField(term221318, term221318.getClass(), "boundsOp", 0);
        setField(term221318, term221318.getClass(), "compoundShape", null);
        setField(term221318, term221318.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term221318, term221318.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term221318, term221318.getClass(), "backgroundEraseDisabled", false);
        setField(term221318, term221318.getClass(), "eventCache", null);
        setBooleanField(term221318, term221318.getClass(), "coalescingEnabled", false);
        setBooleanField(term221318, term221318.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term221318, term221318.getClass(), "componentSerializedDataVersion", 0);
        setField(term221318, term221318.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHostname", argTypes, term221318, args);
    }

};


