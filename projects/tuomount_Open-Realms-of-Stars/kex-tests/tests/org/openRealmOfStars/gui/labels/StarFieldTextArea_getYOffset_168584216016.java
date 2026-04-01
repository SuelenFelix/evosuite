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

public class StarFieldTextArea_getYOffset_168584216016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53371;

    public StarFieldTextArea_getYOffset_168584216016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53371 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea"));
        setBooleanField(term53371, term53371.getClass(), "autoScroll", false);
        setField(term53371, term53371.getClass(), "scrollText", null);
        setField(term53371, term53371.getClass(), "textToShow", null);
        setIntField(term53371, term53371.getClass(), "numberOfLines", 0);
        setIntField(term53371, term53371.getClass(), "currentLine", 0);
        setBooleanField(term53371, term53371.getClass(), "smoothScroll", false);
        setBooleanField(term53371, term53371.getClass(), "smoothScrollNextRow", false);
        setIntField(term53371, term53371.getClass(), "smoothScrollY", 0);
        setIntField(term53371, term53371.getClass(), "customCharWidth", 0);
        setIntField(term53371, term53371.getClass(), "rows", 0);
        setIntField(term53371, term53371.getClass(), "columns", 0);
        setIntField(term53371, term53371.getClass(), "columnWidth", 0);
        setIntField(term53371, term53371.getClass(), "rowHeight", 0);
        setBooleanField(term53371, term53371.getClass(), "wrap", false);
        setBooleanField(term53371, term53371.getClass(), "word", false);
        setField(term53371, term53371.getClass(), "model", null);
        setField(term53371, term53371.getClass(), "caret", null);
        setField(term53371, term53371.getClass(), "navigationFilter", null);
        setField(term53371, term53371.getClass(), "highlighter", null);
        setField(term53371, term53371.getClass(), "keymap", null);
        setField(term53371, term53371.getClass(), "caretEvent", null);
        setField(term53371, term53371.getClass(), "caretColor", null);
        setField(term53371, term53371.getClass(), "selectionColor", null);
        setField(term53371, term53371.getClass(), "selectedTextColor", null);
        setField(term53371, term53371.getClass(), "disabledTextColor", null);
        setBooleanField(term53371, term53371.getClass(), "editable", false);
        setField(term53371, term53371.getClass(), "margin", null);
        setCharField(term53371, term53371.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term53371, term53371.getClass(), "dragEnabled", false);
        setField(term53371, term53371.getClass(), "dropMode", null);
        setField(term53371, term53371.getClass(), "dropLocation", null);
        setField(term53371, term53371.getClass(), "inputMethodRequestsHandler", null);
        setField(term53371, term53371.getClass(), "composedTextAttribute", null);
        setField(term53371, term53371.getClass(), "composedTextContent", null);
        setField(term53371, term53371.getClass(), "composedTextStart", null);
        setField(term53371, term53371.getClass(), "composedTextEnd", null);
        setField(term53371, term53371.getClass(), "latestCommittedTextStart", null);
        setField(term53371, term53371.getClass(), "latestCommittedTextEnd", null);
        setField(term53371, term53371.getClass(), "composedTextCaret", null);
        setField(term53371, term53371.getClass(), "originalCaret", null);
        setBooleanField(term53371, term53371.getClass(), "checkedInputOverride", false);
        setBooleanField(term53371, term53371.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term53371, term53371.getClass(), "isAlignmentXSet", false);
        setFloatField(term53371, term53371.getClass(), "alignmentX", 0.0F);
        setBooleanField(term53371, term53371.getClass(), "isAlignmentYSet", false);
        setFloatField(term53371, term53371.getClass(), "alignmentY", 0.0F);
        setField(term53371, term53371.getClass(), "ui", null);
        setField(term53371, term53371.getClass(), "listenerList", null);
        setField(term53371, term53371.getClass(), "clientProperties", null);
        setField(term53371, term53371.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term53371, term53371.getClass(), "autoscrolls", false);
        setField(term53371, term53371.getClass(), "border", null);
        setIntField(term53371, term53371.getClass(), "flags", 0);
        setField(term53371, term53371.getClass(), "inputVerifier", null);
        setBooleanField(term53371, term53371.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term53371, term53371.getClass(), "paintingChild", null);
        setField(term53371, term53371.getClass(), "popupMenu", null);
        setField(term53371, term53371.getClass(), "revalidateRunnableScheduled", null);
        setField(term53371, term53371.getClass(), "focusInputMap", null);
        setField(term53371, term53371.getClass(), "ancestorInputMap", null);
        setField(term53371, term53371.getClass(), "windowInputMap", null);
        setField(term53371, term53371.getClass(), "actionMap", null);
        setField(term53371, term53371.getClass(), "aaHint", null);
        setField(term53371, term53371.getClass(), "lcdRenderingHint", null);
        setField(term53371, term53371.getClass(), "component", null);
        setField(term53371, term53371.getClass(), "layoutMgr", null);
        setField(term53371, term53371.getClass(), "dispatcher", null);
        setField(term53371, term53371.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term53371, term53371.getClass(), "focusCycleRoot", false);
        setBooleanField(term53371, term53371.getClass(), "focusTraversalPolicyProvider", false);
        setField(term53371, term53371.getClass(), "printingThreads", null);
        setBooleanField(term53371, term53371.getClass(), "printing", false);
        setField(term53371, term53371.getClass(), "containerListener", null);
        setIntField(term53371, term53371.getClass(), "listeningChildren", 0);
        setIntField(term53371, term53371.getClass(), "listeningBoundsChildren", 0);
        setIntField(term53371, term53371.getClass(), "descendantsCount", 0);
        setField(term53371, term53371.getClass(), "preserveBackgroundColor", null);
        setIntField(term53371, term53371.getClass(), "numOfHWComponents", 0);
        setIntField(term53371, term53371.getClass(), "numOfLWComponents", 0);
        setField(term53371, term53371.getClass(), "modalComp", null);
        setField(term53371, term53371.getClass(), "modalAppContext", null);
        setIntField(term53371, term53371.getClass(), "containerSerializedDataVersion", 0);
        setField(term53371, term53371.getClass(), "peer", null);
        setField(term53371, term53371.getClass(), "parent", null);
        setField(term53371, term53371.getClass(), "appContext", null);
        setIntField(term53371, term53371.getClass(), "x", 0);
        setIntField(term53371, term53371.getClass(), "y", 0);
        setIntField(term53371, term53371.getClass(), "width", 0);
        setIntField(term53371, term53371.getClass(), "height", 0);
        setField(term53371, term53371.getClass(), "foreground", null);
        setField(term53371, term53371.getClass(), "background", null);
        setField(term53371, term53371.getClass(), "font", null);
        setField(term53371, term53371.getClass(), "peerFont", null);
        setField(term53371, term53371.getClass(), "cursor", null);
        setField(term53371, term53371.getClass(), "locale", null);
        setField(term53371, term53371.getClass(), "graphicsConfig", null);
        setField(term53371, term53371.getClass(), "bufferStrategy", null);
        setBooleanField(term53371, term53371.getClass(), "ignoreRepaint", false);
        setBooleanField(term53371, term53371.getClass(), "visible", false);
        setBooleanField(term53371, term53371.getClass(), "enabled", false);
        setBooleanField(term53371, term53371.getClass(), "valid", false);
        setField(term53371, term53371.getClass(), "dropTarget", null);
        setField(term53371, term53371.getClass(), "popups", null);
        setField(term53371, term53371.getClass(), "name", null);
        setBooleanField(term53371, term53371.getClass(), "nameExplicitlySet", false);
        setBooleanField(term53371, term53371.getClass(), "focusable", false);
        setIntField(term53371, term53371.getClass(), "isFocusTraversableOverridden", 0);
        setField(term53371, term53371.getClass(), "focusTraversalKeys", null);
        setBooleanField(term53371, term53371.getClass(), "focusTraversalKeysEnabled", false);
        setField(term53371, term53371.getClass(), "acc", null);
        setField(term53371, term53371.getClass(), "minSize", null);
        setBooleanField(term53371, term53371.getClass(), "minSizeSet", false);
        setField(term53371, term53371.getClass(), "prefSize", null);
        setBooleanField(term53371, term53371.getClass(), "prefSizeSet", false);
        setField(term53371, term53371.getClass(), "maxSize", null);
        setBooleanField(term53371, term53371.getClass(), "maxSizeSet", false);
        setField(term53371, term53371.getClass(), "componentOrientation", null);
        setBooleanField(term53371, term53371.getClass(), "newEventsOnly", false);
        setField(term53371, term53371.getClass(), "componentListener", null);
        setField(term53371, term53371.getClass(), "focusListener", null);
        setField(term53371, term53371.getClass(), "hierarchyListener", null);
        setField(term53371, term53371.getClass(), "hierarchyBoundsListener", null);
        setField(term53371, term53371.getClass(), "keyListener", null);
        setField(term53371, term53371.getClass(), "mouseListener", null);
        setField(term53371, term53371.getClass(), "mouseMotionListener", null);
        setField(term53371, term53371.getClass(), "mouseWheelListener", null);
        setField(term53371, term53371.getClass(), "inputMethodListener", null);
        setLongField(term53371, term53371.getClass(), "eventMask", 0L);
        setField(term53371, term53371.getClass(), "changeSupport", null);
        setField(term53371, term53371.getClass(), "objectLock", null);
        setBooleanField(term53371, term53371.getClass(), "isPacked", false);
        setIntField(term53371, term53371.getClass(), "boundsOp", 0);
        setField(term53371, term53371.getClass(), "compoundShape", null);
        setField(term53371, term53371.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term53371, term53371.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term53371, term53371.getClass(), "backgroundEraseDisabled", false);
        setField(term53371, term53371.getClass(), "eventCache", null);
        setBooleanField(term53371, term53371.getClass(), "coalescingEnabled", false);
        setBooleanField(term53371, term53371.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term53371, term53371.getClass(), "componentSerializedDataVersion", 0);
        setField(term53371, term53371.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYOffset", argTypes, term53371, args);
    }

};


