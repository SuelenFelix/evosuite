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
     Object term9883;
     Object term9960;
     Object term9961;

    public KComboBox_addMask_20443884152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9884 = new HashMap();
        term9883 = newInstance(Class.forName("proto.KComboBox"));
        Object term9909 = newInstance(Class.forName("java.lang.Object"));
        Object term9917 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term9918 = (Object[]) newArray("java.lang.Object", 0);
        Object term9919 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term9920 = newInstance(Class.forName("java.lang.Object"));
        Object term9921 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term9922 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term9923 = newInstance(Class.forName("java.lang.Object"));
        setField(term9883, term9883.getClass(), "masks", term9884);
        setField(term9883, term9883.getClass(), "dataModel", null);
        setField(term9883, term9883.getClass(), "renderer", null);
        setField(term9883, term9883.getClass(), "editor", null);
        setIntField(term9883, term9883.getClass(), "maximumRowCount", 292681826);
        setBooleanField(term9883, term9883.getClass(), "isEditable", true);
        setField(term9883, term9883.getClass(), "keySelectionManager", null);
        setField(term9883, term9883.getClass(), "actionCommand", "RkybSrpybU");
        setBooleanField(term9883, term9883.getClass(), "lightWeightPopupEnabled", true);
        setField(term9883, term9883.getClass(), "selectedItemReminder", term9909);
        setField(term9883, term9883.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term9883, term9883.getClass(), "firingActionEvent", false);
        setBooleanField(term9883, term9883.getClass(), "selectingItem", true);
        setBooleanField(term9883, term9883.getClass(), "updateInProgress", false);
        setField(term9883, term9883.getClass(), "action", null);
        setField(term9883, term9883.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term9883, term9883.getClass(), "isAlignmentXSet", true);
        setFloatField(term9883, term9883.getClass(), "alignmentX", 0.7254646F);
        setBooleanField(term9883, term9883.getClass(), "isAlignmentYSet", true);
        setFloatField(term9883, term9883.getClass(), "alignmentY", 0.9828442F);
        setField(term9883, term9883.getClass(), "ui", null);
        setField(term9917, term9917.getClass(), "listenerList", term9918);
        setField(term9883, term9883.getClass(), "listenerList", term9917);
        setField(term9919, term9919.getClass(), "table", term9920);
        setField(term9883, term9883.getClass(), "clientProperties", term9919);
        setField(term9922, term9922.getClass(), "map", null);
        setField(term9921, term9921.getClass(), "map", term9922);
        setField(term9921, term9921.getClass(), "source", term9923);
        setField(term9883, term9883.getClass(), "vetoableChangeSupport", term9921);
        setBooleanField(term9883, term9883.getClass(), "autoscrolls", true);
        setField(term9883, term9883.getClass(), "border", null);
        setIntField(term9883, term9883.getClass(), "flags", 1551099402);
        setField(term9883, term9883.getClass(), "inputVerifier", null);
        setBooleanField(term9883, term9883.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9883, term9883.getClass(), "paintingChild", null);
        setField(term9883, term9883.getClass(), "popupMenu", null);
        setField(term9883, term9883.getClass(), "revalidateRunnableScheduled", null);
        setField(term9883, term9883.getClass(), "focusInputMap", null);
        setField(term9883, term9883.getClass(), "ancestorInputMap", null);
        setField(term9883, term9883.getClass(), "windowInputMap", null);
        setField(term9883, term9883.getClass(), "actionMap", null);
        setField(term9883, term9883.getClass(), "aaHint", null);
        setField(term9883, term9883.getClass(), "lcdRenderingHint", null);
        setField(term9883, term9883.getClass(), "component", null);
        setField(term9883, term9883.getClass(), "layoutMgr", null);
        setField(term9883, term9883.getClass(), "dispatcher", null);
        setField(term9883, term9883.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9883, term9883.getClass(), "focusCycleRoot", false);
        setBooleanField(term9883, term9883.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9883, term9883.getClass(), "printingThreads", null);
        setBooleanField(term9883, term9883.getClass(), "printing", false);
        setField(term9883, term9883.getClass(), "containerListener", null);
        setIntField(term9883, term9883.getClass(), "listeningChildren", 0);
        setIntField(term9883, term9883.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9883, term9883.getClass(), "descendantsCount", 0);
        setField(term9883, term9883.getClass(), "preserveBackgroundColor", null);
        setIntField(term9883, term9883.getClass(), "numOfHWComponents", 0);
        setIntField(term9883, term9883.getClass(), "numOfLWComponents", 0);
        setField(term9883, term9883.getClass(), "modalComp", null);
        setField(term9883, term9883.getClass(), "modalAppContext", null);
        setIntField(term9883, term9883.getClass(), "containerSerializedDataVersion", 0);
        setField(term9883, term9883.getClass(), "peer", null);
        setField(term9883, term9883.getClass(), "parent", null);
        setField(term9883, term9883.getClass(), "appContext", null);
        setIntField(term9883, term9883.getClass(), "x", 0);
        setIntField(term9883, term9883.getClass(), "y", 0);
        setIntField(term9883, term9883.getClass(), "width", 0);
        setIntField(term9883, term9883.getClass(), "height", 0);
        setField(term9883, term9883.getClass(), "foreground", null);
        setField(term9883, term9883.getClass(), "background", null);
        setField(term9883, term9883.getClass(), "font", null);
        setField(term9883, term9883.getClass(), "peerFont", null);
        setField(term9883, term9883.getClass(), "cursor", null);
        setField(term9883, term9883.getClass(), "locale", null);
        setField(term9883, term9883.getClass(), "graphicsConfig", null);
        setField(term9883, term9883.getClass(), "bufferStrategy", null);
        setBooleanField(term9883, term9883.getClass(), "ignoreRepaint", false);
        setBooleanField(term9883, term9883.getClass(), "visible", false);
        setBooleanField(term9883, term9883.getClass(), "enabled", false);
        setBooleanField(term9883, term9883.getClass(), "valid", false);
        setField(term9883, term9883.getClass(), "dropTarget", null);
        setField(term9883, term9883.getClass(), "popups", null);
        setField(term9883, term9883.getClass(), "name", null);
        setBooleanField(term9883, term9883.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9883, term9883.getClass(), "focusable", false);
        setIntField(term9883, term9883.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9883, term9883.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9883, term9883.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9883, term9883.getClass(), "acc", null);
        setField(term9883, term9883.getClass(), "minSize", null);
        setBooleanField(term9883, term9883.getClass(), "minSizeSet", false);
        setField(term9883, term9883.getClass(), "prefSize", null);
        setBooleanField(term9883, term9883.getClass(), "prefSizeSet", false);
        setField(term9883, term9883.getClass(), "maxSize", null);
        setBooleanField(term9883, term9883.getClass(), "maxSizeSet", false);
        setField(term9883, term9883.getClass(), "componentOrientation", null);
        setBooleanField(term9883, term9883.getClass(), "newEventsOnly", false);
        setField(term9883, term9883.getClass(), "componentListener", null);
        setField(term9883, term9883.getClass(), "focusListener", null);
        setField(term9883, term9883.getClass(), "hierarchyListener", null);
        setField(term9883, term9883.getClass(), "hierarchyBoundsListener", null);
        setField(term9883, term9883.getClass(), "keyListener", null);
        setField(term9883, term9883.getClass(), "mouseListener", null);
        setField(term9883, term9883.getClass(), "mouseMotionListener", null);
        setField(term9883, term9883.getClass(), "mouseWheelListener", null);
        setField(term9883, term9883.getClass(), "inputMethodListener", null);
        setLongField(term9883, term9883.getClass(), "eventMask", 0L);
        setField(term9883, term9883.getClass(), "changeSupport", null);
        setField(term9883, term9883.getClass(), "objectLock", null);
        setBooleanField(term9883, term9883.getClass(), "isPacked", false);
        setIntField(term9883, term9883.getClass(), "boundsOp", 0);
        setField(term9883, term9883.getClass(), "compoundShape", null);
        setField(term9883, term9883.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9883, term9883.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9883, term9883.getClass(), "backgroundEraseDisabled", false);
        setField(term9883, term9883.getClass(), "eventCache", null);
        setBooleanField(term9883, term9883.getClass(), "coalescingEnabled", false);
        setBooleanField(term9883, term9883.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9883, term9883.getClass(), "componentSerializedDataVersion", 0);
        setField(term9883, term9883.getClass(), "accessibleContext", null);
        term9960 = newInstance(Class.forName("java.lang.Object"));
        term9961 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term9960;
        args[1] = term9961;
        callMethod(klass, "addMask", argTypes, term9883, args);
    }

};


