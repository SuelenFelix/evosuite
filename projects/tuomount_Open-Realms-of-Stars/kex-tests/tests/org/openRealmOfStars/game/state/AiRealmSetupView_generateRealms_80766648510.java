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

public class AiRealmSetupView_generateRealms_80766648510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466456;

    public AiRealmSetupView_generateRealms_80766648510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466456 = newInstance(Class.forName("org.openRealmOfStars.game.state.AiRealmSetupView"));
        setField(term466456, term466456.getClass(), "config", null);
        setField(term466456, term466456.getClass(), "uniqueRace", null);
        setField(term466456, term466456.getClass(), "uniqueGovernment", null);
        setField(term466456, term466456.getClass(), "startEarth", null);
        setField(term466456, term466456.getClass(), "noHomeStart", null);
        setField(term466456, term466456.getClass(), "utopiaStart", null);
        setField(term466456, term466456.getClass(), "doomedStart", null);
        setField(term466456, term466456.getClass(), "comboMinimumElderRace", null);
        setField(term466456, term466456.getClass(), "comboMaximumElderRace", null);
        setBooleanField(term466456, term466456.getClass(), "generated", false);
        setBooleanField(term466456, term466456.getClass(), "isAlignmentXSet", false);
        setFloatField(term466456, term466456.getClass(), "alignmentX", 0.0F);
        setBooleanField(term466456, term466456.getClass(), "isAlignmentYSet", false);
        setFloatField(term466456, term466456.getClass(), "alignmentY", 0.0F);
        setField(term466456, term466456.getClass(), "ui", null);
        setField(term466456, term466456.getClass(), "listenerList", null);
        setField(term466456, term466456.getClass(), "clientProperties", null);
        setField(term466456, term466456.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term466456, term466456.getClass(), "autoscrolls", false);
        setField(term466456, term466456.getClass(), "border", null);
        setIntField(term466456, term466456.getClass(), "flags", 0);
        setField(term466456, term466456.getClass(), "inputVerifier", null);
        setBooleanField(term466456, term466456.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term466456, term466456.getClass(), "paintingChild", null);
        setField(term466456, term466456.getClass(), "popupMenu", null);
        setField(term466456, term466456.getClass(), "revalidateRunnableScheduled", null);
        setField(term466456, term466456.getClass(), "focusInputMap", null);
        setField(term466456, term466456.getClass(), "ancestorInputMap", null);
        setField(term466456, term466456.getClass(), "windowInputMap", null);
        setField(term466456, term466456.getClass(), "actionMap", null);
        setField(term466456, term466456.getClass(), "aaHint", null);
        setField(term466456, term466456.getClass(), "lcdRenderingHint", null);
        setField(term466456, term466456.getClass(), "component", null);
        setField(term466456, term466456.getClass(), "layoutMgr", null);
        setField(term466456, term466456.getClass(), "dispatcher", null);
        setField(term466456, term466456.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term466456, term466456.getClass(), "focusCycleRoot", false);
        setBooleanField(term466456, term466456.getClass(), "focusTraversalPolicyProvider", false);
        setField(term466456, term466456.getClass(), "printingThreads", null);
        setBooleanField(term466456, term466456.getClass(), "printing", false);
        setField(term466456, term466456.getClass(), "containerListener", null);
        setIntField(term466456, term466456.getClass(), "listeningChildren", 0);
        setIntField(term466456, term466456.getClass(), "listeningBoundsChildren", 0);
        setIntField(term466456, term466456.getClass(), "descendantsCount", 0);
        setField(term466456, term466456.getClass(), "preserveBackgroundColor", null);
        setIntField(term466456, term466456.getClass(), "numOfHWComponents", 0);
        setIntField(term466456, term466456.getClass(), "numOfLWComponents", 0);
        setField(term466456, term466456.getClass(), "modalComp", null);
        setField(term466456, term466456.getClass(), "modalAppContext", null);
        setIntField(term466456, term466456.getClass(), "containerSerializedDataVersion", 0);
        setField(term466456, term466456.getClass(), "peer", null);
        setField(term466456, term466456.getClass(), "parent", null);
        setField(term466456, term466456.getClass(), "appContext", null);
        setIntField(term466456, term466456.getClass(), "x", 0);
        setIntField(term466456, term466456.getClass(), "y", 0);
        setIntField(term466456, term466456.getClass(), "width", 0);
        setIntField(term466456, term466456.getClass(), "height", 0);
        setField(term466456, term466456.getClass(), "foreground", null);
        setField(term466456, term466456.getClass(), "background", null);
        setField(term466456, term466456.getClass(), "font", null);
        setField(term466456, term466456.getClass(), "peerFont", null);
        setField(term466456, term466456.getClass(), "cursor", null);
        setField(term466456, term466456.getClass(), "locale", null);
        setField(term466456, term466456.getClass(), "graphicsConfig", null);
        setField(term466456, term466456.getClass(), "bufferStrategy", null);
        setBooleanField(term466456, term466456.getClass(), "ignoreRepaint", false);
        setBooleanField(term466456, term466456.getClass(), "visible", false);
        setBooleanField(term466456, term466456.getClass(), "enabled", false);
        setBooleanField(term466456, term466456.getClass(), "valid", false);
        setField(term466456, term466456.getClass(), "dropTarget", null);
        setField(term466456, term466456.getClass(), "popups", null);
        setField(term466456, term466456.getClass(), "name", null);
        setBooleanField(term466456, term466456.getClass(), "nameExplicitlySet", false);
        setBooleanField(term466456, term466456.getClass(), "focusable", false);
        setIntField(term466456, term466456.getClass(), "isFocusTraversableOverridden", 0);
        setField(term466456, term466456.getClass(), "focusTraversalKeys", null);
        setBooleanField(term466456, term466456.getClass(), "focusTraversalKeysEnabled", false);
        setField(term466456, term466456.getClass(), "acc", null);
        setField(term466456, term466456.getClass(), "minSize", null);
        setBooleanField(term466456, term466456.getClass(), "minSizeSet", false);
        setField(term466456, term466456.getClass(), "prefSize", null);
        setBooleanField(term466456, term466456.getClass(), "prefSizeSet", false);
        setField(term466456, term466456.getClass(), "maxSize", null);
        setBooleanField(term466456, term466456.getClass(), "maxSizeSet", false);
        setField(term466456, term466456.getClass(), "componentOrientation", null);
        setBooleanField(term466456, term466456.getClass(), "newEventsOnly", false);
        setField(term466456, term466456.getClass(), "componentListener", null);
        setField(term466456, term466456.getClass(), "focusListener", null);
        setField(term466456, term466456.getClass(), "hierarchyListener", null);
        setField(term466456, term466456.getClass(), "hierarchyBoundsListener", null);
        setField(term466456, term466456.getClass(), "keyListener", null);
        setField(term466456, term466456.getClass(), "mouseListener", null);
        setField(term466456, term466456.getClass(), "mouseMotionListener", null);
        setField(term466456, term466456.getClass(), "mouseWheelListener", null);
        setField(term466456, term466456.getClass(), "inputMethodListener", null);
        setLongField(term466456, term466456.getClass(), "eventMask", 0L);
        setField(term466456, term466456.getClass(), "changeSupport", null);
        setField(term466456, term466456.getClass(), "objectLock", null);
        setBooleanField(term466456, term466456.getClass(), "isPacked", false);
        setIntField(term466456, term466456.getClass(), "boundsOp", 0);
        setField(term466456, term466456.getClass(), "compoundShape", null);
        setField(term466456, term466456.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term466456, term466456.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term466456, term466456.getClass(), "backgroundEraseDisabled", false);
        setField(term466456, term466456.getClass(), "eventCache", null);
        setBooleanField(term466456, term466456.getClass(), "coalescingEnabled", false);
        setBooleanField(term466456, term466456.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term466456, term466456.getClass(), "componentSerializedDataVersion", 0);
        setField(term466456, term466456.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AiRealmSetupView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateRealms", argTypes, term466456, args);
    }

};


