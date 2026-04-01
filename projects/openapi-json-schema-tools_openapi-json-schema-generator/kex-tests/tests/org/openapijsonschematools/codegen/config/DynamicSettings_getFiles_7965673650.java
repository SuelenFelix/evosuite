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

public class DynamicSettings_getFiles_7965673650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33730;

    public DynamicSettings_getFiles_7965673650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term33858 = new HashMap();
        HashMap term33997 = new HashMap();
        HashMap term34092 = new HashMap();
        Boolean term34098 = new Boolean(true);
        Boolean term34100 = new Boolean(false);
        HashMap term34102 = new HashMap();
        term33730 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings"));
        Object term33731 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term33792 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term33837 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term33840 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term33843 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term33845 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term33853 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term33854 = newInstance(Class.forName("java.lang.Object"));
        Object[] term33855 = (Object[]) newArray("java.lang.Object", 4);
        Object term33863 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term33996 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        Object term34066 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term34091 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term33731, term33731.getClass(), "name", "org.openapijsonschematools.codegen.config.DynamicSettings");
        setField(term33731, term33731.getClass(), "level", null);
        setIntField(term33731, term33731.getClass(), "effectiveLevelInt", -2147483648);
        setField(term33792, term33792.getClass(), "name", "org.openapijsonschematools.codegen.config");
        setField(term33792, term33792.getClass(), "level", null);
        setIntField(term33792, term33792.getClass(), "effectiveLevelInt", -2147483648);
        setField(term33837, term33837.getClass(), "name", "");
        setField(term33837, term33837.getClass(), "level", null);
        setIntField(term33837, term33837.getClass(), "effectiveLevelInt", -2147483648);
        setField(term33840, term33840.getClass(), "name", null);
        setField(term33840, term33840.getClass(), "level", null);
        setIntField(term33840, term33840.getClass(), "effectiveLevelInt", -2147483648);
        setField(term33840, term33840.getClass(), "parent", null);
        setField(term33840, term33840.getClass(), "childrenList", null);
        setField(term33840, term33840.getClass(), "aai", null);
        setBooleanField(term33840, term33840.getClass(), "additive", true);
        setField(term33840, term33840.getClass(), "loggerContext", null);
        setField(term33837, term33837.getClass(), "parent", term33840);
        setField(term33843, term33843.getClass(), "lock", null);
        setField(term33843, term33843.getClass(), "array", null);
        setField(term33837, term33837.getClass(), "childrenList", term33843);
        setField(term33837, term33837.getClass(), "aai", null);
        setBooleanField(term33837, term33837.getClass(), "additive", true);
        setField(term33845, term33845.getClass(), "root", null);
        setIntField(term33845, term33845.getClass(), "size", 35);
        setIntField(term33845, term33845.getClass(), "noAppenderWarning", 0);
        setField(term33845, term33845.getClass(), "loggerContextListenerList", null);
        setField(term33845, term33845.getClass(), "loggerCache", null);
        setField(term33845, term33845.getClass(), "loggerContextRemoteView", null);
        setField(term33845, term33845.getClass(), "turboFilterList", null);
        setBooleanField(term33845, term33845.getClass(), "packagingDataEnabled", false);
        setIntField(term33845, term33845.getClass(), "maxCallerDataDepth", 8);
        setIntField(term33845, term33845.getClass(), "resetCount", 0);
        setField(term33845, term33845.getClass(), "frameworkPackages", null);
        setLongField(term33845, term33845.getClass(), "birthTime", 1775072306735L);
        setField(term33845, term33845.getClass(), "name", null);
        setField(term33845, term33845.getClass(), "sm", null);
        setField(term33845, term33845.getClass(), "propertyMap", null);
        setField(term33845, term33845.getClass(), "objectMap", null);
        setField(term33845, term33845.getClass(), "configurationLock", null);
        setField(term33845, term33845.getClass(), "scheduledExecutorService", null);
        setField(term33845, term33845.getClass(), "scheduledFutures", null);
        setField(term33845, term33845.getClass(), "lifeCycleManager", null);
        setBooleanField(term33845, term33845.getClass(), "started", false);
        setField(term33837, term33837.getClass(), "loggerContext", term33845);
        setField(term33792, term33792.getClass(), "parent", term33837);
        setField(term33853, term33853.getClass(), "lock", term33854);
        setElement(term33855, 3, term33731);
        setField(term33853, term33853.getClass(), "array", term33855);
        setField(term33792, term33792.getClass(), "childrenList", term33853);
        setField(term33792, term33792.getClass(), "aai", null);
        setBooleanField(term33792, term33792.getClass(), "additive", true);
        setField(term33792, term33792.getClass(), "loggerContext", term33845);
        setField(term33731, term33731.getClass(), "parent", term33792);
        setField(term33731, term33731.getClass(), "childrenList", null);
        setField(term33731, term33731.getClass(), "aai", null);
        setBooleanField(term33731, term33731.getClass(), "additive", true);
        setField(term33731, term33731.getClass(), "loggerContext", term33845);
        setField(term33730, term33730.getClass(), "LOGGER", term33731);
        setField(term33730, term33730.getClass(), "dynamicProperties", term33858);
        setField(term33863, term33863.getClass(), "generatorName", "cdHYQDgUZR");
        setField(term33863, term33863.getClass(), "apiPackage", "KAORSSPSeV");
        setField(term33863, term33863.getClass(), "modelPackage", "UimMMORkzd");
        setField(term33863, term33863.getClass(), "invokerPackage", "huVIXUWLtI");
        setField(term33863, term33863.getClass(), "packageName", "vhKzFyKPOT");
        setField(term33863, term33863.getClass(), "apiNameSuffix", "nQhIgWXdRc");
        setField(term33863, term33863.getClass(), "modelNamePrefix", "EusenEbIoF");
        setField(term33863, term33863.getClass(), "modelNameSuffix", "SScVQYSvWH");
        setField(term33863, term33863.getClass(), "groupId", "MnovcqFhCl");
        setField(term33863, term33863.getClass(), "artifactId", "qYtAeLzOhW");
        setField(term33863, term33863.getClass(), "artifactVersion", "tJzmOfcUnY");
        setField(term33996, term33996.getClass(), "m", term33997);
        setField(term33996, term33996.getClass(), "keySet", null);
        setField(term33996, term33996.getClass(), "entrySet", null);
        setField(term33996, term33996.getClass(), "values", null);
        setField(term33863, term33863.getClass(), "additionalProperties", term33996);
        setField(term33863, term33863.getClass(), "gitHost", "github.com");
        setField(term33863, term33863.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term33863, term33863.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term33863, term33863.getClass(), "releaseNote", "Minor update");
        setField(term33863, term33863.getClass(), "httpUserAgent", "TKlccZUpjz");
        setField(term33730, term33730.getClass(), "generatorSettings", term33863);
        setField(term34066, term34066.getClass(), "inputSpec", null);
        setField(term34066, term34066.getClass(), "outputDir", ".");
        setBooleanField(term34066, term34066.getClass(), "verbose", false);
        setBooleanField(term34066, term34066.getClass(), "skipOverwrite", false);
        setBooleanField(term34066, term34066.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term34066, term34066.getClass(), "skipOperationExample", false);
        setBooleanField(term34066, term34066.getClass(), "logToStderr", false);
        setBooleanField(term34066, term34066.getClass(), "validateSpec", true);
        setBooleanField(term34066, term34066.getClass(), "enablePostProcessFile", false);
        setBooleanField(term34066, term34066.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term34066, term34066.getClass(), "strictSpecBehavior", true);
        setField(term34066, term34066.getClass(), "templateDir", null);
        setField(term34066, term34066.getClass(), "templatingEngineName", "handlebars");
        setField(term34066, term34066.getClass(), "ignoreFileOverride", null);
        setField(term34091, term34091.getClass(), "m", term34092);
        setField(term34091, term34091.getClass(), "keySet", null);
        setField(term34091, term34091.getClass(), "entrySet", null);
        setField(term34091, term34091.getClass(), "values", null);
        setField(term34066, term34066.getClass(), "globalProperties", term34091);
        setBooleanField(term34066, term34066.getClass(), "removeEnumValuePrefix", false);
        setField(term34066, term34066.getClass(), "hideGenerationTimestamp", term34098);
        setField(term34066, term34066.getClass(), "intsAllowedForFloatDoubleFormats", term34100);
        setField(term33730, term33730.getClass(), "workflowSettings", term34066);
        setField(term33730, term33730.getClass(), "files", term34102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFiles", argTypes, term33730, args);
    }

};


