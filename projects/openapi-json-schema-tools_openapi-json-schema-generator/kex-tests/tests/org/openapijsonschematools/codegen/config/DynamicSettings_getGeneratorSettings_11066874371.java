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

public class DynamicSettings_getGeneratorSettings_11066874371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34385;

    public DynamicSettings_getGeneratorSettings_11066874371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term34513 = new HashMap();
        HashMap term34652 = new HashMap();
        HashMap term34747 = new HashMap();
        Boolean term34753 = new Boolean(true);
        Boolean term34755 = new Boolean(false);
        HashMap term34757 = new HashMap();
        term34385 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings"));
        Object term34386 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term34447 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term34492 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term34495 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term34498 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term34500 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term34508 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term34509 = newInstance(Class.forName("java.lang.Object"));
        Object[] term34510 = (Object[]) newArray("java.lang.Object", 4);
        Object term34518 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term34651 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        Object term34721 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term34746 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term34386, term34386.getClass(), "name", "org.openapijsonschematools.codegen.config.DynamicSettings");
        setField(term34386, term34386.getClass(), "level", null);
        setIntField(term34386, term34386.getClass(), "effectiveLevelInt", -2147483648);
        setField(term34447, term34447.getClass(), "name", "org.openapijsonschematools.codegen.config");
        setField(term34447, term34447.getClass(), "level", null);
        setIntField(term34447, term34447.getClass(), "effectiveLevelInt", -2147483648);
        setField(term34492, term34492.getClass(), "name", "");
        setField(term34492, term34492.getClass(), "level", null);
        setIntField(term34492, term34492.getClass(), "effectiveLevelInt", -2147483648);
        setField(term34495, term34495.getClass(), "name", null);
        setField(term34495, term34495.getClass(), "level", null);
        setIntField(term34495, term34495.getClass(), "effectiveLevelInt", -2147483648);
        setField(term34495, term34495.getClass(), "parent", null);
        setField(term34495, term34495.getClass(), "childrenList", null);
        setField(term34495, term34495.getClass(), "aai", null);
        setBooleanField(term34495, term34495.getClass(), "additive", true);
        setField(term34495, term34495.getClass(), "loggerContext", null);
        setField(term34492, term34492.getClass(), "parent", term34495);
        setField(term34498, term34498.getClass(), "lock", null);
        setField(term34498, term34498.getClass(), "array", null);
        setField(term34492, term34492.getClass(), "childrenList", term34498);
        setField(term34492, term34492.getClass(), "aai", null);
        setBooleanField(term34492, term34492.getClass(), "additive", true);
        setField(term34500, term34500.getClass(), "root", null);
        setIntField(term34500, term34500.getClass(), "size", 35);
        setIntField(term34500, term34500.getClass(), "noAppenderWarning", 0);
        setField(term34500, term34500.getClass(), "loggerContextListenerList", null);
        setField(term34500, term34500.getClass(), "loggerCache", null);
        setField(term34500, term34500.getClass(), "loggerContextRemoteView", null);
        setField(term34500, term34500.getClass(), "turboFilterList", null);
        setBooleanField(term34500, term34500.getClass(), "packagingDataEnabled", false);
        setIntField(term34500, term34500.getClass(), "maxCallerDataDepth", 8);
        setIntField(term34500, term34500.getClass(), "resetCount", 0);
        setField(term34500, term34500.getClass(), "frameworkPackages", null);
        setLongField(term34500, term34500.getClass(), "birthTime", 1775072306735L);
        setField(term34500, term34500.getClass(), "name", null);
        setField(term34500, term34500.getClass(), "sm", null);
        setField(term34500, term34500.getClass(), "propertyMap", null);
        setField(term34500, term34500.getClass(), "objectMap", null);
        setField(term34500, term34500.getClass(), "configurationLock", null);
        setField(term34500, term34500.getClass(), "scheduledExecutorService", null);
        setField(term34500, term34500.getClass(), "scheduledFutures", null);
        setField(term34500, term34500.getClass(), "lifeCycleManager", null);
        setBooleanField(term34500, term34500.getClass(), "started", false);
        setField(term34492, term34492.getClass(), "loggerContext", term34500);
        setField(term34447, term34447.getClass(), "parent", term34492);
        setField(term34508, term34508.getClass(), "lock", term34509);
        setElement(term34510, 3, term34386);
        setField(term34508, term34508.getClass(), "array", term34510);
        setField(term34447, term34447.getClass(), "childrenList", term34508);
        setField(term34447, term34447.getClass(), "aai", null);
        setBooleanField(term34447, term34447.getClass(), "additive", true);
        setField(term34447, term34447.getClass(), "loggerContext", term34500);
        setField(term34386, term34386.getClass(), "parent", term34447);
        setField(term34386, term34386.getClass(), "childrenList", null);
        setField(term34386, term34386.getClass(), "aai", null);
        setBooleanField(term34386, term34386.getClass(), "additive", true);
        setField(term34386, term34386.getClass(), "loggerContext", term34500);
        setField(term34385, term34385.getClass(), "LOGGER", term34386);
        setField(term34385, term34385.getClass(), "dynamicProperties", term34513);
        setField(term34518, term34518.getClass(), "generatorName", "IpmgwHTgnG");
        setField(term34518, term34518.getClass(), "apiPackage", "tIpkeYIezR");
        setField(term34518, term34518.getClass(), "modelPackage", "YkZtEtthvz");
        setField(term34518, term34518.getClass(), "invokerPackage", "dwlZSxlXOo");
        setField(term34518, term34518.getClass(), "packageName", "lKrEAkypza");
        setField(term34518, term34518.getClass(), "apiNameSuffix", "KtuuNAqGCQ");
        setField(term34518, term34518.getClass(), "modelNamePrefix", "OGQsfjmReM");
        setField(term34518, term34518.getClass(), "modelNameSuffix", "YsUtbngnRO");
        setField(term34518, term34518.getClass(), "groupId", "JisaWUxcNb");
        setField(term34518, term34518.getClass(), "artifactId", "NxgmYPzWCI");
        setField(term34518, term34518.getClass(), "artifactVersion", "SqjyKmayBx");
        setField(term34651, term34651.getClass(), "m", term34652);
        setField(term34651, term34651.getClass(), "keySet", null);
        setField(term34651, term34651.getClass(), "entrySet", null);
        setField(term34651, term34651.getClass(), "values", null);
        setField(term34518, term34518.getClass(), "additionalProperties", term34651);
        setField(term34518, term34518.getClass(), "gitHost", "github.com");
        setField(term34518, term34518.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term34518, term34518.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term34518, term34518.getClass(), "releaseNote", "Minor update");
        setField(term34518, term34518.getClass(), "httpUserAgent", "XjDhvToxJy");
        setField(term34385, term34385.getClass(), "generatorSettings", term34518);
        setField(term34721, term34721.getClass(), "inputSpec", null);
        setField(term34721, term34721.getClass(), "outputDir", ".");
        setBooleanField(term34721, term34721.getClass(), "verbose", false);
        setBooleanField(term34721, term34721.getClass(), "skipOverwrite", false);
        setBooleanField(term34721, term34721.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term34721, term34721.getClass(), "skipOperationExample", false);
        setBooleanField(term34721, term34721.getClass(), "logToStderr", false);
        setBooleanField(term34721, term34721.getClass(), "validateSpec", true);
        setBooleanField(term34721, term34721.getClass(), "enablePostProcessFile", false);
        setBooleanField(term34721, term34721.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term34721, term34721.getClass(), "strictSpecBehavior", true);
        setField(term34721, term34721.getClass(), "templateDir", null);
        setField(term34721, term34721.getClass(), "templatingEngineName", "handlebars");
        setField(term34721, term34721.getClass(), "ignoreFileOverride", null);
        setField(term34746, term34746.getClass(), "m", term34747);
        setField(term34746, term34746.getClass(), "keySet", null);
        setField(term34746, term34746.getClass(), "entrySet", null);
        setField(term34746, term34746.getClass(), "values", null);
        setField(term34721, term34721.getClass(), "globalProperties", term34746);
        setBooleanField(term34721, term34721.getClass(), "removeEnumValuePrefix", false);
        setField(term34721, term34721.getClass(), "hideGenerationTimestamp", term34753);
        setField(term34721, term34721.getClass(), "intsAllowedForFloatDoubleFormats", term34755);
        setField(term34385, term34385.getClass(), "workflowSettings", term34721);
        setField(term34385, term34385.getClass(), "files", term34757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneratorSettings", argTypes, term34385, args);
    }

};


