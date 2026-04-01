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

public class StarFieldTextArea_getNextLine_27661553125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53731;

    public StarFieldTextArea_getNextLine_27661553125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53731 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea"));
        setBooleanField(term53731, term53731.getClass(), "autoScroll", false);
        setField(term53731, term53731.getClass(), "scrollText", null);
        setField(term53731, term53731.getClass(), "textToShow", null);
        setIntField(term53731, term53731.getClass(), "numberOfLines", 0);
        setIntField(term53731, term53731.getClass(), "currentLine", 0);
        setBooleanField(term53731, term53731.getClass(), "smoothScroll", false);
        setBooleanField(term53731, term53731.getClass(), "smoothScrollNextRow", false);
        setIntField(term53731, term53731.getClass(), "smoothScrollY", 0);
        setIntField(term53731, term53731.getClass(), "customCharWidth", 0);
        setIntField(term53731, term53731.getClass(), "rows", 0);
        setIntField(term53731, term53731.getClass(), "columns", 0);
        setIntField(term53731, term53731.getClass(), "columnWidth", 0);
        setIntField(term53731, term53731.getClass(), "rowHeight", 0);
        setBooleanField(term53731, term53731.getClass(), "wrap", false);
        setBooleanField(term53731, term53731.getClass(), "word", false);
        setField(term53731, term53731.getClass(), "model", null);
        setField(term53731, term53731.getClass(), "caret", null);
        setField(term53731, term53731.getClass(), "navigationFilter", null);
        setField(term53731, term53731.getClass(), "highlighter", null);
        setField(term53731, term53731.getClass(), "keymap", null);
        setField(term53731, term53731.getClass(), "caretEvent", null);
        setField(term53731, term53731.getClass(), "caretColor", null);
        setField(term53731, term53731.getClass(), "selectionColor", null);
        setField(term53731, term53731.getClass(), "selectedTextColor", null);
        setField(term53731, term53731.getClass(), "disabledTextColor", null);
        setBooleanField(term53731, term53731.getClass(), "editable", false);
        setField(term53731, term53731.getClass(), "margin", null);
        setCharField(term53731, term53731.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term53731, term53731.getClass(), "dragEnabled", false);
        setField(term53731, term53731.getClass(), "dropMode", null);
        setField(term53731, term53731.getClass(), "dropLocation", null);
        setField(term53731, term53731.getClass(), "inputMethodRequestsHandler", null);
        setField(term53731, term53731.getClass(), "composedTextAttribute", null);
        setField(term53731, term53731.getClass(), "composedTextContent", null);
        setField(term53731, term53731.getClass(), "composedTextStart", null);
        setField(term53731, term53731.getClass(), "composedTextEnd", null);
        setField(term53731, term53731.getClass(), "latestCommittedTextStart", null);
        setField(term53731, term53731.getClass(), "latestCommittedTextEnd", null);
        setField(term53731, term53731.getClass(), "composedTextCaret", null);
        setField(term53731, term53731.getClass(), "originalCaret", null);
        setBooleanField(term53731, term53731.getClass(), "checkedInputOverride", false);
        setBooleanField(term53731, term53731.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term53731, term53731.getClass(), "isAlignmentXSet", false);
        setFloatField(term53731, term53731.getClass(), "alignmentX", 0.0F);
        setBooleanField(term53731, term53731.getClass(), "isAlignmentYSet", false);
        setFloatField(term53731, term53731.getClass(), "alignmentY", 0.0F);
        setField(term53731, term53731.getClass(), "ui", null);
        setField(term53731, term53731.getClass(), "listenerList", null);
        setField(term53731, term53731.getClass(), "clientProperties", null);
        setField(term53731, term53731.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term53731, term53731.getClass(), "autoscrolls", false);
        setField(term53731, term53731.getClass(), "border", null);
        setIntField(term53731, term53731.getClass(), "flags", 0);
        setField(term53731, term53731.getClass(), "inputVerifier", null);
        setBooleanField(term53731, term53731.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term53731, term53731.getClass(), "paintingChild", null);
        setField(term53731, term53731.getClass(), "popupMenu", null);
        setField(term53731, term53731.getClass(), "revalidateRunnableScheduled", null);
        setField(term53731, term53731.getClass(), "focusInputMap", null);
        setField(term53731, term53731.getClass(), "ancestorInputMap", null);
        setField(term53731, term53731.getClass(), "windowInputMap", null);
        setField(term53731, term53731.getClass(), "actionMap", null);
        setField(term53731, term53731.getClass(), "aaHint", null);
        setField(term53731, term53731.getClass(), "lcdRenderingHint", null);
        setField(term53731, term53731.getClass(), "component", null);
        setField(term53731, term53731.getClass(), "layoutMgr", null);
        setField(term53731, term53731.getClass(), "dispatcher", null);
        setField(term53731, term53731.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term53731, term53731.getClass(), "focusCycleRoot", false);
        setBooleanField(term53731, term53731.getClass(), "focusTraversalPolicyProvider", false);
        setField(term53731, term53731.getClass(), "printingThreads", null);
        setBooleanField(term53731, term53731.getClass(), "printing", false);
        setField(term53731, term53731.getClass(), "containerListener", null);
        setIntField(term53731, term53731.getClass(), "listeningChildren", 0);
        setIntField(term53731, term53731.getClass(), "listeningBoundsChildren", 0);
        setIntField(term53731, term53731.getClass(), "descendantsCount", 0);
        setField(term53731, term53731.getClass(), "preserveBackgroundColor", null);
        setIntField(term53731, term53731.getClass(), "numOfHWComponents", 0);
        setIntField(term53731, term53731.getClass(), "numOfLWComponents", 0);
        setField(term53731, term53731.getClass(), "modalComp", null);
        setField(term53731, term53731.getClass(), "modalAppContext", null);
        setIntField(term53731, term53731.getClass(), "containerSerializedDataVersion", 0);
        setField(term53731, term53731.getClass(), "peer", null);
        setField(term53731, term53731.getClass(), "parent", null);
        setField(term53731, term53731.getClass(), "appContext", null);
        setIntField(term53731, term53731.getClass(), "x", 0);
        setIntField(term53731, term53731.getClass(), "y", 0);
        setIntField(term53731, term53731.getClass(), "width", 0);
        setIntField(term53731, term53731.getClass(), "height", 0);
        setField(term53731, term53731.getClass(), "foreground", null);
        setField(term53731, term53731.getClass(), "background", null);
        setField(term53731, term53731.getClass(), "font", null);
        setField(term53731, term53731.getClass(), "peerFont", null);
        setField(term53731, term53731.getClass(), "cursor", null);
        setField(term53731, term53731.getClass(), "locale", null);
        setField(term53731, term53731.getClass(), "graphicsConfig", null);
        setField(term53731, term53731.getClass(), "bufferStrategy", null);
        setBooleanField(term53731, term53731.getClass(), "ignoreRepaint", false);
        setBooleanField(term53731, term53731.getClass(), "visible", false);
        setBooleanField(term53731, term53731.getClass(), "enabled", false);
        setBooleanField(term53731, term53731.getClass(), "valid", false);
        setField(term53731, term53731.getClass(), "dropTarget", null);
        setField(term53731, term53731.getClass(), "popups", null);
        setField(term53731, term53731.getClass(), "name", null);
        setBooleanField(term53731, term53731.getClass(), "nameExplicitlySet", false);
        setBooleanField(term53731, term53731.getClass(), "focusable", false);
        setIntField(term53731, term53731.getClass(), "isFocusTraversableOverridden", 0);
        setField(term53731, term53731.getClass(), "focusTraversalKeys", null);
        setBooleanField(term53731, term53731.getClass(), "focusTraversalKeysEnabled", false);
        setField(term53731, term53731.getClass(), "acc", null);
        setField(term53731, term53731.getClass(), "minSize", null);
        setBooleanField(term53731, term53731.getClass(), "minSizeSet", false);
        setField(term53731, term53731.getClass(), "prefSize", null);
        setBooleanField(term53731, term53731.getClass(), "prefSizeSet", false);
        setField(term53731, term53731.getClass(), "maxSize", null);
        setBooleanField(term53731, term53731.getClass(), "maxSizeSet", false);
        setField(term53731, term53731.getClass(), "componentOrientation", null);
        setBooleanField(term53731, term53731.getClass(), "newEventsOnly", false);
        setField(term53731, term53731.getClass(), "componentListener", null);
        setField(term53731, term53731.getClass(), "focusListener", null);
        setField(term53731, term53731.getClass(), "hierarchyListener", null);
        setField(term53731, term53731.getClass(), "hierarchyBoundsListener", null);
        setField(term53731, term53731.getClass(), "keyListener", null);
        setField(term53731, term53731.getClass(), "mouseListener", null);
        setField(term53731, term53731.getClass(), "mouseMotionListener", null);
        setField(term53731, term53731.getClass(), "mouseWheelListener", null);
        setField(term53731, term53731.getClass(), "inputMethodListener", null);
        setLongField(term53731, term53731.getClass(), "eventMask", 0L);
        setField(term53731, term53731.getClass(), "changeSupport", null);
        setField(term53731, term53731.getClass(), "objectLock", null);
        setBooleanField(term53731, term53731.getClass(), "isPacked", false);
        setIntField(term53731, term53731.getClass(), "boundsOp", 0);
        setField(term53731, term53731.getClass(), "compoundShape", null);
        setField(term53731, term53731.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term53731, term53731.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term53731, term53731.getClass(), "backgroundEraseDisabled", false);
        setField(term53731, term53731.getClass(), "eventCache", null);
        setBooleanField(term53731, term53731.getClass(), "coalescingEnabled", false);
        setBooleanField(term53731, term53731.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term53731, term53731.getClass(), "componentSerializedDataVersion", 0);
        setField(term53731, term53731.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextLine", argTypes, term53731, args);
    }

};


