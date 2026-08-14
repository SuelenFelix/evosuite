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

public class KButton_createToolTip_95222606128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27532;

    public KButton_createToolTip_95222606128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27532 = newInstance(Class.forName("proto.KButton"));
        setField(term27532, term27532.getClass(), "initialTip", null);
        setField(term27532, term27532.getClass(), "model", null);
        setField(term27532, term27532.getClass(), "text", null);
        setField(term27532, term27532.getClass(), "margin", null);
        setField(term27532, term27532.getClass(), "defaultMargin", null);
        setField(term27532, term27532.getClass(), "defaultIcon", null);
        setField(term27532, term27532.getClass(), "pressedIcon", null);
        setField(term27532, term27532.getClass(), "disabledIcon", null);
        setField(term27532, term27532.getClass(), "selectedIcon", null);
        setField(term27532, term27532.getClass(), "disabledSelectedIcon", null);
        setField(term27532, term27532.getClass(), "rolloverIcon", null);
        setField(term27532, term27532.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27532, term27532.getClass(), "paintBorder", false);
        setBooleanField(term27532, term27532.getClass(), "paintFocus", false);
        setBooleanField(term27532, term27532.getClass(), "rolloverEnabled", false);
        setBooleanField(term27532, term27532.getClass(), "contentAreaFilled", false);
        setIntField(term27532, term27532.getClass(), "verticalAlignment", 0);
        setIntField(term27532, term27532.getClass(), "horizontalAlignment", 0);
        setIntField(term27532, term27532.getClass(), "verticalTextPosition", 0);
        setIntField(term27532, term27532.getClass(), "horizontalTextPosition", 0);
        setIntField(term27532, term27532.getClass(), "iconTextGap", 0);
        setIntField(term27532, term27532.getClass(), "mnemonic", 0);
        setIntField(term27532, term27532.getClass(), "mnemonicIndex", 0);
        setLongField(term27532, term27532.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27532, term27532.getClass(), "borderPaintedSet", false);
        setBooleanField(term27532, term27532.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27532, term27532.getClass(), "iconTextGapSet", false);
        setBooleanField(term27532, term27532.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27532, term27532.getClass(), "setLayout", false);
        setBooleanField(term27532, term27532.getClass(), "defaultCapable", false);
        setField(term27532, term27532.getClass(), "handler", null);
        setField(term27532, term27532.getClass(), "changeListener", null);
        setField(term27532, term27532.getClass(), "actionListener", null);
        setField(term27532, term27532.getClass(), "itemListener", null);
        setField(term27532, term27532.getClass(), "changeEvent", null);
        setBooleanField(term27532, term27532.getClass(), "hideActionText", false);
        setField(term27532, term27532.getClass(), "action", null);
        setField(term27532, term27532.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27532, term27532.getClass(), "isAlignmentXSet", false);
        setFloatField(term27532, term27532.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27532, term27532.getClass(), "isAlignmentYSet", false);
        setFloatField(term27532, term27532.getClass(), "alignmentY", 0.0F);
        setField(term27532, term27532.getClass(), "ui", null);
        setField(term27532, term27532.getClass(), "listenerList", null);
        setField(term27532, term27532.getClass(), "clientProperties", null);
        setField(term27532, term27532.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27532, term27532.getClass(), "autoscrolls", false);
        setField(term27532, term27532.getClass(), "border", null);
        setIntField(term27532, term27532.getClass(), "flags", 0);
        setField(term27532, term27532.getClass(), "inputVerifier", null);
        setBooleanField(term27532, term27532.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27532, term27532.getClass(), "paintingChild", null);
        setField(term27532, term27532.getClass(), "popupMenu", null);
        setField(term27532, term27532.getClass(), "revalidateRunnableScheduled", null);
        setField(term27532, term27532.getClass(), "focusInputMap", null);
        setField(term27532, term27532.getClass(), "ancestorInputMap", null);
        setField(term27532, term27532.getClass(), "windowInputMap", null);
        setField(term27532, term27532.getClass(), "actionMap", null);
        setField(term27532, term27532.getClass(), "aaHint", null);
        setField(term27532, term27532.getClass(), "lcdRenderingHint", null);
        setField(term27532, term27532.getClass(), "component", null);
        setField(term27532, term27532.getClass(), "layoutMgr", null);
        setField(term27532, term27532.getClass(), "dispatcher", null);
        setField(term27532, term27532.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27532, term27532.getClass(), "focusCycleRoot", false);
        setBooleanField(term27532, term27532.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27532, term27532.getClass(), "printingThreads", null);
        setBooleanField(term27532, term27532.getClass(), "printing", false);
        setField(term27532, term27532.getClass(), "containerListener", null);
        setIntField(term27532, term27532.getClass(), "listeningChildren", 0);
        setIntField(term27532, term27532.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27532, term27532.getClass(), "descendantsCount", 0);
        setField(term27532, term27532.getClass(), "preserveBackgroundColor", null);
        setIntField(term27532, term27532.getClass(), "numOfHWComponents", 0);
        setIntField(term27532, term27532.getClass(), "numOfLWComponents", 0);
        setField(term27532, term27532.getClass(), "modalComp", null);
        setField(term27532, term27532.getClass(), "modalAppContext", null);
        setIntField(term27532, term27532.getClass(), "containerSerializedDataVersion", 0);
        setField(term27532, term27532.getClass(), "peer", null);
        setField(term27532, term27532.getClass(), "parent", null);
        setField(term27532, term27532.getClass(), "appContext", null);
        setIntField(term27532, term27532.getClass(), "x", 0);
        setIntField(term27532, term27532.getClass(), "y", 0);
        setIntField(term27532, term27532.getClass(), "width", 0);
        setIntField(term27532, term27532.getClass(), "height", 0);
        setField(term27532, term27532.getClass(), "foreground", null);
        setField(term27532, term27532.getClass(), "background", null);
        setField(term27532, term27532.getClass(), "font", null);
        setField(term27532, term27532.getClass(), "peerFont", null);
        setField(term27532, term27532.getClass(), "cursor", null);
        setField(term27532, term27532.getClass(), "locale", null);
        setField(term27532, term27532.getClass(), "graphicsConfig", null);
        setField(term27532, term27532.getClass(), "bufferStrategy", null);
        setBooleanField(term27532, term27532.getClass(), "ignoreRepaint", false);
        setBooleanField(term27532, term27532.getClass(), "visible", false);
        setBooleanField(term27532, term27532.getClass(), "enabled", false);
        setBooleanField(term27532, term27532.getClass(), "valid", false);
        setField(term27532, term27532.getClass(), "dropTarget", null);
        setField(term27532, term27532.getClass(), "popups", null);
        setField(term27532, term27532.getClass(), "name", null);
        setBooleanField(term27532, term27532.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27532, term27532.getClass(), "focusable", false);
        setIntField(term27532, term27532.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27532, term27532.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27532, term27532.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27532, term27532.getClass(), "acc", null);
        setField(term27532, term27532.getClass(), "minSize", null);
        setBooleanField(term27532, term27532.getClass(), "minSizeSet", false);
        setField(term27532, term27532.getClass(), "prefSize", null);
        setBooleanField(term27532, term27532.getClass(), "prefSizeSet", false);
        setField(term27532, term27532.getClass(), "maxSize", null);
        setBooleanField(term27532, term27532.getClass(), "maxSizeSet", false);
        setField(term27532, term27532.getClass(), "componentOrientation", null);
        setBooleanField(term27532, term27532.getClass(), "newEventsOnly", false);
        setField(term27532, term27532.getClass(), "componentListener", null);
        setField(term27532, term27532.getClass(), "focusListener", null);
        setField(term27532, term27532.getClass(), "hierarchyListener", null);
        setField(term27532, term27532.getClass(), "hierarchyBoundsListener", null);
        setField(term27532, term27532.getClass(), "keyListener", null);
        setField(term27532, term27532.getClass(), "mouseListener", null);
        setField(term27532, term27532.getClass(), "mouseMotionListener", null);
        setField(term27532, term27532.getClass(), "mouseWheelListener", null);
        setField(term27532, term27532.getClass(), "inputMethodListener", null);
        setLongField(term27532, term27532.getClass(), "eventMask", 0L);
        setField(term27532, term27532.getClass(), "changeSupport", null);
        setField(term27532, term27532.getClass(), "objectLock", null);
        setBooleanField(term27532, term27532.getClass(), "isPacked", false);
        setIntField(term27532, term27532.getClass(), "boundsOp", 0);
        setField(term27532, term27532.getClass(), "compoundShape", null);
        setField(term27532, term27532.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27532, term27532.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27532, term27532.getClass(), "backgroundEraseDisabled", false);
        setField(term27532, term27532.getClass(), "eventCache", null);
        setBooleanField(term27532, term27532.getClass(), "coalescingEnabled", false);
        setBooleanField(term27532, term27532.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27532, term27532.getClass(), "componentSerializedDataVersion", 0);
        setField(term27532, term27532.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term27532, args);
    }

};


