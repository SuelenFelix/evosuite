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
     Object term670;

    public SettingsActivity_6_createToolTip_15573590303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term670 = newInstance(Class.forName("core.setting.SettingsActivity$6"));
        setField(term670, term670.getClass(), "dataModel", null);
        setField(term670, term670.getClass(), "renderer", null);
        setField(term670, term670.getClass(), "editor", null);
        setIntField(term670, term670.getClass(), "maximumRowCount", 0);
        setBooleanField(term670, term670.getClass(), "isEditable", false);
        setField(term670, term670.getClass(), "keySelectionManager", null);
        setField(term670, term670.getClass(), "actionCommand", null);
        setBooleanField(term670, term670.getClass(), "lightWeightPopupEnabled", false);
        setField(term670, term670.getClass(), "selectedItemReminder", null);
        setField(term670, term670.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term670, term670.getClass(), "firingActionEvent", false);
        setBooleanField(term670, term670.getClass(), "selectingItem", false);
        setBooleanField(term670, term670.getClass(), "updateInProgress", false);
        setField(term670, term670.getClass(), "action", null);
        setField(term670, term670.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term670, term670.getClass(), "isAlignmentXSet", false);
        setFloatField(term670, term670.getClass(), "alignmentX", 0.0F);
        setBooleanField(term670, term670.getClass(), "isAlignmentYSet", false);
        setFloatField(term670, term670.getClass(), "alignmentY", 0.0F);
        setField(term670, term670.getClass(), "ui", null);
        setField(term670, term670.getClass(), "listenerList", null);
        setField(term670, term670.getClass(), "clientProperties", null);
        setField(term670, term670.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term670, term670.getClass(), "autoscrolls", false);
        setField(term670, term670.getClass(), "border", null);
        setIntField(term670, term670.getClass(), "flags", 0);
        setField(term670, term670.getClass(), "inputVerifier", null);
        setBooleanField(term670, term670.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term670, term670.getClass(), "paintingChild", null);
        setField(term670, term670.getClass(), "popupMenu", null);
        setField(term670, term670.getClass(), "revalidateRunnableScheduled", null);
        setField(term670, term670.getClass(), "focusInputMap", null);
        setField(term670, term670.getClass(), "ancestorInputMap", null);
        setField(term670, term670.getClass(), "windowInputMap", null);
        setField(term670, term670.getClass(), "actionMap", null);
        setField(term670, term670.getClass(), "aaHint", null);
        setField(term670, term670.getClass(), "lcdRenderingHint", null);
        setField(term670, term670.getClass(), "component", null);
        setField(term670, term670.getClass(), "layoutMgr", null);
        setField(term670, term670.getClass(), "dispatcher", null);
        setField(term670, term670.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term670, term670.getClass(), "focusCycleRoot", false);
        setBooleanField(term670, term670.getClass(), "focusTraversalPolicyProvider", false);
        setField(term670, term670.getClass(), "printingThreads", null);
        setBooleanField(term670, term670.getClass(), "printing", false);
        setField(term670, term670.getClass(), "containerListener", null);
        setIntField(term670, term670.getClass(), "listeningChildren", 0);
        setIntField(term670, term670.getClass(), "listeningBoundsChildren", 0);
        setIntField(term670, term670.getClass(), "descendantsCount", 0);
        setField(term670, term670.getClass(), "preserveBackgroundColor", null);
        setIntField(term670, term670.getClass(), "numOfHWComponents", 0);
        setIntField(term670, term670.getClass(), "numOfLWComponents", 0);
        setField(term670, term670.getClass(), "modalComp", null);
        setField(term670, term670.getClass(), "modalAppContext", null);
        setIntField(term670, term670.getClass(), "containerSerializedDataVersion", 0);
        setField(term670, term670.getClass(), "peer", null);
        setField(term670, term670.getClass(), "parent", null);
        setField(term670, term670.getClass(), "appContext", null);
        setIntField(term670, term670.getClass(), "x", 0);
        setIntField(term670, term670.getClass(), "y", 0);
        setIntField(term670, term670.getClass(), "width", 0);
        setIntField(term670, term670.getClass(), "height", 0);
        setField(term670, term670.getClass(), "foreground", null);
        setField(term670, term670.getClass(), "background", null);
        setField(term670, term670.getClass(), "font", null);
        setField(term670, term670.getClass(), "peerFont", null);
        setField(term670, term670.getClass(), "cursor", null);
        setField(term670, term670.getClass(), "locale", null);
        setField(term670, term670.getClass(), "graphicsConfig", null);
        setField(term670, term670.getClass(), "bufferStrategy", null);
        setBooleanField(term670, term670.getClass(), "ignoreRepaint", false);
        setBooleanField(term670, term670.getClass(), "visible", false);
        setBooleanField(term670, term670.getClass(), "enabled", false);
        setBooleanField(term670, term670.getClass(), "valid", false);
        setField(term670, term670.getClass(), "dropTarget", null);
        setField(term670, term670.getClass(), "popups", null);
        setField(term670, term670.getClass(), "name", null);
        setBooleanField(term670, term670.getClass(), "nameExplicitlySet", false);
        setBooleanField(term670, term670.getClass(), "focusable", false);
        setIntField(term670, term670.getClass(), "isFocusTraversableOverridden", 0);
        setField(term670, term670.getClass(), "focusTraversalKeys", null);
        setBooleanField(term670, term670.getClass(), "focusTraversalKeysEnabled", false);
        setField(term670, term670.getClass(), "acc", null);
        setField(term670, term670.getClass(), "minSize", null);
        setBooleanField(term670, term670.getClass(), "minSizeSet", false);
        setField(term670, term670.getClass(), "prefSize", null);
        setBooleanField(term670, term670.getClass(), "prefSizeSet", false);
        setField(term670, term670.getClass(), "maxSize", null);
        setBooleanField(term670, term670.getClass(), "maxSizeSet", false);
        setField(term670, term670.getClass(), "componentOrientation", null);
        setBooleanField(term670, term670.getClass(), "newEventsOnly", false);
        setField(term670, term670.getClass(), "componentListener", null);
        setField(term670, term670.getClass(), "focusListener", null);
        setField(term670, term670.getClass(), "hierarchyListener", null);
        setField(term670, term670.getClass(), "hierarchyBoundsListener", null);
        setField(term670, term670.getClass(), "keyListener", null);
        setField(term670, term670.getClass(), "mouseListener", null);
        setField(term670, term670.getClass(), "mouseMotionListener", null);
        setField(term670, term670.getClass(), "mouseWheelListener", null);
        setField(term670, term670.getClass(), "inputMethodListener", null);
        setLongField(term670, term670.getClass(), "eventMask", 0L);
        setField(term670, term670.getClass(), "changeSupport", null);
        setField(term670, term670.getClass(), "objectLock", null);
        setBooleanField(term670, term670.getClass(), "isPacked", false);
        setIntField(term670, term670.getClass(), "boundsOp", 0);
        setField(term670, term670.getClass(), "compoundShape", null);
        setField(term670, term670.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term670, term670.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term670, term670.getClass(), "backgroundEraseDisabled", false);
        setField(term670, term670.getClass(), "eventCache", null);
        setBooleanField(term670, term670.getClass(), "coalescingEnabled", false);
        setBooleanField(term670, term670.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term670, term670.getClass(), "componentSerializedDataVersion", 0);
        setField(term670, term670.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$6");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term670, args);
    }

};


