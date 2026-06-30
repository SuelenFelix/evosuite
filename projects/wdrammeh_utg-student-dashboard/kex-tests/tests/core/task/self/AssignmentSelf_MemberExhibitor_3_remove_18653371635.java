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
     Object term30719;

    public AssignmentSelf_MemberExhibitor_3_remove_18653371635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30719 = newInstance(Class.forName("core.task.self.AssignmentSelf$MemberExhibitor$3"));
        setField(term30719, term30719.getClass(), "this$0", null);
        setBooleanField(term30719, term30719.getClass(), "reflectTheme", false);
        setBooleanField(term30719, term30719.getClass(), "isAlignmentXSet", false);
        setFloatField(term30719, term30719.getClass(), "alignmentX", 0.0F);
        setBooleanField(term30719, term30719.getClass(), "isAlignmentYSet", false);
        setFloatField(term30719, term30719.getClass(), "alignmentY", 0.0F);
        setField(term30719, term30719.getClass(), "ui", null);
        setField(term30719, term30719.getClass(), "listenerList", null);
        setField(term30719, term30719.getClass(), "clientProperties", null);
        setField(term30719, term30719.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term30719, term30719.getClass(), "autoscrolls", false);
        setField(term30719, term30719.getClass(), "border", null);
        setIntField(term30719, term30719.getClass(), "flags", 0);
        setField(term30719, term30719.getClass(), "inputVerifier", null);
        setBooleanField(term30719, term30719.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term30719, term30719.getClass(), "paintingChild", null);
        setField(term30719, term30719.getClass(), "popupMenu", null);
        setField(term30719, term30719.getClass(), "revalidateRunnableScheduled", null);
        setField(term30719, term30719.getClass(), "focusInputMap", null);
        setField(term30719, term30719.getClass(), "ancestorInputMap", null);
        setField(term30719, term30719.getClass(), "windowInputMap", null);
        setField(term30719, term30719.getClass(), "actionMap", null);
        setField(term30719, term30719.getClass(), "aaHint", null);
        setField(term30719, term30719.getClass(), "lcdRenderingHint", null);
        setField(term30719, term30719.getClass(), "component", null);
        setField(term30719, term30719.getClass(), "layoutMgr", null);
        setField(term30719, term30719.getClass(), "dispatcher", null);
        setField(term30719, term30719.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term30719, term30719.getClass(), "focusCycleRoot", false);
        setBooleanField(term30719, term30719.getClass(), "focusTraversalPolicyProvider", false);
        setField(term30719, term30719.getClass(), "printingThreads", null);
        setBooleanField(term30719, term30719.getClass(), "printing", false);
        setField(term30719, term30719.getClass(), "containerListener", null);
        setIntField(term30719, term30719.getClass(), "listeningChildren", 0);
        setIntField(term30719, term30719.getClass(), "listeningBoundsChildren", 0);
        setIntField(term30719, term30719.getClass(), "descendantsCount", 0);
        setField(term30719, term30719.getClass(), "preserveBackgroundColor", null);
        setIntField(term30719, term30719.getClass(), "numOfHWComponents", 0);
        setIntField(term30719, term30719.getClass(), "numOfLWComponents", 0);
        setField(term30719, term30719.getClass(), "modalComp", null);
        setField(term30719, term30719.getClass(), "modalAppContext", null);
        setIntField(term30719, term30719.getClass(), "containerSerializedDataVersion", 0);
        setField(term30719, term30719.getClass(), "peer", null);
        setField(term30719, term30719.getClass(), "parent", null);
        setField(term30719, term30719.getClass(), "appContext", null);
        setIntField(term30719, term30719.getClass(), "x", 0);
        setIntField(term30719, term30719.getClass(), "y", 0);
        setIntField(term30719, term30719.getClass(), "width", 0);
        setIntField(term30719, term30719.getClass(), "height", 0);
        setField(term30719, term30719.getClass(), "foreground", null);
        setField(term30719, term30719.getClass(), "background", null);
        setField(term30719, term30719.getClass(), "font", null);
        setField(term30719, term30719.getClass(), "peerFont", null);
        setField(term30719, term30719.getClass(), "cursor", null);
        setField(term30719, term30719.getClass(), "locale", null);
        setField(term30719, term30719.getClass(), "graphicsConfig", null);
        setField(term30719, term30719.getClass(), "bufferStrategy", null);
        setBooleanField(term30719, term30719.getClass(), "ignoreRepaint", false);
        setBooleanField(term30719, term30719.getClass(), "visible", false);
        setBooleanField(term30719, term30719.getClass(), "enabled", false);
        setBooleanField(term30719, term30719.getClass(), "valid", false);
        setField(term30719, term30719.getClass(), "dropTarget", null);
        setField(term30719, term30719.getClass(), "popups", null);
        setField(term30719, term30719.getClass(), "name", null);
        setBooleanField(term30719, term30719.getClass(), "nameExplicitlySet", false);
        setBooleanField(term30719, term30719.getClass(), "focusable", false);
        setIntField(term30719, term30719.getClass(), "isFocusTraversableOverridden", 0);
        setField(term30719, term30719.getClass(), "focusTraversalKeys", null);
        setBooleanField(term30719, term30719.getClass(), "focusTraversalKeysEnabled", false);
        setField(term30719, term30719.getClass(), "acc", null);
        setField(term30719, term30719.getClass(), "minSize", null);
        setBooleanField(term30719, term30719.getClass(), "minSizeSet", false);
        setField(term30719, term30719.getClass(), "prefSize", null);
        setBooleanField(term30719, term30719.getClass(), "prefSizeSet", false);
        setField(term30719, term30719.getClass(), "maxSize", null);
        setBooleanField(term30719, term30719.getClass(), "maxSizeSet", false);
        setField(term30719, term30719.getClass(), "componentOrientation", null);
        setBooleanField(term30719, term30719.getClass(), "newEventsOnly", false);
        setField(term30719, term30719.getClass(), "componentListener", null);
        setField(term30719, term30719.getClass(), "focusListener", null);
        setField(term30719, term30719.getClass(), "hierarchyListener", null);
        setField(term30719, term30719.getClass(), "hierarchyBoundsListener", null);
        setField(term30719, term30719.getClass(), "keyListener", null);
        setField(term30719, term30719.getClass(), "mouseListener", null);
        setField(term30719, term30719.getClass(), "mouseMotionListener", null);
        setField(term30719, term30719.getClass(), "mouseWheelListener", null);
        setField(term30719, term30719.getClass(), "inputMethodListener", null);
        setLongField(term30719, term30719.getClass(), "eventMask", 0L);
        setField(term30719, term30719.getClass(), "changeSupport", null);
        setField(term30719, term30719.getClass(), "objectLock", null);
        setBooleanField(term30719, term30719.getClass(), "isPacked", false);
        setIntField(term30719, term30719.getClass(), "boundsOp", 0);
        setField(term30719, term30719.getClass(), "compoundShape", null);
        setField(term30719, term30719.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term30719, term30719.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term30719, term30719.getClass(), "backgroundEraseDisabled", false);
        setField(term30719, term30719.getClass(), "eventCache", null);
        setBooleanField(term30719, term30719.getClass(), "coalescingEnabled", false);
        setBooleanField(term30719, term30719.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term30719, term30719.getClass(), "componentSerializedDataVersion", 0);
        setField(term30719, term30719.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$MemberExhibitor$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term30719, args);
    }

};


