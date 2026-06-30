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

public class RecentResp_setPlayDate_207827975633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47901;
     Object term47953;

    public RecentResp_setPlayDate_207827975633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47901 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47902 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47903 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47907 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47917 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47903, term47903.getClass(), "year", 2026);
        setShortField(term47903, term47903.getClass(), "month", (short) 2);
        setShortField(term47903, term47903.getClass(), "day", (short) 5);
        setField(term47902, term47902.getClass(), "date", term47903);
        setByteField(term47907, term47907.getClass(), "hour", (byte) 8);
        setByteField(term47907, term47907.getClass(), "minute", (byte) 6);
        setByteField(term47907, term47907.getClass(), "second", (byte) 3);
        setIntField(term47907, term47907.getClass(), "nano", 107243113);
        setField(term47902, term47902.getClass(), "time", term47907);
        setField(term47901, term47901.getClass(), "playDate", term47902);
        setIntField(term47913, term47913.getClass(), "year", 2013);
        setShortField(term47913, term47913.getClass(), "month", (short) 3);
        setShortField(term47913, term47913.getClass(), "day", (short) 17);
        setField(term47912, term47912.getClass(), "date", term47913);
        setByteField(term47917, term47917.getClass(), "hour", (byte) 6);
        setByteField(term47917, term47917.getClass(), "minute", (byte) 13);
        setByteField(term47917, term47917.getClass(), "second", (byte) 20);
        setIntField(term47917, term47917.getClass(), "nano", 748150546);
        setField(term47912, term47912.getClass(), "time", term47917);
        setField(term47901, term47901.getClass(), "userPlayDate", term47912);
        setIntField(term47901, term47901.getClass(), "musicId", 398554038);
        setIntField(term47901, term47901.getClass(), "level", -1454206593);
        setIntField(term47901, term47901.getClass(), "customId", 675396436);
        setIntField(term47901, term47901.getClass(), "playedCustom1", -41963319);
        setIntField(term47901, term47901.getClass(), "playedCustom2", -831752810);
        setIntField(term47901, term47901.getClass(), "playedCustom3", -386141354);
        setIntField(term47901, term47901.getClass(), "track", -226677391);
        setIntField(term47901, term47901.getClass(), "score", -1991945298);
        setIntField(term47901, term47901.getClass(), "rank", 110090057);
        setIntField(term47901, term47901.getClass(), "maxCombo", 1975165299);
        setIntField(term47901, term47901.getClass(), "maxChain", -1320712215);
        setIntField(term47901, term47901.getClass(), "rateTap", -619414497);
        setIntField(term47901, term47901.getClass(), "rateHold", 1414603242);
        setIntField(term47901, term47901.getClass(), "rateSlide", 18596324);
        setIntField(term47901, term47901.getClass(), "rateAir", 907968883);
        setIntField(term47901, term47901.getClass(), "rateFlick", -1191329679);
        setIntField(term47901, term47901.getClass(), "judgeGuilty", -937626498);
        setIntField(term47901, term47901.getClass(), "judgeAttack", 398974629);
        setIntField(term47901, term47901.getClass(), "judgeJustice", -790946306);
        setIntField(term47901, term47901.getClass(), "judgeCritical", -189980304);
        setIntField(term47901, term47901.getClass(), "playerRating", 1492044959);
        setBooleanField(term47901, term47901.getClass(), "isNewRecord", false);
        setBooleanField(term47901, term47901.getClass(), "isFullCombo", false);
        setIntField(term47901, term47901.getClass(), "fullChainKind", 260483962);
        setBooleanField(term47901, term47901.getClass(), "isAllJustice", false);
        setIntField(term47901, term47901.getClass(), "characterId", 1115251191);
        setIntField(term47901, term47901.getClass(), "skillId", 1882224203);
        setIntField(term47901, term47901.getClass(), "playKind", 1320826206);
        setBooleanField(term47901, term47901.getClass(), "isClear", true);
        setIntField(term47901, term47901.getClass(), "skillLevel", -933702401);
        setIntField(term47901, term47901.getClass(), "skillEffect", 1670477259);
        term47953 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47954 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47958 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47954, term47954.getClass(), "year", 2010);
        setShortField(term47954, term47954.getClass(), "month", (short) 11);
        setShortField(term47954, term47954.getClass(), "day", (short) 12);
        setField(term47953, term47953.getClass(), "date", term47954);
        setByteField(term47958, term47958.getClass(), "hour", (byte) 19);
        setByteField(term47958, term47958.getClass(), "minute", (byte) 8);
        setByteField(term47958, term47958.getClass(), "second", (byte) 0);
        setIntField(term47958, term47958.getClass(), "nano", 224480743);
        setField(term47953, term47953.getClass(), "time", term47958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term47953;
        callMethod(klass, "setPlayDate", argTypes, term47901, args);
    }

};


