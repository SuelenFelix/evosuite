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

public class RecentResp_getPlayDate_2950140030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51355;

    public RecentResp_getPlayDate_2950140030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51355 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term51356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51361 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51367 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51371 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51357, term51357.getClass(), "year", 2013);
        setShortField(term51357, term51357.getClass(), "month", (short) 11);
        setShortField(term51357, term51357.getClass(), "day", (short) 15);
        setField(term51356, term51356.getClass(), "date", term51357);
        setByteField(term51361, term51361.getClass(), "hour", (byte) 16);
        setByteField(term51361, term51361.getClass(), "minute", (byte) 0);
        setByteField(term51361, term51361.getClass(), "second", (byte) 59);
        setIntField(term51361, term51361.getClass(), "nano", 823311700);
        setField(term51356, term51356.getClass(), "time", term51361);
        setField(term51355, term51355.getClass(), "playDate", term51356);
        setIntField(term51367, term51367.getClass(), "year", 2017);
        setShortField(term51367, term51367.getClass(), "month", (short) 11);
        setShortField(term51367, term51367.getClass(), "day", (short) 30);
        setField(term51366, term51366.getClass(), "date", term51367);
        setByteField(term51371, term51371.getClass(), "hour", (byte) 23);
        setByteField(term51371, term51371.getClass(), "minute", (byte) 28);
        setByteField(term51371, term51371.getClass(), "second", (byte) 34);
        setIntField(term51371, term51371.getClass(), "nano", 684347789);
        setField(term51366, term51366.getClass(), "time", term51371);
        setField(term51355, term51355.getClass(), "userPlayDate", term51366);
        setIntField(term51355, term51355.getClass(), "musicId", 1394815305);
        setIntField(term51355, term51355.getClass(), "level", -315070279);
        setIntField(term51355, term51355.getClass(), "customId", 62449386);
        setIntField(term51355, term51355.getClass(), "playedCustom1", -1488558129);
        setIntField(term51355, term51355.getClass(), "playedCustom2", -929614389);
        setIntField(term51355, term51355.getClass(), "playedCustom3", 1585326879);
        setIntField(term51355, term51355.getClass(), "track", 1161195592);
        setIntField(term51355, term51355.getClass(), "score", -1012640616);
        setIntField(term51355, term51355.getClass(), "rank", -552664740);
        setIntField(term51355, term51355.getClass(), "maxCombo", -1639838200);
        setIntField(term51355, term51355.getClass(), "maxChain", -60462175);
        setIntField(term51355, term51355.getClass(), "rateTap", 1315997028);
        setIntField(term51355, term51355.getClass(), "rateHold", 1268210239);
        setIntField(term51355, term51355.getClass(), "rateSlide", -697986260);
        setIntField(term51355, term51355.getClass(), "rateAir", -672315403);
        setIntField(term51355, term51355.getClass(), "rateFlick", 507507290);
        setIntField(term51355, term51355.getClass(), "judgeGuilty", 9057138);
        setIntField(term51355, term51355.getClass(), "judgeAttack", 2130019201);
        setIntField(term51355, term51355.getClass(), "judgeJustice", 504634766);
        setIntField(term51355, term51355.getClass(), "judgeCritical", 1963462917);
        setIntField(term51355, term51355.getClass(), "playerRating", 552203554);
        setBooleanField(term51355, term51355.getClass(), "isNewRecord", false);
        setBooleanField(term51355, term51355.getClass(), "isFullCombo", true);
        setIntField(term51355, term51355.getClass(), "fullChainKind", 1645215896);
        setBooleanField(term51355, term51355.getClass(), "isAllJustice", true);
        setIntField(term51355, term51355.getClass(), "characterId", -914100840);
        setIntField(term51355, term51355.getClass(), "skillId", 1806294616);
        setIntField(term51355, term51355.getClass(), "playKind", 1766086753);
        setBooleanField(term51355, term51355.getClass(), "isClear", false);
        setIntField(term51355, term51355.getClass(), "skillLevel", -1211119545);
        setIntField(term51355, term51355.getClass(), "skillEffect", 1584121590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayDate", argTypes, term51355, args);
    }

};


