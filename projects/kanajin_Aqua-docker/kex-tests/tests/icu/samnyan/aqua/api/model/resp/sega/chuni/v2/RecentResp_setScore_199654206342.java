package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class RecentResp_setScore_199654206342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48403;
     Object term48455;

    public RecentResp_setScore_199654206342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48403 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48409 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48419 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48405, term48405.getClass(), "year", 2016);
        setShortField(term48405, term48405.getClass(), "month", (short) 5);
        setShortField(term48405, term48405.getClass(), "day", (short) 15);
        setField(term48404, term48404.getClass(), "date", term48405);
        setByteField(term48409, term48409.getClass(), "hour", (byte) 13);
        setByteField(term48409, term48409.getClass(), "minute", (byte) 7);
        setByteField(term48409, term48409.getClass(), "second", (byte) 29);
        setIntField(term48409, term48409.getClass(), "nano", 36973761);
        setField(term48404, term48404.getClass(), "time", term48409);
        setField(term48403, term48403.getClass(), "playDate", term48404);
        setIntField(term48415, term48415.getClass(), "year", 2028);
        setShortField(term48415, term48415.getClass(), "month", (short) 11);
        setShortField(term48415, term48415.getClass(), "day", (short) 8);
        setField(term48414, term48414.getClass(), "date", term48415);
        setByteField(term48419, term48419.getClass(), "hour", (byte) 11);
        setByteField(term48419, term48419.getClass(), "minute", (byte) 41);
        setByteField(term48419, term48419.getClass(), "second", (byte) 26);
        setIntField(term48419, term48419.getClass(), "nano", 234822620);
        setField(term48414, term48414.getClass(), "time", term48419);
        setField(term48403, term48403.getClass(), "userPlayDate", term48414);
        setIntField(term48403, term48403.getClass(), "musicId", -1702583840);
        setIntField(term48403, term48403.getClass(), "level", -1496594860);
        setIntField(term48403, term48403.getClass(), "customId", -1754638525);
        setIntField(term48403, term48403.getClass(), "playedCustom1", -1058018356);
        setIntField(term48403, term48403.getClass(), "playedCustom2", -618930598);
        setIntField(term48403, term48403.getClass(), "playedCustom3", -1912835189);
        setIntField(term48403, term48403.getClass(), "track", 1508089655);
        setIntField(term48403, term48403.getClass(), "score", 1344738281);
        setIntField(term48403, term48403.getClass(), "rank", 2137586016);
        setIntField(term48403, term48403.getClass(), "maxCombo", 718944255);
        setIntField(term48403, term48403.getClass(), "maxChain", -255278880);
        setIntField(term48403, term48403.getClass(), "rateTap", 978936508);
        setIntField(term48403, term48403.getClass(), "rateHold", -782282859);
        setIntField(term48403, term48403.getClass(), "rateSlide", -289872820);
        setIntField(term48403, term48403.getClass(), "rateAir", 999463901);
        setIntField(term48403, term48403.getClass(), "rateFlick", -1558642750);
        setIntField(term48403, term48403.getClass(), "judgeGuilty", 1177832973);
        setIntField(term48403, term48403.getClass(), "judgeAttack", -808639910);
        setIntField(term48403, term48403.getClass(), "judgeJustice", -2087767976);
        setIntField(term48403, term48403.getClass(), "judgeCritical", 1541808857);
        setIntField(term48403, term48403.getClass(), "playerRating", 2007310608);
        setBooleanField(term48403, term48403.getClass(), "isNewRecord", true);
        setBooleanField(term48403, term48403.getClass(), "isFullCombo", true);
        setIntField(term48403, term48403.getClass(), "fullChainKind", 462157519);
        setBooleanField(term48403, term48403.getClass(), "isAllJustice", true);
        setIntField(term48403, term48403.getClass(), "characterId", -875956888);
        setIntField(term48403, term48403.getClass(), "skillId", 65647821);
        setIntField(term48403, term48403.getClass(), "playKind", -1289614562);
        setBooleanField(term48403, term48403.getClass(), "isClear", false);
        setIntField(term48403, term48403.getClass(), "skillLevel", 201090501);
        setIntField(term48403, term48403.getClass(), "skillEffect", -1397182025);
        term48455 = new Integer(-899619534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48455;
        callMethod(klass, "setScore", argTypes, term48403, args);
    }

};


