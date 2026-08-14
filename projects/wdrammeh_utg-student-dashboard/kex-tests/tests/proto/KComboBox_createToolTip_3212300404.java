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
     Object term10060;

    public KComboBox_createToolTip_3212300404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10061 = new HashMap();
        term10060 = newInstance(Class.forName("proto.KComboBox"));
        Object term10086 = newInstance(Class.forName("java.lang.Object"));
        Object term10094 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term10095 = (Object[]) newArray("java.lang.Object", 0);
        Object term10096 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term10097 = newInstance(Class.forName("java.lang.Object"));
        Object term10098 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term10099 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term10100 = newInstance(Class.forName("java.lang.Object"));
        setField(term10060, term10060.getClass(), "masks", term10061);
        setField(term10060, term10060.getClass(), "dataModel", null);
        setField(term10060, term10060.getClass(), "renderer", null);
        setField(term10060, term10060.getClass(), "editor", null);
        setIntField(term10060, term10060.getClass(), "maximumRowCount", -478195677);
        setBooleanField(term10060, term10060.getClass(), "isEditable", true);
        setField(term10060, term10060.getClass(), "keySelectionManager", null);
        setField(term10060, term10060.getClass(), "actionCommand", "vrQLuWIDJX");
        setBooleanField(term10060, term10060.getClass(), "lightWeightPopupEnabled", true);
        setField(term10060, term10060.getClass(), "selectedItemReminder", term10086);
        setField(term10060, term10060.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term10060, term10060.getClass(), "firingActionEvent", false);
        setBooleanField(term10060, term10060.getClass(), "selectingItem", true);
        setBooleanField(term10060, term10060.getClass(), "updateInProgress", true);
        setField(term10060, term10060.getClass(), "action", null);
        setField(term10060, term10060.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term10060, term10060.getClass(), "isAlignmentXSet", true);
        setFloatField(term10060, term10060.getClass(), "alignmentX", 0.7467328F);
        setBooleanField(term10060, term10060.getClass(), "isAlignmentYSet", true);
        setFloatField(term10060, term10060.getClass(), "alignmentY", 0.6436713F);
        setField(term10060, term10060.getClass(), "ui", null);
        setField(term10094, term10094.getClass(), "listenerList", term10095);
        setField(term10060, term10060.getClass(), "listenerList", term10094);
        setField(term10096, term10096.getClass(), "table", term10097);
        setField(term10060, term10060.getClass(), "clientProperties", term10096);
        setField(term10099, term10099.getClass(), "map", null);
        setField(term10098, term10098.getClass(), "map", term10099);
        setField(term10098, term10098.getClass(), "source", term10100);
        setField(term10060, term10060.getClass(), "vetoableChangeSupport", term10098);
        setBooleanField(term10060, term10060.getClass(), "autoscrolls", false);
        setField(term10060, term10060.getClass(), "border", null);
        setIntField(term10060, term10060.getClass(), "flags", 1655935355);
        setField(term10060, term10060.getClass(), "inputVerifier", null);
        setBooleanField(term10060, term10060.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10060, term10060.getClass(), "paintingChild", null);
        setField(term10060, term10060.getClass(), "popupMenu", null);
        setField(term10060, term10060.getClass(), "revalidateRunnableScheduled", null);
        setField(term10060, term10060.getClass(), "focusInputMap", null);
        setField(term10060, term10060.getClass(), "ancestorInputMap", null);
        setField(term10060, term10060.getClass(), "windowInputMap", null);
        setField(term10060, term10060.getClass(), "actionMap", null);
        setField(term10060, term10060.getClass(), "aaHint", null);
        setField(term10060, term10060.getClass(), "lcdRenderingHint", null);
        setField(term10060, term10060.getClass(), "component", null);
        setField(term10060, term10060.getClass(), "layoutMgr", null);
        setField(term10060, term10060.getClass(), "dispatcher", null);
        setField(term10060, term10060.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10060, term10060.getClass(), "focusCycleRoot", false);
        setBooleanField(term10060, term10060.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10060, term10060.getClass(), "printingThreads", null);
        setBooleanField(term10060, term10060.getClass(), "printing", false);
        setField(term10060, term10060.getClass(), "containerListener", null);
        setIntField(term10060, term10060.getClass(), "listeningChildren", 0);
        setIntField(term10060, term10060.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10060, term10060.getClass(), "descendantsCount", 0);
        setField(term10060, term10060.getClass(), "preserveBackgroundColor", null);
        setIntField(term10060, term10060.getClass(), "numOfHWComponents", 0);
        setIntField(term10060, term10060.getClass(), "numOfLWComponents", 0);
        setField(term10060, term10060.getClass(), "modalComp", null);
        setField(term10060, term10060.getClass(), "modalAppContext", null);
        setIntField(term10060, term10060.getClass(), "containerSerializedDataVersion", 0);
        setField(term10060, term10060.getClass(), "peer", null);
        setField(term10060, term10060.getClass(), "parent", null);
        setField(term10060, term10060.getClass(), "appContext", null);
        setIntField(term10060, term10060.getClass(), "x", 0);
        setIntField(term10060, term10060.getClass(), "y", 0);
        setIntField(term10060, term10060.getClass(), "width", 0);
        setIntField(term10060, term10060.getClass(), "height", 0);
        setField(term10060, term10060.getClass(), "foreground", null);
        setField(term10060, term10060.getClass(), "background", null);
        setField(term10060, term10060.getClass(), "font", null);
        setField(term10060, term10060.getClass(), "peerFont", null);
        setField(term10060, term10060.getClass(), "cursor", null);
        setField(term10060, term10060.getClass(), "locale", null);
        setField(term10060, term10060.getClass(), "graphicsConfig", null);
        setField(term10060, term10060.getClass(), "bufferStrategy", null);
        setBooleanField(term10060, term10060.getClass(), "ignoreRepaint", false);
        setBooleanField(term10060, term10060.getClass(), "visible", false);
        setBooleanField(term10060, term10060.getClass(), "enabled", false);
        setBooleanField(term10060, term10060.getClass(), "valid", false);
        setField(term10060, term10060.getClass(), "dropTarget", null);
        setField(term10060, term10060.getClass(), "popups", null);
        setField(term10060, term10060.getClass(), "name", null);
        setBooleanField(term10060, term10060.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10060, term10060.getClass(), "focusable", false);
        setIntField(term10060, term10060.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10060, term10060.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10060, term10060.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10060, term10060.getClass(), "acc", null);
        setField(term10060, term10060.getClass(), "minSize", null);
        setBooleanField(term10060, term10060.getClass(), "minSizeSet", false);
        setField(term10060, term10060.getClass(), "prefSize", null);
        setBooleanField(term10060, term10060.getClass(), "prefSizeSet", false);
        setField(term10060, term10060.getClass(), "maxSize", null);
        setBooleanField(term10060, term10060.getClass(), "maxSizeSet", false);
        setField(term10060, term10060.getClass(), "componentOrientation", null);
        setBooleanField(term10060, term10060.getClass(), "newEventsOnly", false);
        setField(term10060, term10060.getClass(), "componentListener", null);
        setField(term10060, term10060.getClass(), "focusListener", null);
        setField(term10060, term10060.getClass(), "hierarchyListener", null);
        setField(term10060, term10060.getClass(), "hierarchyBoundsListener", null);
        setField(term10060, term10060.getClass(), "keyListener", null);
        setField(term10060, term10060.getClass(), "mouseListener", null);
        setField(term10060, term10060.getClass(), "mouseMotionListener", null);
        setField(term10060, term10060.getClass(), "mouseWheelListener", null);
        setField(term10060, term10060.getClass(), "inputMethodListener", null);
        setLongField(term10060, term10060.getClass(), "eventMask", 0L);
        setField(term10060, term10060.getClass(), "changeSupport", null);
        setField(term10060, term10060.getClass(), "objectLock", null);
        setBooleanField(term10060, term10060.getClass(), "isPacked", false);
        setIntField(term10060, term10060.getClass(), "boundsOp", 0);
        setField(term10060, term10060.getClass(), "compoundShape", null);
        setField(term10060, term10060.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10060, term10060.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10060, term10060.getClass(), "backgroundEraseDisabled", false);
        setField(term10060, term10060.getClass(), "eventCache", null);
        setBooleanField(term10060, term10060.getClass(), "coalescingEnabled", false);
        setBooleanField(term10060, term10060.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10060, term10060.getClass(), "componentSerializedDataVersion", 0);
        setField(term10060, term10060.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term10060, args);
    }

};


