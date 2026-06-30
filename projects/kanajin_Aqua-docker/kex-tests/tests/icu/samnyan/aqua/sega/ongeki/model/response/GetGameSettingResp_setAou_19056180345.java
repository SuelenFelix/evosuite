package icu.samnyan.aqua.sega.ongeki.model.response;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class GetGameSettingResp_setAou_19056180345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672;
     Object term733;

    public GetGameSettingResp_setAou_19056180345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp"));
        Object term673 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term673, term673.getClass(), "dataVersion", "BYqFIqCKAV");
        setField(term673, term673.getClass(), "onlineDataVersion", "vrQLuWIDJX");
        setBooleanField(term673, term673.getClass(), "isMaintenance", true);
        setIntField(term673, term673.getClass(), "requestInterval", -1371869594);
        setField(term673, term673.getClass(), "rebootStartTime", "flxyYxBRtu");
        setField(term673, term673.getClass(), "rebootEndTime", "OclPbYPkcH");
        setBooleanField(term673, term673.getClass(), "isBackgroundDistribute", true);
        setIntField(term673, term673.getClass(), "maxCountCharacter", -2095575670);
        setIntField(term673, term673.getClass(), "maxCountCard", 1225272962);
        setIntField(term673, term673.getClass(), "maxCountItem", 1324040357);
        setIntField(term673, term673.getClass(), "maxCountMusic", -1588772968);
        setIntField(term673, term673.getClass(), "maxCountMusicItem", -93135961);
        setIntField(term673, term673.getClass(), "macCountRivalMusic", -112921587);
        setField(term672, term672.getClass(), "gameSetting", term673);
        setBooleanField(term672, term672.getClass(), "isDumpUpload", false);
        setBooleanField(term672, term672.getClass(), "isAou", false);
        term733 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term733;
        callMethod(klass, "setAou", argTypes, term672, args);
    }

};


