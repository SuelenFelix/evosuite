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
import java.lang.Boolean;

public class RecentResp_setNewRecord_3463524756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54329;
     Object term54381;

    public RecentResp_setNewRecord_3463524756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54329 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54335 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54340 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54341 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54345 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54331, term54331.getClass(), "year", 2022);
        setShortField(term54331, term54331.getClass(), "month", (short) 10);
        setShortField(term54331, term54331.getClass(), "day", (short) 27);
        setField(term54330, term54330.getClass(), "date", term54331);
        setByteField(term54335, term54335.getClass(), "hour", (byte) 11);
        setByteField(term54335, term54335.getClass(), "minute", (byte) 11);
        setByteField(term54335, term54335.getClass(), "second", (byte) 36);
        setIntField(term54335, term54335.getClass(), "nano", 239549048);
        setField(term54330, term54330.getClass(), "time", term54335);
        setField(term54329, term54329.getClass(), "playDate", term54330);
        setIntField(term54341, term54341.getClass(), "year", 2015);
        setShortField(term54341, term54341.getClass(), "month", (short) 1);
        setShortField(term54341, term54341.getClass(), "day", (short) 22);
        setField(term54340, term54340.getClass(), "date", term54341);
        setByteField(term54345, term54345.getClass(), "hour", (byte) 4);
        setByteField(term54345, term54345.getClass(), "minute", (byte) 37);
        setByteField(term54345, term54345.getClass(), "second", (byte) 36);
        setIntField(term54345, term54345.getClass(), "nano", 685453197);
        setField(term54340, term54340.getClass(), "time", term54345);
        setField(term54329, term54329.getClass(), "userPlayDate", term54340);
        setIntField(term54329, term54329.getClass(), "musicId", -1963888580);
        setIntField(term54329, term54329.getClass(), "level", 885969140);
        setIntField(term54329, term54329.getClass(), "customId", -573115224);
        setIntField(term54329, term54329.getClass(), "playedCustom1", 716083613);
        setIntField(term54329, term54329.getClass(), "playedCustom2", 236114197);
        setIntField(term54329, term54329.getClass(), "playedCustom3", -1633292626);
        setIntField(term54329, term54329.getClass(), "track", 689769597);
        setIntField(term54329, term54329.getClass(), "score", -1219602723);
        setIntField(term54329, term54329.getClass(), "rank", 1668201364);
        setIntField(term54329, term54329.getClass(), "maxCombo", -548343635);
        setIntField(term54329, term54329.getClass(), "maxChain", -590979324);
        setIntField(term54329, term54329.getClass(), "rateTap", -1745427158);
        setIntField(term54329, term54329.getClass(), "rateHold", 1516032954);
        setIntField(term54329, term54329.getClass(), "rateSlide", -1945165354);
        setIntField(term54329, term54329.getClass(), "rateAir", 14341670);
        setIntField(term54329, term54329.getClass(), "rateFlick", -144022361);
        setIntField(term54329, term54329.getClass(), "judgeGuilty", -1419212893);
        setIntField(term54329, term54329.getClass(), "judgeAttack", -457189882);
        setIntField(term54329, term54329.getClass(), "judgeJustice", -1227023001);
        setIntField(term54329, term54329.getClass(), "judgeCritical", -622827471);
        setIntField(term54329, term54329.getClass(), "playerRating", -1759579486);
        setBooleanField(term54329, term54329.getClass(), "isNewRecord", false);
        setBooleanField(term54329, term54329.getClass(), "isFullCombo", true);
        setIntField(term54329, term54329.getClass(), "fullChainKind", 147748970);
        setBooleanField(term54329, term54329.getClass(), "isAllJustice", true);
        setIntField(term54329, term54329.getClass(), "characterId", -459525196);
        setIntField(term54329, term54329.getClass(), "skillId", 2129073623);
        setIntField(term54329, term54329.getClass(), "playKind", -1623896406);
        setBooleanField(term54329, term54329.getClass(), "isClear", false);
        setIntField(term54329, term54329.getClass(), "skillLevel", -1767855347);
        setIntField(term54329, term54329.getClass(), "skillEffect", 2061882718);
        term54381 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term54381;
        callMethod(klass, "setNewRecord", argTypes, term54329, args);
    }

};


