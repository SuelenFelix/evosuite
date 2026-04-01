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

public class SettingsActivity_1_setText_19668606553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143974;

    public SettingsActivity_1_setText_19668606553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143974 = newInstance(Class.forName("core.setting.SettingsActivity$1"));
        setIntField(term143974, term143974.getClass(), "mnemonic", 0);
        setIntField(term143974, term143974.getClass(), "mnemonicIndex", 0);
        setField(term143974, term143974.getClass(), "text", null);
        setField(term143974, term143974.getClass(), "defaultIcon", null);
        setField(term143974, term143974.getClass(), "disabledIcon", null);
        setBooleanField(term143974, term143974.getClass(), "disabledIconSet", false);
        setIntField(term143974, term143974.getClass(), "verticalAlignment", 0);
        setIntField(term143974, term143974.getClass(), "horizontalAlignment", 0);
        setIntField(term143974, term143974.getClass(), "verticalTextPosition", 0);
        setIntField(term143974, term143974.getClass(), "horizontalTextPosition", 0);
        setIntField(term143974, term143974.getClass(), "iconTextGap", 0);
        setField(term143974, term143974.getClass(), "labelFor", null);
        setBooleanField(term143974, term143974.getClass(), "isAlignmentXSet", false);
        setFloatField(term143974, term143974.getClass(), "alignmentX", 0.0F);
        setBooleanField(term143974, term143974.getClass(), "isAlignmentYSet", false);
        setFloatField(term143974, term143974.getClass(), "alignmentY", 0.0F);
        setField(term143974, term143974.getClass(), "ui", null);
        setField(term143974, term143974.getClass(), "listenerList", null);
        setField(term143974, term143974.getClass(), "clientProperties", null);
        setField(term143974, term143974.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term143974, term143974.getClass(), "autoscrolls", false);
        setField(term143974, term143974.getClass(), "border", null);
        setIntField(term143974, term143974.getClass(), "flags", 0);
        setField(term143974, term143974.getClass(), "inputVerifier", null);
        setBooleanField(term143974, term143974.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term143974, term143974.getClass(), "paintingChild", null);
        setField(term143974, term143974.getClass(), "popupMenu", null);
        setField(term143974, term143974.getClass(), "revalidateRunnableScheduled", null);
        setField(term143974, term143974.getClass(), "focusInputMap", null);
        setField(term143974, term143974.getClass(), "ancestorInputMap", null);
        setField(term143974, term143974.getClass(), "windowInputMap", null);
        setField(term143974, term143974.getClass(), "actionMap", null);
        setField(term143974, term143974.getClass(), "aaHint", null);
        setField(term143974, term143974.getClass(), "lcdRenderingHint", null);
        setField(term143974, term143974.getClass(), "component", null);
        setField(term143974, term143974.getClass(), "layoutMgr", null);
        setField(term143974, term143974.getClass(), "dispatcher", null);
        setField(term143974, term143974.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term143974, term143974.getClass(), "focusCycleRoot", false);
        setBooleanField(term143974, term143974.getClass(), "focusTraversalPolicyProvider", false);
        setField(term143974, term143974.getClass(), "printingThreads", null);
        setBooleanField(term143974, term143974.getClass(), "printing", false);
        setField(term143974, term143974.getClass(), "containerListener", null);
        setIntField(term143974, term143974.getClass(), "listeningChildren", 0);
        setIntField(term143974, term143974.getClass(), "listeningBoundsChildren", 0);
        setIntField(term143974, term143974.getClass(), "descendantsCount", 0);
        setField(term143974, term143974.getClass(), "preserveBackgroundColor", null);
        setIntField(term143974, term143974.getClass(), "numOfHWComponents", 0);
        setIntField(term143974, term143974.getClass(), "numOfLWComponents", 0);
        setField(term143974, term143974.getClass(), "modalComp", null);
        setField(term143974, term143974.getClass(), "modalAppContext", null);
        setIntField(term143974, term143974.getClass(), "containerSerializedDataVersion", 0);
        setField(term143974, term143974.getClass(), "peer", null);
        setField(term143974, term143974.getClass(), "parent", null);
        setField(term143974, term143974.getClass(), "appContext", null);
        setIntField(term143974, term143974.getClass(), "x", 0);
        setIntField(term143974, term143974.getClass(), "y", 0);
        setIntField(term143974, term143974.getClass(), "width", 0);
        setIntField(term143974, term143974.getClass(), "height", 0);
        setField(term143974, term143974.getClass(), "foreground", null);
        setField(term143974, term143974.getClass(), "background", null);
        setField(term143974, term143974.getClass(), "font", null);
        setField(term143974, term143974.getClass(), "peerFont", null);
        setField(term143974, term143974.getClass(), "cursor", null);
        setField(term143974, term143974.getClass(), "locale", null);
        setField(term143974, term143974.getClass(), "graphicsConfig", null);
        setField(term143974, term143974.getClass(), "bufferStrategy", null);
        setBooleanField(term143974, term143974.getClass(), "ignoreRepaint", false);
        setBooleanField(term143974, term143974.getClass(), "visible", false);
        setBooleanField(term143974, term143974.getClass(), "enabled", false);
        setBooleanField(term143974, term143974.getClass(), "valid", false);
        setField(term143974, term143974.getClass(), "dropTarget", null);
        setField(term143974, term143974.getClass(), "popups", null);
        setField(term143974, term143974.getClass(), "name", null);
        setBooleanField(term143974, term143974.getClass(), "nameExplicitlySet", false);
        setBooleanField(term143974, term143974.getClass(), "focusable", false);
        setIntField(term143974, term143974.getClass(), "isFocusTraversableOverridden", 0);
        setField(term143974, term143974.getClass(), "focusTraversalKeys", null);
        setBooleanField(term143974, term143974.getClass(), "focusTraversalKeysEnabled", false);
        setField(term143974, term143974.getClass(), "acc", null);
        setField(term143974, term143974.getClass(), "minSize", null);
        setBooleanField(term143974, term143974.getClass(), "minSizeSet", false);
        setField(term143974, term143974.getClass(), "prefSize", null);
        setBooleanField(term143974, term143974.getClass(), "prefSizeSet", false);
        setField(term143974, term143974.getClass(), "maxSize", null);
        setBooleanField(term143974, term143974.getClass(), "maxSizeSet", false);
        setField(term143974, term143974.getClass(), "componentOrientation", null);
        setBooleanField(term143974, term143974.getClass(), "newEventsOnly", false);
        setField(term143974, term143974.getClass(), "componentListener", null);
        setField(term143974, term143974.getClass(), "focusListener", null);
        setField(term143974, term143974.getClass(), "hierarchyListener", null);
        setField(term143974, term143974.getClass(), "hierarchyBoundsListener", null);
        setField(term143974, term143974.getClass(), "keyListener", null);
        setField(term143974, term143974.getClass(), "mouseListener", null);
        setField(term143974, term143974.getClass(), "mouseMotionListener", null);
        setField(term143974, term143974.getClass(), "mouseWheelListener", null);
        setField(term143974, term143974.getClass(), "inputMethodListener", null);
        setLongField(term143974, term143974.getClass(), "eventMask", 0L);
        setField(term143974, term143974.getClass(), "changeSupport", null);
        setField(term143974, term143974.getClass(), "objectLock", null);
        setBooleanField(term143974, term143974.getClass(), "isPacked", false);
        setIntField(term143974, term143974.getClass(), "boundsOp", 0);
        setField(term143974, term143974.getClass(), "compoundShape", null);
        setField(term143974, term143974.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term143974, term143974.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term143974, term143974.getClass(), "backgroundEraseDisabled", false);
        setField(term143974, term143974.getClass(), "eventCache", null);
        setBooleanField(term143974, term143974.getClass(), "coalescingEnabled", false);
        setBooleanField(term143974, term143974.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term143974, term143974.getClass(), "componentSerializedDataVersion", 0);
        setField(term143974, term143974.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term143974, args);
    }

};


