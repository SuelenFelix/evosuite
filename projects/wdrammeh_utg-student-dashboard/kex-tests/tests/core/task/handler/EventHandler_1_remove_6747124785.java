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

public class EventHandler_1_remove_6747124785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271931;

    public EventHandler_1_remove_6747124785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271931 = newInstance(Class.forName("core.task.handler.EventHandler$1"));
        setBooleanField(term271931, term271931.getClass(), "reflectTheme", false);
        setBooleanField(term271931, term271931.getClass(), "isAlignmentXSet", false);
        setFloatField(term271931, term271931.getClass(), "alignmentX", 0.0F);
        setBooleanField(term271931, term271931.getClass(), "isAlignmentYSet", false);
        setFloatField(term271931, term271931.getClass(), "alignmentY", 0.0F);
        setField(term271931, term271931.getClass(), "ui", null);
        setField(term271931, term271931.getClass(), "listenerList", null);
        setField(term271931, term271931.getClass(), "clientProperties", null);
        setField(term271931, term271931.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term271931, term271931.getClass(), "autoscrolls", false);
        setField(term271931, term271931.getClass(), "border", null);
        setIntField(term271931, term271931.getClass(), "flags", 0);
        setField(term271931, term271931.getClass(), "inputVerifier", null);
        setBooleanField(term271931, term271931.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term271931, term271931.getClass(), "paintingChild", null);
        setField(term271931, term271931.getClass(), "popupMenu", null);
        setField(term271931, term271931.getClass(), "revalidateRunnableScheduled", null);
        setField(term271931, term271931.getClass(), "focusInputMap", null);
        setField(term271931, term271931.getClass(), "ancestorInputMap", null);
        setField(term271931, term271931.getClass(), "windowInputMap", null);
        setField(term271931, term271931.getClass(), "actionMap", null);
        setField(term271931, term271931.getClass(), "aaHint", null);
        setField(term271931, term271931.getClass(), "lcdRenderingHint", null);
        setField(term271931, term271931.getClass(), "component", null);
        setField(term271931, term271931.getClass(), "layoutMgr", null);
        setField(term271931, term271931.getClass(), "dispatcher", null);
        setField(term271931, term271931.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term271931, term271931.getClass(), "focusCycleRoot", false);
        setBooleanField(term271931, term271931.getClass(), "focusTraversalPolicyProvider", false);
        setField(term271931, term271931.getClass(), "printingThreads", null);
        setBooleanField(term271931, term271931.getClass(), "printing", false);
        setField(term271931, term271931.getClass(), "containerListener", null);
        setIntField(term271931, term271931.getClass(), "listeningChildren", 0);
        setIntField(term271931, term271931.getClass(), "listeningBoundsChildren", 0);
        setIntField(term271931, term271931.getClass(), "descendantsCount", 0);
        setField(term271931, term271931.getClass(), "preserveBackgroundColor", null);
        setIntField(term271931, term271931.getClass(), "numOfHWComponents", 0);
        setIntField(term271931, term271931.getClass(), "numOfLWComponents", 0);
        setField(term271931, term271931.getClass(), "modalComp", null);
        setField(term271931, term271931.getClass(), "modalAppContext", null);
        setIntField(term271931, term271931.getClass(), "containerSerializedDataVersion", 0);
        setField(term271931, term271931.getClass(), "peer", null);
        setField(term271931, term271931.getClass(), "parent", null);
        setField(term271931, term271931.getClass(), "appContext", null);
        setIntField(term271931, term271931.getClass(), "x", 0);
        setIntField(term271931, term271931.getClass(), "y", 0);
        setIntField(term271931, term271931.getClass(), "width", 0);
        setIntField(term271931, term271931.getClass(), "height", 0);
        setField(term271931, term271931.getClass(), "foreground", null);
        setField(term271931, term271931.getClass(), "background", null);
        setField(term271931, term271931.getClass(), "font", null);
        setField(term271931, term271931.getClass(), "peerFont", null);
        setField(term271931, term271931.getClass(), "cursor", null);
        setField(term271931, term271931.getClass(), "locale", null);
        setField(term271931, term271931.getClass(), "graphicsConfig", null);
        setField(term271931, term271931.getClass(), "bufferStrategy", null);
        setBooleanField(term271931, term271931.getClass(), "ignoreRepaint", false);
        setBooleanField(term271931, term271931.getClass(), "visible", false);
        setBooleanField(term271931, term271931.getClass(), "enabled", false);
        setBooleanField(term271931, term271931.getClass(), "valid", false);
        setField(term271931, term271931.getClass(), "dropTarget", null);
        setField(term271931, term271931.getClass(), "popups", null);
        setField(term271931, term271931.getClass(), "name", null);
        setBooleanField(term271931, term271931.getClass(), "nameExplicitlySet", false);
        setBooleanField(term271931, term271931.getClass(), "focusable", false);
        setIntField(term271931, term271931.getClass(), "isFocusTraversableOverridden", 0);
        setField(term271931, term271931.getClass(), "focusTraversalKeys", null);
        setBooleanField(term271931, term271931.getClass(), "focusTraversalKeysEnabled", false);
        setField(term271931, term271931.getClass(), "acc", null);
        setField(term271931, term271931.getClass(), "minSize", null);
        setBooleanField(term271931, term271931.getClass(), "minSizeSet", false);
        setField(term271931, term271931.getClass(), "prefSize", null);
        setBooleanField(term271931, term271931.getClass(), "prefSizeSet", false);
        setField(term271931, term271931.getClass(), "maxSize", null);
        setBooleanField(term271931, term271931.getClass(), "maxSizeSet", false);
        setField(term271931, term271931.getClass(), "componentOrientation", null);
        setBooleanField(term271931, term271931.getClass(), "newEventsOnly", false);
        setField(term271931, term271931.getClass(), "componentListener", null);
        setField(term271931, term271931.getClass(), "focusListener", null);
        setField(term271931, term271931.getClass(), "hierarchyListener", null);
        setField(term271931, term271931.getClass(), "hierarchyBoundsListener", null);
        setField(term271931, term271931.getClass(), "keyListener", null);
        setField(term271931, term271931.getClass(), "mouseListener", null);
        setField(term271931, term271931.getClass(), "mouseMotionListener", null);
        setField(term271931, term271931.getClass(), "mouseWheelListener", null);
        setField(term271931, term271931.getClass(), "inputMethodListener", null);
        setLongField(term271931, term271931.getClass(), "eventMask", 0L);
        setField(term271931, term271931.getClass(), "changeSupport", null);
        setField(term271931, term271931.getClass(), "objectLock", null);
        setBooleanField(term271931, term271931.getClass(), "isPacked", false);
        setIntField(term271931, term271931.getClass(), "boundsOp", 0);
        setField(term271931, term271931.getClass(), "compoundShape", null);
        setField(term271931, term271931.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term271931, term271931.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term271931, term271931.getClass(), "backgroundEraseDisabled", false);
        setField(term271931, term271931.getClass(), "eventCache", null);
        setBooleanField(term271931, term271931.getClass(), "coalescingEnabled", false);
        setBooleanField(term271931, term271931.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term271931, term271931.getClass(), "componentSerializedDataVersion", 0);
        setField(term271931, term271931.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.EventHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term271931, args);
    }

};


