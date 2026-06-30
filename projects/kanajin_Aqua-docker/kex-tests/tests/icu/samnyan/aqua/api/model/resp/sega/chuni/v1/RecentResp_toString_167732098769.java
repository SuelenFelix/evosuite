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

public class RecentResp_toString_167732098769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55027;

    public RecentResp_toString_167732098769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55027 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term55028 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55029 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55033 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55038 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55039 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55043 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term55029, term55029.getClass(), "year", 2025);
        setShortField(term55029, term55029.getClass(), "month", (short) 3);
        setShortField(term55029, term55029.getClass(), "day", (short) 2);
        setField(term55028, term55028.getClass(), "date", term55029);
        setByteField(term55033, term55033.getClass(), "hour", (byte) 23);
        setByteField(term55033, term55033.getClass(), "minute", (byte) 28);
        setByteField(term55033, term55033.getClass(), "second", (byte) 42);
        setIntField(term55033, term55033.getClass(), "nano", 204636448);
        setField(term55028, term55028.getClass(), "time", term55033);
        setField(term55027, term55027.getClass(), "playDate", term55028);
        setIntField(term55039, term55039.getClass(), "year", 2023);
        setShortField(term55039, term55039.getClass(), "month", (short) 8);
        setShortField(term55039, term55039.getClass(), "day", (short) 30);
        setField(term55038, term55038.getClass(), "date", term55039);
        setByteField(term55043, term55043.getClass(), "hour", (byte) 9);
        setByteField(term55043, term55043.getClass(), "minute", (byte) 28);
        setByteField(term55043, term55043.getClass(), "second", (byte) 51);
        setIntField(term55043, term55043.getClass(), "nano", 285035808);
        setField(term55038, term55038.getClass(), "time", term55043);
        setField(term55027, term55027.getClass(), "userPlayDate", term55038);
        setIntField(term55027, term55027.getClass(), "musicId", -1891580978);
        setIntField(term55027, term55027.getClass(), "level", 1101260257);
        setIntField(term55027, term55027.getClass(), "customId", 1800400048);
        setIntField(term55027, term55027.getClass(), "playedCustom1", -1248348901);
        setIntField(term55027, term55027.getClass(), "playedCustom2", -808864128);
        setIntField(term55027, term55027.getClass(), "playedCustom3", -1813216452);
        setIntField(term55027, term55027.getClass(), "track", 180516410);
        setIntField(term55027, term55027.getClass(), "score", 606206987);
        setIntField(term55027, term55027.getClass(), "rank", -534930572);
        setIntField(term55027, term55027.getClass(), "maxCombo", -748140133);
        setIntField(term55027, term55027.getClass(), "maxChain", 795993216);
        setIntField(term55027, term55027.getClass(), "rateTap", 1583601182);
        setIntField(term55027, term55027.getClass(), "rateHold", -1372040155);
        setIntField(term55027, term55027.getClass(), "rateSlide", 2091263178);
        setIntField(term55027, term55027.getClass(), "rateAir", -1726739412);
        setIntField(term55027, term55027.getClass(), "rateFlick", -910985376);
        setIntField(term55027, term55027.getClass(), "judgeGuilty", 1260410174);
        setIntField(term55027, term55027.getClass(), "judgeAttack", -1557704101);
        setIntField(term55027, term55027.getClass(), "judgeJustice", -764615686);
        setIntField(term55027, term55027.getClass(), "judgeCritical", -762034217);
        setIntField(term55027, term55027.getClass(), "playerRating", 481600552);
        setBooleanField(term55027, term55027.getClass(), "isNewRecord", false);
        setBooleanField(term55027, term55027.getClass(), "isFullCombo", true);
        setIntField(term55027, term55027.getClass(), "fullChainKind", 1415008678);
        setBooleanField(term55027, term55027.getClass(), "isAllJustice", false);
        setIntField(term55027, term55027.getClass(), "characterId", -768389527);
        setIntField(term55027, term55027.getClass(), "skillId", 88636719);
        setIntField(term55027, term55027.getClass(), "playKind", -18572829);
        setBooleanField(term55027, term55027.getClass(), "isClear", true);
        setIntField(term55027, term55027.getClass(), "skillLevel", 1220825104);
        setIntField(term55027, term55027.getClass(), "skillEffect", -401847632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term55027, args);
    }

};


