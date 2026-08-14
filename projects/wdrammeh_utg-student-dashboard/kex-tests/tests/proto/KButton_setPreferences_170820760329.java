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
     Object term27592;

    public KButton_setPreferences_170820760329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27592 = newInstance(Class.forName("proto.KButton"));
        setField(term27592, term27592.getClass(), "initialTip", null);
        setField(term27592, term27592.getClass(), "model", null);
        setField(term27592, term27592.getClass(), "text", null);
        setField(term27592, term27592.getClass(), "margin", null);
        setField(term27592, term27592.getClass(), "defaultMargin", null);
        setField(term27592, term27592.getClass(), "defaultIcon", null);
        setField(term27592, term27592.getClass(), "pressedIcon", null);
        setField(term27592, term27592.getClass(), "disabledIcon", null);
        setField(term27592, term27592.getClass(), "selectedIcon", null);
        setField(term27592, term27592.getClass(), "disabledSelectedIcon", null);
        setField(term27592, term27592.getClass(), "rolloverIcon", null);
        setField(term27592, term27592.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term27592, term27592.getClass(), "paintBorder", false);
        setBooleanField(term27592, term27592.getClass(), "paintFocus", false);
        setBooleanField(term27592, term27592.getClass(), "rolloverEnabled", false);
        setBooleanField(term27592, term27592.getClass(), "contentAreaFilled", false);
        setIntField(term27592, term27592.getClass(), "verticalAlignment", 0);
        setIntField(term27592, term27592.getClass(), "horizontalAlignment", 0);
        setIntField(term27592, term27592.getClass(), "verticalTextPosition", 0);
        setIntField(term27592, term27592.getClass(), "horizontalTextPosition", 0);
        setIntField(term27592, term27592.getClass(), "iconTextGap", 0);
        setIntField(term27592, term27592.getClass(), "mnemonic", 0);
        setIntField(term27592, term27592.getClass(), "mnemonicIndex", 0);
        setLongField(term27592, term27592.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term27592, term27592.getClass(), "borderPaintedSet", false);
        setBooleanField(term27592, term27592.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term27592, term27592.getClass(), "iconTextGapSet", false);
        setBooleanField(term27592, term27592.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term27592, term27592.getClass(), "setLayout", false);
        setBooleanField(term27592, term27592.getClass(), "defaultCapable", false);
        setField(term27592, term27592.getClass(), "handler", null);
        setField(term27592, term27592.getClass(), "changeListener", null);
        setField(term27592, term27592.getClass(), "actionListener", null);
        setField(term27592, term27592.getClass(), "itemListener", null);
        setField(term27592, term27592.getClass(), "changeEvent", null);
        setBooleanField(term27592, term27592.getClass(), "hideActionText", false);
        setField(term27592, term27592.getClass(), "action", null);
        setField(term27592, term27592.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term27592, term27592.getClass(), "isAlignmentXSet", false);
        setFloatField(term27592, term27592.getClass(), "alignmentX", 0.0F);
        setBooleanField(term27592, term27592.getClass(), "isAlignmentYSet", false);
        setFloatField(term27592, term27592.getClass(), "alignmentY", 0.0F);
        setField(term27592, term27592.getClass(), "ui", null);
        setField(term27592, term27592.getClass(), "listenerList", null);
        setField(term27592, term27592.getClass(), "clientProperties", null);
        setField(term27592, term27592.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term27592, term27592.getClass(), "autoscrolls", false);
        setField(term27592, term27592.getClass(), "border", null);
        setIntField(term27592, term27592.getClass(), "flags", 0);
        setField(term27592, term27592.getClass(), "inputVerifier", null);
        setBooleanField(term27592, term27592.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term27592, term27592.getClass(), "paintingChild", null);
        setField(term27592, term27592.getClass(), "popupMenu", null);
        setField(term27592, term27592.getClass(), "revalidateRunnableScheduled", null);
        setField(term27592, term27592.getClass(), "focusInputMap", null);
        setField(term27592, term27592.getClass(), "ancestorInputMap", null);
        setField(term27592, term27592.getClass(), "windowInputMap", null);
        setField(term27592, term27592.getClass(), "actionMap", null);
        setField(term27592, term27592.getClass(), "aaHint", null);
        setField(term27592, term27592.getClass(), "lcdRenderingHint", null);
        setField(term27592, term27592.getClass(), "component", null);
        setField(term27592, term27592.getClass(), "layoutMgr", null);
        setField(term27592, term27592.getClass(), "dispatcher", null);
        setField(term27592, term27592.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term27592, term27592.getClass(), "focusCycleRoot", false);
        setBooleanField(term27592, term27592.getClass(), "focusTraversalPolicyProvider", false);
        setField(term27592, term27592.getClass(), "printingThreads", null);
        setBooleanField(term27592, term27592.getClass(), "printing", false);
        setField(term27592, term27592.getClass(), "containerListener", null);
        setIntField(term27592, term27592.getClass(), "listeningChildren", 0);
        setIntField(term27592, term27592.getClass(), "listeningBoundsChildren", 0);
        setIntField(term27592, term27592.getClass(), "descendantsCount", 0);
        setField(term27592, term27592.getClass(), "preserveBackgroundColor", null);
        setIntField(term27592, term27592.getClass(), "numOfHWComponents", 0);
        setIntField(term27592, term27592.getClass(), "numOfLWComponents", 0);
        setField(term27592, term27592.getClass(), "modalComp", null);
        setField(term27592, term27592.getClass(), "modalAppContext", null);
        setIntField(term27592, term27592.getClass(), "containerSerializedDataVersion", 0);
        setField(term27592, term27592.getClass(), "peer", null);
        setField(term27592, term27592.getClass(), "parent", null);
        setField(term27592, term27592.getClass(), "appContext", null);
        setIntField(term27592, term27592.getClass(), "x", 0);
        setIntField(term27592, term27592.getClass(), "y", 0);
        setIntField(term27592, term27592.getClass(), "width", 0);
        setIntField(term27592, term27592.getClass(), "height", 0);
        setField(term27592, term27592.getClass(), "foreground", null);
        setField(term27592, term27592.getClass(), "background", null);
        setField(term27592, term27592.getClass(), "font", null);
        setField(term27592, term27592.getClass(), "peerFont", null);
        setField(term27592, term27592.getClass(), "cursor", null);
        setField(term27592, term27592.getClass(), "locale", null);
        setField(term27592, term27592.getClass(), "graphicsConfig", null);
        setField(term27592, term27592.getClass(), "bufferStrategy", null);
        setBooleanField(term27592, term27592.getClass(), "ignoreRepaint", false);
        setBooleanField(term27592, term27592.getClass(), "visible", false);
        setBooleanField(term27592, term27592.getClass(), "enabled", false);
        setBooleanField(term27592, term27592.getClass(), "valid", false);
        setField(term27592, term27592.getClass(), "dropTarget", null);
        setField(term27592, term27592.getClass(), "popups", null);
        setField(term27592, term27592.getClass(), "name", null);
        setBooleanField(term27592, term27592.getClass(), "nameExplicitlySet", false);
        setBooleanField(term27592, term27592.getClass(), "focusable", false);
        setIntField(term27592, term27592.getClass(), "isFocusTraversableOverridden", 0);
        setField(term27592, term27592.getClass(), "focusTraversalKeys", null);
        setBooleanField(term27592, term27592.getClass(), "focusTraversalKeysEnabled", false);
        setField(term27592, term27592.getClass(), "acc", null);
        setField(term27592, term27592.getClass(), "minSize", null);
        setBooleanField(term27592, term27592.getClass(), "minSizeSet", false);
        setField(term27592, term27592.getClass(), "prefSize", null);
        setBooleanField(term27592, term27592.getClass(), "prefSizeSet", false);
        setField(term27592, term27592.getClass(), "maxSize", null);
        setBooleanField(term27592, term27592.getClass(), "maxSizeSet", false);
        setField(term27592, term27592.getClass(), "componentOrientation", null);
        setBooleanField(term27592, term27592.getClass(), "newEventsOnly", false);
        setField(term27592, term27592.getClass(), "componentListener", null);
        setField(term27592, term27592.getClass(), "focusListener", null);
        setField(term27592, term27592.getClass(), "hierarchyListener", null);
        setField(term27592, term27592.getClass(), "hierarchyBoundsListener", null);
        setField(term27592, term27592.getClass(), "keyListener", null);
        setField(term27592, term27592.getClass(), "mouseListener", null);
        setField(term27592, term27592.getClass(), "mouseMotionListener", null);
        setField(term27592, term27592.getClass(), "mouseWheelListener", null);
        setField(term27592, term27592.getClass(), "inputMethodListener", null);
        setLongField(term27592, term27592.getClass(), "eventMask", 0L);
        setField(term27592, term27592.getClass(), "changeSupport", null);
        setField(term27592, term27592.getClass(), "objectLock", null);
        setBooleanField(term27592, term27592.getClass(), "isPacked", false);
        setIntField(term27592, term27592.getClass(), "boundsOp", 0);
        setField(term27592, term27592.getClass(), "compoundShape", null);
        setField(term27592, term27592.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term27592, term27592.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term27592, term27592.getClass(), "backgroundEraseDisabled", false);
        setField(term27592, term27592.getClass(), "eventCache", null);
        setBooleanField(term27592, term27592.getClass(), "coalescingEnabled", false);
        setBooleanField(term27592, term27592.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term27592, term27592.getClass(), "componentSerializedDataVersion", 0);
        setField(term27592, term27592.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term27592, args);
    }

};


