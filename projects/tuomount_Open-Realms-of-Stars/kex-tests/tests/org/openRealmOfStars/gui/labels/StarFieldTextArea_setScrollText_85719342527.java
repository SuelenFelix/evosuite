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

public class StarFieldTextArea_setScrollText_85719342527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53849;
     Object term53908;

    public StarFieldTextArea_setScrollText_85719342527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53849 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea"));
        setBooleanField(term53849, term53849.getClass(), "autoScroll", false);
        setField(term53849, term53849.getClass(), "scrollText", null);
        setField(term53849, term53849.getClass(), "textToShow", null);
        setIntField(term53849, term53849.getClass(), "numberOfLines", 0);
        setIntField(term53849, term53849.getClass(), "currentLine", 0);
        setBooleanField(term53849, term53849.getClass(), "smoothScroll", false);
        setBooleanField(term53849, term53849.getClass(), "smoothScrollNextRow", false);
        setIntField(term53849, term53849.getClass(), "smoothScrollY", 0);
        setIntField(term53849, term53849.getClass(), "customCharWidth", 0);
        setIntField(term53849, term53849.getClass(), "rows", 0);
        setIntField(term53849, term53849.getClass(), "columns", 0);
        setIntField(term53849, term53849.getClass(), "columnWidth", 0);
        setIntField(term53849, term53849.getClass(), "rowHeight", 0);
        setBooleanField(term53849, term53849.getClass(), "wrap", false);
        setBooleanField(term53849, term53849.getClass(), "word", false);
        setField(term53849, term53849.getClass(), "model", null);
        setField(term53849, term53849.getClass(), "caret", null);
        setField(term53849, term53849.getClass(), "navigationFilter", null);
        setField(term53849, term53849.getClass(), "highlighter", null);
        setField(term53849, term53849.getClass(), "keymap", null);
        setField(term53849, term53849.getClass(), "caretEvent", null);
        setField(term53849, term53849.getClass(), "caretColor", null);
        setField(term53849, term53849.getClass(), "selectionColor", null);
        setField(term53849, term53849.getClass(), "selectedTextColor", null);
        setField(term53849, term53849.getClass(), "disabledTextColor", null);
        setBooleanField(term53849, term53849.getClass(), "editable", false);
        setField(term53849, term53849.getClass(), "margin", null);
        setCharField(term53849, term53849.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term53849, term53849.getClass(), "dragEnabled", false);
        setField(term53849, term53849.getClass(), "dropMode", null);
        setField(term53849, term53849.getClass(), "dropLocation", null);
        setField(term53849, term53849.getClass(), "inputMethodRequestsHandler", null);
        setField(term53849, term53849.getClass(), "composedTextAttribute", null);
        setField(term53849, term53849.getClass(), "composedTextContent", null);
        setField(term53849, term53849.getClass(), "composedTextStart", null);
        setField(term53849, term53849.getClass(), "composedTextEnd", null);
        setField(term53849, term53849.getClass(), "latestCommittedTextStart", null);
        setField(term53849, term53849.getClass(), "latestCommittedTextEnd", null);
        setField(term53849, term53849.getClass(), "composedTextCaret", null);
        setField(term53849, term53849.getClass(), "originalCaret", null);
        setBooleanField(term53849, term53849.getClass(), "checkedInputOverride", false);
        setBooleanField(term53849, term53849.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term53849, term53849.getClass(), "isAlignmentXSet", false);
        setFloatField(term53849, term53849.getClass(), "alignmentX", 0.0F);
        setBooleanField(term53849, term53849.getClass(), "isAlignmentYSet", false);
        setFloatField(term53849, term53849.getClass(), "alignmentY", 0.0F);
        setField(term53849, term53849.getClass(), "ui", null);
        setField(term53849, term53849.getClass(), "listenerList", null);
        setField(term53849, term53849.getClass(), "clientProperties", null);
        setField(term53849, term53849.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term53849, term53849.getClass(), "autoscrolls", false);
        setField(term53849, term53849.getClass(), "border", null);
        setIntField(term53849, term53849.getClass(), "flags", 0);
        setField(term53849, term53849.getClass(), "inputVerifier", null);
        setBooleanField(term53849, term53849.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term53849, term53849.getClass(), "paintingChild", null);
        setField(term53849, term53849.getClass(), "popupMenu", null);
        setField(term53849, term53849.getClass(), "revalidateRunnableScheduled", null);
        setField(term53849, term53849.getClass(), "focusInputMap", null);
        setField(term53849, term53849.getClass(), "ancestorInputMap", null);
        setField(term53849, term53849.getClass(), "windowInputMap", null);
        setField(term53849, term53849.getClass(), "actionMap", null);
        setField(term53849, term53849.getClass(), "aaHint", null);
        setField(term53849, term53849.getClass(), "lcdRenderingHint", null);
        setField(term53849, term53849.getClass(), "component", null);
        setField(term53849, term53849.getClass(), "layoutMgr", null);
        setField(term53849, term53849.getClass(), "dispatcher", null);
        setField(term53849, term53849.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term53849, term53849.getClass(), "focusCycleRoot", false);
        setBooleanField(term53849, term53849.getClass(), "focusTraversalPolicyProvider", false);
        setField(term53849, term53849.getClass(), "printingThreads", null);
        setBooleanField(term53849, term53849.getClass(), "printing", false);
        setField(term53849, term53849.getClass(), "containerListener", null);
        setIntField(term53849, term53849.getClass(), "listeningChildren", 0);
        setIntField(term53849, term53849.getClass(), "listeningBoundsChildren", 0);
        setIntField(term53849, term53849.getClass(), "descendantsCount", 0);
        setField(term53849, term53849.getClass(), "preserveBackgroundColor", null);
        setIntField(term53849, term53849.getClass(), "numOfHWComponents", 0);
        setIntField(term53849, term53849.getClass(), "numOfLWComponents", 0);
        setField(term53849, term53849.getClass(), "modalComp", null);
        setField(term53849, term53849.getClass(), "modalAppContext", null);
        setIntField(term53849, term53849.getClass(), "containerSerializedDataVersion", 0);
        setField(term53849, term53849.getClass(), "peer", null);
        setField(term53849, term53849.getClass(), "parent", null);
        setField(term53849, term53849.getClass(), "appContext", null);
        setIntField(term53849, term53849.getClass(), "x", 0);
        setIntField(term53849, term53849.getClass(), "y", 0);
        setIntField(term53849, term53849.getClass(), "width", 0);
        setIntField(term53849, term53849.getClass(), "height", 0);
        setField(term53849, term53849.getClass(), "foreground", null);
        setField(term53849, term53849.getClass(), "background", null);
        setField(term53849, term53849.getClass(), "font", null);
        setField(term53849, term53849.getClass(), "peerFont", null);
        setField(term53849, term53849.getClass(), "cursor", null);
        setField(term53849, term53849.getClass(), "locale", null);
        setField(term53849, term53849.getClass(), "graphicsConfig", null);
        setField(term53849, term53849.getClass(), "bufferStrategy", null);
        setBooleanField(term53849, term53849.getClass(), "ignoreRepaint", false);
        setBooleanField(term53849, term53849.getClass(), "visible", false);
        setBooleanField(term53849, term53849.getClass(), "enabled", false);
        setBooleanField(term53849, term53849.getClass(), "valid", false);
        setField(term53849, term53849.getClass(), "dropTarget", null);
        setField(term53849, term53849.getClass(), "popups", null);
        setField(term53849, term53849.getClass(), "name", null);
        setBooleanField(term53849, term53849.getClass(), "nameExplicitlySet", false);
        setBooleanField(term53849, term53849.getClass(), "focusable", false);
        setIntField(term53849, term53849.getClass(), "isFocusTraversableOverridden", 0);
        setField(term53849, term53849.getClass(), "focusTraversalKeys", null);
        setBooleanField(term53849, term53849.getClass(), "focusTraversalKeysEnabled", false);
        setField(term53849, term53849.getClass(), "acc", null);
        setField(term53849, term53849.getClass(), "minSize", null);
        setBooleanField(term53849, term53849.getClass(), "minSizeSet", false);
        setField(term53849, term53849.getClass(), "prefSize", null);
        setBooleanField(term53849, term53849.getClass(), "prefSizeSet", false);
        setField(term53849, term53849.getClass(), "maxSize", null);
        setBooleanField(term53849, term53849.getClass(), "maxSizeSet", false);
        setField(term53849, term53849.getClass(), "componentOrientation", null);
        setBooleanField(term53849, term53849.getClass(), "newEventsOnly", false);
        setField(term53849, term53849.getClass(), "componentListener", null);
        setField(term53849, term53849.getClass(), "focusListener", null);
        setField(term53849, term53849.getClass(), "hierarchyListener", null);
        setField(term53849, term53849.getClass(), "hierarchyBoundsListener", null);
        setField(term53849, term53849.getClass(), "keyListener", null);
        setField(term53849, term53849.getClass(), "mouseListener", null);
        setField(term53849, term53849.getClass(), "mouseMotionListener", null);
        setField(term53849, term53849.getClass(), "mouseWheelListener", null);
        setField(term53849, term53849.getClass(), "inputMethodListener", null);
        setLongField(term53849, term53849.getClass(), "eventMask", 0L);
        setField(term53849, term53849.getClass(), "changeSupport", null);
        setField(term53849, term53849.getClass(), "objectLock", null);
        setBooleanField(term53849, term53849.getClass(), "isPacked", false);
        setIntField(term53849, term53849.getClass(), "boundsOp", 0);
        setField(term53849, term53849.getClass(), "compoundShape", null);
        setField(term53849, term53849.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term53849, term53849.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term53849, term53849.getClass(), "backgroundEraseDisabled", false);
        setField(term53849, term53849.getClass(), "eventCache", null);
        setBooleanField(term53849, term53849.getClass(), "coalescingEnabled", false);
        setBooleanField(term53849, term53849.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term53849, term53849.getClass(), "componentSerializedDataVersion", 0);
        setField(term53849, term53849.getClass(), "accessibleContext", null);
        term53908 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term53908;
        callMethod(klass, "setScrollText", argTypes, term53849, args);
    }

};


