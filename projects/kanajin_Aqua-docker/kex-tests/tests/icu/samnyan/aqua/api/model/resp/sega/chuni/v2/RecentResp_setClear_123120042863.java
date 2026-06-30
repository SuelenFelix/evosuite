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

public class RecentResp_setClear_123120042863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49537;
     Object term49589;

    public RecentResp_setClear_123120042863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49537 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49538 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49539 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49543 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49548 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49549 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49553 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49539, term49539.getClass(), "year", 2013);
        setShortField(term49539, term49539.getClass(), "month", (short) 12);
        setShortField(term49539, term49539.getClass(), "day", (short) 7);
        setField(term49538, term49538.getClass(), "date", term49539);
        setByteField(term49543, term49543.getClass(), "hour", (byte) 15);
        setByteField(term49543, term49543.getClass(), "minute", (byte) 56);
        setByteField(term49543, term49543.getClass(), "second", (byte) 2);
        setIntField(term49543, term49543.getClass(), "nano", 550722676);
        setField(term49538, term49538.getClass(), "time", term49543);
        setField(term49537, term49537.getClass(), "playDate", term49538);
        setIntField(term49549, term49549.getClass(), "year", 2014);
        setShortField(term49549, term49549.getClass(), "month", (short) 7);
        setShortField(term49549, term49549.getClass(), "day", (short) 18);
        setField(term49548, term49548.getClass(), "date", term49549);
        setByteField(term49553, term49553.getClass(), "hour", (byte) 19);
        setByteField(term49553, term49553.getClass(), "minute", (byte) 34);
        setByteField(term49553, term49553.getClass(), "second", (byte) 55);
        setIntField(term49553, term49553.getClass(), "nano", 945082868);
        setField(term49548, term49548.getClass(), "time", term49553);
        setField(term49537, term49537.getClass(), "userPlayDate", term49548);
        setIntField(term49537, term49537.getClass(), "musicId", -1370999464);
        setIntField(term49537, term49537.getClass(), "level", -409231949);
        setIntField(term49537, term49537.getClass(), "customId", -666074929);
        setIntField(term49537, term49537.getClass(), "playedCustom1", 1263172764);
        setIntField(term49537, term49537.getClass(), "playedCustom2", 294155442);
        setIntField(term49537, term49537.getClass(), "playedCustom3", -790860079);
        setIntField(term49537, term49537.getClass(), "track", 52653332);
        setIntField(term49537, term49537.getClass(), "score", 605369567);
        setIntField(term49537, term49537.getClass(), "rank", 662969700);
        setIntField(term49537, term49537.getClass(), "maxCombo", -907171757);
        setIntField(term49537, term49537.getClass(), "maxChain", 1041315057);
        setIntField(term49537, term49537.getClass(), "rateTap", 5602462);
        setIntField(term49537, term49537.getClass(), "rateHold", 1573768776);
        setIntField(term49537, term49537.getClass(), "rateSlide", 1525686645);
        setIntField(term49537, term49537.getClass(), "rateAir", -538376054);
        setIntField(term49537, term49537.getClass(), "rateFlick", -159290084);
        setIntField(term49537, term49537.getClass(), "judgeGuilty", -1181936403);
        setIntField(term49537, term49537.getClass(), "judgeAttack", 597843779);
        setIntField(term49537, term49537.getClass(), "judgeJustice", -920715260);
        setIntField(term49537, term49537.getClass(), "judgeCritical", -111304359);
        setIntField(term49537, term49537.getClass(), "playerRating", -1359946362);
        setBooleanField(term49537, term49537.getClass(), "isNewRecord", false);
        setBooleanField(term49537, term49537.getClass(), "isFullCombo", true);
        setIntField(term49537, term49537.getClass(), "fullChainKind", 882866050);
        setBooleanField(term49537, term49537.getClass(), "isAllJustice", false);
        setIntField(term49537, term49537.getClass(), "characterId", -979923296);
        setIntField(term49537, term49537.getClass(), "skillId", 1294282133);
        setIntField(term49537, term49537.getClass(), "playKind", -1857786332);
        setBooleanField(term49537, term49537.getClass(), "isClear", false);
        setIntField(term49537, term49537.getClass(), "skillLevel", 1307491791);
        setIntField(term49537, term49537.getClass(), "skillEffect", 445813516);
        term49589 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term49589;
        callMethod(klass, "setClear", argTypes, term49537, args);
    }

};


