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

public class AmbientLightView_getBridge_23880893012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196937;

    public AmbientLightView_getBridge_23880893012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196937 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term196937, term196937.getClass(), "hostnameField", null);
        setField(term196937, term196937.getClass(), "usernameField", null);
        setField(term196937, term196937.getClass(), "connectBtn", null);
        setField(term196937, term196937.getClass(), "infoText", null);
        setField(term196937, term196937.getClass(), "listOfDevices", null);
        setField(term196937, term196937.getClass(), "centerLightSelection", null);
        setField(term196937, term196937.getClass(), "leftLightSelection", null);
        setField(term196937, term196937.getClass(), "rightLightSelection", null);
        setField(term196937, term196937.getClass(), "effectSelection", null);
        setField(term196937, term196937.getClass(), "ambientLightsBox", null);
        setField(term196937, term196937.getClass(), "lightsSlider", null);
        setField(term196937, term196937.getClass(), "bridge", null);
        setBooleanField(term196937, term196937.getClass(), "lightListUpdated", false);
        setBooleanField(term196937, term196937.getClass(), "justScanned", false);
        setBooleanField(term196937, term196937.getClass(), "isAlignmentXSet", false);
        setFloatField(term196937, term196937.getClass(), "alignmentX", 0.0F);
        setBooleanField(term196937, term196937.getClass(), "isAlignmentYSet", false);
        setFloatField(term196937, term196937.getClass(), "alignmentY", 0.0F);
        setField(term196937, term196937.getClass(), "ui", null);
        setField(term196937, term196937.getClass(), "listenerList", null);
        setField(term196937, term196937.getClass(), "clientProperties", null);
        setField(term196937, term196937.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term196937, term196937.getClass(), "autoscrolls", false);
        setField(term196937, term196937.getClass(), "border", null);
        setIntField(term196937, term196937.getClass(), "flags", 0);
        setField(term196937, term196937.getClass(), "inputVerifier", null);
        setBooleanField(term196937, term196937.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term196937, term196937.getClass(), "paintingChild", null);
        setField(term196937, term196937.getClass(), "popupMenu", null);
        setField(term196937, term196937.getClass(), "revalidateRunnableScheduled", null);
        setField(term196937, term196937.getClass(), "focusInputMap", null);
        setField(term196937, term196937.getClass(), "ancestorInputMap", null);
        setField(term196937, term196937.getClass(), "windowInputMap", null);
        setField(term196937, term196937.getClass(), "actionMap", null);
        setField(term196937, term196937.getClass(), "aaHint", null);
        setField(term196937, term196937.getClass(), "lcdRenderingHint", null);
        setField(term196937, term196937.getClass(), "component", null);
        setField(term196937, term196937.getClass(), "layoutMgr", null);
        setField(term196937, term196937.getClass(), "dispatcher", null);
        setField(term196937, term196937.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term196937, term196937.getClass(), "focusCycleRoot", false);
        setBooleanField(term196937, term196937.getClass(), "focusTraversalPolicyProvider", false);
        setField(term196937, term196937.getClass(), "printingThreads", null);
        setBooleanField(term196937, term196937.getClass(), "printing", false);
        setField(term196937, term196937.getClass(), "containerListener", null);
        setIntField(term196937, term196937.getClass(), "listeningChildren", 0);
        setIntField(term196937, term196937.getClass(), "listeningBoundsChildren", 0);
        setIntField(term196937, term196937.getClass(), "descendantsCount", 0);
        setField(term196937, term196937.getClass(), "preserveBackgroundColor", null);
        setIntField(term196937, term196937.getClass(), "numOfHWComponents", 0);
        setIntField(term196937, term196937.getClass(), "numOfLWComponents", 0);
        setField(term196937, term196937.getClass(), "modalComp", null);
        setField(term196937, term196937.getClass(), "modalAppContext", null);
        setIntField(term196937, term196937.getClass(), "containerSerializedDataVersion", 0);
        setField(term196937, term196937.getClass(), "peer", null);
        setField(term196937, term196937.getClass(), "parent", null);
        setField(term196937, term196937.getClass(), "appContext", null);
        setIntField(term196937, term196937.getClass(), "x", 0);
        setIntField(term196937, term196937.getClass(), "y", 0);
        setIntField(term196937, term196937.getClass(), "width", 0);
        setIntField(term196937, term196937.getClass(), "height", 0);
        setField(term196937, term196937.getClass(), "foreground", null);
        setField(term196937, term196937.getClass(), "background", null);
        setField(term196937, term196937.getClass(), "font", null);
        setField(term196937, term196937.getClass(), "peerFont", null);
        setField(term196937, term196937.getClass(), "cursor", null);
        setField(term196937, term196937.getClass(), "locale", null);
        setField(term196937, term196937.getClass(), "graphicsConfig", null);
        setField(term196937, term196937.getClass(), "bufferStrategy", null);
        setBooleanField(term196937, term196937.getClass(), "ignoreRepaint", false);
        setBooleanField(term196937, term196937.getClass(), "visible", false);
        setBooleanField(term196937, term196937.getClass(), "enabled", false);
        setBooleanField(term196937, term196937.getClass(), "valid", false);
        setField(term196937, term196937.getClass(), "dropTarget", null);
        setField(term196937, term196937.getClass(), "popups", null);
        setField(term196937, term196937.getClass(), "name", null);
        setBooleanField(term196937, term196937.getClass(), "nameExplicitlySet", false);
        setBooleanField(term196937, term196937.getClass(), "focusable", false);
        setIntField(term196937, term196937.getClass(), "isFocusTraversableOverridden", 0);
        setField(term196937, term196937.getClass(), "focusTraversalKeys", null);
        setBooleanField(term196937, term196937.getClass(), "focusTraversalKeysEnabled", false);
        setField(term196937, term196937.getClass(), "acc", null);
        setField(term196937, term196937.getClass(), "minSize", null);
        setBooleanField(term196937, term196937.getClass(), "minSizeSet", false);
        setField(term196937, term196937.getClass(), "prefSize", null);
        setBooleanField(term196937, term196937.getClass(), "prefSizeSet", false);
        setField(term196937, term196937.getClass(), "maxSize", null);
        setBooleanField(term196937, term196937.getClass(), "maxSizeSet", false);
        setField(term196937, term196937.getClass(), "componentOrientation", null);
        setBooleanField(term196937, term196937.getClass(), "newEventsOnly", false);
        setField(term196937, term196937.getClass(), "componentListener", null);
        setField(term196937, term196937.getClass(), "focusListener", null);
        setField(term196937, term196937.getClass(), "hierarchyListener", null);
        setField(term196937, term196937.getClass(), "hierarchyBoundsListener", null);
        setField(term196937, term196937.getClass(), "keyListener", null);
        setField(term196937, term196937.getClass(), "mouseListener", null);
        setField(term196937, term196937.getClass(), "mouseMotionListener", null);
        setField(term196937, term196937.getClass(), "mouseWheelListener", null);
        setField(term196937, term196937.getClass(), "inputMethodListener", null);
        setLongField(term196937, term196937.getClass(), "eventMask", 0L);
        setField(term196937, term196937.getClass(), "changeSupport", null);
        setField(term196937, term196937.getClass(), "objectLock", null);
        setBooleanField(term196937, term196937.getClass(), "isPacked", false);
        setIntField(term196937, term196937.getClass(), "boundsOp", 0);
        setField(term196937, term196937.getClass(), "compoundShape", null);
        setField(term196937, term196937.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term196937, term196937.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term196937, term196937.getClass(), "backgroundEraseDisabled", false);
        setField(term196937, term196937.getClass(), "eventCache", null);
        setBooleanField(term196937, term196937.getClass(), "coalescingEnabled", false);
        setBooleanField(term196937, term196937.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term196937, term196937.getClass(), "componentSerializedDataVersion", 0);
        setField(term196937, term196937.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBridge", argTypes, term196937, args);
    }

};


