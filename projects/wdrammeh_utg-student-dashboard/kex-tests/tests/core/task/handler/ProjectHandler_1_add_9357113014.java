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

public class ProjectHandler_1_add_9357113014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377283;

    public ProjectHandler_1_add_9357113014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377283 = newInstance(Class.forName("core.task.handler.ProjectHandler$1"));
        setBooleanField(term377283, term377283.getClass(), "reflectTheme", false);
        setBooleanField(term377283, term377283.getClass(), "isAlignmentXSet", false);
        setFloatField(term377283, term377283.getClass(), "alignmentX", 0.0F);
        setBooleanField(term377283, term377283.getClass(), "isAlignmentYSet", false);
        setFloatField(term377283, term377283.getClass(), "alignmentY", 0.0F);
        setField(term377283, term377283.getClass(), "ui", null);
        setField(term377283, term377283.getClass(), "listenerList", null);
        setField(term377283, term377283.getClass(), "clientProperties", null);
        setField(term377283, term377283.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term377283, term377283.getClass(), "autoscrolls", false);
        setField(term377283, term377283.getClass(), "border", null);
        setIntField(term377283, term377283.getClass(), "flags", 0);
        setField(term377283, term377283.getClass(), "inputVerifier", null);
        setBooleanField(term377283, term377283.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term377283, term377283.getClass(), "paintingChild", null);
        setField(term377283, term377283.getClass(), "popupMenu", null);
        setField(term377283, term377283.getClass(), "revalidateRunnableScheduled", null);
        setField(term377283, term377283.getClass(), "focusInputMap", null);
        setField(term377283, term377283.getClass(), "ancestorInputMap", null);
        setField(term377283, term377283.getClass(), "windowInputMap", null);
        setField(term377283, term377283.getClass(), "actionMap", null);
        setField(term377283, term377283.getClass(), "aaHint", null);
        setField(term377283, term377283.getClass(), "lcdRenderingHint", null);
        setField(term377283, term377283.getClass(), "component", null);
        setField(term377283, term377283.getClass(), "layoutMgr", null);
        setField(term377283, term377283.getClass(), "dispatcher", null);
        setField(term377283, term377283.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term377283, term377283.getClass(), "focusCycleRoot", false);
        setBooleanField(term377283, term377283.getClass(), "focusTraversalPolicyProvider", false);
        setField(term377283, term377283.getClass(), "printingThreads", null);
        setBooleanField(term377283, term377283.getClass(), "printing", false);
        setField(term377283, term377283.getClass(), "containerListener", null);
        setIntField(term377283, term377283.getClass(), "listeningChildren", 0);
        setIntField(term377283, term377283.getClass(), "listeningBoundsChildren", 0);
        setIntField(term377283, term377283.getClass(), "descendantsCount", 0);
        setField(term377283, term377283.getClass(), "preserveBackgroundColor", null);
        setIntField(term377283, term377283.getClass(), "numOfHWComponents", 0);
        setIntField(term377283, term377283.getClass(), "numOfLWComponents", 0);
        setField(term377283, term377283.getClass(), "modalComp", null);
        setField(term377283, term377283.getClass(), "modalAppContext", null);
        setIntField(term377283, term377283.getClass(), "containerSerializedDataVersion", 0);
        setField(term377283, term377283.getClass(), "peer", null);
        setField(term377283, term377283.getClass(), "parent", null);
        setField(term377283, term377283.getClass(), "appContext", null);
        setIntField(term377283, term377283.getClass(), "x", 0);
        setIntField(term377283, term377283.getClass(), "y", 0);
        setIntField(term377283, term377283.getClass(), "width", 0);
        setIntField(term377283, term377283.getClass(), "height", 0);
        setField(term377283, term377283.getClass(), "foreground", null);
        setField(term377283, term377283.getClass(), "background", null);
        setField(term377283, term377283.getClass(), "font", null);
        setField(term377283, term377283.getClass(), "peerFont", null);
        setField(term377283, term377283.getClass(), "cursor", null);
        setField(term377283, term377283.getClass(), "locale", null);
        setField(term377283, term377283.getClass(), "graphicsConfig", null);
        setField(term377283, term377283.getClass(), "bufferStrategy", null);
        setBooleanField(term377283, term377283.getClass(), "ignoreRepaint", false);
        setBooleanField(term377283, term377283.getClass(), "visible", false);
        setBooleanField(term377283, term377283.getClass(), "enabled", false);
        setBooleanField(term377283, term377283.getClass(), "valid", false);
        setField(term377283, term377283.getClass(), "dropTarget", null);
        setField(term377283, term377283.getClass(), "popups", null);
        setField(term377283, term377283.getClass(), "name", null);
        setBooleanField(term377283, term377283.getClass(), "nameExplicitlySet", false);
        setBooleanField(term377283, term377283.getClass(), "focusable", false);
        setIntField(term377283, term377283.getClass(), "isFocusTraversableOverridden", 0);
        setField(term377283, term377283.getClass(), "focusTraversalKeys", null);
        setBooleanField(term377283, term377283.getClass(), "focusTraversalKeysEnabled", false);
        setField(term377283, term377283.getClass(), "acc", null);
        setField(term377283, term377283.getClass(), "minSize", null);
        setBooleanField(term377283, term377283.getClass(), "minSizeSet", false);
        setField(term377283, term377283.getClass(), "prefSize", null);
        setBooleanField(term377283, term377283.getClass(), "prefSizeSet", false);
        setField(term377283, term377283.getClass(), "maxSize", null);
        setBooleanField(term377283, term377283.getClass(), "maxSizeSet", false);
        setField(term377283, term377283.getClass(), "componentOrientation", null);
        setBooleanField(term377283, term377283.getClass(), "newEventsOnly", false);
        setField(term377283, term377283.getClass(), "componentListener", null);
        setField(term377283, term377283.getClass(), "focusListener", null);
        setField(term377283, term377283.getClass(), "hierarchyListener", null);
        setField(term377283, term377283.getClass(), "hierarchyBoundsListener", null);
        setField(term377283, term377283.getClass(), "keyListener", null);
        setField(term377283, term377283.getClass(), "mouseListener", null);
        setField(term377283, term377283.getClass(), "mouseMotionListener", null);
        setField(term377283, term377283.getClass(), "mouseWheelListener", null);
        setField(term377283, term377283.getClass(), "inputMethodListener", null);
        setLongField(term377283, term377283.getClass(), "eventMask", 0L);
        setField(term377283, term377283.getClass(), "changeSupport", null);
        setField(term377283, term377283.getClass(), "objectLock", null);
        setBooleanField(term377283, term377283.getClass(), "isPacked", false);
        setIntField(term377283, term377283.getClass(), "boundsOp", 0);
        setField(term377283, term377283.getClass(), "compoundShape", null);
        setField(term377283, term377283.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term377283, term377283.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term377283, term377283.getClass(), "backgroundEraseDisabled", false);
        setField(term377283, term377283.getClass(), "eventCache", null);
        setBooleanField(term377283, term377283.getClass(), "coalescingEnabled", false);
        setBooleanField(term377283, term377283.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term377283, term377283.getClass(), "componentSerializedDataVersion", 0);
        setField(term377283, term377283.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.ProjectHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term377283, args);
    }

};


