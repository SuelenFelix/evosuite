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
     Object term9667;

    public KTextField_isBlank_69015622424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9667 = newInstance(Class.forName("proto.KTextField"));
        setField(term9667, term9667.getClass(), "action", null);
        setField(term9667, term9667.getClass(), "actionPropertyChangeListener", null);
        setField(term9667, term9667.getClass(), "visibility", null);
        setIntField(term9667, term9667.getClass(), "horizontalAlignment", 0);
        setIntField(term9667, term9667.getClass(), "columns", 0);
        setIntField(term9667, term9667.getClass(), "columnWidth", 0);
        setField(term9667, term9667.getClass(), "command", null);
        setField(term9667, term9667.getClass(), "model", null);
        setField(term9667, term9667.getClass(), "caret", null);
        setField(term9667, term9667.getClass(), "navigationFilter", null);
        setField(term9667, term9667.getClass(), "highlighter", null);
        setField(term9667, term9667.getClass(), "keymap", null);
        setField(term9667, term9667.getClass(), "caretEvent", null);
        setField(term9667, term9667.getClass(), "caretColor", null);
        setField(term9667, term9667.getClass(), "selectionColor", null);
        setField(term9667, term9667.getClass(), "selectedTextColor", null);
        setField(term9667, term9667.getClass(), "disabledTextColor", null);
        setBooleanField(term9667, term9667.getClass(), "editable", false);
        setField(term9667, term9667.getClass(), "margin", null);
        setCharField(term9667, term9667.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9667, term9667.getClass(), "dragEnabled", false);
        setField(term9667, term9667.getClass(), "dropMode", null);
        setField(term9667, term9667.getClass(), "dropLocation", null);
        setField(term9667, term9667.getClass(), "inputMethodRequestsHandler", null);
        setField(term9667, term9667.getClass(), "composedTextAttribute", null);
        setField(term9667, term9667.getClass(), "composedTextContent", null);
        setField(term9667, term9667.getClass(), "composedTextStart", null);
        setField(term9667, term9667.getClass(), "composedTextEnd", null);
        setField(term9667, term9667.getClass(), "latestCommittedTextStart", null);
        setField(term9667, term9667.getClass(), "latestCommittedTextEnd", null);
        setField(term9667, term9667.getClass(), "composedTextCaret", null);
        setField(term9667, term9667.getClass(), "originalCaret", null);
        setBooleanField(term9667, term9667.getClass(), "checkedInputOverride", false);
        setBooleanField(term9667, term9667.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9667, term9667.getClass(), "isAlignmentXSet", false);
        setFloatField(term9667, term9667.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9667, term9667.getClass(), "isAlignmentYSet", false);
        setFloatField(term9667, term9667.getClass(), "alignmentY", 0.0F);
        setField(term9667, term9667.getClass(), "ui", null);
        setField(term9667, term9667.getClass(), "listenerList", null);
        setField(term9667, term9667.getClass(), "clientProperties", null);
        setField(term9667, term9667.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9667, term9667.getClass(), "autoscrolls", false);
        setField(term9667, term9667.getClass(), "border", null);
        setIntField(term9667, term9667.getClass(), "flags", 0);
        setField(term9667, term9667.getClass(), "inputVerifier", null);
        setBooleanField(term9667, term9667.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9667, term9667.getClass(), "paintingChild", null);
        setField(term9667, term9667.getClass(), "popupMenu", null);
        setField(term9667, term9667.getClass(), "revalidateRunnableScheduled", null);
        setField(term9667, term9667.getClass(), "focusInputMap", null);
        setField(term9667, term9667.getClass(), "ancestorInputMap", null);
        setField(term9667, term9667.getClass(), "windowInputMap", null);
        setField(term9667, term9667.getClass(), "actionMap", null);
        setField(term9667, term9667.getClass(), "aaHint", null);
        setField(term9667, term9667.getClass(), "lcdRenderingHint", null);
        setField(term9667, term9667.getClass(), "component", null);
        setField(term9667, term9667.getClass(), "layoutMgr", null);
        setField(term9667, term9667.getClass(), "dispatcher", null);
        setField(term9667, term9667.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9667, term9667.getClass(), "focusCycleRoot", false);
        setBooleanField(term9667, term9667.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9667, term9667.getClass(), "printingThreads", null);
        setBooleanField(term9667, term9667.getClass(), "printing", false);
        setField(term9667, term9667.getClass(), "containerListener", null);
        setIntField(term9667, term9667.getClass(), "listeningChildren", 0);
        setIntField(term9667, term9667.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9667, term9667.getClass(), "descendantsCount", 0);
        setField(term9667, term9667.getClass(), "preserveBackgroundColor", null);
        setIntField(term9667, term9667.getClass(), "numOfHWComponents", 0);
        setIntField(term9667, term9667.getClass(), "numOfLWComponents", 0);
        setField(term9667, term9667.getClass(), "modalComp", null);
        setField(term9667, term9667.getClass(), "modalAppContext", null);
        setIntField(term9667, term9667.getClass(), "containerSerializedDataVersion", 0);
        setField(term9667, term9667.getClass(), "peer", null);
        setField(term9667, term9667.getClass(), "parent", null);
        setField(term9667, term9667.getClass(), "appContext", null);
        setIntField(term9667, term9667.getClass(), "x", 0);
        setIntField(term9667, term9667.getClass(), "y", 0);
        setIntField(term9667, term9667.getClass(), "width", 0);
        setIntField(term9667, term9667.getClass(), "height", 0);
        setField(term9667, term9667.getClass(), "foreground", null);
        setField(term9667, term9667.getClass(), "background", null);
        setField(term9667, term9667.getClass(), "font", null);
        setField(term9667, term9667.getClass(), "peerFont", null);
        setField(term9667, term9667.getClass(), "cursor", null);
        setField(term9667, term9667.getClass(), "locale", null);
        setField(term9667, term9667.getClass(), "graphicsConfig", null);
        setField(term9667, term9667.getClass(), "bufferStrategy", null);
        setBooleanField(term9667, term9667.getClass(), "ignoreRepaint", false);
        setBooleanField(term9667, term9667.getClass(), "visible", false);
        setBooleanField(term9667, term9667.getClass(), "enabled", false);
        setBooleanField(term9667, term9667.getClass(), "valid", false);
        setField(term9667, term9667.getClass(), "dropTarget", null);
        setField(term9667, term9667.getClass(), "popups", null);
        setField(term9667, term9667.getClass(), "name", null);
        setBooleanField(term9667, term9667.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9667, term9667.getClass(), "focusable", false);
        setIntField(term9667, term9667.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9667, term9667.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9667, term9667.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9667, term9667.getClass(), "acc", null);
        setField(term9667, term9667.getClass(), "minSize", null);
        setBooleanField(term9667, term9667.getClass(), "minSizeSet", false);
        setField(term9667, term9667.getClass(), "prefSize", null);
        setBooleanField(term9667, term9667.getClass(), "prefSizeSet", false);
        setField(term9667, term9667.getClass(), "maxSize", null);
        setBooleanField(term9667, term9667.getClass(), "maxSizeSet", false);
        setField(term9667, term9667.getClass(), "componentOrientation", null);
        setBooleanField(term9667, term9667.getClass(), "newEventsOnly", false);
        setField(term9667, term9667.getClass(), "componentListener", null);
        setField(term9667, term9667.getClass(), "focusListener", null);
        setField(term9667, term9667.getClass(), "hierarchyListener", null);
        setField(term9667, term9667.getClass(), "hierarchyBoundsListener", null);
        setField(term9667, term9667.getClass(), "keyListener", null);
        setField(term9667, term9667.getClass(), "mouseListener", null);
        setField(term9667, term9667.getClass(), "mouseMotionListener", null);
        setField(term9667, term9667.getClass(), "mouseWheelListener", null);
        setField(term9667, term9667.getClass(), "inputMethodListener", null);
        setLongField(term9667, term9667.getClass(), "eventMask", 0L);
        setField(term9667, term9667.getClass(), "changeSupport", null);
        setField(term9667, term9667.getClass(), "objectLock", null);
        setBooleanField(term9667, term9667.getClass(), "isPacked", false);
        setIntField(term9667, term9667.getClass(), "boundsOp", 0);
        setField(term9667, term9667.getClass(), "compoundShape", null);
        setField(term9667, term9667.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9667, term9667.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9667, term9667.getClass(), "backgroundEraseDisabled", false);
        setField(term9667, term9667.getClass(), "eventCache", null);
        setBooleanField(term9667, term9667.getClass(), "coalescingEnabled", false);
        setBooleanField(term9667, term9667.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9667, term9667.getClass(), "componentSerializedDataVersion", 0);
        setField(term9667, term9667.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlank", argTypes, term9667, args);
    }

};


