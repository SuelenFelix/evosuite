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

public class OptionsView_setVolumes_6152906912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930105;

    public OptionsView_setVolumes_6152906912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term930105 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term930105, term930105.getClass(), "game", null);
        setField(term930105, term930105.getClass(), "fullscreenBox", null);
        setField(term930105, term930105.getClass(), "hardwareAccelerationBox", null);
        setField(term930105, term930105.getClass(), "improvedParallaxBox", null);
        setField(term930105, term930105.getClass(), "resolutionSelection", null);
        setField(term930105, term930105.getClass(), "uiSchemeSelection", null);
        setField(term930105, term930105.getClass(), "musicSlider", null);
        setField(term930105, term930105.getClass(), "soundSlider", null);
        setField(term930105, term930105.getClass(), "borderlessBox", null);
        setField(term930105, term930105.getClass(), "largerFontsBox", null);
        setField(term930105, term930105.getClass(), "ambientLightsBox", null);
        setField(term930105, term930105.getClass(), "lightsSlider", null);
        setBooleanField(term930105, term930105.getClass(), "resized", false);
        setField(term930105, term930105.getClass(), "borderScrollingBox", null);
        setField(term930105, term930105.getClass(), "showMinimapBox", null);
        setField(term930105, term930105.getClass(), "highContrastGridBox", null);
        setBooleanField(term930105, term930105.getClass(), "isAlignmentXSet", false);
        setFloatField(term930105, term930105.getClass(), "alignmentX", 0.0F);
        setBooleanField(term930105, term930105.getClass(), "isAlignmentYSet", false);
        setFloatField(term930105, term930105.getClass(), "alignmentY", 0.0F);
        setField(term930105, term930105.getClass(), "ui", null);
        setField(term930105, term930105.getClass(), "listenerList", null);
        setField(term930105, term930105.getClass(), "clientProperties", null);
        setField(term930105, term930105.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term930105, term930105.getClass(), "autoscrolls", false);
        setField(term930105, term930105.getClass(), "border", null);
        setIntField(term930105, term930105.getClass(), "flags", 0);
        setField(term930105, term930105.getClass(), "inputVerifier", null);
        setBooleanField(term930105, term930105.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term930105, term930105.getClass(), "paintingChild", null);
        setField(term930105, term930105.getClass(), "popupMenu", null);
        setField(term930105, term930105.getClass(), "revalidateRunnableScheduled", null);
        setField(term930105, term930105.getClass(), "focusInputMap", null);
        setField(term930105, term930105.getClass(), "ancestorInputMap", null);
        setField(term930105, term930105.getClass(), "windowInputMap", null);
        setField(term930105, term930105.getClass(), "actionMap", null);
        setField(term930105, term930105.getClass(), "aaHint", null);
        setField(term930105, term930105.getClass(), "lcdRenderingHint", null);
        setField(term930105, term930105.getClass(), "component", null);
        setField(term930105, term930105.getClass(), "layoutMgr", null);
        setField(term930105, term930105.getClass(), "dispatcher", null);
        setField(term930105, term930105.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term930105, term930105.getClass(), "focusCycleRoot", false);
        setBooleanField(term930105, term930105.getClass(), "focusTraversalPolicyProvider", false);
        setField(term930105, term930105.getClass(), "printingThreads", null);
        setBooleanField(term930105, term930105.getClass(), "printing", false);
        setField(term930105, term930105.getClass(), "containerListener", null);
        setIntField(term930105, term930105.getClass(), "listeningChildren", 0);
        setIntField(term930105, term930105.getClass(), "listeningBoundsChildren", 0);
        setIntField(term930105, term930105.getClass(), "descendantsCount", 0);
        setField(term930105, term930105.getClass(), "preserveBackgroundColor", null);
        setIntField(term930105, term930105.getClass(), "numOfHWComponents", 0);
        setIntField(term930105, term930105.getClass(), "numOfLWComponents", 0);
        setField(term930105, term930105.getClass(), "modalComp", null);
        setField(term930105, term930105.getClass(), "modalAppContext", null);
        setIntField(term930105, term930105.getClass(), "containerSerializedDataVersion", 0);
        setField(term930105, term930105.getClass(), "peer", null);
        setField(term930105, term930105.getClass(), "parent", null);
        setField(term930105, term930105.getClass(), "appContext", null);
        setIntField(term930105, term930105.getClass(), "x", 0);
        setIntField(term930105, term930105.getClass(), "y", 0);
        setIntField(term930105, term930105.getClass(), "width", 0);
        setIntField(term930105, term930105.getClass(), "height", 0);
        setField(term930105, term930105.getClass(), "foreground", null);
        setField(term930105, term930105.getClass(), "background", null);
        setField(term930105, term930105.getClass(), "font", null);
        setField(term930105, term930105.getClass(), "peerFont", null);
        setField(term930105, term930105.getClass(), "cursor", null);
        setField(term930105, term930105.getClass(), "locale", null);
        setField(term930105, term930105.getClass(), "graphicsConfig", null);
        setField(term930105, term930105.getClass(), "bufferStrategy", null);
        setBooleanField(term930105, term930105.getClass(), "ignoreRepaint", false);
        setBooleanField(term930105, term930105.getClass(), "visible", false);
        setBooleanField(term930105, term930105.getClass(), "enabled", false);
        setBooleanField(term930105, term930105.getClass(), "valid", false);
        setField(term930105, term930105.getClass(), "dropTarget", null);
        setField(term930105, term930105.getClass(), "popups", null);
        setField(term930105, term930105.getClass(), "name", null);
        setBooleanField(term930105, term930105.getClass(), "nameExplicitlySet", false);
        setBooleanField(term930105, term930105.getClass(), "focusable", false);
        setIntField(term930105, term930105.getClass(), "isFocusTraversableOverridden", 0);
        setField(term930105, term930105.getClass(), "focusTraversalKeys", null);
        setBooleanField(term930105, term930105.getClass(), "focusTraversalKeysEnabled", false);
        setField(term930105, term930105.getClass(), "acc", null);
        setField(term930105, term930105.getClass(), "minSize", null);
        setBooleanField(term930105, term930105.getClass(), "minSizeSet", false);
        setField(term930105, term930105.getClass(), "prefSize", null);
        setBooleanField(term930105, term930105.getClass(), "prefSizeSet", false);
        setField(term930105, term930105.getClass(), "maxSize", null);
        setBooleanField(term930105, term930105.getClass(), "maxSizeSet", false);
        setField(term930105, term930105.getClass(), "componentOrientation", null);
        setBooleanField(term930105, term930105.getClass(), "newEventsOnly", false);
        setField(term930105, term930105.getClass(), "componentListener", null);
        setField(term930105, term930105.getClass(), "focusListener", null);
        setField(term930105, term930105.getClass(), "hierarchyListener", null);
        setField(term930105, term930105.getClass(), "hierarchyBoundsListener", null);
        setField(term930105, term930105.getClass(), "keyListener", null);
        setField(term930105, term930105.getClass(), "mouseListener", null);
        setField(term930105, term930105.getClass(), "mouseMotionListener", null);
        setField(term930105, term930105.getClass(), "mouseWheelListener", null);
        setField(term930105, term930105.getClass(), "inputMethodListener", null);
        setLongField(term930105, term930105.getClass(), "eventMask", 0L);
        setField(term930105, term930105.getClass(), "changeSupport", null);
        setField(term930105, term930105.getClass(), "objectLock", null);
        setBooleanField(term930105, term930105.getClass(), "isPacked", false);
        setIntField(term930105, term930105.getClass(), "boundsOp", 0);
        setField(term930105, term930105.getClass(), "compoundShape", null);
        setField(term930105, term930105.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term930105, term930105.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term930105, term930105.getClass(), "backgroundEraseDisabled", false);
        setField(term930105, term930105.getClass(), "eventCache", null);
        setBooleanField(term930105, term930105.getClass(), "coalescingEnabled", false);
        setBooleanField(term930105, term930105.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term930105, term930105.getClass(), "componentSerializedDataVersion", 0);
        setField(term930105, term930105.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setVolumes", argTypes, term930105, args);
    }

};


