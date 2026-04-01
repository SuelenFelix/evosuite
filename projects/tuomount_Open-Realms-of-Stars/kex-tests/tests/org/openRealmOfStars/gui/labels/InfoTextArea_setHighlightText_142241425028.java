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

public class InfoTextArea_setHighlightText_142241425028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60727;

    public InfoTextArea_setHighlightText_142241425028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60727 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term60727, term60727.getClass(), "blinking", false);
        setBooleanField(term60727, term60727.getClass(), "autoScroll", false);
        setField(term60727, term60727.getClass(), "scrollText", null);
        setField(term60727, term60727.getClass(), "textToShow", null);
        setIntField(term60727, term60727.getClass(), "numberOfLines", 0);
        setIntField(term60727, term60727.getClass(), "currentLine", 0);
        setBooleanField(term60727, term60727.getClass(), "smoothScroll", false);
        setBooleanField(term60727, term60727.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term60727, term60727.getClass(), "textShadow", false);
        setIntField(term60727, term60727.getClass(), "smoothScrollY", 0);
        setField(term60727, term60727.getClass(), "shadowColor", null);
        setField(term60727, term60727.getClass(), "highlightShadowColor", null);
        setField(term60727, term60727.getClass(), "highlightColor", null);
        setField(term60727, term60727.getClass(), "highlightText", null);
        setIntField(term60727, term60727.getClass(), "customCharWidth", 0);
        setIntField(term60727, term60727.getClass(), "rows", 0);
        setIntField(term60727, term60727.getClass(), "columns", 0);
        setIntField(term60727, term60727.getClass(), "columnWidth", 0);
        setIntField(term60727, term60727.getClass(), "rowHeight", 0);
        setBooleanField(term60727, term60727.getClass(), "wrap", false);
        setBooleanField(term60727, term60727.getClass(), "word", false);
        setField(term60727, term60727.getClass(), "model", null);
        setField(term60727, term60727.getClass(), "caret", null);
        setField(term60727, term60727.getClass(), "navigationFilter", null);
        setField(term60727, term60727.getClass(), "highlighter", null);
        setField(term60727, term60727.getClass(), "keymap", null);
        setField(term60727, term60727.getClass(), "caretEvent", null);
        setField(term60727, term60727.getClass(), "caretColor", null);
        setField(term60727, term60727.getClass(), "selectionColor", null);
        setField(term60727, term60727.getClass(), "selectedTextColor", null);
        setField(term60727, term60727.getClass(), "disabledTextColor", null);
        setBooleanField(term60727, term60727.getClass(), "editable", false);
        setField(term60727, term60727.getClass(), "margin", null);
        setCharField(term60727, term60727.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60727, term60727.getClass(), "dragEnabled", false);
        setField(term60727, term60727.getClass(), "dropMode", null);
        setField(term60727, term60727.getClass(), "dropLocation", null);
        setField(term60727, term60727.getClass(), "inputMethodRequestsHandler", null);
        setField(term60727, term60727.getClass(), "composedTextAttribute", null);
        setField(term60727, term60727.getClass(), "composedTextContent", null);
        setField(term60727, term60727.getClass(), "composedTextStart", null);
        setField(term60727, term60727.getClass(), "composedTextEnd", null);
        setField(term60727, term60727.getClass(), "latestCommittedTextStart", null);
        setField(term60727, term60727.getClass(), "latestCommittedTextEnd", null);
        setField(term60727, term60727.getClass(), "composedTextCaret", null);
        setField(term60727, term60727.getClass(), "originalCaret", null);
        setBooleanField(term60727, term60727.getClass(), "checkedInputOverride", false);
        setBooleanField(term60727, term60727.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60727, term60727.getClass(), "isAlignmentXSet", false);
        setFloatField(term60727, term60727.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60727, term60727.getClass(), "isAlignmentYSet", false);
        setFloatField(term60727, term60727.getClass(), "alignmentY", 0.0F);
        setField(term60727, term60727.getClass(), "ui", null);
        setField(term60727, term60727.getClass(), "listenerList", null);
        setField(term60727, term60727.getClass(), "clientProperties", null);
        setField(term60727, term60727.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60727, term60727.getClass(), "autoscrolls", false);
        setField(term60727, term60727.getClass(), "border", null);
        setIntField(term60727, term60727.getClass(), "flags", 0);
        setField(term60727, term60727.getClass(), "inputVerifier", null);
        setBooleanField(term60727, term60727.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60727, term60727.getClass(), "paintingChild", null);
        setField(term60727, term60727.getClass(), "popupMenu", null);
        setField(term60727, term60727.getClass(), "revalidateRunnableScheduled", null);
        setField(term60727, term60727.getClass(), "focusInputMap", null);
        setField(term60727, term60727.getClass(), "ancestorInputMap", null);
        setField(term60727, term60727.getClass(), "windowInputMap", null);
        setField(term60727, term60727.getClass(), "actionMap", null);
        setField(term60727, term60727.getClass(), "aaHint", null);
        setField(term60727, term60727.getClass(), "lcdRenderingHint", null);
        setField(term60727, term60727.getClass(), "component", null);
        setField(term60727, term60727.getClass(), "layoutMgr", null);
        setField(term60727, term60727.getClass(), "dispatcher", null);
        setField(term60727, term60727.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60727, term60727.getClass(), "focusCycleRoot", false);
        setBooleanField(term60727, term60727.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60727, term60727.getClass(), "printingThreads", null);
        setBooleanField(term60727, term60727.getClass(), "printing", false);
        setField(term60727, term60727.getClass(), "containerListener", null);
        setIntField(term60727, term60727.getClass(), "listeningChildren", 0);
        setIntField(term60727, term60727.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60727, term60727.getClass(), "descendantsCount", 0);
        setField(term60727, term60727.getClass(), "preserveBackgroundColor", null);
        setIntField(term60727, term60727.getClass(), "numOfHWComponents", 0);
        setIntField(term60727, term60727.getClass(), "numOfLWComponents", 0);
        setField(term60727, term60727.getClass(), "modalComp", null);
        setField(term60727, term60727.getClass(), "modalAppContext", null);
        setIntField(term60727, term60727.getClass(), "containerSerializedDataVersion", 0);
        setField(term60727, term60727.getClass(), "peer", null);
        setField(term60727, term60727.getClass(), "parent", null);
        setField(term60727, term60727.getClass(), "appContext", null);
        setIntField(term60727, term60727.getClass(), "x", 0);
        setIntField(term60727, term60727.getClass(), "y", 0);
        setIntField(term60727, term60727.getClass(), "width", 0);
        setIntField(term60727, term60727.getClass(), "height", 0);
        setField(term60727, term60727.getClass(), "foreground", null);
        setField(term60727, term60727.getClass(), "background", null);
        setField(term60727, term60727.getClass(), "font", null);
        setField(term60727, term60727.getClass(), "peerFont", null);
        setField(term60727, term60727.getClass(), "cursor", null);
        setField(term60727, term60727.getClass(), "locale", null);
        setField(term60727, term60727.getClass(), "graphicsConfig", null);
        setField(term60727, term60727.getClass(), "bufferStrategy", null);
        setBooleanField(term60727, term60727.getClass(), "ignoreRepaint", false);
        setBooleanField(term60727, term60727.getClass(), "visible", false);
        setBooleanField(term60727, term60727.getClass(), "enabled", false);
        setBooleanField(term60727, term60727.getClass(), "valid", false);
        setField(term60727, term60727.getClass(), "dropTarget", null);
        setField(term60727, term60727.getClass(), "popups", null);
        setField(term60727, term60727.getClass(), "name", null);
        setBooleanField(term60727, term60727.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60727, term60727.getClass(), "focusable", false);
        setIntField(term60727, term60727.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60727, term60727.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60727, term60727.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60727, term60727.getClass(), "acc", null);
        setField(term60727, term60727.getClass(), "minSize", null);
        setBooleanField(term60727, term60727.getClass(), "minSizeSet", false);
        setField(term60727, term60727.getClass(), "prefSize", null);
        setBooleanField(term60727, term60727.getClass(), "prefSizeSet", false);
        setField(term60727, term60727.getClass(), "maxSize", null);
        setBooleanField(term60727, term60727.getClass(), "maxSizeSet", false);
        setField(term60727, term60727.getClass(), "componentOrientation", null);
        setBooleanField(term60727, term60727.getClass(), "newEventsOnly", false);
        setField(term60727, term60727.getClass(), "componentListener", null);
        setField(term60727, term60727.getClass(), "focusListener", null);
        setField(term60727, term60727.getClass(), "hierarchyListener", null);
        setField(term60727, term60727.getClass(), "hierarchyBoundsListener", null);
        setField(term60727, term60727.getClass(), "keyListener", null);
        setField(term60727, term60727.getClass(), "mouseListener", null);
        setField(term60727, term60727.getClass(), "mouseMotionListener", null);
        setField(term60727, term60727.getClass(), "mouseWheelListener", null);
        setField(term60727, term60727.getClass(), "inputMethodListener", null);
        setLongField(term60727, term60727.getClass(), "eventMask", 0L);
        setField(term60727, term60727.getClass(), "changeSupport", null);
        setField(term60727, term60727.getClass(), "objectLock", null);
        setBooleanField(term60727, term60727.getClass(), "isPacked", false);
        setIntField(term60727, term60727.getClass(), "boundsOp", 0);
        setField(term60727, term60727.getClass(), "compoundShape", null);
        setField(term60727, term60727.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60727, term60727.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60727, term60727.getClass(), "backgroundEraseDisabled", false);
        setField(term60727, term60727.getClass(), "eventCache", null);
        setBooleanField(term60727, term60727.getClass(), "coalescingEnabled", false);
        setBooleanField(term60727, term60727.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60727, term60727.getClass(), "componentSerializedDataVersion", 0);
        setField(term60727, term60727.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHighlightText", argTypes, term60727, args);
    }

};


