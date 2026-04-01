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

public class TodoHandler_2_add_6115877294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131525;

    public TodoHandler_2_add_6115877294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131525 = newInstance(Class.forName("core.task.handler.TodoHandler$2"));
        setBooleanField(term131525, term131525.getClass(), "reflectTheme", false);
        setBooleanField(term131525, term131525.getClass(), "isAlignmentXSet", false);
        setFloatField(term131525, term131525.getClass(), "alignmentX", 0.0F);
        setBooleanField(term131525, term131525.getClass(), "isAlignmentYSet", false);
        setFloatField(term131525, term131525.getClass(), "alignmentY", 0.0F);
        setField(term131525, term131525.getClass(), "ui", null);
        setField(term131525, term131525.getClass(), "listenerList", null);
        setField(term131525, term131525.getClass(), "clientProperties", null);
        setField(term131525, term131525.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term131525, term131525.getClass(), "autoscrolls", false);
        setField(term131525, term131525.getClass(), "border", null);
        setIntField(term131525, term131525.getClass(), "flags", 0);
        setField(term131525, term131525.getClass(), "inputVerifier", null);
        setBooleanField(term131525, term131525.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term131525, term131525.getClass(), "paintingChild", null);
        setField(term131525, term131525.getClass(), "popupMenu", null);
        setField(term131525, term131525.getClass(), "revalidateRunnableScheduled", null);
        setField(term131525, term131525.getClass(), "focusInputMap", null);
        setField(term131525, term131525.getClass(), "ancestorInputMap", null);
        setField(term131525, term131525.getClass(), "windowInputMap", null);
        setField(term131525, term131525.getClass(), "actionMap", null);
        setField(term131525, term131525.getClass(), "aaHint", null);
        setField(term131525, term131525.getClass(), "lcdRenderingHint", null);
        setField(term131525, term131525.getClass(), "component", null);
        setField(term131525, term131525.getClass(), "layoutMgr", null);
        setField(term131525, term131525.getClass(), "dispatcher", null);
        setField(term131525, term131525.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term131525, term131525.getClass(), "focusCycleRoot", false);
        setBooleanField(term131525, term131525.getClass(), "focusTraversalPolicyProvider", false);
        setField(term131525, term131525.getClass(), "printingThreads", null);
        setBooleanField(term131525, term131525.getClass(), "printing", false);
        setField(term131525, term131525.getClass(), "containerListener", null);
        setIntField(term131525, term131525.getClass(), "listeningChildren", 0);
        setIntField(term131525, term131525.getClass(), "listeningBoundsChildren", 0);
        setIntField(term131525, term131525.getClass(), "descendantsCount", 0);
        setField(term131525, term131525.getClass(), "preserveBackgroundColor", null);
        setIntField(term131525, term131525.getClass(), "numOfHWComponents", 0);
        setIntField(term131525, term131525.getClass(), "numOfLWComponents", 0);
        setField(term131525, term131525.getClass(), "modalComp", null);
        setField(term131525, term131525.getClass(), "modalAppContext", null);
        setIntField(term131525, term131525.getClass(), "containerSerializedDataVersion", 0);
        setField(term131525, term131525.getClass(), "peer", null);
        setField(term131525, term131525.getClass(), "parent", null);
        setField(term131525, term131525.getClass(), "appContext", null);
        setIntField(term131525, term131525.getClass(), "x", 0);
        setIntField(term131525, term131525.getClass(), "y", 0);
        setIntField(term131525, term131525.getClass(), "width", 0);
        setIntField(term131525, term131525.getClass(), "height", 0);
        setField(term131525, term131525.getClass(), "foreground", null);
        setField(term131525, term131525.getClass(), "background", null);
        setField(term131525, term131525.getClass(), "font", null);
        setField(term131525, term131525.getClass(), "peerFont", null);
        setField(term131525, term131525.getClass(), "cursor", null);
        setField(term131525, term131525.getClass(), "locale", null);
        setField(term131525, term131525.getClass(), "graphicsConfig", null);
        setField(term131525, term131525.getClass(), "bufferStrategy", null);
        setBooleanField(term131525, term131525.getClass(), "ignoreRepaint", false);
        setBooleanField(term131525, term131525.getClass(), "visible", false);
        setBooleanField(term131525, term131525.getClass(), "enabled", false);
        setBooleanField(term131525, term131525.getClass(), "valid", false);
        setField(term131525, term131525.getClass(), "dropTarget", null);
        setField(term131525, term131525.getClass(), "popups", null);
        setField(term131525, term131525.getClass(), "name", null);
        setBooleanField(term131525, term131525.getClass(), "nameExplicitlySet", false);
        setBooleanField(term131525, term131525.getClass(), "focusable", false);
        setIntField(term131525, term131525.getClass(), "isFocusTraversableOverridden", 0);
        setField(term131525, term131525.getClass(), "focusTraversalKeys", null);
        setBooleanField(term131525, term131525.getClass(), "focusTraversalKeysEnabled", false);
        setField(term131525, term131525.getClass(), "acc", null);
        setField(term131525, term131525.getClass(), "minSize", null);
        setBooleanField(term131525, term131525.getClass(), "minSizeSet", false);
        setField(term131525, term131525.getClass(), "prefSize", null);
        setBooleanField(term131525, term131525.getClass(), "prefSizeSet", false);
        setField(term131525, term131525.getClass(), "maxSize", null);
        setBooleanField(term131525, term131525.getClass(), "maxSizeSet", false);
        setField(term131525, term131525.getClass(), "componentOrientation", null);
        setBooleanField(term131525, term131525.getClass(), "newEventsOnly", false);
        setField(term131525, term131525.getClass(), "componentListener", null);
        setField(term131525, term131525.getClass(), "focusListener", null);
        setField(term131525, term131525.getClass(), "hierarchyListener", null);
        setField(term131525, term131525.getClass(), "hierarchyBoundsListener", null);
        setField(term131525, term131525.getClass(), "keyListener", null);
        setField(term131525, term131525.getClass(), "mouseListener", null);
        setField(term131525, term131525.getClass(), "mouseMotionListener", null);
        setField(term131525, term131525.getClass(), "mouseWheelListener", null);
        setField(term131525, term131525.getClass(), "inputMethodListener", null);
        setLongField(term131525, term131525.getClass(), "eventMask", 0L);
        setField(term131525, term131525.getClass(), "changeSupport", null);
        setField(term131525, term131525.getClass(), "objectLock", null);
        setBooleanField(term131525, term131525.getClass(), "isPacked", false);
        setIntField(term131525, term131525.getClass(), "boundsOp", 0);
        setField(term131525, term131525.getClass(), "compoundShape", null);
        setField(term131525, term131525.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term131525, term131525.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term131525, term131525.getClass(), "backgroundEraseDisabled", false);
        setField(term131525, term131525.getClass(), "eventCache", null);
        setBooleanField(term131525, term131525.getClass(), "coalescingEnabled", false);
        setBooleanField(term131525, term131525.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term131525, term131525.getClass(), "componentSerializedDataVersion", 0);
        setField(term131525, term131525.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.TodoHandler$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term131525, args);
    }

};


