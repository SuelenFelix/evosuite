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
     Object term60743;

    public KTextArea_outerScrollPane_12005549086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60743 = newInstance(Class.forName("proto.KTextArea"));
        setIntField(term60743, term60743.getClass(), "rows", 0);
        setIntField(term60743, term60743.getClass(), "columns", 0);
        setIntField(term60743, term60743.getClass(), "columnWidth", 0);
        setIntField(term60743, term60743.getClass(), "rowHeight", 0);
        setBooleanField(term60743, term60743.getClass(), "wrap", false);
        setBooleanField(term60743, term60743.getClass(), "word", false);
        setField(term60743, term60743.getClass(), "model", null);
        setField(term60743, term60743.getClass(), "caret", null);
        setField(term60743, term60743.getClass(), "navigationFilter", null);
        setField(term60743, term60743.getClass(), "highlighter", null);
        setField(term60743, term60743.getClass(), "keymap", null);
        setField(term60743, term60743.getClass(), "caretEvent", null);
        setField(term60743, term60743.getClass(), "caretColor", null);
        setField(term60743, term60743.getClass(), "selectionColor", null);
        setField(term60743, term60743.getClass(), "selectedTextColor", null);
        setField(term60743, term60743.getClass(), "disabledTextColor", null);
        setBooleanField(term60743, term60743.getClass(), "editable", false);
        setField(term60743, term60743.getClass(), "margin", null);
        setCharField(term60743, term60743.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60743, term60743.getClass(), "dragEnabled", false);
        setField(term60743, term60743.getClass(), "dropMode", null);
        setField(term60743, term60743.getClass(), "dropLocation", null);
        setField(term60743, term60743.getClass(), "inputMethodRequestsHandler", null);
        setField(term60743, term60743.getClass(), "composedTextAttribute", null);
        setField(term60743, term60743.getClass(), "composedTextContent", null);
        setField(term60743, term60743.getClass(), "composedTextStart", null);
        setField(term60743, term60743.getClass(), "composedTextEnd", null);
        setField(term60743, term60743.getClass(), "latestCommittedTextStart", null);
        setField(term60743, term60743.getClass(), "latestCommittedTextEnd", null);
        setField(term60743, term60743.getClass(), "composedTextCaret", null);
        setField(term60743, term60743.getClass(), "originalCaret", null);
        setBooleanField(term60743, term60743.getClass(), "checkedInputOverride", false);
        setBooleanField(term60743, term60743.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60743, term60743.getClass(), "isAlignmentXSet", false);
        setFloatField(term60743, term60743.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60743, term60743.getClass(), "isAlignmentYSet", false);
        setFloatField(term60743, term60743.getClass(), "alignmentY", 0.0F);
        setField(term60743, term60743.getClass(), "ui", null);
        setField(term60743, term60743.getClass(), "listenerList", null);
        setField(term60743, term60743.getClass(), "clientProperties", null);
        setField(term60743, term60743.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60743, term60743.getClass(), "autoscrolls", false);
        setField(term60743, term60743.getClass(), "border", null);
        setIntField(term60743, term60743.getClass(), "flags", 0);
        setField(term60743, term60743.getClass(), "inputVerifier", null);
        setBooleanField(term60743, term60743.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60743, term60743.getClass(), "paintingChild", null);
        setField(term60743, term60743.getClass(), "popupMenu", null);
        setField(term60743, term60743.getClass(), "revalidateRunnableScheduled", null);
        setField(term60743, term60743.getClass(), "focusInputMap", null);
        setField(term60743, term60743.getClass(), "ancestorInputMap", null);
        setField(term60743, term60743.getClass(), "windowInputMap", null);
        setField(term60743, term60743.getClass(), "actionMap", null);
        setField(term60743, term60743.getClass(), "aaHint", null);
        setField(term60743, term60743.getClass(), "lcdRenderingHint", null);
        setField(term60743, term60743.getClass(), "component", null);
        setField(term60743, term60743.getClass(), "layoutMgr", null);
        setField(term60743, term60743.getClass(), "dispatcher", null);
        setField(term60743, term60743.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60743, term60743.getClass(), "focusCycleRoot", false);
        setBooleanField(term60743, term60743.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60743, term60743.getClass(), "printingThreads", null);
        setBooleanField(term60743, term60743.getClass(), "printing", false);
        setField(term60743, term60743.getClass(), "containerListener", null);
        setIntField(term60743, term60743.getClass(), "listeningChildren", 0);
        setIntField(term60743, term60743.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60743, term60743.getClass(), "descendantsCount", 0);
        setField(term60743, term60743.getClass(), "preserveBackgroundColor", null);
        setIntField(term60743, term60743.getClass(), "numOfHWComponents", 0);
        setIntField(term60743, term60743.getClass(), "numOfLWComponents", 0);
        setField(term60743, term60743.getClass(), "modalComp", null);
        setField(term60743, term60743.getClass(), "modalAppContext", null);
        setIntField(term60743, term60743.getClass(), "containerSerializedDataVersion", 0);
        setField(term60743, term60743.getClass(), "peer", null);
        setField(term60743, term60743.getClass(), "parent", null);
        setField(term60743, term60743.getClass(), "appContext", null);
        setIntField(term60743, term60743.getClass(), "x", 0);
        setIntField(term60743, term60743.getClass(), "y", 0);
        setIntField(term60743, term60743.getClass(), "width", 0);
        setIntField(term60743, term60743.getClass(), "height", 0);
        setField(term60743, term60743.getClass(), "foreground", null);
        setField(term60743, term60743.getClass(), "background", null);
        setField(term60743, term60743.getClass(), "font", null);
        setField(term60743, term60743.getClass(), "peerFont", null);
        setField(term60743, term60743.getClass(), "cursor", null);
        setField(term60743, term60743.getClass(), "locale", null);
        setField(term60743, term60743.getClass(), "graphicsConfig", null);
        setField(term60743, term60743.getClass(), "bufferStrategy", null);
        setBooleanField(term60743, term60743.getClass(), "ignoreRepaint", false);
        setBooleanField(term60743, term60743.getClass(), "visible", false);
        setBooleanField(term60743, term60743.getClass(), "enabled", false);
        setBooleanField(term60743, term60743.getClass(), "valid", false);
        setField(term60743, term60743.getClass(), "dropTarget", null);
        setField(term60743, term60743.getClass(), "popups", null);
        setField(term60743, term60743.getClass(), "name", null);
        setBooleanField(term60743, term60743.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60743, term60743.getClass(), "focusable", false);
        setIntField(term60743, term60743.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60743, term60743.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60743, term60743.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60743, term60743.getClass(), "acc", null);
        setField(term60743, term60743.getClass(), "minSize", null);
        setBooleanField(term60743, term60743.getClass(), "minSizeSet", false);
        setField(term60743, term60743.getClass(), "prefSize", null);
        setBooleanField(term60743, term60743.getClass(), "prefSizeSet", false);
        setField(term60743, term60743.getClass(), "maxSize", null);
        setBooleanField(term60743, term60743.getClass(), "maxSizeSet", false);
        setField(term60743, term60743.getClass(), "componentOrientation", null);
        setBooleanField(term60743, term60743.getClass(), "newEventsOnly", false);
        setField(term60743, term60743.getClass(), "componentListener", null);
        setField(term60743, term60743.getClass(), "focusListener", null);
        setField(term60743, term60743.getClass(), "hierarchyListener", null);
        setField(term60743, term60743.getClass(), "hierarchyBoundsListener", null);
        setField(term60743, term60743.getClass(), "keyListener", null);
        setField(term60743, term60743.getClass(), "mouseListener", null);
        setField(term60743, term60743.getClass(), "mouseMotionListener", null);
        setField(term60743, term60743.getClass(), "mouseWheelListener", null);
        setField(term60743, term60743.getClass(), "inputMethodListener", null);
        setLongField(term60743, term60743.getClass(), "eventMask", 0L);
        setField(term60743, term60743.getClass(), "changeSupport", null);
        setField(term60743, term60743.getClass(), "objectLock", null);
        setBooleanField(term60743, term60743.getClass(), "isPacked", false);
        setIntField(term60743, term60743.getClass(), "boundsOp", 0);
        setField(term60743, term60743.getClass(), "compoundShape", null);
        setField(term60743, term60743.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60743, term60743.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60743, term60743.getClass(), "backgroundEraseDisabled", false);
        setField(term60743, term60743.getClass(), "eventCache", null);
        setBooleanField(term60743, term60743.getClass(), "coalescingEnabled", false);
        setBooleanField(term60743, term60743.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60743, term60743.getClass(), "componentSerializedDataVersion", 0);
        setField(term60743, term60743.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Dimension");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "outerScrollPane", argTypes, term60743, args);
    }

};


