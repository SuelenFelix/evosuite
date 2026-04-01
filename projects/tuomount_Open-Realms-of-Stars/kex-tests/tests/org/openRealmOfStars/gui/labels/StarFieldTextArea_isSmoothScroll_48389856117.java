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

public class StarFieldTextArea_isSmoothScroll_48389856117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53430;

    public StarFieldTextArea_isSmoothScroll_48389856117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53430 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea"));
        setBooleanField(term53430, term53430.getClass(), "autoScroll", false);
        setField(term53430, term53430.getClass(), "scrollText", null);
        setField(term53430, term53430.getClass(), "textToShow", null);
        setIntField(term53430, term53430.getClass(), "numberOfLines", 0);
        setIntField(term53430, term53430.getClass(), "currentLine", 0);
        setBooleanField(term53430, term53430.getClass(), "smoothScroll", false);
        setBooleanField(term53430, term53430.getClass(), "smoothScrollNextRow", false);
        setIntField(term53430, term53430.getClass(), "smoothScrollY", 0);
        setIntField(term53430, term53430.getClass(), "customCharWidth", 0);
        setIntField(term53430, term53430.getClass(), "rows", 0);
        setIntField(term53430, term53430.getClass(), "columns", 0);
        setIntField(term53430, term53430.getClass(), "columnWidth", 0);
        setIntField(term53430, term53430.getClass(), "rowHeight", 0);
        setBooleanField(term53430, term53430.getClass(), "wrap", false);
        setBooleanField(term53430, term53430.getClass(), "word", false);
        setField(term53430, term53430.getClass(), "model", null);
        setField(term53430, term53430.getClass(), "caret", null);
        setField(term53430, term53430.getClass(), "navigationFilter", null);
        setField(term53430, term53430.getClass(), "highlighter", null);
        setField(term53430, term53430.getClass(), "keymap", null);
        setField(term53430, term53430.getClass(), "caretEvent", null);
        setField(term53430, term53430.getClass(), "caretColor", null);
        setField(term53430, term53430.getClass(), "selectionColor", null);
        setField(term53430, term53430.getClass(), "selectedTextColor", null);
        setField(term53430, term53430.getClass(), "disabledTextColor", null);
        setBooleanField(term53430, term53430.getClass(), "editable", false);
        setField(term53430, term53430.getClass(), "margin", null);
        setCharField(term53430, term53430.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term53430, term53430.getClass(), "dragEnabled", false);
        setField(term53430, term53430.getClass(), "dropMode", null);
        setField(term53430, term53430.getClass(), "dropLocation", null);
        setField(term53430, term53430.getClass(), "inputMethodRequestsHandler", null);
        setField(term53430, term53430.getClass(), "composedTextAttribute", null);
        setField(term53430, term53430.getClass(), "composedTextContent", null);
        setField(term53430, term53430.getClass(), "composedTextStart", null);
        setField(term53430, term53430.getClass(), "composedTextEnd", null);
        setField(term53430, term53430.getClass(), "latestCommittedTextStart", null);
        setField(term53430, term53430.getClass(), "latestCommittedTextEnd", null);
        setField(term53430, term53430.getClass(), "composedTextCaret", null);
        setField(term53430, term53430.getClass(), "originalCaret", null);
        setBooleanField(term53430, term53430.getClass(), "checkedInputOverride", false);
        setBooleanField(term53430, term53430.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term53430, term53430.getClass(), "isAlignmentXSet", false);
        setFloatField(term53430, term53430.getClass(), "alignmentX", 0.0F);
        setBooleanField(term53430, term53430.getClass(), "isAlignmentYSet", false);
        setFloatField(term53430, term53430.getClass(), "alignmentY", 0.0F);
        setField(term53430, term53430.getClass(), "ui", null);
        setField(term53430, term53430.getClass(), "listenerList", null);
        setField(term53430, term53430.getClass(), "clientProperties", null);
        setField(term53430, term53430.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term53430, term53430.getClass(), "autoscrolls", false);
        setField(term53430, term53430.getClass(), "border", null);
        setIntField(term53430, term53430.getClass(), "flags", 0);
        setField(term53430, term53430.getClass(), "inputVerifier", null);
        setBooleanField(term53430, term53430.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term53430, term53430.getClass(), "paintingChild", null);
        setField(term53430, term53430.getClass(), "popupMenu", null);
        setField(term53430, term53430.getClass(), "revalidateRunnableScheduled", null);
        setField(term53430, term53430.getClass(), "focusInputMap", null);
        setField(term53430, term53430.getClass(), "ancestorInputMap", null);
        setField(term53430, term53430.getClass(), "windowInputMap", null);
        setField(term53430, term53430.getClass(), "actionMap", null);
        setField(term53430, term53430.getClass(), "aaHint", null);
        setField(term53430, term53430.getClass(), "lcdRenderingHint", null);
        setField(term53430, term53430.getClass(), "component", null);
        setField(term53430, term53430.getClass(), "layoutMgr", null);
        setField(term53430, term53430.getClass(), "dispatcher", null);
        setField(term53430, term53430.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term53430, term53430.getClass(), "focusCycleRoot", false);
        setBooleanField(term53430, term53430.getClass(), "focusTraversalPolicyProvider", false);
        setField(term53430, term53430.getClass(), "printingThreads", null);
        setBooleanField(term53430, term53430.getClass(), "printing", false);
        setField(term53430, term53430.getClass(), "containerListener", null);
        setIntField(term53430, term53430.getClass(), "listeningChildren", 0);
        setIntField(term53430, term53430.getClass(), "listeningBoundsChildren", 0);
        setIntField(term53430, term53430.getClass(), "descendantsCount", 0);
        setField(term53430, term53430.getClass(), "preserveBackgroundColor", null);
        setIntField(term53430, term53430.getClass(), "numOfHWComponents", 0);
        setIntField(term53430, term53430.getClass(), "numOfLWComponents", 0);
        setField(term53430, term53430.getClass(), "modalComp", null);
        setField(term53430, term53430.getClass(), "modalAppContext", null);
        setIntField(term53430, term53430.getClass(), "containerSerializedDataVersion", 0);
        setField(term53430, term53430.getClass(), "peer", null);
        setField(term53430, term53430.getClass(), "parent", null);
        setField(term53430, term53430.getClass(), "appContext", null);
        setIntField(term53430, term53430.getClass(), "x", 0);
        setIntField(term53430, term53430.getClass(), "y", 0);
        setIntField(term53430, term53430.getClass(), "width", 0);
        setIntField(term53430, term53430.getClass(), "height", 0);
        setField(term53430, term53430.getClass(), "foreground", null);
        setField(term53430, term53430.getClass(), "background", null);
        setField(term53430, term53430.getClass(), "font", null);
        setField(term53430, term53430.getClass(), "peerFont", null);
        setField(term53430, term53430.getClass(), "cursor", null);
        setField(term53430, term53430.getClass(), "locale", null);
        setField(term53430, term53430.getClass(), "graphicsConfig", null);
        setField(term53430, term53430.getClass(), "bufferStrategy", null);
        setBooleanField(term53430, term53430.getClass(), "ignoreRepaint", false);
        setBooleanField(term53430, term53430.getClass(), "visible", false);
        setBooleanField(term53430, term53430.getClass(), "enabled", false);
        setBooleanField(term53430, term53430.getClass(), "valid", false);
        setField(term53430, term53430.getClass(), "dropTarget", null);
        setField(term53430, term53430.getClass(), "popups", null);
        setField(term53430, term53430.getClass(), "name", null);
        setBooleanField(term53430, term53430.getClass(), "nameExplicitlySet", false);
        setBooleanField(term53430, term53430.getClass(), "focusable", false);
        setIntField(term53430, term53430.getClass(), "isFocusTraversableOverridden", 0);
        setField(term53430, term53430.getClass(), "focusTraversalKeys", null);
        setBooleanField(term53430, term53430.getClass(), "focusTraversalKeysEnabled", false);
        setField(term53430, term53430.getClass(), "acc", null);
        setField(term53430, term53430.getClass(), "minSize", null);
        setBooleanField(term53430, term53430.getClass(), "minSizeSet", false);
        setField(term53430, term53430.getClass(), "prefSize", null);
        setBooleanField(term53430, term53430.getClass(), "prefSizeSet", false);
        setField(term53430, term53430.getClass(), "maxSize", null);
        setBooleanField(term53430, term53430.getClass(), "maxSizeSet", false);
        setField(term53430, term53430.getClass(), "componentOrientation", null);
        setBooleanField(term53430, term53430.getClass(), "newEventsOnly", false);
        setField(term53430, term53430.getClass(), "componentListener", null);
        setField(term53430, term53430.getClass(), "focusListener", null);
        setField(term53430, term53430.getClass(), "hierarchyListener", null);
        setField(term53430, term53430.getClass(), "hierarchyBoundsListener", null);
        setField(term53430, term53430.getClass(), "keyListener", null);
        setField(term53430, term53430.getClass(), "mouseListener", null);
        setField(term53430, term53430.getClass(), "mouseMotionListener", null);
        setField(term53430, term53430.getClass(), "mouseWheelListener", null);
        setField(term53430, term53430.getClass(), "inputMethodListener", null);
        setLongField(term53430, term53430.getClass(), "eventMask", 0L);
        setField(term53430, term53430.getClass(), "changeSupport", null);
        setField(term53430, term53430.getClass(), "objectLock", null);
        setBooleanField(term53430, term53430.getClass(), "isPacked", false);
        setIntField(term53430, term53430.getClass(), "boundsOp", 0);
        setField(term53430, term53430.getClass(), "compoundShape", null);
        setField(term53430, term53430.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term53430, term53430.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term53430, term53430.getClass(), "backgroundEraseDisabled", false);
        setField(term53430, term53430.getClass(), "eventCache", null);
        setBooleanField(term53430, term53430.getClass(), "coalescingEnabled", false);
        setBooleanField(term53430, term53430.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term53430, term53430.getClass(), "componentSerializedDataVersion", 0);
        setField(term53430, term53430.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSmoothScroll", argTypes, term53430, args);
    }

};


