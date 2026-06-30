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

public class ProfileResp_equals_144423689368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122207;
     Object term122282;

    public ProfileResp_equals_144423689368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122207 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term122250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122255 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122260 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122261 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122265 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term122207, term122207.getClass(), "userName", "ualEpwAGnm");
        setIntField(term122207, term122207.getClass(), "level", 1628808644);
        setField(term122207, term122207.getClass(), "exp", "xYlQMsdTSy");
        setLongField(term122207, term122207.getClass(), "point", -8624949217735869992L);
        setLongField(term122207, term122207.getClass(), "totalPoint", 2930009653397034975L);
        setIntField(term122207, term122207.getClass(), "playCount", 1276247509);
        setIntField(term122207, term122207.getClass(), "playerRating", 1791484936);
        setIntField(term122207, term122207.getClass(), "highestRating", 1363413915);
        setIntField(term122207, term122207.getClass(), "nameplateId", 1419700231);
        setIntField(term122207, term122207.getClass(), "frameId", 251485735);
        setIntField(term122207, term122207.getClass(), "characterId", 1826560572);
        setIntField(term122207, term122207.getClass(), "trophyId", 1484294111);
        setIntField(term122207, term122207.getClass(), "totalMapNum", 469060183);
        setLongField(term122207, term122207.getClass(), "totalHiScore", 7962633237038441170L);
        setLongField(term122207, term122207.getClass(), "totalBasicHighScore", -4251882276629548538L);
        setLongField(term122207, term122207.getClass(), "totalAdvancedHighScore", -2512489315719996447L);
        setLongField(term122207, term122207.getClass(), "totalExpertHighScore", 4970736928905252160L);
        setLongField(term122207, term122207.getClass(), "totalMasterHighScore", -1554841210244602287L);
        setLongField(term122207, term122207.getClass(), "totalUltimaHighScore", 2486531374354637666L);
        setIntField(term122207, term122207.getClass(), "friendCount", 884802340);
        setIntField(term122251, term122251.getClass(), "year", 2018);
        setShortField(term122251, term122251.getClass(), "month", (short) 1);
        setShortField(term122251, term122251.getClass(), "day", (short) 19);
        setField(term122250, term122250.getClass(), "date", term122251);
        setByteField(term122255, term122255.getClass(), "hour", (byte) 20);
        setByteField(term122255, term122255.getClass(), "minute", (byte) 10);
        setByteField(term122255, term122255.getClass(), "second", (byte) 48);
        setIntField(term122255, term122255.getClass(), "nano", 835797505);
        setField(term122250, term122250.getClass(), "time", term122255);
        setField(term122207, term122207.getClass(), "firstPlayDate", term122250);
        setIntField(term122261, term122261.getClass(), "year", 2011);
        setShortField(term122261, term122261.getClass(), "month", (short) 4);
        setShortField(term122261, term122261.getClass(), "day", (short) 11);
        setField(term122260, term122260.getClass(), "date", term122261);
        setByteField(term122265, term122265.getClass(), "hour", (byte) 21);
        setByteField(term122265, term122265.getClass(), "minute", (byte) 30);
        setByteField(term122265, term122265.getClass(), "second", (byte) 10);
        setIntField(term122265, term122265.getClass(), "nano", 948129077);
        setField(term122260, term122260.getClass(), "time", term122265);
        setField(term122207, term122207.getClass(), "lastPlayDate", term122260);
        setIntField(term122207, term122207.getClass(), "courseClass", -494652548);
        setIntField(term122207, term122207.getClass(), "overPowerPoint", 1998764018);
        setIntField(term122207, term122207.getClass(), "overPowerRate", 239481191);
        setIntField(term122207, term122207.getClass(), "mapIconId", 2100826369);
        setIntField(term122207, term122207.getClass(), "voiceId", 264238464);
        setIntField(term122207, term122207.getClass(), "avatarWear", -1609566512);
        setIntField(term122207, term122207.getClass(), "avatarHead", -1937017315);
        setIntField(term122207, term122207.getClass(), "avatarFace", 1434988865);
        setIntField(term122207, term122207.getClass(), "avatarSkin", -700919928);
        setIntField(term122207, term122207.getClass(), "avatarItem", -1663859536);
        setIntField(term122207, term122207.getClass(), "avatarFront", 151039365);
        setIntField(term122207, term122207.getClass(), "avatarBack", 1350462882);
        term122282 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term122282;
        callMethod(klass, "equals", argTypes, term122207, args);
    }

};


