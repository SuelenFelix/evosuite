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

public class InfoTextArea_disableScrollText_29411953632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60971;

    public InfoTextArea_disableScrollText_29411953632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60971 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term60971, term60971.getClass(), "blinking", false);
        setBooleanField(term60971, term60971.getClass(), "autoScroll", false);
        setField(term60971, term60971.getClass(), "scrollText", null);
        setField(term60971, term60971.getClass(), "textToShow", null);
        setIntField(term60971, term60971.getClass(), "numberOfLines", 0);
        setIntField(term60971, term60971.getClass(), "currentLine", 0);
        setBooleanField(term60971, term60971.getClass(), "smoothScroll", false);
        setBooleanField(term60971, term60971.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term60971, term60971.getClass(), "textShadow", false);
        setIntField(term60971, term60971.getClass(), "smoothScrollY", 0);
        setField(term60971, term60971.getClass(), "shadowColor", null);
        setField(term60971, term60971.getClass(), "highlightShadowColor", null);
        setField(term60971, term60971.getClass(), "highlightColor", null);
        setField(term60971, term60971.getClass(), "highlightText", null);
        setIntField(term60971, term60971.getClass(), "customCharWidth", 0);
        setIntField(term60971, term60971.getClass(), "rows", 0);
        setIntField(term60971, term60971.getClass(), "columns", 0);
        setIntField(term60971, term60971.getClass(), "columnWidth", 0);
        setIntField(term60971, term60971.getClass(), "rowHeight", 0);
        setBooleanField(term60971, term60971.getClass(), "wrap", false);
        setBooleanField(term60971, term60971.getClass(), "word", false);
        setField(term60971, term60971.getClass(), "model", null);
        setField(term60971, term60971.getClass(), "caret", null);
        setField(term60971, term60971.getClass(), "navigationFilter", null);
        setField(term60971, term60971.getClass(), "highlighter", null);
        setField(term60971, term60971.getClass(), "keymap", null);
        setField(term60971, term60971.getClass(), "caretEvent", null);
        setField(term60971, term60971.getClass(), "caretColor", null);
        setField(term60971, term60971.getClass(), "selectionColor", null);
        setField(term60971, term60971.getClass(), "selectedTextColor", null);
        setField(term60971, term60971.getClass(), "disabledTextColor", null);
        setBooleanField(term60971, term60971.getClass(), "editable", false);
        setField(term60971, term60971.getClass(), "margin", null);
        setCharField(term60971, term60971.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60971, term60971.getClass(), "dragEnabled", false);
        setField(term60971, term60971.getClass(), "dropMode", null);
        setField(term60971, term60971.getClass(), "dropLocation", null);
        setField(term60971, term60971.getClass(), "inputMethodRequestsHandler", null);
        setField(term60971, term60971.getClass(), "composedTextAttribute", null);
        setField(term60971, term60971.getClass(), "composedTextContent", null);
        setField(term60971, term60971.getClass(), "composedTextStart", null);
        setField(term60971, term60971.getClass(), "composedTextEnd", null);
        setField(term60971, term60971.getClass(), "latestCommittedTextStart", null);
        setField(term60971, term60971.getClass(), "latestCommittedTextEnd", null);
        setField(term60971, term60971.getClass(), "composedTextCaret", null);
        setField(term60971, term60971.getClass(), "originalCaret", null);
        setBooleanField(term60971, term60971.getClass(), "checkedInputOverride", false);
        setBooleanField(term60971, term60971.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60971, term60971.getClass(), "isAlignmentXSet", false);
        setFloatField(term60971, term60971.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60971, term60971.getClass(), "isAlignmentYSet", false);
        setFloatField(term60971, term60971.getClass(), "alignmentY", 0.0F);
        setField(term60971, term60971.getClass(), "ui", null);
        setField(term60971, term60971.getClass(), "listenerList", null);
        setField(term60971, term60971.getClass(), "clientProperties", null);
        setField(term60971, term60971.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60971, term60971.getClass(), "autoscrolls", false);
        setField(term60971, term60971.getClass(), "border", null);
        setIntField(term60971, term60971.getClass(), "flags", 0);
        setField(term60971, term60971.getClass(), "inputVerifier", null);
        setBooleanField(term60971, term60971.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60971, term60971.getClass(), "paintingChild", null);
        setField(term60971, term60971.getClass(), "popupMenu", null);
        setField(term60971, term60971.getClass(), "revalidateRunnableScheduled", null);
        setField(term60971, term60971.getClass(), "focusInputMap", null);
        setField(term60971, term60971.getClass(), "ancestorInputMap", null);
        setField(term60971, term60971.getClass(), "windowInputMap", null);
        setField(term60971, term60971.getClass(), "actionMap", null);
        setField(term60971, term60971.getClass(), "aaHint", null);
        setField(term60971, term60971.getClass(), "lcdRenderingHint", null);
        setField(term60971, term60971.getClass(), "component", null);
        setField(term60971, term60971.getClass(), "layoutMgr", null);
        setField(term60971, term60971.getClass(), "dispatcher", null);
        setField(term60971, term60971.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60971, term60971.getClass(), "focusCycleRoot", false);
        setBooleanField(term60971, term60971.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60971, term60971.getClass(), "printingThreads", null);
        setBooleanField(term60971, term60971.getClass(), "printing", false);
        setField(term60971, term60971.getClass(), "containerListener", null);
        setIntField(term60971, term60971.getClass(), "listeningChildren", 0);
        setIntField(term60971, term60971.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60971, term60971.getClass(), "descendantsCount", 0);
        setField(term60971, term60971.getClass(), "preserveBackgroundColor", null);
        setIntField(term60971, term60971.getClass(), "numOfHWComponents", 0);
        setIntField(term60971, term60971.getClass(), "numOfLWComponents", 0);
        setField(term60971, term60971.getClass(), "modalComp", null);
        setField(term60971, term60971.getClass(), "modalAppContext", null);
        setIntField(term60971, term60971.getClass(), "containerSerializedDataVersion", 0);
        setField(term60971, term60971.getClass(), "peer", null);
        setField(term60971, term60971.getClass(), "parent", null);
        setField(term60971, term60971.getClass(), "appContext", null);
        setIntField(term60971, term60971.getClass(), "x", 0);
        setIntField(term60971, term60971.getClass(), "y", 0);
        setIntField(term60971, term60971.getClass(), "width", 0);
        setIntField(term60971, term60971.getClass(), "height", 0);
        setField(term60971, term60971.getClass(), "foreground", null);
        setField(term60971, term60971.getClass(), "background", null);
        setField(term60971, term60971.getClass(), "font", null);
        setField(term60971, term60971.getClass(), "peerFont", null);
        setField(term60971, term60971.getClass(), "cursor", null);
        setField(term60971, term60971.getClass(), "locale", null);
        setField(term60971, term60971.getClass(), "graphicsConfig", null);
        setField(term60971, term60971.getClass(), "bufferStrategy", null);
        setBooleanField(term60971, term60971.getClass(), "ignoreRepaint", false);
        setBooleanField(term60971, term60971.getClass(), "visible", false);
        setBooleanField(term60971, term60971.getClass(), "enabled", false);
        setBooleanField(term60971, term60971.getClass(), "valid", false);
        setField(term60971, term60971.getClass(), "dropTarget", null);
        setField(term60971, term60971.getClass(), "popups", null);
        setField(term60971, term60971.getClass(), "name", null);
        setBooleanField(term60971, term60971.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60971, term60971.getClass(), "focusable", false);
        setIntField(term60971, term60971.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60971, term60971.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60971, term60971.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60971, term60971.getClass(), "acc", null);
        setField(term60971, term60971.getClass(), "minSize", null);
        setBooleanField(term60971, term60971.getClass(), "minSizeSet", false);
        setField(term60971, term60971.getClass(), "prefSize", null);
        setBooleanField(term60971, term60971.getClass(), "prefSizeSet", false);
        setField(term60971, term60971.getClass(), "maxSize", null);
        setBooleanField(term60971, term60971.getClass(), "maxSizeSet", false);
        setField(term60971, term60971.getClass(), "componentOrientation", null);
        setBooleanField(term60971, term60971.getClass(), "newEventsOnly", false);
        setField(term60971, term60971.getClass(), "componentListener", null);
        setField(term60971, term60971.getClass(), "focusListener", null);
        setField(term60971, term60971.getClass(), "hierarchyListener", null);
        setField(term60971, term60971.getClass(), "hierarchyBoundsListener", null);
        setField(term60971, term60971.getClass(), "keyListener", null);
        setField(term60971, term60971.getClass(), "mouseListener", null);
        setField(term60971, term60971.getClass(), "mouseMotionListener", null);
        setField(term60971, term60971.getClass(), "mouseWheelListener", null);
        setField(term60971, term60971.getClass(), "inputMethodListener", null);
        setLongField(term60971, term60971.getClass(), "eventMask", 0L);
        setField(term60971, term60971.getClass(), "changeSupport", null);
        setField(term60971, term60971.getClass(), "objectLock", null);
        setBooleanField(term60971, term60971.getClass(), "isPacked", false);
        setIntField(term60971, term60971.getClass(), "boundsOp", 0);
        setField(term60971, term60971.getClass(), "compoundShape", null);
        setField(term60971, term60971.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60971, term60971.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60971, term60971.getClass(), "backgroundEraseDisabled", false);
        setField(term60971, term60971.getClass(), "eventCache", null);
        setBooleanField(term60971, term60971.getClass(), "coalescingEnabled", false);
        setBooleanField(term60971, term60971.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60971, term60971.getClass(), "componentSerializedDataVersion", 0);
        setField(term60971, term60971.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "disableScrollText", argTypes, term60971, args);
    }

};


