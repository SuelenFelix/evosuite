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

public class OptionsView_isShowMinimap_74899597830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term990117;

    public OptionsView_isShowMinimap_74899597830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term990117 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term990117, term990117.getClass(), "game", null);
        setField(term990117, term990117.getClass(), "fullscreenBox", null);
        setField(term990117, term990117.getClass(), "hardwareAccelerationBox", null);
        setField(term990117, term990117.getClass(), "improvedParallaxBox", null);
        setField(term990117, term990117.getClass(), "resolutionSelection", null);
        setField(term990117, term990117.getClass(), "uiSchemeSelection", null);
        setField(term990117, term990117.getClass(), "musicSlider", null);
        setField(term990117, term990117.getClass(), "soundSlider", null);
        setField(term990117, term990117.getClass(), "borderlessBox", null);
        setField(term990117, term990117.getClass(), "largerFontsBox", null);
        setField(term990117, term990117.getClass(), "ambientLightsBox", null);
        setField(term990117, term990117.getClass(), "lightsSlider", null);
        setBooleanField(term990117, term990117.getClass(), "resized", false);
        setField(term990117, term990117.getClass(), "borderScrollingBox", null);
        setField(term990117, term990117.getClass(), "showMinimapBox", null);
        setField(term990117, term990117.getClass(), "highContrastGridBox", null);
        setBooleanField(term990117, term990117.getClass(), "isAlignmentXSet", false);
        setFloatField(term990117, term990117.getClass(), "alignmentX", 0.0F);
        setBooleanField(term990117, term990117.getClass(), "isAlignmentYSet", false);
        setFloatField(term990117, term990117.getClass(), "alignmentY", 0.0F);
        setField(term990117, term990117.getClass(), "ui", null);
        setField(term990117, term990117.getClass(), "listenerList", null);
        setField(term990117, term990117.getClass(), "clientProperties", null);
        setField(term990117, term990117.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term990117, term990117.getClass(), "autoscrolls", false);
        setField(term990117, term990117.getClass(), "border", null);
        setIntField(term990117, term990117.getClass(), "flags", 0);
        setField(term990117, term990117.getClass(), "inputVerifier", null);
        setBooleanField(term990117, term990117.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term990117, term990117.getClass(), "paintingChild", null);
        setField(term990117, term990117.getClass(), "popupMenu", null);
        setField(term990117, term990117.getClass(), "revalidateRunnableScheduled", null);
        setField(term990117, term990117.getClass(), "focusInputMap", null);
        setField(term990117, term990117.getClass(), "ancestorInputMap", null);
        setField(term990117, term990117.getClass(), "windowInputMap", null);
        setField(term990117, term990117.getClass(), "actionMap", null);
        setField(term990117, term990117.getClass(), "aaHint", null);
        setField(term990117, term990117.getClass(), "lcdRenderingHint", null);
        setField(term990117, term990117.getClass(), "component", null);
        setField(term990117, term990117.getClass(), "layoutMgr", null);
        setField(term990117, term990117.getClass(), "dispatcher", null);
        setField(term990117, term990117.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term990117, term990117.getClass(), "focusCycleRoot", false);
        setBooleanField(term990117, term990117.getClass(), "focusTraversalPolicyProvider", false);
        setField(term990117, term990117.getClass(), "printingThreads", null);
        setBooleanField(term990117, term990117.getClass(), "printing", false);
        setField(term990117, term990117.getClass(), "containerListener", null);
        setIntField(term990117, term990117.getClass(), "listeningChildren", 0);
        setIntField(term990117, term990117.getClass(), "listeningBoundsChildren", 0);
        setIntField(term990117, term990117.getClass(), "descendantsCount", 0);
        setField(term990117, term990117.getClass(), "preserveBackgroundColor", null);
        setIntField(term990117, term990117.getClass(), "numOfHWComponents", 0);
        setIntField(term990117, term990117.getClass(), "numOfLWComponents", 0);
        setField(term990117, term990117.getClass(), "modalComp", null);
        setField(term990117, term990117.getClass(), "modalAppContext", null);
        setIntField(term990117, term990117.getClass(), "containerSerializedDataVersion", 0);
        setField(term990117, term990117.getClass(), "peer", null);
        setField(term990117, term990117.getClass(), "parent", null);
        setField(term990117, term990117.getClass(), "appContext", null);
        setIntField(term990117, term990117.getClass(), "x", 0);
        setIntField(term990117, term990117.getClass(), "y", 0);
        setIntField(term990117, term990117.getClass(), "width", 0);
        setIntField(term990117, term990117.getClass(), "height", 0);
        setField(term990117, term990117.getClass(), "foreground", null);
        setField(term990117, term990117.getClass(), "background", null);
        setField(term990117, term990117.getClass(), "font", null);
        setField(term990117, term990117.getClass(), "peerFont", null);
        setField(term990117, term990117.getClass(), "cursor", null);
        setField(term990117, term990117.getClass(), "locale", null);
        setField(term990117, term990117.getClass(), "graphicsConfig", null);
        setField(term990117, term990117.getClass(), "bufferStrategy", null);
        setBooleanField(term990117, term990117.getClass(), "ignoreRepaint", false);
        setBooleanField(term990117, term990117.getClass(), "visible", false);
        setBooleanField(term990117, term990117.getClass(), "enabled", false);
        setBooleanField(term990117, term990117.getClass(), "valid", false);
        setField(term990117, term990117.getClass(), "dropTarget", null);
        setField(term990117, term990117.getClass(), "popups", null);
        setField(term990117, term990117.getClass(), "name", null);
        setBooleanField(term990117, term990117.getClass(), "nameExplicitlySet", false);
        setBooleanField(term990117, term990117.getClass(), "focusable", false);
        setIntField(term990117, term990117.getClass(), "isFocusTraversableOverridden", 0);
        setField(term990117, term990117.getClass(), "focusTraversalKeys", null);
        setBooleanField(term990117, term990117.getClass(), "focusTraversalKeysEnabled", false);
        setField(term990117, term990117.getClass(), "acc", null);
        setField(term990117, term990117.getClass(), "minSize", null);
        setBooleanField(term990117, term990117.getClass(), "minSizeSet", false);
        setField(term990117, term990117.getClass(), "prefSize", null);
        setBooleanField(term990117, term990117.getClass(), "prefSizeSet", false);
        setField(term990117, term990117.getClass(), "maxSize", null);
        setBooleanField(term990117, term990117.getClass(), "maxSizeSet", false);
        setField(term990117, term990117.getClass(), "componentOrientation", null);
        setBooleanField(term990117, term990117.getClass(), "newEventsOnly", false);
        setField(term990117, term990117.getClass(), "componentListener", null);
        setField(term990117, term990117.getClass(), "focusListener", null);
        setField(term990117, term990117.getClass(), "hierarchyListener", null);
        setField(term990117, term990117.getClass(), "hierarchyBoundsListener", null);
        setField(term990117, term990117.getClass(), "keyListener", null);
        setField(term990117, term990117.getClass(), "mouseListener", null);
        setField(term990117, term990117.getClass(), "mouseMotionListener", null);
        setField(term990117, term990117.getClass(), "mouseWheelListener", null);
        setField(term990117, term990117.getClass(), "inputMethodListener", null);
        setLongField(term990117, term990117.getClass(), "eventMask", 0L);
        setField(term990117, term990117.getClass(), "changeSupport", null);
        setField(term990117, term990117.getClass(), "objectLock", null);
        setBooleanField(term990117, term990117.getClass(), "isPacked", false);
        setIntField(term990117, term990117.getClass(), "boundsOp", 0);
        setField(term990117, term990117.getClass(), "compoundShape", null);
        setField(term990117, term990117.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term990117, term990117.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term990117, term990117.getClass(), "backgroundEraseDisabled", false);
        setField(term990117, term990117.getClass(), "eventCache", null);
        setBooleanField(term990117, term990117.getClass(), "coalescingEnabled", false);
        setBooleanField(term990117, term990117.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term990117, term990117.getClass(), "componentSerializedDataVersion", 0);
        setField(term990117, term990117.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowMinimap", argTypes, term990117, args);
    }

};


