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

public class InfoTextArea_getSmoothScrollNextRow_77246321639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61406;

    public InfoTextArea_getSmoothScrollNextRow_77246321639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61406 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea"));
        setBooleanField(term61406, term61406.getClass(), "blinking", false);
        setBooleanField(term61406, term61406.getClass(), "autoScroll", false);
        setField(term61406, term61406.getClass(), "scrollText", null);
        setField(term61406, term61406.getClass(), "textToShow", null);
        setIntField(term61406, term61406.getClass(), "numberOfLines", 0);
        setIntField(term61406, term61406.getClass(), "currentLine", 0);
        setBooleanField(term61406, term61406.getClass(), "smoothScroll", false);
        setBooleanField(term61406, term61406.getClass(), "smoothScrollNextRow", false);
        setBooleanField(term61406, term61406.getClass(), "textShadow", false);
        setIntField(term61406, term61406.getClass(), "smoothScrollY", 0);
        setField(term61406, term61406.getClass(), "shadowColor", null);
        setField(term61406, term61406.getClass(), "highlightShadowColor", null);
        setField(term61406, term61406.getClass(), "highlightColor", null);
        setField(term61406, term61406.getClass(), "highlightText", null);
        setIntField(term61406, term61406.getClass(), "customCharWidth", 0);
        setIntField(term61406, term61406.getClass(), "rows", 0);
        setIntField(term61406, term61406.getClass(), "columns", 0);
        setIntField(term61406, term61406.getClass(), "columnWidth", 0);
        setIntField(term61406, term61406.getClass(), "rowHeight", 0);
        setBooleanField(term61406, term61406.getClass(), "wrap", false);
        setBooleanField(term61406, term61406.getClass(), "word", false);
        setField(term61406, term61406.getClass(), "model", null);
        setField(term61406, term61406.getClass(), "caret", null);
        setField(term61406, term61406.getClass(), "navigationFilter", null);
        setField(term61406, term61406.getClass(), "highlighter", null);
        setField(term61406, term61406.getClass(), "keymap", null);
        setField(term61406, term61406.getClass(), "caretEvent", null);
        setField(term61406, term61406.getClass(), "caretColor", null);
        setField(term61406, term61406.getClass(), "selectionColor", null);
        setField(term61406, term61406.getClass(), "selectedTextColor", null);
        setField(term61406, term61406.getClass(), "disabledTextColor", null);
        setBooleanField(term61406, term61406.getClass(), "editable", false);
        setField(term61406, term61406.getClass(), "margin", null);
        setCharField(term61406, term61406.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term61406, term61406.getClass(), "dragEnabled", false);
        setField(term61406, term61406.getClass(), "dropMode", null);
        setField(term61406, term61406.getClass(), "dropLocation", null);
        setField(term61406, term61406.getClass(), "inputMethodRequestsHandler", null);
        setField(term61406, term61406.getClass(), "composedTextAttribute", null);
        setField(term61406, term61406.getClass(), "composedTextContent", null);
        setField(term61406, term61406.getClass(), "composedTextStart", null);
        setField(term61406, term61406.getClass(), "composedTextEnd", null);
        setField(term61406, term61406.getClass(), "latestCommittedTextStart", null);
        setField(term61406, term61406.getClass(), "latestCommittedTextEnd", null);
        setField(term61406, term61406.getClass(), "composedTextCaret", null);
        setField(term61406, term61406.getClass(), "originalCaret", null);
        setBooleanField(term61406, term61406.getClass(), "checkedInputOverride", false);
        setBooleanField(term61406, term61406.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term61406, term61406.getClass(), "isAlignmentXSet", false);
        setFloatField(term61406, term61406.getClass(), "alignmentX", 0.0F);
        setBooleanField(term61406, term61406.getClass(), "isAlignmentYSet", false);
        setFloatField(term61406, term61406.getClass(), "alignmentY", 0.0F);
        setField(term61406, term61406.getClass(), "ui", null);
        setField(term61406, term61406.getClass(), "listenerList", null);
        setField(term61406, term61406.getClass(), "clientProperties", null);
        setField(term61406, term61406.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term61406, term61406.getClass(), "autoscrolls", false);
        setField(term61406, term61406.getClass(), "border", null);
        setIntField(term61406, term61406.getClass(), "flags", 0);
        setField(term61406, term61406.getClass(), "inputVerifier", null);
        setBooleanField(term61406, term61406.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term61406, term61406.getClass(), "paintingChild", null);
        setField(term61406, term61406.getClass(), "popupMenu", null);
        setField(term61406, term61406.getClass(), "revalidateRunnableScheduled", null);
        setField(term61406, term61406.getClass(), "focusInputMap", null);
        setField(term61406, term61406.getClass(), "ancestorInputMap", null);
        setField(term61406, term61406.getClass(), "windowInputMap", null);
        setField(term61406, term61406.getClass(), "actionMap", null);
        setField(term61406, term61406.getClass(), "aaHint", null);
        setField(term61406, term61406.getClass(), "lcdRenderingHint", null);
        setField(term61406, term61406.getClass(), "component", null);
        setField(term61406, term61406.getClass(), "layoutMgr", null);
        setField(term61406, term61406.getClass(), "dispatcher", null);
        setField(term61406, term61406.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term61406, term61406.getClass(), "focusCycleRoot", false);
        setBooleanField(term61406, term61406.getClass(), "focusTraversalPolicyProvider", false);
        setField(term61406, term61406.getClass(), "printingThreads", null);
        setBooleanField(term61406, term61406.getClass(), "printing", false);
        setField(term61406, term61406.getClass(), "containerListener", null);
        setIntField(term61406, term61406.getClass(), "listeningChildren", 0);
        setIntField(term61406, term61406.getClass(), "listeningBoundsChildren", 0);
        setIntField(term61406, term61406.getClass(), "descendantsCount", 0);
        setField(term61406, term61406.getClass(), "preserveBackgroundColor", null);
        setIntField(term61406, term61406.getClass(), "numOfHWComponents", 0);
        setIntField(term61406, term61406.getClass(), "numOfLWComponents", 0);
        setField(term61406, term61406.getClass(), "modalComp", null);
        setField(term61406, term61406.getClass(), "modalAppContext", null);
        setIntField(term61406, term61406.getClass(), "containerSerializedDataVersion", 0);
        setField(term61406, term61406.getClass(), "peer", null);
        setField(term61406, term61406.getClass(), "parent", null);
        setField(term61406, term61406.getClass(), "appContext", null);
        setIntField(term61406, term61406.getClass(), "x", 0);
        setIntField(term61406, term61406.getClass(), "y", 0);
        setIntField(term61406, term61406.getClass(), "width", 0);
        setIntField(term61406, term61406.getClass(), "height", 0);
        setField(term61406, term61406.getClass(), "foreground", null);
        setField(term61406, term61406.getClass(), "background", null);
        setField(term61406, term61406.getClass(), "font", null);
        setField(term61406, term61406.getClass(), "peerFont", null);
        setField(term61406, term61406.getClass(), "cursor", null);
        setField(term61406, term61406.getClass(), "locale", null);
        setField(term61406, term61406.getClass(), "graphicsConfig", null);
        setField(term61406, term61406.getClass(), "bufferStrategy", null);
        setBooleanField(term61406, term61406.getClass(), "ignoreRepaint", false);
        setBooleanField(term61406, term61406.getClass(), "visible", false);
        setBooleanField(term61406, term61406.getClass(), "enabled", false);
        setBooleanField(term61406, term61406.getClass(), "valid", false);
        setField(term61406, term61406.getClass(), "dropTarget", null);
        setField(term61406, term61406.getClass(), "popups", null);
        setField(term61406, term61406.getClass(), "name", null);
        setBooleanField(term61406, term61406.getClass(), "nameExplicitlySet", false);
        setBooleanField(term61406, term61406.getClass(), "focusable", false);
        setIntField(term61406, term61406.getClass(), "isFocusTraversableOverridden", 0);
        setField(term61406, term61406.getClass(), "focusTraversalKeys", null);
        setBooleanField(term61406, term61406.getClass(), "focusTraversalKeysEnabled", false);
        setField(term61406, term61406.getClass(), "acc", null);
        setField(term61406, term61406.getClass(), "minSize", null);
        setBooleanField(term61406, term61406.getClass(), "minSizeSet", false);
        setField(term61406, term61406.getClass(), "prefSize", null);
        setBooleanField(term61406, term61406.getClass(), "prefSizeSet", false);
        setField(term61406, term61406.getClass(), "maxSize", null);
        setBooleanField(term61406, term61406.getClass(), "maxSizeSet", false);
        setField(term61406, term61406.getClass(), "componentOrientation", null);
        setBooleanField(term61406, term61406.getClass(), "newEventsOnly", false);
        setField(term61406, term61406.getClass(), "componentListener", null);
        setField(term61406, term61406.getClass(), "focusListener", null);
        setField(term61406, term61406.getClass(), "hierarchyListener", null);
        setField(term61406, term61406.getClass(), "hierarchyBoundsListener", null);
        setField(term61406, term61406.getClass(), "keyListener", null);
        setField(term61406, term61406.getClass(), "mouseListener", null);
        setField(term61406, term61406.getClass(), "mouseMotionListener", null);
        setField(term61406, term61406.getClass(), "mouseWheelListener", null);
        setField(term61406, term61406.getClass(), "inputMethodListener", null);
        setLongField(term61406, term61406.getClass(), "eventMask", 0L);
        setField(term61406, term61406.getClass(), "changeSupport", null);
        setField(term61406, term61406.getClass(), "objectLock", null);
        setBooleanField(term61406, term61406.getClass(), "isPacked", false);
        setIntField(term61406, term61406.getClass(), "boundsOp", 0);
        setField(term61406, term61406.getClass(), "compoundShape", null);
        setField(term61406, term61406.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term61406, term61406.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term61406, term61406.getClass(), "backgroundEraseDisabled", false);
        setField(term61406, term61406.getClass(), "eventCache", null);
        setBooleanField(term61406, term61406.getClass(), "coalescingEnabled", false);
        setBooleanField(term61406, term61406.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term61406, term61406.getClass(), "componentSerializedDataVersion", 0);
        setField(term61406, term61406.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSmoothScrollNextRow", argTypes, term61406, args);
    }

};


