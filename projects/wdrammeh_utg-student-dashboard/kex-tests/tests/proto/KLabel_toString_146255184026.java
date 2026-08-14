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

public class KLabel_toString_146255184026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57050;

    public KLabel_toString_146255184026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57050 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term57050, term57050.getClass(), "mnemonic", 0);
        setIntField(term57050, term57050.getClass(), "mnemonicIndex", 0);
        setField(term57050, term57050.getClass(), "text", null);
        setField(term57050, term57050.getClass(), "defaultIcon", null);
        setField(term57050, term57050.getClass(), "disabledIcon", null);
        setBooleanField(term57050, term57050.getClass(), "disabledIconSet", false);
        setIntField(term57050, term57050.getClass(), "verticalAlignment", 0);
        setIntField(term57050, term57050.getClass(), "horizontalAlignment", 0);
        setIntField(term57050, term57050.getClass(), "verticalTextPosition", 0);
        setIntField(term57050, term57050.getClass(), "horizontalTextPosition", 0);
        setIntField(term57050, term57050.getClass(), "iconTextGap", 0);
        setField(term57050, term57050.getClass(), "labelFor", null);
        setBooleanField(term57050, term57050.getClass(), "isAlignmentXSet", false);
        setFloatField(term57050, term57050.getClass(), "alignmentX", 0.0F);
        setBooleanField(term57050, term57050.getClass(), "isAlignmentYSet", false);
        setFloatField(term57050, term57050.getClass(), "alignmentY", 0.0F);
        setField(term57050, term57050.getClass(), "ui", null);
        setField(term57050, term57050.getClass(), "listenerList", null);
        setField(term57050, term57050.getClass(), "clientProperties", null);
        setField(term57050, term57050.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term57050, term57050.getClass(), "autoscrolls", false);
        setField(term57050, term57050.getClass(), "border", null);
        setIntField(term57050, term57050.getClass(), "flags", 0);
        setField(term57050, term57050.getClass(), "inputVerifier", null);
        setBooleanField(term57050, term57050.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term57050, term57050.getClass(), "paintingChild", null);
        setField(term57050, term57050.getClass(), "popupMenu", null);
        setField(term57050, term57050.getClass(), "revalidateRunnableScheduled", null);
        setField(term57050, term57050.getClass(), "focusInputMap", null);
        setField(term57050, term57050.getClass(), "ancestorInputMap", null);
        setField(term57050, term57050.getClass(), "windowInputMap", null);
        setField(term57050, term57050.getClass(), "actionMap", null);
        setField(term57050, term57050.getClass(), "aaHint", null);
        setField(term57050, term57050.getClass(), "lcdRenderingHint", null);
        setField(term57050, term57050.getClass(), "component", null);
        setField(term57050, term57050.getClass(), "layoutMgr", null);
        setField(term57050, term57050.getClass(), "dispatcher", null);
        setField(term57050, term57050.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57050, term57050.getClass(), "focusCycleRoot", false);
        setBooleanField(term57050, term57050.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57050, term57050.getClass(), "printingThreads", null);
        setBooleanField(term57050, term57050.getClass(), "printing", false);
        setField(term57050, term57050.getClass(), "containerListener", null);
        setIntField(term57050, term57050.getClass(), "listeningChildren", 0);
        setIntField(term57050, term57050.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57050, term57050.getClass(), "descendantsCount", 0);
        setField(term57050, term57050.getClass(), "preserveBackgroundColor", null);
        setIntField(term57050, term57050.getClass(), "numOfHWComponents", 0);
        setIntField(term57050, term57050.getClass(), "numOfLWComponents", 0);
        setField(term57050, term57050.getClass(), "modalComp", null);
        setField(term57050, term57050.getClass(), "modalAppContext", null);
        setIntField(term57050, term57050.getClass(), "containerSerializedDataVersion", 0);
        setField(term57050, term57050.getClass(), "peer", null);
        setField(term57050, term57050.getClass(), "parent", null);
        setField(term57050, term57050.getClass(), "appContext", null);
        setIntField(term57050, term57050.getClass(), "x", 0);
        setIntField(term57050, term57050.getClass(), "y", 0);
        setIntField(term57050, term57050.getClass(), "width", 0);
        setIntField(term57050, term57050.getClass(), "height", 0);
        setField(term57050, term57050.getClass(), "foreground", null);
        setField(term57050, term57050.getClass(), "background", null);
        setField(term57050, term57050.getClass(), "font", null);
        setField(term57050, term57050.getClass(), "peerFont", null);
        setField(term57050, term57050.getClass(), "cursor", null);
        setField(term57050, term57050.getClass(), "locale", null);
        setField(term57050, term57050.getClass(), "graphicsConfig", null);
        setField(term57050, term57050.getClass(), "bufferStrategy", null);
        setBooleanField(term57050, term57050.getClass(), "ignoreRepaint", false);
        setBooleanField(term57050, term57050.getClass(), "visible", false);
        setBooleanField(term57050, term57050.getClass(), "enabled", false);
        setBooleanField(term57050, term57050.getClass(), "valid", false);
        setField(term57050, term57050.getClass(), "dropTarget", null);
        setField(term57050, term57050.getClass(), "popups", null);
        setField(term57050, term57050.getClass(), "name", null);
        setBooleanField(term57050, term57050.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57050, term57050.getClass(), "focusable", false);
        setIntField(term57050, term57050.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57050, term57050.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57050, term57050.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57050, term57050.getClass(), "acc", null);
        setField(term57050, term57050.getClass(), "minSize", null);
        setBooleanField(term57050, term57050.getClass(), "minSizeSet", false);
        setField(term57050, term57050.getClass(), "prefSize", null);
        setBooleanField(term57050, term57050.getClass(), "prefSizeSet", false);
        setField(term57050, term57050.getClass(), "maxSize", null);
        setBooleanField(term57050, term57050.getClass(), "maxSizeSet", false);
        setField(term57050, term57050.getClass(), "componentOrientation", null);
        setBooleanField(term57050, term57050.getClass(), "newEventsOnly", false);
        setField(term57050, term57050.getClass(), "componentListener", null);
        setField(term57050, term57050.getClass(), "focusListener", null);
        setField(term57050, term57050.getClass(), "hierarchyListener", null);
        setField(term57050, term57050.getClass(), "hierarchyBoundsListener", null);
        setField(term57050, term57050.getClass(), "keyListener", null);
        setField(term57050, term57050.getClass(), "mouseListener", null);
        setField(term57050, term57050.getClass(), "mouseMotionListener", null);
        setField(term57050, term57050.getClass(), "mouseWheelListener", null);
        setField(term57050, term57050.getClass(), "inputMethodListener", null);
        setLongField(term57050, term57050.getClass(), "eventMask", 0L);
        setField(term57050, term57050.getClass(), "changeSupport", null);
        setField(term57050, term57050.getClass(), "objectLock", null);
        setBooleanField(term57050, term57050.getClass(), "isPacked", false);
        setIntField(term57050, term57050.getClass(), "boundsOp", 0);
        setField(term57050, term57050.getClass(), "compoundShape", null);
        setField(term57050, term57050.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57050, term57050.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57050, term57050.getClass(), "backgroundEraseDisabled", false);
        setField(term57050, term57050.getClass(), "eventCache", null);
        setBooleanField(term57050, term57050.getClass(), "coalescingEnabled", false);
        setBooleanField(term57050, term57050.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57050, term57050.getClass(), "componentSerializedDataVersion", 0);
        setField(term57050, term57050.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term57050, args);
    }

};


