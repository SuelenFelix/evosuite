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

public class InfoTextArea_isSmoothScroll_7734553522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60538;

    public InfoTextArea_isSmoothScroll_7734553522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60538 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term60538, term60538.getClass(), "blinking", false);
        setBooleanField(term60538, term60538.getClass(), "autoScroll", false);
        setField(term60538, term60538.getClass(), "scrollText", null);
        setField(term60538, term60538.getClass(), "textToShow", null);
        setIntField(term60538, term60538.getClass(), "numberOfLines", 0);
        setIntField(term60538, term60538.getClass(), "currentLine", 0);
        setBooleanField(term60538, term60538.getClass(), "smoothScroll", false);
        setBooleanField(term60538, term60538.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term60538, term60538.getClass(), "textShadow", false);
        setIntField(term60538, term60538.getClass(), "smoothScrollY", 0);
        setField(term60538, term60538.getClass(), "shadowColor", null);
        setField(term60538, term60538.getClass(), "highlightShadowColor", null);
        setField(term60538, term60538.getClass(), "highlightColor", null);
        setField(term60538, term60538.getClass(), "highlightText", null);
        setIntField(term60538, term60538.getClass(), "customCharWidth", 0);
        setIntField(term60538, term60538.getClass(), "rows", 0);
        setIntField(term60538, term60538.getClass(), "columns", 0);
        setIntField(term60538, term60538.getClass(), "columnWidth", 0);
        setIntField(term60538, term60538.getClass(), "rowHeight", 0);
        setBooleanField(term60538, term60538.getClass(), "wrap", false);
        setBooleanField(term60538, term60538.getClass(), "word", false);
        setField(term60538, term60538.getClass(), "model", null);
        setField(term60538, term60538.getClass(), "caret", null);
        setField(term60538, term60538.getClass(), "navigationFilter", null);
        setField(term60538, term60538.getClass(), "highlighter", null);
        setField(term60538, term60538.getClass(), "keymap", null);
        setField(term60538, term60538.getClass(), "caretEvent", null);
        setField(term60538, term60538.getClass(), "caretColor", null);
        setField(term60538, term60538.getClass(), "selectionColor", null);
        setField(term60538, term60538.getClass(), "selectedTextColor", null);
        setField(term60538, term60538.getClass(), "disabledTextColor", null);
        setBooleanField(term60538, term60538.getClass(), "editable", false);
        setField(term60538, term60538.getClass(), "margin", null);
        setCharField(term60538, term60538.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60538, term60538.getClass(), "dragEnabled", false);
        setField(term60538, term60538.getClass(), "dropMode", null);
        setField(term60538, term60538.getClass(), "dropLocation", null);
        setField(term60538, term60538.getClass(), "inputMethodRequestsHandler", null);
        setField(term60538, term60538.getClass(), "composedTextAttribute", null);
        setField(term60538, term60538.getClass(), "composedTextContent", null);
        setField(term60538, term60538.getClass(), "composedTextStart", null);
        setField(term60538, term60538.getClass(), "composedTextEnd", null);
        setField(term60538, term60538.getClass(), "latestCommittedTextStart", null);
        setField(term60538, term60538.getClass(), "latestCommittedTextEnd", null);
        setField(term60538, term60538.getClass(), "composedTextCaret", null);
        setField(term60538, term60538.getClass(), "originalCaret", null);
        setBooleanField(term60538, term60538.getClass(), "checkedInputOverride", false);
        setBooleanField(term60538, term60538.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60538, term60538.getClass(), "isAlignmentXSet", false);
        setFloatField(term60538, term60538.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60538, term60538.getClass(), "isAlignmentYSet", false);
        setFloatField(term60538, term60538.getClass(), "alignmentY", 0.0F);
        setField(term60538, term60538.getClass(), "ui", null);
        setField(term60538, term60538.getClass(), "listenerList", null);
        setField(term60538, term60538.getClass(), "clientProperties", null);
        setField(term60538, term60538.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60538, term60538.getClass(), "autoscrolls", false);
        setField(term60538, term60538.getClass(), "border", null);
        setIntField(term60538, term60538.getClass(), "flags", 0);
        setField(term60538, term60538.getClass(), "inputVerifier", null);
        setBooleanField(term60538, term60538.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60538, term60538.getClass(), "paintingChild", null);
        setField(term60538, term60538.getClass(), "popupMenu", null);
        setField(term60538, term60538.getClass(), "revalidateRunnableScheduled", null);
        setField(term60538, term60538.getClass(), "focusInputMap", null);
        setField(term60538, term60538.getClass(), "ancestorInputMap", null);
        setField(term60538, term60538.getClass(), "windowInputMap", null);
        setField(term60538, term60538.getClass(), "actionMap", null);
        setField(term60538, term60538.getClass(), "aaHint", null);
        setField(term60538, term60538.getClass(), "lcdRenderingHint", null);
        setField(term60538, term60538.getClass(), "component", null);
        setField(term60538, term60538.getClass(), "layoutMgr", null);
        setField(term60538, term60538.getClass(), "dispatcher", null);
        setField(term60538, term60538.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60538, term60538.getClass(), "focusCycleRoot", false);
        setBooleanField(term60538, term60538.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60538, term60538.getClass(), "printingThreads", null);
        setBooleanField(term60538, term60538.getClass(), "printing", false);
        setField(term60538, term60538.getClass(), "containerListener", null);
        setIntField(term60538, term60538.getClass(), "listeningChildren", 0);
        setIntField(term60538, term60538.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60538, term60538.getClass(), "descendantsCount", 0);
        setField(term60538, term60538.getClass(), "preserveBackgroundColor", null);
        setIntField(term60538, term60538.getClass(), "numOfHWComponents", 0);
        setIntField(term60538, term60538.getClass(), "numOfLWComponents", 0);
        setField(term60538, term60538.getClass(), "modalComp", null);
        setField(term60538, term60538.getClass(), "modalAppContext", null);
        setIntField(term60538, term60538.getClass(), "containerSerializedDataVersion", 0);
        setField(term60538, term60538.getClass(), "peer", null);
        setField(term60538, term60538.getClass(), "parent", null);
        setField(term60538, term60538.getClass(), "appContext", null);
        setIntField(term60538, term60538.getClass(), "x", 0);
        setIntField(term60538, term60538.getClass(), "y", 0);
        setIntField(term60538, term60538.getClass(), "width", 0);
        setIntField(term60538, term60538.getClass(), "height", 0);
        setField(term60538, term60538.getClass(), "foreground", null);
        setField(term60538, term60538.getClass(), "background", null);
        setField(term60538, term60538.getClass(), "font", null);
        setField(term60538, term60538.getClass(), "peerFont", null);
        setField(term60538, term60538.getClass(), "cursor", null);
        setField(term60538, term60538.getClass(), "locale", null);
        setField(term60538, term60538.getClass(), "graphicsConfig", null);
        setField(term60538, term60538.getClass(), "bufferStrategy", null);
        setBooleanField(term60538, term60538.getClass(), "ignoreRepaint", false);
        setBooleanField(term60538, term60538.getClass(), "visible", false);
        setBooleanField(term60538, term60538.getClass(), "enabled", false);
        setBooleanField(term60538, term60538.getClass(), "valid", false);
        setField(term60538, term60538.getClass(), "dropTarget", null);
        setField(term60538, term60538.getClass(), "popups", null);
        setField(term60538, term60538.getClass(), "name", null);
        setBooleanField(term60538, term60538.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60538, term60538.getClass(), "focusable", false);
        setIntField(term60538, term60538.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60538, term60538.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60538, term60538.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60538, term60538.getClass(), "acc", null);
        setField(term60538, term60538.getClass(), "minSize", null);
        setBooleanField(term60538, term60538.getClass(), "minSizeSet", false);
        setField(term60538, term60538.getClass(), "prefSize", null);
        setBooleanField(term60538, term60538.getClass(), "prefSizeSet", false);
        setField(term60538, term60538.getClass(), "maxSize", null);
        setBooleanField(term60538, term60538.getClass(), "maxSizeSet", false);
        setField(term60538, term60538.getClass(), "componentOrientation", null);
        setBooleanField(term60538, term60538.getClass(), "newEventsOnly", false);
        setField(term60538, term60538.getClass(), "componentListener", null);
        setField(term60538, term60538.getClass(), "focusListener", null);
        setField(term60538, term60538.getClass(), "hierarchyListener", null);
        setField(term60538, term60538.getClass(), "hierarchyBoundsListener", null);
        setField(term60538, term60538.getClass(), "keyListener", null);
        setField(term60538, term60538.getClass(), "mouseListener", null);
        setField(term60538, term60538.getClass(), "mouseMotionListener", null);
        setField(term60538, term60538.getClass(), "mouseWheelListener", null);
        setField(term60538, term60538.getClass(), "inputMethodListener", null);
        setLongField(term60538, term60538.getClass(), "eventMask", 0L);
        setField(term60538, term60538.getClass(), "changeSupport", null);
        setField(term60538, term60538.getClass(), "objectLock", null);
        setBooleanField(term60538, term60538.getClass(), "isPacked", false);
        setIntField(term60538, term60538.getClass(), "boundsOp", 0);
        setField(term60538, term60538.getClass(), "compoundShape", null);
        setField(term60538, term60538.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60538, term60538.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60538, term60538.getClass(), "backgroundEraseDisabled", false);
        setField(term60538, term60538.getClass(), "eventCache", null);
        setBooleanField(term60538, term60538.getClass(), "coalescingEnabled", false);
        setBooleanField(term60538, term60538.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60538, term60538.getClass(), "componentSerializedDataVersion", 0);
        setField(term60538, term60538.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSmoothScroll", argTypes, term60538, args);
    }

};


