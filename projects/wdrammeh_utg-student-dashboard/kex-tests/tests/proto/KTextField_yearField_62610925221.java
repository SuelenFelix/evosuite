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
     Object term9532;

    public KTextField_yearField_62610925221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9532 = newInstance(Class.forName("proto.KTextField"));
        setField(term9532, term9532.getClass(), "action", null);
        setField(term9532, term9532.getClass(), "actionPropertyChangeListener", null);
        setField(term9532, term9532.getClass(), "visibility", null);
        setIntField(term9532, term9532.getClass(), "horizontalAlignment", 0);
        setIntField(term9532, term9532.getClass(), "columns", 0);
        setIntField(term9532, term9532.getClass(), "columnWidth", 0);
        setField(term9532, term9532.getClass(), "command", null);
        setField(term9532, term9532.getClass(), "model", null);
        setField(term9532, term9532.getClass(), "caret", null);
        setField(term9532, term9532.getClass(), "navigationFilter", null);
        setField(term9532, term9532.getClass(), "highlighter", null);
        setField(term9532, term9532.getClass(), "keymap", null);
        setField(term9532, term9532.getClass(), "caretEvent", null);
        setField(term9532, term9532.getClass(), "caretColor", null);
        setField(term9532, term9532.getClass(), "selectionColor", null);
        setField(term9532, term9532.getClass(), "selectedTextColor", null);
        setField(term9532, term9532.getClass(), "disabledTextColor", null);
        setBooleanField(term9532, term9532.getClass(), "editable", false);
        setField(term9532, term9532.getClass(), "margin", null);
        setCharField(term9532, term9532.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9532, term9532.getClass(), "dragEnabled", false);
        setField(term9532, term9532.getClass(), "dropMode", null);
        setField(term9532, term9532.getClass(), "dropLocation", null);
        setField(term9532, term9532.getClass(), "inputMethodRequestsHandler", null);
        setField(term9532, term9532.getClass(), "composedTextAttribute", null);
        setField(term9532, term9532.getClass(), "composedTextContent", null);
        setField(term9532, term9532.getClass(), "composedTextStart", null);
        setField(term9532, term9532.getClass(), "composedTextEnd", null);
        setField(term9532, term9532.getClass(), "latestCommittedTextStart", null);
        setField(term9532, term9532.getClass(), "latestCommittedTextEnd", null);
        setField(term9532, term9532.getClass(), "composedTextCaret", null);
        setField(term9532, term9532.getClass(), "originalCaret", null);
        setBooleanField(term9532, term9532.getClass(), "checkedInputOverride", false);
        setBooleanField(term9532, term9532.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9532, term9532.getClass(), "isAlignmentXSet", false);
        setFloatField(term9532, term9532.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9532, term9532.getClass(), "isAlignmentYSet", false);
        setFloatField(term9532, term9532.getClass(), "alignmentY", 0.0F);
        setField(term9532, term9532.getClass(), "ui", null);
        setField(term9532, term9532.getClass(), "listenerList", null);
        setField(term9532, term9532.getClass(), "clientProperties", null);
        setField(term9532, term9532.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9532, term9532.getClass(), "autoscrolls", false);
        setField(term9532, term9532.getClass(), "border", null);
        setIntField(term9532, term9532.getClass(), "flags", 0);
        setField(term9532, term9532.getClass(), "inputVerifier", null);
        setBooleanField(term9532, term9532.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9532, term9532.getClass(), "paintingChild", null);
        setField(term9532, term9532.getClass(), "popupMenu", null);
        setField(term9532, term9532.getClass(), "revalidateRunnableScheduled", null);
        setField(term9532, term9532.getClass(), "focusInputMap", null);
        setField(term9532, term9532.getClass(), "ancestorInputMap", null);
        setField(term9532, term9532.getClass(), "windowInputMap", null);
        setField(term9532, term9532.getClass(), "actionMap", null);
        setField(term9532, term9532.getClass(), "aaHint", null);
        setField(term9532, term9532.getClass(), "lcdRenderingHint", null);
        setField(term9532, term9532.getClass(), "component", null);
        setField(term9532, term9532.getClass(), "layoutMgr", null);
        setField(term9532, term9532.getClass(), "dispatcher", null);
        setField(term9532, term9532.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9532, term9532.getClass(), "focusCycleRoot", false);
        setBooleanField(term9532, term9532.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9532, term9532.getClass(), "printingThreads", null);
        setBooleanField(term9532, term9532.getClass(), "printing", false);
        setField(term9532, term9532.getClass(), "containerListener", null);
        setIntField(term9532, term9532.getClass(), "listeningChildren", 0);
        setIntField(term9532, term9532.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9532, term9532.getClass(), "descendantsCount", 0);
        setField(term9532, term9532.getClass(), "preserveBackgroundColor", null);
        setIntField(term9532, term9532.getClass(), "numOfHWComponents", 0);
        setIntField(term9532, term9532.getClass(), "numOfLWComponents", 0);
        setField(term9532, term9532.getClass(), "modalComp", null);
        setField(term9532, term9532.getClass(), "modalAppContext", null);
        setIntField(term9532, term9532.getClass(), "containerSerializedDataVersion", 0);
        setField(term9532, term9532.getClass(), "peer", null);
        setField(term9532, term9532.getClass(), "parent", null);
        setField(term9532, term9532.getClass(), "appContext", null);
        setIntField(term9532, term9532.getClass(), "x", 0);
        setIntField(term9532, term9532.getClass(), "y", 0);
        setIntField(term9532, term9532.getClass(), "width", 0);
        setIntField(term9532, term9532.getClass(), "height", 0);
        setField(term9532, term9532.getClass(), "foreground", null);
        setField(term9532, term9532.getClass(), "background", null);
        setField(term9532, term9532.getClass(), "font", null);
        setField(term9532, term9532.getClass(), "peerFont", null);
        setField(term9532, term9532.getClass(), "cursor", null);
        setField(term9532, term9532.getClass(), "locale", null);
        setField(term9532, term9532.getClass(), "graphicsConfig", null);
        setField(term9532, term9532.getClass(), "bufferStrategy", null);
        setBooleanField(term9532, term9532.getClass(), "ignoreRepaint", false);
        setBooleanField(term9532, term9532.getClass(), "visible", false);
        setBooleanField(term9532, term9532.getClass(), "enabled", false);
        setBooleanField(term9532, term9532.getClass(), "valid", false);
        setField(term9532, term9532.getClass(), "dropTarget", null);
        setField(term9532, term9532.getClass(), "popups", null);
        setField(term9532, term9532.getClass(), "name", null);
        setBooleanField(term9532, term9532.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9532, term9532.getClass(), "focusable", false);
        setIntField(term9532, term9532.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9532, term9532.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9532, term9532.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9532, term9532.getClass(), "acc", null);
        setField(term9532, term9532.getClass(), "minSize", null);
        setBooleanField(term9532, term9532.getClass(), "minSizeSet", false);
        setField(term9532, term9532.getClass(), "prefSize", null);
        setBooleanField(term9532, term9532.getClass(), "prefSizeSet", false);
        setField(term9532, term9532.getClass(), "maxSize", null);
        setBooleanField(term9532, term9532.getClass(), "maxSizeSet", false);
        setField(term9532, term9532.getClass(), "componentOrientation", null);
        setBooleanField(term9532, term9532.getClass(), "newEventsOnly", false);
        setField(term9532, term9532.getClass(), "componentListener", null);
        setField(term9532, term9532.getClass(), "focusListener", null);
        setField(term9532, term9532.getClass(), "hierarchyListener", null);
        setField(term9532, term9532.getClass(), "hierarchyBoundsListener", null);
        setField(term9532, term9532.getClass(), "keyListener", null);
        setField(term9532, term9532.getClass(), "mouseListener", null);
        setField(term9532, term9532.getClass(), "mouseMotionListener", null);
        setField(term9532, term9532.getClass(), "mouseWheelListener", null);
        setField(term9532, term9532.getClass(), "inputMethodListener", null);
        setLongField(term9532, term9532.getClass(), "eventMask", 0L);
        setField(term9532, term9532.getClass(), "changeSupport", null);
        setField(term9532, term9532.getClass(), "objectLock", null);
        setBooleanField(term9532, term9532.getClass(), "isPacked", false);
        setIntField(term9532, term9532.getClass(), "boundsOp", 0);
        setField(term9532, term9532.getClass(), "compoundShape", null);
        setField(term9532, term9532.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9532, term9532.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9532, term9532.getClass(), "backgroundEraseDisabled", false);
        setField(term9532, term9532.getClass(), "eventCache", null);
        setBooleanField(term9532, term9532.getClass(), "coalescingEnabled", false);
        setBooleanField(term9532, term9532.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9532, term9532.getClass(), "componentSerializedDataVersion", 0);
        setField(term9532, term9532.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "yearField", argTypes, term9532, args);
    }

};


