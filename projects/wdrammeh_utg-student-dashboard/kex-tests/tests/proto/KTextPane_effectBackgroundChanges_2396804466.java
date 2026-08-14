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
     Object term36891;

    public KTextPane_effectBackgroundChanges_2396804466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36891 = newInstance(Class.forName("proto.KTextPane"));
        setField(term36891, term36891.getClass(), "pageLoader", null);
        setField(term36891, term36891.getClass(), "kit", null);
        setBooleanField(term36891, term36891.getClass(), "isUserSetEditorKit", false);
        setField(term36891, term36891.getClass(), "pageProperties", null);
        setField(term36891, term36891.getClass(), "typeHandlers", null);
        setField(term36891, term36891.getClass(), "model", null);
        setField(term36891, term36891.getClass(), "caret", null);
        setField(term36891, term36891.getClass(), "navigationFilter", null);
        setField(term36891, term36891.getClass(), "highlighter", null);
        setField(term36891, term36891.getClass(), "keymap", null);
        setField(term36891, term36891.getClass(), "caretEvent", null);
        setField(term36891, term36891.getClass(), "caretColor", null);
        setField(term36891, term36891.getClass(), "selectionColor", null);
        setField(term36891, term36891.getClass(), "selectedTextColor", null);
        setField(term36891, term36891.getClass(), "disabledTextColor", null);
        setBooleanField(term36891, term36891.getClass(), "editable", false);
        setField(term36891, term36891.getClass(), "margin", null);
        setCharField(term36891, term36891.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term36891, term36891.getClass(), "dragEnabled", false);
        setField(term36891, term36891.getClass(), "dropMode", null);
        setField(term36891, term36891.getClass(), "dropLocation", null);
        setField(term36891, term36891.getClass(), "inputMethodRequestsHandler", null);
        setField(term36891, term36891.getClass(), "composedTextAttribute", null);
        setField(term36891, term36891.getClass(), "composedTextContent", null);
        setField(term36891, term36891.getClass(), "composedTextStart", null);
        setField(term36891, term36891.getClass(), "composedTextEnd", null);
        setField(term36891, term36891.getClass(), "latestCommittedTextStart", null);
        setField(term36891, term36891.getClass(), "latestCommittedTextEnd", null);
        setField(term36891, term36891.getClass(), "composedTextCaret", null);
        setField(term36891, term36891.getClass(), "originalCaret", null);
        setBooleanField(term36891, term36891.getClass(), "checkedInputOverride", false);
        setBooleanField(term36891, term36891.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term36891, term36891.getClass(), "isAlignmentXSet", false);
        setFloatField(term36891, term36891.getClass(), "alignmentX", 0.0F);
        setBooleanField(term36891, term36891.getClass(), "isAlignmentYSet", false);
        setFloatField(term36891, term36891.getClass(), "alignmentY", 0.0F);
        setField(term36891, term36891.getClass(), "ui", null);
        setField(term36891, term36891.getClass(), "listenerList", null);
        setField(term36891, term36891.getClass(), "clientProperties", null);
        setField(term36891, term36891.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term36891, term36891.getClass(), "autoscrolls", false);
        setField(term36891, term36891.getClass(), "border", null);
        setIntField(term36891, term36891.getClass(), "flags", 0);
        setField(term36891, term36891.getClass(), "inputVerifier", null);
        setBooleanField(term36891, term36891.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term36891, term36891.getClass(), "paintingChild", null);
        setField(term36891, term36891.getClass(), "popupMenu", null);
        setField(term36891, term36891.getClass(), "revalidateRunnableScheduled", null);
        setField(term36891, term36891.getClass(), "focusInputMap", null);
        setField(term36891, term36891.getClass(), "ancestorInputMap", null);
        setField(term36891, term36891.getClass(), "windowInputMap", null);
        setField(term36891, term36891.getClass(), "actionMap", null);
        setField(term36891, term36891.getClass(), "aaHint", null);
        setField(term36891, term36891.getClass(), "lcdRenderingHint", null);
        setField(term36891, term36891.getClass(), "component", null);
        setField(term36891, term36891.getClass(), "layoutMgr", null);
        setField(term36891, term36891.getClass(), "dispatcher", null);
        setField(term36891, term36891.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term36891, term36891.getClass(), "focusCycleRoot", false);
        setBooleanField(term36891, term36891.getClass(), "focusTraversalPolicyProvider", false);
        setField(term36891, term36891.getClass(), "printingThreads", null);
        setBooleanField(term36891, term36891.getClass(), "printing", false);
        setField(term36891, term36891.getClass(), "containerListener", null);
        setIntField(term36891, term36891.getClass(), "listeningChildren", 0);
        setIntField(term36891, term36891.getClass(), "listeningBoundsChildren", 0);
        setIntField(term36891, term36891.getClass(), "descendantsCount", 0);
        setField(term36891, term36891.getClass(), "preserveBackgroundColor", null);
        setIntField(term36891, term36891.getClass(), "numOfHWComponents", 0);
        setIntField(term36891, term36891.getClass(), "numOfLWComponents", 0);
        setField(term36891, term36891.getClass(), "modalComp", null);
        setField(term36891, term36891.getClass(), "modalAppContext", null);
        setIntField(term36891, term36891.getClass(), "containerSerializedDataVersion", 0);
        setField(term36891, term36891.getClass(), "peer", null);
        setField(term36891, term36891.getClass(), "parent", null);
        setField(term36891, term36891.getClass(), "appContext", null);
        setIntField(term36891, term36891.getClass(), "x", 0);
        setIntField(term36891, term36891.getClass(), "y", 0);
        setIntField(term36891, term36891.getClass(), "width", 0);
        setIntField(term36891, term36891.getClass(), "height", 0);
        setField(term36891, term36891.getClass(), "foreground", null);
        setField(term36891, term36891.getClass(), "background", null);
        setField(term36891, term36891.getClass(), "font", null);
        setField(term36891, term36891.getClass(), "peerFont", null);
        setField(term36891, term36891.getClass(), "cursor", null);
        setField(term36891, term36891.getClass(), "locale", null);
        setField(term36891, term36891.getClass(), "graphicsConfig", null);
        setField(term36891, term36891.getClass(), "bufferStrategy", null);
        setBooleanField(term36891, term36891.getClass(), "ignoreRepaint", false);
        setBooleanField(term36891, term36891.getClass(), "visible", false);
        setBooleanField(term36891, term36891.getClass(), "enabled", false);
        setBooleanField(term36891, term36891.getClass(), "valid", false);
        setField(term36891, term36891.getClass(), "dropTarget", null);
        setField(term36891, term36891.getClass(), "popups", null);
        setField(term36891, term36891.getClass(), "name", null);
        setBooleanField(term36891, term36891.getClass(), "nameExplicitlySet", false);
        setBooleanField(term36891, term36891.getClass(), "focusable", false);
        setIntField(term36891, term36891.getClass(), "isFocusTraversableOverridden", 0);
        setField(term36891, term36891.getClass(), "focusTraversalKeys", null);
        setBooleanField(term36891, term36891.getClass(), "focusTraversalKeysEnabled", false);
        setField(term36891, term36891.getClass(), "acc", null);
        setField(term36891, term36891.getClass(), "minSize", null);
        setBooleanField(term36891, term36891.getClass(), "minSizeSet", false);
        setField(term36891, term36891.getClass(), "prefSize", null);
        setBooleanField(term36891, term36891.getClass(), "prefSizeSet", false);
        setField(term36891, term36891.getClass(), "maxSize", null);
        setBooleanField(term36891, term36891.getClass(), "maxSizeSet", false);
        setField(term36891, term36891.getClass(), "componentOrientation", null);
        setBooleanField(term36891, term36891.getClass(), "newEventsOnly", false);
        setField(term36891, term36891.getClass(), "componentListener", null);
        setField(term36891, term36891.getClass(), "focusListener", null);
        setField(term36891, term36891.getClass(), "hierarchyListener", null);
        setField(term36891, term36891.getClass(), "hierarchyBoundsListener", null);
        setField(term36891, term36891.getClass(), "keyListener", null);
        setField(term36891, term36891.getClass(), "mouseListener", null);
        setField(term36891, term36891.getClass(), "mouseMotionListener", null);
        setField(term36891, term36891.getClass(), "mouseWheelListener", null);
        setField(term36891, term36891.getClass(), "inputMethodListener", null);
        setLongField(term36891, term36891.getClass(), "eventMask", 0L);
        setField(term36891, term36891.getClass(), "changeSupport", null);
        setField(term36891, term36891.getClass(), "objectLock", null);
        setBooleanField(term36891, term36891.getClass(), "isPacked", false);
        setIntField(term36891, term36891.getClass(), "boundsOp", 0);
        setField(term36891, term36891.getClass(), "compoundShape", null);
        setField(term36891, term36891.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term36891, term36891.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term36891, term36891.getClass(), "backgroundEraseDisabled", false);
        setField(term36891, term36891.getClass(), "eventCache", null);
        setBooleanField(term36891, term36891.getClass(), "coalescingEnabled", false);
        setBooleanField(term36891, term36891.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term36891, term36891.getClass(), "componentSerializedDataVersion", 0);
        setField(term36891, term36891.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTextPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectBackgroundChanges", argTypes, term36891, args);
    }

};


