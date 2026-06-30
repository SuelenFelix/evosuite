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
     Object term57396;

    public KCheckBox_setPreferences_2443060827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57396 = newInstance(Class.forName("proto.KCheckBox"));
        setBooleanField(term57396, term57396.getClass(), "flat", false);
        setField(term57396, term57396.getClass(), "model", null);
        setField(term57396, term57396.getClass(), "text", null);
        setField(term57396, term57396.getClass(), "margin", null);
        setField(term57396, term57396.getClass(), "defaultMargin", null);
        setField(term57396, term57396.getClass(), "defaultIcon", null);
        setField(term57396, term57396.getClass(), "pressedIcon", null);
        setField(term57396, term57396.getClass(), "disabledIcon", null);
        setField(term57396, term57396.getClass(), "selectedIcon", null);
        setField(term57396, term57396.getClass(), "disabledSelectedIcon", null);
        setField(term57396, term57396.getClass(), "rolloverIcon", null);
        setField(term57396, term57396.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term57396, term57396.getClass(), "paintBorder", false);
        setBooleanField(term57396, term57396.getClass(), "paintFocus", false);
        setBooleanField(term57396, term57396.getClass(), "rolloverEnabled", false);
        setBooleanField(term57396, term57396.getClass(), "contentAreaFilled", false);
        setIntField(term57396, term57396.getClass(), "verticalAlignment", 0);
        setIntField(term57396, term57396.getClass(), "horizontalAlignment", 0);
        setIntField(term57396, term57396.getClass(), "verticalTextPosition", 0);
        setIntField(term57396, term57396.getClass(), "horizontalTextPosition", 0);
        setIntField(term57396, term57396.getClass(), "iconTextGap", 0);
        setIntField(term57396, term57396.getClass(), "mnemonic", 0);
        setIntField(term57396, term57396.getClass(), "mnemonicIndex", 0);
        setLongField(term57396, term57396.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term57396, term57396.getClass(), "borderPaintedSet", false);
        setBooleanField(term57396, term57396.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term57396, term57396.getClass(), "iconTextGapSet", false);
        setBooleanField(term57396, term57396.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term57396, term57396.getClass(), "setLayout", false);
        setBooleanField(term57396, term57396.getClass(), "defaultCapable", false);
        setField(term57396, term57396.getClass(), "handler", null);
        setField(term57396, term57396.getClass(), "changeListener", null);
        setField(term57396, term57396.getClass(), "actionListener", null);
        setField(term57396, term57396.getClass(), "itemListener", null);
        setField(term57396, term57396.getClass(), "changeEvent", null);
        setBooleanField(term57396, term57396.getClass(), "hideActionText", false);
        setField(term57396, term57396.getClass(), "action", null);
        setField(term57396, term57396.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term57396, term57396.getClass(), "isAlignmentXSet", false);
        setFloatField(term57396, term57396.getClass(), "alignmentX", 0.0F);
        setBooleanField(term57396, term57396.getClass(), "isAlignmentYSet", false);
        setFloatField(term57396, term57396.getClass(), "alignmentY", 0.0F);
        setField(term57396, term57396.getClass(), "ui", null);
        setField(term57396, term57396.getClass(), "listenerList", null);
        setField(term57396, term57396.getClass(), "clientProperties", null);
        setField(term57396, term57396.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term57396, term57396.getClass(), "autoscrolls", false);
        setField(term57396, term57396.getClass(), "border", null);
        setIntField(term57396, term57396.getClass(), "flags", 0);
        setField(term57396, term57396.getClass(), "inputVerifier", null);
        setBooleanField(term57396, term57396.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term57396, term57396.getClass(), "paintingChild", null);
        setField(term57396, term57396.getClass(), "popupMenu", null);
        setField(term57396, term57396.getClass(), "revalidateRunnableScheduled", null);
        setField(term57396, term57396.getClass(), "focusInputMap", null);
        setField(term57396, term57396.getClass(), "ancestorInputMap", null);
        setField(term57396, term57396.getClass(), "windowInputMap", null);
        setField(term57396, term57396.getClass(), "actionMap", null);
        setField(term57396, term57396.getClass(), "aaHint", null);
        setField(term57396, term57396.getClass(), "lcdRenderingHint", null);
        setField(term57396, term57396.getClass(), "component", null);
        setField(term57396, term57396.getClass(), "layoutMgr", null);
        setField(term57396, term57396.getClass(), "dispatcher", null);
        setField(term57396, term57396.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57396, term57396.getClass(), "focusCycleRoot", false);
        setBooleanField(term57396, term57396.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57396, term57396.getClass(), "printingThreads", null);
        setBooleanField(term57396, term57396.getClass(), "printing", false);
        setField(term57396, term57396.getClass(), "containerListener", null);
        setIntField(term57396, term57396.getClass(), "listeningChildren", 0);
        setIntField(term57396, term57396.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57396, term57396.getClass(), "descendantsCount", 0);
        setField(term57396, term57396.getClass(), "preserveBackgroundColor", null);
        setIntField(term57396, term57396.getClass(), "numOfHWComponents", 0);
        setIntField(term57396, term57396.getClass(), "numOfLWComponents", 0);
        setField(term57396, term57396.getClass(), "modalComp", null);
        setField(term57396, term57396.getClass(), "modalAppContext", null);
        setIntField(term57396, term57396.getClass(), "containerSerializedDataVersion", 0);
        setField(term57396, term57396.getClass(), "peer", null);
        setField(term57396, term57396.getClass(), "parent", null);
        setField(term57396, term57396.getClass(), "appContext", null);
        setIntField(term57396, term57396.getClass(), "x", 0);
        setIntField(term57396, term57396.getClass(), "y", 0);
        setIntField(term57396, term57396.getClass(), "width", 0);
        setIntField(term57396, term57396.getClass(), "height", 0);
        setField(term57396, term57396.getClass(), "foreground", null);
        setField(term57396, term57396.getClass(), "background", null);
        setField(term57396, term57396.getClass(), "font", null);
        setField(term57396, term57396.getClass(), "peerFont", null);
        setField(term57396, term57396.getClass(), "cursor", null);
        setField(term57396, term57396.getClass(), "locale", null);
        setField(term57396, term57396.getClass(), "graphicsConfig", null);
        setField(term57396, term57396.getClass(), "bufferStrategy", null);
        setBooleanField(term57396, term57396.getClass(), "ignoreRepaint", false);
        setBooleanField(term57396, term57396.getClass(), "visible", false);
        setBooleanField(term57396, term57396.getClass(), "enabled", false);
        setBooleanField(term57396, term57396.getClass(), "valid", false);
        setField(term57396, term57396.getClass(), "dropTarget", null);
        setField(term57396, term57396.getClass(), "popups", null);
        setField(term57396, term57396.getClass(), "name", null);
        setBooleanField(term57396, term57396.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57396, term57396.getClass(), "focusable", false);
        setIntField(term57396, term57396.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57396, term57396.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57396, term57396.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57396, term57396.getClass(), "acc", null);
        setField(term57396, term57396.getClass(), "minSize", null);
        setBooleanField(term57396, term57396.getClass(), "minSizeSet", false);
        setField(term57396, term57396.getClass(), "prefSize", null);
        setBooleanField(term57396, term57396.getClass(), "prefSizeSet", false);
        setField(term57396, term57396.getClass(), "maxSize", null);
        setBooleanField(term57396, term57396.getClass(), "maxSizeSet", false);
        setField(term57396, term57396.getClass(), "componentOrientation", null);
        setBooleanField(term57396, term57396.getClass(), "newEventsOnly", false);
        setField(term57396, term57396.getClass(), "componentListener", null);
        setField(term57396, term57396.getClass(), "focusListener", null);
        setField(term57396, term57396.getClass(), "hierarchyListener", null);
        setField(term57396, term57396.getClass(), "hierarchyBoundsListener", null);
        setField(term57396, term57396.getClass(), "keyListener", null);
        setField(term57396, term57396.getClass(), "mouseListener", null);
        setField(term57396, term57396.getClass(), "mouseMotionListener", null);
        setField(term57396, term57396.getClass(), "mouseWheelListener", null);
        setField(term57396, term57396.getClass(), "inputMethodListener", null);
        setLongField(term57396, term57396.getClass(), "eventMask", 0L);
        setField(term57396, term57396.getClass(), "changeSupport", null);
        setField(term57396, term57396.getClass(), "objectLock", null);
        setBooleanField(term57396, term57396.getClass(), "isPacked", false);
        setIntField(term57396, term57396.getClass(), "boundsOp", 0);
        setField(term57396, term57396.getClass(), "compoundShape", null);
        setField(term57396, term57396.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57396, term57396.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57396, term57396.getClass(), "backgroundEraseDisabled", false);
        setField(term57396, term57396.getClass(), "eventCache", null);
        setBooleanField(term57396, term57396.getClass(), "coalescingEnabled", false);
        setBooleanField(term57396, term57396.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57396, term57396.getClass(), "componentSerializedDataVersion", 0);
        setField(term57396, term57396.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term57396, args);
    }

};


