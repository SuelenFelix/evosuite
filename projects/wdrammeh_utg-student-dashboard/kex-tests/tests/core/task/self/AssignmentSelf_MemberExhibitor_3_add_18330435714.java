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
     Object term30677;

    public AssignmentSelf_MemberExhibitor_3_add_18330435714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30677 = newInstance(Class.forName("core.task.self.AssignmentSelf$MemberExhibitor$3"));
        setField(term30677, term30677.getClass(), "this$0", null);
        setBooleanField(term30677, term30677.getClass(), "reflectTheme", false);
        setBooleanField(term30677, term30677.getClass(), "isAlignmentXSet", false);
        setFloatField(term30677, term30677.getClass(), "alignmentX", 0.0F);
        setBooleanField(term30677, term30677.getClass(), "isAlignmentYSet", false);
        setFloatField(term30677, term30677.getClass(), "alignmentY", 0.0F);
        setField(term30677, term30677.getClass(), "ui", null);
        setField(term30677, term30677.getClass(), "listenerList", null);
        setField(term30677, term30677.getClass(), "clientProperties", null);
        setField(term30677, term30677.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term30677, term30677.getClass(), "autoscrolls", false);
        setField(term30677, term30677.getClass(), "border", null);
        setIntField(term30677, term30677.getClass(), "flags", 0);
        setField(term30677, term30677.getClass(), "inputVerifier", null);
        setBooleanField(term30677, term30677.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term30677, term30677.getClass(), "paintingChild", null);
        setField(term30677, term30677.getClass(), "popupMenu", null);
        setField(term30677, term30677.getClass(), "revalidateRunnableScheduled", null);
        setField(term30677, term30677.getClass(), "focusInputMap", null);
        setField(term30677, term30677.getClass(), "ancestorInputMap", null);
        setField(term30677, term30677.getClass(), "windowInputMap", null);
        setField(term30677, term30677.getClass(), "actionMap", null);
        setField(term30677, term30677.getClass(), "aaHint", null);
        setField(term30677, term30677.getClass(), "lcdRenderingHint", null);
        setField(term30677, term30677.getClass(), "component", null);
        setField(term30677, term30677.getClass(), "layoutMgr", null);
        setField(term30677, term30677.getClass(), "dispatcher", null);
        setField(term30677, term30677.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term30677, term30677.getClass(), "focusCycleRoot", false);
        setBooleanField(term30677, term30677.getClass(), "focusTraversalPolicyProvider", false);
        setField(term30677, term30677.getClass(), "printingThreads", null);
        setBooleanField(term30677, term30677.getClass(), "printing", false);
        setField(term30677, term30677.getClass(), "containerListener", null);
        setIntField(term30677, term30677.getClass(), "listeningChildren", 0);
        setIntField(term30677, term30677.getClass(), "listeningBoundsChildren", 0);
        setIntField(term30677, term30677.getClass(), "descendantsCount", 0);
        setField(term30677, term30677.getClass(), "preserveBackgroundColor", null);
        setIntField(term30677, term30677.getClass(), "numOfHWComponents", 0);
        setIntField(term30677, term30677.getClass(), "numOfLWComponents", 0);
        setField(term30677, term30677.getClass(), "modalComp", null);
        setField(term30677, term30677.getClass(), "modalAppContext", null);
        setIntField(term30677, term30677.getClass(), "containerSerializedDataVersion", 0);
        setField(term30677, term30677.getClass(), "peer", null);
        setField(term30677, term30677.getClass(), "parent", null);
        setField(term30677, term30677.getClass(), "appContext", null);
        setIntField(term30677, term30677.getClass(), "x", 0);
        setIntField(term30677, term30677.getClass(), "y", 0);
        setIntField(term30677, term30677.getClass(), "width", 0);
        setIntField(term30677, term30677.getClass(), "height", 0);
        setField(term30677, term30677.getClass(), "foreground", null);
        setField(term30677, term30677.getClass(), "background", null);
        setField(term30677, term30677.getClass(), "font", null);
        setField(term30677, term30677.getClass(), "peerFont", null);
        setField(term30677, term30677.getClass(), "cursor", null);
        setField(term30677, term30677.getClass(), "locale", null);
        setField(term30677, term30677.getClass(), "graphicsConfig", null);
        setField(term30677, term30677.getClass(), "bufferStrategy", null);
        setBooleanField(term30677, term30677.getClass(), "ignoreRepaint", false);
        setBooleanField(term30677, term30677.getClass(), "visible", false);
        setBooleanField(term30677, term30677.getClass(), "enabled", false);
        setBooleanField(term30677, term30677.getClass(), "valid", false);
        setField(term30677, term30677.getClass(), "dropTarget", null);
        setField(term30677, term30677.getClass(), "popups", null);
        setField(term30677, term30677.getClass(), "name", null);
        setBooleanField(term30677, term30677.getClass(), "nameExplicitlySet", false);
        setBooleanField(term30677, term30677.getClass(), "focusable", false);
        setIntField(term30677, term30677.getClass(), "isFocusTraversableOverridden", 0);
        setField(term30677, term30677.getClass(), "focusTraversalKeys", null);
        setBooleanField(term30677, term30677.getClass(), "focusTraversalKeysEnabled", false);
        setField(term30677, term30677.getClass(), "acc", null);
        setField(term30677, term30677.getClass(), "minSize", null);
        setBooleanField(term30677, term30677.getClass(), "minSizeSet", false);
        setField(term30677, term30677.getClass(), "prefSize", null);
        setBooleanField(term30677, term30677.getClass(), "prefSizeSet", false);
        setField(term30677, term30677.getClass(), "maxSize", null);
        setBooleanField(term30677, term30677.getClass(), "maxSizeSet", false);
        setField(term30677, term30677.getClass(), "componentOrientation", null);
        setBooleanField(term30677, term30677.getClass(), "newEventsOnly", false);
        setField(term30677, term30677.getClass(), "componentListener", null);
        setField(term30677, term30677.getClass(), "focusListener", null);
        setField(term30677, term30677.getClass(), "hierarchyListener", null);
        setField(term30677, term30677.getClass(), "hierarchyBoundsListener", null);
        setField(term30677, term30677.getClass(), "keyListener", null);
        setField(term30677, term30677.getClass(), "mouseListener", null);
        setField(term30677, term30677.getClass(), "mouseMotionListener", null);
        setField(term30677, term30677.getClass(), "mouseWheelListener", null);
        setField(term30677, term30677.getClass(), "inputMethodListener", null);
        setLongField(term30677, term30677.getClass(), "eventMask", 0L);
        setField(term30677, term30677.getClass(), "changeSupport", null);
        setField(term30677, term30677.getClass(), "objectLock", null);
        setBooleanField(term30677, term30677.getClass(), "isPacked", false);
        setIntField(term30677, term30677.getClass(), "boundsOp", 0);
        setField(term30677, term30677.getClass(), "compoundShape", null);
        setField(term30677, term30677.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term30677, term30677.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term30677, term30677.getClass(), "backgroundEraseDisabled", false);
        setField(term30677, term30677.getClass(), "eventCache", null);
        setBooleanField(term30677, term30677.getClass(), "coalescingEnabled", false);
        setBooleanField(term30677, term30677.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term30677, term30677.getClass(), "componentSerializedDataVersion", 0);
        setField(term30677, term30677.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$MemberExhibitor$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term30677, args);
    }

};


