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

public class KTextField_monthField_65010250320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9471;

    public KTextField_monthField_65010250320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9471 = newInstance(Class.forName("proto.KTextField"));
        setField(term9471, term9471.getClass(), "action", null);
        setField(term9471, term9471.getClass(), "actionPropertyChangeListener", null);
        setField(term9471, term9471.getClass(), "visibility", null);
        setIntField(term9471, term9471.getClass(), "horizontalAlignment", 0);
        setIntField(term9471, term9471.getClass(), "columns", 0);
        setIntField(term9471, term9471.getClass(), "columnWidth", 0);
        setField(term9471, term9471.getClass(), "command", null);
        setField(term9471, term9471.getClass(), "model", null);
        setField(term9471, term9471.getClass(), "caret", null);
        setField(term9471, term9471.getClass(), "navigationFilter", null);
        setField(term9471, term9471.getClass(), "highlighter", null);
        setField(term9471, term9471.getClass(), "keymap", null);
        setField(term9471, term9471.getClass(), "caretEvent", null);
        setField(term9471, term9471.getClass(), "caretColor", null);
        setField(term9471, term9471.getClass(), "selectionColor", null);
        setField(term9471, term9471.getClass(), "selectedTextColor", null);
        setField(term9471, term9471.getClass(), "disabledTextColor", null);
        setBooleanField(term9471, term9471.getClass(), "editable", false);
        setField(term9471, term9471.getClass(), "margin", null);
        setCharField(term9471, term9471.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9471, term9471.getClass(), "dragEnabled", false);
        setField(term9471, term9471.getClass(), "dropMode", null);
        setField(term9471, term9471.getClass(), "dropLocation", null);
        setField(term9471, term9471.getClass(), "inputMethodRequestsHandler", null);
        setField(term9471, term9471.getClass(), "composedTextAttribute", null);
        setField(term9471, term9471.getClass(), "composedTextContent", null);
        setField(term9471, term9471.getClass(), "composedTextStart", null);
        setField(term9471, term9471.getClass(), "composedTextEnd", null);
        setField(term9471, term9471.getClass(), "latestCommittedTextStart", null);
        setField(term9471, term9471.getClass(), "latestCommittedTextEnd", null);
        setField(term9471, term9471.getClass(), "composedTextCaret", null);
        setField(term9471, term9471.getClass(), "originalCaret", null);
        setBooleanField(term9471, term9471.getClass(), "checkedInputOverride", false);
        setBooleanField(term9471, term9471.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9471, term9471.getClass(), "isAlignmentXSet", false);
        setFloatField(term9471, term9471.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9471, term9471.getClass(), "isAlignmentYSet", false);
        setFloatField(term9471, term9471.getClass(), "alignmentY", 0.0F);
        setField(term9471, term9471.getClass(), "ui", null);
        setField(term9471, term9471.getClass(), "listenerList", null);
        setField(term9471, term9471.getClass(), "clientProperties", null);
        setField(term9471, term9471.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9471, term9471.getClass(), "autoscrolls", false);
        setField(term9471, term9471.getClass(), "border", null);
        setIntField(term9471, term9471.getClass(), "flags", 0);
        setField(term9471, term9471.getClass(), "inputVerifier", null);
        setBooleanField(term9471, term9471.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9471, term9471.getClass(), "paintingChild", null);
        setField(term9471, term9471.getClass(), "popupMenu", null);
        setField(term9471, term9471.getClass(), "revalidateRunnableScheduled", null);
        setField(term9471, term9471.getClass(), "focusInputMap", null);
        setField(term9471, term9471.getClass(), "ancestorInputMap", null);
        setField(term9471, term9471.getClass(), "windowInputMap", null);
        setField(term9471, term9471.getClass(), "actionMap", null);
        setField(term9471, term9471.getClass(), "aaHint", null);
        setField(term9471, term9471.getClass(), "lcdRenderingHint", null);
        setField(term9471, term9471.getClass(), "component", null);
        setField(term9471, term9471.getClass(), "layoutMgr", null);
        setField(term9471, term9471.getClass(), "dispatcher", null);
        setField(term9471, term9471.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9471, term9471.getClass(), "focusCycleRoot", false);
        setBooleanField(term9471, term9471.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9471, term9471.getClass(), "printingThreads", null);
        setBooleanField(term9471, term9471.getClass(), "printing", false);
        setField(term9471, term9471.getClass(), "containerListener", null);
        setIntField(term9471, term9471.getClass(), "listeningChildren", 0);
        setIntField(term9471, term9471.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9471, term9471.getClass(), "descendantsCount", 0);
        setField(term9471, term9471.getClass(), "preserveBackgroundColor", null);
        setIntField(term9471, term9471.getClass(), "numOfHWComponents", 0);
        setIntField(term9471, term9471.getClass(), "numOfLWComponents", 0);
        setField(term9471, term9471.getClass(), "modalComp", null);
        setField(term9471, term9471.getClass(), "modalAppContext", null);
        setIntField(term9471, term9471.getClass(), "containerSerializedDataVersion", 0);
        setField(term9471, term9471.getClass(), "peer", null);
        setField(term9471, term9471.getClass(), "parent", null);
        setField(term9471, term9471.getClass(), "appContext", null);
        setIntField(term9471, term9471.getClass(), "x", 0);
        setIntField(term9471, term9471.getClass(), "y", 0);
        setIntField(term9471, term9471.getClass(), "width", 0);
        setIntField(term9471, term9471.getClass(), "height", 0);
        setField(term9471, term9471.getClass(), "foreground", null);
        setField(term9471, term9471.getClass(), "background", null);
        setField(term9471, term9471.getClass(), "font", null);
        setField(term9471, term9471.getClass(), "peerFont", null);
        setField(term9471, term9471.getClass(), "cursor", null);
        setField(term9471, term9471.getClass(), "locale", null);
        setField(term9471, term9471.getClass(), "graphicsConfig", null);
        setField(term9471, term9471.getClass(), "bufferStrategy", null);
        setBooleanField(term9471, term9471.getClass(), "ignoreRepaint", false);
        setBooleanField(term9471, term9471.getClass(), "visible", false);
        setBooleanField(term9471, term9471.getClass(), "enabled", false);
        setBooleanField(term9471, term9471.getClass(), "valid", false);
        setField(term9471, term9471.getClass(), "dropTarget", null);
        setField(term9471, term9471.getClass(), "popups", null);
        setField(term9471, term9471.getClass(), "name", null);
        setBooleanField(term9471, term9471.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9471, term9471.getClass(), "focusable", false);
        setIntField(term9471, term9471.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9471, term9471.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9471, term9471.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9471, term9471.getClass(), "acc", null);
        setField(term9471, term9471.getClass(), "minSize", null);
        setBooleanField(term9471, term9471.getClass(), "minSizeSet", false);
        setField(term9471, term9471.getClass(), "prefSize", null);
        setBooleanField(term9471, term9471.getClass(), "prefSizeSet", false);
        setField(term9471, term9471.getClass(), "maxSize", null);
        setBooleanField(term9471, term9471.getClass(), "maxSizeSet", false);
        setField(term9471, term9471.getClass(), "componentOrientation", null);
        setBooleanField(term9471, term9471.getClass(), "newEventsOnly", false);
        setField(term9471, term9471.getClass(), "componentListener", null);
        setField(term9471, term9471.getClass(), "focusListener", null);
        setField(term9471, term9471.getClass(), "hierarchyListener", null);
        setField(term9471, term9471.getClass(), "hierarchyBoundsListener", null);
        setField(term9471, term9471.getClass(), "keyListener", null);
        setField(term9471, term9471.getClass(), "mouseListener", null);
        setField(term9471, term9471.getClass(), "mouseMotionListener", null);
        setField(term9471, term9471.getClass(), "mouseWheelListener", null);
        setField(term9471, term9471.getClass(), "inputMethodListener", null);
        setLongField(term9471, term9471.getClass(), "eventMask", 0L);
        setField(term9471, term9471.getClass(), "changeSupport", null);
        setField(term9471, term9471.getClass(), "objectLock", null);
        setBooleanField(term9471, term9471.getClass(), "isPacked", false);
        setIntField(term9471, term9471.getClass(), "boundsOp", 0);
        setField(term9471, term9471.getClass(), "compoundShape", null);
        setField(term9471, term9471.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9471, term9471.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9471, term9471.getClass(), "backgroundEraseDisabled", false);
        setField(term9471, term9471.getClass(), "eventCache", null);
        setBooleanField(term9471, term9471.getClass(), "coalescingEnabled", false);
        setBooleanField(term9471, term9471.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9471, term9471.getClass(), "componentSerializedDataVersion", 0);
        setField(term9471, term9471.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "monthField", argTypes, term9471, args);
    }

};


