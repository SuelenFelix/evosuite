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

public class KButton_setText_2922325024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27286;
     Object term27346;

    public KButton_setText_2922325024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27286 = newInstance(Class.forName("proto.KButton"));
        setField(term27286, term27286.getClass(), "initialTip", null);
        setField(term27286, term27286.getClass(), "model", null);
        setField(term27286, term27286.getClass(), "text", null);
        setField(term27286, term27286.getClass(), "margin", null);
        setField(term27286, term27286.getClass(), "defaultMargin", null);
        setField(term27286, term27286.getClass(), "defaultIcon", null);
        setField(term27286, term27286.getClass(), "pressedIcon", null);
        setField(term27286, term27286.getClass(), "disabledIcon", null);
        setField(term27286, term27286.getClass(), "selectedIcon", null);
        setField(term27286, term27286.getClass(), "disabledSelectedIcon", null);
        setField(term27286, term27286.getClass(), "rolloverIcon", null);
        setField(term27286, term27286.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27286, term27286.getClass(), "paintBorder", false);
        setBooleanField(term27286, term27286.getClass(), "paintFocus", false);
        setBooleanField(term27286, term27286.getClass(), "rolloverEnabled", false);
        setBooleanField(term27286, term27286.getClass(), "contentAreaFilled", false);
        setIntField(term27286, term27286.getClass(), "verticalAlignment", 0);
        setIntField(term27286, term27286.getClass(), "horizontalAlignment", 0);
        setIntField(term27286, term27286.getClass(), "verticalTextPosition", 0);
        setIntField(term27286, term27286.getClass(), "horizontalTextPosition", 0);
        setIntField(term27286, term27286.getClass(), "iconTextGap", 0);
        setIntField(term27286, term27286.getClass(), "mnemonic", 0);
        setIntField(term27286, term27286.getClass(), "mnemonicIndex", 0);
        setLongField(term27286, term27286.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27286, term27286.getClass(), "borderPaintedSet", false);
        setBooleanField(term27286, term27286.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27286, term27286.getClass(), "iconTextGapSet", false);
        setBooleanField(term27286, term27286.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27286, term27286.getClass(), "setLayout", false);
        setBooleanField(term27286, term27286.getClass(), "defaultCapable", false);
        setField(term27286, term27286.getClass(), "handler", null);
        setField(term27286, term27286.getClass(), "changeListener", null);
        setField(term27286, term27286.getClass(), "actionListener", null);
        setField(term27286, term27286.getClass(), "itemListener", null);
        setField(term27286, term27286.getClass(), "changeEvent", null);
        setBooleanField(term27286, term27286.getClass(), "hideActionText", false);
        setField(term27286, term27286.getClass(), "action", null);
        setField(term27286, term27286.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27286, term27286.getClass(), "isAlignmentXSet", false);
        setFloatField(term27286, term27286.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27286, term27286.getClass(), "isAlignmentYSet", false);
        setFloatField(term27286, term27286.getClass(), "alignmentY", 0.0F);
        setField(term27286, term27286.getClass(), "ui", null);
        setField(term27286, term27286.getClass(), "listenerList", null);
        setField(term27286, term27286.getClass(), "clientProperties", null);
        setField(term27286, term27286.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27286, term27286.getClass(), "autoscrolls", false);
        setField(term27286, term27286.getClass(), "border", null);
        setIntField(term27286, term27286.getClass(), "flags", 0);
        setField(term27286, term27286.getClass(), "inputVerifier", null);
        setBooleanField(term27286, term27286.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27286, term27286.getClass(), "paintingChild", null);
        setField(term27286, term27286.getClass(), "popupMenu", null);
        setField(term27286, term27286.getClass(), "revalidateRunnableScheduled", null);
        setField(term27286, term27286.getClass(), "focusInputMap", null);
        setField(term27286, term27286.getClass(), "ancestorInputMap", null);
        setField(term27286, term27286.getClass(), "windowInputMap", null);
        setField(term27286, term27286.getClass(), "actionMap", null);
        setField(term27286, term27286.getClass(), "aaHint", null);
        setField(term27286, term27286.getClass(), "lcdRenderingHint", null);
        setField(term27286, term27286.getClass(), "component", null);
        setField(term27286, term27286.getClass(), "layoutMgr", null);
        setField(term27286, term27286.getClass(), "dispatcher", null);
        setField(term27286, term27286.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27286, term27286.getClass(), "focusCycleRoot", false);
        setBooleanField(term27286, term27286.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27286, term27286.getClass(), "printingThreads", null);
        setBooleanField(term27286, term27286.getClass(), "printing", false);
        setField(term27286, term27286.getClass(), "containerListener", null);
        setIntField(term27286, term27286.getClass(), "listeningChildren", 0);
        setIntField(term27286, term27286.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27286, term27286.getClass(), "descendantsCount", 0);
        setField(term27286, term27286.getClass(), "preserveBackgroundColor", null);
        setIntField(term27286, term27286.getClass(), "numOfHWComponents", 0);
        setIntField(term27286, term27286.getClass(), "numOfLWComponents", 0);
        setField(term27286, term27286.getClass(), "modalComp", null);
        setField(term27286, term27286.getClass(), "modalAppContext", null);
        setIntField(term27286, term27286.getClass(), "containerSerializedDataVersion", 0);
        setField(term27286, term27286.getClass(), "peer", null);
        setField(term27286, term27286.getClass(), "parent", null);
        setField(term27286, term27286.getClass(), "appContext", null);
        setIntField(term27286, term27286.getClass(), "x", 0);
        setIntField(term27286, term27286.getClass(), "y", 0);
        setIntField(term27286, term27286.getClass(), "width", 0);
        setIntField(term27286, term27286.getClass(), "height", 0);
        setField(term27286, term27286.getClass(), "foreground", null);
        setField(term27286, term27286.getClass(), "background", null);
        setField(term27286, term27286.getClass(), "font", null);
        setField(term27286, term27286.getClass(), "peerFont", null);
        setField(term27286, term27286.getClass(), "cursor", null);
        setField(term27286, term27286.getClass(), "locale", null);
        setField(term27286, term27286.getClass(), "graphicsConfig", null);
        setField(term27286, term27286.getClass(), "bufferStrategy", null);
        setBooleanField(term27286, term27286.getClass(), "ignoreRepaint", false);
        setBooleanField(term27286, term27286.getClass(), "visible", false);
        setBooleanField(term27286, term27286.getClass(), "enabled", false);
        setBooleanField(term27286, term27286.getClass(), "valid", false);
        setField(term27286, term27286.getClass(), "dropTarget", null);
        setField(term27286, term27286.getClass(), "popups", null);
        setField(term27286, term27286.getClass(), "name", null);
        setBooleanField(term27286, term27286.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27286, term27286.getClass(), "focusable", false);
        setIntField(term27286, term27286.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27286, term27286.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27286, term27286.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27286, term27286.getClass(), "acc", null);
        setField(term27286, term27286.getClass(), "minSize", null);
        setBooleanField(term27286, term27286.getClass(), "minSizeSet", false);
        setField(term27286, term27286.getClass(), "prefSize", null);
        setBooleanField(term27286, term27286.getClass(), "prefSizeSet", false);
        setField(term27286, term27286.getClass(), "maxSize", null);
        setBooleanField(term27286, term27286.getClass(), "maxSizeSet", false);
        setField(term27286, term27286.getClass(), "componentOrientation", null);
        setBooleanField(term27286, term27286.getClass(), "newEventsOnly", false);
        setField(term27286, term27286.getClass(), "componentListener", null);
        setField(term27286, term27286.getClass(), "focusListener", null);
        setField(term27286, term27286.getClass(), "hierarchyListener", null);
        setField(term27286, term27286.getClass(), "hierarchyBoundsListener", null);
        setField(term27286, term27286.getClass(), "keyListener", null);
        setField(term27286, term27286.getClass(), "mouseListener", null);
        setField(term27286, term27286.getClass(), "mouseMotionListener", null);
        setField(term27286, term27286.getClass(), "mouseWheelListener", null);
        setField(term27286, term27286.getClass(), "inputMethodListener", null);
        setLongField(term27286, term27286.getClass(), "eventMask", 0L);
        setField(term27286, term27286.getClass(), "changeSupport", null);
        setField(term27286, term27286.getClass(), "objectLock", null);
        setBooleanField(term27286, term27286.getClass(), "isPacked", false);
        setIntField(term27286, term27286.getClass(), "boundsOp", 0);
        setField(term27286, term27286.getClass(), "compoundShape", null);
        setField(term27286, term27286.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27286, term27286.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27286, term27286.getClass(), "backgroundEraseDisabled", false);
        setField(term27286, term27286.getClass(), "eventCache", null);
        setBooleanField(term27286, term27286.getClass(), "coalescingEnabled", false);
        setBooleanField(term27286, term27286.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27286, term27286.getClass(), "componentSerializedDataVersion", 0);
        setField(term27286, term27286.getClass(), "accessibleContext", null);
        term27346 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27346;
        callMethod(klass, "setText", argTypes, term27286, args);
    }

};


