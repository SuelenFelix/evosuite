package org.openRealmOfStars.gui.panels;

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
import static org.openRealmOfStars.gui.panels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MessagePanel_isShowAll_12062350557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69192;

    public MessagePanel_isShowAll_12062350557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69192 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.MessagePanel"));
        setField(term69192, term69192.getClass(), "btnPrev", null);
        setField(term69192, term69192.getClass(), "btnNext", null);
        setField(term69192, term69192.getClass(), "btnFilter", null);
        setField(term69192, term69192.getClass(), "btnShowAll", null);
        setField(term69192, term69192.getClass(), "msgText", null);
        setField(term69192, term69192.getClass(), "countLabel", null);
        setField(term69192, term69192.getClass(), "titleLabel", null);
        setField(term69192, term69192.getClass(), "btnFocus", null);
        setBooleanField(term69192, term69192.getClass(), "showAll", false);
        setBooleanField(term69192, term69192.getClass(), "isAlignmentXSet", false);
        setFloatField(term69192, term69192.getClass(), "alignmentX", 0.0F);
        setBooleanField(term69192, term69192.getClass(), "isAlignmentYSet", false);
        setFloatField(term69192, term69192.getClass(), "alignmentY", 0.0F);
        setField(term69192, term69192.getClass(), "ui", null);
        setField(term69192, term69192.getClass(), "listenerList", null);
        setField(term69192, term69192.getClass(), "clientProperties", null);
        setField(term69192, term69192.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term69192, term69192.getClass(), "autoscrolls", false);
        setField(term69192, term69192.getClass(), "border", null);
        setIntField(term69192, term69192.getClass(), "flags", 0);
        setField(term69192, term69192.getClass(), "inputVerifier", null);
        setBooleanField(term69192, term69192.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term69192, term69192.getClass(), "paintingChild", null);
        setField(term69192, term69192.getClass(), "popupMenu", null);
        setField(term69192, term69192.getClass(), "revalidateRunnableScheduled", null);
        setField(term69192, term69192.getClass(), "focusInputMap", null);
        setField(term69192, term69192.getClass(), "ancestorInputMap", null);
        setField(term69192, term69192.getClass(), "windowInputMap", null);
        setField(term69192, term69192.getClass(), "actionMap", null);
        setField(term69192, term69192.getClass(), "aaHint", null);
        setField(term69192, term69192.getClass(), "lcdRenderingHint", null);
        setField(term69192, term69192.getClass(), "component", null);
        setField(term69192, term69192.getClass(), "layoutMgr", null);
        setField(term69192, term69192.getClass(), "dispatcher", null);
        setField(term69192, term69192.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term69192, term69192.getClass(), "focusCycleRoot", false);
        setBooleanField(term69192, term69192.getClass(), "focusTraversalPolicyProvider", false);
        setField(term69192, term69192.getClass(), "printingThreads", null);
        setBooleanField(term69192, term69192.getClass(), "printing", false);
        setField(term69192, term69192.getClass(), "containerListener", null);
        setIntField(term69192, term69192.getClass(), "listeningChildren", 0);
        setIntField(term69192, term69192.getClass(), "listeningBoundsChildren", 0);
        setIntField(term69192, term69192.getClass(), "descendantsCount", 0);
        setField(term69192, term69192.getClass(), "preserveBackgroundColor", null);
        setIntField(term69192, term69192.getClass(), "numOfHWComponents", 0);
        setIntField(term69192, term69192.getClass(), "numOfLWComponents", 0);
        setField(term69192, term69192.getClass(), "modalComp", null);
        setField(term69192, term69192.getClass(), "modalAppContext", null);
        setIntField(term69192, term69192.getClass(), "containerSerializedDataVersion", 0);
        setField(term69192, term69192.getClass(), "peer", null);
        setField(term69192, term69192.getClass(), "parent", null);
        setField(term69192, term69192.getClass(), "appContext", null);
        setIntField(term69192, term69192.getClass(), "x", 0);
        setIntField(term69192, term69192.getClass(), "y", 0);
        setIntField(term69192, term69192.getClass(), "width", 0);
        setIntField(term69192, term69192.getClass(), "height", 0);
        setField(term69192, term69192.getClass(), "foreground", null);
        setField(term69192, term69192.getClass(), "background", null);
        setField(term69192, term69192.getClass(), "font", null);
        setField(term69192, term69192.getClass(), "peerFont", null);
        setField(term69192, term69192.getClass(), "cursor", null);
        setField(term69192, term69192.getClass(), "locale", null);
        setField(term69192, term69192.getClass(), "graphicsConfig", null);
        setField(term69192, term69192.getClass(), "bufferStrategy", null);
        setBooleanField(term69192, term69192.getClass(), "ignoreRepaint", false);
        setBooleanField(term69192, term69192.getClass(), "visible", false);
        setBooleanField(term69192, term69192.getClass(), "enabled", false);
        setBooleanField(term69192, term69192.getClass(), "valid", false);
        setField(term69192, term69192.getClass(), "dropTarget", null);
        setField(term69192, term69192.getClass(), "popups", null);
        setField(term69192, term69192.getClass(), "name", null);
        setBooleanField(term69192, term69192.getClass(), "nameExplicitlySet", false);
        setBooleanField(term69192, term69192.getClass(), "focusable", false);
        setIntField(term69192, term69192.getClass(), "isFocusTraversableOverridden", 0);
        setField(term69192, term69192.getClass(), "focusTraversalKeys", null);
        setBooleanField(term69192, term69192.getClass(), "focusTraversalKeysEnabled", false);
        setField(term69192, term69192.getClass(), "acc", null);
        setField(term69192, term69192.getClass(), "minSize", null);
        setBooleanField(term69192, term69192.getClass(), "minSizeSet", false);
        setField(term69192, term69192.getClass(), "prefSize", null);
        setBooleanField(term69192, term69192.getClass(), "prefSizeSet", false);
        setField(term69192, term69192.getClass(), "maxSize", null);
        setBooleanField(term69192, term69192.getClass(), "maxSizeSet", false);
        setField(term69192, term69192.getClass(), "componentOrientation", null);
        setBooleanField(term69192, term69192.getClass(), "newEventsOnly", false);
        setField(term69192, term69192.getClass(), "componentListener", null);
        setField(term69192, term69192.getClass(), "focusListener", null);
        setField(term69192, term69192.getClass(), "hierarchyListener", null);
        setField(term69192, term69192.getClass(), "hierarchyBoundsListener", null);
        setField(term69192, term69192.getClass(), "keyListener", null);
        setField(term69192, term69192.getClass(), "mouseListener", null);
        setField(term69192, term69192.getClass(), "mouseMotionListener", null);
        setField(term69192, term69192.getClass(), "mouseWheelListener", null);
        setField(term69192, term69192.getClass(), "inputMethodListener", null);
        setLongField(term69192, term69192.getClass(), "eventMask", 0L);
        setField(term69192, term69192.getClass(), "changeSupport", null);
        setField(term69192, term69192.getClass(), "objectLock", null);
        setBooleanField(term69192, term69192.getClass(), "isPacked", false);
        setIntField(term69192, term69192.getClass(), "boundsOp", 0);
        setField(term69192, term69192.getClass(), "compoundShape", null);
        setField(term69192, term69192.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term69192, term69192.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term69192, term69192.getClass(), "backgroundEraseDisabled", false);
        setField(term69192, term69192.getClass(), "eventCache", null);
        setBooleanField(term69192, term69192.getClass(), "coalescingEnabled", false);
        setBooleanField(term69192, term69192.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term69192, term69192.getClass(), "componentSerializedDataVersion", 0);
        setField(term69192, term69192.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.MessagePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowAll", argTypes, term69192, args);
    }

};


