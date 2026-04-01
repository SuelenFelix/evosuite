package core.task.self;

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
import static core.task.self.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ProjectSelf_1_setValue_2205852853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200582;
     Object term200627;

    public ProjectSelf_1_setValue_2205852853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200582 = newInstance(Class.forName("core.task.self.ProjectSelf$1"));
        setField(term200582, term200582.getClass(), "this$0", null);
        setIntField(term200582, term200582.getClass(), "orientation", 0);
        setBooleanField(term200582, term200582.getClass(), "paintBorder", false);
        setField(term200582, term200582.getClass(), "model", null);
        setField(term200582, term200582.getClass(), "progressString", null);
        setBooleanField(term200582, term200582.getClass(), "paintString", false);
        setField(term200582, term200582.getClass(), "changeEvent", null);
        setField(term200582, term200582.getClass(), "changeListener", null);
        setField(term200582, term200582.getClass(), "format", null);
        setBooleanField(term200582, term200582.getClass(), "indeterminate", false);
        setBooleanField(term200582, term200582.getClass(), "isAlignmentXSet", false);
        setFloatField(term200582, term200582.getClass(), "alignmentX", 0.0F);
        setBooleanField(term200582, term200582.getClass(), "isAlignmentYSet", false);
        setFloatField(term200582, term200582.getClass(), "alignmentY", 0.0F);
        setField(term200582, term200582.getClass(), "ui", null);
        setField(term200582, term200582.getClass(), "listenerList", null);
        setField(term200582, term200582.getClass(), "clientProperties", null);
        setField(term200582, term200582.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term200582, term200582.getClass(), "autoscrolls", false);
        setField(term200582, term200582.getClass(), "border", null);
        setIntField(term200582, term200582.getClass(), "flags", 0);
        setField(term200582, term200582.getClass(), "inputVerifier", null);
        setBooleanField(term200582, term200582.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term200582, term200582.getClass(), "paintingChild", null);
        setField(term200582, term200582.getClass(), "popupMenu", null);
        setField(term200582, term200582.getClass(), "revalidateRunnableScheduled", null);
        setField(term200582, term200582.getClass(), "focusInputMap", null);
        setField(term200582, term200582.getClass(), "ancestorInputMap", null);
        setField(term200582, term200582.getClass(), "windowInputMap", null);
        setField(term200582, term200582.getClass(), "actionMap", null);
        setField(term200582, term200582.getClass(), "aaHint", null);
        setField(term200582, term200582.getClass(), "lcdRenderingHint", null);
        setField(term200582, term200582.getClass(), "component", null);
        setField(term200582, term200582.getClass(), "layoutMgr", null);
        setField(term200582, term200582.getClass(), "dispatcher", null);
        setField(term200582, term200582.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term200582, term200582.getClass(), "focusCycleRoot", false);
        setBooleanField(term200582, term200582.getClass(), "focusTraversalPolicyProvider", false);
        setField(term200582, term200582.getClass(), "printingThreads", null);
        setBooleanField(term200582, term200582.getClass(), "printing", false);
        setField(term200582, term200582.getClass(), "containerListener", null);
        setIntField(term200582, term200582.getClass(), "listeningChildren", 0);
        setIntField(term200582, term200582.getClass(), "listeningBoundsChildren", 0);
        setIntField(term200582, term200582.getClass(), "descendantsCount", 0);
        setField(term200582, term200582.getClass(), "preserveBackgroundColor", null);
        setIntField(term200582, term200582.getClass(), "numOfHWComponents", 0);
        setIntField(term200582, term200582.getClass(), "numOfLWComponents", 0);
        setField(term200582, term200582.getClass(), "modalComp", null);
        setField(term200582, term200582.getClass(), "modalAppContext", null);
        setIntField(term200582, term200582.getClass(), "containerSerializedDataVersion", 0);
        setField(term200582, term200582.getClass(), "peer", null);
        setField(term200582, term200582.getClass(), "parent", null);
        setField(term200582, term200582.getClass(), "appContext", null);
        setIntField(term200582, term200582.getClass(), "x", 0);
        setIntField(term200582, term200582.getClass(), "y", 0);
        setIntField(term200582, term200582.getClass(), "width", 0);
        setIntField(term200582, term200582.getClass(), "height", 0);
        setField(term200582, term200582.getClass(), "foreground", null);
        setField(term200582, term200582.getClass(), "background", null);
        setField(term200582, term200582.getClass(), "font", null);
        setField(term200582, term200582.getClass(), "peerFont", null);
        setField(term200582, term200582.getClass(), "cursor", null);
        setField(term200582, term200582.getClass(), "locale", null);
        setField(term200582, term200582.getClass(), "graphicsConfig", null);
        setField(term200582, term200582.getClass(), "bufferStrategy", null);
        setBooleanField(term200582, term200582.getClass(), "ignoreRepaint", false);
        setBooleanField(term200582, term200582.getClass(), "visible", false);
        setBooleanField(term200582, term200582.getClass(), "enabled", false);
        setBooleanField(term200582, term200582.getClass(), "valid", false);
        setField(term200582, term200582.getClass(), "dropTarget", null);
        setField(term200582, term200582.getClass(), "popups", null);
        setField(term200582, term200582.getClass(), "name", null);
        setBooleanField(term200582, term200582.getClass(), "nameExplicitlySet", false);
        setBooleanField(term200582, term200582.getClass(), "focusable", false);
        setIntField(term200582, term200582.getClass(), "isFocusTraversableOverridden", 0);
        setField(term200582, term200582.getClass(), "focusTraversalKeys", null);
        setBooleanField(term200582, term200582.getClass(), "focusTraversalKeysEnabled", false);
        setField(term200582, term200582.getClass(), "acc", null);
        setField(term200582, term200582.getClass(), "minSize", null);
        setBooleanField(term200582, term200582.getClass(), "minSizeSet", false);
        setField(term200582, term200582.getClass(), "prefSize", null);
        setBooleanField(term200582, term200582.getClass(), "prefSizeSet", false);
        setField(term200582, term200582.getClass(), "maxSize", null);
        setBooleanField(term200582, term200582.getClass(), "maxSizeSet", false);
        setField(term200582, term200582.getClass(), "componentOrientation", null);
        setBooleanField(term200582, term200582.getClass(), "newEventsOnly", false);
        setField(term200582, term200582.getClass(), "componentListener", null);
        setField(term200582, term200582.getClass(), "focusListener", null);
        setField(term200582, term200582.getClass(), "hierarchyListener", null);
        setField(term200582, term200582.getClass(), "hierarchyBoundsListener", null);
        setField(term200582, term200582.getClass(), "keyListener", null);
        setField(term200582, term200582.getClass(), "mouseListener", null);
        setField(term200582, term200582.getClass(), "mouseMotionListener", null);
        setField(term200582, term200582.getClass(), "mouseWheelListener", null);
        setField(term200582, term200582.getClass(), "inputMethodListener", null);
        setLongField(term200582, term200582.getClass(), "eventMask", 0L);
        setField(term200582, term200582.getClass(), "changeSupport", null);
        setField(term200582, term200582.getClass(), "objectLock", null);
        setBooleanField(term200582, term200582.getClass(), "isPacked", false);
        setIntField(term200582, term200582.getClass(), "boundsOp", 0);
        setField(term200582, term200582.getClass(), "compoundShape", null);
        setField(term200582, term200582.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term200582, term200582.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term200582, term200582.getClass(), "backgroundEraseDisabled", false);
        setField(term200582, term200582.getClass(), "eventCache", null);
        setBooleanField(term200582, term200582.getClass(), "coalescingEnabled", false);
        setBooleanField(term200582, term200582.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term200582, term200582.getClass(), "componentSerializedDataVersion", 0);
        setField(term200582, term200582.getClass(), "accessibleContext", null);
        term200627 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term200627;
        callMethod(klass, "setValue", argTypes, term200582, args);
    }

};


