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
     Object term56748;
     Object term56797;

    public KLabel_getPredefinedLabel_106018806820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56748 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term56748, term56748.getClass(), "mnemonic", 0);
        setIntField(term56748, term56748.getClass(), "mnemonicIndex", 0);
        setField(term56748, term56748.getClass(), "text", null);
        setField(term56748, term56748.getClass(), "defaultIcon", null);
        setField(term56748, term56748.getClass(), "disabledIcon", null);
        setBooleanField(term56748, term56748.getClass(), "disabledIconSet", false);
        setIntField(term56748, term56748.getClass(), "verticalAlignment", 0);
        setIntField(term56748, term56748.getClass(), "horizontalAlignment", 0);
        setIntField(term56748, term56748.getClass(), "verticalTextPosition", 0);
        setIntField(term56748, term56748.getClass(), "horizontalTextPosition", 0);
        setIntField(term56748, term56748.getClass(), "iconTextGap", 0);
        setField(term56748, term56748.getClass(), "labelFor", null);
        setBooleanField(term56748, term56748.getClass(), "isAlignmentXSet", false);
        setFloatField(term56748, term56748.getClass(), "alignmentX", 0.0F);
        setBooleanField(term56748, term56748.getClass(), "isAlignmentYSet", false);
        setFloatField(term56748, term56748.getClass(), "alignmentY", 0.0F);
        setField(term56748, term56748.getClass(), "ui", null);
        setField(term56748, term56748.getClass(), "listenerList", null);
        setField(term56748, term56748.getClass(), "clientProperties", null);
        setField(term56748, term56748.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term56748, term56748.getClass(), "autoscrolls", false);
        setField(term56748, term56748.getClass(), "border", null);
        setIntField(term56748, term56748.getClass(), "flags", 0);
        setField(term56748, term56748.getClass(), "inputVerifier", null);
        setBooleanField(term56748, term56748.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term56748, term56748.getClass(), "paintingChild", null);
        setField(term56748, term56748.getClass(), "popupMenu", null);
        setField(term56748, term56748.getClass(), "revalidateRunnableScheduled", null);
        setField(term56748, term56748.getClass(), "focusInputMap", null);
        setField(term56748, term56748.getClass(), "ancestorInputMap", null);
        setField(term56748, term56748.getClass(), "windowInputMap", null);
        setField(term56748, term56748.getClass(), "actionMap", null);
        setField(term56748, term56748.getClass(), "aaHint", null);
        setField(term56748, term56748.getClass(), "lcdRenderingHint", null);
        setField(term56748, term56748.getClass(), "component", null);
        setField(term56748, term56748.getClass(), "layoutMgr", null);
        setField(term56748, term56748.getClass(), "dispatcher", null);
        setField(term56748, term56748.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term56748, term56748.getClass(), "focusCycleRoot", false);
        setBooleanField(term56748, term56748.getClass(), "focusTraversalPolicyProvider", false);
        setField(term56748, term56748.getClass(), "printingThreads", null);
        setBooleanField(term56748, term56748.getClass(), "printing", false);
        setField(term56748, term56748.getClass(), "containerListener", null);
        setIntField(term56748, term56748.getClass(), "listeningChildren", 0);
        setIntField(term56748, term56748.getClass(), "listeningBoundsChildren", 0);
        setIntField(term56748, term56748.getClass(), "descendantsCount", 0);
        setField(term56748, term56748.getClass(), "preserveBackgroundColor", null);
        setIntField(term56748, term56748.getClass(), "numOfHWComponents", 0);
        setIntField(term56748, term56748.getClass(), "numOfLWComponents", 0);
        setField(term56748, term56748.getClass(), "modalComp", null);
        setField(term56748, term56748.getClass(), "modalAppContext", null);
        setIntField(term56748, term56748.getClass(), "containerSerializedDataVersion", 0);
        setField(term56748, term56748.getClass(), "peer", null);
        setField(term56748, term56748.getClass(), "parent", null);
        setField(term56748, term56748.getClass(), "appContext", null);
        setIntField(term56748, term56748.getClass(), "x", 0);
        setIntField(term56748, term56748.getClass(), "y", 0);
        setIntField(term56748, term56748.getClass(), "width", 0);
        setIntField(term56748, term56748.getClass(), "height", 0);
        setField(term56748, term56748.getClass(), "foreground", null);
        setField(term56748, term56748.getClass(), "background", null);
        setField(term56748, term56748.getClass(), "font", null);
        setField(term56748, term56748.getClass(), "peerFont", null);
        setField(term56748, term56748.getClass(), "cursor", null);
        setField(term56748, term56748.getClass(), "locale", null);
        setField(term56748, term56748.getClass(), "graphicsConfig", null);
        setField(term56748, term56748.getClass(), "bufferStrategy", null);
        setBooleanField(term56748, term56748.getClass(), "ignoreRepaint", false);
        setBooleanField(term56748, term56748.getClass(), "visible", false);
        setBooleanField(term56748, term56748.getClass(), "enabled", false);
        setBooleanField(term56748, term56748.getClass(), "valid", false);
        setField(term56748, term56748.getClass(), "dropTarget", null);
        setField(term56748, term56748.getClass(), "popups", null);
        setField(term56748, term56748.getClass(), "name", null);
        setBooleanField(term56748, term56748.getClass(), "nameExplicitlySet", false);
        setBooleanField(term56748, term56748.getClass(), "focusable", false);
        setIntField(term56748, term56748.getClass(), "isFocusTraversableOverridden", 0);
        setField(term56748, term56748.getClass(), "focusTraversalKeys", null);
        setBooleanField(term56748, term56748.getClass(), "focusTraversalKeysEnabled", false);
        setField(term56748, term56748.getClass(), "acc", null);
        setField(term56748, term56748.getClass(), "minSize", null);
        setBooleanField(term56748, term56748.getClass(), "minSizeSet", false);
        setField(term56748, term56748.getClass(), "prefSize", null);
        setBooleanField(term56748, term56748.getClass(), "prefSizeSet", false);
        setField(term56748, term56748.getClass(), "maxSize", null);
        setBooleanField(term56748, term56748.getClass(), "maxSizeSet", false);
        setField(term56748, term56748.getClass(), "componentOrientation", null);
        setBooleanField(term56748, term56748.getClass(), "newEventsOnly", false);
        setField(term56748, term56748.getClass(), "componentListener", null);
        setField(term56748, term56748.getClass(), "focusListener", null);
        setField(term56748, term56748.getClass(), "hierarchyListener", null);
        setField(term56748, term56748.getClass(), "hierarchyBoundsListener", null);
        setField(term56748, term56748.getClass(), "keyListener", null);
        setField(term56748, term56748.getClass(), "mouseListener", null);
        setField(term56748, term56748.getClass(), "mouseMotionListener", null);
        setField(term56748, term56748.getClass(), "mouseWheelListener", null);
        setField(term56748, term56748.getClass(), "inputMethodListener", null);
        setLongField(term56748, term56748.getClass(), "eventMask", 0L);
        setField(term56748, term56748.getClass(), "changeSupport", null);
        setField(term56748, term56748.getClass(), "objectLock", null);
        setBooleanField(term56748, term56748.getClass(), "isPacked", false);
        setIntField(term56748, term56748.getClass(), "boundsOp", 0);
        setField(term56748, term56748.getClass(), "compoundShape", null);
        setField(term56748, term56748.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term56748, term56748.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term56748, term56748.getClass(), "backgroundEraseDisabled", false);
        setField(term56748, term56748.getClass(), "eventCache", null);
        setBooleanField(term56748, term56748.getClass(), "coalescingEnabled", false);
        setBooleanField(term56748, term56748.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term56748, term56748.getClass(), "componentSerializedDataVersion", 0);
        setField(term56748, term56748.getClass(), "accessibleContext", null);
        term56797 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term56797;
        callMethod(klass, "getPredefinedLabel", argTypes, term56748, args);
    }

};


