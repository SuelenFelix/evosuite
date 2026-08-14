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

public class KButton_undress_130017536522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27166;

    public KButton_undress_130017536522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27166 = newInstance(Class.forName("proto.KButton"));
        setField(term27166, term27166.getClass(), "initialTip", null);
        setField(term27166, term27166.getClass(), "model", null);
        setField(term27166, term27166.getClass(), "text", null);
        setField(term27166, term27166.getClass(), "margin", null);
        setField(term27166, term27166.getClass(), "defaultMargin", null);
        setField(term27166, term27166.getClass(), "defaultIcon", null);
        setField(term27166, term27166.getClass(), "pressedIcon", null);
        setField(term27166, term27166.getClass(), "disabledIcon", null);
        setField(term27166, term27166.getClass(), "selectedIcon", null);
        setField(term27166, term27166.getClass(), "disabledSelectedIcon", null);
        setField(term27166, term27166.getClass(), "rolloverIcon", null);
        setField(term27166, term27166.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27166, term27166.getClass(), "paintBorder", false);
        setBooleanField(term27166, term27166.getClass(), "paintFocus", false);
        setBooleanField(term27166, term27166.getClass(), "rolloverEnabled", false);
        setBooleanField(term27166, term27166.getClass(), "contentAreaFilled", false);
        setIntField(term27166, term27166.getClass(), "verticalAlignment", 0);
        setIntField(term27166, term27166.getClass(), "horizontalAlignment", 0);
        setIntField(term27166, term27166.getClass(), "verticalTextPosition", 0);
        setIntField(term27166, term27166.getClass(), "horizontalTextPosition", 0);
        setIntField(term27166, term27166.getClass(), "iconTextGap", 0);
        setIntField(term27166, term27166.getClass(), "mnemonic", 0);
        setIntField(term27166, term27166.getClass(), "mnemonicIndex", 0);
        setLongField(term27166, term27166.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27166, term27166.getClass(), "borderPaintedSet", false);
        setBooleanField(term27166, term27166.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27166, term27166.getClass(), "iconTextGapSet", false);
        setBooleanField(term27166, term27166.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27166, term27166.getClass(), "setLayout", false);
        setBooleanField(term27166, term27166.getClass(), "defaultCapable", false);
        setField(term27166, term27166.getClass(), "handler", null);
        setField(term27166, term27166.getClass(), "changeListener", null);
        setField(term27166, term27166.getClass(), "actionListener", null);
        setField(term27166, term27166.getClass(), "itemListener", null);
        setField(term27166, term27166.getClass(), "changeEvent", null);
        setBooleanField(term27166, term27166.getClass(), "hideActionText", false);
        setField(term27166, term27166.getClass(), "action", null);
        setField(term27166, term27166.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27166, term27166.getClass(), "isAlignmentXSet", false);
        setFloatField(term27166, term27166.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27166, term27166.getClass(), "isAlignmentYSet", false);
        setFloatField(term27166, term27166.getClass(), "alignmentY", 0.0F);
        setField(term27166, term27166.getClass(), "ui", null);
        setField(term27166, term27166.getClass(), "listenerList", null);
        setField(term27166, term27166.getClass(), "clientProperties", null);
        setField(term27166, term27166.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27166, term27166.getClass(), "autoscrolls", false);
        setField(term27166, term27166.getClass(), "border", null);
        setIntField(term27166, term27166.getClass(), "flags", 0);
        setField(term27166, term27166.getClass(), "inputVerifier", null);
        setBooleanField(term27166, term27166.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27166, term27166.getClass(), "paintingChild", null);
        setField(term27166, term27166.getClass(), "popupMenu", null);
        setField(term27166, term27166.getClass(), "revalidateRunnableScheduled", null);
        setField(term27166, term27166.getClass(), "focusInputMap", null);
        setField(term27166, term27166.getClass(), "ancestorInputMap", null);
        setField(term27166, term27166.getClass(), "windowInputMap", null);
        setField(term27166, term27166.getClass(), "actionMap", null);
        setField(term27166, term27166.getClass(), "aaHint", null);
        setField(term27166, term27166.getClass(), "lcdRenderingHint", null);
        setField(term27166, term27166.getClass(), "component", null);
        setField(term27166, term27166.getClass(), "layoutMgr", null);
        setField(term27166, term27166.getClass(), "dispatcher", null);
        setField(term27166, term27166.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27166, term27166.getClass(), "focusCycleRoot", false);
        setBooleanField(term27166, term27166.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27166, term27166.getClass(), "printingThreads", null);
        setBooleanField(term27166, term27166.getClass(), "printing", false);
        setField(term27166, term27166.getClass(), "containerListener", null);
        setIntField(term27166, term27166.getClass(), "listeningChildren", 0);
        setIntField(term27166, term27166.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27166, term27166.getClass(), "descendantsCount", 0);
        setField(term27166, term27166.getClass(), "preserveBackgroundColor", null);
        setIntField(term27166, term27166.getClass(), "numOfHWComponents", 0);
        setIntField(term27166, term27166.getClass(), "numOfLWComponents", 0);
        setField(term27166, term27166.getClass(), "modalComp", null);
        setField(term27166, term27166.getClass(), "modalAppContext", null);
        setIntField(term27166, term27166.getClass(), "containerSerializedDataVersion", 0);
        setField(term27166, term27166.getClass(), "peer", null);
        setField(term27166, term27166.getClass(), "parent", null);
        setField(term27166, term27166.getClass(), "appContext", null);
        setIntField(term27166, term27166.getClass(), "x", 0);
        setIntField(term27166, term27166.getClass(), "y", 0);
        setIntField(term27166, term27166.getClass(), "width", 0);
        setIntField(term27166, term27166.getClass(), "height", 0);
        setField(term27166, term27166.getClass(), "foreground", null);
        setField(term27166, term27166.getClass(), "background", null);
        setField(term27166, term27166.getClass(), "font", null);
        setField(term27166, term27166.getClass(), "peerFont", null);
        setField(term27166, term27166.getClass(), "cursor", null);
        setField(term27166, term27166.getClass(), "locale", null);
        setField(term27166, term27166.getClass(), "graphicsConfig", null);
        setField(term27166, term27166.getClass(), "bufferStrategy", null);
        setBooleanField(term27166, term27166.getClass(), "ignoreRepaint", false);
        setBooleanField(term27166, term27166.getClass(), "visible", false);
        setBooleanField(term27166, term27166.getClass(), "enabled", false);
        setBooleanField(term27166, term27166.getClass(), "valid", false);
        setField(term27166, term27166.getClass(), "dropTarget", null);
        setField(term27166, term27166.getClass(), "popups", null);
        setField(term27166, term27166.getClass(), "name", null);
        setBooleanField(term27166, term27166.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27166, term27166.getClass(), "focusable", false);
        setIntField(term27166, term27166.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27166, term27166.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27166, term27166.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27166, term27166.getClass(), "acc", null);
        setField(term27166, term27166.getClass(), "minSize", null);
        setBooleanField(term27166, term27166.getClass(), "minSizeSet", false);
        setField(term27166, term27166.getClass(), "prefSize", null);
        setBooleanField(term27166, term27166.getClass(), "prefSizeSet", false);
        setField(term27166, term27166.getClass(), "maxSize", null);
        setBooleanField(term27166, term27166.getClass(), "maxSizeSet", false);
        setField(term27166, term27166.getClass(), "componentOrientation", null);
        setBooleanField(term27166, term27166.getClass(), "newEventsOnly", false);
        setField(term27166, term27166.getClass(), "componentListener", null);
        setField(term27166, term27166.getClass(), "focusListener", null);
        setField(term27166, term27166.getClass(), "hierarchyListener", null);
        setField(term27166, term27166.getClass(), "hierarchyBoundsListener", null);
        setField(term27166, term27166.getClass(), "keyListener", null);
        setField(term27166, term27166.getClass(), "mouseListener", null);
        setField(term27166, term27166.getClass(), "mouseMotionListener", null);
        setField(term27166, term27166.getClass(), "mouseWheelListener", null);
        setField(term27166, term27166.getClass(), "inputMethodListener", null);
        setLongField(term27166, term27166.getClass(), "eventMask", 0L);
        setField(term27166, term27166.getClass(), "changeSupport", null);
        setField(term27166, term27166.getClass(), "objectLock", null);
        setBooleanField(term27166, term27166.getClass(), "isPacked", false);
        setIntField(term27166, term27166.getClass(), "boundsOp", 0);
        setField(term27166, term27166.getClass(), "compoundShape", null);
        setField(term27166, term27166.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27166, term27166.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27166, term27166.getClass(), "backgroundEraseDisabled", false);
        setField(term27166, term27166.getClass(), "eventCache", null);
        setBooleanField(term27166, term27166.getClass(), "coalescingEnabled", false);
        setBooleanField(term27166, term27166.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27166, term27166.getClass(), "componentSerializedDataVersion", 0);
        setField(term27166, term27166.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "undress", argTypes, term27166, args);
    }

};


