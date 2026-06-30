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
     Object term10146;

    public KComboBox_setPreferences_19557636725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10147 = new HashMap();
        term10146 = newInstance(Class.forName("proto.KComboBox"));
        Object term10172 = newInstance(Class.forName("java.lang.Object"));
        Object term10180 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term10181 = (Object[]) newArray("java.lang.Object", 0);
        Object term10182 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term10183 = newInstance(Class.forName("java.lang.Object"));
        Object term10184 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term10185 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term10186 = newInstance(Class.forName("java.lang.Object"));
        setField(term10146, term10146.getClass(), "masks", term10147);
        setField(term10146, term10146.getClass(), "dataModel", null);
        setField(term10146, term10146.getClass(), "renderer", null);
        setField(term10146, term10146.getClass(), "editor", null);
        setIntField(term10146, term10146.getClass(), "maximumRowCount", -481533957);
        setBooleanField(term10146, term10146.getClass(), "isEditable", false);
        setField(term10146, term10146.getClass(), "keySelectionManager", null);
        setField(term10146, term10146.getClass(), "actionCommand", "OclPbYPkcH");
        setBooleanField(term10146, term10146.getClass(), "lightWeightPopupEnabled", false);
        setField(term10146, term10146.getClass(), "selectedItemReminder", term10172);
        setField(term10146, term10146.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term10146, term10146.getClass(), "firingActionEvent", true);
        setBooleanField(term10146, term10146.getClass(), "selectingItem", true);
        setBooleanField(term10146, term10146.getClass(), "updateInProgress", false);
        setField(term10146, term10146.getClass(), "action", null);
        setField(term10146, term10146.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term10146, term10146.getClass(), "isAlignmentXSet", true);
        setFloatField(term10146, term10146.getClass(), "alignmentX", 0.89057696F);
        setBooleanField(term10146, term10146.getClass(), "isAlignmentYSet", true);
        setFloatField(term10146, term10146.getClass(), "alignmentY", 0.7332741F);
        setField(term10146, term10146.getClass(), "ui", null);
        setField(term10180, term10180.getClass(), "listenerList", term10181);
        setField(term10146, term10146.getClass(), "listenerList", term10180);
        setField(term10182, term10182.getClass(), "table", term10183);
        setField(term10146, term10146.getClass(), "clientProperties", term10182);
        setField(term10185, term10185.getClass(), "map", null);
        setField(term10184, term10184.getClass(), "map", term10185);
        setField(term10184, term10184.getClass(), "source", term10186);
        setField(term10146, term10146.getClass(), "vetoableChangeSupport", term10184);
        setBooleanField(term10146, term10146.getClass(), "autoscrolls", true);
        setField(term10146, term10146.getClass(), "border", null);
        setIntField(term10146, term10146.getClass(), "flags", -1465035361);
        setField(term10146, term10146.getClass(), "inputVerifier", null);
        setBooleanField(term10146, term10146.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10146, term10146.getClass(), "paintingChild", null);
        setField(term10146, term10146.getClass(), "popupMenu", null);
        setField(term10146, term10146.getClass(), "revalidateRunnableScheduled", null);
        setField(term10146, term10146.getClass(), "focusInputMap", null);
        setField(term10146, term10146.getClass(), "ancestorInputMap", null);
        setField(term10146, term10146.getClass(), "windowInputMap", null);
        setField(term10146, term10146.getClass(), "actionMap", null);
        setField(term10146, term10146.getClass(), "aaHint", null);
        setField(term10146, term10146.getClass(), "lcdRenderingHint", null);
        setField(term10146, term10146.getClass(), "component", null);
        setField(term10146, term10146.getClass(), "layoutMgr", null);
        setField(term10146, term10146.getClass(), "dispatcher", null);
        setField(term10146, term10146.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10146, term10146.getClass(), "focusCycleRoot", false);
        setBooleanField(term10146, term10146.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10146, term10146.getClass(), "printingThreads", null);
        setBooleanField(term10146, term10146.getClass(), "printing", false);
        setField(term10146, term10146.getClass(), "containerListener", null);
        setIntField(term10146, term10146.getClass(), "listeningChildren", 0);
        setIntField(term10146, term10146.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10146, term10146.getClass(), "descendantsCount", 0);
        setField(term10146, term10146.getClass(), "preserveBackgroundColor", null);
        setIntField(term10146, term10146.getClass(), "numOfHWComponents", 0);
        setIntField(term10146, term10146.getClass(), "numOfLWComponents", 0);
        setField(term10146, term10146.getClass(), "modalComp", null);
        setField(term10146, term10146.getClass(), "modalAppContext", null);
        setIntField(term10146, term10146.getClass(), "containerSerializedDataVersion", 0);
        setField(term10146, term10146.getClass(), "peer", null);
        setField(term10146, term10146.getClass(), "parent", null);
        setField(term10146, term10146.getClass(), "appContext", null);
        setIntField(term10146, term10146.getClass(), "x", 0);
        setIntField(term10146, term10146.getClass(), "y", 0);
        setIntField(term10146, term10146.getClass(), "width", 0);
        setIntField(term10146, term10146.getClass(), "height", 0);
        setField(term10146, term10146.getClass(), "foreground", null);
        setField(term10146, term10146.getClass(), "background", null);
        setField(term10146, term10146.getClass(), "font", null);
        setField(term10146, term10146.getClass(), "peerFont", null);
        setField(term10146, term10146.getClass(), "cursor", null);
        setField(term10146, term10146.getClass(), "locale", null);
        setField(term10146, term10146.getClass(), "graphicsConfig", null);
        setField(term10146, term10146.getClass(), "bufferStrategy", null);
        setBooleanField(term10146, term10146.getClass(), "ignoreRepaint", false);
        setBooleanField(term10146, term10146.getClass(), "visible", false);
        setBooleanField(term10146, term10146.getClass(), "enabled", false);
        setBooleanField(term10146, term10146.getClass(), "valid", false);
        setField(term10146, term10146.getClass(), "dropTarget", null);
        setField(term10146, term10146.getClass(), "popups", null);
        setField(term10146, term10146.getClass(), "name", null);
        setBooleanField(term10146, term10146.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10146, term10146.getClass(), "focusable", false);
        setIntField(term10146, term10146.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10146, term10146.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10146, term10146.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10146, term10146.getClass(), "acc", null);
        setField(term10146, term10146.getClass(), "minSize", null);
        setBooleanField(term10146, term10146.getClass(), "minSizeSet", false);
        setField(term10146, term10146.getClass(), "prefSize", null);
        setBooleanField(term10146, term10146.getClass(), "prefSizeSet", false);
        setField(term10146, term10146.getClass(), "maxSize", null);
        setBooleanField(term10146, term10146.getClass(), "maxSizeSet", false);
        setField(term10146, term10146.getClass(), "componentOrientation", null);
        setBooleanField(term10146, term10146.getClass(), "newEventsOnly", false);
        setField(term10146, term10146.getClass(), "componentListener", null);
        setField(term10146, term10146.getClass(), "focusListener", null);
        setField(term10146, term10146.getClass(), "hierarchyListener", null);
        setField(term10146, term10146.getClass(), "hierarchyBoundsListener", null);
        setField(term10146, term10146.getClass(), "keyListener", null);
        setField(term10146, term10146.getClass(), "mouseListener", null);
        setField(term10146, term10146.getClass(), "mouseMotionListener", null);
        setField(term10146, term10146.getClass(), "mouseWheelListener", null);
        setField(term10146, term10146.getClass(), "inputMethodListener", null);
        setLongField(term10146, term10146.getClass(), "eventMask", 0L);
        setField(term10146, term10146.getClass(), "changeSupport", null);
        setField(term10146, term10146.getClass(), "objectLock", null);
        setBooleanField(term10146, term10146.getClass(), "isPacked", false);
        setIntField(term10146, term10146.getClass(), "boundsOp", 0);
        setField(term10146, term10146.getClass(), "compoundShape", null);
        setField(term10146, term10146.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10146, term10146.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10146, term10146.getClass(), "backgroundEraseDisabled", false);
        setField(term10146, term10146.getClass(), "eventCache", null);
        setBooleanField(term10146, term10146.getClass(), "coalescingEnabled", false);
        setBooleanField(term10146, term10146.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10146, term10146.getClass(), "componentSerializedDataVersion", 0);
        setField(term10146, term10146.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term10146, args);
    }

};


