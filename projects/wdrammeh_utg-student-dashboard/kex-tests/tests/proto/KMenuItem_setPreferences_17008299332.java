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
     Object term14743;

    public KMenuItem_setPreferences_17008299332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14743 = newInstance(Class.forName("proto.KMenuItem"));
        Object term14745 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term14762 = newInstance(Class.forName("java.awt.Insets"));
        Object term14767 = newInstance(Class.forName("java.awt.Insets"));
        setBooleanField(term14743, term14743.getClass(), "isMouseDragged", false);
        setCharField(term14745, term14745.getClass(), "keyChar", (char) 65535);
        setIntField(term14745, term14745.getClass(), "keyCode", 1202361360);
        setIntField(term14745, term14745.getClass(), "modifiers", -2015048153);
        setBooleanField(term14745, term14745.getClass(), "onKeyRelease", false);
        setField(term14743, term14743.getClass(), "accelerator", term14745);
        setField(term14743, term14743.getClass(), "model", null);
        setField(term14743, term14743.getClass(), "text", "IDCWpPLRkE");
        setIntField(term14762, term14762.getClass(), "top", -2063457669);
        setIntField(term14762, term14762.getClass(), "left", -1222006000);
        setIntField(term14762, term14762.getClass(), "bottom", 2095798786);
        setIntField(term14762, term14762.getClass(), "right", -1565502840);
        setField(term14743, term14743.getClass(), "margin", term14762);
        setIntField(term14767, term14767.getClass(), "top", 344323424);
        setIntField(term14767, term14767.getClass(), "left", 9726679);
        setIntField(term14767, term14767.getClass(), "bottom", -25637976);
        setIntField(term14767, term14767.getClass(), "right", 1555897383);
        setField(term14743, term14743.getClass(), "defaultMargin", term14767);
        setField(term14743, term14743.getClass(), "defaultIcon", null);
        setField(term14743, term14743.getClass(), "pressedIcon", null);
        setField(term14743, term14743.getClass(), "disabledIcon", null);
        setField(term14743, term14743.getClass(), "selectedIcon", null);
        setField(term14743, term14743.getClass(), "disabledSelectedIcon", null);
        setField(term14743, term14743.getClass(), "rolloverIcon", null);
        setField(term14743, term14743.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term14743, term14743.getClass(), "paintBorder", false);
        setBooleanField(term14743, term14743.getClass(), "paintFocus", false);
        setBooleanField(term14743, term14743.getClass(), "rolloverEnabled", false);
        setBooleanField(term14743, term14743.getClass(), "contentAreaFilled", false);
        setIntField(term14743, term14743.getClass(), "verticalAlignment", 0);
        setIntField(term14743, term14743.getClass(), "horizontalAlignment", 0);
        setIntField(term14743, term14743.getClass(), "verticalTextPosition", 0);
        setIntField(term14743, term14743.getClass(), "horizontalTextPosition", 0);
        setIntField(term14743, term14743.getClass(), "iconTextGap", 0);
        setIntField(term14743, term14743.getClass(), "mnemonic", 0);
        setIntField(term14743, term14743.getClass(), "mnemonicIndex", 0);
        setLongField(term14743, term14743.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term14743, term14743.getClass(), "borderPaintedSet", false);
        setBooleanField(term14743, term14743.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term14743, term14743.getClass(), "iconTextGapSet", false);
        setBooleanField(term14743, term14743.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term14743, term14743.getClass(), "setLayout", false);
        setBooleanField(term14743, term14743.getClass(), "defaultCapable", false);
        setField(term14743, term14743.getClass(), "handler", null);
        setField(term14743, term14743.getClass(), "changeListener", null);
        setField(term14743, term14743.getClass(), "actionListener", null);
        setField(term14743, term14743.getClass(), "itemListener", null);
        setField(term14743, term14743.getClass(), "changeEvent", null);
        setBooleanField(term14743, term14743.getClass(), "hideActionText", false);
        setField(term14743, term14743.getClass(), "action", null);
        setField(term14743, term14743.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term14743, term14743.getClass(), "isAlignmentXSet", false);
        setFloatField(term14743, term14743.getClass(), "alignmentX", 0.0F);
        setBooleanField(term14743, term14743.getClass(), "isAlignmentYSet", false);
        setFloatField(term14743, term14743.getClass(), "alignmentY", 0.0F);
        setField(term14743, term14743.getClass(), "ui", null);
        setField(term14743, term14743.getClass(), "listenerList", null);
        setField(term14743, term14743.getClass(), "clientProperties", null);
        setField(term14743, term14743.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term14743, term14743.getClass(), "autoscrolls", false);
        setField(term14743, term14743.getClass(), "border", null);
        setIntField(term14743, term14743.getClass(), "flags", 0);
        setField(term14743, term14743.getClass(), "inputVerifier", null);
        setBooleanField(term14743, term14743.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term14743, term14743.getClass(), "paintingChild", null);
        setField(term14743, term14743.getClass(), "popupMenu", null);
        setField(term14743, term14743.getClass(), "revalidateRunnableScheduled", null);
        setField(term14743, term14743.getClass(), "focusInputMap", null);
        setField(term14743, term14743.getClass(), "ancestorInputMap", null);
        setField(term14743, term14743.getClass(), "windowInputMap", null);
        setField(term14743, term14743.getClass(), "actionMap", null);
        setField(term14743, term14743.getClass(), "aaHint", null);
        setField(term14743, term14743.getClass(), "lcdRenderingHint", null);
        setField(term14743, term14743.getClass(), "component", null);
        setField(term14743, term14743.getClass(), "layoutMgr", null);
        setField(term14743, term14743.getClass(), "dispatcher", null);
        setField(term14743, term14743.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term14743, term14743.getClass(), "focusCycleRoot", false);
        setBooleanField(term14743, term14743.getClass(), "focusTraversalPolicyProvider", false);
        setField(term14743, term14743.getClass(), "printingThreads", null);
        setBooleanField(term14743, term14743.getClass(), "printing", false);
        setField(term14743, term14743.getClass(), "containerListener", null);
        setIntField(term14743, term14743.getClass(), "listeningChildren", 0);
        setIntField(term14743, term14743.getClass(), "listeningBoundsChildren", 0);
        setIntField(term14743, term14743.getClass(), "descendantsCount", 0);
        setField(term14743, term14743.getClass(), "preserveBackgroundColor", null);
        setIntField(term14743, term14743.getClass(), "numOfHWComponents", 0);
        setIntField(term14743, term14743.getClass(), "numOfLWComponents", 0);
        setField(term14743, term14743.getClass(), "modalComp", null);
        setField(term14743, term14743.getClass(), "modalAppContext", null);
        setIntField(term14743, term14743.getClass(), "containerSerializedDataVersion", 0);
        setField(term14743, term14743.getClass(), "peer", null);
        setField(term14743, term14743.getClass(), "parent", null);
        setField(term14743, term14743.getClass(), "appContext", null);
        setIntField(term14743, term14743.getClass(), "x", 0);
        setIntField(term14743, term14743.getClass(), "y", 0);
        setIntField(term14743, term14743.getClass(), "width", 0);
        setIntField(term14743, term14743.getClass(), "height", 0);
        setField(term14743, term14743.getClass(), "foreground", null);
        setField(term14743, term14743.getClass(), "background", null);
        setField(term14743, term14743.getClass(), "font", null);
        setField(term14743, term14743.getClass(), "peerFont", null);
        setField(term14743, term14743.getClass(), "cursor", null);
        setField(term14743, term14743.getClass(), "locale", null);
        setField(term14743, term14743.getClass(), "graphicsConfig", null);
        setField(term14743, term14743.getClass(), "bufferStrategy", null);
        setBooleanField(term14743, term14743.getClass(), "ignoreRepaint", false);
        setBooleanField(term14743, term14743.getClass(), "visible", false);
        setBooleanField(term14743, term14743.getClass(), "enabled", false);
        setBooleanField(term14743, term14743.getClass(), "valid", false);
        setField(term14743, term14743.getClass(), "dropTarget", null);
        setField(term14743, term14743.getClass(), "popups", null);
        setField(term14743, term14743.getClass(), "name", null);
        setBooleanField(term14743, term14743.getClass(), "nameExplicitlySet", false);
        setBooleanField(term14743, term14743.getClass(), "focusable", false);
        setIntField(term14743, term14743.getClass(), "isFocusTraversableOverridden", 0);
        setField(term14743, term14743.getClass(), "focusTraversalKeys", null);
        setBooleanField(term14743, term14743.getClass(), "focusTraversalKeysEnabled", false);
        setField(term14743, term14743.getClass(), "acc", null);
        setField(term14743, term14743.getClass(), "minSize", null);
        setBooleanField(term14743, term14743.getClass(), "minSizeSet", false);
        setField(term14743, term14743.getClass(), "prefSize", null);
        setBooleanField(term14743, term14743.getClass(), "prefSizeSet", false);
        setField(term14743, term14743.getClass(), "maxSize", null);
        setBooleanField(term14743, term14743.getClass(), "maxSizeSet", false);
        setField(term14743, term14743.getClass(), "componentOrientation", null);
        setBooleanField(term14743, term14743.getClass(), "newEventsOnly", false);
        setField(term14743, term14743.getClass(), "componentListener", null);
        setField(term14743, term14743.getClass(), "focusListener", null);
        setField(term14743, term14743.getClass(), "hierarchyListener", null);
        setField(term14743, term14743.getClass(), "hierarchyBoundsListener", null);
        setField(term14743, term14743.getClass(), "keyListener", null);
        setField(term14743, term14743.getClass(), "mouseListener", null);
        setField(term14743, term14743.getClass(), "mouseMotionListener", null);
        setField(term14743, term14743.getClass(), "mouseWheelListener", null);
        setField(term14743, term14743.getClass(), "inputMethodListener", null);
        setLongField(term14743, term14743.getClass(), "eventMask", 0L);
        setField(term14743, term14743.getClass(), "changeSupport", null);
        setField(term14743, term14743.getClass(), "objectLock", null);
        setBooleanField(term14743, term14743.getClass(), "isPacked", false);
        setIntField(term14743, term14743.getClass(), "boundsOp", 0);
        setField(term14743, term14743.getClass(), "compoundShape", null);
        setField(term14743, term14743.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term14743, term14743.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term14743, term14743.getClass(), "backgroundEraseDisabled", false);
        setField(term14743, term14743.getClass(), "eventCache", null);
        setBooleanField(term14743, term14743.getClass(), "coalescingEnabled", false);
        setBooleanField(term14743, term14743.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term14743, term14743.getClass(), "componentSerializedDataVersion", 0);
        setField(term14743, term14743.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KMenuItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term14743, args);
    }

};


