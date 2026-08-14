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

public class KTable_getProperSize_14741097005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32458;

    public KTable_getProperSize_14741097005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32458 = newInstance(Class.forName("proto.KTable"));
        setField(term32458, term32458.getClass(), "dataModel", null);
        setField(term32458, term32458.getClass(), "columnModel", null);
        setField(term32458, term32458.getClass(), "selectionModel", null);
        setField(term32458, term32458.getClass(), "tableHeader", null);
        setIntField(term32458, term32458.getClass(), "rowHeight", 0);
        setIntField(term32458, term32458.getClass(), "rowMargin", 0);
        setField(term32458, term32458.getClass(), "gridColor", null);
        setBooleanField(term32458, term32458.getClass(), "showHorizontalLines", false);
        setBooleanField(term32458, term32458.getClass(), "showVerticalLines", false);
        setIntField(term32458, term32458.getClass(), "autoResizeMode", 0);
        setBooleanField(term32458, term32458.getClass(), "autoCreateColumnsFromModel", false);
        setField(term32458, term32458.getClass(), "preferredViewportSize", null);
        setBooleanField(term32458, term32458.getClass(), "rowSelectionAllowed", false);
        setBooleanField(term32458, term32458.getClass(), "cellSelectionEnabled", false);
        setField(term32458, term32458.getClass(), "editorComp", null);
        setField(term32458, term32458.getClass(), "cellEditor", null);
        setIntField(term32458, term32458.getClass(), "editingColumn", 0);
        setIntField(term32458, term32458.getClass(), "editingRow", 0);
        setField(term32458, term32458.getClass(), "defaultRenderersByColumnClass", null);
        setField(term32458, term32458.getClass(), "defaultEditorsByColumnClass", null);
        setField(term32458, term32458.getClass(), "selectionForeground", null);
        setField(term32458, term32458.getClass(), "selectionBackground", null);
        setField(term32458, term32458.getClass(), "rowModel", null);
        setBooleanField(term32458, term32458.getClass(), "dragEnabled", false);
        setBooleanField(term32458, term32458.getClass(), "surrendersFocusOnKeystroke", false);
        setField(term32458, term32458.getClass(), "editorRemover", null);
        setBooleanField(term32458, term32458.getClass(), "columnSelectionAdjusting", false);
        setBooleanField(term32458, term32458.getClass(), "rowSelectionAdjusting", false);
        setField(term32458, term32458.getClass(), "printError", null);
        setBooleanField(term32458, term32458.getClass(), "isRowHeightSet", false);
        setBooleanField(term32458, term32458.getClass(), "updateSelectionOnSort", false);
        setField(term32458, term32458.getClass(), "sortManager", null);
        setBooleanField(term32458, term32458.getClass(), "ignoreSortChange", false);
        setBooleanField(term32458, term32458.getClass(), "sorterChanged", false);
        setBooleanField(term32458, term32458.getClass(), "autoCreateRowSorter", false);
        setBooleanField(term32458, term32458.getClass(), "fillsViewportHeight", false);
        setField(term32458, term32458.getClass(), "dropMode", null);
        setField(term32458, term32458.getClass(), "dropLocation", null);
        setBooleanField(term32458, term32458.getClass(), "updateInProgress", false);
        setBooleanField(term32458, term32458.getClass(), "isAlignmentXSet", false);
        setFloatField(term32458, term32458.getClass(), "alignmentX", 0.0F);
        setBooleanField(term32458, term32458.getClass(), "isAlignmentYSet", false);
        setFloatField(term32458, term32458.getClass(), "alignmentY", 0.0F);
        setField(term32458, term32458.getClass(), "ui", null);
        setField(term32458, term32458.getClass(), "listenerList", null);
        setField(term32458, term32458.getClass(), "clientProperties", null);
        setField(term32458, term32458.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term32458, term32458.getClass(), "autoscrolls", false);
        setField(term32458, term32458.getClass(), "border", null);
        setIntField(term32458, term32458.getClass(), "flags", 0);
        setField(term32458, term32458.getClass(), "inputVerifier", null);
        setBooleanField(term32458, term32458.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term32458, term32458.getClass(), "paintingChild", null);
        setField(term32458, term32458.getClass(), "popupMenu", null);
        setField(term32458, term32458.getClass(), "revalidateRunnableScheduled", null);
        setField(term32458, term32458.getClass(), "focusInputMap", null);
        setField(term32458, term32458.getClass(), "ancestorInputMap", null);
        setField(term32458, term32458.getClass(), "windowInputMap", null);
        setField(term32458, term32458.getClass(), "actionMap", null);
        setField(term32458, term32458.getClass(), "aaHint", null);
        setField(term32458, term32458.getClass(), "lcdRenderingHint", null);
        setField(term32458, term32458.getClass(), "component", null);
        setField(term32458, term32458.getClass(), "layoutMgr", null);
        setField(term32458, term32458.getClass(), "dispatcher", null);
        setField(term32458, term32458.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term32458, term32458.getClass(), "focusCycleRoot", false);
        setBooleanField(term32458, term32458.getClass(), "focusTraversalPolicyProvider", false);
        setField(term32458, term32458.getClass(), "printingThreads", null);
        setBooleanField(term32458, term32458.getClass(), "printing", false);
        setField(term32458, term32458.getClass(), "containerListener", null);
        setIntField(term32458, term32458.getClass(), "listeningChildren", 0);
        setIntField(term32458, term32458.getClass(), "listeningBoundsChildren", 0);
        setIntField(term32458, term32458.getClass(), "descendantsCount", 0);
        setField(term32458, term32458.getClass(), "preserveBackgroundColor", null);
        setIntField(term32458, term32458.getClass(), "numOfHWComponents", 0);
        setIntField(term32458, term32458.getClass(), "numOfLWComponents", 0);
        setField(term32458, term32458.getClass(), "modalComp", null);
        setField(term32458, term32458.getClass(), "modalAppContext", null);
        setIntField(term32458, term32458.getClass(), "containerSerializedDataVersion", 0);
        setField(term32458, term32458.getClass(), "peer", null);
        setField(term32458, term32458.getClass(), "parent", null);
        setField(term32458, term32458.getClass(), "appContext", null);
        setIntField(term32458, term32458.getClass(), "x", 0);
        setIntField(term32458, term32458.getClass(), "y", 0);
        setIntField(term32458, term32458.getClass(), "width", 0);
        setIntField(term32458, term32458.getClass(), "height", 0);
        setField(term32458, term32458.getClass(), "foreground", null);
        setField(term32458, term32458.getClass(), "background", null);
        setField(term32458, term32458.getClass(), "font", null);
        setField(term32458, term32458.getClass(), "peerFont", null);
        setField(term32458, term32458.getClass(), "cursor", null);
        setField(term32458, term32458.getClass(), "locale", null);
        setField(term32458, term32458.getClass(), "graphicsConfig", null);
        setField(term32458, term32458.getClass(), "bufferStrategy", null);
        setBooleanField(term32458, term32458.getClass(), "ignoreRepaint", false);
        setBooleanField(term32458, term32458.getClass(), "visible", false);
        setBooleanField(term32458, term32458.getClass(), "enabled", false);
        setBooleanField(term32458, term32458.getClass(), "valid", false);
        setField(term32458, term32458.getClass(), "dropTarget", null);
        setField(term32458, term32458.getClass(), "popups", null);
        setField(term32458, term32458.getClass(), "name", null);
        setBooleanField(term32458, term32458.getClass(), "nameExplicitlySet", false);
        setBooleanField(term32458, term32458.getClass(), "focusable", false);
        setIntField(term32458, term32458.getClass(), "isFocusTraversableOverridden", 0);
        setField(term32458, term32458.getClass(), "focusTraversalKeys", null);
        setBooleanField(term32458, term32458.getClass(), "focusTraversalKeysEnabled", false);
        setField(term32458, term32458.getClass(), "acc", null);
        setField(term32458, term32458.getClass(), "minSize", null);
        setBooleanField(term32458, term32458.getClass(), "minSizeSet", false);
        setField(term32458, term32458.getClass(), "prefSize", null);
        setBooleanField(term32458, term32458.getClass(), "prefSizeSet", false);
        setField(term32458, term32458.getClass(), "maxSize", null);
        setBooleanField(term32458, term32458.getClass(), "maxSizeSet", false);
        setField(term32458, term32458.getClass(), "componentOrientation", null);
        setBooleanField(term32458, term32458.getClass(), "newEventsOnly", false);
        setField(term32458, term32458.getClass(), "componentListener", null);
        setField(term32458, term32458.getClass(), "focusListener", null);
        setField(term32458, term32458.getClass(), "hierarchyListener", null);
        setField(term32458, term32458.getClass(), "hierarchyBoundsListener", null);
        setField(term32458, term32458.getClass(), "keyListener", null);
        setField(term32458, term32458.getClass(), "mouseListener", null);
        setField(term32458, term32458.getClass(), "mouseMotionListener", null);
        setField(term32458, term32458.getClass(), "mouseWheelListener", null);
        setField(term32458, term32458.getClass(), "inputMethodListener", null);
        setLongField(term32458, term32458.getClass(), "eventMask", 0L);
        setField(term32458, term32458.getClass(), "changeSupport", null);
        setField(term32458, term32458.getClass(), "objectLock", null);
        setBooleanField(term32458, term32458.getClass(), "isPacked", false);
        setIntField(term32458, term32458.getClass(), "boundsOp", 0);
        setField(term32458, term32458.getClass(), "compoundShape", null);
        setField(term32458, term32458.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term32458, term32458.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term32458, term32458.getClass(), "backgroundEraseDisabled", false);
        setField(term32458, term32458.getClass(), "eventCache", null);
        setBooleanField(term32458, term32458.getClass(), "coalescingEnabled", false);
        setBooleanField(term32458, term32458.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term32458, term32458.getClass(), "componentSerializedDataVersion", 0);
        setField(term32458, term32458.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProperSize", argTypes, term32458, args);
    }

};


