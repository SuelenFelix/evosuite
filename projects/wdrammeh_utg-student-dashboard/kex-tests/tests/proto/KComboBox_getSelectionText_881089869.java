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
     Object term10283;

    public KComboBox_getSelectionText_881089869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10283 = newInstance(Class.forName("proto.KComboBox"));
        setField(term10283, term10283.getClass(), "masks", null);
        setField(term10283, term10283.getClass(), "dataModel", null);
        setField(term10283, term10283.getClass(), "renderer", null);
        setField(term10283, term10283.getClass(), "editor", null);
        setIntField(term10283, term10283.getClass(), "maximumRowCount", 0);
        setBooleanField(term10283, term10283.getClass(), "isEditable", false);
        setField(term10283, term10283.getClass(), "keySelectionManager", null);
        setField(term10283, term10283.getClass(), "actionCommand", null);
        setBooleanField(term10283, term10283.getClass(), "lightWeightPopupEnabled", false);
        setField(term10283, term10283.getClass(), "selectedItemReminder", null);
        setField(term10283, term10283.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term10283, term10283.getClass(), "firingActionEvent", false);
        setBooleanField(term10283, term10283.getClass(), "selectingItem", false);
        setBooleanField(term10283, term10283.getClass(), "updateInProgress", false);
        setField(term10283, term10283.getClass(), "action", null);
        setField(term10283, term10283.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term10283, term10283.getClass(), "isAlignmentXSet", false);
        setFloatField(term10283, term10283.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10283, term10283.getClass(), "isAlignmentYSet", false);
        setFloatField(term10283, term10283.getClass(), "alignmentY", 0.0F);
        setField(term10283, term10283.getClass(), "ui", null);
        setField(term10283, term10283.getClass(), "listenerList", null);
        setField(term10283, term10283.getClass(), "clientProperties", null);
        setField(term10283, term10283.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10283, term10283.getClass(), "autoscrolls", false);
        setField(term10283, term10283.getClass(), "border", null);
        setIntField(term10283, term10283.getClass(), "flags", 0);
        setField(term10283, term10283.getClass(), "inputVerifier", null);
        setBooleanField(term10283, term10283.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10283, term10283.getClass(), "paintingChild", null);
        setField(term10283, term10283.getClass(), "popupMenu", null);
        setField(term10283, term10283.getClass(), "revalidateRunnableScheduled", null);
        setField(term10283, term10283.getClass(), "focusInputMap", null);
        setField(term10283, term10283.getClass(), "ancestorInputMap", null);
        setField(term10283, term10283.getClass(), "windowInputMap", null);
        setField(term10283, term10283.getClass(), "actionMap", null);
        setField(term10283, term10283.getClass(), "aaHint", null);
        setField(term10283, term10283.getClass(), "lcdRenderingHint", null);
        setField(term10283, term10283.getClass(), "component", null);
        setField(term10283, term10283.getClass(), "layoutMgr", null);
        setField(term10283, term10283.getClass(), "dispatcher", null);
        setField(term10283, term10283.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10283, term10283.getClass(), "focusCycleRoot", false);
        setBooleanField(term10283, term10283.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10283, term10283.getClass(), "printingThreads", null);
        setBooleanField(term10283, term10283.getClass(), "printing", false);
        setField(term10283, term10283.getClass(), "containerListener", null);
        setIntField(term10283, term10283.getClass(), "listeningChildren", 0);
        setIntField(term10283, term10283.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10283, term10283.getClass(), "descendantsCount", 0);
        setField(term10283, term10283.getClass(), "preserveBackgroundColor", null);
        setIntField(term10283, term10283.getClass(), "numOfHWComponents", 0);
        setIntField(term10283, term10283.getClass(), "numOfLWComponents", 0);
        setField(term10283, term10283.getClass(), "modalComp", null);
        setField(term10283, term10283.getClass(), "modalAppContext", null);
        setIntField(term10283, term10283.getClass(), "containerSerializedDataVersion", 0);
        setField(term10283, term10283.getClass(), "peer", null);
        setField(term10283, term10283.getClass(), "parent", null);
        setField(term10283, term10283.getClass(), "appContext", null);
        setIntField(term10283, term10283.getClass(), "x", 0);
        setIntField(term10283, term10283.getClass(), "y", 0);
        setIntField(term10283, term10283.getClass(), "width", 0);
        setIntField(term10283, term10283.getClass(), "height", 0);
        setField(term10283, term10283.getClass(), "foreground", null);
        setField(term10283, term10283.getClass(), "background", null);
        setField(term10283, term10283.getClass(), "font", null);
        setField(term10283, term10283.getClass(), "peerFont", null);
        setField(term10283, term10283.getClass(), "cursor", null);
        setField(term10283, term10283.getClass(), "locale", null);
        setField(term10283, term10283.getClass(), "graphicsConfig", null);
        setField(term10283, term10283.getClass(), "bufferStrategy", null);
        setBooleanField(term10283, term10283.getClass(), "ignoreRepaint", false);
        setBooleanField(term10283, term10283.getClass(), "visible", false);
        setBooleanField(term10283, term10283.getClass(), "enabled", false);
        setBooleanField(term10283, term10283.getClass(), "valid", false);
        setField(term10283, term10283.getClass(), "dropTarget", null);
        setField(term10283, term10283.getClass(), "popups", null);
        setField(term10283, term10283.getClass(), "name", null);
        setBooleanField(term10283, term10283.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10283, term10283.getClass(), "focusable", false);
        setIntField(term10283, term10283.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10283, term10283.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10283, term10283.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10283, term10283.getClass(), "acc", null);
        setField(term10283, term10283.getClass(), "minSize", null);
        setBooleanField(term10283, term10283.getClass(), "minSizeSet", false);
        setField(term10283, term10283.getClass(), "prefSize", null);
        setBooleanField(term10283, term10283.getClass(), "prefSizeSet", false);
        setField(term10283, term10283.getClass(), "maxSize", null);
        setBooleanField(term10283, term10283.getClass(), "maxSizeSet", false);
        setField(term10283, term10283.getClass(), "componentOrientation", null);
        setBooleanField(term10283, term10283.getClass(), "newEventsOnly", false);
        setField(term10283, term10283.getClass(), "componentListener", null);
        setField(term10283, term10283.getClass(), "focusListener", null);
        setField(term10283, term10283.getClass(), "hierarchyListener", null);
        setField(term10283, term10283.getClass(), "hierarchyBoundsListener", null);
        setField(term10283, term10283.getClass(), "keyListener", null);
        setField(term10283, term10283.getClass(), "mouseListener", null);
        setField(term10283, term10283.getClass(), "mouseMotionListener", null);
        setField(term10283, term10283.getClass(), "mouseWheelListener", null);
        setField(term10283, term10283.getClass(), "inputMethodListener", null);
        setLongField(term10283, term10283.getClass(), "eventMask", 0L);
        setField(term10283, term10283.getClass(), "changeSupport", null);
        setField(term10283, term10283.getClass(), "objectLock", null);
        setBooleanField(term10283, term10283.getClass(), "isPacked", false);
        setIntField(term10283, term10283.getClass(), "boundsOp", 0);
        setField(term10283, term10283.getClass(), "compoundShape", null);
        setField(term10283, term10283.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10283, term10283.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10283, term10283.getClass(), "backgroundEraseDisabled", false);
        setField(term10283, term10283.getClass(), "eventCache", null);
        setBooleanField(term10283, term10283.getClass(), "coalescingEnabled", false);
        setBooleanField(term10283, term10283.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10283, term10283.getClass(), "componentSerializedDataVersion", 0);
        setField(term10283, term10283.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectionText", argTypes, term10283, args);
    }

};


