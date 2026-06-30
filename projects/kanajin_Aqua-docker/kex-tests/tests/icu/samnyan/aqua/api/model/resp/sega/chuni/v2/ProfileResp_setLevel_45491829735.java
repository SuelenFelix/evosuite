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

public class ProfileResp_setLevel_45491829735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118970;
     Object term119045;

    public ProfileResp_setLevel_45491829735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118970 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term119013 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119014 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119018 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119023 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119028 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term118970, term118970.getClass(), "userName", "yctcpaluhv");
        setIntField(term118970, term118970.getClass(), "level", 1167170460);
        setField(term118970, term118970.getClass(), "exp", "ZTEEpjBRFm");
        setLongField(term118970, term118970.getClass(), "point", -8799574851656203932L);
        setLongField(term118970, term118970.getClass(), "totalPoint", 9119196902802481035L);
        setIntField(term118970, term118970.getClass(), "playCount", -1419577057);
        setIntField(term118970, term118970.getClass(), "playerRating", -656551696);
        setIntField(term118970, term118970.getClass(), "highestRating", 407121585);
        setIntField(term118970, term118970.getClass(), "nameplateId", 94220059);
        setIntField(term118970, term118970.getClass(), "frameId", 988247657);
        setIntField(term118970, term118970.getClass(), "characterId", 820660086);
        setIntField(term118970, term118970.getClass(), "trophyId", 1729000572);
        setIntField(term118970, term118970.getClass(), "totalMapNum", 328300956);
        setLongField(term118970, term118970.getClass(), "totalHiScore", 4931009322006466376L);
        setLongField(term118970, term118970.getClass(), "totalBasicHighScore", -8335387959910631302L);
        setLongField(term118970, term118970.getClass(), "totalAdvancedHighScore", 4470484728975762932L);
        setLongField(term118970, term118970.getClass(), "totalExpertHighScore", -5400620616344659195L);
        setLongField(term118970, term118970.getClass(), "totalMasterHighScore", 3658867409065185810L);
        setLongField(term118970, term118970.getClass(), "totalUltimaHighScore", 4167680443067684492L);
        setIntField(term118970, term118970.getClass(), "friendCount", 750517531);
        setIntField(term119014, term119014.getClass(), "year", 2015);
        setShortField(term119014, term119014.getClass(), "month", (short) 8);
        setShortField(term119014, term119014.getClass(), "day", (short) 6);
        setField(term119013, term119013.getClass(), "date", term119014);
        setByteField(term119018, term119018.getClass(), "hour", (byte) 8);
        setByteField(term119018, term119018.getClass(), "minute", (byte) 15);
        setByteField(term119018, term119018.getClass(), "second", (byte) 20);
        setIntField(term119018, term119018.getClass(), "nano", 538134976);
        setField(term119013, term119013.getClass(), "time", term119018);
        setField(term118970, term118970.getClass(), "firstPlayDate", term119013);
        setIntField(term119024, term119024.getClass(), "year", 2022);
        setShortField(term119024, term119024.getClass(), "month", (short) 12);
        setShortField(term119024, term119024.getClass(), "day", (short) 19);
        setField(term119023, term119023.getClass(), "date", term119024);
        setByteField(term119028, term119028.getClass(), "hour", (byte) 17);
        setByteField(term119028, term119028.getClass(), "minute", (byte) 8);
        setByteField(term119028, term119028.getClass(), "second", (byte) 56);
        setIntField(term119028, term119028.getClass(), "nano", 27584859);
        setField(term119023, term119023.getClass(), "time", term119028);
        setField(term118970, term118970.getClass(), "lastPlayDate", term119023);
        setIntField(term118970, term118970.getClass(), "courseClass", 88843645);
        setIntField(term118970, term118970.getClass(), "overPowerPoint", 888994793);
        setIntField(term118970, term118970.getClass(), "overPowerRate", 1654829804);
        setIntField(term118970, term118970.getClass(), "mapIconId", 215342139);
        setIntField(term118970, term118970.getClass(), "voiceId", 583776304);
        setIntField(term118970, term118970.getClass(), "avatarWear", 1284567321);
        setIntField(term118970, term118970.getClass(), "avatarHead", 354007116);
        setIntField(term118970, term118970.getClass(), "avatarFace", 1714616855);
        setIntField(term118970, term118970.getClass(), "avatarSkin", 1158206243);
        setIntField(term118970, term118970.getClass(), "avatarItem", -2012067202);
        setIntField(term118970, term118970.getClass(), "avatarFront", -131980120);
        setIntField(term118970, term118970.getClass(), "avatarBack", 1264147045);
        term119045 = new Integer(-1468643925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term119045;
        callMethod(klass, "setLevel", argTypes, term118970, args);
    }

};


