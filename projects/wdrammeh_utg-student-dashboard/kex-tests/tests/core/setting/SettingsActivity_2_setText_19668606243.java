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
     Object term237;

    public SettingsActivity_2_setText_19668606243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237 = newInstance(Class.forName("core.setting.SettingsActivity$2"));
        setIntField(term237, term237.getClass(), "mnemonic", 0);
        setIntField(term237, term237.getClass(), "mnemonicIndex", 0);
        setField(term237, term237.getClass(), "text", null);
        setField(term237, term237.getClass(), "defaultIcon", null);
        setField(term237, term237.getClass(), "disabledIcon", null);
        setBooleanField(term237, term237.getClass(), "disabledIconSet", false);
        setIntField(term237, term237.getClass(), "verticalAlignment", 0);
        setIntField(term237, term237.getClass(), "horizontalAlignment", 0);
        setIntField(term237, term237.getClass(), "verticalTextPosition", 0);
        setIntField(term237, term237.getClass(), "horizontalTextPosition", 0);
        setIntField(term237, term237.getClass(), "iconTextGap", 0);
        setField(term237, term237.getClass(), "labelFor", null);
        setBooleanField(term237, term237.getClass(), "isAlignmentXSet", false);
        setFloatField(term237, term237.getClass(), "alignmentX", 0.0F);
        setBooleanField(term237, term237.getClass(), "isAlignmentYSet", false);
        setFloatField(term237, term237.getClass(), "alignmentY", 0.0F);
        setField(term237, term237.getClass(), "ui", null);
        setField(term237, term237.getClass(), "listenerList", null);
        setField(term237, term237.getClass(), "clientProperties", null);
        setField(term237, term237.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term237, term237.getClass(), "autoscrolls", false);
        setField(term237, term237.getClass(), "border", null);
        setIntField(term237, term237.getClass(), "flags", 0);
        setField(term237, term237.getClass(), "inputVerifier", null);
        setBooleanField(term237, term237.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term237, term237.getClass(), "paintingChild", null);
        setField(term237, term237.getClass(), "popupMenu", null);
        setField(term237, term237.getClass(), "revalidateRunnableScheduled", null);
        setField(term237, term237.getClass(), "focusInputMap", null);
        setField(term237, term237.getClass(), "ancestorInputMap", null);
        setField(term237, term237.getClass(), "windowInputMap", null);
        setField(term237, term237.getClass(), "actionMap", null);
        setField(term237, term237.getClass(), "aaHint", null);
        setField(term237, term237.getClass(), "lcdRenderingHint", null);
        setField(term237, term237.getClass(), "component", null);
        setField(term237, term237.getClass(), "layoutMgr", null);
        setField(term237, term237.getClass(), "dispatcher", null);
        setField(term237, term237.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term237, term237.getClass(), "focusCycleRoot", false);
        setBooleanField(term237, term237.getClass(), "focusTraversalPolicyProvider", false);
        setField(term237, term237.getClass(), "printingThreads", null);
        setBooleanField(term237, term237.getClass(), "printing", false);
        setField(term237, term237.getClass(), "containerListener", null);
        setIntField(term237, term237.getClass(), "listeningChildren", 0);
        setIntField(term237, term237.getClass(), "listeningBoundsChildren", 0);
        setIntField(term237, term237.getClass(), "descendantsCount", 0);
        setField(term237, term237.getClass(), "preserveBackgroundColor", null);
        setIntField(term237, term237.getClass(), "numOfHWComponents", 0);
        setIntField(term237, term237.getClass(), "numOfLWComponents", 0);
        setField(term237, term237.getClass(), "modalComp", null);
        setField(term237, term237.getClass(), "modalAppContext", null);
        setIntField(term237, term237.getClass(), "containerSerializedDataVersion", 0);
        setField(term237, term237.getClass(), "peer", null);
        setField(term237, term237.getClass(), "parent", null);
        setField(term237, term237.getClass(), "appContext", null);
        setIntField(term237, term237.getClass(), "x", 0);
        setIntField(term237, term237.getClass(), "y", 0);
        setIntField(term237, term237.getClass(), "width", 0);
        setIntField(term237, term237.getClass(), "height", 0);
        setField(term237, term237.getClass(), "foreground", null);
        setField(term237, term237.getClass(), "background", null);
        setField(term237, term237.getClass(), "font", null);
        setField(term237, term237.getClass(), "peerFont", null);
        setField(term237, term237.getClass(), "cursor", null);
        setField(term237, term237.getClass(), "locale", null);
        setField(term237, term237.getClass(), "graphicsConfig", null);
        setField(term237, term237.getClass(), "bufferStrategy", null);
        setBooleanField(term237, term237.getClass(), "ignoreRepaint", false);
        setBooleanField(term237, term237.getClass(), "visible", false);
        setBooleanField(term237, term237.getClass(), "enabled", false);
        setBooleanField(term237, term237.getClass(), "valid", false);
        setField(term237, term237.getClass(), "dropTarget", null);
        setField(term237, term237.getClass(), "popups", null);
        setField(term237, term237.getClass(), "name", null);
        setBooleanField(term237, term237.getClass(), "nameExplicitlySet", false);
        setBooleanField(term237, term237.getClass(), "focusable", false);
        setIntField(term237, term237.getClass(), "isFocusTraversableOverridden", 0);
        setField(term237, term237.getClass(), "focusTraversalKeys", null);
        setBooleanField(term237, term237.getClass(), "focusTraversalKeysEnabled", false);
        setField(term237, term237.getClass(), "acc", null);
        setField(term237, term237.getClass(), "minSize", null);
        setBooleanField(term237, term237.getClass(), "minSizeSet", false);
        setField(term237, term237.getClass(), "prefSize", null);
        setBooleanField(term237, term237.getClass(), "prefSizeSet", false);
        setField(term237, term237.getClass(), "maxSize", null);
        setBooleanField(term237, term237.getClass(), "maxSizeSet", false);
        setField(term237, term237.getClass(), "componentOrientation", null);
        setBooleanField(term237, term237.getClass(), "newEventsOnly", false);
        setField(term237, term237.getClass(), "componentListener", null);
        setField(term237, term237.getClass(), "focusListener", null);
        setField(term237, term237.getClass(), "hierarchyListener", null);
        setField(term237, term237.getClass(), "hierarchyBoundsListener", null);
        setField(term237, term237.getClass(), "keyListener", null);
        setField(term237, term237.getClass(), "mouseListener", null);
        setField(term237, term237.getClass(), "mouseMotionListener", null);
        setField(term237, term237.getClass(), "mouseWheelListener", null);
        setField(term237, term237.getClass(), "inputMethodListener", null);
        setLongField(term237, term237.getClass(), "eventMask", 0L);
        setField(term237, term237.getClass(), "changeSupport", null);
        setField(term237, term237.getClass(), "objectLock", null);
        setBooleanField(term237, term237.getClass(), "isPacked", false);
        setIntField(term237, term237.getClass(), "boundsOp", 0);
        setField(term237, term237.getClass(), "compoundShape", null);
        setField(term237, term237.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term237, term237.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term237, term237.getClass(), "backgroundEraseDisabled", false);
        setField(term237, term237.getClass(), "eventCache", null);
        setBooleanField(term237, term237.getClass(), "coalescingEnabled", false);
        setBooleanField(term237, term237.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term237, term237.getClass(), "componentSerializedDataVersion", 0);
        setField(term237, term237.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term237, args);
    }

};


