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
     Object term131567;

    public TodoHandler_2_remove_5792941375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131567 = newInstance(Class.forName("core.task.handler.TodoHandler$2"));
        setBooleanField(term131567, term131567.getClass(), "reflectTheme", false);
        setBooleanField(term131567, term131567.getClass(), "isAlignmentXSet", false);
        setFloatField(term131567, term131567.getClass(), "alignmentX", 0.0F);
        setBooleanField(term131567, term131567.getClass(), "isAlignmentYSet", false);
        setFloatField(term131567, term131567.getClass(), "alignmentY", 0.0F);
        setField(term131567, term131567.getClass(), "ui", null);
        setField(term131567, term131567.getClass(), "listenerList", null);
        setField(term131567, term131567.getClass(), "clientProperties", null);
        setField(term131567, term131567.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term131567, term131567.getClass(), "autoscrolls", false);
        setField(term131567, term131567.getClass(), "border", null);
        setIntField(term131567, term131567.getClass(), "flags", 0);
        setField(term131567, term131567.getClass(), "inputVerifier", null);
        setBooleanField(term131567, term131567.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term131567, term131567.getClass(), "paintingChild", null);
        setField(term131567, term131567.getClass(), "popupMenu", null);
        setField(term131567, term131567.getClass(), "revalidateRunnableScheduled", null);
        setField(term131567, term131567.getClass(), "focusInputMap", null);
        setField(term131567, term131567.getClass(), "ancestorInputMap", null);
        setField(term131567, term131567.getClass(), "windowInputMap", null);
        setField(term131567, term131567.getClass(), "actionMap", null);
        setField(term131567, term131567.getClass(), "aaHint", null);
        setField(term131567, term131567.getClass(), "lcdRenderingHint", null);
        setField(term131567, term131567.getClass(), "component", null);
        setField(term131567, term131567.getClass(), "layoutMgr", null);
        setField(term131567, term131567.getClass(), "dispatcher", null);
        setField(term131567, term131567.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term131567, term131567.getClass(), "focusCycleRoot", false);
        setBooleanField(term131567, term131567.getClass(), "focusTraversalPolicyProvider", false);
        setField(term131567, term131567.getClass(), "printingThreads", null);
        setBooleanField(term131567, term131567.getClass(), "printing", false);
        setField(term131567, term131567.getClass(), "containerListener", null);
        setIntField(term131567, term131567.getClass(), "listeningChildren", 0);
        setIntField(term131567, term131567.getClass(), "listeningBoundsChildren", 0);
        setIntField(term131567, term131567.getClass(), "descendantsCount", 0);
        setField(term131567, term131567.getClass(), "preserveBackgroundColor", null);
        setIntField(term131567, term131567.getClass(), "numOfHWComponents", 0);
        setIntField(term131567, term131567.getClass(), "numOfLWComponents", 0);
        setField(term131567, term131567.getClass(), "modalComp", null);
        setField(term131567, term131567.getClass(), "modalAppContext", null);
        setIntField(term131567, term131567.getClass(), "containerSerializedDataVersion", 0);
        setField(term131567, term131567.getClass(), "peer", null);
        setField(term131567, term131567.getClass(), "parent", null);
        setField(term131567, term131567.getClass(), "appContext", null);
        setIntField(term131567, term131567.getClass(), "x", 0);
        setIntField(term131567, term131567.getClass(), "y", 0);
        setIntField(term131567, term131567.getClass(), "width", 0);
        setIntField(term131567, term131567.getClass(), "height", 0);
        setField(term131567, term131567.getClass(), "foreground", null);
        setField(term131567, term131567.getClass(), "background", null);
        setField(term131567, term131567.getClass(), "font", null);
        setField(term131567, term131567.getClass(), "peerFont", null);
        setField(term131567, term131567.getClass(), "cursor", null);
        setField(term131567, term131567.getClass(), "locale", null);
        setField(term131567, term131567.getClass(), "graphicsConfig", null);
        setField(term131567, term131567.getClass(), "bufferStrategy", null);
        setBooleanField(term131567, term131567.getClass(), "ignoreRepaint", false);
        setBooleanField(term131567, term131567.getClass(), "visible", false);
        setBooleanField(term131567, term131567.getClass(), "enabled", false);
        setBooleanField(term131567, term131567.getClass(), "valid", false);
        setField(term131567, term131567.getClass(), "dropTarget", null);
        setField(term131567, term131567.getClass(), "popups", null);
        setField(term131567, term131567.getClass(), "name", null);
        setBooleanField(term131567, term131567.getClass(), "nameExplicitlySet", false);
        setBooleanField(term131567, term131567.getClass(), "focusable", false);
        setIntField(term131567, term131567.getClass(), "isFocusTraversableOverridden", 0);
        setField(term131567, term131567.getClass(), "focusTraversalKeys", null);
        setBooleanField(term131567, term131567.getClass(), "focusTraversalKeysEnabled", false);
        setField(term131567, term131567.getClass(), "acc", null);
        setField(term131567, term131567.getClass(), "minSize", null);
        setBooleanField(term131567, term131567.getClass(), "minSizeSet", false);
        setField(term131567, term131567.getClass(), "prefSize", null);
        setBooleanField(term131567, term131567.getClass(), "prefSizeSet", false);
        setField(term131567, term131567.getClass(), "maxSize", null);
        setBooleanField(term131567, term131567.getClass(), "maxSizeSet", false);
        setField(term131567, term131567.getClass(), "componentOrientation", null);
        setBooleanField(term131567, term131567.getClass(), "newEventsOnly", false);
        setField(term131567, term131567.getClass(), "componentListener", null);
        setField(term131567, term131567.getClass(), "focusListener", null);
        setField(term131567, term131567.getClass(), "hierarchyListener", null);
        setField(term131567, term131567.getClass(), "hierarchyBoundsListener", null);
        setField(term131567, term131567.getClass(), "keyListener", null);
        setField(term131567, term131567.getClass(), "mouseListener", null);
        setField(term131567, term131567.getClass(), "mouseMotionListener", null);
        setField(term131567, term131567.getClass(), "mouseWheelListener", null);
        setField(term131567, term131567.getClass(), "inputMethodListener", null);
        setLongField(term131567, term131567.getClass(), "eventMask", 0L);
        setField(term131567, term131567.getClass(), "changeSupport", null);
        setField(term131567, term131567.getClass(), "objectLock", null);
        setBooleanField(term131567, term131567.getClass(), "isPacked", false);
        setIntField(term131567, term131567.getClass(), "boundsOp", 0);
        setField(term131567, term131567.getClass(), "compoundShape", null);
        setField(term131567, term131567.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term131567, term131567.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term131567, term131567.getClass(), "backgroundEraseDisabled", false);
        setField(term131567, term131567.getClass(), "eventCache", null);
        setBooleanField(term131567, term131567.getClass(), "coalescingEnabled", false);
        setBooleanField(term131567, term131567.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term131567, term131567.getClass(), "componentSerializedDataVersion", 0);
        setField(term131567, term131567.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.TodoHandler$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term131567, args);
    }

};


