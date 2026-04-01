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

public class OptionsView_getSoundVolume_5090836312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term951896;

    public OptionsView_getSoundVolume_5090836312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term951896 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term951896, term951896.getClass(), "game", null);
        setField(term951896, term951896.getClass(), "fullscreenBox", null);
        setField(term951896, term951896.getClass(), "hardwareAccelerationBox", null);
        setField(term951896, term951896.getClass(), "improvedParallaxBox", null);
        setField(term951896, term951896.getClass(), "resolutionSelection", null);
        setField(term951896, term951896.getClass(), "uiSchemeSelection", null);
        setField(term951896, term951896.getClass(), "musicSlider", null);
        setField(term951896, term951896.getClass(), "soundSlider", null);
        setField(term951896, term951896.getClass(), "borderlessBox", null);
        setField(term951896, term951896.getClass(), "largerFontsBox", null);
        setField(term951896, term951896.getClass(), "ambientLightsBox", null);
        setField(term951896, term951896.getClass(), "lightsSlider", null);
        setBooleanField(term951896, term951896.getClass(), "resized", false);
        setField(term951896, term951896.getClass(), "borderScrollingBox", null);
        setField(term951896, term951896.getClass(), "showMinimapBox", null);
        setField(term951896, term951896.getClass(), "highContrastGridBox", null);
        setBooleanField(term951896, term951896.getClass(), "isAlignmentXSet", false);
        setFloatField(term951896, term951896.getClass(), "alignmentX", 0.0F);
        setBooleanField(term951896, term951896.getClass(), "isAlignmentYSet", false);
        setFloatField(term951896, term951896.getClass(), "alignmentY", 0.0F);
        setField(term951896, term951896.getClass(), "ui", null);
        setField(term951896, term951896.getClass(), "listenerList", null);
        setField(term951896, term951896.getClass(), "clientProperties", null);
        setField(term951896, term951896.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term951896, term951896.getClass(), "autoscrolls", false);
        setField(term951896, term951896.getClass(), "border", null);
        setIntField(term951896, term951896.getClass(), "flags", 0);
        setField(term951896, term951896.getClass(), "inputVerifier", null);
        setBooleanField(term951896, term951896.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term951896, term951896.getClass(), "paintingChild", null);
        setField(term951896, term951896.getClass(), "popupMenu", null);
        setField(term951896, term951896.getClass(), "revalidateRunnableScheduled", null);
        setField(term951896, term951896.getClass(), "focusInputMap", null);
        setField(term951896, term951896.getClass(), "ancestorInputMap", null);
        setField(term951896, term951896.getClass(), "windowInputMap", null);
        setField(term951896, term951896.getClass(), "actionMap", null);
        setField(term951896, term951896.getClass(), "aaHint", null);
        setField(term951896, term951896.getClass(), "lcdRenderingHint", null);
        setField(term951896, term951896.getClass(), "component", null);
        setField(term951896, term951896.getClass(), "layoutMgr", null);
        setField(term951896, term951896.getClass(), "dispatcher", null);
        setField(term951896, term951896.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term951896, term951896.getClass(), "focusCycleRoot", false);
        setBooleanField(term951896, term951896.getClass(), "focusTraversalPolicyProvider", false);
        setField(term951896, term951896.getClass(), "printingThreads", null);
        setBooleanField(term951896, term951896.getClass(), "printing", false);
        setField(term951896, term951896.getClass(), "containerListener", null);
        setIntField(term951896, term951896.getClass(), "listeningChildren", 0);
        setIntField(term951896, term951896.getClass(), "listeningBoundsChildren", 0);
        setIntField(term951896, term951896.getClass(), "descendantsCount", 0);
        setField(term951896, term951896.getClass(), "preserveBackgroundColor", null);
        setIntField(term951896, term951896.getClass(), "numOfHWComponents", 0);
        setIntField(term951896, term951896.getClass(), "numOfLWComponents", 0);
        setField(term951896, term951896.getClass(), "modalComp", null);
        setField(term951896, term951896.getClass(), "modalAppContext", null);
        setIntField(term951896, term951896.getClass(), "containerSerializedDataVersion", 0);
        setField(term951896, term951896.getClass(), "peer", null);
        setField(term951896, term951896.getClass(), "parent", null);
        setField(term951896, term951896.getClass(), "appContext", null);
        setIntField(term951896, term951896.getClass(), "x", 0);
        setIntField(term951896, term951896.getClass(), "y", 0);
        setIntField(term951896, term951896.getClass(), "width", 0);
        setIntField(term951896, term951896.getClass(), "height", 0);
        setField(term951896, term951896.getClass(), "foreground", null);
        setField(term951896, term951896.getClass(), "background", null);
        setField(term951896, term951896.getClass(), "font", null);
        setField(term951896, term951896.getClass(), "peerFont", null);
        setField(term951896, term951896.getClass(), "cursor", null);
        setField(term951896, term951896.getClass(), "locale", null);
        setField(term951896, term951896.getClass(), "graphicsConfig", null);
        setField(term951896, term951896.getClass(), "bufferStrategy", null);
        setBooleanField(term951896, term951896.getClass(), "ignoreRepaint", false);
        setBooleanField(term951896, term951896.getClass(), "visible", false);
        setBooleanField(term951896, term951896.getClass(), "enabled", false);
        setBooleanField(term951896, term951896.getClass(), "valid", false);
        setField(term951896, term951896.getClass(), "dropTarget", null);
        setField(term951896, term951896.getClass(), "popups", null);
        setField(term951896, term951896.getClass(), "name", null);
        setBooleanField(term951896, term951896.getClass(), "nameExplicitlySet", false);
        setBooleanField(term951896, term951896.getClass(), "focusable", false);
        setIntField(term951896, term951896.getClass(), "isFocusTraversableOverridden", 0);
        setField(term951896, term951896.getClass(), "focusTraversalKeys", null);
        setBooleanField(term951896, term951896.getClass(), "focusTraversalKeysEnabled", false);
        setField(term951896, term951896.getClass(), "acc", null);
        setField(term951896, term951896.getClass(), "minSize", null);
        setBooleanField(term951896, term951896.getClass(), "minSizeSet", false);
        setField(term951896, term951896.getClass(), "prefSize", null);
        setBooleanField(term951896, term951896.getClass(), "prefSizeSet", false);
        setField(term951896, term951896.getClass(), "maxSize", null);
        setBooleanField(term951896, term951896.getClass(), "maxSizeSet", false);
        setField(term951896, term951896.getClass(), "componentOrientation", null);
        setBooleanField(term951896, term951896.getClass(), "newEventsOnly", false);
        setField(term951896, term951896.getClass(), "componentListener", null);
        setField(term951896, term951896.getClass(), "focusListener", null);
        setField(term951896, term951896.getClass(), "hierarchyListener", null);
        setField(term951896, term951896.getClass(), "hierarchyBoundsListener", null);
        setField(term951896, term951896.getClass(), "keyListener", null);
        setField(term951896, term951896.getClass(), "mouseListener", null);
        setField(term951896, term951896.getClass(), "mouseMotionListener", null);
        setField(term951896, term951896.getClass(), "mouseWheelListener", null);
        setField(term951896, term951896.getClass(), "inputMethodListener", null);
        setLongField(term951896, term951896.getClass(), "eventMask", 0L);
        setField(term951896, term951896.getClass(), "changeSupport", null);
        setField(term951896, term951896.getClass(), "objectLock", null);
        setBooleanField(term951896, term951896.getClass(), "isPacked", false);
        setIntField(term951896, term951896.getClass(), "boundsOp", 0);
        setField(term951896, term951896.getClass(), "compoundShape", null);
        setField(term951896, term951896.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term951896, term951896.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term951896, term951896.getClass(), "backgroundEraseDisabled", false);
        setField(term951896, term951896.getClass(), "eventCache", null);
        setBooleanField(term951896, term951896.getClass(), "coalescingEnabled", false);
        setBooleanField(term951896, term951896.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term951896, term951896.getClass(), "componentSerializedDataVersion", 0);
        setField(term951896, term951896.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSoundVolume", argTypes, term951896, args);
    }

};


