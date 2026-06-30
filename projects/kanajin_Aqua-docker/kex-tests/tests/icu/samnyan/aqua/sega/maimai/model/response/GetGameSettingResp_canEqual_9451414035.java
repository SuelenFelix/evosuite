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

public class GetGameSettingResp_canEqual_9451414035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term836;
     Object term915;

    public GetGameSettingResp_canEqual_9451414035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term836 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp"));
        Object term838 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term836, term836.getClass(), "isAouAccession", false);
        setBooleanField(term838, term838.getClass(), "isMaintenance", true);
        setIntField(term838, term838.getClass(), "requestInterval", 1622346318);
        setField(term838, term838.getClass(), "rebootStartTime", "xrwlQZdwCp");
        setField(term838, term838.getClass(), "rebootEndTime", "IDCWpPLRkE");
        setIntField(term838, term838.getClass(), "movieUploadLimit", 1048535127);
        setIntField(term838, term838.getClass(), "movieStatus", -655067527);
        setField(term838, term838.getClass(), "movieServerUri", "nyiiPDVjAc");
        setField(term838, term838.getClass(), "deliverServerUri", "aKnKipADSo");
        setField(term838, term838.getClass(), "oldServerUri", "wSQxaModmm");
        setField(term838, term838.getClass(), "usbDlServerUri", "UlajhuVLaP");
        setField(term836, term836.getClass(), "gameSetting", term838);
        term915 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term915;
        callMethod(klass, "canEqual", argTypes, term836, args);
    }

};


