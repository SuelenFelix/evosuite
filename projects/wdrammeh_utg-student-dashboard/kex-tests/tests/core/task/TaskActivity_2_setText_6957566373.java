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
     Object term186388;

    public TaskActivity_2_setText_6957566373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186388 = newInstance(Class.forName("core.task.TaskActivity$2"));
        setField(term186388, term186388.getClass(), "val$numberLabel", null);
        setField(term186388, term186388.getClass(), "this$0", null);
        setField(term186388, term186388.getClass(), "initialTip", null);
        setField(term186388, term186388.getClass(), "model", null);
        setField(term186388, term186388.getClass(), "text", null);
        setField(term186388, term186388.getClass(), "margin", null);
        setField(term186388, term186388.getClass(), "defaultMargin", null);
        setField(term186388, term186388.getClass(), "defaultIcon", null);
        setField(term186388, term186388.getClass(), "pressedIcon", null);
        setField(term186388, term186388.getClass(), "disabledIcon", null);
        setField(term186388, term186388.getClass(), "selectedIcon", null);
        setField(term186388, term186388.getClass(), "disabledSelectedIcon", null);
        setField(term186388, term186388.getClass(), "rolloverIcon", null);
        setField(term186388, term186388.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term186388, term186388.getClass(), "paintBorder", false);
        setBooleanField(term186388, term186388.getClass(), "paintFocus", false);
        setBooleanField(term186388, term186388.getClass(), "rolloverEnabled", false);
        setBooleanField(term186388, term186388.getClass(), "contentAreaFilled", false);
        setIntField(term186388, term186388.getClass(), "verticalAlignment", 0);
        setIntField(term186388, term186388.getClass(), "horizontalAlignment", 0);
        setIntField(term186388, term186388.getClass(), "verticalTextPosition", 0);
        setIntField(term186388, term186388.getClass(), "horizontalTextPosition", 0);
        setIntField(term186388, term186388.getClass(), "iconTextGap", 0);
        setIntField(term186388, term186388.getClass(), "mnemonic", 0);
        setIntField(term186388, term186388.getClass(), "mnemonicIndex", 0);
        setLongField(term186388, term186388.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term186388, term186388.getClass(), "borderPaintedSet", false);
        setBooleanField(term186388, term186388.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term186388, term186388.getClass(), "iconTextGapSet", false);
        setBooleanField(term186388, term186388.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term186388, term186388.getClass(), "setLayout", false);
        setBooleanField(term186388, term186388.getClass(), "defaultCapable", false);
        setField(term186388, term186388.getClass(), "handler", null);
        setField(term186388, term186388.getClass(), "changeListener", null);
        setField(term186388, term186388.getClass(), "actionListener", null);
        setField(term186388, term186388.getClass(), "itemListener", null);
        setField(term186388, term186388.getClass(), "changeEvent", null);
        setBooleanField(term186388, term186388.getClass(), "hideActionText", false);
        setField(term186388, term186388.getClass(), "action", null);
        setField(term186388, term186388.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term186388, term186388.getClass(), "isAlignmentXSet", false);
        setFloatField(term186388, term186388.getClass(), "alignmentX", 0.0F);
        setBooleanField(term186388, term186388.getClass(), "isAlignmentYSet", false);
        setFloatField(term186388, term186388.getClass(), "alignmentY", 0.0F);
        setField(term186388, term186388.getClass(), "ui", null);
        setField(term186388, term186388.getClass(), "listenerList", null);
        setField(term186388, term186388.getClass(), "clientProperties", null);
        setField(term186388, term186388.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term186388, term186388.getClass(), "autoscrolls", false);
        setField(term186388, term186388.getClass(), "border", null);
        setIntField(term186388, term186388.getClass(), "flags", 0);
        setField(term186388, term186388.getClass(), "inputVerifier", null);
        setBooleanField(term186388, term186388.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term186388, term186388.getClass(), "paintingChild", null);
        setField(term186388, term186388.getClass(), "popupMenu", null);
        setField(term186388, term186388.getClass(), "revalidateRunnableScheduled", null);
        setField(term186388, term186388.getClass(), "focusInputMap", null);
        setField(term186388, term186388.getClass(), "ancestorInputMap", null);
        setField(term186388, term186388.getClass(), "windowInputMap", null);
        setField(term186388, term186388.getClass(), "actionMap", null);
        setField(term186388, term186388.getClass(), "aaHint", null);
        setField(term186388, term186388.getClass(), "lcdRenderingHint", null);
        setField(term186388, term186388.getClass(), "component", null);
        setField(term186388, term186388.getClass(), "layoutMgr", null);
        setField(term186388, term186388.getClass(), "dispatcher", null);
        setField(term186388, term186388.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term186388, term186388.getClass(), "focusCycleRoot", false);
        setBooleanField(term186388, term186388.getClass(), "focusTraversalPolicyProvider", false);
        setField(term186388, term186388.getClass(), "printingThreads", null);
        setBooleanField(term186388, term186388.getClass(), "printing", false);
        setField(term186388, term186388.getClass(), "containerListener", null);
        setIntField(term186388, term186388.getClass(), "listeningChildren", 0);
        setIntField(term186388, term186388.getClass(), "listeningBoundsChildren", 0);
        setIntField(term186388, term186388.getClass(), "descendantsCount", 0);
        setField(term186388, term186388.getClass(), "preserveBackgroundColor", null);
        setIntField(term186388, term186388.getClass(), "numOfHWComponents", 0);
        setIntField(term186388, term186388.getClass(), "numOfLWComponents", 0);
        setField(term186388, term186388.getClass(), "modalComp", null);
        setField(term186388, term186388.getClass(), "modalAppContext", null);
        setIntField(term186388, term186388.getClass(), "containerSerializedDataVersion", 0);
        setField(term186388, term186388.getClass(), "peer", null);
        setField(term186388, term186388.getClass(), "parent", null);
        setField(term186388, term186388.getClass(), "appContext", null);
        setIntField(term186388, term186388.getClass(), "x", 0);
        setIntField(term186388, term186388.getClass(), "y", 0);
        setIntField(term186388, term186388.getClass(), "width", 0);
        setIntField(term186388, term186388.getClass(), "height", 0);
        setField(term186388, term186388.getClass(), "foreground", null);
        setField(term186388, term186388.getClass(), "background", null);
        setField(term186388, term186388.getClass(), "font", null);
        setField(term186388, term186388.getClass(), "peerFont", null);
        setField(term186388, term186388.getClass(), "cursor", null);
        setField(term186388, term186388.getClass(), "locale", null);
        setField(term186388, term186388.getClass(), "graphicsConfig", null);
        setField(term186388, term186388.getClass(), "bufferStrategy", null);
        setBooleanField(term186388, term186388.getClass(), "ignoreRepaint", false);
        setBooleanField(term186388, term186388.getClass(), "visible", false);
        setBooleanField(term186388, term186388.getClass(), "enabled", false);
        setBooleanField(term186388, term186388.getClass(), "valid", false);
        setField(term186388, term186388.getClass(), "dropTarget", null);
        setField(term186388, term186388.getClass(), "popups", null);
        setField(term186388, term186388.getClass(), "name", null);
        setBooleanField(term186388, term186388.getClass(), "nameExplicitlySet", false);
        setBooleanField(term186388, term186388.getClass(), "focusable", false);
        setIntField(term186388, term186388.getClass(), "isFocusTraversableOverridden", 0);
        setField(term186388, term186388.getClass(), "focusTraversalKeys", null);
        setBooleanField(term186388, term186388.getClass(), "focusTraversalKeysEnabled", false);
        setField(term186388, term186388.getClass(), "acc", null);
        setField(term186388, term186388.getClass(), "minSize", null);
        setBooleanField(term186388, term186388.getClass(), "minSizeSet", false);
        setField(term186388, term186388.getClass(), "prefSize", null);
        setBooleanField(term186388, term186388.getClass(), "prefSizeSet", false);
        setField(term186388, term186388.getClass(), "maxSize", null);
        setBooleanField(term186388, term186388.getClass(), "maxSizeSet", false);
        setField(term186388, term186388.getClass(), "componentOrientation", null);
        setBooleanField(term186388, term186388.getClass(), "newEventsOnly", false);
        setField(term186388, term186388.getClass(), "componentListener", null);
        setField(term186388, term186388.getClass(), "focusListener", null);
        setField(term186388, term186388.getClass(), "hierarchyListener", null);
        setField(term186388, term186388.getClass(), "hierarchyBoundsListener", null);
        setField(term186388, term186388.getClass(), "keyListener", null);
        setField(term186388, term186388.getClass(), "mouseListener", null);
        setField(term186388, term186388.getClass(), "mouseMotionListener", null);
        setField(term186388, term186388.getClass(), "mouseWheelListener", null);
        setField(term186388, term186388.getClass(), "inputMethodListener", null);
        setLongField(term186388, term186388.getClass(), "eventMask", 0L);
        setField(term186388, term186388.getClass(), "changeSupport", null);
        setField(term186388, term186388.getClass(), "objectLock", null);
        setBooleanField(term186388, term186388.getClass(), "isPacked", false);
        setIntField(term186388, term186388.getClass(), "boundsOp", 0);
        setField(term186388, term186388.getClass(), "compoundShape", null);
        setField(term186388, term186388.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term186388, term186388.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term186388, term186388.getClass(), "backgroundEraseDisabled", false);
        setField(term186388, term186388.getClass(), "eventCache", null);
        setBooleanField(term186388, term186388.getClass(), "coalescingEnabled", false);
        setBooleanField(term186388, term186388.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term186388, term186388.getClass(), "componentSerializedDataVersion", 0);
        setField(term186388, term186388.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.TaskActivity$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term186388, args);
    }

};


