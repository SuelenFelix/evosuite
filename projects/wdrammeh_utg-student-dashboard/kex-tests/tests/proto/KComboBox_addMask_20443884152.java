package proto;

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
import static proto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class KComboBox_addMask_20443884152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9884;
     Object term9961;
     Object term9962;

    public KComboBox_addMask_20443884152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9885 = new HashMap();
        term9884 = newInstance(Class.forName("proto.KComboBox"));
        Object term9910 = newInstance(Class.forName("java.lang.Object"));
        Object term9918 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term9919 = (Object[]) newArray("java.lang.Object", 0);
        Object term9920 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term9921 = newInstance(Class.forName("java.lang.Object"));
        Object term9922 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term9923 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term9924 = newInstance(Class.forName("java.lang.Object"));
        setField(term9884, term9884.getClass(), "masks", term9885);
        setField(term9884, term9884.getClass(), "dataModel", null);
        setField(term9884, term9884.getClass(), "renderer", null);
        setField(term9884, term9884.getClass(), "editor", null);
        setIntField(term9884, term9884.getClass(), "maximumRowCount", 292681826);
        setBooleanField(term9884, term9884.getClass(), "isEditable", true);
        setField(term9884, term9884.getClass(), "keySelectionManager", null);
        setField(term9884, term9884.getClass(), "actionCommand", "RkybSrpybU");
        setBooleanField(term9884, term9884.getClass(), "lightWeightPopupEnabled", true);
        setField(term9884, term9884.getClass(), "selectedItemReminder", term9910);
        setField(term9884, term9884.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term9884, term9884.getClass(), "firingActionEvent", false);
        setBooleanField(term9884, term9884.getClass(), "selectingItem", true);
        setBooleanField(term9884, term9884.getClass(), "updateInProgress", false);
        setField(term9884, term9884.getClass(), "action", null);
        setField(term9884, term9884.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term9884, term9884.getClass(), "isAlignmentXSet", true);
        setFloatField(term9884, term9884.getClass(), "alignmentX", 0.7254646F);
        setBooleanField(term9884, term9884.getClass(), "isAlignmentYSet", true);
        setFloatField(term9884, term9884.getClass(), "alignmentY", 0.9828442F);
        setField(term9884, term9884.getClass(), "ui", null);
        setField(term9918, term9918.getClass(), "listenerList", term9919);
        setField(term9884, term9884.getClass(), "listenerList", term9918);
        setField(term9920, term9920.getClass(), "table", term9921);
        setField(term9884, term9884.getClass(), "clientProperties", term9920);
        setField(term9923, term9923.getClass(), "map", null);
        setField(term9922, term9922.getClass(), "map", term9923);
        setField(term9922, term9922.getClass(), "source", term9924);
        setField(term9884, term9884.getClass(), "vetoableChangeSupport", term9922);
        setBooleanField(term9884, term9884.getClass(), "autoscrolls", true);
        setField(term9884, term9884.getClass(), "border", null);
        setIntField(term9884, term9884.getClass(), "flags", 1551099402);
        setField(term9884, term9884.getClass(), "inputVerifier", null);
        setBooleanField(term9884, term9884.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9884, term9884.getClass(), "paintingChild", null);
        setField(term9884, term9884.getClass(), "popupMenu", null);
        setField(term9884, term9884.getClass(), "revalidateRunnableScheduled", null);
        setField(term9884, term9884.getClass(), "focusInputMap", null);
        setField(term9884, term9884.getClass(), "ancestorInputMap", null);
        setField(term9884, term9884.getClass(), "windowInputMap", null);
        setField(term9884, term9884.getClass(), "actionMap", null);
        setField(term9884, term9884.getClass(), "aaHint", null);
        setField(term9884, term9884.getClass(), "lcdRenderingHint", null);
        setField(term9884, term9884.getClass(), "component", null);
        setField(term9884, term9884.getClass(), "layoutMgr", null);
        setField(term9884, term9884.getClass(), "dispatcher", null);
        setField(term9884, term9884.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9884, term9884.getClass(), "focusCycleRoot", false);
        setBooleanField(term9884, term9884.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9884, term9884.getClass(), "printingThreads", null);
        setBooleanField(term9884, term9884.getClass(), "printing", false);
        setField(term9884, term9884.getClass(), "containerListener", null);
        setIntField(term9884, term9884.getClass(), "listeningChildren", 0);
        setIntField(term9884, term9884.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9884, term9884.getClass(), "descendantsCount", 0);
        setField(term9884, term9884.getClass(), "preserveBackgroundColor", null);
        setIntField(term9884, term9884.getClass(), "numOfHWComponents", 0);
        setIntField(term9884, term9884.getClass(), "numOfLWComponents", 0);
        setField(term9884, term9884.getClass(), "modalComp", null);
        setField(term9884, term9884.getClass(), "modalAppContext", null);
        setIntField(term9884, term9884.getClass(), "containerSerializedDataVersion", 0);
        setField(term9884, term9884.getClass(), "peer", null);
        setField(term9884, term9884.getClass(), "parent", null);
        setField(term9884, term9884.getClass(), "appContext", null);
        setIntField(term9884, term9884.getClass(), "x", 0);
        setIntField(term9884, term9884.getClass(), "y", 0);
        setIntField(term9884, term9884.getClass(), "width", 0);
        setIntField(term9884, term9884.getClass(), "height", 0);
        setField(term9884, term9884.getClass(), "foreground", null);
        setField(term9884, term9884.getClass(), "background", null);
        setField(term9884, term9884.getClass(), "font", null);
        setField(term9884, term9884.getClass(), "peerFont", null);
        setField(term9884, term9884.getClass(), "cursor", null);
        setField(term9884, term9884.getClass(), "locale", null);
        setField(term9884, term9884.getClass(), "graphicsConfig", null);
        setField(term9884, term9884.getClass(), "bufferStrategy", null);
        setBooleanField(term9884, term9884.getClass(), "ignoreRepaint", false);
        setBooleanField(term9884, term9884.getClass(), "visible", false);
        setBooleanField(term9884, term9884.getClass(), "enabled", false);
        setBooleanField(term9884, term9884.getClass(), "valid", false);
        setField(term9884, term9884.getClass(), "dropTarget", null);
        setField(term9884, term9884.getClass(), "popups", null);
        setField(term9884, term9884.getClass(), "name", null);
        setBooleanField(term9884, term9884.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9884, term9884.getClass(), "focusable", false);
        setIntField(term9884, term9884.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9884, term9884.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9884, term9884.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9884, term9884.getClass(), "acc", null);
        setField(term9884, term9884.getClass(), "minSize", null);
        setBooleanField(term9884, term9884.getClass(), "minSizeSet", false);
        setField(term9884, term9884.getClass(), "prefSize", null);
        setBooleanField(term9884, term9884.getClass(), "prefSizeSet", false);
        setField(term9884, term9884.getClass(), "maxSize", null);
        setBooleanField(term9884, term9884.getClass(), "maxSizeSet", false);
        setField(term9884, term9884.getClass(), "componentOrientation", null);
        setBooleanField(term9884, term9884.getClass(), "newEventsOnly", false);
        setField(term9884, term9884.getClass(), "componentListener", null);
        setField(term9884, term9884.getClass(), "focusListener", null);
        setField(term9884, term9884.getClass(), "hierarchyListener", null);
        setField(term9884, term9884.getClass(), "hierarchyBoundsListener", null);
        setField(term9884, term9884.getClass(), "keyListener", null);
        setField(term9884, term9884.getClass(), "mouseListener", null);
        setField(term9884, term9884.getClass(), "mouseMotionListener", null);
        setField(term9884, term9884.getClass(), "mouseWheelListener", null);
        setField(term9884, term9884.getClass(), "inputMethodListener", null);
        setLongField(term9884, term9884.getClass(), "eventMask", 0L);
        setField(term9884, term9884.getClass(), "changeSupport", null);
        setField(term9884, term9884.getClass(), "objectLock", null);
        setBooleanField(term9884, term9884.getClass(), "isPacked", false);
        setIntField(term9884, term9884.getClass(), "boundsOp", 0);
        setField(term9884, term9884.getClass(), "compoundShape", null);
        setField(term9884, term9884.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9884, term9884.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9884, term9884.getClass(), "backgroundEraseDisabled", false);
        setField(term9884, term9884.getClass(), "eventCache", null);
        setBooleanField(term9884, term9884.getClass(), "coalescingEnabled", false);
        setBooleanField(term9884, term9884.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9884, term9884.getClass(), "componentSerializedDataVersion", 0);
        setField(term9884, term9884.getClass(), "accessibleContext", null);
        term9961 = newInstance(Class.forName("java.lang.Object"));
        term9962 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term9961;
        args[1] = term9962;
        callMethod(klass, "addMask", argTypes, term9884, args);
    }

};


