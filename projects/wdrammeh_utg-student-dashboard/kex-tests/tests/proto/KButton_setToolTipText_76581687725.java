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
import java.lang.Integer;

public class KButton_setToolTipText_76581687725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27315;
     Object term27375;

    public KButton_setToolTipText_76581687725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27315 = newInstance(Class.forName("proto.KButton"));
        setField(term27315, term27315.getClass(), "initialTip", null);
        setField(term27315, term27315.getClass(), "model", null);
        setField(term27315, term27315.getClass(), "text", null);
        setField(term27315, term27315.getClass(), "margin", null);
        setField(term27315, term27315.getClass(), "defaultMargin", null);
        setField(term27315, term27315.getClass(), "defaultIcon", null);
        setField(term27315, term27315.getClass(), "pressedIcon", null);
        setField(term27315, term27315.getClass(), "disabledIcon", null);
        setField(term27315, term27315.getClass(), "selectedIcon", null);
        setField(term27315, term27315.getClass(), "disabledSelectedIcon", null);
        setField(term27315, term27315.getClass(), "rolloverIcon", null);
        setField(term27315, term27315.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27315, term27315.getClass(), "paintBorder", false);
        setBooleanField(term27315, term27315.getClass(), "paintFocus", false);
        setBooleanField(term27315, term27315.getClass(), "rolloverEnabled", false);
        setBooleanField(term27315, term27315.getClass(), "contentAreaFilled", false);
        setIntField(term27315, term27315.getClass(), "verticalAlignment", 0);
        setIntField(term27315, term27315.getClass(), "horizontalAlignment", 0);
        setIntField(term27315, term27315.getClass(), "verticalTextPosition", 0);
        setIntField(term27315, term27315.getClass(), "horizontalTextPosition", 0);
        setIntField(term27315, term27315.getClass(), "iconTextGap", 0);
        setIntField(term27315, term27315.getClass(), "mnemonic", 0);
        setIntField(term27315, term27315.getClass(), "mnemonicIndex", 0);
        setLongField(term27315, term27315.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27315, term27315.getClass(), "borderPaintedSet", false);
        setBooleanField(term27315, term27315.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27315, term27315.getClass(), "iconTextGapSet", false);
        setBooleanField(term27315, term27315.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27315, term27315.getClass(), "setLayout", false);
        setBooleanField(term27315, term27315.getClass(), "defaultCapable", false);
        setField(term27315, term27315.getClass(), "handler", null);
        setField(term27315, term27315.getClass(), "changeListener", null);
        setField(term27315, term27315.getClass(), "actionListener", null);
        setField(term27315, term27315.getClass(), "itemListener", null);
        setField(term27315, term27315.getClass(), "changeEvent", null);
        setBooleanField(term27315, term27315.getClass(), "hideActionText", false);
        setField(term27315, term27315.getClass(), "action", null);
        setField(term27315, term27315.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27315, term27315.getClass(), "isAlignmentXSet", false);
        setFloatField(term27315, term27315.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27315, term27315.getClass(), "isAlignmentYSet", false);
        setFloatField(term27315, term27315.getClass(), "alignmentY", 0.0F);
        setField(term27315, term27315.getClass(), "ui", null);
        setField(term27315, term27315.getClass(), "listenerList", null);
        setField(term27315, term27315.getClass(), "clientProperties", null);
        setField(term27315, term27315.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27315, term27315.getClass(), "autoscrolls", false);
        setField(term27315, term27315.getClass(), "border", null);
        setIntField(term27315, term27315.getClass(), "flags", 0);
        setField(term27315, term27315.getClass(), "inputVerifier", null);
        setBooleanField(term27315, term27315.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27315, term27315.getClass(), "paintingChild", null);
        setField(term27315, term27315.getClass(), "popupMenu", null);
        setField(term27315, term27315.getClass(), "revalidateRunnableScheduled", null);
        setField(term27315, term27315.getClass(), "focusInputMap", null);
        setField(term27315, term27315.getClass(), "ancestorInputMap", null);
        setField(term27315, term27315.getClass(), "windowInputMap", null);
        setField(term27315, term27315.getClass(), "actionMap", null);
        setField(term27315, term27315.getClass(), "aaHint", null);
        setField(term27315, term27315.getClass(), "lcdRenderingHint", null);
        setField(term27315, term27315.getClass(), "component", null);
        setField(term27315, term27315.getClass(), "layoutMgr", null);
        setField(term27315, term27315.getClass(), "dispatcher", null);
        setField(term27315, term27315.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27315, term27315.getClass(), "focusCycleRoot", false);
        setBooleanField(term27315, term27315.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27315, term27315.getClass(), "printingThreads", null);
        setBooleanField(term27315, term27315.getClass(), "printing", false);
        setField(term27315, term27315.getClass(), "containerListener", null);
        setIntField(term27315, term27315.getClass(), "listeningChildren", 0);
        setIntField(term27315, term27315.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27315, term27315.getClass(), "descendantsCount", 0);
        setField(term27315, term27315.getClass(), "preserveBackgroundColor", null);
        setIntField(term27315, term27315.getClass(), "numOfHWComponents", 0);
        setIntField(term27315, term27315.getClass(), "numOfLWComponents", 0);
        setField(term27315, term27315.getClass(), "modalComp", null);
        setField(term27315, term27315.getClass(), "modalAppContext", null);
        setIntField(term27315, term27315.getClass(), "containerSerializedDataVersion", 0);
        setField(term27315, term27315.getClass(), "peer", null);
        setField(term27315, term27315.getClass(), "parent", null);
        setField(term27315, term27315.getClass(), "appContext", null);
        setIntField(term27315, term27315.getClass(), "x", 0);
        setIntField(term27315, term27315.getClass(), "y", 0);
        setIntField(term27315, term27315.getClass(), "width", 0);
        setIntField(term27315, term27315.getClass(), "height", 0);
        setField(term27315, term27315.getClass(), "foreground", null);
        setField(term27315, term27315.getClass(), "background", null);
        setField(term27315, term27315.getClass(), "font", null);
        setField(term27315, term27315.getClass(), "peerFont", null);
        setField(term27315, term27315.getClass(), "cursor", null);
        setField(term27315, term27315.getClass(), "locale", null);
        setField(term27315, term27315.getClass(), "graphicsConfig", null);
        setField(term27315, term27315.getClass(), "bufferStrategy", null);
        setBooleanField(term27315, term27315.getClass(), "ignoreRepaint", false);
        setBooleanField(term27315, term27315.getClass(), "visible", false);
        setBooleanField(term27315, term27315.getClass(), "enabled", false);
        setBooleanField(term27315, term27315.getClass(), "valid", false);
        setField(term27315, term27315.getClass(), "dropTarget", null);
        setField(term27315, term27315.getClass(), "popups", null);
        setField(term27315, term27315.getClass(), "name", null);
        setBooleanField(term27315, term27315.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27315, term27315.getClass(), "focusable", false);
        setIntField(term27315, term27315.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27315, term27315.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27315, term27315.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27315, term27315.getClass(), "acc", null);
        setField(term27315, term27315.getClass(), "minSize", null);
        setBooleanField(term27315, term27315.getClass(), "minSizeSet", false);
        setField(term27315, term27315.getClass(), "prefSize", null);
        setBooleanField(term27315, term27315.getClass(), "prefSizeSet", false);
        setField(term27315, term27315.getClass(), "maxSize", null);
        setBooleanField(term27315, term27315.getClass(), "maxSizeSet", false);
        setField(term27315, term27315.getClass(), "componentOrientation", null);
        setBooleanField(term27315, term27315.getClass(), "newEventsOnly", false);
        setField(term27315, term27315.getClass(), "componentListener", null);
        setField(term27315, term27315.getClass(), "focusListener", null);
        setField(term27315, term27315.getClass(), "hierarchyListener", null);
        setField(term27315, term27315.getClass(), "hierarchyBoundsListener", null);
        setField(term27315, term27315.getClass(), "keyListener", null);
        setField(term27315, term27315.getClass(), "mouseListener", null);
        setField(term27315, term27315.getClass(), "mouseMotionListener", null);
        setField(term27315, term27315.getClass(), "mouseWheelListener", null);
        setField(term27315, term27315.getClass(), "inputMethodListener", null);
        setLongField(term27315, term27315.getClass(), "eventMask", 0L);
        setField(term27315, term27315.getClass(), "changeSupport", null);
        setField(term27315, term27315.getClass(), "objectLock", null);
        setBooleanField(term27315, term27315.getClass(), "isPacked", false);
        setIntField(term27315, term27315.getClass(), "boundsOp", 0);
        setField(term27315, term27315.getClass(), "compoundShape", null);
        setField(term27315, term27315.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27315, term27315.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27315, term27315.getClass(), "backgroundEraseDisabled", false);
        setField(term27315, term27315.getClass(), "eventCache", null);
        setBooleanField(term27315, term27315.getClass(), "coalescingEnabled", false);
        setBooleanField(term27315, term27315.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27315, term27315.getClass(), "componentSerializedDataVersion", 0);
        setField(term27315, term27315.getClass(), "accessibleContext", null);
        term27375 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27375;
        callMethod(klass, "setToolTipText", argTypes, term27315, args);
    }

};


