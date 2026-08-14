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
     Object term19713;

    public AssignmentHandler_2_add_16507924584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19713 = newInstance(Class.forName("core.task.handler.AssignmentHandler$2"));
        setBooleanField(term19713, term19713.getClass(), "reflectTheme", false);
        setBooleanField(term19713, term19713.getClass(), "isAlignmentXSet", false);
        setFloatField(term19713, term19713.getClass(), "alignmentX", 0.0F);
        setBooleanField(term19713, term19713.getClass(), "isAlignmentYSet", false);
        setFloatField(term19713, term19713.getClass(), "alignmentY", 0.0F);
        setField(term19713, term19713.getClass(), "ui", null);
        setField(term19713, term19713.getClass(), "listenerList", null);
        setField(term19713, term19713.getClass(), "clientProperties", null);
        setField(term19713, term19713.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term19713, term19713.getClass(), "autoscrolls", false);
        setField(term19713, term19713.getClass(), "border", null);
        setIntField(term19713, term19713.getClass(), "flags", 0);
        setField(term19713, term19713.getClass(), "inputVerifier", null);
        setBooleanField(term19713, term19713.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term19713, term19713.getClass(), "paintingChild", null);
        setField(term19713, term19713.getClass(), "popupMenu", null);
        setField(term19713, term19713.getClass(), "revalidateRunnableScheduled", null);
        setField(term19713, term19713.getClass(), "focusInputMap", null);
        setField(term19713, term19713.getClass(), "ancestorInputMap", null);
        setField(term19713, term19713.getClass(), "windowInputMap", null);
        setField(term19713, term19713.getClass(), "actionMap", null);
        setField(term19713, term19713.getClass(), "aaHint", null);
        setField(term19713, term19713.getClass(), "lcdRenderingHint", null);
        setField(term19713, term19713.getClass(), "component", null);
        setField(term19713, term19713.getClass(), "layoutMgr", null);
        setField(term19713, term19713.getClass(), "dispatcher", null);
        setField(term19713, term19713.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term19713, term19713.getClass(), "focusCycleRoot", false);
        setBooleanField(term19713, term19713.getClass(), "focusTraversalPolicyProvider", false);
        setField(term19713, term19713.getClass(), "printingThreads", null);
        setBooleanField(term19713, term19713.getClass(), "printing", false);
        setField(term19713, term19713.getClass(), "containerListener", null);
        setIntField(term19713, term19713.getClass(), "listeningChildren", 0);
        setIntField(term19713, term19713.getClass(), "listeningBoundsChildren", 0);
        setIntField(term19713, term19713.getClass(), "descendantsCount", 0);
        setField(term19713, term19713.getClass(), "preserveBackgroundColor", null);
        setIntField(term19713, term19713.getClass(), "numOfHWComponents", 0);
        setIntField(term19713, term19713.getClass(), "numOfLWComponents", 0);
        setField(term19713, term19713.getClass(), "modalComp", null);
        setField(term19713, term19713.getClass(), "modalAppContext", null);
        setIntField(term19713, term19713.getClass(), "containerSerializedDataVersion", 0);
        setField(term19713, term19713.getClass(), "peer", null);
        setField(term19713, term19713.getClass(), "parent", null);
        setField(term19713, term19713.getClass(), "appContext", null);
        setIntField(term19713, term19713.getClass(), "x", 0);
        setIntField(term19713, term19713.getClass(), "y", 0);
        setIntField(term19713, term19713.getClass(), "width", 0);
        setIntField(term19713, term19713.getClass(), "height", 0);
        setField(term19713, term19713.getClass(), "foreground", null);
        setField(term19713, term19713.getClass(), "background", null);
        setField(term19713, term19713.getClass(), "font", null);
        setField(term19713, term19713.getClass(), "peerFont", null);
        setField(term19713, term19713.getClass(), "cursor", null);
        setField(term19713, term19713.getClass(), "locale", null);
        setField(term19713, term19713.getClass(), "graphicsConfig", null);
        setField(term19713, term19713.getClass(), "bufferStrategy", null);
        setBooleanField(term19713, term19713.getClass(), "ignoreRepaint", false);
        setBooleanField(term19713, term19713.getClass(), "visible", false);
        setBooleanField(term19713, term19713.getClass(), "enabled", false);
        setBooleanField(term19713, term19713.getClass(), "valid", false);
        setField(term19713, term19713.getClass(), "dropTarget", null);
        setField(term19713, term19713.getClass(), "popups", null);
        setField(term19713, term19713.getClass(), "name", null);
        setBooleanField(term19713, term19713.getClass(), "nameExplicitlySet", false);
        setBooleanField(term19713, term19713.getClass(), "focusable", false);
        setIntField(term19713, term19713.getClass(), "isFocusTraversableOverridden", 0);
        setField(term19713, term19713.getClass(), "focusTraversalKeys", null);
        setBooleanField(term19713, term19713.getClass(), "focusTraversalKeysEnabled", false);
        setField(term19713, term19713.getClass(), "acc", null);
        setField(term19713, term19713.getClass(), "minSize", null);
        setBooleanField(term19713, term19713.getClass(), "minSizeSet", false);
        setField(term19713, term19713.getClass(), "prefSize", null);
        setBooleanField(term19713, term19713.getClass(), "prefSizeSet", false);
        setField(term19713, term19713.getClass(), "maxSize", null);
        setBooleanField(term19713, term19713.getClass(), "maxSizeSet", false);
        setField(term19713, term19713.getClass(), "componentOrientation", null);
        setBooleanField(term19713, term19713.getClass(), "newEventsOnly", false);
        setField(term19713, term19713.getClass(), "componentListener", null);
        setField(term19713, term19713.getClass(), "focusListener", null);
        setField(term19713, term19713.getClass(), "hierarchyListener", null);
        setField(term19713, term19713.getClass(), "hierarchyBoundsListener", null);
        setField(term19713, term19713.getClass(), "keyListener", null);
        setField(term19713, term19713.getClass(), "mouseListener", null);
        setField(term19713, term19713.getClass(), "mouseMotionListener", null);
        setField(term19713, term19713.getClass(), "mouseWheelListener", null);
        setField(term19713, term19713.getClass(), "inputMethodListener", null);
        setLongField(term19713, term19713.getClass(), "eventMask", 0L);
        setField(term19713, term19713.getClass(), "changeSupport", null);
        setField(term19713, term19713.getClass(), "objectLock", null);
        setBooleanField(term19713, term19713.getClass(), "isPacked", false);
        setIntField(term19713, term19713.getClass(), "boundsOp", 0);
        setField(term19713, term19713.getClass(), "compoundShape", null);
        setField(term19713, term19713.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term19713, term19713.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term19713, term19713.getClass(), "backgroundEraseDisabled", false);
        setField(term19713, term19713.getClass(), "eventCache", null);
        setBooleanField(term19713, term19713.getClass(), "coalescingEnabled", false);
        setBooleanField(term19713, term19713.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term19713, term19713.getClass(), "componentSerializedDataVersion", 0);
        setField(term19713, term19713.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.AssignmentHandler$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term19713, args);
    }

};


