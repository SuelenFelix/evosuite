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

public class OptionsView_isLightsEnabled_160784065426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term981741;

    public OptionsView_isLightsEnabled_160784065426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term981741 = newInstance(Class.forName("org.openRealmOfStars.game.state.OptionsView"));
        setField(term981741, term981741.getClass(), "game", null);
        setField(term981741, term981741.getClass(), "fullscreenBox", null);
        setField(term981741, term981741.getClass(), "hardwareAccelerationBox", null);
        setField(term981741, term981741.getClass(), "improvedParallaxBox", null);
        setField(term981741, term981741.getClass(), "resolutionSelection", null);
        setField(term981741, term981741.getClass(), "uiSchemeSelection", null);
        setField(term981741, term981741.getClass(), "musicSlider", null);
        setField(term981741, term981741.getClass(), "soundSlider", null);
        setField(term981741, term981741.getClass(), "borderlessBox", null);
        setField(term981741, term981741.getClass(), "largerFontsBox", null);
        setField(term981741, term981741.getClass(), "ambientLightsBox", null);
        setField(term981741, term981741.getClass(), "lightsSlider", null);
        setBooleanField(term981741, term981741.getClass(), "resized", false);
        setField(term981741, term981741.getClass(), "borderScrollingBox", null);
        setField(term981741, term981741.getClass(), "showMinimapBox", null);
        setField(term981741, term981741.getClass(), "highContrastGridBox", null);
        setBooleanField(term981741, term981741.getClass(), "isAlignmentXSet", false);
        setFloatField(term981741, term981741.getClass(), "alignmentX", 0.0F);
        setBooleanField(term981741, term981741.getClass(), "isAlignmentYSet", false);
        setFloatField(term981741, term981741.getClass(), "alignmentY", 0.0F);
        setField(term981741, term981741.getClass(), "ui", null);
        setField(term981741, term981741.getClass(), "listenerList", null);
        setField(term981741, term981741.getClass(), "clientProperties", null);
        setField(term981741, term981741.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term981741, term981741.getClass(), "autoscrolls", false);
        setField(term981741, term981741.getClass(), "border", null);
        setIntField(term981741, term981741.getClass(), "flags", 0);
        setField(term981741, term981741.getClass(), "inputVerifier", null);
        setBooleanField(term981741, term981741.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term981741, term981741.getClass(), "paintingChild", null);
        setField(term981741, term981741.getClass(), "popupMenu", null);
        setField(term981741, term981741.getClass(), "revalidateRunnableScheduled", null);
        setField(term981741, term981741.getClass(), "focusInputMap", null);
        setField(term981741, term981741.getClass(), "ancestorInputMap", null);
        setField(term981741, term981741.getClass(), "windowInputMap", null);
        setField(term981741, term981741.getClass(), "actionMap", null);
        setField(term981741, term981741.getClass(), "aaHint", null);
        setField(term981741, term981741.getClass(), "lcdRenderingHint", null);
        setField(term981741, term981741.getClass(), "component", null);
        setField(term981741, term981741.getClass(), "layoutMgr", null);
        setField(term981741, term981741.getClass(), "dispatcher", null);
        setField(term981741, term981741.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term981741, term981741.getClass(), "focusCycleRoot", false);
        setBooleanField(term981741, term981741.getClass(), "focusTraversalPolicyProvider", false);
        setField(term981741, term981741.getClass(), "printingThreads", null);
        setBooleanField(term981741, term981741.getClass(), "printing", false);
        setField(term981741, term981741.getClass(), "containerListener", null);
        setIntField(term981741, term981741.getClass(), "listeningChildren", 0);
        setIntField(term981741, term981741.getClass(), "listeningBoundsChildren", 0);
        setIntField(term981741, term981741.getClass(), "descendantsCount", 0);
        setField(term981741, term981741.getClass(), "preserveBackgroundColor", null);
        setIntField(term981741, term981741.getClass(), "numOfHWComponents", 0);
        setIntField(term981741, term981741.getClass(), "numOfLWComponents", 0);
        setField(term981741, term981741.getClass(), "modalComp", null);
        setField(term981741, term981741.getClass(), "modalAppContext", null);
        setIntField(term981741, term981741.getClass(), "containerSerializedDataVersion", 0);
        setField(term981741, term981741.getClass(), "peer", null);
        setField(term981741, term981741.getClass(), "parent", null);
        setField(term981741, term981741.getClass(), "appContext", null);
        setIntField(term981741, term981741.getClass(), "x", 0);
        setIntField(term981741, term981741.getClass(), "y", 0);
        setIntField(term981741, term981741.getClass(), "width", 0);
        setIntField(term981741, term981741.getClass(), "height", 0);
        setField(term981741, term981741.getClass(), "foreground", null);
        setField(term981741, term981741.getClass(), "background", null);
        setField(term981741, term981741.getClass(), "font", null);
        setField(term981741, term981741.getClass(), "peerFont", null);
        setField(term981741, term981741.getClass(), "cursor", null);
        setField(term981741, term981741.getClass(), "locale", null);
        setField(term981741, term981741.getClass(), "graphicsConfig", null);
        setField(term981741, term981741.getClass(), "bufferStrategy", null);
        setBooleanField(term981741, term981741.getClass(), "ignoreRepaint", false);
        setBooleanField(term981741, term981741.getClass(), "visible", false);
        setBooleanField(term981741, term981741.getClass(), "enabled", false);
        setBooleanField(term981741, term981741.getClass(), "valid", false);
        setField(term981741, term981741.getClass(), "dropTarget", null);
        setField(term981741, term981741.getClass(), "popups", null);
        setField(term981741, term981741.getClass(), "name", null);
        setBooleanField(term981741, term981741.getClass(), "nameExplicitlySet", false);
        setBooleanField(term981741, term981741.getClass(), "focusable", false);
        setIntField(term981741, term981741.getClass(), "isFocusTraversableOverridden", 0);
        setField(term981741, term981741.getClass(), "focusTraversalKeys", null);
        setBooleanField(term981741, term981741.getClass(), "focusTraversalKeysEnabled", false);
        setField(term981741, term981741.getClass(), "acc", null);
        setField(term981741, term981741.getClass(), "minSize", null);
        setBooleanField(term981741, term981741.getClass(), "minSizeSet", false);
        setField(term981741, term981741.getClass(), "prefSize", null);
        setBooleanField(term981741, term981741.getClass(), "prefSizeSet", false);
        setField(term981741, term981741.getClass(), "maxSize", null);
        setBooleanField(term981741, term981741.getClass(), "maxSizeSet", false);
        setField(term981741, term981741.getClass(), "componentOrientation", null);
        setBooleanField(term981741, term981741.getClass(), "newEventsOnly", false);
        setField(term981741, term981741.getClass(), "componentListener", null);
        setField(term981741, term981741.getClass(), "focusListener", null);
        setField(term981741, term981741.getClass(), "hierarchyListener", null);
        setField(term981741, term981741.getClass(), "hierarchyBoundsListener", null);
        setField(term981741, term981741.getClass(), "keyListener", null);
        setField(term981741, term981741.getClass(), "mouseListener", null);
        setField(term981741, term981741.getClass(), "mouseMotionListener", null);
        setField(term981741, term981741.getClass(), "mouseWheelListener", null);
        setField(term981741, term981741.getClass(), "inputMethodListener", null);
        setLongField(term981741, term981741.getClass(), "eventMask", 0L);
        setField(term981741, term981741.getClass(), "changeSupport", null);
        setField(term981741, term981741.getClass(), "objectLock", null);
        setBooleanField(term981741, term981741.getClass(), "isPacked", false);
        setIntField(term981741, term981741.getClass(), "boundsOp", 0);
        setField(term981741, term981741.getClass(), "compoundShape", null);
        setField(term981741, term981741.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term981741, term981741.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term981741, term981741.getClass(), "backgroundEraseDisabled", false);
        setField(term981741, term981741.getClass(), "eventCache", null);
        setBooleanField(term981741, term981741.getClass(), "coalescingEnabled", false);
        setBooleanField(term981741, term981741.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term981741, term981741.getClass(), "componentSerializedDataVersion", 0);
        setField(term981741, term981741.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.OptionsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLightsEnabled", argTypes, term981741, args);
    }

};


