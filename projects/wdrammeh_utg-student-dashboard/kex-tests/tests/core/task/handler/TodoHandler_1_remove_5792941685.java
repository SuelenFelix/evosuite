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

public class TodoHandler_1_remove_5792941685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2724;

    public TodoHandler_1_remove_5792941685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2724 = newInstance(Class.forName("core.task.handler.TodoHandler$1"));
        setBooleanField(term2724, term2724.getClass(), "reflectTheme", false);
        setBooleanField(term2724, term2724.getClass(), "isAlignmentXSet", false);
        setFloatField(term2724, term2724.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2724, term2724.getClass(), "isAlignmentYSet", false);
        setFloatField(term2724, term2724.getClass(), "alignmentY", 0.0F);
        setField(term2724, term2724.getClass(), "ui", null);
        setField(term2724, term2724.getClass(), "listenerList", null);
        setField(term2724, term2724.getClass(), "clientProperties", null);
        setField(term2724, term2724.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2724, term2724.getClass(), "autoscrolls", false);
        setField(term2724, term2724.getClass(), "border", null);
        setIntField(term2724, term2724.getClass(), "flags", 0);
        setField(term2724, term2724.getClass(), "inputVerifier", null);
        setBooleanField(term2724, term2724.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2724, term2724.getClass(), "paintingChild", null);
        setField(term2724, term2724.getClass(), "popupMenu", null);
        setField(term2724, term2724.getClass(), "revalidateRunnableScheduled", null);
        setField(term2724, term2724.getClass(), "focusInputMap", null);
        setField(term2724, term2724.getClass(), "ancestorInputMap", null);
        setField(term2724, term2724.getClass(), "windowInputMap", null);
        setField(term2724, term2724.getClass(), "actionMap", null);
        setField(term2724, term2724.getClass(), "aaHint", null);
        setField(term2724, term2724.getClass(), "lcdRenderingHint", null);
        setField(term2724, term2724.getClass(), "component", null);
        setField(term2724, term2724.getClass(), "layoutMgr", null);
        setField(term2724, term2724.getClass(), "dispatcher", null);
        setField(term2724, term2724.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2724, term2724.getClass(), "focusCycleRoot", false);
        setBooleanField(term2724, term2724.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2724, term2724.getClass(), "printingThreads", null);
        setBooleanField(term2724, term2724.getClass(), "printing", false);
        setField(term2724, term2724.getClass(), "containerListener", null);
        setIntField(term2724, term2724.getClass(), "listeningChildren", 0);
        setIntField(term2724, term2724.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2724, term2724.getClass(), "descendantsCount", 0);
        setField(term2724, term2724.getClass(), "preserveBackgroundColor", null);
        setIntField(term2724, term2724.getClass(), "numOfHWComponents", 0);
        setIntField(term2724, term2724.getClass(), "numOfLWComponents", 0);
        setField(term2724, term2724.getClass(), "modalComp", null);
        setField(term2724, term2724.getClass(), "modalAppContext", null);
        setIntField(term2724, term2724.getClass(), "containerSerializedDataVersion", 0);
        setField(term2724, term2724.getClass(), "peer", null);
        setField(term2724, term2724.getClass(), "parent", null);
        setField(term2724, term2724.getClass(), "appContext", null);
        setIntField(term2724, term2724.getClass(), "x", 0);
        setIntField(term2724, term2724.getClass(), "y", 0);
        setIntField(term2724, term2724.getClass(), "width", 0);
        setIntField(term2724, term2724.getClass(), "height", 0);
        setField(term2724, term2724.getClass(), "foreground", null);
        setField(term2724, term2724.getClass(), "background", null);
        setField(term2724, term2724.getClass(), "font", null);
        setField(term2724, term2724.getClass(), "peerFont", null);
        setField(term2724, term2724.getClass(), "cursor", null);
        setField(term2724, term2724.getClass(), "locale", null);
        setField(term2724, term2724.getClass(), "graphicsConfig", null);
        setField(term2724, term2724.getClass(), "bufferStrategy", null);
        setBooleanField(term2724, term2724.getClass(), "ignoreRepaint", false);
        setBooleanField(term2724, term2724.getClass(), "visible", false);
        setBooleanField(term2724, term2724.getClass(), "enabled", false);
        setBooleanField(term2724, term2724.getClass(), "valid", false);
        setField(term2724, term2724.getClass(), "dropTarget", null);
        setField(term2724, term2724.getClass(), "popups", null);
        setField(term2724, term2724.getClass(), "name", null);
        setBooleanField(term2724, term2724.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2724, term2724.getClass(), "focusable", false);
        setIntField(term2724, term2724.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2724, term2724.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2724, term2724.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2724, term2724.getClass(), "acc", null);
        setField(term2724, term2724.getClass(), "minSize", null);
        setBooleanField(term2724, term2724.getClass(), "minSizeSet", false);
        setField(term2724, term2724.getClass(), "prefSize", null);
        setBooleanField(term2724, term2724.getClass(), "prefSizeSet", false);
        setField(term2724, term2724.getClass(), "maxSize", null);
        setBooleanField(term2724, term2724.getClass(), "maxSizeSet", false);
        setField(term2724, term2724.getClass(), "componentOrientation", null);
        setBooleanField(term2724, term2724.getClass(), "newEventsOnly", false);
        setField(term2724, term2724.getClass(), "componentListener", null);
        setField(term2724, term2724.getClass(), "focusListener", null);
        setField(term2724, term2724.getClass(), "hierarchyListener", null);
        setField(term2724, term2724.getClass(), "hierarchyBoundsListener", null);
        setField(term2724, term2724.getClass(), "keyListener", null);
        setField(term2724, term2724.getClass(), "mouseListener", null);
        setField(term2724, term2724.getClass(), "mouseMotionListener", null);
        setField(term2724, term2724.getClass(), "mouseWheelListener", null);
        setField(term2724, term2724.getClass(), "inputMethodListener", null);
        setLongField(term2724, term2724.getClass(), "eventMask", 0L);
        setField(term2724, term2724.getClass(), "changeSupport", null);
        setField(term2724, term2724.getClass(), "objectLock", null);
        setBooleanField(term2724, term2724.getClass(), "isPacked", false);
        setIntField(term2724, term2724.getClass(), "boundsOp", 0);
        setField(term2724, term2724.getClass(), "compoundShape", null);
        setField(term2724, term2724.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2724, term2724.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2724, term2724.getClass(), "backgroundEraseDisabled", false);
        setField(term2724, term2724.getClass(), "eventCache", null);
        setBooleanField(term2724, term2724.getClass(), "coalescingEnabled", false);
        setBooleanField(term2724, term2724.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2724, term2724.getClass(), "componentSerializedDataVersion", 0);
        setField(term2724, term2724.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.TodoHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term2724, args);
    }

};


