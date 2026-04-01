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

public class AiRealmSetupView_generateAmountElders_19997419557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466330;

    public AiRealmSetupView_generateAmountElders_19997419557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466330 = newInstance(Class.forName("org.openRealmOfStars.game.state.AiRealmSetupView"));
        setField(term466330, term466330.getClass(), "config", null);
        setField(term466330, term466330.getClass(), "uniqueRace", null);
        setField(term466330, term466330.getClass(), "uniqueGovernment", null);
        setField(term466330, term466330.getClass(), "startEarth", null);
        setField(term466330, term466330.getClass(), "noHomeStart", null);
        setField(term466330, term466330.getClass(), "utopiaStart", null);
        setField(term466330, term466330.getClass(), "doomedStart", null);
        setField(term466330, term466330.getClass(), "comboMinimumElderRace", null);
        setField(term466330, term466330.getClass(), "comboMaximumElderRace", null);
        setBooleanField(term466330, term466330.getClass(), "generated", false);
        setBooleanField(term466330, term466330.getClass(), "isAlignmentXSet", false);
        setFloatField(term466330, term466330.getClass(), "alignmentX", 0.0F);
        setBooleanField(term466330, term466330.getClass(), "isAlignmentYSet", false);
        setFloatField(term466330, term466330.getClass(), "alignmentY", 0.0F);
        setField(term466330, term466330.getClass(), "ui", null);
        setField(term466330, term466330.getClass(), "listenerList", null);
        setField(term466330, term466330.getClass(), "clientProperties", null);
        setField(term466330, term466330.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term466330, term466330.getClass(), "autoscrolls", false);
        setField(term466330, term466330.getClass(), "border", null);
        setIntField(term466330, term466330.getClass(), "flags", 0);
        setField(term466330, term466330.getClass(), "inputVerifier", null);
        setBooleanField(term466330, term466330.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term466330, term466330.getClass(), "paintingChild", null);
        setField(term466330, term466330.getClass(), "popupMenu", null);
        setField(term466330, term466330.getClass(), "revalidateRunnableScheduled", null);
        setField(term466330, term466330.getClass(), "focusInputMap", null);
        setField(term466330, term466330.getClass(), "ancestorInputMap", null);
        setField(term466330, term466330.getClass(), "windowInputMap", null);
        setField(term466330, term466330.getClass(), "actionMap", null);
        setField(term466330, term466330.getClass(), "aaHint", null);
        setField(term466330, term466330.getClass(), "lcdRenderingHint", null);
        setField(term466330, term466330.getClass(), "component", null);
        setField(term466330, term466330.getClass(), "layoutMgr", null);
        setField(term466330, term466330.getClass(), "dispatcher", null);
        setField(term466330, term466330.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term466330, term466330.getClass(), "focusCycleRoot", false);
        setBooleanField(term466330, term466330.getClass(), "focusTraversalPolicyProvider", false);
        setField(term466330, term466330.getClass(), "printingThreads", null);
        setBooleanField(term466330, term466330.getClass(), "printing", false);
        setField(term466330, term466330.getClass(), "containerListener", null);
        setIntField(term466330, term466330.getClass(), "listeningChildren", 0);
        setIntField(term466330, term466330.getClass(), "listeningBoundsChildren", 0);
        setIntField(term466330, term466330.getClass(), "descendantsCount", 0);
        setField(term466330, term466330.getClass(), "preserveBackgroundColor", null);
        setIntField(term466330, term466330.getClass(), "numOfHWComponents", 0);
        setIntField(term466330, term466330.getClass(), "numOfLWComponents", 0);
        setField(term466330, term466330.getClass(), "modalComp", null);
        setField(term466330, term466330.getClass(), "modalAppContext", null);
        setIntField(term466330, term466330.getClass(), "containerSerializedDataVersion", 0);
        setField(term466330, term466330.getClass(), "peer", null);
        setField(term466330, term466330.getClass(), "parent", null);
        setField(term466330, term466330.getClass(), "appContext", null);
        setIntField(term466330, term466330.getClass(), "x", 0);
        setIntField(term466330, term466330.getClass(), "y", 0);
        setIntField(term466330, term466330.getClass(), "width", 0);
        setIntField(term466330, term466330.getClass(), "height", 0);
        setField(term466330, term466330.getClass(), "foreground", null);
        setField(term466330, term466330.getClass(), "background", null);
        setField(term466330, term466330.getClass(), "font", null);
        setField(term466330, term466330.getClass(), "peerFont", null);
        setField(term466330, term466330.getClass(), "cursor", null);
        setField(term466330, term466330.getClass(), "locale", null);
        setField(term466330, term466330.getClass(), "graphicsConfig", null);
        setField(term466330, term466330.getClass(), "bufferStrategy", null);
        setBooleanField(term466330, term466330.getClass(), "ignoreRepaint", false);
        setBooleanField(term466330, term466330.getClass(), "visible", false);
        setBooleanField(term466330, term466330.getClass(), "enabled", false);
        setBooleanField(term466330, term466330.getClass(), "valid", false);
        setField(term466330, term466330.getClass(), "dropTarget", null);
        setField(term466330, term466330.getClass(), "popups", null);
        setField(term466330, term466330.getClass(), "name", null);
        setBooleanField(term466330, term466330.getClass(), "nameExplicitlySet", false);
        setBooleanField(term466330, term466330.getClass(), "focusable", false);
        setIntField(term466330, term466330.getClass(), "isFocusTraversableOverridden", 0);
        setField(term466330, term466330.getClass(), "focusTraversalKeys", null);
        setBooleanField(term466330, term466330.getClass(), "focusTraversalKeysEnabled", false);
        setField(term466330, term466330.getClass(), "acc", null);
        setField(term466330, term466330.getClass(), "minSize", null);
        setBooleanField(term466330, term466330.getClass(), "minSizeSet", false);
        setField(term466330, term466330.getClass(), "prefSize", null);
        setBooleanField(term466330, term466330.getClass(), "prefSizeSet", false);
        setField(term466330, term466330.getClass(), "maxSize", null);
        setBooleanField(term466330, term466330.getClass(), "maxSizeSet", false);
        setField(term466330, term466330.getClass(), "componentOrientation", null);
        setBooleanField(term466330, term466330.getClass(), "newEventsOnly", false);
        setField(term466330, term466330.getClass(), "componentListener", null);
        setField(term466330, term466330.getClass(), "focusListener", null);
        setField(term466330, term466330.getClass(), "hierarchyListener", null);
        setField(term466330, term466330.getClass(), "hierarchyBoundsListener", null);
        setField(term466330, term466330.getClass(), "keyListener", null);
        setField(term466330, term466330.getClass(), "mouseListener", null);
        setField(term466330, term466330.getClass(), "mouseMotionListener", null);
        setField(term466330, term466330.getClass(), "mouseWheelListener", null);
        setField(term466330, term466330.getClass(), "inputMethodListener", null);
        setLongField(term466330, term466330.getClass(), "eventMask", 0L);
        setField(term466330, term466330.getClass(), "changeSupport", null);
        setField(term466330, term466330.getClass(), "objectLock", null);
        setBooleanField(term466330, term466330.getClass(), "isPacked", false);
        setIntField(term466330, term466330.getClass(), "boundsOp", 0);
        setField(term466330, term466330.getClass(), "compoundShape", null);
        setField(term466330, term466330.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term466330, term466330.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term466330, term466330.getClass(), "backgroundEraseDisabled", false);
        setField(term466330, term466330.getClass(), "eventCache", null);
        setBooleanField(term466330, term466330.getClass(), "coalescingEnabled", false);
        setBooleanField(term466330, term466330.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term466330, term466330.getClass(), "componentSerializedDataVersion", 0);
        setField(term466330, term466330.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AiRealmSetupView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateAmountElders", argTypes, term466330, args);
    }

};


