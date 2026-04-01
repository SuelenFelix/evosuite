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

public class StarFieldTextArea_setText_179377258223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53613;

    public StarFieldTextArea_setText_179377258223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53613 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea"));
        setBooleanField(term53613, term53613.getClass(), "autoScroll", false);
        setField(term53613, term53613.getClass(), "scrollText", null);
        setField(term53613, term53613.getClass(), "textToShow", null);
        setIntField(term53613, term53613.getClass(), "numberOfLines", 0);
        setIntField(term53613, term53613.getClass(), "currentLine", 0);
        setBooleanField(term53613, term53613.getClass(), "smoothScroll", false);
        setBooleanField(term53613, term53613.getClass(), "smoothScrollNextRow", false);
        setIntField(term53613, term53613.getClass(), "smoothScrollY", 0);
        setIntField(term53613, term53613.getClass(), "customCharWidth", 0);
        setIntField(term53613, term53613.getClass(), "rows", 0);
        setIntField(term53613, term53613.getClass(), "columns", 0);
        setIntField(term53613, term53613.getClass(), "columnWidth", 0);
        setIntField(term53613, term53613.getClass(), "rowHeight", 0);
        setBooleanField(term53613, term53613.getClass(), "wrap", false);
        setBooleanField(term53613, term53613.getClass(), "word", false);
        setField(term53613, term53613.getClass(), "model", null);
        setField(term53613, term53613.getClass(), "caret", null);
        setField(term53613, term53613.getClass(), "navigationFilter", null);
        setField(term53613, term53613.getClass(), "highlighter", null);
        setField(term53613, term53613.getClass(), "keymap", null);
        setField(term53613, term53613.getClass(), "caretEvent", null);
        setField(term53613, term53613.getClass(), "caretColor", null);
        setField(term53613, term53613.getClass(), "selectionColor", null);
        setField(term53613, term53613.getClass(), "selectedTextColor", null);
        setField(term53613, term53613.getClass(), "disabledTextColor", null);
        setBooleanField(term53613, term53613.getClass(), "editable", false);
        setField(term53613, term53613.getClass(), "margin", null);
        setCharField(term53613, term53613.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term53613, term53613.getClass(), "dragEnabled", false);
        setField(term53613, term53613.getClass(), "dropMode", null);
        setField(term53613, term53613.getClass(), "dropLocation", null);
        setField(term53613, term53613.getClass(), "inputMethodRequestsHandler", null);
        setField(term53613, term53613.getClass(), "composedTextAttribute", null);
        setField(term53613, term53613.getClass(), "composedTextContent", null);
        setField(term53613, term53613.getClass(), "composedTextStart", null);
        setField(term53613, term53613.getClass(), "composedTextEnd", null);
        setField(term53613, term53613.getClass(), "latestCommittedTextStart", null);
        setField(term53613, term53613.getClass(), "latestCommittedTextEnd", null);
        setField(term53613, term53613.getClass(), "composedTextCaret", null);
        setField(term53613, term53613.getClass(), "originalCaret", null);
        setBooleanField(term53613, term53613.getClass(), "checkedInputOverride", false);
        setBooleanField(term53613, term53613.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term53613, term53613.getClass(), "isAlignmentXSet", false);
        setFloatField(term53613, term53613.getClass(), "alignmentX", 0.0F);
        setBooleanField(term53613, term53613.getClass(), "isAlignmentYSet", false);
        setFloatField(term53613, term53613.getClass(), "alignmentY", 0.0F);
        setField(term53613, term53613.getClass(), "ui", null);
        setField(term53613, term53613.getClass(), "listenerList", null);
        setField(term53613, term53613.getClass(), "clientProperties", null);
        setField(term53613, term53613.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term53613, term53613.getClass(), "autoscrolls", false);
        setField(term53613, term53613.getClass(), "border", null);
        setIntField(term53613, term53613.getClass(), "flags", 0);
        setField(term53613, term53613.getClass(), "inputVerifier", null);
        setBooleanField(term53613, term53613.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term53613, term53613.getClass(), "paintingChild", null);
        setField(term53613, term53613.getClass(), "popupMenu", null);
        setField(term53613, term53613.getClass(), "revalidateRunnableScheduled", null);
        setField(term53613, term53613.getClass(), "focusInputMap", null);
        setField(term53613, term53613.getClass(), "ancestorInputMap", null);
        setField(term53613, term53613.getClass(), "windowInputMap", null);
        setField(term53613, term53613.getClass(), "actionMap", null);
        setField(term53613, term53613.getClass(), "aaHint", null);
        setField(term53613, term53613.getClass(), "lcdRenderingHint", null);
        setField(term53613, term53613.getClass(), "component", null);
        setField(term53613, term53613.getClass(), "layoutMgr", null);
        setField(term53613, term53613.getClass(), "dispatcher", null);
        setField(term53613, term53613.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term53613, term53613.getClass(), "focusCycleRoot", false);
        setBooleanField(term53613, term53613.getClass(), "focusTraversalPolicyProvider", false);
        setField(term53613, term53613.getClass(), "printingThreads", null);
        setBooleanField(term53613, term53613.getClass(), "printing", false);
        setField(term53613, term53613.getClass(), "containerListener", null);
        setIntField(term53613, term53613.getClass(), "listeningChildren", 0);
        setIntField(term53613, term53613.getClass(), "listeningBoundsChildren", 0);
        setIntField(term53613, term53613.getClass(), "descendantsCount", 0);
        setField(term53613, term53613.getClass(), "preserveBackgroundColor", null);
        setIntField(term53613, term53613.getClass(), "numOfHWComponents", 0);
        setIntField(term53613, term53613.getClass(), "numOfLWComponents", 0);
        setField(term53613, term53613.getClass(), "modalComp", null);
        setField(term53613, term53613.getClass(), "modalAppContext", null);
        setIntField(term53613, term53613.getClass(), "containerSerializedDataVersion", 0);
        setField(term53613, term53613.getClass(), "peer", null);
        setField(term53613, term53613.getClass(), "parent", null);
        setField(term53613, term53613.getClass(), "appContext", null);
        setIntField(term53613, term53613.getClass(), "x", 0);
        setIntField(term53613, term53613.getClass(), "y", 0);
        setIntField(term53613, term53613.getClass(), "width", 0);
        setIntField(term53613, term53613.getClass(), "height", 0);
        setField(term53613, term53613.getClass(), "foreground", null);
        setField(term53613, term53613.getClass(), "background", null);
        setField(term53613, term53613.getClass(), "font", null);
        setField(term53613, term53613.getClass(), "peerFont", null);
        setField(term53613, term53613.getClass(), "cursor", null);
        setField(term53613, term53613.getClass(), "locale", null);
        setField(term53613, term53613.getClass(), "graphicsConfig", null);
        setField(term53613, term53613.getClass(), "bufferStrategy", null);
        setBooleanField(term53613, term53613.getClass(), "ignoreRepaint", false);
        setBooleanField(term53613, term53613.getClass(), "visible", false);
        setBooleanField(term53613, term53613.getClass(), "enabled", false);
        setBooleanField(term53613, term53613.getClass(), "valid", false);
        setField(term53613, term53613.getClass(), "dropTarget", null);
        setField(term53613, term53613.getClass(), "popups", null);
        setField(term53613, term53613.getClass(), "name", null);
        setBooleanField(term53613, term53613.getClass(), "nameExplicitlySet", false);
        setBooleanField(term53613, term53613.getClass(), "focusable", false);
        setIntField(term53613, term53613.getClass(), "isFocusTraversableOverridden", 0);
        setField(term53613, term53613.getClass(), "focusTraversalKeys", null);
        setBooleanField(term53613, term53613.getClass(), "focusTraversalKeysEnabled", false);
        setField(term53613, term53613.getClass(), "acc", null);
        setField(term53613, term53613.getClass(), "minSize", null);
        setBooleanField(term53613, term53613.getClass(), "minSizeSet", false);
        setField(term53613, term53613.getClass(), "prefSize", null);
        setBooleanField(term53613, term53613.getClass(), "prefSizeSet", false);
        setField(term53613, term53613.getClass(), "maxSize", null);
        setBooleanField(term53613, term53613.getClass(), "maxSizeSet", false);
        setField(term53613, term53613.getClass(), "componentOrientation", null);
        setBooleanField(term53613, term53613.getClass(), "newEventsOnly", false);
        setField(term53613, term53613.getClass(), "componentListener", null);
        setField(term53613, term53613.getClass(), "focusListener", null);
        setField(term53613, term53613.getClass(), "hierarchyListener", null);
        setField(term53613, term53613.getClass(), "hierarchyBoundsListener", null);
        setField(term53613, term53613.getClass(), "keyListener", null);
        setField(term53613, term53613.getClass(), "mouseListener", null);
        setField(term53613, term53613.getClass(), "mouseMotionListener", null);
        setField(term53613, term53613.getClass(), "mouseWheelListener", null);
        setField(term53613, term53613.getClass(), "inputMethodListener", null);
        setLongField(term53613, term53613.getClass(), "eventMask", 0L);
        setField(term53613, term53613.getClass(), "changeSupport", null);
        setField(term53613, term53613.getClass(), "objectLock", null);
        setBooleanField(term53613, term53613.getClass(), "isPacked", false);
        setIntField(term53613, term53613.getClass(), "boundsOp", 0);
        setField(term53613, term53613.getClass(), "compoundShape", null);
        setField(term53613, term53613.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term53613, term53613.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term53613, term53613.getClass(), "backgroundEraseDisabled", false);
        setField(term53613, term53613.getClass(), "eventCache", null);
        setBooleanField(term53613, term53613.getClass(), "coalescingEnabled", false);
        setBooleanField(term53613, term53613.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term53613, term53613.getClass(), "componentSerializedDataVersion", 0);
        setField(term53613, term53613.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term53613, args);
    }

};


