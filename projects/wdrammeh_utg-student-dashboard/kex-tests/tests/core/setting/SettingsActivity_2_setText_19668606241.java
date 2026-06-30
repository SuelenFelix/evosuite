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

public class SettingsActivity_2_setText_19668606241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;

    public SettingsActivity_2_setText_19668606241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = newInstance(Class.forName("core.setting.SettingsActivity$2"));
        Object term162 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term163 = (Object[]) newArray("java.lang.Object", 0);
        Object term164 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term165 = newInstance(Class.forName("java.lang.Object"));
        Object term166 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term167 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term168 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term137, term137.getClass(), "mnemonic", 1227103734);
        setIntField(term137, term137.getClass(), "mnemonicIndex", -1339778481);
        setField(term137, term137.getClass(), "text", "jJCZpVmanW");
        setField(term137, term137.getClass(), "defaultIcon", null);
        setField(term137, term137.getClass(), "disabledIcon", null);
        setBooleanField(term137, term137.getClass(), "disabledIconSet", true);
        setIntField(term137, term137.getClass(), "verticalAlignment", 1725571209);
        setIntField(term137, term137.getClass(), "horizontalAlignment", -522618178);
        setIntField(term137, term137.getClass(), "verticalTextPosition", 1134449235);
        setIntField(term137, term137.getClass(), "horizontalTextPosition", -883034806);
        setIntField(term137, term137.getClass(), "iconTextGap", 1585847225);
        setField(term137, term137.getClass(), "labelFor", null);
        setBooleanField(term137, term137.getClass(), "isAlignmentXSet", true);
        setFloatField(term137, term137.getClass(), "alignmentX", 0.2707036F);
        setBooleanField(term137, term137.getClass(), "isAlignmentYSet", false);
        setFloatField(term137, term137.getClass(), "alignmentY", 0.3455959F);
        setField(term137, term137.getClass(), "ui", null);
        setField(term162, term162.getClass(), "listenerList", term163);
        setField(term137, term137.getClass(), "listenerList", term162);
        setField(term164, term164.getClass(), "table", term165);
        setField(term137, term137.getClass(), "clientProperties", term164);
        setField(term167, term167.getClass(), "map", null);
        setField(term166, term166.getClass(), "map", term167);
        setField(term166, term166.getClass(), "source", term168);
        setField(term137, term137.getClass(), "vetoableChangeSupport", term166);
        setBooleanField(term137, term137.getClass(), "autoscrolls", false);
        setField(term137, term137.getClass(), "border", null);
        setIntField(term137, term137.getClass(), "flags", 1193880199);
        setField(term137, term137.getClass(), "inputVerifier", null);
        setBooleanField(term137, term137.getClass(), "verifyInputWhenFocusTarget", true);
        setField(term137, term137.getClass(), "paintingChild", null);
        setField(term137, term137.getClass(), "popupMenu", null);
        setField(term137, term137.getClass(), "revalidateRunnableScheduled", null);
        setField(term137, term137.getClass(), "focusInputMap", null);
        setField(term137, term137.getClass(), "ancestorInputMap", null);
        setField(term137, term137.getClass(), "windowInputMap", null);
        setField(term137, term137.getClass(), "actionMap", null);
        setField(term137, term137.getClass(), "aaHint", null);
        setField(term137, term137.getClass(), "lcdRenderingHint", null);
        setField(term137, term137.getClass(), "component", null);
        setField(term137, term137.getClass(), "layoutMgr", null);
        setField(term137, term137.getClass(), "dispatcher", null);
        setField(term137, term137.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term137, term137.getClass(), "focusCycleRoot", false);
        setBooleanField(term137, term137.getClass(), "focusTraversalPolicyProvider", false);
        setField(term137, term137.getClass(), "printingThreads", null);
        setBooleanField(term137, term137.getClass(), "printing", false);
        setField(term137, term137.getClass(), "containerListener", null);
        setIntField(term137, term137.getClass(), "listeningChildren", 0);
        setIntField(term137, term137.getClass(), "listeningBoundsChildren", 0);
        setIntField(term137, term137.getClass(), "descendantsCount", 0);
        setField(term137, term137.getClass(), "preserveBackgroundColor", null);
        setIntField(term137, term137.getClass(), "numOfHWComponents", 0);
        setIntField(term137, term137.getClass(), "numOfLWComponents", 0);
        setField(term137, term137.getClass(), "modalComp", null);
        setField(term137, term137.getClass(), "modalAppContext", null);
        setIntField(term137, term137.getClass(), "containerSerializedDataVersion", 0);
        setField(term137, term137.getClass(), "peer", null);
        setField(term137, term137.getClass(), "parent", null);
        setField(term137, term137.getClass(), "appContext", null);
        setIntField(term137, term137.getClass(), "x", 0);
        setIntField(term137, term137.getClass(), "y", 0);
        setIntField(term137, term137.getClass(), "width", 0);
        setIntField(term137, term137.getClass(), "height", 0);
        setField(term137, term137.getClass(), "foreground", null);
        setField(term137, term137.getClass(), "background", null);
        setField(term137, term137.getClass(), "font", null);
        setField(term137, term137.getClass(), "peerFont", null);
        setField(term137, term137.getClass(), "cursor", null);
        setField(term137, term137.getClass(), "locale", null);
        setField(term137, term137.getClass(), "graphicsConfig", null);
        setField(term137, term137.getClass(), "bufferStrategy", null);
        setBooleanField(term137, term137.getClass(), "ignoreRepaint", false);
        setBooleanField(term137, term137.getClass(), "visible", false);
        setBooleanField(term137, term137.getClass(), "enabled", false);
        setBooleanField(term137, term137.getClass(), "valid", false);
        setField(term137, term137.getClass(), "dropTarget", null);
        setField(term137, term137.getClass(), "popups", null);
        setField(term137, term137.getClass(), "name", null);
        setBooleanField(term137, term137.getClass(), "nameExplicitlySet", false);
        setBooleanField(term137, term137.getClass(), "focusable", false);
        setIntField(term137, term137.getClass(), "isFocusTraversableOverridden", 0);
        setField(term137, term137.getClass(), "focusTraversalKeys", null);
        setBooleanField(term137, term137.getClass(), "focusTraversalKeysEnabled", false);
        setField(term137, term137.getClass(), "acc", null);
        setField(term137, term137.getClass(), "minSize", null);
        setBooleanField(term137, term137.getClass(), "minSizeSet", false);
        setField(term137, term137.getClass(), "prefSize", null);
        setBooleanField(term137, term137.getClass(), "prefSizeSet", false);
        setField(term137, term137.getClass(), "maxSize", null);
        setBooleanField(term137, term137.getClass(), "maxSizeSet", false);
        setField(term137, term137.getClass(), "componentOrientation", null);
        setBooleanField(term137, term137.getClass(), "newEventsOnly", false);
        setField(term137, term137.getClass(), "componentListener", null);
        setField(term137, term137.getClass(), "focusListener", null);
        setField(term137, term137.getClass(), "hierarchyListener", null);
        setField(term137, term137.getClass(), "hierarchyBoundsListener", null);
        setField(term137, term137.getClass(), "keyListener", null);
        setField(term137, term137.getClass(), "mouseListener", null);
        setField(term137, term137.getClass(), "mouseMotionListener", null);
        setField(term137, term137.getClass(), "mouseWheelListener", null);
        setField(term137, term137.getClass(), "inputMethodListener", null);
        setLongField(term137, term137.getClass(), "eventMask", 0L);
        setField(term137, term137.getClass(), "changeSupport", null);
        setField(term137, term137.getClass(), "objectLock", null);
        setBooleanField(term137, term137.getClass(), "isPacked", false);
        setIntField(term137, term137.getClass(), "boundsOp", 0);
        setField(term137, term137.getClass(), "compoundShape", null);
        setField(term137, term137.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term137, term137.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term137, term137.getClass(), "backgroundEraseDisabled", false);
        setField(term137, term137.getClass(), "eventCache", null);
        setBooleanField(term137, term137.getClass(), "coalescingEnabled", false);
        setBooleanField(term137, term137.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term137, term137.getClass(), "componentSerializedDataVersion", 0);
        setField(term137, term137.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        callMethod(klass, "setText", argTypes, term137, args);
    }

};


