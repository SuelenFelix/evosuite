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
import java.lang.Integer;

public class StarFieldTextArea_setCharacterWidth_22925144128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53910;
     Object term53969;

    public StarFieldTextArea_setCharacterWidth_22925144128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53910 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea"));
        setBooleanField(term53910, term53910.getClass(), "autoScroll", false);
        setField(term53910, term53910.getClass(), "scrollText", null);
        setField(term53910, term53910.getClass(), "textToShow", null);
        setIntField(term53910, term53910.getClass(), "numberOfLines", 0);
        setIntField(term53910, term53910.getClass(), "currentLine", 0);
        setBooleanField(term53910, term53910.getClass(), "smoothScroll", false);
        setBooleanField(term53910, term53910.getClass(), "smoothScrollNextRow", false);
        setIntField(term53910, term53910.getClass(), "smoothScrollY", 0);
        setIntField(term53910, term53910.getClass(), "customCharWidth", 0);
        setIntField(term53910, term53910.getClass(), "rows", 0);
        setIntField(term53910, term53910.getClass(), "columns", 0);
        setIntField(term53910, term53910.getClass(), "columnWidth", 0);
        setIntField(term53910, term53910.getClass(), "rowHeight", 0);
        setBooleanField(term53910, term53910.getClass(), "wrap", false);
        setBooleanField(term53910, term53910.getClass(), "word", false);
        setField(term53910, term53910.getClass(), "model", null);
        setField(term53910, term53910.getClass(), "caret", null);
        setField(term53910, term53910.getClass(), "navigationFilter", null);
        setField(term53910, term53910.getClass(), "highlighter", null);
        setField(term53910, term53910.getClass(), "keymap", null);
        setField(term53910, term53910.getClass(), "caretEvent", null);
        setField(term53910, term53910.getClass(), "caretColor", null);
        setField(term53910, term53910.getClass(), "selectionColor", null);
        setField(term53910, term53910.getClass(), "selectedTextColor", null);
        setField(term53910, term53910.getClass(), "disabledTextColor", null);
        setBooleanField(term53910, term53910.getClass(), "editable", false);
        setField(term53910, term53910.getClass(), "margin", null);
        setCharField(term53910, term53910.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term53910, term53910.getClass(), "dragEnabled", false);
        setField(term53910, term53910.getClass(), "dropMode", null);
        setField(term53910, term53910.getClass(), "dropLocation", null);
        setField(term53910, term53910.getClass(), "inputMethodRequestsHandler", null);
        setField(term53910, term53910.getClass(), "composedTextAttribute", null);
        setField(term53910, term53910.getClass(), "composedTextContent", null);
        setField(term53910, term53910.getClass(), "composedTextStart", null);
        setField(term53910, term53910.getClass(), "composedTextEnd", null);
        setField(term53910, term53910.getClass(), "latestCommittedTextStart", null);
        setField(term53910, term53910.getClass(), "latestCommittedTextEnd", null);
        setField(term53910, term53910.getClass(), "composedTextCaret", null);
        setField(term53910, term53910.getClass(), "originalCaret", null);
        setBooleanField(term53910, term53910.getClass(), "checkedInputOverride", false);
        setBooleanField(term53910, term53910.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term53910, term53910.getClass(), "isAlignmentXSet", false);
        setFloatField(term53910, term53910.getClass(), "alignmentX", 0.0F);
        setBooleanField(term53910, term53910.getClass(), "isAlignmentYSet", false);
        setFloatField(term53910, term53910.getClass(), "alignmentY", 0.0F);
        setField(term53910, term53910.getClass(), "ui", null);
        setField(term53910, term53910.getClass(), "listenerList", null);
        setField(term53910, term53910.getClass(), "clientProperties", null);
        setField(term53910, term53910.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term53910, term53910.getClass(), "autoscrolls", false);
        setField(term53910, term53910.getClass(), "border", null);
        setIntField(term53910, term53910.getClass(), "flags", 0);
        setField(term53910, term53910.getClass(), "inputVerifier", null);
        setBooleanField(term53910, term53910.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term53910, term53910.getClass(), "paintingChild", null);
        setField(term53910, term53910.getClass(), "popupMenu", null);
        setField(term53910, term53910.getClass(), "revalidateRunnableScheduled", null);
        setField(term53910, term53910.getClass(), "focusInputMap", null);
        setField(term53910, term53910.getClass(), "ancestorInputMap", null);
        setField(term53910, term53910.getClass(), "windowInputMap", null);
        setField(term53910, term53910.getClass(), "actionMap", null);
        setField(term53910, term53910.getClass(), "aaHint", null);
        setField(term53910, term53910.getClass(), "lcdRenderingHint", null);
        setField(term53910, term53910.getClass(), "component", null);
        setField(term53910, term53910.getClass(), "layoutMgr", null);
        setField(term53910, term53910.getClass(), "dispatcher", null);
        setField(term53910, term53910.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term53910, term53910.getClass(), "focusCycleRoot", false);
        setBooleanField(term53910, term53910.getClass(), "focusTraversalPolicyProvider", false);
        setField(term53910, term53910.getClass(), "printingThreads", null);
        setBooleanField(term53910, term53910.getClass(), "printing", false);
        setField(term53910, term53910.getClass(), "containerListener", null);
        setIntField(term53910, term53910.getClass(), "listeningChildren", 0);
        setIntField(term53910, term53910.getClass(), "listeningBoundsChildren", 0);
        setIntField(term53910, term53910.getClass(), "descendantsCount", 0);
        setField(term53910, term53910.getClass(), "preserveBackgroundColor", null);
        setIntField(term53910, term53910.getClass(), "numOfHWComponents", 0);
        setIntField(term53910, term53910.getClass(), "numOfLWComponents", 0);
        setField(term53910, term53910.getClass(), "modalComp", null);
        setField(term53910, term53910.getClass(), "modalAppContext", null);
        setIntField(term53910, term53910.getClass(), "containerSerializedDataVersion", 0);
        setField(term53910, term53910.getClass(), "peer", null);
        setField(term53910, term53910.getClass(), "parent", null);
        setField(term53910, term53910.getClass(), "appContext", null);
        setIntField(term53910, term53910.getClass(), "x", 0);
        setIntField(term53910, term53910.getClass(), "y", 0);
        setIntField(term53910, term53910.getClass(), "width", 0);
        setIntField(term53910, term53910.getClass(), "height", 0);
        setField(term53910, term53910.getClass(), "foreground", null);
        setField(term53910, term53910.getClass(), "background", null);
        setField(term53910, term53910.getClass(), "font", null);
        setField(term53910, term53910.getClass(), "peerFont", null);
        setField(term53910, term53910.getClass(), "cursor", null);
        setField(term53910, term53910.getClass(), "locale", null);
        setField(term53910, term53910.getClass(), "graphicsConfig", null);
        setField(term53910, term53910.getClass(), "bufferStrategy", null);
        setBooleanField(term53910, term53910.getClass(), "ignoreRepaint", false);
        setBooleanField(term53910, term53910.getClass(), "visible", false);
        setBooleanField(term53910, term53910.getClass(), "enabled", false);
        setBooleanField(term53910, term53910.getClass(), "valid", false);
        setField(term53910, term53910.getClass(), "dropTarget", null);
        setField(term53910, term53910.getClass(), "popups", null);
        setField(term53910, term53910.getClass(), "name", null);
        setBooleanField(term53910, term53910.getClass(), "nameExplicitlySet", false);
        setBooleanField(term53910, term53910.getClass(), "focusable", false);
        setIntField(term53910, term53910.getClass(), "isFocusTraversableOverridden", 0);
        setField(term53910, term53910.getClass(), "focusTraversalKeys", null);
        setBooleanField(term53910, term53910.getClass(), "focusTraversalKeysEnabled", false);
        setField(term53910, term53910.getClass(), "acc", null);
        setField(term53910, term53910.getClass(), "minSize", null);
        setBooleanField(term53910, term53910.getClass(), "minSizeSet", false);
        setField(term53910, term53910.getClass(), "prefSize", null);
        setBooleanField(term53910, term53910.getClass(), "prefSizeSet", false);
        setField(term53910, term53910.getClass(), "maxSize", null);
        setBooleanField(term53910, term53910.getClass(), "maxSizeSet", false);
        setField(term53910, term53910.getClass(), "componentOrientation", null);
        setBooleanField(term53910, term53910.getClass(), "newEventsOnly", false);
        setField(term53910, term53910.getClass(), "componentListener", null);
        setField(term53910, term53910.getClass(), "focusListener", null);
        setField(term53910, term53910.getClass(), "hierarchyListener", null);
        setField(term53910, term53910.getClass(), "hierarchyBoundsListener", null);
        setField(term53910, term53910.getClass(), "keyListener", null);
        setField(term53910, term53910.getClass(), "mouseListener", null);
        setField(term53910, term53910.getClass(), "mouseMotionListener", null);
        setField(term53910, term53910.getClass(), "mouseWheelListener", null);
        setField(term53910, term53910.getClass(), "inputMethodListener", null);
        setLongField(term53910, term53910.getClass(), "eventMask", 0L);
        setField(term53910, term53910.getClass(), "changeSupport", null);
        setField(term53910, term53910.getClass(), "objectLock", null);
        setBooleanField(term53910, term53910.getClass(), "isPacked", false);
        setIntField(term53910, term53910.getClass(), "boundsOp", 0);
        setField(term53910, term53910.getClass(), "compoundShape", null);
        setField(term53910, term53910.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term53910, term53910.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term53910, term53910.getClass(), "backgroundEraseDisabled", false);
        setField(term53910, term53910.getClass(), "eventCache", null);
        setBooleanField(term53910, term53910.getClass(), "coalescingEnabled", false);
        setBooleanField(term53910, term53910.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term53910, term53910.getClass(), "componentSerializedDataVersion", 0);
        setField(term53910, term53910.getClass(), "accessibleContext", null);
        term53969 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53969;
        callMethod(klass, "setCharacterWidth", argTypes, term53910, args);
    }

};


