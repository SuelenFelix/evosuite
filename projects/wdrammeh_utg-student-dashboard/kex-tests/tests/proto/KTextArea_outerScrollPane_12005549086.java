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

public class KTextArea_outerScrollPane_12005549086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60792;

    public KTextArea_outerScrollPane_12005549086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60792 = newInstance(Class.forName("proto.KTextArea"));
        setIntField(term60792, term60792.getClass(), "rows", 0);
        setIntField(term60792, term60792.getClass(), "columns", 0);
        setIntField(term60792, term60792.getClass(), "columnWidth", 0);
        setIntField(term60792, term60792.getClass(), "rowHeight", 0);
        setBooleanField(term60792, term60792.getClass(), "wrap", false);
        setBooleanField(term60792, term60792.getClass(), "word", false);
        setField(term60792, term60792.getClass(), "model", null);
        setField(term60792, term60792.getClass(), "caret", null);
        setField(term60792, term60792.getClass(), "navigationFilter", null);
        setField(term60792, term60792.getClass(), "highlighter", null);
        setField(term60792, term60792.getClass(), "keymap", null);
        setField(term60792, term60792.getClass(), "caretEvent", null);
        setField(term60792, term60792.getClass(), "caretColor", null);
        setField(term60792, term60792.getClass(), "selectionColor", null);
        setField(term60792, term60792.getClass(), "selectedTextColor", null);
        setField(term60792, term60792.getClass(), "disabledTextColor", null);
        setBooleanField(term60792, term60792.getClass(), "editable", false);
        setField(term60792, term60792.getClass(), "margin", null);
        setCharField(term60792, term60792.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60792, term60792.getClass(), "dragEnabled", false);
        setField(term60792, term60792.getClass(), "dropMode", null);
        setField(term60792, term60792.getClass(), "dropLocation", null);
        setField(term60792, term60792.getClass(), "inputMethodRequestsHandler", null);
        setField(term60792, term60792.getClass(), "composedTextAttribute", null);
        setField(term60792, term60792.getClass(), "composedTextContent", null);
        setField(term60792, term60792.getClass(), "composedTextStart", null);
        setField(term60792, term60792.getClass(), "composedTextEnd", null);
        setField(term60792, term60792.getClass(), "latestCommittedTextStart", null);
        setField(term60792, term60792.getClass(), "latestCommittedTextEnd", null);
        setField(term60792, term60792.getClass(), "composedTextCaret", null);
        setField(term60792, term60792.getClass(), "originalCaret", null);
        setBooleanField(term60792, term60792.getClass(), "checkedInputOverride", false);
        setBooleanField(term60792, term60792.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60792, term60792.getClass(), "isAlignmentXSet", false);
        setFloatField(term60792, term60792.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60792, term60792.getClass(), "isAlignmentYSet", false);
        setFloatField(term60792, term60792.getClass(), "alignmentY", 0.0F);
        setField(term60792, term60792.getClass(), "ui", null);
        setField(term60792, term60792.getClass(), "listenerList", null);
        setField(term60792, term60792.getClass(), "clientProperties", null);
        setField(term60792, term60792.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60792, term60792.getClass(), "autoscrolls", false);
        setField(term60792, term60792.getClass(), "border", null);
        setIntField(term60792, term60792.getClass(), "flags", 0);
        setField(term60792, term60792.getClass(), "inputVerifier", null);
        setBooleanField(term60792, term60792.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60792, term60792.getClass(), "paintingChild", null);
        setField(term60792, term60792.getClass(), "popupMenu", null);
        setField(term60792, term60792.getClass(), "revalidateRunnableScheduled", null);
        setField(term60792, term60792.getClass(), "focusInputMap", null);
        setField(term60792, term60792.getClass(), "ancestorInputMap", null);
        setField(term60792, term60792.getClass(), "windowInputMap", null);
        setField(term60792, term60792.getClass(), "actionMap", null);
        setField(term60792, term60792.getClass(), "aaHint", null);
        setField(term60792, term60792.getClass(), "lcdRenderingHint", null);
        setField(term60792, term60792.getClass(), "component", null);
        setField(term60792, term60792.getClass(), "layoutMgr", null);
        setField(term60792, term60792.getClass(), "dispatcher", null);
        setField(term60792, term60792.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60792, term60792.getClass(), "focusCycleRoot", false);
        setBooleanField(term60792, term60792.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60792, term60792.getClass(), "printingThreads", null);
        setBooleanField(term60792, term60792.getClass(), "printing", false);
        setField(term60792, term60792.getClass(), "containerListener", null);
        setIntField(term60792, term60792.getClass(), "listeningChildren", 0);
        setIntField(term60792, term60792.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60792, term60792.getClass(), "descendantsCount", 0);
        setField(term60792, term60792.getClass(), "preserveBackgroundColor", null);
        setIntField(term60792, term60792.getClass(), "numOfHWComponents", 0);
        setIntField(term60792, term60792.getClass(), "numOfLWComponents", 0);
        setField(term60792, term60792.getClass(), "modalComp", null);
        setField(term60792, term60792.getClass(), "modalAppContext", null);
        setIntField(term60792, term60792.getClass(), "containerSerializedDataVersion", 0);
        setField(term60792, term60792.getClass(), "peer", null);
        setField(term60792, term60792.getClass(), "parent", null);
        setField(term60792, term60792.getClass(), "appContext", null);
        setIntField(term60792, term60792.getClass(), "x", 0);
        setIntField(term60792, term60792.getClass(), "y", 0);
        setIntField(term60792, term60792.getClass(), "width", 0);
        setIntField(term60792, term60792.getClass(), "height", 0);
        setField(term60792, term60792.getClass(), "foreground", null);
        setField(term60792, term60792.getClass(), "background", null);
        setField(term60792, term60792.getClass(), "font", null);
        setField(term60792, term60792.getClass(), "peerFont", null);
        setField(term60792, term60792.getClass(), "cursor", null);
        setField(term60792, term60792.getClass(), "locale", null);
        setField(term60792, term60792.getClass(), "graphicsConfig", null);
        setField(term60792, term60792.getClass(), "bufferStrategy", null);
        setBooleanField(term60792, term60792.getClass(), "ignoreRepaint", false);
        setBooleanField(term60792, term60792.getClass(), "visible", false);
        setBooleanField(term60792, term60792.getClass(), "enabled", false);
        setBooleanField(term60792, term60792.getClass(), "valid", false);
        setField(term60792, term60792.getClass(), "dropTarget", null);
        setField(term60792, term60792.getClass(), "popups", null);
        setField(term60792, term60792.getClass(), "name", null);
        setBooleanField(term60792, term60792.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60792, term60792.getClass(), "focusable", false);
        setIntField(term60792, term60792.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60792, term60792.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60792, term60792.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60792, term60792.getClass(), "acc", null);
        setField(term60792, term60792.getClass(), "minSize", null);
        setBooleanField(term60792, term60792.getClass(), "minSizeSet", false);
        setField(term60792, term60792.getClass(), "prefSize", null);
        setBooleanField(term60792, term60792.getClass(), "prefSizeSet", false);
        setField(term60792, term60792.getClass(), "maxSize", null);
        setBooleanField(term60792, term60792.getClass(), "maxSizeSet", false);
        setField(term60792, term60792.getClass(), "componentOrientation", null);
        setBooleanField(term60792, term60792.getClass(), "newEventsOnly", false);
        setField(term60792, term60792.getClass(), "componentListener", null);
        setField(term60792, term60792.getClass(), "focusListener", null);
        setField(term60792, term60792.getClass(), "hierarchyListener", null);
        setField(term60792, term60792.getClass(), "hierarchyBoundsListener", null);
        setField(term60792, term60792.getClass(), "keyListener", null);
        setField(term60792, term60792.getClass(), "mouseListener", null);
        setField(term60792, term60792.getClass(), "mouseMotionListener", null);
        setField(term60792, term60792.getClass(), "mouseWheelListener", null);
        setField(term60792, term60792.getClass(), "inputMethodListener", null);
        setLongField(term60792, term60792.getClass(), "eventMask", 0L);
        setField(term60792, term60792.getClass(), "changeSupport", null);
        setField(term60792, term60792.getClass(), "objectLock", null);
        setBooleanField(term60792, term60792.getClass(), "isPacked", false);
        setIntField(term60792, term60792.getClass(), "boundsOp", 0);
        setField(term60792, term60792.getClass(), "compoundShape", null);
        setField(term60792, term60792.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60792, term60792.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60792, term60792.getClass(), "backgroundEraseDisabled", false);
        setField(term60792, term60792.getClass(), "eventCache", null);
        setBooleanField(term60792, term60792.getClass(), "coalescingEnabled", false);
        setBooleanField(term60792, term60792.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60792, term60792.getClass(), "componentSerializedDataVersion", 0);
        setField(term60792, term60792.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Dimension");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "outerScrollPane", argTypes, term60792, args);
    }

};


