package core.first;

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
import static core.first.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Login_1_createToolTip_15593532143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9287;

    public Login_1_createToolTip_15593532143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9287 = newInstance(Class.forName("core.first.Login$1"));
        setField(term9287, term9287.getClass(), "this$0", null);
        setCharField(term9287, term9287.getClass(), "echoChar", (char) 0);
        setBooleanField(term9287, term9287.getClass(), "echoCharSet", false);
        setField(term9287, term9287.getClass(), "action", null);
        setField(term9287, term9287.getClass(), "actionPropertyChangeListener", null);
        setField(term9287, term9287.getClass(), "visibility", null);
        setIntField(term9287, term9287.getClass(), "horizontalAlignment", 0);
        setIntField(term9287, term9287.getClass(), "columns", 0);
        setIntField(term9287, term9287.getClass(), "columnWidth", 0);
        setField(term9287, term9287.getClass(), "command", null);
        setField(term9287, term9287.getClass(), "model", null);
        setField(term9287, term9287.getClass(), "caret", null);
        setField(term9287, term9287.getClass(), "navigationFilter", null);
        setField(term9287, term9287.getClass(), "highlighter", null);
        setField(term9287, term9287.getClass(), "keymap", null);
        setField(term9287, term9287.getClass(), "caretEvent", null);
        setField(term9287, term9287.getClass(), "caretColor", null);
        setField(term9287, term9287.getClass(), "selectionColor", null);
        setField(term9287, term9287.getClass(), "selectedTextColor", null);
        setField(term9287, term9287.getClass(), "disabledTextColor", null);
        setBooleanField(term9287, term9287.getClass(), "editable", false);
        setField(term9287, term9287.getClass(), "margin", null);
        setCharField(term9287, term9287.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9287, term9287.getClass(), "dragEnabled", false);
        setField(term9287, term9287.getClass(), "dropMode", null);
        setField(term9287, term9287.getClass(), "dropLocation", null);
        setField(term9287, term9287.getClass(), "inputMethodRequestsHandler", null);
        setField(term9287, term9287.getClass(), "composedTextAttribute", null);
        setField(term9287, term9287.getClass(), "composedTextContent", null);
        setField(term9287, term9287.getClass(), "composedTextStart", null);
        setField(term9287, term9287.getClass(), "composedTextEnd", null);
        setField(term9287, term9287.getClass(), "latestCommittedTextStart", null);
        setField(term9287, term9287.getClass(), "latestCommittedTextEnd", null);
        setField(term9287, term9287.getClass(), "composedTextCaret", null);
        setField(term9287, term9287.getClass(), "originalCaret", null);
        setBooleanField(term9287, term9287.getClass(), "checkedInputOverride", false);
        setBooleanField(term9287, term9287.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9287, term9287.getClass(), "isAlignmentXSet", false);
        setFloatField(term9287, term9287.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9287, term9287.getClass(), "isAlignmentYSet", false);
        setFloatField(term9287, term9287.getClass(), "alignmentY", 0.0F);
        setField(term9287, term9287.getClass(), "ui", null);
        setField(term9287, term9287.getClass(), "listenerList", null);
        setField(term9287, term9287.getClass(), "clientProperties", null);
        setField(term9287, term9287.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9287, term9287.getClass(), "autoscrolls", false);
        setField(term9287, term9287.getClass(), "border", null);
        setIntField(term9287, term9287.getClass(), "flags", 0);
        setField(term9287, term9287.getClass(), "inputVerifier", null);
        setBooleanField(term9287, term9287.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9287, term9287.getClass(), "paintingChild", null);
        setField(term9287, term9287.getClass(), "popupMenu", null);
        setField(term9287, term9287.getClass(), "revalidateRunnableScheduled", null);
        setField(term9287, term9287.getClass(), "focusInputMap", null);
        setField(term9287, term9287.getClass(), "ancestorInputMap", null);
        setField(term9287, term9287.getClass(), "windowInputMap", null);
        setField(term9287, term9287.getClass(), "actionMap", null);
        setField(term9287, term9287.getClass(), "aaHint", null);
        setField(term9287, term9287.getClass(), "lcdRenderingHint", null);
        setField(term9287, term9287.getClass(), "component", null);
        setField(term9287, term9287.getClass(), "layoutMgr", null);
        setField(term9287, term9287.getClass(), "dispatcher", null);
        setField(term9287, term9287.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9287, term9287.getClass(), "focusCycleRoot", false);
        setBooleanField(term9287, term9287.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9287, term9287.getClass(), "printingThreads", null);
        setBooleanField(term9287, term9287.getClass(), "printing", false);
        setField(term9287, term9287.getClass(), "containerListener", null);
        setIntField(term9287, term9287.getClass(), "listeningChildren", 0);
        setIntField(term9287, term9287.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9287, term9287.getClass(), "descendantsCount", 0);
        setField(term9287, term9287.getClass(), "preserveBackgroundColor", null);
        setIntField(term9287, term9287.getClass(), "numOfHWComponents", 0);
        setIntField(term9287, term9287.getClass(), "numOfLWComponents", 0);
        setField(term9287, term9287.getClass(), "modalComp", null);
        setField(term9287, term9287.getClass(), "modalAppContext", null);
        setIntField(term9287, term9287.getClass(), "containerSerializedDataVersion", 0);
        setField(term9287, term9287.getClass(), "peer", null);
        setField(term9287, term9287.getClass(), "parent", null);
        setField(term9287, term9287.getClass(), "appContext", null);
        setIntField(term9287, term9287.getClass(), "x", 0);
        setIntField(term9287, term9287.getClass(), "y", 0);
        setIntField(term9287, term9287.getClass(), "width", 0);
        setIntField(term9287, term9287.getClass(), "height", 0);
        setField(term9287, term9287.getClass(), "foreground", null);
        setField(term9287, term9287.getClass(), "background", null);
        setField(term9287, term9287.getClass(), "font", null);
        setField(term9287, term9287.getClass(), "peerFont", null);
        setField(term9287, term9287.getClass(), "cursor", null);
        setField(term9287, term9287.getClass(), "locale", null);
        setField(term9287, term9287.getClass(), "graphicsConfig", null);
        setField(term9287, term9287.getClass(), "bufferStrategy", null);
        setBooleanField(term9287, term9287.getClass(), "ignoreRepaint", false);
        setBooleanField(term9287, term9287.getClass(), "visible", false);
        setBooleanField(term9287, term9287.getClass(), "enabled", false);
        setBooleanField(term9287, term9287.getClass(), "valid", false);
        setField(term9287, term9287.getClass(), "dropTarget", null);
        setField(term9287, term9287.getClass(), "popups", null);
        setField(term9287, term9287.getClass(), "name", null);
        setBooleanField(term9287, term9287.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9287, term9287.getClass(), "focusable", false);
        setIntField(term9287, term9287.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9287, term9287.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9287, term9287.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9287, term9287.getClass(), "acc", null);
        setField(term9287, term9287.getClass(), "minSize", null);
        setBooleanField(term9287, term9287.getClass(), "minSizeSet", false);
        setField(term9287, term9287.getClass(), "prefSize", null);
        setBooleanField(term9287, term9287.getClass(), "prefSizeSet", false);
        setField(term9287, term9287.getClass(), "maxSize", null);
        setBooleanField(term9287, term9287.getClass(), "maxSizeSet", false);
        setField(term9287, term9287.getClass(), "componentOrientation", null);
        setBooleanField(term9287, term9287.getClass(), "newEventsOnly", false);
        setField(term9287, term9287.getClass(), "componentListener", null);
        setField(term9287, term9287.getClass(), "focusListener", null);
        setField(term9287, term9287.getClass(), "hierarchyListener", null);
        setField(term9287, term9287.getClass(), "hierarchyBoundsListener", null);
        setField(term9287, term9287.getClass(), "keyListener", null);
        setField(term9287, term9287.getClass(), "mouseListener", null);
        setField(term9287, term9287.getClass(), "mouseMotionListener", null);
        setField(term9287, term9287.getClass(), "mouseWheelListener", null);
        setField(term9287, term9287.getClass(), "inputMethodListener", null);
        setLongField(term9287, term9287.getClass(), "eventMask", 0L);
        setField(term9287, term9287.getClass(), "changeSupport", null);
        setField(term9287, term9287.getClass(), "objectLock", null);
        setBooleanField(term9287, term9287.getClass(), "isPacked", false);
        setIntField(term9287, term9287.getClass(), "boundsOp", 0);
        setField(term9287, term9287.getClass(), "compoundShape", null);
        setField(term9287, term9287.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9287, term9287.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9287, term9287.getClass(), "backgroundEraseDisabled", false);
        setField(term9287, term9287.getClass(), "eventCache", null);
        setBooleanField(term9287, term9287.getClass(), "coalescingEnabled", false);
        setBooleanField(term9287, term9287.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9287, term9287.getClass(), "componentSerializedDataVersion", 0);
        setField(term9287, term9287.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Login$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term9287, args);
    }

};


