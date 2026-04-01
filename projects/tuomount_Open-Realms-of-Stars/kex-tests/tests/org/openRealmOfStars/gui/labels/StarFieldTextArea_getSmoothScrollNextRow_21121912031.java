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

public class StarFieldTextArea_getSmoothScrollNextRow_21121912031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54097;

    public StarFieldTextArea_getSmoothScrollNextRow_21121912031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54097 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea"));
        setBooleanField(term54097, term54097.getClass(), "autoScroll", false);
        setField(term54097, term54097.getClass(), "scrollText", null);
        setField(term54097, term54097.getClass(), "textToShow", null);
        setIntField(term54097, term54097.getClass(), "numberOfLines", 0);
        setIntField(term54097, term54097.getClass(), "currentLine", 0);
        setBooleanField(term54097, term54097.getClass(), "smoothScroll", false);
        setBooleanField(term54097, term54097.getClass(), "smoothScrollNextRow", false);
        setIntField(term54097, term54097.getClass(), "smoothScrollY", 0);
        setIntField(term54097, term54097.getClass(), "customCharWidth", 0);
        setIntField(term54097, term54097.getClass(), "rows", 0);
        setIntField(term54097, term54097.getClass(), "columns", 0);
        setIntField(term54097, term54097.getClass(), "columnWidth", 0);
        setIntField(term54097, term54097.getClass(), "rowHeight", 0);
        setBooleanField(term54097, term54097.getClass(), "wrap", false);
        setBooleanField(term54097, term54097.getClass(), "word", false);
        setField(term54097, term54097.getClass(), "model", null);
        setField(term54097, term54097.getClass(), "caret", null);
        setField(term54097, term54097.getClass(), "navigationFilter", null);
        setField(term54097, term54097.getClass(), "highlighter", null);
        setField(term54097, term54097.getClass(), "keymap", null);
        setField(term54097, term54097.getClass(), "caretEvent", null);
        setField(term54097, term54097.getClass(), "caretColor", null);
        setField(term54097, term54097.getClass(), "selectionColor", null);
        setField(term54097, term54097.getClass(), "selectedTextColor", null);
        setField(term54097, term54097.getClass(), "disabledTextColor", null);
        setBooleanField(term54097, term54097.getClass(), "editable", false);
        setField(term54097, term54097.getClass(), "margin", null);
        setCharField(term54097, term54097.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term54097, term54097.getClass(), "dragEnabled", false);
        setField(term54097, term54097.getClass(), "dropMode", null);
        setField(term54097, term54097.getClass(), "dropLocation", null);
        setField(term54097, term54097.getClass(), "inputMethodRequestsHandler", null);
        setField(term54097, term54097.getClass(), "composedTextAttribute", null);
        setField(term54097, term54097.getClass(), "composedTextContent", null);
        setField(term54097, term54097.getClass(), "composedTextStart", null);
        setField(term54097, term54097.getClass(), "composedTextEnd", null);
        setField(term54097, term54097.getClass(), "latestCommittedTextStart", null);
        setField(term54097, term54097.getClass(), "latestCommittedTextEnd", null);
        setField(term54097, term54097.getClass(), "composedTextCaret", null);
        setField(term54097, term54097.getClass(), "originalCaret", null);
        setBooleanField(term54097, term54097.getClass(), "checkedInputOverride", false);
        setBooleanField(term54097, term54097.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term54097, term54097.getClass(), "isAlignmentXSet", false);
        setFloatField(term54097, term54097.getClass(), "alignmentX", 0.0F);
        setBooleanField(term54097, term54097.getClass(), "isAlignmentYSet", false);
        setFloatField(term54097, term54097.getClass(), "alignmentY", 0.0F);
        setField(term54097, term54097.getClass(), "ui", null);
        setField(term54097, term54097.getClass(), "listenerList", null);
        setField(term54097, term54097.getClass(), "clientProperties", null);
        setField(term54097, term54097.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term54097, term54097.getClass(), "autoscrolls", false);
        setField(term54097, term54097.getClass(), "border", null);
        setIntField(term54097, term54097.getClass(), "flags", 0);
        setField(term54097, term54097.getClass(), "inputVerifier", null);
        setBooleanField(term54097, term54097.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term54097, term54097.getClass(), "paintingChild", null);
        setField(term54097, term54097.getClass(), "popupMenu", null);
        setField(term54097, term54097.getClass(), "revalidateRunnableScheduled", null);
        setField(term54097, term54097.getClass(), "focusInputMap", null);
        setField(term54097, term54097.getClass(), "ancestorInputMap", null);
        setField(term54097, term54097.getClass(), "windowInputMap", null);
        setField(term54097, term54097.getClass(), "actionMap", null);
        setField(term54097, term54097.getClass(), "aaHint", null);
        setField(term54097, term54097.getClass(), "lcdRenderingHint", null);
        setField(term54097, term54097.getClass(), "component", null);
        setField(term54097, term54097.getClass(), "layoutMgr", null);
        setField(term54097, term54097.getClass(), "dispatcher", null);
        setField(term54097, term54097.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term54097, term54097.getClass(), "focusCycleRoot", false);
        setBooleanField(term54097, term54097.getClass(), "focusTraversalPolicyProvider", false);
        setField(term54097, term54097.getClass(), "printingThreads", null);
        setBooleanField(term54097, term54097.getClass(), "printing", false);
        setField(term54097, term54097.getClass(), "containerListener", null);
        setIntField(term54097, term54097.getClass(), "listeningChildren", 0);
        setIntField(term54097, term54097.getClass(), "listeningBoundsChildren", 0);
        setIntField(term54097, term54097.getClass(), "descendantsCount", 0);
        setField(term54097, term54097.getClass(), "preserveBackgroundColor", null);
        setIntField(term54097, term54097.getClass(), "numOfHWComponents", 0);
        setIntField(term54097, term54097.getClass(), "numOfLWComponents", 0);
        setField(term54097, term54097.getClass(), "modalComp", null);
        setField(term54097, term54097.getClass(), "modalAppContext", null);
        setIntField(term54097, term54097.getClass(), "containerSerializedDataVersion", 0);
        setField(term54097, term54097.getClass(), "peer", null);
        setField(term54097, term54097.getClass(), "parent", null);
        setField(term54097, term54097.getClass(), "appContext", null);
        setIntField(term54097, term54097.getClass(), "x", 0);
        setIntField(term54097, term54097.getClass(), "y", 0);
        setIntField(term54097, term54097.getClass(), "width", 0);
        setIntField(term54097, term54097.getClass(), "height", 0);
        setField(term54097, term54097.getClass(), "foreground", null);
        setField(term54097, term54097.getClass(), "background", null);
        setField(term54097, term54097.getClass(), "font", null);
        setField(term54097, term54097.getClass(), "peerFont", null);
        setField(term54097, term54097.getClass(), "cursor", null);
        setField(term54097, term54097.getClass(), "locale", null);
        setField(term54097, term54097.getClass(), "graphicsConfig", null);
        setField(term54097, term54097.getClass(), "bufferStrategy", null);
        setBooleanField(term54097, term54097.getClass(), "ignoreRepaint", false);
        setBooleanField(term54097, term54097.getClass(), "visible", false);
        setBooleanField(term54097, term54097.getClass(), "enabled", false);
        setBooleanField(term54097, term54097.getClass(), "valid", false);
        setField(term54097, term54097.getClass(), "dropTarget", null);
        setField(term54097, term54097.getClass(), "popups", null);
        setField(term54097, term54097.getClass(), "name", null);
        setBooleanField(term54097, term54097.getClass(), "nameExplicitlySet", false);
        setBooleanField(term54097, term54097.getClass(), "focusable", false);
        setIntField(term54097, term54097.getClass(), "isFocusTraversableOverridden", 0);
        setField(term54097, term54097.getClass(), "focusTraversalKeys", null);
        setBooleanField(term54097, term54097.getClass(), "focusTraversalKeysEnabled", false);
        setField(term54097, term54097.getClass(), "acc", null);
        setField(term54097, term54097.getClass(), "minSize", null);
        setBooleanField(term54097, term54097.getClass(), "minSizeSet", false);
        setField(term54097, term54097.getClass(), "prefSize", null);
        setBooleanField(term54097, term54097.getClass(), "prefSizeSet", false);
        setField(term54097, term54097.getClass(), "maxSize", null);
        setBooleanField(term54097, term54097.getClass(), "maxSizeSet", false);
        setField(term54097, term54097.getClass(), "componentOrientation", null);
        setBooleanField(term54097, term54097.getClass(), "newEventsOnly", false);
        setField(term54097, term54097.getClass(), "componentListener", null);
        setField(term54097, term54097.getClass(), "focusListener", null);
        setField(term54097, term54097.getClass(), "hierarchyListener", null);
        setField(term54097, term54097.getClass(), "hierarchyBoundsListener", null);
        setField(term54097, term54097.getClass(), "keyListener", null);
        setField(term54097, term54097.getClass(), "mouseListener", null);
        setField(term54097, term54097.getClass(), "mouseMotionListener", null);
        setField(term54097, term54097.getClass(), "mouseWheelListener", null);
        setField(term54097, term54097.getClass(), "inputMethodListener", null);
        setLongField(term54097, term54097.getClass(), "eventMask", 0L);
        setField(term54097, term54097.getClass(), "changeSupport", null);
        setField(term54097, term54097.getClass(), "objectLock", null);
        setBooleanField(term54097, term54097.getClass(), "isPacked", false);
        setIntField(term54097, term54097.getClass(), "boundsOp", 0);
        setField(term54097, term54097.getClass(), "compoundShape", null);
        setField(term54097, term54097.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term54097, term54097.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term54097, term54097.getClass(), "backgroundEraseDisabled", false);
        setField(term54097, term54097.getClass(), "eventCache", null);
        setBooleanField(term54097, term54097.getClass(), "coalescingEnabled", false);
        setBooleanField(term54097, term54097.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term54097, term54097.getClass(), "componentSerializedDataVersion", 0);
        setField(term54097, term54097.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSmoothScrollNextRow", argTypes, term54097, args);
    }

};


