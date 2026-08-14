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

public class KMenuItem_setPreferences_17008299335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14838;

    public KMenuItem_setPreferences_17008299335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14838 = newInstance(Class.forName("proto.KMenuItem"));
        setBooleanField(term14838, term14838.getClass(), "isMouseDragged", false);
        setField(term14838, term14838.getClass(), "accelerator", null);
        setField(term14838, term14838.getClass(), "model", null);
        setField(term14838, term14838.getClass(), "text", null);
        setField(term14838, term14838.getClass(), "margin", null);
        setField(term14838, term14838.getClass(), "defaultMargin", null);
        setField(term14838, term14838.getClass(), "defaultIcon", null);
        setField(term14838, term14838.getClass(), "pressedIcon", null);
        setField(term14838, term14838.getClass(), "disabledIcon", null);
        setField(term14838, term14838.getClass(), "selectedIcon", null);
        setField(term14838, term14838.getClass(), "disabledSelectedIcon", null);
        setField(term14838, term14838.getClass(), "rolloverIcon", null);
        setField(term14838, term14838.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term14838, term14838.getClass(), "paintBorder", false);
        setBooleanField(term14838, term14838.getClass(), "paintFocus", false);
        setBooleanField(term14838, term14838.getClass(), "rolloverEnabled", false);
        setBooleanField(term14838, term14838.getClass(), "contentAreaFilled", false);
        setIntField(term14838, term14838.getClass(), "verticalAlignment", 0);
        setIntField(term14838, term14838.getClass(), "horizontalAlignment", 0);
        setIntField(term14838, term14838.getClass(), "verticalTextPosition", 0);
        setIntField(term14838, term14838.getClass(), "horizontalTextPosition", 0);
        setIntField(term14838, term14838.getClass(), "iconTextGap", 0);
        setIntField(term14838, term14838.getClass(), "mnemonic", 0);
        setIntField(term14838, term14838.getClass(), "mnemonicIndex", 0);
        setLongField(term14838, term14838.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term14838, term14838.getClass(), "borderPaintedSet", false);
        setBooleanField(term14838, term14838.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term14838, term14838.getClass(), "iconTextGapSet", false);
        setBooleanField(term14838, term14838.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term14838, term14838.getClass(), "setLayout", false);
        setBooleanField(term14838, term14838.getClass(), "defaultCapable", false);
        setField(term14838, term14838.getClass(), "handler", null);
        setField(term14838, term14838.getClass(), "changeListener", null);
        setField(term14838, term14838.getClass(), "actionListener", null);
        setField(term14838, term14838.getClass(), "itemListener", null);
        setField(term14838, term14838.getClass(), "changeEvent", null);
        setBooleanField(term14838, term14838.getClass(), "hideActionText", false);
        setField(term14838, term14838.getClass(), "action", null);
        setField(term14838, term14838.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term14838, term14838.getClass(), "isAlignmentXSet", false);
        setFloatField(term14838, term14838.getClass(), "alignmentX", 0.0F);
        setBooleanField(term14838, term14838.getClass(), "isAlignmentYSet", false);
        setFloatField(term14838, term14838.getClass(), "alignmentY", 0.0F);
        setField(term14838, term14838.getClass(), "ui", null);
        setField(term14838, term14838.getClass(), "listenerList", null);
        setField(term14838, term14838.getClass(), "clientProperties", null);
        setField(term14838, term14838.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term14838, term14838.getClass(), "autoscrolls", false);
        setField(term14838, term14838.getClass(), "border", null);
        setIntField(term14838, term14838.getClass(), "flags", 0);
        setField(term14838, term14838.getClass(), "inputVerifier", null);
        setBooleanField(term14838, term14838.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term14838, term14838.getClass(), "paintingChild", null);
        setField(term14838, term14838.getClass(), "popupMenu", null);
        setField(term14838, term14838.getClass(), "revalidateRunnableScheduled", null);
        setField(term14838, term14838.getClass(), "focusInputMap", null);
        setField(term14838, term14838.getClass(), "ancestorInputMap", null);
        setField(term14838, term14838.getClass(), "windowInputMap", null);
        setField(term14838, term14838.getClass(), "actionMap", null);
        setField(term14838, term14838.getClass(), "aaHint", null);
        setField(term14838, term14838.getClass(), "lcdRenderingHint", null);
        setField(term14838, term14838.getClass(), "component", null);
        setField(term14838, term14838.getClass(), "layoutMgr", null);
        setField(term14838, term14838.getClass(), "dispatcher", null);
        setField(term14838, term14838.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term14838, term14838.getClass(), "focusCycleRoot", false);
        setBooleanField(term14838, term14838.getClass(), "focusTraversalPolicyProvider", false);
        setField(term14838, term14838.getClass(), "printingThreads", null);
        setBooleanField(term14838, term14838.getClass(), "printing", false);
        setField(term14838, term14838.getClass(), "containerListener", null);
        setIntField(term14838, term14838.getClass(), "listeningChildren", 0);
        setIntField(term14838, term14838.getClass(), "listeningBoundsChildren", 0);
        setIntField(term14838, term14838.getClass(), "descendantsCount", 0);
        setField(term14838, term14838.getClass(), "preserveBackgroundColor", null);
        setIntField(term14838, term14838.getClass(), "numOfHWComponents", 0);
        setIntField(term14838, term14838.getClass(), "numOfLWComponents", 0);
        setField(term14838, term14838.getClass(), "modalComp", null);
        setField(term14838, term14838.getClass(), "modalAppContext", null);
        setIntField(term14838, term14838.getClass(), "containerSerializedDataVersion", 0);
        setField(term14838, term14838.getClass(), "peer", null);
        setField(term14838, term14838.getClass(), "parent", null);
        setField(term14838, term14838.getClass(), "appContext", null);
        setIntField(term14838, term14838.getClass(), "x", 0);
        setIntField(term14838, term14838.getClass(), "y", 0);
        setIntField(term14838, term14838.getClass(), "width", 0);
        setIntField(term14838, term14838.getClass(), "height", 0);
        setField(term14838, term14838.getClass(), "foreground", null);
        setField(term14838, term14838.getClass(), "background", null);
        setField(term14838, term14838.getClass(), "font", null);
        setField(term14838, term14838.getClass(), "peerFont", null);
        setField(term14838, term14838.getClass(), "cursor", null);
        setField(term14838, term14838.getClass(), "locale", null);
        setField(term14838, term14838.getClass(), "graphicsConfig", null);
        setField(term14838, term14838.getClass(), "bufferStrategy", null);
        setBooleanField(term14838, term14838.getClass(), "ignoreRepaint", false);
        setBooleanField(term14838, term14838.getClass(), "visible", false);
        setBooleanField(term14838, term14838.getClass(), "enabled", false);
        setBooleanField(term14838, term14838.getClass(), "valid", false);
        setField(term14838, term14838.getClass(), "dropTarget", null);
        setField(term14838, term14838.getClass(), "popups", null);
        setField(term14838, term14838.getClass(), "name", null);
        setBooleanField(term14838, term14838.getClass(), "nameExplicitlySet", false);
        setBooleanField(term14838, term14838.getClass(), "focusable", false);
        setIntField(term14838, term14838.getClass(), "isFocusTraversableOverridden", 0);
        setField(term14838, term14838.getClass(), "focusTraversalKeys", null);
        setBooleanField(term14838, term14838.getClass(), "focusTraversalKeysEnabled", false);
        setField(term14838, term14838.getClass(), "acc", null);
        setField(term14838, term14838.getClass(), "minSize", null);
        setBooleanField(term14838, term14838.getClass(), "minSizeSet", false);
        setField(term14838, term14838.getClass(), "prefSize", null);
        setBooleanField(term14838, term14838.getClass(), "prefSizeSet", false);
        setField(term14838, term14838.getClass(), "maxSize", null);
        setBooleanField(term14838, term14838.getClass(), "maxSizeSet", false);
        setField(term14838, term14838.getClass(), "componentOrientation", null);
        setBooleanField(term14838, term14838.getClass(), "newEventsOnly", false);
        setField(term14838, term14838.getClass(), "componentListener", null);
        setField(term14838, term14838.getClass(), "focusListener", null);
        setField(term14838, term14838.getClass(), "hierarchyListener", null);
        setField(term14838, term14838.getClass(), "hierarchyBoundsListener", null);
        setField(term14838, term14838.getClass(), "keyListener", null);
        setField(term14838, term14838.getClass(), "mouseListener", null);
        setField(term14838, term14838.getClass(), "mouseMotionListener", null);
        setField(term14838, term14838.getClass(), "mouseWheelListener", null);
        setField(term14838, term14838.getClass(), "inputMethodListener", null);
        setLongField(term14838, term14838.getClass(), "eventMask", 0L);
        setField(term14838, term14838.getClass(), "changeSupport", null);
        setField(term14838, term14838.getClass(), "objectLock", null);
        setBooleanField(term14838, term14838.getClass(), "isPacked", false);
        setIntField(term14838, term14838.getClass(), "boundsOp", 0);
        setField(term14838, term14838.getClass(), "compoundShape", null);
        setField(term14838, term14838.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term14838, term14838.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term14838, term14838.getClass(), "backgroundEraseDisabled", false);
        setField(term14838, term14838.getClass(), "eventCache", null);
        setBooleanField(term14838, term14838.getClass(), "coalescingEnabled", false);
        setBooleanField(term14838, term14838.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term14838, term14838.getClass(), "componentSerializedDataVersion", 0);
        setField(term14838, term14838.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KMenuItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term14838, args);
    }

};


