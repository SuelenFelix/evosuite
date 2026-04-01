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

public class OptionsView_handleAction_6428326454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term934501;

    public OptionsView_handleAction_6428326454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term934501 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term934501, term934501.getClass(), "game", null);
        setField(term934501, term934501.getClass(), "fullscreenBox", null);
        setField(term934501, term934501.getClass(), "hardwareAccelerationBox", null);
        setField(term934501, term934501.getClass(), "improvedParallaxBox", null);
        setField(term934501, term934501.getClass(), "resolutionSelection", null);
        setField(term934501, term934501.getClass(), "uiSchemeSelection", null);
        setField(term934501, term934501.getClass(), "musicSlider", null);
        setField(term934501, term934501.getClass(), "soundSlider", null);
        setField(term934501, term934501.getClass(), "borderlessBox", null);
        setField(term934501, term934501.getClass(), "largerFontsBox", null);
        setField(term934501, term934501.getClass(), "ambientLightsBox", null);
        setField(term934501, term934501.getClass(), "lightsSlider", null);
        setBooleanField(term934501, term934501.getClass(), "resized", false);
        setField(term934501, term934501.getClass(), "borderScrollingBox", null);
        setField(term934501, term934501.getClass(), "showMinimapBox", null);
        setField(term934501, term934501.getClass(), "highContrastGridBox", null);
        setBooleanField(term934501, term934501.getClass(), "isAlignmentXSet", false);
        setFloatField(term934501, term934501.getClass(), "alignmentX", 0.0F);
        setBooleanField(term934501, term934501.getClass(), "isAlignmentYSet", false);
        setFloatField(term934501, term934501.getClass(), "alignmentY", 0.0F);
        setField(term934501, term934501.getClass(), "ui", null);
        setField(term934501, term934501.getClass(), "listenerList", null);
        setField(term934501, term934501.getClass(), "clientProperties", null);
        setField(term934501, term934501.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term934501, term934501.getClass(), "autoscrolls", false);
        setField(term934501, term934501.getClass(), "border", null);
        setIntField(term934501, term934501.getClass(), "flags", 0);
        setField(term934501, term934501.getClass(), "inputVerifier", null);
        setBooleanField(term934501, term934501.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term934501, term934501.getClass(), "paintingChild", null);
        setField(term934501, term934501.getClass(), "popupMenu", null);
        setField(term934501, term934501.getClass(), "revalidateRunnableScheduled", null);
        setField(term934501, term934501.getClass(), "focusInputMap", null);
        setField(term934501, term934501.getClass(), "ancestorInputMap", null);
        setField(term934501, term934501.getClass(), "windowInputMap", null);
        setField(term934501, term934501.getClass(), "actionMap", null);
        setField(term934501, term934501.getClass(), "aaHint", null);
        setField(term934501, term934501.getClass(), "lcdRenderingHint", null);
        setField(term934501, term934501.getClass(), "component", null);
        setField(term934501, term934501.getClass(), "layoutMgr", null);
        setField(term934501, term934501.getClass(), "dispatcher", null);
        setField(term934501, term934501.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term934501, term934501.getClass(), "focusCycleRoot", false);
        setBooleanField(term934501, term934501.getClass(), "focusTraversalPolicyProvider", false);
        setField(term934501, term934501.getClass(), "printingThreads", null);
        setBooleanField(term934501, term934501.getClass(), "printing", false);
        setField(term934501, term934501.getClass(), "containerListener", null);
        setIntField(term934501, term934501.getClass(), "listeningChildren", 0);
        setIntField(term934501, term934501.getClass(), "listeningBoundsChildren", 0);
        setIntField(term934501, term934501.getClass(), "descendantsCount", 0);
        setField(term934501, term934501.getClass(), "preserveBackgroundColor", null);
        setIntField(term934501, term934501.getClass(), "numOfHWComponents", 0);
        setIntField(term934501, term934501.getClass(), "numOfLWComponents", 0);
        setField(term934501, term934501.getClass(), "modalComp", null);
        setField(term934501, term934501.getClass(), "modalAppContext", null);
        setIntField(term934501, term934501.getClass(), "containerSerializedDataVersion", 0);
        setField(term934501, term934501.getClass(), "peer", null);
        setField(term934501, term934501.getClass(), "parent", null);
        setField(term934501, term934501.getClass(), "appContext", null);
        setIntField(term934501, term934501.getClass(), "x", 0);
        setIntField(term934501, term934501.getClass(), "y", 0);
        setIntField(term934501, term934501.getClass(), "width", 0);
        setIntField(term934501, term934501.getClass(), "height", 0);
        setField(term934501, term934501.getClass(), "foreground", null);
        setField(term934501, term934501.getClass(), "background", null);
        setField(term934501, term934501.getClass(), "font", null);
        setField(term934501, term934501.getClass(), "peerFont", null);
        setField(term934501, term934501.getClass(), "cursor", null);
        setField(term934501, term934501.getClass(), "locale", null);
        setField(term934501, term934501.getClass(), "graphicsConfig", null);
        setField(term934501, term934501.getClass(), "bufferStrategy", null);
        setBooleanField(term934501, term934501.getClass(), "ignoreRepaint", false);
        setBooleanField(term934501, term934501.getClass(), "visible", false);
        setBooleanField(term934501, term934501.getClass(), "enabled", false);
        setBooleanField(term934501, term934501.getClass(), "valid", false);
        setField(term934501, term934501.getClass(), "dropTarget", null);
        setField(term934501, term934501.getClass(), "popups", null);
        setField(term934501, term934501.getClass(), "name", null);
        setBooleanField(term934501, term934501.getClass(), "nameExplicitlySet", false);
        setBooleanField(term934501, term934501.getClass(), "focusable", false);
        setIntField(term934501, term934501.getClass(), "isFocusTraversableOverridden", 0);
        setField(term934501, term934501.getClass(), "focusTraversalKeys", null);
        setBooleanField(term934501, term934501.getClass(), "focusTraversalKeysEnabled", false);
        setField(term934501, term934501.getClass(), "acc", null);
        setField(term934501, term934501.getClass(), "minSize", null);
        setBooleanField(term934501, term934501.getClass(), "minSizeSet", false);
        setField(term934501, term934501.getClass(), "prefSize", null);
        setBooleanField(term934501, term934501.getClass(), "prefSizeSet", false);
        setField(term934501, term934501.getClass(), "maxSize", null);
        setBooleanField(term934501, term934501.getClass(), "maxSizeSet", false);
        setField(term934501, term934501.getClass(), "componentOrientation", null);
        setBooleanField(term934501, term934501.getClass(), "newEventsOnly", false);
        setField(term934501, term934501.getClass(), "componentListener", null);
        setField(term934501, term934501.getClass(), "focusListener", null);
        setField(term934501, term934501.getClass(), "hierarchyListener", null);
        setField(term934501, term934501.getClass(), "hierarchyBoundsListener", null);
        setField(term934501, term934501.getClass(), "keyListener", null);
        setField(term934501, term934501.getClass(), "mouseListener", null);
        setField(term934501, term934501.getClass(), "mouseMotionListener", null);
        setField(term934501, term934501.getClass(), "mouseWheelListener", null);
        setField(term934501, term934501.getClass(), "inputMethodListener", null);
        setLongField(term934501, term934501.getClass(), "eventMask", 0L);
        setField(term934501, term934501.getClass(), "changeSupport", null);
        setField(term934501, term934501.getClass(), "objectLock", null);
        setBooleanField(term934501, term934501.getClass(), "isPacked", false);
        setIntField(term934501, term934501.getClass(), "boundsOp", 0);
        setField(term934501, term934501.getClass(), "compoundShape", null);
        setField(term934501, term934501.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term934501, term934501.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term934501, term934501.getClass(), "backgroundEraseDisabled", false);
        setField(term934501, term934501.getClass(), "eventCache", null);
        setBooleanField(term934501, term934501.getClass(), "coalescingEnabled", false);
        setBooleanField(term934501, term934501.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term934501, term934501.getClass(), "componentSerializedDataVersion", 0);
        setField(term934501, term934501.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term934501, args);
    }

};


