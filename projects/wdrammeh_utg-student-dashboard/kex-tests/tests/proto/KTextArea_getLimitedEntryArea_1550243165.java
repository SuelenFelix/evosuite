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
     Object term60738;
     Object term60790;

    public KTextArea_getLimitedEntryArea_1550243165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60738 = newInstance(Class.forName("proto.KTextArea"));
        setIntField(term60738, term60738.getClass(), "rows", 0);
        setIntField(term60738, term60738.getClass(), "columns", 0);
        setIntField(term60738, term60738.getClass(), "columnWidth", 0);
        setIntField(term60738, term60738.getClass(), "rowHeight", 0);
        setBooleanField(term60738, term60738.getClass(), "wrap", false);
        setBooleanField(term60738, term60738.getClass(), "word", false);
        setField(term60738, term60738.getClass(), "model", null);
        setField(term60738, term60738.getClass(), "caret", null);
        setField(term60738, term60738.getClass(), "navigationFilter", null);
        setField(term60738, term60738.getClass(), "highlighter", null);
        setField(term60738, term60738.getClass(), "keymap", null);
        setField(term60738, term60738.getClass(), "caretEvent", null);
        setField(term60738, term60738.getClass(), "caretColor", null);
        setField(term60738, term60738.getClass(), "selectionColor", null);
        setField(term60738, term60738.getClass(), "selectedTextColor", null);
        setField(term60738, term60738.getClass(), "disabledTextColor", null);
        setBooleanField(term60738, term60738.getClass(), "editable", false);
        setField(term60738, term60738.getClass(), "margin", null);
        setCharField(term60738, term60738.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60738, term60738.getClass(), "dragEnabled", false);
        setField(term60738, term60738.getClass(), "dropMode", null);
        setField(term60738, term60738.getClass(), "dropLocation", null);
        setField(term60738, term60738.getClass(), "inputMethodRequestsHandler", null);
        setField(term60738, term60738.getClass(), "composedTextAttribute", null);
        setField(term60738, term60738.getClass(), "composedTextContent", null);
        setField(term60738, term60738.getClass(), "composedTextStart", null);
        setField(term60738, term60738.getClass(), "composedTextEnd", null);
        setField(term60738, term60738.getClass(), "latestCommittedTextStart", null);
        setField(term60738, term60738.getClass(), "latestCommittedTextEnd", null);
        setField(term60738, term60738.getClass(), "composedTextCaret", null);
        setField(term60738, term60738.getClass(), "originalCaret", null);
        setBooleanField(term60738, term60738.getClass(), "checkedInputOverride", false);
        setBooleanField(term60738, term60738.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60738, term60738.getClass(), "isAlignmentXSet", false);
        setFloatField(term60738, term60738.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60738, term60738.getClass(), "isAlignmentYSet", false);
        setFloatField(term60738, term60738.getClass(), "alignmentY", 0.0F);
        setField(term60738, term60738.getClass(), "ui", null);
        setField(term60738, term60738.getClass(), "listenerList", null);
        setField(term60738, term60738.getClass(), "clientProperties", null);
        setField(term60738, term60738.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60738, term60738.getClass(), "autoscrolls", false);
        setField(term60738, term60738.getClass(), "border", null);
        setIntField(term60738, term60738.getClass(), "flags", 0);
        setField(term60738, term60738.getClass(), "inputVerifier", null);
        setBooleanField(term60738, term60738.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60738, term60738.getClass(), "paintingChild", null);
        setField(term60738, term60738.getClass(), "popupMenu", null);
        setField(term60738, term60738.getClass(), "revalidateRunnableScheduled", null);
        setField(term60738, term60738.getClass(), "focusInputMap", null);
        setField(term60738, term60738.getClass(), "ancestorInputMap", null);
        setField(term60738, term60738.getClass(), "windowInputMap", null);
        setField(term60738, term60738.getClass(), "actionMap", null);
        setField(term60738, term60738.getClass(), "aaHint", null);
        setField(term60738, term60738.getClass(), "lcdRenderingHint", null);
        setField(term60738, term60738.getClass(), "component", null);
        setField(term60738, term60738.getClass(), "layoutMgr", null);
        setField(term60738, term60738.getClass(), "dispatcher", null);
        setField(term60738, term60738.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60738, term60738.getClass(), "focusCycleRoot", false);
        setBooleanField(term60738, term60738.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60738, term60738.getClass(), "printingThreads", null);
        setBooleanField(term60738, term60738.getClass(), "printing", false);
        setField(term60738, term60738.getClass(), "containerListener", null);
        setIntField(term60738, term60738.getClass(), "listeningChildren", 0);
        setIntField(term60738, term60738.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60738, term60738.getClass(), "descendantsCount", 0);
        setField(term60738, term60738.getClass(), "preserveBackgroundColor", null);
        setIntField(term60738, term60738.getClass(), "numOfHWComponents", 0);
        setIntField(term60738, term60738.getClass(), "numOfLWComponents", 0);
        setField(term60738, term60738.getClass(), "modalComp", null);
        setField(term60738, term60738.getClass(), "modalAppContext", null);
        setIntField(term60738, term60738.getClass(), "containerSerializedDataVersion", 0);
        setField(term60738, term60738.getClass(), "peer", null);
        setField(term60738, term60738.getClass(), "parent", null);
        setField(term60738, term60738.getClass(), "appContext", null);
        setIntField(term60738, term60738.getClass(), "x", 0);
        setIntField(term60738, term60738.getClass(), "y", 0);
        setIntField(term60738, term60738.getClass(), "width", 0);
        setIntField(term60738, term60738.getClass(), "height", 0);
        setField(term60738, term60738.getClass(), "foreground", null);
        setField(term60738, term60738.getClass(), "background", null);
        setField(term60738, term60738.getClass(), "font", null);
        setField(term60738, term60738.getClass(), "peerFont", null);
        setField(term60738, term60738.getClass(), "cursor", null);
        setField(term60738, term60738.getClass(), "locale", null);
        setField(term60738, term60738.getClass(), "graphicsConfig", null);
        setField(term60738, term60738.getClass(), "bufferStrategy", null);
        setBooleanField(term60738, term60738.getClass(), "ignoreRepaint", false);
        setBooleanField(term60738, term60738.getClass(), "visible", false);
        setBooleanField(term60738, term60738.getClass(), "enabled", false);
        setBooleanField(term60738, term60738.getClass(), "valid", false);
        setField(term60738, term60738.getClass(), "dropTarget", null);
        setField(term60738, term60738.getClass(), "popups", null);
        setField(term60738, term60738.getClass(), "name", null);
        setBooleanField(term60738, term60738.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60738, term60738.getClass(), "focusable", false);
        setIntField(term60738, term60738.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60738, term60738.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60738, term60738.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60738, term60738.getClass(), "acc", null);
        setField(term60738, term60738.getClass(), "minSize", null);
        setBooleanField(term60738, term60738.getClass(), "minSizeSet", false);
        setField(term60738, term60738.getClass(), "prefSize", null);
        setBooleanField(term60738, term60738.getClass(), "prefSizeSet", false);
        setField(term60738, term60738.getClass(), "maxSize", null);
        setBooleanField(term60738, term60738.getClass(), "maxSizeSet", false);
        setField(term60738, term60738.getClass(), "componentOrientation", null);
        setBooleanField(term60738, term60738.getClass(), "newEventsOnly", false);
        setField(term60738, term60738.getClass(), "componentListener", null);
        setField(term60738, term60738.getClass(), "focusListener", null);
        setField(term60738, term60738.getClass(), "hierarchyListener", null);
        setField(term60738, term60738.getClass(), "hierarchyBoundsListener", null);
        setField(term60738, term60738.getClass(), "keyListener", null);
        setField(term60738, term60738.getClass(), "mouseListener", null);
        setField(term60738, term60738.getClass(), "mouseMotionListener", null);
        setField(term60738, term60738.getClass(), "mouseWheelListener", null);
        setField(term60738, term60738.getClass(), "inputMethodListener", null);
        setLongField(term60738, term60738.getClass(), "eventMask", 0L);
        setField(term60738, term60738.getClass(), "changeSupport", null);
        setField(term60738, term60738.getClass(), "objectLock", null);
        setBooleanField(term60738, term60738.getClass(), "isPacked", false);
        setIntField(term60738, term60738.getClass(), "boundsOp", 0);
        setField(term60738, term60738.getClass(), "compoundShape", null);
        setField(term60738, term60738.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60738, term60738.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60738, term60738.getClass(), "backgroundEraseDisabled", false);
        setField(term60738, term60738.getClass(), "eventCache", null);
        setBooleanField(term60738, term60738.getClass(), "coalescingEnabled", false);
        setBooleanField(term60738, term60738.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60738, term60738.getClass(), "componentSerializedDataVersion", 0);
        setField(term60738, term60738.getClass(), "accessibleContext", null);
        term60790 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60790;
        callMethod(klass, "getLimitedEntryArea", argTypes, term60738, args);
    }

};


