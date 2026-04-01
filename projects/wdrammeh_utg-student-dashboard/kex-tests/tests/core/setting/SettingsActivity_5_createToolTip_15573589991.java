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
     Object term144237;

    public SettingsActivity_5_createToolTip_15573589991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144237 = newInstance(Class.forName("core.setting.SettingsActivity$5"));
        Object term144253 = newInstance(Class.forName("java.lang.Object"));
        Object term144273 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term144274 = (Object[]) newArray("java.lang.Object", 0);
        Object term144275 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term144276 = newInstance(Class.forName("java.lang.Object"));
        Object term144277 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term144278 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term144279 = newInstance(Class.forName("java.lang.Object"));
        setField(term144237, term144237.getClass(), "dataModel", null);
        setField(term144237, term144237.getClass(), "renderer", null);
        setField(term144237, term144237.getClass(), "editor", null);
        setIntField(term144237, term144237.getClass(), "maximumRowCount", 1175146356);
        setBooleanField(term144237, term144237.getClass(), "isEditable", true);
        setField(term144237, term144237.getClass(), "keySelectionManager", null);
        setField(term144237, term144237.getClass(), "actionCommand", "YTxBqWRAlo");
        setBooleanField(term144237, term144237.getClass(), "lightWeightPopupEnabled", true);
        setField(term144237, term144237.getClass(), "selectedItemReminder", term144253);
        setField(term144237, term144237.getClass(), "prototypeDisplayValue", "ReruUQRXwl");
        setBooleanField(term144237, term144237.getClass(), "firingActionEvent", true);
        setBooleanField(term144237, term144237.getClass(), "selectingItem", true);
        setBooleanField(term144237, term144237.getClass(), "updateInProgress", true);
        setField(term144237, term144237.getClass(), "action", null);
        setField(term144237, term144237.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term144237, term144237.getClass(), "isAlignmentXSet", true);
        setFloatField(term144237, term144237.getClass(), "alignmentX", 0.025133014F);
        setBooleanField(term144237, term144237.getClass(), "isAlignmentYSet", false);
        setFloatField(term144237, term144237.getClass(), "alignmentY", 0.5428452F);
        setField(term144237, term144237.getClass(), "ui", null);
        setField(term144273, term144273.getClass(), "listenerList", term144274);
        setField(term144237, term144237.getClass(), "listenerList", term144273);
        setField(term144275, term144275.getClass(), "table", term144276);
        setField(term144237, term144237.getClass(), "clientProperties", term144275);
        setField(term144278, term144278.getClass(), "map", null);
        setField(term144277, term144277.getClass(), "map", term144278);
        setField(term144277, term144277.getClass(), "source", term144279);
        setField(term144237, term144237.getClass(), "vetoableChangeSupport", term144277);
        setBooleanField(term144237, term144237.getClass(), "autoscrolls", false);
        setField(term144237, term144237.getClass(), "border", null);
        setIntField(term144237, term144237.getClass(), "flags", 1558810715);
        setField(term144237, term144237.getClass(), "inputVerifier", null);
        setBooleanField(term144237, term144237.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term144237, term144237.getClass(), "paintingChild", null);
        setField(term144237, term144237.getClass(), "popupMenu", null);
        setField(term144237, term144237.getClass(), "revalidateRunnableScheduled", null);
        setField(term144237, term144237.getClass(), "focusInputMap", null);
        setField(term144237, term144237.getClass(), "ancestorInputMap", null);
        setField(term144237, term144237.getClass(), "windowInputMap", null);
        setField(term144237, term144237.getClass(), "actionMap", null);
        setField(term144237, term144237.getClass(), "aaHint", null);
        setField(term144237, term144237.getClass(), "lcdRenderingHint", null);
        setField(term144237, term144237.getClass(), "component", null);
        setField(term144237, term144237.getClass(), "layoutMgr", null);
        setField(term144237, term144237.getClass(), "dispatcher", null);
        setField(term144237, term144237.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term144237, term144237.getClass(), "focusCycleRoot", false);
        setBooleanField(term144237, term144237.getClass(), "focusTraversalPolicyProvider", false);
        setField(term144237, term144237.getClass(), "printingThreads", null);
        setBooleanField(term144237, term144237.getClass(), "printing", false);
        setField(term144237, term144237.getClass(), "containerListener", null);
        setIntField(term144237, term144237.getClass(), "listeningChildren", 0);
        setIntField(term144237, term144237.getClass(), "listeningBoundsChildren", 0);
        setIntField(term144237, term144237.getClass(), "descendantsCount", 0);
        setField(term144237, term144237.getClass(), "preserveBackgroundColor", null);
        setIntField(term144237, term144237.getClass(), "numOfHWComponents", 0);
        setIntField(term144237, term144237.getClass(), "numOfLWComponents", 0);
        setField(term144237, term144237.getClass(), "modalComp", null);
        setField(term144237, term144237.getClass(), "modalAppContext", null);
        setIntField(term144237, term144237.getClass(), "containerSerializedDataVersion", 0);
        setField(term144237, term144237.getClass(), "peer", null);
        setField(term144237, term144237.getClass(), "parent", null);
        setField(term144237, term144237.getClass(), "appContext", null);
        setIntField(term144237, term144237.getClass(), "x", 0);
        setIntField(term144237, term144237.getClass(), "y", 0);
        setIntField(term144237, term144237.getClass(), "width", 0);
        setIntField(term144237, term144237.getClass(), "height", 0);
        setField(term144237, term144237.getClass(), "foreground", null);
        setField(term144237, term144237.getClass(), "background", null);
        setField(term144237, term144237.getClass(), "font", null);
        setField(term144237, term144237.getClass(), "peerFont", null);
        setField(term144237, term144237.getClass(), "cursor", null);
        setField(term144237, term144237.getClass(), "locale", null);
        setField(term144237, term144237.getClass(), "graphicsConfig", null);
        setField(term144237, term144237.getClass(), "bufferStrategy", null);
        setBooleanField(term144237, term144237.getClass(), "ignoreRepaint", false);
        setBooleanField(term144237, term144237.getClass(), "visible", false);
        setBooleanField(term144237, term144237.getClass(), "enabled", false);
        setBooleanField(term144237, term144237.getClass(), "valid", false);
        setField(term144237, term144237.getClass(), "dropTarget", null);
        setField(term144237, term144237.getClass(), "popups", null);
        setField(term144237, term144237.getClass(), "name", null);
        setBooleanField(term144237, term144237.getClass(), "nameExplicitlySet", false);
        setBooleanField(term144237, term144237.getClass(), "focusable", false);
        setIntField(term144237, term144237.getClass(), "isFocusTraversableOverridden", 0);
        setField(term144237, term144237.getClass(), "focusTraversalKeys", null);
        setBooleanField(term144237, term144237.getClass(), "focusTraversalKeysEnabled", false);
        setField(term144237, term144237.getClass(), "acc", null);
        setField(term144237, term144237.getClass(), "minSize", null);
        setBooleanField(term144237, term144237.getClass(), "minSizeSet", false);
        setField(term144237, term144237.getClass(), "prefSize", null);
        setBooleanField(term144237, term144237.getClass(), "prefSizeSet", false);
        setField(term144237, term144237.getClass(), "maxSize", null);
        setBooleanField(term144237, term144237.getClass(), "maxSizeSet", false);
        setField(term144237, term144237.getClass(), "componentOrientation", null);
        setBooleanField(term144237, term144237.getClass(), "newEventsOnly", false);
        setField(term144237, term144237.getClass(), "componentListener", null);
        setField(term144237, term144237.getClass(), "focusListener", null);
        setField(term144237, term144237.getClass(), "hierarchyListener", null);
        setField(term144237, term144237.getClass(), "hierarchyBoundsListener", null);
        setField(term144237, term144237.getClass(), "keyListener", null);
        setField(term144237, term144237.getClass(), "mouseListener", null);
        setField(term144237, term144237.getClass(), "mouseMotionListener", null);
        setField(term144237, term144237.getClass(), "mouseWheelListener", null);
        setField(term144237, term144237.getClass(), "inputMethodListener", null);
        setLongField(term144237, term144237.getClass(), "eventMask", 0L);
        setField(term144237, term144237.getClass(), "changeSupport", null);
        setField(term144237, term144237.getClass(), "objectLock", null);
        setBooleanField(term144237, term144237.getClass(), "isPacked", false);
        setIntField(term144237, term144237.getClass(), "boundsOp", 0);
        setField(term144237, term144237.getClass(), "compoundShape", null);
        setField(term144237, term144237.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term144237, term144237.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term144237, term144237.getClass(), "backgroundEraseDisabled", false);
        setField(term144237, term144237.getClass(), "eventCache", null);
        setBooleanField(term144237, term144237.getClass(), "coalescingEnabled", false);
        setBooleanField(term144237, term144237.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term144237, term144237.getClass(), "componentSerializedDataVersion", 0);
        setField(term144237, term144237.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$5");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term144237, args);
    }

};


