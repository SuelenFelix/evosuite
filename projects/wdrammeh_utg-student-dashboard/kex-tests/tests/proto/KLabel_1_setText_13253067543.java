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

public class KLabel_1_setText_13253067543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28572;

    public KLabel_1_setText_13253067543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28572 = newInstance(Class.forName("proto.KLabel$1"));
        setIntField(term28572, term28572.getClass(), "val$position", 0);
        setField(term28572, term28572.getClass(), "val$permanentText", null);
        setIntField(term28572, term28572.getClass(), "mnemonic", 0);
        setIntField(term28572, term28572.getClass(), "mnemonicIndex", 0);
        setField(term28572, term28572.getClass(), "text", null);
        setField(term28572, term28572.getClass(), "defaultIcon", null);
        setField(term28572, term28572.getClass(), "disabledIcon", null);
        setBooleanField(term28572, term28572.getClass(), "disabledIconSet", false);
        setIntField(term28572, term28572.getClass(), "verticalAlignment", 0);
        setIntField(term28572, term28572.getClass(), "horizontalAlignment", 0);
        setIntField(term28572, term28572.getClass(), "verticalTextPosition", 0);
        setIntField(term28572, term28572.getClass(), "horizontalTextPosition", 0);
        setIntField(term28572, term28572.getClass(), "iconTextGap", 0);
        setField(term28572, term28572.getClass(), "labelFor", null);
        setBooleanField(term28572, term28572.getClass(), "isAlignmentXSet", false);
        setFloatField(term28572, term28572.getClass(), "alignmentX", 0.0F);
        setBooleanField(term28572, term28572.getClass(), "isAlignmentYSet", false);
        setFloatField(term28572, term28572.getClass(), "alignmentY", 0.0F);
        setField(term28572, term28572.getClass(), "ui", null);
        setField(term28572, term28572.getClass(), "listenerList", null);
        setField(term28572, term28572.getClass(), "clientProperties", null);
        setField(term28572, term28572.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term28572, term28572.getClass(), "autoscrolls", false);
        setField(term28572, term28572.getClass(), "border", null);
        setIntField(term28572, term28572.getClass(), "flags", 0);
        setField(term28572, term28572.getClass(), "inputVerifier", null);
        setBooleanField(term28572, term28572.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term28572, term28572.getClass(), "paintingChild", null);
        setField(term28572, term28572.getClass(), "popupMenu", null);
        setField(term28572, term28572.getClass(), "revalidateRunnableScheduled", null);
        setField(term28572, term28572.getClass(), "focusInputMap", null);
        setField(term28572, term28572.getClass(), "ancestorInputMap", null);
        setField(term28572, term28572.getClass(), "windowInputMap", null);
        setField(term28572, term28572.getClass(), "actionMap", null);
        setField(term28572, term28572.getClass(), "aaHint", null);
        setField(term28572, term28572.getClass(), "lcdRenderingHint", null);
        setField(term28572, term28572.getClass(), "component", null);
        setField(term28572, term28572.getClass(), "layoutMgr", null);
        setField(term28572, term28572.getClass(), "dispatcher", null);
        setField(term28572, term28572.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term28572, term28572.getClass(), "focusCycleRoot", false);
        setBooleanField(term28572, term28572.getClass(), "focusTraversalPolicyProvider", false);
        setField(term28572, term28572.getClass(), "printingThreads", null);
        setBooleanField(term28572, term28572.getClass(), "printing", false);
        setField(term28572, term28572.getClass(), "containerListener", null);
        setIntField(term28572, term28572.getClass(), "listeningChildren", 0);
        setIntField(term28572, term28572.getClass(), "listeningBoundsChildren", 0);
        setIntField(term28572, term28572.getClass(), "descendantsCount", 0);
        setField(term28572, term28572.getClass(), "preserveBackgroundColor", null);
        setIntField(term28572, term28572.getClass(), "numOfHWComponents", 0);
        setIntField(term28572, term28572.getClass(), "numOfLWComponents", 0);
        setField(term28572, term28572.getClass(), "modalComp", null);
        setField(term28572, term28572.getClass(), "modalAppContext", null);
        setIntField(term28572, term28572.getClass(), "containerSerializedDataVersion", 0);
        setField(term28572, term28572.getClass(), "peer", null);
        setField(term28572, term28572.getClass(), "parent", null);
        setField(term28572, term28572.getClass(), "appContext", null);
        setIntField(term28572, term28572.getClass(), "x", 0);
        setIntField(term28572, term28572.getClass(), "y", 0);
        setIntField(term28572, term28572.getClass(), "width", 0);
        setIntField(term28572, term28572.getClass(), "height", 0);
        setField(term28572, term28572.getClass(), "foreground", null);
        setField(term28572, term28572.getClass(), "background", null);
        setField(term28572, term28572.getClass(), "font", null);
        setField(term28572, term28572.getClass(), "peerFont", null);
        setField(term28572, term28572.getClass(), "cursor", null);
        setField(term28572, term28572.getClass(), "locale", null);
        setField(term28572, term28572.getClass(), "graphicsConfig", null);
        setField(term28572, term28572.getClass(), "bufferStrategy", null);
        setBooleanField(term28572, term28572.getClass(), "ignoreRepaint", false);
        setBooleanField(term28572, term28572.getClass(), "visible", false);
        setBooleanField(term28572, term28572.getClass(), "enabled", false);
        setBooleanField(term28572, term28572.getClass(), "valid", false);
        setField(term28572, term28572.getClass(), "dropTarget", null);
        setField(term28572, term28572.getClass(), "popups", null);
        setField(term28572, term28572.getClass(), "name", null);
        setBooleanField(term28572, term28572.getClass(), "nameExplicitlySet", false);
        setBooleanField(term28572, term28572.getClass(), "focusable", false);
        setIntField(term28572, term28572.getClass(), "isFocusTraversableOverridden", 0);
        setField(term28572, term28572.getClass(), "focusTraversalKeys", null);
        setBooleanField(term28572, term28572.getClass(), "focusTraversalKeysEnabled", false);
        setField(term28572, term28572.getClass(), "acc", null);
        setField(term28572, term28572.getClass(), "minSize", null);
        setBooleanField(term28572, term28572.getClass(), "minSizeSet", false);
        setField(term28572, term28572.getClass(), "prefSize", null);
        setBooleanField(term28572, term28572.getClass(), "prefSizeSet", false);
        setField(term28572, term28572.getClass(), "maxSize", null);
        setBooleanField(term28572, term28572.getClass(), "maxSizeSet", false);
        setField(term28572, term28572.getClass(), "componentOrientation", null);
        setBooleanField(term28572, term28572.getClass(), "newEventsOnly", false);
        setField(term28572, term28572.getClass(), "componentListener", null);
        setField(term28572, term28572.getClass(), "focusListener", null);
        setField(term28572, term28572.getClass(), "hierarchyListener", null);
        setField(term28572, term28572.getClass(), "hierarchyBoundsListener", null);
        setField(term28572, term28572.getClass(), "keyListener", null);
        setField(term28572, term28572.getClass(), "mouseListener", null);
        setField(term28572, term28572.getClass(), "mouseMotionListener", null);
        setField(term28572, term28572.getClass(), "mouseWheelListener", null);
        setField(term28572, term28572.getClass(), "inputMethodListener", null);
        setLongField(term28572, term28572.getClass(), "eventMask", 0L);
        setField(term28572, term28572.getClass(), "changeSupport", null);
        setField(term28572, term28572.getClass(), "objectLock", null);
        setBooleanField(term28572, term28572.getClass(), "isPacked", false);
        setIntField(term28572, term28572.getClass(), "boundsOp", 0);
        setField(term28572, term28572.getClass(), "compoundShape", null);
        setField(term28572, term28572.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term28572, term28572.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term28572, term28572.getClass(), "backgroundEraseDisabled", false);
        setField(term28572, term28572.getClass(), "eventCache", null);
        setBooleanField(term28572, term28572.getClass(), "coalescingEnabled", false);
        setBooleanField(term28572, term28572.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term28572, term28572.getClass(), "componentSerializedDataVersion", 0);
        setField(term28572, term28572.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term28572, args);
    }

};


