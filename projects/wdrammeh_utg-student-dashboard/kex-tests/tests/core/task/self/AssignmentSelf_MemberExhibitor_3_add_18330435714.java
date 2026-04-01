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

public class AssignmentSelf_MemberExhibitor_3_add_18330435714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229601;

    public AssignmentSelf_MemberExhibitor_3_add_18330435714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229601 = newInstance(Class.forName("core.task.self.AssignmentSelf$MemberExhibitor$3"));
        setField(term229601, term229601.getClass(), "this$0", null);
        setBooleanField(term229601, term229601.getClass(), "reflectTheme", false);
        setBooleanField(term229601, term229601.getClass(), "isAlignmentXSet", false);
        setFloatField(term229601, term229601.getClass(), "alignmentX", 0.0F);
        setBooleanField(term229601, term229601.getClass(), "isAlignmentYSet", false);
        setFloatField(term229601, term229601.getClass(), "alignmentY", 0.0F);
        setField(term229601, term229601.getClass(), "ui", null);
        setField(term229601, term229601.getClass(), "listenerList", null);
        setField(term229601, term229601.getClass(), "clientProperties", null);
        setField(term229601, term229601.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term229601, term229601.getClass(), "autoscrolls", false);
        setField(term229601, term229601.getClass(), "border", null);
        setIntField(term229601, term229601.getClass(), "flags", 0);
        setField(term229601, term229601.getClass(), "inputVerifier", null);
        setBooleanField(term229601, term229601.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term229601, term229601.getClass(), "paintingChild", null);
        setField(term229601, term229601.getClass(), "popupMenu", null);
        setField(term229601, term229601.getClass(), "revalidateRunnableScheduled", null);
        setField(term229601, term229601.getClass(), "focusInputMap", null);
        setField(term229601, term229601.getClass(), "ancestorInputMap", null);
        setField(term229601, term229601.getClass(), "windowInputMap", null);
        setField(term229601, term229601.getClass(), "actionMap", null);
        setField(term229601, term229601.getClass(), "aaHint", null);
        setField(term229601, term229601.getClass(), "lcdRenderingHint", null);
        setField(term229601, term229601.getClass(), "component", null);
        setField(term229601, term229601.getClass(), "layoutMgr", null);
        setField(term229601, term229601.getClass(), "dispatcher", null);
        setField(term229601, term229601.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term229601, term229601.getClass(), "focusCycleRoot", false);
        setBooleanField(term229601, term229601.getClass(), "focusTraversalPolicyProvider", false);
        setField(term229601, term229601.getClass(), "printingThreads", null);
        setBooleanField(term229601, term229601.getClass(), "printing", false);
        setField(term229601, term229601.getClass(), "containerListener", null);
        setIntField(term229601, term229601.getClass(), "listeningChildren", 0);
        setIntField(term229601, term229601.getClass(), "listeningBoundsChildren", 0);
        setIntField(term229601, term229601.getClass(), "descendantsCount", 0);
        setField(term229601, term229601.getClass(), "preserveBackgroundColor", null);
        setIntField(term229601, term229601.getClass(), "numOfHWComponents", 0);
        setIntField(term229601, term229601.getClass(), "numOfLWComponents", 0);
        setField(term229601, term229601.getClass(), "modalComp", null);
        setField(term229601, term229601.getClass(), "modalAppContext", null);
        setIntField(term229601, term229601.getClass(), "containerSerializedDataVersion", 0);
        setField(term229601, term229601.getClass(), "peer", null);
        setField(term229601, term229601.getClass(), "parent", null);
        setField(term229601, term229601.getClass(), "appContext", null);
        setIntField(term229601, term229601.getClass(), "x", 0);
        setIntField(term229601, term229601.getClass(), "y", 0);
        setIntField(term229601, term229601.getClass(), "width", 0);
        setIntField(term229601, term229601.getClass(), "height", 0);
        setField(term229601, term229601.getClass(), "foreground", null);
        setField(term229601, term229601.getClass(), "background", null);
        setField(term229601, term229601.getClass(), "font", null);
        setField(term229601, term229601.getClass(), "peerFont", null);
        setField(term229601, term229601.getClass(), "cursor", null);
        setField(term229601, term229601.getClass(), "locale", null);
        setField(term229601, term229601.getClass(), "graphicsConfig", null);
        setField(term229601, term229601.getClass(), "bufferStrategy", null);
        setBooleanField(term229601, term229601.getClass(), "ignoreRepaint", false);
        setBooleanField(term229601, term229601.getClass(), "visible", false);
        setBooleanField(term229601, term229601.getClass(), "enabled", false);
        setBooleanField(term229601, term229601.getClass(), "valid", false);
        setField(term229601, term229601.getClass(), "dropTarget", null);
        setField(term229601, term229601.getClass(), "popups", null);
        setField(term229601, term229601.getClass(), "name", null);
        setBooleanField(term229601, term229601.getClass(), "nameExplicitlySet", false);
        setBooleanField(term229601, term229601.getClass(), "focusable", false);
        setIntField(term229601, term229601.getClass(), "isFocusTraversableOverridden", 0);
        setField(term229601, term229601.getClass(), "focusTraversalKeys", null);
        setBooleanField(term229601, term229601.getClass(), "focusTraversalKeysEnabled", false);
        setField(term229601, term229601.getClass(), "acc", null);
        setField(term229601, term229601.getClass(), "minSize", null);
        setBooleanField(term229601, term229601.getClass(), "minSizeSet", false);
        setField(term229601, term229601.getClass(), "prefSize", null);
        setBooleanField(term229601, term229601.getClass(), "prefSizeSet", false);
        setField(term229601, term229601.getClass(), "maxSize", null);
        setBooleanField(term229601, term229601.getClass(), "maxSizeSet", false);
        setField(term229601, term229601.getClass(), "componentOrientation", null);
        setBooleanField(term229601, term229601.getClass(), "newEventsOnly", false);
        setField(term229601, term229601.getClass(), "componentListener", null);
        setField(term229601, term229601.getClass(), "focusListener", null);
        setField(term229601, term229601.getClass(), "hierarchyListener", null);
        setField(term229601, term229601.getClass(), "hierarchyBoundsListener", null);
        setField(term229601, term229601.getClass(), "keyListener", null);
        setField(term229601, term229601.getClass(), "mouseListener", null);
        setField(term229601, term229601.getClass(), "mouseMotionListener", null);
        setField(term229601, term229601.getClass(), "mouseWheelListener", null);
        setField(term229601, term229601.getClass(), "inputMethodListener", null);
        setLongField(term229601, term229601.getClass(), "eventMask", 0L);
        setField(term229601, term229601.getClass(), "changeSupport", null);
        setField(term229601, term229601.getClass(), "objectLock", null);
        setBooleanField(term229601, term229601.getClass(), "isPacked", false);
        setIntField(term229601, term229601.getClass(), "boundsOp", 0);
        setField(term229601, term229601.getClass(), "compoundShape", null);
        setField(term229601, term229601.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term229601, term229601.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term229601, term229601.getClass(), "backgroundEraseDisabled", false);
        setField(term229601, term229601.getClass(), "eventCache", null);
        setBooleanField(term229601, term229601.getClass(), "coalescingEnabled", false);
        setBooleanField(term229601, term229601.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term229601, term229601.getClass(), "componentSerializedDataVersion", 0);
        setField(term229601, term229601.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$MemberExhibitor$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term229601, args);
    }

};


