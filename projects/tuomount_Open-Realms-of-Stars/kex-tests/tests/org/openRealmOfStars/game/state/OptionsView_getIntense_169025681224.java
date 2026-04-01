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

public class OptionsView_getIntense_169025681224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977528;

    public OptionsView_getIntense_169025681224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977528 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term977528, term977528.getClass(), "game", null);
        setField(term977528, term977528.getClass(), "fullscreenBox", null);
        setField(term977528, term977528.getClass(), "hardwareAccelerationBox", null);
        setField(term977528, term977528.getClass(), "improvedParallaxBox", null);
        setField(term977528, term977528.getClass(), "resolutionSelection", null);
        setField(term977528, term977528.getClass(), "uiSchemeSelection", null);
        setField(term977528, term977528.getClass(), "musicSlider", null);
        setField(term977528, term977528.getClass(), "soundSlider", null);
        setField(term977528, term977528.getClass(), "borderlessBox", null);
        setField(term977528, term977528.getClass(), "largerFontsBox", null);
        setField(term977528, term977528.getClass(), "ambientLightsBox", null);
        setField(term977528, term977528.getClass(), "lightsSlider", null);
        setBooleanField(term977528, term977528.getClass(), "resized", false);
        setField(term977528, term977528.getClass(), "borderScrollingBox", null);
        setField(term977528, term977528.getClass(), "showMinimapBox", null);
        setField(term977528, term977528.getClass(), "highContrastGridBox", null);
        setBooleanField(term977528, term977528.getClass(), "isAlignmentXSet", false);
        setFloatField(term977528, term977528.getClass(), "alignmentX", 0.0F);
        setBooleanField(term977528, term977528.getClass(), "isAlignmentYSet", false);
        setFloatField(term977528, term977528.getClass(), "alignmentY", 0.0F);
        setField(term977528, term977528.getClass(), "ui", null);
        setField(term977528, term977528.getClass(), "listenerList", null);
        setField(term977528, term977528.getClass(), "clientProperties", null);
        setField(term977528, term977528.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term977528, term977528.getClass(), "autoscrolls", false);
        setField(term977528, term977528.getClass(), "border", null);
        setIntField(term977528, term977528.getClass(), "flags", 0);
        setField(term977528, term977528.getClass(), "inputVerifier", null);
        setBooleanField(term977528, term977528.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term977528, term977528.getClass(), "paintingChild", null);
        setField(term977528, term977528.getClass(), "popupMenu", null);
        setField(term977528, term977528.getClass(), "revalidateRunnableScheduled", null);
        setField(term977528, term977528.getClass(), "focusInputMap", null);
        setField(term977528, term977528.getClass(), "ancestorInputMap", null);
        setField(term977528, term977528.getClass(), "windowInputMap", null);
        setField(term977528, term977528.getClass(), "actionMap", null);
        setField(term977528, term977528.getClass(), "aaHint", null);
        setField(term977528, term977528.getClass(), "lcdRenderingHint", null);
        setField(term977528, term977528.getClass(), "component", null);
        setField(term977528, term977528.getClass(), "layoutMgr", null);
        setField(term977528, term977528.getClass(), "dispatcher", null);
        setField(term977528, term977528.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term977528, term977528.getClass(), "focusCycleRoot", false);
        setBooleanField(term977528, term977528.getClass(), "focusTraversalPolicyProvider", false);
        setField(term977528, term977528.getClass(), "printingThreads", null);
        setBooleanField(term977528, term977528.getClass(), "printing", false);
        setField(term977528, term977528.getClass(), "containerListener", null);
        setIntField(term977528, term977528.getClass(), "listeningChildren", 0);
        setIntField(term977528, term977528.getClass(), "listeningBoundsChildren", 0);
        setIntField(term977528, term977528.getClass(), "descendantsCount", 0);
        setField(term977528, term977528.getClass(), "preserveBackgroundColor", null);
        setIntField(term977528, term977528.getClass(), "numOfHWComponents", 0);
        setIntField(term977528, term977528.getClass(), "numOfLWComponents", 0);
        setField(term977528, term977528.getClass(), "modalComp", null);
        setField(term977528, term977528.getClass(), "modalAppContext", null);
        setIntField(term977528, term977528.getClass(), "containerSerializedDataVersion", 0);
        setField(term977528, term977528.getClass(), "peer", null);
        setField(term977528, term977528.getClass(), "parent", null);
        setField(term977528, term977528.getClass(), "appContext", null);
        setIntField(term977528, term977528.getClass(), "x", 0);
        setIntField(term977528, term977528.getClass(), "y", 0);
        setIntField(term977528, term977528.getClass(), "width", 0);
        setIntField(term977528, term977528.getClass(), "height", 0);
        setField(term977528, term977528.getClass(), "foreground", null);
        setField(term977528, term977528.getClass(), "background", null);
        setField(term977528, term977528.getClass(), "font", null);
        setField(term977528, term977528.getClass(), "peerFont", null);
        setField(term977528, term977528.getClass(), "cursor", null);
        setField(term977528, term977528.getClass(), "locale", null);
        setField(term977528, term977528.getClass(), "graphicsConfig", null);
        setField(term977528, term977528.getClass(), "bufferStrategy", null);
        setBooleanField(term977528, term977528.getClass(), "ignoreRepaint", false);
        setBooleanField(term977528, term977528.getClass(), "visible", false);
        setBooleanField(term977528, term977528.getClass(), "enabled", false);
        setBooleanField(term977528, term977528.getClass(), "valid", false);
        setField(term977528, term977528.getClass(), "dropTarget", null);
        setField(term977528, term977528.getClass(), "popups", null);
        setField(term977528, term977528.getClass(), "name", null);
        setBooleanField(term977528, term977528.getClass(), "nameExplicitlySet", false);
        setBooleanField(term977528, term977528.getClass(), "focusable", false);
        setIntField(term977528, term977528.getClass(), "isFocusTraversableOverridden", 0);
        setField(term977528, term977528.getClass(), "focusTraversalKeys", null);
        setBooleanField(term977528, term977528.getClass(), "focusTraversalKeysEnabled", false);
        setField(term977528, term977528.getClass(), "acc", null);
        setField(term977528, term977528.getClass(), "minSize", null);
        setBooleanField(term977528, term977528.getClass(), "minSizeSet", false);
        setField(term977528, term977528.getClass(), "prefSize", null);
        setBooleanField(term977528, term977528.getClass(), "prefSizeSet", false);
        setField(term977528, term977528.getClass(), "maxSize", null);
        setBooleanField(term977528, term977528.getClass(), "maxSizeSet", false);
        setField(term977528, term977528.getClass(), "componentOrientation", null);
        setBooleanField(term977528, term977528.getClass(), "newEventsOnly", false);
        setField(term977528, term977528.getClass(), "componentListener", null);
        setField(term977528, term977528.getClass(), "focusListener", null);
        setField(term977528, term977528.getClass(), "hierarchyListener", null);
        setField(term977528, term977528.getClass(), "hierarchyBoundsListener", null);
        setField(term977528, term977528.getClass(), "keyListener", null);
        setField(term977528, term977528.getClass(), "mouseListener", null);
        setField(term977528, term977528.getClass(), "mouseMotionListener", null);
        setField(term977528, term977528.getClass(), "mouseWheelListener", null);
        setField(term977528, term977528.getClass(), "inputMethodListener", null);
        setLongField(term977528, term977528.getClass(), "eventMask", 0L);
        setField(term977528, term977528.getClass(), "changeSupport", null);
        setField(term977528, term977528.getClass(), "objectLock", null);
        setBooleanField(term977528, term977528.getClass(), "isPacked", false);
        setIntField(term977528, term977528.getClass(), "boundsOp", 0);
        setField(term977528, term977528.getClass(), "compoundShape", null);
        setField(term977528, term977528.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term977528, term977528.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term977528, term977528.getClass(), "backgroundEraseDisabled", false);
        setField(term977528, term977528.getClass(), "eventCache", null);
        setBooleanField(term977528, term977528.getClass(), "coalescingEnabled", false);
        setBooleanField(term977528, term977528.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term977528, term977528.getClass(), "componentSerializedDataVersion", 0);
        setField(term977528, term977528.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntense", argTypes, term977528, args);
    }

};


