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

public class KLabel_setText_191623047624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56950;
     Object term56999;

    public KLabel_setText_191623047624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56950 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term56950, term56950.getClass(), "mnemonic", 0);
        setIntField(term56950, term56950.getClass(), "mnemonicIndex", 0);
        setField(term56950, term56950.getClass(), "text", null);
        setField(term56950, term56950.getClass(), "defaultIcon", null);
        setField(term56950, term56950.getClass(), "disabledIcon", null);
        setBooleanField(term56950, term56950.getClass(), "disabledIconSet", false);
        setIntField(term56950, term56950.getClass(), "verticalAlignment", 0);
        setIntField(term56950, term56950.getClass(), "horizontalAlignment", 0);
        setIntField(term56950, term56950.getClass(), "verticalTextPosition", 0);
        setIntField(term56950, term56950.getClass(), "horizontalTextPosition", 0);
        setIntField(term56950, term56950.getClass(), "iconTextGap", 0);
        setField(term56950, term56950.getClass(), "labelFor", null);
        setBooleanField(term56950, term56950.getClass(), "isAlignmentXSet", false);
        setFloatField(term56950, term56950.getClass(), "alignmentX", 0.0F);
        setBooleanField(term56950, term56950.getClass(), "isAlignmentYSet", false);
        setFloatField(term56950, term56950.getClass(), "alignmentY", 0.0F);
        setField(term56950, term56950.getClass(), "ui", null);
        setField(term56950, term56950.getClass(), "listenerList", null);
        setField(term56950, term56950.getClass(), "clientProperties", null);
        setField(term56950, term56950.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term56950, term56950.getClass(), "autoscrolls", false);
        setField(term56950, term56950.getClass(), "border", null);
        setIntField(term56950, term56950.getClass(), "flags", 0);
        setField(term56950, term56950.getClass(), "inputVerifier", null);
        setBooleanField(term56950, term56950.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term56950, term56950.getClass(), "paintingChild", null);
        setField(term56950, term56950.getClass(), "popupMenu", null);
        setField(term56950, term56950.getClass(), "revalidateRunnableScheduled", null);
        setField(term56950, term56950.getClass(), "focusInputMap", null);
        setField(term56950, term56950.getClass(), "ancestorInputMap", null);
        setField(term56950, term56950.getClass(), "windowInputMap", null);
        setField(term56950, term56950.getClass(), "actionMap", null);
        setField(term56950, term56950.getClass(), "aaHint", null);
        setField(term56950, term56950.getClass(), "lcdRenderingHint", null);
        setField(term56950, term56950.getClass(), "component", null);
        setField(term56950, term56950.getClass(), "layoutMgr", null);
        setField(term56950, term56950.getClass(), "dispatcher", null);
        setField(term56950, term56950.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term56950, term56950.getClass(), "focusCycleRoot", false);
        setBooleanField(term56950, term56950.getClass(), "focusTraversalPolicyProvider", false);
        setField(term56950, term56950.getClass(), "printingThreads", null);
        setBooleanField(term56950, term56950.getClass(), "printing", false);
        setField(term56950, term56950.getClass(), "containerListener", null);
        setIntField(term56950, term56950.getClass(), "listeningChildren", 0);
        setIntField(term56950, term56950.getClass(), "listeningBoundsChildren", 0);
        setIntField(term56950, term56950.getClass(), "descendantsCount", 0);
        setField(term56950, term56950.getClass(), "preserveBackgroundColor", null);
        setIntField(term56950, term56950.getClass(), "numOfHWComponents", 0);
        setIntField(term56950, term56950.getClass(), "numOfLWComponents", 0);
        setField(term56950, term56950.getClass(), "modalComp", null);
        setField(term56950, term56950.getClass(), "modalAppContext", null);
        setIntField(term56950, term56950.getClass(), "containerSerializedDataVersion", 0);
        setField(term56950, term56950.getClass(), "peer", null);
        setField(term56950, term56950.getClass(), "parent", null);
        setField(term56950, term56950.getClass(), "appContext", null);
        setIntField(term56950, term56950.getClass(), "x", 0);
        setIntField(term56950, term56950.getClass(), "y", 0);
        setIntField(term56950, term56950.getClass(), "width", 0);
        setIntField(term56950, term56950.getClass(), "height", 0);
        setField(term56950, term56950.getClass(), "foreground", null);
        setField(term56950, term56950.getClass(), "background", null);
        setField(term56950, term56950.getClass(), "font", null);
        setField(term56950, term56950.getClass(), "peerFont", null);
        setField(term56950, term56950.getClass(), "cursor", null);
        setField(term56950, term56950.getClass(), "locale", null);
        setField(term56950, term56950.getClass(), "graphicsConfig", null);
        setField(term56950, term56950.getClass(), "bufferStrategy", null);
        setBooleanField(term56950, term56950.getClass(), "ignoreRepaint", false);
        setBooleanField(term56950, term56950.getClass(), "visible", false);
        setBooleanField(term56950, term56950.getClass(), "enabled", false);
        setBooleanField(term56950, term56950.getClass(), "valid", false);
        setField(term56950, term56950.getClass(), "dropTarget", null);
        setField(term56950, term56950.getClass(), "popups", null);
        setField(term56950, term56950.getClass(), "name", null);
        setBooleanField(term56950, term56950.getClass(), "nameExplicitlySet", false);
        setBooleanField(term56950, term56950.getClass(), "focusable", false);
        setIntField(term56950, term56950.getClass(), "isFocusTraversableOverridden", 0);
        setField(term56950, term56950.getClass(), "focusTraversalKeys", null);
        setBooleanField(term56950, term56950.getClass(), "focusTraversalKeysEnabled", false);
        setField(term56950, term56950.getClass(), "acc", null);
        setField(term56950, term56950.getClass(), "minSize", null);
        setBooleanField(term56950, term56950.getClass(), "minSizeSet", false);
        setField(term56950, term56950.getClass(), "prefSize", null);
        setBooleanField(term56950, term56950.getClass(), "prefSizeSet", false);
        setField(term56950, term56950.getClass(), "maxSize", null);
        setBooleanField(term56950, term56950.getClass(), "maxSizeSet", false);
        setField(term56950, term56950.getClass(), "componentOrientation", null);
        setBooleanField(term56950, term56950.getClass(), "newEventsOnly", false);
        setField(term56950, term56950.getClass(), "componentListener", null);
        setField(term56950, term56950.getClass(), "focusListener", null);
        setField(term56950, term56950.getClass(), "hierarchyListener", null);
        setField(term56950, term56950.getClass(), "hierarchyBoundsListener", null);
        setField(term56950, term56950.getClass(), "keyListener", null);
        setField(term56950, term56950.getClass(), "mouseListener", null);
        setField(term56950, term56950.getClass(), "mouseMotionListener", null);
        setField(term56950, term56950.getClass(), "mouseWheelListener", null);
        setField(term56950, term56950.getClass(), "inputMethodListener", null);
        setLongField(term56950, term56950.getClass(), "eventMask", 0L);
        setField(term56950, term56950.getClass(), "changeSupport", null);
        setField(term56950, term56950.getClass(), "objectLock", null);
        setBooleanField(term56950, term56950.getClass(), "isPacked", false);
        setIntField(term56950, term56950.getClass(), "boundsOp", 0);
        setField(term56950, term56950.getClass(), "compoundShape", null);
        setField(term56950, term56950.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term56950, term56950.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term56950, term56950.getClass(), "backgroundEraseDisabled", false);
        setField(term56950, term56950.getClass(), "eventCache", null);
        setBooleanField(term56950, term56950.getClass(), "coalescingEnabled", false);
        setBooleanField(term56950, term56950.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term56950, term56950.getClass(), "componentSerializedDataVersion", 0);
        setField(term56950, term56950.getClass(), "accessibleContext", null);
        term56999 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56999;
        callMethod(klass, "setText", argTypes, term56950, args);
    }

};


