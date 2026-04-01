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

public class AmbientLightView_updateLightsFromBridge_956309956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184868;

    public AmbientLightView_updateLightsFromBridge_956309956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184868 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term184868, term184868.getClass(), "hostnameField", null);
        setField(term184868, term184868.getClass(), "usernameField", null);
        setField(term184868, term184868.getClass(), "connectBtn", null);
        setField(term184868, term184868.getClass(), "infoText", null);
        setField(term184868, term184868.getClass(), "listOfDevices", null);
        setField(term184868, term184868.getClass(), "centerLightSelection", null);
        setField(term184868, term184868.getClass(), "leftLightSelection", null);
        setField(term184868, term184868.getClass(), "rightLightSelection", null);
        setField(term184868, term184868.getClass(), "effectSelection", null);
        setField(term184868, term184868.getClass(), "ambientLightsBox", null);
        setField(term184868, term184868.getClass(), "lightsSlider", null);
        setField(term184868, term184868.getClass(), "bridge", null);
        setBooleanField(term184868, term184868.getClass(), "lightListUpdated", false);
        setBooleanField(term184868, term184868.getClass(), "justScanned", false);
        setBooleanField(term184868, term184868.getClass(), "isAlignmentXSet", false);
        setFloatField(term184868, term184868.getClass(), "alignmentX", 0.0F);
        setBooleanField(term184868, term184868.getClass(), "isAlignmentYSet", false);
        setFloatField(term184868, term184868.getClass(), "alignmentY", 0.0F);
        setField(term184868, term184868.getClass(), "ui", null);
        setField(term184868, term184868.getClass(), "listenerList", null);
        setField(term184868, term184868.getClass(), "clientProperties", null);
        setField(term184868, term184868.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term184868, term184868.getClass(), "autoscrolls", false);
        setField(term184868, term184868.getClass(), "border", null);
        setIntField(term184868, term184868.getClass(), "flags", 0);
        setField(term184868, term184868.getClass(), "inputVerifier", null);
        setBooleanField(term184868, term184868.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term184868, term184868.getClass(), "paintingChild", null);
        setField(term184868, term184868.getClass(), "popupMenu", null);
        setField(term184868, term184868.getClass(), "revalidateRunnableScheduled", null);
        setField(term184868, term184868.getClass(), "focusInputMap", null);
        setField(term184868, term184868.getClass(), "ancestorInputMap", null);
        setField(term184868, term184868.getClass(), "windowInputMap", null);
        setField(term184868, term184868.getClass(), "actionMap", null);
        setField(term184868, term184868.getClass(), "aaHint", null);
        setField(term184868, term184868.getClass(), "lcdRenderingHint", null);
        setField(term184868, term184868.getClass(), "component", null);
        setField(term184868, term184868.getClass(), "layoutMgr", null);
        setField(term184868, term184868.getClass(), "dispatcher", null);
        setField(term184868, term184868.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term184868, term184868.getClass(), "focusCycleRoot", false);
        setBooleanField(term184868, term184868.getClass(), "focusTraversalPolicyProvider", false);
        setField(term184868, term184868.getClass(), "printingThreads", null);
        setBooleanField(term184868, term184868.getClass(), "printing", false);
        setField(term184868, term184868.getClass(), "containerListener", null);
        setIntField(term184868, term184868.getClass(), "listeningChildren", 0);
        setIntField(term184868, term184868.getClass(), "listeningBoundsChildren", 0);
        setIntField(term184868, term184868.getClass(), "descendantsCount", 0);
        setField(term184868, term184868.getClass(), "preserveBackgroundColor", null);
        setIntField(term184868, term184868.getClass(), "numOfHWComponents", 0);
        setIntField(term184868, term184868.getClass(), "numOfLWComponents", 0);
        setField(term184868, term184868.getClass(), "modalComp", null);
        setField(term184868, term184868.getClass(), "modalAppContext", null);
        setIntField(term184868, term184868.getClass(), "containerSerializedDataVersion", 0);
        setField(term184868, term184868.getClass(), "peer", null);
        setField(term184868, term184868.getClass(), "parent", null);
        setField(term184868, term184868.getClass(), "appContext", null);
        setIntField(term184868, term184868.getClass(), "x", 0);
        setIntField(term184868, term184868.getClass(), "y", 0);
        setIntField(term184868, term184868.getClass(), "width", 0);
        setIntField(term184868, term184868.getClass(), "height", 0);
        setField(term184868, term184868.getClass(), "foreground", null);
        setField(term184868, term184868.getClass(), "background", null);
        setField(term184868, term184868.getClass(), "font", null);
        setField(term184868, term184868.getClass(), "peerFont", null);
        setField(term184868, term184868.getClass(), "cursor", null);
        setField(term184868, term184868.getClass(), "locale", null);
        setField(term184868, term184868.getClass(), "graphicsConfig", null);
        setField(term184868, term184868.getClass(), "bufferStrategy", null);
        setBooleanField(term184868, term184868.getClass(), "ignoreRepaint", false);
        setBooleanField(term184868, term184868.getClass(), "visible", false);
        setBooleanField(term184868, term184868.getClass(), "enabled", false);
        setBooleanField(term184868, term184868.getClass(), "valid", false);
        setField(term184868, term184868.getClass(), "dropTarget", null);
        setField(term184868, term184868.getClass(), "popups", null);
        setField(term184868, term184868.getClass(), "name", null);
        setBooleanField(term184868, term184868.getClass(), "nameExplicitlySet", false);
        setBooleanField(term184868, term184868.getClass(), "focusable", false);
        setIntField(term184868, term184868.getClass(), "isFocusTraversableOverridden", 0);
        setField(term184868, term184868.getClass(), "focusTraversalKeys", null);
        setBooleanField(term184868, term184868.getClass(), "focusTraversalKeysEnabled", false);
        setField(term184868, term184868.getClass(), "acc", null);
        setField(term184868, term184868.getClass(), "minSize", null);
        setBooleanField(term184868, term184868.getClass(), "minSizeSet", false);
        setField(term184868, term184868.getClass(), "prefSize", null);
        setBooleanField(term184868, term184868.getClass(), "prefSizeSet", false);
        setField(term184868, term184868.getClass(), "maxSize", null);
        setBooleanField(term184868, term184868.getClass(), "maxSizeSet", false);
        setField(term184868, term184868.getClass(), "componentOrientation", null);
        setBooleanField(term184868, term184868.getClass(), "newEventsOnly", false);
        setField(term184868, term184868.getClass(), "componentListener", null);
        setField(term184868, term184868.getClass(), "focusListener", null);
        setField(term184868, term184868.getClass(), "hierarchyListener", null);
        setField(term184868, term184868.getClass(), "hierarchyBoundsListener", null);
        setField(term184868, term184868.getClass(), "keyListener", null);
        setField(term184868, term184868.getClass(), "mouseListener", null);
        setField(term184868, term184868.getClass(), "mouseMotionListener", null);
        setField(term184868, term184868.getClass(), "mouseWheelListener", null);
        setField(term184868, term184868.getClass(), "inputMethodListener", null);
        setLongField(term184868, term184868.getClass(), "eventMask", 0L);
        setField(term184868, term184868.getClass(), "changeSupport", null);
        setField(term184868, term184868.getClass(), "objectLock", null);
        setBooleanField(term184868, term184868.getClass(), "isPacked", false);
        setIntField(term184868, term184868.getClass(), "boundsOp", 0);
        setField(term184868, term184868.getClass(), "compoundShape", null);
        setField(term184868, term184868.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term184868, term184868.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term184868, term184868.getClass(), "backgroundEraseDisabled", false);
        setField(term184868, term184868.getClass(), "eventCache", null);
        setBooleanField(term184868, term184868.getClass(), "coalescingEnabled", false);
        setBooleanField(term184868, term184868.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term184868, term184868.getClass(), "componentSerializedDataVersion", 0);
        setField(term184868, term184868.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateLightsFromBridge", argTypes, term184868, args);
    }

};


