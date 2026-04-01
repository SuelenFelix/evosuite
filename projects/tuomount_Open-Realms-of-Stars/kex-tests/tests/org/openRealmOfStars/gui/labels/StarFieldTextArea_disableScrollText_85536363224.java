package org.openRealmOfStars.gui.labels;

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
import static org.openRealmOfStars.gui.labels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StarFieldTextArea_disableScrollText_85536363224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53672;

    public StarFieldTextArea_disableScrollText_85536363224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53672 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea"));
        setBooleanField(term53672, term53672.getClass(), "autoScroll", false);
        setField(term53672, term53672.getClass(), "scrollText", null);
        setField(term53672, term53672.getClass(), "textToShow", null);
        setIntField(term53672, term53672.getClass(), "numberOfLines", 0);
        setIntField(term53672, term53672.getClass(), "currentLine", 0);
        setBooleanField(term53672, term53672.getClass(), "smoothScroll", false);
        setBooleanField(term53672, term53672.getClass(), "smoothScrollNextRow", false);
        setIntField(term53672, term53672.getClass(), "smoothScrollY", 0);
        setIntField(term53672, term53672.getClass(), "customCharWidth", 0);
        setIntField(term53672, term53672.getClass(), "rows", 0);
        setIntField(term53672, term53672.getClass(), "columns", 0);
        setIntField(term53672, term53672.getClass(), "columnWidth", 0);
        setIntField(term53672, term53672.getClass(), "rowHeight", 0);
        setBooleanField(term53672, term53672.getClass(), "wrap", false);
        setBooleanField(term53672, term53672.getClass(), "word", false);
        setField(term53672, term53672.getClass(), "model", null);
        setField(term53672, term53672.getClass(), "caret", null);
        setField(term53672, term53672.getClass(), "navigationFilter", null);
        setField(term53672, term53672.getClass(), "highlighter", null);
        setField(term53672, term53672.getClass(), "keymap", null);
        setField(term53672, term53672.getClass(), "caretEvent", null);
        setField(term53672, term53672.getClass(), "caretColor", null);
        setField(term53672, term53672.getClass(), "selectionColor", null);
        setField(term53672, term53672.getClass(), "selectedTextColor", null);
        setField(term53672, term53672.getClass(), "disabledTextColor", null);
        setBooleanField(term53672, term53672.getClass(), "editable", false);
        setField(term53672, term53672.getClass(), "margin", null);
        setCharField(term53672, term53672.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term53672, term53672.getClass(), "dragEnabled", false);
        setField(term53672, term53672.getClass(), "dropMode", null);
        setField(term53672, term53672.getClass(), "dropLocation", null);
        setField(term53672, term53672.getClass(), "inputMethodRequestsHandler", null);
        setField(term53672, term53672.getClass(), "composedTextAttribute", null);
        setField(term53672, term53672.getClass(), "composedTextContent", null);
        setField(term53672, term53672.getClass(), "composedTextStart", null);
        setField(term53672, term53672.getClass(), "composedTextEnd", null);
        setField(term53672, term53672.getClass(), "latestCommittedTextStart", null);
        setField(term53672, term53672.getClass(), "latestCommittedTextEnd", null);
        setField(term53672, term53672.getClass(), "composedTextCaret", null);
        setField(term53672, term53672.getClass(), "originalCaret", null);
        setBooleanField(term53672, term53672.getClass(), "checkedInputOverride", false);
        setBooleanField(term53672, term53672.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term53672, term53672.getClass(), "isAlignmentXSet", false);
        setFloatField(term53672, term53672.getClass(), "alignmentX", 0.0F);
        setBooleanField(term53672, term53672.getClass(), "isAlignmentYSet", false);
        setFloatField(term53672, term53672.getClass(), "alignmentY", 0.0F);
        setField(term53672, term53672.getClass(), "ui", null);
        setField(term53672, term53672.getClass(), "listenerList", null);
        setField(term53672, term53672.getClass(), "clientProperties", null);
        setField(term53672, term53672.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term53672, term53672.getClass(), "autoscrolls", false);
        setField(term53672, term53672.getClass(), "border", null);
        setIntField(term53672, term53672.getClass(), "flags", 0);
        setField(term53672, term53672.getClass(), "inputVerifier", null);
        setBooleanField(term53672, term53672.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term53672, term53672.getClass(), "paintingChild", null);
        setField(term53672, term53672.getClass(), "popupMenu", null);
        setField(term53672, term53672.getClass(), "revalidateRunnableScheduled", null);
        setField(term53672, term53672.getClass(), "focusInputMap", null);
        setField(term53672, term53672.getClass(), "ancestorInputMap", null);
        setField(term53672, term53672.getClass(), "windowInputMap", null);
        setField(term53672, term53672.getClass(), "actionMap", null);
        setField(term53672, term53672.getClass(), "aaHint", null);
        setField(term53672, term53672.getClass(), "lcdRenderingHint", null);
        setField(term53672, term53672.getClass(), "component", null);
        setField(term53672, term53672.getClass(), "layoutMgr", null);
        setField(term53672, term53672.getClass(), "dispatcher", null);
        setField(term53672, term53672.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term53672, term53672.getClass(), "focusCycleRoot", false);
        setBooleanField(term53672, term53672.getClass(), "focusTraversalPolicyProvider", false);
        setField(term53672, term53672.getClass(), "printingThreads", null);
        setBooleanField(term53672, term53672.getClass(), "printing", false);
        setField(term53672, term53672.getClass(), "containerListener", null);
        setIntField(term53672, term53672.getClass(), "listeningChildren", 0);
        setIntField(term53672, term53672.getClass(), "listeningBoundsChildren", 0);
        setIntField(term53672, term53672.getClass(), "descendantsCount", 0);
        setField(term53672, term53672.getClass(), "preserveBackgroundColor", null);
        setIntField(term53672, term53672.getClass(), "numOfHWComponents", 0);
        setIntField(term53672, term53672.getClass(), "numOfLWComponents", 0);
        setField(term53672, term53672.getClass(), "modalComp", null);
        setField(term53672, term53672.getClass(), "modalAppContext", null);
        setIntField(term53672, term53672.getClass(), "containerSerializedDataVersion", 0);
        setField(term53672, term53672.getClass(), "peer", null);
        setField(term53672, term53672.getClass(), "parent", null);
        setField(term53672, term53672.getClass(), "appContext", null);
        setIntField(term53672, term53672.getClass(), "x", 0);
        setIntField(term53672, term53672.getClass(), "y", 0);
        setIntField(term53672, term53672.getClass(), "width", 0);
        setIntField(term53672, term53672.getClass(), "height", 0);
        setField(term53672, term53672.getClass(), "foreground", null);
        setField(term53672, term53672.getClass(), "background", null);
        setField(term53672, term53672.getClass(), "font", null);
        setField(term53672, term53672.getClass(), "peerFont", null);
        setField(term53672, term53672.getClass(), "cursor", null);
        setField(term53672, term53672.getClass(), "locale", null);
        setField(term53672, term53672.getClass(), "graphicsConfig", null);
        setField(term53672, term53672.getClass(), "bufferStrategy", null);
        setBooleanField(term53672, term53672.getClass(), "ignoreRepaint", false);
        setBooleanField(term53672, term53672.getClass(), "visible", false);
        setBooleanField(term53672, term53672.getClass(), "enabled", false);
        setBooleanField(term53672, term53672.getClass(), "valid", false);
        setField(term53672, term53672.getClass(), "dropTarget", null);
        setField(term53672, term53672.getClass(), "popups", null);
        setField(term53672, term53672.getClass(), "name", null);
        setBooleanField(term53672, term53672.getClass(), "nameExplicitlySet", false);
        setBooleanField(term53672, term53672.getClass(), "focusable", false);
        setIntField(term53672, term53672.getClass(), "isFocusTraversableOverridden", 0);
        setField(term53672, term53672.getClass(), "focusTraversalKeys", null);
        setBooleanField(term53672, term53672.getClass(), "focusTraversalKeysEnabled", false);
        setField(term53672, term53672.getClass(), "acc", null);
        setField(term53672, term53672.getClass(), "minSize", null);
        setBooleanField(term53672, term53672.getClass(), "minSizeSet", false);
        setField(term53672, term53672.getClass(), "prefSize", null);
        setBooleanField(term53672, term53672.getClass(), "prefSizeSet", false);
        setField(term53672, term53672.getClass(), "maxSize", null);
        setBooleanField(term53672, term53672.getClass(), "maxSizeSet", false);
        setField(term53672, term53672.getClass(), "componentOrientation", null);
        setBooleanField(term53672, term53672.getClass(), "newEventsOnly", false);
        setField(term53672, term53672.getClass(), "componentListener", null);
        setField(term53672, term53672.getClass(), "focusListener", null);
        setField(term53672, term53672.getClass(), "hierarchyListener", null);
        setField(term53672, term53672.getClass(), "hierarchyBoundsListener", null);
        setField(term53672, term53672.getClass(), "keyListener", null);
        setField(term53672, term53672.getClass(), "mouseListener", null);
        setField(term53672, term53672.getClass(), "mouseMotionListener", null);
        setField(term53672, term53672.getClass(), "mouseWheelListener", null);
        setField(term53672, term53672.getClass(), "inputMethodListener", null);
        setLongField(term53672, term53672.getClass(), "eventMask", 0L);
        setField(term53672, term53672.getClass(), "changeSupport", null);
        setField(term53672, term53672.getClass(), "objectLock", null);
        setBooleanField(term53672, term53672.getClass(), "isPacked", false);
        setIntField(term53672, term53672.getClass(), "boundsOp", 0);
        setField(term53672, term53672.getClass(), "compoundShape", null);
        setField(term53672, term53672.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term53672, term53672.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term53672, term53672.getClass(), "backgroundEraseDisabled", false);
        setField(term53672, term53672.getClass(), "eventCache", null);
        setBooleanField(term53672, term53672.getClass(), "coalescingEnabled", false);
        setBooleanField(term53672, term53672.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term53672, term53672.getClass(), "componentSerializedDataVersion", 0);
        setField(term53672, term53672.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "disableScrollText", argTypes, term53672, args);
    }

};


