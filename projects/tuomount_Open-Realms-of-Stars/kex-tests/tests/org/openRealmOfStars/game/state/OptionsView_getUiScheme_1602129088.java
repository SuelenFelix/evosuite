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

public class OptionsView_getUiScheme_1602129088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943151;

    public OptionsView_getUiScheme_1602129088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943151 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term943151, term943151.getClass(), "game", null);
        setField(term943151, term943151.getClass(), "fullscreenBox", null);
        setField(term943151, term943151.getClass(), "hardwareAccelerationBox", null);
        setField(term943151, term943151.getClass(), "improvedParallaxBox", null);
        setField(term943151, term943151.getClass(), "resolutionSelection", null);
        setField(term943151, term943151.getClass(), "uiSchemeSelection", null);
        setField(term943151, term943151.getClass(), "musicSlider", null);
        setField(term943151, term943151.getClass(), "soundSlider", null);
        setField(term943151, term943151.getClass(), "borderlessBox", null);
        setField(term943151, term943151.getClass(), "largerFontsBox", null);
        setField(term943151, term943151.getClass(), "ambientLightsBox", null);
        setField(term943151, term943151.getClass(), "lightsSlider", null);
        setBooleanField(term943151, term943151.getClass(), "resized", false);
        setField(term943151, term943151.getClass(), "borderScrollingBox", null);
        setField(term943151, term943151.getClass(), "showMinimapBox", null);
        setField(term943151, term943151.getClass(), "highContrastGridBox", null);
        setBooleanField(term943151, term943151.getClass(), "isAlignmentXSet", false);
        setFloatField(term943151, term943151.getClass(), "alignmentX", 0.0F);
        setBooleanField(term943151, term943151.getClass(), "isAlignmentYSet", false);
        setFloatField(term943151, term943151.getClass(), "alignmentY", 0.0F);
        setField(term943151, term943151.getClass(), "ui", null);
        setField(term943151, term943151.getClass(), "listenerList", null);
        setField(term943151, term943151.getClass(), "clientProperties", null);
        setField(term943151, term943151.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term943151, term943151.getClass(), "autoscrolls", false);
        setField(term943151, term943151.getClass(), "border", null);
        setIntField(term943151, term943151.getClass(), "flags", 0);
        setField(term943151, term943151.getClass(), "inputVerifier", null);
        setBooleanField(term943151, term943151.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term943151, term943151.getClass(), "paintingChild", null);
        setField(term943151, term943151.getClass(), "popupMenu", null);
        setField(term943151, term943151.getClass(), "revalidateRunnableScheduled", null);
        setField(term943151, term943151.getClass(), "focusInputMap", null);
        setField(term943151, term943151.getClass(), "ancestorInputMap", null);
        setField(term943151, term943151.getClass(), "windowInputMap", null);
        setField(term943151, term943151.getClass(), "actionMap", null);
        setField(term943151, term943151.getClass(), "aaHint", null);
        setField(term943151, term943151.getClass(), "lcdRenderingHint", null);
        setField(term943151, term943151.getClass(), "component", null);
        setField(term943151, term943151.getClass(), "layoutMgr", null);
        setField(term943151, term943151.getClass(), "dispatcher", null);
        setField(term943151, term943151.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term943151, term943151.getClass(), "focusCycleRoot", false);
        setBooleanField(term943151, term943151.getClass(), "focusTraversalPolicyProvider", false);
        setField(term943151, term943151.getClass(), "printingThreads", null);
        setBooleanField(term943151, term943151.getClass(), "printing", false);
        setField(term943151, term943151.getClass(), "containerListener", null);
        setIntField(term943151, term943151.getClass(), "listeningChildren", 0);
        setIntField(term943151, term943151.getClass(), "listeningBoundsChildren", 0);
        setIntField(term943151, term943151.getClass(), "descendantsCount", 0);
        setField(term943151, term943151.getClass(), "preserveBackgroundColor", null);
        setIntField(term943151, term943151.getClass(), "numOfHWComponents", 0);
        setIntField(term943151, term943151.getClass(), "numOfLWComponents", 0);
        setField(term943151, term943151.getClass(), "modalComp", null);
        setField(term943151, term943151.getClass(), "modalAppContext", null);
        setIntField(term943151, term943151.getClass(), "containerSerializedDataVersion", 0);
        setField(term943151, term943151.getClass(), "peer", null);
        setField(term943151, term943151.getClass(), "parent", null);
        setField(term943151, term943151.getClass(), "appContext", null);
        setIntField(term943151, term943151.getClass(), "x", 0);
        setIntField(term943151, term943151.getClass(), "y", 0);
        setIntField(term943151, term943151.getClass(), "width", 0);
        setIntField(term943151, term943151.getClass(), "height", 0);
        setField(term943151, term943151.getClass(), "foreground", null);
        setField(term943151, term943151.getClass(), "background", null);
        setField(term943151, term943151.getClass(), "font", null);
        setField(term943151, term943151.getClass(), "peerFont", null);
        setField(term943151, term943151.getClass(), "cursor", null);
        setField(term943151, term943151.getClass(), "locale", null);
        setField(term943151, term943151.getClass(), "graphicsConfig", null);
        setField(term943151, term943151.getClass(), "bufferStrategy", null);
        setBooleanField(term943151, term943151.getClass(), "ignoreRepaint", false);
        setBooleanField(term943151, term943151.getClass(), "visible", false);
        setBooleanField(term943151, term943151.getClass(), "enabled", false);
        setBooleanField(term943151, term943151.getClass(), "valid", false);
        setField(term943151, term943151.getClass(), "dropTarget", null);
        setField(term943151, term943151.getClass(), "popups", null);
        setField(term943151, term943151.getClass(), "name", null);
        setBooleanField(term943151, term943151.getClass(), "nameExplicitlySet", false);
        setBooleanField(term943151, term943151.getClass(), "focusable", false);
        setIntField(term943151, term943151.getClass(), "isFocusTraversableOverridden", 0);
        setField(term943151, term943151.getClass(), "focusTraversalKeys", null);
        setBooleanField(term943151, term943151.getClass(), "focusTraversalKeysEnabled", false);
        setField(term943151, term943151.getClass(), "acc", null);
        setField(term943151, term943151.getClass(), "minSize", null);
        setBooleanField(term943151, term943151.getClass(), "minSizeSet", false);
        setField(term943151, term943151.getClass(), "prefSize", null);
        setBooleanField(term943151, term943151.getClass(), "prefSizeSet", false);
        setField(term943151, term943151.getClass(), "maxSize", null);
        setBooleanField(term943151, term943151.getClass(), "maxSizeSet", false);
        setField(term943151, term943151.getClass(), "componentOrientation", null);
        setBooleanField(term943151, term943151.getClass(), "newEventsOnly", false);
        setField(term943151, term943151.getClass(), "componentListener", null);
        setField(term943151, term943151.getClass(), "focusListener", null);
        setField(term943151, term943151.getClass(), "hierarchyListener", null);
        setField(term943151, term943151.getClass(), "hierarchyBoundsListener", null);
        setField(term943151, term943151.getClass(), "keyListener", null);
        setField(term943151, term943151.getClass(), "mouseListener", null);
        setField(term943151, term943151.getClass(), "mouseMotionListener", null);
        setField(term943151, term943151.getClass(), "mouseWheelListener", null);
        setField(term943151, term943151.getClass(), "inputMethodListener", null);
        setLongField(term943151, term943151.getClass(), "eventMask", 0L);
        setField(term943151, term943151.getClass(), "changeSupport", null);
        setField(term943151, term943151.getClass(), "objectLock", null);
        setBooleanField(term943151, term943151.getClass(), "isPacked", false);
        setIntField(term943151, term943151.getClass(), "boundsOp", 0);
        setField(term943151, term943151.getClass(), "compoundShape", null);
        setField(term943151, term943151.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term943151, term943151.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term943151, term943151.getClass(), "backgroundEraseDisabled", false);
        setField(term943151, term943151.getClass(), "eventCache", null);
        setBooleanField(term943151, term943151.getClass(), "coalescingEnabled", false);
        setBooleanField(term943151, term943151.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term943151, term943151.getClass(), "componentSerializedDataVersion", 0);
        setField(term943151, term943151.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUiScheme", argTypes, term943151, args);
    }

};


