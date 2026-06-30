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

public class ProfileResp_getTotalMasterHighScore_187891374517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117238;

    public ProfileResp_getTotalMasterHighScore_187891374517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117238 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term117281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117286 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117296 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term117238, term117238.getClass(), "userName", "EuKWqkSaMW");
        setIntField(term117238, term117238.getClass(), "level", 1659386860);
        setField(term117238, term117238.getClass(), "exp", "NYfLLlFAwk");
        setLongField(term117238, term117238.getClass(), "point", 8433973234615859286L);
        setLongField(term117238, term117238.getClass(), "totalPoint", 848612728392379464L);
        setIntField(term117238, term117238.getClass(), "playCount", 1442766674);
        setIntField(term117238, term117238.getClass(), "playerRating", 554804685);
        setIntField(term117238, term117238.getClass(), "highestRating", 225778636);
        setIntField(term117238, term117238.getClass(), "nameplateId", -1563143071);
        setIntField(term117238, term117238.getClass(), "frameId", -1285071872);
        setIntField(term117238, term117238.getClass(), "characterId", 668705389);
        setIntField(term117238, term117238.getClass(), "trophyId", 371064798);
        setIntField(term117238, term117238.getClass(), "totalMapNum", 517649470);
        setLongField(term117238, term117238.getClass(), "totalHiScore", -8328832119890386795L);
        setLongField(term117238, term117238.getClass(), "totalBasicHighScore", 2198934093484437202L);
        setLongField(term117238, term117238.getClass(), "totalAdvancedHighScore", -4524163752726588302L);
        setLongField(term117238, term117238.getClass(), "totalExpertHighScore", -3721456841949694712L);
        setLongField(term117238, term117238.getClass(), "totalMasterHighScore", -456836328448013051L);
        setLongField(term117238, term117238.getClass(), "totalUltimaHighScore", -5921310990563765401L);
        setIntField(term117238, term117238.getClass(), "friendCount", 2083474293);
        setIntField(term117282, term117282.getClass(), "year", 2014);
        setShortField(term117282, term117282.getClass(), "month", (short) 9);
        setShortField(term117282, term117282.getClass(), "day", (short) 26);
        setField(term117281, term117281.getClass(), "date", term117282);
        setByteField(term117286, term117286.getClass(), "hour", (byte) 15);
        setByteField(term117286, term117286.getClass(), "minute", (byte) 30);
        setByteField(term117286, term117286.getClass(), "second", (byte) 10);
        setIntField(term117286, term117286.getClass(), "nano", 875560954);
        setField(term117281, term117281.getClass(), "time", term117286);
        setField(term117238, term117238.getClass(), "firstPlayDate", term117281);
        setIntField(term117292, term117292.getClass(), "year", 2017);
        setShortField(term117292, term117292.getClass(), "month", (short) 2);
        setShortField(term117292, term117292.getClass(), "day", (short) 11);
        setField(term117291, term117291.getClass(), "date", term117292);
        setByteField(term117296, term117296.getClass(), "hour", (byte) 18);
        setByteField(term117296, term117296.getClass(), "minute", (byte) 24);
        setByteField(term117296, term117296.getClass(), "second", (byte) 13);
        setIntField(term117296, term117296.getClass(), "nano", 481770206);
        setField(term117291, term117291.getClass(), "time", term117296);
        setField(term117238, term117238.getClass(), "lastPlayDate", term117291);
        setIntField(term117238, term117238.getClass(), "courseClass", 958473837);
        setIntField(term117238, term117238.getClass(), "overPowerPoint", -2123194686);
        setIntField(term117238, term117238.getClass(), "overPowerRate", -48866521);
        setIntField(term117238, term117238.getClass(), "mapIconId", -1490245081);
        setIntField(term117238, term117238.getClass(), "voiceId", 1566375422);
        setIntField(term117238, term117238.getClass(), "avatarWear", -1864791319);
        setIntField(term117238, term117238.getClass(), "avatarHead", 1677093275);
        setIntField(term117238, term117238.getClass(), "avatarFace", -1876202141);
        setIntField(term117238, term117238.getClass(), "avatarSkin", -2079588418);
        setIntField(term117238, term117238.getClass(), "avatarItem", 1361899208);
        setIntField(term117238, term117238.getClass(), "avatarFront", 136350572);
        setIntField(term117238, term117238.getClass(), "avatarBack", -2014769484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterHighScore", argTypes, term117238, args);
    }

};


