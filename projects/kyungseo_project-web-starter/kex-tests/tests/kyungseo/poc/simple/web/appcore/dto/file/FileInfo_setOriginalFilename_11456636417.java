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

public class FileInfo_setOriginalFilename_11456636417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term852;

    public FileInfo_setOriginalFilename_11456636417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term852 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.file.FileInfo"));
        setField(term852, term852.getClass(), "uploadPath", "nyiiPDVjAc");
        setField(term852, term852.getClass(), "uploadFilename", "aKnKipADSo");
        setField(term852, term852.getClass(), "originalFilename", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.file.FileInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlajhuVLaP";
        callMethod(klass, "setOriginalFilename", argTypes, term852, args);
    }

};


