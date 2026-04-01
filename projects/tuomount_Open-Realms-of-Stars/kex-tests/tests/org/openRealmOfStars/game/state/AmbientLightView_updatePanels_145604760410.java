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

public class AmbientLightView_updatePanels_145604760410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192883;

    public AmbientLightView_updatePanels_145604760410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192883 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term192883, term192883.getClass(), "hostnameField", null);
        setField(term192883, term192883.getClass(), "usernameField", null);
        setField(term192883, term192883.getClass(), "connectBtn", null);
        setField(term192883, term192883.getClass(), "infoText", null);
        setField(term192883, term192883.getClass(), "listOfDevices", null);
        setField(term192883, term192883.getClass(), "centerLightSelection", null);
        setField(term192883, term192883.getClass(), "leftLightSelection", null);
        setField(term192883, term192883.getClass(), "rightLightSelection", null);
        setField(term192883, term192883.getClass(), "effectSelection", null);
        setField(term192883, term192883.getClass(), "ambientLightsBox", null);
        setField(term192883, term192883.getClass(), "lightsSlider", null);
        setField(term192883, term192883.getClass(), "bridge", null);
        setBooleanField(term192883, term192883.getClass(), "lightListUpdated", false);
        setBooleanField(term192883, term192883.getClass(), "justScanned", false);
        setBooleanField(term192883, term192883.getClass(), "isAlignmentXSet", false);
        setFloatField(term192883, term192883.getClass(), "alignmentX", 0.0F);
        setBooleanField(term192883, term192883.getClass(), "isAlignmentYSet", false);
        setFloatField(term192883, term192883.getClass(), "alignmentY", 0.0F);
        setField(term192883, term192883.getClass(), "ui", null);
        setField(term192883, term192883.getClass(), "listenerList", null);
        setField(term192883, term192883.getClass(), "clientProperties", null);
        setField(term192883, term192883.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term192883, term192883.getClass(), "autoscrolls", false);
        setField(term192883, term192883.getClass(), "border", null);
        setIntField(term192883, term192883.getClass(), "flags", 0);
        setField(term192883, term192883.getClass(), "inputVerifier", null);
        setBooleanField(term192883, term192883.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term192883, term192883.getClass(), "paintingChild", null);
        setField(term192883, term192883.getClass(), "popupMenu", null);
        setField(term192883, term192883.getClass(), "revalidateRunnableScheduled", null);
        setField(term192883, term192883.getClass(), "focusInputMap", null);
        setField(term192883, term192883.getClass(), "ancestorInputMap", null);
        setField(term192883, term192883.getClass(), "windowInputMap", null);
        setField(term192883, term192883.getClass(), "actionMap", null);
        setField(term192883, term192883.getClass(), "aaHint", null);
        setField(term192883, term192883.getClass(), "lcdRenderingHint", null);
        setField(term192883, term192883.getClass(), "component", null);
        setField(term192883, term192883.getClass(), "layoutMgr", null);
        setField(term192883, term192883.getClass(), "dispatcher", null);
        setField(term192883, term192883.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term192883, term192883.getClass(), "focusCycleRoot", false);
        setBooleanField(term192883, term192883.getClass(), "focusTraversalPolicyProvider", false);
        setField(term192883, term192883.getClass(), "printingThreads", null);
        setBooleanField(term192883, term192883.getClass(), "printing", false);
        setField(term192883, term192883.getClass(), "containerListener", null);
        setIntField(term192883, term192883.getClass(), "listeningChildren", 0);
        setIntField(term192883, term192883.getClass(), "listeningBoundsChildren", 0);
        setIntField(term192883, term192883.getClass(), "descendantsCount", 0);
        setField(term192883, term192883.getClass(), "preserveBackgroundColor", null);
        setIntField(term192883, term192883.getClass(), "numOfHWComponents", 0);
        setIntField(term192883, term192883.getClass(), "numOfLWComponents", 0);
        setField(term192883, term192883.getClass(), "modalComp", null);
        setField(term192883, term192883.getClass(), "modalAppContext", null);
        setIntField(term192883, term192883.getClass(), "containerSerializedDataVersion", 0);
        setField(term192883, term192883.getClass(), "peer", null);
        setField(term192883, term192883.getClass(), "parent", null);
        setField(term192883, term192883.getClass(), "appContext", null);
        setIntField(term192883, term192883.getClass(), "x", 0);
        setIntField(term192883, term192883.getClass(), "y", 0);
        setIntField(term192883, term192883.getClass(), "width", 0);
        setIntField(term192883, term192883.getClass(), "height", 0);
        setField(term192883, term192883.getClass(), "foreground", null);
        setField(term192883, term192883.getClass(), "background", null);
        setField(term192883, term192883.getClass(), "font", null);
        setField(term192883, term192883.getClass(), "peerFont", null);
        setField(term192883, term192883.getClass(), "cursor", null);
        setField(term192883, term192883.getClass(), "locale", null);
        setField(term192883, term192883.getClass(), "graphicsConfig", null);
        setField(term192883, term192883.getClass(), "bufferStrategy", null);
        setBooleanField(term192883, term192883.getClass(), "ignoreRepaint", false);
        setBooleanField(term192883, term192883.getClass(), "visible", false);
        setBooleanField(term192883, term192883.getClass(), "enabled", false);
        setBooleanField(term192883, term192883.getClass(), "valid", false);
        setField(term192883, term192883.getClass(), "dropTarget", null);
        setField(term192883, term192883.getClass(), "popups", null);
        setField(term192883, term192883.getClass(), "name", null);
        setBooleanField(term192883, term192883.getClass(), "nameExplicitlySet", false);
        setBooleanField(term192883, term192883.getClass(), "focusable", false);
        setIntField(term192883, term192883.getClass(), "isFocusTraversableOverridden", 0);
        setField(term192883, term192883.getClass(), "focusTraversalKeys", null);
        setBooleanField(term192883, term192883.getClass(), "focusTraversalKeysEnabled", false);
        setField(term192883, term192883.getClass(), "acc", null);
        setField(term192883, term192883.getClass(), "minSize", null);
        setBooleanField(term192883, term192883.getClass(), "minSizeSet", false);
        setField(term192883, term192883.getClass(), "prefSize", null);
        setBooleanField(term192883, term192883.getClass(), "prefSizeSet", false);
        setField(term192883, term192883.getClass(), "maxSize", null);
        setBooleanField(term192883, term192883.getClass(), "maxSizeSet", false);
        setField(term192883, term192883.getClass(), "componentOrientation", null);
        setBooleanField(term192883, term192883.getClass(), "newEventsOnly", false);
        setField(term192883, term192883.getClass(), "componentListener", null);
        setField(term192883, term192883.getClass(), "focusListener", null);
        setField(term192883, term192883.getClass(), "hierarchyListener", null);
        setField(term192883, term192883.getClass(), "hierarchyBoundsListener", null);
        setField(term192883, term192883.getClass(), "keyListener", null);
        setField(term192883, term192883.getClass(), "mouseListener", null);
        setField(term192883, term192883.getClass(), "mouseMotionListener", null);
        setField(term192883, term192883.getClass(), "mouseWheelListener", null);
        setField(term192883, term192883.getClass(), "inputMethodListener", null);
        setLongField(term192883, term192883.getClass(), "eventMask", 0L);
        setField(term192883, term192883.getClass(), "changeSupport", null);
        setField(term192883, term192883.getClass(), "objectLock", null);
        setBooleanField(term192883, term192883.getClass(), "isPacked", false);
        setIntField(term192883, term192883.getClass(), "boundsOp", 0);
        setField(term192883, term192883.getClass(), "compoundShape", null);
        setField(term192883, term192883.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term192883, term192883.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term192883, term192883.getClass(), "backgroundEraseDisabled", false);
        setField(term192883, term192883.getClass(), "eventCache", null);
        setBooleanField(term192883, term192883.getClass(), "coalescingEnabled", false);
        setBooleanField(term192883, term192883.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term192883, term192883.getClass(), "componentSerializedDataVersion", 0);
        setField(term192883, term192883.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanels", argTypes, term192883, args);
    }

};


