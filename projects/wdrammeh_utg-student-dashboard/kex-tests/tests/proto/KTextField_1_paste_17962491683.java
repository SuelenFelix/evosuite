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
     Object term47699;

    public KTextField_1_paste_17962491683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47699 = newInstance(Class.forName("proto.KTextField$1"));
        setField(term47699, term47699.getClass(), "action", null);
        setField(term47699, term47699.getClass(), "actionPropertyChangeListener", null);
        setField(term47699, term47699.getClass(), "visibility", null);
        setIntField(term47699, term47699.getClass(), "horizontalAlignment", 0);
        setIntField(term47699, term47699.getClass(), "columns", 0);
        setIntField(term47699, term47699.getClass(), "columnWidth", 0);
        setField(term47699, term47699.getClass(), "command", null);
        setField(term47699, term47699.getClass(), "model", null);
        setField(term47699, term47699.getClass(), "caret", null);
        setField(term47699, term47699.getClass(), "navigationFilter", null);
        setField(term47699, term47699.getClass(), "highlighter", null);
        setField(term47699, term47699.getClass(), "keymap", null);
        setField(term47699, term47699.getClass(), "caretEvent", null);
        setField(term47699, term47699.getClass(), "caretColor", null);
        setField(term47699, term47699.getClass(), "selectionColor", null);
        setField(term47699, term47699.getClass(), "selectedTextColor", null);
        setField(term47699, term47699.getClass(), "disabledTextColor", null);
        setBooleanField(term47699, term47699.getClass(), "editable", false);
        setField(term47699, term47699.getClass(), "margin", null);
        setCharField(term47699, term47699.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term47699, term47699.getClass(), "dragEnabled", false);
        setField(term47699, term47699.getClass(), "dropMode", null);
        setField(term47699, term47699.getClass(), "dropLocation", null);
        setField(term47699, term47699.getClass(), "inputMethodRequestsHandler", null);
        setField(term47699, term47699.getClass(), "composedTextAttribute", null);
        setField(term47699, term47699.getClass(), "composedTextContent", null);
        setField(term47699, term47699.getClass(), "composedTextStart", null);
        setField(term47699, term47699.getClass(), "composedTextEnd", null);
        setField(term47699, term47699.getClass(), "latestCommittedTextStart", null);
        setField(term47699, term47699.getClass(), "latestCommittedTextEnd", null);
        setField(term47699, term47699.getClass(), "composedTextCaret", null);
        setField(term47699, term47699.getClass(), "originalCaret", null);
        setBooleanField(term47699, term47699.getClass(), "checkedInputOverride", false);
        setBooleanField(term47699, term47699.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term47699, term47699.getClass(), "isAlignmentXSet", false);
        setFloatField(term47699, term47699.getClass(), "alignmentX", 0.0F);
        setBooleanField(term47699, term47699.getClass(), "isAlignmentYSet", false);
        setFloatField(term47699, term47699.getClass(), "alignmentY", 0.0F);
        setField(term47699, term47699.getClass(), "ui", null);
        setField(term47699, term47699.getClass(), "listenerList", null);
        setField(term47699, term47699.getClass(), "clientProperties", null);
        setField(term47699, term47699.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term47699, term47699.getClass(), "autoscrolls", false);
        setField(term47699, term47699.getClass(), "border", null);
        setIntField(term47699, term47699.getClass(), "flags", 0);
        setField(term47699, term47699.getClass(), "inputVerifier", null);
        setBooleanField(term47699, term47699.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term47699, term47699.getClass(), "paintingChild", null);
        setField(term47699, term47699.getClass(), "popupMenu", null);
        setField(term47699, term47699.getClass(), "revalidateRunnableScheduled", null);
        setField(term47699, term47699.getClass(), "focusInputMap", null);
        setField(term47699, term47699.getClass(), "ancestorInputMap", null);
        setField(term47699, term47699.getClass(), "windowInputMap", null);
        setField(term47699, term47699.getClass(), "actionMap", null);
        setField(term47699, term47699.getClass(), "aaHint", null);
        setField(term47699, term47699.getClass(), "lcdRenderingHint", null);
        setField(term47699, term47699.getClass(), "component", null);
        setField(term47699, term47699.getClass(), "layoutMgr", null);
        setField(term47699, term47699.getClass(), "dispatcher", null);
        setField(term47699, term47699.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term47699, term47699.getClass(), "focusCycleRoot", false);
        setBooleanField(term47699, term47699.getClass(), "focusTraversalPolicyProvider", false);
        setField(term47699, term47699.getClass(), "printingThreads", null);
        setBooleanField(term47699, term47699.getClass(), "printing", false);
        setField(term47699, term47699.getClass(), "containerListener", null);
        setIntField(term47699, term47699.getClass(), "listeningChildren", 0);
        setIntField(term47699, term47699.getClass(), "listeningBoundsChildren", 0);
        setIntField(term47699, term47699.getClass(), "descendantsCount", 0);
        setField(term47699, term47699.getClass(), "preserveBackgroundColor", null);
        setIntField(term47699, term47699.getClass(), "numOfHWComponents", 0);
        setIntField(term47699, term47699.getClass(), "numOfLWComponents", 0);
        setField(term47699, term47699.getClass(), "modalComp", null);
        setField(term47699, term47699.getClass(), "modalAppContext", null);
        setIntField(term47699, term47699.getClass(), "containerSerializedDataVersion", 0);
        setField(term47699, term47699.getClass(), "peer", null);
        setField(term47699, term47699.getClass(), "parent", null);
        setField(term47699, term47699.getClass(), "appContext", null);
        setIntField(term47699, term47699.getClass(), "x", 0);
        setIntField(term47699, term47699.getClass(), "y", 0);
        setIntField(term47699, term47699.getClass(), "width", 0);
        setIntField(term47699, term47699.getClass(), "height", 0);
        setField(term47699, term47699.getClass(), "foreground", null);
        setField(term47699, term47699.getClass(), "background", null);
        setField(term47699, term47699.getClass(), "font", null);
        setField(term47699, term47699.getClass(), "peerFont", null);
        setField(term47699, term47699.getClass(), "cursor", null);
        setField(term47699, term47699.getClass(), "locale", null);
        setField(term47699, term47699.getClass(), "graphicsConfig", null);
        setField(term47699, term47699.getClass(), "bufferStrategy", null);
        setBooleanField(term47699, term47699.getClass(), "ignoreRepaint", false);
        setBooleanField(term47699, term47699.getClass(), "visible", false);
        setBooleanField(term47699, term47699.getClass(), "enabled", false);
        setBooleanField(term47699, term47699.getClass(), "valid", false);
        setField(term47699, term47699.getClass(), "dropTarget", null);
        setField(term47699, term47699.getClass(), "popups", null);
        setField(term47699, term47699.getClass(), "name", null);
        setBooleanField(term47699, term47699.getClass(), "nameExplicitlySet", false);
        setBooleanField(term47699, term47699.getClass(), "focusable", false);
        setIntField(term47699, term47699.getClass(), "isFocusTraversableOverridden", 0);
        setField(term47699, term47699.getClass(), "focusTraversalKeys", null);
        setBooleanField(term47699, term47699.getClass(), "focusTraversalKeysEnabled", false);
        setField(term47699, term47699.getClass(), "acc", null);
        setField(term47699, term47699.getClass(), "minSize", null);
        setBooleanField(term47699, term47699.getClass(), "minSizeSet", false);
        setField(term47699, term47699.getClass(), "prefSize", null);
        setBooleanField(term47699, term47699.getClass(), "prefSizeSet", false);
        setField(term47699, term47699.getClass(), "maxSize", null);
        setBooleanField(term47699, term47699.getClass(), "maxSizeSet", false);
        setField(term47699, term47699.getClass(), "componentOrientation", null);
        setBooleanField(term47699, term47699.getClass(), "newEventsOnly", false);
        setField(term47699, term47699.getClass(), "componentListener", null);
        setField(term47699, term47699.getClass(), "focusListener", null);
        setField(term47699, term47699.getClass(), "hierarchyListener", null);
        setField(term47699, term47699.getClass(), "hierarchyBoundsListener", null);
        setField(term47699, term47699.getClass(), "keyListener", null);
        setField(term47699, term47699.getClass(), "mouseListener", null);
        setField(term47699, term47699.getClass(), "mouseMotionListener", null);
        setField(term47699, term47699.getClass(), "mouseWheelListener", null);
        setField(term47699, term47699.getClass(), "inputMethodListener", null);
        setLongField(term47699, term47699.getClass(), "eventMask", 0L);
        setField(term47699, term47699.getClass(), "changeSupport", null);
        setField(term47699, term47699.getClass(), "objectLock", null);
        setBooleanField(term47699, term47699.getClass(), "isPacked", false);
        setIntField(term47699, term47699.getClass(), "boundsOp", 0);
        setField(term47699, term47699.getClass(), "compoundShape", null);
        setField(term47699, term47699.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term47699, term47699.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term47699, term47699.getClass(), "backgroundEraseDisabled", false);
        setField(term47699, term47699.getClass(), "eventCache", null);
        setBooleanField(term47699, term47699.getClass(), "coalescingEnabled", false);
        setBooleanField(term47699, term47699.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term47699, term47699.getClass(), "componentSerializedDataVersion", 0);
        setField(term47699, term47699.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paste", argTypes, term47699, args);
    }

};


