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
     Object term57335;

    public KCheckBox_createToolTip_18788397146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57335 = newInstance(Class.forName("proto.KCheckBox"));
        setBooleanField(term57335, term57335.getClass(), "flat", false);
        setField(term57335, term57335.getClass(), "model", null);
        setField(term57335, term57335.getClass(), "text", null);
        setField(term57335, term57335.getClass(), "margin", null);
        setField(term57335, term57335.getClass(), "defaultMargin", null);
        setField(term57335, term57335.getClass(), "defaultIcon", null);
        setField(term57335, term57335.getClass(), "pressedIcon", null);
        setField(term57335, term57335.getClass(), "disabledIcon", null);
        setField(term57335, term57335.getClass(), "selectedIcon", null);
        setField(term57335, term57335.getClass(), "disabledSelectedIcon", null);
        setField(term57335, term57335.getClass(), "rolloverIcon", null);
        setField(term57335, term57335.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term57335, term57335.getClass(), "paintBorder", false);
        setBooleanField(term57335, term57335.getClass(), "paintFocus", false);
        setBooleanField(term57335, term57335.getClass(), "rolloverEnabled", false);
        setBooleanField(term57335, term57335.getClass(), "contentAreaFilled", false);
        setIntField(term57335, term57335.getClass(), "verticalAlignment", 0);
        setIntField(term57335, term57335.getClass(), "horizontalAlignment", 0);
        setIntField(term57335, term57335.getClass(), "verticalTextPosition", 0);
        setIntField(term57335, term57335.getClass(), "horizontalTextPosition", 0);
        setIntField(term57335, term57335.getClass(), "iconTextGap", 0);
        setIntField(term57335, term57335.getClass(), "mnemonic", 0);
        setIntField(term57335, term57335.getClass(), "mnemonicIndex", 0);
        setLongField(term57335, term57335.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term57335, term57335.getClass(), "borderPaintedSet", false);
        setBooleanField(term57335, term57335.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term57335, term57335.getClass(), "iconTextGapSet", false);
        setBooleanField(term57335, term57335.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term57335, term57335.getClass(), "setLayout", false);
        setBooleanField(term57335, term57335.getClass(), "defaultCapable", false);
        setField(term57335, term57335.getClass(), "handler", null);
        setField(term57335, term57335.getClass(), "changeListener", null);
        setField(term57335, term57335.getClass(), "actionListener", null);
        setField(term57335, term57335.getClass(), "itemListener", null);
        setField(term57335, term57335.getClass(), "changeEvent", null);
        setBooleanField(term57335, term57335.getClass(), "hideActionText", false);
        setField(term57335, term57335.getClass(), "action", null);
        setField(term57335, term57335.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term57335, term57335.getClass(), "isAlignmentXSet", false);
        setFloatField(term57335, term57335.getClass(), "alignmentX", 0.0F);
        setBooleanField(term57335, term57335.getClass(), "isAlignmentYSet", false);
        setFloatField(term57335, term57335.getClass(), "alignmentY", 0.0F);
        setField(term57335, term57335.getClass(), "ui", null);
        setField(term57335, term57335.getClass(), "listenerList", null);
        setField(term57335, term57335.getClass(), "clientProperties", null);
        setField(term57335, term57335.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term57335, term57335.getClass(), "autoscrolls", false);
        setField(term57335, term57335.getClass(), "border", null);
        setIntField(term57335, term57335.getClass(), "flags", 0);
        setField(term57335, term57335.getClass(), "inputVerifier", null);
        setBooleanField(term57335, term57335.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term57335, term57335.getClass(), "paintingChild", null);
        setField(term57335, term57335.getClass(), "popupMenu", null);
        setField(term57335, term57335.getClass(), "revalidateRunnableScheduled", null);
        setField(term57335, term57335.getClass(), "focusInputMap", null);
        setField(term57335, term57335.getClass(), "ancestorInputMap", null);
        setField(term57335, term57335.getClass(), "windowInputMap", null);
        setField(term57335, term57335.getClass(), "actionMap", null);
        setField(term57335, term57335.getClass(), "aaHint", null);
        setField(term57335, term57335.getClass(), "lcdRenderingHint", null);
        setField(term57335, term57335.getClass(), "component", null);
        setField(term57335, term57335.getClass(), "layoutMgr", null);
        setField(term57335, term57335.getClass(), "dispatcher", null);
        setField(term57335, term57335.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57335, term57335.getClass(), "focusCycleRoot", false);
        setBooleanField(term57335, term57335.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57335, term57335.getClass(), "printingThreads", null);
        setBooleanField(term57335, term57335.getClass(), "printing", false);
        setField(term57335, term57335.getClass(), "containerListener", null);
        setIntField(term57335, term57335.getClass(), "listeningChildren", 0);
        setIntField(term57335, term57335.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57335, term57335.getClass(), "descendantsCount", 0);
        setField(term57335, term57335.getClass(), "preserveBackgroundColor", null);
        setIntField(term57335, term57335.getClass(), "numOfHWComponents", 0);
        setIntField(term57335, term57335.getClass(), "numOfLWComponents", 0);
        setField(term57335, term57335.getClass(), "modalComp", null);
        setField(term57335, term57335.getClass(), "modalAppContext", null);
        setIntField(term57335, term57335.getClass(), "containerSerializedDataVersion", 0);
        setField(term57335, term57335.getClass(), "peer", null);
        setField(term57335, term57335.getClass(), "parent", null);
        setField(term57335, term57335.getClass(), "appContext", null);
        setIntField(term57335, term57335.getClass(), "x", 0);
        setIntField(term57335, term57335.getClass(), "y", 0);
        setIntField(term57335, term57335.getClass(), "width", 0);
        setIntField(term57335, term57335.getClass(), "height", 0);
        setField(term57335, term57335.getClass(), "foreground", null);
        setField(term57335, term57335.getClass(), "background", null);
        setField(term57335, term57335.getClass(), "font", null);
        setField(term57335, term57335.getClass(), "peerFont", null);
        setField(term57335, term57335.getClass(), "cursor", null);
        setField(term57335, term57335.getClass(), "locale", null);
        setField(term57335, term57335.getClass(), "graphicsConfig", null);
        setField(term57335, term57335.getClass(), "bufferStrategy", null);
        setBooleanField(term57335, term57335.getClass(), "ignoreRepaint", false);
        setBooleanField(term57335, term57335.getClass(), "visible", false);
        setBooleanField(term57335, term57335.getClass(), "enabled", false);
        setBooleanField(term57335, term57335.getClass(), "valid", false);
        setField(term57335, term57335.getClass(), "dropTarget", null);
        setField(term57335, term57335.getClass(), "popups", null);
        setField(term57335, term57335.getClass(), "name", null);
        setBooleanField(term57335, term57335.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57335, term57335.getClass(), "focusable", false);
        setIntField(term57335, term57335.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57335, term57335.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57335, term57335.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57335, term57335.getClass(), "acc", null);
        setField(term57335, term57335.getClass(), "minSize", null);
        setBooleanField(term57335, term57335.getClass(), "minSizeSet", false);
        setField(term57335, term57335.getClass(), "prefSize", null);
        setBooleanField(term57335, term57335.getClass(), "prefSizeSet", false);
        setField(term57335, term57335.getClass(), "maxSize", null);
        setBooleanField(term57335, term57335.getClass(), "maxSizeSet", false);
        setField(term57335, term57335.getClass(), "componentOrientation", null);
        setBooleanField(term57335, term57335.getClass(), "newEventsOnly", false);
        setField(term57335, term57335.getClass(), "componentListener", null);
        setField(term57335, term57335.getClass(), "focusListener", null);
        setField(term57335, term57335.getClass(), "hierarchyListener", null);
        setField(term57335, term57335.getClass(), "hierarchyBoundsListener", null);
        setField(term57335, term57335.getClass(), "keyListener", null);
        setField(term57335, term57335.getClass(), "mouseListener", null);
        setField(term57335, term57335.getClass(), "mouseMotionListener", null);
        setField(term57335, term57335.getClass(), "mouseWheelListener", null);
        setField(term57335, term57335.getClass(), "inputMethodListener", null);
        setLongField(term57335, term57335.getClass(), "eventMask", 0L);
        setField(term57335, term57335.getClass(), "changeSupport", null);
        setField(term57335, term57335.getClass(), "objectLock", null);
        setBooleanField(term57335, term57335.getClass(), "isPacked", false);
        setIntField(term57335, term57335.getClass(), "boundsOp", 0);
        setField(term57335, term57335.getClass(), "compoundShape", null);
        setField(term57335, term57335.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57335, term57335.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57335, term57335.getClass(), "backgroundEraseDisabled", false);
        setField(term57335, term57335.getClass(), "eventCache", null);
        setBooleanField(term57335, term57335.getClass(), "coalescingEnabled", false);
        setBooleanField(term57335, term57335.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57335, term57335.getClass(), "componentSerializedDataVersion", 0);
        setField(term57335, term57335.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term57335, args);
    }

};


