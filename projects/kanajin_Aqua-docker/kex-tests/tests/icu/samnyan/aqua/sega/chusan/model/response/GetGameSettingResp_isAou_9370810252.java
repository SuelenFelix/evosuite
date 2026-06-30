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

public class GetGameSettingResp_isAou_9370810252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53767;

    public GetGameSettingResp_isAou_9370810252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53767 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp"));
        Object term53768 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term53768, term53768.getClass(), "romVersion", "FZQimBsMNt");
        setField(term53768, term53768.getClass(), "dataVersion", "lowANLpXCV");
        setBooleanField(term53768, term53768.getClass(), "isMaintenance", false);
        setIntField(term53768, term53768.getClass(), "requestInterval", -363708885);
        setField(term53768, term53768.getClass(), "rebootStartTime", "orjiIcUIcD");
        setField(term53768, term53768.getClass(), "rebootEndTime", "lGzFueHQqZ");
        setBooleanField(term53768, term53768.getClass(), "isBackgroundDistribute", false);
        setIntField(term53768, term53768.getClass(), "maxCountCharacter", -1777069422);
        setIntField(term53768, term53768.getClass(), "maxCountItem", 1328193739);
        setIntField(term53768, term53768.getClass(), "maxCountMusic", 1769168524);
        setField(term53768, term53768.getClass(), "matchStartTime", "cjiDFHGGlp");
        setField(term53768, term53768.getClass(), "matchEndTime", "XLjtkfroHJ");
        setIntField(term53768, term53768.getClass(), "matchTimeLimit", 527335694);
        setIntField(term53768, term53768.getClass(), "matchErrorLimit", 1217049721);
        setField(term53768, term53768.getClass(), "matchingUri", "hdqypaATat");
        setField(term53768, term53768.getClass(), "udpHolePunchUri", "yXrHDHEipD");
        setField(term53768, term53768.getClass(), "reflectorUri", "pbqIeikQzp");
        setField(term53767, term53767.getClass(), "gameSetting", term53768);
        setBooleanField(term53767, term53767.getClass(), "isDumpUpload", false);
        setBooleanField(term53767, term53767.getClass(), "isAou", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAou", argTypes, term53767, args);
    }

};


