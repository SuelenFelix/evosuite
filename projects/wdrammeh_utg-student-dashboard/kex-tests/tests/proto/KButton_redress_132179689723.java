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

public class KButton_redress_132179689723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27193;

    public KButton_redress_132179689723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27193 = newInstance(Class.forName("proto.KButton"));
        setField(term27193, term27193.getClass(), "initialTip", null);
        setField(term27193, term27193.getClass(), "model", null);
        setField(term27193, term27193.getClass(), "text", null);
        setField(term27193, term27193.getClass(), "margin", null);
        setField(term27193, term27193.getClass(), "defaultMargin", null);
        setField(term27193, term27193.getClass(), "defaultIcon", null);
        setField(term27193, term27193.getClass(), "pressedIcon", null);
        setField(term27193, term27193.getClass(), "disabledIcon", null);
        setField(term27193, term27193.getClass(), "selectedIcon", null);
        setField(term27193, term27193.getClass(), "disabledSelectedIcon", null);
        setField(term27193, term27193.getClass(), "rolloverIcon", null);
        setField(term27193, term27193.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27193, term27193.getClass(), "paintBorder", false);
        setBooleanField(term27193, term27193.getClass(), "paintFocus", false);
        setBooleanField(term27193, term27193.getClass(), "rolloverEnabled", false);
        setBooleanField(term27193, term27193.getClass(), "contentAreaFilled", false);
        setIntField(term27193, term27193.getClass(), "verticalAlignment", 0);
        setIntField(term27193, term27193.getClass(), "horizontalAlignment", 0);
        setIntField(term27193, term27193.getClass(), "verticalTextPosition", 0);
        setIntField(term27193, term27193.getClass(), "horizontalTextPosition", 0);
        setIntField(term27193, term27193.getClass(), "iconTextGap", 0);
        setIntField(term27193, term27193.getClass(), "mnemonic", 0);
        setIntField(term27193, term27193.getClass(), "mnemonicIndex", 0);
        setLongField(term27193, term27193.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27193, term27193.getClass(), "borderPaintedSet", false);
        setBooleanField(term27193, term27193.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27193, term27193.getClass(), "iconTextGapSet", false);
        setBooleanField(term27193, term27193.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27193, term27193.getClass(), "setLayout", false);
        setBooleanField(term27193, term27193.getClass(), "defaultCapable", false);
        setField(term27193, term27193.getClass(), "handler", null);
        setField(term27193, term27193.getClass(), "changeListener", null);
        setField(term27193, term27193.getClass(), "actionListener", null);
        setField(term27193, term27193.getClass(), "itemListener", null);
        setField(term27193, term27193.getClass(), "changeEvent", null);
        setBooleanField(term27193, term27193.getClass(), "hideActionText", false);
        setField(term27193, term27193.getClass(), "action", null);
        setField(term27193, term27193.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27193, term27193.getClass(), "isAlignmentXSet", false);
        setFloatField(term27193, term27193.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27193, term27193.getClass(), "isAlignmentYSet", false);
        setFloatField(term27193, term27193.getClass(), "alignmentY", 0.0F);
        setField(term27193, term27193.getClass(), "ui", null);
        setField(term27193, term27193.getClass(), "listenerList", null);
        setField(term27193, term27193.getClass(), "clientProperties", null);
        setField(term27193, term27193.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27193, term27193.getClass(), "autoscrolls", false);
        setField(term27193, term27193.getClass(), "border", null);
        setIntField(term27193, term27193.getClass(), "flags", 0);
        setField(term27193, term27193.getClass(), "inputVerifier", null);
        setBooleanField(term27193, term27193.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27193, term27193.getClass(), "paintingChild", null);
        setField(term27193, term27193.getClass(), "popupMenu", null);
        setField(term27193, term27193.getClass(), "revalidateRunnableScheduled", null);
        setField(term27193, term27193.getClass(), "focusInputMap", null);
        setField(term27193, term27193.getClass(), "ancestorInputMap", null);
        setField(term27193, term27193.getClass(), "windowInputMap", null);
        setField(term27193, term27193.getClass(), "actionMap", null);
        setField(term27193, term27193.getClass(), "aaHint", null);
        setField(term27193, term27193.getClass(), "lcdRenderingHint", null);
        setField(term27193, term27193.getClass(), "component", null);
        setField(term27193, term27193.getClass(), "layoutMgr", null);
        setField(term27193, term27193.getClass(), "dispatcher", null);
        setField(term27193, term27193.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27193, term27193.getClass(), "focusCycleRoot", false);
        setBooleanField(term27193, term27193.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27193, term27193.getClass(), "printingThreads", null);
        setBooleanField(term27193, term27193.getClass(), "printing", false);
        setField(term27193, term27193.getClass(), "containerListener", null);
        setIntField(term27193, term27193.getClass(), "listeningChildren", 0);
        setIntField(term27193, term27193.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27193, term27193.getClass(), "descendantsCount", 0);
        setField(term27193, term27193.getClass(), "preserveBackgroundColor", null);
        setIntField(term27193, term27193.getClass(), "numOfHWComponents", 0);
        setIntField(term27193, term27193.getClass(), "numOfLWComponents", 0);
        setField(term27193, term27193.getClass(), "modalComp", null);
        setField(term27193, term27193.getClass(), "modalAppContext", null);
        setIntField(term27193, term27193.getClass(), "containerSerializedDataVersion", 0);
        setField(term27193, term27193.getClass(), "peer", null);
        setField(term27193, term27193.getClass(), "parent", null);
        setField(term27193, term27193.getClass(), "appContext", null);
        setIntField(term27193, term27193.getClass(), "x", 0);
        setIntField(term27193, term27193.getClass(), "y", 0);
        setIntField(term27193, term27193.getClass(), "width", 0);
        setIntField(term27193, term27193.getClass(), "height", 0);
        setField(term27193, term27193.getClass(), "foreground", null);
        setField(term27193, term27193.getClass(), "background", null);
        setField(term27193, term27193.getClass(), "font", null);
        setField(term27193, term27193.getClass(), "peerFont", null);
        setField(term27193, term27193.getClass(), "cursor", null);
        setField(term27193, term27193.getClass(), "locale", null);
        setField(term27193, term27193.getClass(), "graphicsConfig", null);
        setField(term27193, term27193.getClass(), "bufferStrategy", null);
        setBooleanField(term27193, term27193.getClass(), "ignoreRepaint", false);
        setBooleanField(term27193, term27193.getClass(), "visible", false);
        setBooleanField(term27193, term27193.getClass(), "enabled", false);
        setBooleanField(term27193, term27193.getClass(), "valid", false);
        setField(term27193, term27193.getClass(), "dropTarget", null);
        setField(term27193, term27193.getClass(), "popups", null);
        setField(term27193, term27193.getClass(), "name", null);
        setBooleanField(term27193, term27193.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27193, term27193.getClass(), "focusable", false);
        setIntField(term27193, term27193.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27193, term27193.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27193, term27193.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27193, term27193.getClass(), "acc", null);
        setField(term27193, term27193.getClass(), "minSize", null);
        setBooleanField(term27193, term27193.getClass(), "minSizeSet", false);
        setField(term27193, term27193.getClass(), "prefSize", null);
        setBooleanField(term27193, term27193.getClass(), "prefSizeSet", false);
        setField(term27193, term27193.getClass(), "maxSize", null);
        setBooleanField(term27193, term27193.getClass(), "maxSizeSet", false);
        setField(term27193, term27193.getClass(), "componentOrientation", null);
        setBooleanField(term27193, term27193.getClass(), "newEventsOnly", false);
        setField(term27193, term27193.getClass(), "componentListener", null);
        setField(term27193, term27193.getClass(), "focusListener", null);
        setField(term27193, term27193.getClass(), "hierarchyListener", null);
        setField(term27193, term27193.getClass(), "hierarchyBoundsListener", null);
        setField(term27193, term27193.getClass(), "keyListener", null);
        setField(term27193, term27193.getClass(), "mouseListener", null);
        setField(term27193, term27193.getClass(), "mouseMotionListener", null);
        setField(term27193, term27193.getClass(), "mouseWheelListener", null);
        setField(term27193, term27193.getClass(), "inputMethodListener", null);
        setLongField(term27193, term27193.getClass(), "eventMask", 0L);
        setField(term27193, term27193.getClass(), "changeSupport", null);
        setField(term27193, term27193.getClass(), "objectLock", null);
        setBooleanField(term27193, term27193.getClass(), "isPacked", false);
        setIntField(term27193, term27193.getClass(), "boundsOp", 0);
        setField(term27193, term27193.getClass(), "compoundShape", null);
        setField(term27193, term27193.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27193, term27193.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27193, term27193.getClass(), "backgroundEraseDisabled", false);
        setField(term27193, term27193.getClass(), "eventCache", null);
        setBooleanField(term27193, term27193.getClass(), "coalescingEnabled", false);
        setBooleanField(term27193, term27193.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27193, term27193.getClass(), "componentSerializedDataVersion", 0);
        setField(term27193, term27193.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "redress", argTypes, term27193, args);
    }

};


