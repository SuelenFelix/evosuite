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

public class StarFieldTextArea_getPrevLine_88286634726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53790;

    public StarFieldTextArea_getPrevLine_88286634726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53790 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea"));
        setBooleanField(term53790, term53790.getClass(), "autoScroll", false);
        setField(term53790, term53790.getClass(), "scrollText", null);
        setField(term53790, term53790.getClass(), "textToShow", null);
        setIntField(term53790, term53790.getClass(), "numberOfLines", 0);
        setIntField(term53790, term53790.getClass(), "currentLine", 0);
        setBooleanField(term53790, term53790.getClass(), "smoothScroll", false);
        setBooleanField(term53790, term53790.getClass(), "smoothScrollNextRow", false);
        setIntField(term53790, term53790.getClass(), "smoothScrollY", 0);
        setIntField(term53790, term53790.getClass(), "customCharWidth", 0);
        setIntField(term53790, term53790.getClass(), "rows", 0);
        setIntField(term53790, term53790.getClass(), "columns", 0);
        setIntField(term53790, term53790.getClass(), "columnWidth", 0);
        setIntField(term53790, term53790.getClass(), "rowHeight", 0);
        setBooleanField(term53790, term53790.getClass(), "wrap", false);
        setBooleanField(term53790, term53790.getClass(), "word", false);
        setField(term53790, term53790.getClass(), "model", null);
        setField(term53790, term53790.getClass(), "caret", null);
        setField(term53790, term53790.getClass(), "navigationFilter", null);
        setField(term53790, term53790.getClass(), "highlighter", null);
        setField(term53790, term53790.getClass(), "keymap", null);
        setField(term53790, term53790.getClass(), "caretEvent", null);
        setField(term53790, term53790.getClass(), "caretColor", null);
        setField(term53790, term53790.getClass(), "selectionColor", null);
        setField(term53790, term53790.getClass(), "selectedTextColor", null);
        setField(term53790, term53790.getClass(), "disabledTextColor", null);
        setBooleanField(term53790, term53790.getClass(), "editable", false);
        setField(term53790, term53790.getClass(), "margin", null);
        setCharField(term53790, term53790.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term53790, term53790.getClass(), "dragEnabled", false);
        setField(term53790, term53790.getClass(), "dropMode", null);
        setField(term53790, term53790.getClass(), "dropLocation", null);
        setField(term53790, term53790.getClass(), "inputMethodRequestsHandler", null);
        setField(term53790, term53790.getClass(), "composedTextAttribute", null);
        setField(term53790, term53790.getClass(), "composedTextContent", null);
        setField(term53790, term53790.getClass(), "composedTextStart", null);
        setField(term53790, term53790.getClass(), "composedTextEnd", null);
        setField(term53790, term53790.getClass(), "latestCommittedTextStart", null);
        setField(term53790, term53790.getClass(), "latestCommittedTextEnd", null);
        setField(term53790, term53790.getClass(), "composedTextCaret", null);
        setField(term53790, term53790.getClass(), "originalCaret", null);
        setBooleanField(term53790, term53790.getClass(), "checkedInputOverride", false);
        setBooleanField(term53790, term53790.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term53790, term53790.getClass(), "isAlignmentXSet", false);
        setFloatField(term53790, term53790.getClass(), "alignmentX", 0.0F);
        setBooleanField(term53790, term53790.getClass(), "isAlignmentYSet", false);
        setFloatField(term53790, term53790.getClass(), "alignmentY", 0.0F);
        setField(term53790, term53790.getClass(), "ui", null);
        setField(term53790, term53790.getClass(), "listenerList", null);
        setField(term53790, term53790.getClass(), "clientProperties", null);
        setField(term53790, term53790.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term53790, term53790.getClass(), "autoscrolls", false);
        setField(term53790, term53790.getClass(), "border", null);
        setIntField(term53790, term53790.getClass(), "flags", 0);
        setField(term53790, term53790.getClass(), "inputVerifier", null);
        setBooleanField(term53790, term53790.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term53790, term53790.getClass(), "paintingChild", null);
        setField(term53790, term53790.getClass(), "popupMenu", null);
        setField(term53790, term53790.getClass(), "revalidateRunnableScheduled", null);
        setField(term53790, term53790.getClass(), "focusInputMap", null);
        setField(term53790, term53790.getClass(), "ancestorInputMap", null);
        setField(term53790, term53790.getClass(), "windowInputMap", null);
        setField(term53790, term53790.getClass(), "actionMap", null);
        setField(term53790, term53790.getClass(), "aaHint", null);
        setField(term53790, term53790.getClass(), "lcdRenderingHint", null);
        setField(term53790, term53790.getClass(), "component", null);
        setField(term53790, term53790.getClass(), "layoutMgr", null);
        setField(term53790, term53790.getClass(), "dispatcher", null);
        setField(term53790, term53790.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term53790, term53790.getClass(), "focusCycleRoot", false);
        setBooleanField(term53790, term53790.getClass(), "focusTraversalPolicyProvider", false);
        setField(term53790, term53790.getClass(), "printingThreads", null);
        setBooleanField(term53790, term53790.getClass(), "printing", false);
        setField(term53790, term53790.getClass(), "containerListener", null);
        setIntField(term53790, term53790.getClass(), "listeningChildren", 0);
        setIntField(term53790, term53790.getClass(), "listeningBoundsChildren", 0);
        setIntField(term53790, term53790.getClass(), "descendantsCount", 0);
        setField(term53790, term53790.getClass(), "preserveBackgroundColor", null);
        setIntField(term53790, term53790.getClass(), "numOfHWComponents", 0);
        setIntField(term53790, term53790.getClass(), "numOfLWComponents", 0);
        setField(term53790, term53790.getClass(), "modalComp", null);
        setField(term53790, term53790.getClass(), "modalAppContext", null);
        setIntField(term53790, term53790.getClass(), "containerSerializedDataVersion", 0);
        setField(term53790, term53790.getClass(), "peer", null);
        setField(term53790, term53790.getClass(), "parent", null);
        setField(term53790, term53790.getClass(), "appContext", null);
        setIntField(term53790, term53790.getClass(), "x", 0);
        setIntField(term53790, term53790.getClass(), "y", 0);
        setIntField(term53790, term53790.getClass(), "width", 0);
        setIntField(term53790, term53790.getClass(), "height", 0);
        setField(term53790, term53790.getClass(), "foreground", null);
        setField(term53790, term53790.getClass(), "background", null);
        setField(term53790, term53790.getClass(), "font", null);
        setField(term53790, term53790.getClass(), "peerFont", null);
        setField(term53790, term53790.getClass(), "cursor", null);
        setField(term53790, term53790.getClass(), "locale", null);
        setField(term53790, term53790.getClass(), "graphicsConfig", null);
        setField(term53790, term53790.getClass(), "bufferStrategy", null);
        setBooleanField(term53790, term53790.getClass(), "ignoreRepaint", false);
        setBooleanField(term53790, term53790.getClass(), "visible", false);
        setBooleanField(term53790, term53790.getClass(), "enabled", false);
        setBooleanField(term53790, term53790.getClass(), "valid", false);
        setField(term53790, term53790.getClass(), "dropTarget", null);
        setField(term53790, term53790.getClass(), "popups", null);
        setField(term53790, term53790.getClass(), "name", null);
        setBooleanField(term53790, term53790.getClass(), "nameExplicitlySet", false);
        setBooleanField(term53790, term53790.getClass(), "focusable", false);
        setIntField(term53790, term53790.getClass(), "isFocusTraversableOverridden", 0);
        setField(term53790, term53790.getClass(), "focusTraversalKeys", null);
        setBooleanField(term53790, term53790.getClass(), "focusTraversalKeysEnabled", false);
        setField(term53790, term53790.getClass(), "acc", null);
        setField(term53790, term53790.getClass(), "minSize", null);
        setBooleanField(term53790, term53790.getClass(), "minSizeSet", false);
        setField(term53790, term53790.getClass(), "prefSize", null);
        setBooleanField(term53790, term53790.getClass(), "prefSizeSet", false);
        setField(term53790, term53790.getClass(), "maxSize", null);
        setBooleanField(term53790, term53790.getClass(), "maxSizeSet", false);
        setField(term53790, term53790.getClass(), "componentOrientation", null);
        setBooleanField(term53790, term53790.getClass(), "newEventsOnly", false);
        setField(term53790, term53790.getClass(), "componentListener", null);
        setField(term53790, term53790.getClass(), "focusListener", null);
        setField(term53790, term53790.getClass(), "hierarchyListener", null);
        setField(term53790, term53790.getClass(), "hierarchyBoundsListener", null);
        setField(term53790, term53790.getClass(), "keyListener", null);
        setField(term53790, term53790.getClass(), "mouseListener", null);
        setField(term53790, term53790.getClass(), "mouseMotionListener", null);
        setField(term53790, term53790.getClass(), "mouseWheelListener", null);
        setField(term53790, term53790.getClass(), "inputMethodListener", null);
        setLongField(term53790, term53790.getClass(), "eventMask", 0L);
        setField(term53790, term53790.getClass(), "changeSupport", null);
        setField(term53790, term53790.getClass(), "objectLock", null);
        setBooleanField(term53790, term53790.getClass(), "isPacked", false);
        setIntField(term53790, term53790.getClass(), "boundsOp", 0);
        setField(term53790, term53790.getClass(), "compoundShape", null);
        setField(term53790, term53790.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term53790, term53790.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term53790, term53790.getClass(), "backgroundEraseDisabled", false);
        setField(term53790, term53790.getClass(), "eventCache", null);
        setBooleanField(term53790, term53790.getClass(), "coalescingEnabled", false);
        setBooleanField(term53790, term53790.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term53790, term53790.getClass(), "componentSerializedDataVersion", 0);
        setField(term53790, term53790.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrevLine", argTypes, term53790, args);
    }

};


