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

public class RecentResp_setLevel_73761216236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53249;
     Object term53301;

    public RecentResp_setLevel_73761216236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53249 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53255 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53260 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53261 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53265 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53251, term53251.getClass(), "year", 2019);
        setShortField(term53251, term53251.getClass(), "month", (short) 4);
        setShortField(term53251, term53251.getClass(), "day", (short) 22);
        setField(term53250, term53250.getClass(), "date", term53251);
        setByteField(term53255, term53255.getClass(), "hour", (byte) 11);
        setByteField(term53255, term53255.getClass(), "minute", (byte) 30);
        setByteField(term53255, term53255.getClass(), "second", (byte) 42);
        setIntField(term53255, term53255.getClass(), "nano", 733500025);
        setField(term53250, term53250.getClass(), "time", term53255);
        setField(term53249, term53249.getClass(), "playDate", term53250);
        setIntField(term53261, term53261.getClass(), "year", 2028);
        setShortField(term53261, term53261.getClass(), "month", (short) 12);
        setShortField(term53261, term53261.getClass(), "day", (short) 13);
        setField(term53260, term53260.getClass(), "date", term53261);
        setByteField(term53265, term53265.getClass(), "hour", (byte) 1);
        setByteField(term53265, term53265.getClass(), "minute", (byte) 15);
        setByteField(term53265, term53265.getClass(), "second", (byte) 43);
        setIntField(term53265, term53265.getClass(), "nano", 678972290);
        setField(term53260, term53260.getClass(), "time", term53265);
        setField(term53249, term53249.getClass(), "userPlayDate", term53260);
        setIntField(term53249, term53249.getClass(), "musicId", -1690283734);
        setIntField(term53249, term53249.getClass(), "level", -1620783951);
        setIntField(term53249, term53249.getClass(), "customId", 1400387811);
        setIntField(term53249, term53249.getClass(), "playedCustom1", 903826116);
        setIntField(term53249, term53249.getClass(), "playedCustom2", 641366348);
        setIntField(term53249, term53249.getClass(), "playedCustom3", -353276989);
        setIntField(term53249, term53249.getClass(), "track", -505563323);
        setIntField(term53249, term53249.getClass(), "score", -2087065864);
        setIntField(term53249, term53249.getClass(), "rank", -169812741);
        setIntField(term53249, term53249.getClass(), "maxCombo", -1015119737);
        setIntField(term53249, term53249.getClass(), "maxChain", 1479117665);
        setIntField(term53249, term53249.getClass(), "rateTap", 766065097);
        setIntField(term53249, term53249.getClass(), "rateHold", 1703658250);
        setIntField(term53249, term53249.getClass(), "rateSlide", -942615253);
        setIntField(term53249, term53249.getClass(), "rateAir", 1642227506);
        setIntField(term53249, term53249.getClass(), "rateFlick", -1930855861);
        setIntField(term53249, term53249.getClass(), "judgeGuilty", -59278290);
        setIntField(term53249, term53249.getClass(), "judgeAttack", 862799975);
        setIntField(term53249, term53249.getClass(), "judgeJustice", 785517219);
        setIntField(term53249, term53249.getClass(), "judgeCritical", -96163747);
        setIntField(term53249, term53249.getClass(), "playerRating", 1191473962);
        setBooleanField(term53249, term53249.getClass(), "isNewRecord", true);
        setBooleanField(term53249, term53249.getClass(), "isFullCombo", true);
        setIntField(term53249, term53249.getClass(), "fullChainKind", 110101710);
        setBooleanField(term53249, term53249.getClass(), "isAllJustice", false);
        setIntField(term53249, term53249.getClass(), "characterId", 1819101781);
        setIntField(term53249, term53249.getClass(), "skillId", -1430157795);
        setIntField(term53249, term53249.getClass(), "playKind", -1943692500);
        setBooleanField(term53249, term53249.getClass(), "isClear", false);
        setIntField(term53249, term53249.getClass(), "skillLevel", -108045978);
        setIntField(term53249, term53249.getClass(), "skillEffect", -1242612066);
        term53301 = new Integer(-1492896610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53301;
        callMethod(klass, "setLevel", argTypes, term53249, args);
    }

};


