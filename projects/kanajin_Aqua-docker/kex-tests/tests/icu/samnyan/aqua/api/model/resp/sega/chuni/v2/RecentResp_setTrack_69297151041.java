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

public class RecentResp_setTrack_69297151041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48349;
     Object term48401;

    public RecentResp_setTrack_69297151041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48349 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48350 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48351 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48355 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48365 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48351, term48351.getClass(), "year", 2029);
        setShortField(term48351, term48351.getClass(), "month", (short) 6);
        setShortField(term48351, term48351.getClass(), "day", (short) 25);
        setField(term48350, term48350.getClass(), "date", term48351);
        setByteField(term48355, term48355.getClass(), "hour", (byte) 14);
        setByteField(term48355, term48355.getClass(), "minute", (byte) 19);
        setByteField(term48355, term48355.getClass(), "second", (byte) 52);
        setIntField(term48355, term48355.getClass(), "nano", 250367769);
        setField(term48350, term48350.getClass(), "time", term48355);
        setField(term48349, term48349.getClass(), "playDate", term48350);
        setIntField(term48361, term48361.getClass(), "year", 2011);
        setShortField(term48361, term48361.getClass(), "month", (short) 11);
        setShortField(term48361, term48361.getClass(), "day", (short) 24);
        setField(term48360, term48360.getClass(), "date", term48361);
        setByteField(term48365, term48365.getClass(), "hour", (byte) 5);
        setByteField(term48365, term48365.getClass(), "minute", (byte) 45);
        setByteField(term48365, term48365.getClass(), "second", (byte) 11);
        setIntField(term48365, term48365.getClass(), "nano", 438339982);
        setField(term48360, term48360.getClass(), "time", term48365);
        setField(term48349, term48349.getClass(), "userPlayDate", term48360);
        setIntField(term48349, term48349.getClass(), "musicId", -1466811987);
        setIntField(term48349, term48349.getClass(), "level", 469445830);
        setIntField(term48349, term48349.getClass(), "customId", -1482217659);
        setIntField(term48349, term48349.getClass(), "playedCustom1", 1650302326);
        setIntField(term48349, term48349.getClass(), "playedCustom2", -123648353);
        setIntField(term48349, term48349.getClass(), "playedCustom3", -992215212);
        setIntField(term48349, term48349.getClass(), "track", 665125325);
        setIntField(term48349, term48349.getClass(), "score", -1180829225);
        setIntField(term48349, term48349.getClass(), "rank", -19961314);
        setIntField(term48349, term48349.getClass(), "maxCombo", 903876999);
        setIntField(term48349, term48349.getClass(), "maxChain", -20697214);
        setIntField(term48349, term48349.getClass(), "rateTap", -374105961);
        setIntField(term48349, term48349.getClass(), "rateHold", -198328789);
        setIntField(term48349, term48349.getClass(), "rateSlide", -158694757);
        setIntField(term48349, term48349.getClass(), "rateAir", -1855067606);
        setIntField(term48349, term48349.getClass(), "rateFlick", -433967657);
        setIntField(term48349, term48349.getClass(), "judgeGuilty", 1411661019);
        setIntField(term48349, term48349.getClass(), "judgeAttack", 1020857327);
        setIntField(term48349, term48349.getClass(), "judgeJustice", 587603547);
        setIntField(term48349, term48349.getClass(), "judgeCritical", -1049371381);
        setIntField(term48349, term48349.getClass(), "playerRating", -331201186);
        setBooleanField(term48349, term48349.getClass(), "isNewRecord", false);
        setBooleanField(term48349, term48349.getClass(), "isFullCombo", true);
        setIntField(term48349, term48349.getClass(), "fullChainKind", 406731696);
        setBooleanField(term48349, term48349.getClass(), "isAllJustice", false);
        setIntField(term48349, term48349.getClass(), "characterId", 690233885);
        setIntField(term48349, term48349.getClass(), "skillId", -1482271539);
        setIntField(term48349, term48349.getClass(), "playKind", 52686140);
        setBooleanField(term48349, term48349.getClass(), "isClear", false);
        setIntField(term48349, term48349.getClass(), "skillLevel", -352835881);
        setIntField(term48349, term48349.getClass(), "skillEffect", 2119021005);
        term48401 = new Integer(1361925101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48401;
        callMethod(klass, "setTrack", argTypes, term48349, args);
    }

};


