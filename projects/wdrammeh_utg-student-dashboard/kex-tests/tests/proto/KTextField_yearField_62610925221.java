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

public class KTextField_yearField_62610925221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9520;

    public KTextField_yearField_62610925221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9520 = newInstance(Class.forName("proto.KTextField"));
        setField(term9520, term9520.getClass(), "action", null);
        setField(term9520, term9520.getClass(), "actionPropertyChangeListener", null);
        setField(term9520, term9520.getClass(), "visibility", null);
        setIntField(term9520, term9520.getClass(), "horizontalAlignment", 0);
        setIntField(term9520, term9520.getClass(), "columns", 0);
        setIntField(term9520, term9520.getClass(), "columnWidth", 0);
        setField(term9520, term9520.getClass(), "command", null);
        setField(term9520, term9520.getClass(), "model", null);
        setField(term9520, term9520.getClass(), "caret", null);
        setField(term9520, term9520.getClass(), "navigationFilter", null);
        setField(term9520, term9520.getClass(), "highlighter", null);
        setField(term9520, term9520.getClass(), "keymap", null);
        setField(term9520, term9520.getClass(), "caretEvent", null);
        setField(term9520, term9520.getClass(), "caretColor", null);
        setField(term9520, term9520.getClass(), "selectionColor", null);
        setField(term9520, term9520.getClass(), "selectedTextColor", null);
        setField(term9520, term9520.getClass(), "disabledTextColor", null);
        setBooleanField(term9520, term9520.getClass(), "editable", false);
        setField(term9520, term9520.getClass(), "margin", null);
        setCharField(term9520, term9520.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9520, term9520.getClass(), "dragEnabled", false);
        setField(term9520, term9520.getClass(), "dropMode", null);
        setField(term9520, term9520.getClass(), "dropLocation", null);
        setField(term9520, term9520.getClass(), "inputMethodRequestsHandler", null);
        setField(term9520, term9520.getClass(), "composedTextAttribute", null);
        setField(term9520, term9520.getClass(), "composedTextContent", null);
        setField(term9520, term9520.getClass(), "composedTextStart", null);
        setField(term9520, term9520.getClass(), "composedTextEnd", null);
        setField(term9520, term9520.getClass(), "latestCommittedTextStart", null);
        setField(term9520, term9520.getClass(), "latestCommittedTextEnd", null);
        setField(term9520, term9520.getClass(), "composedTextCaret", null);
        setField(term9520, term9520.getClass(), "originalCaret", null);
        setBooleanField(term9520, term9520.getClass(), "checkedInputOverride", false);
        setBooleanField(term9520, term9520.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9520, term9520.getClass(), "isAlignmentXSet", false);
        setFloatField(term9520, term9520.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9520, term9520.getClass(), "isAlignmentYSet", false);
        setFloatField(term9520, term9520.getClass(), "alignmentY", 0.0F);
        setField(term9520, term9520.getClass(), "ui", null);
        setField(term9520, term9520.getClass(), "listenerList", null);
        setField(term9520, term9520.getClass(), "clientProperties", null);
        setField(term9520, term9520.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9520, term9520.getClass(), "autoscrolls", false);
        setField(term9520, term9520.getClass(), "border", null);
        setIntField(term9520, term9520.getClass(), "flags", 0);
        setField(term9520, term9520.getClass(), "inputVerifier", null);
        setBooleanField(term9520, term9520.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9520, term9520.getClass(), "paintingChild", null);
        setField(term9520, term9520.getClass(), "popupMenu", null);
        setField(term9520, term9520.getClass(), "revalidateRunnableScheduled", null);
        setField(term9520, term9520.getClass(), "focusInputMap", null);
        setField(term9520, term9520.getClass(), "ancestorInputMap", null);
        setField(term9520, term9520.getClass(), "windowInputMap", null);
        setField(term9520, term9520.getClass(), "actionMap", null);
        setField(term9520, term9520.getClass(), "aaHint", null);
        setField(term9520, term9520.getClass(), "lcdRenderingHint", null);
        setField(term9520, term9520.getClass(), "component", null);
        setField(term9520, term9520.getClass(), "layoutMgr", null);
        setField(term9520, term9520.getClass(), "dispatcher", null);
        setField(term9520, term9520.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9520, term9520.getClass(), "focusCycleRoot", false);
        setBooleanField(term9520, term9520.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9520, term9520.getClass(), "printingThreads", null);
        setBooleanField(term9520, term9520.getClass(), "printing", false);
        setField(term9520, term9520.getClass(), "containerListener", null);
        setIntField(term9520, term9520.getClass(), "listeningChildren", 0);
        setIntField(term9520, term9520.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9520, term9520.getClass(), "descendantsCount", 0);
        setField(term9520, term9520.getClass(), "preserveBackgroundColor", null);
        setIntField(term9520, term9520.getClass(), "numOfHWComponents", 0);
        setIntField(term9520, term9520.getClass(), "numOfLWComponents", 0);
        setField(term9520, term9520.getClass(), "modalComp", null);
        setField(term9520, term9520.getClass(), "modalAppContext", null);
        setIntField(term9520, term9520.getClass(), "containerSerializedDataVersion", 0);
        setField(term9520, term9520.getClass(), "peer", null);
        setField(term9520, term9520.getClass(), "parent", null);
        setField(term9520, term9520.getClass(), "appContext", null);
        setIntField(term9520, term9520.getClass(), "x", 0);
        setIntField(term9520, term9520.getClass(), "y", 0);
        setIntField(term9520, term9520.getClass(), "width", 0);
        setIntField(term9520, term9520.getClass(), "height", 0);
        setField(term9520, term9520.getClass(), "foreground", null);
        setField(term9520, term9520.getClass(), "background", null);
        setField(term9520, term9520.getClass(), "font", null);
        setField(term9520, term9520.getClass(), "peerFont", null);
        setField(term9520, term9520.getClass(), "cursor", null);
        setField(term9520, term9520.getClass(), "locale", null);
        setField(term9520, term9520.getClass(), "graphicsConfig", null);
        setField(term9520, term9520.getClass(), "bufferStrategy", null);
        setBooleanField(term9520, term9520.getClass(), "ignoreRepaint", false);
        setBooleanField(term9520, term9520.getClass(), "visible", false);
        setBooleanField(term9520, term9520.getClass(), "enabled", false);
        setBooleanField(term9520, term9520.getClass(), "valid", false);
        setField(term9520, term9520.getClass(), "dropTarget", null);
        setField(term9520, term9520.getClass(), "popups", null);
        setField(term9520, term9520.getClass(), "name", null);
        setBooleanField(term9520, term9520.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9520, term9520.getClass(), "focusable", false);
        setIntField(term9520, term9520.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9520, term9520.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9520, term9520.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9520, term9520.getClass(), "acc", null);
        setField(term9520, term9520.getClass(), "minSize", null);
        setBooleanField(term9520, term9520.getClass(), "minSizeSet", false);
        setField(term9520, term9520.getClass(), "prefSize", null);
        setBooleanField(term9520, term9520.getClass(), "prefSizeSet", false);
        setField(term9520, term9520.getClass(), "maxSize", null);
        setBooleanField(term9520, term9520.getClass(), "maxSizeSet", false);
        setField(term9520, term9520.getClass(), "componentOrientation", null);
        setBooleanField(term9520, term9520.getClass(), "newEventsOnly", false);
        setField(term9520, term9520.getClass(), "componentListener", null);
        setField(term9520, term9520.getClass(), "focusListener", null);
        setField(term9520, term9520.getClass(), "hierarchyListener", null);
        setField(term9520, term9520.getClass(), "hierarchyBoundsListener", null);
        setField(term9520, term9520.getClass(), "keyListener", null);
        setField(term9520, term9520.getClass(), "mouseListener", null);
        setField(term9520, term9520.getClass(), "mouseMotionListener", null);
        setField(term9520, term9520.getClass(), "mouseWheelListener", null);
        setField(term9520, term9520.getClass(), "inputMethodListener", null);
        setLongField(term9520, term9520.getClass(), "eventMask", 0L);
        setField(term9520, term9520.getClass(), "changeSupport", null);
        setField(term9520, term9520.getClass(), "objectLock", null);
        setBooleanField(term9520, term9520.getClass(), "isPacked", false);
        setIntField(term9520, term9520.getClass(), "boundsOp", 0);
        setField(term9520, term9520.getClass(), "compoundShape", null);
        setField(term9520, term9520.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9520, term9520.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9520, term9520.getClass(), "backgroundEraseDisabled", false);
        setField(term9520, term9520.getClass(), "eventCache", null);
        setBooleanField(term9520, term9520.getClass(), "coalescingEnabled", false);
        setBooleanField(term9520, term9520.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9520, term9520.getClass(), "componentSerializedDataVersion", 0);
        setField(term9520, term9520.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "yearField", argTypes, term9520, args);
    }

};


