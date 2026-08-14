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

public class KTextField_isBlank_69015622424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9679;

    public KTextField_isBlank_69015622424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9679 = newInstance(Class.forName("proto.KTextField"));
        setField(term9679, term9679.getClass(), "action", null);
        setField(term9679, term9679.getClass(), "actionPropertyChangeListener", null);
        setField(term9679, term9679.getClass(), "visibility", null);
        setIntField(term9679, term9679.getClass(), "horizontalAlignment", 0);
        setIntField(term9679, term9679.getClass(), "columns", 0);
        setIntField(term9679, term9679.getClass(), "columnWidth", 0);
        setField(term9679, term9679.getClass(), "command", null);
        setField(term9679, term9679.getClass(), "model", null);
        setField(term9679, term9679.getClass(), "caret", null);
        setField(term9679, term9679.getClass(), "navigationFilter", null);
        setField(term9679, term9679.getClass(), "highlighter", null);
        setField(term9679, term9679.getClass(), "keymap", null);
        setField(term9679, term9679.getClass(), "caretEvent", null);
        setField(term9679, term9679.getClass(), "caretColor", null);
        setField(term9679, term9679.getClass(), "selectionColor", null);
        setField(term9679, term9679.getClass(), "selectedTextColor", null);
        setField(term9679, term9679.getClass(), "disabledTextColor", null);
        setBooleanField(term9679, term9679.getClass(), "editable", false);
        setField(term9679, term9679.getClass(), "margin", null);
        setCharField(term9679, term9679.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9679, term9679.getClass(), "dragEnabled", false);
        setField(term9679, term9679.getClass(), "dropMode", null);
        setField(term9679, term9679.getClass(), "dropLocation", null);
        setField(term9679, term9679.getClass(), "inputMethodRequestsHandler", null);
        setField(term9679, term9679.getClass(), "composedTextAttribute", null);
        setField(term9679, term9679.getClass(), "composedTextContent", null);
        setField(term9679, term9679.getClass(), "composedTextStart", null);
        setField(term9679, term9679.getClass(), "composedTextEnd", null);
        setField(term9679, term9679.getClass(), "latestCommittedTextStart", null);
        setField(term9679, term9679.getClass(), "latestCommittedTextEnd", null);
        setField(term9679, term9679.getClass(), "composedTextCaret", null);
        setField(term9679, term9679.getClass(), "originalCaret", null);
        setBooleanField(term9679, term9679.getClass(), "checkedInputOverride", false);
        setBooleanField(term9679, term9679.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9679, term9679.getClass(), "isAlignmentXSet", false);
        setFloatField(term9679, term9679.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9679, term9679.getClass(), "isAlignmentYSet", false);
        setFloatField(term9679, term9679.getClass(), "alignmentY", 0.0F);
        setField(term9679, term9679.getClass(), "ui", null);
        setField(term9679, term9679.getClass(), "listenerList", null);
        setField(term9679, term9679.getClass(), "clientProperties", null);
        setField(term9679, term9679.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9679, term9679.getClass(), "autoscrolls", false);
        setField(term9679, term9679.getClass(), "border", null);
        setIntField(term9679, term9679.getClass(), "flags", 0);
        setField(term9679, term9679.getClass(), "inputVerifier", null);
        setBooleanField(term9679, term9679.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9679, term9679.getClass(), "paintingChild", null);
        setField(term9679, term9679.getClass(), "popupMenu", null);
        setField(term9679, term9679.getClass(), "revalidateRunnableScheduled", null);
        setField(term9679, term9679.getClass(), "focusInputMap", null);
        setField(term9679, term9679.getClass(), "ancestorInputMap", null);
        setField(term9679, term9679.getClass(), "windowInputMap", null);
        setField(term9679, term9679.getClass(), "actionMap", null);
        setField(term9679, term9679.getClass(), "aaHint", null);
        setField(term9679, term9679.getClass(), "lcdRenderingHint", null);
        setField(term9679, term9679.getClass(), "component", null);
        setField(term9679, term9679.getClass(), "layoutMgr", null);
        setField(term9679, term9679.getClass(), "dispatcher", null);
        setField(term9679, term9679.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9679, term9679.getClass(), "focusCycleRoot", false);
        setBooleanField(term9679, term9679.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9679, term9679.getClass(), "printingThreads", null);
        setBooleanField(term9679, term9679.getClass(), "printing", false);
        setField(term9679, term9679.getClass(), "containerListener", null);
        setIntField(term9679, term9679.getClass(), "listeningChildren", 0);
        setIntField(term9679, term9679.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9679, term9679.getClass(), "descendantsCount", 0);
        setField(term9679, term9679.getClass(), "preserveBackgroundColor", null);
        setIntField(term9679, term9679.getClass(), "numOfHWComponents", 0);
        setIntField(term9679, term9679.getClass(), "numOfLWComponents", 0);
        setField(term9679, term9679.getClass(), "modalComp", null);
        setField(term9679, term9679.getClass(), "modalAppContext", null);
        setIntField(term9679, term9679.getClass(), "containerSerializedDataVersion", 0);
        setField(term9679, term9679.getClass(), "peer", null);
        setField(term9679, term9679.getClass(), "parent", null);
        setField(term9679, term9679.getClass(), "appContext", null);
        setIntField(term9679, term9679.getClass(), "x", 0);
        setIntField(term9679, term9679.getClass(), "y", 0);
        setIntField(term9679, term9679.getClass(), "width", 0);
        setIntField(term9679, term9679.getClass(), "height", 0);
        setField(term9679, term9679.getClass(), "foreground", null);
        setField(term9679, term9679.getClass(), "background", null);
        setField(term9679, term9679.getClass(), "font", null);
        setField(term9679, term9679.getClass(), "peerFont", null);
        setField(term9679, term9679.getClass(), "cursor", null);
        setField(term9679, term9679.getClass(), "locale", null);
        setField(term9679, term9679.getClass(), "graphicsConfig", null);
        setField(term9679, term9679.getClass(), "bufferStrategy", null);
        setBooleanField(term9679, term9679.getClass(), "ignoreRepaint", false);
        setBooleanField(term9679, term9679.getClass(), "visible", false);
        setBooleanField(term9679, term9679.getClass(), "enabled", false);
        setBooleanField(term9679, term9679.getClass(), "valid", false);
        setField(term9679, term9679.getClass(), "dropTarget", null);
        setField(term9679, term9679.getClass(), "popups", null);
        setField(term9679, term9679.getClass(), "name", null);
        setBooleanField(term9679, term9679.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9679, term9679.getClass(), "focusable", false);
        setIntField(term9679, term9679.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9679, term9679.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9679, term9679.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9679, term9679.getClass(), "acc", null);
        setField(term9679, term9679.getClass(), "minSize", null);
        setBooleanField(term9679, term9679.getClass(), "minSizeSet", false);
        setField(term9679, term9679.getClass(), "prefSize", null);
        setBooleanField(term9679, term9679.getClass(), "prefSizeSet", false);
        setField(term9679, term9679.getClass(), "maxSize", null);
        setBooleanField(term9679, term9679.getClass(), "maxSizeSet", false);
        setField(term9679, term9679.getClass(), "componentOrientation", null);
        setBooleanField(term9679, term9679.getClass(), "newEventsOnly", false);
        setField(term9679, term9679.getClass(), "componentListener", null);
        setField(term9679, term9679.getClass(), "focusListener", null);
        setField(term9679, term9679.getClass(), "hierarchyListener", null);
        setField(term9679, term9679.getClass(), "hierarchyBoundsListener", null);
        setField(term9679, term9679.getClass(), "keyListener", null);
        setField(term9679, term9679.getClass(), "mouseListener", null);
        setField(term9679, term9679.getClass(), "mouseMotionListener", null);
        setField(term9679, term9679.getClass(), "mouseWheelListener", null);
        setField(term9679, term9679.getClass(), "inputMethodListener", null);
        setLongField(term9679, term9679.getClass(), "eventMask", 0L);
        setField(term9679, term9679.getClass(), "changeSupport", null);
        setField(term9679, term9679.getClass(), "objectLock", null);
        setBooleanField(term9679, term9679.getClass(), "isPacked", false);
        setIntField(term9679, term9679.getClass(), "boundsOp", 0);
        setField(term9679, term9679.getClass(), "compoundShape", null);
        setField(term9679, term9679.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9679, term9679.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9679, term9679.getClass(), "backgroundEraseDisabled", false);
        setField(term9679, term9679.getClass(), "eventCache", null);
        setBooleanField(term9679, term9679.getClass(), "coalescingEnabled", false);
        setBooleanField(term9679, term9679.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9679, term9679.getClass(), "componentSerializedDataVersion", 0);
        setField(term9679, term9679.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlank", argTypes, term9679, args);
    }

};


