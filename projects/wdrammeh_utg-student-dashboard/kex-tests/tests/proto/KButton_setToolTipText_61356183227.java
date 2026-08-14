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
     Object term27472;

    public KButton_setToolTipText_61356183227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27472 = newInstance(Class.forName("proto.KButton"));
        setField(term27472, term27472.getClass(), "initialTip", null);
        setField(term27472, term27472.getClass(), "model", null);
        setField(term27472, term27472.getClass(), "text", null);
        setField(term27472, term27472.getClass(), "margin", null);
        setField(term27472, term27472.getClass(), "defaultMargin", null);
        setField(term27472, term27472.getClass(), "defaultIcon", null);
        setField(term27472, term27472.getClass(), "pressedIcon", null);
        setField(term27472, term27472.getClass(), "disabledIcon", null);
        setField(term27472, term27472.getClass(), "selectedIcon", null);
        setField(term27472, term27472.getClass(), "disabledSelectedIcon", null);
        setField(term27472, term27472.getClass(), "rolloverIcon", null);
        setField(term27472, term27472.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27472, term27472.getClass(), "paintBorder", false);
        setBooleanField(term27472, term27472.getClass(), "paintFocus", false);
        setBooleanField(term27472, term27472.getClass(), "rolloverEnabled", false);
        setBooleanField(term27472, term27472.getClass(), "contentAreaFilled", false);
        setIntField(term27472, term27472.getClass(), "verticalAlignment", 0);
        setIntField(term27472, term27472.getClass(), "horizontalAlignment", 0);
        setIntField(term27472, term27472.getClass(), "verticalTextPosition", 0);
        setIntField(term27472, term27472.getClass(), "horizontalTextPosition", 0);
        setIntField(term27472, term27472.getClass(), "iconTextGap", 0);
        setIntField(term27472, term27472.getClass(), "mnemonic", 0);
        setIntField(term27472, term27472.getClass(), "mnemonicIndex", 0);
        setLongField(term27472, term27472.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27472, term27472.getClass(), "borderPaintedSet", false);
        setBooleanField(term27472, term27472.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27472, term27472.getClass(), "iconTextGapSet", false);
        setBooleanField(term27472, term27472.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27472, term27472.getClass(), "setLayout", false);
        setBooleanField(term27472, term27472.getClass(), "defaultCapable", false);
        setField(term27472, term27472.getClass(), "handler", null);
        setField(term27472, term27472.getClass(), "changeListener", null);
        setField(term27472, term27472.getClass(), "actionListener", null);
        setField(term27472, term27472.getClass(), "itemListener", null);
        setField(term27472, term27472.getClass(), "changeEvent", null);
        setBooleanField(term27472, term27472.getClass(), "hideActionText", false);
        setField(term27472, term27472.getClass(), "action", null);
        setField(term27472, term27472.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27472, term27472.getClass(), "isAlignmentXSet", false);
        setFloatField(term27472, term27472.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27472, term27472.getClass(), "isAlignmentYSet", false);
        setFloatField(term27472, term27472.getClass(), "alignmentY", 0.0F);
        setField(term27472, term27472.getClass(), "ui", null);
        setField(term27472, term27472.getClass(), "listenerList", null);
        setField(term27472, term27472.getClass(), "clientProperties", null);
        setField(term27472, term27472.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27472, term27472.getClass(), "autoscrolls", false);
        setField(term27472, term27472.getClass(), "border", null);
        setIntField(term27472, term27472.getClass(), "flags", 0);
        setField(term27472, term27472.getClass(), "inputVerifier", null);
        setBooleanField(term27472, term27472.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27472, term27472.getClass(), "paintingChild", null);
        setField(term27472, term27472.getClass(), "popupMenu", null);
        setField(term27472, term27472.getClass(), "revalidateRunnableScheduled", null);
        setField(term27472, term27472.getClass(), "focusInputMap", null);
        setField(term27472, term27472.getClass(), "ancestorInputMap", null);
        setField(term27472, term27472.getClass(), "windowInputMap", null);
        setField(term27472, term27472.getClass(), "actionMap", null);
        setField(term27472, term27472.getClass(), "aaHint", null);
        setField(term27472, term27472.getClass(), "lcdRenderingHint", null);
        setField(term27472, term27472.getClass(), "component", null);
        setField(term27472, term27472.getClass(), "layoutMgr", null);
        setField(term27472, term27472.getClass(), "dispatcher", null);
        setField(term27472, term27472.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27472, term27472.getClass(), "focusCycleRoot", false);
        setBooleanField(term27472, term27472.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27472, term27472.getClass(), "printingThreads", null);
        setBooleanField(term27472, term27472.getClass(), "printing", false);
        setField(term27472, term27472.getClass(), "containerListener", null);
        setIntField(term27472, term27472.getClass(), "listeningChildren", 0);
        setIntField(term27472, term27472.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27472, term27472.getClass(), "descendantsCount", 0);
        setField(term27472, term27472.getClass(), "preserveBackgroundColor", null);
        setIntField(term27472, term27472.getClass(), "numOfHWComponents", 0);
        setIntField(term27472, term27472.getClass(), "numOfLWComponents", 0);
        setField(term27472, term27472.getClass(), "modalComp", null);
        setField(term27472, term27472.getClass(), "modalAppContext", null);
        setIntField(term27472, term27472.getClass(), "containerSerializedDataVersion", 0);
        setField(term27472, term27472.getClass(), "peer", null);
        setField(term27472, term27472.getClass(), "parent", null);
        setField(term27472, term27472.getClass(), "appContext", null);
        setIntField(term27472, term27472.getClass(), "x", 0);
        setIntField(term27472, term27472.getClass(), "y", 0);
        setIntField(term27472, term27472.getClass(), "width", 0);
        setIntField(term27472, term27472.getClass(), "height", 0);
        setField(term27472, term27472.getClass(), "foreground", null);
        setField(term27472, term27472.getClass(), "background", null);
        setField(term27472, term27472.getClass(), "font", null);
        setField(term27472, term27472.getClass(), "peerFont", null);
        setField(term27472, term27472.getClass(), "cursor", null);
        setField(term27472, term27472.getClass(), "locale", null);
        setField(term27472, term27472.getClass(), "graphicsConfig", null);
        setField(term27472, term27472.getClass(), "bufferStrategy", null);
        setBooleanField(term27472, term27472.getClass(), "ignoreRepaint", false);
        setBooleanField(term27472, term27472.getClass(), "visible", false);
        setBooleanField(term27472, term27472.getClass(), "enabled", false);
        setBooleanField(term27472, term27472.getClass(), "valid", false);
        setField(term27472, term27472.getClass(), "dropTarget", null);
        setField(term27472, term27472.getClass(), "popups", null);
        setField(term27472, term27472.getClass(), "name", null);
        setBooleanField(term27472, term27472.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27472, term27472.getClass(), "focusable", false);
        setIntField(term27472, term27472.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27472, term27472.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27472, term27472.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27472, term27472.getClass(), "acc", null);
        setField(term27472, term27472.getClass(), "minSize", null);
        setBooleanField(term27472, term27472.getClass(), "minSizeSet", false);
        setField(term27472, term27472.getClass(), "prefSize", null);
        setBooleanField(term27472, term27472.getClass(), "prefSizeSet", false);
        setField(term27472, term27472.getClass(), "maxSize", null);
        setBooleanField(term27472, term27472.getClass(), "maxSizeSet", false);
        setField(term27472, term27472.getClass(), "componentOrientation", null);
        setBooleanField(term27472, term27472.getClass(), "newEventsOnly", false);
        setField(term27472, term27472.getClass(), "componentListener", null);
        setField(term27472, term27472.getClass(), "focusListener", null);
        setField(term27472, term27472.getClass(), "hierarchyListener", null);
        setField(term27472, term27472.getClass(), "hierarchyBoundsListener", null);
        setField(term27472, term27472.getClass(), "keyListener", null);
        setField(term27472, term27472.getClass(), "mouseListener", null);
        setField(term27472, term27472.getClass(), "mouseMotionListener", null);
        setField(term27472, term27472.getClass(), "mouseWheelListener", null);
        setField(term27472, term27472.getClass(), "inputMethodListener", null);
        setLongField(term27472, term27472.getClass(), "eventMask", 0L);
        setField(term27472, term27472.getClass(), "changeSupport", null);
        setField(term27472, term27472.getClass(), "objectLock", null);
        setBooleanField(term27472, term27472.getClass(), "isPacked", false);
        setIntField(term27472, term27472.getClass(), "boundsOp", 0);
        setField(term27472, term27472.getClass(), "compoundShape", null);
        setField(term27472, term27472.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27472, term27472.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27472, term27472.getClass(), "backgroundEraseDisabled", false);
        setField(term27472, term27472.getClass(), "eventCache", null);
        setBooleanField(term27472, term27472.getClass(), "coalescingEnabled", false);
        setBooleanField(term27472, term27472.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27472, term27472.getClass(), "componentSerializedDataVersion", 0);
        setField(term27472, term27472.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setToolTipText", argTypes, term27472, args);
    }

};


