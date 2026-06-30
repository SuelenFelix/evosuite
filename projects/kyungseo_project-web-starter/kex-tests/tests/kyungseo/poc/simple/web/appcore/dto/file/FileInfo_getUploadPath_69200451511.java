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

public class FileInfo_getUploadPath_69200451511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1009;

    public FileInfo_getUploadPath_69200451511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1009 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.file.FileInfo"));
        setField(term1009, term1009.getClass(), "uploadPath", null);
        setField(term1009, term1009.getClass(), "uploadFilename", null);
        setField(term1009, term1009.getClass(), "originalFilename", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.file.FileInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUploadPath", argTypes, term1009, args);
    }

};


