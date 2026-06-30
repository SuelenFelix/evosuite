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

public class RecentResp_setMaxChain_21012102445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48565;
     Object term48617;

    public RecentResp_setMaxChain_21012102445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48565 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48566 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48567 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48571 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48576 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48577 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48581 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48567, term48567.getClass(), "year", 2020);
        setShortField(term48567, term48567.getClass(), "month", (short) 3);
        setShortField(term48567, term48567.getClass(), "day", (short) 11);
        setField(term48566, term48566.getClass(), "date", term48567);
        setByteField(term48571, term48571.getClass(), "hour", (byte) 3);
        setByteField(term48571, term48571.getClass(), "minute", (byte) 24);
        setByteField(term48571, term48571.getClass(), "second", (byte) 7);
        setIntField(term48571, term48571.getClass(), "nano", 685767594);
        setField(term48566, term48566.getClass(), "time", term48571);
        setField(term48565, term48565.getClass(), "playDate", term48566);
        setIntField(term48577, term48577.getClass(), "year", 2014);
        setShortField(term48577, term48577.getClass(), "month", (short) 9);
        setShortField(term48577, term48577.getClass(), "day", (short) 30);
        setField(term48576, term48576.getClass(), "date", term48577);
        setByteField(term48581, term48581.getClass(), "hour", (byte) 6);
        setByteField(term48581, term48581.getClass(), "minute", (byte) 5);
        setByteField(term48581, term48581.getClass(), "second", (byte) 42);
        setIntField(term48581, term48581.getClass(), "nano", 798954614);
        setField(term48576, term48576.getClass(), "time", term48581);
        setField(term48565, term48565.getClass(), "userPlayDate", term48576);
        setIntField(term48565, term48565.getClass(), "musicId", -2004177132);
        setIntField(term48565, term48565.getClass(), "level", 1111078487);
        setIntField(term48565, term48565.getClass(), "customId", 1426568609);
        setIntField(term48565, term48565.getClass(), "playedCustom1", -1214249196);
        setIntField(term48565, term48565.getClass(), "playedCustom2", -500814419);
        setIntField(term48565, term48565.getClass(), "playedCustom3", -584375380);
        setIntField(term48565, term48565.getClass(), "track", 1906067765);
        setIntField(term48565, term48565.getClass(), "score", -1141978353);
        setIntField(term48565, term48565.getClass(), "rank", 1877297875);
        setIntField(term48565, term48565.getClass(), "maxCombo", -614739795);
        setIntField(term48565, term48565.getClass(), "maxChain", 1805124024);
        setIntField(term48565, term48565.getClass(), "rateTap", -1415507503);
        setIntField(term48565, term48565.getClass(), "rateHold", 424884647);
        setIntField(term48565, term48565.getClass(), "rateSlide", -881760055);
        setIntField(term48565, term48565.getClass(), "rateAir", 873700519);
        setIntField(term48565, term48565.getClass(), "rateFlick", 805310057);
        setIntField(term48565, term48565.getClass(), "judgeGuilty", -107339699);
        setIntField(term48565, term48565.getClass(), "judgeAttack", -58728001);
        setIntField(term48565, term48565.getClass(), "judgeJustice", 1013952192);
        setIntField(term48565, term48565.getClass(), "judgeCritical", -986675483);
        setIntField(term48565, term48565.getClass(), "playerRating", 337370099);
        setBooleanField(term48565, term48565.getClass(), "isNewRecord", false);
        setBooleanField(term48565, term48565.getClass(), "isFullCombo", false);
        setIntField(term48565, term48565.getClass(), "fullChainKind", -824145581);
        setBooleanField(term48565, term48565.getClass(), "isAllJustice", true);
        setIntField(term48565, term48565.getClass(), "characterId", -769314399);
        setIntField(term48565, term48565.getClass(), "skillId", -59737304);
        setIntField(term48565, term48565.getClass(), "playKind", -1878753007);
        setBooleanField(term48565, term48565.getClass(), "isClear", true);
        setIntField(term48565, term48565.getClass(), "skillLevel", -411059650);
        setIntField(term48565, term48565.getClass(), "skillEffect", 811517871);
        term48617 = new Integer(-74980095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48617;
        callMethod(klass, "setMaxChain", argTypes, term48565, args);
    }

};


