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
     Object term144024;

    public SettingsActivity_6_createToolTip_15573590301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144024 = newInstance(Class.forName("core.setting.SettingsActivity$6"));
        Object term144040 = newInstance(Class.forName("java.lang.Object"));
        Object term144060 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term144061 = (Object[]) newArray("java.lang.Object", 0);
        Object term144062 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term144063 = newInstance(Class.forName("java.lang.Object"));
        Object term144064 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term144065 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term144066 = newInstance(Class.forName("java.lang.Object"));
        setField(term144024, term144024.getClass(), "dataModel", null);
        setField(term144024, term144024.getClass(), "renderer", null);
        setField(term144024, term144024.getClass(), "editor", null);
        setIntField(term144024, term144024.getClass(), "maximumRowCount", -1023366103);
        setBooleanField(term144024, term144024.getClass(), "isEditable", true);
        setField(term144024, term144024.getClass(), "keySelectionManager", null);
        setField(term144024, term144024.getClass(), "actionCommand", "wCurppnDSA");
        setBooleanField(term144024, term144024.getClass(), "lightWeightPopupEnabled", true);
        setField(term144024, term144024.getClass(), "selectedItemReminder", term144040);
        setField(term144024, term144024.getClass(), "prototypeDisplayValue", "JydxSNTMYt");
        setBooleanField(term144024, term144024.getClass(), "firingActionEvent", false);
        setBooleanField(term144024, term144024.getClass(), "selectingItem", false);
        setBooleanField(term144024, term144024.getClass(), "updateInProgress", true);
        setField(term144024, term144024.getClass(), "action", null);
        setField(term144024, term144024.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term144024, term144024.getClass(), "isAlignmentXSet", false);
        setFloatField(term144024, term144024.getClass(), "alignmentX", 0.022483587F);
        setBooleanField(term144024, term144024.getClass(), "isAlignmentYSet", true);
        setFloatField(term144024, term144024.getClass(), "alignmentY", 0.9200632F);
        setField(term144024, term144024.getClass(), "ui", null);
        setField(term144060, term144060.getClass(), "listenerList", term144061);
        setField(term144024, term144024.getClass(), "listenerList", term144060);
        setField(term144062, term144062.getClass(), "table", term144063);
        setField(term144024, term144024.getClass(), "clientProperties", term144062);
        setField(term144065, term144065.getClass(), "map", null);
        setField(term144064, term144064.getClass(), "map", term144065);
        setField(term144064, term144064.getClass(), "source", term144066);
        setField(term144024, term144024.getClass(), "vetoableChangeSupport", term144064);
        setBooleanField(term144024, term144024.getClass(), "autoscrolls", true);
        setField(term144024, term144024.getClass(), "border", null);
        setIntField(term144024, term144024.getClass(), "flags", 755951489);
        setField(term144024, term144024.getClass(), "inputVerifier", null);
        setBooleanField(term144024, term144024.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term144024, term144024.getClass(), "paintingChild", null);
        setField(term144024, term144024.getClass(), "popupMenu", null);
        setField(term144024, term144024.getClass(), "revalidateRunnableScheduled", null);
        setField(term144024, term144024.getClass(), "focusInputMap", null);
        setField(term144024, term144024.getClass(), "ancestorInputMap", null);
        setField(term144024, term144024.getClass(), "windowInputMap", null);
        setField(term144024, term144024.getClass(), "actionMap", null);
        setField(term144024, term144024.getClass(), "aaHint", null);
        setField(term144024, term144024.getClass(), "lcdRenderingHint", null);
        setField(term144024, term144024.getClass(), "component", null);
        setField(term144024, term144024.getClass(), "layoutMgr", null);
        setField(term144024, term144024.getClass(), "dispatcher", null);
        setField(term144024, term144024.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term144024, term144024.getClass(), "focusCycleRoot", false);
        setBooleanField(term144024, term144024.getClass(), "focusTraversalPolicyProvider", false);
        setField(term144024, term144024.getClass(), "printingThreads", null);
        setBooleanField(term144024, term144024.getClass(), "printing", false);
        setField(term144024, term144024.getClass(), "containerListener", null);
        setIntField(term144024, term144024.getClass(), "listeningChildren", 0);
        setIntField(term144024, term144024.getClass(), "listeningBoundsChildren", 0);
        setIntField(term144024, term144024.getClass(), "descendantsCount", 0);
        setField(term144024, term144024.getClass(), "preserveBackgroundColor", null);
        setIntField(term144024, term144024.getClass(), "numOfHWComponents", 0);
        setIntField(term144024, term144024.getClass(), "numOfLWComponents", 0);
        setField(term144024, term144024.getClass(), "modalComp", null);
        setField(term144024, term144024.getClass(), "modalAppContext", null);
        setIntField(term144024, term144024.getClass(), "containerSerializedDataVersion", 0);
        setField(term144024, term144024.getClass(), "peer", null);
        setField(term144024, term144024.getClass(), "parent", null);
        setField(term144024, term144024.getClass(), "appContext", null);
        setIntField(term144024, term144024.getClass(), "x", 0);
        setIntField(term144024, term144024.getClass(), "y", 0);
        setIntField(term144024, term144024.getClass(), "width", 0);
        setIntField(term144024, term144024.getClass(), "height", 0);
        setField(term144024, term144024.getClass(), "foreground", null);
        setField(term144024, term144024.getClass(), "background", null);
        setField(term144024, term144024.getClass(), "font", null);
        setField(term144024, term144024.getClass(), "peerFont", null);
        setField(term144024, term144024.getClass(), "cursor", null);
        setField(term144024, term144024.getClass(), "locale", null);
        setField(term144024, term144024.getClass(), "graphicsConfig", null);
        setField(term144024, term144024.getClass(), "bufferStrategy", null);
        setBooleanField(term144024, term144024.getClass(), "ignoreRepaint", false);
        setBooleanField(term144024, term144024.getClass(), "visible", false);
        setBooleanField(term144024, term144024.getClass(), "enabled", false);
        setBooleanField(term144024, term144024.getClass(), "valid", false);
        setField(term144024, term144024.getClass(), "dropTarget", null);
        setField(term144024, term144024.getClass(), "popups", null);
        setField(term144024, term144024.getClass(), "name", null);
        setBooleanField(term144024, term144024.getClass(), "nameExplicitlySet", false);
        setBooleanField(term144024, term144024.getClass(), "focusable", false);
        setIntField(term144024, term144024.getClass(), "isFocusTraversableOverridden", 0);
        setField(term144024, term144024.getClass(), "focusTraversalKeys", null);
        setBooleanField(term144024, term144024.getClass(), "focusTraversalKeysEnabled", false);
        setField(term144024, term144024.getClass(), "acc", null);
        setField(term144024, term144024.getClass(), "minSize", null);
        setBooleanField(term144024, term144024.getClass(), "minSizeSet", false);
        setField(term144024, term144024.getClass(), "prefSize", null);
        setBooleanField(term144024, term144024.getClass(), "prefSizeSet", false);
        setField(term144024, term144024.getClass(), "maxSize", null);
        setBooleanField(term144024, term144024.getClass(), "maxSizeSet", false);
        setField(term144024, term144024.getClass(), "componentOrientation", null);
        setBooleanField(term144024, term144024.getClass(), "newEventsOnly", false);
        setField(term144024, term144024.getClass(), "componentListener", null);
        setField(term144024, term144024.getClass(), "focusListener", null);
        setField(term144024, term144024.getClass(), "hierarchyListener", null);
        setField(term144024, term144024.getClass(), "hierarchyBoundsListener", null);
        setField(term144024, term144024.getClass(), "keyListener", null);
        setField(term144024, term144024.getClass(), "mouseListener", null);
        setField(term144024, term144024.getClass(), "mouseMotionListener", null);
        setField(term144024, term144024.getClass(), "mouseWheelListener", null);
        setField(term144024, term144024.getClass(), "inputMethodListener", null);
        setLongField(term144024, term144024.getClass(), "eventMask", 0L);
        setField(term144024, term144024.getClass(), "changeSupport", null);
        setField(term144024, term144024.getClass(), "objectLock", null);
        setBooleanField(term144024, term144024.getClass(), "isPacked", false);
        setIntField(term144024, term144024.getClass(), "boundsOp", 0);
        setField(term144024, term144024.getClass(), "compoundShape", null);
        setField(term144024, term144024.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term144024, term144024.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term144024, term144024.getClass(), "backgroundEraseDisabled", false);
        setField(term144024, term144024.getClass(), "eventCache", null);
        setBooleanField(term144024, term144024.getClass(), "coalescingEnabled", false);
        setBooleanField(term144024, term144024.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term144024, term144024.getClass(), "componentSerializedDataVersion", 0);
        setField(term144024, term144024.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$6");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term144024, args);
    }

};


