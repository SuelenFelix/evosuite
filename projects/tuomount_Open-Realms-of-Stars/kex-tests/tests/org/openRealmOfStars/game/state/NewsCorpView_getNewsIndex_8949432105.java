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

public class NewsCorpView_getNewsIndex_8949432105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377541;

    public NewsCorpView_getNewsIndex_8949432105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377541 = newInstance(Class.forName("org.openRealmOfStars.game.state.NewsCorpView"));
        setField(term377541, term377541.getClass(), "newsImage", null);
        setField(term377541, term377541.getClass(), "newsReader", null);
        setField(term377541, term377541.getClass(), "textArea", null);
        setIntField(term377541, term377541.getClass(), "animation", 0);
        setField(term377541, term377541.getClass(), "newsReaderPanel", null);
        setField(term377541, term377541.getClass(), "newsList", null);
        setIntField(term377541, term377541.getClass(), "newsIndex", 0);
        setField(term377541, term377541.getClass(), "newsLabel", null);
        setIntField(term377541, term377541.getClass(), "widthHeadLine", 0);
        setIntField(term377541, term377541.getClass(), "heightHeadLine", 0);
        setBooleanField(term377541, term377541.getClass(), "isAlignmentXSet", false);
        setFloatField(term377541, term377541.getClass(), "alignmentX", 0.0F);
        setBooleanField(term377541, term377541.getClass(), "isAlignmentYSet", false);
        setFloatField(term377541, term377541.getClass(), "alignmentY", 0.0F);
        setField(term377541, term377541.getClass(), "ui", null);
        setField(term377541, term377541.getClass(), "listenerList", null);
        setField(term377541, term377541.getClass(), "clientProperties", null);
        setField(term377541, term377541.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term377541, term377541.getClass(), "autoscrolls", false);
        setField(term377541, term377541.getClass(), "border", null);
        setIntField(term377541, term377541.getClass(), "flags", 0);
        setField(term377541, term377541.getClass(), "inputVerifier", null);
        setBooleanField(term377541, term377541.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term377541, term377541.getClass(), "paintingChild", null);
        setField(term377541, term377541.getClass(), "popupMenu", null);
        setField(term377541, term377541.getClass(), "revalidateRunnableScheduled", null);
        setField(term377541, term377541.getClass(), "focusInputMap", null);
        setField(term377541, term377541.getClass(), "ancestorInputMap", null);
        setField(term377541, term377541.getClass(), "windowInputMap", null);
        setField(term377541, term377541.getClass(), "actionMap", null);
        setField(term377541, term377541.getClass(), "aaHint", null);
        setField(term377541, term377541.getClass(), "lcdRenderingHint", null);
        setField(term377541, term377541.getClass(), "component", null);
        setField(term377541, term377541.getClass(), "layoutMgr", null);
        setField(term377541, term377541.getClass(), "dispatcher", null);
        setField(term377541, term377541.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term377541, term377541.getClass(), "focusCycleRoot", false);
        setBooleanField(term377541, term377541.getClass(), "focusTraversalPolicyProvider", false);
        setField(term377541, term377541.getClass(), "printingThreads", null);
        setBooleanField(term377541, term377541.getClass(), "printing", false);
        setField(term377541, term377541.getClass(), "containerListener", null);
        setIntField(term377541, term377541.getClass(), "listeningChildren", 0);
        setIntField(term377541, term377541.getClass(), "listeningBoundsChildren", 0);
        setIntField(term377541, term377541.getClass(), "descendantsCount", 0);
        setField(term377541, term377541.getClass(), "preserveBackgroundColor", null);
        setIntField(term377541, term377541.getClass(), "numOfHWComponents", 0);
        setIntField(term377541, term377541.getClass(), "numOfLWComponents", 0);
        setField(term377541, term377541.getClass(), "modalComp", null);
        setField(term377541, term377541.getClass(), "modalAppContext", null);
        setIntField(term377541, term377541.getClass(), "containerSerializedDataVersion", 0);
        setField(term377541, term377541.getClass(), "peer", null);
        setField(term377541, term377541.getClass(), "parent", null);
        setField(term377541, term377541.getClass(), "appContext", null);
        setIntField(term377541, term377541.getClass(), "x", 0);
        setIntField(term377541, term377541.getClass(), "y", 0);
        setIntField(term377541, term377541.getClass(), "width", 0);
        setIntField(term377541, term377541.getClass(), "height", 0);
        setField(term377541, term377541.getClass(), "foreground", null);
        setField(term377541, term377541.getClass(), "background", null);
        setField(term377541, term377541.getClass(), "font", null);
        setField(term377541, term377541.getClass(), "peerFont", null);
        setField(term377541, term377541.getClass(), "cursor", null);
        setField(term377541, term377541.getClass(), "locale", null);
        setField(term377541, term377541.getClass(), "graphicsConfig", null);
        setField(term377541, term377541.getClass(), "bufferStrategy", null);
        setBooleanField(term377541, term377541.getClass(), "ignoreRepaint", false);
        setBooleanField(term377541, term377541.getClass(), "visible", false);
        setBooleanField(term377541, term377541.getClass(), "enabled", false);
        setBooleanField(term377541, term377541.getClass(), "valid", false);
        setField(term377541, term377541.getClass(), "dropTarget", null);
        setField(term377541, term377541.getClass(), "popups", null);
        setField(term377541, term377541.getClass(), "name", null);
        setBooleanField(term377541, term377541.getClass(), "nameExplicitlySet", false);
        setBooleanField(term377541, term377541.getClass(), "focusable", false);
        setIntField(term377541, term377541.getClass(), "isFocusTraversableOverridden", 0);
        setField(term377541, term377541.getClass(), "focusTraversalKeys", null);
        setBooleanField(term377541, term377541.getClass(), "focusTraversalKeysEnabled", false);
        setField(term377541, term377541.getClass(), "acc", null);
        setField(term377541, term377541.getClass(), "minSize", null);
        setBooleanField(term377541, term377541.getClass(), "minSizeSet", false);
        setField(term377541, term377541.getClass(), "prefSize", null);
        setBooleanField(term377541, term377541.getClass(), "prefSizeSet", false);
        setField(term377541, term377541.getClass(), "maxSize", null);
        setBooleanField(term377541, term377541.getClass(), "maxSizeSet", false);
        setField(term377541, term377541.getClass(), "componentOrientation", null);
        setBooleanField(term377541, term377541.getClass(), "newEventsOnly", false);
        setField(term377541, term377541.getClass(), "componentListener", null);
        setField(term377541, term377541.getClass(), "focusListener", null);
        setField(term377541, term377541.getClass(), "hierarchyListener", null);
        setField(term377541, term377541.getClass(), "hierarchyBoundsListener", null);
        setField(term377541, term377541.getClass(), "keyListener", null);
        setField(term377541, term377541.getClass(), "mouseListener", null);
        setField(term377541, term377541.getClass(), "mouseMotionListener", null);
        setField(term377541, term377541.getClass(), "mouseWheelListener", null);
        setField(term377541, term377541.getClass(), "inputMethodListener", null);
        setLongField(term377541, term377541.getClass(), "eventMask", 0L);
        setField(term377541, term377541.getClass(), "changeSupport", null);
        setField(term377541, term377541.getClass(), "objectLock", null);
        setBooleanField(term377541, term377541.getClass(), "isPacked", false);
        setIntField(term377541, term377541.getClass(), "boundsOp", 0);
        setField(term377541, term377541.getClass(), "compoundShape", null);
        setField(term377541, term377541.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term377541, term377541.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term377541, term377541.getClass(), "backgroundEraseDisabled", false);
        setField(term377541, term377541.getClass(), "eventCache", null);
        setBooleanField(term377541, term377541.getClass(), "coalescingEnabled", false);
        setBooleanField(term377541, term377541.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term377541, term377541.getClass(), "componentSerializedDataVersion", 0);
        setField(term377541, term377541.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.NewsCorpView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNewsIndex", argTypes, term377541, args);
    }

};


