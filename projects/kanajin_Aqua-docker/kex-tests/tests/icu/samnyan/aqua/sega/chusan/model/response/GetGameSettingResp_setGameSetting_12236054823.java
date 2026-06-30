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

public class GetGameSettingResp_setGameSetting_12236054823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53977;
     Object term54097;

    public GetGameSettingResp_setGameSetting_12236054823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53977 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp"));
        Object term53978 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term53978, term53978.getClass(), "romVersion", "baLJgqNNUx");
        setField(term53978, term53978.getClass(), "dataVersion", "GlPSGqVaBj");
        setBooleanField(term53978, term53978.getClass(), "isMaintenance", true);
        setIntField(term53978, term53978.getClass(), "requestInterval", 843041661);
        setField(term53978, term53978.getClass(), "rebootStartTime", "jieMNXAAbL");
        setField(term53978, term53978.getClass(), "rebootEndTime", "NbmTxmqOjh");
        setBooleanField(term53978, term53978.getClass(), "isBackgroundDistribute", true);
        setIntField(term53978, term53978.getClass(), "maxCountCharacter", -1872674019);
        setIntField(term53978, term53978.getClass(), "maxCountItem", 580191788);
        setIntField(term53978, term53978.getClass(), "maxCountMusic", -1340848376);
        setField(term53978, term53978.getClass(), "matchStartTime", "rLDmBbcLaC");
        setField(term53978, term53978.getClass(), "matchEndTime", "tUKcXglBlG");
        setIntField(term53978, term53978.getClass(), "matchTimeLimit", -1482512097);
        setIntField(term53978, term53978.getClass(), "matchErrorLimit", -2076427376);
        setField(term53978, term53978.getClass(), "matchingUri", "ZGptycjjRq");
        setField(term53978, term53978.getClass(), "udpHolePunchUri", "kXJaxapFer");
        setField(term53978, term53978.getClass(), "reflectorUri", "OEeAVwVwuj");
        setField(term53977, term53977.getClass(), "gameSetting", term53978);
        setBooleanField(term53977, term53977.getClass(), "isDumpUpload", false);
        setBooleanField(term53977, term53977.getClass(), "isAou", false);
        term54097 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term54097, term54097.getClass(), "romVersion", "WEgFuDZsxi");
        setField(term54097, term54097.getClass(), "dataVersion", "kvcaSGNTHd");
        setBooleanField(term54097, term54097.getClass(), "isMaintenance", false);
        setIntField(term54097, term54097.getClass(), "requestInterval", -852476369);
        setField(term54097, term54097.getClass(), "rebootStartTime", "opXkGeBDoI");
        setField(term54097, term54097.getClass(), "rebootEndTime", "UHxidCtatV");
        setBooleanField(term54097, term54097.getClass(), "isBackgroundDistribute", false);
        setIntField(term54097, term54097.getClass(), "maxCountCharacter", 596868453);
        setIntField(term54097, term54097.getClass(), "maxCountItem", -1890744188);
        setIntField(term54097, term54097.getClass(), "maxCountMusic", 2118439468);
        setField(term54097, term54097.getClass(), "matchStartTime", "LRzADDSjVT");
        setField(term54097, term54097.getClass(), "matchEndTime", "lpFCMaAYxj");
        setIntField(term54097, term54097.getClass(), "matchTimeLimit", -241809702);
        setIntField(term54097, term54097.getClass(), "matchErrorLimit", 711539411);
        setField(term54097, term54097.getClass(), "matchingUri", "fzHVMNSLii");
        setField(term54097, term54097.getClass(), "udpHolePunchUri", "TxymnVINZF");
        setField(term54097, term54097.getClass(), "reflectorUri", "fkBfmixBEh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Object[] args = new Object[1];
        args[0] = term54097;
        callMethod(klass, "setGameSetting", argTypes, term53977, args);
    }

};


