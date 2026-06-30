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

public class ProfileResp_setOverPowerRate_159107678858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121237;
     Object term121312;

    public ProfileResp_setOverPowerRate_159107678858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121237 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term121280 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121285 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121290 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121291 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121295 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term121237, term121237.getClass(), "userName", "XWfTNLgUUn");
        setIntField(term121237, term121237.getClass(), "level", -62479267);
        setField(term121237, term121237.getClass(), "exp", "gsUmKVKOac");
        setLongField(term121237, term121237.getClass(), "point", -1112401645496674521L);
        setLongField(term121237, term121237.getClass(), "totalPoint", -7767323715199010737L);
        setIntField(term121237, term121237.getClass(), "playCount", -585266118);
        setIntField(term121237, term121237.getClass(), "playerRating", 1011504361);
        setIntField(term121237, term121237.getClass(), "highestRating", -448993929);
        setIntField(term121237, term121237.getClass(), "nameplateId", -449163247);
        setIntField(term121237, term121237.getClass(), "frameId", 737190996);
        setIntField(term121237, term121237.getClass(), "characterId", -402509137);
        setIntField(term121237, term121237.getClass(), "trophyId", -1943478566);
        setIntField(term121237, term121237.getClass(), "totalMapNum", -1703118421);
        setLongField(term121237, term121237.getClass(), "totalHiScore", 2925187842923146237L);
        setLongField(term121237, term121237.getClass(), "totalBasicHighScore", -6927656791131248157L);
        setLongField(term121237, term121237.getClass(), "totalAdvancedHighScore", 2033083225211342518L);
        setLongField(term121237, term121237.getClass(), "totalExpertHighScore", -9132321335479092344L);
        setLongField(term121237, term121237.getClass(), "totalMasterHighScore", -4843588367819860974L);
        setLongField(term121237, term121237.getClass(), "totalUltimaHighScore", -8545138018655256969L);
        setIntField(term121237, term121237.getClass(), "friendCount", 1543762915);
        setIntField(term121281, term121281.getClass(), "year", 2013);
        setShortField(term121281, term121281.getClass(), "month", (short) 8);
        setShortField(term121281, term121281.getClass(), "day", (short) 31);
        setField(term121280, term121280.getClass(), "date", term121281);
        setByteField(term121285, term121285.getClass(), "hour", (byte) 13);
        setByteField(term121285, term121285.getClass(), "minute", (byte) 16);
        setByteField(term121285, term121285.getClass(), "second", (byte) 5);
        setIntField(term121285, term121285.getClass(), "nano", 712091295);
        setField(term121280, term121280.getClass(), "time", term121285);
        setField(term121237, term121237.getClass(), "firstPlayDate", term121280);
        setIntField(term121291, term121291.getClass(), "year", 2014);
        setShortField(term121291, term121291.getClass(), "month", (short) 5);
        setShortField(term121291, term121291.getClass(), "day", (short) 16);
        setField(term121290, term121290.getClass(), "date", term121291);
        setByteField(term121295, term121295.getClass(), "hour", (byte) 13);
        setByteField(term121295, term121295.getClass(), "minute", (byte) 47);
        setByteField(term121295, term121295.getClass(), "second", (byte) 42);
        setIntField(term121295, term121295.getClass(), "nano", 31569052);
        setField(term121290, term121290.getClass(), "time", term121295);
        setField(term121237, term121237.getClass(), "lastPlayDate", term121290);
        setIntField(term121237, term121237.getClass(), "courseClass", -514479793);
        setIntField(term121237, term121237.getClass(), "overPowerPoint", -1317681926);
        setIntField(term121237, term121237.getClass(), "overPowerRate", 1380748897);
        setIntField(term121237, term121237.getClass(), "mapIconId", -1698882950);
        setIntField(term121237, term121237.getClass(), "voiceId", -1467738538);
        setIntField(term121237, term121237.getClass(), "avatarWear", -1821427282);
        setIntField(term121237, term121237.getClass(), "avatarHead", -36507356);
        setIntField(term121237, term121237.getClass(), "avatarFace", -546217795);
        setIntField(term121237, term121237.getClass(), "avatarSkin", -1192556943);
        setIntField(term121237, term121237.getClass(), "avatarItem", 1155531420);
        setIntField(term121237, term121237.getClass(), "avatarFront", 1613271352);
        setIntField(term121237, term121237.getClass(), "avatarBack", -1285960342);
        term121312 = new Integer(-830160866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term121312;
        callMethod(klass, "setOverPowerRate", argTypes, term121237, args);
    }

};


