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

public class SettingsActivity_5_createToolTip_15573589991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term806;

    public SettingsActivity_5_createToolTip_15573589991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term806 = newInstance(Class.forName("core.setting.SettingsActivity$5"));
        Object term822 = newInstance(Class.forName("java.lang.Object"));
        Object term842 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term843 = (Object[]) newArray("java.lang.Object", 0);
        Object term844 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term845 = newInstance(Class.forName("java.lang.Object"));
        Object term846 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term847 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term848 = newInstance(Class.forName("java.lang.Object"));
        setField(term806, term806.getClass(), "dataModel", null);
        setField(term806, term806.getClass(), "renderer", null);
        setField(term806, term806.getClass(), "editor", null);
        setIntField(term806, term806.getClass(), "maximumRowCount", -184153539);
        setBooleanField(term806, term806.getClass(), "isEditable", true);
        setField(term806, term806.getClass(), "keySelectionManager", null);
        setField(term806, term806.getClass(), "actionCommand", "xOEqzGAmDU");
        setBooleanField(term806, term806.getClass(), "lightWeightPopupEnabled", false);
        setField(term806, term806.getClass(), "selectedItemReminder", term822);
        setField(term806, term806.getClass(), "prototypeDisplayValue", "eZFUvlxvGV");
        setBooleanField(term806, term806.getClass(), "firingActionEvent", false);
        setBooleanField(term806, term806.getClass(), "selectingItem", false);
        setBooleanField(term806, term806.getClass(), "updateInProgress", true);
        setField(term806, term806.getClass(), "action", null);
        setField(term806, term806.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term806, term806.getClass(), "isAlignmentXSet", true);
        setFloatField(term806, term806.getClass(), "alignmentX", 0.2857073F);
        setBooleanField(term806, term806.getClass(), "isAlignmentYSet", false);
        setFloatField(term806, term806.getClass(), "alignmentY", 0.6880585F);
        setField(term806, term806.getClass(), "ui", null);
        setField(term842, term842.getClass(), "listenerList", term843);
        setField(term806, term806.getClass(), "listenerList", term842);
        setField(term844, term844.getClass(), "table", term845);
        setField(term806, term806.getClass(), "clientProperties", term844);
        setField(term847, term847.getClass(), "map", null);
        setField(term846, term846.getClass(), "map", term847);
        setField(term846, term846.getClass(), "source", term848);
        setField(term806, term806.getClass(), "vetoableChangeSupport", term846);
        setBooleanField(term806, term806.getClass(), "autoscrolls", true);
        setField(term806, term806.getClass(), "border", null);
        setIntField(term806, term806.getClass(), "flags", 1328271830);
        setField(term806, term806.getClass(), "inputVerifier", null);
        setBooleanField(term806, term806.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term806, term806.getClass(), "paintingChild", null);
        setField(term806, term806.getClass(), "popupMenu", null);
        setField(term806, term806.getClass(), "revalidateRunnableScheduled", null);
        setField(term806, term806.getClass(), "focusInputMap", null);
        setField(term806, term806.getClass(), "ancestorInputMap", null);
        setField(term806, term806.getClass(), "windowInputMap", null);
        setField(term806, term806.getClass(), "actionMap", null);
        setField(term806, term806.getClass(), "aaHint", null);
        setField(term806, term806.getClass(), "lcdRenderingHint", null);
        setField(term806, term806.getClass(), "component", null);
        setField(term806, term806.getClass(), "layoutMgr", null);
        setField(term806, term806.getClass(), "dispatcher", null);
        setField(term806, term806.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term806, term806.getClass(), "focusCycleRoot", false);
        setBooleanField(term806, term806.getClass(), "focusTraversalPolicyProvider", false);
        setField(term806, term806.getClass(), "printingThreads", null);
        setBooleanField(term806, term806.getClass(), "printing", false);
        setField(term806, term806.getClass(), "containerListener", null);
        setIntField(term806, term806.getClass(), "listeningChildren", 0);
        setIntField(term806, term806.getClass(), "listeningBoundsChildren", 0);
        setIntField(term806, term806.getClass(), "descendantsCount", 0);
        setField(term806, term806.getClass(), "preserveBackgroundColor", null);
        setIntField(term806, term806.getClass(), "numOfHWComponents", 0);
        setIntField(term806, term806.getClass(), "numOfLWComponents", 0);
        setField(term806, term806.getClass(), "modalComp", null);
        setField(term806, term806.getClass(), "modalAppContext", null);
        setIntField(term806, term806.getClass(), "containerSerializedDataVersion", 0);
        setField(term806, term806.getClass(), "peer", null);
        setField(term806, term806.getClass(), "parent", null);
        setField(term806, term806.getClass(), "appContext", null);
        setIntField(term806, term806.getClass(), "x", 0);
        setIntField(term806, term806.getClass(), "y", 0);
        setIntField(term806, term806.getClass(), "width", 0);
        setIntField(term806, term806.getClass(), "height", 0);
        setField(term806, term806.getClass(), "foreground", null);
        setField(term806, term806.getClass(), "background", null);
        setField(term806, term806.getClass(), "font", null);
        setField(term806, term806.getClass(), "peerFont", null);
        setField(term806, term806.getClass(), "cursor", null);
        setField(term806, term806.getClass(), "locale", null);
        setField(term806, term806.getClass(), "graphicsConfig", null);
        setField(term806, term806.getClass(), "bufferStrategy", null);
        setBooleanField(term806, term806.getClass(), "ignoreRepaint", false);
        setBooleanField(term806, term806.getClass(), "visible", false);
        setBooleanField(term806, term806.getClass(), "enabled", false);
        setBooleanField(term806, term806.getClass(), "valid", false);
        setField(term806, term806.getClass(), "dropTarget", null);
        setField(term806, term806.getClass(), "popups", null);
        setField(term806, term806.getClass(), "name", null);
        setBooleanField(term806, term806.getClass(), "nameExplicitlySet", false);
        setBooleanField(term806, term806.getClass(), "focusable", false);
        setIntField(term806, term806.getClass(), "isFocusTraversableOverridden", 0);
        setField(term806, term806.getClass(), "focusTraversalKeys", null);
        setBooleanField(term806, term806.getClass(), "focusTraversalKeysEnabled", false);
        setField(term806, term806.getClass(), "acc", null);
        setField(term806, term806.getClass(), "minSize", null);
        setBooleanField(term806, term806.getClass(), "minSizeSet", false);
        setField(term806, term806.getClass(), "prefSize", null);
        setBooleanField(term806, term806.getClass(), "prefSizeSet", false);
        setField(term806, term806.getClass(), "maxSize", null);
        setBooleanField(term806, term806.getClass(), "maxSizeSet", false);
        setField(term806, term806.getClass(), "componentOrientation", null);
        setBooleanField(term806, term806.getClass(), "newEventsOnly", false);
        setField(term806, term806.getClass(), "componentListener", null);
        setField(term806, term806.getClass(), "focusListener", null);
        setField(term806, term806.getClass(), "hierarchyListener", null);
        setField(term806, term806.getClass(), "hierarchyBoundsListener", null);
        setField(term806, term806.getClass(), "keyListener", null);
        setField(term806, term806.getClass(), "mouseListener", null);
        setField(term806, term806.getClass(), "mouseMotionListener", null);
        setField(term806, term806.getClass(), "mouseWheelListener", null);
        setField(term806, term806.getClass(), "inputMethodListener", null);
        setLongField(term806, term806.getClass(), "eventMask", 0L);
        setField(term806, term806.getClass(), "changeSupport", null);
        setField(term806, term806.getClass(), "objectLock", null);
        setBooleanField(term806, term806.getClass(), "isPacked", false);
        setIntField(term806, term806.getClass(), "boundsOp", 0);
        setField(term806, term806.getClass(), "compoundShape", null);
        setField(term806, term806.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term806, term806.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term806, term806.getClass(), "backgroundEraseDisabled", false);
        setField(term806, term806.getClass(), "eventCache", null);
        setBooleanField(term806, term806.getClass(), "coalescingEnabled", false);
        setBooleanField(term806, term806.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term806, term806.getClass(), "componentSerializedDataVersion", 0);
        setField(term806, term806.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$5");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term806, args);
    }

};


