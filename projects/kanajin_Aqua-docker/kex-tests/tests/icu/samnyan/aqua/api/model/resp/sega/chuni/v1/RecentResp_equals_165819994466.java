package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecentResp_equals_165819994466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54869;
     Object term54921;

    public RecentResp_equals_165819994466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54869 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54870 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54871 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54875 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54880 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54881 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54885 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54871, term54871.getClass(), "year", 2017);
        setShortField(term54871, term54871.getClass(), "month", (short) 2);
        setShortField(term54871, term54871.getClass(), "day", (short) 24);
        setField(term54870, term54870.getClass(), "date", term54871);
        setByteField(term54875, term54875.getClass(), "hour", (byte) 23);
        setByteField(term54875, term54875.getClass(), "minute", (byte) 46);
        setByteField(term54875, term54875.getClass(), "second", (byte) 43);
        setIntField(term54875, term54875.getClass(), "nano", 626549570);
        setField(term54870, term54870.getClass(), "time", term54875);
        setField(term54869, term54869.getClass(), "playDate", term54870);
        setIntField(term54881, term54881.getClass(), "year", 2014);
        setShortField(term54881, term54881.getClass(), "month", (short) 4);
        setShortField(term54881, term54881.getClass(), "day", (short) 20);
        setField(term54880, term54880.getClass(), "date", term54881);
        setByteField(term54885, term54885.getClass(), "hour", (byte) 16);
        setByteField(term54885, term54885.getClass(), "minute", (byte) 19);
        setByteField(term54885, term54885.getClass(), "second", (byte) 50);
        setIntField(term54885, term54885.getClass(), "nano", 397343944);
        setField(term54880, term54880.getClass(), "time", term54885);
        setField(term54869, term54869.getClass(), "userPlayDate", term54880);
        setIntField(term54869, term54869.getClass(), "musicId", 267573446);
        setIntField(term54869, term54869.getClass(), "level", -1319954987);
        setIntField(term54869, term54869.getClass(), "customId", 701324276);
        setIntField(term54869, term54869.getClass(), "playedCustom1", -2141408767);
        setIntField(term54869, term54869.getClass(), "playedCustom2", 2033366485);
        setIntField(term54869, term54869.getClass(), "playedCustom3", 688731975);
        setIntField(term54869, term54869.getClass(), "track", 1198340749);
        setIntField(term54869, term54869.getClass(), "score", -385710681);
        setIntField(term54869, term54869.getClass(), "rank", 1624133267);
        setIntField(term54869, term54869.getClass(), "maxCombo", -1547947305);
        setIntField(term54869, term54869.getClass(), "maxChain", -919225635);
        setIntField(term54869, term54869.getClass(), "rateTap", -1044514554);
        setIntField(term54869, term54869.getClass(), "rateHold", 35189099);
        setIntField(term54869, term54869.getClass(), "rateSlide", -1399937823);
        setIntField(term54869, term54869.getClass(), "rateAir", 1439151010);
        setIntField(term54869, term54869.getClass(), "rateFlick", 520109121);
        setIntField(term54869, term54869.getClass(), "judgeGuilty", -1374704112);
        setIntField(term54869, term54869.getClass(), "judgeAttack", 1603677150);
        setIntField(term54869, term54869.getClass(), "judgeJustice", -926340720);
        setIntField(term54869, term54869.getClass(), "judgeCritical", -1134329349);
        setIntField(term54869, term54869.getClass(), "playerRating", -1590495256);
        setBooleanField(term54869, term54869.getClass(), "isNewRecord", true);
        setBooleanField(term54869, term54869.getClass(), "isFullCombo", true);
        setIntField(term54869, term54869.getClass(), "fullChainKind", 1804035317);
        setBooleanField(term54869, term54869.getClass(), "isAllJustice", false);
        setIntField(term54869, term54869.getClass(), "characterId", -1627336108);
        setIntField(term54869, term54869.getClass(), "skillId", -70819831);
        setIntField(term54869, term54869.getClass(), "playKind", 1601014438);
        setBooleanField(term54869, term54869.getClass(), "isClear", false);
        setIntField(term54869, term54869.getClass(), "skillLevel", -1549492777);
        setIntField(term54869, term54869.getClass(), "skillEffect", -1166523434);
        term54921 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term54921;
        callMethod(klass, "equals", argTypes, term54869, args);
    }

};


