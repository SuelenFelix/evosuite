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
     Object term21192;

    public EventHandler_1_remove_6747124785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21192 = newInstance(Class.forName("core.task.handler.EventHandler$1"));
        setBooleanField(term21192, term21192.getClass(), "reflectTheme", false);
        setBooleanField(term21192, term21192.getClass(), "isAlignmentXSet", false);
        setFloatField(term21192, term21192.getClass(), "alignmentX", 0.0F);
        setBooleanField(term21192, term21192.getClass(), "isAlignmentYSet", false);
        setFloatField(term21192, term21192.getClass(), "alignmentY", 0.0F);
        setField(term21192, term21192.getClass(), "ui", null);
        setField(term21192, term21192.getClass(), "listenerList", null);
        setField(term21192, term21192.getClass(), "clientProperties", null);
        setField(term21192, term21192.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term21192, term21192.getClass(), "autoscrolls", false);
        setField(term21192, term21192.getClass(), "border", null);
        setIntField(term21192, term21192.getClass(), "flags", 0);
        setField(term21192, term21192.getClass(), "inputVerifier", null);
        setBooleanField(term21192, term21192.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term21192, term21192.getClass(), "paintingChild", null);
        setField(term21192, term21192.getClass(), "popupMenu", null);
        setField(term21192, term21192.getClass(), "revalidateRunnableScheduled", null);
        setField(term21192, term21192.getClass(), "focusInputMap", null);
        setField(term21192, term21192.getClass(), "ancestorInputMap", null);
        setField(term21192, term21192.getClass(), "windowInputMap", null);
        setField(term21192, term21192.getClass(), "actionMap", null);
        setField(term21192, term21192.getClass(), "aaHint", null);
        setField(term21192, term21192.getClass(), "lcdRenderingHint", null);
        setField(term21192, term21192.getClass(), "component", null);
        setField(term21192, term21192.getClass(), "layoutMgr", null);
        setField(term21192, term21192.getClass(), "dispatcher", null);
        setField(term21192, term21192.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term21192, term21192.getClass(), "focusCycleRoot", false);
        setBooleanField(term21192, term21192.getClass(), "focusTraversalPolicyProvider", false);
        setField(term21192, term21192.getClass(), "printingThreads", null);
        setBooleanField(term21192, term21192.getClass(), "printing", false);
        setField(term21192, term21192.getClass(), "containerListener", null);
        setIntField(term21192, term21192.getClass(), "listeningChildren", 0);
        setIntField(term21192, term21192.getClass(), "listeningBoundsChildren", 0);
        setIntField(term21192, term21192.getClass(), "descendantsCount", 0);
        setField(term21192, term21192.getClass(), "preserveBackgroundColor", null);
        setIntField(term21192, term21192.getClass(), "numOfHWComponents", 0);
        setIntField(term21192, term21192.getClass(), "numOfLWComponents", 0);
        setField(term21192, term21192.getClass(), "modalComp", null);
        setField(term21192, term21192.getClass(), "modalAppContext", null);
        setIntField(term21192, term21192.getClass(), "containerSerializedDataVersion", 0);
        setField(term21192, term21192.getClass(), "peer", null);
        setField(term21192, term21192.getClass(), "parent", null);
        setField(term21192, term21192.getClass(), "appContext", null);
        setIntField(term21192, term21192.getClass(), "x", 0);
        setIntField(term21192, term21192.getClass(), "y", 0);
        setIntField(term21192, term21192.getClass(), "width", 0);
        setIntField(term21192, term21192.getClass(), "height", 0);
        setField(term21192, term21192.getClass(), "foreground", null);
        setField(term21192, term21192.getClass(), "background", null);
        setField(term21192, term21192.getClass(), "font", null);
        setField(term21192, term21192.getClass(), "peerFont", null);
        setField(term21192, term21192.getClass(), "cursor", null);
        setField(term21192, term21192.getClass(), "locale", null);
        setField(term21192, term21192.getClass(), "graphicsConfig", null);
        setField(term21192, term21192.getClass(), "bufferStrategy", null);
        setBooleanField(term21192, term21192.getClass(), "ignoreRepaint", false);
        setBooleanField(term21192, term21192.getClass(), "visible", false);
        setBooleanField(term21192, term21192.getClass(), "enabled", false);
        setBooleanField(term21192, term21192.getClass(), "valid", false);
        setField(term21192, term21192.getClass(), "dropTarget", null);
        setField(term21192, term21192.getClass(), "popups", null);
        setField(term21192, term21192.getClass(), "name", null);
        setBooleanField(term21192, term21192.getClass(), "nameExplicitlySet", false);
        setBooleanField(term21192, term21192.getClass(), "focusable", false);
        setIntField(term21192, term21192.getClass(), "isFocusTraversableOverridden", 0);
        setField(term21192, term21192.getClass(), "focusTraversalKeys", null);
        setBooleanField(term21192, term21192.getClass(), "focusTraversalKeysEnabled", false);
        setField(term21192, term21192.getClass(), "acc", null);
        setField(term21192, term21192.getClass(), "minSize", null);
        setBooleanField(term21192, term21192.getClass(), "minSizeSet", false);
        setField(term21192, term21192.getClass(), "prefSize", null);
        setBooleanField(term21192, term21192.getClass(), "prefSizeSet", false);
        setField(term21192, term21192.getClass(), "maxSize", null);
        setBooleanField(term21192, term21192.getClass(), "maxSizeSet", false);
        setField(term21192, term21192.getClass(), "componentOrientation", null);
        setBooleanField(term21192, term21192.getClass(), "newEventsOnly", false);
        setField(term21192, term21192.getClass(), "componentListener", null);
        setField(term21192, term21192.getClass(), "focusListener", null);
        setField(term21192, term21192.getClass(), "hierarchyListener", null);
        setField(term21192, term21192.getClass(), "hierarchyBoundsListener", null);
        setField(term21192, term21192.getClass(), "keyListener", null);
        setField(term21192, term21192.getClass(), "mouseListener", null);
        setField(term21192, term21192.getClass(), "mouseMotionListener", null);
        setField(term21192, term21192.getClass(), "mouseWheelListener", null);
        setField(term21192, term21192.getClass(), "inputMethodListener", null);
        setLongField(term21192, term21192.getClass(), "eventMask", 0L);
        setField(term21192, term21192.getClass(), "changeSupport", null);
        setField(term21192, term21192.getClass(), "objectLock", null);
        setBooleanField(term21192, term21192.getClass(), "isPacked", false);
        setIntField(term21192, term21192.getClass(), "boundsOp", 0);
        setField(term21192, term21192.getClass(), "compoundShape", null);
        setField(term21192, term21192.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term21192, term21192.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term21192, term21192.getClass(), "backgroundEraseDisabled", false);
        setField(term21192, term21192.getClass(), "eventCache", null);
        setBooleanField(term21192, term21192.getClass(), "coalescingEnabled", false);
        setBooleanField(term21192, term21192.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term21192, term21192.getClass(), "componentSerializedDataVersion", 0);
        setField(term21192, term21192.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.EventHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term21192, args);
    }

};


