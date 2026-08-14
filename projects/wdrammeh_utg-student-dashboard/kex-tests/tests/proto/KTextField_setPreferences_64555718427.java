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
     Object term9828;

    public KTextField_setPreferences_64555718427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9828 = newInstance(Class.forName("proto.KTextField"));
        setField(term9828, term9828.getClass(), "action", null);
        setField(term9828, term9828.getClass(), "actionPropertyChangeListener", null);
        setField(term9828, term9828.getClass(), "visibility", null);
        setIntField(term9828, term9828.getClass(), "horizontalAlignment", 0);
        setIntField(term9828, term9828.getClass(), "columns", 0);
        setIntField(term9828, term9828.getClass(), "columnWidth", 0);
        setField(term9828, term9828.getClass(), "command", null);
        setField(term9828, term9828.getClass(), "model", null);
        setField(term9828, term9828.getClass(), "caret", null);
        setField(term9828, term9828.getClass(), "navigationFilter", null);
        setField(term9828, term9828.getClass(), "highlighter", null);
        setField(term9828, term9828.getClass(), "keymap", null);
        setField(term9828, term9828.getClass(), "caretEvent", null);
        setField(term9828, term9828.getClass(), "caretColor", null);
        setField(term9828, term9828.getClass(), "selectionColor", null);
        setField(term9828, term9828.getClass(), "selectedTextColor", null);
        setField(term9828, term9828.getClass(), "disabledTextColor", null);
        setBooleanField(term9828, term9828.getClass(), "editable", false);
        setField(term9828, term9828.getClass(), "margin", null);
        setCharField(term9828, term9828.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9828, term9828.getClass(), "dragEnabled", false);
        setField(term9828, term9828.getClass(), "dropMode", null);
        setField(term9828, term9828.getClass(), "dropLocation", null);
        setField(term9828, term9828.getClass(), "inputMethodRequestsHandler", null);
        setField(term9828, term9828.getClass(), "composedTextAttribute", null);
        setField(term9828, term9828.getClass(), "composedTextContent", null);
        setField(term9828, term9828.getClass(), "composedTextStart", null);
        setField(term9828, term9828.getClass(), "composedTextEnd", null);
        setField(term9828, term9828.getClass(), "latestCommittedTextStart", null);
        setField(term9828, term9828.getClass(), "latestCommittedTextEnd", null);
        setField(term9828, term9828.getClass(), "composedTextCaret", null);
        setField(term9828, term9828.getClass(), "originalCaret", null);
        setBooleanField(term9828, term9828.getClass(), "checkedInputOverride", false);
        setBooleanField(term9828, term9828.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9828, term9828.getClass(), "isAlignmentXSet", false);
        setFloatField(term9828, term9828.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9828, term9828.getClass(), "isAlignmentYSet", false);
        setFloatField(term9828, term9828.getClass(), "alignmentY", 0.0F);
        setField(term9828, term9828.getClass(), "ui", null);
        setField(term9828, term9828.getClass(), "listenerList", null);
        setField(term9828, term9828.getClass(), "clientProperties", null);
        setField(term9828, term9828.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9828, term9828.getClass(), "autoscrolls", false);
        setField(term9828, term9828.getClass(), "border", null);
        setIntField(term9828, term9828.getClass(), "flags", 0);
        setField(term9828, term9828.getClass(), "inputVerifier", null);
        setBooleanField(term9828, term9828.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9828, term9828.getClass(), "paintingChild", null);
        setField(term9828, term9828.getClass(), "popupMenu", null);
        setField(term9828, term9828.getClass(), "revalidateRunnableScheduled", null);
        setField(term9828, term9828.getClass(), "focusInputMap", null);
        setField(term9828, term9828.getClass(), "ancestorInputMap", null);
        setField(term9828, term9828.getClass(), "windowInputMap", null);
        setField(term9828, term9828.getClass(), "actionMap", null);
        setField(term9828, term9828.getClass(), "aaHint", null);
        setField(term9828, term9828.getClass(), "lcdRenderingHint", null);
        setField(term9828, term9828.getClass(), "component", null);
        setField(term9828, term9828.getClass(), "layoutMgr", null);
        setField(term9828, term9828.getClass(), "dispatcher", null);
        setField(term9828, term9828.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9828, term9828.getClass(), "focusCycleRoot", false);
        setBooleanField(term9828, term9828.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9828, term9828.getClass(), "printingThreads", null);
        setBooleanField(term9828, term9828.getClass(), "printing", false);
        setField(term9828, term9828.getClass(), "containerListener", null);
        setIntField(term9828, term9828.getClass(), "listeningChildren", 0);
        setIntField(term9828, term9828.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9828, term9828.getClass(), "descendantsCount", 0);
        setField(term9828, term9828.getClass(), "preserveBackgroundColor", null);
        setIntField(term9828, term9828.getClass(), "numOfHWComponents", 0);
        setIntField(term9828, term9828.getClass(), "numOfLWComponents", 0);
        setField(term9828, term9828.getClass(), "modalComp", null);
        setField(term9828, term9828.getClass(), "modalAppContext", null);
        setIntField(term9828, term9828.getClass(), "containerSerializedDataVersion", 0);
        setField(term9828, term9828.getClass(), "peer", null);
        setField(term9828, term9828.getClass(), "parent", null);
        setField(term9828, term9828.getClass(), "appContext", null);
        setIntField(term9828, term9828.getClass(), "x", 0);
        setIntField(term9828, term9828.getClass(), "y", 0);
        setIntField(term9828, term9828.getClass(), "width", 0);
        setIntField(term9828, term9828.getClass(), "height", 0);
        setField(term9828, term9828.getClass(), "foreground", null);
        setField(term9828, term9828.getClass(), "background", null);
        setField(term9828, term9828.getClass(), "font", null);
        setField(term9828, term9828.getClass(), "peerFont", null);
        setField(term9828, term9828.getClass(), "cursor", null);
        setField(term9828, term9828.getClass(), "locale", null);
        setField(term9828, term9828.getClass(), "graphicsConfig", null);
        setField(term9828, term9828.getClass(), "bufferStrategy", null);
        setBooleanField(term9828, term9828.getClass(), "ignoreRepaint", false);
        setBooleanField(term9828, term9828.getClass(), "visible", false);
        setBooleanField(term9828, term9828.getClass(), "enabled", false);
        setBooleanField(term9828, term9828.getClass(), "valid", false);
        setField(term9828, term9828.getClass(), "dropTarget", null);
        setField(term9828, term9828.getClass(), "popups", null);
        setField(term9828, term9828.getClass(), "name", null);
        setBooleanField(term9828, term9828.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9828, term9828.getClass(), "focusable", false);
        setIntField(term9828, term9828.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9828, term9828.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9828, term9828.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9828, term9828.getClass(), "acc", null);
        setField(term9828, term9828.getClass(), "minSize", null);
        setBooleanField(term9828, term9828.getClass(), "minSizeSet", false);
        setField(term9828, term9828.getClass(), "prefSize", null);
        setBooleanField(term9828, term9828.getClass(), "prefSizeSet", false);
        setField(term9828, term9828.getClass(), "maxSize", null);
        setBooleanField(term9828, term9828.getClass(), "maxSizeSet", false);
        setField(term9828, term9828.getClass(), "componentOrientation", null);
        setBooleanField(term9828, term9828.getClass(), "newEventsOnly", false);
        setField(term9828, term9828.getClass(), "componentListener", null);
        setField(term9828, term9828.getClass(), "focusListener", null);
        setField(term9828, term9828.getClass(), "hierarchyListener", null);
        setField(term9828, term9828.getClass(), "hierarchyBoundsListener", null);
        setField(term9828, term9828.getClass(), "keyListener", null);
        setField(term9828, term9828.getClass(), "mouseListener", null);
        setField(term9828, term9828.getClass(), "mouseMotionListener", null);
        setField(term9828, term9828.getClass(), "mouseWheelListener", null);
        setField(term9828, term9828.getClass(), "inputMethodListener", null);
        setLongField(term9828, term9828.getClass(), "eventMask", 0L);
        setField(term9828, term9828.getClass(), "changeSupport", null);
        setField(term9828, term9828.getClass(), "objectLock", null);
        setBooleanField(term9828, term9828.getClass(), "isPacked", false);
        setIntField(term9828, term9828.getClass(), "boundsOp", 0);
        setField(term9828, term9828.getClass(), "compoundShape", null);
        setField(term9828, term9828.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9828, term9828.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9828, term9828.getClass(), "backgroundEraseDisabled", false);
        setField(term9828, term9828.getClass(), "eventCache", null);
        setBooleanField(term9828, term9828.getClass(), "coalescingEnabled", false);
        setBooleanField(term9828, term9828.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9828, term9828.getClass(), "componentSerializedDataVersion", 0);
        setField(term9828, term9828.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term9828, args);
    }

};


