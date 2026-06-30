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
     Object term56850;
     Object term56899;

    public KLabel_underline_159030484723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56850 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term56850, term56850.getClass(), "mnemonic", 0);
        setIntField(term56850, term56850.getClass(), "mnemonicIndex", 0);
        setField(term56850, term56850.getClass(), "text", null);
        setField(term56850, term56850.getClass(), "defaultIcon", null);
        setField(term56850, term56850.getClass(), "disabledIcon", null);
        setBooleanField(term56850, term56850.getClass(), "disabledIconSet", false);
        setIntField(term56850, term56850.getClass(), "verticalAlignment", 0);
        setIntField(term56850, term56850.getClass(), "horizontalAlignment", 0);
        setIntField(term56850, term56850.getClass(), "verticalTextPosition", 0);
        setIntField(term56850, term56850.getClass(), "horizontalTextPosition", 0);
        setIntField(term56850, term56850.getClass(), "iconTextGap", 0);
        setField(term56850, term56850.getClass(), "labelFor", null);
        setBooleanField(term56850, term56850.getClass(), "isAlignmentXSet", false);
        setFloatField(term56850, term56850.getClass(), "alignmentX", 0.0F);
        setBooleanField(term56850, term56850.getClass(), "isAlignmentYSet", false);
        setFloatField(term56850, term56850.getClass(), "alignmentY", 0.0F);
        setField(term56850, term56850.getClass(), "ui", null);
        setField(term56850, term56850.getClass(), "listenerList", null);
        setField(term56850, term56850.getClass(), "clientProperties", null);
        setField(term56850, term56850.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term56850, term56850.getClass(), "autoscrolls", false);
        setField(term56850, term56850.getClass(), "border", null);
        setIntField(term56850, term56850.getClass(), "flags", 0);
        setField(term56850, term56850.getClass(), "inputVerifier", null);
        setBooleanField(term56850, term56850.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term56850, term56850.getClass(), "paintingChild", null);
        setField(term56850, term56850.getClass(), "popupMenu", null);
        setField(term56850, term56850.getClass(), "revalidateRunnableScheduled", null);
        setField(term56850, term56850.getClass(), "focusInputMap", null);
        setField(term56850, term56850.getClass(), "ancestorInputMap", null);
        setField(term56850, term56850.getClass(), "windowInputMap", null);
        setField(term56850, term56850.getClass(), "actionMap", null);
        setField(term56850, term56850.getClass(), "aaHint", null);
        setField(term56850, term56850.getClass(), "lcdRenderingHint", null);
        setField(term56850, term56850.getClass(), "component", null);
        setField(term56850, term56850.getClass(), "layoutMgr", null);
        setField(term56850, term56850.getClass(), "dispatcher", null);
        setField(term56850, term56850.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term56850, term56850.getClass(), "focusCycleRoot", false);
        setBooleanField(term56850, term56850.getClass(), "focusTraversalPolicyProvider", false);
        setField(term56850, term56850.getClass(), "printingThreads", null);
        setBooleanField(term56850, term56850.getClass(), "printing", false);
        setField(term56850, term56850.getClass(), "containerListener", null);
        setIntField(term56850, term56850.getClass(), "listeningChildren", 0);
        setIntField(term56850, term56850.getClass(), "listeningBoundsChildren", 0);
        setIntField(term56850, term56850.getClass(), "descendantsCount", 0);
        setField(term56850, term56850.getClass(), "preserveBackgroundColor", null);
        setIntField(term56850, term56850.getClass(), "numOfHWComponents", 0);
        setIntField(term56850, term56850.getClass(), "numOfLWComponents", 0);
        setField(term56850, term56850.getClass(), "modalComp", null);
        setField(term56850, term56850.getClass(), "modalAppContext", null);
        setIntField(term56850, term56850.getClass(), "containerSerializedDataVersion", 0);
        setField(term56850, term56850.getClass(), "peer", null);
        setField(term56850, term56850.getClass(), "parent", null);
        setField(term56850, term56850.getClass(), "appContext", null);
        setIntField(term56850, term56850.getClass(), "x", 0);
        setIntField(term56850, term56850.getClass(), "y", 0);
        setIntField(term56850, term56850.getClass(), "width", 0);
        setIntField(term56850, term56850.getClass(), "height", 0);
        setField(term56850, term56850.getClass(), "foreground", null);
        setField(term56850, term56850.getClass(), "background", null);
        setField(term56850, term56850.getClass(), "font", null);
        setField(term56850, term56850.getClass(), "peerFont", null);
        setField(term56850, term56850.getClass(), "cursor", null);
        setField(term56850, term56850.getClass(), "locale", null);
        setField(term56850, term56850.getClass(), "graphicsConfig", null);
        setField(term56850, term56850.getClass(), "bufferStrategy", null);
        setBooleanField(term56850, term56850.getClass(), "ignoreRepaint", false);
        setBooleanField(term56850, term56850.getClass(), "visible", false);
        setBooleanField(term56850, term56850.getClass(), "enabled", false);
        setBooleanField(term56850, term56850.getClass(), "valid", false);
        setField(term56850, term56850.getClass(), "dropTarget", null);
        setField(term56850, term56850.getClass(), "popups", null);
        setField(term56850, term56850.getClass(), "name", null);
        setBooleanField(term56850, term56850.getClass(), "nameExplicitlySet", false);
        setBooleanField(term56850, term56850.getClass(), "focusable", false);
        setIntField(term56850, term56850.getClass(), "isFocusTraversableOverridden", 0);
        setField(term56850, term56850.getClass(), "focusTraversalKeys", null);
        setBooleanField(term56850, term56850.getClass(), "focusTraversalKeysEnabled", false);
        setField(term56850, term56850.getClass(), "acc", null);
        setField(term56850, term56850.getClass(), "minSize", null);
        setBooleanField(term56850, term56850.getClass(), "minSizeSet", false);
        setField(term56850, term56850.getClass(), "prefSize", null);
        setBooleanField(term56850, term56850.getClass(), "prefSizeSet", false);
        setField(term56850, term56850.getClass(), "maxSize", null);
        setBooleanField(term56850, term56850.getClass(), "maxSizeSet", false);
        setField(term56850, term56850.getClass(), "componentOrientation", null);
        setBooleanField(term56850, term56850.getClass(), "newEventsOnly", false);
        setField(term56850, term56850.getClass(), "componentListener", null);
        setField(term56850, term56850.getClass(), "focusListener", null);
        setField(term56850, term56850.getClass(), "hierarchyListener", null);
        setField(term56850, term56850.getClass(), "hierarchyBoundsListener", null);
        setField(term56850, term56850.getClass(), "keyListener", null);
        setField(term56850, term56850.getClass(), "mouseListener", null);
        setField(term56850, term56850.getClass(), "mouseMotionListener", null);
        setField(term56850, term56850.getClass(), "mouseWheelListener", null);
        setField(term56850, term56850.getClass(), "inputMethodListener", null);
        setLongField(term56850, term56850.getClass(), "eventMask", 0L);
        setField(term56850, term56850.getClass(), "changeSupport", null);
        setField(term56850, term56850.getClass(), "objectLock", null);
        setBooleanField(term56850, term56850.getClass(), "isPacked", false);
        setIntField(term56850, term56850.getClass(), "boundsOp", 0);
        setField(term56850, term56850.getClass(), "compoundShape", null);
        setField(term56850, term56850.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term56850, term56850.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term56850, term56850.getClass(), "backgroundEraseDisabled", false);
        setField(term56850, term56850.getClass(), "eventCache", null);
        setBooleanField(term56850, term56850.getClass(), "coalescingEnabled", false);
        setBooleanField(term56850, term56850.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term56850, term56850.getClass(), "componentSerializedDataVersion", 0);
        setField(term56850, term56850.getClass(), "accessibleContext", null);
        term56899 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term56899;
        callMethod(klass, "underline", argTypes, term56850, args);
    }

};


