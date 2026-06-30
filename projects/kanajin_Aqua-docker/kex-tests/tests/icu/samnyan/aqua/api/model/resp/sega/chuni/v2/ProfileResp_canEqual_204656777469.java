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

public class ProfileResp_canEqual_204656777469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122303;
     Object term122378;

    public ProfileResp_canEqual_204656777469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122303 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term122346 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122347 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122351 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122361 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term122303, term122303.getClass(), "userName", "bCuxURZPHN");
        setIntField(term122303, term122303.getClass(), "level", -459479702);
        setField(term122303, term122303.getClass(), "exp", "gHeEnrQkug");
        setLongField(term122303, term122303.getClass(), "point", 1067985593376883262L);
        setLongField(term122303, term122303.getClass(), "totalPoint", -5499913086956312323L);
        setIntField(term122303, term122303.getClass(), "playCount", 307312267);
        setIntField(term122303, term122303.getClass(), "playerRating", -711951352);
        setIntField(term122303, term122303.getClass(), "highestRating", 266360121);
        setIntField(term122303, term122303.getClass(), "nameplateId", 1782134766);
        setIntField(term122303, term122303.getClass(), "frameId", -876275233);
        setIntField(term122303, term122303.getClass(), "characterId", -471373859);
        setIntField(term122303, term122303.getClass(), "trophyId", -1871720485);
        setIntField(term122303, term122303.getClass(), "totalMapNum", 376077913);
        setLongField(term122303, term122303.getClass(), "totalHiScore", -847032915869884035L);
        setLongField(term122303, term122303.getClass(), "totalBasicHighScore", 4566362170283660512L);
        setLongField(term122303, term122303.getClass(), "totalAdvancedHighScore", -6157498252500278084L);
        setLongField(term122303, term122303.getClass(), "totalExpertHighScore", -500597048395850783L);
        setLongField(term122303, term122303.getClass(), "totalMasterHighScore", -2280328110275213593L);
        setLongField(term122303, term122303.getClass(), "totalUltimaHighScore", 2350787735253804252L);
        setIntField(term122303, term122303.getClass(), "friendCount", -843378513);
        setIntField(term122347, term122347.getClass(), "year", 2022);
        setShortField(term122347, term122347.getClass(), "month", (short) 12);
        setShortField(term122347, term122347.getClass(), "day", (short) 21);
        setField(term122346, term122346.getClass(), "date", term122347);
        setByteField(term122351, term122351.getClass(), "hour", (byte) 23);
        setByteField(term122351, term122351.getClass(), "minute", (byte) 45);
        setByteField(term122351, term122351.getClass(), "second", (byte) 15);
        setIntField(term122351, term122351.getClass(), "nano", 804346852);
        setField(term122346, term122346.getClass(), "time", term122351);
        setField(term122303, term122303.getClass(), "firstPlayDate", term122346);
        setIntField(term122357, term122357.getClass(), "year", 2014);
        setShortField(term122357, term122357.getClass(), "month", (short) 8);
        setShortField(term122357, term122357.getClass(), "day", (short) 8);
        setField(term122356, term122356.getClass(), "date", term122357);
        setByteField(term122361, term122361.getClass(), "hour", (byte) 7);
        setByteField(term122361, term122361.getClass(), "minute", (byte) 12);
        setByteField(term122361, term122361.getClass(), "second", (byte) 56);
        setIntField(term122361, term122361.getClass(), "nano", 157614153);
        setField(term122356, term122356.getClass(), "time", term122361);
        setField(term122303, term122303.getClass(), "lastPlayDate", term122356);
        setIntField(term122303, term122303.getClass(), "courseClass", -1698898242);
        setIntField(term122303, term122303.getClass(), "overPowerPoint", -284015681);
        setIntField(term122303, term122303.getClass(), "overPowerRate", 558466375);
        setIntField(term122303, term122303.getClass(), "mapIconId", 672508367);
        setIntField(term122303, term122303.getClass(), "voiceId", -1078304033);
        setIntField(term122303, term122303.getClass(), "avatarWear", -1148063391);
        setIntField(term122303, term122303.getClass(), "avatarHead", -1363269955);
        setIntField(term122303, term122303.getClass(), "avatarFace", 980662621);
        setIntField(term122303, term122303.getClass(), "avatarSkin", -277605605);
        setIntField(term122303, term122303.getClass(), "avatarItem", -4281944);
        setIntField(term122303, term122303.getClass(), "avatarFront", 1547775870);
        setIntField(term122303, term122303.getClass(), "avatarBack", -2059897454);
        term122378 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term122378;
        callMethod(klass, "canEqual", argTypes, term122303, args);
    }

};


