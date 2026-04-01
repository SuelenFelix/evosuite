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

public class OptionsView_getFullscreen_122689255316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term960351;

    public OptionsView_getFullscreen_122689255316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term960351 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term960351, term960351.getClass(), "game", null);
        setField(term960351, term960351.getClass(), "fullscreenBox", null);
        setField(term960351, term960351.getClass(), "hardwareAccelerationBox", null);
        setField(term960351, term960351.getClass(), "improvedParallaxBox", null);
        setField(term960351, term960351.getClass(), "resolutionSelection", null);
        setField(term960351, term960351.getClass(), "uiSchemeSelection", null);
        setField(term960351, term960351.getClass(), "musicSlider", null);
        setField(term960351, term960351.getClass(), "soundSlider", null);
        setField(term960351, term960351.getClass(), "borderlessBox", null);
        setField(term960351, term960351.getClass(), "largerFontsBox", null);
        setField(term960351, term960351.getClass(), "ambientLightsBox", null);
        setField(term960351, term960351.getClass(), "lightsSlider", null);
        setBooleanField(term960351, term960351.getClass(), "resized", false);
        setField(term960351, term960351.getClass(), "borderScrollingBox", null);
        setField(term960351, term960351.getClass(), "showMinimapBox", null);
        setField(term960351, term960351.getClass(), "highContrastGridBox", null);
        setBooleanField(term960351, term960351.getClass(), "isAlignmentXSet", false);
        setFloatField(term960351, term960351.getClass(), "alignmentX", 0.0F);
        setBooleanField(term960351, term960351.getClass(), "isAlignmentYSet", false);
        setFloatField(term960351, term960351.getClass(), "alignmentY", 0.0F);
        setField(term960351, term960351.getClass(), "ui", null);
        setField(term960351, term960351.getClass(), "listenerList", null);
        setField(term960351, term960351.getClass(), "clientProperties", null);
        setField(term960351, term960351.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term960351, term960351.getClass(), "autoscrolls", false);
        setField(term960351, term960351.getClass(), "border", null);
        setIntField(term960351, term960351.getClass(), "flags", 0);
        setField(term960351, term960351.getClass(), "inputVerifier", null);
        setBooleanField(term960351, term960351.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term960351, term960351.getClass(), "paintingChild", null);
        setField(term960351, term960351.getClass(), "popupMenu", null);
        setField(term960351, term960351.getClass(), "revalidateRunnableScheduled", null);
        setField(term960351, term960351.getClass(), "focusInputMap", null);
        setField(term960351, term960351.getClass(), "ancestorInputMap", null);
        setField(term960351, term960351.getClass(), "windowInputMap", null);
        setField(term960351, term960351.getClass(), "actionMap", null);
        setField(term960351, term960351.getClass(), "aaHint", null);
        setField(term960351, term960351.getClass(), "lcdRenderingHint", null);
        setField(term960351, term960351.getClass(), "component", null);
        setField(term960351, term960351.getClass(), "layoutMgr", null);
        setField(term960351, term960351.getClass(), "dispatcher", null);
        setField(term960351, term960351.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term960351, term960351.getClass(), "focusCycleRoot", false);
        setBooleanField(term960351, term960351.getClass(), "focusTraversalPolicyProvider", false);
        setField(term960351, term960351.getClass(), "printingThreads", null);
        setBooleanField(term960351, term960351.getClass(), "printing", false);
        setField(term960351, term960351.getClass(), "containerListener", null);
        setIntField(term960351, term960351.getClass(), "listeningChildren", 0);
        setIntField(term960351, term960351.getClass(), "listeningBoundsChildren", 0);
        setIntField(term960351, term960351.getClass(), "descendantsCount", 0);
        setField(term960351, term960351.getClass(), "preserveBackgroundColor", null);
        setIntField(term960351, term960351.getClass(), "numOfHWComponents", 0);
        setIntField(term960351, term960351.getClass(), "numOfLWComponents", 0);
        setField(term960351, term960351.getClass(), "modalComp", null);
        setField(term960351, term960351.getClass(), "modalAppContext", null);
        setIntField(term960351, term960351.getClass(), "containerSerializedDataVersion", 0);
        setField(term960351, term960351.getClass(), "peer", null);
        setField(term960351, term960351.getClass(), "parent", null);
        setField(term960351, term960351.getClass(), "appContext", null);
        setIntField(term960351, term960351.getClass(), "x", 0);
        setIntField(term960351, term960351.getClass(), "y", 0);
        setIntField(term960351, term960351.getClass(), "width", 0);
        setIntField(term960351, term960351.getClass(), "height", 0);
        setField(term960351, term960351.getClass(), "foreground", null);
        setField(term960351, term960351.getClass(), "background", null);
        setField(term960351, term960351.getClass(), "font", null);
        setField(term960351, term960351.getClass(), "peerFont", null);
        setField(term960351, term960351.getClass(), "cursor", null);
        setField(term960351, term960351.getClass(), "locale", null);
        setField(term960351, term960351.getClass(), "graphicsConfig", null);
        setField(term960351, term960351.getClass(), "bufferStrategy", null);
        setBooleanField(term960351, term960351.getClass(), "ignoreRepaint", false);
        setBooleanField(term960351, term960351.getClass(), "visible", false);
        setBooleanField(term960351, term960351.getClass(), "enabled", false);
        setBooleanField(term960351, term960351.getClass(), "valid", false);
        setField(term960351, term960351.getClass(), "dropTarget", null);
        setField(term960351, term960351.getClass(), "popups", null);
        setField(term960351, term960351.getClass(), "name", null);
        setBooleanField(term960351, term960351.getClass(), "nameExplicitlySet", false);
        setBooleanField(term960351, term960351.getClass(), "focusable", false);
        setIntField(term960351, term960351.getClass(), "isFocusTraversableOverridden", 0);
        setField(term960351, term960351.getClass(), "focusTraversalKeys", null);
        setBooleanField(term960351, term960351.getClass(), "focusTraversalKeysEnabled", false);
        setField(term960351, term960351.getClass(), "acc", null);
        setField(term960351, term960351.getClass(), "minSize", null);
        setBooleanField(term960351, term960351.getClass(), "minSizeSet", false);
        setField(term960351, term960351.getClass(), "prefSize", null);
        setBooleanField(term960351, term960351.getClass(), "prefSizeSet", false);
        setField(term960351, term960351.getClass(), "maxSize", null);
        setBooleanField(term960351, term960351.getClass(), "maxSizeSet", false);
        setField(term960351, term960351.getClass(), "componentOrientation", null);
        setBooleanField(term960351, term960351.getClass(), "newEventsOnly", false);
        setField(term960351, term960351.getClass(), "componentListener", null);
        setField(term960351, term960351.getClass(), "focusListener", null);
        setField(term960351, term960351.getClass(), "hierarchyListener", null);
        setField(term960351, term960351.getClass(), "hierarchyBoundsListener", null);
        setField(term960351, term960351.getClass(), "keyListener", null);
        setField(term960351, term960351.getClass(), "mouseListener", null);
        setField(term960351, term960351.getClass(), "mouseMotionListener", null);
        setField(term960351, term960351.getClass(), "mouseWheelListener", null);
        setField(term960351, term960351.getClass(), "inputMethodListener", null);
        setLongField(term960351, term960351.getClass(), "eventMask", 0L);
        setField(term960351, term960351.getClass(), "changeSupport", null);
        setField(term960351, term960351.getClass(), "objectLock", null);
        setBooleanField(term960351, term960351.getClass(), "isPacked", false);
        setIntField(term960351, term960351.getClass(), "boundsOp", 0);
        setField(term960351, term960351.getClass(), "compoundShape", null);
        setField(term960351, term960351.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term960351, term960351.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term960351, term960351.getClass(), "backgroundEraseDisabled", false);
        setField(term960351, term960351.getClass(), "eventCache", null);
        setBooleanField(term960351, term960351.getClass(), "coalescingEnabled", false);
        setBooleanField(term960351, term960351.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term960351, term960351.getClass(), "componentSerializedDataVersion", 0);
        setField(term960351, term960351.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullscreen", argTypes, term960351, args);
    }

};


