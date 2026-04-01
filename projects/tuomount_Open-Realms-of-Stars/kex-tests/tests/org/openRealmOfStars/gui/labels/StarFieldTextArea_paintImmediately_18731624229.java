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

public class StarFieldTextArea_paintImmediately_18731624229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53971;
     Object term54030;
     Object term54032;
     Object term54034;
     Object term54036;

    public StarFieldTextArea_paintImmediately_18731624229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53971 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea"));
        setBooleanField(term53971, term53971.getClass(), "autoScroll", false);
        setField(term53971, term53971.getClass(), "scrollText", null);
        setField(term53971, term53971.getClass(), "textToShow", null);
        setIntField(term53971, term53971.getClass(), "numberOfLines", 0);
        setIntField(term53971, term53971.getClass(), "currentLine", 0);
        setBooleanField(term53971, term53971.getClass(), "smoothScroll", false);
        setBooleanField(term53971, term53971.getClass(), "smoothScrollNextRow", false);
        setIntField(term53971, term53971.getClass(), "smoothScrollY", 0);
        setIntField(term53971, term53971.getClass(), "customCharWidth", 0);
        setIntField(term53971, term53971.getClass(), "rows", 0);
        setIntField(term53971, term53971.getClass(), "columns", 0);
        setIntField(term53971, term53971.getClass(), "columnWidth", 0);
        setIntField(term53971, term53971.getClass(), "rowHeight", 0);
        setBooleanField(term53971, term53971.getClass(), "wrap", false);
        setBooleanField(term53971, term53971.getClass(), "word", false);
        setField(term53971, term53971.getClass(), "model", null);
        setField(term53971, term53971.getClass(), "caret", null);
        setField(term53971, term53971.getClass(), "navigationFilter", null);
        setField(term53971, term53971.getClass(), "highlighter", null);
        setField(term53971, term53971.getClass(), "keymap", null);
        setField(term53971, term53971.getClass(), "caretEvent", null);
        setField(term53971, term53971.getClass(), "caretColor", null);
        setField(term53971, term53971.getClass(), "selectionColor", null);
        setField(term53971, term53971.getClass(), "selectedTextColor", null);
        setField(term53971, term53971.getClass(), "disabledTextColor", null);
        setBooleanField(term53971, term53971.getClass(), "editable", false);
        setField(term53971, term53971.getClass(), "margin", null);
        setCharField(term53971, term53971.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term53971, term53971.getClass(), "dragEnabled", false);
        setField(term53971, term53971.getClass(), "dropMode", null);
        setField(term53971, term53971.getClass(), "dropLocation", null);
        setField(term53971, term53971.getClass(), "inputMethodRequestsHandler", null);
        setField(term53971, term53971.getClass(), "composedTextAttribute", null);
        setField(term53971, term53971.getClass(), "composedTextContent", null);
        setField(term53971, term53971.getClass(), "composedTextStart", null);
        setField(term53971, term53971.getClass(), "composedTextEnd", null);
        setField(term53971, term53971.getClass(), "latestCommittedTextStart", null);
        setField(term53971, term53971.getClass(), "latestCommittedTextEnd", null);
        setField(term53971, term53971.getClass(), "composedTextCaret", null);
        setField(term53971, term53971.getClass(), "originalCaret", null);
        setBooleanField(term53971, term53971.getClass(), "checkedInputOverride", false);
        setBooleanField(term53971, term53971.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term53971, term53971.getClass(), "isAlignmentXSet", false);
        setFloatField(term53971, term53971.getClass(), "alignmentX", 0.0F);
        setBooleanField(term53971, term53971.getClass(), "isAlignmentYSet", false);
        setFloatField(term53971, term53971.getClass(), "alignmentY", 0.0F);
        setField(term53971, term53971.getClass(), "ui", null);
        setField(term53971, term53971.getClass(), "listenerList", null);
        setField(term53971, term53971.getClass(), "clientProperties", null);
        setField(term53971, term53971.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term53971, term53971.getClass(), "autoscrolls", false);
        setField(term53971, term53971.getClass(), "border", null);
        setIntField(term53971, term53971.getClass(), "flags", 0);
        setField(term53971, term53971.getClass(), "inputVerifier", null);
        setBooleanField(term53971, term53971.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term53971, term53971.getClass(), "paintingChild", null);
        setField(term53971, term53971.getClass(), "popupMenu", null);
        setField(term53971, term53971.getClass(), "revalidateRunnableScheduled", null);
        setField(term53971, term53971.getClass(), "focusInputMap", null);
        setField(term53971, term53971.getClass(), "ancestorInputMap", null);
        setField(term53971, term53971.getClass(), "windowInputMap", null);
        setField(term53971, term53971.getClass(), "actionMap", null);
        setField(term53971, term53971.getClass(), "aaHint", null);
        setField(term53971, term53971.getClass(), "lcdRenderingHint", null);
        setField(term53971, term53971.getClass(), "component", null);
        setField(term53971, term53971.getClass(), "layoutMgr", null);
        setField(term53971, term53971.getClass(), "dispatcher", null);
        setField(term53971, term53971.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term53971, term53971.getClass(), "focusCycleRoot", false);
        setBooleanField(term53971, term53971.getClass(), "focusTraversalPolicyProvider", false);
        setField(term53971, term53971.getClass(), "printingThreads", null);
        setBooleanField(term53971, term53971.getClass(), "printing", false);
        setField(term53971, term53971.getClass(), "containerListener", null);
        setIntField(term53971, term53971.getClass(), "listeningChildren", 0);
        setIntField(term53971, term53971.getClass(), "listeningBoundsChildren", 0);
        setIntField(term53971, term53971.getClass(), "descendantsCount", 0);
        setField(term53971, term53971.getClass(), "preserveBackgroundColor", null);
        setIntField(term53971, term53971.getClass(), "numOfHWComponents", 0);
        setIntField(term53971, term53971.getClass(), "numOfLWComponents", 0);
        setField(term53971, term53971.getClass(), "modalComp", null);
        setField(term53971, term53971.getClass(), "modalAppContext", null);
        setIntField(term53971, term53971.getClass(), "containerSerializedDataVersion", 0);
        setField(term53971, term53971.getClass(), "peer", null);
        setField(term53971, term53971.getClass(), "parent", null);
        setField(term53971, term53971.getClass(), "appContext", null);
        setIntField(term53971, term53971.getClass(), "x", 0);
        setIntField(term53971, term53971.getClass(), "y", 0);
        setIntField(term53971, term53971.getClass(), "width", 0);
        setIntField(term53971, term53971.getClass(), "height", 0);
        setField(term53971, term53971.getClass(), "foreground", null);
        setField(term53971, term53971.getClass(), "background", null);
        setField(term53971, term53971.getClass(), "font", null);
        setField(term53971, term53971.getClass(), "peerFont", null);
        setField(term53971, term53971.getClass(), "cursor", null);
        setField(term53971, term53971.getClass(), "locale", null);
        setField(term53971, term53971.getClass(), "graphicsConfig", null);
        setField(term53971, term53971.getClass(), "bufferStrategy", null);
        setBooleanField(term53971, term53971.getClass(), "ignoreRepaint", false);
        setBooleanField(term53971, term53971.getClass(), "visible", false);
        setBooleanField(term53971, term53971.getClass(), "enabled", false);
        setBooleanField(term53971, term53971.getClass(), "valid", false);
        setField(term53971, term53971.getClass(), "dropTarget", null);
        setField(term53971, term53971.getClass(), "popups", null);
        setField(term53971, term53971.getClass(), "name", null);
        setBooleanField(term53971, term53971.getClass(), "nameExplicitlySet", false);
        setBooleanField(term53971, term53971.getClass(), "focusable", false);
        setIntField(term53971, term53971.getClass(), "isFocusTraversableOverridden", 0);
        setField(term53971, term53971.getClass(), "focusTraversalKeys", null);
        setBooleanField(term53971, term53971.getClass(), "focusTraversalKeysEnabled", false);
        setField(term53971, term53971.getClass(), "acc", null);
        setField(term53971, term53971.getClass(), "minSize", null);
        setBooleanField(term53971, term53971.getClass(), "minSizeSet", false);
        setField(term53971, term53971.getClass(), "prefSize", null);
        setBooleanField(term53971, term53971.getClass(), "prefSizeSet", false);
        setField(term53971, term53971.getClass(), "maxSize", null);
        setBooleanField(term53971, term53971.getClass(), "maxSizeSet", false);
        setField(term53971, term53971.getClass(), "componentOrientation", null);
        setBooleanField(term53971, term53971.getClass(), "newEventsOnly", false);
        setField(term53971, term53971.getClass(), "componentListener", null);
        setField(term53971, term53971.getClass(), "focusListener", null);
        setField(term53971, term53971.getClass(), "hierarchyListener", null);
        setField(term53971, term53971.getClass(), "hierarchyBoundsListener", null);
        setField(term53971, term53971.getClass(), "keyListener", null);
        setField(term53971, term53971.getClass(), "mouseListener", null);
        setField(term53971, term53971.getClass(), "mouseMotionListener", null);
        setField(term53971, term53971.getClass(), "mouseWheelListener", null);
        setField(term53971, term53971.getClass(), "inputMethodListener", null);
        setLongField(term53971, term53971.getClass(), "eventMask", 0L);
        setField(term53971, term53971.getClass(), "changeSupport", null);
        setField(term53971, term53971.getClass(), "objectLock", null);
        setBooleanField(term53971, term53971.getClass(), "isPacked", false);
        setIntField(term53971, term53971.getClass(), "boundsOp", 0);
        setField(term53971, term53971.getClass(), "compoundShape", null);
        setField(term53971, term53971.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term53971, term53971.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term53971, term53971.getClass(), "backgroundEraseDisabled", false);
        setField(term53971, term53971.getClass(), "eventCache", null);
        setBooleanField(term53971, term53971.getClass(), "coalescingEnabled", false);
        setBooleanField(term53971, term53971.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term53971, term53971.getClass(), "componentSerializedDataVersion", 0);
        setField(term53971, term53971.getClass(), "accessibleContext", null);
        term54030 = new Integer(0);
        term54032 = new Integer(0);
        term54034 = new Integer(0);
        term54036 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term54030;
        args[1] = term54032;
        args[2] = term54034;
        args[3] = term54036;
        callMethod(klass, "paintImmediately", argTypes, term53971, args);
    }

};


