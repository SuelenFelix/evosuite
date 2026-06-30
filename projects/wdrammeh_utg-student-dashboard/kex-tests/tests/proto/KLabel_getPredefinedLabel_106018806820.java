package proto;

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
import static proto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class KLabel_getPredefinedLabel_106018806820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56699;
     Object term56748;

    public KLabel_getPredefinedLabel_106018806820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56699 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term56699, term56699.getClass(), "mnemonic", 0);
        setIntField(term56699, term56699.getClass(), "mnemonicIndex", 0);
        setField(term56699, term56699.getClass(), "text", null);
        setField(term56699, term56699.getClass(), "defaultIcon", null);
        setField(term56699, term56699.getClass(), "disabledIcon", null);
        setBooleanField(term56699, term56699.getClass(), "disabledIconSet", false);
        setIntField(term56699, term56699.getClass(), "verticalAlignment", 0);
        setIntField(term56699, term56699.getClass(), "horizontalAlignment", 0);
        setIntField(term56699, term56699.getClass(), "verticalTextPosition", 0);
        setIntField(term56699, term56699.getClass(), "horizontalTextPosition", 0);
        setIntField(term56699, term56699.getClass(), "iconTextGap", 0);
        setField(term56699, term56699.getClass(), "labelFor", null);
        setBooleanField(term56699, term56699.getClass(), "isAlignmentXSet", false);
        setFloatField(term56699, term56699.getClass(), "alignmentX", 0.0F);
        setBooleanField(term56699, term56699.getClass(), "isAlignmentYSet", false);
        setFloatField(term56699, term56699.getClass(), "alignmentY", 0.0F);
        setField(term56699, term56699.getClass(), "ui", null);
        setField(term56699, term56699.getClass(), "listenerList", null);
        setField(term56699, term56699.getClass(), "clientProperties", null);
        setField(term56699, term56699.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term56699, term56699.getClass(), "autoscrolls", false);
        setField(term56699, term56699.getClass(), "border", null);
        setIntField(term56699, term56699.getClass(), "flags", 0);
        setField(term56699, term56699.getClass(), "inputVerifier", null);
        setBooleanField(term56699, term56699.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term56699, term56699.getClass(), "paintingChild", null);
        setField(term56699, term56699.getClass(), "popupMenu", null);
        setField(term56699, term56699.getClass(), "revalidateRunnableScheduled", null);
        setField(term56699, term56699.getClass(), "focusInputMap", null);
        setField(term56699, term56699.getClass(), "ancestorInputMap", null);
        setField(term56699, term56699.getClass(), "windowInputMap", null);
        setField(term56699, term56699.getClass(), "actionMap", null);
        setField(term56699, term56699.getClass(), "aaHint", null);
        setField(term56699, term56699.getClass(), "lcdRenderingHint", null);
        setField(term56699, term56699.getClass(), "component", null);
        setField(term56699, term56699.getClass(), "layoutMgr", null);
        setField(term56699, term56699.getClass(), "dispatcher", null);
        setField(term56699, term56699.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term56699, term56699.getClass(), "focusCycleRoot", false);
        setBooleanField(term56699, term56699.getClass(), "focusTraversalPolicyProvider", false);
        setField(term56699, term56699.getClass(), "printingThreads", null);
        setBooleanField(term56699, term56699.getClass(), "printing", false);
        setField(term56699, term56699.getClass(), "containerListener", null);
        setIntField(term56699, term56699.getClass(), "listeningChildren", 0);
        setIntField(term56699, term56699.getClass(), "listeningBoundsChildren", 0);
        setIntField(term56699, term56699.getClass(), "descendantsCount", 0);
        setField(term56699, term56699.getClass(), "preserveBackgroundColor", null);
        setIntField(term56699, term56699.getClass(), "numOfHWComponents", 0);
        setIntField(term56699, term56699.getClass(), "numOfLWComponents", 0);
        setField(term56699, term56699.getClass(), "modalComp", null);
        setField(term56699, term56699.getClass(), "modalAppContext", null);
        setIntField(term56699, term56699.getClass(), "containerSerializedDataVersion", 0);
        setField(term56699, term56699.getClass(), "peer", null);
        setField(term56699, term56699.getClass(), "parent", null);
        setField(term56699, term56699.getClass(), "appContext", null);
        setIntField(term56699, term56699.getClass(), "x", 0);
        setIntField(term56699, term56699.getClass(), "y", 0);
        setIntField(term56699, term56699.getClass(), "width", 0);
        setIntField(term56699, term56699.getClass(), "height", 0);
        setField(term56699, term56699.getClass(), "foreground", null);
        setField(term56699, term56699.getClass(), "background", null);
        setField(term56699, term56699.getClass(), "font", null);
        setField(term56699, term56699.getClass(), "peerFont", null);
        setField(term56699, term56699.getClass(), "cursor", null);
        setField(term56699, term56699.getClass(), "locale", null);
        setField(term56699, term56699.getClass(), "graphicsConfig", null);
        setField(term56699, term56699.getClass(), "bufferStrategy", null);
        setBooleanField(term56699, term56699.getClass(), "ignoreRepaint", false);
        setBooleanField(term56699, term56699.getClass(), "visible", false);
        setBooleanField(term56699, term56699.getClass(), "enabled", false);
        setBooleanField(term56699, term56699.getClass(), "valid", false);
        setField(term56699, term56699.getClass(), "dropTarget", null);
        setField(term56699, term56699.getClass(), "popups", null);
        setField(term56699, term56699.getClass(), "name", null);
        setBooleanField(term56699, term56699.getClass(), "nameExplicitlySet", false);
        setBooleanField(term56699, term56699.getClass(), "focusable", false);
        setIntField(term56699, term56699.getClass(), "isFocusTraversableOverridden", 0);
        setField(term56699, term56699.getClass(), "focusTraversalKeys", null);
        setBooleanField(term56699, term56699.getClass(), "focusTraversalKeysEnabled", false);
        setField(term56699, term56699.getClass(), "acc", null);
        setField(term56699, term56699.getClass(), "minSize", null);
        setBooleanField(term56699, term56699.getClass(), "minSizeSet", false);
        setField(term56699, term56699.getClass(), "prefSize", null);
        setBooleanField(term56699, term56699.getClass(), "prefSizeSet", false);
        setField(term56699, term56699.getClass(), "maxSize", null);
        setBooleanField(term56699, term56699.getClass(), "maxSizeSet", false);
        setField(term56699, term56699.getClass(), "componentOrientation", null);
        setBooleanField(term56699, term56699.getClass(), "newEventsOnly", false);
        setField(term56699, term56699.getClass(), "componentListener", null);
        setField(term56699, term56699.getClass(), "focusListener", null);
        setField(term56699, term56699.getClass(), "hierarchyListener", null);
        setField(term56699, term56699.getClass(), "hierarchyBoundsListener", null);
        setField(term56699, term56699.getClass(), "keyListener", null);
        setField(term56699, term56699.getClass(), "mouseListener", null);
        setField(term56699, term56699.getClass(), "mouseMotionListener", null);
        setField(term56699, term56699.getClass(), "mouseWheelListener", null);
        setField(term56699, term56699.getClass(), "inputMethodListener", null);
        setLongField(term56699, term56699.getClass(), "eventMask", 0L);
        setField(term56699, term56699.getClass(), "changeSupport", null);
        setField(term56699, term56699.getClass(), "objectLock", null);
        setBooleanField(term56699, term56699.getClass(), "isPacked", false);
        setIntField(term56699, term56699.getClass(), "boundsOp", 0);
        setField(term56699, term56699.getClass(), "compoundShape", null);
        setField(term56699, term56699.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term56699, term56699.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term56699, term56699.getClass(), "backgroundEraseDisabled", false);
        setField(term56699, term56699.getClass(), "eventCache", null);
        setBooleanField(term56699, term56699.getClass(), "coalescingEnabled", false);
        setBooleanField(term56699, term56699.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term56699, term56699.getClass(), "componentSerializedDataVersion", 0);
        setField(term56699, term56699.getClass(), "accessibleContext", null);
        term56748 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term56748;
        callMethod(klass, "getPredefinedLabel", argTypes, term56699, args);
    }

};


