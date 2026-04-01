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

public class InfoTextPane_addText_14175128605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30680;
     Object term30727;

    public InfoTextPane_addText_14175128605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30680 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.InfoTextPane"));
        setField(term30680, term30680.getClass(), "pageLoader", null);
        setField(term30680, term30680.getClass(), "kit", null);
        setBooleanField(term30680, term30680.getClass(), "isUserSetEditorKit", false);
        setField(term30680, term30680.getClass(), "pageProperties", null);
        setField(term30680, term30680.getClass(), "typeHandlers", null);
        setField(term30680, term30680.getClass(), "model", null);
        setField(term30680, term30680.getClass(), "caret", null);
        setField(term30680, term30680.getClass(), "navigationFilter", null);
        setField(term30680, term30680.getClass(), "highlighter", null);
        setField(term30680, term30680.getClass(), "keymap", null);
        setField(term30680, term30680.getClass(), "caretEvent", null);
        setField(term30680, term30680.getClass(), "caretColor", null);
        setField(term30680, term30680.getClass(), "selectionColor", null);
        setField(term30680, term30680.getClass(), "selectedTextColor", null);
        setField(term30680, term30680.getClass(), "disabledTextColor", null);
        setBooleanField(term30680, term30680.getClass(), "editable", false);
        setField(term30680, term30680.getClass(), "margin", null);
        setCharField(term30680, term30680.getClass(), "focusAccelerator", (char) 0);
        setBooleanField(term30680, term30680.getClass(), "dragEnabled", false);
        setField(term30680, term30680.getClass(), "dropMode", null);
        setField(term30680, term30680.getClass(), "dropLocation", null);
        setField(term30680, term30680.getClass(), "inputMethodRequestsHandler", null);
        setField(term30680, term30680.getClass(), "composedTextAttribute", null);
        setField(term30680, term30680.getClass(), "composedTextContent", null);
        setField(term30680, term30680.getClass(), "composedTextStart", null);
        setField(term30680, term30680.getClass(), "composedTextEnd", null);
        setField(term30680, term30680.getClass(), "latestCommittedTextStart", null);
        setField(term30680, term30680.getClass(), "latestCommittedTextEnd", null);
        setField(term30680, term30680.getClass(), "composedTextCaret", null);
        setField(term30680, term30680.getClass(), "originalCaret", null);
        setBooleanField(term30680, term30680.getClass(), "checkedInputOverride", false);
        setBooleanField(term30680, term30680.getClass(), "needToSendKeyTypedEvent", false);
        setBooleanField(term30680, term30680.getClass(), "isAlignmentXSet", false);
        setFloatField(term30680, term30680.getClass(), "alignmentX", 0.0F);
        setBooleanField(term30680, term30680.getClass(), "isAlignmentYSet", false);
        setFloatField(term30680, term30680.getClass(), "alignmentY", 0.0F);
        setField(term30680, term30680.getClass(), "ui", null);
        setField(term30680, term30680.getClass(), "listenerList", null);
        setField(term30680, term30680.getClass(), "clientProperties", null);
        setField(term30680, term30680.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term30680, term30680.getClass(), "autoscrolls", false);
        setField(term30680, term30680.getClass(), "border", null);
        setIntField(term30680, term30680.getClass(), "flags", 0);
        setField(term30680, term30680.getClass(), "inputVerifier", null);
        setBooleanField(term30680, term30680.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term30680, term30680.getClass(), "paintingChild", null);
        setField(term30680, term30680.getClass(), "popupMenu", null);
        setField(term30680, term30680.getClass(), "revalidateRunnableScheduled", null);
        setField(term30680, term30680.getClass(), "focusInputMap", null);
        setField(term30680, term30680.getClass(), "ancestorInputMap", null);
        setField(term30680, term30680.getClass(), "windowInputMap", null);
        setField(term30680, term30680.getClass(), "actionMap", null);
        setField(term30680, term30680.getClass(), "aaHint", null);
        setField(term30680, term30680.getClass(), "lcdRenderingHint", null);
        setField(term30680, term30680.getClass(), "component", null);
        setField(term30680, term30680.getClass(), "layoutMgr", null);
        setField(term30680, term30680.getClass(), "dispatcher", null);
        setField(term30680, term30680.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term30680, term30680.getClass(), "focusCycleRoot", false);
        setBooleanField(term30680, term30680.getClass(), "focusTraversalPolicyProvider", false);
        setField(term30680, term30680.getClass(), "printingThreads", null);
        setBooleanField(term30680, term30680.getClass(), "printing", false);
        setField(term30680, term30680.getClass(), "containerListener", null);
        setIntField(term30680, term30680.getClass(), "listeningChildren", 0);
        setIntField(term30680, term30680.getClass(), "listeningBoundsChildren", 0);
        setIntField(term30680, term30680.getClass(), "descendantsCount", 0);
        setField(term30680, term30680.getClass(), "preserveBackgroundColor", null);
        setIntField(term30680, term30680.getClass(), "numOfHWComponents", 0);
        setIntField(term30680, term30680.getClass(), "numOfLWComponents", 0);
        setField(term30680, term30680.getClass(), "modalComp", null);
        setField(term30680, term30680.getClass(), "modalAppContext", null);
        setIntField(term30680, term30680.getClass(), "containerSerializedDataVersion", 0);
        setField(term30680, term30680.getClass(), "peer", null);
        setField(term30680, term30680.getClass(), "parent", null);
        setField(term30680, term30680.getClass(), "appContext", null);
        setIntField(term30680, term30680.getClass(), "x", 0);
        setIntField(term30680, term30680.getClass(), "y", 0);
        setIntField(term30680, term30680.getClass(), "width", 0);
        setIntField(term30680, term30680.getClass(), "height", 0);
        setField(term30680, term30680.getClass(), "foreground", null);
        setField(term30680, term30680.getClass(), "background", null);
        setField(term30680, term30680.getClass(), "font", null);
        setField(term30680, term30680.getClass(), "peerFont", null);
        setField(term30680, term30680.getClass(), "cursor", null);
        setField(term30680, term30680.getClass(), "locale", null);
        setField(term30680, term30680.getClass(), "graphicsConfig", null);
        setField(term30680, term30680.getClass(), "bufferStrategy", null);
        setBooleanField(term30680, term30680.getClass(), "ignoreRepaint", false);
        setBooleanField(term30680, term30680.getClass(), "visible", false);
        setBooleanField(term30680, term30680.getClass(), "enabled", false);
        setBooleanField(term30680, term30680.getClass(), "valid", false);
        setField(term30680, term30680.getClass(), "dropTarget", null);
        setField(term30680, term30680.getClass(), "popups", null);
        setField(term30680, term30680.getClass(), "name", null);
        setBooleanField(term30680, term30680.getClass(), "nameExplicitlySet", false);
        setBooleanField(term30680, term30680.getClass(), "focusable", false);
        setIntField(term30680, term30680.getClass(), "isFocusTraversableOverridden", 0);
        setField(term30680, term30680.getClass(), "focusTraversalKeys", null);
        setBooleanField(term30680, term30680.getClass(), "focusTraversalKeysEnabled", false);
        setField(term30680, term30680.getClass(), "acc", null);
        setField(term30680, term30680.getClass(), "minSize", null);
        setBooleanField(term30680, term30680.getClass(), "minSizeSet", false);
        setField(term30680, term30680.getClass(), "prefSize", null);
        setBooleanField(term30680, term30680.getClass(), "prefSizeSet", false);
        setField(term30680, term30680.getClass(), "maxSize", null);
        setBooleanField(term30680, term30680.getClass(), "maxSizeSet", false);
        setField(term30680, term30680.getClass(), "componentOrientation", null);
        setBooleanField(term30680, term30680.getClass(), "newEventsOnly", false);
        setField(term30680, term30680.getClass(), "componentListener", null);
        setField(term30680, term30680.getClass(), "focusListener", null);
        setField(term30680, term30680.getClass(), "hierarchyListener", null);
        setField(term30680, term30680.getClass(), "hierarchyBoundsListener", null);
        setField(term30680, term30680.getClass(), "keyListener", null);
        setField(term30680, term30680.getClass(), "mouseListener", null);
        setField(term30680, term30680.getClass(), "mouseMotionListener", null);
        setField(term30680, term30680.getClass(), "mouseWheelListener", null);
        setField(term30680, term30680.getClass(), "inputMethodListener", null);
        setLongField(term30680, term30680.getClass(), "eventMask", 0L);
        setField(term30680, term30680.getClass(), "changeSupport", null);
        setField(term30680, term30680.getClass(), "objectLock", null);
        setBooleanField(term30680, term30680.getClass(), "isPacked", false);
        setIntField(term30680, term30680.getClass(), "boundsOp", 0);
        setField(term30680, term30680.getClass(), "compoundShape", null);
        setField(term30680, term30680.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term30680, term30680.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term30680, term30680.getClass(), "backgroundEraseDisabled", false);
        setField(term30680, term30680.getClass(), "eventCache", null);
        setBooleanField(term30680, term30680.getClass(), "coalescingEnabled", false);
        setBooleanField(term30680, term30680.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term30680, term30680.getClass(), "componentSerializedDataVersion", 0);
        setField(term30680, term30680.getClass(), "accessibleContext", null);
        term30727 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.InfoTextPane");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.awt.Color");
        Object[] args = new Object[2];
        args[0] = term30727;
        args[1] = null;
        callMethod(klass, "addText", argTypes, term30680, args);
    }

};


