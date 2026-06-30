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
     Object term10329;

    public KComboBox_createToolTip_32123004010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10329 = newInstance(Class.forName("proto.KComboBox"));
        setField(term10329, term10329.getClass(), "masks", null);
        setField(term10329, term10329.getClass(), "dataModel", null);
        setField(term10329, term10329.getClass(), "renderer", null);
        setField(term10329, term10329.getClass(), "editor", null);
        setIntField(term10329, term10329.getClass(), "maximumRowCount", 0);
        setBooleanField(term10329, term10329.getClass(), "isEditable", false);
        setField(term10329, term10329.getClass(), "keySelectionManager", null);
        setField(term10329, term10329.getClass(), "actionCommand", null);
        setBooleanField(term10329, term10329.getClass(), "lightWeightPopupEnabled", false);
        setField(term10329, term10329.getClass(), "selectedItemReminder", null);
        setField(term10329, term10329.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term10329, term10329.getClass(), "firingActionEvent", false);
        setBooleanField(term10329, term10329.getClass(), "selectingItem", false);
        setBooleanField(term10329, term10329.getClass(), "updateInProgress", false);
        setField(term10329, term10329.getClass(), "action", null);
        setField(term10329, term10329.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term10329, term10329.getClass(), "isAlignmentXSet", false);
        setFloatField(term10329, term10329.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10329, term10329.getClass(), "isAlignmentYSet", false);
        setFloatField(term10329, term10329.getClass(), "alignmentY", 0.0F);
        setField(term10329, term10329.getClass(), "ui", null);
        setField(term10329, term10329.getClass(), "listenerList", null);
        setField(term10329, term10329.getClass(), "clientProperties", null);
        setField(term10329, term10329.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10329, term10329.getClass(), "autoscrolls", false);
        setField(term10329, term10329.getClass(), "border", null);
        setIntField(term10329, term10329.getClass(), "flags", 0);
        setField(term10329, term10329.getClass(), "inputVerifier", null);
        setBooleanField(term10329, term10329.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10329, term10329.getClass(), "paintingChild", null);
        setField(term10329, term10329.getClass(), "popupMenu", null);
        setField(term10329, term10329.getClass(), "revalidateRunnableScheduled", null);
        setField(term10329, term10329.getClass(), "focusInputMap", null);
        setField(term10329, term10329.getClass(), "ancestorInputMap", null);
        setField(term10329, term10329.getClass(), "windowInputMap", null);
        setField(term10329, term10329.getClass(), "actionMap", null);
        setField(term10329, term10329.getClass(), "aaHint", null);
        setField(term10329, term10329.getClass(), "lcdRenderingHint", null);
        setField(term10329, term10329.getClass(), "component", null);
        setField(term10329, term10329.getClass(), "layoutMgr", null);
        setField(term10329, term10329.getClass(), "dispatcher", null);
        setField(term10329, term10329.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10329, term10329.getClass(), "focusCycleRoot", false);
        setBooleanField(term10329, term10329.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10329, term10329.getClass(), "printingThreads", null);
        setBooleanField(term10329, term10329.getClass(), "printing", false);
        setField(term10329, term10329.getClass(), "containerListener", null);
        setIntField(term10329, term10329.getClass(), "listeningChildren", 0);
        setIntField(term10329, term10329.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10329, term10329.getClass(), "descendantsCount", 0);
        setField(term10329, term10329.getClass(), "preserveBackgroundColor", null);
        setIntField(term10329, term10329.getClass(), "numOfHWComponents", 0);
        setIntField(term10329, term10329.getClass(), "numOfLWComponents", 0);
        setField(term10329, term10329.getClass(), "modalComp", null);
        setField(term10329, term10329.getClass(), "modalAppContext", null);
        setIntField(term10329, term10329.getClass(), "containerSerializedDataVersion", 0);
        setField(term10329, term10329.getClass(), "peer", null);
        setField(term10329, term10329.getClass(), "parent", null);
        setField(term10329, term10329.getClass(), "appContext", null);
        setIntField(term10329, term10329.getClass(), "x", 0);
        setIntField(term10329, term10329.getClass(), "y", 0);
        setIntField(term10329, term10329.getClass(), "width", 0);
        setIntField(term10329, term10329.getClass(), "height", 0);
        setField(term10329, term10329.getClass(), "foreground", null);
        setField(term10329, term10329.getClass(), "background", null);
        setField(term10329, term10329.getClass(), "font", null);
        setField(term10329, term10329.getClass(), "peerFont", null);
        setField(term10329, term10329.getClass(), "cursor", null);
        setField(term10329, term10329.getClass(), "locale", null);
        setField(term10329, term10329.getClass(), "graphicsConfig", null);
        setField(term10329, term10329.getClass(), "bufferStrategy", null);
        setBooleanField(term10329, term10329.getClass(), "ignoreRepaint", false);
        setBooleanField(term10329, term10329.getClass(), "visible", false);
        setBooleanField(term10329, term10329.getClass(), "enabled", false);
        setBooleanField(term10329, term10329.getClass(), "valid", false);
        setField(term10329, term10329.getClass(), "dropTarget", null);
        setField(term10329, term10329.getClass(), "popups", null);
        setField(term10329, term10329.getClass(), "name", null);
        setBooleanField(term10329, term10329.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10329, term10329.getClass(), "focusable", false);
        setIntField(term10329, term10329.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10329, term10329.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10329, term10329.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10329, term10329.getClass(), "acc", null);
        setField(term10329, term10329.getClass(), "minSize", null);
        setBooleanField(term10329, term10329.getClass(), "minSizeSet", false);
        setField(term10329, term10329.getClass(), "prefSize", null);
        setBooleanField(term10329, term10329.getClass(), "prefSizeSet", false);
        setField(term10329, term10329.getClass(), "maxSize", null);
        setBooleanField(term10329, term10329.getClass(), "maxSizeSet", false);
        setField(term10329, term10329.getClass(), "componentOrientation", null);
        setBooleanField(term10329, term10329.getClass(), "newEventsOnly", false);
        setField(term10329, term10329.getClass(), "componentListener", null);
        setField(term10329, term10329.getClass(), "focusListener", null);
        setField(term10329, term10329.getClass(), "hierarchyListener", null);
        setField(term10329, term10329.getClass(), "hierarchyBoundsListener", null);
        setField(term10329, term10329.getClass(), "keyListener", null);
        setField(term10329, term10329.getClass(), "mouseListener", null);
        setField(term10329, term10329.getClass(), "mouseMotionListener", null);
        setField(term10329, term10329.getClass(), "mouseWheelListener", null);
        setField(term10329, term10329.getClass(), "inputMethodListener", null);
        setLongField(term10329, term10329.getClass(), "eventMask", 0L);
        setField(term10329, term10329.getClass(), "changeSupport", null);
        setField(term10329, term10329.getClass(), "objectLock", null);
        setBooleanField(term10329, term10329.getClass(), "isPacked", false);
        setIntField(term10329, term10329.getClass(), "boundsOp", 0);
        setField(term10329, term10329.getClass(), "compoundShape", null);
        setField(term10329, term10329.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10329, term10329.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10329, term10329.getClass(), "backgroundEraseDisabled", false);
        setField(term10329, term10329.getClass(), "eventCache", null);
        setBooleanField(term10329, term10329.getClass(), "coalescingEnabled", false);
        setBooleanField(term10329, term10329.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10329, term10329.getClass(), "componentSerializedDataVersion", 0);
        setField(term10329, term10329.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term10329, args);
    }

};


