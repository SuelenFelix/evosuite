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
     Object term56695;
     Object term56744;
     Object term56746;

    public KLabel_createIcon_138115822319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56695 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term56695, term56695.getClass(), "mnemonic", 0);
        setIntField(term56695, term56695.getClass(), "mnemonicIndex", 0);
        setField(term56695, term56695.getClass(), "text", null);
        setField(term56695, term56695.getClass(), "defaultIcon", null);
        setField(term56695, term56695.getClass(), "disabledIcon", null);
        setBooleanField(term56695, term56695.getClass(), "disabledIconSet", false);
        setIntField(term56695, term56695.getClass(), "verticalAlignment", 0);
        setIntField(term56695, term56695.getClass(), "horizontalAlignment", 0);
        setIntField(term56695, term56695.getClass(), "verticalTextPosition", 0);
        setIntField(term56695, term56695.getClass(), "horizontalTextPosition", 0);
        setIntField(term56695, term56695.getClass(), "iconTextGap", 0);
        setField(term56695, term56695.getClass(), "labelFor", null);
        setBooleanField(term56695, term56695.getClass(), "isAlignmentXSet", false);
        setFloatField(term56695, term56695.getClass(), "alignmentX", 0.0F);
        setBooleanField(term56695, term56695.getClass(), "isAlignmentYSet", false);
        setFloatField(term56695, term56695.getClass(), "alignmentY", 0.0F);
        setField(term56695, term56695.getClass(), "ui", null);
        setField(term56695, term56695.getClass(), "listenerList", null);
        setField(term56695, term56695.getClass(), "clientProperties", null);
        setField(term56695, term56695.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term56695, term56695.getClass(), "autoscrolls", false);
        setField(term56695, term56695.getClass(), "border", null);
        setIntField(term56695, term56695.getClass(), "flags", 0);
        setField(term56695, term56695.getClass(), "inputVerifier", null);
        setBooleanField(term56695, term56695.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term56695, term56695.getClass(), "paintingChild", null);
        setField(term56695, term56695.getClass(), "popupMenu", null);
        setField(term56695, term56695.getClass(), "revalidateRunnableScheduled", null);
        setField(term56695, term56695.getClass(), "focusInputMap", null);
        setField(term56695, term56695.getClass(), "ancestorInputMap", null);
        setField(term56695, term56695.getClass(), "windowInputMap", null);
        setField(term56695, term56695.getClass(), "actionMap", null);
        setField(term56695, term56695.getClass(), "aaHint", null);
        setField(term56695, term56695.getClass(), "lcdRenderingHint", null);
        setField(term56695, term56695.getClass(), "component", null);
        setField(term56695, term56695.getClass(), "layoutMgr", null);
        setField(term56695, term56695.getClass(), "dispatcher", null);
        setField(term56695, term56695.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term56695, term56695.getClass(), "focusCycleRoot", false);
        setBooleanField(term56695, term56695.getClass(), "focusTraversalPolicyProvider", false);
        setField(term56695, term56695.getClass(), "printingThreads", null);
        setBooleanField(term56695, term56695.getClass(), "printing", false);
        setField(term56695, term56695.getClass(), "containerListener", null);
        setIntField(term56695, term56695.getClass(), "listeningChildren", 0);
        setIntField(term56695, term56695.getClass(), "listeningBoundsChildren", 0);
        setIntField(term56695, term56695.getClass(), "descendantsCount", 0);
        setField(term56695, term56695.getClass(), "preserveBackgroundColor", null);
        setIntField(term56695, term56695.getClass(), "numOfHWComponents", 0);
        setIntField(term56695, term56695.getClass(), "numOfLWComponents", 0);
        setField(term56695, term56695.getClass(), "modalComp", null);
        setField(term56695, term56695.getClass(), "modalAppContext", null);
        setIntField(term56695, term56695.getClass(), "containerSerializedDataVersion", 0);
        setField(term56695, term56695.getClass(), "peer", null);
        setField(term56695, term56695.getClass(), "parent", null);
        setField(term56695, term56695.getClass(), "appContext", null);
        setIntField(term56695, term56695.getClass(), "x", 0);
        setIntField(term56695, term56695.getClass(), "y", 0);
        setIntField(term56695, term56695.getClass(), "width", 0);
        setIntField(term56695, term56695.getClass(), "height", 0);
        setField(term56695, term56695.getClass(), "foreground", null);
        setField(term56695, term56695.getClass(), "background", null);
        setField(term56695, term56695.getClass(), "font", null);
        setField(term56695, term56695.getClass(), "peerFont", null);
        setField(term56695, term56695.getClass(), "cursor", null);
        setField(term56695, term56695.getClass(), "locale", null);
        setField(term56695, term56695.getClass(), "graphicsConfig", null);
        setField(term56695, term56695.getClass(), "bufferStrategy", null);
        setBooleanField(term56695, term56695.getClass(), "ignoreRepaint", false);
        setBooleanField(term56695, term56695.getClass(), "visible", false);
        setBooleanField(term56695, term56695.getClass(), "enabled", false);
        setBooleanField(term56695, term56695.getClass(), "valid", false);
        setField(term56695, term56695.getClass(), "dropTarget", null);
        setField(term56695, term56695.getClass(), "popups", null);
        setField(term56695, term56695.getClass(), "name", null);
        setBooleanField(term56695, term56695.getClass(), "nameExplicitlySet", false);
        setBooleanField(term56695, term56695.getClass(), "focusable", false);
        setIntField(term56695, term56695.getClass(), "isFocusTraversableOverridden", 0);
        setField(term56695, term56695.getClass(), "focusTraversalKeys", null);
        setBooleanField(term56695, term56695.getClass(), "focusTraversalKeysEnabled", false);
        setField(term56695, term56695.getClass(), "acc", null);
        setField(term56695, term56695.getClass(), "minSize", null);
        setBooleanField(term56695, term56695.getClass(), "minSizeSet", false);
        setField(term56695, term56695.getClass(), "prefSize", null);
        setBooleanField(term56695, term56695.getClass(), "prefSizeSet", false);
        setField(term56695, term56695.getClass(), "maxSize", null);
        setBooleanField(term56695, term56695.getClass(), "maxSizeSet", false);
        setField(term56695, term56695.getClass(), "componentOrientation", null);
        setBooleanField(term56695, term56695.getClass(), "newEventsOnly", false);
        setField(term56695, term56695.getClass(), "componentListener", null);
        setField(term56695, term56695.getClass(), "focusListener", null);
        setField(term56695, term56695.getClass(), "hierarchyListener", null);
        setField(term56695, term56695.getClass(), "hierarchyBoundsListener", null);
        setField(term56695, term56695.getClass(), "keyListener", null);
        setField(term56695, term56695.getClass(), "mouseListener", null);
        setField(term56695, term56695.getClass(), "mouseMotionListener", null);
        setField(term56695, term56695.getClass(), "mouseWheelListener", null);
        setField(term56695, term56695.getClass(), "inputMethodListener", null);
        setLongField(term56695, term56695.getClass(), "eventMask", 0L);
        setField(term56695, term56695.getClass(), "changeSupport", null);
        setField(term56695, term56695.getClass(), "objectLock", null);
        setBooleanField(term56695, term56695.getClass(), "isPacked", false);
        setIntField(term56695, term56695.getClass(), "boundsOp", 0);
        setField(term56695, term56695.getClass(), "compoundShape", null);
        setField(term56695, term56695.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term56695, term56695.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term56695, term56695.getClass(), "backgroundEraseDisabled", false);
        setField(term56695, term56695.getClass(), "eventCache", null);
        setBooleanField(term56695, term56695.getClass(), "coalescingEnabled", false);
        setBooleanField(term56695, term56695.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term56695, term56695.getClass(), "componentSerializedDataVersion", 0);
        setField(term56695, term56695.getClass(), "accessibleContext", null);
        term56744 = new Integer(0);
        term56746 = new Integer(0);
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
        args[1] = term56744;
        args[2] = term56746;
        callMethod(klass, "createIcon", argTypes, term56695, args);
    }

};


