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

public class RegisteredCourse_export_7489330322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309843;

    public RegisteredCourse_export_7489330322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309843 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term309843, term309843.getClass(), "code", "XMArCaVAEc");
        setField(term309843, term309843.getClass(), "name", "URWnZtbrQH");
        setField(term309843, term309843.getClass(), "year", "hpTAdtnQku");
        setField(term309843, term309843.getClass(), "semester", "GdMAXFBAtl");
        setField(term309843, term309843.getClass(), "lecturer", "KWVRAlcIqd");
        setBooleanField(term309843, term309843.getClass(), "isLecturerEditable", false);
        setField(term309843, term309843.getClass(), "campus", "GeVOqtDiGv");
        setField(term309843, term309843.getClass(), "room", "vbRAJCwftU");
        setField(term309843, term309843.getClass(), "day", "baJbjUImxp");
        setField(term309843, term309843.getClass(), "time", "lPERFqPpGz");
        setField(term309843, term309843.getClass(), "requirement", "jleFBTYSNb");
        setIntField(term309843, term309843.getClass(), "creditHours", -1307347557);
        setBooleanField(term309843, term309843.getClass(), "isConfirmed", false);
        setField(term309843, term309843.getClass(), "status", "WmSSWHEELj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.RegisteredCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "export", argTypes, term309843, args);
    }

};


