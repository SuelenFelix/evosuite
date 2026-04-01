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
     Object term350769;

    public Board_5_setToolTipText_6792895592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350769 = newInstance(Class.forName("core.Board$5"));
        Object term350794 = newInstance(Class.forName("java.awt.Insets"));
        Object term350799 = newInstance(Class.forName("java.awt.Insets"));
        Object term350822 = newInstance(Class.forName("javax.swing.AbstractButton$Handler"));
        setField(term350769, term350769.getClass(), "this$0", null);
        setField(term350769, term350769.getClass(), "initialTip", "skwxdosvQV");
        setField(term350769, term350769.getClass(), "model", null);
        setField(term350769, term350769.getClass(), "text", "DBYTggnCkD");
        setIntField(term350794, term350794.getClass(), "top", -2129996761);
        setIntField(term350794, term350794.getClass(), "left", 1822990018);
        setIntField(term350794, term350794.getClass(), "bottom", -417542619);
        setIntField(term350794, term350794.getClass(), "right", 562244123);
        setField(term350769, term350769.getClass(), "margin", term350794);
        setIntField(term350799, term350799.getClass(), "top", -1020238686);
        setIntField(term350799, term350799.getClass(), "left", -1450230869);
        setIntField(term350799, term350799.getClass(), "bottom", -785918740);
        setIntField(term350799, term350799.getClass(), "right", 384642213);
        setField(term350769, term350769.getClass(), "defaultMargin", term350799);
        setField(term350769, term350769.getClass(), "defaultIcon", null);
        setField(term350769, term350769.getClass(), "pressedIcon", null);
        setField(term350769, term350769.getClass(), "disabledIcon", null);
        setField(term350769, term350769.getClass(), "selectedIcon", null);
        setField(term350769, term350769.getClass(), "disabledSelectedIcon", null);
        setField(term350769, term350769.getClass(), "rolloverIcon", null);
        setField(term350769, term350769.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term350769, term350769.getClass(), "paintBorder", false);
        setBooleanField(term350769, term350769.getClass(), "paintFocus", true);
        setBooleanField(term350769, term350769.getClass(), "rolloverEnabled", true);
        setBooleanField(term350769, term350769.getClass(), "contentAreaFilled", true);
        setIntField(term350769, term350769.getClass(), "verticalAlignment", 1673176720);
        setIntField(term350769, term350769.getClass(), "horizontalAlignment", 1084767630);
        setIntField(term350769, term350769.getClass(), "verticalTextPosition", 1634202484);
        setIntField(term350769, term350769.getClass(), "horizontalTextPosition", -1738191161);
        setIntField(term350769, term350769.getClass(), "iconTextGap", 48416396);
        setIntField(term350769, term350769.getClass(), "mnemonic", -1949441630);
        setIntField(term350769, term350769.getClass(), "mnemonicIndex", 1641286805);
        setLongField(term350769, term350769.getClass(), "multiClickThreshhold", -8306611953768020559L);
        setBooleanField(term350769, term350769.getClass(), "borderPaintedSet", true);
        setBooleanField(term350769, term350769.getClass(), "rolloverEnabledSet", true);
        setBooleanField(term350769, term350769.getClass(), "iconTextGapSet", true);
        setBooleanField(term350769, term350769.getClass(), "contentAreaFilledSet", true);
        setBooleanField(term350769, term350769.getClass(), "setLayout", false);
        setBooleanField(term350769, term350769.getClass(), "defaultCapable", true);
        setField(term350822, term350822.getClass(), "this$0", null);
        setField(term350769, term350769.getClass(), "handler", term350822);
        setField(term350769, term350769.getClass(), "changeListener", null);
        setField(term350769, term350769.getClass(), "actionListener", null);
        setField(term350769, term350769.getClass(), "itemListener", null);
        setField(term350769, term350769.getClass(), "changeEvent", null);
        setBooleanField(term350769, term350769.getClass(), "hideActionText", false);
        setField(term350769, term350769.getClass(), "action", null);
        setField(term350769, term350769.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term350769, term350769.getClass(), "isAlignmentXSet", false);
        setFloatField(term350769, term350769.getClass(), "alignmentX", 0.0F);
        setBooleanField(term350769, term350769.getClass(), "isAlignmentYSet", false);
        setFloatField(term350769, term350769.getClass(), "alignmentY", 0.0F);
        setField(term350769, term350769.getClass(), "ui", null);
        setField(term350769, term350769.getClass(), "listenerList", null);
        setField(term350769, term350769.getClass(), "clientProperties", null);
        setField(term350769, term350769.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term350769, term350769.getClass(), "autoscrolls", false);
        setField(term350769, term350769.getClass(), "border", null);
        setIntField(term350769, term350769.getClass(), "flags", 0);
        setField(term350769, term350769.getClass(), "inputVerifier", null);
        setBooleanField(term350769, term350769.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term350769, term350769.getClass(), "paintingChild", null);
        setField(term350769, term350769.getClass(), "popupMenu", null);
        setField(term350769, term350769.getClass(), "revalidateRunnableScheduled", null);
        setField(term350769, term350769.getClass(), "focusInputMap", null);
        setField(term350769, term350769.getClass(), "ancestorInputMap", null);
        setField(term350769, term350769.getClass(), "windowInputMap", null);
        setField(term350769, term350769.getClass(), "actionMap", null);
        setField(term350769, term350769.getClass(), "aaHint", null);
        setField(term350769, term350769.getClass(), "lcdRenderingHint", null);
        setField(term350769, term350769.getClass(), "component", null);
        setField(term350769, term350769.getClass(), "layoutMgr", null);
        setField(term350769, term350769.getClass(), "dispatcher", null);
        setField(term350769, term350769.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term350769, term350769.getClass(), "focusCycleRoot", false);
        setBooleanField(term350769, term350769.getClass(), "focusTraversalPolicyProvider", false);
        setField(term350769, term350769.getClass(), "printingThreads", null);
        setBooleanField(term350769, term350769.getClass(), "printing", false);
        setField(term350769, term350769.getClass(), "containerListener", null);
        setIntField(term350769, term350769.getClass(), "listeningChildren", 0);
        setIntField(term350769, term350769.getClass(), "listeningBoundsChildren", 0);
        setIntField(term350769, term350769.getClass(), "descendantsCount", 0);
        setField(term350769, term350769.getClass(), "preserveBackgroundColor", null);
        setIntField(term350769, term350769.getClass(), "numOfHWComponents", 0);
        setIntField(term350769, term350769.getClass(), "numOfLWComponents", 0);
        setField(term350769, term350769.getClass(), "modalComp", null);
        setField(term350769, term350769.getClass(), "modalAppContext", null);
        setIntField(term350769, term350769.getClass(), "containerSerializedDataVersion", 0);
        setField(term350769, term350769.getClass(), "peer", null);
        setField(term350769, term350769.getClass(), "parent", null);
        setField(term350769, term350769.getClass(), "appContext", null);
        setIntField(term350769, term350769.getClass(), "x", 0);
        setIntField(term350769, term350769.getClass(), "y", 0);
        setIntField(term350769, term350769.getClass(), "width", 0);
        setIntField(term350769, term350769.getClass(), "height", 0);
        setField(term350769, term350769.getClass(), "foreground", null);
        setField(term350769, term350769.getClass(), "background", null);
        setField(term350769, term350769.getClass(), "font", null);
        setField(term350769, term350769.getClass(), "peerFont", null);
        setField(term350769, term350769.getClass(), "cursor", null);
        setField(term350769, term350769.getClass(), "locale", null);
        setField(term350769, term350769.getClass(), "graphicsConfig", null);
        setField(term350769, term350769.getClass(), "bufferStrategy", null);
        setBooleanField(term350769, term350769.getClass(), "ignoreRepaint", false);
        setBooleanField(term350769, term350769.getClass(), "visible", false);
        setBooleanField(term350769, term350769.getClass(), "enabled", false);
        setBooleanField(term350769, term350769.getClass(), "valid", false);
        setField(term350769, term350769.getClass(), "dropTarget", null);
        setField(term350769, term350769.getClass(), "popups", null);
        setField(term350769, term350769.getClass(), "name", null);
        setBooleanField(term350769, term350769.getClass(), "nameExplicitlySet", false);
        setBooleanField(term350769, term350769.getClass(), "focusable", false);
        setIntField(term350769, term350769.getClass(), "isFocusTraversableOverridden", 0);
        setField(term350769, term350769.getClass(), "focusTraversalKeys", null);
        setBooleanField(term350769, term350769.getClass(), "focusTraversalKeysEnabled", false);
        setField(term350769, term350769.getClass(), "acc", null);
        setField(term350769, term350769.getClass(), "minSize", null);
        setBooleanField(term350769, term350769.getClass(), "minSizeSet", false);
        setField(term350769, term350769.getClass(), "prefSize", null);
        setBooleanField(term350769, term350769.getClass(), "prefSizeSet", false);
        setField(term350769, term350769.getClass(), "maxSize", null);
        setBooleanField(term350769, term350769.getClass(), "maxSizeSet", false);
        setField(term350769, term350769.getClass(), "componentOrientation", null);
        setBooleanField(term350769, term350769.getClass(), "newEventsOnly", false);
        setField(term350769, term350769.getClass(), "componentListener", null);
        setField(term350769, term350769.getClass(), "focusListener", null);
        setField(term350769, term350769.getClass(), "hierarchyListener", null);
        setField(term350769, term350769.getClass(), "hierarchyBoundsListener", null);
        setField(term350769, term350769.getClass(), "keyListener", null);
        setField(term350769, term350769.getClass(), "mouseListener", null);
        setField(term350769, term350769.getClass(), "mouseMotionListener", null);
        setField(term350769, term350769.getClass(), "mouseWheelListener", null);
        setField(term350769, term350769.getClass(), "inputMethodListener", null);
        setLongField(term350769, term350769.getClass(), "eventMask", 0L);
        setField(term350769, term350769.getClass(), "changeSupport", null);
        setField(term350769, term350769.getClass(), "objectLock", null);
        setBooleanField(term350769, term350769.getClass(), "isPacked", false);
        setIntField(term350769, term350769.getClass(), "boundsOp", 0);
        setField(term350769, term350769.getClass(), "compoundShape", null);
        setField(term350769, term350769.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term350769, term350769.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term350769, term350769.getClass(), "backgroundEraseDisabled", false);
        setField(term350769, term350769.getClass(), "eventCache", null);
        setBooleanField(term350769, term350769.getClass(), "coalescingEnabled", false);
        setBooleanField(term350769, term350769.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term350769, term350769.getClass(), "componentSerializedDataVersion", 0);
        setField(term350769, term350769.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$5");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RyXrJxJQiY";
        callMethod(klass, "setToolTipText", argTypes, term350769, args);
    }

};


