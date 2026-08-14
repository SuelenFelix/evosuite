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

public class KTextField_digitRangeControlField_89793723018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9383;
     Object term9432;

    public KTextField_digitRangeControlField_89793723018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9383 = newInstance(Class.forName("proto.KTextField"));
        setField(term9383, term9383.getClass(), "action", null);
        setField(term9383, term9383.getClass(), "actionPropertyChangeListener", null);
        setField(term9383, term9383.getClass(), "visibility", null);
        setIntField(term9383, term9383.getClass(), "horizontalAlignment", 0);
        setIntField(term9383, term9383.getClass(), "columns", 0);
        setIntField(term9383, term9383.getClass(), "columnWidth", 0);
        setField(term9383, term9383.getClass(), "command", null);
        setField(term9383, term9383.getClass(), "model", null);
        setField(term9383, term9383.getClass(), "caret", null);
        setField(term9383, term9383.getClass(), "navigationFilter", null);
        setField(term9383, term9383.getClass(), "highlighter", null);
        setField(term9383, term9383.getClass(), "keymap", null);
        setField(term9383, term9383.getClass(), "caretEvent", null);
        setField(term9383, term9383.getClass(), "caretColor", null);
        setField(term9383, term9383.getClass(), "selectionColor", null);
        setField(term9383, term9383.getClass(), "selectedTextColor", null);
        setField(term9383, term9383.getClass(), "disabledTextColor", null);
        setBooleanField(term9383, term9383.getClass(), "editable", false);
        setField(term9383, term9383.getClass(), "margin", null);
        setCharField(term9383, term9383.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9383, term9383.getClass(), "dragEnabled", false);
        setField(term9383, term9383.getClass(), "dropMode", null);
        setField(term9383, term9383.getClass(), "dropLocation", null);
        setField(term9383, term9383.getClass(), "inputMethodRequestsHandler", null);
        setField(term9383, term9383.getClass(), "composedTextAttribute", null);
        setField(term9383, term9383.getClass(), "composedTextContent", null);
        setField(term9383, term9383.getClass(), "composedTextStart", null);
        setField(term9383, term9383.getClass(), "composedTextEnd", null);
        setField(term9383, term9383.getClass(), "latestCommittedTextStart", null);
        setField(term9383, term9383.getClass(), "latestCommittedTextEnd", null);
        setField(term9383, term9383.getClass(), "composedTextCaret", null);
        setField(term9383, term9383.getClass(), "originalCaret", null);
        setBooleanField(term9383, term9383.getClass(), "checkedInputOverride", false);
        setBooleanField(term9383, term9383.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9383, term9383.getClass(), "isAlignmentXSet", false);
        setFloatField(term9383, term9383.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9383, term9383.getClass(), "isAlignmentYSet", false);
        setFloatField(term9383, term9383.getClass(), "alignmentY", 0.0F);
        setField(term9383, term9383.getClass(), "ui", null);
        setField(term9383, term9383.getClass(), "listenerList", null);
        setField(term9383, term9383.getClass(), "clientProperties", null);
        setField(term9383, term9383.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9383, term9383.getClass(), "autoscrolls", false);
        setField(term9383, term9383.getClass(), "border", null);
        setIntField(term9383, term9383.getClass(), "flags", 0);
        setField(term9383, term9383.getClass(), "inputVerifier", null);
        setBooleanField(term9383, term9383.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9383, term9383.getClass(), "paintingChild", null);
        setField(term9383, term9383.getClass(), "popupMenu", null);
        setField(term9383, term9383.getClass(), "revalidateRunnableScheduled", null);
        setField(term9383, term9383.getClass(), "focusInputMap", null);
        setField(term9383, term9383.getClass(), "ancestorInputMap", null);
        setField(term9383, term9383.getClass(), "windowInputMap", null);
        setField(term9383, term9383.getClass(), "actionMap", null);
        setField(term9383, term9383.getClass(), "aaHint", null);
        setField(term9383, term9383.getClass(), "lcdRenderingHint", null);
        setField(term9383, term9383.getClass(), "component", null);
        setField(term9383, term9383.getClass(), "layoutMgr", null);
        setField(term9383, term9383.getClass(), "dispatcher", null);
        setField(term9383, term9383.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9383, term9383.getClass(), "focusCycleRoot", false);
        setBooleanField(term9383, term9383.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9383, term9383.getClass(), "printingThreads", null);
        setBooleanField(term9383, term9383.getClass(), "printing", false);
        setField(term9383, term9383.getClass(), "containerListener", null);
        setIntField(term9383, term9383.getClass(), "listeningChildren", 0);
        setIntField(term9383, term9383.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9383, term9383.getClass(), "descendantsCount", 0);
        setField(term9383, term9383.getClass(), "preserveBackgroundColor", null);
        setIntField(term9383, term9383.getClass(), "numOfHWComponents", 0);
        setIntField(term9383, term9383.getClass(), "numOfLWComponents", 0);
        setField(term9383, term9383.getClass(), "modalComp", null);
        setField(term9383, term9383.getClass(), "modalAppContext", null);
        setIntField(term9383, term9383.getClass(), "containerSerializedDataVersion", 0);
        setField(term9383, term9383.getClass(), "peer", null);
        setField(term9383, term9383.getClass(), "parent", null);
        setField(term9383, term9383.getClass(), "appContext", null);
        setIntField(term9383, term9383.getClass(), "x", 0);
        setIntField(term9383, term9383.getClass(), "y", 0);
        setIntField(term9383, term9383.getClass(), "width", 0);
        setIntField(term9383, term9383.getClass(), "height", 0);
        setField(term9383, term9383.getClass(), "foreground", null);
        setField(term9383, term9383.getClass(), "background", null);
        setField(term9383, term9383.getClass(), "font", null);
        setField(term9383, term9383.getClass(), "peerFont", null);
        setField(term9383, term9383.getClass(), "cursor", null);
        setField(term9383, term9383.getClass(), "locale", null);
        setField(term9383, term9383.getClass(), "graphicsConfig", null);
        setField(term9383, term9383.getClass(), "bufferStrategy", null);
        setBooleanField(term9383, term9383.getClass(), "ignoreRepaint", false);
        setBooleanField(term9383, term9383.getClass(), "visible", false);
        setBooleanField(term9383, term9383.getClass(), "enabled", false);
        setBooleanField(term9383, term9383.getClass(), "valid", false);
        setField(term9383, term9383.getClass(), "dropTarget", null);
        setField(term9383, term9383.getClass(), "popups", null);
        setField(term9383, term9383.getClass(), "name", null);
        setBooleanField(term9383, term9383.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9383, term9383.getClass(), "focusable", false);
        setIntField(term9383, term9383.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9383, term9383.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9383, term9383.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9383, term9383.getClass(), "acc", null);
        setField(term9383, term9383.getClass(), "minSize", null);
        setBooleanField(term9383, term9383.getClass(), "minSizeSet", false);
        setField(term9383, term9383.getClass(), "prefSize", null);
        setBooleanField(term9383, term9383.getClass(), "prefSizeSet", false);
        setField(term9383, term9383.getClass(), "maxSize", null);
        setBooleanField(term9383, term9383.getClass(), "maxSizeSet", false);
        setField(term9383, term9383.getClass(), "componentOrientation", null);
        setBooleanField(term9383, term9383.getClass(), "newEventsOnly", false);
        setField(term9383, term9383.getClass(), "componentListener", null);
        setField(term9383, term9383.getClass(), "focusListener", null);
        setField(term9383, term9383.getClass(), "hierarchyListener", null);
        setField(term9383, term9383.getClass(), "hierarchyBoundsListener", null);
        setField(term9383, term9383.getClass(), "keyListener", null);
        setField(term9383, term9383.getClass(), "mouseListener", null);
        setField(term9383, term9383.getClass(), "mouseMotionListener", null);
        setField(term9383, term9383.getClass(), "mouseWheelListener", null);
        setField(term9383, term9383.getClass(), "inputMethodListener", null);
        setLongField(term9383, term9383.getClass(), "eventMask", 0L);
        setField(term9383, term9383.getClass(), "changeSupport", null);
        setField(term9383, term9383.getClass(), "objectLock", null);
        setBooleanField(term9383, term9383.getClass(), "isPacked", false);
        setIntField(term9383, term9383.getClass(), "boundsOp", 0);
        setField(term9383, term9383.getClass(), "compoundShape", null);
        setField(term9383, term9383.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9383, term9383.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9383, term9383.getClass(), "backgroundEraseDisabled", false);
        setField(term9383, term9383.getClass(), "eventCache", null);
        setBooleanField(term9383, term9383.getClass(), "coalescingEnabled", false);
        setBooleanField(term9383, term9383.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9383, term9383.getClass(), "componentSerializedDataVersion", 0);
        setField(term9383, term9383.getClass(), "accessibleContext", null);
        term9432 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9432;
        callMethod(klass, "digitRangeControlField", argTypes, term9383, args);
    }

};


