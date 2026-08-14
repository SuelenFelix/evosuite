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
     Object term9630;

    public KTextField_hasText_104670415723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9630 = newInstance(Class.forName("proto.KTextField"));
        setField(term9630, term9630.getClass(), "action", null);
        setField(term9630, term9630.getClass(), "actionPropertyChangeListener", null);
        setField(term9630, term9630.getClass(), "visibility", null);
        setIntField(term9630, term9630.getClass(), "horizontalAlignment", 0);
        setIntField(term9630, term9630.getClass(), "columns", 0);
        setIntField(term9630, term9630.getClass(), "columnWidth", 0);
        setField(term9630, term9630.getClass(), "command", null);
        setField(term9630, term9630.getClass(), "model", null);
        setField(term9630, term9630.getClass(), "caret", null);
        setField(term9630, term9630.getClass(), "navigationFilter", null);
        setField(term9630, term9630.getClass(), "highlighter", null);
        setField(term9630, term9630.getClass(), "keymap", null);
        setField(term9630, term9630.getClass(), "caretEvent", null);
        setField(term9630, term9630.getClass(), "caretColor", null);
        setField(term9630, term9630.getClass(), "selectionColor", null);
        setField(term9630, term9630.getClass(), "selectedTextColor", null);
        setField(term9630, term9630.getClass(), "disabledTextColor", null);
        setBooleanField(term9630, term9630.getClass(), "editable", false);
        setField(term9630, term9630.getClass(), "margin", null);
        setCharField(term9630, term9630.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9630, term9630.getClass(), "dragEnabled", false);
        setField(term9630, term9630.getClass(), "dropMode", null);
        setField(term9630, term9630.getClass(), "dropLocation", null);
        setField(term9630, term9630.getClass(), "inputMethodRequestsHandler", null);
        setField(term9630, term9630.getClass(), "composedTextAttribute", null);
        setField(term9630, term9630.getClass(), "composedTextContent", null);
        setField(term9630, term9630.getClass(), "composedTextStart", null);
        setField(term9630, term9630.getClass(), "composedTextEnd", null);
        setField(term9630, term9630.getClass(), "latestCommittedTextStart", null);
        setField(term9630, term9630.getClass(), "latestCommittedTextEnd", null);
        setField(term9630, term9630.getClass(), "composedTextCaret", null);
        setField(term9630, term9630.getClass(), "originalCaret", null);
        setBooleanField(term9630, term9630.getClass(), "checkedInputOverride", false);
        setBooleanField(term9630, term9630.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9630, term9630.getClass(), "isAlignmentXSet", false);
        setFloatField(term9630, term9630.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9630, term9630.getClass(), "isAlignmentYSet", false);
        setFloatField(term9630, term9630.getClass(), "alignmentY", 0.0F);
        setField(term9630, term9630.getClass(), "ui", null);
        setField(term9630, term9630.getClass(), "listenerList", null);
        setField(term9630, term9630.getClass(), "clientProperties", null);
        setField(term9630, term9630.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9630, term9630.getClass(), "autoscrolls", false);
        setField(term9630, term9630.getClass(), "border", null);
        setIntField(term9630, term9630.getClass(), "flags", 0);
        setField(term9630, term9630.getClass(), "inputVerifier", null);
        setBooleanField(term9630, term9630.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9630, term9630.getClass(), "paintingChild", null);
        setField(term9630, term9630.getClass(), "popupMenu", null);
        setField(term9630, term9630.getClass(), "revalidateRunnableScheduled", null);
        setField(term9630, term9630.getClass(), "focusInputMap", null);
        setField(term9630, term9630.getClass(), "ancestorInputMap", null);
        setField(term9630, term9630.getClass(), "windowInputMap", null);
        setField(term9630, term9630.getClass(), "actionMap", null);
        setField(term9630, term9630.getClass(), "aaHint", null);
        setField(term9630, term9630.getClass(), "lcdRenderingHint", null);
        setField(term9630, term9630.getClass(), "component", null);
        setField(term9630, term9630.getClass(), "layoutMgr", null);
        setField(term9630, term9630.getClass(), "dispatcher", null);
        setField(term9630, term9630.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9630, term9630.getClass(), "focusCycleRoot", false);
        setBooleanField(term9630, term9630.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9630, term9630.getClass(), "printingThreads", null);
        setBooleanField(term9630, term9630.getClass(), "printing", false);
        setField(term9630, term9630.getClass(), "containerListener", null);
        setIntField(term9630, term9630.getClass(), "listeningChildren", 0);
        setIntField(term9630, term9630.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9630, term9630.getClass(), "descendantsCount", 0);
        setField(term9630, term9630.getClass(), "preserveBackgroundColor", null);
        setIntField(term9630, term9630.getClass(), "numOfHWComponents", 0);
        setIntField(term9630, term9630.getClass(), "numOfLWComponents", 0);
        setField(term9630, term9630.getClass(), "modalComp", null);
        setField(term9630, term9630.getClass(), "modalAppContext", null);
        setIntField(term9630, term9630.getClass(), "containerSerializedDataVersion", 0);
        setField(term9630, term9630.getClass(), "peer", null);
        setField(term9630, term9630.getClass(), "parent", null);
        setField(term9630, term9630.getClass(), "appContext", null);
        setIntField(term9630, term9630.getClass(), "x", 0);
        setIntField(term9630, term9630.getClass(), "y", 0);
        setIntField(term9630, term9630.getClass(), "width", 0);
        setIntField(term9630, term9630.getClass(), "height", 0);
        setField(term9630, term9630.getClass(), "foreground", null);
        setField(term9630, term9630.getClass(), "background", null);
        setField(term9630, term9630.getClass(), "font", null);
        setField(term9630, term9630.getClass(), "peerFont", null);
        setField(term9630, term9630.getClass(), "cursor", null);
        setField(term9630, term9630.getClass(), "locale", null);
        setField(term9630, term9630.getClass(), "graphicsConfig", null);
        setField(term9630, term9630.getClass(), "bufferStrategy", null);
        setBooleanField(term9630, term9630.getClass(), "ignoreRepaint", false);
        setBooleanField(term9630, term9630.getClass(), "visible", false);
        setBooleanField(term9630, term9630.getClass(), "enabled", false);
        setBooleanField(term9630, term9630.getClass(), "valid", false);
        setField(term9630, term9630.getClass(), "dropTarget", null);
        setField(term9630, term9630.getClass(), "popups", null);
        setField(term9630, term9630.getClass(), "name", null);
        setBooleanField(term9630, term9630.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9630, term9630.getClass(), "focusable", false);
        setIntField(term9630, term9630.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9630, term9630.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9630, term9630.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9630, term9630.getClass(), "acc", null);
        setField(term9630, term9630.getClass(), "minSize", null);
        setBooleanField(term9630, term9630.getClass(), "minSizeSet", false);
        setField(term9630, term9630.getClass(), "prefSize", null);
        setBooleanField(term9630, term9630.getClass(), "prefSizeSet", false);
        setField(term9630, term9630.getClass(), "maxSize", null);
        setBooleanField(term9630, term9630.getClass(), "maxSizeSet", false);
        setField(term9630, term9630.getClass(), "componentOrientation", null);
        setBooleanField(term9630, term9630.getClass(), "newEventsOnly", false);
        setField(term9630, term9630.getClass(), "componentListener", null);
        setField(term9630, term9630.getClass(), "focusListener", null);
        setField(term9630, term9630.getClass(), "hierarchyListener", null);
        setField(term9630, term9630.getClass(), "hierarchyBoundsListener", null);
        setField(term9630, term9630.getClass(), "keyListener", null);
        setField(term9630, term9630.getClass(), "mouseListener", null);
        setField(term9630, term9630.getClass(), "mouseMotionListener", null);
        setField(term9630, term9630.getClass(), "mouseWheelListener", null);
        setField(term9630, term9630.getClass(), "inputMethodListener", null);
        setLongField(term9630, term9630.getClass(), "eventMask", 0L);
        setField(term9630, term9630.getClass(), "changeSupport", null);
        setField(term9630, term9630.getClass(), "objectLock", null);
        setBooleanField(term9630, term9630.getClass(), "isPacked", false);
        setIntField(term9630, term9630.getClass(), "boundsOp", 0);
        setField(term9630, term9630.getClass(), "compoundShape", null);
        setField(term9630, term9630.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9630, term9630.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9630, term9630.getClass(), "backgroundEraseDisabled", false);
        setField(term9630, term9630.getClass(), "eventCache", null);
        setBooleanField(term9630, term9630.getClass(), "coalescingEnabled", false);
        setBooleanField(term9630, term9630.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9630, term9630.getClass(), "componentSerializedDataVersion", 0);
        setField(term9630, term9630.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasText", argTypes, term9630, args);
    }

};


