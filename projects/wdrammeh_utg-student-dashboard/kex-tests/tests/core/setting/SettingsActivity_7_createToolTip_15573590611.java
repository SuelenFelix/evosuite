package core.setting;

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
import static core.setting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SettingsActivity_7_createToolTip_15573590611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3757;

    public SettingsActivity_7_createToolTip_15573590611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3757 = newInstance(Class.forName("core.setting.SettingsActivity$7"));
        Object term3773 = newInstance(Class.forName("java.lang.Object"));
        Object term3793 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3794 = (Object[]) newArray("java.lang.Object", 0);
        Object term3795 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term3796 = newInstance(Class.forName("java.lang.Object"));
        Object term3797 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term3798 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term3799 = newInstance(Class.forName("java.lang.Object"));
        setField(term3757, term3757.getClass(), "dataModel", null);
        setField(term3757, term3757.getClass(), "renderer", null);
        setField(term3757, term3757.getClass(), "editor", null);
        setIntField(term3757, term3757.getClass(), "maximumRowCount", -2015854073);
        setBooleanField(term3757, term3757.getClass(), "isEditable", false);
        setField(term3757, term3757.getClass(), "keySelectionManager", null);
        setField(term3757, term3757.getClass(), "actionCommand", "wSQxaModmm");
        setBooleanField(term3757, term3757.getClass(), "lightWeightPopupEnabled", true);
        setField(term3757, term3757.getClass(), "selectedItemReminder", term3773);
        setField(term3757, term3757.getClass(), "prototypeDisplayValue", "UlajhuVLaP");
        setBooleanField(term3757, term3757.getClass(), "firingActionEvent", true);
        setBooleanField(term3757, term3757.getClass(), "selectingItem", true);
        setBooleanField(term3757, term3757.getClass(), "updateInProgress", false);
        setField(term3757, term3757.getClass(), "action", null);
        setField(term3757, term3757.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term3757, term3757.getClass(), "isAlignmentXSet", true);
        setFloatField(term3757, term3757.getClass(), "alignmentX", 0.8474802F);
        setBooleanField(term3757, term3757.getClass(), "isAlignmentYSet", false);
        setFloatField(term3757, term3757.getClass(), "alignmentY", 0.9985961F);
        setField(term3757, term3757.getClass(), "ui", null);
        setField(term3793, term3793.getClass(), "listenerList", term3794);
        setField(term3757, term3757.getClass(), "listenerList", term3793);
        setField(term3795, term3795.getClass(), "table", term3796);
        setField(term3757, term3757.getClass(), "clientProperties", term3795);
        setField(term3798, term3798.getClass(), "map", null);
        setField(term3797, term3797.getClass(), "map", term3798);
        setField(term3797, term3797.getClass(), "source", term3799);
        setField(term3757, term3757.getClass(), "vetoableChangeSupport", term3797);
        setBooleanField(term3757, term3757.getClass(), "autoscrolls", false);
        setField(term3757, term3757.getClass(), "border", null);
        setIntField(term3757, term3757.getClass(), "flags", 96566506);
        setField(term3757, term3757.getClass(), "inputVerifier", null);
        setBooleanField(term3757, term3757.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3757, term3757.getClass(), "paintingChild", null);
        setField(term3757, term3757.getClass(), "popupMenu", null);
        setField(term3757, term3757.getClass(), "revalidateRunnableScheduled", null);
        setField(term3757, term3757.getClass(), "focusInputMap", null);
        setField(term3757, term3757.getClass(), "ancestorInputMap", null);
        setField(term3757, term3757.getClass(), "windowInputMap", null);
        setField(term3757, term3757.getClass(), "actionMap", null);
        setField(term3757, term3757.getClass(), "aaHint", null);
        setField(term3757, term3757.getClass(), "lcdRenderingHint", null);
        setField(term3757, term3757.getClass(), "component", null);
        setField(term3757, term3757.getClass(), "layoutMgr", null);
        setField(term3757, term3757.getClass(), "dispatcher", null);
        setField(term3757, term3757.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3757, term3757.getClass(), "focusCycleRoot", false);
        setBooleanField(term3757, term3757.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3757, term3757.getClass(), "printingThreads", null);
        setBooleanField(term3757, term3757.getClass(), "printing", false);
        setField(term3757, term3757.getClass(), "containerListener", null);
        setIntField(term3757, term3757.getClass(), "listeningChildren", 0);
        setIntField(term3757, term3757.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3757, term3757.getClass(), "descendantsCount", 0);
        setField(term3757, term3757.getClass(), "preserveBackgroundColor", null);
        setIntField(term3757, term3757.getClass(), "numOfHWComponents", 0);
        setIntField(term3757, term3757.getClass(), "numOfLWComponents", 0);
        setField(term3757, term3757.getClass(), "modalComp", null);
        setField(term3757, term3757.getClass(), "modalAppContext", null);
        setIntField(term3757, term3757.getClass(), "containerSerializedDataVersion", 0);
        setField(term3757, term3757.getClass(), "peer", null);
        setField(term3757, term3757.getClass(), "parent", null);
        setField(term3757, term3757.getClass(), "appContext", null);
        setIntField(term3757, term3757.getClass(), "x", 0);
        setIntField(term3757, term3757.getClass(), "y", 0);
        setIntField(term3757, term3757.getClass(), "width", 0);
        setIntField(term3757, term3757.getClass(), "height", 0);
        setField(term3757, term3757.getClass(), "foreground", null);
        setField(term3757, term3757.getClass(), "background", null);
        setField(term3757, term3757.getClass(), "font", null);
        setField(term3757, term3757.getClass(), "peerFont", null);
        setField(term3757, term3757.getClass(), "cursor", null);
        setField(term3757, term3757.getClass(), "locale", null);
        setField(term3757, term3757.getClass(), "graphicsConfig", null);
        setField(term3757, term3757.getClass(), "bufferStrategy", null);
        setBooleanField(term3757, term3757.getClass(), "ignoreRepaint", false);
        setBooleanField(term3757, term3757.getClass(), "visible", false);
        setBooleanField(term3757, term3757.getClass(), "enabled", false);
        setBooleanField(term3757, term3757.getClass(), "valid", false);
        setField(term3757, term3757.getClass(), "dropTarget", null);
        setField(term3757, term3757.getClass(), "popups", null);
        setField(term3757, term3757.getClass(), "name", null);
        setBooleanField(term3757, term3757.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3757, term3757.getClass(), "focusable", false);
        setIntField(term3757, term3757.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3757, term3757.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3757, term3757.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3757, term3757.getClass(), "acc", null);
        setField(term3757, term3757.getClass(), "minSize", null);
        setBooleanField(term3757, term3757.getClass(), "minSizeSet", false);
        setField(term3757, term3757.getClass(), "prefSize", null);
        setBooleanField(term3757, term3757.getClass(), "prefSizeSet", false);
        setField(term3757, term3757.getClass(), "maxSize", null);
        setBooleanField(term3757, term3757.getClass(), "maxSizeSet", false);
        setField(term3757, term3757.getClass(), "componentOrientation", null);
        setBooleanField(term3757, term3757.getClass(), "newEventsOnly", false);
        setField(term3757, term3757.getClass(), "componentListener", null);
        setField(term3757, term3757.getClass(), "focusListener", null);
        setField(term3757, term3757.getClass(), "hierarchyListener", null);
        setField(term3757, term3757.getClass(), "hierarchyBoundsListener", null);
        setField(term3757, term3757.getClass(), "keyListener", null);
        setField(term3757, term3757.getClass(), "mouseListener", null);
        setField(term3757, term3757.getClass(), "mouseMotionListener", null);
        setField(term3757, term3757.getClass(), "mouseWheelListener", null);
        setField(term3757, term3757.getClass(), "inputMethodListener", null);
        setLongField(term3757, term3757.getClass(), "eventMask", 0L);
        setField(term3757, term3757.getClass(), "changeSupport", null);
        setField(term3757, term3757.getClass(), "objectLock", null);
        setBooleanField(term3757, term3757.getClass(), "isPacked", false);
        setIntField(term3757, term3757.getClass(), "boundsOp", 0);
        setField(term3757, term3757.getClass(), "compoundShape", null);
        setField(term3757, term3757.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3757, term3757.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3757, term3757.getClass(), "backgroundEraseDisabled", false);
        setField(term3757, term3757.getClass(), "eventCache", null);
        setBooleanField(term3757, term3757.getClass(), "coalescingEnabled", false);
        setBooleanField(term3757, term3757.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3757, term3757.getClass(), "componentSerializedDataVersion", 0);
        setField(term3757, term3757.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$7");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term3757, args);
    }

};


