package icu.samnyan.aqua.sega.maimai.model.response;

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
import static icu.samnyan.aqua.sega.maimai.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GetGameSettingResp_hashCode_20969765896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term976;

    public GetGameSettingResp_hashCode_20969765896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term976 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp"));
        Object term978 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term976, term976.getClass(), "isAouAccession", false);
        setBooleanField(term978, term978.getClass(), "isMaintenance", false);
        setIntField(term978, term978.getClass(), "requestInterval", -6029667);
        setField(term978, term978.getClass(), "rebootStartTime", "gGSMzuGICf");
        setField(term978, term978.getClass(), "rebootEndTime", "hxCBltsObl");
        setIntField(term978, term978.getClass(), "movieUploadLimit", -2068769794);
        setIntField(term978, term978.getClass(), "movieStatus", -117576464);
        setField(term978, term978.getClass(), "movieServerUri", "BndsHwAFMv");
        setField(term978, term978.getClass(), "deliverServerUri", "GzFkzHGYFt");
        setField(term978, term978.getClass(), "oldServerUri", "tShwQLRGNe");
        setField(term978, term978.getClass(), "usbDlServerUri", "LvtrsXUliU");
        setField(term976, term976.getClass(), "gameSetting", term978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term976, args);
    }

};


