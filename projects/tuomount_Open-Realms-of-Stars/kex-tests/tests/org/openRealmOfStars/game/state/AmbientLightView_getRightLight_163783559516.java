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

public class AmbientLightView_getRightLight_163783559516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205024;

    public AmbientLightView_getRightLight_163783559516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205024 = newInstance(Class.forName("org.openRealmOfStars.game.state.AmbientLightView"));
        setField(term205024, term205024.getClass(), "hostnameField", null);
        setField(term205024, term205024.getClass(), "usernameField", null);
        setField(term205024, term205024.getClass(), "connectBtn", null);
        setField(term205024, term205024.getClass(), "infoText", null);
        setField(term205024, term205024.getClass(), "listOfDevices", null);
        setField(term205024, term205024.getClass(), "centerLightSelection", null);
        setField(term205024, term205024.getClass(), "leftLightSelection", null);
        setField(term205024, term205024.getClass(), "rightLightSelection", null);
        setField(term205024, term205024.getClass(), "effectSelection", null);
        setField(term205024, term205024.getClass(), "ambientLightsBox", null);
        setField(term205024, term205024.getClass(), "lightsSlider", null);
        setField(term205024, term205024.getClass(), "bridge", null);
        setBooleanField(term205024, term205024.getClass(), "lightListUpdated", false);
        setBooleanField(term205024, term205024.getClass(), "justScanned", false);
        setBooleanField(term205024, term205024.getClass(), "isAlignmentXSet", false);
        setFloatField(term205024, term205024.getClass(), "alignmentX", 0.0F);
        setBooleanField(term205024, term205024.getClass(), "isAlignmentYSet", false);
        setFloatField(term205024, term205024.getClass(), "alignmentY", 0.0F);
        setField(term205024, term205024.getClass(), "ui", null);
        setField(term205024, term205024.getClass(), "listenerList", null);
        setField(term205024, term205024.getClass(), "clientProperties", null);
        setField(term205024, term205024.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term205024, term205024.getClass(), "autoscrolls", false);
        setField(term205024, term205024.getClass(), "border", null);
        setIntField(term205024, term205024.getClass(), "flags", 0);
        setField(term205024, term205024.getClass(), "inputVerifier", null);
        setBooleanField(term205024, term205024.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term205024, term205024.getClass(), "paintingChild", null);
        setField(term205024, term205024.getClass(), "popupMenu", null);
        setField(term205024, term205024.getClass(), "revalidateRunnableScheduled", null);
        setField(term205024, term205024.getClass(), "focusInputMap", null);
        setField(term205024, term205024.getClass(), "ancestorInputMap", null);
        setField(term205024, term205024.getClass(), "windowInputMap", null);
        setField(term205024, term205024.getClass(), "actionMap", null);
        setField(term205024, term205024.getClass(), "aaHint", null);
        setField(term205024, term205024.getClass(), "lcdRenderingHint", null);
        setField(term205024, term205024.getClass(), "component", null);
        setField(term205024, term205024.getClass(), "layoutMgr", null);
        setField(term205024, term205024.getClass(), "dispatcher", null);
        setField(term205024, term205024.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term205024, term205024.getClass(), "focusCycleRoot", false);
        setBooleanField(term205024, term205024.getClass(), "focusTraversalPolicyProvider", false);
        setField(term205024, term205024.getClass(), "printingThreads", null);
        setBooleanField(term205024, term205024.getClass(), "printing", false);
        setField(term205024, term205024.getClass(), "containerListener", null);
        setIntField(term205024, term205024.getClass(), "listeningChildren", 0);
        setIntField(term205024, term205024.getClass(), "listeningBoundsChildren", 0);
        setIntField(term205024, term205024.getClass(), "descendantsCount", 0);
        setField(term205024, term205024.getClass(), "preserveBackgroundColor", null);
        setIntField(term205024, term205024.getClass(), "numOfHWComponents", 0);
        setIntField(term205024, term205024.getClass(), "numOfLWComponents", 0);
        setField(term205024, term205024.getClass(), "modalComp", null);
        setField(term205024, term205024.getClass(), "modalAppContext", null);
        setIntField(term205024, term205024.getClass(), "containerSerializedDataVersion", 0);
        setField(term205024, term205024.getClass(), "peer", null);
        setField(term205024, term205024.getClass(), "parent", null);
        setField(term205024, term205024.getClass(), "appContext", null);
        setIntField(term205024, term205024.getClass(), "x", 0);
        setIntField(term205024, term205024.getClass(), "y", 0);
        setIntField(term205024, term205024.getClass(), "width", 0);
        setIntField(term205024, term205024.getClass(), "height", 0);
        setField(term205024, term205024.getClass(), "foreground", null);
        setField(term205024, term205024.getClass(), "background", null);
        setField(term205024, term205024.getClass(), "font", null);
        setField(term205024, term205024.getClass(), "peerFont", null);
        setField(term205024, term205024.getClass(), "cursor", null);
        setField(term205024, term205024.getClass(), "locale", null);
        setField(term205024, term205024.getClass(), "graphicsConfig", null);
        setField(term205024, term205024.getClass(), "bufferStrategy", null);
        setBooleanField(term205024, term205024.getClass(), "ignoreRepaint", false);
        setBooleanField(term205024, term205024.getClass(), "visible", false);
        setBooleanField(term205024, term205024.getClass(), "enabled", false);
        setBooleanField(term205024, term205024.getClass(), "valid", false);
        setField(term205024, term205024.getClass(), "dropTarget", null);
        setField(term205024, term205024.getClass(), "popups", null);
        setField(term205024, term205024.getClass(), "name", null);
        setBooleanField(term205024, term205024.getClass(), "nameExplicitlySet", false);
        setBooleanField(term205024, term205024.getClass(), "focusable", false);
        setIntField(term205024, term205024.getClass(), "isFocusTraversableOverridden", 0);
        setField(term205024, term205024.getClass(), "focusTraversalKeys", null);
        setBooleanField(term205024, term205024.getClass(), "focusTraversalKeysEnabled", false);
        setField(term205024, term205024.getClass(), "acc", null);
        setField(term205024, term205024.getClass(), "minSize", null);
        setBooleanField(term205024, term205024.getClass(), "minSizeSet", false);
        setField(term205024, term205024.getClass(), "prefSize", null);
        setBooleanField(term205024, term205024.getClass(), "prefSizeSet", false);
        setField(term205024, term205024.getClass(), "maxSize", null);
        setBooleanField(term205024, term205024.getClass(), "maxSizeSet", false);
        setField(term205024, term205024.getClass(), "componentOrientation", null);
        setBooleanField(term205024, term205024.getClass(), "newEventsOnly", false);
        setField(term205024, term205024.getClass(), "componentListener", null);
        setField(term205024, term205024.getClass(), "focusListener", null);
        setField(term205024, term205024.getClass(), "hierarchyListener", null);
        setField(term205024, term205024.getClass(), "hierarchyBoundsListener", null);
        setField(term205024, term205024.getClass(), "keyListener", null);
        setField(term205024, term205024.getClass(), "mouseListener", null);
        setField(term205024, term205024.getClass(), "mouseMotionListener", null);
        setField(term205024, term205024.getClass(), "mouseWheelListener", null);
        setField(term205024, term205024.getClass(), "inputMethodListener", null);
        setLongField(term205024, term205024.getClass(), "eventMask", 0L);
        setField(term205024, term205024.getClass(), "changeSupport", null);
        setField(term205024, term205024.getClass(), "objectLock", null);
        setBooleanField(term205024, term205024.getClass(), "isPacked", false);
        setIntField(term205024, term205024.getClass(), "boundsOp", 0);
        setField(term205024, term205024.getClass(), "compoundShape", null);
        setField(term205024, term205024.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term205024, term205024.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term205024, term205024.getClass(), "backgroundEraseDisabled", false);
        setField(term205024, term205024.getClass(), "eventCache", null);
        setBooleanField(term205024, term205024.getClass(), "coalescingEnabled", false);
        setBooleanField(term205024, term205024.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term205024, term205024.getClass(), "componentSerializedDataVersion", 0);
        setField(term205024, term205024.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AmbientLightView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRightLight", argTypes, term205024, args);
    }

};


