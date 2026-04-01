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

public class InfoTextPane_addText_9925737614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30633;

    public InfoTextPane_addText_9925737614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30633 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextPane"));
        setField(term30633, term30633.getClass(), "pageLoader", null);
        setField(term30633, term30633.getClass(), "kit", null);
        setBooleanField(term30633, term30633.getClass(), "isUserSetEditorKit", false);
        setField(term30633, term30633.getClass(), "pageProperties", null);
        setField(term30633, term30633.getClass(), "typeHandlers", null);
        setField(term30633, term30633.getClass(), "model", null);
        setField(term30633, term30633.getClass(), "caret", null);
        setField(term30633, term30633.getClass(), "navigationFilter", null);
        setField(term30633, term30633.getClass(), "highlighter", null);
        setField(term30633, term30633.getClass(), "keymap", null);
        setField(term30633, term30633.getClass(), "caretEvent", null);
        setField(term30633, term30633.getClass(), "caretColor", null);
        setField(term30633, term30633.getClass(), "selectionColor", null);
        setField(term30633, term30633.getClass(), "selectedTextColor", null);
        setField(term30633, term30633.getClass(), "disabledTextColor", null);
        setBooleanField(term30633, term30633.getClass(), "editable", false);
        setField(term30633, term30633.getClass(), "margin", null);
        setCharField(term30633, term30633.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term30633, term30633.getClass(), "dragEnabled", false);
        setField(term30633, term30633.getClass(), "dropMode", null);
        setField(term30633, term30633.getClass(), "dropLocation", null);
        setField(term30633, term30633.getClass(), "inputMethodRequestsHandler", null);
        setField(term30633, term30633.getClass(), "composedTextAttribute", null);
        setField(term30633, term30633.getClass(), "composedTextContent", null);
        setField(term30633, term30633.getClass(), "composedTextStart", null);
        setField(term30633, term30633.getClass(), "composedTextEnd", null);
        setField(term30633, term30633.getClass(), "latestCommittedTextStart", null);
        setField(term30633, term30633.getClass(), "latestCommittedTextEnd", null);
        setField(term30633, term30633.getClass(), "composedTextCaret", null);
        setField(term30633, term30633.getClass(), "originalCaret", null);
        setBooleanField(term30633, term30633.getClass(), "checkedInputOverride", false);
        setBooleanField(term30633, term30633.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term30633, term30633.getClass(), "isAlignmentXSet", false);
        setFloatField(term30633, term30633.getClass(), "alignmentX", 0.0F);
        setBooleanField(term30633, term30633.getClass(), "isAlignmentYSet", false);
        setFloatField(term30633, term30633.getClass(), "alignmentY", 0.0F);
        setField(term30633, term30633.getClass(), "ui", null);
        setField(term30633, term30633.getClass(), "listenerList", null);
        setField(term30633, term30633.getClass(), "clientProperties", null);
        setField(term30633, term30633.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term30633, term30633.getClass(), "autoscrolls", false);
        setField(term30633, term30633.getClass(), "border", null);
        setIntField(term30633, term30633.getClass(), "flags", 0);
        setField(term30633, term30633.getClass(), "inputVerifier", null);
        setBooleanField(term30633, term30633.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term30633, term30633.getClass(), "paintingChild", null);
        setField(term30633, term30633.getClass(), "popupMenu", null);
        setField(term30633, term30633.getClass(), "revalidateRunnableScheduled", null);
        setField(term30633, term30633.getClass(), "focusInputMap", null);
        setField(term30633, term30633.getClass(), "ancestorInputMap", null);
        setField(term30633, term30633.getClass(), "windowInputMap", null);
        setField(term30633, term30633.getClass(), "actionMap", null);
        setField(term30633, term30633.getClass(), "aaHint", null);
        setField(term30633, term30633.getClass(), "lcdRenderingHint", null);
        setField(term30633, term30633.getClass(), "component", null);
        setField(term30633, term30633.getClass(), "layoutMgr", null);
        setField(term30633, term30633.getClass(), "dispatcher", null);
        setField(term30633, term30633.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term30633, term30633.getClass(), "focusCycleRoot", false);
        setBooleanField(term30633, term30633.getClass(), "focusTraversalPolicyProvider", false);
        setField(term30633, term30633.getClass(), "printingThreads", null);
        setBooleanField(term30633, term30633.getClass(), "printing", false);
        setField(term30633, term30633.getClass(), "containerListener", null);
        setIntField(term30633, term30633.getClass(), "listeningChildren", 0);
        setIntField(term30633, term30633.getClass(), "listeningBoundsChildren", 0);
        setIntField(term30633, term30633.getClass(), "descendantsCount", 0);
        setField(term30633, term30633.getClass(), "preserveBackgroundColor", null);
        setIntField(term30633, term30633.getClass(), "numOfHWComponents", 0);
        setIntField(term30633, term30633.getClass(), "numOfLWComponents", 0);
        setField(term30633, term30633.getClass(), "modalComp", null);
        setField(term30633, term30633.getClass(), "modalAppContext", null);
        setIntField(term30633, term30633.getClass(), "containerSerializedDataVersion", 0);
        setField(term30633, term30633.getClass(), "peer", null);
        setField(term30633, term30633.getClass(), "parent", null);
        setField(term30633, term30633.getClass(), "appContext", null);
        setIntField(term30633, term30633.getClass(), "x", 0);
        setIntField(term30633, term30633.getClass(), "y", 0);
        setIntField(term30633, term30633.getClass(), "width", 0);
        setIntField(term30633, term30633.getClass(), "height", 0);
        setField(term30633, term30633.getClass(), "foreground", null);
        setField(term30633, term30633.getClass(), "background", null);
        setField(term30633, term30633.getClass(), "font", null);
        setField(term30633, term30633.getClass(), "peerFont", null);
        setField(term30633, term30633.getClass(), "cursor", null);
        setField(term30633, term30633.getClass(), "locale", null);
        setField(term30633, term30633.getClass(), "graphicsConfig", null);
        setField(term30633, term30633.getClass(), "bufferStrategy", null);
        setBooleanField(term30633, term30633.getClass(), "ignoreRepaint", false);
        setBooleanField(term30633, term30633.getClass(), "visible", false);
        setBooleanField(term30633, term30633.getClass(), "enabled", false);
        setBooleanField(term30633, term30633.getClass(), "valid", false);
        setField(term30633, term30633.getClass(), "dropTarget", null);
        setField(term30633, term30633.getClass(), "popups", null);
        setField(term30633, term30633.getClass(), "name", null);
        setBooleanField(term30633, term30633.getClass(), "nameExplicitlySet", false);
        setBooleanField(term30633, term30633.getClass(), "focusable", false);
        setIntField(term30633, term30633.getClass(), "isFocusTraversableOverridden", 0);
        setField(term30633, term30633.getClass(), "focusTraversalKeys", null);
        setBooleanField(term30633, term30633.getClass(), "focusTraversalKeysEnabled", false);
        setField(term30633, term30633.getClass(), "acc", null);
        setField(term30633, term30633.getClass(), "minSize", null);
        setBooleanField(term30633, term30633.getClass(), "minSizeSet", false);
        setField(term30633, term30633.getClass(), "prefSize", null);
        setBooleanField(term30633, term30633.getClass(), "prefSizeSet", false);
        setField(term30633, term30633.getClass(), "maxSize", null);
        setBooleanField(term30633, term30633.getClass(), "maxSizeSet", false);
        setField(term30633, term30633.getClass(), "componentOrientation", null);
        setBooleanField(term30633, term30633.getClass(), "newEventsOnly", false);
        setField(term30633, term30633.getClass(), "componentListener", null);
        setField(term30633, term30633.getClass(), "focusListener", null);
        setField(term30633, term30633.getClass(), "hierarchyListener", null);
        setField(term30633, term30633.getClass(), "hierarchyBoundsListener", null);
        setField(term30633, term30633.getClass(), "keyListener", null);
        setField(term30633, term30633.getClass(), "mouseListener", null);
        setField(term30633, term30633.getClass(), "mouseMotionListener", null);
        setField(term30633, term30633.getClass(), "mouseWheelListener", null);
        setField(term30633, term30633.getClass(), "inputMethodListener", null);
        setLongField(term30633, term30633.getClass(), "eventMask", 0L);
        setField(term30633, term30633.getClass(), "changeSupport", null);
        setField(term30633, term30633.getClass(), "objectLock", null);
        setBooleanField(term30633, term30633.getClass(), "isPacked", false);
        setIntField(term30633, term30633.getClass(), "boundsOp", 0);
        setField(term30633, term30633.getClass(), "compoundShape", null);
        setField(term30633, term30633.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term30633, term30633.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term30633, term30633.getClass(), "backgroundEraseDisabled", false);
        setField(term30633, term30633.getClass(), "eventCache", null);
        setBooleanField(term30633, term30633.getClass(), "coalescingEnabled", false);
        setBooleanField(term30633, term30633.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term30633, term30633.getClass(), "componentSerializedDataVersion", 0);
        setField(term30633, term30633.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextPane");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Color");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addText", argTypes, term30633, args);
    }

};


