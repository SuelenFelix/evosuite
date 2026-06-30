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

public class PowerOnResponseV3_hashCode_214496960939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15043;

    public PowerOnResponseV3_hashCode_214496960939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15043 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term15043, term15043.getClass(), "stat", 1962444399);
        setField(term15043, term15043.getClass(), "uri", "POPYycoDBy");
        setField(term15043, term15043.getClass(), "host", "LuWMOXdAPA");
        setField(term15043, term15043.getClass(), "place_id", "blSffTnsOv");
        setField(term15043, term15043.getClass(), "name", "qbUMcIvEXH");
        setField(term15043, term15043.getClass(), "nickname", "TVxGTjeDcu");
        setField(term15043, term15043.getClass(), "region0", "ABPtcyCzkR");
        setField(term15043, term15043.getClass(), "region_name0", "QgHhxMyKvr");
        setField(term15043, term15043.getClass(), "region_name1", "VGiXZZTWRO");
        setField(term15043, term15043.getClass(), "region_name2", "MlPtwXnJOJ");
        setField(term15043, term15043.getClass(), "region_name3", "DbfiyFeaTe");
        setField(term15043, term15043.getClass(), "country", "dQxXGBtDLZ");
        setField(term15043, term15043.getClass(), "allnet_id", "EgSgEFIyyN");
        setField(term15043, term15043.getClass(), "client_timezone", "iAOFcXaLSf");
        setField(term15043, term15043.getClass(), "utc_time", "EHoNUaeyvT");
        setField(term15043, term15043.getClass(), "setting", "ZwKmasCVIy");
        setField(term15043, term15043.getClass(), "res_ver", "pxokrVaeMd");
        setField(term15043, term15043.getClass(), "token", "ujxmmZZcbT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term15043, args);
    }

};


