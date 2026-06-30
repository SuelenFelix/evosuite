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
     Object term19763;

    public AssignmentHandler_2_remove_16184988665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19763 = newInstance(Class.forName("core.task.handler.AssignmentHandler$2"));
        setBooleanField(term19763, term19763.getClass(), "reflectTheme", false);
        setBooleanField(term19763, term19763.getClass(), "isAlignmentXSet", false);
        setFloatField(term19763, term19763.getClass(), "alignmentX", 0.0F);
        setBooleanField(term19763, term19763.getClass(), "isAlignmentYSet", false);
        setFloatField(term19763, term19763.getClass(), "alignmentY", 0.0F);
        setField(term19763, term19763.getClass(), "ui", null);
        setField(term19763, term19763.getClass(), "listenerList", null);
        setField(term19763, term19763.getClass(), "clientProperties", null);
        setField(term19763, term19763.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term19763, term19763.getClass(), "autoscrolls", false);
        setField(term19763, term19763.getClass(), "border", null);
        setIntField(term19763, term19763.getClass(), "flags", 0);
        setField(term19763, term19763.getClass(), "inputVerifier", null);
        setBooleanField(term19763, term19763.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term19763, term19763.getClass(), "paintingChild", null);
        setField(term19763, term19763.getClass(), "popupMenu", null);
        setField(term19763, term19763.getClass(), "revalidateRunnableScheduled", null);
        setField(term19763, term19763.getClass(), "focusInputMap", null);
        setField(term19763, term19763.getClass(), "ancestorInputMap", null);
        setField(term19763, term19763.getClass(), "windowInputMap", null);
        setField(term19763, term19763.getClass(), "actionMap", null);
        setField(term19763, term19763.getClass(), "aaHint", null);
        setField(term19763, term19763.getClass(), "lcdRenderingHint", null);
        setField(term19763, term19763.getClass(), "component", null);
        setField(term19763, term19763.getClass(), "layoutMgr", null);
        setField(term19763, term19763.getClass(), "dispatcher", null);
        setField(term19763, term19763.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term19763, term19763.getClass(), "focusCycleRoot", false);
        setBooleanField(term19763, term19763.getClass(), "focusTraversalPolicyProvider", false);
        setField(term19763, term19763.getClass(), "printingThreads", null);
        setBooleanField(term19763, term19763.getClass(), "printing", false);
        setField(term19763, term19763.getClass(), "containerListener", null);
        setIntField(term19763, term19763.getClass(), "listeningChildren", 0);
        setIntField(term19763, term19763.getClass(), "listeningBoundsChildren", 0);
        setIntField(term19763, term19763.getClass(), "descendantsCount", 0);
        setField(term19763, term19763.getClass(), "preserveBackgroundColor", null);
        setIntField(term19763, term19763.getClass(), "numOfHWComponents", 0);
        setIntField(term19763, term19763.getClass(), "numOfLWComponents", 0);
        setField(term19763, term19763.getClass(), "modalComp", null);
        setField(term19763, term19763.getClass(), "modalAppContext", null);
        setIntField(term19763, term19763.getClass(), "containerSerializedDataVersion", 0);
        setField(term19763, term19763.getClass(), "peer", null);
        setField(term19763, term19763.getClass(), "parent", null);
        setField(term19763, term19763.getClass(), "appContext", null);
        setIntField(term19763, term19763.getClass(), "x", 0);
        setIntField(term19763, term19763.getClass(), "y", 0);
        setIntField(term19763, term19763.getClass(), "width", 0);
        setIntField(term19763, term19763.getClass(), "height", 0);
        setField(term19763, term19763.getClass(), "foreground", null);
        setField(term19763, term19763.getClass(), "background", null);
        setField(term19763, term19763.getClass(), "font", null);
        setField(term19763, term19763.getClass(), "peerFont", null);
        setField(term19763, term19763.getClass(), "cursor", null);
        setField(term19763, term19763.getClass(), "locale", null);
        setField(term19763, term19763.getClass(), "graphicsConfig", null);
        setField(term19763, term19763.getClass(), "bufferStrategy", null);
        setBooleanField(term19763, term19763.getClass(), "ignoreRepaint", false);
        setBooleanField(term19763, term19763.getClass(), "visible", false);
        setBooleanField(term19763, term19763.getClass(), "enabled", false);
        setBooleanField(term19763, term19763.getClass(), "valid", false);
        setField(term19763, term19763.getClass(), "dropTarget", null);
        setField(term19763, term19763.getClass(), "popups", null);
        setField(term19763, term19763.getClass(), "name", null);
        setBooleanField(term19763, term19763.getClass(), "nameExplicitlySet", false);
        setBooleanField(term19763, term19763.getClass(), "focusable", false);
        setIntField(term19763, term19763.getClass(), "isFocusTraversableOverridden", 0);
        setField(term19763, term19763.getClass(), "focusTraversalKeys", null);
        setBooleanField(term19763, term19763.getClass(), "focusTraversalKeysEnabled", false);
        setField(term19763, term19763.getClass(), "acc", null);
        setField(term19763, term19763.getClass(), "minSize", null);
        setBooleanField(term19763, term19763.getClass(), "minSizeSet", false);
        setField(term19763, term19763.getClass(), "prefSize", null);
        setBooleanField(term19763, term19763.getClass(), "prefSizeSet", false);
        setField(term19763, term19763.getClass(), "maxSize", null);
        setBooleanField(term19763, term19763.getClass(), "maxSizeSet", false);
        setField(term19763, term19763.getClass(), "componentOrientation", null);
        setBooleanField(term19763, term19763.getClass(), "newEventsOnly", false);
        setField(term19763, term19763.getClass(), "componentListener", null);
        setField(term19763, term19763.getClass(), "focusListener", null);
        setField(term19763, term19763.getClass(), "hierarchyListener", null);
        setField(term19763, term19763.getClass(), "hierarchyBoundsListener", null);
        setField(term19763, term19763.getClass(), "keyListener", null);
        setField(term19763, term19763.getClass(), "mouseListener", null);
        setField(term19763, term19763.getClass(), "mouseMotionListener", null);
        setField(term19763, term19763.getClass(), "mouseWheelListener", null);
        setField(term19763, term19763.getClass(), "inputMethodListener", null);
        setLongField(term19763, term19763.getClass(), "eventMask", 0L);
        setField(term19763, term19763.getClass(), "changeSupport", null);
        setField(term19763, term19763.getClass(), "objectLock", null);
        setBooleanField(term19763, term19763.getClass(), "isPacked", false);
        setIntField(term19763, term19763.getClass(), "boundsOp", 0);
        setField(term19763, term19763.getClass(), "compoundShape", null);
        setField(term19763, term19763.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term19763, term19763.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term19763, term19763.getClass(), "backgroundEraseDisabled", false);
        setField(term19763, term19763.getClass(), "eventCache", null);
        setBooleanField(term19763, term19763.getClass(), "coalescingEnabled", false);
        setBooleanField(term19763, term19763.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term19763, term19763.getClass(), "componentSerializedDataVersion", 0);
        setField(term19763, term19763.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.AssignmentHandler$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term19763, args);
    }

};


