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
import java.lang.Object;
import java.lang.Integer;

public class ProjectSelf_1_setValue_2205852852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200504;
     Object term200570;

    public ProjectSelf_1_setValue_2205852852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200504 = newInstance(Class.forName("core.task.self.ProjectSelf$1"));
        Object term200520 = newInstance(Class.forName("javax.swing.event.ChangeEvent"));
        Object term200521 = newInstance(Class.forName("java.lang.Object"));
        Object term200527 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term200528 = (Object[]) newArray("java.lang.Object", 0);
        Object term200529 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term200530 = newInstance(Class.forName("java.lang.Object"));
        Object term200531 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term200532 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term200533 = newInstance(Class.forName("java.lang.Object"));
        setField(term200504, term200504.getClass(), "this$0", null);
        setIntField(term200504, term200504.getClass(), "orientation", 346282818);
        setBooleanField(term200504, term200504.getClass(), "paintBorder", false);
        setField(term200504, term200504.getClass(), "model", null);
        setField(term200504, term200504.getClass(), "progressString", "YJhnPtWtJR");
        setBooleanField(term200504, term200504.getClass(), "paintString", false);
        setField(term200520, term200520.getClass(), "source", term200521);
        setField(term200504, term200504.getClass(), "changeEvent", term200520);
        setField(term200504, term200504.getClass(), "changeListener", null);
        setField(term200504, term200504.getClass(), "format", null);
        setBooleanField(term200504, term200504.getClass(), "indeterminate", true);
        setBooleanField(term200504, term200504.getClass(), "isAlignmentXSet", false);
        setFloatField(term200504, term200504.getClass(), "alignmentX", 0.12764448F);
        setBooleanField(term200504, term200504.getClass(), "isAlignmentYSet", false);
        setFloatField(term200504, term200504.getClass(), "alignmentY", 0.8254093F);
        setField(term200504, term200504.getClass(), "ui", null);
        setField(term200527, term200527.getClass(), "listenerList", term200528);
        setField(term200504, term200504.getClass(), "listenerList", term200527);
        setField(term200529, term200529.getClass(), "table", term200530);
        setField(term200504, term200504.getClass(), "clientProperties", term200529);
        setField(term200532, term200532.getClass(), "map", null);
        setField(term200531, term200531.getClass(), "map", term200532);
        setField(term200531, term200531.getClass(), "source", term200533);
        setField(term200504, term200504.getClass(), "vetoableChangeSupport", term200531);
        setBooleanField(term200504, term200504.getClass(), "autoscrolls", true);
        setField(term200504, term200504.getClass(), "border", null);
        setIntField(term200504, term200504.getClass(), "flags", 1425319286);
        setField(term200504, term200504.getClass(), "inputVerifier", null);
        setBooleanField(term200504, term200504.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term200504, term200504.getClass(), "paintingChild", null);
        setField(term200504, term200504.getClass(), "popupMenu", null);
        setField(term200504, term200504.getClass(), "revalidateRunnableScheduled", null);
        setField(term200504, term200504.getClass(), "focusInputMap", null);
        setField(term200504, term200504.getClass(), "ancestorInputMap", null);
        setField(term200504, term200504.getClass(), "windowInputMap", null);
        setField(term200504, term200504.getClass(), "actionMap", null);
        setField(term200504, term200504.getClass(), "aaHint", null);
        setField(term200504, term200504.getClass(), "lcdRenderingHint", null);
        setField(term200504, term200504.getClass(), "component", null);
        setField(term200504, term200504.getClass(), "layoutMgr", null);
        setField(term200504, term200504.getClass(), "dispatcher", null);
        setField(term200504, term200504.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term200504, term200504.getClass(), "focusCycleRoot", false);
        setBooleanField(term200504, term200504.getClass(), "focusTraversalPolicyProvider", false);
        setField(term200504, term200504.getClass(), "printingThreads", null);
        setBooleanField(term200504, term200504.getClass(), "printing", false);
        setField(term200504, term200504.getClass(), "containerListener", null);
        setIntField(term200504, term200504.getClass(), "listeningChildren", 0);
        setIntField(term200504, term200504.getClass(), "listeningBoundsChildren", 0);
        setIntField(term200504, term200504.getClass(), "descendantsCount", 0);
        setField(term200504, term200504.getClass(), "preserveBackgroundColor", null);
        setIntField(term200504, term200504.getClass(), "numOfHWComponents", 0);
        setIntField(term200504, term200504.getClass(), "numOfLWComponents", 0);
        setField(term200504, term200504.getClass(), "modalComp", null);
        setField(term200504, term200504.getClass(), "modalAppContext", null);
        setIntField(term200504, term200504.getClass(), "containerSerializedDataVersion", 0);
        setField(term200504, term200504.getClass(), "peer", null);
        setField(term200504, term200504.getClass(), "parent", null);
        setField(term200504, term200504.getClass(), "appContext", null);
        setIntField(term200504, term200504.getClass(), "x", 0);
        setIntField(term200504, term200504.getClass(), "y", 0);
        setIntField(term200504, term200504.getClass(), "width", 0);
        setIntField(term200504, term200504.getClass(), "height", 0);
        setField(term200504, term200504.getClass(), "foreground", null);
        setField(term200504, term200504.getClass(), "background", null);
        setField(term200504, term200504.getClass(), "font", null);
        setField(term200504, term200504.getClass(), "peerFont", null);
        setField(term200504, term200504.getClass(), "cursor", null);
        setField(term200504, term200504.getClass(), "locale", null);
        setField(term200504, term200504.getClass(), "graphicsConfig", null);
        setField(term200504, term200504.getClass(), "bufferStrategy", null);
        setBooleanField(term200504, term200504.getClass(), "ignoreRepaint", false);
        setBooleanField(term200504, term200504.getClass(), "visible", false);
        setBooleanField(term200504, term200504.getClass(), "enabled", false);
        setBooleanField(term200504, term200504.getClass(), "valid", false);
        setField(term200504, term200504.getClass(), "dropTarget", null);
        setField(term200504, term200504.getClass(), "popups", null);
        setField(term200504, term200504.getClass(), "name", null);
        setBooleanField(term200504, term200504.getClass(), "nameExplicitlySet", false);
        setBooleanField(term200504, term200504.getClass(), "focusable", false);
        setIntField(term200504, term200504.getClass(), "isFocusTraversableOverridden", 0);
        setField(term200504, term200504.getClass(), "focusTraversalKeys", null);
        setBooleanField(term200504, term200504.getClass(), "focusTraversalKeysEnabled", false);
        setField(term200504, term200504.getClass(), "acc", null);
        setField(term200504, term200504.getClass(), "minSize", null);
        setBooleanField(term200504, term200504.getClass(), "minSizeSet", false);
        setField(term200504, term200504.getClass(), "prefSize", null);
        setBooleanField(term200504, term200504.getClass(), "prefSizeSet", false);
        setField(term200504, term200504.getClass(), "maxSize", null);
        setBooleanField(term200504, term200504.getClass(), "maxSizeSet", false);
        setField(term200504, term200504.getClass(), "componentOrientation", null);
        setBooleanField(term200504, term200504.getClass(), "newEventsOnly", false);
        setField(term200504, term200504.getClass(), "componentListener", null);
        setField(term200504, term200504.getClass(), "focusListener", null);
        setField(term200504, term200504.getClass(), "hierarchyListener", null);
        setField(term200504, term200504.getClass(), "hierarchyBoundsListener", null);
        setField(term200504, term200504.getClass(), "keyListener", null);
        setField(term200504, term200504.getClass(), "mouseListener", null);
        setField(term200504, term200504.getClass(), "mouseMotionListener", null);
        setField(term200504, term200504.getClass(), "mouseWheelListener", null);
        setField(term200504, term200504.getClass(), "inputMethodListener", null);
        setLongField(term200504, term200504.getClass(), "eventMask", 0L);
        setField(term200504, term200504.getClass(), "changeSupport", null);
        setField(term200504, term200504.getClass(), "objectLock", null);
        setBooleanField(term200504, term200504.getClass(), "isPacked", false);
        setIntField(term200504, term200504.getClass(), "boundsOp", 0);
        setField(term200504, term200504.getClass(), "compoundShape", null);
        setField(term200504, term200504.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term200504, term200504.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term200504, term200504.getClass(), "backgroundEraseDisabled", false);
        setField(term200504, term200504.getClass(), "eventCache", null);
        setBooleanField(term200504, term200504.getClass(), "coalescingEnabled", false);
        setBooleanField(term200504, term200504.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term200504, term200504.getClass(), "componentSerializedDataVersion", 0);
        setField(term200504, term200504.getClass(), "accessibleContext", null);
        term200570 = new Integer(1729919228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term200570;
        callMethod(klass, "setValue", argTypes, term200504, args);
    }

};


