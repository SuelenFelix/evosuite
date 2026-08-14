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
import java.lang.Boolean;

public class KLabel_underline_159030484723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56899;
     Object term56948;

    public KLabel_underline_159030484723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56899 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term56899, term56899.getClass(), "mnemonic", 0);
        setIntField(term56899, term56899.getClass(), "mnemonicIndex", 0);
        setField(term56899, term56899.getClass(), "text", null);
        setField(term56899, term56899.getClass(), "defaultIcon", null);
        setField(term56899, term56899.getClass(), "disabledIcon", null);
        setBooleanField(term56899, term56899.getClass(), "disabledIconSet", false);
        setIntField(term56899, term56899.getClass(), "verticalAlignment", 0);
        setIntField(term56899, term56899.getClass(), "horizontalAlignment", 0);
        setIntField(term56899, term56899.getClass(), "verticalTextPosition", 0);
        setIntField(term56899, term56899.getClass(), "horizontalTextPosition", 0);
        setIntField(term56899, term56899.getClass(), "iconTextGap", 0);
        setField(term56899, term56899.getClass(), "labelFor", null);
        setBooleanField(term56899, term56899.getClass(), "isAlignmentXSet", false);
        setFloatField(term56899, term56899.getClass(), "alignmentX", 0.0F);
        setBooleanField(term56899, term56899.getClass(), "isAlignmentYSet", false);
        setFloatField(term56899, term56899.getClass(), "alignmentY", 0.0F);
        setField(term56899, term56899.getClass(), "ui", null);
        setField(term56899, term56899.getClass(), "listenerList", null);
        setField(term56899, term56899.getClass(), "clientProperties", null);
        setField(term56899, term56899.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term56899, term56899.getClass(), "autoscrolls", false);
        setField(term56899, term56899.getClass(), "border", null);
        setIntField(term56899, term56899.getClass(), "flags", 0);
        setField(term56899, term56899.getClass(), "inputVerifier", null);
        setBooleanField(term56899, term56899.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term56899, term56899.getClass(), "paintingChild", null);
        setField(term56899, term56899.getClass(), "popupMenu", null);
        setField(term56899, term56899.getClass(), "revalidateRunnableScheduled", null);
        setField(term56899, term56899.getClass(), "focusInputMap", null);
        setField(term56899, term56899.getClass(), "ancestorInputMap", null);
        setField(term56899, term56899.getClass(), "windowInputMap", null);
        setField(term56899, term56899.getClass(), "actionMap", null);
        setField(term56899, term56899.getClass(), "aaHint", null);
        setField(term56899, term56899.getClass(), "lcdRenderingHint", null);
        setField(term56899, term56899.getClass(), "component", null);
        setField(term56899, term56899.getClass(), "layoutMgr", null);
        setField(term56899, term56899.getClass(), "dispatcher", null);
        setField(term56899, term56899.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term56899, term56899.getClass(), "focusCycleRoot", false);
        setBooleanField(term56899, term56899.getClass(), "focusTraversalPolicyProvider", false);
        setField(term56899, term56899.getClass(), "printingThreads", null);
        setBooleanField(term56899, term56899.getClass(), "printing", false);
        setField(term56899, term56899.getClass(), "containerListener", null);
        setIntField(term56899, term56899.getClass(), "listeningChildren", 0);
        setIntField(term56899, term56899.getClass(), "listeningBoundsChildren", 0);
        setIntField(term56899, term56899.getClass(), "descendantsCount", 0);
        setField(term56899, term56899.getClass(), "preserveBackgroundColor", null);
        setIntField(term56899, term56899.getClass(), "numOfHWComponents", 0);
        setIntField(term56899, term56899.getClass(), "numOfLWComponents", 0);
        setField(term56899, term56899.getClass(), "modalComp", null);
        setField(term56899, term56899.getClass(), "modalAppContext", null);
        setIntField(term56899, term56899.getClass(), "containerSerializedDataVersion", 0);
        setField(term56899, term56899.getClass(), "peer", null);
        setField(term56899, term56899.getClass(), "parent", null);
        setField(term56899, term56899.getClass(), "appContext", null);
        setIntField(term56899, term56899.getClass(), "x", 0);
        setIntField(term56899, term56899.getClass(), "y", 0);
        setIntField(term56899, term56899.getClass(), "width", 0);
        setIntField(term56899, term56899.getClass(), "height", 0);
        setField(term56899, term56899.getClass(), "foreground", null);
        setField(term56899, term56899.getClass(), "background", null);
        setField(term56899, term56899.getClass(), "font", null);
        setField(term56899, term56899.getClass(), "peerFont", null);
        setField(term56899, term56899.getClass(), "cursor", null);
        setField(term56899, term56899.getClass(), "locale", null);
        setField(term56899, term56899.getClass(), "graphicsConfig", null);
        setField(term56899, term56899.getClass(), "bufferStrategy", null);
        setBooleanField(term56899, term56899.getClass(), "ignoreRepaint", false);
        setBooleanField(term56899, term56899.getClass(), "visible", false);
        setBooleanField(term56899, term56899.getClass(), "enabled", false);
        setBooleanField(term56899, term56899.getClass(), "valid", false);
        setField(term56899, term56899.getClass(), "dropTarget", null);
        setField(term56899, term56899.getClass(), "popups", null);
        setField(term56899, term56899.getClass(), "name", null);
        setBooleanField(term56899, term56899.getClass(), "nameExplicitlySet", false);
        setBooleanField(term56899, term56899.getClass(), "focusable", false);
        setIntField(term56899, term56899.getClass(), "isFocusTraversableOverridden", 0);
        setField(term56899, term56899.getClass(), "focusTraversalKeys", null);
        setBooleanField(term56899, term56899.getClass(), "focusTraversalKeysEnabled", false);
        setField(term56899, term56899.getClass(), "acc", null);
        setField(term56899, term56899.getClass(), "minSize", null);
        setBooleanField(term56899, term56899.getClass(), "minSizeSet", false);
        setField(term56899, term56899.getClass(), "prefSize", null);
        setBooleanField(term56899, term56899.getClass(), "prefSizeSet", false);
        setField(term56899, term56899.getClass(), "maxSize", null);
        setBooleanField(term56899, term56899.getClass(), "maxSizeSet", false);
        setField(term56899, term56899.getClass(), "componentOrientation", null);
        setBooleanField(term56899, term56899.getClass(), "newEventsOnly", false);
        setField(term56899, term56899.getClass(), "componentListener", null);
        setField(term56899, term56899.getClass(), "focusListener", null);
        setField(term56899, term56899.getClass(), "hierarchyListener", null);
        setField(term56899, term56899.getClass(), "hierarchyBoundsListener", null);
        setField(term56899, term56899.getClass(), "keyListener", null);
        setField(term56899, term56899.getClass(), "mouseListener", null);
        setField(term56899, term56899.getClass(), "mouseMotionListener", null);
        setField(term56899, term56899.getClass(), "mouseWheelListener", null);
        setField(term56899, term56899.getClass(), "inputMethodListener", null);
        setLongField(term56899, term56899.getClass(), "eventMask", 0L);
        setField(term56899, term56899.getClass(), "changeSupport", null);
        setField(term56899, term56899.getClass(), "objectLock", null);
        setBooleanField(term56899, term56899.getClass(), "isPacked", false);
        setIntField(term56899, term56899.getClass(), "boundsOp", 0);
        setField(term56899, term56899.getClass(), "compoundShape", null);
        setField(term56899, term56899.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term56899, term56899.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term56899, term56899.getClass(), "backgroundEraseDisabled", false);
        setField(term56899, term56899.getClass(), "eventCache", null);
        setBooleanField(term56899, term56899.getClass(), "coalescingEnabled", false);
        setBooleanField(term56899, term56899.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term56899, term56899.getClass(), "componentSerializedDataVersion", 0);
        setField(term56899, term56899.getClass(), "accessibleContext", null);
        term56948 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term56948;
        callMethod(klass, "underline", argTypes, term56899, args);
    }

};


