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

public class InfoTextArea_getNextLine_83785962733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61032;

    public InfoTextArea_getNextLine_83785962733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61032 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term61032, term61032.getClass(), "blinking", false);
        setBooleanField(term61032, term61032.getClass(), "autoScroll", false);
        setField(term61032, term61032.getClass(), "scrollText", null);
        setField(term61032, term61032.getClass(), "textToShow", null);
        setIntField(term61032, term61032.getClass(), "numberOfLines", 0);
        setIntField(term61032, term61032.getClass(), "currentLine", 0);
        setBooleanField(term61032, term61032.getClass(), "smoothScroll", false);
        setBooleanField(term61032, term61032.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term61032, term61032.getClass(), "textShadow", false);
        setIntField(term61032, term61032.getClass(), "smoothScrollY", 0);
        setField(term61032, term61032.getClass(), "shadowColor", null);
        setField(term61032, term61032.getClass(), "highlightShadowColor", null);
        setField(term61032, term61032.getClass(), "highlightColor", null);
        setField(term61032, term61032.getClass(), "highlightText", null);
        setIntField(term61032, term61032.getClass(), "customCharWidth", 0);
        setIntField(term61032, term61032.getClass(), "rows", 0);
        setIntField(term61032, term61032.getClass(), "columns", 0);
        setIntField(term61032, term61032.getClass(), "columnWidth", 0);
        setIntField(term61032, term61032.getClass(), "rowHeight", 0);
        setBooleanField(term61032, term61032.getClass(), "wrap", false);
        setBooleanField(term61032, term61032.getClass(), "word", false);
        setField(term61032, term61032.getClass(), "model", null);
        setField(term61032, term61032.getClass(), "caret", null);
        setField(term61032, term61032.getClass(), "navigationFilter", null);
        setField(term61032, term61032.getClass(), "highlighter", null);
        setField(term61032, term61032.getClass(), "keymap", null);
        setField(term61032, term61032.getClass(), "caretEvent", null);
        setField(term61032, term61032.getClass(), "caretColor", null);
        setField(term61032, term61032.getClass(), "selectionColor", null);
        setField(term61032, term61032.getClass(), "selectedTextColor", null);
        setField(term61032, term61032.getClass(), "disabledTextColor", null);
        setBooleanField(term61032, term61032.getClass(), "editable", false);
        setField(term61032, term61032.getClass(), "margin", null);
        setCharField(term61032, term61032.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term61032, term61032.getClass(), "dragEnabled", false);
        setField(term61032, term61032.getClass(), "dropMode", null);
        setField(term61032, term61032.getClass(), "dropLocation", null);
        setField(term61032, term61032.getClass(), "inputMethodRequestsHandler", null);
        setField(term61032, term61032.getClass(), "composedTextAttribute", null);
        setField(term61032, term61032.getClass(), "composedTextContent", null);
        setField(term61032, term61032.getClass(), "composedTextStart", null);
        setField(term61032, term61032.getClass(), "composedTextEnd", null);
        setField(term61032, term61032.getClass(), "latestCommittedTextStart", null);
        setField(term61032, term61032.getClass(), "latestCommittedTextEnd", null);
        setField(term61032, term61032.getClass(), "composedTextCaret", null);
        setField(term61032, term61032.getClass(), "originalCaret", null);
        setBooleanField(term61032, term61032.getClass(), "checkedInputOverride", false);
        setBooleanField(term61032, term61032.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term61032, term61032.getClass(), "isAlignmentXSet", false);
        setFloatField(term61032, term61032.getClass(), "alignmentX", 0.0F);
        setBooleanField(term61032, term61032.getClass(), "isAlignmentYSet", false);
        setFloatField(term61032, term61032.getClass(), "alignmentY", 0.0F);
        setField(term61032, term61032.getClass(), "ui", null);
        setField(term61032, term61032.getClass(), "listenerList", null);
        setField(term61032, term61032.getClass(), "clientProperties", null);
        setField(term61032, term61032.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term61032, term61032.getClass(), "autoscrolls", false);
        setField(term61032, term61032.getClass(), "border", null);
        setIntField(term61032, term61032.getClass(), "flags", 0);
        setField(term61032, term61032.getClass(), "inputVerifier", null);
        setBooleanField(term61032, term61032.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term61032, term61032.getClass(), "paintingChild", null);
        setField(term61032, term61032.getClass(), "popupMenu", null);
        setField(term61032, term61032.getClass(), "revalidateRunnableScheduled", null);
        setField(term61032, term61032.getClass(), "focusInputMap", null);
        setField(term61032, term61032.getClass(), "ancestorInputMap", null);
        setField(term61032, term61032.getClass(), "windowInputMap", null);
        setField(term61032, term61032.getClass(), "actionMap", null);
        setField(term61032, term61032.getClass(), "aaHint", null);
        setField(term61032, term61032.getClass(), "lcdRenderingHint", null);
        setField(term61032, term61032.getClass(), "component", null);
        setField(term61032, term61032.getClass(), "layoutMgr", null);
        setField(term61032, term61032.getClass(), "dispatcher", null);
        setField(term61032, term61032.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term61032, term61032.getClass(), "focusCycleRoot", false);
        setBooleanField(term61032, term61032.getClass(), "focusTraversalPolicyProvider", false);
        setField(term61032, term61032.getClass(), "printingThreads", null);
        setBooleanField(term61032, term61032.getClass(), "printing", false);
        setField(term61032, term61032.getClass(), "containerListener", null);
        setIntField(term61032, term61032.getClass(), "listeningChildren", 0);
        setIntField(term61032, term61032.getClass(), "listeningBoundsChildren", 0);
        setIntField(term61032, term61032.getClass(), "descendantsCount", 0);
        setField(term61032, term61032.getClass(), "preserveBackgroundColor", null);
        setIntField(term61032, term61032.getClass(), "numOfHWComponents", 0);
        setIntField(term61032, term61032.getClass(), "numOfLWComponents", 0);
        setField(term61032, term61032.getClass(), "modalComp", null);
        setField(term61032, term61032.getClass(), "modalAppContext", null);
        setIntField(term61032, term61032.getClass(), "containerSerializedDataVersion", 0);
        setField(term61032, term61032.getClass(), "peer", null);
        setField(term61032, term61032.getClass(), "parent", null);
        setField(term61032, term61032.getClass(), "appContext", null);
        setIntField(term61032, term61032.getClass(), "x", 0);
        setIntField(term61032, term61032.getClass(), "y", 0);
        setIntField(term61032, term61032.getClass(), "width", 0);
        setIntField(term61032, term61032.getClass(), "height", 0);
        setField(term61032, term61032.getClass(), "foreground", null);
        setField(term61032, term61032.getClass(), "background", null);
        setField(term61032, term61032.getClass(), "font", null);
        setField(term61032, term61032.getClass(), "peerFont", null);
        setField(term61032, term61032.getClass(), "cursor", null);
        setField(term61032, term61032.getClass(), "locale", null);
        setField(term61032, term61032.getClass(), "graphicsConfig", null);
        setField(term61032, term61032.getClass(), "bufferStrategy", null);
        setBooleanField(term61032, term61032.getClass(), "ignoreRepaint", false);
        setBooleanField(term61032, term61032.getClass(), "visible", false);
        setBooleanField(term61032, term61032.getClass(), "enabled", false);
        setBooleanField(term61032, term61032.getClass(), "valid", false);
        setField(term61032, term61032.getClass(), "dropTarget", null);
        setField(term61032, term61032.getClass(), "popups", null);
        setField(term61032, term61032.getClass(), "name", null);
        setBooleanField(term61032, term61032.getClass(), "nameExplicitlySet", false);
        setBooleanField(term61032, term61032.getClass(), "focusable", false);
        setIntField(term61032, term61032.getClass(), "isFocusTraversableOverridden", 0);
        setField(term61032, term61032.getClass(), "focusTraversalKeys", null);
        setBooleanField(term61032, term61032.getClass(), "focusTraversalKeysEnabled", false);
        setField(term61032, term61032.getClass(), "acc", null);
        setField(term61032, term61032.getClass(), "minSize", null);
        setBooleanField(term61032, term61032.getClass(), "minSizeSet", false);
        setField(term61032, term61032.getClass(), "prefSize", null);
        setBooleanField(term61032, term61032.getClass(), "prefSizeSet", false);
        setField(term61032, term61032.getClass(), "maxSize", null);
        setBooleanField(term61032, term61032.getClass(), "maxSizeSet", false);
        setField(term61032, term61032.getClass(), "componentOrientation", null);
        setBooleanField(term61032, term61032.getClass(), "newEventsOnly", false);
        setField(term61032, term61032.getClass(), "componentListener", null);
        setField(term61032, term61032.getClass(), "focusListener", null);
        setField(term61032, term61032.getClass(), "hierarchyListener", null);
        setField(term61032, term61032.getClass(), "hierarchyBoundsListener", null);
        setField(term61032, term61032.getClass(), "keyListener", null);
        setField(term61032, term61032.getClass(), "mouseListener", null);
        setField(term61032, term61032.getClass(), "mouseMotionListener", null);
        setField(term61032, term61032.getClass(), "mouseWheelListener", null);
        setField(term61032, term61032.getClass(), "inputMethodListener", null);
        setLongField(term61032, term61032.getClass(), "eventMask", 0L);
        setField(term61032, term61032.getClass(), "changeSupport", null);
        setField(term61032, term61032.getClass(), "objectLock", null);
        setBooleanField(term61032, term61032.getClass(), "isPacked", false);
        setIntField(term61032, term61032.getClass(), "boundsOp", 0);
        setField(term61032, term61032.getClass(), "compoundShape", null);
        setField(term61032, term61032.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term61032, term61032.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term61032, term61032.getClass(), "backgroundEraseDisabled", false);
        setField(term61032, term61032.getClass(), "eventCache", null);
        setBooleanField(term61032, term61032.getClass(), "coalescingEnabled", false);
        setBooleanField(term61032, term61032.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term61032, term61032.getClass(), "componentSerializedDataVersion", 0);
        setField(term61032, term61032.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextLine", argTypes, term61032, args);
    }

};


