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

public class OptionsView_getLargerFonts_56737953522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term973256;

    public OptionsView_getLargerFonts_56737953522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term973256 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term973256, term973256.getClass(), "game", null);
        setField(term973256, term973256.getClass(), "fullscreenBox", null);
        setField(term973256, term973256.getClass(), "hardwareAccelerationBox", null);
        setField(term973256, term973256.getClass(), "improvedParallaxBox", null);
        setField(term973256, term973256.getClass(), "resolutionSelection", null);
        setField(term973256, term973256.getClass(), "uiSchemeSelection", null);
        setField(term973256, term973256.getClass(), "musicSlider", null);
        setField(term973256, term973256.getClass(), "soundSlider", null);
        setField(term973256, term973256.getClass(), "borderlessBox", null);
        setField(term973256, term973256.getClass(), "largerFontsBox", null);
        setField(term973256, term973256.getClass(), "ambientLightsBox", null);
        setField(term973256, term973256.getClass(), "lightsSlider", null);
        setBooleanField(term973256, term973256.getClass(), "resized", false);
        setField(term973256, term973256.getClass(), "borderScrollingBox", null);
        setField(term973256, term973256.getClass(), "showMinimapBox", null);
        setField(term973256, term973256.getClass(), "highContrastGridBox", null);
        setBooleanField(term973256, term973256.getClass(), "isAlignmentXSet", false);
        setFloatField(term973256, term973256.getClass(), "alignmentX", 0.0F);
        setBooleanField(term973256, term973256.getClass(), "isAlignmentYSet", false);
        setFloatField(term973256, term973256.getClass(), "alignmentY", 0.0F);
        setField(term973256, term973256.getClass(), "ui", null);
        setField(term973256, term973256.getClass(), "listenerList", null);
        setField(term973256, term973256.getClass(), "clientProperties", null);
        setField(term973256, term973256.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term973256, term973256.getClass(), "autoscrolls", false);
        setField(term973256, term973256.getClass(), "border", null);
        setIntField(term973256, term973256.getClass(), "flags", 0);
        setField(term973256, term973256.getClass(), "inputVerifier", null);
        setBooleanField(term973256, term973256.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term973256, term973256.getClass(), "paintingChild", null);
        setField(term973256, term973256.getClass(), "popupMenu", null);
        setField(term973256, term973256.getClass(), "revalidateRunnableScheduled", null);
        setField(term973256, term973256.getClass(), "focusInputMap", null);
        setField(term973256, term973256.getClass(), "ancestorInputMap", null);
        setField(term973256, term973256.getClass(), "windowInputMap", null);
        setField(term973256, term973256.getClass(), "actionMap", null);
        setField(term973256, term973256.getClass(), "aaHint", null);
        setField(term973256, term973256.getClass(), "lcdRenderingHint", null);
        setField(term973256, term973256.getClass(), "component", null);
        setField(term973256, term973256.getClass(), "layoutMgr", null);
        setField(term973256, term973256.getClass(), "dispatcher", null);
        setField(term973256, term973256.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term973256, term973256.getClass(), "focusCycleRoot", false);
        setBooleanField(term973256, term973256.getClass(), "focusTraversalPolicyProvider", false);
        setField(term973256, term973256.getClass(), "printingThreads", null);
        setBooleanField(term973256, term973256.getClass(), "printing", false);
        setField(term973256, term973256.getClass(), "containerListener", null);
        setIntField(term973256, term973256.getClass(), "listeningChildren", 0);
        setIntField(term973256, term973256.getClass(), "listeningBoundsChildren", 0);
        setIntField(term973256, term973256.getClass(), "descendantsCount", 0);
        setField(term973256, term973256.getClass(), "preserveBackgroundColor", null);
        setIntField(term973256, term973256.getClass(), "numOfHWComponents", 0);
        setIntField(term973256, term973256.getClass(), "numOfLWComponents", 0);
        setField(term973256, term973256.getClass(), "modalComp", null);
        setField(term973256, term973256.getClass(), "modalAppContext", null);
        setIntField(term973256, term973256.getClass(), "containerSerializedDataVersion", 0);
        setField(term973256, term973256.getClass(), "peer", null);
        setField(term973256, term973256.getClass(), "parent", null);
        setField(term973256, term973256.getClass(), "appContext", null);
        setIntField(term973256, term973256.getClass(), "x", 0);
        setIntField(term973256, term973256.getClass(), "y", 0);
        setIntField(term973256, term973256.getClass(), "width", 0);
        setIntField(term973256, term973256.getClass(), "height", 0);
        setField(term973256, term973256.getClass(), "foreground", null);
        setField(term973256, term973256.getClass(), "background", null);
        setField(term973256, term973256.getClass(), "font", null);
        setField(term973256, term973256.getClass(), "peerFont", null);
        setField(term973256, term973256.getClass(), "cursor", null);
        setField(term973256, term973256.getClass(), "locale", null);
        setField(term973256, term973256.getClass(), "graphicsConfig", null);
        setField(term973256, term973256.getClass(), "bufferStrategy", null);
        setBooleanField(term973256, term973256.getClass(), "ignoreRepaint", false);
        setBooleanField(term973256, term973256.getClass(), "visible", false);
        setBooleanField(term973256, term973256.getClass(), "enabled", false);
        setBooleanField(term973256, term973256.getClass(), "valid", false);
        setField(term973256, term973256.getClass(), "dropTarget", null);
        setField(term973256, term973256.getClass(), "popups", null);
        setField(term973256, term973256.getClass(), "name", null);
        setBooleanField(term973256, term973256.getClass(), "nameExplicitlySet", false);
        setBooleanField(term973256, term973256.getClass(), "focusable", false);
        setIntField(term973256, term973256.getClass(), "isFocusTraversableOverridden", 0);
        setField(term973256, term973256.getClass(), "focusTraversalKeys", null);
        setBooleanField(term973256, term973256.getClass(), "focusTraversalKeysEnabled", false);
        setField(term973256, term973256.getClass(), "acc", null);
        setField(term973256, term973256.getClass(), "minSize", null);
        setBooleanField(term973256, term973256.getClass(), "minSizeSet", false);
        setField(term973256, term973256.getClass(), "prefSize", null);
        setBooleanField(term973256, term973256.getClass(), "prefSizeSet", false);
        setField(term973256, term973256.getClass(), "maxSize", null);
        setBooleanField(term973256, term973256.getClass(), "maxSizeSet", false);
        setField(term973256, term973256.getClass(), "componentOrientation", null);
        setBooleanField(term973256, term973256.getClass(), "newEventsOnly", false);
        setField(term973256, term973256.getClass(), "componentListener", null);
        setField(term973256, term973256.getClass(), "focusListener", null);
        setField(term973256, term973256.getClass(), "hierarchyListener", null);
        setField(term973256, term973256.getClass(), "hierarchyBoundsListener", null);
        setField(term973256, term973256.getClass(), "keyListener", null);
        setField(term973256, term973256.getClass(), "mouseListener", null);
        setField(term973256, term973256.getClass(), "mouseMotionListener", null);
        setField(term973256, term973256.getClass(), "mouseWheelListener", null);
        setField(term973256, term973256.getClass(), "inputMethodListener", null);
        setLongField(term973256, term973256.getClass(), "eventMask", 0L);
        setField(term973256, term973256.getClass(), "changeSupport", null);
        setField(term973256, term973256.getClass(), "objectLock", null);
        setBooleanField(term973256, term973256.getClass(), "isPacked", false);
        setIntField(term973256, term973256.getClass(), "boundsOp", 0);
        setField(term973256, term973256.getClass(), "compoundShape", null);
        setField(term973256, term973256.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term973256, term973256.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term973256, term973256.getClass(), "backgroundEraseDisabled", false);
        setField(term973256, term973256.getClass(), "eventCache", null);
        setBooleanField(term973256, term973256.getClass(), "coalescingEnabled", false);
        setBooleanField(term973256, term973256.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term973256, term973256.getClass(), "componentSerializedDataVersion", 0);
        setField(term973256, term973256.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLargerFonts", argTypes, term973256, args);
    }

};


