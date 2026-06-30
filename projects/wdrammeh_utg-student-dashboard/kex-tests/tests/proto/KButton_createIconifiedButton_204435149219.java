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

public class KButton_createIconifiedButton_204435149219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26947;
     Object term27007;
     Object term27009;

    public KButton_createIconifiedButton_204435149219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26947 = newInstance(Class.forName("proto.KButton"));
        setField(term26947, term26947.getClass(), "initialTip", null);
        setField(term26947, term26947.getClass(), "model", null);
        setField(term26947, term26947.getClass(), "text", null);
        setField(term26947, term26947.getClass(), "margin", null);
        setField(term26947, term26947.getClass(), "defaultMargin", null);
        setField(term26947, term26947.getClass(), "defaultIcon", null);
        setField(term26947, term26947.getClass(), "pressedIcon", null);
        setField(term26947, term26947.getClass(), "disabledIcon", null);
        setField(term26947, term26947.getClass(), "selectedIcon", null);
        setField(term26947, term26947.getClass(), "disabledSelectedIcon", null);
        setField(term26947, term26947.getClass(), "rolloverIcon", null);
        setField(term26947, term26947.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term26947, term26947.getClass(), "paintBorder", false);
        setBooleanField(term26947, term26947.getClass(), "paintFocus", false);
        setBooleanField(term26947, term26947.getClass(), "rolloverEnabled", false);
        setBooleanField(term26947, term26947.getClass(), "contentAreaFilled", false);
        setIntField(term26947, term26947.getClass(), "verticalAlignment", 0);
        setIntField(term26947, term26947.getClass(), "horizontalAlignment", 0);
        setIntField(term26947, term26947.getClass(), "verticalTextPosition", 0);
        setIntField(term26947, term26947.getClass(), "horizontalTextPosition", 0);
        setIntField(term26947, term26947.getClass(), "iconTextGap", 0);
        setIntField(term26947, term26947.getClass(), "mnemonic", 0);
        setIntField(term26947, term26947.getClass(), "mnemonicIndex", 0);
        setLongField(term26947, term26947.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term26947, term26947.getClass(), "borderPaintedSet", false);
        setBooleanField(term26947, term26947.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term26947, term26947.getClass(), "iconTextGapSet", false);
        setBooleanField(term26947, term26947.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term26947, term26947.getClass(), "setLayout", false);
        setBooleanField(term26947, term26947.getClass(), "defaultCapable", false);
        setField(term26947, term26947.getClass(), "handler", null);
        setField(term26947, term26947.getClass(), "changeListener", null);
        setField(term26947, term26947.getClass(), "actionListener", null);
        setField(term26947, term26947.getClass(), "itemListener", null);
        setField(term26947, term26947.getClass(), "changeEvent", null);
        setBooleanField(term26947, term26947.getClass(), "hideActionText", false);
        setField(term26947, term26947.getClass(), "action", null);
        setField(term26947, term26947.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term26947, term26947.getClass(), "isAlignmentXSet", false);
        setFloatField(term26947, term26947.getClass(), "alignmentX", 0.0F);
        setBooleanField(term26947, term26947.getClass(), "isAlignmentYSet", false);
        setFloatField(term26947, term26947.getClass(), "alignmentY", 0.0F);
        setField(term26947, term26947.getClass(), "ui", null);
        setField(term26947, term26947.getClass(), "listenerList", null);
        setField(term26947, term26947.getClass(), "clientProperties", null);
        setField(term26947, term26947.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term26947, term26947.getClass(), "autoscrolls", false);
        setField(term26947, term26947.getClass(), "border", null);
        setIntField(term26947, term26947.getClass(), "flags", 0);
        setField(term26947, term26947.getClass(), "inputVerifier", null);
        setBooleanField(term26947, term26947.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term26947, term26947.getClass(), "paintingChild", null);
        setField(term26947, term26947.getClass(), "popupMenu", null);
        setField(term26947, term26947.getClass(), "revalidateRunnableScheduled", null);
        setField(term26947, term26947.getClass(), "focusInputMap", null);
        setField(term26947, term26947.getClass(), "ancestorInputMap", null);
        setField(term26947, term26947.getClass(), "windowInputMap", null);
        setField(term26947, term26947.getClass(), "actionMap", null);
        setField(term26947, term26947.getClass(), "aaHint", null);
        setField(term26947, term26947.getClass(), "lcdRenderingHint", null);
        setField(term26947, term26947.getClass(), "component", null);
        setField(term26947, term26947.getClass(), "layoutMgr", null);
        setField(term26947, term26947.getClass(), "dispatcher", null);
        setField(term26947, term26947.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term26947, term26947.getClass(), "focusCycleRoot", false);
        setBooleanField(term26947, term26947.getClass(), "focusTraversalPolicyProvider", false);
        setField(term26947, term26947.getClass(), "printingThreads", null);
        setBooleanField(term26947, term26947.getClass(), "printing", false);
        setField(term26947, term26947.getClass(), "containerListener", null);
        setIntField(term26947, term26947.getClass(), "listeningChildren", 0);
        setIntField(term26947, term26947.getClass(), "listeningBoundsChildren", 0);
        setIntField(term26947, term26947.getClass(), "descendantsCount", 0);
        setField(term26947, term26947.getClass(), "preserveBackgroundColor", null);
        setIntField(term26947, term26947.getClass(), "numOfHWComponents", 0);
        setIntField(term26947, term26947.getClass(), "numOfLWComponents", 0);
        setField(term26947, term26947.getClass(), "modalComp", null);
        setField(term26947, term26947.getClass(), "modalAppContext", null);
        setIntField(term26947, term26947.getClass(), "containerSerializedDataVersion", 0);
        setField(term26947, term26947.getClass(), "peer", null);
        setField(term26947, term26947.getClass(), "parent", null);
        setField(term26947, term26947.getClass(), "appContext", null);
        setIntField(term26947, term26947.getClass(), "x", 0);
        setIntField(term26947, term26947.getClass(), "y", 0);
        setIntField(term26947, term26947.getClass(), "width", 0);
        setIntField(term26947, term26947.getClass(), "height", 0);
        setField(term26947, term26947.getClass(), "foreground", null);
        setField(term26947, term26947.getClass(), "background", null);
        setField(term26947, term26947.getClass(), "font", null);
        setField(term26947, term26947.getClass(), "peerFont", null);
        setField(term26947, term26947.getClass(), "cursor", null);
        setField(term26947, term26947.getClass(), "locale", null);
        setField(term26947, term26947.getClass(), "graphicsConfig", null);
        setField(term26947, term26947.getClass(), "bufferStrategy", null);
        setBooleanField(term26947, term26947.getClass(), "ignoreRepaint", false);
        setBooleanField(term26947, term26947.getClass(), "visible", false);
        setBooleanField(term26947, term26947.getClass(), "enabled", false);
        setBooleanField(term26947, term26947.getClass(), "valid", false);
        setField(term26947, term26947.getClass(), "dropTarget", null);
        setField(term26947, term26947.getClass(), "popups", null);
        setField(term26947, term26947.getClass(), "name", null);
        setBooleanField(term26947, term26947.getClass(), "nameExplicitlySet", false);
        setBooleanField(term26947, term26947.getClass(), "focusable", false);
        setIntField(term26947, term26947.getClass(), "isFocusTraversableOverridden", 0);
        setField(term26947, term26947.getClass(), "focusTraversalKeys", null);
        setBooleanField(term26947, term26947.getClass(), "focusTraversalKeysEnabled", false);
        setField(term26947, term26947.getClass(), "acc", null);
        setField(term26947, term26947.getClass(), "minSize", null);
        setBooleanField(term26947, term26947.getClass(), "minSizeSet", false);
        setField(term26947, term26947.getClass(), "prefSize", null);
        setBooleanField(term26947, term26947.getClass(), "prefSizeSet", false);
        setField(term26947, term26947.getClass(), "maxSize", null);
        setBooleanField(term26947, term26947.getClass(), "maxSizeSet", false);
        setField(term26947, term26947.getClass(), "componentOrientation", null);
        setBooleanField(term26947, term26947.getClass(), "newEventsOnly", false);
        setField(term26947, term26947.getClass(), "componentListener", null);
        setField(term26947, term26947.getClass(), "focusListener", null);
        setField(term26947, term26947.getClass(), "hierarchyListener", null);
        setField(term26947, term26947.getClass(), "hierarchyBoundsListener", null);
        setField(term26947, term26947.getClass(), "keyListener", null);
        setField(term26947, term26947.getClass(), "mouseListener", null);
        setField(term26947, term26947.getClass(), "mouseMotionListener", null);
        setField(term26947, term26947.getClass(), "mouseWheelListener", null);
        setField(term26947, term26947.getClass(), "inputMethodListener", null);
        setLongField(term26947, term26947.getClass(), "eventMask", 0L);
        setField(term26947, term26947.getClass(), "changeSupport", null);
        setField(term26947, term26947.getClass(), "objectLock", null);
        setBooleanField(term26947, term26947.getClass(), "isPacked", false);
        setIntField(term26947, term26947.getClass(), "boundsOp", 0);
        setField(term26947, term26947.getClass(), "compoundShape", null);
        setField(term26947, term26947.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term26947, term26947.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term26947, term26947.getClass(), "backgroundEraseDisabled", false);
        setField(term26947, term26947.getClass(), "eventCache", null);
        setBooleanField(term26947, term26947.getClass(), "coalescingEnabled", false);
        setBooleanField(term26947, term26947.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term26947, term26947.getClass(), "componentSerializedDataVersion", 0);
        setField(term26947, term26947.getClass(), "accessibleContext", null);
        term27007 = new Integer(0);
        term27009 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term27007;
        args[2] = term27009;
        callMethod(klass, "createIconifiedButton", argTypes, term26947, args);
    }

};


