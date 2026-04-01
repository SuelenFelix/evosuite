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

public class InfoTextArea_getYOffset_204788104021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60477;

    public InfoTextArea_getYOffset_204788104021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60477 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term60477, term60477.getClass(), "blinking", false);
        setBooleanField(term60477, term60477.getClass(), "autoScroll", false);
        setField(term60477, term60477.getClass(), "scrollText", null);
        setField(term60477, term60477.getClass(), "textToShow", null);
        setIntField(term60477, term60477.getClass(), "numberOfLines", 0);
        setIntField(term60477, term60477.getClass(), "currentLine", 0);
        setBooleanField(term60477, term60477.getClass(), "smoothScroll", false);
        setBooleanField(term60477, term60477.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term60477, term60477.getClass(), "textShadow", false);
        setIntField(term60477, term60477.getClass(), "smoothScrollY", 0);
        setField(term60477, term60477.getClass(), "shadowColor", null);
        setField(term60477, term60477.getClass(), "highlightShadowColor", null);
        setField(term60477, term60477.getClass(), "highlightColor", null);
        setField(term60477, term60477.getClass(), "highlightText", null);
        setIntField(term60477, term60477.getClass(), "customCharWidth", 0);
        setIntField(term60477, term60477.getClass(), "rows", 0);
        setIntField(term60477, term60477.getClass(), "columns", 0);
        setIntField(term60477, term60477.getClass(), "columnWidth", 0);
        setIntField(term60477, term60477.getClass(), "rowHeight", 0);
        setBooleanField(term60477, term60477.getClass(), "wrap", false);
        setBooleanField(term60477, term60477.getClass(), "word", false);
        setField(term60477, term60477.getClass(), "model", null);
        setField(term60477, term60477.getClass(), "caret", null);
        setField(term60477, term60477.getClass(), "navigationFilter", null);
        setField(term60477, term60477.getClass(), "highlighter", null);
        setField(term60477, term60477.getClass(), "keymap", null);
        setField(term60477, term60477.getClass(), "caretEvent", null);
        setField(term60477, term60477.getClass(), "caretColor", null);
        setField(term60477, term60477.getClass(), "selectionColor", null);
        setField(term60477, term60477.getClass(), "selectedTextColor", null);
        setField(term60477, term60477.getClass(), "disabledTextColor", null);
        setBooleanField(term60477, term60477.getClass(), "editable", false);
        setField(term60477, term60477.getClass(), "margin", null);
        setCharField(term60477, term60477.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60477, term60477.getClass(), "dragEnabled", false);
        setField(term60477, term60477.getClass(), "dropMode", null);
        setField(term60477, term60477.getClass(), "dropLocation", null);
        setField(term60477, term60477.getClass(), "inputMethodRequestsHandler", null);
        setField(term60477, term60477.getClass(), "composedTextAttribute", null);
        setField(term60477, term60477.getClass(), "composedTextContent", null);
        setField(term60477, term60477.getClass(), "composedTextStart", null);
        setField(term60477, term60477.getClass(), "composedTextEnd", null);
        setField(term60477, term60477.getClass(), "latestCommittedTextStart", null);
        setField(term60477, term60477.getClass(), "latestCommittedTextEnd", null);
        setField(term60477, term60477.getClass(), "composedTextCaret", null);
        setField(term60477, term60477.getClass(), "originalCaret", null);
        setBooleanField(term60477, term60477.getClass(), "checkedInputOverride", false);
        setBooleanField(term60477, term60477.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60477, term60477.getClass(), "isAlignmentXSet", false);
        setFloatField(term60477, term60477.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60477, term60477.getClass(), "isAlignmentYSet", false);
        setFloatField(term60477, term60477.getClass(), "alignmentY", 0.0F);
        setField(term60477, term60477.getClass(), "ui", null);
        setField(term60477, term60477.getClass(), "listenerList", null);
        setField(term60477, term60477.getClass(), "clientProperties", null);
        setField(term60477, term60477.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60477, term60477.getClass(), "autoscrolls", false);
        setField(term60477, term60477.getClass(), "border", null);
        setIntField(term60477, term60477.getClass(), "flags", 0);
        setField(term60477, term60477.getClass(), "inputVerifier", null);
        setBooleanField(term60477, term60477.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60477, term60477.getClass(), "paintingChild", null);
        setField(term60477, term60477.getClass(), "popupMenu", null);
        setField(term60477, term60477.getClass(), "revalidateRunnableScheduled", null);
        setField(term60477, term60477.getClass(), "focusInputMap", null);
        setField(term60477, term60477.getClass(), "ancestorInputMap", null);
        setField(term60477, term60477.getClass(), "windowInputMap", null);
        setField(term60477, term60477.getClass(), "actionMap", null);
        setField(term60477, term60477.getClass(), "aaHint", null);
        setField(term60477, term60477.getClass(), "lcdRenderingHint", null);
        setField(term60477, term60477.getClass(), "component", null);
        setField(term60477, term60477.getClass(), "layoutMgr", null);
        setField(term60477, term60477.getClass(), "dispatcher", null);
        setField(term60477, term60477.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60477, term60477.getClass(), "focusCycleRoot", false);
        setBooleanField(term60477, term60477.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60477, term60477.getClass(), "printingThreads", null);
        setBooleanField(term60477, term60477.getClass(), "printing", false);
        setField(term60477, term60477.getClass(), "containerListener", null);
        setIntField(term60477, term60477.getClass(), "listeningChildren", 0);
        setIntField(term60477, term60477.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60477, term60477.getClass(), "descendantsCount", 0);
        setField(term60477, term60477.getClass(), "preserveBackgroundColor", null);
        setIntField(term60477, term60477.getClass(), "numOfHWComponents", 0);
        setIntField(term60477, term60477.getClass(), "numOfLWComponents", 0);
        setField(term60477, term60477.getClass(), "modalComp", null);
        setField(term60477, term60477.getClass(), "modalAppContext", null);
        setIntField(term60477, term60477.getClass(), "containerSerializedDataVersion", 0);
        setField(term60477, term60477.getClass(), "peer", null);
        setField(term60477, term60477.getClass(), "parent", null);
        setField(term60477, term60477.getClass(), "appContext", null);
        setIntField(term60477, term60477.getClass(), "x", 0);
        setIntField(term60477, term60477.getClass(), "y", 0);
        setIntField(term60477, term60477.getClass(), "width", 0);
        setIntField(term60477, term60477.getClass(), "height", 0);
        setField(term60477, term60477.getClass(), "foreground", null);
        setField(term60477, term60477.getClass(), "background", null);
        setField(term60477, term60477.getClass(), "font", null);
        setField(term60477, term60477.getClass(), "peerFont", null);
        setField(term60477, term60477.getClass(), "cursor", null);
        setField(term60477, term60477.getClass(), "locale", null);
        setField(term60477, term60477.getClass(), "graphicsConfig", null);
        setField(term60477, term60477.getClass(), "bufferStrategy", null);
        setBooleanField(term60477, term60477.getClass(), "ignoreRepaint", false);
        setBooleanField(term60477, term60477.getClass(), "visible", false);
        setBooleanField(term60477, term60477.getClass(), "enabled", false);
        setBooleanField(term60477, term60477.getClass(), "valid", false);
        setField(term60477, term60477.getClass(), "dropTarget", null);
        setField(term60477, term60477.getClass(), "popups", null);
        setField(term60477, term60477.getClass(), "name", null);
        setBooleanField(term60477, term60477.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60477, term60477.getClass(), "focusable", false);
        setIntField(term60477, term60477.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60477, term60477.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60477, term60477.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60477, term60477.getClass(), "acc", null);
        setField(term60477, term60477.getClass(), "minSize", null);
        setBooleanField(term60477, term60477.getClass(), "minSizeSet", false);
        setField(term60477, term60477.getClass(), "prefSize", null);
        setBooleanField(term60477, term60477.getClass(), "prefSizeSet", false);
        setField(term60477, term60477.getClass(), "maxSize", null);
        setBooleanField(term60477, term60477.getClass(), "maxSizeSet", false);
        setField(term60477, term60477.getClass(), "componentOrientation", null);
        setBooleanField(term60477, term60477.getClass(), "newEventsOnly", false);
        setField(term60477, term60477.getClass(), "componentListener", null);
        setField(term60477, term60477.getClass(), "focusListener", null);
        setField(term60477, term60477.getClass(), "hierarchyListener", null);
        setField(term60477, term60477.getClass(), "hierarchyBoundsListener", null);
        setField(term60477, term60477.getClass(), "keyListener", null);
        setField(term60477, term60477.getClass(), "mouseListener", null);
        setField(term60477, term60477.getClass(), "mouseMotionListener", null);
        setField(term60477, term60477.getClass(), "mouseWheelListener", null);
        setField(term60477, term60477.getClass(), "inputMethodListener", null);
        setLongField(term60477, term60477.getClass(), "eventMask", 0L);
        setField(term60477, term60477.getClass(), "changeSupport", null);
        setField(term60477, term60477.getClass(), "objectLock", null);
        setBooleanField(term60477, term60477.getClass(), "isPacked", false);
        setIntField(term60477, term60477.getClass(), "boundsOp", 0);
        setField(term60477, term60477.getClass(), "compoundShape", null);
        setField(term60477, term60477.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60477, term60477.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60477, term60477.getClass(), "backgroundEraseDisabled", false);
        setField(term60477, term60477.getClass(), "eventCache", null);
        setBooleanField(term60477, term60477.getClass(), "coalescingEnabled", false);
        setBooleanField(term60477, term60477.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60477, term60477.getClass(), "componentSerializedDataVersion", 0);
        setField(term60477, term60477.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYOffset", argTypes, term60477, args);
    }

};


