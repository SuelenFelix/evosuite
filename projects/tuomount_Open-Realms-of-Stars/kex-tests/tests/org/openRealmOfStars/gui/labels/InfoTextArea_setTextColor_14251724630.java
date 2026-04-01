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

public class InfoTextArea_setTextColor_14251724630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60849;

    public InfoTextArea_setTextColor_14251724630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60849 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term60849, term60849.getClass(), "blinking", false);
        setBooleanField(term60849, term60849.getClass(), "autoScroll", false);
        setField(term60849, term60849.getClass(), "scrollText", null);
        setField(term60849, term60849.getClass(), "textToShow", null);
        setIntField(term60849, term60849.getClass(), "numberOfLines", 0);
        setIntField(term60849, term60849.getClass(), "currentLine", 0);
        setBooleanField(term60849, term60849.getClass(), "smoothScroll", false);
        setBooleanField(term60849, term60849.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term60849, term60849.getClass(), "textShadow", false);
        setIntField(term60849, term60849.getClass(), "smoothScrollY", 0);
        setField(term60849, term60849.getClass(), "shadowColor", null);
        setField(term60849, term60849.getClass(), "highlightShadowColor", null);
        setField(term60849, term60849.getClass(), "highlightColor", null);
        setField(term60849, term60849.getClass(), "highlightText", null);
        setIntField(term60849, term60849.getClass(), "customCharWidth", 0);
        setIntField(term60849, term60849.getClass(), "rows", 0);
        setIntField(term60849, term60849.getClass(), "columns", 0);
        setIntField(term60849, term60849.getClass(), "columnWidth", 0);
        setIntField(term60849, term60849.getClass(), "rowHeight", 0);
        setBooleanField(term60849, term60849.getClass(), "wrap", false);
        setBooleanField(term60849, term60849.getClass(), "word", false);
        setField(term60849, term60849.getClass(), "model", null);
        setField(term60849, term60849.getClass(), "caret", null);
        setField(term60849, term60849.getClass(), "navigationFilter", null);
        setField(term60849, term60849.getClass(), "highlighter", null);
        setField(term60849, term60849.getClass(), "keymap", null);
        setField(term60849, term60849.getClass(), "caretEvent", null);
        setField(term60849, term60849.getClass(), "caretColor", null);
        setField(term60849, term60849.getClass(), "selectionColor", null);
        setField(term60849, term60849.getClass(), "selectedTextColor", null);
        setField(term60849, term60849.getClass(), "disabledTextColor", null);
        setBooleanField(term60849, term60849.getClass(), "editable", false);
        setField(term60849, term60849.getClass(), "margin", null);
        setCharField(term60849, term60849.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60849, term60849.getClass(), "dragEnabled", false);
        setField(term60849, term60849.getClass(), "dropMode", null);
        setField(term60849, term60849.getClass(), "dropLocation", null);
        setField(term60849, term60849.getClass(), "inputMethodRequestsHandler", null);
        setField(term60849, term60849.getClass(), "composedTextAttribute", null);
        setField(term60849, term60849.getClass(), "composedTextContent", null);
        setField(term60849, term60849.getClass(), "composedTextStart", null);
        setField(term60849, term60849.getClass(), "composedTextEnd", null);
        setField(term60849, term60849.getClass(), "latestCommittedTextStart", null);
        setField(term60849, term60849.getClass(), "latestCommittedTextEnd", null);
        setField(term60849, term60849.getClass(), "composedTextCaret", null);
        setField(term60849, term60849.getClass(), "originalCaret", null);
        setBooleanField(term60849, term60849.getClass(), "checkedInputOverride", false);
        setBooleanField(term60849, term60849.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60849, term60849.getClass(), "isAlignmentXSet", false);
        setFloatField(term60849, term60849.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60849, term60849.getClass(), "isAlignmentYSet", false);
        setFloatField(term60849, term60849.getClass(), "alignmentY", 0.0F);
        setField(term60849, term60849.getClass(), "ui", null);
        setField(term60849, term60849.getClass(), "listenerList", null);
        setField(term60849, term60849.getClass(), "clientProperties", null);
        setField(term60849, term60849.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60849, term60849.getClass(), "autoscrolls", false);
        setField(term60849, term60849.getClass(), "border", null);
        setIntField(term60849, term60849.getClass(), "flags", 0);
        setField(term60849, term60849.getClass(), "inputVerifier", null);
        setBooleanField(term60849, term60849.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60849, term60849.getClass(), "paintingChild", null);
        setField(term60849, term60849.getClass(), "popupMenu", null);
        setField(term60849, term60849.getClass(), "revalidateRunnableScheduled", null);
        setField(term60849, term60849.getClass(), "focusInputMap", null);
        setField(term60849, term60849.getClass(), "ancestorInputMap", null);
        setField(term60849, term60849.getClass(), "windowInputMap", null);
        setField(term60849, term60849.getClass(), "actionMap", null);
        setField(term60849, term60849.getClass(), "aaHint", null);
        setField(term60849, term60849.getClass(), "lcdRenderingHint", null);
        setField(term60849, term60849.getClass(), "component", null);
        setField(term60849, term60849.getClass(), "layoutMgr", null);
        setField(term60849, term60849.getClass(), "dispatcher", null);
        setField(term60849, term60849.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60849, term60849.getClass(), "focusCycleRoot", false);
        setBooleanField(term60849, term60849.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60849, term60849.getClass(), "printingThreads", null);
        setBooleanField(term60849, term60849.getClass(), "printing", false);
        setField(term60849, term60849.getClass(), "containerListener", null);
        setIntField(term60849, term60849.getClass(), "listeningChildren", 0);
        setIntField(term60849, term60849.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60849, term60849.getClass(), "descendantsCount", 0);
        setField(term60849, term60849.getClass(), "preserveBackgroundColor", null);
        setIntField(term60849, term60849.getClass(), "numOfHWComponents", 0);
        setIntField(term60849, term60849.getClass(), "numOfLWComponents", 0);
        setField(term60849, term60849.getClass(), "modalComp", null);
        setField(term60849, term60849.getClass(), "modalAppContext", null);
        setIntField(term60849, term60849.getClass(), "containerSerializedDataVersion", 0);
        setField(term60849, term60849.getClass(), "peer", null);
        setField(term60849, term60849.getClass(), "parent", null);
        setField(term60849, term60849.getClass(), "appContext", null);
        setIntField(term60849, term60849.getClass(), "x", 0);
        setIntField(term60849, term60849.getClass(), "y", 0);
        setIntField(term60849, term60849.getClass(), "width", 0);
        setIntField(term60849, term60849.getClass(), "height", 0);
        setField(term60849, term60849.getClass(), "foreground", null);
        setField(term60849, term60849.getClass(), "background", null);
        setField(term60849, term60849.getClass(), "font", null);
        setField(term60849, term60849.getClass(), "peerFont", null);
        setField(term60849, term60849.getClass(), "cursor", null);
        setField(term60849, term60849.getClass(), "locale", null);
        setField(term60849, term60849.getClass(), "graphicsConfig", null);
        setField(term60849, term60849.getClass(), "bufferStrategy", null);
        setBooleanField(term60849, term60849.getClass(), "ignoreRepaint", false);
        setBooleanField(term60849, term60849.getClass(), "visible", false);
        setBooleanField(term60849, term60849.getClass(), "enabled", false);
        setBooleanField(term60849, term60849.getClass(), "valid", false);
        setField(term60849, term60849.getClass(), "dropTarget", null);
        setField(term60849, term60849.getClass(), "popups", null);
        setField(term60849, term60849.getClass(), "name", null);
        setBooleanField(term60849, term60849.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60849, term60849.getClass(), "focusable", false);
        setIntField(term60849, term60849.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60849, term60849.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60849, term60849.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60849, term60849.getClass(), "acc", null);
        setField(term60849, term60849.getClass(), "minSize", null);
        setBooleanField(term60849, term60849.getClass(), "minSizeSet", false);
        setField(term60849, term60849.getClass(), "prefSize", null);
        setBooleanField(term60849, term60849.getClass(), "prefSizeSet", false);
        setField(term60849, term60849.getClass(), "maxSize", null);
        setBooleanField(term60849, term60849.getClass(), "maxSizeSet", false);
        setField(term60849, term60849.getClass(), "componentOrientation", null);
        setBooleanField(term60849, term60849.getClass(), "newEventsOnly", false);
        setField(term60849, term60849.getClass(), "componentListener", null);
        setField(term60849, term60849.getClass(), "focusListener", null);
        setField(term60849, term60849.getClass(), "hierarchyListener", null);
        setField(term60849, term60849.getClass(), "hierarchyBoundsListener", null);
        setField(term60849, term60849.getClass(), "keyListener", null);
        setField(term60849, term60849.getClass(), "mouseListener", null);
        setField(term60849, term60849.getClass(), "mouseMotionListener", null);
        setField(term60849, term60849.getClass(), "mouseWheelListener", null);
        setField(term60849, term60849.getClass(), "inputMethodListener", null);
        setLongField(term60849, term60849.getClass(), "eventMask", 0L);
        setField(term60849, term60849.getClass(), "changeSupport", null);
        setField(term60849, term60849.getClass(), "objectLock", null);
        setBooleanField(term60849, term60849.getClass(), "isPacked", false);
        setIntField(term60849, term60849.getClass(), "boundsOp", 0);
        setField(term60849, term60849.getClass(), "compoundShape", null);
        setField(term60849, term60849.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60849, term60849.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60849, term60849.getClass(), "backgroundEraseDisabled", false);
        setField(term60849, term60849.getClass(), "eventCache", null);
        setBooleanField(term60849, term60849.getClass(), "coalescingEnabled", false);
        setBooleanField(term60849, term60849.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60849, term60849.getClass(), "componentSerializedDataVersion", 0);
        setField(term60849, term60849.getClass(), "accessibleContext", null);
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
        callMethod(klass, "setTextColor", argTypes, term60849, args);
    }

};


