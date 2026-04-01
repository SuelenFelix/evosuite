package core.task.handler;

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
import static core.task.handler.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AssignmentHandler_1_remove_16184988975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221343;

    public AssignmentHandler_1_remove_16184988975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221343 = newInstance(Class.forName("core.task.handler.AssignmentHandler$1"));
        setBooleanField(term221343, term221343.getClass(), "reflectTheme", false);
        setBooleanField(term221343, term221343.getClass(), "isAlignmentXSet", false);
        setFloatField(term221343, term221343.getClass(), "alignmentX", 0.0F);
        setBooleanField(term221343, term221343.getClass(), "isAlignmentYSet", false);
        setFloatField(term221343, term221343.getClass(), "alignmentY", 0.0F);
        setField(term221343, term221343.getClass(), "ui", null);
        setField(term221343, term221343.getClass(), "listenerList", null);
        setField(term221343, term221343.getClass(), "clientProperties", null);
        setField(term221343, term221343.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term221343, term221343.getClass(), "autoscrolls", false);
        setField(term221343, term221343.getClass(), "border", null);
        setIntField(term221343, term221343.getClass(), "flags", 0);
        setField(term221343, term221343.getClass(), "inputVerifier", null);
        setBooleanField(term221343, term221343.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term221343, term221343.getClass(), "paintingChild", null);
        setField(term221343, term221343.getClass(), "popupMenu", null);
        setField(term221343, term221343.getClass(), "revalidateRunnableScheduled", null);
        setField(term221343, term221343.getClass(), "focusInputMap", null);
        setField(term221343, term221343.getClass(), "ancestorInputMap", null);
        setField(term221343, term221343.getClass(), "windowInputMap", null);
        setField(term221343, term221343.getClass(), "actionMap", null);
        setField(term221343, term221343.getClass(), "aaHint", null);
        setField(term221343, term221343.getClass(), "lcdRenderingHint", null);
        setField(term221343, term221343.getClass(), "component", null);
        setField(term221343, term221343.getClass(), "layoutMgr", null);
        setField(term221343, term221343.getClass(), "dispatcher", null);
        setField(term221343, term221343.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term221343, term221343.getClass(), "focusCycleRoot", false);
        setBooleanField(term221343, term221343.getClass(), "focusTraversalPolicyProvider", false);
        setField(term221343, term221343.getClass(), "printingThreads", null);
        setBooleanField(term221343, term221343.getClass(), "printing", false);
        setField(term221343, term221343.getClass(), "containerListener", null);
        setIntField(term221343, term221343.getClass(), "listeningChildren", 0);
        setIntField(term221343, term221343.getClass(), "listeningBoundsChildren", 0);
        setIntField(term221343, term221343.getClass(), "descendantsCount", 0);
        setField(term221343, term221343.getClass(), "preserveBackgroundColor", null);
        setIntField(term221343, term221343.getClass(), "numOfHWComponents", 0);
        setIntField(term221343, term221343.getClass(), "numOfLWComponents", 0);
        setField(term221343, term221343.getClass(), "modalComp", null);
        setField(term221343, term221343.getClass(), "modalAppContext", null);
        setIntField(term221343, term221343.getClass(), "containerSerializedDataVersion", 0);
        setField(term221343, term221343.getClass(), "peer", null);
        setField(term221343, term221343.getClass(), "parent", null);
        setField(term221343, term221343.getClass(), "appContext", null);
        setIntField(term221343, term221343.getClass(), "x", 0);
        setIntField(term221343, term221343.getClass(), "y", 0);
        setIntField(term221343, term221343.getClass(), "width", 0);
        setIntField(term221343, term221343.getClass(), "height", 0);
        setField(term221343, term221343.getClass(), "foreground", null);
        setField(term221343, term221343.getClass(), "background", null);
        setField(term221343, term221343.getClass(), "font", null);
        setField(term221343, term221343.getClass(), "peerFont", null);
        setField(term221343, term221343.getClass(), "cursor", null);
        setField(term221343, term221343.getClass(), "locale", null);
        setField(term221343, term221343.getClass(), "graphicsConfig", null);
        setField(term221343, term221343.getClass(), "bufferStrategy", null);
        setBooleanField(term221343, term221343.getClass(), "ignoreRepaint", false);
        setBooleanField(term221343, term221343.getClass(), "visible", false);
        setBooleanField(term221343, term221343.getClass(), "enabled", false);
        setBooleanField(term221343, term221343.getClass(), "valid", false);
        setField(term221343, term221343.getClass(), "dropTarget", null);
        setField(term221343, term221343.getClass(), "popups", null);
        setField(term221343, term221343.getClass(), "name", null);
        setBooleanField(term221343, term221343.getClass(), "nameExplicitlySet", false);
        setBooleanField(term221343, term221343.getClass(), "focusable", false);
        setIntField(term221343, term221343.getClass(), "isFocusTraversableOverridden", 0);
        setField(term221343, term221343.getClass(), "focusTraversalKeys", null);
        setBooleanField(term221343, term221343.getClass(), "focusTraversalKeysEnabled", false);
        setField(term221343, term221343.getClass(), "acc", null);
        setField(term221343, term221343.getClass(), "minSize", null);
        setBooleanField(term221343, term221343.getClass(), "minSizeSet", false);
        setField(term221343, term221343.getClass(), "prefSize", null);
        setBooleanField(term221343, term221343.getClass(), "prefSizeSet", false);
        setField(term221343, term221343.getClass(), "maxSize", null);
        setBooleanField(term221343, term221343.getClass(), "maxSizeSet", false);
        setField(term221343, term221343.getClass(), "componentOrientation", null);
        setBooleanField(term221343, term221343.getClass(), "newEventsOnly", false);
        setField(term221343, term221343.getClass(), "componentListener", null);
        setField(term221343, term221343.getClass(), "focusListener", null);
        setField(term221343, term221343.getClass(), "hierarchyListener", null);
        setField(term221343, term221343.getClass(), "hierarchyBoundsListener", null);
        setField(term221343, term221343.getClass(), "keyListener", null);
        setField(term221343, term221343.getClass(), "mouseListener", null);
        setField(term221343, term221343.getClass(), "mouseMotionListener", null);
        setField(term221343, term221343.getClass(), "mouseWheelListener", null);
        setField(term221343, term221343.getClass(), "inputMethodListener", null);
        setLongField(term221343, term221343.getClass(), "eventMask", 0L);
        setField(term221343, term221343.getClass(), "changeSupport", null);
        setField(term221343, term221343.getClass(), "objectLock", null);
        setBooleanField(term221343, term221343.getClass(), "isPacked", false);
        setIntField(term221343, term221343.getClass(), "boundsOp", 0);
        setField(term221343, term221343.getClass(), "compoundShape", null);
        setField(term221343, term221343.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term221343, term221343.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term221343, term221343.getClass(), "backgroundEraseDisabled", false);
        setField(term221343, term221343.getClass(), "eventCache", null);
        setBooleanField(term221343, term221343.getClass(), "coalescingEnabled", false);
        setBooleanField(term221343, term221343.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term221343, term221343.getClass(), "componentSerializedDataVersion", 0);
        setField(term221343, term221343.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.AssignmentHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term221343, args);
    }

};


