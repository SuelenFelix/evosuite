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

public class RecentResp_getTrack_16615632968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46601;

    public RecentResp_getTrack_16615632968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46601 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46602 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46603 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46607 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46617 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46603, term46603.getClass(), "year", 2026);
        setShortField(term46603, term46603.getClass(), "month", (short) 8);
        setShortField(term46603, term46603.getClass(), "day", (short) 6);
        setField(term46602, term46602.getClass(), "date", term46603);
        setByteField(term46607, term46607.getClass(), "hour", (byte) 17);
        setByteField(term46607, term46607.getClass(), "minute", (byte) 50);
        setByteField(term46607, term46607.getClass(), "second", (byte) 27);
        setIntField(term46607, term46607.getClass(), "nano", 8961627);
        setField(term46602, term46602.getClass(), "time", term46607);
        setField(term46601, term46601.getClass(), "playDate", term46602);
        setIntField(term46613, term46613.getClass(), "year", 2018);
        setShortField(term46613, term46613.getClass(), "month", (short) 7);
        setShortField(term46613, term46613.getClass(), "day", (short) 30);
        setField(term46612, term46612.getClass(), "date", term46613);
        setByteField(term46617, term46617.getClass(), "hour", (byte) 22);
        setByteField(term46617, term46617.getClass(), "minute", (byte) 55);
        setByteField(term46617, term46617.getClass(), "second", (byte) 39);
        setIntField(term46617, term46617.getClass(), "nano", 564474532);
        setField(term46612, term46612.getClass(), "time", term46617);
        setField(term46601, term46601.getClass(), "userPlayDate", term46612);
        setIntField(term46601, term46601.getClass(), "musicId", 2096762388);
        setIntField(term46601, term46601.getClass(), "level", -1646872343);
        setIntField(term46601, term46601.getClass(), "customId", -140841633);
        setIntField(term46601, term46601.getClass(), "playedCustom1", 1970986976);
        setIntField(term46601, term46601.getClass(), "playedCustom2", 530909877);
        setIntField(term46601, term46601.getClass(), "playedCustom3", -123945804);
        setIntField(term46601, term46601.getClass(), "track", 2133669766);
        setIntField(term46601, term46601.getClass(), "score", -1423215684);
        setIntField(term46601, term46601.getClass(), "rank", -1096652631);
        setIntField(term46601, term46601.getClass(), "maxCombo", 1116810901);
        setIntField(term46601, term46601.getClass(), "maxChain", 1944430959);
        setIntField(term46601, term46601.getClass(), "rateTap", 98801346);
        setIntField(term46601, term46601.getClass(), "rateHold", 2133290622);
        setIntField(term46601, term46601.getClass(), "rateSlide", -164869996);
        setIntField(term46601, term46601.getClass(), "rateAir", 1415001538);
        setIntField(term46601, term46601.getClass(), "rateFlick", 1738077695);
        setIntField(term46601, term46601.getClass(), "judgeGuilty", -1351117314);
        setIntField(term46601, term46601.getClass(), "judgeAttack", 1693588815);
        setIntField(term46601, term46601.getClass(), "judgeJustice", 1272985537);
        setIntField(term46601, term46601.getClass(), "judgeCritical", -785719854);
        setIntField(term46601, term46601.getClass(), "playerRating", -1542292796);
        setBooleanField(term46601, term46601.getClass(), "isNewRecord", false);
        setBooleanField(term46601, term46601.getClass(), "isFullCombo", true);
        setIntField(term46601, term46601.getClass(), "fullChainKind", 1892295932);
        setBooleanField(term46601, term46601.getClass(), "isAllJustice", false);
        setIntField(term46601, term46601.getClass(), "characterId", 1028855301);
        setIntField(term46601, term46601.getClass(), "skillId", -2075314038);
        setIntField(term46601, term46601.getClass(), "playKind", 1085906450);
        setBooleanField(term46601, term46601.getClass(), "isClear", false);
        setIntField(term46601, term46601.getClass(), "skillLevel", 1892947629);
        setIntField(term46601, term46601.getClass(), "skillEffect", -1350968212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrack", argTypes, term46601, args);
    }

};


