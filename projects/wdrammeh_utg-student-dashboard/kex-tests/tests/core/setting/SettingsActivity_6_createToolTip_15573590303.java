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

public class SettingsActivity_6_createToolTip_15573590303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144123;

    public SettingsActivity_6_createToolTip_15573590303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144123 = newInstance(Class.forName("core.setting.SettingsActivity$6"));
        setField(term144123, term144123.getClass(), "dataModel", null);
        setField(term144123, term144123.getClass(), "renderer", null);
        setField(term144123, term144123.getClass(), "editor", null);
        setIntField(term144123, term144123.getClass(), "maximumRowCount", 0);
        setBooleanField(term144123, term144123.getClass(), "isEditable", false);
        setField(term144123, term144123.getClass(), "keySelectionManager", null);
        setField(term144123, term144123.getClass(), "actionCommand", null);
        setBooleanField(term144123, term144123.getClass(), "lightWeightPopupEnabled", false);
        setField(term144123, term144123.getClass(), "selectedItemReminder", null);
        setField(term144123, term144123.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term144123, term144123.getClass(), "firingActionEvent", false);
        setBooleanField(term144123, term144123.getClass(), "selectingItem", false);
        setBooleanField(term144123, term144123.getClass(), "updateInProgress", false);
        setField(term144123, term144123.getClass(), "action", null);
        setField(term144123, term144123.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term144123, term144123.getClass(), "isAlignmentXSet", false);
        setFloatField(term144123, term144123.getClass(), "alignmentX", 0.0F);
        setBooleanField(term144123, term144123.getClass(), "isAlignmentYSet", false);
        setFloatField(term144123, term144123.getClass(), "alignmentY", 0.0F);
        setField(term144123, term144123.getClass(), "ui", null);
        setField(term144123, term144123.getClass(), "listenerList", null);
        setField(term144123, term144123.getClass(), "clientProperties", null);
        setField(term144123, term144123.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term144123, term144123.getClass(), "autoscrolls", false);
        setField(term144123, term144123.getClass(), "border", null);
        setIntField(term144123, term144123.getClass(), "flags", 0);
        setField(term144123, term144123.getClass(), "inputVerifier", null);
        setBooleanField(term144123, term144123.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term144123, term144123.getClass(), "paintingChild", null);
        setField(term144123, term144123.getClass(), "popupMenu", null);
        setField(term144123, term144123.getClass(), "revalidateRunnableScheduled", null);
        setField(term144123, term144123.getClass(), "focusInputMap", null);
        setField(term144123, term144123.getClass(), "ancestorInputMap", null);
        setField(term144123, term144123.getClass(), "windowInputMap", null);
        setField(term144123, term144123.getClass(), "actionMap", null);
        setField(term144123, term144123.getClass(), "aaHint", null);
        setField(term144123, term144123.getClass(), "lcdRenderingHint", null);
        setField(term144123, term144123.getClass(), "component", null);
        setField(term144123, term144123.getClass(), "layoutMgr", null);
        setField(term144123, term144123.getClass(), "dispatcher", null);
        setField(term144123, term144123.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term144123, term144123.getClass(), "focusCycleRoot", false);
        setBooleanField(term144123, term144123.getClass(), "focusTraversalPolicyProvider", false);
        setField(term144123, term144123.getClass(), "printingThreads", null);
        setBooleanField(term144123, term144123.getClass(), "printing", false);
        setField(term144123, term144123.getClass(), "containerListener", null);
        setIntField(term144123, term144123.getClass(), "listeningChildren", 0);
        setIntField(term144123, term144123.getClass(), "listeningBoundsChildren", 0);
        setIntField(term144123, term144123.getClass(), "descendantsCount", 0);
        setField(term144123, term144123.getClass(), "preserveBackgroundColor", null);
        setIntField(term144123, term144123.getClass(), "numOfHWComponents", 0);
        setIntField(term144123, term144123.getClass(), "numOfLWComponents", 0);
        setField(term144123, term144123.getClass(), "modalComp", null);
        setField(term144123, term144123.getClass(), "modalAppContext", null);
        setIntField(term144123, term144123.getClass(), "containerSerializedDataVersion", 0);
        setField(term144123, term144123.getClass(), "peer", null);
        setField(term144123, term144123.getClass(), "parent", null);
        setField(term144123, term144123.getClass(), "appContext", null);
        setIntField(term144123, term144123.getClass(), "x", 0);
        setIntField(term144123, term144123.getClass(), "y", 0);
        setIntField(term144123, term144123.getClass(), "width", 0);
        setIntField(term144123, term144123.getClass(), "height", 0);
        setField(term144123, term144123.getClass(), "foreground", null);
        setField(term144123, term144123.getClass(), "background", null);
        setField(term144123, term144123.getClass(), "font", null);
        setField(term144123, term144123.getClass(), "peerFont", null);
        setField(term144123, term144123.getClass(), "cursor", null);
        setField(term144123, term144123.getClass(), "locale", null);
        setField(term144123, term144123.getClass(), "graphicsConfig", null);
        setField(term144123, term144123.getClass(), "bufferStrategy", null);
        setBooleanField(term144123, term144123.getClass(), "ignoreRepaint", false);
        setBooleanField(term144123, term144123.getClass(), "visible", false);
        setBooleanField(term144123, term144123.getClass(), "enabled", false);
        setBooleanField(term144123, term144123.getClass(), "valid", false);
        setField(term144123, term144123.getClass(), "dropTarget", null);
        setField(term144123, term144123.getClass(), "popups", null);
        setField(term144123, term144123.getClass(), "name", null);
        setBooleanField(term144123, term144123.getClass(), "nameExplicitlySet", false);
        setBooleanField(term144123, term144123.getClass(), "focusable", false);
        setIntField(term144123, term144123.getClass(), "isFocusTraversableOverridden", 0);
        setField(term144123, term144123.getClass(), "focusTraversalKeys", null);
        setBooleanField(term144123, term144123.getClass(), "focusTraversalKeysEnabled", false);
        setField(term144123, term144123.getClass(), "acc", null);
        setField(term144123, term144123.getClass(), "minSize", null);
        setBooleanField(term144123, term144123.getClass(), "minSizeSet", false);
        setField(term144123, term144123.getClass(), "prefSize", null);
        setBooleanField(term144123, term144123.getClass(), "prefSizeSet", false);
        setField(term144123, term144123.getClass(), "maxSize", null);
        setBooleanField(term144123, term144123.getClass(), "maxSizeSet", false);
        setField(term144123, term144123.getClass(), "componentOrientation", null);
        setBooleanField(term144123, term144123.getClass(), "newEventsOnly", false);
        setField(term144123, term144123.getClass(), "componentListener", null);
        setField(term144123, term144123.getClass(), "focusListener", null);
        setField(term144123, term144123.getClass(), "hierarchyListener", null);
        setField(term144123, term144123.getClass(), "hierarchyBoundsListener", null);
        setField(term144123, term144123.getClass(), "keyListener", null);
        setField(term144123, term144123.getClass(), "mouseListener", null);
        setField(term144123, term144123.getClass(), "mouseMotionListener", null);
        setField(term144123, term144123.getClass(), "mouseWheelListener", null);
        setField(term144123, term144123.getClass(), "inputMethodListener", null);
        setLongField(term144123, term144123.getClass(), "eventMask", 0L);
        setField(term144123, term144123.getClass(), "changeSupport", null);
        setField(term144123, term144123.getClass(), "objectLock", null);
        setBooleanField(term144123, term144123.getClass(), "isPacked", false);
        setIntField(term144123, term144123.getClass(), "boundsOp", 0);
        setField(term144123, term144123.getClass(), "compoundShape", null);
        setField(term144123, term144123.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term144123, term144123.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term144123, term144123.getClass(), "backgroundEraseDisabled", false);
        setField(term144123, term144123.getClass(), "eventCache", null);
        setBooleanField(term144123, term144123.getClass(), "coalescingEnabled", false);
        setBooleanField(term144123, term144123.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term144123, term144123.getClass(), "componentSerializedDataVersion", 0);
        setField(term144123, term144123.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$6");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term144123, args);
    }

};


