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

public class InfoTextArea_isTextShadow_82075841740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61467;

    public InfoTextArea_isTextShadow_82075841740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61467 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term61467, term61467.getClass(), "blinking", false);
        setBooleanField(term61467, term61467.getClass(), "autoScroll", false);
        setField(term61467, term61467.getClass(), "scrollText", null);
        setField(term61467, term61467.getClass(), "textToShow", null);
        setIntField(term61467, term61467.getClass(), "numberOfLines", 0);
        setIntField(term61467, term61467.getClass(), "currentLine", 0);
        setBooleanField(term61467, term61467.getClass(), "smoothScroll", false);
        setBooleanField(term61467, term61467.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term61467, term61467.getClass(), "textShadow", false);
        setIntField(term61467, term61467.getClass(), "smoothScrollY", 0);
        setField(term61467, term61467.getClass(), "shadowColor", null);
        setField(term61467, term61467.getClass(), "highlightShadowColor", null);
        setField(term61467, term61467.getClass(), "highlightColor", null);
        setField(term61467, term61467.getClass(), "highlightText", null);
        setIntField(term61467, term61467.getClass(), "customCharWidth", 0);
        setIntField(term61467, term61467.getClass(), "rows", 0);
        setIntField(term61467, term61467.getClass(), "columns", 0);
        setIntField(term61467, term61467.getClass(), "columnWidth", 0);
        setIntField(term61467, term61467.getClass(), "rowHeight", 0);
        setBooleanField(term61467, term61467.getClass(), "wrap", false);
        setBooleanField(term61467, term61467.getClass(), "word", false);
        setField(term61467, term61467.getClass(), "model", null);
        setField(term61467, term61467.getClass(), "caret", null);
        setField(term61467, term61467.getClass(), "navigationFilter", null);
        setField(term61467, term61467.getClass(), "highlighter", null);
        setField(term61467, term61467.getClass(), "keymap", null);
        setField(term61467, term61467.getClass(), "caretEvent", null);
        setField(term61467, term61467.getClass(), "caretColor", null);
        setField(term61467, term61467.getClass(), "selectionColor", null);
        setField(term61467, term61467.getClass(), "selectedTextColor", null);
        setField(term61467, term61467.getClass(), "disabledTextColor", null);
        setBooleanField(term61467, term61467.getClass(), "editable", false);
        setField(term61467, term61467.getClass(), "margin", null);
        setCharField(term61467, term61467.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term61467, term61467.getClass(), "dragEnabled", false);
        setField(term61467, term61467.getClass(), "dropMode", null);
        setField(term61467, term61467.getClass(), "dropLocation", null);
        setField(term61467, term61467.getClass(), "inputMethodRequestsHandler", null);
        setField(term61467, term61467.getClass(), "composedTextAttribute", null);
        setField(term61467, term61467.getClass(), "composedTextContent", null);
        setField(term61467, term61467.getClass(), "composedTextStart", null);
        setField(term61467, term61467.getClass(), "composedTextEnd", null);
        setField(term61467, term61467.getClass(), "latestCommittedTextStart", null);
        setField(term61467, term61467.getClass(), "latestCommittedTextEnd", null);
        setField(term61467, term61467.getClass(), "composedTextCaret", null);
        setField(term61467, term61467.getClass(), "originalCaret", null);
        setBooleanField(term61467, term61467.getClass(), "checkedInputOverride", false);
        setBooleanField(term61467, term61467.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term61467, term61467.getClass(), "isAlignmentXSet", false);
        setFloatField(term61467, term61467.getClass(), "alignmentX", 0.0F);
        setBooleanField(term61467, term61467.getClass(), "isAlignmentYSet", false);
        setFloatField(term61467, term61467.getClass(), "alignmentY", 0.0F);
        setField(term61467, term61467.getClass(), "ui", null);
        setField(term61467, term61467.getClass(), "listenerList", null);
        setField(term61467, term61467.getClass(), "clientProperties", null);
        setField(term61467, term61467.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term61467, term61467.getClass(), "autoscrolls", false);
        setField(term61467, term61467.getClass(), "border", null);
        setIntField(term61467, term61467.getClass(), "flags", 0);
        setField(term61467, term61467.getClass(), "inputVerifier", null);
        setBooleanField(term61467, term61467.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term61467, term61467.getClass(), "paintingChild", null);
        setField(term61467, term61467.getClass(), "popupMenu", null);
        setField(term61467, term61467.getClass(), "revalidateRunnableScheduled", null);
        setField(term61467, term61467.getClass(), "focusInputMap", null);
        setField(term61467, term61467.getClass(), "ancestorInputMap", null);
        setField(term61467, term61467.getClass(), "windowInputMap", null);
        setField(term61467, term61467.getClass(), "actionMap", null);
        setField(term61467, term61467.getClass(), "aaHint", null);
        setField(term61467, term61467.getClass(), "lcdRenderingHint", null);
        setField(term61467, term61467.getClass(), "component", null);
        setField(term61467, term61467.getClass(), "layoutMgr", null);
        setField(term61467, term61467.getClass(), "dispatcher", null);
        setField(term61467, term61467.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term61467, term61467.getClass(), "focusCycleRoot", false);
        setBooleanField(term61467, term61467.getClass(), "focusTraversalPolicyProvider", false);
        setField(term61467, term61467.getClass(), "printingThreads", null);
        setBooleanField(term61467, term61467.getClass(), "printing", false);
        setField(term61467, term61467.getClass(), "containerListener", null);
        setIntField(term61467, term61467.getClass(), "listeningChildren", 0);
        setIntField(term61467, term61467.getClass(), "listeningBoundsChildren", 0);
        setIntField(term61467, term61467.getClass(), "descendantsCount", 0);
        setField(term61467, term61467.getClass(), "preserveBackgroundColor", null);
        setIntField(term61467, term61467.getClass(), "numOfHWComponents", 0);
        setIntField(term61467, term61467.getClass(), "numOfLWComponents", 0);
        setField(term61467, term61467.getClass(), "modalComp", null);
        setField(term61467, term61467.getClass(), "modalAppContext", null);
        setIntField(term61467, term61467.getClass(), "containerSerializedDataVersion", 0);
        setField(term61467, term61467.getClass(), "peer", null);
        setField(term61467, term61467.getClass(), "parent", null);
        setField(term61467, term61467.getClass(), "appContext", null);
        setIntField(term61467, term61467.getClass(), "x", 0);
        setIntField(term61467, term61467.getClass(), "y", 0);
        setIntField(term61467, term61467.getClass(), "width", 0);
        setIntField(term61467, term61467.getClass(), "height", 0);
        setField(term61467, term61467.getClass(), "foreground", null);
        setField(term61467, term61467.getClass(), "background", null);
        setField(term61467, term61467.getClass(), "font", null);
        setField(term61467, term61467.getClass(), "peerFont", null);
        setField(term61467, term61467.getClass(), "cursor", null);
        setField(term61467, term61467.getClass(), "locale", null);
        setField(term61467, term61467.getClass(), "graphicsConfig", null);
        setField(term61467, term61467.getClass(), "bufferStrategy", null);
        setBooleanField(term61467, term61467.getClass(), "ignoreRepaint", false);
        setBooleanField(term61467, term61467.getClass(), "visible", false);
        setBooleanField(term61467, term61467.getClass(), "enabled", false);
        setBooleanField(term61467, term61467.getClass(), "valid", false);
        setField(term61467, term61467.getClass(), "dropTarget", null);
        setField(term61467, term61467.getClass(), "popups", null);
        setField(term61467, term61467.getClass(), "name", null);
        setBooleanField(term61467, term61467.getClass(), "nameExplicitlySet", false);
        setBooleanField(term61467, term61467.getClass(), "focusable", false);
        setIntField(term61467, term61467.getClass(), "isFocusTraversableOverridden", 0);
        setField(term61467, term61467.getClass(), "focusTraversalKeys", null);
        setBooleanField(term61467, term61467.getClass(), "focusTraversalKeysEnabled", false);
        setField(term61467, term61467.getClass(), "acc", null);
        setField(term61467, term61467.getClass(), "minSize", null);
        setBooleanField(term61467, term61467.getClass(), "minSizeSet", false);
        setField(term61467, term61467.getClass(), "prefSize", null);
        setBooleanField(term61467, term61467.getClass(), "prefSizeSet", false);
        setField(term61467, term61467.getClass(), "maxSize", null);
        setBooleanField(term61467, term61467.getClass(), "maxSizeSet", false);
        setField(term61467, term61467.getClass(), "componentOrientation", null);
        setBooleanField(term61467, term61467.getClass(), "newEventsOnly", false);
        setField(term61467, term61467.getClass(), "componentListener", null);
        setField(term61467, term61467.getClass(), "focusListener", null);
        setField(term61467, term61467.getClass(), "hierarchyListener", null);
        setField(term61467, term61467.getClass(), "hierarchyBoundsListener", null);
        setField(term61467, term61467.getClass(), "keyListener", null);
        setField(term61467, term61467.getClass(), "mouseListener", null);
        setField(term61467, term61467.getClass(), "mouseMotionListener", null);
        setField(term61467, term61467.getClass(), "mouseWheelListener", null);
        setField(term61467, term61467.getClass(), "inputMethodListener", null);
        setLongField(term61467, term61467.getClass(), "eventMask", 0L);
        setField(term61467, term61467.getClass(), "changeSupport", null);
        setField(term61467, term61467.getClass(), "objectLock", null);
        setBooleanField(term61467, term61467.getClass(), "isPacked", false);
        setIntField(term61467, term61467.getClass(), "boundsOp", 0);
        setField(term61467, term61467.getClass(), "compoundShape", null);
        setField(term61467, term61467.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term61467, term61467.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term61467, term61467.getClass(), "backgroundEraseDisabled", false);
        setField(term61467, term61467.getClass(), "eventCache", null);
        setBooleanField(term61467, term61467.getClass(), "coalescingEnabled", false);
        setBooleanField(term61467, term61467.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term61467, term61467.getClass(), "componentSerializedDataVersion", 0);
        setField(term61467, term61467.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTextShadow", argTypes, term61467, args);
    }

};


