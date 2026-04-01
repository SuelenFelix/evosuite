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
     Object term377325;

    public ProjectHandler_1_remove_9680048935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377325 = newInstance(Class.forName("core.task.handler.ProjectHandler$1"));
        setBooleanField(term377325, term377325.getClass(), "reflectTheme", false);
        setBooleanField(term377325, term377325.getClass(), "isAlignmentXSet", false);
        setFloatField(term377325, term377325.getClass(), "alignmentX", 0.0F);
        setBooleanField(term377325, term377325.getClass(), "isAlignmentYSet", false);
        setFloatField(term377325, term377325.getClass(), "alignmentY", 0.0F);
        setField(term377325, term377325.getClass(), "ui", null);
        setField(term377325, term377325.getClass(), "listenerList", null);
        setField(term377325, term377325.getClass(), "clientProperties", null);
        setField(term377325, term377325.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term377325, term377325.getClass(), "autoscrolls", false);
        setField(term377325, term377325.getClass(), "border", null);
        setIntField(term377325, term377325.getClass(), "flags", 0);
        setField(term377325, term377325.getClass(), "inputVerifier", null);
        setBooleanField(term377325, term377325.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term377325, term377325.getClass(), "paintingChild", null);
        setField(term377325, term377325.getClass(), "popupMenu", null);
        setField(term377325, term377325.getClass(), "revalidateRunnableScheduled", null);
        setField(term377325, term377325.getClass(), "focusInputMap", null);
        setField(term377325, term377325.getClass(), "ancestorInputMap", null);
        setField(term377325, term377325.getClass(), "windowInputMap", null);
        setField(term377325, term377325.getClass(), "actionMap", null);
        setField(term377325, term377325.getClass(), "aaHint", null);
        setField(term377325, term377325.getClass(), "lcdRenderingHint", null);
        setField(term377325, term377325.getClass(), "component", null);
        setField(term377325, term377325.getClass(), "layoutMgr", null);
        setField(term377325, term377325.getClass(), "dispatcher", null);
        setField(term377325, term377325.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term377325, term377325.getClass(), "focusCycleRoot", false);
        setBooleanField(term377325, term377325.getClass(), "focusTraversalPolicyProvider", false);
        setField(term377325, term377325.getClass(), "printingThreads", null);
        setBooleanField(term377325, term377325.getClass(), "printing", false);
        setField(term377325, term377325.getClass(), "containerListener", null);
        setIntField(term377325, term377325.getClass(), "listeningChildren", 0);
        setIntField(term377325, term377325.getClass(), "listeningBoundsChildren", 0);
        setIntField(term377325, term377325.getClass(), "descendantsCount", 0);
        setField(term377325, term377325.getClass(), "preserveBackgroundColor", null);
        setIntField(term377325, term377325.getClass(), "numOfHWComponents", 0);
        setIntField(term377325, term377325.getClass(), "numOfLWComponents", 0);
        setField(term377325, term377325.getClass(), "modalComp", null);
        setField(term377325, term377325.getClass(), "modalAppContext", null);
        setIntField(term377325, term377325.getClass(), "containerSerializedDataVersion", 0);
        setField(term377325, term377325.getClass(), "peer", null);
        setField(term377325, term377325.getClass(), "parent", null);
        setField(term377325, term377325.getClass(), "appContext", null);
        setIntField(term377325, term377325.getClass(), "x", 0);
        setIntField(term377325, term377325.getClass(), "y", 0);
        setIntField(term377325, term377325.getClass(), "width", 0);
        setIntField(term377325, term377325.getClass(), "height", 0);
        setField(term377325, term377325.getClass(), "foreground", null);
        setField(term377325, term377325.getClass(), "background", null);
        setField(term377325, term377325.getClass(), "font", null);
        setField(term377325, term377325.getClass(), "peerFont", null);
        setField(term377325, term377325.getClass(), "cursor", null);
        setField(term377325, term377325.getClass(), "locale", null);
        setField(term377325, term377325.getClass(), "graphicsConfig", null);
        setField(term377325, term377325.getClass(), "bufferStrategy", null);
        setBooleanField(term377325, term377325.getClass(), "ignoreRepaint", false);
        setBooleanField(term377325, term377325.getClass(), "visible", false);
        setBooleanField(term377325, term377325.getClass(), "enabled", false);
        setBooleanField(term377325, term377325.getClass(), "valid", false);
        setField(term377325, term377325.getClass(), "dropTarget", null);
        setField(term377325, term377325.getClass(), "popups", null);
        setField(term377325, term377325.getClass(), "name", null);
        setBooleanField(term377325, term377325.getClass(), "nameExplicitlySet", false);
        setBooleanField(term377325, term377325.getClass(), "focusable", false);
        setIntField(term377325, term377325.getClass(), "isFocusTraversableOverridden", 0);
        setField(term377325, term377325.getClass(), "focusTraversalKeys", null);
        setBooleanField(term377325, term377325.getClass(), "focusTraversalKeysEnabled", false);
        setField(term377325, term377325.getClass(), "acc", null);
        setField(term377325, term377325.getClass(), "minSize", null);
        setBooleanField(term377325, term377325.getClass(), "minSizeSet", false);
        setField(term377325, term377325.getClass(), "prefSize", null);
        setBooleanField(term377325, term377325.getClass(), "prefSizeSet", false);
        setField(term377325, term377325.getClass(), "maxSize", null);
        setBooleanField(term377325, term377325.getClass(), "maxSizeSet", false);
        setField(term377325, term377325.getClass(), "componentOrientation", null);
        setBooleanField(term377325, term377325.getClass(), "newEventsOnly", false);
        setField(term377325, term377325.getClass(), "componentListener", null);
        setField(term377325, term377325.getClass(), "focusListener", null);
        setField(term377325, term377325.getClass(), "hierarchyListener", null);
        setField(term377325, term377325.getClass(), "hierarchyBoundsListener", null);
        setField(term377325, term377325.getClass(), "keyListener", null);
        setField(term377325, term377325.getClass(), "mouseListener", null);
        setField(term377325, term377325.getClass(), "mouseMotionListener", null);
        setField(term377325, term377325.getClass(), "mouseWheelListener", null);
        setField(term377325, term377325.getClass(), "inputMethodListener", null);
        setLongField(term377325, term377325.getClass(), "eventMask", 0L);
        setField(term377325, term377325.getClass(), "changeSupport", null);
        setField(term377325, term377325.getClass(), "objectLock", null);
        setBooleanField(term377325, term377325.getClass(), "isPacked", false);
        setIntField(term377325, term377325.getClass(), "boundsOp", 0);
        setField(term377325, term377325.getClass(), "compoundShape", null);
        setField(term377325, term377325.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term377325, term377325.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term377325, term377325.getClass(), "backgroundEraseDisabled", false);
        setField(term377325, term377325.getClass(), "eventCache", null);
        setBooleanField(term377325, term377325.getClass(), "coalescingEnabled", false);
        setBooleanField(term377325, term377325.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term377325, term377325.getClass(), "componentSerializedDataVersion", 0);
        setField(term377325, term377325.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.ProjectHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term377325, args);
    }

};


