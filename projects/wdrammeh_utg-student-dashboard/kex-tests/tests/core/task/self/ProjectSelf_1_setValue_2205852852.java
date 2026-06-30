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
     Object term28197;
     Object term28263;

    public ProjectSelf_1_setValue_2205852852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28197 = newInstance(Class.forName("core.task.self.ProjectSelf$1"));
        Object term28213 = newInstance(Class.forName("javax.swing.event.ChangeEvent"));
        Object term28214 = newInstance(Class.forName("java.lang.Object"));
        Object term28220 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term28221 = (Object[]) newArray("java.lang.Object", 0);
        Object term28222 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term28223 = newInstance(Class.forName("java.lang.Object"));
        Object term28224 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term28225 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term28226 = newInstance(Class.forName("java.lang.Object"));
        setField(term28197, term28197.getClass(), "this$0", null);
        setIntField(term28197, term28197.getClass(), "orientation", 1236004505);
        setBooleanField(term28197, term28197.getClass(), "paintBorder", false);
        setField(term28197, term28197.getClass(), "model", null);
        setField(term28197, term28197.getClass(), "progressString", "RxbhrFBjkO");
        setBooleanField(term28197, term28197.getClass(), "paintString", true);
        setField(term28213, term28213.getClass(), "source", term28214);
        setField(term28197, term28197.getClass(), "changeEvent", term28213);
        setField(term28197, term28197.getClass(), "changeListener", null);
        setField(term28197, term28197.getClass(), "format", null);
        setBooleanField(term28197, term28197.getClass(), "indeterminate", true);
        setBooleanField(term28197, term28197.getClass(), "isAlignmentXSet", false);
        setFloatField(term28197, term28197.getClass(), "alignmentX", 0.3455959F);
        setBooleanField(term28197, term28197.getClass(), "isAlignmentYSet", true);
        setFloatField(term28197, term28197.getClass(), "alignmentY", 0.09123778F);
        setField(term28197, term28197.getClass(), "ui", null);
        setField(term28220, term28220.getClass(), "listenerList", term28221);
        setField(term28197, term28197.getClass(), "listenerList", term28220);
        setField(term28222, term28222.getClass(), "table", term28223);
        setField(term28197, term28197.getClass(), "clientProperties", term28222);
        setField(term28225, term28225.getClass(), "map", null);
        setField(term28224, term28224.getClass(), "map", term28225);
        setField(term28224, term28224.getClass(), "source", term28226);
        setField(term28197, term28197.getClass(), "vetoableChangeSupport", term28224);
        setBooleanField(term28197, term28197.getClass(), "autoscrolls", true);
        setField(term28197, term28197.getClass(), "border", null);
        setIntField(term28197, term28197.getClass(), "flags", -249614216);
        setField(term28197, term28197.getClass(), "inputVerifier", null);
        setBooleanField(term28197, term28197.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term28197, term28197.getClass(), "paintingChild", null);
        setField(term28197, term28197.getClass(), "popupMenu", null);
        setField(term28197, term28197.getClass(), "revalidateRunnableScheduled", null);
        setField(term28197, term28197.getClass(), "focusInputMap", null);
        setField(term28197, term28197.getClass(), "ancestorInputMap", null);
        setField(term28197, term28197.getClass(), "windowInputMap", null);
        setField(term28197, term28197.getClass(), "actionMap", null);
        setField(term28197, term28197.getClass(), "aaHint", null);
        setField(term28197, term28197.getClass(), "lcdRenderingHint", null);
        setField(term28197, term28197.getClass(), "component", null);
        setField(term28197, term28197.getClass(), "layoutMgr", null);
        setField(term28197, term28197.getClass(), "dispatcher", null);
        setField(term28197, term28197.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term28197, term28197.getClass(), "focusCycleRoot", false);
        setBooleanField(term28197, term28197.getClass(), "focusTraversalPolicyProvider", false);
        setField(term28197, term28197.getClass(), "printingThreads", null);
        setBooleanField(term28197, term28197.getClass(), "printing", false);
        setField(term28197, term28197.getClass(), "containerListener", null);
        setIntField(term28197, term28197.getClass(), "listeningChildren", 0);
        setIntField(term28197, term28197.getClass(), "listeningBoundsChildren", 0);
        setIntField(term28197, term28197.getClass(), "descendantsCount", 0);
        setField(term28197, term28197.getClass(), "preserveBackgroundColor", null);
        setIntField(term28197, term28197.getClass(), "numOfHWComponents", 0);
        setIntField(term28197, term28197.getClass(), "numOfLWComponents", 0);
        setField(term28197, term28197.getClass(), "modalComp", null);
        setField(term28197, term28197.getClass(), "modalAppContext", null);
        setIntField(term28197, term28197.getClass(), "containerSerializedDataVersion", 0);
        setField(term28197, term28197.getClass(), "peer", null);
        setField(term28197, term28197.getClass(), "parent", null);
        setField(term28197, term28197.getClass(), "appContext", null);
        setIntField(term28197, term28197.getClass(), "x", 0);
        setIntField(term28197, term28197.getClass(), "y", 0);
        setIntField(term28197, term28197.getClass(), "width", 0);
        setIntField(term28197, term28197.getClass(), "height", 0);
        setField(term28197, term28197.getClass(), "foreground", null);
        setField(term28197, term28197.getClass(), "background", null);
        setField(term28197, term28197.getClass(), "font", null);
        setField(term28197, term28197.getClass(), "peerFont", null);
        setField(term28197, term28197.getClass(), "cursor", null);
        setField(term28197, term28197.getClass(), "locale", null);
        setField(term28197, term28197.getClass(), "graphicsConfig", null);
        setField(term28197, term28197.getClass(), "bufferStrategy", null);
        setBooleanField(term28197, term28197.getClass(), "ignoreRepaint", false);
        setBooleanField(term28197, term28197.getClass(), "visible", false);
        setBooleanField(term28197, term28197.getClass(), "enabled", false);
        setBooleanField(term28197, term28197.getClass(), "valid", false);
        setField(term28197, term28197.getClass(), "dropTarget", null);
        setField(term28197, term28197.getClass(), "popups", null);
        setField(term28197, term28197.getClass(), "name", null);
        setBooleanField(term28197, term28197.getClass(), "nameExplicitlySet", false);
        setBooleanField(term28197, term28197.getClass(), "focusable", false);
        setIntField(term28197, term28197.getClass(), "isFocusTraversableOverridden", 0);
        setField(term28197, term28197.getClass(), "focusTraversalKeys", null);
        setBooleanField(term28197, term28197.getClass(), "focusTraversalKeysEnabled", false);
        setField(term28197, term28197.getClass(), "acc", null);
        setField(term28197, term28197.getClass(), "minSize", null);
        setBooleanField(term28197, term28197.getClass(), "minSizeSet", false);
        setField(term28197, term28197.getClass(), "prefSize", null);
        setBooleanField(term28197, term28197.getClass(), "prefSizeSet", false);
        setField(term28197, term28197.getClass(), "maxSize", null);
        setBooleanField(term28197, term28197.getClass(), "maxSizeSet", false);
        setField(term28197, term28197.getClass(), "componentOrientation", null);
        setBooleanField(term28197, term28197.getClass(), "newEventsOnly", false);
        setField(term28197, term28197.getClass(), "componentListener", null);
        setField(term28197, term28197.getClass(), "focusListener", null);
        setField(term28197, term28197.getClass(), "hierarchyListener", null);
        setField(term28197, term28197.getClass(), "hierarchyBoundsListener", null);
        setField(term28197, term28197.getClass(), "keyListener", null);
        setField(term28197, term28197.getClass(), "mouseListener", null);
        setField(term28197, term28197.getClass(), "mouseMotionListener", null);
        setField(term28197, term28197.getClass(), "mouseWheelListener", null);
        setField(term28197, term28197.getClass(), "inputMethodListener", null);
        setLongField(term28197, term28197.getClass(), "eventMask", 0L);
        setField(term28197, term28197.getClass(), "changeSupport", null);
        setField(term28197, term28197.getClass(), "objectLock", null);
        setBooleanField(term28197, term28197.getClass(), "isPacked", false);
        setIntField(term28197, term28197.getClass(), "boundsOp", 0);
        setField(term28197, term28197.getClass(), "compoundShape", null);
        setField(term28197, term28197.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term28197, term28197.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term28197, term28197.getClass(), "backgroundEraseDisabled", false);
        setField(term28197, term28197.getClass(), "eventCache", null);
        setBooleanField(term28197, term28197.getClass(), "coalescingEnabled", false);
        setBooleanField(term28197, term28197.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term28197, term28197.getClass(), "componentSerializedDataVersion", 0);
        setField(term28197, term28197.getClass(), "accessibleContext", null);
        term28263 = new Integer(1870727665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28263;
        callMethod(klass, "setValue", argTypes, term28197, args);
    }

};


