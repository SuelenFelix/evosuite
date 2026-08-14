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

public class KTextArea_setPreferences_12190843417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60844;

    public KTextArea_setPreferences_12190843417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60844 = newInstance(Class.forName("proto.KTextArea"));
        setIntField(term60844, term60844.getClass(), "rows", 0);
        setIntField(term60844, term60844.getClass(), "columns", 0);
        setIntField(term60844, term60844.getClass(), "columnWidth", 0);
        setIntField(term60844, term60844.getClass(), "rowHeight", 0);
        setBooleanField(term60844, term60844.getClass(), "wrap", false);
        setBooleanField(term60844, term60844.getClass(), "word", false);
        setField(term60844, term60844.getClass(), "model", null);
        setField(term60844, term60844.getClass(), "caret", null);
        setField(term60844, term60844.getClass(), "navigationFilter", null);
        setField(term60844, term60844.getClass(), "highlighter", null);
        setField(term60844, term60844.getClass(), "keymap", null);
        setField(term60844, term60844.getClass(), "caretEvent", null);
        setField(term60844, term60844.getClass(), "caretColor", null);
        setField(term60844, term60844.getClass(), "selectionColor", null);
        setField(term60844, term60844.getClass(), "selectedTextColor", null);
        setField(term60844, term60844.getClass(), "disabledTextColor", null);
        setBooleanField(term60844, term60844.getClass(), "editable", false);
        setField(term60844, term60844.getClass(), "margin", null);
        setCharField(term60844, term60844.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60844, term60844.getClass(), "dragEnabled", false);
        setField(term60844, term60844.getClass(), "dropMode", null);
        setField(term60844, term60844.getClass(), "dropLocation", null);
        setField(term60844, term60844.getClass(), "inputMethodRequestsHandler", null);
        setField(term60844, term60844.getClass(), "composedTextAttribute", null);
        setField(term60844, term60844.getClass(), "composedTextContent", null);
        setField(term60844, term60844.getClass(), "composedTextStart", null);
        setField(term60844, term60844.getClass(), "composedTextEnd", null);
        setField(term60844, term60844.getClass(), "latestCommittedTextStart", null);
        setField(term60844, term60844.getClass(), "latestCommittedTextEnd", null);
        setField(term60844, term60844.getClass(), "composedTextCaret", null);
        setField(term60844, term60844.getClass(), "originalCaret", null);
        setBooleanField(term60844, term60844.getClass(), "checkedInputOverride", false);
        setBooleanField(term60844, term60844.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60844, term60844.getClass(), "isAlignmentXSet", false);
        setFloatField(term60844, term60844.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60844, term60844.getClass(), "isAlignmentYSet", false);
        setFloatField(term60844, term60844.getClass(), "alignmentY", 0.0F);
        setField(term60844, term60844.getClass(), "ui", null);
        setField(term60844, term60844.getClass(), "listenerList", null);
        setField(term60844, term60844.getClass(), "clientProperties", null);
        setField(term60844, term60844.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60844, term60844.getClass(), "autoscrolls", false);
        setField(term60844, term60844.getClass(), "border", null);
        setIntField(term60844, term60844.getClass(), "flags", 0);
        setField(term60844, term60844.getClass(), "inputVerifier", null);
        setBooleanField(term60844, term60844.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60844, term60844.getClass(), "paintingChild", null);
        setField(term60844, term60844.getClass(), "popupMenu", null);
        setField(term60844, term60844.getClass(), "revalidateRunnableScheduled", null);
        setField(term60844, term60844.getClass(), "focusInputMap", null);
        setField(term60844, term60844.getClass(), "ancestorInputMap", null);
        setField(term60844, term60844.getClass(), "windowInputMap", null);
        setField(term60844, term60844.getClass(), "actionMap", null);
        setField(term60844, term60844.getClass(), "aaHint", null);
        setField(term60844, term60844.getClass(), "lcdRenderingHint", null);
        setField(term60844, term60844.getClass(), "component", null);
        setField(term60844, term60844.getClass(), "layoutMgr", null);
        setField(term60844, term60844.getClass(), "dispatcher", null);
        setField(term60844, term60844.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60844, term60844.getClass(), "focusCycleRoot", false);
        setBooleanField(term60844, term60844.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60844, term60844.getClass(), "printingThreads", null);
        setBooleanField(term60844, term60844.getClass(), "printing", false);
        setField(term60844, term60844.getClass(), "containerListener", null);
        setIntField(term60844, term60844.getClass(), "listeningChildren", 0);
        setIntField(term60844, term60844.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60844, term60844.getClass(), "descendantsCount", 0);
        setField(term60844, term60844.getClass(), "preserveBackgroundColor", null);
        setIntField(term60844, term60844.getClass(), "numOfHWComponents", 0);
        setIntField(term60844, term60844.getClass(), "numOfLWComponents", 0);
        setField(term60844, term60844.getClass(), "modalComp", null);
        setField(term60844, term60844.getClass(), "modalAppContext", null);
        setIntField(term60844, term60844.getClass(), "containerSerializedDataVersion", 0);
        setField(term60844, term60844.getClass(), "peer", null);
        setField(term60844, term60844.getClass(), "parent", null);
        setField(term60844, term60844.getClass(), "appContext", null);
        setIntField(term60844, term60844.getClass(), "x", 0);
        setIntField(term60844, term60844.getClass(), "y", 0);
        setIntField(term60844, term60844.getClass(), "width", 0);
        setIntField(term60844, term60844.getClass(), "height", 0);
        setField(term60844, term60844.getClass(), "foreground", null);
        setField(term60844, term60844.getClass(), "background", null);
        setField(term60844, term60844.getClass(), "font", null);
        setField(term60844, term60844.getClass(), "peerFont", null);
        setField(term60844, term60844.getClass(), "cursor", null);
        setField(term60844, term60844.getClass(), "locale", null);
        setField(term60844, term60844.getClass(), "graphicsConfig", null);
        setField(term60844, term60844.getClass(), "bufferStrategy", null);
        setBooleanField(term60844, term60844.getClass(), "ignoreRepaint", false);
        setBooleanField(term60844, term60844.getClass(), "visible", false);
        setBooleanField(term60844, term60844.getClass(), "enabled", false);
        setBooleanField(term60844, term60844.getClass(), "valid", false);
        setField(term60844, term60844.getClass(), "dropTarget", null);
        setField(term60844, term60844.getClass(), "popups", null);
        setField(term60844, term60844.getClass(), "name", null);
        setBooleanField(term60844, term60844.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60844, term60844.getClass(), "focusable", false);
        setIntField(term60844, term60844.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60844, term60844.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60844, term60844.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60844, term60844.getClass(), "acc", null);
        setField(term60844, term60844.getClass(), "minSize", null);
        setBooleanField(term60844, term60844.getClass(), "minSizeSet", false);
        setField(term60844, term60844.getClass(), "prefSize", null);
        setBooleanField(term60844, term60844.getClass(), "prefSizeSet", false);
        setField(term60844, term60844.getClass(), "maxSize", null);
        setBooleanField(term60844, term60844.getClass(), "maxSizeSet", false);
        setField(term60844, term60844.getClass(), "componentOrientation", null);
        setBooleanField(term60844, term60844.getClass(), "newEventsOnly", false);
        setField(term60844, term60844.getClass(), "componentListener", null);
        setField(term60844, term60844.getClass(), "focusListener", null);
        setField(term60844, term60844.getClass(), "hierarchyListener", null);
        setField(term60844, term60844.getClass(), "hierarchyBoundsListener", null);
        setField(term60844, term60844.getClass(), "keyListener", null);
        setField(term60844, term60844.getClass(), "mouseListener", null);
        setField(term60844, term60844.getClass(), "mouseMotionListener", null);
        setField(term60844, term60844.getClass(), "mouseWheelListener", null);
        setField(term60844, term60844.getClass(), "inputMethodListener", null);
        setLongField(term60844, term60844.getClass(), "eventMask", 0L);
        setField(term60844, term60844.getClass(), "changeSupport", null);
        setField(term60844, term60844.getClass(), "objectLock", null);
        setBooleanField(term60844, term60844.getClass(), "isPacked", false);
        setIntField(term60844, term60844.getClass(), "boundsOp", 0);
        setField(term60844, term60844.getClass(), "compoundShape", null);
        setField(term60844, term60844.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60844, term60844.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60844, term60844.getClass(), "backgroundEraseDisabled", false);
        setField(term60844, term60844.getClass(), "eventCache", null);
        setBooleanField(term60844, term60844.getClass(), "coalescingEnabled", false);
        setBooleanField(term60844, term60844.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60844, term60844.getClass(), "componentSerializedDataVersion", 0);
        setField(term60844, term60844.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term60844, args);
    }

};


