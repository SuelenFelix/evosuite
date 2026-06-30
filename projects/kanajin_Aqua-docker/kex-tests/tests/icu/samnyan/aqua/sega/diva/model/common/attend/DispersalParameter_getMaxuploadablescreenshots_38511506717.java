package icu.samnyan.aqua.sega.diva.model.common.attend;

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
import static icu.samnyan.aqua.sega.diva.model.common.attend.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DispersalParameter_getMaxuploadablescreenshots_38511506717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2355;

    public DispersalParameter_getMaxuploadablescreenshots_38511506717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2355 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.DispersalParameter"));
        setIntField(term2355, term2355.getClass(), "max_pd_items", 0);
        setIntField(term2355, term2355.getClass(), "max_ps_rankings", 0);
        setIntField(term2355, term2355.getClass(), "max_uploadable_screenshots", 0);
        setIntField(term2355, term2355.getClass(), "ss_upload_delay", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.DispersalParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMax_uploadable_screenshots", argTypes, term2355, args);
    }

};


