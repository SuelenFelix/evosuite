package io.github.moacirrf.netbeans.markdown.ui.export;

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
import static io.github.moacirrf.netbeans.markdown.ui.export.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExportPane_onCheckJoinFiles_200218490317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32424;

    public ExportPane_onCheckJoinFiles_200218490317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32424 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane"));
        setField(term32424, term32424.getClass(), "exporterConfig", null);
        setField(term32424, term32424.getClass(), "onExportedFile", null);
        setField(term32424, term32424.getClass(), "buttonsPane", null);
        setField(term32424, term32424.getClass(), "destinyFolderErrorMessage", null);
        setField(term32424, term32424.getClass(), "destinyPane", null);
        setField(term32424, term32424.getClass(), "docxExport", null);
        setField(term32424, term32424.getClass(), "htmlExport", null);
        setField(term32424, term32424.getClass(), "jButton1", null);
        setField(term32424, term32424.getClass(), "jLabel1", null);
        setField(term32424, term32424.getClass(), "jPanel1", null);
        setField(term32424, term32424.getClass(), "jScrollPane1", null);
        setField(term32424, term32424.getClass(), "joinFiles", null);
        setField(term32424, term32424.getClass(), "newUniqueName", null);
        setField(term32424, term32424.getClass(), "pathDestiny", null);
        setField(term32424, term32424.getClass(), "pdfExport", null);
        setField(term32424, term32424.getClass(), "progressBar", null);
        setField(term32424, term32424.getClass(), "progressPane", null);
        setField(term32424, term32424.getClass(), "tableFiles", null);
        setField(term32424, term32424.getClass(), "uniqueFilePane", null);
        setField(term32424, term32424.getClass(), "uniqueNameErrorLabel", null);
        setBooleanField(term32424, term32424.getClass(), "isAlignmentXSet", false);
        setFloatField(term32424, term32424.getClass(), "alignmentX", 0.0F);
        setBooleanField(term32424, term32424.getClass(), "isAlignmentYSet", false);
        setFloatField(term32424, term32424.getClass(), "alignmentY", 0.0F);
        setField(term32424, term32424.getClass(), "ui", null);
        setField(term32424, term32424.getClass(), "listenerList", null);
        setField(term32424, term32424.getClass(), "clientProperties", null);
        setField(term32424, term32424.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term32424, term32424.getClass(), "autoscrolls", false);
        setField(term32424, term32424.getClass(), "border", null);
        setIntField(term32424, term32424.getClass(), "flags", 0);
        setField(term32424, term32424.getClass(), "inputVerifier", null);
        setBooleanField(term32424, term32424.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term32424, term32424.getClass(), "paintingChild", null);
        setField(term32424, term32424.getClass(), "popupMenu", null);
        setField(term32424, term32424.getClass(), "revalidateRunnableScheduled", null);
        setField(term32424, term32424.getClass(), "focusInputMap", null);
        setField(term32424, term32424.getClass(), "ancestorInputMap", null);
        setField(term32424, term32424.getClass(), "windowInputMap", null);
        setField(term32424, term32424.getClass(), "actionMap", null);
        setField(term32424, term32424.getClass(), "aaHint", null);
        setField(term32424, term32424.getClass(), "lcdRenderingHint", null);
        setField(term32424, term32424.getClass(), "component", null);
        setField(term32424, term32424.getClass(), "layoutMgr", null);
        setField(term32424, term32424.getClass(), "dispatcher", null);
        setField(term32424, term32424.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term32424, term32424.getClass(), "focusCycleRoot", false);
        setBooleanField(term32424, term32424.getClass(), "focusTraversalPolicyProvider", false);
        setField(term32424, term32424.getClass(), "printingThreads", null);
        setBooleanField(term32424, term32424.getClass(), "printing", false);
        setField(term32424, term32424.getClass(), "containerListener", null);
        setIntField(term32424, term32424.getClass(), "listeningChildren", 0);
        setIntField(term32424, term32424.getClass(), "listeningBoundsChildren", 0);
        setIntField(term32424, term32424.getClass(), "descendantsCount", 0);
        setField(term32424, term32424.getClass(), "preserveBackgroundColor", null);
        setIntField(term32424, term32424.getClass(), "numOfHWComponents", 0);
        setIntField(term32424, term32424.getClass(), "numOfLWComponents", 0);
        setField(term32424, term32424.getClass(), "modalComp", null);
        setField(term32424, term32424.getClass(), "modalAppContext", null);
        setIntField(term32424, term32424.getClass(), "containerSerializedDataVersion", 0);
        setField(term32424, term32424.getClass(), "peer", null);
        setField(term32424, term32424.getClass(), "parent", null);
        setField(term32424, term32424.getClass(), "appContext", null);
        setIntField(term32424, term32424.getClass(), "x", 0);
        setIntField(term32424, term32424.getClass(), "y", 0);
        setIntField(term32424, term32424.getClass(), "width", 0);
        setIntField(term32424, term32424.getClass(), "height", 0);
        setField(term32424, term32424.getClass(), "foreground", null);
        setField(term32424, term32424.getClass(), "background", null);
        setField(term32424, term32424.getClass(), "font", null);
        setField(term32424, term32424.getClass(), "peerFont", null);
        setField(term32424, term32424.getClass(), "cursor", null);
        setField(term32424, term32424.getClass(), "locale", null);
        setField(term32424, term32424.getClass(), "graphicsConfig", null);
        setField(term32424, term32424.getClass(), "bufferStrategy", null);
        setBooleanField(term32424, term32424.getClass(), "ignoreRepaint", false);
        setBooleanField(term32424, term32424.getClass(), "visible", false);
        setBooleanField(term32424, term32424.getClass(), "enabled", false);
        setBooleanField(term32424, term32424.getClass(), "valid", false);
        setField(term32424, term32424.getClass(), "dropTarget", null);
        setField(term32424, term32424.getClass(), "popups", null);
        setField(term32424, term32424.getClass(), "name", null);
        setBooleanField(term32424, term32424.getClass(), "nameExplicitlySet", false);
        setBooleanField(term32424, term32424.getClass(), "focusable", false);
        setIntField(term32424, term32424.getClass(), "isFocusTraversableOverridden", 0);
        setField(term32424, term32424.getClass(), "focusTraversalKeys", null);
        setBooleanField(term32424, term32424.getClass(), "focusTraversalKeysEnabled", false);
        setField(term32424, term32424.getClass(), "acc", null);
        setField(term32424, term32424.getClass(), "minSize", null);
        setBooleanField(term32424, term32424.getClass(), "minSizeSet", false);
        setField(term32424, term32424.getClass(), "prefSize", null);
        setBooleanField(term32424, term32424.getClass(), "prefSizeSet", false);
        setField(term32424, term32424.getClass(), "maxSize", null);
        setBooleanField(term32424, term32424.getClass(), "maxSizeSet", false);
        setField(term32424, term32424.getClass(), "componentOrientation", null);
        setBooleanField(term32424, term32424.getClass(), "newEventsOnly", false);
        setField(term32424, term32424.getClass(), "componentListener", null);
        setField(term32424, term32424.getClass(), "focusListener", null);
        setField(term32424, term32424.getClass(), "hierarchyListener", null);
        setField(term32424, term32424.getClass(), "hierarchyBoundsListener", null);
        setField(term32424, term32424.getClass(), "keyListener", null);
        setField(term32424, term32424.getClass(), "mouseListener", null);
        setField(term32424, term32424.getClass(), "mouseMotionListener", null);
        setField(term32424, term32424.getClass(), "mouseWheelListener", null);
        setField(term32424, term32424.getClass(), "inputMethodListener", null);
        setLongField(term32424, term32424.getClass(), "eventMask", 0L);
        setField(term32424, term32424.getClass(), "changeSupport", null);
        setField(term32424, term32424.getClass(), "objectLock", null);
        setBooleanField(term32424, term32424.getClass(), "isPacked", false);
        setIntField(term32424, term32424.getClass(), "boundsOp", 0);
        setField(term32424, term32424.getClass(), "compoundShape", null);
        setField(term32424, term32424.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term32424, term32424.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term32424, term32424.getClass(), "backgroundEraseDisabled", false);
        setField(term32424, term32424.getClass(), "eventCache", null);
        setBooleanField(term32424, term32424.getClass(), "coalescingEnabled", false);
        setBooleanField(term32424, term32424.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term32424, term32424.getClass(), "componentSerializedDataVersion", 0);
        setField(term32424, term32424.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "onCheckJoinFiles", argTypes, term32424, args);
    }

};


