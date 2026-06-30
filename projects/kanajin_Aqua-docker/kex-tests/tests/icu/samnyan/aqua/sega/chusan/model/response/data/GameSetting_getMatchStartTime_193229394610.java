package icu.samnyan.aqua.sega.chusan.model.response.data;

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
import static icu.samnyan.aqua.sega.chusan.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getMatchStartTime_193229394610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5649;

    public GameSetting_getMatchStartTime_193229394610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5649 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term5649, term5649.getClass(), "romVersion", "stVcZLTNpu");
        setField(term5649, term5649.getClass(), "dataVersion", "LgXdqWrsLL");
        setBooleanField(term5649, term5649.getClass(), "isMaintenance", true);
        setIntField(term5649, term5649.getClass(), "requestInterval", -325187625);
        setField(term5649, term5649.getClass(), "rebootStartTime", "bbHWyibNmy");
        setField(term5649, term5649.getClass(), "rebootEndTime", "vYYOYhWMWZ");
        setBooleanField(term5649, term5649.getClass(), "isBackgroundDistribute", false);
        setIntField(term5649, term5649.getClass(), "maxCountCharacter", -317484961);
        setIntField(term5649, term5649.getClass(), "maxCountItem", 418080259);
        setIntField(term5649, term5649.getClass(), "maxCountMusic", 657195865);
        setField(term5649, term5649.getClass(), "matchStartTime", "FLQJOzEXff");
        setField(term5649, term5649.getClass(), "matchEndTime", "qlaIVJBSfQ");
        setIntField(term5649, term5649.getClass(), "matchTimeLimit", 1397647176);
        setIntField(term5649, term5649.getClass(), "matchErrorLimit", -1375675721);
        setField(term5649, term5649.getClass(), "matchingUri", "lYvIWBFFsq");
        setField(term5649, term5649.getClass(), "udpHolePunchUri", "tThwsqWKcE");
        setField(term5649, term5649.getClass(), "reflectorUri", "bkSgsDrkCN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchStartTime", argTypes, term5649, args);
    }

};


