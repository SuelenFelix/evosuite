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

public class KTextField_createToolTip_98897644826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9779;

    public KTextField_createToolTip_98897644826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9779 = newInstance(Class.forName("proto.KTextField"));
        setField(term9779, term9779.getClass(), "action", null);
        setField(term9779, term9779.getClass(), "actionPropertyChangeListener", null);
        setField(term9779, term9779.getClass(), "visibility", null);
        setIntField(term9779, term9779.getClass(), "horizontalAlignment", 0);
        setIntField(term9779, term9779.getClass(), "columns", 0);
        setIntField(term9779, term9779.getClass(), "columnWidth", 0);
        setField(term9779, term9779.getClass(), "command", null);
        setField(term9779, term9779.getClass(), "model", null);
        setField(term9779, term9779.getClass(), "caret", null);
        setField(term9779, term9779.getClass(), "navigationFilter", null);
        setField(term9779, term9779.getClass(), "highlighter", null);
        setField(term9779, term9779.getClass(), "keymap", null);
        setField(term9779, term9779.getClass(), "caretEvent", null);
        setField(term9779, term9779.getClass(), "caretColor", null);
        setField(term9779, term9779.getClass(), "selectionColor", null);
        setField(term9779, term9779.getClass(), "selectedTextColor", null);
        setField(term9779, term9779.getClass(), "disabledTextColor", null);
        setBooleanField(term9779, term9779.getClass(), "editable", false);
        setField(term9779, term9779.getClass(), "margin", null);
        setCharField(term9779, term9779.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9779, term9779.getClass(), "dragEnabled", false);
        setField(term9779, term9779.getClass(), "dropMode", null);
        setField(term9779, term9779.getClass(), "dropLocation", null);
        setField(term9779, term9779.getClass(), "inputMethodRequestsHandler", null);
        setField(term9779, term9779.getClass(), "composedTextAttribute", null);
        setField(term9779, term9779.getClass(), "composedTextContent", null);
        setField(term9779, term9779.getClass(), "composedTextStart", null);
        setField(term9779, term9779.getClass(), "composedTextEnd", null);
        setField(term9779, term9779.getClass(), "latestCommittedTextStart", null);
        setField(term9779, term9779.getClass(), "latestCommittedTextEnd", null);
        setField(term9779, term9779.getClass(), "composedTextCaret", null);
        setField(term9779, term9779.getClass(), "originalCaret", null);
        setBooleanField(term9779, term9779.getClass(), "checkedInputOverride", false);
        setBooleanField(term9779, term9779.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9779, term9779.getClass(), "isAlignmentXSet", false);
        setFloatField(term9779, term9779.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9779, term9779.getClass(), "isAlignmentYSet", false);
        setFloatField(term9779, term9779.getClass(), "alignmentY", 0.0F);
        setField(term9779, term9779.getClass(), "ui", null);
        setField(term9779, term9779.getClass(), "listenerList", null);
        setField(term9779, term9779.getClass(), "clientProperties", null);
        setField(term9779, term9779.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9779, term9779.getClass(), "autoscrolls", false);
        setField(term9779, term9779.getClass(), "border", null);
        setIntField(term9779, term9779.getClass(), "flags", 0);
        setField(term9779, term9779.getClass(), "inputVerifier", null);
        setBooleanField(term9779, term9779.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9779, term9779.getClass(), "paintingChild", null);
        setField(term9779, term9779.getClass(), "popupMenu", null);
        setField(term9779, term9779.getClass(), "revalidateRunnableScheduled", null);
        setField(term9779, term9779.getClass(), "focusInputMap", null);
        setField(term9779, term9779.getClass(), "ancestorInputMap", null);
        setField(term9779, term9779.getClass(), "windowInputMap", null);
        setField(term9779, term9779.getClass(), "actionMap", null);
        setField(term9779, term9779.getClass(), "aaHint", null);
        setField(term9779, term9779.getClass(), "lcdRenderingHint", null);
        setField(term9779, term9779.getClass(), "component", null);
        setField(term9779, term9779.getClass(), "layoutMgr", null);
        setField(term9779, term9779.getClass(), "dispatcher", null);
        setField(term9779, term9779.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9779, term9779.getClass(), "focusCycleRoot", false);
        setBooleanField(term9779, term9779.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9779, term9779.getClass(), "printingThreads", null);
        setBooleanField(term9779, term9779.getClass(), "printing", false);
        setField(term9779, term9779.getClass(), "containerListener", null);
        setIntField(term9779, term9779.getClass(), "listeningChildren", 0);
        setIntField(term9779, term9779.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9779, term9779.getClass(), "descendantsCount", 0);
        setField(term9779, term9779.getClass(), "preserveBackgroundColor", null);
        setIntField(term9779, term9779.getClass(), "numOfHWComponents", 0);
        setIntField(term9779, term9779.getClass(), "numOfLWComponents", 0);
        setField(term9779, term9779.getClass(), "modalComp", null);
        setField(term9779, term9779.getClass(), "modalAppContext", null);
        setIntField(term9779, term9779.getClass(), "containerSerializedDataVersion", 0);
        setField(term9779, term9779.getClass(), "peer", null);
        setField(term9779, term9779.getClass(), "parent", null);
        setField(term9779, term9779.getClass(), "appContext", null);
        setIntField(term9779, term9779.getClass(), "x", 0);
        setIntField(term9779, term9779.getClass(), "y", 0);
        setIntField(term9779, term9779.getClass(), "width", 0);
        setIntField(term9779, term9779.getClass(), "height", 0);
        setField(term9779, term9779.getClass(), "foreground", null);
        setField(term9779, term9779.getClass(), "background", null);
        setField(term9779, term9779.getClass(), "font", null);
        setField(term9779, term9779.getClass(), "peerFont", null);
        setField(term9779, term9779.getClass(), "cursor", null);
        setField(term9779, term9779.getClass(), "locale", null);
        setField(term9779, term9779.getClass(), "graphicsConfig", null);
        setField(term9779, term9779.getClass(), "bufferStrategy", null);
        setBooleanField(term9779, term9779.getClass(), "ignoreRepaint", false);
        setBooleanField(term9779, term9779.getClass(), "visible", false);
        setBooleanField(term9779, term9779.getClass(), "enabled", false);
        setBooleanField(term9779, term9779.getClass(), "valid", false);
        setField(term9779, term9779.getClass(), "dropTarget", null);
        setField(term9779, term9779.getClass(), "popups", null);
        setField(term9779, term9779.getClass(), "name", null);
        setBooleanField(term9779, term9779.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9779, term9779.getClass(), "focusable", false);
        setIntField(term9779, term9779.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9779, term9779.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9779, term9779.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9779, term9779.getClass(), "acc", null);
        setField(term9779, term9779.getClass(), "minSize", null);
        setBooleanField(term9779, term9779.getClass(), "minSizeSet", false);
        setField(term9779, term9779.getClass(), "prefSize", null);
        setBooleanField(term9779, term9779.getClass(), "prefSizeSet", false);
        setField(term9779, term9779.getClass(), "maxSize", null);
        setBooleanField(term9779, term9779.getClass(), "maxSizeSet", false);
        setField(term9779, term9779.getClass(), "componentOrientation", null);
        setBooleanField(term9779, term9779.getClass(), "newEventsOnly", false);
        setField(term9779, term9779.getClass(), "componentListener", null);
        setField(term9779, term9779.getClass(), "focusListener", null);
        setField(term9779, term9779.getClass(), "hierarchyListener", null);
        setField(term9779, term9779.getClass(), "hierarchyBoundsListener", null);
        setField(term9779, term9779.getClass(), "keyListener", null);
        setField(term9779, term9779.getClass(), "mouseListener", null);
        setField(term9779, term9779.getClass(), "mouseMotionListener", null);
        setField(term9779, term9779.getClass(), "mouseWheelListener", null);
        setField(term9779, term9779.getClass(), "inputMethodListener", null);
        setLongField(term9779, term9779.getClass(), "eventMask", 0L);
        setField(term9779, term9779.getClass(), "changeSupport", null);
        setField(term9779, term9779.getClass(), "objectLock", null);
        setBooleanField(term9779, term9779.getClass(), "isPacked", false);
        setIntField(term9779, term9779.getClass(), "boundsOp", 0);
        setField(term9779, term9779.getClass(), "compoundShape", null);
        setField(term9779, term9779.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9779, term9779.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9779, term9779.getClass(), "backgroundEraseDisabled", false);
        setField(term9779, term9779.getClass(), "eventCache", null);
        setBooleanField(term9779, term9779.getClass(), "coalescingEnabled", false);
        setBooleanField(term9779, term9779.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9779, term9779.getClass(), "componentSerializedDataVersion", 0);
        setField(term9779, term9779.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term9779, args);
    }

};


