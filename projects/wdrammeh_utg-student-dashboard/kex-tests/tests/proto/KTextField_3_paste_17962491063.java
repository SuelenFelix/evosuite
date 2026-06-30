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
     Object term43369;

    public KTextField_3_paste_17962491063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43369 = newInstance(Class.forName("proto.KTextField$3"));
        setField(term43369, term43369.getClass(), "action", null);
        setField(term43369, term43369.getClass(), "actionPropertyChangeListener", null);
        setField(term43369, term43369.getClass(), "visibility", null);
        setIntField(term43369, term43369.getClass(), "horizontalAlignment", 0);
        setIntField(term43369, term43369.getClass(), "columns", 0);
        setIntField(term43369, term43369.getClass(), "columnWidth", 0);
        setField(term43369, term43369.getClass(), "command", null);
        setField(term43369, term43369.getClass(), "model", null);
        setField(term43369, term43369.getClass(), "caret", null);
        setField(term43369, term43369.getClass(), "navigationFilter", null);
        setField(term43369, term43369.getClass(), "highlighter", null);
        setField(term43369, term43369.getClass(), "keymap", null);
        setField(term43369, term43369.getClass(), "caretEvent", null);
        setField(term43369, term43369.getClass(), "caretColor", null);
        setField(term43369, term43369.getClass(), "selectionColor", null);
        setField(term43369, term43369.getClass(), "selectedTextColor", null);
        setField(term43369, term43369.getClass(), "disabledTextColor", null);
        setBooleanField(term43369, term43369.getClass(), "editable", false);
        setField(term43369, term43369.getClass(), "margin", null);
        setCharField(term43369, term43369.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term43369, term43369.getClass(), "dragEnabled", false);
        setField(term43369, term43369.getClass(), "dropMode", null);
        setField(term43369, term43369.getClass(), "dropLocation", null);
        setField(term43369, term43369.getClass(), "inputMethodRequestsHandler", null);
        setField(term43369, term43369.getClass(), "composedTextAttribute", null);
        setField(term43369, term43369.getClass(), "composedTextContent", null);
        setField(term43369, term43369.getClass(), "composedTextStart", null);
        setField(term43369, term43369.getClass(), "composedTextEnd", null);
        setField(term43369, term43369.getClass(), "latestCommittedTextStart", null);
        setField(term43369, term43369.getClass(), "latestCommittedTextEnd", null);
        setField(term43369, term43369.getClass(), "composedTextCaret", null);
        setField(term43369, term43369.getClass(), "originalCaret", null);
        setBooleanField(term43369, term43369.getClass(), "checkedInputOverride", false);
        setBooleanField(term43369, term43369.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term43369, term43369.getClass(), "isAlignmentXSet", false);
        setFloatField(term43369, term43369.getClass(), "alignmentX", 0.0F);
        setBooleanField(term43369, term43369.getClass(), "isAlignmentYSet", false);
        setFloatField(term43369, term43369.getClass(), "alignmentY", 0.0F);
        setField(term43369, term43369.getClass(), "ui", null);
        setField(term43369, term43369.getClass(), "listenerList", null);
        setField(term43369, term43369.getClass(), "clientProperties", null);
        setField(term43369, term43369.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term43369, term43369.getClass(), "autoscrolls", false);
        setField(term43369, term43369.getClass(), "border", null);
        setIntField(term43369, term43369.getClass(), "flags", 0);
        setField(term43369, term43369.getClass(), "inputVerifier", null);
        setBooleanField(term43369, term43369.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term43369, term43369.getClass(), "paintingChild", null);
        setField(term43369, term43369.getClass(), "popupMenu", null);
        setField(term43369, term43369.getClass(), "revalidateRunnableScheduled", null);
        setField(term43369, term43369.getClass(), "focusInputMap", null);
        setField(term43369, term43369.getClass(), "ancestorInputMap", null);
        setField(term43369, term43369.getClass(), "windowInputMap", null);
        setField(term43369, term43369.getClass(), "actionMap", null);
        setField(term43369, term43369.getClass(), "aaHint", null);
        setField(term43369, term43369.getClass(), "lcdRenderingHint", null);
        setField(term43369, term43369.getClass(), "component", null);
        setField(term43369, term43369.getClass(), "layoutMgr", null);
        setField(term43369, term43369.getClass(), "dispatcher", null);
        setField(term43369, term43369.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term43369, term43369.getClass(), "focusCycleRoot", false);
        setBooleanField(term43369, term43369.getClass(), "focusTraversalPolicyProvider", false);
        setField(term43369, term43369.getClass(), "printingThreads", null);
        setBooleanField(term43369, term43369.getClass(), "printing", false);
        setField(term43369, term43369.getClass(), "containerListener", null);
        setIntField(term43369, term43369.getClass(), "listeningChildren", 0);
        setIntField(term43369, term43369.getClass(), "listeningBoundsChildren", 0);
        setIntField(term43369, term43369.getClass(), "descendantsCount", 0);
        setField(term43369, term43369.getClass(), "preserveBackgroundColor", null);
        setIntField(term43369, term43369.getClass(), "numOfHWComponents", 0);
        setIntField(term43369, term43369.getClass(), "numOfLWComponents", 0);
        setField(term43369, term43369.getClass(), "modalComp", null);
        setField(term43369, term43369.getClass(), "modalAppContext", null);
        setIntField(term43369, term43369.getClass(), "containerSerializedDataVersion", 0);
        setField(term43369, term43369.getClass(), "peer", null);
        setField(term43369, term43369.getClass(), "parent", null);
        setField(term43369, term43369.getClass(), "appContext", null);
        setIntField(term43369, term43369.getClass(), "x", 0);
        setIntField(term43369, term43369.getClass(), "y", 0);
        setIntField(term43369, term43369.getClass(), "width", 0);
        setIntField(term43369, term43369.getClass(), "height", 0);
        setField(term43369, term43369.getClass(), "foreground", null);
        setField(term43369, term43369.getClass(), "background", null);
        setField(term43369, term43369.getClass(), "font", null);
        setField(term43369, term43369.getClass(), "peerFont", null);
        setField(term43369, term43369.getClass(), "cursor", null);
        setField(term43369, term43369.getClass(), "locale", null);
        setField(term43369, term43369.getClass(), "graphicsConfig", null);
        setField(term43369, term43369.getClass(), "bufferStrategy", null);
        setBooleanField(term43369, term43369.getClass(), "ignoreRepaint", false);
        setBooleanField(term43369, term43369.getClass(), "visible", false);
        setBooleanField(term43369, term43369.getClass(), "enabled", false);
        setBooleanField(term43369, term43369.getClass(), "valid", false);
        setField(term43369, term43369.getClass(), "dropTarget", null);
        setField(term43369, term43369.getClass(), "popups", null);
        setField(term43369, term43369.getClass(), "name", null);
        setBooleanField(term43369, term43369.getClass(), "nameExplicitlySet", false);
        setBooleanField(term43369, term43369.getClass(), "focusable", false);
        setIntField(term43369, term43369.getClass(), "isFocusTraversableOverridden", 0);
        setField(term43369, term43369.getClass(), "focusTraversalKeys", null);
        setBooleanField(term43369, term43369.getClass(), "focusTraversalKeysEnabled", false);
        setField(term43369, term43369.getClass(), "acc", null);
        setField(term43369, term43369.getClass(), "minSize", null);
        setBooleanField(term43369, term43369.getClass(), "minSizeSet", false);
        setField(term43369, term43369.getClass(), "prefSize", null);
        setBooleanField(term43369, term43369.getClass(), "prefSizeSet", false);
        setField(term43369, term43369.getClass(), "maxSize", null);
        setBooleanField(term43369, term43369.getClass(), "maxSizeSet", false);
        setField(term43369, term43369.getClass(), "componentOrientation", null);
        setBooleanField(term43369, term43369.getClass(), "newEventsOnly", false);
        setField(term43369, term43369.getClass(), "componentListener", null);
        setField(term43369, term43369.getClass(), "focusListener", null);
        setField(term43369, term43369.getClass(), "hierarchyListener", null);
        setField(term43369, term43369.getClass(), "hierarchyBoundsListener", null);
        setField(term43369, term43369.getClass(), "keyListener", null);
        setField(term43369, term43369.getClass(), "mouseListener", null);
        setField(term43369, term43369.getClass(), "mouseMotionListener", null);
        setField(term43369, term43369.getClass(), "mouseWheelListener", null);
        setField(term43369, term43369.getClass(), "inputMethodListener", null);
        setLongField(term43369, term43369.getClass(), "eventMask", 0L);
        setField(term43369, term43369.getClass(), "changeSupport", null);
        setField(term43369, term43369.getClass(), "objectLock", null);
        setBooleanField(term43369, term43369.getClass(), "isPacked", false);
        setIntField(term43369, term43369.getClass(), "boundsOp", 0);
        setField(term43369, term43369.getClass(), "compoundShape", null);
        setField(term43369, term43369.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term43369, term43369.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term43369, term43369.getClass(), "backgroundEraseDisabled", false);
        setField(term43369, term43369.getClass(), "eventCache", null);
        setBooleanField(term43369, term43369.getClass(), "coalescingEnabled", false);
        setBooleanField(term43369, term43369.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term43369, term43369.getClass(), "componentSerializedDataVersion", 0);
        setField(term43369, term43369.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField$3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paste", argTypes, term43369, args);
    }

};


