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

public class KLabel_setStyle_51471397821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56799;

    public KLabel_setStyle_51471397821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56799 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term56799, term56799.getClass(), "mnemonic", 0);
        setIntField(term56799, term56799.getClass(), "mnemonicIndex", 0);
        setField(term56799, term56799.getClass(), "text", null);
        setField(term56799, term56799.getClass(), "defaultIcon", null);
        setField(term56799, term56799.getClass(), "disabledIcon", null);
        setBooleanField(term56799, term56799.getClass(), "disabledIconSet", false);
        setIntField(term56799, term56799.getClass(), "verticalAlignment", 0);
        setIntField(term56799, term56799.getClass(), "horizontalAlignment", 0);
        setIntField(term56799, term56799.getClass(), "verticalTextPosition", 0);
        setIntField(term56799, term56799.getClass(), "horizontalTextPosition", 0);
        setIntField(term56799, term56799.getClass(), "iconTextGap", 0);
        setField(term56799, term56799.getClass(), "labelFor", null);
        setBooleanField(term56799, term56799.getClass(), "isAlignmentXSet", false);
        setFloatField(term56799, term56799.getClass(), "alignmentX", 0.0F);
        setBooleanField(term56799, term56799.getClass(), "isAlignmentYSet", false);
        setFloatField(term56799, term56799.getClass(), "alignmentY", 0.0F);
        setField(term56799, term56799.getClass(), "ui", null);
        setField(term56799, term56799.getClass(), "listenerList", null);
        setField(term56799, term56799.getClass(), "clientProperties", null);
        setField(term56799, term56799.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term56799, term56799.getClass(), "autoscrolls", false);
        setField(term56799, term56799.getClass(), "border", null);
        setIntField(term56799, term56799.getClass(), "flags", 0);
        setField(term56799, term56799.getClass(), "inputVerifier", null);
        setBooleanField(term56799, term56799.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term56799, term56799.getClass(), "paintingChild", null);
        setField(term56799, term56799.getClass(), "popupMenu", null);
        setField(term56799, term56799.getClass(), "revalidateRunnableScheduled", null);
        setField(term56799, term56799.getClass(), "focusInputMap", null);
        setField(term56799, term56799.getClass(), "ancestorInputMap", null);
        setField(term56799, term56799.getClass(), "windowInputMap", null);
        setField(term56799, term56799.getClass(), "actionMap", null);
        setField(term56799, term56799.getClass(), "aaHint", null);
        setField(term56799, term56799.getClass(), "lcdRenderingHint", null);
        setField(term56799, term56799.getClass(), "component", null);
        setField(term56799, term56799.getClass(), "layoutMgr", null);
        setField(term56799, term56799.getClass(), "dispatcher", null);
        setField(term56799, term56799.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term56799, term56799.getClass(), "focusCycleRoot", false);
        setBooleanField(term56799, term56799.getClass(), "focusTraversalPolicyProvider", false);
        setField(term56799, term56799.getClass(), "printingThreads", null);
        setBooleanField(term56799, term56799.getClass(), "printing", false);
        setField(term56799, term56799.getClass(), "containerListener", null);
        setIntField(term56799, term56799.getClass(), "listeningChildren", 0);
        setIntField(term56799, term56799.getClass(), "listeningBoundsChildren", 0);
        setIntField(term56799, term56799.getClass(), "descendantsCount", 0);
        setField(term56799, term56799.getClass(), "preserveBackgroundColor", null);
        setIntField(term56799, term56799.getClass(), "numOfHWComponents", 0);
        setIntField(term56799, term56799.getClass(), "numOfLWComponents", 0);
        setField(term56799, term56799.getClass(), "modalComp", null);
        setField(term56799, term56799.getClass(), "modalAppContext", null);
        setIntField(term56799, term56799.getClass(), "containerSerializedDataVersion", 0);
        setField(term56799, term56799.getClass(), "peer", null);
        setField(term56799, term56799.getClass(), "parent", null);
        setField(term56799, term56799.getClass(), "appContext", null);
        setIntField(term56799, term56799.getClass(), "x", 0);
        setIntField(term56799, term56799.getClass(), "y", 0);
        setIntField(term56799, term56799.getClass(), "width", 0);
        setIntField(term56799, term56799.getClass(), "height", 0);
        setField(term56799, term56799.getClass(), "foreground", null);
        setField(term56799, term56799.getClass(), "background", null);
        setField(term56799, term56799.getClass(), "font", null);
        setField(term56799, term56799.getClass(), "peerFont", null);
        setField(term56799, term56799.getClass(), "cursor", null);
        setField(term56799, term56799.getClass(), "locale", null);
        setField(term56799, term56799.getClass(), "graphicsConfig", null);
        setField(term56799, term56799.getClass(), "bufferStrategy", null);
        setBooleanField(term56799, term56799.getClass(), "ignoreRepaint", false);
        setBooleanField(term56799, term56799.getClass(), "visible", false);
        setBooleanField(term56799, term56799.getClass(), "enabled", false);
        setBooleanField(term56799, term56799.getClass(), "valid", false);
        setField(term56799, term56799.getClass(), "dropTarget", null);
        setField(term56799, term56799.getClass(), "popups", null);
        setField(term56799, term56799.getClass(), "name", null);
        setBooleanField(term56799, term56799.getClass(), "nameExplicitlySet", false);
        setBooleanField(term56799, term56799.getClass(), "focusable", false);
        setIntField(term56799, term56799.getClass(), "isFocusTraversableOverridden", 0);
        setField(term56799, term56799.getClass(), "focusTraversalKeys", null);
        setBooleanField(term56799, term56799.getClass(), "focusTraversalKeysEnabled", false);
        setField(term56799, term56799.getClass(), "acc", null);
        setField(term56799, term56799.getClass(), "minSize", null);
        setBooleanField(term56799, term56799.getClass(), "minSizeSet", false);
        setField(term56799, term56799.getClass(), "prefSize", null);
        setBooleanField(term56799, term56799.getClass(), "prefSizeSet", false);
        setField(term56799, term56799.getClass(), "maxSize", null);
        setBooleanField(term56799, term56799.getClass(), "maxSizeSet", false);
        setField(term56799, term56799.getClass(), "componentOrientation", null);
        setBooleanField(term56799, term56799.getClass(), "newEventsOnly", false);
        setField(term56799, term56799.getClass(), "componentListener", null);
        setField(term56799, term56799.getClass(), "focusListener", null);
        setField(term56799, term56799.getClass(), "hierarchyListener", null);
        setField(term56799, term56799.getClass(), "hierarchyBoundsListener", null);
        setField(term56799, term56799.getClass(), "keyListener", null);
        setField(term56799, term56799.getClass(), "mouseListener", null);
        setField(term56799, term56799.getClass(), "mouseMotionListener", null);
        setField(term56799, term56799.getClass(), "mouseWheelListener", null);
        setField(term56799, term56799.getClass(), "inputMethodListener", null);
        setLongField(term56799, term56799.getClass(), "eventMask", 0L);
        setField(term56799, term56799.getClass(), "changeSupport", null);
        setField(term56799, term56799.getClass(), "objectLock", null);
        setBooleanField(term56799, term56799.getClass(), "isPacked", false);
        setIntField(term56799, term56799.getClass(), "boundsOp", 0);
        setField(term56799, term56799.getClass(), "compoundShape", null);
        setField(term56799, term56799.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term56799, term56799.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term56799, term56799.getClass(), "backgroundEraseDisabled", false);
        setField(term56799, term56799.getClass(), "eventCache", null);
        setBooleanField(term56799, term56799.getClass(), "coalescingEnabled", false);
        setBooleanField(term56799, term56799.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term56799, term56799.getClass(), "componentSerializedDataVersion", 0);
        setField(term56799, term56799.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Font");
        argTypes[1] = Class.forName("java.awt.Color");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "setStyle", argTypes, term56799, args);
    }

};


