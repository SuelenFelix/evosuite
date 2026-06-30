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

public class KButton_createIconifiedButton_175702877518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26883;
     Object term26943;
     Object term26945;

    public KButton_createIconifiedButton_175702877518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26883 = newInstance(Class.forName("proto.KButton"));
        setField(term26883, term26883.getClass(), "initialTip", null);
        setField(term26883, term26883.getClass(), "model", null);
        setField(term26883, term26883.getClass(), "text", null);
        setField(term26883, term26883.getClass(), "margin", null);
        setField(term26883, term26883.getClass(), "defaultMargin", null);
        setField(term26883, term26883.getClass(), "defaultIcon", null);
        setField(term26883, term26883.getClass(), "pressedIcon", null);
        setField(term26883, term26883.getClass(), "disabledIcon", null);
        setField(term26883, term26883.getClass(), "selectedIcon", null);
        setField(term26883, term26883.getClass(), "disabledSelectedIcon", null);
        setField(term26883, term26883.getClass(), "rolloverIcon", null);
        setField(term26883, term26883.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term26883, term26883.getClass(), "paintBorder", false);
        setBooleanField(term26883, term26883.getClass(), "paintFocus", false);
        setBooleanField(term26883, term26883.getClass(), "rolloverEnabled", false);
        setBooleanField(term26883, term26883.getClass(), "contentAreaFilled", false);
        setIntField(term26883, term26883.getClass(), "verticalAlignment", 0);
        setIntField(term26883, term26883.getClass(), "horizontalAlignment", 0);
        setIntField(term26883, term26883.getClass(), "verticalTextPosition", 0);
        setIntField(term26883, term26883.getClass(), "horizontalTextPosition", 0);
        setIntField(term26883, term26883.getClass(), "iconTextGap", 0);
        setIntField(term26883, term26883.getClass(), "mnemonic", 0);
        setIntField(term26883, term26883.getClass(), "mnemonicIndex", 0);
        setLongField(term26883, term26883.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term26883, term26883.getClass(), "borderPaintedSet", false);
        setBooleanField(term26883, term26883.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term26883, term26883.getClass(), "iconTextGapSet", false);
        setBooleanField(term26883, term26883.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term26883, term26883.getClass(), "setLayout", false);
        setBooleanField(term26883, term26883.getClass(), "defaultCapable", false);
        setField(term26883, term26883.getClass(), "handler", null);
        setField(term26883, term26883.getClass(), "changeListener", null);
        setField(term26883, term26883.getClass(), "actionListener", null);
        setField(term26883, term26883.getClass(), "itemListener", null);
        setField(term26883, term26883.getClass(), "changeEvent", null);
        setBooleanField(term26883, term26883.getClass(), "hideActionText", false);
        setField(term26883, term26883.getClass(), "action", null);
        setField(term26883, term26883.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term26883, term26883.getClass(), "isAlignmentXSet", false);
        setFloatField(term26883, term26883.getClass(), "alignmentX", 0.0F);
        setBooleanField(term26883, term26883.getClass(), "isAlignmentYSet", false);
        setFloatField(term26883, term26883.getClass(), "alignmentY", 0.0F);
        setField(term26883, term26883.getClass(), "ui", null);
        setField(term26883, term26883.getClass(), "listenerList", null);
        setField(term26883, term26883.getClass(), "clientProperties", null);
        setField(term26883, term26883.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term26883, term26883.getClass(), "autoscrolls", false);
        setField(term26883, term26883.getClass(), "border", null);
        setIntField(term26883, term26883.getClass(), "flags", 0);
        setField(term26883, term26883.getClass(), "inputVerifier", null);
        setBooleanField(term26883, term26883.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term26883, term26883.getClass(), "paintingChild", null);
        setField(term26883, term26883.getClass(), "popupMenu", null);
        setField(term26883, term26883.getClass(), "revalidateRunnableScheduled", null);
        setField(term26883, term26883.getClass(), "focusInputMap", null);
        setField(term26883, term26883.getClass(), "ancestorInputMap", null);
        setField(term26883, term26883.getClass(), "windowInputMap", null);
        setField(term26883, term26883.getClass(), "actionMap", null);
        setField(term26883, term26883.getClass(), "aaHint", null);
        setField(term26883, term26883.getClass(), "lcdRenderingHint", null);
        setField(term26883, term26883.getClass(), "component", null);
        setField(term26883, term26883.getClass(), "layoutMgr", null);
        setField(term26883, term26883.getClass(), "dispatcher", null);
        setField(term26883, term26883.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term26883, term26883.getClass(), "focusCycleRoot", false);
        setBooleanField(term26883, term26883.getClass(), "focusTraversalPolicyProvider", false);
        setField(term26883, term26883.getClass(), "printingThreads", null);
        setBooleanField(term26883, term26883.getClass(), "printing", false);
        setField(term26883, term26883.getClass(), "containerListener", null);
        setIntField(term26883, term26883.getClass(), "listeningChildren", 0);
        setIntField(term26883, term26883.getClass(), "listeningBoundsChildren", 0);
        setIntField(term26883, term26883.getClass(), "descendantsCount", 0);
        setField(term26883, term26883.getClass(), "preserveBackgroundColor", null);
        setIntField(term26883, term26883.getClass(), "numOfHWComponents", 0);
        setIntField(term26883, term26883.getClass(), "numOfLWComponents", 0);
        setField(term26883, term26883.getClass(), "modalComp", null);
        setField(term26883, term26883.getClass(), "modalAppContext", null);
        setIntField(term26883, term26883.getClass(), "containerSerializedDataVersion", 0);
        setField(term26883, term26883.getClass(), "peer", null);
        setField(term26883, term26883.getClass(), "parent", null);
        setField(term26883, term26883.getClass(), "appContext", null);
        setIntField(term26883, term26883.getClass(), "x", 0);
        setIntField(term26883, term26883.getClass(), "y", 0);
        setIntField(term26883, term26883.getClass(), "width", 0);
        setIntField(term26883, term26883.getClass(), "height", 0);
        setField(term26883, term26883.getClass(), "foreground", null);
        setField(term26883, term26883.getClass(), "background", null);
        setField(term26883, term26883.getClass(), "font", null);
        setField(term26883, term26883.getClass(), "peerFont", null);
        setField(term26883, term26883.getClass(), "cursor", null);
        setField(term26883, term26883.getClass(), "locale", null);
        setField(term26883, term26883.getClass(), "graphicsConfig", null);
        setField(term26883, term26883.getClass(), "bufferStrategy", null);
        setBooleanField(term26883, term26883.getClass(), "ignoreRepaint", false);
        setBooleanField(term26883, term26883.getClass(), "visible", false);
        setBooleanField(term26883, term26883.getClass(), "enabled", false);
        setBooleanField(term26883, term26883.getClass(), "valid", false);
        setField(term26883, term26883.getClass(), "dropTarget", null);
        setField(term26883, term26883.getClass(), "popups", null);
        setField(term26883, term26883.getClass(), "name", null);
        setBooleanField(term26883, term26883.getClass(), "nameExplicitlySet", false);
        setBooleanField(term26883, term26883.getClass(), "focusable", false);
        setIntField(term26883, term26883.getClass(), "isFocusTraversableOverridden", 0);
        setField(term26883, term26883.getClass(), "focusTraversalKeys", null);
        setBooleanField(term26883, term26883.getClass(), "focusTraversalKeysEnabled", false);
        setField(term26883, term26883.getClass(), "acc", null);
        setField(term26883, term26883.getClass(), "minSize", null);
        setBooleanField(term26883, term26883.getClass(), "minSizeSet", false);
        setField(term26883, term26883.getClass(), "prefSize", null);
        setBooleanField(term26883, term26883.getClass(), "prefSizeSet", false);
        setField(term26883, term26883.getClass(), "maxSize", null);
        setBooleanField(term26883, term26883.getClass(), "maxSizeSet", false);
        setField(term26883, term26883.getClass(), "componentOrientation", null);
        setBooleanField(term26883, term26883.getClass(), "newEventsOnly", false);
        setField(term26883, term26883.getClass(), "componentListener", null);
        setField(term26883, term26883.getClass(), "focusListener", null);
        setField(term26883, term26883.getClass(), "hierarchyListener", null);
        setField(term26883, term26883.getClass(), "hierarchyBoundsListener", null);
        setField(term26883, term26883.getClass(), "keyListener", null);
        setField(term26883, term26883.getClass(), "mouseListener", null);
        setField(term26883, term26883.getClass(), "mouseMotionListener", null);
        setField(term26883, term26883.getClass(), "mouseWheelListener", null);
        setField(term26883, term26883.getClass(), "inputMethodListener", null);
        setLongField(term26883, term26883.getClass(), "eventMask", 0L);
        setField(term26883, term26883.getClass(), "changeSupport", null);
        setField(term26883, term26883.getClass(), "objectLock", null);
        setBooleanField(term26883, term26883.getClass(), "isPacked", false);
        setIntField(term26883, term26883.getClass(), "boundsOp", 0);
        setField(term26883, term26883.getClass(), "compoundShape", null);
        setField(term26883, term26883.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term26883, term26883.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term26883, term26883.getClass(), "backgroundEraseDisabled", false);
        setField(term26883, term26883.getClass(), "eventCache", null);
        setBooleanField(term26883, term26883.getClass(), "coalescingEnabled", false);
        setBooleanField(term26883, term26883.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term26883, term26883.getClass(), "componentSerializedDataVersion", 0);
        setField(term26883, term26883.getClass(), "accessibleContext", null);
        term26943 = new Integer(0);
        term26945 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term26943;
        args[3] = term26945;
        callMethod(klass, "createIconifiedButton", argTypes, term26883, args);
    }

};


