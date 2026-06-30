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
     Object term60795;

    public KTextArea_setPreferences_12190843417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60795 = newInstance(Class.forName("proto.KTextArea"));
        setIntField(term60795, term60795.getClass(), "rows", 0);
        setIntField(term60795, term60795.getClass(), "columns", 0);
        setIntField(term60795, term60795.getClass(), "columnWidth", 0);
        setIntField(term60795, term60795.getClass(), "rowHeight", 0);
        setBooleanField(term60795, term60795.getClass(), "wrap", false);
        setBooleanField(term60795, term60795.getClass(), "word", false);
        setField(term60795, term60795.getClass(), "model", null);
        setField(term60795, term60795.getClass(), "caret", null);
        setField(term60795, term60795.getClass(), "navigationFilter", null);
        setField(term60795, term60795.getClass(), "highlighter", null);
        setField(term60795, term60795.getClass(), "keymap", null);
        setField(term60795, term60795.getClass(), "caretEvent", null);
        setField(term60795, term60795.getClass(), "caretColor", null);
        setField(term60795, term60795.getClass(), "selectionColor", null);
        setField(term60795, term60795.getClass(), "selectedTextColor", null);
        setField(term60795, term60795.getClass(), "disabledTextColor", null);
        setBooleanField(term60795, term60795.getClass(), "editable", false);
        setField(term60795, term60795.getClass(), "margin", null);
        setCharField(term60795, term60795.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60795, term60795.getClass(), "dragEnabled", false);
        setField(term60795, term60795.getClass(), "dropMode", null);
        setField(term60795, term60795.getClass(), "dropLocation", null);
        setField(term60795, term60795.getClass(), "inputMethodRequestsHandler", null);
        setField(term60795, term60795.getClass(), "composedTextAttribute", null);
        setField(term60795, term60795.getClass(), "composedTextContent", null);
        setField(term60795, term60795.getClass(), "composedTextStart", null);
        setField(term60795, term60795.getClass(), "composedTextEnd", null);
        setField(term60795, term60795.getClass(), "latestCommittedTextStart", null);
        setField(term60795, term60795.getClass(), "latestCommittedTextEnd", null);
        setField(term60795, term60795.getClass(), "composedTextCaret", null);
        setField(term60795, term60795.getClass(), "originalCaret", null);
        setBooleanField(term60795, term60795.getClass(), "checkedInputOverride", false);
        setBooleanField(term60795, term60795.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60795, term60795.getClass(), "isAlignmentXSet", false);
        setFloatField(term60795, term60795.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60795, term60795.getClass(), "isAlignmentYSet", false);
        setFloatField(term60795, term60795.getClass(), "alignmentY", 0.0F);
        setField(term60795, term60795.getClass(), "ui", null);
        setField(term60795, term60795.getClass(), "listenerList", null);
        setField(term60795, term60795.getClass(), "clientProperties", null);
        setField(term60795, term60795.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60795, term60795.getClass(), "autoscrolls", false);
        setField(term60795, term60795.getClass(), "border", null);
        setIntField(term60795, term60795.getClass(), "flags", 0);
        setField(term60795, term60795.getClass(), "inputVerifier", null);
        setBooleanField(term60795, term60795.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60795, term60795.getClass(), "paintingChild", null);
        setField(term60795, term60795.getClass(), "popupMenu", null);
        setField(term60795, term60795.getClass(), "revalidateRunnableScheduled", null);
        setField(term60795, term60795.getClass(), "focusInputMap", null);
        setField(term60795, term60795.getClass(), "ancestorInputMap", null);
        setField(term60795, term60795.getClass(), "windowInputMap", null);
        setField(term60795, term60795.getClass(), "actionMap", null);
        setField(term60795, term60795.getClass(), "aaHint", null);
        setField(term60795, term60795.getClass(), "lcdRenderingHint", null);
        setField(term60795, term60795.getClass(), "component", null);
        setField(term60795, term60795.getClass(), "layoutMgr", null);
        setField(term60795, term60795.getClass(), "dispatcher", null);
        setField(term60795, term60795.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60795, term60795.getClass(), "focusCycleRoot", false);
        setBooleanField(term60795, term60795.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60795, term60795.getClass(), "printingThreads", null);
        setBooleanField(term60795, term60795.getClass(), "printing", false);
        setField(term60795, term60795.getClass(), "containerListener", null);
        setIntField(term60795, term60795.getClass(), "listeningChildren", 0);
        setIntField(term60795, term60795.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60795, term60795.getClass(), "descendantsCount", 0);
        setField(term60795, term60795.getClass(), "preserveBackgroundColor", null);
        setIntField(term60795, term60795.getClass(), "numOfHWComponents", 0);
        setIntField(term60795, term60795.getClass(), "numOfLWComponents", 0);
        setField(term60795, term60795.getClass(), "modalComp", null);
        setField(term60795, term60795.getClass(), "modalAppContext", null);
        setIntField(term60795, term60795.getClass(), "containerSerializedDataVersion", 0);
        setField(term60795, term60795.getClass(), "peer", null);
        setField(term60795, term60795.getClass(), "parent", null);
        setField(term60795, term60795.getClass(), "appContext", null);
        setIntField(term60795, term60795.getClass(), "x", 0);
        setIntField(term60795, term60795.getClass(), "y", 0);
        setIntField(term60795, term60795.getClass(), "width", 0);
        setIntField(term60795, term60795.getClass(), "height", 0);
        setField(term60795, term60795.getClass(), "foreground", null);
        setField(term60795, term60795.getClass(), "background", null);
        setField(term60795, term60795.getClass(), "font", null);
        setField(term60795, term60795.getClass(), "peerFont", null);
        setField(term60795, term60795.getClass(), "cursor", null);
        setField(term60795, term60795.getClass(), "locale", null);
        setField(term60795, term60795.getClass(), "graphicsConfig", null);
        setField(term60795, term60795.getClass(), "bufferStrategy", null);
        setBooleanField(term60795, term60795.getClass(), "ignoreRepaint", false);
        setBooleanField(term60795, term60795.getClass(), "visible", false);
        setBooleanField(term60795, term60795.getClass(), "enabled", false);
        setBooleanField(term60795, term60795.getClass(), "valid", false);
        setField(term60795, term60795.getClass(), "dropTarget", null);
        setField(term60795, term60795.getClass(), "popups", null);
        setField(term60795, term60795.getClass(), "name", null);
        setBooleanField(term60795, term60795.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60795, term60795.getClass(), "focusable", false);
        setIntField(term60795, term60795.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60795, term60795.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60795, term60795.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60795, term60795.getClass(), "acc", null);
        setField(term60795, term60795.getClass(), "minSize", null);
        setBooleanField(term60795, term60795.getClass(), "minSizeSet", false);
        setField(term60795, term60795.getClass(), "prefSize", null);
        setBooleanField(term60795, term60795.getClass(), "prefSizeSet", false);
        setField(term60795, term60795.getClass(), "maxSize", null);
        setBooleanField(term60795, term60795.getClass(), "maxSizeSet", false);
        setField(term60795, term60795.getClass(), "componentOrientation", null);
        setBooleanField(term60795, term60795.getClass(), "newEventsOnly", false);
        setField(term60795, term60795.getClass(), "componentListener", null);
        setField(term60795, term60795.getClass(), "focusListener", null);
        setField(term60795, term60795.getClass(), "hierarchyListener", null);
        setField(term60795, term60795.getClass(), "hierarchyBoundsListener", null);
        setField(term60795, term60795.getClass(), "keyListener", null);
        setField(term60795, term60795.getClass(), "mouseListener", null);
        setField(term60795, term60795.getClass(), "mouseMotionListener", null);
        setField(term60795, term60795.getClass(), "mouseWheelListener", null);
        setField(term60795, term60795.getClass(), "inputMethodListener", null);
        setLongField(term60795, term60795.getClass(), "eventMask", 0L);
        setField(term60795, term60795.getClass(), "changeSupport", null);
        setField(term60795, term60795.getClass(), "objectLock", null);
        setBooleanField(term60795, term60795.getClass(), "isPacked", false);
        setIntField(term60795, term60795.getClass(), "boundsOp", 0);
        setField(term60795, term60795.getClass(), "compoundShape", null);
        setField(term60795, term60795.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60795, term60795.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60795, term60795.getClass(), "backgroundEraseDisabled", false);
        setField(term60795, term60795.getClass(), "eventCache", null);
        setBooleanField(term60795, term60795.getClass(), "coalescingEnabled", false);
        setBooleanField(term60795, term60795.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60795, term60795.getClass(), "componentSerializedDataVersion", 0);
        setField(term60795, term60795.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term60795, args);
    }

};


