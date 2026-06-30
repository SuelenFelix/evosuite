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

public class RecentResp_getFullChainKind_186420217125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47485;

    public RecentResp_getFullChainKind_186420217125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47485 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47491 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47496 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47497 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47501 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47487, term47487.getClass(), "year", 2014);
        setShortField(term47487, term47487.getClass(), "month", (short) 6);
        setShortField(term47487, term47487.getClass(), "day", (short) 26);
        setField(term47486, term47486.getClass(), "date", term47487);
        setByteField(term47491, term47491.getClass(), "hour", (byte) 1);
        setByteField(term47491, term47491.getClass(), "minute", (byte) 48);
        setByteField(term47491, term47491.getClass(), "second", (byte) 51);
        setIntField(term47491, term47491.getClass(), "nano", 770527454);
        setField(term47486, term47486.getClass(), "time", term47491);
        setField(term47485, term47485.getClass(), "playDate", term47486);
        setIntField(term47497, term47497.getClass(), "year", 2019);
        setShortField(term47497, term47497.getClass(), "month", (short) 10);
        setShortField(term47497, term47497.getClass(), "day", (short) 21);
        setField(term47496, term47496.getClass(), "date", term47497);
        setByteField(term47501, term47501.getClass(), "hour", (byte) 23);
        setByteField(term47501, term47501.getClass(), "minute", (byte) 33);
        setByteField(term47501, term47501.getClass(), "second", (byte) 19);
        setIntField(term47501, term47501.getClass(), "nano", 72784109);
        setField(term47496, term47496.getClass(), "time", term47501);
        setField(term47485, term47485.getClass(), "userPlayDate", term47496);
        setIntField(term47485, term47485.getClass(), "musicId", -157273113);
        setIntField(term47485, term47485.getClass(), "level", 1497057438);
        setIntField(term47485, term47485.getClass(), "customId", 1526060255);
        setIntField(term47485, term47485.getClass(), "playedCustom1", -833785119);
        setIntField(term47485, term47485.getClass(), "playedCustom2", -1920705464);
        setIntField(term47485, term47485.getClass(), "playedCustom3", 428714196);
        setIntField(term47485, term47485.getClass(), "track", 934939315);
        setIntField(term47485, term47485.getClass(), "score", -935897776);
        setIntField(term47485, term47485.getClass(), "rank", 1370328728);
        setIntField(term47485, term47485.getClass(), "maxCombo", 1126005767);
        setIntField(term47485, term47485.getClass(), "maxChain", -1155333431);
        setIntField(term47485, term47485.getClass(), "rateTap", -2110210183);
        setIntField(term47485, term47485.getClass(), "rateHold", -687531774);
        setIntField(term47485, term47485.getClass(), "rateSlide", -1997574107);
        setIntField(term47485, term47485.getClass(), "rateAir", 748487022);
        setIntField(term47485, term47485.getClass(), "rateFlick", -706230330);
        setIntField(term47485, term47485.getClass(), "judgeGuilty", -926446006);
        setIntField(term47485, term47485.getClass(), "judgeAttack", 572417171);
        setIntField(term47485, term47485.getClass(), "judgeJustice", 46222099);
        setIntField(term47485, term47485.getClass(), "judgeCritical", 1985711069);
        setIntField(term47485, term47485.getClass(), "playerRating", -1497378582);
        setBooleanField(term47485, term47485.getClass(), "isNewRecord", true);
        setBooleanField(term47485, term47485.getClass(), "isFullCombo", true);
        setIntField(term47485, term47485.getClass(), "fullChainKind", -449740668);
        setBooleanField(term47485, term47485.getClass(), "isAllJustice", true);
        setIntField(term47485, term47485.getClass(), "characterId", 1283268105);
        setIntField(term47485, term47485.getClass(), "skillId", -220552939);
        setIntField(term47485, term47485.getClass(), "playKind", -444257155);
        setBooleanField(term47485, term47485.getClass(), "isClear", true);
        setIntField(term47485, term47485.getClass(), "skillLevel", -309536114);
        setIntField(term47485, term47485.getClass(), "skillEffect", 755500171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullChainKind", argTypes, term47485, args);
    }

};


