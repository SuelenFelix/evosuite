package icu.samnyan.aqua.sega.allnet.model.response;

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
import static icu.samnyan.aqua.sega.allnet.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnResponseV2_toString_16342098880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15879;

    public PowerOnResponseV2_toString_16342098880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15879 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term15879, term15879.getClass(), "stat", -602026508);
        setField(term15879, term15879.getClass(), "uri", "HvxahUfZcJ");
        setField(term15879, term15879.getClass(), "host", "WkLpmqoQxy");
        setField(term15879, term15879.getClass(), "place_id", "XiNoscmYhd");
        setField(term15879, term15879.getClass(), "name", "asMqnMNrZp");
        setField(term15879, term15879.getClass(), "nickname", "pqFUMTCKJd");
        setField(term15879, term15879.getClass(), "region0", "PTEndmPMzk");
        setField(term15879, term15879.getClass(), "region_name0", "aJQuCOCvZs");
        setField(term15879, term15879.getClass(), "region_name1", "lHYNCJRiOv");
        setField(term15879, term15879.getClass(), "region_name2", "QVLresHoaP");
        setField(term15879, term15879.getClass(), "region_name3", "IbxeAMwLVt");
        setField(term15879, term15879.getClass(), "country", "bShlAqoTmZ");
        setIntField(term15879, term15879.getClass(), "year", -157887805);
        setIntField(term15879, term15879.getClass(), "month", 1876565163);
        setIntField(term15879, term15879.getClass(), "day", -817164822);
        setIntField(term15879, term15879.getClass(), "hour", -1016503459);
        setIntField(term15879, term15879.getClass(), "minute", -1968847291);
        setIntField(term15879, term15879.getClass(), "second", 579005622);
        setField(term15879, term15879.getClass(), "setting", "nOKlKlNhtU");
        setField(term15879, term15879.getClass(), "timezone", "gXFNBHJSey");
        setField(term15879, term15879.getClass(), "res_class", "wUcSfItZgv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15879, args);
    }

};


