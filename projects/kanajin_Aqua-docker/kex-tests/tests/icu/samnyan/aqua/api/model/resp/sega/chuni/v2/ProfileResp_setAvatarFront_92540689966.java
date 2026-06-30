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

public class ProfileResp_setAvatarFront_92540689966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122013;
     Object term122088;

    public ProfileResp_setAvatarFront_92540689966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122013 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term122056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122061 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122071 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term122013, term122013.getClass(), "userName", "cZzZwgyRsb");
        setIntField(term122013, term122013.getClass(), "level", -706441405);
        setField(term122013, term122013.getClass(), "exp", "yRTLQJvUab");
        setLongField(term122013, term122013.getClass(), "point", -837980592406874043L);
        setLongField(term122013, term122013.getClass(), "totalPoint", 5250197542785557863L);
        setIntField(term122013, term122013.getClass(), "playCount", 1988126463);
        setIntField(term122013, term122013.getClass(), "playerRating", -1423709151);
        setIntField(term122013, term122013.getClass(), "highestRating", 724630817);
        setIntField(term122013, term122013.getClass(), "nameplateId", 214250413);
        setIntField(term122013, term122013.getClass(), "frameId", 1447031687);
        setIntField(term122013, term122013.getClass(), "characterId", -1437076507);
        setIntField(term122013, term122013.getClass(), "trophyId", 497210935);
        setIntField(term122013, term122013.getClass(), "totalMapNum", -410381608);
        setLongField(term122013, term122013.getClass(), "totalHiScore", -1217059836107042676L);
        setLongField(term122013, term122013.getClass(), "totalBasicHighScore", -3510925584197260632L);
        setLongField(term122013, term122013.getClass(), "totalAdvancedHighScore", 249605792719798206L);
        setLongField(term122013, term122013.getClass(), "totalExpertHighScore", 6361128850334161269L);
        setLongField(term122013, term122013.getClass(), "totalMasterHighScore", 5894188070569251493L);
        setLongField(term122013, term122013.getClass(), "totalUltimaHighScore", -2929024140026737070L);
        setIntField(term122013, term122013.getClass(), "friendCount", 1915965945);
        setIntField(term122057, term122057.getClass(), "year", 2022);
        setShortField(term122057, term122057.getClass(), "month", (short) 6);
        setShortField(term122057, term122057.getClass(), "day", (short) 16);
        setField(term122056, term122056.getClass(), "date", term122057);
        setByteField(term122061, term122061.getClass(), "hour", (byte) 3);
        setByteField(term122061, term122061.getClass(), "minute", (byte) 41);
        setByteField(term122061, term122061.getClass(), "second", (byte) 57);
        setIntField(term122061, term122061.getClass(), "nano", 854858015);
        setField(term122056, term122056.getClass(), "time", term122061);
        setField(term122013, term122013.getClass(), "firstPlayDate", term122056);
        setIntField(term122067, term122067.getClass(), "year", 2016);
        setShortField(term122067, term122067.getClass(), "month", (short) 5);
        setShortField(term122067, term122067.getClass(), "day", (short) 7);
        setField(term122066, term122066.getClass(), "date", term122067);
        setByteField(term122071, term122071.getClass(), "hour", (byte) 11);
        setByteField(term122071, term122071.getClass(), "minute", (byte) 16);
        setByteField(term122071, term122071.getClass(), "second", (byte) 30);
        setIntField(term122071, term122071.getClass(), "nano", 240598283);
        setField(term122066, term122066.getClass(), "time", term122071);
        setField(term122013, term122013.getClass(), "lastPlayDate", term122066);
        setIntField(term122013, term122013.getClass(), "courseClass", 1226021867);
        setIntField(term122013, term122013.getClass(), "overPowerPoint", 813007487);
        setIntField(term122013, term122013.getClass(), "overPowerRate", -629215913);
        setIntField(term122013, term122013.getClass(), "mapIconId", -451436106);
        setIntField(term122013, term122013.getClass(), "voiceId", -151643624);
        setIntField(term122013, term122013.getClass(), "avatarWear", 967191276);
        setIntField(term122013, term122013.getClass(), "avatarHead", -752918062);
        setIntField(term122013, term122013.getClass(), "avatarFace", -844519253);
        setIntField(term122013, term122013.getClass(), "avatarSkin", -270168182);
        setIntField(term122013, term122013.getClass(), "avatarItem", -1054424456);
        setIntField(term122013, term122013.getClass(), "avatarFront", 1525002522);
        setIntField(term122013, term122013.getClass(), "avatarBack", -11974698);
        term122088 = new Integer(772160715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term122088;
        callMethod(klass, "setAvatarFront", argTypes, term122013, args);
    }

};


