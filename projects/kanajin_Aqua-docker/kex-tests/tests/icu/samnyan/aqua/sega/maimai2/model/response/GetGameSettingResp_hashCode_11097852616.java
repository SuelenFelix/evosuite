package icu.samnyan.aqua.sega.maimai2.model.response;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GetGameSettingResp_hashCode_11097852616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term983;

    public GetGameSettingResp_hashCode_11097852616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term983 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp"));
        Object term985 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term983, term983.getClass(), "isAouAccession", false);
        setBooleanField(term985, term985.getClass(), "isMaintenance", false);
        setIntField(term985, term985.getClass(), "requestInterval", -1275173084);
        setField(term985, term985.getClass(), "rebootStartTime", "gGSMzuGICf");
        setField(term985, term985.getClass(), "rebootEndTime", "hxCBltsObl");
        setIntField(term985, term985.getClass(), "movieUploadLimit", -244121226);
        setIntField(term985, term985.getClass(), "movieStatus", -203030934);
        setField(term985, term985.getClass(), "movieServerUri", "BndsHwAFMv");
        setField(term985, term985.getClass(), "deliverServerUri", "GzFkzHGYFt");
        setField(term985, term985.getClass(), "oldServerUri", "tShwQLRGNe");
        setField(term985, term985.getClass(), "usbDlServerUri", "LvtrsXUliU");
        setIntField(term985, term985.getClass(), "rebootInterval", -1179120542);
        setField(term983, term983.getClass(), "gameSetting", term985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term983, args);
    }

};


