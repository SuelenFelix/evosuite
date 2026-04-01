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
     Object term143656;

    public SettingsActivity_2_setText_19668606241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143656 = newInstance(Class.forName("core.setting.SettingsActivity$2"));
        Object term143681 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term143682 = (Object[]) newArray("java.lang.Object", 0);
        Object term143683 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term143684 = newInstance(Class.forName("java.lang.Object"));
        Object term143685 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term143686 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term143687 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term143656, term143656.getClass(), "mnemonic", -201010601);
        setIntField(term143656, term143656.getClass(), "mnemonicIndex", 2060027076);
        setField(term143656, term143656.getClass(), "text", "JptuwlirlS");
        setField(term143656, term143656.getClass(), "defaultIcon", null);
        setField(term143656, term143656.getClass(), "disabledIcon", null);
        setBooleanField(term143656, term143656.getClass(), "disabledIconSet", false);
        setIntField(term143656, term143656.getClass(), "verticalAlignment", 2084868811);
        setIntField(term143656, term143656.getClass(), "horizontalAlignment", 314478878);
        setIntField(term143656, term143656.getClass(), "verticalTextPosition", 1425342686);
        setIntField(term143656, term143656.getClass(), "horizontalTextPosition", -1042470635);
        setIntField(term143656, term143656.getClass(), "iconTextGap", -524352937);
        setField(term143656, term143656.getClass(), "labelFor", null);
        setBooleanField(term143656, term143656.getClass(), "isAlignmentXSet", true);
        setFloatField(term143656, term143656.getClass(), "alignmentX", 0.25778466F);
        setBooleanField(term143656, term143656.getClass(), "isAlignmentYSet", true);
        setFloatField(term143656, term143656.getClass(), "alignmentY", 0.11179066F);
        setField(term143656, term143656.getClass(), "ui", null);
        setField(term143681, term143681.getClass(), "listenerList", term143682);
        setField(term143656, term143656.getClass(), "listenerList", term143681);
        setField(term143683, term143683.getClass(), "table", term143684);
        setField(term143656, term143656.getClass(), "clientProperties", term143683);
        setField(term143686, term143686.getClass(), "map", null);
        setField(term143685, term143685.getClass(), "map", term143686);
        setField(term143685, term143685.getClass(), "source", term143687);
        setField(term143656, term143656.getClass(), "vetoableChangeSupport", term143685);
        setBooleanField(term143656, term143656.getClass(), "autoscrolls", false);
        setField(term143656, term143656.getClass(), "border", null);
        setIntField(term143656, term143656.getClass(), "flags", 805176809);
        setField(term143656, term143656.getClass(), "inputVerifier", null);
        setBooleanField(term143656, term143656.getClass(), "verifyInputWhenFocusTarget", true);
        setField(term143656, term143656.getClass(), "paintingChild", null);
        setField(term143656, term143656.getClass(), "popupMenu", null);
        setField(term143656, term143656.getClass(), "revalidateRunnableScheduled", null);
        setField(term143656, term143656.getClass(), "focusInputMap", null);
        setField(term143656, term143656.getClass(), "ancestorInputMap", null);
        setField(term143656, term143656.getClass(), "windowInputMap", null);
        setField(term143656, term143656.getClass(), "actionMap", null);
        setField(term143656, term143656.getClass(), "aaHint", null);
        setField(term143656, term143656.getClass(), "lcdRenderingHint", null);
        setField(term143656, term143656.getClass(), "component", null);
        setField(term143656, term143656.getClass(), "layoutMgr", null);
        setField(term143656, term143656.getClass(), "dispatcher", null);
        setField(term143656, term143656.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term143656, term143656.getClass(), "focusCycleRoot", false);
        setBooleanField(term143656, term143656.getClass(), "focusTraversalPolicyProvider", false);
        setField(term143656, term143656.getClass(), "printingThreads", null);
        setBooleanField(term143656, term143656.getClass(), "printing", false);
        setField(term143656, term143656.getClass(), "containerListener", null);
        setIntField(term143656, term143656.getClass(), "listeningChildren", 0);
        setIntField(term143656, term143656.getClass(), "listeningBoundsChildren", 0);
        setIntField(term143656, term143656.getClass(), "descendantsCount", 0);
        setField(term143656, term143656.getClass(), "preserveBackgroundColor", null);
        setIntField(term143656, term143656.getClass(), "numOfHWComponents", 0);
        setIntField(term143656, term143656.getClass(), "numOfLWComponents", 0);
        setField(term143656, term143656.getClass(), "modalComp", null);
        setField(term143656, term143656.getClass(), "modalAppContext", null);
        setIntField(term143656, term143656.getClass(), "containerSerializedDataVersion", 0);
        setField(term143656, term143656.getClass(), "peer", null);
        setField(term143656, term143656.getClass(), "parent", null);
        setField(term143656, term143656.getClass(), "appContext", null);
        setIntField(term143656, term143656.getClass(), "x", 0);
        setIntField(term143656, term143656.getClass(), "y", 0);
        setIntField(term143656, term143656.getClass(), "width", 0);
        setIntField(term143656, term143656.getClass(), "height", 0);
        setField(term143656, term143656.getClass(), "foreground", null);
        setField(term143656, term143656.getClass(), "background", null);
        setField(term143656, term143656.getClass(), "font", null);
        setField(term143656, term143656.getClass(), "peerFont", null);
        setField(term143656, term143656.getClass(), "cursor", null);
        setField(term143656, term143656.getClass(), "locale", null);
        setField(term143656, term143656.getClass(), "graphicsConfig", null);
        setField(term143656, term143656.getClass(), "bufferStrategy", null);
        setBooleanField(term143656, term143656.getClass(), "ignoreRepaint", false);
        setBooleanField(term143656, term143656.getClass(), "visible", false);
        setBooleanField(term143656, term143656.getClass(), "enabled", false);
        setBooleanField(term143656, term143656.getClass(), "valid", false);
        setField(term143656, term143656.getClass(), "dropTarget", null);
        setField(term143656, term143656.getClass(), "popups", null);
        setField(term143656, term143656.getClass(), "name", null);
        setBooleanField(term143656, term143656.getClass(), "nameExplicitlySet", false);
        setBooleanField(term143656, term143656.getClass(), "focusable", false);
        setIntField(term143656, term143656.getClass(), "isFocusTraversableOverridden", 0);
        setField(term143656, term143656.getClass(), "focusTraversalKeys", null);
        setBooleanField(term143656, term143656.getClass(), "focusTraversalKeysEnabled", false);
        setField(term143656, term143656.getClass(), "acc", null);
        setField(term143656, term143656.getClass(), "minSize", null);
        setBooleanField(term143656, term143656.getClass(), "minSizeSet", false);
        setField(term143656, term143656.getClass(), "prefSize", null);
        setBooleanField(term143656, term143656.getClass(), "prefSizeSet", false);
        setField(term143656, term143656.getClass(), "maxSize", null);
        setBooleanField(term143656, term143656.getClass(), "maxSizeSet", false);
        setField(term143656, term143656.getClass(), "componentOrientation", null);
        setBooleanField(term143656, term143656.getClass(), "newEventsOnly", false);
        setField(term143656, term143656.getClass(), "componentListener", null);
        setField(term143656, term143656.getClass(), "focusListener", null);
        setField(term143656, term143656.getClass(), "hierarchyListener", null);
        setField(term143656, term143656.getClass(), "hierarchyBoundsListener", null);
        setField(term143656, term143656.getClass(), "keyListener", null);
        setField(term143656, term143656.getClass(), "mouseListener", null);
        setField(term143656, term143656.getClass(), "mouseMotionListener", null);
        setField(term143656, term143656.getClass(), "mouseWheelListener", null);
        setField(term143656, term143656.getClass(), "inputMethodListener", null);
        setLongField(term143656, term143656.getClass(), "eventMask", 0L);
        setField(term143656, term143656.getClass(), "changeSupport", null);
        setField(term143656, term143656.getClass(), "objectLock", null);
        setBooleanField(term143656, term143656.getClass(), "isPacked", false);
        setIntField(term143656, term143656.getClass(), "boundsOp", 0);
        setField(term143656, term143656.getClass(), "compoundShape", null);
        setField(term143656, term143656.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term143656, term143656.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term143656, term143656.getClass(), "backgroundEraseDisabled", false);
        setField(term143656, term143656.getClass(), "eventCache", null);
        setBooleanField(term143656, term143656.getClass(), "coalescingEnabled", false);
        setBooleanField(term143656, term143656.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term143656, term143656.getClass(), "componentSerializedDataVersion", 0);
        setField(term143656, term143656.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YcTbglHiUq";
        callMethod(klass, "setText", argTypes, term143656, args);
    }

};


