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
import java.lang.Integer;

public class InfoTextArea_setCharacterWidth_33199265536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61217;
     Object term61278;

    public InfoTextArea_setCharacterWidth_33199265536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61217 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term61217, term61217.getClass(), "blinking", false);
        setBooleanField(term61217, term61217.getClass(), "autoScroll", false);
        setField(term61217, term61217.getClass(), "scrollText", null);
        setField(term61217, term61217.getClass(), "textToShow", null);
        setIntField(term61217, term61217.getClass(), "numberOfLines", 0);
        setIntField(term61217, term61217.getClass(), "currentLine", 0);
        setBooleanField(term61217, term61217.getClass(), "smoothScroll", false);
        setBooleanField(term61217, term61217.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term61217, term61217.getClass(), "textShadow", false);
        setIntField(term61217, term61217.getClass(), "smoothScrollY", 0);
        setField(term61217, term61217.getClass(), "shadowColor", null);
        setField(term61217, term61217.getClass(), "highlightShadowColor", null);
        setField(term61217, term61217.getClass(), "highlightColor", null);
        setField(term61217, term61217.getClass(), "highlightText", null);
        setIntField(term61217, term61217.getClass(), "customCharWidth", 0);
        setIntField(term61217, term61217.getClass(), "rows", 0);
        setIntField(term61217, term61217.getClass(), "columns", 0);
        setIntField(term61217, term61217.getClass(), "columnWidth", 0);
        setIntField(term61217, term61217.getClass(), "rowHeight", 0);
        setBooleanField(term61217, term61217.getClass(), "wrap", false);
        setBooleanField(term61217, term61217.getClass(), "word", false);
        setField(term61217, term61217.getClass(), "model", null);
        setField(term61217, term61217.getClass(), "caret", null);
        setField(term61217, term61217.getClass(), "navigationFilter", null);
        setField(term61217, term61217.getClass(), "highlighter", null);
        setField(term61217, term61217.getClass(), "keymap", null);
        setField(term61217, term61217.getClass(), "caretEvent", null);
        setField(term61217, term61217.getClass(), "caretColor", null);
        setField(term61217, term61217.getClass(), "selectionColor", null);
        setField(term61217, term61217.getClass(), "selectedTextColor", null);
        setField(term61217, term61217.getClass(), "disabledTextColor", null);
        setBooleanField(term61217, term61217.getClass(), "editable", false);
        setField(term61217, term61217.getClass(), "margin", null);
        setCharField(term61217, term61217.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term61217, term61217.getClass(), "dragEnabled", false);
        setField(term61217, term61217.getClass(), "dropMode", null);
        setField(term61217, term61217.getClass(), "dropLocation", null);
        setField(term61217, term61217.getClass(), "inputMethodRequestsHandler", null);
        setField(term61217, term61217.getClass(), "composedTextAttribute", null);
        setField(term61217, term61217.getClass(), "composedTextContent", null);
        setField(term61217, term61217.getClass(), "composedTextStart", null);
        setField(term61217, term61217.getClass(), "composedTextEnd", null);
        setField(term61217, term61217.getClass(), "latestCommittedTextStart", null);
        setField(term61217, term61217.getClass(), "latestCommittedTextEnd", null);
        setField(term61217, term61217.getClass(), "composedTextCaret", null);
        setField(term61217, term61217.getClass(), "originalCaret", null);
        setBooleanField(term61217, term61217.getClass(), "checkedInputOverride", false);
        setBooleanField(term61217, term61217.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term61217, term61217.getClass(), "isAlignmentXSet", false);
        setFloatField(term61217, term61217.getClass(), "alignmentX", 0.0F);
        setBooleanField(term61217, term61217.getClass(), "isAlignmentYSet", false);
        setFloatField(term61217, term61217.getClass(), "alignmentY", 0.0F);
        setField(term61217, term61217.getClass(), "ui", null);
        setField(term61217, term61217.getClass(), "listenerList", null);
        setField(term61217, term61217.getClass(), "clientProperties", null);
        setField(term61217, term61217.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term61217, term61217.getClass(), "autoscrolls", false);
        setField(term61217, term61217.getClass(), "border", null);
        setIntField(term61217, term61217.getClass(), "flags", 0);
        setField(term61217, term61217.getClass(), "inputVerifier", null);
        setBooleanField(term61217, term61217.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term61217, term61217.getClass(), "paintingChild", null);
        setField(term61217, term61217.getClass(), "popupMenu", null);
        setField(term61217, term61217.getClass(), "revalidateRunnableScheduled", null);
        setField(term61217, term61217.getClass(), "focusInputMap", null);
        setField(term61217, term61217.getClass(), "ancestorInputMap", null);
        setField(term61217, term61217.getClass(), "windowInputMap", null);
        setField(term61217, term61217.getClass(), "actionMap", null);
        setField(term61217, term61217.getClass(), "aaHint", null);
        setField(term61217, term61217.getClass(), "lcdRenderingHint", null);
        setField(term61217, term61217.getClass(), "component", null);
        setField(term61217, term61217.getClass(), "layoutMgr", null);
        setField(term61217, term61217.getClass(), "dispatcher", null);
        setField(term61217, term61217.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term61217, term61217.getClass(), "focusCycleRoot", false);
        setBooleanField(term61217, term61217.getClass(), "focusTraversalPolicyProvider", false);
        setField(term61217, term61217.getClass(), "printingThreads", null);
        setBooleanField(term61217, term61217.getClass(), "printing", false);
        setField(term61217, term61217.getClass(), "containerListener", null);
        setIntField(term61217, term61217.getClass(), "listeningChildren", 0);
        setIntField(term61217, term61217.getClass(), "listeningBoundsChildren", 0);
        setIntField(term61217, term61217.getClass(), "descendantsCount", 0);
        setField(term61217, term61217.getClass(), "preserveBackgroundColor", null);
        setIntField(term61217, term61217.getClass(), "numOfHWComponents", 0);
        setIntField(term61217, term61217.getClass(), "numOfLWComponents", 0);
        setField(term61217, term61217.getClass(), "modalComp", null);
        setField(term61217, term61217.getClass(), "modalAppContext", null);
        setIntField(term61217, term61217.getClass(), "containerSerializedDataVersion", 0);
        setField(term61217, term61217.getClass(), "peer", null);
        setField(term61217, term61217.getClass(), "parent", null);
        setField(term61217, term61217.getClass(), "appContext", null);
        setIntField(term61217, term61217.getClass(), "x", 0);
        setIntField(term61217, term61217.getClass(), "y", 0);
        setIntField(term61217, term61217.getClass(), "width", 0);
        setIntField(term61217, term61217.getClass(), "height", 0);
        setField(term61217, term61217.getClass(), "foreground", null);
        setField(term61217, term61217.getClass(), "background", null);
        setField(term61217, term61217.getClass(), "font", null);
        setField(term61217, term61217.getClass(), "peerFont", null);
        setField(term61217, term61217.getClass(), "cursor", null);
        setField(term61217, term61217.getClass(), "locale", null);
        setField(term61217, term61217.getClass(), "graphicsConfig", null);
        setField(term61217, term61217.getClass(), "bufferStrategy", null);
        setBooleanField(term61217, term61217.getClass(), "ignoreRepaint", false);
        setBooleanField(term61217, term61217.getClass(), "visible", false);
        setBooleanField(term61217, term61217.getClass(), "enabled", false);
        setBooleanField(term61217, term61217.getClass(), "valid", false);
        setField(term61217, term61217.getClass(), "dropTarget", null);
        setField(term61217, term61217.getClass(), "popups", null);
        setField(term61217, term61217.getClass(), "name", null);
        setBooleanField(term61217, term61217.getClass(), "nameExplicitlySet", false);
        setBooleanField(term61217, term61217.getClass(), "focusable", false);
        setIntField(term61217, term61217.getClass(), "isFocusTraversableOverridden", 0);
        setField(term61217, term61217.getClass(), "focusTraversalKeys", null);
        setBooleanField(term61217, term61217.getClass(), "focusTraversalKeysEnabled", false);
        setField(term61217, term61217.getClass(), "acc", null);
        setField(term61217, term61217.getClass(), "minSize", null);
        setBooleanField(term61217, term61217.getClass(), "minSizeSet", false);
        setField(term61217, term61217.getClass(), "prefSize", null);
        setBooleanField(term61217, term61217.getClass(), "prefSizeSet", false);
        setField(term61217, term61217.getClass(), "maxSize", null);
        setBooleanField(term61217, term61217.getClass(), "maxSizeSet", false);
        setField(term61217, term61217.getClass(), "componentOrientation", null);
        setBooleanField(term61217, term61217.getClass(), "newEventsOnly", false);
        setField(term61217, term61217.getClass(), "componentListener", null);
        setField(term61217, term61217.getClass(), "focusListener", null);
        setField(term61217, term61217.getClass(), "hierarchyListener", null);
        setField(term61217, term61217.getClass(), "hierarchyBoundsListener", null);
        setField(term61217, term61217.getClass(), "keyListener", null);
        setField(term61217, term61217.getClass(), "mouseListener", null);
        setField(term61217, term61217.getClass(), "mouseMotionListener", null);
        setField(term61217, term61217.getClass(), "mouseWheelListener", null);
        setField(term61217, term61217.getClass(), "inputMethodListener", null);
        setLongField(term61217, term61217.getClass(), "eventMask", 0L);
        setField(term61217, term61217.getClass(), "changeSupport", null);
        setField(term61217, term61217.getClass(), "objectLock", null);
        setBooleanField(term61217, term61217.getClass(), "isPacked", false);
        setIntField(term61217, term61217.getClass(), "boundsOp", 0);
        setField(term61217, term61217.getClass(), "compoundShape", null);
        setField(term61217, term61217.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term61217, term61217.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term61217, term61217.getClass(), "backgroundEraseDisabled", false);
        setField(term61217, term61217.getClass(), "eventCache", null);
        setBooleanField(term61217, term61217.getClass(), "coalescingEnabled", false);
        setBooleanField(term61217, term61217.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term61217, term61217.getClass(), "componentSerializedDataVersion", 0);
        setField(term61217, term61217.getClass(), "accessibleContext", null);
        term61278 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term61278;
        callMethod(klass, "setCharacterWidth", argTypes, term61217, args);
    }

};


