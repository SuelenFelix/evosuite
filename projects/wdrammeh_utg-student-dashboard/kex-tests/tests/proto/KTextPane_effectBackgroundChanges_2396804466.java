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

public class KTextPane_effectBackgroundChanges_2396804466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36858;

    public KTextPane_effectBackgroundChanges_2396804466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36858 = newInstance(Class.forName("proto.KTextPane"));
        setField(term36858, term36858.getClass(), "pageLoader", null);
        setField(term36858, term36858.getClass(), "kit", null);
        setBooleanField(term36858, term36858.getClass(), "isUserSetEditorKit", false);
        setField(term36858, term36858.getClass(), "pageProperties", null);
        setField(term36858, term36858.getClass(), "typeHandlers", null);
        setField(term36858, term36858.getClass(), "model", null);
        setField(term36858, term36858.getClass(), "caret", null);
        setField(term36858, term36858.getClass(), "navigationFilter", null);
        setField(term36858, term36858.getClass(), "highlighter", null);
        setField(term36858, term36858.getClass(), "keymap", null);
        setField(term36858, term36858.getClass(), "caretEvent", null);
        setField(term36858, term36858.getClass(), "caretColor", null);
        setField(term36858, term36858.getClass(), "selectionColor", null);
        setField(term36858, term36858.getClass(), "selectedTextColor", null);
        setField(term36858, term36858.getClass(), "disabledTextColor", null);
        setBooleanField(term36858, term36858.getClass(), "editable", false);
        setField(term36858, term36858.getClass(), "margin", null);
        setCharField(term36858, term36858.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term36858, term36858.getClass(), "dragEnabled", false);
        setField(term36858, term36858.getClass(), "dropMode", null);
        setField(term36858, term36858.getClass(), "dropLocation", null);
        setField(term36858, term36858.getClass(), "inputMethodRequestsHandler", null);
        setField(term36858, term36858.getClass(), "composedTextAttribute", null);
        setField(term36858, term36858.getClass(), "composedTextContent", null);
        setField(term36858, term36858.getClass(), "composedTextStart", null);
        setField(term36858, term36858.getClass(), "composedTextEnd", null);
        setField(term36858, term36858.getClass(), "latestCommittedTextStart", null);
        setField(term36858, term36858.getClass(), "latestCommittedTextEnd", null);
        setField(term36858, term36858.getClass(), "composedTextCaret", null);
        setField(term36858, term36858.getClass(), "originalCaret", null);
        setBooleanField(term36858, term36858.getClass(), "checkedInputOverride", false);
        setBooleanField(term36858, term36858.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term36858, term36858.getClass(), "isAlignmentXSet", false);
        setFloatField(term36858, term36858.getClass(), "alignmentX", 0.0F);
        setBooleanField(term36858, term36858.getClass(), "isAlignmentYSet", false);
        setFloatField(term36858, term36858.getClass(), "alignmentY", 0.0F);
        setField(term36858, term36858.getClass(), "ui", null);
        setField(term36858, term36858.getClass(), "listenerList", null);
        setField(term36858, term36858.getClass(), "clientProperties", null);
        setField(term36858, term36858.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term36858, term36858.getClass(), "autoscrolls", false);
        setField(term36858, term36858.getClass(), "border", null);
        setIntField(term36858, term36858.getClass(), "flags", 0);
        setField(term36858, term36858.getClass(), "inputVerifier", null);
        setBooleanField(term36858, term36858.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term36858, term36858.getClass(), "paintingChild", null);
        setField(term36858, term36858.getClass(), "popupMenu", null);
        setField(term36858, term36858.getClass(), "revalidateRunnableScheduled", null);
        setField(term36858, term36858.getClass(), "focusInputMap", null);
        setField(term36858, term36858.getClass(), "ancestorInputMap", null);
        setField(term36858, term36858.getClass(), "windowInputMap", null);
        setField(term36858, term36858.getClass(), "actionMap", null);
        setField(term36858, term36858.getClass(), "aaHint", null);
        setField(term36858, term36858.getClass(), "lcdRenderingHint", null);
        setField(term36858, term36858.getClass(), "component", null);
        setField(term36858, term36858.getClass(), "layoutMgr", null);
        setField(term36858, term36858.getClass(), "dispatcher", null);
        setField(term36858, term36858.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term36858, term36858.getClass(), "focusCycleRoot", false);
        setBooleanField(term36858, term36858.getClass(), "focusTraversalPolicyProvider", false);
        setField(term36858, term36858.getClass(), "printingThreads", null);
        setBooleanField(term36858, term36858.getClass(), "printing", false);
        setField(term36858, term36858.getClass(), "containerListener", null);
        setIntField(term36858, term36858.getClass(), "listeningChildren", 0);
        setIntField(term36858, term36858.getClass(), "listeningBoundsChildren", 0);
        setIntField(term36858, term36858.getClass(), "descendantsCount", 0);
        setField(term36858, term36858.getClass(), "preserveBackgroundColor", null);
        setIntField(term36858, term36858.getClass(), "numOfHWComponents", 0);
        setIntField(term36858, term36858.getClass(), "numOfLWComponents", 0);
        setField(term36858, term36858.getClass(), "modalComp", null);
        setField(term36858, term36858.getClass(), "modalAppContext", null);
        setIntField(term36858, term36858.getClass(), "containerSerializedDataVersion", 0);
        setField(term36858, term36858.getClass(), "peer", null);
        setField(term36858, term36858.getClass(), "parent", null);
        setField(term36858, term36858.getClass(), "appContext", null);
        setIntField(term36858, term36858.getClass(), "x", 0);
        setIntField(term36858, term36858.getClass(), "y", 0);
        setIntField(term36858, term36858.getClass(), "width", 0);
        setIntField(term36858, term36858.getClass(), "height", 0);
        setField(term36858, term36858.getClass(), "foreground", null);
        setField(term36858, term36858.getClass(), "background", null);
        setField(term36858, term36858.getClass(), "font", null);
        setField(term36858, term36858.getClass(), "peerFont", null);
        setField(term36858, term36858.getClass(), "cursor", null);
        setField(term36858, term36858.getClass(), "locale", null);
        setField(term36858, term36858.getClass(), "graphicsConfig", null);
        setField(term36858, term36858.getClass(), "bufferStrategy", null);
        setBooleanField(term36858, term36858.getClass(), "ignoreRepaint", false);
        setBooleanField(term36858, term36858.getClass(), "visible", false);
        setBooleanField(term36858, term36858.getClass(), "enabled", false);
        setBooleanField(term36858, term36858.getClass(), "valid", false);
        setField(term36858, term36858.getClass(), "dropTarget", null);
        setField(term36858, term36858.getClass(), "popups", null);
        setField(term36858, term36858.getClass(), "name", null);
        setBooleanField(term36858, term36858.getClass(), "nameExplicitlySet", false);
        setBooleanField(term36858, term36858.getClass(), "focusable", false);
        setIntField(term36858, term36858.getClass(), "isFocusTraversableOverridden", 0);
        setField(term36858, term36858.getClass(), "focusTraversalKeys", null);
        setBooleanField(term36858, term36858.getClass(), "focusTraversalKeysEnabled", false);
        setField(term36858, term36858.getClass(), "acc", null);
        setField(term36858, term36858.getClass(), "minSize", null);
        setBooleanField(term36858, term36858.getClass(), "minSizeSet", false);
        setField(term36858, term36858.getClass(), "prefSize", null);
        setBooleanField(term36858, term36858.getClass(), "prefSizeSet", false);
        setField(term36858, term36858.getClass(), "maxSize", null);
        setBooleanField(term36858, term36858.getClass(), "maxSizeSet", false);
        setField(term36858, term36858.getClass(), "componentOrientation", null);
        setBooleanField(term36858, term36858.getClass(), "newEventsOnly", false);
        setField(term36858, term36858.getClass(), "componentListener", null);
        setField(term36858, term36858.getClass(), "focusListener", null);
        setField(term36858, term36858.getClass(), "hierarchyListener", null);
        setField(term36858, term36858.getClass(), "hierarchyBoundsListener", null);
        setField(term36858, term36858.getClass(), "keyListener", null);
        setField(term36858, term36858.getClass(), "mouseListener", null);
        setField(term36858, term36858.getClass(), "mouseMotionListener", null);
        setField(term36858, term36858.getClass(), "mouseWheelListener", null);
        setField(term36858, term36858.getClass(), "inputMethodListener", null);
        setLongField(term36858, term36858.getClass(), "eventMask", 0L);
        setField(term36858, term36858.getClass(), "changeSupport", null);
        setField(term36858, term36858.getClass(), "objectLock", null);
        setBooleanField(term36858, term36858.getClass(), "isPacked", false);
        setIntField(term36858, term36858.getClass(), "boundsOp", 0);
        setField(term36858, term36858.getClass(), "compoundShape", null);
        setField(term36858, term36858.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term36858, term36858.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term36858, term36858.getClass(), "backgroundEraseDisabled", false);
        setField(term36858, term36858.getClass(), "eventCache", null);
        setBooleanField(term36858, term36858.getClass(), "coalescingEnabled", false);
        setBooleanField(term36858, term36858.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term36858, term36858.getClass(), "componentSerializedDataVersion", 0);
        setField(term36858, term36858.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectBackgroundChanges", argTypes, term36858, args);
    }

};


