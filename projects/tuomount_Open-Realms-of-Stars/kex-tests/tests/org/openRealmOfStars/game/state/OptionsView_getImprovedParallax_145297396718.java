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

public class OptionsView_getImprovedParallax_145297396718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term964707;

    public OptionsView_getImprovedParallax_145297396718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term964707 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term964707, term964707.getClass(), "game", null);
        setField(term964707, term964707.getClass(), "fullscreenBox", null);
        setField(term964707, term964707.getClass(), "hardwareAccelerationBox", null);
        setField(term964707, term964707.getClass(), "improvedParallaxBox", null);
        setField(term964707, term964707.getClass(), "resolutionSelection", null);
        setField(term964707, term964707.getClass(), "uiSchemeSelection", null);
        setField(term964707, term964707.getClass(), "musicSlider", null);
        setField(term964707, term964707.getClass(), "soundSlider", null);
        setField(term964707, term964707.getClass(), "borderlessBox", null);
        setField(term964707, term964707.getClass(), "largerFontsBox", null);
        setField(term964707, term964707.getClass(), "ambientLightsBox", null);
        setField(term964707, term964707.getClass(), "lightsSlider", null);
        setBooleanField(term964707, term964707.getClass(), "resized", false);
        setField(term964707, term964707.getClass(), "borderScrollingBox", null);
        setField(term964707, term964707.getClass(), "showMinimapBox", null);
        setField(term964707, term964707.getClass(), "highContrastGridBox", null);
        setBooleanField(term964707, term964707.getClass(), "isAlignmentXSet", false);
        setFloatField(term964707, term964707.getClass(), "alignmentX", 0.0F);
        setBooleanField(term964707, term964707.getClass(), "isAlignmentYSet", false);
        setFloatField(term964707, term964707.getClass(), "alignmentY", 0.0F);
        setField(term964707, term964707.getClass(), "ui", null);
        setField(term964707, term964707.getClass(), "listenerList", null);
        setField(term964707, term964707.getClass(), "clientProperties", null);
        setField(term964707, term964707.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term964707, term964707.getClass(), "autoscrolls", false);
        setField(term964707, term964707.getClass(), "border", null);
        setIntField(term964707, term964707.getClass(), "flags", 0);
        setField(term964707, term964707.getClass(), "inputVerifier", null);
        setBooleanField(term964707, term964707.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term964707, term964707.getClass(), "paintingChild", null);
        setField(term964707, term964707.getClass(), "popupMenu", null);
        setField(term964707, term964707.getClass(), "revalidateRunnableScheduled", null);
        setField(term964707, term964707.getClass(), "focusInputMap", null);
        setField(term964707, term964707.getClass(), "ancestorInputMap", null);
        setField(term964707, term964707.getClass(), "windowInputMap", null);
        setField(term964707, term964707.getClass(), "actionMap", null);
        setField(term964707, term964707.getClass(), "aaHint", null);
        setField(term964707, term964707.getClass(), "lcdRenderingHint", null);
        setField(term964707, term964707.getClass(), "component", null);
        setField(term964707, term964707.getClass(), "layoutMgr", null);
        setField(term964707, term964707.getClass(), "dispatcher", null);
        setField(term964707, term964707.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term964707, term964707.getClass(), "focusCycleRoot", false);
        setBooleanField(term964707, term964707.getClass(), "focusTraversalPolicyProvider", false);
        setField(term964707, term964707.getClass(), "printingThreads", null);
        setBooleanField(term964707, term964707.getClass(), "printing", false);
        setField(term964707, term964707.getClass(), "containerListener", null);
        setIntField(term964707, term964707.getClass(), "listeningChildren", 0);
        setIntField(term964707, term964707.getClass(), "listeningBoundsChildren", 0);
        setIntField(term964707, term964707.getClass(), "descendantsCount", 0);
        setField(term964707, term964707.getClass(), "preserveBackgroundColor", null);
        setIntField(term964707, term964707.getClass(), "numOfHWComponents", 0);
        setIntField(term964707, term964707.getClass(), "numOfLWComponents", 0);
        setField(term964707, term964707.getClass(), "modalComp", null);
        setField(term964707, term964707.getClass(), "modalAppContext", null);
        setIntField(term964707, term964707.getClass(), "containerSerializedDataVersion", 0);
        setField(term964707, term964707.getClass(), "peer", null);
        setField(term964707, term964707.getClass(), "parent", null);
        setField(term964707, term964707.getClass(), "appContext", null);
        setIntField(term964707, term964707.getClass(), "x", 0);
        setIntField(term964707, term964707.getClass(), "y", 0);
        setIntField(term964707, term964707.getClass(), "width", 0);
        setIntField(term964707, term964707.getClass(), "height", 0);
        setField(term964707, term964707.getClass(), "foreground", null);
        setField(term964707, term964707.getClass(), "background", null);
        setField(term964707, term964707.getClass(), "font", null);
        setField(term964707, term964707.getClass(), "peerFont", null);
        setField(term964707, term964707.getClass(), "cursor", null);
        setField(term964707, term964707.getClass(), "locale", null);
        setField(term964707, term964707.getClass(), "graphicsConfig", null);
        setField(term964707, term964707.getClass(), "bufferStrategy", null);
        setBooleanField(term964707, term964707.getClass(), "ignoreRepaint", false);
        setBooleanField(term964707, term964707.getClass(), "visible", false);
        setBooleanField(term964707, term964707.getClass(), "enabled", false);
        setBooleanField(term964707, term964707.getClass(), "valid", false);
        setField(term964707, term964707.getClass(), "dropTarget", null);
        setField(term964707, term964707.getClass(), "popups", null);
        setField(term964707, term964707.getClass(), "name", null);
        setBooleanField(term964707, term964707.getClass(), "nameExplicitlySet", false);
        setBooleanField(term964707, term964707.getClass(), "focusable", false);
        setIntField(term964707, term964707.getClass(), "isFocusTraversableOverridden", 0);
        setField(term964707, term964707.getClass(), "focusTraversalKeys", null);
        setBooleanField(term964707, term964707.getClass(), "focusTraversalKeysEnabled", false);
        setField(term964707, term964707.getClass(), "acc", null);
        setField(term964707, term964707.getClass(), "minSize", null);
        setBooleanField(term964707, term964707.getClass(), "minSizeSet", false);
        setField(term964707, term964707.getClass(), "prefSize", null);
        setBooleanField(term964707, term964707.getClass(), "prefSizeSet", false);
        setField(term964707, term964707.getClass(), "maxSize", null);
        setBooleanField(term964707, term964707.getClass(), "maxSizeSet", false);
        setField(term964707, term964707.getClass(), "componentOrientation", null);
        setBooleanField(term964707, term964707.getClass(), "newEventsOnly", false);
        setField(term964707, term964707.getClass(), "componentListener", null);
        setField(term964707, term964707.getClass(), "focusListener", null);
        setField(term964707, term964707.getClass(), "hierarchyListener", null);
        setField(term964707, term964707.getClass(), "hierarchyBoundsListener", null);
        setField(term964707, term964707.getClass(), "keyListener", null);
        setField(term964707, term964707.getClass(), "mouseListener", null);
        setField(term964707, term964707.getClass(), "mouseMotionListener", null);
        setField(term964707, term964707.getClass(), "mouseWheelListener", null);
        setField(term964707, term964707.getClass(), "inputMethodListener", null);
        setLongField(term964707, term964707.getClass(), "eventMask", 0L);
        setField(term964707, term964707.getClass(), "changeSupport", null);
        setField(term964707, term964707.getClass(), "objectLock", null);
        setBooleanField(term964707, term964707.getClass(), "isPacked", false);
        setIntField(term964707, term964707.getClass(), "boundsOp", 0);
        setField(term964707, term964707.getClass(), "compoundShape", null);
        setField(term964707, term964707.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term964707, term964707.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term964707, term964707.getClass(), "backgroundEraseDisabled", false);
        setField(term964707, term964707.getClass(), "eventCache", null);
        setBooleanField(term964707, term964707.getClass(), "coalescingEnabled", false);
        setBooleanField(term964707, term964707.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term964707, term964707.getClass(), "componentSerializedDataVersion", 0);
        setField(term964707, term964707.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImprovedParallax", argTypes, term964707, args);
    }

};


