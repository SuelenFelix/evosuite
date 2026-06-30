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

public class KTable_sizeMatchingScrollPane_15990371213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31542;

    public KTable_sizeMatchingScrollPane_15990371213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31542 = newInstance(Class.forName("proto.KTable"));
        setField(term31542, term31542.getClass(), "dataModel", null);
        setField(term31542, term31542.getClass(), "columnModel", null);
        setField(term31542, term31542.getClass(), "selectionModel", null);
        setField(term31542, term31542.getClass(), "tableHeader", null);
        setIntField(term31542, term31542.getClass(), "rowHeight", 0);
        setIntField(term31542, term31542.getClass(), "rowMargin", 0);
        setField(term31542, term31542.getClass(), "gridColor", null);
        setBooleanField(term31542, term31542.getClass(), "showHorizontalLines", false);
        setBooleanField(term31542, term31542.getClass(), "showVerticalLines", false);
        setIntField(term31542, term31542.getClass(), "autoResizeMode", 0);
        setBooleanField(term31542, term31542.getClass(), "autoCreateColumnsFromModel", false);
        setField(term31542, term31542.getClass(), "preferredViewportSize", null);
        setBooleanField(term31542, term31542.getClass(), "rowSelectionAllowed", false);
        setBooleanField(term31542, term31542.getClass(), "cellSelectionEnabled", false);
        setField(term31542, term31542.getClass(), "editorComp", null);
        setField(term31542, term31542.getClass(), "cellEditor", null);
        setIntField(term31542, term31542.getClass(), "editingColumn", 0);
        setIntField(term31542, term31542.getClass(), "editingRow", 0);
        setField(term31542, term31542.getClass(), "defaultRenderersByColumnClass", null);
        setField(term31542, term31542.getClass(), "defaultEditorsByColumnClass", null);
        setField(term31542, term31542.getClass(), "selectionForeground", null);
        setField(term31542, term31542.getClass(), "selectionBackground", null);
        setField(term31542, term31542.getClass(), "rowModel", null);
        setBooleanField(term31542, term31542.getClass(), "dragEnabled", false);
        setBooleanField(term31542, term31542.getClass(), "surrendersFocusOnKeystroke", false);
        setField(term31542, term31542.getClass(), "editorRemover", null);
        setBooleanField(term31542, term31542.getClass(), "columnSelectionAdjusting", false);
        setBooleanField(term31542, term31542.getClass(), "rowSelectionAdjusting", false);
        setField(term31542, term31542.getClass(), "printError", null);
        setBooleanField(term31542, term31542.getClass(), "isRowHeightSet", false);
        setBooleanField(term31542, term31542.getClass(), "updateSelectionOnSort", false);
        setField(term31542, term31542.getClass(), "sortManager", null);
        setBooleanField(term31542, term31542.getClass(), "ignoreSortChange", false);
        setBooleanField(term31542, term31542.getClass(), "sorterChanged", false);
        setBooleanField(term31542, term31542.getClass(), "autoCreateRowSorter", false);
        setBooleanField(term31542, term31542.getClass(), "fillsViewportHeight", false);
        setField(term31542, term31542.getClass(), "dropMode", null);
        setField(term31542, term31542.getClass(), "dropLocation", null);
        setBooleanField(term31542, term31542.getClass(), "updateInProgress", false);
        setBooleanField(term31542, term31542.getClass(), "isAlignmentXSet", false);
        setFloatField(term31542, term31542.getClass(), "alignmentX", 0.0F);
        setBooleanField(term31542, term31542.getClass(), "isAlignmentYSet", false);
        setFloatField(term31542, term31542.getClass(), "alignmentY", 0.0F);
        setField(term31542, term31542.getClass(), "ui", null);
        setField(term31542, term31542.getClass(), "listenerList", null);
        setField(term31542, term31542.getClass(), "clientProperties", null);
        setField(term31542, term31542.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term31542, term31542.getClass(), "autoscrolls", false);
        setField(term31542, term31542.getClass(), "border", null);
        setIntField(term31542, term31542.getClass(), "flags", 0);
        setField(term31542, term31542.getClass(), "inputVerifier", null);
        setBooleanField(term31542, term31542.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term31542, term31542.getClass(), "paintingChild", null);
        setField(term31542, term31542.getClass(), "popupMenu", null);
        setField(term31542, term31542.getClass(), "revalidateRunnableScheduled", null);
        setField(term31542, term31542.getClass(), "focusInputMap", null);
        setField(term31542, term31542.getClass(), "ancestorInputMap", null);
        setField(term31542, term31542.getClass(), "windowInputMap", null);
        setField(term31542, term31542.getClass(), "actionMap", null);
        setField(term31542, term31542.getClass(), "aaHint", null);
        setField(term31542, term31542.getClass(), "lcdRenderingHint", null);
        setField(term31542, term31542.getClass(), "component", null);
        setField(term31542, term31542.getClass(), "layoutMgr", null);
        setField(term31542, term31542.getClass(), "dispatcher", null);
        setField(term31542, term31542.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term31542, term31542.getClass(), "focusCycleRoot", false);
        setBooleanField(term31542, term31542.getClass(), "focusTraversalPolicyProvider", false);
        setField(term31542, term31542.getClass(), "printingThreads", null);
        setBooleanField(term31542, term31542.getClass(), "printing", false);
        setField(term31542, term31542.getClass(), "containerListener", null);
        setIntField(term31542, term31542.getClass(), "listeningChildren", 0);
        setIntField(term31542, term31542.getClass(), "listeningBoundsChildren", 0);
        setIntField(term31542, term31542.getClass(), "descendantsCount", 0);
        setField(term31542, term31542.getClass(), "preserveBackgroundColor", null);
        setIntField(term31542, term31542.getClass(), "numOfHWComponents", 0);
        setIntField(term31542, term31542.getClass(), "numOfLWComponents", 0);
        setField(term31542, term31542.getClass(), "modalComp", null);
        setField(term31542, term31542.getClass(), "modalAppContext", null);
        setIntField(term31542, term31542.getClass(), "containerSerializedDataVersion", 0);
        setField(term31542, term31542.getClass(), "peer", null);
        setField(term31542, term31542.getClass(), "parent", null);
        setField(term31542, term31542.getClass(), "appContext", null);
        setIntField(term31542, term31542.getClass(), "x", 0);
        setIntField(term31542, term31542.getClass(), "y", 0);
        setIntField(term31542, term31542.getClass(), "width", 0);
        setIntField(term31542, term31542.getClass(), "height", 0);
        setField(term31542, term31542.getClass(), "foreground", null);
        setField(term31542, term31542.getClass(), "background", null);
        setField(term31542, term31542.getClass(), "font", null);
        setField(term31542, term31542.getClass(), "peerFont", null);
        setField(term31542, term31542.getClass(), "cursor", null);
        setField(term31542, term31542.getClass(), "locale", null);
        setField(term31542, term31542.getClass(), "graphicsConfig", null);
        setField(term31542, term31542.getClass(), "bufferStrategy", null);
        setBooleanField(term31542, term31542.getClass(), "ignoreRepaint", false);
        setBooleanField(term31542, term31542.getClass(), "visible", false);
        setBooleanField(term31542, term31542.getClass(), "enabled", false);
        setBooleanField(term31542, term31542.getClass(), "valid", false);
        setField(term31542, term31542.getClass(), "dropTarget", null);
        setField(term31542, term31542.getClass(), "popups", null);
        setField(term31542, term31542.getClass(), "name", null);
        setBooleanField(term31542, term31542.getClass(), "nameExplicitlySet", false);
        setBooleanField(term31542, term31542.getClass(), "focusable", false);
        setIntField(term31542, term31542.getClass(), "isFocusTraversableOverridden", 0);
        setField(term31542, term31542.getClass(), "focusTraversalKeys", null);
        setBooleanField(term31542, term31542.getClass(), "focusTraversalKeysEnabled", false);
        setField(term31542, term31542.getClass(), "acc", null);
        setField(term31542, term31542.getClass(), "minSize", null);
        setBooleanField(term31542, term31542.getClass(), "minSizeSet", false);
        setField(term31542, term31542.getClass(), "prefSize", null);
        setBooleanField(term31542, term31542.getClass(), "prefSizeSet", false);
        setField(term31542, term31542.getClass(), "maxSize", null);
        setBooleanField(term31542, term31542.getClass(), "maxSizeSet", false);
        setField(term31542, term31542.getClass(), "componentOrientation", null);
        setBooleanField(term31542, term31542.getClass(), "newEventsOnly", false);
        setField(term31542, term31542.getClass(), "componentListener", null);
        setField(term31542, term31542.getClass(), "focusListener", null);
        setField(term31542, term31542.getClass(), "hierarchyListener", null);
        setField(term31542, term31542.getClass(), "hierarchyBoundsListener", null);
        setField(term31542, term31542.getClass(), "keyListener", null);
        setField(term31542, term31542.getClass(), "mouseListener", null);
        setField(term31542, term31542.getClass(), "mouseMotionListener", null);
        setField(term31542, term31542.getClass(), "mouseWheelListener", null);
        setField(term31542, term31542.getClass(), "inputMethodListener", null);
        setLongField(term31542, term31542.getClass(), "eventMask", 0L);
        setField(term31542, term31542.getClass(), "changeSupport", null);
        setField(term31542, term31542.getClass(), "objectLock", null);
        setBooleanField(term31542, term31542.getClass(), "isPacked", false);
        setIntField(term31542, term31542.getClass(), "boundsOp", 0);
        setField(term31542, term31542.getClass(), "compoundShape", null);
        setField(term31542, term31542.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term31542, term31542.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term31542, term31542.getClass(), "backgroundEraseDisabled", false);
        setField(term31542, term31542.getClass(), "eventCache", null);
        setBooleanField(term31542, term31542.getClass(), "coalescingEnabled", false);
        setBooleanField(term31542, term31542.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term31542, term31542.getClass(), "componentSerializedDataVersion", 0);
        setField(term31542, term31542.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sizeMatchingScrollPane", argTypes, term31542, args);
    }

};


