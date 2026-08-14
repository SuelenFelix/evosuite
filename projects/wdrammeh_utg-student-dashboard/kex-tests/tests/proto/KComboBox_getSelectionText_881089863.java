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

public class KComboBox_getSelectionText_881089863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9973;

    public KComboBox_getSelectionText_881089863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9974 = new HashMap();
        term9973 = newInstance(Class.forName("proto.KComboBox"));
        Object term9999 = newInstance(Class.forName("java.lang.Object"));
        Object term10007 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term10008 = (Object[]) newArray("java.lang.Object", 0);
        Object term10009 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term10010 = newInstance(Class.forName("java.lang.Object"));
        Object term10011 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term10012 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term10013 = newInstance(Class.forName("java.lang.Object"));
        setField(term9973, term9973.getClass(), "masks", term9974);
        setField(term9973, term9973.getClass(), "dataModel", null);
        setField(term9973, term9973.getClass(), "renderer", null);
        setField(term9973, term9973.getClass(), "editor", null);
        setIntField(term9973, term9973.getClass(), "maximumRowCount", -2027534003);
        setBooleanField(term9973, term9973.getClass(), "isEditable", true);
        setField(term9973, term9973.getClass(), "keySelectionManager", null);
        setField(term9973, term9973.getClass(), "actionCommand", "eZFUvlxvGV");
        setBooleanField(term9973, term9973.getClass(), "lightWeightPopupEnabled", false);
        setField(term9973, term9973.getClass(), "selectedItemReminder", term9999);
        setField(term9973, term9973.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term9973, term9973.getClass(), "firingActionEvent", false);
        setBooleanField(term9973, term9973.getClass(), "selectingItem", false);
        setBooleanField(term9973, term9973.getClass(), "updateInProgress", true);
        setField(term9973, term9973.getClass(), "action", null);
        setField(term9973, term9973.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term9973, term9973.getClass(), "isAlignmentXSet", true);
        setFloatField(term9973, term9973.getClass(), "alignmentX", 0.9472605F);
        setBooleanField(term9973, term9973.getClass(), "isAlignmentYSet", true);
        setFloatField(term9973, term9973.getClass(), "alignmentY", 0.27797186F);
        setField(term9973, term9973.getClass(), "ui", null);
        setField(term10007, term10007.getClass(), "listenerList", term10008);
        setField(term9973, term9973.getClass(), "listenerList", term10007);
        setField(term10009, term10009.getClass(), "table", term10010);
        setField(term9973, term9973.getClass(), "clientProperties", term10009);
        setField(term10012, term10012.getClass(), "map", null);
        setField(term10011, term10011.getClass(), "map", term10012);
        setField(term10011, term10011.getClass(), "source", term10013);
        setField(term9973, term9973.getClass(), "vetoableChangeSupport", term10011);
        setBooleanField(term9973, term9973.getClass(), "autoscrolls", true);
        setField(term9973, term9973.getClass(), "border", null);
        setIntField(term9973, term9973.getClass(), "flags", 1375330971);
        setField(term9973, term9973.getClass(), "inputVerifier", null);
        setBooleanField(term9973, term9973.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9973, term9973.getClass(), "paintingChild", null);
        setField(term9973, term9973.getClass(), "popupMenu", null);
        setField(term9973, term9973.getClass(), "revalidateRunnableScheduled", null);
        setField(term9973, term9973.getClass(), "focusInputMap", null);
        setField(term9973, term9973.getClass(), "ancestorInputMap", null);
        setField(term9973, term9973.getClass(), "windowInputMap", null);
        setField(term9973, term9973.getClass(), "actionMap", null);
        setField(term9973, term9973.getClass(), "aaHint", null);
        setField(term9973, term9973.getClass(), "lcdRenderingHint", null);
        setField(term9973, term9973.getClass(), "component", null);
        setField(term9973, term9973.getClass(), "layoutMgr", null);
        setField(term9973, term9973.getClass(), "dispatcher", null);
        setField(term9973, term9973.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9973, term9973.getClass(), "focusCycleRoot", false);
        setBooleanField(term9973, term9973.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9973, term9973.getClass(), "printingThreads", null);
        setBooleanField(term9973, term9973.getClass(), "printing", false);
        setField(term9973, term9973.getClass(), "containerListener", null);
        setIntField(term9973, term9973.getClass(), "listeningChildren", 0);
        setIntField(term9973, term9973.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9973, term9973.getClass(), "descendantsCount", 0);
        setField(term9973, term9973.getClass(), "preserveBackgroundColor", null);
        setIntField(term9973, term9973.getClass(), "numOfHWComponents", 0);
        setIntField(term9973, term9973.getClass(), "numOfLWComponents", 0);
        setField(term9973, term9973.getClass(), "modalComp", null);
        setField(term9973, term9973.getClass(), "modalAppContext", null);
        setIntField(term9973, term9973.getClass(), "containerSerializedDataVersion", 0);
        setField(term9973, term9973.getClass(), "peer", null);
        setField(term9973, term9973.getClass(), "parent", null);
        setField(term9973, term9973.getClass(), "appContext", null);
        setIntField(term9973, term9973.getClass(), "x", 0);
        setIntField(term9973, term9973.getClass(), "y", 0);
        setIntField(term9973, term9973.getClass(), "width", 0);
        setIntField(term9973, term9973.getClass(), "height", 0);
        setField(term9973, term9973.getClass(), "foreground", null);
        setField(term9973, term9973.getClass(), "background", null);
        setField(term9973, term9973.getClass(), "font", null);
        setField(term9973, term9973.getClass(), "peerFont", null);
        setField(term9973, term9973.getClass(), "cursor", null);
        setField(term9973, term9973.getClass(), "locale", null);
        setField(term9973, term9973.getClass(), "graphicsConfig", null);
        setField(term9973, term9973.getClass(), "bufferStrategy", null);
        setBooleanField(term9973, term9973.getClass(), "ignoreRepaint", false);
        setBooleanField(term9973, term9973.getClass(), "visible", false);
        setBooleanField(term9973, term9973.getClass(), "enabled", false);
        setBooleanField(term9973, term9973.getClass(), "valid", false);
        setField(term9973, term9973.getClass(), "dropTarget", null);
        setField(term9973, term9973.getClass(), "popups", null);
        setField(term9973, term9973.getClass(), "name", null);
        setBooleanField(term9973, term9973.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9973, term9973.getClass(), "focusable", false);
        setIntField(term9973, term9973.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9973, term9973.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9973, term9973.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9973, term9973.getClass(), "acc", null);
        setField(term9973, term9973.getClass(), "minSize", null);
        setBooleanField(term9973, term9973.getClass(), "minSizeSet", false);
        setField(term9973, term9973.getClass(), "prefSize", null);
        setBooleanField(term9973, term9973.getClass(), "prefSizeSet", false);
        setField(term9973, term9973.getClass(), "maxSize", null);
        setBooleanField(term9973, term9973.getClass(), "maxSizeSet", false);
        setField(term9973, term9973.getClass(), "componentOrientation", null);
        setBooleanField(term9973, term9973.getClass(), "newEventsOnly", false);
        setField(term9973, term9973.getClass(), "componentListener", null);
        setField(term9973, term9973.getClass(), "focusListener", null);
        setField(term9973, term9973.getClass(), "hierarchyListener", null);
        setField(term9973, term9973.getClass(), "hierarchyBoundsListener", null);
        setField(term9973, term9973.getClass(), "keyListener", null);
        setField(term9973, term9973.getClass(), "mouseListener", null);
        setField(term9973, term9973.getClass(), "mouseMotionListener", null);
        setField(term9973, term9973.getClass(), "mouseWheelListener", null);
        setField(term9973, term9973.getClass(), "inputMethodListener", null);
        setLongField(term9973, term9973.getClass(), "eventMask", 0L);
        setField(term9973, term9973.getClass(), "changeSupport", null);
        setField(term9973, term9973.getClass(), "objectLock", null);
        setBooleanField(term9973, term9973.getClass(), "isPacked", false);
        setIntField(term9973, term9973.getClass(), "boundsOp", 0);
        setField(term9973, term9973.getClass(), "compoundShape", null);
        setField(term9973, term9973.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9973, term9973.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9973, term9973.getClass(), "backgroundEraseDisabled", false);
        setField(term9973, term9973.getClass(), "eventCache", null);
        setBooleanField(term9973, term9973.getClass(), "coalescingEnabled", false);
        setBooleanField(term9973, term9973.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9973, term9973.getClass(), "componentSerializedDataVersion", 0);
        setField(term9973, term9973.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectionText", argTypes, term9973, args);
    }

};


