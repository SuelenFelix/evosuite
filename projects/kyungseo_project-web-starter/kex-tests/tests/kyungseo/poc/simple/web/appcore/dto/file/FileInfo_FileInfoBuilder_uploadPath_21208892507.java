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

public class FileInfo_FileInfoBuilder_uploadPath_21208892507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402;

    public FileInfo_FileInfoBuilder_uploadPath_21208892507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.file.FileInfo$FileInfoBuilder"));
        setField(term402, term402.getClass(), "uploadPath", null);
        setField(term402, term402.getClass(), "uploadFilename", null);
        setField(term402, term402.getClass(), "originalFilename", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.file.FileInfo$FileInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "uploadPath", argTypes, term402, args);
    }

};


