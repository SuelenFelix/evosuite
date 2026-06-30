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
import java.lang.Integer;

public class RecentResp_setRateAir_57789304849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53951;
     Object term54003;

    public RecentResp_setRateAir_57789304849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53951 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53952 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53957 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53962 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53963 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53967 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53953, term53953.getClass(), "year", 2017);
        setShortField(term53953, term53953.getClass(), "month", (short) 4);
        setShortField(term53953, term53953.getClass(), "day", (short) 16);
        setField(term53952, term53952.getClass(), "date", term53953);
        setByteField(term53957, term53957.getClass(), "hour", (byte) 8);
        setByteField(term53957, term53957.getClass(), "minute", (byte) 31);
        setByteField(term53957, term53957.getClass(), "second", (byte) 56);
        setIntField(term53957, term53957.getClass(), "nano", 663406344);
        setField(term53952, term53952.getClass(), "time", term53957);
        setField(term53951, term53951.getClass(), "playDate", term53952);
        setIntField(term53963, term53963.getClass(), "year", 2010);
        setShortField(term53963, term53963.getClass(), "month", (short) 7);
        setShortField(term53963, term53963.getClass(), "day", (short) 8);
        setField(term53962, term53962.getClass(), "date", term53963);
        setByteField(term53967, term53967.getClass(), "hour", (byte) 3);
        setByteField(term53967, term53967.getClass(), "minute", (byte) 45);
        setByteField(term53967, term53967.getClass(), "second", (byte) 2);
        setIntField(term53967, term53967.getClass(), "nano", 15135741);
        setField(term53962, term53962.getClass(), "time", term53967);
        setField(term53951, term53951.getClass(), "userPlayDate", term53962);
        setIntField(term53951, term53951.getClass(), "musicId", -2050574403);
        setIntField(term53951, term53951.getClass(), "level", 1891840747);
        setIntField(term53951, term53951.getClass(), "customId", -118389472);
        setIntField(term53951, term53951.getClass(), "playedCustom1", -706486666);
        setIntField(term53951, term53951.getClass(), "playedCustom2", 1426550776);
        setIntField(term53951, term53951.getClass(), "playedCustom3", 1793694701);
        setIntField(term53951, term53951.getClass(), "track", 1334634518);
        setIntField(term53951, term53951.getClass(), "score", -1358832342);
        setIntField(term53951, term53951.getClass(), "rank", 330525017);
        setIntField(term53951, term53951.getClass(), "maxCombo", -2097182938);
        setIntField(term53951, term53951.getClass(), "maxChain", -1911268197);
        setIntField(term53951, term53951.getClass(), "rateTap", 1989699628);
        setIntField(term53951, term53951.getClass(), "rateHold", 1406976166);
        setIntField(term53951, term53951.getClass(), "rateSlide", -683361157);
        setIntField(term53951, term53951.getClass(), "rateAir", 1735058829);
        setIntField(term53951, term53951.getClass(), "rateFlick", -1945706596);
        setIntField(term53951, term53951.getClass(), "judgeGuilty", 13487895);
        setIntField(term53951, term53951.getClass(), "judgeAttack", 369911284);
        setIntField(term53951, term53951.getClass(), "judgeJustice", 1488504614);
        setIntField(term53951, term53951.getClass(), "judgeCritical", 661477727);
        setIntField(term53951, term53951.getClass(), "playerRating", 274618169);
        setBooleanField(term53951, term53951.getClass(), "isNewRecord", false);
        setBooleanField(term53951, term53951.getClass(), "isFullCombo", false);
        setIntField(term53951, term53951.getClass(), "fullChainKind", -1618606893);
        setBooleanField(term53951, term53951.getClass(), "isAllJustice", false);
        setIntField(term53951, term53951.getClass(), "characterId", -560211840);
        setIntField(term53951, term53951.getClass(), "skillId", 103542361);
        setIntField(term53951, term53951.getClass(), "playKind", -1737221099);
        setBooleanField(term53951, term53951.getClass(), "isClear", true);
        setIntField(term53951, term53951.getClass(), "skillLevel", -1032313881);
        setIntField(term53951, term53951.getClass(), "skillEffect", 1246554458);
        term54003 = new Integer(-1913837862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54003;
        callMethod(klass, "setRateAir", argTypes, term53951, args);
    }

};


