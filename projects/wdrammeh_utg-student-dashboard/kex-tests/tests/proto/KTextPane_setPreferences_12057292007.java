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
     Object term36905;

    public KTextPane_setPreferences_12057292007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36905 = newInstance(Class.forName("proto.KTextPane"));
        setField(term36905, term36905.getClass(), "pageLoader", null);
        setField(term36905, term36905.getClass(), "kit", null);
        setBooleanField(term36905, term36905.getClass(), "isUserSetEditorKit", false);
        setField(term36905, term36905.getClass(), "pageProperties", null);
        setField(term36905, term36905.getClass(), "typeHandlers", null);
        setField(term36905, term36905.getClass(), "model", null);
        setField(term36905, term36905.getClass(), "caret", null);
        setField(term36905, term36905.getClass(), "navigationFilter", null);
        setField(term36905, term36905.getClass(), "highlighter", null);
        setField(term36905, term36905.getClass(), "keymap", null);
        setField(term36905, term36905.getClass(), "caretEvent", null);
        setField(term36905, term36905.getClass(), "caretColor", null);
        setField(term36905, term36905.getClass(), "selectionColor", null);
        setField(term36905, term36905.getClass(), "selectedTextColor", null);
        setField(term36905, term36905.getClass(), "disabledTextColor", null);
        setBooleanField(term36905, term36905.getClass(), "editable", false);
        setField(term36905, term36905.getClass(), "margin", null);
        setCharField(term36905, term36905.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term36905, term36905.getClass(), "dragEnabled", false);
        setField(term36905, term36905.getClass(), "dropMode", null);
        setField(term36905, term36905.getClass(), "dropLocation", null);
        setField(term36905, term36905.getClass(), "inputMethodRequestsHandler", null);
        setField(term36905, term36905.getClass(), "composedTextAttribute", null);
        setField(term36905, term36905.getClass(), "composedTextContent", null);
        setField(term36905, term36905.getClass(), "composedTextStart", null);
        setField(term36905, term36905.getClass(), "composedTextEnd", null);
        setField(term36905, term36905.getClass(), "latestCommittedTextStart", null);
        setField(term36905, term36905.getClass(), "latestCommittedTextEnd", null);
        setField(term36905, term36905.getClass(), "composedTextCaret", null);
        setField(term36905, term36905.getClass(), "originalCaret", null);
        setBooleanField(term36905, term36905.getClass(), "checkedInputOverride", false);
        setBooleanField(term36905, term36905.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term36905, term36905.getClass(), "isAlignmentXSet", false);
        setFloatField(term36905, term36905.getClass(), "alignmentX", 0.0F);
        setBooleanField(term36905, term36905.getClass(), "isAlignmentYSet", false);
        setFloatField(term36905, term36905.getClass(), "alignmentY", 0.0F);
        setField(term36905, term36905.getClass(), "ui", null);
        setField(term36905, term36905.getClass(), "listenerList", null);
        setField(term36905, term36905.getClass(), "clientProperties", null);
        setField(term36905, term36905.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term36905, term36905.getClass(), "autoscrolls", false);
        setField(term36905, term36905.getClass(), "border", null);
        setIntField(term36905, term36905.getClass(), "flags", 0);
        setField(term36905, term36905.getClass(), "inputVerifier", null);
        setBooleanField(term36905, term36905.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term36905, term36905.getClass(), "paintingChild", null);
        setField(term36905, term36905.getClass(), "popupMenu", null);
        setField(term36905, term36905.getClass(), "revalidateRunnableScheduled", null);
        setField(term36905, term36905.getClass(), "focusInputMap", null);
        setField(term36905, term36905.getClass(), "ancestorInputMap", null);
        setField(term36905, term36905.getClass(), "windowInputMap", null);
        setField(term36905, term36905.getClass(), "actionMap", null);
        setField(term36905, term36905.getClass(), "aaHint", null);
        setField(term36905, term36905.getClass(), "lcdRenderingHint", null);
        setField(term36905, term36905.getClass(), "component", null);
        setField(term36905, term36905.getClass(), "layoutMgr", null);
        setField(term36905, term36905.getClass(), "dispatcher", null);
        setField(term36905, term36905.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term36905, term36905.getClass(), "focusCycleRoot", false);
        setBooleanField(term36905, term36905.getClass(), "focusTraversalPolicyProvider", false);
        setField(term36905, term36905.getClass(), "printingThreads", null);
        setBooleanField(term36905, term36905.getClass(), "printing", false);
        setField(term36905, term36905.getClass(), "containerListener", null);
        setIntField(term36905, term36905.getClass(), "listeningChildren", 0);
        setIntField(term36905, term36905.getClass(), "listeningBoundsChildren", 0);
        setIntField(term36905, term36905.getClass(), "descendantsCount", 0);
        setField(term36905, term36905.getClass(), "preserveBackgroundColor", null);
        setIntField(term36905, term36905.getClass(), "numOfHWComponents", 0);
        setIntField(term36905, term36905.getClass(), "numOfLWComponents", 0);
        setField(term36905, term36905.getClass(), "modalComp", null);
        setField(term36905, term36905.getClass(), "modalAppContext", null);
        setIntField(term36905, term36905.getClass(), "containerSerializedDataVersion", 0);
        setField(term36905, term36905.getClass(), "peer", null);
        setField(term36905, term36905.getClass(), "parent", null);
        setField(term36905, term36905.getClass(), "appContext", null);
        setIntField(term36905, term36905.getClass(), "x", 0);
        setIntField(term36905, term36905.getClass(), "y", 0);
        setIntField(term36905, term36905.getClass(), "width", 0);
        setIntField(term36905, term36905.getClass(), "height", 0);
        setField(term36905, term36905.getClass(), "foreground", null);
        setField(term36905, term36905.getClass(), "background", null);
        setField(term36905, term36905.getClass(), "font", null);
        setField(term36905, term36905.getClass(), "peerFont", null);
        setField(term36905, term36905.getClass(), "cursor", null);
        setField(term36905, term36905.getClass(), "locale", null);
        setField(term36905, term36905.getClass(), "graphicsConfig", null);
        setField(term36905, term36905.getClass(), "bufferStrategy", null);
        setBooleanField(term36905, term36905.getClass(), "ignoreRepaint", false);
        setBooleanField(term36905, term36905.getClass(), "visible", false);
        setBooleanField(term36905, term36905.getClass(), "enabled", false);
        setBooleanField(term36905, term36905.getClass(), "valid", false);
        setField(term36905, term36905.getClass(), "dropTarget", null);
        setField(term36905, term36905.getClass(), "popups", null);
        setField(term36905, term36905.getClass(), "name", null);
        setBooleanField(term36905, term36905.getClass(), "nameExplicitlySet", false);
        setBooleanField(term36905, term36905.getClass(), "focusable", false);
        setIntField(term36905, term36905.getClass(), "isFocusTraversableOverridden", 0);
        setField(term36905, term36905.getClass(), "focusTraversalKeys", null);
        setBooleanField(term36905, term36905.getClass(), "focusTraversalKeysEnabled", false);
        setField(term36905, term36905.getClass(), "acc", null);
        setField(term36905, term36905.getClass(), "minSize", null);
        setBooleanField(term36905, term36905.getClass(), "minSizeSet", false);
        setField(term36905, term36905.getClass(), "prefSize", null);
        setBooleanField(term36905, term36905.getClass(), "prefSizeSet", false);
        setField(term36905, term36905.getClass(), "maxSize", null);
        setBooleanField(term36905, term36905.getClass(), "maxSizeSet", false);
        setField(term36905, term36905.getClass(), "componentOrientation", null);
        setBooleanField(term36905, term36905.getClass(), "newEventsOnly", false);
        setField(term36905, term36905.getClass(), "componentListener", null);
        setField(term36905, term36905.getClass(), "focusListener", null);
        setField(term36905, term36905.getClass(), "hierarchyListener", null);
        setField(term36905, term36905.getClass(), "hierarchyBoundsListener", null);
        setField(term36905, term36905.getClass(), "keyListener", null);
        setField(term36905, term36905.getClass(), "mouseListener", null);
        setField(term36905, term36905.getClass(), "mouseMotionListener", null);
        setField(term36905, term36905.getClass(), "mouseWheelListener", null);
        setField(term36905, term36905.getClass(), "inputMethodListener", null);
        setLongField(term36905, term36905.getClass(), "eventMask", 0L);
        setField(term36905, term36905.getClass(), "changeSupport", null);
        setField(term36905, term36905.getClass(), "objectLock", null);
        setBooleanField(term36905, term36905.getClass(), "isPacked", false);
        setIntField(term36905, term36905.getClass(), "boundsOp", 0);
        setField(term36905, term36905.getClass(), "compoundShape", null);
        setField(term36905, term36905.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term36905, term36905.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term36905, term36905.getClass(), "backgroundEraseDisabled", false);
        setField(term36905, term36905.getClass(), "eventCache", null);
        setBooleanField(term36905, term36905.getClass(), "coalescingEnabled", false);
        setBooleanField(term36905, term36905.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term36905, term36905.getClass(), "componentSerializedDataVersion", 0);
        setField(term36905, term36905.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term36905, args);
    }

};


