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
     Object term9972;

    public KComboBox_getSelectionText_881089863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9973 = new HashMap();
        term9972 = newInstance(Class.forName("proto.KComboBox"));
        Object term9998 = newInstance(Class.forName("java.lang.Object"));
        Object term10006 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term10007 = (Object[]) newArray("java.lang.Object", 0);
        Object term10008 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term10009 = newInstance(Class.forName("java.lang.Object"));
        Object term10010 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term10011 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term10012 = newInstance(Class.forName("java.lang.Object"));
        setField(term9972, term9972.getClass(), "masks", term9973);
        setField(term9972, term9972.getClass(), "dataModel", null);
        setField(term9972, term9972.getClass(), "renderer", null);
        setField(term9972, term9972.getClass(), "editor", null);
        setIntField(term9972, term9972.getClass(), "maximumRowCount", -2027534003);
        setBooleanField(term9972, term9972.getClass(), "isEditable", true);
        setField(term9972, term9972.getClass(), "keySelectionManager", null);
        setField(term9972, term9972.getClass(), "actionCommand", "eZFUvlxvGV");
        setBooleanField(term9972, term9972.getClass(), "lightWeightPopupEnabled", false);
        setField(term9972, term9972.getClass(), "selectedItemReminder", term9998);
        setField(term9972, term9972.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term9972, term9972.getClass(), "firingActionEvent", false);
        setBooleanField(term9972, term9972.getClass(), "selectingItem", false);
        setBooleanField(term9972, term9972.getClass(), "updateInProgress", true);
        setField(term9972, term9972.getClass(), "action", null);
        setField(term9972, term9972.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term9972, term9972.getClass(), "isAlignmentXSet", true);
        setFloatField(term9972, term9972.getClass(), "alignmentX", 0.9472605F);
        setBooleanField(term9972, term9972.getClass(), "isAlignmentYSet", true);
        setFloatField(term9972, term9972.getClass(), "alignmentY", 0.27797186F);
        setField(term9972, term9972.getClass(), "ui", null);
        setField(term10006, term10006.getClass(), "listenerList", term10007);
        setField(term9972, term9972.getClass(), "listenerList", term10006);
        setField(term10008, term10008.getClass(), "table", term10009);
        setField(term9972, term9972.getClass(), "clientProperties", term10008);
        setField(term10011, term10011.getClass(), "map", null);
        setField(term10010, term10010.getClass(), "map", term10011);
        setField(term10010, term10010.getClass(), "source", term10012);
        setField(term9972, term9972.getClass(), "vetoableChangeSupport", term10010);
        setBooleanField(term9972, term9972.getClass(), "autoscrolls", true);
        setField(term9972, term9972.getClass(), "border", null);
        setIntField(term9972, term9972.getClass(), "flags", 1375330971);
        setField(term9972, term9972.getClass(), "inputVerifier", null);
        setBooleanField(term9972, term9972.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9972, term9972.getClass(), "paintingChild", null);
        setField(term9972, term9972.getClass(), "popupMenu", null);
        setField(term9972, term9972.getClass(), "revalidateRunnableScheduled", null);
        setField(term9972, term9972.getClass(), "focusInputMap", null);
        setField(term9972, term9972.getClass(), "ancestorInputMap", null);
        setField(term9972, term9972.getClass(), "windowInputMap", null);
        setField(term9972, term9972.getClass(), "actionMap", null);
        setField(term9972, term9972.getClass(), "aaHint", null);
        setField(term9972, term9972.getClass(), "lcdRenderingHint", null);
        setField(term9972, term9972.getClass(), "component", null);
        setField(term9972, term9972.getClass(), "layoutMgr", null);
        setField(term9972, term9972.getClass(), "dispatcher", null);
        setField(term9972, term9972.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9972, term9972.getClass(), "focusCycleRoot", false);
        setBooleanField(term9972, term9972.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9972, term9972.getClass(), "printingThreads", null);
        setBooleanField(term9972, term9972.getClass(), "printing", false);
        setField(term9972, term9972.getClass(), "containerListener", null);
        setIntField(term9972, term9972.getClass(), "listeningChildren", 0);
        setIntField(term9972, term9972.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9972, term9972.getClass(), "descendantsCount", 0);
        setField(term9972, term9972.getClass(), "preserveBackgroundColor", null);
        setIntField(term9972, term9972.getClass(), "numOfHWComponents", 0);
        setIntField(term9972, term9972.getClass(), "numOfLWComponents", 0);
        setField(term9972, term9972.getClass(), "modalComp", null);
        setField(term9972, term9972.getClass(), "modalAppContext", null);
        setIntField(term9972, term9972.getClass(), "containerSerializedDataVersion", 0);
        setField(term9972, term9972.getClass(), "peer", null);
        setField(term9972, term9972.getClass(), "parent", null);
        setField(term9972, term9972.getClass(), "appContext", null);
        setIntField(term9972, term9972.getClass(), "x", 0);
        setIntField(term9972, term9972.getClass(), "y", 0);
        setIntField(term9972, term9972.getClass(), "width", 0);
        setIntField(term9972, term9972.getClass(), "height", 0);
        setField(term9972, term9972.getClass(), "foreground", null);
        setField(term9972, term9972.getClass(), "background", null);
        setField(term9972, term9972.getClass(), "font", null);
        setField(term9972, term9972.getClass(), "peerFont", null);
        setField(term9972, term9972.getClass(), "cursor", null);
        setField(term9972, term9972.getClass(), "locale", null);
        setField(term9972, term9972.getClass(), "graphicsConfig", null);
        setField(term9972, term9972.getClass(), "bufferStrategy", null);
        setBooleanField(term9972, term9972.getClass(), "ignoreRepaint", false);
        setBooleanField(term9972, term9972.getClass(), "visible", false);
        setBooleanField(term9972, term9972.getClass(), "enabled", false);
        setBooleanField(term9972, term9972.getClass(), "valid", false);
        setField(term9972, term9972.getClass(), "dropTarget", null);
        setField(term9972, term9972.getClass(), "popups", null);
        setField(term9972, term9972.getClass(), "name", null);
        setBooleanField(term9972, term9972.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9972, term9972.getClass(), "focusable", false);
        setIntField(term9972, term9972.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9972, term9972.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9972, term9972.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9972, term9972.getClass(), "acc", null);
        setField(term9972, term9972.getClass(), "minSize", null);
        setBooleanField(term9972, term9972.getClass(), "minSizeSet", false);
        setField(term9972, term9972.getClass(), "prefSize", null);
        setBooleanField(term9972, term9972.getClass(), "prefSizeSet", false);
        setField(term9972, term9972.getClass(), "maxSize", null);
        setBooleanField(term9972, term9972.getClass(), "maxSizeSet", false);
        setField(term9972, term9972.getClass(), "componentOrientation", null);
        setBooleanField(term9972, term9972.getClass(), "newEventsOnly", false);
        setField(term9972, term9972.getClass(), "componentListener", null);
        setField(term9972, term9972.getClass(), "focusListener", null);
        setField(term9972, term9972.getClass(), "hierarchyListener", null);
        setField(term9972, term9972.getClass(), "hierarchyBoundsListener", null);
        setField(term9972, term9972.getClass(), "keyListener", null);
        setField(term9972, term9972.getClass(), "mouseListener", null);
        setField(term9972, term9972.getClass(), "mouseMotionListener", null);
        setField(term9972, term9972.getClass(), "mouseWheelListener", null);
        setField(term9972, term9972.getClass(), "inputMethodListener", null);
        setLongField(term9972, term9972.getClass(), "eventMask", 0L);
        setField(term9972, term9972.getClass(), "changeSupport", null);
        setField(term9972, term9972.getClass(), "objectLock", null);
        setBooleanField(term9972, term9972.getClass(), "isPacked", false);
        setIntField(term9972, term9972.getClass(), "boundsOp", 0);
        setField(term9972, term9972.getClass(), "compoundShape", null);
        setField(term9972, term9972.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9972, term9972.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9972, term9972.getClass(), "backgroundEraseDisabled", false);
        setField(term9972, term9972.getClass(), "eventCache", null);
        setBooleanField(term9972, term9972.getClass(), "coalescingEnabled", false);
        setBooleanField(term9972, term9972.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9972, term9972.getClass(), "componentSerializedDataVersion", 0);
        setField(term9972, term9972.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectionText", argTypes, term9972, args);
    }

};


