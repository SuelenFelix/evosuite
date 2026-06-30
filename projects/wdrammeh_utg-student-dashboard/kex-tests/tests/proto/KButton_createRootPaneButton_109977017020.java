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

public class KButton_createRootPaneButton_109977017020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27011;
     Object term27071;

    public KButton_createRootPaneButton_109977017020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27011 = newInstance(Class.forName("proto.KButton"));
        setField(term27011, term27011.getClass(), "initialTip", null);
        setField(term27011, term27011.getClass(), "model", null);
        setField(term27011, term27011.getClass(), "text", null);
        setField(term27011, term27011.getClass(), "margin", null);
        setField(term27011, term27011.getClass(), "defaultMargin", null);
        setField(term27011, term27011.getClass(), "defaultIcon", null);
        setField(term27011, term27011.getClass(), "pressedIcon", null);
        setField(term27011, term27011.getClass(), "disabledIcon", null);
        setField(term27011, term27011.getClass(), "selectedIcon", null);
        setField(term27011, term27011.getClass(), "disabledSelectedIcon", null);
        setField(term27011, term27011.getClass(), "rolloverIcon", null);
        setField(term27011, term27011.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27011, term27011.getClass(), "paintBorder", false);
        setBooleanField(term27011, term27011.getClass(), "paintFocus", false);
        setBooleanField(term27011, term27011.getClass(), "rolloverEnabled", false);
        setBooleanField(term27011, term27011.getClass(), "contentAreaFilled", false);
        setIntField(term27011, term27011.getClass(), "verticalAlignment", 0);
        setIntField(term27011, term27011.getClass(), "horizontalAlignment", 0);
        setIntField(term27011, term27011.getClass(), "verticalTextPosition", 0);
        setIntField(term27011, term27011.getClass(), "horizontalTextPosition", 0);
        setIntField(term27011, term27011.getClass(), "iconTextGap", 0);
        setIntField(term27011, term27011.getClass(), "mnemonic", 0);
        setIntField(term27011, term27011.getClass(), "mnemonicIndex", 0);
        setLongField(term27011, term27011.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27011, term27011.getClass(), "borderPaintedSet", false);
        setBooleanField(term27011, term27011.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27011, term27011.getClass(), "iconTextGapSet", false);
        setBooleanField(term27011, term27011.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27011, term27011.getClass(), "setLayout", false);
        setBooleanField(term27011, term27011.getClass(), "defaultCapable", false);
        setField(term27011, term27011.getClass(), "handler", null);
        setField(term27011, term27011.getClass(), "changeListener", null);
        setField(term27011, term27011.getClass(), "actionListener", null);
        setField(term27011, term27011.getClass(), "itemListener", null);
        setField(term27011, term27011.getClass(), "changeEvent", null);
        setBooleanField(term27011, term27011.getClass(), "hideActionText", false);
        setField(term27011, term27011.getClass(), "action", null);
        setField(term27011, term27011.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27011, term27011.getClass(), "isAlignmentXSet", false);
        setFloatField(term27011, term27011.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27011, term27011.getClass(), "isAlignmentYSet", false);
        setFloatField(term27011, term27011.getClass(), "alignmentY", 0.0F);
        setField(term27011, term27011.getClass(), "ui", null);
        setField(term27011, term27011.getClass(), "listenerList", null);
        setField(term27011, term27011.getClass(), "clientProperties", null);
        setField(term27011, term27011.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27011, term27011.getClass(), "autoscrolls", false);
        setField(term27011, term27011.getClass(), "border", null);
        setIntField(term27011, term27011.getClass(), "flags", 0);
        setField(term27011, term27011.getClass(), "inputVerifier", null);
        setBooleanField(term27011, term27011.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27011, term27011.getClass(), "paintingChild", null);
        setField(term27011, term27011.getClass(), "popupMenu", null);
        setField(term27011, term27011.getClass(), "revalidateRunnableScheduled", null);
        setField(term27011, term27011.getClass(), "focusInputMap", null);
        setField(term27011, term27011.getClass(), "ancestorInputMap", null);
        setField(term27011, term27011.getClass(), "windowInputMap", null);
        setField(term27011, term27011.getClass(), "actionMap", null);
        setField(term27011, term27011.getClass(), "aaHint", null);
        setField(term27011, term27011.getClass(), "lcdRenderingHint", null);
        setField(term27011, term27011.getClass(), "component", null);
        setField(term27011, term27011.getClass(), "layoutMgr", null);
        setField(term27011, term27011.getClass(), "dispatcher", null);
        setField(term27011, term27011.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27011, term27011.getClass(), "focusCycleRoot", false);
        setBooleanField(term27011, term27011.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27011, term27011.getClass(), "printingThreads", null);
        setBooleanField(term27011, term27011.getClass(), "printing", false);
        setField(term27011, term27011.getClass(), "containerListener", null);
        setIntField(term27011, term27011.getClass(), "listeningChildren", 0);
        setIntField(term27011, term27011.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27011, term27011.getClass(), "descendantsCount", 0);
        setField(term27011, term27011.getClass(), "preserveBackgroundColor", null);
        setIntField(term27011, term27011.getClass(), "numOfHWComponents", 0);
        setIntField(term27011, term27011.getClass(), "numOfLWComponents", 0);
        setField(term27011, term27011.getClass(), "modalComp", null);
        setField(term27011, term27011.getClass(), "modalAppContext", null);
        setIntField(term27011, term27011.getClass(), "containerSerializedDataVersion", 0);
        setField(term27011, term27011.getClass(), "peer", null);
        setField(term27011, term27011.getClass(), "parent", null);
        setField(term27011, term27011.getClass(), "appContext", null);
        setIntField(term27011, term27011.getClass(), "x", 0);
        setIntField(term27011, term27011.getClass(), "y", 0);
        setIntField(term27011, term27011.getClass(), "width", 0);
        setIntField(term27011, term27011.getClass(), "height", 0);
        setField(term27011, term27011.getClass(), "foreground", null);
        setField(term27011, term27011.getClass(), "background", null);
        setField(term27011, term27011.getClass(), "font", null);
        setField(term27011, term27011.getClass(), "peerFont", null);
        setField(term27011, term27011.getClass(), "cursor", null);
        setField(term27011, term27011.getClass(), "locale", null);
        setField(term27011, term27011.getClass(), "graphicsConfig", null);
        setField(term27011, term27011.getClass(), "bufferStrategy", null);
        setBooleanField(term27011, term27011.getClass(), "ignoreRepaint", false);
        setBooleanField(term27011, term27011.getClass(), "visible", false);
        setBooleanField(term27011, term27011.getClass(), "enabled", false);
        setBooleanField(term27011, term27011.getClass(), "valid", false);
        setField(term27011, term27011.getClass(), "dropTarget", null);
        setField(term27011, term27011.getClass(), "popups", null);
        setField(term27011, term27011.getClass(), "name", null);
        setBooleanField(term27011, term27011.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27011, term27011.getClass(), "focusable", false);
        setIntField(term27011, term27011.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27011, term27011.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27011, term27011.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27011, term27011.getClass(), "acc", null);
        setField(term27011, term27011.getClass(), "minSize", null);
        setBooleanField(term27011, term27011.getClass(), "minSizeSet", false);
        setField(term27011, term27011.getClass(), "prefSize", null);
        setBooleanField(term27011, term27011.getClass(), "prefSizeSet", false);
        setField(term27011, term27011.getClass(), "maxSize", null);
        setBooleanField(term27011, term27011.getClass(), "maxSizeSet", false);
        setField(term27011, term27011.getClass(), "componentOrientation", null);
        setBooleanField(term27011, term27011.getClass(), "newEventsOnly", false);
        setField(term27011, term27011.getClass(), "componentListener", null);
        setField(term27011, term27011.getClass(), "focusListener", null);
        setField(term27011, term27011.getClass(), "hierarchyListener", null);
        setField(term27011, term27011.getClass(), "hierarchyBoundsListener", null);
        setField(term27011, term27011.getClass(), "keyListener", null);
        setField(term27011, term27011.getClass(), "mouseListener", null);
        setField(term27011, term27011.getClass(), "mouseMotionListener", null);
        setField(term27011, term27011.getClass(), "mouseWheelListener", null);
        setField(term27011, term27011.getClass(), "inputMethodListener", null);
        setLongField(term27011, term27011.getClass(), "eventMask", 0L);
        setField(term27011, term27011.getClass(), "changeSupport", null);
        setField(term27011, term27011.getClass(), "objectLock", null);
        setBooleanField(term27011, term27011.getClass(), "isPacked", false);
        setIntField(term27011, term27011.getClass(), "boundsOp", 0);
        setField(term27011, term27011.getClass(), "compoundShape", null);
        setField(term27011, term27011.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27011, term27011.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27011, term27011.getClass(), "backgroundEraseDisabled", false);
        setField(term27011, term27011.getClass(), "eventCache", null);
        setBooleanField(term27011, term27011.getClass(), "coalescingEnabled", false);
        setBooleanField(term27011, term27011.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27011, term27011.getClass(), "componentSerializedDataVersion", 0);
        setField(term27011, term27011.getClass(), "accessibleContext", null);
        term27071 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[2];
        args[0] = term27071;
        args[1] = null;
        callMethod(klass, "createRootPaneButton", argTypes, term27011, args);
    }

};


