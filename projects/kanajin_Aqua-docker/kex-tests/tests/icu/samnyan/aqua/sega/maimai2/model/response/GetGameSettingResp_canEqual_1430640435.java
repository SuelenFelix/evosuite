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

public class GetGameSettingResp_canEqual_1430640435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term842;
     Object term922;

    public GetGameSettingResp_canEqual_1430640435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term842 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp"));
        Object term844 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term842, term842.getClass(), "isAouAccession", false);
        setBooleanField(term844, term844.getClass(), "isMaintenance", true);
        setIntField(term844, term844.getClass(), "requestInterval", -1007160944);
        setField(term844, term844.getClass(), "rebootStartTime", "xrwlQZdwCp");
        setField(term844, term844.getClass(), "rebootEndTime", "IDCWpPLRkE");
        setIntField(term844, term844.getClass(), "movieUploadLimit", 1135664017);
        setIntField(term844, term844.getClass(), "movieStatus", 590364439);
        setField(term844, term844.getClass(), "movieServerUri", "nyiiPDVjAc");
        setField(term844, term844.getClass(), "deliverServerUri", "aKnKipADSo");
        setField(term844, term844.getClass(), "oldServerUri", "wSQxaModmm");
        setField(term844, term844.getClass(), "usbDlServerUri", "UlajhuVLaP");
        setIntField(term844, term844.getClass(), "rebootInterval", 865208305);
        setField(term842, term842.getClass(), "gameSetting", term844);
        term922 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term922;
        callMethod(klass, "canEqual", argTypes, term842, args);
    }

};


