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

public class AmbientLightView_updateConnectBtn_18238727518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188802;

    public AmbientLightView_updateConnectBtn_18238727518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188802 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term188802, term188802.getClass(), "hostnameField", null);
        setField(term188802, term188802.getClass(), "usernameField", null);
        setField(term188802, term188802.getClass(), "connectBtn", null);
        setField(term188802, term188802.getClass(), "infoText", null);
        setField(term188802, term188802.getClass(), "listOfDevices", null);
        setField(term188802, term188802.getClass(), "centerLightSelection", null);
        setField(term188802, term188802.getClass(), "leftLightSelection", null);
        setField(term188802, term188802.getClass(), "rightLightSelection", null);
        setField(term188802, term188802.getClass(), "effectSelection", null);
        setField(term188802, term188802.getClass(), "ambientLightsBox", null);
        setField(term188802, term188802.getClass(), "lightsSlider", null);
        setField(term188802, term188802.getClass(), "bridge", null);
        setBooleanField(term188802, term188802.getClass(), "lightListUpdated", false);
        setBooleanField(term188802, term188802.getClass(), "justScanned", false);
        setBooleanField(term188802, term188802.getClass(), "isAlignmentXSet", false);
        setFloatField(term188802, term188802.getClass(), "alignmentX", 0.0F);
        setBooleanField(term188802, term188802.getClass(), "isAlignmentYSet", false);
        setFloatField(term188802, term188802.getClass(), "alignmentY", 0.0F);
        setField(term188802, term188802.getClass(), "ui", null);
        setField(term188802, term188802.getClass(), "listenerList", null);
        setField(term188802, term188802.getClass(), "clientProperties", null);
        setField(term188802, term188802.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term188802, term188802.getClass(), "autoscrolls", false);
        setField(term188802, term188802.getClass(), "border", null);
        setIntField(term188802, term188802.getClass(), "flags", 0);
        setField(term188802, term188802.getClass(), "inputVerifier", null);
        setBooleanField(term188802, term188802.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term188802, term188802.getClass(), "paintingChild", null);
        setField(term188802, term188802.getClass(), "popupMenu", null);
        setField(term188802, term188802.getClass(), "revalidateRunnableScheduled", null);
        setField(term188802, term188802.getClass(), "focusInputMap", null);
        setField(term188802, term188802.getClass(), "ancestorInputMap", null);
        setField(term188802, term188802.getClass(), "windowInputMap", null);
        setField(term188802, term188802.getClass(), "actionMap", null);
        setField(term188802, term188802.getClass(), "aaHint", null);
        setField(term188802, term188802.getClass(), "lcdRenderingHint", null);
        setField(term188802, term188802.getClass(), "component", null);
        setField(term188802, term188802.getClass(), "layoutMgr", null);
        setField(term188802, term188802.getClass(), "dispatcher", null);
        setField(term188802, term188802.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term188802, term188802.getClass(), "focusCycleRoot", false);
        setBooleanField(term188802, term188802.getClass(), "focusTraversalPolicyProvider", false);
        setField(term188802, term188802.getClass(), "printingThreads", null);
        setBooleanField(term188802, term188802.getClass(), "printing", false);
        setField(term188802, term188802.getClass(), "containerListener", null);
        setIntField(term188802, term188802.getClass(), "listeningChildren", 0);
        setIntField(term188802, term188802.getClass(), "listeningBoundsChildren", 0);
        setIntField(term188802, term188802.getClass(), "descendantsCount", 0);
        setField(term188802, term188802.getClass(), "preserveBackgroundColor", null);
        setIntField(term188802, term188802.getClass(), "numOfHWComponents", 0);
        setIntField(term188802, term188802.getClass(), "numOfLWComponents", 0);
        setField(term188802, term188802.getClass(), "modalComp", null);
        setField(term188802, term188802.getClass(), "modalAppContext", null);
        setIntField(term188802, term188802.getClass(), "containerSerializedDataVersion", 0);
        setField(term188802, term188802.getClass(), "peer", null);
        setField(term188802, term188802.getClass(), "parent", null);
        setField(term188802, term188802.getClass(), "appContext", null);
        setIntField(term188802, term188802.getClass(), "x", 0);
        setIntField(term188802, term188802.getClass(), "y", 0);
        setIntField(term188802, term188802.getClass(), "width", 0);
        setIntField(term188802, term188802.getClass(), "height", 0);
        setField(term188802, term188802.getClass(), "foreground", null);
        setField(term188802, term188802.getClass(), "background", null);
        setField(term188802, term188802.getClass(), "font", null);
        setField(term188802, term188802.getClass(), "peerFont", null);
        setField(term188802, term188802.getClass(), "cursor", null);
        setField(term188802, term188802.getClass(), "locale", null);
        setField(term188802, term188802.getClass(), "graphicsConfig", null);
        setField(term188802, term188802.getClass(), "bufferStrategy", null);
        setBooleanField(term188802, term188802.getClass(), "ignoreRepaint", false);
        setBooleanField(term188802, term188802.getClass(), "visible", false);
        setBooleanField(term188802, term188802.getClass(), "enabled", false);
        setBooleanField(term188802, term188802.getClass(), "valid", false);
        setField(term188802, term188802.getClass(), "dropTarget", null);
        setField(term188802, term188802.getClass(), "popups", null);
        setField(term188802, term188802.getClass(), "name", null);
        setBooleanField(term188802, term188802.getClass(), "nameExplicitlySet", false);
        setBooleanField(term188802, term188802.getClass(), "focusable", false);
        setIntField(term188802, term188802.getClass(), "isFocusTraversableOverridden", 0);
        setField(term188802, term188802.getClass(), "focusTraversalKeys", null);
        setBooleanField(term188802, term188802.getClass(), "focusTraversalKeysEnabled", false);
        setField(term188802, term188802.getClass(), "acc", null);
        setField(term188802, term188802.getClass(), "minSize", null);
        setBooleanField(term188802, term188802.getClass(), "minSizeSet", false);
        setField(term188802, term188802.getClass(), "prefSize", null);
        setBooleanField(term188802, term188802.getClass(), "prefSizeSet", false);
        setField(term188802, term188802.getClass(), "maxSize", null);
        setBooleanField(term188802, term188802.getClass(), "maxSizeSet", false);
        setField(term188802, term188802.getClass(), "componentOrientation", null);
        setBooleanField(term188802, term188802.getClass(), "newEventsOnly", false);
        setField(term188802, term188802.getClass(), "componentListener", null);
        setField(term188802, term188802.getClass(), "focusListener", null);
        setField(term188802, term188802.getClass(), "hierarchyListener", null);
        setField(term188802, term188802.getClass(), "hierarchyBoundsListener", null);
        setField(term188802, term188802.getClass(), "keyListener", null);
        setField(term188802, term188802.getClass(), "mouseListener", null);
        setField(term188802, term188802.getClass(), "mouseMotionListener", null);
        setField(term188802, term188802.getClass(), "mouseWheelListener", null);
        setField(term188802, term188802.getClass(), "inputMethodListener", null);
        setLongField(term188802, term188802.getClass(), "eventMask", 0L);
        setField(term188802, term188802.getClass(), "changeSupport", null);
        setField(term188802, term188802.getClass(), "objectLock", null);
        setBooleanField(term188802, term188802.getClass(), "isPacked", false);
        setIntField(term188802, term188802.getClass(), "boundsOp", 0);
        setField(term188802, term188802.getClass(), "compoundShape", null);
        setField(term188802, term188802.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term188802, term188802.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term188802, term188802.getClass(), "backgroundEraseDisabled", false);
        setField(term188802, term188802.getClass(), "eventCache", null);
        setBooleanField(term188802, term188802.getClass(), "coalescingEnabled", false);
        setBooleanField(term188802, term188802.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term188802, term188802.getClass(), "componentSerializedDataVersion", 0);
        setField(term188802, term188802.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateConnectBtn", argTypes, term188802, args);
    }

};


