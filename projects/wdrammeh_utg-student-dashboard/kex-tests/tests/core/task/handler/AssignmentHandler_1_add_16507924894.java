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

public class AssignmentHandler_1_add_16507924894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221301;

    public AssignmentHandler_1_add_16507924894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221301 = newInstance(Class.forName("core.task.handler.AssignmentHandler$1"));
        setBooleanField(term221301, term221301.getClass(), "reflectTheme", false);
        setBooleanField(term221301, term221301.getClass(), "isAlignmentXSet", false);
        setFloatField(term221301, term221301.getClass(), "alignmentX", 0.0F);
        setBooleanField(term221301, term221301.getClass(), "isAlignmentYSet", false);
        setFloatField(term221301, term221301.getClass(), "alignmentY", 0.0F);
        setField(term221301, term221301.getClass(), "ui", null);
        setField(term221301, term221301.getClass(), "listenerList", null);
        setField(term221301, term221301.getClass(), "clientProperties", null);
        setField(term221301, term221301.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term221301, term221301.getClass(), "autoscrolls", false);
        setField(term221301, term221301.getClass(), "border", null);
        setIntField(term221301, term221301.getClass(), "flags", 0);
        setField(term221301, term221301.getClass(), "inputVerifier", null);
        setBooleanField(term221301, term221301.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term221301, term221301.getClass(), "paintingChild", null);
        setField(term221301, term221301.getClass(), "popupMenu", null);
        setField(term221301, term221301.getClass(), "revalidateRunnableScheduled", null);
        setField(term221301, term221301.getClass(), "focusInputMap", null);
        setField(term221301, term221301.getClass(), "ancestorInputMap", null);
        setField(term221301, term221301.getClass(), "windowInputMap", null);
        setField(term221301, term221301.getClass(), "actionMap", null);
        setField(term221301, term221301.getClass(), "aaHint", null);
        setField(term221301, term221301.getClass(), "lcdRenderingHint", null);
        setField(term221301, term221301.getClass(), "component", null);
        setField(term221301, term221301.getClass(), "layoutMgr", null);
        setField(term221301, term221301.getClass(), "dispatcher", null);
        setField(term221301, term221301.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term221301, term221301.getClass(), "focusCycleRoot", false);
        setBooleanField(term221301, term221301.getClass(), "focusTraversalPolicyProvider", false);
        setField(term221301, term221301.getClass(), "printingThreads", null);
        setBooleanField(term221301, term221301.getClass(), "printing", false);
        setField(term221301, term221301.getClass(), "containerListener", null);
        setIntField(term221301, term221301.getClass(), "listeningChildren", 0);
        setIntField(term221301, term221301.getClass(), "listeningBoundsChildren", 0);
        setIntField(term221301, term221301.getClass(), "descendantsCount", 0);
        setField(term221301, term221301.getClass(), "preserveBackgroundColor", null);
        setIntField(term221301, term221301.getClass(), "numOfHWComponents", 0);
        setIntField(term221301, term221301.getClass(), "numOfLWComponents", 0);
        setField(term221301, term221301.getClass(), "modalComp", null);
        setField(term221301, term221301.getClass(), "modalAppContext", null);
        setIntField(term221301, term221301.getClass(), "containerSerializedDataVersion", 0);
        setField(term221301, term221301.getClass(), "peer", null);
        setField(term221301, term221301.getClass(), "parent", null);
        setField(term221301, term221301.getClass(), "appContext", null);
        setIntField(term221301, term221301.getClass(), "x", 0);
        setIntField(term221301, term221301.getClass(), "y", 0);
        setIntField(term221301, term221301.getClass(), "width", 0);
        setIntField(term221301, term221301.getClass(), "height", 0);
        setField(term221301, term221301.getClass(), "foreground", null);
        setField(term221301, term221301.getClass(), "background", null);
        setField(term221301, term221301.getClass(), "font", null);
        setField(term221301, term221301.getClass(), "peerFont", null);
        setField(term221301, term221301.getClass(), "cursor", null);
        setField(term221301, term221301.getClass(), "locale", null);
        setField(term221301, term221301.getClass(), "graphicsConfig", null);
        setField(term221301, term221301.getClass(), "bufferStrategy", null);
        setBooleanField(term221301, term221301.getClass(), "ignoreRepaint", false);
        setBooleanField(term221301, term221301.getClass(), "visible", false);
        setBooleanField(term221301, term221301.getClass(), "enabled", false);
        setBooleanField(term221301, term221301.getClass(), "valid", false);
        setField(term221301, term221301.getClass(), "dropTarget", null);
        setField(term221301, term221301.getClass(), "popups", null);
        setField(term221301, term221301.getClass(), "name", null);
        setBooleanField(term221301, term221301.getClass(), "nameExplicitlySet", false);
        setBooleanField(term221301, term221301.getClass(), "focusable", false);
        setIntField(term221301, term221301.getClass(), "isFocusTraversableOverridden", 0);
        setField(term221301, term221301.getClass(), "focusTraversalKeys", null);
        setBooleanField(term221301, term221301.getClass(), "focusTraversalKeysEnabled", false);
        setField(term221301, term221301.getClass(), "acc", null);
        setField(term221301, term221301.getClass(), "minSize", null);
        setBooleanField(term221301, term221301.getClass(), "minSizeSet", false);
        setField(term221301, term221301.getClass(), "prefSize", null);
        setBooleanField(term221301, term221301.getClass(), "prefSizeSet", false);
        setField(term221301, term221301.getClass(), "maxSize", null);
        setBooleanField(term221301, term221301.getClass(), "maxSizeSet", false);
        setField(term221301, term221301.getClass(), "componentOrientation", null);
        setBooleanField(term221301, term221301.getClass(), "newEventsOnly", false);
        setField(term221301, term221301.getClass(), "componentListener", null);
        setField(term221301, term221301.getClass(), "focusListener", null);
        setField(term221301, term221301.getClass(), "hierarchyListener", null);
        setField(term221301, term221301.getClass(), "hierarchyBoundsListener", null);
        setField(term221301, term221301.getClass(), "keyListener", null);
        setField(term221301, term221301.getClass(), "mouseListener", null);
        setField(term221301, term221301.getClass(), "mouseMotionListener", null);
        setField(term221301, term221301.getClass(), "mouseWheelListener", null);
        setField(term221301, term221301.getClass(), "inputMethodListener", null);
        setLongField(term221301, term221301.getClass(), "eventMask", 0L);
        setField(term221301, term221301.getClass(), "changeSupport", null);
        setField(term221301, term221301.getClass(), "objectLock", null);
        setBooleanField(term221301, term221301.getClass(), "isPacked", false);
        setIntField(term221301, term221301.getClass(), "boundsOp", 0);
        setField(term221301, term221301.getClass(), "compoundShape", null);
        setField(term221301, term221301.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term221301, term221301.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term221301, term221301.getClass(), "backgroundEraseDisabled", false);
        setField(term221301, term221301.getClass(), "eventCache", null);
        setBooleanField(term221301, term221301.getClass(), "coalescingEnabled", false);
        setBooleanField(term221301, term221301.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term221301, term221301.getClass(), "componentSerializedDataVersion", 0);
        setField(term221301, term221301.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.AssignmentHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term221301, args);
    }

};


