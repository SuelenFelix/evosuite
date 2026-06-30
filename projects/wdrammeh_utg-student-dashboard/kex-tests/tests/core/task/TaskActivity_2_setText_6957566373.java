package core.task;

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
import static core.task.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TaskActivity_2_setText_6957566373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90715;

    public TaskActivity_2_setText_6957566373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90715 = newInstance(Class.forName("core.task.TaskActivity$2"));
        setField(term90715, term90715.getClass(), "val$numberLabel", null);
        setField(term90715, term90715.getClass(), "this$0", null);
        setField(term90715, term90715.getClass(), "initialTip", null);
        setField(term90715, term90715.getClass(), "model", null);
        setField(term90715, term90715.getClass(), "text", null);
        setField(term90715, term90715.getClass(), "margin", null);
        setField(term90715, term90715.getClass(), "defaultMargin", null);
        setField(term90715, term90715.getClass(), "defaultIcon", null);
        setField(term90715, term90715.getClass(), "pressedIcon", null);
        setField(term90715, term90715.getClass(), "disabledIcon", null);
        setField(term90715, term90715.getClass(), "selectedIcon", null);
        setField(term90715, term90715.getClass(), "disabledSelectedIcon", null);
        setField(term90715, term90715.getClass(), "rolloverIcon", null);
        setField(term90715, term90715.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term90715, term90715.getClass(), "paintBorder", false);
        setBooleanField(term90715, term90715.getClass(), "paintFocus", false);
        setBooleanField(term90715, term90715.getClass(), "rolloverEnabled", false);
        setBooleanField(term90715, term90715.getClass(), "contentAreaFilled", false);
        setIntField(term90715, term90715.getClass(), "verticalAlignment", 0);
        setIntField(term90715, term90715.getClass(), "horizontalAlignment", 0);
        setIntField(term90715, term90715.getClass(), "verticalTextPosition", 0);
        setIntField(term90715, term90715.getClass(), "horizontalTextPosition", 0);
        setIntField(term90715, term90715.getClass(), "iconTextGap", 0);
        setIntField(term90715, term90715.getClass(), "mnemonic", 0);
        setIntField(term90715, term90715.getClass(), "mnemonicIndex", 0);
        setLongField(term90715, term90715.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term90715, term90715.getClass(), "borderPaintedSet", false);
        setBooleanField(term90715, term90715.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term90715, term90715.getClass(), "iconTextGapSet", false);
        setBooleanField(term90715, term90715.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term90715, term90715.getClass(), "setLayout", false);
        setBooleanField(term90715, term90715.getClass(), "defaultCapable", false);
        setField(term90715, term90715.getClass(), "handler", null);
        setField(term90715, term90715.getClass(), "changeListener", null);
        setField(term90715, term90715.getClass(), "actionListener", null);
        setField(term90715, term90715.getClass(), "itemListener", null);
        setField(term90715, term90715.getClass(), "changeEvent", null);
        setBooleanField(term90715, term90715.getClass(), "hideActionText", false);
        setField(term90715, term90715.getClass(), "action", null);
        setField(term90715, term90715.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term90715, term90715.getClass(), "isAlignmentXSet", false);
        setFloatField(term90715, term90715.getClass(), "alignmentX", 0.0F);
        setBooleanField(term90715, term90715.getClass(), "isAlignmentYSet", false);
        setFloatField(term90715, term90715.getClass(), "alignmentY", 0.0F);
        setField(term90715, term90715.getClass(), "ui", null);
        setField(term90715, term90715.getClass(), "listenerList", null);
        setField(term90715, term90715.getClass(), "clientProperties", null);
        setField(term90715, term90715.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term90715, term90715.getClass(), "autoscrolls", false);
        setField(term90715, term90715.getClass(), "border", null);
        setIntField(term90715, term90715.getClass(), "flags", 0);
        setField(term90715, term90715.getClass(), "inputVerifier", null);
        setBooleanField(term90715, term90715.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term90715, term90715.getClass(), "paintingChild", null);
        setField(term90715, term90715.getClass(), "popupMenu", null);
        setField(term90715, term90715.getClass(), "revalidateRunnableScheduled", null);
        setField(term90715, term90715.getClass(), "focusInputMap", null);
        setField(term90715, term90715.getClass(), "ancestorInputMap", null);
        setField(term90715, term90715.getClass(), "windowInputMap", null);
        setField(term90715, term90715.getClass(), "actionMap", null);
        setField(term90715, term90715.getClass(), "aaHint", null);
        setField(term90715, term90715.getClass(), "lcdRenderingHint", null);
        setField(term90715, term90715.getClass(), "component", null);
        setField(term90715, term90715.getClass(), "layoutMgr", null);
        setField(term90715, term90715.getClass(), "dispatcher", null);
        setField(term90715, term90715.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term90715, term90715.getClass(), "focusCycleRoot", false);
        setBooleanField(term90715, term90715.getClass(), "focusTraversalPolicyProvider", false);
        setField(term90715, term90715.getClass(), "printingThreads", null);
        setBooleanField(term90715, term90715.getClass(), "printing", false);
        setField(term90715, term90715.getClass(), "containerListener", null);
        setIntField(term90715, term90715.getClass(), "listeningChildren", 0);
        setIntField(term90715, term90715.getClass(), "listeningBoundsChildren", 0);
        setIntField(term90715, term90715.getClass(), "descendantsCount", 0);
        setField(term90715, term90715.getClass(), "preserveBackgroundColor", null);
        setIntField(term90715, term90715.getClass(), "numOfHWComponents", 0);
        setIntField(term90715, term90715.getClass(), "numOfLWComponents", 0);
        setField(term90715, term90715.getClass(), "modalComp", null);
        setField(term90715, term90715.getClass(), "modalAppContext", null);
        setIntField(term90715, term90715.getClass(), "containerSerializedDataVersion", 0);
        setField(term90715, term90715.getClass(), "peer", null);
        setField(term90715, term90715.getClass(), "parent", null);
        setField(term90715, term90715.getClass(), "appContext", null);
        setIntField(term90715, term90715.getClass(), "x", 0);
        setIntField(term90715, term90715.getClass(), "y", 0);
        setIntField(term90715, term90715.getClass(), "width", 0);
        setIntField(term90715, term90715.getClass(), "height", 0);
        setField(term90715, term90715.getClass(), "foreground", null);
        setField(term90715, term90715.getClass(), "background", null);
        setField(term90715, term90715.getClass(), "font", null);
        setField(term90715, term90715.getClass(), "peerFont", null);
        setField(term90715, term90715.getClass(), "cursor", null);
        setField(term90715, term90715.getClass(), "locale", null);
        setField(term90715, term90715.getClass(), "graphicsConfig", null);
        setField(term90715, term90715.getClass(), "bufferStrategy", null);
        setBooleanField(term90715, term90715.getClass(), "ignoreRepaint", false);
        setBooleanField(term90715, term90715.getClass(), "visible", false);
        setBooleanField(term90715, term90715.getClass(), "enabled", false);
        setBooleanField(term90715, term90715.getClass(), "valid", false);
        setField(term90715, term90715.getClass(), "dropTarget", null);
        setField(term90715, term90715.getClass(), "popups", null);
        setField(term90715, term90715.getClass(), "name", null);
        setBooleanField(term90715, term90715.getClass(), "nameExplicitlySet", false);
        setBooleanField(term90715, term90715.getClass(), "focusable", false);
        setIntField(term90715, term90715.getClass(), "isFocusTraversableOverridden", 0);
        setField(term90715, term90715.getClass(), "focusTraversalKeys", null);
        setBooleanField(term90715, term90715.getClass(), "focusTraversalKeysEnabled", false);
        setField(term90715, term90715.getClass(), "acc", null);
        setField(term90715, term90715.getClass(), "minSize", null);
        setBooleanField(term90715, term90715.getClass(), "minSizeSet", false);
        setField(term90715, term90715.getClass(), "prefSize", null);
        setBooleanField(term90715, term90715.getClass(), "prefSizeSet", false);
        setField(term90715, term90715.getClass(), "maxSize", null);
        setBooleanField(term90715, term90715.getClass(), "maxSizeSet", false);
        setField(term90715, term90715.getClass(), "componentOrientation", null);
        setBooleanField(term90715, term90715.getClass(), "newEventsOnly", false);
        setField(term90715, term90715.getClass(), "componentListener", null);
        setField(term90715, term90715.getClass(), "focusListener", null);
        setField(term90715, term90715.getClass(), "hierarchyListener", null);
        setField(term90715, term90715.getClass(), "hierarchyBoundsListener", null);
        setField(term90715, term90715.getClass(), "keyListener", null);
        setField(term90715, term90715.getClass(), "mouseListener", null);
        setField(term90715, term90715.getClass(), "mouseMotionListener", null);
        setField(term90715, term90715.getClass(), "mouseWheelListener", null);
        setField(term90715, term90715.getClass(), "inputMethodListener", null);
        setLongField(term90715, term90715.getClass(), "eventMask", 0L);
        setField(term90715, term90715.getClass(), "changeSupport", null);
        setField(term90715, term90715.getClass(), "objectLock", null);
        setBooleanField(term90715, term90715.getClass(), "isPacked", false);
        setIntField(term90715, term90715.getClass(), "boundsOp", 0);
        setField(term90715, term90715.getClass(), "compoundShape", null);
        setField(term90715, term90715.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term90715, term90715.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term90715, term90715.getClass(), "backgroundEraseDisabled", false);
        setField(term90715, term90715.getClass(), "eventCache", null);
        setBooleanField(term90715, term90715.getClass(), "coalescingEnabled", false);
        setBooleanField(term90715, term90715.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term90715, term90715.getClass(), "componentSerializedDataVersion", 0);
        setField(term90715, term90715.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.TaskActivity$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term90715, args);
    }

};


