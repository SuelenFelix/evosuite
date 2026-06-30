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

public class GetGameSettingResp_setDumpUpload_1057179564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569;
     Object term630;

    public GetGameSettingResp_setDumpUpload_1057179564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term569 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp"));
        Object term570 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term570, term570.getClass(), "dataVersion", "hNxWaHcfhY");
        setField(term570, term570.getClass(), "onlineDataVersion", "RkybSrpybU");
        setBooleanField(term570, term570.getClass(), "isMaintenance", false);
        setIntField(term570, term570.getClass(), "requestInterval", 292681826);
        setField(term570, term570.getClass(), "rebootStartTime", "xOEqzGAmDU");
        setField(term570, term570.getClass(), "rebootEndTime", "eZFUvlxvGV");
        setBooleanField(term570, term570.getClass(), "isBackgroundDistribute", false);
        setIntField(term570, term570.getClass(), "maxCountCharacter", 458147407);
        setIntField(term570, term570.getClass(), "maxCountCard", -184153539);
        setIntField(term570, term570.getClass(), "maxCountItem", 493620644);
        setIntField(term570, term570.getClass(), "maxCountMusic", 1328271830);
        setIntField(term570, term570.getClass(), "maxCountMusicItem", 1596070772);
        setIntField(term570, term570.getClass(), "macCountRivalMusic", 97029295);
        setField(term569, term569.getClass(), "gameSetting", term570);
        setBooleanField(term569, term569.getClass(), "isDumpUpload", true);
        setBooleanField(term569, term569.getClass(), "isAou", true);
        term630 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term630;
        callMethod(klass, "setDumpUpload", argTypes, term569, args);
    }

};


