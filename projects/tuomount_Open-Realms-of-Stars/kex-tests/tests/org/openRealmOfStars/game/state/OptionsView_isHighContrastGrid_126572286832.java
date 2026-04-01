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

public class OptionsView_isHighContrastGrid_126572286832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term994404;

    public OptionsView_isHighContrastGrid_126572286832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term994404 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term994404, term994404.getClass(), "game", null);
        setField(term994404, term994404.getClass(), "fullscreenBox", null);
        setField(term994404, term994404.getClass(), "hardwareAccelerationBox", null);
        setField(term994404, term994404.getClass(), "improvedParallaxBox", null);
        setField(term994404, term994404.getClass(), "resolutionSelection", null);
        setField(term994404, term994404.getClass(), "uiSchemeSelection", null);
        setField(term994404, term994404.getClass(), "musicSlider", null);
        setField(term994404, term994404.getClass(), "soundSlider", null);
        setField(term994404, term994404.getClass(), "borderlessBox", null);
        setField(term994404, term994404.getClass(), "largerFontsBox", null);
        setField(term994404, term994404.getClass(), "ambientLightsBox", null);
        setField(term994404, term994404.getClass(), "lightsSlider", null);
        setBooleanField(term994404, term994404.getClass(), "resized", false);
        setField(term994404, term994404.getClass(), "borderScrollingBox", null);
        setField(term994404, term994404.getClass(), "showMinimapBox", null);
        setField(term994404, term994404.getClass(), "highContrastGridBox", null);
        setBooleanField(term994404, term994404.getClass(), "isAlignmentXSet", false);
        setFloatField(term994404, term994404.getClass(), "alignmentX", 0.0F);
        setBooleanField(term994404, term994404.getClass(), "isAlignmentYSet", false);
        setFloatField(term994404, term994404.getClass(), "alignmentY", 0.0F);
        setField(term994404, term994404.getClass(), "ui", null);
        setField(term994404, term994404.getClass(), "listenerList", null);
        setField(term994404, term994404.getClass(), "clientProperties", null);
        setField(term994404, term994404.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term994404, term994404.getClass(), "autoscrolls", false);
        setField(term994404, term994404.getClass(), "border", null);
        setIntField(term994404, term994404.getClass(), "flags", 0);
        setField(term994404, term994404.getClass(), "inputVerifier", null);
        setBooleanField(term994404, term994404.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term994404, term994404.getClass(), "paintingChild", null);
        setField(term994404, term994404.getClass(), "popupMenu", null);
        setField(term994404, term994404.getClass(), "revalidateRunnableScheduled", null);
        setField(term994404, term994404.getClass(), "focusInputMap", null);
        setField(term994404, term994404.getClass(), "ancestorInputMap", null);
        setField(term994404, term994404.getClass(), "windowInputMap", null);
        setField(term994404, term994404.getClass(), "actionMap", null);
        setField(term994404, term994404.getClass(), "aaHint", null);
        setField(term994404, term994404.getClass(), "lcdRenderingHint", null);
        setField(term994404, term994404.getClass(), "component", null);
        setField(term994404, term994404.getClass(), "layoutMgr", null);
        setField(term994404, term994404.getClass(), "dispatcher", null);
        setField(term994404, term994404.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term994404, term994404.getClass(), "focusCycleRoot", false);
        setBooleanField(term994404, term994404.getClass(), "focusTraversalPolicyProvider", false);
        setField(term994404, term994404.getClass(), "printingThreads", null);
        setBooleanField(term994404, term994404.getClass(), "printing", false);
        setField(term994404, term994404.getClass(), "containerListener", null);
        setIntField(term994404, term994404.getClass(), "listeningChildren", 0);
        setIntField(term994404, term994404.getClass(), "listeningBoundsChildren", 0);
        setIntField(term994404, term994404.getClass(), "descendantsCount", 0);
        setField(term994404, term994404.getClass(), "preserveBackgroundColor", null);
        setIntField(term994404, term994404.getClass(), "numOfHWComponents", 0);
        setIntField(term994404, term994404.getClass(), "numOfLWComponents", 0);
        setField(term994404, term994404.getClass(), "modalComp", null);
        setField(term994404, term994404.getClass(), "modalAppContext", null);
        setIntField(term994404, term994404.getClass(), "containerSerializedDataVersion", 0);
        setField(term994404, term994404.getClass(), "peer", null);
        setField(term994404, term994404.getClass(), "parent", null);
        setField(term994404, term994404.getClass(), "appContext", null);
        setIntField(term994404, term994404.getClass(), "x", 0);
        setIntField(term994404, term994404.getClass(), "y", 0);
        setIntField(term994404, term994404.getClass(), "width", 0);
        setIntField(term994404, term994404.getClass(), "height", 0);
        setField(term994404, term994404.getClass(), "foreground", null);
        setField(term994404, term994404.getClass(), "background", null);
        setField(term994404, term994404.getClass(), "font", null);
        setField(term994404, term994404.getClass(), "peerFont", null);
        setField(term994404, term994404.getClass(), "cursor", null);
        setField(term994404, term994404.getClass(), "locale", null);
        setField(term994404, term994404.getClass(), "graphicsConfig", null);
        setField(term994404, term994404.getClass(), "bufferStrategy", null);
        setBooleanField(term994404, term994404.getClass(), "ignoreRepaint", false);
        setBooleanField(term994404, term994404.getClass(), "visible", false);
        setBooleanField(term994404, term994404.getClass(), "enabled", false);
        setBooleanField(term994404, term994404.getClass(), "valid", false);
        setField(term994404, term994404.getClass(), "dropTarget", null);
        setField(term994404, term994404.getClass(), "popups", null);
        setField(term994404, term994404.getClass(), "name", null);
        setBooleanField(term994404, term994404.getClass(), "nameExplicitlySet", false);
        setBooleanField(term994404, term994404.getClass(), "focusable", false);
        setIntField(term994404, term994404.getClass(), "isFocusTraversableOverridden", 0);
        setField(term994404, term994404.getClass(), "focusTraversalKeys", null);
        setBooleanField(term994404, term994404.getClass(), "focusTraversalKeysEnabled", false);
        setField(term994404, term994404.getClass(), "acc", null);
        setField(term994404, term994404.getClass(), "minSize", null);
        setBooleanField(term994404, term994404.getClass(), "minSizeSet", false);
        setField(term994404, term994404.getClass(), "prefSize", null);
        setBooleanField(term994404, term994404.getClass(), "prefSizeSet", false);
        setField(term994404, term994404.getClass(), "maxSize", null);
        setBooleanField(term994404, term994404.getClass(), "maxSizeSet", false);
        setField(term994404, term994404.getClass(), "componentOrientation", null);
        setBooleanField(term994404, term994404.getClass(), "newEventsOnly", false);
        setField(term994404, term994404.getClass(), "componentListener", null);
        setField(term994404, term994404.getClass(), "focusListener", null);
        setField(term994404, term994404.getClass(), "hierarchyListener", null);
        setField(term994404, term994404.getClass(), "hierarchyBoundsListener", null);
        setField(term994404, term994404.getClass(), "keyListener", null);
        setField(term994404, term994404.getClass(), "mouseListener", null);
        setField(term994404, term994404.getClass(), "mouseMotionListener", null);
        setField(term994404, term994404.getClass(), "mouseWheelListener", null);
        setField(term994404, term994404.getClass(), "inputMethodListener", null);
        setLongField(term994404, term994404.getClass(), "eventMask", 0L);
        setField(term994404, term994404.getClass(), "changeSupport", null);
        setField(term994404, term994404.getClass(), "objectLock", null);
        setBooleanField(term994404, term994404.getClass(), "isPacked", false);
        setIntField(term994404, term994404.getClass(), "boundsOp", 0);
        setField(term994404, term994404.getClass(), "compoundShape", null);
        setField(term994404, term994404.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term994404, term994404.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term994404, term994404.getClass(), "backgroundEraseDisabled", false);
        setField(term994404, term994404.getClass(), "eventCache", null);
        setBooleanField(term994404, term994404.getClass(), "coalescingEnabled", false);
        setBooleanField(term994404, term994404.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term994404, term994404.getClass(), "componentSerializedDataVersion", 0);
        setField(term994404, term994404.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHighContrastGrid", argTypes, term994404, args);
    }

};


