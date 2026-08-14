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

public class KTextPane_setPreferences_12057292007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36938;

    public KTextPane_setPreferences_12057292007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36938 = newInstance(Class.forName("proto.KTextPane"));
        setField(term36938, term36938.getClass(), "pageLoader", null);
        setField(term36938, term36938.getClass(), "kit", null);
        setBooleanField(term36938, term36938.getClass(), "isUserSetEditorKit", false);
        setField(term36938, term36938.getClass(), "pageProperties", null);
        setField(term36938, term36938.getClass(), "typeHandlers", null);
        setField(term36938, term36938.getClass(), "model", null);
        setField(term36938, term36938.getClass(), "caret", null);
        setField(term36938, term36938.getClass(), "navigationFilter", null);
        setField(term36938, term36938.getClass(), "highlighter", null);
        setField(term36938, term36938.getClass(), "keymap", null);
        setField(term36938, term36938.getClass(), "caretEvent", null);
        setField(term36938, term36938.getClass(), "caretColor", null);
        setField(term36938, term36938.getClass(), "selectionColor", null);
        setField(term36938, term36938.getClass(), "selectedTextColor", null);
        setField(term36938, term36938.getClass(), "disabledTextColor", null);
        setBooleanField(term36938, term36938.getClass(), "editable", false);
        setField(term36938, term36938.getClass(), "margin", null);
        setCharField(term36938, term36938.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term36938, term36938.getClass(), "dragEnabled", false);
        setField(term36938, term36938.getClass(), "dropMode", null);
        setField(term36938, term36938.getClass(), "dropLocation", null);
        setField(term36938, term36938.getClass(), "inputMethodRequestsHandler", null);
        setField(term36938, term36938.getClass(), "composedTextAttribute", null);
        setField(term36938, term36938.getClass(), "composedTextContent", null);
        setField(term36938, term36938.getClass(), "composedTextStart", null);
        setField(term36938, term36938.getClass(), "composedTextEnd", null);
        setField(term36938, term36938.getClass(), "latestCommittedTextStart", null);
        setField(term36938, term36938.getClass(), "latestCommittedTextEnd", null);
        setField(term36938, term36938.getClass(), "composedTextCaret", null);
        setField(term36938, term36938.getClass(), "originalCaret", null);
        setBooleanField(term36938, term36938.getClass(), "checkedInputOverride", false);
        setBooleanField(term36938, term36938.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term36938, term36938.getClass(), "isAlignmentXSet", false);
        setFloatField(term36938, term36938.getClass(), "alignmentX", 0.0F);
        setBooleanField(term36938, term36938.getClass(), "isAlignmentYSet", false);
        setFloatField(term36938, term36938.getClass(), "alignmentY", 0.0F);
        setField(term36938, term36938.getClass(), "ui", null);
        setField(term36938, term36938.getClass(), "listenerList", null);
        setField(term36938, term36938.getClass(), "clientProperties", null);
        setField(term36938, term36938.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term36938, term36938.getClass(), "autoscrolls", false);
        setField(term36938, term36938.getClass(), "border", null);
        setIntField(term36938, term36938.getClass(), "flags", 0);
        setField(term36938, term36938.getClass(), "inputVerifier", null);
        setBooleanField(term36938, term36938.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term36938, term36938.getClass(), "paintingChild", null);
        setField(term36938, term36938.getClass(), "popupMenu", null);
        setField(term36938, term36938.getClass(), "revalidateRunnableScheduled", null);
        setField(term36938, term36938.getClass(), "focusInputMap", null);
        setField(term36938, term36938.getClass(), "ancestorInputMap", null);
        setField(term36938, term36938.getClass(), "windowInputMap", null);
        setField(term36938, term36938.getClass(), "actionMap", null);
        setField(term36938, term36938.getClass(), "aaHint", null);
        setField(term36938, term36938.getClass(), "lcdRenderingHint", null);
        setField(term36938, term36938.getClass(), "component", null);
        setField(term36938, term36938.getClass(), "layoutMgr", null);
        setField(term36938, term36938.getClass(), "dispatcher", null);
        setField(term36938, term36938.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term36938, term36938.getClass(), "focusCycleRoot", false);
        setBooleanField(term36938, term36938.getClass(), "focusTraversalPolicyProvider", false);
        setField(term36938, term36938.getClass(), "printingThreads", null);
        setBooleanField(term36938, term36938.getClass(), "printing", false);
        setField(term36938, term36938.getClass(), "containerListener", null);
        setIntField(term36938, term36938.getClass(), "listeningChildren", 0);
        setIntField(term36938, term36938.getClass(), "listeningBoundsChildren", 0);
        setIntField(term36938, term36938.getClass(), "descendantsCount", 0);
        setField(term36938, term36938.getClass(), "preserveBackgroundColor", null);
        setIntField(term36938, term36938.getClass(), "numOfHWComponents", 0);
        setIntField(term36938, term36938.getClass(), "numOfLWComponents", 0);
        setField(term36938, term36938.getClass(), "modalComp", null);
        setField(term36938, term36938.getClass(), "modalAppContext", null);
        setIntField(term36938, term36938.getClass(), "containerSerializedDataVersion", 0);
        setField(term36938, term36938.getClass(), "peer", null);
        setField(term36938, term36938.getClass(), "parent", null);
        setField(term36938, term36938.getClass(), "appContext", null);
        setIntField(term36938, term36938.getClass(), "x", 0);
        setIntField(term36938, term36938.getClass(), "y", 0);
        setIntField(term36938, term36938.getClass(), "width", 0);
        setIntField(term36938, term36938.getClass(), "height", 0);
        setField(term36938, term36938.getClass(), "foreground", null);
        setField(term36938, term36938.getClass(), "background", null);
        setField(term36938, term36938.getClass(), "font", null);
        setField(term36938, term36938.getClass(), "peerFont", null);
        setField(term36938, term36938.getClass(), "cursor", null);
        setField(term36938, term36938.getClass(), "locale", null);
        setField(term36938, term36938.getClass(), "graphicsConfig", null);
        setField(term36938, term36938.getClass(), "bufferStrategy", null);
        setBooleanField(term36938, term36938.getClass(), "ignoreRepaint", false);
        setBooleanField(term36938, term36938.getClass(), "visible", false);
        setBooleanField(term36938, term36938.getClass(), "enabled", false);
        setBooleanField(term36938, term36938.getClass(), "valid", false);
        setField(term36938, term36938.getClass(), "dropTarget", null);
        setField(term36938, term36938.getClass(), "popups", null);
        setField(term36938, term36938.getClass(), "name", null);
        setBooleanField(term36938, term36938.getClass(), "nameExplicitlySet", false);
        setBooleanField(term36938, term36938.getClass(), "focusable", false);
        setIntField(term36938, term36938.getClass(), "isFocusTraversableOverridden", 0);
        setField(term36938, term36938.getClass(), "focusTraversalKeys", null);
        setBooleanField(term36938, term36938.getClass(), "focusTraversalKeysEnabled", false);
        setField(term36938, term36938.getClass(), "acc", null);
        setField(term36938, term36938.getClass(), "minSize", null);
        setBooleanField(term36938, term36938.getClass(), "minSizeSet", false);
        setField(term36938, term36938.getClass(), "prefSize", null);
        setBooleanField(term36938, term36938.getClass(), "prefSizeSet", false);
        setField(term36938, term36938.getClass(), "maxSize", null);
        setBooleanField(term36938, term36938.getClass(), "maxSizeSet", false);
        setField(term36938, term36938.getClass(), "componentOrientation", null);
        setBooleanField(term36938, term36938.getClass(), "newEventsOnly", false);
        setField(term36938, term36938.getClass(), "componentListener", null);
        setField(term36938, term36938.getClass(), "focusListener", null);
        setField(term36938, term36938.getClass(), "hierarchyListener", null);
        setField(term36938, term36938.getClass(), "hierarchyBoundsListener", null);
        setField(term36938, term36938.getClass(), "keyListener", null);
        setField(term36938, term36938.getClass(), "mouseListener", null);
        setField(term36938, term36938.getClass(), "mouseMotionListener", null);
        setField(term36938, term36938.getClass(), "mouseWheelListener", null);
        setField(term36938, term36938.getClass(), "inputMethodListener", null);
        setLongField(term36938, term36938.getClass(), "eventMask", 0L);
        setField(term36938, term36938.getClass(), "changeSupport", null);
        setField(term36938, term36938.getClass(), "objectLock", null);
        setBooleanField(term36938, term36938.getClass(), "isPacked", false);
        setIntField(term36938, term36938.getClass(), "boundsOp", 0);
        setField(term36938, term36938.getClass(), "compoundShape", null);
        setField(term36938, term36938.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term36938, term36938.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term36938, term36938.getClass(), "backgroundEraseDisabled", false);
        setField(term36938, term36938.getClass(), "eventCache", null);
        setBooleanField(term36938, term36938.getClass(), "coalescingEnabled", false);
        setBooleanField(term36938, term36938.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term36938, term36938.getClass(), "componentSerializedDataVersion", 0);
        setField(term36938, term36938.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term36938, args);
    }

};


