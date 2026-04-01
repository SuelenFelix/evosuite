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

public class InfoTextArea_setScrollText_29594932935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61154;
     Object term61215;

    public InfoTextArea_setScrollText_29594932935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61154 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term61154, term61154.getClass(), "blinking", false);
        setBooleanField(term61154, term61154.getClass(), "autoScroll", false);
        setField(term61154, term61154.getClass(), "scrollText", null);
        setField(term61154, term61154.getClass(), "textToShow", null);
        setIntField(term61154, term61154.getClass(), "numberOfLines", 0);
        setIntField(term61154, term61154.getClass(), "currentLine", 0);
        setBooleanField(term61154, term61154.getClass(), "smoothScroll", false);
        setBooleanField(term61154, term61154.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term61154, term61154.getClass(), "textShadow", false);
        setIntField(term61154, term61154.getClass(), "smoothScrollY", 0);
        setField(term61154, term61154.getClass(), "shadowColor", null);
        setField(term61154, term61154.getClass(), "highlightShadowColor", null);
        setField(term61154, term61154.getClass(), "highlightColor", null);
        setField(term61154, term61154.getClass(), "highlightText", null);
        setIntField(term61154, term61154.getClass(), "customCharWidth", 0);
        setIntField(term61154, term61154.getClass(), "rows", 0);
        setIntField(term61154, term61154.getClass(), "columns", 0);
        setIntField(term61154, term61154.getClass(), "columnWidth", 0);
        setIntField(term61154, term61154.getClass(), "rowHeight", 0);
        setBooleanField(term61154, term61154.getClass(), "wrap", false);
        setBooleanField(term61154, term61154.getClass(), "word", false);
        setField(term61154, term61154.getClass(), "model", null);
        setField(term61154, term61154.getClass(), "caret", null);
        setField(term61154, term61154.getClass(), "navigationFilter", null);
        setField(term61154, term61154.getClass(), "highlighter", null);
        setField(term61154, term61154.getClass(), "keymap", null);
        setField(term61154, term61154.getClass(), "caretEvent", null);
        setField(term61154, term61154.getClass(), "caretColor", null);
        setField(term61154, term61154.getClass(), "selectionColor", null);
        setField(term61154, term61154.getClass(), "selectedTextColor", null);
        setField(term61154, term61154.getClass(), "disabledTextColor", null);
        setBooleanField(term61154, term61154.getClass(), "editable", false);
        setField(term61154, term61154.getClass(), "margin", null);
        setCharField(term61154, term61154.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term61154, term61154.getClass(), "dragEnabled", false);
        setField(term61154, term61154.getClass(), "dropMode", null);
        setField(term61154, term61154.getClass(), "dropLocation", null);
        setField(term61154, term61154.getClass(), "inputMethodRequestsHandler", null);
        setField(term61154, term61154.getClass(), "composedTextAttribute", null);
        setField(term61154, term61154.getClass(), "composedTextContent", null);
        setField(term61154, term61154.getClass(), "composedTextStart", null);
        setField(term61154, term61154.getClass(), "composedTextEnd", null);
        setField(term61154, term61154.getClass(), "latestCommittedTextStart", null);
        setField(term61154, term61154.getClass(), "latestCommittedTextEnd", null);
        setField(term61154, term61154.getClass(), "composedTextCaret", null);
        setField(term61154, term61154.getClass(), "originalCaret", null);
        setBooleanField(term61154, term61154.getClass(), "checkedInputOverride", false);
        setBooleanField(term61154, term61154.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term61154, term61154.getClass(), "isAlignmentXSet", false);
        setFloatField(term61154, term61154.getClass(), "alignmentX", 0.0F);
        setBooleanField(term61154, term61154.getClass(), "isAlignmentYSet", false);
        setFloatField(term61154, term61154.getClass(), "alignmentY", 0.0F);
        setField(term61154, term61154.getClass(), "ui", null);
        setField(term61154, term61154.getClass(), "listenerList", null);
        setField(term61154, term61154.getClass(), "clientProperties", null);
        setField(term61154, term61154.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term61154, term61154.getClass(), "autoscrolls", false);
        setField(term61154, term61154.getClass(), "border", null);
        setIntField(term61154, term61154.getClass(), "flags", 0);
        setField(term61154, term61154.getClass(), "inputVerifier", null);
        setBooleanField(term61154, term61154.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term61154, term61154.getClass(), "paintingChild", null);
        setField(term61154, term61154.getClass(), "popupMenu", null);
        setField(term61154, term61154.getClass(), "revalidateRunnableScheduled", null);
        setField(term61154, term61154.getClass(), "focusInputMap", null);
        setField(term61154, term61154.getClass(), "ancestorInputMap", null);
        setField(term61154, term61154.getClass(), "windowInputMap", null);
        setField(term61154, term61154.getClass(), "actionMap", null);
        setField(term61154, term61154.getClass(), "aaHint", null);
        setField(term61154, term61154.getClass(), "lcdRenderingHint", null);
        setField(term61154, term61154.getClass(), "component", null);
        setField(term61154, term61154.getClass(), "layoutMgr", null);
        setField(term61154, term61154.getClass(), "dispatcher", null);
        setField(term61154, term61154.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term61154, term61154.getClass(), "focusCycleRoot", false);
        setBooleanField(term61154, term61154.getClass(), "focusTraversalPolicyProvider", false);
        setField(term61154, term61154.getClass(), "printingThreads", null);
        setBooleanField(term61154, term61154.getClass(), "printing", false);
        setField(term61154, term61154.getClass(), "containerListener", null);
        setIntField(term61154, term61154.getClass(), "listeningChildren", 0);
        setIntField(term61154, term61154.getClass(), "listeningBoundsChildren", 0);
        setIntField(term61154, term61154.getClass(), "descendantsCount", 0);
        setField(term61154, term61154.getClass(), "preserveBackgroundColor", null);
        setIntField(term61154, term61154.getClass(), "numOfHWComponents", 0);
        setIntField(term61154, term61154.getClass(), "numOfLWComponents", 0);
        setField(term61154, term61154.getClass(), "modalComp", null);
        setField(term61154, term61154.getClass(), "modalAppContext", null);
        setIntField(term61154, term61154.getClass(), "containerSerializedDataVersion", 0);
        setField(term61154, term61154.getClass(), "peer", null);
        setField(term61154, term61154.getClass(), "parent", null);
        setField(term61154, term61154.getClass(), "appContext", null);
        setIntField(term61154, term61154.getClass(), "x", 0);
        setIntField(term61154, term61154.getClass(), "y", 0);
        setIntField(term61154, term61154.getClass(), "width", 0);
        setIntField(term61154, term61154.getClass(), "height", 0);
        setField(term61154, term61154.getClass(), "foreground", null);
        setField(term61154, term61154.getClass(), "background", null);
        setField(term61154, term61154.getClass(), "font", null);
        setField(term61154, term61154.getClass(), "peerFont", null);
        setField(term61154, term61154.getClass(), "cursor", null);
        setField(term61154, term61154.getClass(), "locale", null);
        setField(term61154, term61154.getClass(), "graphicsConfig", null);
        setField(term61154, term61154.getClass(), "bufferStrategy", null);
        setBooleanField(term61154, term61154.getClass(), "ignoreRepaint", false);
        setBooleanField(term61154, term61154.getClass(), "visible", false);
        setBooleanField(term61154, term61154.getClass(), "enabled", false);
        setBooleanField(term61154, term61154.getClass(), "valid", false);
        setField(term61154, term61154.getClass(), "dropTarget", null);
        setField(term61154, term61154.getClass(), "popups", null);
        setField(term61154, term61154.getClass(), "name", null);
        setBooleanField(term61154, term61154.getClass(), "nameExplicitlySet", false);
        setBooleanField(term61154, term61154.getClass(), "focusable", false);
        setIntField(term61154, term61154.getClass(), "isFocusTraversableOverridden", 0);
        setField(term61154, term61154.getClass(), "focusTraversalKeys", null);
        setBooleanField(term61154, term61154.getClass(), "focusTraversalKeysEnabled", false);
        setField(term61154, term61154.getClass(), "acc", null);
        setField(term61154, term61154.getClass(), "minSize", null);
        setBooleanField(term61154, term61154.getClass(), "minSizeSet", false);
        setField(term61154, term61154.getClass(), "prefSize", null);
        setBooleanField(term61154, term61154.getClass(), "prefSizeSet", false);
        setField(term61154, term61154.getClass(), "maxSize", null);
        setBooleanField(term61154, term61154.getClass(), "maxSizeSet", false);
        setField(term61154, term61154.getClass(), "componentOrientation", null);
        setBooleanField(term61154, term61154.getClass(), "newEventsOnly", false);
        setField(term61154, term61154.getClass(), "componentListener", null);
        setField(term61154, term61154.getClass(), "focusListener", null);
        setField(term61154, term61154.getClass(), "hierarchyListener", null);
        setField(term61154, term61154.getClass(), "hierarchyBoundsListener", null);
        setField(term61154, term61154.getClass(), "keyListener", null);
        setField(term61154, term61154.getClass(), "mouseListener", null);
        setField(term61154, term61154.getClass(), "mouseMotionListener", null);
        setField(term61154, term61154.getClass(), "mouseWheelListener", null);
        setField(term61154, term61154.getClass(), "inputMethodListener", null);
        setLongField(term61154, term61154.getClass(), "eventMask", 0L);
        setField(term61154, term61154.getClass(), "changeSupport", null);
        setField(term61154, term61154.getClass(), "objectLock", null);
        setBooleanField(term61154, term61154.getClass(), "isPacked", false);
        setIntField(term61154, term61154.getClass(), "boundsOp", 0);
        setField(term61154, term61154.getClass(), "compoundShape", null);
        setField(term61154, term61154.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term61154, term61154.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term61154, term61154.getClass(), "backgroundEraseDisabled", false);
        setField(term61154, term61154.getClass(), "eventCache", null);
        setBooleanField(term61154, term61154.getClass(), "coalescingEnabled", false);
        setBooleanField(term61154, term61154.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term61154, term61154.getClass(), "componentSerializedDataVersion", 0);
        setField(term61154, term61154.getClass(), "accessibleContext", null);
        term61215 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term61215;
        callMethod(klass, "setScrollText", argTypes, term61154, args);
    }

};


