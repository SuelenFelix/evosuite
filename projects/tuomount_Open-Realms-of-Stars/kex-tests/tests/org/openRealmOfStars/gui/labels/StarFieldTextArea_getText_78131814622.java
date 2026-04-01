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

public class StarFieldTextArea_getText_78131814622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53554;

    public StarFieldTextArea_getText_78131814622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53554 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea"));
        setBooleanField(term53554, term53554.getClass(), "autoScroll", false);
        setField(term53554, term53554.getClass(), "scrollText", null);
        setField(term53554, term53554.getClass(), "textToShow", null);
        setIntField(term53554, term53554.getClass(), "numberOfLines", 0);
        setIntField(term53554, term53554.getClass(), "currentLine", 0);
        setBooleanField(term53554, term53554.getClass(), "smoothScroll", false);
        setBooleanField(term53554, term53554.getClass(), "smoothScrollNextRow", false);
        setIntField(term53554, term53554.getClass(), "smoothScrollY", 0);
        setIntField(term53554, term53554.getClass(), "customCharWidth", 0);
        setIntField(term53554, term53554.getClass(), "rows", 0);
        setIntField(term53554, term53554.getClass(), "columns", 0);
        setIntField(term53554, term53554.getClass(), "columnWidth", 0);
        setIntField(term53554, term53554.getClass(), "rowHeight", 0);
        setBooleanField(term53554, term53554.getClass(), "wrap", false);
        setBooleanField(term53554, term53554.getClass(), "word", false);
        setField(term53554, term53554.getClass(), "model", null);
        setField(term53554, term53554.getClass(), "caret", null);
        setField(term53554, term53554.getClass(), "navigationFilter", null);
        setField(term53554, term53554.getClass(), "highlighter", null);
        setField(term53554, term53554.getClass(), "keymap", null);
        setField(term53554, term53554.getClass(), "caretEvent", null);
        setField(term53554, term53554.getClass(), "caretColor", null);
        setField(term53554, term53554.getClass(), "selectionColor", null);
        setField(term53554, term53554.getClass(), "selectedTextColor", null);
        setField(term53554, term53554.getClass(), "disabledTextColor", null);
        setBooleanField(term53554, term53554.getClass(), "editable", false);
        setField(term53554, term53554.getClass(), "margin", null);
        setCharField(term53554, term53554.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term53554, term53554.getClass(), "dragEnabled", false);
        setField(term53554, term53554.getClass(), "dropMode", null);
        setField(term53554, term53554.getClass(), "dropLocation", null);
        setField(term53554, term53554.getClass(), "inputMethodRequestsHandler", null);
        setField(term53554, term53554.getClass(), "composedTextAttribute", null);
        setField(term53554, term53554.getClass(), "composedTextContent", null);
        setField(term53554, term53554.getClass(), "composedTextStart", null);
        setField(term53554, term53554.getClass(), "composedTextEnd", null);
        setField(term53554, term53554.getClass(), "latestCommittedTextStart", null);
        setField(term53554, term53554.getClass(), "latestCommittedTextEnd", null);
        setField(term53554, term53554.getClass(), "composedTextCaret", null);
        setField(term53554, term53554.getClass(), "originalCaret", null);
        setBooleanField(term53554, term53554.getClass(), "checkedInputOverride", false);
        setBooleanField(term53554, term53554.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term53554, term53554.getClass(), "isAlignmentXSet", false);
        setFloatField(term53554, term53554.getClass(), "alignmentX", 0.0F);
        setBooleanField(term53554, term53554.getClass(), "isAlignmentYSet", false);
        setFloatField(term53554, term53554.getClass(), "alignmentY", 0.0F);
        setField(term53554, term53554.getClass(), "ui", null);
        setField(term53554, term53554.getClass(), "listenerList", null);
        setField(term53554, term53554.getClass(), "clientProperties", null);
        setField(term53554, term53554.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term53554, term53554.getClass(), "autoscrolls", false);
        setField(term53554, term53554.getClass(), "border", null);
        setIntField(term53554, term53554.getClass(), "flags", 0);
        setField(term53554, term53554.getClass(), "inputVerifier", null);
        setBooleanField(term53554, term53554.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term53554, term53554.getClass(), "paintingChild", null);
        setField(term53554, term53554.getClass(), "popupMenu", null);
        setField(term53554, term53554.getClass(), "revalidateRunnableScheduled", null);
        setField(term53554, term53554.getClass(), "focusInputMap", null);
        setField(term53554, term53554.getClass(), "ancestorInputMap", null);
        setField(term53554, term53554.getClass(), "windowInputMap", null);
        setField(term53554, term53554.getClass(), "actionMap", null);
        setField(term53554, term53554.getClass(), "aaHint", null);
        setField(term53554, term53554.getClass(), "lcdRenderingHint", null);
        setField(term53554, term53554.getClass(), "component", null);
        setField(term53554, term53554.getClass(), "layoutMgr", null);
        setField(term53554, term53554.getClass(), "dispatcher", null);
        setField(term53554, term53554.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term53554, term53554.getClass(), "focusCycleRoot", false);
        setBooleanField(term53554, term53554.getClass(), "focusTraversalPolicyProvider", false);
        setField(term53554, term53554.getClass(), "printingThreads", null);
        setBooleanField(term53554, term53554.getClass(), "printing", false);
        setField(term53554, term53554.getClass(), "containerListener", null);
        setIntField(term53554, term53554.getClass(), "listeningChildren", 0);
        setIntField(term53554, term53554.getClass(), "listeningBoundsChildren", 0);
        setIntField(term53554, term53554.getClass(), "descendantsCount", 0);
        setField(term53554, term53554.getClass(), "preserveBackgroundColor", null);
        setIntField(term53554, term53554.getClass(), "numOfHWComponents", 0);
        setIntField(term53554, term53554.getClass(), "numOfLWComponents", 0);
        setField(term53554, term53554.getClass(), "modalComp", null);
        setField(term53554, term53554.getClass(), "modalAppContext", null);
        setIntField(term53554, term53554.getClass(), "containerSerializedDataVersion", 0);
        setField(term53554, term53554.getClass(), "peer", null);
        setField(term53554, term53554.getClass(), "parent", null);
        setField(term53554, term53554.getClass(), "appContext", null);
        setIntField(term53554, term53554.getClass(), "x", 0);
        setIntField(term53554, term53554.getClass(), "y", 0);
        setIntField(term53554, term53554.getClass(), "width", 0);
        setIntField(term53554, term53554.getClass(), "height", 0);
        setField(term53554, term53554.getClass(), "foreground", null);
        setField(term53554, term53554.getClass(), "background", null);
        setField(term53554, term53554.getClass(), "font", null);
        setField(term53554, term53554.getClass(), "peerFont", null);
        setField(term53554, term53554.getClass(), "cursor", null);
        setField(term53554, term53554.getClass(), "locale", null);
        setField(term53554, term53554.getClass(), "graphicsConfig", null);
        setField(term53554, term53554.getClass(), "bufferStrategy", null);
        setBooleanField(term53554, term53554.getClass(), "ignoreRepaint", false);
        setBooleanField(term53554, term53554.getClass(), "visible", false);
        setBooleanField(term53554, term53554.getClass(), "enabled", false);
        setBooleanField(term53554, term53554.getClass(), "valid", false);
        setField(term53554, term53554.getClass(), "dropTarget", null);
        setField(term53554, term53554.getClass(), "popups", null);
        setField(term53554, term53554.getClass(), "name", null);
        setBooleanField(term53554, term53554.getClass(), "nameExplicitlySet", false);
        setBooleanField(term53554, term53554.getClass(), "focusable", false);
        setIntField(term53554, term53554.getClass(), "isFocusTraversableOverridden", 0);
        setField(term53554, term53554.getClass(), "focusTraversalKeys", null);
        setBooleanField(term53554, term53554.getClass(), "focusTraversalKeysEnabled", false);
        setField(term53554, term53554.getClass(), "acc", null);
        setField(term53554, term53554.getClass(), "minSize", null);
        setBooleanField(term53554, term53554.getClass(), "minSizeSet", false);
        setField(term53554, term53554.getClass(), "prefSize", null);
        setBooleanField(term53554, term53554.getClass(), "prefSizeSet", false);
        setField(term53554, term53554.getClass(), "maxSize", null);
        setBooleanField(term53554, term53554.getClass(), "maxSizeSet", false);
        setField(term53554, term53554.getClass(), "componentOrientation", null);
        setBooleanField(term53554, term53554.getClass(), "newEventsOnly", false);
        setField(term53554, term53554.getClass(), "componentListener", null);
        setField(term53554, term53554.getClass(), "focusListener", null);
        setField(term53554, term53554.getClass(), "hierarchyListener", null);
        setField(term53554, term53554.getClass(), "hierarchyBoundsListener", null);
        setField(term53554, term53554.getClass(), "keyListener", null);
        setField(term53554, term53554.getClass(), "mouseListener", null);
        setField(term53554, term53554.getClass(), "mouseMotionListener", null);
        setField(term53554, term53554.getClass(), "mouseWheelListener", null);
        setField(term53554, term53554.getClass(), "inputMethodListener", null);
        setLongField(term53554, term53554.getClass(), "eventMask", 0L);
        setField(term53554, term53554.getClass(), "changeSupport", null);
        setField(term53554, term53554.getClass(), "objectLock", null);
        setBooleanField(term53554, term53554.getClass(), "isPacked", false);
        setIntField(term53554, term53554.getClass(), "boundsOp", 0);
        setField(term53554, term53554.getClass(), "compoundShape", null);
        setField(term53554, term53554.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term53554, term53554.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term53554, term53554.getClass(), "backgroundEraseDisabled", false);
        setField(term53554, term53554.getClass(), "eventCache", null);
        setBooleanField(term53554, term53554.getClass(), "coalescingEnabled", false);
        setBooleanField(term53554, term53554.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term53554, term53554.getClass(), "componentSerializedDataVersion", 0);
        setField(term53554, term53554.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term53554, args);
    }

};


