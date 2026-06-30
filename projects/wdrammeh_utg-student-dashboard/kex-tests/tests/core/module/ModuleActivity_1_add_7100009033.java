package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ModuleActivity_1_add_7100009033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66384;

    public ModuleActivity_1_add_7100009033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66384 = newInstance(Class.forName("core.module.ModuleActivity$1"));
        setField(term66384, term66384.getClass(), "this$0", null);
        setBooleanField(term66384, term66384.getClass(), "reflectTheme", false);
        setBooleanField(term66384, term66384.getClass(), "isAlignmentXSet", false);
        setFloatField(term66384, term66384.getClass(), "alignmentX", 0.0F);
        setBooleanField(term66384, term66384.getClass(), "isAlignmentYSet", false);
        setFloatField(term66384, term66384.getClass(), "alignmentY", 0.0F);
        setField(term66384, term66384.getClass(), "ui", null);
        setField(term66384, term66384.getClass(), "listenerList", null);
        setField(term66384, term66384.getClass(), "clientProperties", null);
        setField(term66384, term66384.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term66384, term66384.getClass(), "autoscrolls", false);
        setField(term66384, term66384.getClass(), "border", null);
        setIntField(term66384, term66384.getClass(), "flags", 0);
        setField(term66384, term66384.getClass(), "inputVerifier", null);
        setBooleanField(term66384, term66384.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term66384, term66384.getClass(), "paintingChild", null);
        setField(term66384, term66384.getClass(), "popupMenu", null);
        setField(term66384, term66384.getClass(), "revalidateRunnableScheduled", null);
        setField(term66384, term66384.getClass(), "focusInputMap", null);
        setField(term66384, term66384.getClass(), "ancestorInputMap", null);
        setField(term66384, term66384.getClass(), "windowInputMap", null);
        setField(term66384, term66384.getClass(), "actionMap", null);
        setField(term66384, term66384.getClass(), "aaHint", null);
        setField(term66384, term66384.getClass(), "lcdRenderingHint", null);
        setField(term66384, term66384.getClass(), "component", null);
        setField(term66384, term66384.getClass(), "layoutMgr", null);
        setField(term66384, term66384.getClass(), "dispatcher", null);
        setField(term66384, term66384.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term66384, term66384.getClass(), "focusCycleRoot", false);
        setBooleanField(term66384, term66384.getClass(), "focusTraversalPolicyProvider", false);
        setField(term66384, term66384.getClass(), "printingThreads", null);
        setBooleanField(term66384, term66384.getClass(), "printing", false);
        setField(term66384, term66384.getClass(), "containerListener", null);
        setIntField(term66384, term66384.getClass(), "listeningChildren", 0);
        setIntField(term66384, term66384.getClass(), "listeningBoundsChildren", 0);
        setIntField(term66384, term66384.getClass(), "descendantsCount", 0);
        setField(term66384, term66384.getClass(), "preserveBackgroundColor", null);
        setIntField(term66384, term66384.getClass(), "numOfHWComponents", 0);
        setIntField(term66384, term66384.getClass(), "numOfLWComponents", 0);
        setField(term66384, term66384.getClass(), "modalComp", null);
        setField(term66384, term66384.getClass(), "modalAppContext", null);
        setIntField(term66384, term66384.getClass(), "containerSerializedDataVersion", 0);
        setField(term66384, term66384.getClass(), "peer", null);
        setField(term66384, term66384.getClass(), "parent", null);
        setField(term66384, term66384.getClass(), "appContext", null);
        setIntField(term66384, term66384.getClass(), "x", 0);
        setIntField(term66384, term66384.getClass(), "y", 0);
        setIntField(term66384, term66384.getClass(), "width", 0);
        setIntField(term66384, term66384.getClass(), "height", 0);
        setField(term66384, term66384.getClass(), "foreground", null);
        setField(term66384, term66384.getClass(), "background", null);
        setField(term66384, term66384.getClass(), "font", null);
        setField(term66384, term66384.getClass(), "peerFont", null);
        setField(term66384, term66384.getClass(), "cursor", null);
        setField(term66384, term66384.getClass(), "locale", null);
        setField(term66384, term66384.getClass(), "graphicsConfig", null);
        setField(term66384, term66384.getClass(), "bufferStrategy", null);
        setBooleanField(term66384, term66384.getClass(), "ignoreRepaint", false);
        setBooleanField(term66384, term66384.getClass(), "visible", false);
        setBooleanField(term66384, term66384.getClass(), "enabled", false);
        setBooleanField(term66384, term66384.getClass(), "valid", false);
        setField(term66384, term66384.getClass(), "dropTarget", null);
        setField(term66384, term66384.getClass(), "popups", null);
        setField(term66384, term66384.getClass(), "name", null);
        setBooleanField(term66384, term66384.getClass(), "nameExplicitlySet", false);
        setBooleanField(term66384, term66384.getClass(), "focusable", false);
        setIntField(term66384, term66384.getClass(), "isFocusTraversableOverridden", 0);
        setField(term66384, term66384.getClass(), "focusTraversalKeys", null);
        setBooleanField(term66384, term66384.getClass(), "focusTraversalKeysEnabled", false);
        setField(term66384, term66384.getClass(), "acc", null);
        setField(term66384, term66384.getClass(), "minSize", null);
        setBooleanField(term66384, term66384.getClass(), "minSizeSet", false);
        setField(term66384, term66384.getClass(), "prefSize", null);
        setBooleanField(term66384, term66384.getClass(), "prefSizeSet", false);
        setField(term66384, term66384.getClass(), "maxSize", null);
        setBooleanField(term66384, term66384.getClass(), "maxSizeSet", false);
        setField(term66384, term66384.getClass(), "componentOrientation", null);
        setBooleanField(term66384, term66384.getClass(), "newEventsOnly", false);
        setField(term66384, term66384.getClass(), "componentListener", null);
        setField(term66384, term66384.getClass(), "focusListener", null);
        setField(term66384, term66384.getClass(), "hierarchyListener", null);
        setField(term66384, term66384.getClass(), "hierarchyBoundsListener", null);
        setField(term66384, term66384.getClass(), "keyListener", null);
        setField(term66384, term66384.getClass(), "mouseListener", null);
        setField(term66384, term66384.getClass(), "mouseMotionListener", null);
        setField(term66384, term66384.getClass(), "mouseWheelListener", null);
        setField(term66384, term66384.getClass(), "inputMethodListener", null);
        setLongField(term66384, term66384.getClass(), "eventMask", 0L);
        setField(term66384, term66384.getClass(), "changeSupport", null);
        setField(term66384, term66384.getClass(), "objectLock", null);
        setBooleanField(term66384, term66384.getClass(), "isPacked", false);
        setIntField(term66384, term66384.getClass(), "boundsOp", 0);
        setField(term66384, term66384.getClass(), "compoundShape", null);
        setField(term66384, term66384.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term66384, term66384.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term66384, term66384.getClass(), "backgroundEraseDisabled", false);
        setField(term66384, term66384.getClass(), "eventCache", null);
        setBooleanField(term66384, term66384.getClass(), "coalescingEnabled", false);
        setBooleanField(term66384, term66384.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term66384, term66384.getClass(), "componentSerializedDataVersion", 0);
        setField(term66384, term66384.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleActivity$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term66384, args);
    }

};


