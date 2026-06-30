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
     Object term21158;

    public EventHandler_1_add_6424188864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21158 = newInstance(Class.forName("core.task.handler.EventHandler$1"));
        setBooleanField(term21158, term21158.getClass(), "reflectTheme", false);
        setBooleanField(term21158, term21158.getClass(), "isAlignmentXSet", false);
        setFloatField(term21158, term21158.getClass(), "alignmentX", 0.0F);
        setBooleanField(term21158, term21158.getClass(), "isAlignmentYSet", false);
        setFloatField(term21158, term21158.getClass(), "alignmentY", 0.0F);
        setField(term21158, term21158.getClass(), "ui", null);
        setField(term21158, term21158.getClass(), "listenerList", null);
        setField(term21158, term21158.getClass(), "clientProperties", null);
        setField(term21158, term21158.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term21158, term21158.getClass(), "autoscrolls", false);
        setField(term21158, term21158.getClass(), "border", null);
        setIntField(term21158, term21158.getClass(), "flags", 0);
        setField(term21158, term21158.getClass(), "inputVerifier", null);
        setBooleanField(term21158, term21158.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term21158, term21158.getClass(), "paintingChild", null);
        setField(term21158, term21158.getClass(), "popupMenu", null);
        setField(term21158, term21158.getClass(), "revalidateRunnableScheduled", null);
        setField(term21158, term21158.getClass(), "focusInputMap", null);
        setField(term21158, term21158.getClass(), "ancestorInputMap", null);
        setField(term21158, term21158.getClass(), "windowInputMap", null);
        setField(term21158, term21158.getClass(), "actionMap", null);
        setField(term21158, term21158.getClass(), "aaHint", null);
        setField(term21158, term21158.getClass(), "lcdRenderingHint", null);
        setField(term21158, term21158.getClass(), "component", null);
        setField(term21158, term21158.getClass(), "layoutMgr", null);
        setField(term21158, term21158.getClass(), "dispatcher", null);
        setField(term21158, term21158.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term21158, term21158.getClass(), "focusCycleRoot", false);
        setBooleanField(term21158, term21158.getClass(), "focusTraversalPolicyProvider", false);
        setField(term21158, term21158.getClass(), "printingThreads", null);
        setBooleanField(term21158, term21158.getClass(), "printing", false);
        setField(term21158, term21158.getClass(), "containerListener", null);
        setIntField(term21158, term21158.getClass(), "listeningChildren", 0);
        setIntField(term21158, term21158.getClass(), "listeningBoundsChildren", 0);
        setIntField(term21158, term21158.getClass(), "descendantsCount", 0);
        setField(term21158, term21158.getClass(), "preserveBackgroundColor", null);
        setIntField(term21158, term21158.getClass(), "numOfHWComponents", 0);
        setIntField(term21158, term21158.getClass(), "numOfLWComponents", 0);
        setField(term21158, term21158.getClass(), "modalComp", null);
        setField(term21158, term21158.getClass(), "modalAppContext", null);
        setIntField(term21158, term21158.getClass(), "containerSerializedDataVersion", 0);
        setField(term21158, term21158.getClass(), "peer", null);
        setField(term21158, term21158.getClass(), "parent", null);
        setField(term21158, term21158.getClass(), "appContext", null);
        setIntField(term21158, term21158.getClass(), "x", 0);
        setIntField(term21158, term21158.getClass(), "y", 0);
        setIntField(term21158, term21158.getClass(), "width", 0);
        setIntField(term21158, term21158.getClass(), "height", 0);
        setField(term21158, term21158.getClass(), "foreground", null);
        setField(term21158, term21158.getClass(), "background", null);
        setField(term21158, term21158.getClass(), "font", null);
        setField(term21158, term21158.getClass(), "peerFont", null);
        setField(term21158, term21158.getClass(), "cursor", null);
        setField(term21158, term21158.getClass(), "locale", null);
        setField(term21158, term21158.getClass(), "graphicsConfig", null);
        setField(term21158, term21158.getClass(), "bufferStrategy", null);
        setBooleanField(term21158, term21158.getClass(), "ignoreRepaint", false);
        setBooleanField(term21158, term21158.getClass(), "visible", false);
        setBooleanField(term21158, term21158.getClass(), "enabled", false);
        setBooleanField(term21158, term21158.getClass(), "valid", false);
        setField(term21158, term21158.getClass(), "dropTarget", null);
        setField(term21158, term21158.getClass(), "popups", null);
        setField(term21158, term21158.getClass(), "name", null);
        setBooleanField(term21158, term21158.getClass(), "nameExplicitlySet", false);
        setBooleanField(term21158, term21158.getClass(), "focusable", false);
        setIntField(term21158, term21158.getClass(), "isFocusTraversableOverridden", 0);
        setField(term21158, term21158.getClass(), "focusTraversalKeys", null);
        setBooleanField(term21158, term21158.getClass(), "focusTraversalKeysEnabled", false);
        setField(term21158, term21158.getClass(), "acc", null);
        setField(term21158, term21158.getClass(), "minSize", null);
        setBooleanField(term21158, term21158.getClass(), "minSizeSet", false);
        setField(term21158, term21158.getClass(), "prefSize", null);
        setBooleanField(term21158, term21158.getClass(), "prefSizeSet", false);
        setField(term21158, term21158.getClass(), "maxSize", null);
        setBooleanField(term21158, term21158.getClass(), "maxSizeSet", false);
        setField(term21158, term21158.getClass(), "componentOrientation", null);
        setBooleanField(term21158, term21158.getClass(), "newEventsOnly", false);
        setField(term21158, term21158.getClass(), "componentListener", null);
        setField(term21158, term21158.getClass(), "focusListener", null);
        setField(term21158, term21158.getClass(), "hierarchyListener", null);
        setField(term21158, term21158.getClass(), "hierarchyBoundsListener", null);
        setField(term21158, term21158.getClass(), "keyListener", null);
        setField(term21158, term21158.getClass(), "mouseListener", null);
        setField(term21158, term21158.getClass(), "mouseMotionListener", null);
        setField(term21158, term21158.getClass(), "mouseWheelListener", null);
        setField(term21158, term21158.getClass(), "inputMethodListener", null);
        setLongField(term21158, term21158.getClass(), "eventMask", 0L);
        setField(term21158, term21158.getClass(), "changeSupport", null);
        setField(term21158, term21158.getClass(), "objectLock", null);
        setBooleanField(term21158, term21158.getClass(), "isPacked", false);
        setIntField(term21158, term21158.getClass(), "boundsOp", 0);
        setField(term21158, term21158.getClass(), "compoundShape", null);
        setField(term21158, term21158.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term21158, term21158.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term21158, term21158.getClass(), "backgroundEraseDisabled", false);
        setField(term21158, term21158.getClass(), "eventCache", null);
        setBooleanField(term21158, term21158.getClass(), "coalescingEnabled", false);
        setBooleanField(term21158, term21158.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term21158, term21158.getClass(), "componentSerializedDataVersion", 0);
        setField(term21158, term21158.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.EventHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term21158, args);
    }

};


