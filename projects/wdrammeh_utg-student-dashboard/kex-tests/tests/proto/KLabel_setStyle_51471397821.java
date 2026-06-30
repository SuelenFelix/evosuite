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
     Object term56750;

    public KLabel_setStyle_51471397821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56750 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term56750, term56750.getClass(), "mnemonic", 0);
        setIntField(term56750, term56750.getClass(), "mnemonicIndex", 0);
        setField(term56750, term56750.getClass(), "text", null);
        setField(term56750, term56750.getClass(), "defaultIcon", null);
        setField(term56750, term56750.getClass(), "disabledIcon", null);
        setBooleanField(term56750, term56750.getClass(), "disabledIconSet", false);
        setIntField(term56750, term56750.getClass(), "verticalAlignment", 0);
        setIntField(term56750, term56750.getClass(), "horizontalAlignment", 0);
        setIntField(term56750, term56750.getClass(), "verticalTextPosition", 0);
        setIntField(term56750, term56750.getClass(), "horizontalTextPosition", 0);
        setIntField(term56750, term56750.getClass(), "iconTextGap", 0);
        setField(term56750, term56750.getClass(), "labelFor", null);
        setBooleanField(term56750, term56750.getClass(), "isAlignmentXSet", false);
        setFloatField(term56750, term56750.getClass(), "alignmentX", 0.0F);
        setBooleanField(term56750, term56750.getClass(), "isAlignmentYSet", false);
        setFloatField(term56750, term56750.getClass(), "alignmentY", 0.0F);
        setField(term56750, term56750.getClass(), "ui", null);
        setField(term56750, term56750.getClass(), "listenerList", null);
        setField(term56750, term56750.getClass(), "clientProperties", null);
        setField(term56750, term56750.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term56750, term56750.getClass(), "autoscrolls", false);
        setField(term56750, term56750.getClass(), "border", null);
        setIntField(term56750, term56750.getClass(), "flags", 0);
        setField(term56750, term56750.getClass(), "inputVerifier", null);
        setBooleanField(term56750, term56750.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term56750, term56750.getClass(), "paintingChild", null);
        setField(term56750, term56750.getClass(), "popupMenu", null);
        setField(term56750, term56750.getClass(), "revalidateRunnableScheduled", null);
        setField(term56750, term56750.getClass(), "focusInputMap", null);
        setField(term56750, term56750.getClass(), "ancestorInputMap", null);
        setField(term56750, term56750.getClass(), "windowInputMap", null);
        setField(term56750, term56750.getClass(), "actionMap", null);
        setField(term56750, term56750.getClass(), "aaHint", null);
        setField(term56750, term56750.getClass(), "lcdRenderingHint", null);
        setField(term56750, term56750.getClass(), "component", null);
        setField(term56750, term56750.getClass(), "layoutMgr", null);
        setField(term56750, term56750.getClass(), "dispatcher", null);
        setField(term56750, term56750.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term56750, term56750.getClass(), "focusCycleRoot", false);
        setBooleanField(term56750, term56750.getClass(), "focusTraversalPolicyProvider", false);
        setField(term56750, term56750.getClass(), "printingThreads", null);
        setBooleanField(term56750, term56750.getClass(), "printing", false);
        setField(term56750, term56750.getClass(), "containerListener", null);
        setIntField(term56750, term56750.getClass(), "listeningChildren", 0);
        setIntField(term56750, term56750.getClass(), "listeningBoundsChildren", 0);
        setIntField(term56750, term56750.getClass(), "descendantsCount", 0);
        setField(term56750, term56750.getClass(), "preserveBackgroundColor", null);
        setIntField(term56750, term56750.getClass(), "numOfHWComponents", 0);
        setIntField(term56750, term56750.getClass(), "numOfLWComponents", 0);
        setField(term56750, term56750.getClass(), "modalComp", null);
        setField(term56750, term56750.getClass(), "modalAppContext", null);
        setIntField(term56750, term56750.getClass(), "containerSerializedDataVersion", 0);
        setField(term56750, term56750.getClass(), "peer", null);
        setField(term56750, term56750.getClass(), "parent", null);
        setField(term56750, term56750.getClass(), "appContext", null);
        setIntField(term56750, term56750.getClass(), "x", 0);
        setIntField(term56750, term56750.getClass(), "y", 0);
        setIntField(term56750, term56750.getClass(), "width", 0);
        setIntField(term56750, term56750.getClass(), "height", 0);
        setField(term56750, term56750.getClass(), "foreground", null);
        setField(term56750, term56750.getClass(), "background", null);
        setField(term56750, term56750.getClass(), "font", null);
        setField(term56750, term56750.getClass(), "peerFont", null);
        setField(term56750, term56750.getClass(), "cursor", null);
        setField(term56750, term56750.getClass(), "locale", null);
        setField(term56750, term56750.getClass(), "graphicsConfig", null);
        setField(term56750, term56750.getClass(), "bufferStrategy", null);
        setBooleanField(term56750, term56750.getClass(), "ignoreRepaint", false);
        setBooleanField(term56750, term56750.getClass(), "visible", false);
        setBooleanField(term56750, term56750.getClass(), "enabled", false);
        setBooleanField(term56750, term56750.getClass(), "valid", false);
        setField(term56750, term56750.getClass(), "dropTarget", null);
        setField(term56750, term56750.getClass(), "popups", null);
        setField(term56750, term56750.getClass(), "name", null);
        setBooleanField(term56750, term56750.getClass(), "nameExplicitlySet", false);
        setBooleanField(term56750, term56750.getClass(), "focusable", false);
        setIntField(term56750, term56750.getClass(), "isFocusTraversableOverridden", 0);
        setField(term56750, term56750.getClass(), "focusTraversalKeys", null);
        setBooleanField(term56750, term56750.getClass(), "focusTraversalKeysEnabled", false);
        setField(term56750, term56750.getClass(), "acc", null);
        setField(term56750, term56750.getClass(), "minSize", null);
        setBooleanField(term56750, term56750.getClass(), "minSizeSet", false);
        setField(term56750, term56750.getClass(), "prefSize", null);
        setBooleanField(term56750, term56750.getClass(), "prefSizeSet", false);
        setField(term56750, term56750.getClass(), "maxSize", null);
        setBooleanField(term56750, term56750.getClass(), "maxSizeSet", false);
        setField(term56750, term56750.getClass(), "componentOrientation", null);
        setBooleanField(term56750, term56750.getClass(), "newEventsOnly", false);
        setField(term56750, term56750.getClass(), "componentListener", null);
        setField(term56750, term56750.getClass(), "focusListener", null);
        setField(term56750, term56750.getClass(), "hierarchyListener", null);
        setField(term56750, term56750.getClass(), "hierarchyBoundsListener", null);
        setField(term56750, term56750.getClass(), "keyListener", null);
        setField(term56750, term56750.getClass(), "mouseListener", null);
        setField(term56750, term56750.getClass(), "mouseMotionListener", null);
        setField(term56750, term56750.getClass(), "mouseWheelListener", null);
        setField(term56750, term56750.getClass(), "inputMethodListener", null);
        setLongField(term56750, term56750.getClass(), "eventMask", 0L);
        setField(term56750, term56750.getClass(), "changeSupport", null);
        setField(term56750, term56750.getClass(), "objectLock", null);
        setBooleanField(term56750, term56750.getClass(), "isPacked", false);
        setIntField(term56750, term56750.getClass(), "boundsOp", 0);
        setField(term56750, term56750.getClass(), "compoundShape", null);
        setField(term56750, term56750.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term56750, term56750.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term56750, term56750.getClass(), "backgroundEraseDisabled", false);
        setField(term56750, term56750.getClass(), "eventCache", null);
        setBooleanField(term56750, term56750.getClass(), "coalescingEnabled", false);
        setBooleanField(term56750, term56750.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term56750, term56750.getClass(), "componentSerializedDataVersion", 0);
        setField(term56750, term56750.getClass(), "accessibleContext", null);
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
        callMethod(klass, "setStyle", argTypes, term56750, args);
    }

};


