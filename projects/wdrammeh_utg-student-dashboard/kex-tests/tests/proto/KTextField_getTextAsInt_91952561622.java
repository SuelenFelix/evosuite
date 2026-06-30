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

public class KTextField_getTextAsInt_91952561622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9569;

    public KTextField_getTextAsInt_91952561622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9569 = newInstance(Class.forName("proto.KTextField"));
        setField(term9569, term9569.getClass(), "action", null);
        setField(term9569, term9569.getClass(), "actionPropertyChangeListener", null);
        setField(term9569, term9569.getClass(), "visibility", null);
        setIntField(term9569, term9569.getClass(), "horizontalAlignment", 0);
        setIntField(term9569, term9569.getClass(), "columns", 0);
        setIntField(term9569, term9569.getClass(), "columnWidth", 0);
        setField(term9569, term9569.getClass(), "command", null);
        setField(term9569, term9569.getClass(), "model", null);
        setField(term9569, term9569.getClass(), "caret", null);
        setField(term9569, term9569.getClass(), "navigationFilter", null);
        setField(term9569, term9569.getClass(), "highlighter", null);
        setField(term9569, term9569.getClass(), "keymap", null);
        setField(term9569, term9569.getClass(), "caretEvent", null);
        setField(term9569, term9569.getClass(), "caretColor", null);
        setField(term9569, term9569.getClass(), "selectionColor", null);
        setField(term9569, term9569.getClass(), "selectedTextColor", null);
        setField(term9569, term9569.getClass(), "disabledTextColor", null);
        setBooleanField(term9569, term9569.getClass(), "editable", false);
        setField(term9569, term9569.getClass(), "margin", null);
        setCharField(term9569, term9569.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9569, term9569.getClass(), "dragEnabled", false);
        setField(term9569, term9569.getClass(), "dropMode", null);
        setField(term9569, term9569.getClass(), "dropLocation", null);
        setField(term9569, term9569.getClass(), "inputMethodRequestsHandler", null);
        setField(term9569, term9569.getClass(), "composedTextAttribute", null);
        setField(term9569, term9569.getClass(), "composedTextContent", null);
        setField(term9569, term9569.getClass(), "composedTextStart", null);
        setField(term9569, term9569.getClass(), "composedTextEnd", null);
        setField(term9569, term9569.getClass(), "latestCommittedTextStart", null);
        setField(term9569, term9569.getClass(), "latestCommittedTextEnd", null);
        setField(term9569, term9569.getClass(), "composedTextCaret", null);
        setField(term9569, term9569.getClass(), "originalCaret", null);
        setBooleanField(term9569, term9569.getClass(), "checkedInputOverride", false);
        setBooleanField(term9569, term9569.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9569, term9569.getClass(), "isAlignmentXSet", false);
        setFloatField(term9569, term9569.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9569, term9569.getClass(), "isAlignmentYSet", false);
        setFloatField(term9569, term9569.getClass(), "alignmentY", 0.0F);
        setField(term9569, term9569.getClass(), "ui", null);
        setField(term9569, term9569.getClass(), "listenerList", null);
        setField(term9569, term9569.getClass(), "clientProperties", null);
        setField(term9569, term9569.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9569, term9569.getClass(), "autoscrolls", false);
        setField(term9569, term9569.getClass(), "border", null);
        setIntField(term9569, term9569.getClass(), "flags", 0);
        setField(term9569, term9569.getClass(), "inputVerifier", null);
        setBooleanField(term9569, term9569.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9569, term9569.getClass(), "paintingChild", null);
        setField(term9569, term9569.getClass(), "popupMenu", null);
        setField(term9569, term9569.getClass(), "revalidateRunnableScheduled", null);
        setField(term9569, term9569.getClass(), "focusInputMap", null);
        setField(term9569, term9569.getClass(), "ancestorInputMap", null);
        setField(term9569, term9569.getClass(), "windowInputMap", null);
        setField(term9569, term9569.getClass(), "actionMap", null);
        setField(term9569, term9569.getClass(), "aaHint", null);
        setField(term9569, term9569.getClass(), "lcdRenderingHint", null);
        setField(term9569, term9569.getClass(), "component", null);
        setField(term9569, term9569.getClass(), "layoutMgr", null);
        setField(term9569, term9569.getClass(), "dispatcher", null);
        setField(term9569, term9569.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9569, term9569.getClass(), "focusCycleRoot", false);
        setBooleanField(term9569, term9569.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9569, term9569.getClass(), "printingThreads", null);
        setBooleanField(term9569, term9569.getClass(), "printing", false);
        setField(term9569, term9569.getClass(), "containerListener", null);
        setIntField(term9569, term9569.getClass(), "listeningChildren", 0);
        setIntField(term9569, term9569.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9569, term9569.getClass(), "descendantsCount", 0);
        setField(term9569, term9569.getClass(), "preserveBackgroundColor", null);
        setIntField(term9569, term9569.getClass(), "numOfHWComponents", 0);
        setIntField(term9569, term9569.getClass(), "numOfLWComponents", 0);
        setField(term9569, term9569.getClass(), "modalComp", null);
        setField(term9569, term9569.getClass(), "modalAppContext", null);
        setIntField(term9569, term9569.getClass(), "containerSerializedDataVersion", 0);
        setField(term9569, term9569.getClass(), "peer", null);
        setField(term9569, term9569.getClass(), "parent", null);
        setField(term9569, term9569.getClass(), "appContext", null);
        setIntField(term9569, term9569.getClass(), "x", 0);
        setIntField(term9569, term9569.getClass(), "y", 0);
        setIntField(term9569, term9569.getClass(), "width", 0);
        setIntField(term9569, term9569.getClass(), "height", 0);
        setField(term9569, term9569.getClass(), "foreground", null);
        setField(term9569, term9569.getClass(), "background", null);
        setField(term9569, term9569.getClass(), "font", null);
        setField(term9569, term9569.getClass(), "peerFont", null);
        setField(term9569, term9569.getClass(), "cursor", null);
        setField(term9569, term9569.getClass(), "locale", null);
        setField(term9569, term9569.getClass(), "graphicsConfig", null);
        setField(term9569, term9569.getClass(), "bufferStrategy", null);
        setBooleanField(term9569, term9569.getClass(), "ignoreRepaint", false);
        setBooleanField(term9569, term9569.getClass(), "visible", false);
        setBooleanField(term9569, term9569.getClass(), "enabled", false);
        setBooleanField(term9569, term9569.getClass(), "valid", false);
        setField(term9569, term9569.getClass(), "dropTarget", null);
        setField(term9569, term9569.getClass(), "popups", null);
        setField(term9569, term9569.getClass(), "name", null);
        setBooleanField(term9569, term9569.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9569, term9569.getClass(), "focusable", false);
        setIntField(term9569, term9569.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9569, term9569.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9569, term9569.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9569, term9569.getClass(), "acc", null);
        setField(term9569, term9569.getClass(), "minSize", null);
        setBooleanField(term9569, term9569.getClass(), "minSizeSet", false);
        setField(term9569, term9569.getClass(), "prefSize", null);
        setBooleanField(term9569, term9569.getClass(), "prefSizeSet", false);
        setField(term9569, term9569.getClass(), "maxSize", null);
        setBooleanField(term9569, term9569.getClass(), "maxSizeSet", false);
        setField(term9569, term9569.getClass(), "componentOrientation", null);
        setBooleanField(term9569, term9569.getClass(), "newEventsOnly", false);
        setField(term9569, term9569.getClass(), "componentListener", null);
        setField(term9569, term9569.getClass(), "focusListener", null);
        setField(term9569, term9569.getClass(), "hierarchyListener", null);
        setField(term9569, term9569.getClass(), "hierarchyBoundsListener", null);
        setField(term9569, term9569.getClass(), "keyListener", null);
        setField(term9569, term9569.getClass(), "mouseListener", null);
        setField(term9569, term9569.getClass(), "mouseMotionListener", null);
        setField(term9569, term9569.getClass(), "mouseWheelListener", null);
        setField(term9569, term9569.getClass(), "inputMethodListener", null);
        setLongField(term9569, term9569.getClass(), "eventMask", 0L);
        setField(term9569, term9569.getClass(), "changeSupport", null);
        setField(term9569, term9569.getClass(), "objectLock", null);
        setBooleanField(term9569, term9569.getClass(), "isPacked", false);
        setIntField(term9569, term9569.getClass(), "boundsOp", 0);
        setField(term9569, term9569.getClass(), "compoundShape", null);
        setField(term9569, term9569.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9569, term9569.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9569, term9569.getClass(), "backgroundEraseDisabled", false);
        setField(term9569, term9569.getClass(), "eventCache", null);
        setBooleanField(term9569, term9569.getClass(), "coalescingEnabled", false);
        setBooleanField(term9569, term9569.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9569, term9569.getClass(), "componentSerializedDataVersion", 0);
        setField(term9569, term9569.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTextAsInt", argTypes, term9569, args);
    }

};


