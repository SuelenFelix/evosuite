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
     Object term26745;

    public ProjectHandler_1_add_9357113014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26745 = newInstance(Class.forName("core.task.handler.ProjectHandler$1"));
        setBooleanField(term26745, term26745.getClass(), "reflectTheme", false);
        setBooleanField(term26745, term26745.getClass(), "isAlignmentXSet", false);
        setFloatField(term26745, term26745.getClass(), "alignmentX", 0.0F);
        setBooleanField(term26745, term26745.getClass(), "isAlignmentYSet", false);
        setFloatField(term26745, term26745.getClass(), "alignmentY", 0.0F);
        setField(term26745, term26745.getClass(), "ui", null);
        setField(term26745, term26745.getClass(), "listenerList", null);
        setField(term26745, term26745.getClass(), "clientProperties", null);
        setField(term26745, term26745.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term26745, term26745.getClass(), "autoscrolls", false);
        setField(term26745, term26745.getClass(), "border", null);
        setIntField(term26745, term26745.getClass(), "flags", 0);
        setField(term26745, term26745.getClass(), "inputVerifier", null);
        setBooleanField(term26745, term26745.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term26745, term26745.getClass(), "paintingChild", null);
        setField(term26745, term26745.getClass(), "popupMenu", null);
        setField(term26745, term26745.getClass(), "revalidateRunnableScheduled", null);
        setField(term26745, term26745.getClass(), "focusInputMap", null);
        setField(term26745, term26745.getClass(), "ancestorInputMap", null);
        setField(term26745, term26745.getClass(), "windowInputMap", null);
        setField(term26745, term26745.getClass(), "actionMap", null);
        setField(term26745, term26745.getClass(), "aaHint", null);
        setField(term26745, term26745.getClass(), "lcdRenderingHint", null);
        setField(term26745, term26745.getClass(), "component", null);
        setField(term26745, term26745.getClass(), "layoutMgr", null);
        setField(term26745, term26745.getClass(), "dispatcher", null);
        setField(term26745, term26745.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term26745, term26745.getClass(), "focusCycleRoot", false);
        setBooleanField(term26745, term26745.getClass(), "focusTraversalPolicyProvider", false);
        setField(term26745, term26745.getClass(), "printingThreads", null);
        setBooleanField(term26745, term26745.getClass(), "printing", false);
        setField(term26745, term26745.getClass(), "containerListener", null);
        setIntField(term26745, term26745.getClass(), "listeningChildren", 0);
        setIntField(term26745, term26745.getClass(), "listeningBoundsChildren", 0);
        setIntField(term26745, term26745.getClass(), "descendantsCount", 0);
        setField(term26745, term26745.getClass(), "preserveBackgroundColor", null);
        setIntField(term26745, term26745.getClass(), "numOfHWComponents", 0);
        setIntField(term26745, term26745.getClass(), "numOfLWComponents", 0);
        setField(term26745, term26745.getClass(), "modalComp", null);
        setField(term26745, term26745.getClass(), "modalAppContext", null);
        setIntField(term26745, term26745.getClass(), "containerSerializedDataVersion", 0);
        setField(term26745, term26745.getClass(), "peer", null);
        setField(term26745, term26745.getClass(), "parent", null);
        setField(term26745, term26745.getClass(), "appContext", null);
        setIntField(term26745, term26745.getClass(), "x", 0);
        setIntField(term26745, term26745.getClass(), "y", 0);
        setIntField(term26745, term26745.getClass(), "width", 0);
        setIntField(term26745, term26745.getClass(), "height", 0);
        setField(term26745, term26745.getClass(), "foreground", null);
        setField(term26745, term26745.getClass(), "background", null);
        setField(term26745, term26745.getClass(), "font", null);
        setField(term26745, term26745.getClass(), "peerFont", null);
        setField(term26745, term26745.getClass(), "cursor", null);
        setField(term26745, term26745.getClass(), "locale", null);
        setField(term26745, term26745.getClass(), "graphicsConfig", null);
        setField(term26745, term26745.getClass(), "bufferStrategy", null);
        setBooleanField(term26745, term26745.getClass(), "ignoreRepaint", false);
        setBooleanField(term26745, term26745.getClass(), "visible", false);
        setBooleanField(term26745, term26745.getClass(), "enabled", false);
        setBooleanField(term26745, term26745.getClass(), "valid", false);
        setField(term26745, term26745.getClass(), "dropTarget", null);
        setField(term26745, term26745.getClass(), "popups", null);
        setField(term26745, term26745.getClass(), "name", null);
        setBooleanField(term26745, term26745.getClass(), "nameExplicitlySet", false);
        setBooleanField(term26745, term26745.getClass(), "focusable", false);
        setIntField(term26745, term26745.getClass(), "isFocusTraversableOverridden", 0);
        setField(term26745, term26745.getClass(), "focusTraversalKeys", null);
        setBooleanField(term26745, term26745.getClass(), "focusTraversalKeysEnabled", false);
        setField(term26745, term26745.getClass(), "acc", null);
        setField(term26745, term26745.getClass(), "minSize", null);
        setBooleanField(term26745, term26745.getClass(), "minSizeSet", false);
        setField(term26745, term26745.getClass(), "prefSize", null);
        setBooleanField(term26745, term26745.getClass(), "prefSizeSet", false);
        setField(term26745, term26745.getClass(), "maxSize", null);
        setBooleanField(term26745, term26745.getClass(), "maxSizeSet", false);
        setField(term26745, term26745.getClass(), "componentOrientation", null);
        setBooleanField(term26745, term26745.getClass(), "newEventsOnly", false);
        setField(term26745, term26745.getClass(), "componentListener", null);
        setField(term26745, term26745.getClass(), "focusListener", null);
        setField(term26745, term26745.getClass(), "hierarchyListener", null);
        setField(term26745, term26745.getClass(), "hierarchyBoundsListener", null);
        setField(term26745, term26745.getClass(), "keyListener", null);
        setField(term26745, term26745.getClass(), "mouseListener", null);
        setField(term26745, term26745.getClass(), "mouseMotionListener", null);
        setField(term26745, term26745.getClass(), "mouseWheelListener", null);
        setField(term26745, term26745.getClass(), "inputMethodListener", null);
        setLongField(term26745, term26745.getClass(), "eventMask", 0L);
        setField(term26745, term26745.getClass(), "changeSupport", null);
        setField(term26745, term26745.getClass(), "objectLock", null);
        setBooleanField(term26745, term26745.getClass(), "isPacked", false);
        setIntField(term26745, term26745.getClass(), "boundsOp", 0);
        setField(term26745, term26745.getClass(), "compoundShape", null);
        setField(term26745, term26745.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term26745, term26745.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term26745, term26745.getClass(), "backgroundEraseDisabled", false);
        setField(term26745, term26745.getClass(), "eventCache", null);
        setBooleanField(term26745, term26745.getClass(), "coalescingEnabled", false);
        setBooleanField(term26745, term26745.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term26745, term26745.getClass(), "componentSerializedDataVersion", 0);
        setField(term26745, term26745.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.ProjectHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term26745, args);
    }

};


