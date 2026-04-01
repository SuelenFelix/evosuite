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

public class OptionsView_getMusicVolume_37981283310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term947473;

    public OptionsView_getMusicVolume_37981283310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term947473 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term947473, term947473.getClass(), "game", null);
        setField(term947473, term947473.getClass(), "fullscreenBox", null);
        setField(term947473, term947473.getClass(), "hardwareAccelerationBox", null);
        setField(term947473, term947473.getClass(), "improvedParallaxBox", null);
        setField(term947473, term947473.getClass(), "resolutionSelection", null);
        setField(term947473, term947473.getClass(), "uiSchemeSelection", null);
        setField(term947473, term947473.getClass(), "musicSlider", null);
        setField(term947473, term947473.getClass(), "soundSlider", null);
        setField(term947473, term947473.getClass(), "borderlessBox", null);
        setField(term947473, term947473.getClass(), "largerFontsBox", null);
        setField(term947473, term947473.getClass(), "ambientLightsBox", null);
        setField(term947473, term947473.getClass(), "lightsSlider", null);
        setBooleanField(term947473, term947473.getClass(), "resized", false);
        setField(term947473, term947473.getClass(), "borderScrollingBox", null);
        setField(term947473, term947473.getClass(), "showMinimapBox", null);
        setField(term947473, term947473.getClass(), "highContrastGridBox", null);
        setBooleanField(term947473, term947473.getClass(), "isAlignmentXSet", false);
        setFloatField(term947473, term947473.getClass(), "alignmentX", 0.0F);
        setBooleanField(term947473, term947473.getClass(), "isAlignmentYSet", false);
        setFloatField(term947473, term947473.getClass(), "alignmentY", 0.0F);
        setField(term947473, term947473.getClass(), "ui", null);
        setField(term947473, term947473.getClass(), "listenerList", null);
        setField(term947473, term947473.getClass(), "clientProperties", null);
        setField(term947473, term947473.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term947473, term947473.getClass(), "autoscrolls", false);
        setField(term947473, term947473.getClass(), "border", null);
        setIntField(term947473, term947473.getClass(), "flags", 0);
        setField(term947473, term947473.getClass(), "inputVerifier", null);
        setBooleanField(term947473, term947473.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term947473, term947473.getClass(), "paintingChild", null);
        setField(term947473, term947473.getClass(), "popupMenu", null);
        setField(term947473, term947473.getClass(), "revalidateRunnableScheduled", null);
        setField(term947473, term947473.getClass(), "focusInputMap", null);
        setField(term947473, term947473.getClass(), "ancestorInputMap", null);
        setField(term947473, term947473.getClass(), "windowInputMap", null);
        setField(term947473, term947473.getClass(), "actionMap", null);
        setField(term947473, term947473.getClass(), "aaHint", null);
        setField(term947473, term947473.getClass(), "lcdRenderingHint", null);
        setField(term947473, term947473.getClass(), "component", null);
        setField(term947473, term947473.getClass(), "layoutMgr", null);
        setField(term947473, term947473.getClass(), "dispatcher", null);
        setField(term947473, term947473.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term947473, term947473.getClass(), "focusCycleRoot", false);
        setBooleanField(term947473, term947473.getClass(), "focusTraversalPolicyProvider", false);
        setField(term947473, term947473.getClass(), "printingThreads", null);
        setBooleanField(term947473, term947473.getClass(), "printing", false);
        setField(term947473, term947473.getClass(), "containerListener", null);
        setIntField(term947473, term947473.getClass(), "listeningChildren", 0);
        setIntField(term947473, term947473.getClass(), "listeningBoundsChildren", 0);
        setIntField(term947473, term947473.getClass(), "descendantsCount", 0);
        setField(term947473, term947473.getClass(), "preserveBackgroundColor", null);
        setIntField(term947473, term947473.getClass(), "numOfHWComponents", 0);
        setIntField(term947473, term947473.getClass(), "numOfLWComponents", 0);
        setField(term947473, term947473.getClass(), "modalComp", null);
        setField(term947473, term947473.getClass(), "modalAppContext", null);
        setIntField(term947473, term947473.getClass(), "containerSerializedDataVersion", 0);
        setField(term947473, term947473.getClass(), "peer", null);
        setField(term947473, term947473.getClass(), "parent", null);
        setField(term947473, term947473.getClass(), "appContext", null);
        setIntField(term947473, term947473.getClass(), "x", 0);
        setIntField(term947473, term947473.getClass(), "y", 0);
        setIntField(term947473, term947473.getClass(), "width", 0);
        setIntField(term947473, term947473.getClass(), "height", 0);
        setField(term947473, term947473.getClass(), "foreground", null);
        setField(term947473, term947473.getClass(), "background", null);
        setField(term947473, term947473.getClass(), "font", null);
        setField(term947473, term947473.getClass(), "peerFont", null);
        setField(term947473, term947473.getClass(), "cursor", null);
        setField(term947473, term947473.getClass(), "locale", null);
        setField(term947473, term947473.getClass(), "graphicsConfig", null);
        setField(term947473, term947473.getClass(), "bufferStrategy", null);
        setBooleanField(term947473, term947473.getClass(), "ignoreRepaint", false);
        setBooleanField(term947473, term947473.getClass(), "visible", false);
        setBooleanField(term947473, term947473.getClass(), "enabled", false);
        setBooleanField(term947473, term947473.getClass(), "valid", false);
        setField(term947473, term947473.getClass(), "dropTarget", null);
        setField(term947473, term947473.getClass(), "popups", null);
        setField(term947473, term947473.getClass(), "name", null);
        setBooleanField(term947473, term947473.getClass(), "nameExplicitlySet", false);
        setBooleanField(term947473, term947473.getClass(), "focusable", false);
        setIntField(term947473, term947473.getClass(), "isFocusTraversableOverridden", 0);
        setField(term947473, term947473.getClass(), "focusTraversalKeys", null);
        setBooleanField(term947473, term947473.getClass(), "focusTraversalKeysEnabled", false);
        setField(term947473, term947473.getClass(), "acc", null);
        setField(term947473, term947473.getClass(), "minSize", null);
        setBooleanField(term947473, term947473.getClass(), "minSizeSet", false);
        setField(term947473, term947473.getClass(), "prefSize", null);
        setBooleanField(term947473, term947473.getClass(), "prefSizeSet", false);
        setField(term947473, term947473.getClass(), "maxSize", null);
        setBooleanField(term947473, term947473.getClass(), "maxSizeSet", false);
        setField(term947473, term947473.getClass(), "componentOrientation", null);
        setBooleanField(term947473, term947473.getClass(), "newEventsOnly", false);
        setField(term947473, term947473.getClass(), "componentListener", null);
        setField(term947473, term947473.getClass(), "focusListener", null);
        setField(term947473, term947473.getClass(), "hierarchyListener", null);
        setField(term947473, term947473.getClass(), "hierarchyBoundsListener", null);
        setField(term947473, term947473.getClass(), "keyListener", null);
        setField(term947473, term947473.getClass(), "mouseListener", null);
        setField(term947473, term947473.getClass(), "mouseMotionListener", null);
        setField(term947473, term947473.getClass(), "mouseWheelListener", null);
        setField(term947473, term947473.getClass(), "inputMethodListener", null);
        setLongField(term947473, term947473.getClass(), "eventMask", 0L);
        setField(term947473, term947473.getClass(), "changeSupport", null);
        setField(term947473, term947473.getClass(), "objectLock", null);
        setBooleanField(term947473, term947473.getClass(), "isPacked", false);
        setIntField(term947473, term947473.getClass(), "boundsOp", 0);
        setField(term947473, term947473.getClass(), "compoundShape", null);
        setField(term947473, term947473.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term947473, term947473.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term947473, term947473.getClass(), "backgroundEraseDisabled", false);
        setField(term947473, term947473.getClass(), "eventCache", null);
        setBooleanField(term947473, term947473.getClass(), "coalescingEnabled", false);
        setBooleanField(term947473, term947473.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term947473, term947473.getClass(), "componentSerializedDataVersion", 0);
        setField(term947473, term947473.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicVolume", argTypes, term947473, args);
    }

};


