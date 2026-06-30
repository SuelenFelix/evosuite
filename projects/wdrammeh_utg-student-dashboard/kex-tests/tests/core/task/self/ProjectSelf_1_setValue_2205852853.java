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
     Object term28275;
     Object term28320;

    public ProjectSelf_1_setValue_2205852853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28275 = newInstance(Class.forName("core.task.self.ProjectSelf$1"));
        setField(term28275, term28275.getClass(), "this$0", null);
        setIntField(term28275, term28275.getClass(), "orientation", 0);
        setBooleanField(term28275, term28275.getClass(), "paintBorder", false);
        setField(term28275, term28275.getClass(), "model", null);
        setField(term28275, term28275.getClass(), "progressString", null);
        setBooleanField(term28275, term28275.getClass(), "paintString", false);
        setField(term28275, term28275.getClass(), "changeEvent", null);
        setField(term28275, term28275.getClass(), "changeListener", null);
        setField(term28275, term28275.getClass(), "format", null);
        setBooleanField(term28275, term28275.getClass(), "indeterminate", false);
        setBooleanField(term28275, term28275.getClass(), "isAlignmentXSet", false);
        setFloatField(term28275, term28275.getClass(), "alignmentX", 0.0F);
        setBooleanField(term28275, term28275.getClass(), "isAlignmentYSet", false);
        setFloatField(term28275, term28275.getClass(), "alignmentY", 0.0F);
        setField(term28275, term28275.getClass(), "ui", null);
        setField(term28275, term28275.getClass(), "listenerList", null);
        setField(term28275, term28275.getClass(), "clientProperties", null);
        setField(term28275, term28275.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term28275, term28275.getClass(), "autoscrolls", false);
        setField(term28275, term28275.getClass(), "border", null);
        setIntField(term28275, term28275.getClass(), "flags", 0);
        setField(term28275, term28275.getClass(), "inputVerifier", null);
        setBooleanField(term28275, term28275.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term28275, term28275.getClass(), "paintingChild", null);
        setField(term28275, term28275.getClass(), "popupMenu", null);
        setField(term28275, term28275.getClass(), "revalidateRunnableScheduled", null);
        setField(term28275, term28275.getClass(), "focusInputMap", null);
        setField(term28275, term28275.getClass(), "ancestorInputMap", null);
        setField(term28275, term28275.getClass(), "windowInputMap", null);
        setField(term28275, term28275.getClass(), "actionMap", null);
        setField(term28275, term28275.getClass(), "aaHint", null);
        setField(term28275, term28275.getClass(), "lcdRenderingHint", null);
        setField(term28275, term28275.getClass(), "component", null);
        setField(term28275, term28275.getClass(), "layoutMgr", null);
        setField(term28275, term28275.getClass(), "dispatcher", null);
        setField(term28275, term28275.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term28275, term28275.getClass(), "focusCycleRoot", false);
        setBooleanField(term28275, term28275.getClass(), "focusTraversalPolicyProvider", false);
        setField(term28275, term28275.getClass(), "printingThreads", null);
        setBooleanField(term28275, term28275.getClass(), "printing", false);
        setField(term28275, term28275.getClass(), "containerListener", null);
        setIntField(term28275, term28275.getClass(), "listeningChildren", 0);
        setIntField(term28275, term28275.getClass(), "listeningBoundsChildren", 0);
        setIntField(term28275, term28275.getClass(), "descendantsCount", 0);
        setField(term28275, term28275.getClass(), "preserveBackgroundColor", null);
        setIntField(term28275, term28275.getClass(), "numOfHWComponents", 0);
        setIntField(term28275, term28275.getClass(), "numOfLWComponents", 0);
        setField(term28275, term28275.getClass(), "modalComp", null);
        setField(term28275, term28275.getClass(), "modalAppContext", null);
        setIntField(term28275, term28275.getClass(), "containerSerializedDataVersion", 0);
        setField(term28275, term28275.getClass(), "peer", null);
        setField(term28275, term28275.getClass(), "parent", null);
        setField(term28275, term28275.getClass(), "appContext", null);
        setIntField(term28275, term28275.getClass(), "x", 0);
        setIntField(term28275, term28275.getClass(), "y", 0);
        setIntField(term28275, term28275.getClass(), "width", 0);
        setIntField(term28275, term28275.getClass(), "height", 0);
        setField(term28275, term28275.getClass(), "foreground", null);
        setField(term28275, term28275.getClass(), "background", null);
        setField(term28275, term28275.getClass(), "font", null);
        setField(term28275, term28275.getClass(), "peerFont", null);
        setField(term28275, term28275.getClass(), "cursor", null);
        setField(term28275, term28275.getClass(), "locale", null);
        setField(term28275, term28275.getClass(), "graphicsConfig", null);
        setField(term28275, term28275.getClass(), "bufferStrategy", null);
        setBooleanField(term28275, term28275.getClass(), "ignoreRepaint", false);
        setBooleanField(term28275, term28275.getClass(), "visible", false);
        setBooleanField(term28275, term28275.getClass(), "enabled", false);
        setBooleanField(term28275, term28275.getClass(), "valid", false);
        setField(term28275, term28275.getClass(), "dropTarget", null);
        setField(term28275, term28275.getClass(), "popups", null);
        setField(term28275, term28275.getClass(), "name", null);
        setBooleanField(term28275, term28275.getClass(), "nameExplicitlySet", false);
        setBooleanField(term28275, term28275.getClass(), "focusable", false);
        setIntField(term28275, term28275.getClass(), "isFocusTraversableOverridden", 0);
        setField(term28275, term28275.getClass(), "focusTraversalKeys", null);
        setBooleanField(term28275, term28275.getClass(), "focusTraversalKeysEnabled", false);
        setField(term28275, term28275.getClass(), "acc", null);
        setField(term28275, term28275.getClass(), "minSize", null);
        setBooleanField(term28275, term28275.getClass(), "minSizeSet", false);
        setField(term28275, term28275.getClass(), "prefSize", null);
        setBooleanField(term28275, term28275.getClass(), "prefSizeSet", false);
        setField(term28275, term28275.getClass(), "maxSize", null);
        setBooleanField(term28275, term28275.getClass(), "maxSizeSet", false);
        setField(term28275, term28275.getClass(), "componentOrientation", null);
        setBooleanField(term28275, term28275.getClass(), "newEventsOnly", false);
        setField(term28275, term28275.getClass(), "componentListener", null);
        setField(term28275, term28275.getClass(), "focusListener", null);
        setField(term28275, term28275.getClass(), "hierarchyListener", null);
        setField(term28275, term28275.getClass(), "hierarchyBoundsListener", null);
        setField(term28275, term28275.getClass(), "keyListener", null);
        setField(term28275, term28275.getClass(), "mouseListener", null);
        setField(term28275, term28275.getClass(), "mouseMotionListener", null);
        setField(term28275, term28275.getClass(), "mouseWheelListener", null);
        setField(term28275, term28275.getClass(), "inputMethodListener", null);
        setLongField(term28275, term28275.getClass(), "eventMask", 0L);
        setField(term28275, term28275.getClass(), "changeSupport", null);
        setField(term28275, term28275.getClass(), "objectLock", null);
        setBooleanField(term28275, term28275.getClass(), "isPacked", false);
        setIntField(term28275, term28275.getClass(), "boundsOp", 0);
        setField(term28275, term28275.getClass(), "compoundShape", null);
        setField(term28275, term28275.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term28275, term28275.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term28275, term28275.getClass(), "backgroundEraseDisabled", false);
        setField(term28275, term28275.getClass(), "eventCache", null);
        setBooleanField(term28275, term28275.getClass(), "coalescingEnabled", false);
        setBooleanField(term28275, term28275.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term28275, term28275.getClass(), "componentSerializedDataVersion", 0);
        setField(term28275, term28275.getClass(), "accessibleContext", null);
        term28320 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28320;
        callMethod(klass, "setValue", argTypes, term28275, args);
    }

};


