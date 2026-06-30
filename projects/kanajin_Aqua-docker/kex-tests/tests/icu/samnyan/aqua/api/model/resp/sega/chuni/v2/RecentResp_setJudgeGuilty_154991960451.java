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

public class RecentResp_setJudgeGuilty_154991960451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48889;
     Object term48941;

    public RecentResp_setJudgeGuilty_154991960451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48889 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48890 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48891 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48895 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48900 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48901 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48905 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48891, term48891.getClass(), "year", 2015);
        setShortField(term48891, term48891.getClass(), "month", (short) 10);
        setShortField(term48891, term48891.getClass(), "day", (short) 4);
        setField(term48890, term48890.getClass(), "date", term48891);
        setByteField(term48895, term48895.getClass(), "hour", (byte) 4);
        setByteField(term48895, term48895.getClass(), "minute", (byte) 28);
        setByteField(term48895, term48895.getClass(), "second", (byte) 5);
        setIntField(term48895, term48895.getClass(), "nano", 457950228);
        setField(term48890, term48890.getClass(), "time", term48895);
        setField(term48889, term48889.getClass(), "playDate", term48890);
        setIntField(term48901, term48901.getClass(), "year", 2017);
        setShortField(term48901, term48901.getClass(), "month", (short) 2);
        setShortField(term48901, term48901.getClass(), "day", (short) 8);
        setField(term48900, term48900.getClass(), "date", term48901);
        setByteField(term48905, term48905.getClass(), "hour", (byte) 12);
        setByteField(term48905, term48905.getClass(), "minute", (byte) 5);
        setByteField(term48905, term48905.getClass(), "second", (byte) 46);
        setIntField(term48905, term48905.getClass(), "nano", 847487783);
        setField(term48900, term48900.getClass(), "time", term48905);
        setField(term48889, term48889.getClass(), "userPlayDate", term48900);
        setIntField(term48889, term48889.getClass(), "musicId", -414324261);
        setIntField(term48889, term48889.getClass(), "level", -1729893211);
        setIntField(term48889, term48889.getClass(), "customId", -1648760670);
        setIntField(term48889, term48889.getClass(), "playedCustom1", 590703291);
        setIntField(term48889, term48889.getClass(), "playedCustom2", -2033199492);
        setIntField(term48889, term48889.getClass(), "playedCustom3", 350096397);
        setIntField(term48889, term48889.getClass(), "track", -325295536);
        setIntField(term48889, term48889.getClass(), "score", -411068820);
        setIntField(term48889, term48889.getClass(), "rank", -608484309);
        setIntField(term48889, term48889.getClass(), "maxCombo", -396456847);
        setIntField(term48889, term48889.getClass(), "maxChain", 1826615515);
        setIntField(term48889, term48889.getClass(), "rateTap", 1129458600);
        setIntField(term48889, term48889.getClass(), "rateHold", -1559804880);
        setIntField(term48889, term48889.getClass(), "rateSlide", 420300457);
        setIntField(term48889, term48889.getClass(), "rateAir", 804843661);
        setIntField(term48889, term48889.getClass(), "rateFlick", 1968236726);
        setIntField(term48889, term48889.getClass(), "judgeGuilty", -1080686915);
        setIntField(term48889, term48889.getClass(), "judgeAttack", -1329496162);
        setIntField(term48889, term48889.getClass(), "judgeJustice", -1181178091);
        setIntField(term48889, term48889.getClass(), "judgeCritical", 797166053);
        setIntField(term48889, term48889.getClass(), "playerRating", -1145342603);
        setBooleanField(term48889, term48889.getClass(), "isNewRecord", true);
        setBooleanField(term48889, term48889.getClass(), "isFullCombo", true);
        setIntField(term48889, term48889.getClass(), "fullChainKind", -1135326582);
        setBooleanField(term48889, term48889.getClass(), "isAllJustice", false);
        setIntField(term48889, term48889.getClass(), "characterId", 594267051);
        setIntField(term48889, term48889.getClass(), "skillId", -1225303838);
        setIntField(term48889, term48889.getClass(), "playKind", 1093956146);
        setBooleanField(term48889, term48889.getClass(), "isClear", true);
        setIntField(term48889, term48889.getClass(), "skillLevel", 1459247713);
        setIntField(term48889, term48889.getClass(), "skillEffect", 1400302967);
        term48941 = new Integer(692198729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48941;
        callMethod(klass, "setJudgeGuilty", argTypes, term48889, args);
    }

};


