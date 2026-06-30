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

public class KComboBox_setPreferences_195576367211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10376;

    public KComboBox_setPreferences_195576367211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10376 = newInstance(Class.forName("proto.KComboBox"));
        setField(term10376, term10376.getClass(), "masks", null);
        setField(term10376, term10376.getClass(), "dataModel", null);
        setField(term10376, term10376.getClass(), "renderer", null);
        setField(term10376, term10376.getClass(), "editor", null);
        setIntField(term10376, term10376.getClass(), "maximumRowCount", 0);
        setBooleanField(term10376, term10376.getClass(), "isEditable", false);
        setField(term10376, term10376.getClass(), "keySelectionManager", null);
        setField(term10376, term10376.getClass(), "actionCommand", null);
        setBooleanField(term10376, term10376.getClass(), "lightWeightPopupEnabled", false);
        setField(term10376, term10376.getClass(), "selectedItemReminder", null);
        setField(term10376, term10376.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term10376, term10376.getClass(), "firingActionEvent", false);
        setBooleanField(term10376, term10376.getClass(), "selectingItem", false);
        setBooleanField(term10376, term10376.getClass(), "updateInProgress", false);
        setField(term10376, term10376.getClass(), "action", null);
        setField(term10376, term10376.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term10376, term10376.getClass(), "isAlignmentXSet", false);
        setFloatField(term10376, term10376.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10376, term10376.getClass(), "isAlignmentYSet", false);
        setFloatField(term10376, term10376.getClass(), "alignmentY", 0.0F);
        setField(term10376, term10376.getClass(), "ui", null);
        setField(term10376, term10376.getClass(), "listenerList", null);
        setField(term10376, term10376.getClass(), "clientProperties", null);
        setField(term10376, term10376.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10376, term10376.getClass(), "autoscrolls", false);
        setField(term10376, term10376.getClass(), "border", null);
        setIntField(term10376, term10376.getClass(), "flags", 0);
        setField(term10376, term10376.getClass(), "inputVerifier", null);
        setBooleanField(term10376, term10376.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10376, term10376.getClass(), "paintingChild", null);
        setField(term10376, term10376.getClass(), "popupMenu", null);
        setField(term10376, term10376.getClass(), "revalidateRunnableScheduled", null);
        setField(term10376, term10376.getClass(), "focusInputMap", null);
        setField(term10376, term10376.getClass(), "ancestorInputMap", null);
        setField(term10376, term10376.getClass(), "windowInputMap", null);
        setField(term10376, term10376.getClass(), "actionMap", null);
        setField(term10376, term10376.getClass(), "aaHint", null);
        setField(term10376, term10376.getClass(), "lcdRenderingHint", null);
        setField(term10376, term10376.getClass(), "component", null);
        setField(term10376, term10376.getClass(), "layoutMgr", null);
        setField(term10376, term10376.getClass(), "dispatcher", null);
        setField(term10376, term10376.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10376, term10376.getClass(), "focusCycleRoot", false);
        setBooleanField(term10376, term10376.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10376, term10376.getClass(), "printingThreads", null);
        setBooleanField(term10376, term10376.getClass(), "printing", false);
        setField(term10376, term10376.getClass(), "containerListener", null);
        setIntField(term10376, term10376.getClass(), "listeningChildren", 0);
        setIntField(term10376, term10376.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10376, term10376.getClass(), "descendantsCount", 0);
        setField(term10376, term10376.getClass(), "preserveBackgroundColor", null);
        setIntField(term10376, term10376.getClass(), "numOfHWComponents", 0);
        setIntField(term10376, term10376.getClass(), "numOfLWComponents", 0);
        setField(term10376, term10376.getClass(), "modalComp", null);
        setField(term10376, term10376.getClass(), "modalAppContext", null);
        setIntField(term10376, term10376.getClass(), "containerSerializedDataVersion", 0);
        setField(term10376, term10376.getClass(), "peer", null);
        setField(term10376, term10376.getClass(), "parent", null);
        setField(term10376, term10376.getClass(), "appContext", null);
        setIntField(term10376, term10376.getClass(), "x", 0);
        setIntField(term10376, term10376.getClass(), "y", 0);
        setIntField(term10376, term10376.getClass(), "width", 0);
        setIntField(term10376, term10376.getClass(), "height", 0);
        setField(term10376, term10376.getClass(), "foreground", null);
        setField(term10376, term10376.getClass(), "background", null);
        setField(term10376, term10376.getClass(), "font", null);
        setField(term10376, term10376.getClass(), "peerFont", null);
        setField(term10376, term10376.getClass(), "cursor", null);
        setField(term10376, term10376.getClass(), "locale", null);
        setField(term10376, term10376.getClass(), "graphicsConfig", null);
        setField(term10376, term10376.getClass(), "bufferStrategy", null);
        setBooleanField(term10376, term10376.getClass(), "ignoreRepaint", false);
        setBooleanField(term10376, term10376.getClass(), "visible", false);
        setBooleanField(term10376, term10376.getClass(), "enabled", false);
        setBooleanField(term10376, term10376.getClass(), "valid", false);
        setField(term10376, term10376.getClass(), "dropTarget", null);
        setField(term10376, term10376.getClass(), "popups", null);
        setField(term10376, term10376.getClass(), "name", null);
        setBooleanField(term10376, term10376.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10376, term10376.getClass(), "focusable", false);
        setIntField(term10376, term10376.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10376, term10376.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10376, term10376.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10376, term10376.getClass(), "acc", null);
        setField(term10376, term10376.getClass(), "minSize", null);
        setBooleanField(term10376, term10376.getClass(), "minSizeSet", false);
        setField(term10376, term10376.getClass(), "prefSize", null);
        setBooleanField(term10376, term10376.getClass(), "prefSizeSet", false);
        setField(term10376, term10376.getClass(), "maxSize", null);
        setBooleanField(term10376, term10376.getClass(), "maxSizeSet", false);
        setField(term10376, term10376.getClass(), "componentOrientation", null);
        setBooleanField(term10376, term10376.getClass(), "newEventsOnly", false);
        setField(term10376, term10376.getClass(), "componentListener", null);
        setField(term10376, term10376.getClass(), "focusListener", null);
        setField(term10376, term10376.getClass(), "hierarchyListener", null);
        setField(term10376, term10376.getClass(), "hierarchyBoundsListener", null);
        setField(term10376, term10376.getClass(), "keyListener", null);
        setField(term10376, term10376.getClass(), "mouseListener", null);
        setField(term10376, term10376.getClass(), "mouseMotionListener", null);
        setField(term10376, term10376.getClass(), "mouseWheelListener", null);
        setField(term10376, term10376.getClass(), "inputMethodListener", null);
        setLongField(term10376, term10376.getClass(), "eventMask", 0L);
        setField(term10376, term10376.getClass(), "changeSupport", null);
        setField(term10376, term10376.getClass(), "objectLock", null);
        setBooleanField(term10376, term10376.getClass(), "isPacked", false);
        setIntField(term10376, term10376.getClass(), "boundsOp", 0);
        setField(term10376, term10376.getClass(), "compoundShape", null);
        setField(term10376, term10376.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10376, term10376.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10376, term10376.getClass(), "backgroundEraseDisabled", false);
        setField(term10376, term10376.getClass(), "eventCache", null);
        setBooleanField(term10376, term10376.getClass(), "coalescingEnabled", false);
        setBooleanField(term10376, term10376.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10376, term10376.getClass(), "componentSerializedDataVersion", 0);
        setField(term10376, term10376.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term10376, args);
    }

};


