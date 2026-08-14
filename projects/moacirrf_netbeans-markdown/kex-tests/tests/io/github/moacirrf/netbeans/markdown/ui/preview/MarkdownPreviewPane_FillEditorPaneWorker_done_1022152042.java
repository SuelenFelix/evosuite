package io.github.moacirrf.netbeans.markdown.ui.preview;

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
import static io.github.moacirrf.netbeans.markdown.ui.preview.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MarkdownPreviewPane_FillEditorPaneWorker_done_1022152042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4994;

    public MarkdownPreviewPane_FillEditorPaneWorker_done_1022152042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4994 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$FillEditorPaneWorker"));
        Object term5008 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$ScrollState"));
        Object term5011 = newInstance(Class.forName("javax.swing.SwingWorker$StateValue"));
        Object term5019 = newInstance(Class.forName("java.util.concurrent.FutureTask"));
        Object term5021 = newInstance(Class.forName("java.lang.Object"));
        Object term5022 = newInstance(Class.forName("java.util.concurrent.FutureTask$WaitNode"));
        Object term5023 = newInstance(Class.forName("java.lang.Thread"));
        Object term5029 = newInstance(Class.forName("org.vorpal.research.kex.util.MDCWrappedRunnable"));
        Object term5030 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term5037 = newInstance(Class.forName("jdk.internal.loader.ClassLoaders$AppClassLoader"));
        Object term5040 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term5045 = newInstance(Class.forName("java.lang.ThreadLocal$ThreadLocalMap"));
        Object term5051 = newInstance(Class.forName("java.lang.Object"));
        Object term5055 = newInstance(Class.forName("java.util.concurrent.FutureTask$WaitNode"));
        Object term5056 = newInstance(Class.forName("java.util.concurrent.FutureTask$WaitNode"));
        Object term5057 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5058 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5059 = newInstance(Class.forName("java.lang.Object"));
        setField(term4994, term4994.getClass(), "markdownText", "PtirvZmsGt");
        setIntField(term4994, term4994.getClass(), "version", -1210583429);
        setFloatField(term5008, term5008.getClass(), "ratio", 0.6436713F);
        setField(term4994, term4994.getClass(), "scrollState", term5008);
        setField(term4994, term4994.getClass(), "this$0", null);
        setIntField(term4994, term4994.getClass(), "progress", -663691365);
        setField(term5011, term5011.getClass(), "name", "DONE");
        setIntField(term5011, term5011.getClass(), "ordinal", 2);
        setField(term4994, term4994.getClass(), "state", term5011);
        setIntField(term5019, term5019.getClass(), "state", 339854490);
        setField(term5019, term5019.getClass(), "callable", null);
        setField(term5019, term5019.getClass(), "outcome", term5021);
        setField(term5019, term5019.getClass(), "runner", null);
        setField(term5023, term5023.getClass(), "name", "");
        setIntField(term5023, term5023.getClass(), "priority", 5);
        setBooleanField(term5023, term5023.getClass(), "daemon", true);
        setBooleanField(term5023, term5023.getClass(), "stillborn", false);
        setLongField(term5023, term5023.getClass(), "eetop", 135317516976128L);
        setField(term5029, term5029.getClass(), "context", null);
        setField(term5029, term5029.getClass(), "runnable", null);
        setField(term5023, term5023.getClass(), "target", term5029);
        setField(term5030, term5030.getClass(), "parent", null);
        setField(term5030, term5030.getClass(), "name", null);
        setIntField(term5030, term5030.getClass(), "maxPriority", 10);
        setBooleanField(term5030, term5030.getClass(), "destroyed", false);
        setBooleanField(term5030, term5030.getClass(), "daemon", false);
        setIntField(term5030, term5030.getClass(), "nUnstartedThreads", 2);
        setIntField(term5030, term5030.getClass(), "nthreads", 12);
        setField(term5030, term5030.getClass(), "threads", null);
        setIntField(term5030, term5030.getClass(), "ngroups", 0);
        setField(term5030, term5030.getClass(), "groups", null);
        setField(term5023, term5023.getClass(), "group", term5030);
        setField(term5037, term5037.getClass(), "ucp", null);
        setField(term5037, term5037.getClass(), "parent", null);
        setField(term5037, term5037.getClass(), "nameToModule", null);
        setField(term5037, term5037.getClass(), "moduleToReader", null);
        setField(term5037, term5037.getClass(), "resourceCache", null);
        setBooleanField(term5037, term5037.getClass(), "initialized", true);
        setField(term5037, term5037.getClass(), "pdcache", null);
        setField(term5037, term5037.getClass(), "parent", null);
        setField(term5037, term5037.getClass(), "name", null);
        setField(term5037, term5037.getClass(), "unnamedModule", null);
        setField(term5037, term5037.getClass(), "nameAndId", null);
        setField(term5037, term5037.getClass(), "parallelLockMap", null);
        setField(term5037, term5037.getClass(), "package2certs", null);
        setField(term5037, term5037.getClass(), "classes", null);
        setField(term5037, term5037.getClass(), "defaultDomain", null);
        setField(term5037, term5037.getClass(), "packages", null);
        setField(term5037, term5037.getClass(), "nativeLibraries", null);
        setField(term5037, term5037.getClass(), "assertionLock", null);
        setBooleanField(term5037, term5037.getClass(), "defaultAssertionStatus", false);
        setField(term5037, term5037.getClass(), "packageAssertionStatus", null);
        setField(term5037, term5037.getClass(), "classAssertionStatus", null);
        setField(term5037, term5037.getClass(), "classLoaderValueMap", null);
        setField(term5023, term5023.getClass(), "contextClassLoader", term5037);
        setField(term5040, term5040.getClass(), "context", null);
        setBooleanField(term5040, term5040.getClass(), "isPrivileged", false);
        setBooleanField(term5040, term5040.getClass(), "isAuthorized", true);
        setField(term5040, term5040.getClass(), "privilegedContext", null);
        setField(term5040, term5040.getClass(), "combiner", null);
        setField(term5040, term5040.getClass(), "permissions", null);
        setField(term5040, term5040.getClass(), "parent", null);
        setBooleanField(term5040, term5040.getClass(), "isWrapped", false);
        setBooleanField(term5040, term5040.getClass(), "isLimited", false);
        setField(term5040, term5040.getClass(), "limitedContext", null);
        setField(term5023, term5023.getClass(), "inheritedAccessControlContext", term5040);
        setField(term5045, term5045.getClass(), "table", null);
        setIntField(term5045, term5045.getClass(), "size", 12);
        setIntField(term5045, term5045.getClass(), "threshold", 21);
        setField(term5023, term5023.getClass(), "threadLocals", term5045);
        setField(term5023, term5023.getClass(), "inheritableThreadLocals", null);
        setLongField(term5023, term5023.getClass(), "stackSize", 0L);
        setLongField(term5023, term5023.getClass(), "tid", 29L);
        setIntField(term5023, term5023.getClass(), "threadStatus", 5);
        setField(term5023, term5023.getClass(), "parkBlocker", null);
        setField(term5023, term5023.getClass(), "blocker", null);
        setField(term5023, term5023.getClass(), "blockerLock", term5051);
        setField(term5023, term5023.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term5023, term5023.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term5023, term5023.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term5023, term5023.getClass(), "threadLocalRandomSecondarySeed", 0);
        setField(term5022, term5022.getClass(), "thread", term5023);
        setField(term5055, term5055.getClass(), "thread", term5023);
        setField(term5056, term5056.getClass(), "thread", term5023);
        setField(term5056, term5056.getClass(), "next", null);
        setField(term5055, term5055.getClass(), "next", term5056);
        setField(term5022, term5022.getClass(), "next", term5055);
        setField(term5019, term5019.getClass(), "waiters", term5022);
        setField(term4994, term4994.getClass(), "future", term5019);
        setField(term5058, term5058.getClass(), "map", null);
        setField(term5057, term5057.getClass(), "map", term5058);
        setField(term5057, term5057.getClass(), "source", term5059);
        setField(term4994, term4994.getClass(), "propertyChangeSupport", term5057);
        setField(term4994, term4994.getClass(), "doProcess", null);
        setField(term4994, term4994.getClass(), "doNotifyProgressChange", null);
        setField(term4994, term4994.getClass(), "doSubmit", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$FillEditorPaneWorker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "done", argTypes, term4994, args);
    }

};


