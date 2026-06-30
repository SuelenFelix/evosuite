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

public class RecentResp_setRateFlick_61274426550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54005;
     Object term54057;

    public RecentResp_setRateFlick_61274426550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54005 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54006 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54011 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54016 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54017 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54021 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54007, term54007.getClass(), "year", 2025);
        setShortField(term54007, term54007.getClass(), "month", (short) 12);
        setShortField(term54007, term54007.getClass(), "day", (short) 27);
        setField(term54006, term54006.getClass(), "date", term54007);
        setByteField(term54011, term54011.getClass(), "hour", (byte) 18);
        setByteField(term54011, term54011.getClass(), "minute", (byte) 0);
        setByteField(term54011, term54011.getClass(), "second", (byte) 16);
        setIntField(term54011, term54011.getClass(), "nano", 96884626);
        setField(term54006, term54006.getClass(), "time", term54011);
        setField(term54005, term54005.getClass(), "playDate", term54006);
        setIntField(term54017, term54017.getClass(), "year", 2021);
        setShortField(term54017, term54017.getClass(), "month", (short) 6);
        setShortField(term54017, term54017.getClass(), "day", (short) 18);
        setField(term54016, term54016.getClass(), "date", term54017);
        setByteField(term54021, term54021.getClass(), "hour", (byte) 15);
        setByteField(term54021, term54021.getClass(), "minute", (byte) 12);
        setByteField(term54021, term54021.getClass(), "second", (byte) 15);
        setIntField(term54021, term54021.getClass(), "nano", 440716397);
        setField(term54016, term54016.getClass(), "time", term54021);
        setField(term54005, term54005.getClass(), "userPlayDate", term54016);
        setIntField(term54005, term54005.getClass(), "musicId", -1428994415);
        setIntField(term54005, term54005.getClass(), "level", -1086104799);
        setIntField(term54005, term54005.getClass(), "customId", 1670332444);
        setIntField(term54005, term54005.getClass(), "playedCustom1", -1903805864);
        setIntField(term54005, term54005.getClass(), "playedCustom2", 751123733);
        setIntField(term54005, term54005.getClass(), "playedCustom3", -2099677081);
        setIntField(term54005, term54005.getClass(), "track", -1911852008);
        setIntField(term54005, term54005.getClass(), "score", -126937505);
        setIntField(term54005, term54005.getClass(), "rank", 1600311664);
        setIntField(term54005, term54005.getClass(), "maxCombo", 1505616296);
        setIntField(term54005, term54005.getClass(), "maxChain", 453453842);
        setIntField(term54005, term54005.getClass(), "rateTap", 591356101);
        setIntField(term54005, term54005.getClass(), "rateHold", 1387849981);
        setIntField(term54005, term54005.getClass(), "rateSlide", 518095920);
        setIntField(term54005, term54005.getClass(), "rateAir", 1333750018);
        setIntField(term54005, term54005.getClass(), "rateFlick", 1824319777);
        setIntField(term54005, term54005.getClass(), "judgeGuilty", -942865663);
        setIntField(term54005, term54005.getClass(), "judgeAttack", 612230460);
        setIntField(term54005, term54005.getClass(), "judgeJustice", -87837417);
        setIntField(term54005, term54005.getClass(), "judgeCritical", -1864680068);
        setIntField(term54005, term54005.getClass(), "playerRating", 1979269463);
        setBooleanField(term54005, term54005.getClass(), "isNewRecord", false);
        setBooleanField(term54005, term54005.getClass(), "isFullCombo", false);
        setIntField(term54005, term54005.getClass(), "fullChainKind", -1690818607);
        setBooleanField(term54005, term54005.getClass(), "isAllJustice", false);
        setIntField(term54005, term54005.getClass(), "characterId", 252440319);
        setIntField(term54005, term54005.getClass(), "skillId", -1798089143);
        setIntField(term54005, term54005.getClass(), "playKind", -2056399026);
        setBooleanField(term54005, term54005.getClass(), "isClear", false);
        setIntField(term54005, term54005.getClass(), "skillLevel", -150070327);
        setIntField(term54005, term54005.getClass(), "skillEffect", -731659931);
        term54057 = new Integer(645238162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54057;
        callMethod(klass, "setRateFlick", argTypes, term54005, args);
    }

};


