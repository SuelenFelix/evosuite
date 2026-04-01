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

public class OptionsView_getResolution_7128680316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term938803;

    public OptionsView_getResolution_7128680316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term938803 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term938803, term938803.getClass(), "game", null);
        setField(term938803, term938803.getClass(), "fullscreenBox", null);
        setField(term938803, term938803.getClass(), "hardwareAccelerationBox", null);
        setField(term938803, term938803.getClass(), "improvedParallaxBox", null);
        setField(term938803, term938803.getClass(), "resolutionSelection", null);
        setField(term938803, term938803.getClass(), "uiSchemeSelection", null);
        setField(term938803, term938803.getClass(), "musicSlider", null);
        setField(term938803, term938803.getClass(), "soundSlider", null);
        setField(term938803, term938803.getClass(), "borderlessBox", null);
        setField(term938803, term938803.getClass(), "largerFontsBox", null);
        setField(term938803, term938803.getClass(), "ambientLightsBox", null);
        setField(term938803, term938803.getClass(), "lightsSlider", null);
        setBooleanField(term938803, term938803.getClass(), "resized", false);
        setField(term938803, term938803.getClass(), "borderScrollingBox", null);
        setField(term938803, term938803.getClass(), "showMinimapBox", null);
        setField(term938803, term938803.getClass(), "highContrastGridBox", null);
        setBooleanField(term938803, term938803.getClass(), "isAlignmentXSet", false);
        setFloatField(term938803, term938803.getClass(), "alignmentX", 0.0F);
        setBooleanField(term938803, term938803.getClass(), "isAlignmentYSet", false);
        setFloatField(term938803, term938803.getClass(), "alignmentY", 0.0F);
        setField(term938803, term938803.getClass(), "ui", null);
        setField(term938803, term938803.getClass(), "listenerList", null);
        setField(term938803, term938803.getClass(), "clientProperties", null);
        setField(term938803, term938803.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term938803, term938803.getClass(), "autoscrolls", false);
        setField(term938803, term938803.getClass(), "border", null);
        setIntField(term938803, term938803.getClass(), "flags", 0);
        setField(term938803, term938803.getClass(), "inputVerifier", null);
        setBooleanField(term938803, term938803.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term938803, term938803.getClass(), "paintingChild", null);
        setField(term938803, term938803.getClass(), "popupMenu", null);
        setField(term938803, term938803.getClass(), "revalidateRunnableScheduled", null);
        setField(term938803, term938803.getClass(), "focusInputMap", null);
        setField(term938803, term938803.getClass(), "ancestorInputMap", null);
        setField(term938803, term938803.getClass(), "windowInputMap", null);
        setField(term938803, term938803.getClass(), "actionMap", null);
        setField(term938803, term938803.getClass(), "aaHint", null);
        setField(term938803, term938803.getClass(), "lcdRenderingHint", null);
        setField(term938803, term938803.getClass(), "component", null);
        setField(term938803, term938803.getClass(), "layoutMgr", null);
        setField(term938803, term938803.getClass(), "dispatcher", null);
        setField(term938803, term938803.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term938803, term938803.getClass(), "focusCycleRoot", false);
        setBooleanField(term938803, term938803.getClass(), "focusTraversalPolicyProvider", false);
        setField(term938803, term938803.getClass(), "printingThreads", null);
        setBooleanField(term938803, term938803.getClass(), "printing", false);
        setField(term938803, term938803.getClass(), "containerListener", null);
        setIntField(term938803, term938803.getClass(), "listeningChildren", 0);
        setIntField(term938803, term938803.getClass(), "listeningBoundsChildren", 0);
        setIntField(term938803, term938803.getClass(), "descendantsCount", 0);
        setField(term938803, term938803.getClass(), "preserveBackgroundColor", null);
        setIntField(term938803, term938803.getClass(), "numOfHWComponents", 0);
        setIntField(term938803, term938803.getClass(), "numOfLWComponents", 0);
        setField(term938803, term938803.getClass(), "modalComp", null);
        setField(term938803, term938803.getClass(), "modalAppContext", null);
        setIntField(term938803, term938803.getClass(), "containerSerializedDataVersion", 0);
        setField(term938803, term938803.getClass(), "peer", null);
        setField(term938803, term938803.getClass(), "parent", null);
        setField(term938803, term938803.getClass(), "appContext", null);
        setIntField(term938803, term938803.getClass(), "x", 0);
        setIntField(term938803, term938803.getClass(), "y", 0);
        setIntField(term938803, term938803.getClass(), "width", 0);
        setIntField(term938803, term938803.getClass(), "height", 0);
        setField(term938803, term938803.getClass(), "foreground", null);
        setField(term938803, term938803.getClass(), "background", null);
        setField(term938803, term938803.getClass(), "font", null);
        setField(term938803, term938803.getClass(), "peerFont", null);
        setField(term938803, term938803.getClass(), "cursor", null);
        setField(term938803, term938803.getClass(), "locale", null);
        setField(term938803, term938803.getClass(), "graphicsConfig", null);
        setField(term938803, term938803.getClass(), "bufferStrategy", null);
        setBooleanField(term938803, term938803.getClass(), "ignoreRepaint", false);
        setBooleanField(term938803, term938803.getClass(), "visible", false);
        setBooleanField(term938803, term938803.getClass(), "enabled", false);
        setBooleanField(term938803, term938803.getClass(), "valid", false);
        setField(term938803, term938803.getClass(), "dropTarget", null);
        setField(term938803, term938803.getClass(), "popups", null);
        setField(term938803, term938803.getClass(), "name", null);
        setBooleanField(term938803, term938803.getClass(), "nameExplicitlySet", false);
        setBooleanField(term938803, term938803.getClass(), "focusable", false);
        setIntField(term938803, term938803.getClass(), "isFocusTraversableOverridden", 0);
        setField(term938803, term938803.getClass(), "focusTraversalKeys", null);
        setBooleanField(term938803, term938803.getClass(), "focusTraversalKeysEnabled", false);
        setField(term938803, term938803.getClass(), "acc", null);
        setField(term938803, term938803.getClass(), "minSize", null);
        setBooleanField(term938803, term938803.getClass(), "minSizeSet", false);
        setField(term938803, term938803.getClass(), "prefSize", null);
        setBooleanField(term938803, term938803.getClass(), "prefSizeSet", false);
        setField(term938803, term938803.getClass(), "maxSize", null);
        setBooleanField(term938803, term938803.getClass(), "maxSizeSet", false);
        setField(term938803, term938803.getClass(), "componentOrientation", null);
        setBooleanField(term938803, term938803.getClass(), "newEventsOnly", false);
        setField(term938803, term938803.getClass(), "componentListener", null);
        setField(term938803, term938803.getClass(), "focusListener", null);
        setField(term938803, term938803.getClass(), "hierarchyListener", null);
        setField(term938803, term938803.getClass(), "hierarchyBoundsListener", null);
        setField(term938803, term938803.getClass(), "keyListener", null);
        setField(term938803, term938803.getClass(), "mouseListener", null);
        setField(term938803, term938803.getClass(), "mouseMotionListener", null);
        setField(term938803, term938803.getClass(), "mouseWheelListener", null);
        setField(term938803, term938803.getClass(), "inputMethodListener", null);
        setLongField(term938803, term938803.getClass(), "eventMask", 0L);
        setField(term938803, term938803.getClass(), "changeSupport", null);
        setField(term938803, term938803.getClass(), "objectLock", null);
        setBooleanField(term938803, term938803.getClass(), "isPacked", false);
        setIntField(term938803, term938803.getClass(), "boundsOp", 0);
        setField(term938803, term938803.getClass(), "compoundShape", null);
        setField(term938803, term938803.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term938803, term938803.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term938803, term938803.getClass(), "backgroundEraseDisabled", false);
        setField(term938803, term938803.getClass(), "eventCache", null);
        setBooleanField(term938803, term938803.getClass(), "coalescingEnabled", false);
        setBooleanField(term938803, term938803.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term938803, term938803.getClass(), "componentSerializedDataVersion", 0);
        setField(term938803, term938803.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResolution", argTypes, term938803, args);
    }

};


