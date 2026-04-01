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

public class InfoTextArea_setText_123252848629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60788;

    public InfoTextArea_setText_123252848629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60788 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term60788, term60788.getClass(), "blinking", false);
        setBooleanField(term60788, term60788.getClass(), "autoScroll", false);
        setField(term60788, term60788.getClass(), "scrollText", null);
        setField(term60788, term60788.getClass(), "textToShow", null);
        setIntField(term60788, term60788.getClass(), "numberOfLines", 0);
        setIntField(term60788, term60788.getClass(), "currentLine", 0);
        setBooleanField(term60788, term60788.getClass(), "smoothScroll", false);
        setBooleanField(term60788, term60788.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term60788, term60788.getClass(), "textShadow", false);
        setIntField(term60788, term60788.getClass(), "smoothScrollY", 0);
        setField(term60788, term60788.getClass(), "shadowColor", null);
        setField(term60788, term60788.getClass(), "highlightShadowColor", null);
        setField(term60788, term60788.getClass(), "highlightColor", null);
        setField(term60788, term60788.getClass(), "highlightText", null);
        setIntField(term60788, term60788.getClass(), "customCharWidth", 0);
        setIntField(term60788, term60788.getClass(), "rows", 0);
        setIntField(term60788, term60788.getClass(), "columns", 0);
        setIntField(term60788, term60788.getClass(), "columnWidth", 0);
        setIntField(term60788, term60788.getClass(), "rowHeight", 0);
        setBooleanField(term60788, term60788.getClass(), "wrap", false);
        setBooleanField(term60788, term60788.getClass(), "word", false);
        setField(term60788, term60788.getClass(), "model", null);
        setField(term60788, term60788.getClass(), "caret", null);
        setField(term60788, term60788.getClass(), "navigationFilter", null);
        setField(term60788, term60788.getClass(), "highlighter", null);
        setField(term60788, term60788.getClass(), "keymap", null);
        setField(term60788, term60788.getClass(), "caretEvent", null);
        setField(term60788, term60788.getClass(), "caretColor", null);
        setField(term60788, term60788.getClass(), "selectionColor", null);
        setField(term60788, term60788.getClass(), "selectedTextColor", null);
        setField(term60788, term60788.getClass(), "disabledTextColor", null);
        setBooleanField(term60788, term60788.getClass(), "editable", false);
        setField(term60788, term60788.getClass(), "margin", null);
        setCharField(term60788, term60788.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term60788, term60788.getClass(), "dragEnabled", false);
        setField(term60788, term60788.getClass(), "dropMode", null);
        setField(term60788, term60788.getClass(), "dropLocation", null);
        setField(term60788, term60788.getClass(), "inputMethodRequestsHandler", null);
        setField(term60788, term60788.getClass(), "composedTextAttribute", null);
        setField(term60788, term60788.getClass(), "composedTextContent", null);
        setField(term60788, term60788.getClass(), "composedTextStart", null);
        setField(term60788, term60788.getClass(), "composedTextEnd", null);
        setField(term60788, term60788.getClass(), "latestCommittedTextStart", null);
        setField(term60788, term60788.getClass(), "latestCommittedTextEnd", null);
        setField(term60788, term60788.getClass(), "composedTextCaret", null);
        setField(term60788, term60788.getClass(), "originalCaret", null);
        setBooleanField(term60788, term60788.getClass(), "checkedInputOverride", false);
        setBooleanField(term60788, term60788.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term60788, term60788.getClass(), "isAlignmentXSet", false);
        setFloatField(term60788, term60788.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60788, term60788.getClass(), "isAlignmentYSet", false);
        setFloatField(term60788, term60788.getClass(), "alignmentY", 0.0F);
        setField(term60788, term60788.getClass(), "ui", null);
        setField(term60788, term60788.getClass(), "listenerList", null);
        setField(term60788, term60788.getClass(), "clientProperties", null);
        setField(term60788, term60788.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60788, term60788.getClass(), "autoscrolls", false);
        setField(term60788, term60788.getClass(), "border", null);
        setIntField(term60788, term60788.getClass(), "flags", 0);
        setField(term60788, term60788.getClass(), "inputVerifier", null);
        setBooleanField(term60788, term60788.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60788, term60788.getClass(), "paintingChild", null);
        setField(term60788, term60788.getClass(), "popupMenu", null);
        setField(term60788, term60788.getClass(), "revalidateRunnableScheduled", null);
        setField(term60788, term60788.getClass(), "focusInputMap", null);
        setField(term60788, term60788.getClass(), "ancestorInputMap", null);
        setField(term60788, term60788.getClass(), "windowInputMap", null);
        setField(term60788, term60788.getClass(), "actionMap", null);
        setField(term60788, term60788.getClass(), "aaHint", null);
        setField(term60788, term60788.getClass(), "lcdRenderingHint", null);
        setField(term60788, term60788.getClass(), "component", null);
        setField(term60788, term60788.getClass(), "layoutMgr", null);
        setField(term60788, term60788.getClass(), "dispatcher", null);
        setField(term60788, term60788.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60788, term60788.getClass(), "focusCycleRoot", false);
        setBooleanField(term60788, term60788.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60788, term60788.getClass(), "printingThreads", null);
        setBooleanField(term60788, term60788.getClass(), "printing", false);
        setField(term60788, term60788.getClass(), "containerListener", null);
        setIntField(term60788, term60788.getClass(), "listeningChildren", 0);
        setIntField(term60788, term60788.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60788, term60788.getClass(), "descendantsCount", 0);
        setField(term60788, term60788.getClass(), "preserveBackgroundColor", null);
        setIntField(term60788, term60788.getClass(), "numOfHWComponents", 0);
        setIntField(term60788, term60788.getClass(), "numOfLWComponents", 0);
        setField(term60788, term60788.getClass(), "modalComp", null);
        setField(term60788, term60788.getClass(), "modalAppContext", null);
        setIntField(term60788, term60788.getClass(), "containerSerializedDataVersion", 0);
        setField(term60788, term60788.getClass(), "peer", null);
        setField(term60788, term60788.getClass(), "parent", null);
        setField(term60788, term60788.getClass(), "appContext", null);
        setIntField(term60788, term60788.getClass(), "x", 0);
        setIntField(term60788, term60788.getClass(), "y", 0);
        setIntField(term60788, term60788.getClass(), "width", 0);
        setIntField(term60788, term60788.getClass(), "height", 0);
        setField(term60788, term60788.getClass(), "foreground", null);
        setField(term60788, term60788.getClass(), "background", null);
        setField(term60788, term60788.getClass(), "font", null);
        setField(term60788, term60788.getClass(), "peerFont", null);
        setField(term60788, term60788.getClass(), "cursor", null);
        setField(term60788, term60788.getClass(), "locale", null);
        setField(term60788, term60788.getClass(), "graphicsConfig", null);
        setField(term60788, term60788.getClass(), "bufferStrategy", null);
        setBooleanField(term60788, term60788.getClass(), "ignoreRepaint", false);
        setBooleanField(term60788, term60788.getClass(), "visible", false);
        setBooleanField(term60788, term60788.getClass(), "enabled", false);
        setBooleanField(term60788, term60788.getClass(), "valid", false);
        setField(term60788, term60788.getClass(), "dropTarget", null);
        setField(term60788, term60788.getClass(), "popups", null);
        setField(term60788, term60788.getClass(), "name", null);
        setBooleanField(term60788, term60788.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60788, term60788.getClass(), "focusable", false);
        setIntField(term60788, term60788.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60788, term60788.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60788, term60788.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60788, term60788.getClass(), "acc", null);
        setField(term60788, term60788.getClass(), "minSize", null);
        setBooleanField(term60788, term60788.getClass(), "minSizeSet", false);
        setField(term60788, term60788.getClass(), "prefSize", null);
        setBooleanField(term60788, term60788.getClass(), "prefSizeSet", false);
        setField(term60788, term60788.getClass(), "maxSize", null);
        setBooleanField(term60788, term60788.getClass(), "maxSizeSet", false);
        setField(term60788, term60788.getClass(), "componentOrientation", null);
        setBooleanField(term60788, term60788.getClass(), "newEventsOnly", false);
        setField(term60788, term60788.getClass(), "componentListener", null);
        setField(term60788, term60788.getClass(), "focusListener", null);
        setField(term60788, term60788.getClass(), "hierarchyListener", null);
        setField(term60788, term60788.getClass(), "hierarchyBoundsListener", null);
        setField(term60788, term60788.getClass(), "keyListener", null);
        setField(term60788, term60788.getClass(), "mouseListener", null);
        setField(term60788, term60788.getClass(), "mouseMotionListener", null);
        setField(term60788, term60788.getClass(), "mouseWheelListener", null);
        setField(term60788, term60788.getClass(), "inputMethodListener", null);
        setLongField(term60788, term60788.getClass(), "eventMask", 0L);
        setField(term60788, term60788.getClass(), "changeSupport", null);
        setField(term60788, term60788.getClass(), "objectLock", null);
        setBooleanField(term60788, term60788.getClass(), "isPacked", false);
        setIntField(term60788, term60788.getClass(), "boundsOp", 0);
        setField(term60788, term60788.getClass(), "compoundShape", null);
        setField(term60788, term60788.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60788, term60788.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60788, term60788.getClass(), "backgroundEraseDisabled", false);
        setField(term60788, term60788.getClass(), "eventCache", null);
        setBooleanField(term60788, term60788.getClass(), "coalescingEnabled", false);
        setBooleanField(term60788, term60788.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60788, term60788.getClass(), "componentSerializedDataVersion", 0);
        setField(term60788, term60788.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term60788, args);
    }

};


