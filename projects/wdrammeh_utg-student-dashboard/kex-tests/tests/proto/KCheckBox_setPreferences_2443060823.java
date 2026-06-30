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
     Object term57239;

    public KCheckBox_setPreferences_2443060823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57239 = newInstance(Class.forName("proto.KCheckBox"));
        Object term57253 = newInstance(Class.forName("java.awt.Insets"));
        Object term57258 = newInstance(Class.forName("java.awt.Insets"));
        Object term57281 = newInstance(Class.forName("javax.swing.AbstractButton$Handler"));
        setBooleanField(term57239, term57239.getClass(), "flat", true);
        setField(term57239, term57239.getClass(), "model", null);
        setField(term57239, term57239.getClass(), "text", "xIeFjkHkOe");
        setIntField(term57253, term57253.getClass(), "top", 1973060703);
        setIntField(term57253, term57253.getClass(), "left", -138239905);
        setIntField(term57253, term57253.getClass(), "bottom", 1709474063);
        setIntField(term57253, term57253.getClass(), "right", 1406617209);
        setField(term57239, term57239.getClass(), "margin", term57253);
        setIntField(term57258, term57258.getClass(), "top", 1706047059);
        setIntField(term57258, term57258.getClass(), "left", 590451710);
        setIntField(term57258, term57258.getClass(), "bottom", -1999787419);
        setIntField(term57258, term57258.getClass(), "right", -1224443634);
        setField(term57239, term57239.getClass(), "defaultMargin", term57258);
        setField(term57239, term57239.getClass(), "defaultIcon", null);
        setField(term57239, term57239.getClass(), "pressedIcon", null);
        setField(term57239, term57239.getClass(), "disabledIcon", null);
        setField(term57239, term57239.getClass(), "selectedIcon", null);
        setField(term57239, term57239.getClass(), "disabledSelectedIcon", null);
        setField(term57239, term57239.getClass(), "rolloverIcon", null);
        setField(term57239, term57239.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term57239, term57239.getClass(), "paintBorder", false);
        setBooleanField(term57239, term57239.getClass(), "paintFocus", true);
        setBooleanField(term57239, term57239.getClass(), "rolloverEnabled", true);
        setBooleanField(term57239, term57239.getClass(), "contentAreaFilled", false);
        setIntField(term57239, term57239.getClass(), "verticalAlignment", 1048451946);
        setIntField(term57239, term57239.getClass(), "horizontalAlignment", 5603560);
        setIntField(term57239, term57239.getClass(), "verticalTextPosition", -1079020032);
        setIntField(term57239, term57239.getClass(), "horizontalTextPosition", -1973791064);
        setIntField(term57239, term57239.getClass(), "iconTextGap", -2072158633);
        setIntField(term57239, term57239.getClass(), "mnemonic", -355469363);
        setIntField(term57239, term57239.getClass(), "mnemonicIndex", 1465188553);
        setLongField(term57239, term57239.getClass(), "multiClickThreshhold", 4178434741742309755L);
        setBooleanField(term57239, term57239.getClass(), "borderPaintedSet", true);
        setBooleanField(term57239, term57239.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term57239, term57239.getClass(), "iconTextGapSet", true);
        setBooleanField(term57239, term57239.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term57239, term57239.getClass(), "setLayout", false);
        setBooleanField(term57239, term57239.getClass(), "defaultCapable", true);
        setField(term57281, term57281.getClass(), "this$0", null);
        setField(term57239, term57239.getClass(), "handler", term57281);
        setField(term57239, term57239.getClass(), "changeListener", null);
        setField(term57239, term57239.getClass(), "actionListener", null);
        setField(term57239, term57239.getClass(), "itemListener", null);
        setField(term57239, term57239.getClass(), "changeEvent", null);
        setBooleanField(term57239, term57239.getClass(), "hideActionText", false);
        setField(term57239, term57239.getClass(), "action", null);
        setField(term57239, term57239.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term57239, term57239.getClass(), "isAlignmentXSet", false);
        setFloatField(term57239, term57239.getClass(), "alignmentX", 0.0F);
        setBooleanField(term57239, term57239.getClass(), "isAlignmentYSet", false);
        setFloatField(term57239, term57239.getClass(), "alignmentY", 0.0F);
        setField(term57239, term57239.getClass(), "ui", null);
        setField(term57239, term57239.getClass(), "listenerList", null);
        setField(term57239, term57239.getClass(), "clientProperties", null);
        setField(term57239, term57239.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term57239, term57239.getClass(), "autoscrolls", false);
        setField(term57239, term57239.getClass(), "border", null);
        setIntField(term57239, term57239.getClass(), "flags", 0);
        setField(term57239, term57239.getClass(), "inputVerifier", null);
        setBooleanField(term57239, term57239.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term57239, term57239.getClass(), "paintingChild", null);
        setField(term57239, term57239.getClass(), "popupMenu", null);
        setField(term57239, term57239.getClass(), "revalidateRunnableScheduled", null);
        setField(term57239, term57239.getClass(), "focusInputMap", null);
        setField(term57239, term57239.getClass(), "ancestorInputMap", null);
        setField(term57239, term57239.getClass(), "windowInputMap", null);
        setField(term57239, term57239.getClass(), "actionMap", null);
        setField(term57239, term57239.getClass(), "aaHint", null);
        setField(term57239, term57239.getClass(), "lcdRenderingHint", null);
        setField(term57239, term57239.getClass(), "component", null);
        setField(term57239, term57239.getClass(), "layoutMgr", null);
        setField(term57239, term57239.getClass(), "dispatcher", null);
        setField(term57239, term57239.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57239, term57239.getClass(), "focusCycleRoot", false);
        setBooleanField(term57239, term57239.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57239, term57239.getClass(), "printingThreads", null);
        setBooleanField(term57239, term57239.getClass(), "printing", false);
        setField(term57239, term57239.getClass(), "containerListener", null);
        setIntField(term57239, term57239.getClass(), "listeningChildren", 0);
        setIntField(term57239, term57239.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57239, term57239.getClass(), "descendantsCount", 0);
        setField(term57239, term57239.getClass(), "preserveBackgroundColor", null);
        setIntField(term57239, term57239.getClass(), "numOfHWComponents", 0);
        setIntField(term57239, term57239.getClass(), "numOfLWComponents", 0);
        setField(term57239, term57239.getClass(), "modalComp", null);
        setField(term57239, term57239.getClass(), "modalAppContext", null);
        setIntField(term57239, term57239.getClass(), "containerSerializedDataVersion", 0);
        setField(term57239, term57239.getClass(), "peer", null);
        setField(term57239, term57239.getClass(), "parent", null);
        setField(term57239, term57239.getClass(), "appContext", null);
        setIntField(term57239, term57239.getClass(), "x", 0);
        setIntField(term57239, term57239.getClass(), "y", 0);
        setIntField(term57239, term57239.getClass(), "width", 0);
        setIntField(term57239, term57239.getClass(), "height", 0);
        setField(term57239, term57239.getClass(), "foreground", null);
        setField(term57239, term57239.getClass(), "background", null);
        setField(term57239, term57239.getClass(), "font", null);
        setField(term57239, term57239.getClass(), "peerFont", null);
        setField(term57239, term57239.getClass(), "cursor", null);
        setField(term57239, term57239.getClass(), "locale", null);
        setField(term57239, term57239.getClass(), "graphicsConfig", null);
        setField(term57239, term57239.getClass(), "bufferStrategy", null);
        setBooleanField(term57239, term57239.getClass(), "ignoreRepaint", false);
        setBooleanField(term57239, term57239.getClass(), "visible", false);
        setBooleanField(term57239, term57239.getClass(), "enabled", false);
        setBooleanField(term57239, term57239.getClass(), "valid", false);
        setField(term57239, term57239.getClass(), "dropTarget", null);
        setField(term57239, term57239.getClass(), "popups", null);
        setField(term57239, term57239.getClass(), "name", null);
        setBooleanField(term57239, term57239.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57239, term57239.getClass(), "focusable", false);
        setIntField(term57239, term57239.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57239, term57239.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57239, term57239.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57239, term57239.getClass(), "acc", null);
        setField(term57239, term57239.getClass(), "minSize", null);
        setBooleanField(term57239, term57239.getClass(), "minSizeSet", false);
        setField(term57239, term57239.getClass(), "prefSize", null);
        setBooleanField(term57239, term57239.getClass(), "prefSizeSet", false);
        setField(term57239, term57239.getClass(), "maxSize", null);
        setBooleanField(term57239, term57239.getClass(), "maxSizeSet", false);
        setField(term57239, term57239.getClass(), "componentOrientation", null);
        setBooleanField(term57239, term57239.getClass(), "newEventsOnly", false);
        setField(term57239, term57239.getClass(), "componentListener", null);
        setField(term57239, term57239.getClass(), "focusListener", null);
        setField(term57239, term57239.getClass(), "hierarchyListener", null);
        setField(term57239, term57239.getClass(), "hierarchyBoundsListener", null);
        setField(term57239, term57239.getClass(), "keyListener", null);
        setField(term57239, term57239.getClass(), "mouseListener", null);
        setField(term57239, term57239.getClass(), "mouseMotionListener", null);
        setField(term57239, term57239.getClass(), "mouseWheelListener", null);
        setField(term57239, term57239.getClass(), "inputMethodListener", null);
        setLongField(term57239, term57239.getClass(), "eventMask", 0L);
        setField(term57239, term57239.getClass(), "changeSupport", null);
        setField(term57239, term57239.getClass(), "objectLock", null);
        setBooleanField(term57239, term57239.getClass(), "isPacked", false);
        setIntField(term57239, term57239.getClass(), "boundsOp", 0);
        setField(term57239, term57239.getClass(), "compoundShape", null);
        setField(term57239, term57239.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57239, term57239.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57239, term57239.getClass(), "backgroundEraseDisabled", false);
        setField(term57239, term57239.getClass(), "eventCache", null);
        setBooleanField(term57239, term57239.getClass(), "coalescingEnabled", false);
        setBooleanField(term57239, term57239.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57239, term57239.getClass(), "componentSerializedDataVersion", 0);
        setField(term57239, term57239.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term57239, args);
    }

};


