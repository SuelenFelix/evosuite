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
import java.lang.Boolean;

public class GetGameSettingResp_setAou_16001473955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54606;
     Object term54726;

    public GetGameSettingResp_setAou_16001473955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54606 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp"));
        Object term54607 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term54607, term54607.getClass(), "romVersion", "PfWKdFFgbz");
        setField(term54607, term54607.getClass(), "dataVersion", "rgmFLfFmTW");
        setBooleanField(term54607, term54607.getClass(), "isMaintenance", true);
        setIntField(term54607, term54607.getClass(), "requestInterval", -84202309);
        setField(term54607, term54607.getClass(), "rebootStartTime", "GHvFvelXFv");
        setField(term54607, term54607.getClass(), "rebootEndTime", "MIDoqNmCoh");
        setBooleanField(term54607, term54607.getClass(), "isBackgroundDistribute", true);
        setIntField(term54607, term54607.getClass(), "maxCountCharacter", 54744840);
        setIntField(term54607, term54607.getClass(), "maxCountItem", -1017477523);
        setIntField(term54607, term54607.getClass(), "maxCountMusic", 1084453109);
        setField(term54607, term54607.getClass(), "matchStartTime", "yrOIMfdQSI");
        setField(term54607, term54607.getClass(), "matchEndTime", "PhtNZAacut");
        setIntField(term54607, term54607.getClass(), "matchTimeLimit", -1674658475);
        setIntField(term54607, term54607.getClass(), "matchErrorLimit", 1130325657);
        setField(term54607, term54607.getClass(), "matchingUri", "xbPAqsSBBS");
        setField(term54607, term54607.getClass(), "udpHolePunchUri", "ivxMfASKCB");
        setField(term54607, term54607.getClass(), "reflectorUri", "JbksMMXXzT");
        setField(term54606, term54606.getClass(), "gameSetting", term54607);
        setBooleanField(term54606, term54606.getClass(), "isDumpUpload", true);
        setBooleanField(term54606, term54606.getClass(), "isAou", false);
        term54726 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term54726;
        callMethod(klass, "setAou", argTypes, term54606, args);
    }

};


