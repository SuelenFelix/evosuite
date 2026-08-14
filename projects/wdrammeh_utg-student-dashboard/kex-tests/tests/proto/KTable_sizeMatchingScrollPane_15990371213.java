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
     Object term31575;

    public KTable_sizeMatchingScrollPane_15990371213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31575 = newInstance(Class.forName("proto.KTable"));
        setField(term31575, term31575.getClass(), "dataModel", null);
        setField(term31575, term31575.getClass(), "columnModel", null);
        setField(term31575, term31575.getClass(), "selectionModel", null);
        setField(term31575, term31575.getClass(), "tableHeader", null);
        setIntField(term31575, term31575.getClass(), "rowHeight", 0);
        setIntField(term31575, term31575.getClass(), "rowMargin", 0);
        setField(term31575, term31575.getClass(), "gridColor", null);
        setBooleanField(term31575, term31575.getClass(), "showHorizontalLines", false);
        setBooleanField(term31575, term31575.getClass(), "showVerticalLines", false);
        setIntField(term31575, term31575.getClass(), "autoResizeMode", 0);
        setBooleanField(term31575, term31575.getClass(), "autoCreateColumnsFromModel", false);
        setField(term31575, term31575.getClass(), "preferredViewportSize", null);
        setBooleanField(term31575, term31575.getClass(), "rowSelectionAllowed", false);
        setBooleanField(term31575, term31575.getClass(), "cellSelectionEnabled", false);
        setField(term31575, term31575.getClass(), "editorComp", null);
        setField(term31575, term31575.getClass(), "cellEditor", null);
        setIntField(term31575, term31575.getClass(), "editingColumn", 0);
        setIntField(term31575, term31575.getClass(), "editingRow", 0);
        setField(term31575, term31575.getClass(), "defaultRenderersByColumnClass", null);
        setField(term31575, term31575.getClass(), "defaultEditorsByColumnClass", null);
        setField(term31575, term31575.getClass(), "selectionForeground", null);
        setField(term31575, term31575.getClass(), "selectionBackground", null);
        setField(term31575, term31575.getClass(), "rowModel", null);
        setBooleanField(term31575, term31575.getClass(), "dragEnabled", false);
        setBooleanField(term31575, term31575.getClass(), "surrendersFocusOnKeystroke", false);
        setField(term31575, term31575.getClass(), "editorRemover", null);
        setBooleanField(term31575, term31575.getClass(), "columnSelectionAdjusting", false);
        setBooleanField(term31575, term31575.getClass(), "rowSelectionAdjusting", false);
        setField(term31575, term31575.getClass(), "printError", null);
        setBooleanField(term31575, term31575.getClass(), "isRowHeightSet", false);
        setBooleanField(term31575, term31575.getClass(), "updateSelectionOnSort", false);
        setField(term31575, term31575.getClass(), "sortManager", null);
        setBooleanField(term31575, term31575.getClass(), "ignoreSortChange", false);
        setBooleanField(term31575, term31575.getClass(), "sorterChanged", false);
        setBooleanField(term31575, term31575.getClass(), "autoCreateRowSorter", false);
        setBooleanField(term31575, term31575.getClass(), "fillsViewportHeight", false);
        setField(term31575, term31575.getClass(), "dropMode", null);
        setField(term31575, term31575.getClass(), "dropLocation", null);
        setBooleanField(term31575, term31575.getClass(), "updateInProgress", false);
        setBooleanField(term31575, term31575.getClass(), "isAlignmentXSet", false);
        setFloatField(term31575, term31575.getClass(), "alignmentX", 0.0F);
        setBooleanField(term31575, term31575.getClass(), "isAlignmentYSet", false);
        setFloatField(term31575, term31575.getClass(), "alignmentY", 0.0F);
        setField(term31575, term31575.getClass(), "ui", null);
        setField(term31575, term31575.getClass(), "listenerList", null);
        setField(term31575, term31575.getClass(), "clientProperties", null);
        setField(term31575, term31575.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term31575, term31575.getClass(), "autoscrolls", false);
        setField(term31575, term31575.getClass(), "border", null);
        setIntField(term31575, term31575.getClass(), "flags", 0);
        setField(term31575, term31575.getClass(), "inputVerifier", null);
        setBooleanField(term31575, term31575.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term31575, term31575.getClass(), "paintingChild", null);
        setField(term31575, term31575.getClass(), "popupMenu", null);
        setField(term31575, term31575.getClass(), "revalidateRunnableScheduled", null);
        setField(term31575, term31575.getClass(), "focusInputMap", null);
        setField(term31575, term31575.getClass(), "ancestorInputMap", null);
        setField(term31575, term31575.getClass(), "windowInputMap", null);
        setField(term31575, term31575.getClass(), "actionMap", null);
        setField(term31575, term31575.getClass(), "aaHint", null);
        setField(term31575, term31575.getClass(), "lcdRenderingHint", null);
        setField(term31575, term31575.getClass(), "component", null);
        setField(term31575, term31575.getClass(), "layoutMgr", null);
        setField(term31575, term31575.getClass(), "dispatcher", null);
        setField(term31575, term31575.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term31575, term31575.getClass(), "focusCycleRoot", false);
        setBooleanField(term31575, term31575.getClass(), "focusTraversalPolicyProvider", false);
        setField(term31575, term31575.getClass(), "printingThreads", null);
        setBooleanField(term31575, term31575.getClass(), "printing", false);
        setField(term31575, term31575.getClass(), "containerListener", null);
        setIntField(term31575, term31575.getClass(), "listeningChildren", 0);
        setIntField(term31575, term31575.getClass(), "listeningBoundsChildren", 0);
        setIntField(term31575, term31575.getClass(), "descendantsCount", 0);
        setField(term31575, term31575.getClass(), "preserveBackgroundColor", null);
        setIntField(term31575, term31575.getClass(), "numOfHWComponents", 0);
        setIntField(term31575, term31575.getClass(), "numOfLWComponents", 0);
        setField(term31575, term31575.getClass(), "modalComp", null);
        setField(term31575, term31575.getClass(), "modalAppContext", null);
        setIntField(term31575, term31575.getClass(), "containerSerializedDataVersion", 0);
        setField(term31575, term31575.getClass(), "peer", null);
        setField(term31575, term31575.getClass(), "parent", null);
        setField(term31575, term31575.getClass(), "appContext", null);
        setIntField(term31575, term31575.getClass(), "x", 0);
        setIntField(term31575, term31575.getClass(), "y", 0);
        setIntField(term31575, term31575.getClass(), "width", 0);
        setIntField(term31575, term31575.getClass(), "height", 0);
        setField(term31575, term31575.getClass(), "foreground", null);
        setField(term31575, term31575.getClass(), "background", null);
        setField(term31575, term31575.getClass(), "font", null);
        setField(term31575, term31575.getClass(), "peerFont", null);
        setField(term31575, term31575.getClass(), "cursor", null);
        setField(term31575, term31575.getClass(), "locale", null);
        setField(term31575, term31575.getClass(), "graphicsConfig", null);
        setField(term31575, term31575.getClass(), "bufferStrategy", null);
        setBooleanField(term31575, term31575.getClass(), "ignoreRepaint", false);
        setBooleanField(term31575, term31575.getClass(), "visible", false);
        setBooleanField(term31575, term31575.getClass(), "enabled", false);
        setBooleanField(term31575, term31575.getClass(), "valid", false);
        setField(term31575, term31575.getClass(), "dropTarget", null);
        setField(term31575, term31575.getClass(), "popups", null);
        setField(term31575, term31575.getClass(), "name", null);
        setBooleanField(term31575, term31575.getClass(), "nameExplicitlySet", false);
        setBooleanField(term31575, term31575.getClass(), "focusable", false);
        setIntField(term31575, term31575.getClass(), "isFocusTraversableOverridden", 0);
        setField(term31575, term31575.getClass(), "focusTraversalKeys", null);
        setBooleanField(term31575, term31575.getClass(), "focusTraversalKeysEnabled", false);
        setField(term31575, term31575.getClass(), "acc", null);
        setField(term31575, term31575.getClass(), "minSize", null);
        setBooleanField(term31575, term31575.getClass(), "minSizeSet", false);
        setField(term31575, term31575.getClass(), "prefSize", null);
        setBooleanField(term31575, term31575.getClass(), "prefSizeSet", false);
        setField(term31575, term31575.getClass(), "maxSize", null);
        setBooleanField(term31575, term31575.getClass(), "maxSizeSet", false);
        setField(term31575, term31575.getClass(), "componentOrientation", null);
        setBooleanField(term31575, term31575.getClass(), "newEventsOnly", false);
        setField(term31575, term31575.getClass(), "componentListener", null);
        setField(term31575, term31575.getClass(), "focusListener", null);
        setField(term31575, term31575.getClass(), "hierarchyListener", null);
        setField(term31575, term31575.getClass(), "hierarchyBoundsListener", null);
        setField(term31575, term31575.getClass(), "keyListener", null);
        setField(term31575, term31575.getClass(), "mouseListener", null);
        setField(term31575, term31575.getClass(), "mouseMotionListener", null);
        setField(term31575, term31575.getClass(), "mouseWheelListener", null);
        setField(term31575, term31575.getClass(), "inputMethodListener", null);
        setLongField(term31575, term31575.getClass(), "eventMask", 0L);
        setField(term31575, term31575.getClass(), "changeSupport", null);
        setField(term31575, term31575.getClass(), "objectLock", null);
        setBooleanField(term31575, term31575.getClass(), "isPacked", false);
        setIntField(term31575, term31575.getClass(), "boundsOp", 0);
        setField(term31575, term31575.getClass(), "compoundShape", null);
        setField(term31575, term31575.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term31575, term31575.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term31575, term31575.getClass(), "backgroundEraseDisabled", false);
        setField(term31575, term31575.getClass(), "eventCache", null);
        setBooleanField(term31575, term31575.getClass(), "coalescingEnabled", false);
        setBooleanField(term31575, term31575.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term31575, term31575.getClass(), "componentSerializedDataVersion", 0);
        setField(term31575, term31575.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sizeMatchingScrollPane", argTypes, term31575, args);
    }

};


