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

public class KTextField_hasText_104670415723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9618;

    public KTextField_hasText_104670415723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9618 = newInstance(Class.forName("proto.KTextField"));
        setField(term9618, term9618.getClass(), "action", null);
        setField(term9618, term9618.getClass(), "actionPropertyChangeListener", null);
        setField(term9618, term9618.getClass(), "visibility", null);
        setIntField(term9618, term9618.getClass(), "horizontalAlignment", 0);
        setIntField(term9618, term9618.getClass(), "columns", 0);
        setIntField(term9618, term9618.getClass(), "columnWidth", 0);
        setField(term9618, term9618.getClass(), "command", null);
        setField(term9618, term9618.getClass(), "model", null);
        setField(term9618, term9618.getClass(), "caret", null);
        setField(term9618, term9618.getClass(), "navigationFilter", null);
        setField(term9618, term9618.getClass(), "highlighter", null);
        setField(term9618, term9618.getClass(), "keymap", null);
        setField(term9618, term9618.getClass(), "caretEvent", null);
        setField(term9618, term9618.getClass(), "caretColor", null);
        setField(term9618, term9618.getClass(), "selectionColor", null);
        setField(term9618, term9618.getClass(), "selectedTextColor", null);
        setField(term9618, term9618.getClass(), "disabledTextColor", null);
        setBooleanField(term9618, term9618.getClass(), "editable", false);
        setField(term9618, term9618.getClass(), "margin", null);
        setCharField(term9618, term9618.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9618, term9618.getClass(), "dragEnabled", false);
        setField(term9618, term9618.getClass(), "dropMode", null);
        setField(term9618, term9618.getClass(), "dropLocation", null);
        setField(term9618, term9618.getClass(), "inputMethodRequestsHandler", null);
        setField(term9618, term9618.getClass(), "composedTextAttribute", null);
        setField(term9618, term9618.getClass(), "composedTextContent", null);
        setField(term9618, term9618.getClass(), "composedTextStart", null);
        setField(term9618, term9618.getClass(), "composedTextEnd", null);
        setField(term9618, term9618.getClass(), "latestCommittedTextStart", null);
        setField(term9618, term9618.getClass(), "latestCommittedTextEnd", null);
        setField(term9618, term9618.getClass(), "composedTextCaret", null);
        setField(term9618, term9618.getClass(), "originalCaret", null);
        setBooleanField(term9618, term9618.getClass(), "checkedInputOverride", false);
        setBooleanField(term9618, term9618.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9618, term9618.getClass(), "isAlignmentXSet", false);
        setFloatField(term9618, term9618.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9618, term9618.getClass(), "isAlignmentYSet", false);
        setFloatField(term9618, term9618.getClass(), "alignmentY", 0.0F);
        setField(term9618, term9618.getClass(), "ui", null);
        setField(term9618, term9618.getClass(), "listenerList", null);
        setField(term9618, term9618.getClass(), "clientProperties", null);
        setField(term9618, term9618.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9618, term9618.getClass(), "autoscrolls", false);
        setField(term9618, term9618.getClass(), "border", null);
        setIntField(term9618, term9618.getClass(), "flags", 0);
        setField(term9618, term9618.getClass(), "inputVerifier", null);
        setBooleanField(term9618, term9618.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9618, term9618.getClass(), "paintingChild", null);
        setField(term9618, term9618.getClass(), "popupMenu", null);
        setField(term9618, term9618.getClass(), "revalidateRunnableScheduled", null);
        setField(term9618, term9618.getClass(), "focusInputMap", null);
        setField(term9618, term9618.getClass(), "ancestorInputMap", null);
        setField(term9618, term9618.getClass(), "windowInputMap", null);
        setField(term9618, term9618.getClass(), "actionMap", null);
        setField(term9618, term9618.getClass(), "aaHint", null);
        setField(term9618, term9618.getClass(), "lcdRenderingHint", null);
        setField(term9618, term9618.getClass(), "component", null);
        setField(term9618, term9618.getClass(), "layoutMgr", null);
        setField(term9618, term9618.getClass(), "dispatcher", null);
        setField(term9618, term9618.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9618, term9618.getClass(), "focusCycleRoot", false);
        setBooleanField(term9618, term9618.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9618, term9618.getClass(), "printingThreads", null);
        setBooleanField(term9618, term9618.getClass(), "printing", false);
        setField(term9618, term9618.getClass(), "containerListener", null);
        setIntField(term9618, term9618.getClass(), "listeningChildren", 0);
        setIntField(term9618, term9618.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9618, term9618.getClass(), "descendantsCount", 0);
        setField(term9618, term9618.getClass(), "preserveBackgroundColor", null);
        setIntField(term9618, term9618.getClass(), "numOfHWComponents", 0);
        setIntField(term9618, term9618.getClass(), "numOfLWComponents", 0);
        setField(term9618, term9618.getClass(), "modalComp", null);
        setField(term9618, term9618.getClass(), "modalAppContext", null);
        setIntField(term9618, term9618.getClass(), "containerSerializedDataVersion", 0);
        setField(term9618, term9618.getClass(), "peer", null);
        setField(term9618, term9618.getClass(), "parent", null);
        setField(term9618, term9618.getClass(), "appContext", null);
        setIntField(term9618, term9618.getClass(), "x", 0);
        setIntField(term9618, term9618.getClass(), "y", 0);
        setIntField(term9618, term9618.getClass(), "width", 0);
        setIntField(term9618, term9618.getClass(), "height", 0);
        setField(term9618, term9618.getClass(), "foreground", null);
        setField(term9618, term9618.getClass(), "background", null);
        setField(term9618, term9618.getClass(), "font", null);
        setField(term9618, term9618.getClass(), "peerFont", null);
        setField(term9618, term9618.getClass(), "cursor", null);
        setField(term9618, term9618.getClass(), "locale", null);
        setField(term9618, term9618.getClass(), "graphicsConfig", null);
        setField(term9618, term9618.getClass(), "bufferStrategy", null);
        setBooleanField(term9618, term9618.getClass(), "ignoreRepaint", false);
        setBooleanField(term9618, term9618.getClass(), "visible", false);
        setBooleanField(term9618, term9618.getClass(), "enabled", false);
        setBooleanField(term9618, term9618.getClass(), "valid", false);
        setField(term9618, term9618.getClass(), "dropTarget", null);
        setField(term9618, term9618.getClass(), "popups", null);
        setField(term9618, term9618.getClass(), "name", null);
        setBooleanField(term9618, term9618.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9618, term9618.getClass(), "focusable", false);
        setIntField(term9618, term9618.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9618, term9618.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9618, term9618.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9618, term9618.getClass(), "acc", null);
        setField(term9618, term9618.getClass(), "minSize", null);
        setBooleanField(term9618, term9618.getClass(), "minSizeSet", false);
        setField(term9618, term9618.getClass(), "prefSize", null);
        setBooleanField(term9618, term9618.getClass(), "prefSizeSet", false);
        setField(term9618, term9618.getClass(), "maxSize", null);
        setBooleanField(term9618, term9618.getClass(), "maxSizeSet", false);
        setField(term9618, term9618.getClass(), "componentOrientation", null);
        setBooleanField(term9618, term9618.getClass(), "newEventsOnly", false);
        setField(term9618, term9618.getClass(), "componentListener", null);
        setField(term9618, term9618.getClass(), "focusListener", null);
        setField(term9618, term9618.getClass(), "hierarchyListener", null);
        setField(term9618, term9618.getClass(), "hierarchyBoundsListener", null);
        setField(term9618, term9618.getClass(), "keyListener", null);
        setField(term9618, term9618.getClass(), "mouseListener", null);
        setField(term9618, term9618.getClass(), "mouseMotionListener", null);
        setField(term9618, term9618.getClass(), "mouseWheelListener", null);
        setField(term9618, term9618.getClass(), "inputMethodListener", null);
        setLongField(term9618, term9618.getClass(), "eventMask", 0L);
        setField(term9618, term9618.getClass(), "changeSupport", null);
        setField(term9618, term9618.getClass(), "objectLock", null);
        setBooleanField(term9618, term9618.getClass(), "isPacked", false);
        setIntField(term9618, term9618.getClass(), "boundsOp", 0);
        setField(term9618, term9618.getClass(), "compoundShape", null);
        setField(term9618, term9618.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9618, term9618.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9618, term9618.getClass(), "backgroundEraseDisabled", false);
        setField(term9618, term9618.getClass(), "eventCache", null);
        setBooleanField(term9618, term9618.getClass(), "coalescingEnabled", false);
        setBooleanField(term9618, term9618.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9618, term9618.getClass(), "componentSerializedDataVersion", 0);
        setField(term9618, term9618.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasText", argTypes, term9618, args);
    }

};


