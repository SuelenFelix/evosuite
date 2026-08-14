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
     Object term18381;

    public AssignmentHandler_1_remove_16184988975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18381 = newInstance(Class.forName("core.task.handler.AssignmentHandler$1"));
        setBooleanField(term18381, term18381.getClass(), "reflectTheme", false);
        setBooleanField(term18381, term18381.getClass(), "isAlignmentXSet", false);
        setFloatField(term18381, term18381.getClass(), "alignmentX", 0.0F);
        setBooleanField(term18381, term18381.getClass(), "isAlignmentYSet", false);
        setFloatField(term18381, term18381.getClass(), "alignmentY", 0.0F);
        setField(term18381, term18381.getClass(), "ui", null);
        setField(term18381, term18381.getClass(), "listenerList", null);
        setField(term18381, term18381.getClass(), "clientProperties", null);
        setField(term18381, term18381.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term18381, term18381.getClass(), "autoscrolls", false);
        setField(term18381, term18381.getClass(), "border", null);
        setIntField(term18381, term18381.getClass(), "flags", 0);
        setField(term18381, term18381.getClass(), "inputVerifier", null);
        setBooleanField(term18381, term18381.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term18381, term18381.getClass(), "paintingChild", null);
        setField(term18381, term18381.getClass(), "popupMenu", null);
        setField(term18381, term18381.getClass(), "revalidateRunnableScheduled", null);
        setField(term18381, term18381.getClass(), "focusInputMap", null);
        setField(term18381, term18381.getClass(), "ancestorInputMap", null);
        setField(term18381, term18381.getClass(), "windowInputMap", null);
        setField(term18381, term18381.getClass(), "actionMap", null);
        setField(term18381, term18381.getClass(), "aaHint", null);
        setField(term18381, term18381.getClass(), "lcdRenderingHint", null);
        setField(term18381, term18381.getClass(), "component", null);
        setField(term18381, term18381.getClass(), "layoutMgr", null);
        setField(term18381, term18381.getClass(), "dispatcher", null);
        setField(term18381, term18381.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term18381, term18381.getClass(), "focusCycleRoot", false);
        setBooleanField(term18381, term18381.getClass(), "focusTraversalPolicyProvider", false);
        setField(term18381, term18381.getClass(), "printingThreads", null);
        setBooleanField(term18381, term18381.getClass(), "printing", false);
        setField(term18381, term18381.getClass(), "containerListener", null);
        setIntField(term18381, term18381.getClass(), "listeningChildren", 0);
        setIntField(term18381, term18381.getClass(), "listeningBoundsChildren", 0);
        setIntField(term18381, term18381.getClass(), "descendantsCount", 0);
        setField(term18381, term18381.getClass(), "preserveBackgroundColor", null);
        setIntField(term18381, term18381.getClass(), "numOfHWComponents", 0);
        setIntField(term18381, term18381.getClass(), "numOfLWComponents", 0);
        setField(term18381, term18381.getClass(), "modalComp", null);
        setField(term18381, term18381.getClass(), "modalAppContext", null);
        setIntField(term18381, term18381.getClass(), "containerSerializedDataVersion", 0);
        setField(term18381, term18381.getClass(), "peer", null);
        setField(term18381, term18381.getClass(), "parent", null);
        setField(term18381, term18381.getClass(), "appContext", null);
        setIntField(term18381, term18381.getClass(), "x", 0);
        setIntField(term18381, term18381.getClass(), "y", 0);
        setIntField(term18381, term18381.getClass(), "width", 0);
        setIntField(term18381, term18381.getClass(), "height", 0);
        setField(term18381, term18381.getClass(), "foreground", null);
        setField(term18381, term18381.getClass(), "background", null);
        setField(term18381, term18381.getClass(), "font", null);
        setField(term18381, term18381.getClass(), "peerFont", null);
        setField(term18381, term18381.getClass(), "cursor", null);
        setField(term18381, term18381.getClass(), "locale", null);
        setField(term18381, term18381.getClass(), "graphicsConfig", null);
        setField(term18381, term18381.getClass(), "bufferStrategy", null);
        setBooleanField(term18381, term18381.getClass(), "ignoreRepaint", false);
        setBooleanField(term18381, term18381.getClass(), "visible", false);
        setBooleanField(term18381, term18381.getClass(), "enabled", false);
        setBooleanField(term18381, term18381.getClass(), "valid", false);
        setField(term18381, term18381.getClass(), "dropTarget", null);
        setField(term18381, term18381.getClass(), "popups", null);
        setField(term18381, term18381.getClass(), "name", null);
        setBooleanField(term18381, term18381.getClass(), "nameExplicitlySet", false);
        setBooleanField(term18381, term18381.getClass(), "focusable", false);
        setIntField(term18381, term18381.getClass(), "isFocusTraversableOverridden", 0);
        setField(term18381, term18381.getClass(), "focusTraversalKeys", null);
        setBooleanField(term18381, term18381.getClass(), "focusTraversalKeysEnabled", false);
        setField(term18381, term18381.getClass(), "acc", null);
        setField(term18381, term18381.getClass(), "minSize", null);
        setBooleanField(term18381, term18381.getClass(), "minSizeSet", false);
        setField(term18381, term18381.getClass(), "prefSize", null);
        setBooleanField(term18381, term18381.getClass(), "prefSizeSet", false);
        setField(term18381, term18381.getClass(), "maxSize", null);
        setBooleanField(term18381, term18381.getClass(), "maxSizeSet", false);
        setField(term18381, term18381.getClass(), "componentOrientation", null);
        setBooleanField(term18381, term18381.getClass(), "newEventsOnly", false);
        setField(term18381, term18381.getClass(), "componentListener", null);
        setField(term18381, term18381.getClass(), "focusListener", null);
        setField(term18381, term18381.getClass(), "hierarchyListener", null);
        setField(term18381, term18381.getClass(), "hierarchyBoundsListener", null);
        setField(term18381, term18381.getClass(), "keyListener", null);
        setField(term18381, term18381.getClass(), "mouseListener", null);
        setField(term18381, term18381.getClass(), "mouseMotionListener", null);
        setField(term18381, term18381.getClass(), "mouseWheelListener", null);
        setField(term18381, term18381.getClass(), "inputMethodListener", null);
        setLongField(term18381, term18381.getClass(), "eventMask", 0L);
        setField(term18381, term18381.getClass(), "changeSupport", null);
        setField(term18381, term18381.getClass(), "objectLock", null);
        setBooleanField(term18381, term18381.getClass(), "isPacked", false);
        setIntField(term18381, term18381.getClass(), "boundsOp", 0);
        setField(term18381, term18381.getClass(), "compoundShape", null);
        setField(term18381, term18381.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term18381, term18381.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term18381, term18381.getClass(), "backgroundEraseDisabled", false);
        setField(term18381, term18381.getClass(), "eventCache", null);
        setBooleanField(term18381, term18381.getClass(), "coalescingEnabled", false);
        setBooleanField(term18381, term18381.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term18381, term18381.getClass(), "componentSerializedDataVersion", 0);
        setField(term18381, term18381.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.AssignmentHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term18381, args);
    }

};


