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

public class AssignmentHandler_1_remove_16184988975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18389;

    public AssignmentHandler_1_remove_16184988975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18389 = newInstance(Class.forName("core.task.handler.AssignmentHandler$1"));
        setBooleanField(term18389, term18389.getClass(), "reflectTheme", false);
        setBooleanField(term18389, term18389.getClass(), "isAlignmentXSet", false);
        setFloatField(term18389, term18389.getClass(), "alignmentX", 0.0F);
        setBooleanField(term18389, term18389.getClass(), "isAlignmentYSet", false);
        setFloatField(term18389, term18389.getClass(), "alignmentY", 0.0F);
        setField(term18389, term18389.getClass(), "ui", null);
        setField(term18389, term18389.getClass(), "listenerList", null);
        setField(term18389, term18389.getClass(), "clientProperties", null);
        setField(term18389, term18389.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term18389, term18389.getClass(), "autoscrolls", false);
        setField(term18389, term18389.getClass(), "border", null);
        setIntField(term18389, term18389.getClass(), "flags", 0);
        setField(term18389, term18389.getClass(), "inputVerifier", null);
        setBooleanField(term18389, term18389.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term18389, term18389.getClass(), "paintingChild", null);
        setField(term18389, term18389.getClass(), "popupMenu", null);
        setField(term18389, term18389.getClass(), "revalidateRunnableScheduled", null);
        setField(term18389, term18389.getClass(), "focusInputMap", null);
        setField(term18389, term18389.getClass(), "ancestorInputMap", null);
        setField(term18389, term18389.getClass(), "windowInputMap", null);
        setField(term18389, term18389.getClass(), "actionMap", null);
        setField(term18389, term18389.getClass(), "aaHint", null);
        setField(term18389, term18389.getClass(), "lcdRenderingHint", null);
        setField(term18389, term18389.getClass(), "component", null);
        setField(term18389, term18389.getClass(), "layoutMgr", null);
        setField(term18389, term18389.getClass(), "dispatcher", null);
        setField(term18389, term18389.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term18389, term18389.getClass(), "focusCycleRoot", false);
        setBooleanField(term18389, term18389.getClass(), "focusTraversalPolicyProvider", false);
        setField(term18389, term18389.getClass(), "printingThreads", null);
        setBooleanField(term18389, term18389.getClass(), "printing", false);
        setField(term18389, term18389.getClass(), "containerListener", null);
        setIntField(term18389, term18389.getClass(), "listeningChildren", 0);
        setIntField(term18389, term18389.getClass(), "listeningBoundsChildren", 0);
        setIntField(term18389, term18389.getClass(), "descendantsCount", 0);
        setField(term18389, term18389.getClass(), "preserveBackgroundColor", null);
        setIntField(term18389, term18389.getClass(), "numOfHWComponents", 0);
        setIntField(term18389, term18389.getClass(), "numOfLWComponents", 0);
        setField(term18389, term18389.getClass(), "modalComp", null);
        setField(term18389, term18389.getClass(), "modalAppContext", null);
        setIntField(term18389, term18389.getClass(), "containerSerializedDataVersion", 0);
        setField(term18389, term18389.getClass(), "peer", null);
        setField(term18389, term18389.getClass(), "parent", null);
        setField(term18389, term18389.getClass(), "appContext", null);
        setIntField(term18389, term18389.getClass(), "x", 0);
        setIntField(term18389, term18389.getClass(), "y", 0);
        setIntField(term18389, term18389.getClass(), "width", 0);
        setIntField(term18389, term18389.getClass(), "height", 0);
        setField(term18389, term18389.getClass(), "foreground", null);
        setField(term18389, term18389.getClass(), "background", null);
        setField(term18389, term18389.getClass(), "font", null);
        setField(term18389, term18389.getClass(), "peerFont", null);
        setField(term18389, term18389.getClass(), "cursor", null);
        setField(term18389, term18389.getClass(), "locale", null);
        setField(term18389, term18389.getClass(), "graphicsConfig", null);
        setField(term18389, term18389.getClass(), "bufferStrategy", null);
        setBooleanField(term18389, term18389.getClass(), "ignoreRepaint", false);
        setBooleanField(term18389, term18389.getClass(), "visible", false);
        setBooleanField(term18389, term18389.getClass(), "enabled", false);
        setBooleanField(term18389, term18389.getClass(), "valid", false);
        setField(term18389, term18389.getClass(), "dropTarget", null);
        setField(term18389, term18389.getClass(), "popups", null);
        setField(term18389, term18389.getClass(), "name", null);
        setBooleanField(term18389, term18389.getClass(), "nameExplicitlySet", false);
        setBooleanField(term18389, term18389.getClass(), "focusable", false);
        setIntField(term18389, term18389.getClass(), "isFocusTraversableOverridden", 0);
        setField(term18389, term18389.getClass(), "focusTraversalKeys", null);
        setBooleanField(term18389, term18389.getClass(), "focusTraversalKeysEnabled", false);
        setField(term18389, term18389.getClass(), "acc", null);
        setField(term18389, term18389.getClass(), "minSize", null);
        setBooleanField(term18389, term18389.getClass(), "minSizeSet", false);
        setField(term18389, term18389.getClass(), "prefSize", null);
        setBooleanField(term18389, term18389.getClass(), "prefSizeSet", false);
        setField(term18389, term18389.getClass(), "maxSize", null);
        setBooleanField(term18389, term18389.getClass(), "maxSizeSet", false);
        setField(term18389, term18389.getClass(), "componentOrientation", null);
        setBooleanField(term18389, term18389.getClass(), "newEventsOnly", false);
        setField(term18389, term18389.getClass(), "componentListener", null);
        setField(term18389, term18389.getClass(), "focusListener", null);
        setField(term18389, term18389.getClass(), "hierarchyListener", null);
        setField(term18389, term18389.getClass(), "hierarchyBoundsListener", null);
        setField(term18389, term18389.getClass(), "keyListener", null);
        setField(term18389, term18389.getClass(), "mouseListener", null);
        setField(term18389, term18389.getClass(), "mouseMotionListener", null);
        setField(term18389, term18389.getClass(), "mouseWheelListener", null);
        setField(term18389, term18389.getClass(), "inputMethodListener", null);
        setLongField(term18389, term18389.getClass(), "eventMask", 0L);
        setField(term18389, term18389.getClass(), "changeSupport", null);
        setField(term18389, term18389.getClass(), "objectLock", null);
        setBooleanField(term18389, term18389.getClass(), "isPacked", false);
        setIntField(term18389, term18389.getClass(), "boundsOp", 0);
        setField(term18389, term18389.getClass(), "compoundShape", null);
        setField(term18389, term18389.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term18389, term18389.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term18389, term18389.getClass(), "backgroundEraseDisabled", false);
        setField(term18389, term18389.getClass(), "eventCache", null);
        setBooleanField(term18389, term18389.getClass(), "coalescingEnabled", false);
        setBooleanField(term18389, term18389.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term18389, term18389.getClass(), "componentSerializedDataVersion", 0);
        setField(term18389, term18389.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.AssignmentHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term18389, args);
    }

};


