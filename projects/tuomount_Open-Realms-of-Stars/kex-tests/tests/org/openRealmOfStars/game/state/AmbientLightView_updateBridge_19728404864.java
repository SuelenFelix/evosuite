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

public class AmbientLightView_updateBridge_19728404864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180664;

    public AmbientLightView_updateBridge_19728404864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180664 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term180664, term180664.getClass(), "hostnameField", null);
        setField(term180664, term180664.getClass(), "usernameField", null);
        setField(term180664, term180664.getClass(), "connectBtn", null);
        setField(term180664, term180664.getClass(), "infoText", null);
        setField(term180664, term180664.getClass(), "listOfDevices", null);
        setField(term180664, term180664.getClass(), "centerLightSelection", null);
        setField(term180664, term180664.getClass(), "leftLightSelection", null);
        setField(term180664, term180664.getClass(), "rightLightSelection", null);
        setField(term180664, term180664.getClass(), "effectSelection", null);
        setField(term180664, term180664.getClass(), "ambientLightsBox", null);
        setField(term180664, term180664.getClass(), "lightsSlider", null);
        setField(term180664, term180664.getClass(), "bridge", null);
        setBooleanField(term180664, term180664.getClass(), "lightListUpdated", false);
        setBooleanField(term180664, term180664.getClass(), "justScanned", false);
        setBooleanField(term180664, term180664.getClass(), "isAlignmentXSet", false);
        setFloatField(term180664, term180664.getClass(), "alignmentX", 0.0F);
        setBooleanField(term180664, term180664.getClass(), "isAlignmentYSet", false);
        setFloatField(term180664, term180664.getClass(), "alignmentY", 0.0F);
        setField(term180664, term180664.getClass(), "ui", null);
        setField(term180664, term180664.getClass(), "listenerList", null);
        setField(term180664, term180664.getClass(), "clientProperties", null);
        setField(term180664, term180664.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term180664, term180664.getClass(), "autoscrolls", false);
        setField(term180664, term180664.getClass(), "border", null);
        setIntField(term180664, term180664.getClass(), "flags", 0);
        setField(term180664, term180664.getClass(), "inputVerifier", null);
        setBooleanField(term180664, term180664.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term180664, term180664.getClass(), "paintingChild", null);
        setField(term180664, term180664.getClass(), "popupMenu", null);
        setField(term180664, term180664.getClass(), "revalidateRunnableScheduled", null);
        setField(term180664, term180664.getClass(), "focusInputMap", null);
        setField(term180664, term180664.getClass(), "ancestorInputMap", null);
        setField(term180664, term180664.getClass(), "windowInputMap", null);
        setField(term180664, term180664.getClass(), "actionMap", null);
        setField(term180664, term180664.getClass(), "aaHint", null);
        setField(term180664, term180664.getClass(), "lcdRenderingHint", null);
        setField(term180664, term180664.getClass(), "component", null);
        setField(term180664, term180664.getClass(), "layoutMgr", null);
        setField(term180664, term180664.getClass(), "dispatcher", null);
        setField(term180664, term180664.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term180664, term180664.getClass(), "focusCycleRoot", false);
        setBooleanField(term180664, term180664.getClass(), "focusTraversalPolicyProvider", false);
        setField(term180664, term180664.getClass(), "printingThreads", null);
        setBooleanField(term180664, term180664.getClass(), "printing", false);
        setField(term180664, term180664.getClass(), "containerListener", null);
        setIntField(term180664, term180664.getClass(), "listeningChildren", 0);
        setIntField(term180664, term180664.getClass(), "listeningBoundsChildren", 0);
        setIntField(term180664, term180664.getClass(), "descendantsCount", 0);
        setField(term180664, term180664.getClass(), "preserveBackgroundColor", null);
        setIntField(term180664, term180664.getClass(), "numOfHWComponents", 0);
        setIntField(term180664, term180664.getClass(), "numOfLWComponents", 0);
        setField(term180664, term180664.getClass(), "modalComp", null);
        setField(term180664, term180664.getClass(), "modalAppContext", null);
        setIntField(term180664, term180664.getClass(), "containerSerializedDataVersion", 0);
        setField(term180664, term180664.getClass(), "peer", null);
        setField(term180664, term180664.getClass(), "parent", null);
        setField(term180664, term180664.getClass(), "appContext", null);
        setIntField(term180664, term180664.getClass(), "x", 0);
        setIntField(term180664, term180664.getClass(), "y", 0);
        setIntField(term180664, term180664.getClass(), "width", 0);
        setIntField(term180664, term180664.getClass(), "height", 0);
        setField(term180664, term180664.getClass(), "foreground", null);
        setField(term180664, term180664.getClass(), "background", null);
        setField(term180664, term180664.getClass(), "font", null);
        setField(term180664, term180664.getClass(), "peerFont", null);
        setField(term180664, term180664.getClass(), "cursor", null);
        setField(term180664, term180664.getClass(), "locale", null);
        setField(term180664, term180664.getClass(), "graphicsConfig", null);
        setField(term180664, term180664.getClass(), "bufferStrategy", null);
        setBooleanField(term180664, term180664.getClass(), "ignoreRepaint", false);
        setBooleanField(term180664, term180664.getClass(), "visible", false);
        setBooleanField(term180664, term180664.getClass(), "enabled", false);
        setBooleanField(term180664, term180664.getClass(), "valid", false);
        setField(term180664, term180664.getClass(), "dropTarget", null);
        setField(term180664, term180664.getClass(), "popups", null);
        setField(term180664, term180664.getClass(), "name", null);
        setBooleanField(term180664, term180664.getClass(), "nameExplicitlySet", false);
        setBooleanField(term180664, term180664.getClass(), "focusable", false);
        setIntField(term180664, term180664.getClass(), "isFocusTraversableOverridden", 0);
        setField(term180664, term180664.getClass(), "focusTraversalKeys", null);
        setBooleanField(term180664, term180664.getClass(), "focusTraversalKeysEnabled", false);
        setField(term180664, term180664.getClass(), "acc", null);
        setField(term180664, term180664.getClass(), "minSize", null);
        setBooleanField(term180664, term180664.getClass(), "minSizeSet", false);
        setField(term180664, term180664.getClass(), "prefSize", null);
        setBooleanField(term180664, term180664.getClass(), "prefSizeSet", false);
        setField(term180664, term180664.getClass(), "maxSize", null);
        setBooleanField(term180664, term180664.getClass(), "maxSizeSet", false);
        setField(term180664, term180664.getClass(), "componentOrientation", null);
        setBooleanField(term180664, term180664.getClass(), "newEventsOnly", false);
        setField(term180664, term180664.getClass(), "componentListener", null);
        setField(term180664, term180664.getClass(), "focusListener", null);
        setField(term180664, term180664.getClass(), "hierarchyListener", null);
        setField(term180664, term180664.getClass(), "hierarchyBoundsListener", null);
        setField(term180664, term180664.getClass(), "keyListener", null);
        setField(term180664, term180664.getClass(), "mouseListener", null);
        setField(term180664, term180664.getClass(), "mouseMotionListener", null);
        setField(term180664, term180664.getClass(), "mouseWheelListener", null);
        setField(term180664, term180664.getClass(), "inputMethodListener", null);
        setLongField(term180664, term180664.getClass(), "eventMask", 0L);
        setField(term180664, term180664.getClass(), "changeSupport", null);
        setField(term180664, term180664.getClass(), "objectLock", null);
        setBooleanField(term180664, term180664.getClass(), "isPacked", false);
        setIntField(term180664, term180664.getClass(), "boundsOp", 0);
        setField(term180664, term180664.getClass(), "compoundShape", null);
        setField(term180664, term180664.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term180664, term180664.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term180664, term180664.getClass(), "backgroundEraseDisabled", false);
        setField(term180664, term180664.getClass(), "eventCache", null);
        setBooleanField(term180664, term180664.getClass(), "coalescingEnabled", false);
        setBooleanField(term180664, term180664.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term180664, term180664.getClass(), "componentSerializedDataVersion", 0);
        setField(term180664, term180664.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateBridge", argTypes, term180664, args);
    }

};


