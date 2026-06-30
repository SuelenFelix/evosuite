package core;

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
import static core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Board_5_setToolTipText_6792895592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350777;

    public Board_5_setToolTipText_6792895592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350777 = newInstance(Class.forName("core.Board$5"));
        Object term350802 = newInstance(Class.forName("java.awt.Insets"));
        Object term350807 = newInstance(Class.forName("java.awt.Insets"));
        Object term350830 = newInstance(Class.forName("javax.swing.AbstractButton$Handler"));
        setField(term350777, term350777.getClass(), "this$0", null);
        setField(term350777, term350777.getClass(), "initialTip", "skwxdosvQV");
        setField(term350777, term350777.getClass(), "model", null);
        setField(term350777, term350777.getClass(), "text", "DBYTggnCkD");
        setIntField(term350802, term350802.getClass(), "top", -2129996761);
        setIntField(term350802, term350802.getClass(), "left", 1822990018);
        setIntField(term350802, term350802.getClass(), "bottom", -417542619);
        setIntField(term350802, term350802.getClass(), "right", 562244123);
        setField(term350777, term350777.getClass(), "margin", term350802);
        setIntField(term350807, term350807.getClass(), "top", -1020238686);
        setIntField(term350807, term350807.getClass(), "left", -1450230869);
        setIntField(term350807, term350807.getClass(), "bottom", -785918740);
        setIntField(term350807, term350807.getClass(), "right", 384642213);
        setField(term350777, term350777.getClass(), "defaultMargin", term350807);
        setField(term350777, term350777.getClass(), "defaultIcon", null);
        setField(term350777, term350777.getClass(), "pressedIcon", null);
        setField(term350777, term350777.getClass(), "disabledIcon", null);
        setField(term350777, term350777.getClass(), "selectedIcon", null);
        setField(term350777, term350777.getClass(), "disabledSelectedIcon", null);
        setField(term350777, term350777.getClass(), "rolloverIcon", null);
        setField(term350777, term350777.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term350777, term350777.getClass(), "paintBorder", false);
        setBooleanField(term350777, term350777.getClass(), "paintFocus", true);
        setBooleanField(term350777, term350777.getClass(), "rolloverEnabled", true);
        setBooleanField(term350777, term350777.getClass(), "contentAreaFilled", true);
        setIntField(term350777, term350777.getClass(), "verticalAlignment", 1673176720);
        setIntField(term350777, term350777.getClass(), "horizontalAlignment", 1084767630);
        setIntField(term350777, term350777.getClass(), "verticalTextPosition", 1634202484);
        setIntField(term350777, term350777.getClass(), "horizontalTextPosition", -1738191161);
        setIntField(term350777, term350777.getClass(), "iconTextGap", 48416396);
        setIntField(term350777, term350777.getClass(), "mnemonic", -1949441630);
        setIntField(term350777, term350777.getClass(), "mnemonicIndex", 1641286805);
        setLongField(term350777, term350777.getClass(), "multiClickThreshhold", -8306611953768020559L);
        setBooleanField(term350777, term350777.getClass(), "borderPaintedSet", true);
        setBooleanField(term350777, term350777.getClass(), "rolloverEnabledSet", true);
        setBooleanField(term350777, term350777.getClass(), "iconTextGapSet", true);
        setBooleanField(term350777, term350777.getClass(), "contentAreaFilledSet", true);
        setBooleanField(term350777, term350777.getClass(), "setLayout", false);
        setBooleanField(term350777, term350777.getClass(), "defaultCapable", true);
        setField(term350830, term350830.getClass(), "this$0", null);
        setField(term350777, term350777.getClass(), "handler", term350830);
        setField(term350777, term350777.getClass(), "changeListener", null);
        setField(term350777, term350777.getClass(), "actionListener", null);
        setField(term350777, term350777.getClass(), "itemListener", null);
        setField(term350777, term350777.getClass(), "changeEvent", null);
        setBooleanField(term350777, term350777.getClass(), "hideActionText", false);
        setField(term350777, term350777.getClass(), "action", null);
        setField(term350777, term350777.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term350777, term350777.getClass(), "isAlignmentXSet", false);
        setFloatField(term350777, term350777.getClass(), "alignmentX", 0.0F);
        setBooleanField(term350777, term350777.getClass(), "isAlignmentYSet", false);
        setFloatField(term350777, term350777.getClass(), "alignmentY", 0.0F);
        setField(term350777, term350777.getClass(), "ui", null);
        setField(term350777, term350777.getClass(), "listenerList", null);
        setField(term350777, term350777.getClass(), "clientProperties", null);
        setField(term350777, term350777.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term350777, term350777.getClass(), "autoscrolls", false);
        setField(term350777, term350777.getClass(), "border", null);
        setIntField(term350777, term350777.getClass(), "flags", 0);
        setField(term350777, term350777.getClass(), "inputVerifier", null);
        setBooleanField(term350777, term350777.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term350777, term350777.getClass(), "paintingChild", null);
        setField(term350777, term350777.getClass(), "popupMenu", null);
        setField(term350777, term350777.getClass(), "revalidateRunnableScheduled", null);
        setField(term350777, term350777.getClass(), "focusInputMap", null);
        setField(term350777, term350777.getClass(), "ancestorInputMap", null);
        setField(term350777, term350777.getClass(), "windowInputMap", null);
        setField(term350777, term350777.getClass(), "actionMap", null);
        setField(term350777, term350777.getClass(), "aaHint", null);
        setField(term350777, term350777.getClass(), "lcdRenderingHint", null);
        setField(term350777, term350777.getClass(), "component", null);
        setField(term350777, term350777.getClass(), "layoutMgr", null);
        setField(term350777, term350777.getClass(), "dispatcher", null);
        setField(term350777, term350777.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term350777, term350777.getClass(), "focusCycleRoot", false);
        setBooleanField(term350777, term350777.getClass(), "focusTraversalPolicyProvider", false);
        setField(term350777, term350777.getClass(), "printingThreads", null);
        setBooleanField(term350777, term350777.getClass(), "printing", false);
        setField(term350777, term350777.getClass(), "containerListener", null);
        setIntField(term350777, term350777.getClass(), "listeningChildren", 0);
        setIntField(term350777, term350777.getClass(), "listeningBoundsChildren", 0);
        setIntField(term350777, term350777.getClass(), "descendantsCount", 0);
        setField(term350777, term350777.getClass(), "preserveBackgroundColor", null);
        setIntField(term350777, term350777.getClass(), "numOfHWComponents", 0);
        setIntField(term350777, term350777.getClass(), "numOfLWComponents", 0);
        setField(term350777, term350777.getClass(), "modalComp", null);
        setField(term350777, term350777.getClass(), "modalAppContext", null);
        setIntField(term350777, term350777.getClass(), "containerSerializedDataVersion", 0);
        setField(term350777, term350777.getClass(), "peer", null);
        setField(term350777, term350777.getClass(), "parent", null);
        setField(term350777, term350777.getClass(), "appContext", null);
        setIntField(term350777, term350777.getClass(), "x", 0);
        setIntField(term350777, term350777.getClass(), "y", 0);
        setIntField(term350777, term350777.getClass(), "width", 0);
        setIntField(term350777, term350777.getClass(), "height", 0);
        setField(term350777, term350777.getClass(), "foreground", null);
        setField(term350777, term350777.getClass(), "background", null);
        setField(term350777, term350777.getClass(), "font", null);
        setField(term350777, term350777.getClass(), "peerFont", null);
        setField(term350777, term350777.getClass(), "cursor", null);
        setField(term350777, term350777.getClass(), "locale", null);
        setField(term350777, term350777.getClass(), "graphicsConfig", null);
        setField(term350777, term350777.getClass(), "bufferStrategy", null);
        setBooleanField(term350777, term350777.getClass(), "ignoreRepaint", false);
        setBooleanField(term350777, term350777.getClass(), "visible", false);
        setBooleanField(term350777, term350777.getClass(), "enabled", false);
        setBooleanField(term350777, term350777.getClass(), "valid", false);
        setField(term350777, term350777.getClass(), "dropTarget", null);
        setField(term350777, term350777.getClass(), "popups", null);
        setField(term350777, term350777.getClass(), "name", null);
        setBooleanField(term350777, term350777.getClass(), "nameExplicitlySet", false);
        setBooleanField(term350777, term350777.getClass(), "focusable", false);
        setIntField(term350777, term350777.getClass(), "isFocusTraversableOverridden", 0);
        setField(term350777, term350777.getClass(), "focusTraversalKeys", null);
        setBooleanField(term350777, term350777.getClass(), "focusTraversalKeysEnabled", false);
        setField(term350777, term350777.getClass(), "acc", null);
        setField(term350777, term350777.getClass(), "minSize", null);
        setBooleanField(term350777, term350777.getClass(), "minSizeSet", false);
        setField(term350777, term350777.getClass(), "prefSize", null);
        setBooleanField(term350777, term350777.getClass(), "prefSizeSet", false);
        setField(term350777, term350777.getClass(), "maxSize", null);
        setBooleanField(term350777, term350777.getClass(), "maxSizeSet", false);
        setField(term350777, term350777.getClass(), "componentOrientation", null);
        setBooleanField(term350777, term350777.getClass(), "newEventsOnly", false);
        setField(term350777, term350777.getClass(), "componentListener", null);
        setField(term350777, term350777.getClass(), "focusListener", null);
        setField(term350777, term350777.getClass(), "hierarchyListener", null);
        setField(term350777, term350777.getClass(), "hierarchyBoundsListener", null);
        setField(term350777, term350777.getClass(), "keyListener", null);
        setField(term350777, term350777.getClass(), "mouseListener", null);
        setField(term350777, term350777.getClass(), "mouseMotionListener", null);
        setField(term350777, term350777.getClass(), "mouseWheelListener", null);
        setField(term350777, term350777.getClass(), "inputMethodListener", null);
        setLongField(term350777, term350777.getClass(), "eventMask", 0L);
        setField(term350777, term350777.getClass(), "changeSupport", null);
        setField(term350777, term350777.getClass(), "objectLock", null);
        setBooleanField(term350777, term350777.getClass(), "isPacked", false);
        setIntField(term350777, term350777.getClass(), "boundsOp", 0);
        setField(term350777, term350777.getClass(), "compoundShape", null);
        setField(term350777, term350777.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term350777, term350777.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term350777, term350777.getClass(), "backgroundEraseDisabled", false);
        setField(term350777, term350777.getClass(), "eventCache", null);
        setBooleanField(term350777, term350777.getClass(), "coalescingEnabled", false);
        setBooleanField(term350777, term350777.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term350777, term350777.getClass(), "componentSerializedDataVersion", 0);
        setField(term350777, term350777.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$5");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RyXrJxJQiY";
        callMethod(klass, "setToolTipText", argTypes, term350777, args);
    }

};


