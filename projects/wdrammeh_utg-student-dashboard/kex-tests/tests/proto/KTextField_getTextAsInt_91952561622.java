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

public class KTextField_getTextAsInt_91952561622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9581;

    public KTextField_getTextAsInt_91952561622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9581 = newInstance(Class.forName("proto.KTextField"));
        setField(term9581, term9581.getClass(), "action", null);
        setField(term9581, term9581.getClass(), "actionPropertyChangeListener", null);
        setField(term9581, term9581.getClass(), "visibility", null);
        setIntField(term9581, term9581.getClass(), "horizontalAlignment", 0);
        setIntField(term9581, term9581.getClass(), "columns", 0);
        setIntField(term9581, term9581.getClass(), "columnWidth", 0);
        setField(term9581, term9581.getClass(), "command", null);
        setField(term9581, term9581.getClass(), "model", null);
        setField(term9581, term9581.getClass(), "caret", null);
        setField(term9581, term9581.getClass(), "navigationFilter", null);
        setField(term9581, term9581.getClass(), "highlighter", null);
        setField(term9581, term9581.getClass(), "keymap", null);
        setField(term9581, term9581.getClass(), "caretEvent", null);
        setField(term9581, term9581.getClass(), "caretColor", null);
        setField(term9581, term9581.getClass(), "selectionColor", null);
        setField(term9581, term9581.getClass(), "selectedTextColor", null);
        setField(term9581, term9581.getClass(), "disabledTextColor", null);
        setBooleanField(term9581, term9581.getClass(), "editable", false);
        setField(term9581, term9581.getClass(), "margin", null);
        setCharField(term9581, term9581.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9581, term9581.getClass(), "dragEnabled", false);
        setField(term9581, term9581.getClass(), "dropMode", null);
        setField(term9581, term9581.getClass(), "dropLocation", null);
        setField(term9581, term9581.getClass(), "inputMethodRequestsHandler", null);
        setField(term9581, term9581.getClass(), "composedTextAttribute", null);
        setField(term9581, term9581.getClass(), "composedTextContent", null);
        setField(term9581, term9581.getClass(), "composedTextStart", null);
        setField(term9581, term9581.getClass(), "composedTextEnd", null);
        setField(term9581, term9581.getClass(), "latestCommittedTextStart", null);
        setField(term9581, term9581.getClass(), "latestCommittedTextEnd", null);
        setField(term9581, term9581.getClass(), "composedTextCaret", null);
        setField(term9581, term9581.getClass(), "originalCaret", null);
        setBooleanField(term9581, term9581.getClass(), "checkedInputOverride", false);
        setBooleanField(term9581, term9581.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9581, term9581.getClass(), "isAlignmentXSet", false);
        setFloatField(term9581, term9581.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9581, term9581.getClass(), "isAlignmentYSet", false);
        setFloatField(term9581, term9581.getClass(), "alignmentY", 0.0F);
        setField(term9581, term9581.getClass(), "ui", null);
        setField(term9581, term9581.getClass(), "listenerList", null);
        setField(term9581, term9581.getClass(), "clientProperties", null);
        setField(term9581, term9581.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9581, term9581.getClass(), "autoscrolls", false);
        setField(term9581, term9581.getClass(), "border", null);
        setIntField(term9581, term9581.getClass(), "flags", 0);
        setField(term9581, term9581.getClass(), "inputVerifier", null);
        setBooleanField(term9581, term9581.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9581, term9581.getClass(), "paintingChild", null);
        setField(term9581, term9581.getClass(), "popupMenu", null);
        setField(term9581, term9581.getClass(), "revalidateRunnableScheduled", null);
        setField(term9581, term9581.getClass(), "focusInputMap", null);
        setField(term9581, term9581.getClass(), "ancestorInputMap", null);
        setField(term9581, term9581.getClass(), "windowInputMap", null);
        setField(term9581, term9581.getClass(), "actionMap", null);
        setField(term9581, term9581.getClass(), "aaHint", null);
        setField(term9581, term9581.getClass(), "lcdRenderingHint", null);
        setField(term9581, term9581.getClass(), "component", null);
        setField(term9581, term9581.getClass(), "layoutMgr", null);
        setField(term9581, term9581.getClass(), "dispatcher", null);
        setField(term9581, term9581.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9581, term9581.getClass(), "focusCycleRoot", false);
        setBooleanField(term9581, term9581.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9581, term9581.getClass(), "printingThreads", null);
        setBooleanField(term9581, term9581.getClass(), "printing", false);
        setField(term9581, term9581.getClass(), "containerListener", null);
        setIntField(term9581, term9581.getClass(), "listeningChildren", 0);
        setIntField(term9581, term9581.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9581, term9581.getClass(), "descendantsCount", 0);
        setField(term9581, term9581.getClass(), "preserveBackgroundColor", null);
        setIntField(term9581, term9581.getClass(), "numOfHWComponents", 0);
        setIntField(term9581, term9581.getClass(), "numOfLWComponents", 0);
        setField(term9581, term9581.getClass(), "modalComp", null);
        setField(term9581, term9581.getClass(), "modalAppContext", null);
        setIntField(term9581, term9581.getClass(), "containerSerializedDataVersion", 0);
        setField(term9581, term9581.getClass(), "peer", null);
        setField(term9581, term9581.getClass(), "parent", null);
        setField(term9581, term9581.getClass(), "appContext", null);
        setIntField(term9581, term9581.getClass(), "x", 0);
        setIntField(term9581, term9581.getClass(), "y", 0);
        setIntField(term9581, term9581.getClass(), "width", 0);
        setIntField(term9581, term9581.getClass(), "height", 0);
        setField(term9581, term9581.getClass(), "foreground", null);
        setField(term9581, term9581.getClass(), "background", null);
        setField(term9581, term9581.getClass(), "font", null);
        setField(term9581, term9581.getClass(), "peerFont", null);
        setField(term9581, term9581.getClass(), "cursor", null);
        setField(term9581, term9581.getClass(), "locale", null);
        setField(term9581, term9581.getClass(), "graphicsConfig", null);
        setField(term9581, term9581.getClass(), "bufferStrategy", null);
        setBooleanField(term9581, term9581.getClass(), "ignoreRepaint", false);
        setBooleanField(term9581, term9581.getClass(), "visible", false);
        setBooleanField(term9581, term9581.getClass(), "enabled", false);
        setBooleanField(term9581, term9581.getClass(), "valid", false);
        setField(term9581, term9581.getClass(), "dropTarget", null);
        setField(term9581, term9581.getClass(), "popups", null);
        setField(term9581, term9581.getClass(), "name", null);
        setBooleanField(term9581, term9581.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9581, term9581.getClass(), "focusable", false);
        setIntField(term9581, term9581.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9581, term9581.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9581, term9581.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9581, term9581.getClass(), "acc", null);
        setField(term9581, term9581.getClass(), "minSize", null);
        setBooleanField(term9581, term9581.getClass(), "minSizeSet", false);
        setField(term9581, term9581.getClass(), "prefSize", null);
        setBooleanField(term9581, term9581.getClass(), "prefSizeSet", false);
        setField(term9581, term9581.getClass(), "maxSize", null);
        setBooleanField(term9581, term9581.getClass(), "maxSizeSet", false);
        setField(term9581, term9581.getClass(), "componentOrientation", null);
        setBooleanField(term9581, term9581.getClass(), "newEventsOnly", false);
        setField(term9581, term9581.getClass(), "componentListener", null);
        setField(term9581, term9581.getClass(), "focusListener", null);
        setField(term9581, term9581.getClass(), "hierarchyListener", null);
        setField(term9581, term9581.getClass(), "hierarchyBoundsListener", null);
        setField(term9581, term9581.getClass(), "keyListener", null);
        setField(term9581, term9581.getClass(), "mouseListener", null);
        setField(term9581, term9581.getClass(), "mouseMotionListener", null);
        setField(term9581, term9581.getClass(), "mouseWheelListener", null);
        setField(term9581, term9581.getClass(), "inputMethodListener", null);
        setLongField(term9581, term9581.getClass(), "eventMask", 0L);
        setField(term9581, term9581.getClass(), "changeSupport", null);
        setField(term9581, term9581.getClass(), "objectLock", null);
        setBooleanField(term9581, term9581.getClass(), "isPacked", false);
        setIntField(term9581, term9581.getClass(), "boundsOp", 0);
        setField(term9581, term9581.getClass(), "compoundShape", null);
        setField(term9581, term9581.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9581, term9581.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9581, term9581.getClass(), "backgroundEraseDisabled", false);
        setField(term9581, term9581.getClass(), "eventCache", null);
        setBooleanField(term9581, term9581.getClass(), "coalescingEnabled", false);
        setBooleanField(term9581, term9581.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9581, term9581.getClass(), "componentSerializedDataVersion", 0);
        setField(term9581, term9581.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTextAsInt", argTypes, term9581, args);
    }

};


