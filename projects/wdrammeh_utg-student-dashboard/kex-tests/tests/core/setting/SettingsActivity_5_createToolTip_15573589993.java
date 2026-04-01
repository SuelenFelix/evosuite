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

public class SettingsActivity_5_createToolTip_15573589993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144336;

    public SettingsActivity_5_createToolTip_15573589993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144336 = newInstance(Class.forName("core.setting.SettingsActivity$5"));
        setField(term144336, term144336.getClass(), "dataModel", null);
        setField(term144336, term144336.getClass(), "renderer", null);
        setField(term144336, term144336.getClass(), "editor", null);
        setIntField(term144336, term144336.getClass(), "maximumRowCount", 0);
        setBooleanField(term144336, term144336.getClass(), "isEditable", false);
        setField(term144336, term144336.getClass(), "keySelectionManager", null);
        setField(term144336, term144336.getClass(), "actionCommand", null);
        setBooleanField(term144336, term144336.getClass(), "lightWeightPopupEnabled", false);
        setField(term144336, term144336.getClass(), "selectedItemReminder", null);
        setField(term144336, term144336.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term144336, term144336.getClass(), "firingActionEvent", false);
        setBooleanField(term144336, term144336.getClass(), "selectingItem", false);
        setBooleanField(term144336, term144336.getClass(), "updateInProgress", false);
        setField(term144336, term144336.getClass(), "action", null);
        setField(term144336, term144336.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term144336, term144336.getClass(), "isAlignmentXSet", false);
        setFloatField(term144336, term144336.getClass(), "alignmentX", 0.0F);
        setBooleanField(term144336, term144336.getClass(), "isAlignmentYSet", false);
        setFloatField(term144336, term144336.getClass(), "alignmentY", 0.0F);
        setField(term144336, term144336.getClass(), "ui", null);
        setField(term144336, term144336.getClass(), "listenerList", null);
        setField(term144336, term144336.getClass(), "clientProperties", null);
        setField(term144336, term144336.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term144336, term144336.getClass(), "autoscrolls", false);
        setField(term144336, term144336.getClass(), "border", null);
        setIntField(term144336, term144336.getClass(), "flags", 0);
        setField(term144336, term144336.getClass(), "inputVerifier", null);
        setBooleanField(term144336, term144336.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term144336, term144336.getClass(), "paintingChild", null);
        setField(term144336, term144336.getClass(), "popupMenu", null);
        setField(term144336, term144336.getClass(), "revalidateRunnableScheduled", null);
        setField(term144336, term144336.getClass(), "focusInputMap", null);
        setField(term144336, term144336.getClass(), "ancestorInputMap", null);
        setField(term144336, term144336.getClass(), "windowInputMap", null);
        setField(term144336, term144336.getClass(), "actionMap", null);
        setField(term144336, term144336.getClass(), "aaHint", null);
        setField(term144336, term144336.getClass(), "lcdRenderingHint", null);
        setField(term144336, term144336.getClass(), "component", null);
        setField(term144336, term144336.getClass(), "layoutMgr", null);
        setField(term144336, term144336.getClass(), "dispatcher", null);
        setField(term144336, term144336.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term144336, term144336.getClass(), "focusCycleRoot", false);
        setBooleanField(term144336, term144336.getClass(), "focusTraversalPolicyProvider", false);
        setField(term144336, term144336.getClass(), "printingThreads", null);
        setBooleanField(term144336, term144336.getClass(), "printing", false);
        setField(term144336, term144336.getClass(), "containerListener", null);
        setIntField(term144336, term144336.getClass(), "listeningChildren", 0);
        setIntField(term144336, term144336.getClass(), "listeningBoundsChildren", 0);
        setIntField(term144336, term144336.getClass(), "descendantsCount", 0);
        setField(term144336, term144336.getClass(), "preserveBackgroundColor", null);
        setIntField(term144336, term144336.getClass(), "numOfHWComponents", 0);
        setIntField(term144336, term144336.getClass(), "numOfLWComponents", 0);
        setField(term144336, term144336.getClass(), "modalComp", null);
        setField(term144336, term144336.getClass(), "modalAppContext", null);
        setIntField(term144336, term144336.getClass(), "containerSerializedDataVersion", 0);
        setField(term144336, term144336.getClass(), "peer", null);
        setField(term144336, term144336.getClass(), "parent", null);
        setField(term144336, term144336.getClass(), "appContext", null);
        setIntField(term144336, term144336.getClass(), "x", 0);
        setIntField(term144336, term144336.getClass(), "y", 0);
        setIntField(term144336, term144336.getClass(), "width", 0);
        setIntField(term144336, term144336.getClass(), "height", 0);
        setField(term144336, term144336.getClass(), "foreground", null);
        setField(term144336, term144336.getClass(), "background", null);
        setField(term144336, term144336.getClass(), "font", null);
        setField(term144336, term144336.getClass(), "peerFont", null);
        setField(term144336, term144336.getClass(), "cursor", null);
        setField(term144336, term144336.getClass(), "locale", null);
        setField(term144336, term144336.getClass(), "graphicsConfig", null);
        setField(term144336, term144336.getClass(), "bufferStrategy", null);
        setBooleanField(term144336, term144336.getClass(), "ignoreRepaint", false);
        setBooleanField(term144336, term144336.getClass(), "visible", false);
        setBooleanField(term144336, term144336.getClass(), "enabled", false);
        setBooleanField(term144336, term144336.getClass(), "valid", false);
        setField(term144336, term144336.getClass(), "dropTarget", null);
        setField(term144336, term144336.getClass(), "popups", null);
        setField(term144336, term144336.getClass(), "name", null);
        setBooleanField(term144336, term144336.getClass(), "nameExplicitlySet", false);
        setBooleanField(term144336, term144336.getClass(), "focusable", false);
        setIntField(term144336, term144336.getClass(), "isFocusTraversableOverridden", 0);
        setField(term144336, term144336.getClass(), "focusTraversalKeys", null);
        setBooleanField(term144336, term144336.getClass(), "focusTraversalKeysEnabled", false);
        setField(term144336, term144336.getClass(), "acc", null);
        setField(term144336, term144336.getClass(), "minSize", null);
        setBooleanField(term144336, term144336.getClass(), "minSizeSet", false);
        setField(term144336, term144336.getClass(), "prefSize", null);
        setBooleanField(term144336, term144336.getClass(), "prefSizeSet", false);
        setField(term144336, term144336.getClass(), "maxSize", null);
        setBooleanField(term144336, term144336.getClass(), "maxSizeSet", false);
        setField(term144336, term144336.getClass(), "componentOrientation", null);
        setBooleanField(term144336, term144336.getClass(), "newEventsOnly", false);
        setField(term144336, term144336.getClass(), "componentListener", null);
        setField(term144336, term144336.getClass(), "focusListener", null);
        setField(term144336, term144336.getClass(), "hierarchyListener", null);
        setField(term144336, term144336.getClass(), "hierarchyBoundsListener", null);
        setField(term144336, term144336.getClass(), "keyListener", null);
        setField(term144336, term144336.getClass(), "mouseListener", null);
        setField(term144336, term144336.getClass(), "mouseMotionListener", null);
        setField(term144336, term144336.getClass(), "mouseWheelListener", null);
        setField(term144336, term144336.getClass(), "inputMethodListener", null);
        setLongField(term144336, term144336.getClass(), "eventMask", 0L);
        setField(term144336, term144336.getClass(), "changeSupport", null);
        setField(term144336, term144336.getClass(), "objectLock", null);
        setBooleanField(term144336, term144336.getClass(), "isPacked", false);
        setIntField(term144336, term144336.getClass(), "boundsOp", 0);
        setField(term144336, term144336.getClass(), "compoundShape", null);
        setField(term144336, term144336.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term144336, term144336.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term144336, term144336.getClass(), "backgroundEraseDisabled", false);
        setField(term144336, term144336.getClass(), "eventCache", null);
        setBooleanField(term144336, term144336.getClass(), "coalescingEnabled", false);
        setBooleanField(term144336, term144336.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term144336, term144336.getClass(), "componentSerializedDataVersion", 0);
        setField(term144336, term144336.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$5");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term144336, args);
    }

};


