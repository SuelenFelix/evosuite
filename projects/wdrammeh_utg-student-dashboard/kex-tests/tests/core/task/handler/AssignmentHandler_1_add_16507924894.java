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
     Object term18339;

    public AssignmentHandler_1_add_16507924894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18339 = newInstance(Class.forName("core.task.handler.AssignmentHandler$1"));
        setBooleanField(term18339, term18339.getClass(), "reflectTheme", false);
        setBooleanField(term18339, term18339.getClass(), "isAlignmentXSet", false);
        setFloatField(term18339, term18339.getClass(), "alignmentX", 0.0F);
        setBooleanField(term18339, term18339.getClass(), "isAlignmentYSet", false);
        setFloatField(term18339, term18339.getClass(), "alignmentY", 0.0F);
        setField(term18339, term18339.getClass(), "ui", null);
        setField(term18339, term18339.getClass(), "listenerList", null);
        setField(term18339, term18339.getClass(), "clientProperties", null);
        setField(term18339, term18339.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term18339, term18339.getClass(), "autoscrolls", false);
        setField(term18339, term18339.getClass(), "border", null);
        setIntField(term18339, term18339.getClass(), "flags", 0);
        setField(term18339, term18339.getClass(), "inputVerifier", null);
        setBooleanField(term18339, term18339.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term18339, term18339.getClass(), "paintingChild", null);
        setField(term18339, term18339.getClass(), "popupMenu", null);
        setField(term18339, term18339.getClass(), "revalidateRunnableScheduled", null);
        setField(term18339, term18339.getClass(), "focusInputMap", null);
        setField(term18339, term18339.getClass(), "ancestorInputMap", null);
        setField(term18339, term18339.getClass(), "windowInputMap", null);
        setField(term18339, term18339.getClass(), "actionMap", null);
        setField(term18339, term18339.getClass(), "aaHint", null);
        setField(term18339, term18339.getClass(), "lcdRenderingHint", null);
        setField(term18339, term18339.getClass(), "component", null);
        setField(term18339, term18339.getClass(), "layoutMgr", null);
        setField(term18339, term18339.getClass(), "dispatcher", null);
        setField(term18339, term18339.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term18339, term18339.getClass(), "focusCycleRoot", false);
        setBooleanField(term18339, term18339.getClass(), "focusTraversalPolicyProvider", false);
        setField(term18339, term18339.getClass(), "printingThreads", null);
        setBooleanField(term18339, term18339.getClass(), "printing", false);
        setField(term18339, term18339.getClass(), "containerListener", null);
        setIntField(term18339, term18339.getClass(), "listeningChildren", 0);
        setIntField(term18339, term18339.getClass(), "listeningBoundsChildren", 0);
        setIntField(term18339, term18339.getClass(), "descendantsCount", 0);
        setField(term18339, term18339.getClass(), "preserveBackgroundColor", null);
        setIntField(term18339, term18339.getClass(), "numOfHWComponents", 0);
        setIntField(term18339, term18339.getClass(), "numOfLWComponents", 0);
        setField(term18339, term18339.getClass(), "modalComp", null);
        setField(term18339, term18339.getClass(), "modalAppContext", null);
        setIntField(term18339, term18339.getClass(), "containerSerializedDataVersion", 0);
        setField(term18339, term18339.getClass(), "peer", null);
        setField(term18339, term18339.getClass(), "parent", null);
        setField(term18339, term18339.getClass(), "appContext", null);
        setIntField(term18339, term18339.getClass(), "x", 0);
        setIntField(term18339, term18339.getClass(), "y", 0);
        setIntField(term18339, term18339.getClass(), "width", 0);
        setIntField(term18339, term18339.getClass(), "height", 0);
        setField(term18339, term18339.getClass(), "foreground", null);
        setField(term18339, term18339.getClass(), "background", null);
        setField(term18339, term18339.getClass(), "font", null);
        setField(term18339, term18339.getClass(), "peerFont", null);
        setField(term18339, term18339.getClass(), "cursor", null);
        setField(term18339, term18339.getClass(), "locale", null);
        setField(term18339, term18339.getClass(), "graphicsConfig", null);
        setField(term18339, term18339.getClass(), "bufferStrategy", null);
        setBooleanField(term18339, term18339.getClass(), "ignoreRepaint", false);
        setBooleanField(term18339, term18339.getClass(), "visible", false);
        setBooleanField(term18339, term18339.getClass(), "enabled", false);
        setBooleanField(term18339, term18339.getClass(), "valid", false);
        setField(term18339, term18339.getClass(), "dropTarget", null);
        setField(term18339, term18339.getClass(), "popups", null);
        setField(term18339, term18339.getClass(), "name", null);
        setBooleanField(term18339, term18339.getClass(), "nameExplicitlySet", false);
        setBooleanField(term18339, term18339.getClass(), "focusable", false);
        setIntField(term18339, term18339.getClass(), "isFocusTraversableOverridden", 0);
        setField(term18339, term18339.getClass(), "focusTraversalKeys", null);
        setBooleanField(term18339, term18339.getClass(), "focusTraversalKeysEnabled", false);
        setField(term18339, term18339.getClass(), "acc", null);
        setField(term18339, term18339.getClass(), "minSize", null);
        setBooleanField(term18339, term18339.getClass(), "minSizeSet", false);
        setField(term18339, term18339.getClass(), "prefSize", null);
        setBooleanField(term18339, term18339.getClass(), "prefSizeSet", false);
        setField(term18339, term18339.getClass(), "maxSize", null);
        setBooleanField(term18339, term18339.getClass(), "maxSizeSet", false);
        setField(term18339, term18339.getClass(), "componentOrientation", null);
        setBooleanField(term18339, term18339.getClass(), "newEventsOnly", false);
        setField(term18339, term18339.getClass(), "componentListener", null);
        setField(term18339, term18339.getClass(), "focusListener", null);
        setField(term18339, term18339.getClass(), "hierarchyListener", null);
        setField(term18339, term18339.getClass(), "hierarchyBoundsListener", null);
        setField(term18339, term18339.getClass(), "keyListener", null);
        setField(term18339, term18339.getClass(), "mouseListener", null);
        setField(term18339, term18339.getClass(), "mouseMotionListener", null);
        setField(term18339, term18339.getClass(), "mouseWheelListener", null);
        setField(term18339, term18339.getClass(), "inputMethodListener", null);
        setLongField(term18339, term18339.getClass(), "eventMask", 0L);
        setField(term18339, term18339.getClass(), "changeSupport", null);
        setField(term18339, term18339.getClass(), "objectLock", null);
        setBooleanField(term18339, term18339.getClass(), "isPacked", false);
        setIntField(term18339, term18339.getClass(), "boundsOp", 0);
        setField(term18339, term18339.getClass(), "compoundShape", null);
        setField(term18339, term18339.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term18339, term18339.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term18339, term18339.getClass(), "backgroundEraseDisabled", false);
        setField(term18339, term18339.getClass(), "eventCache", null);
        setBooleanField(term18339, term18339.getClass(), "coalescingEnabled", false);
        setBooleanField(term18339, term18339.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term18339, term18339.getClass(), "componentSerializedDataVersion", 0);
        setField(term18339, term18339.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.AssignmentHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term18339, args);
    }

};


