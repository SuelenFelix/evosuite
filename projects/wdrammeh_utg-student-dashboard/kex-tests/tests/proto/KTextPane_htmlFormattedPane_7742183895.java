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
     Object term36844;

    public KTextPane_htmlFormattedPane_7742183895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36844 = newInstance(Class.forName("proto.KTextPane"));
        setField(term36844, term36844.getClass(), "pageLoader", null);
        setField(term36844, term36844.getClass(), "kit", null);
        setBooleanField(term36844, term36844.getClass(), "isUserSetEditorKit", false);
        setField(term36844, term36844.getClass(), "pageProperties", null);
        setField(term36844, term36844.getClass(), "typeHandlers", null);
        setField(term36844, term36844.getClass(), "model", null);
        setField(term36844, term36844.getClass(), "caret", null);
        setField(term36844, term36844.getClass(), "navigationFilter", null);
        setField(term36844, term36844.getClass(), "highlighter", null);
        setField(term36844, term36844.getClass(), "keymap", null);
        setField(term36844, term36844.getClass(), "caretEvent", null);
        setField(term36844, term36844.getClass(), "caretColor", null);
        setField(term36844, term36844.getClass(), "selectionColor", null);
        setField(term36844, term36844.getClass(), "selectedTextColor", null);
        setField(term36844, term36844.getClass(), "disabledTextColor", null);
        setBooleanField(term36844, term36844.getClass(), "editable", false);
        setField(term36844, term36844.getClass(), "margin", null);
        setCharField(term36844, term36844.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term36844, term36844.getClass(), "dragEnabled", false);
        setField(term36844, term36844.getClass(), "dropMode", null);
        setField(term36844, term36844.getClass(), "dropLocation", null);
        setField(term36844, term36844.getClass(), "inputMethodRequestsHandler", null);
        setField(term36844, term36844.getClass(), "composedTextAttribute", null);
        setField(term36844, term36844.getClass(), "composedTextContent", null);
        setField(term36844, term36844.getClass(), "composedTextStart", null);
        setField(term36844, term36844.getClass(), "composedTextEnd", null);
        setField(term36844, term36844.getClass(), "latestCommittedTextStart", null);
        setField(term36844, term36844.getClass(), "latestCommittedTextEnd", null);
        setField(term36844, term36844.getClass(), "composedTextCaret", null);
        setField(term36844, term36844.getClass(), "originalCaret", null);
        setBooleanField(term36844, term36844.getClass(), "checkedInputOverride", false);
        setBooleanField(term36844, term36844.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term36844, term36844.getClass(), "isAlignmentXSet", false);
        setFloatField(term36844, term36844.getClass(), "alignmentX", 0.0F);
        setBooleanField(term36844, term36844.getClass(), "isAlignmentYSet", false);
        setFloatField(term36844, term36844.getClass(), "alignmentY", 0.0F);
        setField(term36844, term36844.getClass(), "ui", null);
        setField(term36844, term36844.getClass(), "listenerList", null);
        setField(term36844, term36844.getClass(), "clientProperties", null);
        setField(term36844, term36844.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term36844, term36844.getClass(), "autoscrolls", false);
        setField(term36844, term36844.getClass(), "border", null);
        setIntField(term36844, term36844.getClass(), "flags", 0);
        setField(term36844, term36844.getClass(), "inputVerifier", null);
        setBooleanField(term36844, term36844.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term36844, term36844.getClass(), "paintingChild", null);
        setField(term36844, term36844.getClass(), "popupMenu", null);
        setField(term36844, term36844.getClass(), "revalidateRunnableScheduled", null);
        setField(term36844, term36844.getClass(), "focusInputMap", null);
        setField(term36844, term36844.getClass(), "ancestorInputMap", null);
        setField(term36844, term36844.getClass(), "windowInputMap", null);
        setField(term36844, term36844.getClass(), "actionMap", null);
        setField(term36844, term36844.getClass(), "aaHint", null);
        setField(term36844, term36844.getClass(), "lcdRenderingHint", null);
        setField(term36844, term36844.getClass(), "component", null);
        setField(term36844, term36844.getClass(), "layoutMgr", null);
        setField(term36844, term36844.getClass(), "dispatcher", null);
        setField(term36844, term36844.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term36844, term36844.getClass(), "focusCycleRoot", false);
        setBooleanField(term36844, term36844.getClass(), "focusTraversalPolicyProvider", false);
        setField(term36844, term36844.getClass(), "printingThreads", null);
        setBooleanField(term36844, term36844.getClass(), "printing", false);
        setField(term36844, term36844.getClass(), "containerListener", null);
        setIntField(term36844, term36844.getClass(), "listeningChildren", 0);
        setIntField(term36844, term36844.getClass(), "listeningBoundsChildren", 0);
        setIntField(term36844, term36844.getClass(), "descendantsCount", 0);
        setField(term36844, term36844.getClass(), "preserveBackgroundColor", null);
        setIntField(term36844, term36844.getClass(), "numOfHWComponents", 0);
        setIntField(term36844, term36844.getClass(), "numOfLWComponents", 0);
        setField(term36844, term36844.getClass(), "modalComp", null);
        setField(term36844, term36844.getClass(), "modalAppContext", null);
        setIntField(term36844, term36844.getClass(), "containerSerializedDataVersion", 0);
        setField(term36844, term36844.getClass(), "peer", null);
        setField(term36844, term36844.getClass(), "parent", null);
        setField(term36844, term36844.getClass(), "appContext", null);
        setIntField(term36844, term36844.getClass(), "x", 0);
        setIntField(term36844, term36844.getClass(), "y", 0);
        setIntField(term36844, term36844.getClass(), "width", 0);
        setIntField(term36844, term36844.getClass(), "height", 0);
        setField(term36844, term36844.getClass(), "foreground", null);
        setField(term36844, term36844.getClass(), "background", null);
        setField(term36844, term36844.getClass(), "font", null);
        setField(term36844, term36844.getClass(), "peerFont", null);
        setField(term36844, term36844.getClass(), "cursor", null);
        setField(term36844, term36844.getClass(), "locale", null);
        setField(term36844, term36844.getClass(), "graphicsConfig", null);
        setField(term36844, term36844.getClass(), "bufferStrategy", null);
        setBooleanField(term36844, term36844.getClass(), "ignoreRepaint", false);
        setBooleanField(term36844, term36844.getClass(), "visible", false);
        setBooleanField(term36844, term36844.getClass(), "enabled", false);
        setBooleanField(term36844, term36844.getClass(), "valid", false);
        setField(term36844, term36844.getClass(), "dropTarget", null);
        setField(term36844, term36844.getClass(), "popups", null);
        setField(term36844, term36844.getClass(), "name", null);
        setBooleanField(term36844, term36844.getClass(), "nameExplicitlySet", false);
        setBooleanField(term36844, term36844.getClass(), "focusable", false);
        setIntField(term36844, term36844.getClass(), "isFocusTraversableOverridden", 0);
        setField(term36844, term36844.getClass(), "focusTraversalKeys", null);
        setBooleanField(term36844, term36844.getClass(), "focusTraversalKeysEnabled", false);
        setField(term36844, term36844.getClass(), "acc", null);
        setField(term36844, term36844.getClass(), "minSize", null);
        setBooleanField(term36844, term36844.getClass(), "minSizeSet", false);
        setField(term36844, term36844.getClass(), "prefSize", null);
        setBooleanField(term36844, term36844.getClass(), "prefSizeSet", false);
        setField(term36844, term36844.getClass(), "maxSize", null);
        setBooleanField(term36844, term36844.getClass(), "maxSizeSet", false);
        setField(term36844, term36844.getClass(), "componentOrientation", null);
        setBooleanField(term36844, term36844.getClass(), "newEventsOnly", false);
        setField(term36844, term36844.getClass(), "componentListener", null);
        setField(term36844, term36844.getClass(), "focusListener", null);
        setField(term36844, term36844.getClass(), "hierarchyListener", null);
        setField(term36844, term36844.getClass(), "hierarchyBoundsListener", null);
        setField(term36844, term36844.getClass(), "keyListener", null);
        setField(term36844, term36844.getClass(), "mouseListener", null);
        setField(term36844, term36844.getClass(), "mouseMotionListener", null);
        setField(term36844, term36844.getClass(), "mouseWheelListener", null);
        setField(term36844, term36844.getClass(), "inputMethodListener", null);
        setLongField(term36844, term36844.getClass(), "eventMask", 0L);
        setField(term36844, term36844.getClass(), "changeSupport", null);
        setField(term36844, term36844.getClass(), "objectLock", null);
        setBooleanField(term36844, term36844.getClass(), "isPacked", false);
        setIntField(term36844, term36844.getClass(), "boundsOp", 0);
        setField(term36844, term36844.getClass(), "compoundShape", null);
        setField(term36844, term36844.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term36844, term36844.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term36844, term36844.getClass(), "backgroundEraseDisabled", false);
        setField(term36844, term36844.getClass(), "eventCache", null);
        setBooleanField(term36844, term36844.getClass(), "coalescingEnabled", false);
        setBooleanField(term36844, term36844.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term36844, term36844.getClass(), "componentSerializedDataVersion", 0);
        setField(term36844, term36844.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextPane");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "htmlFormattedPane", argTypes, term36844, args);
    }

};


