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

public class InfoTextArea_getText_134256224227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60666;

    public InfoTextArea_getText_134256224227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60666 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term60666, term60666.getClass(), "blinking", false);
        setBooleanField(term60666, term60666.getClass(), "autoScroll", false);
        setField(term60666, term60666.getClass(), "scrollText", null);
        setField(term60666, term60666.getClass(), "textToShow", null);
        setIntField(term60666, term60666.getClass(), "numberOfLines", 0);
        setIntField(term60666, term60666.getClass(), "currentLine", 0);
        setBooleanField(term60666, term60666.getClass(), "smoothScroll", false);
        setBooleanField(term60666, term60666.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term60666, term60666.getClass(), "textShadow", false);
        setIntField(term60666, term60666.getClass(), "smoothScrollY", 0);
        setField(term60666, term60666.getClass(), "shadowColor", null);
        setField(term60666, term60666.getClass(), "highlightShadowColor", null);
        setField(term60666, term60666.getClass(), "highlightColor", null);
        setField(term60666, term60666.getClass(), "highlightText", null);
        setIntField(term60666, term60666.getClass(), "customCharWidth", 0);
        setIntField(term60666, term60666.getClass(), "rows", 0);
        setIntField(term60666, term60666.getClass(), "columns", 0);
        setIntField(term60666, term60666.getClass(), "columnWidth", 0);
        setIntField(term60666, term60666.getClass(), "rowHeight", 0);
        setBooleanField(term60666, term60666.getClass(), "wrap", false);
        setBooleanField(term60666, term60666.getClass(), "word", false);
        setField(term60666, term60666.getClass(), "model", null);
        setField(term60666, term60666.getClass(), "caret", null);
        setField(term60666, term60666.getClass(), "navigationFilter", null);
        setField(term60666, term60666.getClass(), "highlighter", null);
        setField(term60666, term60666.getClass(), "keymap", null);
        setField(term60666, term60666.getClass(), "caretEvent", null);
        setField(term60666, term60666.getClass(), "caretColor", null);
        setField(term60666, term60666.getClass(), "selectionColor", null);
        setField(term60666, term60666.getClass(), "selectedTextColor", null);
        setField(term60666, term60666.getClass(), "disabledTextColor", null);
        setBooleanField(term60666, term60666.getClass(), "editable", false);
        setField(term60666, term60666.getClass(), "margin", null);
        setCharField(term60666, term60666.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60666, term60666.getClass(), "dragEnabled", false);
        setField(term60666, term60666.getClass(), "dropMode", null);
        setField(term60666, term60666.getClass(), "dropLocation", null);
        setField(term60666, term60666.getClass(), "inputMethodRequestsHandler", null);
        setField(term60666, term60666.getClass(), "composedTextAttribute", null);
        setField(term60666, term60666.getClass(), "composedTextContent", null);
        setField(term60666, term60666.getClass(), "composedTextStart", null);
        setField(term60666, term60666.getClass(), "composedTextEnd", null);
        setField(term60666, term60666.getClass(), "latestCommittedTextStart", null);
        setField(term60666, term60666.getClass(), "latestCommittedTextEnd", null);
        setField(term60666, term60666.getClass(), "composedTextCaret", null);
        setField(term60666, term60666.getClass(), "originalCaret", null);
        setBooleanField(term60666, term60666.getClass(), "checkedInputOverride", false);
        setBooleanField(term60666, term60666.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60666, term60666.getClass(), "isAlignmentXSet", false);
        setFloatField(term60666, term60666.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60666, term60666.getClass(), "isAlignmentYSet", false);
        setFloatField(term60666, term60666.getClass(), "alignmentY", 0.0F);
        setField(term60666, term60666.getClass(), "ui", null);
        setField(term60666, term60666.getClass(), "listenerList", null);
        setField(term60666, term60666.getClass(), "clientProperties", null);
        setField(term60666, term60666.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60666, term60666.getClass(), "autoscrolls", false);
        setField(term60666, term60666.getClass(), "border", null);
        setIntField(term60666, term60666.getClass(), "flags", 0);
        setField(term60666, term60666.getClass(), "inputVerifier", null);
        setBooleanField(term60666, term60666.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60666, term60666.getClass(), "paintingChild", null);
        setField(term60666, term60666.getClass(), "popupMenu", null);
        setField(term60666, term60666.getClass(), "revalidateRunnableScheduled", null);
        setField(term60666, term60666.getClass(), "focusInputMap", null);
        setField(term60666, term60666.getClass(), "ancestorInputMap", null);
        setField(term60666, term60666.getClass(), "windowInputMap", null);
        setField(term60666, term60666.getClass(), "actionMap", null);
        setField(term60666, term60666.getClass(), "aaHint", null);
        setField(term60666, term60666.getClass(), "lcdRenderingHint", null);
        setField(term60666, term60666.getClass(), "component", null);
        setField(term60666, term60666.getClass(), "layoutMgr", null);
        setField(term60666, term60666.getClass(), "dispatcher", null);
        setField(term60666, term60666.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60666, term60666.getClass(), "focusCycleRoot", false);
        setBooleanField(term60666, term60666.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60666, term60666.getClass(), "printingThreads", null);
        setBooleanField(term60666, term60666.getClass(), "printing", false);
        setField(term60666, term60666.getClass(), "containerListener", null);
        setIntField(term60666, term60666.getClass(), "listeningChildren", 0);
        setIntField(term60666, term60666.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60666, term60666.getClass(), "descendantsCount", 0);
        setField(term60666, term60666.getClass(), "preserveBackgroundColor", null);
        setIntField(term60666, term60666.getClass(), "numOfHWComponents", 0);
        setIntField(term60666, term60666.getClass(), "numOfLWComponents", 0);
        setField(term60666, term60666.getClass(), "modalComp", null);
        setField(term60666, term60666.getClass(), "modalAppContext", null);
        setIntField(term60666, term60666.getClass(), "containerSerializedDataVersion", 0);
        setField(term60666, term60666.getClass(), "peer", null);
        setField(term60666, term60666.getClass(), "parent", null);
        setField(term60666, term60666.getClass(), "appContext", null);
        setIntField(term60666, term60666.getClass(), "x", 0);
        setIntField(term60666, term60666.getClass(), "y", 0);
        setIntField(term60666, term60666.getClass(), "width", 0);
        setIntField(term60666, term60666.getClass(), "height", 0);
        setField(term60666, term60666.getClass(), "foreground", null);
        setField(term60666, term60666.getClass(), "background", null);
        setField(term60666, term60666.getClass(), "font", null);
        setField(term60666, term60666.getClass(), "peerFont", null);
        setField(term60666, term60666.getClass(), "cursor", null);
        setField(term60666, term60666.getClass(), "locale", null);
        setField(term60666, term60666.getClass(), "graphicsConfig", null);
        setField(term60666, term60666.getClass(), "bufferStrategy", null);
        setBooleanField(term60666, term60666.getClass(), "ignoreRepaint", false);
        setBooleanField(term60666, term60666.getClass(), "visible", false);
        setBooleanField(term60666, term60666.getClass(), "enabled", false);
        setBooleanField(term60666, term60666.getClass(), "valid", false);
        setField(term60666, term60666.getClass(), "dropTarget", null);
        setField(term60666, term60666.getClass(), "popups", null);
        setField(term60666, term60666.getClass(), "name", null);
        setBooleanField(term60666, term60666.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60666, term60666.getClass(), "focusable", false);
        setIntField(term60666, term60666.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60666, term60666.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60666, term60666.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60666, term60666.getClass(), "acc", null);
        setField(term60666, term60666.getClass(), "minSize", null);
        setBooleanField(term60666, term60666.getClass(), "minSizeSet", false);
        setField(term60666, term60666.getClass(), "prefSize", null);
        setBooleanField(term60666, term60666.getClass(), "prefSizeSet", false);
        setField(term60666, term60666.getClass(), "maxSize", null);
        setBooleanField(term60666, term60666.getClass(), "maxSizeSet", false);
        setField(term60666, term60666.getClass(), "componentOrientation", null);
        setBooleanField(term60666, term60666.getClass(), "newEventsOnly", false);
        setField(term60666, term60666.getClass(), "componentListener", null);
        setField(term60666, term60666.getClass(), "focusListener", null);
        setField(term60666, term60666.getClass(), "hierarchyListener", null);
        setField(term60666, term60666.getClass(), "hierarchyBoundsListener", null);
        setField(term60666, term60666.getClass(), "keyListener", null);
        setField(term60666, term60666.getClass(), "mouseListener", null);
        setField(term60666, term60666.getClass(), "mouseMotionListener", null);
        setField(term60666, term60666.getClass(), "mouseWheelListener", null);
        setField(term60666, term60666.getClass(), "inputMethodListener", null);
        setLongField(term60666, term60666.getClass(), "eventMask", 0L);
        setField(term60666, term60666.getClass(), "changeSupport", null);
        setField(term60666, term60666.getClass(), "objectLock", null);
        setBooleanField(term60666, term60666.getClass(), "isPacked", false);
        setIntField(term60666, term60666.getClass(), "boundsOp", 0);
        setField(term60666, term60666.getClass(), "compoundShape", null);
        setField(term60666, term60666.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60666, term60666.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60666, term60666.getClass(), "backgroundEraseDisabled", false);
        setField(term60666, term60666.getClass(), "eventCache", null);
        setBooleanField(term60666, term60666.getClass(), "coalescingEnabled", false);
        setBooleanField(term60666, term60666.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60666, term60666.getClass(), "componentSerializedDataVersion", 0);
        setField(term60666, term60666.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term60666, args);
    }

};


