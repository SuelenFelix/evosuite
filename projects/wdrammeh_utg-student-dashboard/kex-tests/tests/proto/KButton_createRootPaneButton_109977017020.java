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
     Object term27044;
     Object term27104;

    public KButton_createRootPaneButton_109977017020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27044 = newInstance(Class.forName("proto.KButton"));
        setField(term27044, term27044.getClass(), "initialTip", null);
        setField(term27044, term27044.getClass(), "model", null);
        setField(term27044, term27044.getClass(), "text", null);
        setField(term27044, term27044.getClass(), "margin", null);
        setField(term27044, term27044.getClass(), "defaultMargin", null);
        setField(term27044, term27044.getClass(), "defaultIcon", null);
        setField(term27044, term27044.getClass(), "pressedIcon", null);
        setField(term27044, term27044.getClass(), "disabledIcon", null);
        setField(term27044, term27044.getClass(), "selectedIcon", null);
        setField(term27044, term27044.getClass(), "disabledSelectedIcon", null);
        setField(term27044, term27044.getClass(), "rolloverIcon", null);
        setField(term27044, term27044.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27044, term27044.getClass(), "paintBorder", false);
        setBooleanField(term27044, term27044.getClass(), "paintFocus", false);
        setBooleanField(term27044, term27044.getClass(), "rolloverEnabled", false);
        setBooleanField(term27044, term27044.getClass(), "contentAreaFilled", false);
        setIntField(term27044, term27044.getClass(), "verticalAlignment", 0);
        setIntField(term27044, term27044.getClass(), "horizontalAlignment", 0);
        setIntField(term27044, term27044.getClass(), "verticalTextPosition", 0);
        setIntField(term27044, term27044.getClass(), "horizontalTextPosition", 0);
        setIntField(term27044, term27044.getClass(), "iconTextGap", 0);
        setIntField(term27044, term27044.getClass(), "mnemonic", 0);
        setIntField(term27044, term27044.getClass(), "mnemonicIndex", 0);
        setLongField(term27044, term27044.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27044, term27044.getClass(), "borderPaintedSet", false);
        setBooleanField(term27044, term27044.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27044, term27044.getClass(), "iconTextGapSet", false);
        setBooleanField(term27044, term27044.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27044, term27044.getClass(), "setLayout", false);
        setBooleanField(term27044, term27044.getClass(), "defaultCapable", false);
        setField(term27044, term27044.getClass(), "handler", null);
        setField(term27044, term27044.getClass(), "changeListener", null);
        setField(term27044, term27044.getClass(), "actionListener", null);
        setField(term27044, term27044.getClass(), "itemListener", null);
        setField(term27044, term27044.getClass(), "changeEvent", null);
        setBooleanField(term27044, term27044.getClass(), "hideActionText", false);
        setField(term27044, term27044.getClass(), "action", null);
        setField(term27044, term27044.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27044, term27044.getClass(), "isAlignmentXSet", false);
        setFloatField(term27044, term27044.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27044, term27044.getClass(), "isAlignmentYSet", false);
        setFloatField(term27044, term27044.getClass(), "alignmentY", 0.0F);
        setField(term27044, term27044.getClass(), "ui", null);
        setField(term27044, term27044.getClass(), "listenerList", null);
        setField(term27044, term27044.getClass(), "clientProperties", null);
        setField(term27044, term27044.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27044, term27044.getClass(), "autoscrolls", false);
        setField(term27044, term27044.getClass(), "border", null);
        setIntField(term27044, term27044.getClass(), "flags", 0);
        setField(term27044, term27044.getClass(), "inputVerifier", null);
        setBooleanField(term27044, term27044.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27044, term27044.getClass(), "paintingChild", null);
        setField(term27044, term27044.getClass(), "popupMenu", null);
        setField(term27044, term27044.getClass(), "revalidateRunnableScheduled", null);
        setField(term27044, term27044.getClass(), "focusInputMap", null);
        setField(term27044, term27044.getClass(), "ancestorInputMap", null);
        setField(term27044, term27044.getClass(), "windowInputMap", null);
        setField(term27044, term27044.getClass(), "actionMap", null);
        setField(term27044, term27044.getClass(), "aaHint", null);
        setField(term27044, term27044.getClass(), "lcdRenderingHint", null);
        setField(term27044, term27044.getClass(), "component", null);
        setField(term27044, term27044.getClass(), "layoutMgr", null);
        setField(term27044, term27044.getClass(), "dispatcher", null);
        setField(term27044, term27044.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27044, term27044.getClass(), "focusCycleRoot", false);
        setBooleanField(term27044, term27044.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27044, term27044.getClass(), "printingThreads", null);
        setBooleanField(term27044, term27044.getClass(), "printing", false);
        setField(term27044, term27044.getClass(), "containerListener", null);
        setIntField(term27044, term27044.getClass(), "listeningChildren", 0);
        setIntField(term27044, term27044.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27044, term27044.getClass(), "descendantsCount", 0);
        setField(term27044, term27044.getClass(), "preserveBackgroundColor", null);
        setIntField(term27044, term27044.getClass(), "numOfHWComponents", 0);
        setIntField(term27044, term27044.getClass(), "numOfLWComponents", 0);
        setField(term27044, term27044.getClass(), "modalComp", null);
        setField(term27044, term27044.getClass(), "modalAppContext", null);
        setIntField(term27044, term27044.getClass(), "containerSerializedDataVersion", 0);
        setField(term27044, term27044.getClass(), "peer", null);
        setField(term27044, term27044.getClass(), "parent", null);
        setField(term27044, term27044.getClass(), "appContext", null);
        setIntField(term27044, term27044.getClass(), "x", 0);
        setIntField(term27044, term27044.getClass(), "y", 0);
        setIntField(term27044, term27044.getClass(), "width", 0);
        setIntField(term27044, term27044.getClass(), "height", 0);
        setField(term27044, term27044.getClass(), "foreground", null);
        setField(term27044, term27044.getClass(), "background", null);
        setField(term27044, term27044.getClass(), "font", null);
        setField(term27044, term27044.getClass(), "peerFont", null);
        setField(term27044, term27044.getClass(), "cursor", null);
        setField(term27044, term27044.getClass(), "locale", null);
        setField(term27044, term27044.getClass(), "graphicsConfig", null);
        setField(term27044, term27044.getClass(), "bufferStrategy", null);
        setBooleanField(term27044, term27044.getClass(), "ignoreRepaint", false);
        setBooleanField(term27044, term27044.getClass(), "visible", false);
        setBooleanField(term27044, term27044.getClass(), "enabled", false);
        setBooleanField(term27044, term27044.getClass(), "valid", false);
        setField(term27044, term27044.getClass(), "dropTarget", null);
        setField(term27044, term27044.getClass(), "popups", null);
        setField(term27044, term27044.getClass(), "name", null);
        setBooleanField(term27044, term27044.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27044, term27044.getClass(), "focusable", false);
        setIntField(term27044, term27044.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27044, term27044.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27044, term27044.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27044, term27044.getClass(), "acc", null);
        setField(term27044, term27044.getClass(), "minSize", null);
        setBooleanField(term27044, term27044.getClass(), "minSizeSet", false);
        setField(term27044, term27044.getClass(), "prefSize", null);
        setBooleanField(term27044, term27044.getClass(), "prefSizeSet", false);
        setField(term27044, term27044.getClass(), "maxSize", null);
        setBooleanField(term27044, term27044.getClass(), "maxSizeSet", false);
        setField(term27044, term27044.getClass(), "componentOrientation", null);
        setBooleanField(term27044, term27044.getClass(), "newEventsOnly", false);
        setField(term27044, term27044.getClass(), "componentListener", null);
        setField(term27044, term27044.getClass(), "focusListener", null);
        setField(term27044, term27044.getClass(), "hierarchyListener", null);
        setField(term27044, term27044.getClass(), "hierarchyBoundsListener", null);
        setField(term27044, term27044.getClass(), "keyListener", null);
        setField(term27044, term27044.getClass(), "mouseListener", null);
        setField(term27044, term27044.getClass(), "mouseMotionListener", null);
        setField(term27044, term27044.getClass(), "mouseWheelListener", null);
        setField(term27044, term27044.getClass(), "inputMethodListener", null);
        setLongField(term27044, term27044.getClass(), "eventMask", 0L);
        setField(term27044, term27044.getClass(), "changeSupport", null);
        setField(term27044, term27044.getClass(), "objectLock", null);
        setBooleanField(term27044, term27044.getClass(), "isPacked", false);
        setIntField(term27044, term27044.getClass(), "boundsOp", 0);
        setField(term27044, term27044.getClass(), "compoundShape", null);
        setField(term27044, term27044.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27044, term27044.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27044, term27044.getClass(), "backgroundEraseDisabled", false);
        setField(term27044, term27044.getClass(), "eventCache", null);
        setBooleanField(term27044, term27044.getClass(), "coalescingEnabled", false);
        setBooleanField(term27044, term27044.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27044, term27044.getClass(), "componentSerializedDataVersion", 0);
        setField(term27044, term27044.getClass(), "accessibleContext", null);
        term27104 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[2];
        args[0] = term27104;
        args[1] = null;
        callMethod(klass, "createRootPaneButton", argTypes, term27044, args);
    }

};


