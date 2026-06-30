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

public class KButton_setToolTipText_61356183227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27439;

    public KButton_setToolTipText_61356183227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27439 = newInstance(Class.forName("proto.KButton"));
        setField(term27439, term27439.getClass(), "initialTip", null);
        setField(term27439, term27439.getClass(), "model", null);
        setField(term27439, term27439.getClass(), "text", null);
        setField(term27439, term27439.getClass(), "margin", null);
        setField(term27439, term27439.getClass(), "defaultMargin", null);
        setField(term27439, term27439.getClass(), "defaultIcon", null);
        setField(term27439, term27439.getClass(), "pressedIcon", null);
        setField(term27439, term27439.getClass(), "disabledIcon", null);
        setField(term27439, term27439.getClass(), "selectedIcon", null);
        setField(term27439, term27439.getClass(), "disabledSelectedIcon", null);
        setField(term27439, term27439.getClass(), "rolloverIcon", null);
        setField(term27439, term27439.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27439, term27439.getClass(), "paintBorder", false);
        setBooleanField(term27439, term27439.getClass(), "paintFocus", false);
        setBooleanField(term27439, term27439.getClass(), "rolloverEnabled", false);
        setBooleanField(term27439, term27439.getClass(), "contentAreaFilled", false);
        setIntField(term27439, term27439.getClass(), "verticalAlignment", 0);
        setIntField(term27439, term27439.getClass(), "horizontalAlignment", 0);
        setIntField(term27439, term27439.getClass(), "verticalTextPosition", 0);
        setIntField(term27439, term27439.getClass(), "horizontalTextPosition", 0);
        setIntField(term27439, term27439.getClass(), "iconTextGap", 0);
        setIntField(term27439, term27439.getClass(), "mnemonic", 0);
        setIntField(term27439, term27439.getClass(), "mnemonicIndex", 0);
        setLongField(term27439, term27439.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27439, term27439.getClass(), "borderPaintedSet", false);
        setBooleanField(term27439, term27439.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27439, term27439.getClass(), "iconTextGapSet", false);
        setBooleanField(term27439, term27439.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27439, term27439.getClass(), "setLayout", false);
        setBooleanField(term27439, term27439.getClass(), "defaultCapable", false);
        setField(term27439, term27439.getClass(), "handler", null);
        setField(term27439, term27439.getClass(), "changeListener", null);
        setField(term27439, term27439.getClass(), "actionListener", null);
        setField(term27439, term27439.getClass(), "itemListener", null);
        setField(term27439, term27439.getClass(), "changeEvent", null);
        setBooleanField(term27439, term27439.getClass(), "hideActionText", false);
        setField(term27439, term27439.getClass(), "action", null);
        setField(term27439, term27439.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27439, term27439.getClass(), "isAlignmentXSet", false);
        setFloatField(term27439, term27439.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27439, term27439.getClass(), "isAlignmentYSet", false);
        setFloatField(term27439, term27439.getClass(), "alignmentY", 0.0F);
        setField(term27439, term27439.getClass(), "ui", null);
        setField(term27439, term27439.getClass(), "listenerList", null);
        setField(term27439, term27439.getClass(), "clientProperties", null);
        setField(term27439, term27439.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27439, term27439.getClass(), "autoscrolls", false);
        setField(term27439, term27439.getClass(), "border", null);
        setIntField(term27439, term27439.getClass(), "flags", 0);
        setField(term27439, term27439.getClass(), "inputVerifier", null);
        setBooleanField(term27439, term27439.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27439, term27439.getClass(), "paintingChild", null);
        setField(term27439, term27439.getClass(), "popupMenu", null);
        setField(term27439, term27439.getClass(), "revalidateRunnableScheduled", null);
        setField(term27439, term27439.getClass(), "focusInputMap", null);
        setField(term27439, term27439.getClass(), "ancestorInputMap", null);
        setField(term27439, term27439.getClass(), "windowInputMap", null);
        setField(term27439, term27439.getClass(), "actionMap", null);
        setField(term27439, term27439.getClass(), "aaHint", null);
        setField(term27439, term27439.getClass(), "lcdRenderingHint", null);
        setField(term27439, term27439.getClass(), "component", null);
        setField(term27439, term27439.getClass(), "layoutMgr", null);
        setField(term27439, term27439.getClass(), "dispatcher", null);
        setField(term27439, term27439.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27439, term27439.getClass(), "focusCycleRoot", false);
        setBooleanField(term27439, term27439.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27439, term27439.getClass(), "printingThreads", null);
        setBooleanField(term27439, term27439.getClass(), "printing", false);
        setField(term27439, term27439.getClass(), "containerListener", null);
        setIntField(term27439, term27439.getClass(), "listeningChildren", 0);
        setIntField(term27439, term27439.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27439, term27439.getClass(), "descendantsCount", 0);
        setField(term27439, term27439.getClass(), "preserveBackgroundColor", null);
        setIntField(term27439, term27439.getClass(), "numOfHWComponents", 0);
        setIntField(term27439, term27439.getClass(), "numOfLWComponents", 0);
        setField(term27439, term27439.getClass(), "modalComp", null);
        setField(term27439, term27439.getClass(), "modalAppContext", null);
        setIntField(term27439, term27439.getClass(), "containerSerializedDataVersion", 0);
        setField(term27439, term27439.getClass(), "peer", null);
        setField(term27439, term27439.getClass(), "parent", null);
        setField(term27439, term27439.getClass(), "appContext", null);
        setIntField(term27439, term27439.getClass(), "x", 0);
        setIntField(term27439, term27439.getClass(), "y", 0);
        setIntField(term27439, term27439.getClass(), "width", 0);
        setIntField(term27439, term27439.getClass(), "height", 0);
        setField(term27439, term27439.getClass(), "foreground", null);
        setField(term27439, term27439.getClass(), "background", null);
        setField(term27439, term27439.getClass(), "font", null);
        setField(term27439, term27439.getClass(), "peerFont", null);
        setField(term27439, term27439.getClass(), "cursor", null);
        setField(term27439, term27439.getClass(), "locale", null);
        setField(term27439, term27439.getClass(), "graphicsConfig", null);
        setField(term27439, term27439.getClass(), "bufferStrategy", null);
        setBooleanField(term27439, term27439.getClass(), "ignoreRepaint", false);
        setBooleanField(term27439, term27439.getClass(), "visible", false);
        setBooleanField(term27439, term27439.getClass(), "enabled", false);
        setBooleanField(term27439, term27439.getClass(), "valid", false);
        setField(term27439, term27439.getClass(), "dropTarget", null);
        setField(term27439, term27439.getClass(), "popups", null);
        setField(term27439, term27439.getClass(), "name", null);
        setBooleanField(term27439, term27439.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27439, term27439.getClass(), "focusable", false);
        setIntField(term27439, term27439.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27439, term27439.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27439, term27439.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27439, term27439.getClass(), "acc", null);
        setField(term27439, term27439.getClass(), "minSize", null);
        setBooleanField(term27439, term27439.getClass(), "minSizeSet", false);
        setField(term27439, term27439.getClass(), "prefSize", null);
        setBooleanField(term27439, term27439.getClass(), "prefSizeSet", false);
        setField(term27439, term27439.getClass(), "maxSize", null);
        setBooleanField(term27439, term27439.getClass(), "maxSizeSet", false);
        setField(term27439, term27439.getClass(), "componentOrientation", null);
        setBooleanField(term27439, term27439.getClass(), "newEventsOnly", false);
        setField(term27439, term27439.getClass(), "componentListener", null);
        setField(term27439, term27439.getClass(), "focusListener", null);
        setField(term27439, term27439.getClass(), "hierarchyListener", null);
        setField(term27439, term27439.getClass(), "hierarchyBoundsListener", null);
        setField(term27439, term27439.getClass(), "keyListener", null);
        setField(term27439, term27439.getClass(), "mouseListener", null);
        setField(term27439, term27439.getClass(), "mouseMotionListener", null);
        setField(term27439, term27439.getClass(), "mouseWheelListener", null);
        setField(term27439, term27439.getClass(), "inputMethodListener", null);
        setLongField(term27439, term27439.getClass(), "eventMask", 0L);
        setField(term27439, term27439.getClass(), "changeSupport", null);
        setField(term27439, term27439.getClass(), "objectLock", null);
        setBooleanField(term27439, term27439.getClass(), "isPacked", false);
        setIntField(term27439, term27439.getClass(), "boundsOp", 0);
        setField(term27439, term27439.getClass(), "compoundShape", null);
        setField(term27439, term27439.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27439, term27439.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27439, term27439.getClass(), "backgroundEraseDisabled", false);
        setField(term27439, term27439.getClass(), "eventCache", null);
        setBooleanField(term27439, term27439.getClass(), "coalescingEnabled", false);
        setBooleanField(term27439, term27439.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27439, term27439.getClass(), "componentSerializedDataVersion", 0);
        setField(term27439, term27439.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setToolTipText", argTypes, term27439, args);
    }

};


