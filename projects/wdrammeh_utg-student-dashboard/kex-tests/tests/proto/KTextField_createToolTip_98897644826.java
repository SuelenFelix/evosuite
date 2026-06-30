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
     Object term9767;

    public KTextField_createToolTip_98897644826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9767 = newInstance(Class.forName("proto.KTextField"));
        setField(term9767, term9767.getClass(), "action", null);
        setField(term9767, term9767.getClass(), "actionPropertyChangeListener", null);
        setField(term9767, term9767.getClass(), "visibility", null);
        setIntField(term9767, term9767.getClass(), "horizontalAlignment", 0);
        setIntField(term9767, term9767.getClass(), "columns", 0);
        setIntField(term9767, term9767.getClass(), "columnWidth", 0);
        setField(term9767, term9767.getClass(), "command", null);
        setField(term9767, term9767.getClass(), "model", null);
        setField(term9767, term9767.getClass(), "caret", null);
        setField(term9767, term9767.getClass(), "navigationFilter", null);
        setField(term9767, term9767.getClass(), "highlighter", null);
        setField(term9767, term9767.getClass(), "keymap", null);
        setField(term9767, term9767.getClass(), "caretEvent", null);
        setField(term9767, term9767.getClass(), "caretColor", null);
        setField(term9767, term9767.getClass(), "selectionColor", null);
        setField(term9767, term9767.getClass(), "selectedTextColor", null);
        setField(term9767, term9767.getClass(), "disabledTextColor", null);
        setBooleanField(term9767, term9767.getClass(), "editable", false);
        setField(term9767, term9767.getClass(), "margin", null);
        setCharField(term9767, term9767.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9767, term9767.getClass(), "dragEnabled", false);
        setField(term9767, term9767.getClass(), "dropMode", null);
        setField(term9767, term9767.getClass(), "dropLocation", null);
        setField(term9767, term9767.getClass(), "inputMethodRequestsHandler", null);
        setField(term9767, term9767.getClass(), "composedTextAttribute", null);
        setField(term9767, term9767.getClass(), "composedTextContent", null);
        setField(term9767, term9767.getClass(), "composedTextStart", null);
        setField(term9767, term9767.getClass(), "composedTextEnd", null);
        setField(term9767, term9767.getClass(), "latestCommittedTextStart", null);
        setField(term9767, term9767.getClass(), "latestCommittedTextEnd", null);
        setField(term9767, term9767.getClass(), "composedTextCaret", null);
        setField(term9767, term9767.getClass(), "originalCaret", null);
        setBooleanField(term9767, term9767.getClass(), "checkedInputOverride", false);
        setBooleanField(term9767, term9767.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9767, term9767.getClass(), "isAlignmentXSet", false);
        setFloatField(term9767, term9767.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9767, term9767.getClass(), "isAlignmentYSet", false);
        setFloatField(term9767, term9767.getClass(), "alignmentY", 0.0F);
        setField(term9767, term9767.getClass(), "ui", null);
        setField(term9767, term9767.getClass(), "listenerList", null);
        setField(term9767, term9767.getClass(), "clientProperties", null);
        setField(term9767, term9767.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9767, term9767.getClass(), "autoscrolls", false);
        setField(term9767, term9767.getClass(), "border", null);
        setIntField(term9767, term9767.getClass(), "flags", 0);
        setField(term9767, term9767.getClass(), "inputVerifier", null);
        setBooleanField(term9767, term9767.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9767, term9767.getClass(), "paintingChild", null);
        setField(term9767, term9767.getClass(), "popupMenu", null);
        setField(term9767, term9767.getClass(), "revalidateRunnableScheduled", null);
        setField(term9767, term9767.getClass(), "focusInputMap", null);
        setField(term9767, term9767.getClass(), "ancestorInputMap", null);
        setField(term9767, term9767.getClass(), "windowInputMap", null);
        setField(term9767, term9767.getClass(), "actionMap", null);
        setField(term9767, term9767.getClass(), "aaHint", null);
        setField(term9767, term9767.getClass(), "lcdRenderingHint", null);
        setField(term9767, term9767.getClass(), "component", null);
        setField(term9767, term9767.getClass(), "layoutMgr", null);
        setField(term9767, term9767.getClass(), "dispatcher", null);
        setField(term9767, term9767.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9767, term9767.getClass(), "focusCycleRoot", false);
        setBooleanField(term9767, term9767.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9767, term9767.getClass(), "printingThreads", null);
        setBooleanField(term9767, term9767.getClass(), "printing", false);
        setField(term9767, term9767.getClass(), "containerListener", null);
        setIntField(term9767, term9767.getClass(), "listeningChildren", 0);
        setIntField(term9767, term9767.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9767, term9767.getClass(), "descendantsCount", 0);
        setField(term9767, term9767.getClass(), "preserveBackgroundColor", null);
        setIntField(term9767, term9767.getClass(), "numOfHWComponents", 0);
        setIntField(term9767, term9767.getClass(), "numOfLWComponents", 0);
        setField(term9767, term9767.getClass(), "modalComp", null);
        setField(term9767, term9767.getClass(), "modalAppContext", null);
        setIntField(term9767, term9767.getClass(), "containerSerializedDataVersion", 0);
        setField(term9767, term9767.getClass(), "peer", null);
        setField(term9767, term9767.getClass(), "parent", null);
        setField(term9767, term9767.getClass(), "appContext", null);
        setIntField(term9767, term9767.getClass(), "x", 0);
        setIntField(term9767, term9767.getClass(), "y", 0);
        setIntField(term9767, term9767.getClass(), "width", 0);
        setIntField(term9767, term9767.getClass(), "height", 0);
        setField(term9767, term9767.getClass(), "foreground", null);
        setField(term9767, term9767.getClass(), "background", null);
        setField(term9767, term9767.getClass(), "font", null);
        setField(term9767, term9767.getClass(), "peerFont", null);
        setField(term9767, term9767.getClass(), "cursor", null);
        setField(term9767, term9767.getClass(), "locale", null);
        setField(term9767, term9767.getClass(), "graphicsConfig", null);
        setField(term9767, term9767.getClass(), "bufferStrategy", null);
        setBooleanField(term9767, term9767.getClass(), "ignoreRepaint", false);
        setBooleanField(term9767, term9767.getClass(), "visible", false);
        setBooleanField(term9767, term9767.getClass(), "enabled", false);
        setBooleanField(term9767, term9767.getClass(), "valid", false);
        setField(term9767, term9767.getClass(), "dropTarget", null);
        setField(term9767, term9767.getClass(), "popups", null);
        setField(term9767, term9767.getClass(), "name", null);
        setBooleanField(term9767, term9767.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9767, term9767.getClass(), "focusable", false);
        setIntField(term9767, term9767.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9767, term9767.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9767, term9767.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9767, term9767.getClass(), "acc", null);
        setField(term9767, term9767.getClass(), "minSize", null);
        setBooleanField(term9767, term9767.getClass(), "minSizeSet", false);
        setField(term9767, term9767.getClass(), "prefSize", null);
        setBooleanField(term9767, term9767.getClass(), "prefSizeSet", false);
        setField(term9767, term9767.getClass(), "maxSize", null);
        setBooleanField(term9767, term9767.getClass(), "maxSizeSet", false);
        setField(term9767, term9767.getClass(), "componentOrientation", null);
        setBooleanField(term9767, term9767.getClass(), "newEventsOnly", false);
        setField(term9767, term9767.getClass(), "componentListener", null);
        setField(term9767, term9767.getClass(), "focusListener", null);
        setField(term9767, term9767.getClass(), "hierarchyListener", null);
        setField(term9767, term9767.getClass(), "hierarchyBoundsListener", null);
        setField(term9767, term9767.getClass(), "keyListener", null);
        setField(term9767, term9767.getClass(), "mouseListener", null);
        setField(term9767, term9767.getClass(), "mouseMotionListener", null);
        setField(term9767, term9767.getClass(), "mouseWheelListener", null);
        setField(term9767, term9767.getClass(), "inputMethodListener", null);
        setLongField(term9767, term9767.getClass(), "eventMask", 0L);
        setField(term9767, term9767.getClass(), "changeSupport", null);
        setField(term9767, term9767.getClass(), "objectLock", null);
        setBooleanField(term9767, term9767.getClass(), "isPacked", false);
        setIntField(term9767, term9767.getClass(), "boundsOp", 0);
        setField(term9767, term9767.getClass(), "compoundShape", null);
        setField(term9767, term9767.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9767, term9767.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9767, term9767.getClass(), "backgroundEraseDisabled", false);
        setField(term9767, term9767.getClass(), "eventCache", null);
        setBooleanField(term9767, term9767.getClass(), "coalescingEnabled", false);
        setBooleanField(term9767, term9767.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9767, term9767.getClass(), "componentSerializedDataVersion", 0);
        setField(term9767, term9767.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term9767, args);
    }

};


