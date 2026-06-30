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

public class RecentResp_setLevel_44420915536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48079;
     Object term48131;

    public RecentResp_setLevel_44420915536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48079 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48080 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48081 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48085 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48090 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48091 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48095 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48081, term48081.getClass(), "year", 2015);
        setShortField(term48081, term48081.getClass(), "month", (short) 1);
        setShortField(term48081, term48081.getClass(), "day", (short) 10);
        setField(term48080, term48080.getClass(), "date", term48081);
        setByteField(term48085, term48085.getClass(), "hour", (byte) 2);
        setByteField(term48085, term48085.getClass(), "minute", (byte) 48);
        setByteField(term48085, term48085.getClass(), "second", (byte) 41);
        setIntField(term48085, term48085.getClass(), "nano", 572611941);
        setField(term48080, term48080.getClass(), "time", term48085);
        setField(term48079, term48079.getClass(), "playDate", term48080);
        setIntField(term48091, term48091.getClass(), "year", 2013);
        setShortField(term48091, term48091.getClass(), "month", (short) 10);
        setShortField(term48091, term48091.getClass(), "day", (short) 23);
        setField(term48090, term48090.getClass(), "date", term48091);
        setByteField(term48095, term48095.getClass(), "hour", (byte) 4);
        setByteField(term48095, term48095.getClass(), "minute", (byte) 33);
        setByteField(term48095, term48095.getClass(), "second", (byte) 51);
        setIntField(term48095, term48095.getClass(), "nano", 626320293);
        setField(term48090, term48090.getClass(), "time", term48095);
        setField(term48079, term48079.getClass(), "userPlayDate", term48090);
        setIntField(term48079, term48079.getClass(), "musicId", -456321892);
        setIntField(term48079, term48079.getClass(), "level", 1803068346);
        setIntField(term48079, term48079.getClass(), "customId", 1598485572);
        setIntField(term48079, term48079.getClass(), "playedCustom1", 1328348146);
        setIntField(term48079, term48079.getClass(), "playedCustom2", 835037846);
        setIntField(term48079, term48079.getClass(), "playedCustom3", 1151852495);
        setIntField(term48079, term48079.getClass(), "track", -1258846135);
        setIntField(term48079, term48079.getClass(), "score", -2113882456);
        setIntField(term48079, term48079.getClass(), "rank", 913224981);
        setIntField(term48079, term48079.getClass(), "maxCombo", -2064677239);
        setIntField(term48079, term48079.getClass(), "maxChain", 584068841);
        setIntField(term48079, term48079.getClass(), "rateTap", -289675978);
        setIntField(term48079, term48079.getClass(), "rateHold", 1466847406);
        setIntField(term48079, term48079.getClass(), "rateSlide", 1943280473);
        setIntField(term48079, term48079.getClass(), "rateAir", 1068101842);
        setIntField(term48079, term48079.getClass(), "rateFlick", 1060522715);
        setIntField(term48079, term48079.getClass(), "judgeGuilty", -451590147);
        setIntField(term48079, term48079.getClass(), "judgeAttack", -537090894);
        setIntField(term48079, term48079.getClass(), "judgeJustice", 105089682);
        setIntField(term48079, term48079.getClass(), "judgeCritical", 1304790955);
        setIntField(term48079, term48079.getClass(), "playerRating", -1412824084);
        setBooleanField(term48079, term48079.getClass(), "isNewRecord", true);
        setBooleanField(term48079, term48079.getClass(), "isFullCombo", true);
        setIntField(term48079, term48079.getClass(), "fullChainKind", 659034364);
        setBooleanField(term48079, term48079.getClass(), "isAllJustice", false);
        setIntField(term48079, term48079.getClass(), "characterId", 671129726);
        setIntField(term48079, term48079.getClass(), "skillId", -1217066846);
        setIntField(term48079, term48079.getClass(), "playKind", 570145845);
        setBooleanField(term48079, term48079.getClass(), "isClear", false);
        setIntField(term48079, term48079.getClass(), "skillLevel", 1990162126);
        setIntField(term48079, term48079.getClass(), "skillEffect", 1728957652);
        term48131 = new Integer(-482056965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48131;
        callMethod(klass, "setLevel", argTypes, term48079, args);
    }

};


