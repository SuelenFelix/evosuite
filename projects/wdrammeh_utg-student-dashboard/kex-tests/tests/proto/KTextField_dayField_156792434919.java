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
     Object term9422;

    public KTextField_dayField_156792434919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9422 = newInstance(Class.forName("proto.KTextField"));
        setField(term9422, term9422.getClass(), "action", null);
        setField(term9422, term9422.getClass(), "actionPropertyChangeListener", null);
        setField(term9422, term9422.getClass(), "visibility", null);
        setIntField(term9422, term9422.getClass(), "horizontalAlignment", 0);
        setIntField(term9422, term9422.getClass(), "columns", 0);
        setIntField(term9422, term9422.getClass(), "columnWidth", 0);
        setField(term9422, term9422.getClass(), "command", null);
        setField(term9422, term9422.getClass(), "model", null);
        setField(term9422, term9422.getClass(), "caret", null);
        setField(term9422, term9422.getClass(), "navigationFilter", null);
        setField(term9422, term9422.getClass(), "highlighter", null);
        setField(term9422, term9422.getClass(), "keymap", null);
        setField(term9422, term9422.getClass(), "caretEvent", null);
        setField(term9422, term9422.getClass(), "caretColor", null);
        setField(term9422, term9422.getClass(), "selectionColor", null);
        setField(term9422, term9422.getClass(), "selectedTextColor", null);
        setField(term9422, term9422.getClass(), "disabledTextColor", null);
        setBooleanField(term9422, term9422.getClass(), "editable", false);
        setField(term9422, term9422.getClass(), "margin", null);
        setCharField(term9422, term9422.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9422, term9422.getClass(), "dragEnabled", false);
        setField(term9422, term9422.getClass(), "dropMode", null);
        setField(term9422, term9422.getClass(), "dropLocation", null);
        setField(term9422, term9422.getClass(), "inputMethodRequestsHandler", null);
        setField(term9422, term9422.getClass(), "composedTextAttribute", null);
        setField(term9422, term9422.getClass(), "composedTextContent", null);
        setField(term9422, term9422.getClass(), "composedTextStart", null);
        setField(term9422, term9422.getClass(), "composedTextEnd", null);
        setField(term9422, term9422.getClass(), "latestCommittedTextStart", null);
        setField(term9422, term9422.getClass(), "latestCommittedTextEnd", null);
        setField(term9422, term9422.getClass(), "composedTextCaret", null);
        setField(term9422, term9422.getClass(), "originalCaret", null);
        setBooleanField(term9422, term9422.getClass(), "checkedInputOverride", false);
        setBooleanField(term9422, term9422.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9422, term9422.getClass(), "isAlignmentXSet", false);
        setFloatField(term9422, term9422.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9422, term9422.getClass(), "isAlignmentYSet", false);
        setFloatField(term9422, term9422.getClass(), "alignmentY", 0.0F);
        setField(term9422, term9422.getClass(), "ui", null);
        setField(term9422, term9422.getClass(), "listenerList", null);
        setField(term9422, term9422.getClass(), "clientProperties", null);
        setField(term9422, term9422.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9422, term9422.getClass(), "autoscrolls", false);
        setField(term9422, term9422.getClass(), "border", null);
        setIntField(term9422, term9422.getClass(), "flags", 0);
        setField(term9422, term9422.getClass(), "inputVerifier", null);
        setBooleanField(term9422, term9422.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9422, term9422.getClass(), "paintingChild", null);
        setField(term9422, term9422.getClass(), "popupMenu", null);
        setField(term9422, term9422.getClass(), "revalidateRunnableScheduled", null);
        setField(term9422, term9422.getClass(), "focusInputMap", null);
        setField(term9422, term9422.getClass(), "ancestorInputMap", null);
        setField(term9422, term9422.getClass(), "windowInputMap", null);
        setField(term9422, term9422.getClass(), "actionMap", null);
        setField(term9422, term9422.getClass(), "aaHint", null);
        setField(term9422, term9422.getClass(), "lcdRenderingHint", null);
        setField(term9422, term9422.getClass(), "component", null);
        setField(term9422, term9422.getClass(), "layoutMgr", null);
        setField(term9422, term9422.getClass(), "dispatcher", null);
        setField(term9422, term9422.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9422, term9422.getClass(), "focusCycleRoot", false);
        setBooleanField(term9422, term9422.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9422, term9422.getClass(), "printingThreads", null);
        setBooleanField(term9422, term9422.getClass(), "printing", false);
        setField(term9422, term9422.getClass(), "containerListener", null);
        setIntField(term9422, term9422.getClass(), "listeningChildren", 0);
        setIntField(term9422, term9422.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9422, term9422.getClass(), "descendantsCount", 0);
        setField(term9422, term9422.getClass(), "preserveBackgroundColor", null);
        setIntField(term9422, term9422.getClass(), "numOfHWComponents", 0);
        setIntField(term9422, term9422.getClass(), "numOfLWComponents", 0);
        setField(term9422, term9422.getClass(), "modalComp", null);
        setField(term9422, term9422.getClass(), "modalAppContext", null);
        setIntField(term9422, term9422.getClass(), "containerSerializedDataVersion", 0);
        setField(term9422, term9422.getClass(), "peer", null);
        setField(term9422, term9422.getClass(), "parent", null);
        setField(term9422, term9422.getClass(), "appContext", null);
        setIntField(term9422, term9422.getClass(), "x", 0);
        setIntField(term9422, term9422.getClass(), "y", 0);
        setIntField(term9422, term9422.getClass(), "width", 0);
        setIntField(term9422, term9422.getClass(), "height", 0);
        setField(term9422, term9422.getClass(), "foreground", null);
        setField(term9422, term9422.getClass(), "background", null);
        setField(term9422, term9422.getClass(), "font", null);
        setField(term9422, term9422.getClass(), "peerFont", null);
        setField(term9422, term9422.getClass(), "cursor", null);
        setField(term9422, term9422.getClass(), "locale", null);
        setField(term9422, term9422.getClass(), "graphicsConfig", null);
        setField(term9422, term9422.getClass(), "bufferStrategy", null);
        setBooleanField(term9422, term9422.getClass(), "ignoreRepaint", false);
        setBooleanField(term9422, term9422.getClass(), "visible", false);
        setBooleanField(term9422, term9422.getClass(), "enabled", false);
        setBooleanField(term9422, term9422.getClass(), "valid", false);
        setField(term9422, term9422.getClass(), "dropTarget", null);
        setField(term9422, term9422.getClass(), "popups", null);
        setField(term9422, term9422.getClass(), "name", null);
        setBooleanField(term9422, term9422.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9422, term9422.getClass(), "focusable", false);
        setIntField(term9422, term9422.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9422, term9422.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9422, term9422.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9422, term9422.getClass(), "acc", null);
        setField(term9422, term9422.getClass(), "minSize", null);
        setBooleanField(term9422, term9422.getClass(), "minSizeSet", false);
        setField(term9422, term9422.getClass(), "prefSize", null);
        setBooleanField(term9422, term9422.getClass(), "prefSizeSet", false);
        setField(term9422, term9422.getClass(), "maxSize", null);
        setBooleanField(term9422, term9422.getClass(), "maxSizeSet", false);
        setField(term9422, term9422.getClass(), "componentOrientation", null);
        setBooleanField(term9422, term9422.getClass(), "newEventsOnly", false);
        setField(term9422, term9422.getClass(), "componentListener", null);
        setField(term9422, term9422.getClass(), "focusListener", null);
        setField(term9422, term9422.getClass(), "hierarchyListener", null);
        setField(term9422, term9422.getClass(), "hierarchyBoundsListener", null);
        setField(term9422, term9422.getClass(), "keyListener", null);
        setField(term9422, term9422.getClass(), "mouseListener", null);
        setField(term9422, term9422.getClass(), "mouseMotionListener", null);
        setField(term9422, term9422.getClass(), "mouseWheelListener", null);
        setField(term9422, term9422.getClass(), "inputMethodListener", null);
        setLongField(term9422, term9422.getClass(), "eventMask", 0L);
        setField(term9422, term9422.getClass(), "changeSupport", null);
        setField(term9422, term9422.getClass(), "objectLock", null);
        setBooleanField(term9422, term9422.getClass(), "isPacked", false);
        setIntField(term9422, term9422.getClass(), "boundsOp", 0);
        setField(term9422, term9422.getClass(), "compoundShape", null);
        setField(term9422, term9422.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9422, term9422.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9422, term9422.getClass(), "backgroundEraseDisabled", false);
        setField(term9422, term9422.getClass(), "eventCache", null);
        setBooleanField(term9422, term9422.getClass(), "coalescingEnabled", false);
        setBooleanField(term9422, term9422.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9422, term9422.getClass(), "componentSerializedDataVersion", 0);
        setField(term9422, term9422.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dayField", argTypes, term9422, args);
    }

};


