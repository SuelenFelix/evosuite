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
import java.lang.Integer;

public class DispersalParameter_setMaxuploadablescreenshots_4668558657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304;
     Object term2309;

    public DispersalParameter_setMaxuploadablescreenshots_4668558657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.DispersalParameter"));
        setIntField(term2304, term2304.getClass(), "max_pd_items", 30);
        setIntField(term2304, term2304.getClass(), "max_ps_rankings", 100);
        setIntField(term2304, term2304.getClass(), "max_uploadable_screenshots", 2);
        setIntField(term2304, term2304.getClass(), "ss_upload_delay", 1);
        term2309 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.DispersalParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2309;
        callMethod(klass, "setMax_uploadable_screenshots", argTypes, term2304, args);
    }

};


