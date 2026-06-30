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

public class ModuleAnalysis_2_setText_15832437981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84637;

    public ModuleAnalysis_2_setText_15832437981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84637 = newInstance(Class.forName("core.module.ModuleAnalysis$2"));
        Object term84662 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term84663 = (Object[]) newArray("java.lang.Object", 0);
        Object term84664 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term84665 = newInstance(Class.forName("java.lang.Object"));
        Object term84666 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term84667 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term84668 = newInstance(Class.forName("java.lang.Object"));
        setField(term84637, term84637.getClass(), "this$0", null);
        setIntField(term84637, term84637.getClass(), "mnemonic", -1972033388);
        setIntField(term84637, term84637.getClass(), "mnemonicIndex", -1005024758);
        setField(term84637, term84637.getClass(), "text", "EULDrUNQvw");
        setField(term84637, term84637.getClass(), "defaultIcon", null);
        setField(term84637, term84637.getClass(), "disabledIcon", null);
        setBooleanField(term84637, term84637.getClass(), "disabledIconSet", true);
        setIntField(term84637, term84637.getClass(), "verticalAlignment", 2634669);
        setIntField(term84637, term84637.getClass(), "horizontalAlignment", -1912429941);
        setIntField(term84637, term84637.getClass(), "verticalTextPosition", 1801052257);
        setIntField(term84637, term84637.getClass(), "horizontalTextPosition", -2110556060);
        setIntField(term84637, term84637.getClass(), "iconTextGap", 313459791);
        setField(term84637, term84637.getClass(), "labelFor", null);
        setBooleanField(term84637, term84637.getClass(), "isAlignmentXSet", true);
        setFloatField(term84637, term84637.getClass(), "alignmentX", 0.912685F);
        setBooleanField(term84637, term84637.getClass(), "isAlignmentYSet", true);
        setFloatField(term84637, term84637.getClass(), "alignmentY", 0.25778466F);
        setField(term84637, term84637.getClass(), "ui", null);
        setField(term84662, term84662.getClass(), "listenerList", term84663);
        setField(term84637, term84637.getClass(), "listenerList", term84662);
        setField(term84664, term84664.getClass(), "table", term84665);
        setField(term84637, term84637.getClass(), "clientProperties", term84664);
        setField(term84667, term84667.getClass(), "map", null);
        setField(term84666, term84666.getClass(), "map", term84667);
        setField(term84666, term84666.getClass(), "source", term84668);
        setField(term84637, term84637.getClass(), "vetoableChangeSupport", term84666);
        setBooleanField(term84637, term84637.getClass(), "autoscrolls", false);
        setField(term84637, term84637.getClass(), "border", null);
        setIntField(term84637, term84637.getClass(), "flags", -1674430871);
        setField(term84637, term84637.getClass(), "inputVerifier", null);
        setBooleanField(term84637, term84637.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term84637, term84637.getClass(), "paintingChild", null);
        setField(term84637, term84637.getClass(), "popupMenu", null);
        setField(term84637, term84637.getClass(), "revalidateRunnableScheduled", null);
        setField(term84637, term84637.getClass(), "focusInputMap", null);
        setField(term84637, term84637.getClass(), "ancestorInputMap", null);
        setField(term84637, term84637.getClass(), "windowInputMap", null);
        setField(term84637, term84637.getClass(), "actionMap", null);
        setField(term84637, term84637.getClass(), "aaHint", null);
        setField(term84637, term84637.getClass(), "lcdRenderingHint", null);
        setField(term84637, term84637.getClass(), "component", null);
        setField(term84637, term84637.getClass(), "layoutMgr", null);
        setField(term84637, term84637.getClass(), "dispatcher", null);
        setField(term84637, term84637.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term84637, term84637.getClass(), "focusCycleRoot", false);
        setBooleanField(term84637, term84637.getClass(), "focusTraversalPolicyProvider", false);
        setField(term84637, term84637.getClass(), "printingThreads", null);
        setBooleanField(term84637, term84637.getClass(), "printing", false);
        setField(term84637, term84637.getClass(), "containerListener", null);
        setIntField(term84637, term84637.getClass(), "listeningChildren", 0);
        setIntField(term84637, term84637.getClass(), "listeningBoundsChildren", 0);
        setIntField(term84637, term84637.getClass(), "descendantsCount", 0);
        setField(term84637, term84637.getClass(), "preserveBackgroundColor", null);
        setIntField(term84637, term84637.getClass(), "numOfHWComponents", 0);
        setIntField(term84637, term84637.getClass(), "numOfLWComponents", 0);
        setField(term84637, term84637.getClass(), "modalComp", null);
        setField(term84637, term84637.getClass(), "modalAppContext", null);
        setIntField(term84637, term84637.getClass(), "containerSerializedDataVersion", 0);
        setField(term84637, term84637.getClass(), "peer", null);
        setField(term84637, term84637.getClass(), "parent", null);
        setField(term84637, term84637.getClass(), "appContext", null);
        setIntField(term84637, term84637.getClass(), "x", 0);
        setIntField(term84637, term84637.getClass(), "y", 0);
        setIntField(term84637, term84637.getClass(), "width", 0);
        setIntField(term84637, term84637.getClass(), "height", 0);
        setField(term84637, term84637.getClass(), "foreground", null);
        setField(term84637, term84637.getClass(), "background", null);
        setField(term84637, term84637.getClass(), "font", null);
        setField(term84637, term84637.getClass(), "peerFont", null);
        setField(term84637, term84637.getClass(), "cursor", null);
        setField(term84637, term84637.getClass(), "locale", null);
        setField(term84637, term84637.getClass(), "graphicsConfig", null);
        setField(term84637, term84637.getClass(), "bufferStrategy", null);
        setBooleanField(term84637, term84637.getClass(), "ignoreRepaint", false);
        setBooleanField(term84637, term84637.getClass(), "visible", false);
        setBooleanField(term84637, term84637.getClass(), "enabled", false);
        setBooleanField(term84637, term84637.getClass(), "valid", false);
        setField(term84637, term84637.getClass(), "dropTarget", null);
        setField(term84637, term84637.getClass(), "popups", null);
        setField(term84637, term84637.getClass(), "name", null);
        setBooleanField(term84637, term84637.getClass(), "nameExplicitlySet", false);
        setBooleanField(term84637, term84637.getClass(), "focusable", false);
        setIntField(term84637, term84637.getClass(), "isFocusTraversableOverridden", 0);
        setField(term84637, term84637.getClass(), "focusTraversalKeys", null);
        setBooleanField(term84637, term84637.getClass(), "focusTraversalKeysEnabled", false);
        setField(term84637, term84637.getClass(), "acc", null);
        setField(term84637, term84637.getClass(), "minSize", null);
        setBooleanField(term84637, term84637.getClass(), "minSizeSet", false);
        setField(term84637, term84637.getClass(), "prefSize", null);
        setBooleanField(term84637, term84637.getClass(), "prefSizeSet", false);
        setField(term84637, term84637.getClass(), "maxSize", null);
        setBooleanField(term84637, term84637.getClass(), "maxSizeSet", false);
        setField(term84637, term84637.getClass(), "componentOrientation", null);
        setBooleanField(term84637, term84637.getClass(), "newEventsOnly", false);
        setField(term84637, term84637.getClass(), "componentListener", null);
        setField(term84637, term84637.getClass(), "focusListener", null);
        setField(term84637, term84637.getClass(), "hierarchyListener", null);
        setField(term84637, term84637.getClass(), "hierarchyBoundsListener", null);
        setField(term84637, term84637.getClass(), "keyListener", null);
        setField(term84637, term84637.getClass(), "mouseListener", null);
        setField(term84637, term84637.getClass(), "mouseMotionListener", null);
        setField(term84637, term84637.getClass(), "mouseWheelListener", null);
        setField(term84637, term84637.getClass(), "inputMethodListener", null);
        setLongField(term84637, term84637.getClass(), "eventMask", 0L);
        setField(term84637, term84637.getClass(), "changeSupport", null);
        setField(term84637, term84637.getClass(), "objectLock", null);
        setBooleanField(term84637, term84637.getClass(), "isPacked", false);
        setIntField(term84637, term84637.getClass(), "boundsOp", 0);
        setField(term84637, term84637.getClass(), "compoundShape", null);
        setField(term84637, term84637.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term84637, term84637.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term84637, term84637.getClass(), "backgroundEraseDisabled", false);
        setField(term84637, term84637.getClass(), "eventCache", null);
        setBooleanField(term84637, term84637.getClass(), "coalescingEnabled", false);
        setBooleanField(term84637, term84637.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term84637, term84637.getClass(), "componentSerializedDataVersion", 0);
        setField(term84637, term84637.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vqnBkkxoIa";
        callMethod(klass, "setText", argTypes, term84637, args);
    }

};


