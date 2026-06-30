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

public class ProfileResp_setFirstPlayDate_148221725254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120833;
     Object term120908;

    public ProfileResp_setFirstPlayDate_148221725254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120833 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term120876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120881 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120891 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term120833, term120833.getClass(), "userName", "ckzmrYUHZc");
        setIntField(term120833, term120833.getClass(), "level", -1925496083);
        setField(term120833, term120833.getClass(), "exp", "aTmYFKjOly");
        setLongField(term120833, term120833.getClass(), "point", -5390664323916679150L);
        setLongField(term120833, term120833.getClass(), "totalPoint", 2199487095678847563L);
        setIntField(term120833, term120833.getClass(), "playCount", -758817058);
        setIntField(term120833, term120833.getClass(), "playerRating", -921953093);
        setIntField(term120833, term120833.getClass(), "highestRating", -1227278386);
        setIntField(term120833, term120833.getClass(), "nameplateId", -874736684);
        setIntField(term120833, term120833.getClass(), "frameId", -1741567743);
        setIntField(term120833, term120833.getClass(), "characterId", -1885456349);
        setIntField(term120833, term120833.getClass(), "trophyId", 1037396272);
        setIntField(term120833, term120833.getClass(), "totalMapNum", 1121809893);
        setLongField(term120833, term120833.getClass(), "totalHiScore", 1844082564287253862L);
        setLongField(term120833, term120833.getClass(), "totalBasicHighScore", -7135318849262922193L);
        setLongField(term120833, term120833.getClass(), "totalAdvancedHighScore", 649959317544851831L);
        setLongField(term120833, term120833.getClass(), "totalExpertHighScore", 6097677615781763525L);
        setLongField(term120833, term120833.getClass(), "totalMasterHighScore", 2423688892717992709L);
        setLongField(term120833, term120833.getClass(), "totalUltimaHighScore", 1193463649264461476L);
        setIntField(term120833, term120833.getClass(), "friendCount", -128295941);
        setIntField(term120877, term120877.getClass(), "year", 2012);
        setShortField(term120877, term120877.getClass(), "month", (short) 8);
        setShortField(term120877, term120877.getClass(), "day", (short) 18);
        setField(term120876, term120876.getClass(), "date", term120877);
        setByteField(term120881, term120881.getClass(), "hour", (byte) 2);
        setByteField(term120881, term120881.getClass(), "minute", (byte) 48);
        setByteField(term120881, term120881.getClass(), "second", (byte) 50);
        setIntField(term120881, term120881.getClass(), "nano", 222256928);
        setField(term120876, term120876.getClass(), "time", term120881);
        setField(term120833, term120833.getClass(), "firstPlayDate", term120876);
        setIntField(term120887, term120887.getClass(), "year", 2026);
        setShortField(term120887, term120887.getClass(), "month", (short) 7);
        setShortField(term120887, term120887.getClass(), "day", (short) 16);
        setField(term120886, term120886.getClass(), "date", term120887);
        setByteField(term120891, term120891.getClass(), "hour", (byte) 8);
        setByteField(term120891, term120891.getClass(), "minute", (byte) 30);
        setByteField(term120891, term120891.getClass(), "second", (byte) 44);
        setIntField(term120891, term120891.getClass(), "nano", 674163707);
        setField(term120886, term120886.getClass(), "time", term120891);
        setField(term120833, term120833.getClass(), "lastPlayDate", term120886);
        setIntField(term120833, term120833.getClass(), "courseClass", 409060681);
        setIntField(term120833, term120833.getClass(), "overPowerPoint", 2018873193);
        setIntField(term120833, term120833.getClass(), "overPowerRate", 1877567984);
        setIntField(term120833, term120833.getClass(), "mapIconId", -1779868694);
        setIntField(term120833, term120833.getClass(), "voiceId", -1733154460);
        setIntField(term120833, term120833.getClass(), "avatarWear", -487697087);
        setIntField(term120833, term120833.getClass(), "avatarHead", -409433417);
        setIntField(term120833, term120833.getClass(), "avatarFace", -2041174784);
        setIntField(term120833, term120833.getClass(), "avatarSkin", -1355714835);
        setIntField(term120833, term120833.getClass(), "avatarItem", -283378819);
        setIntField(term120833, term120833.getClass(), "avatarFront", -639012638);
        setIntField(term120833, term120833.getClass(), "avatarBack", -108498331);
        term120908 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120909 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120913 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term120909, term120909.getClass(), "year", 2010);
        setShortField(term120909, term120909.getClass(), "month", (short) 3);
        setShortField(term120909, term120909.getClass(), "day", (short) 7);
        setField(term120908, term120908.getClass(), "date", term120909);
        setByteField(term120913, term120913.getClass(), "hour", (byte) 22);
        setByteField(term120913, term120913.getClass(), "minute", (byte) 16);
        setByteField(term120913, term120913.getClass(), "second", (byte) 51);
        setIntField(term120913, term120913.getClass(), "nano", 701911179);
        setField(term120908, term120908.getClass(), "time", term120913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term120908;
        callMethod(klass, "setFirstPlayDate", argTypes, term120833, args);
    }

};


