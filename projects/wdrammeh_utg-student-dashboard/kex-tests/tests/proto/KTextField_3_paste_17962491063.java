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

public class KTextField_3_paste_17962491063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43406;

    public KTextField_3_paste_17962491063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43406 = newInstance(Class.forName("proto.KTextField$3"));
        setField(term43406, term43406.getClass(), "action", null);
        setField(term43406, term43406.getClass(), "actionPropertyChangeListener", null);
        setField(term43406, term43406.getClass(), "visibility", null);
        setIntField(term43406, term43406.getClass(), "horizontalAlignment", 0);
        setIntField(term43406, term43406.getClass(), "columns", 0);
        setIntField(term43406, term43406.getClass(), "columnWidth", 0);
        setField(term43406, term43406.getClass(), "command", null);
        setField(term43406, term43406.getClass(), "model", null);
        setField(term43406, term43406.getClass(), "caret", null);
        setField(term43406, term43406.getClass(), "navigationFilter", null);
        setField(term43406, term43406.getClass(), "highlighter", null);
        setField(term43406, term43406.getClass(), "keymap", null);
        setField(term43406, term43406.getClass(), "caretEvent", null);
        setField(term43406, term43406.getClass(), "caretColor", null);
        setField(term43406, term43406.getClass(), "selectionColor", null);
        setField(term43406, term43406.getClass(), "selectedTextColor", null);
        setField(term43406, term43406.getClass(), "disabledTextColor", null);
        setBooleanField(term43406, term43406.getClass(), "editable", false);
        setField(term43406, term43406.getClass(), "margin", null);
        setCharField(term43406, term43406.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term43406, term43406.getClass(), "dragEnabled", false);
        setField(term43406, term43406.getClass(), "dropMode", null);
        setField(term43406, term43406.getClass(), "dropLocation", null);
        setField(term43406, term43406.getClass(), "inputMethodRequestsHandler", null);
        setField(term43406, term43406.getClass(), "composedTextAttribute", null);
        setField(term43406, term43406.getClass(), "composedTextContent", null);
        setField(term43406, term43406.getClass(), "composedTextStart", null);
        setField(term43406, term43406.getClass(), "composedTextEnd", null);
        setField(term43406, term43406.getClass(), "latestCommittedTextStart", null);
        setField(term43406, term43406.getClass(), "latestCommittedTextEnd", null);
        setField(term43406, term43406.getClass(), "composedTextCaret", null);
        setField(term43406, term43406.getClass(), "originalCaret", null);
        setBooleanField(term43406, term43406.getClass(), "checkedInputOverride", false);
        setBooleanField(term43406, term43406.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term43406, term43406.getClass(), "isAlignmentXSet", false);
        setFloatField(term43406, term43406.getClass(), "alignmentX", 0.0F);
        setBooleanField(term43406, term43406.getClass(), "isAlignmentYSet", false);
        setFloatField(term43406, term43406.getClass(), "alignmentY", 0.0F);
        setField(term43406, term43406.getClass(), "ui", null);
        setField(term43406, term43406.getClass(), "listenerList", null);
        setField(term43406, term43406.getClass(), "clientProperties", null);
        setField(term43406, term43406.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term43406, term43406.getClass(), "autoscrolls", false);
        setField(term43406, term43406.getClass(), "border", null);
        setIntField(term43406, term43406.getClass(), "flags", 0);
        setField(term43406, term43406.getClass(), "inputVerifier", null);
        setBooleanField(term43406, term43406.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term43406, term43406.getClass(), "paintingChild", null);
        setField(term43406, term43406.getClass(), "popupMenu", null);
        setField(term43406, term43406.getClass(), "revalidateRunnableScheduled", null);
        setField(term43406, term43406.getClass(), "focusInputMap", null);
        setField(term43406, term43406.getClass(), "ancestorInputMap", null);
        setField(term43406, term43406.getClass(), "windowInputMap", null);
        setField(term43406, term43406.getClass(), "actionMap", null);
        setField(term43406, term43406.getClass(), "aaHint", null);
        setField(term43406, term43406.getClass(), "lcdRenderingHint", null);
        setField(term43406, term43406.getClass(), "component", null);
        setField(term43406, term43406.getClass(), "layoutMgr", null);
        setField(term43406, term43406.getClass(), "dispatcher", null);
        setField(term43406, term43406.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term43406, term43406.getClass(), "focusCycleRoot", false);
        setBooleanField(term43406, term43406.getClass(), "focusTraversalPolicyProvider", false);
        setField(term43406, term43406.getClass(), "printingThreads", null);
        setBooleanField(term43406, term43406.getClass(), "printing", false);
        setField(term43406, term43406.getClass(), "containerListener", null);
        setIntField(term43406, term43406.getClass(), "listeningChildren", 0);
        setIntField(term43406, term43406.getClass(), "listeningBoundsChildren", 0);
        setIntField(term43406, term43406.getClass(), "descendantsCount", 0);
        setField(term43406, term43406.getClass(), "preserveBackgroundColor", null);
        setIntField(term43406, term43406.getClass(), "numOfHWComponents", 0);
        setIntField(term43406, term43406.getClass(), "numOfLWComponents", 0);
        setField(term43406, term43406.getClass(), "modalComp", null);
        setField(term43406, term43406.getClass(), "modalAppContext", null);
        setIntField(term43406, term43406.getClass(), "containerSerializedDataVersion", 0);
        setField(term43406, term43406.getClass(), "peer", null);
        setField(term43406, term43406.getClass(), "parent", null);
        setField(term43406, term43406.getClass(), "appContext", null);
        setIntField(term43406, term43406.getClass(), "x", 0);
        setIntField(term43406, term43406.getClass(), "y", 0);
        setIntField(term43406, term43406.getClass(), "width", 0);
        setIntField(term43406, term43406.getClass(), "height", 0);
        setField(term43406, term43406.getClass(), "foreground", null);
        setField(term43406, term43406.getClass(), "background", null);
        setField(term43406, term43406.getClass(), "font", null);
        setField(term43406, term43406.getClass(), "peerFont", null);
        setField(term43406, term43406.getClass(), "cursor", null);
        setField(term43406, term43406.getClass(), "locale", null);
        setField(term43406, term43406.getClass(), "graphicsConfig", null);
        setField(term43406, term43406.getClass(), "bufferStrategy", null);
        setBooleanField(term43406, term43406.getClass(), "ignoreRepaint", false);
        setBooleanField(term43406, term43406.getClass(), "visible", false);
        setBooleanField(term43406, term43406.getClass(), "enabled", false);
        setBooleanField(term43406, term43406.getClass(), "valid", false);
        setField(term43406, term43406.getClass(), "dropTarget", null);
        setField(term43406, term43406.getClass(), "popups", null);
        setField(term43406, term43406.getClass(), "name", null);
        setBooleanField(term43406, term43406.getClass(), "nameExplicitlySet", false);
        setBooleanField(term43406, term43406.getClass(), "focusable", false);
        setIntField(term43406, term43406.getClass(), "isFocusTraversableOverridden", 0);
        setField(term43406, term43406.getClass(), "focusTraversalKeys", null);
        setBooleanField(term43406, term43406.getClass(), "focusTraversalKeysEnabled", false);
        setField(term43406, term43406.getClass(), "acc", null);
        setField(term43406, term43406.getClass(), "minSize", null);
        setBooleanField(term43406, term43406.getClass(), "minSizeSet", false);
        setField(term43406, term43406.getClass(), "prefSize", null);
        setBooleanField(term43406, term43406.getClass(), "prefSizeSet", false);
        setField(term43406, term43406.getClass(), "maxSize", null);
        setBooleanField(term43406, term43406.getClass(), "maxSizeSet", false);
        setField(term43406, term43406.getClass(), "componentOrientation", null);
        setBooleanField(term43406, term43406.getClass(), "newEventsOnly", false);
        setField(term43406, term43406.getClass(), "componentListener", null);
        setField(term43406, term43406.getClass(), "focusListener", null);
        setField(term43406, term43406.getClass(), "hierarchyListener", null);
        setField(term43406, term43406.getClass(), "hierarchyBoundsListener", null);
        setField(term43406, term43406.getClass(), "keyListener", null);
        setField(term43406, term43406.getClass(), "mouseListener", null);
        setField(term43406, term43406.getClass(), "mouseMotionListener", null);
        setField(term43406, term43406.getClass(), "mouseWheelListener", null);
        setField(term43406, term43406.getClass(), "inputMethodListener", null);
        setLongField(term43406, term43406.getClass(), "eventMask", 0L);
        setField(term43406, term43406.getClass(), "changeSupport", null);
        setField(term43406, term43406.getClass(), "objectLock", null);
        setBooleanField(term43406, term43406.getClass(), "isPacked", false);
        setIntField(term43406, term43406.getClass(), "boundsOp", 0);
        setField(term43406, term43406.getClass(), "compoundShape", null);
        setField(term43406, term43406.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term43406, term43406.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term43406, term43406.getClass(), "backgroundEraseDisabled", false);
        setField(term43406, term43406.getClass(), "eventCache", null);
        setBooleanField(term43406, term43406.getClass(), "coalescingEnabled", false);
        setBooleanField(term43406, term43406.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term43406, term43406.getClass(), "componentSerializedDataVersion", 0);
        setField(term43406, term43406.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField$3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paste", argTypes, term43406, args);
    }

};


