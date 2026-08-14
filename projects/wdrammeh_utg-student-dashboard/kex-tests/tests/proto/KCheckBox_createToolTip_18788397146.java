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

public class KCheckBox_createToolTip_18788397146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57384;

    public KCheckBox_createToolTip_18788397146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57384 = newInstance(Class.forName("proto.KCheckBox"));
        setBooleanField(term57384, term57384.getClass(), "flat", false);
        setField(term57384, term57384.getClass(), "model", null);
        setField(term57384, term57384.getClass(), "text", null);
        setField(term57384, term57384.getClass(), "margin", null);
        setField(term57384, term57384.getClass(), "defaultMargin", null);
        setField(term57384, term57384.getClass(), "defaultIcon", null);
        setField(term57384, term57384.getClass(), "pressedIcon", null);
        setField(term57384, term57384.getClass(), "disabledIcon", null);
        setField(term57384, term57384.getClass(), "selectedIcon", null);
        setField(term57384, term57384.getClass(), "disabledSelectedIcon", null);
        setField(term57384, term57384.getClass(), "rolloverIcon", null);
        setField(term57384, term57384.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term57384, term57384.getClass(), "paintBorder", false);
        setBooleanField(term57384, term57384.getClass(), "paintFocus", false);
        setBooleanField(term57384, term57384.getClass(), "rolloverEnabled", false);
        setBooleanField(term57384, term57384.getClass(), "contentAreaFilled", false);
        setIntField(term57384, term57384.getClass(), "verticalAlignment", 0);
        setIntField(term57384, term57384.getClass(), "horizontalAlignment", 0);
        setIntField(term57384, term57384.getClass(), "verticalTextPosition", 0);
        setIntField(term57384, term57384.getClass(), "horizontalTextPosition", 0);
        setIntField(term57384, term57384.getClass(), "iconTextGap", 0);
        setIntField(term57384, term57384.getClass(), "mnemonic", 0);
        setIntField(term57384, term57384.getClass(), "mnemonicIndex", 0);
        setLongField(term57384, term57384.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term57384, term57384.getClass(), "borderPaintedSet", false);
        setBooleanField(term57384, term57384.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term57384, term57384.getClass(), "iconTextGapSet", false);
        setBooleanField(term57384, term57384.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term57384, term57384.getClass(), "setLayout", false);
        setBooleanField(term57384, term57384.getClass(), "defaultCapable", false);
        setField(term57384, term57384.getClass(), "handler", null);
        setField(term57384, term57384.getClass(), "changeListener", null);
        setField(term57384, term57384.getClass(), "actionListener", null);
        setField(term57384, term57384.getClass(), "itemListener", null);
        setField(term57384, term57384.getClass(), "changeEvent", null);
        setBooleanField(term57384, term57384.getClass(), "hideActionText", false);
        setField(term57384, term57384.getClass(), "action", null);
        setField(term57384, term57384.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term57384, term57384.getClass(), "isAlignmentXSet", false);
        setFloatField(term57384, term57384.getClass(), "alignmentX", 0.0F);
        setBooleanField(term57384, term57384.getClass(), "isAlignmentYSet", false);
        setFloatField(term57384, term57384.getClass(), "alignmentY", 0.0F);
        setField(term57384, term57384.getClass(), "ui", null);
        setField(term57384, term57384.getClass(), "listenerList", null);
        setField(term57384, term57384.getClass(), "clientProperties", null);
        setField(term57384, term57384.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term57384, term57384.getClass(), "autoscrolls", false);
        setField(term57384, term57384.getClass(), "border", null);
        setIntField(term57384, term57384.getClass(), "flags", 0);
        setField(term57384, term57384.getClass(), "inputVerifier", null);
        setBooleanField(term57384, term57384.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term57384, term57384.getClass(), "paintingChild", null);
        setField(term57384, term57384.getClass(), "popupMenu", null);
        setField(term57384, term57384.getClass(), "revalidateRunnableScheduled", null);
        setField(term57384, term57384.getClass(), "focusInputMap", null);
        setField(term57384, term57384.getClass(), "ancestorInputMap", null);
        setField(term57384, term57384.getClass(), "windowInputMap", null);
        setField(term57384, term57384.getClass(), "actionMap", null);
        setField(term57384, term57384.getClass(), "aaHint", null);
        setField(term57384, term57384.getClass(), "lcdRenderingHint", null);
        setField(term57384, term57384.getClass(), "component", null);
        setField(term57384, term57384.getClass(), "layoutMgr", null);
        setField(term57384, term57384.getClass(), "dispatcher", null);
        setField(term57384, term57384.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57384, term57384.getClass(), "focusCycleRoot", false);
        setBooleanField(term57384, term57384.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57384, term57384.getClass(), "printingThreads", null);
        setBooleanField(term57384, term57384.getClass(), "printing", false);
        setField(term57384, term57384.getClass(), "containerListener", null);
        setIntField(term57384, term57384.getClass(), "listeningChildren", 0);
        setIntField(term57384, term57384.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57384, term57384.getClass(), "descendantsCount", 0);
        setField(term57384, term57384.getClass(), "preserveBackgroundColor", null);
        setIntField(term57384, term57384.getClass(), "numOfHWComponents", 0);
        setIntField(term57384, term57384.getClass(), "numOfLWComponents", 0);
        setField(term57384, term57384.getClass(), "modalComp", null);
        setField(term57384, term57384.getClass(), "modalAppContext", null);
        setIntField(term57384, term57384.getClass(), "containerSerializedDataVersion", 0);
        setField(term57384, term57384.getClass(), "peer", null);
        setField(term57384, term57384.getClass(), "parent", null);
        setField(term57384, term57384.getClass(), "appContext", null);
        setIntField(term57384, term57384.getClass(), "x", 0);
        setIntField(term57384, term57384.getClass(), "y", 0);
        setIntField(term57384, term57384.getClass(), "width", 0);
        setIntField(term57384, term57384.getClass(), "height", 0);
        setField(term57384, term57384.getClass(), "foreground", null);
        setField(term57384, term57384.getClass(), "background", null);
        setField(term57384, term57384.getClass(), "font", null);
        setField(term57384, term57384.getClass(), "peerFont", null);
        setField(term57384, term57384.getClass(), "cursor", null);
        setField(term57384, term57384.getClass(), "locale", null);
        setField(term57384, term57384.getClass(), "graphicsConfig", null);
        setField(term57384, term57384.getClass(), "bufferStrategy", null);
        setBooleanField(term57384, term57384.getClass(), "ignoreRepaint", false);
        setBooleanField(term57384, term57384.getClass(), "visible", false);
        setBooleanField(term57384, term57384.getClass(), "enabled", false);
        setBooleanField(term57384, term57384.getClass(), "valid", false);
        setField(term57384, term57384.getClass(), "dropTarget", null);
        setField(term57384, term57384.getClass(), "popups", null);
        setField(term57384, term57384.getClass(), "name", null);
        setBooleanField(term57384, term57384.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57384, term57384.getClass(), "focusable", false);
        setIntField(term57384, term57384.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57384, term57384.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57384, term57384.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57384, term57384.getClass(), "acc", null);
        setField(term57384, term57384.getClass(), "minSize", null);
        setBooleanField(term57384, term57384.getClass(), "minSizeSet", false);
        setField(term57384, term57384.getClass(), "prefSize", null);
        setBooleanField(term57384, term57384.getClass(), "prefSizeSet", false);
        setField(term57384, term57384.getClass(), "maxSize", null);
        setBooleanField(term57384, term57384.getClass(), "maxSizeSet", false);
        setField(term57384, term57384.getClass(), "componentOrientation", null);
        setBooleanField(term57384, term57384.getClass(), "newEventsOnly", false);
        setField(term57384, term57384.getClass(), "componentListener", null);
        setField(term57384, term57384.getClass(), "focusListener", null);
        setField(term57384, term57384.getClass(), "hierarchyListener", null);
        setField(term57384, term57384.getClass(), "hierarchyBoundsListener", null);
        setField(term57384, term57384.getClass(), "keyListener", null);
        setField(term57384, term57384.getClass(), "mouseListener", null);
        setField(term57384, term57384.getClass(), "mouseMotionListener", null);
        setField(term57384, term57384.getClass(), "mouseWheelListener", null);
        setField(term57384, term57384.getClass(), "inputMethodListener", null);
        setLongField(term57384, term57384.getClass(), "eventMask", 0L);
        setField(term57384, term57384.getClass(), "changeSupport", null);
        setField(term57384, term57384.getClass(), "objectLock", null);
        setBooleanField(term57384, term57384.getClass(), "isPacked", false);
        setIntField(term57384, term57384.getClass(), "boundsOp", 0);
        setField(term57384, term57384.getClass(), "compoundShape", null);
        setField(term57384, term57384.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57384, term57384.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57384, term57384.getClass(), "backgroundEraseDisabled", false);
        setField(term57384, term57384.getClass(), "eventCache", null);
        setBooleanField(term57384, term57384.getClass(), "coalescingEnabled", false);
        setBooleanField(term57384, term57384.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57384, term57384.getClass(), "componentSerializedDataVersion", 0);
        setField(term57384, term57384.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term57384, args);
    }

};


