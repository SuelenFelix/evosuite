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

public class InfoTextArea_setTextHighlightColor_15431249231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60910;

    public InfoTextArea_setTextHighlightColor_15431249231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60910 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term60910, term60910.getClass(), "blinking", false);
        setBooleanField(term60910, term60910.getClass(), "autoScroll", false);
        setField(term60910, term60910.getClass(), "scrollText", null);
        setField(term60910, term60910.getClass(), "textToShow", null);
        setIntField(term60910, term60910.getClass(), "numberOfLines", 0);
        setIntField(term60910, term60910.getClass(), "currentLine", 0);
        setBooleanField(term60910, term60910.getClass(), "smoothScroll", false);
        setBooleanField(term60910, term60910.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term60910, term60910.getClass(), "textShadow", false);
        setIntField(term60910, term60910.getClass(), "smoothScrollY", 0);
        setField(term60910, term60910.getClass(), "shadowColor", null);
        setField(term60910, term60910.getClass(), "highlightShadowColor", null);
        setField(term60910, term60910.getClass(), "highlightColor", null);
        setField(term60910, term60910.getClass(), "highlightText", null);
        setIntField(term60910, term60910.getClass(), "customCharWidth", 0);
        setIntField(term60910, term60910.getClass(), "rows", 0);
        setIntField(term60910, term60910.getClass(), "columns", 0);
        setIntField(term60910, term60910.getClass(), "columnWidth", 0);
        setIntField(term60910, term60910.getClass(), "rowHeight", 0);
        setBooleanField(term60910, term60910.getClass(), "wrap", false);
        setBooleanField(term60910, term60910.getClass(), "word", false);
        setField(term60910, term60910.getClass(), "model", null);
        setField(term60910, term60910.getClass(), "caret", null);
        setField(term60910, term60910.getClass(), "navigationFilter", null);
        setField(term60910, term60910.getClass(), "highlighter", null);
        setField(term60910, term60910.getClass(), "keymap", null);
        setField(term60910, term60910.getClass(), "caretEvent", null);
        setField(term60910, term60910.getClass(), "caretColor", null);
        setField(term60910, term60910.getClass(), "selectionColor", null);
        setField(term60910, term60910.getClass(), "selectedTextColor", null);
        setField(term60910, term60910.getClass(), "disabledTextColor", null);
        setBooleanField(term60910, term60910.getClass(), "editable", false);
        setField(term60910, term60910.getClass(), "margin", null);
        setCharField(term60910, term60910.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60910, term60910.getClass(), "dragEnabled", false);
        setField(term60910, term60910.getClass(), "dropMode", null);
        setField(term60910, term60910.getClass(), "dropLocation", null);
        setField(term60910, term60910.getClass(), "inputMethodRequestsHandler", null);
        setField(term60910, term60910.getClass(), "composedTextAttribute", null);
        setField(term60910, term60910.getClass(), "composedTextContent", null);
        setField(term60910, term60910.getClass(), "composedTextStart", null);
        setField(term60910, term60910.getClass(), "composedTextEnd", null);
        setField(term60910, term60910.getClass(), "latestCommittedTextStart", null);
        setField(term60910, term60910.getClass(), "latestCommittedTextEnd", null);
        setField(term60910, term60910.getClass(), "composedTextCaret", null);
        setField(term60910, term60910.getClass(), "originalCaret", null);
        setBooleanField(term60910, term60910.getClass(), "checkedInputOverride", false);
        setBooleanField(term60910, term60910.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60910, term60910.getClass(), "isAlignmentXSet", false);
        setFloatField(term60910, term60910.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60910, term60910.getClass(), "isAlignmentYSet", false);
        setFloatField(term60910, term60910.getClass(), "alignmentY", 0.0F);
        setField(term60910, term60910.getClass(), "ui", null);
        setField(term60910, term60910.getClass(), "listenerList", null);
        setField(term60910, term60910.getClass(), "clientProperties", null);
        setField(term60910, term60910.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60910, term60910.getClass(), "autoscrolls", false);
        setField(term60910, term60910.getClass(), "border", null);
        setIntField(term60910, term60910.getClass(), "flags", 0);
        setField(term60910, term60910.getClass(), "inputVerifier", null);
        setBooleanField(term60910, term60910.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60910, term60910.getClass(), "paintingChild", null);
        setField(term60910, term60910.getClass(), "popupMenu", null);
        setField(term60910, term60910.getClass(), "revalidateRunnableScheduled", null);
        setField(term60910, term60910.getClass(), "focusInputMap", null);
        setField(term60910, term60910.getClass(), "ancestorInputMap", null);
        setField(term60910, term60910.getClass(), "windowInputMap", null);
        setField(term60910, term60910.getClass(), "actionMap", null);
        setField(term60910, term60910.getClass(), "aaHint", null);
        setField(term60910, term60910.getClass(), "lcdRenderingHint", null);
        setField(term60910, term60910.getClass(), "component", null);
        setField(term60910, term60910.getClass(), "layoutMgr", null);
        setField(term60910, term60910.getClass(), "dispatcher", null);
        setField(term60910, term60910.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60910, term60910.getClass(), "focusCycleRoot", false);
        setBooleanField(term60910, term60910.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60910, term60910.getClass(), "printingThreads", null);
        setBooleanField(term60910, term60910.getClass(), "printing", false);
        setField(term60910, term60910.getClass(), "containerListener", null);
        setIntField(term60910, term60910.getClass(), "listeningChildren", 0);
        setIntField(term60910, term60910.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60910, term60910.getClass(), "descendantsCount", 0);
        setField(term60910, term60910.getClass(), "preserveBackgroundColor", null);
        setIntField(term60910, term60910.getClass(), "numOfHWComponents", 0);
        setIntField(term60910, term60910.getClass(), "numOfLWComponents", 0);
        setField(term60910, term60910.getClass(), "modalComp", null);
        setField(term60910, term60910.getClass(), "modalAppContext", null);
        setIntField(term60910, term60910.getClass(), "containerSerializedDataVersion", 0);
        setField(term60910, term60910.getClass(), "peer", null);
        setField(term60910, term60910.getClass(), "parent", null);
        setField(term60910, term60910.getClass(), "appContext", null);
        setIntField(term60910, term60910.getClass(), "x", 0);
        setIntField(term60910, term60910.getClass(), "y", 0);
        setIntField(term60910, term60910.getClass(), "width", 0);
        setIntField(term60910, term60910.getClass(), "height", 0);
        setField(term60910, term60910.getClass(), "foreground", null);
        setField(term60910, term60910.getClass(), "background", null);
        setField(term60910, term60910.getClass(), "font", null);
        setField(term60910, term60910.getClass(), "peerFont", null);
        setField(term60910, term60910.getClass(), "cursor", null);
        setField(term60910, term60910.getClass(), "locale", null);
        setField(term60910, term60910.getClass(), "graphicsConfig", null);
        setField(term60910, term60910.getClass(), "bufferStrategy", null);
        setBooleanField(term60910, term60910.getClass(), "ignoreRepaint", false);
        setBooleanField(term60910, term60910.getClass(), "visible", false);
        setBooleanField(term60910, term60910.getClass(), "enabled", false);
        setBooleanField(term60910, term60910.getClass(), "valid", false);
        setField(term60910, term60910.getClass(), "dropTarget", null);
        setField(term60910, term60910.getClass(), "popups", null);
        setField(term60910, term60910.getClass(), "name", null);
        setBooleanField(term60910, term60910.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60910, term60910.getClass(), "focusable", false);
        setIntField(term60910, term60910.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60910, term60910.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60910, term60910.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60910, term60910.getClass(), "acc", null);
        setField(term60910, term60910.getClass(), "minSize", null);
        setBooleanField(term60910, term60910.getClass(), "minSizeSet", false);
        setField(term60910, term60910.getClass(), "prefSize", null);
        setBooleanField(term60910, term60910.getClass(), "prefSizeSet", false);
        setField(term60910, term60910.getClass(), "maxSize", null);
        setBooleanField(term60910, term60910.getClass(), "maxSizeSet", false);
        setField(term60910, term60910.getClass(), "componentOrientation", null);
        setBooleanField(term60910, term60910.getClass(), "newEventsOnly", false);
        setField(term60910, term60910.getClass(), "componentListener", null);
        setField(term60910, term60910.getClass(), "focusListener", null);
        setField(term60910, term60910.getClass(), "hierarchyListener", null);
        setField(term60910, term60910.getClass(), "hierarchyBoundsListener", null);
        setField(term60910, term60910.getClass(), "keyListener", null);
        setField(term60910, term60910.getClass(), "mouseListener", null);
        setField(term60910, term60910.getClass(), "mouseMotionListener", null);
        setField(term60910, term60910.getClass(), "mouseWheelListener", null);
        setField(term60910, term60910.getClass(), "inputMethodListener", null);
        setLongField(term60910, term60910.getClass(), "eventMask", 0L);
        setField(term60910, term60910.getClass(), "changeSupport", null);
        setField(term60910, term60910.getClass(), "objectLock", null);
        setBooleanField(term60910, term60910.getClass(), "isPacked", false);
        setIntField(term60910, term60910.getClass(), "boundsOp", 0);
        setField(term60910, term60910.getClass(), "compoundShape", null);
        setField(term60910, term60910.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60910, term60910.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60910, term60910.getClass(), "backgroundEraseDisabled", false);
        setField(term60910, term60910.getClass(), "eventCache", null);
        setBooleanField(term60910, term60910.getClass(), "coalescingEnabled", false);
        setBooleanField(term60910, term60910.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60910, term60910.getClass(), "componentSerializedDataVersion", 0);
        setField(term60910, term60910.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Color");
        argTypes[1] = Class.forName("java.awt.Color");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "setTextHighlightColor", argTypes, term60910, args);
    }

};


