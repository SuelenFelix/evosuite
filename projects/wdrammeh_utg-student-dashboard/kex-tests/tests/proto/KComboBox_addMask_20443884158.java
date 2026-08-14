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

public class KComboBox_addMask_20443884158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10236;

    public KComboBox_addMask_20443884158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10236 = newInstance(Class.forName("proto.KComboBox"));
        setField(term10236, term10236.getClass(), "masks", null);
        setField(term10236, term10236.getClass(), "dataModel", null);
        setField(term10236, term10236.getClass(), "renderer", null);
        setField(term10236, term10236.getClass(), "editor", null);
        setIntField(term10236, term10236.getClass(), "maximumRowCount", 0);
        setBooleanField(term10236, term10236.getClass(), "isEditable", false);
        setField(term10236, term10236.getClass(), "keySelectionManager", null);
        setField(term10236, term10236.getClass(), "actionCommand", null);
        setBooleanField(term10236, term10236.getClass(), "lightWeightPopupEnabled", false);
        setField(term10236, term10236.getClass(), "selectedItemReminder", null);
        setField(term10236, term10236.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term10236, term10236.getClass(), "firingActionEvent", false);
        setBooleanField(term10236, term10236.getClass(), "selectingItem", false);
        setBooleanField(term10236, term10236.getClass(), "updateInProgress", false);
        setField(term10236, term10236.getClass(), "action", null);
        setField(term10236, term10236.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term10236, term10236.getClass(), "isAlignmentXSet", false);
        setFloatField(term10236, term10236.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10236, term10236.getClass(), "isAlignmentYSet", false);
        setFloatField(term10236, term10236.getClass(), "alignmentY", 0.0F);
        setField(term10236, term10236.getClass(), "ui", null);
        setField(term10236, term10236.getClass(), "listenerList", null);
        setField(term10236, term10236.getClass(), "clientProperties", null);
        setField(term10236, term10236.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10236, term10236.getClass(), "autoscrolls", false);
        setField(term10236, term10236.getClass(), "border", null);
        setIntField(term10236, term10236.getClass(), "flags", 0);
        setField(term10236, term10236.getClass(), "inputVerifier", null);
        setBooleanField(term10236, term10236.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10236, term10236.getClass(), "paintingChild", null);
        setField(term10236, term10236.getClass(), "popupMenu", null);
        setField(term10236, term10236.getClass(), "revalidateRunnableScheduled", null);
        setField(term10236, term10236.getClass(), "focusInputMap", null);
        setField(term10236, term10236.getClass(), "ancestorInputMap", null);
        setField(term10236, term10236.getClass(), "windowInputMap", null);
        setField(term10236, term10236.getClass(), "actionMap", null);
        setField(term10236, term10236.getClass(), "aaHint", null);
        setField(term10236, term10236.getClass(), "lcdRenderingHint", null);
        setField(term10236, term10236.getClass(), "component", null);
        setField(term10236, term10236.getClass(), "layoutMgr", null);
        setField(term10236, term10236.getClass(), "dispatcher", null);
        setField(term10236, term10236.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10236, term10236.getClass(), "focusCycleRoot", false);
        setBooleanField(term10236, term10236.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10236, term10236.getClass(), "printingThreads", null);
        setBooleanField(term10236, term10236.getClass(), "printing", false);
        setField(term10236, term10236.getClass(), "containerListener", null);
        setIntField(term10236, term10236.getClass(), "listeningChildren", 0);
        setIntField(term10236, term10236.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10236, term10236.getClass(), "descendantsCount", 0);
        setField(term10236, term10236.getClass(), "preserveBackgroundColor", null);
        setIntField(term10236, term10236.getClass(), "numOfHWComponents", 0);
        setIntField(term10236, term10236.getClass(), "numOfLWComponents", 0);
        setField(term10236, term10236.getClass(), "modalComp", null);
        setField(term10236, term10236.getClass(), "modalAppContext", null);
        setIntField(term10236, term10236.getClass(), "containerSerializedDataVersion", 0);
        setField(term10236, term10236.getClass(), "peer", null);
        setField(term10236, term10236.getClass(), "parent", null);
        setField(term10236, term10236.getClass(), "appContext", null);
        setIntField(term10236, term10236.getClass(), "x", 0);
        setIntField(term10236, term10236.getClass(), "y", 0);
        setIntField(term10236, term10236.getClass(), "width", 0);
        setIntField(term10236, term10236.getClass(), "height", 0);
        setField(term10236, term10236.getClass(), "foreground", null);
        setField(term10236, term10236.getClass(), "background", null);
        setField(term10236, term10236.getClass(), "font", null);
        setField(term10236, term10236.getClass(), "peerFont", null);
        setField(term10236, term10236.getClass(), "cursor", null);
        setField(term10236, term10236.getClass(), "locale", null);
        setField(term10236, term10236.getClass(), "graphicsConfig", null);
        setField(term10236, term10236.getClass(), "bufferStrategy", null);
        setBooleanField(term10236, term10236.getClass(), "ignoreRepaint", false);
        setBooleanField(term10236, term10236.getClass(), "visible", false);
        setBooleanField(term10236, term10236.getClass(), "enabled", false);
        setBooleanField(term10236, term10236.getClass(), "valid", false);
        setField(term10236, term10236.getClass(), "dropTarget", null);
        setField(term10236, term10236.getClass(), "popups", null);
        setField(term10236, term10236.getClass(), "name", null);
        setBooleanField(term10236, term10236.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10236, term10236.getClass(), "focusable", false);
        setIntField(term10236, term10236.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10236, term10236.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10236, term10236.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10236, term10236.getClass(), "acc", null);
        setField(term10236, term10236.getClass(), "minSize", null);
        setBooleanField(term10236, term10236.getClass(), "minSizeSet", false);
        setField(term10236, term10236.getClass(), "prefSize", null);
        setBooleanField(term10236, term10236.getClass(), "prefSizeSet", false);
        setField(term10236, term10236.getClass(), "maxSize", null);
        setBooleanField(term10236, term10236.getClass(), "maxSizeSet", false);
        setField(term10236, term10236.getClass(), "componentOrientation", null);
        setBooleanField(term10236, term10236.getClass(), "newEventsOnly", false);
        setField(term10236, term10236.getClass(), "componentListener", null);
        setField(term10236, term10236.getClass(), "focusListener", null);
        setField(term10236, term10236.getClass(), "hierarchyListener", null);
        setField(term10236, term10236.getClass(), "hierarchyBoundsListener", null);
        setField(term10236, term10236.getClass(), "keyListener", null);
        setField(term10236, term10236.getClass(), "mouseListener", null);
        setField(term10236, term10236.getClass(), "mouseMotionListener", null);
        setField(term10236, term10236.getClass(), "mouseWheelListener", null);
        setField(term10236, term10236.getClass(), "inputMethodListener", null);
        setLongField(term10236, term10236.getClass(), "eventMask", 0L);
        setField(term10236, term10236.getClass(), "changeSupport", null);
        setField(term10236, term10236.getClass(), "objectLock", null);
        setBooleanField(term10236, term10236.getClass(), "isPacked", false);
        setIntField(term10236, term10236.getClass(), "boundsOp", 0);
        setField(term10236, term10236.getClass(), "compoundShape", null);
        setField(term10236, term10236.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10236, term10236.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10236, term10236.getClass(), "backgroundEraseDisabled", false);
        setField(term10236, term10236.getClass(), "eventCache", null);
        setBooleanField(term10236, term10236.getClass(), "coalescingEnabled", false);
        setBooleanField(term10236, term10236.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10236, term10236.getClass(), "componentSerializedDataVersion", 0);
        setField(term10236, term10236.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addMask", argTypes, term10236, args);
    }

};


