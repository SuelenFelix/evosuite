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

public class KTextArea_1_paste_10949341393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14647;

    public KTextArea_1_paste_10949341393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14647 = newInstance(Class.forName("proto.KTextArea$1"));
        setIntField(term14647, term14647.getClass(), "rows", 0);
        setIntField(term14647, term14647.getClass(), "columns", 0);
        setIntField(term14647, term14647.getClass(), "columnWidth", 0);
        setIntField(term14647, term14647.getClass(), "rowHeight", 0);
        setBooleanField(term14647, term14647.getClass(), "wrap", false);
        setBooleanField(term14647, term14647.getClass(), "word", false);
        setField(term14647, term14647.getClass(), "model", null);
        setField(term14647, term14647.getClass(), "caret", null);
        setField(term14647, term14647.getClass(), "navigationFilter", null);
        setField(term14647, term14647.getClass(), "highlighter", null);
        setField(term14647, term14647.getClass(), "keymap", null);
        setField(term14647, term14647.getClass(), "caretEvent", null);
        setField(term14647, term14647.getClass(), "caretColor", null);
        setField(term14647, term14647.getClass(), "selectionColor", null);
        setField(term14647, term14647.getClass(), "selectedTextColor", null);
        setField(term14647, term14647.getClass(), "disabledTextColor", null);
        setBooleanField(term14647, term14647.getClass(), "editable", false);
        setField(term14647, term14647.getClass(), "margin", null);
        setCharField(term14647, term14647.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term14647, term14647.getClass(), "dragEnabled", false);
        setField(term14647, term14647.getClass(), "dropMode", null);
        setField(term14647, term14647.getClass(), "dropLocation", null);
        setField(term14647, term14647.getClass(), "inputMethodRequestsHandler", null);
        setField(term14647, term14647.getClass(), "composedTextAttribute", null);
        setField(term14647, term14647.getClass(), "composedTextContent", null);
        setField(term14647, term14647.getClass(), "composedTextStart", null);
        setField(term14647, term14647.getClass(), "composedTextEnd", null);
        setField(term14647, term14647.getClass(), "latestCommittedTextStart", null);
        setField(term14647, term14647.getClass(), "latestCommittedTextEnd", null);
        setField(term14647, term14647.getClass(), "composedTextCaret", null);
        setField(term14647, term14647.getClass(), "originalCaret", null);
        setBooleanField(term14647, term14647.getClass(), "checkedInputOverride", false);
        setBooleanField(term14647, term14647.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term14647, term14647.getClass(), "isAlignmentXSet", false);
        setFloatField(term14647, term14647.getClass(), "alignmentX", 0.0F);
        setBooleanField(term14647, term14647.getClass(), "isAlignmentYSet", false);
        setFloatField(term14647, term14647.getClass(), "alignmentY", 0.0F);
        setField(term14647, term14647.getClass(), "ui", null);
        setField(term14647, term14647.getClass(), "listenerList", null);
        setField(term14647, term14647.getClass(), "clientProperties", null);
        setField(term14647, term14647.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term14647, term14647.getClass(), "autoscrolls", false);
        setField(term14647, term14647.getClass(), "border", null);
        setIntField(term14647, term14647.getClass(), "flags", 0);
        setField(term14647, term14647.getClass(), "inputVerifier", null);
        setBooleanField(term14647, term14647.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term14647, term14647.getClass(), "paintingChild", null);
        setField(term14647, term14647.getClass(), "popupMenu", null);
        setField(term14647, term14647.getClass(), "revalidateRunnableScheduled", null);
        setField(term14647, term14647.getClass(), "focusInputMap", null);
        setField(term14647, term14647.getClass(), "ancestorInputMap", null);
        setField(term14647, term14647.getClass(), "windowInputMap", null);
        setField(term14647, term14647.getClass(), "actionMap", null);
        setField(term14647, term14647.getClass(), "aaHint", null);
        setField(term14647, term14647.getClass(), "lcdRenderingHint", null);
        setField(term14647, term14647.getClass(), "component", null);
        setField(term14647, term14647.getClass(), "layoutMgr", null);
        setField(term14647, term14647.getClass(), "dispatcher", null);
        setField(term14647, term14647.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term14647, term14647.getClass(), "focusCycleRoot", false);
        setBooleanField(term14647, term14647.getClass(), "focusTraversalPolicyProvider", false);
        setField(term14647, term14647.getClass(), "printingThreads", null);
        setBooleanField(term14647, term14647.getClass(), "printing", false);
        setField(term14647, term14647.getClass(), "containerListener", null);
        setIntField(term14647, term14647.getClass(), "listeningChildren", 0);
        setIntField(term14647, term14647.getClass(), "listeningBoundsChildren", 0);
        setIntField(term14647, term14647.getClass(), "descendantsCount", 0);
        setField(term14647, term14647.getClass(), "preserveBackgroundColor", null);
        setIntField(term14647, term14647.getClass(), "numOfHWComponents", 0);
        setIntField(term14647, term14647.getClass(), "numOfLWComponents", 0);
        setField(term14647, term14647.getClass(), "modalComp", null);
        setField(term14647, term14647.getClass(), "modalAppContext", null);
        setIntField(term14647, term14647.getClass(), "containerSerializedDataVersion", 0);
        setField(term14647, term14647.getClass(), "peer", null);
        setField(term14647, term14647.getClass(), "parent", null);
        setField(term14647, term14647.getClass(), "appContext", null);
        setIntField(term14647, term14647.getClass(), "x", 0);
        setIntField(term14647, term14647.getClass(), "y", 0);
        setIntField(term14647, term14647.getClass(), "width", 0);
        setIntField(term14647, term14647.getClass(), "height", 0);
        setField(term14647, term14647.getClass(), "foreground", null);
        setField(term14647, term14647.getClass(), "background", null);
        setField(term14647, term14647.getClass(), "font", null);
        setField(term14647, term14647.getClass(), "peerFont", null);
        setField(term14647, term14647.getClass(), "cursor", null);
        setField(term14647, term14647.getClass(), "locale", null);
        setField(term14647, term14647.getClass(), "graphicsConfig", null);
        setField(term14647, term14647.getClass(), "bufferStrategy", null);
        setBooleanField(term14647, term14647.getClass(), "ignoreRepaint", false);
        setBooleanField(term14647, term14647.getClass(), "visible", false);
        setBooleanField(term14647, term14647.getClass(), "enabled", false);
        setBooleanField(term14647, term14647.getClass(), "valid", false);
        setField(term14647, term14647.getClass(), "dropTarget", null);
        setField(term14647, term14647.getClass(), "popups", null);
        setField(term14647, term14647.getClass(), "name", null);
        setBooleanField(term14647, term14647.getClass(), "nameExplicitlySet", false);
        setBooleanField(term14647, term14647.getClass(), "focusable", false);
        setIntField(term14647, term14647.getClass(), "isFocusTraversableOverridden", 0);
        setField(term14647, term14647.getClass(), "focusTraversalKeys", null);
        setBooleanField(term14647, term14647.getClass(), "focusTraversalKeysEnabled", false);
        setField(term14647, term14647.getClass(), "acc", null);
        setField(term14647, term14647.getClass(), "minSize", null);
        setBooleanField(term14647, term14647.getClass(), "minSizeSet", false);
        setField(term14647, term14647.getClass(), "prefSize", null);
        setBooleanField(term14647, term14647.getClass(), "prefSizeSet", false);
        setField(term14647, term14647.getClass(), "maxSize", null);
        setBooleanField(term14647, term14647.getClass(), "maxSizeSet", false);
        setField(term14647, term14647.getClass(), "componentOrientation", null);
        setBooleanField(term14647, term14647.getClass(), "newEventsOnly", false);
        setField(term14647, term14647.getClass(), "componentListener", null);
        setField(term14647, term14647.getClass(), "focusListener", null);
        setField(term14647, term14647.getClass(), "hierarchyListener", null);
        setField(term14647, term14647.getClass(), "hierarchyBoundsListener", null);
        setField(term14647, term14647.getClass(), "keyListener", null);
        setField(term14647, term14647.getClass(), "mouseListener", null);
        setField(term14647, term14647.getClass(), "mouseMotionListener", null);
        setField(term14647, term14647.getClass(), "mouseWheelListener", null);
        setField(term14647, term14647.getClass(), "inputMethodListener", null);
        setLongField(term14647, term14647.getClass(), "eventMask", 0L);
        setField(term14647, term14647.getClass(), "changeSupport", null);
        setField(term14647, term14647.getClass(), "objectLock", null);
        setBooleanField(term14647, term14647.getClass(), "isPacked", false);
        setIntField(term14647, term14647.getClass(), "boundsOp", 0);
        setField(term14647, term14647.getClass(), "compoundShape", null);
        setField(term14647, term14647.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term14647, term14647.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term14647, term14647.getClass(), "backgroundEraseDisabled", false);
        setField(term14647, term14647.getClass(), "eventCache", null);
        setBooleanField(term14647, term14647.getClass(), "coalescingEnabled", false);
        setBooleanField(term14647, term14647.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term14647, term14647.getClass(), "componentSerializedDataVersion", 0);
        setField(term14647, term14647.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextArea$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paste", argTypes, term14647, args);
    }

};


