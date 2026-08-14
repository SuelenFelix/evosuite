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
     Object term14644;

    public KTextArea_1_paste_10949341393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14644 = newInstance(Class.forName("proto.KTextArea$1"));
        setIntField(term14644, term14644.getClass(), "rows", 0);
        setIntField(term14644, term14644.getClass(), "columns", 0);
        setIntField(term14644, term14644.getClass(), "columnWidth", 0);
        setIntField(term14644, term14644.getClass(), "rowHeight", 0);
        setBooleanField(term14644, term14644.getClass(), "wrap", false);
        setBooleanField(term14644, term14644.getClass(), "word", false);
        setField(term14644, term14644.getClass(), "model", null);
        setField(term14644, term14644.getClass(), "caret", null);
        setField(term14644, term14644.getClass(), "navigationFilter", null);
        setField(term14644, term14644.getClass(), "highlighter", null);
        setField(term14644, term14644.getClass(), "keymap", null);
        setField(term14644, term14644.getClass(), "caretEvent", null);
        setField(term14644, term14644.getClass(), "caretColor", null);
        setField(term14644, term14644.getClass(), "selectionColor", null);
        setField(term14644, term14644.getClass(), "selectedTextColor", null);
        setField(term14644, term14644.getClass(), "disabledTextColor", null);
        setBooleanField(term14644, term14644.getClass(), "editable", false);
        setField(term14644, term14644.getClass(), "margin", null);
        setCharField(term14644, term14644.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term14644, term14644.getClass(), "dragEnabled", false);
        setField(term14644, term14644.getClass(), "dropMode", null);
        setField(term14644, term14644.getClass(), "dropLocation", null);
        setField(term14644, term14644.getClass(), "inputMethodRequestsHandler", null);
        setField(term14644, term14644.getClass(), "composedTextAttribute", null);
        setField(term14644, term14644.getClass(), "composedTextContent", null);
        setField(term14644, term14644.getClass(), "composedTextStart", null);
        setField(term14644, term14644.getClass(), "composedTextEnd", null);
        setField(term14644, term14644.getClass(), "latestCommittedTextStart", null);
        setField(term14644, term14644.getClass(), "latestCommittedTextEnd", null);
        setField(term14644, term14644.getClass(), "composedTextCaret", null);
        setField(term14644, term14644.getClass(), "originalCaret", null);
        setBooleanField(term14644, term14644.getClass(), "checkedInputOverride", false);
        setBooleanField(term14644, term14644.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term14644, term14644.getClass(), "isAlignmentXSet", false);
        setFloatField(term14644, term14644.getClass(), "alignmentX", 0.0F);
        setBooleanField(term14644, term14644.getClass(), "isAlignmentYSet", false);
        setFloatField(term14644, term14644.getClass(), "alignmentY", 0.0F);
        setField(term14644, term14644.getClass(), "ui", null);
        setField(term14644, term14644.getClass(), "listenerList", null);
        setField(term14644, term14644.getClass(), "clientProperties", null);
        setField(term14644, term14644.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term14644, term14644.getClass(), "autoscrolls", false);
        setField(term14644, term14644.getClass(), "border", null);
        setIntField(term14644, term14644.getClass(), "flags", 0);
        setField(term14644, term14644.getClass(), "inputVerifier", null);
        setBooleanField(term14644, term14644.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term14644, term14644.getClass(), "paintingChild", null);
        setField(term14644, term14644.getClass(), "popupMenu", null);
        setField(term14644, term14644.getClass(), "revalidateRunnableScheduled", null);
        setField(term14644, term14644.getClass(), "focusInputMap", null);
        setField(term14644, term14644.getClass(), "ancestorInputMap", null);
        setField(term14644, term14644.getClass(), "windowInputMap", null);
        setField(term14644, term14644.getClass(), "actionMap", null);
        setField(term14644, term14644.getClass(), "aaHint", null);
        setField(term14644, term14644.getClass(), "lcdRenderingHint", null);
        setField(term14644, term14644.getClass(), "component", null);
        setField(term14644, term14644.getClass(), "layoutMgr", null);
        setField(term14644, term14644.getClass(), "dispatcher", null);
        setField(term14644, term14644.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term14644, term14644.getClass(), "focusCycleRoot", false);
        setBooleanField(term14644, term14644.getClass(), "focusTraversalPolicyProvider", false);
        setField(term14644, term14644.getClass(), "printingThreads", null);
        setBooleanField(term14644, term14644.getClass(), "printing", false);
        setField(term14644, term14644.getClass(), "containerListener", null);
        setIntField(term14644, term14644.getClass(), "listeningChildren", 0);
        setIntField(term14644, term14644.getClass(), "listeningBoundsChildren", 0);
        setIntField(term14644, term14644.getClass(), "descendantsCount", 0);
        setField(term14644, term14644.getClass(), "preserveBackgroundColor", null);
        setIntField(term14644, term14644.getClass(), "numOfHWComponents", 0);
        setIntField(term14644, term14644.getClass(), "numOfLWComponents", 0);
        setField(term14644, term14644.getClass(), "modalComp", null);
        setField(term14644, term14644.getClass(), "modalAppContext", null);
        setIntField(term14644, term14644.getClass(), "containerSerializedDataVersion", 0);
        setField(term14644, term14644.getClass(), "peer", null);
        setField(term14644, term14644.getClass(), "parent", null);
        setField(term14644, term14644.getClass(), "appContext", null);
        setIntField(term14644, term14644.getClass(), "x", 0);
        setIntField(term14644, term14644.getClass(), "y", 0);
        setIntField(term14644, term14644.getClass(), "width", 0);
        setIntField(term14644, term14644.getClass(), "height", 0);
        setField(term14644, term14644.getClass(), "foreground", null);
        setField(term14644, term14644.getClass(), "background", null);
        setField(term14644, term14644.getClass(), "font", null);
        setField(term14644, term14644.getClass(), "peerFont", null);
        setField(term14644, term14644.getClass(), "cursor", null);
        setField(term14644, term14644.getClass(), "locale", null);
        setField(term14644, term14644.getClass(), "graphicsConfig", null);
        setField(term14644, term14644.getClass(), "bufferStrategy", null);
        setBooleanField(term14644, term14644.getClass(), "ignoreRepaint", false);
        setBooleanField(term14644, term14644.getClass(), "visible", false);
        setBooleanField(term14644, term14644.getClass(), "enabled", false);
        setBooleanField(term14644, term14644.getClass(), "valid", false);
        setField(term14644, term14644.getClass(), "dropTarget", null);
        setField(term14644, term14644.getClass(), "popups", null);
        setField(term14644, term14644.getClass(), "name", null);
        setBooleanField(term14644, term14644.getClass(), "nameExplicitlySet", false);
        setBooleanField(term14644, term14644.getClass(), "focusable", false);
        setIntField(term14644, term14644.getClass(), "isFocusTraversableOverridden", 0);
        setField(term14644, term14644.getClass(), "focusTraversalKeys", null);
        setBooleanField(term14644, term14644.getClass(), "focusTraversalKeysEnabled", false);
        setField(term14644, term14644.getClass(), "acc", null);
        setField(term14644, term14644.getClass(), "minSize", null);
        setBooleanField(term14644, term14644.getClass(), "minSizeSet", false);
        setField(term14644, term14644.getClass(), "prefSize", null);
        setBooleanField(term14644, term14644.getClass(), "prefSizeSet", false);
        setField(term14644, term14644.getClass(), "maxSize", null);
        setBooleanField(term14644, term14644.getClass(), "maxSizeSet", false);
        setField(term14644, term14644.getClass(), "componentOrientation", null);
        setBooleanField(term14644, term14644.getClass(), "newEventsOnly", false);
        setField(term14644, term14644.getClass(), "componentListener", null);
        setField(term14644, term14644.getClass(), "focusListener", null);
        setField(term14644, term14644.getClass(), "hierarchyListener", null);
        setField(term14644, term14644.getClass(), "hierarchyBoundsListener", null);
        setField(term14644, term14644.getClass(), "keyListener", null);
        setField(term14644, term14644.getClass(), "mouseListener", null);
        setField(term14644, term14644.getClass(), "mouseMotionListener", null);
        setField(term14644, term14644.getClass(), "mouseWheelListener", null);
        setField(term14644, term14644.getClass(), "inputMethodListener", null);
        setLongField(term14644, term14644.getClass(), "eventMask", 0L);
        setField(term14644, term14644.getClass(), "changeSupport", null);
        setField(term14644, term14644.getClass(), "objectLock", null);
        setBooleanField(term14644, term14644.getClass(), "isPacked", false);
        setIntField(term14644, term14644.getClass(), "boundsOp", 0);
        setField(term14644, term14644.getClass(), "compoundShape", null);
        setField(term14644, term14644.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term14644, term14644.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term14644, term14644.getClass(), "backgroundEraseDisabled", false);
        setField(term14644, term14644.getClass(), "eventCache", null);
        setBooleanField(term14644, term14644.getClass(), "coalescingEnabled", false);
        setBooleanField(term14644, term14644.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term14644, term14644.getClass(), "componentSerializedDataVersion", 0);
        setField(term14644, term14644.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextArea$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paste", argTypes, term14644, args);
    }

};


