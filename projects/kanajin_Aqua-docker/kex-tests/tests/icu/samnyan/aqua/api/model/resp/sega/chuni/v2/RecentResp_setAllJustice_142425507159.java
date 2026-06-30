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
import java.lang.Boolean;

public class RecentResp_setAllJustice_142425507159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49321;
     Object term49373;

    public RecentResp_setAllJustice_142425507159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49321 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49322 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49323 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49327 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49337 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49323, term49323.getClass(), "year", 2022);
        setShortField(term49323, term49323.getClass(), "month", (short) 6);
        setShortField(term49323, term49323.getClass(), "day", (short) 2);
        setField(term49322, term49322.getClass(), "date", term49323);
        setByteField(term49327, term49327.getClass(), "hour", (byte) 18);
        setByteField(term49327, term49327.getClass(), "minute", (byte) 14);
        setByteField(term49327, term49327.getClass(), "second", (byte) 42);
        setIntField(term49327, term49327.getClass(), "nano", 593545677);
        setField(term49322, term49322.getClass(), "time", term49327);
        setField(term49321, term49321.getClass(), "playDate", term49322);
        setIntField(term49333, term49333.getClass(), "year", 2010);
        setShortField(term49333, term49333.getClass(), "month", (short) 7);
        setShortField(term49333, term49333.getClass(), "day", (short) 19);
        setField(term49332, term49332.getClass(), "date", term49333);
        setByteField(term49337, term49337.getClass(), "hour", (byte) 16);
        setByteField(term49337, term49337.getClass(), "minute", (byte) 23);
        setByteField(term49337, term49337.getClass(), "second", (byte) 11);
        setIntField(term49337, term49337.getClass(), "nano", 638450755);
        setField(term49332, term49332.getClass(), "time", term49337);
        setField(term49321, term49321.getClass(), "userPlayDate", term49332);
        setIntField(term49321, term49321.getClass(), "musicId", -1227561158);
        setIntField(term49321, term49321.getClass(), "level", -1853440273);
        setIntField(term49321, term49321.getClass(), "customId", 1884281846);
        setIntField(term49321, term49321.getClass(), "playedCustom1", -1779176468);
        setIntField(term49321, term49321.getClass(), "playedCustom2", -790563662);
        setIntField(term49321, term49321.getClass(), "playedCustom3", 692290973);
        setIntField(term49321, term49321.getClass(), "track", 344667712);
        setIntField(term49321, term49321.getClass(), "score", 921447346);
        setIntField(term49321, term49321.getClass(), "rank", 1514227664);
        setIntField(term49321, term49321.getClass(), "maxCombo", 2000874140);
        setIntField(term49321, term49321.getClass(), "maxChain", -701728269);
        setIntField(term49321, term49321.getClass(), "rateTap", -1094813190);
        setIntField(term49321, term49321.getClass(), "rateHold", -355401879);
        setIntField(term49321, term49321.getClass(), "rateSlide", -1878519758);
        setIntField(term49321, term49321.getClass(), "rateAir", -214099950);
        setIntField(term49321, term49321.getClass(), "rateFlick", -1324210306);
        setIntField(term49321, term49321.getClass(), "judgeGuilty", -1148507981);
        setIntField(term49321, term49321.getClass(), "judgeAttack", 149806587);
        setIntField(term49321, term49321.getClass(), "judgeJustice", 2030509680);
        setIntField(term49321, term49321.getClass(), "judgeCritical", -927217294);
        setIntField(term49321, term49321.getClass(), "playerRating", -157082836);
        setBooleanField(term49321, term49321.getClass(), "isNewRecord", false);
        setBooleanField(term49321, term49321.getClass(), "isFullCombo", true);
        setIntField(term49321, term49321.getClass(), "fullChainKind", 1665464572);
        setBooleanField(term49321, term49321.getClass(), "isAllJustice", true);
        setIntField(term49321, term49321.getClass(), "characterId", -685125586);
        setIntField(term49321, term49321.getClass(), "skillId", 708362673);
        setIntField(term49321, term49321.getClass(), "playKind", -630444357);
        setBooleanField(term49321, term49321.getClass(), "isClear", false);
        setIntField(term49321, term49321.getClass(), "skillLevel", 936421624);
        setIntField(term49321, term49321.getClass(), "skillEffect", -616512894);
        term49373 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term49373;
        callMethod(klass, "setAllJustice", argTypes, term49321, args);
    }

};


