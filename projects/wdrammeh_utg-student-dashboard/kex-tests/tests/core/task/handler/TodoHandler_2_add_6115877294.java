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
     Object term1238;

    public TodoHandler_2_add_6115877294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1238 = newInstance(Class.forName("core.task.handler.TodoHandler$2"));
        setBooleanField(term1238, term1238.getClass(), "reflectTheme", false);
        setBooleanField(term1238, term1238.getClass(), "isAlignmentXSet", false);
        setFloatField(term1238, term1238.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1238, term1238.getClass(), "isAlignmentYSet", false);
        setFloatField(term1238, term1238.getClass(), "alignmentY", 0.0F);
        setField(term1238, term1238.getClass(), "ui", null);
        setField(term1238, term1238.getClass(), "listenerList", null);
        setField(term1238, term1238.getClass(), "clientProperties", null);
        setField(term1238, term1238.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1238, term1238.getClass(), "autoscrolls", false);
        setField(term1238, term1238.getClass(), "border", null);
        setIntField(term1238, term1238.getClass(), "flags", 0);
        setField(term1238, term1238.getClass(), "inputVerifier", null);
        setBooleanField(term1238, term1238.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1238, term1238.getClass(), "paintingChild", null);
        setField(term1238, term1238.getClass(), "popupMenu", null);
        setField(term1238, term1238.getClass(), "revalidateRunnableScheduled", null);
        setField(term1238, term1238.getClass(), "focusInputMap", null);
        setField(term1238, term1238.getClass(), "ancestorInputMap", null);
        setField(term1238, term1238.getClass(), "windowInputMap", null);
        setField(term1238, term1238.getClass(), "actionMap", null);
        setField(term1238, term1238.getClass(), "aaHint", null);
        setField(term1238, term1238.getClass(), "lcdRenderingHint", null);
        setField(term1238, term1238.getClass(), "component", null);
        setField(term1238, term1238.getClass(), "layoutMgr", null);
        setField(term1238, term1238.getClass(), "dispatcher", null);
        setField(term1238, term1238.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1238, term1238.getClass(), "focusCycleRoot", false);
        setBooleanField(term1238, term1238.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1238, term1238.getClass(), "printingThreads", null);
        setBooleanField(term1238, term1238.getClass(), "printing", false);
        setField(term1238, term1238.getClass(), "containerListener", null);
        setIntField(term1238, term1238.getClass(), "listeningChildren", 0);
        setIntField(term1238, term1238.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1238, term1238.getClass(), "descendantsCount", 0);
        setField(term1238, term1238.getClass(), "preserveBackgroundColor", null);
        setIntField(term1238, term1238.getClass(), "numOfHWComponents", 0);
        setIntField(term1238, term1238.getClass(), "numOfLWComponents", 0);
        setField(term1238, term1238.getClass(), "modalComp", null);
        setField(term1238, term1238.getClass(), "modalAppContext", null);
        setIntField(term1238, term1238.getClass(), "containerSerializedDataVersion", 0);
        setField(term1238, term1238.getClass(), "peer", null);
        setField(term1238, term1238.getClass(), "parent", null);
        setField(term1238, term1238.getClass(), "appContext", null);
        setIntField(term1238, term1238.getClass(), "x", 0);
        setIntField(term1238, term1238.getClass(), "y", 0);
        setIntField(term1238, term1238.getClass(), "width", 0);
        setIntField(term1238, term1238.getClass(), "height", 0);
        setField(term1238, term1238.getClass(), "foreground", null);
        setField(term1238, term1238.getClass(), "background", null);
        setField(term1238, term1238.getClass(), "font", null);
        setField(term1238, term1238.getClass(), "peerFont", null);
        setField(term1238, term1238.getClass(), "cursor", null);
        setField(term1238, term1238.getClass(), "locale", null);
        setField(term1238, term1238.getClass(), "graphicsConfig", null);
        setField(term1238, term1238.getClass(), "bufferStrategy", null);
        setBooleanField(term1238, term1238.getClass(), "ignoreRepaint", false);
        setBooleanField(term1238, term1238.getClass(), "visible", false);
        setBooleanField(term1238, term1238.getClass(), "enabled", false);
        setBooleanField(term1238, term1238.getClass(), "valid", false);
        setField(term1238, term1238.getClass(), "dropTarget", null);
        setField(term1238, term1238.getClass(), "popups", null);
        setField(term1238, term1238.getClass(), "name", null);
        setBooleanField(term1238, term1238.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1238, term1238.getClass(), "focusable", false);
        setIntField(term1238, term1238.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1238, term1238.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1238, term1238.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1238, term1238.getClass(), "acc", null);
        setField(term1238, term1238.getClass(), "minSize", null);
        setBooleanField(term1238, term1238.getClass(), "minSizeSet", false);
        setField(term1238, term1238.getClass(), "prefSize", null);
        setBooleanField(term1238, term1238.getClass(), "prefSizeSet", false);
        setField(term1238, term1238.getClass(), "maxSize", null);
        setBooleanField(term1238, term1238.getClass(), "maxSizeSet", false);
        setField(term1238, term1238.getClass(), "componentOrientation", null);
        setBooleanField(term1238, term1238.getClass(), "newEventsOnly", false);
        setField(term1238, term1238.getClass(), "componentListener", null);
        setField(term1238, term1238.getClass(), "focusListener", null);
        setField(term1238, term1238.getClass(), "hierarchyListener", null);
        setField(term1238, term1238.getClass(), "hierarchyBoundsListener", null);
        setField(term1238, term1238.getClass(), "keyListener", null);
        setField(term1238, term1238.getClass(), "mouseListener", null);
        setField(term1238, term1238.getClass(), "mouseMotionListener", null);
        setField(term1238, term1238.getClass(), "mouseWheelListener", null);
        setField(term1238, term1238.getClass(), "inputMethodListener", null);
        setLongField(term1238, term1238.getClass(), "eventMask", 0L);
        setField(term1238, term1238.getClass(), "changeSupport", null);
        setField(term1238, term1238.getClass(), "objectLock", null);
        setBooleanField(term1238, term1238.getClass(), "isPacked", false);
        setIntField(term1238, term1238.getClass(), "boundsOp", 0);
        setField(term1238, term1238.getClass(), "compoundShape", null);
        setField(term1238, term1238.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1238, term1238.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1238, term1238.getClass(), "backgroundEraseDisabled", false);
        setField(term1238, term1238.getClass(), "eventCache", null);
        setBooleanField(term1238, term1238.getClass(), "coalescingEnabled", false);
        setBooleanField(term1238, term1238.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1238, term1238.getClass(), "componentSerializedDataVersion", 0);
        setField(term1238, term1238.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.TodoHandler$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term1238, args);
    }

};


