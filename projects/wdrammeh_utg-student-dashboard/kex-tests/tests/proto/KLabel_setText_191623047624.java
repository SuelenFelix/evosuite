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
     Object term56901;
     Object term56950;

    public KLabel_setText_191623047624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56901 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term56901, term56901.getClass(), "mnemonic", 0);
        setIntField(term56901, term56901.getClass(), "mnemonicIndex", 0);
        setField(term56901, term56901.getClass(), "text", null);
        setField(term56901, term56901.getClass(), "defaultIcon", null);
        setField(term56901, term56901.getClass(), "disabledIcon", null);
        setBooleanField(term56901, term56901.getClass(), "disabledIconSet", false);
        setIntField(term56901, term56901.getClass(), "verticalAlignment", 0);
        setIntField(term56901, term56901.getClass(), "horizontalAlignment", 0);
        setIntField(term56901, term56901.getClass(), "verticalTextPosition", 0);
        setIntField(term56901, term56901.getClass(), "horizontalTextPosition", 0);
        setIntField(term56901, term56901.getClass(), "iconTextGap", 0);
        setField(term56901, term56901.getClass(), "labelFor", null);
        setBooleanField(term56901, term56901.getClass(), "isAlignmentXSet", false);
        setFloatField(term56901, term56901.getClass(), "alignmentX", 0.0F);
        setBooleanField(term56901, term56901.getClass(), "isAlignmentYSet", false);
        setFloatField(term56901, term56901.getClass(), "alignmentY", 0.0F);
        setField(term56901, term56901.getClass(), "ui", null);
        setField(term56901, term56901.getClass(), "listenerList", null);
        setField(term56901, term56901.getClass(), "clientProperties", null);
        setField(term56901, term56901.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term56901, term56901.getClass(), "autoscrolls", false);
        setField(term56901, term56901.getClass(), "border", null);
        setIntField(term56901, term56901.getClass(), "flags", 0);
        setField(term56901, term56901.getClass(), "inputVerifier", null);
        setBooleanField(term56901, term56901.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term56901, term56901.getClass(), "paintingChild", null);
        setField(term56901, term56901.getClass(), "popupMenu", null);
        setField(term56901, term56901.getClass(), "revalidateRunnableScheduled", null);
        setField(term56901, term56901.getClass(), "focusInputMap", null);
        setField(term56901, term56901.getClass(), "ancestorInputMap", null);
        setField(term56901, term56901.getClass(), "windowInputMap", null);
        setField(term56901, term56901.getClass(), "actionMap", null);
        setField(term56901, term56901.getClass(), "aaHint", null);
        setField(term56901, term56901.getClass(), "lcdRenderingHint", null);
        setField(term56901, term56901.getClass(), "component", null);
        setField(term56901, term56901.getClass(), "layoutMgr", null);
        setField(term56901, term56901.getClass(), "dispatcher", null);
        setField(term56901, term56901.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term56901, term56901.getClass(), "focusCycleRoot", false);
        setBooleanField(term56901, term56901.getClass(), "focusTraversalPolicyProvider", false);
        setField(term56901, term56901.getClass(), "printingThreads", null);
        setBooleanField(term56901, term56901.getClass(), "printing", false);
        setField(term56901, term56901.getClass(), "containerListener", null);
        setIntField(term56901, term56901.getClass(), "listeningChildren", 0);
        setIntField(term56901, term56901.getClass(), "listeningBoundsChildren", 0);
        setIntField(term56901, term56901.getClass(), "descendantsCount", 0);
        setField(term56901, term56901.getClass(), "preserveBackgroundColor", null);
        setIntField(term56901, term56901.getClass(), "numOfHWComponents", 0);
        setIntField(term56901, term56901.getClass(), "numOfLWComponents", 0);
        setField(term56901, term56901.getClass(), "modalComp", null);
        setField(term56901, term56901.getClass(), "modalAppContext", null);
        setIntField(term56901, term56901.getClass(), "containerSerializedDataVersion", 0);
        setField(term56901, term56901.getClass(), "peer", null);
        setField(term56901, term56901.getClass(), "parent", null);
        setField(term56901, term56901.getClass(), "appContext", null);
        setIntField(term56901, term56901.getClass(), "x", 0);
        setIntField(term56901, term56901.getClass(), "y", 0);
        setIntField(term56901, term56901.getClass(), "width", 0);
        setIntField(term56901, term56901.getClass(), "height", 0);
        setField(term56901, term56901.getClass(), "foreground", null);
        setField(term56901, term56901.getClass(), "background", null);
        setField(term56901, term56901.getClass(), "font", null);
        setField(term56901, term56901.getClass(), "peerFont", null);
        setField(term56901, term56901.getClass(), "cursor", null);
        setField(term56901, term56901.getClass(), "locale", null);
        setField(term56901, term56901.getClass(), "graphicsConfig", null);
        setField(term56901, term56901.getClass(), "bufferStrategy", null);
        setBooleanField(term56901, term56901.getClass(), "ignoreRepaint", false);
        setBooleanField(term56901, term56901.getClass(), "visible", false);
        setBooleanField(term56901, term56901.getClass(), "enabled", false);
        setBooleanField(term56901, term56901.getClass(), "valid", false);
        setField(term56901, term56901.getClass(), "dropTarget", null);
        setField(term56901, term56901.getClass(), "popups", null);
        setField(term56901, term56901.getClass(), "name", null);
        setBooleanField(term56901, term56901.getClass(), "nameExplicitlySet", false);
        setBooleanField(term56901, term56901.getClass(), "focusable", false);
        setIntField(term56901, term56901.getClass(), "isFocusTraversableOverridden", 0);
        setField(term56901, term56901.getClass(), "focusTraversalKeys", null);
        setBooleanField(term56901, term56901.getClass(), "focusTraversalKeysEnabled", false);
        setField(term56901, term56901.getClass(), "acc", null);
        setField(term56901, term56901.getClass(), "minSize", null);
        setBooleanField(term56901, term56901.getClass(), "minSizeSet", false);
        setField(term56901, term56901.getClass(), "prefSize", null);
        setBooleanField(term56901, term56901.getClass(), "prefSizeSet", false);
        setField(term56901, term56901.getClass(), "maxSize", null);
        setBooleanField(term56901, term56901.getClass(), "maxSizeSet", false);
        setField(term56901, term56901.getClass(), "componentOrientation", null);
        setBooleanField(term56901, term56901.getClass(), "newEventsOnly", false);
        setField(term56901, term56901.getClass(), "componentListener", null);
        setField(term56901, term56901.getClass(), "focusListener", null);
        setField(term56901, term56901.getClass(), "hierarchyListener", null);
        setField(term56901, term56901.getClass(), "hierarchyBoundsListener", null);
        setField(term56901, term56901.getClass(), "keyListener", null);
        setField(term56901, term56901.getClass(), "mouseListener", null);
        setField(term56901, term56901.getClass(), "mouseMotionListener", null);
        setField(term56901, term56901.getClass(), "mouseWheelListener", null);
        setField(term56901, term56901.getClass(), "inputMethodListener", null);
        setLongField(term56901, term56901.getClass(), "eventMask", 0L);
        setField(term56901, term56901.getClass(), "changeSupport", null);
        setField(term56901, term56901.getClass(), "objectLock", null);
        setBooleanField(term56901, term56901.getClass(), "isPacked", false);
        setIntField(term56901, term56901.getClass(), "boundsOp", 0);
        setField(term56901, term56901.getClass(), "compoundShape", null);
        setField(term56901, term56901.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term56901, term56901.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term56901, term56901.getClass(), "backgroundEraseDisabled", false);
        setField(term56901, term56901.getClass(), "eventCache", null);
        setBooleanField(term56901, term56901.getClass(), "coalescingEnabled", false);
        setBooleanField(term56901, term56901.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term56901, term56901.getClass(), "componentSerializedDataVersion", 0);
        setField(term56901, term56901.getClass(), "accessibleContext", null);
        term56950 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56950;
        callMethod(klass, "setText", argTypes, term56901, args);
    }

};


