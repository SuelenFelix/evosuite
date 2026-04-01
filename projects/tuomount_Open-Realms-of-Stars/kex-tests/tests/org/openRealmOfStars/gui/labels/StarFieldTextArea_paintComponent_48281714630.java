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

public class StarFieldTextArea_paintComponent_48281714630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54038;

    public StarFieldTextArea_paintComponent_48281714630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54038 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea"));
        setBooleanField(term54038, term54038.getClass(), "autoScroll", false);
        setField(term54038, term54038.getClass(), "scrollText", null);
        setField(term54038, term54038.getClass(), "textToShow", null);
        setIntField(term54038, term54038.getClass(), "numberOfLines", 0);
        setIntField(term54038, term54038.getClass(), "currentLine", 0);
        setBooleanField(term54038, term54038.getClass(), "smoothScroll", false);
        setBooleanField(term54038, term54038.getClass(), "smoothScrollNextRow", false);
        setIntField(term54038, term54038.getClass(), "smoothScrollY", 0);
        setIntField(term54038, term54038.getClass(), "customCharWidth", 0);
        setIntField(term54038, term54038.getClass(), "rows", 0);
        setIntField(term54038, term54038.getClass(), "columns", 0);
        setIntField(term54038, term54038.getClass(), "columnWidth", 0);
        setIntField(term54038, term54038.getClass(), "rowHeight", 0);
        setBooleanField(term54038, term54038.getClass(), "wrap", false);
        setBooleanField(term54038, term54038.getClass(), "word", false);
        setField(term54038, term54038.getClass(), "model", null);
        setField(term54038, term54038.getClass(), "caret", null);
        setField(term54038, term54038.getClass(), "navigationFilter", null);
        setField(term54038, term54038.getClass(), "highlighter", null);
        setField(term54038, term54038.getClass(), "keymap", null);
        setField(term54038, term54038.getClass(), "caretEvent", null);
        setField(term54038, term54038.getClass(), "caretColor", null);
        setField(term54038, term54038.getClass(), "selectionColor", null);
        setField(term54038, term54038.getClass(), "selectedTextColor", null);
        setField(term54038, term54038.getClass(), "disabledTextColor", null);
        setBooleanField(term54038, term54038.getClass(), "editable", false);
        setField(term54038, term54038.getClass(), "margin", null);
        setCharField(term54038, term54038.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term54038, term54038.getClass(), "dragEnabled", false);
        setField(term54038, term54038.getClass(), "dropMode", null);
        setField(term54038, term54038.getClass(), "dropLocation", null);
        setField(term54038, term54038.getClass(), "inputMethodRequestsHandler", null);
        setField(term54038, term54038.getClass(), "composedTextAttribute", null);
        setField(term54038, term54038.getClass(), "composedTextContent", null);
        setField(term54038, term54038.getClass(), "composedTextStart", null);
        setField(term54038, term54038.getClass(), "composedTextEnd", null);
        setField(term54038, term54038.getClass(), "latestCommittedTextStart", null);
        setField(term54038, term54038.getClass(), "latestCommittedTextEnd", null);
        setField(term54038, term54038.getClass(), "composedTextCaret", null);
        setField(term54038, term54038.getClass(), "originalCaret", null);
        setBooleanField(term54038, term54038.getClass(), "checkedInputOverride", false);
        setBooleanField(term54038, term54038.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term54038, term54038.getClass(), "isAlignmentXSet", false);
        setFloatField(term54038, term54038.getClass(), "alignmentX", 0.0F);
        setBooleanField(term54038, term54038.getClass(), "isAlignmentYSet", false);
        setFloatField(term54038, term54038.getClass(), "alignmentY", 0.0F);
        setField(term54038, term54038.getClass(), "ui", null);
        setField(term54038, term54038.getClass(), "listenerList", null);
        setField(term54038, term54038.getClass(), "clientProperties", null);
        setField(term54038, term54038.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term54038, term54038.getClass(), "autoscrolls", false);
        setField(term54038, term54038.getClass(), "border", null);
        setIntField(term54038, term54038.getClass(), "flags", 0);
        setField(term54038, term54038.getClass(), "inputVerifier", null);
        setBooleanField(term54038, term54038.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term54038, term54038.getClass(), "paintingChild", null);
        setField(term54038, term54038.getClass(), "popupMenu", null);
        setField(term54038, term54038.getClass(), "revalidateRunnableScheduled", null);
        setField(term54038, term54038.getClass(), "focusInputMap", null);
        setField(term54038, term54038.getClass(), "ancestorInputMap", null);
        setField(term54038, term54038.getClass(), "windowInputMap", null);
        setField(term54038, term54038.getClass(), "actionMap", null);
        setField(term54038, term54038.getClass(), "aaHint", null);
        setField(term54038, term54038.getClass(), "lcdRenderingHint", null);
        setField(term54038, term54038.getClass(), "component", null);
        setField(term54038, term54038.getClass(), "layoutMgr", null);
        setField(term54038, term54038.getClass(), "dispatcher", null);
        setField(term54038, term54038.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term54038, term54038.getClass(), "focusCycleRoot", false);
        setBooleanField(term54038, term54038.getClass(), "focusTraversalPolicyProvider", false);
        setField(term54038, term54038.getClass(), "printingThreads", null);
        setBooleanField(term54038, term54038.getClass(), "printing", false);
        setField(term54038, term54038.getClass(), "containerListener", null);
        setIntField(term54038, term54038.getClass(), "listeningChildren", 0);
        setIntField(term54038, term54038.getClass(), "listeningBoundsChildren", 0);
        setIntField(term54038, term54038.getClass(), "descendantsCount", 0);
        setField(term54038, term54038.getClass(), "preserveBackgroundColor", null);
        setIntField(term54038, term54038.getClass(), "numOfHWComponents", 0);
        setIntField(term54038, term54038.getClass(), "numOfLWComponents", 0);
        setField(term54038, term54038.getClass(), "modalComp", null);
        setField(term54038, term54038.getClass(), "modalAppContext", null);
        setIntField(term54038, term54038.getClass(), "containerSerializedDataVersion", 0);
        setField(term54038, term54038.getClass(), "peer", null);
        setField(term54038, term54038.getClass(), "parent", null);
        setField(term54038, term54038.getClass(), "appContext", null);
        setIntField(term54038, term54038.getClass(), "x", 0);
        setIntField(term54038, term54038.getClass(), "y", 0);
        setIntField(term54038, term54038.getClass(), "width", 0);
        setIntField(term54038, term54038.getClass(), "height", 0);
        setField(term54038, term54038.getClass(), "foreground", null);
        setField(term54038, term54038.getClass(), "background", null);
        setField(term54038, term54038.getClass(), "font", null);
        setField(term54038, term54038.getClass(), "peerFont", null);
        setField(term54038, term54038.getClass(), "cursor", null);
        setField(term54038, term54038.getClass(), "locale", null);
        setField(term54038, term54038.getClass(), "graphicsConfig", null);
        setField(term54038, term54038.getClass(), "bufferStrategy", null);
        setBooleanField(term54038, term54038.getClass(), "ignoreRepaint", false);
        setBooleanField(term54038, term54038.getClass(), "visible", false);
        setBooleanField(term54038, term54038.getClass(), "enabled", false);
        setBooleanField(term54038, term54038.getClass(), "valid", false);
        setField(term54038, term54038.getClass(), "dropTarget", null);
        setField(term54038, term54038.getClass(), "popups", null);
        setField(term54038, term54038.getClass(), "name", null);
        setBooleanField(term54038, term54038.getClass(), "nameExplicitlySet", false);
        setBooleanField(term54038, term54038.getClass(), "focusable", false);
        setIntField(term54038, term54038.getClass(), "isFocusTraversableOverridden", 0);
        setField(term54038, term54038.getClass(), "focusTraversalKeys", null);
        setBooleanField(term54038, term54038.getClass(), "focusTraversalKeysEnabled", false);
        setField(term54038, term54038.getClass(), "acc", null);
        setField(term54038, term54038.getClass(), "minSize", null);
        setBooleanField(term54038, term54038.getClass(), "minSizeSet", false);
        setField(term54038, term54038.getClass(), "prefSize", null);
        setBooleanField(term54038, term54038.getClass(), "prefSizeSet", false);
        setField(term54038, term54038.getClass(), "maxSize", null);
        setBooleanField(term54038, term54038.getClass(), "maxSizeSet", false);
        setField(term54038, term54038.getClass(), "componentOrientation", null);
        setBooleanField(term54038, term54038.getClass(), "newEventsOnly", false);
        setField(term54038, term54038.getClass(), "componentListener", null);
        setField(term54038, term54038.getClass(), "focusListener", null);
        setField(term54038, term54038.getClass(), "hierarchyListener", null);
        setField(term54038, term54038.getClass(), "hierarchyBoundsListener", null);
        setField(term54038, term54038.getClass(), "keyListener", null);
        setField(term54038, term54038.getClass(), "mouseListener", null);
        setField(term54038, term54038.getClass(), "mouseMotionListener", null);
        setField(term54038, term54038.getClass(), "mouseWheelListener", null);
        setField(term54038, term54038.getClass(), "inputMethodListener", null);
        setLongField(term54038, term54038.getClass(), "eventMask", 0L);
        setField(term54038, term54038.getClass(), "changeSupport", null);
        setField(term54038, term54038.getClass(), "objectLock", null);
        setBooleanField(term54038, term54038.getClass(), "isPacked", false);
        setIntField(term54038, term54038.getClass(), "boundsOp", 0);
        setField(term54038, term54038.getClass(), "compoundShape", null);
        setField(term54038, term54038.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term54038, term54038.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term54038, term54038.getClass(), "backgroundEraseDisabled", false);
        setField(term54038, term54038.getClass(), "eventCache", null);
        setBooleanField(term54038, term54038.getClass(), "coalescingEnabled", false);
        setBooleanField(term54038, term54038.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term54038, term54038.getClass(), "componentSerializedDataVersion", 0);
        setField(term54038, term54038.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term54038, args);
    }

};


