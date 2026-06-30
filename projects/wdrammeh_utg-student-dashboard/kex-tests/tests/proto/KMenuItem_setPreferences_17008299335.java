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
     Object term14841;

    public KMenuItem_setPreferences_17008299335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14841 = newInstance(Class.forName("proto.KMenuItem"));
        setBooleanField(term14841, term14841.getClass(), "isMouseDragged", false);
        setField(term14841, term14841.getClass(), "accelerator", null);
        setField(term14841, term14841.getClass(), "model", null);
        setField(term14841, term14841.getClass(), "text", null);
        setField(term14841, term14841.getClass(), "margin", null);
        setField(term14841, term14841.getClass(), "defaultMargin", null);
        setField(term14841, term14841.getClass(), "defaultIcon", null);
        setField(term14841, term14841.getClass(), "pressedIcon", null);
        setField(term14841, term14841.getClass(), "disabledIcon", null);
        setField(term14841, term14841.getClass(), "selectedIcon", null);
        setField(term14841, term14841.getClass(), "disabledSelectedIcon", null);
        setField(term14841, term14841.getClass(), "rolloverIcon", null);
        setField(term14841, term14841.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term14841, term14841.getClass(), "paintBorder", false);
        setBooleanField(term14841, term14841.getClass(), "paintFocus", false);
        setBooleanField(term14841, term14841.getClass(), "rolloverEnabled", false);
        setBooleanField(term14841, term14841.getClass(), "contentAreaFilled", false);
        setIntField(term14841, term14841.getClass(), "verticalAlignment", 0);
        setIntField(term14841, term14841.getClass(), "horizontalAlignment", 0);
        setIntField(term14841, term14841.getClass(), "verticalTextPosition", 0);
        setIntField(term14841, term14841.getClass(), "horizontalTextPosition", 0);
        setIntField(term14841, term14841.getClass(), "iconTextGap", 0);
        setIntField(term14841, term14841.getClass(), "mnemonic", 0);
        setIntField(term14841, term14841.getClass(), "mnemonicIndex", 0);
        setLongField(term14841, term14841.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term14841, term14841.getClass(), "borderPaintedSet", false);
        setBooleanField(term14841, term14841.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term14841, term14841.getClass(), "iconTextGapSet", false);
        setBooleanField(term14841, term14841.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term14841, term14841.getClass(), "setLayout", false);
        setBooleanField(term14841, term14841.getClass(), "defaultCapable", false);
        setField(term14841, term14841.getClass(), "handler", null);
        setField(term14841, term14841.getClass(), "changeListener", null);
        setField(term14841, term14841.getClass(), "actionListener", null);
        setField(term14841, term14841.getClass(), "itemListener", null);
        setField(term14841, term14841.getClass(), "changeEvent", null);
        setBooleanField(term14841, term14841.getClass(), "hideActionText", false);
        setField(term14841, term14841.getClass(), "action", null);
        setField(term14841, term14841.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term14841, term14841.getClass(), "isAlignmentXSet", false);
        setFloatField(term14841, term14841.getClass(), "alignmentX", 0.0F);
        setBooleanField(term14841, term14841.getClass(), "isAlignmentYSet", false);
        setFloatField(term14841, term14841.getClass(), "alignmentY", 0.0F);
        setField(term14841, term14841.getClass(), "ui", null);
        setField(term14841, term14841.getClass(), "listenerList", null);
        setField(term14841, term14841.getClass(), "clientProperties", null);
        setField(term14841, term14841.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term14841, term14841.getClass(), "autoscrolls", false);
        setField(term14841, term14841.getClass(), "border", null);
        setIntField(term14841, term14841.getClass(), "flags", 0);
        setField(term14841, term14841.getClass(), "inputVerifier", null);
        setBooleanField(term14841, term14841.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term14841, term14841.getClass(), "paintingChild", null);
        setField(term14841, term14841.getClass(), "popupMenu", null);
        setField(term14841, term14841.getClass(), "revalidateRunnableScheduled", null);
        setField(term14841, term14841.getClass(), "focusInputMap", null);
        setField(term14841, term14841.getClass(), "ancestorInputMap", null);
        setField(term14841, term14841.getClass(), "windowInputMap", null);
        setField(term14841, term14841.getClass(), "actionMap", null);
        setField(term14841, term14841.getClass(), "aaHint", null);
        setField(term14841, term14841.getClass(), "lcdRenderingHint", null);
        setField(term14841, term14841.getClass(), "component", null);
        setField(term14841, term14841.getClass(), "layoutMgr", null);
        setField(term14841, term14841.getClass(), "dispatcher", null);
        setField(term14841, term14841.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term14841, term14841.getClass(), "focusCycleRoot", false);
        setBooleanField(term14841, term14841.getClass(), "focusTraversalPolicyProvider", false);
        setField(term14841, term14841.getClass(), "printingThreads", null);
        setBooleanField(term14841, term14841.getClass(), "printing", false);
        setField(term14841, term14841.getClass(), "containerListener", null);
        setIntField(term14841, term14841.getClass(), "listeningChildren", 0);
        setIntField(term14841, term14841.getClass(), "listeningBoundsChildren", 0);
        setIntField(term14841, term14841.getClass(), "descendantsCount", 0);
        setField(term14841, term14841.getClass(), "preserveBackgroundColor", null);
        setIntField(term14841, term14841.getClass(), "numOfHWComponents", 0);
        setIntField(term14841, term14841.getClass(), "numOfLWComponents", 0);
        setField(term14841, term14841.getClass(), "modalComp", null);
        setField(term14841, term14841.getClass(), "modalAppContext", null);
        setIntField(term14841, term14841.getClass(), "containerSerializedDataVersion", 0);
        setField(term14841, term14841.getClass(), "peer", null);
        setField(term14841, term14841.getClass(), "parent", null);
        setField(term14841, term14841.getClass(), "appContext", null);
        setIntField(term14841, term14841.getClass(), "x", 0);
        setIntField(term14841, term14841.getClass(), "y", 0);
        setIntField(term14841, term14841.getClass(), "width", 0);
        setIntField(term14841, term14841.getClass(), "height", 0);
        setField(term14841, term14841.getClass(), "foreground", null);
        setField(term14841, term14841.getClass(), "background", null);
        setField(term14841, term14841.getClass(), "font", null);
        setField(term14841, term14841.getClass(), "peerFont", null);
        setField(term14841, term14841.getClass(), "cursor", null);
        setField(term14841, term14841.getClass(), "locale", null);
        setField(term14841, term14841.getClass(), "graphicsConfig", null);
        setField(term14841, term14841.getClass(), "bufferStrategy", null);
        setBooleanField(term14841, term14841.getClass(), "ignoreRepaint", false);
        setBooleanField(term14841, term14841.getClass(), "visible", false);
        setBooleanField(term14841, term14841.getClass(), "enabled", false);
        setBooleanField(term14841, term14841.getClass(), "valid", false);
        setField(term14841, term14841.getClass(), "dropTarget", null);
        setField(term14841, term14841.getClass(), "popups", null);
        setField(term14841, term14841.getClass(), "name", null);
        setBooleanField(term14841, term14841.getClass(), "nameExplicitlySet", false);
        setBooleanField(term14841, term14841.getClass(), "focusable", false);
        setIntField(term14841, term14841.getClass(), "isFocusTraversableOverridden", 0);
        setField(term14841, term14841.getClass(), "focusTraversalKeys", null);
        setBooleanField(term14841, term14841.getClass(), "focusTraversalKeysEnabled", false);
        setField(term14841, term14841.getClass(), "acc", null);
        setField(term14841, term14841.getClass(), "minSize", null);
        setBooleanField(term14841, term14841.getClass(), "minSizeSet", false);
        setField(term14841, term14841.getClass(), "prefSize", null);
        setBooleanField(term14841, term14841.getClass(), "prefSizeSet", false);
        setField(term14841, term14841.getClass(), "maxSize", null);
        setBooleanField(term14841, term14841.getClass(), "maxSizeSet", false);
        setField(term14841, term14841.getClass(), "componentOrientation", null);
        setBooleanField(term14841, term14841.getClass(), "newEventsOnly", false);
        setField(term14841, term14841.getClass(), "componentListener", null);
        setField(term14841, term14841.getClass(), "focusListener", null);
        setField(term14841, term14841.getClass(), "hierarchyListener", null);
        setField(term14841, term14841.getClass(), "hierarchyBoundsListener", null);
        setField(term14841, term14841.getClass(), "keyListener", null);
        setField(term14841, term14841.getClass(), "mouseListener", null);
        setField(term14841, term14841.getClass(), "mouseMotionListener", null);
        setField(term14841, term14841.getClass(), "mouseWheelListener", null);
        setField(term14841, term14841.getClass(), "inputMethodListener", null);
        setLongField(term14841, term14841.getClass(), "eventMask", 0L);
        setField(term14841, term14841.getClass(), "changeSupport", null);
        setField(term14841, term14841.getClass(), "objectLock", null);
        setBooleanField(term14841, term14841.getClass(), "isPacked", false);
        setIntField(term14841, term14841.getClass(), "boundsOp", 0);
        setField(term14841, term14841.getClass(), "compoundShape", null);
        setField(term14841, term14841.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term14841, term14841.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term14841, term14841.getClass(), "backgroundEraseDisabled", false);
        setField(term14841, term14841.getClass(), "eventCache", null);
        setBooleanField(term14841, term14841.getClass(), "coalescingEnabled", false);
        setBooleanField(term14841, term14841.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term14841, term14841.getClass(), "componentSerializedDataVersion", 0);
        setField(term14841, term14841.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KMenuItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term14841, args);
    }

};


