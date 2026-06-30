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
import java.lang.Boolean;

public class KButton_setEnabled_27413673426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27377;
     Object term27437;

    public KButton_setEnabled_27413673426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27377 = newInstance(Class.forName("proto.KButton"));
        setField(term27377, term27377.getClass(), "initialTip", null);
        setField(term27377, term27377.getClass(), "model", null);
        setField(term27377, term27377.getClass(), "text", null);
        setField(term27377, term27377.getClass(), "margin", null);
        setField(term27377, term27377.getClass(), "defaultMargin", null);
        setField(term27377, term27377.getClass(), "defaultIcon", null);
        setField(term27377, term27377.getClass(), "pressedIcon", null);
        setField(term27377, term27377.getClass(), "disabledIcon", null);
        setField(term27377, term27377.getClass(), "selectedIcon", null);
        setField(term27377, term27377.getClass(), "disabledSelectedIcon", null);
        setField(term27377, term27377.getClass(), "rolloverIcon", null);
        setField(term27377, term27377.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27377, term27377.getClass(), "paintBorder", false);
        setBooleanField(term27377, term27377.getClass(), "paintFocus", false);
        setBooleanField(term27377, term27377.getClass(), "rolloverEnabled", false);
        setBooleanField(term27377, term27377.getClass(), "contentAreaFilled", false);
        setIntField(term27377, term27377.getClass(), "verticalAlignment", 0);
        setIntField(term27377, term27377.getClass(), "horizontalAlignment", 0);
        setIntField(term27377, term27377.getClass(), "verticalTextPosition", 0);
        setIntField(term27377, term27377.getClass(), "horizontalTextPosition", 0);
        setIntField(term27377, term27377.getClass(), "iconTextGap", 0);
        setIntField(term27377, term27377.getClass(), "mnemonic", 0);
        setIntField(term27377, term27377.getClass(), "mnemonicIndex", 0);
        setLongField(term27377, term27377.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27377, term27377.getClass(), "borderPaintedSet", false);
        setBooleanField(term27377, term27377.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27377, term27377.getClass(), "iconTextGapSet", false);
        setBooleanField(term27377, term27377.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27377, term27377.getClass(), "setLayout", false);
        setBooleanField(term27377, term27377.getClass(), "defaultCapable", false);
        setField(term27377, term27377.getClass(), "handler", null);
        setField(term27377, term27377.getClass(), "changeListener", null);
        setField(term27377, term27377.getClass(), "actionListener", null);
        setField(term27377, term27377.getClass(), "itemListener", null);
        setField(term27377, term27377.getClass(), "changeEvent", null);
        setBooleanField(term27377, term27377.getClass(), "hideActionText", false);
        setField(term27377, term27377.getClass(), "action", null);
        setField(term27377, term27377.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27377, term27377.getClass(), "isAlignmentXSet", false);
        setFloatField(term27377, term27377.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27377, term27377.getClass(), "isAlignmentYSet", false);
        setFloatField(term27377, term27377.getClass(), "alignmentY", 0.0F);
        setField(term27377, term27377.getClass(), "ui", null);
        setField(term27377, term27377.getClass(), "listenerList", null);
        setField(term27377, term27377.getClass(), "clientProperties", null);
        setField(term27377, term27377.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27377, term27377.getClass(), "autoscrolls", false);
        setField(term27377, term27377.getClass(), "border", null);
        setIntField(term27377, term27377.getClass(), "flags", 0);
        setField(term27377, term27377.getClass(), "inputVerifier", null);
        setBooleanField(term27377, term27377.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27377, term27377.getClass(), "paintingChild", null);
        setField(term27377, term27377.getClass(), "popupMenu", null);
        setField(term27377, term27377.getClass(), "revalidateRunnableScheduled", null);
        setField(term27377, term27377.getClass(), "focusInputMap", null);
        setField(term27377, term27377.getClass(), "ancestorInputMap", null);
        setField(term27377, term27377.getClass(), "windowInputMap", null);
        setField(term27377, term27377.getClass(), "actionMap", null);
        setField(term27377, term27377.getClass(), "aaHint", null);
        setField(term27377, term27377.getClass(), "lcdRenderingHint", null);
        setField(term27377, term27377.getClass(), "component", null);
        setField(term27377, term27377.getClass(), "layoutMgr", null);
        setField(term27377, term27377.getClass(), "dispatcher", null);
        setField(term27377, term27377.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27377, term27377.getClass(), "focusCycleRoot", false);
        setBooleanField(term27377, term27377.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27377, term27377.getClass(), "printingThreads", null);
        setBooleanField(term27377, term27377.getClass(), "printing", false);
        setField(term27377, term27377.getClass(), "containerListener", null);
        setIntField(term27377, term27377.getClass(), "listeningChildren", 0);
        setIntField(term27377, term27377.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27377, term27377.getClass(), "descendantsCount", 0);
        setField(term27377, term27377.getClass(), "preserveBackgroundColor", null);
        setIntField(term27377, term27377.getClass(), "numOfHWComponents", 0);
        setIntField(term27377, term27377.getClass(), "numOfLWComponents", 0);
        setField(term27377, term27377.getClass(), "modalComp", null);
        setField(term27377, term27377.getClass(), "modalAppContext", null);
        setIntField(term27377, term27377.getClass(), "containerSerializedDataVersion", 0);
        setField(term27377, term27377.getClass(), "peer", null);
        setField(term27377, term27377.getClass(), "parent", null);
        setField(term27377, term27377.getClass(), "appContext", null);
        setIntField(term27377, term27377.getClass(), "x", 0);
        setIntField(term27377, term27377.getClass(), "y", 0);
        setIntField(term27377, term27377.getClass(), "width", 0);
        setIntField(term27377, term27377.getClass(), "height", 0);
        setField(term27377, term27377.getClass(), "foreground", null);
        setField(term27377, term27377.getClass(), "background", null);
        setField(term27377, term27377.getClass(), "font", null);
        setField(term27377, term27377.getClass(), "peerFont", null);
        setField(term27377, term27377.getClass(), "cursor", null);
        setField(term27377, term27377.getClass(), "locale", null);
        setField(term27377, term27377.getClass(), "graphicsConfig", null);
        setField(term27377, term27377.getClass(), "bufferStrategy", null);
        setBooleanField(term27377, term27377.getClass(), "ignoreRepaint", false);
        setBooleanField(term27377, term27377.getClass(), "visible", false);
        setBooleanField(term27377, term27377.getClass(), "enabled", false);
        setBooleanField(term27377, term27377.getClass(), "valid", false);
        setField(term27377, term27377.getClass(), "dropTarget", null);
        setField(term27377, term27377.getClass(), "popups", null);
        setField(term27377, term27377.getClass(), "name", null);
        setBooleanField(term27377, term27377.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27377, term27377.getClass(), "focusable", false);
        setIntField(term27377, term27377.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27377, term27377.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27377, term27377.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27377, term27377.getClass(), "acc", null);
        setField(term27377, term27377.getClass(), "minSize", null);
        setBooleanField(term27377, term27377.getClass(), "minSizeSet", false);
        setField(term27377, term27377.getClass(), "prefSize", null);
        setBooleanField(term27377, term27377.getClass(), "prefSizeSet", false);
        setField(term27377, term27377.getClass(), "maxSize", null);
        setBooleanField(term27377, term27377.getClass(), "maxSizeSet", false);
        setField(term27377, term27377.getClass(), "componentOrientation", null);
        setBooleanField(term27377, term27377.getClass(), "newEventsOnly", false);
        setField(term27377, term27377.getClass(), "componentListener", null);
        setField(term27377, term27377.getClass(), "focusListener", null);
        setField(term27377, term27377.getClass(), "hierarchyListener", null);
        setField(term27377, term27377.getClass(), "hierarchyBoundsListener", null);
        setField(term27377, term27377.getClass(), "keyListener", null);
        setField(term27377, term27377.getClass(), "mouseListener", null);
        setField(term27377, term27377.getClass(), "mouseMotionListener", null);
        setField(term27377, term27377.getClass(), "mouseWheelListener", null);
        setField(term27377, term27377.getClass(), "inputMethodListener", null);
        setLongField(term27377, term27377.getClass(), "eventMask", 0L);
        setField(term27377, term27377.getClass(), "changeSupport", null);
        setField(term27377, term27377.getClass(), "objectLock", null);
        setBooleanField(term27377, term27377.getClass(), "isPacked", false);
        setIntField(term27377, term27377.getClass(), "boundsOp", 0);
        setField(term27377, term27377.getClass(), "compoundShape", null);
        setField(term27377, term27377.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27377, term27377.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27377, term27377.getClass(), "backgroundEraseDisabled", false);
        setField(term27377, term27377.getClass(), "eventCache", null);
        setBooleanField(term27377, term27377.getClass(), "coalescingEnabled", false);
        setBooleanField(term27377, term27377.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27377, term27377.getClass(), "componentSerializedDataVersion", 0);
        setField(term27377, term27377.getClass(), "accessibleContext", null);
        term27437 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term27437;
        callMethod(klass, "setEnabled", argTypes, term27377, args);
    }

};


