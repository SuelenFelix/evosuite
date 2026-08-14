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

public class EventHandler_1_add_6424188864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21150;

    public EventHandler_1_add_6424188864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21150 = newInstance(Class.forName("core.task.handler.EventHandler$1"));
        setBooleanField(term21150, term21150.getClass(), "reflectTheme", false);
        setBooleanField(term21150, term21150.getClass(), "isAlignmentXSet", false);
        setFloatField(term21150, term21150.getClass(), "alignmentX", 0.0F);
        setBooleanField(term21150, term21150.getClass(), "isAlignmentYSet", false);
        setFloatField(term21150, term21150.getClass(), "alignmentY", 0.0F);
        setField(term21150, term21150.getClass(), "ui", null);
        setField(term21150, term21150.getClass(), "listenerList", null);
        setField(term21150, term21150.getClass(), "clientProperties", null);
        setField(term21150, term21150.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term21150, term21150.getClass(), "autoscrolls", false);
        setField(term21150, term21150.getClass(), "border", null);
        setIntField(term21150, term21150.getClass(), "flags", 0);
        setField(term21150, term21150.getClass(), "inputVerifier", null);
        setBooleanField(term21150, term21150.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term21150, term21150.getClass(), "paintingChild", null);
        setField(term21150, term21150.getClass(), "popupMenu", null);
        setField(term21150, term21150.getClass(), "revalidateRunnableScheduled", null);
        setField(term21150, term21150.getClass(), "focusInputMap", null);
        setField(term21150, term21150.getClass(), "ancestorInputMap", null);
        setField(term21150, term21150.getClass(), "windowInputMap", null);
        setField(term21150, term21150.getClass(), "actionMap", null);
        setField(term21150, term21150.getClass(), "aaHint", null);
        setField(term21150, term21150.getClass(), "lcdRenderingHint", null);
        setField(term21150, term21150.getClass(), "component", null);
        setField(term21150, term21150.getClass(), "layoutMgr", null);
        setField(term21150, term21150.getClass(), "dispatcher", null);
        setField(term21150, term21150.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term21150, term21150.getClass(), "focusCycleRoot", false);
        setBooleanField(term21150, term21150.getClass(), "focusTraversalPolicyProvider", false);
        setField(term21150, term21150.getClass(), "printingThreads", null);
        setBooleanField(term21150, term21150.getClass(), "printing", false);
        setField(term21150, term21150.getClass(), "containerListener", null);
        setIntField(term21150, term21150.getClass(), "listeningChildren", 0);
        setIntField(term21150, term21150.getClass(), "listeningBoundsChildren", 0);
        setIntField(term21150, term21150.getClass(), "descendantsCount", 0);
        setField(term21150, term21150.getClass(), "preserveBackgroundColor", null);
        setIntField(term21150, term21150.getClass(), "numOfHWComponents", 0);
        setIntField(term21150, term21150.getClass(), "numOfLWComponents", 0);
        setField(term21150, term21150.getClass(), "modalComp", null);
        setField(term21150, term21150.getClass(), "modalAppContext", null);
        setIntField(term21150, term21150.getClass(), "containerSerializedDataVersion", 0);
        setField(term21150, term21150.getClass(), "peer", null);
        setField(term21150, term21150.getClass(), "parent", null);
        setField(term21150, term21150.getClass(), "appContext", null);
        setIntField(term21150, term21150.getClass(), "x", 0);
        setIntField(term21150, term21150.getClass(), "y", 0);
        setIntField(term21150, term21150.getClass(), "width", 0);
        setIntField(term21150, term21150.getClass(), "height", 0);
        setField(term21150, term21150.getClass(), "foreground", null);
        setField(term21150, term21150.getClass(), "background", null);
        setField(term21150, term21150.getClass(), "font", null);
        setField(term21150, term21150.getClass(), "peerFont", null);
        setField(term21150, term21150.getClass(), "cursor", null);
        setField(term21150, term21150.getClass(), "locale", null);
        setField(term21150, term21150.getClass(), "graphicsConfig", null);
        setField(term21150, term21150.getClass(), "bufferStrategy", null);
        setBooleanField(term21150, term21150.getClass(), "ignoreRepaint", false);
        setBooleanField(term21150, term21150.getClass(), "visible", false);
        setBooleanField(term21150, term21150.getClass(), "enabled", false);
        setBooleanField(term21150, term21150.getClass(), "valid", false);
        setField(term21150, term21150.getClass(), "dropTarget", null);
        setField(term21150, term21150.getClass(), "popups", null);
        setField(term21150, term21150.getClass(), "name", null);
        setBooleanField(term21150, term21150.getClass(), "nameExplicitlySet", false);
        setBooleanField(term21150, term21150.getClass(), "focusable", false);
        setIntField(term21150, term21150.getClass(), "isFocusTraversableOverridden", 0);
        setField(term21150, term21150.getClass(), "focusTraversalKeys", null);
        setBooleanField(term21150, term21150.getClass(), "focusTraversalKeysEnabled", false);
        setField(term21150, term21150.getClass(), "acc", null);
        setField(term21150, term21150.getClass(), "minSize", null);
        setBooleanField(term21150, term21150.getClass(), "minSizeSet", false);
        setField(term21150, term21150.getClass(), "prefSize", null);
        setBooleanField(term21150, term21150.getClass(), "prefSizeSet", false);
        setField(term21150, term21150.getClass(), "maxSize", null);
        setBooleanField(term21150, term21150.getClass(), "maxSizeSet", false);
        setField(term21150, term21150.getClass(), "componentOrientation", null);
        setBooleanField(term21150, term21150.getClass(), "newEventsOnly", false);
        setField(term21150, term21150.getClass(), "componentListener", null);
        setField(term21150, term21150.getClass(), "focusListener", null);
        setField(term21150, term21150.getClass(), "hierarchyListener", null);
        setField(term21150, term21150.getClass(), "hierarchyBoundsListener", null);
        setField(term21150, term21150.getClass(), "keyListener", null);
        setField(term21150, term21150.getClass(), "mouseListener", null);
        setField(term21150, term21150.getClass(), "mouseMotionListener", null);
        setField(term21150, term21150.getClass(), "mouseWheelListener", null);
        setField(term21150, term21150.getClass(), "inputMethodListener", null);
        setLongField(term21150, term21150.getClass(), "eventMask", 0L);
        setField(term21150, term21150.getClass(), "changeSupport", null);
        setField(term21150, term21150.getClass(), "objectLock", null);
        setBooleanField(term21150, term21150.getClass(), "isPacked", false);
        setIntField(term21150, term21150.getClass(), "boundsOp", 0);
        setField(term21150, term21150.getClass(), "compoundShape", null);
        setField(term21150, term21150.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term21150, term21150.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term21150, term21150.getClass(), "backgroundEraseDisabled", false);
        setField(term21150, term21150.getClass(), "eventCache", null);
        setBooleanField(term21150, term21150.getClass(), "coalescingEnabled", false);
        setBooleanField(term21150, term21150.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term21150, term21150.getClass(), "componentSerializedDataVersion", 0);
        setField(term21150, term21150.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.EventHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term21150, args);
    }

};


