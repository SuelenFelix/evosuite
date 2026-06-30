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

public class KButton_createToolTip_95222606128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27499;

    public KButton_createToolTip_95222606128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27499 = newInstance(Class.forName("proto.KButton"));
        setField(term27499, term27499.getClass(), "initialTip", null);
        setField(term27499, term27499.getClass(), "model", null);
        setField(term27499, term27499.getClass(), "text", null);
        setField(term27499, term27499.getClass(), "margin", null);
        setField(term27499, term27499.getClass(), "defaultMargin", null);
        setField(term27499, term27499.getClass(), "defaultIcon", null);
        setField(term27499, term27499.getClass(), "pressedIcon", null);
        setField(term27499, term27499.getClass(), "disabledIcon", null);
        setField(term27499, term27499.getClass(), "selectedIcon", null);
        setField(term27499, term27499.getClass(), "disabledSelectedIcon", null);
        setField(term27499, term27499.getClass(), "rolloverIcon", null);
        setField(term27499, term27499.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27499, term27499.getClass(), "paintBorder", false);
        setBooleanField(term27499, term27499.getClass(), "paintFocus", false);
        setBooleanField(term27499, term27499.getClass(), "rolloverEnabled", false);
        setBooleanField(term27499, term27499.getClass(), "contentAreaFilled", false);
        setIntField(term27499, term27499.getClass(), "verticalAlignment", 0);
        setIntField(term27499, term27499.getClass(), "horizontalAlignment", 0);
        setIntField(term27499, term27499.getClass(), "verticalTextPosition", 0);
        setIntField(term27499, term27499.getClass(), "horizontalTextPosition", 0);
        setIntField(term27499, term27499.getClass(), "iconTextGap", 0);
        setIntField(term27499, term27499.getClass(), "mnemonic", 0);
        setIntField(term27499, term27499.getClass(), "mnemonicIndex", 0);
        setLongField(term27499, term27499.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27499, term27499.getClass(), "borderPaintedSet", false);
        setBooleanField(term27499, term27499.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27499, term27499.getClass(), "iconTextGapSet", false);
        setBooleanField(term27499, term27499.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27499, term27499.getClass(), "setLayout", false);
        setBooleanField(term27499, term27499.getClass(), "defaultCapable", false);
        setField(term27499, term27499.getClass(), "handler", null);
        setField(term27499, term27499.getClass(), "changeListener", null);
        setField(term27499, term27499.getClass(), "actionListener", null);
        setField(term27499, term27499.getClass(), "itemListener", null);
        setField(term27499, term27499.getClass(), "changeEvent", null);
        setBooleanField(term27499, term27499.getClass(), "hideActionText", false);
        setField(term27499, term27499.getClass(), "action", null);
        setField(term27499, term27499.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27499, term27499.getClass(), "isAlignmentXSet", false);
        setFloatField(term27499, term27499.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27499, term27499.getClass(), "isAlignmentYSet", false);
        setFloatField(term27499, term27499.getClass(), "alignmentY", 0.0F);
        setField(term27499, term27499.getClass(), "ui", null);
        setField(term27499, term27499.getClass(), "listenerList", null);
        setField(term27499, term27499.getClass(), "clientProperties", null);
        setField(term27499, term27499.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27499, term27499.getClass(), "autoscrolls", false);
        setField(term27499, term27499.getClass(), "border", null);
        setIntField(term27499, term27499.getClass(), "flags", 0);
        setField(term27499, term27499.getClass(), "inputVerifier", null);
        setBooleanField(term27499, term27499.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27499, term27499.getClass(), "paintingChild", null);
        setField(term27499, term27499.getClass(), "popupMenu", null);
        setField(term27499, term27499.getClass(), "revalidateRunnableScheduled", null);
        setField(term27499, term27499.getClass(), "focusInputMap", null);
        setField(term27499, term27499.getClass(), "ancestorInputMap", null);
        setField(term27499, term27499.getClass(), "windowInputMap", null);
        setField(term27499, term27499.getClass(), "actionMap", null);
        setField(term27499, term27499.getClass(), "aaHint", null);
        setField(term27499, term27499.getClass(), "lcdRenderingHint", null);
        setField(term27499, term27499.getClass(), "component", null);
        setField(term27499, term27499.getClass(), "layoutMgr", null);
        setField(term27499, term27499.getClass(), "dispatcher", null);
        setField(term27499, term27499.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27499, term27499.getClass(), "focusCycleRoot", false);
        setBooleanField(term27499, term27499.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27499, term27499.getClass(), "printingThreads", null);
        setBooleanField(term27499, term27499.getClass(), "printing", false);
        setField(term27499, term27499.getClass(), "containerListener", null);
        setIntField(term27499, term27499.getClass(), "listeningChildren", 0);
        setIntField(term27499, term27499.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27499, term27499.getClass(), "descendantsCount", 0);
        setField(term27499, term27499.getClass(), "preserveBackgroundColor", null);
        setIntField(term27499, term27499.getClass(), "numOfHWComponents", 0);
        setIntField(term27499, term27499.getClass(), "numOfLWComponents", 0);
        setField(term27499, term27499.getClass(), "modalComp", null);
        setField(term27499, term27499.getClass(), "modalAppContext", null);
        setIntField(term27499, term27499.getClass(), "containerSerializedDataVersion", 0);
        setField(term27499, term27499.getClass(), "peer", null);
        setField(term27499, term27499.getClass(), "parent", null);
        setField(term27499, term27499.getClass(), "appContext", null);
        setIntField(term27499, term27499.getClass(), "x", 0);
        setIntField(term27499, term27499.getClass(), "y", 0);
        setIntField(term27499, term27499.getClass(), "width", 0);
        setIntField(term27499, term27499.getClass(), "height", 0);
        setField(term27499, term27499.getClass(), "foreground", null);
        setField(term27499, term27499.getClass(), "background", null);
        setField(term27499, term27499.getClass(), "font", null);
        setField(term27499, term27499.getClass(), "peerFont", null);
        setField(term27499, term27499.getClass(), "cursor", null);
        setField(term27499, term27499.getClass(), "locale", null);
        setField(term27499, term27499.getClass(), "graphicsConfig", null);
        setField(term27499, term27499.getClass(), "bufferStrategy", null);
        setBooleanField(term27499, term27499.getClass(), "ignoreRepaint", false);
        setBooleanField(term27499, term27499.getClass(), "visible", false);
        setBooleanField(term27499, term27499.getClass(), "enabled", false);
        setBooleanField(term27499, term27499.getClass(), "valid", false);
        setField(term27499, term27499.getClass(), "dropTarget", null);
        setField(term27499, term27499.getClass(), "popups", null);
        setField(term27499, term27499.getClass(), "name", null);
        setBooleanField(term27499, term27499.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27499, term27499.getClass(), "focusable", false);
        setIntField(term27499, term27499.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27499, term27499.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27499, term27499.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27499, term27499.getClass(), "acc", null);
        setField(term27499, term27499.getClass(), "minSize", null);
        setBooleanField(term27499, term27499.getClass(), "minSizeSet", false);
        setField(term27499, term27499.getClass(), "prefSize", null);
        setBooleanField(term27499, term27499.getClass(), "prefSizeSet", false);
        setField(term27499, term27499.getClass(), "maxSize", null);
        setBooleanField(term27499, term27499.getClass(), "maxSizeSet", false);
        setField(term27499, term27499.getClass(), "componentOrientation", null);
        setBooleanField(term27499, term27499.getClass(), "newEventsOnly", false);
        setField(term27499, term27499.getClass(), "componentListener", null);
        setField(term27499, term27499.getClass(), "focusListener", null);
        setField(term27499, term27499.getClass(), "hierarchyListener", null);
        setField(term27499, term27499.getClass(), "hierarchyBoundsListener", null);
        setField(term27499, term27499.getClass(), "keyListener", null);
        setField(term27499, term27499.getClass(), "mouseListener", null);
        setField(term27499, term27499.getClass(), "mouseMotionListener", null);
        setField(term27499, term27499.getClass(), "mouseWheelListener", null);
        setField(term27499, term27499.getClass(), "inputMethodListener", null);
        setLongField(term27499, term27499.getClass(), "eventMask", 0L);
        setField(term27499, term27499.getClass(), "changeSupport", null);
        setField(term27499, term27499.getClass(), "objectLock", null);
        setBooleanField(term27499, term27499.getClass(), "isPacked", false);
        setIntField(term27499, term27499.getClass(), "boundsOp", 0);
        setField(term27499, term27499.getClass(), "compoundShape", null);
        setField(term27499, term27499.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27499, term27499.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27499, term27499.getClass(), "backgroundEraseDisabled", false);
        setField(term27499, term27499.getClass(), "eventCache", null);
        setBooleanField(term27499, term27499.getClass(), "coalescingEnabled", false);
        setBooleanField(term27499, term27499.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27499, term27499.getClass(), "componentSerializedDataVersion", 0);
        setField(term27499, term27499.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term27499, args);
    }

};


