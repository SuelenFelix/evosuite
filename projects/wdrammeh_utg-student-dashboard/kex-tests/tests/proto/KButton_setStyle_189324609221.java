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

public class KButton_setStyle_189324609221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27073;

    public KButton_setStyle_189324609221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27073 = newInstance(Class.forName("proto.KButton"));
        setField(term27073, term27073.getClass(), "initialTip", null);
        setField(term27073, term27073.getClass(), "model", null);
        setField(term27073, term27073.getClass(), "text", null);
        setField(term27073, term27073.getClass(), "margin", null);
        setField(term27073, term27073.getClass(), "defaultMargin", null);
        setField(term27073, term27073.getClass(), "defaultIcon", null);
        setField(term27073, term27073.getClass(), "pressedIcon", null);
        setField(term27073, term27073.getClass(), "disabledIcon", null);
        setField(term27073, term27073.getClass(), "selectedIcon", null);
        setField(term27073, term27073.getClass(), "disabledSelectedIcon", null);
        setField(term27073, term27073.getClass(), "rolloverIcon", null);
        setField(term27073, term27073.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27073, term27073.getClass(), "paintBorder", false);
        setBooleanField(term27073, term27073.getClass(), "paintFocus", false);
        setBooleanField(term27073, term27073.getClass(), "rolloverEnabled", false);
        setBooleanField(term27073, term27073.getClass(), "contentAreaFilled", false);
        setIntField(term27073, term27073.getClass(), "verticalAlignment", 0);
        setIntField(term27073, term27073.getClass(), "horizontalAlignment", 0);
        setIntField(term27073, term27073.getClass(), "verticalTextPosition", 0);
        setIntField(term27073, term27073.getClass(), "horizontalTextPosition", 0);
        setIntField(term27073, term27073.getClass(), "iconTextGap", 0);
        setIntField(term27073, term27073.getClass(), "mnemonic", 0);
        setIntField(term27073, term27073.getClass(), "mnemonicIndex", 0);
        setLongField(term27073, term27073.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27073, term27073.getClass(), "borderPaintedSet", false);
        setBooleanField(term27073, term27073.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27073, term27073.getClass(), "iconTextGapSet", false);
        setBooleanField(term27073, term27073.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27073, term27073.getClass(), "setLayout", false);
        setBooleanField(term27073, term27073.getClass(), "defaultCapable", false);
        setField(term27073, term27073.getClass(), "handler", null);
        setField(term27073, term27073.getClass(), "changeListener", null);
        setField(term27073, term27073.getClass(), "actionListener", null);
        setField(term27073, term27073.getClass(), "itemListener", null);
        setField(term27073, term27073.getClass(), "changeEvent", null);
        setBooleanField(term27073, term27073.getClass(), "hideActionText", false);
        setField(term27073, term27073.getClass(), "action", null);
        setField(term27073, term27073.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27073, term27073.getClass(), "isAlignmentXSet", false);
        setFloatField(term27073, term27073.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27073, term27073.getClass(), "isAlignmentYSet", false);
        setFloatField(term27073, term27073.getClass(), "alignmentY", 0.0F);
        setField(term27073, term27073.getClass(), "ui", null);
        setField(term27073, term27073.getClass(), "listenerList", null);
        setField(term27073, term27073.getClass(), "clientProperties", null);
        setField(term27073, term27073.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27073, term27073.getClass(), "autoscrolls", false);
        setField(term27073, term27073.getClass(), "border", null);
        setIntField(term27073, term27073.getClass(), "flags", 0);
        setField(term27073, term27073.getClass(), "inputVerifier", null);
        setBooleanField(term27073, term27073.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27073, term27073.getClass(), "paintingChild", null);
        setField(term27073, term27073.getClass(), "popupMenu", null);
        setField(term27073, term27073.getClass(), "revalidateRunnableScheduled", null);
        setField(term27073, term27073.getClass(), "focusInputMap", null);
        setField(term27073, term27073.getClass(), "ancestorInputMap", null);
        setField(term27073, term27073.getClass(), "windowInputMap", null);
        setField(term27073, term27073.getClass(), "actionMap", null);
        setField(term27073, term27073.getClass(), "aaHint", null);
        setField(term27073, term27073.getClass(), "lcdRenderingHint", null);
        setField(term27073, term27073.getClass(), "component", null);
        setField(term27073, term27073.getClass(), "layoutMgr", null);
        setField(term27073, term27073.getClass(), "dispatcher", null);
        setField(term27073, term27073.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27073, term27073.getClass(), "focusCycleRoot", false);
        setBooleanField(term27073, term27073.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27073, term27073.getClass(), "printingThreads", null);
        setBooleanField(term27073, term27073.getClass(), "printing", false);
        setField(term27073, term27073.getClass(), "containerListener", null);
        setIntField(term27073, term27073.getClass(), "listeningChildren", 0);
        setIntField(term27073, term27073.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27073, term27073.getClass(), "descendantsCount", 0);
        setField(term27073, term27073.getClass(), "preserveBackgroundColor", null);
        setIntField(term27073, term27073.getClass(), "numOfHWComponents", 0);
        setIntField(term27073, term27073.getClass(), "numOfLWComponents", 0);
        setField(term27073, term27073.getClass(), "modalComp", null);
        setField(term27073, term27073.getClass(), "modalAppContext", null);
        setIntField(term27073, term27073.getClass(), "containerSerializedDataVersion", 0);
        setField(term27073, term27073.getClass(), "peer", null);
        setField(term27073, term27073.getClass(), "parent", null);
        setField(term27073, term27073.getClass(), "appContext", null);
        setIntField(term27073, term27073.getClass(), "x", 0);
        setIntField(term27073, term27073.getClass(), "y", 0);
        setIntField(term27073, term27073.getClass(), "width", 0);
        setIntField(term27073, term27073.getClass(), "height", 0);
        setField(term27073, term27073.getClass(), "foreground", null);
        setField(term27073, term27073.getClass(), "background", null);
        setField(term27073, term27073.getClass(), "font", null);
        setField(term27073, term27073.getClass(), "peerFont", null);
        setField(term27073, term27073.getClass(), "cursor", null);
        setField(term27073, term27073.getClass(), "locale", null);
        setField(term27073, term27073.getClass(), "graphicsConfig", null);
        setField(term27073, term27073.getClass(), "bufferStrategy", null);
        setBooleanField(term27073, term27073.getClass(), "ignoreRepaint", false);
        setBooleanField(term27073, term27073.getClass(), "visible", false);
        setBooleanField(term27073, term27073.getClass(), "enabled", false);
        setBooleanField(term27073, term27073.getClass(), "valid", false);
        setField(term27073, term27073.getClass(), "dropTarget", null);
        setField(term27073, term27073.getClass(), "popups", null);
        setField(term27073, term27073.getClass(), "name", null);
        setBooleanField(term27073, term27073.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27073, term27073.getClass(), "focusable", false);
        setIntField(term27073, term27073.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27073, term27073.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27073, term27073.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27073, term27073.getClass(), "acc", null);
        setField(term27073, term27073.getClass(), "minSize", null);
        setBooleanField(term27073, term27073.getClass(), "minSizeSet", false);
        setField(term27073, term27073.getClass(), "prefSize", null);
        setBooleanField(term27073, term27073.getClass(), "prefSizeSet", false);
        setField(term27073, term27073.getClass(), "maxSize", null);
        setBooleanField(term27073, term27073.getClass(), "maxSizeSet", false);
        setField(term27073, term27073.getClass(), "componentOrientation", null);
        setBooleanField(term27073, term27073.getClass(), "newEventsOnly", false);
        setField(term27073, term27073.getClass(), "componentListener", null);
        setField(term27073, term27073.getClass(), "focusListener", null);
        setField(term27073, term27073.getClass(), "hierarchyListener", null);
        setField(term27073, term27073.getClass(), "hierarchyBoundsListener", null);
        setField(term27073, term27073.getClass(), "keyListener", null);
        setField(term27073, term27073.getClass(), "mouseListener", null);
        setField(term27073, term27073.getClass(), "mouseMotionListener", null);
        setField(term27073, term27073.getClass(), "mouseWheelListener", null);
        setField(term27073, term27073.getClass(), "inputMethodListener", null);
        setLongField(term27073, term27073.getClass(), "eventMask", 0L);
        setField(term27073, term27073.getClass(), "changeSupport", null);
        setField(term27073, term27073.getClass(), "objectLock", null);
        setBooleanField(term27073, term27073.getClass(), "isPacked", false);
        setIntField(term27073, term27073.getClass(), "boundsOp", 0);
        setField(term27073, term27073.getClass(), "compoundShape", null);
        setField(term27073, term27073.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27073, term27073.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27073, term27073.getClass(), "backgroundEraseDisabled", false);
        setField(term27073, term27073.getClass(), "eventCache", null);
        setBooleanField(term27073, term27073.getClass(), "coalescingEnabled", false);
        setBooleanField(term27073, term27073.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27073, term27073.getClass(), "componentSerializedDataVersion", 0);
        setField(term27073, term27073.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Font");
        argTypes[1] = Class.forName("java.awt.Color");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "setStyle", argTypes, term27073, args);
    }

};


