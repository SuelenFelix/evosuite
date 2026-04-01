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

public class AmbientLightView_valueChanged_188526702228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229257;

    public AmbientLightView_valueChanged_188526702228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229257 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term229257, term229257.getClass(), "hostnameField", null);
        setField(term229257, term229257.getClass(), "usernameField", null);
        setField(term229257, term229257.getClass(), "connectBtn", null);
        setField(term229257, term229257.getClass(), "infoText", null);
        setField(term229257, term229257.getClass(), "listOfDevices", null);
        setField(term229257, term229257.getClass(), "centerLightSelection", null);
        setField(term229257, term229257.getClass(), "leftLightSelection", null);
        setField(term229257, term229257.getClass(), "rightLightSelection", null);
        setField(term229257, term229257.getClass(), "effectSelection", null);
        setField(term229257, term229257.getClass(), "ambientLightsBox", null);
        setField(term229257, term229257.getClass(), "lightsSlider", null);
        setField(term229257, term229257.getClass(), "bridge", null);
        setBooleanField(term229257, term229257.getClass(), "lightListUpdated", false);
        setBooleanField(term229257, term229257.getClass(), "justScanned", false);
        setBooleanField(term229257, term229257.getClass(), "isAlignmentXSet", false);
        setFloatField(term229257, term229257.getClass(), "alignmentX", 0.0F);
        setBooleanField(term229257, term229257.getClass(), "isAlignmentYSet", false);
        setFloatField(term229257, term229257.getClass(), "alignmentY", 0.0F);
        setField(term229257, term229257.getClass(), "ui", null);
        setField(term229257, term229257.getClass(), "listenerList", null);
        setField(term229257, term229257.getClass(), "clientProperties", null);
        setField(term229257, term229257.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term229257, term229257.getClass(), "autoscrolls", false);
        setField(term229257, term229257.getClass(), "border", null);
        setIntField(term229257, term229257.getClass(), "flags", 0);
        setField(term229257, term229257.getClass(), "inputVerifier", null);
        setBooleanField(term229257, term229257.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term229257, term229257.getClass(), "paintingChild", null);
        setField(term229257, term229257.getClass(), "popupMenu", null);
        setField(term229257, term229257.getClass(), "revalidateRunnableScheduled", null);
        setField(term229257, term229257.getClass(), "focusInputMap", null);
        setField(term229257, term229257.getClass(), "ancestorInputMap", null);
        setField(term229257, term229257.getClass(), "windowInputMap", null);
        setField(term229257, term229257.getClass(), "actionMap", null);
        setField(term229257, term229257.getClass(), "aaHint", null);
        setField(term229257, term229257.getClass(), "lcdRenderingHint", null);
        setField(term229257, term229257.getClass(), "component", null);
        setField(term229257, term229257.getClass(), "layoutMgr", null);
        setField(term229257, term229257.getClass(), "dispatcher", null);
        setField(term229257, term229257.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term229257, term229257.getClass(), "focusCycleRoot", false);
        setBooleanField(term229257, term229257.getClass(), "focusTraversalPolicyProvider", false);
        setField(term229257, term229257.getClass(), "printingThreads", null);
        setBooleanField(term229257, term229257.getClass(), "printing", false);
        setField(term229257, term229257.getClass(), "containerListener", null);
        setIntField(term229257, term229257.getClass(), "listeningChildren", 0);
        setIntField(term229257, term229257.getClass(), "listeningBoundsChildren", 0);
        setIntField(term229257, term229257.getClass(), "descendantsCount", 0);
        setField(term229257, term229257.getClass(), "preserveBackgroundColor", null);
        setIntField(term229257, term229257.getClass(), "numOfHWComponents", 0);
        setIntField(term229257, term229257.getClass(), "numOfLWComponents", 0);
        setField(term229257, term229257.getClass(), "modalComp", null);
        setField(term229257, term229257.getClass(), "modalAppContext", null);
        setIntField(term229257, term229257.getClass(), "containerSerializedDataVersion", 0);
        setField(term229257, term229257.getClass(), "peer", null);
        setField(term229257, term229257.getClass(), "parent", null);
        setField(term229257, term229257.getClass(), "appContext", null);
        setIntField(term229257, term229257.getClass(), "x", 0);
        setIntField(term229257, term229257.getClass(), "y", 0);
        setIntField(term229257, term229257.getClass(), "width", 0);
        setIntField(term229257, term229257.getClass(), "height", 0);
        setField(term229257, term229257.getClass(), "foreground", null);
        setField(term229257, term229257.getClass(), "background", null);
        setField(term229257, term229257.getClass(), "font", null);
        setField(term229257, term229257.getClass(), "peerFont", null);
        setField(term229257, term229257.getClass(), "cursor", null);
        setField(term229257, term229257.getClass(), "locale", null);
        setField(term229257, term229257.getClass(), "graphicsConfig", null);
        setField(term229257, term229257.getClass(), "bufferStrategy", null);
        setBooleanField(term229257, term229257.getClass(), "ignoreRepaint", false);
        setBooleanField(term229257, term229257.getClass(), "visible", false);
        setBooleanField(term229257, term229257.getClass(), "enabled", false);
        setBooleanField(term229257, term229257.getClass(), "valid", false);
        setField(term229257, term229257.getClass(), "dropTarget", null);
        setField(term229257, term229257.getClass(), "popups", null);
        setField(term229257, term229257.getClass(), "name", null);
        setBooleanField(term229257, term229257.getClass(), "nameExplicitlySet", false);
        setBooleanField(term229257, term229257.getClass(), "focusable", false);
        setIntField(term229257, term229257.getClass(), "isFocusTraversableOverridden", 0);
        setField(term229257, term229257.getClass(), "focusTraversalKeys", null);
        setBooleanField(term229257, term229257.getClass(), "focusTraversalKeysEnabled", false);
        setField(term229257, term229257.getClass(), "acc", null);
        setField(term229257, term229257.getClass(), "minSize", null);
        setBooleanField(term229257, term229257.getClass(), "minSizeSet", false);
        setField(term229257, term229257.getClass(), "prefSize", null);
        setBooleanField(term229257, term229257.getClass(), "prefSizeSet", false);
        setField(term229257, term229257.getClass(), "maxSize", null);
        setBooleanField(term229257, term229257.getClass(), "maxSizeSet", false);
        setField(term229257, term229257.getClass(), "componentOrientation", null);
        setBooleanField(term229257, term229257.getClass(), "newEventsOnly", false);
        setField(term229257, term229257.getClass(), "componentListener", null);
        setField(term229257, term229257.getClass(), "focusListener", null);
        setField(term229257, term229257.getClass(), "hierarchyListener", null);
        setField(term229257, term229257.getClass(), "hierarchyBoundsListener", null);
        setField(term229257, term229257.getClass(), "keyListener", null);
        setField(term229257, term229257.getClass(), "mouseListener", null);
        setField(term229257, term229257.getClass(), "mouseMotionListener", null);
        setField(term229257, term229257.getClass(), "mouseWheelListener", null);
        setField(term229257, term229257.getClass(), "inputMethodListener", null);
        setLongField(term229257, term229257.getClass(), "eventMask", 0L);
        setField(term229257, term229257.getClass(), "changeSupport", null);
        setField(term229257, term229257.getClass(), "objectLock", null);
        setBooleanField(term229257, term229257.getClass(), "isPacked", false);
        setIntField(term229257, term229257.getClass(), "boundsOp", 0);
        setField(term229257, term229257.getClass(), "compoundShape", null);
        setField(term229257, term229257.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term229257, term229257.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term229257, term229257.getClass(), "backgroundEraseDisabled", false);
        setField(term229257, term229257.getClass(), "eventCache", null);
        setBooleanField(term229257, term229257.getClass(), "coalescingEnabled", false);
        setBooleanField(term229257, term229257.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term229257, term229257.getClass(), "componentSerializedDataVersion", 0);
        setField(term229257, term229257.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.ListSelectionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "valueChanged", argTypes, term229257, args);
    }

};


