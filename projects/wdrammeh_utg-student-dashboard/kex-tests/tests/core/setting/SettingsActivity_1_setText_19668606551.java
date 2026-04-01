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

public class SettingsActivity_1_setText_19668606551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143874;

    public SettingsActivity_1_setText_19668606551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143874 = newInstance(Class.forName("core.setting.SettingsActivity$1"));
        Object term143899 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term143900 = (Object[]) newArray("java.lang.Object", 0);
        Object term143901 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term143902 = newInstance(Class.forName("java.lang.Object"));
        Object term143903 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term143904 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term143905 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term143874, term143874.getClass(), "mnemonic", 1841493736);
        setIntField(term143874, term143874.getClass(), "mnemonicIndex", 320739944);
        setField(term143874, term143874.getClass(), "text", "BkIxsyPkGy");
        setField(term143874, term143874.getClass(), "defaultIcon", null);
        setField(term143874, term143874.getClass(), "disabledIcon", null);
        setBooleanField(term143874, term143874.getClass(), "disabledIconSet", true);
        setIntField(term143874, term143874.getClass(), "verticalAlignment", 760218111);
        setIntField(term143874, term143874.getClass(), "horizontalAlignment", -1986366126);
        setIntField(term143874, term143874.getClass(), "verticalTextPosition", -1963228619);
        setIntField(term143874, term143874.getClass(), "horizontalTextPosition", -709868952);
        setIntField(term143874, term143874.getClass(), "iconTextGap", 847207929);
        setField(term143874, term143874.getClass(), "labelFor", null);
        setBooleanField(term143874, term143874.getClass(), "isAlignmentXSet", true);
        setFloatField(term143874, term143874.getClass(), "alignmentX", 0.5306474F);
        setBooleanField(term143874, term143874.getClass(), "isAlignmentYSet", false);
        setFloatField(term143874, term143874.getClass(), "alignmentY", 0.12532318F);
        setField(term143874, term143874.getClass(), "ui", null);
        setField(term143899, term143899.getClass(), "listenerList", term143900);
        setField(term143874, term143874.getClass(), "listenerList", term143899);
        setField(term143901, term143901.getClass(), "table", term143902);
        setField(term143874, term143874.getClass(), "clientProperties", term143901);
        setField(term143904, term143904.getClass(), "map", null);
        setField(term143903, term143903.getClass(), "map", term143904);
        setField(term143903, term143903.getClass(), "source", term143905);
        setField(term143874, term143874.getClass(), "vetoableChangeSupport", term143903);
        setBooleanField(term143874, term143874.getClass(), "autoscrolls", true);
        setField(term143874, term143874.getClass(), "border", null);
        setIntField(term143874, term143874.getClass(), "flags", 1574458332);
        setField(term143874, term143874.getClass(), "inputVerifier", null);
        setBooleanField(term143874, term143874.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term143874, term143874.getClass(), "paintingChild", null);
        setField(term143874, term143874.getClass(), "popupMenu", null);
        setField(term143874, term143874.getClass(), "revalidateRunnableScheduled", null);
        setField(term143874, term143874.getClass(), "focusInputMap", null);
        setField(term143874, term143874.getClass(), "ancestorInputMap", null);
        setField(term143874, term143874.getClass(), "windowInputMap", null);
        setField(term143874, term143874.getClass(), "actionMap", null);
        setField(term143874, term143874.getClass(), "aaHint", null);
        setField(term143874, term143874.getClass(), "lcdRenderingHint", null);
        setField(term143874, term143874.getClass(), "component", null);
        setField(term143874, term143874.getClass(), "layoutMgr", null);
        setField(term143874, term143874.getClass(), "dispatcher", null);
        setField(term143874, term143874.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term143874, term143874.getClass(), "focusCycleRoot", false);
        setBooleanField(term143874, term143874.getClass(), "focusTraversalPolicyProvider", false);
        setField(term143874, term143874.getClass(), "printingThreads", null);
        setBooleanField(term143874, term143874.getClass(), "printing", false);
        setField(term143874, term143874.getClass(), "containerListener", null);
        setIntField(term143874, term143874.getClass(), "listeningChildren", 0);
        setIntField(term143874, term143874.getClass(), "listeningBoundsChildren", 0);
        setIntField(term143874, term143874.getClass(), "descendantsCount", 0);
        setField(term143874, term143874.getClass(), "preserveBackgroundColor", null);
        setIntField(term143874, term143874.getClass(), "numOfHWComponents", 0);
        setIntField(term143874, term143874.getClass(), "numOfLWComponents", 0);
        setField(term143874, term143874.getClass(), "modalComp", null);
        setField(term143874, term143874.getClass(), "modalAppContext", null);
        setIntField(term143874, term143874.getClass(), "containerSerializedDataVersion", 0);
        setField(term143874, term143874.getClass(), "peer", null);
        setField(term143874, term143874.getClass(), "parent", null);
        setField(term143874, term143874.getClass(), "appContext", null);
        setIntField(term143874, term143874.getClass(), "x", 0);
        setIntField(term143874, term143874.getClass(), "y", 0);
        setIntField(term143874, term143874.getClass(), "width", 0);
        setIntField(term143874, term143874.getClass(), "height", 0);
        setField(term143874, term143874.getClass(), "foreground", null);
        setField(term143874, term143874.getClass(), "background", null);
        setField(term143874, term143874.getClass(), "font", null);
        setField(term143874, term143874.getClass(), "peerFont", null);
        setField(term143874, term143874.getClass(), "cursor", null);
        setField(term143874, term143874.getClass(), "locale", null);
        setField(term143874, term143874.getClass(), "graphicsConfig", null);
        setField(term143874, term143874.getClass(), "bufferStrategy", null);
        setBooleanField(term143874, term143874.getClass(), "ignoreRepaint", false);
        setBooleanField(term143874, term143874.getClass(), "visible", false);
        setBooleanField(term143874, term143874.getClass(), "enabled", false);
        setBooleanField(term143874, term143874.getClass(), "valid", false);
        setField(term143874, term143874.getClass(), "dropTarget", null);
        setField(term143874, term143874.getClass(), "popups", null);
        setField(term143874, term143874.getClass(), "name", null);
        setBooleanField(term143874, term143874.getClass(), "nameExplicitlySet", false);
        setBooleanField(term143874, term143874.getClass(), "focusable", false);
        setIntField(term143874, term143874.getClass(), "isFocusTraversableOverridden", 0);
        setField(term143874, term143874.getClass(), "focusTraversalKeys", null);
        setBooleanField(term143874, term143874.getClass(), "focusTraversalKeysEnabled", false);
        setField(term143874, term143874.getClass(), "acc", null);
        setField(term143874, term143874.getClass(), "minSize", null);
        setBooleanField(term143874, term143874.getClass(), "minSizeSet", false);
        setField(term143874, term143874.getClass(), "prefSize", null);
        setBooleanField(term143874, term143874.getClass(), "prefSizeSet", false);
        setField(term143874, term143874.getClass(), "maxSize", null);
        setBooleanField(term143874, term143874.getClass(), "maxSizeSet", false);
        setField(term143874, term143874.getClass(), "componentOrientation", null);
        setBooleanField(term143874, term143874.getClass(), "newEventsOnly", false);
        setField(term143874, term143874.getClass(), "componentListener", null);
        setField(term143874, term143874.getClass(), "focusListener", null);
        setField(term143874, term143874.getClass(), "hierarchyListener", null);
        setField(term143874, term143874.getClass(), "hierarchyBoundsListener", null);
        setField(term143874, term143874.getClass(), "keyListener", null);
        setField(term143874, term143874.getClass(), "mouseListener", null);
        setField(term143874, term143874.getClass(), "mouseMotionListener", null);
        setField(term143874, term143874.getClass(), "mouseWheelListener", null);
        setField(term143874, term143874.getClass(), "inputMethodListener", null);
        setLongField(term143874, term143874.getClass(), "eventMask", 0L);
        setField(term143874, term143874.getClass(), "changeSupport", null);
        setField(term143874, term143874.getClass(), "objectLock", null);
        setBooleanField(term143874, term143874.getClass(), "isPacked", false);
        setIntField(term143874, term143874.getClass(), "boundsOp", 0);
        setField(term143874, term143874.getClass(), "compoundShape", null);
        setField(term143874, term143874.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term143874, term143874.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term143874, term143874.getClass(), "backgroundEraseDisabled", false);
        setField(term143874, term143874.getClass(), "eventCache", null);
        setBooleanField(term143874, term143874.getClass(), "coalescingEnabled", false);
        setBooleanField(term143874, term143874.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term143874, term143874.getClass(), "componentSerializedDataVersion", 0);
        setField(term143874, term143874.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mxVLTgCwki";
        callMethod(klass, "setText", argTypes, term143874, args);
    }

};


