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
     Object term241096;

    public ModuleActivity_1_add_7100009033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241096 = newInstance(Class.forName("core.module.ModuleActivity$1"));
        setField(term241096, term241096.getClass(), "this$0", null);
        setBooleanField(term241096, term241096.getClass(), "reflectTheme", false);
        setBooleanField(term241096, term241096.getClass(), "isAlignmentXSet", false);
        setFloatField(term241096, term241096.getClass(), "alignmentX", 0.0F);
        setBooleanField(term241096, term241096.getClass(), "isAlignmentYSet", false);
        setFloatField(term241096, term241096.getClass(), "alignmentY", 0.0F);
        setField(term241096, term241096.getClass(), "ui", null);
        setField(term241096, term241096.getClass(), "listenerList", null);
        setField(term241096, term241096.getClass(), "clientProperties", null);
        setField(term241096, term241096.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term241096, term241096.getClass(), "autoscrolls", false);
        setField(term241096, term241096.getClass(), "border", null);
        setIntField(term241096, term241096.getClass(), "flags", 0);
        setField(term241096, term241096.getClass(), "inputVerifier", null);
        setBooleanField(term241096, term241096.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term241096, term241096.getClass(), "paintingChild", null);
        setField(term241096, term241096.getClass(), "popupMenu", null);
        setField(term241096, term241096.getClass(), "revalidateRunnableScheduled", null);
        setField(term241096, term241096.getClass(), "focusInputMap", null);
        setField(term241096, term241096.getClass(), "ancestorInputMap", null);
        setField(term241096, term241096.getClass(), "windowInputMap", null);
        setField(term241096, term241096.getClass(), "actionMap", null);
        setField(term241096, term241096.getClass(), "aaHint", null);
        setField(term241096, term241096.getClass(), "lcdRenderingHint", null);
        setField(term241096, term241096.getClass(), "component", null);
        setField(term241096, term241096.getClass(), "layoutMgr", null);
        setField(term241096, term241096.getClass(), "dispatcher", null);
        setField(term241096, term241096.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term241096, term241096.getClass(), "focusCycleRoot", false);
        setBooleanField(term241096, term241096.getClass(), "focusTraversalPolicyProvider", false);
        setField(term241096, term241096.getClass(), "printingThreads", null);
        setBooleanField(term241096, term241096.getClass(), "printing", false);
        setField(term241096, term241096.getClass(), "containerListener", null);
        setIntField(term241096, term241096.getClass(), "listeningChildren", 0);
        setIntField(term241096, term241096.getClass(), "listeningBoundsChildren", 0);
        setIntField(term241096, term241096.getClass(), "descendantsCount", 0);
        setField(term241096, term241096.getClass(), "preserveBackgroundColor", null);
        setIntField(term241096, term241096.getClass(), "numOfHWComponents", 0);
        setIntField(term241096, term241096.getClass(), "numOfLWComponents", 0);
        setField(term241096, term241096.getClass(), "modalComp", null);
        setField(term241096, term241096.getClass(), "modalAppContext", null);
        setIntField(term241096, term241096.getClass(), "containerSerializedDataVersion", 0);
        setField(term241096, term241096.getClass(), "peer", null);
        setField(term241096, term241096.getClass(), "parent", null);
        setField(term241096, term241096.getClass(), "appContext", null);
        setIntField(term241096, term241096.getClass(), "x", 0);
        setIntField(term241096, term241096.getClass(), "y", 0);
        setIntField(term241096, term241096.getClass(), "width", 0);
        setIntField(term241096, term241096.getClass(), "height", 0);
        setField(term241096, term241096.getClass(), "foreground", null);
        setField(term241096, term241096.getClass(), "background", null);
        setField(term241096, term241096.getClass(), "font", null);
        setField(term241096, term241096.getClass(), "peerFont", null);
        setField(term241096, term241096.getClass(), "cursor", null);
        setField(term241096, term241096.getClass(), "locale", null);
        setField(term241096, term241096.getClass(), "graphicsConfig", null);
        setField(term241096, term241096.getClass(), "bufferStrategy", null);
        setBooleanField(term241096, term241096.getClass(), "ignoreRepaint", false);
        setBooleanField(term241096, term241096.getClass(), "visible", false);
        setBooleanField(term241096, term241096.getClass(), "enabled", false);
        setBooleanField(term241096, term241096.getClass(), "valid", false);
        setField(term241096, term241096.getClass(), "dropTarget", null);
        setField(term241096, term241096.getClass(), "popups", null);
        setField(term241096, term241096.getClass(), "name", null);
        setBooleanField(term241096, term241096.getClass(), "nameExplicitlySet", false);
        setBooleanField(term241096, term241096.getClass(), "focusable", false);
        setIntField(term241096, term241096.getClass(), "isFocusTraversableOverridden", 0);
        setField(term241096, term241096.getClass(), "focusTraversalKeys", null);
        setBooleanField(term241096, term241096.getClass(), "focusTraversalKeysEnabled", false);
        setField(term241096, term241096.getClass(), "acc", null);
        setField(term241096, term241096.getClass(), "minSize", null);
        setBooleanField(term241096, term241096.getClass(), "minSizeSet", false);
        setField(term241096, term241096.getClass(), "prefSize", null);
        setBooleanField(term241096, term241096.getClass(), "prefSizeSet", false);
        setField(term241096, term241096.getClass(), "maxSize", null);
        setBooleanField(term241096, term241096.getClass(), "maxSizeSet", false);
        setField(term241096, term241096.getClass(), "componentOrientation", null);
        setBooleanField(term241096, term241096.getClass(), "newEventsOnly", false);
        setField(term241096, term241096.getClass(), "componentListener", null);
        setField(term241096, term241096.getClass(), "focusListener", null);
        setField(term241096, term241096.getClass(), "hierarchyListener", null);
        setField(term241096, term241096.getClass(), "hierarchyBoundsListener", null);
        setField(term241096, term241096.getClass(), "keyListener", null);
        setField(term241096, term241096.getClass(), "mouseListener", null);
        setField(term241096, term241096.getClass(), "mouseMotionListener", null);
        setField(term241096, term241096.getClass(), "mouseWheelListener", null);
        setField(term241096, term241096.getClass(), "inputMethodListener", null);
        setLongField(term241096, term241096.getClass(), "eventMask", 0L);
        setField(term241096, term241096.getClass(), "changeSupport", null);
        setField(term241096, term241096.getClass(), "objectLock", null);
        setBooleanField(term241096, term241096.getClass(), "isPacked", false);
        setIntField(term241096, term241096.getClass(), "boundsOp", 0);
        setField(term241096, term241096.getClass(), "compoundShape", null);
        setField(term241096, term241096.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term241096, term241096.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term241096, term241096.getClass(), "backgroundEraseDisabled", false);
        setField(term241096, term241096.getClass(), "eventCache", null);
        setBooleanField(term241096, term241096.getClass(), "coalescingEnabled", false);
        setBooleanField(term241096, term241096.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term241096, term241096.getClass(), "componentSerializedDataVersion", 0);
        setField(term241096, term241096.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleActivity$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term241096, args);
    }

};


