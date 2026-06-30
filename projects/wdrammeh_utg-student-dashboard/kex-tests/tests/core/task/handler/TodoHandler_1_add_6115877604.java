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

public class TodoHandler_1_add_6115877604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2682;

    public TodoHandler_1_add_6115877604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2682 = newInstance(Class.forName("core.task.handler.TodoHandler$1"));
        setBooleanField(term2682, term2682.getClass(), "reflectTheme", false);
        setBooleanField(term2682, term2682.getClass(), "isAlignmentXSet", false);
        setFloatField(term2682, term2682.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2682, term2682.getClass(), "isAlignmentYSet", false);
        setFloatField(term2682, term2682.getClass(), "alignmentY", 0.0F);
        setField(term2682, term2682.getClass(), "ui", null);
        setField(term2682, term2682.getClass(), "listenerList", null);
        setField(term2682, term2682.getClass(), "clientProperties", null);
        setField(term2682, term2682.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2682, term2682.getClass(), "autoscrolls", false);
        setField(term2682, term2682.getClass(), "border", null);
        setIntField(term2682, term2682.getClass(), "flags", 0);
        setField(term2682, term2682.getClass(), "inputVerifier", null);
        setBooleanField(term2682, term2682.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2682, term2682.getClass(), "paintingChild", null);
        setField(term2682, term2682.getClass(), "popupMenu", null);
        setField(term2682, term2682.getClass(), "revalidateRunnableScheduled", null);
        setField(term2682, term2682.getClass(), "focusInputMap", null);
        setField(term2682, term2682.getClass(), "ancestorInputMap", null);
        setField(term2682, term2682.getClass(), "windowInputMap", null);
        setField(term2682, term2682.getClass(), "actionMap", null);
        setField(term2682, term2682.getClass(), "aaHint", null);
        setField(term2682, term2682.getClass(), "lcdRenderingHint", null);
        setField(term2682, term2682.getClass(), "component", null);
        setField(term2682, term2682.getClass(), "layoutMgr", null);
        setField(term2682, term2682.getClass(), "dispatcher", null);
        setField(term2682, term2682.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2682, term2682.getClass(), "focusCycleRoot", false);
        setBooleanField(term2682, term2682.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2682, term2682.getClass(), "printingThreads", null);
        setBooleanField(term2682, term2682.getClass(), "printing", false);
        setField(term2682, term2682.getClass(), "containerListener", null);
        setIntField(term2682, term2682.getClass(), "listeningChildren", 0);
        setIntField(term2682, term2682.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2682, term2682.getClass(), "descendantsCount", 0);
        setField(term2682, term2682.getClass(), "preserveBackgroundColor", null);
        setIntField(term2682, term2682.getClass(), "numOfHWComponents", 0);
        setIntField(term2682, term2682.getClass(), "numOfLWComponents", 0);
        setField(term2682, term2682.getClass(), "modalComp", null);
        setField(term2682, term2682.getClass(), "modalAppContext", null);
        setIntField(term2682, term2682.getClass(), "containerSerializedDataVersion", 0);
        setField(term2682, term2682.getClass(), "peer", null);
        setField(term2682, term2682.getClass(), "parent", null);
        setField(term2682, term2682.getClass(), "appContext", null);
        setIntField(term2682, term2682.getClass(), "x", 0);
        setIntField(term2682, term2682.getClass(), "y", 0);
        setIntField(term2682, term2682.getClass(), "width", 0);
        setIntField(term2682, term2682.getClass(), "height", 0);
        setField(term2682, term2682.getClass(), "foreground", null);
        setField(term2682, term2682.getClass(), "background", null);
        setField(term2682, term2682.getClass(), "font", null);
        setField(term2682, term2682.getClass(), "peerFont", null);
        setField(term2682, term2682.getClass(), "cursor", null);
        setField(term2682, term2682.getClass(), "locale", null);
        setField(term2682, term2682.getClass(), "graphicsConfig", null);
        setField(term2682, term2682.getClass(), "bufferStrategy", null);
        setBooleanField(term2682, term2682.getClass(), "ignoreRepaint", false);
        setBooleanField(term2682, term2682.getClass(), "visible", false);
        setBooleanField(term2682, term2682.getClass(), "enabled", false);
        setBooleanField(term2682, term2682.getClass(), "valid", false);
        setField(term2682, term2682.getClass(), "dropTarget", null);
        setField(term2682, term2682.getClass(), "popups", null);
        setField(term2682, term2682.getClass(), "name", null);
        setBooleanField(term2682, term2682.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2682, term2682.getClass(), "focusable", false);
        setIntField(term2682, term2682.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2682, term2682.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2682, term2682.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2682, term2682.getClass(), "acc", null);
        setField(term2682, term2682.getClass(), "minSize", null);
        setBooleanField(term2682, term2682.getClass(), "minSizeSet", false);
        setField(term2682, term2682.getClass(), "prefSize", null);
        setBooleanField(term2682, term2682.getClass(), "prefSizeSet", false);
        setField(term2682, term2682.getClass(), "maxSize", null);
        setBooleanField(term2682, term2682.getClass(), "maxSizeSet", false);
        setField(term2682, term2682.getClass(), "componentOrientation", null);
        setBooleanField(term2682, term2682.getClass(), "newEventsOnly", false);
        setField(term2682, term2682.getClass(), "componentListener", null);
        setField(term2682, term2682.getClass(), "focusListener", null);
        setField(term2682, term2682.getClass(), "hierarchyListener", null);
        setField(term2682, term2682.getClass(), "hierarchyBoundsListener", null);
        setField(term2682, term2682.getClass(), "keyListener", null);
        setField(term2682, term2682.getClass(), "mouseListener", null);
        setField(term2682, term2682.getClass(), "mouseMotionListener", null);
        setField(term2682, term2682.getClass(), "mouseWheelListener", null);
        setField(term2682, term2682.getClass(), "inputMethodListener", null);
        setLongField(term2682, term2682.getClass(), "eventMask", 0L);
        setField(term2682, term2682.getClass(), "changeSupport", null);
        setField(term2682, term2682.getClass(), "objectLock", null);
        setBooleanField(term2682, term2682.getClass(), "isPacked", false);
        setIntField(term2682, term2682.getClass(), "boundsOp", 0);
        setField(term2682, term2682.getClass(), "compoundShape", null);
        setField(term2682, term2682.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2682, term2682.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2682, term2682.getClass(), "backgroundEraseDisabled", false);
        setField(term2682, term2682.getClass(), "eventCache", null);
        setBooleanField(term2682, term2682.getClass(), "coalescingEnabled", false);
        setBooleanField(term2682, term2682.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2682, term2682.getClass(), "componentSerializedDataVersion", 0);
        setField(term2682, term2682.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.TodoHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term2682, args);
    }

};


