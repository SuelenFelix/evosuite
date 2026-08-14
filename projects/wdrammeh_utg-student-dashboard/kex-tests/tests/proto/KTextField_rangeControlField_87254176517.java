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

public class KTextField_rangeControlField_87254176517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9332;
     Object term9381;

    public KTextField_rangeControlField_87254176517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9332 = newInstance(Class.forName("proto.KTextField"));
        setField(term9332, term9332.getClass(), "action", null);
        setField(term9332, term9332.getClass(), "actionPropertyChangeListener", null);
        setField(term9332, term9332.getClass(), "visibility", null);
        setIntField(term9332, term9332.getClass(), "horizontalAlignment", 0);
        setIntField(term9332, term9332.getClass(), "columns", 0);
        setIntField(term9332, term9332.getClass(), "columnWidth", 0);
        setField(term9332, term9332.getClass(), "command", null);
        setField(term9332, term9332.getClass(), "model", null);
        setField(term9332, term9332.getClass(), "caret", null);
        setField(term9332, term9332.getClass(), "navigationFilter", null);
        setField(term9332, term9332.getClass(), "highlighter", null);
        setField(term9332, term9332.getClass(), "keymap", null);
        setField(term9332, term9332.getClass(), "caretEvent", null);
        setField(term9332, term9332.getClass(), "caretColor", null);
        setField(term9332, term9332.getClass(), "selectionColor", null);
        setField(term9332, term9332.getClass(), "selectedTextColor", null);
        setField(term9332, term9332.getClass(), "disabledTextColor", null);
        setBooleanField(term9332, term9332.getClass(), "editable", false);
        setField(term9332, term9332.getClass(), "margin", null);
        setCharField(term9332, term9332.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9332, term9332.getClass(), "dragEnabled", false);
        setField(term9332, term9332.getClass(), "dropMode", null);
        setField(term9332, term9332.getClass(), "dropLocation", null);
        setField(term9332, term9332.getClass(), "inputMethodRequestsHandler", null);
        setField(term9332, term9332.getClass(), "composedTextAttribute", null);
        setField(term9332, term9332.getClass(), "composedTextContent", null);
        setField(term9332, term9332.getClass(), "composedTextStart", null);
        setField(term9332, term9332.getClass(), "composedTextEnd", null);
        setField(term9332, term9332.getClass(), "latestCommittedTextStart", null);
        setField(term9332, term9332.getClass(), "latestCommittedTextEnd", null);
        setField(term9332, term9332.getClass(), "composedTextCaret", null);
        setField(term9332, term9332.getClass(), "originalCaret", null);
        setBooleanField(term9332, term9332.getClass(), "checkedInputOverride", false);
        setBooleanField(term9332, term9332.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9332, term9332.getClass(), "isAlignmentXSet", false);
        setFloatField(term9332, term9332.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9332, term9332.getClass(), "isAlignmentYSet", false);
        setFloatField(term9332, term9332.getClass(), "alignmentY", 0.0F);
        setField(term9332, term9332.getClass(), "ui", null);
        setField(term9332, term9332.getClass(), "listenerList", null);
        setField(term9332, term9332.getClass(), "clientProperties", null);
        setField(term9332, term9332.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9332, term9332.getClass(), "autoscrolls", false);
        setField(term9332, term9332.getClass(), "border", null);
        setIntField(term9332, term9332.getClass(), "flags", 0);
        setField(term9332, term9332.getClass(), "inputVerifier", null);
        setBooleanField(term9332, term9332.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9332, term9332.getClass(), "paintingChild", null);
        setField(term9332, term9332.getClass(), "popupMenu", null);
        setField(term9332, term9332.getClass(), "revalidateRunnableScheduled", null);
        setField(term9332, term9332.getClass(), "focusInputMap", null);
        setField(term9332, term9332.getClass(), "ancestorInputMap", null);
        setField(term9332, term9332.getClass(), "windowInputMap", null);
        setField(term9332, term9332.getClass(), "actionMap", null);
        setField(term9332, term9332.getClass(), "aaHint", null);
        setField(term9332, term9332.getClass(), "lcdRenderingHint", null);
        setField(term9332, term9332.getClass(), "component", null);
        setField(term9332, term9332.getClass(), "layoutMgr", null);
        setField(term9332, term9332.getClass(), "dispatcher", null);
        setField(term9332, term9332.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9332, term9332.getClass(), "focusCycleRoot", false);
        setBooleanField(term9332, term9332.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9332, term9332.getClass(), "printingThreads", null);
        setBooleanField(term9332, term9332.getClass(), "printing", false);
        setField(term9332, term9332.getClass(), "containerListener", null);
        setIntField(term9332, term9332.getClass(), "listeningChildren", 0);
        setIntField(term9332, term9332.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9332, term9332.getClass(), "descendantsCount", 0);
        setField(term9332, term9332.getClass(), "preserveBackgroundColor", null);
        setIntField(term9332, term9332.getClass(), "numOfHWComponents", 0);
        setIntField(term9332, term9332.getClass(), "numOfLWComponents", 0);
        setField(term9332, term9332.getClass(), "modalComp", null);
        setField(term9332, term9332.getClass(), "modalAppContext", null);
        setIntField(term9332, term9332.getClass(), "containerSerializedDataVersion", 0);
        setField(term9332, term9332.getClass(), "peer", null);
        setField(term9332, term9332.getClass(), "parent", null);
        setField(term9332, term9332.getClass(), "appContext", null);
        setIntField(term9332, term9332.getClass(), "x", 0);
        setIntField(term9332, term9332.getClass(), "y", 0);
        setIntField(term9332, term9332.getClass(), "width", 0);
        setIntField(term9332, term9332.getClass(), "height", 0);
        setField(term9332, term9332.getClass(), "foreground", null);
        setField(term9332, term9332.getClass(), "background", null);
        setField(term9332, term9332.getClass(), "font", null);
        setField(term9332, term9332.getClass(), "peerFont", null);
        setField(term9332, term9332.getClass(), "cursor", null);
        setField(term9332, term9332.getClass(), "locale", null);
        setField(term9332, term9332.getClass(), "graphicsConfig", null);
        setField(term9332, term9332.getClass(), "bufferStrategy", null);
        setBooleanField(term9332, term9332.getClass(), "ignoreRepaint", false);
        setBooleanField(term9332, term9332.getClass(), "visible", false);
        setBooleanField(term9332, term9332.getClass(), "enabled", false);
        setBooleanField(term9332, term9332.getClass(), "valid", false);
        setField(term9332, term9332.getClass(), "dropTarget", null);
        setField(term9332, term9332.getClass(), "popups", null);
        setField(term9332, term9332.getClass(), "name", null);
        setBooleanField(term9332, term9332.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9332, term9332.getClass(), "focusable", false);
        setIntField(term9332, term9332.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9332, term9332.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9332, term9332.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9332, term9332.getClass(), "acc", null);
        setField(term9332, term9332.getClass(), "minSize", null);
        setBooleanField(term9332, term9332.getClass(), "minSizeSet", false);
        setField(term9332, term9332.getClass(), "prefSize", null);
        setBooleanField(term9332, term9332.getClass(), "prefSizeSet", false);
        setField(term9332, term9332.getClass(), "maxSize", null);
        setBooleanField(term9332, term9332.getClass(), "maxSizeSet", false);
        setField(term9332, term9332.getClass(), "componentOrientation", null);
        setBooleanField(term9332, term9332.getClass(), "newEventsOnly", false);
        setField(term9332, term9332.getClass(), "componentListener", null);
        setField(term9332, term9332.getClass(), "focusListener", null);
        setField(term9332, term9332.getClass(), "hierarchyListener", null);
        setField(term9332, term9332.getClass(), "hierarchyBoundsListener", null);
        setField(term9332, term9332.getClass(), "keyListener", null);
        setField(term9332, term9332.getClass(), "mouseListener", null);
        setField(term9332, term9332.getClass(), "mouseMotionListener", null);
        setField(term9332, term9332.getClass(), "mouseWheelListener", null);
        setField(term9332, term9332.getClass(), "inputMethodListener", null);
        setLongField(term9332, term9332.getClass(), "eventMask", 0L);
        setField(term9332, term9332.getClass(), "changeSupport", null);
        setField(term9332, term9332.getClass(), "objectLock", null);
        setBooleanField(term9332, term9332.getClass(), "isPacked", false);
        setIntField(term9332, term9332.getClass(), "boundsOp", 0);
        setField(term9332, term9332.getClass(), "compoundShape", null);
        setField(term9332, term9332.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9332, term9332.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9332, term9332.getClass(), "backgroundEraseDisabled", false);
        setField(term9332, term9332.getClass(), "eventCache", null);
        setBooleanField(term9332, term9332.getClass(), "coalescingEnabled", false);
        setBooleanField(term9332, term9332.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9332, term9332.getClass(), "componentSerializedDataVersion", 0);
        setField(term9332, term9332.getClass(), "accessibleContext", null);
        term9381 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9381;
        callMethod(klass, "rangeControlField", argTypes, term9332, args);
    }

};


