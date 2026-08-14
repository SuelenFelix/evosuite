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

public class KComboBox_createToolTip_32123004010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10330;

    public KComboBox_createToolTip_32123004010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10330 = newInstance(Class.forName("proto.KComboBox"));
        setField(term10330, term10330.getClass(), "masks", null);
        setField(term10330, term10330.getClass(), "dataModel", null);
        setField(term10330, term10330.getClass(), "renderer", null);
        setField(term10330, term10330.getClass(), "editor", null);
        setIntField(term10330, term10330.getClass(), "maximumRowCount", 0);
        setBooleanField(term10330, term10330.getClass(), "isEditable", false);
        setField(term10330, term10330.getClass(), "keySelectionManager", null);
        setField(term10330, term10330.getClass(), "actionCommand", null);
        setBooleanField(term10330, term10330.getClass(), "lightWeightPopupEnabled", false);
        setField(term10330, term10330.getClass(), "selectedItemReminder", null);
        setField(term10330, term10330.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term10330, term10330.getClass(), "firingActionEvent", false);
        setBooleanField(term10330, term10330.getClass(), "selectingItem", false);
        setBooleanField(term10330, term10330.getClass(), "updateInProgress", false);
        setField(term10330, term10330.getClass(), "action", null);
        setField(term10330, term10330.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term10330, term10330.getClass(), "isAlignmentXSet", false);
        setFloatField(term10330, term10330.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10330, term10330.getClass(), "isAlignmentYSet", false);
        setFloatField(term10330, term10330.getClass(), "alignmentY", 0.0F);
        setField(term10330, term10330.getClass(), "ui", null);
        setField(term10330, term10330.getClass(), "listenerList", null);
        setField(term10330, term10330.getClass(), "clientProperties", null);
        setField(term10330, term10330.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10330, term10330.getClass(), "autoscrolls", false);
        setField(term10330, term10330.getClass(), "border", null);
        setIntField(term10330, term10330.getClass(), "flags", 0);
        setField(term10330, term10330.getClass(), "inputVerifier", null);
        setBooleanField(term10330, term10330.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10330, term10330.getClass(), "paintingChild", null);
        setField(term10330, term10330.getClass(), "popupMenu", null);
        setField(term10330, term10330.getClass(), "revalidateRunnableScheduled", null);
        setField(term10330, term10330.getClass(), "focusInputMap", null);
        setField(term10330, term10330.getClass(), "ancestorInputMap", null);
        setField(term10330, term10330.getClass(), "windowInputMap", null);
        setField(term10330, term10330.getClass(), "actionMap", null);
        setField(term10330, term10330.getClass(), "aaHint", null);
        setField(term10330, term10330.getClass(), "lcdRenderingHint", null);
        setField(term10330, term10330.getClass(), "component", null);
        setField(term10330, term10330.getClass(), "layoutMgr", null);
        setField(term10330, term10330.getClass(), "dispatcher", null);
        setField(term10330, term10330.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10330, term10330.getClass(), "focusCycleRoot", false);
        setBooleanField(term10330, term10330.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10330, term10330.getClass(), "printingThreads", null);
        setBooleanField(term10330, term10330.getClass(), "printing", false);
        setField(term10330, term10330.getClass(), "containerListener", null);
        setIntField(term10330, term10330.getClass(), "listeningChildren", 0);
        setIntField(term10330, term10330.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10330, term10330.getClass(), "descendantsCount", 0);
        setField(term10330, term10330.getClass(), "preserveBackgroundColor", null);
        setIntField(term10330, term10330.getClass(), "numOfHWComponents", 0);
        setIntField(term10330, term10330.getClass(), "numOfLWComponents", 0);
        setField(term10330, term10330.getClass(), "modalComp", null);
        setField(term10330, term10330.getClass(), "modalAppContext", null);
        setIntField(term10330, term10330.getClass(), "containerSerializedDataVersion", 0);
        setField(term10330, term10330.getClass(), "peer", null);
        setField(term10330, term10330.getClass(), "parent", null);
        setField(term10330, term10330.getClass(), "appContext", null);
        setIntField(term10330, term10330.getClass(), "x", 0);
        setIntField(term10330, term10330.getClass(), "y", 0);
        setIntField(term10330, term10330.getClass(), "width", 0);
        setIntField(term10330, term10330.getClass(), "height", 0);
        setField(term10330, term10330.getClass(), "foreground", null);
        setField(term10330, term10330.getClass(), "background", null);
        setField(term10330, term10330.getClass(), "font", null);
        setField(term10330, term10330.getClass(), "peerFont", null);
        setField(term10330, term10330.getClass(), "cursor", null);
        setField(term10330, term10330.getClass(), "locale", null);
        setField(term10330, term10330.getClass(), "graphicsConfig", null);
        setField(term10330, term10330.getClass(), "bufferStrategy", null);
        setBooleanField(term10330, term10330.getClass(), "ignoreRepaint", false);
        setBooleanField(term10330, term10330.getClass(), "visible", false);
        setBooleanField(term10330, term10330.getClass(), "enabled", false);
        setBooleanField(term10330, term10330.getClass(), "valid", false);
        setField(term10330, term10330.getClass(), "dropTarget", null);
        setField(term10330, term10330.getClass(), "popups", null);
        setField(term10330, term10330.getClass(), "name", null);
        setBooleanField(term10330, term10330.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10330, term10330.getClass(), "focusable", false);
        setIntField(term10330, term10330.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10330, term10330.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10330, term10330.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10330, term10330.getClass(), "acc", null);
        setField(term10330, term10330.getClass(), "minSize", null);
        setBooleanField(term10330, term10330.getClass(), "minSizeSet", false);
        setField(term10330, term10330.getClass(), "prefSize", null);
        setBooleanField(term10330, term10330.getClass(), "prefSizeSet", false);
        setField(term10330, term10330.getClass(), "maxSize", null);
        setBooleanField(term10330, term10330.getClass(), "maxSizeSet", false);
        setField(term10330, term10330.getClass(), "componentOrientation", null);
        setBooleanField(term10330, term10330.getClass(), "newEventsOnly", false);
        setField(term10330, term10330.getClass(), "componentListener", null);
        setField(term10330, term10330.getClass(), "focusListener", null);
        setField(term10330, term10330.getClass(), "hierarchyListener", null);
        setField(term10330, term10330.getClass(), "hierarchyBoundsListener", null);
        setField(term10330, term10330.getClass(), "keyListener", null);
        setField(term10330, term10330.getClass(), "mouseListener", null);
        setField(term10330, term10330.getClass(), "mouseMotionListener", null);
        setField(term10330, term10330.getClass(), "mouseWheelListener", null);
        setField(term10330, term10330.getClass(), "inputMethodListener", null);
        setLongField(term10330, term10330.getClass(), "eventMask", 0L);
        setField(term10330, term10330.getClass(), "changeSupport", null);
        setField(term10330, term10330.getClass(), "objectLock", null);
        setBooleanField(term10330, term10330.getClass(), "isPacked", false);
        setIntField(term10330, term10330.getClass(), "boundsOp", 0);
        setField(term10330, term10330.getClass(), "compoundShape", null);
        setField(term10330, term10330.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10330, term10330.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10330, term10330.getClass(), "backgroundEraseDisabled", false);
        setField(term10330, term10330.getClass(), "eventCache", null);
        setBooleanField(term10330, term10330.getClass(), "coalescingEnabled", false);
        setBooleanField(term10330, term10330.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10330, term10330.getClass(), "componentSerializedDataVersion", 0);
        setField(term10330, term10330.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term10330, args);
    }

};


