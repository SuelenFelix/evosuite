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

public class RecentResp_setPlayerRating_182152374455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54275;
     Object term54327;

    public RecentResp_setPlayerRating_182152374455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54275 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54281 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54286 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54287 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54291 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54277, term54277.getClass(), "year", 2019);
        setShortField(term54277, term54277.getClass(), "month", (short) 12);
        setShortField(term54277, term54277.getClass(), "day", (short) 8);
        setField(term54276, term54276.getClass(), "date", term54277);
        setByteField(term54281, term54281.getClass(), "hour", (byte) 20);
        setByteField(term54281, term54281.getClass(), "minute", (byte) 33);
        setByteField(term54281, term54281.getClass(), "second", (byte) 47);
        setIntField(term54281, term54281.getClass(), "nano", 329455724);
        setField(term54276, term54276.getClass(), "time", term54281);
        setField(term54275, term54275.getClass(), "playDate", term54276);
        setIntField(term54287, term54287.getClass(), "year", 2023);
        setShortField(term54287, term54287.getClass(), "month", (short) 9);
        setShortField(term54287, term54287.getClass(), "day", (short) 17);
        setField(term54286, term54286.getClass(), "date", term54287);
        setByteField(term54291, term54291.getClass(), "hour", (byte) 16);
        setByteField(term54291, term54291.getClass(), "minute", (byte) 1);
        setByteField(term54291, term54291.getClass(), "second", (byte) 2);
        setIntField(term54291, term54291.getClass(), "nano", 296390053);
        setField(term54286, term54286.getClass(), "time", term54291);
        setField(term54275, term54275.getClass(), "userPlayDate", term54286);
        setIntField(term54275, term54275.getClass(), "musicId", -1698447008);
        setIntField(term54275, term54275.getClass(), "level", 1429592368);
        setIntField(term54275, term54275.getClass(), "customId", -1997064536);
        setIntField(term54275, term54275.getClass(), "playedCustom1", 798438929);
        setIntField(term54275, term54275.getClass(), "playedCustom2", 795184090);
        setIntField(term54275, term54275.getClass(), "playedCustom3", 1181730734);
        setIntField(term54275, term54275.getClass(), "track", -668958857);
        setIntField(term54275, term54275.getClass(), "score", -427688960);
        setIntField(term54275, term54275.getClass(), "rank", 343387902);
        setIntField(term54275, term54275.getClass(), "maxCombo", 1492345954);
        setIntField(term54275, term54275.getClass(), "maxChain", 1891017572);
        setIntField(term54275, term54275.getClass(), "rateTap", -391361805);
        setIntField(term54275, term54275.getClass(), "rateHold", 1171290917);
        setIntField(term54275, term54275.getClass(), "rateSlide", 267258768);
        setIntField(term54275, term54275.getClass(), "rateAir", 1779008869);
        setIntField(term54275, term54275.getClass(), "rateFlick", -1058856035);
        setIntField(term54275, term54275.getClass(), "judgeGuilty", -91024448);
        setIntField(term54275, term54275.getClass(), "judgeAttack", -744517334);
        setIntField(term54275, term54275.getClass(), "judgeJustice", -855464783);
        setIntField(term54275, term54275.getClass(), "judgeCritical", 1496015170);
        setIntField(term54275, term54275.getClass(), "playerRating", 412507839);
        setBooleanField(term54275, term54275.getClass(), "isNewRecord", false);
        setBooleanField(term54275, term54275.getClass(), "isFullCombo", false);
        setIntField(term54275, term54275.getClass(), "fullChainKind", -143522206);
        setBooleanField(term54275, term54275.getClass(), "isAllJustice", false);
        setIntField(term54275, term54275.getClass(), "characterId", 70726858);
        setIntField(term54275, term54275.getClass(), "skillId", -1883665560);
        setIntField(term54275, term54275.getClass(), "playKind", -1304361419);
        setBooleanField(term54275, term54275.getClass(), "isClear", true);
        setIntField(term54275, term54275.getClass(), "skillLevel", -1253063552);
        setIntField(term54275, term54275.getClass(), "skillEffect", 11874750);
        term54327 = new Integer(-920088882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54327;
        callMethod(klass, "setPlayerRating", argTypes, term54275, args);
    }

};


