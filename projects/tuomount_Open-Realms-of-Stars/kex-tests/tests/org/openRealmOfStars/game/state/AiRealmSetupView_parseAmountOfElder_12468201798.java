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

public class AiRealmSetupView_parseAmountOfElder_12468201798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466372;

    public AiRealmSetupView_parseAmountOfElder_12468201798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466372 = newInstance(Class.forName("org.openRealmOfStars.game.state.AiRealmSetupView"));
        setField(term466372, term466372.getClass(), "config", null);
        setField(term466372, term466372.getClass(), "uniqueRace", null);
        setField(term466372, term466372.getClass(), "uniqueGovernment", null);
        setField(term466372, term466372.getClass(), "startEarth", null);
        setField(term466372, term466372.getClass(), "noHomeStart", null);
        setField(term466372, term466372.getClass(), "utopiaStart", null);
        setField(term466372, term466372.getClass(), "doomedStart", null);
        setField(term466372, term466372.getClass(), "comboMinimumElderRace", null);
        setField(term466372, term466372.getClass(), "comboMaximumElderRace", null);
        setBooleanField(term466372, term466372.getClass(), "generated", false);
        setBooleanField(term466372, term466372.getClass(), "isAlignmentXSet", false);
        setFloatField(term466372, term466372.getClass(), "alignmentX", 0.0F);
        setBooleanField(term466372, term466372.getClass(), "isAlignmentYSet", false);
        setFloatField(term466372, term466372.getClass(), "alignmentY", 0.0F);
        setField(term466372, term466372.getClass(), "ui", null);
        setField(term466372, term466372.getClass(), "listenerList", null);
        setField(term466372, term466372.getClass(), "clientProperties", null);
        setField(term466372, term466372.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term466372, term466372.getClass(), "autoscrolls", false);
        setField(term466372, term466372.getClass(), "border", null);
        setIntField(term466372, term466372.getClass(), "flags", 0);
        setField(term466372, term466372.getClass(), "inputVerifier", null);
        setBooleanField(term466372, term466372.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term466372, term466372.getClass(), "paintingChild", null);
        setField(term466372, term466372.getClass(), "popupMenu", null);
        setField(term466372, term466372.getClass(), "revalidateRunnableScheduled", null);
        setField(term466372, term466372.getClass(), "focusInputMap", null);
        setField(term466372, term466372.getClass(), "ancestorInputMap", null);
        setField(term466372, term466372.getClass(), "windowInputMap", null);
        setField(term466372, term466372.getClass(), "actionMap", null);
        setField(term466372, term466372.getClass(), "aaHint", null);
        setField(term466372, term466372.getClass(), "lcdRenderingHint", null);
        setField(term466372, term466372.getClass(), "component", null);
        setField(term466372, term466372.getClass(), "layoutMgr", null);
        setField(term466372, term466372.getClass(), "dispatcher", null);
        setField(term466372, term466372.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term466372, term466372.getClass(), "focusCycleRoot", false);
        setBooleanField(term466372, term466372.getClass(), "focusTraversalPolicyProvider", false);
        setField(term466372, term466372.getClass(), "printingThreads", null);
        setBooleanField(term466372, term466372.getClass(), "printing", false);
        setField(term466372, term466372.getClass(), "containerListener", null);
        setIntField(term466372, term466372.getClass(), "listeningChildren", 0);
        setIntField(term466372, term466372.getClass(), "listeningBoundsChildren", 0);
        setIntField(term466372, term466372.getClass(), "descendantsCount", 0);
        setField(term466372, term466372.getClass(), "preserveBackgroundColor", null);
        setIntField(term466372, term466372.getClass(), "numOfHWComponents", 0);
        setIntField(term466372, term466372.getClass(), "numOfLWComponents", 0);
        setField(term466372, term466372.getClass(), "modalComp", null);
        setField(term466372, term466372.getClass(), "modalAppContext", null);
        setIntField(term466372, term466372.getClass(), "containerSerializedDataVersion", 0);
        setField(term466372, term466372.getClass(), "peer", null);
        setField(term466372, term466372.getClass(), "parent", null);
        setField(term466372, term466372.getClass(), "appContext", null);
        setIntField(term466372, term466372.getClass(), "x", 0);
        setIntField(term466372, term466372.getClass(), "y", 0);
        setIntField(term466372, term466372.getClass(), "width", 0);
        setIntField(term466372, term466372.getClass(), "height", 0);
        setField(term466372, term466372.getClass(), "foreground", null);
        setField(term466372, term466372.getClass(), "background", null);
        setField(term466372, term466372.getClass(), "font", null);
        setField(term466372, term466372.getClass(), "peerFont", null);
        setField(term466372, term466372.getClass(), "cursor", null);
        setField(term466372, term466372.getClass(), "locale", null);
        setField(term466372, term466372.getClass(), "graphicsConfig", null);
        setField(term466372, term466372.getClass(), "bufferStrategy", null);
        setBooleanField(term466372, term466372.getClass(), "ignoreRepaint", false);
        setBooleanField(term466372, term466372.getClass(), "visible", false);
        setBooleanField(term466372, term466372.getClass(), "enabled", false);
        setBooleanField(term466372, term466372.getClass(), "valid", false);
        setField(term466372, term466372.getClass(), "dropTarget", null);
        setField(term466372, term466372.getClass(), "popups", null);
        setField(term466372, term466372.getClass(), "name", null);
        setBooleanField(term466372, term466372.getClass(), "nameExplicitlySet", false);
        setBooleanField(term466372, term466372.getClass(), "focusable", false);
        setIntField(term466372, term466372.getClass(), "isFocusTraversableOverridden", 0);
        setField(term466372, term466372.getClass(), "focusTraversalKeys", null);
        setBooleanField(term466372, term466372.getClass(), "focusTraversalKeysEnabled", false);
        setField(term466372, term466372.getClass(), "acc", null);
        setField(term466372, term466372.getClass(), "minSize", null);
        setBooleanField(term466372, term466372.getClass(), "minSizeSet", false);
        setField(term466372, term466372.getClass(), "prefSize", null);
        setBooleanField(term466372, term466372.getClass(), "prefSizeSet", false);
        setField(term466372, term466372.getClass(), "maxSize", null);
        setBooleanField(term466372, term466372.getClass(), "maxSizeSet", false);
        setField(term466372, term466372.getClass(), "componentOrientation", null);
        setBooleanField(term466372, term466372.getClass(), "newEventsOnly", false);
        setField(term466372, term466372.getClass(), "componentListener", null);
        setField(term466372, term466372.getClass(), "focusListener", null);
        setField(term466372, term466372.getClass(), "hierarchyListener", null);
        setField(term466372, term466372.getClass(), "hierarchyBoundsListener", null);
        setField(term466372, term466372.getClass(), "keyListener", null);
        setField(term466372, term466372.getClass(), "mouseListener", null);
        setField(term466372, term466372.getClass(), "mouseMotionListener", null);
        setField(term466372, term466372.getClass(), "mouseWheelListener", null);
        setField(term466372, term466372.getClass(), "inputMethodListener", null);
        setLongField(term466372, term466372.getClass(), "eventMask", 0L);
        setField(term466372, term466372.getClass(), "changeSupport", null);
        setField(term466372, term466372.getClass(), "objectLock", null);
        setBooleanField(term466372, term466372.getClass(), "isPacked", false);
        setIntField(term466372, term466372.getClass(), "boundsOp", 0);
        setField(term466372, term466372.getClass(), "compoundShape", null);
        setField(term466372, term466372.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term466372, term466372.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term466372, term466372.getClass(), "backgroundEraseDisabled", false);
        setField(term466372, term466372.getClass(), "eventCache", null);
        setBooleanField(term466372, term466372.getClass(), "coalescingEnabled", false);
        setBooleanField(term466372, term466372.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term466372, term466372.getClass(), "componentSerializedDataVersion", 0);
        setField(term466372, term466372.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AiRealmSetupView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parseAmountOfElder", argTypes, term466372, args);
    }

};


