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

public class ProfileResp_setAvatarBack_191710183167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122110;
     Object term122185;

    public ProfileResp_setAvatarBack_191710183167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122110 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term122153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122158 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122163 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122168 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term122110, term122110.getClass(), "userName", "uSsBnPkCNa");
        setIntField(term122110, term122110.getClass(), "level", 1475737668);
        setField(term122110, term122110.getClass(), "exp", "hGeOoQaXwC");
        setLongField(term122110, term122110.getClass(), "point", 4250631141623631547L);
        setLongField(term122110, term122110.getClass(), "totalPoint", -4442651502268555941L);
        setIntField(term122110, term122110.getClass(), "playCount", -1590087810);
        setIntField(term122110, term122110.getClass(), "playerRating", -943639544);
        setIntField(term122110, term122110.getClass(), "highestRating", 1551123779);
        setIntField(term122110, term122110.getClass(), "nameplateId", -1648252925);
        setIntField(term122110, term122110.getClass(), "frameId", 650245980);
        setIntField(term122110, term122110.getClass(), "characterId", 214628076);
        setIntField(term122110, term122110.getClass(), "trophyId", 1762768367);
        setIntField(term122110, term122110.getClass(), "totalMapNum", -1248498535);
        setLongField(term122110, term122110.getClass(), "totalHiScore", -488792094823193838L);
        setLongField(term122110, term122110.getClass(), "totalBasicHighScore", 8303052489803253713L);
        setLongField(term122110, term122110.getClass(), "totalAdvancedHighScore", -5700978725283773576L);
        setLongField(term122110, term122110.getClass(), "totalExpertHighScore", 5802374733902120404L);
        setLongField(term122110, term122110.getClass(), "totalMasterHighScore", -2160213762472734251L);
        setLongField(term122110, term122110.getClass(), "totalUltimaHighScore", 2053196274651523185L);
        setIntField(term122110, term122110.getClass(), "friendCount", -1431523078);
        setIntField(term122154, term122154.getClass(), "year", 2018);
        setShortField(term122154, term122154.getClass(), "month", (short) 9);
        setShortField(term122154, term122154.getClass(), "day", (short) 24);
        setField(term122153, term122153.getClass(), "date", term122154);
        setByteField(term122158, term122158.getClass(), "hour", (byte) 22);
        setByteField(term122158, term122158.getClass(), "minute", (byte) 5);
        setByteField(term122158, term122158.getClass(), "second", (byte) 4);
        setIntField(term122158, term122158.getClass(), "nano", 423298295);
        setField(term122153, term122153.getClass(), "time", term122158);
        setField(term122110, term122110.getClass(), "firstPlayDate", term122153);
        setIntField(term122164, term122164.getClass(), "year", 2024);
        setShortField(term122164, term122164.getClass(), "month", (short) 8);
        setShortField(term122164, term122164.getClass(), "day", (short) 27);
        setField(term122163, term122163.getClass(), "date", term122164);
        setByteField(term122168, term122168.getClass(), "hour", (byte) 21);
        setByteField(term122168, term122168.getClass(), "minute", (byte) 1);
        setByteField(term122168, term122168.getClass(), "second", (byte) 35);
        setIntField(term122168, term122168.getClass(), "nano", 812020088);
        setField(term122163, term122163.getClass(), "time", term122168);
        setField(term122110, term122110.getClass(), "lastPlayDate", term122163);
        setIntField(term122110, term122110.getClass(), "courseClass", 1189313607);
        setIntField(term122110, term122110.getClass(), "overPowerPoint", 2057421648);
        setIntField(term122110, term122110.getClass(), "overPowerRate", 1041053950);
        setIntField(term122110, term122110.getClass(), "mapIconId", -138247274);
        setIntField(term122110, term122110.getClass(), "voiceId", -310071423);
        setIntField(term122110, term122110.getClass(), "avatarWear", 1988457125);
        setIntField(term122110, term122110.getClass(), "avatarHead", -694281368);
        setIntField(term122110, term122110.getClass(), "avatarFace", 551977915);
        setIntField(term122110, term122110.getClass(), "avatarSkin", 1998384483);
        setIntField(term122110, term122110.getClass(), "avatarItem", 637346395);
        setIntField(term122110, term122110.getClass(), "avatarFront", 1074106025);
        setIntField(term122110, term122110.getClass(), "avatarBack", 332083925);
        term122185 = new Integer(-714781151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term122185;
        callMethod(klass, "setAvatarBack", argTypes, term122110, args);
    }

};


