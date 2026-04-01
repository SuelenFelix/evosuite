package org.openapijsonschematools.codegen.config;

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
import static org.openapijsonschematools.codegen.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;

public class DynamicSettings_getDynamicProperties_10626582204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35695;

    public DynamicSettings_getDynamicProperties_10626582204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term35823 = new HashMap();
        HashMap term35962 = new HashMap();
        HashMap term36057 = new HashMap();
        Boolean term36063 = new Boolean(true);
        Boolean term36065 = new Boolean(false);
        HashMap term36067 = new HashMap();
        term35695 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings"));
        Object term35696 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term35757 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term35802 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term35805 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term35808 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term35810 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term35818 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term35819 = newInstance(Class.forName("java.lang.Object"));
        Object[] term35820 = (Object[]) newArray("java.lang.Object", 4);
        Object term35828 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term35961 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        Object term36031 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term36056 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term35696, term35696.getClass(), "name", "org.openapijsonschematools.codegen.config.DynamicSettings");
        setField(term35696, term35696.getClass(), "level", null);
        setIntField(term35696, term35696.getClass(), "effectiveLevelInt", -2147483648);
        setField(term35757, term35757.getClass(), "name", "org.openapijsonschematools.codegen.config");
        setField(term35757, term35757.getClass(), "level", null);
        setIntField(term35757, term35757.getClass(), "effectiveLevelInt", -2147483648);
        setField(term35802, term35802.getClass(), "name", "");
        setField(term35802, term35802.getClass(), "level", null);
        setIntField(term35802, term35802.getClass(), "effectiveLevelInt", -2147483648);
        setField(term35805, term35805.getClass(), "name", null);
        setField(term35805, term35805.getClass(), "level", null);
        setIntField(term35805, term35805.getClass(), "effectiveLevelInt", -2147483648);
        setField(term35805, term35805.getClass(), "parent", null);
        setField(term35805, term35805.getClass(), "childrenList", null);
        setField(term35805, term35805.getClass(), "aai", null);
        setBooleanField(term35805, term35805.getClass(), "additive", true);
        setField(term35805, term35805.getClass(), "loggerContext", null);
        setField(term35802, term35802.getClass(), "parent", term35805);
        setField(term35808, term35808.getClass(), "lock", null);
        setField(term35808, term35808.getClass(), "array", null);
        setField(term35802, term35802.getClass(), "childrenList", term35808);
        setField(term35802, term35802.getClass(), "aai", null);
        setBooleanField(term35802, term35802.getClass(), "additive", true);
        setField(term35810, term35810.getClass(), "root", null);
        setIntField(term35810, term35810.getClass(), "size", 35);
        setIntField(term35810, term35810.getClass(), "noAppenderWarning", 0);
        setField(term35810, term35810.getClass(), "loggerContextListenerList", null);
        setField(term35810, term35810.getClass(), "loggerCache", null);
        setField(term35810, term35810.getClass(), "loggerContextRemoteView", null);
        setField(term35810, term35810.getClass(), "turboFilterList", null);
        setBooleanField(term35810, term35810.getClass(), "packagingDataEnabled", false);
        setIntField(term35810, term35810.getClass(), "maxCallerDataDepth", 8);
        setIntField(term35810, term35810.getClass(), "resetCount", 0);
        setField(term35810, term35810.getClass(), "frameworkPackages", null);
        setLongField(term35810, term35810.getClass(), "birthTime", 1775072306735L);
        setField(term35810, term35810.getClass(), "name", null);
        setField(term35810, term35810.getClass(), "sm", null);
        setField(term35810, term35810.getClass(), "propertyMap", null);
        setField(term35810, term35810.getClass(), "objectMap", null);
        setField(term35810, term35810.getClass(), "configurationLock", null);
        setField(term35810, term35810.getClass(), "scheduledExecutorService", null);
        setField(term35810, term35810.getClass(), "scheduledFutures", null);
        setField(term35810, term35810.getClass(), "lifeCycleManager", null);
        setBooleanField(term35810, term35810.getClass(), "started", false);
        setField(term35802, term35802.getClass(), "loggerContext", term35810);
        setField(term35757, term35757.getClass(), "parent", term35802);
        setField(term35818, term35818.getClass(), "lock", term35819);
        setElement(term35820, 3, term35696);
        setField(term35818, term35818.getClass(), "array", term35820);
        setField(term35757, term35757.getClass(), "childrenList", term35818);
        setField(term35757, term35757.getClass(), "aai", null);
        setBooleanField(term35757, term35757.getClass(), "additive", true);
        setField(term35757, term35757.getClass(), "loggerContext", term35810);
        setField(term35696, term35696.getClass(), "parent", term35757);
        setField(term35696, term35696.getClass(), "childrenList", null);
        setField(term35696, term35696.getClass(), "aai", null);
        setBooleanField(term35696, term35696.getClass(), "additive", true);
        setField(term35696, term35696.getClass(), "loggerContext", term35810);
        setField(term35695, term35695.getClass(), "LOGGER", term35696);
        setField(term35695, term35695.getClass(), "dynamicProperties", term35823);
        setField(term35828, term35828.getClass(), "generatorName", "sHMXNUzNeM");
        setField(term35828, term35828.getClass(), "apiPackage", "gPzGDOEPPw");
        setField(term35828, term35828.getClass(), "modelPackage", "rwKoAngzCu");
        setField(term35828, term35828.getClass(), "invokerPackage", "VUkRVwROTl");
        setField(term35828, term35828.getClass(), "packageName", "UDlkdccCRn");
        setField(term35828, term35828.getClass(), "apiNameSuffix", "McpzErOcYb");
        setField(term35828, term35828.getClass(), "modelNamePrefix", "jqrVEUvYEz");
        setField(term35828, term35828.getClass(), "modelNameSuffix", "QITgiBrmfj");
        setField(term35828, term35828.getClass(), "groupId", "pXxkiXgQnq");
        setField(term35828, term35828.getClass(), "artifactId", "tKmrUDURku");
        setField(term35828, term35828.getClass(), "artifactVersion", "JeZbrwZmsP");
        setField(term35961, term35961.getClass(), "m", term35962);
        setField(term35961, term35961.getClass(), "keySet", null);
        setField(term35961, term35961.getClass(), "entrySet", null);
        setField(term35961, term35961.getClass(), "values", null);
        setField(term35828, term35828.getClass(), "additionalProperties", term35961);
        setField(term35828, term35828.getClass(), "gitHost", "github.com");
        setField(term35828, term35828.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term35828, term35828.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term35828, term35828.getClass(), "releaseNote", "Minor update");
        setField(term35828, term35828.getClass(), "httpUserAgent", "bxyfeicqrK");
        setField(term35695, term35695.getClass(), "generatorSettings", term35828);
        setField(term36031, term36031.getClass(), "inputSpec", null);
        setField(term36031, term36031.getClass(), "outputDir", ".");
        setBooleanField(term36031, term36031.getClass(), "verbose", false);
        setBooleanField(term36031, term36031.getClass(), "skipOverwrite", false);
        setBooleanField(term36031, term36031.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term36031, term36031.getClass(), "skipOperationExample", false);
        setBooleanField(term36031, term36031.getClass(), "logToStderr", false);
        setBooleanField(term36031, term36031.getClass(), "validateSpec", true);
        setBooleanField(term36031, term36031.getClass(), "enablePostProcessFile", false);
        setBooleanField(term36031, term36031.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term36031, term36031.getClass(), "strictSpecBehavior", true);
        setField(term36031, term36031.getClass(), "templateDir", null);
        setField(term36031, term36031.getClass(), "templatingEngineName", "handlebars");
        setField(term36031, term36031.getClass(), "ignoreFileOverride", null);
        setField(term36056, term36056.getClass(), "m", term36057);
        setField(term36056, term36056.getClass(), "keySet", null);
        setField(term36056, term36056.getClass(), "entrySet", null);
        setField(term36056, term36056.getClass(), "values", null);
        setField(term36031, term36031.getClass(), "globalProperties", term36056);
        setBooleanField(term36031, term36031.getClass(), "removeEnumValuePrefix", false);
        setField(term36031, term36031.getClass(), "hideGenerationTimestamp", term36063);
        setField(term36031, term36031.getClass(), "intsAllowedForFloatDoubleFormats", term36065);
        setField(term35695, term35695.getClass(), "workflowSettings", term36031);
        setField(term35695, term35695.getClass(), "files", term36067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDynamicProperties", argTypes, term35695, args);
    }

};


