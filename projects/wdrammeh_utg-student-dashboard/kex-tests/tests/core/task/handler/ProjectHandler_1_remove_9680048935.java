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
     Object term26775;

    public ProjectHandler_1_remove_9680048935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26775 = newInstance(Class.forName("core.task.handler.ProjectHandler$1"));
        setBooleanField(term26775, term26775.getClass(), "reflectTheme", false);
        setBooleanField(term26775, term26775.getClass(), "isAlignmentXSet", false);
        setFloatField(term26775, term26775.getClass(), "alignmentX", 0.0F);
        setBooleanField(term26775, term26775.getClass(), "isAlignmentYSet", false);
        setFloatField(term26775, term26775.getClass(), "alignmentY", 0.0F);
        setField(term26775, term26775.getClass(), "ui", null);
        setField(term26775, term26775.getClass(), "listenerList", null);
        setField(term26775, term26775.getClass(), "clientProperties", null);
        setField(term26775, term26775.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term26775, term26775.getClass(), "autoscrolls", false);
        setField(term26775, term26775.getClass(), "border", null);
        setIntField(term26775, term26775.getClass(), "flags", 0);
        setField(term26775, term26775.getClass(), "inputVerifier", null);
        setBooleanField(term26775, term26775.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term26775, term26775.getClass(), "paintingChild", null);
        setField(term26775, term26775.getClass(), "popupMenu", null);
        setField(term26775, term26775.getClass(), "revalidateRunnableScheduled", null);
        setField(term26775, term26775.getClass(), "focusInputMap", null);
        setField(term26775, term26775.getClass(), "ancestorInputMap", null);
        setField(term26775, term26775.getClass(), "windowInputMap", null);
        setField(term26775, term26775.getClass(), "actionMap", null);
        setField(term26775, term26775.getClass(), "aaHint", null);
        setField(term26775, term26775.getClass(), "lcdRenderingHint", null);
        setField(term26775, term26775.getClass(), "component", null);
        setField(term26775, term26775.getClass(), "layoutMgr", null);
        setField(term26775, term26775.getClass(), "dispatcher", null);
        setField(term26775, term26775.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term26775, term26775.getClass(), "focusCycleRoot", false);
        setBooleanField(term26775, term26775.getClass(), "focusTraversalPolicyProvider", false);
        setField(term26775, term26775.getClass(), "printingThreads", null);
        setBooleanField(term26775, term26775.getClass(), "printing", false);
        setField(term26775, term26775.getClass(), "containerListener", null);
        setIntField(term26775, term26775.getClass(), "listeningChildren", 0);
        setIntField(term26775, term26775.getClass(), "listeningBoundsChildren", 0);
        setIntField(term26775, term26775.getClass(), "descendantsCount", 0);
        setField(term26775, term26775.getClass(), "preserveBackgroundColor", null);
        setIntField(term26775, term26775.getClass(), "numOfHWComponents", 0);
        setIntField(term26775, term26775.getClass(), "numOfLWComponents", 0);
        setField(term26775, term26775.getClass(), "modalComp", null);
        setField(term26775, term26775.getClass(), "modalAppContext", null);
        setIntField(term26775, term26775.getClass(), "containerSerializedDataVersion", 0);
        setField(term26775, term26775.getClass(), "peer", null);
        setField(term26775, term26775.getClass(), "parent", null);
        setField(term26775, term26775.getClass(), "appContext", null);
        setIntField(term26775, term26775.getClass(), "x", 0);
        setIntField(term26775, term26775.getClass(), "y", 0);
        setIntField(term26775, term26775.getClass(), "width", 0);
        setIntField(term26775, term26775.getClass(), "height", 0);
        setField(term26775, term26775.getClass(), "foreground", null);
        setField(term26775, term26775.getClass(), "background", null);
        setField(term26775, term26775.getClass(), "font", null);
        setField(term26775, term26775.getClass(), "peerFont", null);
        setField(term26775, term26775.getClass(), "cursor", null);
        setField(term26775, term26775.getClass(), "locale", null);
        setField(term26775, term26775.getClass(), "graphicsConfig", null);
        setField(term26775, term26775.getClass(), "bufferStrategy", null);
        setBooleanField(term26775, term26775.getClass(), "ignoreRepaint", false);
        setBooleanField(term26775, term26775.getClass(), "visible", false);
        setBooleanField(term26775, term26775.getClass(), "enabled", false);
        setBooleanField(term26775, term26775.getClass(), "valid", false);
        setField(term26775, term26775.getClass(), "dropTarget", null);
        setField(term26775, term26775.getClass(), "popups", null);
        setField(term26775, term26775.getClass(), "name", null);
        setBooleanField(term26775, term26775.getClass(), "nameExplicitlySet", false);
        setBooleanField(term26775, term26775.getClass(), "focusable", false);
        setIntField(term26775, term26775.getClass(), "isFocusTraversableOverridden", 0);
        setField(term26775, term26775.getClass(), "focusTraversalKeys", null);
        setBooleanField(term26775, term26775.getClass(), "focusTraversalKeysEnabled", false);
        setField(term26775, term26775.getClass(), "acc", null);
        setField(term26775, term26775.getClass(), "minSize", null);
        setBooleanField(term26775, term26775.getClass(), "minSizeSet", false);
        setField(term26775, term26775.getClass(), "prefSize", null);
        setBooleanField(term26775, term26775.getClass(), "prefSizeSet", false);
        setField(term26775, term26775.getClass(), "maxSize", null);
        setBooleanField(term26775, term26775.getClass(), "maxSizeSet", false);
        setField(term26775, term26775.getClass(), "componentOrientation", null);
        setBooleanField(term26775, term26775.getClass(), "newEventsOnly", false);
        setField(term26775, term26775.getClass(), "componentListener", null);
        setField(term26775, term26775.getClass(), "focusListener", null);
        setField(term26775, term26775.getClass(), "hierarchyListener", null);
        setField(term26775, term26775.getClass(), "hierarchyBoundsListener", null);
        setField(term26775, term26775.getClass(), "keyListener", null);
        setField(term26775, term26775.getClass(), "mouseListener", null);
        setField(term26775, term26775.getClass(), "mouseMotionListener", null);
        setField(term26775, term26775.getClass(), "mouseWheelListener", null);
        setField(term26775, term26775.getClass(), "inputMethodListener", null);
        setLongField(term26775, term26775.getClass(), "eventMask", 0L);
        setField(term26775, term26775.getClass(), "changeSupport", null);
        setField(term26775, term26775.getClass(), "objectLock", null);
        setBooleanField(term26775, term26775.getClass(), "isPacked", false);
        setIntField(term26775, term26775.getClass(), "boundsOp", 0);
        setField(term26775, term26775.getClass(), "compoundShape", null);
        setField(term26775, term26775.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term26775, term26775.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term26775, term26775.getClass(), "backgroundEraseDisabled", false);
        setField(term26775, term26775.getClass(), "eventCache", null);
        setBooleanField(term26775, term26775.getClass(), "coalescingEnabled", false);
        setBooleanField(term26775, term26775.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term26775, term26775.getClass(), "componentSerializedDataVersion", 0);
        setField(term26775, term26775.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.ProjectHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term26775, args);
    }

};


