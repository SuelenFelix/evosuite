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
     Object term27348;
     Object term27408;

    public KButton_setToolTipText_76581687725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27348 = newInstance(Class.forName("proto.KButton"));
        setField(term27348, term27348.getClass(), "initialTip", null);
        setField(term27348, term27348.getClass(), "model", null);
        setField(term27348, term27348.getClass(), "text", null);
        setField(term27348, term27348.getClass(), "margin", null);
        setField(term27348, term27348.getClass(), "defaultMargin", null);
        setField(term27348, term27348.getClass(), "defaultIcon", null);
        setField(term27348, term27348.getClass(), "pressedIcon", null);
        setField(term27348, term27348.getClass(), "disabledIcon", null);
        setField(term27348, term27348.getClass(), "selectedIcon", null);
        setField(term27348, term27348.getClass(), "disabledSelectedIcon", null);
        setField(term27348, term27348.getClass(), "rolloverIcon", null);
        setField(term27348, term27348.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27348, term27348.getClass(), "paintBorder", false);
        setBooleanField(term27348, term27348.getClass(), "paintFocus", false);
        setBooleanField(term27348, term27348.getClass(), "rolloverEnabled", false);
        setBooleanField(term27348, term27348.getClass(), "contentAreaFilled", false);
        setIntField(term27348, term27348.getClass(), "verticalAlignment", 0);
        setIntField(term27348, term27348.getClass(), "horizontalAlignment", 0);
        setIntField(term27348, term27348.getClass(), "verticalTextPosition", 0);
        setIntField(term27348, term27348.getClass(), "horizontalTextPosition", 0);
        setIntField(term27348, term27348.getClass(), "iconTextGap", 0);
        setIntField(term27348, term27348.getClass(), "mnemonic", 0);
        setIntField(term27348, term27348.getClass(), "mnemonicIndex", 0);
        setLongField(term27348, term27348.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27348, term27348.getClass(), "borderPaintedSet", false);
        setBooleanField(term27348, term27348.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27348, term27348.getClass(), "iconTextGapSet", false);
        setBooleanField(term27348, term27348.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27348, term27348.getClass(), "setLayout", false);
        setBooleanField(term27348, term27348.getClass(), "defaultCapable", false);
        setField(term27348, term27348.getClass(), "handler", null);
        setField(term27348, term27348.getClass(), "changeListener", null);
        setField(term27348, term27348.getClass(), "actionListener", null);
        setField(term27348, term27348.getClass(), "itemListener", null);
        setField(term27348, term27348.getClass(), "changeEvent", null);
        setBooleanField(term27348, term27348.getClass(), "hideActionText", false);
        setField(term27348, term27348.getClass(), "action", null);
        setField(term27348, term27348.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27348, term27348.getClass(), "isAlignmentXSet", false);
        setFloatField(term27348, term27348.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27348, term27348.getClass(), "isAlignmentYSet", false);
        setFloatField(term27348, term27348.getClass(), "alignmentY", 0.0F);
        setField(term27348, term27348.getClass(), "ui", null);
        setField(term27348, term27348.getClass(), "listenerList", null);
        setField(term27348, term27348.getClass(), "clientProperties", null);
        setField(term27348, term27348.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27348, term27348.getClass(), "autoscrolls", false);
        setField(term27348, term27348.getClass(), "border", null);
        setIntField(term27348, term27348.getClass(), "flags", 0);
        setField(term27348, term27348.getClass(), "inputVerifier", null);
        setBooleanField(term27348, term27348.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27348, term27348.getClass(), "paintingChild", null);
        setField(term27348, term27348.getClass(), "popupMenu", null);
        setField(term27348, term27348.getClass(), "revalidateRunnableScheduled", null);
        setField(term27348, term27348.getClass(), "focusInputMap", null);
        setField(term27348, term27348.getClass(), "ancestorInputMap", null);
        setField(term27348, term27348.getClass(), "windowInputMap", null);
        setField(term27348, term27348.getClass(), "actionMap", null);
        setField(term27348, term27348.getClass(), "aaHint", null);
        setField(term27348, term27348.getClass(), "lcdRenderingHint", null);
        setField(term27348, term27348.getClass(), "component", null);
        setField(term27348, term27348.getClass(), "layoutMgr", null);
        setField(term27348, term27348.getClass(), "dispatcher", null);
        setField(term27348, term27348.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27348, term27348.getClass(), "focusCycleRoot", false);
        setBooleanField(term27348, term27348.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27348, term27348.getClass(), "printingThreads", null);
        setBooleanField(term27348, term27348.getClass(), "printing", false);
        setField(term27348, term27348.getClass(), "containerListener", null);
        setIntField(term27348, term27348.getClass(), "listeningChildren", 0);
        setIntField(term27348, term27348.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27348, term27348.getClass(), "descendantsCount", 0);
        setField(term27348, term27348.getClass(), "preserveBackgroundColor", null);
        setIntField(term27348, term27348.getClass(), "numOfHWComponents", 0);
        setIntField(term27348, term27348.getClass(), "numOfLWComponents", 0);
        setField(term27348, term27348.getClass(), "modalComp", null);
        setField(term27348, term27348.getClass(), "modalAppContext", null);
        setIntField(term27348, term27348.getClass(), "containerSerializedDataVersion", 0);
        setField(term27348, term27348.getClass(), "peer", null);
        setField(term27348, term27348.getClass(), "parent", null);
        setField(term27348, term27348.getClass(), "appContext", null);
        setIntField(term27348, term27348.getClass(), "x", 0);
        setIntField(term27348, term27348.getClass(), "y", 0);
        setIntField(term27348, term27348.getClass(), "width", 0);
        setIntField(term27348, term27348.getClass(), "height", 0);
        setField(term27348, term27348.getClass(), "foreground", null);
        setField(term27348, term27348.getClass(), "background", null);
        setField(term27348, term27348.getClass(), "font", null);
        setField(term27348, term27348.getClass(), "peerFont", null);
        setField(term27348, term27348.getClass(), "cursor", null);
        setField(term27348, term27348.getClass(), "locale", null);
        setField(term27348, term27348.getClass(), "graphicsConfig", null);
        setField(term27348, term27348.getClass(), "bufferStrategy", null);
        setBooleanField(term27348, term27348.getClass(), "ignoreRepaint", false);
        setBooleanField(term27348, term27348.getClass(), "visible", false);
        setBooleanField(term27348, term27348.getClass(), "enabled", false);
        setBooleanField(term27348, term27348.getClass(), "valid", false);
        setField(term27348, term27348.getClass(), "dropTarget", null);
        setField(term27348, term27348.getClass(), "popups", null);
        setField(term27348, term27348.getClass(), "name", null);
        setBooleanField(term27348, term27348.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27348, term27348.getClass(), "focusable", false);
        setIntField(term27348, term27348.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27348, term27348.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27348, term27348.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27348, term27348.getClass(), "acc", null);
        setField(term27348, term27348.getClass(), "minSize", null);
        setBooleanField(term27348, term27348.getClass(), "minSizeSet", false);
        setField(term27348, term27348.getClass(), "prefSize", null);
        setBooleanField(term27348, term27348.getClass(), "prefSizeSet", false);
        setField(term27348, term27348.getClass(), "maxSize", null);
        setBooleanField(term27348, term27348.getClass(), "maxSizeSet", false);
        setField(term27348, term27348.getClass(), "componentOrientation", null);
        setBooleanField(term27348, term27348.getClass(), "newEventsOnly", false);
        setField(term27348, term27348.getClass(), "componentListener", null);
        setField(term27348, term27348.getClass(), "focusListener", null);
        setField(term27348, term27348.getClass(), "hierarchyListener", null);
        setField(term27348, term27348.getClass(), "hierarchyBoundsListener", null);
        setField(term27348, term27348.getClass(), "keyListener", null);
        setField(term27348, term27348.getClass(), "mouseListener", null);
        setField(term27348, term27348.getClass(), "mouseMotionListener", null);
        setField(term27348, term27348.getClass(), "mouseWheelListener", null);
        setField(term27348, term27348.getClass(), "inputMethodListener", null);
        setLongField(term27348, term27348.getClass(), "eventMask", 0L);
        setField(term27348, term27348.getClass(), "changeSupport", null);
        setField(term27348, term27348.getClass(), "objectLock", null);
        setBooleanField(term27348, term27348.getClass(), "isPacked", false);
        setIntField(term27348, term27348.getClass(), "boundsOp", 0);
        setField(term27348, term27348.getClass(), "compoundShape", null);
        setField(term27348, term27348.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27348, term27348.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27348, term27348.getClass(), "backgroundEraseDisabled", false);
        setField(term27348, term27348.getClass(), "eventCache", null);
        setBooleanField(term27348, term27348.getClass(), "coalescingEnabled", false);
        setBooleanField(term27348, term27348.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27348, term27348.getClass(), "componentSerializedDataVersion", 0);
        setField(term27348, term27348.getClass(), "accessibleContext", null);
        term27408 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27408;
        callMethod(klass, "setToolTipText", argTypes, term27348, args);
    }

};


