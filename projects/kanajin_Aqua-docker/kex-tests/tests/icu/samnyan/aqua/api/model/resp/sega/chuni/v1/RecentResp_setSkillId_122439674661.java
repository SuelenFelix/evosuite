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

public class RecentResp_setSkillId_122439674661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54599;
     Object term54651;

    public RecentResp_setSkillId_122439674661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54599 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54605 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54610 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54611 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54615 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54601, term54601.getClass(), "year", 2017);
        setShortField(term54601, term54601.getClass(), "month", (short) 6);
        setShortField(term54601, term54601.getClass(), "day", (short) 3);
        setField(term54600, term54600.getClass(), "date", term54601);
        setByteField(term54605, term54605.getClass(), "hour", (byte) 20);
        setByteField(term54605, term54605.getClass(), "minute", (byte) 14);
        setByteField(term54605, term54605.getClass(), "second", (byte) 10);
        setIntField(term54605, term54605.getClass(), "nano", 594163001);
        setField(term54600, term54600.getClass(), "time", term54605);
        setField(term54599, term54599.getClass(), "playDate", term54600);
        setIntField(term54611, term54611.getClass(), "year", 2014);
        setShortField(term54611, term54611.getClass(), "month", (short) 4);
        setShortField(term54611, term54611.getClass(), "day", (short) 9);
        setField(term54610, term54610.getClass(), "date", term54611);
        setByteField(term54615, term54615.getClass(), "hour", (byte) 0);
        setByteField(term54615, term54615.getClass(), "minute", (byte) 49);
        setByteField(term54615, term54615.getClass(), "second", (byte) 41);
        setIntField(term54615, term54615.getClass(), "nano", 379126669);
        setField(term54610, term54610.getClass(), "time", term54615);
        setField(term54599, term54599.getClass(), "userPlayDate", term54610);
        setIntField(term54599, term54599.getClass(), "musicId", 1618408809);
        setIntField(term54599, term54599.getClass(), "level", 1511487617);
        setIntField(term54599, term54599.getClass(), "customId", 338598562);
        setIntField(term54599, term54599.getClass(), "playedCustom1", 1528748257);
        setIntField(term54599, term54599.getClass(), "playedCustom2", 494744342);
        setIntField(term54599, term54599.getClass(), "playedCustom3", -1662933444);
        setIntField(term54599, term54599.getClass(), "track", 1648583497);
        setIntField(term54599, term54599.getClass(), "score", -132156499);
        setIntField(term54599, term54599.getClass(), "rank", -1222668512);
        setIntField(term54599, term54599.getClass(), "maxCombo", 1109294828);
        setIntField(term54599, term54599.getClass(), "maxChain", -596850824);
        setIntField(term54599, term54599.getClass(), "rateTap", 1619317687);
        setIntField(term54599, term54599.getClass(), "rateHold", -1335475299);
        setIntField(term54599, term54599.getClass(), "rateSlide", 1764067908);
        setIntField(term54599, term54599.getClass(), "rateAir", 1906236006);
        setIntField(term54599, term54599.getClass(), "rateFlick", -279175941);
        setIntField(term54599, term54599.getClass(), "judgeGuilty", -574044161);
        setIntField(term54599, term54599.getClass(), "judgeAttack", -101199395);
        setIntField(term54599, term54599.getClass(), "judgeJustice", 894150826);
        setIntField(term54599, term54599.getClass(), "judgeCritical", -261894603);
        setIntField(term54599, term54599.getClass(), "playerRating", 1163902450);
        setBooleanField(term54599, term54599.getClass(), "isNewRecord", true);
        setBooleanField(term54599, term54599.getClass(), "isFullCombo", true);
        setIntField(term54599, term54599.getClass(), "fullChainKind", 548941697);
        setBooleanField(term54599, term54599.getClass(), "isAllJustice", false);
        setIntField(term54599, term54599.getClass(), "characterId", 647865140);
        setIntField(term54599, term54599.getClass(), "skillId", 552764103);
        setIntField(term54599, term54599.getClass(), "playKind", -913811608);
        setBooleanField(term54599, term54599.getClass(), "isClear", false);
        setIntField(term54599, term54599.getClass(), "skillLevel", 895728550);
        setIntField(term54599, term54599.getClass(), "skillEffect", -419871359);
        term54651 = new Integer(812478175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54651;
        callMethod(klass, "setSkillId", argTypes, term54599, args);
    }

};


