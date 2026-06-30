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

public class TodoHandler_2_remove_5792941375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1280;

    public TodoHandler_2_remove_5792941375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1280 = newInstance(Class.forName("core.task.handler.TodoHandler$2"));
        setBooleanField(term1280, term1280.getClass(), "reflectTheme", false);
        setBooleanField(term1280, term1280.getClass(), "isAlignmentXSet", false);
        setFloatField(term1280, term1280.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1280, term1280.getClass(), "isAlignmentYSet", false);
        setFloatField(term1280, term1280.getClass(), "alignmentY", 0.0F);
        setField(term1280, term1280.getClass(), "ui", null);
        setField(term1280, term1280.getClass(), "listenerList", null);
        setField(term1280, term1280.getClass(), "clientProperties", null);
        setField(term1280, term1280.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1280, term1280.getClass(), "autoscrolls", false);
        setField(term1280, term1280.getClass(), "border", null);
        setIntField(term1280, term1280.getClass(), "flags", 0);
        setField(term1280, term1280.getClass(), "inputVerifier", null);
        setBooleanField(term1280, term1280.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1280, term1280.getClass(), "paintingChild", null);
        setField(term1280, term1280.getClass(), "popupMenu", null);
        setField(term1280, term1280.getClass(), "revalidateRunnableScheduled", null);
        setField(term1280, term1280.getClass(), "focusInputMap", null);
        setField(term1280, term1280.getClass(), "ancestorInputMap", null);
        setField(term1280, term1280.getClass(), "windowInputMap", null);
        setField(term1280, term1280.getClass(), "actionMap", null);
        setField(term1280, term1280.getClass(), "aaHint", null);
        setField(term1280, term1280.getClass(), "lcdRenderingHint", null);
        setField(term1280, term1280.getClass(), "component", null);
        setField(term1280, term1280.getClass(), "layoutMgr", null);
        setField(term1280, term1280.getClass(), "dispatcher", null);
        setField(term1280, term1280.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1280, term1280.getClass(), "focusCycleRoot", false);
        setBooleanField(term1280, term1280.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1280, term1280.getClass(), "printingThreads", null);
        setBooleanField(term1280, term1280.getClass(), "printing", false);
        setField(term1280, term1280.getClass(), "containerListener", null);
        setIntField(term1280, term1280.getClass(), "listeningChildren", 0);
        setIntField(term1280, term1280.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1280, term1280.getClass(), "descendantsCount", 0);
        setField(term1280, term1280.getClass(), "preserveBackgroundColor", null);
        setIntField(term1280, term1280.getClass(), "numOfHWComponents", 0);
        setIntField(term1280, term1280.getClass(), "numOfLWComponents", 0);
        setField(term1280, term1280.getClass(), "modalComp", null);
        setField(term1280, term1280.getClass(), "modalAppContext", null);
        setIntField(term1280, term1280.getClass(), "containerSerializedDataVersion", 0);
        setField(term1280, term1280.getClass(), "peer", null);
        setField(term1280, term1280.getClass(), "parent", null);
        setField(term1280, term1280.getClass(), "appContext", null);
        setIntField(term1280, term1280.getClass(), "x", 0);
        setIntField(term1280, term1280.getClass(), "y", 0);
        setIntField(term1280, term1280.getClass(), "width", 0);
        setIntField(term1280, term1280.getClass(), "height", 0);
        setField(term1280, term1280.getClass(), "foreground", null);
        setField(term1280, term1280.getClass(), "background", null);
        setField(term1280, term1280.getClass(), "font", null);
        setField(term1280, term1280.getClass(), "peerFont", null);
        setField(term1280, term1280.getClass(), "cursor", null);
        setField(term1280, term1280.getClass(), "locale", null);
        setField(term1280, term1280.getClass(), "graphicsConfig", null);
        setField(term1280, term1280.getClass(), "bufferStrategy", null);
        setBooleanField(term1280, term1280.getClass(), "ignoreRepaint", false);
        setBooleanField(term1280, term1280.getClass(), "visible", false);
        setBooleanField(term1280, term1280.getClass(), "enabled", false);
        setBooleanField(term1280, term1280.getClass(), "valid", false);
        setField(term1280, term1280.getClass(), "dropTarget", null);
        setField(term1280, term1280.getClass(), "popups", null);
        setField(term1280, term1280.getClass(), "name", null);
        setBooleanField(term1280, term1280.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1280, term1280.getClass(), "focusable", false);
        setIntField(term1280, term1280.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1280, term1280.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1280, term1280.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1280, term1280.getClass(), "acc", null);
        setField(term1280, term1280.getClass(), "minSize", null);
        setBooleanField(term1280, term1280.getClass(), "minSizeSet", false);
        setField(term1280, term1280.getClass(), "prefSize", null);
        setBooleanField(term1280, term1280.getClass(), "prefSizeSet", false);
        setField(term1280, term1280.getClass(), "maxSize", null);
        setBooleanField(term1280, term1280.getClass(), "maxSizeSet", false);
        setField(term1280, term1280.getClass(), "componentOrientation", null);
        setBooleanField(term1280, term1280.getClass(), "newEventsOnly", false);
        setField(term1280, term1280.getClass(), "componentListener", null);
        setField(term1280, term1280.getClass(), "focusListener", null);
        setField(term1280, term1280.getClass(), "hierarchyListener", null);
        setField(term1280, term1280.getClass(), "hierarchyBoundsListener", null);
        setField(term1280, term1280.getClass(), "keyListener", null);
        setField(term1280, term1280.getClass(), "mouseListener", null);
        setField(term1280, term1280.getClass(), "mouseMotionListener", null);
        setField(term1280, term1280.getClass(), "mouseWheelListener", null);
        setField(term1280, term1280.getClass(), "inputMethodListener", null);
        setLongField(term1280, term1280.getClass(), "eventMask", 0L);
        setField(term1280, term1280.getClass(), "changeSupport", null);
        setField(term1280, term1280.getClass(), "objectLock", null);
        setBooleanField(term1280, term1280.getClass(), "isPacked", false);
        setIntField(term1280, term1280.getClass(), "boundsOp", 0);
        setField(term1280, term1280.getClass(), "compoundShape", null);
        setField(term1280, term1280.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1280, term1280.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1280, term1280.getClass(), "backgroundEraseDisabled", false);
        setField(term1280, term1280.getClass(), "eventCache", null);
        setBooleanField(term1280, term1280.getClass(), "coalescingEnabled", false);
        setBooleanField(term1280, term1280.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1280, term1280.getClass(), "componentSerializedDataVersion", 0);
        setField(term1280, term1280.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.TodoHandler$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term1280, args);
    }

};


