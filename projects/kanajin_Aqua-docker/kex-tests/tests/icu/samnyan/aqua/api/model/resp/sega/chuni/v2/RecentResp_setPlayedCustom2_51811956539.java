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

public class RecentResp_setPlayedCustom2_51811956539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48241;
     Object term48293;

    public RecentResp_setPlayedCustom2_51811956539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48241 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48242 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48243 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48247 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48252 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48253 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48257 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48243, term48243.getClass(), "year", 2016);
        setShortField(term48243, term48243.getClass(), "month", (short) 5);
        setShortField(term48243, term48243.getClass(), "day", (short) 9);
        setField(term48242, term48242.getClass(), "date", term48243);
        setByteField(term48247, term48247.getClass(), "hour", (byte) 22);
        setByteField(term48247, term48247.getClass(), "minute", (byte) 50);
        setByteField(term48247, term48247.getClass(), "second", (byte) 14);
        setIntField(term48247, term48247.getClass(), "nano", 185148211);
        setField(term48242, term48242.getClass(), "time", term48247);
        setField(term48241, term48241.getClass(), "playDate", term48242);
        setIntField(term48253, term48253.getClass(), "year", 2014);
        setShortField(term48253, term48253.getClass(), "month", (short) 3);
        setShortField(term48253, term48253.getClass(), "day", (short) 7);
        setField(term48252, term48252.getClass(), "date", term48253);
        setByteField(term48257, term48257.getClass(), "hour", (byte) 2);
        setByteField(term48257, term48257.getClass(), "minute", (byte) 57);
        setByteField(term48257, term48257.getClass(), "second", (byte) 26);
        setIntField(term48257, term48257.getClass(), "nano", 493613741);
        setField(term48252, term48252.getClass(), "time", term48257);
        setField(term48241, term48241.getClass(), "userPlayDate", term48252);
        setIntField(term48241, term48241.getClass(), "musicId", 1577766413);
        setIntField(term48241, term48241.getClass(), "level", -1615367460);
        setIntField(term48241, term48241.getClass(), "customId", 1119103227);
        setIntField(term48241, term48241.getClass(), "playedCustom1", 1061904558);
        setIntField(term48241, term48241.getClass(), "playedCustom2", -390418218);
        setIntField(term48241, term48241.getClass(), "playedCustom3", 72302997);
        setIntField(term48241, term48241.getClass(), "track", 1619477832);
        setIntField(term48241, term48241.getClass(), "score", 611208497);
        setIntField(term48241, term48241.getClass(), "rank", 1184968868);
        setIntField(term48241, term48241.getClass(), "maxCombo", -882725204);
        setIntField(term48241, term48241.getClass(), "maxChain", 912627382);
        setIntField(term48241, term48241.getClass(), "rateTap", -761296444);
        setIntField(term48241, term48241.getClass(), "rateHold", -189523711);
        setIntField(term48241, term48241.getClass(), "rateSlide", 1697321852);
        setIntField(term48241, term48241.getClass(), "rateAir", 2107931912);
        setIntField(term48241, term48241.getClass(), "rateFlick", 198562318);
        setIntField(term48241, term48241.getClass(), "judgeGuilty", 1164105108);
        setIntField(term48241, term48241.getClass(), "judgeAttack", -972073241);
        setIntField(term48241, term48241.getClass(), "judgeJustice", 643112473);
        setIntField(term48241, term48241.getClass(), "judgeCritical", -1141492053);
        setIntField(term48241, term48241.getClass(), "playerRating", 1094053796);
        setBooleanField(term48241, term48241.getClass(), "isNewRecord", false);
        setBooleanField(term48241, term48241.getClass(), "isFullCombo", true);
        setIntField(term48241, term48241.getClass(), "fullChainKind", -2097088884);
        setBooleanField(term48241, term48241.getClass(), "isAllJustice", true);
        setIntField(term48241, term48241.getClass(), "characterId", -1793718020);
        setIntField(term48241, term48241.getClass(), "skillId", 1087957895);
        setIntField(term48241, term48241.getClass(), "playKind", -1347788838);
        setBooleanField(term48241, term48241.getClass(), "isClear", false);
        setIntField(term48241, term48241.getClass(), "skillLevel", -83628231);
        setIntField(term48241, term48241.getClass(), "skillEffect", 1337550691);
        term48293 = new Integer(2107385711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48293;
        callMethod(klass, "setPlayedCustom2", argTypes, term48241, args);
    }

};


