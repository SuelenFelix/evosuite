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

public class AiRealmSetupView_handleActions_22127337811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466498;

    public AiRealmSetupView_handleActions_22127337811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466498 = newInstance(Class.forName("org.openRealmOfStars.game.state.AiRealmSetupView"));
        setField(term466498, term466498.getClass(), "config", null);
        setField(term466498, term466498.getClass(), "uniqueRace", null);
        setField(term466498, term466498.getClass(), "uniqueGovernment", null);
        setField(term466498, term466498.getClass(), "startEarth", null);
        setField(term466498, term466498.getClass(), "noHomeStart", null);
        setField(term466498, term466498.getClass(), "utopiaStart", null);
        setField(term466498, term466498.getClass(), "doomedStart", null);
        setField(term466498, term466498.getClass(), "comboMinimumElderRace", null);
        setField(term466498, term466498.getClass(), "comboMaximumElderRace", null);
        setBooleanField(term466498, term466498.getClass(), "generated", false);
        setBooleanField(term466498, term466498.getClass(), "isAlignmentXSet", false);
        setFloatField(term466498, term466498.getClass(), "alignmentX", 0.0F);
        setBooleanField(term466498, term466498.getClass(), "isAlignmentYSet", false);
        setFloatField(term466498, term466498.getClass(), "alignmentY", 0.0F);
        setField(term466498, term466498.getClass(), "ui", null);
        setField(term466498, term466498.getClass(), "listenerList", null);
        setField(term466498, term466498.getClass(), "clientProperties", null);
        setField(term466498, term466498.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term466498, term466498.getClass(), "autoscrolls", false);
        setField(term466498, term466498.getClass(), "border", null);
        setIntField(term466498, term466498.getClass(), "flags", 0);
        setField(term466498, term466498.getClass(), "inputVerifier", null);
        setBooleanField(term466498, term466498.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term466498, term466498.getClass(), "paintingChild", null);
        setField(term466498, term466498.getClass(), "popupMenu", null);
        setField(term466498, term466498.getClass(), "revalidateRunnableScheduled", null);
        setField(term466498, term466498.getClass(), "focusInputMap", null);
        setField(term466498, term466498.getClass(), "ancestorInputMap", null);
        setField(term466498, term466498.getClass(), "windowInputMap", null);
        setField(term466498, term466498.getClass(), "actionMap", null);
        setField(term466498, term466498.getClass(), "aaHint", null);
        setField(term466498, term466498.getClass(), "lcdRenderingHint", null);
        setField(term466498, term466498.getClass(), "component", null);
        setField(term466498, term466498.getClass(), "layoutMgr", null);
        setField(term466498, term466498.getClass(), "dispatcher", null);
        setField(term466498, term466498.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term466498, term466498.getClass(), "focusCycleRoot", false);
        setBooleanField(term466498, term466498.getClass(), "focusTraversalPolicyProvider", false);
        setField(term466498, term466498.getClass(), "printingThreads", null);
        setBooleanField(term466498, term466498.getClass(), "printing", false);
        setField(term466498, term466498.getClass(), "containerListener", null);
        setIntField(term466498, term466498.getClass(), "listeningChildren", 0);
        setIntField(term466498, term466498.getClass(), "listeningBoundsChildren", 0);
        setIntField(term466498, term466498.getClass(), "descendantsCount", 0);
        setField(term466498, term466498.getClass(), "preserveBackgroundColor", null);
        setIntField(term466498, term466498.getClass(), "numOfHWComponents", 0);
        setIntField(term466498, term466498.getClass(), "numOfLWComponents", 0);
        setField(term466498, term466498.getClass(), "modalComp", null);
        setField(term466498, term466498.getClass(), "modalAppContext", null);
        setIntField(term466498, term466498.getClass(), "containerSerializedDataVersion", 0);
        setField(term466498, term466498.getClass(), "peer", null);
        setField(term466498, term466498.getClass(), "parent", null);
        setField(term466498, term466498.getClass(), "appContext", null);
        setIntField(term466498, term466498.getClass(), "x", 0);
        setIntField(term466498, term466498.getClass(), "y", 0);
        setIntField(term466498, term466498.getClass(), "width", 0);
        setIntField(term466498, term466498.getClass(), "height", 0);
        setField(term466498, term466498.getClass(), "foreground", null);
        setField(term466498, term466498.getClass(), "background", null);
        setField(term466498, term466498.getClass(), "font", null);
        setField(term466498, term466498.getClass(), "peerFont", null);
        setField(term466498, term466498.getClass(), "cursor", null);
        setField(term466498, term466498.getClass(), "locale", null);
        setField(term466498, term466498.getClass(), "graphicsConfig", null);
        setField(term466498, term466498.getClass(), "bufferStrategy", null);
        setBooleanField(term466498, term466498.getClass(), "ignoreRepaint", false);
        setBooleanField(term466498, term466498.getClass(), "visible", false);
        setBooleanField(term466498, term466498.getClass(), "enabled", false);
        setBooleanField(term466498, term466498.getClass(), "valid", false);
        setField(term466498, term466498.getClass(), "dropTarget", null);
        setField(term466498, term466498.getClass(), "popups", null);
        setField(term466498, term466498.getClass(), "name", null);
        setBooleanField(term466498, term466498.getClass(), "nameExplicitlySet", false);
        setBooleanField(term466498, term466498.getClass(), "focusable", false);
        setIntField(term466498, term466498.getClass(), "isFocusTraversableOverridden", 0);
        setField(term466498, term466498.getClass(), "focusTraversalKeys", null);
        setBooleanField(term466498, term466498.getClass(), "focusTraversalKeysEnabled", false);
        setField(term466498, term466498.getClass(), "acc", null);
        setField(term466498, term466498.getClass(), "minSize", null);
        setBooleanField(term466498, term466498.getClass(), "minSizeSet", false);
        setField(term466498, term466498.getClass(), "prefSize", null);
        setBooleanField(term466498, term466498.getClass(), "prefSizeSet", false);
        setField(term466498, term466498.getClass(), "maxSize", null);
        setBooleanField(term466498, term466498.getClass(), "maxSizeSet", false);
        setField(term466498, term466498.getClass(), "componentOrientation", null);
        setBooleanField(term466498, term466498.getClass(), "newEventsOnly", false);
        setField(term466498, term466498.getClass(), "componentListener", null);
        setField(term466498, term466498.getClass(), "focusListener", null);
        setField(term466498, term466498.getClass(), "hierarchyListener", null);
        setField(term466498, term466498.getClass(), "hierarchyBoundsListener", null);
        setField(term466498, term466498.getClass(), "keyListener", null);
        setField(term466498, term466498.getClass(), "mouseListener", null);
        setField(term466498, term466498.getClass(), "mouseMotionListener", null);
        setField(term466498, term466498.getClass(), "mouseWheelListener", null);
        setField(term466498, term466498.getClass(), "inputMethodListener", null);
        setLongField(term466498, term466498.getClass(), "eventMask", 0L);
        setField(term466498, term466498.getClass(), "changeSupport", null);
        setField(term466498, term466498.getClass(), "objectLock", null);
        setBooleanField(term466498, term466498.getClass(), "isPacked", false);
        setIntField(term466498, term466498.getClass(), "boundsOp", 0);
        setField(term466498, term466498.getClass(), "compoundShape", null);
        setField(term466498, term466498.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term466498, term466498.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term466498, term466498.getClass(), "backgroundEraseDisabled", false);
        setField(term466498, term466498.getClass(), "eventCache", null);
        setBooleanField(term466498, term466498.getClass(), "coalescingEnabled", false);
        setBooleanField(term466498, term466498.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term466498, term466498.getClass(), "componentSerializedDataVersion", 0);
        setField(term466498, term466498.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AiRealmSetupView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleActions", argTypes, term466498, args);
    }

};


