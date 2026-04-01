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

public class OptionsView_getHardwareAcceleration_171637173420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term969024;

    public OptionsView_getHardwareAcceleration_171637173420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term969024 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term969024, term969024.getClass(), "game", null);
        setField(term969024, term969024.getClass(), "fullscreenBox", null);
        setField(term969024, term969024.getClass(), "hardwareAccelerationBox", null);
        setField(term969024, term969024.getClass(), "improvedParallaxBox", null);
        setField(term969024, term969024.getClass(), "resolutionSelection", null);
        setField(term969024, term969024.getClass(), "uiSchemeSelection", null);
        setField(term969024, term969024.getClass(), "musicSlider", null);
        setField(term969024, term969024.getClass(), "soundSlider", null);
        setField(term969024, term969024.getClass(), "borderlessBox", null);
        setField(term969024, term969024.getClass(), "largerFontsBox", null);
        setField(term969024, term969024.getClass(), "ambientLightsBox", null);
        setField(term969024, term969024.getClass(), "lightsSlider", null);
        setBooleanField(term969024, term969024.getClass(), "resized", false);
        setField(term969024, term969024.getClass(), "borderScrollingBox", null);
        setField(term969024, term969024.getClass(), "showMinimapBox", null);
        setField(term969024, term969024.getClass(), "highContrastGridBox", null);
        setBooleanField(term969024, term969024.getClass(), "isAlignmentXSet", false);
        setFloatField(term969024, term969024.getClass(), "alignmentX", 0.0F);
        setBooleanField(term969024, term969024.getClass(), "isAlignmentYSet", false);
        setFloatField(term969024, term969024.getClass(), "alignmentY", 0.0F);
        setField(term969024, term969024.getClass(), "ui", null);
        setField(term969024, term969024.getClass(), "listenerList", null);
        setField(term969024, term969024.getClass(), "clientProperties", null);
        setField(term969024, term969024.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term969024, term969024.getClass(), "autoscrolls", false);
        setField(term969024, term969024.getClass(), "border", null);
        setIntField(term969024, term969024.getClass(), "flags", 0);
        setField(term969024, term969024.getClass(), "inputVerifier", null);
        setBooleanField(term969024, term969024.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term969024, term969024.getClass(), "paintingChild", null);
        setField(term969024, term969024.getClass(), "popupMenu", null);
        setField(term969024, term969024.getClass(), "revalidateRunnableScheduled", null);
        setField(term969024, term969024.getClass(), "focusInputMap", null);
        setField(term969024, term969024.getClass(), "ancestorInputMap", null);
        setField(term969024, term969024.getClass(), "windowInputMap", null);
        setField(term969024, term969024.getClass(), "actionMap", null);
        setField(term969024, term969024.getClass(), "aaHint", null);
        setField(term969024, term969024.getClass(), "lcdRenderingHint", null);
        setField(term969024, term969024.getClass(), "component", null);
        setField(term969024, term969024.getClass(), "layoutMgr", null);
        setField(term969024, term969024.getClass(), "dispatcher", null);
        setField(term969024, term969024.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term969024, term969024.getClass(), "focusCycleRoot", false);
        setBooleanField(term969024, term969024.getClass(), "focusTraversalPolicyProvider", false);
        setField(term969024, term969024.getClass(), "printingThreads", null);
        setBooleanField(term969024, term969024.getClass(), "printing", false);
        setField(term969024, term969024.getClass(), "containerListener", null);
        setIntField(term969024, term969024.getClass(), "listeningChildren", 0);
        setIntField(term969024, term969024.getClass(), "listeningBoundsChildren", 0);
        setIntField(term969024, term969024.getClass(), "descendantsCount", 0);
        setField(term969024, term969024.getClass(), "preserveBackgroundColor", null);
        setIntField(term969024, term969024.getClass(), "numOfHWComponents", 0);
        setIntField(term969024, term969024.getClass(), "numOfLWComponents", 0);
        setField(term969024, term969024.getClass(), "modalComp", null);
        setField(term969024, term969024.getClass(), "modalAppContext", null);
        setIntField(term969024, term969024.getClass(), "containerSerializedDataVersion", 0);
        setField(term969024, term969024.getClass(), "peer", null);
        setField(term969024, term969024.getClass(), "parent", null);
        setField(term969024, term969024.getClass(), "appContext", null);
        setIntField(term969024, term969024.getClass(), "x", 0);
        setIntField(term969024, term969024.getClass(), "y", 0);
        setIntField(term969024, term969024.getClass(), "width", 0);
        setIntField(term969024, term969024.getClass(), "height", 0);
        setField(term969024, term969024.getClass(), "foreground", null);
        setField(term969024, term969024.getClass(), "background", null);
        setField(term969024, term969024.getClass(), "font", null);
        setField(term969024, term969024.getClass(), "peerFont", null);
        setField(term969024, term969024.getClass(), "cursor", null);
        setField(term969024, term969024.getClass(), "locale", null);
        setField(term969024, term969024.getClass(), "graphicsConfig", null);
        setField(term969024, term969024.getClass(), "bufferStrategy", null);
        setBooleanField(term969024, term969024.getClass(), "ignoreRepaint", false);
        setBooleanField(term969024, term969024.getClass(), "visible", false);
        setBooleanField(term969024, term969024.getClass(), "enabled", false);
        setBooleanField(term969024, term969024.getClass(), "valid", false);
        setField(term969024, term969024.getClass(), "dropTarget", null);
        setField(term969024, term969024.getClass(), "popups", null);
        setField(term969024, term969024.getClass(), "name", null);
        setBooleanField(term969024, term969024.getClass(), "nameExplicitlySet", false);
        setBooleanField(term969024, term969024.getClass(), "focusable", false);
        setIntField(term969024, term969024.getClass(), "isFocusTraversableOverridden", 0);
        setField(term969024, term969024.getClass(), "focusTraversalKeys", null);
        setBooleanField(term969024, term969024.getClass(), "focusTraversalKeysEnabled", false);
        setField(term969024, term969024.getClass(), "acc", null);
        setField(term969024, term969024.getClass(), "minSize", null);
        setBooleanField(term969024, term969024.getClass(), "minSizeSet", false);
        setField(term969024, term969024.getClass(), "prefSize", null);
        setBooleanField(term969024, term969024.getClass(), "prefSizeSet", false);
        setField(term969024, term969024.getClass(), "maxSize", null);
        setBooleanField(term969024, term969024.getClass(), "maxSizeSet", false);
        setField(term969024, term969024.getClass(), "componentOrientation", null);
        setBooleanField(term969024, term969024.getClass(), "newEventsOnly", false);
        setField(term969024, term969024.getClass(), "componentListener", null);
        setField(term969024, term969024.getClass(), "focusListener", null);
        setField(term969024, term969024.getClass(), "hierarchyListener", null);
        setField(term969024, term969024.getClass(), "hierarchyBoundsListener", null);
        setField(term969024, term969024.getClass(), "keyListener", null);
        setField(term969024, term969024.getClass(), "mouseListener", null);
        setField(term969024, term969024.getClass(), "mouseMotionListener", null);
        setField(term969024, term969024.getClass(), "mouseWheelListener", null);
        setField(term969024, term969024.getClass(), "inputMethodListener", null);
        setLongField(term969024, term969024.getClass(), "eventMask", 0L);
        setField(term969024, term969024.getClass(), "changeSupport", null);
        setField(term969024, term969024.getClass(), "objectLock", null);
        setBooleanField(term969024, term969024.getClass(), "isPacked", false);
        setIntField(term969024, term969024.getClass(), "boundsOp", 0);
        setField(term969024, term969024.getClass(), "compoundShape", null);
        setField(term969024, term969024.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term969024, term969024.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term969024, term969024.getClass(), "backgroundEraseDisabled", false);
        setField(term969024, term969024.getClass(), "eventCache", null);
        setBooleanField(term969024, term969024.getClass(), "coalescingEnabled", false);
        setBooleanField(term969024, term969024.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term969024, term969024.getClass(), "componentSerializedDataVersion", 0);
        setField(term969024, term969024.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHardwareAcceleration", argTypes, term969024, args);
    }

};


