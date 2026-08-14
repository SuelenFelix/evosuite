package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;

public class DsnDownloadInputData_Builder_task_206884713513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14361;

    public DsnDownloadInputData_Builder_task_206884713513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14483 = new HashMap();
        Long term14493 = new Long(-3838084482494604218L);
        Long term14499 = new Long(3892018155439224435L);
        term14361 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term14398 = (Object[]) newArray("java.lang.String", 7);
        setField(term14361, term14361.getClass(), "file", "ZbHJVEqcoa");
        setField(term14361, term14361.getClass(), "extension", "awDQVEVIKi");
        setField(term14361, term14361.getClass(), "directory", "HJwNgUzZZR");
        setElement(term14398, 0, "FvUCZgTXhq");
        setElement(term14398, 1, "wWWidPCHzx");
        setElement(term14398, 2, "OwPIiBRuKK");
        setElement(term14398, 3, "sgfGySMODT");
        setElement(term14398, 4, "ndAITnOsny");
        setElement(term14398, 5, "CVZnTiJucs");
        setElement(term14398, 6, "ecHEQufXoq");
        setField(term14361, term14361.getClass(), "excludePatterns", term14398);
        setField(term14361, term14361.getClass(), "extensionMap", term14483);
        setField(term14361, term14361.getClass(), "maxConcurrentRequests", term14493);
        setBooleanField(term14361, term14361.getClass(), "returnEtag", false);
        setBooleanField(term14361, term14361.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term14361, term14361.getClass(), "failFast", true);
        setBooleanField(term14361, term14361.getClass(), "binary", true);
        setField(term14361, term14361.getClass(), "encoding", term14499);
        setField(term14361, term14361.getClass(), "volume", "uWqXrwAsDU");
        setField(term14361, term14361.getClass(), "task", "hgFbWAUtsu");
        setField(term14361, term14361.getClass(), "responseTimeout", "HqoTWlkbwF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CwNELDTAPP";
        callMethod(klass, "task", argTypes, term14361, args);
    }

};


