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

public class RecentResp_getMaxCombo_48319775011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51927;

    public RecentResp_getMaxCombo_48319775011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51927 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term51928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51933 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51938 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51939 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51943 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51929, term51929.getClass(), "year", 2010);
        setShortField(term51929, term51929.getClass(), "month", (short) 8);
        setShortField(term51929, term51929.getClass(), "day", (short) 29);
        setField(term51928, term51928.getClass(), "date", term51929);
        setByteField(term51933, term51933.getClass(), "hour", (byte) 14);
        setByteField(term51933, term51933.getClass(), "minute", (byte) 6);
        setByteField(term51933, term51933.getClass(), "second", (byte) 52);
        setIntField(term51933, term51933.getClass(), "nano", 882272618);
        setField(term51928, term51928.getClass(), "time", term51933);
        setField(term51927, term51927.getClass(), "playDate", term51928);
        setIntField(term51939, term51939.getClass(), "year", 2011);
        setShortField(term51939, term51939.getClass(), "month", (short) 3);
        setShortField(term51939, term51939.getClass(), "day", (short) 21);
        setField(term51938, term51938.getClass(), "date", term51939);
        setByteField(term51943, term51943.getClass(), "hour", (byte) 10);
        setByteField(term51943, term51943.getClass(), "minute", (byte) 56);
        setByteField(term51943, term51943.getClass(), "second", (byte) 39);
        setIntField(term51943, term51943.getClass(), "nano", 54553750);
        setField(term51938, term51938.getClass(), "time", term51943);
        setField(term51927, term51927.getClass(), "userPlayDate", term51938);
        setIntField(term51927, term51927.getClass(), "musicId", -1338560431);
        setIntField(term51927, term51927.getClass(), "level", 1768827963);
        setIntField(term51927, term51927.getClass(), "customId", -456155591);
        setIntField(term51927, term51927.getClass(), "playedCustom1", -678946365);
        setIntField(term51927, term51927.getClass(), "playedCustom2", 2121147631);
        setIntField(term51927, term51927.getClass(), "playedCustom3", 878122723);
        setIntField(term51927, term51927.getClass(), "track", 1612267814);
        setIntField(term51927, term51927.getClass(), "score", 634968709);
        setIntField(term51927, term51927.getClass(), "rank", 681482688);
        setIntField(term51927, term51927.getClass(), "maxCombo", -1435288604);
        setIntField(term51927, term51927.getClass(), "maxChain", 364335952);
        setIntField(term51927, term51927.getClass(), "rateTap", 254542714);
        setIntField(term51927, term51927.getClass(), "rateHold", -51533463);
        setIntField(term51927, term51927.getClass(), "rateSlide", 2042811670);
        setIntField(term51927, term51927.getClass(), "rateAir", -1713263092);
        setIntField(term51927, term51927.getClass(), "rateFlick", 73609068);
        setIntField(term51927, term51927.getClass(), "judgeGuilty", -1150137872);
        setIntField(term51927, term51927.getClass(), "judgeAttack", -781333853);
        setIntField(term51927, term51927.getClass(), "judgeJustice", 158137467);
        setIntField(term51927, term51927.getClass(), "judgeCritical", 1299041951);
        setIntField(term51927, term51927.getClass(), "playerRating", -1772128093);
        setBooleanField(term51927, term51927.getClass(), "isNewRecord", false);
        setBooleanField(term51927, term51927.getClass(), "isFullCombo", false);
        setIntField(term51927, term51927.getClass(), "fullChainKind", -2057880798);
        setBooleanField(term51927, term51927.getClass(), "isAllJustice", true);
        setIntField(term51927, term51927.getClass(), "characterId", -2041732081);
        setIntField(term51927, term51927.getClass(), "skillId", 2073870078);
        setIntField(term51927, term51927.getClass(), "playKind", 1649066040);
        setBooleanField(term51927, term51927.getClass(), "isClear", true);
        setIntField(term51927, term51927.getClass(), "skillLevel", -640093979);
        setIntField(term51927, term51927.getClass(), "skillEffect", 1665282382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCombo", argTypes, term51927, args);
    }

};


