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
     Object term10377;

    public KComboBox_setPreferences_195576367211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10377 = newInstance(Class.forName("proto.KComboBox"));
        setField(term10377, term10377.getClass(), "masks", null);
        setField(term10377, term10377.getClass(), "dataModel", null);
        setField(term10377, term10377.getClass(), "renderer", null);
        setField(term10377, term10377.getClass(), "editor", null);
        setIntField(term10377, term10377.getClass(), "maximumRowCount", 0);
        setBooleanField(term10377, term10377.getClass(), "isEditable", false);
        setField(term10377, term10377.getClass(), "keySelectionManager", null);
        setField(term10377, term10377.getClass(), "actionCommand", null);
        setBooleanField(term10377, term10377.getClass(), "lightWeightPopupEnabled", false);
        setField(term10377, term10377.getClass(), "selectedItemReminder", null);
        setField(term10377, term10377.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term10377, term10377.getClass(), "firingActionEvent", false);
        setBooleanField(term10377, term10377.getClass(), "selectingItem", false);
        setBooleanField(term10377, term10377.getClass(), "updateInProgress", false);
        setField(term10377, term10377.getClass(), "action", null);
        setField(term10377, term10377.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term10377, term10377.getClass(), "isAlignmentXSet", false);
        setFloatField(term10377, term10377.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10377, term10377.getClass(), "isAlignmentYSet", false);
        setFloatField(term10377, term10377.getClass(), "alignmentY", 0.0F);
        setField(term10377, term10377.getClass(), "ui", null);
        setField(term10377, term10377.getClass(), "listenerList", null);
        setField(term10377, term10377.getClass(), "clientProperties", null);
        setField(term10377, term10377.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10377, term10377.getClass(), "autoscrolls", false);
        setField(term10377, term10377.getClass(), "border", null);
        setIntField(term10377, term10377.getClass(), "flags", 0);
        setField(term10377, term10377.getClass(), "inputVerifier", null);
        setBooleanField(term10377, term10377.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10377, term10377.getClass(), "paintingChild", null);
        setField(term10377, term10377.getClass(), "popupMenu", null);
        setField(term10377, term10377.getClass(), "revalidateRunnableScheduled", null);
        setField(term10377, term10377.getClass(), "focusInputMap", null);
        setField(term10377, term10377.getClass(), "ancestorInputMap", null);
        setField(term10377, term10377.getClass(), "windowInputMap", null);
        setField(term10377, term10377.getClass(), "actionMap", null);
        setField(term10377, term10377.getClass(), "aaHint", null);
        setField(term10377, term10377.getClass(), "lcdRenderingHint", null);
        setField(term10377, term10377.getClass(), "component", null);
        setField(term10377, term10377.getClass(), "layoutMgr", null);
        setField(term10377, term10377.getClass(), "dispatcher", null);
        setField(term10377, term10377.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10377, term10377.getClass(), "focusCycleRoot", false);
        setBooleanField(term10377, term10377.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10377, term10377.getClass(), "printingThreads", null);
        setBooleanField(term10377, term10377.getClass(), "printing", false);
        setField(term10377, term10377.getClass(), "containerListener", null);
        setIntField(term10377, term10377.getClass(), "listeningChildren", 0);
        setIntField(term10377, term10377.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10377, term10377.getClass(), "descendantsCount", 0);
        setField(term10377, term10377.getClass(), "preserveBackgroundColor", null);
        setIntField(term10377, term10377.getClass(), "numOfHWComponents", 0);
        setIntField(term10377, term10377.getClass(), "numOfLWComponents", 0);
        setField(term10377, term10377.getClass(), "modalComp", null);
        setField(term10377, term10377.getClass(), "modalAppContext", null);
        setIntField(term10377, term10377.getClass(), "containerSerializedDataVersion", 0);
        setField(term10377, term10377.getClass(), "peer", null);
        setField(term10377, term10377.getClass(), "parent", null);
        setField(term10377, term10377.getClass(), "appContext", null);
        setIntField(term10377, term10377.getClass(), "x", 0);
        setIntField(term10377, term10377.getClass(), "y", 0);
        setIntField(term10377, term10377.getClass(), "width", 0);
        setIntField(term10377, term10377.getClass(), "height", 0);
        setField(term10377, term10377.getClass(), "foreground", null);
        setField(term10377, term10377.getClass(), "background", null);
        setField(term10377, term10377.getClass(), "font", null);
        setField(term10377, term10377.getClass(), "peerFont", null);
        setField(term10377, term10377.getClass(), "cursor", null);
        setField(term10377, term10377.getClass(), "locale", null);
        setField(term10377, term10377.getClass(), "graphicsConfig", null);
        setField(term10377, term10377.getClass(), "bufferStrategy", null);
        setBooleanField(term10377, term10377.getClass(), "ignoreRepaint", false);
        setBooleanField(term10377, term10377.getClass(), "visible", false);
        setBooleanField(term10377, term10377.getClass(), "enabled", false);
        setBooleanField(term10377, term10377.getClass(), "valid", false);
        setField(term10377, term10377.getClass(), "dropTarget", null);
        setField(term10377, term10377.getClass(), "popups", null);
        setField(term10377, term10377.getClass(), "name", null);
        setBooleanField(term10377, term10377.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10377, term10377.getClass(), "focusable", false);
        setIntField(term10377, term10377.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10377, term10377.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10377, term10377.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10377, term10377.getClass(), "acc", null);
        setField(term10377, term10377.getClass(), "minSize", null);
        setBooleanField(term10377, term10377.getClass(), "minSizeSet", false);
        setField(term10377, term10377.getClass(), "prefSize", null);
        setBooleanField(term10377, term10377.getClass(), "prefSizeSet", false);
        setField(term10377, term10377.getClass(), "maxSize", null);
        setBooleanField(term10377, term10377.getClass(), "maxSizeSet", false);
        setField(term10377, term10377.getClass(), "componentOrientation", null);
        setBooleanField(term10377, term10377.getClass(), "newEventsOnly", false);
        setField(term10377, term10377.getClass(), "componentListener", null);
        setField(term10377, term10377.getClass(), "focusListener", null);
        setField(term10377, term10377.getClass(), "hierarchyListener", null);
        setField(term10377, term10377.getClass(), "hierarchyBoundsListener", null);
        setField(term10377, term10377.getClass(), "keyListener", null);
        setField(term10377, term10377.getClass(), "mouseListener", null);
        setField(term10377, term10377.getClass(), "mouseMotionListener", null);
        setField(term10377, term10377.getClass(), "mouseWheelListener", null);
        setField(term10377, term10377.getClass(), "inputMethodListener", null);
        setLongField(term10377, term10377.getClass(), "eventMask", 0L);
        setField(term10377, term10377.getClass(), "changeSupport", null);
        setField(term10377, term10377.getClass(), "objectLock", null);
        setBooleanField(term10377, term10377.getClass(), "isPacked", false);
        setIntField(term10377, term10377.getClass(), "boundsOp", 0);
        setField(term10377, term10377.getClass(), "compoundShape", null);
        setField(term10377, term10377.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10377, term10377.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10377, term10377.getClass(), "backgroundEraseDisabled", false);
        setField(term10377, term10377.getClass(), "eventCache", null);
        setBooleanField(term10377, term10377.getClass(), "coalescingEnabled", false);
        setBooleanField(term10377, term10377.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10377, term10377.getClass(), "componentSerializedDataVersion", 0);
        setField(term10377, term10377.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term10377, args);
    }

};


