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

public class KComboBox_setPreferences_19557636725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10147;

    public KComboBox_setPreferences_19557636725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10148 = new HashMap();
        term10147 = newInstance(Class.forName("proto.KComboBox"));
        Object term10173 = newInstance(Class.forName("java.lang.Object"));
        Object term10181 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term10182 = (Object[]) newArray("java.lang.Object", 0);
        Object term10183 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term10184 = newInstance(Class.forName("java.lang.Object"));
        Object term10185 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term10186 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term10187 = newInstance(Class.forName("java.lang.Object"));
        setField(term10147, term10147.getClass(), "masks", term10148);
        setField(term10147, term10147.getClass(), "dataModel", null);
        setField(term10147, term10147.getClass(), "renderer", null);
        setField(term10147, term10147.getClass(), "editor", null);
        setIntField(term10147, term10147.getClass(), "maximumRowCount", -481533957);
        setBooleanField(term10147, term10147.getClass(), "isEditable", false);
        setField(term10147, term10147.getClass(), "keySelectionManager", null);
        setField(term10147, term10147.getClass(), "actionCommand", "OclPbYPkcH");
        setBooleanField(term10147, term10147.getClass(), "lightWeightPopupEnabled", false);
        setField(term10147, term10147.getClass(), "selectedItemReminder", term10173);
        setField(term10147, term10147.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term10147, term10147.getClass(), "firingActionEvent", true);
        setBooleanField(term10147, term10147.getClass(), "selectingItem", true);
        setBooleanField(term10147, term10147.getClass(), "updateInProgress", false);
        setField(term10147, term10147.getClass(), "action", null);
        setField(term10147, term10147.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term10147, term10147.getClass(), "isAlignmentXSet", true);
        setFloatField(term10147, term10147.getClass(), "alignmentX", 0.89057696F);
        setBooleanField(term10147, term10147.getClass(), "isAlignmentYSet", true);
        setFloatField(term10147, term10147.getClass(), "alignmentY", 0.7332741F);
        setField(term10147, term10147.getClass(), "ui", null);
        setField(term10181, term10181.getClass(), "listenerList", term10182);
        setField(term10147, term10147.getClass(), "listenerList", term10181);
        setField(term10183, term10183.getClass(), "table", term10184);
        setField(term10147, term10147.getClass(), "clientProperties", term10183);
        setField(term10186, term10186.getClass(), "map", null);
        setField(term10185, term10185.getClass(), "map", term10186);
        setField(term10185, term10185.getClass(), "source", term10187);
        setField(term10147, term10147.getClass(), "vetoableChangeSupport", term10185);
        setBooleanField(term10147, term10147.getClass(), "autoscrolls", true);
        setField(term10147, term10147.getClass(), "border", null);
        setIntField(term10147, term10147.getClass(), "flags", -1465035361);
        setField(term10147, term10147.getClass(), "inputVerifier", null);
        setBooleanField(term10147, term10147.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10147, term10147.getClass(), "paintingChild", null);
        setField(term10147, term10147.getClass(), "popupMenu", null);
        setField(term10147, term10147.getClass(), "revalidateRunnableScheduled", null);
        setField(term10147, term10147.getClass(), "focusInputMap", null);
        setField(term10147, term10147.getClass(), "ancestorInputMap", null);
        setField(term10147, term10147.getClass(), "windowInputMap", null);
        setField(term10147, term10147.getClass(), "actionMap", null);
        setField(term10147, term10147.getClass(), "aaHint", null);
        setField(term10147, term10147.getClass(), "lcdRenderingHint", null);
        setField(term10147, term10147.getClass(), "component", null);
        setField(term10147, term10147.getClass(), "layoutMgr", null);
        setField(term10147, term10147.getClass(), "dispatcher", null);
        setField(term10147, term10147.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10147, term10147.getClass(), "focusCycleRoot", false);
        setBooleanField(term10147, term10147.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10147, term10147.getClass(), "printingThreads", null);
        setBooleanField(term10147, term10147.getClass(), "printing", false);
        setField(term10147, term10147.getClass(), "containerListener", null);
        setIntField(term10147, term10147.getClass(), "listeningChildren", 0);
        setIntField(term10147, term10147.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10147, term10147.getClass(), "descendantsCount", 0);
        setField(term10147, term10147.getClass(), "preserveBackgroundColor", null);
        setIntField(term10147, term10147.getClass(), "numOfHWComponents", 0);
        setIntField(term10147, term10147.getClass(), "numOfLWComponents", 0);
        setField(term10147, term10147.getClass(), "modalComp", null);
        setField(term10147, term10147.getClass(), "modalAppContext", null);
        setIntField(term10147, term10147.getClass(), "containerSerializedDataVersion", 0);
        setField(term10147, term10147.getClass(), "peer", null);
        setField(term10147, term10147.getClass(), "parent", null);
        setField(term10147, term10147.getClass(), "appContext", null);
        setIntField(term10147, term10147.getClass(), "x", 0);
        setIntField(term10147, term10147.getClass(), "y", 0);
        setIntField(term10147, term10147.getClass(), "width", 0);
        setIntField(term10147, term10147.getClass(), "height", 0);
        setField(term10147, term10147.getClass(), "foreground", null);
        setField(term10147, term10147.getClass(), "background", null);
        setField(term10147, term10147.getClass(), "font", null);
        setField(term10147, term10147.getClass(), "peerFont", null);
        setField(term10147, term10147.getClass(), "cursor", null);
        setField(term10147, term10147.getClass(), "locale", null);
        setField(term10147, term10147.getClass(), "graphicsConfig", null);
        setField(term10147, term10147.getClass(), "bufferStrategy", null);
        setBooleanField(term10147, term10147.getClass(), "ignoreRepaint", false);
        setBooleanField(term10147, term10147.getClass(), "visible", false);
        setBooleanField(term10147, term10147.getClass(), "enabled", false);
        setBooleanField(term10147, term10147.getClass(), "valid", false);
        setField(term10147, term10147.getClass(), "dropTarget", null);
        setField(term10147, term10147.getClass(), "popups", null);
        setField(term10147, term10147.getClass(), "name", null);
        setBooleanField(term10147, term10147.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10147, term10147.getClass(), "focusable", false);
        setIntField(term10147, term10147.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10147, term10147.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10147, term10147.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10147, term10147.getClass(), "acc", null);
        setField(term10147, term10147.getClass(), "minSize", null);
        setBooleanField(term10147, term10147.getClass(), "minSizeSet", false);
        setField(term10147, term10147.getClass(), "prefSize", null);
        setBooleanField(term10147, term10147.getClass(), "prefSizeSet", false);
        setField(term10147, term10147.getClass(), "maxSize", null);
        setBooleanField(term10147, term10147.getClass(), "maxSizeSet", false);
        setField(term10147, term10147.getClass(), "componentOrientation", null);
        setBooleanField(term10147, term10147.getClass(), "newEventsOnly", false);
        setField(term10147, term10147.getClass(), "componentListener", null);
        setField(term10147, term10147.getClass(), "focusListener", null);
        setField(term10147, term10147.getClass(), "hierarchyListener", null);
        setField(term10147, term10147.getClass(), "hierarchyBoundsListener", null);
        setField(term10147, term10147.getClass(), "keyListener", null);
        setField(term10147, term10147.getClass(), "mouseListener", null);
        setField(term10147, term10147.getClass(), "mouseMotionListener", null);
        setField(term10147, term10147.getClass(), "mouseWheelListener", null);
        setField(term10147, term10147.getClass(), "inputMethodListener", null);
        setLongField(term10147, term10147.getClass(), "eventMask", 0L);
        setField(term10147, term10147.getClass(), "changeSupport", null);
        setField(term10147, term10147.getClass(), "objectLock", null);
        setBooleanField(term10147, term10147.getClass(), "isPacked", false);
        setIntField(term10147, term10147.getClass(), "boundsOp", 0);
        setField(term10147, term10147.getClass(), "compoundShape", null);
        setField(term10147, term10147.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10147, term10147.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10147, term10147.getClass(), "backgroundEraseDisabled", false);
        setField(term10147, term10147.getClass(), "eventCache", null);
        setBooleanField(term10147, term10147.getClass(), "coalescingEnabled", false);
        setBooleanField(term10147, term10147.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10147, term10147.getClass(), "componentSerializedDataVersion", 0);
        setField(term10147, term10147.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term10147, args);
    }

};


