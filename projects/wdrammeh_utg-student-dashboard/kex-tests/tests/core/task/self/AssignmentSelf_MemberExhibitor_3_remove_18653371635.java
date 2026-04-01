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

public class AssignmentSelf_MemberExhibitor_3_remove_18653371635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229643;

    public AssignmentSelf_MemberExhibitor_3_remove_18653371635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229643 = newInstance(Class.forName("core.task.self.AssignmentSelf$MemberExhibitor$3"));
        setField(term229643, term229643.getClass(), "this$0", null);
        setBooleanField(term229643, term229643.getClass(), "reflectTheme", false);
        setBooleanField(term229643, term229643.getClass(), "isAlignmentXSet", false);
        setFloatField(term229643, term229643.getClass(), "alignmentX", 0.0F);
        setBooleanField(term229643, term229643.getClass(), "isAlignmentYSet", false);
        setFloatField(term229643, term229643.getClass(), "alignmentY", 0.0F);
        setField(term229643, term229643.getClass(), "ui", null);
        setField(term229643, term229643.getClass(), "listenerList", null);
        setField(term229643, term229643.getClass(), "clientProperties", null);
        setField(term229643, term229643.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term229643, term229643.getClass(), "autoscrolls", false);
        setField(term229643, term229643.getClass(), "border", null);
        setIntField(term229643, term229643.getClass(), "flags", 0);
        setField(term229643, term229643.getClass(), "inputVerifier", null);
        setBooleanField(term229643, term229643.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term229643, term229643.getClass(), "paintingChild", null);
        setField(term229643, term229643.getClass(), "popupMenu", null);
        setField(term229643, term229643.getClass(), "revalidateRunnableScheduled", null);
        setField(term229643, term229643.getClass(), "focusInputMap", null);
        setField(term229643, term229643.getClass(), "ancestorInputMap", null);
        setField(term229643, term229643.getClass(), "windowInputMap", null);
        setField(term229643, term229643.getClass(), "actionMap", null);
        setField(term229643, term229643.getClass(), "aaHint", null);
        setField(term229643, term229643.getClass(), "lcdRenderingHint", null);
        setField(term229643, term229643.getClass(), "component", null);
        setField(term229643, term229643.getClass(), "layoutMgr", null);
        setField(term229643, term229643.getClass(), "dispatcher", null);
        setField(term229643, term229643.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term229643, term229643.getClass(), "focusCycleRoot", false);
        setBooleanField(term229643, term229643.getClass(), "focusTraversalPolicyProvider", false);
        setField(term229643, term229643.getClass(), "printingThreads", null);
        setBooleanField(term229643, term229643.getClass(), "printing", false);
        setField(term229643, term229643.getClass(), "containerListener", null);
        setIntField(term229643, term229643.getClass(), "listeningChildren", 0);
        setIntField(term229643, term229643.getClass(), "listeningBoundsChildren", 0);
        setIntField(term229643, term229643.getClass(), "descendantsCount", 0);
        setField(term229643, term229643.getClass(), "preserveBackgroundColor", null);
        setIntField(term229643, term229643.getClass(), "numOfHWComponents", 0);
        setIntField(term229643, term229643.getClass(), "numOfLWComponents", 0);
        setField(term229643, term229643.getClass(), "modalComp", null);
        setField(term229643, term229643.getClass(), "modalAppContext", null);
        setIntField(term229643, term229643.getClass(), "containerSerializedDataVersion", 0);
        setField(term229643, term229643.getClass(), "peer", null);
        setField(term229643, term229643.getClass(), "parent", null);
        setField(term229643, term229643.getClass(), "appContext", null);
        setIntField(term229643, term229643.getClass(), "x", 0);
        setIntField(term229643, term229643.getClass(), "y", 0);
        setIntField(term229643, term229643.getClass(), "width", 0);
        setIntField(term229643, term229643.getClass(), "height", 0);
        setField(term229643, term229643.getClass(), "foreground", null);
        setField(term229643, term229643.getClass(), "background", null);
        setField(term229643, term229643.getClass(), "font", null);
        setField(term229643, term229643.getClass(), "peerFont", null);
        setField(term229643, term229643.getClass(), "cursor", null);
        setField(term229643, term229643.getClass(), "locale", null);
        setField(term229643, term229643.getClass(), "graphicsConfig", null);
        setField(term229643, term229643.getClass(), "bufferStrategy", null);
        setBooleanField(term229643, term229643.getClass(), "ignoreRepaint", false);
        setBooleanField(term229643, term229643.getClass(), "visible", false);
        setBooleanField(term229643, term229643.getClass(), "enabled", false);
        setBooleanField(term229643, term229643.getClass(), "valid", false);
        setField(term229643, term229643.getClass(), "dropTarget", null);
        setField(term229643, term229643.getClass(), "popups", null);
        setField(term229643, term229643.getClass(), "name", null);
        setBooleanField(term229643, term229643.getClass(), "nameExplicitlySet", false);
        setBooleanField(term229643, term229643.getClass(), "focusable", false);
        setIntField(term229643, term229643.getClass(), "isFocusTraversableOverridden", 0);
        setField(term229643, term229643.getClass(), "focusTraversalKeys", null);
        setBooleanField(term229643, term229643.getClass(), "focusTraversalKeysEnabled", false);
        setField(term229643, term229643.getClass(), "acc", null);
        setField(term229643, term229643.getClass(), "minSize", null);
        setBooleanField(term229643, term229643.getClass(), "minSizeSet", false);
        setField(term229643, term229643.getClass(), "prefSize", null);
        setBooleanField(term229643, term229643.getClass(), "prefSizeSet", false);
        setField(term229643, term229643.getClass(), "maxSize", null);
        setBooleanField(term229643, term229643.getClass(), "maxSizeSet", false);
        setField(term229643, term229643.getClass(), "componentOrientation", null);
        setBooleanField(term229643, term229643.getClass(), "newEventsOnly", false);
        setField(term229643, term229643.getClass(), "componentListener", null);
        setField(term229643, term229643.getClass(), "focusListener", null);
        setField(term229643, term229643.getClass(), "hierarchyListener", null);
        setField(term229643, term229643.getClass(), "hierarchyBoundsListener", null);
        setField(term229643, term229643.getClass(), "keyListener", null);
        setField(term229643, term229643.getClass(), "mouseListener", null);
        setField(term229643, term229643.getClass(), "mouseMotionListener", null);
        setField(term229643, term229643.getClass(), "mouseWheelListener", null);
        setField(term229643, term229643.getClass(), "inputMethodListener", null);
        setLongField(term229643, term229643.getClass(), "eventMask", 0L);
        setField(term229643, term229643.getClass(), "changeSupport", null);
        setField(term229643, term229643.getClass(), "objectLock", null);
        setBooleanField(term229643, term229643.getClass(), "isPacked", false);
        setIntField(term229643, term229643.getClass(), "boundsOp", 0);
        setField(term229643, term229643.getClass(), "compoundShape", null);
        setField(term229643, term229643.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term229643, term229643.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term229643, term229643.getClass(), "backgroundEraseDisabled", false);
        setField(term229643, term229643.getClass(), "eventCache", null);
        setBooleanField(term229643, term229643.getClass(), "coalescingEnabled", false);
        setBooleanField(term229643, term229643.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term229643, term229643.getClass(), "componentSerializedDataVersion", 0);
        setField(term229643, term229643.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$MemberExhibitor$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term229643, args);
    }

};


