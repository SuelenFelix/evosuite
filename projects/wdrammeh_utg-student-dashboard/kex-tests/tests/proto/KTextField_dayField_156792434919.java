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

public class KTextField_dayField_156792434919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9434;

    public KTextField_dayField_156792434919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9434 = newInstance(Class.forName("proto.KTextField"));
        setField(term9434, term9434.getClass(), "action", null);
        setField(term9434, term9434.getClass(), "actionPropertyChangeListener", null);
        setField(term9434, term9434.getClass(), "visibility", null);
        setIntField(term9434, term9434.getClass(), "horizontalAlignment", 0);
        setIntField(term9434, term9434.getClass(), "columns", 0);
        setIntField(term9434, term9434.getClass(), "columnWidth", 0);
        setField(term9434, term9434.getClass(), "command", null);
        setField(term9434, term9434.getClass(), "model", null);
        setField(term9434, term9434.getClass(), "caret", null);
        setField(term9434, term9434.getClass(), "navigationFilter", null);
        setField(term9434, term9434.getClass(), "highlighter", null);
        setField(term9434, term9434.getClass(), "keymap", null);
        setField(term9434, term9434.getClass(), "caretEvent", null);
        setField(term9434, term9434.getClass(), "caretColor", null);
        setField(term9434, term9434.getClass(), "selectionColor", null);
        setField(term9434, term9434.getClass(), "selectedTextColor", null);
        setField(term9434, term9434.getClass(), "disabledTextColor", null);
        setBooleanField(term9434, term9434.getClass(), "editable", false);
        setField(term9434, term9434.getClass(), "margin", null);
        setCharField(term9434, term9434.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9434, term9434.getClass(), "dragEnabled", false);
        setField(term9434, term9434.getClass(), "dropMode", null);
        setField(term9434, term9434.getClass(), "dropLocation", null);
        setField(term9434, term9434.getClass(), "inputMethodRequestsHandler", null);
        setField(term9434, term9434.getClass(), "composedTextAttribute", null);
        setField(term9434, term9434.getClass(), "composedTextContent", null);
        setField(term9434, term9434.getClass(), "composedTextStart", null);
        setField(term9434, term9434.getClass(), "composedTextEnd", null);
        setField(term9434, term9434.getClass(), "latestCommittedTextStart", null);
        setField(term9434, term9434.getClass(), "latestCommittedTextEnd", null);
        setField(term9434, term9434.getClass(), "composedTextCaret", null);
        setField(term9434, term9434.getClass(), "originalCaret", null);
        setBooleanField(term9434, term9434.getClass(), "checkedInputOverride", false);
        setBooleanField(term9434, term9434.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9434, term9434.getClass(), "isAlignmentXSet", false);
        setFloatField(term9434, term9434.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9434, term9434.getClass(), "isAlignmentYSet", false);
        setFloatField(term9434, term9434.getClass(), "alignmentY", 0.0F);
        setField(term9434, term9434.getClass(), "ui", null);
        setField(term9434, term9434.getClass(), "listenerList", null);
        setField(term9434, term9434.getClass(), "clientProperties", null);
        setField(term9434, term9434.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9434, term9434.getClass(), "autoscrolls", false);
        setField(term9434, term9434.getClass(), "border", null);
        setIntField(term9434, term9434.getClass(), "flags", 0);
        setField(term9434, term9434.getClass(), "inputVerifier", null);
        setBooleanField(term9434, term9434.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9434, term9434.getClass(), "paintingChild", null);
        setField(term9434, term9434.getClass(), "popupMenu", null);
        setField(term9434, term9434.getClass(), "revalidateRunnableScheduled", null);
        setField(term9434, term9434.getClass(), "focusInputMap", null);
        setField(term9434, term9434.getClass(), "ancestorInputMap", null);
        setField(term9434, term9434.getClass(), "windowInputMap", null);
        setField(term9434, term9434.getClass(), "actionMap", null);
        setField(term9434, term9434.getClass(), "aaHint", null);
        setField(term9434, term9434.getClass(), "lcdRenderingHint", null);
        setField(term9434, term9434.getClass(), "component", null);
        setField(term9434, term9434.getClass(), "layoutMgr", null);
        setField(term9434, term9434.getClass(), "dispatcher", null);
        setField(term9434, term9434.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9434, term9434.getClass(), "focusCycleRoot", false);
        setBooleanField(term9434, term9434.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9434, term9434.getClass(), "printingThreads", null);
        setBooleanField(term9434, term9434.getClass(), "printing", false);
        setField(term9434, term9434.getClass(), "containerListener", null);
        setIntField(term9434, term9434.getClass(), "listeningChildren", 0);
        setIntField(term9434, term9434.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9434, term9434.getClass(), "descendantsCount", 0);
        setField(term9434, term9434.getClass(), "preserveBackgroundColor", null);
        setIntField(term9434, term9434.getClass(), "numOfHWComponents", 0);
        setIntField(term9434, term9434.getClass(), "numOfLWComponents", 0);
        setField(term9434, term9434.getClass(), "modalComp", null);
        setField(term9434, term9434.getClass(), "modalAppContext", null);
        setIntField(term9434, term9434.getClass(), "containerSerializedDataVersion", 0);
        setField(term9434, term9434.getClass(), "peer", null);
        setField(term9434, term9434.getClass(), "parent", null);
        setField(term9434, term9434.getClass(), "appContext", null);
        setIntField(term9434, term9434.getClass(), "x", 0);
        setIntField(term9434, term9434.getClass(), "y", 0);
        setIntField(term9434, term9434.getClass(), "width", 0);
        setIntField(term9434, term9434.getClass(), "height", 0);
        setField(term9434, term9434.getClass(), "foreground", null);
        setField(term9434, term9434.getClass(), "background", null);
        setField(term9434, term9434.getClass(), "font", null);
        setField(term9434, term9434.getClass(), "peerFont", null);
        setField(term9434, term9434.getClass(), "cursor", null);
        setField(term9434, term9434.getClass(), "locale", null);
        setField(term9434, term9434.getClass(), "graphicsConfig", null);
        setField(term9434, term9434.getClass(), "bufferStrategy", null);
        setBooleanField(term9434, term9434.getClass(), "ignoreRepaint", false);
        setBooleanField(term9434, term9434.getClass(), "visible", false);
        setBooleanField(term9434, term9434.getClass(), "enabled", false);
        setBooleanField(term9434, term9434.getClass(), "valid", false);
        setField(term9434, term9434.getClass(), "dropTarget", null);
        setField(term9434, term9434.getClass(), "popups", null);
        setField(term9434, term9434.getClass(), "name", null);
        setBooleanField(term9434, term9434.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9434, term9434.getClass(), "focusable", false);
        setIntField(term9434, term9434.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9434, term9434.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9434, term9434.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9434, term9434.getClass(), "acc", null);
        setField(term9434, term9434.getClass(), "minSize", null);
        setBooleanField(term9434, term9434.getClass(), "minSizeSet", false);
        setField(term9434, term9434.getClass(), "prefSize", null);
        setBooleanField(term9434, term9434.getClass(), "prefSizeSet", false);
        setField(term9434, term9434.getClass(), "maxSize", null);
        setBooleanField(term9434, term9434.getClass(), "maxSizeSet", false);
        setField(term9434, term9434.getClass(), "componentOrientation", null);
        setBooleanField(term9434, term9434.getClass(), "newEventsOnly", false);
        setField(term9434, term9434.getClass(), "componentListener", null);
        setField(term9434, term9434.getClass(), "focusListener", null);
        setField(term9434, term9434.getClass(), "hierarchyListener", null);
        setField(term9434, term9434.getClass(), "hierarchyBoundsListener", null);
        setField(term9434, term9434.getClass(), "keyListener", null);
        setField(term9434, term9434.getClass(), "mouseListener", null);
        setField(term9434, term9434.getClass(), "mouseMotionListener", null);
        setField(term9434, term9434.getClass(), "mouseWheelListener", null);
        setField(term9434, term9434.getClass(), "inputMethodListener", null);
        setLongField(term9434, term9434.getClass(), "eventMask", 0L);
        setField(term9434, term9434.getClass(), "changeSupport", null);
        setField(term9434, term9434.getClass(), "objectLock", null);
        setBooleanField(term9434, term9434.getClass(), "isPacked", false);
        setIntField(term9434, term9434.getClass(), "boundsOp", 0);
        setField(term9434, term9434.getClass(), "compoundShape", null);
        setField(term9434, term9434.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9434, term9434.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9434, term9434.getClass(), "backgroundEraseDisabled", false);
        setField(term9434, term9434.getClass(), "eventCache", null);
        setBooleanField(term9434, term9434.getClass(), "coalescingEnabled", false);
        setBooleanField(term9434, term9434.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9434, term9434.getClass(), "componentSerializedDataVersion", 0);
        setField(term9434, term9434.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dayField", argTypes, term9434, args);
    }

};


