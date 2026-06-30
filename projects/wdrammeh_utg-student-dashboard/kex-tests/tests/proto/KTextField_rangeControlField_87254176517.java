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
     Object term9320;
     Object term9369;

    public KTextField_rangeControlField_87254176517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9320 = newInstance(Class.forName("proto.KTextField"));
        setField(term9320, term9320.getClass(), "action", null);
        setField(term9320, term9320.getClass(), "actionPropertyChangeListener", null);
        setField(term9320, term9320.getClass(), "visibility", null);
        setIntField(term9320, term9320.getClass(), "horizontalAlignment", 0);
        setIntField(term9320, term9320.getClass(), "columns", 0);
        setIntField(term9320, term9320.getClass(), "columnWidth", 0);
        setField(term9320, term9320.getClass(), "command", null);
        setField(term9320, term9320.getClass(), "model", null);
        setField(term9320, term9320.getClass(), "caret", null);
        setField(term9320, term9320.getClass(), "navigationFilter", null);
        setField(term9320, term9320.getClass(), "highlighter", null);
        setField(term9320, term9320.getClass(), "keymap", null);
        setField(term9320, term9320.getClass(), "caretEvent", null);
        setField(term9320, term9320.getClass(), "caretColor", null);
        setField(term9320, term9320.getClass(), "selectionColor", null);
        setField(term9320, term9320.getClass(), "selectedTextColor", null);
        setField(term9320, term9320.getClass(), "disabledTextColor", null);
        setBooleanField(term9320, term9320.getClass(), "editable", false);
        setField(term9320, term9320.getClass(), "margin", null);
        setCharField(term9320, term9320.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9320, term9320.getClass(), "dragEnabled", false);
        setField(term9320, term9320.getClass(), "dropMode", null);
        setField(term9320, term9320.getClass(), "dropLocation", null);
        setField(term9320, term9320.getClass(), "inputMethodRequestsHandler", null);
        setField(term9320, term9320.getClass(), "composedTextAttribute", null);
        setField(term9320, term9320.getClass(), "composedTextContent", null);
        setField(term9320, term9320.getClass(), "composedTextStart", null);
        setField(term9320, term9320.getClass(), "composedTextEnd", null);
        setField(term9320, term9320.getClass(), "latestCommittedTextStart", null);
        setField(term9320, term9320.getClass(), "latestCommittedTextEnd", null);
        setField(term9320, term9320.getClass(), "composedTextCaret", null);
        setField(term9320, term9320.getClass(), "originalCaret", null);
        setBooleanField(term9320, term9320.getClass(), "checkedInputOverride", false);
        setBooleanField(term9320, term9320.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9320, term9320.getClass(), "isAlignmentXSet", false);
        setFloatField(term9320, term9320.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9320, term9320.getClass(), "isAlignmentYSet", false);
        setFloatField(term9320, term9320.getClass(), "alignmentY", 0.0F);
        setField(term9320, term9320.getClass(), "ui", null);
        setField(term9320, term9320.getClass(), "listenerList", null);
        setField(term9320, term9320.getClass(), "clientProperties", null);
        setField(term9320, term9320.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9320, term9320.getClass(), "autoscrolls", false);
        setField(term9320, term9320.getClass(), "border", null);
        setIntField(term9320, term9320.getClass(), "flags", 0);
        setField(term9320, term9320.getClass(), "inputVerifier", null);
        setBooleanField(term9320, term9320.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9320, term9320.getClass(), "paintingChild", null);
        setField(term9320, term9320.getClass(), "popupMenu", null);
        setField(term9320, term9320.getClass(), "revalidateRunnableScheduled", null);
        setField(term9320, term9320.getClass(), "focusInputMap", null);
        setField(term9320, term9320.getClass(), "ancestorInputMap", null);
        setField(term9320, term9320.getClass(), "windowInputMap", null);
        setField(term9320, term9320.getClass(), "actionMap", null);
        setField(term9320, term9320.getClass(), "aaHint", null);
        setField(term9320, term9320.getClass(), "lcdRenderingHint", null);
        setField(term9320, term9320.getClass(), "component", null);
        setField(term9320, term9320.getClass(), "layoutMgr", null);
        setField(term9320, term9320.getClass(), "dispatcher", null);
        setField(term9320, term9320.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9320, term9320.getClass(), "focusCycleRoot", false);
        setBooleanField(term9320, term9320.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9320, term9320.getClass(), "printingThreads", null);
        setBooleanField(term9320, term9320.getClass(), "printing", false);
        setField(term9320, term9320.getClass(), "containerListener", null);
        setIntField(term9320, term9320.getClass(), "listeningChildren", 0);
        setIntField(term9320, term9320.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9320, term9320.getClass(), "descendantsCount", 0);
        setField(term9320, term9320.getClass(), "preserveBackgroundColor", null);
        setIntField(term9320, term9320.getClass(), "numOfHWComponents", 0);
        setIntField(term9320, term9320.getClass(), "numOfLWComponents", 0);
        setField(term9320, term9320.getClass(), "modalComp", null);
        setField(term9320, term9320.getClass(), "modalAppContext", null);
        setIntField(term9320, term9320.getClass(), "containerSerializedDataVersion", 0);
        setField(term9320, term9320.getClass(), "peer", null);
        setField(term9320, term9320.getClass(), "parent", null);
        setField(term9320, term9320.getClass(), "appContext", null);
        setIntField(term9320, term9320.getClass(), "x", 0);
        setIntField(term9320, term9320.getClass(), "y", 0);
        setIntField(term9320, term9320.getClass(), "width", 0);
        setIntField(term9320, term9320.getClass(), "height", 0);
        setField(term9320, term9320.getClass(), "foreground", null);
        setField(term9320, term9320.getClass(), "background", null);
        setField(term9320, term9320.getClass(), "font", null);
        setField(term9320, term9320.getClass(), "peerFont", null);
        setField(term9320, term9320.getClass(), "cursor", null);
        setField(term9320, term9320.getClass(), "locale", null);
        setField(term9320, term9320.getClass(), "graphicsConfig", null);
        setField(term9320, term9320.getClass(), "bufferStrategy", null);
        setBooleanField(term9320, term9320.getClass(), "ignoreRepaint", false);
        setBooleanField(term9320, term9320.getClass(), "visible", false);
        setBooleanField(term9320, term9320.getClass(), "enabled", false);
        setBooleanField(term9320, term9320.getClass(), "valid", false);
        setField(term9320, term9320.getClass(), "dropTarget", null);
        setField(term9320, term9320.getClass(), "popups", null);
        setField(term9320, term9320.getClass(), "name", null);
        setBooleanField(term9320, term9320.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9320, term9320.getClass(), "focusable", false);
        setIntField(term9320, term9320.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9320, term9320.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9320, term9320.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9320, term9320.getClass(), "acc", null);
        setField(term9320, term9320.getClass(), "minSize", null);
        setBooleanField(term9320, term9320.getClass(), "minSizeSet", false);
        setField(term9320, term9320.getClass(), "prefSize", null);
        setBooleanField(term9320, term9320.getClass(), "prefSizeSet", false);
        setField(term9320, term9320.getClass(), "maxSize", null);
        setBooleanField(term9320, term9320.getClass(), "maxSizeSet", false);
        setField(term9320, term9320.getClass(), "componentOrientation", null);
        setBooleanField(term9320, term9320.getClass(), "newEventsOnly", false);
        setField(term9320, term9320.getClass(), "componentListener", null);
        setField(term9320, term9320.getClass(), "focusListener", null);
        setField(term9320, term9320.getClass(), "hierarchyListener", null);
        setField(term9320, term9320.getClass(), "hierarchyBoundsListener", null);
        setField(term9320, term9320.getClass(), "keyListener", null);
        setField(term9320, term9320.getClass(), "mouseListener", null);
        setField(term9320, term9320.getClass(), "mouseMotionListener", null);
        setField(term9320, term9320.getClass(), "mouseWheelListener", null);
        setField(term9320, term9320.getClass(), "inputMethodListener", null);
        setLongField(term9320, term9320.getClass(), "eventMask", 0L);
        setField(term9320, term9320.getClass(), "changeSupport", null);
        setField(term9320, term9320.getClass(), "objectLock", null);
        setBooleanField(term9320, term9320.getClass(), "isPacked", false);
        setIntField(term9320, term9320.getClass(), "boundsOp", 0);
        setField(term9320, term9320.getClass(), "compoundShape", null);
        setField(term9320, term9320.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9320, term9320.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9320, term9320.getClass(), "backgroundEraseDisabled", false);
        setField(term9320, term9320.getClass(), "eventCache", null);
        setBooleanField(term9320, term9320.getClass(), "coalescingEnabled", false);
        setBooleanField(term9320, term9320.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9320, term9320.getClass(), "componentSerializedDataVersion", 0);
        setField(term9320, term9320.getClass(), "accessibleContext", null);
        term9369 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9369;
        callMethod(klass, "rangeControlField", argTypes, term9320, args);
    }

};


