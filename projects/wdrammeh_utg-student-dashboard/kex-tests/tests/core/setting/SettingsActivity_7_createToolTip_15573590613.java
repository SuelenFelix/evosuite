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
     Object term3856;

    public SettingsActivity_7_createToolTip_15573590613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3856 = newInstance(Class.forName("core.setting.SettingsActivity$7"));
        setField(term3856, term3856.getClass(), "dataModel", null);
        setField(term3856, term3856.getClass(), "renderer", null);
        setField(term3856, term3856.getClass(), "editor", null);
        setIntField(term3856, term3856.getClass(), "maximumRowCount", 0);
        setBooleanField(term3856, term3856.getClass(), "isEditable", false);
        setField(term3856, term3856.getClass(), "keySelectionManager", null);
        setField(term3856, term3856.getClass(), "actionCommand", null);
        setBooleanField(term3856, term3856.getClass(), "lightWeightPopupEnabled", false);
        setField(term3856, term3856.getClass(), "selectedItemReminder", null);
        setField(term3856, term3856.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term3856, term3856.getClass(), "firingActionEvent", false);
        setBooleanField(term3856, term3856.getClass(), "selectingItem", false);
        setBooleanField(term3856, term3856.getClass(), "updateInProgress", false);
        setField(term3856, term3856.getClass(), "action", null);
        setField(term3856, term3856.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term3856, term3856.getClass(), "isAlignmentXSet", false);
        setFloatField(term3856, term3856.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3856, term3856.getClass(), "isAlignmentYSet", false);
        setFloatField(term3856, term3856.getClass(), "alignmentY", 0.0F);
        setField(term3856, term3856.getClass(), "ui", null);
        setField(term3856, term3856.getClass(), "listenerList", null);
        setField(term3856, term3856.getClass(), "clientProperties", null);
        setField(term3856, term3856.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3856, term3856.getClass(), "autoscrolls", false);
        setField(term3856, term3856.getClass(), "border", null);
        setIntField(term3856, term3856.getClass(), "flags", 0);
        setField(term3856, term3856.getClass(), "inputVerifier", null);
        setBooleanField(term3856, term3856.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3856, term3856.getClass(), "paintingChild", null);
        setField(term3856, term3856.getClass(), "popupMenu", null);
        setField(term3856, term3856.getClass(), "revalidateRunnableScheduled", null);
        setField(term3856, term3856.getClass(), "focusInputMap", null);
        setField(term3856, term3856.getClass(), "ancestorInputMap", null);
        setField(term3856, term3856.getClass(), "windowInputMap", null);
        setField(term3856, term3856.getClass(), "actionMap", null);
        setField(term3856, term3856.getClass(), "aaHint", null);
        setField(term3856, term3856.getClass(), "lcdRenderingHint", null);
        setField(term3856, term3856.getClass(), "component", null);
        setField(term3856, term3856.getClass(), "layoutMgr", null);
        setField(term3856, term3856.getClass(), "dispatcher", null);
        setField(term3856, term3856.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3856, term3856.getClass(), "focusCycleRoot", false);
        setBooleanField(term3856, term3856.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3856, term3856.getClass(), "printingThreads", null);
        setBooleanField(term3856, term3856.getClass(), "printing", false);
        setField(term3856, term3856.getClass(), "containerListener", null);
        setIntField(term3856, term3856.getClass(), "listeningChildren", 0);
        setIntField(term3856, term3856.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3856, term3856.getClass(), "descendantsCount", 0);
        setField(term3856, term3856.getClass(), "preserveBackgroundColor", null);
        setIntField(term3856, term3856.getClass(), "numOfHWComponents", 0);
        setIntField(term3856, term3856.getClass(), "numOfLWComponents", 0);
        setField(term3856, term3856.getClass(), "modalComp", null);
        setField(term3856, term3856.getClass(), "modalAppContext", null);
        setIntField(term3856, term3856.getClass(), "containerSerializedDataVersion", 0);
        setField(term3856, term3856.getClass(), "peer", null);
        setField(term3856, term3856.getClass(), "parent", null);
        setField(term3856, term3856.getClass(), "appContext", null);
        setIntField(term3856, term3856.getClass(), "x", 0);
        setIntField(term3856, term3856.getClass(), "y", 0);
        setIntField(term3856, term3856.getClass(), "width", 0);
        setIntField(term3856, term3856.getClass(), "height", 0);
        setField(term3856, term3856.getClass(), "foreground", null);
        setField(term3856, term3856.getClass(), "background", null);
        setField(term3856, term3856.getClass(), "font", null);
        setField(term3856, term3856.getClass(), "peerFont", null);
        setField(term3856, term3856.getClass(), "cursor", null);
        setField(term3856, term3856.getClass(), "locale", null);
        setField(term3856, term3856.getClass(), "graphicsConfig", null);
        setField(term3856, term3856.getClass(), "bufferStrategy", null);
        setBooleanField(term3856, term3856.getClass(), "ignoreRepaint", false);
        setBooleanField(term3856, term3856.getClass(), "visible", false);
        setBooleanField(term3856, term3856.getClass(), "enabled", false);
        setBooleanField(term3856, term3856.getClass(), "valid", false);
        setField(term3856, term3856.getClass(), "dropTarget", null);
        setField(term3856, term3856.getClass(), "popups", null);
        setField(term3856, term3856.getClass(), "name", null);
        setBooleanField(term3856, term3856.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3856, term3856.getClass(), "focusable", false);
        setIntField(term3856, term3856.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3856, term3856.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3856, term3856.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3856, term3856.getClass(), "acc", null);
        setField(term3856, term3856.getClass(), "minSize", null);
        setBooleanField(term3856, term3856.getClass(), "minSizeSet", false);
        setField(term3856, term3856.getClass(), "prefSize", null);
        setBooleanField(term3856, term3856.getClass(), "prefSizeSet", false);
        setField(term3856, term3856.getClass(), "maxSize", null);
        setBooleanField(term3856, term3856.getClass(), "maxSizeSet", false);
        setField(term3856, term3856.getClass(), "componentOrientation", null);
        setBooleanField(term3856, term3856.getClass(), "newEventsOnly", false);
        setField(term3856, term3856.getClass(), "componentListener", null);
        setField(term3856, term3856.getClass(), "focusListener", null);
        setField(term3856, term3856.getClass(), "hierarchyListener", null);
        setField(term3856, term3856.getClass(), "hierarchyBoundsListener", null);
        setField(term3856, term3856.getClass(), "keyListener", null);
        setField(term3856, term3856.getClass(), "mouseListener", null);
        setField(term3856, term3856.getClass(), "mouseMotionListener", null);
        setField(term3856, term3856.getClass(), "mouseWheelListener", null);
        setField(term3856, term3856.getClass(), "inputMethodListener", null);
        setLongField(term3856, term3856.getClass(), "eventMask", 0L);
        setField(term3856, term3856.getClass(), "changeSupport", null);
        setField(term3856, term3856.getClass(), "objectLock", null);
        setBooleanField(term3856, term3856.getClass(), "isPacked", false);
        setIntField(term3856, term3856.getClass(), "boundsOp", 0);
        setField(term3856, term3856.getClass(), "compoundShape", null);
        setField(term3856, term3856.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3856, term3856.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3856, term3856.getClass(), "backgroundEraseDisabled", false);
        setField(term3856, term3856.getClass(), "eventCache", null);
        setBooleanField(term3856, term3856.getClass(), "coalescingEnabled", false);
        setBooleanField(term3856, term3856.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3856, term3856.getClass(), "componentSerializedDataVersion", 0);
        setField(term3856, term3856.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$7");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term3856, args);
    }

};


