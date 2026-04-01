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
import java.lang.Boolean;

public class HelpView_search_928248476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614128;
     Object term614171;

    public HelpView_search_928248476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term614128 = newInstance(Class.forName("org.openRealmOfStars.game.state.HelpView"));
        setField(term614128, term614128.getClass(), "infoText", null);
        setField(term614128, term614128.getClass(), "tutorialTree", null);
        setField(term614128, term614128.getClass(), "checkBox", null);
        setField(term614128, term614128.getClass(), "searchText", null);
        setField(term614128, term614128.getClass(), "matchesText", null);
        setField(term614128, term614128.getClass(), "root", null);
        setIntField(term614128, term614128.getClass(), "numberOfMatches", 0);
        setField(term614128, term614128.getClass(), "lastSearchText", null);
        setIntField(term614128, term614128.getClass(), "currentMatch", 0);
        setBooleanField(term614128, term614128.getClass(), "isAlignmentXSet", false);
        setFloatField(term614128, term614128.getClass(), "alignmentX", 0.0F);
        setBooleanField(term614128, term614128.getClass(), "isAlignmentYSet", false);
        setFloatField(term614128, term614128.getClass(), "alignmentY", 0.0F);
        setField(term614128, term614128.getClass(), "ui", null);
        setField(term614128, term614128.getClass(), "listenerList", null);
        setField(term614128, term614128.getClass(), "clientProperties", null);
        setField(term614128, term614128.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term614128, term614128.getClass(), "autoscrolls", false);
        setField(term614128, term614128.getClass(), "border", null);
        setIntField(term614128, term614128.getClass(), "flags", 0);
        setField(term614128, term614128.getClass(), "inputVerifier", null);
        setBooleanField(term614128, term614128.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term614128, term614128.getClass(), "paintingChild", null);
        setField(term614128, term614128.getClass(), "popupMenu", null);
        setField(term614128, term614128.getClass(), "revalidateRunnableScheduled", null);
        setField(term614128, term614128.getClass(), "focusInputMap", null);
        setField(term614128, term614128.getClass(), "ancestorInputMap", null);
        setField(term614128, term614128.getClass(), "windowInputMap", null);
        setField(term614128, term614128.getClass(), "actionMap", null);
        setField(term614128, term614128.getClass(), "aaHint", null);
        setField(term614128, term614128.getClass(), "lcdRenderingHint", null);
        setField(term614128, term614128.getClass(), "component", null);
        setField(term614128, term614128.getClass(), "layoutMgr", null);
        setField(term614128, term614128.getClass(), "dispatcher", null);
        setField(term614128, term614128.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term614128, term614128.getClass(), "focusCycleRoot", false);
        setBooleanField(term614128, term614128.getClass(), "focusTraversalPolicyProvider", false);
        setField(term614128, term614128.getClass(), "printingThreads", null);
        setBooleanField(term614128, term614128.getClass(), "printing", false);
        setField(term614128, term614128.getClass(), "containerListener", null);
        setIntField(term614128, term614128.getClass(), "listeningChildren", 0);
        setIntField(term614128, term614128.getClass(), "listeningBoundsChildren", 0);
        setIntField(term614128, term614128.getClass(), "descendantsCount", 0);
        setField(term614128, term614128.getClass(), "preserveBackgroundColor", null);
        setIntField(term614128, term614128.getClass(), "numOfHWComponents", 0);
        setIntField(term614128, term614128.getClass(), "numOfLWComponents", 0);
        setField(term614128, term614128.getClass(), "modalComp", null);
        setField(term614128, term614128.getClass(), "modalAppContext", null);
        setIntField(term614128, term614128.getClass(), "containerSerializedDataVersion", 0);
        setField(term614128, term614128.getClass(), "peer", null);
        setField(term614128, term614128.getClass(), "parent", null);
        setField(term614128, term614128.getClass(), "appContext", null);
        setIntField(term614128, term614128.getClass(), "x", 0);
        setIntField(term614128, term614128.getClass(), "y", 0);
        setIntField(term614128, term614128.getClass(), "width", 0);
        setIntField(term614128, term614128.getClass(), "height", 0);
        setField(term614128, term614128.getClass(), "foreground", null);
        setField(term614128, term614128.getClass(), "background", null);
        setField(term614128, term614128.getClass(), "font", null);
        setField(term614128, term614128.getClass(), "peerFont", null);
        setField(term614128, term614128.getClass(), "cursor", null);
        setField(term614128, term614128.getClass(), "locale", null);
        setField(term614128, term614128.getClass(), "graphicsConfig", null);
        setField(term614128, term614128.getClass(), "bufferStrategy", null);
        setBooleanField(term614128, term614128.getClass(), "ignoreRepaint", false);
        setBooleanField(term614128, term614128.getClass(), "visible", false);
        setBooleanField(term614128, term614128.getClass(), "enabled", false);
        setBooleanField(term614128, term614128.getClass(), "valid", false);
        setField(term614128, term614128.getClass(), "dropTarget", null);
        setField(term614128, term614128.getClass(), "popups", null);
        setField(term614128, term614128.getClass(), "name", null);
        setBooleanField(term614128, term614128.getClass(), "nameExplicitlySet", false);
        setBooleanField(term614128, term614128.getClass(), "focusable", false);
        setIntField(term614128, term614128.getClass(), "isFocusTraversableOverridden", 0);
        setField(term614128, term614128.getClass(), "focusTraversalKeys", null);
        setBooleanField(term614128, term614128.getClass(), "focusTraversalKeysEnabled", false);
        setField(term614128, term614128.getClass(), "acc", null);
        setField(term614128, term614128.getClass(), "minSize", null);
        setBooleanField(term614128, term614128.getClass(), "minSizeSet", false);
        setField(term614128, term614128.getClass(), "prefSize", null);
        setBooleanField(term614128, term614128.getClass(), "prefSizeSet", false);
        setField(term614128, term614128.getClass(), "maxSize", null);
        setBooleanField(term614128, term614128.getClass(), "maxSizeSet", false);
        setField(term614128, term614128.getClass(), "componentOrientation", null);
        setBooleanField(term614128, term614128.getClass(), "newEventsOnly", false);
        setField(term614128, term614128.getClass(), "componentListener", null);
        setField(term614128, term614128.getClass(), "focusListener", null);
        setField(term614128, term614128.getClass(), "hierarchyListener", null);
        setField(term614128, term614128.getClass(), "hierarchyBoundsListener", null);
        setField(term614128, term614128.getClass(), "keyListener", null);
        setField(term614128, term614128.getClass(), "mouseListener", null);
        setField(term614128, term614128.getClass(), "mouseMotionListener", null);
        setField(term614128, term614128.getClass(), "mouseWheelListener", null);
        setField(term614128, term614128.getClass(), "inputMethodListener", null);
        setLongField(term614128, term614128.getClass(), "eventMask", 0L);
        setField(term614128, term614128.getClass(), "changeSupport", null);
        setField(term614128, term614128.getClass(), "objectLock", null);
        setBooleanField(term614128, term614128.getClass(), "isPacked", false);
        setIntField(term614128, term614128.getClass(), "boundsOp", 0);
        setField(term614128, term614128.getClass(), "compoundShape", null);
        setField(term614128, term614128.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term614128, term614128.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term614128, term614128.getClass(), "backgroundEraseDisabled", false);
        setField(term614128, term614128.getClass(), "eventCache", null);
        setBooleanField(term614128, term614128.getClass(), "coalescingEnabled", false);
        setBooleanField(term614128, term614128.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term614128, term614128.getClass(), "componentSerializedDataVersion", 0);
        setField(term614128, term614128.getClass(), "accessibleContext", null);
        term614171 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HelpView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term614171;
        callMethod(klass, "search", argTypes, term614128, args);
    }

};


