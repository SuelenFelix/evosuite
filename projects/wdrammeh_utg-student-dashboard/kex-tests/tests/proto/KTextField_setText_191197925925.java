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

public class KTextField_setText_191197925925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9716;
     Object term9765;

    public KTextField_setText_191197925925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9716 = newInstance(Class.forName("proto.KTextField"));
        setField(term9716, term9716.getClass(), "action", null);
        setField(term9716, term9716.getClass(), "actionPropertyChangeListener", null);
        setField(term9716, term9716.getClass(), "visibility", null);
        setIntField(term9716, term9716.getClass(), "horizontalAlignment", 0);
        setIntField(term9716, term9716.getClass(), "columns", 0);
        setIntField(term9716, term9716.getClass(), "columnWidth", 0);
        setField(term9716, term9716.getClass(), "command", null);
        setField(term9716, term9716.getClass(), "model", null);
        setField(term9716, term9716.getClass(), "caret", null);
        setField(term9716, term9716.getClass(), "navigationFilter", null);
        setField(term9716, term9716.getClass(), "highlighter", null);
        setField(term9716, term9716.getClass(), "keymap", null);
        setField(term9716, term9716.getClass(), "caretEvent", null);
        setField(term9716, term9716.getClass(), "caretColor", null);
        setField(term9716, term9716.getClass(), "selectionColor", null);
        setField(term9716, term9716.getClass(), "selectedTextColor", null);
        setField(term9716, term9716.getClass(), "disabledTextColor", null);
        setBooleanField(term9716, term9716.getClass(), "editable", false);
        setField(term9716, term9716.getClass(), "margin", null);
        setCharField(term9716, term9716.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9716, term9716.getClass(), "dragEnabled", false);
        setField(term9716, term9716.getClass(), "dropMode", null);
        setField(term9716, term9716.getClass(), "dropLocation", null);
        setField(term9716, term9716.getClass(), "inputMethodRequestsHandler", null);
        setField(term9716, term9716.getClass(), "composedTextAttribute", null);
        setField(term9716, term9716.getClass(), "composedTextContent", null);
        setField(term9716, term9716.getClass(), "composedTextStart", null);
        setField(term9716, term9716.getClass(), "composedTextEnd", null);
        setField(term9716, term9716.getClass(), "latestCommittedTextStart", null);
        setField(term9716, term9716.getClass(), "latestCommittedTextEnd", null);
        setField(term9716, term9716.getClass(), "composedTextCaret", null);
        setField(term9716, term9716.getClass(), "originalCaret", null);
        setBooleanField(term9716, term9716.getClass(), "checkedInputOverride", false);
        setBooleanField(term9716, term9716.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9716, term9716.getClass(), "isAlignmentXSet", false);
        setFloatField(term9716, term9716.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9716, term9716.getClass(), "isAlignmentYSet", false);
        setFloatField(term9716, term9716.getClass(), "alignmentY", 0.0F);
        setField(term9716, term9716.getClass(), "ui", null);
        setField(term9716, term9716.getClass(), "listenerList", null);
        setField(term9716, term9716.getClass(), "clientProperties", null);
        setField(term9716, term9716.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9716, term9716.getClass(), "autoscrolls", false);
        setField(term9716, term9716.getClass(), "border", null);
        setIntField(term9716, term9716.getClass(), "flags", 0);
        setField(term9716, term9716.getClass(), "inputVerifier", null);
        setBooleanField(term9716, term9716.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9716, term9716.getClass(), "paintingChild", null);
        setField(term9716, term9716.getClass(), "popupMenu", null);
        setField(term9716, term9716.getClass(), "revalidateRunnableScheduled", null);
        setField(term9716, term9716.getClass(), "focusInputMap", null);
        setField(term9716, term9716.getClass(), "ancestorInputMap", null);
        setField(term9716, term9716.getClass(), "windowInputMap", null);
        setField(term9716, term9716.getClass(), "actionMap", null);
        setField(term9716, term9716.getClass(), "aaHint", null);
        setField(term9716, term9716.getClass(), "lcdRenderingHint", null);
        setField(term9716, term9716.getClass(), "component", null);
        setField(term9716, term9716.getClass(), "layoutMgr", null);
        setField(term9716, term9716.getClass(), "dispatcher", null);
        setField(term9716, term9716.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9716, term9716.getClass(), "focusCycleRoot", false);
        setBooleanField(term9716, term9716.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9716, term9716.getClass(), "printingThreads", null);
        setBooleanField(term9716, term9716.getClass(), "printing", false);
        setField(term9716, term9716.getClass(), "containerListener", null);
        setIntField(term9716, term9716.getClass(), "listeningChildren", 0);
        setIntField(term9716, term9716.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9716, term9716.getClass(), "descendantsCount", 0);
        setField(term9716, term9716.getClass(), "preserveBackgroundColor", null);
        setIntField(term9716, term9716.getClass(), "numOfHWComponents", 0);
        setIntField(term9716, term9716.getClass(), "numOfLWComponents", 0);
        setField(term9716, term9716.getClass(), "modalComp", null);
        setField(term9716, term9716.getClass(), "modalAppContext", null);
        setIntField(term9716, term9716.getClass(), "containerSerializedDataVersion", 0);
        setField(term9716, term9716.getClass(), "peer", null);
        setField(term9716, term9716.getClass(), "parent", null);
        setField(term9716, term9716.getClass(), "appContext", null);
        setIntField(term9716, term9716.getClass(), "x", 0);
        setIntField(term9716, term9716.getClass(), "y", 0);
        setIntField(term9716, term9716.getClass(), "width", 0);
        setIntField(term9716, term9716.getClass(), "height", 0);
        setField(term9716, term9716.getClass(), "foreground", null);
        setField(term9716, term9716.getClass(), "background", null);
        setField(term9716, term9716.getClass(), "font", null);
        setField(term9716, term9716.getClass(), "peerFont", null);
        setField(term9716, term9716.getClass(), "cursor", null);
        setField(term9716, term9716.getClass(), "locale", null);
        setField(term9716, term9716.getClass(), "graphicsConfig", null);
        setField(term9716, term9716.getClass(), "bufferStrategy", null);
        setBooleanField(term9716, term9716.getClass(), "ignoreRepaint", false);
        setBooleanField(term9716, term9716.getClass(), "visible", false);
        setBooleanField(term9716, term9716.getClass(), "enabled", false);
        setBooleanField(term9716, term9716.getClass(), "valid", false);
        setField(term9716, term9716.getClass(), "dropTarget", null);
        setField(term9716, term9716.getClass(), "popups", null);
        setField(term9716, term9716.getClass(), "name", null);
        setBooleanField(term9716, term9716.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9716, term9716.getClass(), "focusable", false);
        setIntField(term9716, term9716.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9716, term9716.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9716, term9716.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9716, term9716.getClass(), "acc", null);
        setField(term9716, term9716.getClass(), "minSize", null);
        setBooleanField(term9716, term9716.getClass(), "minSizeSet", false);
        setField(term9716, term9716.getClass(), "prefSize", null);
        setBooleanField(term9716, term9716.getClass(), "prefSizeSet", false);
        setField(term9716, term9716.getClass(), "maxSize", null);
        setBooleanField(term9716, term9716.getClass(), "maxSizeSet", false);
        setField(term9716, term9716.getClass(), "componentOrientation", null);
        setBooleanField(term9716, term9716.getClass(), "newEventsOnly", false);
        setField(term9716, term9716.getClass(), "componentListener", null);
        setField(term9716, term9716.getClass(), "focusListener", null);
        setField(term9716, term9716.getClass(), "hierarchyListener", null);
        setField(term9716, term9716.getClass(), "hierarchyBoundsListener", null);
        setField(term9716, term9716.getClass(), "keyListener", null);
        setField(term9716, term9716.getClass(), "mouseListener", null);
        setField(term9716, term9716.getClass(), "mouseMotionListener", null);
        setField(term9716, term9716.getClass(), "mouseWheelListener", null);
        setField(term9716, term9716.getClass(), "inputMethodListener", null);
        setLongField(term9716, term9716.getClass(), "eventMask", 0L);
        setField(term9716, term9716.getClass(), "changeSupport", null);
        setField(term9716, term9716.getClass(), "objectLock", null);
        setBooleanField(term9716, term9716.getClass(), "isPacked", false);
        setIntField(term9716, term9716.getClass(), "boundsOp", 0);
        setField(term9716, term9716.getClass(), "compoundShape", null);
        setField(term9716, term9716.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9716, term9716.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9716, term9716.getClass(), "backgroundEraseDisabled", false);
        setField(term9716, term9716.getClass(), "eventCache", null);
        setBooleanField(term9716, term9716.getClass(), "coalescingEnabled", false);
        setBooleanField(term9716, term9716.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9716, term9716.getClass(), "componentSerializedDataVersion", 0);
        setField(term9716, term9716.getClass(), "accessibleContext", null);
        term9765 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9765;
        callMethod(klass, "setText", argTypes, term9716, args);
    }

};


