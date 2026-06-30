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

public class DispersalParameter_setMaxpsrankings_125181088320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2372;
     Object term2377;

    public DispersalParameter_setMaxpsrankings_125181088320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2372 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.DispersalParameter"));
        setIntField(term2372, term2372.getClass(), "max_pd_items", 0);
        setIntField(term2372, term2372.getClass(), "max_ps_rankings", 0);
        setIntField(term2372, term2372.getClass(), "max_uploadable_screenshots", 0);
        setIntField(term2372, term2372.getClass(), "ss_upload_delay", 0);
        term2377 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.DispersalParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2377;
        callMethod(klass, "setMax_ps_rankings", argTypes, term2372, args);
    }

};


