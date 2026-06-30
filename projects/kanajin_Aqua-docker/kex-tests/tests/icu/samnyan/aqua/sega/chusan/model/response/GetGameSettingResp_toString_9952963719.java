package icu.samnyan.aqua.sega.chusan.model.response;

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
import static icu.samnyan.aqua.sega.chusan.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GetGameSettingResp_toString_9952963719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55450;

    public GetGameSettingResp_toString_9952963719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55450 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp"));
        Object term55451 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term55451, term55451.getClass(), "romVersion", "ZBafuLDRDM");
        setField(term55451, term55451.getClass(), "dataVersion", "VDnsNuhEvG");
        setBooleanField(term55451, term55451.getClass(), "isMaintenance", true);
        setIntField(term55451, term55451.getClass(), "requestInterval", 842419931);
        setField(term55451, term55451.getClass(), "rebootStartTime", "DMrfMwXyYT");
        setField(term55451, term55451.getClass(), "rebootEndTime", "GAzZvzjuXP");
        setBooleanField(term55451, term55451.getClass(), "isBackgroundDistribute", false);
        setIntField(term55451, term55451.getClass(), "maxCountCharacter", 886819304);
        setIntField(term55451, term55451.getClass(), "maxCountItem", 639833326);
        setIntField(term55451, term55451.getClass(), "maxCountMusic", -884990158);
        setField(term55451, term55451.getClass(), "matchStartTime", "WoFrMqAUlT");
        setField(term55451, term55451.getClass(), "matchEndTime", "RtHOddPkOW");
        setIntField(term55451, term55451.getClass(), "matchTimeLimit", 765840331);
        setIntField(term55451, term55451.getClass(), "matchErrorLimit", 1089843929);
        setField(term55451, term55451.getClass(), "matchingUri", "LAaHVAeRPU");
        setField(term55451, term55451.getClass(), "udpHolePunchUri", "BLPwYfxwnm");
        setField(term55451, term55451.getClass(), "reflectorUri", "zItHVuBBzy");
        setField(term55450, term55450.getClass(), "gameSetting", term55451);
        setBooleanField(term55450, term55450.getClass(), "isDumpUpload", false);
        setBooleanField(term55450, term55450.getClass(), "isAou", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term55450, args);
    }

};


