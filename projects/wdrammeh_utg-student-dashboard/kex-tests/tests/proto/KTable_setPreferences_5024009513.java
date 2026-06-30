package proto;

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
import static proto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KTable_setPreferences_5024009513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35987;

    public KTable_setPreferences_5024009513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35987 = newInstance(Class.forName("proto.KTable"));
        setField(term35987, term35987.getClass(), "dataModel", null);
        setField(term35987, term35987.getClass(), "columnModel", null);
        setField(term35987, term35987.getClass(), "selectionModel", null);
        setField(term35987, term35987.getClass(), "tableHeader", null);
        setIntField(term35987, term35987.getClass(), "rowHeight", 0);
        setIntField(term35987, term35987.getClass(), "rowMargin", 0);
        setField(term35987, term35987.getClass(), "gridColor", null);
        setBooleanField(term35987, term35987.getClass(), "showHorizontalLines", false);
        setBooleanField(term35987, term35987.getClass(), "showVerticalLines", false);
        setIntField(term35987, term35987.getClass(), "autoResizeMode", 0);
        setBooleanField(term35987, term35987.getClass(), "autoCreateColumnsFromModel", false);
        setField(term35987, term35987.getClass(), "preferredViewportSize", null);
        setBooleanField(term35987, term35987.getClass(), "rowSelectionAllowed", false);
        setBooleanField(term35987, term35987.getClass(), "cellSelectionEnabled", false);
        setField(term35987, term35987.getClass(), "editorComp", null);
        setField(term35987, term35987.getClass(), "cellEditor", null);
        setIntField(term35987, term35987.getClass(), "editingColumn", 0);
        setIntField(term35987, term35987.getClass(), "editingRow", 0);
        setField(term35987, term35987.getClass(), "defaultRenderersByColumnClass", null);
        setField(term35987, term35987.getClass(), "defaultEditorsByColumnClass", null);
        setField(term35987, term35987.getClass(), "selectionForeground", null);
        setField(term35987, term35987.getClass(), "selectionBackground", null);
        setField(term35987, term35987.getClass(), "rowModel", null);
        setBooleanField(term35987, term35987.getClass(), "dragEnabled", false);
        setBooleanField(term35987, term35987.getClass(), "surrendersFocusOnKeystroke", false);
        setField(term35987, term35987.getClass(), "editorRemover", null);
        setBooleanField(term35987, term35987.getClass(), "columnSelectionAdjusting", false);
        setBooleanField(term35987, term35987.getClass(), "rowSelectionAdjusting", false);
        setField(term35987, term35987.getClass(), "printError", null);
        setBooleanField(term35987, term35987.getClass(), "isRowHeightSet", false);
        setBooleanField(term35987, term35987.getClass(), "updateSelectionOnSort", false);
        setField(term35987, term35987.getClass(), "sortManager", null);
        setBooleanField(term35987, term35987.getClass(), "ignoreSortChange", false);
        setBooleanField(term35987, term35987.getClass(), "sorterChanged", false);
        setBooleanField(term35987, term35987.getClass(), "autoCreateRowSorter", false);
        setBooleanField(term35987, term35987.getClass(), "fillsViewportHeight", false);
        setField(term35987, term35987.getClass(), "dropMode", null);
        setField(term35987, term35987.getClass(), "dropLocation", null);
        setBooleanField(term35987, term35987.getClass(), "updateInProgress", false);
        setBooleanField(term35987, term35987.getClass(), "isAlignmentXSet", false);
        setFloatField(term35987, term35987.getClass(), "alignmentX", 0.0F);
        setBooleanField(term35987, term35987.getClass(), "isAlignmentYSet", false);
        setFloatField(term35987, term35987.getClass(), "alignmentY", 0.0F);
        setField(term35987, term35987.getClass(), "ui", null);
        setField(term35987, term35987.getClass(), "listenerList", null);
        setField(term35987, term35987.getClass(), "clientProperties", null);
        setField(term35987, term35987.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term35987, term35987.getClass(), "autoscrolls", false);
        setField(term35987, term35987.getClass(), "border", null);
        setIntField(term35987, term35987.getClass(), "flags", 0);
        setField(term35987, term35987.getClass(), "inputVerifier", null);
        setBooleanField(term35987, term35987.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term35987, term35987.getClass(), "paintingChild", null);
        setField(term35987, term35987.getClass(), "popupMenu", null);
        setField(term35987, term35987.getClass(), "revalidateRunnableScheduled", null);
        setField(term35987, term35987.getClass(), "focusInputMap", null);
        setField(term35987, term35987.getClass(), "ancestorInputMap", null);
        setField(term35987, term35987.getClass(), "windowInputMap", null);
        setField(term35987, term35987.getClass(), "actionMap", null);
        setField(term35987, term35987.getClass(), "aaHint", null);
        setField(term35987, term35987.getClass(), "lcdRenderingHint", null);
        setField(term35987, term35987.getClass(), "component", null);
        setField(term35987, term35987.getClass(), "layoutMgr", null);
        setField(term35987, term35987.getClass(), "dispatcher", null);
        setField(term35987, term35987.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term35987, term35987.getClass(), "focusCycleRoot", false);
        setBooleanField(term35987, term35987.getClass(), "focusTraversalPolicyProvider", false);
        setField(term35987, term35987.getClass(), "printingThreads", null);
        setBooleanField(term35987, term35987.getClass(), "printing", false);
        setField(term35987, term35987.getClass(), "containerListener", null);
        setIntField(term35987, term35987.getClass(), "listeningChildren", 0);
        setIntField(term35987, term35987.getClass(), "listeningBoundsChildren", 0);
        setIntField(term35987, term35987.getClass(), "descendantsCount", 0);
        setField(term35987, term35987.getClass(), "preserveBackgroundColor", null);
        setIntField(term35987, term35987.getClass(), "numOfHWComponents", 0);
        setIntField(term35987, term35987.getClass(), "numOfLWComponents", 0);
        setField(term35987, term35987.getClass(), "modalComp", null);
        setField(term35987, term35987.getClass(), "modalAppContext", null);
        setIntField(term35987, term35987.getClass(), "containerSerializedDataVersion", 0);
        setField(term35987, term35987.getClass(), "peer", null);
        setField(term35987, term35987.getClass(), "parent", null);
        setField(term35987, term35987.getClass(), "appContext", null);
        setIntField(term35987, term35987.getClass(), "x", 0);
        setIntField(term35987, term35987.getClass(), "y", 0);
        setIntField(term35987, term35987.getClass(), "width", 0);
        setIntField(term35987, term35987.getClass(), "height", 0);
        setField(term35987, term35987.getClass(), "foreground", null);
        setField(term35987, term35987.getClass(), "background", null);
        setField(term35987, term35987.getClass(), "font", null);
        setField(term35987, term35987.getClass(), "peerFont", null);
        setField(term35987, term35987.getClass(), "cursor", null);
        setField(term35987, term35987.getClass(), "locale", null);
        setField(term35987, term35987.getClass(), "graphicsConfig", null);
        setField(term35987, term35987.getClass(), "bufferStrategy", null);
        setBooleanField(term35987, term35987.getClass(), "ignoreRepaint", false);
        setBooleanField(term35987, term35987.getClass(), "visible", false);
        setBooleanField(term35987, term35987.getClass(), "enabled", false);
        setBooleanField(term35987, term35987.getClass(), "valid", false);
        setField(term35987, term35987.getClass(), "dropTarget", null);
        setField(term35987, term35987.getClass(), "popups", null);
        setField(term35987, term35987.getClass(), "name", null);
        setBooleanField(term35987, term35987.getClass(), "nameExplicitlySet", false);
        setBooleanField(term35987, term35987.getClass(), "focusable", false);
        setIntField(term35987, term35987.getClass(), "isFocusTraversableOverridden", 0);
        setField(term35987, term35987.getClass(), "focusTraversalKeys", null);
        setBooleanField(term35987, term35987.getClass(), "focusTraversalKeysEnabled", false);
        setField(term35987, term35987.getClass(), "acc", null);
        setField(term35987, term35987.getClass(), "minSize", null);
        setBooleanField(term35987, term35987.getClass(), "minSizeSet", false);
        setField(term35987, term35987.getClass(), "prefSize", null);
        setBooleanField(term35987, term35987.getClass(), "prefSizeSet", false);
        setField(term35987, term35987.getClass(), "maxSize", null);
        setBooleanField(term35987, term35987.getClass(), "maxSizeSet", false);
        setField(term35987, term35987.getClass(), "componentOrientation", null);
        setBooleanField(term35987, term35987.getClass(), "newEventsOnly", false);
        setField(term35987, term35987.getClass(), "componentListener", null);
        setField(term35987, term35987.getClass(), "focusListener", null);
        setField(term35987, term35987.getClass(), "hierarchyListener", null);
        setField(term35987, term35987.getClass(), "hierarchyBoundsListener", null);
        setField(term35987, term35987.getClass(), "keyListener", null);
        setField(term35987, term35987.getClass(), "mouseListener", null);
        setField(term35987, term35987.getClass(), "mouseMotionListener", null);
        setField(term35987, term35987.getClass(), "mouseWheelListener", null);
        setField(term35987, term35987.getClass(), "inputMethodListener", null);
        setLongField(term35987, term35987.getClass(), "eventMask", 0L);
        setField(term35987, term35987.getClass(), "changeSupport", null);
        setField(term35987, term35987.getClass(), "objectLock", null);
        setBooleanField(term35987, term35987.getClass(), "isPacked", false);
        setIntField(term35987, term35987.getClass(), "boundsOp", 0);
        setField(term35987, term35987.getClass(), "compoundShape", null);
        setField(term35987, term35987.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term35987, term35987.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term35987, term35987.getClass(), "backgroundEraseDisabled", false);
        setField(term35987, term35987.getClass(), "eventCache", null);
        setBooleanField(term35987, term35987.getClass(), "coalescingEnabled", false);
        setBooleanField(term35987, term35987.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term35987, term35987.getClass(), "componentSerializedDataVersion", 0);
        setField(term35987, term35987.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term35987, args);
    }

};


