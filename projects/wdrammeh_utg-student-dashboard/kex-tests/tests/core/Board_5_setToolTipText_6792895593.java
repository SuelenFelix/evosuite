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

public class Board_5_setToolTipText_6792895593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350920;

    public Board_5_setToolTipText_6792895593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350920 = newInstance(Class.forName("core.Board$5"));
        setField(term350920, term350920.getClass(), "this$0", null);
        setField(term350920, term350920.getClass(), "initialTip", null);
        setField(term350920, term350920.getClass(), "model", null);
        setField(term350920, term350920.getClass(), "text", null);
        setField(term350920, term350920.getClass(), "margin", null);
        setField(term350920, term350920.getClass(), "defaultMargin", null);
        setField(term350920, term350920.getClass(), "defaultIcon", null);
        setField(term350920, term350920.getClass(), "pressedIcon", null);
        setField(term350920, term350920.getClass(), "disabledIcon", null);
        setField(term350920, term350920.getClass(), "selectedIcon", null);
        setField(term350920, term350920.getClass(), "disabledSelectedIcon", null);
        setField(term350920, term350920.getClass(), "rolloverIcon", null);
        setField(term350920, term350920.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term350920, term350920.getClass(), "paintBorder", false);
        setBooleanField(term350920, term350920.getClass(), "paintFocus", false);
        setBooleanField(term350920, term350920.getClass(), "rolloverEnabled", false);
        setBooleanField(term350920, term350920.getClass(), "contentAreaFilled", false);
        setIntField(term350920, term350920.getClass(), "verticalAlignment", 0);
        setIntField(term350920, term350920.getClass(), "horizontalAlignment", 0);
        setIntField(term350920, term350920.getClass(), "verticalTextPosition", 0);
        setIntField(term350920, term350920.getClass(), "horizontalTextPosition", 0);
        setIntField(term350920, term350920.getClass(), "iconTextGap", 0);
        setIntField(term350920, term350920.getClass(), "mnemonic", 0);
        setIntField(term350920, term350920.getClass(), "mnemonicIndex", 0);
        setLongField(term350920, term350920.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term350920, term350920.getClass(), "borderPaintedSet", false);
        setBooleanField(term350920, term350920.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term350920, term350920.getClass(), "iconTextGapSet", false);
        setBooleanField(term350920, term350920.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term350920, term350920.getClass(), "setLayout", false);
        setBooleanField(term350920, term350920.getClass(), "defaultCapable", false);
        setField(term350920, term350920.getClass(), "handler", null);
        setField(term350920, term350920.getClass(), "changeListener", null);
        setField(term350920, term350920.getClass(), "actionListener", null);
        setField(term350920, term350920.getClass(), "itemListener", null);
        setField(term350920, term350920.getClass(), "changeEvent", null);
        setBooleanField(term350920, term350920.getClass(), "hideActionText", false);
        setField(term350920, term350920.getClass(), "action", null);
        setField(term350920, term350920.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term350920, term350920.getClass(), "isAlignmentXSet", false);
        setFloatField(term350920, term350920.getClass(), "alignmentX", 0.0F);
        setBooleanField(term350920, term350920.getClass(), "isAlignmentYSet", false);
        setFloatField(term350920, term350920.getClass(), "alignmentY", 0.0F);
        setField(term350920, term350920.getClass(), "ui", null);
        setField(term350920, term350920.getClass(), "listenerList", null);
        setField(term350920, term350920.getClass(), "clientProperties", null);
        setField(term350920, term350920.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term350920, term350920.getClass(), "autoscrolls", false);
        setField(term350920, term350920.getClass(), "border", null);
        setIntField(term350920, term350920.getClass(), "flags", 0);
        setField(term350920, term350920.getClass(), "inputVerifier", null);
        setBooleanField(term350920, term350920.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term350920, term350920.getClass(), "paintingChild", null);
        setField(term350920, term350920.getClass(), "popupMenu", null);
        setField(term350920, term350920.getClass(), "revalidateRunnableScheduled", null);
        setField(term350920, term350920.getClass(), "focusInputMap", null);
        setField(term350920, term350920.getClass(), "ancestorInputMap", null);
        setField(term350920, term350920.getClass(), "windowInputMap", null);
        setField(term350920, term350920.getClass(), "actionMap", null);
        setField(term350920, term350920.getClass(), "aaHint", null);
        setField(term350920, term350920.getClass(), "lcdRenderingHint", null);
        setField(term350920, term350920.getClass(), "component", null);
        setField(term350920, term350920.getClass(), "layoutMgr", null);
        setField(term350920, term350920.getClass(), "dispatcher", null);
        setField(term350920, term350920.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term350920, term350920.getClass(), "focusCycleRoot", false);
        setBooleanField(term350920, term350920.getClass(), "focusTraversalPolicyProvider", false);
        setField(term350920, term350920.getClass(), "printingThreads", null);
        setBooleanField(term350920, term350920.getClass(), "printing", false);
        setField(term350920, term350920.getClass(), "containerListener", null);
        setIntField(term350920, term350920.getClass(), "listeningChildren", 0);
        setIntField(term350920, term350920.getClass(), "listeningBoundsChildren", 0);
        setIntField(term350920, term350920.getClass(), "descendantsCount", 0);
        setField(term350920, term350920.getClass(), "preserveBackgroundColor", null);
        setIntField(term350920, term350920.getClass(), "numOfHWComponents", 0);
        setIntField(term350920, term350920.getClass(), "numOfLWComponents", 0);
        setField(term350920, term350920.getClass(), "modalComp", null);
        setField(term350920, term350920.getClass(), "modalAppContext", null);
        setIntField(term350920, term350920.getClass(), "containerSerializedDataVersion", 0);
        setField(term350920, term350920.getClass(), "peer", null);
        setField(term350920, term350920.getClass(), "parent", null);
        setField(term350920, term350920.getClass(), "appContext", null);
        setIntField(term350920, term350920.getClass(), "x", 0);
        setIntField(term350920, term350920.getClass(), "y", 0);
        setIntField(term350920, term350920.getClass(), "width", 0);
        setIntField(term350920, term350920.getClass(), "height", 0);
        setField(term350920, term350920.getClass(), "foreground", null);
        setField(term350920, term350920.getClass(), "background", null);
        setField(term350920, term350920.getClass(), "font", null);
        setField(term350920, term350920.getClass(), "peerFont", null);
        setField(term350920, term350920.getClass(), "cursor", null);
        setField(term350920, term350920.getClass(), "locale", null);
        setField(term350920, term350920.getClass(), "graphicsConfig", null);
        setField(term350920, term350920.getClass(), "bufferStrategy", null);
        setBooleanField(term350920, term350920.getClass(), "ignoreRepaint", false);
        setBooleanField(term350920, term350920.getClass(), "visible", false);
        setBooleanField(term350920, term350920.getClass(), "enabled", false);
        setBooleanField(term350920, term350920.getClass(), "valid", false);
        setField(term350920, term350920.getClass(), "dropTarget", null);
        setField(term350920, term350920.getClass(), "popups", null);
        setField(term350920, term350920.getClass(), "name", null);
        setBooleanField(term350920, term350920.getClass(), "nameExplicitlySet", false);
        setBooleanField(term350920, term350920.getClass(), "focusable", false);
        setIntField(term350920, term350920.getClass(), "isFocusTraversableOverridden", 0);
        setField(term350920, term350920.getClass(), "focusTraversalKeys", null);
        setBooleanField(term350920, term350920.getClass(), "focusTraversalKeysEnabled", false);
        setField(term350920, term350920.getClass(), "acc", null);
        setField(term350920, term350920.getClass(), "minSize", null);
        setBooleanField(term350920, term350920.getClass(), "minSizeSet", false);
        setField(term350920, term350920.getClass(), "prefSize", null);
        setBooleanField(term350920, term350920.getClass(), "prefSizeSet", false);
        setField(term350920, term350920.getClass(), "maxSize", null);
        setBooleanField(term350920, term350920.getClass(), "maxSizeSet", false);
        setField(term350920, term350920.getClass(), "componentOrientation", null);
        setBooleanField(term350920, term350920.getClass(), "newEventsOnly", false);
        setField(term350920, term350920.getClass(), "componentListener", null);
        setField(term350920, term350920.getClass(), "focusListener", null);
        setField(term350920, term350920.getClass(), "hierarchyListener", null);
        setField(term350920, term350920.getClass(), "hierarchyBoundsListener", null);
        setField(term350920, term350920.getClass(), "keyListener", null);
        setField(term350920, term350920.getClass(), "mouseListener", null);
        setField(term350920, term350920.getClass(), "mouseMotionListener", null);
        setField(term350920, term350920.getClass(), "mouseWheelListener", null);
        setField(term350920, term350920.getClass(), "inputMethodListener", null);
        setLongField(term350920, term350920.getClass(), "eventMask", 0L);
        setField(term350920, term350920.getClass(), "changeSupport", null);
        setField(term350920, term350920.getClass(), "objectLock", null);
        setBooleanField(term350920, term350920.getClass(), "isPacked", false);
        setIntField(term350920, term350920.getClass(), "boundsOp", 0);
        setField(term350920, term350920.getClass(), "compoundShape", null);
        setField(term350920, term350920.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term350920, term350920.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term350920, term350920.getClass(), "backgroundEraseDisabled", false);
        setField(term350920, term350920.getClass(), "eventCache", null);
        setBooleanField(term350920, term350920.getClass(), "coalescingEnabled", false);
        setBooleanField(term350920, term350920.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term350920, term350920.getClass(), "componentSerializedDataVersion", 0);
        setField(term350920, term350920.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$5");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setToolTipText", argTypes, term350920, args);
    }

};


