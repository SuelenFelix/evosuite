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

public class RecentResp_isAllJustice_43151175726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47537;

    public RecentResp_isAllJustice_43151175726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47537 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47538 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47539 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47543 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47548 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47549 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47553 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47539, term47539.getClass(), "year", 2027);
        setShortField(term47539, term47539.getClass(), "month", (short) 10);
        setShortField(term47539, term47539.getClass(), "day", (short) 12);
        setField(term47538, term47538.getClass(), "date", term47539);
        setByteField(term47543, term47543.getClass(), "hour", (byte) 23);
        setByteField(term47543, term47543.getClass(), "minute", (byte) 45);
        setByteField(term47543, term47543.getClass(), "second", (byte) 21);
        setIntField(term47543, term47543.getClass(), "nano", 866836785);
        setField(term47538, term47538.getClass(), "time", term47543);
        setField(term47537, term47537.getClass(), "playDate", term47538);
        setIntField(term47549, term47549.getClass(), "year", 2022);
        setShortField(term47549, term47549.getClass(), "month", (short) 5);
        setShortField(term47549, term47549.getClass(), "day", (short) 27);
        setField(term47548, term47548.getClass(), "date", term47549);
        setByteField(term47553, term47553.getClass(), "hour", (byte) 11);
        setByteField(term47553, term47553.getClass(), "minute", (byte) 48);
        setByteField(term47553, term47553.getClass(), "second", (byte) 27);
        setIntField(term47553, term47553.getClass(), "nano", 101970300);
        setField(term47548, term47548.getClass(), "time", term47553);
        setField(term47537, term47537.getClass(), "userPlayDate", term47548);
        setIntField(term47537, term47537.getClass(), "musicId", -535062491);
        setIntField(term47537, term47537.getClass(), "level", -147381920);
        setIntField(term47537, term47537.getClass(), "customId", -7568006);
        setIntField(term47537, term47537.getClass(), "playedCustom1", 1952367361);
        setIntField(term47537, term47537.getClass(), "playedCustom2", -715290594);
        setIntField(term47537, term47537.getClass(), "playedCustom3", -860371306);
        setIntField(term47537, term47537.getClass(), "track", -125626789);
        setIntField(term47537, term47537.getClass(), "score", -309827965);
        setIntField(term47537, term47537.getClass(), "rank", -1534471014);
        setIntField(term47537, term47537.getClass(), "maxCombo", -468720148);
        setIntField(term47537, term47537.getClass(), "maxChain", 164755425);
        setIntField(term47537, term47537.getClass(), "rateTap", 205469595);
        setIntField(term47537, term47537.getClass(), "rateHold", -638606539);
        setIntField(term47537, term47537.getClass(), "rateSlide", -172607907);
        setIntField(term47537, term47537.getClass(), "rateAir", 182656750);
        setIntField(term47537, term47537.getClass(), "rateFlick", -51407538);
        setIntField(term47537, term47537.getClass(), "judgeGuilty", -465783748);
        setIntField(term47537, term47537.getClass(), "judgeAttack", 1780832439);
        setIntField(term47537, term47537.getClass(), "judgeJustice", 1781593194);
        setIntField(term47537, term47537.getClass(), "judgeCritical", -929366947);
        setIntField(term47537, term47537.getClass(), "playerRating", -10579292);
        setBooleanField(term47537, term47537.getClass(), "isNewRecord", true);
        setBooleanField(term47537, term47537.getClass(), "isFullCombo", false);
        setIntField(term47537, term47537.getClass(), "fullChainKind", 2042788478);
        setBooleanField(term47537, term47537.getClass(), "isAllJustice", true);
        setIntField(term47537, term47537.getClass(), "characterId", -620591021);
        setIntField(term47537, term47537.getClass(), "skillId", -766656824);
        setIntField(term47537, term47537.getClass(), "playKind", 137514813);
        setBooleanField(term47537, term47537.getClass(), "isClear", false);
        setIntField(term47537, term47537.getClass(), "skillLevel", -590298353);
        setIntField(term47537, term47537.getClass(), "skillEffect", -917544425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllJustice", argTypes, term47537, args);
    }

};


