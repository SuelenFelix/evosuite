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

public class InfoTextArea_drawString_102794995137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61280;
     Object term61341;
     Object term61343;

    public InfoTextArea_drawString_102794995137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61280 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term61280, term61280.getClass(), "blinking", false);
        setBooleanField(term61280, term61280.getClass(), "autoScroll", false);
        setField(term61280, term61280.getClass(), "scrollText", null);
        setField(term61280, term61280.getClass(), "textToShow", null);
        setIntField(term61280, term61280.getClass(), "numberOfLines", 0);
        setIntField(term61280, term61280.getClass(), "currentLine", 0);
        setBooleanField(term61280, term61280.getClass(), "smoothScroll", false);
        setBooleanField(term61280, term61280.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term61280, term61280.getClass(), "textShadow", false);
        setIntField(term61280, term61280.getClass(), "smoothScrollY", 0);
        setField(term61280, term61280.getClass(), "shadowColor", null);
        setField(term61280, term61280.getClass(), "highlightShadowColor", null);
        setField(term61280, term61280.getClass(), "highlightColor", null);
        setField(term61280, term61280.getClass(), "highlightText", null);
        setIntField(term61280, term61280.getClass(), "customCharWidth", 0);
        setIntField(term61280, term61280.getClass(), "rows", 0);
        setIntField(term61280, term61280.getClass(), "columns", 0);
        setIntField(term61280, term61280.getClass(), "columnWidth", 0);
        setIntField(term61280, term61280.getClass(), "rowHeight", 0);
        setBooleanField(term61280, term61280.getClass(), "wrap", false);
        setBooleanField(term61280, term61280.getClass(), "word", false);
        setField(term61280, term61280.getClass(), "model", null);
        setField(term61280, term61280.getClass(), "caret", null);
        setField(term61280, term61280.getClass(), "navigationFilter", null);
        setField(term61280, term61280.getClass(), "highlighter", null);
        setField(term61280, term61280.getClass(), "keymap", null);
        setField(term61280, term61280.getClass(), "caretEvent", null);
        setField(term61280, term61280.getClass(), "caretColor", null);
        setField(term61280, term61280.getClass(), "selectionColor", null);
        setField(term61280, term61280.getClass(), "selectedTextColor", null);
        setField(term61280, term61280.getClass(), "disabledTextColor", null);
        setBooleanField(term61280, term61280.getClass(), "editable", false);
        setField(term61280, term61280.getClass(), "margin", null);
        setCharField(term61280, term61280.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term61280, term61280.getClass(), "dragEnabled", false);
        setField(term61280, term61280.getClass(), "dropMode", null);
        setField(term61280, term61280.getClass(), "dropLocation", null);
        setField(term61280, term61280.getClass(), "inputMethodRequestsHandler", null);
        setField(term61280, term61280.getClass(), "composedTextAttribute", null);
        setField(term61280, term61280.getClass(), "composedTextContent", null);
        setField(term61280, term61280.getClass(), "composedTextStart", null);
        setField(term61280, term61280.getClass(), "composedTextEnd", null);
        setField(term61280, term61280.getClass(), "latestCommittedTextStart", null);
        setField(term61280, term61280.getClass(), "latestCommittedTextEnd", null);
        setField(term61280, term61280.getClass(), "composedTextCaret", null);
        setField(term61280, term61280.getClass(), "originalCaret", null);
        setBooleanField(term61280, term61280.getClass(), "checkedInputOverride", false);
        setBooleanField(term61280, term61280.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term61280, term61280.getClass(), "isAlignmentXSet", false);
        setFloatField(term61280, term61280.getClass(), "alignmentX", 0.0F);
        setBooleanField(term61280, term61280.getClass(), "isAlignmentYSet", false);
        setFloatField(term61280, term61280.getClass(), "alignmentY", 0.0F);
        setField(term61280, term61280.getClass(), "ui", null);
        setField(term61280, term61280.getClass(), "listenerList", null);
        setField(term61280, term61280.getClass(), "clientProperties", null);
        setField(term61280, term61280.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term61280, term61280.getClass(), "autoscrolls", false);
        setField(term61280, term61280.getClass(), "border", null);
        setIntField(term61280, term61280.getClass(), "flags", 0);
        setField(term61280, term61280.getClass(), "inputVerifier", null);
        setBooleanField(term61280, term61280.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term61280, term61280.getClass(), "paintingChild", null);
        setField(term61280, term61280.getClass(), "popupMenu", null);
        setField(term61280, term61280.getClass(), "revalidateRunnableScheduled", null);
        setField(term61280, term61280.getClass(), "focusInputMap", null);
        setField(term61280, term61280.getClass(), "ancestorInputMap", null);
        setField(term61280, term61280.getClass(), "windowInputMap", null);
        setField(term61280, term61280.getClass(), "actionMap", null);
        setField(term61280, term61280.getClass(), "aaHint", null);
        setField(term61280, term61280.getClass(), "lcdRenderingHint", null);
        setField(term61280, term61280.getClass(), "component", null);
        setField(term61280, term61280.getClass(), "layoutMgr", null);
        setField(term61280, term61280.getClass(), "dispatcher", null);
        setField(term61280, term61280.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term61280, term61280.getClass(), "focusCycleRoot", false);
        setBooleanField(term61280, term61280.getClass(), "focusTraversalPolicyProvider", false);
        setField(term61280, term61280.getClass(), "printingThreads", null);
        setBooleanField(term61280, term61280.getClass(), "printing", false);
        setField(term61280, term61280.getClass(), "containerListener", null);
        setIntField(term61280, term61280.getClass(), "listeningChildren", 0);
        setIntField(term61280, term61280.getClass(), "listeningBoundsChildren", 0);
        setIntField(term61280, term61280.getClass(), "descendantsCount", 0);
        setField(term61280, term61280.getClass(), "preserveBackgroundColor", null);
        setIntField(term61280, term61280.getClass(), "numOfHWComponents", 0);
        setIntField(term61280, term61280.getClass(), "numOfLWComponents", 0);
        setField(term61280, term61280.getClass(), "modalComp", null);
        setField(term61280, term61280.getClass(), "modalAppContext", null);
        setIntField(term61280, term61280.getClass(), "containerSerializedDataVersion", 0);
        setField(term61280, term61280.getClass(), "peer", null);
        setField(term61280, term61280.getClass(), "parent", null);
        setField(term61280, term61280.getClass(), "appContext", null);
        setIntField(term61280, term61280.getClass(), "x", 0);
        setIntField(term61280, term61280.getClass(), "y", 0);
        setIntField(term61280, term61280.getClass(), "width", 0);
        setIntField(term61280, term61280.getClass(), "height", 0);
        setField(term61280, term61280.getClass(), "foreground", null);
        setField(term61280, term61280.getClass(), "background", null);
        setField(term61280, term61280.getClass(), "font", null);
        setField(term61280, term61280.getClass(), "peerFont", null);
        setField(term61280, term61280.getClass(), "cursor", null);
        setField(term61280, term61280.getClass(), "locale", null);
        setField(term61280, term61280.getClass(), "graphicsConfig", null);
        setField(term61280, term61280.getClass(), "bufferStrategy", null);
        setBooleanField(term61280, term61280.getClass(), "ignoreRepaint", false);
        setBooleanField(term61280, term61280.getClass(), "visible", false);
        setBooleanField(term61280, term61280.getClass(), "enabled", false);
        setBooleanField(term61280, term61280.getClass(), "valid", false);
        setField(term61280, term61280.getClass(), "dropTarget", null);
        setField(term61280, term61280.getClass(), "popups", null);
        setField(term61280, term61280.getClass(), "name", null);
        setBooleanField(term61280, term61280.getClass(), "nameExplicitlySet", false);
        setBooleanField(term61280, term61280.getClass(), "focusable", false);
        setIntField(term61280, term61280.getClass(), "isFocusTraversableOverridden", 0);
        setField(term61280, term61280.getClass(), "focusTraversalKeys", null);
        setBooleanField(term61280, term61280.getClass(), "focusTraversalKeysEnabled", false);
        setField(term61280, term61280.getClass(), "acc", null);
        setField(term61280, term61280.getClass(), "minSize", null);
        setBooleanField(term61280, term61280.getClass(), "minSizeSet", false);
        setField(term61280, term61280.getClass(), "prefSize", null);
        setBooleanField(term61280, term61280.getClass(), "prefSizeSet", false);
        setField(term61280, term61280.getClass(), "maxSize", null);
        setBooleanField(term61280, term61280.getClass(), "maxSizeSet", false);
        setField(term61280, term61280.getClass(), "componentOrientation", null);
        setBooleanField(term61280, term61280.getClass(), "newEventsOnly", false);
        setField(term61280, term61280.getClass(), "componentListener", null);
        setField(term61280, term61280.getClass(), "focusListener", null);
        setField(term61280, term61280.getClass(), "hierarchyListener", null);
        setField(term61280, term61280.getClass(), "hierarchyBoundsListener", null);
        setField(term61280, term61280.getClass(), "keyListener", null);
        setField(term61280, term61280.getClass(), "mouseListener", null);
        setField(term61280, term61280.getClass(), "mouseMotionListener", null);
        setField(term61280, term61280.getClass(), "mouseWheelListener", null);
        setField(term61280, term61280.getClass(), "inputMethodListener", null);
        setLongField(term61280, term61280.getClass(), "eventMask", 0L);
        setField(term61280, term61280.getClass(), "changeSupport", null);
        setField(term61280, term61280.getClass(), "objectLock", null);
        setBooleanField(term61280, term61280.getClass(), "isPacked", false);
        setIntField(term61280, term61280.getClass(), "boundsOp", 0);
        setField(term61280, term61280.getClass(), "compoundShape", null);
        setField(term61280, term61280.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term61280, term61280.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term61280, term61280.getClass(), "backgroundEraseDisabled", false);
        setField(term61280, term61280.getClass(), "eventCache", null);
        setBooleanField(term61280, term61280.getClass(), "coalescingEnabled", false);
        setBooleanField(term61280, term61280.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term61280, term61280.getClass(), "componentSerializedDataVersion", 0);
        setField(term61280, term61280.getClass(), "accessibleContext", null);
        term61341 = new Integer(0);
        term61343 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.awt.Graphics");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term61341;
        args[3] = term61343;
        args[4] = null;
        callMethod(klass, "drawString", argTypes, term61280, args);
    }

};


