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

public class PowerOnResponseV2_getTimezone_146660112320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22199;

    public PowerOnResponseV2_getTimezone_146660112320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22199 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term22199, term22199.getClass(), "stat", 1358829571);
        setField(term22199, term22199.getClass(), "uri", "WWBYemIuiK");
        setField(term22199, term22199.getClass(), "host", "nHYQYkycCR");
        setField(term22199, term22199.getClass(), "place_id", "yBiVacDcZX");
        setField(term22199, term22199.getClass(), "name", "QrKfEgQeoy");
        setField(term22199, term22199.getClass(), "nickname", "oApgdbwnti");
        setField(term22199, term22199.getClass(), "region0", "YcgHACNgyo");
        setField(term22199, term22199.getClass(), "region_name0", "MrUPJzBTEn");
        setField(term22199, term22199.getClass(), "region_name1", "IaSymdfFGa");
        setField(term22199, term22199.getClass(), "region_name2", "FxSvJCIpul");
        setField(term22199, term22199.getClass(), "region_name3", "HCjKwpexJj");
        setField(term22199, term22199.getClass(), "country", "sCpIHVPdfl");
        setIntField(term22199, term22199.getClass(), "year", 991356662);
        setIntField(term22199, term22199.getClass(), "month", -506958186);
        setIntField(term22199, term22199.getClass(), "day", -507387516);
        setIntField(term22199, term22199.getClass(), "hour", -1970452551);
        setIntField(term22199, term22199.getClass(), "minute", -1896376975);
        setIntField(term22199, term22199.getClass(), "second", 729658803);
        setField(term22199, term22199.getClass(), "setting", "lMUBBGRjfY");
        setField(term22199, term22199.getClass(), "timezone", "olYpqbolWL");
        setField(term22199, term22199.getClass(), "res_class", "MCMCjxXzjw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimezone", argTypes, term22199, args);
    }

};


