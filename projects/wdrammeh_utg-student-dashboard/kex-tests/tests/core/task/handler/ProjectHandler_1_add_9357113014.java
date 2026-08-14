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
     Object term26733;

    public ProjectHandler_1_add_9357113014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26733 = newInstance(Class.forName("core.task.handler.ProjectHandler$1"));
        setBooleanField(term26733, term26733.getClass(), "reflectTheme", false);
        setBooleanField(term26733, term26733.getClass(), "isAlignmentXSet", false);
        setFloatField(term26733, term26733.getClass(), "alignmentX", 0.0F);
        setBooleanField(term26733, term26733.getClass(), "isAlignmentYSet", false);
        setFloatField(term26733, term26733.getClass(), "alignmentY", 0.0F);
        setField(term26733, term26733.getClass(), "ui", null);
        setField(term26733, term26733.getClass(), "listenerList", null);
        setField(term26733, term26733.getClass(), "clientProperties", null);
        setField(term26733, term26733.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term26733, term26733.getClass(), "autoscrolls", false);
        setField(term26733, term26733.getClass(), "border", null);
        setIntField(term26733, term26733.getClass(), "flags", 0);
        setField(term26733, term26733.getClass(), "inputVerifier", null);
        setBooleanField(term26733, term26733.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term26733, term26733.getClass(), "paintingChild", null);
        setField(term26733, term26733.getClass(), "popupMenu", null);
        setField(term26733, term26733.getClass(), "revalidateRunnableScheduled", null);
        setField(term26733, term26733.getClass(), "focusInputMap", null);
        setField(term26733, term26733.getClass(), "ancestorInputMap", null);
        setField(term26733, term26733.getClass(), "windowInputMap", null);
        setField(term26733, term26733.getClass(), "actionMap", null);
        setField(term26733, term26733.getClass(), "aaHint", null);
        setField(term26733, term26733.getClass(), "lcdRenderingHint", null);
        setField(term26733, term26733.getClass(), "component", null);
        setField(term26733, term26733.getClass(), "layoutMgr", null);
        setField(term26733, term26733.getClass(), "dispatcher", null);
        setField(term26733, term26733.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term26733, term26733.getClass(), "focusCycleRoot", false);
        setBooleanField(term26733, term26733.getClass(), "focusTraversalPolicyProvider", false);
        setField(term26733, term26733.getClass(), "printingThreads", null);
        setBooleanField(term26733, term26733.getClass(), "printing", false);
        setField(term26733, term26733.getClass(), "containerListener", null);
        setIntField(term26733, term26733.getClass(), "listeningChildren", 0);
        setIntField(term26733, term26733.getClass(), "listeningBoundsChildren", 0);
        setIntField(term26733, term26733.getClass(), "descendantsCount", 0);
        setField(term26733, term26733.getClass(), "preserveBackgroundColor", null);
        setIntField(term26733, term26733.getClass(), "numOfHWComponents", 0);
        setIntField(term26733, term26733.getClass(), "numOfLWComponents", 0);
        setField(term26733, term26733.getClass(), "modalComp", null);
        setField(term26733, term26733.getClass(), "modalAppContext", null);
        setIntField(term26733, term26733.getClass(), "containerSerializedDataVersion", 0);
        setField(term26733, term26733.getClass(), "peer", null);
        setField(term26733, term26733.getClass(), "parent", null);
        setField(term26733, term26733.getClass(), "appContext", null);
        setIntField(term26733, term26733.getClass(), "x", 0);
        setIntField(term26733, term26733.getClass(), "y", 0);
        setIntField(term26733, term26733.getClass(), "width", 0);
        setIntField(term26733, term26733.getClass(), "height", 0);
        setField(term26733, term26733.getClass(), "foreground", null);
        setField(term26733, term26733.getClass(), "background", null);
        setField(term26733, term26733.getClass(), "font", null);
        setField(term26733, term26733.getClass(), "peerFont", null);
        setField(term26733, term26733.getClass(), "cursor", null);
        setField(term26733, term26733.getClass(), "locale", null);
        setField(term26733, term26733.getClass(), "graphicsConfig", null);
        setField(term26733, term26733.getClass(), "bufferStrategy", null);
        setBooleanField(term26733, term26733.getClass(), "ignoreRepaint", false);
        setBooleanField(term26733, term26733.getClass(), "visible", false);
        setBooleanField(term26733, term26733.getClass(), "enabled", false);
        setBooleanField(term26733, term26733.getClass(), "valid", false);
        setField(term26733, term26733.getClass(), "dropTarget", null);
        setField(term26733, term26733.getClass(), "popups", null);
        setField(term26733, term26733.getClass(), "name", null);
        setBooleanField(term26733, term26733.getClass(), "nameExplicitlySet", false);
        setBooleanField(term26733, term26733.getClass(), "focusable", false);
        setIntField(term26733, term26733.getClass(), "isFocusTraversableOverridden", 0);
        setField(term26733, term26733.getClass(), "focusTraversalKeys", null);
        setBooleanField(term26733, term26733.getClass(), "focusTraversalKeysEnabled", false);
        setField(term26733, term26733.getClass(), "acc", null);
        setField(term26733, term26733.getClass(), "minSize", null);
        setBooleanField(term26733, term26733.getClass(), "minSizeSet", false);
        setField(term26733, term26733.getClass(), "prefSize", null);
        setBooleanField(term26733, term26733.getClass(), "prefSizeSet", false);
        setField(term26733, term26733.getClass(), "maxSize", null);
        setBooleanField(term26733, term26733.getClass(), "maxSizeSet", false);
        setField(term26733, term26733.getClass(), "componentOrientation", null);
        setBooleanField(term26733, term26733.getClass(), "newEventsOnly", false);
        setField(term26733, term26733.getClass(), "componentListener", null);
        setField(term26733, term26733.getClass(), "focusListener", null);
        setField(term26733, term26733.getClass(), "hierarchyListener", null);
        setField(term26733, term26733.getClass(), "hierarchyBoundsListener", null);
        setField(term26733, term26733.getClass(), "keyListener", null);
        setField(term26733, term26733.getClass(), "mouseListener", null);
        setField(term26733, term26733.getClass(), "mouseMotionListener", null);
        setField(term26733, term26733.getClass(), "mouseWheelListener", null);
        setField(term26733, term26733.getClass(), "inputMethodListener", null);
        setLongField(term26733, term26733.getClass(), "eventMask", 0L);
        setField(term26733, term26733.getClass(), "changeSupport", null);
        setField(term26733, term26733.getClass(), "objectLock", null);
        setBooleanField(term26733, term26733.getClass(), "isPacked", false);
        setIntField(term26733, term26733.getClass(), "boundsOp", 0);
        setField(term26733, term26733.getClass(), "compoundShape", null);
        setField(term26733, term26733.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term26733, term26733.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term26733, term26733.getClass(), "backgroundEraseDisabled", false);
        setField(term26733, term26733.getClass(), "eventCache", null);
        setBooleanField(term26733, term26733.getClass(), "coalescingEnabled", false);
        setBooleanField(term26733, term26733.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term26733, term26733.getClass(), "componentSerializedDataVersion", 0);
        setField(term26733, term26733.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.ProjectHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term26733, args);
    }

};


