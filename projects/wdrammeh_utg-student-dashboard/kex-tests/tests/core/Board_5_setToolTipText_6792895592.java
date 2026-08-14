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
     Object term350783;

    public Board_5_setToolTipText_6792895592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350783 = newInstance(Class.forName("core.Board$5"));
        Object term350808 = newInstance(Class.forName("java.awt.Insets"));
        Object term350813 = newInstance(Class.forName("java.awt.Insets"));
        Object term350836 = newInstance(Class.forName("javax.swing.AbstractButton$Handler"));
        setField(term350783, term350783.getClass(), "this$0", null);
        setField(term350783, term350783.getClass(), "initialTip", "skwxdosvQV");
        setField(term350783, term350783.getClass(), "model", null);
        setField(term350783, term350783.getClass(), "text", "DBYTggnCkD");
        setIntField(term350808, term350808.getClass(), "top", -2129996761);
        setIntField(term350808, term350808.getClass(), "left", 1822990018);
        setIntField(term350808, term350808.getClass(), "bottom", -417542619);
        setIntField(term350808, term350808.getClass(), "right", 562244123);
        setField(term350783, term350783.getClass(), "margin", term350808);
        setIntField(term350813, term350813.getClass(), "top", -1020238686);
        setIntField(term350813, term350813.getClass(), "left", -1450230869);
        setIntField(term350813, term350813.getClass(), "bottom", -785918740);
        setIntField(term350813, term350813.getClass(), "right", 384642213);
        setField(term350783, term350783.getClass(), "defaultMargin", term350813);
        setField(term350783, term350783.getClass(), "defaultIcon", null);
        setField(term350783, term350783.getClass(), "pressedIcon", null);
        setField(term350783, term350783.getClass(), "disabledIcon", null);
        setField(term350783, term350783.getClass(), "selectedIcon", null);
        setField(term350783, term350783.getClass(), "disabledSelectedIcon", null);
        setField(term350783, term350783.getClass(), "rolloverIcon", null);
        setField(term350783, term350783.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term350783, term350783.getClass(), "paintBorder", false);
        setBooleanField(term350783, term350783.getClass(), "paintFocus", true);
        setBooleanField(term350783, term350783.getClass(), "rolloverEnabled", true);
        setBooleanField(term350783, term350783.getClass(), "contentAreaFilled", true);
        setIntField(term350783, term350783.getClass(), "verticalAlignment", 1673176720);
        setIntField(term350783, term350783.getClass(), "horizontalAlignment", 1084767630);
        setIntField(term350783, term350783.getClass(), "verticalTextPosition", 1634202484);
        setIntField(term350783, term350783.getClass(), "horizontalTextPosition", -1738191161);
        setIntField(term350783, term350783.getClass(), "iconTextGap", 48416396);
        setIntField(term350783, term350783.getClass(), "mnemonic", -1949441630);
        setIntField(term350783, term350783.getClass(), "mnemonicIndex", 1641286805);
        setLongField(term350783, term350783.getClass(), "multiClickThreshhold", -8306611953768020559L);
        setBooleanField(term350783, term350783.getClass(), "borderPaintedSet", true);
        setBooleanField(term350783, term350783.getClass(), "rolloverEnabledSet", true);
        setBooleanField(term350783, term350783.getClass(), "iconTextGapSet", true);
        setBooleanField(term350783, term350783.getClass(), "contentAreaFilledSet", true);
        setBooleanField(term350783, term350783.getClass(), "setLayout", false);
        setBooleanField(term350783, term350783.getClass(), "defaultCapable", true);
        setField(term350836, term350836.getClass(), "this$0", null);
        setField(term350783, term350783.getClass(), "handler", term350836);
        setField(term350783, term350783.getClass(), "changeListener", null);
        setField(term350783, term350783.getClass(), "actionListener", null);
        setField(term350783, term350783.getClass(), "itemListener", null);
        setField(term350783, term350783.getClass(), "changeEvent", null);
        setBooleanField(term350783, term350783.getClass(), "hideActionText", false);
        setField(term350783, term350783.getClass(), "action", null);
        setField(term350783, term350783.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term350783, term350783.getClass(), "isAlignmentXSet", false);
        setFloatField(term350783, term350783.getClass(), "alignmentX", 0.0F);
        setBooleanField(term350783, term350783.getClass(), "isAlignmentYSet", false);
        setFloatField(term350783, term350783.getClass(), "alignmentY", 0.0F);
        setField(term350783, term350783.getClass(), "ui", null);
        setField(term350783, term350783.getClass(), "listenerList", null);
        setField(term350783, term350783.getClass(), "clientProperties", null);
        setField(term350783, term350783.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term350783, term350783.getClass(), "autoscrolls", false);
        setField(term350783, term350783.getClass(), "border", null);
        setIntField(term350783, term350783.getClass(), "flags", 0);
        setField(term350783, term350783.getClass(), "inputVerifier", null);
        setBooleanField(term350783, term350783.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term350783, term350783.getClass(), "paintingChild", null);
        setField(term350783, term350783.getClass(), "popupMenu", null);
        setField(term350783, term350783.getClass(), "revalidateRunnableScheduled", null);
        setField(term350783, term350783.getClass(), "focusInputMap", null);
        setField(term350783, term350783.getClass(), "ancestorInputMap", null);
        setField(term350783, term350783.getClass(), "windowInputMap", null);
        setField(term350783, term350783.getClass(), "actionMap", null);
        setField(term350783, term350783.getClass(), "aaHint", null);
        setField(term350783, term350783.getClass(), "lcdRenderingHint", null);
        setField(term350783, term350783.getClass(), "component", null);
        setField(term350783, term350783.getClass(), "layoutMgr", null);
        setField(term350783, term350783.getClass(), "dispatcher", null);
        setField(term350783, term350783.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term350783, term350783.getClass(), "focusCycleRoot", false);
        setBooleanField(term350783, term350783.getClass(), "focusTraversalPolicyProvider", false);
        setField(term350783, term350783.getClass(), "printingThreads", null);
        setBooleanField(term350783, term350783.getClass(), "printing", false);
        setField(term350783, term350783.getClass(), "containerListener", null);
        setIntField(term350783, term350783.getClass(), "listeningChildren", 0);
        setIntField(term350783, term350783.getClass(), "listeningBoundsChildren", 0);
        setIntField(term350783, term350783.getClass(), "descendantsCount", 0);
        setField(term350783, term350783.getClass(), "preserveBackgroundColor", null);
        setIntField(term350783, term350783.getClass(), "numOfHWComponents", 0);
        setIntField(term350783, term350783.getClass(), "numOfLWComponents", 0);
        setField(term350783, term350783.getClass(), "modalComp", null);
        setField(term350783, term350783.getClass(), "modalAppContext", null);
        setIntField(term350783, term350783.getClass(), "containerSerializedDataVersion", 0);
        setField(term350783, term350783.getClass(), "peer", null);
        setField(term350783, term350783.getClass(), "parent", null);
        setField(term350783, term350783.getClass(), "appContext", null);
        setIntField(term350783, term350783.getClass(), "x", 0);
        setIntField(term350783, term350783.getClass(), "y", 0);
        setIntField(term350783, term350783.getClass(), "width", 0);
        setIntField(term350783, term350783.getClass(), "height", 0);
        setField(term350783, term350783.getClass(), "foreground", null);
        setField(term350783, term350783.getClass(), "background", null);
        setField(term350783, term350783.getClass(), "font", null);
        setField(term350783, term350783.getClass(), "peerFont", null);
        setField(term350783, term350783.getClass(), "cursor", null);
        setField(term350783, term350783.getClass(), "locale", null);
        setField(term350783, term350783.getClass(), "graphicsConfig", null);
        setField(term350783, term350783.getClass(), "bufferStrategy", null);
        setBooleanField(term350783, term350783.getClass(), "ignoreRepaint", false);
        setBooleanField(term350783, term350783.getClass(), "visible", false);
        setBooleanField(term350783, term350783.getClass(), "enabled", false);
        setBooleanField(term350783, term350783.getClass(), "valid", false);
        setField(term350783, term350783.getClass(), "dropTarget", null);
        setField(term350783, term350783.getClass(), "popups", null);
        setField(term350783, term350783.getClass(), "name", null);
        setBooleanField(term350783, term350783.getClass(), "nameExplicitlySet", false);
        setBooleanField(term350783, term350783.getClass(), "focusable", false);
        setIntField(term350783, term350783.getClass(), "isFocusTraversableOverridden", 0);
        setField(term350783, term350783.getClass(), "focusTraversalKeys", null);
        setBooleanField(term350783, term350783.getClass(), "focusTraversalKeysEnabled", false);
        setField(term350783, term350783.getClass(), "acc", null);
        setField(term350783, term350783.getClass(), "minSize", null);
        setBooleanField(term350783, term350783.getClass(), "minSizeSet", false);
        setField(term350783, term350783.getClass(), "prefSize", null);
        setBooleanField(term350783, term350783.getClass(), "prefSizeSet", false);
        setField(term350783, term350783.getClass(), "maxSize", null);
        setBooleanField(term350783, term350783.getClass(), "maxSizeSet", false);
        setField(term350783, term350783.getClass(), "componentOrientation", null);
        setBooleanField(term350783, term350783.getClass(), "newEventsOnly", false);
        setField(term350783, term350783.getClass(), "componentListener", null);
        setField(term350783, term350783.getClass(), "focusListener", null);
        setField(term350783, term350783.getClass(), "hierarchyListener", null);
        setField(term350783, term350783.getClass(), "hierarchyBoundsListener", null);
        setField(term350783, term350783.getClass(), "keyListener", null);
        setField(term350783, term350783.getClass(), "mouseListener", null);
        setField(term350783, term350783.getClass(), "mouseMotionListener", null);
        setField(term350783, term350783.getClass(), "mouseWheelListener", null);
        setField(term350783, term350783.getClass(), "inputMethodListener", null);
        setLongField(term350783, term350783.getClass(), "eventMask", 0L);
        setField(term350783, term350783.getClass(), "changeSupport", null);
        setField(term350783, term350783.getClass(), "objectLock", null);
        setBooleanField(term350783, term350783.getClass(), "isPacked", false);
        setIntField(term350783, term350783.getClass(), "boundsOp", 0);
        setField(term350783, term350783.getClass(), "compoundShape", null);
        setField(term350783, term350783.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term350783, term350783.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term350783, term350783.getClass(), "backgroundEraseDisabled", false);
        setField(term350783, term350783.getClass(), "eventCache", null);
        setBooleanField(term350783, term350783.getClass(), "coalescingEnabled", false);
        setBooleanField(term350783, term350783.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term350783, term350783.getClass(), "componentSerializedDataVersion", 0);
        setField(term350783, term350783.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$5");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RyXrJxJQiY";
        callMethod(klass, "setToolTipText", argTypes, term350783, args);
    }

};


