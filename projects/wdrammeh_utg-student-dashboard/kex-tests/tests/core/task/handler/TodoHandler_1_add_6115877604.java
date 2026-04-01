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
     Object term132956;

    public TodoHandler_1_add_6115877604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132956 = newInstance(Class.forName("core.task.handler.TodoHandler$1"));
        setBooleanField(term132956, term132956.getClass(), "reflectTheme", false);
        setBooleanField(term132956, term132956.getClass(), "isAlignmentXSet", false);
        setFloatField(term132956, term132956.getClass(), "alignmentX", 0.0F);
        setBooleanField(term132956, term132956.getClass(), "isAlignmentYSet", false);
        setFloatField(term132956, term132956.getClass(), "alignmentY", 0.0F);
        setField(term132956, term132956.getClass(), "ui", null);
        setField(term132956, term132956.getClass(), "listenerList", null);
        setField(term132956, term132956.getClass(), "clientProperties", null);
        setField(term132956, term132956.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term132956, term132956.getClass(), "autoscrolls", false);
        setField(term132956, term132956.getClass(), "border", null);
        setIntField(term132956, term132956.getClass(), "flags", 0);
        setField(term132956, term132956.getClass(), "inputVerifier", null);
        setBooleanField(term132956, term132956.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term132956, term132956.getClass(), "paintingChild", null);
        setField(term132956, term132956.getClass(), "popupMenu", null);
        setField(term132956, term132956.getClass(), "revalidateRunnableScheduled", null);
        setField(term132956, term132956.getClass(), "focusInputMap", null);
        setField(term132956, term132956.getClass(), "ancestorInputMap", null);
        setField(term132956, term132956.getClass(), "windowInputMap", null);
        setField(term132956, term132956.getClass(), "actionMap", null);
        setField(term132956, term132956.getClass(), "aaHint", null);
        setField(term132956, term132956.getClass(), "lcdRenderingHint", null);
        setField(term132956, term132956.getClass(), "component", null);
        setField(term132956, term132956.getClass(), "layoutMgr", null);
        setField(term132956, term132956.getClass(), "dispatcher", null);
        setField(term132956, term132956.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term132956, term132956.getClass(), "focusCycleRoot", false);
        setBooleanField(term132956, term132956.getClass(), "focusTraversalPolicyProvider", false);
        setField(term132956, term132956.getClass(), "printingThreads", null);
        setBooleanField(term132956, term132956.getClass(), "printing", false);
        setField(term132956, term132956.getClass(), "containerListener", null);
        setIntField(term132956, term132956.getClass(), "listeningChildren", 0);
        setIntField(term132956, term132956.getClass(), "listeningBoundsChildren", 0);
        setIntField(term132956, term132956.getClass(), "descendantsCount", 0);
        setField(term132956, term132956.getClass(), "preserveBackgroundColor", null);
        setIntField(term132956, term132956.getClass(), "numOfHWComponents", 0);
        setIntField(term132956, term132956.getClass(), "numOfLWComponents", 0);
        setField(term132956, term132956.getClass(), "modalComp", null);
        setField(term132956, term132956.getClass(), "modalAppContext", null);
        setIntField(term132956, term132956.getClass(), "containerSerializedDataVersion", 0);
        setField(term132956, term132956.getClass(), "peer", null);
        setField(term132956, term132956.getClass(), "parent", null);
        setField(term132956, term132956.getClass(), "appContext", null);
        setIntField(term132956, term132956.getClass(), "x", 0);
        setIntField(term132956, term132956.getClass(), "y", 0);
        setIntField(term132956, term132956.getClass(), "width", 0);
        setIntField(term132956, term132956.getClass(), "height", 0);
        setField(term132956, term132956.getClass(), "foreground", null);
        setField(term132956, term132956.getClass(), "background", null);
        setField(term132956, term132956.getClass(), "font", null);
        setField(term132956, term132956.getClass(), "peerFont", null);
        setField(term132956, term132956.getClass(), "cursor", null);
        setField(term132956, term132956.getClass(), "locale", null);
        setField(term132956, term132956.getClass(), "graphicsConfig", null);
        setField(term132956, term132956.getClass(), "bufferStrategy", null);
        setBooleanField(term132956, term132956.getClass(), "ignoreRepaint", false);
        setBooleanField(term132956, term132956.getClass(), "visible", false);
        setBooleanField(term132956, term132956.getClass(), "enabled", false);
        setBooleanField(term132956, term132956.getClass(), "valid", false);
        setField(term132956, term132956.getClass(), "dropTarget", null);
        setField(term132956, term132956.getClass(), "popups", null);
        setField(term132956, term132956.getClass(), "name", null);
        setBooleanField(term132956, term132956.getClass(), "nameExplicitlySet", false);
        setBooleanField(term132956, term132956.getClass(), "focusable", false);
        setIntField(term132956, term132956.getClass(), "isFocusTraversableOverridden", 0);
        setField(term132956, term132956.getClass(), "focusTraversalKeys", null);
        setBooleanField(term132956, term132956.getClass(), "focusTraversalKeysEnabled", false);
        setField(term132956, term132956.getClass(), "acc", null);
        setField(term132956, term132956.getClass(), "minSize", null);
        setBooleanField(term132956, term132956.getClass(), "minSizeSet", false);
        setField(term132956, term132956.getClass(), "prefSize", null);
        setBooleanField(term132956, term132956.getClass(), "prefSizeSet", false);
        setField(term132956, term132956.getClass(), "maxSize", null);
        setBooleanField(term132956, term132956.getClass(), "maxSizeSet", false);
        setField(term132956, term132956.getClass(), "componentOrientation", null);
        setBooleanField(term132956, term132956.getClass(), "newEventsOnly", false);
        setField(term132956, term132956.getClass(), "componentListener", null);
        setField(term132956, term132956.getClass(), "focusListener", null);
        setField(term132956, term132956.getClass(), "hierarchyListener", null);
        setField(term132956, term132956.getClass(), "hierarchyBoundsListener", null);
        setField(term132956, term132956.getClass(), "keyListener", null);
        setField(term132956, term132956.getClass(), "mouseListener", null);
        setField(term132956, term132956.getClass(), "mouseMotionListener", null);
        setField(term132956, term132956.getClass(), "mouseWheelListener", null);
        setField(term132956, term132956.getClass(), "inputMethodListener", null);
        setLongField(term132956, term132956.getClass(), "eventMask", 0L);
        setField(term132956, term132956.getClass(), "changeSupport", null);
        setField(term132956, term132956.getClass(), "objectLock", null);
        setBooleanField(term132956, term132956.getClass(), "isPacked", false);
        setIntField(term132956, term132956.getClass(), "boundsOp", 0);
        setField(term132956, term132956.getClass(), "compoundShape", null);
        setField(term132956, term132956.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term132956, term132956.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term132956, term132956.getClass(), "backgroundEraseDisabled", false);
        setField(term132956, term132956.getClass(), "eventCache", null);
        setBooleanField(term132956, term132956.getClass(), "coalescingEnabled", false);
        setBooleanField(term132956, term132956.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term132956, term132956.getClass(), "componentSerializedDataVersion", 0);
        setField(term132956, term132956.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.TodoHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term132956, args);
    }

};


