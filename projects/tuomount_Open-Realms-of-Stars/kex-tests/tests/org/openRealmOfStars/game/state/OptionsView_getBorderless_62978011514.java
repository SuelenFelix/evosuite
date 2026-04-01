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

public class OptionsView_getBorderless_62978011514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term956098;

    public OptionsView_getBorderless_62978011514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term956098 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term956098, term956098.getClass(), "game", null);
        setField(term956098, term956098.getClass(), "fullscreenBox", null);
        setField(term956098, term956098.getClass(), "hardwareAccelerationBox", null);
        setField(term956098, term956098.getClass(), "improvedParallaxBox", null);
        setField(term956098, term956098.getClass(), "resolutionSelection", null);
        setField(term956098, term956098.getClass(), "uiSchemeSelection", null);
        setField(term956098, term956098.getClass(), "musicSlider", null);
        setField(term956098, term956098.getClass(), "soundSlider", null);
        setField(term956098, term956098.getClass(), "borderlessBox", null);
        setField(term956098, term956098.getClass(), "largerFontsBox", null);
        setField(term956098, term956098.getClass(), "ambientLightsBox", null);
        setField(term956098, term956098.getClass(), "lightsSlider", null);
        setBooleanField(term956098, term956098.getClass(), "resized", false);
        setField(term956098, term956098.getClass(), "borderScrollingBox", null);
        setField(term956098, term956098.getClass(), "showMinimapBox", null);
        setField(term956098, term956098.getClass(), "highContrastGridBox", null);
        setBooleanField(term956098, term956098.getClass(), "isAlignmentXSet", false);
        setFloatField(term956098, term956098.getClass(), "alignmentX", 0.0F);
        setBooleanField(term956098, term956098.getClass(), "isAlignmentYSet", false);
        setFloatField(term956098, term956098.getClass(), "alignmentY", 0.0F);
        setField(term956098, term956098.getClass(), "ui", null);
        setField(term956098, term956098.getClass(), "listenerList", null);
        setField(term956098, term956098.getClass(), "clientProperties", null);
        setField(term956098, term956098.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term956098, term956098.getClass(), "autoscrolls", false);
        setField(term956098, term956098.getClass(), "border", null);
        setIntField(term956098, term956098.getClass(), "flags", 0);
        setField(term956098, term956098.getClass(), "inputVerifier", null);
        setBooleanField(term956098, term956098.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term956098, term956098.getClass(), "paintingChild", null);
        setField(term956098, term956098.getClass(), "popupMenu", null);
        setField(term956098, term956098.getClass(), "revalidateRunnableScheduled", null);
        setField(term956098, term956098.getClass(), "focusInputMap", null);
        setField(term956098, term956098.getClass(), "ancestorInputMap", null);
        setField(term956098, term956098.getClass(), "windowInputMap", null);
        setField(term956098, term956098.getClass(), "actionMap", null);
        setField(term956098, term956098.getClass(), "aaHint", null);
        setField(term956098, term956098.getClass(), "lcdRenderingHint", null);
        setField(term956098, term956098.getClass(), "component", null);
        setField(term956098, term956098.getClass(), "layoutMgr", null);
        setField(term956098, term956098.getClass(), "dispatcher", null);
        setField(term956098, term956098.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term956098, term956098.getClass(), "focusCycleRoot", false);
        setBooleanField(term956098, term956098.getClass(), "focusTraversalPolicyProvider", false);
        setField(term956098, term956098.getClass(), "printingThreads", null);
        setBooleanField(term956098, term956098.getClass(), "printing", false);
        setField(term956098, term956098.getClass(), "containerListener", null);
        setIntField(term956098, term956098.getClass(), "listeningChildren", 0);
        setIntField(term956098, term956098.getClass(), "listeningBoundsChildren", 0);
        setIntField(term956098, term956098.getClass(), "descendantsCount", 0);
        setField(term956098, term956098.getClass(), "preserveBackgroundColor", null);
        setIntField(term956098, term956098.getClass(), "numOfHWComponents", 0);
        setIntField(term956098, term956098.getClass(), "numOfLWComponents", 0);
        setField(term956098, term956098.getClass(), "modalComp", null);
        setField(term956098, term956098.getClass(), "modalAppContext", null);
        setIntField(term956098, term956098.getClass(), "containerSerializedDataVersion", 0);
        setField(term956098, term956098.getClass(), "peer", null);
        setField(term956098, term956098.getClass(), "parent", null);
        setField(term956098, term956098.getClass(), "appContext", null);
        setIntField(term956098, term956098.getClass(), "x", 0);
        setIntField(term956098, term956098.getClass(), "y", 0);
        setIntField(term956098, term956098.getClass(), "width", 0);
        setIntField(term956098, term956098.getClass(), "height", 0);
        setField(term956098, term956098.getClass(), "foreground", null);
        setField(term956098, term956098.getClass(), "background", null);
        setField(term956098, term956098.getClass(), "font", null);
        setField(term956098, term956098.getClass(), "peerFont", null);
        setField(term956098, term956098.getClass(), "cursor", null);
        setField(term956098, term956098.getClass(), "locale", null);
        setField(term956098, term956098.getClass(), "graphicsConfig", null);
        setField(term956098, term956098.getClass(), "bufferStrategy", null);
        setBooleanField(term956098, term956098.getClass(), "ignoreRepaint", false);
        setBooleanField(term956098, term956098.getClass(), "visible", false);
        setBooleanField(term956098, term956098.getClass(), "enabled", false);
        setBooleanField(term956098, term956098.getClass(), "valid", false);
        setField(term956098, term956098.getClass(), "dropTarget", null);
        setField(term956098, term956098.getClass(), "popups", null);
        setField(term956098, term956098.getClass(), "name", null);
        setBooleanField(term956098, term956098.getClass(), "nameExplicitlySet", false);
        setBooleanField(term956098, term956098.getClass(), "focusable", false);
        setIntField(term956098, term956098.getClass(), "isFocusTraversableOverridden", 0);
        setField(term956098, term956098.getClass(), "focusTraversalKeys", null);
        setBooleanField(term956098, term956098.getClass(), "focusTraversalKeysEnabled", false);
        setField(term956098, term956098.getClass(), "acc", null);
        setField(term956098, term956098.getClass(), "minSize", null);
        setBooleanField(term956098, term956098.getClass(), "minSizeSet", false);
        setField(term956098, term956098.getClass(), "prefSize", null);
        setBooleanField(term956098, term956098.getClass(), "prefSizeSet", false);
        setField(term956098, term956098.getClass(), "maxSize", null);
        setBooleanField(term956098, term956098.getClass(), "maxSizeSet", false);
        setField(term956098, term956098.getClass(), "componentOrientation", null);
        setBooleanField(term956098, term956098.getClass(), "newEventsOnly", false);
        setField(term956098, term956098.getClass(), "componentListener", null);
        setField(term956098, term956098.getClass(), "focusListener", null);
        setField(term956098, term956098.getClass(), "hierarchyListener", null);
        setField(term956098, term956098.getClass(), "hierarchyBoundsListener", null);
        setField(term956098, term956098.getClass(), "keyListener", null);
        setField(term956098, term956098.getClass(), "mouseListener", null);
        setField(term956098, term956098.getClass(), "mouseMotionListener", null);
        setField(term956098, term956098.getClass(), "mouseWheelListener", null);
        setField(term956098, term956098.getClass(), "inputMethodListener", null);
        setLongField(term956098, term956098.getClass(), "eventMask", 0L);
        setField(term956098, term956098.getClass(), "changeSupport", null);
        setField(term956098, term956098.getClass(), "objectLock", null);
        setBooleanField(term956098, term956098.getClass(), "isPacked", false);
        setIntField(term956098, term956098.getClass(), "boundsOp", 0);
        setField(term956098, term956098.getClass(), "compoundShape", null);
        setField(term956098, term956098.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term956098, term956098.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term956098, term956098.getClass(), "backgroundEraseDisabled", false);
        setField(term956098, term956098.getClass(), "eventCache", null);
        setBooleanField(term956098, term956098.getClass(), "coalescingEnabled", false);
        setBooleanField(term956098, term956098.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term956098, term956098.getClass(), "componentSerializedDataVersion", 0);
        setField(term956098, term956098.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBorderless", argTypes, term956098, args);
    }

};


