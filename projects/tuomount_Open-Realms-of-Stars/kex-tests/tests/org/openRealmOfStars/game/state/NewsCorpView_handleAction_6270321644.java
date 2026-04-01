package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NewsCorpView_handleAction_6270321644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377496;

    public NewsCorpView_handleAction_6270321644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377496 = newInstance(Class.forName("org.openRealmOfStars.game.state.NewsCorpView"));
        setField(term377496, term377496.getClass(), "newsImage", null);
        setField(term377496, term377496.getClass(), "newsReader", null);
        setField(term377496, term377496.getClass(), "textArea", null);
        setIntField(term377496, term377496.getClass(), "animation", 0);
        setField(term377496, term377496.getClass(), "newsReaderPanel", null);
        setField(term377496, term377496.getClass(), "newsList", null);
        setIntField(term377496, term377496.getClass(), "newsIndex", 0);
        setField(term377496, term377496.getClass(), "newsLabel", null);
        setIntField(term377496, term377496.getClass(), "widthHeadLine", 0);
        setIntField(term377496, term377496.getClass(), "heightHeadLine", 0);
        setBooleanField(term377496, term377496.getClass(), "isAlignmentXSet", false);
        setFloatField(term377496, term377496.getClass(), "alignmentX", 0.0F);
        setBooleanField(term377496, term377496.getClass(), "isAlignmentYSet", false);
        setFloatField(term377496, term377496.getClass(), "alignmentY", 0.0F);
        setField(term377496, term377496.getClass(), "ui", null);
        setField(term377496, term377496.getClass(), "listenerList", null);
        setField(term377496, term377496.getClass(), "clientProperties", null);
        setField(term377496, term377496.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term377496, term377496.getClass(), "autoscrolls", false);
        setField(term377496, term377496.getClass(), "border", null);
        setIntField(term377496, term377496.getClass(), "flags", 0);
        setField(term377496, term377496.getClass(), "inputVerifier", null);
        setBooleanField(term377496, term377496.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term377496, term377496.getClass(), "paintingChild", null);
        setField(term377496, term377496.getClass(), "popupMenu", null);
        setField(term377496, term377496.getClass(), "revalidateRunnableScheduled", null);
        setField(term377496, term377496.getClass(), "focusInputMap", null);
        setField(term377496, term377496.getClass(), "ancestorInputMap", null);
        setField(term377496, term377496.getClass(), "windowInputMap", null);
        setField(term377496, term377496.getClass(), "actionMap", null);
        setField(term377496, term377496.getClass(), "aaHint", null);
        setField(term377496, term377496.getClass(), "lcdRenderingHint", null);
        setField(term377496, term377496.getClass(), "component", null);
        setField(term377496, term377496.getClass(), "layoutMgr", null);
        setField(term377496, term377496.getClass(), "dispatcher", null);
        setField(term377496, term377496.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term377496, term377496.getClass(), "focusCycleRoot", false);
        setBooleanField(term377496, term377496.getClass(), "focusTraversalPolicyProvider", false);
        setField(term377496, term377496.getClass(), "printingThreads", null);
        setBooleanField(term377496, term377496.getClass(), "printing", false);
        setField(term377496, term377496.getClass(), "containerListener", null);
        setIntField(term377496, term377496.getClass(), "listeningChildren", 0);
        setIntField(term377496, term377496.getClass(), "listeningBoundsChildren", 0);
        setIntField(term377496, term377496.getClass(), "descendantsCount", 0);
        setField(term377496, term377496.getClass(), "preserveBackgroundColor", null);
        setIntField(term377496, term377496.getClass(), "numOfHWComponents", 0);
        setIntField(term377496, term377496.getClass(), "numOfLWComponents", 0);
        setField(term377496, term377496.getClass(), "modalComp", null);
        setField(term377496, term377496.getClass(), "modalAppContext", null);
        setIntField(term377496, term377496.getClass(), "containerSerializedDataVersion", 0);
        setField(term377496, term377496.getClass(), "peer", null);
        setField(term377496, term377496.getClass(), "parent", null);
        setField(term377496, term377496.getClass(), "appContext", null);
        setIntField(term377496, term377496.getClass(), "x", 0);
        setIntField(term377496, term377496.getClass(), "y", 0);
        setIntField(term377496, term377496.getClass(), "width", 0);
        setIntField(term377496, term377496.getClass(), "height", 0);
        setField(term377496, term377496.getClass(), "foreground", null);
        setField(term377496, term377496.getClass(), "background", null);
        setField(term377496, term377496.getClass(), "font", null);
        setField(term377496, term377496.getClass(), "peerFont", null);
        setField(term377496, term377496.getClass(), "cursor", null);
        setField(term377496, term377496.getClass(), "locale", null);
        setField(term377496, term377496.getClass(), "graphicsConfig", null);
        setField(term377496, term377496.getClass(), "bufferStrategy", null);
        setBooleanField(term377496, term377496.getClass(), "ignoreRepaint", false);
        setBooleanField(term377496, term377496.getClass(), "visible", false);
        setBooleanField(term377496, term377496.getClass(), "enabled", false);
        setBooleanField(term377496, term377496.getClass(), "valid", false);
        setField(term377496, term377496.getClass(), "dropTarget", null);
        setField(term377496, term377496.getClass(), "popups", null);
        setField(term377496, term377496.getClass(), "name", null);
        setBooleanField(term377496, term377496.getClass(), "nameExplicitlySet", false);
        setBooleanField(term377496, term377496.getClass(), "focusable", false);
        setIntField(term377496, term377496.getClass(), "isFocusTraversableOverridden", 0);
        setField(term377496, term377496.getClass(), "focusTraversalKeys", null);
        setBooleanField(term377496, term377496.getClass(), "focusTraversalKeysEnabled", false);
        setField(term377496, term377496.getClass(), "acc", null);
        setField(term377496, term377496.getClass(), "minSize", null);
        setBooleanField(term377496, term377496.getClass(), "minSizeSet", false);
        setField(term377496, term377496.getClass(), "prefSize", null);
        setBooleanField(term377496, term377496.getClass(), "prefSizeSet", false);
        setField(term377496, term377496.getClass(), "maxSize", null);
        setBooleanField(term377496, term377496.getClass(), "maxSizeSet", false);
        setField(term377496, term377496.getClass(), "componentOrientation", null);
        setBooleanField(term377496, term377496.getClass(), "newEventsOnly", false);
        setField(term377496, term377496.getClass(), "componentListener", null);
        setField(term377496, term377496.getClass(), "focusListener", null);
        setField(term377496, term377496.getClass(), "hierarchyListener", null);
        setField(term377496, term377496.getClass(), "hierarchyBoundsListener", null);
        setField(term377496, term377496.getClass(), "keyListener", null);
        setField(term377496, term377496.getClass(), "mouseListener", null);
        setField(term377496, term377496.getClass(), "mouseMotionListener", null);
        setField(term377496, term377496.getClass(), "mouseWheelListener", null);
        setField(term377496, term377496.getClass(), "inputMethodListener", null);
        setLongField(term377496, term377496.getClass(), "eventMask", 0L);
        setField(term377496, term377496.getClass(), "changeSupport", null);
        setField(term377496, term377496.getClass(), "objectLock", null);
        setBooleanField(term377496, term377496.getClass(), "isPacked", false);
        setIntField(term377496, term377496.getClass(), "boundsOp", 0);
        setField(term377496, term377496.getClass(), "compoundShape", null);
        setField(term377496, term377496.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term377496, term377496.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term377496, term377496.getClass(), "backgroundEraseDisabled", false);
        setField(term377496, term377496.getClass(), "eventCache", null);
        setBooleanField(term377496, term377496.getClass(), "coalescingEnabled", false);
        setBooleanField(term377496, term377496.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term377496, term377496.getClass(), "componentSerializedDataVersion", 0);
        setField(term377496, term377496.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.NewsCorpView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term377496, args);
    }

};


