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

public class KMenuItem_setPreferences_17008299332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14740;

    public KMenuItem_setPreferences_17008299332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14740 = newInstance(Class.forName("proto.KMenuItem"));
        Object term14742 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term14759 = newInstance(Class.forName("java.awt.Insets"));
        Object term14764 = newInstance(Class.forName("java.awt.Insets"));
        setBooleanField(term14740, term14740.getClass(), "isMouseDragged", false);
        setCharField(term14742, term14742.getClass(), "keyChar", (char) 65535);
        setIntField(term14742, term14742.getClass(), "keyCode", 1202361360);
        setIntField(term14742, term14742.getClass(), "modifiers", -2015048153);
        setBooleanField(term14742, term14742.getClass(), "onKeyRelease", false);
        setField(term14740, term14740.getClass(), "accelerator", term14742);
        setField(term14740, term14740.getClass(), "model", null);
        setField(term14740, term14740.getClass(), "text", "IDCWpPLRkE");
        setIntField(term14759, term14759.getClass(), "top", -2063457669);
        setIntField(term14759, term14759.getClass(), "left", -1222006000);
        setIntField(term14759, term14759.getClass(), "bottom", 2095798786);
        setIntField(term14759, term14759.getClass(), "right", -1565502840);
        setField(term14740, term14740.getClass(), "margin", term14759);
        setIntField(term14764, term14764.getClass(), "top", 344323424);
        setIntField(term14764, term14764.getClass(), "left", 9726679);
        setIntField(term14764, term14764.getClass(), "bottom", -25637976);
        setIntField(term14764, term14764.getClass(), "right", 1555897383);
        setField(term14740, term14740.getClass(), "defaultMargin", term14764);
        setField(term14740, term14740.getClass(), "defaultIcon", null);
        setField(term14740, term14740.getClass(), "pressedIcon", null);
        setField(term14740, term14740.getClass(), "disabledIcon", null);
        setField(term14740, term14740.getClass(), "selectedIcon", null);
        setField(term14740, term14740.getClass(), "disabledSelectedIcon", null);
        setField(term14740, term14740.getClass(), "rolloverIcon", null);
        setField(term14740, term14740.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term14740, term14740.getClass(), "paintBorder", false);
        setBooleanField(term14740, term14740.getClass(), "paintFocus", false);
        setBooleanField(term14740, term14740.getClass(), "rolloverEnabled", false);
        setBooleanField(term14740, term14740.getClass(), "contentAreaFilled", false);
        setIntField(term14740, term14740.getClass(), "verticalAlignment", 0);
        setIntField(term14740, term14740.getClass(), "horizontalAlignment", 0);
        setIntField(term14740, term14740.getClass(), "verticalTextPosition", 0);
        setIntField(term14740, term14740.getClass(), "horizontalTextPosition", 0);
        setIntField(term14740, term14740.getClass(), "iconTextGap", 0);
        setIntField(term14740, term14740.getClass(), "mnemonic", 0);
        setIntField(term14740, term14740.getClass(), "mnemonicIndex", 0);
        setLongField(term14740, term14740.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term14740, term14740.getClass(), "borderPaintedSet", false);
        setBooleanField(term14740, term14740.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term14740, term14740.getClass(), "iconTextGapSet", false);
        setBooleanField(term14740, term14740.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term14740, term14740.getClass(), "setLayout", false);
        setBooleanField(term14740, term14740.getClass(), "defaultCapable", false);
        setField(term14740, term14740.getClass(), "handler", null);
        setField(term14740, term14740.getClass(), "changeListener", null);
        setField(term14740, term14740.getClass(), "actionListener", null);
        setField(term14740, term14740.getClass(), "itemListener", null);
        setField(term14740, term14740.getClass(), "changeEvent", null);
        setBooleanField(term14740, term14740.getClass(), "hideActionText", false);
        setField(term14740, term14740.getClass(), "action", null);
        setField(term14740, term14740.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term14740, term14740.getClass(), "isAlignmentXSet", false);
        setFloatField(term14740, term14740.getClass(), "alignmentX", 0.0F);
        setBooleanField(term14740, term14740.getClass(), "isAlignmentYSet", false);
        setFloatField(term14740, term14740.getClass(), "alignmentY", 0.0F);
        setField(term14740, term14740.getClass(), "ui", null);
        setField(term14740, term14740.getClass(), "listenerList", null);
        setField(term14740, term14740.getClass(), "clientProperties", null);
        setField(term14740, term14740.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term14740, term14740.getClass(), "autoscrolls", false);
        setField(term14740, term14740.getClass(), "border", null);
        setIntField(term14740, term14740.getClass(), "flags", 0);
        setField(term14740, term14740.getClass(), "inputVerifier", null);
        setBooleanField(term14740, term14740.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term14740, term14740.getClass(), "paintingChild", null);
        setField(term14740, term14740.getClass(), "popupMenu", null);
        setField(term14740, term14740.getClass(), "revalidateRunnableScheduled", null);
        setField(term14740, term14740.getClass(), "focusInputMap", null);
        setField(term14740, term14740.getClass(), "ancestorInputMap", null);
        setField(term14740, term14740.getClass(), "windowInputMap", null);
        setField(term14740, term14740.getClass(), "actionMap", null);
        setField(term14740, term14740.getClass(), "aaHint", null);
        setField(term14740, term14740.getClass(), "lcdRenderingHint", null);
        setField(term14740, term14740.getClass(), "component", null);
        setField(term14740, term14740.getClass(), "layoutMgr", null);
        setField(term14740, term14740.getClass(), "dispatcher", null);
        setField(term14740, term14740.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term14740, term14740.getClass(), "focusCycleRoot", false);
        setBooleanField(term14740, term14740.getClass(), "focusTraversalPolicyProvider", false);
        setField(term14740, term14740.getClass(), "printingThreads", null);
        setBooleanField(term14740, term14740.getClass(), "printing", false);
        setField(term14740, term14740.getClass(), "containerListener", null);
        setIntField(term14740, term14740.getClass(), "listeningChildren", 0);
        setIntField(term14740, term14740.getClass(), "listeningBoundsChildren", 0);
        setIntField(term14740, term14740.getClass(), "descendantsCount", 0);
        setField(term14740, term14740.getClass(), "preserveBackgroundColor", null);
        setIntField(term14740, term14740.getClass(), "numOfHWComponents", 0);
        setIntField(term14740, term14740.getClass(), "numOfLWComponents", 0);
        setField(term14740, term14740.getClass(), "modalComp", null);
        setField(term14740, term14740.getClass(), "modalAppContext", null);
        setIntField(term14740, term14740.getClass(), "containerSerializedDataVersion", 0);
        setField(term14740, term14740.getClass(), "peer", null);
        setField(term14740, term14740.getClass(), "parent", null);
        setField(term14740, term14740.getClass(), "appContext", null);
        setIntField(term14740, term14740.getClass(), "x", 0);
        setIntField(term14740, term14740.getClass(), "y", 0);
        setIntField(term14740, term14740.getClass(), "width", 0);
        setIntField(term14740, term14740.getClass(), "height", 0);
        setField(term14740, term14740.getClass(), "foreground", null);
        setField(term14740, term14740.getClass(), "background", null);
        setField(term14740, term14740.getClass(), "font", null);
        setField(term14740, term14740.getClass(), "peerFont", null);
        setField(term14740, term14740.getClass(), "cursor", null);
        setField(term14740, term14740.getClass(), "locale", null);
        setField(term14740, term14740.getClass(), "graphicsConfig", null);
        setField(term14740, term14740.getClass(), "bufferStrategy", null);
        setBooleanField(term14740, term14740.getClass(), "ignoreRepaint", false);
        setBooleanField(term14740, term14740.getClass(), "visible", false);
        setBooleanField(term14740, term14740.getClass(), "enabled", false);
        setBooleanField(term14740, term14740.getClass(), "valid", false);
        setField(term14740, term14740.getClass(), "dropTarget", null);
        setField(term14740, term14740.getClass(), "popups", null);
        setField(term14740, term14740.getClass(), "name", null);
        setBooleanField(term14740, term14740.getClass(), "nameExplicitlySet", false);
        setBooleanField(term14740, term14740.getClass(), "focusable", false);
        setIntField(term14740, term14740.getClass(), "isFocusTraversableOverridden", 0);
        setField(term14740, term14740.getClass(), "focusTraversalKeys", null);
        setBooleanField(term14740, term14740.getClass(), "focusTraversalKeysEnabled", false);
        setField(term14740, term14740.getClass(), "acc", null);
        setField(term14740, term14740.getClass(), "minSize", null);
        setBooleanField(term14740, term14740.getClass(), "minSizeSet", false);
        setField(term14740, term14740.getClass(), "prefSize", null);
        setBooleanField(term14740, term14740.getClass(), "prefSizeSet", false);
        setField(term14740, term14740.getClass(), "maxSize", null);
        setBooleanField(term14740, term14740.getClass(), "maxSizeSet", false);
        setField(term14740, term14740.getClass(), "componentOrientation", null);
        setBooleanField(term14740, term14740.getClass(), "newEventsOnly", false);
        setField(term14740, term14740.getClass(), "componentListener", null);
        setField(term14740, term14740.getClass(), "focusListener", null);
        setField(term14740, term14740.getClass(), "hierarchyListener", null);
        setField(term14740, term14740.getClass(), "hierarchyBoundsListener", null);
        setField(term14740, term14740.getClass(), "keyListener", null);
        setField(term14740, term14740.getClass(), "mouseListener", null);
        setField(term14740, term14740.getClass(), "mouseMotionListener", null);
        setField(term14740, term14740.getClass(), "mouseWheelListener", null);
        setField(term14740, term14740.getClass(), "inputMethodListener", null);
        setLongField(term14740, term14740.getClass(), "eventMask", 0L);
        setField(term14740, term14740.getClass(), "changeSupport", null);
        setField(term14740, term14740.getClass(), "objectLock", null);
        setBooleanField(term14740, term14740.getClass(), "isPacked", false);
        setIntField(term14740, term14740.getClass(), "boundsOp", 0);
        setField(term14740, term14740.getClass(), "compoundShape", null);
        setField(term14740, term14740.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term14740, term14740.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term14740, term14740.getClass(), "backgroundEraseDisabled", false);
        setField(term14740, term14740.getClass(), "eventCache", null);
        setBooleanField(term14740, term14740.getClass(), "coalescingEnabled", false);
        setBooleanField(term14740, term14740.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term14740, term14740.getClass(), "componentSerializedDataVersion", 0);
        setField(term14740, term14740.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KMenuItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term14740, args);
    }

};


