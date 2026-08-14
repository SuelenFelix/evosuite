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

public class AssignmentHandler_2_remove_16184988665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19755;

    public AssignmentHandler_2_remove_16184988665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19755 = newInstance(Class.forName("core.task.handler.AssignmentHandler$2"));
        setBooleanField(term19755, term19755.getClass(), "reflectTheme", false);
        setBooleanField(term19755, term19755.getClass(), "isAlignmentXSet", false);
        setFloatField(term19755, term19755.getClass(), "alignmentX", 0.0F);
        setBooleanField(term19755, term19755.getClass(), "isAlignmentYSet", false);
        setFloatField(term19755, term19755.getClass(), "alignmentY", 0.0F);
        setField(term19755, term19755.getClass(), "ui", null);
        setField(term19755, term19755.getClass(), "listenerList", null);
        setField(term19755, term19755.getClass(), "clientProperties", null);
        setField(term19755, term19755.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term19755, term19755.getClass(), "autoscrolls", false);
        setField(term19755, term19755.getClass(), "border", null);
        setIntField(term19755, term19755.getClass(), "flags", 0);
        setField(term19755, term19755.getClass(), "inputVerifier", null);
        setBooleanField(term19755, term19755.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term19755, term19755.getClass(), "paintingChild", null);
        setField(term19755, term19755.getClass(), "popupMenu", null);
        setField(term19755, term19755.getClass(), "revalidateRunnableScheduled", null);
        setField(term19755, term19755.getClass(), "focusInputMap", null);
        setField(term19755, term19755.getClass(), "ancestorInputMap", null);
        setField(term19755, term19755.getClass(), "windowInputMap", null);
        setField(term19755, term19755.getClass(), "actionMap", null);
        setField(term19755, term19755.getClass(), "aaHint", null);
        setField(term19755, term19755.getClass(), "lcdRenderingHint", null);
        setField(term19755, term19755.getClass(), "component", null);
        setField(term19755, term19755.getClass(), "layoutMgr", null);
        setField(term19755, term19755.getClass(), "dispatcher", null);
        setField(term19755, term19755.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term19755, term19755.getClass(), "focusCycleRoot", false);
        setBooleanField(term19755, term19755.getClass(), "focusTraversalPolicyProvider", false);
        setField(term19755, term19755.getClass(), "printingThreads", null);
        setBooleanField(term19755, term19755.getClass(), "printing", false);
        setField(term19755, term19755.getClass(), "containerListener", null);
        setIntField(term19755, term19755.getClass(), "listeningChildren", 0);
        setIntField(term19755, term19755.getClass(), "listeningBoundsChildren", 0);
        setIntField(term19755, term19755.getClass(), "descendantsCount", 0);
        setField(term19755, term19755.getClass(), "preserveBackgroundColor", null);
        setIntField(term19755, term19755.getClass(), "numOfHWComponents", 0);
        setIntField(term19755, term19755.getClass(), "numOfLWComponents", 0);
        setField(term19755, term19755.getClass(), "modalComp", null);
        setField(term19755, term19755.getClass(), "modalAppContext", null);
        setIntField(term19755, term19755.getClass(), "containerSerializedDataVersion", 0);
        setField(term19755, term19755.getClass(), "peer", null);
        setField(term19755, term19755.getClass(), "parent", null);
        setField(term19755, term19755.getClass(), "appContext", null);
        setIntField(term19755, term19755.getClass(), "x", 0);
        setIntField(term19755, term19755.getClass(), "y", 0);
        setIntField(term19755, term19755.getClass(), "width", 0);
        setIntField(term19755, term19755.getClass(), "height", 0);
        setField(term19755, term19755.getClass(), "foreground", null);
        setField(term19755, term19755.getClass(), "background", null);
        setField(term19755, term19755.getClass(), "font", null);
        setField(term19755, term19755.getClass(), "peerFont", null);
        setField(term19755, term19755.getClass(), "cursor", null);
        setField(term19755, term19755.getClass(), "locale", null);
        setField(term19755, term19755.getClass(), "graphicsConfig", null);
        setField(term19755, term19755.getClass(), "bufferStrategy", null);
        setBooleanField(term19755, term19755.getClass(), "ignoreRepaint", false);
        setBooleanField(term19755, term19755.getClass(), "visible", false);
        setBooleanField(term19755, term19755.getClass(), "enabled", false);
        setBooleanField(term19755, term19755.getClass(), "valid", false);
        setField(term19755, term19755.getClass(), "dropTarget", null);
        setField(term19755, term19755.getClass(), "popups", null);
        setField(term19755, term19755.getClass(), "name", null);
        setBooleanField(term19755, term19755.getClass(), "nameExplicitlySet", false);
        setBooleanField(term19755, term19755.getClass(), "focusable", false);
        setIntField(term19755, term19755.getClass(), "isFocusTraversableOverridden", 0);
        setField(term19755, term19755.getClass(), "focusTraversalKeys", null);
        setBooleanField(term19755, term19755.getClass(), "focusTraversalKeysEnabled", false);
        setField(term19755, term19755.getClass(), "acc", null);
        setField(term19755, term19755.getClass(), "minSize", null);
        setBooleanField(term19755, term19755.getClass(), "minSizeSet", false);
        setField(term19755, term19755.getClass(), "prefSize", null);
        setBooleanField(term19755, term19755.getClass(), "prefSizeSet", false);
        setField(term19755, term19755.getClass(), "maxSize", null);
        setBooleanField(term19755, term19755.getClass(), "maxSizeSet", false);
        setField(term19755, term19755.getClass(), "componentOrientation", null);
        setBooleanField(term19755, term19755.getClass(), "newEventsOnly", false);
        setField(term19755, term19755.getClass(), "componentListener", null);
        setField(term19755, term19755.getClass(), "focusListener", null);
        setField(term19755, term19755.getClass(), "hierarchyListener", null);
        setField(term19755, term19755.getClass(), "hierarchyBoundsListener", null);
        setField(term19755, term19755.getClass(), "keyListener", null);
        setField(term19755, term19755.getClass(), "mouseListener", null);
        setField(term19755, term19755.getClass(), "mouseMotionListener", null);
        setField(term19755, term19755.getClass(), "mouseWheelListener", null);
        setField(term19755, term19755.getClass(), "inputMethodListener", null);
        setLongField(term19755, term19755.getClass(), "eventMask", 0L);
        setField(term19755, term19755.getClass(), "changeSupport", null);
        setField(term19755, term19755.getClass(), "objectLock", null);
        setBooleanField(term19755, term19755.getClass(), "isPacked", false);
        setIntField(term19755, term19755.getClass(), "boundsOp", 0);
        setField(term19755, term19755.getClass(), "compoundShape", null);
        setField(term19755, term19755.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term19755, term19755.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term19755, term19755.getClass(), "backgroundEraseDisabled", false);
        setField(term19755, term19755.getClass(), "eventCache", null);
        setBooleanField(term19755, term19755.getClass(), "coalescingEnabled", false);
        setBooleanField(term19755, term19755.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term19755, term19755.getClass(), "componentSerializedDataVersion", 0);
        setField(term19755, term19755.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.AssignmentHandler$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term19755, args);
    }

};


