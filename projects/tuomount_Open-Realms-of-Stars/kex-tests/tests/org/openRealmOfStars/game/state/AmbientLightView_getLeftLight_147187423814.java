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

public class AmbientLightView_getLeftLight_147187423814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201069;

    public AmbientLightView_getLeftLight_147187423814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201069 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term201069, term201069.getClass(), "hostnameField", null);
        setField(term201069, term201069.getClass(), "usernameField", null);
        setField(term201069, term201069.getClass(), "connectBtn", null);
        setField(term201069, term201069.getClass(), "infoText", null);
        setField(term201069, term201069.getClass(), "listOfDevices", null);
        setField(term201069, term201069.getClass(), "centerLightSelection", null);
        setField(term201069, term201069.getClass(), "leftLightSelection", null);
        setField(term201069, term201069.getClass(), "rightLightSelection", null);
        setField(term201069, term201069.getClass(), "effectSelection", null);
        setField(term201069, term201069.getClass(), "ambientLightsBox", null);
        setField(term201069, term201069.getClass(), "lightsSlider", null);
        setField(term201069, term201069.getClass(), "bridge", null);
        setBooleanField(term201069, term201069.getClass(), "lightListUpdated", false);
        setBooleanField(term201069, term201069.getClass(), "justScanned", false);
        setBooleanField(term201069, term201069.getClass(), "isAlignmentXSet", false);
        setFloatField(term201069, term201069.getClass(), "alignmentX", 0.0F);
        setBooleanField(term201069, term201069.getClass(), "isAlignmentYSet", false);
        setFloatField(term201069, term201069.getClass(), "alignmentY", 0.0F);
        setField(term201069, term201069.getClass(), "ui", null);
        setField(term201069, term201069.getClass(), "listenerList", null);
        setField(term201069, term201069.getClass(), "clientProperties", null);
        setField(term201069, term201069.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term201069, term201069.getClass(), "autoscrolls", false);
        setField(term201069, term201069.getClass(), "border", null);
        setIntField(term201069, term201069.getClass(), "flags", 0);
        setField(term201069, term201069.getClass(), "inputVerifier", null);
        setBooleanField(term201069, term201069.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term201069, term201069.getClass(), "paintingChild", null);
        setField(term201069, term201069.getClass(), "popupMenu", null);
        setField(term201069, term201069.getClass(), "revalidateRunnableScheduled", null);
        setField(term201069, term201069.getClass(), "focusInputMap", null);
        setField(term201069, term201069.getClass(), "ancestorInputMap", null);
        setField(term201069, term201069.getClass(), "windowInputMap", null);
        setField(term201069, term201069.getClass(), "actionMap", null);
        setField(term201069, term201069.getClass(), "aaHint", null);
        setField(term201069, term201069.getClass(), "lcdRenderingHint", null);
        setField(term201069, term201069.getClass(), "component", null);
        setField(term201069, term201069.getClass(), "layoutMgr", null);
        setField(term201069, term201069.getClass(), "dispatcher", null);
        setField(term201069, term201069.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term201069, term201069.getClass(), "focusCycleRoot", false);
        setBooleanField(term201069, term201069.getClass(), "focusTraversalPolicyProvider", false);
        setField(term201069, term201069.getClass(), "printingThreads", null);
        setBooleanField(term201069, term201069.getClass(), "printing", false);
        setField(term201069, term201069.getClass(), "containerListener", null);
        setIntField(term201069, term201069.getClass(), "listeningChildren", 0);
        setIntField(term201069, term201069.getClass(), "listeningBoundsChildren", 0);
        setIntField(term201069, term201069.getClass(), "descendantsCount", 0);
        setField(term201069, term201069.getClass(), "preserveBackgroundColor", null);
        setIntField(term201069, term201069.getClass(), "numOfHWComponents", 0);
        setIntField(term201069, term201069.getClass(), "numOfLWComponents", 0);
        setField(term201069, term201069.getClass(), "modalComp", null);
        setField(term201069, term201069.getClass(), "modalAppContext", null);
        setIntField(term201069, term201069.getClass(), "containerSerializedDataVersion", 0);
        setField(term201069, term201069.getClass(), "peer", null);
        setField(term201069, term201069.getClass(), "parent", null);
        setField(term201069, term201069.getClass(), "appContext", null);
        setIntField(term201069, term201069.getClass(), "x", 0);
        setIntField(term201069, term201069.getClass(), "y", 0);
        setIntField(term201069, term201069.getClass(), "width", 0);
        setIntField(term201069, term201069.getClass(), "height", 0);
        setField(term201069, term201069.getClass(), "foreground", null);
        setField(term201069, term201069.getClass(), "background", null);
        setField(term201069, term201069.getClass(), "font", null);
        setField(term201069, term201069.getClass(), "peerFont", null);
        setField(term201069, term201069.getClass(), "cursor", null);
        setField(term201069, term201069.getClass(), "locale", null);
        setField(term201069, term201069.getClass(), "graphicsConfig", null);
        setField(term201069, term201069.getClass(), "bufferStrategy", null);
        setBooleanField(term201069, term201069.getClass(), "ignoreRepaint", false);
        setBooleanField(term201069, term201069.getClass(), "visible", false);
        setBooleanField(term201069, term201069.getClass(), "enabled", false);
        setBooleanField(term201069, term201069.getClass(), "valid", false);
        setField(term201069, term201069.getClass(), "dropTarget", null);
        setField(term201069, term201069.getClass(), "popups", null);
        setField(term201069, term201069.getClass(), "name", null);
        setBooleanField(term201069, term201069.getClass(), "nameExplicitlySet", false);
        setBooleanField(term201069, term201069.getClass(), "focusable", false);
        setIntField(term201069, term201069.getClass(), "isFocusTraversableOverridden", 0);
        setField(term201069, term201069.getClass(), "focusTraversalKeys", null);
        setBooleanField(term201069, term201069.getClass(), "focusTraversalKeysEnabled", false);
        setField(term201069, term201069.getClass(), "acc", null);
        setField(term201069, term201069.getClass(), "minSize", null);
        setBooleanField(term201069, term201069.getClass(), "minSizeSet", false);
        setField(term201069, term201069.getClass(), "prefSize", null);
        setBooleanField(term201069, term201069.getClass(), "prefSizeSet", false);
        setField(term201069, term201069.getClass(), "maxSize", null);
        setBooleanField(term201069, term201069.getClass(), "maxSizeSet", false);
        setField(term201069, term201069.getClass(), "componentOrientation", null);
        setBooleanField(term201069, term201069.getClass(), "newEventsOnly", false);
        setField(term201069, term201069.getClass(), "componentListener", null);
        setField(term201069, term201069.getClass(), "focusListener", null);
        setField(term201069, term201069.getClass(), "hierarchyListener", null);
        setField(term201069, term201069.getClass(), "hierarchyBoundsListener", null);
        setField(term201069, term201069.getClass(), "keyListener", null);
        setField(term201069, term201069.getClass(), "mouseListener", null);
        setField(term201069, term201069.getClass(), "mouseMotionListener", null);
        setField(term201069, term201069.getClass(), "mouseWheelListener", null);
        setField(term201069, term201069.getClass(), "inputMethodListener", null);
        setLongField(term201069, term201069.getClass(), "eventMask", 0L);
        setField(term201069, term201069.getClass(), "changeSupport", null);
        setField(term201069, term201069.getClass(), "objectLock", null);
        setBooleanField(term201069, term201069.getClass(), "isPacked", false);
        setIntField(term201069, term201069.getClass(), "boundsOp", 0);
        setField(term201069, term201069.getClass(), "compoundShape", null);
        setField(term201069, term201069.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term201069, term201069.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term201069, term201069.getClass(), "backgroundEraseDisabled", false);
        setField(term201069, term201069.getClass(), "eventCache", null);
        setBooleanField(term201069, term201069.getClass(), "coalescingEnabled", false);
        setBooleanField(term201069, term201069.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term201069, term201069.getClass(), "componentSerializedDataVersion", 0);
        setField(term201069, term201069.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLeftLight", argTypes, term201069, args);
    }

};


