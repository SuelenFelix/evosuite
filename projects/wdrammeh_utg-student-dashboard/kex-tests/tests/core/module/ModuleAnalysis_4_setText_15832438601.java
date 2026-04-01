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
import java.lang.Object;

public class ModuleAnalysis_4_setText_15832438601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291337;

    public ModuleAnalysis_4_setText_15832438601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291337 = newInstance(Class.forName("core.module.ModuleAnalysis$4"));
        Object term291362 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term291363 = (Object[]) newArray("java.lang.Object", 0);
        Object term291364 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term291365 = newInstance(Class.forName("java.lang.Object"));
        Object term291366 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term291367 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term291368 = newInstance(Class.forName("java.lang.Object"));
        setField(term291337, term291337.getClass(), "this$0", null);
        setIntField(term291337, term291337.getClass(), "mnemonic", -2117539025);
        setIntField(term291337, term291337.getClass(), "mnemonicIndex", 736842788);
        setField(term291337, term291337.getClass(), "text", "WAZFhrxcSM");
        setField(term291337, term291337.getClass(), "defaultIcon", null);
        setField(term291337, term291337.getClass(), "disabledIcon", null);
        setBooleanField(term291337, term291337.getClass(), "disabledIconSet", true);
        setIntField(term291337, term291337.getClass(), "verticalAlignment", 416550042);
        setIntField(term291337, term291337.getClass(), "horizontalAlignment", 1745727714);
        setIntField(term291337, term291337.getClass(), "verticalTextPosition", -1577886337);
        setIntField(term291337, term291337.getClass(), "horizontalTextPosition", -481394578);
        setIntField(term291337, term291337.getClass(), "iconTextGap", 1440683242);
        setField(term291337, term291337.getClass(), "labelFor", null);
        setBooleanField(term291337, term291337.getClass(), "isAlignmentXSet", true);
        setFloatField(term291337, term291337.getClass(), "alignmentX", 0.4131598F);
        setBooleanField(term291337, term291337.getClass(), "isAlignmentYSet", true);
        setFloatField(term291337, term291337.getClass(), "alignmentY", 0.6693176F);
        setField(term291337, term291337.getClass(), "ui", null);
        setField(term291362, term291362.getClass(), "listenerList", term291363);
        setField(term291337, term291337.getClass(), "listenerList", term291362);
        setField(term291364, term291364.getClass(), "table", term291365);
        setField(term291337, term291337.getClass(), "clientProperties", term291364);
        setField(term291367, term291367.getClass(), "map", null);
        setField(term291366, term291366.getClass(), "map", term291367);
        setField(term291366, term291366.getClass(), "source", term291368);
        setField(term291337, term291337.getClass(), "vetoableChangeSupport", term291366);
        setBooleanField(term291337, term291337.getClass(), "autoscrolls", true);
        setField(term291337, term291337.getClass(), "border", null);
        setIntField(term291337, term291337.getClass(), "flags", -996911099);
        setField(term291337, term291337.getClass(), "inputVerifier", null);
        setBooleanField(term291337, term291337.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term291337, term291337.getClass(), "paintingChild", null);
        setField(term291337, term291337.getClass(), "popupMenu", null);
        setField(term291337, term291337.getClass(), "revalidateRunnableScheduled", null);
        setField(term291337, term291337.getClass(), "focusInputMap", null);
        setField(term291337, term291337.getClass(), "ancestorInputMap", null);
        setField(term291337, term291337.getClass(), "windowInputMap", null);
        setField(term291337, term291337.getClass(), "actionMap", null);
        setField(term291337, term291337.getClass(), "aaHint", null);
        setField(term291337, term291337.getClass(), "lcdRenderingHint", null);
        setField(term291337, term291337.getClass(), "component", null);
        setField(term291337, term291337.getClass(), "layoutMgr", null);
        setField(term291337, term291337.getClass(), "dispatcher", null);
        setField(term291337, term291337.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term291337, term291337.getClass(), "focusCycleRoot", false);
        setBooleanField(term291337, term291337.getClass(), "focusTraversalPolicyProvider", false);
        setField(term291337, term291337.getClass(), "printingThreads", null);
        setBooleanField(term291337, term291337.getClass(), "printing", false);
        setField(term291337, term291337.getClass(), "containerListener", null);
        setIntField(term291337, term291337.getClass(), "listeningChildren", 0);
        setIntField(term291337, term291337.getClass(), "listeningBoundsChildren", 0);
        setIntField(term291337, term291337.getClass(), "descendantsCount", 0);
        setField(term291337, term291337.getClass(), "preserveBackgroundColor", null);
        setIntField(term291337, term291337.getClass(), "numOfHWComponents", 0);
        setIntField(term291337, term291337.getClass(), "numOfLWComponents", 0);
        setField(term291337, term291337.getClass(), "modalComp", null);
        setField(term291337, term291337.getClass(), "modalAppContext", null);
        setIntField(term291337, term291337.getClass(), "containerSerializedDataVersion", 0);
        setField(term291337, term291337.getClass(), "peer", null);
        setField(term291337, term291337.getClass(), "parent", null);
        setField(term291337, term291337.getClass(), "appContext", null);
        setIntField(term291337, term291337.getClass(), "x", 0);
        setIntField(term291337, term291337.getClass(), "y", 0);
        setIntField(term291337, term291337.getClass(), "width", 0);
        setIntField(term291337, term291337.getClass(), "height", 0);
        setField(term291337, term291337.getClass(), "foreground", null);
        setField(term291337, term291337.getClass(), "background", null);
        setField(term291337, term291337.getClass(), "font", null);
        setField(term291337, term291337.getClass(), "peerFont", null);
        setField(term291337, term291337.getClass(), "cursor", null);
        setField(term291337, term291337.getClass(), "locale", null);
        setField(term291337, term291337.getClass(), "graphicsConfig", null);
        setField(term291337, term291337.getClass(), "bufferStrategy", null);
        setBooleanField(term291337, term291337.getClass(), "ignoreRepaint", false);
        setBooleanField(term291337, term291337.getClass(), "visible", false);
        setBooleanField(term291337, term291337.getClass(), "enabled", false);
        setBooleanField(term291337, term291337.getClass(), "valid", false);
        setField(term291337, term291337.getClass(), "dropTarget", null);
        setField(term291337, term291337.getClass(), "popups", null);
        setField(term291337, term291337.getClass(), "name", null);
        setBooleanField(term291337, term291337.getClass(), "nameExplicitlySet", false);
        setBooleanField(term291337, term291337.getClass(), "focusable", false);
        setIntField(term291337, term291337.getClass(), "isFocusTraversableOverridden", 0);
        setField(term291337, term291337.getClass(), "focusTraversalKeys", null);
        setBooleanField(term291337, term291337.getClass(), "focusTraversalKeysEnabled", false);
        setField(term291337, term291337.getClass(), "acc", null);
        setField(term291337, term291337.getClass(), "minSize", null);
        setBooleanField(term291337, term291337.getClass(), "minSizeSet", false);
        setField(term291337, term291337.getClass(), "prefSize", null);
        setBooleanField(term291337, term291337.getClass(), "prefSizeSet", false);
        setField(term291337, term291337.getClass(), "maxSize", null);
        setBooleanField(term291337, term291337.getClass(), "maxSizeSet", false);
        setField(term291337, term291337.getClass(), "componentOrientation", null);
        setBooleanField(term291337, term291337.getClass(), "newEventsOnly", false);
        setField(term291337, term291337.getClass(), "componentListener", null);
        setField(term291337, term291337.getClass(), "focusListener", null);
        setField(term291337, term291337.getClass(), "hierarchyListener", null);
        setField(term291337, term291337.getClass(), "hierarchyBoundsListener", null);
        setField(term291337, term291337.getClass(), "keyListener", null);
        setField(term291337, term291337.getClass(), "mouseListener", null);
        setField(term291337, term291337.getClass(), "mouseMotionListener", null);
        setField(term291337, term291337.getClass(), "mouseWheelListener", null);
        setField(term291337, term291337.getClass(), "inputMethodListener", null);
        setLongField(term291337, term291337.getClass(), "eventMask", 0L);
        setField(term291337, term291337.getClass(), "changeSupport", null);
        setField(term291337, term291337.getClass(), "objectLock", null);
        setBooleanField(term291337, term291337.getClass(), "isPacked", false);
        setIntField(term291337, term291337.getClass(), "boundsOp", 0);
        setField(term291337, term291337.getClass(), "compoundShape", null);
        setField(term291337, term291337.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term291337, term291337.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term291337, term291337.getClass(), "backgroundEraseDisabled", false);
        setField(term291337, term291337.getClass(), "eventCache", null);
        setBooleanField(term291337, term291337.getClass(), "coalescingEnabled", false);
        setBooleanField(term291337, term291337.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term291337, term291337.getClass(), "componentSerializedDataVersion", 0);
        setField(term291337, term291337.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$4");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tYBgGQtkhi";
        callMethod(klass, "setText", argTypes, term291337, args);
    }

};


