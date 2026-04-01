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
     Object term222750;

    public AssignmentHandler_2_remove_16184988665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222750 = newInstance(Class.forName("core.task.handler.AssignmentHandler$2"));
        setBooleanField(term222750, term222750.getClass(), "reflectTheme", false);
        setBooleanField(term222750, term222750.getClass(), "isAlignmentXSet", false);
        setFloatField(term222750, term222750.getClass(), "alignmentX", 0.0F);
        setBooleanField(term222750, term222750.getClass(), "isAlignmentYSet", false);
        setFloatField(term222750, term222750.getClass(), "alignmentY", 0.0F);
        setField(term222750, term222750.getClass(), "ui", null);
        setField(term222750, term222750.getClass(), "listenerList", null);
        setField(term222750, term222750.getClass(), "clientProperties", null);
        setField(term222750, term222750.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term222750, term222750.getClass(), "autoscrolls", false);
        setField(term222750, term222750.getClass(), "border", null);
        setIntField(term222750, term222750.getClass(), "flags", 0);
        setField(term222750, term222750.getClass(), "inputVerifier", null);
        setBooleanField(term222750, term222750.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term222750, term222750.getClass(), "paintingChild", null);
        setField(term222750, term222750.getClass(), "popupMenu", null);
        setField(term222750, term222750.getClass(), "revalidateRunnableScheduled", null);
        setField(term222750, term222750.getClass(), "focusInputMap", null);
        setField(term222750, term222750.getClass(), "ancestorInputMap", null);
        setField(term222750, term222750.getClass(), "windowInputMap", null);
        setField(term222750, term222750.getClass(), "actionMap", null);
        setField(term222750, term222750.getClass(), "aaHint", null);
        setField(term222750, term222750.getClass(), "lcdRenderingHint", null);
        setField(term222750, term222750.getClass(), "component", null);
        setField(term222750, term222750.getClass(), "layoutMgr", null);
        setField(term222750, term222750.getClass(), "dispatcher", null);
        setField(term222750, term222750.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term222750, term222750.getClass(), "focusCycleRoot", false);
        setBooleanField(term222750, term222750.getClass(), "focusTraversalPolicyProvider", false);
        setField(term222750, term222750.getClass(), "printingThreads", null);
        setBooleanField(term222750, term222750.getClass(), "printing", false);
        setField(term222750, term222750.getClass(), "containerListener", null);
        setIntField(term222750, term222750.getClass(), "listeningChildren", 0);
        setIntField(term222750, term222750.getClass(), "listeningBoundsChildren", 0);
        setIntField(term222750, term222750.getClass(), "descendantsCount", 0);
        setField(term222750, term222750.getClass(), "preserveBackgroundColor", null);
        setIntField(term222750, term222750.getClass(), "numOfHWComponents", 0);
        setIntField(term222750, term222750.getClass(), "numOfLWComponents", 0);
        setField(term222750, term222750.getClass(), "modalComp", null);
        setField(term222750, term222750.getClass(), "modalAppContext", null);
        setIntField(term222750, term222750.getClass(), "containerSerializedDataVersion", 0);
        setField(term222750, term222750.getClass(), "peer", null);
        setField(term222750, term222750.getClass(), "parent", null);
        setField(term222750, term222750.getClass(), "appContext", null);
        setIntField(term222750, term222750.getClass(), "x", 0);
        setIntField(term222750, term222750.getClass(), "y", 0);
        setIntField(term222750, term222750.getClass(), "width", 0);
        setIntField(term222750, term222750.getClass(), "height", 0);
        setField(term222750, term222750.getClass(), "foreground", null);
        setField(term222750, term222750.getClass(), "background", null);
        setField(term222750, term222750.getClass(), "font", null);
        setField(term222750, term222750.getClass(), "peerFont", null);
        setField(term222750, term222750.getClass(), "cursor", null);
        setField(term222750, term222750.getClass(), "locale", null);
        setField(term222750, term222750.getClass(), "graphicsConfig", null);
        setField(term222750, term222750.getClass(), "bufferStrategy", null);
        setBooleanField(term222750, term222750.getClass(), "ignoreRepaint", false);
        setBooleanField(term222750, term222750.getClass(), "visible", false);
        setBooleanField(term222750, term222750.getClass(), "enabled", false);
        setBooleanField(term222750, term222750.getClass(), "valid", false);
        setField(term222750, term222750.getClass(), "dropTarget", null);
        setField(term222750, term222750.getClass(), "popups", null);
        setField(term222750, term222750.getClass(), "name", null);
        setBooleanField(term222750, term222750.getClass(), "nameExplicitlySet", false);
        setBooleanField(term222750, term222750.getClass(), "focusable", false);
        setIntField(term222750, term222750.getClass(), "isFocusTraversableOverridden", 0);
        setField(term222750, term222750.getClass(), "focusTraversalKeys", null);
        setBooleanField(term222750, term222750.getClass(), "focusTraversalKeysEnabled", false);
        setField(term222750, term222750.getClass(), "acc", null);
        setField(term222750, term222750.getClass(), "minSize", null);
        setBooleanField(term222750, term222750.getClass(), "minSizeSet", false);
        setField(term222750, term222750.getClass(), "prefSize", null);
        setBooleanField(term222750, term222750.getClass(), "prefSizeSet", false);
        setField(term222750, term222750.getClass(), "maxSize", null);
        setBooleanField(term222750, term222750.getClass(), "maxSizeSet", false);
        setField(term222750, term222750.getClass(), "componentOrientation", null);
        setBooleanField(term222750, term222750.getClass(), "newEventsOnly", false);
        setField(term222750, term222750.getClass(), "componentListener", null);
        setField(term222750, term222750.getClass(), "focusListener", null);
        setField(term222750, term222750.getClass(), "hierarchyListener", null);
        setField(term222750, term222750.getClass(), "hierarchyBoundsListener", null);
        setField(term222750, term222750.getClass(), "keyListener", null);
        setField(term222750, term222750.getClass(), "mouseListener", null);
        setField(term222750, term222750.getClass(), "mouseMotionListener", null);
        setField(term222750, term222750.getClass(), "mouseWheelListener", null);
        setField(term222750, term222750.getClass(), "inputMethodListener", null);
        setLongField(term222750, term222750.getClass(), "eventMask", 0L);
        setField(term222750, term222750.getClass(), "changeSupport", null);
        setField(term222750, term222750.getClass(), "objectLock", null);
        setBooleanField(term222750, term222750.getClass(), "isPacked", false);
        setIntField(term222750, term222750.getClass(), "boundsOp", 0);
        setField(term222750, term222750.getClass(), "compoundShape", null);
        setField(term222750, term222750.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term222750, term222750.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term222750, term222750.getClass(), "backgroundEraseDisabled", false);
        setField(term222750, term222750.getClass(), "eventCache", null);
        setBooleanField(term222750, term222750.getClass(), "coalescingEnabled", false);
        setBooleanField(term222750, term222750.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term222750, term222750.getClass(), "componentSerializedDataVersion", 0);
        setField(term222750, term222750.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.AssignmentHandler$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term222750, args);
    }

};


