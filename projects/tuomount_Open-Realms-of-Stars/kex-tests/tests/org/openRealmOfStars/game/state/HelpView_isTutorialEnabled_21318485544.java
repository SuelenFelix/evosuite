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

public class HelpView_isTutorialEnabled_21318485544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612415;

    public HelpView_isTutorialEnabled_21318485544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term612415 = newInstance(Class.forName("org.openRealmOfStars.game.state.HelpView"));
        setField(term612415, term612415.getClass(), "infoText", null);
        setField(term612415, term612415.getClass(), "tutorialTree", null);
        setField(term612415, term612415.getClass(), "checkBox", null);
        setField(term612415, term612415.getClass(), "searchText", null);
        setField(term612415, term612415.getClass(), "matchesText", null);
        setField(term612415, term612415.getClass(), "root", null);
        setIntField(term612415, term612415.getClass(), "numberOfMatches", 0);
        setField(term612415, term612415.getClass(), "lastSearchText", null);
        setIntField(term612415, term612415.getClass(), "currentMatch", 0);
        setBooleanField(term612415, term612415.getClass(), "isAlignmentXSet", false);
        setFloatField(term612415, term612415.getClass(), "alignmentX", 0.0F);
        setBooleanField(term612415, term612415.getClass(), "isAlignmentYSet", false);
        setFloatField(term612415, term612415.getClass(), "alignmentY", 0.0F);
        setField(term612415, term612415.getClass(), "ui", null);
        setField(term612415, term612415.getClass(), "listenerList", null);
        setField(term612415, term612415.getClass(), "clientProperties", null);
        setField(term612415, term612415.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term612415, term612415.getClass(), "autoscrolls", false);
        setField(term612415, term612415.getClass(), "border", null);
        setIntField(term612415, term612415.getClass(), "flags", 0);
        setField(term612415, term612415.getClass(), "inputVerifier", null);
        setBooleanField(term612415, term612415.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term612415, term612415.getClass(), "paintingChild", null);
        setField(term612415, term612415.getClass(), "popupMenu", null);
        setField(term612415, term612415.getClass(), "revalidateRunnableScheduled", null);
        setField(term612415, term612415.getClass(), "focusInputMap", null);
        setField(term612415, term612415.getClass(), "ancestorInputMap", null);
        setField(term612415, term612415.getClass(), "windowInputMap", null);
        setField(term612415, term612415.getClass(), "actionMap", null);
        setField(term612415, term612415.getClass(), "aaHint", null);
        setField(term612415, term612415.getClass(), "lcdRenderingHint", null);
        setField(term612415, term612415.getClass(), "component", null);
        setField(term612415, term612415.getClass(), "layoutMgr", null);
        setField(term612415, term612415.getClass(), "dispatcher", null);
        setField(term612415, term612415.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term612415, term612415.getClass(), "focusCycleRoot", false);
        setBooleanField(term612415, term612415.getClass(), "focusTraversalPolicyProvider", false);
        setField(term612415, term612415.getClass(), "printingThreads", null);
        setBooleanField(term612415, term612415.getClass(), "printing", false);
        setField(term612415, term612415.getClass(), "containerListener", null);
        setIntField(term612415, term612415.getClass(), "listeningChildren", 0);
        setIntField(term612415, term612415.getClass(), "listeningBoundsChildren", 0);
        setIntField(term612415, term612415.getClass(), "descendantsCount", 0);
        setField(term612415, term612415.getClass(), "preserveBackgroundColor", null);
        setIntField(term612415, term612415.getClass(), "numOfHWComponents", 0);
        setIntField(term612415, term612415.getClass(), "numOfLWComponents", 0);
        setField(term612415, term612415.getClass(), "modalComp", null);
        setField(term612415, term612415.getClass(), "modalAppContext", null);
        setIntField(term612415, term612415.getClass(), "containerSerializedDataVersion", 0);
        setField(term612415, term612415.getClass(), "peer", null);
        setField(term612415, term612415.getClass(), "parent", null);
        setField(term612415, term612415.getClass(), "appContext", null);
        setIntField(term612415, term612415.getClass(), "x", 0);
        setIntField(term612415, term612415.getClass(), "y", 0);
        setIntField(term612415, term612415.getClass(), "width", 0);
        setIntField(term612415, term612415.getClass(), "height", 0);
        setField(term612415, term612415.getClass(), "foreground", null);
        setField(term612415, term612415.getClass(), "background", null);
        setField(term612415, term612415.getClass(), "font", null);
        setField(term612415, term612415.getClass(), "peerFont", null);
        setField(term612415, term612415.getClass(), "cursor", null);
        setField(term612415, term612415.getClass(), "locale", null);
        setField(term612415, term612415.getClass(), "graphicsConfig", null);
        setField(term612415, term612415.getClass(), "bufferStrategy", null);
        setBooleanField(term612415, term612415.getClass(), "ignoreRepaint", false);
        setBooleanField(term612415, term612415.getClass(), "visible", false);
        setBooleanField(term612415, term612415.getClass(), "enabled", false);
        setBooleanField(term612415, term612415.getClass(), "valid", false);
        setField(term612415, term612415.getClass(), "dropTarget", null);
        setField(term612415, term612415.getClass(), "popups", null);
        setField(term612415, term612415.getClass(), "name", null);
        setBooleanField(term612415, term612415.getClass(), "nameExplicitlySet", false);
        setBooleanField(term612415, term612415.getClass(), "focusable", false);
        setIntField(term612415, term612415.getClass(), "isFocusTraversableOverridden", 0);
        setField(term612415, term612415.getClass(), "focusTraversalKeys", null);
        setBooleanField(term612415, term612415.getClass(), "focusTraversalKeysEnabled", false);
        setField(term612415, term612415.getClass(), "acc", null);
        setField(term612415, term612415.getClass(), "minSize", null);
        setBooleanField(term612415, term612415.getClass(), "minSizeSet", false);
        setField(term612415, term612415.getClass(), "prefSize", null);
        setBooleanField(term612415, term612415.getClass(), "prefSizeSet", false);
        setField(term612415, term612415.getClass(), "maxSize", null);
        setBooleanField(term612415, term612415.getClass(), "maxSizeSet", false);
        setField(term612415, term612415.getClass(), "componentOrientation", null);
        setBooleanField(term612415, term612415.getClass(), "newEventsOnly", false);
        setField(term612415, term612415.getClass(), "componentListener", null);
        setField(term612415, term612415.getClass(), "focusListener", null);
        setField(term612415, term612415.getClass(), "hierarchyListener", null);
        setField(term612415, term612415.getClass(), "hierarchyBoundsListener", null);
        setField(term612415, term612415.getClass(), "keyListener", null);
        setField(term612415, term612415.getClass(), "mouseListener", null);
        setField(term612415, term612415.getClass(), "mouseMotionListener", null);
        setField(term612415, term612415.getClass(), "mouseWheelListener", null);
        setField(term612415, term612415.getClass(), "inputMethodListener", null);
        setLongField(term612415, term612415.getClass(), "eventMask", 0L);
        setField(term612415, term612415.getClass(), "changeSupport", null);
        setField(term612415, term612415.getClass(), "objectLock", null);
        setBooleanField(term612415, term612415.getClass(), "isPacked", false);
        setIntField(term612415, term612415.getClass(), "boundsOp", 0);
        setField(term612415, term612415.getClass(), "compoundShape", null);
        setField(term612415, term612415.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term612415, term612415.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term612415, term612415.getClass(), "backgroundEraseDisabled", false);
        setField(term612415, term612415.getClass(), "eventCache", null);
        setBooleanField(term612415, term612415.getClass(), "coalescingEnabled", false);
        setBooleanField(term612415, term612415.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term612415, term612415.getClass(), "componentSerializedDataVersion", 0);
        setField(term612415, term612415.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HelpView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTutorialEnabled", argTypes, term612415, args);
    }

};


