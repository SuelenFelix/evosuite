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

public class KTextField_monthField_65010250320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9483;

    public KTextField_monthField_65010250320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9483 = newInstance(Class.forName("proto.KTextField"));
        setField(term9483, term9483.getClass(), "action", null);
        setField(term9483, term9483.getClass(), "actionPropertyChangeListener", null);
        setField(term9483, term9483.getClass(), "visibility", null);
        setIntField(term9483, term9483.getClass(), "horizontalAlignment", 0);
        setIntField(term9483, term9483.getClass(), "columns", 0);
        setIntField(term9483, term9483.getClass(), "columnWidth", 0);
        setField(term9483, term9483.getClass(), "command", null);
        setField(term9483, term9483.getClass(), "model", null);
        setField(term9483, term9483.getClass(), "caret", null);
        setField(term9483, term9483.getClass(), "navigationFilter", null);
        setField(term9483, term9483.getClass(), "highlighter", null);
        setField(term9483, term9483.getClass(), "keymap", null);
        setField(term9483, term9483.getClass(), "caretEvent", null);
        setField(term9483, term9483.getClass(), "caretColor", null);
        setField(term9483, term9483.getClass(), "selectionColor", null);
        setField(term9483, term9483.getClass(), "selectedTextColor", null);
        setField(term9483, term9483.getClass(), "disabledTextColor", null);
        setBooleanField(term9483, term9483.getClass(), "editable", false);
        setField(term9483, term9483.getClass(), "margin", null);
        setCharField(term9483, term9483.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term9483, term9483.getClass(), "dragEnabled", false);
        setField(term9483, term9483.getClass(), "dropMode", null);
        setField(term9483, term9483.getClass(), "dropLocation", null);
        setField(term9483, term9483.getClass(), "inputMethodRequestsHandler", null);
        setField(term9483, term9483.getClass(), "composedTextAttribute", null);
        setField(term9483, term9483.getClass(), "composedTextContent", null);
        setField(term9483, term9483.getClass(), "composedTextStart", null);
        setField(term9483, term9483.getClass(), "composedTextEnd", null);
        setField(term9483, term9483.getClass(), "latestCommittedTextStart", null);
        setField(term9483, term9483.getClass(), "latestCommittedTextEnd", null);
        setField(term9483, term9483.getClass(), "composedTextCaret", null);
        setField(term9483, term9483.getClass(), "originalCaret", null);
        setBooleanField(term9483, term9483.getClass(), "checkedInputOverride", false);
        setBooleanField(term9483, term9483.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term9483, term9483.getClass(), "isAlignmentXSet", false);
        setFloatField(term9483, term9483.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9483, term9483.getClass(), "isAlignmentYSet", false);
        setFloatField(term9483, term9483.getClass(), "alignmentY", 0.0F);
        setField(term9483, term9483.getClass(), "ui", null);
        setField(term9483, term9483.getClass(), "listenerList", null);
        setField(term9483, term9483.getClass(), "clientProperties", null);
        setField(term9483, term9483.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9483, term9483.getClass(), "autoscrolls", false);
        setField(term9483, term9483.getClass(), "border", null);
        setIntField(term9483, term9483.getClass(), "flags", 0);
        setField(term9483, term9483.getClass(), "inputVerifier", null);
        setBooleanField(term9483, term9483.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9483, term9483.getClass(), "paintingChild", null);
        setField(term9483, term9483.getClass(), "popupMenu", null);
        setField(term9483, term9483.getClass(), "revalidateRunnableScheduled", null);
        setField(term9483, term9483.getClass(), "focusInputMap", null);
        setField(term9483, term9483.getClass(), "ancestorInputMap", null);
        setField(term9483, term9483.getClass(), "windowInputMap", null);
        setField(term9483, term9483.getClass(), "actionMap", null);
        setField(term9483, term9483.getClass(), "aaHint", null);
        setField(term9483, term9483.getClass(), "lcdRenderingHint", null);
        setField(term9483, term9483.getClass(), "component", null);
        setField(term9483, term9483.getClass(), "layoutMgr", null);
        setField(term9483, term9483.getClass(), "dispatcher", null);
        setField(term9483, term9483.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9483, term9483.getClass(), "focusCycleRoot", false);
        setBooleanField(term9483, term9483.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9483, term9483.getClass(), "printingThreads", null);
        setBooleanField(term9483, term9483.getClass(), "printing", false);
        setField(term9483, term9483.getClass(), "containerListener", null);
        setIntField(term9483, term9483.getClass(), "listeningChildren", 0);
        setIntField(term9483, term9483.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9483, term9483.getClass(), "descendantsCount", 0);
        setField(term9483, term9483.getClass(), "preserveBackgroundColor", null);
        setIntField(term9483, term9483.getClass(), "numOfHWComponents", 0);
        setIntField(term9483, term9483.getClass(), "numOfLWComponents", 0);
        setField(term9483, term9483.getClass(), "modalComp", null);
        setField(term9483, term9483.getClass(), "modalAppContext", null);
        setIntField(term9483, term9483.getClass(), "containerSerializedDataVersion", 0);
        setField(term9483, term9483.getClass(), "peer", null);
        setField(term9483, term9483.getClass(), "parent", null);
        setField(term9483, term9483.getClass(), "appContext", null);
        setIntField(term9483, term9483.getClass(), "x", 0);
        setIntField(term9483, term9483.getClass(), "y", 0);
        setIntField(term9483, term9483.getClass(), "width", 0);
        setIntField(term9483, term9483.getClass(), "height", 0);
        setField(term9483, term9483.getClass(), "foreground", null);
        setField(term9483, term9483.getClass(), "background", null);
        setField(term9483, term9483.getClass(), "font", null);
        setField(term9483, term9483.getClass(), "peerFont", null);
        setField(term9483, term9483.getClass(), "cursor", null);
        setField(term9483, term9483.getClass(), "locale", null);
        setField(term9483, term9483.getClass(), "graphicsConfig", null);
        setField(term9483, term9483.getClass(), "bufferStrategy", null);
        setBooleanField(term9483, term9483.getClass(), "ignoreRepaint", false);
        setBooleanField(term9483, term9483.getClass(), "visible", false);
        setBooleanField(term9483, term9483.getClass(), "enabled", false);
        setBooleanField(term9483, term9483.getClass(), "valid", false);
        setField(term9483, term9483.getClass(), "dropTarget", null);
        setField(term9483, term9483.getClass(), "popups", null);
        setField(term9483, term9483.getClass(), "name", null);
        setBooleanField(term9483, term9483.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9483, term9483.getClass(), "focusable", false);
        setIntField(term9483, term9483.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9483, term9483.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9483, term9483.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9483, term9483.getClass(), "acc", null);
        setField(term9483, term9483.getClass(), "minSize", null);
        setBooleanField(term9483, term9483.getClass(), "minSizeSet", false);
        setField(term9483, term9483.getClass(), "prefSize", null);
        setBooleanField(term9483, term9483.getClass(), "prefSizeSet", false);
        setField(term9483, term9483.getClass(), "maxSize", null);
        setBooleanField(term9483, term9483.getClass(), "maxSizeSet", false);
        setField(term9483, term9483.getClass(), "componentOrientation", null);
        setBooleanField(term9483, term9483.getClass(), "newEventsOnly", false);
        setField(term9483, term9483.getClass(), "componentListener", null);
        setField(term9483, term9483.getClass(), "focusListener", null);
        setField(term9483, term9483.getClass(), "hierarchyListener", null);
        setField(term9483, term9483.getClass(), "hierarchyBoundsListener", null);
        setField(term9483, term9483.getClass(), "keyListener", null);
        setField(term9483, term9483.getClass(), "mouseListener", null);
        setField(term9483, term9483.getClass(), "mouseMotionListener", null);
        setField(term9483, term9483.getClass(), "mouseWheelListener", null);
        setField(term9483, term9483.getClass(), "inputMethodListener", null);
        setLongField(term9483, term9483.getClass(), "eventMask", 0L);
        setField(term9483, term9483.getClass(), "changeSupport", null);
        setField(term9483, term9483.getClass(), "objectLock", null);
        setBooleanField(term9483, term9483.getClass(), "isPacked", false);
        setIntField(term9483, term9483.getClass(), "boundsOp", 0);
        setField(term9483, term9483.getClass(), "compoundShape", null);
        setField(term9483, term9483.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9483, term9483.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9483, term9483.getClass(), "backgroundEraseDisabled", false);
        setField(term9483, term9483.getClass(), "eventCache", null);
        setBooleanField(term9483, term9483.getClass(), "coalescingEnabled", false);
        setBooleanField(term9483, term9483.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9483, term9483.getClass(), "componentSerializedDataVersion", 0);
        setField(term9483, term9483.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "monthField", argTypes, term9483, args);
    }

};


