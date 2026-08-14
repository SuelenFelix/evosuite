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

public class KButton_redress_132179689723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27226;

    public KButton_redress_132179689723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27226 = newInstance(Class.forName("proto.KButton"));
        setField(term27226, term27226.getClass(), "initialTip", null);
        setField(term27226, term27226.getClass(), "model", null);
        setField(term27226, term27226.getClass(), "text", null);
        setField(term27226, term27226.getClass(), "margin", null);
        setField(term27226, term27226.getClass(), "defaultMargin", null);
        setField(term27226, term27226.getClass(), "defaultIcon", null);
        setField(term27226, term27226.getClass(), "pressedIcon", null);
        setField(term27226, term27226.getClass(), "disabledIcon", null);
        setField(term27226, term27226.getClass(), "selectedIcon", null);
        setField(term27226, term27226.getClass(), "disabledSelectedIcon", null);
        setField(term27226, term27226.getClass(), "rolloverIcon", null);
        setField(term27226, term27226.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27226, term27226.getClass(), "paintBorder", false);
        setBooleanField(term27226, term27226.getClass(), "paintFocus", false);
        setBooleanField(term27226, term27226.getClass(), "rolloverEnabled", false);
        setBooleanField(term27226, term27226.getClass(), "contentAreaFilled", false);
        setIntField(term27226, term27226.getClass(), "verticalAlignment", 0);
        setIntField(term27226, term27226.getClass(), "horizontalAlignment", 0);
        setIntField(term27226, term27226.getClass(), "verticalTextPosition", 0);
        setIntField(term27226, term27226.getClass(), "horizontalTextPosition", 0);
        setIntField(term27226, term27226.getClass(), "iconTextGap", 0);
        setIntField(term27226, term27226.getClass(), "mnemonic", 0);
        setIntField(term27226, term27226.getClass(), "mnemonicIndex", 0);
        setLongField(term27226, term27226.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27226, term27226.getClass(), "borderPaintedSet", false);
        setBooleanField(term27226, term27226.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27226, term27226.getClass(), "iconTextGapSet", false);
        setBooleanField(term27226, term27226.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27226, term27226.getClass(), "setLayout", false);
        setBooleanField(term27226, term27226.getClass(), "defaultCapable", false);
        setField(term27226, term27226.getClass(), "handler", null);
        setField(term27226, term27226.getClass(), "changeListener", null);
        setField(term27226, term27226.getClass(), "actionListener", null);
        setField(term27226, term27226.getClass(), "itemListener", null);
        setField(term27226, term27226.getClass(), "changeEvent", null);
        setBooleanField(term27226, term27226.getClass(), "hideActionText", false);
        setField(term27226, term27226.getClass(), "action", null);
        setField(term27226, term27226.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27226, term27226.getClass(), "isAlignmentXSet", false);
        setFloatField(term27226, term27226.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27226, term27226.getClass(), "isAlignmentYSet", false);
        setFloatField(term27226, term27226.getClass(), "alignmentY", 0.0F);
        setField(term27226, term27226.getClass(), "ui", null);
        setField(term27226, term27226.getClass(), "listenerList", null);
        setField(term27226, term27226.getClass(), "clientProperties", null);
        setField(term27226, term27226.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27226, term27226.getClass(), "autoscrolls", false);
        setField(term27226, term27226.getClass(), "border", null);
        setIntField(term27226, term27226.getClass(), "flags", 0);
        setField(term27226, term27226.getClass(), "inputVerifier", null);
        setBooleanField(term27226, term27226.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27226, term27226.getClass(), "paintingChild", null);
        setField(term27226, term27226.getClass(), "popupMenu", null);
        setField(term27226, term27226.getClass(), "revalidateRunnableScheduled", null);
        setField(term27226, term27226.getClass(), "focusInputMap", null);
        setField(term27226, term27226.getClass(), "ancestorInputMap", null);
        setField(term27226, term27226.getClass(), "windowInputMap", null);
        setField(term27226, term27226.getClass(), "actionMap", null);
        setField(term27226, term27226.getClass(), "aaHint", null);
        setField(term27226, term27226.getClass(), "lcdRenderingHint", null);
        setField(term27226, term27226.getClass(), "component", null);
        setField(term27226, term27226.getClass(), "layoutMgr", null);
        setField(term27226, term27226.getClass(), "dispatcher", null);
        setField(term27226, term27226.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27226, term27226.getClass(), "focusCycleRoot", false);
        setBooleanField(term27226, term27226.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27226, term27226.getClass(), "printingThreads", null);
        setBooleanField(term27226, term27226.getClass(), "printing", false);
        setField(term27226, term27226.getClass(), "containerListener", null);
        setIntField(term27226, term27226.getClass(), "listeningChildren", 0);
        setIntField(term27226, term27226.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27226, term27226.getClass(), "descendantsCount", 0);
        setField(term27226, term27226.getClass(), "preserveBackgroundColor", null);
        setIntField(term27226, term27226.getClass(), "numOfHWComponents", 0);
        setIntField(term27226, term27226.getClass(), "numOfLWComponents", 0);
        setField(term27226, term27226.getClass(), "modalComp", null);
        setField(term27226, term27226.getClass(), "modalAppContext", null);
        setIntField(term27226, term27226.getClass(), "containerSerializedDataVersion", 0);
        setField(term27226, term27226.getClass(), "peer", null);
        setField(term27226, term27226.getClass(), "parent", null);
        setField(term27226, term27226.getClass(), "appContext", null);
        setIntField(term27226, term27226.getClass(), "x", 0);
        setIntField(term27226, term27226.getClass(), "y", 0);
        setIntField(term27226, term27226.getClass(), "width", 0);
        setIntField(term27226, term27226.getClass(), "height", 0);
        setField(term27226, term27226.getClass(), "foreground", null);
        setField(term27226, term27226.getClass(), "background", null);
        setField(term27226, term27226.getClass(), "font", null);
        setField(term27226, term27226.getClass(), "peerFont", null);
        setField(term27226, term27226.getClass(), "cursor", null);
        setField(term27226, term27226.getClass(), "locale", null);
        setField(term27226, term27226.getClass(), "graphicsConfig", null);
        setField(term27226, term27226.getClass(), "bufferStrategy", null);
        setBooleanField(term27226, term27226.getClass(), "ignoreRepaint", false);
        setBooleanField(term27226, term27226.getClass(), "visible", false);
        setBooleanField(term27226, term27226.getClass(), "enabled", false);
        setBooleanField(term27226, term27226.getClass(), "valid", false);
        setField(term27226, term27226.getClass(), "dropTarget", null);
        setField(term27226, term27226.getClass(), "popups", null);
        setField(term27226, term27226.getClass(), "name", null);
        setBooleanField(term27226, term27226.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27226, term27226.getClass(), "focusable", false);
        setIntField(term27226, term27226.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27226, term27226.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27226, term27226.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27226, term27226.getClass(), "acc", null);
        setField(term27226, term27226.getClass(), "minSize", null);
        setBooleanField(term27226, term27226.getClass(), "minSizeSet", false);
        setField(term27226, term27226.getClass(), "prefSize", null);
        setBooleanField(term27226, term27226.getClass(), "prefSizeSet", false);
        setField(term27226, term27226.getClass(), "maxSize", null);
        setBooleanField(term27226, term27226.getClass(), "maxSizeSet", false);
        setField(term27226, term27226.getClass(), "componentOrientation", null);
        setBooleanField(term27226, term27226.getClass(), "newEventsOnly", false);
        setField(term27226, term27226.getClass(), "componentListener", null);
        setField(term27226, term27226.getClass(), "focusListener", null);
        setField(term27226, term27226.getClass(), "hierarchyListener", null);
        setField(term27226, term27226.getClass(), "hierarchyBoundsListener", null);
        setField(term27226, term27226.getClass(), "keyListener", null);
        setField(term27226, term27226.getClass(), "mouseListener", null);
        setField(term27226, term27226.getClass(), "mouseMotionListener", null);
        setField(term27226, term27226.getClass(), "mouseWheelListener", null);
        setField(term27226, term27226.getClass(), "inputMethodListener", null);
        setLongField(term27226, term27226.getClass(), "eventMask", 0L);
        setField(term27226, term27226.getClass(), "changeSupport", null);
        setField(term27226, term27226.getClass(), "objectLock", null);
        setBooleanField(term27226, term27226.getClass(), "isPacked", false);
        setIntField(term27226, term27226.getClass(), "boundsOp", 0);
        setField(term27226, term27226.getClass(), "compoundShape", null);
        setField(term27226, term27226.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27226, term27226.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27226, term27226.getClass(), "backgroundEraseDisabled", false);
        setField(term27226, term27226.getClass(), "eventCache", null);
        setBooleanField(term27226, term27226.getClass(), "coalescingEnabled", false);
        setBooleanField(term27226, term27226.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27226, term27226.getClass(), "componentSerializedDataVersion", 0);
        setField(term27226, term27226.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "redress", argTypes, term27226, args);
    }

};


