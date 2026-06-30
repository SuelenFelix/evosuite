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
     Object term455;

    public SettingsActivity_1_setText_19668606553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term455 = newInstance(Class.forName("core.setting.SettingsActivity$1"));
        setIntField(term455, term455.getClass(), "mnemonic", 0);
        setIntField(term455, term455.getClass(), "mnemonicIndex", 0);
        setField(term455, term455.getClass(), "text", null);
        setField(term455, term455.getClass(), "defaultIcon", null);
        setField(term455, term455.getClass(), "disabledIcon", null);
        setBooleanField(term455, term455.getClass(), "disabledIconSet", false);
        setIntField(term455, term455.getClass(), "verticalAlignment", 0);
        setIntField(term455, term455.getClass(), "horizontalAlignment", 0);
        setIntField(term455, term455.getClass(), "verticalTextPosition", 0);
        setIntField(term455, term455.getClass(), "horizontalTextPosition", 0);
        setIntField(term455, term455.getClass(), "iconTextGap", 0);
        setField(term455, term455.getClass(), "labelFor", null);
        setBooleanField(term455, term455.getClass(), "isAlignmentXSet", false);
        setFloatField(term455, term455.getClass(), "alignmentX", 0.0F);
        setBooleanField(term455, term455.getClass(), "isAlignmentYSet", false);
        setFloatField(term455, term455.getClass(), "alignmentY", 0.0F);
        setField(term455, term455.getClass(), "ui", null);
        setField(term455, term455.getClass(), "listenerList", null);
        setField(term455, term455.getClass(), "clientProperties", null);
        setField(term455, term455.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term455, term455.getClass(), "autoscrolls", false);
        setField(term455, term455.getClass(), "border", null);
        setIntField(term455, term455.getClass(), "flags", 0);
        setField(term455, term455.getClass(), "inputVerifier", null);
        setBooleanField(term455, term455.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term455, term455.getClass(), "paintingChild", null);
        setField(term455, term455.getClass(), "popupMenu", null);
        setField(term455, term455.getClass(), "revalidateRunnableScheduled", null);
        setField(term455, term455.getClass(), "focusInputMap", null);
        setField(term455, term455.getClass(), "ancestorInputMap", null);
        setField(term455, term455.getClass(), "windowInputMap", null);
        setField(term455, term455.getClass(), "actionMap", null);
        setField(term455, term455.getClass(), "aaHint", null);
        setField(term455, term455.getClass(), "lcdRenderingHint", null);
        setField(term455, term455.getClass(), "component", null);
        setField(term455, term455.getClass(), "layoutMgr", null);
        setField(term455, term455.getClass(), "dispatcher", null);
        setField(term455, term455.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term455, term455.getClass(), "focusCycleRoot", false);
        setBooleanField(term455, term455.getClass(), "focusTraversalPolicyProvider", false);
        setField(term455, term455.getClass(), "printingThreads", null);
        setBooleanField(term455, term455.getClass(), "printing", false);
        setField(term455, term455.getClass(), "containerListener", null);
        setIntField(term455, term455.getClass(), "listeningChildren", 0);
        setIntField(term455, term455.getClass(), "listeningBoundsChildren", 0);
        setIntField(term455, term455.getClass(), "descendantsCount", 0);
        setField(term455, term455.getClass(), "preserveBackgroundColor", null);
        setIntField(term455, term455.getClass(), "numOfHWComponents", 0);
        setIntField(term455, term455.getClass(), "numOfLWComponents", 0);
        setField(term455, term455.getClass(), "modalComp", null);
        setField(term455, term455.getClass(), "modalAppContext", null);
        setIntField(term455, term455.getClass(), "containerSerializedDataVersion", 0);
        setField(term455, term455.getClass(), "peer", null);
        setField(term455, term455.getClass(), "parent", null);
        setField(term455, term455.getClass(), "appContext", null);
        setIntField(term455, term455.getClass(), "x", 0);
        setIntField(term455, term455.getClass(), "y", 0);
        setIntField(term455, term455.getClass(), "width", 0);
        setIntField(term455, term455.getClass(), "height", 0);
        setField(term455, term455.getClass(), "foreground", null);
        setField(term455, term455.getClass(), "background", null);
        setField(term455, term455.getClass(), "font", null);
        setField(term455, term455.getClass(), "peerFont", null);
        setField(term455, term455.getClass(), "cursor", null);
        setField(term455, term455.getClass(), "locale", null);
        setField(term455, term455.getClass(), "graphicsConfig", null);
        setField(term455, term455.getClass(), "bufferStrategy", null);
        setBooleanField(term455, term455.getClass(), "ignoreRepaint", false);
        setBooleanField(term455, term455.getClass(), "visible", false);
        setBooleanField(term455, term455.getClass(), "enabled", false);
        setBooleanField(term455, term455.getClass(), "valid", false);
        setField(term455, term455.getClass(), "dropTarget", null);
        setField(term455, term455.getClass(), "popups", null);
        setField(term455, term455.getClass(), "name", null);
        setBooleanField(term455, term455.getClass(), "nameExplicitlySet", false);
        setBooleanField(term455, term455.getClass(), "focusable", false);
        setIntField(term455, term455.getClass(), "isFocusTraversableOverridden", 0);
        setField(term455, term455.getClass(), "focusTraversalKeys", null);
        setBooleanField(term455, term455.getClass(), "focusTraversalKeysEnabled", false);
        setField(term455, term455.getClass(), "acc", null);
        setField(term455, term455.getClass(), "minSize", null);
        setBooleanField(term455, term455.getClass(), "minSizeSet", false);
        setField(term455, term455.getClass(), "prefSize", null);
        setBooleanField(term455, term455.getClass(), "prefSizeSet", false);
        setField(term455, term455.getClass(), "maxSize", null);
        setBooleanField(term455, term455.getClass(), "maxSizeSet", false);
        setField(term455, term455.getClass(), "componentOrientation", null);
        setBooleanField(term455, term455.getClass(), "newEventsOnly", false);
        setField(term455, term455.getClass(), "componentListener", null);
        setField(term455, term455.getClass(), "focusListener", null);
        setField(term455, term455.getClass(), "hierarchyListener", null);
        setField(term455, term455.getClass(), "hierarchyBoundsListener", null);
        setField(term455, term455.getClass(), "keyListener", null);
        setField(term455, term455.getClass(), "mouseListener", null);
        setField(term455, term455.getClass(), "mouseMotionListener", null);
        setField(term455, term455.getClass(), "mouseWheelListener", null);
        setField(term455, term455.getClass(), "inputMethodListener", null);
        setLongField(term455, term455.getClass(), "eventMask", 0L);
        setField(term455, term455.getClass(), "changeSupport", null);
        setField(term455, term455.getClass(), "objectLock", null);
        setBooleanField(term455, term455.getClass(), "isPacked", false);
        setIntField(term455, term455.getClass(), "boundsOp", 0);
        setField(term455, term455.getClass(), "compoundShape", null);
        setField(term455, term455.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term455, term455.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term455, term455.getClass(), "backgroundEraseDisabled", false);
        setField(term455, term455.getClass(), "eventCache", null);
        setBooleanField(term455, term455.getClass(), "coalescingEnabled", false);
        setBooleanField(term455, term455.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term455, term455.getClass(), "componentSerializedDataVersion", 0);
        setField(term455, term455.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term455, args);
    }

};


