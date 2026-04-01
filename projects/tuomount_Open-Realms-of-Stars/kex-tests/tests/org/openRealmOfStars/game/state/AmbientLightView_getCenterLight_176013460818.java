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

public class AmbientLightView_getCenterLight_176013460818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209021;

    public AmbientLightView_getCenterLight_176013460818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209021 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term209021, term209021.getClass(), "hostnameField", null);
        setField(term209021, term209021.getClass(), "usernameField", null);
        setField(term209021, term209021.getClass(), "connectBtn", null);
        setField(term209021, term209021.getClass(), "infoText", null);
        setField(term209021, term209021.getClass(), "listOfDevices", null);
        setField(term209021, term209021.getClass(), "centerLightSelection", null);
        setField(term209021, term209021.getClass(), "leftLightSelection", null);
        setField(term209021, term209021.getClass(), "rightLightSelection", null);
        setField(term209021, term209021.getClass(), "effectSelection", null);
        setField(term209021, term209021.getClass(), "ambientLightsBox", null);
        setField(term209021, term209021.getClass(), "lightsSlider", null);
        setField(term209021, term209021.getClass(), "bridge", null);
        setBooleanField(term209021, term209021.getClass(), "lightListUpdated", false);
        setBooleanField(term209021, term209021.getClass(), "justScanned", false);
        setBooleanField(term209021, term209021.getClass(), "isAlignmentXSet", false);
        setFloatField(term209021, term209021.getClass(), "alignmentX", 0.0F);
        setBooleanField(term209021, term209021.getClass(), "isAlignmentYSet", false);
        setFloatField(term209021, term209021.getClass(), "alignmentY", 0.0F);
        setField(term209021, term209021.getClass(), "ui", null);
        setField(term209021, term209021.getClass(), "listenerList", null);
        setField(term209021, term209021.getClass(), "clientProperties", null);
        setField(term209021, term209021.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term209021, term209021.getClass(), "autoscrolls", false);
        setField(term209021, term209021.getClass(), "border", null);
        setIntField(term209021, term209021.getClass(), "flags", 0);
        setField(term209021, term209021.getClass(), "inputVerifier", null);
        setBooleanField(term209021, term209021.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term209021, term209021.getClass(), "paintingChild", null);
        setField(term209021, term209021.getClass(), "popupMenu", null);
        setField(term209021, term209021.getClass(), "revalidateRunnableScheduled", null);
        setField(term209021, term209021.getClass(), "focusInputMap", null);
        setField(term209021, term209021.getClass(), "ancestorInputMap", null);
        setField(term209021, term209021.getClass(), "windowInputMap", null);
        setField(term209021, term209021.getClass(), "actionMap", null);
        setField(term209021, term209021.getClass(), "aaHint", null);
        setField(term209021, term209021.getClass(), "lcdRenderingHint", null);
        setField(term209021, term209021.getClass(), "component", null);
        setField(term209021, term209021.getClass(), "layoutMgr", null);
        setField(term209021, term209021.getClass(), "dispatcher", null);
        setField(term209021, term209021.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term209021, term209021.getClass(), "focusCycleRoot", false);
        setBooleanField(term209021, term209021.getClass(), "focusTraversalPolicyProvider", false);
        setField(term209021, term209021.getClass(), "printingThreads", null);
        setBooleanField(term209021, term209021.getClass(), "printing", false);
        setField(term209021, term209021.getClass(), "containerListener", null);
        setIntField(term209021, term209021.getClass(), "listeningChildren", 0);
        setIntField(term209021, term209021.getClass(), "listeningBoundsChildren", 0);
        setIntField(term209021, term209021.getClass(), "descendantsCount", 0);
        setField(term209021, term209021.getClass(), "preserveBackgroundColor", null);
        setIntField(term209021, term209021.getClass(), "numOfHWComponents", 0);
        setIntField(term209021, term209021.getClass(), "numOfLWComponents", 0);
        setField(term209021, term209021.getClass(), "modalComp", null);
        setField(term209021, term209021.getClass(), "modalAppContext", null);
        setIntField(term209021, term209021.getClass(), "containerSerializedDataVersion", 0);
        setField(term209021, term209021.getClass(), "peer", null);
        setField(term209021, term209021.getClass(), "parent", null);
        setField(term209021, term209021.getClass(), "appContext", null);
        setIntField(term209021, term209021.getClass(), "x", 0);
        setIntField(term209021, term209021.getClass(), "y", 0);
        setIntField(term209021, term209021.getClass(), "width", 0);
        setIntField(term209021, term209021.getClass(), "height", 0);
        setField(term209021, term209021.getClass(), "foreground", null);
        setField(term209021, term209021.getClass(), "background", null);
        setField(term209021, term209021.getClass(), "font", null);
        setField(term209021, term209021.getClass(), "peerFont", null);
        setField(term209021, term209021.getClass(), "cursor", null);
        setField(term209021, term209021.getClass(), "locale", null);
        setField(term209021, term209021.getClass(), "graphicsConfig", null);
        setField(term209021, term209021.getClass(), "bufferStrategy", null);
        setBooleanField(term209021, term209021.getClass(), "ignoreRepaint", false);
        setBooleanField(term209021, term209021.getClass(), "visible", false);
        setBooleanField(term209021, term209021.getClass(), "enabled", false);
        setBooleanField(term209021, term209021.getClass(), "valid", false);
        setField(term209021, term209021.getClass(), "dropTarget", null);
        setField(term209021, term209021.getClass(), "popups", null);
        setField(term209021, term209021.getClass(), "name", null);
        setBooleanField(term209021, term209021.getClass(), "nameExplicitlySet", false);
        setBooleanField(term209021, term209021.getClass(), "focusable", false);
        setIntField(term209021, term209021.getClass(), "isFocusTraversableOverridden", 0);
        setField(term209021, term209021.getClass(), "focusTraversalKeys", null);
        setBooleanField(term209021, term209021.getClass(), "focusTraversalKeysEnabled", false);
        setField(term209021, term209021.getClass(), "acc", null);
        setField(term209021, term209021.getClass(), "minSize", null);
        setBooleanField(term209021, term209021.getClass(), "minSizeSet", false);
        setField(term209021, term209021.getClass(), "prefSize", null);
        setBooleanField(term209021, term209021.getClass(), "prefSizeSet", false);
        setField(term209021, term209021.getClass(), "maxSize", null);
        setBooleanField(term209021, term209021.getClass(), "maxSizeSet", false);
        setField(term209021, term209021.getClass(), "componentOrientation", null);
        setBooleanField(term209021, term209021.getClass(), "newEventsOnly", false);
        setField(term209021, term209021.getClass(), "componentListener", null);
        setField(term209021, term209021.getClass(), "focusListener", null);
        setField(term209021, term209021.getClass(), "hierarchyListener", null);
        setField(term209021, term209021.getClass(), "hierarchyBoundsListener", null);
        setField(term209021, term209021.getClass(), "keyListener", null);
        setField(term209021, term209021.getClass(), "mouseListener", null);
        setField(term209021, term209021.getClass(), "mouseMotionListener", null);
        setField(term209021, term209021.getClass(), "mouseWheelListener", null);
        setField(term209021, term209021.getClass(), "inputMethodListener", null);
        setLongField(term209021, term209021.getClass(), "eventMask", 0L);
        setField(term209021, term209021.getClass(), "changeSupport", null);
        setField(term209021, term209021.getClass(), "objectLock", null);
        setBooleanField(term209021, term209021.getClass(), "isPacked", false);
        setIntField(term209021, term209021.getClass(), "boundsOp", 0);
        setField(term209021, term209021.getClass(), "compoundShape", null);
        setField(term209021, term209021.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term209021, term209021.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term209021, term209021.getClass(), "backgroundEraseDisabled", false);
        setField(term209021, term209021.getClass(), "eventCache", null);
        setBooleanField(term209021, term209021.getClass(), "coalescingEnabled", false);
        setBooleanField(term209021, term209021.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term209021, term209021.getClass(), "componentSerializedDataVersion", 0);
        setField(term209021, term209021.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCenterLight", argTypes, term209021, args);
    }

};


