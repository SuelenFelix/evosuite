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

public class SettingsActivity_6_createToolTip_15573590301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;

    public SettingsActivity_6_createToolTip_15573590301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term571 = newInstance(Class.forName("core.setting.SettingsActivity$6"));
        Object term587 = newInstance(Class.forName("java.lang.Object"));
        Object term607 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term608 = (Object[]) newArray("java.lang.Object", 0);
        Object term609 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term610 = newInstance(Class.forName("java.lang.Object"));
        Object term611 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term612 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term613 = newInstance(Class.forName("java.lang.Object"));
        setField(term571, term571.getClass(), "dataModel", null);
        setField(term571, term571.getClass(), "renderer", null);
        setField(term571, term571.getClass(), "editor", null);
        setIntField(term571, term571.getClass(), "maximumRowCount", -1048298087);
        setBooleanField(term571, term571.getClass(), "isEditable", true);
        setField(term571, term571.getClass(), "keySelectionManager", null);
        setField(term571, term571.getClass(), "actionCommand", "ZiaGIbnzTs");
        setBooleanField(term571, term571.getClass(), "lightWeightPopupEnabled", true);
        setField(term571, term571.getClass(), "selectedItemReminder", term587);
        setField(term571, term571.getClass(), "prototypeDisplayValue", "tbcdzjIfER");
        setBooleanField(term571, term571.getClass(), "firingActionEvent", true);
        setBooleanField(term571, term571.getClass(), "selectingItem", true);
        setBooleanField(term571, term571.getClass(), "updateInProgress", false);
        setField(term571, term571.getClass(), "action", null);
        setField(term571, term571.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term571, term571.getClass(), "isAlignmentXSet", true);
        setFloatField(term571, term571.getClass(), "alignmentX", 0.5446086F);
        setBooleanField(term571, term571.getClass(), "isAlignmentYSet", true);
        setFloatField(term571, term571.getClass(), "alignmentY", 0.5254275F);
        setField(term571, term571.getClass(), "ui", null);
        setField(term607, term607.getClass(), "listenerList", term608);
        setField(term571, term571.getClass(), "listenerList", term607);
        setField(term609, term609.getClass(), "table", term610);
        setField(term571, term571.getClass(), "clientProperties", term609);
        setField(term612, term612.getClass(), "map", null);
        setField(term611, term611.getClass(), "map", term612);
        setField(term611, term611.getClass(), "source", term613);
        setField(term571, term571.getClass(), "vetoableChangeSupport", term611);
        setBooleanField(term571, term571.getClass(), "autoscrolls", true);
        setField(term571, term571.getClass(), "border", null);
        setIntField(term571, term571.getClass(), "flags", 458147407);
        setField(term571, term571.getClass(), "inputVerifier", null);
        setBooleanField(term571, term571.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term571, term571.getClass(), "paintingChild", null);
        setField(term571, term571.getClass(), "popupMenu", null);
        setField(term571, term571.getClass(), "revalidateRunnableScheduled", null);
        setField(term571, term571.getClass(), "focusInputMap", null);
        setField(term571, term571.getClass(), "ancestorInputMap", null);
        setField(term571, term571.getClass(), "windowInputMap", null);
        setField(term571, term571.getClass(), "actionMap", null);
        setField(term571, term571.getClass(), "aaHint", null);
        setField(term571, term571.getClass(), "lcdRenderingHint", null);
        setField(term571, term571.getClass(), "component", null);
        setField(term571, term571.getClass(), "layoutMgr", null);
        setField(term571, term571.getClass(), "dispatcher", null);
        setField(term571, term571.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term571, term571.getClass(), "focusCycleRoot", false);
        setBooleanField(term571, term571.getClass(), "focusTraversalPolicyProvider", false);
        setField(term571, term571.getClass(), "printingThreads", null);
        setBooleanField(term571, term571.getClass(), "printing", false);
        setField(term571, term571.getClass(), "containerListener", null);
        setIntField(term571, term571.getClass(), "listeningChildren", 0);
        setIntField(term571, term571.getClass(), "listeningBoundsChildren", 0);
        setIntField(term571, term571.getClass(), "descendantsCount", 0);
        setField(term571, term571.getClass(), "preserveBackgroundColor", null);
        setIntField(term571, term571.getClass(), "numOfHWComponents", 0);
        setIntField(term571, term571.getClass(), "numOfLWComponents", 0);
        setField(term571, term571.getClass(), "modalComp", null);
        setField(term571, term571.getClass(), "modalAppContext", null);
        setIntField(term571, term571.getClass(), "containerSerializedDataVersion", 0);
        setField(term571, term571.getClass(), "peer", null);
        setField(term571, term571.getClass(), "parent", null);
        setField(term571, term571.getClass(), "appContext", null);
        setIntField(term571, term571.getClass(), "x", 0);
        setIntField(term571, term571.getClass(), "y", 0);
        setIntField(term571, term571.getClass(), "width", 0);
        setIntField(term571, term571.getClass(), "height", 0);
        setField(term571, term571.getClass(), "foreground", null);
        setField(term571, term571.getClass(), "background", null);
        setField(term571, term571.getClass(), "font", null);
        setField(term571, term571.getClass(), "peerFont", null);
        setField(term571, term571.getClass(), "cursor", null);
        setField(term571, term571.getClass(), "locale", null);
        setField(term571, term571.getClass(), "graphicsConfig", null);
        setField(term571, term571.getClass(), "bufferStrategy", null);
        setBooleanField(term571, term571.getClass(), "ignoreRepaint", false);
        setBooleanField(term571, term571.getClass(), "visible", false);
        setBooleanField(term571, term571.getClass(), "enabled", false);
        setBooleanField(term571, term571.getClass(), "valid", false);
        setField(term571, term571.getClass(), "dropTarget", null);
        setField(term571, term571.getClass(), "popups", null);
        setField(term571, term571.getClass(), "name", null);
        setBooleanField(term571, term571.getClass(), "nameExplicitlySet", false);
        setBooleanField(term571, term571.getClass(), "focusable", false);
        setIntField(term571, term571.getClass(), "isFocusTraversableOverridden", 0);
        setField(term571, term571.getClass(), "focusTraversalKeys", null);
        setBooleanField(term571, term571.getClass(), "focusTraversalKeysEnabled", false);
        setField(term571, term571.getClass(), "acc", null);
        setField(term571, term571.getClass(), "minSize", null);
        setBooleanField(term571, term571.getClass(), "minSizeSet", false);
        setField(term571, term571.getClass(), "prefSize", null);
        setBooleanField(term571, term571.getClass(), "prefSizeSet", false);
        setField(term571, term571.getClass(), "maxSize", null);
        setBooleanField(term571, term571.getClass(), "maxSizeSet", false);
        setField(term571, term571.getClass(), "componentOrientation", null);
        setBooleanField(term571, term571.getClass(), "newEventsOnly", false);
        setField(term571, term571.getClass(), "componentListener", null);
        setField(term571, term571.getClass(), "focusListener", null);
        setField(term571, term571.getClass(), "hierarchyListener", null);
        setField(term571, term571.getClass(), "hierarchyBoundsListener", null);
        setField(term571, term571.getClass(), "keyListener", null);
        setField(term571, term571.getClass(), "mouseListener", null);
        setField(term571, term571.getClass(), "mouseMotionListener", null);
        setField(term571, term571.getClass(), "mouseWheelListener", null);
        setField(term571, term571.getClass(), "inputMethodListener", null);
        setLongField(term571, term571.getClass(), "eventMask", 0L);
        setField(term571, term571.getClass(), "changeSupport", null);
        setField(term571, term571.getClass(), "objectLock", null);
        setBooleanField(term571, term571.getClass(), "isPacked", false);
        setIntField(term571, term571.getClass(), "boundsOp", 0);
        setField(term571, term571.getClass(), "compoundShape", null);
        setField(term571, term571.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term571, term571.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term571, term571.getClass(), "backgroundEraseDisabled", false);
        setField(term571, term571.getClass(), "eventCache", null);
        setBooleanField(term571, term571.getClass(), "coalescingEnabled", false);
        setBooleanField(term571, term571.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term571, term571.getClass(), "componentSerializedDataVersion", 0);
        setField(term571, term571.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$6");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term571, args);
    }

};


