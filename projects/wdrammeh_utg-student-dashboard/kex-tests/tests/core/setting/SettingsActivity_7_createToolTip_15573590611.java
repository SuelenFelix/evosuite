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

public class SettingsActivity_7_createToolTip_15573590611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147227;

    public SettingsActivity_7_createToolTip_15573590611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147227 = newInstance(Class.forName("core.setting.SettingsActivity$7"));
        Object term147243 = newInstance(Class.forName("java.lang.Object"));
        Object term147263 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term147264 = (Object[]) newArray("java.lang.Object", 0);
        Object term147265 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term147266 = newInstance(Class.forName("java.lang.Object"));
        Object term147267 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term147268 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term147269 = newInstance(Class.forName("java.lang.Object"));
        setField(term147227, term147227.getClass(), "dataModel", null);
        setField(term147227, term147227.getClass(), "renderer", null);
        setField(term147227, term147227.getClass(), "editor", null);
        setIntField(term147227, term147227.getClass(), "maximumRowCount", 1064185088);
        setBooleanField(term147227, term147227.getClass(), "isEditable", false);
        setField(term147227, term147227.getClass(), "keySelectionManager", null);
        setField(term147227, term147227.getClass(), "actionCommand", "JKGueoHesL");
        setBooleanField(term147227, term147227.getClass(), "lightWeightPopupEnabled", false);
        setField(term147227, term147227.getClass(), "selectedItemReminder", term147243);
        setField(term147227, term147227.getClass(), "prototypeDisplayValue", "CRAUqtVBkU");
        setBooleanField(term147227, term147227.getClass(), "firingActionEvent", false);
        setBooleanField(term147227, term147227.getClass(), "selectingItem", false);
        setBooleanField(term147227, term147227.getClass(), "updateInProgress", false);
        setField(term147227, term147227.getClass(), "action", null);
        setField(term147227, term147227.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term147227, term147227.getClass(), "isAlignmentXSet", false);
        setFloatField(term147227, term147227.getClass(), "alignmentX", 0.36226058F);
        setBooleanField(term147227, term147227.getClass(), "isAlignmentYSet", true);
        setFloatField(term147227, term147227.getClass(), "alignmentY", 0.04703206F);
        setField(term147227, term147227.getClass(), "ui", null);
        setField(term147263, term147263.getClass(), "listenerList", term147264);
        setField(term147227, term147227.getClass(), "listenerList", term147263);
        setField(term147265, term147265.getClass(), "table", term147266);
        setField(term147227, term147227.getClass(), "clientProperties", term147265);
        setField(term147268, term147268.getClass(), "map", null);
        setField(term147267, term147267.getClass(), "map", term147268);
        setField(term147267, term147267.getClass(), "source", term147269);
        setField(term147227, term147227.getClass(), "vetoableChangeSupport", term147267);
        setBooleanField(term147227, term147227.getClass(), "autoscrolls", true);
        setField(term147227, term147227.getClass(), "border", null);
        setIntField(term147227, term147227.getClass(), "flags", 399302934);
        setField(term147227, term147227.getClass(), "inputVerifier", null);
        setBooleanField(term147227, term147227.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term147227, term147227.getClass(), "paintingChild", null);
        setField(term147227, term147227.getClass(), "popupMenu", null);
        setField(term147227, term147227.getClass(), "revalidateRunnableScheduled", null);
        setField(term147227, term147227.getClass(), "focusInputMap", null);
        setField(term147227, term147227.getClass(), "ancestorInputMap", null);
        setField(term147227, term147227.getClass(), "windowInputMap", null);
        setField(term147227, term147227.getClass(), "actionMap", null);
        setField(term147227, term147227.getClass(), "aaHint", null);
        setField(term147227, term147227.getClass(), "lcdRenderingHint", null);
        setField(term147227, term147227.getClass(), "component", null);
        setField(term147227, term147227.getClass(), "layoutMgr", null);
        setField(term147227, term147227.getClass(), "dispatcher", null);
        setField(term147227, term147227.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term147227, term147227.getClass(), "focusCycleRoot", false);
        setBooleanField(term147227, term147227.getClass(), "focusTraversalPolicyProvider", false);
        setField(term147227, term147227.getClass(), "printingThreads", null);
        setBooleanField(term147227, term147227.getClass(), "printing", false);
        setField(term147227, term147227.getClass(), "containerListener", null);
        setIntField(term147227, term147227.getClass(), "listeningChildren", 0);
        setIntField(term147227, term147227.getClass(), "listeningBoundsChildren", 0);
        setIntField(term147227, term147227.getClass(), "descendantsCount", 0);
        setField(term147227, term147227.getClass(), "preserveBackgroundColor", null);
        setIntField(term147227, term147227.getClass(), "numOfHWComponents", 0);
        setIntField(term147227, term147227.getClass(), "numOfLWComponents", 0);
        setField(term147227, term147227.getClass(), "modalComp", null);
        setField(term147227, term147227.getClass(), "modalAppContext", null);
        setIntField(term147227, term147227.getClass(), "containerSerializedDataVersion", 0);
        setField(term147227, term147227.getClass(), "peer", null);
        setField(term147227, term147227.getClass(), "parent", null);
        setField(term147227, term147227.getClass(), "appContext", null);
        setIntField(term147227, term147227.getClass(), "x", 0);
        setIntField(term147227, term147227.getClass(), "y", 0);
        setIntField(term147227, term147227.getClass(), "width", 0);
        setIntField(term147227, term147227.getClass(), "height", 0);
        setField(term147227, term147227.getClass(), "foreground", null);
        setField(term147227, term147227.getClass(), "background", null);
        setField(term147227, term147227.getClass(), "font", null);
        setField(term147227, term147227.getClass(), "peerFont", null);
        setField(term147227, term147227.getClass(), "cursor", null);
        setField(term147227, term147227.getClass(), "locale", null);
        setField(term147227, term147227.getClass(), "graphicsConfig", null);
        setField(term147227, term147227.getClass(), "bufferStrategy", null);
        setBooleanField(term147227, term147227.getClass(), "ignoreRepaint", false);
        setBooleanField(term147227, term147227.getClass(), "visible", false);
        setBooleanField(term147227, term147227.getClass(), "enabled", false);
        setBooleanField(term147227, term147227.getClass(), "valid", false);
        setField(term147227, term147227.getClass(), "dropTarget", null);
        setField(term147227, term147227.getClass(), "popups", null);
        setField(term147227, term147227.getClass(), "name", null);
        setBooleanField(term147227, term147227.getClass(), "nameExplicitlySet", false);
        setBooleanField(term147227, term147227.getClass(), "focusable", false);
        setIntField(term147227, term147227.getClass(), "isFocusTraversableOverridden", 0);
        setField(term147227, term147227.getClass(), "focusTraversalKeys", null);
        setBooleanField(term147227, term147227.getClass(), "focusTraversalKeysEnabled", false);
        setField(term147227, term147227.getClass(), "acc", null);
        setField(term147227, term147227.getClass(), "minSize", null);
        setBooleanField(term147227, term147227.getClass(), "minSizeSet", false);
        setField(term147227, term147227.getClass(), "prefSize", null);
        setBooleanField(term147227, term147227.getClass(), "prefSizeSet", false);
        setField(term147227, term147227.getClass(), "maxSize", null);
        setBooleanField(term147227, term147227.getClass(), "maxSizeSet", false);
        setField(term147227, term147227.getClass(), "componentOrientation", null);
        setBooleanField(term147227, term147227.getClass(), "newEventsOnly", false);
        setField(term147227, term147227.getClass(), "componentListener", null);
        setField(term147227, term147227.getClass(), "focusListener", null);
        setField(term147227, term147227.getClass(), "hierarchyListener", null);
        setField(term147227, term147227.getClass(), "hierarchyBoundsListener", null);
        setField(term147227, term147227.getClass(), "keyListener", null);
        setField(term147227, term147227.getClass(), "mouseListener", null);
        setField(term147227, term147227.getClass(), "mouseMotionListener", null);
        setField(term147227, term147227.getClass(), "mouseWheelListener", null);
        setField(term147227, term147227.getClass(), "inputMethodListener", null);
        setLongField(term147227, term147227.getClass(), "eventMask", 0L);
        setField(term147227, term147227.getClass(), "changeSupport", null);
        setField(term147227, term147227.getClass(), "objectLock", null);
        setBooleanField(term147227, term147227.getClass(), "isPacked", false);
        setIntField(term147227, term147227.getClass(), "boundsOp", 0);
        setField(term147227, term147227.getClass(), "compoundShape", null);
        setField(term147227, term147227.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term147227, term147227.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term147227, term147227.getClass(), "backgroundEraseDisabled", false);
        setField(term147227, term147227.getClass(), "eventCache", null);
        setBooleanField(term147227, term147227.getClass(), "coalescingEnabled", false);
        setBooleanField(term147227, term147227.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term147227, term147227.getClass(), "componentSerializedDataVersion", 0);
        setField(term147227, term147227.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$7");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term147227, args);
    }

};


