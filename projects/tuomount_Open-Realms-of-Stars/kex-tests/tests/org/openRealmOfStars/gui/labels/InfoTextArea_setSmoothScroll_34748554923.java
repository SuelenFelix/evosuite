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
import java.lang.Boolean;

public class InfoTextArea_setSmoothScroll_34748554923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60599;
     Object term60660;

    public InfoTextArea_setSmoothScroll_34748554923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60599 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term60599, term60599.getClass(), "blinking", false);
        setBooleanField(term60599, term60599.getClass(), "autoScroll", false);
        setField(term60599, term60599.getClass(), "scrollText", null);
        setField(term60599, term60599.getClass(), "textToShow", null);
        setIntField(term60599, term60599.getClass(), "numberOfLines", 0);
        setIntField(term60599, term60599.getClass(), "currentLine", 0);
        setBooleanField(term60599, term60599.getClass(), "smoothScroll", false);
        setBooleanField(term60599, term60599.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term60599, term60599.getClass(), "textShadow", false);
        setIntField(term60599, term60599.getClass(), "smoothScrollY", 0);
        setField(term60599, term60599.getClass(), "shadowColor", null);
        setField(term60599, term60599.getClass(), "highlightShadowColor", null);
        setField(term60599, term60599.getClass(), "highlightColor", null);
        setField(term60599, term60599.getClass(), "highlightText", null);
        setIntField(term60599, term60599.getClass(), "customCharWidth", 0);
        setIntField(term60599, term60599.getClass(), "rows", 0);
        setIntField(term60599, term60599.getClass(), "columns", 0);
        setIntField(term60599, term60599.getClass(), "columnWidth", 0);
        setIntField(term60599, term60599.getClass(), "rowHeight", 0);
        setBooleanField(term60599, term60599.getClass(), "wrap", false);
        setBooleanField(term60599, term60599.getClass(), "word", false);
        setField(term60599, term60599.getClass(), "model", null);
        setField(term60599, term60599.getClass(), "caret", null);
        setField(term60599, term60599.getClass(), "navigationFilter", null);
        setField(term60599, term60599.getClass(), "highlighter", null);
        setField(term60599, term60599.getClass(), "keymap", null);
        setField(term60599, term60599.getClass(), "caretEvent", null);
        setField(term60599, term60599.getClass(), "caretColor", null);
        setField(term60599, term60599.getClass(), "selectionColor", null);
        setField(term60599, term60599.getClass(), "selectedTextColor", null);
        setField(term60599, term60599.getClass(), "disabledTextColor", null);
        setBooleanField(term60599, term60599.getClass(), "editable", false);
        setField(term60599, term60599.getClass(), "margin", null);
        setCharField(term60599, term60599.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60599, term60599.getClass(), "dragEnabled", false);
        setField(term60599, term60599.getClass(), "dropMode", null);
        setField(term60599, term60599.getClass(), "dropLocation", null);
        setField(term60599, term60599.getClass(), "inputMethodRequestsHandler", null);
        setField(term60599, term60599.getClass(), "composedTextAttribute", null);
        setField(term60599, term60599.getClass(), "composedTextContent", null);
        setField(term60599, term60599.getClass(), "composedTextStart", null);
        setField(term60599, term60599.getClass(), "composedTextEnd", null);
        setField(term60599, term60599.getClass(), "latestCommittedTextStart", null);
        setField(term60599, term60599.getClass(), "latestCommittedTextEnd", null);
        setField(term60599, term60599.getClass(), "composedTextCaret", null);
        setField(term60599, term60599.getClass(), "originalCaret", null);
        setBooleanField(term60599, term60599.getClass(), "checkedInputOverride", false);
        setBooleanField(term60599, term60599.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60599, term60599.getClass(), "isAlignmentXSet", false);
        setFloatField(term60599, term60599.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60599, term60599.getClass(), "isAlignmentYSet", false);
        setFloatField(term60599, term60599.getClass(), "alignmentY", 0.0F);
        setField(term60599, term60599.getClass(), "ui", null);
        setField(term60599, term60599.getClass(), "listenerList", null);
        setField(term60599, term60599.getClass(), "clientProperties", null);
        setField(term60599, term60599.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60599, term60599.getClass(), "autoscrolls", false);
        setField(term60599, term60599.getClass(), "border", null);
        setIntField(term60599, term60599.getClass(), "flags", 0);
        setField(term60599, term60599.getClass(), "inputVerifier", null);
        setBooleanField(term60599, term60599.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60599, term60599.getClass(), "paintingChild", null);
        setField(term60599, term60599.getClass(), "popupMenu", null);
        setField(term60599, term60599.getClass(), "revalidateRunnableScheduled", null);
        setField(term60599, term60599.getClass(), "focusInputMap", null);
        setField(term60599, term60599.getClass(), "ancestorInputMap", null);
        setField(term60599, term60599.getClass(), "windowInputMap", null);
        setField(term60599, term60599.getClass(), "actionMap", null);
        setField(term60599, term60599.getClass(), "aaHint", null);
        setField(term60599, term60599.getClass(), "lcdRenderingHint", null);
        setField(term60599, term60599.getClass(), "component", null);
        setField(term60599, term60599.getClass(), "layoutMgr", null);
        setField(term60599, term60599.getClass(), "dispatcher", null);
        setField(term60599, term60599.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60599, term60599.getClass(), "focusCycleRoot", false);
        setBooleanField(term60599, term60599.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60599, term60599.getClass(), "printingThreads", null);
        setBooleanField(term60599, term60599.getClass(), "printing", false);
        setField(term60599, term60599.getClass(), "containerListener", null);
        setIntField(term60599, term60599.getClass(), "listeningChildren", 0);
        setIntField(term60599, term60599.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60599, term60599.getClass(), "descendantsCount", 0);
        setField(term60599, term60599.getClass(), "preserveBackgroundColor", null);
        setIntField(term60599, term60599.getClass(), "numOfHWComponents", 0);
        setIntField(term60599, term60599.getClass(), "numOfLWComponents", 0);
        setField(term60599, term60599.getClass(), "modalComp", null);
        setField(term60599, term60599.getClass(), "modalAppContext", null);
        setIntField(term60599, term60599.getClass(), "containerSerializedDataVersion", 0);
        setField(term60599, term60599.getClass(), "peer", null);
        setField(term60599, term60599.getClass(), "parent", null);
        setField(term60599, term60599.getClass(), "appContext", null);
        setIntField(term60599, term60599.getClass(), "x", 0);
        setIntField(term60599, term60599.getClass(), "y", 0);
        setIntField(term60599, term60599.getClass(), "width", 0);
        setIntField(term60599, term60599.getClass(), "height", 0);
        setField(term60599, term60599.getClass(), "foreground", null);
        setField(term60599, term60599.getClass(), "background", null);
        setField(term60599, term60599.getClass(), "font", null);
        setField(term60599, term60599.getClass(), "peerFont", null);
        setField(term60599, term60599.getClass(), "cursor", null);
        setField(term60599, term60599.getClass(), "locale", null);
        setField(term60599, term60599.getClass(), "graphicsConfig", null);
        setField(term60599, term60599.getClass(), "bufferStrategy", null);
        setBooleanField(term60599, term60599.getClass(), "ignoreRepaint", false);
        setBooleanField(term60599, term60599.getClass(), "visible", false);
        setBooleanField(term60599, term60599.getClass(), "enabled", false);
        setBooleanField(term60599, term60599.getClass(), "valid", false);
        setField(term60599, term60599.getClass(), "dropTarget", null);
        setField(term60599, term60599.getClass(), "popups", null);
        setField(term60599, term60599.getClass(), "name", null);
        setBooleanField(term60599, term60599.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60599, term60599.getClass(), "focusable", false);
        setIntField(term60599, term60599.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60599, term60599.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60599, term60599.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60599, term60599.getClass(), "acc", null);
        setField(term60599, term60599.getClass(), "minSize", null);
        setBooleanField(term60599, term60599.getClass(), "minSizeSet", false);
        setField(term60599, term60599.getClass(), "prefSize", null);
        setBooleanField(term60599, term60599.getClass(), "prefSizeSet", false);
        setField(term60599, term60599.getClass(), "maxSize", null);
        setBooleanField(term60599, term60599.getClass(), "maxSizeSet", false);
        setField(term60599, term60599.getClass(), "componentOrientation", null);
        setBooleanField(term60599, term60599.getClass(), "newEventsOnly", false);
        setField(term60599, term60599.getClass(), "componentListener", null);
        setField(term60599, term60599.getClass(), "focusListener", null);
        setField(term60599, term60599.getClass(), "hierarchyListener", null);
        setField(term60599, term60599.getClass(), "hierarchyBoundsListener", null);
        setField(term60599, term60599.getClass(), "keyListener", null);
        setField(term60599, term60599.getClass(), "mouseListener", null);
        setField(term60599, term60599.getClass(), "mouseMotionListener", null);
        setField(term60599, term60599.getClass(), "mouseWheelListener", null);
        setField(term60599, term60599.getClass(), "inputMethodListener", null);
        setLongField(term60599, term60599.getClass(), "eventMask", 0L);
        setField(term60599, term60599.getClass(), "changeSupport", null);
        setField(term60599, term60599.getClass(), "objectLock", null);
        setBooleanField(term60599, term60599.getClass(), "isPacked", false);
        setIntField(term60599, term60599.getClass(), "boundsOp", 0);
        setField(term60599, term60599.getClass(), "compoundShape", null);
        setField(term60599, term60599.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60599, term60599.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60599, term60599.getClass(), "backgroundEraseDisabled", false);
        setField(term60599, term60599.getClass(), "eventCache", null);
        setBooleanField(term60599, term60599.getClass(), "coalescingEnabled", false);
        setBooleanField(term60599, term60599.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60599, term60599.getClass(), "componentSerializedDataVersion", 0);
        setField(term60599, term60599.getClass(), "accessibleContext", null);
        term60660 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term60660;
        callMethod(klass, "setSmoothScroll", argTypes, term60599, args);
    }

};


