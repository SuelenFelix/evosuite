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
     Object term27410;
     Object term27470;

    public KButton_setEnabled_27413673426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27410 = newInstance(Class.forName("proto.KButton"));
        setField(term27410, term27410.getClass(), "initialTip", null);
        setField(term27410, term27410.getClass(), "model", null);
        setField(term27410, term27410.getClass(), "text", null);
        setField(term27410, term27410.getClass(), "margin", null);
        setField(term27410, term27410.getClass(), "defaultMargin", null);
        setField(term27410, term27410.getClass(), "defaultIcon", null);
        setField(term27410, term27410.getClass(), "pressedIcon", null);
        setField(term27410, term27410.getClass(), "disabledIcon", null);
        setField(term27410, term27410.getClass(), "selectedIcon", null);
        setField(term27410, term27410.getClass(), "disabledSelectedIcon", null);
        setField(term27410, term27410.getClass(), "rolloverIcon", null);
        setField(term27410, term27410.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27410, term27410.getClass(), "paintBorder", false);
        setBooleanField(term27410, term27410.getClass(), "paintFocus", false);
        setBooleanField(term27410, term27410.getClass(), "rolloverEnabled", false);
        setBooleanField(term27410, term27410.getClass(), "contentAreaFilled", false);
        setIntField(term27410, term27410.getClass(), "verticalAlignment", 0);
        setIntField(term27410, term27410.getClass(), "horizontalAlignment", 0);
        setIntField(term27410, term27410.getClass(), "verticalTextPosition", 0);
        setIntField(term27410, term27410.getClass(), "horizontalTextPosition", 0);
        setIntField(term27410, term27410.getClass(), "iconTextGap", 0);
        setIntField(term27410, term27410.getClass(), "mnemonic", 0);
        setIntField(term27410, term27410.getClass(), "mnemonicIndex", 0);
        setLongField(term27410, term27410.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27410, term27410.getClass(), "borderPaintedSet", false);
        setBooleanField(term27410, term27410.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27410, term27410.getClass(), "iconTextGapSet", false);
        setBooleanField(term27410, term27410.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27410, term27410.getClass(), "setLayout", false);
        setBooleanField(term27410, term27410.getClass(), "defaultCapable", false);
        setField(term27410, term27410.getClass(), "handler", null);
        setField(term27410, term27410.getClass(), "changeListener", null);
        setField(term27410, term27410.getClass(), "actionListener", null);
        setField(term27410, term27410.getClass(), "itemListener", null);
        setField(term27410, term27410.getClass(), "changeEvent", null);
        setBooleanField(term27410, term27410.getClass(), "hideActionText", false);
        setField(term27410, term27410.getClass(), "action", null);
        setField(term27410, term27410.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27410, term27410.getClass(), "isAlignmentXSet", false);
        setFloatField(term27410, term27410.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27410, term27410.getClass(), "isAlignmentYSet", false);
        setFloatField(term27410, term27410.getClass(), "alignmentY", 0.0F);
        setField(term27410, term27410.getClass(), "ui", null);
        setField(term27410, term27410.getClass(), "listenerList", null);
        setField(term27410, term27410.getClass(), "clientProperties", null);
        setField(term27410, term27410.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27410, term27410.getClass(), "autoscrolls", false);
        setField(term27410, term27410.getClass(), "border", null);
        setIntField(term27410, term27410.getClass(), "flags", 0);
        setField(term27410, term27410.getClass(), "inputVerifier", null);
        setBooleanField(term27410, term27410.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27410, term27410.getClass(), "paintingChild", null);
        setField(term27410, term27410.getClass(), "popupMenu", null);
        setField(term27410, term27410.getClass(), "revalidateRunnableScheduled", null);
        setField(term27410, term27410.getClass(), "focusInputMap", null);
        setField(term27410, term27410.getClass(), "ancestorInputMap", null);
        setField(term27410, term27410.getClass(), "windowInputMap", null);
        setField(term27410, term27410.getClass(), "actionMap", null);
        setField(term27410, term27410.getClass(), "aaHint", null);
        setField(term27410, term27410.getClass(), "lcdRenderingHint", null);
        setField(term27410, term27410.getClass(), "component", null);
        setField(term27410, term27410.getClass(), "layoutMgr", null);
        setField(term27410, term27410.getClass(), "dispatcher", null);
        setField(term27410, term27410.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27410, term27410.getClass(), "focusCycleRoot", false);
        setBooleanField(term27410, term27410.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27410, term27410.getClass(), "printingThreads", null);
        setBooleanField(term27410, term27410.getClass(), "printing", false);
        setField(term27410, term27410.getClass(), "containerListener", null);
        setIntField(term27410, term27410.getClass(), "listeningChildren", 0);
        setIntField(term27410, term27410.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27410, term27410.getClass(), "descendantsCount", 0);
        setField(term27410, term27410.getClass(), "preserveBackgroundColor", null);
        setIntField(term27410, term27410.getClass(), "numOfHWComponents", 0);
        setIntField(term27410, term27410.getClass(), "numOfLWComponents", 0);
        setField(term27410, term27410.getClass(), "modalComp", null);
        setField(term27410, term27410.getClass(), "modalAppContext", null);
        setIntField(term27410, term27410.getClass(), "containerSerializedDataVersion", 0);
        setField(term27410, term27410.getClass(), "peer", null);
        setField(term27410, term27410.getClass(), "parent", null);
        setField(term27410, term27410.getClass(), "appContext", null);
        setIntField(term27410, term27410.getClass(), "x", 0);
        setIntField(term27410, term27410.getClass(), "y", 0);
        setIntField(term27410, term27410.getClass(), "width", 0);
        setIntField(term27410, term27410.getClass(), "height", 0);
        setField(term27410, term27410.getClass(), "foreground", null);
        setField(term27410, term27410.getClass(), "background", null);
        setField(term27410, term27410.getClass(), "font", null);
        setField(term27410, term27410.getClass(), "peerFont", null);
        setField(term27410, term27410.getClass(), "cursor", null);
        setField(term27410, term27410.getClass(), "locale", null);
        setField(term27410, term27410.getClass(), "graphicsConfig", null);
        setField(term27410, term27410.getClass(), "bufferStrategy", null);
        setBooleanField(term27410, term27410.getClass(), "ignoreRepaint", false);
        setBooleanField(term27410, term27410.getClass(), "visible", false);
        setBooleanField(term27410, term27410.getClass(), "enabled", false);
        setBooleanField(term27410, term27410.getClass(), "valid", false);
        setField(term27410, term27410.getClass(), "dropTarget", null);
        setField(term27410, term27410.getClass(), "popups", null);
        setField(term27410, term27410.getClass(), "name", null);
        setBooleanField(term27410, term27410.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27410, term27410.getClass(), "focusable", false);
        setIntField(term27410, term27410.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27410, term27410.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27410, term27410.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27410, term27410.getClass(), "acc", null);
        setField(term27410, term27410.getClass(), "minSize", null);
        setBooleanField(term27410, term27410.getClass(), "minSizeSet", false);
        setField(term27410, term27410.getClass(), "prefSize", null);
        setBooleanField(term27410, term27410.getClass(), "prefSizeSet", false);
        setField(term27410, term27410.getClass(), "maxSize", null);
        setBooleanField(term27410, term27410.getClass(), "maxSizeSet", false);
        setField(term27410, term27410.getClass(), "componentOrientation", null);
        setBooleanField(term27410, term27410.getClass(), "newEventsOnly", false);
        setField(term27410, term27410.getClass(), "componentListener", null);
        setField(term27410, term27410.getClass(), "focusListener", null);
        setField(term27410, term27410.getClass(), "hierarchyListener", null);
        setField(term27410, term27410.getClass(), "hierarchyBoundsListener", null);
        setField(term27410, term27410.getClass(), "keyListener", null);
        setField(term27410, term27410.getClass(), "mouseListener", null);
        setField(term27410, term27410.getClass(), "mouseMotionListener", null);
        setField(term27410, term27410.getClass(), "mouseWheelListener", null);
        setField(term27410, term27410.getClass(), "inputMethodListener", null);
        setLongField(term27410, term27410.getClass(), "eventMask", 0L);
        setField(term27410, term27410.getClass(), "changeSupport", null);
        setField(term27410, term27410.getClass(), "objectLock", null);
        setBooleanField(term27410, term27410.getClass(), "isPacked", false);
        setIntField(term27410, term27410.getClass(), "boundsOp", 0);
        setField(term27410, term27410.getClass(), "compoundShape", null);
        setField(term27410, term27410.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27410, term27410.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27410, term27410.getClass(), "backgroundEraseDisabled", false);
        setField(term27410, term27410.getClass(), "eventCache", null);
        setBooleanField(term27410, term27410.getClass(), "coalescingEnabled", false);
        setBooleanField(term27410, term27410.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27410, term27410.getClass(), "componentSerializedDataVersion", 0);
        setField(term27410, term27410.getClass(), "accessibleContext", null);
        term27470 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term27470;
        callMethod(klass, "setEnabled", argTypes, term27410, args);
    }

};


