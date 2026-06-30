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

public class KTextArea_getLimitedEntryArea_1550243165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60689;
     Object term60741;

    public KTextArea_getLimitedEntryArea_1550243165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60689 = newInstance(Class.forName("proto.KTextArea"));
        setIntField(term60689, term60689.getClass(), "rows", 0);
        setIntField(term60689, term60689.getClass(), "columns", 0);
        setIntField(term60689, term60689.getClass(), "columnWidth", 0);
        setIntField(term60689, term60689.getClass(), "rowHeight", 0);
        setBooleanField(term60689, term60689.getClass(), "wrap", false);
        setBooleanField(term60689, term60689.getClass(), "word", false);
        setField(term60689, term60689.getClass(), "model", null);
        setField(term60689, term60689.getClass(), "caret", null);
        setField(term60689, term60689.getClass(), "navigationFilter", null);
        setField(term60689, term60689.getClass(), "highlighter", null);
        setField(term60689, term60689.getClass(), "keymap", null);
        setField(term60689, term60689.getClass(), "caretEvent", null);
        setField(term60689, term60689.getClass(), "caretColor", null);
        setField(term60689, term60689.getClass(), "selectionColor", null);
        setField(term60689, term60689.getClass(), "selectedTextColor", null);
        setField(term60689, term60689.getClass(), "disabledTextColor", null);
        setBooleanField(term60689, term60689.getClass(), "editable", false);
        setField(term60689, term60689.getClass(), "margin", null);
        setCharField(term60689, term60689.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60689, term60689.getClass(), "dragEnabled", false);
        setField(term60689, term60689.getClass(), "dropMode", null);
        setField(term60689, term60689.getClass(), "dropLocation", null);
        setField(term60689, term60689.getClass(), "inputMethodRequestsHandler", null);
        setField(term60689, term60689.getClass(), "composedTextAttribute", null);
        setField(term60689, term60689.getClass(), "composedTextContent", null);
        setField(term60689, term60689.getClass(), "composedTextStart", null);
        setField(term60689, term60689.getClass(), "composedTextEnd", null);
        setField(term60689, term60689.getClass(), "latestCommittedTextStart", null);
        setField(term60689, term60689.getClass(), "latestCommittedTextEnd", null);
        setField(term60689, term60689.getClass(), "composedTextCaret", null);
        setField(term60689, term60689.getClass(), "originalCaret", null);
        setBooleanField(term60689, term60689.getClass(), "checkedInputOverride", false);
        setBooleanField(term60689, term60689.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60689, term60689.getClass(), "isAlignmentXSet", false);
        setFloatField(term60689, term60689.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60689, term60689.getClass(), "isAlignmentYSet", false);
        setFloatField(term60689, term60689.getClass(), "alignmentY", 0.0F);
        setField(term60689, term60689.getClass(), "ui", null);
        setField(term60689, term60689.getClass(), "listenerList", null);
        setField(term60689, term60689.getClass(), "clientProperties", null);
        setField(term60689, term60689.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60689, term60689.getClass(), "autoscrolls", false);
        setField(term60689, term60689.getClass(), "border", null);
        setIntField(term60689, term60689.getClass(), "flags", 0);
        setField(term60689, term60689.getClass(), "inputVerifier", null);
        setBooleanField(term60689, term60689.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60689, term60689.getClass(), "paintingChild", null);
        setField(term60689, term60689.getClass(), "popupMenu", null);
        setField(term60689, term60689.getClass(), "revalidateRunnableScheduled", null);
        setField(term60689, term60689.getClass(), "focusInputMap", null);
        setField(term60689, term60689.getClass(), "ancestorInputMap", null);
        setField(term60689, term60689.getClass(), "windowInputMap", null);
        setField(term60689, term60689.getClass(), "actionMap", null);
        setField(term60689, term60689.getClass(), "aaHint", null);
        setField(term60689, term60689.getClass(), "lcdRenderingHint", null);
        setField(term60689, term60689.getClass(), "component", null);
        setField(term60689, term60689.getClass(), "layoutMgr", null);
        setField(term60689, term60689.getClass(), "dispatcher", null);
        setField(term60689, term60689.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60689, term60689.getClass(), "focusCycleRoot", false);
        setBooleanField(term60689, term60689.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60689, term60689.getClass(), "printingThreads", null);
        setBooleanField(term60689, term60689.getClass(), "printing", false);
        setField(term60689, term60689.getClass(), "containerListener", null);
        setIntField(term60689, term60689.getClass(), "listeningChildren", 0);
        setIntField(term60689, term60689.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60689, term60689.getClass(), "descendantsCount", 0);
        setField(term60689, term60689.getClass(), "preserveBackgroundColor", null);
        setIntField(term60689, term60689.getClass(), "numOfHWComponents", 0);
        setIntField(term60689, term60689.getClass(), "numOfLWComponents", 0);
        setField(term60689, term60689.getClass(), "modalComp", null);
        setField(term60689, term60689.getClass(), "modalAppContext", null);
        setIntField(term60689, term60689.getClass(), "containerSerializedDataVersion", 0);
        setField(term60689, term60689.getClass(), "peer", null);
        setField(term60689, term60689.getClass(), "parent", null);
        setField(term60689, term60689.getClass(), "appContext", null);
        setIntField(term60689, term60689.getClass(), "x", 0);
        setIntField(term60689, term60689.getClass(), "y", 0);
        setIntField(term60689, term60689.getClass(), "width", 0);
        setIntField(term60689, term60689.getClass(), "height", 0);
        setField(term60689, term60689.getClass(), "foreground", null);
        setField(term60689, term60689.getClass(), "background", null);
        setField(term60689, term60689.getClass(), "font", null);
        setField(term60689, term60689.getClass(), "peerFont", null);
        setField(term60689, term60689.getClass(), "cursor", null);
        setField(term60689, term60689.getClass(), "locale", null);
        setField(term60689, term60689.getClass(), "graphicsConfig", null);
        setField(term60689, term60689.getClass(), "bufferStrategy", null);
        setBooleanField(term60689, term60689.getClass(), "ignoreRepaint", false);
        setBooleanField(term60689, term60689.getClass(), "visible", false);
        setBooleanField(term60689, term60689.getClass(), "enabled", false);
        setBooleanField(term60689, term60689.getClass(), "valid", false);
        setField(term60689, term60689.getClass(), "dropTarget", null);
        setField(term60689, term60689.getClass(), "popups", null);
        setField(term60689, term60689.getClass(), "name", null);
        setBooleanField(term60689, term60689.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60689, term60689.getClass(), "focusable", false);
        setIntField(term60689, term60689.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60689, term60689.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60689, term60689.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60689, term60689.getClass(), "acc", null);
        setField(term60689, term60689.getClass(), "minSize", null);
        setBooleanField(term60689, term60689.getClass(), "minSizeSet", false);
        setField(term60689, term60689.getClass(), "prefSize", null);
        setBooleanField(term60689, term60689.getClass(), "prefSizeSet", false);
        setField(term60689, term60689.getClass(), "maxSize", null);
        setBooleanField(term60689, term60689.getClass(), "maxSizeSet", false);
        setField(term60689, term60689.getClass(), "componentOrientation", null);
        setBooleanField(term60689, term60689.getClass(), "newEventsOnly", false);
        setField(term60689, term60689.getClass(), "componentListener", null);
        setField(term60689, term60689.getClass(), "focusListener", null);
        setField(term60689, term60689.getClass(), "hierarchyListener", null);
        setField(term60689, term60689.getClass(), "hierarchyBoundsListener", null);
        setField(term60689, term60689.getClass(), "keyListener", null);
        setField(term60689, term60689.getClass(), "mouseListener", null);
        setField(term60689, term60689.getClass(), "mouseMotionListener", null);
        setField(term60689, term60689.getClass(), "mouseWheelListener", null);
        setField(term60689, term60689.getClass(), "inputMethodListener", null);
        setLongField(term60689, term60689.getClass(), "eventMask", 0L);
        setField(term60689, term60689.getClass(), "changeSupport", null);
        setField(term60689, term60689.getClass(), "objectLock", null);
        setBooleanField(term60689, term60689.getClass(), "isPacked", false);
        setIntField(term60689, term60689.getClass(), "boundsOp", 0);
        setField(term60689, term60689.getClass(), "compoundShape", null);
        setField(term60689, term60689.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60689, term60689.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60689, term60689.getClass(), "backgroundEraseDisabled", false);
        setField(term60689, term60689.getClass(), "eventCache", null);
        setBooleanField(term60689, term60689.getClass(), "coalescingEnabled", false);
        setBooleanField(term60689, term60689.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60689, term60689.getClass(), "componentSerializedDataVersion", 0);
        setField(term60689, term60689.getClass(), "accessibleContext", null);
        term60741 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60741;
        callMethod(klass, "getLimitedEntryArea", argTypes, term60689, args);
    }

};


