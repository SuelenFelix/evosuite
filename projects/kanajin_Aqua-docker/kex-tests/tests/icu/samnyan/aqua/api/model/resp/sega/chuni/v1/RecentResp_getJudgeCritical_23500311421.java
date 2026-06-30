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

public class RecentResp_getJudgeCritical_23500311421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52447;

    public RecentResp_getJudgeCritical_23500311421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52447 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52448 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52449 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52453 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52463 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52449, term52449.getClass(), "year", 2013);
        setShortField(term52449, term52449.getClass(), "month", (short) 1);
        setShortField(term52449, term52449.getClass(), "day", (short) 25);
        setField(term52448, term52448.getClass(), "date", term52449);
        setByteField(term52453, term52453.getClass(), "hour", (byte) 11);
        setByteField(term52453, term52453.getClass(), "minute", (byte) 5);
        setByteField(term52453, term52453.getClass(), "second", (byte) 35);
        setIntField(term52453, term52453.getClass(), "nano", 914812579);
        setField(term52448, term52448.getClass(), "time", term52453);
        setField(term52447, term52447.getClass(), "playDate", term52448);
        setIntField(term52459, term52459.getClass(), "year", 2020);
        setShortField(term52459, term52459.getClass(), "month", (short) 11);
        setShortField(term52459, term52459.getClass(), "day", (short) 6);
        setField(term52458, term52458.getClass(), "date", term52459);
        setByteField(term52463, term52463.getClass(), "hour", (byte) 20);
        setByteField(term52463, term52463.getClass(), "minute", (byte) 26);
        setByteField(term52463, term52463.getClass(), "second", (byte) 26);
        setIntField(term52463, term52463.getClass(), "nano", 961202696);
        setField(term52458, term52458.getClass(), "time", term52463);
        setField(term52447, term52447.getClass(), "userPlayDate", term52458);
        setIntField(term52447, term52447.getClass(), "musicId", -123648353);
        setIntField(term52447, term52447.getClass(), "level", -992215212);
        setIntField(term52447, term52447.getClass(), "customId", 665125325);
        setIntField(term52447, term52447.getClass(), "playedCustom1", -1180829225);
        setIntField(term52447, term52447.getClass(), "playedCustom2", -19961314);
        setIntField(term52447, term52447.getClass(), "playedCustom3", 903876999);
        setIntField(term52447, term52447.getClass(), "track", -20697214);
        setIntField(term52447, term52447.getClass(), "score", -374105961);
        setIntField(term52447, term52447.getClass(), "rank", -198328789);
        setIntField(term52447, term52447.getClass(), "maxCombo", -158694757);
        setIntField(term52447, term52447.getClass(), "maxChain", -1855067606);
        setIntField(term52447, term52447.getClass(), "rateTap", -433967657);
        setIntField(term52447, term52447.getClass(), "rateHold", 1411661019);
        setIntField(term52447, term52447.getClass(), "rateSlide", 1020857327);
        setIntField(term52447, term52447.getClass(), "rateAir", 587603547);
        setIntField(term52447, term52447.getClass(), "rateFlick", -1049371381);
        setIntField(term52447, term52447.getClass(), "judgeGuilty", -331201186);
        setIntField(term52447, term52447.getClass(), "judgeAttack", 406731696);
        setIntField(term52447, term52447.getClass(), "judgeJustice", 690233885);
        setIntField(term52447, term52447.getClass(), "judgeCritical", -1482271539);
        setIntField(term52447, term52447.getClass(), "playerRating", 52686140);
        setBooleanField(term52447, term52447.getClass(), "isNewRecord", false);
        setBooleanField(term52447, term52447.getClass(), "isFullCombo", false);
        setIntField(term52447, term52447.getClass(), "fullChainKind", -352835881);
        setBooleanField(term52447, term52447.getClass(), "isAllJustice", true);
        setIntField(term52447, term52447.getClass(), "characterId", 2119021005);
        setIntField(term52447, term52447.getClass(), "skillId", 1361925101);
        setIntField(term52447, term52447.getClass(), "playKind", -1702583840);
        setBooleanField(term52447, term52447.getClass(), "isClear", true);
        setIntField(term52447, term52447.getClass(), "skillLevel", -1496594860);
        setIntField(term52447, term52447.getClass(), "skillEffect", -1754638525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeCritical", argTypes, term52447, args);
    }

};


