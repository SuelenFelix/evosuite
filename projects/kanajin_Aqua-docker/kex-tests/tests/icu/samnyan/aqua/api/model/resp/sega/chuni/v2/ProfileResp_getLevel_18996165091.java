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

public class ProfileResp_getLevel_18996165091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115718;

    public ProfileResp_getLevel_18996165091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115718 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term115761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115766 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115771 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115776 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term115718, term115718.getClass(), "userName", "mmHuLwDpkf");
        setIntField(term115718, term115718.getClass(), "level", 338271689);
        setField(term115718, term115718.getClass(), "exp", "GjyMraKalr");
        setLongField(term115718, term115718.getClass(), "point", 4405936896727212172L);
        setLongField(term115718, term115718.getClass(), "totalPoint", 9201873154937989540L);
        setIntField(term115718, term115718.getClass(), "playCount", -75227866);
        setIntField(term115718, term115718.getClass(), "playerRating", 1239588747);
        setIntField(term115718, term115718.getClass(), "highestRating", -1186365105);
        setIntField(term115718, term115718.getClass(), "nameplateId", -1618265472);
        setIntField(term115718, term115718.getClass(), "frameId", 974926160);
        setIntField(term115718, term115718.getClass(), "characterId", -1590613975);
        setIntField(term115718, term115718.getClass(), "trophyId", 694296152);
        setIntField(term115718, term115718.getClass(), "totalMapNum", 416004130);
        setLongField(term115718, term115718.getClass(), "totalHiScore", 588322502759368578L);
        setLongField(term115718, term115718.getClass(), "totalBasicHighScore", -2020614193907843026L);
        setLongField(term115718, term115718.getClass(), "totalAdvancedHighScore", -8155160977336571516L);
        setLongField(term115718, term115718.getClass(), "totalExpertHighScore", 424102814393853162L);
        setLongField(term115718, term115718.getClass(), "totalMasterHighScore", -5437497412119566438L);
        setLongField(term115718, term115718.getClass(), "totalUltimaHighScore", -4765892116338577977L);
        setIntField(term115718, term115718.getClass(), "friendCount", 290874326);
        setIntField(term115762, term115762.getClass(), "year", 2011);
        setShortField(term115762, term115762.getClass(), "month", (short) 7);
        setShortField(term115762, term115762.getClass(), "day", (short) 16);
        setField(term115761, term115761.getClass(), "date", term115762);
        setByteField(term115766, term115766.getClass(), "hour", (byte) 3);
        setByteField(term115766, term115766.getClass(), "minute", (byte) 7);
        setByteField(term115766, term115766.getClass(), "second", (byte) 41);
        setIntField(term115766, term115766.getClass(), "nano", 209488311);
        setField(term115761, term115761.getClass(), "time", term115766);
        setField(term115718, term115718.getClass(), "firstPlayDate", term115761);
        setIntField(term115772, term115772.getClass(), "year", 2014);
        setShortField(term115772, term115772.getClass(), "month", (short) 1);
        setShortField(term115772, term115772.getClass(), "day", (short) 27);
        setField(term115771, term115771.getClass(), "date", term115772);
        setByteField(term115776, term115776.getClass(), "hour", (byte) 8);
        setByteField(term115776, term115776.getClass(), "minute", (byte) 4);
        setByteField(term115776, term115776.getClass(), "second", (byte) 47);
        setIntField(term115776, term115776.getClass(), "nano", 484985884);
        setField(term115771, term115771.getClass(), "time", term115776);
        setField(term115718, term115718.getClass(), "lastPlayDate", term115771);
        setIntField(term115718, term115718.getClass(), "courseClass", 1581862449);
        setIntField(term115718, term115718.getClass(), "overPowerPoint", -9526168);
        setIntField(term115718, term115718.getClass(), "overPowerRate", 1840306020);
        setIntField(term115718, term115718.getClass(), "mapIconId", 2110460375);
        setIntField(term115718, term115718.getClass(), "voiceId", 687456819);
        setIntField(term115718, term115718.getClass(), "avatarWear", 957738923);
        setIntField(term115718, term115718.getClass(), "avatarHead", -239191815);
        setIntField(term115718, term115718.getClass(), "avatarFace", 38121963);
        setIntField(term115718, term115718.getClass(), "avatarSkin", 1978262351);
        setIntField(term115718, term115718.getClass(), "avatarItem", 1623922160);
        setIntField(term115718, term115718.getClass(), "avatarFront", 975215108);
        setIntField(term115718, term115718.getClass(), "avatarBack", -164771449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term115718, args);
    }

};


