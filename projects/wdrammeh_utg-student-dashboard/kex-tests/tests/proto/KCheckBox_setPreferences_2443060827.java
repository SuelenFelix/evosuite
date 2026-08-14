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

public class KCheckBox_setPreferences_2443060827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57445;

    public KCheckBox_setPreferences_2443060827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57445 = newInstance(Class.forName("proto.KCheckBox"));
        setBooleanField(term57445, term57445.getClass(), "flat", false);
        setField(term57445, term57445.getClass(), "model", null);
        setField(term57445, term57445.getClass(), "text", null);
        setField(term57445, term57445.getClass(), "margin", null);
        setField(term57445, term57445.getClass(), "defaultMargin", null);
        setField(term57445, term57445.getClass(), "defaultIcon", null);
        setField(term57445, term57445.getClass(), "pressedIcon", null);
        setField(term57445, term57445.getClass(), "disabledIcon", null);
        setField(term57445, term57445.getClass(), "selectedIcon", null);
        setField(term57445, term57445.getClass(), "disabledSelectedIcon", null);
        setField(term57445, term57445.getClass(), "rolloverIcon", null);
        setField(term57445, term57445.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term57445, term57445.getClass(), "paintBorder", false);
        setBooleanField(term57445, term57445.getClass(), "paintFocus", false);
        setBooleanField(term57445, term57445.getClass(), "rolloverEnabled", false);
        setBooleanField(term57445, term57445.getClass(), "contentAreaFilled", false);
        setIntField(term57445, term57445.getClass(), "verticalAlignment", 0);
        setIntField(term57445, term57445.getClass(), "horizontalAlignment", 0);
        setIntField(term57445, term57445.getClass(), "verticalTextPosition", 0);
        setIntField(term57445, term57445.getClass(), "horizontalTextPosition", 0);
        setIntField(term57445, term57445.getClass(), "iconTextGap", 0);
        setIntField(term57445, term57445.getClass(), "mnemonic", 0);
        setIntField(term57445, term57445.getClass(), "mnemonicIndex", 0);
        setLongField(term57445, term57445.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term57445, term57445.getClass(), "borderPaintedSet", false);
        setBooleanField(term57445, term57445.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term57445, term57445.getClass(), "iconTextGapSet", false);
        setBooleanField(term57445, term57445.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term57445, term57445.getClass(), "setLayout", false);
        setBooleanField(term57445, term57445.getClass(), "defaultCapable", false);
        setField(term57445, term57445.getClass(), "handler", null);
        setField(term57445, term57445.getClass(), "changeListener", null);
        setField(term57445, term57445.getClass(), "actionListener", null);
        setField(term57445, term57445.getClass(), "itemListener", null);
        setField(term57445, term57445.getClass(), "changeEvent", null);
        setBooleanField(term57445, term57445.getClass(), "hideActionText", false);
        setField(term57445, term57445.getClass(), "action", null);
        setField(term57445, term57445.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term57445, term57445.getClass(), "isAlignmentXSet", false);
        setFloatField(term57445, term57445.getClass(), "alignmentX", 0.0F);
        setBooleanField(term57445, term57445.getClass(), "isAlignmentYSet", false);
        setFloatField(term57445, term57445.getClass(), "alignmentY", 0.0F);
        setField(term57445, term57445.getClass(), "ui", null);
        setField(term57445, term57445.getClass(), "listenerList", null);
        setField(term57445, term57445.getClass(), "clientProperties", null);
        setField(term57445, term57445.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term57445, term57445.getClass(), "autoscrolls", false);
        setField(term57445, term57445.getClass(), "border", null);
        setIntField(term57445, term57445.getClass(), "flags", 0);
        setField(term57445, term57445.getClass(), "inputVerifier", null);
        setBooleanField(term57445, term57445.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term57445, term57445.getClass(), "paintingChild", null);
        setField(term57445, term57445.getClass(), "popupMenu", null);
        setField(term57445, term57445.getClass(), "revalidateRunnableScheduled", null);
        setField(term57445, term57445.getClass(), "focusInputMap", null);
        setField(term57445, term57445.getClass(), "ancestorInputMap", null);
        setField(term57445, term57445.getClass(), "windowInputMap", null);
        setField(term57445, term57445.getClass(), "actionMap", null);
        setField(term57445, term57445.getClass(), "aaHint", null);
        setField(term57445, term57445.getClass(), "lcdRenderingHint", null);
        setField(term57445, term57445.getClass(), "component", null);
        setField(term57445, term57445.getClass(), "layoutMgr", null);
        setField(term57445, term57445.getClass(), "dispatcher", null);
        setField(term57445, term57445.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57445, term57445.getClass(), "focusCycleRoot", false);
        setBooleanField(term57445, term57445.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57445, term57445.getClass(), "printingThreads", null);
        setBooleanField(term57445, term57445.getClass(), "printing", false);
        setField(term57445, term57445.getClass(), "containerListener", null);
        setIntField(term57445, term57445.getClass(), "listeningChildren", 0);
        setIntField(term57445, term57445.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57445, term57445.getClass(), "descendantsCount", 0);
        setField(term57445, term57445.getClass(), "preserveBackgroundColor", null);
        setIntField(term57445, term57445.getClass(), "numOfHWComponents", 0);
        setIntField(term57445, term57445.getClass(), "numOfLWComponents", 0);
        setField(term57445, term57445.getClass(), "modalComp", null);
        setField(term57445, term57445.getClass(), "modalAppContext", null);
        setIntField(term57445, term57445.getClass(), "containerSerializedDataVersion", 0);
        setField(term57445, term57445.getClass(), "peer", null);
        setField(term57445, term57445.getClass(), "parent", null);
        setField(term57445, term57445.getClass(), "appContext", null);
        setIntField(term57445, term57445.getClass(), "x", 0);
        setIntField(term57445, term57445.getClass(), "y", 0);
        setIntField(term57445, term57445.getClass(), "width", 0);
        setIntField(term57445, term57445.getClass(), "height", 0);
        setField(term57445, term57445.getClass(), "foreground", null);
        setField(term57445, term57445.getClass(), "background", null);
        setField(term57445, term57445.getClass(), "font", null);
        setField(term57445, term57445.getClass(), "peerFont", null);
        setField(term57445, term57445.getClass(), "cursor", null);
        setField(term57445, term57445.getClass(), "locale", null);
        setField(term57445, term57445.getClass(), "graphicsConfig", null);
        setField(term57445, term57445.getClass(), "bufferStrategy", null);
        setBooleanField(term57445, term57445.getClass(), "ignoreRepaint", false);
        setBooleanField(term57445, term57445.getClass(), "visible", false);
        setBooleanField(term57445, term57445.getClass(), "enabled", false);
        setBooleanField(term57445, term57445.getClass(), "valid", false);
        setField(term57445, term57445.getClass(), "dropTarget", null);
        setField(term57445, term57445.getClass(), "popups", null);
        setField(term57445, term57445.getClass(), "name", null);
        setBooleanField(term57445, term57445.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57445, term57445.getClass(), "focusable", false);
        setIntField(term57445, term57445.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57445, term57445.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57445, term57445.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57445, term57445.getClass(), "acc", null);
        setField(term57445, term57445.getClass(), "minSize", null);
        setBooleanField(term57445, term57445.getClass(), "minSizeSet", false);
        setField(term57445, term57445.getClass(), "prefSize", null);
        setBooleanField(term57445, term57445.getClass(), "prefSizeSet", false);
        setField(term57445, term57445.getClass(), "maxSize", null);
        setBooleanField(term57445, term57445.getClass(), "maxSizeSet", false);
        setField(term57445, term57445.getClass(), "componentOrientation", null);
        setBooleanField(term57445, term57445.getClass(), "newEventsOnly", false);
        setField(term57445, term57445.getClass(), "componentListener", null);
        setField(term57445, term57445.getClass(), "focusListener", null);
        setField(term57445, term57445.getClass(), "hierarchyListener", null);
        setField(term57445, term57445.getClass(), "hierarchyBoundsListener", null);
        setField(term57445, term57445.getClass(), "keyListener", null);
        setField(term57445, term57445.getClass(), "mouseListener", null);
        setField(term57445, term57445.getClass(), "mouseMotionListener", null);
        setField(term57445, term57445.getClass(), "mouseWheelListener", null);
        setField(term57445, term57445.getClass(), "inputMethodListener", null);
        setLongField(term57445, term57445.getClass(), "eventMask", 0L);
        setField(term57445, term57445.getClass(), "changeSupport", null);
        setField(term57445, term57445.getClass(), "objectLock", null);
        setBooleanField(term57445, term57445.getClass(), "isPacked", false);
        setIntField(term57445, term57445.getClass(), "boundsOp", 0);
        setField(term57445, term57445.getClass(), "compoundShape", null);
        setField(term57445, term57445.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57445, term57445.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57445, term57445.getClass(), "backgroundEraseDisabled", false);
        setField(term57445, term57445.getClass(), "eventCache", null);
        setBooleanField(term57445, term57445.getClass(), "coalescingEnabled", false);
        setBooleanField(term57445, term57445.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57445, term57445.getClass(), "componentSerializedDataVersion", 0);
        setField(term57445, term57445.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term57445, args);
    }

};


