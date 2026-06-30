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

public class KLabel_createToolTip_145573400925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56952;

    public KLabel_createToolTip_145573400925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56952 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term56952, term56952.getClass(), "mnemonic", 0);
        setIntField(term56952, term56952.getClass(), "mnemonicIndex", 0);
        setField(term56952, term56952.getClass(), "text", null);
        setField(term56952, term56952.getClass(), "defaultIcon", null);
        setField(term56952, term56952.getClass(), "disabledIcon", null);
        setBooleanField(term56952, term56952.getClass(), "disabledIconSet", false);
        setIntField(term56952, term56952.getClass(), "verticalAlignment", 0);
        setIntField(term56952, term56952.getClass(), "horizontalAlignment", 0);
        setIntField(term56952, term56952.getClass(), "verticalTextPosition", 0);
        setIntField(term56952, term56952.getClass(), "horizontalTextPosition", 0);
        setIntField(term56952, term56952.getClass(), "iconTextGap", 0);
        setField(term56952, term56952.getClass(), "labelFor", null);
        setBooleanField(term56952, term56952.getClass(), "isAlignmentXSet", false);
        setFloatField(term56952, term56952.getClass(), "alignmentX", 0.0F);
        setBooleanField(term56952, term56952.getClass(), "isAlignmentYSet", false);
        setFloatField(term56952, term56952.getClass(), "alignmentY", 0.0F);
        setField(term56952, term56952.getClass(), "ui", null);
        setField(term56952, term56952.getClass(), "listenerList", null);
        setField(term56952, term56952.getClass(), "clientProperties", null);
        setField(term56952, term56952.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term56952, term56952.getClass(), "autoscrolls", false);
        setField(term56952, term56952.getClass(), "border", null);
        setIntField(term56952, term56952.getClass(), "flags", 0);
        setField(term56952, term56952.getClass(), "inputVerifier", null);
        setBooleanField(term56952, term56952.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term56952, term56952.getClass(), "paintingChild", null);
        setField(term56952, term56952.getClass(), "popupMenu", null);
        setField(term56952, term56952.getClass(), "revalidateRunnableScheduled", null);
        setField(term56952, term56952.getClass(), "focusInputMap", null);
        setField(term56952, term56952.getClass(), "ancestorInputMap", null);
        setField(term56952, term56952.getClass(), "windowInputMap", null);
        setField(term56952, term56952.getClass(), "actionMap", null);
        setField(term56952, term56952.getClass(), "aaHint", null);
        setField(term56952, term56952.getClass(), "lcdRenderingHint", null);
        setField(term56952, term56952.getClass(), "component", null);
        setField(term56952, term56952.getClass(), "layoutMgr", null);
        setField(term56952, term56952.getClass(), "dispatcher", null);
        setField(term56952, term56952.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term56952, term56952.getClass(), "focusCycleRoot", false);
        setBooleanField(term56952, term56952.getClass(), "focusTraversalPolicyProvider", false);
        setField(term56952, term56952.getClass(), "printingThreads", null);
        setBooleanField(term56952, term56952.getClass(), "printing", false);
        setField(term56952, term56952.getClass(), "containerListener", null);
        setIntField(term56952, term56952.getClass(), "listeningChildren", 0);
        setIntField(term56952, term56952.getClass(), "listeningBoundsChildren", 0);
        setIntField(term56952, term56952.getClass(), "descendantsCount", 0);
        setField(term56952, term56952.getClass(), "preserveBackgroundColor", null);
        setIntField(term56952, term56952.getClass(), "numOfHWComponents", 0);
        setIntField(term56952, term56952.getClass(), "numOfLWComponents", 0);
        setField(term56952, term56952.getClass(), "modalComp", null);
        setField(term56952, term56952.getClass(), "modalAppContext", null);
        setIntField(term56952, term56952.getClass(), "containerSerializedDataVersion", 0);
        setField(term56952, term56952.getClass(), "peer", null);
        setField(term56952, term56952.getClass(), "parent", null);
        setField(term56952, term56952.getClass(), "appContext", null);
        setIntField(term56952, term56952.getClass(), "x", 0);
        setIntField(term56952, term56952.getClass(), "y", 0);
        setIntField(term56952, term56952.getClass(), "width", 0);
        setIntField(term56952, term56952.getClass(), "height", 0);
        setField(term56952, term56952.getClass(), "foreground", null);
        setField(term56952, term56952.getClass(), "background", null);
        setField(term56952, term56952.getClass(), "font", null);
        setField(term56952, term56952.getClass(), "peerFont", null);
        setField(term56952, term56952.getClass(), "cursor", null);
        setField(term56952, term56952.getClass(), "locale", null);
        setField(term56952, term56952.getClass(), "graphicsConfig", null);
        setField(term56952, term56952.getClass(), "bufferStrategy", null);
        setBooleanField(term56952, term56952.getClass(), "ignoreRepaint", false);
        setBooleanField(term56952, term56952.getClass(), "visible", false);
        setBooleanField(term56952, term56952.getClass(), "enabled", false);
        setBooleanField(term56952, term56952.getClass(), "valid", false);
        setField(term56952, term56952.getClass(), "dropTarget", null);
        setField(term56952, term56952.getClass(), "popups", null);
        setField(term56952, term56952.getClass(), "name", null);
        setBooleanField(term56952, term56952.getClass(), "nameExplicitlySet", false);
        setBooleanField(term56952, term56952.getClass(), "focusable", false);
        setIntField(term56952, term56952.getClass(), "isFocusTraversableOverridden", 0);
        setField(term56952, term56952.getClass(), "focusTraversalKeys", null);
        setBooleanField(term56952, term56952.getClass(), "focusTraversalKeysEnabled", false);
        setField(term56952, term56952.getClass(), "acc", null);
        setField(term56952, term56952.getClass(), "minSize", null);
        setBooleanField(term56952, term56952.getClass(), "minSizeSet", false);
        setField(term56952, term56952.getClass(), "prefSize", null);
        setBooleanField(term56952, term56952.getClass(), "prefSizeSet", false);
        setField(term56952, term56952.getClass(), "maxSize", null);
        setBooleanField(term56952, term56952.getClass(), "maxSizeSet", false);
        setField(term56952, term56952.getClass(), "componentOrientation", null);
        setBooleanField(term56952, term56952.getClass(), "newEventsOnly", false);
        setField(term56952, term56952.getClass(), "componentListener", null);
        setField(term56952, term56952.getClass(), "focusListener", null);
        setField(term56952, term56952.getClass(), "hierarchyListener", null);
        setField(term56952, term56952.getClass(), "hierarchyBoundsListener", null);
        setField(term56952, term56952.getClass(), "keyListener", null);
        setField(term56952, term56952.getClass(), "mouseListener", null);
        setField(term56952, term56952.getClass(), "mouseMotionListener", null);
        setField(term56952, term56952.getClass(), "mouseWheelListener", null);
        setField(term56952, term56952.getClass(), "inputMethodListener", null);
        setLongField(term56952, term56952.getClass(), "eventMask", 0L);
        setField(term56952, term56952.getClass(), "changeSupport", null);
        setField(term56952, term56952.getClass(), "objectLock", null);
        setBooleanField(term56952, term56952.getClass(), "isPacked", false);
        setIntField(term56952, term56952.getClass(), "boundsOp", 0);
        setField(term56952, term56952.getClass(), "compoundShape", null);
        setField(term56952, term56952.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term56952, term56952.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term56952, term56952.getClass(), "backgroundEraseDisabled", false);
        setField(term56952, term56952.getClass(), "eventCache", null);
        setBooleanField(term56952, term56952.getClass(), "coalescingEnabled", false);
        setBooleanField(term56952, term56952.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term56952, term56952.getClass(), "componentSerializedDataVersion", 0);
        setField(term56952, term56952.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term56952, args);
    }

};


