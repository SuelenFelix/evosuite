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

public class KTextPane_htmlFormattedPane_7742183895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36811;

    public KTextPane_htmlFormattedPane_7742183895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36811 = newInstance(Class.forName("proto.KTextPane"));
        setField(term36811, term36811.getClass(), "pageLoader", null);
        setField(term36811, term36811.getClass(), "kit", null);
        setBooleanField(term36811, term36811.getClass(), "isUserSetEditorKit", false);
        setField(term36811, term36811.getClass(), "pageProperties", null);
        setField(term36811, term36811.getClass(), "typeHandlers", null);
        setField(term36811, term36811.getClass(), "model", null);
        setField(term36811, term36811.getClass(), "caret", null);
        setField(term36811, term36811.getClass(), "navigationFilter", null);
        setField(term36811, term36811.getClass(), "highlighter", null);
        setField(term36811, term36811.getClass(), "keymap", null);
        setField(term36811, term36811.getClass(), "caretEvent", null);
        setField(term36811, term36811.getClass(), "caretColor", null);
        setField(term36811, term36811.getClass(), "selectionColor", null);
        setField(term36811, term36811.getClass(), "selectedTextColor", null);
        setField(term36811, term36811.getClass(), "disabledTextColor", null);
        setBooleanField(term36811, term36811.getClass(), "editable", false);
        setField(term36811, term36811.getClass(), "margin", null);
        setCharField(term36811, term36811.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term36811, term36811.getClass(), "dragEnabled", false);
        setField(term36811, term36811.getClass(), "dropMode", null);
        setField(term36811, term36811.getClass(), "dropLocation", null);
        setField(term36811, term36811.getClass(), "inputMethodRequestsHandler", null);
        setField(term36811, term36811.getClass(), "composedTextAttribute", null);
        setField(term36811, term36811.getClass(), "composedTextContent", null);
        setField(term36811, term36811.getClass(), "composedTextStart", null);
        setField(term36811, term36811.getClass(), "composedTextEnd", null);
        setField(term36811, term36811.getClass(), "latestCommittedTextStart", null);
        setField(term36811, term36811.getClass(), "latestCommittedTextEnd", null);
        setField(term36811, term36811.getClass(), "composedTextCaret", null);
        setField(term36811, term36811.getClass(), "originalCaret", null);
        setBooleanField(term36811, term36811.getClass(), "checkedInputOverride", false);
        setBooleanField(term36811, term36811.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term36811, term36811.getClass(), "isAlignmentXSet", false);
        setFloatField(term36811, term36811.getClass(), "alignmentX", 0.0F);
        setBooleanField(term36811, term36811.getClass(), "isAlignmentYSet", false);
        setFloatField(term36811, term36811.getClass(), "alignmentY", 0.0F);
        setField(term36811, term36811.getClass(), "ui", null);
        setField(term36811, term36811.getClass(), "listenerList", null);
        setField(term36811, term36811.getClass(), "clientProperties", null);
        setField(term36811, term36811.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term36811, term36811.getClass(), "autoscrolls", false);
        setField(term36811, term36811.getClass(), "border", null);
        setIntField(term36811, term36811.getClass(), "flags", 0);
        setField(term36811, term36811.getClass(), "inputVerifier", null);
        setBooleanField(term36811, term36811.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term36811, term36811.getClass(), "paintingChild", null);
        setField(term36811, term36811.getClass(), "popupMenu", null);
        setField(term36811, term36811.getClass(), "revalidateRunnableScheduled", null);
        setField(term36811, term36811.getClass(), "focusInputMap", null);
        setField(term36811, term36811.getClass(), "ancestorInputMap", null);
        setField(term36811, term36811.getClass(), "windowInputMap", null);
        setField(term36811, term36811.getClass(), "actionMap", null);
        setField(term36811, term36811.getClass(), "aaHint", null);
        setField(term36811, term36811.getClass(), "lcdRenderingHint", null);
        setField(term36811, term36811.getClass(), "component", null);
        setField(term36811, term36811.getClass(), "layoutMgr", null);
        setField(term36811, term36811.getClass(), "dispatcher", null);
        setField(term36811, term36811.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term36811, term36811.getClass(), "focusCycleRoot", false);
        setBooleanField(term36811, term36811.getClass(), "focusTraversalPolicyProvider", false);
        setField(term36811, term36811.getClass(), "printingThreads", null);
        setBooleanField(term36811, term36811.getClass(), "printing", false);
        setField(term36811, term36811.getClass(), "containerListener", null);
        setIntField(term36811, term36811.getClass(), "listeningChildren", 0);
        setIntField(term36811, term36811.getClass(), "listeningBoundsChildren", 0);
        setIntField(term36811, term36811.getClass(), "descendantsCount", 0);
        setField(term36811, term36811.getClass(), "preserveBackgroundColor", null);
        setIntField(term36811, term36811.getClass(), "numOfHWComponents", 0);
        setIntField(term36811, term36811.getClass(), "numOfLWComponents", 0);
        setField(term36811, term36811.getClass(), "modalComp", null);
        setField(term36811, term36811.getClass(), "modalAppContext", null);
        setIntField(term36811, term36811.getClass(), "containerSerializedDataVersion", 0);
        setField(term36811, term36811.getClass(), "peer", null);
        setField(term36811, term36811.getClass(), "parent", null);
        setField(term36811, term36811.getClass(), "appContext", null);
        setIntField(term36811, term36811.getClass(), "x", 0);
        setIntField(term36811, term36811.getClass(), "y", 0);
        setIntField(term36811, term36811.getClass(), "width", 0);
        setIntField(term36811, term36811.getClass(), "height", 0);
        setField(term36811, term36811.getClass(), "foreground", null);
        setField(term36811, term36811.getClass(), "background", null);
        setField(term36811, term36811.getClass(), "font", null);
        setField(term36811, term36811.getClass(), "peerFont", null);
        setField(term36811, term36811.getClass(), "cursor", null);
        setField(term36811, term36811.getClass(), "locale", null);
        setField(term36811, term36811.getClass(), "graphicsConfig", null);
        setField(term36811, term36811.getClass(), "bufferStrategy", null);
        setBooleanField(term36811, term36811.getClass(), "ignoreRepaint", false);
        setBooleanField(term36811, term36811.getClass(), "visible", false);
        setBooleanField(term36811, term36811.getClass(), "enabled", false);
        setBooleanField(term36811, term36811.getClass(), "valid", false);
        setField(term36811, term36811.getClass(), "dropTarget", null);
        setField(term36811, term36811.getClass(), "popups", null);
        setField(term36811, term36811.getClass(), "name", null);
        setBooleanField(term36811, term36811.getClass(), "nameExplicitlySet", false);
        setBooleanField(term36811, term36811.getClass(), "focusable", false);
        setIntField(term36811, term36811.getClass(), "isFocusTraversableOverridden", 0);
        setField(term36811, term36811.getClass(), "focusTraversalKeys", null);
        setBooleanField(term36811, term36811.getClass(), "focusTraversalKeysEnabled", false);
        setField(term36811, term36811.getClass(), "acc", null);
        setField(term36811, term36811.getClass(), "minSize", null);
        setBooleanField(term36811, term36811.getClass(), "minSizeSet", false);
        setField(term36811, term36811.getClass(), "prefSize", null);
        setBooleanField(term36811, term36811.getClass(), "prefSizeSet", false);
        setField(term36811, term36811.getClass(), "maxSize", null);
        setBooleanField(term36811, term36811.getClass(), "maxSizeSet", false);
        setField(term36811, term36811.getClass(), "componentOrientation", null);
        setBooleanField(term36811, term36811.getClass(), "newEventsOnly", false);
        setField(term36811, term36811.getClass(), "componentListener", null);
        setField(term36811, term36811.getClass(), "focusListener", null);
        setField(term36811, term36811.getClass(), "hierarchyListener", null);
        setField(term36811, term36811.getClass(), "hierarchyBoundsListener", null);
        setField(term36811, term36811.getClass(), "keyListener", null);
        setField(term36811, term36811.getClass(), "mouseListener", null);
        setField(term36811, term36811.getClass(), "mouseMotionListener", null);
        setField(term36811, term36811.getClass(), "mouseWheelListener", null);
        setField(term36811, term36811.getClass(), "inputMethodListener", null);
        setLongField(term36811, term36811.getClass(), "eventMask", 0L);
        setField(term36811, term36811.getClass(), "changeSupport", null);
        setField(term36811, term36811.getClass(), "objectLock", null);
        setBooleanField(term36811, term36811.getClass(), "isPacked", false);
        setIntField(term36811, term36811.getClass(), "boundsOp", 0);
        setField(term36811, term36811.getClass(), "compoundShape", null);
        setField(term36811, term36811.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term36811, term36811.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term36811, term36811.getClass(), "backgroundEraseDisabled", false);
        setField(term36811, term36811.getClass(), "eventCache", null);
        setBooleanField(term36811, term36811.getClass(), "coalescingEnabled", false);
        setBooleanField(term36811, term36811.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term36811, term36811.getClass(), "componentSerializedDataVersion", 0);
        setField(term36811, term36811.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextPane");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "htmlFormattedPane", argTypes, term36811, args);
    }

};


