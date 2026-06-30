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

public class GetGameSettingResp_isDumpUpload_18876631371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53557;

    public GetGameSettingResp_isDumpUpload_18876631371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53557 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp"));
        Object term53558 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term53558, term53558.getClass(), "romVersion", "uUAkxSFPyL");
        setField(term53558, term53558.getClass(), "dataVersion", "XfzbAdTaCO");
        setBooleanField(term53558, term53558.getClass(), "isMaintenance", true);
        setIntField(term53558, term53558.getClass(), "requestInterval", -1081016436);
        setField(term53558, term53558.getClass(), "rebootStartTime", "rDcGfVDmsE");
        setField(term53558, term53558.getClass(), "rebootEndTime", "agspBqCjgG");
        setBooleanField(term53558, term53558.getClass(), "isBackgroundDistribute", false);
        setIntField(term53558, term53558.getClass(), "maxCountCharacter", 1465385986);
        setIntField(term53558, term53558.getClass(), "maxCountItem", 1976158913);
        setIntField(term53558, term53558.getClass(), "maxCountMusic", 696093985);
        setField(term53558, term53558.getClass(), "matchStartTime", "HMJaeNiTNW");
        setField(term53558, term53558.getClass(), "matchEndTime", "ggcJNlLcZb");
        setIntField(term53558, term53558.getClass(), "matchTimeLimit", 488572556);
        setIntField(term53558, term53558.getClass(), "matchErrorLimit", 2103579931);
        setField(term53558, term53558.getClass(), "matchingUri", "EzhvjUZCQP");
        setField(term53558, term53558.getClass(), "udpHolePunchUri", "FTHebphiPR");
        setField(term53558, term53558.getClass(), "reflectorUri", "OQjMPmyJQz");
        setField(term53557, term53557.getClass(), "gameSetting", term53558);
        setBooleanField(term53557, term53557.getClass(), "isDumpUpload", false);
        setBooleanField(term53557, term53557.getClass(), "isAou", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDumpUpload", argTypes, term53557, args);
    }

};


