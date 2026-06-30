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

public class PowerOnResponseV3_getAllnetid_61931218713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4889;

    public PowerOnResponseV3_getAllnetid_61931218713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4889 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term4889, term4889.getClass(), "stat", -883034806);
        setField(term4889, term4889.getClass(), "uri", "OIHoJeysUi");
        setField(term4889, term4889.getClass(), "host", "WXMWFDGcLB");
        setField(term4889, term4889.getClass(), "place_id", "wKWbJssZuG");
        setField(term4889, term4889.getClass(), "name", "NzBMMhkhpT");
        setField(term4889, term4889.getClass(), "nickname", "qCpEbQDHdF");
        setField(term4889, term4889.getClass(), "region0", "AHbZyFOmlo");
        setField(term4889, term4889.getClass(), "region_name0", "TwfWVQGiIj");
        setField(term4889, term4889.getClass(), "region_name1", "gUvcueTURF");
        setField(term4889, term4889.getClass(), "region_name2", "EwQBhZjCIT");
        setField(term4889, term4889.getClass(), "region_name3", "aSkmSwTnEw");
        setField(term4889, term4889.getClass(), "country", "xvkbvaEGYd");
        setField(term4889, term4889.getClass(), "allnet_id", "HBGNxdNURv");
        setField(term4889, term4889.getClass(), "client_timezone", "mfCpTPPQQm");
        setField(term4889, term4889.getClass(), "utc_time", "OcJCIDNIXA");
        setField(term4889, term4889.getClass(), "setting", "XfRABIFVEp");
        setField(term4889, term4889.getClass(), "res_ver", "MHGKyEnwKc");
        setField(term4889, term4889.getClass(), "token", "ShIELyuULw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllnet_id", argTypes, term4889, args);
    }

};


