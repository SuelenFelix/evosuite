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

public class AssignmentHandler_2_add_16507924584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222708;

    public AssignmentHandler_2_add_16507924584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222708 = newInstance(Class.forName("core.task.handler.AssignmentHandler$2"));
        setBooleanField(term222708, term222708.getClass(), "reflectTheme", false);
        setBooleanField(term222708, term222708.getClass(), "isAlignmentXSet", false);
        setFloatField(term222708, term222708.getClass(), "alignmentX", 0.0F);
        setBooleanField(term222708, term222708.getClass(), "isAlignmentYSet", false);
        setFloatField(term222708, term222708.getClass(), "alignmentY", 0.0F);
        setField(term222708, term222708.getClass(), "ui", null);
        setField(term222708, term222708.getClass(), "listenerList", null);
        setField(term222708, term222708.getClass(), "clientProperties", null);
        setField(term222708, term222708.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term222708, term222708.getClass(), "autoscrolls", false);
        setField(term222708, term222708.getClass(), "border", null);
        setIntField(term222708, term222708.getClass(), "flags", 0);
        setField(term222708, term222708.getClass(), "inputVerifier", null);
        setBooleanField(term222708, term222708.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term222708, term222708.getClass(), "paintingChild", null);
        setField(term222708, term222708.getClass(), "popupMenu", null);
        setField(term222708, term222708.getClass(), "revalidateRunnableScheduled", null);
        setField(term222708, term222708.getClass(), "focusInputMap", null);
        setField(term222708, term222708.getClass(), "ancestorInputMap", null);
        setField(term222708, term222708.getClass(), "windowInputMap", null);
        setField(term222708, term222708.getClass(), "actionMap", null);
        setField(term222708, term222708.getClass(), "aaHint", null);
        setField(term222708, term222708.getClass(), "lcdRenderingHint", null);
        setField(term222708, term222708.getClass(), "component", null);
        setField(term222708, term222708.getClass(), "layoutMgr", null);
        setField(term222708, term222708.getClass(), "dispatcher", null);
        setField(term222708, term222708.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term222708, term222708.getClass(), "focusCycleRoot", false);
        setBooleanField(term222708, term222708.getClass(), "focusTraversalPolicyProvider", false);
        setField(term222708, term222708.getClass(), "printingThreads", null);
        setBooleanField(term222708, term222708.getClass(), "printing", false);
        setField(term222708, term222708.getClass(), "containerListener", null);
        setIntField(term222708, term222708.getClass(), "listeningChildren", 0);
        setIntField(term222708, term222708.getClass(), "listeningBoundsChildren", 0);
        setIntField(term222708, term222708.getClass(), "descendantsCount", 0);
        setField(term222708, term222708.getClass(), "preserveBackgroundColor", null);
        setIntField(term222708, term222708.getClass(), "numOfHWComponents", 0);
        setIntField(term222708, term222708.getClass(), "numOfLWComponents", 0);
        setField(term222708, term222708.getClass(), "modalComp", null);
        setField(term222708, term222708.getClass(), "modalAppContext", null);
        setIntField(term222708, term222708.getClass(), "containerSerializedDataVersion", 0);
        setField(term222708, term222708.getClass(), "peer", null);
        setField(term222708, term222708.getClass(), "parent", null);
        setField(term222708, term222708.getClass(), "appContext", null);
        setIntField(term222708, term222708.getClass(), "x", 0);
        setIntField(term222708, term222708.getClass(), "y", 0);
        setIntField(term222708, term222708.getClass(), "width", 0);
        setIntField(term222708, term222708.getClass(), "height", 0);
        setField(term222708, term222708.getClass(), "foreground", null);
        setField(term222708, term222708.getClass(), "background", null);
        setField(term222708, term222708.getClass(), "font", null);
        setField(term222708, term222708.getClass(), "peerFont", null);
        setField(term222708, term222708.getClass(), "cursor", null);
        setField(term222708, term222708.getClass(), "locale", null);
        setField(term222708, term222708.getClass(), "graphicsConfig", null);
        setField(term222708, term222708.getClass(), "bufferStrategy", null);
        setBooleanField(term222708, term222708.getClass(), "ignoreRepaint", false);
        setBooleanField(term222708, term222708.getClass(), "visible", false);
        setBooleanField(term222708, term222708.getClass(), "enabled", false);
        setBooleanField(term222708, term222708.getClass(), "valid", false);
        setField(term222708, term222708.getClass(), "dropTarget", null);
        setField(term222708, term222708.getClass(), "popups", null);
        setField(term222708, term222708.getClass(), "name", null);
        setBooleanField(term222708, term222708.getClass(), "nameExplicitlySet", false);
        setBooleanField(term222708, term222708.getClass(), "focusable", false);
        setIntField(term222708, term222708.getClass(), "isFocusTraversableOverridden", 0);
        setField(term222708, term222708.getClass(), "focusTraversalKeys", null);
        setBooleanField(term222708, term222708.getClass(), "focusTraversalKeysEnabled", false);
        setField(term222708, term222708.getClass(), "acc", null);
        setField(term222708, term222708.getClass(), "minSize", null);
        setBooleanField(term222708, term222708.getClass(), "minSizeSet", false);
        setField(term222708, term222708.getClass(), "prefSize", null);
        setBooleanField(term222708, term222708.getClass(), "prefSizeSet", false);
        setField(term222708, term222708.getClass(), "maxSize", null);
        setBooleanField(term222708, term222708.getClass(), "maxSizeSet", false);
        setField(term222708, term222708.getClass(), "componentOrientation", null);
        setBooleanField(term222708, term222708.getClass(), "newEventsOnly", false);
        setField(term222708, term222708.getClass(), "componentListener", null);
        setField(term222708, term222708.getClass(), "focusListener", null);
        setField(term222708, term222708.getClass(), "hierarchyListener", null);
        setField(term222708, term222708.getClass(), "hierarchyBoundsListener", null);
        setField(term222708, term222708.getClass(), "keyListener", null);
        setField(term222708, term222708.getClass(), "mouseListener", null);
        setField(term222708, term222708.getClass(), "mouseMotionListener", null);
        setField(term222708, term222708.getClass(), "mouseWheelListener", null);
        setField(term222708, term222708.getClass(), "inputMethodListener", null);
        setLongField(term222708, term222708.getClass(), "eventMask", 0L);
        setField(term222708, term222708.getClass(), "changeSupport", null);
        setField(term222708, term222708.getClass(), "objectLock", null);
        setBooleanField(term222708, term222708.getClass(), "isPacked", false);
        setIntField(term222708, term222708.getClass(), "boundsOp", 0);
        setField(term222708, term222708.getClass(), "compoundShape", null);
        setField(term222708, term222708.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term222708, term222708.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term222708, term222708.getClass(), "backgroundEraseDisabled", false);
        setField(term222708, term222708.getClass(), "eventCache", null);
        setBooleanField(term222708, term222708.getClass(), "coalescingEnabled", false);
        setBooleanField(term222708, term222708.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term222708, term222708.getClass(), "componentSerializedDataVersion", 0);
        setField(term222708, term222708.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.AssignmentHandler$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term222708, args);
    }

};


