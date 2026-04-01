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
     Object term271889;

    public EventHandler_1_add_6424188864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271889 = newInstance(Class.forName("core.task.handler.EventHandler$1"));
        setBooleanField(term271889, term271889.getClass(), "reflectTheme", false);
        setBooleanField(term271889, term271889.getClass(), "isAlignmentXSet", false);
        setFloatField(term271889, term271889.getClass(), "alignmentX", 0.0F);
        setBooleanField(term271889, term271889.getClass(), "isAlignmentYSet", false);
        setFloatField(term271889, term271889.getClass(), "alignmentY", 0.0F);
        setField(term271889, term271889.getClass(), "ui", null);
        setField(term271889, term271889.getClass(), "listenerList", null);
        setField(term271889, term271889.getClass(), "clientProperties", null);
        setField(term271889, term271889.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term271889, term271889.getClass(), "autoscrolls", false);
        setField(term271889, term271889.getClass(), "border", null);
        setIntField(term271889, term271889.getClass(), "flags", 0);
        setField(term271889, term271889.getClass(), "inputVerifier", null);
        setBooleanField(term271889, term271889.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term271889, term271889.getClass(), "paintingChild", null);
        setField(term271889, term271889.getClass(), "popupMenu", null);
        setField(term271889, term271889.getClass(), "revalidateRunnableScheduled", null);
        setField(term271889, term271889.getClass(), "focusInputMap", null);
        setField(term271889, term271889.getClass(), "ancestorInputMap", null);
        setField(term271889, term271889.getClass(), "windowInputMap", null);
        setField(term271889, term271889.getClass(), "actionMap", null);
        setField(term271889, term271889.getClass(), "aaHint", null);
        setField(term271889, term271889.getClass(), "lcdRenderingHint", null);
        setField(term271889, term271889.getClass(), "component", null);
        setField(term271889, term271889.getClass(), "layoutMgr", null);
        setField(term271889, term271889.getClass(), "dispatcher", null);
        setField(term271889, term271889.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term271889, term271889.getClass(), "focusCycleRoot", false);
        setBooleanField(term271889, term271889.getClass(), "focusTraversalPolicyProvider", false);
        setField(term271889, term271889.getClass(), "printingThreads", null);
        setBooleanField(term271889, term271889.getClass(), "printing", false);
        setField(term271889, term271889.getClass(), "containerListener", null);
        setIntField(term271889, term271889.getClass(), "listeningChildren", 0);
        setIntField(term271889, term271889.getClass(), "listeningBoundsChildren", 0);
        setIntField(term271889, term271889.getClass(), "descendantsCount", 0);
        setField(term271889, term271889.getClass(), "preserveBackgroundColor", null);
        setIntField(term271889, term271889.getClass(), "numOfHWComponents", 0);
        setIntField(term271889, term271889.getClass(), "numOfLWComponents", 0);
        setField(term271889, term271889.getClass(), "modalComp", null);
        setField(term271889, term271889.getClass(), "modalAppContext", null);
        setIntField(term271889, term271889.getClass(), "containerSerializedDataVersion", 0);
        setField(term271889, term271889.getClass(), "peer", null);
        setField(term271889, term271889.getClass(), "parent", null);
        setField(term271889, term271889.getClass(), "appContext", null);
        setIntField(term271889, term271889.getClass(), "x", 0);
        setIntField(term271889, term271889.getClass(), "y", 0);
        setIntField(term271889, term271889.getClass(), "width", 0);
        setIntField(term271889, term271889.getClass(), "height", 0);
        setField(term271889, term271889.getClass(), "foreground", null);
        setField(term271889, term271889.getClass(), "background", null);
        setField(term271889, term271889.getClass(), "font", null);
        setField(term271889, term271889.getClass(), "peerFont", null);
        setField(term271889, term271889.getClass(), "cursor", null);
        setField(term271889, term271889.getClass(), "locale", null);
        setField(term271889, term271889.getClass(), "graphicsConfig", null);
        setField(term271889, term271889.getClass(), "bufferStrategy", null);
        setBooleanField(term271889, term271889.getClass(), "ignoreRepaint", false);
        setBooleanField(term271889, term271889.getClass(), "visible", false);
        setBooleanField(term271889, term271889.getClass(), "enabled", false);
        setBooleanField(term271889, term271889.getClass(), "valid", false);
        setField(term271889, term271889.getClass(), "dropTarget", null);
        setField(term271889, term271889.getClass(), "popups", null);
        setField(term271889, term271889.getClass(), "name", null);
        setBooleanField(term271889, term271889.getClass(), "nameExplicitlySet", false);
        setBooleanField(term271889, term271889.getClass(), "focusable", false);
        setIntField(term271889, term271889.getClass(), "isFocusTraversableOverridden", 0);
        setField(term271889, term271889.getClass(), "focusTraversalKeys", null);
        setBooleanField(term271889, term271889.getClass(), "focusTraversalKeysEnabled", false);
        setField(term271889, term271889.getClass(), "acc", null);
        setField(term271889, term271889.getClass(), "minSize", null);
        setBooleanField(term271889, term271889.getClass(), "minSizeSet", false);
        setField(term271889, term271889.getClass(), "prefSize", null);
        setBooleanField(term271889, term271889.getClass(), "prefSizeSet", false);
        setField(term271889, term271889.getClass(), "maxSize", null);
        setBooleanField(term271889, term271889.getClass(), "maxSizeSet", false);
        setField(term271889, term271889.getClass(), "componentOrientation", null);
        setBooleanField(term271889, term271889.getClass(), "newEventsOnly", false);
        setField(term271889, term271889.getClass(), "componentListener", null);
        setField(term271889, term271889.getClass(), "focusListener", null);
        setField(term271889, term271889.getClass(), "hierarchyListener", null);
        setField(term271889, term271889.getClass(), "hierarchyBoundsListener", null);
        setField(term271889, term271889.getClass(), "keyListener", null);
        setField(term271889, term271889.getClass(), "mouseListener", null);
        setField(term271889, term271889.getClass(), "mouseMotionListener", null);
        setField(term271889, term271889.getClass(), "mouseWheelListener", null);
        setField(term271889, term271889.getClass(), "inputMethodListener", null);
        setLongField(term271889, term271889.getClass(), "eventMask", 0L);
        setField(term271889, term271889.getClass(), "changeSupport", null);
        setField(term271889, term271889.getClass(), "objectLock", null);
        setBooleanField(term271889, term271889.getClass(), "isPacked", false);
        setIntField(term271889, term271889.getClass(), "boundsOp", 0);
        setField(term271889, term271889.getClass(), "compoundShape", null);
        setField(term271889, term271889.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term271889, term271889.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term271889, term271889.getClass(), "backgroundEraseDisabled", false);
        setField(term271889, term271889.getClass(), "eventCache", null);
        setBooleanField(term271889, term271889.getClass(), "coalescingEnabled", false);
        setBooleanField(term271889, term271889.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term271889, term271889.getClass(), "componentSerializedDataVersion", 0);
        setField(term271889, term271889.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.EventHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term271889, args);
    }

};


