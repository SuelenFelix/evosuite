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

public class KLabel_underline_81870634822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56848;
     Object term56897;

    public KLabel_underline_81870634822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56848 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term56848, term56848.getClass(), "mnemonic", 0);
        setIntField(term56848, term56848.getClass(), "mnemonicIndex", 0);
        setField(term56848, term56848.getClass(), "text", null);
        setField(term56848, term56848.getClass(), "defaultIcon", null);
        setField(term56848, term56848.getClass(), "disabledIcon", null);
        setBooleanField(term56848, term56848.getClass(), "disabledIconSet", false);
        setIntField(term56848, term56848.getClass(), "verticalAlignment", 0);
        setIntField(term56848, term56848.getClass(), "horizontalAlignment", 0);
        setIntField(term56848, term56848.getClass(), "verticalTextPosition", 0);
        setIntField(term56848, term56848.getClass(), "horizontalTextPosition", 0);
        setIntField(term56848, term56848.getClass(), "iconTextGap", 0);
        setField(term56848, term56848.getClass(), "labelFor", null);
        setBooleanField(term56848, term56848.getClass(), "isAlignmentXSet", false);
        setFloatField(term56848, term56848.getClass(), "alignmentX", 0.0F);
        setBooleanField(term56848, term56848.getClass(), "isAlignmentYSet", false);
        setFloatField(term56848, term56848.getClass(), "alignmentY", 0.0F);
        setField(term56848, term56848.getClass(), "ui", null);
        setField(term56848, term56848.getClass(), "listenerList", null);
        setField(term56848, term56848.getClass(), "clientProperties", null);
        setField(term56848, term56848.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term56848, term56848.getClass(), "autoscrolls", false);
        setField(term56848, term56848.getClass(), "border", null);
        setIntField(term56848, term56848.getClass(), "flags", 0);
        setField(term56848, term56848.getClass(), "inputVerifier", null);
        setBooleanField(term56848, term56848.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term56848, term56848.getClass(), "paintingChild", null);
        setField(term56848, term56848.getClass(), "popupMenu", null);
        setField(term56848, term56848.getClass(), "revalidateRunnableScheduled", null);
        setField(term56848, term56848.getClass(), "focusInputMap", null);
        setField(term56848, term56848.getClass(), "ancestorInputMap", null);
        setField(term56848, term56848.getClass(), "windowInputMap", null);
        setField(term56848, term56848.getClass(), "actionMap", null);
        setField(term56848, term56848.getClass(), "aaHint", null);
        setField(term56848, term56848.getClass(), "lcdRenderingHint", null);
        setField(term56848, term56848.getClass(), "component", null);
        setField(term56848, term56848.getClass(), "layoutMgr", null);
        setField(term56848, term56848.getClass(), "dispatcher", null);
        setField(term56848, term56848.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term56848, term56848.getClass(), "focusCycleRoot", false);
        setBooleanField(term56848, term56848.getClass(), "focusTraversalPolicyProvider", false);
        setField(term56848, term56848.getClass(), "printingThreads", null);
        setBooleanField(term56848, term56848.getClass(), "printing", false);
        setField(term56848, term56848.getClass(), "containerListener", null);
        setIntField(term56848, term56848.getClass(), "listeningChildren", 0);
        setIntField(term56848, term56848.getClass(), "listeningBoundsChildren", 0);
        setIntField(term56848, term56848.getClass(), "descendantsCount", 0);
        setField(term56848, term56848.getClass(), "preserveBackgroundColor", null);
        setIntField(term56848, term56848.getClass(), "numOfHWComponents", 0);
        setIntField(term56848, term56848.getClass(), "numOfLWComponents", 0);
        setField(term56848, term56848.getClass(), "modalComp", null);
        setField(term56848, term56848.getClass(), "modalAppContext", null);
        setIntField(term56848, term56848.getClass(), "containerSerializedDataVersion", 0);
        setField(term56848, term56848.getClass(), "peer", null);
        setField(term56848, term56848.getClass(), "parent", null);
        setField(term56848, term56848.getClass(), "appContext", null);
        setIntField(term56848, term56848.getClass(), "x", 0);
        setIntField(term56848, term56848.getClass(), "y", 0);
        setIntField(term56848, term56848.getClass(), "width", 0);
        setIntField(term56848, term56848.getClass(), "height", 0);
        setField(term56848, term56848.getClass(), "foreground", null);
        setField(term56848, term56848.getClass(), "background", null);
        setField(term56848, term56848.getClass(), "font", null);
        setField(term56848, term56848.getClass(), "peerFont", null);
        setField(term56848, term56848.getClass(), "cursor", null);
        setField(term56848, term56848.getClass(), "locale", null);
        setField(term56848, term56848.getClass(), "graphicsConfig", null);
        setField(term56848, term56848.getClass(), "bufferStrategy", null);
        setBooleanField(term56848, term56848.getClass(), "ignoreRepaint", false);
        setBooleanField(term56848, term56848.getClass(), "visible", false);
        setBooleanField(term56848, term56848.getClass(), "enabled", false);
        setBooleanField(term56848, term56848.getClass(), "valid", false);
        setField(term56848, term56848.getClass(), "dropTarget", null);
        setField(term56848, term56848.getClass(), "popups", null);
        setField(term56848, term56848.getClass(), "name", null);
        setBooleanField(term56848, term56848.getClass(), "nameExplicitlySet", false);
        setBooleanField(term56848, term56848.getClass(), "focusable", false);
        setIntField(term56848, term56848.getClass(), "isFocusTraversableOverridden", 0);
        setField(term56848, term56848.getClass(), "focusTraversalKeys", null);
        setBooleanField(term56848, term56848.getClass(), "focusTraversalKeysEnabled", false);
        setField(term56848, term56848.getClass(), "acc", null);
        setField(term56848, term56848.getClass(), "minSize", null);
        setBooleanField(term56848, term56848.getClass(), "minSizeSet", false);
        setField(term56848, term56848.getClass(), "prefSize", null);
        setBooleanField(term56848, term56848.getClass(), "prefSizeSet", false);
        setField(term56848, term56848.getClass(), "maxSize", null);
        setBooleanField(term56848, term56848.getClass(), "maxSizeSet", false);
        setField(term56848, term56848.getClass(), "componentOrientation", null);
        setBooleanField(term56848, term56848.getClass(), "newEventsOnly", false);
        setField(term56848, term56848.getClass(), "componentListener", null);
        setField(term56848, term56848.getClass(), "focusListener", null);
        setField(term56848, term56848.getClass(), "hierarchyListener", null);
        setField(term56848, term56848.getClass(), "hierarchyBoundsListener", null);
        setField(term56848, term56848.getClass(), "keyListener", null);
        setField(term56848, term56848.getClass(), "mouseListener", null);
        setField(term56848, term56848.getClass(), "mouseMotionListener", null);
        setField(term56848, term56848.getClass(), "mouseWheelListener", null);
        setField(term56848, term56848.getClass(), "inputMethodListener", null);
        setLongField(term56848, term56848.getClass(), "eventMask", 0L);
        setField(term56848, term56848.getClass(), "changeSupport", null);
        setField(term56848, term56848.getClass(), "objectLock", null);
        setBooleanField(term56848, term56848.getClass(), "isPacked", false);
        setIntField(term56848, term56848.getClass(), "boundsOp", 0);
        setField(term56848, term56848.getClass(), "compoundShape", null);
        setField(term56848, term56848.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term56848, term56848.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term56848, term56848.getClass(), "backgroundEraseDisabled", false);
        setField(term56848, term56848.getClass(), "eventCache", null);
        setBooleanField(term56848, term56848.getClass(), "coalescingEnabled", false);
        setBooleanField(term56848, term56848.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term56848, term56848.getClass(), "componentSerializedDataVersion", 0);
        setField(term56848, term56848.getClass(), "accessibleContext", null);
        term56897 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Color");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term56897;
        callMethod(klass, "underline", argTypes, term56848, args);
    }

};


