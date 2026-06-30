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

public class KTextField_1_paste_17962491683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47654;

    public KTextField_1_paste_17962491683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47654 = newInstance(Class.forName("proto.KTextField$1"));
        setField(term47654, term47654.getClass(), "action", null);
        setField(term47654, term47654.getClass(), "actionPropertyChangeListener", null);
        setField(term47654, term47654.getClass(), "visibility", null);
        setIntField(term47654, term47654.getClass(), "horizontalAlignment", 0);
        setIntField(term47654, term47654.getClass(), "columns", 0);
        setIntField(term47654, term47654.getClass(), "columnWidth", 0);
        setField(term47654, term47654.getClass(), "command", null);
        setField(term47654, term47654.getClass(), "model", null);
        setField(term47654, term47654.getClass(), "caret", null);
        setField(term47654, term47654.getClass(), "navigationFilter", null);
        setField(term47654, term47654.getClass(), "highlighter", null);
        setField(term47654, term47654.getClass(), "keymap", null);
        setField(term47654, term47654.getClass(), "caretEvent", null);
        setField(term47654, term47654.getClass(), "caretColor", null);
        setField(term47654, term47654.getClass(), "selectionColor", null);
        setField(term47654, term47654.getClass(), "selectedTextColor", null);
        setField(term47654, term47654.getClass(), "disabledTextColor", null);
        setBooleanField(term47654, term47654.getClass(), "editable", false);
        setField(term47654, term47654.getClass(), "margin", null);
        setCharField(term47654, term47654.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term47654, term47654.getClass(), "dragEnabled", false);
        setField(term47654, term47654.getClass(), "dropMode", null);
        setField(term47654, term47654.getClass(), "dropLocation", null);
        setField(term47654, term47654.getClass(), "inputMethodRequestsHandler", null);
        setField(term47654, term47654.getClass(), "composedTextAttribute", null);
        setField(term47654, term47654.getClass(), "composedTextContent", null);
        setField(term47654, term47654.getClass(), "composedTextStart", null);
        setField(term47654, term47654.getClass(), "composedTextEnd", null);
        setField(term47654, term47654.getClass(), "latestCommittedTextStart", null);
        setField(term47654, term47654.getClass(), "latestCommittedTextEnd", null);
        setField(term47654, term47654.getClass(), "composedTextCaret", null);
        setField(term47654, term47654.getClass(), "originalCaret", null);
        setBooleanField(term47654, term47654.getClass(), "checkedInputOverride", false);
        setBooleanField(term47654, term47654.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term47654, term47654.getClass(), "isAlignmentXSet", false);
        setFloatField(term47654, term47654.getClass(), "alignmentX", 0.0F);
        setBooleanField(term47654, term47654.getClass(), "isAlignmentYSet", false);
        setFloatField(term47654, term47654.getClass(), "alignmentY", 0.0F);
        setField(term47654, term47654.getClass(), "ui", null);
        setField(term47654, term47654.getClass(), "listenerList", null);
        setField(term47654, term47654.getClass(), "clientProperties", null);
        setField(term47654, term47654.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term47654, term47654.getClass(), "autoscrolls", false);
        setField(term47654, term47654.getClass(), "border", null);
        setIntField(term47654, term47654.getClass(), "flags", 0);
        setField(term47654, term47654.getClass(), "inputVerifier", null);
        setBooleanField(term47654, term47654.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term47654, term47654.getClass(), "paintingChild", null);
        setField(term47654, term47654.getClass(), "popupMenu", null);
        setField(term47654, term47654.getClass(), "revalidateRunnableScheduled", null);
        setField(term47654, term47654.getClass(), "focusInputMap", null);
        setField(term47654, term47654.getClass(), "ancestorInputMap", null);
        setField(term47654, term47654.getClass(), "windowInputMap", null);
        setField(term47654, term47654.getClass(), "actionMap", null);
        setField(term47654, term47654.getClass(), "aaHint", null);
        setField(term47654, term47654.getClass(), "lcdRenderingHint", null);
        setField(term47654, term47654.getClass(), "component", null);
        setField(term47654, term47654.getClass(), "layoutMgr", null);
        setField(term47654, term47654.getClass(), "dispatcher", null);
        setField(term47654, term47654.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term47654, term47654.getClass(), "focusCycleRoot", false);
        setBooleanField(term47654, term47654.getClass(), "focusTraversalPolicyProvider", false);
        setField(term47654, term47654.getClass(), "printingThreads", null);
        setBooleanField(term47654, term47654.getClass(), "printing", false);
        setField(term47654, term47654.getClass(), "containerListener", null);
        setIntField(term47654, term47654.getClass(), "listeningChildren", 0);
        setIntField(term47654, term47654.getClass(), "listeningBoundsChildren", 0);
        setIntField(term47654, term47654.getClass(), "descendantsCount", 0);
        setField(term47654, term47654.getClass(), "preserveBackgroundColor", null);
        setIntField(term47654, term47654.getClass(), "numOfHWComponents", 0);
        setIntField(term47654, term47654.getClass(), "numOfLWComponents", 0);
        setField(term47654, term47654.getClass(), "modalComp", null);
        setField(term47654, term47654.getClass(), "modalAppContext", null);
        setIntField(term47654, term47654.getClass(), "containerSerializedDataVersion", 0);
        setField(term47654, term47654.getClass(), "peer", null);
        setField(term47654, term47654.getClass(), "parent", null);
        setField(term47654, term47654.getClass(), "appContext", null);
        setIntField(term47654, term47654.getClass(), "x", 0);
        setIntField(term47654, term47654.getClass(), "y", 0);
        setIntField(term47654, term47654.getClass(), "width", 0);
        setIntField(term47654, term47654.getClass(), "height", 0);
        setField(term47654, term47654.getClass(), "foreground", null);
        setField(term47654, term47654.getClass(), "background", null);
        setField(term47654, term47654.getClass(), "font", null);
        setField(term47654, term47654.getClass(), "peerFont", null);
        setField(term47654, term47654.getClass(), "cursor", null);
        setField(term47654, term47654.getClass(), "locale", null);
        setField(term47654, term47654.getClass(), "graphicsConfig", null);
        setField(term47654, term47654.getClass(), "bufferStrategy", null);
        setBooleanField(term47654, term47654.getClass(), "ignoreRepaint", false);
        setBooleanField(term47654, term47654.getClass(), "visible", false);
        setBooleanField(term47654, term47654.getClass(), "enabled", false);
        setBooleanField(term47654, term47654.getClass(), "valid", false);
        setField(term47654, term47654.getClass(), "dropTarget", null);
        setField(term47654, term47654.getClass(), "popups", null);
        setField(term47654, term47654.getClass(), "name", null);
        setBooleanField(term47654, term47654.getClass(), "nameExplicitlySet", false);
        setBooleanField(term47654, term47654.getClass(), "focusable", false);
        setIntField(term47654, term47654.getClass(), "isFocusTraversableOverridden", 0);
        setField(term47654, term47654.getClass(), "focusTraversalKeys", null);
        setBooleanField(term47654, term47654.getClass(), "focusTraversalKeysEnabled", false);
        setField(term47654, term47654.getClass(), "acc", null);
        setField(term47654, term47654.getClass(), "minSize", null);
        setBooleanField(term47654, term47654.getClass(), "minSizeSet", false);
        setField(term47654, term47654.getClass(), "prefSize", null);
        setBooleanField(term47654, term47654.getClass(), "prefSizeSet", false);
        setField(term47654, term47654.getClass(), "maxSize", null);
        setBooleanField(term47654, term47654.getClass(), "maxSizeSet", false);
        setField(term47654, term47654.getClass(), "componentOrientation", null);
        setBooleanField(term47654, term47654.getClass(), "newEventsOnly", false);
        setField(term47654, term47654.getClass(), "componentListener", null);
        setField(term47654, term47654.getClass(), "focusListener", null);
        setField(term47654, term47654.getClass(), "hierarchyListener", null);
        setField(term47654, term47654.getClass(), "hierarchyBoundsListener", null);
        setField(term47654, term47654.getClass(), "keyListener", null);
        setField(term47654, term47654.getClass(), "mouseListener", null);
        setField(term47654, term47654.getClass(), "mouseMotionListener", null);
        setField(term47654, term47654.getClass(), "mouseWheelListener", null);
        setField(term47654, term47654.getClass(), "inputMethodListener", null);
        setLongField(term47654, term47654.getClass(), "eventMask", 0L);
        setField(term47654, term47654.getClass(), "changeSupport", null);
        setField(term47654, term47654.getClass(), "objectLock", null);
        setBooleanField(term47654, term47654.getClass(), "isPacked", false);
        setIntField(term47654, term47654.getClass(), "boundsOp", 0);
        setField(term47654, term47654.getClass(), "compoundShape", null);
        setField(term47654, term47654.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term47654, term47654.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term47654, term47654.getClass(), "backgroundEraseDisabled", false);
        setField(term47654, term47654.getClass(), "eventCache", null);
        setBooleanField(term47654, term47654.getClass(), "coalescingEnabled", false);
        setBooleanField(term47654, term47654.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term47654, term47654.getClass(), "componentSerializedDataVersion", 0);
        setField(term47654, term47654.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paste", argTypes, term47654, args);
    }

};


