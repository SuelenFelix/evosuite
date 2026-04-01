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

public class OptionsView_isBorderScrolling_77551167128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term986055;

    public OptionsView_isBorderScrolling_77551167128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term986055 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term986055, term986055.getClass(), "game", null);
        setField(term986055, term986055.getClass(), "fullscreenBox", null);
        setField(term986055, term986055.getClass(), "hardwareAccelerationBox", null);
        setField(term986055, term986055.getClass(), "improvedParallaxBox", null);
        setField(term986055, term986055.getClass(), "resolutionSelection", null);
        setField(term986055, term986055.getClass(), "uiSchemeSelection", null);
        setField(term986055, term986055.getClass(), "musicSlider", null);
        setField(term986055, term986055.getClass(), "soundSlider", null);
        setField(term986055, term986055.getClass(), "borderlessBox", null);
        setField(term986055, term986055.getClass(), "largerFontsBox", null);
        setField(term986055, term986055.getClass(), "ambientLightsBox", null);
        setField(term986055, term986055.getClass(), "lightsSlider", null);
        setBooleanField(term986055, term986055.getClass(), "resized", false);
        setField(term986055, term986055.getClass(), "borderScrollingBox", null);
        setField(term986055, term986055.getClass(), "showMinimapBox", null);
        setField(term986055, term986055.getClass(), "highContrastGridBox", null);
        setBooleanField(term986055, term986055.getClass(), "isAlignmentXSet", false);
        setFloatField(term986055, term986055.getClass(), "alignmentX", 0.0F);
        setBooleanField(term986055, term986055.getClass(), "isAlignmentYSet", false);
        setFloatField(term986055, term986055.getClass(), "alignmentY", 0.0F);
        setField(term986055, term986055.getClass(), "ui", null);
        setField(term986055, term986055.getClass(), "listenerList", null);
        setField(term986055, term986055.getClass(), "clientProperties", null);
        setField(term986055, term986055.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term986055, term986055.getClass(), "autoscrolls", false);
        setField(term986055, term986055.getClass(), "border", null);
        setIntField(term986055, term986055.getClass(), "flags", 0);
        setField(term986055, term986055.getClass(), "inputVerifier", null);
        setBooleanField(term986055, term986055.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term986055, term986055.getClass(), "paintingChild", null);
        setField(term986055, term986055.getClass(), "popupMenu", null);
        setField(term986055, term986055.getClass(), "revalidateRunnableScheduled", null);
        setField(term986055, term986055.getClass(), "focusInputMap", null);
        setField(term986055, term986055.getClass(), "ancestorInputMap", null);
        setField(term986055, term986055.getClass(), "windowInputMap", null);
        setField(term986055, term986055.getClass(), "actionMap", null);
        setField(term986055, term986055.getClass(), "aaHint", null);
        setField(term986055, term986055.getClass(), "lcdRenderingHint", null);
        setField(term986055, term986055.getClass(), "component", null);
        setField(term986055, term986055.getClass(), "layoutMgr", null);
        setField(term986055, term986055.getClass(), "dispatcher", null);
        setField(term986055, term986055.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term986055, term986055.getClass(), "focusCycleRoot", false);
        setBooleanField(term986055, term986055.getClass(), "focusTraversalPolicyProvider", false);
        setField(term986055, term986055.getClass(), "printingThreads", null);
        setBooleanField(term986055, term986055.getClass(), "printing", false);
        setField(term986055, term986055.getClass(), "containerListener", null);
        setIntField(term986055, term986055.getClass(), "listeningChildren", 0);
        setIntField(term986055, term986055.getClass(), "listeningBoundsChildren", 0);
        setIntField(term986055, term986055.getClass(), "descendantsCount", 0);
        setField(term986055, term986055.getClass(), "preserveBackgroundColor", null);
        setIntField(term986055, term986055.getClass(), "numOfHWComponents", 0);
        setIntField(term986055, term986055.getClass(), "numOfLWComponents", 0);
        setField(term986055, term986055.getClass(), "modalComp", null);
        setField(term986055, term986055.getClass(), "modalAppContext", null);
        setIntField(term986055, term986055.getClass(), "containerSerializedDataVersion", 0);
        setField(term986055, term986055.getClass(), "peer", null);
        setField(term986055, term986055.getClass(), "parent", null);
        setField(term986055, term986055.getClass(), "appContext", null);
        setIntField(term986055, term986055.getClass(), "x", 0);
        setIntField(term986055, term986055.getClass(), "y", 0);
        setIntField(term986055, term986055.getClass(), "width", 0);
        setIntField(term986055, term986055.getClass(), "height", 0);
        setField(term986055, term986055.getClass(), "foreground", null);
        setField(term986055, term986055.getClass(), "background", null);
        setField(term986055, term986055.getClass(), "font", null);
        setField(term986055, term986055.getClass(), "peerFont", null);
        setField(term986055, term986055.getClass(), "cursor", null);
        setField(term986055, term986055.getClass(), "locale", null);
        setField(term986055, term986055.getClass(), "graphicsConfig", null);
        setField(term986055, term986055.getClass(), "bufferStrategy", null);
        setBooleanField(term986055, term986055.getClass(), "ignoreRepaint", false);
        setBooleanField(term986055, term986055.getClass(), "visible", false);
        setBooleanField(term986055, term986055.getClass(), "enabled", false);
        setBooleanField(term986055, term986055.getClass(), "valid", false);
        setField(term986055, term986055.getClass(), "dropTarget", null);
        setField(term986055, term986055.getClass(), "popups", null);
        setField(term986055, term986055.getClass(), "name", null);
        setBooleanField(term986055, term986055.getClass(), "nameExplicitlySet", false);
        setBooleanField(term986055, term986055.getClass(), "focusable", false);
        setIntField(term986055, term986055.getClass(), "isFocusTraversableOverridden", 0);
        setField(term986055, term986055.getClass(), "focusTraversalKeys", null);
        setBooleanField(term986055, term986055.getClass(), "focusTraversalKeysEnabled", false);
        setField(term986055, term986055.getClass(), "acc", null);
        setField(term986055, term986055.getClass(), "minSize", null);
        setBooleanField(term986055, term986055.getClass(), "minSizeSet", false);
        setField(term986055, term986055.getClass(), "prefSize", null);
        setBooleanField(term986055, term986055.getClass(), "prefSizeSet", false);
        setField(term986055, term986055.getClass(), "maxSize", null);
        setBooleanField(term986055, term986055.getClass(), "maxSizeSet", false);
        setField(term986055, term986055.getClass(), "componentOrientation", null);
        setBooleanField(term986055, term986055.getClass(), "newEventsOnly", false);
        setField(term986055, term986055.getClass(), "componentListener", null);
        setField(term986055, term986055.getClass(), "focusListener", null);
        setField(term986055, term986055.getClass(), "hierarchyListener", null);
        setField(term986055, term986055.getClass(), "hierarchyBoundsListener", null);
        setField(term986055, term986055.getClass(), "keyListener", null);
        setField(term986055, term986055.getClass(), "mouseListener", null);
        setField(term986055, term986055.getClass(), "mouseMotionListener", null);
        setField(term986055, term986055.getClass(), "mouseWheelListener", null);
        setField(term986055, term986055.getClass(), "inputMethodListener", null);
        setLongField(term986055, term986055.getClass(), "eventMask", 0L);
        setField(term986055, term986055.getClass(), "changeSupport", null);
        setField(term986055, term986055.getClass(), "objectLock", null);
        setBooleanField(term986055, term986055.getClass(), "isPacked", false);
        setIntField(term986055, term986055.getClass(), "boundsOp", 0);
        setField(term986055, term986055.getClass(), "compoundShape", null);
        setField(term986055, term986055.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term986055, term986055.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term986055, term986055.getClass(), "backgroundEraseDisabled", false);
        setField(term986055, term986055.getClass(), "eventCache", null);
        setBooleanField(term986055, term986055.getClass(), "coalescingEnabled", false);
        setBooleanField(term986055, term986055.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term986055, term986055.getClass(), "componentSerializedDataVersion", 0);
        setField(term986055, term986055.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBorderScrolling", argTypes, term986055, args);
    }

};


