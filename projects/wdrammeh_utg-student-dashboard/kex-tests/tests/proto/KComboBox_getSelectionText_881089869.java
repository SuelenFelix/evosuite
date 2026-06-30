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

public class KComboBox_getSelectionText_881089869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10282;

    public KComboBox_getSelectionText_881089869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10282 = newInstance(Class.forName("proto.KComboBox"));
        setField(term10282, term10282.getClass(), "masks", null);
        setField(term10282, term10282.getClass(), "dataModel", null);
        setField(term10282, term10282.getClass(), "renderer", null);
        setField(term10282, term10282.getClass(), "editor", null);
        setIntField(term10282, term10282.getClass(), "maximumRowCount", 0);
        setBooleanField(term10282, term10282.getClass(), "isEditable", false);
        setField(term10282, term10282.getClass(), "keySelectionManager", null);
        setField(term10282, term10282.getClass(), "actionCommand", null);
        setBooleanField(term10282, term10282.getClass(), "lightWeightPopupEnabled", false);
        setField(term10282, term10282.getClass(), "selectedItemReminder", null);
        setField(term10282, term10282.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term10282, term10282.getClass(), "firingActionEvent", false);
        setBooleanField(term10282, term10282.getClass(), "selectingItem", false);
        setBooleanField(term10282, term10282.getClass(), "updateInProgress", false);
        setField(term10282, term10282.getClass(), "action", null);
        setField(term10282, term10282.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term10282, term10282.getClass(), "isAlignmentXSet", false);
        setFloatField(term10282, term10282.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10282, term10282.getClass(), "isAlignmentYSet", false);
        setFloatField(term10282, term10282.getClass(), "alignmentY", 0.0F);
        setField(term10282, term10282.getClass(), "ui", null);
        setField(term10282, term10282.getClass(), "listenerList", null);
        setField(term10282, term10282.getClass(), "clientProperties", null);
        setField(term10282, term10282.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10282, term10282.getClass(), "autoscrolls", false);
        setField(term10282, term10282.getClass(), "border", null);
        setIntField(term10282, term10282.getClass(), "flags", 0);
        setField(term10282, term10282.getClass(), "inputVerifier", null);
        setBooleanField(term10282, term10282.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10282, term10282.getClass(), "paintingChild", null);
        setField(term10282, term10282.getClass(), "popupMenu", null);
        setField(term10282, term10282.getClass(), "revalidateRunnableScheduled", null);
        setField(term10282, term10282.getClass(), "focusInputMap", null);
        setField(term10282, term10282.getClass(), "ancestorInputMap", null);
        setField(term10282, term10282.getClass(), "windowInputMap", null);
        setField(term10282, term10282.getClass(), "actionMap", null);
        setField(term10282, term10282.getClass(), "aaHint", null);
        setField(term10282, term10282.getClass(), "lcdRenderingHint", null);
        setField(term10282, term10282.getClass(), "component", null);
        setField(term10282, term10282.getClass(), "layoutMgr", null);
        setField(term10282, term10282.getClass(), "dispatcher", null);
        setField(term10282, term10282.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10282, term10282.getClass(), "focusCycleRoot", false);
        setBooleanField(term10282, term10282.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10282, term10282.getClass(), "printingThreads", null);
        setBooleanField(term10282, term10282.getClass(), "printing", false);
        setField(term10282, term10282.getClass(), "containerListener", null);
        setIntField(term10282, term10282.getClass(), "listeningChildren", 0);
        setIntField(term10282, term10282.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10282, term10282.getClass(), "descendantsCount", 0);
        setField(term10282, term10282.getClass(), "preserveBackgroundColor", null);
        setIntField(term10282, term10282.getClass(), "numOfHWComponents", 0);
        setIntField(term10282, term10282.getClass(), "numOfLWComponents", 0);
        setField(term10282, term10282.getClass(), "modalComp", null);
        setField(term10282, term10282.getClass(), "modalAppContext", null);
        setIntField(term10282, term10282.getClass(), "containerSerializedDataVersion", 0);
        setField(term10282, term10282.getClass(), "peer", null);
        setField(term10282, term10282.getClass(), "parent", null);
        setField(term10282, term10282.getClass(), "appContext", null);
        setIntField(term10282, term10282.getClass(), "x", 0);
        setIntField(term10282, term10282.getClass(), "y", 0);
        setIntField(term10282, term10282.getClass(), "width", 0);
        setIntField(term10282, term10282.getClass(), "height", 0);
        setField(term10282, term10282.getClass(), "foreground", null);
        setField(term10282, term10282.getClass(), "background", null);
        setField(term10282, term10282.getClass(), "font", null);
        setField(term10282, term10282.getClass(), "peerFont", null);
        setField(term10282, term10282.getClass(), "cursor", null);
        setField(term10282, term10282.getClass(), "locale", null);
        setField(term10282, term10282.getClass(), "graphicsConfig", null);
        setField(term10282, term10282.getClass(), "bufferStrategy", null);
        setBooleanField(term10282, term10282.getClass(), "ignoreRepaint", false);
        setBooleanField(term10282, term10282.getClass(), "visible", false);
        setBooleanField(term10282, term10282.getClass(), "enabled", false);
        setBooleanField(term10282, term10282.getClass(), "valid", false);
        setField(term10282, term10282.getClass(), "dropTarget", null);
        setField(term10282, term10282.getClass(), "popups", null);
        setField(term10282, term10282.getClass(), "name", null);
        setBooleanField(term10282, term10282.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10282, term10282.getClass(), "focusable", false);
        setIntField(term10282, term10282.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10282, term10282.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10282, term10282.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10282, term10282.getClass(), "acc", null);
        setField(term10282, term10282.getClass(), "minSize", null);
        setBooleanField(term10282, term10282.getClass(), "minSizeSet", false);
        setField(term10282, term10282.getClass(), "prefSize", null);
        setBooleanField(term10282, term10282.getClass(), "prefSizeSet", false);
        setField(term10282, term10282.getClass(), "maxSize", null);
        setBooleanField(term10282, term10282.getClass(), "maxSizeSet", false);
        setField(term10282, term10282.getClass(), "componentOrientation", null);
        setBooleanField(term10282, term10282.getClass(), "newEventsOnly", false);
        setField(term10282, term10282.getClass(), "componentListener", null);
        setField(term10282, term10282.getClass(), "focusListener", null);
        setField(term10282, term10282.getClass(), "hierarchyListener", null);
        setField(term10282, term10282.getClass(), "hierarchyBoundsListener", null);
        setField(term10282, term10282.getClass(), "keyListener", null);
        setField(term10282, term10282.getClass(), "mouseListener", null);
        setField(term10282, term10282.getClass(), "mouseMotionListener", null);
        setField(term10282, term10282.getClass(), "mouseWheelListener", null);
        setField(term10282, term10282.getClass(), "inputMethodListener", null);
        setLongField(term10282, term10282.getClass(), "eventMask", 0L);
        setField(term10282, term10282.getClass(), "changeSupport", null);
        setField(term10282, term10282.getClass(), "objectLock", null);
        setBooleanField(term10282, term10282.getClass(), "isPacked", false);
        setIntField(term10282, term10282.getClass(), "boundsOp", 0);
        setField(term10282, term10282.getClass(), "compoundShape", null);
        setField(term10282, term10282.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10282, term10282.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10282, term10282.getClass(), "backgroundEraseDisabled", false);
        setField(term10282, term10282.getClass(), "eventCache", null);
        setBooleanField(term10282, term10282.getClass(), "coalescingEnabled", false);
        setBooleanField(term10282, term10282.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10282, term10282.getClass(), "componentSerializedDataVersion", 0);
        setField(term10282, term10282.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectionText", argTypes, term10282, args);
    }

};


