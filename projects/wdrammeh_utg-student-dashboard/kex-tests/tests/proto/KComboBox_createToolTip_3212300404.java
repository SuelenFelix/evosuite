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

public class KComboBox_createToolTip_3212300404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10059;

    public KComboBox_createToolTip_3212300404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10060 = new HashMap();
        term10059 = newInstance(Class.forName("proto.KComboBox"));
        Object term10085 = newInstance(Class.forName("java.lang.Object"));
        Object term10093 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term10094 = (Object[]) newArray("java.lang.Object", 0);
        Object term10095 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term10096 = newInstance(Class.forName("java.lang.Object"));
        Object term10097 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term10098 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term10099 = newInstance(Class.forName("java.lang.Object"));
        setField(term10059, term10059.getClass(), "masks", term10060);
        setField(term10059, term10059.getClass(), "dataModel", null);
        setField(term10059, term10059.getClass(), "renderer", null);
        setField(term10059, term10059.getClass(), "editor", null);
        setIntField(term10059, term10059.getClass(), "maximumRowCount", -478195677);
        setBooleanField(term10059, term10059.getClass(), "isEditable", true);
        setField(term10059, term10059.getClass(), "keySelectionManager", null);
        setField(term10059, term10059.getClass(), "actionCommand", "vrQLuWIDJX");
        setBooleanField(term10059, term10059.getClass(), "lightWeightPopupEnabled", true);
        setField(term10059, term10059.getClass(), "selectedItemReminder", term10085);
        setField(term10059, term10059.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term10059, term10059.getClass(), "firingActionEvent", false);
        setBooleanField(term10059, term10059.getClass(), "selectingItem", true);
        setBooleanField(term10059, term10059.getClass(), "updateInProgress", true);
        setField(term10059, term10059.getClass(), "action", null);
        setField(term10059, term10059.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term10059, term10059.getClass(), "isAlignmentXSet", true);
        setFloatField(term10059, term10059.getClass(), "alignmentX", 0.7467328F);
        setBooleanField(term10059, term10059.getClass(), "isAlignmentYSet", true);
        setFloatField(term10059, term10059.getClass(), "alignmentY", 0.6436713F);
        setField(term10059, term10059.getClass(), "ui", null);
        setField(term10093, term10093.getClass(), "listenerList", term10094);
        setField(term10059, term10059.getClass(), "listenerList", term10093);
        setField(term10095, term10095.getClass(), "table", term10096);
        setField(term10059, term10059.getClass(), "clientProperties", term10095);
        setField(term10098, term10098.getClass(), "map", null);
        setField(term10097, term10097.getClass(), "map", term10098);
        setField(term10097, term10097.getClass(), "source", term10099);
        setField(term10059, term10059.getClass(), "vetoableChangeSupport", term10097);
        setBooleanField(term10059, term10059.getClass(), "autoscrolls", false);
        setField(term10059, term10059.getClass(), "border", null);
        setIntField(term10059, term10059.getClass(), "flags", 1655935355);
        setField(term10059, term10059.getClass(), "inputVerifier", null);
        setBooleanField(term10059, term10059.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10059, term10059.getClass(), "paintingChild", null);
        setField(term10059, term10059.getClass(), "popupMenu", null);
        setField(term10059, term10059.getClass(), "revalidateRunnableScheduled", null);
        setField(term10059, term10059.getClass(), "focusInputMap", null);
        setField(term10059, term10059.getClass(), "ancestorInputMap", null);
        setField(term10059, term10059.getClass(), "windowInputMap", null);
        setField(term10059, term10059.getClass(), "actionMap", null);
        setField(term10059, term10059.getClass(), "aaHint", null);
        setField(term10059, term10059.getClass(), "lcdRenderingHint", null);
        setField(term10059, term10059.getClass(), "component", null);
        setField(term10059, term10059.getClass(), "layoutMgr", null);
        setField(term10059, term10059.getClass(), "dispatcher", null);
        setField(term10059, term10059.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10059, term10059.getClass(), "focusCycleRoot", false);
        setBooleanField(term10059, term10059.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10059, term10059.getClass(), "printingThreads", null);
        setBooleanField(term10059, term10059.getClass(), "printing", false);
        setField(term10059, term10059.getClass(), "containerListener", null);
        setIntField(term10059, term10059.getClass(), "listeningChildren", 0);
        setIntField(term10059, term10059.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10059, term10059.getClass(), "descendantsCount", 0);
        setField(term10059, term10059.getClass(), "preserveBackgroundColor", null);
        setIntField(term10059, term10059.getClass(), "numOfHWComponents", 0);
        setIntField(term10059, term10059.getClass(), "numOfLWComponents", 0);
        setField(term10059, term10059.getClass(), "modalComp", null);
        setField(term10059, term10059.getClass(), "modalAppContext", null);
        setIntField(term10059, term10059.getClass(), "containerSerializedDataVersion", 0);
        setField(term10059, term10059.getClass(), "peer", null);
        setField(term10059, term10059.getClass(), "parent", null);
        setField(term10059, term10059.getClass(), "appContext", null);
        setIntField(term10059, term10059.getClass(), "x", 0);
        setIntField(term10059, term10059.getClass(), "y", 0);
        setIntField(term10059, term10059.getClass(), "width", 0);
        setIntField(term10059, term10059.getClass(), "height", 0);
        setField(term10059, term10059.getClass(), "foreground", null);
        setField(term10059, term10059.getClass(), "background", null);
        setField(term10059, term10059.getClass(), "font", null);
        setField(term10059, term10059.getClass(), "peerFont", null);
        setField(term10059, term10059.getClass(), "cursor", null);
        setField(term10059, term10059.getClass(), "locale", null);
        setField(term10059, term10059.getClass(), "graphicsConfig", null);
        setField(term10059, term10059.getClass(), "bufferStrategy", null);
        setBooleanField(term10059, term10059.getClass(), "ignoreRepaint", false);
        setBooleanField(term10059, term10059.getClass(), "visible", false);
        setBooleanField(term10059, term10059.getClass(), "enabled", false);
        setBooleanField(term10059, term10059.getClass(), "valid", false);
        setField(term10059, term10059.getClass(), "dropTarget", null);
        setField(term10059, term10059.getClass(), "popups", null);
        setField(term10059, term10059.getClass(), "name", null);
        setBooleanField(term10059, term10059.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10059, term10059.getClass(), "focusable", false);
        setIntField(term10059, term10059.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10059, term10059.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10059, term10059.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10059, term10059.getClass(), "acc", null);
        setField(term10059, term10059.getClass(), "minSize", null);
        setBooleanField(term10059, term10059.getClass(), "minSizeSet", false);
        setField(term10059, term10059.getClass(), "prefSize", null);
        setBooleanField(term10059, term10059.getClass(), "prefSizeSet", false);
        setField(term10059, term10059.getClass(), "maxSize", null);
        setBooleanField(term10059, term10059.getClass(), "maxSizeSet", false);
        setField(term10059, term10059.getClass(), "componentOrientation", null);
        setBooleanField(term10059, term10059.getClass(), "newEventsOnly", false);
        setField(term10059, term10059.getClass(), "componentListener", null);
        setField(term10059, term10059.getClass(), "focusListener", null);
        setField(term10059, term10059.getClass(), "hierarchyListener", null);
        setField(term10059, term10059.getClass(), "hierarchyBoundsListener", null);
        setField(term10059, term10059.getClass(), "keyListener", null);
        setField(term10059, term10059.getClass(), "mouseListener", null);
        setField(term10059, term10059.getClass(), "mouseMotionListener", null);
        setField(term10059, term10059.getClass(), "mouseWheelListener", null);
        setField(term10059, term10059.getClass(), "inputMethodListener", null);
        setLongField(term10059, term10059.getClass(), "eventMask", 0L);
        setField(term10059, term10059.getClass(), "changeSupport", null);
        setField(term10059, term10059.getClass(), "objectLock", null);
        setBooleanField(term10059, term10059.getClass(), "isPacked", false);
        setIntField(term10059, term10059.getClass(), "boundsOp", 0);
        setField(term10059, term10059.getClass(), "compoundShape", null);
        setField(term10059, term10059.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10059, term10059.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10059, term10059.getClass(), "backgroundEraseDisabled", false);
        setField(term10059, term10059.getClass(), "eventCache", null);
        setBooleanField(term10059, term10059.getClass(), "coalescingEnabled", false);
        setBooleanField(term10059, term10059.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10059, term10059.getClass(), "componentSerializedDataVersion", 0);
        setField(term10059, term10059.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term10059, args);
    }

};


