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
     Object term355;

    public SettingsActivity_1_setText_19668606551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355 = newInstance(Class.forName("core.setting.SettingsActivity$1"));
        Object term380 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term381 = (Object[]) newArray("java.lang.Object", 0);
        Object term382 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term383 = newInstance(Class.forName("java.lang.Object"));
        Object term384 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term385 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term386 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term355, term355.getClass(), "mnemonic", 1876565163);
        setIntField(term355, term355.getClass(), "mnemonicIndex", -817164822);
        setField(term355, term355.getClass(), "text", "NRdvgJlhkX");
        setField(term355, term355.getClass(), "defaultIcon", null);
        setField(term355, term355.getClass(), "disabledIcon", null);
        setBooleanField(term355, term355.getClass(), "disabledIconSet", true);
        setIntField(term355, term355.getClass(), "verticalAlignment", -1016503459);
        setIntField(term355, term355.getClass(), "horizontalAlignment", -1968847291);
        setIntField(term355, term355.getClass(), "verticalTextPosition", 579005622);
        setIntField(term355, term355.getClass(), "horizontalTextPosition", -14890619);
        setIntField(term355, term355.getClass(), "iconTextGap", 1632125673);
        setField(term355, term355.getClass(), "labelFor", null);
        setBooleanField(term355, term355.getClass(), "isAlignmentXSet", false);
        setFloatField(term355, term355.getClass(), "alignmentX", 0.5523636F);
        setBooleanField(term355, term355.getClass(), "isAlignmentYSet", false);
        setFloatField(term355, term355.getClass(), "alignmentY", 0.8564069F);
        setField(term355, term355.getClass(), "ui", null);
        setField(term380, term380.getClass(), "listenerList", term381);
        setField(term355, term355.getClass(), "listenerList", term380);
        setField(term382, term382.getClass(), "table", term383);
        setField(term355, term355.getClass(), "clientProperties", term382);
        setField(term385, term385.getClass(), "map", null);
        setField(term384, term384.getClass(), "map", term385);
        setField(term384, term384.getClass(), "source", term386);
        setField(term355, term355.getClass(), "vetoableChangeSupport", term384);
        setBooleanField(term355, term355.getClass(), "autoscrolls", false);
        setField(term355, term355.getClass(), "border", null);
        setIntField(term355, term355.getClass(), "flags", -1786399638);
        setField(term355, term355.getClass(), "inputVerifier", null);
        setBooleanField(term355, term355.getClass(), "verifyInputWhenFocusTarget", true);
        setField(term355, term355.getClass(), "paintingChild", null);
        setField(term355, term355.getClass(), "popupMenu", null);
        setField(term355, term355.getClass(), "revalidateRunnableScheduled", null);
        setField(term355, term355.getClass(), "focusInputMap", null);
        setField(term355, term355.getClass(), "ancestorInputMap", null);
        setField(term355, term355.getClass(), "windowInputMap", null);
        setField(term355, term355.getClass(), "actionMap", null);
        setField(term355, term355.getClass(), "aaHint", null);
        setField(term355, term355.getClass(), "lcdRenderingHint", null);
        setField(term355, term355.getClass(), "component", null);
        setField(term355, term355.getClass(), "layoutMgr", null);
        setField(term355, term355.getClass(), "dispatcher", null);
        setField(term355, term355.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term355, term355.getClass(), "focusCycleRoot", false);
        setBooleanField(term355, term355.getClass(), "focusTraversalPolicyProvider", false);
        setField(term355, term355.getClass(), "printingThreads", null);
        setBooleanField(term355, term355.getClass(), "printing", false);
        setField(term355, term355.getClass(), "containerListener", null);
        setIntField(term355, term355.getClass(), "listeningChildren", 0);
        setIntField(term355, term355.getClass(), "listeningBoundsChildren", 0);
        setIntField(term355, term355.getClass(), "descendantsCount", 0);
        setField(term355, term355.getClass(), "preserveBackgroundColor", null);
        setIntField(term355, term355.getClass(), "numOfHWComponents", 0);
        setIntField(term355, term355.getClass(), "numOfLWComponents", 0);
        setField(term355, term355.getClass(), "modalComp", null);
        setField(term355, term355.getClass(), "modalAppContext", null);
        setIntField(term355, term355.getClass(), "containerSerializedDataVersion", 0);
        setField(term355, term355.getClass(), "peer", null);
        setField(term355, term355.getClass(), "parent", null);
        setField(term355, term355.getClass(), "appContext", null);
        setIntField(term355, term355.getClass(), "x", 0);
        setIntField(term355, term355.getClass(), "y", 0);
        setIntField(term355, term355.getClass(), "width", 0);
        setIntField(term355, term355.getClass(), "height", 0);
        setField(term355, term355.getClass(), "foreground", null);
        setField(term355, term355.getClass(), "background", null);
        setField(term355, term355.getClass(), "font", null);
        setField(term355, term355.getClass(), "peerFont", null);
        setField(term355, term355.getClass(), "cursor", null);
        setField(term355, term355.getClass(), "locale", null);
        setField(term355, term355.getClass(), "graphicsConfig", null);
        setField(term355, term355.getClass(), "bufferStrategy", null);
        setBooleanField(term355, term355.getClass(), "ignoreRepaint", false);
        setBooleanField(term355, term355.getClass(), "visible", false);
        setBooleanField(term355, term355.getClass(), "enabled", false);
        setBooleanField(term355, term355.getClass(), "valid", false);
        setField(term355, term355.getClass(), "dropTarget", null);
        setField(term355, term355.getClass(), "popups", null);
        setField(term355, term355.getClass(), "name", null);
        setBooleanField(term355, term355.getClass(), "nameExplicitlySet", false);
        setBooleanField(term355, term355.getClass(), "focusable", false);
        setIntField(term355, term355.getClass(), "isFocusTraversableOverridden", 0);
        setField(term355, term355.getClass(), "focusTraversalKeys", null);
        setBooleanField(term355, term355.getClass(), "focusTraversalKeysEnabled", false);
        setField(term355, term355.getClass(), "acc", null);
        setField(term355, term355.getClass(), "minSize", null);
        setBooleanField(term355, term355.getClass(), "minSizeSet", false);
        setField(term355, term355.getClass(), "prefSize", null);
        setBooleanField(term355, term355.getClass(), "prefSizeSet", false);
        setField(term355, term355.getClass(), "maxSize", null);
        setBooleanField(term355, term355.getClass(), "maxSizeSet", false);
        setField(term355, term355.getClass(), "componentOrientation", null);
        setBooleanField(term355, term355.getClass(), "newEventsOnly", false);
        setField(term355, term355.getClass(), "componentListener", null);
        setField(term355, term355.getClass(), "focusListener", null);
        setField(term355, term355.getClass(), "hierarchyListener", null);
        setField(term355, term355.getClass(), "hierarchyBoundsListener", null);
        setField(term355, term355.getClass(), "keyListener", null);
        setField(term355, term355.getClass(), "mouseListener", null);
        setField(term355, term355.getClass(), "mouseMotionListener", null);
        setField(term355, term355.getClass(), "mouseWheelListener", null);
        setField(term355, term355.getClass(), "inputMethodListener", null);
        setLongField(term355, term355.getClass(), "eventMask", 0L);
        setField(term355, term355.getClass(), "changeSupport", null);
        setField(term355, term355.getClass(), "objectLock", null);
        setBooleanField(term355, term355.getClass(), "isPacked", false);
        setIntField(term355, term355.getClass(), "boundsOp", 0);
        setField(term355, term355.getClass(), "compoundShape", null);
        setField(term355, term355.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term355, term355.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term355, term355.getClass(), "backgroundEraseDisabled", false);
        setField(term355, term355.getClass(), "eventCache", null);
        setBooleanField(term355, term355.getClass(), "coalescingEnabled", false);
        setBooleanField(term355, term355.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term355, term355.getClass(), "componentSerializedDataVersion", 0);
        setField(term355, term355.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        callMethod(klass, "setText", argTypes, term355, args);
    }

};


