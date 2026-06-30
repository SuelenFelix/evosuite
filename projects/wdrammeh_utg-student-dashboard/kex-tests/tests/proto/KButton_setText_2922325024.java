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

public class KButton_setText_2922325024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27253;
     Object term27313;

    public KButton_setText_2922325024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27253 = newInstance(Class.forName("proto.KButton"));
        setField(term27253, term27253.getClass(), "initialTip", null);
        setField(term27253, term27253.getClass(), "model", null);
        setField(term27253, term27253.getClass(), "text", null);
        setField(term27253, term27253.getClass(), "margin", null);
        setField(term27253, term27253.getClass(), "defaultMargin", null);
        setField(term27253, term27253.getClass(), "defaultIcon", null);
        setField(term27253, term27253.getClass(), "pressedIcon", null);
        setField(term27253, term27253.getClass(), "disabledIcon", null);
        setField(term27253, term27253.getClass(), "selectedIcon", null);
        setField(term27253, term27253.getClass(), "disabledSelectedIcon", null);
        setField(term27253, term27253.getClass(), "rolloverIcon", null);
        setField(term27253, term27253.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27253, term27253.getClass(), "paintBorder", false);
        setBooleanField(term27253, term27253.getClass(), "paintFocus", false);
        setBooleanField(term27253, term27253.getClass(), "rolloverEnabled", false);
        setBooleanField(term27253, term27253.getClass(), "contentAreaFilled", false);
        setIntField(term27253, term27253.getClass(), "verticalAlignment", 0);
        setIntField(term27253, term27253.getClass(), "horizontalAlignment", 0);
        setIntField(term27253, term27253.getClass(), "verticalTextPosition", 0);
        setIntField(term27253, term27253.getClass(), "horizontalTextPosition", 0);
        setIntField(term27253, term27253.getClass(), "iconTextGap", 0);
        setIntField(term27253, term27253.getClass(), "mnemonic", 0);
        setIntField(term27253, term27253.getClass(), "mnemonicIndex", 0);
        setLongField(term27253, term27253.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27253, term27253.getClass(), "borderPaintedSet", false);
        setBooleanField(term27253, term27253.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27253, term27253.getClass(), "iconTextGapSet", false);
        setBooleanField(term27253, term27253.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27253, term27253.getClass(), "setLayout", false);
        setBooleanField(term27253, term27253.getClass(), "defaultCapable", false);
        setField(term27253, term27253.getClass(), "handler", null);
        setField(term27253, term27253.getClass(), "changeListener", null);
        setField(term27253, term27253.getClass(), "actionListener", null);
        setField(term27253, term27253.getClass(), "itemListener", null);
        setField(term27253, term27253.getClass(), "changeEvent", null);
        setBooleanField(term27253, term27253.getClass(), "hideActionText", false);
        setField(term27253, term27253.getClass(), "action", null);
        setField(term27253, term27253.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27253, term27253.getClass(), "isAlignmentXSet", false);
        setFloatField(term27253, term27253.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27253, term27253.getClass(), "isAlignmentYSet", false);
        setFloatField(term27253, term27253.getClass(), "alignmentY", 0.0F);
        setField(term27253, term27253.getClass(), "ui", null);
        setField(term27253, term27253.getClass(), "listenerList", null);
        setField(term27253, term27253.getClass(), "clientProperties", null);
        setField(term27253, term27253.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27253, term27253.getClass(), "autoscrolls", false);
        setField(term27253, term27253.getClass(), "border", null);
        setIntField(term27253, term27253.getClass(), "flags", 0);
        setField(term27253, term27253.getClass(), "inputVerifier", null);
        setBooleanField(term27253, term27253.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27253, term27253.getClass(), "paintingChild", null);
        setField(term27253, term27253.getClass(), "popupMenu", null);
        setField(term27253, term27253.getClass(), "revalidateRunnableScheduled", null);
        setField(term27253, term27253.getClass(), "focusInputMap", null);
        setField(term27253, term27253.getClass(), "ancestorInputMap", null);
        setField(term27253, term27253.getClass(), "windowInputMap", null);
        setField(term27253, term27253.getClass(), "actionMap", null);
        setField(term27253, term27253.getClass(), "aaHint", null);
        setField(term27253, term27253.getClass(), "lcdRenderingHint", null);
        setField(term27253, term27253.getClass(), "component", null);
        setField(term27253, term27253.getClass(), "layoutMgr", null);
        setField(term27253, term27253.getClass(), "dispatcher", null);
        setField(term27253, term27253.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27253, term27253.getClass(), "focusCycleRoot", false);
        setBooleanField(term27253, term27253.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27253, term27253.getClass(), "printingThreads", null);
        setBooleanField(term27253, term27253.getClass(), "printing", false);
        setField(term27253, term27253.getClass(), "containerListener", null);
        setIntField(term27253, term27253.getClass(), "listeningChildren", 0);
        setIntField(term27253, term27253.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27253, term27253.getClass(), "descendantsCount", 0);
        setField(term27253, term27253.getClass(), "preserveBackgroundColor", null);
        setIntField(term27253, term27253.getClass(), "numOfHWComponents", 0);
        setIntField(term27253, term27253.getClass(), "numOfLWComponents", 0);
        setField(term27253, term27253.getClass(), "modalComp", null);
        setField(term27253, term27253.getClass(), "modalAppContext", null);
        setIntField(term27253, term27253.getClass(), "containerSerializedDataVersion", 0);
        setField(term27253, term27253.getClass(), "peer", null);
        setField(term27253, term27253.getClass(), "parent", null);
        setField(term27253, term27253.getClass(), "appContext", null);
        setIntField(term27253, term27253.getClass(), "x", 0);
        setIntField(term27253, term27253.getClass(), "y", 0);
        setIntField(term27253, term27253.getClass(), "width", 0);
        setIntField(term27253, term27253.getClass(), "height", 0);
        setField(term27253, term27253.getClass(), "foreground", null);
        setField(term27253, term27253.getClass(), "background", null);
        setField(term27253, term27253.getClass(), "font", null);
        setField(term27253, term27253.getClass(), "peerFont", null);
        setField(term27253, term27253.getClass(), "cursor", null);
        setField(term27253, term27253.getClass(), "locale", null);
        setField(term27253, term27253.getClass(), "graphicsConfig", null);
        setField(term27253, term27253.getClass(), "bufferStrategy", null);
        setBooleanField(term27253, term27253.getClass(), "ignoreRepaint", false);
        setBooleanField(term27253, term27253.getClass(), "visible", false);
        setBooleanField(term27253, term27253.getClass(), "enabled", false);
        setBooleanField(term27253, term27253.getClass(), "valid", false);
        setField(term27253, term27253.getClass(), "dropTarget", null);
        setField(term27253, term27253.getClass(), "popups", null);
        setField(term27253, term27253.getClass(), "name", null);
        setBooleanField(term27253, term27253.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27253, term27253.getClass(), "focusable", false);
        setIntField(term27253, term27253.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27253, term27253.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27253, term27253.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27253, term27253.getClass(), "acc", null);
        setField(term27253, term27253.getClass(), "minSize", null);
        setBooleanField(term27253, term27253.getClass(), "minSizeSet", false);
        setField(term27253, term27253.getClass(), "prefSize", null);
        setBooleanField(term27253, term27253.getClass(), "prefSizeSet", false);
        setField(term27253, term27253.getClass(), "maxSize", null);
        setBooleanField(term27253, term27253.getClass(), "maxSizeSet", false);
        setField(term27253, term27253.getClass(), "componentOrientation", null);
        setBooleanField(term27253, term27253.getClass(), "newEventsOnly", false);
        setField(term27253, term27253.getClass(), "componentListener", null);
        setField(term27253, term27253.getClass(), "focusListener", null);
        setField(term27253, term27253.getClass(), "hierarchyListener", null);
        setField(term27253, term27253.getClass(), "hierarchyBoundsListener", null);
        setField(term27253, term27253.getClass(), "keyListener", null);
        setField(term27253, term27253.getClass(), "mouseListener", null);
        setField(term27253, term27253.getClass(), "mouseMotionListener", null);
        setField(term27253, term27253.getClass(), "mouseWheelListener", null);
        setField(term27253, term27253.getClass(), "inputMethodListener", null);
        setLongField(term27253, term27253.getClass(), "eventMask", 0L);
        setField(term27253, term27253.getClass(), "changeSupport", null);
        setField(term27253, term27253.getClass(), "objectLock", null);
        setBooleanField(term27253, term27253.getClass(), "isPacked", false);
        setIntField(term27253, term27253.getClass(), "boundsOp", 0);
        setField(term27253, term27253.getClass(), "compoundShape", null);
        setField(term27253, term27253.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27253, term27253.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27253, term27253.getClass(), "backgroundEraseDisabled", false);
        setField(term27253, term27253.getClass(), "eventCache", null);
        setBooleanField(term27253, term27253.getClass(), "coalescingEnabled", false);
        setBooleanField(term27253, term27253.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27253, term27253.getClass(), "componentSerializedDataVersion", 0);
        setField(term27253, term27253.getClass(), "accessibleContext", null);
        term27313 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27313;
        callMethod(klass, "setText", argTypes, term27253, args);
    }

};


