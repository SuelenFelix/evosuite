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
     Object term9728;
     Object term9777;

    public KTextField_setText_191197925925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9728 = newInstance(Class.forName("proto.KTextField"));
        setField(term9728, term9728.getClass(), "action", null);
        setField(term9728, term9728.getClass(), "actionPropertyChangeListener", null);
        setField(term9728, term9728.getClass(), "visibility", null);
        setIntField(term9728, term9728.getClass(), "horizontalAlignment", 0);
        setIntField(term9728, term9728.getClass(), "columns", 0);
        setIntField(term9728, term9728.getClass(), "columnWidth", 0);
        setField(term9728, term9728.getClass(), "command", null);
        setField(term9728, term9728.getClass(), "model", null);
        setField(term9728, term9728.getClass(), "caret", null);
        setField(term9728, term9728.getClass(), "navigationFilter", null);
        setField(term9728, term9728.getClass(), "highlighter", null);
        setField(term9728, term9728.getClass(), "keymap", null);
        setField(term9728, term9728.getClass(), "caretEvent", null);
        setField(term9728, term9728.getClass(), "caretColor", null);
        setField(term9728, term9728.getClass(), "selectionColor", null);
        setField(term9728, term9728.getClass(), "selectedTextColor", null);
        setField(term9728, term9728.getClass(), "disabledTextColor", null);
        setBooleanField(term9728, term9728.getClass(), "editable", false);
        setField(term9728, term9728.getClass(), "margin", null);
        setCharField(term9728, term9728.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9728, term9728.getClass(), "dragEnabled", false);
        setField(term9728, term9728.getClass(), "dropMode", null);
        setField(term9728, term9728.getClass(), "dropLocation", null);
        setField(term9728, term9728.getClass(), "inputMethodRequestsHandler", null);
        setField(term9728, term9728.getClass(), "composedTextAttribute", null);
        setField(term9728, term9728.getClass(), "composedTextContent", null);
        setField(term9728, term9728.getClass(), "composedTextStart", null);
        setField(term9728, term9728.getClass(), "composedTextEnd", null);
        setField(term9728, term9728.getClass(), "latestCommittedTextStart", null);
        setField(term9728, term9728.getClass(), "latestCommittedTextEnd", null);
        setField(term9728, term9728.getClass(), "composedTextCaret", null);
        setField(term9728, term9728.getClass(), "originalCaret", null);
        setBooleanField(term9728, term9728.getClass(), "checkedInputOverride", false);
        setBooleanField(term9728, term9728.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9728, term9728.getClass(), "isAlignmentXSet", false);
        setFloatField(term9728, term9728.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9728, term9728.getClass(), "isAlignmentYSet", false);
        setFloatField(term9728, term9728.getClass(), "alignmentY", 0.0F);
        setField(term9728, term9728.getClass(), "ui", null);
        setField(term9728, term9728.getClass(), "listenerList", null);
        setField(term9728, term9728.getClass(), "clientProperties", null);
        setField(term9728, term9728.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9728, term9728.getClass(), "autoscrolls", false);
        setField(term9728, term9728.getClass(), "border", null);
        setIntField(term9728, term9728.getClass(), "flags", 0);
        setField(term9728, term9728.getClass(), "inputVerifier", null);
        setBooleanField(term9728, term9728.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9728, term9728.getClass(), "paintingChild", null);
        setField(term9728, term9728.getClass(), "popupMenu", null);
        setField(term9728, term9728.getClass(), "revalidateRunnableScheduled", null);
        setField(term9728, term9728.getClass(), "focusInputMap", null);
        setField(term9728, term9728.getClass(), "ancestorInputMap", null);
        setField(term9728, term9728.getClass(), "windowInputMap", null);
        setField(term9728, term9728.getClass(), "actionMap", null);
        setField(term9728, term9728.getClass(), "aaHint", null);
        setField(term9728, term9728.getClass(), "lcdRenderingHint", null);
        setField(term9728, term9728.getClass(), "component", null);
        setField(term9728, term9728.getClass(), "layoutMgr", null);
        setField(term9728, term9728.getClass(), "dispatcher", null);
        setField(term9728, term9728.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9728, term9728.getClass(), "focusCycleRoot", false);
        setBooleanField(term9728, term9728.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9728, term9728.getClass(), "printingThreads", null);
        setBooleanField(term9728, term9728.getClass(), "printing", false);
        setField(term9728, term9728.getClass(), "containerListener", null);
        setIntField(term9728, term9728.getClass(), "listeningChildren", 0);
        setIntField(term9728, term9728.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9728, term9728.getClass(), "descendantsCount", 0);
        setField(term9728, term9728.getClass(), "preserveBackgroundColor", null);
        setIntField(term9728, term9728.getClass(), "numOfHWComponents", 0);
        setIntField(term9728, term9728.getClass(), "numOfLWComponents", 0);
        setField(term9728, term9728.getClass(), "modalComp", null);
        setField(term9728, term9728.getClass(), "modalAppContext", null);
        setIntField(term9728, term9728.getClass(), "containerSerializedDataVersion", 0);
        setField(term9728, term9728.getClass(), "peer", null);
        setField(term9728, term9728.getClass(), "parent", null);
        setField(term9728, term9728.getClass(), "appContext", null);
        setIntField(term9728, term9728.getClass(), "x", 0);
        setIntField(term9728, term9728.getClass(), "y", 0);
        setIntField(term9728, term9728.getClass(), "width", 0);
        setIntField(term9728, term9728.getClass(), "height", 0);
        setField(term9728, term9728.getClass(), "foreground", null);
        setField(term9728, term9728.getClass(), "background", null);
        setField(term9728, term9728.getClass(), "font", null);
        setField(term9728, term9728.getClass(), "peerFont", null);
        setField(term9728, term9728.getClass(), "cursor", null);
        setField(term9728, term9728.getClass(), "locale", null);
        setField(term9728, term9728.getClass(), "graphicsConfig", null);
        setField(term9728, term9728.getClass(), "bufferStrategy", null);
        setBooleanField(term9728, term9728.getClass(), "ignoreRepaint", false);
        setBooleanField(term9728, term9728.getClass(), "visible", false);
        setBooleanField(term9728, term9728.getClass(), "enabled", false);
        setBooleanField(term9728, term9728.getClass(), "valid", false);
        setField(term9728, term9728.getClass(), "dropTarget", null);
        setField(term9728, term9728.getClass(), "popups", null);
        setField(term9728, term9728.getClass(), "name", null);
        setBooleanField(term9728, term9728.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9728, term9728.getClass(), "focusable", false);
        setIntField(term9728, term9728.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9728, term9728.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9728, term9728.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9728, term9728.getClass(), "acc", null);
        setField(term9728, term9728.getClass(), "minSize", null);
        setBooleanField(term9728, term9728.getClass(), "minSizeSet", false);
        setField(term9728, term9728.getClass(), "prefSize", null);
        setBooleanField(term9728, term9728.getClass(), "prefSizeSet", false);
        setField(term9728, term9728.getClass(), "maxSize", null);
        setBooleanField(term9728, term9728.getClass(), "maxSizeSet", false);
        setField(term9728, term9728.getClass(), "componentOrientation", null);
        setBooleanField(term9728, term9728.getClass(), "newEventsOnly", false);
        setField(term9728, term9728.getClass(), "componentListener", null);
        setField(term9728, term9728.getClass(), "focusListener", null);
        setField(term9728, term9728.getClass(), "hierarchyListener", null);
        setField(term9728, term9728.getClass(), "hierarchyBoundsListener", null);
        setField(term9728, term9728.getClass(), "keyListener", null);
        setField(term9728, term9728.getClass(), "mouseListener", null);
        setField(term9728, term9728.getClass(), "mouseMotionListener", null);
        setField(term9728, term9728.getClass(), "mouseWheelListener", null);
        setField(term9728, term9728.getClass(), "inputMethodListener", null);
        setLongField(term9728, term9728.getClass(), "eventMask", 0L);
        setField(term9728, term9728.getClass(), "changeSupport", null);
        setField(term9728, term9728.getClass(), "objectLock", null);
        setBooleanField(term9728, term9728.getClass(), "isPacked", false);
        setIntField(term9728, term9728.getClass(), "boundsOp", 0);
        setField(term9728, term9728.getClass(), "compoundShape", null);
        setField(term9728, term9728.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9728, term9728.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9728, term9728.getClass(), "backgroundEraseDisabled", false);
        setField(term9728, term9728.getClass(), "eventCache", null);
        setBooleanField(term9728, term9728.getClass(), "coalescingEnabled", false);
        setBooleanField(term9728, term9728.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9728, term9728.getClass(), "componentSerializedDataVersion", 0);
        setField(term9728, term9728.getClass(), "accessibleContext", null);
        term9777 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9777;
        callMethod(klass, "setText", argTypes, term9728, args);
    }

};


