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

public class KLabel_createIcon_138115822319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56646;
     Object term56695;
     Object term56697;

    public KLabel_createIcon_138115822319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56646 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term56646, term56646.getClass(), "mnemonic", 0);
        setIntField(term56646, term56646.getClass(), "mnemonicIndex", 0);
        setField(term56646, term56646.getClass(), "text", null);
        setField(term56646, term56646.getClass(), "defaultIcon", null);
        setField(term56646, term56646.getClass(), "disabledIcon", null);
        setBooleanField(term56646, term56646.getClass(), "disabledIconSet", false);
        setIntField(term56646, term56646.getClass(), "verticalAlignment", 0);
        setIntField(term56646, term56646.getClass(), "horizontalAlignment", 0);
        setIntField(term56646, term56646.getClass(), "verticalTextPosition", 0);
        setIntField(term56646, term56646.getClass(), "horizontalTextPosition", 0);
        setIntField(term56646, term56646.getClass(), "iconTextGap", 0);
        setField(term56646, term56646.getClass(), "labelFor", null);
        setBooleanField(term56646, term56646.getClass(), "isAlignmentXSet", false);
        setFloatField(term56646, term56646.getClass(), "alignmentX", 0.0F);
        setBooleanField(term56646, term56646.getClass(), "isAlignmentYSet", false);
        setFloatField(term56646, term56646.getClass(), "alignmentY", 0.0F);
        setField(term56646, term56646.getClass(), "ui", null);
        setField(term56646, term56646.getClass(), "listenerList", null);
        setField(term56646, term56646.getClass(), "clientProperties", null);
        setField(term56646, term56646.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term56646, term56646.getClass(), "autoscrolls", false);
        setField(term56646, term56646.getClass(), "border", null);
        setIntField(term56646, term56646.getClass(), "flags", 0);
        setField(term56646, term56646.getClass(), "inputVerifier", null);
        setBooleanField(term56646, term56646.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term56646, term56646.getClass(), "paintingChild", null);
        setField(term56646, term56646.getClass(), "popupMenu", null);
        setField(term56646, term56646.getClass(), "revalidateRunnableScheduled", null);
        setField(term56646, term56646.getClass(), "focusInputMap", null);
        setField(term56646, term56646.getClass(), "ancestorInputMap", null);
        setField(term56646, term56646.getClass(), "windowInputMap", null);
        setField(term56646, term56646.getClass(), "actionMap", null);
        setField(term56646, term56646.getClass(), "aaHint", null);
        setField(term56646, term56646.getClass(), "lcdRenderingHint", null);
        setField(term56646, term56646.getClass(), "component", null);
        setField(term56646, term56646.getClass(), "layoutMgr", null);
        setField(term56646, term56646.getClass(), "dispatcher", null);
        setField(term56646, term56646.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term56646, term56646.getClass(), "focusCycleRoot", false);
        setBooleanField(term56646, term56646.getClass(), "focusTraversalPolicyProvider", false);
        setField(term56646, term56646.getClass(), "printingThreads", null);
        setBooleanField(term56646, term56646.getClass(), "printing", false);
        setField(term56646, term56646.getClass(), "containerListener", null);
        setIntField(term56646, term56646.getClass(), "listeningChildren", 0);
        setIntField(term56646, term56646.getClass(), "listeningBoundsChildren", 0);
        setIntField(term56646, term56646.getClass(), "descendantsCount", 0);
        setField(term56646, term56646.getClass(), "preserveBackgroundColor", null);
        setIntField(term56646, term56646.getClass(), "numOfHWComponents", 0);
        setIntField(term56646, term56646.getClass(), "numOfLWComponents", 0);
        setField(term56646, term56646.getClass(), "modalComp", null);
        setField(term56646, term56646.getClass(), "modalAppContext", null);
        setIntField(term56646, term56646.getClass(), "containerSerializedDataVersion", 0);
        setField(term56646, term56646.getClass(), "peer", null);
        setField(term56646, term56646.getClass(), "parent", null);
        setField(term56646, term56646.getClass(), "appContext", null);
        setIntField(term56646, term56646.getClass(), "x", 0);
        setIntField(term56646, term56646.getClass(), "y", 0);
        setIntField(term56646, term56646.getClass(), "width", 0);
        setIntField(term56646, term56646.getClass(), "height", 0);
        setField(term56646, term56646.getClass(), "foreground", null);
        setField(term56646, term56646.getClass(), "background", null);
        setField(term56646, term56646.getClass(), "font", null);
        setField(term56646, term56646.getClass(), "peerFont", null);
        setField(term56646, term56646.getClass(), "cursor", null);
        setField(term56646, term56646.getClass(), "locale", null);
        setField(term56646, term56646.getClass(), "graphicsConfig", null);
        setField(term56646, term56646.getClass(), "bufferStrategy", null);
        setBooleanField(term56646, term56646.getClass(), "ignoreRepaint", false);
        setBooleanField(term56646, term56646.getClass(), "visible", false);
        setBooleanField(term56646, term56646.getClass(), "enabled", false);
        setBooleanField(term56646, term56646.getClass(), "valid", false);
        setField(term56646, term56646.getClass(), "dropTarget", null);
        setField(term56646, term56646.getClass(), "popups", null);
        setField(term56646, term56646.getClass(), "name", null);
        setBooleanField(term56646, term56646.getClass(), "nameExplicitlySet", false);
        setBooleanField(term56646, term56646.getClass(), "focusable", false);
        setIntField(term56646, term56646.getClass(), "isFocusTraversableOverridden", 0);
        setField(term56646, term56646.getClass(), "focusTraversalKeys", null);
        setBooleanField(term56646, term56646.getClass(), "focusTraversalKeysEnabled", false);
        setField(term56646, term56646.getClass(), "acc", null);
        setField(term56646, term56646.getClass(), "minSize", null);
        setBooleanField(term56646, term56646.getClass(), "minSizeSet", false);
        setField(term56646, term56646.getClass(), "prefSize", null);
        setBooleanField(term56646, term56646.getClass(), "prefSizeSet", false);
        setField(term56646, term56646.getClass(), "maxSize", null);
        setBooleanField(term56646, term56646.getClass(), "maxSizeSet", false);
        setField(term56646, term56646.getClass(), "componentOrientation", null);
        setBooleanField(term56646, term56646.getClass(), "newEventsOnly", false);
        setField(term56646, term56646.getClass(), "componentListener", null);
        setField(term56646, term56646.getClass(), "focusListener", null);
        setField(term56646, term56646.getClass(), "hierarchyListener", null);
        setField(term56646, term56646.getClass(), "hierarchyBoundsListener", null);
        setField(term56646, term56646.getClass(), "keyListener", null);
        setField(term56646, term56646.getClass(), "mouseListener", null);
        setField(term56646, term56646.getClass(), "mouseMotionListener", null);
        setField(term56646, term56646.getClass(), "mouseWheelListener", null);
        setField(term56646, term56646.getClass(), "inputMethodListener", null);
        setLongField(term56646, term56646.getClass(), "eventMask", 0L);
        setField(term56646, term56646.getClass(), "changeSupport", null);
        setField(term56646, term56646.getClass(), "objectLock", null);
        setBooleanField(term56646, term56646.getClass(), "isPacked", false);
        setIntField(term56646, term56646.getClass(), "boundsOp", 0);
        setField(term56646, term56646.getClass(), "compoundShape", null);
        setField(term56646, term56646.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term56646, term56646.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term56646, term56646.getClass(), "backgroundEraseDisabled", false);
        setField(term56646, term56646.getClass(), "eventCache", null);
        setBooleanField(term56646, term56646.getClass(), "coalescingEnabled", false);
        setBooleanField(term56646, term56646.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term56646, term56646.getClass(), "componentSerializedDataVersion", 0);
        setField(term56646, term56646.getClass(), "accessibleContext", null);
        term56695 = new Integer(0);
        term56697 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term56695;
        args[2] = term56697;
        callMethod(klass, "createIcon", argTypes, term56646, args);
    }

};


