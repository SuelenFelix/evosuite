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
     Object term350914;

    public Board_5_setToolTipText_6792895593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350914 = newInstance(Class.forName("core.Board$5"));
        setField(term350914, term350914.getClass(), "this$0", null);
        setField(term350914, term350914.getClass(), "initialTip", null);
        setField(term350914, term350914.getClass(), "model", null);
        setField(term350914, term350914.getClass(), "text", null);
        setField(term350914, term350914.getClass(), "margin", null);
        setField(term350914, term350914.getClass(), "defaultMargin", null);
        setField(term350914, term350914.getClass(), "defaultIcon", null);
        setField(term350914, term350914.getClass(), "pressedIcon", null);
        setField(term350914, term350914.getClass(), "disabledIcon", null);
        setField(term350914, term350914.getClass(), "selectedIcon", null);
        setField(term350914, term350914.getClass(), "disabledSelectedIcon", null);
        setField(term350914, term350914.getClass(), "rolloverIcon", null);
        setField(term350914, term350914.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term350914, term350914.getClass(), "paintBorder", false);
        setBooleanField(term350914, term350914.getClass(), "paintFocus", false);
        setBooleanField(term350914, term350914.getClass(), "rolloverEnabled", false);
        setBooleanField(term350914, term350914.getClass(), "contentAreaFilled", false);
        setIntField(term350914, term350914.getClass(), "verticalAlignment", 0);
        setIntField(term350914, term350914.getClass(), "horizontalAlignment", 0);
        setIntField(term350914, term350914.getClass(), "verticalTextPosition", 0);
        setIntField(term350914, term350914.getClass(), "horizontalTextPosition", 0);
        setIntField(term350914, term350914.getClass(), "iconTextGap", 0);
        setIntField(term350914, term350914.getClass(), "mnemonic", 0);
        setIntField(term350914, term350914.getClass(), "mnemonicIndex", 0);
        setLongField(term350914, term350914.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term350914, term350914.getClass(), "borderPaintedSet", false);
        setBooleanField(term350914, term350914.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term350914, term350914.getClass(), "iconTextGapSet", false);
        setBooleanField(term350914, term350914.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term350914, term350914.getClass(), "setLayout", false);
        setBooleanField(term350914, term350914.getClass(), "defaultCapable", false);
        setField(term350914, term350914.getClass(), "handler", null);
        setField(term350914, term350914.getClass(), "changeListener", null);
        setField(term350914, term350914.getClass(), "actionListener", null);
        setField(term350914, term350914.getClass(), "itemListener", null);
        setField(term350914, term350914.getClass(), "changeEvent", null);
        setBooleanField(term350914, term350914.getClass(), "hideActionText", false);
        setField(term350914, term350914.getClass(), "action", null);
        setField(term350914, term350914.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term350914, term350914.getClass(), "isAlignmentXSet", false);
        setFloatField(term350914, term350914.getClass(), "alignmentX", 0.0F);
        setBooleanField(term350914, term350914.getClass(), "isAlignmentYSet", false);
        setFloatField(term350914, term350914.getClass(), "alignmentY", 0.0F);
        setField(term350914, term350914.getClass(), "ui", null);
        setField(term350914, term350914.getClass(), "listenerList", null);
        setField(term350914, term350914.getClass(), "clientProperties", null);
        setField(term350914, term350914.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term350914, term350914.getClass(), "autoscrolls", false);
        setField(term350914, term350914.getClass(), "border", null);
        setIntField(term350914, term350914.getClass(), "flags", 0);
        setField(term350914, term350914.getClass(), "inputVerifier", null);
        setBooleanField(term350914, term350914.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term350914, term350914.getClass(), "paintingChild", null);
        setField(term350914, term350914.getClass(), "popupMenu", null);
        setField(term350914, term350914.getClass(), "revalidateRunnableScheduled", null);
        setField(term350914, term350914.getClass(), "focusInputMap", null);
        setField(term350914, term350914.getClass(), "ancestorInputMap", null);
        setField(term350914, term350914.getClass(), "windowInputMap", null);
        setField(term350914, term350914.getClass(), "actionMap", null);
        setField(term350914, term350914.getClass(), "aaHint", null);
        setField(term350914, term350914.getClass(), "lcdRenderingHint", null);
        setField(term350914, term350914.getClass(), "component", null);
        setField(term350914, term350914.getClass(), "layoutMgr", null);
        setField(term350914, term350914.getClass(), "dispatcher", null);
        setField(term350914, term350914.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term350914, term350914.getClass(), "focusCycleRoot", false);
        setBooleanField(term350914, term350914.getClass(), "focusTraversalPolicyProvider", false);
        setField(term350914, term350914.getClass(), "printingThreads", null);
        setBooleanField(term350914, term350914.getClass(), "printing", false);
        setField(term350914, term350914.getClass(), "containerListener", null);
        setIntField(term350914, term350914.getClass(), "listeningChildren", 0);
        setIntField(term350914, term350914.getClass(), "listeningBoundsChildren", 0);
        setIntField(term350914, term350914.getClass(), "descendantsCount", 0);
        setField(term350914, term350914.getClass(), "preserveBackgroundColor", null);
        setIntField(term350914, term350914.getClass(), "numOfHWComponents", 0);
        setIntField(term350914, term350914.getClass(), "numOfLWComponents", 0);
        setField(term350914, term350914.getClass(), "modalComp", null);
        setField(term350914, term350914.getClass(), "modalAppContext", null);
        setIntField(term350914, term350914.getClass(), "containerSerializedDataVersion", 0);
        setField(term350914, term350914.getClass(), "peer", null);
        setField(term350914, term350914.getClass(), "parent", null);
        setField(term350914, term350914.getClass(), "appContext", null);
        setIntField(term350914, term350914.getClass(), "x", 0);
        setIntField(term350914, term350914.getClass(), "y", 0);
        setIntField(term350914, term350914.getClass(), "width", 0);
        setIntField(term350914, term350914.getClass(), "height", 0);
        setField(term350914, term350914.getClass(), "foreground", null);
        setField(term350914, term350914.getClass(), "background", null);
        setField(term350914, term350914.getClass(), "font", null);
        setField(term350914, term350914.getClass(), "peerFont", null);
        setField(term350914, term350914.getClass(), "cursor", null);
        setField(term350914, term350914.getClass(), "locale", null);
        setField(term350914, term350914.getClass(), "graphicsConfig", null);
        setField(term350914, term350914.getClass(), "bufferStrategy", null);
        setBooleanField(term350914, term350914.getClass(), "ignoreRepaint", false);
        setBooleanField(term350914, term350914.getClass(), "visible", false);
        setBooleanField(term350914, term350914.getClass(), "enabled", false);
        setBooleanField(term350914, term350914.getClass(), "valid", false);
        setField(term350914, term350914.getClass(), "dropTarget", null);
        setField(term350914, term350914.getClass(), "popups", null);
        setField(term350914, term350914.getClass(), "name", null);
        setBooleanField(term350914, term350914.getClass(), "nameExplicitlySet", false);
        setBooleanField(term350914, term350914.getClass(), "focusable", false);
        setIntField(term350914, term350914.getClass(), "isFocusTraversableOverridden", 0);
        setField(term350914, term350914.getClass(), "focusTraversalKeys", null);
        setBooleanField(term350914, term350914.getClass(), "focusTraversalKeysEnabled", false);
        setField(term350914, term350914.getClass(), "acc", null);
        setField(term350914, term350914.getClass(), "minSize", null);
        setBooleanField(term350914, term350914.getClass(), "minSizeSet", false);
        setField(term350914, term350914.getClass(), "prefSize", null);
        setBooleanField(term350914, term350914.getClass(), "prefSizeSet", false);
        setField(term350914, term350914.getClass(), "maxSize", null);
        setBooleanField(term350914, term350914.getClass(), "maxSizeSet", false);
        setField(term350914, term350914.getClass(), "componentOrientation", null);
        setBooleanField(term350914, term350914.getClass(), "newEventsOnly", false);
        setField(term350914, term350914.getClass(), "componentListener", null);
        setField(term350914, term350914.getClass(), "focusListener", null);
        setField(term350914, term350914.getClass(), "hierarchyListener", null);
        setField(term350914, term350914.getClass(), "hierarchyBoundsListener", null);
        setField(term350914, term350914.getClass(), "keyListener", null);
        setField(term350914, term350914.getClass(), "mouseListener", null);
        setField(term350914, term350914.getClass(), "mouseMotionListener", null);
        setField(term350914, term350914.getClass(), "mouseWheelListener", null);
        setField(term350914, term350914.getClass(), "inputMethodListener", null);
        setLongField(term350914, term350914.getClass(), "eventMask", 0L);
        setField(term350914, term350914.getClass(), "changeSupport", null);
        setField(term350914, term350914.getClass(), "objectLock", null);
        setBooleanField(term350914, term350914.getClass(), "isPacked", false);
        setIntField(term350914, term350914.getClass(), "boundsOp", 0);
        setField(term350914, term350914.getClass(), "compoundShape", null);
        setField(term350914, term350914.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term350914, term350914.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term350914, term350914.getClass(), "backgroundEraseDisabled", false);
        setField(term350914, term350914.getClass(), "eventCache", null);
        setBooleanField(term350914, term350914.getClass(), "coalescingEnabled", false);
        setBooleanField(term350914, term350914.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term350914, term350914.getClass(), "componentSerializedDataVersion", 0);
        setField(term350914, term350914.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$5");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setToolTipText", argTypes, term350914, args);
    }

};


