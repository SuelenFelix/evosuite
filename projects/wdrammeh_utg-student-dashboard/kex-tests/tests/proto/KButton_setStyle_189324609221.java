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
     Object term27106;

    public KButton_setStyle_189324609221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27106 = newInstance(Class.forName("proto.KButton"));
        setField(term27106, term27106.getClass(), "initialTip", null);
        setField(term27106, term27106.getClass(), "model", null);
        setField(term27106, term27106.getClass(), "text", null);
        setField(term27106, term27106.getClass(), "margin", null);
        setField(term27106, term27106.getClass(), "defaultMargin", null);
        setField(term27106, term27106.getClass(), "defaultIcon", null);
        setField(term27106, term27106.getClass(), "pressedIcon", null);
        setField(term27106, term27106.getClass(), "disabledIcon", null);
        setField(term27106, term27106.getClass(), "selectedIcon", null);
        setField(term27106, term27106.getClass(), "disabledSelectedIcon", null);
        setField(term27106, term27106.getClass(), "rolloverIcon", null);
        setField(term27106, term27106.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27106, term27106.getClass(), "paintBorder", false);
        setBooleanField(term27106, term27106.getClass(), "paintFocus", false);
        setBooleanField(term27106, term27106.getClass(), "rolloverEnabled", false);
        setBooleanField(term27106, term27106.getClass(), "contentAreaFilled", false);
        setIntField(term27106, term27106.getClass(), "verticalAlignment", 0);
        setIntField(term27106, term27106.getClass(), "horizontalAlignment", 0);
        setIntField(term27106, term27106.getClass(), "verticalTextPosition", 0);
        setIntField(term27106, term27106.getClass(), "horizontalTextPosition", 0);
        setIntField(term27106, term27106.getClass(), "iconTextGap", 0);
        setIntField(term27106, term27106.getClass(), "mnemonic", 0);
        setIntField(term27106, term27106.getClass(), "mnemonicIndex", 0);
        setLongField(term27106, term27106.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27106, term27106.getClass(), "borderPaintedSet", false);
        setBooleanField(term27106, term27106.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27106, term27106.getClass(), "iconTextGapSet", false);
        setBooleanField(term27106, term27106.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27106, term27106.getClass(), "setLayout", false);
        setBooleanField(term27106, term27106.getClass(), "defaultCapable", false);
        setField(term27106, term27106.getClass(), "handler", null);
        setField(term27106, term27106.getClass(), "changeListener", null);
        setField(term27106, term27106.getClass(), "actionListener", null);
        setField(term27106, term27106.getClass(), "itemListener", null);
        setField(term27106, term27106.getClass(), "changeEvent", null);
        setBooleanField(term27106, term27106.getClass(), "hideActionText", false);
        setField(term27106, term27106.getClass(), "action", null);
        setField(term27106, term27106.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27106, term27106.getClass(), "isAlignmentXSet", false);
        setFloatField(term27106, term27106.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27106, term27106.getClass(), "isAlignmentYSet", false);
        setFloatField(term27106, term27106.getClass(), "alignmentY", 0.0F);
        setField(term27106, term27106.getClass(), "ui", null);
        setField(term27106, term27106.getClass(), "listenerList", null);
        setField(term27106, term27106.getClass(), "clientProperties", null);
        setField(term27106, term27106.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27106, term27106.getClass(), "autoscrolls", false);
        setField(term27106, term27106.getClass(), "border", null);
        setIntField(term27106, term27106.getClass(), "flags", 0);
        setField(term27106, term27106.getClass(), "inputVerifier", null);
        setBooleanField(term27106, term27106.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27106, term27106.getClass(), "paintingChild", null);
        setField(term27106, term27106.getClass(), "popupMenu", null);
        setField(term27106, term27106.getClass(), "revalidateRunnableScheduled", null);
        setField(term27106, term27106.getClass(), "focusInputMap", null);
        setField(term27106, term27106.getClass(), "ancestorInputMap", null);
        setField(term27106, term27106.getClass(), "windowInputMap", null);
        setField(term27106, term27106.getClass(), "actionMap", null);
        setField(term27106, term27106.getClass(), "aaHint", null);
        setField(term27106, term27106.getClass(), "lcdRenderingHint", null);
        setField(term27106, term27106.getClass(), "component", null);
        setField(term27106, term27106.getClass(), "layoutMgr", null);
        setField(term27106, term27106.getClass(), "dispatcher", null);
        setField(term27106, term27106.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27106, term27106.getClass(), "focusCycleRoot", false);
        setBooleanField(term27106, term27106.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27106, term27106.getClass(), "printingThreads", null);
        setBooleanField(term27106, term27106.getClass(), "printing", false);
        setField(term27106, term27106.getClass(), "containerListener", null);
        setIntField(term27106, term27106.getClass(), "listeningChildren", 0);
        setIntField(term27106, term27106.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27106, term27106.getClass(), "descendantsCount", 0);
        setField(term27106, term27106.getClass(), "preserveBackgroundColor", null);
        setIntField(term27106, term27106.getClass(), "numOfHWComponents", 0);
        setIntField(term27106, term27106.getClass(), "numOfLWComponents", 0);
        setField(term27106, term27106.getClass(), "modalComp", null);
        setField(term27106, term27106.getClass(), "modalAppContext", null);
        setIntField(term27106, term27106.getClass(), "containerSerializedDataVersion", 0);
        setField(term27106, term27106.getClass(), "peer", null);
        setField(term27106, term27106.getClass(), "parent", null);
        setField(term27106, term27106.getClass(), "appContext", null);
        setIntField(term27106, term27106.getClass(), "x", 0);
        setIntField(term27106, term27106.getClass(), "y", 0);
        setIntField(term27106, term27106.getClass(), "width", 0);
        setIntField(term27106, term27106.getClass(), "height", 0);
        setField(term27106, term27106.getClass(), "foreground", null);
        setField(term27106, term27106.getClass(), "background", null);
        setField(term27106, term27106.getClass(), "font", null);
        setField(term27106, term27106.getClass(), "peerFont", null);
        setField(term27106, term27106.getClass(), "cursor", null);
        setField(term27106, term27106.getClass(), "locale", null);
        setField(term27106, term27106.getClass(), "graphicsConfig", null);
        setField(term27106, term27106.getClass(), "bufferStrategy", null);
        setBooleanField(term27106, term27106.getClass(), "ignoreRepaint", false);
        setBooleanField(term27106, term27106.getClass(), "visible", false);
        setBooleanField(term27106, term27106.getClass(), "enabled", false);
        setBooleanField(term27106, term27106.getClass(), "valid", false);
        setField(term27106, term27106.getClass(), "dropTarget", null);
        setField(term27106, term27106.getClass(), "popups", null);
        setField(term27106, term27106.getClass(), "name", null);
        setBooleanField(term27106, term27106.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27106, term27106.getClass(), "focusable", false);
        setIntField(term27106, term27106.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27106, term27106.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27106, term27106.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27106, term27106.getClass(), "acc", null);
        setField(term27106, term27106.getClass(), "minSize", null);
        setBooleanField(term27106, term27106.getClass(), "minSizeSet", false);
        setField(term27106, term27106.getClass(), "prefSize", null);
        setBooleanField(term27106, term27106.getClass(), "prefSizeSet", false);
        setField(term27106, term27106.getClass(), "maxSize", null);
        setBooleanField(term27106, term27106.getClass(), "maxSizeSet", false);
        setField(term27106, term27106.getClass(), "componentOrientation", null);
        setBooleanField(term27106, term27106.getClass(), "newEventsOnly", false);
        setField(term27106, term27106.getClass(), "componentListener", null);
        setField(term27106, term27106.getClass(), "focusListener", null);
        setField(term27106, term27106.getClass(), "hierarchyListener", null);
        setField(term27106, term27106.getClass(), "hierarchyBoundsListener", null);
        setField(term27106, term27106.getClass(), "keyListener", null);
        setField(term27106, term27106.getClass(), "mouseListener", null);
        setField(term27106, term27106.getClass(), "mouseMotionListener", null);
        setField(term27106, term27106.getClass(), "mouseWheelListener", null);
        setField(term27106, term27106.getClass(), "inputMethodListener", null);
        setLongField(term27106, term27106.getClass(), "eventMask", 0L);
        setField(term27106, term27106.getClass(), "changeSupport", null);
        setField(term27106, term27106.getClass(), "objectLock", null);
        setBooleanField(term27106, term27106.getClass(), "isPacked", false);
        setIntField(term27106, term27106.getClass(), "boundsOp", 0);
        setField(term27106, term27106.getClass(), "compoundShape", null);
        setField(term27106, term27106.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27106, term27106.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27106, term27106.getClass(), "backgroundEraseDisabled", false);
        setField(term27106, term27106.getClass(), "eventCache", null);
        setBooleanField(term27106, term27106.getClass(), "coalescingEnabled", false);
        setBooleanField(term27106, term27106.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27106, term27106.getClass(), "componentSerializedDataVersion", 0);
        setField(term27106, term27106.getClass(), "accessibleContext", null);
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
        callMethod(klass, "setStyle", argTypes, term27106, args);
    }

};


