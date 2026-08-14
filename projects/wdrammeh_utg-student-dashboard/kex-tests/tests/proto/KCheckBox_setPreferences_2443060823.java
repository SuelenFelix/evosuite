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
import java.lang.Object;

public class KCheckBox_setPreferences_2443060823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57288;

    public KCheckBox_setPreferences_2443060823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57288 = newInstance(Class.forName("proto.KCheckBox"));
        Object term57302 = newInstance(Class.forName("java.awt.Insets"));
        Object term57307 = newInstance(Class.forName("java.awt.Insets"));
        Object term57330 = newInstance(Class.forName("javax.swing.AbstractButton$Handler"));
        setBooleanField(term57288, term57288.getClass(), "flat", false);
        setField(term57288, term57288.getClass(), "model", null);
        setField(term57288, term57288.getClass(), "text", "xIeFjkHkOe");
        setIntField(term57302, term57302.getClass(), "top", 1973060703);
        setIntField(term57302, term57302.getClass(), "left", -138239905);
        setIntField(term57302, term57302.getClass(), "bottom", 1709474063);
        setIntField(term57302, term57302.getClass(), "right", 1406617209);
        setField(term57288, term57288.getClass(), "margin", term57302);
        setIntField(term57307, term57307.getClass(), "top", 1706047059);
        setIntField(term57307, term57307.getClass(), "left", 590451710);
        setIntField(term57307, term57307.getClass(), "bottom", -1999787419);
        setIntField(term57307, term57307.getClass(), "right", -1224443634);
        setField(term57288, term57288.getClass(), "defaultMargin", term57307);
        setField(term57288, term57288.getClass(), "defaultIcon", null);
        setField(term57288, term57288.getClass(), "pressedIcon", null);
        setField(term57288, term57288.getClass(), "disabledIcon", null);
        setField(term57288, term57288.getClass(), "selectedIcon", null);
        setField(term57288, term57288.getClass(), "disabledSelectedIcon", null);
        setField(term57288, term57288.getClass(), "rolloverIcon", null);
        setField(term57288, term57288.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term57288, term57288.getClass(), "paintBorder", true);
        setBooleanField(term57288, term57288.getClass(), "paintFocus", true);
        setBooleanField(term57288, term57288.getClass(), "rolloverEnabled", false);
        setBooleanField(term57288, term57288.getClass(), "contentAreaFilled", true);
        setIntField(term57288, term57288.getClass(), "verticalAlignment", 1048451946);
        setIntField(term57288, term57288.getClass(), "horizontalAlignment", 5603560);
        setIntField(term57288, term57288.getClass(), "verticalTextPosition", -1079020032);
        setIntField(term57288, term57288.getClass(), "horizontalTextPosition", -1973791064);
        setIntField(term57288, term57288.getClass(), "iconTextGap", -2072158633);
        setIntField(term57288, term57288.getClass(), "mnemonic", -355469363);
        setIntField(term57288, term57288.getClass(), "mnemonicIndex", 1465188553);
        setLongField(term57288, term57288.getClass(), "multiClickThreshhold", 4178434741742309755L);
        setBooleanField(term57288, term57288.getClass(), "borderPaintedSet", false);
        setBooleanField(term57288, term57288.getClass(), "rolloverEnabledSet", true);
        setBooleanField(term57288, term57288.getClass(), "iconTextGapSet", false);
        setBooleanField(term57288, term57288.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term57288, term57288.getClass(), "setLayout", true);
        setBooleanField(term57288, term57288.getClass(), "defaultCapable", false);
        setField(term57330, term57330.getClass(), "this$0", null);
        setField(term57288, term57288.getClass(), "handler", term57330);
        setField(term57288, term57288.getClass(), "changeListener", null);
        setField(term57288, term57288.getClass(), "actionListener", null);
        setField(term57288, term57288.getClass(), "itemListener", null);
        setField(term57288, term57288.getClass(), "changeEvent", null);
        setBooleanField(term57288, term57288.getClass(), "hideActionText", false);
        setField(term57288, term57288.getClass(), "action", null);
        setField(term57288, term57288.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term57288, term57288.getClass(), "isAlignmentXSet", false);
        setFloatField(term57288, term57288.getClass(), "alignmentX", 0.0F);
        setBooleanField(term57288, term57288.getClass(), "isAlignmentYSet", false);
        setFloatField(term57288, term57288.getClass(), "alignmentY", 0.0F);
        setField(term57288, term57288.getClass(), "ui", null);
        setField(term57288, term57288.getClass(), "listenerList", null);
        setField(term57288, term57288.getClass(), "clientProperties", null);
        setField(term57288, term57288.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term57288, term57288.getClass(), "autoscrolls", false);
        setField(term57288, term57288.getClass(), "border", null);
        setIntField(term57288, term57288.getClass(), "flags", 0);
        setField(term57288, term57288.getClass(), "inputVerifier", null);
        setBooleanField(term57288, term57288.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term57288, term57288.getClass(), "paintingChild", null);
        setField(term57288, term57288.getClass(), "popupMenu", null);
        setField(term57288, term57288.getClass(), "revalidateRunnableScheduled", null);
        setField(term57288, term57288.getClass(), "focusInputMap", null);
        setField(term57288, term57288.getClass(), "ancestorInputMap", null);
        setField(term57288, term57288.getClass(), "windowInputMap", null);
        setField(term57288, term57288.getClass(), "actionMap", null);
        setField(term57288, term57288.getClass(), "aaHint", null);
        setField(term57288, term57288.getClass(), "lcdRenderingHint", null);
        setField(term57288, term57288.getClass(), "component", null);
        setField(term57288, term57288.getClass(), "layoutMgr", null);
        setField(term57288, term57288.getClass(), "dispatcher", null);
        setField(term57288, term57288.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57288, term57288.getClass(), "focusCycleRoot", false);
        setBooleanField(term57288, term57288.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57288, term57288.getClass(), "printingThreads", null);
        setBooleanField(term57288, term57288.getClass(), "printing", false);
        setField(term57288, term57288.getClass(), "containerListener", null);
        setIntField(term57288, term57288.getClass(), "listeningChildren", 0);
        setIntField(term57288, term57288.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57288, term57288.getClass(), "descendantsCount", 0);
        setField(term57288, term57288.getClass(), "preserveBackgroundColor", null);
        setIntField(term57288, term57288.getClass(), "numOfHWComponents", 0);
        setIntField(term57288, term57288.getClass(), "numOfLWComponents", 0);
        setField(term57288, term57288.getClass(), "modalComp", null);
        setField(term57288, term57288.getClass(), "modalAppContext", null);
        setIntField(term57288, term57288.getClass(), "containerSerializedDataVersion", 0);
        setField(term57288, term57288.getClass(), "peer", null);
        setField(term57288, term57288.getClass(), "parent", null);
        setField(term57288, term57288.getClass(), "appContext", null);
        setIntField(term57288, term57288.getClass(), "x", 0);
        setIntField(term57288, term57288.getClass(), "y", 0);
        setIntField(term57288, term57288.getClass(), "width", 0);
        setIntField(term57288, term57288.getClass(), "height", 0);
        setField(term57288, term57288.getClass(), "foreground", null);
        setField(term57288, term57288.getClass(), "background", null);
        setField(term57288, term57288.getClass(), "font", null);
        setField(term57288, term57288.getClass(), "peerFont", null);
        setField(term57288, term57288.getClass(), "cursor", null);
        setField(term57288, term57288.getClass(), "locale", null);
        setField(term57288, term57288.getClass(), "graphicsConfig", null);
        setField(term57288, term57288.getClass(), "bufferStrategy", null);
        setBooleanField(term57288, term57288.getClass(), "ignoreRepaint", false);
        setBooleanField(term57288, term57288.getClass(), "visible", false);
        setBooleanField(term57288, term57288.getClass(), "enabled", false);
        setBooleanField(term57288, term57288.getClass(), "valid", false);
        setField(term57288, term57288.getClass(), "dropTarget", null);
        setField(term57288, term57288.getClass(), "popups", null);
        setField(term57288, term57288.getClass(), "name", null);
        setBooleanField(term57288, term57288.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57288, term57288.getClass(), "focusable", false);
        setIntField(term57288, term57288.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57288, term57288.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57288, term57288.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57288, term57288.getClass(), "acc", null);
        setField(term57288, term57288.getClass(), "minSize", null);
        setBooleanField(term57288, term57288.getClass(), "minSizeSet", false);
        setField(term57288, term57288.getClass(), "prefSize", null);
        setBooleanField(term57288, term57288.getClass(), "prefSizeSet", false);
        setField(term57288, term57288.getClass(), "maxSize", null);
        setBooleanField(term57288, term57288.getClass(), "maxSizeSet", false);
        setField(term57288, term57288.getClass(), "componentOrientation", null);
        setBooleanField(term57288, term57288.getClass(), "newEventsOnly", false);
        setField(term57288, term57288.getClass(), "componentListener", null);
        setField(term57288, term57288.getClass(), "focusListener", null);
        setField(term57288, term57288.getClass(), "hierarchyListener", null);
        setField(term57288, term57288.getClass(), "hierarchyBoundsListener", null);
        setField(term57288, term57288.getClass(), "keyListener", null);
        setField(term57288, term57288.getClass(), "mouseListener", null);
        setField(term57288, term57288.getClass(), "mouseMotionListener", null);
        setField(term57288, term57288.getClass(), "mouseWheelListener", null);
        setField(term57288, term57288.getClass(), "inputMethodListener", null);
        setLongField(term57288, term57288.getClass(), "eventMask", 0L);
        setField(term57288, term57288.getClass(), "changeSupport", null);
        setField(term57288, term57288.getClass(), "objectLock", null);
        setBooleanField(term57288, term57288.getClass(), "isPacked", false);
        setIntField(term57288, term57288.getClass(), "boundsOp", 0);
        setField(term57288, term57288.getClass(), "compoundShape", null);
        setField(term57288, term57288.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57288, term57288.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57288, term57288.getClass(), "backgroundEraseDisabled", false);
        setField(term57288, term57288.getClass(), "eventCache", null);
        setBooleanField(term57288, term57288.getClass(), "coalescingEnabled", false);
        setBooleanField(term57288, term57288.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57288, term57288.getClass(), "componentSerializedDataVersion", 0);
        setField(term57288, term57288.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term57288, args);
    }

};


