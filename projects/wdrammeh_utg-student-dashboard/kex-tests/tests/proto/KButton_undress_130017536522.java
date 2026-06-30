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

public class KButton_undress_130017536522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27133;

    public KButton_undress_130017536522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27133 = newInstance(Class.forName("proto.KButton"));
        setField(term27133, term27133.getClass(), "initialTip", null);
        setField(term27133, term27133.getClass(), "model", null);
        setField(term27133, term27133.getClass(), "text", null);
        setField(term27133, term27133.getClass(), "margin", null);
        setField(term27133, term27133.getClass(), "defaultMargin", null);
        setField(term27133, term27133.getClass(), "defaultIcon", null);
        setField(term27133, term27133.getClass(), "pressedIcon", null);
        setField(term27133, term27133.getClass(), "disabledIcon", null);
        setField(term27133, term27133.getClass(), "selectedIcon", null);
        setField(term27133, term27133.getClass(), "disabledSelectedIcon", null);
        setField(term27133, term27133.getClass(), "rolloverIcon", null);
        setField(term27133, term27133.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27133, term27133.getClass(), "paintBorder", false);
        setBooleanField(term27133, term27133.getClass(), "paintFocus", false);
        setBooleanField(term27133, term27133.getClass(), "rolloverEnabled", false);
        setBooleanField(term27133, term27133.getClass(), "contentAreaFilled", false);
        setIntField(term27133, term27133.getClass(), "verticalAlignment", 0);
        setIntField(term27133, term27133.getClass(), "horizontalAlignment", 0);
        setIntField(term27133, term27133.getClass(), "verticalTextPosition", 0);
        setIntField(term27133, term27133.getClass(), "horizontalTextPosition", 0);
        setIntField(term27133, term27133.getClass(), "iconTextGap", 0);
        setIntField(term27133, term27133.getClass(), "mnemonic", 0);
        setIntField(term27133, term27133.getClass(), "mnemonicIndex", 0);
        setLongField(term27133, term27133.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27133, term27133.getClass(), "borderPaintedSet", false);
        setBooleanField(term27133, term27133.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27133, term27133.getClass(), "iconTextGapSet", false);
        setBooleanField(term27133, term27133.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27133, term27133.getClass(), "setLayout", false);
        setBooleanField(term27133, term27133.getClass(), "defaultCapable", false);
        setField(term27133, term27133.getClass(), "handler", null);
        setField(term27133, term27133.getClass(), "changeListener", null);
        setField(term27133, term27133.getClass(), "actionListener", null);
        setField(term27133, term27133.getClass(), "itemListener", null);
        setField(term27133, term27133.getClass(), "changeEvent", null);
        setBooleanField(term27133, term27133.getClass(), "hideActionText", false);
        setField(term27133, term27133.getClass(), "action", null);
        setField(term27133, term27133.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27133, term27133.getClass(), "isAlignmentXSet", false);
        setFloatField(term27133, term27133.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27133, term27133.getClass(), "isAlignmentYSet", false);
        setFloatField(term27133, term27133.getClass(), "alignmentY", 0.0F);
        setField(term27133, term27133.getClass(), "ui", null);
        setField(term27133, term27133.getClass(), "listenerList", null);
        setField(term27133, term27133.getClass(), "clientProperties", null);
        setField(term27133, term27133.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27133, term27133.getClass(), "autoscrolls", false);
        setField(term27133, term27133.getClass(), "border", null);
        setIntField(term27133, term27133.getClass(), "flags", 0);
        setField(term27133, term27133.getClass(), "inputVerifier", null);
        setBooleanField(term27133, term27133.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27133, term27133.getClass(), "paintingChild", null);
        setField(term27133, term27133.getClass(), "popupMenu", null);
        setField(term27133, term27133.getClass(), "revalidateRunnableScheduled", null);
        setField(term27133, term27133.getClass(), "focusInputMap", null);
        setField(term27133, term27133.getClass(), "ancestorInputMap", null);
        setField(term27133, term27133.getClass(), "windowInputMap", null);
        setField(term27133, term27133.getClass(), "actionMap", null);
        setField(term27133, term27133.getClass(), "aaHint", null);
        setField(term27133, term27133.getClass(), "lcdRenderingHint", null);
        setField(term27133, term27133.getClass(), "component", null);
        setField(term27133, term27133.getClass(), "layoutMgr", null);
        setField(term27133, term27133.getClass(), "dispatcher", null);
        setField(term27133, term27133.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27133, term27133.getClass(), "focusCycleRoot", false);
        setBooleanField(term27133, term27133.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27133, term27133.getClass(), "printingThreads", null);
        setBooleanField(term27133, term27133.getClass(), "printing", false);
        setField(term27133, term27133.getClass(), "containerListener", null);
        setIntField(term27133, term27133.getClass(), "listeningChildren", 0);
        setIntField(term27133, term27133.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27133, term27133.getClass(), "descendantsCount", 0);
        setField(term27133, term27133.getClass(), "preserveBackgroundColor", null);
        setIntField(term27133, term27133.getClass(), "numOfHWComponents", 0);
        setIntField(term27133, term27133.getClass(), "numOfLWComponents", 0);
        setField(term27133, term27133.getClass(), "modalComp", null);
        setField(term27133, term27133.getClass(), "modalAppContext", null);
        setIntField(term27133, term27133.getClass(), "containerSerializedDataVersion", 0);
        setField(term27133, term27133.getClass(), "peer", null);
        setField(term27133, term27133.getClass(), "parent", null);
        setField(term27133, term27133.getClass(), "appContext", null);
        setIntField(term27133, term27133.getClass(), "x", 0);
        setIntField(term27133, term27133.getClass(), "y", 0);
        setIntField(term27133, term27133.getClass(), "width", 0);
        setIntField(term27133, term27133.getClass(), "height", 0);
        setField(term27133, term27133.getClass(), "foreground", null);
        setField(term27133, term27133.getClass(), "background", null);
        setField(term27133, term27133.getClass(), "font", null);
        setField(term27133, term27133.getClass(), "peerFont", null);
        setField(term27133, term27133.getClass(), "cursor", null);
        setField(term27133, term27133.getClass(), "locale", null);
        setField(term27133, term27133.getClass(), "graphicsConfig", null);
        setField(term27133, term27133.getClass(), "bufferStrategy", null);
        setBooleanField(term27133, term27133.getClass(), "ignoreRepaint", false);
        setBooleanField(term27133, term27133.getClass(), "visible", false);
        setBooleanField(term27133, term27133.getClass(), "enabled", false);
        setBooleanField(term27133, term27133.getClass(), "valid", false);
        setField(term27133, term27133.getClass(), "dropTarget", null);
        setField(term27133, term27133.getClass(), "popups", null);
        setField(term27133, term27133.getClass(), "name", null);
        setBooleanField(term27133, term27133.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27133, term27133.getClass(), "focusable", false);
        setIntField(term27133, term27133.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27133, term27133.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27133, term27133.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27133, term27133.getClass(), "acc", null);
        setField(term27133, term27133.getClass(), "minSize", null);
        setBooleanField(term27133, term27133.getClass(), "minSizeSet", false);
        setField(term27133, term27133.getClass(), "prefSize", null);
        setBooleanField(term27133, term27133.getClass(), "prefSizeSet", false);
        setField(term27133, term27133.getClass(), "maxSize", null);
        setBooleanField(term27133, term27133.getClass(), "maxSizeSet", false);
        setField(term27133, term27133.getClass(), "componentOrientation", null);
        setBooleanField(term27133, term27133.getClass(), "newEventsOnly", false);
        setField(term27133, term27133.getClass(), "componentListener", null);
        setField(term27133, term27133.getClass(), "focusListener", null);
        setField(term27133, term27133.getClass(), "hierarchyListener", null);
        setField(term27133, term27133.getClass(), "hierarchyBoundsListener", null);
        setField(term27133, term27133.getClass(), "keyListener", null);
        setField(term27133, term27133.getClass(), "mouseListener", null);
        setField(term27133, term27133.getClass(), "mouseMotionListener", null);
        setField(term27133, term27133.getClass(), "mouseWheelListener", null);
        setField(term27133, term27133.getClass(), "inputMethodListener", null);
        setLongField(term27133, term27133.getClass(), "eventMask", 0L);
        setField(term27133, term27133.getClass(), "changeSupport", null);
        setField(term27133, term27133.getClass(), "objectLock", null);
        setBooleanField(term27133, term27133.getClass(), "isPacked", false);
        setIntField(term27133, term27133.getClass(), "boundsOp", 0);
        setField(term27133, term27133.getClass(), "compoundShape", null);
        setField(term27133, term27133.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27133, term27133.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27133, term27133.getClass(), "backgroundEraseDisabled", false);
        setField(term27133, term27133.getClass(), "eventCache", null);
        setBooleanField(term27133, term27133.getClass(), "coalescingEnabled", false);
        setBooleanField(term27133, term27133.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27133, term27133.getClass(), "componentSerializedDataVersion", 0);
        setField(term27133, term27133.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "undress", argTypes, term27133, args);
    }

};


