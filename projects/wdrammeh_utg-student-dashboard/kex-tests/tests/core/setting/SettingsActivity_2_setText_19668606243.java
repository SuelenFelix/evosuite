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

public class SettingsActivity_2_setText_19668606243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143756;

    public SettingsActivity_2_setText_19668606243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143756 = newInstance(Class.forName("core.setting.SettingsActivity$2"));
        setIntField(term143756, term143756.getClass(), "mnemonic", 0);
        setIntField(term143756, term143756.getClass(), "mnemonicIndex", 0);
        setField(term143756, term143756.getClass(), "text", null);
        setField(term143756, term143756.getClass(), "defaultIcon", null);
        setField(term143756, term143756.getClass(), "disabledIcon", null);
        setBooleanField(term143756, term143756.getClass(), "disabledIconSet", false);
        setIntField(term143756, term143756.getClass(), "verticalAlignment", 0);
        setIntField(term143756, term143756.getClass(), "horizontalAlignment", 0);
        setIntField(term143756, term143756.getClass(), "verticalTextPosition", 0);
        setIntField(term143756, term143756.getClass(), "horizontalTextPosition", 0);
        setIntField(term143756, term143756.getClass(), "iconTextGap", 0);
        setField(term143756, term143756.getClass(), "labelFor", null);
        setBooleanField(term143756, term143756.getClass(), "isAlignmentXSet", false);
        setFloatField(term143756, term143756.getClass(), "alignmentX", 0.0F);
        setBooleanField(term143756, term143756.getClass(), "isAlignmentYSet", false);
        setFloatField(term143756, term143756.getClass(), "alignmentY", 0.0F);
        setField(term143756, term143756.getClass(), "ui", null);
        setField(term143756, term143756.getClass(), "listenerList", null);
        setField(term143756, term143756.getClass(), "clientProperties", null);
        setField(term143756, term143756.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term143756, term143756.getClass(), "autoscrolls", false);
        setField(term143756, term143756.getClass(), "border", null);
        setIntField(term143756, term143756.getClass(), "flags", 0);
        setField(term143756, term143756.getClass(), "inputVerifier", null);
        setBooleanField(term143756, term143756.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term143756, term143756.getClass(), "paintingChild", null);
        setField(term143756, term143756.getClass(), "popupMenu", null);
        setField(term143756, term143756.getClass(), "revalidateRunnableScheduled", null);
        setField(term143756, term143756.getClass(), "focusInputMap", null);
        setField(term143756, term143756.getClass(), "ancestorInputMap", null);
        setField(term143756, term143756.getClass(), "windowInputMap", null);
        setField(term143756, term143756.getClass(), "actionMap", null);
        setField(term143756, term143756.getClass(), "aaHint", null);
        setField(term143756, term143756.getClass(), "lcdRenderingHint", null);
        setField(term143756, term143756.getClass(), "component", null);
        setField(term143756, term143756.getClass(), "layoutMgr", null);
        setField(term143756, term143756.getClass(), "dispatcher", null);
        setField(term143756, term143756.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term143756, term143756.getClass(), "focusCycleRoot", false);
        setBooleanField(term143756, term143756.getClass(), "focusTraversalPolicyProvider", false);
        setField(term143756, term143756.getClass(), "printingThreads", null);
        setBooleanField(term143756, term143756.getClass(), "printing", false);
        setField(term143756, term143756.getClass(), "containerListener", null);
        setIntField(term143756, term143756.getClass(), "listeningChildren", 0);
        setIntField(term143756, term143756.getClass(), "listeningBoundsChildren", 0);
        setIntField(term143756, term143756.getClass(), "descendantsCount", 0);
        setField(term143756, term143756.getClass(), "preserveBackgroundColor", null);
        setIntField(term143756, term143756.getClass(), "numOfHWComponents", 0);
        setIntField(term143756, term143756.getClass(), "numOfLWComponents", 0);
        setField(term143756, term143756.getClass(), "modalComp", null);
        setField(term143756, term143756.getClass(), "modalAppContext", null);
        setIntField(term143756, term143756.getClass(), "containerSerializedDataVersion", 0);
        setField(term143756, term143756.getClass(), "peer", null);
        setField(term143756, term143756.getClass(), "parent", null);
        setField(term143756, term143756.getClass(), "appContext", null);
        setIntField(term143756, term143756.getClass(), "x", 0);
        setIntField(term143756, term143756.getClass(), "y", 0);
        setIntField(term143756, term143756.getClass(), "width", 0);
        setIntField(term143756, term143756.getClass(), "height", 0);
        setField(term143756, term143756.getClass(), "foreground", null);
        setField(term143756, term143756.getClass(), "background", null);
        setField(term143756, term143756.getClass(), "font", null);
        setField(term143756, term143756.getClass(), "peerFont", null);
        setField(term143756, term143756.getClass(), "cursor", null);
        setField(term143756, term143756.getClass(), "locale", null);
        setField(term143756, term143756.getClass(), "graphicsConfig", null);
        setField(term143756, term143756.getClass(), "bufferStrategy", null);
        setBooleanField(term143756, term143756.getClass(), "ignoreRepaint", false);
        setBooleanField(term143756, term143756.getClass(), "visible", false);
        setBooleanField(term143756, term143756.getClass(), "enabled", false);
        setBooleanField(term143756, term143756.getClass(), "valid", false);
        setField(term143756, term143756.getClass(), "dropTarget", null);
        setField(term143756, term143756.getClass(), "popups", null);
        setField(term143756, term143756.getClass(), "name", null);
        setBooleanField(term143756, term143756.getClass(), "nameExplicitlySet", false);
        setBooleanField(term143756, term143756.getClass(), "focusable", false);
        setIntField(term143756, term143756.getClass(), "isFocusTraversableOverridden", 0);
        setField(term143756, term143756.getClass(), "focusTraversalKeys", null);
        setBooleanField(term143756, term143756.getClass(), "focusTraversalKeysEnabled", false);
        setField(term143756, term143756.getClass(), "acc", null);
        setField(term143756, term143756.getClass(), "minSize", null);
        setBooleanField(term143756, term143756.getClass(), "minSizeSet", false);
        setField(term143756, term143756.getClass(), "prefSize", null);
        setBooleanField(term143756, term143756.getClass(), "prefSizeSet", false);
        setField(term143756, term143756.getClass(), "maxSize", null);
        setBooleanField(term143756, term143756.getClass(), "maxSizeSet", false);
        setField(term143756, term143756.getClass(), "componentOrientation", null);
        setBooleanField(term143756, term143756.getClass(), "newEventsOnly", false);
        setField(term143756, term143756.getClass(), "componentListener", null);
        setField(term143756, term143756.getClass(), "focusListener", null);
        setField(term143756, term143756.getClass(), "hierarchyListener", null);
        setField(term143756, term143756.getClass(), "hierarchyBoundsListener", null);
        setField(term143756, term143756.getClass(), "keyListener", null);
        setField(term143756, term143756.getClass(), "mouseListener", null);
        setField(term143756, term143756.getClass(), "mouseMotionListener", null);
        setField(term143756, term143756.getClass(), "mouseWheelListener", null);
        setField(term143756, term143756.getClass(), "inputMethodListener", null);
        setLongField(term143756, term143756.getClass(), "eventMask", 0L);
        setField(term143756, term143756.getClass(), "changeSupport", null);
        setField(term143756, term143756.getClass(), "objectLock", null);
        setBooleanField(term143756, term143756.getClass(), "isPacked", false);
        setIntField(term143756, term143756.getClass(), "boundsOp", 0);
        setField(term143756, term143756.getClass(), "compoundShape", null);
        setField(term143756, term143756.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term143756, term143756.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term143756, term143756.getClass(), "backgroundEraseDisabled", false);
        setField(term143756, term143756.getClass(), "eventCache", null);
        setBooleanField(term143756, term143756.getClass(), "coalescingEnabled", false);
        setBooleanField(term143756, term143756.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term143756, term143756.getClass(), "componentSerializedDataVersion", 0);
        setField(term143756, term143756.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term143756, args);
    }

};


