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

public class ProjectHandler_1_remove_9680048935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26787;

    public ProjectHandler_1_remove_9680048935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26787 = newInstance(Class.forName("core.task.handler.ProjectHandler$1"));
        setBooleanField(term26787, term26787.getClass(), "reflectTheme", false);
        setBooleanField(term26787, term26787.getClass(), "isAlignmentXSet", false);
        setFloatField(term26787, term26787.getClass(), "alignmentX", 0.0F);
        setBooleanField(term26787, term26787.getClass(), "isAlignmentYSet", false);
        setFloatField(term26787, term26787.getClass(), "alignmentY", 0.0F);
        setField(term26787, term26787.getClass(), "ui", null);
        setField(term26787, term26787.getClass(), "listenerList", null);
        setField(term26787, term26787.getClass(), "clientProperties", null);
        setField(term26787, term26787.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term26787, term26787.getClass(), "autoscrolls", false);
        setField(term26787, term26787.getClass(), "border", null);
        setIntField(term26787, term26787.getClass(), "flags", 0);
        setField(term26787, term26787.getClass(), "inputVerifier", null);
        setBooleanField(term26787, term26787.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term26787, term26787.getClass(), "paintingChild", null);
        setField(term26787, term26787.getClass(), "popupMenu", null);
        setField(term26787, term26787.getClass(), "revalidateRunnableScheduled", null);
        setField(term26787, term26787.getClass(), "focusInputMap", null);
        setField(term26787, term26787.getClass(), "ancestorInputMap", null);
        setField(term26787, term26787.getClass(), "windowInputMap", null);
        setField(term26787, term26787.getClass(), "actionMap", null);
        setField(term26787, term26787.getClass(), "aaHint", null);
        setField(term26787, term26787.getClass(), "lcdRenderingHint", null);
        setField(term26787, term26787.getClass(), "component", null);
        setField(term26787, term26787.getClass(), "layoutMgr", null);
        setField(term26787, term26787.getClass(), "dispatcher", null);
        setField(term26787, term26787.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term26787, term26787.getClass(), "focusCycleRoot", false);
        setBooleanField(term26787, term26787.getClass(), "focusTraversalPolicyProvider", false);
        setField(term26787, term26787.getClass(), "printingThreads", null);
        setBooleanField(term26787, term26787.getClass(), "printing", false);
        setField(term26787, term26787.getClass(), "containerListener", null);
        setIntField(term26787, term26787.getClass(), "listeningChildren", 0);
        setIntField(term26787, term26787.getClass(), "listeningBoundsChildren", 0);
        setIntField(term26787, term26787.getClass(), "descendantsCount", 0);
        setField(term26787, term26787.getClass(), "preserveBackgroundColor", null);
        setIntField(term26787, term26787.getClass(), "numOfHWComponents", 0);
        setIntField(term26787, term26787.getClass(), "numOfLWComponents", 0);
        setField(term26787, term26787.getClass(), "modalComp", null);
        setField(term26787, term26787.getClass(), "modalAppContext", null);
        setIntField(term26787, term26787.getClass(), "containerSerializedDataVersion", 0);
        setField(term26787, term26787.getClass(), "peer", null);
        setField(term26787, term26787.getClass(), "parent", null);
        setField(term26787, term26787.getClass(), "appContext", null);
        setIntField(term26787, term26787.getClass(), "x", 0);
        setIntField(term26787, term26787.getClass(), "y", 0);
        setIntField(term26787, term26787.getClass(), "width", 0);
        setIntField(term26787, term26787.getClass(), "height", 0);
        setField(term26787, term26787.getClass(), "foreground", null);
        setField(term26787, term26787.getClass(), "background", null);
        setField(term26787, term26787.getClass(), "font", null);
        setField(term26787, term26787.getClass(), "peerFont", null);
        setField(term26787, term26787.getClass(), "cursor", null);
        setField(term26787, term26787.getClass(), "locale", null);
        setField(term26787, term26787.getClass(), "graphicsConfig", null);
        setField(term26787, term26787.getClass(), "bufferStrategy", null);
        setBooleanField(term26787, term26787.getClass(), "ignoreRepaint", false);
        setBooleanField(term26787, term26787.getClass(), "visible", false);
        setBooleanField(term26787, term26787.getClass(), "enabled", false);
        setBooleanField(term26787, term26787.getClass(), "valid", false);
        setField(term26787, term26787.getClass(), "dropTarget", null);
        setField(term26787, term26787.getClass(), "popups", null);
        setField(term26787, term26787.getClass(), "name", null);
        setBooleanField(term26787, term26787.getClass(), "nameExplicitlySet", false);
        setBooleanField(term26787, term26787.getClass(), "focusable", false);
        setIntField(term26787, term26787.getClass(), "isFocusTraversableOverridden", 0);
        setField(term26787, term26787.getClass(), "focusTraversalKeys", null);
        setBooleanField(term26787, term26787.getClass(), "focusTraversalKeysEnabled", false);
        setField(term26787, term26787.getClass(), "acc", null);
        setField(term26787, term26787.getClass(), "minSize", null);
        setBooleanField(term26787, term26787.getClass(), "minSizeSet", false);
        setField(term26787, term26787.getClass(), "prefSize", null);
        setBooleanField(term26787, term26787.getClass(), "prefSizeSet", false);
        setField(term26787, term26787.getClass(), "maxSize", null);
        setBooleanField(term26787, term26787.getClass(), "maxSizeSet", false);
        setField(term26787, term26787.getClass(), "componentOrientation", null);
        setBooleanField(term26787, term26787.getClass(), "newEventsOnly", false);
        setField(term26787, term26787.getClass(), "componentListener", null);
        setField(term26787, term26787.getClass(), "focusListener", null);
        setField(term26787, term26787.getClass(), "hierarchyListener", null);
        setField(term26787, term26787.getClass(), "hierarchyBoundsListener", null);
        setField(term26787, term26787.getClass(), "keyListener", null);
        setField(term26787, term26787.getClass(), "mouseListener", null);
        setField(term26787, term26787.getClass(), "mouseMotionListener", null);
        setField(term26787, term26787.getClass(), "mouseWheelListener", null);
        setField(term26787, term26787.getClass(), "inputMethodListener", null);
        setLongField(term26787, term26787.getClass(), "eventMask", 0L);
        setField(term26787, term26787.getClass(), "changeSupport", null);
        setField(term26787, term26787.getClass(), "objectLock", null);
        setBooleanField(term26787, term26787.getClass(), "isPacked", false);
        setIntField(term26787, term26787.getClass(), "boundsOp", 0);
        setField(term26787, term26787.getClass(), "compoundShape", null);
        setField(term26787, term26787.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term26787, term26787.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term26787, term26787.getClass(), "backgroundEraseDisabled", false);
        setField(term26787, term26787.getClass(), "eventCache", null);
        setBooleanField(term26787, term26787.getClass(), "coalescingEnabled", false);
        setBooleanField(term26787, term26787.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term26787, term26787.getClass(), "componentSerializedDataVersion", 0);
        setField(term26787, term26787.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.ProjectHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term26787, args);
    }

};


