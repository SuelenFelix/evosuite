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
     Object term905;

    public SettingsActivity_5_createToolTip_15573589993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term905 = newInstance(Class.forName("core.setting.SettingsActivity$5"));
        setField(term905, term905.getClass(), "dataModel", null);
        setField(term905, term905.getClass(), "renderer", null);
        setField(term905, term905.getClass(), "editor", null);
        setIntField(term905, term905.getClass(), "maximumRowCount", 0);
        setBooleanField(term905, term905.getClass(), "isEditable", false);
        setField(term905, term905.getClass(), "keySelectionManager", null);
        setField(term905, term905.getClass(), "actionCommand", null);
        setBooleanField(term905, term905.getClass(), "lightWeightPopupEnabled", false);
        setField(term905, term905.getClass(), "selectedItemReminder", null);
        setField(term905, term905.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term905, term905.getClass(), "firingActionEvent", false);
        setBooleanField(term905, term905.getClass(), "selectingItem", false);
        setBooleanField(term905, term905.getClass(), "updateInProgress", false);
        setField(term905, term905.getClass(), "action", null);
        setField(term905, term905.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term905, term905.getClass(), "isAlignmentXSet", false);
        setFloatField(term905, term905.getClass(), "alignmentX", 0.0F);
        setBooleanField(term905, term905.getClass(), "isAlignmentYSet", false);
        setFloatField(term905, term905.getClass(), "alignmentY", 0.0F);
        setField(term905, term905.getClass(), "ui", null);
        setField(term905, term905.getClass(), "listenerList", null);
        setField(term905, term905.getClass(), "clientProperties", null);
        setField(term905, term905.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term905, term905.getClass(), "autoscrolls", false);
        setField(term905, term905.getClass(), "border", null);
        setIntField(term905, term905.getClass(), "flags", 0);
        setField(term905, term905.getClass(), "inputVerifier", null);
        setBooleanField(term905, term905.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term905, term905.getClass(), "paintingChild", null);
        setField(term905, term905.getClass(), "popupMenu", null);
        setField(term905, term905.getClass(), "revalidateRunnableScheduled", null);
        setField(term905, term905.getClass(), "focusInputMap", null);
        setField(term905, term905.getClass(), "ancestorInputMap", null);
        setField(term905, term905.getClass(), "windowInputMap", null);
        setField(term905, term905.getClass(), "actionMap", null);
        setField(term905, term905.getClass(), "aaHint", null);
        setField(term905, term905.getClass(), "lcdRenderingHint", null);
        setField(term905, term905.getClass(), "component", null);
        setField(term905, term905.getClass(), "layoutMgr", null);
        setField(term905, term905.getClass(), "dispatcher", null);
        setField(term905, term905.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term905, term905.getClass(), "focusCycleRoot", false);
        setBooleanField(term905, term905.getClass(), "focusTraversalPolicyProvider", false);
        setField(term905, term905.getClass(), "printingThreads", null);
        setBooleanField(term905, term905.getClass(), "printing", false);
        setField(term905, term905.getClass(), "containerListener", null);
        setIntField(term905, term905.getClass(), "listeningChildren", 0);
        setIntField(term905, term905.getClass(), "listeningBoundsChildren", 0);
        setIntField(term905, term905.getClass(), "descendantsCount", 0);
        setField(term905, term905.getClass(), "preserveBackgroundColor", null);
        setIntField(term905, term905.getClass(), "numOfHWComponents", 0);
        setIntField(term905, term905.getClass(), "numOfLWComponents", 0);
        setField(term905, term905.getClass(), "modalComp", null);
        setField(term905, term905.getClass(), "modalAppContext", null);
        setIntField(term905, term905.getClass(), "containerSerializedDataVersion", 0);
        setField(term905, term905.getClass(), "peer", null);
        setField(term905, term905.getClass(), "parent", null);
        setField(term905, term905.getClass(), "appContext", null);
        setIntField(term905, term905.getClass(), "x", 0);
        setIntField(term905, term905.getClass(), "y", 0);
        setIntField(term905, term905.getClass(), "width", 0);
        setIntField(term905, term905.getClass(), "height", 0);
        setField(term905, term905.getClass(), "foreground", null);
        setField(term905, term905.getClass(), "background", null);
        setField(term905, term905.getClass(), "font", null);
        setField(term905, term905.getClass(), "peerFont", null);
        setField(term905, term905.getClass(), "cursor", null);
        setField(term905, term905.getClass(), "locale", null);
        setField(term905, term905.getClass(), "graphicsConfig", null);
        setField(term905, term905.getClass(), "bufferStrategy", null);
        setBooleanField(term905, term905.getClass(), "ignoreRepaint", false);
        setBooleanField(term905, term905.getClass(), "visible", false);
        setBooleanField(term905, term905.getClass(), "enabled", false);
        setBooleanField(term905, term905.getClass(), "valid", false);
        setField(term905, term905.getClass(), "dropTarget", null);
        setField(term905, term905.getClass(), "popups", null);
        setField(term905, term905.getClass(), "name", null);
        setBooleanField(term905, term905.getClass(), "nameExplicitlySet", false);
        setBooleanField(term905, term905.getClass(), "focusable", false);
        setIntField(term905, term905.getClass(), "isFocusTraversableOverridden", 0);
        setField(term905, term905.getClass(), "focusTraversalKeys", null);
        setBooleanField(term905, term905.getClass(), "focusTraversalKeysEnabled", false);
        setField(term905, term905.getClass(), "acc", null);
        setField(term905, term905.getClass(), "minSize", null);
        setBooleanField(term905, term905.getClass(), "minSizeSet", false);
        setField(term905, term905.getClass(), "prefSize", null);
        setBooleanField(term905, term905.getClass(), "prefSizeSet", false);
        setField(term905, term905.getClass(), "maxSize", null);
        setBooleanField(term905, term905.getClass(), "maxSizeSet", false);
        setField(term905, term905.getClass(), "componentOrientation", null);
        setBooleanField(term905, term905.getClass(), "newEventsOnly", false);
        setField(term905, term905.getClass(), "componentListener", null);
        setField(term905, term905.getClass(), "focusListener", null);
        setField(term905, term905.getClass(), "hierarchyListener", null);
        setField(term905, term905.getClass(), "hierarchyBoundsListener", null);
        setField(term905, term905.getClass(), "keyListener", null);
        setField(term905, term905.getClass(), "mouseListener", null);
        setField(term905, term905.getClass(), "mouseMotionListener", null);
        setField(term905, term905.getClass(), "mouseWheelListener", null);
        setField(term905, term905.getClass(), "inputMethodListener", null);
        setLongField(term905, term905.getClass(), "eventMask", 0L);
        setField(term905, term905.getClass(), "changeSupport", null);
        setField(term905, term905.getClass(), "objectLock", null);
        setBooleanField(term905, term905.getClass(), "isPacked", false);
        setIntField(term905, term905.getClass(), "boundsOp", 0);
        setField(term905, term905.getClass(), "compoundShape", null);
        setField(term905, term905.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term905, term905.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term905, term905.getClass(), "backgroundEraseDisabled", false);
        setField(term905, term905.getClass(), "eventCache", null);
        setBooleanField(term905, term905.getClass(), "coalescingEnabled", false);
        setBooleanField(term905, term905.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term905, term905.getClass(), "componentSerializedDataVersion", 0);
        setField(term905, term905.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$5");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term905, args);
    }

};


