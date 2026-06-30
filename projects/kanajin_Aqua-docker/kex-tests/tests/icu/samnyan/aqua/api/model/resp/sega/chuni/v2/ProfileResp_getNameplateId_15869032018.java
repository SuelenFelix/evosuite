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

public class ProfileResp_getNameplateId_15869032018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116383;

    public ProfileResp_getNameplateId_15869032018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116383 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term116426 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116427 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116431 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116436 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116437 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116441 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term116383, term116383.getClass(), "userName", "MRyukjqCAG");
        setIntField(term116383, term116383.getClass(), "level", 577217649);
        setField(term116383, term116383.getClass(), "exp", "CGfwvyMUci");
        setLongField(term116383, term116383.getClass(), "point", 8467443504765666649L);
        setLongField(term116383, term116383.getClass(), "totalPoint", -2973693745170987047L);
        setIntField(term116383, term116383.getClass(), "playCount", 611390032);
        setIntField(term116383, term116383.getClass(), "playerRating", -996614357);
        setIntField(term116383, term116383.getClass(), "highestRating", 206436418);
        setIntField(term116383, term116383.getClass(), "nameplateId", 679676214);
        setIntField(term116383, term116383.getClass(), "frameId", -523512657);
        setIntField(term116383, term116383.getClass(), "characterId", 1636726727);
        setIntField(term116383, term116383.getClass(), "trophyId", -871240496);
        setIntField(term116383, term116383.getClass(), "totalMapNum", -724639547);
        setLongField(term116383, term116383.getClass(), "totalHiScore", 7653085189229399472L);
        setLongField(term116383, term116383.getClass(), "totalBasicHighScore", 515823041410317993L);
        setLongField(term116383, term116383.getClass(), "totalAdvancedHighScore", 488055456685935685L);
        setLongField(term116383, term116383.getClass(), "totalExpertHighScore", 7070822916924815698L);
        setLongField(term116383, term116383.getClass(), "totalMasterHighScore", -8242397124484371002L);
        setLongField(term116383, term116383.getClass(), "totalUltimaHighScore", 8490994330823498562L);
        setIntField(term116383, term116383.getClass(), "friendCount", -566311422);
        setIntField(term116427, term116427.getClass(), "year", 2014);
        setShortField(term116427, term116427.getClass(), "month", (short) 1);
        setShortField(term116427, term116427.getClass(), "day", (short) 13);
        setField(term116426, term116426.getClass(), "date", term116427);
        setByteField(term116431, term116431.getClass(), "hour", (byte) 5);
        setByteField(term116431, term116431.getClass(), "minute", (byte) 17);
        setByteField(term116431, term116431.getClass(), "second", (byte) 49);
        setIntField(term116431, term116431.getClass(), "nano", 745000785);
        setField(term116426, term116426.getClass(), "time", term116431);
        setField(term116383, term116383.getClass(), "firstPlayDate", term116426);
        setIntField(term116437, term116437.getClass(), "year", 2010);
        setShortField(term116437, term116437.getClass(), "month", (short) 1);
        setShortField(term116437, term116437.getClass(), "day", (short) 14);
        setField(term116436, term116436.getClass(), "date", term116437);
        setByteField(term116441, term116441.getClass(), "hour", (byte) 5);
        setByteField(term116441, term116441.getClass(), "minute", (byte) 46);
        setByteField(term116441, term116441.getClass(), "second", (byte) 25);
        setIntField(term116441, term116441.getClass(), "nano", 387924461);
        setField(term116436, term116436.getClass(), "time", term116441);
        setField(term116383, term116383.getClass(), "lastPlayDate", term116436);
        setIntField(term116383, term116383.getClass(), "courseClass", 45156425);
        setIntField(term116383, term116383.getClass(), "overPowerPoint", 533543886);
        setIntField(term116383, term116383.getClass(), "overPowerRate", 660756);
        setIntField(term116383, term116383.getClass(), "mapIconId", 1963103952);
        setIntField(term116383, term116383.getClass(), "voiceId", -342254029);
        setIntField(term116383, term116383.getClass(), "avatarWear", -1015603920);
        setIntField(term116383, term116383.getClass(), "avatarHead", 565559647);
        setIntField(term116383, term116383.getClass(), "avatarFace", -946198115);
        setIntField(term116383, term116383.getClass(), "avatarSkin", 1047277804);
        setIntField(term116383, term116383.getClass(), "avatarItem", 1828791261);
        setIntField(term116383, term116383.getClass(), "avatarFront", -1255671495);
        setIntField(term116383, term116383.getClass(), "avatarBack", -1994568081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term116383, args);
    }

};


