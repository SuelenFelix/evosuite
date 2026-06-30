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
     Object term80663;

    public ModuleAnalysis_4_setText_15832438601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80663 = newInstance(Class.forName("core.module.ModuleAnalysis$4"));
        Object term80688 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term80689 = (Object[]) newArray("java.lang.Object", 0);
        Object term80690 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term80691 = newInstance(Class.forName("java.lang.Object"));
        Object term80692 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term80693 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term80694 = newInstance(Class.forName("java.lang.Object"));
        setField(term80663, term80663.getClass(), "this$0", null);
        setIntField(term80663, term80663.getClass(), "mnemonic", 514511037);
        setIntField(term80663, term80663.getClass(), "mnemonicIndex", 1713573821);
        setField(term80663, term80663.getClass(), "text", "ktbqerIaKW");
        setField(term80663, term80663.getClass(), "defaultIcon", null);
        setField(term80663, term80663.getClass(), "disabledIcon", null);
        setBooleanField(term80663, term80663.getClass(), "disabledIconSet", false);
        setIntField(term80663, term80663.getClass(), "verticalAlignment", 1956590498);
        setIntField(term80663, term80663.getClass(), "horizontalAlignment", 1467356494);
        setIntField(term80663, term80663.getClass(), "verticalTextPosition", -26316536);
        setIntField(term80663, term80663.getClass(), "horizontalTextPosition", 1716165145);
        setIntField(term80663, term80663.getClass(), "iconTextGap", 1692937831);
        setField(term80663, term80663.getClass(), "labelFor", null);
        setBooleanField(term80663, term80663.getClass(), "isAlignmentXSet", true);
        setFloatField(term80663, term80663.getClass(), "alignmentX", 0.7059082F);
        setBooleanField(term80663, term80663.getClass(), "isAlignmentYSet", true);
        setFloatField(term80663, term80663.getClass(), "alignmentY", 0.791695F);
        setField(term80663, term80663.getClass(), "ui", null);
        setField(term80688, term80688.getClass(), "listenerList", term80689);
        setField(term80663, term80663.getClass(), "listenerList", term80688);
        setField(term80690, term80690.getClass(), "table", term80691);
        setField(term80663, term80663.getClass(), "clientProperties", term80690);
        setField(term80693, term80693.getClass(), "map", null);
        setField(term80692, term80692.getClass(), "map", term80693);
        setField(term80692, term80692.getClass(), "source", term80694);
        setField(term80663, term80663.getClass(), "vetoableChangeSupport", term80692);
        setBooleanField(term80663, term80663.getClass(), "autoscrolls", false);
        setField(term80663, term80663.getClass(), "border", null);
        setIntField(term80663, term80663.getClass(), "flags", -1982489643);
        setField(term80663, term80663.getClass(), "inputVerifier", null);
        setBooleanField(term80663, term80663.getClass(), "verifyInputWhenFocusTarget", true);
        setField(term80663, term80663.getClass(), "paintingChild", null);
        setField(term80663, term80663.getClass(), "popupMenu", null);
        setField(term80663, term80663.getClass(), "revalidateRunnableScheduled", null);
        setField(term80663, term80663.getClass(), "focusInputMap", null);
        setField(term80663, term80663.getClass(), "ancestorInputMap", null);
        setField(term80663, term80663.getClass(), "windowInputMap", null);
        setField(term80663, term80663.getClass(), "actionMap", null);
        setField(term80663, term80663.getClass(), "aaHint", null);
        setField(term80663, term80663.getClass(), "lcdRenderingHint", null);
        setField(term80663, term80663.getClass(), "component", null);
        setField(term80663, term80663.getClass(), "layoutMgr", null);
        setField(term80663, term80663.getClass(), "dispatcher", null);
        setField(term80663, term80663.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80663, term80663.getClass(), "focusCycleRoot", false);
        setBooleanField(term80663, term80663.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80663, term80663.getClass(), "printingThreads", null);
        setBooleanField(term80663, term80663.getClass(), "printing", false);
        setField(term80663, term80663.getClass(), "containerListener", null);
        setIntField(term80663, term80663.getClass(), "listeningChildren", 0);
        setIntField(term80663, term80663.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80663, term80663.getClass(), "descendantsCount", 0);
        setField(term80663, term80663.getClass(), "preserveBackgroundColor", null);
        setIntField(term80663, term80663.getClass(), "numOfHWComponents", 0);
        setIntField(term80663, term80663.getClass(), "numOfLWComponents", 0);
        setField(term80663, term80663.getClass(), "modalComp", null);
        setField(term80663, term80663.getClass(), "modalAppContext", null);
        setIntField(term80663, term80663.getClass(), "containerSerializedDataVersion", 0);
        setField(term80663, term80663.getClass(), "peer", null);
        setField(term80663, term80663.getClass(), "parent", null);
        setField(term80663, term80663.getClass(), "appContext", null);
        setIntField(term80663, term80663.getClass(), "x", 0);
        setIntField(term80663, term80663.getClass(), "y", 0);
        setIntField(term80663, term80663.getClass(), "width", 0);
        setIntField(term80663, term80663.getClass(), "height", 0);
        setField(term80663, term80663.getClass(), "foreground", null);
        setField(term80663, term80663.getClass(), "background", null);
        setField(term80663, term80663.getClass(), "font", null);
        setField(term80663, term80663.getClass(), "peerFont", null);
        setField(term80663, term80663.getClass(), "cursor", null);
        setField(term80663, term80663.getClass(), "locale", null);
        setField(term80663, term80663.getClass(), "graphicsConfig", null);
        setField(term80663, term80663.getClass(), "bufferStrategy", null);
        setBooleanField(term80663, term80663.getClass(), "ignoreRepaint", false);
        setBooleanField(term80663, term80663.getClass(), "visible", false);
        setBooleanField(term80663, term80663.getClass(), "enabled", false);
        setBooleanField(term80663, term80663.getClass(), "valid", false);
        setField(term80663, term80663.getClass(), "dropTarget", null);
        setField(term80663, term80663.getClass(), "popups", null);
        setField(term80663, term80663.getClass(), "name", null);
        setBooleanField(term80663, term80663.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80663, term80663.getClass(), "focusable", false);
        setIntField(term80663, term80663.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80663, term80663.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80663, term80663.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80663, term80663.getClass(), "acc", null);
        setField(term80663, term80663.getClass(), "minSize", null);
        setBooleanField(term80663, term80663.getClass(), "minSizeSet", false);
        setField(term80663, term80663.getClass(), "prefSize", null);
        setBooleanField(term80663, term80663.getClass(), "prefSizeSet", false);
        setField(term80663, term80663.getClass(), "maxSize", null);
        setBooleanField(term80663, term80663.getClass(), "maxSizeSet", false);
        setField(term80663, term80663.getClass(), "componentOrientation", null);
        setBooleanField(term80663, term80663.getClass(), "newEventsOnly", false);
        setField(term80663, term80663.getClass(), "componentListener", null);
        setField(term80663, term80663.getClass(), "focusListener", null);
        setField(term80663, term80663.getClass(), "hierarchyListener", null);
        setField(term80663, term80663.getClass(), "hierarchyBoundsListener", null);
        setField(term80663, term80663.getClass(), "keyListener", null);
        setField(term80663, term80663.getClass(), "mouseListener", null);
        setField(term80663, term80663.getClass(), "mouseMotionListener", null);
        setField(term80663, term80663.getClass(), "mouseWheelListener", null);
        setField(term80663, term80663.getClass(), "inputMethodListener", null);
        setLongField(term80663, term80663.getClass(), "eventMask", 0L);
        setField(term80663, term80663.getClass(), "changeSupport", null);
        setField(term80663, term80663.getClass(), "objectLock", null);
        setBooleanField(term80663, term80663.getClass(), "isPacked", false);
        setIntField(term80663, term80663.getClass(), "boundsOp", 0);
        setField(term80663, term80663.getClass(), "compoundShape", null);
        setField(term80663, term80663.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80663, term80663.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80663, term80663.getClass(), "backgroundEraseDisabled", false);
        setField(term80663, term80663.getClass(), "eventCache", null);
        setBooleanField(term80663, term80663.getClass(), "coalescingEnabled", false);
        setBooleanField(term80663, term80663.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80663, term80663.getClass(), "componentSerializedDataVersion", 0);
        setField(term80663, term80663.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$4");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GbahCBMvct";
        callMethod(klass, "setText", argTypes, term80663, args);
    }

};


