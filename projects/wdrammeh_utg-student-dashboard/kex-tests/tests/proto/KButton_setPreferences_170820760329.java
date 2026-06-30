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

public class KButton_setPreferences_170820760329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27559;

    public KButton_setPreferences_170820760329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27559 = newInstance(Class.forName("proto.KButton"));
        setField(term27559, term27559.getClass(), "initialTip", null);
        setField(term27559, term27559.getClass(), "model", null);
        setField(term27559, term27559.getClass(), "text", null);
        setField(term27559, term27559.getClass(), "margin", null);
        setField(term27559, term27559.getClass(), "defaultMargin", null);
        setField(term27559, term27559.getClass(), "defaultIcon", null);
        setField(term27559, term27559.getClass(), "pressedIcon", null);
        setField(term27559, term27559.getClass(), "disabledIcon", null);
        setField(term27559, term27559.getClass(), "selectedIcon", null);
        setField(term27559, term27559.getClass(), "disabledSelectedIcon", null);
        setField(term27559, term27559.getClass(), "rolloverIcon", null);
        setField(term27559, term27559.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27559, term27559.getClass(), "paintBorder", false);
        setBooleanField(term27559, term27559.getClass(), "paintFocus", false);
        setBooleanField(term27559, term27559.getClass(), "rolloverEnabled", false);
        setBooleanField(term27559, term27559.getClass(), "contentAreaFilled", false);
        setIntField(term27559, term27559.getClass(), "verticalAlignment", 0);
        setIntField(term27559, term27559.getClass(), "horizontalAlignment", 0);
        setIntField(term27559, term27559.getClass(), "verticalTextPosition", 0);
        setIntField(term27559, term27559.getClass(), "horizontalTextPosition", 0);
        setIntField(term27559, term27559.getClass(), "iconTextGap", 0);
        setIntField(term27559, term27559.getClass(), "mnemonic", 0);
        setIntField(term27559, term27559.getClass(), "mnemonicIndex", 0);
        setLongField(term27559, term27559.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27559, term27559.getClass(), "borderPaintedSet", false);
        setBooleanField(term27559, term27559.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27559, term27559.getClass(), "iconTextGapSet", false);
        setBooleanField(term27559, term27559.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27559, term27559.getClass(), "setLayout", false);
        setBooleanField(term27559, term27559.getClass(), "defaultCapable", false);
        setField(term27559, term27559.getClass(), "handler", null);
        setField(term27559, term27559.getClass(), "changeListener", null);
        setField(term27559, term27559.getClass(), "actionListener", null);
        setField(term27559, term27559.getClass(), "itemListener", null);
        setField(term27559, term27559.getClass(), "changeEvent", null);
        setBooleanField(term27559, term27559.getClass(), "hideActionText", false);
        setField(term27559, term27559.getClass(), "action", null);
        setField(term27559, term27559.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27559, term27559.getClass(), "isAlignmentXSet", false);
        setFloatField(term27559, term27559.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27559, term27559.getClass(), "isAlignmentYSet", false);
        setFloatField(term27559, term27559.getClass(), "alignmentY", 0.0F);
        setField(term27559, term27559.getClass(), "ui", null);
        setField(term27559, term27559.getClass(), "listenerList", null);
        setField(term27559, term27559.getClass(), "clientProperties", null);
        setField(term27559, term27559.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27559, term27559.getClass(), "autoscrolls", false);
        setField(term27559, term27559.getClass(), "border", null);
        setIntField(term27559, term27559.getClass(), "flags", 0);
        setField(term27559, term27559.getClass(), "inputVerifier", null);
        setBooleanField(term27559, term27559.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27559, term27559.getClass(), "paintingChild", null);
        setField(term27559, term27559.getClass(), "popupMenu", null);
        setField(term27559, term27559.getClass(), "revalidateRunnableScheduled", null);
        setField(term27559, term27559.getClass(), "focusInputMap", null);
        setField(term27559, term27559.getClass(), "ancestorInputMap", null);
        setField(term27559, term27559.getClass(), "windowInputMap", null);
        setField(term27559, term27559.getClass(), "actionMap", null);
        setField(term27559, term27559.getClass(), "aaHint", null);
        setField(term27559, term27559.getClass(), "lcdRenderingHint", null);
        setField(term27559, term27559.getClass(), "component", null);
        setField(term27559, term27559.getClass(), "layoutMgr", null);
        setField(term27559, term27559.getClass(), "dispatcher", null);
        setField(term27559, term27559.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27559, term27559.getClass(), "focusCycleRoot", false);
        setBooleanField(term27559, term27559.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27559, term27559.getClass(), "printingThreads", null);
        setBooleanField(term27559, term27559.getClass(), "printing", false);
        setField(term27559, term27559.getClass(), "containerListener", null);
        setIntField(term27559, term27559.getClass(), "listeningChildren", 0);
        setIntField(term27559, term27559.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27559, term27559.getClass(), "descendantsCount", 0);
        setField(term27559, term27559.getClass(), "preserveBackgroundColor", null);
        setIntField(term27559, term27559.getClass(), "numOfHWComponents", 0);
        setIntField(term27559, term27559.getClass(), "numOfLWComponents", 0);
        setField(term27559, term27559.getClass(), "modalComp", null);
        setField(term27559, term27559.getClass(), "modalAppContext", null);
        setIntField(term27559, term27559.getClass(), "containerSerializedDataVersion", 0);
        setField(term27559, term27559.getClass(), "peer", null);
        setField(term27559, term27559.getClass(), "parent", null);
        setField(term27559, term27559.getClass(), "appContext", null);
        setIntField(term27559, term27559.getClass(), "x", 0);
        setIntField(term27559, term27559.getClass(), "y", 0);
        setIntField(term27559, term27559.getClass(), "width", 0);
        setIntField(term27559, term27559.getClass(), "height", 0);
        setField(term27559, term27559.getClass(), "foreground", null);
        setField(term27559, term27559.getClass(), "background", null);
        setField(term27559, term27559.getClass(), "font", null);
        setField(term27559, term27559.getClass(), "peerFont", null);
        setField(term27559, term27559.getClass(), "cursor", null);
        setField(term27559, term27559.getClass(), "locale", null);
        setField(term27559, term27559.getClass(), "graphicsConfig", null);
        setField(term27559, term27559.getClass(), "bufferStrategy", null);
        setBooleanField(term27559, term27559.getClass(), "ignoreRepaint", false);
        setBooleanField(term27559, term27559.getClass(), "visible", false);
        setBooleanField(term27559, term27559.getClass(), "enabled", false);
        setBooleanField(term27559, term27559.getClass(), "valid", false);
        setField(term27559, term27559.getClass(), "dropTarget", null);
        setField(term27559, term27559.getClass(), "popups", null);
        setField(term27559, term27559.getClass(), "name", null);
        setBooleanField(term27559, term27559.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27559, term27559.getClass(), "focusable", false);
        setIntField(term27559, term27559.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27559, term27559.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27559, term27559.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27559, term27559.getClass(), "acc", null);
        setField(term27559, term27559.getClass(), "minSize", null);
        setBooleanField(term27559, term27559.getClass(), "minSizeSet", false);
        setField(term27559, term27559.getClass(), "prefSize", null);
        setBooleanField(term27559, term27559.getClass(), "prefSizeSet", false);
        setField(term27559, term27559.getClass(), "maxSize", null);
        setBooleanField(term27559, term27559.getClass(), "maxSizeSet", false);
        setField(term27559, term27559.getClass(), "componentOrientation", null);
        setBooleanField(term27559, term27559.getClass(), "newEventsOnly", false);
        setField(term27559, term27559.getClass(), "componentListener", null);
        setField(term27559, term27559.getClass(), "focusListener", null);
        setField(term27559, term27559.getClass(), "hierarchyListener", null);
        setField(term27559, term27559.getClass(), "hierarchyBoundsListener", null);
        setField(term27559, term27559.getClass(), "keyListener", null);
        setField(term27559, term27559.getClass(), "mouseListener", null);
        setField(term27559, term27559.getClass(), "mouseMotionListener", null);
        setField(term27559, term27559.getClass(), "mouseWheelListener", null);
        setField(term27559, term27559.getClass(), "inputMethodListener", null);
        setLongField(term27559, term27559.getClass(), "eventMask", 0L);
        setField(term27559, term27559.getClass(), "changeSupport", null);
        setField(term27559, term27559.getClass(), "objectLock", null);
        setBooleanField(term27559, term27559.getClass(), "isPacked", false);
        setIntField(term27559, term27559.getClass(), "boundsOp", 0);
        setField(term27559, term27559.getClass(), "compoundShape", null);
        setField(term27559, term27559.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27559, term27559.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27559, term27559.getClass(), "backgroundEraseDisabled", false);
        setField(term27559, term27559.getClass(), "eventCache", null);
        setBooleanField(term27559, term27559.getClass(), "coalescingEnabled", false);
        setBooleanField(term27559, term27559.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27559, term27559.getClass(), "componentSerializedDataVersion", 0);
        setField(term27559, term27559.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term27559, args);
    }

};


