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
     Object term9371;
     Object term9420;

    public KTextField_digitRangeControlField_89793723018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9371 = newInstance(Class.forName("proto.KTextField"));
        setField(term9371, term9371.getClass(), "action", null);
        setField(term9371, term9371.getClass(), "actionPropertyChangeListener", null);
        setField(term9371, term9371.getClass(), "visibility", null);
        setIntField(term9371, term9371.getClass(), "horizontalAlignment", 0);
        setIntField(term9371, term9371.getClass(), "columns", 0);
        setIntField(term9371, term9371.getClass(), "columnWidth", 0);
        setField(term9371, term9371.getClass(), "command", null);
        setField(term9371, term9371.getClass(), "model", null);
        setField(term9371, term9371.getClass(), "caret", null);
        setField(term9371, term9371.getClass(), "navigationFilter", null);
        setField(term9371, term9371.getClass(), "highlighter", null);
        setField(term9371, term9371.getClass(), "keymap", null);
        setField(term9371, term9371.getClass(), "caretEvent", null);
        setField(term9371, term9371.getClass(), "caretColor", null);
        setField(term9371, term9371.getClass(), "selectionColor", null);
        setField(term9371, term9371.getClass(), "selectedTextColor", null);
        setField(term9371, term9371.getClass(), "disabledTextColor", null);
        setBooleanField(term9371, term9371.getClass(), "editable", false);
        setField(term9371, term9371.getClass(), "margin", null);
        setCharField(term9371, term9371.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9371, term9371.getClass(), "dragEnabled", false);
        setField(term9371, term9371.getClass(), "dropMode", null);
        setField(term9371, term9371.getClass(), "dropLocation", null);
        setField(term9371, term9371.getClass(), "inputMethodRequestsHandler", null);
        setField(term9371, term9371.getClass(), "composedTextAttribute", null);
        setField(term9371, term9371.getClass(), "composedTextContent", null);
        setField(term9371, term9371.getClass(), "composedTextStart", null);
        setField(term9371, term9371.getClass(), "composedTextEnd", null);
        setField(term9371, term9371.getClass(), "latestCommittedTextStart", null);
        setField(term9371, term9371.getClass(), "latestCommittedTextEnd", null);
        setField(term9371, term9371.getClass(), "composedTextCaret", null);
        setField(term9371, term9371.getClass(), "originalCaret", null);
        setBooleanField(term9371, term9371.getClass(), "checkedInputOverride", false);
        setBooleanField(term9371, term9371.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9371, term9371.getClass(), "isAlignmentXSet", false);
        setFloatField(term9371, term9371.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9371, term9371.getClass(), "isAlignmentYSet", false);
        setFloatField(term9371, term9371.getClass(), "alignmentY", 0.0F);
        setField(term9371, term9371.getClass(), "ui", null);
        setField(term9371, term9371.getClass(), "listenerList", null);
        setField(term9371, term9371.getClass(), "clientProperties", null);
        setField(term9371, term9371.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9371, term9371.getClass(), "autoscrolls", false);
        setField(term9371, term9371.getClass(), "border", null);
        setIntField(term9371, term9371.getClass(), "flags", 0);
        setField(term9371, term9371.getClass(), "inputVerifier", null);
        setBooleanField(term9371, term9371.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9371, term9371.getClass(), "paintingChild", null);
        setField(term9371, term9371.getClass(), "popupMenu", null);
        setField(term9371, term9371.getClass(), "revalidateRunnableScheduled", null);
        setField(term9371, term9371.getClass(), "focusInputMap", null);
        setField(term9371, term9371.getClass(), "ancestorInputMap", null);
        setField(term9371, term9371.getClass(), "windowInputMap", null);
        setField(term9371, term9371.getClass(), "actionMap", null);
        setField(term9371, term9371.getClass(), "aaHint", null);
        setField(term9371, term9371.getClass(), "lcdRenderingHint", null);
        setField(term9371, term9371.getClass(), "component", null);
        setField(term9371, term9371.getClass(), "layoutMgr", null);
        setField(term9371, term9371.getClass(), "dispatcher", null);
        setField(term9371, term9371.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9371, term9371.getClass(), "focusCycleRoot", false);
        setBooleanField(term9371, term9371.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9371, term9371.getClass(), "printingThreads", null);
        setBooleanField(term9371, term9371.getClass(), "printing", false);
        setField(term9371, term9371.getClass(), "containerListener", null);
        setIntField(term9371, term9371.getClass(), "listeningChildren", 0);
        setIntField(term9371, term9371.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9371, term9371.getClass(), "descendantsCount", 0);
        setField(term9371, term9371.getClass(), "preserveBackgroundColor", null);
        setIntField(term9371, term9371.getClass(), "numOfHWComponents", 0);
        setIntField(term9371, term9371.getClass(), "numOfLWComponents", 0);
        setField(term9371, term9371.getClass(), "modalComp", null);
        setField(term9371, term9371.getClass(), "modalAppContext", null);
        setIntField(term9371, term9371.getClass(), "containerSerializedDataVersion", 0);
        setField(term9371, term9371.getClass(), "peer", null);
        setField(term9371, term9371.getClass(), "parent", null);
        setField(term9371, term9371.getClass(), "appContext", null);
        setIntField(term9371, term9371.getClass(), "x", 0);
        setIntField(term9371, term9371.getClass(), "y", 0);
        setIntField(term9371, term9371.getClass(), "width", 0);
        setIntField(term9371, term9371.getClass(), "height", 0);
        setField(term9371, term9371.getClass(), "foreground", null);
        setField(term9371, term9371.getClass(), "background", null);
        setField(term9371, term9371.getClass(), "font", null);
        setField(term9371, term9371.getClass(), "peerFont", null);
        setField(term9371, term9371.getClass(), "cursor", null);
        setField(term9371, term9371.getClass(), "locale", null);
        setField(term9371, term9371.getClass(), "graphicsConfig", null);
        setField(term9371, term9371.getClass(), "bufferStrategy", null);
        setBooleanField(term9371, term9371.getClass(), "ignoreRepaint", false);
        setBooleanField(term9371, term9371.getClass(), "visible", false);
        setBooleanField(term9371, term9371.getClass(), "enabled", false);
        setBooleanField(term9371, term9371.getClass(), "valid", false);
        setField(term9371, term9371.getClass(), "dropTarget", null);
        setField(term9371, term9371.getClass(), "popups", null);
        setField(term9371, term9371.getClass(), "name", null);
        setBooleanField(term9371, term9371.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9371, term9371.getClass(), "focusable", false);
        setIntField(term9371, term9371.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9371, term9371.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9371, term9371.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9371, term9371.getClass(), "acc", null);
        setField(term9371, term9371.getClass(), "minSize", null);
        setBooleanField(term9371, term9371.getClass(), "minSizeSet", false);
        setField(term9371, term9371.getClass(), "prefSize", null);
        setBooleanField(term9371, term9371.getClass(), "prefSizeSet", false);
        setField(term9371, term9371.getClass(), "maxSize", null);
        setBooleanField(term9371, term9371.getClass(), "maxSizeSet", false);
        setField(term9371, term9371.getClass(), "componentOrientation", null);
        setBooleanField(term9371, term9371.getClass(), "newEventsOnly", false);
        setField(term9371, term9371.getClass(), "componentListener", null);
        setField(term9371, term9371.getClass(), "focusListener", null);
        setField(term9371, term9371.getClass(), "hierarchyListener", null);
        setField(term9371, term9371.getClass(), "hierarchyBoundsListener", null);
        setField(term9371, term9371.getClass(), "keyListener", null);
        setField(term9371, term9371.getClass(), "mouseListener", null);
        setField(term9371, term9371.getClass(), "mouseMotionListener", null);
        setField(term9371, term9371.getClass(), "mouseWheelListener", null);
        setField(term9371, term9371.getClass(), "inputMethodListener", null);
        setLongField(term9371, term9371.getClass(), "eventMask", 0L);
        setField(term9371, term9371.getClass(), "changeSupport", null);
        setField(term9371, term9371.getClass(), "objectLock", null);
        setBooleanField(term9371, term9371.getClass(), "isPacked", false);
        setIntField(term9371, term9371.getClass(), "boundsOp", 0);
        setField(term9371, term9371.getClass(), "compoundShape", null);
        setField(term9371, term9371.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9371, term9371.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9371, term9371.getClass(), "backgroundEraseDisabled", false);
        setField(term9371, term9371.getClass(), "eventCache", null);
        setBooleanField(term9371, term9371.getClass(), "coalescingEnabled", false);
        setBooleanField(term9371, term9371.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9371, term9371.getClass(), "componentSerializedDataVersion", 0);
        setField(term9371, term9371.getClass(), "accessibleContext", null);
        term9420 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9420;
        callMethod(klass, "digitRangeControlField", argTypes, term9371, args);
    }

};


