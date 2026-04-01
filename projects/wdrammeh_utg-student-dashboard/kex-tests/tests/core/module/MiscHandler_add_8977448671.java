package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MiscHandler_add_8977448671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120162;

    public MiscHandler_add_8977448671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120162 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term120162, term120162.getClass(), "score", 0.2779719046761513);
        setField(term120162, term120162.getClass(), "code", "LvztehSlhM");
        setField(term120162, term120162.getClass(), "name", "njvnWFTMxN");
        setField(term120162, term120162.getClass(), "year", "fLRqcTSfzF");
        setField(term120162, term120162.getClass(), "semester", "EBYHwsuWAU");
        setField(term120162, term120162.getClass(), "lecturer", "PtIjKpiSix");
        setBooleanField(term120162, term120162.getClass(), "isLecturerEditable", false);
        setField(term120162, term120162.getClass(), "campus", "NZdTuwSCIM");
        setField(term120162, term120162.getClass(), "room", "dDHcmzPAmP");
        setField(term120162, term120162.getClass(), "day", "HEaTkWYBgv");
        setField(term120162, term120162.getClass(), "time", "MpJsPKLTIU");
        setField(term120162, term120162.getClass(), "requirement", "IiNCZfdouL");
        setIntField(term120162, term120162.getClass(), "creditHours", 1136393691);
        setBooleanField(term120162, term120162.getClass(), "isConfirmed", false);
        setField(term120162, term120162.getClass(), "status", "AhOHzCsHKW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term120162;
        callMethod(klass, "add", argTypes, null, args);
    }

};


