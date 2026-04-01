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
     Object term295297;

    public ModuleAnalysis_2_setText_15832437981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295297 = newInstance(Class.forName("core.module.ModuleAnalysis$2"));
        Object term295322 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term295323 = (Object[]) newArray("java.lang.Object", 0);
        Object term295324 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term295325 = newInstance(Class.forName("java.lang.Object"));
        Object term295326 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term295327 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term295328 = newInstance(Class.forName("java.lang.Object"));
        setField(term295297, term295297.getClass(), "this$0", null);
        setIntField(term295297, term295297.getClass(), "mnemonic", 1631564781);
        setIntField(term295297, term295297.getClass(), "mnemonicIndex", -3085808);
        setField(term295297, term295297.getClass(), "text", "FBYRIDZvmW");
        setField(term295297, term295297.getClass(), "defaultIcon", null);
        setField(term295297, term295297.getClass(), "disabledIcon", null);
        setBooleanField(term295297, term295297.getClass(), "disabledIconSet", true);
        setIntField(term295297, term295297.getClass(), "verticalAlignment", 1975783377);
        setIntField(term295297, term295297.getClass(), "horizontalAlignment", -665938382);
        setIntField(term295297, term295297.getClass(), "verticalTextPosition", 325391588);
        setIntField(term295297, term295297.getClass(), "horizontalTextPosition", 1443046313);
        setIntField(term295297, term295297.getClass(), "iconTextGap", 1055117337);
        setField(term295297, term295297.getClass(), "labelFor", null);
        setBooleanField(term295297, term295297.getClass(), "isAlignmentXSet", false);
        setFloatField(term295297, term295297.getClass(), "alignmentX", 0.54856896F);
        setBooleanField(term295297, term295297.getClass(), "isAlignmentYSet", true);
        setFloatField(term295297, term295297.getClass(), "alignmentY", 0.6206213F);
        setField(term295297, term295297.getClass(), "ui", null);
        setField(term295322, term295322.getClass(), "listenerList", term295323);
        setField(term295297, term295297.getClass(), "listenerList", term295322);
        setField(term295324, term295324.getClass(), "table", term295325);
        setField(term295297, term295297.getClass(), "clientProperties", term295324);
        setField(term295327, term295327.getClass(), "map", null);
        setField(term295326, term295326.getClass(), "map", term295327);
        setField(term295326, term295326.getClass(), "source", term295328);
        setField(term295297, term295297.getClass(), "vetoableChangeSupport", term295326);
        setBooleanField(term295297, term295297.getClass(), "autoscrolls", false);
        setField(term295297, term295297.getClass(), "border", null);
        setIntField(term295297, term295297.getClass(), "flags", 1057965724);
        setField(term295297, term295297.getClass(), "inputVerifier", null);
        setBooleanField(term295297, term295297.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term295297, term295297.getClass(), "paintingChild", null);
        setField(term295297, term295297.getClass(), "popupMenu", null);
        setField(term295297, term295297.getClass(), "revalidateRunnableScheduled", null);
        setField(term295297, term295297.getClass(), "focusInputMap", null);
        setField(term295297, term295297.getClass(), "ancestorInputMap", null);
        setField(term295297, term295297.getClass(), "windowInputMap", null);
        setField(term295297, term295297.getClass(), "actionMap", null);
        setField(term295297, term295297.getClass(), "aaHint", null);
        setField(term295297, term295297.getClass(), "lcdRenderingHint", null);
        setField(term295297, term295297.getClass(), "component", null);
        setField(term295297, term295297.getClass(), "layoutMgr", null);
        setField(term295297, term295297.getClass(), "dispatcher", null);
        setField(term295297, term295297.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term295297, term295297.getClass(), "focusCycleRoot", false);
        setBooleanField(term295297, term295297.getClass(), "focusTraversalPolicyProvider", false);
        setField(term295297, term295297.getClass(), "printingThreads", null);
        setBooleanField(term295297, term295297.getClass(), "printing", false);
        setField(term295297, term295297.getClass(), "containerListener", null);
        setIntField(term295297, term295297.getClass(), "listeningChildren", 0);
        setIntField(term295297, term295297.getClass(), "listeningBoundsChildren", 0);
        setIntField(term295297, term295297.getClass(), "descendantsCount", 0);
        setField(term295297, term295297.getClass(), "preserveBackgroundColor", null);
        setIntField(term295297, term295297.getClass(), "numOfHWComponents", 0);
        setIntField(term295297, term295297.getClass(), "numOfLWComponents", 0);
        setField(term295297, term295297.getClass(), "modalComp", null);
        setField(term295297, term295297.getClass(), "modalAppContext", null);
        setIntField(term295297, term295297.getClass(), "containerSerializedDataVersion", 0);
        setField(term295297, term295297.getClass(), "peer", null);
        setField(term295297, term295297.getClass(), "parent", null);
        setField(term295297, term295297.getClass(), "appContext", null);
        setIntField(term295297, term295297.getClass(), "x", 0);
        setIntField(term295297, term295297.getClass(), "y", 0);
        setIntField(term295297, term295297.getClass(), "width", 0);
        setIntField(term295297, term295297.getClass(), "height", 0);
        setField(term295297, term295297.getClass(), "foreground", null);
        setField(term295297, term295297.getClass(), "background", null);
        setField(term295297, term295297.getClass(), "font", null);
        setField(term295297, term295297.getClass(), "peerFont", null);
        setField(term295297, term295297.getClass(), "cursor", null);
        setField(term295297, term295297.getClass(), "locale", null);
        setField(term295297, term295297.getClass(), "graphicsConfig", null);
        setField(term295297, term295297.getClass(), "bufferStrategy", null);
        setBooleanField(term295297, term295297.getClass(), "ignoreRepaint", false);
        setBooleanField(term295297, term295297.getClass(), "visible", false);
        setBooleanField(term295297, term295297.getClass(), "enabled", false);
        setBooleanField(term295297, term295297.getClass(), "valid", false);
        setField(term295297, term295297.getClass(), "dropTarget", null);
        setField(term295297, term295297.getClass(), "popups", null);
        setField(term295297, term295297.getClass(), "name", null);
        setBooleanField(term295297, term295297.getClass(), "nameExplicitlySet", false);
        setBooleanField(term295297, term295297.getClass(), "focusable", false);
        setIntField(term295297, term295297.getClass(), "isFocusTraversableOverridden", 0);
        setField(term295297, term295297.getClass(), "focusTraversalKeys", null);
        setBooleanField(term295297, term295297.getClass(), "focusTraversalKeysEnabled", false);
        setField(term295297, term295297.getClass(), "acc", null);
        setField(term295297, term295297.getClass(), "minSize", null);
        setBooleanField(term295297, term295297.getClass(), "minSizeSet", false);
        setField(term295297, term295297.getClass(), "prefSize", null);
        setBooleanField(term295297, term295297.getClass(), "prefSizeSet", false);
        setField(term295297, term295297.getClass(), "maxSize", null);
        setBooleanField(term295297, term295297.getClass(), "maxSizeSet", false);
        setField(term295297, term295297.getClass(), "componentOrientation", null);
        setBooleanField(term295297, term295297.getClass(), "newEventsOnly", false);
        setField(term295297, term295297.getClass(), "componentListener", null);
        setField(term295297, term295297.getClass(), "focusListener", null);
        setField(term295297, term295297.getClass(), "hierarchyListener", null);
        setField(term295297, term295297.getClass(), "hierarchyBoundsListener", null);
        setField(term295297, term295297.getClass(), "keyListener", null);
        setField(term295297, term295297.getClass(), "mouseListener", null);
        setField(term295297, term295297.getClass(), "mouseMotionListener", null);
        setField(term295297, term295297.getClass(), "mouseWheelListener", null);
        setField(term295297, term295297.getClass(), "inputMethodListener", null);
        setLongField(term295297, term295297.getClass(), "eventMask", 0L);
        setField(term295297, term295297.getClass(), "changeSupport", null);
        setField(term295297, term295297.getClass(), "objectLock", null);
        setBooleanField(term295297, term295297.getClass(), "isPacked", false);
        setIntField(term295297, term295297.getClass(), "boundsOp", 0);
        setField(term295297, term295297.getClass(), "compoundShape", null);
        setField(term295297, term295297.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term295297, term295297.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term295297, term295297.getClass(), "backgroundEraseDisabled", false);
        setField(term295297, term295297.getClass(), "eventCache", null);
        setBooleanField(term295297, term295297.getClass(), "coalescingEnabled", false);
        setBooleanField(term295297, term295297.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term295297, term295297.getClass(), "componentSerializedDataVersion", 0);
        setField(term295297, term295297.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BRMTHqqoRg";
        callMethod(klass, "setText", argTypes, term295297, args);
    }

};


