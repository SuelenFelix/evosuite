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
     Object term132998;

    public TodoHandler_1_remove_5792941685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132998 = newInstance(Class.forName("core.task.handler.TodoHandler$1"));
        setBooleanField(term132998, term132998.getClass(), "reflectTheme", false);
        setBooleanField(term132998, term132998.getClass(), "isAlignmentXSet", false);
        setFloatField(term132998, term132998.getClass(), "alignmentX", 0.0F);
        setBooleanField(term132998, term132998.getClass(), "isAlignmentYSet", false);
        setFloatField(term132998, term132998.getClass(), "alignmentY", 0.0F);
        setField(term132998, term132998.getClass(), "ui", null);
        setField(term132998, term132998.getClass(), "listenerList", null);
        setField(term132998, term132998.getClass(), "clientProperties", null);
        setField(term132998, term132998.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term132998, term132998.getClass(), "autoscrolls", false);
        setField(term132998, term132998.getClass(), "border", null);
        setIntField(term132998, term132998.getClass(), "flags", 0);
        setField(term132998, term132998.getClass(), "inputVerifier", null);
        setBooleanField(term132998, term132998.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term132998, term132998.getClass(), "paintingChild", null);
        setField(term132998, term132998.getClass(), "popupMenu", null);
        setField(term132998, term132998.getClass(), "revalidateRunnableScheduled", null);
        setField(term132998, term132998.getClass(), "focusInputMap", null);
        setField(term132998, term132998.getClass(), "ancestorInputMap", null);
        setField(term132998, term132998.getClass(), "windowInputMap", null);
        setField(term132998, term132998.getClass(), "actionMap", null);
        setField(term132998, term132998.getClass(), "aaHint", null);
        setField(term132998, term132998.getClass(), "lcdRenderingHint", null);
        setField(term132998, term132998.getClass(), "component", null);
        setField(term132998, term132998.getClass(), "layoutMgr", null);
        setField(term132998, term132998.getClass(), "dispatcher", null);
        setField(term132998, term132998.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term132998, term132998.getClass(), "focusCycleRoot", false);
        setBooleanField(term132998, term132998.getClass(), "focusTraversalPolicyProvider", false);
        setField(term132998, term132998.getClass(), "printingThreads", null);
        setBooleanField(term132998, term132998.getClass(), "printing", false);
        setField(term132998, term132998.getClass(), "containerListener", null);
        setIntField(term132998, term132998.getClass(), "listeningChildren", 0);
        setIntField(term132998, term132998.getClass(), "listeningBoundsChildren", 0);
        setIntField(term132998, term132998.getClass(), "descendantsCount", 0);
        setField(term132998, term132998.getClass(), "preserveBackgroundColor", null);
        setIntField(term132998, term132998.getClass(), "numOfHWComponents", 0);
        setIntField(term132998, term132998.getClass(), "numOfLWComponents", 0);
        setField(term132998, term132998.getClass(), "modalComp", null);
        setField(term132998, term132998.getClass(), "modalAppContext", null);
        setIntField(term132998, term132998.getClass(), "containerSerializedDataVersion", 0);
        setField(term132998, term132998.getClass(), "peer", null);
        setField(term132998, term132998.getClass(), "parent", null);
        setField(term132998, term132998.getClass(), "appContext", null);
        setIntField(term132998, term132998.getClass(), "x", 0);
        setIntField(term132998, term132998.getClass(), "y", 0);
        setIntField(term132998, term132998.getClass(), "width", 0);
        setIntField(term132998, term132998.getClass(), "height", 0);
        setField(term132998, term132998.getClass(), "foreground", null);
        setField(term132998, term132998.getClass(), "background", null);
        setField(term132998, term132998.getClass(), "font", null);
        setField(term132998, term132998.getClass(), "peerFont", null);
        setField(term132998, term132998.getClass(), "cursor", null);
        setField(term132998, term132998.getClass(), "locale", null);
        setField(term132998, term132998.getClass(), "graphicsConfig", null);
        setField(term132998, term132998.getClass(), "bufferStrategy", null);
        setBooleanField(term132998, term132998.getClass(), "ignoreRepaint", false);
        setBooleanField(term132998, term132998.getClass(), "visible", false);
        setBooleanField(term132998, term132998.getClass(), "enabled", false);
        setBooleanField(term132998, term132998.getClass(), "valid", false);
        setField(term132998, term132998.getClass(), "dropTarget", null);
        setField(term132998, term132998.getClass(), "popups", null);
        setField(term132998, term132998.getClass(), "name", null);
        setBooleanField(term132998, term132998.getClass(), "nameExplicitlySet", false);
        setBooleanField(term132998, term132998.getClass(), "focusable", false);
        setIntField(term132998, term132998.getClass(), "isFocusTraversableOverridden", 0);
        setField(term132998, term132998.getClass(), "focusTraversalKeys", null);
        setBooleanField(term132998, term132998.getClass(), "focusTraversalKeysEnabled", false);
        setField(term132998, term132998.getClass(), "acc", null);
        setField(term132998, term132998.getClass(), "minSize", null);
        setBooleanField(term132998, term132998.getClass(), "minSizeSet", false);
        setField(term132998, term132998.getClass(), "prefSize", null);
        setBooleanField(term132998, term132998.getClass(), "prefSizeSet", false);
        setField(term132998, term132998.getClass(), "maxSize", null);
        setBooleanField(term132998, term132998.getClass(), "maxSizeSet", false);
        setField(term132998, term132998.getClass(), "componentOrientation", null);
        setBooleanField(term132998, term132998.getClass(), "newEventsOnly", false);
        setField(term132998, term132998.getClass(), "componentListener", null);
        setField(term132998, term132998.getClass(), "focusListener", null);
        setField(term132998, term132998.getClass(), "hierarchyListener", null);
        setField(term132998, term132998.getClass(), "hierarchyBoundsListener", null);
        setField(term132998, term132998.getClass(), "keyListener", null);
        setField(term132998, term132998.getClass(), "mouseListener", null);
        setField(term132998, term132998.getClass(), "mouseMotionListener", null);
        setField(term132998, term132998.getClass(), "mouseWheelListener", null);
        setField(term132998, term132998.getClass(), "inputMethodListener", null);
        setLongField(term132998, term132998.getClass(), "eventMask", 0L);
        setField(term132998, term132998.getClass(), "changeSupport", null);
        setField(term132998, term132998.getClass(), "objectLock", null);
        setBooleanField(term132998, term132998.getClass(), "isPacked", false);
        setIntField(term132998, term132998.getClass(), "boundsOp", 0);
        setField(term132998, term132998.getClass(), "compoundShape", null);
        setField(term132998, term132998.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term132998, term132998.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term132998, term132998.getClass(), "backgroundEraseDisabled", false);
        setField(term132998, term132998.getClass(), "eventCache", null);
        setBooleanField(term132998, term132998.getClass(), "coalescingEnabled", false);
        setBooleanField(term132998, term132998.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term132998, term132998.getClass(), "componentSerializedDataVersion", 0);
        setField(term132998, term132998.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.TodoHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term132998, args);
    }

};


