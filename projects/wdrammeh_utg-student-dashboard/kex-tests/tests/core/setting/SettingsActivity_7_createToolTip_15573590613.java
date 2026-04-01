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

public class SettingsActivity_7_createToolTip_15573590613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147326;

    public SettingsActivity_7_createToolTip_15573590613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147326 = newInstance(Class.forName("core.setting.SettingsActivity$7"));
        setField(term147326, term147326.getClass(), "dataModel", null);
        setField(term147326, term147326.getClass(), "renderer", null);
        setField(term147326, term147326.getClass(), "editor", null);
        setIntField(term147326, term147326.getClass(), "maximumRowCount", 0);
        setBooleanField(term147326, term147326.getClass(), "isEditable", false);
        setField(term147326, term147326.getClass(), "keySelectionManager", null);
        setField(term147326, term147326.getClass(), "actionCommand", null);
        setBooleanField(term147326, term147326.getClass(), "lightWeightPopupEnabled", false);
        setField(term147326, term147326.getClass(), "selectedItemReminder", null);
        setField(term147326, term147326.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term147326, term147326.getClass(), "firingActionEvent", false);
        setBooleanField(term147326, term147326.getClass(), "selectingItem", false);
        setBooleanField(term147326, term147326.getClass(), "updateInProgress", false);
        setField(term147326, term147326.getClass(), "action", null);
        setField(term147326, term147326.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term147326, term147326.getClass(), "isAlignmentXSet", false);
        setFloatField(term147326, term147326.getClass(), "alignmentX", 0.0F);
        setBooleanField(term147326, term147326.getClass(), "isAlignmentYSet", false);
        setFloatField(term147326, term147326.getClass(), "alignmentY", 0.0F);
        setField(term147326, term147326.getClass(), "ui", null);
        setField(term147326, term147326.getClass(), "listenerList", null);
        setField(term147326, term147326.getClass(), "clientProperties", null);
        setField(term147326, term147326.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term147326, term147326.getClass(), "autoscrolls", false);
        setField(term147326, term147326.getClass(), "border", null);
        setIntField(term147326, term147326.getClass(), "flags", 0);
        setField(term147326, term147326.getClass(), "inputVerifier", null);
        setBooleanField(term147326, term147326.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term147326, term147326.getClass(), "paintingChild", null);
        setField(term147326, term147326.getClass(), "popupMenu", null);
        setField(term147326, term147326.getClass(), "revalidateRunnableScheduled", null);
        setField(term147326, term147326.getClass(), "focusInputMap", null);
        setField(term147326, term147326.getClass(), "ancestorInputMap", null);
        setField(term147326, term147326.getClass(), "windowInputMap", null);
        setField(term147326, term147326.getClass(), "actionMap", null);
        setField(term147326, term147326.getClass(), "aaHint", null);
        setField(term147326, term147326.getClass(), "lcdRenderingHint", null);
        setField(term147326, term147326.getClass(), "component", null);
        setField(term147326, term147326.getClass(), "layoutMgr", null);
        setField(term147326, term147326.getClass(), "dispatcher", null);
        setField(term147326, term147326.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term147326, term147326.getClass(), "focusCycleRoot", false);
        setBooleanField(term147326, term147326.getClass(), "focusTraversalPolicyProvider", false);
        setField(term147326, term147326.getClass(), "printingThreads", null);
        setBooleanField(term147326, term147326.getClass(), "printing", false);
        setField(term147326, term147326.getClass(), "containerListener", null);
        setIntField(term147326, term147326.getClass(), "listeningChildren", 0);
        setIntField(term147326, term147326.getClass(), "listeningBoundsChildren", 0);
        setIntField(term147326, term147326.getClass(), "descendantsCount", 0);
        setField(term147326, term147326.getClass(), "preserveBackgroundColor", null);
        setIntField(term147326, term147326.getClass(), "numOfHWComponents", 0);
        setIntField(term147326, term147326.getClass(), "numOfLWComponents", 0);
        setField(term147326, term147326.getClass(), "modalComp", null);
        setField(term147326, term147326.getClass(), "modalAppContext", null);
        setIntField(term147326, term147326.getClass(), "containerSerializedDataVersion", 0);
        setField(term147326, term147326.getClass(), "peer", null);
        setField(term147326, term147326.getClass(), "parent", null);
        setField(term147326, term147326.getClass(), "appContext", null);
        setIntField(term147326, term147326.getClass(), "x", 0);
        setIntField(term147326, term147326.getClass(), "y", 0);
        setIntField(term147326, term147326.getClass(), "width", 0);
        setIntField(term147326, term147326.getClass(), "height", 0);
        setField(term147326, term147326.getClass(), "foreground", null);
        setField(term147326, term147326.getClass(), "background", null);
        setField(term147326, term147326.getClass(), "font", null);
        setField(term147326, term147326.getClass(), "peerFont", null);
        setField(term147326, term147326.getClass(), "cursor", null);
        setField(term147326, term147326.getClass(), "locale", null);
        setField(term147326, term147326.getClass(), "graphicsConfig", null);
        setField(term147326, term147326.getClass(), "bufferStrategy", null);
        setBooleanField(term147326, term147326.getClass(), "ignoreRepaint", false);
        setBooleanField(term147326, term147326.getClass(), "visible", false);
        setBooleanField(term147326, term147326.getClass(), "enabled", false);
        setBooleanField(term147326, term147326.getClass(), "valid", false);
        setField(term147326, term147326.getClass(), "dropTarget", null);
        setField(term147326, term147326.getClass(), "popups", null);
        setField(term147326, term147326.getClass(), "name", null);
        setBooleanField(term147326, term147326.getClass(), "nameExplicitlySet", false);
        setBooleanField(term147326, term147326.getClass(), "focusable", false);
        setIntField(term147326, term147326.getClass(), "isFocusTraversableOverridden", 0);
        setField(term147326, term147326.getClass(), "focusTraversalKeys", null);
        setBooleanField(term147326, term147326.getClass(), "focusTraversalKeysEnabled", false);
        setField(term147326, term147326.getClass(), "acc", null);
        setField(term147326, term147326.getClass(), "minSize", null);
        setBooleanField(term147326, term147326.getClass(), "minSizeSet", false);
        setField(term147326, term147326.getClass(), "prefSize", null);
        setBooleanField(term147326, term147326.getClass(), "prefSizeSet", false);
        setField(term147326, term147326.getClass(), "maxSize", null);
        setBooleanField(term147326, term147326.getClass(), "maxSizeSet", false);
        setField(term147326, term147326.getClass(), "componentOrientation", null);
        setBooleanField(term147326, term147326.getClass(), "newEventsOnly", false);
        setField(term147326, term147326.getClass(), "componentListener", null);
        setField(term147326, term147326.getClass(), "focusListener", null);
        setField(term147326, term147326.getClass(), "hierarchyListener", null);
        setField(term147326, term147326.getClass(), "hierarchyBoundsListener", null);
        setField(term147326, term147326.getClass(), "keyListener", null);
        setField(term147326, term147326.getClass(), "mouseListener", null);
        setField(term147326, term147326.getClass(), "mouseMotionListener", null);
        setField(term147326, term147326.getClass(), "mouseWheelListener", null);
        setField(term147326, term147326.getClass(), "inputMethodListener", null);
        setLongField(term147326, term147326.getClass(), "eventMask", 0L);
        setField(term147326, term147326.getClass(), "changeSupport", null);
        setField(term147326, term147326.getClass(), "objectLock", null);
        setBooleanField(term147326, term147326.getClass(), "isPacked", false);
        setIntField(term147326, term147326.getClass(), "boundsOp", 0);
        setField(term147326, term147326.getClass(), "compoundShape", null);
        setField(term147326, term147326.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term147326, term147326.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term147326, term147326.getClass(), "backgroundEraseDisabled", false);
        setField(term147326, term147326.getClass(), "eventCache", null);
        setBooleanField(term147326, term147326.getClass(), "coalescingEnabled", false);
        setBooleanField(term147326, term147326.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term147326, term147326.getClass(), "componentSerializedDataVersion", 0);
        setField(term147326, term147326.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$7");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term147326, args);
    }

};


