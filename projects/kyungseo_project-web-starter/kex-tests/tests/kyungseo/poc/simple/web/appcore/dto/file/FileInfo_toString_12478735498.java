package kyungseo.poc.simple.web.appcore.dto.file;

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
import static kyungseo.poc.simple.web.appcore.dto.file.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FileInfo_toString_12478735498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941;

    public FileInfo_toString_12478735498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term941 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.file.FileInfo"));
        setField(term941, term941.getClass(), "uploadPath", "gGSMzuGICf");
        setField(term941, term941.getClass(), "uploadFilename", "hxCBltsObl");
        setField(term941, term941.getClass(), "originalFilename", "BndsHwAFMv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.file.FileInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term941, args);
    }

};


