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
     Object term350906;

    public Board_5_setToolTipText_6792895593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350906 = newInstance(Class.forName("core.Board$5"));
        setField(term350906, term350906.getClass(), "this$0", null);
        setField(term350906, term350906.getClass(), "initialTip", null);
        setField(term350906, term350906.getClass(), "model", null);
        setField(term350906, term350906.getClass(), "text", null);
        setField(term350906, term350906.getClass(), "margin", null);
        setField(term350906, term350906.getClass(), "defaultMargin", null);
        setField(term350906, term350906.getClass(), "defaultIcon", null);
        setField(term350906, term350906.getClass(), "pressedIcon", null);
        setField(term350906, term350906.getClass(), "disabledIcon", null);
        setField(term350906, term350906.getClass(), "selectedIcon", null);
        setField(term350906, term350906.getClass(), "disabledSelectedIcon", null);
        setField(term350906, term350906.getClass(), "rolloverIcon", null);
        setField(term350906, term350906.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term350906, term350906.getClass(), "paintBorder", false);
        setBooleanField(term350906, term350906.getClass(), "paintFocus", false);
        setBooleanField(term350906, term350906.getClass(), "rolloverEnabled", false);
        setBooleanField(term350906, term350906.getClass(), "contentAreaFilled", false);
        setIntField(term350906, term350906.getClass(), "verticalAlignment", 0);
        setIntField(term350906, term350906.getClass(), "horizontalAlignment", 0);
        setIntField(term350906, term350906.getClass(), "verticalTextPosition", 0);
        setIntField(term350906, term350906.getClass(), "horizontalTextPosition", 0);
        setIntField(term350906, term350906.getClass(), "iconTextGap", 0);
        setIntField(term350906, term350906.getClass(), "mnemonic", 0);
        setIntField(term350906, term350906.getClass(), "mnemonicIndex", 0);
        setLongField(term350906, term350906.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term350906, term350906.getClass(), "borderPaintedSet", false);
        setBooleanField(term350906, term350906.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term350906, term350906.getClass(), "iconTextGapSet", false);
        setBooleanField(term350906, term350906.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term350906, term350906.getClass(), "setLayout", false);
        setBooleanField(term350906, term350906.getClass(), "defaultCapable", false);
        setField(term350906, term350906.getClass(), "handler", null);
        setField(term350906, term350906.getClass(), "changeListener", null);
        setField(term350906, term350906.getClass(), "actionListener", null);
        setField(term350906, term350906.getClass(), "itemListener", null);
        setField(term350906, term350906.getClass(), "changeEvent", null);
        setBooleanField(term350906, term350906.getClass(), "hideActionText", false);
        setField(term350906, term350906.getClass(), "action", null);
        setField(term350906, term350906.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term350906, term350906.getClass(), "isAlignmentXSet", false);
        setFloatField(term350906, term350906.getClass(), "alignmentX", 0.0F);
        setBooleanField(term350906, term350906.getClass(), "isAlignmentYSet", false);
        setFloatField(term350906, term350906.getClass(), "alignmentY", 0.0F);
        setField(term350906, term350906.getClass(), "ui", null);
        setField(term350906, term350906.getClass(), "listenerList", null);
        setField(term350906, term350906.getClass(), "clientProperties", null);
        setField(term350906, term350906.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term350906, term350906.getClass(), "autoscrolls", false);
        setField(term350906, term350906.getClass(), "border", null);
        setIntField(term350906, term350906.getClass(), "flags", 0);
        setField(term350906, term350906.getClass(), "inputVerifier", null);
        setBooleanField(term350906, term350906.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term350906, term350906.getClass(), "paintingChild", null);
        setField(term350906, term350906.getClass(), "popupMenu", null);
        setField(term350906, term350906.getClass(), "revalidateRunnableScheduled", null);
        setField(term350906, term350906.getClass(), "focusInputMap", null);
        setField(term350906, term350906.getClass(), "ancestorInputMap", null);
        setField(term350906, term350906.getClass(), "windowInputMap", null);
        setField(term350906, term350906.getClass(), "actionMap", null);
        setField(term350906, term350906.getClass(), "aaHint", null);
        setField(term350906, term350906.getClass(), "lcdRenderingHint", null);
        setField(term350906, term350906.getClass(), "component", null);
        setField(term350906, term350906.getClass(), "layoutMgr", null);
        setField(term350906, term350906.getClass(), "dispatcher", null);
        setField(term350906, term350906.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term350906, term350906.getClass(), "focusCycleRoot", false);
        setBooleanField(term350906, term350906.getClass(), "focusTraversalPolicyProvider", false);
        setField(term350906, term350906.getClass(), "printingThreads", null);
        setBooleanField(term350906, term350906.getClass(), "printing", false);
        setField(term350906, term350906.getClass(), "containerListener", null);
        setIntField(term350906, term350906.getClass(), "listeningChildren", 0);
        setIntField(term350906, term350906.getClass(), "listeningBoundsChildren", 0);
        setIntField(term350906, term350906.getClass(), "descendantsCount", 0);
        setField(term350906, term350906.getClass(), "preserveBackgroundColor", null);
        setIntField(term350906, term350906.getClass(), "numOfHWComponents", 0);
        setIntField(term350906, term350906.getClass(), "numOfLWComponents", 0);
        setField(term350906, term350906.getClass(), "modalComp", null);
        setField(term350906, term350906.getClass(), "modalAppContext", null);
        setIntField(term350906, term350906.getClass(), "containerSerializedDataVersion", 0);
        setField(term350906, term350906.getClass(), "peer", null);
        setField(term350906, term350906.getClass(), "parent", null);
        setField(term350906, term350906.getClass(), "appContext", null);
        setIntField(term350906, term350906.getClass(), "x", 0);
        setIntField(term350906, term350906.getClass(), "y", 0);
        setIntField(term350906, term350906.getClass(), "width", 0);
        setIntField(term350906, term350906.getClass(), "height", 0);
        setField(term350906, term350906.getClass(), "foreground", null);
        setField(term350906, term350906.getClass(), "background", null);
        setField(term350906, term350906.getClass(), "font", null);
        setField(term350906, term350906.getClass(), "peerFont", null);
        setField(term350906, term350906.getClass(), "cursor", null);
        setField(term350906, term350906.getClass(), "locale", null);
        setField(term350906, term350906.getClass(), "graphicsConfig", null);
        setField(term350906, term350906.getClass(), "bufferStrategy", null);
        setBooleanField(term350906, term350906.getClass(), "ignoreRepaint", false);
        setBooleanField(term350906, term350906.getClass(), "visible", false);
        setBooleanField(term350906, term350906.getClass(), "enabled", false);
        setBooleanField(term350906, term350906.getClass(), "valid", false);
        setField(term350906, term350906.getClass(), "dropTarget", null);
        setField(term350906, term350906.getClass(), "popups", null);
        setField(term350906, term350906.getClass(), "name", null);
        setBooleanField(term350906, term350906.getClass(), "nameExplicitlySet", false);
        setBooleanField(term350906, term350906.getClass(), "focusable", false);
        setIntField(term350906, term350906.getClass(), "isFocusTraversableOverridden", 0);
        setField(term350906, term350906.getClass(), "focusTraversalKeys", null);
        setBooleanField(term350906, term350906.getClass(), "focusTraversalKeysEnabled", false);
        setField(term350906, term350906.getClass(), "acc", null);
        setField(term350906, term350906.getClass(), "minSize", null);
        setBooleanField(term350906, term350906.getClass(), "minSizeSet", false);
        setField(term350906, term350906.getClass(), "prefSize", null);
        setBooleanField(term350906, term350906.getClass(), "prefSizeSet", false);
        setField(term350906, term350906.getClass(), "maxSize", null);
        setBooleanField(term350906, term350906.getClass(), "maxSizeSet", false);
        setField(term350906, term350906.getClass(), "componentOrientation", null);
        setBooleanField(term350906, term350906.getClass(), "newEventsOnly", false);
        setField(term350906, term350906.getClass(), "componentListener", null);
        setField(term350906, term350906.getClass(), "focusListener", null);
        setField(term350906, term350906.getClass(), "hierarchyListener", null);
        setField(term350906, term350906.getClass(), "hierarchyBoundsListener", null);
        setField(term350906, term350906.getClass(), "keyListener", null);
        setField(term350906, term350906.getClass(), "mouseListener", null);
        setField(term350906, term350906.getClass(), "mouseMotionListener", null);
        setField(term350906, term350906.getClass(), "mouseWheelListener", null);
        setField(term350906, term350906.getClass(), "inputMethodListener", null);
        setLongField(term350906, term350906.getClass(), "eventMask", 0L);
        setField(term350906, term350906.getClass(), "changeSupport", null);
        setField(term350906, term350906.getClass(), "objectLock", null);
        setBooleanField(term350906, term350906.getClass(), "isPacked", false);
        setIntField(term350906, term350906.getClass(), "boundsOp", 0);
        setField(term350906, term350906.getClass(), "compoundShape", null);
        setField(term350906, term350906.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term350906, term350906.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term350906, term350906.getClass(), "backgroundEraseDisabled", false);
        setField(term350906, term350906.getClass(), "eventCache", null);
        setBooleanField(term350906, term350906.getClass(), "coalescingEnabled", false);
        setBooleanField(term350906, term350906.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term350906, term350906.getClass(), "componentSerializedDataVersion", 0);
        setField(term350906, term350906.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$5");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setToolTipText", argTypes, term350906, args);
    }

};


