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
import java.lang.Boolean;

public class StarFieldTextArea_setSmoothScroll_21375854718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53489;
     Object term53548;

    public StarFieldTextArea_setSmoothScroll_21375854718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53489 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea"));
        setBooleanField(term53489, term53489.getClass(), "autoScroll", false);
        setField(term53489, term53489.getClass(), "scrollText", null);
        setField(term53489, term53489.getClass(), "textToShow", null);
        setIntField(term53489, term53489.getClass(), "numberOfLines", 0);
        setIntField(term53489, term53489.getClass(), "currentLine", 0);
        setBooleanField(term53489, term53489.getClass(), "smoothScroll", false);
        setBooleanField(term53489, term53489.getClass(), "smoothScrollNextRow", false);
        setIntField(term53489, term53489.getClass(), "smoothScrollY", 0);
        setIntField(term53489, term53489.getClass(), "customCharWidth", 0);
        setIntField(term53489, term53489.getClass(), "rows", 0);
        setIntField(term53489, term53489.getClass(), "columns", 0);
        setIntField(term53489, term53489.getClass(), "columnWidth", 0);
        setIntField(term53489, term53489.getClass(), "rowHeight", 0);
        setBooleanField(term53489, term53489.getClass(), "wrap", false);
        setBooleanField(term53489, term53489.getClass(), "word", false);
        setField(term53489, term53489.getClass(), "model", null);
        setField(term53489, term53489.getClass(), "caret", null);
        setField(term53489, term53489.getClass(), "navigationFilter", null);
        setField(term53489, term53489.getClass(), "highlighter", null);
        setField(term53489, term53489.getClass(), "keymap", null);
        setField(term53489, term53489.getClass(), "caretEvent", null);
        setField(term53489, term53489.getClass(), "caretColor", null);
        setField(term53489, term53489.getClass(), "selectionColor", null);
        setField(term53489, term53489.getClass(), "selectedTextColor", null);
        setField(term53489, term53489.getClass(), "disabledTextColor", null);
        setBooleanField(term53489, term53489.getClass(), "editable", false);
        setField(term53489, term53489.getClass(), "margin", null);
        setCharField(term53489, term53489.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term53489, term53489.getClass(), "dragEnabled", false);
        setField(term53489, term53489.getClass(), "dropMode", null);
        setField(term53489, term53489.getClass(), "dropLocation", null);
        setField(term53489, term53489.getClass(), "inputMethodRequestsHandler", null);
        setField(term53489, term53489.getClass(), "composedTextAttribute", null);
        setField(term53489, term53489.getClass(), "composedTextContent", null);
        setField(term53489, term53489.getClass(), "composedTextStart", null);
        setField(term53489, term53489.getClass(), "composedTextEnd", null);
        setField(term53489, term53489.getClass(), "latestCommittedTextStart", null);
        setField(term53489, term53489.getClass(), "latestCommittedTextEnd", null);
        setField(term53489, term53489.getClass(), "composedTextCaret", null);
        setField(term53489, term53489.getClass(), "originalCaret", null);
        setBooleanField(term53489, term53489.getClass(), "checkedInputOverride", false);
        setBooleanField(term53489, term53489.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term53489, term53489.getClass(), "isAlignmentXSet", false);
        setFloatField(term53489, term53489.getClass(), "alignmentX", 0.0F);
        setBooleanField(term53489, term53489.getClass(), "isAlignmentYSet", false);
        setFloatField(term53489, term53489.getClass(), "alignmentY", 0.0F);
        setField(term53489, term53489.getClass(), "ui", null);
        setField(term53489, term53489.getClass(), "listenerList", null);
        setField(term53489, term53489.getClass(), "clientProperties", null);
        setField(term53489, term53489.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term53489, term53489.getClass(), "autoscrolls", false);
        setField(term53489, term53489.getClass(), "border", null);
        setIntField(term53489, term53489.getClass(), "flags", 0);
        setField(term53489, term53489.getClass(), "inputVerifier", null);
        setBooleanField(term53489, term53489.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term53489, term53489.getClass(), "paintingChild", null);
        setField(term53489, term53489.getClass(), "popupMenu", null);
        setField(term53489, term53489.getClass(), "revalidateRunnableScheduled", null);
        setField(term53489, term53489.getClass(), "focusInputMap", null);
        setField(term53489, term53489.getClass(), "ancestorInputMap", null);
        setField(term53489, term53489.getClass(), "windowInputMap", null);
        setField(term53489, term53489.getClass(), "actionMap", null);
        setField(term53489, term53489.getClass(), "aaHint", null);
        setField(term53489, term53489.getClass(), "lcdRenderingHint", null);
        setField(term53489, term53489.getClass(), "component", null);
        setField(term53489, term53489.getClass(), "layoutMgr", null);
        setField(term53489, term53489.getClass(), "dispatcher", null);
        setField(term53489, term53489.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term53489, term53489.getClass(), "focusCycleRoot", false);
        setBooleanField(term53489, term53489.getClass(), "focusTraversalPolicyProvider", false);
        setField(term53489, term53489.getClass(), "printingThreads", null);
        setBooleanField(term53489, term53489.getClass(), "printing", false);
        setField(term53489, term53489.getClass(), "containerListener", null);
        setIntField(term53489, term53489.getClass(), "listeningChildren", 0);
        setIntField(term53489, term53489.getClass(), "listeningBoundsChildren", 0);
        setIntField(term53489, term53489.getClass(), "descendantsCount", 0);
        setField(term53489, term53489.getClass(), "preserveBackgroundColor", null);
        setIntField(term53489, term53489.getClass(), "numOfHWComponents", 0);
        setIntField(term53489, term53489.getClass(), "numOfLWComponents", 0);
        setField(term53489, term53489.getClass(), "modalComp", null);
        setField(term53489, term53489.getClass(), "modalAppContext", null);
        setIntField(term53489, term53489.getClass(), "containerSerializedDataVersion", 0);
        setField(term53489, term53489.getClass(), "peer", null);
        setField(term53489, term53489.getClass(), "parent", null);
        setField(term53489, term53489.getClass(), "appContext", null);
        setIntField(term53489, term53489.getClass(), "x", 0);
        setIntField(term53489, term53489.getClass(), "y", 0);
        setIntField(term53489, term53489.getClass(), "width", 0);
        setIntField(term53489, term53489.getClass(), "height", 0);
        setField(term53489, term53489.getClass(), "foreground", null);
        setField(term53489, term53489.getClass(), "background", null);
        setField(term53489, term53489.getClass(), "font", null);
        setField(term53489, term53489.getClass(), "peerFont", null);
        setField(term53489, term53489.getClass(), "cursor", null);
        setField(term53489, term53489.getClass(), "locale", null);
        setField(term53489, term53489.getClass(), "graphicsConfig", null);
        setField(term53489, term53489.getClass(), "bufferStrategy", null);
        setBooleanField(term53489, term53489.getClass(), "ignoreRepaint", false);
        setBooleanField(term53489, term53489.getClass(), "visible", false);
        setBooleanField(term53489, term53489.getClass(), "enabled", false);
        setBooleanField(term53489, term53489.getClass(), "valid", false);
        setField(term53489, term53489.getClass(), "dropTarget", null);
        setField(term53489, term53489.getClass(), "popups", null);
        setField(term53489, term53489.getClass(), "name", null);
        setBooleanField(term53489, term53489.getClass(), "nameExplicitlySet", false);
        setBooleanField(term53489, term53489.getClass(), "focusable", false);
        setIntField(term53489, term53489.getClass(), "isFocusTraversableOverridden", 0);
        setField(term53489, term53489.getClass(), "focusTraversalKeys", null);
        setBooleanField(term53489, term53489.getClass(), "focusTraversalKeysEnabled", false);
        setField(term53489, term53489.getClass(), "acc", null);
        setField(term53489, term53489.getClass(), "minSize", null);
        setBooleanField(term53489, term53489.getClass(), "minSizeSet", false);
        setField(term53489, term53489.getClass(), "prefSize", null);
        setBooleanField(term53489, term53489.getClass(), "prefSizeSet", false);
        setField(term53489, term53489.getClass(), "maxSize", null);
        setBooleanField(term53489, term53489.getClass(), "maxSizeSet", false);
        setField(term53489, term53489.getClass(), "componentOrientation", null);
        setBooleanField(term53489, term53489.getClass(), "newEventsOnly", false);
        setField(term53489, term53489.getClass(), "componentListener", null);
        setField(term53489, term53489.getClass(), "focusListener", null);
        setField(term53489, term53489.getClass(), "hierarchyListener", null);
        setField(term53489, term53489.getClass(), "hierarchyBoundsListener", null);
        setField(term53489, term53489.getClass(), "keyListener", null);
        setField(term53489, term53489.getClass(), "mouseListener", null);
        setField(term53489, term53489.getClass(), "mouseMotionListener", null);
        setField(term53489, term53489.getClass(), "mouseWheelListener", null);
        setField(term53489, term53489.getClass(), "inputMethodListener", null);
        setLongField(term53489, term53489.getClass(), "eventMask", 0L);
        setField(term53489, term53489.getClass(), "changeSupport", null);
        setField(term53489, term53489.getClass(), "objectLock", null);
        setBooleanField(term53489, term53489.getClass(), "isPacked", false);
        setIntField(term53489, term53489.getClass(), "boundsOp", 0);
        setField(term53489, term53489.getClass(), "compoundShape", null);
        setField(term53489, term53489.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term53489, term53489.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term53489, term53489.getClass(), "backgroundEraseDisabled", false);
        setField(term53489, term53489.getClass(), "eventCache", null);
        setBooleanField(term53489, term53489.getClass(), "coalescingEnabled", false);
        setBooleanField(term53489, term53489.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term53489, term53489.getClass(), "componentSerializedDataVersion", 0);
        setField(term53489, term53489.getClass(), "accessibleContext", null);
        term53548 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term53548;
        callMethod(klass, "setSmoothScroll", argTypes, term53489, args);
    }

};


