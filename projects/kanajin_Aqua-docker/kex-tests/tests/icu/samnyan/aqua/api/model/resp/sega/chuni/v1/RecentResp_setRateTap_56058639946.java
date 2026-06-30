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

public class RecentResp_setRateTap_56058639946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53789;
     Object term53841;

    public RecentResp_setRateTap_56058639946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53789 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53790 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53791 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53795 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53805 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53791, term53791.getClass(), "year", 2019);
        setShortField(term53791, term53791.getClass(), "month", (short) 7);
        setShortField(term53791, term53791.getClass(), "day", (short) 10);
        setField(term53790, term53790.getClass(), "date", term53791);
        setByteField(term53795, term53795.getClass(), "hour", (byte) 4);
        setByteField(term53795, term53795.getClass(), "minute", (byte) 6);
        setByteField(term53795, term53795.getClass(), "second", (byte) 6);
        setIntField(term53795, term53795.getClass(), "nano", 210255351);
        setField(term53790, term53790.getClass(), "time", term53795);
        setField(term53789, term53789.getClass(), "playDate", term53790);
        setIntField(term53801, term53801.getClass(), "year", 2027);
        setShortField(term53801, term53801.getClass(), "month", (short) 10);
        setShortField(term53801, term53801.getClass(), "day", (short) 8);
        setField(term53800, term53800.getClass(), "date", term53801);
        setByteField(term53805, term53805.getClass(), "hour", (byte) 8);
        setByteField(term53805, term53805.getClass(), "minute", (byte) 53);
        setByteField(term53805, term53805.getClass(), "second", (byte) 13);
        setIntField(term53805, term53805.getClass(), "nano", 464148999);
        setField(term53800, term53800.getClass(), "time", term53805);
        setField(term53789, term53789.getClass(), "userPlayDate", term53800);
        setIntField(term53789, term53789.getClass(), "musicId", -1307655183);
        setIntField(term53789, term53789.getClass(), "level", 1309934432);
        setIntField(term53789, term53789.getClass(), "customId", 909183017);
        setIntField(term53789, term53789.getClass(), "playedCustom1", -2115858923);
        setIntField(term53789, term53789.getClass(), "playedCustom2", 1709658376);
        setIntField(term53789, term53789.getClass(), "playedCustom3", -1235730396);
        setIntField(term53789, term53789.getClass(), "track", -366600678);
        setIntField(term53789, term53789.getClass(), "score", -1641994868);
        setIntField(term53789, term53789.getClass(), "rank", 1729072481);
        setIntField(term53789, term53789.getClass(), "maxCombo", -1281635786);
        setIntField(term53789, term53789.getClass(), "maxChain", 1768552438);
        setIntField(term53789, term53789.getClass(), "rateTap", -166990524);
        setIntField(term53789, term53789.getClass(), "rateHold", -1302306468);
        setIntField(term53789, term53789.getClass(), "rateSlide", -659361866);
        setIntField(term53789, term53789.getClass(), "rateAir", -2010825883);
        setIntField(term53789, term53789.getClass(), "rateFlick", 1230224947);
        setIntField(term53789, term53789.getClass(), "judgeGuilty", 739759836);
        setIntField(term53789, term53789.getClass(), "judgeAttack", -1233408249);
        setIntField(term53789, term53789.getClass(), "judgeJustice", 1252145496);
        setIntField(term53789, term53789.getClass(), "judgeCritical", -469940082);
        setIntField(term53789, term53789.getClass(), "playerRating", -821294367);
        setBooleanField(term53789, term53789.getClass(), "isNewRecord", false);
        setBooleanField(term53789, term53789.getClass(), "isFullCombo", false);
        setIntField(term53789, term53789.getClass(), "fullChainKind", -1260916319);
        setBooleanField(term53789, term53789.getClass(), "isAllJustice", false);
        setIntField(term53789, term53789.getClass(), "characterId", 740454987);
        setIntField(term53789, term53789.getClass(), "skillId", -2100331324);
        setIntField(term53789, term53789.getClass(), "playKind", 2062095733);
        setBooleanField(term53789, term53789.getClass(), "isClear", false);
        setIntField(term53789, term53789.getClass(), "skillLevel", -7331803);
        setIntField(term53789, term53789.getClass(), "skillEffect", 1725012686);
        term53841 = new Integer(-309653587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53841;
        callMethod(klass, "setRateTap", argTypes, term53789, args);
    }

};


