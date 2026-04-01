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
import java.lang.Integer;

public class RealmView_generateRulerDescriptionText_14183652043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2022865;
     Object term2022906;
     Object term2022908;

    public RealmView_generateRulerDescriptionText_14183652043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2022865 = newInstance(Class.forName("org.openRealmOfStars.game.state.RealmView"));
        setField(term2022865, term2022865.getClass(), "realm", null);
        setField(term2022865, term2022865.getClass(), "raceImage", null);
        setField(term2022865, term2022865.getClass(), "raceDescription", null);
        setField(term2022865, term2022865.getClass(), "leaderDescription", null);
        setField(term2022865, term2022865.getClass(), "governmentDescription", null);
        setBooleanField(term2022865, term2022865.getClass(), "isAlignmentXSet", false);
        setFloatField(term2022865, term2022865.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2022865, term2022865.getClass(), "isAlignmentYSet", false);
        setFloatField(term2022865, term2022865.getClass(), "alignmentY", 0.0F);
        setField(term2022865, term2022865.getClass(), "ui", null);
        setField(term2022865, term2022865.getClass(), "listenerList", null);
        setField(term2022865, term2022865.getClass(), "clientProperties", null);
        setField(term2022865, term2022865.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2022865, term2022865.getClass(), "autoscrolls", false);
        setField(term2022865, term2022865.getClass(), "border", null);
        setIntField(term2022865, term2022865.getClass(), "flags", 0);
        setField(term2022865, term2022865.getClass(), "inputVerifier", null);
        setBooleanField(term2022865, term2022865.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2022865, term2022865.getClass(), "paintingChild", null);
        setField(term2022865, term2022865.getClass(), "popupMenu", null);
        setField(term2022865, term2022865.getClass(), "revalidateRunnableScheduled", null);
        setField(term2022865, term2022865.getClass(), "focusInputMap", null);
        setField(term2022865, term2022865.getClass(), "ancestorInputMap", null);
        setField(term2022865, term2022865.getClass(), "windowInputMap", null);
        setField(term2022865, term2022865.getClass(), "actionMap", null);
        setField(term2022865, term2022865.getClass(), "aaHint", null);
        setField(term2022865, term2022865.getClass(), "lcdRenderingHint", null);
        setField(term2022865, term2022865.getClass(), "component", null);
        setField(term2022865, term2022865.getClass(), "layoutMgr", null);
        setField(term2022865, term2022865.getClass(), "dispatcher", null);
        setField(term2022865, term2022865.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2022865, term2022865.getClass(), "focusCycleRoot", false);
        setBooleanField(term2022865, term2022865.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2022865, term2022865.getClass(), "printingThreads", null);
        setBooleanField(term2022865, term2022865.getClass(), "printing", false);
        setField(term2022865, term2022865.getClass(), "containerListener", null);
        setIntField(term2022865, term2022865.getClass(), "listeningChildren", 0);
        setIntField(term2022865, term2022865.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2022865, term2022865.getClass(), "descendantsCount", 0);
        setField(term2022865, term2022865.getClass(), "preserveBackgroundColor", null);
        setIntField(term2022865, term2022865.getClass(), "numOfHWComponents", 0);
        setIntField(term2022865, term2022865.getClass(), "numOfLWComponents", 0);
        setField(term2022865, term2022865.getClass(), "modalComp", null);
        setField(term2022865, term2022865.getClass(), "modalAppContext", null);
        setIntField(term2022865, term2022865.getClass(), "containerSerializedDataVersion", 0);
        setField(term2022865, term2022865.getClass(), "peer", null);
        setField(term2022865, term2022865.getClass(), "parent", null);
        setField(term2022865, term2022865.getClass(), "appContext", null);
        setIntField(term2022865, term2022865.getClass(), "x", 0);
        setIntField(term2022865, term2022865.getClass(), "y", 0);
        setIntField(term2022865, term2022865.getClass(), "width", 0);
        setIntField(term2022865, term2022865.getClass(), "height", 0);
        setField(term2022865, term2022865.getClass(), "foreground", null);
        setField(term2022865, term2022865.getClass(), "background", null);
        setField(term2022865, term2022865.getClass(), "font", null);
        setField(term2022865, term2022865.getClass(), "peerFont", null);
        setField(term2022865, term2022865.getClass(), "cursor", null);
        setField(term2022865, term2022865.getClass(), "locale", null);
        setField(term2022865, term2022865.getClass(), "graphicsConfig", null);
        setField(term2022865, term2022865.getClass(), "bufferStrategy", null);
        setBooleanField(term2022865, term2022865.getClass(), "ignoreRepaint", false);
        setBooleanField(term2022865, term2022865.getClass(), "visible", false);
        setBooleanField(term2022865, term2022865.getClass(), "enabled", false);
        setBooleanField(term2022865, term2022865.getClass(), "valid", false);
        setField(term2022865, term2022865.getClass(), "dropTarget", null);
        setField(term2022865, term2022865.getClass(), "popups", null);
        setField(term2022865, term2022865.getClass(), "name", null);
        setBooleanField(term2022865, term2022865.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2022865, term2022865.getClass(), "focusable", false);
        setIntField(term2022865, term2022865.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2022865, term2022865.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2022865, term2022865.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2022865, term2022865.getClass(), "acc", null);
        setField(term2022865, term2022865.getClass(), "minSize", null);
        setBooleanField(term2022865, term2022865.getClass(), "minSizeSet", false);
        setField(term2022865, term2022865.getClass(), "prefSize", null);
        setBooleanField(term2022865, term2022865.getClass(), "prefSizeSet", false);
        setField(term2022865, term2022865.getClass(), "maxSize", null);
        setBooleanField(term2022865, term2022865.getClass(), "maxSizeSet", false);
        setField(term2022865, term2022865.getClass(), "componentOrientation", null);
        setBooleanField(term2022865, term2022865.getClass(), "newEventsOnly", false);
        setField(term2022865, term2022865.getClass(), "componentListener", null);
        setField(term2022865, term2022865.getClass(), "focusListener", null);
        setField(term2022865, term2022865.getClass(), "hierarchyListener", null);
        setField(term2022865, term2022865.getClass(), "hierarchyBoundsListener", null);
        setField(term2022865, term2022865.getClass(), "keyListener", null);
        setField(term2022865, term2022865.getClass(), "mouseListener", null);
        setField(term2022865, term2022865.getClass(), "mouseMotionListener", null);
        setField(term2022865, term2022865.getClass(), "mouseWheelListener", null);
        setField(term2022865, term2022865.getClass(), "inputMethodListener", null);
        setLongField(term2022865, term2022865.getClass(), "eventMask", 0L);
        setField(term2022865, term2022865.getClass(), "changeSupport", null);
        setField(term2022865, term2022865.getClass(), "objectLock", null);
        setBooleanField(term2022865, term2022865.getClass(), "isPacked", false);
        setIntField(term2022865, term2022865.getClass(), "boundsOp", 0);
        setField(term2022865, term2022865.getClass(), "compoundShape", null);
        setField(term2022865, term2022865.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2022865, term2022865.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2022865, term2022865.getClass(), "backgroundEraseDisabled", false);
        setField(term2022865, term2022865.getClass(), "eventCache", null);
        setBooleanField(term2022865, term2022865.getClass(), "coalescingEnabled", false);
        setBooleanField(term2022865, term2022865.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2022865, term2022865.getClass(), "componentSerializedDataVersion", 0);
        setField(term2022865, term2022865.getClass(), "accessibleContext", null);
        term2022906 = new Integer(0);
        term2022908 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.RealmView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2022906;
        args[1] = term2022908;
        callMethod(klass, "generateRulerDescriptionText", argTypes, term2022865, args);
    }

};


