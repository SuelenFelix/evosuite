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

public class AmbientLightView_getBridgeId_76069935926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225285;

    public AmbientLightView_getBridgeId_76069935926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225285 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term225285, term225285.getClass(), "hostnameField", null);
        setField(term225285, term225285.getClass(), "usernameField", null);
        setField(term225285, term225285.getClass(), "connectBtn", null);
        setField(term225285, term225285.getClass(), "infoText", null);
        setField(term225285, term225285.getClass(), "listOfDevices", null);
        setField(term225285, term225285.getClass(), "centerLightSelection", null);
        setField(term225285, term225285.getClass(), "leftLightSelection", null);
        setField(term225285, term225285.getClass(), "rightLightSelection", null);
        setField(term225285, term225285.getClass(), "effectSelection", null);
        setField(term225285, term225285.getClass(), "ambientLightsBox", null);
        setField(term225285, term225285.getClass(), "lightsSlider", null);
        setField(term225285, term225285.getClass(), "bridge", null);
        setBooleanField(term225285, term225285.getClass(), "lightListUpdated", false);
        setBooleanField(term225285, term225285.getClass(), "justScanned", false);
        setBooleanField(term225285, term225285.getClass(), "isAlignmentXSet", false);
        setFloatField(term225285, term225285.getClass(), "alignmentX", 0.0F);
        setBooleanField(term225285, term225285.getClass(), "isAlignmentYSet", false);
        setFloatField(term225285, term225285.getClass(), "alignmentY", 0.0F);
        setField(term225285, term225285.getClass(), "ui", null);
        setField(term225285, term225285.getClass(), "listenerList", null);
        setField(term225285, term225285.getClass(), "clientProperties", null);
        setField(term225285, term225285.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term225285, term225285.getClass(), "autoscrolls", false);
        setField(term225285, term225285.getClass(), "border", null);
        setIntField(term225285, term225285.getClass(), "flags", 0);
        setField(term225285, term225285.getClass(), "inputVerifier", null);
        setBooleanField(term225285, term225285.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term225285, term225285.getClass(), "paintingChild", null);
        setField(term225285, term225285.getClass(), "popupMenu", null);
        setField(term225285, term225285.getClass(), "revalidateRunnableScheduled", null);
        setField(term225285, term225285.getClass(), "focusInputMap", null);
        setField(term225285, term225285.getClass(), "ancestorInputMap", null);
        setField(term225285, term225285.getClass(), "windowInputMap", null);
        setField(term225285, term225285.getClass(), "actionMap", null);
        setField(term225285, term225285.getClass(), "aaHint", null);
        setField(term225285, term225285.getClass(), "lcdRenderingHint", null);
        setField(term225285, term225285.getClass(), "component", null);
        setField(term225285, term225285.getClass(), "layoutMgr", null);
        setField(term225285, term225285.getClass(), "dispatcher", null);
        setField(term225285, term225285.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term225285, term225285.getClass(), "focusCycleRoot", false);
        setBooleanField(term225285, term225285.getClass(), "focusTraversalPolicyProvider", false);
        setField(term225285, term225285.getClass(), "printingThreads", null);
        setBooleanField(term225285, term225285.getClass(), "printing", false);
        setField(term225285, term225285.getClass(), "containerListener", null);
        setIntField(term225285, term225285.getClass(), "listeningChildren", 0);
        setIntField(term225285, term225285.getClass(), "listeningBoundsChildren", 0);
        setIntField(term225285, term225285.getClass(), "descendantsCount", 0);
        setField(term225285, term225285.getClass(), "preserveBackgroundColor", null);
        setIntField(term225285, term225285.getClass(), "numOfHWComponents", 0);
        setIntField(term225285, term225285.getClass(), "numOfLWComponents", 0);
        setField(term225285, term225285.getClass(), "modalComp", null);
        setField(term225285, term225285.getClass(), "modalAppContext", null);
        setIntField(term225285, term225285.getClass(), "containerSerializedDataVersion", 0);
        setField(term225285, term225285.getClass(), "peer", null);
        setField(term225285, term225285.getClass(), "parent", null);
        setField(term225285, term225285.getClass(), "appContext", null);
        setIntField(term225285, term225285.getClass(), "x", 0);
        setIntField(term225285, term225285.getClass(), "y", 0);
        setIntField(term225285, term225285.getClass(), "width", 0);
        setIntField(term225285, term225285.getClass(), "height", 0);
        setField(term225285, term225285.getClass(), "foreground", null);
        setField(term225285, term225285.getClass(), "background", null);
        setField(term225285, term225285.getClass(), "font", null);
        setField(term225285, term225285.getClass(), "peerFont", null);
        setField(term225285, term225285.getClass(), "cursor", null);
        setField(term225285, term225285.getClass(), "locale", null);
        setField(term225285, term225285.getClass(), "graphicsConfig", null);
        setField(term225285, term225285.getClass(), "bufferStrategy", null);
        setBooleanField(term225285, term225285.getClass(), "ignoreRepaint", false);
        setBooleanField(term225285, term225285.getClass(), "visible", false);
        setBooleanField(term225285, term225285.getClass(), "enabled", false);
        setBooleanField(term225285, term225285.getClass(), "valid", false);
        setField(term225285, term225285.getClass(), "dropTarget", null);
        setField(term225285, term225285.getClass(), "popups", null);
        setField(term225285, term225285.getClass(), "name", null);
        setBooleanField(term225285, term225285.getClass(), "nameExplicitlySet", false);
        setBooleanField(term225285, term225285.getClass(), "focusable", false);
        setIntField(term225285, term225285.getClass(), "isFocusTraversableOverridden", 0);
        setField(term225285, term225285.getClass(), "focusTraversalKeys", null);
        setBooleanField(term225285, term225285.getClass(), "focusTraversalKeysEnabled", false);
        setField(term225285, term225285.getClass(), "acc", null);
        setField(term225285, term225285.getClass(), "minSize", null);
        setBooleanField(term225285, term225285.getClass(), "minSizeSet", false);
        setField(term225285, term225285.getClass(), "prefSize", null);
        setBooleanField(term225285, term225285.getClass(), "prefSizeSet", false);
        setField(term225285, term225285.getClass(), "maxSize", null);
        setBooleanField(term225285, term225285.getClass(), "maxSizeSet", false);
        setField(term225285, term225285.getClass(), "componentOrientation", null);
        setBooleanField(term225285, term225285.getClass(), "newEventsOnly", false);
        setField(term225285, term225285.getClass(), "componentListener", null);
        setField(term225285, term225285.getClass(), "focusListener", null);
        setField(term225285, term225285.getClass(), "hierarchyListener", null);
        setField(term225285, term225285.getClass(), "hierarchyBoundsListener", null);
        setField(term225285, term225285.getClass(), "keyListener", null);
        setField(term225285, term225285.getClass(), "mouseListener", null);
        setField(term225285, term225285.getClass(), "mouseMotionListener", null);
        setField(term225285, term225285.getClass(), "mouseWheelListener", null);
        setField(term225285, term225285.getClass(), "inputMethodListener", null);
        setLongField(term225285, term225285.getClass(), "eventMask", 0L);
        setField(term225285, term225285.getClass(), "changeSupport", null);
        setField(term225285, term225285.getClass(), "objectLock", null);
        setBooleanField(term225285, term225285.getClass(), "isPacked", false);
        setIntField(term225285, term225285.getClass(), "boundsOp", 0);
        setField(term225285, term225285.getClass(), "compoundShape", null);
        setField(term225285, term225285.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term225285, term225285.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term225285, term225285.getClass(), "backgroundEraseDisabled", false);
        setField(term225285, term225285.getClass(), "eventCache", null);
        setBooleanField(term225285, term225285.getClass(), "coalescingEnabled", false);
        setBooleanField(term225285, term225285.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term225285, term225285.getClass(), "componentSerializedDataVersion", 0);
        setField(term225285, term225285.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBridgeId", argTypes, term225285, args);
    }

};


