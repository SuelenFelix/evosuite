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
     Object term26980;
     Object term27040;
     Object term27042;

    public KButton_createIconifiedButton_204435149219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26980 = newInstance(Class.forName("proto.KButton"));
        setField(term26980, term26980.getClass(), "initialTip", null);
        setField(term26980, term26980.getClass(), "model", null);
        setField(term26980, term26980.getClass(), "text", null);
        setField(term26980, term26980.getClass(), "margin", null);
        setField(term26980, term26980.getClass(), "defaultMargin", null);
        setField(term26980, term26980.getClass(), "defaultIcon", null);
        setField(term26980, term26980.getClass(), "pressedIcon", null);
        setField(term26980, term26980.getClass(), "disabledIcon", null);
        setField(term26980, term26980.getClass(), "selectedIcon", null);
        setField(term26980, term26980.getClass(), "disabledSelectedIcon", null);
        setField(term26980, term26980.getClass(), "rolloverIcon", null);
        setField(term26980, term26980.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term26980, term26980.getClass(), "paintBorder", false);
        setBooleanField(term26980, term26980.getClass(), "paintFocus", false);
        setBooleanField(term26980, term26980.getClass(), "rolloverEnabled", false);
        setBooleanField(term26980, term26980.getClass(), "contentAreaFilled", false);
        setIntField(term26980, term26980.getClass(), "verticalAlignment", 0);
        setIntField(term26980, term26980.getClass(), "horizontalAlignment", 0);
        setIntField(term26980, term26980.getClass(), "verticalTextPosition", 0);
        setIntField(term26980, term26980.getClass(), "horizontalTextPosition", 0);
        setIntField(term26980, term26980.getClass(), "iconTextGap", 0);
        setIntField(term26980, term26980.getClass(), "mnemonic", 0);
        setIntField(term26980, term26980.getClass(), "mnemonicIndex", 0);
        setLongField(term26980, term26980.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term26980, term26980.getClass(), "borderPaintedSet", false);
        setBooleanField(term26980, term26980.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term26980, term26980.getClass(), "iconTextGapSet", false);
        setBooleanField(term26980, term26980.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term26980, term26980.getClass(), "setLayout", false);
        setBooleanField(term26980, term26980.getClass(), "defaultCapable", false);
        setField(term26980, term26980.getClass(), "handler", null);
        setField(term26980, term26980.getClass(), "changeListener", null);
        setField(term26980, term26980.getClass(), "actionListener", null);
        setField(term26980, term26980.getClass(), "itemListener", null);
        setField(term26980, term26980.getClass(), "changeEvent", null);
        setBooleanField(term26980, term26980.getClass(), "hideActionText", false);
        setField(term26980, term26980.getClass(), "action", null);
        setField(term26980, term26980.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term26980, term26980.getClass(), "isAlignmentXSet", false);
        setFloatField(term26980, term26980.getClass(), "alignmentX", 0.0F);
        setBooleanField(term26980, term26980.getClass(), "isAlignmentYSet", false);
        setFloatField(term26980, term26980.getClass(), "alignmentY", 0.0F);
        setField(term26980, term26980.getClass(), "ui", null);
        setField(term26980, term26980.getClass(), "listenerList", null);
        setField(term26980, term26980.getClass(), "clientProperties", null);
        setField(term26980, term26980.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term26980, term26980.getClass(), "autoscrolls", false);
        setField(term26980, term26980.getClass(), "border", null);
        setIntField(term26980, term26980.getClass(), "flags", 0);
        setField(term26980, term26980.getClass(), "inputVerifier", null);
        setBooleanField(term26980, term26980.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term26980, term26980.getClass(), "paintingChild", null);
        setField(term26980, term26980.getClass(), "popupMenu", null);
        setField(term26980, term26980.getClass(), "revalidateRunnableScheduled", null);
        setField(term26980, term26980.getClass(), "focusInputMap", null);
        setField(term26980, term26980.getClass(), "ancestorInputMap", null);
        setField(term26980, term26980.getClass(), "windowInputMap", null);
        setField(term26980, term26980.getClass(), "actionMap", null);
        setField(term26980, term26980.getClass(), "aaHint", null);
        setField(term26980, term26980.getClass(), "lcdRenderingHint", null);
        setField(term26980, term26980.getClass(), "component", null);
        setField(term26980, term26980.getClass(), "layoutMgr", null);
        setField(term26980, term26980.getClass(), "dispatcher", null);
        setField(term26980, term26980.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term26980, term26980.getClass(), "focusCycleRoot", false);
        setBooleanField(term26980, term26980.getClass(), "focusTraversalPolicyProvider", false);
        setField(term26980, term26980.getClass(), "printingThreads", null);
        setBooleanField(term26980, term26980.getClass(), "printing", false);
        setField(term26980, term26980.getClass(), "containerListener", null);
        setIntField(term26980, term26980.getClass(), "listeningChildren", 0);
        setIntField(term26980, term26980.getClass(), "listeningBoundsChildren", 0);
        setIntField(term26980, term26980.getClass(), "descendantsCount", 0);
        setField(term26980, term26980.getClass(), "preserveBackgroundColor", null);
        setIntField(term26980, term26980.getClass(), "numOfHWComponents", 0);
        setIntField(term26980, term26980.getClass(), "numOfLWComponents", 0);
        setField(term26980, term26980.getClass(), "modalComp", null);
        setField(term26980, term26980.getClass(), "modalAppContext", null);
        setIntField(term26980, term26980.getClass(), "containerSerializedDataVersion", 0);
        setField(term26980, term26980.getClass(), "peer", null);
        setField(term26980, term26980.getClass(), "parent", null);
        setField(term26980, term26980.getClass(), "appContext", null);
        setIntField(term26980, term26980.getClass(), "x", 0);
        setIntField(term26980, term26980.getClass(), "y", 0);
        setIntField(term26980, term26980.getClass(), "width", 0);
        setIntField(term26980, term26980.getClass(), "height", 0);
        setField(term26980, term26980.getClass(), "foreground", null);
        setField(term26980, term26980.getClass(), "background", null);
        setField(term26980, term26980.getClass(), "font", null);
        setField(term26980, term26980.getClass(), "peerFont", null);
        setField(term26980, term26980.getClass(), "cursor", null);
        setField(term26980, term26980.getClass(), "locale", null);
        setField(term26980, term26980.getClass(), "graphicsConfig", null);
        setField(term26980, term26980.getClass(), "bufferStrategy", null);
        setBooleanField(term26980, term26980.getClass(), "ignoreRepaint", false);
        setBooleanField(term26980, term26980.getClass(), "visible", false);
        setBooleanField(term26980, term26980.getClass(), "enabled", false);
        setBooleanField(term26980, term26980.getClass(), "valid", false);
        setField(term26980, term26980.getClass(), "dropTarget", null);
        setField(term26980, term26980.getClass(), "popups", null);
        setField(term26980, term26980.getClass(), "name", null);
        setBooleanField(term26980, term26980.getClass(), "nameExplicitlySet", false);
        setBooleanField(term26980, term26980.getClass(), "focusable", false);
        setIntField(term26980, term26980.getClass(), "isFocusTraversableOverridden", 0);
        setField(term26980, term26980.getClass(), "focusTraversalKeys", null);
        setBooleanField(term26980, term26980.getClass(), "focusTraversalKeysEnabled", false);
        setField(term26980, term26980.getClass(), "acc", null);
        setField(term26980, term26980.getClass(), "minSize", null);
        setBooleanField(term26980, term26980.getClass(), "minSizeSet", false);
        setField(term26980, term26980.getClass(), "prefSize", null);
        setBooleanField(term26980, term26980.getClass(), "prefSizeSet", false);
        setField(term26980, term26980.getClass(), "maxSize", null);
        setBooleanField(term26980, term26980.getClass(), "maxSizeSet", false);
        setField(term26980, term26980.getClass(), "componentOrientation", null);
        setBooleanField(term26980, term26980.getClass(), "newEventsOnly", false);
        setField(term26980, term26980.getClass(), "componentListener", null);
        setField(term26980, term26980.getClass(), "focusListener", null);
        setField(term26980, term26980.getClass(), "hierarchyListener", null);
        setField(term26980, term26980.getClass(), "hierarchyBoundsListener", null);
        setField(term26980, term26980.getClass(), "keyListener", null);
        setField(term26980, term26980.getClass(), "mouseListener", null);
        setField(term26980, term26980.getClass(), "mouseMotionListener", null);
        setField(term26980, term26980.getClass(), "mouseWheelListener", null);
        setField(term26980, term26980.getClass(), "inputMethodListener", null);
        setLongField(term26980, term26980.getClass(), "eventMask", 0L);
        setField(term26980, term26980.getClass(), "changeSupport", null);
        setField(term26980, term26980.getClass(), "objectLock", null);
        setBooleanField(term26980, term26980.getClass(), "isPacked", false);
        setIntField(term26980, term26980.getClass(), "boundsOp", 0);
        setField(term26980, term26980.getClass(), "compoundShape", null);
        setField(term26980, term26980.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term26980, term26980.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term26980, term26980.getClass(), "backgroundEraseDisabled", false);
        setField(term26980, term26980.getClass(), "eventCache", null);
        setBooleanField(term26980, term26980.getClass(), "coalescingEnabled", false);
        setBooleanField(term26980, term26980.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term26980, term26980.getClass(), "componentSerializedDataVersion", 0);
        setField(term26980, term26980.getClass(), "accessibleContext", null);
        term27040 = new Integer(0);
        term27042 = new Integer(0);
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
        args[1] = term27040;
        args[2] = term27042;
        callMethod(klass, "createIconifiedButton", argTypes, term26980, args);
    }

};


