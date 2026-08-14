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

public class KCheckBox_createToolTip_18788397142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57194;

    public KCheckBox_createToolTip_18788397142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57194 = newInstance(Class.forName("proto.KCheckBox"));
        Object term57208 = newInstance(Class.forName("java.awt.Insets"));
        Object term57213 = newInstance(Class.forName("java.awt.Insets"));
        Object term57236 = newInstance(Class.forName("javax.swing.AbstractButton$Handler"));
        setBooleanField(term57194, term57194.getClass(), "flat", true);
        setField(term57194, term57194.getClass(), "model", null);
        setField(term57194, term57194.getClass(), "text", "mLUZFTfjle");
        setIntField(term57208, term57208.getClass(), "top", -1317044799);
        setIntField(term57208, term57208.getClass(), "left", -1428063820);
        setIntField(term57208, term57208.getClass(), "bottom", -1271375703);
        setIntField(term57208, term57208.getClass(), "right", 1136208236);
        setField(term57194, term57194.getClass(), "margin", term57208);
        setIntField(term57213, term57213.getClass(), "top", -1220630391);
        setIntField(term57213, term57213.getClass(), "left", -995822131);
        setIntField(term57213, term57213.getClass(), "bottom", -687282231);
        setIntField(term57213, term57213.getClass(), "right", 1200440315);
        setField(term57194, term57194.getClass(), "defaultMargin", term57213);
        setField(term57194, term57194.getClass(), "defaultIcon", null);
        setField(term57194, term57194.getClass(), "pressedIcon", null);
        setField(term57194, term57194.getClass(), "disabledIcon", null);
        setField(term57194, term57194.getClass(), "selectedIcon", null);
        setField(term57194, term57194.getClass(), "disabledSelectedIcon", null);
        setField(term57194, term57194.getClass(), "rolloverIcon", null);
        setField(term57194, term57194.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term57194, term57194.getClass(), "paintBorder", false);
        setBooleanField(term57194, term57194.getClass(), "paintFocus", false);
        setBooleanField(term57194, term57194.getClass(), "rolloverEnabled", false);
        setBooleanField(term57194, term57194.getClass(), "contentAreaFilled", false);
        setIntField(term57194, term57194.getClass(), "verticalAlignment", 40571662);
        setIntField(term57194, term57194.getClass(), "horizontalAlignment", 1863910269);
        setIntField(term57194, term57194.getClass(), "verticalTextPosition", 864645689);
        setIntField(term57194, term57194.getClass(), "horizontalTextPosition", 279384872);
        setIntField(term57194, term57194.getClass(), "iconTextGap", 1427305953);
        setIntField(term57194, term57194.getClass(), "mnemonic", -781832877);
        setIntField(term57194, term57194.getClass(), "mnemonicIndex", 797203987);
        setLongField(term57194, term57194.getClass(), "multiClickThreshhold", 5907001541142728739L);
        setBooleanField(term57194, term57194.getClass(), "borderPaintedSet", true);
        setBooleanField(term57194, term57194.getClass(), "rolloverEnabledSet", true);
        setBooleanField(term57194, term57194.getClass(), "iconTextGapSet", false);
        setBooleanField(term57194, term57194.getClass(), "contentAreaFilledSet", true);
        setBooleanField(term57194, term57194.getClass(), "setLayout", true);
        setBooleanField(term57194, term57194.getClass(), "defaultCapable", true);
        setField(term57236, term57236.getClass(), "this$0", null);
        setField(term57194, term57194.getClass(), "handler", term57236);
        setField(term57194, term57194.getClass(), "changeListener", null);
        setField(term57194, term57194.getClass(), "actionListener", null);
        setField(term57194, term57194.getClass(), "itemListener", null);
        setField(term57194, term57194.getClass(), "changeEvent", null);
        setBooleanField(term57194, term57194.getClass(), "hideActionText", false);
        setField(term57194, term57194.getClass(), "action", null);
        setField(term57194, term57194.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term57194, term57194.getClass(), "isAlignmentXSet", false);
        setFloatField(term57194, term57194.getClass(), "alignmentX", 0.0F);
        setBooleanField(term57194, term57194.getClass(), "isAlignmentYSet", false);
        setFloatField(term57194, term57194.getClass(), "alignmentY", 0.0F);
        setField(term57194, term57194.getClass(), "ui", null);
        setField(term57194, term57194.getClass(), "listenerList", null);
        setField(term57194, term57194.getClass(), "clientProperties", null);
        setField(term57194, term57194.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term57194, term57194.getClass(), "autoscrolls", false);
        setField(term57194, term57194.getClass(), "border", null);
        setIntField(term57194, term57194.getClass(), "flags", 0);
        setField(term57194, term57194.getClass(), "inputVerifier", null);
        setBooleanField(term57194, term57194.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term57194, term57194.getClass(), "paintingChild", null);
        setField(term57194, term57194.getClass(), "popupMenu", null);
        setField(term57194, term57194.getClass(), "revalidateRunnableScheduled", null);
        setField(term57194, term57194.getClass(), "focusInputMap", null);
        setField(term57194, term57194.getClass(), "ancestorInputMap", null);
        setField(term57194, term57194.getClass(), "windowInputMap", null);
        setField(term57194, term57194.getClass(), "actionMap", null);
        setField(term57194, term57194.getClass(), "aaHint", null);
        setField(term57194, term57194.getClass(), "lcdRenderingHint", null);
        setField(term57194, term57194.getClass(), "component", null);
        setField(term57194, term57194.getClass(), "layoutMgr", null);
        setField(term57194, term57194.getClass(), "dispatcher", null);
        setField(term57194, term57194.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57194, term57194.getClass(), "focusCycleRoot", false);
        setBooleanField(term57194, term57194.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57194, term57194.getClass(), "printingThreads", null);
        setBooleanField(term57194, term57194.getClass(), "printing", false);
        setField(term57194, term57194.getClass(), "containerListener", null);
        setIntField(term57194, term57194.getClass(), "listeningChildren", 0);
        setIntField(term57194, term57194.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57194, term57194.getClass(), "descendantsCount", 0);
        setField(term57194, term57194.getClass(), "preserveBackgroundColor", null);
        setIntField(term57194, term57194.getClass(), "numOfHWComponents", 0);
        setIntField(term57194, term57194.getClass(), "numOfLWComponents", 0);
        setField(term57194, term57194.getClass(), "modalComp", null);
        setField(term57194, term57194.getClass(), "modalAppContext", null);
        setIntField(term57194, term57194.getClass(), "containerSerializedDataVersion", 0);
        setField(term57194, term57194.getClass(), "peer", null);
        setField(term57194, term57194.getClass(), "parent", null);
        setField(term57194, term57194.getClass(), "appContext", null);
        setIntField(term57194, term57194.getClass(), "x", 0);
        setIntField(term57194, term57194.getClass(), "y", 0);
        setIntField(term57194, term57194.getClass(), "width", 0);
        setIntField(term57194, term57194.getClass(), "height", 0);
        setField(term57194, term57194.getClass(), "foreground", null);
        setField(term57194, term57194.getClass(), "background", null);
        setField(term57194, term57194.getClass(), "font", null);
        setField(term57194, term57194.getClass(), "peerFont", null);
        setField(term57194, term57194.getClass(), "cursor", null);
        setField(term57194, term57194.getClass(), "locale", null);
        setField(term57194, term57194.getClass(), "graphicsConfig", null);
        setField(term57194, term57194.getClass(), "bufferStrategy", null);
        setBooleanField(term57194, term57194.getClass(), "ignoreRepaint", false);
        setBooleanField(term57194, term57194.getClass(), "visible", false);
        setBooleanField(term57194, term57194.getClass(), "enabled", false);
        setBooleanField(term57194, term57194.getClass(), "valid", false);
        setField(term57194, term57194.getClass(), "dropTarget", null);
        setField(term57194, term57194.getClass(), "popups", null);
        setField(term57194, term57194.getClass(), "name", null);
        setBooleanField(term57194, term57194.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57194, term57194.getClass(), "focusable", false);
        setIntField(term57194, term57194.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57194, term57194.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57194, term57194.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57194, term57194.getClass(), "acc", null);
        setField(term57194, term57194.getClass(), "minSize", null);
        setBooleanField(term57194, term57194.getClass(), "minSizeSet", false);
        setField(term57194, term57194.getClass(), "prefSize", null);
        setBooleanField(term57194, term57194.getClass(), "prefSizeSet", false);
        setField(term57194, term57194.getClass(), "maxSize", null);
        setBooleanField(term57194, term57194.getClass(), "maxSizeSet", false);
        setField(term57194, term57194.getClass(), "componentOrientation", null);
        setBooleanField(term57194, term57194.getClass(), "newEventsOnly", false);
        setField(term57194, term57194.getClass(), "componentListener", null);
        setField(term57194, term57194.getClass(), "focusListener", null);
        setField(term57194, term57194.getClass(), "hierarchyListener", null);
        setField(term57194, term57194.getClass(), "hierarchyBoundsListener", null);
        setField(term57194, term57194.getClass(), "keyListener", null);
        setField(term57194, term57194.getClass(), "mouseListener", null);
        setField(term57194, term57194.getClass(), "mouseMotionListener", null);
        setField(term57194, term57194.getClass(), "mouseWheelListener", null);
        setField(term57194, term57194.getClass(), "inputMethodListener", null);
        setLongField(term57194, term57194.getClass(), "eventMask", 0L);
        setField(term57194, term57194.getClass(), "changeSupport", null);
        setField(term57194, term57194.getClass(), "objectLock", null);
        setBooleanField(term57194, term57194.getClass(), "isPacked", false);
        setIntField(term57194, term57194.getClass(), "boundsOp", 0);
        setField(term57194, term57194.getClass(), "compoundShape", null);
        setField(term57194, term57194.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57194, term57194.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57194, term57194.getClass(), "backgroundEraseDisabled", false);
        setField(term57194, term57194.getClass(), "eventCache", null);
        setBooleanField(term57194, term57194.getClass(), "coalescingEnabled", false);
        setBooleanField(term57194, term57194.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57194, term57194.getClass(), "componentSerializedDataVersion", 0);
        setField(term57194, term57194.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term57194, args);
    }

};


