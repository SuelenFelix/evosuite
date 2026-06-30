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

public class RecentResp_isClear_196909713430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47745;

    public RecentResp_isClear_196909713430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47745 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47751 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47756 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47757 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47761 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47747, term47747.getClass(), "year", 2027);
        setShortField(term47747, term47747.getClass(), "month", (short) 1);
        setShortField(term47747, term47747.getClass(), "day", (short) 10);
        setField(term47746, term47746.getClass(), "date", term47747);
        setByteField(term47751, term47751.getClass(), "hour", (byte) 8);
        setByteField(term47751, term47751.getClass(), "minute", (byte) 34);
        setByteField(term47751, term47751.getClass(), "second", (byte) 28);
        setIntField(term47751, term47751.getClass(), "nano", 703673031);
        setField(term47746, term47746.getClass(), "time", term47751);
        setField(term47745, term47745.getClass(), "playDate", term47746);
        setIntField(term47757, term47757.getClass(), "year", 2014);
        setShortField(term47757, term47757.getClass(), "month", (short) 5);
        setShortField(term47757, term47757.getClass(), "day", (short) 30);
        setField(term47756, term47756.getClass(), "date", term47757);
        setByteField(term47761, term47761.getClass(), "hour", (byte) 10);
        setByteField(term47761, term47761.getClass(), "minute", (byte) 34);
        setByteField(term47761, term47761.getClass(), "second", (byte) 17);
        setIntField(term47761, term47761.getClass(), "nano", 917654429);
        setField(term47756, term47756.getClass(), "time", term47761);
        setField(term47745, term47745.getClass(), "userPlayDate", term47756);
        setIntField(term47745, term47745.getClass(), "musicId", 419332770);
        setIntField(term47745, term47745.getClass(), "level", 1742733401);
        setIntField(term47745, term47745.getClass(), "customId", 1634939612);
        setIntField(term47745, term47745.getClass(), "playedCustom1", -590256406);
        setIntField(term47745, term47745.getClass(), "playedCustom2", -1319797966);
        setIntField(term47745, term47745.getClass(), "playedCustom3", -388682282);
        setIntField(term47745, term47745.getClass(), "track", 2028706829);
        setIntField(term47745, term47745.getClass(), "score", -656080518);
        setIntField(term47745, term47745.getClass(), "rank", 1769230265);
        setIntField(term47745, term47745.getClass(), "maxCombo", -1946503216);
        setIntField(term47745, term47745.getClass(), "maxChain", 467573222);
        setIntField(term47745, term47745.getClass(), "rateTap", -197212451);
        setIntField(term47745, term47745.getClass(), "rateHold", 213194885);
        setIntField(term47745, term47745.getClass(), "rateSlide", 364063308);
        setIntField(term47745, term47745.getClass(), "rateAir", -787041664);
        setIntField(term47745, term47745.getClass(), "rateFlick", 2141179437);
        setIntField(term47745, term47745.getClass(), "judgeGuilty", -826972140);
        setIntField(term47745, term47745.getClass(), "judgeAttack", 737250028);
        setIntField(term47745, term47745.getClass(), "judgeJustice", -1870044711);
        setIntField(term47745, term47745.getClass(), "judgeCritical", -719110417);
        setIntField(term47745, term47745.getClass(), "playerRating", -1866172730);
        setBooleanField(term47745, term47745.getClass(), "isNewRecord", true);
        setBooleanField(term47745, term47745.getClass(), "isFullCombo", true);
        setIntField(term47745, term47745.getClass(), "fullChainKind", 1129688211);
        setBooleanField(term47745, term47745.getClass(), "isAllJustice", false);
        setIntField(term47745, term47745.getClass(), "characterId", 2126253731);
        setIntField(term47745, term47745.getClass(), "skillId", 1637943121);
        setIntField(term47745, term47745.getClass(), "playKind", -1889806893);
        setBooleanField(term47745, term47745.getClass(), "isClear", true);
        setIntField(term47745, term47745.getClass(), "skillLevel", 2101844302);
        setIntField(term47745, term47745.getClass(), "skillEffect", 1975711832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClear", argTypes, term47745, args);
    }

};


