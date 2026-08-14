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
     Object term26916;
     Object term26976;
     Object term26978;

    public KButton_createIconifiedButton_175702877518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26916 = newInstance(Class.forName("proto.KButton"));
        setField(term26916, term26916.getClass(), "initialTip", null);
        setField(term26916, term26916.getClass(), "model", null);
        setField(term26916, term26916.getClass(), "text", null);
        setField(term26916, term26916.getClass(), "margin", null);
        setField(term26916, term26916.getClass(), "defaultMargin", null);
        setField(term26916, term26916.getClass(), "defaultIcon", null);
        setField(term26916, term26916.getClass(), "pressedIcon", null);
        setField(term26916, term26916.getClass(), "disabledIcon", null);
        setField(term26916, term26916.getClass(), "selectedIcon", null);
        setField(term26916, term26916.getClass(), "disabledSelectedIcon", null);
        setField(term26916, term26916.getClass(), "rolloverIcon", null);
        setField(term26916, term26916.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term26916, term26916.getClass(), "paintBorder", false);
        setBooleanField(term26916, term26916.getClass(), "paintFocus", false);
        setBooleanField(term26916, term26916.getClass(), "rolloverEnabled", false);
        setBooleanField(term26916, term26916.getClass(), "contentAreaFilled", false);
        setIntField(term26916, term26916.getClass(), "verticalAlignment", 0);
        setIntField(term26916, term26916.getClass(), "horizontalAlignment", 0);
        setIntField(term26916, term26916.getClass(), "verticalTextPosition", 0);
        setIntField(term26916, term26916.getClass(), "horizontalTextPosition", 0);
        setIntField(term26916, term26916.getClass(), "iconTextGap", 0);
        setIntField(term26916, term26916.getClass(), "mnemonic", 0);
        setIntField(term26916, term26916.getClass(), "mnemonicIndex", 0);
        setLongField(term26916, term26916.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term26916, term26916.getClass(), "borderPaintedSet", false);
        setBooleanField(term26916, term26916.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term26916, term26916.getClass(), "iconTextGapSet", false);
        setBooleanField(term26916, term26916.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term26916, term26916.getClass(), "setLayout", false);
        setBooleanField(term26916, term26916.getClass(), "defaultCapable", false);
        setField(term26916, term26916.getClass(), "handler", null);
        setField(term26916, term26916.getClass(), "changeListener", null);
        setField(term26916, term26916.getClass(), "actionListener", null);
        setField(term26916, term26916.getClass(), "itemListener", null);
        setField(term26916, term26916.getClass(), "changeEvent", null);
        setBooleanField(term26916, term26916.getClass(), "hideActionText", false);
        setField(term26916, term26916.getClass(), "action", null);
        setField(term26916, term26916.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term26916, term26916.getClass(), "isAlignmentXSet", false);
        setFloatField(term26916, term26916.getClass(), "alignmentX", 0.0F);
        setBooleanField(term26916, term26916.getClass(), "isAlignmentYSet", false);
        setFloatField(term26916, term26916.getClass(), "alignmentY", 0.0F);
        setField(term26916, term26916.getClass(), "ui", null);
        setField(term26916, term26916.getClass(), "listenerList", null);
        setField(term26916, term26916.getClass(), "clientProperties", null);
        setField(term26916, term26916.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term26916, term26916.getClass(), "autoscrolls", false);
        setField(term26916, term26916.getClass(), "border", null);
        setIntField(term26916, term26916.getClass(), "flags", 0);
        setField(term26916, term26916.getClass(), "inputVerifier", null);
        setBooleanField(term26916, term26916.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term26916, term26916.getClass(), "paintingChild", null);
        setField(term26916, term26916.getClass(), "popupMenu", null);
        setField(term26916, term26916.getClass(), "revalidateRunnableScheduled", null);
        setField(term26916, term26916.getClass(), "focusInputMap", null);
        setField(term26916, term26916.getClass(), "ancestorInputMap", null);
        setField(term26916, term26916.getClass(), "windowInputMap", null);
        setField(term26916, term26916.getClass(), "actionMap", null);
        setField(term26916, term26916.getClass(), "aaHint", null);
        setField(term26916, term26916.getClass(), "lcdRenderingHint", null);
        setField(term26916, term26916.getClass(), "component", null);
        setField(term26916, term26916.getClass(), "layoutMgr", null);
        setField(term26916, term26916.getClass(), "dispatcher", null);
        setField(term26916, term26916.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term26916, term26916.getClass(), "focusCycleRoot", false);
        setBooleanField(term26916, term26916.getClass(), "focusTraversalPolicyProvider", false);
        setField(term26916, term26916.getClass(), "printingThreads", null);
        setBooleanField(term26916, term26916.getClass(), "printing", false);
        setField(term26916, term26916.getClass(), "containerListener", null);
        setIntField(term26916, term26916.getClass(), "listeningChildren", 0);
        setIntField(term26916, term26916.getClass(), "listeningBoundsChildren", 0);
        setIntField(term26916, term26916.getClass(), "descendantsCount", 0);
        setField(term26916, term26916.getClass(), "preserveBackgroundColor", null);
        setIntField(term26916, term26916.getClass(), "numOfHWComponents", 0);
        setIntField(term26916, term26916.getClass(), "numOfLWComponents", 0);
        setField(term26916, term26916.getClass(), "modalComp", null);
        setField(term26916, term26916.getClass(), "modalAppContext", null);
        setIntField(term26916, term26916.getClass(), "containerSerializedDataVersion", 0);
        setField(term26916, term26916.getClass(), "peer", null);
        setField(term26916, term26916.getClass(), "parent", null);
        setField(term26916, term26916.getClass(), "appContext", null);
        setIntField(term26916, term26916.getClass(), "x", 0);
        setIntField(term26916, term26916.getClass(), "y", 0);
        setIntField(term26916, term26916.getClass(), "width", 0);
        setIntField(term26916, term26916.getClass(), "height", 0);
        setField(term26916, term26916.getClass(), "foreground", null);
        setField(term26916, term26916.getClass(), "background", null);
        setField(term26916, term26916.getClass(), "font", null);
        setField(term26916, term26916.getClass(), "peerFont", null);
        setField(term26916, term26916.getClass(), "cursor", null);
        setField(term26916, term26916.getClass(), "locale", null);
        setField(term26916, term26916.getClass(), "graphicsConfig", null);
        setField(term26916, term26916.getClass(), "bufferStrategy", null);
        setBooleanField(term26916, term26916.getClass(), "ignoreRepaint", false);
        setBooleanField(term26916, term26916.getClass(), "visible", false);
        setBooleanField(term26916, term26916.getClass(), "enabled", false);
        setBooleanField(term26916, term26916.getClass(), "valid", false);
        setField(term26916, term26916.getClass(), "dropTarget", null);
        setField(term26916, term26916.getClass(), "popups", null);
        setField(term26916, term26916.getClass(), "name", null);
        setBooleanField(term26916, term26916.getClass(), "nameExplicitlySet", false);
        setBooleanField(term26916, term26916.getClass(), "focusable", false);
        setIntField(term26916, term26916.getClass(), "isFocusTraversableOverridden", 0);
        setField(term26916, term26916.getClass(), "focusTraversalKeys", null);
        setBooleanField(term26916, term26916.getClass(), "focusTraversalKeysEnabled", false);
        setField(term26916, term26916.getClass(), "acc", null);
        setField(term26916, term26916.getClass(), "minSize", null);
        setBooleanField(term26916, term26916.getClass(), "minSizeSet", false);
        setField(term26916, term26916.getClass(), "prefSize", null);
        setBooleanField(term26916, term26916.getClass(), "prefSizeSet", false);
        setField(term26916, term26916.getClass(), "maxSize", null);
        setBooleanField(term26916, term26916.getClass(), "maxSizeSet", false);
        setField(term26916, term26916.getClass(), "componentOrientation", null);
        setBooleanField(term26916, term26916.getClass(), "newEventsOnly", false);
        setField(term26916, term26916.getClass(), "componentListener", null);
        setField(term26916, term26916.getClass(), "focusListener", null);
        setField(term26916, term26916.getClass(), "hierarchyListener", null);
        setField(term26916, term26916.getClass(), "hierarchyBoundsListener", null);
        setField(term26916, term26916.getClass(), "keyListener", null);
        setField(term26916, term26916.getClass(), "mouseListener", null);
        setField(term26916, term26916.getClass(), "mouseMotionListener", null);
        setField(term26916, term26916.getClass(), "mouseWheelListener", null);
        setField(term26916, term26916.getClass(), "inputMethodListener", null);
        setLongField(term26916, term26916.getClass(), "eventMask", 0L);
        setField(term26916, term26916.getClass(), "changeSupport", null);
        setField(term26916, term26916.getClass(), "objectLock", null);
        setBooleanField(term26916, term26916.getClass(), "isPacked", false);
        setIntField(term26916, term26916.getClass(), "boundsOp", 0);
        setField(term26916, term26916.getClass(), "compoundShape", null);
        setField(term26916, term26916.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term26916, term26916.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term26916, term26916.getClass(), "backgroundEraseDisabled", false);
        setField(term26916, term26916.getClass(), "eventCache", null);
        setBooleanField(term26916, term26916.getClass(), "coalescingEnabled", false);
        setBooleanField(term26916, term26916.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term26916, term26916.getClass(), "componentSerializedDataVersion", 0);
        setField(term26916, term26916.getClass(), "accessibleContext", null);
        term26976 = new Integer(0);
        term26978 = new Integer(0);
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
        args[2] = term26976;
        args[3] = term26978;
        callMethod(klass, "createIconifiedButton", argTypes, term26916, args);
    }

};


