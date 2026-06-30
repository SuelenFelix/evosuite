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
     Object term57145;

    public KCheckBox_createToolTip_18788397142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57145 = newInstance(Class.forName("proto.KCheckBox"));
        Object term57159 = newInstance(Class.forName("java.awt.Insets"));
        Object term57164 = newInstance(Class.forName("java.awt.Insets"));
        Object term57187 = newInstance(Class.forName("javax.swing.AbstractButton$Handler"));
        setBooleanField(term57145, term57145.getClass(), "flat", true);
        setField(term57145, term57145.getClass(), "model", null);
        setField(term57145, term57145.getClass(), "text", "mLUZFTfjle");
        setIntField(term57159, term57159.getClass(), "top", -1317044799);
        setIntField(term57159, term57159.getClass(), "left", -1428063820);
        setIntField(term57159, term57159.getClass(), "bottom", -1271375703);
        setIntField(term57159, term57159.getClass(), "right", 1136208236);
        setField(term57145, term57145.getClass(), "margin", term57159);
        setIntField(term57164, term57164.getClass(), "top", -1220630391);
        setIntField(term57164, term57164.getClass(), "left", -995822131);
        setIntField(term57164, term57164.getClass(), "bottom", -687282231);
        setIntField(term57164, term57164.getClass(), "right", 1200440315);
        setField(term57145, term57145.getClass(), "defaultMargin", term57164);
        setField(term57145, term57145.getClass(), "defaultIcon", null);
        setField(term57145, term57145.getClass(), "pressedIcon", null);
        setField(term57145, term57145.getClass(), "disabledIcon", null);
        setField(term57145, term57145.getClass(), "selectedIcon", null);
        setField(term57145, term57145.getClass(), "disabledSelectedIcon", null);
        setField(term57145, term57145.getClass(), "rolloverIcon", null);
        setField(term57145, term57145.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term57145, term57145.getClass(), "paintBorder", true);
        setBooleanField(term57145, term57145.getClass(), "paintFocus", false);
        setBooleanField(term57145, term57145.getClass(), "rolloverEnabled", false);
        setBooleanField(term57145, term57145.getClass(), "contentAreaFilled", false);
        setIntField(term57145, term57145.getClass(), "verticalAlignment", 40571662);
        setIntField(term57145, term57145.getClass(), "horizontalAlignment", 1863910269);
        setIntField(term57145, term57145.getClass(), "verticalTextPosition", 864645689);
        setIntField(term57145, term57145.getClass(), "horizontalTextPosition", 279384872);
        setIntField(term57145, term57145.getClass(), "iconTextGap", 1427305953);
        setIntField(term57145, term57145.getClass(), "mnemonic", -781832877);
        setIntField(term57145, term57145.getClass(), "mnemonicIndex", 797203987);
        setLongField(term57145, term57145.getClass(), "multiClickThreshhold", 5907001541142728739L);
        setBooleanField(term57145, term57145.getClass(), "borderPaintedSet", false);
        setBooleanField(term57145, term57145.getClass(), "rolloverEnabledSet", true);
        setBooleanField(term57145, term57145.getClass(), "iconTextGapSet", true);
        setBooleanField(term57145, term57145.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term57145, term57145.getClass(), "setLayout", true);
        setBooleanField(term57145, term57145.getClass(), "defaultCapable", true);
        setField(term57187, term57187.getClass(), "this$0", null);
        setField(term57145, term57145.getClass(), "handler", term57187);
        setField(term57145, term57145.getClass(), "changeListener", null);
        setField(term57145, term57145.getClass(), "actionListener", null);
        setField(term57145, term57145.getClass(), "itemListener", null);
        setField(term57145, term57145.getClass(), "changeEvent", null);
        setBooleanField(term57145, term57145.getClass(), "hideActionText", false);
        setField(term57145, term57145.getClass(), "action", null);
        setField(term57145, term57145.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term57145, term57145.getClass(), "isAlignmentXSet", false);
        setFloatField(term57145, term57145.getClass(), "alignmentX", 0.0F);
        setBooleanField(term57145, term57145.getClass(), "isAlignmentYSet", false);
        setFloatField(term57145, term57145.getClass(), "alignmentY", 0.0F);
        setField(term57145, term57145.getClass(), "ui", null);
        setField(term57145, term57145.getClass(), "listenerList", null);
        setField(term57145, term57145.getClass(), "clientProperties", null);
        setField(term57145, term57145.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term57145, term57145.getClass(), "autoscrolls", false);
        setField(term57145, term57145.getClass(), "border", null);
        setIntField(term57145, term57145.getClass(), "flags", 0);
        setField(term57145, term57145.getClass(), "inputVerifier", null);
        setBooleanField(term57145, term57145.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term57145, term57145.getClass(), "paintingChild", null);
        setField(term57145, term57145.getClass(), "popupMenu", null);
        setField(term57145, term57145.getClass(), "revalidateRunnableScheduled", null);
        setField(term57145, term57145.getClass(), "focusInputMap", null);
        setField(term57145, term57145.getClass(), "ancestorInputMap", null);
        setField(term57145, term57145.getClass(), "windowInputMap", null);
        setField(term57145, term57145.getClass(), "actionMap", null);
        setField(term57145, term57145.getClass(), "aaHint", null);
        setField(term57145, term57145.getClass(), "lcdRenderingHint", null);
        setField(term57145, term57145.getClass(), "component", null);
        setField(term57145, term57145.getClass(), "layoutMgr", null);
        setField(term57145, term57145.getClass(), "dispatcher", null);
        setField(term57145, term57145.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57145, term57145.getClass(), "focusCycleRoot", false);
        setBooleanField(term57145, term57145.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57145, term57145.getClass(), "printingThreads", null);
        setBooleanField(term57145, term57145.getClass(), "printing", false);
        setField(term57145, term57145.getClass(), "containerListener", null);
        setIntField(term57145, term57145.getClass(), "listeningChildren", 0);
        setIntField(term57145, term57145.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57145, term57145.getClass(), "descendantsCount", 0);
        setField(term57145, term57145.getClass(), "preserveBackgroundColor", null);
        setIntField(term57145, term57145.getClass(), "numOfHWComponents", 0);
        setIntField(term57145, term57145.getClass(), "numOfLWComponents", 0);
        setField(term57145, term57145.getClass(), "modalComp", null);
        setField(term57145, term57145.getClass(), "modalAppContext", null);
        setIntField(term57145, term57145.getClass(), "containerSerializedDataVersion", 0);
        setField(term57145, term57145.getClass(), "peer", null);
        setField(term57145, term57145.getClass(), "parent", null);
        setField(term57145, term57145.getClass(), "appContext", null);
        setIntField(term57145, term57145.getClass(), "x", 0);
        setIntField(term57145, term57145.getClass(), "y", 0);
        setIntField(term57145, term57145.getClass(), "width", 0);
        setIntField(term57145, term57145.getClass(), "height", 0);
        setField(term57145, term57145.getClass(), "foreground", null);
        setField(term57145, term57145.getClass(), "background", null);
        setField(term57145, term57145.getClass(), "font", null);
        setField(term57145, term57145.getClass(), "peerFont", null);
        setField(term57145, term57145.getClass(), "cursor", null);
        setField(term57145, term57145.getClass(), "locale", null);
        setField(term57145, term57145.getClass(), "graphicsConfig", null);
        setField(term57145, term57145.getClass(), "bufferStrategy", null);
        setBooleanField(term57145, term57145.getClass(), "ignoreRepaint", false);
        setBooleanField(term57145, term57145.getClass(), "visible", false);
        setBooleanField(term57145, term57145.getClass(), "enabled", false);
        setBooleanField(term57145, term57145.getClass(), "valid", false);
        setField(term57145, term57145.getClass(), "dropTarget", null);
        setField(term57145, term57145.getClass(), "popups", null);
        setField(term57145, term57145.getClass(), "name", null);
        setBooleanField(term57145, term57145.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57145, term57145.getClass(), "focusable", false);
        setIntField(term57145, term57145.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57145, term57145.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57145, term57145.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57145, term57145.getClass(), "acc", null);
        setField(term57145, term57145.getClass(), "minSize", null);
        setBooleanField(term57145, term57145.getClass(), "minSizeSet", false);
        setField(term57145, term57145.getClass(), "prefSize", null);
        setBooleanField(term57145, term57145.getClass(), "prefSizeSet", false);
        setField(term57145, term57145.getClass(), "maxSize", null);
        setBooleanField(term57145, term57145.getClass(), "maxSizeSet", false);
        setField(term57145, term57145.getClass(), "componentOrientation", null);
        setBooleanField(term57145, term57145.getClass(), "newEventsOnly", false);
        setField(term57145, term57145.getClass(), "componentListener", null);
        setField(term57145, term57145.getClass(), "focusListener", null);
        setField(term57145, term57145.getClass(), "hierarchyListener", null);
        setField(term57145, term57145.getClass(), "hierarchyBoundsListener", null);
        setField(term57145, term57145.getClass(), "keyListener", null);
        setField(term57145, term57145.getClass(), "mouseListener", null);
        setField(term57145, term57145.getClass(), "mouseMotionListener", null);
        setField(term57145, term57145.getClass(), "mouseWheelListener", null);
        setField(term57145, term57145.getClass(), "inputMethodListener", null);
        setLongField(term57145, term57145.getClass(), "eventMask", 0L);
        setField(term57145, term57145.getClass(), "changeSupport", null);
        setField(term57145, term57145.getClass(), "objectLock", null);
        setBooleanField(term57145, term57145.getClass(), "isPacked", false);
        setIntField(term57145, term57145.getClass(), "boundsOp", 0);
        setField(term57145, term57145.getClass(), "compoundShape", null);
        setField(term57145, term57145.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57145, term57145.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57145, term57145.getClass(), "backgroundEraseDisabled", false);
        setField(term57145, term57145.getClass(), "eventCache", null);
        setBooleanField(term57145, term57145.getClass(), "coalescingEnabled", false);
        setBooleanField(term57145, term57145.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57145, term57145.getClass(), "componentSerializedDataVersion", 0);
        setField(term57145, term57145.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term57145, args);
    }

};


