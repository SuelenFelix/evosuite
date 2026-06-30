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

public class ProfileResp_getUserName_1566164480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115623;

    public ProfileResp_getUserName_1566164480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115623 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term115666 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115667 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115671 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115676 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115677 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115681 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term115623, term115623.getClass(), "userName", "njWnMTRwPZ");
        setIntField(term115623, term115623.getClass(), "level", 1153594068);
        setField(term115623, term115623.getClass(), "exp", "XZfXhKtihX");
        setLongField(term115623, term115623.getClass(), "point", -556919287843534913L);
        setLongField(term115623, term115623.getClass(), "totalPoint", -7294326942818969653L);
        setIntField(term115623, term115623.getClass(), "playCount", -1449380389);
        setIntField(term115623, term115623.getClass(), "playerRating", -434347257);
        setIntField(term115623, term115623.getClass(), "highestRating", 1113228640);
        setIntField(term115623, term115623.getClass(), "nameplateId", 546711530);
        setIntField(term115623, term115623.getClass(), "frameId", -1719001285);
        setIntField(term115623, term115623.getClass(), "characterId", -145195839);
        setIntField(term115623, term115623.getClass(), "trophyId", -1372954467);
        setIntField(term115623, term115623.getClass(), "totalMapNum", 928613811);
        setLongField(term115623, term115623.getClass(), "totalHiScore", 8962346707049260171L);
        setLongField(term115623, term115623.getClass(), "totalBasicHighScore", -6761022409110141883L);
        setLongField(term115623, term115623.getClass(), "totalAdvancedHighScore", -8253392951282694419L);
        setLongField(term115623, term115623.getClass(), "totalExpertHighScore", 5170380277584505467L);
        setLongField(term115623, term115623.getClass(), "totalMasterHighScore", 6871100950577596810L);
        setLongField(term115623, term115623.getClass(), "totalUltimaHighScore", 5783239372469450901L);
        setIntField(term115623, term115623.getClass(), "friendCount", 708274621);
        setIntField(term115667, term115667.getClass(), "year", 2026);
        setShortField(term115667, term115667.getClass(), "month", (short) 12);
        setShortField(term115667, term115667.getClass(), "day", (short) 19);
        setField(term115666, term115666.getClass(), "date", term115667);
        setByteField(term115671, term115671.getClass(), "hour", (byte) 8);
        setByteField(term115671, term115671.getClass(), "minute", (byte) 17);
        setByteField(term115671, term115671.getClass(), "second", (byte) 49);
        setIntField(term115671, term115671.getClass(), "nano", 256621575);
        setField(term115666, term115666.getClass(), "time", term115671);
        setField(term115623, term115623.getClass(), "firstPlayDate", term115666);
        setIntField(term115677, term115677.getClass(), "year", 2025);
        setShortField(term115677, term115677.getClass(), "month", (short) 4);
        setShortField(term115677, term115677.getClass(), "day", (short) 25);
        setField(term115676, term115676.getClass(), "date", term115677);
        setByteField(term115681, term115681.getClass(), "hour", (byte) 18);
        setByteField(term115681, term115681.getClass(), "minute", (byte) 13);
        setByteField(term115681, term115681.getClass(), "second", (byte) 5);
        setIntField(term115681, term115681.getClass(), "nano", 571776221);
        setField(term115676, term115676.getClass(), "time", term115681);
        setField(term115623, term115623.getClass(), "lastPlayDate", term115676);
        setIntField(term115623, term115623.getClass(), "courseClass", -376456400);
        setIntField(term115623, term115623.getClass(), "overPowerPoint", 759758751);
        setIntField(term115623, term115623.getClass(), "overPowerRate", 1980936853);
        setIntField(term115623, term115623.getClass(), "mapIconId", 212535302);
        setIntField(term115623, term115623.getClass(), "voiceId", 944726062);
        setIntField(term115623, term115623.getClass(), "avatarWear", 633068092);
        setIntField(term115623, term115623.getClass(), "avatarHead", 114801740);
        setIntField(term115623, term115623.getClass(), "avatarFace", -1415642232);
        setIntField(term115623, term115623.getClass(), "avatarSkin", -1163140083);
        setIntField(term115623, term115623.getClass(), "avatarItem", 1350089873);
        setIntField(term115623, term115623.getClass(), "avatarFront", 739028989);
        setIntField(term115623, term115623.getClass(), "avatarBack", -654134013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term115623, args);
    }

};


