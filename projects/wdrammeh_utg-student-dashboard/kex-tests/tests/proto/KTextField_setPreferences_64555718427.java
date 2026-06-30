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

public class KTextField_setPreferences_64555718427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9816;

    public KTextField_setPreferences_64555718427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9816 = newInstance(Class.forName("proto.KTextField"));
        setField(term9816, term9816.getClass(), "action", null);
        setField(term9816, term9816.getClass(), "actionPropertyChangeListener", null);
        setField(term9816, term9816.getClass(), "visibility", null);
        setIntField(term9816, term9816.getClass(), "horizontalAlignment", 0);
        setIntField(term9816, term9816.getClass(), "columns", 0);
        setIntField(term9816, term9816.getClass(), "columnWidth", 0);
        setField(term9816, term9816.getClass(), "command", null);
        setField(term9816, term9816.getClass(), "model", null);
        setField(term9816, term9816.getClass(), "caret", null);
        setField(term9816, term9816.getClass(), "navigationFilter", null);
        setField(term9816, term9816.getClass(), "highlighter", null);
        setField(term9816, term9816.getClass(), "keymap", null);
        setField(term9816, term9816.getClass(), "caretEvent", null);
        setField(term9816, term9816.getClass(), "caretColor", null);
        setField(term9816, term9816.getClass(), "selectionColor", null);
        setField(term9816, term9816.getClass(), "selectedTextColor", null);
        setField(term9816, term9816.getClass(), "disabledTextColor", null);
        setBooleanField(term9816, term9816.getClass(), "editable", false);
        setField(term9816, term9816.getClass(), "margin", null);
        setCharField(term9816, term9816.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9816, term9816.getClass(), "dragEnabled", false);
        setField(term9816, term9816.getClass(), "dropMode", null);
        setField(term9816, term9816.getClass(), "dropLocation", null);
        setField(term9816, term9816.getClass(), "inputMethodRequestsHandler", null);
        setField(term9816, term9816.getClass(), "composedTextAttribute", null);
        setField(term9816, term9816.getClass(), "composedTextContent", null);
        setField(term9816, term9816.getClass(), "composedTextStart", null);
        setField(term9816, term9816.getClass(), "composedTextEnd", null);
        setField(term9816, term9816.getClass(), "latestCommittedTextStart", null);
        setField(term9816, term9816.getClass(), "latestCommittedTextEnd", null);
        setField(term9816, term9816.getClass(), "composedTextCaret", null);
        setField(term9816, term9816.getClass(), "originalCaret", null);
        setBooleanField(term9816, term9816.getClass(), "checkedInputOverride", false);
        setBooleanField(term9816, term9816.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9816, term9816.getClass(), "isAlignmentXSet", false);
        setFloatField(term9816, term9816.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9816, term9816.getClass(), "isAlignmentYSet", false);
        setFloatField(term9816, term9816.getClass(), "alignmentY", 0.0F);
        setField(term9816, term9816.getClass(), "ui", null);
        setField(term9816, term9816.getClass(), "listenerList", null);
        setField(term9816, term9816.getClass(), "clientProperties", null);
        setField(term9816, term9816.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9816, term9816.getClass(), "autoscrolls", false);
        setField(term9816, term9816.getClass(), "border", null);
        setIntField(term9816, term9816.getClass(), "flags", 0);
        setField(term9816, term9816.getClass(), "inputVerifier", null);
        setBooleanField(term9816, term9816.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9816, term9816.getClass(), "paintingChild", null);
        setField(term9816, term9816.getClass(), "popupMenu", null);
        setField(term9816, term9816.getClass(), "revalidateRunnableScheduled", null);
        setField(term9816, term9816.getClass(), "focusInputMap", null);
        setField(term9816, term9816.getClass(), "ancestorInputMap", null);
        setField(term9816, term9816.getClass(), "windowInputMap", null);
        setField(term9816, term9816.getClass(), "actionMap", null);
        setField(term9816, term9816.getClass(), "aaHint", null);
        setField(term9816, term9816.getClass(), "lcdRenderingHint", null);
        setField(term9816, term9816.getClass(), "component", null);
        setField(term9816, term9816.getClass(), "layoutMgr", null);
        setField(term9816, term9816.getClass(), "dispatcher", null);
        setField(term9816, term9816.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9816, term9816.getClass(), "focusCycleRoot", false);
        setBooleanField(term9816, term9816.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9816, term9816.getClass(), "printingThreads", null);
        setBooleanField(term9816, term9816.getClass(), "printing", false);
        setField(term9816, term9816.getClass(), "containerListener", null);
        setIntField(term9816, term9816.getClass(), "listeningChildren", 0);
        setIntField(term9816, term9816.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9816, term9816.getClass(), "descendantsCount", 0);
        setField(term9816, term9816.getClass(), "preserveBackgroundColor", null);
        setIntField(term9816, term9816.getClass(), "numOfHWComponents", 0);
        setIntField(term9816, term9816.getClass(), "numOfLWComponents", 0);
        setField(term9816, term9816.getClass(), "modalComp", null);
        setField(term9816, term9816.getClass(), "modalAppContext", null);
        setIntField(term9816, term9816.getClass(), "containerSerializedDataVersion", 0);
        setField(term9816, term9816.getClass(), "peer", null);
        setField(term9816, term9816.getClass(), "parent", null);
        setField(term9816, term9816.getClass(), "appContext", null);
        setIntField(term9816, term9816.getClass(), "x", 0);
        setIntField(term9816, term9816.getClass(), "y", 0);
        setIntField(term9816, term9816.getClass(), "width", 0);
        setIntField(term9816, term9816.getClass(), "height", 0);
        setField(term9816, term9816.getClass(), "foreground", null);
        setField(term9816, term9816.getClass(), "background", null);
        setField(term9816, term9816.getClass(), "font", null);
        setField(term9816, term9816.getClass(), "peerFont", null);
        setField(term9816, term9816.getClass(), "cursor", null);
        setField(term9816, term9816.getClass(), "locale", null);
        setField(term9816, term9816.getClass(), "graphicsConfig", null);
        setField(term9816, term9816.getClass(), "bufferStrategy", null);
        setBooleanField(term9816, term9816.getClass(), "ignoreRepaint", false);
        setBooleanField(term9816, term9816.getClass(), "visible", false);
        setBooleanField(term9816, term9816.getClass(), "enabled", false);
        setBooleanField(term9816, term9816.getClass(), "valid", false);
        setField(term9816, term9816.getClass(), "dropTarget", null);
        setField(term9816, term9816.getClass(), "popups", null);
        setField(term9816, term9816.getClass(), "name", null);
        setBooleanField(term9816, term9816.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9816, term9816.getClass(), "focusable", false);
        setIntField(term9816, term9816.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9816, term9816.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9816, term9816.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9816, term9816.getClass(), "acc", null);
        setField(term9816, term9816.getClass(), "minSize", null);
        setBooleanField(term9816, term9816.getClass(), "minSizeSet", false);
        setField(term9816, term9816.getClass(), "prefSize", null);
        setBooleanField(term9816, term9816.getClass(), "prefSizeSet", false);
        setField(term9816, term9816.getClass(), "maxSize", null);
        setBooleanField(term9816, term9816.getClass(), "maxSizeSet", false);
        setField(term9816, term9816.getClass(), "componentOrientation", null);
        setBooleanField(term9816, term9816.getClass(), "newEventsOnly", false);
        setField(term9816, term9816.getClass(), "componentListener", null);
        setField(term9816, term9816.getClass(), "focusListener", null);
        setField(term9816, term9816.getClass(), "hierarchyListener", null);
        setField(term9816, term9816.getClass(), "hierarchyBoundsListener", null);
        setField(term9816, term9816.getClass(), "keyListener", null);
        setField(term9816, term9816.getClass(), "mouseListener", null);
        setField(term9816, term9816.getClass(), "mouseMotionListener", null);
        setField(term9816, term9816.getClass(), "mouseWheelListener", null);
        setField(term9816, term9816.getClass(), "inputMethodListener", null);
        setLongField(term9816, term9816.getClass(), "eventMask", 0L);
        setField(term9816, term9816.getClass(), "changeSupport", null);
        setField(term9816, term9816.getClass(), "objectLock", null);
        setBooleanField(term9816, term9816.getClass(), "isPacked", false);
        setIntField(term9816, term9816.getClass(), "boundsOp", 0);
        setField(term9816, term9816.getClass(), "compoundShape", null);
        setField(term9816, term9816.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9816, term9816.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9816, term9816.getClass(), "backgroundEraseDisabled", false);
        setField(term9816, term9816.getClass(), "eventCache", null);
        setBooleanField(term9816, term9816.getClass(), "coalescingEnabled", false);
        setBooleanField(term9816, term9816.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9816, term9816.getClass(), "componentSerializedDataVersion", 0);
        setField(term9816, term9816.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term9816, args);
    }

};


