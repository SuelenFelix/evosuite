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

public class RecentResp_setUserPlayDate_155601468634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53133;
     Object term53185;

    public RecentResp_setUserPlayDate_155601468634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53133 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53139 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53149 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53135, term53135.getClass(), "year", 2019);
        setShortField(term53135, term53135.getClass(), "month", (short) 4);
        setShortField(term53135, term53135.getClass(), "day", (short) 3);
        setField(term53134, term53134.getClass(), "date", term53135);
        setByteField(term53139, term53139.getClass(), "hour", (byte) 11);
        setByteField(term53139, term53139.getClass(), "minute", (byte) 54);
        setByteField(term53139, term53139.getClass(), "second", (byte) 10);
        setIntField(term53139, term53139.getClass(), "nano", 203720801);
        setField(term53134, term53134.getClass(), "time", term53139);
        setField(term53133, term53133.getClass(), "playDate", term53134);
        setIntField(term53145, term53145.getClass(), "year", 2017);
        setShortField(term53145, term53145.getClass(), "month", (short) 9);
        setShortField(term53145, term53145.getClass(), "day", (short) 20);
        setField(term53144, term53144.getClass(), "date", term53145);
        setByteField(term53149, term53149.getClass(), "hour", (byte) 7);
        setByteField(term53149, term53149.getClass(), "minute", (byte) 35);
        setByteField(term53149, term53149.getClass(), "second", (byte) 31);
        setIntField(term53149, term53149.getClass(), "nano", 62099803);
        setField(term53144, term53144.getClass(), "time", term53149);
        setField(term53133, term53133.getClass(), "userPlayDate", term53144);
        setIntField(term53133, term53133.getClass(), "musicId", 1141997389);
        setIntField(term53133, term53133.getClass(), "level", -1491507262);
        setIntField(term53133, term53133.getClass(), "customId", 1071463645);
        setIntField(term53133, term53133.getClass(), "playedCustom1", 165616136);
        setIntField(term53133, term53133.getClass(), "playedCustom2", 887351836);
        setIntField(term53133, term53133.getClass(), "playedCustom3", 2002612399);
        setIntField(term53133, term53133.getClass(), "track", -1256668289);
        setIntField(term53133, term53133.getClass(), "score", -1377964851);
        setIntField(term53133, term53133.getClass(), "rank", -1288314969);
        setIntField(term53133, term53133.getClass(), "maxCombo", -1625206430);
        setIntField(term53133, term53133.getClass(), "maxChain", 1599734340);
        setIntField(term53133, term53133.getClass(), "rateTap", 1262425699);
        setIntField(term53133, term53133.getClass(), "rateHold", -515051505);
        setIntField(term53133, term53133.getClass(), "rateSlide", -1071258857);
        setIntField(term53133, term53133.getClass(), "rateAir", 1274665398);
        setIntField(term53133, term53133.getClass(), "rateFlick", -1093564935);
        setIntField(term53133, term53133.getClass(), "judgeGuilty", -1092739931);
        setIntField(term53133, term53133.getClass(), "judgeAttack", 859336834);
        setIntField(term53133, term53133.getClass(), "judgeJustice", -924154861);
        setIntField(term53133, term53133.getClass(), "judgeCritical", -1878694006);
        setIntField(term53133, term53133.getClass(), "playerRating", 1950167487);
        setBooleanField(term53133, term53133.getClass(), "isNewRecord", true);
        setBooleanField(term53133, term53133.getClass(), "isFullCombo", false);
        setIntField(term53133, term53133.getClass(), "fullChainKind", 1031826708);
        setBooleanField(term53133, term53133.getClass(), "isAllJustice", true);
        setIntField(term53133, term53133.getClass(), "characterId", -735726273);
        setIntField(term53133, term53133.getClass(), "skillId", 1618278091);
        setIntField(term53133, term53133.getClass(), "playKind", -548967985);
        setBooleanField(term53133, term53133.getClass(), "isClear", true);
        setIntField(term53133, term53133.getClass(), "skillLevel", -1923425156);
        setIntField(term53133, term53133.getClass(), "skillEffect", 1237861885);
        term53185 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53186 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53190 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53186, term53186.getClass(), "year", 2025);
        setShortField(term53186, term53186.getClass(), "month", (short) 1);
        setShortField(term53186, term53186.getClass(), "day", (short) 8);
        setField(term53185, term53185.getClass(), "date", term53186);
        setByteField(term53190, term53190.getClass(), "hour", (byte) 19);
        setByteField(term53190, term53190.getClass(), "minute", (byte) 44);
        setByteField(term53190, term53190.getClass(), "second", (byte) 29);
        setIntField(term53190, term53190.getClass(), "nano", 541948713);
        setField(term53185, term53185.getClass(), "time", term53190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term53185;
        callMethod(klass, "setUserPlayDate", argTypes, term53133, args);
    }

};


